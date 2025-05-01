package me.relex.photodraweeview;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.core.view.MotionEventCompat;
/* compiled from: ScaleDragDetector.java */
/* loaded from: classes7.dex */
public class i implements ScaleGestureDetector.OnScaleGestureListener {

    /* renamed from: l  reason: collision with root package name */
    private static final int f71605l = -1;

    /* renamed from: b  reason: collision with root package name */
    private final float f71606b;

    /* renamed from: c  reason: collision with root package name */
    private final float f71607c;

    /* renamed from: d  reason: collision with root package name */
    private final ScaleGestureDetector f71608d;

    /* renamed from: e  reason: collision with root package name */
    private final g f71609e;

    /* renamed from: f  reason: collision with root package name */
    private VelocityTracker f71610f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f71611g;

    /* renamed from: h  reason: collision with root package name */
    float f71612h;

    /* renamed from: i  reason: collision with root package name */
    float f71613i;

    /* renamed from: j  reason: collision with root package name */
    private int f71614j = -1;

    /* renamed from: k  reason: collision with root package name */
    private int f71615k = 0;

    public i(Context context, g gVar) {
        this.f71608d = new ScaleGestureDetector(context, this);
        this.f71609e = gVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f71607c = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f71606b = viewConfiguration.getScaledTouchSlop();
    }

    private float a(MotionEvent motionEvent) {
        try {
            return MotionEventCompat.getX(motionEvent, this.f71615k);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    private float b(MotionEvent motionEvent) {
        try {
            return MotionEventCompat.getY(motionEvent, this.f71615k);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    private void e(int i4, MotionEvent motionEvent) {
        if (i4 != 0) {
            if (i4 == 1 || i4 == 3) {
                this.f71614j = -1;
            } else if (i4 == 6) {
                int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                if (MotionEventCompat.getPointerId(motionEvent, actionIndex) == this.f71614j) {
                    int i5 = actionIndex != 0 ? 0 : 1;
                    this.f71614j = MotionEventCompat.getPointerId(motionEvent, i5);
                    this.f71612h = MotionEventCompat.getX(motionEvent, i5);
                    this.f71613i = MotionEventCompat.getY(motionEvent, i5);
                }
            }
        } else {
            this.f71614j = motionEvent.getPointerId(0);
        }
        int i6 = this.f71614j;
        this.f71615k = MotionEventCompat.findPointerIndex(motionEvent, i6 != -1 ? i6 : 0);
    }

    private void f(int i4, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (i4 == 0) {
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f71610f = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            this.f71612h = a(motionEvent);
            this.f71613i = b(motionEvent);
            this.f71611g = false;
        } else if (i4 == 1) {
            if (this.f71611g && this.f71610f != null) {
                this.f71612h = a(motionEvent);
                this.f71613i = b(motionEvent);
                this.f71610f.addMovement(motionEvent);
                this.f71610f.computeCurrentVelocity(1000);
                float xVelocity = this.f71610f.getXVelocity();
                float yVelocity = this.f71610f.getYVelocity();
                if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f71607c) {
                    this.f71609e.d(this.f71612h, this.f71613i, -xVelocity, -yVelocity);
                }
            }
            VelocityTracker velocityTracker2 = this.f71610f;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f71610f = null;
            }
        } else if (i4 != 2) {
            if (i4 == 3 && (velocityTracker = this.f71610f) != null) {
                velocityTracker.recycle();
                this.f71610f = null;
            }
        } else {
            float a5 = a(motionEvent);
            float b5 = b(motionEvent);
            float f5 = a5 - this.f71612h;
            float f6 = b5 - this.f71613i;
            if (!this.f71611g) {
                this.f71611g = Math.sqrt((double) ((f5 * f5) + (f6 * f6))) >= ((double) this.f71606b);
            }
            if (this.f71611g) {
                this.f71609e.a(f5, f6);
                this.f71612h = a5;
                this.f71613i = b5;
                VelocityTracker velocityTracker3 = this.f71610f;
                if (velocityTracker3 != null) {
                    velocityTracker3.addMovement(motionEvent);
                }
            }
        }
    }

    public boolean c() {
        return this.f71611g;
    }

    public boolean d() {
        return this.f71608d.isInProgress();
    }

    public boolean g(MotionEvent motionEvent) {
        this.f71608d.onTouchEvent(motionEvent);
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        e(actionMasked, motionEvent);
        f(actionMasked, motionEvent);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
            return false;
        }
        this.f71609e.c(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.f71609e.b();
    }
}
