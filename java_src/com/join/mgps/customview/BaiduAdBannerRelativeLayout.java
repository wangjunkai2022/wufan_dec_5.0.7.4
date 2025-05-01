package com.join.mgps.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
/* loaded from: classes4.dex */
public class BaiduAdBannerRelativeLayout extends RelativeLayout {

    /* renamed from: b  reason: collision with root package name */
    boolean f46411b;

    public BaiduAdBannerRelativeLayout(Context context) {
        super(context);
        this.f46411b = false;
    }

    public boolean a() {
        return this.f46411b;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        super.addView(view);
    }

    public BaiduAdBannerRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46411b = false;
    }

    public BaiduAdBannerRelativeLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f46411b = false;
    }
}
