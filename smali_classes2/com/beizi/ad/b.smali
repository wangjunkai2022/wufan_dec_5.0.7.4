.class Lcom/beizi/ad/b;
.super Landroid/widget/FrameLayout;
.source "BaseAdView.java"

# interfaces
.implements Lcom/beizi/ad/AdLifeControl;


# instance fields
.field protected final a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/beizi/ad/internal/j;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 8
    new-instance p4, Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-direct {p4, p1, p2, p3}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iput-object p4, p0, Lcom/beizi/ad/b;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    .line 9
    invoke-direct {p0}, Lcom/beizi/ad/b;->a()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;Lcom/beizi/ad/internal/j;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 5
    new-instance p3, Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-direct {p3, p1, p2}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    iput-object p3, p0, Lcom/beizi/ad/b;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    .line 6
    invoke-direct {p0}, Lcom/beizi/ad/b;->a()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/beizi/ad/internal/j;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance p2, Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-direct {p2, p1}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/beizi/ad/b;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    .line 3
    invoke-direct {p0}, Lcom/beizi/ad/b;->a()V

    return-void
.end method

.method private a()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->setBackgroundColor(I)V

    .line 2
    invoke-virtual {p0, v0, v0, v0, v0}, Landroid/widget/FrameLayout;->setPadding(IIII)V

    .line 3
    iget-object v0, p0, Lcom/beizi/ad/b;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/b;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->cancel()V

    :cond_0
    return-void
.end method

.method public getAdListener()Lcom/beizi/ad/AdListener;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/b;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->getAdListener()Lcom/beizi/ad/AdListener;

    move-result-object v0

    return-object v0
.end method

.method public getAdSize()Lcom/beizi/ad/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/b;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->getAdSize()Lcom/beizi/ad/a;

    move-result-object v0

    return-object v0
.end method

.method public getAdUnitId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/b;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->getAdUnitId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getPrice()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/b;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->getPrice()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getResizeAdToFitContainer()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/b;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->getResizeAdToFitContainer()Z

    move-result v0

    return v0
.end method

.method public isAutoRefresh()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/b;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->isAutoRefresh()Z

    return-void
.end method

.method public isLoading()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/b;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->isLoading()Z

    move-result v0

    return v0
.end method

.method public loadAd(Lcom/beizi/ad/AdRequest;)V
    .locals 1
    .annotation build Landroidx/annotation/RequiresPermission;
        value = "android.permission.INTERNET"
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/b;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-virtual {p1}, Lcom/beizi/ad/AdRequest;->impl()Lcom/beizi/ad/internal/network/a$a;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->loadAd(Lcom/beizi/ad/internal/network/a$a;)Z

    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    return-void
.end method

.method public onCreateLifeCycle()V
    .locals 0

    return-void
.end method

.method public onDestoryLifeCycle()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/b;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->onDestoryLifeCycle()V

    :cond_0
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/b;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->activityOnDestroy()V

    :cond_0
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    return-void
.end method

