package com.join.mgps.customview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.mgsim.wufun.R;
import java.util.List;
import java.util.Locale;
/* loaded from: classes4.dex */
public class SlidingTabLayout1 extends HorizontalScrollView {
    private static final int[] J = {16842901, 16842904};
    protected int A;
    protected int B;
    protected Typeface C;
    protected int D;
    private int E;
    protected int F;
    protected Locale G;
    List<String> H;
    private d I;

    /* renamed from: b  reason: collision with root package name */
    protected LinearLayout.LayoutParams f47787b;

    /* renamed from: c  reason: collision with root package name */
    protected LinearLayout.LayoutParams f47788c;

    /* renamed from: d  reason: collision with root package name */
    private final PageListener f47789d;

    /* renamed from: e  reason: collision with root package name */
    public ViewPager.OnPageChangeListener f47790e;

    /* renamed from: f  reason: collision with root package name */
    protected LinearLayout f47791f;

    /* renamed from: g  reason: collision with root package name */
    protected ViewPager f47792g;

    /* renamed from: h  reason: collision with root package name */
    protected int f47793h;

    /* renamed from: i  reason: collision with root package name */
    protected int f47794i;

    /* renamed from: j  reason: collision with root package name */
    protected float f47795j;

    /* renamed from: k  reason: collision with root package name */
    protected Paint f47796k;

    /* renamed from: l  reason: collision with root package name */
    protected Paint f47797l;

    /* renamed from: m  reason: collision with root package name */
    protected int f47798m;

    /* renamed from: n  reason: collision with root package name */
    protected int f47799n;

    /* renamed from: o  reason: collision with root package name */
    protected int f47800o;

    /* renamed from: p  reason: collision with root package name */
    protected boolean f47801p;

    /* renamed from: q  reason: collision with root package name */
    protected boolean f47802q;

    /* renamed from: r  reason: collision with root package name */
    protected int f47803r;

    /* renamed from: s  reason: collision with root package name */
    protected int f47804s;

    /* renamed from: t  reason: collision with root package name */
    protected float f47805t;

    /* renamed from: u  reason: collision with root package name */
    protected int f47806u;

    /* renamed from: v  reason: collision with root package name */
    protected int f47807v;

    /* renamed from: w  reason: collision with root package name */
    protected int f47808w;

    /* renamed from: x  reason: collision with root package name */
    protected int f47809x;

    /* renamed from: y  reason: collision with root package name */
    protected int f47810y;

    /* renamed from: z  reason: collision with root package name */
    protected int f47811z;

