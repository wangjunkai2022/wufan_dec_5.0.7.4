package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.domain.adapter.BaseDataBindingAdapter;
import com.join.kotlin.domain.common.LoadBindClickProxy;
import com.join.kotlin.ui.coupon.ClickProxy;
import com.join.kotlin.ui.coupon.CouponViewModle;
/* loaded from: classes3.dex */
public abstract class ActivityCouponlistActivityBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f15821b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f15822c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f15823d;
    @Bindable

    /* renamed from: e  reason: collision with root package name */
    protected CouponViewModle f15824e;
    @Bindable

    /* renamed from: f  reason: collision with root package name */
    protected BaseDataBindingAdapter f15825f;
    @Bindable

    /* renamed from: g  reason: collision with root package name */
    protected ClickProxy f15826g;
    @Bindable

    /* renamed from: h  reason: collision with root package name */
    protected LoadBindClickProxy f15827h;

    /* JADX INFO: Access modifiers changed from: protected */
    public ActivityCouponlistActivityBinding(Object obj, View view, int i4, ImageView imageView, RecyclerView recyclerView, TextView textView) {
        super(obj, view, i4);
        this.f15821b = imageView;
        this.f15822c = recyclerView;
        this.f15823d = textView;
    }

    @Deprecated
    public static ActivityCouponlistActivityBinding b(@NonNull View view, @Nullable Object obj) {
        return (ActivityCouponlistActivityBinding) ViewDataBinding.bind(obj, view, R.layout.activity_couponlist_activity);
    }

    public static ActivityCouponlistActivityBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ActivityCouponlistActivityBinding g(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ActivityCouponlistActivityBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_couponlist_activity, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ActivityCouponlistActivityBinding h(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ActivityCouponlistActivityBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_couponlist_activity, null, false, obj);
    }

    @NonNull
    public static ActivityCouponlistActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return g(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public BaseDataBindingAdapter c() {
        return this.f15825f;
    }

    @Nullable
    public ClickProxy d() {
        return this.f15826g;
    }

    @Nullable
    public LoadBindClickProxy e() {
        return this.f15827h;
    }

    @Nullable
    public CouponViewModle f() {
        return this.f15824e;
    }

    public abstract void i(@Nullable BaseDataBindingAdapter baseDataBindingAdapter);

    public abstract void j(@Nullable ClickProxy clickProxy);

    public abstract void k(@Nullable LoadBindClickProxy loadBindClickProxy);

    public abstract void l(@Nullable CouponViewModle couponViewModle);

    @NonNull
    public static ActivityCouponlistActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return h(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
