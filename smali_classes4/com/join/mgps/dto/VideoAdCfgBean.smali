.class public Lcom/join/mgps/dto/VideoAdCfgBean;
.super Ljava/lang/Object;
.source "VideoAdCfgBean.java"


# instance fields
.field private arcade_game_ad_cfg:Lcom/join/mgps/dto/ArcadeGameAdCfgBean;

.field private download_speedup_cfg:Lcom/join/mgps/dto/DownloadSpeedupCfgBean;

.field private mod_enhance_ad_cfg:Lcom/join/mgps/dto/SingleGameAdCfgBean;

.field private mod_normal_ad_cfg:Lcom/join/mgps/dto/SingleGameAdCfgBean;

.field private psp_game_ad_cfg:Lcom/join/mgps/dto/PspGameAdCfgBean;

.field private simulator_exit_information_cfg:Lcom/join/mgps/dto/SimulatorAdCfgBean;

.field private simulator_exit_open_cfg:Lcom/join/mgps/dto/SimulatorAdCfgBean;

.field private simulator_fc_cfg:Lcom/join/mgps/dto/SimulatorAdCfgBean;

.field private simulator_gba_cfg:Lcom/join/mgps/dto/SimulatorAdCfgBean;

.field private simulator_gold_finger_cfg:Lcom/join/mgps/dto/SimulatorAdCfgBean;

.field private simulator_jj_cfg:Lcom/join/mgps/dto/SimulatorAdCfgBean;

.field private simulator_path_cfg:Lcom/join/mgps/dto/SimulatorPathCfgBean;

.field private simulator_psp_cfg:Lcom/join/mgps/dto/SimulatorAdCfgBean;

.field private single_game_ad_cfg:Lcom/join/mgps/dto/SingleGameAdCfgBean;

.field private ssp_cfg:Lcom/join/mgps/dto/SimulatorAdCfgBean;

.field private video_init_cfg:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/join/mgps/dto/VideoInitCfgBean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getArcade_game_ad_cfg()Lcom/join/mgps/dto/ArcadeGameAdCfgBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/VideoAdCfgBean;->arcade_game_ad_cfg:Lcom/join/mgps/dto/ArcadeGameAdCfgBean;

    return-object v0
.end method

.method public getDownload_speedup_cfg()Lcom/join/mgps/dto/DownloadSpeedupCfgBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/VideoAdCfgBean;->download_speedup_cfg:Lcom/join/mgps/dto/DownloadSpeedupCfgBean;

    return-object v0
.end method

.method public getMod_enhance_ad_cfg()Lcom/join/mgps/dto/SingleGameAdCfgBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/VideoAdCfgBean;->mod_enhance_ad_cfg:Lcom/join/mgps/dto/SingleGameAdCfgBean;

    return-object v0
.end method

.method public getMod_normal_ad_cfg()Lcom/join/mgps/dto/SingleGameAdCfgBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/VideoAdCfgBean;->mod_normal_ad_cfg:Lcom/join/mgps/dto/SingleGameAdCfgBean;

    return-object v0
.end method

.method public getPsp_game_ad_cfg()Lcom/join/mgps/dto/PspGameAdCfgBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/VideoAdCfgBean;->psp_game_ad_cfg:Lcom/join/mgps/dto/PspGameAdCfgBean;

    return-object v0
.end method

.method public getSimulator_exit_information_cfg()Lcom/join/mgps/dto/SimulatorAdCfgBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/VideoAdCfgBean;->simulator_exit_information_cfg:Lcom/join/mgps/dto/SimulatorAdCfgBean;

    return-object v0
.end method

.method public getSimulator_exit_open_cfg()Lcom/join/mgps/dto/SimulatorAdCfgBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/VideoAdCfgBean;->simulator_exit_open_cfg:Lcom/join/mgps/dto/SimulatorAdCfgBean;

    return-object v0
.end method

.method public getSimulator_fc_cfg()Lcom/join/mgps/dto/SimulatorAdCfgBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/VideoAdCfgBean;->simulator_fc_cfg:Lcom/join/mgps/dto/SimulatorAdCfgBean;

    return-object v0
.end method

.method public getSimulator_gba_cfg()Lcom/join/mgps/dto/SimulatorAdCfgBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/VideoAdCfgBean;->simulator_gba_cfg:Lcom/join/mgps/dto/SimulatorAdCfgBean;

    return-object v0
.end method

.method public getSimulator_gold_finger_cfg()Lcom/join/mgps/dto/SimulatorAdCfgBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/VideoAdCfgBean;->simulator_gold_finger_cfg:Lcom/join/mgps/dto/SimulatorAdCfgBean;

    return-object v0
.end method

.method public getSimulator_jj_cfg()Lcom/join/mgps/dto/SimulatorAdCfgBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/VideoAdCfgBean;->simulator_jj_cfg:Lcom/join/mgps/dto/SimulatorAdCfgBean;

    return-object v0
.end method

.method public getSimulator_path_cfg()Lcom/join/mgps/dto/SimulatorPathCfgBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/VideoAdCfgBean;->simulator_path_cfg:Lcom/join/mgps/dto/SimulatorPathCfgBean;

    return-object v0
