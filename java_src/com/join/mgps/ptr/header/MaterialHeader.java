package com.join.mgps.ptr.header;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.join.mgps.ptr.PtrFrameLayout;
import com.join.mgps.ptr.PtrUIHeader;
import com.join.mgps.ptr.e;
/* loaded from: classes4.dex */
public class MaterialHeader extends PtrUIHeader {

    /* renamed from: b  reason: collision with root package name */
    private com.join.mgps.ptr.header.a f53737b;

    /* renamed from: c  reason: collision with root package name */
    private float f53738c;

    /* renamed from: d  reason: collision with root package name */
    private PtrFrameLayout f53739d;

    /* renamed from: e  reason: collision with root package name */
    private Animation f53740e;

    /* loaded from: classes4.dex */
    class a extends Animation {
        a() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f5, Transformation transformation) {
            MaterialHeader.this.f53738c = 1.0f - f5;
            MaterialHeader.this.f53737b.setAlpha((int) (MaterialHeader.this.f53738c * 255.0f));
            MaterialHeader.this.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b extends e {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MaterialHeader materialHeader = MaterialHeader.this;
            materialHeader.startAnimation(materialHeader.f53740e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements Animation.AnimationListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f53743b;

        c(e eVar) {
            this.f53743b = eVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f53743b.b();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public MaterialHeader(Context context) {
        super(context);
        this.f53738c = 1.0f;
        this.f53740e = new a();
        j();
    }

    private void j() {
        com.join.mgps.ptr.header.a aVar = new com.join.mgps.ptr.header.a(getContext(), this);
        this.f53737b = aVar;
        aVar.i(-1);
        this.f53737b.setCallback(this);
    }

    @Override // com.join.mgps.ptr.PtrUIHeader, com.join.mgps.ptr.c
    public void a(PtrFrameLayout ptrFrameLayout) {
        this.f53737b.stop();
    }

    @Override // com.join.mgps.ptr.PtrUIHeader, com.join.mgps.ptr.c
    public void b(PtrFrameLayout ptrFrameLayout, boolean z4, byte b5, com.join.mgps.ptr.indicator.a aVar) {
        float min = Math.min(1.0f, aVar.c());
        if (b5 == 2) {
            this.f53737b.setAlpha((int) (255.0f * min));
            this.f53737b.q(true);
            this.f53737b.n(0.0f, Math.min(0.8f, min * 0.8f));
            this.f53737b.h(Math.min(1.0f, min));
            this.f53737b.k((((0.4f * min) - 0.25f) + (min * 2.0f)) * 0.5f);
            invalidate();
        }
    }

    @Override // com.join.mgps.ptr.PtrUIHeader, com.join.mgps.ptr.c
    public void c(PtrFrameLayout ptrFrameLayout) {
        this.f53738c = 1.0f;
        this.f53737b.stop();
    }

    @Override // com.join.mgps.ptr.PtrUIHeader, com.join.mgps.ptr.c
    public void d(PtrFrameLayout ptrFrameLayout) {
    }

    @Override // com.join.mgps.ptr.PtrUIHeader, com.join.mgps.ptr.c
    public void e(PtrFrameLayout ptrFrameLayout) {
        this.f53737b.setAlpha(255);
        this.f53737b.start();
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (drawable == this.f53737b) {
            invalidate();
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int save = canvas.save();
        Rect bounds = this.f53737b.getBounds();
        canvas.translate(getPaddingLeft() + ((getMeasuredWidth() - this.f53737b.getIntrinsicWidth()) / 2), getPaddingTop());
        float f5 = this.f53738c;
        canvas.scale(f5, f5, bounds.exactCenterX(), bounds.exactCenterY());
        this.f53737b.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int intrinsicHeight = this.f53737b.getIntrinsicHeight();
        this.f53737b.setBounds(0, 0, intrinsicHeight, intrinsicHeight);
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(this.f53737b.getIntrinsicHeight() + getPaddingTop() + getPaddingBottom(), 1073741824));
    }

    public void setColorSchemeColors(int[] iArr) {
        this.f53737b.j(iArr);
        invalidate();
    }

    public void setPtrFrameLayout(PtrFrameLayout ptrFrameLayout) {
        b bVar = new b();
        this.f53740e.setDuration(200L);
        this.f53740e.setAnimationListener(new c(bVar));
        this.f53739d = ptrFrameLayout;
        ptrFrameLayout.setRefreshCompleteHook(bVar);
    }

    public MaterialHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53738c = 1.0f;
        this.f53740e = new a();
        j();
    }

    public MaterialHeader(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f53738c = 1.0f;
        this.f53740e = new a();
        j();
    }
}
