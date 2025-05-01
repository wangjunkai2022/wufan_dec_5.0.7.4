.class Lcom/beizi/fusion/work/h/d$5$1;
.super Ljava/lang/Object;
.source "GdtUnifiedCustomWorker.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/h/d$5;->onGlobalLayout()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/h/d$5;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/h/d$5;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/h/d$5$1;->a:Lcom/beizi/fusion/work/h/d$5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/h/d$5$1;->a:Lcom/beizi/fusion/work/h/d$5;

    iget-object v0, v0, Lcom/beizi/fusion/work/h/d$5;->b:Lcom/beizi/fusion/work/h/d;

    iget-object v0, v0, Lcom/beizi/fusion/work/h/a;->q:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    iget-object v1, p0, Lcom/beizi/fusion/work/h/d$5$1;->a:Lcom/beizi/fusion/work/h/d$5;

    iget-object v1, v1, Lcom/beizi/fusion/work/h/d$5;->b:Lcom/beizi/fusion/work/h/d;

    iget-object v1, v1, Lcom/beizi/fusion/work/h/a;->N:Landroid/content/Context;

    const/high16 v2, 0x42380000    # 46.0f

    invoke-static {v1, v2}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v1

    iget-object v2, p0, Lcom/beizi/fusion/work/h/d$5$1;->a:Lcom/beizi/fusion/work/h/d$5;

    iget-object v2, v2, Lcom/beizi/fusion/work/h/d$5;->b:Lcom/beizi/fusion/work/h/d;

    iget-object v2, v2, Lcom/beizi/fusion/work/h/a;->N:Landroid/content/Context;

    const/high16 v3, 0x41600000    # 14.0f

    .line 3
    invoke-static {v2, v3}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/4 v1, 0x2

    new-array v2, v1, [I

    .line 4
    iget-object v3, p0, Lcom/beizi/fusion/work/h/d$5$1;->a:Lcom/beizi/fusion/work/h/d$5;

    iget-object v3, v3, Lcom/beizi/fusion/work/h/d$5;->b:Lcom/beizi/fusion/work/h/d;

    invoke-static {v3}, Lcom/beizi/fusion/work/h/d;->e(Lcom/beizi/fusion/work/h/d;)Landroid/widget/FrameLayout;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/widget/FrameLayout;->getLocationInWindow([I)V

    new-array v1, v1, [I

    .line 5
    iget-object v3, p0, Lcom/beizi/fusion/work/h/d$5$1;->a:Lcom/beizi/fusion/work/h/d$5;

    iget-object v3, v3, Lcom/beizi/fusion/work/h/d$5;->b:Lcom/beizi/fusion/work/h/d;

    iget-object v3, v3, Lcom/beizi/fusion/work/h/a;->q:Landroid/view/ViewGroup;

    invoke-virtual {v3, v1}, Landroid/view/ViewGroup;->getLocationInWindow([I)V

    const/4 v3, 0x0

    .line 6
    aget v3, v2, v3

    iput v3, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    const/4 v3, 0x1

    .line 7
    aget v2, v2, v3

    aget v1, v1, v3

    sub-int/2addr v2, v1

    iget-object v1, p0, Lcom/beizi/fusion/work/h/d$5$1;->a:Lcom/beizi/fusion/work/h/d$5;

    iget-object v1, v1, Lcom/beizi/fusion/work/h/d$5;->b:Lcom/beizi/fusion/work/h/d;

    iget-object v1, v1, Lcom/beizi/fusion/work/h/a;->q:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getTop()I

    move-result v1

    add-int/2addr v2, v1

    iput v2, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 8
    iget-object v1, p0, Lcom/beizi/fusion/work/h/d$5$1;->a:Lcom/beizi/fusion/work/h/d$5;

    iget-object v1, v1, Lcom/beizi/fusion/work/h/d$5;->b:Lcom/beizi/fusion/work/h/d;

    invoke-static {v1}, Lcom/beizi/fusion/work/h/d;->b(Lcom/beizi/fusion/work/h/d;)Lcom/qq/e/ads/nativ/NativeUnifiedADData;

    move-result-object v1

    iget-object v2, p0, Lcom/beizi/fusion/work/h/d$5$1;->a:Lcom/beizi/fusion/work/h/d$5;

    iget-object v2, v2, Lcom/beizi/fusion/work/h/d$5;->b:Lcom/beizi/fusion/work/h/d;

    iget-object v3, v2, Lcom/beizi/fusion/work/h/a;->N:Landroid/content/Context;

    invoke-static {v2}, Lcom/beizi/fusion/work/h/d;->f(Lcom/beizi/fusion/work/h/d;)Lcom/qq/e/ads/nativ/widget/NativeAdContainer;

    move-result-object v2

    iget-object v4, p0, Lcom/beizi/fusion/work/h/d$5$1;->a:Lcom/beizi/fusion/work/h/d$5;

    iget-object v4, v4, Lcom/beizi/fusion/work/h/d$5;->a:Ljava/util/List;

    invoke-interface {v1, v3, v2, v0, v4}, Lcom/qq/e/ads/nativ/NativeUnifiedADData;->bindAdToView(Landroid/content/Context;Lcom/qq/e/ads/nativ/widget/NativeAdContainer;Landroid/widget/FrameLayout$LayoutParams;Ljava/util/List;)V

    :cond_0
    return-void
.end method
