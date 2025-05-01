.class public Lcom/beizi/ad/internal/view/BannerAdViewImpl;
.super Lcom/beizi/ad/internal/view/AdViewImpl;
.source "BannerAdViewImpl.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/ad/internal/view/BannerAdViewImpl$a;,
        Lcom/beizi/ad/internal/view/BannerAdViewImpl$b;
    }
.end annotation


# instance fields
.field private A:Lcom/beizi/ad/internal/view/c;

.field private B:Lcom/beizi/ad/internal/view/BannerAdViewImpl$a;

.field protected m:Z

.field protected n:I

.field protected o:I

.field private p:I

.field private q:Z

.field private r:Z

.field private s:Landroid/content/BroadcastReceiver;

.field private t:Z

.field private u:Z

.field private v:Z

.field private w:Lcom/beizi/ad/internal/animation/Animator;

.field private x:Z

.field private y:Lcom/beizi/ad/internal/view/AdWebView;

.field private z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/beizi/ad/internal/view/AdViewImpl;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->z:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 9
    invoke-direct {p0, p1}, Lcom/beizi/ad/internal/view/AdViewImpl;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->z:Z

    .line 11
    invoke-virtual {p0, p2}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->setAutoRefreshInterval(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Lcom/beizi/ad/internal/view/AdViewImpl;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->z:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2, p3}, Lcom/beizi/ad/internal/view/AdViewImpl;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->z:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/view/View;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/beizi/ad/internal/view/AdViewImpl;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/view/View;)V

    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->z:Z

    return-void
.end method

