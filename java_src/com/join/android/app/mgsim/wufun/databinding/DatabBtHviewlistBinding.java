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
import com.join.kotlin.ui.modleregin.modle.BtTagSelecterBean;
import java.util.List;
/* loaded from: classes3.dex */
public abstract class DatabBtHviewlistBinding extends ViewDataBinding {
    @Bindable

    /* renamed from: b  reason: collision with root package name */
    protected List<BtTagSelecterBean> f18307b;
    @Bindable

    /* renamed from: c  reason: collision with root package name */
    protected BaseDataBindingAdapter<Object, ViewDataBinding> f18308c;

    /* JADX INFO: Access modifiers changed from: protected */
    public DatabBtHviewlistBinding(Object obj, View view, int i4) {
        super(obj, view, i4);
    }

    @Deprecated
    public static DatabBtHviewlistBinding b(@NonNull View view, @Nullable Object obj) {
        return (DatabBtHviewlistBinding) ViewDataBinding.bind(obj, view, R.layout.datab_bt_hviewlist);
    }

    public static DatabBtHviewlistBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static DatabBtHviewlistBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (DatabBtHviewlistBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.datab_bt_hviewlist, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static DatabBtHviewlistBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (DatabBtHviewlistBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.datab_bt_hviewlist, null, false, obj);
    }

    @NonNull
    public static DatabBtHviewlistBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public BaseDataBindingAdapter<Object, ViewDataBinding> c() {
        return this.f18308c;
    }

    @Nullable
    public List<BtTagSelecterBean> d() {
        return this.f18307b;
    }

    public abstract void g(@Nullable BaseDataBindingAdapter<Object, ViewDataBinding> baseDataBindingAdapter);

    public abstract void h(@Nullable List<BtTagSelecterBean> list);

    @NonNull
    public static DatabBtHviewlistBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
