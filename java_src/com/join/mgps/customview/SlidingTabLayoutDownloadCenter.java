package com.join.mgps.customview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
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
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.mgsim.wufun.R;
import java.util.Locale;
/* loaded from: classes4.dex */
public class SlidingTabLayoutDownloadCenter extends HorizontalScrollView {
    private static final int[] L = {16842901, 16842904};
    private int A;
    private Typeface B;
    private int C;
    private int D;
    private int E;
    private Locale F;
    private int G;
    private boolean H;
    int I;
    int J;
    int K;

    /* renamed from: b  reason: collision with root package name */
    protected LinearLayout.LayoutParams f47869b;

    /* renamed from: c  reason: collision with root package name */
    protected LinearLayout.LayoutParams f47870c;

    /* renamed from: d  reason: collision with root package name */
    private final PageListener f47871d;

    /* renamed from: e  reason: collision with root package name */
    public ViewPager.OnPageChangeListener f47872e;

    /* renamed from: f  reason: collision with root package name */
    protected LinearLayout f47873f;

    /* renamed from: g  reason: collision with root package name */
    protected ViewPager f47874g;

    /* renamed from: h  reason: collision with root package name */
    protected int f47875h;

    /* renamed from: i  reason: collision with root package name */
    protected int f47876i;

    /* renamed from: j  reason: collision with root package name */
    protected float f47877j;

    /* renamed from: k  reason: collision with root package name */
    private Paint f47878k;

    /* renamed from: l  reason: collision with root package name */
    private Paint f47879l;

    /* renamed from: m  reason: collision with root package name */
    protected int f47880m;

    /* renamed from: n  reason: collision with root package name */
    protected int f47881n;

    /* renamed from: o  reason: collision with root package name */
    protected int f47882o;

    /* renamed from: p  reason: collision with root package name */
    protected boolean f47883p;

    /* renamed from: q  reason: collision with root package name */
    protected boolean f47884q;

    /* renamed from: r  reason: collision with root package name */
    protected int f47885r;

    /* renamed from: s  reason: collision with root package name */
    protected int f47886s;

    /* renamed from: t  reason: collision with root package name */
    protected float f47887t;

    /* renamed from: u  reason: collision with root package name */
    protected int f47888u;

    /* renamed from: v  reason: collision with root package name */
    protected int f47889v;

    /* renamed from: w  reason: collision with root package name */
    protected int f47890w;

    /* renamed from: x  reason: collision with root package name */
    protected int f47891x;

    /* renamed from: y  reason: collision with root package name */
    private int f47892y;

    /* renamed from: z  reason: collision with root package name */
    private int f47893z;

