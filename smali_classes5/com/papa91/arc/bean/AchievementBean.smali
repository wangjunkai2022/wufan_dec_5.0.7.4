.class public Lcom/papa91/arc/bean/AchievementBean;
.super Ljava/lang/Object;
.source "AchievementBean.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/papa91/arc/bean/AchievementBean$AchievementInfo;
    }
.end annotation


# instance fields
.field private achievement_list:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/papa91/arc/bean/AchievementBean$AchievementInfo;",
            ">;"
        }
    .end annotation
.end field

.field private done:I

.field private target:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAchievement_list()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/papa91/arc/bean/AchievementBean$AchievementInfo;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/bean/AchievementBean;->achievement_list:Ljava/util/List;

    return-object v0
.end method

.method public getDone()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/papa91/arc/bean/AchievementBean;->done:I

    return v0
.end method

.method public getTarget()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/papa91/arc/bean/AchievementBean;->target:I

    return v0
.end method

.method public setAchievement_list(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/papa91/arc/bean/AchievementBean$AchievementInfo;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/papa91/arc/bean/AchievementBean;->achievement_list:Ljava/util/List;

    return-void
.end method

.method public setDone(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/papa91/arc/bean/AchievementBean;->done:I

    return-void
.end method

.method public setTarget(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/papa91/arc/bean/AchievementBean;->target:I

    return-void
.end method
