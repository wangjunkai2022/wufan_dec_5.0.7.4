package com.join.mgps.customview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes4.dex */
public class CirclePageIndicator extends View implements PageIndicator {

    /* renamed from: s  reason: collision with root package name */
    private static final int f46515s = -1;

    /* renamed from: b  reason: collision with root package name */
    private float f46516b;

    /* renamed from: c  reason: collision with root package name */
    private final Paint f46517c;

    /* renamed from: d  reason: collision with root package name */
    private final Paint f46518d;

    /* renamed from: e  reason: collision with root package name */
    private final Paint f46519e;

    /* renamed from: f  reason: collision with root package name */
    private ViewPager f46520f;

    /* renamed from: g  reason: collision with root package name */
    private ViewPager.OnPageChangeListener f46521g;

    /* renamed from: h  reason: collision with root package name */
    private int f46522h;

    /* renamed from: i  reason: collision with root package name */
    private int f46523i;

    /* renamed from: j  reason: collision with root package name */
    private float f46524j;

    /* renamed from: k  reason: collision with root package name */
    private int f46525k;

    /* renamed from: l  reason: collision with root package name */
    private int f46526l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f46527m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f46528n;

    /* renamed from: o  reason: collision with root package name */
    private int f46529o;

    /* renamed from: p  reason: collision with root package name */
    private float f46530p;

    /* renamed from: q  reason: collision with root package name */
    private int f46531q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f46532r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        int f46533b;

