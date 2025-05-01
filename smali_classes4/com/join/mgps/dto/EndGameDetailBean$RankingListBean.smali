.class public Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;
.super Ljava/lang/Object;
.source "EndGameDetailBean.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/dto/EndGameDetailBean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RankingListBean"
.end annotation


# instance fields
.field private avatar:Ljava/lang/String;

.field private challengeId:Ljava/lang/String;

.field private change:I

.field private elapsedTime:I

.field private endgameId:Ljava/lang/String;

.field private nickname:Ljava/lang/String;

.field private playback:Z

.field private ranking:Ljava/lang/String;

.field private uid:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAvatar()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;->avatar:Ljava/lang/String;

    return-object v0
.end method

.method public getChallengeId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;->challengeId:Ljava/lang/String;

    return-object v0
.end method

.method public getChange()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;->change:I

    return v0
.end method

.method public getElapsedTime()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;->elapsedTime:I

    return v0
.end method

.method public getEndgameId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;->endgameId:Ljava/lang/String;

    return-object v0
.end method

.method public getNickname()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;->nickname:Ljava/lang/String;

    return-object v0
.end method

.method public getRanking()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;->ranking:Ljava/lang/String;

    return-object v0
.end method

.method public getUid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;->uid:Ljava/lang/String;

    return-object v0
.end method

.method public isPlayback()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;->playback:Z

    return v0
.end method

.method public setAvatar(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;->avatar:Ljava/lang/String;

    return-void
.end method

.method public setChallengeId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;->challengeId:Ljava/lang/String;

    return-void
.end method

.method public setChange(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;->change:I

    return-void
.end method

.method public setElapsedTime(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;->elapsedTime:I

    return-void
.end method

.method public setEndgameId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;->endgameId:Ljava/lang/String;

    return-void
.end method

.method public setNickname(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;->nickname:Ljava/lang/String;

    return-void
.end method

.method public setPlayback(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;->playback:Z

    return-void
.end method

.method public setRanking(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;->ranking:Ljava/lang/String;

    return-void
.end method

.method public setUid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;->uid:Ljava/lang/String;

    return-void
.end method
