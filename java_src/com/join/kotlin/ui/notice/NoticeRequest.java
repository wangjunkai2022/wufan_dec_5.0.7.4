package com.join.kotlin.ui.notice;

import androidx.lifecycle.MutableLiveData;
import com.join.kotlin.ui.coupon.NoticeListData;
import com.join.mgps.dto.RequestGameIdArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.rpc.impl.i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* compiled from: NoticeRequest.kt */
/* loaded from: classes3.dex */
public final class NoticeRequest {
    @Nullable
    private Call<ResponseModel<NoticeListData>> result;
    @NotNull
    private MutableLiveData<ResponseModel<NoticeListData>> resultData = new MutableLiveData<>();

    public final void getNoticeData(@NotNull final RequestModel<RequestGameIdArgs> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Call<ResponseModel<NoticeListData>> e12 = i.D0().B0().e1(request.makeSign());
        this.result = e12;
        if (e12 != null) {
            e12.enqueue(new Callback<ResponseModel<NoticeListData>>() { // from class: com.join.kotlin.ui.notice.NoticeRequest$getNoticeData$1
                @Override // retrofit2.Callback
                public void onFailure(@NotNull Call<ResponseModel<NoticeListData>> call, @NotNull Throwable t4) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(t4, "t");
                    ResponseModel<NoticeListData> responseModel = new ResponseModel<>();
                    responseModel.setCode(401);
                    this.getResultData().setValue(responseModel);
                }

                @Override // retrofit2.Callback
                public void onResponse(@NotNull Call<ResponseModel<NoticeListData>> call, @NotNull Response<ResponseModel<NoticeListData>> response) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(response, "response");
                    if (response.body() != null) {
                        ResponseModel<NoticeListData> body = response.body();
                        if (body != null) {
                            body.setPage(request.getArgs().getPage());
                        }
                        this.getResultData().setValue(body);
                        return;
                    }
                    ResponseModel<NoticeListData> responseModel = new ResponseModel<>();
                    responseModel.setCode(401);
                    this.getResultData().setValue(responseModel);
                }
            });
        }
    }

    @Nullable
    public final Call<ResponseModel<NoticeListData>> getResult() {
        return this.result;
    }

    @NotNull
    public final MutableLiveData<ResponseModel<NoticeListData>> getResultData() {
        return this.resultData;
    }

    public final void setResult(@Nullable Call<ResponseModel<NoticeListData>> call) {
        this.result = call;
    }

    public final void setResultData(@NotNull MutableLiveData<ResponseModel<NoticeListData>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.resultData = mutableLiveData;
    }
}
