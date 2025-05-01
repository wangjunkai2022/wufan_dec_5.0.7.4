.class public final Lcom/kwad/components/ad/i/d;
.super Lcom/kwad/sdk/widget/KSFrameLayout;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/core/webview/tachikoma/j;
.implements Lcom/kwad/sdk/core/h/c;


# static fields
.field public static nV:Ljava/lang/String; = "PUSH_VIEW_TAG"


# instance fields
.field private final bQ:Lcom/kwad/components/core/widget/a/b;

.field private cQ:Lcom/kwad/components/core/webview/jshandler/aw;

.field private gj:Lcom/kwad/components/core/webview/tachikoma/i;

.field private nW:Lcom/kwad/sdk/core/response/model/AdTemplate;

.field private nX:Lcom/kwad/components/ad/b/a/b;

.field private nY:Z

.field private nZ:Landroid/view/ViewGroup;

.field private oa:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/sdk/widget/KSFrameLayout;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/kwad/components/ad/i/d;->nY:Z

    .line 3
    sget-object p1, Lcom/kwad/components/ad/i/d;->nV:Ljava/lang/String;

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->setTag(Ljava/lang/Object;)V

    .line 4
    iput-object p2, p0, Lcom/kwad/components/ad/i/d;->nW:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 5
    new-instance p1, Lcom/kwad/components/core/widget/a/b;

    const/16 p2, 0x64

    invoke-direct {p1, p0, p2}, Lcom/kwad/components/core/widget/a/b;-><init>(Landroid/view/View;I)V

    iput-object p1, p0, Lcom/kwad/components/ad/i/d;->bQ:Lcom/kwad/components/core/widget/a/b;

    .line 6
    new-instance p1, Lcom/kwad/components/ad/i/d$1;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object p2

    const-wide/16 v0, -0x1

    invoke-direct {p1, p0, v0, v1, p2}, Lcom/kwad/components/ad/i/d$1;-><init>(Lcom/kwad/components/ad/i/d;JLandroid/content/Context;)V

    iput-object p1, p0, Lcom/kwad/components/ad/i/d;->gj:Lcom/kwad/components/core/webview/tachikoma/i;

    .line 7
    iget-object p1, p0, Lcom/kwad/components/ad/i/d;->nW:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/c;->dD(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdResultData;

    move-result-object p1

    .line 8
    iget-object p2, p0, Lcom/kwad/components/ad/i/d;->gj:Lcom/kwad/components/core/webview/tachikoma/i;

    const/4 v0, 0x0

    invoke-virtual {p2, v0, p1, p0}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Landroid/app/Activity;Lcom/kwad/sdk/core/response/model/AdResultData;Lcom/kwad/components/core/webview/tachikoma/j;)V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/i/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/i/d;->eR()V

    return-void
.end method

.method private destroy()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/i/d;->gj:Lcom/kwad/components/core/webview/tachikoma/i;

    invoke-virtual {v0}, Lcom/kwad/components/core/webview/tachikoma/i;->jq()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/i/d;->nZ:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 4
    :cond_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 5
    instance-of v1, v0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_1

    .line 6
    check-cast v0, Landroid/view/ViewGroup;

    .line 7
    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method private eR()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/ad/i/d;->oa:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/ad/i/d;->oa:Z

    .line 3
    invoke-direct {p0}, Lcom/kwad/components/ad/i/d;->eU()V

    .line 4
    invoke-direct {p0}, Lcom/kwad/components/ad/i/d;->destroy()V

    return-void
.end method

.method private eS()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/i/d;->nX:Lcom/kwad/components/ad/b/a/b;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/kwad/components/ad/b/a/b;->T()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/i/d;->cQ:Lcom/kwad/components/core/webview/jshandler/aw;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sV()V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/i/d;->cQ:Lcom/kwad/components/core/webview/jshandler/aw;

    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sW()V

    :cond_1
    return-void
.end method

.method private eU()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/i/d;->nX:Lcom/kwad/components/ad/b/a/b;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/kwad/components/ad/b/a/b;->U()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/i/d;->cQ:Lcom/kwad/components/core/webview/jshandler/aw;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sX()V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/i/d;->cQ:Lcom/kwad/components/core/webview/jshandler/aw;

    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sY()V

    :cond_1
    return-void
.end method

