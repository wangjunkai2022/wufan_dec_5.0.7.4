package com.join.mgps.customview;

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
import com.join.android.app.mgsim.wufun.R;
import java.util.ArrayList;
import java.util.Collections;
/* loaded from: classes4.dex */
public class BtReginSlidinTablayout extends HorizontalScrollView implements ViewPager.OnPageChangeListener {
    private static final int A1 = 0;
    private static final int B1 = 1;
    private static final int C1 = 2;
    private static final int W = 0;

    /* renamed from: p0  reason: collision with root package name */
    private static final int f46423p0 = 1;

    /* renamed from: p1  reason: collision with root package name */
    private static final int f46424p1 = 2;

    /* renamed from: v1  reason: collision with root package name */
    private static final int f46425v1 = 3;
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
    int R;
    private float S;
    private Paint T;
    private SparseArray<Boolean> U;
    private a1.b V;

    /* renamed from: b  reason: collision with root package name */
    private Context f46426b;

    /* renamed from: c  reason: collision with root package name */
    private ViewPager f46427c;

    /* renamed from: d  reason: collision with root package name */
    private ArrayList<String> f46428d;

    /* renamed from: e  reason: collision with root package name */
    private LinearLayout f46429e;

    /* renamed from: f  reason: collision with root package name */
    private int f46430f;

    /* renamed from: g  reason: collision with root package name */
    private float f46431g;

    /* renamed from: h  reason: collision with root package name */
    private int f46432h;

    /* renamed from: i  reason: collision with root package name */
    private Rect f46433i;

    /* renamed from: j  reason: collision with root package name */
    private Rect f46434j;

    /* renamed from: k  reason: collision with root package name */
    private GradientDrawable f46435k;

    /* renamed from: l  reason: collision with root package name */
    private Paint f46436l;

    /* renamed from: m  reason: collision with root package name */
    private Paint f46437m;

    /* renamed from: n  reason: collision with root package name */
    private Paint f46438n;

    /* renamed from: o  reason: collision with root package name */
    private Path f46439o;

    /* renamed from: p  reason: collision with root package name */
    private int f46440p;

    /* renamed from: q  reason: collision with root package name */
    private float f46441q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f46442r;

    /* renamed from: s  reason: collision with root package name */
    private float f46443s;

    /* renamed from: t  reason: collision with root package name */
    private int f46444t;

    /* renamed from: u  reason: collision with root package name */
    private float f46445u;

    /* renamed from: v  reason: collision with root package name */
    private float f46446v;

    /* renamed from: w  reason: collision with root package name */
    private float f46447w;

    /* renamed from: x  reason: collision with root package name */
    private float f46448x;

    /* renamed from: y  reason: collision with root package name */
    private float f46449y;

