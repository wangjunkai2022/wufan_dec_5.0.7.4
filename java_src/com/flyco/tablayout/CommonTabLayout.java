package com.flyco.tablayout;

import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.flyco.tablayout.widget.MsgView;
import java.util.ArrayList;
/* loaded from: classes3.dex */
public class CommonTabLayout extends FrameLayout implements ValueAnimator.AnimatorUpdateListener {
    private static final int D1 = 0;
    private static final int E1 = 1;
    private static final int F1 = 2;
    private static final int G1 = 0;
    private static final int H1 = 1;
    private static final int I1 = 2;
    private boolean A;
    private a1.b A1;
    private boolean B;
    private b B1;
    private int C;
    private b C1;
    private int D;
    private float E;
    private int F;
    private int G;
    private float H;
    private float I;
    private float J;
    private int K;
    private int L;
    private int M;
    private boolean N;
    private boolean O;
    private int P;
    private float Q;
    private float R;
    private float S;
    private int T;
    private ValueAnimator U;
    private OvershootInterpolator V;
    private b1.a W;

    /* renamed from: b  reason: collision with root package name */
    private Context f12909b;

    /* renamed from: c  reason: collision with root package name */
    private ArrayList<a1.a> f12910c;

    /* renamed from: d  reason: collision with root package name */
    private LinearLayout f12911d;

    /* renamed from: e  reason: collision with root package name */
    private int f12912e;

    /* renamed from: f  reason: collision with root package name */
    private int f12913f;

    /* renamed from: g  reason: collision with root package name */
    private int f12914g;

    /* renamed from: h  reason: collision with root package name */
    private Rect f12915h;

    /* renamed from: i  reason: collision with root package name */
    private GradientDrawable f12916i;

    /* renamed from: j  reason: collision with root package name */
    private Paint f12917j;

    /* renamed from: k  reason: collision with root package name */
    private Paint f12918k;

    /* renamed from: l  reason: collision with root package name */
    private Paint f12919l;

    /* renamed from: m  reason: collision with root package name */
    private Path f12920m;

    /* renamed from: n  reason: collision with root package name */
    private int f12921n;

    /* renamed from: o  reason: collision with root package name */
    private float f12922o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f12923p;

    /* renamed from: p0  reason: collision with root package name */
    private boolean f12924p0;

    /* renamed from: p1  reason: collision with root package name */
    private Paint f12925p1;

    /* renamed from: q  reason: collision with root package name */
    private float f12926q;

    /* renamed from: r  reason: collision with root package name */
    private int f12927r;

    /* renamed from: s  reason: collision with root package name */
    private float f12928s;

    /* renamed from: t  reason: collision with root package name */
    private float f12929t;

    /* renamed from: u  reason: collision with root package name */
    private float f12930u;

    /* renamed from: v  reason: collision with root package name */
    private float f12931v;

    /* renamed from: v1  reason: collision with root package name */
    private SparseArray<Boolean> f12932v1;

    /* renamed from: w  reason: collision with root package name */
    private float f12933w;

    /* renamed from: x  reason: collision with root package name */
    private float f12934x;

    /* renamed from: y  reason: collision with root package name */
    private float f12935y;

    /* renamed from: z  reason: collision with root package name */
    private long f12936z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int intValue = ((Integer) view.getTag()).intValue();
            if (CommonTabLayout.this.f12912e == intValue) {
                if (CommonTabLayout.this.A1 != null) {
                    CommonTabLayout.this.A1.onTabReselect(intValue);
                    return;
                }
                return;
            }
            CommonTabLayout.this.setCurrentTab(intValue);
            if (CommonTabLayout.this.A1 != null) {
                CommonTabLayout.this.A1.onTabSelect(intValue);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public float f12938a;

        /* renamed from: b  reason: collision with root package name */
        public float f12939b;

        b() {
        }
    }

    /* loaded from: classes3.dex */
    class c implements TypeEvaluator<b> {
        c() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public b evaluate(float f5, b bVar, b bVar2) {
            float f6 = bVar.f12938a;
            float f7 = bVar.f12939b;
            float f8 = f7 + (f5 * (bVar2.f12939b - f7));
            b bVar3 = new b();
            bVar3.f12938a = f6 + ((bVar2.f12938a - f6) * f5);
            bVar3.f12939b = f8;
            return bVar3;
        }
    }

