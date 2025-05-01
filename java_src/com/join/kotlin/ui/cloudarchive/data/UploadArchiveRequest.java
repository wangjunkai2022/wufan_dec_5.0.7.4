package com.join.kotlin.ui.cloudarchive.data;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.dto.RequestGameIdArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.rpc.impl.i;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* compiled from: UploadArchiveRequest.kt */
/* loaded from: classes3.dex */
public final class UploadArchiveRequest {
    @Nullable
    private Call<ResponseModel<List<ArchiveData>>> result;
    @NotNull
    private MutableLiveData<ResponseModel<List<ArchiveData>>> resultData = new MutableLiveData<>();

    public final void getModeDatas(@NotNull Context context, int i4, @NotNull String gameId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(gameId, "gameId");
        RequestModel<RequestGameIdArgs> requestModel = new RequestModel<>();
        requestModel.setDefault(context);
        RequestGameIdArgs requestGameIdArgs = new RequestGameIdArgs();
        requestGameIdArgs.setGameId(gameId);
        requestGameIdArgs.setPage(i4);
        requestGameIdArgs.setUid(AccountUtil_.getInstance_(context).getAccountData().getUid());
        requestModel.setArgs(requestGameIdArgs);
        Call<ResponseModel<List<ArchiveData>>> b12 = i.D0().B0().b1(requestModel);
        this.result = b12;
        if (b12 != null) {
            b12.enqueue(new Callback<ResponseModel<List<? extends ArchiveData>>>() { // from class: com.join.kotlin.ui.cloudarchive.data.UploadArchiveRequest$getModeDatas$1
                @Override // retrofit2.Callback
                public void onFailure(@NotNull Call<ResponseModel<List<? extends ArchiveData>>> call, @NotNull Throwable t4) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(t4, "t");
                    ResponseModel<List<ArchiveData>> responseModel = new ResponseModel<>();
                    responseModel.setCode(401);
                    UploadArchiveRequest.this.getResultData().setValue(responseModel);
                }

                @Override // retrofit2.Callback
                public void onResponse(@NotNull Call<ResponseModel<List<? extends ArchiveData>>> call, @NotNull Response<ResponseModel<List<? extends ArchiveData>>> response) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(response, "response");
                    if (response.body() != null) {
                        UploadArchiveRequest.this.getResultData().setValue(response.body());
                        return;
                    }
                    ResponseModel<List<ArchiveData>> responseModel = new ResponseModel<>();
                    responseModel.setCode(401);
                    UploadArchiveRequest.this.getResultData().setValue(responseModel);
                }
            });
        }
    }

    @Nullable
    public final Call<ResponseModel<List<ArchiveData>>> getResult() {
        return this.result;
    }

    @NotNull
    public final MutableLiveData<ResponseModel<List<ArchiveData>>> getResultData() {
        return this.resultData;
    }

    public final void loadLocalArchive() {
    }

    public final void loadMyInShop(@NotNull Context context, int i4, @NotNull String gameId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(gameId, "gameId");
        RequestModel<RequestGameIdArgs> requestModel = new RequestModel<>();
        requestModel.setDefault(context);
        RequestGameIdArgs requestGameIdArgs = new RequestGameIdArgs();
        requestGameIdArgs.setGameId(gameId);
        requestGameIdArgs.setPage(i4);
        requestGameIdArgs.setUid(AccountUtil_.getInstance_(context).getAccountData().getUid());
        requestModel.setArgs(requestGameIdArgs);
        Call<ResponseModel<List<ArchiveData>>> D0 = i.D0().B0().D0(requestModel);
        this.result = D0;
        if (D0 != null) {
            D0.enqueue(new Callback<ResponseModel<List<? extends ArchiveData>>>() { // from class: com.join.kotlin.ui.cloudarchive.data.UploadArchiveRequest$loadMyInShop$1
                @Override // retrofit2.Callback
                public void onFailure(@NotNull Call<ResponseModel<List<? extends ArchiveData>>> call, @NotNull Throwable t4) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(t4, "t");
                    ResponseModel<List<ArchiveData>> responseModel = new ResponseModel<>();
                    responseModel.setCode(401);
                    UploadArchiveRequest.this.getResultData().setValue(responseModel);
                }

                @Override // retrofit2.Callback
                public void onResponse(@NotNull Call<ResponseModel<List<? extends ArchiveData>>> call, @NotNull Response<ResponseModel<List<? extends ArchiveData>>> response) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(response, "response");
                    if (response.body() != null) {
                        UploadArchiveRequest.this.getResultData().setValue(response.body());
                        return;
                    }
                    ResponseModel<List<ArchiveData>> responseModel = new ResponseModel<>();
                    responseModel.setCode(401);
                    UploadArchiveRequest.this.getResultData().setValue(responseModel);
                }
            });
        }
    }

    public final void setResult(@Nullable Call<ResponseModel<List<ArchiveData>>> call) {
        this.result = call;
    }

    public final void setResultData(@NotNull MutableLiveData<ResponseModel<List<ArchiveData>>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.resultData = mutableLiveData;
    }
}
