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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.mgsim.wufun.R;
import java.util.Locale;
/* loaded from: classes4.dex */
public class SlidingTabLayout3 extends HorizontalScrollView {
    private static final int[] I = {16842901, 16842904};
    private int A;
    private Typeface B;
    private int C;
    private int D;
    private int E;
    private Locale F;
    private int G;
    private boolean H;

    /* renamed from: b  reason: collision with root package name */
    protected LinearLayout.LayoutParams f47833b;

    /* renamed from: c  reason: collision with root package name */
    protected LinearLayout.LayoutParams f47834c;

    /* renamed from: d  reason: collision with root package name */
    private final PageListener f47835d;

    /* renamed from: e  reason: collision with root package name */
    public ViewPager.OnPageChangeListener f47836e;

    /* renamed from: f  reason: collision with root package name */
    protected LinearLayout f47837f;

    /* renamed from: g  reason: collision with root package name */
    protected ViewPager f47838g;

    /* renamed from: h  reason: collision with root package name */
    protected int f47839h;

    /* renamed from: i  reason: collision with root package name */
    protected int f47840i;

    /* renamed from: j  reason: collision with root package name */
    protected float f47841j;

    /* renamed from: k  reason: collision with root package name */
    private Paint f47842k;

    /* renamed from: l  reason: collision with root package name */
    private Paint f47843l;

    /* renamed from: m  reason: collision with root package name */
    protected int f47844m;

    /* renamed from: n  reason: collision with root package name */
    protected int f47845n;

    /* renamed from: o  reason: collision with root package name */
    protected int f47846o;

    /* renamed from: p  reason: collision with root package name */
    protected boolean f47847p;

    /* renamed from: q  reason: collision with root package name */
    protected boolean f47848q;

    /* renamed from: r  reason: collision with root package name */
    protected int f47849r;

    /* renamed from: s  reason: collision with root package name */
    protected int f47850s;

    /* renamed from: t  reason: collision with root package name */
    protected float f47851t;

    /* renamed from: u  reason: collision with root package name */
    protected int f47852u;

    /* renamed from: v  reason: collision with root package name */
    protected int f47853v;

    /* renamed from: w  reason: collision with root package name */
    protected int f47854w;

    /* renamed from: x  reason: collision with root package name */
    protected int f47855x;

    /* renamed from: y  reason: collision with root package name */
    private int f47856y;

    /* renamed from: z  reason: collision with root package name */
    private int f47857z;

