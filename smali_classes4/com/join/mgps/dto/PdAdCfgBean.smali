.class public Lcom/join/mgps/dto/PdAdCfgBean;
.super Ljava/lang/Object;
.source "PdAdCfgBean.java"


# instance fields
.field private download_limit:I

.field private download_show_times:I

.field private lastUpdateConfigTime:J

.field private simulator_startup_popup_limit:I

.field private simulator_startup_show_times:I

.field private single_show_times:I

.field private single_startup_limit:I

.field private startup_limit:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static convertStr2Bean(Ljava/lang/String;)Lcom/join/mgps/dto/PdAdCfgBean;
    .locals 3

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    .line 2
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v0

    const-class v2, Lcom/join/mgps/dto/PdAdCfgBean;

    invoke-virtual {v0, p0, v2}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/join/mgps/dto/PdAdCfgBean;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, p0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 3
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-object v1
.end method


# virtual methods
.method public canShowDownload()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/PdAdCfgBean;->download_show_times:I

    iget v1, p0, Lcom/join/mgps/dto/PdAdCfgBean;->download_limit:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public canShowSimulatorPopup()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/PdAdCfgBean;->simulator_startup_show_times:I

    iget v1, p0, Lcom/join/mgps/dto/PdAdCfgBean;->simulator_startup_popup_limit:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public canShowSingleStartUp()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/PdAdCfgBean;->single_show_times:I

    iget v1, p0, Lcom/join/mgps/dto/PdAdCfgBean;->single_startup_limit:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public canShowStartUp(I)Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/PdAdCfgBean;->startup_limit:I

    if-ge p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public getDownload_limit()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/PdAdCfgBean;->download_limit:I

    return v0
.end method

.method public getDownload_show_times()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/PdAdCfgBean;->download_show_times:I

    return v0
.end method

.method public getLastUpdateConfigTime()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/join/mgps/dto/PdAdCfgBean;->lastUpdateConfigTime:J

    return-wide v0
.end method

.method public getSimulator_startup_popup_limit()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/PdAdCfgBean;->simulator_startup_popup_limit:I

    return v0
.end method

.method public getSimulator_startup_show_times()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/PdAdCfgBean;->simulator_startup_show_times:I

    return v0
.end method

.method public getSingle_show_times()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/PdAdCfgBean;->single_show_times:I

    return v0
.end method

.method public getSingle_startup_limit()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/PdAdCfgBean;->single_startup_limit:I

    return v0
.end method

.method public getStartup_limit()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/PdAdCfgBean;->startup_limit:I

    return v0
.end method

.method public setDownload_limit(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/PdAdCfgBean;->download_limit:I

    return-void
.end method

.method public setDownload_show_times(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/PdAdCfgBean;->download_show_times:I

    return-void
.end method

.method public setLastUpdateConfigTime(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/join/mgps/dto/PdAdCfgBean;->lastUpdateConfigTime:J

    return-void
.end method

.method public setSimulator_startup_popup_limit(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/PdAdCfgBean;->simulator_startup_popup_limit:I

    return-void
.end method

.method public setSimulator_startup_show_times(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/PdAdCfgBean;->simulator_startup_show_times:I

    return-void
.end method

.method public setSingle_show_times(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/PdAdCfgBean;->single_show_times:I

    return-void
.end method

.method public setSingle_startup_limit(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/PdAdCfgBean;->single_startup_limit:I

    return-void
.end method

.method public setStartup_limit(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/PdAdCfgBean;->startup_limit:I

    return-void
.end method

.method public updateDownloadShowTimes()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/PdAdCfgBean;->download_show_times:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/join/mgps/dto/PdAdCfgBean;->download_show_times:I

    .line 2
    sget-object v0, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {v0}, Lcom/MApplication;->l()Lcom/join/mgps/pref/PrefDef_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->pd_ad_config()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    invoke-static {p0}, Lcom/join/android/app/common/utils/JsonMapper;->toJsonString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    return-void
.end method

.method public updateSimulatorPopupShowTimes()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/PdAdCfgBean;->simulator_startup_show_times:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/join/mgps/dto/PdAdCfgBean;->simulator_startup_show_times:I

    .line 2
    sget-object v0, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {v0}, Lcom/MApplication;->l()Lcom/join/mgps/pref/PrefDef_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->pd_ad_config()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    invoke-static {p0}, Lcom/join/android/app/common/utils/JsonMapper;->toJsonString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    return-void
.end method

.method public updateSingleShowTimes()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/PdAdCfgBean;->single_show_times:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/join/mgps/dto/PdAdCfgBean;->single_show_times:I

    .line 2
    sget-object v0, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {v0}, Lcom/MApplication;->l()Lcom/join/mgps/pref/PrefDef_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->pd_ad_config()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    invoke-static {p0}, Lcom/join/android/app/common/utils/JsonMapper;->toJsonString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    return-void
.end method