    public CommonTabLayout(Context context) {
        this(context, null, 0);
    }

    private void c(int i4, View view) {
        ((TextView) view.findViewById(R.id.tv_tab_title)).setText(this.f12910c.get(i4).b());
        ((ImageView) view.findViewById(R.id.iv_tab_icon)).setImageResource(this.f12910c.get(i4).c());
        view.setOnClickListener(new a());
        LinearLayout.LayoutParams layoutParams = this.f12923p ? new LinearLayout.LayoutParams(0, -1, 1.0f) : new LinearLayout.LayoutParams(-2, -1);
        if (this.f12926q > 0.0f) {
            layoutParams = new LinearLayout.LayoutParams((int) this.f12926q, -1);
        }
        this.f12911d.addView(view, i4, layoutParams);
    }

    private void d() {
        View childAt = this.f12911d.getChildAt(this.f12912e);
        Rect rect = this.f12915h;
        rect.left = childAt.getLeft();
        rect.right = childAt.getRight();
        if (this.f12929t < 0.0f) {
            return;
        }
        float f5 = this.f12929t;
        float left = childAt.getLeft() + ((childAt.getWidth() - f5) / 2.0f);
        Rect rect2 = this.f12915h;
        int i4 = (int) left;
        rect2.left = i4;
        rect2.right = (int) (i4 + f5);
    }

    private void e() {
        View childAt = this.f12911d.getChildAt(this.f12912e);
        this.B1.f12938a = childAt.getLeft();
        this.B1.f12939b = childAt.getRight();
        View childAt2 = this.f12911d.getChildAt(this.f12913f);
        this.C1.f12938a = childAt2.getLeft();
        this.C1.f12939b = childAt2.getRight();
        b bVar = this.C1;
        float f5 = bVar.f12938a;
        b bVar2 = this.B1;
        if (f5 == bVar2.f12938a && bVar.f12939b == bVar2.f12939b) {
            invalidate();
            return;
        }
        this.U.setObjectValues(bVar, bVar2);
        if (this.B) {
            this.U.setInterpolator(this.V);
        }
        if (this.f12936z < 0) {
            this.f12936z = this.B ? 500L : 250L;
        }
        this.U.setDuration(this.f12936z);
        this.U.start();
    }

