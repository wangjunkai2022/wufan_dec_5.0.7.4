package com.join.kotlin.quark.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.join.kotlin.base.viewmodel.BaseViewModel;
import com.join.kotlin.quark.model.bean.SourceListItemBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: SourceSaveViewModel.kt */
/* loaded from: classes3.dex */
public final class SourceSaveViewModel extends BaseViewModel {
    @NotNull
    private MutableLiveData<String> title = new MutableLiveData<>("资源保存");
    @NotNull
    private MutableLiveData<SourceListItemBean> itemBean = new MutableLiveData<>(null);

    @NotNull
    public final MutableLiveData<SourceListItemBean> getItemBean() {
        return this.itemBean;
    }

    @NotNull
    public final MutableLiveData<String> getTitle() {
        return this.title;
    }

    public final void setItemBean(@NotNull MutableLiveData<SourceListItemBean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.itemBean = mutableLiveData;
    }

    public final void setTitle(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.title = mutableLiveData;
    }
}
