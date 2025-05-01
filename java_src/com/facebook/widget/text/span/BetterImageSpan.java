package com.facebook.widget.text.span;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* loaded from: classes2.dex */
public class BetterImageSpan extends ReplacementSpan {

    /* renamed from: h  reason: collision with root package name */
    public static final int f12827h = 0;

    /* renamed from: i  reason: collision with root package name */
    public static final int f12828i = 1;

    /* renamed from: j  reason: collision with root package name */
    public static final int f12829j = 2;

    /* renamed from: b  reason: collision with root package name */
    private int f12830b;

    /* renamed from: c  reason: collision with root package name */
    private int f12831c;

    /* renamed from: d  reason: collision with root package name */
    private Rect f12832d;

    /* renamed from: e  reason: collision with root package name */
    private final int f12833e;

    /* renamed from: f  reason: collision with root package name */
    private final Paint.FontMetricsInt f12834f;

    /* renamed from: g  reason: collision with root package name */
    private final Drawable f12835g;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface BetterImageSpanAlignment {
    }

    public BetterImageSpan(Drawable drawable) {
        this(drawable, 1);
    }

    private int b(Paint.FontMetricsInt fontMetricsInt) {
        int i4 = this.f12833e;
        if (i4 != 0) {
            if (i4 != 2) {
                return -this.f12831c;
            }
            int i5 = fontMetricsInt.descent;
            int i6 = fontMetricsInt.ascent;
            return i6 + (((i5 - i6) - this.f12831c) / 2);
        }
        return fontMetricsInt.descent - this.f12831c;
    }

    public static final int c(int i4) {
        if (i4 != 0) {
            return i4 != 2 ? 1 : 2;
        }
        return 0;
    }

    public Drawable a() {
        return this.f12835g;
    }

    public void d() {
        Rect bounds = this.f12835g.getBounds();
        this.f12832d = bounds;
        this.f12830b = bounds.width();
        this.f12831c = this.f12832d.height();
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i4, int i5, float f5, int i6, int i7, int i8, Paint paint) {
        paint.getFontMetricsInt(this.f12834f);
        int b5 = i7 + b(this.f12834f);
        canvas.translate(f5, b5);
        this.f12835g.draw(canvas);
        canvas.translate(-f5, -b5);
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i4, int i5, Paint.FontMetricsInt fontMetricsInt) {
        d();
        if (fontMetricsInt == null) {
            return this.f12830b;
        }
        int b5 = b(fontMetricsInt);
        int i6 = this.f12831c + b5;
        if (b5 < fontMetricsInt.ascent) {
            fontMetricsInt.ascent = b5;
        }
        if (b5 < fontMetricsInt.top) {
            fontMetricsInt.top = b5;
        }
        if (i6 > fontMetricsInt.descent) {
            fontMetricsInt.descent = i6;
        }
        if (i6 > fontMetricsInt.bottom) {
            fontMetricsInt.bottom = i6;
        }
        return this.f12830b;
    }

    public BetterImageSpan(Drawable drawable, int i4) {
        this.f12834f = new Paint.FontMetricsInt();
        this.f12835g = drawable;
        this.f12833e = i4;
        d();
    }
}
