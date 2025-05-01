.class public Lcom/join/mgps/dto/WebDiskPositionModeBean;
.super Ljava/lang/Object;
.source "WebDiskPositionModeBean.java"


# instance fields
.field private download_mode:Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;

.field private setup_mode:Lcom/join/mgps/dto/WebDiskCfgSetupModelEnumBean;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDownload_mode()Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/WebDiskPositionModeBean;->download_mode:Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;

    return-object v0
.end method

.method public getSetup_mode()Lcom/join/mgps/dto/WebDiskCfgSetupModelEnumBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/WebDiskPositionModeBean;->setup_mode:Lcom/join/mgps/dto/WebDiskCfgSetupModelEnumBean;

    return-object v0
.end method

.method public setDownload_mode(Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/WebDiskPositionModeBean;->download_mode:Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;

    return-void
.end method

.method public setSetup_mode(Lcom/join/mgps/dto/WebDiskCfgSetupModelEnumBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/WebDiskPositionModeBean;->setup_mode:Lcom/join/mgps/dto/WebDiskCfgSetupModelEnumBean;

    return-void
.end method
