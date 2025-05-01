package com.flyco.tablayout;

import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
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
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.flyco.tablayout.widget.MsgView;
import java.util.ArrayList;
/* loaded from: classes3.dex */
public class SegmentTabLayout extends FrameLayout implements ValueAnimator.AnimatorUpdateListener {
    private static final int U = 0;
    private static final int V = 1;
    private static final int W = 2;
    private float A;
    private float B;
    private int C;
    private int D;
    private int E;
    private boolean F;
    private int G;
    private int H;
    private float I;
    private int J;
    private ValueAnimator K;
    private OvershootInterpolator L;
    private b1.a M;
    private float[] N;
    private boolean O;
    private Paint P;
    private SparseArray<Boolean> Q;
    private a1.b R;
    private b S;
    private b T;

    /* renamed from: b  reason: collision with root package name */
    private Context f12942b;

    /* renamed from: c  reason: collision with root package name */
    private String[] f12943c;

    /* renamed from: d  reason: collision with root package name */
    private LinearLayout f12944d;

    /* renamed from: e  reason: collision with root package name */
    private int f12945e;

    /* renamed from: f  reason: collision with root package name */
    private int f12946f;

    /* renamed from: g  reason: collision with root package name */
    private int f12947g;

    /* renamed from: h  reason: collision with root package name */
    private Rect f12948h;

    /* renamed from: i  reason: collision with root package name */
    private GradientDrawable f12949i;

    /* renamed from: j  reason: collision with root package name */
    private GradientDrawable f12950j;

    /* renamed from: k  reason: collision with root package name */
    private Paint f12951k;

    /* renamed from: l  reason: collision with root package name */
    private float f12952l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f12953m;

    /* renamed from: n  reason: collision with root package name */
    private float f12954n;

    /* renamed from: o  reason: collision with root package name */
    private int f12955o;

    /* renamed from: p  reason: collision with root package name */
    private float f12956p;

    /* renamed from: q  reason: collision with root package name */
    private float f12957q;

    /* renamed from: r  reason: collision with root package name */
    private float f12958r;

    /* renamed from: s  reason: collision with root package name */
    private float f12959s;

    /* renamed from: t  reason: collision with root package name */
    private float f12960t;

    /* renamed from: u  reason: collision with root package name */
    private float f12961u;

    /* renamed from: v  reason: collision with root package name */
    private long f12962v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f12963w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f12964x;

    /* renamed from: y  reason: collision with root package name */
    private int f12965y;

