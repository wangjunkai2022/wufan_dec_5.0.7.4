.class Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/c;->getView()Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/c;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/c;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/c$c;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 4

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/c$c;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/c;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/c;->j(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/c;)Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v1, v0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/c$c;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/c;

    invoke-static {v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/c;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/c;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getView onGlobalLayout "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/c$c;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/c;

    invoke-static {v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/c;->k(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/c;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/c$c;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/c;

    invoke-static {v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/c;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/c;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "getView bindInteractionActivity "

    invoke-static {v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/c$c;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/c;

    invoke-static {v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/c;->c(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/c;)Lcom/baidu/mobads/sdk/api/ExpressResponse;

    move-result-object v1

    check-cast v0, Landroid/app/Activity;

    invoke-interface {v1, v0}, Lcom/baidu/mobads/sdk/api/ExpressResponse;->bindInteractionActivity(Landroid/app/Activity;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/c$c;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/c;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/c;->j(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/c;)Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_0
    return-void
.end method
