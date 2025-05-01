package com.join.kotlin.presenter;

import android.content.Context;
import com.join.kotlin.presenter.view.FindHomeView;
import com.join.kotlin.ui.findgame.data.FindChoiceResultData;
import com.join.kotlin.ui.findgame.data.FindClassifyResultData;
import com.join.mgps.activity.vipzone.bean.LuckHistoryrequest;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import e2.i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* compiled from: FindModlePrensenter.kt */
/* loaded from: classes3.dex */
public final class FindModlePrensenter extends BasePresenter<FindHomeView> {
    private boolean isLoading;
    public i rpcGameClient;

    public FindModlePrensenter(@NotNull FindHomeView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        setMView(view);
    }

    @NotNull
    public final i getRpcGameClient() {
        i iVar = this.rpcGameClient;
        if (iVar != null) {
            return iVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rpcGameClient");
        return null;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final void loadClassfyDatas(@NotNull Context context, @NotNull final LuckHistoryrequest arg) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(arg, "arg");
        i B0 = com.join.mgps.rpc.impl.i.D0().B0();
        Intrinsics.checkNotNullExpressionValue(B0, "newInstance().service");
        setRpcGameClient(B0);
        RequestModel requestModel = new RequestModel();
        requestModel.setDefault(context);
        requestModel.setArgs(arg);
        getRpcGameClient().F0(requestModel.makeSign()).enqueue(new Callback<ResponseModel<FindClassifyResultData>>() { // from class: com.join.kotlin.presenter.FindModlePrensenter$loadClassfyDatas$1
            @Override // retrofit2.Callback
            public void onFailure(@NotNull Call<ResponseModel<FindClassifyResultData>> call, @NotNull Throwable t4) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(t4, "t");
                FindModlePrensenter.this.getMView().onError("获取数据失败");
                t4.printStackTrace();
            }

            @Override // retrofit2.Callback
            public void onResponse(@NotNull Call<ResponseModel<FindClassifyResultData>> call, @NotNull Response<ResponseModel<FindClassifyResultData>> response) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                if (response.body() != null) {
                    ResponseModel<FindClassifyResultData> body = response.body();
                    Intrinsics.checkNotNull(body);
                    if (body.getCode() == 200) {
                        FindModlePrensenter.this.getMView().hidLoading();
                        ResponseModel<FindClassifyResultData> body2 = response.body();
                        Intrinsics.checkNotNull(body2);
                        if (body2.getData() != null) {
                            int page = arg.getPage();
                            ResponseModel<FindClassifyResultData> body3 = response.body();
                            Intrinsics.checkNotNull(body3);
                            FindClassifyResultData data = body3.getData();
                            Intrinsics.checkNotNullExpressionValue(data, "response.body()!!.data");
                            FindModlePrensenter.this.getMView().onLoadDataSuccessV9(page, data);
                            return;
                        }
                    } else {
                        ResponseModel<FindClassifyResultData> body4 = response.body();
                        Intrinsics.checkNotNull(body4);
                        String message = body4.getMessage();
                        Intrinsics.checkNotNullExpressionValue(message, "response.body()!!.message");
                        FindModlePrensenter.this.getMView().onError(message);
                        return;
                    }
                }
                FindModlePrensenter.this.getMView().onError("获取数据失败");
            }
        });
    }

    public final void loadFindChoiceData(@NotNull Context context, @NotNull final LuckHistoryrequest arg) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(arg, "arg");
        if (this.isLoading) {
            return;
        }
        this.isLoading = true;
        i B0 = com.join.mgps.rpc.impl.i.D0().B0();
        Intrinsics.checkNotNullExpressionValue(B0, "newInstance().service");
        setRpcGameClient(B0);
        RequestModel requestModel = new RequestModel();
        requestModel.setDefault(context);
        requestModel.setArgs(arg);
        getRpcGameClient().q1(requestModel.makeSign()).enqueue(new Callback<ResponseModel<FindChoiceResultData>>() { // from class: com.join.kotlin.presenter.FindModlePrensenter$loadFindChoiceData$1
            @Override // retrofit2.Callback
            public void onFailure(@NotNull Call<ResponseModel<FindChoiceResultData>> call, @NotNull Throwable t4) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(t4, "t");
                FindModlePrensenter.this.setLoading(false);
                FindModlePrensenter.this.getMView().onError("获取数据失败");
                t4.printStackTrace();
            }

            @Override // retrofit2.Callback
            public void onResponse(@NotNull Call<ResponseModel<FindChoiceResultData>> call, @NotNull Response<ResponseModel<FindChoiceResultData>> response) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                FindModlePrensenter.this.setLoading(false);
                if (response.body() != null) {
                    ResponseModel<FindChoiceResultData> body = response.body();
                    Intrinsics.checkNotNull(body);
                    if (body.getCode() == 200) {
                        FindModlePrensenter.this.getMView().hidLoading();
                        ResponseModel<FindChoiceResultData> body2 = response.body();
                        Intrinsics.checkNotNull(body2);
                        if (body2.getData() != null) {
                            int page = arg.getPage();
                            ResponseModel<FindChoiceResultData> body3 = response.body();
                            Intrinsics.checkNotNull(body3);
                            FindChoiceResultData data = body3.getData();
                            Intrinsics.checkNotNullExpressionValue(data, "response.body()!!.data");
                            FindModlePrensenter.this.getMView().onLoadDataSuccess(page, data);
                            return;
                        }
                    } else {
                        ResponseModel<FindChoiceResultData> body4 = response.body();
                        Intrinsics.checkNotNull(body4);
                        String message = body4.getMessage();
                        Intrinsics.checkNotNullExpressionValue(message, "response.body()!!.message");
                        FindModlePrensenter.this.getMView().onError(message);
                        return;
                    }
                }
                FindModlePrensenter.this.getMView().onError("获取数据失败");
            }
        });
    }

    public final void setLoading(boolean z4) {
        this.isLoading = z4;
    }

    public final void setRpcGameClient(@NotNull i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<set-?>");
        this.rpcGameClient = iVar;
    }
}
