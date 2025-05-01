package com.join.kotlin.base.dialog.callback;

import android.app.Activity;
import org.jetbrains.annotations.NotNull;
/* compiled from: IDialogActivityCallback.kt */
/* loaded from: classes3.dex */
public interface IDialogActivityCallback {
    void onActivityDismiss(@NotNull Activity activity);

    void onActivityShow(@NotNull Activity activity);
}
