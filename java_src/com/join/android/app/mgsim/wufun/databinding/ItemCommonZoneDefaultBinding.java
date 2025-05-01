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
public abstract class ItemCommonZoneDefaultBinding extends ViewDataBinding {
    /* JADX INFO: Access modifiers changed from: protected */
    public ItemCommonZoneDefaultBinding(Object obj, View view, int i4) {
        super(obj, view, i4);
    }

    @Deprecated
    public static ItemCommonZoneDefaultBinding b(@NonNull View view, @Nullable Object obj) {
        return (ItemCommonZoneDefaultBinding) ViewDataBinding.bind(obj, view, R.layout.item_common_zone_default);
    }

    public static ItemCommonZoneDefaultBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemCommonZoneDefaultBinding c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ItemCommonZoneDefaultBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_common_zone_default, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ItemCommonZoneDefaultBinding d(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemCommonZoneDefaultBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_common_zone_default, null, false, obj);
    }

    @NonNull
    public static ItemCommonZoneDefaultBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return c(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemCommonZoneDefaultBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
