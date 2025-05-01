package com.join.kotlin.discount.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.join.kotlin.base.viewmodel.BaseViewModel;
import org.jetbrains.annotations.NotNull;
/* compiled from: GameDetailCommentDataViewModel.kt */
/* loaded from: classes3.dex */
public final class GameDetailCommentDataViewModel extends BaseViewModel {
    @NotNull
    private final MutableLiveData<String> title = new MutableLiveData<>("标题");

    @NotNull
    public final MutableLiveData<String> getTitle() {
        return this.title;
    }
}
