.class Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/api/KsAppDownloadListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d;->a(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/widget/FrameLayout$LayoutParams;Ljava/util/List;Ljava/lang/ref/WeakReference;Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d;Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;)V
    .locals 0

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d$a;->a:Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDownloadFailed()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d$a;->a:Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;

    instance-of v1, v0, Lcom/aggmoread/sdk/z/c/a/a/c/o/e$b;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/aggmoread/sdk/z/c/a/a/c/o/e$b;

    const/16 v1, 0x10

    invoke-interface {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/o/e$b;->onADStatusChanged(I)V

    :cond_0
    return-void
.end method

.method public onDownloadFinished()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d$a;->a:Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;

    instance-of v1, v0, Lcom/aggmoread/sdk/z/c/a/a/c/o/e$b;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/aggmoread/sdk/z/c/a/a/c/o/e$b;

    const/16 v1, 0x8

    invoke-interface {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/o/e$b;->onADStatusChanged(I)V

    :cond_0
    return-void
.end method

.method public onDownloadStarted()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d$a;->a:Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;

    instance-of v1, v0, Lcom/aggmoread/sdk/z/c/a/a/c/o/e$b;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/aggmoread/sdk/z/c/a/a/c/o/e$b;

    const/4 v1, 0x4

    invoke-interface {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/o/e$b;->onADStatusChanged(I)V

    :cond_0
    return-void
.end method

.method public onIdle()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d$a;->a:Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;

    instance-of v1, v0, Lcom/aggmoread/sdk/z/c/a/a/c/o/e$b;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/aggmoread/sdk/z/c/a/a/c/o/e$b;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/o/e$b;->onADStatusChanged(I)V

    :cond_0
    return-void
.end method

.method public onInstalled()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d$a;->a:Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;

    instance-of v1, v0, Lcom/aggmoread/sdk/z/c/a/a/c/o/e$b;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/aggmoread/sdk/z/c/a/a/c/o/e$b;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/o/e$b;->onADStatusChanged(I)V

    :cond_0
    return-void
.end method

.method public onProgressUpdate(I)V
    .locals 2

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d;->q:Ljava/lang/String;

    const-string v1, "onADStatusChanged"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d$a;->a:Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;

    instance-of v1, v0, Lcom/aggmoread/sdk/z/c/a/a/c/o/e$b;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/aggmoread/sdk/z/c/a/a/c/o/e$b;

    invoke-interface {v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/c/o/e$b;->onLoadApkProgress(I)V

    :cond_0
    return-void
.end method
