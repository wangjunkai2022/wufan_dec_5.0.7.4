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
import com.join.kotlin.base.widget.recycleview.XQuickRecyclerView;
import com.join.kotlin.quark.proxy.SourceShareClickProxy;
import com.join.kotlin.quark.viewmodel.SourceShareListViewModel;
/* loaded from: classes3.dex */
public abstract class FragmentSourceShareBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final XQuickRecyclerView f20135b;
    @Bindable

    /* renamed from: c  reason: collision with root package name */
    protected SourceShareListViewModel f20136c;
    @Bindable

    /* renamed from: d  reason: collision with root package name */
    protected SourceShareClickProxy f20137d;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentSourceShareBinding(Object obj, View view, int i4, XQuickRecyclerView xQuickRecyclerView) {
        super(obj, view, i4);
        this.f20135b = xQuickRecyclerView;
    }

    @Deprecated
    public static FragmentSourceShareBinding b(@NonNull View view, @Nullable Object obj) {
        return (FragmentSourceShareBinding) ViewDataBinding.bind(obj, view, R.layout.fragment_source_share);
    }

    public static FragmentSourceShareBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentSourceShareBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (FragmentSourceShareBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_source_share, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static FragmentSourceShareBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentSourceShareBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_source_share, null, false, obj);
    }

    @NonNull
    public static FragmentSourceShareBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public SourceShareClickProxy c() {
        return this.f20137d;
    }

    @Nullable
    public SourceShareListViewModel d() {
        return this.f20136c;
    }

    public abstract void g(@Nullable SourceShareClickProxy sourceShareClickProxy);

    public abstract void h(@Nullable SourceShareListViewModel sourceShareListViewModel);

    @NonNull
    public static FragmentSourceShareBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
