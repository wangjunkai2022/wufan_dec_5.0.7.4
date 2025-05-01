.class public abstract Lcom/kwad/components/ad/reward/presenter/f/d;
.super Lcom/kwad/components/ad/reward/presenter/b;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;
.implements Lcom/kwad/components/ad/reward/k/a/e;
.implements Lcom/kwad/components/core/webview/tachikoma/a/y$a;


# instance fields
.field private final gO:Lcom/kwad/components/core/video/l;

.field private final hq:Lcom/kwad/sdk/utils/h$a;

.field private final mPlayEndPageListener:Lcom/kwad/components/ad/reward/e/g;

.field private final mRewardVerifyListener:Lcom/kwad/components/ad/reward/e/l;

.field protected wl:Lcom/kwad/components/ad/reward/k/a/d;

.field private wm:Lcom/kwad/components/core/webview/tachikoma/a/p;

.field private wn:Lcom/kwad/components/core/webview/tachikoma/a/o;

.field private wo:Lcom/kwad/components/ad/reward/k/i;

.field private wp:Lcom/kwad/components/ad/reward/k/j;

.field private wq:Lcom/kwad/components/core/webview/tachikoma/b/y;

.field private wr:Z

.field private ws:Lcom/kwad/components/core/webview/tachikoma/a/h;

.field protected wt:Lcom/kwad/components/ad/reward/presenter/f/e;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private wu:Lcom/kwad/components/core/webview/jshandler/be$b;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/b;-><init>()V

    .line 2
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/f/d$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/presenter/f/d$1;-><init>(Lcom/kwad/components/ad/reward/presenter/f/d;)V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->wu:Lcom/kwad/components/core/webview/jshandler/be$b;

    .line 3
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/f/d$5;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/presenter/f/d$5;-><init>(Lcom/kwad/components/ad/reward/presenter/f/d;)V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->hq:Lcom/kwad/sdk/utils/h$a;

    .line 4
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/f/d$6;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/presenter/f/d$6;-><init>(Lcom/kwad/components/ad/reward/presenter/f/d;)V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->mRewardVerifyListener:Lcom/kwad/components/ad/reward/e/l;

    .line 5
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/f/d$7;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/presenter/f/d$7;-><init>(Lcom/kwad/components/ad/reward/presenter/f/d;)V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->mPlayEndPageListener:Lcom/kwad/components/ad/reward/e/g;

    .line 6
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/f/d$8;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/presenter/f/d$8;-><init>(Lcom/kwad/components/ad/reward/presenter/f/d;)V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->gO:Lcom/kwad/components/core/video/l;

    .line 7
    invoke-virtual {p0}, Lcom/kwad/components/ad/reward/presenter/f/d;->iN()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 8
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/f/e;

    invoke-direct {v0}, Lcom/kwad/components/ad/reward/presenter/f/e;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->wt:Lcom/kwad/components/ad/reward/presenter/f/e;

    :cond_0
    return-void
.end method

