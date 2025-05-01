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
import com.join.kotlin.domain.adapter.BaseDataBindingAdapter;
import com.join.mgps.dto.BannerBean;
import java.util.List;
/* loaded from: classes3.dex */
public abstract class BtTagRecycviewLayoutBinding extends ViewDataBinding {
    @Bindable

    /* renamed from: b  reason: collision with root package name */
    protected List<BannerBean> f17632b;
    @Bindable

    /* renamed from: c  reason: collision with root package name */
    protected BaseDataBindingAdapter<Object, ViewDataBinding> f17633c;

    /* JADX INFO: Access modifiers changed from: protected */
    public BtTagRecycviewLayoutBinding(Object obj, View view, int i4) {
        super(obj, view, i4);
    }

    @Deprecated
    public static BtTagRecycviewLayoutBinding b(@NonNull View view, @Nullable Object obj) {
        return (BtTagRecycviewLayoutBinding) ViewDataBinding.bind(obj, view, R.layout.bt_tag_recycview_layout);
    }

    public static BtTagRecycviewLayoutBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static BtTagRecycviewLayoutBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (BtTagRecycviewLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.bt_tag_recycview_layout, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static BtTagRecycviewLayoutBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (BtTagRecycviewLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.bt_tag_recycview_layout, null, false, obj);
    }

    @NonNull
    public static BtTagRecycviewLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public BaseDataBindingAdapter<Object, ViewDataBinding> c() {
        return this.f17633c;
    }

    @Nullable
    public List<BannerBean> d() {
        return this.f17632b;
    }

    public abstract void g(@Nullable BaseDataBindingAdapter<Object, ViewDataBinding> baseDataBindingAdapter);

    public abstract void h(@Nullable List<BannerBean> list);

    @NonNull
    public static BtTagRecycviewLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
