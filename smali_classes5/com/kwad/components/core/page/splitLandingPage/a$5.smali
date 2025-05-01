.class final Lcom/kwad/components/core/page/splitLandingPage/a$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/core/page/splitLandingPage/view/SplitScrollWebView$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/page/splitLandingPage/a;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic QK:Lcom/kwad/components/core/page/splitLandingPage/a;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/page/splitLandingPage/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/page/splitLandingPage/a$5;->QK:Lcom/kwad/components/core/page/splitLandingPage/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final f(F)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/page/splitLandingPage/a$5;->QK:Lcom/kwad/components/core/page/splitLandingPage/a;

    invoke-static {v0}, Lcom/kwad/components/core/page/splitLandingPage/a;->e(Lcom/kwad/components/core/page/splitLandingPage/a;)Lcom/kwad/components/core/page/splitLandingPage/view/SplitScrollWebView;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/core/page/splitLandingPage/a$5;->QK:Lcom/kwad/components/core/page/splitLandingPage/a;

    invoke-static {v1}, Lcom/kwad/components/core/page/splitLandingPage/a;->e(Lcom/kwad/components/core/page/splitLandingPage/a;)Lcom/kwad/components/core/page/splitLandingPage/view/SplitScrollWebView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/webkit/WebView;->getTranslationY()F

    move-result v1

    sub-float/2addr v1, p1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setTranslationY(F)V

    return-void
.end method

.method public final qy()Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/page/splitLandingPage/a$5;->QK:Lcom/kwad/components/core/page/splitLandingPage/a;

    invoke-static {v0}, Lcom/kwad/components/core/page/splitLandingPage/a;->f(Lcom/kwad/components/core/page/splitLandingPage/a;)Lcom/kwad/components/core/page/splitLandingPage/view/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/core/page/splitLandingPage/view/a;->qz()Z

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->Cd()I

    move-result v0

    if-ne v0, v1, :cond_0

    return v2

    .line 3
    :cond_0
    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 4
    iget-object v3, p0, Lcom/kwad/components/core/page/splitLandingPage/a$5;->QK:Lcom/kwad/components/core/page/splitLandingPage/a;

    .line 5
    invoke-static {v3}, Lcom/kwad/components/core/page/splitLandingPage/a;->e(Lcom/kwad/components/core/page/splitLandingPage/a;)Lcom/kwad/components/core/page/splitLandingPage/view/SplitScrollWebView;

    move-result-object v3

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/kwad/components/core/page/splitLandingPage/a$5;->QK:Lcom/kwad/components/core/page/splitLandingPage/a;

    invoke-static {v5}, Lcom/kwad/components/core/page/splitLandingPage/a;->e(Lcom/kwad/components/core/page/splitLandingPage/a;)Lcom/kwad/components/core/page/splitLandingPage/view/SplitScrollWebView;

    move-result-object v5

    invoke-virtual {v5}, Landroid/webkit/WebView;->getTranslationY()F

    move-result v5

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lcom/kwad/components/core/s/n;->a(Landroid/view/View;Landroid/view/animation/Interpolator;FF)Landroid/animation/Animator;

    move-result-object v3

    .line 6
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->Cd()I

    move-result v4

    const/4 v5, 0x1

    if-ne v4, v1, :cond_2

    .line 7
    iget-object v4, p0, Lcom/kwad/components/core/page/splitLandingPage/a$5;->QK:Lcom/kwad/components/core/page/splitLandingPage/a;

    invoke-static {v4}, Lcom/kwad/components/core/page/splitLandingPage/a;->c(Lcom/kwad/components/core/page/splitLandingPage/a;)Lcom/kwad/components/core/widget/FeedVideoView;

    move-result-object v4

    invoke-virtual {v4}, Lcom/kwad/components/core/widget/FeedVideoView;->isComplete()Z

    move-result v4

    if-nez v4, :cond_1

    .line 8
    iget-object v4, p0, Lcom/kwad/components/core/page/splitLandingPage/a$5;->QK:Lcom/kwad/components/core/page/splitLandingPage/a;

    invoke-static {v4}, Lcom/kwad/components/core/page/splitLandingPage/a;->f(Lcom/kwad/components/core/page/splitLandingPage/a;)Lcom/kwad/components/core/page/splitLandingPage/view/a;

    move-result-object v4

    invoke-virtual {v4, v5}, Lcom/kwad/components/core/page/splitLandingPage/view/a;->aH(Z)Landroid/animation/Animator;

    move-result-object v4

    new-array v1, v1, [Landroid/animation/Animator;

    aput-object v3, v1, v2

    aput-object v4, v1, v5

    .line 9
    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->playSequentially([Landroid/animation/Animator;)V

    goto :goto_0

    :cond_1
    new-array v1, v5, [Landroid/animation/Animator;

    aput-object v3, v1, v2

    .line 10
    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    goto :goto_0

    .line 11
    :cond_2
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->Cd()I

    move-result v1

    if-ne v1, v5, :cond_3

    new-array v1, v5, [Landroid/animation/Animator;

    aput-object v3, v1, v2

    .line 12
    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 13
    :cond_3
    :goto_0
    new-instance v1, Lcom/kwad/components/core/page/splitLandingPage/a$5$1;

    invoke-direct {v1, p0}, Lcom/kwad/components/core/page/splitLandingPage/a$5$1;-><init>(Lcom/kwad/components/core/page/splitLandingPage/a$5;)V

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 14
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    return v5
.end method
