.class public Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;
.super Ljava/lang/Object;
.source "AdSpacesBean.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/fusion/model/AdSpacesBean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "BuyerBean"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRenderBean;,
        Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleStyleBean;,
        Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;,
        Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$OrderDataEulerAngleViewBean;,
        Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;,
        Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewBean;,
        Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$RenderAds;,
        Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$RenderRulesBean;,
        Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$OrderDataRollViewBean;,
        Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolRollViewBean;,
        Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$RollViewBean;,
        Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$OrderDataDislikeConfigBean;,
        Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$DislikeConfigBean;,
        Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$OrderDataScrollViewOrderBean;,
        Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickPositionBean;,
        Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;,
        Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$PriceDictBean;,
        Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$OrderDataFullScreenClickBean;,
        Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$FullScreenClickBean;,
        Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$OrderDataRegionalClickViewBean;,
        Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$RegionalClickViewBean;,
        Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolShakeViewBean;,
        Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$AliaseShakeViewBean;,
        Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$OrderDataShakeViewBean;,
        Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$PercentPositionBean;,
        Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;
    }
.end annotation


# instance fields
.field private adSize:Lcom/beizi/fusion/model/AdSpacesBean$AdSizeBean;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "adSize"
    .end annotation
.end field

.field private adType:Ljava/lang/String;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "adType"
    .end annotation
.end field

.field private adWorker:Ljava/lang/String;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "adWorker"
    .end annotation
.end field

.field private appId:Ljava/lang/String;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "appId"
    .end annotation
.end field

.field private avgPrice:D
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "avgPrice"
    .end annotation
.end field

.field private bidPrice:D
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "bidPrice"
    .end annotation
.end field

.field private bidType:Ljava/lang/String;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "bidType"
    .end annotation
.end field

.field private buyerSpaceUuId:Ljava/lang/String;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "buyerSpaceUuId"
    .end annotation
.end field

.field private cache:I
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "cache"
    .end annotation
.end field

.field private callBackStrategy:Ljava/util/List;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "callBackStrategy"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/beizi/fusion/model/AdSpacesBean$CallBackStrategyBean;",
            ">;"
        }
    .end annotation
.end field

.field private callBackStrategyUuid:Ljava/lang/String;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "callBackStrategyUuid"
    .end annotation
.end field

.field private complain:Lcom/beizi/fusion/model/AdSpacesBean$ComplainBean;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "complain"
    .end annotation
.end field

.field private directDownload:I
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "directDownload"
    .end annotation
.end field

.field private dislikeConfig:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$DislikeConfigBean;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "dislike"
    .end annotation
.end field

.field private eulerAngleRule:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewBean;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "eulerAngleRule"
    .end annotation
.end field

.field private filter:Lcom/beizi/fusion/model/AdSpacesBean$FilterBean;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "filter"
    .end annotation
.end field

.field private filterSsid:Ljava/lang/String;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "filterSsid"
    .end annotation
.end field

.field private fullScreenClick:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$FullScreenClickBean;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "fullScreenClick"
    .end annotation
.end field

.field private id:Ljava/lang/String;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "id"
    .end annotation
.end field

.field private interactionRules:Ljava/util/List;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "interactionRules"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$RenderRulesBean;",
            ">;"
        }
    .end annotation
.end field

.field private priceDict:Ljava/util/List;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "priceDict"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$PriceDictBean;",
            ">;"
        }
    .end annotation
.end field

.field private regionalClickView:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$RegionalClickViewBean;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "regionalClickView"
    .end annotation
.end field

.field private renderAds:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$RenderAds;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "renderAds"
    .end annotation
.end field

.field private renderView:Ljava/util/List;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "renderView"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;",
            ">;"
        }
    .end annotation
.end field

.field private renderViewSsid:Ljava/lang/String;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "renderViewSsid"
    .end annotation
.end field

.field private reqTimeOutType:I
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "reqTimeOutType"
    .end annotation
.end field

.field private rollView:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$RollViewBean;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "rollView"
    .end annotation
.end field

.field private scrollClick:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "scrollClick"
    .end annotation
.end field

.field private shakeView:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "shakeView"
    .end annotation
.end field

.field private sizeRatio:I
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "sizeRatio"
    .end annotation
