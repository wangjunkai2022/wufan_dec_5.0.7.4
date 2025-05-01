.class Lcom/beizi/fusion/work/h/d$5;
.super Ljava/lang/Object;
.source "GdtUnifiedCustomWorker.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/h/d;->a(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lcom/beizi/fusion/work/h/d;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/h/d;Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/h/d$5;->b:Lcom/beizi/fusion/work/h/d;

    iput-object p2, p0, Lcom/beizi/fusion/work/h/d$5;->a:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/h/d$5;->b:Lcom/beizi/fusion/work/h/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/h/d;->d(Lcom/beizi/fusion/work/h/d;)I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const-wide/16 v0, 0x1f4

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    .line 2
    :goto_0
    new-instance v2, Landroid/os/Handler;

    invoke-direct {v2}, Landroid/os/Handler;-><init>()V

    new-instance v3, Lcom/beizi/fusion/work/h/d$5$1;

    invoke-direct {v3, p0}, Lcom/beizi/fusion/work/h/d$5$1;-><init>(Lcom/beizi/fusion/work/h/d$5;)V

    invoke-virtual {v2, v3, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