    /* loaded from: classes4.dex */
    protected class PageListener implements ViewPager.OnPageChangeListener {
        protected PageListener() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i4) {
            if (i4 == 0) {
                SlidingTabLayout1 slidingTabLayout1 = SlidingTabLayout1.this;
                slidingTabLayout1.h(slidingTabLayout1.f47792g.getCurrentItem(), 0);
            }
            ViewPager.OnPageChangeListener onPageChangeListener = SlidingTabLayout1.this.f47790e;
            if (onPageChangeListener != null) {
                onPageChangeListener.onPageScrollStateChanged(i4);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i4, float f5, int i5) {
            SlidingTabLayout1 slidingTabLayout1 = SlidingTabLayout1.this;
            slidingTabLayout1.f47794i = i4;
            slidingTabLayout1.f47795j = f5;
            if (slidingTabLayout1.f47791f.getChildAt(i4) != null) {
                SlidingTabLayout1 slidingTabLayout12 = SlidingTabLayout1.this;
                slidingTabLayout12.h(i4, (int) (slidingTabLayout12.f47791f.getChildAt(i4).getWidth() * f5));
            }
            SlidingTabLayout1.this.invalidate();
            ViewPager.OnPageChangeListener onPageChangeListener = SlidingTabLayout1.this.f47790e;
            if (onPageChangeListener != null) {
                onPageChangeListener.onPageScrolled(i4, f5, i5);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i4) {
            SlidingTabLayout1.this.i();
            ViewPager.OnPageChangeListener onPageChangeListener = SlidingTabLayout1.this.f47790e;
            if (onPageChangeListener != null) {
                onPageChangeListener.onPageSelected(i4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        int f47813b;

        /* loaded from: classes4.dex */
        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        /* synthetic */ SavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f47813b);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f47813b = parcel.readInt();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        @SuppressLint({"NewApi"})
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 16) {
                SlidingTabLayout1.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            } else {
                SlidingTabLayout1.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            SlidingTabLayout1 slidingTabLayout1 = SlidingTabLayout1.this;
            slidingTabLayout1.f47794i = slidingTabLayout1.f47792g.getCurrentItem();
            SlidingTabLayout1 slidingTabLayout12 = SlidingTabLayout1.this;
            slidingTabLayout12.h(slidingTabLayout12.f47794i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f47815b;

        b(int i4) {
            this.f47815b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SlidingTabLayout1 slidingTabLayout1 = SlidingTabLayout1.this;
            ViewPager viewPager = slidingTabLayout1.f47792g;
            if (viewPager != null) {
                viewPager.setCurrentItem(this.f47815b);
                return;
            }
            slidingTabLayout1.f47794i = this.f47815b;
            slidingTabLayout1.I.a(SlidingTabLayout1.this.f47794i);
            SlidingTabLayout1.this.i();
        }
    }

    /* loaded from: classes4.dex */
    public interface c {
        int a(int i4);
    }

    /* loaded from: classes4.dex */
    public interface d {
        void a(int i4);
    }

    public SlidingTabLayout1(Context context) {
        this(context, null);
    }

    protected void b(int i4, int i5) {
        ImageButton imageButton = new ImageButton(getContext());
        imageButton.setImageResource(i5);
        c(i4, imageButton);
    }

    protected void c(int i4, View view) {
        view.setFocusable(true);
        view.setOnClickListener(new b(i4));
        int i5 = this.f47808w;
        view.setPadding(i5, 0, i5, 0);
        this.f47791f.addView(view, i4, this.f47801p ? this.f47788c : this.f47787b);
    }

    protected void d(int i4, String str) {
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setGravity(17);
        textView.setSingleLine();
        c(i4, textView);
    }

    protected void e(Canvas canvas) {
        View childAt;
        int i4;
        if (isInEditMode() || this.f47793h == 0) {
            return;
        }
        int height = getHeight();
        this.f47796k.setColor(this.f47798m);
        float left = childAt.getLeft() * 1.0f;
        float right = this.f47791f.getChildAt(this.f47794i).getRight();
        if (this.f47795j > 0.0f && (i4 = this.f47794i) < this.f47793h - 1) {
            View childAt2 = this.f47791f.getChildAt(i4 + 1);
            float f5 = this.f47795j;
            left = (childAt2.getLeft() * f5) + ((1.0f - f5) * left);
            right = (childAt2.getRight() * f5) + ((1.0f - f5) * right);
        }
        float f6 = (int) (((1.0f - this.f47805t) * (right - left)) / 2.0f);
        float f7 = height;
        canvas.drawRect(left + f6, height - this.f47804s, right - f6, f7, this.f47796k);
        this.f47796k.setColor(this.f47799n);
        canvas.drawRect(0.0f, height - this.f47806u, this.f47791f.getWidth(), f7, this.f47796k);
        this.f47797l.setColor(this.f47800o);
        for (int i5 = 0; i5 < this.f47793h - 1; i5++) {
            View childAt3 = this.f47791f.getChildAt(i5);
            canvas.drawLine(childAt3.getRight(), this.f47807v, childAt3.getRight(), height - this.f47807v, this.f47797l);
        }
    }

    public boolean f() {
        return this.f47802q;
    }

    public void g() {
        this.f47791f.removeAllViews();
        ViewPager viewPager = this.f47792g;
        int i4 = 0;
        if (viewPager != null && viewPager.getAdapter() != null) {
            this.f47793h = this.f47792g.getAdapter().getCount();
            while (i4 < this.f47793h) {
                if (this.f47792g.getAdapter() instanceof c) {
                    b(i4, ((c) this.f47792g.getAdapter()).a(i4));
                } else {
                    d(i4, this.f47792g.getAdapter().getPageTitle(i4).toString());
                }
                i4++;
            }
            i();
            getViewTreeObserver().addOnGlobalLayoutListener(new a());
            return;
        }
        this.f47793h = this.H.size();
        while (i4 < this.f47793h) {
            d(i4, this.H.get(i4));
            i4++;
        }
        i();
    }

    public int getDividerColor() {
        return this.f47800o;
    }

    public int getDividerPadding() {
        return this.f47807v;
    }

    public int getIndicatorColor() {
        return this.f47798m;
    }

    public int getIndicatorHeight() {
        return this.f47804s;
    }

    public float getIndicatorRatioH() {
        return this.f47805t;
    }

    public int getScrollOffset() {
        return this.f47803r;
    }

    public boolean getShouldExpand() {
        return this.f47801p;
    }

    public int getTabBackground() {
        return this.F;
    }

    public int getTabPaddingLeftRight() {
        return this.f47808w;
    }

    public int getTextColor() {
        return this.A;
    }

    public int getTextSize() {
        return this.f47810y;
    }

    public int getUnderlineColor() {
        return this.f47799n;
    }

    public int getUnderlineHeight() {
        return this.f47806u;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void h(int i4, int i5) {
        if (this.f47793h == 0) {
            return;
        }
        int left = this.f47791f.getChildAt(i4).getLeft() + i5;
        if (i4 > 0 || i5 > 0) {
            left -= this.f47803r;
        }
        if (left != this.E) {
            this.E = left;
            scrollTo(left, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void i() {
        for (int i4 = 0; i4 < this.f47793h; i4++) {
            View childAt = this.f47791f.getChildAt(i4);
            childAt.setBackgroundResource(this.F);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                textView.setTextSize(0, this.f47810y);
                textView.setTypeface(this.C, this.D);
                textView.setTextColor(this.A);
                ViewPager viewPager = this.f47792g;
                if (viewPager != null && i4 == viewPager.getCurrentItem()) {
                    textView.setTextColor(this.B);
                }
                if (this.H != null && i4 == this.f47794i) {
                    textView.setTextColor(this.B);
                }
                if (this.f47802q) {
                    if (Build.VERSION.SDK_INT >= 14) {
                        textView.setAllCaps(true);
                    } else {
                        textView.setText(textView.getText().toString().toUpperCase(this.G));
                    }
                }
            }
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        e(canvas);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f47794i = savedState.f47813b;
        requestLayout();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f47813b = this.f47794i;
        return savedState;
    }

    public void setAllCaps(boolean z4) {
        this.f47802q = z4;
    }

    public void setDividerColor(int i4) {
        this.f47800o = i4;
        invalidate();
    }

    public void setDividerColorResource(int i4) {
        this.f47800o = getResources().getColor(i4);
        invalidate();
    }

    public void setDividerPadding(int i4) {
        this.f47807v = i4;
        invalidate();
    }

    public void setIndicatorColor(int i4) {
        this.f47798m = i4;
        invalidate();
    }

    public void setIndicatorColorResource(int i4) {
        this.f47798m = getResources().getColor(i4);
        invalidate();
    }

    public void setIndicatorHeight(int i4) {
        this.f47804s = i4;
        invalidate();
    }

    public void setIndicatorRatioH(float f5) {
        this.f47805t = f5;
        invalidate();
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.f47790e = onPageChangeListener;
    }

    public void setOntabselected(d dVar) {
        this.I = dVar;
    }

    public void setScrollOffset(int i4) {
        this.f47803r = i4;
        invalidate();
    }

    public void setShouldExpand(boolean z4) {
        this.f47801p = z4;
        requestLayout();
    }

    public void setTabBackground(int i4) {
        this.F = i4;
    }

    public void setTabDatas(List<String> list) {
        this.H = list;
        g();
    }

    public void setTabPaddingLeftRight(int i4) {
        this.f47808w = i4;
        i();
    }

    public void setTextColor(int i4) {
        this.A = i4;
        i();
    }

    public void setTextColorResource(int i4) {
        this.A = getResources().getColor(i4);
        i();
    }

    public void setTextSize(int i4) {
        this.f47810y = i4;
        i();
    }

    public void setTypeface(Typeface typeface, int i4) {
        this.C = typeface;
        this.D = i4;
        i();
    }

    public void setUnderlineColor(int i4) {
        this.f47799n = i4;
        invalidate();
    }

    public void setUnderlineColorResource(int i4) {
        this.f47799n = getResources().getColor(i4);
        invalidate();
    }

    public void setUnderlineHeight(int i4) {
        this.f47806u = i4;
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        this.f47792g = viewPager;
        if (viewPager.getAdapter() != null) {
            viewPager.setOnPageChangeListener(this.f47789d);
            g();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }

    public SlidingTabLayout1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingTabLayout1(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f47789d = new PageListener();
        this.f47794i = 0;
        this.f47795j = 0.0f;
        this.f47798m = -756480;
        this.f47799n = 16020736;
        this.f47800o = 16777215;
        this.f47801p = false;
        this.f47802q = true;
        this.f47803r = 52;
        this.f47804s = 3;
        this.f47805t = 0.3f;
        this.f47806u = 1;
        this.f47807v = 12;
        this.f47808w = 24;
        this.f47809x = 1;
        this.f47810y = 14;
        this.f47811z = 16;
        this.A = -11711155;
        this.B = -756480;
        this.C = null;
        this.D = 0;
        this.E = 0;
        this.F = R.drawable.background_tab;
        this.H = null;
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f47791f = linearLayout;
        linearLayout.setOrientation(0);
        this.f47791f.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.f47791f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f47803r = (int) TypedValue.applyDimension(1, this.f47803r, displayMetrics);
        this.f47804s = (int) TypedValue.applyDimension(1, this.f47804s, displayMetrics);
        this.f47806u = (int) TypedValue.applyDimension(0, this.f47806u, displayMetrics);
        this.f47807v = (int) TypedValue.applyDimension(1, this.f47807v, displayMetrics);
        this.f47808w = (int) TypedValue.applyDimension(1, this.f47808w, displayMetrics);
        this.f47809x = (int) TypedValue.applyDimension(1, this.f47809x, displayMetrics);
        this.f47810y = (int) TypedValue.applyDimension(1, this.f47810y, displayMetrics);
        this.f47811z = (int) TypedValue.applyDimension(1, this.f47811z, displayMetrics);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SlidingTab);
        this.f47810y = obtainStyledAttributes.getDimensionPixelSize(3, this.f47810y);
        this.f47811z = obtainStyledAttributes.getDimensionPixelSize(2, this.f47811z);
        this.A = obtainStyledAttributes.getColor(1, this.A);
        this.B = obtainStyledAttributes.getColor(0, this.B);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R.styleable.PagerSlidingTabStrip);
        this.f47798m = obtainStyledAttributes2.getColor(2, this.f47798m);
        this.f47799n = obtainStyledAttributes2.getColor(9, this.f47799n);
        this.f47800o = obtainStyledAttributes2.getColor(0, this.f47800o);
        this.f47804s = obtainStyledAttributes2.getDimensionPixelSize(3, this.f47804s);
        this.f47806u = obtainStyledAttributes2.getDimensionPixelSize(10, this.f47806u);
        this.f47807v = obtainStyledAttributes2.getDimensionPixelSize(1, this.f47807v);
        this.f47808w = obtainStyledAttributes2.getDimensionPixelSize(7, this.f47808w);
        this.F = obtainStyledAttributes2.getResourceId(6, this.F);
        this.f47801p = obtainStyledAttributes2.getBoolean(5, this.f47801p);
        this.f47803r = obtainStyledAttributes2.getDimensionPixelSize(4, this.f47803r);
        this.f47802q = obtainStyledAttributes2.getBoolean(8, this.f47802q);
        obtainStyledAttributes2.recycle();
        Paint paint = new Paint();
        this.f47796k = paint;
        paint.setAntiAlias(true);
        this.f47796k.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f47797l = paint2;
        paint2.setAntiAlias(true);
        this.f47797l.setStrokeWidth(this.f47809x);
        this.f47787b = new LinearLayout.LayoutParams(-2, -1);
        this.f47788c = new LinearLayout.LayoutParams(0, -1, 1.0f);
        if (this.G == null) {
            this.G = getResources().getConfiguration().locale;
        }
    }
}
