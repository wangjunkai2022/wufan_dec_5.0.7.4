package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public abstract class ItemGameDetailReleaseWelfareListBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final TextView f22275b;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemGameDetailReleaseWelfareListBinding(Object obj, View view, int i4, TextView textView) {
        super(obj, view, i4);
        this.f22275b = textView;
    }

    @Deprecated
    public static ItemGameDetailReleaseWelfareListBinding b(@NonNull View view, @Nullable Object obj) {
        return (ItemGameDetailReleaseWelfareListBinding) ViewDataBinding.bind(obj, view, R.layout.item_game_detail_release_welfare_list);
    }

    public static ItemGameDetailReleaseWelfareListBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemGameDetailReleaseWelfareListBinding c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ItemGameDetailReleaseWelfareListBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_game_detail_release_welfare_list, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ItemGameDetailReleaseWelfareListBinding d(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemGameDetailReleaseWelfareListBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_game_detail_release_welfare_list, null, false, obj);
    }

    @NonNull
    public static ItemGameDetailReleaseWelfareListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return c(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemGameDetailReleaseWelfareListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
