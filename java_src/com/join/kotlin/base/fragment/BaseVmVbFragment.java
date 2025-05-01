package com.join.kotlin.base.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.join.kotlin.base.ext.ViewBindUtilKt;
import com.join.kotlin.base.viewmodel.BaseViewModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: BaseVmVbFragment.kt */
/* loaded from: classes3.dex */
public abstract class BaseVmVbFragment<VM extends BaseViewModel, VB extends ViewBinding> extends BaseVmFragment<VM> {
    @Nullable
    private VB _binding;

    @NotNull
    public final VB getMViewBind() {
        VB vb = this._binding;
        Intrinsics.checkNotNull(vb);
        return vb;
    }

    @Override // com.join.kotlin.base.fragment.BaseVmFragment
    public int layoutId() {
        return 0;
    }

    @Override // com.join.kotlin.base.fragment.BaseVmFragment, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = (VB) ViewBindUtilKt.inflateWithGeneric(this, inflater, viewGroup, false);
        return getMViewBind().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }
}
