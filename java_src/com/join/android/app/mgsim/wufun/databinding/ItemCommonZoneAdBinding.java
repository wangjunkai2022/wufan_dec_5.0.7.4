package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.CommonGameInfoBean;
/* loaded from: classes3.dex */
public abstract class ItemCommonZoneAdBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final SimpleDraweeView f21766b;
    @Bindable

    /* renamed from: c  reason: collision with root package name */
    protected CommonGameInfoBean f21767c;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemCommonZoneAdBinding(Object obj, View view, int i4, SimpleDraweeView simpleDraweeView) {
        super(obj, view, i4);
        this.f21766b = simpleDraweeView;
    }

    @Deprecated
    public static ItemCommonZoneAdBinding b(@NonNull View view, @Nullable Object obj) {
        return (ItemCommonZoneAdBinding) ViewDataBinding.bind(obj, view, R.layout.item_common_zone_ad);
    }

    public static ItemCommonZoneAdBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemCommonZoneAdBinding d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ItemCommonZoneAdBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_common_zone_ad, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ItemCommonZoneAdBinding e(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemCommonZoneAdBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_common_zone_ad, null, false, obj);
    }

    @NonNull
    public static ItemCommonZoneAdBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return d(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public CommonGameInfoBean c() {
        return this.f21767c;
    }

    public abstract void f(@Nullable CommonGameInfoBean commonGameInfoBean);

    @NonNull
    public static ItemCommonZoneAdBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return e(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
