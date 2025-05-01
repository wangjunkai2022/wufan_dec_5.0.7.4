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
/* loaded from: classes3.dex */
public abstract class ItemDetailBannerIndicatorBinding extends ViewDataBinding {
    @Bindable

    /* renamed from: b  reason: collision with root package name */
    protected Boolean f21875b;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemDetailBannerIndicatorBinding(Object obj, View view, int i4) {
        super(obj, view, i4);
    }

    @Deprecated
    public static ItemDetailBannerIndicatorBinding b(@NonNull View view, @Nullable Object obj) {
        return (ItemDetailBannerIndicatorBinding) ViewDataBinding.bind(obj, view, R.layout.item_detail_banner_indicator);
    }

    public static ItemDetailBannerIndicatorBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemDetailBannerIndicatorBinding d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ItemDetailBannerIndicatorBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_detail_banner_indicator, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ItemDetailBannerIndicatorBinding e(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemDetailBannerIndicatorBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_detail_banner_indicator, null, false, obj);
    }

    @NonNull
    public static ItemDetailBannerIndicatorBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return d(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public Boolean c() {
        return this.f21875b;
    }

    public abstract void f(@Nullable Boolean bool);

    @NonNull
    public static ItemDetailBannerIndicatorBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return e(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
