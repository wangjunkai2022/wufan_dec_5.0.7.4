.class public Lcom/papa91/arc/bean/RequestUpdateAchievementArgs;
.super Ljava/lang/Object;
.source "RequestUpdateAchievementArgs.java"


# instance fields
.field private achievement:Ljava/lang/String;

.field private gameId:Ljava/lang/String;

.field private token:Ljava/lang/String;

.field private tourist:I

.field private uid:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAchievement()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/bean/RequestUpdateAchievementArgs;->achievement:Ljava/lang/String;

    return-object v0
.end method

.method public getGameId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/bean/RequestUpdateAchievementArgs;->gameId:Ljava/lang/String;

    return-object v0
.end method

.method public getToken()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/bean/RequestUpdateAchievementArgs;->token:Ljava/lang/String;

    return-object v0
.end method

.method public getTourist()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/papa91/arc/bean/RequestUpdateAchievementArgs;->tourist:I

    return v0
.end method

.method public getUid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/bean/RequestUpdateAchievementArgs;->uid:Ljava/lang/String;

    return-object v0
.end method

.method public setAchievement(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/papa91/arc/bean/RequestUpdateAchievementArgs;->achievement:Ljava/lang/String;

    return-void
.end method

.method public setGameId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/papa91/arc/bean/RequestUpdateAchievementArgs;->gameId:Ljava/lang/String;

    return-void
.end method

.method public setToken(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/papa91/arc/bean/RequestUpdateAchievementArgs;->token:Ljava/lang/String;

    return-void
.end method

.method public setTourist(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/papa91/arc/bean/RequestUpdateAchievementArgs;->tourist:I

    return-void
.end method

.method public setUid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/papa91/arc/bean/RequestUpdateAchievementArgs;->uid:Ljava/lang/String;

    return-void
.end method
