.class public final Lcom/kwad/components/ad/reward/presenter/d/a/c;
.super Lcom/kwad/components/ad/reward/presenter/b;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/ad/l/b$a;


# instance fields
.field private cR:Lcom/kwad/sdk/core/webview/d/a/a;

.field private ci:Lcom/kwad/components/ad/l/b;

.field private da:Landroid/widget/FrameLayout;

.field private mDetailVideoView:Lcom/kwad/components/core/video/DetailVideoView;

.field private final mRewardVerifyListener:Lcom/kwad/components/ad/reward/e/l;

.field private th:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/b;-><init>()V

    const/high16 v0, -0x80000000

    .line 2
    iput v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/c;->th:I

    .line 3
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/d/a/c$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/presenter/d/a/c$1;-><init>(Lcom/kwad/components/ad/reward/presenter/d/a/c;)V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/c;->mRewardVerifyListener:Lcom/kwad/components/ad/reward/e/l;

    .line 4
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/d/a/c$2;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/presenter/d/a/c$2;-><init>(Lcom/kwad/components/ad/reward/presenter/d/a/c;)V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/c;->cR:Lcom/kwad/sdk/core/webview/d/a/a;

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/reward/presenter/d/a/c;)Lcom/kwad/components/ad/l/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/c;->ci:Lcom/kwad/components/ad/l/b;

    return-object p0
.end method

.method static synthetic b(Lcom/kwad/components/ad/reward/presenter/d/a/c;)Lcom/kwad/components/ad/reward/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    return-object p0
.end method

.method static synthetic c(Lcom/kwad/components/ad/reward/presenter/d/a/c;)Lcom/kwad/components/ad/reward/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    return-object p0
.end method


# virtual methods
.method public final aj()V
    .locals 7

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/reward/presenter/b;->aj()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v4, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 3
    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->oO:Lcom/kwad/components/ad/reward/j;

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/c;->ci:Lcom/kwad/components/ad/l/b;

    if-nez v0, :cond_0

    return-void

    .line 4
    :cond_0
    invoke-static {}, Lcom/kwad/components/ad/reward/b;->fc()Lcom/kwad/components/ad/reward/b;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/d/a/c;->mRewardVerifyListener:Lcom/kwad/components/ad/reward/e/l;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/b;->a(Lcom/kwad/components/ad/reward/e/l;)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/c;->ci:Lcom/kwad/components/ad/l/b;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/d/a/c;->cR:Lcom/kwad/sdk/core/webview/d/a/a;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/l/b;->a(Lcom/kwad/sdk/core/webview/d/a/a;)V

    .line 6
    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/d/a/c;->ci:Lcom/kwad/components/ad/l/b;

    iget-object v2, p0, Lcom/kwad/components/ad/reward/presenter/d/a/c;->da:Landroid/widget/FrameLayout;

    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v3, v0, Lcom/kwad/components/ad/reward/g;->mRootContainer:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

    iget-object v5, v0, Lcom/kwad/components/ad/reward/g;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    iget v6, v0, Lcom/kwad/components/ad/reward/g;->mScreenOrientation:I

    invoke-virtual/range {v1 .. v6}, Lcom/kwad/components/ad/l/b;->a(Landroid/widget/FrameLayout;Lcom/kwad/sdk/core/view/AdBaseFrameLayout;Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/core/e/d/c;I)V

    .line 7
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/c;->ci:Lcom/kwad/components/ad/l/b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/l/b;->a(Lcom/kwad/components/ad/l/b$b;)V

    .line 8
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/c;->ci:Lcom/kwad/components/ad/l/b;

    if-eqz v0, :cond_1

    .line 9
    invoke-virtual {v0, p0}, Lcom/kwad/components/ad/l/b;->a(Lcom/kwad/components/ad/l/b$a;)V

    :cond_1
    return-void
.end method

.method public final iB()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/kwad/components/ad/reward/presenter/b;->hq()V

    return-void
.end method

.method public final onCreate()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onCreate()V

    .line 2
    sget v0, Lcom/kwad/sdk/R$id;->ksad_web_card_container:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/c;->da:Landroid/widget/FrameLayout;

    .line 3
    sget v0, Lcom/kwad/sdk/R$id;->ksad_video_player:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/core/video/DetailVideoView;

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/c;->mDetailVideoView:Lcom/kwad/components/core/video/DetailVideoView;

    return-void
.end method

.method public final onUnbind()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onUnbind()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/c;->ci:Lcom/kwad/components/ad/l/b;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/kwad/components/ad/l/b;->mJ()V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/c;->ci:Lcom/kwad/components/ad/l/b;

    invoke-virtual {v0}, Lcom/kwad/components/ad/l/b;->mw()V

    .line 5
    :cond_0
    invoke-static {}, Lcom/kwad/components/ad/reward/b;->fc()Lcom/kwad/components/ad/reward/b;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/d/a/c;->mRewardVerifyListener:Lcom/kwad/components/ad/reward/e/l;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/b;->b(Lcom/kwad/components/ad/reward/e/l;)V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/c;->mDetailVideoView:Lcom/kwad/components/core/video/DetailVideoView;

    if-eqz v0, :cond_1

    .line 7
    iget v1, p0, Lcom/kwad/components/ad/reward/presenter/d/a/c;->th:I

    const/high16 v2, -0x80000000

    if-eq v1, v2, :cond_1

    .line 8
    invoke-static {v0, v1}, Lcom/kwad/sdk/c/a/a;->n(Landroid/view/View;I)V

    :cond_1
    return-void
.end method
