package com.join.mgps.customview.swiperefresh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.animation.Animation;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
/* loaded from: classes4.dex */
public class CircleImageView extends AppCompatImageView {

    /* renamed from: d  reason: collision with root package name */
    private static final int f48680d = 503316480;

    /* renamed from: e  reason: collision with root package name */
    private static final int f48681e = 1023410176;

    /* renamed from: f  reason: collision with root package name */
    private static final float f48682f = 0.0f;

    /* renamed from: g  reason: collision with root package name */
    private static final float f48683g = 1.75f;

    /* renamed from: h  reason: collision with root package name */
    private static final float f48684h = 3.5f;

    /* renamed from: i  reason: collision with root package name */
    private static final int f48685i = 4;

    /* renamed from: b  reason: collision with root package name */
    private Animation.AnimationListener f48686b;

    /* renamed from: c  reason: collision with root package name */
    int f48687c;

    /* loaded from: classes4.dex */
    private class a extends OvalShape {

        /* renamed from: b  reason: collision with root package name */
        private RadialGradient f48688b;

        /* renamed from: c  reason: collision with root package name */
        private Paint f48689c = new Paint();

        a(int i4) {
            CircleImageView.this.f48687c = i4;
            a((int) rect().width());
        }

        private void a(int i4) {
            float f5 = i4 / 2;
            RadialGradient radialGradient = new RadialGradient(f5, f5, CircleImageView.this.f48687c, new int[]{CircleImageView.f48681e, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f48688b = radialGradient;
            this.f48689c.setShader(radialGradient);
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            CircleImageView.this.getWidth();
            CircleImageView.this.getHeight();
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        protected void onResize(float f5, float f6) {
            super.onResize(f5, f6);
            a((int) f5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CircleImageView(Context context, int i4) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f5 = getContext().getResources().getDisplayMetrics().density;
        int i5 = (int) (1.75f * f5);
        int i6 = (int) (0.0f * f5);
        this.f48687c = (int) (f48684h * f5);
        if (b()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            ViewCompat.setElevation(this, f5 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new a(this.f48687c));
            ViewCompat.setLayerType(this, 1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f48687c, i6, i5, f48680d);
            int i7 = this.f48687c;
            setPadding(i7, i7, i7, i7);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(-11621911);
        ViewCompat.setBackground(this, shapeDrawable);
    }

    private boolean b() {
        return Build.VERSION.SDK_INT >= 21;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f48686b;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f48686b;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (b()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth() + (this.f48687c * 2), getMeasuredHeight() + (this.f48687c * 2));
    }

    public void setAnimationListener(Animation.AnimationListener animationListener) {
        this.f48686b = animationListener;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i4) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i4);
        }
    }

    public void setBackgroundColorRes(int i4) {
        setBackgroundColor(ContextCompat.getColor(getContext(), i4));
    }
}
