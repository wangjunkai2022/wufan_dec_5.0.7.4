package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
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
public abstract class ItemCommonZoneGameInfoBottomCardBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final LinearLayout f21784b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f21785c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f21786d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f21787e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final View f21788f;
    @Bindable

    /* renamed from: g  reason: collision with root package name */
    protected CommonGameInfoBean f21789g;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemCommonZoneGameInfoBottomCardBinding(Object obj, View view, int i4, LinearLayout linearLayout, SimpleDraweeView simpleDraweeView, TextView textView, TextView textView2, View view2) {
        super(obj, view, i4);
        this.f21784b = linearLayout;
        this.f21785c = simpleDraweeView;
        this.f21786d = textView;
        this.f21787e = textView2;
        this.f21788f = view2;
    }

    @Deprecated
    public static ItemCommonZoneGameInfoBottomCardBinding b(@NonNull View view, @Nullable Object obj) {
        return (ItemCommonZoneGameInfoBottomCardBinding) ViewDataBinding.bind(obj, view, R.layout.item_common_zone_game_info_bottom_card);
    }

    public static ItemCommonZoneGameInfoBottomCardBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemCommonZoneGameInfoBottomCardBinding d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ItemCommonZoneGameInfoBottomCardBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_common_zone_game_info_bottom_card, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ItemCommonZoneGameInfoBottomCardBinding e(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemCommonZoneGameInfoBottomCardBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_common_zone_game_info_bottom_card, null, false, obj);
    }

    @NonNull
    public static ItemCommonZoneGameInfoBottomCardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return d(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public CommonGameInfoBean c() {
        return this.f21789g;
    }

    public abstract void f(@Nullable CommonGameInfoBean commonGameInfoBean);

    @NonNull
    public static ItemCommonZoneGameInfoBottomCardBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return e(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
