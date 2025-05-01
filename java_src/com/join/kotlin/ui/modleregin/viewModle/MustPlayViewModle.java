package com.join.kotlin.ui.modleregin.viewModle;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.kotlin.domain.common.LoadBindindData;
import com.join.kotlin.ui.base.BaseHasDownloadActivityViewModle;
import com.join.kotlin.ui.modleregin.modle.MustplayItemBean;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.dto.RequestGameIdArgs;
import com.join.mgps.dto.RequestModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s1;
import org.jetbrains.annotations.NotNull;
/* compiled from: MustPlayViewModle.kt */
/* loaded from: classes3.dex */
public final class MustPlayViewModle extends BaseHasDownloadActivityViewModle {
    @NotNull
    private MutableLiveData<List<MustplayItemBean>> showDatas = new MutableLiveData<>();
    private int page = 1;
    @NotNull
    private String title = "必玩大作";
    @NotNull
    private MutableLiveData<LoadBindindData> loadBindData = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<Integer> recycleViewStatus = new MutableLiveData<>();

    public MustPlayViewModle() {
        this.showDatas.setValue(new ArrayList());
        this.recycleViewStatus.setValue(0);
        this.loadBindData.setValue(new LoadBindindData(2));
    }

    @NotNull
    public final MutableLiveData<LoadBindindData> getLoadBindData() {
        return this.loadBindData;
    }

    public final int getPage() {
        return this.page;
    }

    @NotNull
    public final MutableLiveData<Integer> getRecycleViewStatus() {
        return this.recycleViewStatus;
    }

    @NotNull
    public final MutableLiveData<List<MustplayItemBean>> getShowDatas() {
        return this.showDatas;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final void loadDatas(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        loadDatas(context, this.page);
    }

    public final void setLoadBindData(@NotNull MutableLiveData<LoadBindindData> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.loadBindData = mutableLiveData;
    }

    public final void setPage(int i4) {
        this.page = i4;
    }

    public final void setRecycleViewStatus(@NotNull MutableLiveData<Integer> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.recycleViewStatus = mutableLiveData;
    }

    public final void setShowDatas(@NotNull MutableLiveData<List<MustplayItemBean>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.showDatas = mutableLiveData;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    @Override // com.join.kotlin.ui.base.BaseHasDownloadActivityViewModle
    public void updateDowStateList(@NotNull DownloadTask downloadTask, @NotNull Function1<? super CollectionBeanSubBusiness, Unit> func) {
        Intrinsics.checkNotNullParameter(downloadTask, "downloadTask");
        Intrinsics.checkNotNullParameter(func, "func");
        try {
            List<MustplayItemBean> value = this.showDatas.getValue();
            Intrinsics.checkNotNull(value);
            for (MustplayItemBean mustplayItemBean : value) {
                func.invoke(mustplayItemBean.getGameinfo());
            }
            MutableLiveData<List<MustplayItemBean>> mutableLiveData = this.showDatas;
            mutableLiveData.setValue(mutableLiveData.getValue());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.join.kotlin.ui.base.BaseHasDownloadActivityViewModle
    public void updateProgressPartly() {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.join.mgps.dto.RequestModel, T] */
    public final void loadDatas(@NotNull Context context, int i4) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.page = i4;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? requestModel = new RequestModel();
        objectRef.element = requestModel;
        ((RequestModel) requestModel).setDefault(context);
        ((RequestModel) objectRef.element).setArgs(new RequestGameIdArgs());
        ((RequestGameIdArgs) ((RequestModel) objectRef.element).getArgs()).setPage(this.page);
        ((RequestGameIdArgs) ((RequestModel) objectRef.element).getArgs()).setUid(AccountUtil_.getInstance_(context).getAccountData().getUid());
        if (this.page == 1) {
            this.loadBindData.setValue(new LoadBindindData(2));
        }
        k.f(s1.f71252b, d1.c(), null, new MustPlayViewModle$loadDatas$job$1(objectRef, this, context, null), 2, null);
    }
}
