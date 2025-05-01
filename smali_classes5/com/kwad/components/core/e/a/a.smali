.class public final Lcom/kwad/components/core/e/a/a;
.super Lcom/kwad/sdk/mvp/a;
.source "SourceFile"


# instance fields
.field public Ki:Lcom/kwad/components/core/e/a/g;

.field public Kj:Lcom/kwad/components/core/widget/a/b;

.field public Kk:Lcom/kwad/components/core/e/a/d;

.field public cQ:Lcom/kwad/components/core/webview/jshandler/aw;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/mvp/a;-><init>()V

    return-void
.end method


# virtual methods
.method public final bv()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/e/a/a;->cQ:Lcom/kwad/components/core/webview/jshandler/aw;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sV()V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/e/a/a;->cQ:Lcom/kwad/components/core/webview/jshandler/aw;

    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sW()V

    :cond_0
    return-void
.end method

.method public final cR()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/e/a/a;->cQ:Lcom/kwad/components/core/webview/jshandler/aw;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sX()V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/e/a/a;->cQ:Lcom/kwad/components/core/webview/jshandler/aw;

    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sY()V

    :cond_0
    return-void
.end method

.method public final release()V
    .locals 0

    return-void
.end method
