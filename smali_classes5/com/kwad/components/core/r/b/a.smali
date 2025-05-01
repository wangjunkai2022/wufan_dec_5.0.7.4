.class public final Lcom/kwad/components/core/r/b/a;
.super Lcom/kwad/sdk/mvp/Presenter;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/core/webview/tachikoma/j;


# instance fields
.field private Tr:Landroid/widget/FrameLayout;

.field private Ts:Lcom/kwad/components/core/webview/jshandler/aw;

.field protected Tt:Z

.field protected Tu:Lcom/kwad/components/core/r/a/b;

.field private Tv:Lcom/kwad/components/core/l/a/a;

.field private gj:Lcom/kwad/components/core/webview/tachikoma/i;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/mvp/Presenter;-><init>()V

    .line 2
    new-instance v0, Lcom/kwad/components/core/r/b/a$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/r/b/a$1;-><init>(Lcom/kwad/components/core/r/b/a;)V

    iput-object v0, p0, Lcom/kwad/components/core/r/b/a;->Tv:Lcom/kwad/components/core/l/a/a;

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/r/b/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/r/b/a;->rv()V

    return-void
.end method

.method static synthetic b(Lcom/kwad/components/core/r/b/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/r/b/a;->rw()V

    return-void
.end method

.method static synthetic c(Lcom/kwad/components/core/r/b/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/r/b/a;->rx()V

    return-void
.end method

.method private ru()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/r/b/a;->Ts:Lcom/kwad/components/core/webview/jshandler/aw;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-boolean v1, p0, Lcom/kwad/components/core/r/b/a;->Tt:Z

    if-nez v1, :cond_1

    .line 3
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sV()V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/core/r/b/a;->Ts:Lcom/kwad/components/core/webview/jshandler/aw;

    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sW()V

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/kwad/components/core/r/b/a;->Tt:Z

    return-void

    .line 6
    :cond_1
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sZ()V

    return-void
.end method

.method private rv()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/r/b/a;->ru()V

    return-void
.end method

.method private rw()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/r/b/a;->Ts:Lcom/kwad/components/core/webview/jshandler/aw;

    if-eqz v0, :cond_1

    iget-boolean v1, p0, Lcom/kwad/components/core/r/b/a;->Tt:Z

    if-nez v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->ta()V

    :cond_1
    :goto_0
    return-void
.end method

.method private rx()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/r/b/a;->Ts:Lcom/kwad/components/core/webview/jshandler/aw;

    if-eqz v0, :cond_1

    iget-boolean v1, p0, Lcom/kwad/components/core/r/b/a;->Tt:Z

    if-nez v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sX()V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/r/b/a;->Ts:Lcom/kwad/components/core/webview/jshandler/aw;

    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sY()V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/core/r/b/a;->Tu:Lcom/kwad/components/core/r/a/b;

    iget-object v0, v0, Lcom/kwad/components/core/r/a/b;->Tk:Lcom/kwad/sdk/components/l;

    if-eqz v0, :cond_1

    .line 5
    invoke-interface {v0}, Lcom/kwad/sdk/components/l;->callbackDismiss()V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/components/core/webview/jshandler/a$a;)V
    .locals 0

    return-void
.end method

.method public final a(Lcom/kwad/components/core/webview/jshandler/aw;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/kwad/components/core/r/b/a;->Ts:Lcom/kwad/components/core/webview/jshandler/aw;

    return-void
.end method

.method public final a(Lcom/kwad/components/core/webview/tachikoma/TKRenderFailReason;)V
    .locals 0

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

    .line 2
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getActivity()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/b;)V
    .locals 0

    return-void
.end method

.method public final a(Lcom/kwad/sdk/core/webview/d/b/a;)V
    .locals 0
    .param p1    # Lcom/kwad/sdk/core/webview/d/b/a;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    return-void
.end method

.method public final aj()V
    .locals 4

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->aj()V

    .line 2
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->Kf()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/core/r/a/b;

    iput-object v0, p0, Lcom/kwad/components/core/r/b/a;->Tu:Lcom/kwad/components/core/r/a/b;

    .line 3
    sget v0, Lcom/kwad/sdk/R$id;->ksad_js_container:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/kwad/components/core/r/b/a;->Tr:Landroid/widget/FrameLayout;

    .line 4
    new-instance v0, Lcom/kwad/components/core/webview/tachikoma/i;

    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v1

    const/16 v2, 0x3e8

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/kwad/components/core/webview/tachikoma/i;-><init>(Landroid/content/Context;II)V

    iput-object v0, p0, Lcom/kwad/components/core/r/b/a;->gj:Lcom/kwad/components/core/webview/tachikoma/i;

    .line 5
    iget-object v1, p0, Lcom/kwad/components/core/r/b/a;->Tu:Lcom/kwad/components/core/r/a/b;

    iget-object v1, v1, Lcom/kwad/components/core/r/a/b;->Th:Lcom/kwad/components/offline/api/tk/model/StyleTemplate;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/components/offline/api/tk/model/StyleTemplate;)V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/core/r/b/a;->Tu:Lcom/kwad/components/core/r/a/b;

    iget-object v0, v0, Lcom/kwad/components/core/r/a/b;->Tk:Lcom/kwad/sdk/components/l;

    if-eqz v0, :cond_0

    .line 7
    iget-object v1, p0, Lcom/kwad/components/core/r/b/a;->gj:Lcom/kwad/components/core/webview/tachikoma/i;

    invoke-interface {v0, v1}, Lcom/kwad/sdk/components/l;->a(Lcom/kwad/sdk/components/o;)V

    .line 8
    iget-object v0, p0, Lcom/kwad/components/core/r/b/a;->gj:Lcom/kwad/components/core/webview/tachikoma/i;

    new-instance v1, Lcom/kwad/components/core/r/b/a$2;

    invoke-direct {v1, p0}, Lcom/kwad/components/core/r/b/a$2;-><init>(Lcom/kwad/components/core/r/b/a;)V

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/sdk/core/webview/c/g;)V

    .line 9
    iget-object v0, p0, Lcom/kwad/components/core/r/b/a;->gj:Lcom/kwad/components/core/webview/tachikoma/i;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v2, "hasTKBridge"

    invoke-virtual {v0, v2, v1}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/r/b/a;->gj:Lcom/kwad/components/core/webview/tachikoma/i;

    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getActivity()Landroid/app/Activity;

    move-result-object v1

    iget-object v2, p0, Lcom/kwad/components/core/r/b/a;->Tu:Lcom/kwad/components/core/r/a/b;

    iget-object v2, v2, Lcom/kwad/components/core/r/a/b;->mAdResultData:Lcom/kwad/sdk/core/response/model/AdResultData;

    invoke-virtual {v0, v1, v2, p0}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Landroid/app/Activity;Lcom/kwad/sdk/core/response/model/AdResultData;Lcom/kwad/components/core/webview/tachikoma/j;)V

    .line 11
    iget-object v0, p0, Lcom/kwad/components/core/r/b/a;->Tu:Lcom/kwad/components/core/r/a/b;

    iget-object v0, v0, Lcom/kwad/components/core/l/a;->MU:Ljava/util/List;

    iget-object v1, p0, Lcom/kwad/components/core/r/b/a;->Tv:Lcom/kwad/components/core/l/a/a;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final b(Lcom/kwad/components/core/webview/jshandler/ac$a;)V
    .locals 3

    .line 2
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/c/a/a;->aW(Landroid/content/Context;)F

    move-result v0

    .line 3
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/utils/bj;->getScreenWidth(Landroid/content/Context;)I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v1, v0

    const/high16 v2, 0x3f000000    # 0.5f

    add-float/2addr v1, v2

    float-to-int v1, v1

    iput v1, p1, Lcom/kwad/components/core/webview/jshandler/ac$a;->width:I

    .line 4
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/utils/bj;->getScreenHeight(Landroid/content/Context;)I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v1, v0

    add-float/2addr v1, v2

    float-to-int v0, v1

    iput v0, p1, Lcom/kwad/components/core/webview/jshandler/ac$a;->height:I

    return-void
