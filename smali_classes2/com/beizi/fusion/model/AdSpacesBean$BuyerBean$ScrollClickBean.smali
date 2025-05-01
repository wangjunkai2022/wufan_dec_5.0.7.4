.class public Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;
.super Ljava/lang/Object;
.source "AdSpacesBean.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ScrollClickBean"
.end annotation


# instance fields
.field private details:Ljava/lang/String;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "details"
    .end annotation
.end field

.field private detailsFont:I
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "detailsFont"
    .end annotation
.end field

.field private orderData:Ljava/util/List;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "orderData"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$OrderDataScrollViewOrderBean;",
            ">;"
        }
    .end annotation
.end field

.field private position:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickPositionBean;
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

.field private scrollClickUuid:Ljava/lang/String;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "scrollClickUuid"
    .end annotation
.end field

.field private scrollDirection:Ljava/lang/String;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "scrollDirection"
    .end annotation
.end field

.field private scrollDistance:I
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "scrollDistance"
    .end annotation
.end field

.field private title:Ljava/lang/String;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "title"
    .end annotation
.end field

.field private titleFont:I
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "titleFont"
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
.method public getDetails()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;->details:Ljava/lang/String;

    return-object v0
.end method

.method public getDetailsFont()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;->detailsFont:I

    return v0
.end method

.method public getOrderData()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$OrderDataScrollViewOrderBean;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;->orderData:Ljava/util/List;

    return-object v0
.end method

.method public getPosition()Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickPositionBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;->position:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickPositionBean;

    return-object v0
.end method

.method public getRandomClickNum()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;->randomClickNum:I

    return v0
.end method

.method public getRandomClickTime()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;->randomClickTime:I

    return v0
.end method

.method public getScrollClickUuid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;->scrollClickUuid:Ljava/lang/String;

    return-object v0
.end method

.method public getScrollDirection()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;->scrollDirection:Ljava/lang/String;

    return-object v0
.end method

.method public getScrollDistance()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;->scrollDistance:I

    return v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;->title:Ljava/lang/String;

    return-object v0
.end method

.method public getTitleFont()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;->titleFont:I

    return v0
.end method

.method public setDetails(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;->details:Ljava/lang/String;

    return-void
.end method

.method public setDetailsFont(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;->detailsFont:I

    return-void
.end method

.method public setOrderData(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$OrderDataScrollViewOrderBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;->orderData:Ljava/util/List;

    return-void
.end method

.method public setPosition(Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickPositionBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;->position:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickPositionBean;

    return-void
.end method

.method public setRandomClickNum(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;->randomClickNum:I

    return-void
.end method

.method public setRandomClickTime(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;->randomClickTime:I

    return-void
.end method

.method public setScrollClickUuid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;->scrollClickUuid:Ljava/lang/String;

    return-void
.end method

.method public setScrollDirection(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;->scrollDirection:Ljava/lang/String;

    return-void
.end method

.method public setScrollDistance(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;->scrollDistance:I

    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;->title:Ljava/lang/String;

    return-void
.end method

.method public setTitleFont(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;->titleFont:I

    return-void
.end method
