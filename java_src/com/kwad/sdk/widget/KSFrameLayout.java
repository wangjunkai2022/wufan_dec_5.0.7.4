package com.kwad.sdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
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
public class KSFrameLayout extends FrameLayout implements com.kwad.sdk.core.view.d, e, i {
    private final AtomicBoolean Vu;
    private com.kwad.sdk.core.view.c aDT;
    private final ac.a aDU;
    private g aTG;
    private i aTH;
    private View aTI;
    private float mRatio;
    private h mViewRCHelper;
    private boolean widthBasedRatio;

    public KSFrameLayout(@NonNull Context context) {
        super(context);
        this.Vu = new AtomicBoolean(true);
        this.mRatio = 0.0f;
        this.aDU = new ac.a();
        this.aDT = new com.kwad.sdk.core.view.c();
        this.widthBasedRatio = true;
        init(context, null);
    }

    private View getPvView() {
        View view = this.aTI;
        return view == null ? this : view;
    }

    private static float[] getRadius(float f5, float f6, float f7, float f8) {
        return new float[]{f5, f5, f6, f6, f7, f7, f8, f8};
    }

    private void tP() {
        try {
            if (this.Vu.getAndSet(false)) {
                ac();
            }
        } catch (Throwable th) {
            ServiceProvider.reportSdkCaughtException(th);
        }
    }

    private void tQ() {
        try {
            if (this.Vu.getAndSet(true)) {
                return;
            }
            ad();
        } catch (Throwable th) {
            ServiceProvider.reportSdkCaughtException(th);
        }
    }

    @CallSuper
    public void A(View view) {
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
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

    @Override // com.kwad.sdk.widget.e
    @MainThread
    public ac.a getTouchCoords() {
        return this.aDU;
    }

    public float getVisiblePercent() {
        return this.aTG.getVisiblePercent();
    }

    @Override // com.kwad.sdk.core.view.d
    @NonNull
    public com.kwad.sdk.core.view.c getWindowFocusChangeHelper() {
        return this.aDT;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void init(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        if (attributeSet != null) {
            int i4 = R.attr.ksad_ratio;
            int[] iArr = {i4};
            Arrays.sort(iArr);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
            this.mRatio = obtainStyledAttributes.getFloat(Arrays.binarySearch(iArr, i4), 0.0f);
            obtainStyledAttributes.recycle();
        }
        g gVar = new g(getPvView(), this);
        this.aTG = gVar;
        gVar.ce(true);
        h hVar = new h();
        this.mViewRCHelper = hVar;
        hVar.initAttrs(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        tP();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        tQ();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        tP();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i4, int i5) {
        if (this.mRatio != 0.0f) {
            if (this.widthBasedRatio) {
                i5 = View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i4) * this.mRatio), 1073741824);
            } else {
                i4 = View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i5) / this.mRatio), 1073741824);
            }
        }
        super.onMeasure(i4, i5);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onSizeChanged(int i4, int i5, int i6, int i7) {
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

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z4) {
        super.onWindowFocusChanged(z4);
        this.aDT.j(this, z4);
    }

    public void setAllCorner(boolean z4) {
        this.mViewRCHelper.getCornerConf().setAllCorner(z4);
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

    public void setWidthBasedRatio(boolean z4) {
        this.widthBasedRatio = z4;
    }

    public final void setRadius(float f5, float f6, float f7, float f8) {
        this.mViewRCHelper.setRadius(getRadius(f5, f6, f7, f8));
        postInvalidate();
    }

    public KSFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Vu = new AtomicBoolean(true);
        this.mRatio = 0.0f;
        this.aDU = new ac.a();
        this.aDT = new com.kwad.sdk.core.view.c();
        this.widthBasedRatio = true;
        init(context, attributeSet);
    }

    public KSFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.Vu = new AtomicBoolean(true);
        this.mRatio = 0.0f;
        this.aDU = new ac.a();
        this.aDT = new com.kwad.sdk.core.view.c();
        this.widthBasedRatio = true;
        init(context, attributeSet);
    }

    public KSFrameLayout(@NonNull Context context, View view) {
        super(context);
        this.Vu = new AtomicBoolean(true);
        this.mRatio = 0.0f;
        this.aDU = new ac.a();
        this.aDT = new com.kwad.sdk.core.view.c();
        this.widthBasedRatio = true;
        this.aTI = view;
        init(context, null);
    }
}
