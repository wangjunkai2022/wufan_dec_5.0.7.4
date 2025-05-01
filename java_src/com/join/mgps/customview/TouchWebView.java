package com.join.mgps.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
/* loaded from: classes4.dex */
public class TouchWebView extends WebView {

    /* renamed from: b  reason: collision with root package name */
    String f48041b;

    public TouchWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48041b = getClass().getSimpleName();
        setLayerType(1, null);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
    }

    public TouchWebView(Context context) {
        super(context);
        this.f48041b = getClass().getSimpleName();
        setLayerType(1, null);
    }
}
