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
import com.flyco.tablayout.widget.MsgView;
import com.join.android.app.mgsim.wufun.R;
import java.util.ArrayList;
import java.util.Collections;
/* loaded from: classes4.dex */
public class SlidingTabLayoutNoViewPager extends HorizontalScrollView {
    private static final int A1 = 2;
    private static final int V = 0;
    private static final int W = 1;

    /* renamed from: p0  reason: collision with root package name */
    private static final int f47936p0 = 2;

    /* renamed from: p1  reason: collision with root package name */
    private static final int f47937p1 = 0;

    /* renamed from: v1  reason: collision with root package name */
    private static final int f47938v1 = 1;
    private int A;
    private boolean B;
    private int C;
    private float D;
    private int E;
    private int F;
    private float G;
    private float H;
    private float I;
    private int J;
    private int K;
    private int L;
    private boolean M;
    private int N;
    private int O;
    private boolean P;
    private int Q;
    private float R;
    private Paint S;
    private SparseArray<Boolean> T;
    private a1.b U;

    /* renamed from: b  reason: collision with root package name */
    private Context f47939b;

    /* renamed from: c  reason: collision with root package name */
    private ArrayList<String> f47940c;

    /* renamed from: d  reason: collision with root package name */
    private LinearLayout f47941d;

    /* renamed from: e  reason: collision with root package name */
    private int f47942e;

    /* renamed from: f  reason: collision with root package name */
    private float f47943f;

    /* renamed from: g  reason: collision with root package name */
    private int f47944g;

    /* renamed from: h  reason: collision with root package name */
    private Rect f47945h;

    /* renamed from: i  reason: collision with root package name */
    private Rect f47946i;

    /* renamed from: j  reason: collision with root package name */
    private GradientDrawable f47947j;

    /* renamed from: k  reason: collision with root package name */
    private Paint f47948k;

    /* renamed from: l  reason: collision with root package name */
    private Paint f47949l;

    /* renamed from: m  reason: collision with root package name */
    private Paint f47950m;

    /* renamed from: n  reason: collision with root package name */
    private Path f47951n;

    /* renamed from: o  reason: collision with root package name */
    private int f47952o;

    /* renamed from: p  reason: collision with root package name */
    private float f47953p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f47954q;

    /* renamed from: r  reason: collision with root package name */
    private float f47955r;

    /* renamed from: s  reason: collision with root package name */
    private int f47956s;

    /* renamed from: t  reason: collision with root package name */
    private float f47957t;

    /* renamed from: u  reason: collision with root package name */
    private float f47958u;

    /* renamed from: v  reason: collision with root package name */
    private float f47959v;

    /* renamed from: w  reason: collision with root package name */
    private float f47960w;

    /* renamed from: x  reason: collision with root package name */
    private float f47961x;

    /* renamed from: y  reason: collision with root package name */
    private float f47962y;

