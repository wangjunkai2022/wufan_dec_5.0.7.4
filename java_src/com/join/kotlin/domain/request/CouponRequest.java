package com.join.kotlin.domain.request;

import androidx.lifecycle.MutableLiveData;
import com.join.kotlin.ui.coupon.CouponListMainData;
import com.join.mgps.dto.BTGameCouponBean;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.rpc.impl.i;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* compiled from: CouponRequest.kt */
/* loaded from: classes3.dex */
public final class CouponRequest {
    @Nullable
    private Call<ResponseModel<Object>> callCoupon;
    @Nullable
    private Call<ResponseModel<CouponListMainData>> callCouponList;
    @NotNull
    private MutableLiveData<ResponseModel<Object>> resultData = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<ResponseModel<CouponListMainData>> resultCouponListData = new MutableLiveData<>();

    private final void cancelGetCoupon() {
        Call<ResponseModel<Object>> call = this.callCoupon;
        if (call != null) {
            Intrinsics.checkNotNull(call);
            if (call.isCanceled()) {
                Call<ResponseModel<Object>> call2 = this.callCoupon;
                Intrinsics.checkNotNull(call2);
                call2.cancel();
            }
        }
    }

    @Nullable
    public final Call<ResponseModel<Object>> getCallCoupon() {
        return this.callCoupon;
    }

    @Nullable
    public final Call<ResponseModel<CouponListMainData>> getCallCouponList() {
        return this.callCouponList;
    }

    @NotNull
    public final MutableLiveData<ResponseModel<CouponListMainData>> getResultCouponListData() {
        return this.resultCouponListData;
    }

    @NotNull
    public final MutableLiveData<ResponseModel<Object>> getResultData() {
        return this.resultData;
    }

    public final void requestCouponGet(@NotNull final RequestModel<com.join.kotlin.ui.coupon.CouponRequest> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Call<ResponseModel<Object>> A1 = i.D0().B0().A1(request.makeSign());
        this.callCoupon = A1;
        if (A1 != null) {
            A1.enqueue(new Callback<ResponseModel<Object>>() { // from class: com.join.kotlin.domain.request.CouponRequest$requestCouponGet$1
                @Override // retrofit2.Callback
                public void onFailure(@NotNull Call<ResponseModel<Object>> call, @NotNull Throwable t4) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(t4, "t");
                    ResponseModel<Object> responseModel = new ResponseModel<>();
                    responseModel.setCode(401);
                    this.getResultData().setValue(responseModel);
                }

                @Override // retrofit2.Callback
                public void onResponse(@NotNull Call<ResponseModel<Object>> call, @NotNull Response<ResponseModel<Object>> response) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(response, "response");
                    if (response.body() != null) {
                        ResponseModel<Object> body = response.body();
                        if (body != null) {
                            body.setData(request.getArgs());
                        }
                        this.getResultData().setValue(body);
                        return;
                    }
                    ResponseModel<Object> responseModel = new ResponseModel<>();
                    responseModel.setCode(401);
                    this.getResultData().setValue(responseModel);
                }
            });
        }
    }

    public final void requestCouponListData(@NotNull RequestModel<com.join.kotlin.ui.coupon.CouponRequest> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Call<ResponseModel<CouponListMainData>> k12 = i.D0().B0().k1(request.makeSign());
        this.callCouponList = k12;
        if (k12 != null) {
            k12.enqueue(new Callback<ResponseModel<CouponListMainData>>() { // from class: com.join.kotlin.domain.request.CouponRequest$requestCouponListData$1
                @Override // retrofit2.Callback
                public void onFailure(@NotNull Call<ResponseModel<CouponListMainData>> call, @NotNull Throwable t4) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(t4, "t");
                    ResponseModel<CouponListMainData> responseModel = new ResponseModel<>();
                    responseModel.setCode(401);
                    CouponRequest.this.getResultCouponListData().setValue(responseModel);
                }

                @Override // retrofit2.Callback
                public void onResponse(@NotNull Call<ResponseModel<CouponListMainData>> call, @NotNull Response<ResponseModel<CouponListMainData>> response) {
                    boolean contains$default;
                    CouponListMainData data;
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(response, "response");
                    if (response.body() != null) {
                        ResponseModel<CouponListMainData> body = response.body();
                        ArrayList<BTGameCouponBean> game_coupon_for_bt_game = (body == null || (data = body.getData()) == null) ? null : data.getGame_coupon_for_bt_game();
                        if (game_coupon_for_bt_game != null) {
                            for (BTGameCouponBean bTGameCouponBean : game_coupon_for_bt_game) {
                                String usable_games = bTGameCouponBean.getUsable_games();
                                Intrinsics.checkNotNullExpressionValue(usable_games, "it.usable_games");
                                contains$default = StringsKt__StringsKt.contains$default((CharSequence) usable_games, (CharSequence) ",", false, 2, (Object) null);
                                if (contains$default) {
                                    bTGameCouponBean.setUsable_gamesShow("仅限部分游戏使用");
                                    bTGameCouponBean.setUsable_games("仅限" + bTGameCouponBean.getUsable_games() + "使用");
                                } else {
                                    bTGameCouponBean.setUsable_gamesShow("仅限《" + bTGameCouponBean.getUsable_games() + "》使用");
                                    bTGameCouponBean.setUsable_games("仅限《" + bTGameCouponBean.getUsable_games() + "》使用");
                                }
                            }
                        }
                        CouponRequest.this.getResultCouponListData().setValue(body);
                        return;
                    }
                    ResponseModel<CouponListMainData> responseModel = new ResponseModel<>();
                    responseModel.setCode(401);
                    CouponRequest.this.getResultCouponListData().setValue(responseModel);
                }
            });
        }
    }

    public final void setCallCoupon(@Nullable Call<ResponseModel<Object>> call) {
        this.callCoupon = call;
    }

    public final void setCallCouponList(@Nullable Call<ResponseModel<CouponListMainData>> call) {
        this.callCouponList = call;
    }

    public final void setResultCouponListData(@NotNull MutableLiveData<ResponseModel<CouponListMainData>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.resultCouponListData = mutableLiveData;
    }

    public final void setResultData(@NotNull MutableLiveData<ResponseModel<Object>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.resultData = mutableLiveData;
    }
}
