.class public Lcom/join/mgps/customview/LoopViewPager;
.super Landroidx/viewpager/widget/ViewPager;
.source "LoopViewPager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/customview/LoopViewPager$LifeCycle;
    }
.end annotation


# static fields
.field public static final l:I = 0x5

.field private static final m:Z = false

.field public static final n:I = 0x0

.field public static final o:I = 0x1

.field public static final p:I = 0x2


# instance fields
.field b:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

.field private c:Lcom/join/mgps/customview/LoopPagerAdapterWrapper;

.field private d:Z

.field private e:I

.field private f:Z

.field private g:Ljava/util/concurrent/ScheduledExecutorService;

.field h:Z

.field private i:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

.field private j:F

.field private k:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroidx/viewpager/widget/ViewPager;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/join/mgps/customview/LoopViewPager;->d:Z

    .line 3
    iput p1, p0, Lcom/join/mgps/customview/LoopViewPager;->e:I

    .line 4
    iput-boolean p1, p0, Lcom/join/mgps/customview/LoopViewPager;->f:Z

    .line 5
    iput-boolean p1, p0, Lcom/join/mgps/customview/LoopViewPager;->h:Z

    .line 6
    new-instance v0, Lcom/join/mgps/customview/LoopViewPager$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/customview/LoopViewPager$a;-><init>(Lcom/join/mgps/customview/LoopViewPager;)V

    iput-object v0, p0, Lcom/join/mgps/customview/LoopViewPager;->i:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lcom/join/mgps/customview/LoopViewPager;->j:F

    .line 8
    iput-boolean p1, p0, Lcom/join/mgps/customview/LoopViewPager;->k:Z

    .line 9
    invoke-direct {p0}, Lcom/join/mgps/customview/LoopViewPager;->f()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 10
    invoke-direct {p0, p1, p2}, Landroidx/viewpager/widget/ViewPager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    .line 11
    iput-boolean p1, p0, Lcom/join/mgps/customview/LoopViewPager;->d:Z

    .line 12
    iput p1, p0, Lcom/join/mgps/customview/LoopViewPager;->e:I

    .line 13
    iput-boolean p1, p0, Lcom/join/mgps/customview/LoopViewPager;->f:Z

    .line 14
    iput-boolean p1, p0, Lcom/join/mgps/customview/LoopViewPager;->h:Z

    .line 15
    new-instance p2, Lcom/join/mgps/customview/LoopViewPager$a;

    invoke-direct {p2, p0}, Lcom/join/mgps/customview/LoopViewPager$a;-><init>(Lcom/join/mgps/customview/LoopViewPager;)V

    iput-object p2, p0, Lcom/join/mgps/customview/LoopViewPager;->i:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    const/4 p2, 0x0

    .line 16
    iput p2, p0, Lcom/join/mgps/customview/LoopViewPager;->j:F

    .line 17
    iput-boolean p1, p0, Lcom/join/mgps/customview/LoopViewPager;->k:Z

    .line 18
    invoke-direct {p0}, Lcom/join/mgps/customview/LoopViewPager;->f()V

    return-void
.end method

.method static synthetic a(Lcom/join/mgps/customview/LoopViewPager;)Lcom/join/mgps/customview/LoopPagerAdapterWrapper;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/customview/LoopViewPager;->c:Lcom/join/mgps/customview/LoopPagerAdapterWrapper;

    return-object p0
.end method

