package me.relex.photodraweeview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.annotation.Nullable;
import androidx.core.view.GestureDetectorCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.widget.ScrollerCompat;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.view.DraweeView;
import java.lang.ref.WeakReference;
/* compiled from: Attacher.java */
/* loaded from: classes7.dex */
public class a implements d, View.OnTouchListener, g {

    /* renamed from: w  reason: collision with root package name */
    private static final int f71558w = -1;

    /* renamed from: x  reason: collision with root package name */
    private static final int f71559x = 0;

    /* renamed from: y  reason: collision with root package name */
    private static final int f71560y = 1;

    /* renamed from: z  reason: collision with root package name */
    private static final int f71561z = 2;

    /* renamed from: i  reason: collision with root package name */
    private i f71569i;

    /* renamed from: j  reason: collision with root package name */
    private GestureDetectorCompat f71570j;

    /* renamed from: q  reason: collision with root package name */
    private c f71577q;

    /* renamed from: r  reason: collision with root package name */
    private WeakReference<DraweeView<com.facebook.drawee.generic.a>> f71578r;

    /* renamed from: s  reason: collision with root package name */
    private e f71579s;

    /* renamed from: t  reason: collision with root package name */
    private h f71580t;

    /* renamed from: u  reason: collision with root package name */
    private View.OnLongClickListener f71581u;

    /* renamed from: v  reason: collision with root package name */
    private f f71582v;

    /* renamed from: b  reason: collision with root package name */
    private final float[] f71562b = new float[9];

    /* renamed from: c  reason: collision with root package name */
    private final RectF f71563c = new RectF();

    /* renamed from: d  reason: collision with root package name */
    private final Interpolator f71564d = new AccelerateDecelerateInterpolator();

    /* renamed from: e  reason: collision with root package name */
    private float f71565e = 1.0f;

    /* renamed from: f  reason: collision with root package name */
    private float f71566f = 1.75f;

    /* renamed from: g  reason: collision with root package name */
    private float f71567g = 3.0f;

    /* renamed from: h  reason: collision with root package name */
    private long f71568h = 200;

    /* renamed from: k  reason: collision with root package name */
    private boolean f71571k = false;

    /* renamed from: l  reason: collision with root package name */
    private boolean f71572l = true;

    /* renamed from: m  reason: collision with root package name */
    private int f71573m = 2;

    /* renamed from: n  reason: collision with root package name */
    private final Matrix f71574n = new Matrix();

    /* renamed from: o  reason: collision with root package name */
    private int f71575o = -1;

    /* renamed from: p  reason: collision with root package name */
    private int f71576p = -1;

    /* compiled from: Attacher.java */
    /* renamed from: me.relex.photodraweeview.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    class C0786a extends GestureDetector.SimpleOnGestureListener {
        C0786a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            super.onLongPress(motionEvent);
            if (a.this.f71581u != null) {
                a.this.f71581u.onLongClick(a.this.r());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Attacher.java */
    /* loaded from: classes7.dex */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final float f71584b;

        /* renamed from: c  reason: collision with root package name */
        private final float f71585c;

        /* renamed from: d  reason: collision with root package name */
        private final long f71586d = System.currentTimeMillis();

        /* renamed from: e  reason: collision with root package name */
        private final float f71587e;

        /* renamed from: f  reason: collision with root package name */
        private final float f71588f;

        public b(float f5, float f6, float f7, float f8) {
            this.f71584b = f7;
            this.f71585c = f8;
            this.f71587e = f5;
            this.f71588f = f6;
        }

        private float a() {
            return a.this.f71564d.getInterpolation(Math.min(1.0f, (((float) (System.currentTimeMillis() - this.f71586d)) * 1.0f) / ((float) a.this.f71568h)));
        }

