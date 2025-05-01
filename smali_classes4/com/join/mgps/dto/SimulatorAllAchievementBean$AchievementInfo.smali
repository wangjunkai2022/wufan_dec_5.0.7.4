.class public Lcom/join/mgps/dto/SimulatorAllAchievementBean$AchievementInfo;
.super Ljava/lang/Object;
.source "SimulatorAllAchievementBean.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/dto/SimulatorAllAchievementBean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AchievementInfo"
.end annotation


# instance fields
.field private condition:Ljava/lang/String;

.field private done:I

.field private name:Ljava/lang/String;

.field private show:I

.field private target:I

.field private ver:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCondition()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/SimulatorAllAchievementBean$AchievementInfo;->condition:Ljava/lang/String;

    return-object v0
.end method

.method public getDone()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/SimulatorAllAchievementBean$AchievementInfo;->done:I

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/SimulatorAllAchievementBean$AchievementInfo;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getShow()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/SimulatorAllAchievementBean$AchievementInfo;->show:I

    return v0
.end method

.method public getTarget()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/SimulatorAllAchievementBean$AchievementInfo;->target:I

    return v0
.end method

.method public getVer()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/SimulatorAllAchievementBean$AchievementInfo;->ver:Ljava/lang/String;

    return-object v0
.end method

.method public setCondition(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/SimulatorAllAchievementBean$AchievementInfo;->condition:Ljava/lang/String;

    return-void
.end method

.method public setDone(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/SimulatorAllAchievementBean$AchievementInfo;->done:I

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/SimulatorAllAchievementBean$AchievementInfo;->name:Ljava/lang/String;

    return-void
.end method

.method public setShow(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/SimulatorAllAchievementBean$AchievementInfo;->show:I

    return-void
.end method

.method public setTarget(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/SimulatorAllAchievementBean$AchievementInfo;->target:I

    return-void
.end method

.method public setVer(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/SimulatorAllAchievementBean$AchievementInfo;->ver:Ljava/lang/String;

    return-void
.end method