.end method

.method public final bF()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/r/b/a;->ru()V

    return-void
.end method

.method public final bG()V
    .locals 0

    return-void
.end method

.method public final getTKContainer()Landroid/widget/FrameLayout;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/r/b/a;->Tr:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method public final getTKReaderScene()Ljava/lang/String;
    .locals 1

    const-string v0, "tk_activity"

    return-object v0
.end method

.method public final getTkTemplateId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/r/b/a;->Tu:Lcom/kwad/components/core/r/a/b;

    iget-object v0, v0, Lcom/kwad/components/core/r/a/b;->Th:Lcom/kwad/components/offline/api/tk/model/StyleTemplate;

    iget-object v0, v0, Lcom/kwad/components/offline/api/tk/model/StyleTemplate;->templateId:Ljava/lang/String;

    return-object v0
.end method

.method public final getTouchCoordsView()Lcom/kwad/sdk/widget/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/r/b/a;->Tu:Lcom/kwad/components/core/r/a/b;

    iget-object v0, v0, Lcom/kwad/components/core/r/a/b;->mRootContainer:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

    return-object v0
.end method

.method public final onCreate()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onCreate()V

    return-void
.end method

.method public final onUnbind()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onUnbind()V

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/core/r/b/a;->rx()V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/r/b/a;->gj:Lcom/kwad/components/core/webview/tachikoma/i;

    invoke-virtual {v0}, Lcom/kwad/components/core/webview/tachikoma/i;->jq()V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/core/r/b/a;->Tu:Lcom/kwad/components/core/r/a/b;

    iget-object v0, v0, Lcom/kwad/components/core/l/a;->MU:Ljava/util/List;

    iget-object v1, p0, Lcom/kwad/components/core/r/b/a;->Tv:Lcom/kwad/components/core/l/a/a;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method
