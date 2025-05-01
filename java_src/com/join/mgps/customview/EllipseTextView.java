package com.join.mgps.customview;

import android.content.Context;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
/* loaded from: classes4.dex */
public class EllipseTextView extends AppCompatTextView {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements TextUtils.EllipsizeCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int[] f46941a;

        a(int[] iArr) {
            this.f46941a = iArr;
        }

        @Override // android.text.TextUtils.EllipsizeCallback
        public void ellipsized(int i4, int i5) {
            this.f46941a[0] = i4;
        }
    }

    public EllipseTextView(Context context) {
        super(context);
    }

    private static int a(TextPaint textPaint, CharSequence charSequence, int i4, int i5) {
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i5, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        if (staticLayout.getLineCount() > i4) {
            int lineStart = staticLayout.getLineStart(i4 - 1);
            int[] iArr = {0};
            TextUtils.ellipsize(charSequence.subSequence(lineStart, charSequence.length()), textPaint, i5, TextUtils.TruncateAt.END, false, new a(iArr));
            return lineStart + iArr[0];
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        a(getPaint(), getText(), 2, View.MeasureSpec.getSize(i4));
    }

    public EllipseTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public EllipseTextView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }
}