.end field

.field private spaceId:Ljava/lang/String;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "spaceId"
    .end annotation
.end field

.field private template:I
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "template"
    .end annotation
.end field

.field private zone:Ljava/lang/String;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "zone"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static objectFromData(Ljava/lang/String;)Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;
    .locals 1

    .line 1
    :try_start_0
    const-class v0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;

    invoke-static {p0, v0}, Lcom/beizi/fusion/model/JsonResolver;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 2
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public getAdSize()Lcom/beizi/fusion/model/AdSpacesBean$AdSizeBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->adSize:Lcom/beizi/fusion/model/AdSpacesBean$AdSizeBean;

    return-object v0
.end method

.method public getAdType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->adType:Ljava/lang/String;

    return-object v0
.end method

.method public getAdWorker()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->adWorker:Ljava/lang/String;

    return-object v0
.end method

.method public getAppId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->appId:Ljava/lang/String;

    return-object v0
.end method

.method public getAvgPrice()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->avgPrice:D

    return-wide v0
.end method

.method public getBidPrice()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->bidPrice:D

    return-wide v0
.end method

.method public getBidType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->bidType:Ljava/lang/String;

    return-object v0
.end method

.method public getBuyerSpaceUuId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->buyerSpaceUuId:Ljava/lang/String;

    return-object v0
.end method

.method public getCache()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->cache:I

    return v0
.end method

.method public getCallBackStrategy()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/beizi/fusion/model/AdSpacesBean$CallBackStrategyBean;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->callBackStrategy:Ljava/util/List;

    return-object v0
.end method

.method public getCallBackStrategyUuid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->callBackStrategyUuid:Ljava/lang/String;

    return-object v0
.end method

.method public getComplain()Lcom/beizi/fusion/model/AdSpacesBean$ComplainBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->complain:Lcom/beizi/fusion/model/AdSpacesBean$ComplainBean;

    return-object v0
.end method

.method public getDirectDownload()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->directDownload:I

    return v0
.end method

.method public getDislikeConfig()Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$DislikeConfigBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->dislikeConfig:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$DislikeConfigBean;

    return-object v0
.end method

.method public getEulerAngleRule()Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->eulerAngleRule:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewBean;

    return-object v0
.end method

.method public getFilter()Lcom/beizi/fusion/model/AdSpacesBean$FilterBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->filter:Lcom/beizi/fusion/model/AdSpacesBean$FilterBean;

    return-object v0
.end method

.method public getFilterSsid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->filterSsid:Ljava/lang/String;

    return-object v0
.end method

.method public getFullScreenClick()Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$FullScreenClickBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->fullScreenClick:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$FullScreenClickBean;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getInteractionRules()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$RenderRulesBean;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->interactionRules:Ljava/util/List;

    return-object v0
.end method

.method public getPriceDict()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$PriceDictBean;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->priceDict:Ljava/util/List;

    return-object v0
.end method

.method public getRegionalClickView()Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$RegionalClickViewBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->regionalClickView:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$RegionalClickViewBean;

    return-object v0
.end method

.method public getRenderAds()Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$RenderAds;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->renderAds:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$RenderAds;

    return-object v0
.end method

.method public getRenderView()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->renderView:Ljava/util/List;

    return-object v0
.end method

.method public getRenderViewSsid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->renderViewSsid:Ljava/lang/String;

    return-object v0
.end method

.method public getReqTimeOutType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->reqTimeOutType:I

    return v0
.end method

.method public getRollView()Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$RollViewBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->rollView:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$RollViewBean;

    return-object v0
.end method

.method public getScrollClick()Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->scrollClick:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;

    return-object v0
.end method

.method public getShakeView()Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->shakeView:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;

    return-object v0
.end method

.method public getSizeRatio()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->sizeRatio:I

    return v0
.end method

.method public getSpaceId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->spaceId:Ljava/lang/String;

    return-object v0
.end method

.method public getTemplate()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->template:I

    return v0
.end method

.method public getZone()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->zone:Ljava/lang/String;

    return-object v0
.end method

