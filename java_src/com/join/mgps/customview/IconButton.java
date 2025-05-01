package com.join.mgps.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.Button;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes4.dex */
public class IconButton extends Button {

    /* renamed from: b  reason: collision with root package name */
    protected int f47208b;

    /* renamed from: c  reason: collision with root package name */
    protected DrawablePositions f47209c;

    /* renamed from: d  reason: collision with root package name */
    protected int f47210d;

    /* renamed from: e  reason: collision with root package name */
    Rect f47211e;

    /* loaded from: classes4.dex */
    private enum DrawablePositions {
        NONE,
        LEFT_AND_RIGHT,
        LEFT,
        RIGHT
    }

    /* loaded from: classes4.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f47212a;

        static {
            int[] iArr = new int[DrawablePositions.values().length];
            f47212a = iArr;
            try {
                iArr[DrawablePositions.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47212a[DrawablePositions.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47212a[DrawablePositions.LEFT_AND_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public IconButton(Context context) {
        super(context);
        this.f47211e = new Rect();
    }

    protected void a(AttributeSet attributeSet) {
        if (this.f47211e == null) {
            this.f47211e = new Rect();
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.IconButton);
        setIconPadding(obtainStyledAttributes.getDimensionPixelSize(0, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        paint.getTextBounds(charSequence, 0, charSequence.length(), this.f47211e);
        int width = this.f47208b + (this.f47210d * (this.f47209c == DrawablePositions.LEFT_AND_RIGHT ? 2 : 1)) + this.f47211e.width();
        double width2 = getWidth();
        Double.isNaN(width2);
        double d5 = width;
        Double.isNaN(d5);
        int i8 = (int) ((width2 / 2.0d) - (d5 / 2.0d));
        setCompoundDrawablePadding((-i8) + this.f47210d);
        int i9 = a.f47212a[this.f47209c.ordinal()];
        if (i9 == 1) {
            setPadding(i8, getPaddingTop(), 0, getPaddingBottom());
        } else if (i9 == 2) {
            setPadding(0, getPaddingTop(), i8, getPaddingBottom());
        } else if (i9 != 3) {
            setPadding(0, getPaddingTop(), 0, getPaddingBottom());
        } else {
            setPadding(i8, getPaddingTop(), i8, getPaddingBottom());
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        if (drawable != null && drawable3 != null) {
            this.f47208b = drawable.getIntrinsicWidth() + drawable3.getIntrinsicWidth();
            this.f47209c = DrawablePositions.LEFT_AND_RIGHT;
        } else if (drawable != null) {
            this.f47208b = drawable.getIntrinsicWidth();
            this.f47209c = DrawablePositions.LEFT;
        } else if (drawable3 != null) {
            this.f47208b = drawable3.getIntrinsicWidth();
            this.f47209c = DrawablePositions.RIGHT;
        } else {
            this.f47209c = DrawablePositions.NONE;
        }
        requestLayout();
    }

    public void setIconPadding(int i4) {
        this.f47210d = i4;
        requestLayout();
    }

    public IconButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47211e = new Rect();
        a(attributeSet);
    }

    public IconButton(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f47211e = new Rect();
        a(attributeSet);
    }
}
