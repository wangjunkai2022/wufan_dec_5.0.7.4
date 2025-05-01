.class public Lcom/papa91/arc/bean/AchievementDoneBean;
.super Ljava/lang/Object;
.source "AchievementDoneBean.java"


# instance fields
.field private done:I

.field private index:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/papa91/arc/bean/AchievementDoneBean;->index:I

    .line 3
    iput p2, p0, Lcom/papa91/arc/bean/AchievementDoneBean;->done:I

    return-void
.end method


# virtual methods
.method public getDone()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/papa91/arc/bean/AchievementDoneBean;->done:I

    return v0
.end method

.method public getIndex()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/papa91/arc/bean/AchievementDoneBean;->index:I

    return v0
.end method

.method public setDone(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/papa91/arc/bean/AchievementDoneBean;->done:I

    return-void
.end method

.method public setIndex(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/papa91/arc/bean/AchievementDoneBean;->index:I

    return-void
.end method
