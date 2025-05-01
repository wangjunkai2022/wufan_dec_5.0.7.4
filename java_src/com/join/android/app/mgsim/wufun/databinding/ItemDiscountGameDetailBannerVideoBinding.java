package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.join.android.app.component.video.MultiStandVideo;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public abstract class ItemDiscountGameDetailBannerVideoBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final MultiStandVideo f21936b;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemDiscountGameDetailBannerVideoBinding(Object obj, View view, int i4, MultiStandVideo multiStandVideo) {
        super(obj, view, i4);
        this.f21936b = multiStandVideo;
    }

    @Deprecated
    public static ItemDiscountGameDetailBannerVideoBinding b(@NonNull View view, @Nullable Object obj) {
        return (ItemDiscountGameDetailBannerVideoBinding) ViewDataBinding.bind(obj, view, R.layout.item_discount_game_detail_banner_video);
    }

    public static ItemDiscountGameDetailBannerVideoBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemDiscountGameDetailBannerVideoBinding c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ItemDiscountGameDetailBannerVideoBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_discount_game_detail_banner_video, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ItemDiscountGameDetailBannerVideoBinding d(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemDiscountGameDetailBannerVideoBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_discount_game_detail_banner_video, null, false, obj);
    }

    @NonNull
    public static ItemDiscountGameDetailBannerVideoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return c(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemDiscountGameDetailBannerVideoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
