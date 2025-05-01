package com.join.mgps.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.g2;
/* loaded from: classes4.dex */
public class TextViewWithHyperlink extends TextView {

    /* loaded from: classes4.dex */
    public interface a {
        void a();
    }

    /* loaded from: classes4.dex */
    public class b extends ClickableSpan {

        /* renamed from: b  reason: collision with root package name */
        Context f48035b;

        /* renamed from: c  reason: collision with root package name */
        a f48036c;

        public b(Context context, a aVar) {
            this.f48036c = aVar;
            this.f48035b = context;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            this.f48036c.a();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(-13882324);
        }
    }

    /* loaded from: classes4.dex */
    public class c extends ClickableSpan {

        /* renamed from: b  reason: collision with root package name */
        Context f48038b;

        /* renamed from: c  reason: collision with root package name */
        IntentDateBean f48039c;

        public c(Context context, IntentDateBean intentDateBean) {
            this.f48039c = intentDateBean;
            this.f48038b = context;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            IntentUtil.getInstance().intentActivity(this.f48038b, this.f48039c);
            view.callOnClick();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(-13995317);
        }
    }

    public TextViewWithHyperlink(Context context) {
        super(context);
    }

    public int a(Context context, String str, IntentDateBean intentDateBean, a aVar) {
        if (g2.h(str)) {
            return -1;
        }
        SpannableString spannableString = new SpannableString(getText());
        int lastIndexOf = spannableString.toString().lastIndexOf(str);
        if (lastIndexOf == -1) {
            return -1;
        }
        int length = str.length() + lastIndexOf;
        if (lastIndexOf > 0) {
            spannableString.setSpan(new b(context, aVar), 0, lastIndexOf - 1, 33);
        }
        spannableString.setSpan(new c(context, intentDateBean), lastIndexOf, length, 33);
        setText(spannableString);
        setMovementMethod(LinkMovementMethod.getInstance());
        return 0;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public TextViewWithHyperlink(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TextViewWithHyperlink(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }
}
