.class public Lcom/beizi/fusion/model/AdSpacesBean;
.super Ljava/lang/Object;
.source "AdSpacesBean.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/fusion/model/AdSpacesBean$UniteControlBean;,
        Lcom/beizi/fusion/model/AdSpacesBean$ComplainBean;,
        Lcom/beizi/fusion/model/AdSpacesBean$CallBackStrategyBean;,
        Lcom/beizi/fusion/model/AdSpacesBean$AdSizeBean;,
        Lcom/beizi/fusion/model/AdSpacesBean$RulesBean;,
        Lcom/beizi/fusion/model/AdSpacesBean$RandomStrategyBean;,
        Lcom/beizi/fusion/model/AdSpacesBean$EventStrategyBean;,
        Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;,
        Lcom/beizi/fusion/model/AdSpacesBean$PassPolicyBean;,
        Lcom/beizi/fusion/model/AdSpacesBean$DpLinkUrlListBean;,
        Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;,
        Lcom/beizi/fusion/model/AdSpacesBean$ComponentBean;,
        Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;,
        Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;,
        Lcom/beizi/fusion/model/AdSpacesBean$BidBean;,
        Lcom/beizi/fusion/model/AdSpacesBean$BidComponent;,
        Lcom/beizi/fusion/model/AdSpacesBean$FilterBean;
    }
.end annotation


# static fields
.field public static final DIRECT_DOWNLOAD_APP_DECIDE:I = 0x0

.field public static final DIRECT_DOWNLOAD_SERVER_NO:I = 0x1

.field public static final DIRECT_DOWNLOAD_SERVER_YES:I = 0x2


# instance fields
.field private adType:Ljava/lang/String;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "adType"
    .end annotation
.end field

.field private appId:Ljava/lang/String;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "appId"
    .end annotation
.end field

.field private bid:Lcom/beizi/fusion/model/AdSpacesBean$BidBean;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "bid"
    .end annotation
.end field

.field private bidComponent:Lcom/beizi/fusion/model/AdSpacesBean$BidComponent;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "bidComponent"
    .end annotation
.end field

.field private buyer:Ljava/util/List;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "buyer"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;",
            ">;"
        }
    .end annotation
.end field

.field private bzComponentSsid:Ljava/lang/String;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "bzComponentSsid"
    .end annotation
.end field

.field private component:Lcom/beizi/fusion/model/AdSpacesBean$ComponentBean;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "component"
    .end annotation
.end field

.field private componentSsid:Ljava/lang/String;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "componentSsid"
    .end annotation
.end field

.field private eventStrategy:Lcom/beizi/fusion/model/AdSpacesBean$EventStrategyBean;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "eventStrategy"
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

.field private modelType:I
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "modelType"
    .end annotation
.end field

.field private spaceId:Ljava/lang/String;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "spaceId"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static objectFromData(Ljava/lang/String;)Lcom/beizi/fusion/model/AdSpacesBean;
    .locals 1

    .line 1
    :try_start_0
    const-class v0, Lcom/beizi/fusion/model/AdSpacesBean;

    invoke-static {p0, v0}, Lcom/beizi/fusion/model/JsonResolver;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/beizi/fusion/model/AdSpacesBean;
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
.method public getAdType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean;->adType:Ljava/lang/String;

    return-object v0
.end method

.method public getAppId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean;->appId:Ljava/lang/String;

    return-object v0
.end method

.method public getBid()Lcom/beizi/fusion/model/AdSpacesBean$BidBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean;->bid:Lcom/beizi/fusion/model/AdSpacesBean$BidBean;

    return-object v0
.end method

.method public getBidComponent()Lcom/beizi/fusion/model/AdSpacesBean$BidComponent;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean;->bidComponent:Lcom/beizi/fusion/model/AdSpacesBean$BidComponent;

    return-object v0
.end method

.method public getBuyer()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean;->buyer:Ljava/util/List;

    return-object v0
.end method

.method public getBzComponentSsid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean;->bzComponentSsid:Ljava/lang/String;

    return-object v0
