.class public Lcom/papa91/arc/bean/EndGameAllowBean;
.super Ljava/lang/Object;
.source "EndGameAllowBean.java"


# instance fields
.field private adVideoConfigList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/papa91/arc/bean/EndGameAdBean;",
            ">;"
        }
    .end annotation
.end field

.field private allowed:Z

.field private awardCards:I

.field private awardUnlimited:Z

.field private cards:I

.field private challengeId:Ljava/lang/String;

.field private elapsedTimeHint:Ljava/lang/String;

.field private multipleAwardCards:I

.field private redPacketList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private remainTimes:I

.field private unlimited:Z

.field private watchAd:Z

.field private welfareSwitch:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAdVideoConfigList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/papa91/arc/bean/EndGameAdBean;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/bean/EndGameAllowBean;->adVideoConfigList:Ljava/util/List;

    return-object v0
.end method

.method public getAwardCards()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/papa91/arc/bean/EndGameAllowBean;->awardCards:I

    return v0
.end method

.method public getCards()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/papa91/arc/bean/EndGameAllowBean;->cards:I

    return v0
.end method

.method public getChallengeId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/bean/EndGameAllowBean;->challengeId:Ljava/lang/String;

    return-object v0
.end method

.method public getElapsedTimeHint()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/bean/EndGameAllowBean;->elapsedTimeHint:Ljava/lang/String;

    return-object v0
.end method

.method public getMultipleAwardCards()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/papa91/arc/bean/EndGameAllowBean;->multipleAwardCards:I

    return v0
.end method

.method public getRedPacketList()Ljava/util/List;
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
    iget-object v0, p0, Lcom/papa91/arc/bean/EndGameAllowBean;->redPacketList:Ljava/util/List;

    return-object v0
.end method

.method public getRemainTimes()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/papa91/arc/bean/EndGameAllowBean;->remainTimes:I

    return v0
.end method

.method public isAllowed()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/papa91/arc/bean/EndGameAllowBean;->allowed:Z

    return v0
.end method

.method public isAwardUnlimited()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/papa91/arc/bean/EndGameAllowBean;->awardUnlimited:Z

    return v0
.end method

.method public isUnlimited()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/papa91/arc/bean/EndGameAllowBean;->unlimited:Z

    return v0
.end method

.method public isWatchAd()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/papa91/arc/bean/EndGameAllowBean;->watchAd:Z

    return v0
.end method

.method public isWelfareSwitch()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/papa91/arc/bean/EndGameAllowBean;->welfareSwitch:Z

    return v0
.end method

.method public setAdVideoConfigList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/papa91/arc/bean/EndGameAdBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/papa91/arc/bean/EndGameAllowBean;->adVideoConfigList:Ljava/util/List;

    return-void
.end method

.method public setAllowed(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/papa91/arc/bean/EndGameAllowBean;->allowed:Z

    return-void
.end method

.method public setAwardCards(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/papa91/arc/bean/EndGameAllowBean;->awardCards:I

    return-void
.end method

.method public setAwardUnlimited(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/papa91/arc/bean/EndGameAllowBean;->awardUnlimited:Z

    return-void
.end method

.method public setCards(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/papa91/arc/bean/EndGameAllowBean;->cards:I

    return-void
.end method

.method public setChallengeId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/papa91/arc/bean/EndGameAllowBean;->challengeId:Ljava/lang/String;

    return-void
.end method

.method public setElapsedTimeHint(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/papa91/arc/bean/EndGameAllowBean;->elapsedTimeHint:Ljava/lang/String;

    return-void
.end method

.method public setMultipleAwardCards(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/papa91/arc/bean/EndGameAllowBean;->multipleAwardCards:I

    return-void
.end method

.method public setRedPacketList(Ljava/util/List;)V
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
    iput-object p1, p0, Lcom/papa91/arc/bean/EndGameAllowBean;->redPacketList:Ljava/util/List;

    return-void
.end method

.method public setRemainTimes(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/papa91/arc/bean/EndGameAllowBean;->remainTimes:I

    return-void
.end method

.method public setUnlimited(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/papa91/arc/bean/EndGameAllowBean;->unlimited:Z

    return-void
.end method

.method public setWatchAd(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/papa91/arc/bean/EndGameAllowBean;->watchAd:Z

    return-void
.end method

.method public setWelfareSwitch(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/papa91/arc/bean/EndGameAllowBean;->welfareSwitch:Z

    return-void
.end method
