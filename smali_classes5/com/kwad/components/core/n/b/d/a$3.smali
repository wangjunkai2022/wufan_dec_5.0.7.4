.class final Lcom/kwad/components/core/n/b/d/a$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/webview/KsAdWebView$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/n/b/d/a;->init(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Os:Lcom/kwad/components/core/n/b/d/a;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/n/b/d/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/n/b/d/a$3;->Os:Lcom/kwad/components/core/n/b/d/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPageFinished()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/d/a$3;->Os:Lcom/kwad/components/core/n/b/d/a;

    invoke-static {v0}, Lcom/kwad/components/core/n/b/d/a;->k(Lcom/kwad/components/core/n/b/d/a;)Lcom/kwad/components/offline/api/core/webview/BaseKsWebView$WebLoadListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/n/b/d/a$3;->Os:Lcom/kwad/components/core/n/b/d/a;

    invoke-static {v0}, Lcom/kwad/components/core/n/b/d/a;->l(Lcom/kwad/components/core/n/b/d/a;)Lcom/kwad/components/offline/api/core/webview/BaseKsWebView$WebLoadListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/kwad/components/offline/api/core/webview/BaseKsWebView$WebLoadListener;->onPageFinished()V

    :cond_0
    return-void
.end method

.method public final onPageStart()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/d/a$3;->Os:Lcom/kwad/components/core/n/b/d/a;

    invoke-static {v0}, Lcom/kwad/components/core/n/b/d/a;->i(Lcom/kwad/components/core/n/b/d/a;)Lcom/kwad/components/offline/api/core/webview/BaseKsWebView$WebLoadListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/n/b/d/a$3;->Os:Lcom/kwad/components/core/n/b/d/a;

    invoke-static {v0}, Lcom/kwad/components/core/n/b/d/a;->j(Lcom/kwad/components/core/n/b/d/a;)Lcom/kwad/components/offline/api/core/webview/BaseKsWebView$WebLoadListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/kwad/components/offline/api/core/webview/BaseKsWebView$WebLoadListener;->onPageStart()V

    :cond_0
    return-void
.end method

.method public final onReceivedHttpError(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/d/a$3;->Os:Lcom/kwad/components/core/n/b/d/a;

    invoke-static {v0}, Lcom/kwad/components/core/n/b/d/a;->g(Lcom/kwad/components/core/n/b/d/a;)Lcom/kwad/components/offline/api/core/webview/BaseKsWebView$WebLoadListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/n/b/d/a$3;->Os:Lcom/kwad/components/core/n/b/d/a;

    invoke-static {v0}, Lcom/kwad/components/core/n/b/d/a;->h(Lcom/kwad/components/core/n/b/d/a;)Lcom/kwad/components/offline/api/core/webview/BaseKsWebView$WebLoadListener;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lcom/kwad/components/offline/api/core/webview/BaseKsWebView$WebLoadListener;->onReceivedHttpError(ILjava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
