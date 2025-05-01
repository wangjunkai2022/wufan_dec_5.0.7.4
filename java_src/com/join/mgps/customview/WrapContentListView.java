package com.join.mgps.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ListView;
/* loaded from: classes4.dex */
public class WrapContentListView extends ListView {

    /* renamed from: b  reason: collision with root package name */
    private ViewGroup.LayoutParams f48106b;

    /* renamed from: c  reason: collision with root package name */
    private int f48107c;

    public WrapContentListView(Context context) {
        super(context);
        this.f48107c = 0;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (getCount() != this.f48107c) {
            if (getChildAt(0) != null) {
                this.f48107c = getCount();
            }
            int height = getChildAt(0).getHeight() + 1;
            int i4 = 0;
            for (int i5 = 0; i5 < this.f48107c; i5++) {
                try {
                    i4 += getChildAt(i5).getHeight() + 1;
                } catch (Exception e5) {
                    e5.printStackTrace();
                    i4 += height;
                }
            }
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            this.f48106b = layoutParams;
            layoutParams.height = i4;
            setLayoutParams(layoutParams);
        }
        super.onDraw(canvas);
    }

    public WrapContentListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48107c = 0;
    }

    public WrapContentListView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f48107c = 0;
    }
}
