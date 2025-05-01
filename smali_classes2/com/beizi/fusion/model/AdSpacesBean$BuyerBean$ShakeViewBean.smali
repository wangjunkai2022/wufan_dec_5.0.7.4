.class public Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;
.super Ljava/lang/Object;
.source "AdSpacesBean.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ShakeViewBean"
.end annotation


# instance fields
.field private aliaseShakeView:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$AliaseShakeViewBean;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "aliaseShakeView"
    .end annotation
.end field

.field private animationInterval:I
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "animationInterval"
    .end annotation
.end field

.field private clkremove:I
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "clkremove"
    .end annotation
.end field

.field private coolShakeView:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolShakeViewBean;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "coolShakeView"
    .end annotation
.end field

.field private feedback:I
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "feedback"
    .end annotation
.end field

.field private imageURL:Ljava/util/List;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "imageURL"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private isHideAnim:I
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "isHideAnim"
    .end annotation
.end field

.field private orderData:Ljava/util/List;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "orderData"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$OrderDataShakeViewBean;",
            ">;"
        }
    .end annotation
.end field

.field private position:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$PercentPositionBean;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "position"
    .end annotation
.end field

.field private randomClickNum:I
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "randomClickNum"
    .end annotation
.end field

.field private randomClickTime:I
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "randomClickTime"
    .end annotation
.end field

.field private renderRate:I
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "renderRate"
    .end annotation
.end field

.field private rotatAmplitude:D
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "rotatAmplitude"
    .end annotation
.end field

.field private rotatCount:I
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "rotatCount"
    .end annotation
.end field

.field private shakeCount:I
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "shakeCount"
    .end annotation
.end field

.field private shakeEndAmplitude:D
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "shakeEndAmplitude"
    .end annotation
.end field

.field private shakeStartAmplitude:D
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "shakeStartAmplitude"
    .end annotation
.end field

.field private shakeViewUuid:Ljava/lang/String;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "shakeViewUuid"
    .end annotation
.end field

.field private title:Ljava/lang/String;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "title"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAliaseShakeView()Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$AliaseShakeViewBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->aliaseShakeView:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$AliaseShakeViewBean;

    return-object v0
.end method

.method public getAnimationInterval()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->animationInterval:I

    return v0
.end method

.method public getClkremove()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->clkremove:I

    return v0
.end method

.method public getCoolShakeView()Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolShakeViewBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->coolShakeView:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolShakeViewBean;

    return-object v0
.end method

.method public getFeedback()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->feedback:I

    return v0
.end method

.method public getImageURL()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->imageURL:Ljava/util/List;

    return-object v0
.end method

.method public getIsHideAnim()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->isHideAnim:I

    return v0
.end method

.method public getOrderData()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$OrderDataShakeViewBean;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->orderData:Ljava/util/List;

    return-object v0
.end method

.method public getPosition()Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$PercentPositionBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->position:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$PercentPositionBean;

    return-object v0
.end method

.method public getRandomClickNum()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->randomClickNum:I

    return v0
.end method

.method public getRandomClickTime()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->randomClickTime:I

    return v0
.end method

.method public getRenderRate()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->renderRate:I

    return v0
.end method

.method public getRotatAmplitude()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->rotatAmplitude:D

    return-wide v0
.end method

.method public getRotatCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->rotatCount:I

    return v0
.end method

.method public getShakeCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->shakeCount:I

    return v0
.end method

.method public getShakeEndAmplitude()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->shakeEndAmplitude:D

    return-wide v0
.end method

.method public getShakeStartAmplitude()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->shakeStartAmplitude:D

    return-wide v0
.end method

.method public getShakeViewUuid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->shakeViewUuid:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->title:Ljava/lang/String;

    return-object v0
.end method

.method public setAliaseShakeView(Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$AliaseShakeViewBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->aliaseShakeView:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$AliaseShakeViewBean;

    return-void
.end method

.method public setAnimationInterval(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->animationInterval:I

    return-void
.end method

.method public setClkremove(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->clkremove:I

    return-void
.end method

.method public setCoolShakeView(Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolShakeViewBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->coolShakeView:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolShakeViewBean;

    return-void
.end method

.method public setFeedback(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->feedback:I

    return-void
.end method

.method public setImageURL(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->imageURL:Ljava/util/List;

    return-void
.end method

.method public setIsHideAnim(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->isHideAnim:I

    return-void
.end method

.method public setOrderData(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$OrderDataShakeViewBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->orderData:Ljava/util/List;

    return-void
.end method

.method public setPosition(Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$PercentPositionBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->position:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$PercentPositionBean;

    return-void
.end method

.method public setRandomClickNum(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->randomClickNum:I

    return-void
.end method

.method public setRandomClickTime(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->randomClickTime:I

    return-void
.end method

.method public setRenderRate(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->renderRate:I

    return-void
.end method

.method public setRotatAmplitude(D)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->rotatAmplitude:D

    return-void
.end method

.method public setRotatCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->rotatCount:I

    return-void
.end method

.method public setShakeCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->shakeCount:I

    return-void
.end method

.method public setShakeEndAmplitude(D)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->shakeEndAmplitude:D

    return-void
.end method

.method public setShakeStartAmplitude(D)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->shakeStartAmplitude:D

    return-void
.end method

.method public setShakeViewUuid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->shakeViewUuid:Ljava/lang/String;

    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->title:Ljava/lang/String;

    return-void
.end method
