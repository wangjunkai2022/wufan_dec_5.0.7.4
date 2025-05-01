.class public abstract Lcom/kwad/components/core/l/b;
.super Lcom/kwad/components/core/proxy/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/kwad/components/core/l/a;",
        ">",
        "Lcom/kwad/components/core/proxy/c;"
    }
.end annotation


# instance fields
.field public mCallerContext:Lcom/kwad/components/core/l/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field protected mPresenter:Lcom/kwad/sdk/mvp/Presenter;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/proxy/c;-><init>()V

    return-void
.end method

.method private notifyOnCreate()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/l/b;->mCallerContext:Lcom/kwad/components/core/l/a;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, v0, Lcom/kwad/components/core/l/a;->MU:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/components/core/l/a/a;

    .line 3
    invoke-interface {v1}, Lcom/kwad/components/core/l/a/a;->fQ()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private notifyOnDestroy()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/l/b;->mCallerContext:Lcom/kwad/components/core/l/a;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, v0, Lcom/kwad/components/core/l/a;->MU:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/components/core/l/a/a;

    .line 3
    invoke-interface {v1}, Lcom/kwad/components/core/l/a/a;->fR()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private notifyOnPause()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/l/b;->mCallerContext:Lcom/kwad/components/core/l/a;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, v0, Lcom/kwad/components/core/l/a;->MU:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/components/core/l/a/a;

    .line 3
    invoke-interface {v1, p0}, Lcom/kwad/components/core/l/a/a;->d(Lcom/kwad/components/core/proxy/c;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private notifyOnResume()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/l/b;->mCallerContext:Lcom/kwad/components/core/l/a;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, v0, Lcom/kwad/components/core/l/a;->MU:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/components/core/l/a/a;

    .line 3
    invoke-interface {v1, p0}, Lcom/kwad/components/core/l/a/a;->c(Lcom/kwad/components/core/proxy/c;)V

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public initMVP()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/kwad/components/core/l/b;->onCreateCallerContext()Lcom/kwad/components/core/l/a;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/core/l/b;->mCallerContext:Lcom/kwad/components/core/l/a;

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/l/b;->mPresenter:Lcom/kwad/sdk/mvp/Presenter;

    if-nez v0, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/kwad/components/core/l/b;->onCreatePresenter()Lcom/kwad/sdk/mvp/Presenter;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/core/l/b;->mPresenter:Lcom/kwad/sdk/mvp/Presenter;

    .line 4
    iget-object v1, p0, Lcom/kwad/components/core/proxy/c;->mRootView:Landroid/view/View;

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->G(Landroid/view/View;)V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/l/b;->mPresenter:Lcom/kwad/sdk/mvp/Presenter;

    iget-object v1, p0, Lcom/kwad/components/core/l/b;->mCallerContext:Lcom/kwad/components/core/l/a;

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->k(Ljava/lang/Object;)V

    return-void
.end method

.method public onActivityCreate()V
    .locals 1
    .annotation build Landroidx/annotation/CallSuper;
    .end annotation

    .line 1
    :try_start_0
    invoke-super {p0}, Lcom/kwad/components/core/proxy/c;->onActivityCreate()V

    .line 2
    invoke-virtual {p0}, Lcom/kwad/components/core/l/b;->initMVP()V

    .line 3
    invoke-direct {p0}, Lcom/kwad/components/core/l/b;->notifyOnCreate()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 4
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method protected abstract onCreateCallerContext()Lcom/kwad/components/core/l/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method protected abstract onCreatePresenter()Lcom/kwad/sdk/mvp/Presenter;
.end method

.method public onDestroy()V
    .locals 1
    .annotation build Landroidx/annotation/CallSuper;
    .end annotation

    .line 1
    :try_start_0
    invoke-super {p0}, Lcom/kwad/components/core/proxy/c;->onDestroy()V

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/core/l/b;->notifyOnDestroy()V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/l/b;->mCallerContext:Lcom/kwad/components/core/l/a;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Lcom/kwad/components/core/l/a;->release()V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/l/b;->mPresenter:Lcom/kwad/sdk/mvp/Presenter;

    if-eqz v0, :cond_1

    .line 6
    invoke-virtual {v0}, Lcom/kwad/sdk/mvp/Presenter;->destroy()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    return-void

    :catchall_0
    move-exception v0

    .line 7
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onPause()V
    .locals 1
    .annotation build Landroidx/annotation/CallSuper;
    .end annotation

    .line 1
    :try_start_0
    invoke-super {p0}, Lcom/kwad/components/core/proxy/c;->onPause()V

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/core/l/b;->notifyOnPause()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 3
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onResume()V
    .locals 1
    .annotation build Landroidx/annotation/CallSuper;
    .end annotation

    .line 1
    :try_start_0
    invoke-super {p0}, Lcom/kwad/components/core/proxy/c;->onResume()V

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/core/l/b;->notifyOnResume()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 3
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method
