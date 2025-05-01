package com.join.kotlin.zone.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.MApplication;
import com.join.android.app.common.utils.j;
import com.join.kotlin.base.ext.BaseViewModelExtKt;
import com.join.kotlin.base.state.ResultState;
import com.join.kotlin.base.viewmodel.BaseViewModel;
import com.join.kotlin.domain.common.LoadBindindData;
import com.join.kotlin.zone.model.bean.GameZoneDataBean;
import com.join.kotlin.zone.model.bean.ZoneMultiEntry;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: CommonZoneViewModel.kt */
/* loaded from: classes3.dex */
public final class CommonZoneViewModel extends BaseViewModel {
    @NotNull
    private MutableLiveData<String> title = new MutableLiveData<>("专区");
    @NotNull
    private List<ZoneMultiEntry> showData = new ArrayList();
    @NotNull
    private MutableLiveData<LoadBindindData> loadBindData = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<ResultState<GameZoneDataBean>> zoneData = new MutableLiveData<>();

    public CommonZoneViewModel() {
        this.loadBindData.setValue(new LoadBindindData(2));
    }

    public final void getGameZone(@NotNull String zoneId) {
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        if (!j.j(MApplication.f1497x)) {
            this.loadBindData.setValue(new LoadBindindData(3));
        } else {
            BaseViewModelExtKt.request$default(this, new CommonZoneViewModel$getGameZone$1(this, zoneId, null), this.zoneData, false, null, 12, null);
        }
    }

    @NotNull
    public final MutableLiveData<LoadBindindData> getLoadBindData() {
        return this.loadBindData;
    }

    @NotNull
    public final List<ZoneMultiEntry> getShowData() {
        return this.showData;
    }

    @NotNull
    public final MutableLiveData<String> getTitle() {
        return this.title;
    }

    @NotNull
    public final MutableLiveData<ResultState<GameZoneDataBean>> getZoneData() {
        return this.zoneData;
    }

    public final void setLoadBindData(@NotNull MutableLiveData<LoadBindindData> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.loadBindData = mutableLiveData;
    }

    public final void setShowData(@NotNull List<ZoneMultiEntry> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.showData = list;
    }

    public final void setTitle(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.title = mutableLiveData;
    }

    public final void setZoneData(@NotNull MutableLiveData<ResultState<GameZoneDataBean>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.zoneData = mutableLiveData;
    }
}
