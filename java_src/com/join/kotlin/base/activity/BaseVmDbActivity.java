package com.join.kotlin.base.activity;

import android.view.LayoutInflater;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.join.kotlin.base.ext.ViewBindUtilKt;
import com.join.kotlin.base.viewmodel.BaseViewModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: BaseVmDbActivity.kt */
/* loaded from: classes3.dex */
public abstract class BaseVmDbActivity<VM extends BaseViewModel, DB extends ViewDataBinding> extends BaseVmActivity<VM> {
    public DB mDatabind;

    @NotNull
    public final DB getMDatabind() {
        DB db = this.mDatabind;
        if (db != null) {
            return db;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mDatabind");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.join.kotlin.base.activity.BaseVmActivity
    @Nullable
    public View initDataBind() {
        LayoutInflater layoutInflater = getLayoutInflater();
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "layoutInflater");
        setMDatabind((ViewDataBinding) ViewBindUtilKt.inflateWithGeneric(this, layoutInflater));
        return getMDatabind().getRoot();
    }

    @Override // com.join.kotlin.base.activity.BaseVmActivity
    public int layoutId() {
        return 0;
    }

    public final void setMDatabind(@NotNull DB db) {
        Intrinsics.checkNotNullParameter(db, "<set-?>");
        this.mDatabind = db;
    }
}
