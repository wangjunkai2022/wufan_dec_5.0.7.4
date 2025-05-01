.class Lcom/beizi/fusion/work/f/b$3;
.super Ljava/lang/Object;
.source "BeiZiNativeUnifiedWorker.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/f/b;->a(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/f/b;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/f/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/f/b$3;->a:Lcom/beizi/fusion/work/f/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/beizi/fusion/work/f/b$3;->a:Lcom/beizi/fusion/work/f/b;

    iget-object v0, v0, Lcom/beizi/fusion/work/f/a;->s:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/f/b$3;->a:Lcom/beizi/fusion/work/f/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/f/b;->c(Lcom/beizi/fusion/work/f/b;)V

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/work/f/b$3;->a:Lcom/beizi/fusion/work/f/b;

    iget-object v1, v0, Lcom/beizi/fusion/work/f/a;->s:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getWidth()I

    move-result v1

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/f/b;->c(Lcom/beizi/fusion/work/f/b;I)I

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/work/f/b$3;->a:Lcom/beizi/fusion/work/f/b;

    iget-object v1, v0, Lcom/beizi/fusion/work/f/a;->s:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v1

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/f/b;->d(Lcom/beizi/fusion/work/f/b;I)I

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/work/f/b$3;->a:Lcom/beizi/fusion/work/f/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/f/b;->d(Lcom/beizi/fusion/work/f/b;)I

    move-result v1

    iget-object v2, p0, Lcom/beizi/fusion/work/f/b$3;->a:Lcom/beizi/fusion/work/f/b;

    .line 7
    invoke-static {v2}, Lcom/beizi/fusion/work/f/b;->e(Lcom/beizi/fusion/work/f/b;)I

    move-result v2

    iget-object v3, p0, Lcom/beizi/fusion/work/f/b$3;->a:Lcom/beizi/fusion/work/f/b;

    .line 8
    invoke-static {v3}, Lcom/beizi/fusion/work/f/b;->e(Lcom/beizi/fusion/work/f/b;)I

    move-result v3

    .line 9
    invoke-static {v0, v1, v2, v3}, Lcom/beizi/fusion/work/f/b;->a(Lcom/beizi/fusion/work/f/b;III)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method
