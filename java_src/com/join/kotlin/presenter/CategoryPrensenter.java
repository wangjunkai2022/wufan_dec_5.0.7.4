package com.join.kotlin.presenter;

import android.content.Context;
import com.join.kotlin.presenter.view.CategoryView;
import com.join.kotlin.ui.findgame.data.CategoryListMain;
import com.join.kotlin.ui.findgame.data.CategoryRequest;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import e2.i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* compiled from: CategoryPrensenter.kt */
/* loaded from: classes3.dex */
public final class CategoryPrensenter extends BasePresenter<CategoryView> {
    public i rpcGameClient;

    public CategoryPrensenter(@NotNull CategoryView view) {
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

    public final void loadCategoryData(@NotNull Context context, @NotNull final CategoryRequest arg) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(arg, "arg");
        i B0 = com.join.mgps.rpc.impl.i.D0().B0();
        Intrinsics.checkNotNullExpressionValue(B0, "newInstance().service");
        setRpcGameClient(B0);
        RequestModel requestModel = new RequestModel();
        requestModel.setDefault(context);
        requestModel.setArgs(arg);
        getRpcGameClient().O0(requestModel.makeSign()).enqueue(new Callback<ResponseModel<CategoryListMain>>() { // from class: com.join.kotlin.presenter.CategoryPrensenter$loadCategoryData$1
            @Override // retrofit2.Callback
            public void onFailure(@NotNull Call<ResponseModel<CategoryListMain>> call, @NotNull Throwable t4) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(t4, "t");
                CategoryPrensenter.this.getMView().onError("获取数据失败");
                t4.printStackTrace();
            }

            @Override // retrofit2.Callback
            public void onResponse(@NotNull Call<ResponseModel<CategoryListMain>> call, @NotNull Response<ResponseModel<CategoryListMain>> response) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                if (response.body() != null) {
                    ResponseModel<CategoryListMain> body = response.body();
                    Intrinsics.checkNotNull(body);
                    if (body.getCode() == 200) {
                        CategoryPrensenter.this.getMView().hidLoading();
                        int page = arg.getPage();
                        ResponseModel<CategoryListMain> body2 = response.body();
                        Intrinsics.checkNotNull(body2);
                        CategoryListMain data = body2.getData();
                        Intrinsics.checkNotNullExpressionValue(data, "response.body()!!.data");
                        CategoryPrensenter.this.getMView().onLoadDataSuccess(page, data);
                        return;
                    }
                    ResponseModel<CategoryListMain> body3 = response.body();
                    Intrinsics.checkNotNull(body3);
                    String message = body3.getMessage();
                    Intrinsics.checkNotNullExpressionValue(message, "response.body()!!.message");
                    CategoryPrensenter.this.getMView().onError(message);
                    return;
                }
                CategoryPrensenter.this.getMView().onError("获取数据失败");
            }
        });
    }

    public final void setRpcGameClient(@NotNull i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<set-?>");
        this.rpcGameClient = iVar;
    }
}
