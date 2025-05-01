package com.join.kotlin.quark.callback.impl;

import android.app.Activity;
import com.join.kotlin.quark.callback.IDialogShareSourceCallback;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: DialogShareSourceCallbackImpl.kt */
/* loaded from: classes3.dex */
public class DialogShareSourceCallbackImpl implements IDialogShareSourceCallback {
    @Override // com.join.kotlin.base.dialog.callback.IDialogActivityCallback
    public void onActivityDismiss(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // com.join.kotlin.base.dialog.callback.IDialogActivityCallback
    public void onActivityShow(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // com.join.kotlin.quark.callback.IDialogShareSourceCallback
    public void onSuccess() {
    }
}