    /* loaded from: classes4.dex */
    protected class PageListener implements ViewPager.OnPageChangeListener {
        protected PageListener() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i4) {
            if (i4 == 0) {
                SlidingTabLayoutDownloadCenter slidingTabLayoutDownloadCenter = SlidingTabLayoutDownloadCenter.this;
                slidingTabLayoutDownloadCenter.f(slidingTabLayoutDownloadCenter.f47874g.getCurrentItem(), 0);
            }
            ViewPager.OnPageChangeListener onPageChangeListener = SlidingTabLayoutDownloadCenter.this.f47872e;
            if (onPageChangeListener != null) {
                onPageChangeListener.onPageScrollStateChanged(i4);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i4, float f5, int i5) {
            SlidingTabLayoutDownloadCenter slidingTabLayoutDownloadCenter = SlidingTabLayoutDownloadCenter.this;
            slidingTabLayoutDownloadCenter.f47876i = i4;
            slidingTabLayoutDownloadCenter.f47877j = f5;
            if (slidingTabLayoutDownloadCenter.f47873f.getChildAt(i4) != null) {
                SlidingTabLayoutDownloadCenter slidingTabLayoutDownloadCenter2 = SlidingTabLayoutDownloadCenter.this;
                slidingTabLayoutDownloadCenter2.f(i4, (int) (slidingTabLayoutDownloadCenter2.f47873f.getChildAt(i4).getWidth() * f5));
            }
            SlidingTabLayoutDownloadCenter.this.invalidate();
            ViewPager.OnPageChangeListener onPageChangeListener = SlidingTabLayoutDownloadCenter.this.f47872e;
            if (onPageChangeListener != null) {
                onPageChangeListener.onPageScrolled(i4, f5, i5);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i4) {
            SlidingTabLayoutDownloadCenter.this.h();
            ViewPager.OnPageChangeListener onPageChangeListener = SlidingTabLayoutDownloadCenter.this.f47872e;
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
        int f47895b;

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
            parcel.writeInt(this.f47895b);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f47895b = parcel.readInt();
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
                SlidingTabLayoutDownloadCenter.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            } else {
                SlidingTabLayoutDownloadCenter.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            SlidingTabLayoutDownloadCenter slidingTabLayoutDownloadCenter = SlidingTabLayoutDownloadCenter.this;
            slidingTabLayoutDownloadCenter.f47876i = slidingTabLayoutDownloadCenter.f47874g.getCurrentItem();
            SlidingTabLayoutDownloadCenter slidingTabLayoutDownloadCenter2 = SlidingTabLayoutDownloadCenter.this;
            slidingTabLayoutDownloadCenter2.f(slidingTabLayoutDownloadCenter2.f47876i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f47897b;

        b(int i4) {
            this.f47897b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SlidingTabLayoutDownloadCenter.this.f47874g.setCurrentItem(this.f47897b);
        }
    }

    /* loaded from: classes4.dex */
    public interface c {
        int a(int i4);
    }

    public SlidingTabLayoutDownloadCenter(Context context) {
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
        int i5 = this.f47890w;
        view.setPadding(i5, 0, i5, 0);
        this.f47873f.addView(view, i4, this.f47883p ? this.f47870c : this.f47869b);
    }

    protected void c(int i4, String str) {
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        TextView textView = new TextView(getContext());
        textView.setId(16908308);
        textView.setText(str);
        textView.setGravity(17);
        textView.setSingleLine();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        textView.setLayoutParams(layoutParams);
        textView.setSingleLine(true);
        layoutParams.addRule(13);
        TextView textView2 = new TextView(getContext());
        textView2.setId(16908309);
        textView2.setTextColor(Color.parseColor("#ffffff"));
        textView2.setBackgroundResource(R.drawable.mygame_big_round);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins((int) (com.join.android.app.common.utils.n.n(getContext()).g() * 7.0f), 0, 0, 0);
        layoutParams2.addRule(15, -1);
        layoutParams2.addRule(1, textView.getId());
        textView2.setLayoutParams(layoutParams2);
        textView2.setVisibility(8);
        textView2.setSingleLine(true);
        textView2.setTextSize(8.0f);
        textView2.setGravity(17);
        relativeLayout.addView(textView);
        relativeLayout.addView(textView2);
        b(i4, relativeLayout);
    }

    public boolean d() {
        return this.f47884q;
    }

    public void e() {
        this.f47873f.removeAllViews();
        this.f47875h = this.f47874g.getAdapter().getCount();
        for (int i4 = 0; i4 < this.f47875h; i4++) {
            if (this.f47874g.getAdapter() instanceof c) {
                a(i4, ((c) this.f47874g.getAdapter()).a(i4));
            } else {
                c(i4, this.f47874g.getAdapter().getPageTitle(i4).toString());
            }
        }
        h();
        getViewTreeObserver().addOnGlobalLayoutListener(new a());
    }

    protected void f(int i4, int i5) {
        if (this.f47875h == 0) {
            return;
        }
        int left = this.f47873f.getChildAt(i4).getLeft() + i5;
        if (i4 > 0 || i5 > 0) {
            left -= this.f47885r;
        }
        if (left != this.D) {
            this.D = left;
            scrollTo(left, 0);
        }
    }

    void g(TextView textView, int i4) {
        textView.setVisibility(0);
        if (i4 < 100) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
            layoutParams.width = getResources().getDimensionPixelOffset(R.dimen.round_large_size);
            layoutParams.height = getResources().getDimensionPixelOffset(R.dimen.round_large_size);
            textView.setLayoutParams(layoutParams);
            textView.setCompoundDrawables(null, null, null, null);
            textView.setBackgroundResource(R.drawable.mygame_big_round);
            textView.setPadding(1, 0, 0, 1);
        } else {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) textView.getLayoutParams();
            layoutParams2.width = getResources().getDimensionPixelOffset(R.dimen.dp70);
            layoutParams2.height = getResources().getDimensionPixelOffset(R.dimen.round_large_size);
            layoutParams2.setMargins(0, (int) TypedValue.applyDimension(1, 7.0f, getResources().getDisplayMetrics()), 4, 0);
            textView.setGravity(17);
            textView.setLayoutParams(layoutParams2);
            textView.setCompoundDrawables(null, null, null, null);
            textView.setBackgroundResource(R.drawable.message_round);
            textView.setPadding(1, 0, 2, 1);
        }
        textView.setText(i4 + "");
    }

    public int getDividerColor() {
        return this.f47882o;
    }

    public int getDividerPadding() {
        return this.f47889v;
    }

    public int getIndicatorColor() {
        return this.f47880m;
    }

    public int getIndicatorHeight() {
        return this.f47886s;
    }

    public float getIndicatorRatioH() {
        return this.f47887t;
    }

    public int getScrollOffset() {
        return this.f47885r;
    }

    public boolean getShouldExpand() {
        return this.f47883p;
    }

    public int getTabBackground() {
        return this.E;
    }

    public int getTabPaddingLeftRight() {
        return this.f47890w;
    }

    public int getTextColor() {
        return this.f47893z;
    }

    public int getTextSize() {
        return this.f47892y;
    }

    public int getUnderlineColor() {
        return this.f47881n;
    }

    public int getUnderlineHeight() {
        return this.f47888u;
    }

    protected void h() {
        for (int i4 = 0; i4 < this.f47875h; i4++) {
            View childAt = this.f47873f.getChildAt(i4);
            childAt.setBackgroundResource(this.E);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                textView.setTextSize(0, this.f47892y);
                textView.setTypeface(this.B, this.C);
                textView.setTextColor(this.f47893z);
                ViewPager viewPager = this.f47874g;
                if (viewPager != null && i4 == viewPager.getCurrentItem()) {
                    textView.setTextColor(this.A);
                }
                if (this.f47884q) {
                    if (Build.VERSION.SDK_INT >= 14) {
                        textView.setAllCaps(true);
                    } else {
                        textView.setText(textView.getText().toString().toUpperCase(this.F));
                    }
                }
            } else if (childAt instanceof RelativeLayout) {
                TextView textView2 = (TextView) childAt.findViewById(16908308);
                TextView textView3 = (TextView) childAt.findViewById(16908309);
                if (textView2 != null) {
                    textView2.setTextSize(0, this.f47892y);
                    textView2.setTypeface(this.B, this.C);
                    textView2.setTextColor(this.f47893z);
                    ViewPager viewPager2 = this.f47874g;
                    if (viewPager2 != null && i4 == viewPager2.getCurrentItem()) {
                        textView2.setTextColor(this.A);
                    }
                    ViewPager viewPager3 = this.f47874g;
                    if (viewPager3 != null && viewPager3.getAdapter() != null && (this.f47874g.getAdapter() instanceof NavigationAdapter)) {
                        textView2.setText(this.f47874g.getAdapter().getPageTitle(i4));
                    }
                    if (this.f47884q) {
                        if (Build.VERSION.SDK_INT >= 14) {
                            textView2.setAllCaps(true);
                        } else {
                            textView2.setText(textView2.getText().toString().toUpperCase(this.F));
                        }
                    }
                }
                if (textView3 != null && (this.f47874g.getAdapter() instanceof NavigationAdapter) && i4 == 1) {
                    int i5 = this.J;
                    if (i5 > 0) {
                        g(textView3, i5);
                    } else {
                        textView3.setVisibility(8);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        View childAt;
        int i4;
        super.onDraw(canvas);
        if (isInEditMode() || this.f47875h == 0) {
            return;
        }
        int height = getHeight();
        this.f47878k.setColor(this.f47880m);
        float left = childAt.getLeft() * 1.0f;
        float right = this.f47873f.getChildAt(this.f47876i).getRight();
        if (this.f47877j > 0.0f && (i4 = this.f47876i) < this.f47875h - 1) {
            View childAt2 = this.f47873f.getChildAt(i4 + 1);
            float f5 = this.f47877j;
            left = (childAt2.getLeft() * f5) + ((1.0f - f5) * left);
            right = (childAt2.getRight() * f5) + ((1.0f - f5) * right);
        }
        float f6 = (int) (((1.0f - this.f47887t) * (right - left)) / 2.0f);
        float f7 = height;
        canvas.drawRect(left + f6, height - this.f47886s, right - f6, f7, this.f47878k);
        this.f47878k.setColor(this.f47881n);
        canvas.drawRect(0.0f, height - this.f47888u, this.f47873f.getWidth(), f7, this.f47878k);
        this.f47879l.setColor(this.f47882o);
        for (int i5 = 0; i5 < this.f47875h - 1; i5++) {
            View childAt3 = this.f47873f.getChildAt(i5);
            canvas.drawLine(childAt3.getRight(), this.f47889v, childAt3.getRight(), height - this.f47889v, this.f47879l);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f47876i = savedState.f47895b;
        requestLayout();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f47895b = this.f47876i;
        return savedState;
    }

    public void setAllCaps(boolean z4) {
        this.f47884q = z4;
    }

    public void setBadgeSize(int i4, int i5, int i6) {
        this.I = i4;
        this.J = i5;
        this.K = i6;
        h();
    }

    public void setDividerColor(int i4) {
        this.f47882o = i4;
        invalidate();
    }

    public void setDividerColorResource(int i4) {
        this.f47882o = getResources().getColor(i4);
        invalidate();
    }

    public void setDividerPadding(int i4) {
        this.f47889v = i4;
        invalidate();
    }

    public void setIndicatorColor(int i4) {
        this.f47880m = i4;
        invalidate();
    }

    public void setIndicatorColorResource(int i4) {
        this.f47880m = getResources().getColor(i4);
        invalidate();
    }

    public void setIndicatorHeight(int i4) {
        this.f47886s = i4;
        invalidate();
    }

    public void setIndicatorRatioH(float f5) {
        this.f47887t = f5;
        invalidate();
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.f47872e = onPageChangeListener;
    }

    public void setRoundShow(int i4, boolean z4) {
        this.G = i4;
        this.H = z4;
        h();
    }

    public void setScrollOffset(int i4) {
        this.f47885r = i4;
        invalidate();
    }

    public void setShouldExpand(boolean z4) {
        this.f47883p = z4;
        requestLayout();
    }

    public void setTabBackground(int i4) {
        this.E = i4;
    }

    public void setTabPaddingLeftRight(int i4) {
        this.f47890w = i4;
        h();
    }

    public void setTextColor(int i4) {
        this.f47893z = i4;
        h();
    }

    public void setTextColorResource(int i4) {
        this.f47893z = getResources().getColor(i4);
        h();
    }

    public void setTextSize(int i4) {
        this.f47892y = i4;
        h();
    }

    public void setTypeface(Typeface typeface, int i4) {
        this.B = typeface;
        this.C = i4;
        h();
    }

    public void setUnderlineColor(int i4) {
        this.f47881n = i4;
        invalidate();
    }

    public void setUnderlineColorResource(int i4) {
        this.f47881n = getResources().getColor(i4);
        invalidate();
    }

    public void setUnderlineHeight(int i4) {
        this.f47888u = i4;
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        this.f47874g = viewPager;
        if (viewPager.getAdapter() != null) {
            viewPager.setOnPageChangeListener(this.f47871d);
            e();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }

    public SlidingTabLayoutDownloadCenter(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingTabLayoutDownloadCenter(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f47871d = new PageListener();
        this.f47876i = 0;
        this.f47877j = 0.0f;
        this.f47880m = -756480;
        this.f47881n = -1315861;
        this.f47882o = 16777215;
        this.f47883p = false;
        this.f47884q = true;
        this.f47885r = 52;
        this.f47886s = 3;
        this.f47887t = 0.6f;
        this.f47888u = 1;
        this.f47889v = 12;
        this.f47890w = 24;
        this.f47891x = 1;
        this.f47892y = 14;
        this.f47893z = -11711155;
        this.A = -756480;
        this.B = null;
        this.C = 0;
        this.D = 0;
        this.E = R.drawable.background_tab;
        this.G = 0;
        this.H = false;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f47873f = linearLayout;
        linearLayout.setOrientation(0);
        this.f47873f.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.f47873f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f47885r = (int) TypedValue.applyDimension(1, this.f47885r, displayMetrics);
        this.f47886s = (int) TypedValue.applyDimension(1, this.f47886s, displayMetrics);
        this.f47888u = (int) TypedValue.applyDimension(0, this.f47888u, displayMetrics);
        this.f47889v = (int) TypedValue.applyDimension(1, this.f47889v, displayMetrics);
        this.f47890w = (int) TypedValue.applyDimension(1, this.f47890w, displayMetrics);
        this.f47891x = (int) TypedValue.applyDimension(1, this.f47891x, displayMetrics);
        this.f47892y = (int) TypedValue.applyDimension(1, this.f47892y, displayMetrics);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SlidingTab);
        this.f47892y = obtainStyledAttributes.getDimensionPixelSize(3, this.f47892y);
        this.f47893z = obtainStyledAttributes.getColor(1, this.f47893z);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R.styleable.PagerSlidingTabStrip);
        this.f47880m = obtainStyledAttributes2.getColor(2, this.f47880m);
        this.f47881n = obtainStyledAttributes2.getColor(9, this.f47881n);
        this.f47882o = obtainStyledAttributes2.getColor(0, this.f47882o);
        this.f47886s = obtainStyledAttributes2.getDimensionPixelSize(3, this.f47886s);
        this.f47888u = obtainStyledAttributes2.getDimensionPixelSize(10, this.f47888u);
        this.f47889v = obtainStyledAttributes2.getDimensionPixelSize(1, this.f47889v);
        this.f47890w = obtainStyledAttributes2.getDimensionPixelSize(7, this.f47890w);
        this.E = obtainStyledAttributes2.getResourceId(6, this.E);
        this.f47883p = obtainStyledAttributes2.getBoolean(5, this.f47883p);
        this.f47885r = obtainStyledAttributes2.getDimensionPixelSize(4, this.f47885r);
        this.f47884q = obtainStyledAttributes2.getBoolean(8, this.f47884q);
        obtainStyledAttributes2.recycle();
        Paint paint = new Paint();
        this.f47878k = paint;
        paint.setAntiAlias(true);
        this.f47878k.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f47879l = paint2;
        paint2.setAntiAlias(true);
        this.f47879l.setStrokeWidth(this.f47891x);
        this.f47869b = new LinearLayout.LayoutParams(-2, -1);
        this.f47870c = new LinearLayout.LayoutParams(0, -1, 1.0f);
        if (this.F == null) {
            this.F = getResources().getConfiguration().locale;
        }
    }
}
