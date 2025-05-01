package com.melnykov.fab;

import android.animation.AnimatorInflater;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.annotation.IntDef;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.melnykov.fab.ObservableScrollView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* loaded from: classes5.dex */
public class FloatingActionButton extends ImageView {

    /* renamed from: m  reason: collision with root package name */
    private static final int f55929m = 500;

    /* renamed from: n  reason: collision with root package name */
    public static final int f55930n = 0;

    /* renamed from: o  reason: collision with root package name */
    public static final int f55931o = 1;

    /* renamed from: b  reason: collision with root package name */
    private boolean f55932b;

    /* renamed from: c  reason: collision with root package name */
    private int f55933c;

    /* renamed from: d  reason: collision with root package name */
    private int f55934d;

    /* renamed from: e  reason: collision with root package name */
    private int f55935e;

    /* renamed from: f  reason: collision with root package name */
    private int f55936f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f55937g;

    /* renamed from: h  reason: collision with root package name */
    private int f55938h;

    /* renamed from: i  reason: collision with root package name */
    private int f55939i;

    /* renamed from: j  reason: collision with root package name */
    private int f55940j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f55941k;

    /* renamed from: l  reason: collision with root package name */
    private final Interpolator f55942l;

    @IntDef({0, 1})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface TYPE {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f55943b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f55944c;

        a(boolean z4, boolean z5) {
            this.f55943b = z4;
            this.f55944c = z5;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            ViewTreeObserver viewTreeObserver = FloatingActionButton.this.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
            FloatingActionButton.this.C(this.f55943b, this.f55944c, true);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class b extends com.melnykov.fab.a {

        /* renamed from: f  reason: collision with root package name */
        private com.melnykov.fab.d f55946f;

        /* renamed from: g  reason: collision with root package name */
        private AbsListView.OnScrollListener f55947g;

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(com.melnykov.fab.d dVar) {
            this.f55946f = dVar;
        }

        @Override // com.melnykov.fab.a
        public void d() {
            FloatingActionButton.this.t();
            com.melnykov.fab.d dVar = this.f55946f;
            if (dVar != null) {
                dVar.a();
            }
        }

        @Override // com.melnykov.fab.a
        public void e() {
            FloatingActionButton.this.t();
            com.melnykov.fab.d dVar = this.f55946f;
            if (dVar != null) {
                dVar.b();
            }
        }

        public void i(AbsListView.OnScrollListener onScrollListener) {
            this.f55947g = onScrollListener;
        }

        @Override // com.melnykov.fab.a, android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
            AbsListView.OnScrollListener onScrollListener = this.f55947g;
            if (onScrollListener != null) {
                onScrollListener.onScroll(absListView, i4, i5, i6);
            }
            super.onScroll(absListView, i4, i5, i6);
        }

        @Override // com.melnykov.fab.a, android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i4) {
            AbsListView.OnScrollListener onScrollListener = this.f55947g;
            if (onScrollListener != null) {
                onScrollListener.onScrollStateChanged(absListView, i4);
            }
            if (i4 == 0) {
                FloatingActionButton.this.A();
            }
            super.onScrollStateChanged(absListView, i4);
        }

        /* synthetic */ b(FloatingActionButton floatingActionButton, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class c extends com.melnykov.fab.c {

        /* renamed from: b  reason: collision with root package name */
        private com.melnykov.fab.d f55949b;

        /* renamed from: c  reason: collision with root package name */
        private RecyclerView.OnScrollListener f55950c;

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(com.melnykov.fab.d dVar) {
            this.f55949b = dVar;
        }

        @Override // com.melnykov.fab.c
        public void b() {
            FloatingActionButton.this.A();
            com.melnykov.fab.d dVar = this.f55949b;
            if (dVar != null) {
                dVar.a();
            }
        }

        @Override // com.melnykov.fab.c
        public void c() {
            FloatingActionButton.this.t();
            com.melnykov.fab.d dVar = this.f55949b;
            if (dVar != null) {
                dVar.b();
            }
        }

        public void f(RecyclerView.OnScrollListener onScrollListener) {
            this.f55950c = onScrollListener;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i4) {
            RecyclerView.OnScrollListener onScrollListener = this.f55950c;
            if (onScrollListener != null) {
                onScrollListener.onScrollStateChanged(recyclerView, i4);
            }
            super.onScrollStateChanged(recyclerView, i4);
        }

        @Override // com.melnykov.fab.c, androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i4, int i5) {
            RecyclerView.OnScrollListener onScrollListener = this.f55950c;
            if (onScrollListener != null) {
                onScrollListener.onScrolled(recyclerView, i4, i5);
            }
            super.onScrolled(recyclerView, i4, i5);
        }

        /* synthetic */ c(FloatingActionButton floatingActionButton, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class d extends e {

        /* renamed from: c  reason: collision with root package name */
        private com.melnykov.fab.d f55952c;

        /* renamed from: d  reason: collision with root package name */
        private ObservableScrollView.a f55953d;

        private d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(com.melnykov.fab.d dVar) {
            this.f55952c = dVar;
        }

        @Override // com.melnykov.fab.e, com.melnykov.fab.ObservableScrollView.a
        public void a(ScrollView scrollView, int i4, int i5, int i6, int i7) {
            ObservableScrollView.a aVar = this.f55953d;
            if (aVar != null) {
                aVar.a(scrollView, i4, i5, i6, i7);
            }
            super.a(scrollView, i4, i5, i6, i7);
        }

        @Override // com.melnykov.fab.e
        public void b() {
            FloatingActionButton.this.A();
            com.melnykov.fab.d dVar = this.f55952c;
            if (dVar != null) {
                dVar.a();
            }
        }

        @Override // com.melnykov.fab.e
        public void c() {
            FloatingActionButton.this.t();
            com.melnykov.fab.d dVar = this.f55952c;
            if (dVar != null) {
                dVar.b();
            }
        }

        public void f(ObservableScrollView.a aVar) {
            this.f55953d = aVar;
        }

        /* synthetic */ d(FloatingActionButton floatingActionButton, a aVar) {
            this();
        }
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(boolean z4, boolean z5, boolean z6) {
        if (this.f55932b != z4 || z6) {
            this.f55932b = z4;
            if (getHeight() == 0 && !z6) {
                ViewTreeObserver viewTreeObserver = getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnPreDrawListener(new a(z4, z5));
                    return;
                }
            }
            int width = z4 ? 0 : (getWidth() / 2) + getMarginRight();
            if (z5) {
                com.nineoldandroids.view.b.c(this).r(this.f55942l).q(500L).v(width);
            } else {
                com.nineoldandroids.view.a.y(this, width);
            }
            if (p()) {
                return;
            }
            setClickable(z4);
        }
    }

    private void D() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, k(this.f55934d));
        stateListDrawable.addState(new int[]{-16842910}, k(this.f55936f));
        stateListDrawable.addState(new int[0], k(this.f55933c));
        setBackgroundCompat(stateListDrawable);
    }

    private int getMarginBottom() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return 0;
    }

