package com.join.mgps.pulltorefresh.library.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.pulltorefresh.library.PullToRefreshBase;
@SuppressLint({"ViewConstructor"})
/* loaded from: classes4.dex */
public abstract class LoadingLayout extends FrameLayout implements com.join.mgps.pulltorefresh.library.a {

    /* renamed from: m  reason: collision with root package name */
    static final String f53961m = "PullToRefresh-LoadingLayout";

    /* renamed from: n  reason: collision with root package name */
    static final Interpolator f53962n = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    private FrameLayout f53963b;

    /* renamed from: c  reason: collision with root package name */
    protected final ImageView f53964c;

    /* renamed from: d  reason: collision with root package name */
    protected final ProgressBar f53965d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f53966e;

    /* renamed from: f  reason: collision with root package name */
    private final TextView f53967f;

    /* renamed from: g  reason: collision with root package name */
    private final TextView f53968g;

    /* renamed from: h  reason: collision with root package name */
    protected final PullToRefreshBase.Mode f53969h;

    /* renamed from: i  reason: collision with root package name */
    protected final PullToRefreshBase.Orientation f53970i;

    /* renamed from: j  reason: collision with root package name */
    private CharSequence f53971j;

    /* renamed from: k  reason: collision with root package name */
    private CharSequence f53972k;

    /* renamed from: l  reason: collision with root package name */
    private CharSequence f53973l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f53974a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f53975b;

