.class final Lcom/kwad/components/core/webview/tachikoma/i$24$1;
.super Lcom/kwad/sdk/core/download/a/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/webview/tachikoma/i$24;->a(Lcom/kwad/sdk/components/h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic aaq:Lcom/kwad/sdk/components/h;

.field final synthetic aar:Lcom/kwad/components/core/webview/tachikoma/i$24;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/webview/tachikoma/i$24;Lcom/kwad/sdk/components/h;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/i$24$1;->aar:Lcom/kwad/components/core/webview/tachikoma/i$24;

    iput-object p2, p0, Lcom/kwad/components/core/webview/tachikoma/i$24$1;->aaq:Lcom/kwad/sdk/components/h;

    invoke-direct {p0}, Lcom/kwad/sdk/core/download/a/a;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDownloadFailed()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i$24$1;->aaq:Lcom/kwad/sdk/components/h;

    invoke-interface {v0}, Lcom/kwad/sdk/components/h;->onDownloadFailed()V

    return-void
.end method

.method public final onDownloadFinished()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i$24$1;->aaq:Lcom/kwad/sdk/components/h;

    invoke-interface {v0}, Lcom/kwad/sdk/components/h;->onDownloadFinished()V

    return-void
.end method

.method public final onDownloadStarted()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i$24$1;->aaq:Lcom/kwad/sdk/components/h;

    invoke-interface {v0}, Lcom/kwad/sdk/components/h;->onDownloadStarted()V

    return-void
.end method

.method public final onIdle()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i$24$1;->aaq:Lcom/kwad/sdk/components/h;

    invoke-interface {v0}, Lcom/kwad/sdk/components/h;->onIdle()V

    return-void
.end method

.method public final onInstalled()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i$24$1;->aaq:Lcom/kwad/sdk/components/h;

    invoke-interface {v0}, Lcom/kwad/sdk/components/h;->onInstalled()V

    return-void
.end method

.method public final onPaused(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i$24$1;->aaq:Lcom/kwad/sdk/components/h;

    invoke-interface {v0, p1}, Lcom/kwad/sdk/components/h;->onPaused(I)V

    return-void
.end method

.method public final onProgressUpdate(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i$24$1;->aaq:Lcom/kwad/sdk/components/h;

    invoke-interface {v0, p1}, Lcom/kwad/sdk/components/h;->onProgressUpdate(I)V

    return-void
.end method
