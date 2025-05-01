package com.join.mgps.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
/* loaded from: classes4.dex */
public class MultilineTextView extends AppCompatTextView {

    /* renamed from: b  reason: collision with root package name */
    private boolean f47399b;

    public MultilineTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47399b = false;
    }

    private void a() {
        setLines(getMeasuredHeight() / getLineHeight());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (!this.f47399b) {
            a();
            this.f47399b = true;
        }
        super.onDraw(canvas);
    }
}
