.class public Lcom/join/mgps/dto/SimulatorMomentBean$Achievement;
.super Ljava/lang/Object;
.source "SimulatorMomentBean.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/dto/SimulatorMomentBean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Achievement"
.end annotation


# instance fields
.field private icon:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private unlockRate:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getIcon()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/SimulatorMomentBean$Achievement;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/SimulatorMomentBean$Achievement;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getUnlockRate()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/SimulatorMomentBean$Achievement;->unlockRate:Ljava/lang/String;

    return-object v0
.end method

.method public setIcon(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/SimulatorMomentBean$Achievement;->icon:Ljava/lang/String;

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/SimulatorMomentBean$Achievement;->name:Ljava/lang/String;

    return-void
.end method

.method public setUnlockRate(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/SimulatorMomentBean$Achievement;->unlockRate:Ljava/lang/String;

    return-void
.end method
