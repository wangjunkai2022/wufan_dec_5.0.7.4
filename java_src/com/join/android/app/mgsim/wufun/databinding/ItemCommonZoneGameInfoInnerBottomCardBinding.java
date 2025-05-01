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
public abstract class ItemCommonZoneGameInfoInnerBottomCardBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final SimpleDraweeView f21804b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f21805c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f21806d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f21807e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f21808f;
    @Bindable

    /* renamed from: g  reason: collision with root package name */
    protected CommonGameInfoBean f21809g;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemCommonZoneGameInfoInnerBottomCardBinding(Object obj, View view, int i4, SimpleDraweeView simpleDraweeView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i4);
        this.f21804b = simpleDraweeView;
        this.f21805c = textView;
        this.f21806d = textView2;
        this.f21807e = textView3;
        this.f21808f = textView4;
    }

    @Deprecated
    public static ItemCommonZoneGameInfoInnerBottomCardBinding b(@NonNull View view, @Nullable Object obj) {
        return (ItemCommonZoneGameInfoInnerBottomCardBinding) ViewDataBinding.bind(obj, view, R.layout.item_common_zone_game_info_inner_bottom_card);
    }

    public static ItemCommonZoneGameInfoInnerBottomCardBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemCommonZoneGameInfoInnerBottomCardBinding d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ItemCommonZoneGameInfoInnerBottomCardBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_common_zone_game_info_inner_bottom_card, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ItemCommonZoneGameInfoInnerBottomCardBinding e(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemCommonZoneGameInfoInnerBottomCardBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_common_zone_game_info_inner_bottom_card, null, false, obj);
    }

    @NonNull
    public static ItemCommonZoneGameInfoInnerBottomCardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return d(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public CommonGameInfoBean c() {
        return this.f21809g;
    }

    public abstract void f(@Nullable CommonGameInfoBean commonGameInfoBean);

    @NonNull
    public static ItemCommonZoneGameInfoInnerBottomCardBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return e(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
