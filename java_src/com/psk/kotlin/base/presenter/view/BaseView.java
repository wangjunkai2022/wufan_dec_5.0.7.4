package com.psk.kotlin.base.presenter.view;

import org.jetbrains.annotations.NotNull;
/* compiled from: BaseView.kt */
/* loaded from: classes5.dex */
public interface BaseView {
    void hidLoading();

    void onError(@NotNull String str);

    void showLoding();
}