.method private eV()Z
    .locals 4

    const/4 v0, 0x0

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/core/c/b;->En()Lcom/kwad/sdk/core/c/b;

    invoke-static {}, Lcom/kwad/sdk/core/c/b;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 2
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v2

    const v3, 0x1020002

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 4
    instance-of v3, v2, Landroid/view/ViewGroup;

    if-nez v3, :cond_1

    return v0

    .line 5
    :cond_1
    check-cast v2, Landroid/view/ViewGroup;

    iput-object v2, p0, Lcom/kwad/components/ad/i/d;->nZ:Landroid/view/ViewGroup;

    .line 6
    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    const/4 v3, -0x1

    invoke-direct {v2, v3, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 7
    iget-object v3, p0, Lcom/kwad/components/ad/i/d;->nZ:Landroid/view/ViewGroup;

    invoke-virtual {v3, p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 8
    invoke-static {}, Lcom/kwad/sdk/core/c/b;->En()Lcom/kwad/sdk/core/c/b;

    new-instance v2, Lcom/kwad/components/ad/i/d$2;

    invoke-direct {v2, p0, v1}, Lcom/kwad/components/ad/i/d$2;-><init>(Lcom/kwad/components/ad/i/d;Landroid/app/Activity;)V

    invoke-static {v2}, Lcom/kwad/sdk/core/c/b;->a(Lcom/kwad/sdk/core/c/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x1

    :cond_2
    :goto_0
    return v0

    :catchall_0
    move-exception v1

    .line 9
    invoke-static {v1}, Lcom/kwad/sdk/core/e/c;->printStackTrace(Ljava/lang/Throwable;)V

    return v0
.end method


# virtual methods
.method public final a(Lcom/kwad/components/core/webview/jshandler/a$a;)V
    .locals 0

    return-void
.end method

.method public final a(Lcom/kwad/components/core/webview/jshandler/aw;)V
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/kwad/components/ad/i/d;->cQ:Lcom/kwad/components/core/webview/jshandler/aw;

    return-void
.end method

.method public final a(Lcom/kwad/components/core/webview/tachikoma/TKRenderFailReason;)V
    .locals 1

    const-string p1, "PushAdView"

    const-string v0, "onTkLoadFailed"

    .line 2
    invoke-static {p1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 3
    iput-boolean p1, p0, Lcom/kwad/components/ad/i/d;->nY:Z

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
    .param p1    # Lcom/kwad/sdk/commercial/model/WebCloseStatus;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 6
    invoke-direct {p0}, Lcom/kwad/components/ad/i/d;->eR()V

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

    const-string p1, "PushAdView"

    const-string v0, "onAdClicked"

    .line 4
    invoke-static {p1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final aM()V
    .locals 2

    const-string v0, "PushAdView"

    const-string v1, "onPageVisible: "

    .line 1
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/i/d;->cQ:Lcom/kwad/components/core/webview/jshandler/aw;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sZ()V

    :cond_0
    return-void
.end method

.method public final aN()V
    .locals 2

    const-string v0, "PushAdView"

    const-string v1, "onPageInvisible: "

    .line 1
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/i/d;->cQ:Lcom/kwad/components/core/webview/jshandler/aw;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->ta()V

    :cond_0
    return-void
.end method

.method public final ac()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/widget/KSFrameLayout;->ac()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/i/d;->bQ:Lcom/kwad/components/core/widget/a/b;

    invoke-virtual {v0, p0}, Lcom/kwad/components/core/widget/a/a;->a(Lcom/kwad/sdk/core/h/c;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/i/d;->bQ:Lcom/kwad/components/core/widget/a/b;

    invoke-virtual {v0}, Lcom/kwad/components/core/widget/a/a;->ua()V

    return-void
.end method

.method public final ad()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/widget/KSFrameLayout;->ad()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/i/d;->bQ:Lcom/kwad/components/core/widget/a/b;

    invoke-virtual {v0}, Lcom/kwad/components/core/widget/a/a;->release()V

    return-void
.end method

.method public final b(Lcom/kwad/components/core/webview/jshandler/ac$a;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/c/a/a;->aW(Landroid/content/Context;)F

    move-result v0

    .line 2
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/c/a/a;->getScreenHeight(Landroid/content/Context;)I

    move-result v1

    int-to-float v1, v1

    .line 3
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

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

    const-string v0, "PushAdView"

    const-string v1, "onTkLoadSuccess"

    .line 1
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/ad/i/d;->nY:Z

    return-void
.end method

.method public final bG()V
    .locals 0

    return-void
.end method

.method public final c(Lcom/kwad/components/ad/b/a/b;)Z
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/i/d;->nX:Lcom/kwad/components/ad/b/a/b;

    .line 2
    iget-boolean p1, p0, Lcom/kwad/components/ad/i/d;->nY:Z

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/kwad/components/ad/i/d;->eV()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-direct {p0}, Lcom/kwad/components/ad/i/d;->eS()V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final eT()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/ad/i/d;->nY:Z

    return v0
.end method

.method public final getTKContainer()Landroid/widget/FrameLayout;
    .locals 0

    return-object p0
.end method

.method public final getTKReaderScene()Ljava/lang/String;
    .locals 1

    const-string v0, "tk_push_ad"

    return-object v0
.end method

.method public final getTkTemplateId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/i/d;->nW:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/b;->dA(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getTouchCoordsView()Lcom/kwad/sdk/widget/e;
    .locals 0

    return-object p0
.end method
