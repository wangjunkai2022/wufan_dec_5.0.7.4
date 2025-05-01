.class public Lcom/beizi/fusion/model/AdSpacesBean$EventStrategyBean;
.super Ljava/lang/Object;
.source "AdSpacesBean.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/fusion/model/AdSpacesBean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "EventStrategyBean"
.end annotation


# instance fields
.field private randomStrategy:Ljava/util/List;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "randomStrategy"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/beizi/fusion/model/AdSpacesBean$RandomStrategyBean;",
            ">;"
        }
    .end annotation
.end field

.field private validTimeShow:I
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "validTimeShow"
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
.method public getRandomStrategy()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/beizi/fusion/model/AdSpacesBean$RandomStrategyBean;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$EventStrategyBean;->randomStrategy:Ljava/util/List;

    return-object v0
.end method

.method public getValidTimeShow()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$EventStrategyBean;->validTimeShow:I

    return v0
.end method

.method public setRandomStrategy(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/beizi/fusion/model/AdSpacesBean$RandomStrategyBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$EventStrategyBean;->randomStrategy:Ljava/util/List;

    return-void
.end method

.method public setValidTimeShow(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$EventStrategyBean;->validTimeShow:I

    return-void
.end method
