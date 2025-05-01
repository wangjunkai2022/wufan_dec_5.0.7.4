package com.flyco.tablayout;

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
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.flyco.tablayout.widget.MsgView;
import java.util.ArrayList;
import java.util.Collections;
/* loaded from: classes3.dex */
public class SlidingTabLayout extends HorizontalScrollView implements ViewPager.OnPageChangeListener {
    private static final int A1 = 2;
    private static final int V = 0;
    private static final int W = 1;

    /* renamed from: p0  reason: collision with root package name */
    private static final int f12972p0 = 2;

    /* renamed from: p1  reason: collision with root package name */
    private static final int f12973p1 = 0;

    /* renamed from: v1  reason: collision with root package name */
    private static final int f12974v1 = 1;
    private float A;
    private int B;
    private boolean C;
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
    private int O;
    private int P;
    private boolean Q;
    private float R;
    private Paint S;
    private SparseArray<Boolean> T;
    private a1.b U;

    /* renamed from: b  reason: collision with root package name */
    private Context f12975b;

    /* renamed from: c  reason: collision with root package name */
    private ViewPager f12976c;

    /* renamed from: d  reason: collision with root package name */
    private ArrayList<String> f12977d;

    /* renamed from: e  reason: collision with root package name */
    private LinearLayout f12978e;

    /* renamed from: f  reason: collision with root package name */
    private int f12979f;

    /* renamed from: g  reason: collision with root package name */
    private float f12980g;

    /* renamed from: h  reason: collision with root package name */
    private int f12981h;

    /* renamed from: i  reason: collision with root package name */
    private Rect f12982i;

    /* renamed from: j  reason: collision with root package name */
    private Rect f12983j;

    /* renamed from: k  reason: collision with root package name */
    private GradientDrawable f12984k;

    /* renamed from: l  reason: collision with root package name */
    private Paint f12985l;

    /* renamed from: m  reason: collision with root package name */
    private Paint f12986m;

    /* renamed from: n  reason: collision with root package name */
    private Paint f12987n;

    /* renamed from: o  reason: collision with root package name */
    private Path f12988o;

    /* renamed from: p  reason: collision with root package name */
    private int f12989p;

    /* renamed from: q  reason: collision with root package name */
    private float f12990q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f12991r;

    /* renamed from: s  reason: collision with root package name */
    private float f12992s;

    /* renamed from: t  reason: collision with root package name */
    private int f12993t;

    /* renamed from: u  reason: collision with root package name */
    private float f12994u;

    /* renamed from: v  reason: collision with root package name */
    private float f12995v;

    /* renamed from: w  reason: collision with root package name */
    private float f12996w;

    /* renamed from: x  reason: collision with root package name */
    private float f12997x;

    /* renamed from: y  reason: collision with root package name */
    private float f12998y;

