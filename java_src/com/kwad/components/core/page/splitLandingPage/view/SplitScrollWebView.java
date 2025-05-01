package com.kwad.components.core.page.splitLandingPage.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.MotionEventCompat;
import com.kwad.components.core.s.d;
import com.kwad.sdk.core.webview.KsAdWebView;
/* loaded from: classes5.dex */
public class SplitScrollWebView extends KsAdWebView {
    private int QA;
    private boolean QX;
    private a QY;
    private float QZ;
    private boolean Ra;

    /* loaded from: classes5.dex */
    public interface a {
        void f(float f5);

        boolean qy();
    }

    public SplitScrollWebView(Context context) {
        super(context);
        this.QX = false;
        qs();
    }

    private void qs() {
        this.QA = 0;
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        int screenHeight;
        if (this.QA != 0) {
            int statusBarHeight = d.rG() ? com.kwad.sdk.c.a.a.getStatusBarHeight(getContext()) : 0;
            if (getContext() instanceof Activity) {
                screenHeight = com.kwad.sdk.c.a.a.e((Activity) getContext());
            } else {
                screenHeight = com.kwad.sdk.c.a.a.getScreenHeight(getContext());
            }
            i5 = View.MeasureSpec.makeMeasureSpec((screenHeight - statusBarHeight) - this.QA, 1073741824);
        }
        super.onMeasure(i4, i5);
    }

    @Override // com.kwad.sdk.core.webview.KsAdWebView, android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (this.QX) {
            return super.onTouchEvent(obtain);
        }
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        float y2 = motionEvent.getY();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    float f5 = this.QZ;
                    float f6 = f5 - y2;
                    a aVar = this.QY;
                    if (aVar != null && y2 <= f5) {
                        this.Ra = true;
                        aVar.f(f6);
                    }
                    return super.onTouchEvent(obtain);
                } else if (actionMasked != 3) {
                    return false;
                }
            }
            a aVar2 = this.QY;
            if (aVar2 != null) {
                if ((this.QZ - y2 >= 0.0f || this.Ra) && aVar2.qy()) {
                    this.QX = true;
                    return false;
                }
                return false;
            }
            return false;
        }
        this.QZ = y2;
        this.Ra = false;
        return super.onTouchEvent(motionEvent);
    }

    public void setDisableAnimation(boolean z4) {
        this.QX = z4;
    }

    public void setSplitScrollWebViewListener(a aVar) {
        this.QY = aVar;
    }

    public SplitScrollWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.QX = false;
        qs();
    }

    public SplitScrollWebView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.QX = false;
        qs();
    }
}
