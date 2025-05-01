package com.join.kotlin.ui.base;

import android.util.SparseArray;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: DataBindingConfig.kt */
/* loaded from: classes3.dex */
public final class DataBindingConfig {
    @NotNull
    private SparseArray<Object> bindingParms;
    private final int layout;
    @NotNull
    private final ViewModel stateViewModle;
    private final int vmVariableId;

    public DataBindingConfig(int i4, int i5, @NotNull ViewModel stateViewModle) {
        Intrinsics.checkNotNullParameter(stateViewModle, "stateViewModle");
        this.layout = i4;
        this.vmVariableId = i5;
        this.stateViewModle = stateViewModle;
        this.bindingParms = new SparseArray<>();
    }

    @NotNull
    public final DataBindingConfig addBindingParam(int i4, @NotNull Object any) {
        Intrinsics.checkNotNullParameter(any, "any");
        if (this.bindingParms.get(i4) == null) {
            this.bindingParms.put(i4, any);
        }
        return this;
    }

    @NotNull
    public final SparseArray<Object> getBindingParms() {
        return this.bindingParms;
    }

    public final int getLayout() {
        return this.layout;
    }

    @NotNull
    public final ViewModel getStateViewModle() {
        return this.stateViewModle;
    }

    public final int getVmVariableId() {
        return this.vmVariableId;
    }

    public final void setBindingParms(@NotNull SparseArray<Object> sparseArray) {
        Intrinsics.checkNotNullParameter(sparseArray, "<set-?>");
        this.bindingParms = sparseArray;
    }
}
