.class Lcom/join/mgps/activity/QuarkPromptActivity$c$a;
.super Ljava/lang/Object;
.source "QuarkPromptActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/QuarkPromptActivity$c;->a(Lcom/tbruyelle/rxpermissions2/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/QuarkPromptActivity$c;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/QuarkPromptActivity$c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/QuarkPromptActivity$c$a;->b:Lcom/join/mgps/activity/QuarkPromptActivity$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity$c$a;->b:Lcom/join/mgps/activity/QuarkPromptActivity$c;

    iget-object v0, v0, Lcom/join/mgps/activity/QuarkPromptActivity$c;->b:Lcom/join/mgps/activity/QuarkPromptActivity;

    iget-object v1, v0, Lcom/join/mgps/activity/QuarkPromptActivity;->o:Lcom/join/mgps/dto/WebDiskInfo;

    if-eqz v1, :cond_3

    .line 2
    iget-object v0, v0, Lcom/join/mgps/activity/QuarkPromptActivity;->k:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->quark_click_count()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/QuarkPromptActivity$c$a;->b:Lcom/join/mgps/activity/QuarkPromptActivity$c;

    iget-object v1, v1, Lcom/join/mgps/activity/QuarkPromptActivity$c;->b:Lcom/join/mgps/activity/QuarkPromptActivity;

    iget-object v1, v1, Lcom/join/mgps/activity/QuarkPromptActivity;->n:Lcom/join/mgps/dto/WebDiskCfg;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/join/mgps/dto/WebDiskCfg;->getClick_count()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/QuarkPromptActivity$c$a;->b:Lcom/join/mgps/activity/QuarkPromptActivity$c;

    iget-object v1, v1, Lcom/join/mgps/activity/QuarkPromptActivity$c;->b:Lcom/join/mgps/activity/QuarkPromptActivity;

    iget-object v1, v1, Lcom/join/mgps/activity/QuarkPromptActivity;->k:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v1}, Lcom/join/mgps/pref/PrefDef_;->quark_click_count()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object v1

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity$c$a;->b:Lcom/join/mgps/activity/QuarkPromptActivity$c;

    iget-object v0, v0, Lcom/join/mgps/activity/QuarkPromptActivity$c;->b:Lcom/join/mgps/activity/QuarkPromptActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/QuarkPromptActivity;->g0(Lcom/join/mgps/activity/QuarkPromptActivity;)Lcom/join/mgps/dto/CollectionBeanSub;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity$c$a;->b:Lcom/join/mgps/activity/QuarkPromptActivity$c;

    iget-object v0, v0, Lcom/join/mgps/activity/QuarkPromptActivity$c;->b:Lcom/join/mgps/activity/QuarkPromptActivity;

    iget-boolean v0, v0, Lcom/join/mgps/activity/QuarkPromptActivity;->z:Z

    if-eqz v0, :cond_1

    .line 7
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v1

    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity$c$a;->b:Lcom/join/mgps/activity/QuarkPromptActivity$c;

    iget-object v2, v0, Lcom/join/mgps/activity/QuarkPromptActivity$c;->b:Lcom/join/mgps/activity/QuarkPromptActivity;

    invoke-static {}, Lcom/join/mgps/Util/q1;->o()Z

    move-result v3

    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity$c$a;->b:Lcom/join/mgps/activity/QuarkPromptActivity$c;

    iget-object v0, v0, Lcom/join/mgps/activity/QuarkPromptActivity$c;->b:Lcom/join/mgps/activity/QuarkPromptActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/QuarkPromptActivity;->o:Lcom/join/mgps/dto/WebDiskInfo;

    invoke-virtual {v0}, Lcom/join/mgps/dto/WebDiskInfo;->getWb_url()Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity$c$a;->b:Lcom/join/mgps/activity/QuarkPromptActivity$c;

    iget-object v0, v0, Lcom/join/mgps/activity/QuarkPromptActivity$c;->b:Lcom/join/mgps/activity/QuarkPromptActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/QuarkPromptActivity;->g0(Lcom/join/mgps/activity/QuarkPromptActivity;)Lcom/join/mgps/dto/CollectionBeanSub;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getGame_name()Ljava/lang/String;

    move-result-object v5

    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity$c$a;->b:Lcom/join/mgps/activity/QuarkPromptActivity$c;

    iget-object v0, v0, Lcom/join/mgps/activity/QuarkPromptActivity$c;->b:Lcom/join/mgps/activity/QuarkPromptActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/QuarkPromptActivity;->g0(Lcom/join/mgps/activity/QuarkPromptActivity;)Lcom/join/mgps/dto/CollectionBeanSub;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getIco_remote()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {v1 .. v6}, Lcom/join/mgps/Util/IntentUtil;->startQuarkBrowser(Landroid/content/Context;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 8
    :cond_1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v7

    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity$c$a;->b:Lcom/join/mgps/activity/QuarkPromptActivity$c;

    iget-object v8, v0, Lcom/join/mgps/activity/QuarkPromptActivity$c;->b:Lcom/join/mgps/activity/QuarkPromptActivity;

    invoke-static {}, Lcom/join/mgps/Util/q1;->r()Z

    move-result v9

    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity$c$a;->b:Lcom/join/mgps/activity/QuarkPromptActivity$c;

    iget-object v0, v0, Lcom/join/mgps/activity/QuarkPromptActivity$c;->b:Lcom/join/mgps/activity/QuarkPromptActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/QuarkPromptActivity;->o:Lcom/join/mgps/dto/WebDiskInfo;

    invoke-virtual {v0}, Lcom/join/mgps/dto/WebDiskInfo;->getWb_url()Ljava/lang/String;

    move-result-object v10

    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity$c$a;->b:Lcom/join/mgps/activity/QuarkPromptActivity$c;

    iget-object v0, v0, Lcom/join/mgps/activity/QuarkPromptActivity$c;->b:Lcom/join/mgps/activity/QuarkPromptActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/QuarkPromptActivity;->g0(Lcom/join/mgps/activity/QuarkPromptActivity;)Lcom/join/mgps/dto/CollectionBeanSub;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getGame_name()Ljava/lang/String;

    move-result-object v11

    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity$c$a;->b:Lcom/join/mgps/activity/QuarkPromptActivity$c;

    iget-object v0, v0, Lcom/join/mgps/activity/QuarkPromptActivity$c;->b:Lcom/join/mgps/activity/QuarkPromptActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/QuarkPromptActivity;->g0(Lcom/join/mgps/activity/QuarkPromptActivity;)Lcom/join/mgps/dto/CollectionBeanSub;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getIco_remote()Ljava/lang/String;

    move-result-object v12

    invoke-virtual/range {v7 .. v12}, Lcom/join/mgps/Util/IntentUtil;->startQuarkBrowser(Landroid/content/Context;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity$c$a;->b:Lcom/join/mgps/activity/QuarkPromptActivity$c;

    iget-object v0, v0, Lcom/join/mgps/activity/QuarkPromptActivity$c;->b:Lcom/join/mgps/activity/QuarkPromptActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/QuarkPromptActivity;->q:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v0, :cond_3

    .line 10
    new-instance v0, Lcom/join/mgps/dto/DownloadScanEvent;

    invoke-direct {v0}, Lcom/join/mgps/dto/DownloadScanEvent;-><init>()V

    .line 11
    iget-object v1, p0, Lcom/join/mgps/activity/QuarkPromptActivity$c$a;->b:Lcom/join/mgps/activity/QuarkPromptActivity$c;

    iget-object v1, v1, Lcom/join/mgps/activity/QuarkPromptActivity$c;->b:Lcom/join/mgps/activity/QuarkPromptActivity;

    iget-object v1, v1, Lcom/join/mgps/activity/QuarkPromptActivity;->q:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/DownloadScanEvent;->setPkg(Ljava/lang/String;)V

    .line 12
    iget-object v1, p0, Lcom/join/mgps/activity/QuarkPromptActivity$c$a;->b:Lcom/join/mgps/activity/QuarkPromptActivity$c;

    iget-object v1, v1, Lcom/join/mgps/activity/QuarkPromptActivity$c;->b:Lcom/join/mgps/activity/QuarkPromptActivity;

    iget-object v1, v1, Lcom/join/mgps/activity/QuarkPromptActivity;->q:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/DownloadScanEvent;->setTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/DownloadScanEvent;->setStatus(I)V

    .line 14
    iget-object v1, p0, Lcom/join/mgps/activity/QuarkPromptActivity$c$a;->b:Lcom/join/mgps/activity/QuarkPromptActivity$c;

    iget-object v1, v1, Lcom/join/mgps/activity/QuarkPromptActivity$c;->b:Lcom/join/mgps/activity/QuarkPromptActivity;

    invoke-static {v1}, Lcom/join/mgps/service/CommonService_;->S2(Landroid/content/Context;)Lcom/join/mgps/service/CommonService_$h2;

    move-result-object v1

    const-string v2, "downloadByQuark"

    invoke-virtual {v1, v2, v0}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Ljava/io/Serializable;)Lorg/androidannotations/api/builder/e;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/service/CommonService_$h2;

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/g;->a()Landroid/content/ComponentName;

    :cond_3
    return-void
.end method
