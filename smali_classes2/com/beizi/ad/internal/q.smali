.class public Lcom/beizi/ad/internal/q;
.super Ljava/lang/Object;
.source "VisibilityDetector.java"


# instance fields
.field private a:Landroid/view/View;

.field private b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ljava/lang/Runnable;

.field private d:Ljava/util/concurrent/ScheduledExecutorService;


# virtual methods
.method public a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/q;->d:Ljava/util/concurrent/ScheduledExecutorService;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->shutdownNow()Ljava/util/List;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/internal/q;->a:Landroid/view/View;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 4
    iget-object v2, p0, Lcom/beizi/ad/internal/q;->c:Ljava/lang/Runnable;

    invoke-virtual {v0, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 5
    iput-object v1, p0, Lcom/beizi/ad/internal/q;->a:Landroid/view/View;

    .line 6
    :cond_1
    iput-object v1, p0, Lcom/beizi/ad/internal/q;->b:Ljava/util/ArrayList;

    return-void
.end method
