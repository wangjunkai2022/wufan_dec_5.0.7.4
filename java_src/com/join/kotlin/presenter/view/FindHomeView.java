package com.join.kotlin.presenter.view;

import com.join.kotlin.ui.findgame.data.FindChoiceResultData;
import com.join.kotlin.ui.findgame.data.FindClassifyResultData;
import com.psk.kotlin.base.presenter.view.BaseView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: FindHomeView.kt */
/* loaded from: classes3.dex */
public interface FindHomeView extends BaseView {

    /* compiled from: FindHomeView.kt */
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        public static void onLoadDataSuccess(@NotNull FindHomeView findHomeView, int i4, @NotNull FindChoiceResultData result) {
            Intrinsics.checkNotNullParameter(result, "result");
        }

        public static void onLoadDataSuccessV9(@NotNull FindHomeView findHomeView, int i4, @NotNull FindClassifyResultData result) {
            Intrinsics.checkNotNullParameter(result, "result");
        }
    }

    void onLoadDataSuccess(int i4, @NotNull FindChoiceResultData findChoiceResultData);

    void onLoadDataSuccessV9(int i4, @NotNull FindClassifyResultData findClassifyResultData);
}
