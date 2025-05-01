package com.join.kotlin.discount.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.join.kotlin.base.viewmodel.BaseViewModel;
import org.jetbrains.annotations.NotNull;
/* compiled from: GameDetailInfoBottomDialogViewModel.kt */
/* loaded from: classes3.dex */
public final class GameDetailInfoBottomDialogViewModel extends BaseViewModel {
    @NotNull
    private final MutableLiveData<String> title = new MutableLiveData<>("标题");
    @NotNull
    private final MutableLiveData<String> content = new MutableLiveData<>("");
    @NotNull
    private final MutableLiveData<String> btnText = new MutableLiveData<>("我知道了");

    @NotNull
    public final MutableLiveData<String> getBtnText() {
        return this.btnText;
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
