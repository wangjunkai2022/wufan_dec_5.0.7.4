package com.flyco.tablayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.flyco.tablayout.R;
/* loaded from: classes3.dex */
public class MsgView extends TextView {

    /* renamed from: b  reason: collision with root package name */
    private Context f13010b;

    /* renamed from: c  reason: collision with root package name */
    private GradientDrawable f13011c;

    /* renamed from: d  reason: collision with root package name */
    private int f13012d;

    /* renamed from: e  reason: collision with root package name */
    private int f13013e;

    /* renamed from: f  reason: collision with root package name */
    private int f13014f;

    /* renamed from: g  reason: collision with root package name */
    private int f13015g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f13016h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f13017i;

    public MsgView(Context context) {
        this(context, null);
    }

    private void d(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MsgView);
        this.f13012d = obtainStyledAttributes.getColor(R.styleable.MsgView_mv_backgroundColor, 0);
        this.f13013e = obtainStyledAttributes.getDimensionPixelSize(R.styleable.MsgView_mv_cornerRadius, 0);
        this.f13014f = obtainStyledAttributes.getDimensionPixelSize(R.styleable.MsgView_mv_strokeWidth, 0);
        this.f13015g = obtainStyledAttributes.getColor(R.styleable.MsgView_mv_strokeColor, 0);
        this.f13016h = obtainStyledAttributes.getBoolean(R.styleable.MsgView_mv_isRadiusHalfHeight, false);
        this.f13017i = obtainStyledAttributes.getBoolean(R.styleable.MsgView_mv_isWidthHeightEqual, false);
        obtainStyledAttributes.recycle();
    }

    private void e(GradientDrawable gradientDrawable, int i4, int i5) {
        gradientDrawable.setColor(i4);
        gradientDrawable.setCornerRadius(this.f13013e);
        gradientDrawable.setStroke(this.f13014f, i5);
    }

    protected int a(float f5) {
        return (int) ((f5 * this.f13010b.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public boolean b() {
        return this.f13016h;
    }

    public boolean c() {
        return this.f13017i;
    }

    protected int f(float f5) {
        return (int) ((f5 * this.f13010b.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public int getBackgroundColor() {
        return this.f13012d;
    }

    public int getCornerRadius() {
        return this.f13013e;
    }

    public int getStrokeColor() {
        return this.f13015g;
    }

    public int getStrokeWidth() {
        return this.f13014f;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        if (b()) {
            setCornerRadius(getHeight() / 2);
        } else {
            setBgSelector();
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i4, int i5) {
        if (c() && getWidth() > 0 && getHeight() > 0) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(getWidth(), getHeight()), 1073741824);
            super.onMeasure(makeMeasureSpec, makeMeasureSpec);
            return;
        }
        super.onMeasure(i4, i5);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i4) {
        this.f13012d = i4;
        setBgSelector();
    }

    public void setBgSelector() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        e(this.f13011c, this.f13012d, this.f13015g);
        stateListDrawable.addState(new int[]{-16842919}, this.f13011c);
        if (Build.VERSION.SDK_INT >= 16) {
            setBackground(stateListDrawable);
        } else {
            setBackgroundDrawable(stateListDrawable);
        }
    }

    public void setCornerRadius(int i4) {
        this.f13013e = a(i4);
        setBgSelector();
    }

    public void setIsRadiusHalfHeight(boolean z4) {
        this.f13016h = z4;
        setBgSelector();
    }

    public void setIsWidthHeightEqual(boolean z4) {
        this.f13017i = z4;
        setBgSelector();
    }

    public void setStrokeColor(int i4) {
        this.f13015g = i4;
        setBgSelector();
    }

    public void setStrokeWidth(int i4) {
        this.f13014f = a(i4);
        setBgSelector();
    }

    public MsgView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MsgView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f13011c = new GradientDrawable();
        this.f13010b = context;
        d(context, attributeSet);
    }
}
