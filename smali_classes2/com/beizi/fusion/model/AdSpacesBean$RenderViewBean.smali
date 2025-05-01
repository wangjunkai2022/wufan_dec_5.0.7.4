.class public Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;
.super Ljava/lang/Object;
.source "AdSpacesBean.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/fusion/model/AdSpacesBean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RenderViewBean"
.end annotation


# instance fields
.field private borderHeight:Ljava/lang/String;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "borderHeight"
    .end annotation
.end field

.field private borderWidth:Ljava/lang/String;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "borderWidth"
    .end annotation
.end field

.field private clickNum:I
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "clickNum"
    .end annotation
.end field

.field private countDownColor:Ljava/lang/String;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "countDownColor"
    .end annotation
.end field

.field private delayDisplaySkipButton:J
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "delayDisplaySkipButton"
    .end annotation
.end field

.field private direction:Ljava/lang/String;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "direction"
    .end annotation
.end field

.field private dpLinkUrlList:Ljava/util/List;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "dpLinkUrlList"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/beizi/fusion/model/AdSpacesBean$DpLinkUrlListBean;",
            ">;"
        }
    .end annotation
.end field

.field private imageUrl:Ljava/lang/String;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "imageUrl"
    .end annotation
.end field

.field private layerPosition:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "layerPosition"
    .end annotation
.end field

.field private level:I
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "level"
    .end annotation
.end field

.field private location:Ljava/lang/String;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "location"
    .end annotation
.end field

.field private optimizePercent:I
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "optimizePercent"
    .end annotation
.end field

.field private optimizeSize:I
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "optimizeSize"
    .end annotation
.end field

.field private paddingHeight:D
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "paddingHeight"
    .end annotation
.end field

.field private passPolicy:Ljava/util/List;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "passPolicy"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/beizi/fusion/model/AdSpacesBean$PassPolicyBean;",
            ">;"
        }
    .end annotation
.end field

.field private picSkipTime:I
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "picSkipTime"
    .end annotation
.end field

.field private scrollDistance:Ljava/lang/String;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "scrollDistance"
    .end annotation
.end field

.field private scrollDistancePercent:I
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "scrollDistancePercent"
    .end annotation
.end field

.field private showBorder:I
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "showBorder"
    .end annotation
.end field

.field private showCountDown:I
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "showCountDown"
    .end annotation
.end field

.field private size:Ljava/lang/String;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "size"
    .end annotation
.end field

.field private skipText:Ljava/lang/String;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "skipText"
    .end annotation
.end field

.field private skipUnavailableTime:J
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "skipUnavailableTime"
    .end annotation
.end field

.field private skipViewTotalTime:J
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "skipViewTotalTime"
    .end annotation
.end field

.field private tapPosition:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "tapPosition"
    .end annotation
.end field

.field private textColor:Ljava/lang/String;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "textColor"
    .end annotation
.end field

.field private type:Ljava/lang/String;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "type"
    .end annotation
.end field

.field private videoSkipTime:I
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "videoSkipTime"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static objectFromData(Ljava/lang/String;)Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;
    .locals 1

    .line 1
    :try_start_0
    const-class v0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;

    invoke-static {p0, v0}, Lcom/beizi/fusion/model/JsonResolver;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;
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
.method public getBorderHeight()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->borderHeight:Ljava/lang/String;

    return-object v0
.end method

.method public getBorderWidth()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->borderWidth:Ljava/lang/String;

    return-object v0
.end method

.method public getClickNum()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->clickNum:I

    return v0
.end method

.method public getCountDownColor()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->countDownColor:Ljava/lang/String;

    return-object v0
.end method

.method public getDelayDisplaySkipButton()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->delayDisplaySkipButton:J

    return-wide v0
.end method

.method public getDirection()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->direction:Ljava/lang/String;

    return-object v0
.end method

.method public getDpLinkUrlList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/beizi/fusion/model/AdSpacesBean$DpLinkUrlListBean;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->dpLinkUrlList:Ljava/util/List;

    return-object v0
.end method

.method public getImageUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getLayerPosition()Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->layerPosition:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    return-object v0
.end method

.method public getLevel()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->level:I

    return v0
.end method

.method public getLocation()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->location:Ljava/lang/String;

    return-object v0
.end method

.method public getOptimizePercent()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->optimizePercent:I

    return v0
.end method

.method public getOptimizeSize()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->optimizeSize:I

    return v0
.end method

.method public getPaddingHeight()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->paddingHeight:D

    return-wide v0
.end method

.method public getPassPolicy()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/beizi/fusion/model/AdSpacesBean$PassPolicyBean;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->passPolicy:Ljava/util/List;

    return-object v0
