package com.join.kotlin.network.api;

import com.join.kotlin.discount.model.bean.CommentDataBean;
import com.join.kotlin.discount.model.bean.CouponItemBean;
import com.join.kotlin.discount.model.bean.GameDetailDataBean;
import com.join.kotlin.discount.model.bean.GameServerInfoBean;
import com.join.kotlin.discount.model.bean.GiftItemTypeBean;
import com.join.kotlin.discount.model.request.CommonRequest;
import com.join.kotlin.discount.model.request.GameDetailRequest;
import com.join.kotlin.quark.model.bean.SourceListItemBean;
import com.join.kotlin.quark.model.bean.SourceTabListBean;
import com.join.kotlin.quark.model.request.AngelCreateRequest;
import com.join.kotlin.quark.model.request.AngelRequest;
import com.join.kotlin.quark.model.request.SourceListRequest;
import com.join.kotlin.quark.model.request.SourceSearchRequest;
import com.join.kotlin.quark.model.request.SourceTabRequest;
import com.join.kotlin.quark.model.request.SourceWantRequest;
import com.join.kotlin.quark.model.request.WishPoolRequest;
import com.join.kotlin.zone.model.bean.GameZoneDataBean;
import com.join.kotlin.zone.model.request.GameZoneRequest;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.RequestGameIdArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Body;
import retrofit2.http.POST;
/* compiled from: GameApiService.kt */
/* loaded from: classes3.dex */
public interface GameApiService {
    @POST("/v9/comment/list")
    @Nullable
    Object getCommentList(@Body @NotNull RequestModel<CommonRequest> requestModel, @NotNull Continuation<? super ResponseModel<CommentDataBean>> continuation);

    @POST("/v9/game/gameInfo")
    @Nullable
    Object getGameDetail(@Body @NotNull RequestModel<GameDetailRequest> requestModel, @NotNull Continuation<? super ResponseModel<GameDetailDataBean>> continuation);

    @POST("/v9/gameCoupon/discountCoupon")
    @Nullable
    Object getGameDetailCouponList(@Body @NotNull RequestModel<CommonRequest> requestModel, @NotNull Continuation<? super ResponseModel<List<CouponItemBean>>> continuation);

    @POST("/v9/gameGift/discountGift")
    @Nullable
    Object getGameDetailGiftList(@Body @NotNull RequestModel<CommonRequest> requestModel, @NotNull Continuation<? super ResponseModel<List<GiftItemTypeBean>>> continuation);

    @POST("/v9/gameServer/discountServer")
    @Nullable
    Object getGameServerList(@Body @NotNull RequestModel<RequestGameIdArgs> requestModel, @NotNull Continuation<? super ResponseModel<List<GameServerInfoBean>>> continuation);

    @POST("/v7/game/zone")
    @Nullable
    Object getGameZone(@Body @NotNull RequestModel<GameZoneRequest> requestModel, @NotNull Continuation<? super ResponseModel<GameZoneDataBean>> continuation);

    @POST("/v8/webdisk/resource/list")
    @Nullable
    Object resourceList(@Body @NotNull RequestModel<SourceListRequest> requestModel, @NotNull Continuation<? super ResponseModel<ArrayList<SourceListItemBean>>> continuation);

    @POST("/v8/webdisk/resource/search")
    @Nullable
    Object resourceSearch(@Body @NotNull RequestModel<SourceSearchRequest> requestModel, @NotNull Continuation<? super ResponseModel<ArrayList<SourceListItemBean>>> continuation);

    @POST("/v7/game_detail/similar_rec/list")
    @Nullable
    Object similarRecList(@Body @NotNull RequestModel<RequestGameIdArgs> requestModel, @NotNull Continuation<? super ResponseModel<List<CollectionBeanSub>>> continuation);

    @POST("/v8/web_disk/wish_pool/angel")
    @Nullable
    Object sourceAngel(@Body @NotNull RequestModel<AngelRequest> requestModel, @NotNull Continuation<? super ResponseModel<Boolean>> continuation);

    @POST("/v8/web_disk/wish_pool/create")
    @Nullable
    Object sourceShareCreate(@Body @NotNull RequestModel<AngelCreateRequest> requestModel, @NotNull Continuation<? super ResponseModel<Boolean>> continuation);

    @POST("/v8/webdisk/home")
    @Nullable
    Object webDiskHome(@Body @NotNull RequestModel<SourceTabRequest> requestModel, @NotNull Continuation<? super ResponseModel<SourceTabListBean>> continuation);

    @POST("/v8/web_disk/wish_pool/list")
    @Nullable
    Object wishPoolList(@Body @NotNull RequestModel<WishPoolRequest> requestModel, @NotNull Continuation<? super ResponseModel<ArrayList<SourceListItemBean>>> continuation);

    @POST("/v8/web_disk/wish_pool/want")
    @Nullable
    Object wishPoolWant(@Body @NotNull RequestModel<SourceWantRequest> requestModel, @NotNull Continuation<? super ResponseModel<Boolean>> continuation);
}
