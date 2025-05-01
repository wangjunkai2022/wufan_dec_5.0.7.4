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
import com.join.kotlin.quark.viewmodel.SourceHopeListViewModel;
/* loaded from: classes3.dex */
public abstract class FragmentSourceHopeBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final XQuickRecyclerView f20129b;
    @Bindable

    /* renamed from: c  reason: collision with root package name */
    protected SourceHopeListViewModel f20130c;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentSourceHopeBinding(Object obj, View view, int i4, XQuickRecyclerView xQuickRecyclerView) {
        super(obj, view, i4);
        this.f20129b = xQuickRecyclerView;
    }

    @Deprecated
    public static FragmentSourceHopeBinding b(@NonNull View view, @Nullable Object obj) {
        return (FragmentSourceHopeBinding) ViewDataBinding.bind(obj, view, R.layout.fragment_source_hope);
    }

    public static FragmentSourceHopeBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentSourceHopeBinding d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (FragmentSourceHopeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_source_hope, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static FragmentSourceHopeBinding e(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentSourceHopeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_source_hope, null, false, obj);
    }

    @NonNull
    public static FragmentSourceHopeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return d(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public SourceHopeListViewModel c() {
        return this.f20130c;
    }

    public abstract void f(@Nullable SourceHopeListViewModel sourceHopeListViewModel);

    @NonNull
    public static FragmentSourceHopeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return e(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