    private void q(Context context, AttributeSet attributeSet) {
        float f5;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CommonTabLayout);
        int i4 = obtainStyledAttributes.getInt(R.styleable.CommonTabLayout_tl_indicator_style, 0);
        this.f12921n = i4;
        this.f12927r = obtainStyledAttributes.getColor(R.styleable.CommonTabLayout_tl_indicator_color, Color.parseColor(i4 == 2 ? "#4B6A87" : "#ffffff"));
        int i5 = R.styleable.CommonTabLayout_tl_indicator_height;
        int i6 = this.f12921n;
        if (i6 == 1) {
            f5 = 4.0f;
        } else {
            f5 = i6 == 2 ? -1 : 2;
        }
        this.f12928s = obtainStyledAttributes.getDimension(i5, f(f5));
        this.f12929t = obtainStyledAttributes.getDimension(R.styleable.CommonTabLayout_tl_indicator_width, f(this.f12921n == 1 ? 10.0f : -1.0f));
        this.f12930u = obtainStyledAttributes.getDimension(R.styleable.CommonTabLayout_tl_indicator_corner_radius, f(this.f12921n == 2 ? -1.0f : 0.0f));
        this.f12931v = obtainStyledAttributes.getDimension(R.styleable.CommonTabLayout_tl_indicator_margin_left, f(0.0f));
        this.f12933w = obtainStyledAttributes.getDimension(R.styleable.CommonTabLayout_tl_indicator_margin_top, f(this.f12921n == 2 ? 7.0f : 0.0f));
        this.f12934x = obtainStyledAttributes.getDimension(R.styleable.CommonTabLayout_tl_indicator_margin_right, f(0.0f));
        this.f12935y = obtainStyledAttributes.getDimension(R.styleable.CommonTabLayout_tl_indicator_margin_bottom, f(this.f12921n != 2 ? 0.0f : 7.0f));
        this.A = obtainStyledAttributes.getBoolean(R.styleable.CommonTabLayout_tl_indicator_anim_enable, true);
        this.B = obtainStyledAttributes.getBoolean(R.styleable.CommonTabLayout_tl_indicator_bounce_enable, true);
        this.f12936z = obtainStyledAttributes.getInt(R.styleable.CommonTabLayout_tl_indicator_anim_duration, -1);
        this.C = obtainStyledAttributes.getInt(R.styleable.CommonTabLayout_tl_indicator_gravity, 80);
        this.D = obtainStyledAttributes.getColor(R.styleable.CommonTabLayout_tl_underline_color, Color.parseColor("#ffffff"));
        this.E = obtainStyledAttributes.getDimension(R.styleable.CommonTabLayout_tl_underline_height, f(0.0f));
        this.F = obtainStyledAttributes.getInt(R.styleable.CommonTabLayout_tl_underline_gravity, 80);
        this.G = obtainStyledAttributes.getColor(R.styleable.CommonTabLayout_tl_divider_color, Color.parseColor("#ffffff"));
        this.H = obtainStyledAttributes.getDimension(R.styleable.CommonTabLayout_tl_divider_width, f(0.0f));
        this.I = obtainStyledAttributes.getDimension(R.styleable.CommonTabLayout_tl_divider_padding, f(12.0f));
        this.J = obtainStyledAttributes.getDimension(R.styleable.CommonTabLayout_tl_textsize, t(13.0f));
        this.K = obtainStyledAttributes.getColor(R.styleable.CommonTabLayout_tl_textSelectColor, Color.parseColor("#ffffff"));
        this.L = obtainStyledAttributes.getColor(R.styleable.CommonTabLayout_tl_textUnselectColor, Color.parseColor("#AAffffff"));
        this.M = obtainStyledAttributes.getInt(R.styleable.CommonTabLayout_tl_textBold, 0);
        this.N = obtainStyledAttributes.getBoolean(R.styleable.CommonTabLayout_tl_textAllCaps, false);
        this.O = obtainStyledAttributes.getBoolean(R.styleable.CommonTabLayout_tl_iconVisible, true);
        this.P = obtainStyledAttributes.getInt(R.styleable.CommonTabLayout_tl_iconGravity, 48);
        this.Q = obtainStyledAttributes.getDimension(R.styleable.CommonTabLayout_tl_iconWidth, f(0.0f));
        this.R = obtainStyledAttributes.getDimension(R.styleable.CommonTabLayout_tl_iconHeight, f(0.0f));
        this.S = obtainStyledAttributes.getDimension(R.styleable.CommonTabLayout_tl_iconMargin, f(2.5f));
        this.f12923p = obtainStyledAttributes.getBoolean(R.styleable.CommonTabLayout_tl_tab_space_equal, true);
        float dimension = obtainStyledAttributes.getDimension(R.styleable.CommonTabLayout_tl_tab_width, f(-1.0f));
        this.f12926q = dimension;
        this.f12922o = obtainStyledAttributes.getDimension(R.styleable.CommonTabLayout_tl_tab_padding, (this.f12923p || dimension > 0.0f) ? f(0.0f) : f(10.0f));
        obtainStyledAttributes.recycle();
    }

    private void u(int i4) {
        int i5 = 0;
        while (i5 < this.f12914g) {
            View childAt = this.f12911d.getChildAt(i5);
            boolean z4 = i5 == i4;
            TextView textView = (TextView) childAt.findViewById(R.id.tv_tab_title);
            textView.setTextColor(z4 ? this.K : this.L);
            ImageView imageView = (ImageView) childAt.findViewById(R.id.iv_tab_icon);
            a1.a aVar = this.f12910c.get(i5);
            imageView.setImageResource(z4 ? aVar.a() : aVar.c());
            if (this.M == 1) {
                textView.getPaint().setFakeBoldText(z4);
            }
            i5++;
        }
    }

    private void v() {
        int i4 = 0;
        while (i4 < this.f12914g) {
            View childAt = this.f12911d.getChildAt(i4);
            float f5 = this.f12922o;
            childAt.setPadding((int) f5, 0, (int) f5, 0);
            TextView textView = (TextView) childAt.findViewById(R.id.tv_tab_title);
            textView.setTextColor(i4 == this.f12912e ? this.K : this.L);
            textView.setTextSize(0, this.J);
            if (this.N) {
                textView.setText(textView.getText().toString().toUpperCase());
            }
            int i5 = this.M;
            if (i5 == 2) {
                textView.getPaint().setFakeBoldText(true);
            } else if (i5 == 0) {
                textView.getPaint().setFakeBoldText(false);
            }
            ImageView imageView = (ImageView) childAt.findViewById(R.id.iv_tab_icon);
            if (this.O) {
                imageView.setVisibility(0);
                a1.a aVar = this.f12910c.get(i4);
                imageView.setImageResource(i4 == this.f12912e ? aVar.a() : aVar.c());
                float f6 = this.Q;
                int i6 = f6 <= 0.0f ? -2 : (int) f6;
                float f7 = this.R;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i6, f7 > 0.0f ? (int) f7 : -2);
                int i7 = this.P;
                if (i7 == 3) {
                    layoutParams.rightMargin = (int) this.S;
                } else if (i7 == 5) {
                    layoutParams.leftMargin = (int) this.S;
                } else if (i7 == 80) {
                    layoutParams.topMargin = (int) this.S;
                } else {
                    layoutParams.bottomMargin = (int) this.S;
                }
                imageView.setLayoutParams(layoutParams);
            } else {
                imageView.setVisibility(8);
            }
            i4++;
        }
    }

    protected int f(float f5) {
        return (int) ((f5 * this.f12909b.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public ImageView g(int i4) {
        return (ImageView) this.f12911d.getChildAt(i4).findViewById(R.id.iv_tab_icon);
    }

    public int getCurrentTab() {
        return this.f12912e;
    }

    public int getDividerColor() {
        return this.G;
    }

    public float getDividerPadding() {
        return this.I;
    }

    public float getDividerWidth() {
        return this.H;
    }

    public int getIconGravity() {
        return this.P;
    }

    public float getIconHeight() {
        return this.R;
    }

    public float getIconMargin() {
        return this.S;
    }

    public float getIconWidth() {
        return this.Q;
    }

    public long getIndicatorAnimDuration() {
        return this.f12936z;
    }

    public int getIndicatorColor() {
        return this.f12927r;
    }

    public float getIndicatorCornerRadius() {
        return this.f12930u;
    }

    public float getIndicatorHeight() {
        return this.f12928s;
    }

    public float getIndicatorMarginBottom() {
        return this.f12935y;
    }

    public float getIndicatorMarginLeft() {
        return this.f12931v;
    }

    public float getIndicatorMarginRight() {
        return this.f12934x;
    }

    public float getIndicatorMarginTop() {
        return this.f12933w;
    }

    public int getIndicatorStyle() {
        return this.f12921n;
    }

    public float getIndicatorWidth() {
        return this.f12929t;
    }

    public int getTabCount() {
        return this.f12914g;
    }

    public float getTabPadding() {
        return this.f12922o;
    }

    public float getTabWidth() {
        return this.f12926q;
    }

    public int getTextBold() {
        return this.M;
    }

    public int getTextSelectColor() {
        return this.K;
    }

    public int getTextUnselectColor() {
        return this.L;
    }

    public float getTextsize() {
        return this.J;
    }

    public int getUnderlineColor() {
        return this.D;
    }

    public float getUnderlineHeight() {
        return this.E;
    }

    public MsgView h(int i4) {
        int i5 = this.f12914g;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        return (MsgView) this.f12911d.getChildAt(i4).findViewById(R.id.rtv_msg_tip);
    }

    public TextView i(int i4) {
        return (TextView) this.f12911d.getChildAt(i4).findViewById(R.id.tv_tab_title);
    }

    public void j(int i4) {
        int i5 = this.f12914g;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        MsgView msgView = (MsgView) this.f12911d.getChildAt(i4).findViewById(R.id.rtv_msg_tip);
        if (msgView != null) {
            msgView.setVisibility(8);
        }
    }

    public boolean k() {
        return this.O;
    }

    public boolean l() {
        return this.A;
    }

    public boolean m() {
        return this.B;
    }

    public boolean n() {
        return this.f12923p;
    }

    public boolean o() {
        return this.N;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        View childAt = this.f12911d.getChildAt(this.f12912e);
        b bVar = (b) valueAnimator.getAnimatedValue();
        Rect rect = this.f12915h;
        float f5 = bVar.f12938a;
        rect.left = (int) f5;
        rect.right = (int) bVar.f12939b;
        if (this.f12929t >= 0.0f) {
            float f6 = this.f12929t;
            float width = f5 + ((childAt.getWidth() - f6) / 2.0f);
            Rect rect2 = this.f12915h;
            int i4 = (int) width;
            rect2.left = i4;
            rect2.right = (int) (i4 + f6);
        }
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Rect rect;
        super.onDraw(canvas);
        if (isInEditMode() || this.f12914g <= 0) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        float f5 = this.H;
        if (f5 > 0.0f) {
            this.f12918k.setStrokeWidth(f5);
            this.f12918k.setColor(this.G);
            for (int i4 = 0; i4 < this.f12914g - 1; i4++) {
                View childAt = this.f12911d.getChildAt(i4);
                canvas.drawLine(childAt.getRight() + paddingLeft, this.I, childAt.getRight() + paddingLeft, height - this.I, this.f12918k);
            }
        }
        if (this.E > 0.0f) {
            this.f12917j.setColor(this.D);
            if (this.F == 80) {
                float f6 = height;
                canvas.drawRect(paddingLeft, f6 - this.E, this.f12911d.getWidth() + paddingLeft, f6, this.f12917j);
            } else {
                canvas.drawRect(paddingLeft, 0.0f, this.f12911d.getWidth() + paddingLeft, this.E, this.f12917j);
            }
        }
        if (this.A) {
            if (this.f12924p0) {
                this.f12924p0 = false;
                d();
            }
        } else {
            d();
        }
        int i5 = this.f12921n;
        if (i5 == 1) {
            if (this.f12928s > 0.0f) {
                this.f12919l.setColor(this.f12927r);
                this.f12920m.reset();
                float f7 = height;
                this.f12920m.moveTo(this.f12915h.left + paddingLeft, f7);
                Path path = this.f12920m;
                Rect rect2 = this.f12915h;
                path.lineTo((rect2.left / 2) + paddingLeft + (rect2.right / 2), f7 - this.f12928s);
                this.f12920m.lineTo(paddingLeft + this.f12915h.right, f7);
                this.f12920m.close();
                canvas.drawPath(this.f12920m, this.f12919l);
            }
        } else if (i5 == 2) {
            if (this.f12928s < 0.0f) {
                this.f12928s = (height - this.f12933w) - this.f12935y;
            }
            float f8 = this.f12928s;
            if (f8 > 0.0f) {
                float f9 = this.f12930u;
                if (f9 < 0.0f || f9 > f8 / 2.0f) {
                    this.f12930u = f8 / 2.0f;
                }
                this.f12916i.setColor(this.f12927r);
                GradientDrawable gradientDrawable = this.f12916i;
                int i6 = ((int) this.f12931v) + paddingLeft + this.f12915h.left;
                float f10 = this.f12933w;
                gradientDrawable.setBounds(i6, (int) f10, (int) ((paddingLeft + rect.right) - this.f12934x), (int) (f10 + this.f12928s));
                this.f12916i.setCornerRadius(this.f12930u);
                this.f12916i.draw(canvas);
            }
        } else if (this.f12928s > 0.0f) {
            this.f12916i.setColor(this.f12927r);
            if (this.C == 80) {
                GradientDrawable gradientDrawable2 = this.f12916i;
                Rect rect3 = this.f12915h;
                float f11 = this.f12935y;
                gradientDrawable2.setBounds(((int) this.f12931v) + paddingLeft + rect3.left, (height - ((int) this.f12928s)) - ((int) f11), (paddingLeft + rect3.right) - ((int) this.f12934x), height - ((int) f11));
            } else {
                GradientDrawable gradientDrawable3 = this.f12916i;
                Rect rect4 = this.f12915h;
                int i7 = ((int) this.f12931v) + paddingLeft + rect4.left;
                float f12 = this.f12933w;
                gradientDrawable3.setBounds(i7, (int) f12, (paddingLeft + rect4.right) - ((int) this.f12934x), ((int) this.f12928s) + ((int) f12));
            }
            this.f12916i.setCornerRadius(this.f12930u);
            this.f12916i.draw(canvas);
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f12912e = bundle.getInt("mCurrentTab");
            parcelable = bundle.getParcelable("instanceState");
            if (this.f12912e != 0 && this.f12911d.getChildCount() > 0) {
                u(this.f12912e);
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("mCurrentTab", this.f12912e);
        return bundle;
    }

    public void p() {
        View inflate;
        this.f12911d.removeAllViews();
        this.f12914g = this.f12910c.size();
        for (int i4 = 0; i4 < this.f12914g; i4++) {
            int i5 = this.P;
            if (i5 == 3) {
                inflate = View.inflate(this.f12909b, R.layout.layout_tab_left, null);
            } else if (i5 == 5) {
                inflate = View.inflate(this.f12909b, R.layout.layout_tab_right, null);
            } else if (i5 == 80) {
                inflate = View.inflate(this.f12909b, R.layout.layout_tab_bottom, null);
            } else {
                inflate = View.inflate(this.f12909b, R.layout.layout_tab_top, null);
            }
            inflate.setTag(Integer.valueOf(i4));
            c(i4, inflate);
        }
        v();
    }

    public void r(int i4) {
        int i5 = this.f12914g;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        s(i4, 0);
    }

    public void s(int i4, int i5) {
        int i6 = this.f12914g;
        if (i4 >= i6) {
            i4 = i6 - 1;
        }
        MsgView msgView = (MsgView) this.f12911d.getChildAt(i4).findViewById(R.id.rtv_msg_tip);
        if (msgView != null) {
            b1.b.b(msgView, i5);
            if (this.f12932v1.get(i4) == null || !this.f12932v1.get(i4).booleanValue()) {
                if (!this.O) {
                    setMsgMargin(i4, 2.0f, 2.0f);
                } else {
                    int i7 = this.P;
                    setMsgMargin(i4, 0.0f, (i7 == 3 || i7 == 5) ? 4.0f : 0.0f);
                }
                this.f12932v1.put(i4, Boolean.TRUE);
            }
        }
    }

    public void setCurrentTab(int i4) {
        this.f12913f = this.f12912e;
        this.f12912e = i4;
        u(i4);
        b1.a aVar = this.W;
        if (aVar != null) {
            aVar.d(i4);
        }
        if (this.A) {
            e();
        } else {
            invalidate();
        }
    }

    public void setDividerColor(int i4) {
        this.G = i4;
        invalidate();
    }

    public void setDividerPadding(float f5) {
        this.I = f(f5);
        invalidate();
    }

    public void setDividerWidth(float f5) {
        this.H = f(f5);
        invalidate();
    }

    public void setIconGravity(int i4) {
        this.P = i4;
        p();
    }

    public void setIconHeight(float f5) {
        this.R = f(f5);
        v();
    }

    public void setIconMargin(float f5) {
        this.S = f(f5);
        v();
    }

    public void setIconVisible(boolean z4) {
        this.O = z4;
        v();
    }

    public void setIconWidth(float f5) {
        this.Q = f(f5);
        v();
    }

    public void setIndicatorAnimDuration(long j4) {
        this.f12936z = j4;
    }

    public void setIndicatorAnimEnable(boolean z4) {
        this.A = z4;
    }

    public void setIndicatorBounceEnable(boolean z4) {
        this.B = z4;
    }

    public void setIndicatorColor(int i4) {
        this.f12927r = i4;
        invalidate();
    }

    public void setIndicatorCornerRadius(float f5) {
        this.f12930u = f(f5);
        invalidate();
    }

    public void setIndicatorGravity(int i4) {
        this.C = i4;
        invalidate();
    }

    public void setIndicatorHeight(float f5) {
        this.f12928s = f(f5);
        invalidate();
    }

    public void setIndicatorMargin(float f5, float f6, float f7, float f8) {
        this.f12931v = f(f5);
        this.f12933w = f(f6);
        this.f12934x = f(f7);
        this.f12935y = f(f8);
        invalidate();
    }

    public void setIndicatorStyle(int i4) {
        this.f12921n = i4;
        invalidate();
    }

    public void setIndicatorWidth(float f5) {
        this.f12929t = f(f5);
        invalidate();
    }

    public void setMsgMargin(int i4, float f5, float f6) {
        int i5 = this.f12914g;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        View childAt = this.f12911d.getChildAt(i4);
        MsgView msgView = (MsgView) childAt.findViewById(R.id.rtv_msg_tip);
        if (msgView != null) {
            this.f12925p1.setTextSize(this.J);
            this.f12925p1.measureText(((TextView) childAt.findViewById(R.id.tv_tab_title)).getText().toString());
            float descent = this.f12925p1.descent() - this.f12925p1.ascent();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) msgView.getLayoutParams();
            float f7 = this.R;
            float f8 = 0.0f;
            if (this.O) {
                if (f7 <= 0.0f) {
                    f7 = this.f12909b.getResources().getDrawable(this.f12910c.get(i4).a()).getIntrinsicHeight();
                }
                f8 = this.S;
            }
            int i6 = this.P;
            if (i6 != 48 && i6 != 80) {
                marginLayoutParams.leftMargin = f(f5);
                int i7 = this.T;
                marginLayoutParams.topMargin = i7 > 0 ? (((int) (i7 - Math.max(descent, f7))) / 2) - f(f6) : f(f6);
            } else {
                marginLayoutParams.leftMargin = f(f5);
                int i8 = this.T;
                marginLayoutParams.topMargin = i8 > 0 ? (((int) (((i8 - descent) - f7) - f8)) / 2) - f(f6) : f(f6);
            }
            msgView.setLayoutParams(marginLayoutParams);
        }
    }

    public void setOnTabSelectListener(a1.b bVar) {
        this.A1 = bVar;
    }

    public void setTabData(ArrayList<a1.a> arrayList) {
        if (arrayList != null && arrayList.size() != 0) {
            this.f12910c.clear();
            this.f12910c.addAll(arrayList);
            p();
            return;
        }
        throw new IllegalStateException("TabEntitys can not be NULL or EMPTY !");
    }

    public void setTabPadding(float f5) {
        this.f12922o = f(f5);
        v();
    }

    public void setTabSpaceEqual(boolean z4) {
        this.f12923p = z4;
        v();
    }

    public void setTabWidth(float f5) {
        this.f12926q = f(f5);
        v();
    }

    public void setTextAllCaps(boolean z4) {
        this.N = z4;
        v();
    }

    public void setTextBold(int i4) {
        this.M = i4;
        v();
    }

    public void setTextSelectColor(int i4) {
        this.K = i4;
        v();
    }

    public void setTextUnselectColor(int i4) {
        this.L = i4;
        v();
    }

    public void setTextsize(float f5) {
        this.J = t(f5);
        v();
    }

    public void setUnderlineColor(int i4) {
        this.D = i4;
        invalidate();
    }

    public void setUnderlineGravity(int i4) {
        this.F = i4;
        invalidate();
    }

    public void setUnderlineHeight(float f5) {
        this.E = f(f5);
        invalidate();
    }

    protected int t(float f5) {
        return (int) ((f5 * this.f12909b.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public CommonTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CommonTabLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f12910c = new ArrayList<>();
        this.f12915h = new Rect();
        this.f12916i = new GradientDrawable();
        this.f12917j = new Paint(1);
        this.f12918k = new Paint(1);
        this.f12919l = new Paint(1);
        this.f12920m = new Path();
        this.f12921n = 0;
        this.V = new OvershootInterpolator(1.5f);
        this.f12924p0 = true;
        this.f12925p1 = new Paint(1);
        this.f12932v1 = new SparseArray<>();
        this.B1 = new b();
        this.C1 = new b();
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
        this.f12909b = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f12911d = linearLayout;
        addView(linearLayout);
        q(context, attributeSet);
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "layout_height");
        if (!attributeValue.equals("-1") && !attributeValue.equals("-2")) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842997});
            this.T = obtainStyledAttributes.getDimensionPixelSize(0, -2);
            obtainStyledAttributes.recycle();
        }
        ValueAnimator ofObject = ValueAnimator.ofObject(new c(), this.C1, this.B1);
        this.U = ofObject;
        ofObject.addUpdateListener(this);
    }

    public void setTabData(ArrayList<a1.a> arrayList, FragmentActivity fragmentActivity, int i4, ArrayList<Fragment> arrayList2) {
        this.W = new b1.a(fragmentActivity.getSupportFragmentManager(), i4, arrayList2);
        setTabData(arrayList);
    }
}
