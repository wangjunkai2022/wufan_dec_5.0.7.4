package com.join.kotlin.presenter.view;

import com.join.kotlin.ui.findgame.data.CategoryListMain;
import com.psk.kotlin.base.presenter.view.BaseView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: CategoryView.kt */
/* loaded from: classes3.dex */
public interface CategoryView extends BaseView {

    /* compiled from: CategoryView.kt */
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        public static void onLoadDataSuccess(@NotNull CategoryView categoryView, int i4, @NotNull CategoryListMain result) {
            Intrinsics.checkNotNullParameter(result, "result");
        }
    }

    void onLoadDataSuccess(int i4, @NotNull CategoryListMain categoryListMain);
}