.end method

.method public getComponent()Lcom/beizi/fusion/model/AdSpacesBean$ComponentBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean;->component:Lcom/beizi/fusion/model/AdSpacesBean$ComponentBean;

    return-object v0
.end method

.method public getComponentSsid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean;->componentSsid:Ljava/lang/String;

    return-object v0
.end method

.method public getEventStrategy()Lcom/beizi/fusion/model/AdSpacesBean$EventStrategyBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean;->eventStrategy:Lcom/beizi/fusion/model/AdSpacesBean$EventStrategyBean;

    return-object v0
.end method

.method public getFilter()Lcom/beizi/fusion/model/AdSpacesBean$FilterBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean;->filter:Lcom/beizi/fusion/model/AdSpacesBean$FilterBean;

    return-object v0
.end method

.method public getFilterSsid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean;->filterSsid:Ljava/lang/String;

    return-object v0
.end method

.method public getModelType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/fusion/model/AdSpacesBean;->modelType:I

    return v0
.end method

.method public getSpaceId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean;->spaceId:Ljava/lang/String;

    return-object v0
.end method

.method public setAdType(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean;->adType:Ljava/lang/String;

    return-void
.end method

.method public setAppId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean;->appId:Ljava/lang/String;

    return-void
.end method

.method public setBid(Lcom/beizi/fusion/model/AdSpacesBean$BidBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean;->bid:Lcom/beizi/fusion/model/AdSpacesBean$BidBean;

    return-void
.end method

.method public setBidComponent(Lcom/beizi/fusion/model/AdSpacesBean$BidComponent;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean;->bidComponent:Lcom/beizi/fusion/model/AdSpacesBean$BidComponent;

    return-void
.end method

.method public setBuyer(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean;->buyer:Ljava/util/List;

    return-void
.end method

.method public setBzComponentSsid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean;->bzComponentSsid:Ljava/lang/String;

    return-void
.end method

.method public setComponent(Lcom/beizi/fusion/model/AdSpacesBean$ComponentBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean;->component:Lcom/beizi/fusion/model/AdSpacesBean$ComponentBean;

    return-void
.end method

.method public setComponentSsid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean;->componentSsid:Ljava/lang/String;

    return-void
.end method

.method public setEventStrategy(Lcom/beizi/fusion/model/AdSpacesBean$EventStrategyBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean;->eventStrategy:Lcom/beizi/fusion/model/AdSpacesBean$EventStrategyBean;

    return-void
.end method

.method public setFilter(Lcom/beizi/fusion/model/AdSpacesBean$FilterBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean;->filter:Lcom/beizi/fusion/model/AdSpacesBean$FilterBean;

    return-void
.end method

.method public setFilterSsid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean;->filterSsid:Ljava/lang/String;

    return-void
.end method

.method public setModelType(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/model/AdSpacesBean;->modelType:I

    return-void
.end method

.method public setSpaceId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean;->spaceId:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AdSpacesBean{spaceId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/beizi/fusion/model/AdSpacesBean;->spaceId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", appId=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/beizi/fusion/model/AdSpacesBean;->appId:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", adType=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/beizi/fusion/model/AdSpacesBean;->adType:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", modelType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/beizi/fusion/model/AdSpacesBean;->modelType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", filter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/beizi/fusion/model/AdSpacesBean;->filter:Lcom/beizi/fusion/model/AdSpacesBean$FilterBean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/beizi/fusion/model/AdSpacesBean;->bid:Lcom/beizi/fusion/model/AdSpacesBean$BidBean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", buyer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/beizi/fusion/model/AdSpacesBean;->buyer:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", component="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/beizi/fusion/model/AdSpacesBean;->component:Lcom/beizi/fusion/model/AdSpacesBean$ComponentBean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", eventStrategy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/beizi/fusion/model/AdSpacesBean;->eventStrategy:Lcom/beizi/fusion/model/AdSpacesBean$EventStrategyBean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
