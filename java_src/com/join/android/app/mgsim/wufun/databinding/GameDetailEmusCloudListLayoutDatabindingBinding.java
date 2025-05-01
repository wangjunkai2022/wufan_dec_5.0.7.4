package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.domain.common.LoadBindClickProxy;
import com.join.kotlin.ui.cloudarchive.GameDetailEmusCloudViewModle;
/* loaded from: classes3.dex */
public abstract class GameDetailEmusCloudListLayoutDatabindingBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final BinddingLoadLayoutIncludeBinding f20250b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final XRecyclerView f20251c;
    @Bindable

    /* renamed from: d  reason: collision with root package name */
    protected GameDetailEmusCloudViewModle f20252d;
    @Bindable

    /* renamed from: e  reason: collision with root package name */
    protected RecyclerView.Adapter f20253e;
    @Bindable

    /* renamed from: f  reason: collision with root package name */
    protected LoadBindClickProxy f20254f;

    /* JADX INFO: Access modifiers changed from: protected */
    public GameDetailEmusCloudListLayoutDatabindingBinding(Object obj, View view, int i4, BinddingLoadLayoutIncludeBinding binddingLoadLayoutIncludeBinding, XRecyclerView xRecyclerView) {
        super(obj, view, i4);
        this.f20250b = binddingLoadLayoutIncludeBinding;
        this.f20251c = xRecyclerView;
    }

    @Deprecated
    public static GameDetailEmusCloudListLayoutDatabindingBinding b(@NonNull View view, @Nullable Object obj) {
        return (GameDetailEmusCloudListLayoutDatabindingBinding) ViewDataBinding.bind(obj, view, R.layout.game_detail_emus_cloud_list_layout_databinding);
    }

    public static GameDetailEmusCloudListLayoutDatabindingBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static GameDetailEmusCloudListLayoutDatabindingBinding f(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (GameDetailEmusCloudListLayoutDatabindingBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.game_detail_emus_cloud_list_layout_databinding, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static GameDetailEmusCloudListLayoutDatabindingBinding g(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (GameDetailEmusCloudListLayoutDatabindingBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.game_detail_emus_cloud_list_layout_databinding, null, false, obj);
    }

    @NonNull
    public static GameDetailEmusCloudListLayoutDatabindingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return f(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public RecyclerView.Adapter c() {
        return this.f20253e;
    }

    @Nullable
    public LoadBindClickProxy d() {
        return this.f20254f;
    }

    @Nullable
    public GameDetailEmusCloudViewModle e() {
        return this.f20252d;
    }

    public abstract void h(@Nullable RecyclerView.Adapter adapter);

    public abstract void i(@Nullable LoadBindClickProxy loadBindClickProxy);

    public abstract void j(@Nullable GameDetailEmusCloudViewModle gameDetailEmusCloudViewModle);

    @NonNull
    public static GameDetailEmusCloudListLayoutDatabindingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return g(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
