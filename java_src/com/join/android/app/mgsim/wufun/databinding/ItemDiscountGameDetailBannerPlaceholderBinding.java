package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public abstract class ItemDiscountGameDetailBannerPlaceholderBinding extends ViewDataBinding {
    /* JADX INFO: Access modifiers changed from: protected */
    public ItemDiscountGameDetailBannerPlaceholderBinding(Object obj, View view, int i4) {
        super(obj, view, i4);
    }

    @Deprecated
    public static ItemDiscountGameDetailBannerPlaceholderBinding b(@NonNull View view, @Nullable Object obj) {
        return (ItemDiscountGameDetailBannerPlaceholderBinding) ViewDataBinding.bind(obj, view, R.layout.item_discount_game_detail_banner_placeholder);
    }

    public static ItemDiscountGameDetailBannerPlaceholderBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemDiscountGameDetailBannerPlaceholderBinding c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ItemDiscountGameDetailBannerPlaceholderBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_discount_game_detail_banner_placeholder, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ItemDiscountGameDetailBannerPlaceholderBinding d(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemDiscountGameDetailBannerPlaceholderBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_discount_game_detail_banner_placeholder, null, false, obj);
    }

    @NonNull
    public static ItemDiscountGameDetailBannerPlaceholderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return c(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemDiscountGameDetailBannerPlaceholderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
