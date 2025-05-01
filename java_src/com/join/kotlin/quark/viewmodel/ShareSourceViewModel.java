package com.join.kotlin.quark.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.join.kotlin.base.ext.BaseViewModelExtKt;
import com.join.kotlin.base.state.ResultState;
import com.join.kotlin.base.viewmodel.BaseViewModel;
import com.join.kotlin.quark.model.bean.SourceListItemBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ShareSourceViewModel.kt */
/* loaded from: classes3.dex */
public final class ShareSourceViewModel extends BaseViewModel {
    @Nullable
    private SourceListItemBean wishPoolItem;
    @NotNull
    private final MutableLiveData<String> title = new MutableLiveData<>("资源共享");
    @NotNull
    private final MutableLiveData<ResultState<Boolean>> resultData = new MutableLiveData<>();
    @NotNull
    private final MutableLiveData<String> diskUrl = new MutableLiveData<>();
    @NotNull
    private final MutableLiveData<Boolean> submitEnable = new MutableLiveData<>(Boolean.FALSE);

    @NotNull
    public final MutableLiveData<String> getDiskUrl() {
        return this.diskUrl;
    }

    @NotNull
    public final MutableLiveData<ResultState<Boolean>> getResultData() {
        return this.resultData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getSubmitEnable() {
        return this.submitEnable;
    }

    @NotNull
    public final MutableLiveData<String> getTitle() {
        return this.title;
    }

    @Nullable
    public final SourceListItemBean getWishPoolItem() {
        return this.wishPoolItem;
    }

    public final void setWishPoolItem(@Nullable SourceListItemBean sourceListItemBean) {
        this.wishPoolItem = sourceListItemBean;
    }

    public final void sourceAngel(@NotNull String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        BaseViewModelExtKt.request$default(this, new ShareSourceViewModel$sourceAngel$1(this, uid, null), this.resultData, false, null, 12, null);
    }
}