        @Override // java.lang.Runnable
        public void run() {
            DraweeView<com.facebook.drawee.generic.a> r4 = a.this.r();
            if (r4 == null) {
                return;
            }
            float a5 = a();
            float f5 = this.f71587e;
            a.this.c((f5 + ((this.f71588f - f5) * a5)) / a.this.getScale(), this.f71584b, this.f71585c);
            if (a5 < 1.0f) {
                a.this.w(r4, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Attacher.java */
    /* loaded from: classes7.dex */
    public class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final ScrollerCompat f71590b;

        /* renamed from: c  reason: collision with root package name */
        private int f71591c;

        /* renamed from: d  reason: collision with root package name */
        private int f71592d;

        public c(Context context) {
            this.f71590b = ScrollerCompat.create(context);
        }

        public void a() {
            this.f71590b.abortAnimation();
        }

        public void b(int i4, int i5, int i6, int i7) {
            int i8;
            int i9;
            int i10;
            int i11;
            RectF o4 = a.this.o();
            if (o4 == null) {
                return;
            }
            int round = Math.round(-o4.left);
            float f5 = i4;
            if (f5 < o4.width()) {
                i9 = Math.round(o4.width() - f5);
                i8 = 0;
            } else {
                i8 = round;
                i9 = i8;
            }
            int round2 = Math.round(-o4.top);
            float f6 = i5;
            if (f6 < o4.height()) {
                i11 = Math.round(o4.height() - f6);
                i10 = 0;
            } else {
                i10 = round2;
                i11 = i10;
            }
            this.f71591c = round;
            this.f71592d = round2;
            if (round == i9 && round2 == i11) {
                return;
            }
            this.f71590b.fling(round, round2, i6, i7, i8, i9, i10, i11, 0, 0);
        }

        @Override // java.lang.Runnable
        public void run() {
            DraweeView<com.facebook.drawee.generic.a> r4;
            if (this.f71590b.isFinished() || (r4 = a.this.r()) == null || !this.f71590b.computeScrollOffset()) {
                return;
            }
            int currX = this.f71590b.getCurrX();
            int currY = this.f71590b.getCurrY();
            a.this.f71574n.postTranslate(this.f71591c - currX, this.f71592d - currY);
            r4.invalidate();
            this.f71591c = currX;
            this.f71592d = currY;
            a.this.w(r4, this);
        }
    }

    public a(DraweeView<com.facebook.drawee.generic.a> draweeView) {
        this.f71578r = new WeakReference<>(draweeView);
        draweeView.getHierarchy().x(r.c.f11296c);
        draweeView.setOnTouchListener(this);
        this.f71569i = new i(draweeView.getContext(), this);
        GestureDetectorCompat gestureDetectorCompat = new GestureDetectorCompat(draweeView.getContext(), new C0786a());
        this.f71570j = gestureDetectorCompat;
        gestureDetectorCompat.setOnDoubleTapListener(new me.relex.photodraweeview.c(this));
    }

    private void j() {
        c cVar = this.f71577q;
        if (cVar != null) {
            cVar.a();
            this.f71577q = null;
        }
    }

    private void m() {
        RectF o4;
        DraweeView<com.facebook.drawee.generic.a> r4 = r();
        if (r4 == null || getScale() >= this.f71565e || (o4 = o()) == null) {
            return;
        }
        r4.post(new b(getScale(), this.f71565e, o4.centerX(), o4.centerY()));
    }

    private static void n(float f5, float f6, float f7) {
        if (f5 >= f6) {
            throw new IllegalArgumentException("MinZoom has to be less than MidZoom");
        }
        if (f6 >= f7) {
            throw new IllegalArgumentException("MidZoom has to be less than MaxZoom");
        }
    }

    private RectF p(Matrix matrix) {
        DraweeView<com.facebook.drawee.generic.a> r4 = r();
        if (r4 != null) {
            int i4 = this.f71576p;
            if (i4 == -1 && this.f71575o == -1) {
                return null;
            }
            this.f71563c.set(0.0f, 0.0f, i4, this.f71575o);
            r4.getHierarchy().k(this.f71563c);
            matrix.mapRect(this.f71563c);
            return this.f71563c;
        }
        return null;
    }

    private float s(Matrix matrix, int i4) {
        matrix.getValues(this.f71562b);
        return this.f71562b[i4];
    }

    private int t() {
        DraweeView<com.facebook.drawee.generic.a> r4 = r();
        if (r4 != null) {
            return (r4.getHeight() - r4.getPaddingTop()) - r4.getPaddingBottom();
        }
        return 0;
    }

    private int u() {
        DraweeView<com.facebook.drawee.generic.a> r4 = r();
        if (r4 != null) {
            return (r4.getWidth() - r4.getPaddingLeft()) - r4.getPaddingRight();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, 16L);
        }
    }

    private void x() {
        this.f71574n.reset();
        l();
        DraweeView<com.facebook.drawee.generic.a> r4 = r();
        if (r4 != null) {
            r4.invalidate();
        }
    }

    private void y() {
        if (this.f71576p == -1 && this.f71575o == -1) {
            return;
        }
        x();
    }

    @Override // me.relex.photodraweeview.g
    public void a(float f5, float f6) {
        DraweeView<com.facebook.drawee.generic.a> r4 = r();
        if (r4 == null || this.f71569i.d()) {
            return;
        }
        this.f71574n.postTranslate(f5, f6);
        k();
        ViewParent parent = r4.getParent();
        if (parent == null) {
            return;
        }
        if (this.f71572l && !this.f71569i.d() && !this.f71571k) {
            int i4 = this.f71573m;
            if (i4 == 2 || ((i4 == 0 && f5 >= 1.0f) || (i4 == 1 && f5 <= -1.0f))) {
                parent.requestDisallowInterceptTouchEvent(false);
                return;
            }
            return;
        }
        parent.requestDisallowInterceptTouchEvent(true);
    }

    @Override // me.relex.photodraweeview.g
    public void b() {
        m();
    }

    @Override // me.relex.photodraweeview.g
    public void c(float f5, float f6, float f7) {
        if (getScale() < this.f71567g || f5 < 1.0f) {
            f fVar = this.f71582v;
            if (fVar != null) {
                fVar.a(f5, f6, f7);
            }
            this.f71574n.postScale(f5, f5, f6, f7);
            k();
        }
    }

    @Override // me.relex.photodraweeview.g
    public void d(float f5, float f6, float f7, float f8) {
        DraweeView<com.facebook.drawee.generic.a> r4 = r();
        if (r4 == null) {
            return;
        }
        c cVar = new c(r4.getContext());
        this.f71577q = cVar;
        cVar.b(u(), t(), (int) f7, (int) f8);
        r4.post(this.f71577q);
    }

    @Override // me.relex.photodraweeview.d
    public float getMaximumScale() {
        return this.f71567g;
    }

    @Override // me.relex.photodraweeview.d
    public float getMediumScale() {
        return this.f71566f;
    }

    @Override // me.relex.photodraweeview.d
    public float getMinimumScale() {
        return this.f71565e;
    }

    @Override // me.relex.photodraweeview.d
    public e getOnPhotoTapListener() {
        return this.f71579s;
    }

    @Override // me.relex.photodraweeview.d
    public h getOnViewTapListener() {
        return this.f71580t;
    }

    @Override // me.relex.photodraweeview.d
    public float getScale() {
        return (float) Math.sqrt(((float) Math.pow(s(this.f71574n, 0), 2.0d)) + ((float) Math.pow(s(this.f71574n, 3), 2.0d)));
    }

    public void k() {
        DraweeView<com.facebook.drawee.generic.a> r4 = r();
        if (r4 != null && l()) {
            r4.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean l() {
        /*
            r9 = this;
            android.graphics.Matrix r0 = r9.q()
            android.graphics.RectF r0 = r9.p(r0)
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            float r2 = r0.height()
            float r3 = r0.width()
            int r4 = r9.t()
            float r4 = (float) r4
            r5 = 1073741824(0x40000000, float:2.0)
            r6 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 > 0) goto L26
            float r4 = r4 - r2
            float r4 = r4 / r5
            float r2 = r0.top
        L24:
            float r4 = r4 - r2
            goto L36
        L26:
            float r2 = r0.top
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 <= 0) goto L2e
            float r4 = -r2
            goto L36
        L2e:
            float r2 = r0.bottom
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 >= 0) goto L35
            goto L24
        L35:
            r4 = 0
        L36:
            int r2 = r9.u()
            float r2 = (float) r2
            r7 = 1
            int r8 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r8 > 0) goto L4a
            float r2 = r2 - r3
            float r2 = r2 / r5
            float r0 = r0.left
            float r6 = r2 - r0
            r0 = 2
            r9.f71573m = r0
            goto L62
        L4a:
            float r3 = r0.left
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 <= 0) goto L54
            float r6 = -r3
            r9.f71573m = r1
            goto L62
        L54:
            float r0 = r0.right
            int r1 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r1 >= 0) goto L5f
            float r6 = r2 - r0
            r9.f71573m = r7
            goto L62
        L5f:
            r0 = -1
            r9.f71573m = r0
        L62:
            android.graphics.Matrix r0 = r9.f71574n
            r0.postTranslate(r6, r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: me.relex.photodraweeview.a.l():boolean");
    }

    public RectF o() {
        l();
        return p(q());
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        ViewParent parent;
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        boolean z4 = false;
        if (actionMasked == 0) {
            ViewParent parent2 = view.getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(true);
            }
            j();
        } else if ((actionMasked == 1 || actionMasked == 3) && (parent = view.getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        boolean d5 = this.f71569i.d();
        boolean c5 = this.f71569i.c();
        boolean g4 = this.f71569i.g(motionEvent);
        boolean z5 = (d5 || this.f71569i.d()) ? false : true;
        boolean z6 = (c5 || this.f71569i.c()) ? false : true;
        if (z5 && z6) {
            z4 = true;
        }
        this.f71571k = z4;
        if (this.f71570j.onTouchEvent(motionEvent)) {
            return true;
        }
        return g4;
    }

    public Matrix q() {
        return this.f71574n;
    }

    @Nullable
    public DraweeView<com.facebook.drawee.generic.a> r() {
        return this.f71578r.get();
    }

    @Override // me.relex.photodraweeview.d
    public void setAllowParentInterceptOnEdge(boolean z4) {
        this.f71572l = z4;
    }

    @Override // me.relex.photodraweeview.d
    public void setMaximumScale(float f5) {
        n(this.f71565e, this.f71566f, f5);
        this.f71567g = f5;
    }

    @Override // me.relex.photodraweeview.d
    public void setMediumScale(float f5) {
        n(this.f71565e, f5, this.f71567g);
        this.f71566f = f5;
    }

    @Override // me.relex.photodraweeview.d
    public void setMinimumScale(float f5) {
        n(f5, this.f71566f, this.f71567g);
        this.f71565e = f5;
    }

    @Override // me.relex.photodraweeview.d
    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        if (onDoubleTapListener != null) {
            this.f71570j.setOnDoubleTapListener(onDoubleTapListener);
        } else {
            this.f71570j.setOnDoubleTapListener(new me.relex.photodraweeview.c(this));
        }
    }

    @Override // me.relex.photodraweeview.d
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f71581u = onLongClickListener;
    }

    @Override // me.relex.photodraweeview.d
    public void setOnPhotoTapListener(e eVar) {
        this.f71579s = eVar;
    }

    @Override // me.relex.photodraweeview.d
    public void setOnScaleChangeListener(f fVar) {
        this.f71582v = fVar;
    }

    @Override // me.relex.photodraweeview.d
    public void setOnViewTapListener(h hVar) {
        this.f71580t = hVar;
    }

    @Override // me.relex.photodraweeview.d
    public void setScale(float f5) {
        setScale(f5, false);
    }

    @Override // me.relex.photodraweeview.d
    public void setZoomTransitionDuration(long j4) {
        if (j4 < 0) {
            j4 = 200;
        }
        this.f71568h = j4;
    }

    @Override // me.relex.photodraweeview.d
    public void update(int i4, int i5) {
        this.f71576p = i4;
        this.f71575o = i5;
        y();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void v() {
        j();
    }

    @Override // me.relex.photodraweeview.d
    public void setScale(float f5, boolean z4) {
        DraweeView<com.facebook.drawee.generic.a> r4 = r();
        if (r4 != null) {
            setScale(f5, r4.getRight() / 2, r4.getBottom() / 2, false);
        }
    }

    @Override // me.relex.photodraweeview.d
    public void setScale(float f5, float f6, float f7, boolean z4) {
        DraweeView<com.facebook.drawee.generic.a> r4 = r();
        if (r4 == null || f5 < this.f71565e || f5 > this.f71567g) {
            return;
        }
        if (z4) {
            r4.post(new b(getScale(), f5, f6, f7));
            return;
        }
        this.f71574n.setScale(f5, f5, f6, f7);
        k();
    }
}
