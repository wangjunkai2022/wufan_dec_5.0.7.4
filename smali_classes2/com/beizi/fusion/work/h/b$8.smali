.class Lcom/beizi/fusion/work/h/b$8;
.super Ljava/lang/Object;
.source "BeiZiUnifiedCustomWorker.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/h/b;->aZ()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/h/b;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/h/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/h/b$8;->a:Lcom/beizi/fusion/work/h/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/h/b$8;->a:Lcom/beizi/fusion/work/h/b;

    iget-object v0, v0, Lcom/beizi/fusion/work/h/a;->x:Landroid/view/ViewGroup;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/h/b$8;->a:Lcom/beizi/fusion/work/h/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/h/b;->d(Lcom/beizi/fusion/work/h/b;)V

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/work/h/b$8;->a:Lcom/beizi/fusion/work/h/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/h/b;->e(Lcom/beizi/fusion/work/h/b;)V

    return-void
.end method
