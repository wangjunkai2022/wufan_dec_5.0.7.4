.class public Lcom/beizi/ad/internal/activity/c;
.super Ljava/lang/Object;
.source "MRAIDAdActivity.java"

# interfaces
.implements Lcom/beizi/ad/AdActivity$a;


# instance fields
.field private a:Landroid/app/Activity;

.field private b:Lcom/beizi/ad/internal/view/AdWebView;

.field private c:Lcom/beizi/ad/internal/view/f;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/beizi/ad/internal/activity/c;->c:Lcom/beizi/ad/internal/view/f;

    .line 3
    iput-object p1, p0, Lcom/beizi/ad/internal/activity/c;->a:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/beizi/ad/internal/view/AdViewImpl;->getMRAIDFullscreenContainer()Landroid/widget/FrameLayout;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 2
    invoke-static {}, Lcom/beizi/ad/internal/view/AdViewImpl;->getMRAIDFullscreenImplementation()Lcom/beizi/ad/internal/view/f;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {}, Lcom/beizi/ad/internal/view/AdViewImpl;->getMRAIDFullscreenContainer()Landroid/widget/FrameLayout;

    move-result-object v0

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/ViewUtil;->removeChildFromParent(Landroid/view/View;)V

    .line 4
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/c;->a:Landroid/app/Activity;

    invoke-static {}, Lcom/beizi/ad/internal/view/AdViewImpl;->getMRAIDFullscreenContainer()Landroid/widget/FrameLayout;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    .line 5
    invoke-static {}, Lcom/beizi/ad/internal/view/AdViewImpl;->getMRAIDFullscreenContainer()Landroid/widget/FrameLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    instance-of v0, v0, Lcom/beizi/ad/internal/view/AdWebView;

    if-eqz v0, :cond_1

    .line 6
    invoke-static {}, Lcom/beizi/ad/internal/view/AdViewImpl;->getMRAIDFullscreenContainer()Landroid/widget/FrameLayout;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/beizi/ad/internal/view/AdWebView;

    iput-object v0, p0, Lcom/beizi/ad/internal/activity/c;->b:Lcom/beizi/ad/internal/view/AdWebView;

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/c;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Landroid/content/MutableContextWrapper;

    if-eqz v0, :cond_2

    .line 8
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/c;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/content/MutableContextWrapper;

    iget-object v1, p0, Lcom/beizi/ad/internal/activity/c;->a:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Landroid/content/MutableContextWrapper;->setBaseContext(Landroid/content/Context;)V

    .line 9
    :cond_2
    invoke-static {}, Lcom/beizi/ad/internal/view/AdViewImpl;->getMRAIDFullscreenImplementation()Lcom/beizi/ad/internal/view/f;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/ad/internal/activity/c;->c:Lcom/beizi/ad/internal/view/f;

    .line 10
    iget-object v1, p0, Lcom/beizi/ad/internal/activity/c;->a:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lcom/beizi/ad/internal/view/f;->a(Landroid/app/Activity;)V

    .line 11
    invoke-static {}, Lcom/beizi/ad/internal/view/AdViewImpl;->getMRAIDFullscreenListener()Lcom/beizi/ad/internal/view/AdWebView$b;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 12
    invoke-static {}, Lcom/beizi/ad/internal/view/AdViewImpl;->getMRAIDFullscreenListener()Lcom/beizi/ad/internal/view/AdWebView$b;

    move-result-object v0

    invoke-interface {v0}, Lcom/beizi/ad/internal/view/AdWebView$b;->a()V

    :cond_3
    return-void

    .line 13
    :cond_4
    :goto_0
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    const-string v1, "Launched MRAID Fullscreen activity with invalid properties"

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/c;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/c;->c:Lcom/beizi/ad/internal/view/f;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, v1}, Lcom/beizi/ad/internal/view/f;->a(Landroid/app/Activity;)V

    .line 3
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/c;->c:Lcom/beizi/ad/internal/view/f;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/f;->a()V

    .line 4
    :cond_0
    iput-object v1, p0, Lcom/beizi/ad/internal/activity/c;->c:Lcom/beizi/ad/internal/view/f;

    return-void
.end method

.method public c()V
    .locals 0

    return-void
.end method

.method public d()V
    .locals 0

    return-void
.end method

.method public e()V
    .locals 0

    return-void
.end method

.method public f()Landroid/webkit/WebView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/c;->b:Lcom/beizi/ad/internal/view/AdWebView;

    return-object v0
.end method
