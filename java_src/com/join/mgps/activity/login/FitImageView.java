package com.join.mgps.activity.login;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes4.dex */
public class FitImageView extends ImageView {
    public FitImageView(Context context) {
        super(context);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i4, int i5) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            int size = View.MeasureSpec.getSize(i4);
            setMeasuredDimension(size, (int) Math.ceil((size * drawable.getIntrinsicHeight()) / drawable.getIntrinsicWidth()));
            return;
        }
        super.onMeasure(i4, i5);
    }

    public FitImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
