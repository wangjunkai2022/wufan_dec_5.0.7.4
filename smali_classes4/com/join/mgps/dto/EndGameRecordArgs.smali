.class public Lcom/join/mgps/dto/EndGameRecordArgs;
.super Ljava/lang/Object;
.source "EndGameRecordArgs.java"


# instance fields
.field private challengeId:Ljava/lang/String;

.field private endgameId:Ljava/lang/String;

.field private ownerUid:Ljava/lang/String;

.field private uid:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getChallengeId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/EndGameRecordArgs;->challengeId:Ljava/lang/String;

    return-object v0
.end method

.method public getEndgameId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/EndGameRecordArgs;->endgameId:Ljava/lang/String;

    return-object v0
.end method

.method public getOwnerUid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/EndGameRecordArgs;->ownerUid:Ljava/lang/String;

    return-object v0
.end method

.method public getUid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/EndGameRecordArgs;->uid:Ljava/lang/String;

    return-object v0
.end method

.method public setChallengeId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/EndGameRecordArgs;->challengeId:Ljava/lang/String;

    return-void
.end method

.method public setEndgameId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/EndGameRecordArgs;->endgameId:Ljava/lang/String;

    return-void
.end method

.method public setOwnerUid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/EndGameRecordArgs;->ownerUid:Ljava/lang/String;

    return-void
.end method

.method public setUid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/EndGameRecordArgs;->uid:Ljava/lang/String;

    return-void
.end method
