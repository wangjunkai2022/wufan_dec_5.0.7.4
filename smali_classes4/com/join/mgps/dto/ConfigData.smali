.class public Lcom/join/mgps/dto/ConfigData;
.super Ljava/lang/Object;
.source "ConfigData.java"


# instance fields
.field anti_addiction_switch:Z

.field b_side:Z

.field client_ip:Ljava/lang/String;

.field download_game_switch:Z

.field first_screen_ad_interaction:Lcom/join/mgps/dto/FirstScreenAdInteractionBean;

.field private found_game_tab:Lcom/join/mgps/dto/FoundGameTabBean;

.field home_page_video_switch:Z

.field launch_game_switch:Z

.field private net_game_count_down:I

.field non_online_user_switch:Z

.field private pd_ad_cfg:Lcom/join/mgps/dto/PdAdCfgBean;

.field real_name_black_list:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field unknown_source_state:Z

.field private w_channel_info_switch:Z

.field private web_disk_cfg:Lcom/join/mgps/dto/WebDiskCfg;

.field private web_disk_position:Lcom/join/mgps/dto/WebDiskPositionBean;

.field wx_open_appid:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/dto/ConfigData;->w_channel_info_switch:Z

    return-void
.end method


# virtual methods
.method public getClient_ip()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/ConfigData;->client_ip:Ljava/lang/String;

    return-object v0
.end method

.method public getFirst_screen_ad_interaction()Lcom/join/mgps/dto/FirstScreenAdInteractionBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/ConfigData;->first_screen_ad_interaction:Lcom/join/mgps/dto/FirstScreenAdInteractionBean;

    return-object v0
.end method

.method public getFound_game_tab()Lcom/join/mgps/dto/FoundGameTabBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/ConfigData;->found_game_tab:Lcom/join/mgps/dto/FoundGameTabBean;

    return-object v0
.end method

.method public getNet_game_count_down()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/ConfigData;->net_game_count_down:I

    return v0
.end method

.method public getPd_ad_cfg()Lcom/join/mgps/dto/PdAdCfgBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/ConfigData;->pd_ad_cfg:Lcom/join/mgps/dto/PdAdCfgBean;

    return-object v0
.end method

.method public getReal_name_black_list()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/ConfigData;->real_name_black_list:Ljava/util/List;

    return-object v0
.end method

.method public getWeb_disk_cfg()Lcom/join/mgps/dto/WebDiskCfg;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/ConfigData;->web_disk_cfg:Lcom/join/mgps/dto/WebDiskCfg;

    return-object v0
.end method

.method public getWeb_disk_position()Lcom/join/mgps/dto/WebDiskPositionBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/ConfigData;->web_disk_position:Lcom/join/mgps/dto/WebDiskPositionBean;

    return-object v0
.end method

.method public getWx_open_appid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/ConfigData;->wx_open_appid:Ljava/lang/String;

    return-object v0
.end method

.method public isAnti_addiction_switch()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/dto/ConfigData;->anti_addiction_switch:Z

    return v0
.end method

.method public isB_side()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/dto/ConfigData;->b_side:Z

    return v0
.end method

.method public isDownload_game_switch()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/dto/ConfigData;->download_game_switch:Z

    return v0
.end method

.method public isHome_page_video_switch()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/dto/ConfigData;->home_page_video_switch:Z

    return v0
.end method

.method public isLaunch_game_switch()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/dto/ConfigData;->launch_game_switch:Z

    return v0
.end method

.method public isNon_online_user_switch()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/dto/ConfigData;->non_online_user_switch:Z

    return v0
.end method

.method public isUnknown_source_state()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/dto/ConfigData;->unknown_source_state:Z

    return v0
.end method

.method public isW_channel_info_switch()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/dto/ConfigData;->w_channel_info_switch:Z

    return v0
.end method

.method public setAnti_addiction_switch(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/dto/ConfigData;->anti_addiction_switch:Z

    return-void
.end method

.method public setB_side(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/dto/ConfigData;->b_side:Z

    return-void
.end method

.method public setClient_ip(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/ConfigData;->client_ip:Ljava/lang/String;

    return-void
.end method

.method public setDownload_game_switch(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/dto/ConfigData;->download_game_switch:Z

    return-void
.end method

.method public setFirst_screen_ad_interaction(Lcom/join/mgps/dto/FirstScreenAdInteractionBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/ConfigData;->first_screen_ad_interaction:Lcom/join/mgps/dto/FirstScreenAdInteractionBean;

    return-void
.end method

.method public setFound_game_tab(Lcom/join/mgps/dto/FoundGameTabBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/ConfigData;->found_game_tab:Lcom/join/mgps/dto/FoundGameTabBean;

    return-void
.end method

.method public setHome_page_video_switch(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/dto/ConfigData;->home_page_video_switch:Z

    return-void
.end method

.method public setLaunch_game_switch(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/dto/ConfigData;->launch_game_switch:Z

    return-void
.end method

.method public setNet_game_count_down(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/ConfigData;->net_game_count_down:I

    return-void
.end method

.method public setNon_online_user_switch(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/dto/ConfigData;->non_online_user_switch:Z

    return-void
.end method

.method public setPd_ad_cfg(Lcom/join/mgps/dto/PdAdCfgBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/ConfigData;->pd_ad_cfg:Lcom/join/mgps/dto/PdAdCfgBean;

    return-void
.end method

.method public setReal_name_black_list(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/ConfigData;->real_name_black_list:Ljava/util/List;

    return-void
.end method

.method public setUnknown_source_state(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/dto/ConfigData;->unknown_source_state:Z

    return-void
.end method

.method public setW_channel_info_switch(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/dto/ConfigData;->w_channel_info_switch:Z

    return-void
.end method

.method public setWeb_disk_cfg(Lcom/join/mgps/dto/WebDiskCfg;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/ConfigData;->web_disk_cfg:Lcom/join/mgps/dto/WebDiskCfg;

    return-void
.end method

.method public setWeb_disk_position(Lcom/join/mgps/dto/WebDiskPositionBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/ConfigData;->web_disk_position:Lcom/join/mgps/dto/WebDiskPositionBean;

    return-void
.end method

.method public setWx_open_appid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/ConfigData;->wx_open_appid:Ljava/lang/String;

    return-void
.end method