        /* loaded from: classes4.dex */
        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f46533b);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f46533b = parcel.readInt();
        }
    }

    public CirclePageIndicator(Context context) {
        this(context, null);
    }

    private int c(int i4) {
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (mode == 1073741824 || this.f46520f == null) {
            return size;
        }
        int count = getCount();
        float f5 = this.f46516b;
        int paddingLeft = (int) (getPaddingLeft() + getPaddingRight() + (count * 2 * f5) + ((count - 1) * f5) + 2.0f);
        return mode == Integer.MIN_VALUE ? Math.min(paddingLeft, size) : paddingLeft;
    }

    private int d(int i4) {
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = (int) ((this.f46516b * 2.0f) + getPaddingTop() + getPaddingBottom() + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(paddingTop, size) : paddingTop;
    }

    public boolean a() {
        return this.f46527m;
    }

    public boolean b() {
        return this.f46528n;
    }

    protected int getCount() {
        ViewPager viewPager = this.f46520f;
        if (viewPager == null || viewPager.getAdapter() == null) {
            return 0;
        }
        if (this.f46520f.getAdapter() instanceof LoopPagerAdapterWrapper) {
            return this.f46520f.getAdapter().getCount() - 2;
        }
        return this.f46520f.getAdapter().getCount();
    }

    public int getFillColor() {
        return this.f46519e.getColor();
    }

    public int getOrientation() {
        return this.f46526l;
    }

    public int getPageColor() {
        return this.f46517c.getColor();
    }

    public float getRadius() {
        return this.f46516b;
    }

    public int getStrokeColor() {
        return this.f46518d.getColor();
    }

    public float getStrokeWidth() {
        return this.f46518d.getStrokeWidth();
    }

    @Override // com.join.mgps.customview.PageIndicator
    public void notifyDataSetChanged() {
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int count;
        int height;
        int paddingTop;
        int paddingBottom;
        int paddingLeft;
        float f5;
        float f6;
        super.onDraw(canvas);
        if (this.f46520f == null || (count = getCount()) == 0) {
            return;
        }
        if (this.f46522h >= count) {
            setCurrentItem(count - 1);
            return;
        }
        if (this.f46526l == 0) {
            height = getWidth();
            paddingTop = getPaddingLeft();
            paddingBottom = getPaddingRight();
            paddingLeft = getPaddingTop();
        } else {
            height = getHeight();
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
            paddingLeft = getPaddingLeft();
        }
        float f7 = this.f46516b;
        float f8 = 3.0f * f7;
        float f9 = paddingLeft + f7;
        float f10 = paddingTop + f7;
        if (this.f46527m) {
            f10 += (((height - paddingTop) - paddingBottom) / 2.0f) - (((count * f8) / 2.0f) - (f7 / 2.0f));
        }
        if (this.f46518d.getStrokeWidth() > 0.0f) {
            f7 -= this.f46518d.getStrokeWidth() / 2.0f;
        }
        for (int i4 = 0; i4 < count; i4++) {
            float f11 = (i4 * f8) + f10;
            if (this.f46526l == 0) {
                f6 = f9;
            } else {
                f6 = f11;
                f11 = f9;
            }
            if (this.f46517c.getAlpha() > 0) {
                canvas.drawCircle(f11, f6, f7, this.f46517c);
            }
            float f12 = this.f46516b;
            if (f7 != f12) {
                canvas.drawCircle(f11, f6, f12, this.f46518d);
            }
        }
        boolean z4 = this.f46528n;
        float f13 = (z4 ? this.f46523i : this.f46522h) * f8;
        if (!z4) {
            f13 += this.f46524j * f8;
        }
        if (this.f46526l == 0) {
            float f14 = f10 + f13;
            f5 = f9;
            f9 = f14;
        } else {
            f5 = f10 + f13;
        }
        canvas.drawCircle(f9, f5, this.f46516b, this.f46519e);
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        if (this.f46526l == 0) {
            setMeasuredDimension(c(i4), d(i5));
        } else {
            setMeasuredDimension(d(i4), c(i5));
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i4) {
        this.f46525k = i4;
        ViewPager.OnPageChangeListener onPageChangeListener = this.f46521g;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(i4);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i4, float f5, int i5) {
        this.f46522h = i4;
        this.f46524j = f5;
        invalidate();
        ViewPager.OnPageChangeListener onPageChangeListener = this.f46521g;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(i4, f5, i5);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i4) {
        if (this.f46528n || this.f46525k == 0) {
            this.f46522h = i4;
            this.f46523i = i4;
            invalidate();
        }
        ViewPager.OnPageChangeListener onPageChangeListener = this.f46521g;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(i4);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i4 = savedState.f46533b;
        this.f46522h = i4;
        this.f46523i = i4;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f46533b = this.f46522h;
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f46520f == null || getCount() == 0) {
            return false;
        }
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float x4 = MotionEventCompat.getX(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.f46531q));
                    float f5 = x4 - this.f46530p;
                    if (!this.f46532r && Math.abs(f5) > this.f46529o) {
                        this.f46532r = true;
                    }
                    if (this.f46532r) {
                        this.f46530p = x4;
                        if (this.f46520f.isFakeDragging() || this.f46520f.beginFakeDrag()) {
                            this.f46520f.fakeDragBy(f5);
                        }
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                        this.f46530p = MotionEventCompat.getX(motionEvent, actionIndex);
                        this.f46531q = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                    } else if (action == 6) {
                        int actionIndex2 = MotionEventCompat.getActionIndex(motionEvent);
                        if (MotionEventCompat.getPointerId(motionEvent, actionIndex2) == this.f46531q) {
                            this.f46531q = MotionEventCompat.getPointerId(motionEvent, actionIndex2 == 0 ? 1 : 0);
                        }
                        this.f46530p = MotionEventCompat.getX(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.f46531q));
                    }
                }
            }
            if (!this.f46532r) {
                int count = getCount();
                float width = getWidth();
                float f6 = width / 2.0f;
                float f7 = width / 6.0f;
                if (this.f46522h > 0 && motionEvent.getX() < f6 - f7) {
                    if (action != 3) {
                        this.f46520f.setCurrentItem(this.f46522h - 1);
                    }
                    return true;
                } else if (this.f46522h < count - 1 && motionEvent.getX() > f6 + f7) {
                    if (action != 3) {
                        this.f46520f.setCurrentItem(this.f46522h + 1);
                    }
                    return true;
                }
            }
            this.f46532r = false;
            this.f46531q = -1;
            if (this.f46520f.isFakeDragging()) {
                this.f46520f.endFakeDrag();
            }
        } else {
            this.f46531q = MotionEventCompat.getPointerId(motionEvent, 0);
            this.f46530p = motionEvent.getX();
        }
        return true;
    }

    public void setCentered(boolean z4) {
        this.f46527m = z4;
        invalidate();
    }

    @Override // com.join.mgps.customview.PageIndicator
    public void setCurrentItem(int i4) {
        ViewPager viewPager = this.f46520f;
        if (viewPager != null) {
            viewPager.setCurrentItem(i4);
            this.f46522h = i4;
            invalidate();
            return;
        }
        throw new IllegalStateException("ViewPager has not been bound.");
    }

    public void setFillColor(int i4) {
        this.f46519e.setColor(i4);
        invalidate();
    }

    @Override // com.join.mgps.customview.PageIndicator
    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.f46521g = onPageChangeListener;
    }

    public void setOrientation(int i4) {
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException("Orientation must be either HORIZONTAL or VERTICAL.");
        }
        this.f46526l = i4;
        requestLayout();
    }

    public void setPageColor(int i4) {
        this.f46517c.setColor(i4);
        invalidate();
    }

    public void setRadius(float f5) {
        this.f46516b = f5;
        invalidate();
    }

    public void setSnap(boolean z4) {
        this.f46528n = z4;
        invalidate();
    }

    public void setStrokeColor(int i4) {
        this.f46518d.setColor(i4);
        invalidate();
    }

    public void setStrokeWidth(float f5) {
        this.f46518d.setStrokeWidth(f5);
        invalidate();
    }

    @Override // com.join.mgps.customview.PageIndicator
    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.f46520f;
        if (viewPager2 == viewPager) {
            return;
        }
        if (viewPager2 != null) {
            viewPager2.setOnPageChangeListener(null);
        }
        if (viewPager.getAdapter() != null) {
            this.f46520f = viewPager;
            viewPager.setOnPageChangeListener(this);
            invalidate();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }

    public CirclePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.vpiCirclePageIndicatorStyle);
    }

    public CirclePageIndicator(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        Paint paint = new Paint(1);
        this.f46517c = paint;
        Paint paint2 = new Paint(1);
        this.f46518d = paint2;
        Paint paint3 = new Paint(1);
        this.f46519e = paint3;
        this.f46530p = -1.0f;
        this.f46531q = -1;
        if (isInEditMode()) {
            return;
        }
        Resources resources = getResources();
        int color = resources.getColor(R.color.default_circle_indicator_page_color);
        int color2 = resources.getColor(R.color.default_circle_indicator_fill_color);
        int integer = resources.getInteger(R.integer.default_circle_indicator_orientation);
        int color3 = resources.getColor(R.color.default_circle_indicator_stroke_color);
        float dimension = resources.getDimension(R.dimen.default_circle_indicator_stroke_width);
        float dimension2 = resources.getDimension(R.dimen.default_circle_indicator_radius);
        boolean z4 = resources.getBoolean(R.bool.default_circle_indicator_centered);
        boolean z5 = resources.getBoolean(R.bool.default_circle_indicator_snap);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CirclePageIndicator, i4, 0);
        this.f46527m = obtainStyledAttributes.getBoolean(2, z4);
        this.f46526l = obtainStyledAttributes.getInt(0, integer);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(obtainStyledAttributes.getColor(4, color));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(obtainStyledAttributes.getColor(7, color3));
        paint2.setStrokeWidth(obtainStyledAttributes.getDimension(8, dimension));
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(obtainStyledAttributes.getColor(3, color2));
        this.f46516b = obtainStyledAttributes.getDimension(5, dimension2);
        this.f46528n = obtainStyledAttributes.getBoolean(6, z5);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        if (drawable != null) {
            setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f46529o = ViewConfigurationCompat.getScaledPagingTouchSlop(ViewConfiguration.get(context));
    }

    @Override // com.join.mgps.customview.PageIndicator
    public void setViewPager(ViewPager viewPager, int i4) {
        setViewPager(viewPager);
        setCurrentItem(i4);
    }
}