    private int getMarginRight() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }
        return 0;
    }

    private Drawable k(int i4) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(i4);
        if (!this.f55937g || r()) {
            return shapeDrawable;
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{getResources().getDrawable(this.f55938h == 0 ? R.drawable.fab_shadow : R.drawable.fab_shadow_mini), shapeDrawable});
        int i5 = this.f55939i;
        layerDrawable.setLayerInset(1, i5, i5, i5, i5);
        return layerDrawable;
    }

    private static int l(int i4) {
        Color.colorToHSV(i4, r0);
        float[] fArr = {0.0f, 0.0f, fArr[2] * 0.9f};
        return Color.HSVToColor(fArr);
    }

    private int m(int i4) {
        return getResources().getColor(i4);
    }

    private int n(int i4) {
        return getResources().getDimensionPixelSize(i4);
    }

    private TypedArray o(Context context, AttributeSet attributeSet, int[] iArr) {
        return context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    private boolean p() {
        return Build.VERSION.SDK_INT >= 11;
    }

    private boolean q() {
        return Build.VERSION.SDK_INT >= 16;
    }

    private boolean r() {
        return Build.VERSION.SDK_INT >= 21;
    }

    @SuppressLint({"NewApi"})
    private void setBackgroundCompat(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @SuppressLint({"NewApi"})
    private void v(Context context, AttributeSet attributeSet) {
        this.f55932b = true;
        int m4 = m(R.color.material_blue_500);
        this.f55933c = m4;
        this.f55934d = l(m4);
        this.f55935e = y(this.f55933c);
        this.f55936f = m(17170432);
        this.f55938h = 0;
        this.f55937g = true;
        this.f55940j = getResources().getDimensionPixelOffset(R.dimen.fab_scroll_threshold);
        this.f55939i = n(R.dimen.fab_shadow_size);
        if (r()) {
            setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, R.anim.fab_press_elevation));
        }
        if (attributeSet != null) {
            w(context, attributeSet);
        }
        D();
    }

    private void w(Context context, AttributeSet attributeSet) {
        TypedArray o4 = o(context, attributeSet, R.styleable.FloatingActionButton);
        if (o4 != null) {
            try {
                int color = o4.getColor(R.styleable.FloatingActionButton_fab_colorNormal, m(R.color.material_blue_500));
                this.f55933c = color;
                this.f55934d = o4.getColor(R.styleable.FloatingActionButton_fab_colorPressed, l(color));
                this.f55935e = o4.getColor(R.styleable.FloatingActionButton_fab_colorRipple, y(this.f55933c));
                this.f55936f = o4.getColor(R.styleable.FloatingActionButton_fab_colorDisabled, this.f55936f);
                this.f55937g = o4.getBoolean(R.styleable.FloatingActionButton_fab_shadow, true);
                this.f55938h = o4.getInt(R.styleable.FloatingActionButton_fab_type, 0);
            } finally {
                o4.recycle();
            }
        }
    }

    private static int y(int i4) {
        Color.colorToHSV(i4, r0);
        float[] fArr = {0.0f, 0.0f, fArr[2] * 1.1f};
        return Color.HSVToColor(fArr);
    }

    private void z() {
        if (this.f55941k || !(getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        int i4 = marginLayoutParams.leftMargin;
        int i5 = this.f55939i;
        marginLayoutParams.setMargins(i4 - i5, marginLayoutParams.topMargin - i5, marginLayoutParams.rightMargin - i5, marginLayoutParams.bottomMargin - i5);
        requestLayout();
        this.f55941k = true;
    }

    public void A() {
        B(true);
    }

    public void B(boolean z4) {
        C(true, z4, false);
    }

    public void b(@NonNull AbsListView absListView) {
        d(absListView, null, null);
    }

    public void c(@NonNull AbsListView absListView, com.melnykov.fab.d dVar) {
        d(absListView, dVar, null);
    }

    public void d(@NonNull AbsListView absListView, com.melnykov.fab.d dVar, AbsListView.OnScrollListener onScrollListener) {
        b bVar = new b(this, null);
        bVar.j(dVar);
        bVar.i(onScrollListener);
        bVar.f(absListView);
        bVar.g(this.f55940j);
        absListView.setOnScrollListener(bVar);
    }

    public void e(@NonNull RecyclerView recyclerView) {
        g(recyclerView, null, null);
    }

    public void f(@NonNull RecyclerView recyclerView, com.melnykov.fab.d dVar) {
        g(recyclerView, dVar, null);
    }

    public void g(@NonNull RecyclerView recyclerView, com.melnykov.fab.d dVar, RecyclerView.OnScrollListener onScrollListener) {
        c cVar = new c(this, null);
        cVar.g(dVar);
        cVar.f(onScrollListener);
        cVar.d(this.f55940j);
        recyclerView.addOnScrollListener(cVar);
    }

    public int getColorNormal() {
        return this.f55933c;
    }

    public int getColorPressed() {
        return this.f55934d;
    }

    public int getColorRipple() {
        return this.f55935e;
    }

    public int getType() {
        return this.f55938h;
    }

    public void h(@NonNull ObservableScrollView observableScrollView) {
        j(observableScrollView, null, null);
    }

    public void i(@NonNull ObservableScrollView observableScrollView, com.melnykov.fab.d dVar) {
        j(observableScrollView, dVar, null);
    }

    public void j(@NonNull ObservableScrollView observableScrollView, com.melnykov.fab.d dVar, ObservableScrollView.a aVar) {
        d dVar2 = new d(this, null);
        dVar2.g(dVar);
        dVar2.f(aVar);
        dVar2.d(this.f55940j);
        observableScrollView.setOnScrollChangedListener(dVar2);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        n(this.f55938h == 0 ? R.dimen.fab_size_normal : R.dimen.fab_size_mini);
        setMeasuredDimension(i4, i4);
    }

    public boolean s() {
        return this.f55937g;
    }

    public void setColorNormal(int i4) {
        if (i4 != this.f55933c) {
            this.f55933c = i4;
            D();
        }
    }

    public void setColorNormalResId(int i4) {
        setColorNormal(m(i4));
    }

    public void setColorPressed(int i4) {
        if (i4 != this.f55934d) {
            this.f55934d = i4;
            D();
        }
    }

    public void setColorPressedResId(int i4) {
        setColorPressed(m(i4));
    }

    public void setColorRipple(int i4) {
        if (i4 != this.f55935e) {
            this.f55935e = i4;
            D();
        }
    }

    public void setColorRippleResId(int i4) {
        setColorRipple(m(i4));
    }

    public void setShadow(boolean z4) {
        if (z4 != this.f55937g) {
            this.f55937g = z4;
            D();
        }
    }

    public void setType(int i4) {
        if (i4 != this.f55938h) {
            this.f55938h = i4;
            D();
        }
    }

    public void t() {
        u(true);
    }

    public void u(boolean z4) {
        C(false, z4, false);
    }

    public boolean x() {
        return this.f55932b;
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55942l = new AccelerateDecelerateInterpolator();
        v(context, attributeSet);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f55942l = new AccelerateDecelerateInterpolator();
        v(context, attributeSet);
    }
}