.end method

.method public getSimulator_psp_cfg()Lcom/join/mgps/dto/SimulatorAdCfgBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/VideoAdCfgBean;->simulator_psp_cfg:Lcom/join/mgps/dto/SimulatorAdCfgBean;

    return-object v0
.end method

.method public getSingle_game_ad_cfg()Lcom/join/mgps/dto/SingleGameAdCfgBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/VideoAdCfgBean;->single_game_ad_cfg:Lcom/join/mgps/dto/SingleGameAdCfgBean;

    return-object v0
.end method

.method public getSsp_cfg()Lcom/join/mgps/dto/SimulatorAdCfgBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/VideoAdCfgBean;->ssp_cfg:Lcom/join/mgps/dto/SimulatorAdCfgBean;

    return-object v0
.end method

.method public getVideo_init_cfg()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/VideoInitCfgBean;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/VideoAdCfgBean;->video_init_cfg:Ljava/util/ArrayList;

    return-object v0
.end method

.method public setArcade_game_ad_cfg(Lcom/join/mgps/dto/ArcadeGameAdCfgBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/VideoAdCfgBean;->arcade_game_ad_cfg:Lcom/join/mgps/dto/ArcadeGameAdCfgBean;

    return-void
.end method

.method public setDownload_speedup_cfg(Lcom/join/mgps/dto/DownloadSpeedupCfgBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/VideoAdCfgBean;->download_speedup_cfg:Lcom/join/mgps/dto/DownloadSpeedupCfgBean;

    return-void
.end method

.method public setMod_enhance_ad_cfg(Lcom/join/mgps/dto/SingleGameAdCfgBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/VideoAdCfgBean;->mod_enhance_ad_cfg:Lcom/join/mgps/dto/SingleGameAdCfgBean;

    return-void
.end method

.method public setMod_normal_ad_cfg(Lcom/join/mgps/dto/SingleGameAdCfgBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/VideoAdCfgBean;->mod_normal_ad_cfg:Lcom/join/mgps/dto/SingleGameAdCfgBean;

    return-void
.end method

.method public setPsp_game_ad_cfg(Lcom/join/mgps/dto/PspGameAdCfgBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/VideoAdCfgBean;->psp_game_ad_cfg:Lcom/join/mgps/dto/PspGameAdCfgBean;

    return-void
.end method

.method public setSimulator_exit_information_cfg(Lcom/join/mgps/dto/SimulatorAdCfgBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/VideoAdCfgBean;->simulator_exit_information_cfg:Lcom/join/mgps/dto/SimulatorAdCfgBean;

    return-void
.end method

.method public setSimulator_exit_open_cfg(Lcom/join/mgps/dto/SimulatorAdCfgBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/VideoAdCfgBean;->simulator_exit_open_cfg:Lcom/join/mgps/dto/SimulatorAdCfgBean;

    return-void
.end method

.method public setSimulator_fc_cfg(Lcom/join/mgps/dto/SimulatorAdCfgBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/VideoAdCfgBean;->simulator_fc_cfg:Lcom/join/mgps/dto/SimulatorAdCfgBean;

    return-void
.end method

.method public setSimulator_gba_cfg(Lcom/join/mgps/dto/SimulatorAdCfgBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/VideoAdCfgBean;->simulator_gba_cfg:Lcom/join/mgps/dto/SimulatorAdCfgBean;

    return-void
.end method

.method public setSimulator_gold_finger_cfg(Lcom/join/mgps/dto/SimulatorAdCfgBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/VideoAdCfgBean;->simulator_gold_finger_cfg:Lcom/join/mgps/dto/SimulatorAdCfgBean;

    return-void
.end method

.method public setSimulator_jj_cfg(Lcom/join/mgps/dto/SimulatorAdCfgBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/VideoAdCfgBean;->simulator_jj_cfg:Lcom/join/mgps/dto/SimulatorAdCfgBean;

    return-void
.end method

.method public setSimulator_path_cfg(Lcom/join/mgps/dto/SimulatorPathCfgBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/VideoAdCfgBean;->simulator_path_cfg:Lcom/join/mgps/dto/SimulatorPathCfgBean;

    return-void
.end method

.method public setSimulator_psp_cfg(Lcom/join/mgps/dto/SimulatorAdCfgBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/VideoAdCfgBean;->simulator_psp_cfg:Lcom/join/mgps/dto/SimulatorAdCfgBean;

    return-void
.end method

.method public setSingle_game_ad_cfg(Lcom/join/mgps/dto/SingleGameAdCfgBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/VideoAdCfgBean;->single_game_ad_cfg:Lcom/join/mgps/dto/SingleGameAdCfgBean;

    return-void
.end method

.method public setSsp_cfg(Lcom/join/mgps/dto/SimulatorAdCfgBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/VideoAdCfgBean;->ssp_cfg:Lcom/join/mgps/dto/SimulatorAdCfgBean;

    return-void
.end method

.method public setVideo_init_cfg(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/join/mgps/dto/VideoInitCfgBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/VideoAdCfgBean;->video_init_cfg:Ljava/util/ArrayList;

    return-void
.end method
