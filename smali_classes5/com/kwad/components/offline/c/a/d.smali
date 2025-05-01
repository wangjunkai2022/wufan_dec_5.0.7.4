.class public final Lcom/kwad/components/offline/c/a/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/offline/api/tk/IOfflineApkLoader;


# instance fields
.field aec:Lcom/kwad/sdk/components/i;


# direct methods
.method public constructor <init>(Lcom/kwad/sdk/components/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kwad/components/offline/c/a/d;->aec:Lcom/kwad/sdk/components/i;

    return-void
.end method


# virtual methods
.method public final addLoadStatusListener(Lcom/kwad/components/offline/api/tk/IOfflineApkLoadStatusListener;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/offline/c/a/d;->aec:Lcom/kwad/sdk/components/i;

    new-instance v1, Lcom/kwad/components/offline/c/a/d$1;

    invoke-direct {v1, p0, p1}, Lcom/kwad/components/offline/c/a/d$1;-><init>(Lcom/kwad/components/offline/c/a/d;Lcom/kwad/components/offline/api/tk/IOfflineApkLoadStatusListener;)V

    invoke-interface {v0, v1}, Lcom/kwad/sdk/components/i;->a(Lcom/kwad/sdk/components/h;)V

    return-void
.end method

.method public final cancelDownload()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/offline/c/a/d;->aec:Lcom/kwad/sdk/components/i;

    invoke-interface {v0}, Lcom/kwad/sdk/components/i;->cancelDownload()V

    return-void
.end method

.method public final clearFileCache()V
    .locals 0

    return-void
.end method

.method public final installApp()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/offline/c/a/d;->aec:Lcom/kwad/sdk/components/i;

    invoke-interface {v0}, Lcom/kwad/sdk/components/i;->installApp()V

    return-void
.end method

.method public final openApp()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/offline/c/a/d;->aec:Lcom/kwad/sdk/components/i;

    invoke-interface {v0}, Lcom/kwad/sdk/components/i;->openApp()V

    return-void
.end method

.method public final pauseDownload()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/offline/c/a/d;->aec:Lcom/kwad/sdk/components/i;

    invoke-interface {v0}, Lcom/kwad/sdk/components/i;->pauseDownload()V

    return-void
.end method

.method public final resumeDownload()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/offline/c/a/d;->aec:Lcom/kwad/sdk/components/i;

    invoke-interface {v0}, Lcom/kwad/sdk/components/i;->resumeDownload()V

    return-void
.end method

.method public final setCustomReportParam(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/offline/c/a/d;->aec:Lcom/kwad/sdk/components/i;

    invoke-interface {v0, p1}, Lcom/kwad/sdk/components/i;->setCustomReportParam(Ljava/lang/String;)V

    return-void
.end method

.method public final startDownload()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/offline/c/a/d;->aec:Lcom/kwad/sdk/components/i;

    invoke-interface {v0}, Lcom/kwad/sdk/components/i;->startDownload()V

    return-void
.end method

.method public final stopDownload()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/offline/c/a/d;->aec:Lcom/kwad/sdk/components/i;

    invoke-interface {v0}, Lcom/kwad/sdk/components/i;->stopDownload()V

    return-void
.end method

.method public final uninstallApp()V
    .locals 0

    return-void
.end method
