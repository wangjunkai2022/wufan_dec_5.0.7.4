package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.domain.adapter.BaseDataBindingAdapter;
import com.join.kotlin.ui.modleregin.viewModle.GameListViewModle;
/* loaded from: classes3.dex */
public abstract class DatabGamelistLayoutBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final XRecyclerView f18314b;
    @Bindable

    /* renamed from: c  reason: collision with root package name */
    protected XRecyclerView.f f18315c;
    @Bindable

    /* renamed from: d  reason: collision with root package name */
    protected BaseDataBindingAdapter<Object, ViewDataBinding> f18316d;
    @Bindable

    /* renamed from: e  reason: collision with root package name */
    protected GameListViewModle f18317e;

    /* JADX INFO: Access modifiers changed from: protected */
    public DatabGamelistLayoutBinding(Object obj, View view, int i4, XRecyclerView xRecyclerView) {
        super(obj, view, i4);
        this.f18314b = xRecyclerView;
    }

    @Deprecated
    public static DatabGamelistLayoutBinding b(@NonNull View view, @Nullable Object obj) {
        return (DatabGamelistLayoutBinding) ViewDataBinding.bind(obj, view, R.layout.datab_gamelist_layout);
    }

    public static DatabGamelistLayoutBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static DatabGamelistLayoutBinding f(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (DatabGamelistLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.datab_gamelist_layout, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static DatabGamelistLayoutBinding g(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (DatabGamelistLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.datab_gamelist_layout, null, false, obj);
    }

    @NonNull
    public static DatabGamelistLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return f(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public BaseDataBindingAdapter<Object, ViewDataBinding> c() {
        return this.f18316d;
    }

    @Nullable
    public XRecyclerView.f d() {
        return this.f18315c;
    }

    @Nullable
    public GameListViewModle e() {
        return this.f18317e;
    }

    public abstract void h(@Nullable BaseDataBindingAdapter<Object, ViewDataBinding> baseDataBindingAdapter);

    public abstract void i(@Nullable XRecyclerView.f fVar);

    public abstract void j(@Nullable GameListViewModle gameListViewModle);

    @NonNull
    public static DatabGamelistLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return g(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
