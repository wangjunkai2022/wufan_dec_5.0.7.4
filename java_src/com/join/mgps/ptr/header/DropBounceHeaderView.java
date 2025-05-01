package com.join.mgps.ptr.header;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.AnimationDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import androidx.core.view.ViewCompat;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.w0;
import com.join.mgps.ptr.PtrFrameLayout;
import com.join.mgps.ptr.PtrUIHeader;
@TargetApi(11)
/* loaded from: classes4.dex */
public class DropBounceHeaderView extends PtrUIHeader {

    /* renamed from: b  reason: collision with root package name */
    private final String f53712b;

    /* renamed from: c  reason: collision with root package name */
    private PtrFrameLayout f53713c;

    /* renamed from: d  reason: collision with root package name */
    private com.join.mgps.ptr.indicator.b f53714d;

    /* renamed from: e  reason: collision with root package name */
    private AnimationDrawable f53715e;

    /* renamed from: f  reason: collision with root package name */
    private Path f53716f;

    /* renamed from: g  reason: collision with root package name */
    private Paint f53717g;

    /* renamed from: h  reason: collision with root package name */
    float f53718h;

    /* renamed from: i  reason: collision with root package name */
    float f53719i;

    /* renamed from: j  reason: collision with root package name */
    private float f53720j;

    /* renamed from: k  reason: collision with root package name */
    private RectF f53721k;

    /* renamed from: l  reason: collision with root package name */
    private int f53722l;

    /* renamed from: m  reason: collision with root package name */
    private int f53723m;

    /* renamed from: n  reason: collision with root package name */
    private int f53724n;

    /* renamed from: o  reason: collision with root package name */
    private int f53725o;

    /* renamed from: p  reason: collision with root package name */
    private float f53726p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f53727q;

    /* renamed from: r  reason: collision with root package name */
    private ValueAnimator f53728r;

    /* renamed from: s  reason: collision with root package name */
    private ValueAnimator f53729s;

    /* renamed from: t  reason: collision with root package name */
    private ValueAnimator f53730t;

    /* renamed from: u  reason: collision with root package name */
    private ValueAnimator f53731u;

    /* renamed from: v  reason: collision with root package name */
    private ValueAnimator.AnimatorUpdateListener f53732v;

    /* loaded from: classes4.dex */
    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            DropBounceHeaderView.this.postInvalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements Animator.AnimatorListener {
        b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            DropBounceHeaderView.this.q();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            DropBounceHeaderView.this.f53726p = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ViewCompat.postInvalidateOnAnimation(DropBounceHeaderView.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            DropBounceHeaderView.this.f53726p = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ViewCompat.postInvalidateOnAnimation(DropBounceHeaderView.this);
        }
    }

    public DropBounceHeaderView(Context context) {
        super(context);
        this.f53712b = "DropBounceHeaderView";
        this.f53718h = 1.0f;
        this.f53719i = 0.8f;
        this.f53720j = 100.0f;
        this.f53724n = -1;
        this.f53725o = 0;
        this.f53727q = false;
        this.f53732v = new a();
        i();
    }

    private void h(ValueAnimator valueAnimator) {
        if (valueAnimator == null || valueAnimator.getListeners() == null) {
            return;
        }
        valueAnimator.getListeners().clear();
    }

    private void i() {
        Resources resources = getResources();
        this.f53721k = new RectF();
        AnimationDrawable animationDrawable = (AnimationDrawable) resources.getDrawable(R.drawable.loading_animation1);
        this.f53715e = animationDrawable;
        setBackgroundDrawable(animationDrawable);
        this.f53720j = (this.f53715e.getIntrinsicHeight() * this.f53719i) / 2.0f;
        if (Build.VERSION.SDK_INT >= 11) {
            setLayerType(1, null);
        }
        m();
        n();
        k();
    }

    private void j() {
    }

