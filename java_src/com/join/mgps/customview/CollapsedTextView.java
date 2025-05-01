package com.join.mgps.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import com.join.android.app.mgsim.wufun.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* loaded from: classes4.dex */
public class CollapsedTextView extends AppCompatTextView implements View.OnClickListener {

    /* renamed from: q  reason: collision with root package name */
    private static final String f46712q = "...";

    /* renamed from: r  reason: collision with root package name */
    public static final int f46713r = 4;

    /* renamed from: s  reason: collision with root package name */
    private static final String f46714s = "展开全文";

    /* renamed from: t  reason: collision with root package name */
    private static final String f46715t = "收起全文";

    /* renamed from: u  reason: collision with root package name */
    public static final int f46716u = 0;

    /* renamed from: v  reason: collision with root package name */
    public static final int f46717v = 1;

    /* renamed from: b  reason: collision with root package name */
    private int f46718b;

    /* renamed from: c  reason: collision with root package name */
    private String f46719c;

    /* renamed from: d  reason: collision with root package name */
    private String f46720d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f46721e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f46722f;

    /* renamed from: g  reason: collision with root package name */
    private CharSequence f46723g;

    /* renamed from: h  reason: collision with root package name */
    private int f46724h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f46725i;

    /* renamed from: j  reason: collision with root package name */
    private int f46726j;

    /* renamed from: k  reason: collision with root package name */
    private int f46727k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f46728l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f46729m;

    /* renamed from: n  reason: collision with root package name */
    private b f46730n;

    /* renamed from: o  reason: collision with root package name */
    private View.OnClickListener f46731o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f46732p;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface TipsGravityMode {
    }

    /* loaded from: classes4.dex */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextView.BufferType f46733b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CharSequence f46734c;

