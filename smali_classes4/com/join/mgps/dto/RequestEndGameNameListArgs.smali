.class public Lcom/join/mgps/dto/RequestEndGameNameListArgs;
.super Ljava/lang/Object;
.source "RequestEndGameNameListArgs.java"


# instance fields
.field private modelType:I

.field private page:I

.field private uid:Ljava/lang/String;

.field private withEndGame:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getModelType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/RequestEndGameNameListArgs;->modelType:I

    return v0
.end method

.method public getPage()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/RequestEndGameNameListArgs;->page:I

    return v0
.end method

.method public getUid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/RequestEndGameNameListArgs;->uid:Ljava/lang/String;

    return-object v0
.end method

.method public isWithEndGame()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/dto/RequestEndGameNameListArgs;->withEndGame:Z

    return v0
.end method

.method public setModelType(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/RequestEndGameNameListArgs;->modelType:I

    return-void
.end method

.method public setPage(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/RequestEndGameNameListArgs;->page:I

    return-void
.end method

.method public setUid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/RequestEndGameNameListArgs;->uid:Ljava/lang/String;

    return-void
.end method

.method public setWithEndGame(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/dto/RequestEndGameNameListArgs;->withEndGame:Z

    return-void
.end method