    /* renamed from: z  reason: collision with root package name */
    private float f12966z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int intValue = ((Integer) view.getTag()).intValue();
            if (SegmentTabLayout.this.f12945e == intValue) {
                if (SegmentTabLayout.this.R != null) {
                    SegmentTabLayout.this.R.onTabReselect(intValue);
                    return;
                }
                return;
            }
            SegmentTabLayout.this.setCurrentTab(intValue);
            if (SegmentTabLayout.this.R != null) {
                SegmentTabLayout.this.R.onTabSelect(intValue);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public float f12968a;

        /* renamed from: b  reason: collision with root package name */
        public float f12969b;

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
            float f6 = bVar.f12968a;
            float f7 = bVar.f12969b;
            float f8 = f7 + (f5 * (bVar2.f12969b - f7));
            b bVar3 = new b();
            bVar3.f12968a = f6 + ((bVar2.f12968a - f6) * f5);
            bVar3.f12969b = f8;
            return bVar3;
        }
    }

    public SegmentTabLayout(Context context) {
        this(context, null, 0);
    }

    private void c(int i4, View view) {
        ((TextView) view.findViewById(R.id.tv_tab_title)).setText(this.f12943c[i4]);
        view.setOnClickListener(new a());
        LinearLayout.LayoutParams layoutParams = this.f12953m ? new LinearLayout.LayoutParams(0, -1, 1.0f) : new LinearLayout.LayoutParams(-2, -1);
        if (this.f12954n > 0.0f) {
            layoutParams = new LinearLayout.LayoutParams((int) this.f12954n, -1);
        }
        this.f12944d.addView(view, i4, layoutParams);
    }

    private void d() {
        View childAt = this.f12944d.getChildAt(this.f12945e);
        Rect rect = this.f12948h;
        rect.left = childAt.getLeft();
        rect.right = childAt.getRight();
        if (!this.f12963w) {
            int i4 = this.f12945e;
            if (i4 == 0) {
                float[] fArr = this.N;
                float f5 = this.f12957q;
                fArr[0] = f5;
                fArr[1] = f5;
                fArr[2] = 0.0f;
                fArr[3] = 0.0f;
                fArr[4] = 0.0f;
                fArr[5] = 0.0f;
                fArr[6] = f5;
                fArr[7] = f5;
                return;
            } else if (i4 == this.f12947g - 1) {
                float[] fArr2 = this.N;
                fArr2[0] = 0.0f;
                fArr2[1] = 0.0f;
                float f6 = this.f12957q;
                fArr2[2] = f6;
                fArr2[3] = f6;
                fArr2[4] = f6;
                fArr2[5] = f6;
                fArr2[6] = 0.0f;
                fArr2[7] = 0.0f;
                return;
            } else {
                float[] fArr3 = this.N;
                fArr3[0] = 0.0f;
                fArr3[1] = 0.0f;
                fArr3[2] = 0.0f;
                fArr3[3] = 0.0f;
                fArr3[4] = 0.0f;
                fArr3[5] = 0.0f;
                fArr3[6] = 0.0f;
                fArr3[7] = 0.0f;
                return;
            }
        }
        float[] fArr4 = this.N;
        float f7 = this.f12957q;
        fArr4[0] = f7;
        fArr4[1] = f7;
        fArr4[2] = f7;
        fArr4[3] = f7;
        fArr4[4] = f7;
        fArr4[5] = f7;
        fArr4[6] = f7;
        fArr4[7] = f7;
    }

    private void e() {
        View childAt = this.f12944d.getChildAt(this.f12945e);
        this.S.f12968a = childAt.getLeft();
        this.S.f12969b = childAt.getRight();
        View childAt2 = this.f12944d.getChildAt(this.f12946f);
        this.T.f12968a = childAt2.getLeft();
        this.T.f12969b = childAt2.getRight();
        b bVar = this.T;
        float f5 = bVar.f12968a;
        b bVar2 = this.S;
        if (f5 == bVar2.f12968a && bVar.f12969b == bVar2.f12969b) {
            invalidate();
            return;
        }
        this.K.setObjectValues(bVar, bVar2);
        if (this.f12964x) {
            this.K.setInterpolator(this.L);
        }
        if (this.f12962v < 0) {
            this.f12962v = this.f12964x ? 500L : 250L;
        }
        this.K.setDuration(this.f12962v);
        this.K.start();
    }

    private void o(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SegmentTabLayout);
        this.f12955o = obtainStyledAttributes.getColor(R.styleable.SegmentTabLayout_tl_indicator_color, Color.parseColor("#222831"));
        this.f12956p = obtainStyledAttributes.getDimension(R.styleable.SegmentTabLayout_tl_indicator_height, -1.0f);
        this.f12957q = obtainStyledAttributes.getDimension(R.styleable.SegmentTabLayout_tl_indicator_corner_radius, -1.0f);
        this.f12958r = obtainStyledAttributes.getDimension(R.styleable.SegmentTabLayout_tl_indicator_margin_left, f(0.0f));
        this.f12959s = obtainStyledAttributes.getDimension(R.styleable.SegmentTabLayout_tl_indicator_margin_top, 0.0f);
        this.f12960t = obtainStyledAttributes.getDimension(R.styleable.SegmentTabLayout_tl_indicator_margin_right, f(0.0f));
        this.f12961u = obtainStyledAttributes.getDimension(R.styleable.SegmentTabLayout_tl_indicator_margin_bottom, 0.0f);
        this.f12963w = obtainStyledAttributes.getBoolean(R.styleable.SegmentTabLayout_tl_indicator_anim_enable, false);
        this.f12964x = obtainStyledAttributes.getBoolean(R.styleable.SegmentTabLayout_tl_indicator_bounce_enable, true);
        this.f12962v = obtainStyledAttributes.getInt(R.styleable.SegmentTabLayout_tl_indicator_anim_duration, -1);
        this.f12965y = obtainStyledAttributes.getColor(R.styleable.SegmentTabLayout_tl_divider_color, this.f12955o);
        this.f12966z = obtainStyledAttributes.getDimension(R.styleable.SegmentTabLayout_tl_divider_width, f(1.0f));
        this.A = obtainStyledAttributes.getDimension(R.styleable.SegmentTabLayout_tl_divider_padding, 0.0f);
        this.B = obtainStyledAttributes.getDimension(R.styleable.SegmentTabLayout_tl_textsize, r(13.0f));
        this.C = obtainStyledAttributes.getColor(R.styleable.SegmentTabLayout_tl_textSelectColor, Color.parseColor("#ffffff"));
        this.D = obtainStyledAttributes.getColor(R.styleable.SegmentTabLayout_tl_textUnselectColor, this.f12955o);
        this.E = obtainStyledAttributes.getInt(R.styleable.SegmentTabLayout_tl_textBold, 0);
        this.F = obtainStyledAttributes.getBoolean(R.styleable.SegmentTabLayout_tl_textAllCaps, false);
        this.f12953m = obtainStyledAttributes.getBoolean(R.styleable.SegmentTabLayout_tl_tab_space_equal, true);
        float dimension = obtainStyledAttributes.getDimension(R.styleable.SegmentTabLayout_tl_tab_width, f(-1.0f));
        this.f12954n = dimension;
        this.f12952l = obtainStyledAttributes.getDimension(R.styleable.SegmentTabLayout_tl_tab_padding, (this.f12953m || dimension > 0.0f) ? f(0.0f) : f(10.0f));
        this.G = obtainStyledAttributes.getColor(R.styleable.SegmentTabLayout_tl_bar_color, 0);
        this.H = obtainStyledAttributes.getColor(R.styleable.SegmentTabLayout_tl_bar_stroke_color, this.f12955o);
        this.I = obtainStyledAttributes.getDimension(R.styleable.SegmentTabLayout_tl_bar_stroke_width, f(1.0f));
        obtainStyledAttributes.recycle();
    }

    private void s(int i4) {
        int i5 = 0;
        while (i5 < this.f12947g) {
            View childAt = this.f12944d.getChildAt(i5);
            boolean z4 = i5 == i4;
            TextView textView = (TextView) childAt.findViewById(R.id.tv_tab_title);
            textView.setTextColor(z4 ? this.C : this.D);
            if (this.E == 1) {
                textView.getPaint().setFakeBoldText(z4);
            }
            i5++;
        }
    }

    private void t() {
        int i4 = 0;
        while (i4 < this.f12947g) {
            View childAt = this.f12944d.getChildAt(i4);
            float f5 = this.f12952l;
            childAt.setPadding((int) f5, 0, (int) f5, 0);
            TextView textView = (TextView) childAt.findViewById(R.id.tv_tab_title);
            textView.setTextColor(i4 == this.f12945e ? this.C : this.D);
            textView.setTextSize(0, this.B);
            if (this.F) {
                textView.setText(textView.getText().toString().toUpperCase());
            }
            int i5 = this.E;
            if (i5 == 2) {
                textView.getPaint().setFakeBoldText(true);
            } else if (i5 == 0) {
                textView.getPaint().setFakeBoldText(false);
            }
            i4++;
        }
    }

    protected int f(float f5) {
        return (int) ((f5 * this.f12942b.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public MsgView g(int i4) {
        int i5 = this.f12947g;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        return (MsgView) this.f12944d.getChildAt(i4).findViewById(R.id.rtv_msg_tip);
    }

    public int getCurrentTab() {
        return this.f12945e;
    }

    public int getDividerColor() {
        return this.f12965y;
    }

    public float getDividerPadding() {
        return this.A;
    }

    public float getDividerWidth() {
        return this.f12966z;
    }

    public long getIndicatorAnimDuration() {
        return this.f12962v;
    }

    public int getIndicatorColor() {
        return this.f12955o;
    }

    public float getIndicatorCornerRadius() {
        return this.f12957q;
    }

    public float getIndicatorHeight() {
        return this.f12956p;
    }

    public float getIndicatorMarginBottom() {
        return this.f12961u;
    }

    public float getIndicatorMarginLeft() {
        return this.f12958r;
    }

    public float getIndicatorMarginRight() {
        return this.f12960t;
    }

    public float getIndicatorMarginTop() {
        return this.f12959s;
    }

    public int getTabCount() {
        return this.f12947g;
    }

    public float getTabPadding() {
        return this.f12952l;
    }

    public float getTabWidth() {
        return this.f12954n;
    }

    public int getTextBold() {
        return this.E;
    }

    public int getTextSelectColor() {
        return this.C;
    }

    public int getTextUnselectColor() {
        return this.D;
    }

    public float getTextsize() {
        return this.B;
    }

    public TextView h(int i4) {
        return (TextView) this.f12944d.getChildAt(i4).findViewById(R.id.tv_tab_title);
    }

    public void i(int i4) {
        int i5 = this.f12947g;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        MsgView msgView = (MsgView) this.f12944d.getChildAt(i4).findViewById(R.id.rtv_msg_tip);
        if (msgView != null) {
            msgView.setVisibility(8);
        }
    }

    public boolean j() {
        return this.f12963w;
    }

    public boolean k() {
        return this.f12964x;
    }

    public boolean l() {
        return this.f12953m;
    }

    public boolean m() {
        return this.F;
    }

    public void n() {
        this.f12944d.removeAllViews();
        this.f12947g = this.f12943c.length;
        for (int i4 = 0; i4 < this.f12947g; i4++) {
            View inflate = View.inflate(this.f12942b, R.layout.layout_tab_segment, null);
            inflate.setTag(Integer.valueOf(i4));
            c(i4, inflate);
        }
        t();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        b bVar = (b) valueAnimator.getAnimatedValue();
        Rect rect = this.f12948h;
        rect.left = (int) bVar.f12968a;
        rect.right = (int) bVar.f12969b;
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isInEditMode() || this.f12947g <= 0) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        if (this.f12956p < 0.0f) {
            this.f12956p = (height - this.f12959s) - this.f12961u;
        }
        float f5 = this.f12957q;
        if (f5 < 0.0f || f5 > this.f12956p / 2.0f) {
            this.f12957q = this.f12956p / 2.0f;
        }
        this.f12950j.setColor(this.G);
        this.f12950j.setStroke((int) this.I, this.H);
        this.f12950j.setCornerRadius(this.f12957q);
        this.f12950j.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        this.f12950j.draw(canvas);
        if (!this.f12963w) {
            float f6 = this.f12966z;
            if (f6 > 0.0f) {
                this.f12951k.setStrokeWidth(f6);
                this.f12951k.setColor(this.f12965y);
                for (int i4 = 0; i4 < this.f12947g - 1; i4++) {
                    View childAt = this.f12944d.getChildAt(i4);
                    canvas.drawLine(childAt.getRight() + paddingLeft, this.A, childAt.getRight() + paddingLeft, height - this.A, this.f12951k);
                }
            }
        }
        if (this.f12963w) {
            if (this.O) {
                this.O = false;
                d();
            }
        } else {
            d();
        }
        this.f12949i.setColor(this.f12955o);
        GradientDrawable gradientDrawable = this.f12949i;
        Rect rect = this.f12948h;
        int i5 = ((int) this.f12958r) + paddingLeft + rect.left;
        float f7 = this.f12959s;
        gradientDrawable.setBounds(i5, (int) f7, (int) ((paddingLeft + rect.right) - this.f12960t), (int) (f7 + this.f12956p));
        this.f12949i.setCornerRadii(this.N);
        this.f12949i.draw(canvas);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f12945e = bundle.getInt("mCurrentTab");
            parcelable = bundle.getParcelable("instanceState");
            if (this.f12945e != 0 && this.f12944d.getChildCount() > 0) {
                s(this.f12945e);
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("mCurrentTab", this.f12945e);
        return bundle;
    }

    public void p(int i4) {
        int i5 = this.f12947g;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        q(i4, 0);
    }

    public void q(int i4, int i5) {
        int i6 = this.f12947g;
        if (i4 >= i6) {
            i4 = i6 - 1;
        }
        MsgView msgView = (MsgView) this.f12944d.getChildAt(i4).findViewById(R.id.rtv_msg_tip);
        if (msgView != null) {
            b1.b.b(msgView, i5);
            if (this.Q.get(i4) == null || !this.Q.get(i4).booleanValue()) {
                setMsgMargin(i4, 2.0f, 2.0f);
                this.Q.put(i4, Boolean.TRUE);
            }
        }
    }

    protected int r(float f5) {
        return (int) ((f5 * this.f12942b.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public void setCurrentTab(int i4) {
        this.f12946f = this.f12945e;
        this.f12945e = i4;
        s(i4);
        b1.a aVar = this.M;
        if (aVar != null) {
            aVar.d(i4);
        }
        if (this.f12963w) {
            e();
        } else {
            invalidate();
        }
    }

    public void setDividerColor(int i4) {
        this.f12965y = i4;
        invalidate();
    }

    public void setDividerPadding(float f5) {
        this.A = f(f5);
        invalidate();
    }

    public void setDividerWidth(float f5) {
        this.f12966z = f(f5);
        invalidate();
    }

    public void setIndicatorAnimDuration(long j4) {
        this.f12962v = j4;
    }

    public void setIndicatorAnimEnable(boolean z4) {
        this.f12963w = z4;
    }

    public void setIndicatorBounceEnable(boolean z4) {
        this.f12964x = z4;
    }

    public void setIndicatorColor(int i4) {
        this.f12955o = i4;
        invalidate();
    }

    public void setIndicatorCornerRadius(float f5) {
        this.f12957q = f(f5);
        invalidate();
    }

    public void setIndicatorHeight(float f5) {
        this.f12956p = f(f5);
        invalidate();
    }

    public void setIndicatorMargin(float f5, float f6, float f7, float f8) {
        this.f12958r = f(f5);
        this.f12959s = f(f6);
        this.f12960t = f(f7);
        this.f12961u = f(f8);
        invalidate();
    }

    public void setMsgMargin(int i4, float f5, float f6) {
        int i5 = this.f12947g;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        View childAt = this.f12944d.getChildAt(i4);
        MsgView msgView = (MsgView) childAt.findViewById(R.id.rtv_msg_tip);
        if (msgView != null) {
            this.P.setTextSize(this.B);
            this.P.measureText(((TextView) childAt.findViewById(R.id.tv_tab_title)).getText().toString());
            float descent = this.P.descent() - this.P.ascent();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) msgView.getLayoutParams();
            marginLayoutParams.leftMargin = f(f5);
            int i6 = this.J;
            marginLayoutParams.topMargin = i6 > 0 ? (((int) (i6 - descent)) / 2) - f(f6) : f(f6);
            msgView.setLayoutParams(marginLayoutParams);
        }
    }

    public void setOnTabSelectListener(a1.b bVar) {
        this.R = bVar;
    }

    public void setTabData(String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            this.f12943c = strArr;
            n();
            return;
        }
        throw new IllegalStateException("Titles can not be NULL or EMPTY !");
    }

    public void setTabPadding(float f5) {
        this.f12952l = f(f5);
        t();
    }

    public void setTabSpaceEqual(boolean z4) {
        this.f12953m = z4;
        t();
    }

    public void setTabWidth(float f5) {
        this.f12954n = f(f5);
        t();
    }

    public void setTextAllCaps(boolean z4) {
        this.F = z4;
        t();
    }

    public void setTextBold(int i4) {
        this.E = i4;
        t();
    }

    public void setTextSelectColor(int i4) {
        this.C = i4;
        t();
    }

    public void setTextUnselectColor(int i4) {
        this.D = i4;
        t();
    }

    public void setTextsize(float f5) {
        this.B = r(f5);
        t();
    }

    public SegmentTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SegmentTabLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f12948h = new Rect();
        this.f12949i = new GradientDrawable();
        this.f12950j = new GradientDrawable();
        this.f12951k = new Paint(1);
        this.L = new OvershootInterpolator(0.8f);
        this.N = new float[8];
        this.O = true;
        this.P = new Paint(1);
        this.Q = new SparseArray<>();
        this.S = new b();
        this.T = new b();
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
        this.f12942b = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f12944d = linearLayout;
        addView(linearLayout);
        o(context, attributeSet);
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "layout_height");
        if (!attributeValue.equals("-1") && !attributeValue.equals("-2")) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842997});
            this.J = obtainStyledAttributes.getDimensionPixelSize(0, -2);
            obtainStyledAttributes.recycle();
        }
        ValueAnimator ofObject = ValueAnimator.ofObject(new c(), this.T, this.S);
        this.K = ofObject;
        ofObject.addUpdateListener(this);
    }

    public void setTabData(String[] strArr, FragmentActivity fragmentActivity, int i4, ArrayList<Fragment> arrayList) {
        this.M = new b1.a(fragmentActivity.getSupportFragmentManager(), i4, arrayList);
        setTabData(strArr);
    }
}
