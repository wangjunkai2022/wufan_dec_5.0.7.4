package com.join.kotlin.base.activity;

import android.view.LayoutInflater;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.join.kotlin.base.ext.ViewBindUtilKt;
import com.join.kotlin.base.viewmodel.BaseViewModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: BaseVmVbActivity.kt */
/* loaded from: classes3.dex */
public abstract class BaseVmVbActivity<VM extends BaseViewModel, VB extends ViewBinding> extends BaseVmActivity<VM> {
    public VB mViewBind;

    @NotNull
    public final VB getMViewBind() {
        VB vb = this.mViewBind;
        if (vb != null) {
            return vb;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mViewBind");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.join.kotlin.base.activity.BaseVmActivity
    @Nullable
    public View initDataBind() {
        LayoutInflater layoutInflater = getLayoutInflater();
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "layoutInflater");
        setMViewBind(ViewBindUtilKt.inflateWithGeneric(this, layoutInflater));
        return getMViewBind().getRoot();
    }

    @Override // com.join.kotlin.base.activity.BaseVmActivity
    public int layoutId() {
        return 0;
    }

    public final void setMViewBind(@NotNull VB vb) {
        Intrinsics.checkNotNullParameter(vb, "<set-?>");
        this.mViewBind = vb;
    }
}