.method static synthetic a(Lcom/beizi/ad/internal/view/BannerAdViewImpl;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->p:I

    return p0
.end method

.method static synthetic b(Lcom/beizi/ad/internal/view/BannerAdViewImpl;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->r:Z

    return p0
.end method

.method private j()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->q:Z

    const/4 v1, -0x1

    .line 2
    iput v1, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->p:I

    .line 3
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->r:Z

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->x:Z

    return-void
.end method

.method private k()V
    .locals 4

    const-string v0, "BeiZisAd"

    .line 1
    iget-object v1, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->s:Landroid/content/BroadcastReceiver;

    if-eqz v1, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "android.intent.action.SCREEN_OFF"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const-string v2, "android.intent.action.SCREEN_ON"

    .line 3
    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 4
    new-instance v2, Lcom/beizi/ad/internal/view/BannerAdViewImpl$1;

    invoke-direct {v2, p0}, Lcom/beizi/ad/internal/view/BannerAdViewImpl$1;-><init>(Lcom/beizi/ad/internal/view/BannerAdViewImpl;)V

    iput-object v2, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->s:Landroid/content/BroadcastReceiver;

    :try_start_0
    const-string v2, "before registerReceiver"

    .line 5
    invoke-static {v0, v2}, Lcom/beizi/ad/lance/a/l;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->s:Landroid/content/BroadcastReceiver;

    invoke-virtual {v2, v3, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const-string v1, "ignore error"

    .line 7
    invoke-static {v0, v1}, Lcom/beizi/ad/lance/a/l;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method private l()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->p:I

    if-lez v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->k()V

    :cond_0
    return-void
.end method

.method private m()V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "enter dismantleBroadcast mReceiver == null ? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->s:Landroid/content/BroadcastReceiver;

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "BeiZisAd"

    invoke-static {v1, v0}, Lcom/beizi/ad/lance/a/l;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->s:Landroid/content/BroadcastReceiver;

    if-nez v0, :cond_1

    return-void

    .line 3
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v2, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->s:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v2}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    const-string v0, "after unregisterReceiver"

    .line 4
    invoke-static {v1, v0}, Lcom/beizi/ad/lance/a/l;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const-string v0, "got IllegalArgumentException"

    .line 5
    invoke-static {v1, v0}, Lcom/beizi/ad/lance/a/l;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->s:Landroid/content/BroadcastReceiver;

    return-void
.end method


# virtual methods
.method protected a(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->p:I

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->m:Z

    .line 4
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->t:Z

    .line 5
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->u:Z

    .line 6
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->v:Z

    .line 7
    new-instance v0, Lcom/beizi/ad/internal/animation/Animator;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    sget-object v3, Lcom/beizi/ad/internal/animation/TransitionType;->NONE:Lcom/beizi/ad/internal/animation/TransitionType;

    sget-object v4, Lcom/beizi/ad/internal/animation/TransitionDirection;->UP:Lcom/beizi/ad/internal/animation/TransitionDirection;

    const-wide/16 v5, 0x1f4

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/beizi/ad/internal/animation/Animator;-><init>(Landroid/content/Context;Lcom/beizi/ad/internal/animation/TransitionType;Lcom/beizi/ad/internal/animation/TransitionDirection;J)V

    iput-object v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->w:Lcom/beizi/ad/internal/animation/Animator;

    .line 8
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_0

    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    .line 11
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v2

    int-to-float v1, v1

    .line 12
    invoke-virtual {v2}, Lcom/beizi/ad/internal/g;->i()F

    move-result v3

    div-float/2addr v1, v3

    const/high16 v3, 0x3f000000    # 0.5f

    add-float/2addr v1, v3

    float-to-int v1, v1

    int-to-float v0, v0

    .line 13
    invoke-virtual {v2}, Lcom/beizi/ad/internal/g;->h()F

    move-result v2

    div-float/2addr v0, v2

    add-float/2addr v0, v3

    float-to-int v0, v0

    .line 14
    iget-object v2, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->h:Lcom/beizi/ad/internal/d;

    invoke-virtual {v2, v0}, Lcom/beizi/ad/internal/d;->d(I)V

    .line 15
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->h:Lcom/beizi/ad/internal/d;

    invoke-virtual {v0, v1}, Lcom/beizi/ad/internal/d;->e(I)V

    .line 16
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/beizi/ad/internal/view/AdViewImpl;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 17
    invoke-direct {p0}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->l()V

    .line 18
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->h:Lcom/beizi/ad/internal/d;

    iget-object p2, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->a:Landroid/view/ViewGroup;

    if-eqz p2, :cond_1

    sget-object p2, Lcom/beizi/ad/internal/j;->a:Lcom/beizi/ad/internal/j;

    goto :goto_0

    :cond_1
    sget-object p2, Lcom/beizi/ad/internal/j;->b:Lcom/beizi/ad/internal/j;

    :goto_0
    invoke-virtual {p1, p2}, Lcom/beizi/ad/internal/d;->a(Lcom/beizi/ad/internal/j;)V

    .line 19
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->mAdFetcher:Lcom/beizi/ad/internal/c;

    iget p2, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->p:I

    invoke-virtual {p1, p2}, Lcom/beizi/ad/internal/c;->a(I)V

    .line 20
    iget-boolean p1, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->x:Z

    if-eqz p1, :cond_2

    .line 21
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->mAdFetcher:Lcom/beizi/ad/internal/c;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/c;->b()V

    const/4 p1, 0x1

    .line 22
    iput-boolean p1, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->q:Z

    :cond_2
    return-void
.end method

.method protected a(Lcom/beizi/ad/internal/a/e;)V
    .locals 0

    .line 64
    invoke-virtual {p0, p1}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->a(Lcom/beizi/ad/internal/view/c;)V

    return-void
.end method

.method protected a(Lcom/beizi/ad/internal/view/c;)V
    .locals 4

    if-eqz p1, :cond_11

    .line 23
    invoke-interface {p1}, Lcom/beizi/ad/internal/view/c;->failed()Z

    move-result v0

    if-nez v0, :cond_11

    invoke-interface {p1}, Lcom/beizi/ad/internal/view/c;->getView()Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_3

    .line 24
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->c:Lcom/beizi/ad/internal/view/c;

    if-ne v0, p1, :cond_1

    return-void

    .line 25
    :cond_1
    iput-object p1, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->A:Lcom/beizi/ad/internal/view/c;

    .line 26
    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->getTransitionType()Lcom/beizi/ad/internal/animation/TransitionType;

    move-result-object v0

    sget-object v1, Lcom/beizi/ad/internal/animation/TransitionType;->NONE:Lcom/beizi/ad/internal/animation/TransitionType;

    if-ne v0, v1, :cond_6

    .line 27
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 28
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->c:Lcom/beizi/ad/internal/view/c;

    if-eqz v0, :cond_2

    .line 29
    invoke-interface {v0}, Lcom/beizi/ad/internal/view/c;->destroy()V

    .line 30
    :cond_2
    invoke-interface {p1}, Lcom/beizi/ad/internal/view/c;->getView()Landroid/view/View;

    move-result-object v0

    .line 31
    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 32
    instance-of v1, v0, Lcom/beizi/ad/internal/view/AdWebView;

    if-eqz v1, :cond_3

    const-string v1, "BeiZisAd"

    const-string v2, "set mAdWebView"

    .line 33
    invoke-static {v1, v2}, Lcom/beizi/ad/lance/a/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    move-object v1, v0

    check-cast v1, Lcom/beizi/ad/internal/view/AdWebView;

    iput-object v1, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->y:Lcom/beizi/ad/internal/view/AdWebView;

    .line 35
    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 36
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->getAdAlignment()Lcom/beizi/ad/internal/view/BannerAdViewImpl$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beizi/ad/internal/view/BannerAdViewImpl$a;->a()I

    move-result v1

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 37
    :cond_4
    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->getMediaType()Lcom/beizi/ad/internal/j;

    move-result-object v0

    sget-object v1, Lcom/beizi/ad/internal/j;->a:Lcom/beizi/ad/internal/j;

    if-ne v0, v1, :cond_5

    invoke-interface {p1}, Lcom/beizi/ad/internal/view/c;->getView()Landroid/view/View;

    move-result-object v0

    instance-of v0, v0, Lcom/beizi/ad/internal/video/AdVideoView;

    if-eqz v0, :cond_f

    .line 38
    :cond_5
    invoke-interface {p1}, Lcom/beizi/ad/internal/view/c;->visible()V

    goto/16 :goto_2

    .line 39
    :cond_6
    invoke-interface {p1}, Lcom/beizi/ad/internal/view/c;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 40
    invoke-interface {p1}, Lcom/beizi/ad/internal/view/c;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->getAdAlignment()Lcom/beizi/ad/internal/view/BannerAdViewImpl$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beizi/ad/internal/view/BannerAdViewImpl$a;->a()I

    move-result v1

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 41
    iget-object v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->w:Lcom/beizi/ad/internal/animation/Animator;

    invoke-interface {p1}, Lcom/beizi/ad/internal/view/c;->getView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ViewAnimator;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 42
    :cond_7
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getChildCount()I

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->w:Lcom/beizi/ad/internal/animation/Animator;

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->indexOfChild(Landroid/view/View;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_8

    goto :goto_0

    .line 43
    :cond_8
    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->getMediaType()Lcom/beizi/ad/internal/j;

    move-result-object v0

    sget-object v1, Lcom/beizi/ad/internal/j;->a:Lcom/beizi/ad/internal/j;

    if-ne v0, v1, :cond_9

    invoke-interface {p1}, Lcom/beizi/ad/internal/view/c;->getView()Landroid/view/View;

    move-result-object v0

    instance-of v0, v0, Lcom/beizi/ad/internal/video/AdVideoView;

    if-eqz v0, :cond_a

    .line 44
    :cond_9
    invoke-interface {p1}, Lcom/beizi/ad/internal/view/c;->visible()V

    .line 45
    :cond_a
    iget-object v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->w:Lcom/beizi/ad/internal/animation/Animator;

    invoke-interface {p1}, Lcom/beizi/ad/internal/view/c;->getView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ViewAnimator;->addView(Landroid/view/View;)V

    .line 46
    iget-object v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->w:Lcom/beizi/ad/internal/animation/Animator;

    invoke-virtual {v0}, Landroid/widget/ViewAnimator;->showNext()V

    goto :goto_1

    .line 47
    :cond_b
    :goto_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 48
    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->getMediaType()Lcom/beizi/ad/internal/j;

    move-result-object v0

    sget-object v1, Lcom/beizi/ad/internal/j;->a:Lcom/beizi/ad/internal/j;

    if-ne v0, v1, :cond_c

    invoke-interface {p1}, Lcom/beizi/ad/internal/view/c;->getView()Landroid/view/View;

    move-result-object v0

    instance-of v0, v0, Lcom/beizi/ad/internal/video/AdVideoView;

    if-eqz v0, :cond_d

    .line 49
    :cond_c
    invoke-interface {p1}, Lcom/beizi/ad/internal/view/c;->visible()V

    .line 50
    :cond_d
    iget-object v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->w:Lcom/beizi/ad/internal/animation/Animator;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;I)V

    .line 51
    iget-object v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->w:Lcom/beizi/ad/internal/animation/Animator;

    invoke-interface {p1}, Lcom/beizi/ad/internal/view/c;->getView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ViewAnimator;->addView(Landroid/view/View;)V

    .line 52
    :goto_1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->c:Lcom/beizi/ad/internal/view/c;

    if-eqz v0, :cond_f

    .line 53
    invoke-interface {v0}, Lcom/beizi/ad/internal/view/c;->getView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v1

    if-eqz v1, :cond_e

    .line 54
    invoke-interface {v0}, Lcom/beizi/ad/internal/view/c;->getView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v1

    new-instance v2, Lcom/beizi/ad/internal/view/BannerAdViewImpl$b;

    iget-object v3, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->w:Lcom/beizi/ad/internal/animation/Animator;

    invoke-direct {v2, p0, v0, v3}, Lcom/beizi/ad/internal/view/BannerAdViewImpl$b;-><init>(Lcom/beizi/ad/internal/view/BannerAdViewImpl;Lcom/beizi/ad/internal/view/c;Lcom/beizi/ad/internal/animation/Animator;)V

    invoke-virtual {v1, v2}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    goto :goto_2

    .line 55
    :cond_e
    invoke-interface {v0}, Lcom/beizi/ad/internal/view/c;->destroy()V

    .line 56
    :cond_f
    :goto_2
    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/AdViewImpl;->b()V

    .line 57
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->a:Landroid/view/ViewGroup;

    if-nez v0, :cond_10

    .line 58
    invoke-interface {p1}, Lcom/beizi/ad/internal/view/c;->getRefreshInterval()I

    move-result v0

    if-lez v0, :cond_10

    .line 59
    iget-boolean v1, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->z:Z

    if-eqz v1, :cond_10

    mul-int/lit16 v0, v0, 0x3e8

    .line 60
    invoke-virtual {p0, v0}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->setAutoRefreshInterval(I)V

    .line 61
    :cond_10
    iput-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->c:Lcom/beizi/ad/internal/view/c;

    return-void

    .line 62
    :cond_11
    :goto_3
    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/AdViewImpl;->getAdListener()Lcom/beizi/ad/AdListener;

    move-result-object p1

    const/4 v0, 0x5

    invoke-virtual {p1, v0}, Lcom/beizi/ad/AdListener;->onAdFailedToLoad(I)V

    .line 63
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    const-string v0, "Loaded an ad with an invalid displayable"

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public activityOnDestroy()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->A:Lcom/beizi/ad/internal/view/c;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/beizi/ad/internal/view/c;->onDestroy()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->A:Lcom/beizi/ad/internal/view/c;

    :cond_0
    const-string v0, "BeiZisAd"

    const-string v1, "enter activityOnDestroy before dismantleBroadcast"

    .line 4
    invoke-static {v0, v1}, Lcom/beizi/ad/lance/a/l;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->m()V

    .line 6
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->mAdFetcher:Lcom/beizi/ad/internal/c;

    if-eqz v0, :cond_1

    .line 7
    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->h()V

    :cond_1
    return-void
.end method

.method public activityOnPause()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->A:Lcom/beizi/ad/internal/view/c;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/beizi/ad/internal/view/c;->onPause()V

    :cond_0
    return-void
.end method

.method public activityOnResume()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->A:Lcom/beizi/ad/internal/view/c;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/beizi/ad/internal/view/c;->onResume()V

    :cond_0
    return-void
.end method

.method protected b(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    .line 2
    invoke-direct {p0}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->j()V

    .line 3
    sget-object v0, Lcom/beizi/ad/R$styleable;->AdView:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 4
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result p2

    .line 5
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->xmlLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->found_n_in_xml:I

    int-to-long v2, p2

    invoke-static {v1, v2, v3}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(IJ)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->v(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_10

    .line 6
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v2

    .line 7
    sget v3, Lcom/beizi/ad/R$styleable;->AdView_beizi_adUnitId:I

    if-ne v2, v3, :cond_0

    .line 8
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, Lcom/beizi/ad/internal/view/AdViewImpl;->setAdUnitId(Ljava/lang/String;)V

    .line 9
    sget-object v3, Lcom/beizi/ad/internal/utilities/HaoboLog;->xmlLogTag:Ljava/lang/String;

    sget v4, Lcom/beizi/ad/R$string;->placement_id:I

    .line 10
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 11
    invoke-static {v4, v2}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 12
    :cond_0
    sget v3, Lcom/beizi/ad/R$styleable;->AdView_auto_refresh_interval:I

    const/4 v4, 0x1

    if-ne v2, v3, :cond_2

    const/4 v3, -0x1

    .line 13
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    .line 14
    invoke-virtual {p0, v2}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->setAutoRefreshInterval(I)V

    if-gtz v2, :cond_1

    .line 15
    iput-boolean v4, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->x:Z

    .line 16
    :cond_1
    sget-object v3, Lcom/beizi/ad/internal/utilities/HaoboLog;->xmlLogTag:Ljava/lang/String;

    sget v4, Lcom/beizi/ad/R$string;->xml_set_period:I

    int-to-long v5, v2

    .line 17
    invoke-static {v4, v5, v6}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(IJ)Ljava/lang/String;

    move-result-object v2

    .line 18
    invoke-static {v3, v2}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 19
    :cond_2
    sget v3, Lcom/beizi/ad/R$styleable;->AdView_test:I

    if-ne v2, v3, :cond_3

    .line 20
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v3

    invoke-virtual {p1, v2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    iput-boolean v2, v3, Lcom/beizi/ad/internal/g;->c:Z

    .line 21
    sget-object v2, Lcom/beizi/ad/internal/utilities/HaoboLog;->xmlLogTag:Ljava/lang/String;

    sget v3, Lcom/beizi/ad/R$string;->xml_set_test:I

    .line 22
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v4

    iget-boolean v4, v4, Lcom/beizi/ad/internal/g;->c:Z

    .line 23
    invoke-static {v3, v4}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(IZ)Ljava/lang/String;

    move-result-object v3

    .line 24
    invoke-static {v2, v3}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 25
    :cond_3
    sget v3, Lcom/beizi/ad/R$styleable;->AdView_beizi_adSize:I

    if-ne v2, v3, :cond_6

    .line 26
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_4

    .line 27
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_4

    .line 28
    :try_start_0
    const-class v4, Lcom/beizi/ad/a;

    invoke-virtual {v4, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/beizi/ad/a;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v3, v2

    goto :goto_1

    :catch_0
    nop

    :cond_4
    :goto_1
    if-nez v3, :cond_5

    .line 29
    sget-object v3, Lcom/beizi/ad/a;->g:Lcom/beizi/ad/a;

    .line 30
    :cond_5
    sget-object v2, Lcom/beizi/ad/internal/utilities/HaoboLog;->xmlLogTag:Ljava/lang/String;

    sget v4, Lcom/beizi/ad/R$string;->xml_ad_size:I

    .line 31
    invoke-virtual {v3}, Lcom/beizi/ad/a;->toString()Ljava/lang/String;

    move-result-object v5

    .line 32
    invoke-static {v4, v5}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 33
    invoke-static {v2, v4}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    invoke-virtual {v3}, Lcom/beizi/ad/a;->b()I

    move-result v2

    invoke-virtual {v3}, Lcom/beizi/ad/a;->a()I

    move-result v3

    invoke-virtual {p0, v2, v3}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->setAdSize(II)V

    goto/16 :goto_2

    .line 35
    :cond_6
    sget v3, Lcom/beizi/ad/R$styleable;->AdView_should_reload_on_resume:I

    if-ne v2, v3, :cond_7

    .line 36
    invoke-virtual {p1, v2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    invoke-virtual {p0, v2}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->setShouldReloadOnResume(Z)V

    .line 37
    sget-object v2, Lcom/beizi/ad/internal/utilities/HaoboLog;->xmlLogTag:Ljava/lang/String;

    sget v3, Lcom/beizi/ad/R$string;->xml_set_should_reload:I

    iget-boolean v4, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->r:Z

    invoke-static {v3, v4}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(IZ)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 38
    :cond_7
    sget v3, Lcom/beizi/ad/R$styleable;->AdView_opens_native_browser:I

    if-ne v2, v3, :cond_8

    .line 39
    invoke-virtual {p1, v2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    invoke-virtual {p0, v2}, Lcom/beizi/ad/internal/view/AdViewImpl;->setOpensNativeBrowser(Z)V

    .line 40
    sget-object v2, Lcom/beizi/ad/internal/utilities/HaoboLog;->xmlLogTag:Ljava/lang/String;

    sget v3, Lcom/beizi/ad/R$string;->xml_set_opens_native_browser:I

    .line 41
    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/AdViewImpl;->getOpensNativeBrowser()Z

    move-result v4

    .line 42
    invoke-static {v3, v4}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(IZ)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 43
    :cond_8
    sget v3, Lcom/beizi/ad/R$styleable;->AdView_expands_to_fit_screen_width:I

    if-ne v2, v3, :cond_9

    .line 44
    invoke-virtual {p1, v2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    invoke-virtual {p0, v2}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->setExpandsToFitScreenWidth(Z)V

    .line 45
    sget-object v2, Lcom/beizi/ad/internal/utilities/HaoboLog;->xmlLogTag:Ljava/lang/String;

    sget v3, Lcom/beizi/ad/R$string;->xml_set_expands_to_full_screen_width:I

    iget-boolean v4, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->t:Z

    invoke-static {v3, v4}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(IZ)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 46
    :cond_9
    sget v3, Lcom/beizi/ad/R$styleable;->AdView_resize_ad_to_fit_container:I

    if-ne v2, v3, :cond_a

    .line 47
    invoke-virtual {p1, v2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    invoke-virtual {p0, v2}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->setResizeAdToFitContainer(Z)V

    .line 48
    sget-object v2, Lcom/beizi/ad/internal/utilities/HaoboLog;->xmlLogTag:Ljava/lang/String;

    sget v3, Lcom/beizi/ad/R$string;->xml_resize_ad_to_fit_container:I

    iget-boolean v4, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->u:Z

    invoke-static {v3, v4}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(IZ)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 49
    :cond_a
    sget v3, Lcom/beizi/ad/R$styleable;->AdView_show_loading_indicator:I

    if-ne v2, v3, :cond_b

    .line 50
    sget-object v3, Lcom/beizi/ad/internal/utilities/HaoboLog;->xmlLogTag:Ljava/lang/String;

    sget v5, Lcom/beizi/ad/R$string;->show_loading_indicator_xml:I

    .line 51
    invoke-static {v5}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 52
    invoke-static {v3, v5}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    invoke-virtual {p1, v2, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    invoke-virtual {p0, v2}, Lcom/beizi/ad/internal/view/AdViewImpl;->setShowLoadingIndicator(Z)V

    goto :goto_2

    .line 54
    :cond_b
    sget v3, Lcom/beizi/ad/R$styleable;->AdView_transition_type:I

    if-ne v2, v3, :cond_c

    .line 55
    sget-object v3, Lcom/beizi/ad/internal/utilities/HaoboLog;->xmlLogTag:Ljava/lang/String;

    sget v4, Lcom/beizi/ad/R$string;->transition_type:I

    .line 56
    invoke-static {v4}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 57
    invoke-static {v3, v4}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    invoke-virtual {p1, v2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    .line 59
    invoke-static {v2}, Lcom/beizi/ad/internal/animation/TransitionType;->getTypeForInt(I)Lcom/beizi/ad/internal/animation/TransitionType;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->setTransitionType(Lcom/beizi/ad/internal/animation/TransitionType;)V

    goto :goto_2

    .line 60
    :cond_c
    sget v3, Lcom/beizi/ad/R$styleable;->AdView_transition_direction:I

    if-ne v2, v3, :cond_d

    .line 61
    sget-object v3, Lcom/beizi/ad/internal/utilities/HaoboLog;->xmlLogTag:Ljava/lang/String;

    sget v4, Lcom/beizi/ad/R$string;->transition_direction:I

    .line 62
    invoke-static {v4}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 63
    invoke-static {v3, v4}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    invoke-virtual {p1, v2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    invoke-static {v2}, Lcom/beizi/ad/internal/animation/TransitionDirection;->getDirectionForInt(I)Lcom/beizi/ad/internal/animation/TransitionDirection;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->setTransitionDirection(Lcom/beizi/ad/internal/animation/TransitionDirection;)V

    goto :goto_2

    .line 65
    :cond_d
    sget v3, Lcom/beizi/ad/R$styleable;->AdView_transition_duration:I

    if-ne v2, v3, :cond_e

    .line 66
    sget-object v3, Lcom/beizi/ad/internal/utilities/HaoboLog;->xmlLogTag:Ljava/lang/String;

    sget v4, Lcom/beizi/ad/R$string;->transition_duration:I

    .line 67
    invoke-static {v4}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 68
    invoke-static {v3, v4}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v3, 0x3e8

    .line 69
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {p0, v2, v3}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->setTransitionDuration(J)V

    goto :goto_2

    .line 70
    :cond_e
    sget v3, Lcom/beizi/ad/R$styleable;->AdView_load_landing_page_in_background:I

    if-ne v2, v3, :cond_f

    .line 71
    invoke-virtual {p1, v2, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    invoke-virtual {p0, v2}, Lcom/beizi/ad/internal/view/AdViewImpl;->setLoadsInBackground(Z)V

    .line 72
    sget-object v2, Lcom/beizi/ad/internal/utilities/HaoboLog;->xmlLogTag:Ljava/lang/String;

    sget v3, Lcom/beizi/ad/R$string;->xml_load_landing_page_in_background:I

    iget-boolean v4, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->g:Z

    invoke-static {v3, v4}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(IZ)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_f
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    .line 73
    :cond_10
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public cancel()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->mAdFetcher:Lcom/beizi/ad/internal/c;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/beizi/ad/internal/c;->a()V

    :cond_0
    return-void
.end method

.method public clickArea()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->y:Lcom/beizi/ad/internal/view/AdWebView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-wide/16 v6, 0xa

    add-long/2addr v4, v6

    invoke-virtual/range {v0 .. v5}, Lcom/beizi/ad/internal/view/AdWebView;->handleClickView(Landroid/view/MotionEvent;JJ)V

    :cond_0
    return-void
.end method

.method public clickArea(Lcom/beizi/ad/c/c;I)V
    .locals 8

    .line 3
    iget-object v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->y:Lcom/beizi/ad/internal/view/AdWebView;

    if-eqz v0, :cond_0

    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-wide/16 v6, 0xa

    add-long/2addr v4, v6

    move-object v1, p1

    move v6, p2

    invoke-virtual/range {v0 .. v6}, Lcom/beizi/ad/internal/view/AdWebView;->handleClickView(Lcom/beizi/ad/c/c;JJI)V

    :cond_0
    return-void
.end method

.method d()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public disableFullClick(Landroid/view/View$OnTouchListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->y:Lcom/beizi/ad/internal/view/AdWebView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    :cond_0
    return-void
.end method

.method e()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public expandToFitScreenWidth(IILcom/beizi/ad/internal/view/c;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    .line 2
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 3
    new-instance v1, Landroid/graphics/Point;

    invoke-direct {v1}, Landroid/graphics/Point;-><init>()V

    .line 4
    invoke-virtual {v0, v1}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 5
    iget v0, v1, Landroid/graphics/Point;->x:I

    int-to-float v1, v0

    int-to-float p1, p1

    div-float/2addr v1, p1

    int-to-float p1, p2

    mul-float p1, p1, v1

    float-to-double p1, p1

    .line 6
    invoke-static {p1, p2}, Ljava/lang/Math;->floor(D)D

    move-result-wide p1

    double-to-int p1, p1

    .line 7
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    iget p2, p2, Landroid/view/ViewGroup$LayoutParams;->height:I

    iput p2, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->n:I

    .line 8
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    iget p2, p2, Landroid/view/ViewGroup$LayoutParams;->width:I

    iput p2, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->o:I

    .line 9
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    iget p2, p2, Landroid/view/ViewGroup$LayoutParams;->width:I

    if-gtz p2, :cond_0

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    iget p2, p2, Landroid/view/ViewGroup$LayoutParams;->width:I

    const/4 v1, -0x2

    if-ne p2, v1, :cond_1

    .line 10
    :cond_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    iput v0, p2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 11
    :cond_1
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    iput p1, p2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 12
    invoke-interface {p3}, Lcom/beizi/ad/internal/view/c;->getView()Landroid/view/View;

    move-result-object p1

    .line 13
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    const/4 p3, -0x1

    if-nez p2, :cond_2

    .line 14
    new-instance p2, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {p2, p3, p3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 15
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    iput p3, p2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 16
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    iput p3, p2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 17
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    const/4 p1, 0x1

    .line 18
    iput-boolean p1, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->m:Z

    return-void
.end method

.method f()V
    .locals 0

    return-void
.end method

.method g()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->q:Z

    if-nez v0, :cond_0

    .line 2
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->publicFunctionsLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->start:I

    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->mAdFetcher:Lcom/beizi/ad/internal/c;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/c;->b()V

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->q:Z

    :cond_0
    return-void
.end method

.method public getAdAlignment()Lcom/beizi/ad/internal/view/BannerAdViewImpl$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->B:Lcom/beizi/ad/internal/view/BannerAdViewImpl$a;

    if-nez v0, :cond_0

    .line 2
    sget-object v0, Lcom/beizi/ad/internal/view/BannerAdViewImpl$a;->e:Lcom/beizi/ad/internal/view/BannerAdViewImpl$a;

    iput-object v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->B:Lcom/beizi/ad/internal/view/BannerAdViewImpl$a;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->B:Lcom/beizi/ad/internal/view/BannerAdViewImpl$a;

    return-object v0
.end method

.method public getAdHeight()I
    .locals 4

    .line 1
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->get_height:I

    iget-object v2, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->h:Lcom/beizi/ad/internal/d;

    .line 2
    invoke-virtual {v2}, Lcom/beizi/ad/internal/d;->e()I

    move-result v2

    int-to-long v2, v2

    invoke-static {v1, v2, v3}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(IJ)Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->h:Lcom/beizi/ad/internal/d;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/d;->e()I

    move-result v0

    return v0
.end method

.method public getAdWidth()I
    .locals 4

    .line 1
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->get_width:I

    iget-object v2, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->h:Lcom/beizi/ad/internal/d;

    .line 2
    invoke-virtual {v2}, Lcom/beizi/ad/internal/d;->d()I

    move-result v2

    int-to-long v2, v2

    invoke-static {v1, v2, v3}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(IJ)Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->h:Lcom/beizi/ad/internal/d;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/d;->d()I

    move-result v0

    return v0
.end method

.method public getAutoRefreshInterval()I
    .locals 4

    .line 1
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->publicFunctionsLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->get_period:I

    iget v2, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->p:I

    int-to-long v2, v2

    .line 2
    invoke-static {v1, v2, v3}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(IJ)Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->p:I

    return v0
.end method

.method public getExpandsToFitScreenWidth()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->t:Z

    return v0
.end method

.method public getMediaType()Lcom/beizi/ad/internal/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->a:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/beizi/ad/internal/j;->a:Lcom/beizi/ad/internal/j;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/beizi/ad/internal/j;->b:Lcom/beizi/ad/internal/j;

    :goto_0
    return-object v0
.end method

.method public getResizeAdToFitContainer()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->u:Z

    return v0
.end method

.method public getShouldReloadOnResume()Z
    .locals 3

    .line 1
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->publicFunctionsLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->get_should_resume:I

    iget-boolean v2, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->r:Z

    invoke-static {v1, v2}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(IZ)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->r:Z

    return v0
.end method

.method public getTransitionDirection()Lcom/beizi/ad/internal/animation/TransitionDirection;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->w:Lcom/beizi/ad/internal/animation/Animator;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/animation/Animator;->getTransitionDirection()Lcom/beizi/ad/internal/animation/TransitionDirection;

    move-result-object v0

    return-object v0
.end method

.method public getTransitionDuration()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->w:Lcom/beizi/ad/internal/animation/Animator;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/animation/Animator;->getTransitionDuration()J

    move-result-wide v0

    return-wide v0
.end method

.method public getTransitionType()Lcom/beizi/ad/internal/animation/TransitionType;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->w:Lcom/beizi/ad/internal/animation/Animator;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/animation/Animator;->getTransitionType()Lcom/beizi/ad/internal/animation/TransitionType;

    move-result-object v0

    return-object v0
.end method

.method h()V
    .locals 2

    .line 1
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->publicFunctionsLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->stop:I

    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->mAdFetcher:Lcom/beizi/ad/internal/c;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/c;->a()V

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->q:Z

    return-void
.end method

.method protected i()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->m:Z

    .line 2
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v1, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->n:I

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 4
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v1, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->o:I

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    :cond_0
    return-void
.end method

.method public isAutoRefresh()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->z:Z

    return v0
.end method

.method public loadAd(Lcom/beizi/ad/internal/network/a$a;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/beizi/ad/internal/view/AdViewImpl;->loadAd(Lcom/beizi/ad/internal/network/a$a;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->q:Z

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final onLayout(ZIIII)V
    .locals 1

    .line 1
    invoke-super/range {p0 .. p5}, Lcom/beizi/ad/internal/view/AdViewImpl;->onLayout(ZIIII)V

    .line 2
    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->d:Z

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    .line 3
    iput-boolean p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->d:Z

    return-void

    .line 4
    :cond_0
    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->v:Z

    if-eqz v0, :cond_1

    if-eqz p1, :cond_4

    .line 5
    :cond_1
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object p1

    sub-int/2addr p4, p2

    int-to-float p2, p4

    .line 6
    invoke-virtual {p1}, Lcom/beizi/ad/internal/g;->h()F

    move-result p4

    div-float/2addr p2, p4

    const/high16 p4, 0x3f000000    # 0.5f

    add-float/2addr p2, p4

    float-to-int p2, p2

    sub-int/2addr p5, p3

    int-to-float p3, p5

    .line 7
    invoke-virtual {p1}, Lcom/beizi/ad/internal/g;->i()F

    move-result p1

    div-float/2addr p3, p1

    add-float/2addr p3, p4

    float-to-int p1, p3

    .line 8
    iget-object p3, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->h:Lcom/beizi/ad/internal/d;

    invoke-virtual {p3}, Lcom/beizi/ad/internal/d;->d()I

    move-result p3

    if-lt p2, p3, :cond_6

    iget-object p3, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->h:Lcom/beizi/ad/internal/d;

    invoke-virtual {p3}, Lcom/beizi/ad/internal/d;->e()I

    move-result p3

    if-ge p1, p3, :cond_2

    if-lez p2, :cond_2

    if-lez p1, :cond_2

    goto :goto_0

    .line 9
    :cond_2
    iget-object p3, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->h:Lcom/beizi/ad/internal/d;

    invoke-virtual {p3, p2}, Lcom/beizi/ad/internal/d;->d(I)V

    .line 10
    iget-object p2, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->h:Lcom/beizi/ad/internal/d;

    invoke-virtual {p2, p1}, Lcom/beizi/ad/internal/d;->e(I)V

    .line 11
    iget-boolean p1, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->v:Z

    if-nez p1, :cond_3

    .line 12
    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/AdViewImpl;->c()V

    :cond_3
    const/4 p1, 0x1

    .line 13
    iput-boolean p1, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->v:Z

    .line 14
    :cond_4
    iget-boolean p1, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->q:Z

    if-eqz p1, :cond_5

    .line 15
    invoke-direct {p0}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->k()V

    .line 16
    iget-boolean p1, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->r:Z

    if-eqz p1, :cond_5

    .line 17
    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->g()V

    :cond_5
    return-void

    .line 18
    :cond_6
    :goto_0
    sget-object p3, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    sget p4, Lcom/beizi/ad/R$string;->adsize_too_big:I

    iget-object p5, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->h:Lcom/beizi/ad/internal/d;

    .line 19
    invoke-virtual {p5}, Lcom/beizi/ad/internal/d;->d()I

    move-result p5

    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->h:Lcom/beizi/ad/internal/d;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/d;->e()I

    move-result v0

    .line 20
    invoke-static {p4, p2, p1, p5, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(IIIII)Ljava/lang/String;

    move-result-object p1

    invoke-static {p3, p1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/AdViewImpl;->c()V

    .line 22
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->mAdFetcher:Lcom/beizi/ad/internal/c;

    if-eqz p1, :cond_7

    .line 23
    invoke-virtual {p1}, Lcom/beizi/ad/internal/c;->a()V

    :cond_7
    return-void
.end method

.method protected onWindowVisibilityChanged(I)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onWindowVisibilityChanged(I)V

    const/4 v0, 0x0

    if-nez p1, :cond_2

    .line 2
    invoke-direct {p0}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->k()V

    .line 3
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->unhidden:I

    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-boolean p1, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->q:Z

    if-nez p1, :cond_0

    iget-boolean p1, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->r:Z

    if-nez p1, :cond_0

    iget p1, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->p:I

    if-lez p1, :cond_1

    .line 5
    :cond_0
    iget-boolean p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->f:Z

    if-nez p1, :cond_1

    iget-boolean p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->d:Z

    if-nez p1, :cond_1

    .line 6
    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/AdViewImpl;->a()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->mAdFetcher:Lcom/beizi/ad/internal/c;

    if-eqz p1, :cond_1

    .line 7
    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->g()V

    .line 8
    :cond_1
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->f:Z

    .line 9
    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    instance-of p1, p1, Landroid/webkit/WebView;

    if-eqz p1, :cond_4

    .line 10
    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/webkit/WebView;

    .line 11
    invoke-static {p1}, Lcom/beizi/ad/internal/utilities/WebviewUtil;->onResume(Landroid/webkit/WebView;)V

    goto :goto_0

    :cond_2
    const-string p1, "BeiZisAd"

    const-string v1, "enter onWindowVisibilityChanged before dismantleBroadcast"

    .line 12
    invoke-static {p1, v1}, Lcom/beizi/ad/lance/a/l;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->m()V

    .line 14
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->hidden:I

    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->mAdFetcher:Lcom/beizi/ad/internal/c;

    if-eqz p1, :cond_3

    iget-boolean p1, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->q:Z

    if-eqz p1, :cond_3

    .line 16
    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->h()V

    .line 17
    :cond_3
    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    instance-of p1, p1, Landroid/webkit/WebView;

    if-eqz p1, :cond_4

    .line 18
    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/webkit/WebView;

    .line 19
    invoke-static {p1}, Lcom/beizi/ad/internal/utilities/WebviewUtil;->onPause(Landroid/webkit/WebView;)V

    :cond_4
    :goto_0
    return-void
.end method

.method public resetContainerIfNeeded()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->m:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->i()V

    :cond_0
    return-void
.end method

.method public resizeWebViewToFitContainer(IILcom/beizi/ad/internal/view/c;)V
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getWidth()I

    move-result v0

    if-gtz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getMeasuredWidth()I

    move-result v0

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getWidth()I

    move-result v0

    .line 4
    :goto_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v1

    if-gtz v1, :cond_1

    .line 5
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getMeasuredHeight()I

    move-result v1

    goto :goto_1

    .line 6
    :cond_1
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v1

    :goto_1
    if-lez v1, :cond_6

    if-gtz v0, :cond_2

    goto :goto_4

    :cond_2
    int-to-float v2, p1

    int-to-float v3, v0

    div-float/2addr v2, v3

    int-to-float v3, p2

    int-to-float v4, v1

    div-float/2addr v3, v4

    .line 7
    invoke-interface {p3}, Lcom/beizi/ad/internal/view/c;->getView()Landroid/view/View;

    move-result-object p3

    cmpg-float v2, v2, v3

    if-gez v2, :cond_3

    mul-int p1, p1, v1

    .line 8
    div-int v0, p1, p2

    .line 9
    instance-of p1, p3, Landroid/webkit/WebView;

    if-eqz p1, :cond_4

    .line 10
    move-object p1, p3

    check-cast p1, Landroid/webkit/WebView;

    mul-int/lit8 v2, v1, 0x64

    div-int/2addr v2, p2

    int-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int p2, v2

    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->setInitialScale(I)V

    goto :goto_2

    :cond_3
    mul-int p2, p2, v0

    .line 11
    div-int v1, p2, p1

    .line 12
    instance-of p2, p3, Landroid/webkit/WebView;

    if-eqz p2, :cond_4

    .line 13
    move-object p2, p3

    check-cast p2, Landroid/webkit/WebView;

    mul-int/lit8 v2, v0, 0x64

    div-int/2addr v2, p1

    int-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int p1, v2

    invoke-virtual {p2, p1}, Landroid/webkit/WebView;->setInitialScale(I)V

    .line 14
    :cond_4
    :goto_2
    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    const/16 p2, 0x11

    if-nez p1, :cond_5

    .line 15
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {p1, v0, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 16
    iput p2, p1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 17
    invoke-virtual {p3, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_3

    .line 18
    :cond_5
    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    iput v0, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 19
    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    iput v1, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 20
    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout$LayoutParams;

    iput p2, p1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 21
    :goto_3
    invoke-virtual {p3}, Landroid/view/View;->invalidate()V

    return-void

    .line 22
    :cond_6
    :goto_4
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    const-string p2, "Unable to resize ad to fit container because of failure to obtain the container size."

    invoke-static {p1, p2}, Lcom/beizi/ad/internal/utilities/HaoboLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setAdAlignment(Lcom/beizi/ad/internal/view/BannerAdViewImpl$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->B:Lcom/beizi/ad/internal/view/BannerAdViewImpl$a;

    return-void
.end method

.method public setAdSize(II)V
    .locals 2

    .line 1
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->set_size:I

    invoke-static {v1, p1, p2}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(III)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->h:Lcom/beizi/ad/internal/d;

    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/d;->b(I)V

    .line 3
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->h:Lcom/beizi/ad/internal/d;

    invoke-virtual {p1, p2}, Lcom/beizi/ad/internal/d;->c(I)V

    return-void
.end method

.method public setAutoRefresh(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->z:Z

    return-void
.end method

.method public setAutoRefreshInterval(I)V
    .locals 3

    if-lez p1, :cond_0

    const/16 v0, 0x2710

    .line 1
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->p:I

    goto :goto_0

    .line 2
    :cond_0
    iput p1, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->p:I

    .line 3
    :goto_0
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->publicFunctionsLogTag:Ljava/lang/String;

    sget v0, Lcom/beizi/ad/R$string;->set_period:I

    iget v1, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->p:I

    int-to-long v1, v1

    .line 4
    invoke-static {v0, v1, v2}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(IJ)Ljava/lang/String;

    move-result-object v0

    .line 5
    invoke-static {p1, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->mAdFetcher:Lcom/beizi/ad/internal/c;

    if-eqz p1, :cond_1

    .line 7
    iget v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->p:I

    invoke-virtual {p1, v0}, Lcom/beizi/ad/internal/c;->a(I)V

    :cond_1
    return-void
.end method

.method public setExpandsToFitScreenWidth(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->t:Z

    return-void
.end method

.method public setResizeAdToFitContainer(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->u:Z

    return-void
.end method

.method public setScrollClick(Landroid/view/View$OnTouchListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->y:Lcom/beizi/ad/internal/view/AdWebView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    :cond_0
    return-void
.end method

.method public setShouldReloadOnResume(Z)V
    .locals 2

    .line 1
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->publicFunctionsLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->set_should_resume:I

    invoke-static {v1, p1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(IZ)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iput-boolean p1, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->r:Z

    return-void
.end method

.method public setTransitionDirection(Lcom/beizi/ad/internal/animation/TransitionDirection;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->w:Lcom/beizi/ad/internal/animation/Animator;

    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/animation/Animator;->setTransitionDirection(Lcom/beizi/ad/internal/animation/TransitionDirection;)V

    return-void
.end method

.method public setTransitionDuration(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->w:Lcom/beizi/ad/internal/animation/Animator;

    invoke-virtual {v0, p1, p2}, Lcom/beizi/ad/internal/animation/Animator;->setTransitionDuration(J)V

    return-void
.end method

.method public setTransitionType(Lcom/beizi/ad/internal/animation/TransitionType;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->w:Lcom/beizi/ad/internal/animation/Animator;

    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/animation/Animator;->setTransitionType(Lcom/beizi/ad/internal/animation/TransitionType;)V

    return-void
.end method
