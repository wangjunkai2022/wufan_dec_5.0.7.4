.class public Lcom/join/mgps/dto/RequestBossListArgs;
.super Ljava/lang/Object;
.source "RequestBossListArgs.java"


# instance fields
.field gameId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/join/mgps/dto/RequestBossListArgs;->gameId:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getGameId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/RequestBossListArgs;->gameId:Ljava/lang/String;

    return-object v0
.end method

.method public setGameId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/RequestBossListArgs;->gameId:Ljava/lang/String;

    return-void
.end method
