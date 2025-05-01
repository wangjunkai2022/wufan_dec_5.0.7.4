.class Lcom/beizi/fusion/work/splash/d$6;
.super Ljava/lang/Object;
.source "CsjNSTWorker.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/splash/d;->aH()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/ViewGroup;

.field final synthetic b:Lcom/beizi/fusion/work/splash/d;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/splash/d;Landroid/view/ViewGroup;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/splash/d$6;->b:Lcom/beizi/fusion/work/splash/d;

    iput-object p2, p0, Lcom/beizi/fusion/work/splash/d$6;->a:Landroid/view/ViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/d$6;->a:Landroid/view/ViewGroup;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/d$6;->b:Lcom/beizi/fusion/work/splash/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/d;->z(Lcom/beizi/fusion/work/splash/d;)Landroid/view/ViewGroup;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v0

    .line 3
    iget-object v1, p0, Lcom/beizi/fusion/work/splash/d$6;->b:Lcom/beizi/fusion/work/splash/d;

    invoke-static {v1}, Lcom/beizi/fusion/work/splash/d;->A(Lcom/beizi/fusion/work/splash/d;)F

    move-result v1

    int-to-float v0, v0

    cmpl-float v1, v1, v0

    if-lez v1, :cond_1

    .line 4
    iget-object v1, p0, Lcom/beizi/fusion/work/splash/d$6;->b:Lcom/beizi/fusion/work/splash/d;

    invoke-static {v1}, Lcom/beizi/fusion/work/splash/d;->A(Lcom/beizi/fusion/work/splash/d;)F

    move-result v1

    div-float/2addr v0, v1

    .line 5
    iget-object v1, p0, Lcom/beizi/fusion/work/splash/d$6;->b:Lcom/beizi/fusion/work/splash/d;

    invoke-static {v1}, Lcom/beizi/fusion/work/splash/d;->B(Lcom/beizi/fusion/work/splash/d;)Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setPivotY(F)V

    .line 6
    iget-object v1, p0, Lcom/beizi/fusion/work/splash/d$6;->b:Lcom/beizi/fusion/work/splash/d;

    invoke-static {v1}, Lcom/beizi/fusion/work/splash/d;->B(Lcom/beizi/fusion/work/splash/d;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->setScaleY(F)V

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/d$6;->a:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method
