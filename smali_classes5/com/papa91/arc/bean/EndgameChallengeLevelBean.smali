.class public Lcom/papa91/arc/bean/EndgameChallengeLevelBean;
.super Ljava/lang/Object;
.source "EndgameChallengeLevelBean.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/papa91/arc/bean/EndgameChallengeLevelBean$BoundaryBean;
    }
.end annotation


# instance fields
.field private boundary:Lcom/papa91/arc/bean/EndgameChallengeLevelBean$BoundaryBean;

.field private level:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getBoundary()Lcom/papa91/arc/bean/EndgameChallengeLevelBean$BoundaryBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/bean/EndgameChallengeLevelBean;->boundary:Lcom/papa91/arc/bean/EndgameChallengeLevelBean$BoundaryBean;

    return-object v0
.end method

.method public getLevel()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/bean/EndgameChallengeLevelBean;->level:Ljava/lang/String;

    return-object v0
.end method

.method public setBoundary(Lcom/papa91/arc/bean/EndgameChallengeLevelBean$BoundaryBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/papa91/arc/bean/EndgameChallengeLevelBean;->boundary:Lcom/papa91/arc/bean/EndgameChallengeLevelBean$BoundaryBean;

    return-void
.end method

.method public setLevel(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/papa91/arc/bean/EndgameChallengeLevelBean;->level:Ljava/lang/String;

    return-void
.end method