.end method

.method public getPicSkipTime()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->picSkipTime:I

    return v0
.end method

.method public getScrollDistance()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->scrollDistance:Ljava/lang/String;

    return-object v0
.end method

.method public getScrollDistancePercent()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->scrollDistancePercent:I

    return v0
.end method

.method public getShowBorder()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->showBorder:I

    return v0
.end method

.method public getShowCountDown()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->showCountDown:I

    return v0
.end method

.method public getSize()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->size:Ljava/lang/String;

    return-object v0
.end method

.method public getSkipText()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->skipText:Ljava/lang/String;

    return-object v0
.end method

.method public getSkipUnavailableTime()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->skipUnavailableTime:J

    return-wide v0
.end method

.method public getSkipViewTotalTime()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->skipViewTotalTime:J

    return-wide v0
.end method

.method public getTapPosition()Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->tapPosition:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    return-object v0
.end method

.method public getTextColor()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->textColor:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->type:Ljava/lang/String;

    return-object v0
.end method

.method public getVideoSkipTime()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->videoSkipTime:I

    return v0
.end method

.method public setBorderHeight(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->borderHeight:Ljava/lang/String;

    return-void
.end method

.method public setBorderWidth(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->borderWidth:Ljava/lang/String;

    return-void
.end method

.method public setClickNum(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->clickNum:I

    return-void
.end method

.method public setCountDownColor(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->countDownColor:Ljava/lang/String;

    return-void
.end method

.method public setDelayDisplaySkipButton(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->delayDisplaySkipButton:J

    return-void
.end method

.method public setDirection(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->direction:Ljava/lang/String;

    return-void
.end method

.method public setDpLinkUrlList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/beizi/fusion/model/AdSpacesBean$DpLinkUrlListBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->dpLinkUrlList:Ljava/util/List;

    return-void
.end method

.method public setImageUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->imageUrl:Ljava/lang/String;

    return-void
.end method

.method public setLayerPosition(Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->layerPosition:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    return-void
.end method

.method public setLevel(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->level:I

    return-void
.end method

.method public setLocation(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->location:Ljava/lang/String;

    return-void
.end method

.method public setOptimizePercent(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->optimizePercent:I

    return-void
.end method

.method public setOptimizeSize(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->optimizeSize:I

    return-void
.end method

.method public setPaddingHeight(D)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->paddingHeight:D

    return-void
.end method

.method public setPassPolicy(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/beizi/fusion/model/AdSpacesBean$PassPolicyBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->passPolicy:Ljava/util/List;

    return-void
.end method

.method public setPicSkipTime(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->picSkipTime:I

    return-void
.end method

.method public setScrollDistance(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->scrollDistance:Ljava/lang/String;

    return-void
.end method

.method public setScrollDistancePercent(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->scrollDistancePercent:I

    return-void
.end method

.method public setShowBorder(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->showBorder:I

    return-void
.end method

.method public setShowCountDown(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->showCountDown:I

    return-void
.end method

.method public setSize(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->size:Ljava/lang/String;

    return-void
.end method

.method public setSkipText(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->skipText:Ljava/lang/String;

    return-void
.end method

.method public setSkipUnavailableTime(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->skipUnavailableTime:J

    return-void
.end method

.method public setSkipViewTotalTime(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->skipViewTotalTime:J

    return-void
.end method

.method public setTapPosition(Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->tapPosition:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    return-void
.end method

.method public setTextColor(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->textColor:Ljava/lang/String;

    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->type:Ljava/lang/String;

    return-void
.end method

.method public setVideoSkipTime(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->videoSkipTime:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RenderViewBean{type=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->type:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", dpLinkUrlList="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->dpLinkUrlList:Ljava/util/List;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", optimizePercent="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->optimizePercent:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", optimizeSize="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->optimizeSize:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", scrollDistance=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->scrollDistance:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", scrollDistancePercent="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->scrollDistancePercent:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", direction=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->direction:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", level="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->level:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", skipUnavailableTime="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->skipUnavailableTime:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", skipViewTotalTime="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->skipViewTotalTime:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", layerPosition="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->layerPosition:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", tapPosition="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->tapPosition:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", imageUrl=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->imageUrl:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", passPolicy="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->passPolicy:Ljava/util/List;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", delayDisplaySkipButton="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->delayDisplaySkipButton:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", paddingHeight="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->paddingHeight:D

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v2, ", skipText=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->skipText:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", textColor=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->textColor:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", showCountDown="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->showCountDown:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", countDownColor=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->countDownColor:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", showBorder="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->showBorder:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