.method static synthetic b(Lcom/join/mgps/customview/LoopViewPager;)I
    .locals 0

    .line 1
    invoke-super {p0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result p0

    return p0
.end method

.method static synthetic c(Lcom/join/mgps/customview/LoopViewPager;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/customview/LoopViewPager;->e:I

    return p0
.end method

.method static synthetic d(Lcom/join/mgps/customview/LoopViewPager;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/mgps/customview/LoopViewPager;->f:Z

    return p0
.end method

.method static synthetic e(Lcom/join/mgps/customview/LoopViewPager;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/customview/LoopViewPager;->g()V

    return-void
.end method

.method private f()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/LoopViewPager;->i:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    invoke-super {p0, v0}, Landroidx/viewpager/widget/ViewPager;->setOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    return-void
.end method

.method private g()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/LoopViewPager;->g:Ljava/util/concurrent/ScheduledExecutorService;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->isShutdown()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/customview/LoopViewPager;->g:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->shutdown()V

    :cond_0
    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/join/mgps/customview/LoopViewPager;->g:Ljava/util/concurrent/ScheduledExecutorService;

    return-void
.end method

.method public static j(II)I
    .locals 0

    add-int/lit8 p0, p0, -0x1

    if-gez p0, :cond_0

    add-int/2addr p0, p1

    goto :goto_0

    .line 1
    :cond_0
    rem-int/2addr p0, p1

    :goto_0
    return p0
.end method


# virtual methods
.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    const/4 v3, 0x1

    if-eq v0, v3, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget v0, p0, Lcom/join/mgps/customview/LoopViewPager;->j:F

    cmpl-float v1, v0, v2

    if-eqz v1, :cond_1

    .line 3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    sub-float/2addr v0, v1

    iput v0, p0, Lcom/join/mgps/customview/LoopViewPager;->j:F

    .line 4
    :cond_1
    iget v0, p0, Lcom/join/mgps/customview/LoopViewPager;->j:F

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v1, 0x40a00000    # 5.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    .line 5
    iput-boolean v3, p0, Lcom/join/mgps/customview/LoopViewPager;->k:Z

    .line 6
    :cond_2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    iget-boolean v1, p0, Lcom/join/mgps/customview/LoopViewPager;->k:Z

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 7
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lcom/join/mgps/customview/LoopViewPager;->j:F

    goto :goto_0

    .line 8
    :cond_3
    iput v2, p0, Lcom/join/mgps/customview/LoopViewPager;->j:F

    .line 9
    iput-boolean v1, p0, Lcom/join/mgps/customview/LoopViewPager;->k:Z

    goto :goto_0

    .line 10
    :cond_4
    iput v2, p0, Lcom/join/mgps/customview/LoopViewPager;->j:F

    .line 11
    iput-boolean v1, p0, Lcom/join/mgps/customview/LoopViewPager;->k:Z

    .line 12
    :goto_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public getAdapter()Landroidx/viewpager/widget/PagerAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/LoopViewPager;->c:Lcom/join/mgps/customview/LoopPagerAdapterWrapper;

    return-object v0
.end method

.method public getCurrentItem()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/LoopViewPager;->c:Lcom/join/mgps/customview/LoopPagerAdapterWrapper;

    if-eqz v0, :cond_0

    invoke-super {p0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/LoopPagerAdapterWrapper;->h(I)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public h()V
    .locals 1

    const/4 v0, 0x3

    .line 1
    invoke-virtual {p0, v0}, Lcom/join/mgps/customview/LoopViewPager;->i(I)V

    return-void
.end method

.method public i(I)V
    .locals 7

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/customview/LoopViewPager;->g()V

    .line 2
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/customview/LoopViewPager;->g:Ljava/util/concurrent/ScheduledExecutorService;

    .line 3
    new-instance v1, Lcom/join/mgps/customview/LoopViewPager$b;

    invoke-direct {v1, p0}, Lcom/join/mgps/customview/LoopViewPager$b;-><init>(Lcom/join/mgps/customview/LoopViewPager;)V

    mul-int/lit16 p1, p1, 0x3e8

    int-to-long v4, p1

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    move-wide v2, v4

    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroidx/viewpager/widget/ViewPager;->onDetachedFromWindow()V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/customview/LoopViewPager;->g()V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    if-eq v0, v1, :cond_0

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/customview/LoopViewPager;->f:Z

    goto :goto_0

    .line 3
    :cond_1
    iput-boolean v1, p0, Lcom/join/mgps/customview/LoopViewPager;->f:Z

    .line 4
    iput-boolean v1, p0, Lcom/join/mgps/customview/LoopViewPager;->h:Z

    .line 5
    :goto_0
    invoke-super {p0, p1}, Landroidx/viewpager/widget/ViewPager;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/customview/LoopPagerAdapterWrapper;

    invoke-direct {v0, p1}, Lcom/join/mgps/customview/LoopPagerAdapterWrapper;-><init>(Landroidx/viewpager/widget/PagerAdapter;)V

    iput-object v0, p0, Lcom/join/mgps/customview/LoopViewPager;->c:Lcom/join/mgps/customview/LoopPagerAdapterWrapper;

    .line 2
    iget-boolean p1, p0, Lcom/join/mgps/customview/LoopViewPager;->d:Z

    invoke-virtual {v0, p1}, Lcom/join/mgps/customview/LoopPagerAdapterWrapper;->f(Z)V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/customview/LoopViewPager;->c:Lcom/join/mgps/customview/LoopPagerAdapterWrapper;

    invoke-super {p0, p1}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    const/4 p1, 0x0

    .line 4
    invoke-virtual {p0, p1, p1}, Lcom/join/mgps/customview/LoopViewPager;->setCurrentItem(IZ)V

    return-void
.end method

.method public setBoundaryCaching(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/customview/LoopViewPager;->d:Z

    .line 2
    iget-object v0, p0, Lcom/join/mgps/customview/LoopViewPager;->c:Lcom/join/mgps/customview/LoopPagerAdapterWrapper;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p1}, Lcom/join/mgps/customview/LoopPagerAdapterWrapper;->f(Z)V

    :cond_0
    return-void
.end method

.method public setCurrentItem(I)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/customview/LoopViewPager;->getCurrentItem()I

    move-result v0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x1

    .line 4
    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/customview/LoopViewPager;->setCurrentItem(IZ)V

    :cond_0
    return-void
.end method

.method public setCurrentItem(IZ)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/customview/LoopViewPager;->c:Lcom/join/mgps/customview/LoopPagerAdapterWrapper;

    invoke-virtual {v0, p1}, Lcom/join/mgps/customview/LoopPagerAdapterWrapper;->g(I)I

    move-result p1

    .line 2
    invoke-super {p0, p1, p2}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(IZ)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public setLifeCycle(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/LoopViewPager;->e:I

    return-void
.end method

.method public setOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/LoopViewPager;->b:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    return-void
.end method
