.class public Lcom/join/mgps/dto/GameMainV4DataBean$EndgameChallengeLevelBean;
.super Ljava/lang/Object;
.source "GameMainV4DataBean.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/dto/GameMainV4DataBean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "EndgameChallengeLevelBean"
.end annotation


# instance fields
.field private boundary:Lcom/join/mgps/dto/GameMainV4DataBean$BoundaryBean;

.field private level:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getBoundary()Lcom/join/mgps/dto/GameMainV4DataBean$BoundaryBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GameMainV4DataBean$EndgameChallengeLevelBean;->boundary:Lcom/join/mgps/dto/GameMainV4DataBean$BoundaryBean;

    return-object v0
.end method

.method public getLevel()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GameMainV4DataBean$EndgameChallengeLevelBean;->level:Ljava/lang/String;

    return-object v0
.end method

.method public setBoundary(Lcom/join/mgps/dto/GameMainV4DataBean$BoundaryBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/GameMainV4DataBean$EndgameChallengeLevelBean;->boundary:Lcom/join/mgps/dto/GameMainV4DataBean$BoundaryBean;

    return-void
.end method

.method public setLevel(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/GameMainV4DataBean$EndgameChallengeLevelBean;->level:Ljava/lang/String;

    return-void
.end method
