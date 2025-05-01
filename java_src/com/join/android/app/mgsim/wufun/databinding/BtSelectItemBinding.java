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
import com.join.kotlin.ui.modleregin.modle.BtTagSelecterBean;
/* loaded from: classes3.dex */
public abstract class BtSelectItemBinding extends ViewDataBinding {
    @Bindable

    /* renamed from: b  reason: collision with root package name */
    protected BtTagSelecterBean f17624b;

    /* JADX INFO: Access modifiers changed from: protected */
    public BtSelectItemBinding(Object obj, View view, int i4) {
        super(obj, view, i4);
    }

    @Deprecated
    public static BtSelectItemBinding b(@NonNull View view, @Nullable Object obj) {
        return (BtSelectItemBinding) ViewDataBinding.bind(obj, view, R.layout.bt_select_item);
    }

    public static BtSelectItemBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static BtSelectItemBinding d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (BtSelectItemBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.bt_select_item, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static BtSelectItemBinding e(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (BtSelectItemBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.bt_select_item, null, false, obj);
    }

    @NonNull
    public static BtSelectItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return d(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public BtTagSelecterBean c() {
        return this.f17624b;
    }

    public abstract void f(@Nullable BtTagSelecterBean btTagSelecterBean);

    @NonNull
    public static BtSelectItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return e(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
