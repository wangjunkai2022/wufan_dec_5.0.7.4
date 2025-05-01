package com.join.kotlin.quark.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.join.kotlin.base.ext.BaseViewModelExtKt;
import com.join.kotlin.base.state.ResultState;
import com.join.kotlin.base.viewmodel.BaseViewModel;
import com.join.kotlin.quark.model.bean.SourceTabListBean;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: SourceShareViewModel.kt */
/* loaded from: classes3.dex */
public final class SourceShareViewModel extends BaseViewModel {
    @NotNull
    private MutableLiveData<String> title = new MutableLiveData<>("云盘资源");
    @NotNull
    private List<SourceTabListBean> showData = new ArrayList();
    @NotNull
    private MutableLiveData<ResultState<SourceTabListBean>> homeData = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<String> searchKeyword = new MutableLiveData<>("");
    @NotNull
    private MutableLiveData<Boolean> showBanner = new MutableLiveData<>();

    @NotNull
    public final MutableLiveData<ResultState<SourceTabListBean>> getHomeData() {
        return this.homeData;
    }

    @NotNull
    public final MutableLiveData<String> getSearchKeyword() {
        return this.searchKeyword;
    }

    @NotNull
    public final MutableLiveData<Boolean> getShowBanner() {
        return this.showBanner;
    }

    @NotNull
    public final List<SourceTabListBean> getShowData() {
        return this.showData;
    }

    @NotNull
    public final MutableLiveData<String> getTitle() {
        return this.title;
    }

    public final void getWebDiskHome(@NotNull String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        BaseViewModelExtKt.request$default(this, new SourceShareViewModel$getWebDiskHome$1(uid, null), this.homeData, false, null, 12, null);
    }

    public final void setHomeData(@NotNull MutableLiveData<ResultState<SourceTabListBean>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.homeData = mutableLiveData;
    }

    public final void setSearchKeyword(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.searchKeyword = mutableLiveData;
    }

    public final void setShowBanner(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.showBanner = mutableLiveData;
    }

    public final void setShowData(@NotNull List<SourceTabListBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.showData = list;
    }

    public final void setTitle(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.title = mutableLiveData;
    }
}
