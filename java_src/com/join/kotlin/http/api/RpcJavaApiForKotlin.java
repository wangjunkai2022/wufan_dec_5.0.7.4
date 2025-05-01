package com.join.kotlin.http.api;

import com.join.kotlin.ui.account.modle.UnThirdPartRequest;
import com.join.kotlin.ui.modleregin.modle.BtReginResultMain;
import com.join.kotlin.ui.modleregin.modle.MustplayItemNetBean;
import com.join.mgps.dto.RequestGameIdArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import java.util.List;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Body;
import retrofit2.http.POST;
/* compiled from: RpcJavaApiForKotlin.kt */
/* loaded from: classes3.dex */
public interface RpcJavaApiForKotlin {
    @POST("/v6/btGame/areaList")
    @Nullable
    Object getBtReginDatas(@Body @NotNull RequestModel<RequestGameIdArgs> requestModel, @NotNull Continuation<? super ResponseModel<BtReginResultMain>> continuation);

    @POST("/v6/mustPlay/gameList")
    @Nullable
    Object getMustplayDatas(@Body @NotNull RequestModel<RequestGameIdArgs> requestModel, @NotNull Continuation<? super ResponseModel<List<MustplayItemNetBean>>> continuation);

    @POST("/v5/special_game_board/ranking_game_list")
    @Nullable
    Object getRankingList(@Body @NotNull RequestModel<?> requestModel, @NotNull Continuation<? super ResponseModel<List<?>>> continuation);

    @POST("")
    @Nullable
    Object getUserData(@NotNull Continuation<? super ResponseModel<String>> continuation);

    @POST("/thirdParty/account/unbind")
    @Nullable
    Object unbindThirdfParty(@Body @NotNull UnThirdPartRequest unThirdPartRequest, @NotNull Continuation<? super ResponseModel<Boolean>> continuation);
}
