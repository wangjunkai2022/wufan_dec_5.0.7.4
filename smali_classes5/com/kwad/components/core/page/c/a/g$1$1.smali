.class final Lcom/kwad/components/core/page/c/a/g$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


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

.field final synthetic PS:Lcom/kwad/components/core/urlReplace/c;

.field final synthetic PT:Lcom/kwad/sdk/core/webview/a/c$a;

.field final synthetic PU:Lcom/kwad/components/core/page/c/a/g$1;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/page/c/a/g$1;Ljava/lang/Object;Lcom/kwad/components/core/urlReplace/c;Lcom/kwad/sdk/core/webview/a/c$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/page/c/a/g$1$1;->PU:Lcom/kwad/components/core/page/c/a/g$1;

    iput-object p2, p0, Lcom/kwad/components/core/page/c/a/g$1$1;->PR:Ljava/lang/Object;

    iput-object p3, p0, Lcom/kwad/components/core/page/c/a/g$1$1;->PS:Lcom/kwad/components/core/urlReplace/c;

    iput-object p4, p0, Lcom/kwad/components/core/page/c/a/g$1$1;->PT:Lcom/kwad/sdk/core/webview/a/c$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/page/c/a/g$1$1;->PR:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/kwad/components/core/page/c/a/g$1$1;->PS:Lcom/kwad/components/core/urlReplace/c;

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v1}, Lcom/kwad/components/core/urlReplace/c;->ry()V

    .line 4
    :cond_0
    iget-object v1, p0, Lcom/kwad/components/core/page/c/a/g$1$1;->PT:Lcom/kwad/sdk/core/webview/a/c$a;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/kwad/sdk/core/webview/a/c$a;->HF()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/kwad/components/core/page/c/a/g$1$1;->PT:Lcom/kwad/sdk/core/webview/a/c$a;

    .line 5
    invoke-virtual {v1}, Lcom/kwad/sdk/core/webview/a/c$a;->HB()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 6
    iget-object v1, p0, Lcom/kwad/components/core/page/c/a/g$1$1;->PT:Lcom/kwad/sdk/core/webview/a/c$a;

    iget-object v2, p0, Lcom/kwad/components/core/page/c/a/g$1$1;->PU:Lcom/kwad/components/core/page/c/a/g$1;

    iget-object v2, v2, Lcom/kwad/components/core/page/c/a/g$1;->PQ:Lcom/kwad/components/core/page/c/a/g;

    invoke-static {v2}, Lcom/kwad/components/core/page/c/a/g;->b(Lcom/kwad/components/core/page/c/a/g;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/kwad/sdk/core/webview/a/c;->a(Lcom/kwad/sdk/core/webview/a/c$a;Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v1, v2, :cond_1

    .line 7
    iget-object v1, p0, Lcom/kwad/components/core/page/c/a/g$1$1;->PU:Lcom/kwad/components/core/page/c/a/g$1;

    iget-object v1, v1, Lcom/kwad/components/core/page/c/a/g$1;->PQ:Lcom/kwad/components/core/page/c/a/g;

    iget-object v1, v1, Lcom/kwad/components/core/page/c/a/g;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v1, v3}, Lcom/kwad/sdk/core/adlog/c;->g(Lcom/kwad/sdk/core/response/model/AdTemplate;Z)V

    goto :goto_0

    .line 8
    :cond_1
    iget-object v1, p0, Lcom/kwad/components/core/page/c/a/g$1$1;->PU:Lcom/kwad/components/core/page/c/a/g$1;

    iget-object v1, v1, Lcom/kwad/components/core/page/c/a/g$1;->PQ:Lcom/kwad/components/core/page/c/a/g;

    iget-object v1, v1, Lcom/kwad/components/core/page/c/a/g;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v1, v3}, Lcom/kwad/sdk/core/adlog/c;->h(Lcom/kwad/sdk/core/response/model/AdTemplate;Z)V

    goto :goto_0

    :cond_2
    const-string v1, "LandPageWebViewLoadPresenter"

    const-string v2, "deeplink unable"

    .line 9
    invoke-static {v1, v2}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
