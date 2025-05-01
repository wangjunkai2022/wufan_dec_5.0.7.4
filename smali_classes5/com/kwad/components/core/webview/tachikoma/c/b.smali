.class public Lcom/kwad/components/core/webview/tachikoma/c/b;
.super Lcom/kwad/sdk/mvp/a;
.source "SourceFile"


# instance fields
.field public Tf:Lcom/kwad/components/core/webview/tachikoma/e/c;

.field public Th:Lcom/kwad/components/offline/api/tk/model/StyleTemplate;

.field public Zt:Lcom/kwad/components/core/webview/tachikoma/c/e;

.field public abl:Lcom/kwad/sdk/widget/e;

.field public abm:Lcom/kwad/sdk/components/k;

.field public abn:Lcom/kwad/components/core/webview/tachikoma/k;

.field public abo:Z

.field public abp:Lcom/kwad/components/core/webview/tachikoma/c/e$a;

.field public mActivity:Landroid/app/Activity;

.field public mAdResultData:Lcom/kwad/sdk/core/response/model/AdResultData;

.field public xo:Ljava/lang/String;

.field public xt:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/mvp/a;-><init>()V

    return-void
.end method


# virtual methods
.method public final d(Lcom/kwad/sdk/core/response/model/AdResultData;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/c/b;->mAdResultData:Lcom/kwad/sdk/core/response/model/AdResultData;

    .line 2
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/c;->n(Lcom/kwad/sdk/core/response/model/AdResultData;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-void
.end method

.method public release()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/b;->Zt:Lcom/kwad/components/core/webview/tachikoma/c/e;

    .line 2
    iput-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/b;->mActivity:Landroid/app/Activity;

    .line 3
    iput-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/b;->abl:Lcom/kwad/sdk/widget/e;

    return-void
.end method
