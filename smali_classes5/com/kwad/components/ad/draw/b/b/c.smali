.class public final Lcom/kwad/components/ad/draw/b/b/c;
.super Lcom/kwad/components/ad/draw/a/a;
.source "SourceFile"


# instance fields
.field private cG:Lcom/kwad/components/ad/draw/b/b/a$b;

.field private cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

.field private cM:Lcom/kwad/components/core/webview/jshandler/aj$a;

.field private cN:Lcom/kwad/components/core/webview/a;

.field private cO:Lcom/kwad/sdk/core/webview/b;

.field private cP:I

.field private cQ:Lcom/kwad/components/core/webview/jshandler/aw;

.field private cR:Lcom/kwad/sdk/core/webview/d/a/a;

.field private cS:Lcom/kwad/components/core/webview/jshandler/aj$b;

.field private cT:Lcom/kwad/components/core/webview/jshandler/ai$b;

.field private cU:Lcom/kwad/components/core/webview/jshandler/aq$b;

.field private cV:Landroid/animation/ValueAnimator;

.field private cW:Landroid/animation/ValueAnimator;

.field private co:Landroid/view/ViewGroup;

.field private mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

.field private mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

.field private mVideoPlayStateListener:Lcom/kwad/components/core/video/k;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/draw/a/a;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cP:I

    .line 3
    new-instance v0, Lcom/kwad/components/ad/draw/b/b/c$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/draw/b/b/c$1;-><init>(Lcom/kwad/components/ad/draw/b/b/c;)V

    iput-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->mVideoPlayStateListener:Lcom/kwad/components/core/video/k;

    .line 4
    new-instance v0, Lcom/kwad/components/ad/draw/b/b/c$2;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/draw/b/b/c$2;-><init>(Lcom/kwad/components/ad/draw/b/b/c;)V

    iput-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cG:Lcom/kwad/components/ad/draw/b/b/a$b;

    .line 5
    new-instance v0, Lcom/kwad/components/ad/draw/b/b/c$3;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/draw/b/b/c$3;-><init>(Lcom/kwad/components/ad/draw/b/b/c;)V

    iput-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cR:Lcom/kwad/sdk/core/webview/d/a/a;

    .line 6
    new-instance v0, Lcom/kwad/components/ad/draw/b/b/c$4;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/draw/b/b/c$4;-><init>(Lcom/kwad/components/ad/draw/b/b/c;)V

    iput-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cS:Lcom/kwad/components/core/webview/jshandler/aj$b;

    .line 7
    new-instance v0, Lcom/kwad/components/ad/draw/b/b/c$5;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/draw/b/b/c$5;-><init>(Lcom/kwad/components/ad/draw/b/b/c;)V

    iput-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cT:Lcom/kwad/components/core/webview/jshandler/ai$b;

    .line 8
    new-instance v0, Lcom/kwad/components/ad/draw/b/b/c$6;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/draw/b/b/c$6;-><init>(Lcom/kwad/components/ad/draw/b/b/c;)V

    iput-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cU:Lcom/kwad/components/core/webview/jshandler/aq$b;

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/draw/b/b/c;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/components/ad/draw/b/b/c;->cP:I

    return p1
.end method

.method static synthetic a(Lcom/kwad/components/ad/draw/b/b/c;Lcom/kwad/components/core/webview/jshandler/aj$a;)Lcom/kwad/components/core/webview/jshandler/aj$a;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/kwad/components/ad/draw/b/b/c;->cM:Lcom/kwad/components/core/webview/jshandler/aj$a;

    return-object p1
.end method

