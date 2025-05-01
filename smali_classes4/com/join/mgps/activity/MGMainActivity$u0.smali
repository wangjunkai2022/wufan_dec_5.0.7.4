.class Lcom/join/mgps/activity/MGMainActivity$u0;
.super Landroid/content/BroadcastReceiver;
.source "MGMainActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/MGMainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "u0"
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/MGMainActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/MGMainActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/MGMainActivity$u0;->a:Lcom/join/mgps/activity/MGMainActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 25

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    const-string v3, "lastTime"

    const-string v4, "action"

    const/4 v5, 0x0

    .line 1
    invoke-virtual {v2, v4, v5}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v4

    const-string v6, "url"

    const-string v7, "adSdkType"

    const/4 v8, 0x4

    const-string v9, "adAction"

    const-string v10, "com.emu.ad.result"

    const-string v12, "adCount"

    const-string v13, "gameId"

    const-string v14, "howTimes"

    const/4 v15, 0x2

    const/4 v11, 0x1

    if-nez v4, :cond_d

    .line 2
    iget-object v3, v1, Lcom/join/mgps/activity/MGMainActivity$u0;->a:Lcom/join/mgps/activity/MGMainActivity;

    invoke-static {v3}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v2, "\u8bf7\u8054\u7f51\u540e\u91cd\u8bd5\uff01"

    .line 3
    invoke-static {v0, v2, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 4
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 5
    invoke-virtual {v0, v10}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const/16 v2, 0x8

    .line 6
    invoke-virtual {v0, v9, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 7
    iget-object v2, v1, Lcom/join/mgps/activity/MGMainActivity$u0;->a:Lcom/join/mgps/activity/MGMainActivity;

    invoke-virtual {v2, v0}, Landroid/app/Activity;->sendBroadcast(Landroid/content/Intent;)V

    return-void

    .line 8
    :cond_0
    iget-object v0, v1, Lcom/join/mgps/activity/MGMainActivity$u0;->a:Lcom/join/mgps/activity/MGMainActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/MGMainActivity;->prefDef:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->isShowVideo()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 9
    invoke-virtual {v2, v14, v5}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    .line 10
    invoke-virtual {v2, v12, v5}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v4

    .line 11
    invoke-virtual {v2, v7, v11}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v5

    .line 12
    invoke-virtual {v2, v13}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v0, :cond_1

    .line 13
    sget-object v0, Lcom/MApplication;->p1:Lcom/join/mgps/dto/PublicVideoCfgBean;

    if-eqz v0, :cond_1

    .line 14
    iget-object v0, v1, Lcom/join/mgps/activity/MGMainActivity$u0;->a:Lcom/join/mgps/activity/MGMainActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/MGMainActivity;->prefDef:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->isShowVideo()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v0

    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v8}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 15
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 16
    invoke-virtual {v0, v10}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const/16 v8, 0x62

    .line 17
    invoke-virtual {v0, v9, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 18
    sget-object v8, Lcom/MApplication;->p1:Lcom/join/mgps/dto/PublicVideoCfgBean;

    invoke-virtual {v8}, Lcom/join/mgps/dto/PublicVideoCfgBean;->getV_switch()I

    move-result v8

    const-string v9, "V_switch"

    invoke-virtual {v0, v9, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 19
    sget-object v8, Lcom/MApplication;->p1:Lcom/join/mgps/dto/PublicVideoCfgBean;

    invoke-virtual {v8}, Lcom/join/mgps/dto/PublicVideoCfgBean;->getUrl()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v6, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 20
    sget-object v6, Lcom/MApplication;->p1:Lcom/join/mgps/dto/PublicVideoCfgBean;

    invoke-virtual {v6}, Lcom/join/mgps/dto/PublicVideoCfgBean;->getTimes()I

    move-result v6

    const-string v8, "time"

    invoke-virtual {v0, v8, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 21
    invoke-virtual {v0, v14, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 22
    invoke-virtual {v0, v12, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 23
    invoke-virtual {v0, v7, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 24
    invoke-virtual {v0, v13, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 25
    iget-object v2, v1, Lcom/join/mgps/activity/MGMainActivity$u0;->a:Lcom/join/mgps/activity/MGMainActivity;

    invoke-virtual {v2, v0}, Landroid/app/Activity;->sendBroadcast(Landroid/content/Intent;)V

    return-void

    .line 26
    :cond_1
    iget-object v0, v1, Lcom/join/mgps/activity/MGMainActivity$u0;->a:Lcom/join/mgps/activity/MGMainActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/MGMainActivity;->prefDef:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->arcadeGameAdCfg()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 27
    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_c

    .line 28
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v6

    const-class v7, Lcom/join/mgps/dto/ArcadeGameAdCfgBean;

    invoke-virtual {v6, v0, v7}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/ArcadeGameAdCfgBean;

    if-eqz v0, :cond_c

    if-nez v4, :cond_2

    .line 29
    invoke-virtual {v0}, Lcom/join/mgps/dto/ArcadeGameAdCfgBean;->getPlay_cfg()Lcom/join/mgps/dto/PlayCfgV2Bean;

    move-result-object v6

    invoke-virtual {v6}, Lcom/join/mgps/dto/PlayCfgV2Bean;->getFirst_random_list()Ljava/util/ArrayList;

    move-result-object v6

    if-nez v6, :cond_3

    .line 30
    invoke-virtual {v0}, Lcom/join/mgps/dto/ArcadeGameAdCfgBean;->getPlay_cfg()Lcom/join/mgps/dto/PlayCfgV2Bean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/PlayCfgV2Bean;->getSecond_fixed_list()Ljava/util/ArrayList;

    move-result-object v6

    goto :goto_0

    .line 31
    :cond_2
    invoke-virtual {v0}, Lcom/join/mgps/dto/ArcadeGameAdCfgBean;->getPlay_cfg()Lcom/join/mgps/dto/PlayCfgV2Bean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/PlayCfgV2Bean;->getSecond_fixed_list()Ljava/util/ArrayList;

    move-result-object v6

    .line 32
    :cond_3
    :goto_0
    iget-object v0, v1, Lcom/join/mgps/activity/MGMainActivity$u0;->a:Lcom/join/mgps/activity/MGMainActivity;

    invoke-static {v0, v6, v5}, Lcom/join/mgps/activity/MGMainActivity;->access$1900(Lcom/join/mgps/activity/MGMainActivity;Ljava/util/List;I)Lcom/join/mgps/dto/PlayCfgBean;

    move-result-object v0

    if-eqz v0, :cond_c

    .line 33
    invoke-virtual {v0}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_type()I

    move-result v5

    if-ne v5, v11, :cond_5

    .line 34
    iget-object v5, v1, Lcom/join/mgps/activity/MGMainActivity$u0;->a:Lcom/join/mgps/activity/MGMainActivity;

    iget-object v6, v5, Lcom/join/mgps/activity/MGMainActivity;->ttAdVideo:Lcom/join/mgps/ad/z;

    if-nez v6, :cond_4

    .line 35
    invoke-virtual {v0}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_key()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/join/mgps/dto/PlayCfgBean;->getAd_id()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v2, v0, v11}, Lcom/join/mgps/activity/MGMainActivity;->initTTAd(Ljava/lang/String;Ljava/lang/String;Z)V

    goto/16 :goto_1

    .line 36
    :cond_4
    invoke-virtual {v6, v5, v2, v3, v4}, Lcom/join/mgps/ad/d;->s(Landroid/app/Activity;Ljava/lang/String;II)V

    goto/16 :goto_1

    .line 37
    :cond_5
    invoke-virtual {v0}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_type()I

    move-result v5

    if-ne v5, v15, :cond_7

    .line 38
    iget-object v5, v1, Lcom/join/mgps/activity/MGMainActivity$u0;->a:Lcom/join/mgps/activity/MGMainActivity;

    iget-object v6, v5, Lcom/join/mgps/activity/MGMainActivity;->gdtAdVideo:Lcom/join/mgps/ad/h;

    if-nez v6, :cond_6

    .line 39
    invoke-virtual {v0}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_key()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v0}, Lcom/join/mgps/dto/PlayCfgBean;->getAd_id()Ljava/lang/String;

    move-result-object v18

    const/16 v22, 0x1

    move-object/from16 v16, v5

    move-object/from16 v19, v2

    move/from16 v20, v3

    move/from16 v21, v4

    invoke-virtual/range {v16 .. v22}, Lcom/join/mgps/activity/MGMainActivity;->initGDTAd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZ)V

    goto :goto_1

    .line 40
    :cond_6
    invoke-virtual {v6, v5, v2, v3, v4}, Lcom/join/mgps/ad/d;->s(Landroid/app/Activity;Ljava/lang/String;II)V

    goto :goto_1

    .line 41
    :cond_7
    invoke-virtual {v0}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_type()I

    move-result v5

    if-ne v5, v8, :cond_8

    goto :goto_1

    .line 42
    :cond_8
    invoke-virtual {v0}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_type()I

    move-result v5

    const/4 v6, 0x7

    if-ne v5, v6, :cond_a

    .line 43
    iget-object v5, v1, Lcom/join/mgps/activity/MGMainActivity$u0;->a:Lcom/join/mgps/activity/MGMainActivity;

    iget-object v6, v5, Lcom/join/mgps/activity/MGMainActivity;->groMAdVideo:Lcom/join/mgps/ad/l;

    if-nez v6, :cond_9

    .line 44
    invoke-virtual {v0}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_key()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v0}, Lcom/join/mgps/dto/PlayCfgBean;->getAd_id()Ljava/lang/String;

    move-result-object v18

    const/16 v22, 0x1

    move-object/from16 v16, v5

    move-object/from16 v19, v2

    move/from16 v20, v3

    move/from16 v21, v4

    invoke-virtual/range {v16 .. v22}, Lcom/join/mgps/activity/MGMainActivity;->initGroMTTAd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZ)V

    goto :goto_1

    .line 45
    :cond_9
    invoke-virtual {v6, v5, v2, v3, v4}, Lcom/join/mgps/ad/d;->s(Landroid/app/Activity;Ljava/lang/String;II)V

    goto :goto_1

    .line 46
    :cond_a
    invoke-virtual {v0}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_type()I

    move-result v5

    const/16 v6, 0x9

    if-ne v5, v6, :cond_c

    .line 47
    iget-object v5, v1, Lcom/join/mgps/activity/MGMainActivity$u0;->a:Lcom/join/mgps/activity/MGMainActivity;

    iget-object v6, v5, Lcom/join/mgps/activity/MGMainActivity;->reAdVideo:Lcom/join/mgps/ad/s;

    if-nez v6, :cond_b

    .line 48
    invoke-virtual {v0}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_key()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v0}, Lcom/join/mgps/dto/PlayCfgBean;->getAd_id()Ljava/lang/String;

    move-result-object v18

    const/16 v22, 0x1

    move-object/from16 v16, v5

    move-object/from16 v19, v2

    move/from16 v20, v3

    move/from16 v21, v4

    invoke-virtual/range {v16 .. v22}, Lcom/join/mgps/activity/MGMainActivity;->initREAd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZ)V

    goto :goto_1

    .line 49
    :cond_b
    invoke-virtual {v6, v5, v2, v3, v4}, Lcom/join/mgps/ad/d;->s(Landroid/app/Activity;Ljava/lang/String;II)V

    .line 50
    :cond_c
    :goto_1
    iget-object v0, v1, Lcom/join/mgps/activity/MGMainActivity$u0;->a:Lcom/join/mgps/activity/MGMainActivity;

    invoke-static {v0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v2, Lcom/papa/sim/statistic/Event;->onAdvert31:Lcom/papa/sim/statistic/Event;

    new-instance v3, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v3}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {v0, v2, v3}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto/16 :goto_10

    :cond_d
    if-ne v4, v11, :cond_e

    .line 51
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/join/mgps/Util/IntentUtil;->goVip(Landroid/content/Context;)V

    goto/16 :goto_10

    :cond_e
    const-string v8, ""

    if-ne v4, v15, :cond_28

    const-string v4, "plugNum"

    .line 52
    invoke-virtual {v2, v4, v5}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 53
    invoke-virtual {v2, v13}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 54
    iget-object v4, v1, Lcom/join/mgps/activity/MGMainActivity$u0;->a:Lcom/join/mgps/activity/MGMainActivity;

    iget-object v4, v4, Lcom/join/mgps/activity/MGMainActivity;->prefDef:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v4}, Lcom/join/mgps/pref/PrefDef_;->arcadeGameAdCfg()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v4

    invoke-virtual {v4}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 55
    invoke-static {v4}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_36

    .line 56
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v6

    const-class v13, Lcom/join/mgps/dto/ArcadeGameAdCfgBean;

    invoke-virtual {v6, v4, v13}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/ArcadeGameAdCfgBean;

    if-eqz v4, :cond_27

    .line 57
    invoke-virtual {v4}, Lcom/join/mgps/dto/ArcadeGameAdCfgBean;->getSwitch_state()I

    move-result v6

    if-ne v6, v11, :cond_27

    const-wide/16 v18, 0x0

    .line 58
    new-instance v6, Lcom/papa91/wrapper/UserPrefs;

    invoke-direct {v6, v0}, Lcom/papa91/wrapper/UserPrefs;-><init>(Landroid/content/Context;)V

    .line 59
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v13, v1, Lcom/join/mgps/activity/MGMainActivity$u0;->a:Lcom/join/mgps/activity/MGMainActivity;

    invoke-static {v13}, Lcom/join/mgps/activity/MGMainActivity;->access$2000(Lcom/join/mgps/activity/MGMainActivity;)Lcom/wufan/user/service/protobuf/n0;

    move-result-object v13

    invoke-virtual {v13}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v13

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v2, v0}, Lcom/papa91/wrapper/UserPrefs;->getFbaAdGamesConfig(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 60
    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_12

    .line 61
    :try_start_0
    new-instance v13, Lorg/json/JSONObject;

    invoke-direct {v13, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 62
    invoke-virtual {v13, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 63
    invoke-virtual {v13, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v18

    goto :goto_2

    .line 64
    :cond_f
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v18

    .line 65
    :goto_2
    invoke-virtual {v13, v14}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 66
    invoke-virtual {v13, v14}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move v3, v0

    goto :goto_3

    :cond_10
    const/4 v3, 0x0

    .line 67
    :goto_3
    :try_start_1
    invoke-virtual {v13, v12}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 68
    invoke-virtual {v13, v12}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_5

    :catch_0
    move-exception v0

    goto :goto_4

    :catch_1
    move-exception v0

    const/4 v3, 0x0

    .line 69
    :goto_4
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_11
    const/4 v0, 0x0

    goto :goto_5

    :cond_12
    const/4 v0, 0x0

    const/4 v3, 0x0

    .line 70
    :goto_5
    invoke-static/range {v18 .. v19}, Lcom/join/mgps/Util/y;->u(J)Z

    move-result v13

    if-nez v13, :cond_13

    const/4 v0, 0x0

    const/4 v3, 0x0

    .line 71
    :cond_13
    invoke-virtual {v4}, Lcom/join/mgps/dto/ArcadeGameAdCfgBean;->getSwitch_state()I

    move-result v13

    if-ne v13, v11, :cond_14

    invoke-virtual {v4}, Lcom/join/mgps/dto/ArcadeGameAdCfgBean;->getDaily_times()I

    move-result v13

    if-ge v0, v13, :cond_14

    invoke-virtual {v4}, Lcom/join/mgps/dto/ArcadeGameAdCfgBean;->getHow_times()I

    move-result v13

    sub-int/2addr v13, v11

    if-lt v3, v13, :cond_14

    iget-object v13, v1, Lcom/join/mgps/activity/MGMainActivity$u0;->a:Lcom/join/mgps/activity/MGMainActivity;

    invoke-static {v13}, Lcom/join/mgps/activity/MGMainActivity;->access$2000(Lcom/join/mgps/activity/MGMainActivity;)Lcom/wufan/user/service/protobuf/n0;

    move-result-object v13

    invoke-static {v13}, Lcom/join/mgps/Util/b;->piv(Lcom/wufan/user/service/protobuf/n0;)Z

    move-result v13

    if-nez v13, :cond_14

    invoke-virtual {v4}, Lcom/join/mgps/dto/ArcadeGameAdCfgBean;->getHow_times()I

    move-result v13

    if-lez v13, :cond_14

    const/4 v13, 0x1

    goto :goto_6

    :cond_14
    const/4 v13, 0x0

    .line 72
    :goto_6
    iget-object v15, v1, Lcom/join/mgps/activity/MGMainActivity$u0;->a:Lcom/join/mgps/activity/MGMainActivity;

    invoke-static {v15}, Lcom/join/mgps/activity/MGMainActivity;->access$2100(Lcom/join/mgps/activity/MGMainActivity;)Ljava/lang/String;

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "onReceive: "

    invoke-virtual {v15, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    if-eqz v13, :cond_26

    const-string v5, "3051121204680401"

    if-nez v0, :cond_1c

    .line 73
    invoke-virtual {v4}, Lcom/join/mgps/dto/ArcadeGameAdCfgBean;->getPlay_cfg()Lcom/join/mgps/dto/PlayCfgV2Bean;

    move-result-object v13

    invoke-virtual {v13}, Lcom/join/mgps/dto/PlayCfgV2Bean;->getFirst_random_list()Ljava/util/ArrayList;

    move-result-object v13

    if-eqz v13, :cond_16

    .line 74
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v15

    if-lez v15, :cond_16

    .line 75
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 76
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_7
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_15

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v20

    check-cast v20, Lcom/join/mgps/dto/PlayCfgBean;

    .line 77
    invoke-virtual/range {v20 .. v20}, Lcom/join/mgps/dto/PlayCfgBean;->getProbability()Ljava/lang/String;

    move-result-object v20

    invoke-static/range {v20 .. v20}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v6

    invoke-interface {v15, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 78
    :cond_15
    invoke-static {v15}, Lcom/join/mgps/ad/p;->b(Ljava/util/List;)I

    move-result v6

    .line 79
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v15

    if-ge v6, v15, :cond_16

    .line 80
    invoke-interface {v13, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/join/mgps/dto/PlayCfgBean;

    goto :goto_8

    :cond_16
    const/4 v6, 0x0

    :goto_8
    if-eqz v6, :cond_25

    .line 81
    invoke-virtual {v6}, Lcom/join/mgps/dto/PlayCfgBean;->getAd_id()Ljava/lang/String;

    move-result-object v5

    .line 82
    invoke-virtual {v6}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_type()I

    move-result v13

    if-ne v13, v11, :cond_17

    .line 83
    iget-object v2, v1, Lcom/join/mgps/activity/MGMainActivity$u0;->a:Lcom/join/mgps/activity/MGMainActivity;

    invoke-virtual {v6}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_key()Ljava/lang/String;

    move-result-object v6

    const/4 v13, 0x0

    invoke-virtual {v2, v6, v5, v13}, Lcom/join/mgps/activity/MGMainActivity;->initTTAd(Ljava/lang/String;Ljava/lang/String;Z)V

    goto/16 :goto_f

    .line 84
    :cond_17
    invoke-virtual {v6}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_type()I

    move-result v13

    const/4 v15, 0x2

    if-ne v13, v15, :cond_18

    .line 85
    iget-object v11, v1, Lcom/join/mgps/activity/MGMainActivity$u0;->a:Lcom/join/mgps/activity/MGMainActivity;

    invoke-virtual {v6}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_key()Ljava/lang/String;

    move-result-object v19

    const/16 v24, 0x0

    move-object/from16 v18, v11

    move-object/from16 v20, v5

    move-object/from16 v21, v2

    move/from16 v22, v3

    move/from16 v23, v0

    invoke-virtual/range {v18 .. v24}, Lcom/join/mgps/activity/MGMainActivity;->initGDTAd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZ)V

    goto/16 :goto_d

    .line 86
    :cond_18
    invoke-virtual {v6}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_type()I

    move-result v13

    const/4 v15, 0x3

    if-ne v13, v15, :cond_19

    goto/16 :goto_f

    .line 87
    :cond_19
    invoke-virtual {v6}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_type()I

    move-result v13

    const/4 v15, 0x4

    if-ne v13, v15, :cond_1a

    goto/16 :goto_f

    .line 88
    :cond_1a
    invoke-virtual {v6}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_type()I

    move-result v13

    const/4 v15, 0x7

    if-ne v13, v15, :cond_1b

    .line 89
    iget-object v11, v1, Lcom/join/mgps/activity/MGMainActivity$u0;->a:Lcom/join/mgps/activity/MGMainActivity;

    invoke-virtual {v6}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_key()Ljava/lang/String;

    move-result-object v19

    const/16 v24, 0x0

    move-object/from16 v18, v11

    move-object/from16 v20, v5

    move-object/from16 v21, v2

    move/from16 v22, v3

    move/from16 v23, v0

    invoke-virtual/range {v18 .. v24}, Lcom/join/mgps/activity/MGMainActivity;->initGroMTTAd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZ)V

    goto/16 :goto_c

    .line 90
    :cond_1b
    invoke-virtual {v6}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_type()I

    move-result v13

    const/16 v15, 0x9

    if-ne v13, v15, :cond_25

    .line 91
    iget-object v11, v1, Lcom/join/mgps/activity/MGMainActivity$u0;->a:Lcom/join/mgps/activity/MGMainActivity;

    invoke-virtual {v6}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_key()Ljava/lang/String;

    move-result-object v19

    const/16 v24, 0x0

    move-object/from16 v18, v11

    move-object/from16 v20, v5

    move-object/from16 v21, v2

    move/from16 v22, v3

    move/from16 v23, v0

    invoke-virtual/range {v18 .. v24}, Lcom/join/mgps/activity/MGMainActivity;->initREAd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZ)V

    goto/16 :goto_b

    .line 92
    :cond_1c
    invoke-virtual {v4}, Lcom/join/mgps/dto/ArcadeGameAdCfgBean;->getPlay_cfg()Lcom/join/mgps/dto/PlayCfgV2Bean;

    move-result-object v6

    invoke-virtual {v6}, Lcom/join/mgps/dto/PlayCfgV2Bean;->getSecond_fixed_list()Ljava/util/ArrayList;

    move-result-object v6

    if-eqz v6, :cond_1e

    .line 93
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v13

    if-lez v13, :cond_1e

    .line 94
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 95
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_9
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_1d

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Lcom/join/mgps/dto/PlayCfgBean;

    .line 96
    invoke-virtual/range {v17 .. v17}, Lcom/join/mgps/dto/PlayCfgBean;->getProbability()Ljava/lang/String;

    move-result-object v17

    invoke-static/range {v17 .. v17}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v11

    invoke-interface {v13, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v11, 0x1

    goto :goto_9

    .line 97
    :cond_1d
    invoke-static {v13}, Lcom/join/mgps/ad/p;->b(Ljava/util/List;)I

    move-result v11

    .line 98
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v13

    if-ge v11, v13, :cond_1e

    .line 99
    invoke-interface {v6, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/join/mgps/dto/PlayCfgBean;

    goto :goto_a

    :cond_1e
    const/4 v6, 0x0

    :goto_a
    if-eqz v6, :cond_24

    .line 100
    invoke-virtual {v6}, Lcom/join/mgps/dto/PlayCfgBean;->getAd_id()Ljava/lang/String;

    move-result-object v5

    .line 101
    invoke-virtual {v6}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_type()I

    move-result v11

    const/4 v13, 0x1

    if-eq v11, v13, :cond_23

    const/4 v13, 0x2

    if-eq v11, v13, :cond_22

    const/4 v13, 0x4

    if-eq v11, v13, :cond_21

    const/4 v13, 0x7

    if-eq v11, v13, :cond_20

    const/16 v13, 0x9

    if-eq v11, v13, :cond_1f

    goto :goto_e

    .line 102
    :cond_1f
    iget-object v11, v1, Lcom/join/mgps/activity/MGMainActivity$u0;->a:Lcom/join/mgps/activity/MGMainActivity;

    invoke-virtual {v6}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_key()Ljava/lang/String;

    move-result-object v19

    const/16 v24, 0x0

    move-object/from16 v18, v11

    move-object/from16 v20, v5

    move-object/from16 v21, v2

    move/from16 v22, v3

    move/from16 v23, v0

    invoke-virtual/range {v18 .. v24}, Lcom/join/mgps/activity/MGMainActivity;->initREAd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZ)V

    :goto_b
    const/16 v11, 0x9

    goto :goto_f

    .line 103
    :cond_20
    iget-object v11, v1, Lcom/join/mgps/activity/MGMainActivity$u0;->a:Lcom/join/mgps/activity/MGMainActivity;

    invoke-virtual {v6}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_key()Ljava/lang/String;

    move-result-object v19

    const/16 v24, 0x0

    move-object/from16 v18, v11

    move-object/from16 v20, v5

    move-object/from16 v21, v2

    move/from16 v22, v3

    move/from16 v23, v0

    invoke-virtual/range {v18 .. v24}, Lcom/join/mgps/activity/MGMainActivity;->initGroMTTAd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZ)V

    :goto_c
    const/4 v11, 0x7

    goto :goto_f

    :cond_21
    const/4 v11, 0x4

    goto :goto_f

    .line 104
    :cond_22
    iget-object v11, v1, Lcom/join/mgps/activity/MGMainActivity$u0;->a:Lcom/join/mgps/activity/MGMainActivity;

    invoke-virtual {v6}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_key()Ljava/lang/String;

    move-result-object v19

    const/16 v24, 0x0

    move-object/from16 v18, v11

    move-object/from16 v20, v5

    move-object/from16 v21, v2

    move/from16 v22, v3

    move/from16 v23, v0

    invoke-virtual/range {v18 .. v24}, Lcom/join/mgps/activity/MGMainActivity;->initGDTAd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZ)V

    :goto_d
    const/4 v11, 0x2

    goto :goto_f

    .line 105
    :cond_23
    iget-object v2, v1, Lcom/join/mgps/activity/MGMainActivity$u0;->a:Lcom/join/mgps/activity/MGMainActivity;

    invoke-virtual {v6}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_key()Ljava/lang/String;

    move-result-object v6

    const/4 v11, 0x0

    invoke-virtual {v2, v6, v5, v11}, Lcom/join/mgps/activity/MGMainActivity;->initTTAd(Ljava/lang/String;Ljava/lang/String;Z)V

    :cond_24
    :goto_e
    const/4 v11, 0x1

    .line 106
    :cond_25
    :goto_f
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 107
    invoke-virtual {v2, v10}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const/16 v6, 0x63

    .line 108
    invoke-virtual {v2, v9, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 109
    invoke-virtual {v4}, Lcom/join/mgps/dto/ArcadeGameAdCfgBean;->getTip_text()Ljava/lang/String;

    move-result-object v6

    const-string v9, "content"

    invoke-virtual {v2, v9, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v6, "dialogUrl"

    .line 110
    invoke-virtual {v2, v6, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v6, "pic"

    .line 111
    invoke-virtual {v2, v6, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v6, "ad_id"

    .line 112
    invoke-virtual {v2, v6, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 113
    invoke-virtual {v4}, Lcom/join/mgps/dto/ArcadeGameAdCfgBean;->getL_btn_text()Ljava/lang/String;

    move-result-object v5

    const-string v6, "btn_l"

    invoke-virtual {v2, v6, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 114
    invoke-virtual {v4}, Lcom/join/mgps/dto/ArcadeGameAdCfgBean;->getR_btn_text()Ljava/lang/String;

    move-result-object v5

    const-string v6, "btn_r"

    invoke-virtual {v2, v6, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 115
    invoke-virtual {v4}, Lcom/join/mgps/dto/ArcadeGameAdCfgBean;->getL_btn_url()Ljava/lang/String;

    move-result-object v5

    const-string v6, "btn_url"

    invoke-virtual {v2, v6, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 116
    invoke-virtual {v4}, Lcom/join/mgps/dto/ArcadeGameAdCfgBean;->getDaily_times()I

    move-result v4

    sub-int/2addr v4, v0

    const-string v5, "times"

    invoke-virtual {v2, v5, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 117
    invoke-virtual {v2, v12, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 118
    invoke-virtual {v2, v14, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 119
    invoke-virtual {v2, v7, v11}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 120
    iget-object v0, v1, Lcom/join/mgps/activity/MGMainActivity$u0;->a:Lcom/join/mgps/activity/MGMainActivity;

    invoke-virtual {v0, v2}, Landroid/app/Activity;->sendBroadcast(Landroid/content/Intent;)V

    .line 121
    iget-object v0, v1, Lcom/join/mgps/activity/MGMainActivity$u0;->a:Lcom/join/mgps/activity/MGMainActivity;

    invoke-static {v0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v2, Lcom/papa/sim/statistic/Event;->showAdvert31:Lcom/papa/sim/statistic/Event;

    new-instance v3, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v3}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {v0, v2, v3}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto/16 :goto_10

    .line 122
    :cond_26
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 123
    invoke-virtual {v4, v10}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const/4 v5, 0x7

    .line 124
    invoke-virtual {v4, v9, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 125
    iget-object v5, v1, Lcom/join/mgps/activity/MGMainActivity$u0;->a:Lcom/join/mgps/activity/MGMainActivity;

    invoke-virtual {v5, v4}, Landroid/app/Activity;->sendBroadcast(Landroid/content/Intent;)V

    .line 126
    iget-object v4, v1, Lcom/join/mgps/activity/MGMainActivity$u0;->a:Lcom/join/mgps/activity/MGMainActivity;

    invoke-static {v4}, Lcom/join/mgps/activity/MGMainActivity;->access$2100(Lcom/join/mgps/activity/MGMainActivity;)Ljava/lang/String;

    .line 127
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, v1, Lcom/join/mgps/activity/MGMainActivity$u0;->a:Lcom/join/mgps/activity/MGMainActivity;

    invoke-static {v5}, Lcom/join/mgps/activity/MGMainActivity;->access$2000(Lcom/join/mgps/activity/MGMainActivity;)Lcom/wufan/user/service/protobuf/n0;

    move-result-object v5

    invoke-virtual {v5}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    add-int/2addr v3, v5

    invoke-virtual {v6, v2, v4, v3, v0}, Lcom/papa91/wrapper/UserPrefs;->setFbaAdGamesConfig(Ljava/lang/String;Ljava/lang/String;II)V

    goto/16 :goto_10

    .line 128
    :cond_27
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 129
    invoke-virtual {v0, v10}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const/4 v2, 0x7

    .line 130
    invoke-virtual {v0, v9, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 131
    iget-object v2, v1, Lcom/join/mgps/activity/MGMainActivity$u0;->a:Lcom/join/mgps/activity/MGMainActivity;

    invoke-virtual {v2, v0}, Landroid/app/Activity;->sendBroadcast(Landroid/content/Intent;)V

    goto/16 :goto_10

    :cond_28
    const/4 v3, 0x3

    if-ne v4, v3, :cond_2a

    .line 132
    invoke-virtual {v2, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "from"

    const/4 v4, 0x0

    .line 133
    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_29

    .line 134
    iget-object v2, v1, Lcom/join/mgps/activity/MGMainActivity$u0;->a:Lcom/join/mgps/activity/MGMainActivity;

    invoke-static {v2}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v2

    sget-object v3, Lcom/papa/sim/statistic/Event;->onMemberAdvert31:Lcom/papa/sim/statistic/Event;

    new-instance v4, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v4}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {v2, v3, v4}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 135
    :cond_29
    iget-object v2, v1, Lcom/join/mgps/activity/MGMainActivity$u0;->a:Lcom/join/mgps/activity/MGMainActivity;

    const/16 v3, 0x9

    invoke-virtual {v2, v3, v8, v0}, Lcom/join/mgps/activity/MGMainActivity;->raseVipToMgsim(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_10

    :cond_2a
    const/4 v3, 0x4

    if-ne v4, v3, :cond_2b

    .line 136
    invoke-virtual {v2, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 137
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v3

    invoke-virtual {v3, v0, v2}, Lcom/join/mgps/Util/IntentUtil;->goShareWebActivity(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_10

    :cond_2b
    const/4 v0, 0x6

    if-ne v4, v0, :cond_2c

    .line 138
    invoke-virtual {v2, v13}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 139
    iget-object v2, v1, Lcom/join/mgps/activity/MGMainActivity$u0;->a:Lcom/join/mgps/activity/MGMainActivity;

    invoke-virtual {v2, v0}, Lcom/join/mgps/activity/MGMainActivity;->showDownloadVideoAd(Ljava/lang/String;)V

    goto/16 :goto_10

    :cond_2c
    const/4 v3, 0x7

    if-ne v4, v3, :cond_2d

    .line 140
    iget-object v0, v1, Lcom/join/mgps/activity/MGMainActivity$u0;->a:Lcom/join/mgps/activity/MGMainActivity;

    invoke-virtual {v0}, Lcom/join/mgps/activity/MGMainActivity;->showPspVideoAd()V

    goto/16 :goto_10

    :cond_2d
    const/16 v0, 0x3e9

    const-string v3, "playCfg"

    if-ne v4, v0, :cond_2e

    .line 141
    invoke-virtual {v2, v3}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/PlayCfgBean;

    if-eqz v0, :cond_36

    .line 142
    sget-object v2, Lcom/MApplication;->x:Lcom/MApplication;

    iget-object v3, v1, Lcom/join/mgps/activity/MGMainActivity$u0;->a:Lcom/join/mgps/activity/MGMainActivity;

    invoke-virtual {v2, v3, v0}, Lcom/MApplication;->B(Landroid/content/Context;Lcom/join/mgps/dto/PlayCfgBean;)V

    goto/16 :goto_10

    :cond_2e
    const/16 v0, 0x3ea

    if-ne v4, v0, :cond_2f

    .line 143
    invoke-virtual {v2, v13}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 144
    sget-object v2, Lcom/MApplication;->x:Lcom/MApplication;

    iget-object v3, v1, Lcom/join/mgps/activity/MGMainActivity$u0;->a:Lcom/join/mgps/activity/MGMainActivity;

    invoke-virtual {v2, v3, v0}, Lcom/MApplication;->I(Landroid/app/Activity;Ljava/lang/String;)V

    goto/16 :goto_10

    :cond_2f
    const/16 v0, 0x3ed

    if-ne v4, v0, :cond_33

    .line 145
    invoke-virtual {v2, v3}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/join/mgps/dto/PlayCfgBean;

    .line 146
    invoke-virtual {v2, v13}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const/4 v4, 0x0

    .line 147
    invoke-virtual {v2, v14, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v8

    .line 148
    invoke-virtual {v2, v12, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v9

    const-string v0, "state"

    .line 149
    invoke-virtual {v2, v0, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v10

    const-string v4, "close"

    const/4 v5, 0x1

    .line 150
    invoke-virtual {v2, v4, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v11

    if-eqz v3, :cond_36

    .line 151
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 152
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v2, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {v2, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    invoke-virtual {v3}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_type()I

    move-result v0

    if-ne v0, v5, :cond_31

    .line 155
    iget-object v4, v1, Lcom/join/mgps/activity/MGMainActivity$u0;->a:Lcom/join/mgps/activity/MGMainActivity;

    iget-object v0, v4, Lcom/join/mgps/activity/MGMainActivity;->ttGoldAdVideo:Lcom/join/mgps/ad/z;

    if-nez v0, :cond_30

    .line 156
    invoke-virtual {v3}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_key()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lcom/join/mgps/dto/PlayCfgBean;->getAd_id()Ljava/lang/String;

    move-result-object v6

    const/4 v11, 0x1

    move-object v10, v2

    invoke-virtual/range {v4 .. v11}, Lcom/join/mgps/activity/MGMainActivity;->initGoldTTAd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/Map;Z)V

    goto/16 :goto_10

    :cond_30
    move-object v2, v4

    move-object v4, v7

    move v5, v8

    move v6, v9

    move v7, v10

    move v8, v11

    .line 157
    invoke-virtual/range {v2 .. v8}, Lcom/join/mgps/activity/MGMainActivity;->showGoldFingerVideo(Lcom/join/mgps/dto/PlayCfgBean;Ljava/lang/String;IIIZ)V

    goto :goto_10

    .line 158
    :cond_31
    invoke-virtual {v3}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_type()I

    move-result v0

    const/4 v4, 0x2

    if-ne v0, v4, :cond_36

    .line 159
    iget-object v4, v1, Lcom/join/mgps/activity/MGMainActivity$u0;->a:Lcom/join/mgps/activity/MGMainActivity;

    iget-object v0, v4, Lcom/join/mgps/activity/MGMainActivity;->gdtGoldAdVideo:Lcom/join/mgps/ad/h;

    if-nez v0, :cond_32

    .line 160
    invoke-virtual {v3}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_key()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lcom/join/mgps/dto/PlayCfgBean;->getAd_id()Ljava/lang/String;

    move-result-object v6

    const/4 v11, 0x1

    move-object v10, v2

    invoke-virtual/range {v4 .. v11}, Lcom/join/mgps/activity/MGMainActivity;->initGoldGDTAd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/Map;Z)V

    goto :goto_10

    :cond_32
    move-object v2, v4

    move-object v4, v7

    move v5, v8

    move v6, v9

    move v7, v10

    move v8, v11

    .line 161
    invoke-virtual/range {v2 .. v8}, Lcom/join/mgps/activity/MGMainActivity;->showGoldFingerVideo(Lcom/join/mgps/dto/PlayCfgBean;Ljava/lang/String;IIIZ)V

    goto :goto_10

    :cond_33
    const/16 v0, 0x3f1

    if-ne v4, v0, :cond_34

    .line 162
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v0

    new-instance v2, Lcom/join/mgps/event/a;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lcom/join/mgps/event/a;-><init>(I)V

    invoke-virtual {v0, v2}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    goto :goto_10

    :cond_34
    const/16 v0, 0x44d

    if-ne v4, v0, :cond_35

    .line 163
    invoke-virtual {v2, v3}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/PlayCfgBean;

    .line 164
    sget-object v2, Lcom/MApplication;->x:Lcom/MApplication;

    iget-object v3, v1, Lcom/join/mgps/activity/MGMainActivity$u0;->a:Lcom/join/mgps/activity/MGMainActivity;

    invoke-virtual {v2, v3, v0}, Lcom/MApplication;->C(Landroid/content/Context;Lcom/join/mgps/dto/PlayCfgBean;)V

    goto :goto_10

    :cond_35
    const/16 v0, 0x44e

    if-ne v4, v0, :cond_36

    .line 165
    invoke-virtual {v2, v13}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 166
    sget-object v2, Lcom/MApplication;->x:Lcom/MApplication;

    iget-object v3, v1, Lcom/join/mgps/activity/MGMainActivity$u0;->a:Lcom/join/mgps/activity/MGMainActivity;

    invoke-virtual {v2, v3, v0}, Lcom/MApplication;->J(Landroid/app/Activity;Ljava/lang/String;)V

    :cond_36
    :goto_10
    return-void
.end method