    /* loaded from: classes4.dex */
    protected class PageListener implements ViewPager.OnPageChangeListener {
        protected PageListener() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i4) {
            if (i4 == 0) {
                SlidingTabLayout3 slidingTabLayout3 = SlidingTabLayout3.this;
                slidingTabLayout3.f(slidingTabLayout3.f47838g.getCurrentItem(), 0);
            }
            ViewPager.OnPageChangeListener onPageChangeListener = SlidingTabLayout3.this.f47836e;
            if (onPageChangeListener != null) {
                onPageChangeListener.onPageScrollStateChanged(i4);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i4, float f5, int i5) {
            SlidingTabLayout3 slidingTabLayout3 = SlidingTabLayout3.this;
            slidingTabLayout3.f47840i = i4;
            slidingTabLayout3.f47841j = f5;
            if (slidingTabLayout3.f47837f.getChildAt(i4) != null) {
                SlidingTabLayout3 slidingTabLayout32 = SlidingTabLayout3.this;
                slidingTabLayout32.f(i4, (int) (slidingTabLayout32.f47837f.getChildAt(i4).getWidth() * f5));
            }
            SlidingTabLayout3.this.invalidate();
            ViewPager.OnPageChangeListener onPageChangeListener = SlidingTabLayout3.this.f47836e;
            if (onPageChangeListener != null) {
                onPageChangeListener.onPageScrolled(i4, f5, i5);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i4) {
            SlidingTabLayout3.this.g();
            ViewPager.OnPageChangeListener onPageChangeListener = SlidingTabLayout3.this.f47836e;
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
        int f47859b;

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
            parcel.writeInt(this.f47859b);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f47859b = parcel.readInt();
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
                SlidingTabLayout3.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            } else {
                SlidingTabLayout3.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            SlidingTabLayout3 slidingTabLayout3 = SlidingTabLayout3.this;
            slidingTabLayout3.f47840i = slidingTabLayout3.f47838g.getCurrentItem();
            SlidingTabLayout3 slidingTabLayout32 = SlidingTabLayout3.this;
            slidingTabLayout32.f(slidingTabLayout32.f47840i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f47861b;

        b(int i4) {
            this.f47861b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SlidingTabLayout3.this.f47838g.setCurrentItem(this.f47861b);
        }
    }

    /* loaded from: classes4.dex */
    public interface c {
        int a(int i4);
    }

    public SlidingTabLayout3(Context context) {
        this(context, null);
    }

    protected void a(int i4, int i5) {
        ImageButton imageButton = new ImageButton(getContext());
        imageButton.setImageResource(i5);
        b(i4, imageButton);
    }

    protected void b(int i4, View view) {
        view.setFocusable(true);
        view.setOnClickListener(new b(i4));
        int i5 = this.f47854w;
        view.setPadding(i5, 0, i5, 0);
        this.f47837f.addView(view, i4, this.f47847p ? this.f47834c : this.f47833b);
    }

    protected void c(int i4, String str) {
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setGravity(17);
        textView.setSingleLine();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        textView.setLayoutParams(layoutParams);
        layoutParams.addRule(13);
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.mygame_litle_round);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        int g4 = (int) (com.join.android.app.common.utils.n.n(getContext()).g() * 7.0f);
        layoutParams2.height = g4;
        layoutParams2.width = g4;
        layoutParams2.setMargins(0, g4, g4, 0);
        layoutParams2.addRule(11, -1);
        imageView.setLayoutParams(layoutParams2);
        imageView.setVisibility(8);
        relativeLayout.addView(textView);
        relativeLayout.addView(imageView);
        b(i4, relativeLayout);
    }

    public boolean d() {
        return this.f47848q;
    }

    public void e() {
        this.f47837f.removeAllViews();
        this.f47839h = this.f47838g.getAdapter().getCount();
        for (int i4 = 0; i4 < this.f47839h; i4++) {
            if (this.f47838g.getAdapter() instanceof c) {
                a(i4, ((c) this.f47838g.getAdapter()).a(i4));
            } else {
                c(i4, this.f47838g.getAdapter().getPageTitle(i4).toString());
            }
        }
        g();
        getViewTreeObserver().addOnGlobalLayoutListener(new a());
    }

    protected void f(int i4, int i5) {
        if (this.f47839h == 0) {
            return;
        }
        int left = this.f47837f.getChildAt(i4).getLeft() + i5;
        if (i4 > 0 || i5 > 0) {
            left -= this.f47849r;
        }
        if (left != this.D) {
            this.D = left;
            scrollTo(left, 0);
        }
    }

    protected void g() {
        for (int i4 = 0; i4 < this.f47839h; i4++) {
            View childAt = this.f47837f.getChildAt(i4);
            childAt.setBackgroundResource(this.E);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                textView.setTextSize(0, this.f47856y);
                textView.setTypeface(this.B, this.C);
                textView.setTextColor(this.f47857z);
                ViewPager viewPager = this.f47838g;
                if (viewPager != null && i4 == viewPager.getCurrentItem()) {
                    textView.setTextColor(this.A);
                }
                if (this.f47848q) {
                    if (Build.VERSION.SDK_INT >= 14) {
                        textView.setAllCaps(true);
                    } else {
                        textView.setText(textView.getText().toString().toUpperCase(this.F));
                    }
                }
            } else if (childAt instanceof RelativeLayout) {
                RelativeLayout relativeLayout = (RelativeLayout) childAt;
                int childCount = relativeLayout.getChildCount();
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt2 = relativeLayout.getChildAt(i5);
                    if (childAt2 instanceof TextView) {
                        TextView textView2 = (TextView) childAt2;
                        textView2.setTextSize(0, this.f47856y);
                        textView2.setTypeface(this.B, this.C);
                        textView2.setTextColor(this.f47857z);
                        ViewPager viewPager2 = this.f47838g;
                        if (viewPager2 != null && i4 == viewPager2.getCurrentItem()) {
                            textView2.setTextColor(this.A);
                        }
                        if (this.f47848q) {
                            if (Build.VERSION.SDK_INT >= 14) {
                                textView2.setAllCaps(true);
                            } else {
                                textView2.setText(textView2.getText().toString().toUpperCase(this.F));
                            }
                        }
                    } else if (this.G == i4 && (childAt2 instanceof ImageView)) {
                        if (this.H) {
                            childAt2.setVisibility(0);
                        } else {
                            childAt2.setVisibility(8);
                        }
                    }
                }
            }
        }
    }