.method static synthetic a(Lcom/kwad/components/ad/draw/b/b/c;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/kwad/components/ad/draw/b/b/c;->release()V

    return-void
.end method

.method private a(Lcom/kwad/components/core/webview/a;)V
    .locals 5

    .line 4
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/aa;

    iget-object v1, p0, Lcom/kwad/components/ad/draw/b/b/c;->cO:Lcom/kwad/sdk/core/webview/b;

    iget-object v2, p0, Lcom/kwad/components/ad/draw/b/b/c;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    iget-object v3, p0, Lcom/kwad/components/ad/draw/b/b/c;->cR:Lcom/kwad/sdk/core/webview/d/a/a;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/kwad/components/core/webview/jshandler/aa;-><init>(Lcom/kwad/sdk/core/webview/b;Lcom/kwad/components/core/e/d/c;Lcom/kwad/sdk/core/webview/d/a/a;B)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 5
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/x;

    iget-object v1, p0, Lcom/kwad/components/ad/draw/b/b/c;->cO:Lcom/kwad/sdk/core/webview/b;

    iget-object v2, p0, Lcom/kwad/components/ad/draw/b/b/c;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    iget-object v3, p0, Lcom/kwad/components/ad/draw/b/b/c;->cR:Lcom/kwad/sdk/core/webview/d/a/a;

    invoke-direct {v0, v1, v2, v3}, Lcom/kwad/components/core/webview/jshandler/x;-><init>(Lcom/kwad/sdk/core/webview/b;Lcom/kwad/components/core/e/d/c;Lcom/kwad/sdk/core/webview/d/a/a;)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 6
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/ad;

    iget-object v1, p0, Lcom/kwad/components/ad/draw/b/b/c;->cO:Lcom/kwad/sdk/core/webview/b;

    invoke-direct {v0, v1}, Lcom/kwad/components/core/webview/jshandler/ad;-><init>(Lcom/kwad/sdk/core/webview/b;)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 7
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/ag;

    iget-object v1, p0, Lcom/kwad/components/ad/draw/b/b/c;->cO:Lcom/kwad/sdk/core/webview/b;

    invoke-direct {v0, v1}, Lcom/kwad/components/core/webview/jshandler/ag;-><init>(Lcom/kwad/sdk/core/webview/b;)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 8
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/ac;

    iget-object v1, p0, Lcom/kwad/components/ad/draw/b/b/c;->cO:Lcom/kwad/sdk/core/webview/b;

    invoke-direct {v0, v1}, Lcom/kwad/components/core/webview/jshandler/ac;-><init>(Lcom/kwad/sdk/core/webview/b;)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 9
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/aj;

    iget-object v1, p0, Lcom/kwad/components/ad/draw/b/b/c;->cO:Lcom/kwad/sdk/core/webview/b;

    iget-object v2, p0, Lcom/kwad/components/ad/draw/b/b/c;->cS:Lcom/kwad/components/core/webview/jshandler/aj$b;

    invoke-direct {v0, v1, v2}, Lcom/kwad/components/core/webview/jshandler/aj;-><init>(Lcom/kwad/sdk/core/webview/b;Lcom/kwad/components/core/webview/jshandler/aj$b;)V

    .line 10
    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 11
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/aq;

    iget-object v1, p0, Lcom/kwad/components/ad/draw/b/b/c;->cU:Lcom/kwad/components/core/webview/jshandler/aq$b;

    iget-object v2, p0, Lcom/kwad/components/ad/draw/b/b/c;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 12
    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/b;->cm(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/kwad/components/core/webview/jshandler/aq;-><init>(Lcom/kwad/components/core/webview/jshandler/aq$b;Ljava/lang/String;)V

    .line 13
    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 14
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/aw;

    invoke-direct {v0}, Lcom/kwad/components/core/webview/jshandler/aw;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cQ:Lcom/kwad/components/core/webview/jshandler/aw;

    .line 15
    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 16
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/az;

    iget-object v1, p0, Lcom/kwad/components/ad/draw/b/b/c;->cO:Lcom/kwad/sdk/core/webview/b;

    iget-object v2, p0, Lcom/kwad/components/ad/draw/b/b/c;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    invoke-direct {v0, v1, v2}, Lcom/kwad/components/core/webview/jshandler/az;-><init>(Lcom/kwad/sdk/core/webview/b;Lcom/kwad/components/core/e/d/c;)V

    .line 17
    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 18
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/ai;

    iget-object v1, p0, Lcom/kwad/components/ad/draw/b/b/c;->cT:Lcom/kwad/components/core/webview/jshandler/ai$b;

    invoke-direct {v0, v1}, Lcom/kwad/components/core/webview/jshandler/ai;-><init>(Lcom/kwad/components/core/webview/jshandler/ai$b;)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 19
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/ak;

    iget-object v1, p0, Lcom/kwad/components/ad/draw/b/b/c;->cO:Lcom/kwad/sdk/core/webview/b;

    invoke-direct {v0, v1}, Lcom/kwad/components/core/webview/jshandler/ak;-><init>(Lcom/kwad/sdk/core/webview/b;)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 20
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/m;

    iget-object v1, p0, Lcom/kwad/components/ad/draw/b/b/c;->cO:Lcom/kwad/sdk/core/webview/b;

    invoke-direct {v0, v1}, Lcom/kwad/components/core/webview/jshandler/m;-><init>(Lcom/kwad/sdk/core/webview/b;)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->b(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 21
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/l;

    iget-object v1, p0, Lcom/kwad/components/ad/draw/b/b/c;->cO:Lcom/kwad/sdk/core/webview/b;

    invoke-direct {v0, v1}, Lcom/kwad/components/core/webview/jshandler/l;-><init>(Lcom/kwad/sdk/core/webview/b;)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->b(Lcom/kwad/sdk/core/webview/c/a;)V

    return-void
.end method

.method private aA()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cN:Lcom/kwad/components/core/webview/a;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/a;->destroy()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cN:Lcom/kwad/components/core/webview/a;

    :cond_0
    return-void
.end method

.method private aB()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cP:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/ad/draw/b/b/c;->aC()V

    return v1

    .line 3
    :cond_0
    invoke-direct {p0}, Lcom/kwad/components/ad/draw/b/b/c;->aH()V

    const/4 v0, 0x0

    return v0
.end method

.method private aC()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cM:Lcom/kwad/components/core/webview/jshandler/aj$a;

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/ad/draw/b/b/c;->aD()V

    return-void

    .line 3
    :cond_0
    invoke-direct {p0}, Lcom/kwad/components/ad/draw/b/b/c;->aG()V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->co:Landroid/view/ViewGroup;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    iget-object v2, p0, Lcom/kwad/components/ad/draw/b/b/c;->cM:Lcom/kwad/components/core/webview/jshandler/aj$a;

    iget v3, v2, Lcom/kwad/components/core/webview/jshandler/aj$a;->height:I

    iget v2, v2, Lcom/kwad/components/core/webview/jshandler/aj$a;->bottomMargin:I

    add-int/2addr v3, v2

    invoke-static {v0, v3, v1}, Lcom/kwad/components/core/s/n;->c(Landroid/view/View;II)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cV:Landroid/animation/ValueAnimator;

    .line 7
    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    const/high16 v2, 0x40000000    # 2.0f

    invoke-direct {v1, v2}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 8
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cV:Landroid/animation/ValueAnimator;

    const-wide/16 v1, 0x12c

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 9
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cV:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/kwad/components/ad/draw/b/b/c$7;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/draw/b/b/c$7;-><init>(Lcom/kwad/components/ad/draw/b/b/c;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 10
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cV:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method

.method private aD()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cQ:Lcom/kwad/components/core/webview/jshandler/aw;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sV()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->co:Landroid/view/ViewGroup;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cQ:Lcom/kwad/components/core/webview/jshandler/aw;

    if-eqz v0, :cond_1

    .line 6
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sW()V

    :cond_1
    return-void
.end method

.method private aE()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cM:Lcom/kwad/components/core/webview/jshandler/aj$a;

    if-nez v0, :cond_1

    .line 3
    invoke-direct {p0}, Lcom/kwad/components/ad/draw/b/b/c;->aF()V

    return-void

    .line 4
    :cond_1
    invoke-direct {p0}, Lcom/kwad/components/ad/draw/b/b/c;->aG()V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/kwad/components/ad/draw/b/b/c;->cM:Lcom/kwad/components/core/webview/jshandler/aj$a;

    iget v3, v2, Lcom/kwad/components/core/webview/jshandler/aj$a;->height:I

    iget v2, v2, Lcom/kwad/components/core/webview/jshandler/aj$a;->bottomMargin:I

    add-int/2addr v3, v2

    invoke-static {v0, v1, v3}, Lcom/kwad/components/core/s/n;->c(Landroid/view/View;II)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cW:Landroid/animation/ValueAnimator;

    .line 6
    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    const/high16 v2, 0x40000000    # 2.0f

    invoke-direct {v1, v2}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 7
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cW:Landroid/animation/ValueAnimator;

    const-wide/16 v1, 0x12c

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 8
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cW:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/kwad/components/ad/draw/b/b/c$8;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/draw/b/b/c$8;-><init>(Lcom/kwad/components/ad/draw/b/b/c;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 9
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cW:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method

.method private aF()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cQ:Lcom/kwad/components/core/webview/jshandler/aw;

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sX()V

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->co:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cQ:Lcom/kwad/components/core/webview/jshandler/aw;

    if-eqz v0, :cond_2

    .line 7
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sY()V

    :cond_2
    return-void
.end method

.method private aG()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cV:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->removeAllListeners()V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cV:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cW:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->removeAllListeners()V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cW:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_1
    return-void
.end method

.method private aH()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cP:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const-string v0, "timeout"

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const-string v0, "h5error"

    goto :goto_0

    :cond_1
    const-string v0, "others"

    .line 2
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "show webCard fail, reason: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "DrawPlayWebCard"

    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private ax()V
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/sdk/core/webview/b;

    invoke-direct {v0}, Lcom/kwad/sdk/core/webview/b;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cO:Lcom/kwad/sdk/core/webview/b;

    .line 2
    iget-object v1, p0, Lcom/kwad/components/ad/draw/a/a;->bO:Lcom/kwad/components/ad/draw/a/b;

    iget-object v1, v1, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/webview/b;->setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cO:Lcom/kwad/sdk/core/webview/b;

    const/4 v1, 0x0

    iput v1, v0, Lcom/kwad/sdk/core/webview/b;->mScreenOrientation:I

    .line 4
    iget-object v1, p0, Lcom/kwad/components/ad/draw/a/a;->bO:Lcom/kwad/components/ad/draw/a/b;

    iget-object v1, v1, Lcom/kwad/components/ad/draw/a/b;->mRootContainer:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

    iput-object v1, v0, Lcom/kwad/sdk/core/webview/b;->aEW:Lcom/kwad/sdk/widget/e;

    .line 5
    iput-object v1, v0, Lcom/kwad/sdk/core/webview/b;->Ph:Landroid/view/ViewGroup;

    .line 6
    iget-object v1, p0, Lcom/kwad/components/ad/draw/b/b/c;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    iput-object v1, v0, Lcom/kwad/sdk/core/webview/b;->OA:Landroid/webkit/WebView;

    return-void
.end method

.method private ay()V
    .locals 2

    const/4 v0, -0x1

    .line 1
    iput v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cP:I

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/ad/draw/b/b/c;->az()V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    iget-object v1, p0, Lcom/kwad/components/ad/draw/b/b/c;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/b;->cm(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/webview/KsAdWebView;->loadUrl(Ljava/lang/String;)V

    return-void
.end method

.method private az()V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetJavaScriptEnabled",
            "AddJavascriptInterface",
            "JavascriptInterface"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/draw/b/b/c;->aA()V

    .line 2
    new-instance v0, Lcom/kwad/components/core/webview/a;

    iget-object v1, p0, Lcom/kwad/components/ad/draw/b/b/c;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    invoke-direct {v0, v1}, Lcom/kwad/components/core/webview/a;-><init>(Landroid/webkit/WebView;)V

    iput-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cN:Lcom/kwad/components/core/webview/a;

    .line 3
    invoke-direct {p0, v0}, Lcom/kwad/components/ad/draw/b/b/c;->a(Lcom/kwad/components/core/webview/a;)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    iget-object v1, p0, Lcom/kwad/components/ad/draw/b/b/c;->cN:Lcom/kwad/components/core/webview/a;

    const-string v2, "KwaiAd"

    invoke-virtual {v0, v1, v2}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic b(Lcom/kwad/components/ad/draw/b/b/c;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/draw/b/b/c;->aB()Z

    move-result p0

    return p0
.end method

.method static synthetic c(Lcom/kwad/components/ad/draw/b/b/c;)Lcom/kwad/components/ad/draw/a/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/draw/a/a;->bO:Lcom/kwad/components/ad/draw/a/b;

    return-object p0
.end method

.method static synthetic d(Lcom/kwad/components/ad/draw/b/b/c;)Lcom/kwad/components/ad/draw/a/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/draw/a/a;->bO:Lcom/kwad/components/ad/draw/a/b;

    return-object p0
.end method

.method static synthetic e(Lcom/kwad/components/ad/draw/b/b/c;)Lcom/kwad/sdk/core/webview/KsAdWebView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    return-object p0
.end method

.method static synthetic f(Lcom/kwad/components/ad/draw/b/b/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/draw/b/b/c;->aE()V

    return-void
.end method

.method static synthetic g(Lcom/kwad/components/ad/draw/b/b/c;)Lcom/kwad/components/core/webview/jshandler/aw;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cQ:Lcom/kwad/components/core/webview/jshandler/aw;

    return-object p0
.end method

.method static synthetic h(Lcom/kwad/components/ad/draw/b/b/c;)Landroid/view/ViewGroup;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/draw/b/b/c;->co:Landroid/view/ViewGroup;

    return-object p0
.end method

.method private release()V
    .locals 2

    const/4 v0, -0x1

    .line 1
    iput v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cP:I

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 3
    invoke-direct {p0}, Lcom/kwad/components/ad/draw/b/b/c;->aA()V

    return-void
.end method


# virtual methods
.method public final aj()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/draw/a/a;->aj()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/draw/a/a;->bO:Lcom/kwad/components/ad/draw/a/b;

    iget-object v1, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iput-object v1, p0, Lcom/kwad/components/ad/draw/b/b/c;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 3
    iget-object v0, v0, Lcom/kwad/components/ad/draw/a/b;->ch:Lcom/kwad/components/ad/draw/b/b/a;

    iget-object v1, p0, Lcom/kwad/components/ad/draw/b/b/c;->cG:Lcom/kwad/components/ad/draw/b/b/a$b;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/draw/b/b/a;->a(Lcom/kwad/components/ad/draw/b/b/a$b;)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/draw/a/a;->bO:Lcom/kwad/components/ad/draw/a/b;

    iget-object v1, v0, Lcom/kwad/components/ad/draw/a/b;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    iput-object v1, p0, Lcom/kwad/components/ad/draw/b/b/c;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    .line 5
    iget-object v0, v0, Lcom/kwad/components/ad/draw/a/b;->bP:Lcom/kwad/components/ad/draw/c/a;

    iget-object v1, p0, Lcom/kwad/components/ad/draw/b/b/c;->mVideoPlayStateListener:Lcom/kwad/components/core/video/k;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/k/b;->a(Lcom/kwad/components/core/video/k;)V

    .line 6
    invoke-direct {p0}, Lcom/kwad/components/ad/draw/b/b/c;->ax()V

    .line 7
    invoke-direct {p0}, Lcom/kwad/components/ad/draw/b/b/c;->ay()V

    return-void
.end method

.method public final onCreate()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onCreate()V

    .line 2
    sget v0, Lcom/kwad/sdk/R$id;->ksad_ad_normal_container:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->co:Landroid/view/ViewGroup;

    .line 3
    sget v0, Lcom/kwad/sdk/R$id;->ksad_play_web_card_webView:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/core/webview/KsAdWebView;

    iput-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    return-void
.end method

.method public final onUnbind()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onUnbind()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/draw/a/a;->bO:Lcom/kwad/components/ad/draw/a/b;

    iget-object v0, v0, Lcom/kwad/components/ad/draw/a/b;->ch:Lcom/kwad/components/ad/draw/b/b/a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/draw/b/b/a;->a(Lcom/kwad/components/ad/draw/b/b/a$b;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/draw/a/a;->bO:Lcom/kwad/components/ad/draw/a/b;

    iget-object v0, v0, Lcom/kwad/components/ad/draw/a/b;->bP:Lcom/kwad/components/ad/draw/c/a;

    iget-object v1, p0, Lcom/kwad/components/ad/draw/b/b/c;->mVideoPlayStateListener:Lcom/kwad/components/core/video/k;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/k/b;->b(Lcom/kwad/components/core/video/k;)V

    .line 4
    invoke-direct {p0}, Lcom/kwad/components/ad/draw/b/b/c;->aG()V

    .line 5
    invoke-direct {p0}, Lcom/kwad/components/ad/draw/b/b/c;->release()V

    return-void
.end method
