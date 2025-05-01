.class public Lcom/beizi/ad/internal/activity/b;
.super Ljava/lang/Object;
.source "InterstitialAdActivity.java"

# interfaces
.implements Lcom/beizi/ad/AdActivity$a;


# instance fields
.field private a:Landroid/app/Activity;

.field private b:Lcom/beizi/ad/internal/view/AdWebView;

.field private c:Lcom/beizi/ad/internal/view/c;

.field private d:Landroid/widget/FrameLayout;

.field private e:J

.field private f:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/beizi/ad/internal/activity/b;->a:Landroid/app/Activity;

    return-void
.end method

.method private a(Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;)V
    .locals 6

    .line 16
    iput-object p1, p0, Lcom/beizi/ad/internal/activity/b;->f:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    if-nez p1, :cond_0

    return-void

    .line 17
    :cond_0
    invoke-virtual {p1, p0}, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->setAdImplementation(Lcom/beizi/ad/AdActivity$a;)V

    .line 18
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/b;->d:Landroid/widget/FrameLayout;

    iget-object v0, p0, Lcom/beizi/ad/internal/activity/b;->f:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->getBackgroundColor()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setBackgroundColor(I)V

    .line 19
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/b;->d:Landroid/widget/FrameLayout;

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 20
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/b;->f:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 21
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/b;->f:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 22
    :cond_1
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/b;->f:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->getAdQueue()Ljava/util/Queue;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/beizi/ad/internal/view/e;

    :goto_0
    if-eqz p1, :cond_3

    .line 23
    iget-wide v0, p0, Lcom/beizi/ad/internal/activity/b;->e:J

    invoke-interface {p1}, Lcom/beizi/ad/internal/view/e;->a()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/32 v2, 0x41eb0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_2

    iget-wide v0, p0, Lcom/beizi/ad/internal/activity/b;->e:J

    invoke-interface {p1}, Lcom/beizi/ad/internal/view/e;->a()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gez v4, :cond_3

    .line 24
    :cond_2
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    sget v0, Lcom/beizi/ad/R$string;->too_old:I

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/b;->f:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->getAdQueue()Ljava/util/Queue;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/beizi/ad/internal/view/e;

    goto :goto_0

    :cond_3
    if-eqz p1, :cond_c

    .line 26
    invoke-interface {p1}, Lcom/beizi/ad/internal/view/e;->d()Landroid/view/View;

    move-result-object v0

    instance-of v0, v0, Lcom/beizi/ad/internal/view/AdWebView;

    if-nez v0, :cond_4

    goto/16 :goto_4

    .line 27
    :cond_4
    invoke-interface {p1}, Lcom/beizi/ad/internal/view/e;->d()Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/beizi/ad/internal/view/AdWebView;

    iput-object p1, p0, Lcom/beizi/ad/internal/activity/b;->b:Lcom/beizi/ad/internal/view/AdWebView;

    .line 28
    invoke-virtual {p1}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object p1

    instance-of p1, p1, Landroid/content/MutableContextWrapper;

    if-eqz p1, :cond_5

    .line 29
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/b;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Landroid/content/MutableContextWrapper;

    iget-object v0, p0, Lcom/beizi/ad/internal/activity/b;->a:Landroid/app/Activity;

    invoke-virtual {p1, v0}, Landroid/content/MutableContextWrapper;->setBaseContext(Landroid/content/Context;)V

    .line 30
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/b;->b:Lcom/beizi/ad/internal/view/AdWebView;

    iget-object p1, p1, Lcom/beizi/ad/internal/view/AdWebView;->mAdVideoView:Lcom/beizi/ad/internal/video/AdVideoView;

    if-eqz p1, :cond_5

    .line 31
    invoke-virtual {p1}, Landroid/view/TextureView;->getContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Landroid/content/MutableContextWrapper;

    iget-object v0, p0, Lcom/beizi/ad/internal/activity/b;->a:Landroid/app/Activity;

    invoke-virtual {p1, v0}, Landroid/content/MutableContextWrapper;->setBaseContext(Landroid/content/Context;)V

    .line 32
    :cond_5
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/b;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/view/AdWebView;->getCreativeWidth()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_6

    iget-object p1, p0, Lcom/beizi/ad/internal/activity/b;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/view/AdWebView;->getCreativeHeight()I

    move-result p1

    if-eq p1, v0, :cond_8

    :cond_6
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/b;->a:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    iget p1, p1, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x2

    if-eq p1, v1, :cond_8

    const/4 p1, 0x0

    .line 33
    :try_start_0
    iget-object v1, p0, Lcom/beizi/ad/internal/activity/b;->f:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-virtual {v1}, Lcom/beizi/ad/internal/view/AdViewImpl;->getAdParameters()Lcom/beizi/ad/internal/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beizi/ad/internal/d;->b()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    iget p1, v1, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    .line 34
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    const/16 v1, 0x1a

    if-le p1, v1, :cond_7

    .line 35
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ne p1, v1, :cond_7

    goto :goto_2

    .line 36
    :cond_7
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/b;->a:Landroid/app/Activity;

    iget-object v1, p0, Lcom/beizi/ad/internal/activity/b;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {v1}, Lcom/beizi/ad/internal/view/AdWebView;->getOrientation()I

    move-result v1

    invoke-static {p1, v1}, Lcom/beizi/ad/AdActivity;->a(Landroid/app/Activity;I)V

    .line 37
    :cond_8
    :goto_2
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/b;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/view/AdWebView;->getRealDisplayable()Lcom/beizi/ad/internal/view/c;

    move-result-object p1

    iput-object p1, p0, Lcom/beizi/ad/internal/activity/b;->c:Lcom/beizi/ad/internal/view/c;

    .line 38
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/b;->b:Lcom/beizi/ad/internal/view/AdWebView;

    iget-object v1, p1, Lcom/beizi/ad/internal/view/AdWebView;->mAdVideoView:Lcom/beizi/ad/internal/video/AdVideoView;

    const/16 v2, 0x11

    if-eqz v1, :cond_9

    .line 39
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/b;->d:Landroid/widget/FrameLayout;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/view/AdWebView;->getRealDisplayable()Lcom/beizi/ad/internal/view/c;

    move-result-object p1

    invoke-interface {p1}, Lcom/beizi/ad/internal/view/c;->getView()Landroid/view/View;

    move-result-object p1

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v3, -0x2

    invoke-direct {v1, v3, v3, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {v0, p1, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_3

    .line 40
    :cond_9
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/b;->a:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getRequestedOrientation()I

    move-result p1

    if-nez p1, :cond_a

    .line 41
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/b;->d:Landroid/widget/FrameLayout;

    iget-object v0, p0, Lcom/beizi/ad/internal/activity/b;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdWebView;->getRealDisplayable()Lcom/beizi/ad/internal/view/c;

    move-result-object v0

    invoke-interface {v0}, Lcom/beizi/ad/internal/view/c;->getView()Landroid/view/View;

    move-result-object v0

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    iget-object v3, p0, Lcom/beizi/ad/internal/activity/b;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {v3}, Lcom/beizi/ad/internal/view/AdWebView;->getCreativeHeight()I

    move-result v3

    int-to-float v3, v3

    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v4

    iget v4, v4, Lcom/beizi/ad/internal/g;->j:F

    mul-float v3, v3, v4

    float-to-int v3, v3

    iget-object v4, p0, Lcom/beizi/ad/internal/activity/b;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {v4}, Lcom/beizi/ad/internal/view/AdWebView;->getCreativeWidth()I

    move-result v4

    int-to-float v4, v4

    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v5

    iget v5, v5, Lcom/beizi/ad/internal/g;->k:F

    mul-float v4, v4, v5

    float-to-int v4, v4

    invoke-direct {v1, v3, v4, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {p1, v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_3

    .line 42
    :cond_a
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/b;->a:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getRequestedOrientation()I

    move-result p1

    if-ne p1, v0, :cond_b

    .line 43
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/b;->d:Landroid/widget/FrameLayout;

    iget-object v0, p0, Lcom/beizi/ad/internal/activity/b;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdWebView;->getRealDisplayable()Lcom/beizi/ad/internal/view/c;

    move-result-object v0

    invoke-interface {v0}, Lcom/beizi/ad/internal/view/c;->getView()Landroid/view/View;

    move-result-object v0

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    iget-object v3, p0, Lcom/beizi/ad/internal/activity/b;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {v3}, Lcom/beizi/ad/internal/view/AdWebView;->getCreativeWidth()I

    move-result v3

    int-to-float v3, v3

    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v4

    iget v4, v4, Lcom/beizi/ad/internal/g;->j:F

    mul-float v3, v3, v4

    float-to-int v3, v3

    iget-object v4, p0, Lcom/beizi/ad/internal/activity/b;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {v4}, Lcom/beizi/ad/internal/view/AdWebView;->getCreativeHeight()I

    move-result v4

    int-to-float v4, v4

    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v5

    iget v5, v5, Lcom/beizi/ad/internal/g;->k:F

    mul-float v4, v4, v5

    float-to-int v4, v4

    invoke-direct {v1, v3, v4, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {p1, v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_3

    .line 44
    :cond_b
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/b;->d:Landroid/widget/FrameLayout;

    iget-object v0, p0, Lcom/beizi/ad/internal/activity/b;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdWebView;->getRealDisplayable()Lcom/beizi/ad/internal/view/c;

    move-result-object v0

    invoke-interface {v0}, Lcom/beizi/ad/internal/view/c;->getView()Landroid/view/View;

    move-result-object v0

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    iget-object v3, p0, Lcom/beizi/ad/internal/activity/b;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {v3}, Lcom/beizi/ad/internal/view/AdWebView;->getCreativeWidth()I

    move-result v3

    int-to-float v3, v3

    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v4

    iget v4, v4, Lcom/beizi/ad/internal/g;->j:F

    mul-float v3, v3, v4

    float-to-int v3, v3

    iget-object v4, p0, Lcom/beizi/ad/internal/activity/b;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {v4}, Lcom/beizi/ad/internal/view/AdWebView;->getCreativeHeight()I

    move-result v4

    int-to-float v4, v4

    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v5

    iget v5, v5, Lcom/beizi/ad/internal/g;->k:F

    mul-float v4, v4, v5

    float-to-int v4, v4

    invoke-direct {v1, v3, v4, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {p1, v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 45
    :goto_3
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/b;->c:Lcom/beizi/ad/internal/view/c;

    invoke-interface {p1}, Lcom/beizi/ad/internal/view/c;->visible()V

    :cond_c
    :goto_4
    return-void
.end method

.method private h()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/b;->a:Landroid/app/Activity;

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/b;->f:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->getAdDispatcher()Lcom/beizi/ad/internal/b;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/b;->f:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->getAdDispatcher()Lcom/beizi/ad/internal/b;

    move-result-object v0

    invoke-interface {v0}, Lcom/beizi/ad/internal/b;->b()V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/b;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    :cond_1
    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 1
    sget-object v0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->INTERSTITIALADVIEW_TO_USE:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->getAdQueue()Ljava/util/Queue;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->INTERSTITIALADVIEW_TO_USE:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->getAdQueue()Ljava/util/Queue;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/beizi/ad/internal/view/e;

    invoke-interface {v0}, Lcom/beizi/ad/internal/view/e;->d()Landroid/view/View;

    move-result-object v0

    instance-of v0, v0, Lcom/beizi/ad/internal/view/AdWebView;

    if-nez v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/b;->a:Landroid/app/Activity;

    sget v1, Lcom/beizi/ad/R$style;->BeiZiDialogStyle:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->setTheme(I)V

    .line 3
    sget-object v0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->INTERSTITIALADVIEW_TO_USE:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->getAdQueue()Ljava/util/Queue;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/beizi/ad/internal/view/e;

    invoke-interface {v0}, Lcom/beizi/ad/internal/view/e;->d()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/beizi/ad/internal/view/AdWebView;

    .line 4
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setLoadsImagesAutomatically(Z)V

    .line 5
    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdWebView;->isVideoFullScreen()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/b;->a:Landroid/app/Activity;

    sget v1, Lcom/beizi/ad/R$style;->BeiZiTheme_Transparent:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->setTheme(I)V

    .line 7
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/b;->a:Landroid/app/Activity;

    invoke-virtual {v0, v2}, Landroid/app/Activity;->requestWindowFeature(I)Z

    .line 8
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/b;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x400

    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setFlags(II)V

    .line 9
    :cond_1
    new-instance v0, Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/beizi/ad/internal/activity/b;->a:Landroid/app/Activity;

    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/beizi/ad/internal/activity/b;->d:Landroid/widget/FrameLayout;

    .line 10
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v1, 0x11

    const/4 v2, -0x1

    invoke-direct {v0, v2, v2, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 11
    iget-object v1, p0, Lcom/beizi/ad/internal/activity/b;->d:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 12
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/b;->a:Landroid/app/Activity;

    iget-object v1, p0, Lcom/beizi/ad/internal/activity/b;->d:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    .line 13
    :try_start_0
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/b;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "TIME"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/beizi/ad/internal/activity/b;->e:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 15
    :goto_0
    sget-object v0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->INTERSTITIALADVIEW_TO_USE:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-direct {p0, v0}, Lcom/beizi/ad/internal/activity/b;->a(Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/b;->f:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->getAdDispatcher()Lcom/beizi/ad/internal/b;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/b;->f:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->isRewardedVideo()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/beizi/ad/internal/activity/b;->a:Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/b;->f:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->getAdDispatcher()Lcom/beizi/ad/internal/b;

    move-result-object v0

    invoke-interface {v0}, Lcom/beizi/ad/internal/b;->b()V

    .line 4
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/b;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    :cond_0
    return-void
.end method

.method public c()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/b;->b:Lcom/beizi/ad/internal/view/AdWebView;

    if-eqz v0, :cond_0

    .line 2
    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/ViewUtil;->removeChildFromParent(Landroid/view/View;)V

    .line 3
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/b;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdWebView;->destroy()V

    .line 4
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/b;->b:Lcom/beizi/ad/internal/view/AdWebView;

    iget-object v0, v0, Lcom/beizi/ad/internal/view/AdWebView;->mAdVideoView:Lcom/beizi/ad/internal/video/AdVideoView;

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {v0}, Lcom/beizi/ad/internal/video/AdVideoView;->destroy()V

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/b;->f:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->setAdImplementation(Lcom/beizi/ad/AdActivity$a;)V

    .line 8
    :cond_1
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/b;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public d()V
    .locals 0

    return-void
.end method

.method public e()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/b;->f:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->shouldDismissOnClick()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/beizi/ad/internal/activity/b;->h()V

    :cond_0
    return-void
.end method

.method public f()Landroid/webkit/WebView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/b;->b:Lcom/beizi/ad/internal/view/AdWebView;

    return-object v0
.end method

.method public g()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/b;->b:Lcom/beizi/ad/internal/view/AdWebView;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdWebView;->getRealDisplayable()Lcom/beizi/ad/internal/view/c;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/beizi/ad/internal/activity/b;->c:Lcom/beizi/ad/internal/view/c;

    if-eq v0, v1, :cond_2

    .line 4
    iget-object v2, p0, Lcom/beizi/ad/internal/activity/b;->d:Landroid/widget/FrameLayout;

    invoke-interface {v1}, Lcom/beizi/ad/internal/view/c;->getView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V

    .line 5
    instance-of v1, v0, Lcom/beizi/ad/internal/video/AdVideoView;

    const/4 v2, -0x1

    if-eqz v1, :cond_1

    .line 6
    iget-object v1, p0, Lcom/beizi/ad/internal/activity/b;->d:Landroid/widget/FrameLayout;

    invoke-interface {v0}, Lcom/beizi/ad/internal/view/c;->getView()Landroid/view/View;

    move-result-object v3

    new-instance v4, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v4, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v3, v4}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 7
    :cond_1
    iget-object v1, p0, Lcom/beizi/ad/internal/activity/b;->d:Landroid/widget/FrameLayout;

    invoke-interface {v0}, Lcom/beizi/ad/internal/view/c;->getView()Landroid/view/View;

    move-result-object v3

    new-instance v4, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v4, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v3, v4}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 8
    :goto_0
    iput-object v0, p0, Lcom/beizi/ad/internal/activity/b;->c:Lcom/beizi/ad/internal/view/c;

    .line 9
    invoke-interface {v0}, Lcom/beizi/ad/internal/view/c;->visible()V

    :cond_2
    return-void
.end method
