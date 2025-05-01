package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.discount.model.bean.CouponItemBean;
import com.join.kotlin.discount.proxy.CouponListClickProxy;
/* loaded from: classes3.dex */
public abstract class ItemCouponGameDetailBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final TextView f21844b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f21845c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f21846d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f21847e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f21848f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f21849g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f21850h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f21851i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f21852j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f21853k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final View f21854l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final View f21855m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final View f21856n;
    @Bindable

    /* renamed from: o  reason: collision with root package name */
    protected CouponItemBean f21857o;
    @Bindable

    /* renamed from: p  reason: collision with root package name */
    protected CouponListClickProxy f21858p;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemCouponGameDetailBinding(Object obj, View view, int i4, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, View view2, View view3, View view4) {
        super(obj, view, i4);
        this.f21844b = textView;
        this.f21845c = textView2;
        this.f21846d = textView3;
        this.f21847e = textView4;
        this.f21848f = textView5;
        this.f21849g = textView6;
        this.f21850h = textView7;
        this.f21851i = textView8;
        this.f21852j = textView9;
        this.f21853k = textView10;
        this.f21854l = view2;
        this.f21855m = view3;
        this.f21856n = view4;
    }

    @Deprecated
    public static ItemCouponGameDetailBinding b(@NonNull View view, @Nullable Object obj) {
        return (ItemCouponGameDetailBinding) ViewDataBinding.bind(obj, view, R.layout.item_coupon_game_detail);
    }

    public static ItemCouponGameDetailBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemCouponGameDetailBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ItemCouponGameDetailBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_coupon_game_detail, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ItemCouponGameDetailBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemCouponGameDetailBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_coupon_game_detail, null, false, obj);
    }

    @NonNull
    public static ItemCouponGameDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public CouponListClickProxy c() {
        return this.f21858p;
    }

    @Nullable
    public CouponItemBean d() {
        return this.f21857o;
    }

    public abstract void g(@Nullable CouponListClickProxy couponListClickProxy);

    public abstract void h(@Nullable CouponItemBean couponItemBean);

    @NonNull
    public static ItemCouponGameDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
