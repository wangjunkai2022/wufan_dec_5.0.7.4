.class public Lcom/papa91/arc/widget/MyFrameAnimation;
.super Landroid/graphics/drawable/AnimationDrawable;
.source "MyFrameAnimation.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/papa91/arc/widget/MyFrameAnimation$OnFrameAnimationListener;
    }
.end annotation


# instance fields
.field private handler:Landroid/os/Handler;

.field private maxDuration:I

.field private onFrameAnimationListener:Lcom/papa91/arc/widget/MyFrameAnimation$OnFrameAnimationListener;

.field private runnable:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/AnimationDrawable;-><init>()V

    .line 2
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/papa91/arc/widget/MyFrameAnimation;->handler:Landroid/os/Handler;

    .line 3
    new-instance v0, Lcom/papa91/arc/widget/MyFrameAnimation$1;

    invoke-direct {v0, p0}, Lcom/papa91/arc/widget/MyFrameAnimation$1;-><init>(Lcom/papa91/arc/widget/MyFrameAnimation;)V

    iput-object v0, p0, Lcom/papa91/arc/widget/MyFrameAnimation;->runnable:Ljava/lang/Runnable;

    return-void
.end method

.method static synthetic access$000(Lcom/papa91/arc/widget/MyFrameAnimation;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/papa91/arc/widget/MyFrameAnimation;->initHandler()V

    return-void
.end method

.method static synthetic access$100(Lcom/papa91/arc/widget/MyFrameAnimation;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/papa91/arc/widget/MyFrameAnimation;->unRunning()V

    return-void
.end method

.method private getMaxDuration()I
    .locals 3

    const/4 v0, 0x0

    .line 1
    :goto_0
    invoke-virtual {p0}, Landroid/graphics/drawable/AnimationDrawable;->getNumberOfFrames()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 2
    iget v1, p0, Lcom/papa91/arc/widget/MyFrameAnimation;->maxDuration:I

    invoke-virtual {p0, v0}, Landroid/graphics/drawable/AnimationDrawable;->getDuration(I)I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 3
    invoke-virtual {p0, v0}, Landroid/graphics/drawable/AnimationDrawable;->getDuration(I)I

    move-result v1

    iput v1, p0, Lcom/papa91/arc/widget/MyFrameAnimation;->maxDuration:I

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 4
    :cond_1
    iget v0, p0, Lcom/papa91/arc/widget/MyFrameAnimation;->maxDuration:I

    const/16 v1, 0x3e8

    if-le v0, v1, :cond_2

    const/16 v0, 0x3e8

    :cond_2
    return v0
.end method

.method private initHandler()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/widget/MyFrameAnimation;->handler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/papa91/arc/widget/MyFrameAnimation;->runnable:Ljava/lang/Runnable;

    iget v2, p0, Lcom/papa91/arc/widget/MyFrameAnimation;->maxDuration:I

    if-nez v2, :cond_0

    invoke-direct {p0}, Lcom/papa91/arc/widget/MyFrameAnimation;->getMaxDuration()I

    move-result v2

    :cond_0
    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private unRunning()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/widget/MyFrameAnimation;->onFrameAnimationListener:Lcom/papa91/arc/widget/MyFrameAnimation$OnFrameAnimationListener;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/papa91/arc/widget/MyFrameAnimation$OnFrameAnimationListener;->onEnd()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/papa91/arc/widget/MyFrameAnimation;->handler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/papa91/arc/widget/MyFrameAnimation;->runnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public setOnFrameAnimationListener(Lcom/papa91/arc/widget/MyFrameAnimation$OnFrameAnimationListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/papa91/arc/widget/MyFrameAnimation;->onFrameAnimationListener:Lcom/papa91/arc/widget/MyFrameAnimation$OnFrameAnimationListener;

    return-void
.end method

.method public start()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 2
    invoke-direct {p0}, Lcom/papa91/arc/widget/MyFrameAnimation;->initHandler()V

    .line 3
    iget-object v0, p0, Lcom/papa91/arc/widget/MyFrameAnimation;->onFrameAnimationListener:Lcom/papa91/arc/widget/MyFrameAnimation$OnFrameAnimationListener;

    if-eqz v0, :cond_0

    .line 4
    invoke-interface {v0}, Lcom/papa91/arc/widget/MyFrameAnimation$OnFrameAnimationListener;->onStart()V

    :cond_0
    return-void
.end method

.method public stop()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    return-void
.end method