        static {
            int[] iArr = new int[PullToRefreshBase.Mode.values().length];
            f53975b = iArr;
            try {
                iArr[PullToRefreshBase.Mode.PULL_FROM_END.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53975b[PullToRefreshBase.Mode.PULL_FROM_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[PullToRefreshBase.Orientation.values().length];
            f53974a = iArr2;
            try {
                iArr2[PullToRefreshBase.Orientation.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f53974a[PullToRefreshBase.Orientation.VERTICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public LoadingLayout(Context context, PullToRefreshBase.Mode mode, PullToRefreshBase.Orientation orientation, TypedArray typedArray) {
        super(context);
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable;
        this.f53969h = mode;
        this.f53970i = orientation;
        if (a.f53974a[orientation.ordinal()] != 1) {
            LayoutInflater.from(context).inflate(R.layout.pull_to_refresh_header_vertical, this);
        } else {
            LayoutInflater.from(context).inflate(R.layout.pull_to_refresh_header_horizontal, this);
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.fl_inner);
        this.f53963b = frameLayout;
        this.f53967f = (TextView) frameLayout.findViewById(R.id.pull_to_refresh_text);
        this.f53965d = (ProgressBar) this.f53963b.findViewById(R.id.pull_to_refresh_progress);
        this.f53968g = (TextView) this.f53963b.findViewById(R.id.pull_to_refresh_sub_text);
        this.f53964c = (ImageView) this.f53963b.findViewById(R.id.pull_to_refresh_image);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f53963b.getLayoutParams();
        int[] iArr = a.f53975b;
        if (iArr[mode.ordinal()] != 1) {
            layoutParams.gravity = orientation == PullToRefreshBase.Orientation.VERTICAL ? 80 : 5;
            this.f53971j = context.getString(R.string.pull_to_refresh_pull_label);
            this.f53972k = context.getString(R.string.pull_to_refresh_refreshing_label);
            this.f53973l = context.getString(R.string.pull_to_refresh_release_label);
        } else {
            layoutParams.gravity = orientation == PullToRefreshBase.Orientation.VERTICAL ? 48 : 3;
            this.f53971j = context.getString(R.string.pull_to_refresh_from_bottom_pull_label);
            this.f53972k = context.getString(R.string.pull_to_refresh_from_bottom_refreshing_label);
            this.f53973l = context.getString(R.string.pull_to_refresh_from_bottom_release_label);
        }
        if (typedArray.hasValue(7) && (drawable = typedArray.getDrawable(7)) != null) {
            c.b(this, drawable);
        }
        if (typedArray.hasValue(9)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(9, typedValue);
            setTextAppearance(typedValue.data);
        }
        if (typedArray.hasValue(18)) {
            TypedValue typedValue2 = new TypedValue();
            typedArray.getValue(18, typedValue2);
            setSubTextAppearance(typedValue2.data);
        }
        if (typedArray.hasValue(10) && (colorStateList2 = typedArray.getColorStateList(10)) != null) {
            setTextColor(colorStateList2);
        }
        if (typedArray.hasValue(8) && (colorStateList = typedArray.getColorStateList(8)) != null) {
            setSubTextColor(colorStateList);
        }
        Drawable drawable2 = typedArray.hasValue(2) ? typedArray.getDrawable(2) : null;
        if (iArr[mode.ordinal()] != 1) {
            if (typedArray.hasValue(5)) {
                drawable2 = typedArray.getDrawable(5);
            } else if (typedArray.hasValue(6)) {
                b.a("ptrDrawableTop", "ptrDrawableStart");
                drawable2 = typedArray.getDrawable(6);
            }
        } else if (typedArray.hasValue(4)) {
            drawable2 = typedArray.getDrawable(4);
        } else if (typedArray.hasValue(3)) {
            b.a("ptrDrawableBottom", "ptrDrawableEnd");
            drawable2 = typedArray.getDrawable(3);
        }
        setLoadingDrawable(drawable2 == null ? context.getResources().getDrawable(getDefaultDrawableResId()) : drawable2);
        k();
    }

    private void setSubHeaderText(CharSequence charSequence) {
        if (this.f53968g != null) {
            if (TextUtils.isEmpty(charSequence)) {
                this.f53968g.setVisibility(8);
                return;
            }
            this.f53968g.setText(charSequence);
            if (8 == this.f53968g.getVisibility()) {
                this.f53968g.setVisibility(0);
            }
        }
    }

    private void setSubTextAppearance(int i4) {
        TextView textView = this.f53968g;
        if (textView != null) {
            textView.setTextAppearance(getContext(), i4);
        }
    }

    private void setSubTextColor(ColorStateList colorStateList) {
        TextView textView = this.f53968g;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    private void setTextAppearance(int i4) {
        TextView textView = this.f53967f;
        if (textView != null) {
            textView.setTextAppearance(getContext(), i4);
        }
        TextView textView2 = this.f53968g;
        if (textView2 != null) {
            textView2.setTextAppearance(getContext(), i4);
        }
    }

    private void setTextColor(ColorStateList colorStateList) {
        TextView textView = this.f53967f;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
        TextView textView2 = this.f53968g;
        if (textView2 != null) {
            textView2.setTextColor(colorStateList);
        }
    }

    public final void a() {
        if (this.f53967f.getVisibility() == 0) {
            this.f53967f.setVisibility(4);
        }
        if (this.f53965d.getVisibility() == 0) {
            this.f53965d.setVisibility(4);
        }
        if (this.f53964c.getVisibility() == 0) {
            this.f53964c.setVisibility(4);
        }
        if (this.f53968g.getVisibility() == 0) {
            this.f53968g.setVisibility(4);
        }
    }

    protected abstract void b(Drawable drawable);

    public final void c(float f5) {
        if (this.f53966e) {
            return;
        }
        d(f5);
    }

    protected abstract void d(float f5);

    public final void e() {
        TextView textView = this.f53967f;
        if (textView != null) {
            textView.setText(this.f53971j);
        }
        f();
    }

    protected abstract void f();

    public final void g() {
        TextView textView = this.f53967f;
        if (textView != null) {
            textView.setText(this.f53972k);
        }
        if (this.f53966e) {
            ((AnimationDrawable) this.f53964c.getDrawable()).start();
        } else {
            h();
        }
        TextView textView2 = this.f53968g;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
    }

    public final int getContentSize() {
        if (a.f53974a[this.f53970i.ordinal()] != 1) {
            return this.f53963b.getHeight();
        }
        return this.f53963b.getWidth();
    }

    protected abstract int getDefaultDrawableResId();

    protected abstract void h();

    public final void i() {
        TextView textView = this.f53967f;
        if (textView != null) {
            textView.setText(this.f53973l);
        }
        j();
    }

    protected abstract void j();

    public final void k() {
        TextView textView = this.f53967f;
        if (textView != null) {
            textView.setText(this.f53971j);
        }
        this.f53964c.setVisibility(0);
        if (this.f53966e) {
            ((AnimationDrawable) this.f53964c.getDrawable()).stop();
        } else {
            l();
        }
        TextView textView2 = this.f53968g;
        if (textView2 != null) {
            if (TextUtils.isEmpty(textView2.getText())) {
                this.f53968g.setVisibility(8);
            } else {
                this.f53968g.setVisibility(0);
            }
        }
    }

    protected abstract void l();

    public final void m() {
        if (4 == this.f53967f.getVisibility()) {
            this.f53967f.setVisibility(0);
        }
        if (4 == this.f53965d.getVisibility()) {
            this.f53965d.setVisibility(0);
        }
        if (4 == this.f53964c.getVisibility()) {
            this.f53964c.setVisibility(0);
        }
        if (4 == this.f53968g.getVisibility()) {
            this.f53968g.setVisibility(0);
        }
    }

    public final void setHeight(int i4) {
        getLayoutParams().height = i4;
        requestLayout();
    }

    @Override // com.join.mgps.pulltorefresh.library.a
    public void setLastUpdatedLabel(CharSequence charSequence) {
        setSubHeaderText(charSequence);
    }

    @Override // com.join.mgps.pulltorefresh.library.a
    public final void setLoadingDrawable(Drawable drawable) {
        this.f53964c.setImageDrawable(drawable);
        this.f53966e = drawable instanceof AnimationDrawable;
        b(drawable);
    }

    @Override // com.join.mgps.pulltorefresh.library.a
    public void setPullLabel(CharSequence charSequence) {
        this.f53971j = charSequence;
    }

    @Override // com.join.mgps.pulltorefresh.library.a
    public void setRefreshingLabel(CharSequence charSequence) {
        this.f53972k = charSequence;
    }

    @Override // com.join.mgps.pulltorefresh.library.a
    public void setReleaseLabel(CharSequence charSequence) {
        this.f53973l = charSequence;
    }

    @Override // com.join.mgps.pulltorefresh.library.a
    public void setTextTypeface(Typeface typeface) {
        this.f53967f.setTypeface(typeface);
    }

    public final void setWidth(int i4) {
        getLayoutParams().width = i4;
        requestLayout();
    }
}
