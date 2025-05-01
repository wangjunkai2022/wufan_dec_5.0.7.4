.class public Lcom/join/mgps/dto/RequestDomainInfoArgs;
.super Ljava/lang/Object;
.source "RequestDomainInfoArgs.java"


# instance fields
.field private gameId:Ljava/lang/String;

.field private location:Ljava/lang/Integer;

.field private typeId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getGameId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/RequestDomainInfoArgs;->gameId:Ljava/lang/String;

    return-object v0
.end method

.method public getLocation()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/RequestDomainInfoArgs;->location:Ljava/lang/Integer;

    return-object v0
.end method

.method public getTypeId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/RequestDomainInfoArgs;->typeId:Ljava/lang/String;

    return-object v0
.end method

.method public setGameId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/RequestDomainInfoArgs;->gameId:Ljava/lang/String;

    return-void
.end method

.method public setLocation(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/RequestDomainInfoArgs;->location:Ljava/lang/Integer;

    return-void
.end method

.method public setTypeId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/RequestDomainInfoArgs;->typeId:Ljava/lang/String;

    return-void
.end method
