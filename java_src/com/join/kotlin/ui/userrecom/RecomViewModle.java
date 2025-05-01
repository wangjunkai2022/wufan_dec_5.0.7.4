package com.join.kotlin.ui.userrecom;

import androidx.lifecycle.MutableLiveData;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.kotlin.ui.base.BaseHasDownloadActivityViewModle;
import com.join.kotlin.ui.findgame.data.FindChoiceBannerData;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.psk.kotlin.util.CommonListMainData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: RecomViewModle.kt */
/* loaded from: classes3.dex */
public final class RecomViewModle extends BaseHasDownloadActivityViewModle {
    @NotNull
    private MutableLiveData<String> titleMessage = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<List<String>> gameIdlist = new MutableLiveData<>();
    @NotNull
    private String recycleViewH = "300px";
    @NotNull
    private UserRecomRequest request = new UserRecomRequest();
    @NotNull
    private MutableLiveData<ArrayList<CommonListMainData>> showDataList = new MutableLiveData<>();

    @NotNull
    public final MutableLiveData<List<String>> getGameIdlist() {
        return this.gameIdlist;
    }

    @NotNull
    public final String getRecycleViewH() {
        return this.recycleViewH;
    }

    @NotNull
    public final UserRecomRequest getRequest() {
        return this.request;
    }

    @NotNull
    public final MutableLiveData<ArrayList<CommonListMainData>> getShowDataList() {
        return this.showDataList;
    }

    @NotNull
    public final MutableLiveData<String> getTitleMessage() {
        return this.titleMessage;
    }

    public final void setGameIdlist(@NotNull MutableLiveData<List<String>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.gameIdlist = mutableLiveData;
    }

    public final void setRecycleViewH(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.recycleViewH = str;
    }

    public final void setRequest(@NotNull UserRecomRequest userRecomRequest) {
        Intrinsics.checkNotNullParameter(userRecomRequest, "<set-?>");
        this.request = userRecomRequest;
    }

    public final void setShowDataList(@NotNull MutableLiveData<ArrayList<CommonListMainData>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.showDataList = mutableLiveData;
    }

    public final void setTitleMessage(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.titleMessage = mutableLiveData;
    }

    @Override // com.join.kotlin.ui.base.BaseHasDownloadActivityViewModle
    public void updateDowStateList(@NotNull DownloadTask downloadTask, @NotNull Function1<? super CollectionBeanSubBusiness, Unit> func) {
        Intrinsics.checkNotNullParameter(downloadTask, "downloadTask");
        Intrinsics.checkNotNullParameter(func, "func");
        try {
            ArrayList<CommonListMainData> value = this.showDataList.getValue();
            Intrinsics.checkNotNull(value);
            Iterator<CommonListMainData> it2 = value.iterator();
            while (it2.hasNext()) {
                CommonListMainData next = it2.next();
                if (next.getType() == 2) {
                    Object any = next.getAny();
                    Intrinsics.checkNotNull(any, "null cannot be cast to non-null type com.join.mgps.business.CollectionBeanSubBusiness");
                    func.invoke((CollectionBeanSubBusiness) any);
                } else if (next.getType() == 3) {
                    Object any2 = next.getAny();
                    Intrinsics.checkNotNull(any2, "null cannot be cast to non-null type com.join.kotlin.ui.findgame.data.FindChoiceBannerData");
                    CollectionBeanSubBusiness game_info = ((FindChoiceBannerData) any2).getGame_info();
                    Intrinsics.checkNotNullExpressionValue(game_info, "subp.game_info");
                    func.invoke(game_info);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.join.kotlin.ui.base.BaseHasDownloadActivityViewModle
    public void updateProgressPartly() {
    }
}
