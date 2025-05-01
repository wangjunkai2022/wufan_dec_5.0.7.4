package com.join.mgps.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import java.lang.reflect.Array;
import java.util.regex.Pattern;
/* loaded from: classes4.dex */
public class MyTextView extends TextView {

    /* renamed from: b  reason: collision with root package name */
    private String f47440b;

    /* renamed from: c  reason: collision with root package name */
    private int f47441c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f47442d;

    /* renamed from: e  reason: collision with root package name */
    private int f47443e;

    /* renamed from: f  reason: collision with root package name */
    private int f47444f;

    /* renamed from: g  reason: collision with root package name */
    private int f47445g;

    /* renamed from: h  reason: collision with root package name */
    private int f47446h;

    /* renamed from: i  reason: collision with root package name */
    int f47447i;

    /* renamed from: j  reason: collision with root package name */
    int[][] f47448j;

    public MyTextView(Context context) {
        super(context);
        c();
    }

    public static int a(Context context, float f5) {
        return (int) ((f5 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void b(String str) {
        int i4;
        float f5;
        int i5;
        this.f47440b = str;
        int length = str.length();
        this.f47447i = length;
        this.f47448j = (int[][]) Array.newInstance(int.class, length, 2);
        int i6 = 1;
        int i7 = 0;
        for (int i8 = 0; i8 < this.f47447i; i8++) {
            String valueOf = String.valueOf(str.charAt(i8));
            Rect rect = new Rect();
            this.f47442d.getTextBounds(valueOf, 0, 1, rect);
            int width = rect.width();
            if (valueOf.equals("《") || valueOf.equals("（")) {
                width += this.f47446h * 2;
            }
            float f6 = width;
            int i9 = (int) (i7 + f6);
            if (i9 > this.f47441c) {
                i6++;
                i4 = 0;
            } else {
                i4 = (int) (i9 - f6);
            }
            int[][] iArr = this.f47448j;
            iArr[i8][0] = i4;
            iArr[i8][1] = (this.f47445g * i6) + (this.f47444f * (i6 - 1));
            if (d(valueOf)) {
                f5 = i4;
                i5 = this.f47446h;
            } else {
                f5 = i4;
                i5 = this.f47443e;
            }
            i7 = (int) (f5 + f6 + i5);
        }
        setHeight((this.f47445g + this.f47444f) * i6);
    }

    public void c() {
        Paint paint = new Paint();
        this.f47442d = paint;
        paint.setColor(Color.parseColor("#787878"));
        this.f47442d.setTypeface(Typeface.DEFAULT);
        this.f47442d.setTextSize(a(getContext(), 14.0f));
        Paint.FontMetrics fontMetrics = this.f47442d.getFontMetrics();
        this.f47445g = (int) (Math.ceil(fontMetrics.descent - fontMetrics.top) + 2.0d);
        this.f47443e = a(getContext(), 4.0f);
        this.f47444f = a(getContext(), 10.0f);
        this.f47446h = a(getContext(), 2.0f);
    }

    public boolean d(String str) {
        return Pattern.compile("^[A-Za-z0-9_]+$").matcher(str).matches();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (TextUtils.isEmpty(this.f47440b)) {
            return;
        }
        for (int i4 = 0; i4 < this.f47447i; i4++) {
            String valueOf = String.valueOf(this.f47440b.charAt(i4));
            int[][] iArr = this.f47448j;
            canvas.drawText(valueOf, iArr[i4][0], iArr[i4][1], this.f47442d);
        }
    }

    public void setText(String str) {
        this.f47441c = getWidth();
        b(str);
        invalidate();
    }

    public MyTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public MyTextView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        c();
    }
}