        a(TextView.BufferType bufferType, CharSequence charSequence) {
            this.f46733b = bufferType;
            this.f46734c = charSequence;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            CollapsedTextView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            CollapsedTextView collapsedTextView = CollapsedTextView.this;
            collapsedTextView.f46724h = (collapsedTextView.getWidth() - CollapsedTextView.this.getPaddingLeft()) - CollapsedTextView.this.getPaddingRight();
            CollapsedTextView.this.j(this.f46733b, this.f46734c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class b extends ClickableSpan {
        private b() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (CollapsedTextView.this.f46729m) {
                CollapsedTextView.this.f46732p = false;
                CollapsedTextView collapsedTextView = CollapsedTextView.this;
                collapsedTextView.f46725i = !collapsedTextView.f46725i;
                CollapsedTextView collapsedTextView2 = CollapsedTextView.this;
                collapsedTextView2.setText(collapsedTextView2.f46723g);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(CollapsedTextView.this.f46727k == 0 ? textPaint.linkColor : CollapsedTextView.this.f46727k);
            textPaint.setUnderlineText(CollapsedTextView.this.f46728l);
        }

        /* synthetic */ b(CollapsedTextView collapsedTextView, a aVar) {
            this();
        }
    }

    public CollapsedTextView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(TextView.BufferType bufferType, CharSequence charSequence) {
        int measureText;
        this.f46723g = com.join.mgps.Util.n.b(charSequence);
        Layout layout = getLayout();
        if (layout == null || !layout.getText().equals(this.f46723g)) {
            super.setText(this.f46723g, bufferType);
            layout = getLayout();
        }
        TextPaint paint = getPaint();
        int lineCount = layout.getLineCount();
        int i4 = this.f46718b;
        if (lineCount <= i4) {
            super.setText(this.f46723g, bufferType);
            return;
        }
        int lineStart = layout.getLineStart(i4 - 1);
        int lineVisibleEnd = layout.getLineVisibleEnd(this.f46718b - 1);
        Drawable drawable = this.f46721e;
        int intrinsicWidth = drawable != null ? drawable.getIntrinsicWidth() : 0;
        if (this.f46726j == 0) {
            measureText = ((int) paint.measureText("... " + this.f46719c)) + intrinsicWidth;
        } else {
            measureText = (int) paint.measureText("... ");
        }
        float f5 = measureText;
        if (layout.getLineWidth(this.f46718b - 1) + f5 > this.f46724h) {
            lineVisibleEnd -= paint.breakText(this.f46723g, lineStart, lineVisibleEnd, false, f5, null) + 1;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(this.f46723g.subSequence(0, lineVisibleEnd));
        spannableStringBuilder.append(f46712q);
        setSpan(spannableStringBuilder);
        super.setText(spannableStringBuilder, bufferType);
    }

    private void k(TextView.BufferType bufferType) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f46723g);
        setSpan(spannableStringBuilder);
        super.setText(spannableStringBuilder, bufferType);
    }

    private void l(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CollapsedTextView);
            this.f46718b = obtainStyledAttributes.getInt(1, 4);
            setExpandedText(obtainStyledAttributes.getString(4));
            setCollapsedText(obtainStyledAttributes.getString(2));
            setExpandedDrawable(obtainStyledAttributes.getDrawable(3));
            setCollapsedDrawable(obtainStyledAttributes.getDrawable(0));
            this.f46726j = obtainStyledAttributes.getInt(7, 0);
            this.f46727k = obtainStyledAttributes.getColor(6, 0);
            this.f46728l = obtainStyledAttributes.getBoolean(8, false);
            this.f46729m = obtainStyledAttributes.getBoolean(5, true);
            obtainStyledAttributes.recycle();
        }
    }

    private void setSpan(SpannableStringBuilder spannableStringBuilder) {
        if (this.f46726j == 0) {
            spannableStringBuilder.append(" ");
        } else {
            spannableStringBuilder.append("\n");
        }
        if (this.f46725i) {
            return;
        }
        spannableStringBuilder.append((CharSequence) this.f46719c);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(com.join.android.app.component.optimizetext.a.n((int) getContext().getResources().getDimension(R.dimen.wdp24)), true), spannableStringBuilder.length() - this.f46719c.length(), spannableStringBuilder.length(), 17);
        Drawable drawable = this.f46721e;
        spannableStringBuilder.setSpan(this.f46730n, (spannableStringBuilder.length() - (this.f46719c.length() + 2)) + 2, spannableStringBuilder.length(), 17);
        if (drawable != null) {
            spannableStringBuilder.append(" ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable, 1), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
            spannableStringBuilder.append(" ");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (!this.f46732p) {
            this.f46732p = true;
            return;
        }
        View.OnClickListener onClickListener = this.f46731o;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public void setCollapsedDrawable(Drawable drawable) {
        if (drawable != null) {
            this.f46722f = drawable;
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f46722f.getIntrinsicHeight());
        }
    }

    public void setCollapsedDrawableRes(@DrawableRes int i4) {
        setCollapsedDrawable(ContextCompat.getDrawable(getContext(), i4));
    }

    public void setCollapsedLines(@IntRange(from = 0) int i4) {
        this.f46718b = i4;
    }

    public void setCollapsedText(String str) {
        if (TextUtils.isEmpty(str)) {
            str = f46715t;
        }
        this.f46720d = str;
    }

    public void setExpandedDrawable(Drawable drawable) {
        if (drawable != null) {
            this.f46721e = drawable;
            drawable.setBounds(5, 0, drawable.getIntrinsicWidth() + 5, this.f46721e.getIntrinsicHeight());
        }
    }

    public void setExpandedDrawableRes(@DrawableRes int i4) {
        setExpandedDrawable(ContextCompat.getDrawable(getContext(), i4));
    }

    public void setExpandedText(String str) {
        if (TextUtils.isEmpty(str)) {
            str = f46714s;
        }
        this.f46719c = str;
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f46731o = onClickListener;
        super.setOnClickListener(this);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (!TextUtils.isEmpty(charSequence) && this.f46718b != 0) {
            if (this.f46725i) {
                this.f46723g = com.join.mgps.Util.n.b(charSequence);
                k(bufferType);
                return;
            } else if (this.f46724h == 0) {
                getViewTreeObserver().addOnGlobalLayoutListener(new a(bufferType, charSequence));
                super.setText(charSequence, bufferType);
                return;
            } else {
                j(bufferType, charSequence);
                return;
            }
        }
        super.setText(charSequence, bufferType);
    }

    public void setTipsClickable(boolean z4) {
        this.f46729m = z4;
    }

    public void setTipsColor(@ColorInt int i4) {
        this.f46727k = i4;
    }

    public void setTipsGravity(int i4) {
        this.f46726j = i4;
    }

    public void setTipsUnderline(boolean z4) {
        this.f46728l = z4;
    }

    public CollapsedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CollapsedTextView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f46730n = new b(this, null);
        this.f46732p = true;
        l(context, attributeSet);
        setMovementMethod(LinkMovementMethod.getInstance());
    }
}
