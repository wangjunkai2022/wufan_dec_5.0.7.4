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
public abstract class ItemCouponBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final TextView f21819b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f21820c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f21821d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f21822e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f21823f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f21824g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f21825h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f21826i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f21827j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f21828k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f21829l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f21830m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f21831n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final View f21832o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final View f21833p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final View f21834q;
    @Bindable

    /* renamed from: r  reason: collision with root package name */
    protected CouponItemBean f21835r;
    @Bindable

    /* renamed from: s  reason: collision with root package name */
    protected CouponListClickProxy f21836s;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemCouponBinding(Object obj, View view, int i4, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, View view2, View view3, View view4) {
        super(obj, view, i4);
        this.f21819b = textView;
        this.f21820c = textView2;
        this.f21821d = textView3;
        this.f21822e = textView4;
        this.f21823f = textView5;
        this.f21824g = textView6;
        this.f21825h = textView7;
        this.f21826i = textView8;
        this.f21827j = textView9;
        this.f21828k = textView10;
        this.f21829l = textView11;
        this.f21830m = textView12;
        this.f21831n = textView13;
        this.f21832o = view2;
        this.f21833p = view3;
        this.f21834q = view4;
    }

    @Deprecated
    public static ItemCouponBinding b(@NonNull View view, @Nullable Object obj) {
        return (ItemCouponBinding) ViewDataBinding.bind(obj, view, R.layout.item_coupon);
    }

    public static ItemCouponBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemCouponBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ItemCouponBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_coupon, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ItemCouponBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemCouponBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_coupon, null, false, obj);
    }

    @NonNull
    public static ItemCouponBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public CouponListClickProxy c() {
        return this.f21836s;
    }

    @Nullable
    public CouponItemBean d() {
        return this.f21835r;
    }

    public abstract void g(@Nullable CouponListClickProxy couponListClickProxy);

    public abstract void h(@Nullable CouponItemBean couponItemBean);

    @NonNull
    public static ItemCouponBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
