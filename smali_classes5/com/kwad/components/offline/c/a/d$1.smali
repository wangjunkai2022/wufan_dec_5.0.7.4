.class final Lcom/kwad/components/offline/c/a/d$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/components/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/offline/c/a/d;->addLoadStatusListener(Lcom/kwad/components/offline/api/tk/IOfflineApkLoadStatusListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic aed:Lcom/kwad/components/offline/api/tk/IOfflineApkLoadStatusListener;

.field final synthetic aee:Lcom/kwad/components/offline/c/a/d;


# direct methods
.method constructor <init>(Lcom/kwad/components/offline/c/a/d;Lcom/kwad/components/offline/api/tk/IOfflineApkLoadStatusListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/offline/c/a/d$1;->aee:Lcom/kwad/components/offline/c/a/d;

    iput-object p2, p0, Lcom/kwad/components/offline/c/a/d$1;->aed:Lcom/kwad/components/offline/api/tk/IOfflineApkLoadStatusListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDownloadFailed()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/offline/c/a/d$1;->aed:Lcom/kwad/components/offline/api/tk/IOfflineApkLoadStatusListener;

    invoke-interface {v0}, Lcom/kwad/components/offline/api/tk/IOfflineApkLoadStatusListener;->onDownloadFailed()V

    return-void
.end method

.method public final onDownloadFinished()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/offline/c/a/d$1;->aed:Lcom/kwad/components/offline/api/tk/IOfflineApkLoadStatusListener;

    invoke-interface {v0}, Lcom/kwad/components/offline/api/tk/IOfflineApkLoadStatusListener;->onDownloadFinished()V

    return-void
.end method

.method public final onDownloadStarted()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/offline/c/a/d$1;->aed:Lcom/kwad/components/offline/api/tk/IOfflineApkLoadStatusListener;

    invoke-interface {v0}, Lcom/kwad/components/offline/api/tk/IOfflineApkLoadStatusListener;->onDownloadStarted()V

    return-void
.end method

.method public final onIdle()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/offline/c/a/d$1;->aed:Lcom/kwad/components/offline/api/tk/IOfflineApkLoadStatusListener;

    invoke-interface {v0}, Lcom/kwad/components/offline/api/tk/IOfflineApkLoadStatusListener;->onIdle()V

    return-void
.end method

.method public final onInstalled()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/offline/c/a/d$1;->aed:Lcom/kwad/components/offline/api/tk/IOfflineApkLoadStatusListener;

    invoke-interface {v0}, Lcom/kwad/components/offline/api/tk/IOfflineApkLoadStatusListener;->onInstalled()V

    return-void
.end method

.method public final onPaused(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/offline/c/a/d$1;->aed:Lcom/kwad/components/offline/api/tk/IOfflineApkLoadStatusListener;

    invoke-interface {v0, p1}, Lcom/kwad/components/offline/api/tk/IOfflineApkLoadStatusListener;->onPaused(I)V

    return-void
.end method

.method public final onProgressUpdate(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/offline/c/a/d$1;->aed:Lcom/kwad/components/offline/api/tk/IOfflineApkLoadStatusListener;

    invoke-interface {v0, p1}, Lcom/kwad/components/offline/api/tk/IOfflineApkLoadStatusListener;->onProgressUpdate(I)V

    return-void
.end method
