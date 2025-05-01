.class public final Lcom/kwad/components/core/e/d/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/NetworkMonitor$a;
.implements Lcom/kwad/sdk/core/download/c;
.implements Lcom/kwad/sdk/core/webview/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/core/e/d/c$a;
    }
.end annotation


# instance fields
.field private Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private Lv:Z

.field private Lw:Lcom/kwad/components/core/e/d/c$a;

.field private Lx:Landroid/content/DialogInterface$OnShowListener;

.field private Ly:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/sdk/api/KsAppDownloadListener;",
            ">;"
        }
    .end annotation
.end field

.field private downloadPauseEnable:Z

.field private fS:Landroid/os/Handler;

.field private mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private mOnDismissListener:Landroid/content/DialogInterface$OnDismissListener;

.field private mReportExtData:Lorg/json/JSONObject;


# direct methods
.method public constructor <init>(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 1
    .param p1    # Lcom/kwad/sdk/core/response/model/AdTemplate;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 15
    invoke-direct {p0, p1, v0, v0}, Lcom/kwad/components/core/e/d/c;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;Lorg/json/JSONObject;Lcom/kwad/sdk/api/KsAppDownloadListener;)V

    return-void
.end method

.method public constructor <init>(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/api/KsAppDownloadListener;)V
    .locals 1
    .param p1    # Lcom/kwad/sdk/core/response/model/AdTemplate;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/kwad/sdk/api/KsAppDownloadListener;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 13
    invoke-direct {p0, p1, v0, p2}, Lcom/kwad/components/core/e/d/c;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;Lorg/json/JSONObject;Lcom/kwad/sdk/api/KsAppDownloadListener;)V

    return-void
.end method

.method public constructor <init>(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/api/KsAppDownloadListener;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1    # Lcom/kwad/sdk/core/response/model/AdTemplate;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 p2, 0x0

    .line 16
    invoke-direct {p0, p1, p2, p2}, Lcom/kwad/components/core/e/d/c;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;Lorg/json/JSONObject;Lcom/kwad/sdk/api/KsAppDownloadListener;)V

    .line 17
    iget-object p1, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iget-object p2, p1, Lcom/kwad/sdk/core/response/model/AdInfo;->adConversionInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdConversionInfo;

    iput-object p3, p2, Lcom/kwad/sdk/core/response/model/AdInfo$AdConversionInfo;->appDownloadUrl:Ljava/lang/String;

    .line 18
    iget-object p2, p1, Lcom/kwad/sdk/core/response/model/AdInfo;->adBaseInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdBaseInfo;

    iput-object p4, p2, Lcom/kwad/sdk/core/response/model/AdInfo$AdBaseInfo;->appPackageName:Ljava/lang/String;

    .line 19
    invoke-static {p3}, Lcom/kwad/sdk/utils/ae;->bx(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p1, Lcom/kwad/sdk/core/response/model/AdInfo;->downloadId:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/kwad/sdk/core/response/model/AdTemplate;Lorg/json/JSONObject;)V
    .locals 1
    .param p1    # Lcom/kwad/sdk/core/response/model/AdTemplate;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 14
    invoke-direct {p0, p1, p2, v0}, Lcom/kwad/components/core/e/d/c;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;Lorg/json/JSONObject;Lcom/kwad/sdk/api/KsAppDownloadListener;)V

    return-void
.end method

