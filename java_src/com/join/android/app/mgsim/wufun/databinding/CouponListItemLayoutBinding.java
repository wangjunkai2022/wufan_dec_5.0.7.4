package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.ui.coupon.ClickProxy;
import com.join.mgps.dto.BTGameCouponBean;
/* loaded from: classes3.dex */
public abstract class CouponListItemLayoutBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final TextView f18257b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f18258c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final View f18259d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ConstraintLayout f18260e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f18261f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f18262g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f18263h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f18264i;
    @Bindable

    /* renamed from: j  reason: collision with root package name */
    protected BTGameCouponBean f18265j;
    @Bindable

    /* renamed from: k  reason: collision with root package name */
    protected Boolean f18266k;
    @Bindable

    /* renamed from: l  reason: collision with root package name */
    protected ClickProxy f18267l;

    /* JADX INFO: Access modifiers changed from: protected */
    public CouponListItemLayoutBinding(Object obj, View view, int i4, TextView textView, TextView textView2, View view2, ConstraintLayout constraintLayout, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        super(obj, view, i4);
        this.f18257b = textView;
        this.f18258c = textView2;
        this.f18259d = view2;
        this.f18260e = constraintLayout;
        this.f18261f = textView3;
        this.f18262g = textView4;
        this.f18263h = textView5;
        this.f18264i = textView6;
    }

    @Deprecated
    public static CouponListItemLayoutBinding b(@NonNull View view, @Nullable Object obj) {
        return (CouponListItemLayoutBinding) ViewDataBinding.bind(obj, view, R.layout.coupon_list_item_layout);
    }

    public static CouponListItemLayoutBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static CouponListItemLayoutBinding f(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (CouponListItemLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.coupon_list_item_layout, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static CouponListItemLayoutBinding g(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (CouponListItemLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.coupon_list_item_layout, null, false, obj);
    }

    @NonNull
    public static CouponListItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return f(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public BTGameCouponBean c() {
        return this.f18265j;
    }

    @Nullable
    public ClickProxy d() {
        return this.f18267l;
    }

    @Nullable
    public Boolean e() {
        return this.f18266k;
    }

    public abstract void h(@Nullable BTGameCouponBean bTGameCouponBean);

    public abstract void i(@Nullable ClickProxy clickProxy);

    public abstract void j(@Nullable Boolean bool);

    @NonNull
    public static CouponListItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return g(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
