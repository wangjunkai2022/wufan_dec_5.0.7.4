package com.join.mgps.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
/* loaded from: classes4.dex */
public class KeyboardListenLayout extends RelativeLayout {

    /* renamed from: b  reason: collision with root package name */
    private a f47241b;

    /* loaded from: classes4.dex */
    public interface a {
        void onHidden();

        void onShown();
    }

    public KeyboardListenLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        if (this.f47241b != null) {
            if (getMeasuredHeight() > View.MeasureSpec.getSize(i5)) {
                this.f47241b.onShown();
            } else {
                this.f47241b.onHidden();
            }
        }
        super.onMeasure(i4, i5);
    }

    public final void setOnSoftKeyboardListener(a aVar) {
        this.f47241b = aVar;
    }

    public KeyboardListenLayout(Context context) {
        super(context);
    }
}