.method public constructor <init>(Lcom/kwad/sdk/core/response/model/AdTemplate;Lorg/json/JSONObject;Lcom/kwad/sdk/api/KsAppDownloadListener;)V
    .locals 2
    .param p1    # Lcom/kwad/sdk/core/response/model/AdTemplate;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/kwad/components/core/e/d/c;->fS:Landroid/os/Handler;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/e/d/c;->Ly:Ljava/util/List;

    .line 4
    iput-object p1, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 5
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    .line 6
    iput-object p2, p0, Lcom/kwad/components/core/e/d/c;->mReportExtData:Lorg/json/JSONObject;

    if-eqz p3, :cond_0

    .line 7
    invoke-virtual {p0, p3}, Lcom/kwad/components/core/e/d/c;->b(Lcom/kwad/sdk/api/KsAppDownloadListener;)V

    .line 8
    :cond_0
    invoke-direct {p0}, Lcom/kwad/components/core/e/d/c;->ou()V

    .line 9
    iget-object p1, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object p1

    .line 10
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->cC(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/kwad/components/core/e/d/c;->downloadPauseEnable:Z

    .line 11
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/c;->ot()V

    .line 12
    invoke-static {}, Lcom/kwad/sdk/a/a/c;->Au()Lcom/kwad/sdk/a/a/c;

    move-result-object p1

    iget-object p2, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {p1, p2}, Lcom/kwad/sdk/a/a/c;->aO(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-void
.end method

.method public static A(Lcom/kwad/components/core/e/d/a$a;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    .line 2
    iget-object v1, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->downloadSafeInfo:Lcom/kwad/sdk/core/response/model/AdInfo$DownloadSafeInfo;

    iget-object v1, v1, Lcom/kwad/sdk/core/response/model/AdInfo$DownloadSafeInfo;->complianceInfo:Lcom/kwad/sdk/core/response/model/AdInfo$ComplianceInfo;

    if-eqz v1, :cond_2

    .line 3
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->cV()I

    move-result p0

    const/4 v1, 0x2

    if-eq p0, v1, :cond_1

    const/4 v1, 0x3

    if-eq p0, v1, :cond_0

    .line 4
    iget-object p0, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->downloadSafeInfo:Lcom/kwad/sdk/core/response/model/AdInfo$DownloadSafeInfo;

    iget-object p0, p0, Lcom/kwad/sdk/core/response/model/AdInfo$DownloadSafeInfo;->complianceInfo:Lcom/kwad/sdk/core/response/model/AdInfo$ComplianceInfo;

    iget p0, p0, Lcom/kwad/sdk/core/response/model/AdInfo$ComplianceInfo;->actionBarType:I

    return p0

    .line 5
    :cond_0
    iget-object p0, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->downloadSafeInfo:Lcom/kwad/sdk/core/response/model/AdInfo$DownloadSafeInfo;

    iget-object p0, p0, Lcom/kwad/sdk/core/response/model/AdInfo$DownloadSafeInfo;->complianceInfo:Lcom/kwad/sdk/core/response/model/AdInfo$ComplianceInfo;

    iget p0, p0, Lcom/kwad/sdk/core/response/model/AdInfo$ComplianceInfo;->materialJumpType:I

    return p0

    .line 6
    :cond_1
    iget-object p0, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->downloadSafeInfo:Lcom/kwad/sdk/core/response/model/AdInfo$DownloadSafeInfo;

    iget-object p0, p0, Lcom/kwad/sdk/core/response/model/AdInfo$DownloadSafeInfo;->complianceInfo:Lcom/kwad/sdk/core/response/model/AdInfo$ComplianceInfo;

    iget p0, p0, Lcom/kwad/sdk/core/response/model/AdInfo$ComplianceInfo;->describeBarType:I

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method static synthetic a(Lcom/kwad/components/core/e/d/c;Lcom/kwad/sdk/api/KsAppDownloadListener;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/components/core/e/d/c;->a(Lcom/kwad/sdk/api/KsAppDownloadListener;)V

    return-void
.end method

.method private a(Lcom/kwad/sdk/api/KsAppDownloadListener;)V
    .locals 2
    .param p1    # Lcom/kwad/sdk/api/KsAppDownloadListener;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 56
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iget v1, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->progress:I

    .line 57
    iget v0, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->status:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    .line 58
    :pswitch_1
    invoke-interface {p1}, Lcom/kwad/sdk/api/KsAppDownloadListener;->onInstalled()V

    goto :goto_0

    .line 59
    :pswitch_2
    invoke-interface {p1}, Lcom/kwad/sdk/api/KsAppDownloadListener;->onDownloadFinished()V

    return-void

    .line 60
    :pswitch_3
    invoke-interface {p1}, Lcom/kwad/sdk/api/KsAppDownloadListener;->onDownloadFailed()V

    return-void

    .line 61
    :pswitch_4
    instance-of v0, p1, Lcom/kwad/sdk/core/download/a/a;

    if-eqz v0, :cond_0

    .line 62
    move-object v0, p1

    check-cast v0, Lcom/kwad/sdk/core/download/a/a;

    .line 63
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/download/a/a;->onPaused(I)V

    .line 64
    :cond_0
    :try_start_0
    instance-of v0, p1, Lcom/kwad/sdk/api/KsApkDownloadListener;

    if-eqz v0, :cond_1

    .line 65
    check-cast p1, Lcom/kwad/sdk/api/KsApkDownloadListener;

    .line 66
    invoke-interface {p1, v1}, Lcom/kwad/sdk/api/KsApkDownloadListener;->onPaused(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_1
    return-void

    .line 67
    :pswitch_5
    invoke-interface {p1, v1}, Lcom/kwad/sdk/api/KsAppDownloadListener;->onProgressUpdate(I)V

    return-void

    :pswitch_6
    const/4 v0, 0x0

    .line 68
    invoke-interface {p1, v0}, Lcom/kwad/sdk/api/KsAppDownloadListener;->onProgressUpdate(I)V

    .line 69
    instance-of v0, p1, Lcom/kwad/sdk/core/download/a/a;

    if-eqz v0, :cond_2

    .line 70
    check-cast p1, Lcom/kwad/sdk/core/download/a/a;

    .line 71
    invoke-virtual {p1}, Lcom/kwad/sdk/core/download/a/a;->onDownloadStarted()V

    return-void

    .line 72
    :cond_2
    :try_start_1
    invoke-interface {p1}, Lcom/kwad/sdk/api/KsAppDownloadListener;->onDownloadStarted()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    return-void

    :catchall_1
    move-exception p1

    .line 73
    invoke-static {p1}, Lcom/kwad/sdk/core/e/c;->printStackTraceOnly(Ljava/lang/Throwable;)V

    return-void

    .line 74
    :pswitch_7
    invoke-interface {p1}, Lcom/kwad/sdk/api/KsAppDownloadListener;->onIdle()V

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_7
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private static c(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdTemplate;)I
    .locals 1

    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 12
    invoke-static {p0, p1, v0}, Lcom/kwad/components/core/page/DownloadLandPageActivity;->launch(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdTemplate;Z)V

    :cond_0
    const/16 p0, 0x9

    return p0
.end method

.method static synthetic c(Lcom/kwad/components/core/e/d/c;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method static synthetic d(Lcom/kwad/components/core/e/d/c;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/e/d/c;->Ly:Ljava/util/List;

    return-object p0
.end method

.method static synthetic e(Lcom/kwad/components/core/e/d/c;)Lcom/kwad/sdk/core/response/model/AdInfo;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    return-object p0
.end method

.method private oC()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->Lw:Lcom/kwad/components/core/e/d/c$a;

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Lcom/kwad/components/core/e/d/c$4;

    invoke-direct {v1, p0}, Lcom/kwad/components/core/e/d/c$4;-><init>(Lcom/kwad/components/core/e/d/c;)V

    .line 3
    invoke-interface {v0, v1}, Lcom/kwad/components/core/e/d/c$a;->handleDownloadDialog(Landroid/content/DialogInterface$OnClickListener;)Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private oE()Z
    .locals 3

    .line 1
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 2
    new-instance v1, Lcom/kwad/components/core/e/d/a$a;

    invoke-direct {v1, v0}, Lcom/kwad/components/core/e/d/a$a;-><init>(Landroid/content/Context;)V

    iget-object v2, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 3
    invoke-virtual {v1, v2}, Lcom/kwad/components/core/e/d/a$a;->ar(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v1

    const/4 v2, 0x1

    .line 4
    invoke-static {v1, v2}, Lcom/kwad/components/core/e/d/d;->a(Lcom/kwad/components/core/e/d/a$a;I)I

    move-result v1

    if-ne v1, v2, :cond_0

    return v2

    .line 5
    :cond_0
    iget-object v1, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->ax(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kwad/sdk/utils/al;->ap(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    iget-object v1, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v1}, Lcom/kwad/sdk/core/adlog/c;->bJ(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    :cond_1
    return v0
.end method

.method private ou()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/kwad/sdk/core/download/b;->DO()Lcom/kwad/sdk/core/download/b;

    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/c;->ow()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/download/b;->dJ(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iput v0, v1, Lcom/kwad/sdk/core/response/model/AdInfo;->status:I

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/c;->oA()V

    .line 4
    invoke-direct {p0}, Lcom/kwad/components/core/e/d/c;->oz()V

    return-void
.end method

.method private oy()Z
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x1d

    if-ge v0, v2, :cond_2

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-boolean v0, v0, Lcom/kwad/sdk/core/response/model/AdTemplate;->mIsFromContent:Z

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/kwad/sdk/core/config/d;->Cc()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-direct {p0}, Lcom/kwad/components/core/e/d/c;->oE()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 4
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/adlog/c;->bK(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-boolean v0, v0, Lcom/kwad/sdk/core/response/model/AdTemplate;->mIsFromContent:Z

    if-nez v0, :cond_2

    invoke-static {}, Lcom/kwad/sdk/core/config/d;->CI()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 6
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/components/core/k/b;->al(Landroid/content/Context;)Z

    move-result v0

    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "handleForceOpenApp enableForceOpen: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "ApkDownloadHelper"

    invoke-static {v3, v2}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v0, :cond_1

    .line 8
    invoke-direct {p0}, Lcom/kwad/components/core/e/d/c;->oE()Z

    move-result v1

    :cond_1
    if-eqz v1, :cond_2

    .line 9
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/adlog/c;->bL(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    :cond_2
    :goto_0
    return v1
.end method

.method private oz()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->fS:Landroid/os/Handler;

    new-instance v1, Lcom/kwad/components/core/e/d/c$3;

    invoke-direct {v1, p0}, Lcom/kwad/components/core/e/d/c$3;-><init>(Lcom/kwad/components/core/e/d/c;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private t(Lcom/kwad/components/core/e/d/a$a;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/kwad/components/core/e/d/a$a;->getContext()Landroid/content/Context;

    move-result-object p1

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {p1, v0}, Lcom/kwad/sdk/utils/d;->h(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/kwad/sdk/core/adlog/c;->k(Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    :cond_0
    return p1
.end method

.method private u(Lcom/kwad/components/core/e/d/a$a;)I
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/kwad/components/core/e/d/a$a;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->cR(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v1

    .line 3
    iget-object v2, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/utils/d;->a(Landroid/content/Context;Ljava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result v1

    const/16 v2, 0xb

    if-eqz v1, :cond_0

    .line 4
    iget-object p1, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/4 v0, 0x1

    .line 5
    invoke-static {p1, v0}, Lcom/kwad/sdk/core/adlog/c;->k(Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    return v2

    .line 6
    :cond_0
    invoke-direct {p0, p1}, Lcom/kwad/components/core/e/d/c;->t(Lcom/kwad/components/core/e/d/a$a;)Z

    move-result v1

    if-eqz v1, :cond_1

    return v2

    .line 7
    :cond_1
    invoke-direct {p0}, Lcom/kwad/components/core/e/d/c;->oC()Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 p1, 0xa

    return p1

    .line 8
    :cond_2
    invoke-static {v0}, Lcom/kwad/sdk/utils/ah;->isNetworkConnected(Landroid/content/Context;)Z

    move-result v1

    const/4 v2, 0x2

    if-nez v1, :cond_3

    .line 9
    invoke-static {v0}, Lcom/kwad/sdk/utils/w;->ck(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/kwad/sdk/utils/v;->P(Landroid/content/Context;Ljava/lang/String;)V

    return v2

    .line 10
    :cond_3
    invoke-virtual {p1}, Lcom/kwad/components/core/e/d/a$a;->op()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Lcom/kwad/sdk/core/config/d;->Cu()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 11
    invoke-direct {p0, p1}, Lcom/kwad/components/core/e/d/c;->v(Lcom/kwad/components/core/e/d/a$a;)I

    move-result p1

    return p1

    .line 12
    :cond_4
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->eh(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 13
    invoke-virtual {p1}, Lcom/kwad/components/core/e/d/a$a;->or()I

    move-result v0

    if-eq v0, v2, :cond_5

    .line 14
    invoke-virtual {p1}, Lcom/kwad/components/core/e/d/a$a;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, Lcom/kwad/components/core/e/d/a$a;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/kwad/components/core/e/d/c;->c(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdTemplate;)I

    move-result p1

    return p1

    .line 15
    :cond_5
    invoke-virtual {p1}, Lcom/kwad/components/core/e/d/a$a;->ol()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 16
    invoke-direct {p0, p1}, Lcom/kwad/components/core/e/d/c;->w(Lcom/kwad/components/core/e/d/a$a;)I

    move-result p1

    return p1

    .line 17
    :cond_6
    invoke-direct {p0, p1}, Lcom/kwad/components/core/e/d/c;->x(Lcom/kwad/components/core/e/d/a$a;)Z

    move-result p1

    if-eqz p1, :cond_7

    const/16 p1, 0x8

    return p1

    .line 18
    :cond_7
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/c;->oG()I

    move-result p1

    return p1
.end method

.method private v(Lcom/kwad/components/core/e/d/a$a;)I
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/kwad/components/core/e/d/a$a;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 2
    invoke-virtual {p1}, Lcom/kwad/components/core/e/d/a$a;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v1

    .line 3
    invoke-virtual {p1}, Lcom/kwad/components/core/e/d/a$a;->oq()I

    move-result p1

    const/4 v2, 0x1

    if-eq p1, v2, :cond_2

    const/4 v3, 0x2

    if-eq p1, v3, :cond_0

    return v2

    .line 4
    :cond_0
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/b;->cZ(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 5
    new-instance p1, Lcom/kwad/components/core/e/c/b$a;

    invoke-direct {p1}, Lcom/kwad/components/core/e/c/b$a;-><init>()V

    .line 6
    invoke-virtual {p1, v1}, Lcom/kwad/components/core/e/c/b$a;->aq(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/components/core/e/c/b$a;

    move-result-object p1

    .line 7
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/b;->cY(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/kwad/components/core/e/c/b$a;->af(Ljava/lang/String;)Lcom/kwad/components/core/e/c/b$a;

    move-result-object p1

    iget-object v1, p0, Lcom/kwad/components/core/e/d/c;->Lx:Landroid/content/DialogInterface$OnShowListener;

    .line 8
    invoke-virtual {p1, v1}, Lcom/kwad/components/core/e/c/b$a;->a(Landroid/content/DialogInterface$OnShowListener;)Lcom/kwad/components/core/e/c/b$a;

    move-result-object p1

    iget-object v1, p0, Lcom/kwad/components/core/e/d/c;->mOnDismissListener:Landroid/content/DialogInterface$OnDismissListener;

    .line 9
    invoke-virtual {p1, v1}, Lcom/kwad/components/core/e/c/b$a;->c(Landroid/content/DialogInterface$OnDismissListener;)Lcom/kwad/components/core/e/c/b$a;

    move-result-object p1

    .line 10
    invoke-virtual {p1}, Lcom/kwad/components/core/e/c/b$a;->nT()Lcom/kwad/components/core/e/c/b$b;

    move-result-object p1

    .line 11
    invoke-static {v0, p1}, Lcom/kwad/components/core/e/c/b;->a(Landroid/content/Context;Lcom/kwad/components/core/e/c/b$b;)Z

    :cond_1
    const/16 p1, 0x8

    return p1

    .line 12
    :cond_2
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/c;->oG()I

    move-result p1

    return p1
.end method

.method private w(Lcom/kwad/components/core/e/d/a$a;)I
    .locals 5

    .line 1
    invoke-virtual {p1}, Lcom/kwad/components/core/e/d/a$a;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 2
    invoke-virtual {p1}, Lcom/kwad/components/core/e/d/a$a;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v1

    .line 3
    invoke-static {p1}, Lcom/kwad/components/core/e/d/c;->A(Lcom/kwad/components/core/e/d/a$a;)I

    move-result v2

    const/16 v3, 0x8

    const/4 v4, 0x1

    if-eq v2, v4, :cond_3

    const/4 v0, 0x2

    if-eq v2, v0, :cond_2

    const/4 v0, 0x3

    if-eq v2, v0, :cond_1

    .line 4
    invoke-direct {p0, p1}, Lcom/kwad/components/core/e/d/c;->x(Lcom/kwad/components/core/e/d/a$a;)Z

    move-result p1

    if-eqz p1, :cond_0

    return v3

    .line 5
    :cond_0
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/c;->oG()I

    move-result p1

    return p1

    :cond_1
    return v4

    .line 6
    :cond_2
    invoke-virtual {p1}, Lcom/kwad/components/core/e/d/a$a;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, Lcom/kwad/components/core/e/d/a$a;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/kwad/components/core/e/d/c;->c(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdTemplate;)I

    move-result p1

    return p1

    .line 7
    :cond_3
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/b;->cZ(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 8
    new-instance p1, Lcom/kwad/components/core/e/c/b$a;

    invoke-direct {p1}, Lcom/kwad/components/core/e/c/b$a;-><init>()V

    .line 9
    invoke-virtual {p1, v1}, Lcom/kwad/components/core/e/c/b$a;->aq(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/components/core/e/c/b$a;

    move-result-object p1

    .line 10
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/b;->cY(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/kwad/components/core/e/c/b$a;->af(Ljava/lang/String;)Lcom/kwad/components/core/e/c/b$a;

    move-result-object p1

    iget-object v1, p0, Lcom/kwad/components/core/e/d/c;->Lx:Landroid/content/DialogInterface$OnShowListener;

    .line 11
    invoke-virtual {p1, v1}, Lcom/kwad/components/core/e/c/b$a;->a(Landroid/content/DialogInterface$OnShowListener;)Lcom/kwad/components/core/e/c/b$a;

    move-result-object p1

    iget-object v1, p0, Lcom/kwad/components/core/e/d/c;->mOnDismissListener:Landroid/content/DialogInterface$OnDismissListener;

    .line 12
    invoke-virtual {p1, v1}, Lcom/kwad/components/core/e/c/b$a;->c(Landroid/content/DialogInterface$OnDismissListener;)Lcom/kwad/components/core/e/c/b$a;

    move-result-object p1

    .line 13
    invoke-virtual {p1}, Lcom/kwad/components/core/e/c/b$a;->nT()Lcom/kwad/components/core/e/c/b$b;

    move-result-object p1

    .line 14
    invoke-static {v0, p1}, Lcom/kwad/components/core/e/c/b;->a(Landroid/content/Context;Lcom/kwad/components/core/e/c/b$b;)Z

    :cond_4
    return v3
.end method

.method private x(Lcom/kwad/components/core/e/d/a$a;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/kwad/components/core/e/d/a$a;->oi()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iget v0, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->status:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/b;->dc(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    invoke-static {p1}, Lcom/kwad/components/core/e/d/c;->y(Lcom/kwad/components/core/e/d/a$a;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p1}, Lcom/kwad/components/core/e/d/a$a;->getContext()Landroid/content/Context;

    move-result-object p1

    new-instance v0, Lcom/kwad/components/core/e/c/b$a;

    invoke-direct {v0}, Lcom/kwad/components/core/e/c/b$a;-><init>()V

    iget-object v1, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 5
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/e/c/b$a;->aq(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/components/core/e/c/b$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 6
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/b;->db(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/e/c/b$a;->af(Ljava/lang/String;)Lcom/kwad/components/core/e/c/b$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/core/e/d/c;->Lx:Landroid/content/DialogInterface$OnShowListener;

    .line 7
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/e/c/b$a;->a(Landroid/content/DialogInterface$OnShowListener;)Lcom/kwad/components/core/e/c/b$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/core/e/d/c;->mOnDismissListener:Landroid/content/DialogInterface$OnDismissListener;

    .line 8
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/e/c/b$a;->c(Landroid/content/DialogInterface$OnDismissListener;)Lcom/kwad/components/core/e/c/b$a;

    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lcom/kwad/components/core/e/c/b$a;->nT()Lcom/kwad/components/core/e/c/b$b;

    move-result-object v0

    .line 10
    invoke-static {p1, v0}, Lcom/kwad/components/core/e/c/b;->a(Landroid/content/Context;Lcom/kwad/components/core/e/c/b$b;)Z

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method private static y(Lcom/kwad/components/core/e/d/a$a;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->bu(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    sget-boolean v1, Lcom/kwad/components/core/page/DownloadLandPageActivity;->showingAdWebViewLandPage:Z

    if-nez v1, :cond_0

    sget-boolean v1, Lcom/kwad/components/core/page/AdWebViewVideoActivityProxy;->showingAdWebViewVideoActivity:Z

    if-nez v1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v1

    iget-boolean v1, v1, Lcom/kwad/sdk/core/response/model/AdTemplate;->isWebViewDownload:Z

    if-eqz v1, :cond_1

    :cond_0
    return v2

    .line 4
    :cond_1
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->bv(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 5
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Lcom/kwad/sdk/utils/ah;->isWifiConnected(Landroid/content/Context;)Z

    move-result p0

    if-nez p0, :cond_2

    return v2

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method private z(Lcom/kwad/components/core/e/d/a$a;)I
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/kwad/components/core/e/d/a$a;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/n/l;->dB(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->T(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {p1}, Lcom/kwad/components/core/e/d/a$a;->nZ()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p1}, Lcom/kwad/components/core/e/d/a$a;->oe()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    .line 4
    invoke-virtual {p1, v1}, Lcom/kwad/components/core/e/d/a$a;->ak(I)V

    .line 5
    invoke-static {v0, p1}, Lcom/kwad/components/core/e/e/e;->a(Landroid/app/Activity;Lcom/kwad/components/core/e/d/a$a;)V

    const/16 p1, 0x12

    return p1

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/c;->oD()I

    move-result p1

    return p1
.end method


# virtual methods
.method public final a(Lcom/kwad/components/core/e/d/c$a;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/kwad/components/core/e/d/c;->Lw:Lcom/kwad/components/core/e/d/c$a;

    return-void
.end method

.method public final a(Lcom/kwad/sdk/core/NetworkMonitor$NetworkState;)V
    .locals 2

    .line 76
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iget v0, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->status:I

    const/4 v1, 0x7

    if-ne v0, v1, :cond_0

    sget-object v0, Lcom/kwad/sdk/core/NetworkMonitor$NetworkState;->NETWORK_WIFI:Lcom/kwad/sdk/core/NetworkMonitor$NetworkState;

    if-ne p1, v0, :cond_0

    .line 77
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/c;->oG()I

    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/String;III)V
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iget-object v0, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->downloadId:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 11
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    const/4 v0, 0x3

    iput v0, p1, Lcom/kwad/sdk/core/response/model/AdInfo;->status:I

    .line 12
    iput p2, p1, Lcom/kwad/sdk/core/response/model/AdInfo;->progress:I

    int-to-long p2, p3

    .line 13
    iput-wide p2, p1, Lcom/kwad/sdk/core/response/model/AdInfo;->soFarBytes:J

    int-to-long p2, p4

    .line 14
    iput-wide p2, p1, Lcom/kwad/sdk/core/response/model/AdInfo;->totalBytes:J

    .line 15
    invoke-direct {p0}, Lcom/kwad/components/core/e/d/c;->oz()V

    return-void
.end method

.method public final a(Ljava/lang/String;ILjava/lang/String;Lcom/kwad/sdk/core/download/e;)V
    .locals 3

    .line 32
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iget-object v0, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->downloadId:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 33
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    const/4 v0, 0x7

    iput v0, p1, Lcom/kwad/sdk/core/response/model/AdInfo;->status:I

    .line 34
    invoke-direct {p0}, Lcom/kwad/components/core/e/d/c;->oz()V

    .line 35
    invoke-virtual {p4}, Lcom/kwad/sdk/core/download/e;->DS()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 36
    new-instance p1, Lcom/kwad/sdk/core/adlog/c$a;

    invoke-direct {p1, p2, p3}, Lcom/kwad/sdk/core/adlog/c$a;-><init>(ILjava/lang/String;)V

    .line 37
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0, p1}, Lcom/kwad/sdk/core/adlog/c;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/core/adlog/c$a;)V

    .line 38
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iget-object v0, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->adConversionInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdConversionInfo;

    iget-object v0, v0, Lcom/kwad/sdk/core/response/model/AdInfo$AdConversionInfo;->appDownloadUrl:Ljava/lang/String;

    .line 39
    invoke-static {}, Lcom/kwad/components/core/o/a;->qI()Lcom/kwad/components/core/o/a;

    move-result-object v1

    iget-object v2, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {p1}, Lcom/kwad/sdk/core/response/a/a;->toJson()Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, v2, v0, p1}, Lcom/kwad/components/core/o/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    invoke-virtual {p4}, Lcom/kwad/sdk/core/download/e;->DR()V

    .line 41
    iget-object p1, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {p1, p2, p3}, Lcom/kwad/sdk/commercial/a/a;->h(Lcom/kwad/sdk/core/response/model/AdTemplate;ILjava/lang/String;)V

    .line 42
    :cond_1
    iget-object p1, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iget-object p1, p1, Lcom/kwad/sdk/core/response/model/AdInfo;->adConversionInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdConversionInfo;

    iget p1, p1, Lcom/kwad/sdk/core/response/model/AdInfo$AdConversionInfo;->retryH5TimeStep:I

    if-lez p1, :cond_2

    iget-boolean p1, p0, Lcom/kwad/components/core/e/d/c;->Lv:Z

    if-nez p1, :cond_2

    .line 43
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    iget-object p3, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iget-wide v0, p3, Lcom/kwad/sdk/core/response/model/AdInfo;->mStartDownloadTime:J

    sub-long/2addr p1, v0

    .line 44
    iget-object p4, p3, Lcom/kwad/sdk/core/response/model/AdInfo;->adConversionInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdConversionInfo;

    iget p4, p4, Lcom/kwad/sdk/core/response/model/AdInfo$AdConversionInfo;->retryH5TimeStep:I

    int-to-long v0, p4

    cmp-long p4, p1, v0

    if-gez p4, :cond_2

    .line 45
    invoke-static {p3}, Lcom/kwad/sdk/core/response/b/a;->aR(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 46
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->getContext()Landroid/content/Context;

    move-result-object p1

    iget-object p2, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {p1, p2}, Lcom/kwad/components/core/page/AdWebViewActivityProxy;->launch(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    const/4 p1, 0x1

    .line 47
    iput-boolean p1, p0, Lcom/kwad/components/core/e/d/c;->Lv:Z

    :cond_2
    return-void
.end method

.method public final a(Ljava/lang/String;Lcom/kwad/sdk/core/download/e;)V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iget-object v0, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->downloadId:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    const/4 v0, 0x1

    iput v0, p1, Lcom/kwad/sdk/core/response/model/AdInfo;->status:I

    .line 4
    invoke-direct {p0}, Lcom/kwad/components/core/e/d/c;->oz()V

    .line 5
    invoke-virtual {p2}, Lcom/kwad/sdk/core/download/e;->DS()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 6
    iget-object p1, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p1, Lcom/kwad/sdk/core/response/model/AdInfo;->mStartDownloadTime:J

    .line 7
    iget-object p1, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {p1}, Lcom/kwad/sdk/core/adlog/c;->bH(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 8
    invoke-virtual {p2}, Lcom/kwad/sdk/core/download/e;->DR()V

    .line 9
    iget-object p1, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {p1}, Lcom/kwad/sdk/commercial/a/a;->o(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    :cond_1
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Lcom/kwad/sdk/core/download/e;)V
    .locals 2

    .line 16
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iget-object v0, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->downloadId:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 17
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iput-object p2, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->downloadFilePath:Ljava/lang/String;

    const/16 p2, 0x64

    .line 18
    iput p2, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->progress:I

    const/16 p2, 0x8

    .line 19
    iput p2, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->status:I

    .line 20
    invoke-direct {p0}, Lcom/kwad/components/core/e/d/c;->oz()V

    .line 21
    invoke-virtual {p3}, Lcom/kwad/sdk/core/download/e;->DS()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 22
    invoke-virtual {p3}, Lcom/kwad/sdk/core/download/e;->DR()V

    .line 23
    iget-object p2, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object p3, p0, Lcom/kwad/components/core/e/d/c;->mReportExtData:Lorg/json/JSONObject;

    invoke-static {p2, p3}, Lcom/kwad/sdk/core/adlog/c;->c(Lcom/kwad/sdk/core/response/model/AdTemplate;Lorg/json/JSONObject;)V

    .line 24
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p2

    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iget-wide v0, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->mStartDownloadTime:J

    sub-long/2addr p2, v0

    .line 25
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0, p2, p3}, Lcom/kwad/sdk/commercial/a/a;->j(Lcom/kwad/sdk/core/response/model/AdTemplate;J)V

    .line 26
    invoke-static {}, Lcom/kwad/sdk/core/a;->BK()Lcom/kwad/sdk/core/a;

    move-result-object p2

    iget-object p3, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {p2, p1, p3}, Lcom/kwad/sdk/core/a;->e(Ljava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 27
    new-instance p1, Lcom/kwad/components/core/e/d/c$1;

    invoke-direct {p1, p0}, Lcom/kwad/components/core/e/d/c$1;-><init>(Lcom/kwad/components/core/e/d/c;)V

    invoke-static {p1}, Lcom/kwad/sdk/utils/g;->execute(Ljava/lang/Runnable;)V

    .line 28
    invoke-static {}, Lcom/kwad/sdk/a/a/c;->Au()Lcom/kwad/sdk/a/a/c;

    move-result-object p1

    iget-object p2, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {p1, p2}, Lcom/kwad/sdk/a/a/c;->aQ(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 29
    invoke-static {}, Lcom/kwad/sdk/a/a/c;->Au()Lcom/kwad/sdk/a/a/c;

    move-result-object p1

    iget-object p2, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {p1, p2}, Lcom/kwad/sdk/a/a/c;->aO(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 30
    invoke-static {}, Lcom/kwad/sdk/a/a/b;->Ar()Lcom/kwad/sdk/a/a/b;

    move-result-object p1

    iget-object p2, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {p1, p2}, Lcom/kwad/sdk/a/a/b;->aJ(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 31
    invoke-static {}, Lcom/kwad/sdk/core/diskcache/ApkCacheManager;->getInstance()Lcom/kwad/sdk/core/diskcache/ApkCacheManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/kwad/sdk/core/diskcache/ApkCacheManager;->DB()V

    :cond_1
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/Throwable;Lcom/kwad/sdk/core/download/e;)V
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iget-object v0, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->downloadId:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 49
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    const/16 v0, 0xb

    iput v0, p1, Lcom/kwad/sdk/core/response/model/AdInfo;->status:I

    .line 50
    invoke-direct {p0}, Lcom/kwad/components/core/e/d/c;->oz()V

    .line 51
    invoke-virtual {p3}, Lcom/kwad/sdk/core/download/e;->DS()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 52
    invoke-virtual {p3}, Lcom/kwad/sdk/core/download/e;->DR()V

    .line 53
    iget-object p1, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const p3, 0x186a3

    .line 54
    invoke-static {p2}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p2

    .line 55
    invoke-static {p1, p3, p2}, Lcom/kwad/sdk/commercial/a/a;->i(Lcom/kwad/sdk/core/response/model/AdTemplate;ILjava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final as(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iput p1, v0, Lcom/kwad/sdk/core/response/model/AdTemplate;->downloadSource:I

    return-void
.end method

.method public final b(Lcom/kwad/sdk/api/KsAppDownloadListener;)V
    .locals 2
    .annotation build Landroidx/annotation/UiThread;
    .end annotation

    if-nez p1, :cond_0

    return-void

    .line 21
    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_1

    .line 22
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->Ly:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 23
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->Ly:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    goto :goto_0

    .line 24
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->fS:Landroid/os/Handler;

    new-instance v1, Lcom/kwad/components/core/e/d/c$7;

    invoke-direct {v1, p0, p1}, Lcom/kwad/components/core/e/d/c$7;-><init>(Lcom/kwad/components/core/e/d/c;Lcom/kwad/sdk/api/KsAppDownloadListener;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 25
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/c;->oA()V

    .line 26
    invoke-direct {p0, p1}, Lcom/kwad/components/core/e/d/c;->a(Lcom/kwad/sdk/api/KsAppDownloadListener;)V

    return-void
.end method

.method public final b(Ljava/lang/String;Lcom/kwad/sdk/core/download/e;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iget-object v0, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->downloadId:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iget p1, p1, Lcom/kwad/sdk/core/response/model/AdInfo;->status:I

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    invoke-virtual {p2}, Lcom/kwad/sdk/core/download/e;->DS()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 3
    iget-object p1, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v1, p0, Lcom/kwad/components/core/e/d/c;->mReportExtData:Lorg/json/JSONObject;

    invoke-static {p1, v1}, Lcom/kwad/sdk/core/adlog/c;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lorg/json/JSONObject;)V

    .line 4
    invoke-virtual {p2}, Lcom/kwad/sdk/core/download/e;->DR()V

    .line 5
    iget-object p1, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {p1}, Lcom/kwad/sdk/commercial/a/a;->aV(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 6
    :cond_1
    iget-object p1, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iput v0, p1, Lcom/kwad/sdk/core/response/model/AdInfo;->status:I

    .line 7
    invoke-direct {p0}, Lcom/kwad/components/core/e/d/c;->oz()V

    return-void
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;Lcom/kwad/sdk/core/download/e;)V
    .locals 0

    .line 8
    iget-object p1, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    const/16 p2, 0xc

    iput p2, p1, Lcom/kwad/sdk/core/response/model/AdInfo;->status:I

    .line 9
    invoke-direct {p0}, Lcom/kwad/components/core/e/d/c;->oz()V

    .line 10
    invoke-virtual {p3}, Lcom/kwad/sdk/core/download/e;->DS()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 11
    iget-object p1, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object p2, p0, Lcom/kwad/components/core/e/d/c;->mReportExtData:Lorg/json/JSONObject;

    invoke-static {p1, p2}, Lcom/kwad/sdk/core/adlog/c;->e(Lcom/kwad/sdk/core/response/model/AdTemplate;Lorg/json/JSONObject;)V

    .line 12
    invoke-virtual {p3}, Lcom/kwad/sdk/core/download/e;->DR()V

    .line 13
    iget-object p1, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {p1}, Lcom/kwad/sdk/commercial/a/a;->ba(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 14
    invoke-direct {p0}, Lcom/kwad/components/core/e/d/c;->oy()Z

    move-result p1

    .line 15
    invoke-static {}, Lcom/kwad/sdk/a/a/c;->Au()Lcom/kwad/sdk/a/a/c;

    move-result-object p2

    iget-object p3, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {p2, p3}, Lcom/kwad/sdk/a/a/c;->aR(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 16
    invoke-static {}, Lcom/kwad/sdk/a/a/c;->Au()Lcom/kwad/sdk/a/a/c;

    move-result-object p2

    iget-object p3, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {p2, p3}, Lcom/kwad/sdk/a/a/c;->aP(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 17
    invoke-static {}, Lcom/kwad/sdk/a/a/b;->Ar()Lcom/kwad/sdk/a/a/b;

    move-result-object p2

    iget-object p3, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {p2, p3}, Lcom/kwad/sdk/a/a/b;->aK(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 18
    invoke-static {}, Lcom/kwad/components/core/e/a/e;->nE()Lcom/kwad/components/core/e/a/e;

    move-result-object p2

    iget-object p3, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {p2, p3}, Lcom/kwad/components/core/e/a/e;->an(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 19
    invoke-static {}, Lcom/kwad/sdk/core/a;->BK()Lcom/kwad/sdk/core/a;

    move-result-object p2

    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/c;->ow()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/kwad/sdk/core/a;->df(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 20
    :goto_0
    new-instance p2, Lcom/kwad/components/core/e/d/c$2;

    invoke-direct {p2, p0, p1}, Lcom/kwad/components/core/e/d/c$2;-><init>(Lcom/kwad/components/core/e/d/c;Z)V

    invoke-static {p2}, Lcom/kwad/sdk/utils/g;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final c(Lcom/kwad/sdk/api/KsAppDownloadListener;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 9
    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_1

    .line 10
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->Ly:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void

    .line 11
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->fS:Landroid/os/Handler;

    new-instance v1, Lcom/kwad/components/core/e/d/c$8;

    invoke-direct {v1, p0, p1}, Lcom/kwad/components/core/e/d/c$8;-><init>(Lcom/kwad/components/core/e/d/c;Lcom/kwad/sdk/api/KsAppDownloadListener;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final c(Ljava/lang/String;Lcom/kwad/sdk/core/download/e;)V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iget-object v0, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->downloadId:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iget p1, p1, Lcom/kwad/sdk/core/response/model/AdInfo;->status:I

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    invoke-virtual {p2}, Lcom/kwad/sdk/core/download/e;->DS()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 4
    iget-object p1, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v1, p0, Lcom/kwad/components/core/e/d/c;->mReportExtData:Lorg/json/JSONObject;

    invoke-static {p1, v1}, Lcom/kwad/sdk/core/adlog/c;->b(Lcom/kwad/sdk/core/response/model/AdTemplate;Lorg/json/JSONObject;)V

    .line 5
    invoke-virtual {p2}, Lcom/kwad/sdk/core/download/e;->DR()V

    .line 6
    iget-object p1, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {p1}, Lcom/kwad/sdk/commercial/a/a;->aW(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 7
    :cond_1
    iget-object p1, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iput v0, p1, Lcom/kwad/sdk/core/response/model/AdInfo;->status:I

    .line 8
    invoke-direct {p0}, Lcom/kwad/components/core/e/d/c;->oz()V

    return-void
.end method

.method public final clear()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/c;->oJ()V

    .line 2
    invoke-static {}, Lcom/kwad/sdk/core/download/b;->DO()Lcom/kwad/sdk/core/download/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/kwad/sdk/core/download/b;->a(Lcom/kwad/sdk/core/download/c;)V

    .line 3
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->CU()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    invoke-static {}, Lcom/kwad/sdk/core/NetworkMonitor;->getInstance()Lcom/kwad/sdk/core/NetworkMonitor;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/kwad/sdk/core/NetworkMonitor;->a(Lcom/kwad/sdk/core/NetworkMonitor$a;)V

    :cond_0
    return-void
.end method

.method public final d(Lcom/kwad/sdk/api/KsAppDownloadListener;)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/c;->oA()V

    .line 13
    invoke-direct {p0, p1}, Lcom/kwad/components/core/e/d/c;->a(Lcom/kwad/sdk/api/KsAppDownloadListener;)V

    return-void
.end method

.method public final d(Ljava/lang/String;Lcom/kwad/sdk/core/download/e;)V
    .locals 2

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iget-object v0, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->downloadId:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iget p1, p1, Lcom/kwad/sdk/core/response/model/AdInfo;->status:I

    const/4 v0, 0x5

    if-eq p1, v0, :cond_1

    invoke-virtual {p2}, Lcom/kwad/sdk/core/download/e;->DS()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 5
    iget-object p1, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v1, p0, Lcom/kwad/components/core/e/d/c;->mReportExtData:Lorg/json/JSONObject;

    invoke-static {p1, v1}, Lcom/kwad/sdk/core/adlog/c;->d(Lcom/kwad/sdk/core/response/model/AdTemplate;Lorg/json/JSONObject;)V

    .line 6
    invoke-virtual {p2}, Lcom/kwad/sdk/core/download/e;->DR()V

    .line 7
    iget-object p1, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {p1}, Lcom/kwad/sdk/commercial/a/a;->aX(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 8
    :cond_1
    invoke-static {}, Lcom/kwad/sdk/a/a/c;->Au()Lcom/kwad/sdk/a/a/c;

    move-result-object p1

    iget-object p2, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {p1, p2}, Lcom/kwad/sdk/a/a/c;->aP(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 9
    invoke-static {}, Lcom/kwad/sdk/a/a/b;->Ar()Lcom/kwad/sdk/a/a/b;

    move-result-object p1

    iget-object p2, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {p1, p2}, Lcom/kwad/sdk/a/a/b;->aK(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 10
    iget-object p1, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iput v0, p1, Lcom/kwad/sdk/core/response/model/AdInfo;->status:I

    .line 11
    invoke-direct {p0}, Lcom/kwad/components/core/e/d/c;->oz()V

    return-void
.end method

.method public final d(Lorg/json/JSONObject;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/kwad/components/core/e/d/c;->mReportExtData:Lorg/json/JSONObject;

    return-void
.end method

.method public final e(Ljava/lang/String;Lcom/kwad/sdk/core/download/e;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iget-object v0, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->downloadId:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    const/16 v0, 0x9

    iput v0, p1, Lcom/kwad/sdk/core/response/model/AdInfo;->status:I

    .line 4
    invoke-direct {p0}, Lcom/kwad/components/core/e/d/c;->oz()V

    .line 5
    invoke-virtual {p2}, Lcom/kwad/sdk/core/download/e;->DS()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 6
    iget-object p1, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/4 v0, 0x2

    .line 7
    invoke-static {p1, v0}, Lcom/kwad/sdk/core/adlog/c;->h(Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    .line 8
    invoke-virtual {p2}, Lcom/kwad/sdk/core/download/e;->DR()V

    .line 9
    iget-object p1, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {p1}, Lcom/kwad/sdk/commercial/a/a;->aZ(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    :cond_1
    return-void
.end method

.method public final f(Ljava/lang/String;Lcom/kwad/sdk/core/download/e;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iget-object v0, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->downloadId:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/c;->oA()V

    .line 3
    invoke-virtual {p2}, Lcom/kwad/sdk/core/download/e;->DS()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 4
    invoke-virtual {p2}, Lcom/kwad/sdk/core/download/e;->DR()V

    .line 5
    iget-object p1, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {p1}, Lcom/kwad/sdk/commercial/a/a;->bb(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    :cond_1
    return-void
.end method

.method public final g(Ljava/lang/String;Lcom/kwad/sdk/core/download/e;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iget-object v0, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->downloadId:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p2}, Lcom/kwad/sdk/core/download/e;->DS()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 3
    invoke-virtual {p2}, Lcom/kwad/sdk/core/download/e;->DR()V

    .line 4
    iget-object p1, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {p1}, Lcom/kwad/sdk/core/adlog/c;->bI(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 5
    iget-object p1, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {p1}, Lcom/kwad/sdk/commercial/a/a;->aY(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    :cond_1
    return-void
.end method

.method public final oA()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iget-object v0, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->adBaseInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdBaseInfo;

    iget-object v0, v0, Lcom/kwad/sdk/core/response/model/AdInfo$AdBaseInfo;->appPackageName:Ljava/lang/String;

    .line 2
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 3
    invoke-static {v1, v0}, Lcom/kwad/sdk/utils/al;->an(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    const/16 v1, 0xc

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iput v1, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->status:I

    return-void

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iget v2, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->status:I

    const/4 v3, 0x0

    if-ne v2, v1, :cond_1

    .line 6
    iput v3, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->status:I

    .line 7
    iput v3, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->progress:I

    .line 8
    :cond_1
    iget v1, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->status:I

    const/16 v2, 0x8

    if-eq v1, v2, :cond_2

    const/16 v4, 0x9

    if-ne v1, v4, :cond_4

    .line 9
    :cond_2
    iget-object v0, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->downloadFilePath:Ljava/lang/String;

    .line 10
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_4

    .line 11
    :cond_3
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iput v3, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->status:I

    .line 12
    iput v3, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->progress:I

    .line 13
    :cond_4
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iget v1, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->status:I

    if-nez v1, :cond_5

    .line 14
    invoke-static {v0}, Lcom/kwad/sdk/core/download/a;->H(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v0

    .line 15
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_5

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 16
    iget-object v1, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iput-object v0, v1, Lcom/kwad/sdk/core/response/model/AdInfo;->downloadFilePath:Ljava/lang/String;

    .line 17
    iput v2, v1, Lcom/kwad/sdk/core/response/model/AdInfo;->status:I

    :cond_5
    return-void
.end method

.method public final oB()Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object v0
.end method

.method public final oD()I
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/components/core/e/d/c$5;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/e/d/c$5;-><init>(Lcom/kwad/components/core/e/d/c;)V

    invoke-static {v0}, Lcom/kwad/sdk/utils/g;->execute(Ljava/lang/Runnable;)V

    .line 2
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    .line 3
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->ax(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-static {v0, v1}, Lcom/kwad/sdk/utils/al;->ap(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/adlog/c;->bJ(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    :cond_0
    const/4 v0, 0x6

    return v0
.end method

.method public final oF()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iget-object v0, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->downloadFilePath:Ljava/lang/String;

    new-instance v1, Lcom/kwad/components/core/e/d/c$6;

    invoke-direct {v1, p0}, Lcom/kwad/components/core/e/d/c$6;-><init>(Lcom/kwad/components/core/e/d/c;)V

    invoke-static {v0, v1}, Lcom/kwad/sdk/utils/al;->a(Ljava/lang/String;Lcom/kwad/sdk/utils/al$a;)Z

    const/4 v0, 0x7

    return v0
.end method

.method public final oG()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v0}, Lcom/kwad/sdk/core/download/a;->I(Lcom/kwad/sdk/core/response/model/AdInfo;)V

    const/4 v0, 0x3

    return v0
.end method

.method public final oH()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iget-object v0, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->downloadId:Ljava/lang/String;

    invoke-static {v0}, Lcom/kwad/sdk/core/download/a;->dG(Ljava/lang/String;)V

    const/4 v0, 0x4

    return v0
.end method

.method public final oI()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/c;->oG()I

    const/4 v0, 0x5

    return v0
.end method

.method public final oJ()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->Ly:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Ljava/util/List;->clear()V

    :cond_0
    return-void
.end method

.method public final ot()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/kwad/sdk/core/download/b;->DO()Lcom/kwad/sdk/core/download/b;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/core/e/d/c;->Lu:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {v0, p0, v1}, Lcom/kwad/sdk/core/download/b;->a(Lcom/kwad/sdk/core/download/c;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 2
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->CU()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-static {}, Lcom/kwad/sdk/core/NetworkMonitor;->getInstance()Lcom/kwad/sdk/core/NetworkMonitor;

    move-result-object v0

    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lcom/kwad/sdk/core/NetworkMonitor;->a(Landroid/content/Context;Lcom/kwad/sdk/core/NetworkMonitor$a;)V

    :cond_0
    return-void
.end method

.method public final ov()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/c;->oA()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iget v0, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->status:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 v0, 0x2

    :cond_0
    return v0
.end method

.method public final ow()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iget-object v0, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->downloadId:Ljava/lang/String;

    return-object v0
.end method

.method public final ox()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iget-object v0, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->adBaseInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdBaseInfo;

    iget-object v0, v0, Lcom/kwad/sdk/core/response/model/AdInfo$AdBaseInfo;->appPackageName:Ljava/lang/String;

    return-object v0
.end method

.method public final q(Lcom/kwad/components/core/e/d/a$a;)I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iget v0, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->status:I

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_0

    packed-switch v0, :pswitch_data_0

    return v1

    .line 2
    :pswitch_0
    invoke-direct {p0, p1}, Lcom/kwad/components/core/e/d/c;->z(Lcom/kwad/components/core/e/d/a$a;)I

    move-result p1

    return p1

    .line 3
    :pswitch_1
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/c;->oF()I

    move-result p1

    return p1

    .line 4
    :cond_0
    :pswitch_2
    invoke-direct {p0, p1}, Lcom/kwad/components/core/e/d/c;->t(Lcom/kwad/components/core/e/d/a$a;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/16 p1, 0xb

    return p1

    :cond_1
    return v1

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final r(Lcom/kwad/components/core/e/d/a$a;)I
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/kwad/components/core/e/d/c;->Lv:Z

    .line 2
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/c;->oA()V

    .line 3
    iget-object v1, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iget v1, v1, Lcom/kwad/sdk/core/response/model/AdInfo;->status:I

    packed-switch v1, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    .line 4
    :pswitch_1
    invoke-direct {p0, p1}, Lcom/kwad/components/core/e/d/c;->z(Lcom/kwad/components/core/e/d/a$a;)I

    move-result p1

    return p1

    .line 5
    :pswitch_2
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/c;->oF()I

    move-result p1

    return p1

    .line 6
    :pswitch_3
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/c;->oI()I

    move-result p1

    return p1

    .line 7
    :pswitch_4
    invoke-virtual {p1}, Lcom/kwad/components/core/e/d/a$a;->og()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Lcom/kwad/components/core/e/d/c;->downloadPauseEnable:Z

    if-eqz p1, :cond_0

    .line 8
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/c;->oH()I

    move-result p1

    return p1

    .line 9
    :pswitch_5
    invoke-direct {p0, p1}, Lcom/kwad/components/core/e/d/c;->u(Lcom/kwad/components/core/e/d/a$a;)I

    move-result p1

    return p1

    :cond_0
    :goto_0
    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final s(Lcom/kwad/components/core/e/d/a$a;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/e/d/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iget v0, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->status:I

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lcom/kwad/components/core/e/d/c;->t(Lcom/kwad/components/core/e/d/a$a;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/e/d/c;->mOnDismissListener:Landroid/content/DialogInterface$OnDismissListener;

    return-void
.end method

.method public final setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/e/d/c;->Lx:Landroid/content/DialogInterface$OnShowListener;

    return-void
.end method
