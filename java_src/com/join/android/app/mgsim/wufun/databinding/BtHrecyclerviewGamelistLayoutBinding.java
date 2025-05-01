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
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.domain.adapter.BaseDataBindingAdapter;
import com.join.mgps.business.CollectionBeanSubBusiness;
import java.util.List;
/* loaded from: classes3.dex */
public abstract class BtHrecyclerviewGamelistLayoutBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final RecyclerView f17585b;
    @Bindable

    /* renamed from: c  reason: collision with root package name */
    protected List<CollectionBeanSubBusiness> f17586c;
    @Bindable

    /* renamed from: d  reason: collision with root package name */
    protected BaseDataBindingAdapter<Object, ViewDataBinding> f17587d;

    /* JADX INFO: Access modifiers changed from: protected */
    public BtHrecyclerviewGamelistLayoutBinding(Object obj, View view, int i4, RecyclerView recyclerView) {
        super(obj, view, i4);
        this.f17585b = recyclerView;
    }

    @Deprecated
    public static BtHrecyclerviewGamelistLayoutBinding b(@NonNull View view, @Nullable Object obj) {
        return (BtHrecyclerviewGamelistLayoutBinding) ViewDataBinding.bind(obj, view, R.layout.bt_hrecyclerview_gamelist_layout);
    }

    public static BtHrecyclerviewGamelistLayoutBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static BtHrecyclerviewGamelistLayoutBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (BtHrecyclerviewGamelistLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.bt_hrecyclerview_gamelist_layout, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static BtHrecyclerviewGamelistLayoutBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (BtHrecyclerviewGamelistLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.bt_hrecyclerview_gamelist_layout, null, false, obj);
    }

    @NonNull
    public static BtHrecyclerviewGamelistLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public BaseDataBindingAdapter<Object, ViewDataBinding> c() {
        return this.f17587d;
    }

    @Nullable
    public List<CollectionBeanSubBusiness> d() {
        return this.f17586c;
    }

    public abstract void g(@Nullable BaseDataBindingAdapter<Object, ViewDataBinding> baseDataBindingAdapter);

    public abstract void h(@Nullable List<CollectionBeanSubBusiness> list);

    @NonNull
    public static BtHrecyclerviewGamelistLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
