.class public final Lcom/kwad/components/ad/reward/k/a/c;
.super Lcom/kwad/components/core/webview/tachikoma/c/c;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/ad/reward/k/a/e;


# instance fields
.field private xv:Lcom/kwad/components/ad/reward/k/a/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/webview/tachikoma/c/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/components/ad/reward/c/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/k/a/c;->xv:Lcom/kwad/components/ad/reward/k/a/a;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/kwad/components/ad/reward/k/a/a;->b(Lcom/kwad/components/ad/reward/c/b;)V

    :cond_0
    return-void
.end method

.method public final a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/b;)V
    .locals 1

    .line 6
    invoke-super {p0, p1, p2}, Lcom/kwad/components/core/webview/tachikoma/c/a;->a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/b;)V

    .line 7
    new-instance p2, Lcom/kwad/components/ad/reward/c/f;

    new-instance v0, Lcom/kwad/components/ad/reward/k/a/c$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/k/a/c$1;-><init>(Lcom/kwad/components/ad/reward/k/a/c;)V

    invoke-direct {p2, v0}, Lcom/kwad/components/ad/reward/c/f;-><init>(Lcom/kwad/components/ad/reward/c/d;)V

    invoke-interface {p1, p2}, Lcom/kwad/sdk/components/r;->c(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 8
    new-instance p2, Lcom/kwad/components/core/webview/jshandler/h;

    new-instance v0, Lcom/kwad/components/ad/reward/k/a/c$2;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/k/a/c$2;-><init>(Lcom/kwad/components/ad/reward/k/a/c;)V

    invoke-direct {p2, v0}, Lcom/kwad/components/core/webview/jshandler/h;-><init>(Lcom/kwad/components/core/webview/jshandler/n;)V

    invoke-interface {p1, p2}, Lcom/kwad/sdk/components/r;->c(Lcom/kwad/sdk/core/webview/c/a;)V

    return-void
.end method

.method public final a(Lcom/kwad/sdk/core/webview/d/b/a;)V
    .locals 0
    .param p1    # Lcom/kwad/sdk/core/webview/d/b/a;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 3
    invoke-super {p0, p1}, Lcom/kwad/components/core/webview/tachikoma/c/a;->a(Lcom/kwad/sdk/core/webview/d/b/a;)V

    .line 4
    iget-object p1, p0, Lcom/kwad/components/ad/reward/k/a/c;->xv:Lcom/kwad/components/ad/reward/k/a/a;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/k/a/a;->jj()Lcom/kwad/components/ad/reward/g;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 5
    iget-object p1, p0, Lcom/kwad/components/ad/reward/k/a/c;->xv:Lcom/kwad/components/ad/reward/k/a/a;

    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/k/a/a;->jj()Lcom/kwad/components/ad/reward/g;

    move-result-object p1

    iget-object p1, p1, Lcom/kwad/components/ad/reward/g;->oJ:Lcom/kwad/components/ad/reward/e/b;

    invoke-interface {p1}, Lcom/kwad/components/ad/reward/e/b;->bJ()V

    :cond_0
    return-void
.end method

.method public final hO()Lcom/kwad/components/core/webview/tachikoma/i;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/a;->abk:Lcom/kwad/components/core/webview/tachikoma/c/b;

    check-cast v0, Lcom/kwad/components/ad/reward/k/a/a;

    iput-object v0, p0, Lcom/kwad/components/ad/reward/k/a/c;->xv:Lcom/kwad/components/ad/reward/k/a/a;

    .line 2
    new-instance v0, Lcom/kwad/components/ad/reward/k/a/d;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/k/a/c;->xv:Lcom/kwad/components/ad/reward/k/a/a;

    invoke-virtual {v1}, Lcom/kwad/components/ad/reward/k/a/a;->jj()Lcom/kwad/components/ad/reward/g;

    move-result-object v1

    iget-object v2, p0, Lcom/kwad/components/ad/reward/k/a/c;->xv:Lcom/kwad/components/ad/reward/k/a/a;

    iget-wide v2, v2, Lcom/kwad/components/core/webview/tachikoma/c/b;->xt:J

    .line 3
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/kwad/components/ad/reward/k/a/d;-><init>(Lcom/kwad/components/ad/reward/g;JLandroid/content/Context;)V

    return-object v0
.end method