.method static synthetic A(Lcom/kwad/components/ad/reward/presenter/f/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/f/d;->notifyRewardVerify()V

    return-void
.end method

.method static synthetic B(Lcom/kwad/components/ad/reward/presenter/f/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/f/d;->iP()V

    return-void
.end method

.method static synthetic C(Lcom/kwad/components/ad/reward/presenter/f/d;)Lcom/kwad/components/ad/reward/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    return-object p0
.end method

.method static synthetic D(Lcom/kwad/components/ad/reward/presenter/f/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/f/d;->iO()V

    return-void
.end method

.method static synthetic E(Lcom/kwad/components/ad/reward/presenter/f/d;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method static synthetic F(Lcom/kwad/components/ad/reward/presenter/f/d;)Lcom/kwad/components/ad/reward/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    return-object p0
.end method

.method static synthetic G(Lcom/kwad/components/ad/reward/presenter/f/d;)Lcom/kwad/components/ad/reward/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    return-object p0
.end method

.method static synthetic H(Lcom/kwad/components/ad/reward/presenter/f/d;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method static synthetic I(Lcom/kwad/components/ad/reward/presenter/f/d;)Lcom/kwad/components/ad/reward/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    return-object p0
.end method

.method static synthetic J(Lcom/kwad/components/ad/reward/presenter/f/d;)Lcom/kwad/components/core/webview/tachikoma/a/o;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->wn:Lcom/kwad/components/core/webview/tachikoma/a/o;

    return-object p0
.end method

.method static synthetic K(Lcom/kwad/components/ad/reward/presenter/f/d;)Lcom/kwad/components/ad/reward/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    return-object p0
.end method

.method static synthetic L(Lcom/kwad/components/ad/reward/presenter/f/d;)Lcom/kwad/components/ad/reward/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    return-object p0
.end method

.method static synthetic M(Lcom/kwad/components/ad/reward/presenter/f/d;)Lcom/kwad/components/ad/reward/k/i;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->wo:Lcom/kwad/components/ad/reward/k/i;

    return-object p0
.end method

.method static synthetic N(Lcom/kwad/components/ad/reward/presenter/f/d;)Lcom/kwad/components/ad/reward/k/j;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->wp:Lcom/kwad/components/ad/reward/k/j;

    return-object p0
.end method

.method static synthetic O(Lcom/kwad/components/ad/reward/presenter/f/d;)Lcom/kwad/components/core/webview/tachikoma/a/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->ws:Lcom/kwad/components/core/webview/tachikoma/a/h;

    return-object p0
.end method

.method static synthetic P(Lcom/kwad/components/ad/reward/presenter/f/d;)Lcom/kwad/components/ad/reward/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    return-object p0
.end method

.method static synthetic Q(Lcom/kwad/components/ad/reward/presenter/f/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/f/d;->hx()V

    return-void
.end method

.method static synthetic R(Lcom/kwad/components/ad/reward/presenter/f/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/f/d;->iU()V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/reward/presenter/f/d;)Lcom/kwad/components/ad/reward/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    return-object p0
.end method

.method static synthetic a(Lcom/kwad/components/ad/reward/presenter/f/d;D)V
    .locals 0

    const-wide/16 p1, 0x0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/kwad/components/ad/reward/presenter/f/d;->g(D)V

    return-void
.end method

.method static synthetic b(Lcom/kwad/components/ad/reward/presenter/f/d;)Lcom/kwad/components/ad/reward/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    return-object p0
.end method

.method static synthetic c(Lcom/kwad/components/ad/reward/presenter/f/d;)Lcom/kwad/components/ad/reward/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    return-object p0
.end method

.method static synthetic d(Lcom/kwad/components/ad/reward/presenter/f/d;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method private d(JJ)V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v0, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v0, v0, Lcom/kwad/sdk/core/response/model/AdTemplate;->adInfoList:Ljava/util/List;

    const/4 v1, 0x0

    .line 3
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->af(Lcom/kwad/sdk/core/response/model/AdInfo;)J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    const-wide/16 v0, 0x320

    sub-long v0, p1, v0

    cmp-long v2, p3, v0

    if-gez v2, :cond_0

    sub-long/2addr p1, p3

    long-to-float p1, p1

    const/high16 p2, 0x447a0000    # 1000.0f

    div-float/2addr p1, p2

    const/high16 p2, 0x3f000000    # 0.5f

    add-float/2addr p1, p2

    float-to-int p1, p1

    .line 4
    iget-object p2, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iput p1, p2, Lcom/kwad/components/ad/reward/g;->pt:I

    :cond_0
    return-void
.end method

.method static synthetic e(Lcom/kwad/components/ad/reward/presenter/f/d;)Lcom/kwad/components/ad/reward/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    return-object p0
.end method

.method static synthetic f(Lcom/kwad/components/ad/reward/presenter/f/d;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/f/d;->iW()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private g(D)V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->wq:Lcom/kwad/components/core/webview/tachikoma/b/y;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/kwad/components/core/webview/tachikoma/b/y;->abj:Z

    .line 3
    iput-boolean v1, v0, Lcom/kwad/components/core/webview/tachikoma/b/y;->abf:Z

    const-wide v1, 0x408f400000000000L    # 1000.0

    div-double/2addr p1, v1

    const-wide/high16 v1, 0x3fe0000000000000L    # 0.5

    add-double/2addr p1, v1

    double-to-int p1, p1

    .line 4
    iput p1, v0, Lcom/kwad/components/core/webview/tachikoma/b/y;->nF:I

    .line 5
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/f/d;->iV()V

    return-void
.end method

.method static synthetic g(Lcom/kwad/components/ad/reward/presenter/f/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/f/d;->iQ()V

    return-void
.end method

.method static synthetic h(Lcom/kwad/components/ad/reward/presenter/f/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/f/d;->iR()V

    return-void
.end method

.method private hx()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-boolean v0, v0, Lcom/kwad/components/ad/reward/g;->pe:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/f/d;->iU()V

    return-void

    .line 3
    :cond_0
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/f/d;->iT()V

    return-void
.end method

.method static synthetic i(Lcom/kwad/components/ad/reward/presenter/f/d;)Lcom/kwad/components/ad/reward/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    return-object p0
.end method

.method private iO()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v1, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->mReportExtData:Lorg/json/JSONObject;

    const/16 v2, 0x11

    invoke-static {v1, v2, v0}, Lcom/kwad/sdk/core/adlog/c;->b(Lcom/kwad/sdk/core/response/model/AdTemplate;ILorg/json/JSONObject;)V

    return-void
.end method

.method private iP()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/f/d;->iW()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/g;->y(Ljava/lang/String;)V

    return-void
.end method

.method private iQ()V
    .locals 5

    .line 1
    new-instance v0, Lcom/kwad/sdk/core/adlog/c/b;

    invoke-direct {v0}, Lcom/kwad/sdk/core/adlog/c/b;-><init>()V

    const/16 v1, 0x27

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/adlog/c/b;->cK(I)Lcom/kwad/sdk/core/adlog/c/b;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v1, v1, Lcom/kwad/components/ad/reward/g;->mRootContainer:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

    .line 3
    invoke-virtual {v1}, Lcom/kwad/sdk/core/view/AdBaseFrameLayout;->getTouchCoords()Lcom/kwad/sdk/utils/ac$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/adlog/c/b;->f(Lcom/kwad/sdk/utils/ac$a;)Lcom/kwad/sdk/core/adlog/c/b;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v1, v1, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 5
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/f/d;->iW()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v3, v3, Lcom/kwad/components/ad/reward/g;->mReportExtData:Lorg/json/JSONObject;

    const-string v4, "endTopBar"

    .line 6
    invoke-static {v1, v2, v4, v0, v3}, Lcom/kwad/components/ad/reward/j/b;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;Ljava/lang/String;Lcom/kwad/sdk/core/adlog/c/b;Lorg/json/JSONObject;)V

    .line 7
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->oJ:Lcom/kwad/components/ad/reward/e/b;

    invoke-interface {v0}, Lcom/kwad/components/ad/reward/e/b;->bJ()V

    return-void
.end method

.method private iR()V
    .locals 5

    .line 1
    new-instance v0, Lcom/kwad/sdk/core/adlog/c/b;

    invoke-direct {v0}, Lcom/kwad/sdk/core/adlog/c/b;-><init>()V

    const/16 v1, 0x28

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/adlog/c/b;->cK(I)Lcom/kwad/sdk/core/adlog/c/b;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v1, v1, Lcom/kwad/components/ad/reward/g;->mRootContainer:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

    .line 3
    invoke-virtual {v1}, Lcom/kwad/sdk/core/view/AdBaseFrameLayout;->getTouchCoords()Lcom/kwad/sdk/utils/ac$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/adlog/c/b;->f(Lcom/kwad/sdk/utils/ac$a;)Lcom/kwad/sdk/core/adlog/c/b;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v1, v1, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 5
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/f/d;->iW()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v3, v3, Lcom/kwad/components/ad/reward/g;->mReportExtData:Lorg/json/JSONObject;

    const/4 v4, 0x0

    .line 6
    invoke-static {v1, v2, v4, v0, v3}, Lcom/kwad/components/ad/reward/j/b;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;Ljava/lang/String;Lcom/kwad/sdk/core/adlog/c/b;Lorg/json/JSONObject;)V

    .line 7
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->oJ:Lcom/kwad/components/ad/reward/e/b;

    invoke-interface {v0}, Lcom/kwad/components/ad/reward/e/b;->bJ()V

    return-void
.end method

.method private iS()V
    .locals 5

    .line 1
    new-instance v0, Lcom/kwad/sdk/core/adlog/c/b;

    invoke-direct {v0}, Lcom/kwad/sdk/core/adlog/c/b;-><init>()V

    const/16 v1, 0x29

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/adlog/c/b;->cK(I)Lcom/kwad/sdk/core/adlog/c/b;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v1, v1, Lcom/kwad/components/ad/reward/g;->mRootContainer:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

    .line 3
    invoke-virtual {v1}, Lcom/kwad/sdk/core/view/AdBaseFrameLayout;->getTouchCoords()Lcom/kwad/sdk/utils/ac$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/adlog/c/b;->f(Lcom/kwad/sdk/utils/ac$a;)Lcom/kwad/sdk/core/adlog/c/b;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v1, v1, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 5
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/f/d;->iW()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v3, v3, Lcom/kwad/components/ad/reward/g;->mReportExtData:Lorg/json/JSONObject;

    const/4 v4, 0x0

    .line 6
    invoke-static {v1, v2, v4, v0, v3}, Lcom/kwad/components/ad/reward/j/b;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;Ljava/lang/String;Lcom/kwad/sdk/core/adlog/c/b;Lorg/json/JSONObject;)V

    .line 7
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->oJ:Lcom/kwad/components/ad/reward/e/b;

    invoke-interface {v0}, Lcom/kwad/components/ad/reward/e/b;->bJ()V

    return-void
.end method

.method private iT()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->wq:Lcom/kwad/components/core/webview/tachikoma/b/y;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/kwad/components/core/webview/tachikoma/b/y;->abf:Z

    const/4 v1, 0x0

    .line 2
    iput-boolean v1, v0, Lcom/kwad/components/core/webview/tachikoma/b/y;->abj:Z

    .line 3
    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v1, v1, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 4
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->L(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v1

    iput v1, v0, Lcom/kwad/components/core/webview/tachikoma/b/y;->nF:I

    .line 5
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/f/d;->iV()V

    return-void
.end method

.method private iU()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->wq:Lcom/kwad/components/core/webview/tachikoma/b/y;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/kwad/components/core/webview/tachikoma/b/y;->abj:Z

    const/4 v1, 0x0

    .line 2
    iput-boolean v1, v0, Lcom/kwad/components/core/webview/tachikoma/b/y;->abf:Z

    .line 3
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/f/d;->iV()V

    return-void
.end method

.method private iV()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->wm:Lcom/kwad/components/core/webview/tachikoma/a/p;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->wq:Lcom/kwad/components/core/webview/tachikoma/b/y;

    if-eqz v1, :cond_0

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/webview/tachikoma/a/p;->a(Lcom/kwad/components/core/webview/tachikoma/b/y;)V

    :cond_0
    return-void
.end method

.method private iW()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->wl:Lcom/kwad/components/ad/reward/k/a/d;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2
    :cond_0
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/tachikoma/i;->getTkTemplateId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic j(Lcom/kwad/components/ad/reward/presenter/f/d;)Lcom/kwad/components/ad/reward/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    return-object p0
.end method

.method static synthetic k(Lcom/kwad/components/ad/reward/presenter/f/d;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method static synthetic l(Lcom/kwad/components/ad/reward/presenter/f/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/f/d;->iS()V

    return-void
.end method

.method static synthetic m(Lcom/kwad/components/ad/reward/presenter/f/d;)Lcom/kwad/components/ad/reward/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    return-object p0
.end method

.method static synthetic n(Lcom/kwad/components/ad/reward/presenter/f/d;)Lcom/kwad/components/ad/reward/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    return-object p0
.end method

.method private notifyRewardVerify()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->oJ:Lcom/kwad/components/ad/reward/e/b;

    invoke-interface {v0}, Lcom/kwad/components/ad/reward/e/b;->onRewardVerify()V

    return-void
.end method

.method static synthetic o(Lcom/kwad/components/ad/reward/presenter/f/d;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method static synthetic p(Lcom/kwad/components/ad/reward/presenter/f/d;)Lcom/kwad/components/ad/reward/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    return-object p0
.end method

.method static synthetic q(Lcom/kwad/components/ad/reward/presenter/f/d;)Lcom/kwad/components/ad/reward/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    return-object p0
.end method

.method static synthetic r(Lcom/kwad/components/ad/reward/presenter/f/d;)Lcom/kwad/components/ad/reward/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    return-object p0
.end method

.method static synthetic s(Lcom/kwad/components/ad/reward/presenter/f/d;)Lcom/kwad/components/ad/reward/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    return-object p0
.end method

.method static synthetic t(Lcom/kwad/components/ad/reward/presenter/f/d;)Lcom/kwad/components/ad/reward/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    return-object p0
.end method

.method static synthetic u(Lcom/kwad/components/ad/reward/presenter/f/d;)Lcom/kwad/components/ad/reward/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    return-object p0
.end method

.method static synthetic v(Lcom/kwad/components/ad/reward/presenter/f/d;)Lcom/kwad/components/ad/reward/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    return-object p0
.end method

.method static synthetic w(Lcom/kwad/components/ad/reward/presenter/f/d;)Lcom/kwad/components/ad/reward/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    return-object p0
.end method

.method static synthetic x(Lcom/kwad/components/ad/reward/presenter/f/d;)Lcom/kwad/components/ad/reward/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    return-object p0
.end method

.method static synthetic y(Lcom/kwad/components/ad/reward/presenter/f/d;)Lcom/kwad/components/ad/reward/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    return-object p0
.end method

.method static synthetic z(Lcom/kwad/components/ad/reward/presenter/f/d;)Lcom/kwad/components/ad/reward/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    return-object p0
.end method


# virtual methods
.method public final a(JJ)V
    .locals 0

    .line 65
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/kwad/components/ad/reward/presenter/f/d;->d(JJ)V

    long-to-double p1, p3

    .line 66
    invoke-direct {p0, p1, p2}, Lcom/kwad/components/ad/reward/presenter/f/d;->g(D)V

    return-void
.end method

.method public final a(Lcom/kwad/components/ad/reward/c/b;)V
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    if-eqz v0, :cond_0

    .line 60
    invoke-virtual {v0, p1}, Lcom/kwad/components/ad/reward/g;->b(Lcom/kwad/components/ad/reward/c/b;)V

    :cond_0
    return-void
.end method

.method public final a(Lcom/kwad/components/core/webview/jshandler/a$a;)V
    .locals 3

    .line 44
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    if-eqz v0, :cond_2

    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->oJ:Lcom/kwad/components/ad/reward/e/b;

    if-nez v0, :cond_0

    goto/16 :goto_2

    .line 45
    :cond_0
    :try_start_0
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/a$c;

    invoke-direct {v0}, Lcom/kwad/components/core/webview/jshandler/a$c;-><init>()V

    .line 46
    new-instance v1, Lorg/json/JSONObject;

    iget-object v2, p1, Lcom/kwad/components/core/webview/jshandler/a$a;->WD:Ljava/lang/String;

    invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/response/a/a;->parseJson(Lorg/json/JSONObject;)V

    .line 47
    iget-object p1, p1, Lcom/kwad/components/core/webview/jshandler/a$a;->WC:Ljava/lang/String;

    const/4 v1, -0x1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v2

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v2, "adSkipWithPlayTimeCallback"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :sswitch_1
    const-string v2, "adClickCallback"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :sswitch_2
    const-string v2, "videoPlayStartCallback"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :sswitch_3
    const-string v2, "videoPlayErrorCallback"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x2

    goto :goto_0

    :sswitch_4
    const-string v2, "videoPlayEndCallback"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x3

    goto :goto_0

    :sswitch_5
    const-string v2, "adCloseCallback"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x5

    goto :goto_0

    :sswitch_6
    const-string v2, "rewardVerifyCallback"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x6

    :cond_1
    :goto_0
    packed-switch v1, :pswitch_data_0

    goto :goto_1

    .line 48
    :pswitch_0
    iget-object p1, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object p1, p1, Lcom/kwad/components/ad/reward/g;->oJ:Lcom/kwad/components/ad/reward/e/b;

    invoke-interface {p1}, Lcom/kwad/components/ad/reward/e/b;->onRewardVerify()V

    goto :goto_1

    .line 49
    :pswitch_1
    iget-object p1, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object p1, p1, Lcom/kwad/components/ad/reward/g;->oJ:Lcom/kwad/components/ad/reward/e/b;

    iget-boolean v0, v0, Lcom/kwad/components/core/webview/jshandler/a$c;->WG:Z

    invoke-interface {p1, v0}, Lcom/kwad/components/ad/reward/e/b;->h(Z)V

    goto :goto_2

    .line 50
    :pswitch_2
    iget-object p1, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object p1, p1, Lcom/kwad/components/ad/reward/g;->oJ:Lcom/kwad/components/ad/reward/e/b;

    iget-wide v0, v0, Lcom/kwad/components/core/webview/jshandler/a$c;->WF:J

    invoke-interface {p1, v0, v1}, Lcom/kwad/components/ad/reward/e/b;->onVideoSkipToEnd(J)V

    goto :goto_2

    .line 51
    :pswitch_3
    iget-object p1, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object p1, p1, Lcom/kwad/components/ad/reward/g;->oJ:Lcom/kwad/components/ad/reward/e/b;

    invoke-interface {p1}, Lcom/kwad/components/ad/reward/e/b;->onVideoPlayEnd()V

    goto :goto_2

    .line 52
    :pswitch_4
    iget-object p1, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object p1, p1, Lcom/kwad/components/ad/reward/g;->oJ:Lcom/kwad/components/ad/reward/e/b;

    iget v1, v0, Lcom/kwad/components/core/webview/jshandler/a$c;->errorCode:I

    iget v0, v0, Lcom/kwad/components/core/webview/jshandler/a$c;->WE:I

    invoke-interface {p1, v1, v0}, Lcom/kwad/components/ad/reward/e/b;->onVideoPlayError(II)V

    goto :goto_2

    .line 53
    :pswitch_5
    iget-object p1, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object p1, p1, Lcom/kwad/components/ad/reward/g;->oJ:Lcom/kwad/components/ad/reward/e/b;

    invoke-interface {p1}, Lcom/kwad/components/ad/reward/e/b;->onVideoPlayStart()V

    goto :goto_2

    .line 54
    :pswitch_6
    iget-object p1, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object p1, p1, Lcom/kwad/components/ad/reward/g;->oJ:Lcom/kwad/components/ad/reward/e/b;

    invoke-interface {p1}, Lcom/kwad/components/ad/reward/e/b;->bJ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    return-void

    :catchall_0
    move-exception p1

    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "onOutCallback Error: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "TKBasePresenter"

    invoke-static {v0, p1}, Lcom/kwad/sdk/core/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_2
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x5c901f13 -> :sswitch_6
        -0x493fe106 -> :sswitch_5
        -0x18016b8f -> :sswitch_4
        0x23d4985e -> :sswitch_3
        0x609790b8 -> :sswitch_2
        0x6e67768a -> :sswitch_1
        0x72472fce -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public a(Lcom/kwad/components/core/webview/jshandler/aw;)V
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->wt:Lcom/kwad/components/ad/reward/presenter/f/e;

    if-eqz v0, :cond_0

    .line 43
    invoke-virtual {v0, p1}, Lcom/kwad/components/ad/reward/presenter/f/e;->b(Lcom/kwad/components/core/webview/jshandler/aw;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/kwad/components/core/webview/tachikoma/TKRenderFailReason;)V
    .locals 0

    .line 40
    iget-object p1, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->wt:Lcom/kwad/components/ad/reward/presenter/f/e;

    if-eqz p1, :cond_0

    .line 41
    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/presenter/f/e;->ja()V

    :cond_0
    return-void
.end method

.method public a(Lcom/kwad/components/core/webview/tachikoma/a/o;)V
    .locals 1

    .line 61
    iput-object p1, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->wn:Lcom/kwad/components/core/webview/tachikoma/a/o;

    .line 62
    iget-object p1, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object p1, p1, Lcom/kwad/components/ad/reward/g;->oK:Lcom/kwad/components/ad/reward/m/e;

    if-eqz p1, :cond_0

    .line 63
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->hq:Lcom/kwad/sdk/utils/h$a;

    invoke-virtual {p1, v0}, Lcom/kwad/components/ad/reward/m/e;->a(Lcom/kwad/sdk/utils/h$a;)V

    .line 64
    :cond_0
    new-instance p1, Lcom/kwad/components/ad/reward/presenter/f/d$4;

    invoke-direct {p1, p0}, Lcom/kwad/components/ad/reward/presenter/f/d$4;-><init>(Lcom/kwad/components/ad/reward/presenter/f/d;)V

    invoke-static {p1}, Lcom/kwad/sdk/utils/bo;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Lcom/kwad/components/core/webview/tachikoma/a/p;)V
    .locals 1

    .line 36
    iput-object p1, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->wm:Lcom/kwad/components/core/webview/tachikoma/a/p;

    .line 37
    iget-object p1, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object p1, p1, Lcom/kwad/components/ad/reward/g;->oK:Lcom/kwad/components/ad/reward/m/e;

    if-eqz p1, :cond_0

    .line 38
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->gO:Lcom/kwad/components/core/video/l;

    invoke-virtual {p1, v0}, Lcom/kwad/components/ad/reward/m/e;->a(Lcom/kwad/components/core/video/l;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/kwad/components/core/webview/tachikoma/b/m;)V
    .locals 2

    .line 56
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->oK:Lcom/kwad/components/ad/reward/m/e;

    if-eqz v0, :cond_0

    .line 57
    iget-boolean p1, p1, Lcom/kwad/components/core/webview/tachikoma/b/m;->aba:Z

    const/4 v1, 0x1

    xor-int/2addr p1, v1

    invoke-virtual {v0, p1, v1}, Lcom/kwad/components/ad/reward/m/e;->setAudioEnabled(ZZ)V

    :cond_0
    return-void
.end method

.method public a(Lcom/kwad/components/core/webview/tachikoma/b/t;)V
    .locals 1

    .line 39
    iget-object p1, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/kwad/components/ad/reward/presenter/f;->a(Lcom/kwad/components/ad/reward/g;Z)V

    return-void
.end method

.method public a(Lcom/kwad/sdk/commercial/model/WebCloseStatus;)V
    .locals 0

    return-void
.end method

.method public a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/b;)V
    .locals 6

    .line 3
    new-instance v0, Lcom/kwad/components/ad/reward/k/k;

    invoke-direct {v0}, Lcom/kwad/components/ad/reward/k/k;-><init>()V

    .line 4
    new-instance v1, Lcom/kwad/components/ad/reward/presenter/f/d$9;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/reward/presenter/f/d$9;-><init>(Lcom/kwad/components/ad/reward/presenter/f/d;)V

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/k/k;->a(Lcom/kwad/components/ad/reward/k/k$a;)V

    .line 5
    invoke-interface {p1, v0}, Lcom/kwad/sdk/components/r;->c(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-wide v0, v0, Lcom/kwad/components/ad/reward/g;->pv:J

    .line 7
    new-instance v2, Lcom/kwad/components/ad/reward/k/g;

    const-wide/16 v3, 0x0

    cmp-long v5, v0, v3

    if-lez v5, :cond_0

    long-to-int v1, v0

    .line 8
    div-int/lit16 v1, v1, 0x3e8

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-direct {v2, v1}, Lcom/kwad/components/ad/reward/k/g;-><init>(I)V

    .line 9
    invoke-interface {p1, v2}, Lcom/kwad/sdk/components/r;->c(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 10
    new-instance v0, Lcom/kwad/components/ad/reward/k/i;

    invoke-direct {v0}, Lcom/kwad/components/ad/reward/k/i;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->wo:Lcom/kwad/components/ad/reward/k/i;

    .line 11
    invoke-interface {p1, v0}, Lcom/kwad/sdk/components/r;->c(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 12
    new-instance v0, Lcom/kwad/components/ad/reward/k/j;

    invoke-direct {v0}, Lcom/kwad/components/ad/reward/k/j;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->wp:Lcom/kwad/components/ad/reward/k/j;

    .line 13
    invoke-interface {p1, v0}, Lcom/kwad/sdk/components/r;->c(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 14
    invoke-static {}, Lcom/kwad/components/ad/reward/b;->fc()Lcom/kwad/components/ad/reward/b;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->mRewardVerifyListener:Lcom/kwad/components/ad/reward/e/l;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/b;->a(Lcom/kwad/components/ad/reward/e/l;)V

    .line 15
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->mPlayEndPageListener:Lcom/kwad/components/ad/reward/e/g;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/g;->b(Lcom/kwad/components/ad/reward/e/g;)V

    .line 16
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/ai;

    new-instance v1, Lcom/kwad/components/ad/reward/presenter/f/d$10;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/reward/presenter/f/d$10;-><init>(Lcom/kwad/components/ad/reward/presenter/f/d;)V

    invoke-direct {v0, v1}, Lcom/kwad/components/core/webview/jshandler/ai;-><init>(Lcom/kwad/components/core/webview/jshandler/ai$b;)V

    .line 17
    invoke-interface {p1, v0}, Lcom/kwad/sdk/components/r;->c(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 18
    new-instance v0, Lcom/kwad/components/ad/reward/k/d;

    invoke-direct {v0}, Lcom/kwad/components/ad/reward/k/d;-><init>()V

    .line 19
    new-instance v1, Lcom/kwad/components/ad/reward/presenter/f/d$11;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/reward/presenter/f/d$11;-><init>(Lcom/kwad/components/ad/reward/presenter/f/d;)V

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/k/d;->a(Lcom/kwad/components/ad/reward/k/d$a;)V

    .line 20
    invoke-interface {p1, v0}, Lcom/kwad/sdk/components/r;->c(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 21
    new-instance v0, Lcom/kwad/components/ad/reward/k/e;

    invoke-direct {v0}, Lcom/kwad/components/ad/reward/k/e;-><init>()V

    .line 22
    new-instance v1, Lcom/kwad/components/ad/reward/presenter/f/d$12;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/reward/presenter/f/d$12;-><init>(Lcom/kwad/components/ad/reward/presenter/f/d;)V

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/k/e;->a(Lcom/kwad/components/ad/reward/k/e$a;)V

    .line 23
    invoke-interface {p1, v0}, Lcom/kwad/sdk/components/r;->c(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 24
    new-instance v0, Lcom/kwad/components/ad/reward/k/h;

    new-instance v1, Lcom/kwad/components/ad/reward/presenter/f/d$13;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/reward/presenter/f/d$13;-><init>(Lcom/kwad/components/ad/reward/presenter/f/d;)V

    invoke-direct {v0, v1}, Lcom/kwad/components/ad/reward/k/h;-><init>(Lcom/kwad/components/ad/reward/k/h$a;)V

    invoke-interface {p1, v0}, Lcom/kwad/sdk/components/r;->c(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 25
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/f/d$14;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/presenter/f/d$14;-><init>(Lcom/kwad/components/ad/reward/presenter/f/d;)V

    invoke-interface {p1, v0}, Lcom/kwad/sdk/components/r;->c(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 26
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/f/d$15;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/presenter/f/d$15;-><init>(Lcom/kwad/components/ad/reward/presenter/f/d;)V

    invoke-interface {p1, v0}, Lcom/kwad/sdk/components/r;->c(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 27
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/f/d$16;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/presenter/f/d$16;-><init>(Lcom/kwad/components/ad/reward/presenter/f/d;)V

    invoke-interface {p1, v0}, Lcom/kwad/sdk/components/r;->c(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 28
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/f/d$2;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/presenter/f/d$2;-><init>(Lcom/kwad/components/ad/reward/presenter/f/d;)V

    invoke-interface {p1, v0}, Lcom/kwad/sdk/components/r;->c(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 29
    new-instance v0, Lcom/kwad/components/ad/reward/i/b;

    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v2, v2, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    sget-object v3, Lcom/kwad/components/core/playable/PlayableSource;->ACTIONBAR_CLICK:Lcom/kwad/components/core/playable/PlayableSource;

    invoke-direct {v0, v1, v2, v3}, Lcom/kwad/components/ad/reward/i/b;-><init>(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/core/playable/PlayableSource;)V

    invoke-interface {p1, v0}, Lcom/kwad/sdk/components/r;->c(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 30
    new-instance v0, Lcom/kwad/components/core/webview/tachikoma/a/h;

    invoke-direct {v0}, Lcom/kwad/components/core/webview/tachikoma/a/h;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->ws:Lcom/kwad/components/core/webview/tachikoma/a/h;

    .line 31
    new-instance v1, Lcom/kwad/components/ad/reward/presenter/f/d$3;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/reward/presenter/f/d$3;-><init>(Lcom/kwad/components/ad/reward/presenter/f/d;)V

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/webview/tachikoma/a/h;->a(Lcom/kwad/components/core/webview/tachikoma/a/h$a;)V

    .line 32
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->ws:Lcom/kwad/components/core/webview/tachikoma/a/h;

    invoke-interface {p1, v0}, Lcom/kwad/sdk/components/r;->c(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 33
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/af;

    invoke-direct {v0}, Lcom/kwad/components/core/webview/jshandler/af;-><init>()V

    invoke-interface {p1, v0}, Lcom/kwad/sdk/components/r;->c(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 34
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/be;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v1, v1, Lcom/kwad/components/ad/reward/g;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    iget-object v2, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->wu:Lcom/kwad/components/core/webview/jshandler/be$b;

    invoke-direct {v0, p2, v1, v2}, Lcom/kwad/components/core/webview/jshandler/be;-><init>(Lcom/kwad/sdk/core/webview/b;Lcom/kwad/components/core/e/d/c;Lcom/kwad/components/core/webview/jshandler/be$b;)V

    invoke-interface {p1, v0}, Lcom/kwad/sdk/components/r;->c(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 35
    new-instance p2, Lcom/kwad/components/core/webview/tachikoma/a/y;

    invoke-direct {p2, p0}, Lcom/kwad/components/core/webview/tachikoma/a/y;-><init>(Lcom/kwad/components/core/webview/tachikoma/a/y$a;)V

    invoke-interface {p1, p2}, Lcom/kwad/sdk/components/r;->c(Lcom/kwad/sdk/core/webview/c/a;)V

    return-void
.end method

.method public final a(Lcom/kwad/sdk/core/response/model/TKAdLiveShopItemInfo;)V
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v0, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iput-object p1, v0, Lcom/kwad/sdk/core/response/model/AdTemplate;->tkLiveShopItemInfo:Lcom/kwad/sdk/core/response/model/TKAdLiveShopItemInfo;

    return-void
.end method

.method public a(Lcom/kwad/sdk/core/webview/d/b/a;)V
    .locals 0
    .param p1    # Lcom/kwad/sdk/core/webview/d/b/a;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 58
    iget-object p1, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object p1, p1, Lcom/kwad/components/ad/reward/g;->oJ:Lcom/kwad/components/ad/reward/e/b;

    invoke-interface {p1}, Lcom/kwad/components/ad/reward/e/b;->bJ()V

    return-void
.end method

.method public aj()V
    .locals 5

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/reward/presenter/b;->aj()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->wr:Z

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    invoke-virtual {v0, p0}, Lcom/kwad/components/ad/reward/g;->a(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->wl:Lcom/kwad/components/ad/reward/k/a/d;

    if-nez v0, :cond_0

    .line 5
    new-instance v0, Lcom/kwad/components/ad/reward/k/a/d;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    const-wide/16 v2, -0x1

    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/kwad/components/ad/reward/k/a/d;-><init>(Lcom/kwad/components/ad/reward/g;JLandroid/content/Context;)V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->wl:Lcom/kwad/components/ad/reward/k/a/d;

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->wq:Lcom/kwad/components/core/webview/tachikoma/b/y;

    if-nez v0, :cond_1

    .line 7
    new-instance v0, Lcom/kwad/components/core/webview/tachikoma/b/y;

    invoke-direct {v0}, Lcom/kwad/components/core/webview/tachikoma/b/y;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->wq:Lcom/kwad/components/core/webview/tachikoma/b/y;

    .line 8
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->wl:Lcom/kwad/components/ad/reward/k/a/d;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    invoke-virtual {v1}, Lcom/kwad/components/core/l/a;->getActivity()Landroid/app/Activity;

    move-result-object v1

    iget-object v2, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v2, v2, Lcom/kwad/components/ad/reward/g;->mAdResultData:Lcom/kwad/sdk/core/response/model/AdResultData;

    invoke-virtual {v0, v1, v2, p0}, Lcom/kwad/components/ad/reward/k/a/d;->a(Landroid/app/Activity;Lcom/kwad/sdk/core/response/model/AdResultData;Lcom/kwad/components/core/webview/tachikoma/j;)V

    .line 9
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->wt:Lcom/kwad/components/ad/reward/presenter/f/e;

    if-eqz v0, :cond_2

    .line 10
    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/presenter/f/e;->y(Lcom/kwad/components/ad/reward/g;)V

    :cond_2
    return-void
.end method

.method public bF()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->wt:Lcom/kwad/components/ad/reward/presenter/f/e;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/presenter/f/e;->bF()V

    :cond_0
    return-void
.end method

.method public bG()V
    .locals 0

    return-void
.end method

.method public getTouchCoordsView()Lcom/kwad/sdk/widget/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->mRootContainer:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

    return-object v0
.end method

.method protected iN()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->wl:Lcom/kwad/components/ad/reward/k/a/d;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/k/a/d;->jo()Lcom/kwad/components/ad/reward/c/e;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->wl:Lcom/kwad/components/ad/reward/k/a/d;

    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/k/a/d;->jo()Lcom/kwad/components/ad/reward/c/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/c/e;->gR()V

    :cond_0
    return-void
.end method

.method public onUnbind()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onUnbind()V

    .line 2
    iget-boolean v0, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->wr:Z

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->wt:Lcom/kwad/components/ad/reward/presenter/f/e;

    if-eqz v0, :cond_1

    .line 4
    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/presenter/f/e;->z(Lcom/kwad/components/ad/reward/g;)V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    invoke-virtual {v0, p0}, Lcom/kwad/components/ad/reward/g;->b(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->wl:Lcom/kwad/components/ad/reward/k/a/d;

    if-eqz v0, :cond_2

    .line 7
    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/k/a/d;->jq()V

    .line 8
    :cond_2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->oK:Lcom/kwad/components/ad/reward/m/e;

    if-eqz v0, :cond_3

    .line 9
    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->gO:Lcom/kwad/components/core/video/l;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/m/e;->b(Lcom/kwad/components/core/video/l;)V

    .line 10
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->oK:Lcom/kwad/components/ad/reward/m/e;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->hq:Lcom/kwad/sdk/utils/h$a;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/m/e;->b(Lcom/kwad/sdk/utils/h$a;)V

    .line 11
    :cond_3
    invoke-static {}, Lcom/kwad/components/ad/reward/b;->fc()Lcom/kwad/components/ad/reward/b;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->mRewardVerifyListener:Lcom/kwad/components/ad/reward/e/l;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/b;->b(Lcom/kwad/components/ad/reward/e/l;)V

    .line 12
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/f/d;->mPlayEndPageListener:Lcom/kwad/components/ad/reward/e/g;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/g;->c(Lcom/kwad/components/ad/reward/e/g;)V

    return-void
.end method