    /* renamed from: z  reason: collision with root package name */
    private float f12999z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int indexOfChild = SlidingTabLayout.this.f12978e.indexOfChild(view);
            if (indexOfChild != -1) {
                if (SlidingTabLayout.this.f12976c.getCurrentItem() != indexOfChild) {
                    if (SlidingTabLayout.this.Q) {
                        SlidingTabLayout.this.f12976c.setCurrentItem(indexOfChild, false);
                    } else {
                        SlidingTabLayout.this.f12976c.setCurrentItem(indexOfChild);
                    }
                    if (SlidingTabLayout.this.U != null) {
                        SlidingTabLayout.this.U.onTabSelect(indexOfChild);
                    }
                } else if (SlidingTabLayout.this.U != null) {
                    SlidingTabLayout.this.U.onTabReselect(indexOfChild);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    class b extends FragmentPagerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private ArrayList<Fragment> f13001a;

        /* renamed from: b  reason: collision with root package name */
        private String[] f13002b;

        public b(FragmentManager fragmentManager, ArrayList<Fragment> arrayList, String[] strArr) {
            super(fragmentManager);
            this.f13001a = new ArrayList<>();
            this.f13001a = arrayList;
            this.f13002b = strArr;
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i4, Object obj) {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.f13001a.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i4) {
            return this.f13001a.get(i4);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(Object obj) {
            return -2;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public CharSequence getPageTitle(int i4) {
            return this.f13002b[i4];
        }
    }

    public SlidingTabLayout(Context context) {
        this(context, null, 0);
    }

    private void f(int i4, String str, View view) {
        TextView textView = (TextView) view.findViewById(R.id.tv_tab_title);
        if (textView != null && str != null) {
            textView.setText(str);
        }
        view.setOnClickListener(new a());
        LinearLayout.LayoutParams layoutParams = this.f12991r ? new LinearLayout.LayoutParams(0, -1, 1.0f) : new LinearLayout.LayoutParams(-2, -1);
        if (this.f12992s > 0.0f) {
            layoutParams = new LinearLayout.LayoutParams((int) this.f12992s, -1);
        }
        this.f12978e.addView(view, i4, layoutParams);
    }

    private void g() {
        int i4;
        View childAt = this.f12978e.getChildAt(this.f12979f);
        float left = childAt.getLeft();
        float right = childAt.getRight();
        if (this.f12989p == 0 && this.C) {
            this.S.setTextSize(this.J);
            this.R = ((right - left) - this.S.measureText(((TextView) childAt.findViewById(R.id.tv_tab_title)).getText().toString())) / 2.0f;
        }
        int i5 = this.f12979f;
        if (i5 < this.f12981h - 1) {
            View childAt2 = this.f12978e.getChildAt(i5 + 1);
            float left2 = childAt2.getLeft();
            float right2 = childAt2.getRight();
            float f5 = this.f12980g;
            left += (left2 - left) * f5;
            right += f5 * (right2 - right);
            if (this.f12989p == 0 && this.C) {
                this.S.setTextSize(this.J);
                float f6 = this.R;
                this.R = f6 + (this.f12980g * ((((right2 - left2) - this.S.measureText(((TextView) childAt2.findViewById(R.id.tv_tab_title)).getText().toString())) / 2.0f) - f6));
            }
        }
        Rect rect = this.f12982i;
        int i6 = (int) left;
        rect.left = i6;
        int i7 = (int) right;
        rect.right = i7;
        if (this.f12989p == 0 && this.C) {
            float f7 = this.R;
            rect.left = (int) ((left + f7) - 1.0f);
            rect.right = (int) ((right - f7) - 1.0f);
        }
        Rect rect2 = this.f12983j;
        rect2.left = i6;
        rect2.right = i7;
        if (this.f12995v < 0.0f) {
            return;
        }
        float left3 = childAt.getLeft() + ((childAt.getWidth() - this.f12995v) / 2.0f);
        if (this.f12979f < this.f12981h - 1) {
            left3 += this.f12980g * ((childAt.getWidth() / 2) + (this.f12978e.getChildAt(i4 + 1).getWidth() / 2));
        }
        Rect rect3 = this.f12982i;
        int i8 = (int) left3;
        rect3.left = i8;
        rect3.right = (int) (i8 + this.f12995v);
    }

    private void n(Context context, AttributeSet attributeSet) {
        float f5;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SlidingTabLayout);
        int i4 = obtainStyledAttributes.getInt(R.styleable.SlidingTabLayout_tl_indicator_style, 0);
        this.f12989p = i4;
        this.f12993t = obtainStyledAttributes.getColor(R.styleable.SlidingTabLayout_tl_indicator_color, Color.parseColor(i4 == 2 ? "#4B6A87" : "#ffffff"));
        int i5 = R.styleable.SlidingTabLayout_tl_indicator_height;
        int i6 = this.f12989p;
        if (i6 == 1) {
            f5 = 4.0f;
        } else {
            f5 = i6 == 2 ? -1 : 2;
        }
        this.f12994u = obtainStyledAttributes.getDimension(i5, h(f5));
        this.f12995v = obtainStyledAttributes.getDimension(R.styleable.SlidingTabLayout_tl_indicator_width, h(this.f12989p == 1 ? 10.0f : -1.0f));
        this.f12996w = obtainStyledAttributes.getDimension(R.styleable.SlidingTabLayout_tl_indicator_corner_radius, h(this.f12989p == 2 ? -1.0f : 0.0f));
        this.f12997x = obtainStyledAttributes.getDimension(R.styleable.SlidingTabLayout_tl_indicator_margin_left, h(0.0f));
        this.f12998y = obtainStyledAttributes.getDimension(R.styleable.SlidingTabLayout_tl_indicator_margin_top, h(this.f12989p == 2 ? 7.0f : 0.0f));
        this.f12999z = obtainStyledAttributes.getDimension(R.styleable.SlidingTabLayout_tl_indicator_margin_right, h(0.0f));
        this.A = obtainStyledAttributes.getDimension(R.styleable.SlidingTabLayout_tl_indicator_margin_bottom, h(this.f12989p != 2 ? 0.0f : 7.0f));
        this.B = obtainStyledAttributes.getInt(R.styleable.SlidingTabLayout_tl_indicator_gravity, 80);
        this.C = obtainStyledAttributes.getBoolean(R.styleable.SlidingTabLayout_tl_indicator_width_equal_title, false);
        this.D = obtainStyledAttributes.getColor(R.styleable.SlidingTabLayout_tl_underline_color, Color.parseColor("#ffffff"));
        this.E = obtainStyledAttributes.getDimension(R.styleable.SlidingTabLayout_tl_underline_height, h(0.0f));
        this.F = obtainStyledAttributes.getInt(R.styleable.SlidingTabLayout_tl_underline_gravity, 80);
        this.G = obtainStyledAttributes.getColor(R.styleable.SlidingTabLayout_tl_divider_color, Color.parseColor("#ffffff"));
        this.H = obtainStyledAttributes.getDimension(R.styleable.SlidingTabLayout_tl_divider_width, h(0.0f));
        this.I = obtainStyledAttributes.getDimension(R.styleable.SlidingTabLayout_tl_divider_padding, h(12.0f));
        this.J = obtainStyledAttributes.getDimension(R.styleable.SlidingTabLayout_tl_textsize, r(14.0f));
        this.K = obtainStyledAttributes.getColor(R.styleable.SlidingTabLayout_tl_textSelectColor, Color.parseColor("#ffffff"));
        this.L = obtainStyledAttributes.getColor(R.styleable.SlidingTabLayout_tl_textUnselectColor, Color.parseColor("#AAffffff"));
        this.M = obtainStyledAttributes.getInt(R.styleable.SlidingTabLayout_tl_textBold, 0);
        this.N = obtainStyledAttributes.getBoolean(R.styleable.SlidingTabLayout_tl_textAllCaps, false);
        this.f12991r = obtainStyledAttributes.getBoolean(R.styleable.SlidingTabLayout_tl_tab_space_equal, false);
        float dimension = obtainStyledAttributes.getDimension(R.styleable.SlidingTabLayout_tl_tab_width, h(-1.0f));
        this.f12992s = dimension;
        this.f12990q = obtainStyledAttributes.getDimension(R.styleable.SlidingTabLayout_tl_tab_padding, (this.f12991r || dimension > 0.0f) ? h(0.0f) : h(20.0f));
        obtainStyledAttributes.recycle();
    }

    private void o() {
        if (this.f12981h <= 0) {
            return;
        }
        int width = (int) (this.f12980g * this.f12978e.getChildAt(this.f12979f).getWidth());
        int left = this.f12978e.getChildAt(this.f12979f).getLeft() + width;
        if (this.f12979f > 0 || width > 0) {
            int width2 = left - ((getWidth() / 2) - getPaddingLeft());
            g();
            Rect rect = this.f12983j;
            left = width2 + ((rect.right - rect.left) / 2);
        }
        if (left != this.O) {
            this.O = left;
            scrollTo(left, 0);
        }
    }

    private void s(int i4) {
        int i5 = 0;
        while (i5 < this.f12981h) {
            View childAt = this.f12978e.getChildAt(i5);
            boolean z4 = i5 == i4;
            TextView textView = (TextView) childAt.findViewById(R.id.tv_tab_title);
            if (textView != null) {
                textView.setTextColor(z4 ? this.K : this.L);
                if (this.M == 1) {
                    textView.getPaint().setFakeBoldText(z4);
                }
            }
            i5++;
        }
    }

    private void t() {
        int i4 = 0;
        while (i4 < this.f12981h) {
            TextView textView = (TextView) this.f12978e.getChildAt(i4).findViewById(R.id.tv_tab_title);
            if (textView != null) {
                textView.setTextColor(i4 == this.f12979f ? this.K : this.L);
                textView.setTextSize(0, this.J);
                float f5 = this.f12990q;
                textView.setPadding((int) f5, 0, (int) f5, 0);
                if (this.N) {
                    textView.setText(textView.getText().toString().toUpperCase());
                }
                int i5 = this.M;
                if (i5 == 2) {
                    textView.getPaint().setFakeBoldText(true);
                } else if (i5 == 0) {
                    textView.getPaint().setFakeBoldText(false);
                }
            }
            i4++;
        }
    }

    public void e(String str) {
        View inflate = View.inflate(this.f12975b, R.layout.layout_tab, null);
        ArrayList<String> arrayList = this.f12977d;
        if (arrayList != null) {
            arrayList.add(str);
        }
        ArrayList<String> arrayList2 = this.f12977d;
        f(this.f12981h, (arrayList2 == null ? this.f12976c.getAdapter().getPageTitle(this.f12981h) : arrayList2.get(this.f12981h)).toString(), inflate);
        ArrayList<String> arrayList3 = this.f12977d;
        this.f12981h = arrayList3 == null ? this.f12976c.getAdapter().getCount() : arrayList3.size();
        t();
    }

    public int getCurrentTab() {
        return this.f12979f;
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

    public int getIndicatorColor() {
        return this.f12993t;
    }

    public float getIndicatorCornerRadius() {
        return this.f12996w;
    }

    public float getIndicatorHeight() {
        return this.f12994u;
    }

    public float getIndicatorMarginBottom() {
        return this.A;
    }

    public float getIndicatorMarginLeft() {
        return this.f12997x;
    }

    public float getIndicatorMarginRight() {
        return this.f12999z;
    }

    public float getIndicatorMarginTop() {
        return this.f12998y;
    }

    public int getIndicatorStyle() {
        return this.f12989p;
    }

    public float getIndicatorWidth() {
        return this.f12995v;
    }

    public int getTabCount() {
        return this.f12981h;
    }

    public float getTabPadding() {
        return this.f12990q;
    }

    public float getTabWidth() {
        return this.f12992s;
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

    protected int h(float f5) {
        return (int) ((f5 * this.f12975b.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public MsgView i(int i4) {
        int i5 = this.f12981h;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        return (MsgView) this.f12978e.getChildAt(i4).findViewById(R.id.rtv_msg_tip);
    }

    public TextView j(int i4) {
        return (TextView) this.f12978e.getChildAt(i4).findViewById(R.id.tv_tab_title);
    }

    public void k(int i4) {
        int i5 = this.f12981h;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        MsgView msgView = (MsgView) this.f12978e.getChildAt(i4).findViewById(R.id.rtv_msg_tip);
        if (msgView != null) {
            msgView.setVisibility(8);
        }
    }

    public boolean l() {
        return this.f12991r;
    }

    public boolean m() {
        return this.N;
    }

    public void notifyDataSetChanged() {
        this.f12978e.removeAllViews();
        ArrayList<String> arrayList = this.f12977d;
        this.f12981h = arrayList == null ? this.f12976c.getAdapter().getCount() : arrayList.size();
        for (int i4 = 0; i4 < this.f12981h; i4++) {
            View inflate = View.inflate(this.f12975b, R.layout.layout_tab, null);
            ArrayList<String> arrayList2 = this.f12977d;
            f(i4, (arrayList2 == null ? this.f12976c.getAdapter().getPageTitle(i4) : arrayList2.get(i4)).toString(), inflate);
        }
        t();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Rect rect;
        super.onDraw(canvas);
        if (isInEditMode() || this.f12981h <= 0) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        float f5 = this.H;
        if (f5 > 0.0f) {
            this.f12986m.setStrokeWidth(f5);
            this.f12986m.setColor(this.G);
            for (int i4 = 0; i4 < this.f12981h - 1; i4++) {
                View childAt = this.f12978e.getChildAt(i4);
                canvas.drawLine(childAt.getRight() + paddingLeft, this.I, childAt.getRight() + paddingLeft, height - this.I, this.f12986m);
            }
        }
        if (this.E > 0.0f) {
            this.f12985l.setColor(this.D);
            if (this.F == 80) {
                float f6 = height;
                canvas.drawRect(paddingLeft, f6 - this.E, this.f12978e.getWidth() + paddingLeft, f6, this.f12985l);
            } else {
                canvas.drawRect(paddingLeft, 0.0f, this.f12978e.getWidth() + paddingLeft, this.E, this.f12985l);
            }
        }
        g();
        int i5 = this.f12989p;
        if (i5 == 1) {
            if (this.f12994u > 0.0f) {
                this.f12987n.setColor(this.f12993t);
                this.f12988o.reset();
                float f7 = height;
                this.f12988o.moveTo(this.f12982i.left + paddingLeft, f7);
                Path path = this.f12988o;
                Rect rect2 = this.f12982i;
                path.lineTo((rect2.left / 2) + paddingLeft + (rect2.right / 2), f7 - this.f12994u);
                this.f12988o.lineTo(paddingLeft + this.f12982i.right, f7);
                this.f12988o.close();
                canvas.drawPath(this.f12988o, this.f12987n);
            }
        } else if (i5 == 2) {
            if (this.f12994u < 0.0f) {
                this.f12994u = (height - this.f12998y) - this.A;
            }
            float f8 = this.f12994u;
            if (f8 > 0.0f) {
                float f9 = this.f12996w;
                if (f9 < 0.0f || f9 > f8 / 2.0f) {
                    this.f12996w = f8 / 2.0f;
                }
                this.f12984k.setColor(this.f12993t);
                GradientDrawable gradientDrawable = this.f12984k;
                int i6 = ((int) this.f12997x) + paddingLeft + this.f12982i.left;
                float f10 = this.f12998y;
                gradientDrawable.setBounds(i6, (int) f10, (int) ((paddingLeft + rect.right) - this.f12999z), (int) (f10 + this.f12994u));
                this.f12984k.setCornerRadius(this.f12996w);
                this.f12984k.draw(canvas);
            }
        } else if (this.f12994u > 0.0f) {
            this.f12984k.setColor(this.f12993t);
            if (this.B == 80) {
                GradientDrawable gradientDrawable2 = this.f12984k;
                Rect rect3 = this.f12982i;
                float f11 = this.A;
                gradientDrawable2.setBounds(((int) this.f12997x) + paddingLeft + rect3.left, (height - ((int) this.f12994u)) - ((int) f11), (paddingLeft + rect3.right) - ((int) this.f12999z), height - ((int) f11));
            } else {
                GradientDrawable gradientDrawable3 = this.f12984k;
                Rect rect4 = this.f12982i;
                int i7 = ((int) this.f12997x) + paddingLeft + rect4.left;
                float f12 = this.f12998y;
                gradientDrawable3.setBounds(i7, (int) f12, (paddingLeft + rect4.right) - ((int) this.f12999z), ((int) this.f12994u) + ((int) f12));
            }
            this.f12984k.setCornerRadius(this.f12996w);
            this.f12984k.draw(canvas);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i4) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i4, float f5, int i5) {
        this.f12979f = i4;
        this.f12980g = f5;
        o();
        invalidate();
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i4) {
        s(i4);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f12979f = bundle.getInt("mCurrentTab");
            parcelable = bundle.getParcelable("instanceState");
            if (this.f12979f != 0 && this.f12978e.getChildCount() > 0) {
                s(this.f12979f);
                o();
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("mCurrentTab", this.f12979f);
        return bundle;
    }

    public void p(int i4) {
        int i5 = this.f12981h;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        q(i4, 0);
    }

    public void q(int i4, int i5) {
        int i6 = this.f12981h;
        if (i4 >= i6) {
            i4 = i6 - 1;
        }
        MsgView msgView = (MsgView) this.f12978e.getChildAt(i4).findViewById(R.id.rtv_msg_tip);
        if (msgView != null) {
            b1.b.b(msgView, i5);
            if (this.T.get(i4) == null || !this.T.get(i4).booleanValue()) {
                setMsgMargin(i4, 4.0f, 2.0f);
                this.T.put(i4, Boolean.TRUE);
            }
        }
    }

    protected int r(float f5) {
        return (int) ((f5 * this.f12975b.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public void setCurrentTab(int i4) {
        this.f12979f = i4;
        this.f12976c.setCurrentItem(i4);
    }

    public void setDividerColor(int i4) {
        this.G = i4;
        invalidate();
    }

    public void setDividerPadding(float f5) {
        this.I = h(f5);
        invalidate();
    }

    public void setDividerWidth(float f5) {
        this.H = h(f5);
        invalidate();
    }

    public void setIndicatorColor(int i4) {
        this.f12993t = i4;
        invalidate();
    }

    public void setIndicatorCornerRadius(float f5) {
        this.f12996w = h(f5);
        invalidate();
    }

    public void setIndicatorGravity(int i4) {
        this.B = i4;
        invalidate();
    }

    public void setIndicatorHeight(float f5) {
        this.f12994u = h(f5);
        invalidate();
    }

    public void setIndicatorMargin(float f5, float f6, float f7, float f8) {
        this.f12997x = h(f5);
        this.f12998y = h(f6);
        this.f12999z = h(f7);
        this.A = h(f8);
        invalidate();
    }

    public void setIndicatorStyle(int i4) {
        this.f12989p = i4;
        invalidate();
    }

    public void setIndicatorWidth(float f5) {
        this.f12995v = h(f5);
        invalidate();
    }

    public void setIndicatorWidthEqualTitle(boolean z4) {
        this.C = z4;
        invalidate();
    }

    public void setMsgMargin(int i4, float f5, float f6) {
        float f7;
        int i5 = this.f12981h;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        View childAt = this.f12978e.getChildAt(i4);
        MsgView msgView = (MsgView) childAt.findViewById(R.id.rtv_msg_tip);
        if (msgView != null) {
            this.S.setTextSize(this.J);
            float measureText = this.S.measureText(((TextView) childAt.findViewById(R.id.tv_tab_title)).getText().toString());
            float descent = this.S.descent() - this.S.ascent();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) msgView.getLayoutParams();
            float f8 = this.f12992s;
            if (f8 >= 0.0f) {
                f7 = f8 / 2.0f;
                measureText /= 2.0f;
            } else {
                f7 = this.f12990q;
            }
            marginLayoutParams.leftMargin = (int) (f7 + measureText + h(f5));
            int i6 = this.P;
            marginLayoutParams.topMargin = i6 > 0 ? (((int) (i6 - descent)) / 2) - h(f6) : 0;
            msgView.setLayoutParams(marginLayoutParams);
        }
    }

    public void setOnTabSelectListener(a1.b bVar) {
        this.U = bVar;
    }

    public void setSnapOnTabClick(boolean z4) {
        this.Q = z4;
    }

    public void setTabPadding(float f5) {
        this.f12990q = h(f5);
        t();
    }

    public void setTabSpaceEqual(boolean z4) {
        this.f12991r = z4;
        t();
    }

    public void setTabWidth(float f5) {
        this.f12992s = h(f5);
        t();
    }

    public void setTextAllCaps(boolean z4) {
        this.N = z4;
        t();
    }

    public void setTextBold(int i4) {
        this.M = i4;
        t();
    }

    public void setTextSelectColor(int i4) {
        this.K = i4;
        t();
    }

    public void setTextUnselectColor(int i4) {
        this.L = i4;
        t();
    }

    public void setTextsize(float f5) {
        this.J = r(f5);
        t();
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
        this.E = h(f5);
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        if (viewPager != null && viewPager.getAdapter() != null) {
            this.f12976c = viewPager;
            viewPager.removeOnPageChangeListener(this);
            this.f12976c.addOnPageChangeListener(this);
            notifyDataSetChanged();
            return;
        }
        throw new IllegalStateException("ViewPager or ViewPager adapter can not be NULL !");
    }

    public SlidingTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingTabLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f12982i = new Rect();
        this.f12983j = new Rect();
        this.f12984k = new GradientDrawable();
        this.f12985l = new Paint(1);
        this.f12986m = new Paint(1);
        this.f12987n = new Paint(1);
        this.f12988o = new Path();
        this.f12989p = 0;
        this.S = new Paint(1);
        this.T = new SparseArray<>();
        setFillViewport(true);
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
        this.f12975b = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f12978e = linearLayout;
        addView(linearLayout);
        n(context, attributeSet);
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "layout_height");
        if (attributeValue.equals("-1") || attributeValue.equals("-2")) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842997});
        this.P = obtainStyledAttributes.getDimensionPixelSize(0, -2);
        obtainStyledAttributes.recycle();
    }

    public void setCurrentTab(int i4, boolean z4) {
        this.f12979f = i4;
        this.f12976c.setCurrentItem(i4, z4);
    }

    public void setViewPager(ViewPager viewPager, String[] strArr) {
        if (viewPager != null && viewPager.getAdapter() != null) {
            if (strArr != null && strArr.length != 0) {
                if (strArr.length == viewPager.getAdapter().getCount()) {
                    this.f12976c = viewPager;
                    ArrayList<String> arrayList = new ArrayList<>();
                    this.f12977d = arrayList;
                    Collections.addAll(arrayList, strArr);
                    this.f12976c.removeOnPageChangeListener(this);
                    this.f12976c.addOnPageChangeListener(this);
                    notifyDataSetChanged();
                    return;
                }
                throw new IllegalStateException("Titles length must be the same as the page count !");
            }
            throw new IllegalStateException("Titles can not be EMPTY !");
        }
        throw new IllegalStateException("ViewPager or ViewPager adapter can not be NULL !");
    }

    public void setViewPager(ViewPager viewPager, String[] strArr, FragmentActivity fragmentActivity, ArrayList<Fragment> arrayList) {
        if (viewPager != null) {
            if (strArr != null && strArr.length != 0) {
                this.f12976c = viewPager;
                viewPager.setAdapter(new b(fragmentActivity.getSupportFragmentManager(), arrayList, strArr));
                this.f12976c.removeOnPageChangeListener(this);
                this.f12976c.addOnPageChangeListener(this);
                notifyDataSetChanged();
                return;
            }
            throw new IllegalStateException("Titles can not be EMPTY !");
        }
        throw new IllegalStateException("ViewPager can not be NULL !");
    }
}
