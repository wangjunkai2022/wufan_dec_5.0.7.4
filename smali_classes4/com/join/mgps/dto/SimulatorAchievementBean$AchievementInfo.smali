.class public Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;
.super Ljava/lang/Object;
.source "SimulatorAchievementBean.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/dto/SimulatorAchievementBean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AchievementInfo"
.end annotation


# instance fields
.field private condition:Ljava/lang/String;

.field private done:I

.field private icon:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private target:I

.field private unlock_date:Ljava/lang/String;

.field private unlock_rate:I

.field private unlock_time:Ljava/lang/String;


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
    iget-object v0, p0, Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;->condition:Ljava/lang/String;

    return-object v0
.end method

.method public getDone()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;->done:I

    return v0
.end method

.method public getIcon()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getTarget()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;->target:I

    return v0
.end method

.method public getUnlock_date()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;->unlock_date:Ljava/lang/String;

    return-object v0
.end method

.method public getUnlock_rate()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;->unlock_rate:I

    return v0
.end method

.method public getUnlock_time()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;->unlock_time:Ljava/lang/String;

    return-object v0
.end method

.method public setCondition(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;->condition:Ljava/lang/String;

    return-void
.end method

.method public setDone(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;->done:I

    return-void
.end method

.method public setIcon(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;->icon:Ljava/lang/String;

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;->name:Ljava/lang/String;

    return-void
.end method

.method public setTarget(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;->target:I

    return-void
.end method

.method public setUnlock_date(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;->unlock_date:Ljava/lang/String;

    return-void
.end method

.method public setUnlock_rate(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;->unlock_rate:I

    return-void
.end method

.method public setUnlock_time(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;->unlock_time:Ljava/lang/String;

    return-void
.end method
