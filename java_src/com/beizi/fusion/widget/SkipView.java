package com.beizi.fusion.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.beizi.fusion.g.av;
/* loaded from: classes2.dex */
public class SkipView extends TextView {

    /* renamed from: a  reason: collision with root package name */
    private int f7256a;

    /* renamed from: b  reason: collision with root package name */
    private TextPaint f7257b;

    /* renamed from: c  reason: collision with root package name */
    private float f7258c;

    /* renamed from: d  reason: collision with root package name */
    private float f7259d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f7260e;

    /* renamed from: f  reason: collision with root package name */
    private RectF f7261f;

    /* renamed from: g  reason: collision with root package name */
    private RectF f7262g;

    /* renamed from: h  reason: collision with root package name */
    private int f7263h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f7264i;

    /* renamed from: j  reason: collision with root package name */
    private SparseIntArray f7265j;

    /* renamed from: k  reason: collision with root package name */
    private final a f7266k;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public interface a {
        int a(int i4, RectF rectF);
    }

    public SkipView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f7259d = 20.0f;
        this.f7261f = new RectF();
        this.f7264i = true;
        this.f7266k = new a() { // from class: com.beizi.fusion.widget.SkipView.1
            @Override // com.beizi.fusion.widget.SkipView.a
            @TargetApi(16)
            public int a(int i5, RectF rectF) {
                SkipView.this.f7257b.setTextSize(i5);
                String charSequence = SkipView.this.getText().toString();
                SkipView.this.f7261f.bottom = SkipView.this.f7257b.getFontSpacing();
                SkipView.this.f7261f.right = SkipView.this.f7257b.measureText(charSequence);
                SkipView.this.f7261f.offsetTo(0.0f, 0.0f);
                return rectF.contains(SkipView.this.f7261f) ? -1 : 1;
            }
        };
        init(context);
    }

    public void init(Context context) {
        setGravity(17);
        setLines(1);
        setMaxLines(1);
        setTextColor(-1);
        a(context, 0);
        TextPaint textPaint = new TextPaint();
        this.f7257b = textPaint;
        textPaint.set(getPaint());
        this.f7258c = getTextSize();
        this.f7262g = new RectF();
        this.f7265j = new SparseIntArray();
        this.f7260e = true;
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 53));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        SparseIntArray sparseIntArray = this.f7265j;
        if (sparseIntArray != null) {
            sparseIntArray.clear();
        }
        super.onSizeChanged(i4, i5, i6, i7);
        if (i4 == i6 && i5 == i7) {
            return;
        }
        a();
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        super.onTextChanged(charSequence, i4, i5, i6);
        a();
    }

    public void setData(int i4, int i5) {
        a(getContext(), i4);
        this.f7256a = i5;
    }

    private void a(Context context, int i4) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#80000000"));
        if (i4 == 1) {
            gradientDrawable.setStroke(1, Color.parseColor("#C0C0C0"));
        }
        gradientDrawable.setCornerRadius(av.a(context, 45.0f));
        setBackgroundDrawable(gradientDrawable);
    }

    private static int b(int i4, int i5, a aVar, RectF rectF) {
        int i6 = i5 - 1;
        int i7 = i4;
        while (i4 <= i6) {
            i7 = (i4 + i6) >>> 1;
            int a5 = aVar.a(i7, rectF);
            if (a5 >= 0) {
                if (a5 <= 0) {
                    break;
                }
                i7--;
                i6 = i7;
            } else {
                int i8 = i7 + 1;
                i7 = i4;
                i4 = i8;
            }
        }
        return i7;
    }

    public SkipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7259d = 20.0f;
        this.f7261f = new RectF();
        this.f7264i = true;
        this.f7266k = new a() { // from class: com.beizi.fusion.widget.SkipView.1
            @Override // com.beizi.fusion.widget.SkipView.a
            @TargetApi(16)
            public int a(int i5, RectF rectF) {
                SkipView.this.f7257b.setTextSize(i5);
                String charSequence = SkipView.this.getText().toString();
                SkipView.this.f7261f.bottom = SkipView.this.f7257b.getFontSpacing();
                SkipView.this.f7261f.right = SkipView.this.f7257b.measureText(charSequence);
                SkipView.this.f7261f.offsetTo(0.0f, 0.0f);
                return rectF.contains(SkipView.this.f7261f) ? -1 : 1;
            }
        };
        init(context);
    }

    private void a() {
        a(getText().toString());
    }

    private void a(String str) {
        if (this.f7260e) {
            int measuredHeight = ((getMeasuredHeight() - getCompoundPaddingBottom()) - getCompoundPaddingTop()) - this.f7256a;
            int measuredWidth = ((getMeasuredWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight()) - av.a(getContext(), 8.0f);
            this.f7263h = measuredWidth;
            RectF rectF = this.f7262g;
            rectF.right = measuredWidth;
            rectF.bottom = measuredHeight;
            super.setTextSize(0, a((int) this.f7259d, (int) this.f7258c, this.f7266k, rectF));
        }
    }

    public SkipView(Context context) {
        super(context);
        this.f7259d = 20.0f;
        this.f7261f = new RectF();
        this.f7264i = true;
        this.f7266k = new a() { // from class: com.beizi.fusion.widget.SkipView.1
            @Override // com.beizi.fusion.widget.SkipView.a
            @TargetApi(16)
            public int a(int i5, RectF rectF) {
                SkipView.this.f7257b.setTextSize(i5);
                String charSequence = SkipView.this.getText().toString();
                SkipView.this.f7261f.bottom = SkipView.this.f7257b.getFontSpacing();
                SkipView.this.f7261f.right = SkipView.this.f7257b.measureText(charSequence);
                SkipView.this.f7261f.offsetTo(0.0f, 0.0f);
                return rectF.contains(SkipView.this.f7261f) ? -1 : 1;
            }
        };
        init(context);
    }

    private int a(int i4, int i5, a aVar, RectF rectF) {
        if (!this.f7264i) {
            return b(i4, i5, aVar, rectF);
        }
        String charSequence = getText().toString();
        int length = charSequence == null ? 0 : charSequence.length();
        int i6 = this.f7265j.get(length);
        if (i6 != 0) {
            return i6;
        }
        int b5 = b(i4, i5, aVar, rectF);
        this.f7265j.put(length, b5);
        return b5;
    }
}
