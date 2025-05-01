package com.join.kotlin.ui.cloudarchive.dialog;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: ImageDialogViewmodle.kt */
/* loaded from: classes3.dex */
public final class ImageDialogViewmodle extends ViewModel {
    @NotNull
    private MutableLiveData<String> imagePath = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<Integer> orientation = new MutableLiveData<>();

    @NotNull
    public final MutableLiveData<String> getImagePath() {
        return this.imagePath;
    }

    @NotNull
    public final MutableLiveData<Integer> getOrientation() {
        return this.orientation;
    }

    public final void setImagePath(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.imagePath = mutableLiveData;
    }

    public final void setOrientation(@NotNull MutableLiveData<Integer> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.orientation = mutableLiveData;
    }
}
