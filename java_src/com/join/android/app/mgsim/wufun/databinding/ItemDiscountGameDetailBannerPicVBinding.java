package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.discount.proxy.GameDetailFragmentClickProxy;
/* loaded from: classes3.dex */
public abstract class ItemDiscountGameDetailBannerPicVBinding extends ViewDataBinding {
    @Bindable

    /* renamed from: b  reason: collision with root package name */
    protected String f21910b;
    @Bindable

    /* renamed from: c  reason: collision with root package name */
    protected String f21911c;
    @Bindable

    /* renamed from: d  reason: collision with root package name */
    protected String f21912d;
    @Bindable

    /* renamed from: e  reason: collision with root package name */
    protected GameDetailFragmentClickProxy f21913e;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemDiscountGameDetailBannerPicVBinding(Object obj, View view, int i4) {
        super(obj, view, i4);
    }

    @Deprecated
    public static ItemDiscountGameDetailBannerPicVBinding b(@NonNull View view, @Nullable Object obj) {
        return (ItemDiscountGameDetailBannerPicVBinding) ViewDataBinding.bind(obj, view, R.layout.item_discount_game_detail_banner_pic_v);
    }

    public static ItemDiscountGameDetailBannerPicVBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemDiscountGameDetailBannerPicVBinding g(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ItemDiscountGameDetailBannerPicVBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_discount_game_detail_banner_pic_v, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ItemDiscountGameDetailBannerPicVBinding h(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemDiscountGameDetailBannerPicVBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_discount_game_detail_banner_pic_v, null, false, obj);
    }

    @NonNull
    public static ItemDiscountGameDetailBannerPicVBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return g(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public GameDetailFragmentClickProxy c() {
        return this.f21913e;
    }

    @Nullable
    public String d() {
        return this.f21910b;
    }

    @Nullable
    public String e() {
        return this.f21911c;
    }

    @Nullable
    public String f() {
        return this.f21912d;
    }

    public abstract void i(@Nullable GameDetailFragmentClickProxy gameDetailFragmentClickProxy);

    public abstract void j(@Nullable String str);

    public abstract void k(@Nullable String str);

    public abstract void l(@Nullable String str);

    @NonNull
    public static ItemDiscountGameDetailBannerPicVBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return h(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
