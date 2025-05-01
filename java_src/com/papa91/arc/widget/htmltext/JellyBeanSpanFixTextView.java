package com.papa91.arc.widget.htmltext;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.util.AttributeSet;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes5.dex */
public class JellyBeanSpanFixTextView extends TextView {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class FixingResult {
        public final boolean fixed;
        public final List<Object> spansWithSpacesAfter;
        public final List<Object> spansWithSpacesBefore;

        private FixingResult(boolean z4, List<Object> list, List<Object> list2) {
            this.fixed = z4;
            this.spansWithSpacesBefore = list;
            this.spansWithSpacesAfter = list2;
        }

        public static FixingResult fixed(List<Object> list, List<Object> list2) {
            return new FixingResult(true, list, list2);
        }

        public static FixingResult notFixed() {
            return new FixingResult(false, null, null);
        }
    }

    public JellyBeanSpanFixTextView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }

    private FixingResult addSpacesAroundSpansUntilFixed(SpannableStringBuilder spannableStringBuilder, int i4, int i5) {
        Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Object.class);
        ArrayList arrayList = new ArrayList(spans.length);
        ArrayList arrayList2 = new ArrayList(spans.length);
        for (Object obj : spans) {
            int spanStart = spannableStringBuilder.getSpanStart(obj);
            if (isNotSpace(spannableStringBuilder, spanStart - 1)) {
                spannableStringBuilder.insert(spanStart, " ");
                arrayList.add(obj);
            }
            int spanEnd = spannableStringBuilder.getSpanEnd(obj);
            if (isNotSpace(spannableStringBuilder, spanEnd)) {
                spannableStringBuilder.insert(spanEnd, " ");
                arrayList2.add(obj);
            }
            try {
                continue;
                setTextAndMeasure(spannableStringBuilder, i4, i5);
                return FixingResult.fixed(arrayList, arrayList2);
            } catch (IndexOutOfBoundsException unused) {
            }
        }
        return FixingResult.notFixed();
    }

    private void fallbackToString(int i4, int i5) {
        setTextAndMeasure(getText().toString(), i4, i5);
    }

    private void fixOnMeasure(int i4, int i5) {
        CharSequence text = getText();
        if (text instanceof Spanned) {
            fixSpannedWithSpaces(new SpannableStringBuilder(text), i4, i5);
        } else {
            fallbackToString(i4, i5);
        }
    }

    private void fixSpannedWithSpaces(SpannableStringBuilder spannableStringBuilder, int i4, int i5) {
        System.currentTimeMillis();
        FixingResult addSpacesAroundSpansUntilFixed = addSpacesAroundSpansUntilFixed(spannableStringBuilder, i4, i5);
        if (addSpacesAroundSpansUntilFixed.fixed) {
            removeUnneededSpaces(i4, i5, spannableStringBuilder, addSpacesAroundSpansUntilFixed);
        } else {
            fallbackToString(i4, i5);
        }
    }

    private boolean isNotSpace(CharSequence charSequence, int i4) {
        return i4 < 0 || i4 >= charSequence.length() || charSequence.charAt(i4) != ' ';
    }

    @SuppressLint({"WrongCall"})
    private void removeUnneededSpaces(int i4, int i5, SpannableStringBuilder spannableStringBuilder, FixingResult fixingResult) {
        boolean z4;
        for (Object obj : fixingResult.spansWithSpacesAfter) {
            int spanEnd = spannableStringBuilder.getSpanEnd(obj);
            spannableStringBuilder.delete(spanEnd, spanEnd + 1);
            try {
                setTextAndMeasure(spannableStringBuilder, i4, i5);
            } catch (IndexOutOfBoundsException unused) {
                spannableStringBuilder.insert(spanEnd, " ");
            }
        }
        loop1: while (true) {
            z4 = true;
            for (Object obj2 : fixingResult.spansWithSpacesBefore) {
                int spanStart = spannableStringBuilder.getSpanStart(obj2);
                int i6 = spanStart - 1;
                spannableStringBuilder.delete(i6, spanStart);
                try {
                    setTextAndMeasure(spannableStringBuilder, i4, i5);
                    z4 = false;
                } catch (IndexOutOfBoundsException unused2) {
                    spannableStringBuilder.insert(i6, " ");
                }
            }
            break loop1;
        }
        if (z4) {
            setText(spannableStringBuilder);
            super.onMeasure(i4, i5);
        }
    }

    @SuppressLint({"WrongCall"})
    private void setTextAndMeasure(CharSequence charSequence, int i4, int i5) {
        setText(charSequence);
        super.onMeasure(i4, i5);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i4, int i5) {
        try {
            super.onMeasure(i4, i5);
        } catch (IndexOutOfBoundsException unused) {
            fixOnMeasure(i4, i5);
        }
    }

    public JellyBeanSpanFixTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public JellyBeanSpanFixTextView(Context context) {
        super(context);
    }
}
