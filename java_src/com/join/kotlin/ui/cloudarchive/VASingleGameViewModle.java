package com.join.kotlin.ui.cloudarchive;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.domain.common.LoadBindindData;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.dto.ModGameDetailBean;
import com.join.mgps.dto.RequestModGameArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.wufan.user.service.protobuf.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* compiled from: VASingleGameViewModle.kt */
/* loaded from: classes3.dex */
public final class VASingleGameViewModle extends ViewModel {
    public DownloadTask downloadTask;
    public Listener listener;
    @Nullable
    private ModGameDetailBean modGameDetailBean;
    @NotNull
    private MutableLiveData<String> backGroundURl = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<String> gameName = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<Integer> showStatus = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<LoadBindindData> loadBindData = new MutableLiveData<>();
    @NotNull
    private LoadBindindData statusBind = new LoadBindindData(1);

    /* compiled from: VASingleGameViewModle.kt */
    /* loaded from: classes3.dex */
    public interface Listener {
        void onCLickBack();
    }

    /* compiled from: VASingleGameViewModle.kt */
    /* loaded from: classes3.dex */
    public static final class ShowStatus {
        @NotNull
        public static final Companion Companion = new Companion(null);
        public static final int SHOWFAILED = 3;
        public static final int SHOWLODING = 2;
        public static final int SHOWMAIN = 1;
        public static final int SHOWNULL = 4;

        /* compiled from: VASingleGameViewModle.kt */
        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    public VASingleGameViewModle() {
        this.backGroundURl.setValue("");
        this.gameName.setValue("");
        this.loadBindData.setValue(this.statusBind);
    }

    @NotNull
    public final MutableLiveData<String> getBackGroundURl() {
        return this.backGroundURl;
    }

    @NotNull
    public final DownloadTask getDownloadTask() {
        DownloadTask downloadTask = this.downloadTask;
        if (downloadTask != null) {
            return downloadTask;
        }
        Intrinsics.throwUninitializedPropertyAccessException("downloadTask");
        return null;
    }

    @NotNull
    public final MutableLiveData<String> getGameName() {
        return this.gameName;
    }

    @NotNull
    public final Listener getListener() {
        Listener listener = this.listener;
        if (listener != null) {
            return listener;
        }
        Intrinsics.throwUninitializedPropertyAccessException("listener");
        return null;
    }

    @NotNull
    public final MutableLiveData<LoadBindindData> getLoadBindData() {
        return this.loadBindData;
    }

    @Nullable
    public final ModGameDetailBean getModGameDetailBean() {
        return this.modGameDetailBean;
    }

    @NotNull
    public final MutableLiveData<Integer> getShowStatus() {
        return this.showStatus;
    }

    public final void initDatas(@NotNull String gameId) {
        Intrinsics.checkNotNullParameter(gameId, "gameId");
        DownloadTask F = p1.f.K().F(gameId);
        Intrinsics.checkNotNullExpressionValue(F, "getInstance().getByGameId(gameId)");
        setDownloadTask(F);
        this.gameName.setValue(getDownloadTask().getShowName());
    }

    public final void loadDatas(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!com.join.android.app.common.utils.j.j(context)) {
            this.showStatus.setValue(3);
            LoadBindindData value = this.loadBindData.getValue();
            Intrinsics.checkNotNull(value);
            Integer value2 = this.showStatus.getValue();
            Intrinsics.checkNotNull(value2);
            value.setShowStatus(value2.intValue());
            return;
        }
        try {
            n0 accountData = AccountUtil_.getInstance_(context).getAccountData();
            if (accountData == null) {
                accountData = n0.b5();
            }
            this.showStatus.setValue(2);
            LoadBindindData value3 = this.loadBindData.getValue();
            Intrinsics.checkNotNull(value3);
            Integer value4 = this.showStatus.getValue();
            Intrinsics.checkNotNull(value4);
            value3.setShowStatus(value4.intValue());
            RequestModel<RequestModGameArgs> requestModel = new RequestModel<>();
            RequestModGameArgs requestModGameArgs = new RequestModGameArgs();
            requestModGameArgs.setUid(accountData.getUid());
            requestModGameArgs.setUserToken(accountData.getToken());
            requestModGameArgs.setGameId(getDownloadTask().getCrc_link_type_val());
            requestModel.setArgs(requestModGameArgs);
            requestModel.setDefault(context);
            com.join.mgps.rpc.impl.i.D0().B0().B(requestModel).enqueue(new Callback<ResponseModel<ModGameDetailBean>>() { // from class: com.join.kotlin.ui.cloudarchive.VASingleGameViewModle$loadDatas$1
                @Override // retrofit2.Callback
                public void onFailure(@NotNull Call<ResponseModel<ModGameDetailBean>> call, @NotNull Throwable t4) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(t4, "t");
                    VASingleGameViewModle.this.getShowStatus().setValue(3);
                    LoadBindindData value5 = VASingleGameViewModle.this.getLoadBindData().getValue();
                    Intrinsics.checkNotNull(value5);
                    Integer value6 = VASingleGameViewModle.this.getShowStatus().getValue();
                    Intrinsics.checkNotNull(value6);
                    value5.setShowStatus(value6.intValue());
                }

                @Override // retrofit2.Callback
                public void onResponse(@NotNull Call<ResponseModel<ModGameDetailBean>> call, @NotNull Response<ResponseModel<ModGameDetailBean>> response) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(response, "response");
                }
            });
        } catch (Exception e5) {
            e5.printStackTrace();
            this.showStatus.setValue(3);
            LoadBindindData value5 = this.loadBindData.getValue();
            Intrinsics.checkNotNull(value5);
            Integer value6 = this.showStatus.getValue();
            Intrinsics.checkNotNull(value6);
            value5.setShowStatus(value6.intValue());
        }
    }

    public final void onClickView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        int id = view.getId();
        if (id == R.id.cl_mod) {
            if (getDownloadTask() != null) {
                UtilsMy.m4(view.getContext(), getDownloadTask());
            }
        } else if (id != R.id.iv_back) {
        } else {
            Listener listener = getListener();
            Intrinsics.checkNotNull(listener);
            listener.onCLickBack();
        }
    }

    public final void setBackGroundURl(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.backGroundURl = mutableLiveData;
    }

    public final void setDownloadTask(@NotNull DownloadTask downloadTask) {
        Intrinsics.checkNotNullParameter(downloadTask, "<set-?>");
        this.downloadTask = downloadTask;
    }

    public final void setGameName(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.gameName = mutableLiveData;
    }

    public final void setListener(@NotNull Listener listener) {
        Intrinsics.checkNotNullParameter(listener, "<set-?>");
        this.listener = listener;
    }

    public final void setLoadBindData(@NotNull MutableLiveData<LoadBindindData> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.loadBindData = mutableLiveData;
    }

    public final void setModGameDetailBean(@Nullable ModGameDetailBean modGameDetailBean) {
        this.modGameDetailBean = modGameDetailBean;
    }

    public final void setShowStatus(@NotNull MutableLiveData<Integer> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.showStatus = mutableLiveData;
    }
}
