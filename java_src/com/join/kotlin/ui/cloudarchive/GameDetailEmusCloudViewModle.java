package com.join.kotlin.ui.cloudarchive;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.join.kotlin.domain.common.LoadBindindData;
import com.join.kotlin.ui.cloudarchive.adapter.EmusArchiveAdapter;
import com.join.kotlin.ui.cloudarchive.data.EmusDataRequest;
import com.join.mgps.Util.u;
import com.join.mgps.dto.CloudListDataBean;
import com.join.mgps.mod.utils.PluginConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: GameDetailEmusCloudViewModle.kt */
/* loaded from: classes3.dex */
public final class GameDetailEmusCloudViewModle extends ViewModel {
    @NotNull
    private MutableLiveData<List<CloudListDataBean>> listArchive = new MutableLiveData<>();
    @NotNull
    private EmusDataRequest request = new EmusDataRequest();
    @NotNull
    private String packageName = "";
    @NotNull
    private MutableLiveData<LoadBindindData> loadBindData = new MutableLiveData<>();

    public GameDetailEmusCloudViewModle() {
        this.listArchive.setValue(new ArrayList());
    }

    public final void commentArchive(@NotNull Context context, @NotNull CloudListDataBean archiveData, @NotNull String type, int i4) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(archiveData, "archiveData");
        Intrinsics.checkNotNullParameter(type, "type");
    }

    @NotNull
    public final MutableLiveData<List<CloudListDataBean>> getListArchive() {
        return this.listArchive;
    }

    @NotNull
    public final MutableLiveData<LoadBindindData> getLoadBindData() {
        return this.loadBindData;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    public final EmusDataRequest getRequest() {
        return this.request;
    }

    @NotNull
    public final String getRuningArchive() {
        u.c archiveSection = PluginConfig.getArchiveSection(com.join.mgps.va.overmind.f.r(com.join.mgps.va.overmind.f.f54952a, this.packageName, 0, 2, null));
        if (archiveSection != null) {
            String c5 = archiveSection.c("archiveId");
            Intrinsics.checkNotNullExpressionValue(c5, "section[\"archiveId\"]");
            return c5;
        }
        return "0";
    }

    public final void onitemChanged(@NotNull CloudListDataBean archiveData, @NotNull EmusArchiveAdapter adapter) {
        Intrinsics.checkNotNullParameter(archiveData, "archiveData");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        List<CloudListDataBean> value = this.listArchive.getValue();
        Intrinsics.checkNotNull(value);
        int size = value.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            List<CloudListDataBean> value2 = this.listArchive.getValue();
            Intrinsics.checkNotNull(value2);
            if (Intrinsics.areEqual(value2.get(size).getId(), archiveData.getId())) {
                adapter.notifyItemChanged(size, archiveData);
                return;
            }
        }
    }

    public final void setListArchive(@NotNull MutableLiveData<List<CloudListDataBean>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.listArchive = mutableLiveData;
    }

    public final void setLoadBindData(@NotNull MutableLiveData<LoadBindindData> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.loadBindData = mutableLiveData;
    }

    public final void setPackageName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.packageName = str;
    }

    public final void setRequest(@NotNull EmusDataRequest emusDataRequest) {
        Intrinsics.checkNotNullParameter(emusDataRequest, "<set-?>");
        this.request = emusDataRequest;
    }
}
