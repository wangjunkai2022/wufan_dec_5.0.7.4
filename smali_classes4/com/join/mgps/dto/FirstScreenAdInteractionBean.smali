.class public Lcom/join/mgps/dto/FirstScreenAdInteractionBean;
.super Ljava/lang/Object;
.source "FirstScreenAdInteractionBean.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/dto/FirstScreenAdInteractionBean$ShakeConfBean;
    }
.end annotation


# instance fields
.field private action:Ljava/lang/String;

.field private mode:Ljava/lang/String;

.field private shake_conf:Lcom/join/mgps/dto/FirstScreenAdInteractionBean$ShakeConfBean;

.field private tips:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAction()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/FirstScreenAdInteractionBean;->action:Ljava/lang/String;

    return-object v0
.end method

.method public getMode()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/FirstScreenAdInteractionBean;->mode:Ljava/lang/String;

    return-object v0
.end method

.method public getShake_conf()Lcom/join/mgps/dto/FirstScreenAdInteractionBean$ShakeConfBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/FirstScreenAdInteractionBean;->shake_conf:Lcom/join/mgps/dto/FirstScreenAdInteractionBean$ShakeConfBean;

    return-object v0
.end method

.method public getTips()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/FirstScreenAdInteractionBean;->tips:Ljava/lang/String;

    return-object v0
.end method

.method public setAction(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/FirstScreenAdInteractionBean;->action:Ljava/lang/String;

    return-void
.end method

.method public setMode(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/FirstScreenAdInteractionBean;->mode:Ljava/lang/String;

    return-void
.end method

.method public setShake_conf(Lcom/join/mgps/dto/FirstScreenAdInteractionBean$ShakeConfBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/FirstScreenAdInteractionBean;->shake_conf:Lcom/join/mgps/dto/FirstScreenAdInteractionBean$ShakeConfBean;

    return-void
.end method

.method public setTips(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/FirstScreenAdInteractionBean;->tips:Ljava/lang/String;

    return-void
.end method
