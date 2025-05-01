package com.kwad.sdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.kwad.sdk.R;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.ac;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes5.dex */
public class KSRelativeLayout extends RelativeLayout implements i {
    private final AtomicBoolean Vu;
    private final ac.a aDU;
    private g aTG;
    private i aTH;
    private float mRatio;
    private h mViewRCHelper;

    public KSRelativeLayout(@NonNull Context context) {
        super(context);
        this.Vu = new AtomicBoolean(true);
        this.mRatio = 0.0f;
        this.aDU = new ac.a();
        init(context, null);
    }

    private void init(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        if (attributeSet != null) {
            int i4 = R.attr.ksad_ratio;
            int[] iArr = {i4};
            Arrays.sort(iArr);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
            this.mRatio = obtainStyledAttributes.getFloat(Arrays.binarySearch(iArr, i4), 0.0f);
            obtainStyledAttributes.recycle();
        }
        g gVar = new g(this, this);
        this.aTG = gVar;
        gVar.ce(true);
        h hVar = new h();
        this.mViewRCHelper = hVar;
        hVar.initAttrs(context, attributeSet);
    }

    private void tP() {
        if (this.Vu.getAndSet(false)) {
            ac();
        }
    }

    private void tQ() {
        if (this.Vu.getAndSet(true)) {
            return;
        }
        ad();
    }

    @Override // com.kwad.sdk.widget.i
    @CallSuper
    public final void A(View view) {
        i iVar = this.aTH;
        if (iVar != null) {
            iVar.A(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @CallSuper
    public void ac() {
        this.aTG.onAttachedToWindow();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @CallSuper
    public void ad() {
        this.aTG.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        this.mViewRCHelper.beforeDispatchDraw(canvas);
        try {
            super.dispatchDraw(canvas);
        } catch (Throwable th) {
            ServiceProvider.reportSdkCaughtException(th);
        }
        this.mViewRCHelper.afterDispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.aDU.z(getWidth(), getHeight());
            this.aDU.f(motionEvent.getX(), motionEvent.getY());
        } else if (action == 1) {
            this.aDU.g(motionEvent.getX(), motionEvent.getY());
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        this.mViewRCHelper.beforeDraw(canvas);
        super.draw(canvas);
        this.mViewRCHelper.afterDraw(canvas);
    }

    @MainThread
    public ac.a getTouchCoords() {
        return this.aDU;
    }

    public float getVisiblePercent() {
        return this.aTG.getVisiblePercent();
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        tP();
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        tQ();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        tP();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        if (this.mRatio != 0.0f) {
            i5 = View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i4) * this.mRatio), 1073741824);
        }
        super.onMeasure(i4, i5);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        this.aTG.b(i4, i5, i6, i7);
        super.onSizeChanged(i4, i5, i6, i7);
        this.aTG.OE();
        this.mViewRCHelper.onSizeChanged(i4, i5);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        tQ();
    }

    public void setRadius(float f5) {
        this.mViewRCHelper.setRadius(f5);
        postInvalidate();
    }

    public void setRatio(float f5) {
        this.mRatio = f5;
    }

    public void setViewVisibleListener(i iVar) {
        this.aTH = iVar;
    }

    public void setVisiblePercent(float f5) {
        this.aTG.setVisiblePercent(f5);
    }

    public KSRelativeLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Vu = new AtomicBoolean(true);
        this.mRatio = 0.0f;
        this.aDU = new ac.a();
        init(context, attributeSet);
    }

    public KSRelativeLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.Vu = new AtomicBoolean(true);
        this.mRatio = 0.0f;
        this.aDU = new ac.a();
        init(context, attributeSet);
    }
}
