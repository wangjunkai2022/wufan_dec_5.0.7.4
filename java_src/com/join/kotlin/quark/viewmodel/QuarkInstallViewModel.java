package com.join.kotlin.quark.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.join.kotlin.base.viewmodel.BaseViewModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: QuarkInstallViewModel.kt */
/* loaded from: classes3.dex */
public final class QuarkInstallViewModel extends BaseViewModel {
    @NotNull
    private MutableLiveData<String> title = new MutableLiveData<>("资源共享");

    @NotNull
    public final MutableLiveData<String> getTitle() {
        return this.title;
    }

    public final void setTitle(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.title = mutableLiveData;
    }
}
