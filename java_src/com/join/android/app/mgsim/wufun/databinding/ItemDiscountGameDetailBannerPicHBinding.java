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
public abstract class ItemDiscountGameDetailBannerPicHBinding extends ViewDataBinding {
    @Bindable

    /* renamed from: b  reason: collision with root package name */
    protected String f21902b;
    @Bindable

    /* renamed from: c  reason: collision with root package name */
    protected GameDetailFragmentClickProxy f21903c;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemDiscountGameDetailBannerPicHBinding(Object obj, View view, int i4) {
        super(obj, view, i4);
    }

    @Deprecated
    public static ItemDiscountGameDetailBannerPicHBinding b(@NonNull View view, @Nullable Object obj) {
        return (ItemDiscountGameDetailBannerPicHBinding) ViewDataBinding.bind(obj, view, R.layout.item_discount_game_detail_banner_pic_h);
    }

    public static ItemDiscountGameDetailBannerPicHBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemDiscountGameDetailBannerPicHBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ItemDiscountGameDetailBannerPicHBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_discount_game_detail_banner_pic_h, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ItemDiscountGameDetailBannerPicHBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemDiscountGameDetailBannerPicHBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_discount_game_detail_banner_pic_h, null, false, obj);
    }

    @NonNull
    public static ItemDiscountGameDetailBannerPicHBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public GameDetailFragmentClickProxy c() {
        return this.f21903c;
    }

    @Nullable
    public String d() {
        return this.f21902b;
    }

    public abstract void g(@Nullable GameDetailFragmentClickProxy gameDetailFragmentClickProxy);

    public abstract void h(@Nullable String str);

    @NonNull
    public static ItemDiscountGameDetailBannerPicHBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