    private void k() {
        h(this.f53729s);
        h(this.f53728r);
        h(this.f53730t);
        h(this.f53731u);
        this.f53728r = ValueAnimator.ofFloat(0.0f, 0.0f);
        this.f53729s = ValueAnimator.ofFloat(0.0f, 0.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 0.0f);
        this.f53730t = ofFloat;
        ofFloat.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 0.0f);
        this.f53731u = ofFloat2;
        ofFloat2.setDuration(1L);
        this.f53731u.start();
    }

    private void l() {
    }

    private void m() {
        Paint paint = new Paint();
        this.f53717g = paint;
        paint.setTextSize(22.0f);
        this.f53717g.setColor(this.f53724n);
        this.f53717g.setAntiAlias(true);
        this.f53717g.setStyle(Paint.Style.FILL);
    }

    private void n() {
        this.f53716f = new Path();
    }

    private void o() {
        this.f53725o = 1;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 0.5f);
        this.f53728r = ofFloat;
        ofFloat.setDuration(500L);
        this.f53728r.addUpdateListener(this.f53732v);
        this.f53728r.setInterpolator(new DropBounceInterpolator());
        this.f53728r.setStartDelay(180L);
        this.f53728r.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 0.1f);
        this.f53729s = ofFloat2;
        ofFloat2.setDuration(500L);
        this.f53729s.addUpdateListener(this.f53732v);
        this.f53729s.setInterpolator(new DropBounceInterpolator());
        ValueAnimator valueAnimator = this.f53729s;
        double d5 = 180L;
        double d6 = 500L;
        Double.isNaN(d6);
        Double.isNaN(d5);
        valueAnimator.setStartDelay((long) (d5 + (d6 * 0.25d)));
        this.f53729s.start();
    }

    private void p() {
        j();
        this.f53727q = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) this.f53731u.getAnimatedValue()).floatValue(), 0.33333334f);
        this.f53731u = ofFloat;
        ofFloat.setDuration(200L);
        this.f53731u.setInterpolator(new AccelerateInterpolator());
        this.f53731u.addListener(new b());
        this.f53731u.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(((Float) this.f53729s.getAnimatedValue()).floatValue(), 0.0f);
        this.f53729s = ofFloat2;
        ofFloat2.setDuration(200L);
        this.f53729s.setInterpolator(new AccelerateInterpolator());
        this.f53729s.start();
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(((Float) this.f53730t.getAnimatedValue()).floatValue(), (getHeight() - ((this.f53720j * 1.0f) / 3.0f)) - (TypedValue.applyDimension(1, this.f53718h, getResources().getDisplayMetrics()) / this.f53719i));
        this.f53730t = ofFloat3;
        ofFloat3.setDuration(200L);
        this.f53730t.addUpdateListener(new c());
        this.f53730t.setInterpolator(new AccelerateInterpolator());
        this.f53730t.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        if (!this.f53715e.isRunning()) {
            this.f53715e.start();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.33333334f, 1.0f);
        this.f53731u = ofFloat;
        ofFloat.setDuration(200L);
        this.f53731u.setInterpolator(new AccelerateInterpolator());
        this.f53731u.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(((Float) this.f53730t.getAnimatedValue()).floatValue(), (getHeight() - this.f53720j) - (TypedValue.applyDimension(1, this.f53718h, getResources().getDisplayMetrics()) / this.f53719i));
        this.f53730t = ofFloat2;
        ofFloat2.setDuration(200L);
        this.f53730t.addUpdateListener(new d());
        this.f53730t.setInterpolator(new AccelerateInterpolator());
        this.f53730t.start();
        o();
    }

    @Override // com.join.mgps.ptr.PtrUIHeader, com.join.mgps.ptr.c
    public void a(PtrFrameLayout ptrFrameLayout) {
        w0.e("DropBounceHeaderView", "onUIRefreshComplete method called.");
    }

    @Override // com.join.mgps.ptr.PtrUIHeader, com.join.mgps.ptr.c
    public void b(PtrFrameLayout ptrFrameLayout, boolean z4, byte b5, com.join.mgps.ptr.indicator.a aVar) {
        float height;
        w0.e("DropBounceHeaderView", "onUIPositionChange method called.");
        if (this.f53727q) {
            return;
        }
        float N = this.f53714d.N();
        float d5 = this.f53714d.d();
        ((Float) this.f53730t.getAnimatedValue()).floatValue();
        ((Float) this.f53731u.getAnimatedValue()).floatValue();
        ((Float) this.f53729s.getAnimatedValue()).floatValue();
        float f5 = 0.0f;
        if (N > 0.0f && N < 0.33333334f) {
            height = getHeight() - (d5 / 2.0f);
            this.f53725o = 0;
        } else if (N < 0.6666667f) {
            f5 = (N - 0.33333334f) * 2.0f;
            this.f53725o = 0;
            height = getHeight() - (d5 / 2.0f);
        } else if (N < 1.0f) {
            float f6 = (N * 2.0f) - 0.6666667f;
            f5 = (f6 - 0.33333334f) * 2.0f;
            this.f53725o = 0;
            height = getHeight() - (((d5 * 1.0f) / 3.0f) / N);
            N = f6;
        } else {
            p();
            return;
        }
        this.f53731u = ValueAnimator.ofFloat(N, N);
        this.f53730t = ValueAnimator.ofFloat(height, height);
        this.f53729s = ValueAnimator.ofFloat(f5, f5);
        this.f53731u.start();
        this.f53730t.start();
        this.f53728r.start();
        this.f53729s.start();
        invalidate();
    }

    @Override // com.join.mgps.ptr.PtrUIHeader, com.join.mgps.ptr.c
    public void c(PtrFrameLayout ptrFrameLayout) {
        w0.e("DropBounceHeaderView", "onUIReset method called.");
        k();
        this.f53727q = false;
        if (this.f53715e.isRunning()) {
            this.f53715e.stop();
        }
        invalidate();
    }

    @Override // com.join.mgps.ptr.PtrUIHeader, com.join.mgps.ptr.c
    public void d(PtrFrameLayout ptrFrameLayout) {
        w0.e("DropBounceHeaderView", "onUIRefreshPrepare method called.");
    }

    @Override // com.join.mgps.ptr.PtrUIHeader, com.join.mgps.ptr.c
    public void e(PtrFrameLayout ptrFrameLayout) {
        w0.e("DropBounceHeaderView", "onUIRefreshBegin method called.");
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.f53731u;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f53731u.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator2 = this.f53730t;
        if (valueAnimator2 != null) {
            valueAnimator2.end();
            this.f53730t.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator3 = this.f53729s;
        if (valueAnimator3 != null) {
            valueAnimator3.end();
            this.f53729s.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator4 = this.f53728r;
        if (valueAnimator4 != null) {
            valueAnimator4.end();
            this.f53728r.removeAllUpdateListeners();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        this.f53716f.reset();
        this.f53721k.setEmpty();
        float floatValue = ((Float) this.f53730t.getAnimatedValue()).floatValue();
        this.f53726p = floatValue;
        float f5 = this.f53723m / 2.0f;
        float floatValue2 = ((Float) this.f53731u.getAnimatedValue()).floatValue();
        float floatValue3 = ((Float) this.f53728r.getAnimatedValue()).floatValue();
        float floatValue4 = ((Float) this.f53729s.getAnimatedValue()).floatValue();
        float f6 = this.f53725o;
        float f7 = this.f53720j;
        float f8 = (floatValue3 * f6) + 1.0f;
        float f9 = (f5 - ((f7 * f8) * floatValue2)) + ((f7 * floatValue4) / 2.0f);
        float f10 = (f6 * floatValue4) + 1.0f;
        float f11 = (floatValue - ((f10 * f7) * floatValue2)) + ((f7 * floatValue3) / 2.0f);
        float applyDimension = TypedValue.applyDimension(1, this.f53718h, getResources().getDisplayMetrics());
        float f12 = applyDimension / 2.0f;
        float f13 = f9 + f12;
        float f14 = ((((f7 * f10) * floatValue2) + floatValue) - ((f7 * floatValue3) / 2.0f)) + applyDimension;
        float f15 = ((f5 + ((f8 * f7) * floatValue2)) - ((floatValue4 * f7) / 2.0f)) - f12;
        this.f53721k.set(f13, f14, f15, f11);
        this.f53716f.addOval(this.f53721k, Path.Direction.CCW);
        canvas.drawPath(this.f53716f, this.f53717g);
        if (this.f53715e.isRunning()) {
            float applyDimension2 = TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
            this.f53715e.setBounds((int) (f13 + applyDimension2), (int) (f11 + applyDimension2), (int) (f15 - applyDimension2), (int) (f14 - applyDimension2));
            this.f53715e.getCurrent().draw(canvas);
        } else {
            this.f53715e.setBounds(0, 0, 0, 0);
        }
        if (!this.f53729s.isRunning() && !this.f53728r.isRunning() && !this.f53731u.isRunning() && !this.f53730t.isRunning()) {
            l();
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(((int) (this.f53715e.getIntrinsicHeight() * this.f53719i)) + getPaddingTop() + getPaddingBottom(), 1073741824));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        this.f53723m = i4;
        super.onSizeChanged(i4, i5, i6, i7);
    }

    public void setColor(int i4) {
        this.f53724n = i4;
        this.f53717g.setColor(i4);
        invalidate();
    }

    public void setUp(PtrFrameLayout ptrFrameLayout) {
        this.f53713c = ptrFrameLayout;
        com.join.mgps.ptr.indicator.b bVar = new com.join.mgps.ptr.indicator.b();
        this.f53714d = bVar;
        this.f53713c.setPtrIndicator(bVar);
    }

    public DropBounceHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53712b = "DropBounceHeaderView";
        this.f53718h = 1.0f;
        this.f53719i = 0.8f;
        this.f53720j = 100.0f;
        this.f53724n = -1;
        this.f53725o = 0;
        this.f53727q = false;
        this.f53732v = new a();
        i();
    }

    public DropBounceHeaderView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f53712b = "DropBounceHeaderView";
        this.f53718h = 1.0f;
        this.f53719i = 0.8f;
        this.f53720j = 100.0f;
        this.f53724n = -1;
        this.f53725o = 0;
        this.f53727q = false;
        this.f53732v = new a();
        i();
    }
}
