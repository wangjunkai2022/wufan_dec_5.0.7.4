package com.join.kotlin.quark.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.join.kotlin.base.ext.BaseViewModelExtKt;
import com.join.kotlin.base.state.ResultState;
import com.join.kotlin.base.viewmodel.BaseViewModel;
import com.join.kotlin.quark.model.bean.SourceTabItemBean;
import com.join.kotlin.quark.model.bean.SourceTabListBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: UploadSourceHopeViewModel.kt */
/* loaded from: classes3.dex */
public final class UploadSourceHopeViewModel extends BaseViewModel {
    @Nullable
    private SourceTabItemBean selectTag;
    @NotNull
    private MutableLiveData<String> title = new MutableLiveData<>("分享资源");
    @NotNull
    private MutableLiveData<ResultState<SourceTabListBean>> homeData = new MutableLiveData<>();
    @NotNull
    private final MutableLiveData<ResultState<Boolean>> uploadData = new MutableLiveData<>();
    @NotNull
    private final MutableLiveData<String> descData = new MutableLiveData<>();
    @NotNull
    private final MutableLiveData<String> linkData = new MutableLiveData<>();

    @NotNull
    public final MutableLiveData<String> getDescData() {
        return this.descData;
    }

    @NotNull
    public final MutableLiveData<ResultState<SourceTabListBean>> getHomeData() {
        return this.homeData;
    }

    @NotNull
    public final MutableLiveData<String> getLinkData() {
        return this.linkData;
    }

    @Nullable
    public final SourceTabItemBean getSelectTag() {
        return this.selectTag;
    }

    @NotNull
    public final MutableLiveData<String> getTitle() {
        return this.title;
    }

    @NotNull
    public final MutableLiveData<ResultState<Boolean>> getUploadData() {
        return this.uploadData;
    }

    public final void getWebDiskHome(@NotNull String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        BaseViewModelExtKt.request$default(this, new UploadSourceHopeViewModel$getWebDiskHome$1(uid, null), this.homeData, false, null, 12, null);
    }

    public final void setHomeData(@NotNull MutableLiveData<ResultState<SourceTabListBean>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.homeData = mutableLiveData;
    }

    public final void setSelectTag(@Nullable SourceTabItemBean sourceTabItemBean) {
        this.selectTag = sourceTabItemBean;
    }

    public final void setTitle(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.title = mutableLiveData;
    }

    public final void sourceShareCreate(int i4, @NotNull String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        BaseViewModelExtKt.request$default(this, new UploadSourceHopeViewModel$sourceShareCreate$1(this, i4, uid, null), this.uploadData, false, null, 12, null);
    }
}
