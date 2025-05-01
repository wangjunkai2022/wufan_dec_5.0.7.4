package com.join.kotlin.base.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import com.join.kotlin.base.ext.ViewBindUtilKt;
import com.join.kotlin.base.viewmodel.BaseViewModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: BaseVmDbFragment.kt */
/* loaded from: classes3.dex */
public abstract class BaseVmDbFragment<VM extends BaseViewModel, DB extends ViewDataBinding> extends BaseVmFragment<VM> {
    @Nullable
    private DB _binding;

    @NotNull
    public final DB getMDatabind() {
        DB db = this._binding;
        Intrinsics.checkNotNull(db);
        return db;
    }

    @Override // com.join.kotlin.base.fragment.BaseVmFragment
    public int layoutId() {
        return 0;
    }

    @Override // com.join.kotlin.base.fragment.BaseVmFragment, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = (DB) ViewBindUtilKt.inflateWithGeneric(this, inflater, viewGroup, false);
        return getMDatabind().getRoot();
    }

    @Override // com.join.kotlin.base.fragment.BaseVmFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this._binding = null;
    }
}
