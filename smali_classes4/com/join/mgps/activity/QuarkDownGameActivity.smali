.class public Lcom/join/mgps/activity/QuarkDownGameActivity;
.super Lcom/join/mgps/base/dialog/BaseDialogActivity;
.source "QuarkDownGameActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation build Lorg/androidannotations/annotations/EActivity;
    value = 0x7f0c008a
.end annotation


# instance fields
.field b:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field c:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field d:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field e:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field f:Lcom/facebook/drawee/view/SimpleDraweeView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field g:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field h:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field i:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field j:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
        value = 0x7f09030d
    .end annotation
.end field

.field k:Lcom/join/mgps/dto/WebDiskInfo;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field l:Lcom/join/mgps/dto/ExtInfoBean;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field m:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field n:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field o:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field p:Lcom/join/mgps/pref/PrefDef_;
    .annotation build Lorg/androidannotations/annotations/sharedpreferences/Pref;
    .end annotation
.end field

.field q:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/base/dialog/BaseDialogActivity;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/activity/QuarkDownGameActivity;->q:Z

    return-void
.end method

.method private downloadQuark()V
    .locals 4

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/q1;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/va/overmind/d;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 2
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v1

    const-string v2, "3875871586"

    invoke-virtual {v1, v2}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v1

    goto :goto_1

    .line 3
    :cond_1
    iget-object v1, p0, Lcom/join/mgps/activity/QuarkDownGameActivity;->p:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v1}, Lcom/join/mgps/pref/PrefDef_;->isQuarkSilentDownload()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 4
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v1

    const-string v2, "2057111073"

    invoke-virtual {v1, v2}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v1

    :goto_1
    if-eqz v1, :cond_2

    .line 5
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v2

    const/16 v3, 0xb

    if-ne v2, v3, :cond_2

    .line 6
    invoke-static {p0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v0

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getGameZipPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lcom/join/android/app/common/utils/APKUtils;->x(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    const-string v1, "\u5938\u514b\u4e0b\u8f7d\u4e2d..."

    .line 7
    invoke-static {v1}, Lcom/papa91/arc/ext/ToastManager;->show(Ljava/lang/CharSequence;)V

    .line 8
    invoke-static {p0}, Lcom/join/mgps/service/CommonService_;->S2(Landroid/content/Context;)Lcom/join/mgps/service/CommonService_$h2;

    move-result-object v1

    const-string v2, "action"

    const-string v3, "downloadQuark"

    invoke-virtual {v1, v2, v3}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Ljava/lang/String;)Lorg/androidannotations/api/builder/e;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/service/CommonService_$h2;

    const-string v2, "isOm"

    invoke-virtual {v1, v2, v0}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Z)Lorg/androidannotations/api/builder/e;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/service/CommonService_$h2;

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/g;->a()Landroid/content/ComponentName;

    :goto_2
    return-void
.end method

