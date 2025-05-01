.class public final Lcom/kwad/components/core/e/a/f;
.super Lcom/kwad/sdk/mvp/Presenter;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/core/webview/tachikoma/j;
.implements Lcom/kwad/sdk/core/h/c;


# instance fields
.field private Kj:Lcom/kwad/components/core/widget/a/b;

.field private Kt:Lcom/kwad/components/core/e/a/a;

.field private cQ:Lcom/kwad/components/core/webview/jshandler/aw;

.field private gj:Lcom/kwad/components/core/webview/tachikoma/i;

.field private mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/mvp/Presenter;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/e/a/f;)Lcom/kwad/components/core/e/a/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/e/a/f;->Kt:Lcom/kwad/components/core/e/a/a;

    return-object p0
.end method

.method private ai(Z)V
    .locals 0

    if-nez p1, :cond_0

    .line 1
    iget-object p1, p0, Lcom/kwad/components/core/e/a/f;->Kt:Lcom/kwad/components/core/e/a/a;

    invoke-virtual {p1}, Lcom/kwad/components/core/e/a/a;->cR()V

    .line 2
    :cond_0
    new-instance p1, Lcom/kwad/components/core/e/a/f$2;

    invoke-direct {p1, p0}, Lcom/kwad/components/core/e/a/f$2;-><init>(Lcom/kwad/components/core/e/a/f;)V

    invoke-static {p1}, Lcom/kwad/sdk/utils/bo;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/components/core/webview/jshandler/a$a;)V
    .locals 0

    return-void
.end method

.method public final a(Lcom/kwad/components/core/webview/jshandler/aw;)V
    .locals 1

    .line 7
    iput-object p1, p0, Lcom/kwad/components/core/e/a/f;->cQ:Lcom/kwad/components/core/webview/jshandler/aw;

    .line 8
    iget-object v0, p0, Lcom/kwad/components/core/e/a/f;->Kt:Lcom/kwad/components/core/e/a/a;

    iput-object p1, v0, Lcom/kwad/components/core/e/a/a;->cQ:Lcom/kwad/components/core/webview/jshandler/aw;

    return-void
.end method

.method public final a(Lcom/kwad/components/core/webview/tachikoma/TKRenderFailReason;)V
    .locals 1

    const-string p1, "InstalledActivatePresenter"

    const-string v0, "onTkLoadFailed"

    .line 2
    invoke-static {p1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 3
    invoke-direct {p0, p1}, Lcom/kwad/components/core/e/a/f;->ai(Z)V

    return-void
.end method

.method public final a(Lcom/kwad/components/core/webview/tachikoma/a/o;)V
    .locals 0

    return-void
.end method

.method public final a(Lcom/kwad/components/core/webview/tachikoma/a/p;)V
    .locals 0

    return-void
.end method

.method public final a(Lcom/kwad/components/core/webview/tachikoma/b/m;)V
    .locals 0

    return-void
.end method

.method public final a(Lcom/kwad/components/core/webview/tachikoma/b/t;)V
    .locals 0

    return-void
.end method

.method public final a(Lcom/kwad/sdk/commercial/model/WebCloseStatus;)V
    .locals 0

    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lcom/kwad/components/core/e/a/f;->ai(Z)V

    return-void
.end method

.method public final a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/b;)V
    .locals 0

    return-void
.end method

