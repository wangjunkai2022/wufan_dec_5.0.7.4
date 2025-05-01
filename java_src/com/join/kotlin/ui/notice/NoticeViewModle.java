package com.join.kotlin.ui.notice;

import androidx.lifecycle.MutableLiveData;
import com.join.kotlin.domain.common.BaseLoadListDataModle;
import com.join.kotlin.domain.common.LoadBindindData;
import com.join.mgps.dto.BTActivityBean;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: NoticeViewModle.kt */
/* loaded from: classes3.dex */
public final class NoticeViewModle extends BaseLoadListDataModle {
    @NotNull
    private MutableLiveData<LoadBindindData> loadDataBinding;
    @NotNull
    private MutableLiveData<ArrayList<BTActivityBean>> noticeDats = new MutableLiveData<>();
    @NotNull
    private NoticeRequest request = new NoticeRequest();
    @NotNull
    private String title = "活动公告";

    public NoticeViewModle() {
        MutableLiveData<LoadBindindData> mutableLiveData = new MutableLiveData<>();
        this.loadDataBinding = mutableLiveData;
        mutableLiveData.setValue(new LoadBindindData(2));
    }

    @NotNull
    public final MutableLiveData<LoadBindindData> getLoadDataBinding() {
        return this.loadDataBinding;
    }

    @NotNull
    public final MutableLiveData<ArrayList<BTActivityBean>> getNoticeDats() {
        return this.noticeDats;
    }

    @NotNull
    public final NoticeRequest getRequest() {
        return this.request;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final void setLoadDataBinding(@NotNull MutableLiveData<LoadBindindData> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.loadDataBinding = mutableLiveData;
    }

    public final void setNoticeDats(@NotNull MutableLiveData<ArrayList<BTActivityBean>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.noticeDats = mutableLiveData;
    }

    public final void setRequest(@NotNull NoticeRequest noticeRequest) {
        Intrinsics.checkNotNullParameter(noticeRequest, "<set-?>");
        this.request = noticeRequest;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final void updateShowLoadUI(boolean z4) {
        if (this.noticeDats.getValue() == null) {
            this.loadDataBinding.setValue(new LoadBindindData(2));
            return;
        }
        ArrayList<BTActivityBean> value = this.noticeDats.getValue();
        Intrinsics.checkNotNull(value);
        if (value.size() != 0) {
            this.loadDataBinding.setValue(new LoadBindindData(1));
        } else if (z4) {
            this.loadDataBinding.setValue(new LoadBindindData(4));
        } else {
            this.loadDataBinding.setValue(new LoadBindindData(3));
        }
    }
}