.method private f0()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkDownGameActivity;->p:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->privateDomainFeedbackInfo()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 2
    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v1

    const-class v2, Lcom/join/mgps/dto/DomainInfoBean;

    invoke-virtual {v1, v0, v2}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/DomainInfoBean;

    if-eqz v0, :cond_1

    .line 4
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v1

    sget-object v2, Lcom/papa/sim/statistic/Event;->pdPcGameDetailsClick:Lcom/papa/sim/statistic/Event;

    new-instance v3, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v3}, Lcom/papa/sim/statistic/Ext;-><init>()V

    iget-object v4, p0, Lcom/join/mgps/activity/QuarkDownGameActivity;->n:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v3

    invoke-virtual {v0}, Lcom/join/mgps/dto/DomainInfoBean;->getIs_join()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/papa/sim/statistic/Ext;->setIsJoin(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v3

    invoke-virtual {v0}, Lcom/join/mgps/dto/DomainInfoBean;->getAb_test_number()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/papa/sim/statistic/Ext;->setTestAbNumber(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/dto/DomainInfoBean;->getInfo()Ljava/lang/String;

    move-result-object v0

    const-string v1, "pc_game_details"

    invoke-static {p0, v0, v1}, Lcom/join/mgps/Util/UtilsMy;->h4(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 6
    :cond_0
    invoke-direct {p0}, Lcom/join/mgps/activity/QuarkDownGameActivity;->h0()V

    :cond_1
    :goto_0
    return-void
.end method

.method private g0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkDownGameActivity;->p:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->isQuarkSilentDownload()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 2
    invoke-static {p0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v0

    const-string v1, "com.quark.browser"

    invoke-virtual {v0, p0, v1}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/join/mgps/activity/QuarkDownGameActivity;->q:Z

    if-eqz v0, :cond_1

    .line 3
    invoke-static {}, Lcom/join/mgps/Util/q1;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    invoke-direct {p0}, Lcom/join/mgps/activity/QuarkDownGameActivity;->f0()V

    goto :goto_0

    .line 5
    :cond_0
    invoke-direct {p0}, Lcom/join/mgps/activity/QuarkDownGameActivity;->h0()V

    goto :goto_0

    .line 6
    :cond_1
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/join/mgps/va/overmind/d;->F(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lcom/join/mgps/Util/q1;->p()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 7
    invoke-static {}, Lcom/join/mgps/Util/q1;->m()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 8
    invoke-direct {p0}, Lcom/join/mgps/activity/QuarkDownGameActivity;->f0()V

    goto :goto_0

    .line 9
    :cond_2
    invoke-direct {p0}, Lcom/join/mgps/activity/QuarkDownGameActivity;->h0()V

    goto :goto_0

    .line 10
    :cond_3
    invoke-direct {p0}, Lcom/join/mgps/activity/QuarkDownGameActivity;->downloadQuark()V

    :goto_0
    return-void
.end method

.method private h0()V
    .locals 9

    .line 1
    sget-object v0, Lcom/papa/sim/statistic/Event;->clickSpeedDownUpQk:Lcom/papa/sim/statistic/Event;

    iget-object v1, p0, Lcom/join/mgps/activity/QuarkDownGameActivity;->k:Lcom/join/mgps/dto/WebDiskInfo;

    invoke-virtual {v1}, Lcom/join/mgps/dto/WebDiskInfo;->getGameId()Ljava/lang/String;

    move-result-object v1

    const-string v2, "pc"

    invoke-static {p0, v0, v1, v2}, Lcom/join/mgps/Util/q1;->t(Landroid/content/Context;Lcom/papa/sim/statistic/Event;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v3

    invoke-static {}, Lcom/join/mgps/Util/q1;->p()Z

    move-result v5

    iget-object v0, p0, Lcom/join/mgps/activity/QuarkDownGameActivity;->k:Lcom/join/mgps/dto/WebDiskInfo;

    invoke-virtual {v0}, Lcom/join/mgps/dto/WebDiskInfo;->getWb_url()Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lcom/join/mgps/activity/QuarkDownGameActivity;->m:Ljava/lang/String;

    iget-object v8, p0, Lcom/join/mgps/activity/QuarkDownGameActivity;->o:Ljava/lang/String;

    move-object v4, p0

    invoke-virtual/range {v3 .. v8}, Lcom/join/mgps/Util/IntentUtil;->startQuarkBrowser(Landroid/content/Context;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v1, Lcom/papa/sim/statistic/Event;->clickPcDetailHomeBtn:Lcom/papa/sim/statistic/Event;

    new-instance v3, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v3}, Lcom/papa/sim/statistic/Ext;-><init>()V

    const-string v4, "2"

    .line 4
    invoke-virtual {v3, v4}, Lcom/papa/sim/statistic/Ext;->setFrom(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v3

    iget-object v4, p0, Lcom/join/mgps/activity/QuarkDownGameActivity;->k:Lcom/join/mgps/dto/WebDiskInfo;

    invoke-virtual {v4}, Lcom/join/mgps/dto/WebDiskInfo;->getGameId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/papa/sim/statistic/Ext;->setQkPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v2

    .line 5
    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    return-void
.end method


# virtual methods
.method afterViews()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/c2;->s(Landroid/app/Activity;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkDownGameActivity;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkDownGameActivity;->d:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkDownGameActivity;->l:Lcom/join/mgps/dto/ExtInfoBean;

    if-eqz v0, :cond_2

    .line 5
    iget-object v1, p0, Lcom/join/mgps/activity/QuarkDownGameActivity;->e:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ExtInfoBean;->getHelp_des()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkDownGameActivity;->l:Lcom/join/mgps/dto/ExtInfoBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ExtInfoBean;->getGame_cfg()Lcom/join/mgps/dto/GameCfgBean;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkDownGameActivity;->h:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/join/mgps/activity/QuarkDownGameActivity;->l:Lcom/join/mgps/dto/ExtInfoBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/ExtInfoBean;->getGame_cfg()Lcom/join/mgps/dto/GameCfgBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameCfgBean;->getGame_price()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkDownGameActivity;->l:Lcom/join/mgps/dto/ExtInfoBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ExtInfoBean;->getGame_cfg()Lcom/join/mgps/dto/GameCfgBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameCfgBean;->getGame_size()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    const-wide/high16 v2, 0x4090000000000000L    # 1024.0

    mul-double v0, v0, v2

    mul-double v0, v0, v2

    double-to-long v0, v0

    .line 9
    iget-object v2, p0, Lcom/join/mgps/activity/QuarkDownGameActivity;->i:Landroid/widget/TextView;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 11
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkDownGameActivity;->l:Lcom/join/mgps/dto/ExtInfoBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ExtInfoBean;->getHelp_url()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 12
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkDownGameActivity;->d:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 13
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkDownGameActivity;->d:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 14
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkDownGameActivity;->g:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/join/mgps/activity/QuarkDownGameActivity;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 15
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkDownGameActivity;->f:Lcom/facebook/drawee/view/SimpleDraweeView;

    iget-object v1, p0, Lcom/join/mgps/activity/QuarkDownGameActivity;->o:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 16
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v1, Lcom/papa/sim/statistic/Event;->visitPCDbankPageExp:Lcom/papa/sim/statistic/Event;

    new-instance v2, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v2}, Lcom/papa/sim/statistic/Ext;-><init>()V

    iget-object v3, p0, Lcom/join/mgps/activity/QuarkDownGameActivity;->n:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 17
    invoke-static {}, Lcom/join/mgps/Util/q1;->m()Z

    move-result v0

    if-eqz v0, :cond_3

    const/16 v0, 0x12

    .line 18
    iget-object v1, p0, Lcom/join/mgps/activity/QuarkDownGameActivity;->n:Ljava/lang/String;

    invoke-static {p0, v0, v1}, Lcom/join/mgps/Util/UtilsMy;->T1(Landroid/content/Context;ILjava/lang/String;)V

    :cond_3
    return-void
.end method

.method public getContentView()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkDownGameActivity;->j:Landroid/view/View;

    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f0915cb

    if-ne p1, v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/QuarkDownGameActivity;->g0()V

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/base/dialog/BaseDialogActivity;->finish()V

    goto :goto_0

    :cond_0
    const v0, 0x7f091643

    if-ne p1, v0, :cond_2

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/QuarkDownGameActivity;->l:Lcom/join/mgps/dto/ExtInfoBean;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/join/mgps/dto/ExtInfoBean;->getHelp_url()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 5
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/QuarkDownGameActivity;->l:Lcom/join/mgps/dto/ExtInfoBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ExtInfoBean;->getHelp_url()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, Lcom/join/mgps/Util/IntentUtil;->goShareWebActivity(Landroid/content/Context;Ljava/lang/String;)V

    .line 6
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/base/dialog/BaseDialogActivity;->finish()V

    :cond_2
    :goto_0
    return-void
.end method

.method protected onResume()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/BaseAppCompatActivity;->onResume()V

    .line 2
    invoke-static {p0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v0

    const-string v1, "com.quark.browser"

    invoke-virtual {v0, p0, v1}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    const-string v1, "\u4fdd\u5b58\u6e38\u620f"

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkDownGameActivity;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {}, Lcom/join/mgps/Util/q1;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/va/overmind/d;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkDownGameActivity;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkDownGameActivity;->c:Landroid/widget/TextView;

    const-string v1, "\u5b89\u88c5\u5938\u514b\u00b7\u4fdd\u5b58\u6e38\u620f"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method
