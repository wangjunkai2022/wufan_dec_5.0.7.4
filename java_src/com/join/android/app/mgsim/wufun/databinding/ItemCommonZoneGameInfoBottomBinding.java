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
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.CommonGameInfoBean;
/* loaded from: classes3.dex */
public abstract class ItemCommonZoneGameInfoBottomBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final SimpleDraweeView f21776b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f21777c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f21778d;
    @Bindable

    /* renamed from: e  reason: collision with root package name */
    protected CommonGameInfoBean f21779e;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemCommonZoneGameInfoBottomBinding(Object obj, View view, int i4, SimpleDraweeView simpleDraweeView, TextView textView, TextView textView2) {
        super(obj, view, i4);
        this.f21776b = simpleDraweeView;
        this.f21777c = textView;
        this.f21778d = textView2;
    }

    @Deprecated
    public static ItemCommonZoneGameInfoBottomBinding b(@NonNull View view, @Nullable Object obj) {
        return (ItemCommonZoneGameInfoBottomBinding) ViewDataBinding.bind(obj, view, R.layout.item_common_zone_game_info_bottom);
    }

    public static ItemCommonZoneGameInfoBottomBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemCommonZoneGameInfoBottomBinding d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ItemCommonZoneGameInfoBottomBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_common_zone_game_info_bottom, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ItemCommonZoneGameInfoBottomBinding e(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemCommonZoneGameInfoBottomBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_common_zone_game_info_bottom, null, false, obj);
    }

    @NonNull
    public static ItemCommonZoneGameInfoBottomBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return d(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public CommonGameInfoBean c() {
        return this.f21779e;
    }

    public abstract void f(@Nullable CommonGameInfoBean commonGameInfoBean);

    @NonNull
    public static ItemCommonZoneGameInfoBottomBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return e(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
