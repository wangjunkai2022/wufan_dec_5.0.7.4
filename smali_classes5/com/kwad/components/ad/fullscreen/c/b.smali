.class public final Lcom/kwad/components/ad/fullscreen/c/b;
.super Lcom/kwad/components/ad/reward/presenter/b;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/ad/reward/e/g;
.implements Lcom/kwad/components/core/e/e/f;


# instance fields
.field private gR:Lcom/kwad/components/ad/fullscreen/b;

.field private gS:Landroid/view/ViewGroup;

.field private gT:Lcom/kwad/components/core/l/b;

.field private gU:Lcom/kwad/components/ad/reward/presenter/r;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private gV:Landroid/widget/FrameLayout;

.field private gW:Lcom/kwad/components/ad/reward/presenter/f/b;

.field private gX:Lcom/kwad/components/core/webview/tachikoma/e/e;

.field private gY:Lcom/kwad/components/ad/reward/presenter/e/a;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private gZ:Lcom/kwad/components/ad/reward/presenter/f/f;

.field private ha:Z


# direct methods
.method public constructor <init>(Lcom/kwad/components/core/l/b;Landroid/view/ViewGroup;Lcom/kwad/components/ad/fullscreen/b;Lcom/kwad/components/ad/reward/g;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/b;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/ad/fullscreen/c/b;->ha:Z

    .line 3
    iput-object p1, p0, Lcom/kwad/components/ad/fullscreen/c/b;->gT:Lcom/kwad/components/core/l/b;

    .line 4
    iput-object p3, p0, Lcom/kwad/components/ad/fullscreen/c/b;->gR:Lcom/kwad/components/ad/fullscreen/b;

    .line 5
    iput-object p2, p0, Lcom/kwad/components/ad/fullscreen/c/b;->gS:Landroid/view/ViewGroup;

    .line 6
    iput-object p4, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    .line 7
    invoke-direct {p0}, Lcom/kwad/components/ad/fullscreen/c/b;->bP()V

    return-void
.end method

.method private a(Lcom/kwad/components/ad/reward/e/g;)I
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/kwad/components/ad/fullscreen/c/b;->getPriority()I

    move-result v0

    invoke-interface {p1}, Lcom/kwad/components/ad/reward/e/g;->getPriority()I

    move-result p1

    sub-int/2addr v0, p1

    return v0
.end method

.method private a(Lcom/kwad/components/ad/fullscreen/c/b;)V
    .locals 2

    .line 10
    iget-boolean v0, p0, Lcom/kwad/components/ad/fullscreen/c/b;->ha:Z

    if-eqz v0, :cond_0

    return-void

    .line 11
    :cond_0
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/a;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    invoke-direct {v0, v1}, Lcom/kwad/components/ad/reward/presenter/a;-><init>(Lcom/kwad/components/ad/reward/g;)V

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 12
    iput-boolean v1, p0, Lcom/kwad/components/ad/fullscreen/c/b;->ha:Z

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/fullscreen/c/b;Lcom/kwad/components/ad/fullscreen/c/b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/fullscreen/c/b;->a(Lcom/kwad/components/ad/fullscreen/c/b;)V

    return-void
.end method

.method private static a(Lcom/kwad/components/ad/reward/g;)Z
    .locals 3

    .line 2
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->CE()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 3
    iget-object p0, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    sget-object v0, Lcom/kwad/components/core/webview/tachikoma/TKRenderFailReason;->SWITCH_CLOSE:Lcom/kwad/components/core/webview/tachikoma/TKRenderFailReason;

    invoke-static {p0, v0}, Lcom/kwad/components/ad/reward/monitor/b;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/core/webview/tachikoma/TKRenderFailReason;)V

    return v1

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->bc(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 7
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/b;->de(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdMatrixInfo$FullScreenInfo;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 8
    iget v0, v0, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$BaseMatrixTemplate;->renderType:I

    const/4 v2, 0x1

    if-ne v0, v2, :cond_2

    return v2

    .line 9
    :cond_2
    iget-object p0, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    sget-object v0, Lcom/kwad/components/core/webview/tachikoma/TKRenderFailReason;->TK_FILE_LOAD_ERROR:Lcom/kwad/components/core/webview/tachikoma/TKRenderFailReason;

    invoke-static {p0, v0}, Lcom/kwad/components/ad/reward/monitor/b;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/core/webview/tachikoma/TKRenderFailReason;)V

    return v1
.end method

.method static synthetic b(Lcom/kwad/components/ad/fullscreen/c/b;)Lcom/kwad/components/ad/reward/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    return-object p0
.end method

.method private bP()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/fullscreen/c/b;->gR:Lcom/kwad/components/ad/fullscreen/b;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-direct {p0}, Lcom/kwad/components/ad/fullscreen/c/b;->bU()V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/fullscreen/c/b;->gR:Lcom/kwad/components/ad/fullscreen/b;

    invoke-virtual {v0}, Lcom/kwad/components/ad/fullscreen/b;->bH()Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    .line 4
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->cX(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v1

    .line 5
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/b;->ec(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-eqz v1, :cond_1

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    sget-object v1, Lcom/kwad/components/ad/reward/RewardRenderResult;->LIVE_TK:Lcom/kwad/components/ad/reward/RewardRenderResult;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/g;->a(Lcom/kwad/components/ad/reward/RewardRenderResult;)V

    .line 7
    invoke-static {}, Lcom/kwad/components/core/webview/tachikoma/d/b;->tG()Lcom/kwad/components/core/webview/tachikoma/d/b;

    move-result-object v0

    invoke-direct {p0}, Lcom/kwad/components/ad/fullscreen/c/b;->bV()Lcom/kwad/components/core/webview/tachikoma/e/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/webview/tachikoma/d/b;->a(Lcom/kwad/components/core/webview/tachikoma/e/e;)V

    .line 8
    invoke-direct {p0}, Lcom/kwad/components/ad/fullscreen/c/b;->bR()V

    return-void

    :cond_1
    if-eqz v0, :cond_2

    .line 9
    invoke-static {}, Lcom/kwad/components/core/webview/tachikoma/d/b;->tG()Lcom/kwad/components/core/webview/tachikoma/d/b;

    move-result-object v0

    invoke-direct {p0}, Lcom/kwad/components/ad/fullscreen/c/b;->bV()Lcom/kwad/components/core/webview/tachikoma/e/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/webview/tachikoma/d/b;->a(Lcom/kwad/components/core/webview/tachikoma/e/e;)V

    .line 10
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    sget-object v1, Lcom/kwad/components/ad/reward/RewardRenderResult;->TK_IMAGE:Lcom/kwad/components/ad/reward/RewardRenderResult;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/g;->a(Lcom/kwad/components/ad/reward/RewardRenderResult;)V

    .line 11
    invoke-direct {p0}, Lcom/kwad/components/ad/fullscreen/c/b;->bS()V

    return-void

    .line 12
    :cond_2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    invoke-static {v0}, Lcom/kwad/components/ad/fullscreen/c/b;->a(Lcom/kwad/components/ad/reward/g;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 13
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    sget-object v1, Lcom/kwad/components/ad/reward/RewardRenderResult;->FULLSCREEN_TK:Lcom/kwad/components/ad/reward/RewardRenderResult;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/g;->a(Lcom/kwad/components/ad/reward/RewardRenderResult;)V

    .line 14
    invoke-direct {p0}, Lcom/kwad/components/ad/fullscreen/c/b;->bT()V

    .line 15
    invoke-static {}, Lcom/kwad/components/core/webview/tachikoma/d/b;->tG()Lcom/kwad/components/core/webview/tachikoma/d/b;

    move-result-object v0

    invoke-direct {p0}, Lcom/kwad/components/ad/fullscreen/c/b;->bV()Lcom/kwad/components/core/webview/tachikoma/e/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/webview/tachikoma/d/b;->a(Lcom/kwad/components/core/webview/tachikoma/e/e;)V

    return-void

    .line 16
    :cond_3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    sget-object v1, Lcom/kwad/components/ad/reward/RewardRenderResult;->DEFAULT:Lcom/kwad/components/ad/reward/RewardRenderResult;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/g;->a(Lcom/kwad/components/ad/reward/RewardRenderResult;)V

    .line 17
    invoke-direct {p0}, Lcom/kwad/components/ad/fullscreen/c/b;->bQ()V

    return-void
.end method

.method private bQ()V
    .locals 6

    .line 1
    invoke-static {}, Lcom/kwad/components/core/webview/tachikoma/d/b;->tG()Lcom/kwad/components/core/webview/tachikoma/d/b;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/fullscreen/c/b;->gX:Lcom/kwad/components/core/webview/tachikoma/e/e;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/webview/tachikoma/d/b;->b(Lcom/kwad/components/core/webview/tachikoma/e/e;)V

    .line 2
    invoke-static {}, Lcom/kwad/components/core/e/e/g;->oQ()Lcom/kwad/components/core/e/e/g;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/kwad/components/core/e/e/g;->a(Lcom/kwad/components/core/e/e/f;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/fullscreen/c/b;->gR:Lcom/kwad/components/ad/fullscreen/b;

    invoke-virtual {v0}, Lcom/kwad/components/ad/fullscreen/b;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lcom/kwad/components/ad/fullscreen/c/b;->gR:Lcom/kwad/components/ad/fullscreen/b;

    invoke-virtual {v1}, Lcom/kwad/components/ad/fullscreen/b;->bH()Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v1

    .line 5
    iget-object v2, p0, Lcom/kwad/components/ad/fullscreen/c/b;->gR:Lcom/kwad/components/ad/fullscreen/b;

    .line 6
    invoke-virtual {v2}, Lcom/kwad/components/ad/fullscreen/b;->bI()Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_0

    invoke-static {}, Lcom/kwad/sdk/utils/aj;->isOrientationPortrait()Z

    move-result v2

    if-nez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 7
    :goto_0
    iget-object v5, p0, Lcom/kwad/components/ad/fullscreen/c/b;->gR:Lcom/kwad/components/ad/fullscreen/b;

    iget-boolean v5, v5, Lcom/kwad/components/ad/fullscreen/b;->gt:Z

    if-eqz v5, :cond_1

    .line 8
    invoke-direct {p0, p0}, Lcom/kwad/components/ad/fullscreen/c/b;->a(Lcom/kwad/components/ad/fullscreen/c/b;)V

    .line 9
    :cond_1
    new-instance v5, Lcom/kwad/components/ad/reward/presenter/v;

    invoke-direct {v5}, Lcom/kwad/components/ad/reward/presenter/v;-><init>()V

    invoke-virtual {p0, v5, v4}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 10
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->aO(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 11
    new-instance v5, Lcom/kwad/components/ad/reward/presenter/d;

    invoke-direct {v5}, Lcom/kwad/components/ad/reward/presenter/d;-><init>()V

    invoke-virtual {p0, v5, v4}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 12
    :cond_2
    new-instance v5, Lcom/kwad/components/ad/reward/presenter/m;

    invoke-direct {v5}, Lcom/kwad/components/ad/reward/presenter/m;-><init>()V

    invoke-virtual {p0, v5, v4}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 13
    new-instance v5, Lcom/kwad/components/ad/reward/presenter/platdetail/c;

    invoke-direct {v5}, Lcom/kwad/components/ad/reward/presenter/platdetail/c;-><init>()V

    invoke-virtual {p0, v5, v4}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 14
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/b;->dn(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 15
    new-instance v5, Lcom/kwad/components/ad/reward/presenter/f/h;

    invoke-direct {v5}, Lcom/kwad/components/ad/reward/presenter/f/h;-><init>()V

    invoke-virtual {p0, v5, v4}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    :cond_3
    if-nez v2, :cond_4

    .line 16
    new-instance v2, Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/c;

    invoke-direct {v2}, Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/c;-><init>()V

    invoke-virtual {p0, v2, v4}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 17
    :cond_4
    new-instance v2, Lcom/kwad/components/ad/reward/presenter/c/a;

    invoke-direct {v2}, Lcom/kwad/components/ad/reward/presenter/c/a;-><init>()V

    invoke-virtual {p0, v2, v4}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 18
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/b;->di(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 19
    new-instance v2, Lcom/kwad/components/ad/fullscreen/c/a/f;

    invoke-direct {v2}, Lcom/kwad/components/ad/fullscreen/c/a/f;-><init>()V

    invoke-virtual {p0, v2, v4}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 20
    :cond_5
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->bc(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 21
    new-instance v2, Lcom/kwad/components/ad/reward/presenter/platdetail/b;

    invoke-direct {v2}, Lcom/kwad/components/ad/reward/presenter/platdetail/b;-><init>()V

    invoke-virtual {p0, v2, v4}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 22
    :cond_6
    new-instance v2, Lcom/kwad/components/ad/reward/presenter/l;

    invoke-direct {v2}, Lcom/kwad/components/ad/reward/presenter/l;-><init>()V

    invoke-virtual {p0, v2, v4}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 23
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->cM(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 24
    new-instance v2, Lcom/kwad/components/ad/reward/presenter/b/c;

    invoke-direct {v2}, Lcom/kwad/components/ad/reward/presenter/b/c;-><init>()V

    invoke-virtual {p0, v2, v4}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 25
    new-instance v2, Lcom/kwad/components/ad/reward/presenter/b/b;

    invoke-direct {v2}, Lcom/kwad/components/ad/reward/presenter/b/b;-><init>()V

    invoke-virtual {p0, v2, v4}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 26
    new-instance v2, Lcom/kwad/components/ad/reward/presenter/k;

    invoke-direct {v2}, Lcom/kwad/components/ad/reward/presenter/k;-><init>()V

    invoke-virtual {p0, v2, v4}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 27
    new-instance v2, Lcom/kwad/components/ad/reward/presenter/b/a;

    invoke-direct {v2}, Lcom/kwad/components/ad/reward/presenter/b/a;-><init>()V

    invoke-virtual {p0, v2, v4}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 28
    :cond_7
    new-instance v2, Lcom/kwad/components/ad/reward/presenter/r;

    invoke-direct {v2, v0, v3, v3}, Lcom/kwad/components/ad/reward/presenter/r;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;ZZ)V

    iput-object v2, p0, Lcom/kwad/components/ad/fullscreen/c/b;->gU:Lcom/kwad/components/ad/reward/presenter/r;

    .line 29
    invoke-virtual {p0, v2, v4}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 30
    new-instance v2, Lcom/kwad/components/ad/fullscreen/c/c;

    invoke-direct {v2}, Lcom/kwad/components/ad/fullscreen/c/c;-><init>()V

    invoke-virtual {p0, v2, v4}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 31
    new-instance v2, Lcom/kwad/components/ad/fullscreen/c/a;

    invoke-direct {v2}, Lcom/kwad/components/ad/fullscreen/c/a;-><init>()V

    invoke-virtual {p0, v2, v4}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 32
    new-instance v2, Lcom/kwad/components/ad/reward/presenter/d/b;

    invoke-direct {v2, v0, v3}, Lcom/kwad/components/ad/reward/presenter/d/b;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;Z)V

    invoke-virtual {p0, v2, v4}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 33
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/e;

    iget-object v2, p0, Lcom/kwad/components/ad/fullscreen/c/b;->gS:Landroid/view/ViewGroup;

    invoke-direct {v0, v1, v2}, Lcom/kwad/components/ad/reward/presenter/e;-><init>(Lcom/kwad/sdk/core/response/model/AdInfo;Landroid/view/ViewGroup;)V

    invoke-virtual {p0, v0, v4}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 34
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/j;

    invoke-direct {v0}, Lcom/kwad/components/ad/reward/presenter/j;-><init>()V

    invoke-virtual {p0, v0, v4}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    return-void
.end method

.method private bR()V
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/ad/fullscreen/c/c/c;

    invoke-direct {v0}, Lcom/kwad/components/ad/fullscreen/c/c/c;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/fullscreen/c/b;->gW:Lcom/kwad/components/ad/reward/presenter/f/b;

    .line 2
    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    return-void
.end method

.method private bS()V
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/ad/fullscreen/c/c/a;

    invoke-direct {v0}, Lcom/kwad/components/ad/fullscreen/c/c/a;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/fullscreen/c/b;->gZ:Lcom/kwad/components/ad/reward/presenter/f/f;

    .line 2
    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    return-void
.end method

.method private bT()V
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/components/ad/fullscreen/c/c/b;

    invoke-direct {v0}, Lcom/kwad/components/ad/fullscreen/c/c/b;-><init>()V

    const/4 v1, 0x1

    .line 2
    invoke-virtual {p0, v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    return-void
.end method

.method private bU()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/fullscreen/c/b;->gR:Lcom/kwad/components/ad/fullscreen/b;

    invoke-virtual {v0}, Lcom/kwad/components/ad/fullscreen/b;->bH()Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/kwad/components/ad/fullscreen/c/b;->gR:Lcom/kwad/components/ad/fullscreen/b;

    iget-boolean v1, v1, Lcom/kwad/components/ad/fullscreen/b;->gt:Z

    if-nez v1, :cond_0

    .line 3
    invoke-direct {p0, p0}, Lcom/kwad/components/ad/fullscreen/c/b;->a(Lcom/kwad/components/ad/fullscreen/c/b;)V

    .line 4
    :cond_0
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/b;->dZ(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    invoke-static {}, Lcom/kwad/sdk/utils/aj;->isOrientationPortrait()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/e/a;

    invoke-direct {v0}, Lcom/kwad/components/ad/reward/presenter/e/a;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/fullscreen/c/b;->gY:Lcom/kwad/components/ad/reward/presenter/e/a;

    const/4 v1, 0x1

    .line 7
    invoke-virtual {p0, v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    :cond_1
    return-void
.end method

.method private bV()Lcom/kwad/components/core/webview/tachikoma/e/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/fullscreen/c/b;->gX:Lcom/kwad/components/core/webview/tachikoma/e/e;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/components/ad/fullscreen/c/b$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/fullscreen/c/b$1;-><init>(Lcom/kwad/components/ad/fullscreen/c/b;)V

    iput-object v0, p0, Lcom/kwad/components/ad/fullscreen/c/b;->gX:Lcom/kwad/components/core/webview/tachikoma/e/e;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/fullscreen/c/b;->gX:Lcom/kwad/components/core/webview/tachikoma/e/e;

    return-object v0
.end method

.method private bW()Landroid/widget/FrameLayout;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/fullscreen/c/b;->gV:Landroid/widget/FrameLayout;

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/fullscreen/c/b;->gS:Landroid/view/ViewGroup;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_reward_play_layout:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/kwad/components/ad/fullscreen/c/b;->gV:Landroid/widget/FrameLayout;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/fullscreen/c/b;->gV:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method static synthetic c(Lcom/kwad/components/ad/fullscreen/c/b;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method static synthetic d(Lcom/kwad/components/ad/fullscreen/c/b;)Lcom/kwad/components/ad/reward/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    return-object p0
.end method

.method static synthetic e(Lcom/kwad/components/ad/fullscreen/c/b;)Landroid/widget/FrameLayout;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/fullscreen/c/b;->bW()Landroid/widget/FrameLayout;

    move-result-object p0

    return-object p0
.end method

.method static synthetic f(Lcom/kwad/components/ad/fullscreen/c/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/fullscreen/c/b;->bQ()V

    return-void
.end method

.method static synthetic g(Lcom/kwad/components/ad/fullscreen/c/b;)Lcom/kwad/components/ad/reward/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    return-object p0
.end method


# virtual methods
.method public final aj()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/reward/presenter/b;->aj()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    invoke-virtual {v0, p0}, Lcom/kwad/components/ad/reward/g;->b(Lcom/kwad/components/ad/reward/e/g;)V

    return-void
.end method

.method public final bL()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/g;->C(Z)V

    return-void
.end method

.method public final synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lcom/kwad/components/ad/reward/e/g;

    invoke-direct {p0, p1}, Lcom/kwad/components/ad/fullscreen/c/b;->a(Lcom/kwad/components/ad/reward/e/g;)I

    move-result p1

    return p1
.end method

.method public final dismiss()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/g;->D(Z)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/g;->fv()V

    return-void
.end method

.method public final getPriority()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final onBackPressed()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/fullscreen/c/b;->gU:Lcom/kwad/components/ad/reward/presenter/r;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/presenter/r;->onBackPressed()Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/fullscreen/c/b;->gY:Lcom/kwad/components/ad/reward/presenter/e/a;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/presenter/e/a;->go()Lcom/kwad/components/ad/reward/page/BackPressHandleResult;

    move-result-object v0

    .line 5
    sget-object v2, Lcom/kwad/components/ad/reward/page/BackPressHandleResult;->HANDLED:Lcom/kwad/components/ad/reward/page/BackPressHandleResult;

    if-ne v0, v2, :cond_1

    return v1

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/fullscreen/c/b;->gW:Lcom/kwad/components/ad/reward/presenter/f/b;

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    .line 7
    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/presenter/f/b;->go()Lcom/kwad/components/ad/reward/page/BackPressHandleResult;

    move-result-object v0

    sget-object v3, Lcom/kwad/components/ad/reward/page/BackPressHandleResult;->HANDLED:Lcom/kwad/components/ad/reward/page/BackPressHandleResult;

    if-ne v0, v3, :cond_2

    return v1

    :cond_2
    return v2
.end method

.method public final onCreate()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onCreate()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/fullscreen/c/b;->gS:Landroid/view/ViewGroup;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_reward_play_layout:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/kwad/components/ad/fullscreen/c/b;->gV:Landroid/widget/FrameLayout;

    return-void
.end method

.method public final onUnbind()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onUnbind()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    invoke-virtual {v0, p0}, Lcom/kwad/components/ad/reward/g;->c(Lcom/kwad/components/ad/reward/e/g;)V

    .line 3
    invoke-static {}, Lcom/kwad/components/core/e/e/g;->oQ()Lcom/kwad/components/core/e/e/g;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/kwad/components/core/e/e/g;->b(Lcom/kwad/components/core/e/e/f;)V

    .line 4
    invoke-static {}, Lcom/kwad/components/core/webview/tachikoma/d/b;->tG()Lcom/kwad/components/core/webview/tachikoma/d/b;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/fullscreen/c/b;->gX:Lcom/kwad/components/core/webview/tachikoma/e/e;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/webview/tachikoma/d/b;->b(Lcom/kwad/components/core/webview/tachikoma/e/e;)V

    return-void
.end method

.method public final show()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/g;->fw()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/g;->D(Z)V

    return-void
.end method
