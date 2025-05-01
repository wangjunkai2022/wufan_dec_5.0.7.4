package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public abstract class DatabindingLineLayoutBinding extends ViewDataBinding {
    /* JADX INFO: Access modifiers changed from: protected */
    public DatabindingLineLayoutBinding(Object obj, View view, int i4) {
        super(obj, view, i4);
    }

    @Deprecated
    public static DatabindingLineLayoutBinding b(@NonNull View view, @Nullable Object obj) {
        return (DatabindingLineLayoutBinding) ViewDataBinding.bind(obj, view, R.layout.databinding_line_layout);
    }

    public static DatabindingLineLayoutBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static DatabindingLineLayoutBinding c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (DatabindingLineLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.databinding_line_layout, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static DatabindingLineLayoutBinding d(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (DatabindingLineLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.databinding_line_layout, null, false, obj);
    }

    @NonNull
    public static DatabindingLineLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return c(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static DatabindingLineLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
