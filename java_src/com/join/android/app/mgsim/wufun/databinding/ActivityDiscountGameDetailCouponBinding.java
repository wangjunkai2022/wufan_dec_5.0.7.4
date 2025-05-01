package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.base.widget.recycleview.XQuickRecyclerView;
import com.join.kotlin.discount.proxy.GameDetailCouponClickProxy;
import com.join.kotlin.discount.viewmodel.GameDetailCouponViewModel;
/* loaded from: classes3.dex */
public abstract class ActivityDiscountGameDetailCouponBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f15936b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ConstraintLayout f15937c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final XQuickRecyclerView f15938d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f15939e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f15940f;
    @Bindable

    /* renamed from: g  reason: collision with root package name */
    protected GameDetailCouponViewModel f15941g;
    @Bindable

    /* renamed from: h  reason: collision with root package name */
    protected GameDetailCouponClickProxy f15942h;

    /* JADX INFO: Access modifiers changed from: protected */
    public ActivityDiscountGameDetailCouponBinding(Object obj, View view, int i4, ImageView imageView, ConstraintLayout constraintLayout, XQuickRecyclerView xQuickRecyclerView, TextView textView, TextView textView2) {
        super(obj, view, i4);
        this.f15936b = imageView;
        this.f15937c = constraintLayout;
        this.f15938d = xQuickRecyclerView;
        this.f15939e = textView;
        this.f15940f = textView2;
    }

    @Deprecated
    public static ActivityDiscountGameDetailCouponBinding b(@NonNull View view, @Nullable Object obj) {
        return (ActivityDiscountGameDetailCouponBinding) ViewDataBinding.bind(obj, view, R.layout.activity_discount_game_detail_coupon);
    }

    public static ActivityDiscountGameDetailCouponBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ActivityDiscountGameDetailCouponBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ActivityDiscountGameDetailCouponBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_discount_game_detail_coupon, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ActivityDiscountGameDetailCouponBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ActivityDiscountGameDetailCouponBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_discount_game_detail_coupon, null, false, obj);
    }

    @NonNull
    public static ActivityDiscountGameDetailCouponBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public GameDetailCouponClickProxy c() {
        return this.f15942h;
    }

    @Nullable
    public GameDetailCouponViewModel d() {
        return this.f15941g;
    }

    public abstract void g(@Nullable GameDetailCouponClickProxy gameDetailCouponClickProxy);

    public abstract void h(@Nullable GameDetailCouponViewModel gameDetailCouponViewModel);

    @NonNull
    public static ActivityDiscountGameDetailCouponBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
