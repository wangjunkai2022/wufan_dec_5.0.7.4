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
import com.join.android.app.component.video.MultiStandVideo;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.CommonGameInfoBean;
/* loaded from: classes3.dex */
public abstract class ItemCommonZoneGameInfoBottomCardVideoBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final LinearLayout f21794b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f21795c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f21796d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f21797e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final MultiStandVideo f21798f;
    @Bindable

    /* renamed from: g  reason: collision with root package name */
    protected CommonGameInfoBean f21799g;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemCommonZoneGameInfoBottomCardVideoBinding(Object obj, View view, int i4, LinearLayout linearLayout, TextView textView, TextView textView2, View view2, MultiStandVideo multiStandVideo) {
        super(obj, view, i4);
        this.f21794b = linearLayout;
        this.f21795c = textView;
        this.f21796d = textView2;
        this.f21797e = view2;
        this.f21798f = multiStandVideo;
    }

    @Deprecated
    public static ItemCommonZoneGameInfoBottomCardVideoBinding b(@NonNull View view, @Nullable Object obj) {
        return (ItemCommonZoneGameInfoBottomCardVideoBinding) ViewDataBinding.bind(obj, view, R.layout.item_common_zone_game_info_bottom_card_video);
    }

    public static ItemCommonZoneGameInfoBottomCardVideoBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemCommonZoneGameInfoBottomCardVideoBinding d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ItemCommonZoneGameInfoBottomCardVideoBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_common_zone_game_info_bottom_card_video, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ItemCommonZoneGameInfoBottomCardVideoBinding e(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemCommonZoneGameInfoBottomCardVideoBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_common_zone_game_info_bottom_card_video, null, false, obj);
    }

    @NonNull
    public static ItemCommonZoneGameInfoBottomCardVideoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return d(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public CommonGameInfoBean c() {
        return this.f21799g;
    }

    public abstract void f(@Nullable CommonGameInfoBean commonGameInfoBean);

    @NonNull
    public static ItemCommonZoneGameInfoBottomCardVideoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return e(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
