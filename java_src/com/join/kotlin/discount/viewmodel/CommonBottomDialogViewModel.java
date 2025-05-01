package com.join.kotlin.discount.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.join.kotlin.base.viewmodel.BaseViewModel;
import org.jetbrains.annotations.NotNull;
/* compiled from: CommonBottomDialogViewModel.kt */
/* loaded from: classes3.dex */
public final class CommonBottomDialogViewModel extends BaseViewModel {
    @NotNull
    private final MutableLiveData<String> title = new MutableLiveData<>("标题");
    @NotNull
    private final MutableLiveData<String> content = new MutableLiveData<>("");
    @NotNull
    private final MutableLiveData<String> btnConfirmText = new MutableLiveData<>("我知道了");
    @NotNull
    private final MutableLiveData<String> btnCancelText = new MutableLiveData<>("取消");

    @NotNull
    public final MutableLiveData<String> getBtnCancelText() {
        return this.btnCancelText;
    }

    @NotNull
    public final MutableLiveData<String> getBtnConfirmText() {
        return this.btnConfirmText;
    }

    @NotNull
    public final MutableLiveData<String> getContent() {
        return this.content;
    }

    @NotNull
    public final MutableLiveData<String> getTitle() {
        return this.title;
    }
}
