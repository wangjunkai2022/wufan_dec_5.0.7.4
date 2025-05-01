package com.join.mgps.customview;

import android.content.Context;
import android.text.Html;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;
/* loaded from: classes4.dex */
public class HtmlTextView extends TextView {

    /* renamed from: b  reason: collision with root package name */
    boolean f47204b;

    /* renamed from: c  reason: collision with root package name */
    boolean f47205c;

    /* renamed from: d  reason: collision with root package name */
    private String f47206d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f47207e;

    public HtmlTextView(Context context) {
        super(context);
        this.f47204b = true;
        this.f47206d = "...";
        this.f47207e = false;
    }

    public void a() {
        b((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingBottom()) - getPaddingTop());
    }

    public void b(int i4, int i5) {
        CharSequence text = getText();
        if (text == null || text.length() == 0 || i5 <= 0 || i4 <= 0) {
            return;
        }
        TextPaint paint = getPaint();
        StaticLayout staticLayout = new StaticLayout(text, paint, i4, Layout.Alignment.ALIGN_NORMAL, 1.25f, 0.0f, true);
        int lineCount = staticLayout.getLineCount();
        int height = i5 / (staticLayout.getHeight() / lineCount);
        if (lineCount > height && height > 0) {
            int i6 = height - 1;
            int lineStart = staticLayout.getLineStart(i6);
            int lineEnd = staticLayout.getLineEnd(i6);
            float lineWidth = staticLayout.getLineWidth(i6);
            float measureText = paint.measureText(this.f47206d);
            while (i4 < lineWidth + measureText) {
                lineEnd--;
                lineWidth = paint.measureText(text.subSequence(lineStart, lineEnd + 1).toString());
            }
            setText(((Object) text.subSequence(0, lineEnd)) + this.f47206d);
        }
        setMaxLines(height);
        this.f47207e = false;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        if (z4 || this.f47207e) {
            b(((i6 - i4) - getCompoundPaddingLeft()) - getCompoundPaddingRight(), ((i7 - i5) - getCompoundPaddingBottom()) - getCompoundPaddingTop());
        }
        super.onLayout(z4, i4, i5, i6, i7);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        if (i4 == i6 && i5 == i7) {
            return;
        }
        this.f47207e = true;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f47205c = false;
        return this.f47204b ? this.f47205c : super.onTouchEvent(motionEvent);
    }

    public void setTextViewHtml(String str) {
        setText(new SpannableStringBuilder(Html.fromHtml(str)));
    }

    public HtmlTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47204b = true;
        this.f47206d = "...";
        this.f47207e = false;
    }

    public HtmlTextView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f47204b = true;
        this.f47206d = "...";
        this.f47207e = false;
    }
}
