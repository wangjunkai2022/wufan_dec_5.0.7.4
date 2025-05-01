.class public Lcom/papa91/arc/bean/EndgameChallengeLevelBean$BoundaryBean;
.super Ljava/lang/Object;
.source "EndgameChallengeLevelBean.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/papa91/arc/bean/EndgameChallengeLevelBean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "BoundaryBean"
.end annotation


# instance fields
.field private lower:I

.field private upper:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getLower()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/papa91/arc/bean/EndgameChallengeLevelBean$BoundaryBean;->lower:I

    return v0
.end method

.method public getUpper()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/papa91/arc/bean/EndgameChallengeLevelBean$BoundaryBean;->upper:I

    return v0
.end method

.method public setLower(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/papa91/arc/bean/EndgameChallengeLevelBean$BoundaryBean;->lower:I

    return-void
.end method

.method public setUpper(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/papa91/arc/bean/EndgameChallengeLevelBean$BoundaryBean;->upper:I

    return-void
.end method
