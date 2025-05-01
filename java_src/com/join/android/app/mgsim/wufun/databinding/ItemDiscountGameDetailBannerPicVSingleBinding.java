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
public abstract class ItemDiscountGameDetailBannerPicVSingleBinding extends ViewDataBinding {
    @Bindable

    /* renamed from: b  reason: collision with root package name */
    protected String f21924b;
    @Bindable

    /* renamed from: c  reason: collision with root package name */
    protected GameDetailFragmentClickProxy f21925c;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemDiscountGameDetailBannerPicVSingleBinding(Object obj, View view, int i4) {
        super(obj, view, i4);
    }

    @Deprecated
    public static ItemDiscountGameDetailBannerPicVSingleBinding b(@NonNull View view, @Nullable Object obj) {
        return (ItemDiscountGameDetailBannerPicVSingleBinding) ViewDataBinding.bind(obj, view, R.layout.item_discount_game_detail_banner_pic_v_single);
    }

    public static ItemDiscountGameDetailBannerPicVSingleBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemDiscountGameDetailBannerPicVSingleBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ItemDiscountGameDetailBannerPicVSingleBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_discount_game_detail_banner_pic_v_single, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ItemDiscountGameDetailBannerPicVSingleBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemDiscountGameDetailBannerPicVSingleBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_discount_game_detail_banner_pic_v_single, null, false, obj);
    }

    @NonNull
    public static ItemDiscountGameDetailBannerPicVSingleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public GameDetailFragmentClickProxy c() {
        return this.f21925c;
    }

    @Nullable
    public String d() {
        return this.f21924b;
    }

    public abstract void g(@Nullable GameDetailFragmentClickProxy gameDetailFragmentClickProxy);

    public abstract void h(@Nullable String str);

    @NonNull
    public static ItemDiscountGameDetailBannerPicVSingleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
