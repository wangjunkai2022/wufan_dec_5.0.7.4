package com.join.android.app.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public class CollapsibleTextView extends LinearLayout implements View.OnClickListener {

    /* renamed from: h  reason: collision with root package name */
    private static int f14913h = 5;

    /* renamed from: i  reason: collision with root package name */
    private static final int f14914i = 0;

    /* renamed from: j  reason: collision with root package name */
    private static final int f14915j = 1;

    /* renamed from: k  reason: collision with root package name */
    private static final int f14916k = 2;

    /* renamed from: b  reason: collision with root package name */
    private TextView f14917b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f14918c;

    /* renamed from: d  reason: collision with root package name */
    private String f14919d;

    /* renamed from: e  reason: collision with root package name */
    private String f14920e;

    /* renamed from: f  reason: collision with root package name */
    private int f14921f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f14922g;

    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CollapsibleTextView.this.f14921f == 2) {
                CollapsibleTextView.this.f14917b.setMaxLines(CollapsibleTextView.f14913h);
                CollapsibleTextView.this.f14918c.setVisibility(0);
                CollapsibleTextView.this.f14918c.setText(CollapsibleTextView.this.f14920e);
                CollapsibleTextView.this.f14921f = 1;
            } else if (CollapsibleTextView.this.f14921f == 1) {
                CollapsibleTextView.this.f14917b.setMaxLines(Integer.MAX_VALUE);
                CollapsibleTextView.this.f14918c.setVisibility(0);
                CollapsibleTextView.this.f14918c.setText(CollapsibleTextView.this.f14919d);
                CollapsibleTextView.this.f14921f = 2;
            }
        }
    }

    public CollapsibleTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i(context);
        h(context, attributeSet);
    }

    private void h(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CollapsibleTextView);
        this.f14917b.setTextSize(obtainStyledAttributes.getDimension(23, 18.0f));
        this.f14917b.setTextColor(obtainStyledAttributes.getInt(0, -16777216));
        this.f14917b.setGravity(obtainStyledAttributes.getInt(1, 51));
        this.f14917b.setPadding(obtainStyledAttributes.getInt(20, 0), obtainStyledAttributes.getInt(22, 0), obtainStyledAttributes.getInt(21, 0), obtainStyledAttributes.getInt(19, 0));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(obtainStyledAttributes.getInt(3, 0), obtainStyledAttributes.getInt(5, 0), obtainStyledAttributes.getInt(4, 0), obtainStyledAttributes.getInt(2, 0));
        this.f14917b.setLayoutParams(layoutParams);
        this.f14917b.setText(obtainStyledAttributes.getString(24));
        this.f14918c.setTextSize(obtainStyledAttributes.getDimension(16, 18.0f));
        this.f14918c.setTextColor(obtainStyledAttributes.getInt(6, -11048043));
        this.f14918c.setGravity(obtainStyledAttributes.getInt(7, 19));
        this.f14918c.setPadding(obtainStyledAttributes.getInt(13, 0), obtainStyledAttributes.getInt(15, 0), obtainStyledAttributes.getInt(14, 0), obtainStyledAttributes.getInt(12, 0));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(obtainStyledAttributes.getInt(9, 0), obtainStyledAttributes.getInt(11, 0), obtainStyledAttributes.getInt(10, 0), obtainStyledAttributes.getInt(8, 0));
        this.f14918c.setLayoutParams(layoutParams2);
        this.f14918c.setText(obtainStyledAttributes.getString(17));
        this.f14918c.setSingleLine(true);
        this.f14918c.setVisibility(obtainStyledAttributes.getInt(18, 8));
        obtainStyledAttributes.recycle();
    }

    private void i(Context context) {
        this.f14919d = context.getString(R.string.desc_shrinkup);
        this.f14920e = context.getString(R.string.desc_spread);
        TextView textView = new TextView(context);
        this.f14917b = textView;
        textView.setId(R.id.collapsible_text_view_desc);
        TextView textView2 = new TextView(context);
        this.f14918c = textView2;
        textView2.setId(R.id.collapsible_text_view_desc_op);
        this.f14918c.setOnClickListener(this);
        addView(this.f14917b);
        addView(this.f14918c);
        setOrientation(1);
    }

    private void j() {
        this.f14921f = 2;
        requestLayout();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f14922g = false;
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        if (this.f14922g) {
            return;
        }
        this.f14922g = true;
        if (this.f14917b.getLineCount() <= f14913h) {
            this.f14921f = 0;
            this.f14918c.setVisibility(8);
            this.f14917b.setMaxLines(f14913h + 1);
            return;
        }
        post(new a());
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
    }

    public final void setDesc(CharSequence charSequence, TextView.BufferType bufferType) {
        this.f14917b.setText(charSequence, bufferType);
        j();
    }

    public final void setDescOp(CharSequence charSequence) {
        this.f14917b.setText(charSequence);
        j();
    }

    public final void setDesc(CharSequence charSequence) {
        this.f14917b.setText(charSequence);
        j();
    }

    public CollapsibleTextView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        i(context);
        h(context, attributeSet);
    }

    public CollapsibleTextView(Context context) {
        this(context, null);
    }
}
