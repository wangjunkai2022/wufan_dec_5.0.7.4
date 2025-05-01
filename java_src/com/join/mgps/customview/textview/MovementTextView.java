package com.join.mgps.customview.textview;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;
import androidx.annotation.Nullable;
/* loaded from: classes4.dex */
public class MovementTextView extends TextView {

    /* renamed from: b  reason: collision with root package name */
    a f48789b;

    /* loaded from: classes4.dex */
    public interface a {
        void onClickText();
    }

    public MovementTextView(Context context) {
        super(context);
    }

    private ClickableSpan[] a(CharSequence charSequence, int i4) {
        if (charSequence instanceof SpannableStringBuilder) {
            return (ClickableSpan[]) ((SpannableStringBuilder) charSequence).getSpans(i4, i4, z1.a.class);
        }
        if (charSequence instanceof SpannableString) {
            return (ClickableSpan[]) ((SpannableString) charSequence).getSpans(i4, i4, z1.a.class);
        }
        return (ClickableSpan[]) ((SpannedString) charSequence).getSpans(i4, i4, z1.a.class);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            CharSequence text = getText();
            if ((text instanceof SpannableStringBuilder) || (text instanceof SpannedString) || (text instanceof SpannableString)) {
                int x4 = ((int) motionEvent.getX()) - getTotalPaddingLeft();
                int y2 = ((int) motionEvent.getY()) - getTotalPaddingTop();
                int scrollX = x4 + getScrollX();
                ClickableSpan[] a5 = a(text, getLayout().getOffsetForHorizontal(getLayout().getLineForVertical(y2 + getScrollY()), scrollX));
                if (a5.length != 0) {
                    a5[0].onClick(this);
                    return true;
                }
                a aVar = this.f48789b;
                if (aVar != null) {
                    aVar.onClickText();
                }
            }
        }
        return true;
    }

    public void setClickTextListener(a aVar) {
        this.f48789b = aVar;
    }

    public MovementTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MovementTextView(Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }
}
