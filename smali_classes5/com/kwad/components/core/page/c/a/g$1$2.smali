.class final Lcom/kwad/components/core/page/c/a/g$1$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/core/urlReplace/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/page/c/a/g$1;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic PR:Ljava/lang/Object;

.field final synthetic PT:Lcom/kwad/sdk/core/webview/a/c$a;

.field final synthetic PU:Lcom/kwad/components/core/page/c/a/g$1;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/page/c/a/g$1;Ljava/lang/Object;Lcom/kwad/sdk/core/webview/a/c$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/page/c/a/g$1$2;->PU:Lcom/kwad/components/core/page/c/a/g$1;

    iput-object p2, p0, Lcom/kwad/components/core/page/c/a/g$1$2;->PR:Ljava/lang/Object;

    iput-object p3, p0, Lcom/kwad/components/core/page/c/a/g$1$2;->PT:Lcom/kwad/sdk/core/webview/a/c$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onSuccess(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/page/c/a/g$1$2;->PR:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/kwad/components/core/page/c/a/g$1$2;->PU:Lcom/kwad/components/core/page/c/a/g$1;

    iget-object v1, v1, Lcom/kwad/components/core/page/c/a/g$1;->PQ:Lcom/kwad/components/core/page/c/a/g;

    invoke-static {v1, p1}, Lcom/kwad/components/core/page/c/a/g;->a(Lcom/kwad/components/core/page/c/a/g;Ljava/lang/String;)Ljava/lang/String;

    .line 3
    iget-object p1, p0, Lcom/kwad/components/core/page/c/a/g$1$2;->PU:Lcom/kwad/components/core/page/c/a/g$1;

    iget-object p1, p1, Lcom/kwad/components/core/page/c/a/g$1;->PQ:Lcom/kwad/components/core/page/c/a/g;

    invoke-static {p1}, Lcom/kwad/components/core/page/c/a/g;->c(Lcom/kwad/components/core/page/c/a/g;)Ljava/lang/Runnable;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 4
    invoke-static {}, Lcom/kwad/components/core/page/c/a/g;->qe()Landroid/os/Handler;

    move-result-object p1

    iget-object v1, p0, Lcom/kwad/components/core/page/c/a/g$1$2;->PU:Lcom/kwad/components/core/page/c/a/g$1;

    iget-object v1, v1, Lcom/kwad/components/core/page/c/a/g$1;->PQ:Lcom/kwad/components/core/page/c/a/g;

    invoke-static {v1}, Lcom/kwad/components/core/page/c/a/g;->c(Lcom/kwad/components/core/page/c/a/g;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/core/page/c/a/g$1$2;->PT:Lcom/kwad/sdk/core/webview/a/c$a;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/kwad/sdk/core/webview/a/c$a;->HF()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/kwad/components/core/page/c/a/g$1$2;->PT:Lcom/kwad/sdk/core/webview/a/c$a;

    .line 6
    invoke-virtual {p1}, Lcom/kwad/sdk/core/webview/a/c$a;->HB()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 7
    iget-object p1, p0, Lcom/kwad/components/core/page/c/a/g$1$2;->PT:Lcom/kwad/sdk/core/webview/a/c$a;

    iget-object v1, p0, Lcom/kwad/components/core/page/c/a/g$1$2;->PU:Lcom/kwad/components/core/page/c/a/g$1;

    iget-object v1, v1, Lcom/kwad/components/core/page/c/a/g$1;->PQ:Lcom/kwad/components/core/page/c/a/g;

    invoke-static {v1}, Lcom/kwad/components/core/page/c/a/g;->b(Lcom/kwad/components/core/page/c/a/g;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/kwad/sdk/core/webview/a/c;->a(Lcom/kwad/sdk/core/webview/a/c$a;Ljava/lang/String;)I

    move-result p1

    const/4 v1, 0x1

    if-ne p1, v1, :cond_1

    .line 8
    iget-object p1, p0, Lcom/kwad/components/core/page/c/a/g$1$2;->PU:Lcom/kwad/components/core/page/c/a/g$1;

    iget-object p1, p1, Lcom/kwad/components/core/page/c/a/g$1;->PQ:Lcom/kwad/components/core/page/c/a/g;

    iget-object p1, p1, Lcom/kwad/components/core/page/c/a/g;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {p1, v1}, Lcom/kwad/sdk/core/adlog/c;->g(Lcom/kwad/sdk/core/response/model/AdTemplate;Z)V

    goto :goto_0

    .line 9
    :cond_1
    iget-object p1, p0, Lcom/kwad/components/core/page/c/a/g$1$2;->PU:Lcom/kwad/components/core/page/c/a/g$1;

    iget-object p1, p1, Lcom/kwad/components/core/page/c/a/g$1;->PQ:Lcom/kwad/components/core/page/c/a/g;

    iget-object p1, p1, Lcom/kwad/components/core/page/c/a/g;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {p1, v1}, Lcom/kwad/sdk/core/adlog/c;->h(Lcom/kwad/sdk/core/response/model/AdTemplate;Z)V

    goto :goto_0

    :cond_2
    const-string p1, "LandPageWebViewLoadPresenter"

    const-string v1, "deeplink unable"

    .line 10
    invoke-static {p1, v1}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
