package com.join.mgps.customview;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.BaseInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.join.mgps.Util.z0;
import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes4.dex */
public class CubeRotateView extends FrameLayout {

    /* renamed from: m  reason: collision with root package name */
    private static final int f46762m = 90;

    /* renamed from: b  reason: collision with root package name */
    private Camera f46763b;

    /* renamed from: c  reason: collision with root package name */
    private Matrix f46764c;

    /* renamed from: d  reason: collision with root package name */
    private BaseInterpolator f46765d;

    /* renamed from: e  reason: collision with root package name */
    private long f46766e;

    /* renamed from: f  reason: collision with root package name */
    private long f46767f;

    /* renamed from: g  reason: collision with root package name */
    private Timer f46768g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f46769h;

    /* renamed from: i  reason: collision with root package name */
    private float f46770i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f46771j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f46772k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f46773l;

    /* loaded from: classes4.dex */
    class a extends TimerTask {

        /* renamed from: com.join.mgps.customview.CubeRotateView$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        class RunnableC0352a implements Runnable {
            RunnableC0352a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                CubeRotateView.this.g();
            }
        }

        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            z0.a().post(new RunnableC0352a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            CubeRotateView.this.f46770i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements Animator.AnimatorListener {
        c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            CubeRotateView.this.f46772k = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            CubeRotateView.this.f46772k = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public CubeRotateView(Context context) {
        super(context);
        this.f46765d = new AccelerateDecelerateInterpolator();
        this.f46766e = 3000L;
        this.f46769h = true;
        this.f46770i = 1.0f;
        this.f46771j = false;
        this.f46772k = false;
        this.f46773l = true;
    }

    private void c(Canvas canvas, double d5) {
        View childAt = this.f46771j ? getChildAt(0) : getChildAt(1);
        View childAt2 = this.f46771j ? getChildAt(1) : getChildAt(0);
        int width = getWidth();
        int height = getHeight();
        long drawingTime = getDrawingTime();
        this.f46763b.save();
        Camera camera = this.f46763b;
        double d6 = width;
        Double.isNaN(d6);
        Double.isNaN(d6);
        camera.translate((float) (d6 - (d5 * d6)), 0.0f, 0.0f);
        this.f46763b.rotateY((float) ((-90.0d) * d5));
        this.f46763b.getMatrix(this.f46764c);
        this.f46763b.restore();
        int i4 = -width;
        float f5 = (-height) / 2;
        this.f46764c.preTranslate(i4, f5);
        float f6 = height / 2;
        this.f46764c.postTranslate(0.0f, f6);
        canvas.save();
        canvas.concat(this.f46764c);
        drawChild(canvas, childAt, drawingTime);
        canvas.restore();
        this.f46763b.save();
        Camera camera2 = this.f46763b;
        double d7 = i4;
        Double.isNaN(d7);
        camera2.translate((float) (d7 * d5), 0.0f, 0.0f);
        this.f46763b.rotateY((float) (90.0d - (d5 * 90.0d)));
        this.f46763b.getMatrix(this.f46764c);
        this.f46763b.restore();
        this.f46764c.postTranslate(width, f6);
        this.f46764c.preTranslate(0.0f, f5);
        canvas.save();
        canvas.concat(this.f46764c);
        drawChild(canvas, childAt2, drawingTime);
        canvas.restore();
    }

    private void d(Canvas canvas, double d5) {
        View childAt = this.f46771j ? getChildAt(0) : getChildAt(1);
        View childAt2 = this.f46771j ? getChildAt(1) : getChildAt(0);
        int width = getWidth();
        int height = getHeight();
        long drawingTime = getDrawingTime();
        double d6 = 90.0d * d5;
        this.f46763b.save();
        Camera camera = this.f46763b;
        double d7 = height;
        Double.isNaN(d7);
        double d8 = d7 * d5;
        camera.translate(0.0f, (float) d8, 0.0f);
        this.f46763b.rotateX((((float) d6) * 2.0f) / 3.0f);
        this.f46763b.getMatrix(this.f46764c);
        this.f46763b.restore();
        float f5 = (-width) / 2;
        int i4 = -height;
        this.f46764c.preTranslate(f5, i4);
        float f6 = width / 2;
        this.f46764c.postTranslate(f6, height);
        canvas.save();
        canvas.concat(this.f46764c);
        drawChild(canvas, childAt, drawingTime);
        canvas.restore();
        float f7 = (float) (d6 - 90.0d);
        this.f46763b.save();
        Camera camera2 = this.f46763b;
        double d9 = i4;
        Double.isNaN(d9);
        camera2.translate(0.0f, (float) (d9 + d8), 0.0f);
        this.f46763b.rotateX((f7 * 2.0f) / 3.0f);
        this.f46763b.getMatrix(this.f46764c);
        this.f46763b.restore();
        this.f46764c.postTranslate(f6, 0.0f);
        this.f46764c.preTranslate(f5, 0.0f);
        canvas.save();
        canvas.concat(this.f46764c);
        drawChild(canvas, childAt2, drawingTime);
        canvas.restore();
    }

    private void e(Canvas canvas, int i4, long j4, float f5) {
        int i5;
        int height = getHeight();
        int i6 = i4 * height;
        int scrollY = getScrollY();
        if (i6 > scrollY + height || (i5 = height + i6) < scrollY) {
            return;
        }
        View childAt = getChildAt(i4);
        float scrollY2 = (getScrollY() * (f5 / getMeasuredHeight())) - (i4 * f5);
        if (scrollY2 > 90.0f || scrollY2 < -90.0f) {
            return;
        }
        float f6 = i6 < scrollY ? i5 : i6;
        float width = getWidth() / 2;
        Camera camera = this.f46763b;
        Matrix matrix = this.f46764c;
        canvas.save();
        camera.save();
        camera.translate(0.0f, -getHeight(), 0.0f);
        camera.rotateX(-f5);
        camera.getMatrix(matrix);
        camera.restore();
        matrix.preTranslate(-width, -f6);
        matrix.postTranslate(width, f6);
        canvas.concat(matrix);
        drawChild(canvas, childAt, j4);
        canvas.restore();
    }

    private void f() {
        this.f46763b = new Camera();
        this.f46764c = new Matrix();
        this.f46767f = System.currentTimeMillis();
        this.f46768g = new Timer();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (this.f46769h) {
            d(canvas, this.f46770i);
            ViewCompat.postInvalidateOnAnimation(this);
            return;
        }
        super.dispatchDraw(canvas);
    }

    public void g() {
        if (this.f46772k) {
            return;
        }
        this.f46772k = true;
        invalidate();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(700L);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addUpdateListener(new b());
        ofFloat.addListener(new c());
        this.f46771j = true ^ this.f46771j;
        ofFloat.start();
    }

    public void setTimeAnim() {
        if (this.f46773l) {
            this.f46773l = false;
            this.f46768g.schedule(new a(), 5000L, 5000L);
        }
    }

    public CubeRotateView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46765d = new AccelerateDecelerateInterpolator();
        this.f46766e = 3000L;
        this.f46769h = true;
        this.f46770i = 1.0f;
        this.f46771j = false;
        this.f46772k = false;
        this.f46773l = true;
        f();
    }

    public CubeRotateView(Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f46765d = new AccelerateDecelerateInterpolator();
        this.f46766e = 3000L;
        this.f46769h = true;
        this.f46770i = 1.0f;
        this.f46771j = false;
        this.f46772k = false;
        this.f46773l = true;
        f();
    }
}