    public int getDividerColor() {
        return this.f47846o;
    }

    public int getDividerPadding() {
        return this.f47853v;
    }

    public int getIndicatorColor() {
        return this.f47844m;
    }

    public int getIndicatorHeight() {
        return this.f47850s;
    }

    public float getIndicatorRatioH() {
        return this.f47851t;
    }

    public int getScrollOffset() {
        return this.f47849r;
    }

    public boolean getShouldExpand() {
        return this.f47847p;
    }

    public int getTabBackground() {
        return this.E;
    }

    public int getTabPaddingLeftRight() {
        return this.f47854w;
    }

    public int getTextColor() {
        return this.f47857z;
    }

    public int getTextSize() {
        return this.f47856y;
    }

    public int getUnderlineColor() {
        return this.f47845n;
    }

    public int getUnderlineHeight() {
        return this.f47852u;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        View childAt;
        int i4;
        super.onDraw(canvas);
        if (isInEditMode() || this.f47839h == 0) {
            return;
        }
        int height = getHeight();
        this.f47842k.setColor(this.f47844m);
        float left = childAt.getLeft() * 1.0f;
        float right = this.f47837f.getChildAt(this.f47840i).getRight();
        if (this.f47841j > 0.0f && (i4 = this.f47840i) < this.f47839h - 1) {
            View childAt2 = this.f47837f.getChildAt(i4 + 1);
            float f5 = this.f47841j;
            left = (childAt2.getLeft() * f5) + ((1.0f - f5) * left);
            right = (childAt2.getRight() * f5) + ((1.0f - f5) * right);
        }
        float f6 = (int) (((1.0f - this.f47851t) * (right - left)) / 2.0f);
        float f7 = height;
        canvas.drawRect(left + f6, height - this.f47850s, right - f6, f7, this.f47842k);
        this.f47842k.setColor(this.f47845n);
        canvas.drawRect(0.0f, height - this.f47852u, this.f47837f.getWidth(), f7, this.f47842k);
        this.f47843l.setColor(this.f47846o);
        for (int i5 = 0; i5 < this.f47839h - 1; i5++) {
            View childAt3 = this.f47837f.getChildAt(i5);
            canvas.drawLine(childAt3.getRight(), this.f47853v, childAt3.getRight(), height - this.f47853v, this.f47843l);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f47840i = savedState.f47859b;
        requestLayout();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f47859b = this.f47840i;
        return savedState;
    }

    public void setAllCaps(boolean z4) {
        this.f47848q = z4;
    }

    public void setDividerColor(int i4) {
        this.f47846o = i4;
        invalidate();
    }

    public void setDividerColorResource(int i4) {
        this.f47846o = getResources().getColor(i4);
        invalidate();
    }

    public void setDividerPadding(int i4) {
        this.f47853v = i4;
        invalidate();
    }

    public void setIndicatorColor(int i4) {
        this.f47844m = i4;
        invalidate();
    }

    public void setIndicatorColorResource(int i4) {
        this.f47844m = getResources().getColor(i4);
        invalidate();
    }

    public void setIndicatorHeight(int i4) {
        this.f47850s = i4;
        invalidate();
    }

    public void setIndicatorRatioH(float f5) {
        this.f47851t = f5;
        invalidate();
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.f47836e = onPageChangeListener;
    }

    public void setRoundShow(int i4, boolean z4) {
        this.G = i4;
        this.H = z4;
        g();
    }

    public void setScrollOffset(int i4) {
        this.f47849r = i4;
        invalidate();
    }

    public void setShouldExpand(boolean z4) {
        this.f47847p = z4;
        requestLayout();
    }

    public void setTabBackground(int i4) {
        this.E = i4;
    }

    public void setTabPaddingLeftRight(int i4) {
        this.f47854w = i4;
        g();
    }

    public void setTextColor(int i4) {
        this.f47857z = i4;
        g();
    }

    public void setTextColorResource(int i4) {
        this.f47857z = getResources().getColor(i4);
        g();
    }

    public void setTextSize(int i4) {
        this.f47856y = i4;
        g();
    }

    public void setTypeface(Typeface typeface, int i4) {
        this.B = typeface;
        this.C = i4;
        g();
    }

    public void setUnderlineColor(int i4) {
        this.f47845n = i4;
        invalidate();
    }

    public void setUnderlineColorResource(int i4) {
        this.f47845n = getResources().getColor(i4);
        invalidate();
    }

    public void setUnderlineHeight(int i4) {
        this.f47852u = i4;
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        this.f47838g = viewPager;
        if (viewPager.getAdapter() != null) {
            viewPager.setOnPageChangeListener(this.f47835d);
            e();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }

    public SlidingTabLayout3(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingTabLayout3(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f47835d = new PageListener();
        this.f47840i = 0;
        this.f47841j = 0.0f;
        this.f47844m = -756480;
        this.f47845n = -1315861;
        this.f47846o = 16777215;
        this.f47847p = false;
        this.f47848q = true;
        this.f47849r = 52;
        this.f47850s = 3;
        this.f47851t = 0.6f;
        this.f47852u = 1;
        this.f47853v = 12;
        this.f47854w = 24;
        this.f47855x = 1;
        this.f47856y = 14;
        this.f47857z = -11711155;
        this.A = -756480;
        this.B = null;
        this.C = 0;
        this.D = 0;
        this.E = R.drawable.background_tab;
        this.G = 0;
        this.H = false;
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f47837f = linearLayout;
        linearLayout.setOrientation(0);
        this.f47837f.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.f47837f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f47849r = (int) TypedValue.applyDimension(1, this.f47849r, displayMetrics);
        this.f47850s = (int) TypedValue.applyDimension(1, this.f47850s, displayMetrics);
        this.f47852u = (int) TypedValue.applyDimension(0, this.f47852u, displayMetrics);
        this.f47853v = (int) TypedValue.applyDimension(1, this.f47853v, displayMetrics);
        this.f47854w = (int) TypedValue.applyDimension(1, this.f47854w, displayMetrics);
        this.f47855x = (int) TypedValue.applyDimension(1, this.f47855x, displayMetrics);
        this.f47856y = (int) TypedValue.applyDimension(1, this.f47856y, displayMetrics);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SlidingTab);
        this.f47856y = obtainStyledAttributes.getDimensionPixelSize(3, this.f47856y);
        this.f47857z = obtainStyledAttributes.getColor(1, this.f47857z);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R.styleable.PagerSlidingTabStrip);
        this.f47844m = obtainStyledAttributes2.getColor(2, this.f47844m);
        this.f47845n = obtainStyledAttributes2.getColor(9, this.f47845n);
        this.f47846o = obtainStyledAttributes2.getColor(0, this.f47846o);
        this.f47850s = obtainStyledAttributes2.getDimensionPixelSize(3, this.f47850s);
        this.f47852u = obtainStyledAttributes2.getDimensionPixelSize(10, this.f47852u);
        this.f47853v = obtainStyledAttributes2.getDimensionPixelSize(1, this.f47853v);
        this.f47854w = obtainStyledAttributes2.getDimensionPixelSize(7, this.f47854w);
        this.E = obtainStyledAttributes2.getResourceId(6, this.E);
        this.f47847p = obtainStyledAttributes2.getBoolean(5, this.f47847p);
        this.f47849r = obtainStyledAttributes2.getDimensionPixelSize(4, this.f47849r);
        this.f47848q = obtainStyledAttributes2.getBoolean(8, this.f47848q);
        obtainStyledAttributes2.recycle();
        Paint paint = new Paint();
        this.f47842k = paint;
        paint.setAntiAlias(true);
        this.f47842k.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f47843l = paint2;
        paint2.setAntiAlias(true);
        this.f47843l.setStrokeWidth(this.f47855x);
        this.f47833b = new LinearLayout.LayoutParams(-2, -1);
        this.f47834c = new LinearLayout.LayoutParams(0, -1, 1.0f);
        if (this.F == null) {
            this.F = getResources().getConfiguration().locale;
        }
    }
}