.method public setAdSize(Lcom/beizi/fusion/model/AdSpacesBean$AdSizeBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->adSize:Lcom/beizi/fusion/model/AdSpacesBean$AdSizeBean;

    return-void
.end method

.method public setAdType(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->adType:Ljava/lang/String;

    return-void
.end method

.method public setAdWorker(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->adWorker:Ljava/lang/String;

    return-void
.end method

.method public setAppId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->appId:Ljava/lang/String;

    return-void
.end method

.method public setAvgPrice(D)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->avgPrice:D

    return-void
.end method

.method public setBidPrice(D)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->bidPrice:D

    return-void
.end method

.method public setBidType(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->bidType:Ljava/lang/String;

    return-void
.end method

.method public setBuyerSpaceUuId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->buyerSpaceUuId:Ljava/lang/String;

    return-void
.end method

.method public setCache(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->cache:I

    return-void
.end method

.method public setCallBackStrategy(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/beizi/fusion/model/AdSpacesBean$CallBackStrategyBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->callBackStrategy:Ljava/util/List;

    return-void
.end method

.method public setCallBackStrategyUuid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->callBackStrategyUuid:Ljava/lang/String;

    return-void
.end method

.method public setComplain(Lcom/beizi/fusion/model/AdSpacesBean$ComplainBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->complain:Lcom/beizi/fusion/model/AdSpacesBean$ComplainBean;

    return-void
.end method

.method public setDirectDownload(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->directDownload:I

    return-void
.end method

.method public setDislikeConfig(Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$DislikeConfigBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->dislikeConfig:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$DislikeConfigBean;

    return-void
.end method

.method public setEulerAngleRule(Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->eulerAngleRule:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewBean;

    return-void
.end method

.method public setFilter(Lcom/beizi/fusion/model/AdSpacesBean$FilterBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->filter:Lcom/beizi/fusion/model/AdSpacesBean$FilterBean;

    return-void
.end method

.method public setFilterSsid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->filterSsid:Ljava/lang/String;

    return-void
.end method

.method public setFullScreenClick(Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$FullScreenClickBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->fullScreenClick:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$FullScreenClickBean;

    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->id:Ljava/lang/String;

    return-void
.end method

.method public setInteractionRules(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$RenderRulesBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->interactionRules:Ljava/util/List;

    return-void
.end method

.method public setPriceDict(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$PriceDictBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->priceDict:Ljava/util/List;

    return-void
.end method

.method public setRegionalClickView(Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$RegionalClickViewBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->regionalClickView:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$RegionalClickViewBean;

    return-void
.end method

.method public setRenderAds(Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$RenderAds;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->renderAds:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$RenderAds;

    return-void
.end method

.method public setRenderView(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->renderView:Ljava/util/List;

    return-void
.end method

.method public setRenderViewSsid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->renderViewSsid:Ljava/lang/String;

    return-void
.end method

.method public setReqTimeOutType(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->reqTimeOutType:I

    return-void
.end method

.method public setRollView(Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$RollViewBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->rollView:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$RollViewBean;

    return-void
.end method

.method public setScrollClick(Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->scrollClick:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;

    return-void
.end method

.method public setShakeView(Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->shakeView:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;

    return-void
.end method

.method public setSizeRatio(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->sizeRatio:I

    return-void
.end method

.method public setSpaceId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->spaceId:Ljava/lang/String;

    return-void
.end method

.method public setTemplate(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->template:I

    return-void
.end method

.method public setZone(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->zone:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BuyerBean{id=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", buyerSpaceUuId=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->buyerSpaceUuId:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", zone=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->zone:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", appId=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->appId:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", spaceId=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->spaceId:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", avgPrice="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->avgPrice:D

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v2, ", adWorker=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->adWorker:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", filter="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->filter:Lcom/beizi/fusion/model/AdSpacesBean$FilterBean;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", reqTimeOutType="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->reqTimeOutType:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", renderView="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->renderView:Ljava/util/List;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", adSize="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->adSize:Lcom/beizi/fusion/model/AdSpacesBean$AdSizeBean;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", directDownload="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->directDownload:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", renderViewSsid=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->renderViewSsid:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", filterSsid=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->filterSsid:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", bidType=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->bidType:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", cache=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->cache:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
