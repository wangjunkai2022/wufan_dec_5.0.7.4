.class final Lcom/kwad/components/ad/f/e$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/core/webview/jshandler/aq$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/ad/f/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic mK:Lcom/kwad/components/ad/f/e;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/f/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/f/e$10;->mK:Lcom/kwad/components/ad/f/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/components/core/webview/jshandler/aq$a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/f/e$10;->mK:Lcom/kwad/components/ad/f/e;

    iget p1, p1, Lcom/kwad/components/core/webview/jshandler/aq$a;->status:I

    invoke-static {v0, p1}, Lcom/kwad/components/ad/f/e;->a(Lcom/kwad/components/ad/f/e;I)I

    .line 2
    iget-object p1, p0, Lcom/kwad/components/ad/f/e$10;->mK:Lcom/kwad/components/ad/f/e;

    invoke-static {p1}, Lcom/kwad/components/ad/f/e;->g(Lcom/kwad/components/ad/f/e;)I

    move-result p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    .line 3
    iget-object p1, p0, Lcom/kwad/components/ad/f/e$10;->mK:Lcom/kwad/components/ad/f/e;

    invoke-static {p1}, Lcom/kwad/components/ad/f/e;->h(Lcom/kwad/components/ad/f/e;)Lcom/kwad/sdk/core/webview/KsAdWebView;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setVisibility(I)V

    return-void

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/ad/f/e$10;->mK:Lcom/kwad/components/ad/f/e;

    invoke-static {p1}, Lcom/kwad/components/ad/f/e;->h(Lcom/kwad/components/ad/f/e;)Lcom/kwad/sdk/core/webview/KsAdWebView;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setVisibility(I)V

    return-void
.end method
