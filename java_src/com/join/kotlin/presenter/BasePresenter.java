package com.join.kotlin.presenter;

import com.psk.kotlin.base.presenter.view.BaseView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: BasePresenter.kt */
/* loaded from: classes3.dex */
public class BasePresenter<T extends BaseView> {
    public T mView;

    @NotNull
    public final T getMView() {
        T t4 = this.mView;
        if (t4 != null) {
            return t4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mView");
        return null;
    }

    public final void setMView(@NotNull T t4) {
        Intrinsics.checkNotNullParameter(t4, "<set-?>");
        this.mView = t4;
    }
}
