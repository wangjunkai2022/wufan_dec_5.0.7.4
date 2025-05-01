package com.join.kotlin.ui.userrecom;

import androidx.lifecycle.MutableLiveData;
import com.join.mgps.dto.CollectionBeanSub;
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
/* compiled from: UserRecomRequest.kt */
/* loaded from: classes3.dex */
public final class UserRecomRequest {
    @Nullable
    private Call<ResponseModel<List<CollectionBeanSub>>> result;
    @NotNull
    private MutableLiveData<ResponseModel<List<CollectionBeanSub>>> resultData = new MutableLiveData<>();

    @Nullable
    public final Call<ResponseModel<List<CollectionBeanSub>>> getResult() {
        return this.result;
    }

    @NotNull
    public final MutableLiveData<ResponseModel<List<CollectionBeanSub>>> getResultData() {
        return this.resultData;
    }

    public final void getUserRecomDatas(@NotNull RequestModel<UserRecomRequestArgs> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Call<ResponseModel<List<CollectionBeanSub>>> Q0 = i.D0().B0().Q0(request.makeSign());
        this.result = Q0;
        if (Q0 != null) {
            Q0.enqueue(new Callback<ResponseModel<List<? extends CollectionBeanSub>>>() { // from class: com.join.kotlin.ui.userrecom.UserRecomRequest$getUserRecomDatas$1
                @Override // retrofit2.Callback
                public void onFailure(@NotNull Call<ResponseModel<List<? extends CollectionBeanSub>>> call, @NotNull Throwable t4) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(t4, "t");
                    ResponseModel<List<CollectionBeanSub>> responseModel = new ResponseModel<>();
                    responseModel.setCode(401);
                    UserRecomRequest.this.getResultData().setValue(responseModel);
                }

                @Override // retrofit2.Callback
                public void onResponse(@NotNull Call<ResponseModel<List<? extends CollectionBeanSub>>> call, @NotNull Response<ResponseModel<List<? extends CollectionBeanSub>>> response) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(response, "response");
                    if (response.body() != null) {
                        UserRecomRequest.this.getResultData().setValue(response.body());
                        return;
                    }
                    ResponseModel<List<CollectionBeanSub>> responseModel = new ResponseModel<>();
                    responseModel.setCode(401);
                    UserRecomRequest.this.getResultData().setValue(responseModel);
                }
            });
        }
    }

    public final void setResult(@Nullable Call<ResponseModel<List<CollectionBeanSub>>> call) {
        this.result = call;
    }

    public final void setResultData(@NotNull MutableLiveData<ResponseModel<List<CollectionBeanSub>>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.resultData = mutableLiveData;
    }
}