.method public final a(Lcom/kwad/sdk/core/webview/d/b/a;)V
    .locals 1
    .param p1    # Lcom/kwad/sdk/core/webview/d/b/a;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    const-string p1, "InstalledActivatePresenter"

    const-string v0, "onAdClicked"

    .line 4
    invoke-static {p1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 5
    invoke-direct {p0, p1}, Lcom/kwad/components/core/e/a/f;->ai(Z)V

    return-void
.end method

.method public final aM()V
    .locals 2

    const-string v0, "InstalledActivatePresenter"

    const-string v1, "onPageVisible"

    .line 1
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/e/a/f;->cQ:Lcom/kwad/components/core/webview/jshandler/aw;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sZ()V

    :cond_0
    return-void
.end method

.method public final aN()V
    .locals 2

    const-string v0, "InstalledActivatePresenter"

    const-string v1, "onPageInvisible"

    .line 1
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/e/a/f;->cQ:Lcom/kwad/components/core/webview/jshandler/aw;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->ta()V

    :cond_0
    return-void
.end method

.method public final aj()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->aj()V

    .line 2
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->Kf()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/core/e/a/a;

    iput-object v0, p0, Lcom/kwad/components/core/e/a/f;->Kt:Lcom/kwad/components/core/e/a/a;

    .line 3
    iget-object v1, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iput-object v1, p0, Lcom/kwad/components/core/e/a/f;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 4
    iget-object v0, v0, Lcom/kwad/components/core/e/a/a;->Kj:Lcom/kwad/components/core/widget/a/b;

    iput-object v0, p0, Lcom/kwad/components/core/e/a/f;->Kj:Lcom/kwad/components/core/widget/a/b;

    .line 5
    new-instance v0, Lcom/kwad/components/core/e/a/f$1;

    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/kwad/components/core/e/a/f$1;-><init>(Lcom/kwad/components/core/e/a/f;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/kwad/components/core/e/a/f;->gj:Lcom/kwad/components/core/webview/tachikoma/i;

    .line 6
    iget-object v0, p0, Lcom/kwad/components/core/e/a/f;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/c;->dD(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdResultData;

    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/kwad/components/core/e/a/f;->gj:Lcom/kwad/components/core/webview/tachikoma/i;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0, p0}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Landroid/app/Activity;Lcom/kwad/sdk/core/response/model/AdResultData;Lcom/kwad/components/core/webview/tachikoma/j;)V

    .line 8
    iget-object v0, p0, Lcom/kwad/components/core/e/a/f;->Kj:Lcom/kwad/components/core/widget/a/b;

    invoke-virtual {v0, p0}, Lcom/kwad/components/core/widget/a/a;->a(Lcom/kwad/sdk/core/h/c;)V

    return-void
.end method

.method public final b(Lcom/kwad/components/core/webview/jshandler/ac$a;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/c/a/a;->aW(Landroid/content/Context;)F

    move-result v0

    .line 2
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/c/a/a;->getScreenHeight(Landroid/content/Context;)I

    move-result v1

    int-to-float v1, v1

    .line 3
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/kwad/sdk/c/a/a;->getScreenWidth(Landroid/content/Context;)I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, v0

    const/high16 v3, 0x3f000000    # 0.5f

    add-float/2addr v2, v3

    float-to-int v2, v2

    .line 4
    iput v2, p1, Lcom/kwad/components/core/webview/jshandler/ac$a;->width:I

    div-float/2addr v1, v0

    add-float/2addr v1, v3

    float-to-int v0, v1

    .line 5
    iput v0, p1, Lcom/kwad/components/core/webview/jshandler/ac$a;->height:I

    return-void
.end method

.method public final bF()V
    .locals 2

    const-string v0, "InstalledActivatePresenter"

    const-string v1, "onTkLoadSuccess"

    .line 1
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/e/a/f;->Kt:Lcom/kwad/components/core/e/a/a;

    invoke-virtual {v0}, Lcom/kwad/components/core/e/a/a;->bv()V

    return-void
.end method

.method public final bG()V
    .locals 0

    return-void
.end method

.method public final getTKContainer()Landroid/widget/FrameLayout;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/e/a/f;->Kt:Lcom/kwad/components/core/e/a/a;

    iget-object v0, v0, Lcom/kwad/components/core/e/a/a;->Ki:Lcom/kwad/components/core/e/a/g;

    return-object v0
.end method

.method public final getTKReaderScene()Ljava/lang/String;
    .locals 1

    const-string v0, "tk_installed_activate"

    return-object v0
.end method

.method public final getTkTemplateId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/e/a/f;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/b;->cg(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdMatrixInfo$AdDataV2;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$AdDataV2;->installedActivateInfo:Lcom/kwad/sdk/core/response/model/AdMatrixInfo$InstalledActivateInfo;

    iget-object v0, v0, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$BaseMatrixTemplate;->templateId:Ljava/lang/String;

    return-object v0
.end method

.method public final getTouchCoordsView()Lcom/kwad/sdk/widget/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/e/a/f;->Kt:Lcom/kwad/components/core/e/a/a;

    iget-object v0, v0, Lcom/kwad/components/core/e/a/a;->Ki:Lcom/kwad/components/core/e/a/g;

    return-object v0
.end method

.method public final onUnbind()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onUnbind()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/e/a/f;->gj:Lcom/kwad/components/core/webview/tachikoma/i;

    invoke-virtual {v0}, Lcom/kwad/components/core/webview/tachikoma/i;->jq()V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/e/a/f;->Kj:Lcom/kwad/components/core/widget/a/b;

    invoke-virtual {v0, p0}, Lcom/kwad/components/core/widget/a/a;->b(Lcom/kwad/sdk/core/h/c;)V

    return-void
.end method