.method protected onMeasure(II)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/beizi/ad/b;->getResizeAdToFitContainer()Z

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    if-eqz v0, :cond_0

    .line 2
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    invoke-static {p1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    .line 3
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    .line 4
    div-int/lit8 p2, p2, 0x6

    invoke-static {p2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 5
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    goto/16 :goto_2

    .line 6
    :cond_0
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 7
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 8
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v2

    .line 9
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    const/4 v3, 0x0

    .line 10
    invoke-virtual {p0, v3}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 11
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v5

    const/16 v6, 0x8

    if-eq v5, v6, :cond_1

    .line 12
    invoke-virtual {p0, v4, p1, p2}, Landroid/widget/FrameLayout;->measureChild(Landroid/view/View;II)V

    .line 13
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    .line 14
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    .line 15
    :try_start_0
    invoke-virtual {p0}, Lcom/beizi/ad/b;->getAdSize()Lcom/beizi/ad/a;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v5

    .line 16
    sget-object v6, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    const-string v7, "Unable to retrieve ad size."

    invoke-static {v6, v7, v5}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    if-eqz v4, :cond_2

    .line 17
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v3

    .line 18
    invoke-virtual {v4, v3}, Lcom/beizi/ad/a;->b(Landroid/content/Context;)I

    move-result v5

    .line 19
    invoke-virtual {v4, v3}, Lcom/beizi/ad/a;->a(Landroid/content/Context;)I

    move-result v3

    move v4, v3

    move v3, v5

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    .line 20
    :goto_1
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getSuggestedMinimumWidth()I

    move-result v5

    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 21
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getSuggestedMinimumHeight()I

    move-result v5

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    if-ne v0, v1, :cond_3

    .line 22
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v3

    :cond_3
    if-ne v2, v1, :cond_4

    .line 23
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v4

    .line 24
    :cond_4
    invoke-static {v3, p1}, Landroid/view/View;->resolveSize(II)I

    move-result p1

    invoke-static {v4, p2}, Landroid/view/View;->resolveSize(II)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/widget/FrameLayout;->setMeasuredDimension(II)V

    :goto_2
    return-void
.end method

.method public onPauseLifeCycle()V
    .locals 0

    return-void
.end method

.method public onRestartLifeCycle()V
    .locals 0

    return-void
.end method

.method public onResumeLifeCycle()V
    .locals 0

    return-void
.end method

.method public onStartLifeCycle()V
    .locals 0

    return-void
.end method

.method public onStopLifeCycle()V
    .locals 0

    return-void
.end method

.method protected onWindowVisibilityChanged(I)V
    .locals 1

    const/16 v0, 0x8

    if-ne p1, v0, :cond_0

    .line 1
    iget-object p1, p0, Lcom/beizi/ad/b;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->activityOnPause()V

    goto :goto_0

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/beizi/ad/b;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->activityOnResume()V

    :goto_0
    return-void
.end method

.method public openAdInNativeBrowser(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/b;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/view/AdViewImpl;->openAdInNativeBrowser(Z)V

    return-void
.end method

.method public resume()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/b;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->activityOnResume()V

    return-void
.end method

.method public setAdListener(Lcom/beizi/ad/AdListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/b;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/view/AdViewImpl;->setAdListener(Lcom/beizi/ad/AdListener;)V

    return-void
.end method

.method setAdSize(Lcom/beizi/ad/a;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/b;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-virtual {p1}, Lcom/beizi/ad/a;->b()I

    move-result v1

    invoke-virtual {p1}, Lcom/beizi/ad/a;->a()I

    move-result p1

    invoke-virtual {v0, v1, p1}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->setAdSize(II)V

    return-void
.end method

.method public setAdUnitId(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/b;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/view/AdViewImpl;->setAdUnitId(Ljava/lang/String;)V

    return-void
.end method

.method public setAutoRefresh(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/b;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->setAutoRefresh(Z)V

    return-void
.end method

.method public setCloseMarketDialog(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/b;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/view/AdViewImpl;->setCloseMarketDialog(Z)V

    :cond_0
    return-void
.end method

.method public setResizeAdToFitContainer(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/b;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->setResizeAdToFitContainer(Z)V

    .line 2
    invoke-virtual {p0}, Lcom/beizi/ad/b;->getResizeAdToFitContainer()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/beizi/ad/b;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void
.end method

.method public setTransitionDerection(Lcom/beizi/ad/internal/animation/TransitionDirection;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/b;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->setTransitionDirection(Lcom/beizi/ad/internal/animation/TransitionDirection;)V

    return-void
.end method

.method public setTransitionDuration(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/b;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->setTransitionDuration(J)V

    return-void
.end method

.method public setTransitionType(Lcom/beizi/ad/internal/animation/TransitionType;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/b;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->setTransitionType(Lcom/beizi/ad/internal/animation/TransitionType;)V

    return-void
.end method
