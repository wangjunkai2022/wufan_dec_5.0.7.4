.class Lcom/join/mgps/activity/MGMainActivity$b;
.super Ljava/lang/Object;
.source "MGMainActivity.java"

# interfaces
.implements Lretrofit2/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/MGMainActivity;->loadIpAddress()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lretrofit2/Callback<",
        "Lcom/join/mgps/dto/ResponseModel<",
        "Lcom/join/mgps/dto/ConfigData;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/MGMainActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/MGMainActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/MGMainActivity$b;->b:Lcom/join/mgps/activity/MGMainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/ConfigData;",
            ">;>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    return-void
.end method

.method public onResponse(Lretrofit2/Call;Lretrofit2/Response;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/ConfigData;",
            ">;>;",
            "Lretrofit2/Response<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/ConfigData;",
            ">;>;)V"
        }
    .end annotation

    if-eqz p2, :cond_b

    .line 1
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_b

    .line 2
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/ResponseModel;

    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/ConfigData;

    if-eqz p1, :cond_b

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/dto/ConfigData;->getClient_ip()Ljava/lang/String;

    move-result-object p2

    .line 4
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/MGMainActivity$b;->b:Lcom/join/mgps/activity/MGMainActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/MGMainActivity;->prefDef:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->launch_game_switch()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/mgps/dto/ConfigData;->isLaunch_game_switch()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/MGMainActivity$b;->b:Lcom/join/mgps/activity/MGMainActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/MGMainActivity;->prefDef:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->download_game_switch()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/mgps/dto/ConfigData;->isDownload_game_switch()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/MGMainActivity$b;->b:Lcom/join/mgps/activity/MGMainActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/MGMainActivity;->prefDef:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->non_online_user_switch()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/mgps/dto/ConfigData;->isNon_online_user_switch()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/MGMainActivity$b;->b:Lcom/join/mgps/activity/MGMainActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/MGMainActivity;->prefDef:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->androidIdNullsKey()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v1

    invoke-virtual {p1}, Lcom/join/mgps/dto/ConfigData;->getReal_name_black_list()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/android/app/common/utils/JsonMapper;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/MGMainActivity$b;->b:Lcom/join/mgps/activity/MGMainActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/MGMainActivity;->prefDef:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->wx_open_appid()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/mgps/dto/ConfigData;->getWx_open_appid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/MGMainActivity$b;->b:Lcom/join/mgps/activity/MGMainActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/MGMainActivity;->prefDef:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->isHomepagePlayVideo()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/mgps/dto/ConfigData;->isHome_page_video_switch()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/MGMainActivity$b;->b:Lcom/join/mgps/activity/MGMainActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/MGMainActivity;->prefDef:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->net_game_count_down()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/mgps/dto/ConfigData;->getNet_game_count_down()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 11
    iget-object v0, p0, Lcom/join/mgps/activity/MGMainActivity$b;->b:Lcom/join/mgps/activity/MGMainActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/MGMainActivity;->prefDef:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->show_unknown_source()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/mgps/dto/ConfigData;->isUnknown_source_state()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 12
    invoke-virtual {p1}, Lcom/join/mgps/dto/ConfigData;->getFirst_screen_ad_interaction()Lcom/join/mgps/dto/FirstScreenAdInteractionBean;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 13
    iget-object v0, p0, Lcom/join/mgps/activity/MGMainActivity$b;->b:Lcom/join/mgps/activity/MGMainActivity;

    invoke-static {v0}, Lcom/papa/sim/statistic/pref/b;->k(Landroid/content/Context;)Lcom/papa/sim/statistic/pref/b;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/mgps/dto/ConfigData;->getFirst_screen_ad_interaction()Lcom/join/mgps/dto/FirstScreenAdInteractionBean;

    move-result-object v1

    invoke-static {v1}, Lcom/join/android/app/common/utils/JsonMapper;->toJsonString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/papa/sim/statistic/pref/b;->y(Ljava/lang/String;)V

    :cond_0
    const-string v0, "UTF-8"

    .line 14
    invoke-static {p2, v0}, Lcom/join/mgps/Util/a;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 15
    sget-object v0, Lcom/MApplication;->B:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 16
    sput-object p2, Lcom/MApplication;->B:Ljava/lang/String;

    .line 17
    :cond_1
    iget-object p2, p0, Lcom/join/mgps/activity/MGMainActivity$b;->b:Lcom/join/mgps/activity/MGMainActivity;

    iget-object p2, p2, Lcom/join/mgps/activity/MGMainActivity;->prefDef:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p2}, Lcom/join/mgps/pref/PrefDef_;->w_channel_info_switch()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object p2

    invoke-virtual {p1}, Lcom/join/mgps/dto/ConfigData;->isW_channel_info_switch()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p2, v0}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 18
    invoke-virtual {p1}, Lcom/join/mgps/dto/ConfigData;->getPd_ad_cfg()Lcom/join/mgps/dto/PdAdCfgBean;

    move-result-object p2

    if-eqz p2, :cond_4

    .line 19
    iget-object v0, p0, Lcom/join/mgps/activity/MGMainActivity$b;->b:Lcom/join/mgps/activity/MGMainActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/MGMainActivity;->prefDef:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->pd_ad_config()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 20
    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz v1, :cond_3

    .line 21
    :try_start_1
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v1

    const-class v2, Lcom/join/mgps/dto/PdAdCfgBean;

    invoke-virtual {v1, v0, v2}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/PdAdCfgBean;

    if-eqz v0, :cond_2

    .line 22
    invoke-virtual {v0}, Lcom/join/mgps/dto/PdAdCfgBean;->getLastUpdateConfigTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/join/mgps/Util/y;->u(J)Z

    move-result v0

    if-nez v0, :cond_5

    .line 23
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Lcom/join/mgps/dto/PdAdCfgBean;->setLastUpdateConfigTime(J)V

    .line 24
    iget-object v0, p0, Lcom/join/mgps/activity/MGMainActivity$b;->b:Lcom/join/mgps/activity/MGMainActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/MGMainActivity;->prefDef:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->pd_ad_config()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    invoke-static {p2}, Lcom/join/android/app/common/utils/JsonMapper;->toJsonString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 25
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 26
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Lcom/join/mgps/dto/PdAdCfgBean;->setLastUpdateConfigTime(J)V

    .line 27
    iget-object v0, p0, Lcom/join/mgps/activity/MGMainActivity$b;->b:Lcom/join/mgps/activity/MGMainActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/MGMainActivity;->prefDef:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->pd_ad_config()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    invoke-static {p2}, Lcom/join/android/app/common/utils/JsonMapper;->toJsonString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    goto :goto_0

    .line 28
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Lcom/join/mgps/dto/PdAdCfgBean;->setLastUpdateConfigTime(J)V

    .line 29
    iget-object v0, p0, Lcom/join/mgps/activity/MGMainActivity$b;->b:Lcom/join/mgps/activity/MGMainActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/MGMainActivity;->prefDef:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->pd_ad_config()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    invoke-static {p2}, Lcom/join/android/app/common/utils/JsonMapper;->toJsonString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    goto :goto_0

    .line 30
    :cond_4
    iget-object p2, p0, Lcom/join/mgps/activity/MGMainActivity$b;->b:Lcom/join/mgps/activity/MGMainActivity;

    iget-object p2, p2, Lcom/join/mgps/activity/MGMainActivity;->prefDef:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p2}, Lcom/join/mgps/pref/PrefDef_;->pd_ad_config()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object p2

    const-string v0, ""

    invoke-virtual {p2, v0}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 31
    :cond_5
    :goto_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/ConfigData;->getFound_game_tab()Lcom/join/mgps/dto/FoundGameTabBean;

    move-result-object p2

    if-eqz p2, :cond_6

    .line 32
    iget-object p2, p0, Lcom/join/mgps/activity/MGMainActivity$b;->b:Lcom/join/mgps/activity/MGMainActivity;

    iget-object p2, p2, Lcom/join/mgps/activity/MGMainActivity;->prefDef:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p2}, Lcom/join/mgps/pref/PrefDef_;->found_game_tab()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object p2

    invoke-virtual {p1}, Lcom/join/mgps/dto/ConfigData;->getFound_game_tab()Lcom/join/mgps/dto/FoundGameTabBean;

    move-result-object v0

    invoke-static {v0}, Lcom/join/android/app/common/utils/JsonMapper;->toJsonString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 33
    invoke-virtual {p1}, Lcom/join/mgps/dto/ConfigData;->getFound_game_tab()Lcom/join/mgps/dto/FoundGameTabBean;

    move-result-object p2

    invoke-virtual {p2}, Lcom/join/mgps/dto/FoundGameTabBean;->getTips_info()Lcom/join/mgps/dto/TipsInfoBean;

    move-result-object p2

    if-eqz p2, :cond_6

    .line 34
    iget-object v0, p0, Lcom/join/mgps/activity/MGMainActivity$b;->b:Lcom/join/mgps/activity/MGMainActivity;

    invoke-virtual {v0, p2}, Lcom/join/mgps/activity/MGMainActivity;->updateFindGameRetHot(Lcom/join/mgps/dto/TipsInfoBean;)V

    .line 35
    :cond_6
    invoke-virtual {p1}, Lcom/join/mgps/dto/ConfigData;->getWeb_disk_cfg()Lcom/join/mgps/dto/WebDiskCfg;

    move-result-object p2

    if-eqz p2, :cond_9

    .line 36
    iget-object p2, p0, Lcom/join/mgps/activity/MGMainActivity$b;->b:Lcom/join/mgps/activity/MGMainActivity;

    iget-object p2, p2, Lcom/join/mgps/activity/MGMainActivity;->prefDef:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p2}, Lcom/join/mgps/pref/PrefDef_;->ab_side()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object p2

    invoke-virtual {p1}, Lcom/join/mgps/dto/ConfigData;->getWeb_disk_cfg()Lcom/join/mgps/dto/WebDiskCfg;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/WebDiskCfg;->getAb_side()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2, v0}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 37
    invoke-virtual {p1}, Lcom/join/mgps/dto/ConfigData;->getWeb_disk_cfg()Lcom/join/mgps/dto/WebDiskCfg;

    move-result-object p2

    invoke-virtual {p2}, Lcom/join/mgps/dto/WebDiskCfg;->getAb_side()I

    move-result p2

    const/4 v0, 0x2

    if-nez p2, :cond_7

    .line 38
    iget-object p2, p0, Lcom/join/mgps/activity/MGMainActivity$b;->b:Lcom/join/mgps/activity/MGMainActivity;

    iget-object p2, p2, Lcom/join/mgps/activity/MGMainActivity;->prefDef:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p2}, Lcom/join/mgps/pref/PrefDef_;->isBsideInt()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object p2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2, v0}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    goto :goto_2

    .line 39
    :cond_7
    iget-object p2, p0, Lcom/join/mgps/activity/MGMainActivity$b;->b:Lcom/join/mgps/activity/MGMainActivity;

    iget-object p2, p2, Lcom/join/mgps/activity/MGMainActivity;->prefDef:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p2}, Lcom/join/mgps/pref/PrefDef_;->isBsideInt()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object p2

    invoke-virtual {p1}, Lcom/join/mgps/dto/ConfigData;->isB_side()Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_1

    :cond_8
    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2, v0}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 40
    :goto_2
    iget-object p2, p0, Lcom/join/mgps/activity/MGMainActivity$b;->b:Lcom/join/mgps/activity/MGMainActivity;

    iget-object p2, p2, Lcom/join/mgps/activity/MGMainActivity;->prefDef:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p2}, Lcom/join/mgps/pref/PrefDef_;->web_disk_cfg()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object p2

    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/mgps/dto/ConfigData;->getWeb_disk_cfg()Lcom/join/mgps/dto/WebDiskCfg;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/android/app/common/utils/JsonMapper;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 41
    iget-object p2, p0, Lcom/join/mgps/activity/MGMainActivity$b;->b:Lcom/join/mgps/activity/MGMainActivity;

    iget-object p2, p2, Lcom/join/mgps/activity/MGMainActivity;->prefDef:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p2}, Lcom/join/mgps/pref/PrefDef_;->quark_display_mode()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object p2

    invoke-virtual {p1}, Lcom/join/mgps/dto/ConfigData;->getWeb_disk_cfg()Lcom/join/mgps/dto/WebDiskCfg;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/WebDiskCfg;->getKk_ico_display()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2, v0}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 42
    :cond_9
    invoke-virtual {p1}, Lcom/join/mgps/dto/ConfigData;->getWeb_disk_position()Lcom/join/mgps/dto/WebDiskPositionBean;

    move-result-object p2

    if-eqz p2, :cond_a

    .line 43
    iget-object p2, p0, Lcom/join/mgps/activity/MGMainActivity$b;->b:Lcom/join/mgps/activity/MGMainActivity;

    iget-object p2, p2, Lcom/join/mgps/activity/MGMainActivity;->prefDef:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p2}, Lcom/join/mgps/pref/PrefDef_;->web_disk_position()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object p2

    invoke-virtual {p1}, Lcom/join/mgps/dto/ConfigData;->getWeb_disk_position()Lcom/join/mgps/dto/WebDiskPositionBean;

    move-result-object p1

    invoke-static {p1}, Lcom/join/android/app/common/utils/JsonMapper;->toJsonString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 44
    :cond_a
    iget-object p1, p0, Lcom/join/mgps/activity/MGMainActivity$b;->b:Lcom/join/mgps/activity/MGMainActivity;

    invoke-virtual {p1}, Lcom/join/mgps/activity/MGMainActivity;->addShortCuts()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_3

    :catch_1
    move-exception p1

    .line 45
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_b
    :goto_3
    return-void
.end method