    /* renamed from: z  reason: collision with root package name */
    private float f46450z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int indexOfChild = BtReginSlidinTablayout.this.f46429e.indexOfChild(view);
            if (indexOfChild != -1) {
                if (BtReginSlidinTablayout.this.f46427c.getCurrentItem() != indexOfChild) {
                    if (BtReginSlidinTablayout.this.Q) {
                        BtReginSlidinTablayout.this.f46427c.setCurrentItem(indexOfChild, false);
                    } else {
                        BtReginSlidinTablayout.this.f46427c.setCurrentItem(indexOfChild);
                    }
                    if (BtReginSlidinTablayout.this.V != null) {
                        BtReginSlidinTablayout.this.V.onTabSelect(indexOfChild);
                    }
                } else if (BtReginSlidinTablayout.this.V != null) {
                    BtReginSlidinTablayout.this.V.onTabReselect(indexOfChild);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    class b extends FragmentPagerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private ArrayList<Fragment> f46452a;

        /* renamed from: b  reason: collision with root package name */
        private String[] f46453b;

        public b(FragmentManager fragmentManager, ArrayList<Fragment> arrayList, String[] strArr) {
            super(fragmentManager);
            this.f46452a = new ArrayList<>();
            this.f46452a = arrayList;
            this.f46453b = strArr;
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i4, Object obj) {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.f46452a.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i4) {
            return this.f46452a.get(i4);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(Object obj) {
            return -2;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public CharSequence getPageTitle(int i4) {
            return this.f46453b[i4];
        }
    }

    public BtReginSlidinTablayout(Context context) {
        this(context, null, 0);
    }

    private void f(int i4, String str, View view) {
        LinearLayout.LayoutParams layoutParams;
        TextView textView = (TextView) view.findViewById(R.id.tv_tab_title);
        if (textView != null && str != null) {
            textView.setText(str);
        }
        view.setOnClickListener(new a());
        if (this.f46442r) {
            layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
        } else {
            layoutParams = new LinearLayout.LayoutParams(-2, -1);
        }
        if (this.f46443s > 0.0f) {
            layoutParams = new LinearLayout.LayoutParams((int) this.f46443s, -1);
        }
        this.f46429e.addView(view, i4, layoutParams);
    }

    private void g() {
        int i4;
        View childAt = this.f46429e.getChildAt(this.f46430f);
        float left = childAt.getLeft();
        float right = childAt.getRight();
        if (this.f46440p == 0 && this.C) {
            this.T.setTextSize(this.J);
            this.S = ((right - left) - this.T.measureText(((TextView) childAt.findViewById(R.id.tv_tab_title)).getText().toString())) / 2.0f;
        }
        int i5 = this.f46430f;
        if (i5 < this.f46432h - 1) {
            View childAt2 = this.f46429e.getChildAt(i5 + 1);
            float left2 = childAt2.getLeft();
            float right2 = childAt2.getRight();
            float f5 = this.f46431g;
            left += (left2 - left) * f5;
            right += f5 * (right2 - right);
            if (this.f46440p == 0 && this.C) {
                this.T.setTextSize(this.J);
                float f6 = this.S;
                this.S = f6 + (this.f46431g * ((((right2 - left2) - this.T.measureText(((TextView) childAt2.findViewById(R.id.tv_tab_title)).getText().toString())) / 2.0f) - f6));
            }
        }
        Rect rect = this.f46433i;
        int i6 = (int) left;
        rect.left = i6;
        int i7 = (int) right;
        rect.right = i7;
        if (this.f46440p == 0 && this.C) {
            float f7 = this.S;
            rect.left = (int) ((left + f7) - 1.0f);
            rect.right = (int) ((right - f7) - 1.0f);
        }
        Rect rect2 = this.f46434j;
        rect2.left = i6;
        rect2.right = i7;
        if (this.f46446v < 0.0f) {
            return;
        }
        float left3 = childAt.getLeft() + ((childAt.getWidth() - this.f46446v) / 2.0f);
        if (this.f46430f < this.f46432h - 1) {
            left3 += this.f46431g * ((childAt.getWidth() / 2) + (this.f46429e.getChildAt(i4 + 1).getWidth() / 2));
        }
        Rect rect3 = this.f46433i;
        int i8 = (int) left3;
        rect3.left = i8;
        rect3.right = (int) (i8 + this.f46446v);
    }

    private void n(Context context, AttributeSet attributeSet) {
        float f5;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MySlidingTabLayout);
        int i4 = obtainStyledAttributes.getInt(11, 0);
        this.f46440p = i4;
        this.f46444t = obtainStyledAttributes.getColor(3, Color.parseColor(i4 == 2 ? "#4B6A87" : "#ffffff"));
        int i5 = this.f46440p;
        if (i5 == 1) {
            f5 = 4.0f;
        } else {
            f5 = i5 == 2 ? -1 : 2;
        }
        this.f46445u = obtainStyledAttributes.getDimension(6, h(f5));
        this.f46446v = obtainStyledAttributes.getDimension(12, h(this.f46440p == 1 ? 10.0f : -1.0f));
        this.f46447w = obtainStyledAttributes.getDimension(4, h(this.f46440p == 2 ? -1.0f : 0.0f));
        this.f46448x = obtainStyledAttributes.getDimension(8, h(0.0f));
        this.f46449y = obtainStyledAttributes.getDimension(10, h(this.f46440p == 2 ? 7.0f : 0.0f));
        this.f46450z = obtainStyledAttributes.getDimension(9, h(0.0f));
        this.A = obtainStyledAttributes.getDimension(7, h(this.f46440p != 2 ? 0.0f : 7.0f));
        this.B = obtainStyledAttributes.getInt(5, 80);
        this.C = obtainStyledAttributes.getBoolean(13, false);
        this.D = obtainStyledAttributes.getColor(22, Color.parseColor("#ffffff"));
        this.E = obtainStyledAttributes.getDimension(24, h(0.0f));
        this.F = obtainStyledAttributes.getInt(23, 80);
        this.G = obtainStyledAttributes.getColor(0, Color.parseColor("#ffffff"));
        this.H = obtainStyledAttributes.getDimension(2, h(0.0f));
        this.I = obtainStyledAttributes.getDimension(1, h(12.0f));
        this.J = obtainStyledAttributes.getDimension(21, r(14.0f));
        this.K = obtainStyledAttributes.getColor(19, Color.parseColor("#ffffff"));
        this.L = obtainStyledAttributes.getColor(20, Color.parseColor("#AAffffff"));
        this.M = obtainStyledAttributes.getInt(18, 0);
        this.N = obtainStyledAttributes.getBoolean(17, false);
        this.f46442r = obtainStyledAttributes.getBoolean(15, false);
        float dimension = obtainStyledAttributes.getDimension(16, h(-1.0f));
        this.f46443s = dimension;
        this.f46441q = obtainStyledAttributes.getDimension(14, (this.f46442r || dimension > 0.0f) ? h(0.0f) : h(20.0f));
        obtainStyledAttributes.recycle();
    }

    private void o() {
        if (this.f46432h <= 0) {
            return;
        }
        int width = (int) (this.f46431g * this.f46429e.getChildAt(this.f46430f).getWidth());
        int left = this.f46429e.getChildAt(this.f46430f).getLeft() + width;
        if (this.f46430f > 0 || width > 0) {
            int width2 = left - ((getWidth() / 2) - getPaddingLeft());
            g();
            Rect rect = this.f46434j;
            left = width2 + ((rect.right - rect.left) / 2);
        }
        if (left != this.O) {
            this.O = left;
            scrollTo(left, 0);
        }
    }

    private void s(int i4) {
        this.R = i4;
        int i5 = 0;
        while (i5 < this.f46432h) {
            View childAt = this.f46429e.getChildAt(i5);
            boolean z4 = i5 == i4;
            TextView textView = (TextView) childAt.findViewById(R.id.tv_tab_title);
            if (textView != null) {
                textView.setTextColor(z4 ? this.K : this.L);
                if (this.M == 1) {
                    textView.getPaint().setFakeBoldText(z4);
                }
                if (this.f46440p == 3) {
                    if (i5 == this.R) {
                        textView.setSelected(true);
                    } else {
                        textView.setSelected(false);
                    }
                }
            }
            i5++;
        }
    }

    private void t() {
        int i4 = 0;
        while (i4 < this.f46432h) {
            TextView textView = (TextView) this.f46429e.getChildAt(i4).findViewById(R.id.tv_tab_title);
            if (textView != null) {
                textView.setTextColor(i4 == this.f46430f ? this.K : this.L);
                textView.setTextSize(0, this.J);
                float f5 = this.f46441q;
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
                if (this.f46440p == 3) {
                    if (i4 == this.R) {
                        textView.setSelected(true);
                    } else {
                        textView.setSelected(false);
                    }
                }
            }
            i4++;
        }
    }

    public void e(String str) {
        View inflate = View.inflate(this.f46426b, R.layout.bt_tab_item_layout, null);
        ArrayList<String> arrayList = this.f46428d;
        if (arrayList != null) {
            arrayList.add(str);
        }
        ArrayList<String> arrayList2 = this.f46428d;
        f(this.f46432h, (arrayList2 == null ? this.f46427c.getAdapter().getPageTitle(this.f46432h) : arrayList2.get(this.f46432h)).toString(), inflate);
        ArrayList<String> arrayList3 = this.f46428d;
        this.f46432h = arrayList3 == null ? this.f46427c.getAdapter().getCount() : arrayList3.size();
        t();
    }

    public int getCurrentTab() {
        return this.f46430f;
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
        return this.f46444t;
    }

    public float getIndicatorCornerRadius() {
        return this.f46447w;
    }

    public float getIndicatorHeight() {
        return this.f46445u;
    }

    public float getIndicatorMarginBottom() {
        return this.A;
    }

    public float getIndicatorMarginLeft() {
        return this.f46448x;
    }

    public float getIndicatorMarginRight() {
        return this.f46450z;
    }

    public float getIndicatorMarginTop() {
        return this.f46449y;
    }

    public int getIndicatorStyle() {
        return this.f46440p;
    }

    public float getIndicatorWidth() {
        return this.f46446v;
    }

    public int getTabCount() {
        return this.f46432h;
    }

    public float getTabPadding() {
        return this.f46441q;
    }

    public float getTabWidth() {
        return this.f46443s;
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
        return (int) ((f5 * this.f46426b.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public MsgView i(int i4) {
        int i5 = this.f46432h;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        return (MsgView) this.f46429e.getChildAt(i4).findViewById(R.id.rtv_msg_tip);
    }

    public TextView j(int i4) {
        return (TextView) this.f46429e.getChildAt(i4).findViewById(R.id.tv_tab_title);
    }

    public void k(int i4) {
        int i5 = this.f46432h;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        MsgView msgView = (MsgView) this.f46429e.getChildAt(i4).findViewById(R.id.rtv_msg_tip);
        if (msgView != null) {
            msgView.setVisibility(8);
        }
    }

    public boolean l() {
        return this.f46442r;
    }

    public boolean m() {
        return this.N;
    }

    public void notifyDataSetChanged() {
        this.f46429e.removeAllViews();
        ArrayList<String> arrayList = this.f46428d;
        this.f46432h = arrayList == null ? this.f46427c.getAdapter().getCount() : arrayList.size();
        for (int i4 = 0; i4 < this.f46432h; i4++) {
            View inflate = View.inflate(this.f46426b, R.layout.bt_tab_item_layout, null);
            ArrayList<String> arrayList2 = this.f46428d;
            f(i4, (arrayList2 == null ? this.f46427c.getAdapter().getPageTitle(i4) : arrayList2.get(i4)).toString(), inflate);
        }
        t();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Rect rect;
        super.onDraw(canvas);
        if (isInEditMode() || this.f46432h <= 0) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        float f5 = this.H;
        if (f5 > 0.0f) {
            this.f46437m.setStrokeWidth(f5);
            this.f46437m.setColor(this.G);
            for (int i4 = 0; i4 < this.f46432h - 1; i4++) {
                View childAt = this.f46429e.getChildAt(i4);
                canvas.drawLine(childAt.getRight() + paddingLeft, this.I, childAt.getRight() + paddingLeft, height - this.I, this.f46437m);
            }
        }
        if (this.E > 0.0f) {
            this.f46436l.setColor(this.D);
            if (this.F == 80) {
                float f6 = height;
                canvas.drawRect(paddingLeft, f6 - this.E, this.f46429e.getWidth() + paddingLeft, f6, this.f46436l);
            } else {
                canvas.drawRect(paddingLeft, 0.0f, this.f46429e.getWidth() + paddingLeft, this.E, this.f46436l);
            }
        }
        g();
        int i5 = this.f46440p;
        if (i5 == 1) {
            if (this.f46445u > 0.0f) {
                this.f46438n.setColor(this.f46444t);
                this.f46439o.reset();
                float f7 = height;
                this.f46439o.moveTo(this.f46433i.left + paddingLeft, f7);
                Path path = this.f46439o;
                Rect rect2 = this.f46433i;
                path.lineTo((rect2.left / 2) + paddingLeft + (rect2.right / 2), f7 - this.f46445u);
                this.f46439o.lineTo(paddingLeft + this.f46433i.right, f7);
                this.f46439o.close();
                canvas.drawPath(this.f46439o, this.f46438n);
            }
        } else if (i5 == 2) {
            if (this.f46445u < 0.0f) {
                this.f46445u = (height - this.f46449y) - this.A;
            }
            float f8 = this.f46445u;
            if (f8 > 0.0f) {
                float f9 = this.f46447w;
                if (f9 < 0.0f || f9 > f8 / 2.0f) {
                    this.f46447w = f8 / 2.0f;
                }
                this.f46435k.setColor(this.f46444t);
                GradientDrawable gradientDrawable = this.f46435k;
                int i6 = ((int) this.f46448x) + paddingLeft + this.f46433i.left;
                float f10 = this.f46449y;
                gradientDrawable.setBounds(i6, (int) f10, (int) ((paddingLeft + rect.right) - this.f46450z), (int) (f10 + this.f46445u));
                this.f46435k.setCornerRadius(this.f46447w);
                this.f46435k.draw(canvas);
            }
        } else if (this.f46445u > 0.0f) {
            this.f46435k.setColor(this.f46444t);
            if (this.B == 80) {
                GradientDrawable gradientDrawable2 = this.f46435k;
                Rect rect3 = this.f46433i;
                float f11 = this.A;
                gradientDrawable2.setBounds(((int) this.f46448x) + paddingLeft + rect3.left, (height - ((int) this.f46445u)) - ((int) f11), (paddingLeft + rect3.right) - ((int) this.f46450z), height - ((int) f11));
            } else {
                GradientDrawable gradientDrawable3 = this.f46435k;
                Rect rect4 = this.f46433i;
                int i7 = ((int) this.f46448x) + paddingLeft + rect4.left;
                float f12 = this.f46449y;
                gradientDrawable3.setBounds(i7, (int) f12, (paddingLeft + rect4.right) - ((int) this.f46450z), ((int) this.f46445u) + ((int) f12));
            }
            this.f46435k.setCornerRadius(this.f46447w);
            this.f46435k.draw(canvas);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i4) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i4, float f5, int i5) {
        this.f46430f = i4;
        this.f46431g = f5;
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
            this.f46430f = bundle.getInt("mCurrentTab");
            parcelable = bundle.getParcelable("instanceState");
            if (this.f46430f != 0 && this.f46429e.getChildCount() > 0) {
                s(this.f46430f);
                o();
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("mCurrentTab", this.f46430f);
        return bundle;
    }

    public void p(int i4) {
        int i5 = this.f46432h;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        q(i4, 0);
    }

    public void q(int i4, int i5) {
        int i6 = this.f46432h;
        if (i4 >= i6) {
            i4 = i6 - 1;
        }
        MsgView msgView = (MsgView) this.f46429e.getChildAt(i4).findViewById(R.id.rtv_msg_tip);
        if (msgView != null) {
            b1.b.b(msgView, i5);
            if (this.U.get(i4) == null || !this.U.get(i4).booleanValue()) {
                setMsgMargin(i4, 4.0f, 2.0f);
                this.U.put(i4, Boolean.TRUE);
            }
        }
    }

    protected int r(float f5) {
        return (int) ((f5 * this.f46426b.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public void setCurrentTab(int i4) {
        this.f46430f = i4;
        this.f46427c.setCurrentItem(i4);
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
        this.f46444t = i4;
        invalidate();
    }

    public void setIndicatorCornerRadius(float f5) {
        this.f46447w = h(f5);
        invalidate();
    }

    public void setIndicatorGravity(int i4) {
        this.B = i4;
        invalidate();
    }

    public void setIndicatorHeight(float f5) {
        this.f46445u = h(f5);
        invalidate();
    }

    public void setIndicatorMargin(float f5, float f6, float f7, float f8) {
        this.f46448x = h(f5);
        this.f46449y = h(f6);
        this.f46450z = h(f7);
        this.A = h(f8);
        invalidate();
    }

    public void setIndicatorStyle(int i4) {
        this.f46440p = i4;
        invalidate();
    }

    public void setIndicatorWidth(float f5) {
        this.f46446v = h(f5);
        invalidate();
    }

    public void setIndicatorWidthEqualTitle(boolean z4) {
        this.C = z4;
        invalidate();
    }

    public void setMsgMargin(int i4, float f5, float f6) {
        float f7;
        int i5 = this.f46432h;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        View childAt = this.f46429e.getChildAt(i4);
        MsgView msgView = (MsgView) childAt.findViewById(R.id.rtv_msg_tip);
        if (msgView != null) {
            this.T.setTextSize(this.J);
            float measureText = this.T.measureText(((TextView) childAt.findViewById(R.id.tv_tab_title)).getText().toString());
            float descent = this.T.descent() - this.T.ascent();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) msgView.getLayoutParams();
            float f8 = this.f46443s;
            if (f8 >= 0.0f) {
                f7 = f8 / 2.0f;
                measureText /= 2.0f;
            } else {
                f7 = this.f46441q;
            }
            marginLayoutParams.leftMargin = (int) (f7 + measureText + h(f5));
            int i6 = this.P;
            marginLayoutParams.topMargin = i6 > 0 ? (((int) (i6 - descent)) / 2) - h(f6) : 0;
            msgView.setLayoutParams(marginLayoutParams);
        }
    }

    public void setOnTabSelectListener(a1.b bVar) {
        this.V = bVar;
    }

    public void setSnapOnTabClick(boolean z4) {
        this.Q = z4;
    }

    public void setTabPadding(float f5) {
        this.f46441q = h(f5);
        t();
    }

    public void setTabSpaceEqual(boolean z4) {
        this.f46442r = z4;
        t();
    }

    public void setTabWidth(float f5) {
        this.f46443s = h(f5);
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
            this.f46427c = viewPager;
            viewPager.removeOnPageChangeListener(this);
            this.f46427c.addOnPageChangeListener(this);
            notifyDataSetChanged();
            return;
        }
        throw new IllegalStateException("ViewPager or ViewPager adapter can not be NULL !");
    }

    public BtReginSlidinTablayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BtReginSlidinTablayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f46433i = new Rect();
        this.f46434j = new Rect();
        this.f46435k = new GradientDrawable();
        this.f46436l = new Paint(1);
        this.f46437m = new Paint(1);
        this.f46438n = new Paint(1);
        this.f46439o = new Path();
        this.f46440p = 0;
        this.R = 0;
        this.T = new Paint(1);
        this.U = new SparseArray<>();
        setFillViewport(true);
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
        this.f46426b = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f46429e = linearLayout;
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
        this.f46430f = i4;
        this.f46427c.setCurrentItem(i4, z4);
    }

    public void setViewPager(ViewPager viewPager, String[] strArr) {
        if (viewPager != null && viewPager.getAdapter() != null) {
            if (strArr != null && strArr.length != 0) {
                if (strArr.length == viewPager.getAdapter().getCount()) {
                    this.f46427c = viewPager;
                    ArrayList<String> arrayList = new ArrayList<>();
                    this.f46428d = arrayList;
                    Collections.addAll(arrayList, strArr);
                    this.f46427c.removeOnPageChangeListener(this);
                    this.f46427c.addOnPageChangeListener(this);
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
                this.f46427c = viewPager;
                viewPager.setAdapter(new b(fragmentActivity.getSupportFragmentManager(), arrayList, strArr));
                this.f46427c.removeOnPageChangeListener(this);
                this.f46427c.addOnPageChangeListener(this);
                notifyDataSetChanged();
                return;
            }
            throw new IllegalStateException("Titles can not be EMPTY !");
        }
        throw new IllegalStateException("ViewPager can not be NULL !");
    }
}