    /* renamed from: z  reason: collision with root package name */
    private float f47963z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int indexOfChild = SlidingTabLayoutNoViewPager.this.f47941d.indexOfChild(view);
            if (indexOfChild != -1) {
                if (SlidingTabLayoutNoViewPager.this.Q != indexOfChild) {
                    SlidingTabLayoutNoViewPager.this.Q = indexOfChild;
                    if (SlidingTabLayoutNoViewPager.this.U != null) {
                        SlidingTabLayoutNoViewPager.this.U.onTabSelect(indexOfChild);
                        SlidingTabLayoutNoViewPager.this.u(indexOfChild);
                        SlidingTabLayoutNoViewPager.this.f47942e = indexOfChild;
                        SlidingTabLayoutNoViewPager.this.invalidate();
                        SlidingTabLayoutNoViewPager.this.o();
                    }
                } else if (SlidingTabLayoutNoViewPager.this.U != null) {
                    SlidingTabLayoutNoViewPager.this.u(indexOfChild);
                    SlidingTabLayoutNoViewPager.this.f47942e = indexOfChild;
                    SlidingTabLayoutNoViewPager.this.invalidate();
                    SlidingTabLayoutNoViewPager.this.U.onTabReselect(indexOfChild);
                    SlidingTabLayoutNoViewPager.this.o();
                }
            }
        }
    }

    public SlidingTabLayoutNoViewPager(Context context) {
        this(context, null, 0);
    }

    private void g(int i4, String str, View view) {
        LinearLayout.LayoutParams layoutParams;
        TextView textView = (TextView) view.findViewById(R.id.tv_tab_title);
        if (textView != null && str != null) {
            textView.setText(str);
        }
        view.setOnClickListener(new a());
        if (this.f47954q) {
            layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
        } else {
            layoutParams = new LinearLayout.LayoutParams(-2, -1);
        }
        if (this.f47955r > 0.0f) {
            layoutParams = new LinearLayout.LayoutParams((int) this.f47955r, -1);
        }
        layoutParams.setMargins(getResources().getDimensionPixelOffset(R.dimen.wdp25), 0, 0, 0);
        this.f47941d.addView(view, i4, layoutParams);
    }

    private void h() {
        int i4;
        View childAt = this.f47941d.getChildAt(this.f47942e);
        float left = childAt.getLeft();
        float right = childAt.getRight();
        if (this.f47952o == 0 && this.B) {
            this.S.setTextSize(this.I);
            this.R = ((right - left) - this.S.measureText(((TextView) childAt.findViewById(R.id.tv_tab_title)).getText().toString())) / 2.0f;
        }
        int i5 = this.f47942e;
        if (i5 < this.f47944g - 1) {
            View childAt2 = this.f47941d.getChildAt(i5 + 1);
            float left2 = childAt2.getLeft();
            float right2 = childAt2.getRight();
            float f5 = this.f47943f;
            left += (left2 - left) * f5;
            right += f5 * (right2 - right);
            if (this.f47952o == 0 && this.B) {
                this.S.setTextSize(this.I);
                float f6 = this.R;
                this.R = f6 + (this.f47943f * ((((right2 - left2) - this.S.measureText(((TextView) childAt2.findViewById(R.id.tv_tab_title)).getText().toString())) / 2.0f) - f6));
            }
        }
        Rect rect = this.f47945h;
        int i6 = (int) left;
        rect.left = i6;
        int i7 = (int) right;
        rect.right = i7;
        if (this.f47952o == 0 && this.B) {
            float f7 = this.R;
            rect.left = (int) ((left + f7) - 1.0f);
            rect.right = (int) ((right - f7) - 1.0f);
        }
        Rect rect2 = this.f47946i;
        rect2.left = i6;
        rect2.right = i7;
        if (this.f47958u < 0.0f) {
            return;
        }
        float left3 = childAt.getLeft() + ((childAt.getWidth() - this.f47958u) / 2.0f);
        if (this.f47942e < this.f47944g - 1) {
            left3 += this.f47943f * ((childAt.getWidth() / 2) + (this.f47941d.getChildAt(i4 + 1).getWidth() / 2));
        }
        Rect rect3 = this.f47945h;
        int i8 = (int) left3;
        rect3.left = i8;
        rect3.right = (int) (i8 + this.f47958u);
    }

    private void p(Context context, AttributeSet attributeSet) {
        float f5;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.flyco.tablayout.R.styleable.SlidingTabLayout);
        int i4 = obtainStyledAttributes.getInt(11, 0);
        this.f47952o = i4;
        this.f47956s = obtainStyledAttributes.getColor(3, Color.parseColor(i4 == 2 ? "#4B6A87" : "#ffffff"));
        int i5 = this.f47952o;
        if (i5 == 1) {
            f5 = 4.0f;
        } else {
            f5 = i5 == 2 ? -1 : 2;
        }
        this.f47957t = obtainStyledAttributes.getDimension(6, i(f5));
        this.f47958u = obtainStyledAttributes.getDimension(12, i(this.f47952o == 1 ? 10.0f : -1.0f));
        this.f47959v = obtainStyledAttributes.getDimension(4, i(this.f47952o == 2 ? -1.0f : 0.0f));
        this.f47960w = obtainStyledAttributes.getDimension(8, i(0.0f));
        this.f47961x = obtainStyledAttributes.getDimension(10, i(this.f47952o == 2 ? 7.0f : 0.0f));
        this.f47962y = obtainStyledAttributes.getDimension(9, i(0.0f));
        this.f47963z = obtainStyledAttributes.getDimension(7, i(this.f47952o != 2 ? 0.0f : 7.0f));
        this.A = obtainStyledAttributes.getInt(5, 80);
        this.B = obtainStyledAttributes.getBoolean(13, false);
        this.C = obtainStyledAttributes.getColor(22, Color.parseColor("#ffffff"));
        this.D = obtainStyledAttributes.getDimension(24, i(0.0f));
        this.E = obtainStyledAttributes.getInt(23, 80);
        this.F = obtainStyledAttributes.getColor(0, Color.parseColor("#ffffff"));
        this.G = obtainStyledAttributes.getDimension(2, i(0.0f));
        this.H = obtainStyledAttributes.getDimension(1, i(12.0f));
        this.I = obtainStyledAttributes.getDimension(21, t(14.0f));
        this.J = obtainStyledAttributes.getColor(19, Color.parseColor("#ffffff"));
        this.K = obtainStyledAttributes.getColor(20, Color.parseColor("#AAffffff"));
        this.L = obtainStyledAttributes.getInt(18, 0);
        this.M = obtainStyledAttributes.getBoolean(17, false);
        this.f47954q = obtainStyledAttributes.getBoolean(15, false);
        float dimension = obtainStyledAttributes.getDimension(16, i(-1.0f));
        this.f47955r = dimension;
        this.f47953p = obtainStyledAttributes.getDimension(14, (this.f47954q || dimension > 0.0f) ? i(0.0f) : i(20.0f));
        obtainStyledAttributes.recycle();
    }

    private void q() {
        if (this.f47944g <= 0) {
            return;
        }
        int left = (this.f47941d.getChildAt(this.f47942e).getLeft() + 0) - getResources().getDimensionPixelOffset(R.dimen.wdp25);
        if (this.f47942e > 0) {
            int width = left - ((getWidth() / 2) - getPaddingLeft());
            h();
            Rect rect = this.f47946i;
            left = width + ((rect.right - rect.left) / 2);
        }
        if (left != this.N) {
            this.N = left;
            scrollTo(left, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(int i4) {
        int i5 = 0;
        while (i5 < this.f47944g) {
            View childAt = this.f47941d.getChildAt(i5);
            boolean z4 = i5 == i4;
            TextView textView = (TextView) childAt.findViewById(R.id.tv_tab_title);
            if (textView != null) {
                textView.setTextColor(z4 ? this.J : this.K);
                if (this.L == 1) {
                    textView.getPaint().setFakeBoldText(z4);
                }
            }
            i5++;
        }
    }

    private void v() {
        int i4 = 0;
        while (i4 < this.f47944g) {
            TextView textView = (TextView) this.f47941d.getChildAt(i4).findViewById(R.id.tv_tab_title);
            if (textView != null) {
                textView.setTextColor(i4 == this.f47942e ? this.J : this.K);
                textView.setTextSize(0, this.I);
                float f5 = this.f47953p;
                textView.setPadding((int) f5, 0, (int) f5, 0);
                if (this.M) {
                    textView.setText(textView.getText().toString().toUpperCase());
                }
                int i5 = this.L;
                if (i5 == 2) {
                    textView.getPaint().setFakeBoldText(true);
                } else if (i5 == 0) {
                    textView.getPaint().setFakeBoldText(false);
                }
                if (i4 == this.Q) {
                    textView.setSelected(true);
                } else {
                    textView.setSelected(false);
                }
            }
            i4++;
        }
    }

    public int getCurrentTab() {
        return this.f47942e;
    }

    public int getDividerColor() {
        return this.F;
    }

    public float getDividerPadding() {
        return this.H;
    }

    public float getDividerWidth() {
        return this.G;
    }

    public int getIndicatorColor() {
        return this.f47956s;
    }

    public float getIndicatorCornerRadius() {
        return this.f47959v;
    }

    public float getIndicatorHeight() {
        return this.f47957t;
    }

    public float getIndicatorMarginBottom() {
        return this.f47963z;
    }

    public float getIndicatorMarginLeft() {
        return this.f47960w;
    }

    public float getIndicatorMarginRight() {
        return this.f47962y;
    }

    public float getIndicatorMarginTop() {
        return this.f47961x;
    }

    public int getIndicatorStyle() {
        return this.f47952o;
    }

    public float getIndicatorWidth() {
        return this.f47958u;
    }

    public String getSelectTabName() {
        ArrayList<String> arrayList = this.f47940c;
        if (arrayList != null) {
            int size = arrayList.size();
            int i4 = this.Q;
            return size > i4 ? this.f47940c.get(i4) : "";
        }
        return "";
    }

    public int getTabCount() {
        return this.f47944g;
    }

    public float getTabPadding() {
        return this.f47953p;
    }

    public float getTabWidth() {
        return this.f47955r;
    }

    public int getTextBold() {
        return this.L;
    }

    public int getTextSelectColor() {
        return this.J;
    }

    public int getTextUnselectColor() {
        return this.K;
    }

    public float getTextsize() {
        return this.I;
    }

    public int getUnderlineColor() {
        return this.C;
    }

    public float getUnderlineHeight() {
        return this.D;
    }

    protected int i(float f5) {
        return (int) ((f5 * this.f47939b.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public MsgView j(int i4) {
        int i5 = this.f47944g;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        return (MsgView) this.f47941d.getChildAt(i4).findViewById(R.id.rtv_msg_tip);
    }

    public TextView k(int i4) {
        return (TextView) this.f47941d.getChildAt(i4).findViewById(R.id.tv_tab_title);
    }

    public void l(int i4) {
        int i5 = this.f47944g;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        MsgView msgView = (MsgView) this.f47941d.getChildAt(i4).findViewById(R.id.rtv_msg_tip);
        if (msgView != null) {
            msgView.setVisibility(8);
        }
    }

    public boolean m() {
        return this.f47954q;
    }

    public boolean n() {
        return this.M;
    }

    public void o() {
        this.f47941d.removeAllViews();
        this.f47944g = this.f47940c.size();
        for (int i4 = 0; i4 < this.f47944g; i4++) {
            g(i4, this.f47940c.get(i4).toString(), View.inflate(this.f47939b, R.layout.tab_item_layout, null));
        }
        v();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Rect rect;
        super.onDraw(canvas);
        if (isInEditMode() || this.f47944g <= 0) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        float f5 = this.G;
        if (f5 > 0.0f) {
            this.f47949l.setStrokeWidth(f5);
            this.f47949l.setColor(this.F);
            for (int i4 = 0; i4 < this.f47944g - 1; i4++) {
                View childAt = this.f47941d.getChildAt(i4);
                canvas.drawLine(childAt.getRight() + paddingLeft, this.H, childAt.getRight() + paddingLeft, height - this.H, this.f47949l);
            }
        }
        if (this.D > 0.0f) {
            this.f47948k.setColor(this.C);
            if (this.E == 80) {
                float f6 = height;
                canvas.drawRect(paddingLeft, f6 - this.D, this.f47941d.getWidth() + paddingLeft, f6, this.f47948k);
            } else {
                canvas.drawRect(paddingLeft, 0.0f, this.f47941d.getWidth() + paddingLeft, this.D, this.f47948k);
            }
        }
        h();
        int i5 = this.f47952o;
        if (i5 == 1) {
            if (this.f47957t > 0.0f) {
                this.f47950m.setColor(this.f47956s);
                this.f47951n.reset();
                float f7 = height;
                this.f47951n.moveTo(this.f47945h.left + paddingLeft, f7);
                Path path = this.f47951n;
                Rect rect2 = this.f47945h;
                path.lineTo((rect2.left / 2) + paddingLeft + (rect2.right / 2), f7 - this.f47957t);
                this.f47951n.lineTo(paddingLeft + this.f47945h.right, f7);
                this.f47951n.close();
                canvas.drawPath(this.f47951n, this.f47950m);
            }
        } else if (i5 == 2) {
            if (this.f47957t < 0.0f) {
                this.f47957t = (height - this.f47961x) - this.f47963z;
            }
            float f8 = this.f47957t;
            if (f8 > 0.0f) {
                float f9 = this.f47959v;
                if (f9 < 0.0f || f9 > f8 / 2.0f) {
                    this.f47959v = f8 / 2.0f;
                }
                this.f47947j.setColor(this.f47956s);
                GradientDrawable gradientDrawable = this.f47947j;
                int i6 = ((int) this.f47960w) + paddingLeft + this.f47945h.left;
                float f10 = this.f47961x;
                gradientDrawable.setBounds(i6, (int) f10, (int) ((paddingLeft + rect.right) - this.f47962y), (int) (f10 + this.f47957t));
                this.f47947j.setCornerRadius(this.f47959v);
                this.f47947j.draw(canvas);
            }
        } else if (this.f47957t > 0.0f) {
            this.f47947j.setColor(this.f47956s);
            if (this.A == 80) {
                GradientDrawable gradientDrawable2 = this.f47947j;
                Rect rect3 = this.f47945h;
                float f11 = this.f47963z;
                gradientDrawable2.setBounds(((int) this.f47960w) + paddingLeft + rect3.left, (height - ((int) this.f47957t)) - ((int) f11), (paddingLeft + rect3.right) - ((int) this.f47962y), height - ((int) f11));
            } else {
                GradientDrawable gradientDrawable3 = this.f47947j;
                Rect rect4 = this.f47945h;
                int i7 = ((int) this.f47960w) + paddingLeft + rect4.left;
                float f12 = this.f47961x;
                gradientDrawable3.setBounds(i7, (int) f12, (paddingLeft + rect4.right) - ((int) this.f47962y), ((int) this.f47957t) + ((int) f12));
            }
            this.f47947j.setCornerRadius(this.f47959v);
            this.f47947j.draw(canvas);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f47942e = bundle.getInt("mCurrentTab");
            parcelable = bundle.getParcelable("instanceState");
            if (this.f47942e != 0 && this.f47941d.getChildCount() > 0) {
                u(this.f47942e);
                q();
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("mCurrentTab", this.f47942e);
        return bundle;
    }

    public void r(int i4) {
        int i5 = this.f47944g;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        s(i4, 0);
    }

    public void s(int i4, int i5) {
        int i6 = this.f47944g;
        if (i4 >= i6) {
            i4 = i6 - 1;
        }
        MsgView msgView = (MsgView) this.f47941d.getChildAt(i4).findViewById(R.id.rtv_msg_tip);
        if (msgView != null) {
            b1.b.b(msgView, i5);
            if (this.T.get(i4) == null || !this.T.get(i4).booleanValue()) {
                setMsgMargin(i4, 4.0f, 2.0f);
                this.T.put(i4, Boolean.TRUE);
            }
        }
    }

    public void setDividerColor(int i4) {
        this.F = i4;
        invalidate();
    }

    public void setDividerPadding(float f5) {
        this.H = i(f5);
        invalidate();
    }

    public void setDividerWidth(float f5) {
        this.G = i(f5);
        invalidate();
    }

    public void setIndicatorColor(int i4) {
        this.f47956s = i4;
        invalidate();
    }

    public void setIndicatorCornerRadius(float f5) {
        this.f47959v = i(f5);
        invalidate();
    }

    public void setIndicatorGravity(int i4) {
        this.A = i4;
        invalidate();
    }

    public void setIndicatorHeight(float f5) {
        this.f47957t = i(f5);
        invalidate();
    }

    public void setIndicatorMargin(float f5, float f6, float f7, float f8) {
        this.f47960w = i(f5);
        this.f47961x = i(f6);
        this.f47962y = i(f7);
        this.f47963z = i(f8);
        invalidate();
    }

    public void setIndicatorStyle(int i4) {
        this.f47952o = i4;
        invalidate();
    }

    public void setIndicatorWidth(float f5) {
        this.f47958u = i(f5);
        invalidate();
    }

    public void setIndicatorWidthEqualTitle(boolean z4) {
        this.B = z4;
        invalidate();
    }

    public void setItemSelected(int i4) {
        if (i4 != -1) {
            if (this.Q != i4) {
                this.Q = i4;
                a1.b bVar = this.U;
                if (bVar != null) {
                    bVar.onTabSelect(i4);
                    u(i4);
                    this.f47942e = i4;
                    this.f47943f = i4;
                    invalidate();
                    q();
                    o();
                    return;
                }
                u(i4);
                this.f47942e = i4;
                this.f47943f = i4;
                invalidate();
                q();
                o();
            } else if (this.U != null) {
                u(i4);
                this.f47942e = i4;
                this.f47943f = i4;
                q();
                invalidate();
                this.U.onTabReselect(i4);
                o();
            } else {
                u(i4);
                this.f47943f = i4;
                this.f47942e = i4;
                q();
                invalidate();
                o();
            }
        }
    }

    public void setMsgMargin(int i4, float f5, float f6) {
        float f7;
        int i5 = this.f47944g;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        View childAt = this.f47941d.getChildAt(i4);
        MsgView msgView = (MsgView) childAt.findViewById(R.id.rtv_msg_tip);
        if (msgView != null) {
            this.S.setTextSize(this.I);
            float measureText = this.S.measureText(((TextView) childAt.findViewById(R.id.tv_tab_title)).getText().toString());
            float descent = this.S.descent() - this.S.ascent();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) msgView.getLayoutParams();
            float f8 = this.f47955r;
            if (f8 >= 0.0f) {
                f7 = f8 / 2.0f;
                measureText /= 2.0f;
            } else {
                f7 = this.f47953p;
            }
            marginLayoutParams.leftMargin = (int) (f7 + measureText + i(f5));
            int i6 = this.O;
            marginLayoutParams.topMargin = i6 > 0 ? (((int) (i6 - descent)) / 2) - i(f6) : 0;
            msgView.setLayoutParams(marginLayoutParams);
        }
    }

    public void setOnTabSelectListener(a1.b bVar) {
        this.U = bVar;
    }

    public void setSnapOnTabClick(boolean z4) {
        this.P = z4;
    }

    public void setTabPadding(float f5) {
        this.f47953p = i(f5);
        v();
    }

    public void setTabSpaceEqual(boolean z4) {
        this.f47954q = z4;
        v();
    }

    public void setTabWidth(float f5) {
        this.f47955r = i(f5);
        v();
    }

    public void setTextAllCaps(boolean z4) {
        this.M = z4;
        v();
    }

    public void setTextBold(int i4) {
        this.L = i4;
        v();
    }

    public void setTextSelectColor(int i4) {
        this.J = i4;
        v();
    }

    public void setTextUnselectColor(int i4) {
        this.K = i4;
        v();
    }

    public void setTextsize(float f5) {
        this.I = t(f5);
        v();
    }

    public void setUnderlineColor(int i4) {
        this.C = i4;
        invalidate();
    }

    public void setUnderlineGravity(int i4) {
        this.E = i4;
        invalidate();
    }

    public void setUnderlineHeight(float f5) {
        this.D = i(f5);
        invalidate();
    }

    public void setmTitles(String[] strArr) {
        ArrayList<String> arrayList = new ArrayList<>();
        this.f47940c = arrayList;
        Collections.addAll(arrayList, strArr);
        o();
    }

    protected int t(float f5) {
        return (int) ((f5 * this.f47939b.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public SlidingTabLayoutNoViewPager(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingTabLayoutNoViewPager(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f47945h = new Rect();
        this.f47946i = new Rect();
        this.f47947j = new GradientDrawable();
        this.f47948k = new Paint(1);
        this.f47949l = new Paint(1);
        this.f47950m = new Paint(1);
        this.f47951n = new Path();
        this.f47952o = 0;
        this.Q = 0;
        this.S = new Paint(1);
        this.T = new SparseArray<>();
        setFillViewport(true);
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
        this.f47939b = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f47941d = linearLayout;
        addView(linearLayout);
        p(context, attributeSet);
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "layout_height");
        if (attributeValue.equals("-1") || attributeValue.equals("-2")) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842997});
        this.O = obtainStyledAttributes.getDimensionPixelSize(0, -2);
        obtainStyledAttributes.recycle();
    }
}
