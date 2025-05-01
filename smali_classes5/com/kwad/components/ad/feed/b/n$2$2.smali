.class final Lcom/kwad/components/ad/feed/b/n$2$2;
.super Lcom/kwad/components/core/webview/jshandler/v;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/feed/b/n$2;->a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic gs:Lcom/kwad/components/ad/feed/b/n$2;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/feed/b/n$2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/feed/b/n$2$2;->gs:Lcom/kwad/components/ad/feed/b/n$2;

    invoke-direct {p0}, Lcom/kwad/components/core/webview/jshandler/v;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/components/core/webview/tachikoma/b/x;)V
    .locals 9

    .line 1
    invoke-super {p0, p1}, Lcom/kwad/components/core/webview/jshandler/v;->a(Lcom/kwad/components/core/webview/tachikoma/b/x;)V

    .line 2
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/n$2$2;->gs:Lcom/kwad/components/ad/feed/b/n$2;

    iget-object p1, p1, Lcom/kwad/components/ad/feed/b/n$2;->gr:Lcom/kwad/components/ad/feed/b/n;

    invoke-static {p1}, Lcom/kwad/components/ad/feed/b/n;->i(Lcom/kwad/components/ad/feed/b/n;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/kwad/components/core/s/a;->as(Landroid/content/Context;)Lcom/kwad/components/core/s/a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/kwad/components/core/s/a;->rA()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/n$2$2;->gs:Lcom/kwad/components/ad/feed/b/n$2;

    iget-object p1, p1, Lcom/kwad/components/ad/feed/b/n$2;->gr:Lcom/kwad/components/ad/feed/b/n;

    invoke-static {p1}, Lcom/kwad/components/ad/feed/b/n;->j(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/components/core/webview/tachikoma/a/o;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 4
    new-instance p1, Lcom/kwad/components/core/webview/tachikoma/b/m;

    invoke-direct {p1}, Lcom/kwad/components/core/webview/tachikoma/b/m;-><init>()V

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p1, Lcom/kwad/components/core/webview/tachikoma/b/m;->aba:Z

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/n$2$2;->gs:Lcom/kwad/components/ad/feed/b/n$2;

    iget-object v0, v0, Lcom/kwad/components/ad/feed/b/n$2;->gr:Lcom/kwad/components/ad/feed/b/n;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/n;->j(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/components/core/webview/tachikoma/a/o;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/kwad/components/core/webview/tachikoma/a/o;->c(Lcom/kwad/components/core/webview/tachikoma/b/m;)V

    .line 7
    :cond_0
    invoke-static {}, Lcom/kwad/components/core/j/a;->pf()Lcom/kwad/components/core/j/a;

    move-result-object p1

    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/n$2$2;->gs:Lcom/kwad/components/ad/feed/b/n$2;

    iget-object v0, v0, Lcom/kwad/components/ad/feed/b/n$2;->gr:Lcom/kwad/components/ad/feed/b/n;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/n;->k(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/components/core/j/a$b;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/j/a;->a(Lcom/kwad/components/core/j/a$b;)V

    .line 8
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/n$2$2;->gs:Lcom/kwad/components/ad/feed/b/n$2;

    iget-object p1, p1, Lcom/kwad/components/ad/feed/b/n$2;->gr:Lcom/kwad/components/ad/feed/b/n;

    invoke-static {p1}, Lcom/kwad/components/ad/feed/b/n;->l(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x1

    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/n$2$2;->gs:Lcom/kwad/components/ad/feed/b/n$2;

    iget-object p1, p1, Lcom/kwad/components/ad/feed/b/n$2;->gr:Lcom/kwad/components/ad/feed/b/n;

    .line 9
    invoke-static {p1}, Lcom/kwad/components/ad/feed/b/n;->m(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object p1

    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->K(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    .line 10
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/n$2$2;->gs:Lcom/kwad/components/ad/feed/b/n$2;

    iget-object p1, p1, Lcom/kwad/components/ad/feed/b/n$2;->gr:Lcom/kwad/components/ad/feed/b/n;

    invoke-static {p1}, Lcom/kwad/components/ad/feed/b/n;->n(Lcom/kwad/components/ad/feed/b/n;)J

    move-result-wide v7

    sub-long/2addr v5, v7

    .line 11
    invoke-static/range {v0 .. v6}, Lcom/kwad/components/ad/feed/monitor/b;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;IILjava/lang/String;Ljava/lang/String;J)V

    return-void
.end method

.method public final b(Lcom/kwad/components/core/webview/tachikoma/b/x;)V
    .locals 8

    .line 1
    invoke-super {p0, p1}, Lcom/kwad/components/core/webview/jshandler/v;->b(Lcom/kwad/components/core/webview/tachikoma/b/x;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/n$2$2;->gs:Lcom/kwad/components/ad/feed/b/n$2;

    iget-object v0, v0, Lcom/kwad/components/ad/feed/b/n$2;->gr:Lcom/kwad/components/ad/feed/b/n;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/n;->o(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v1

    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/n$2$2;->gs:Lcom/kwad/components/ad/feed/b/n$2;

    iget-object v0, v0, Lcom/kwad/components/ad/feed/b/n$2;->gr:Lcom/kwad/components/ad/feed/b/n;

    .line 3
    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/n;->p(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->K(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p1, Lcom/kwad/components/core/webview/tachikoma/b/x;->errorReason:Ljava/lang/String;

    .line 4
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/n$2$2;->gs:Lcom/kwad/components/ad/feed/b/n$2;

    iget-object v0, v0, Lcom/kwad/components/ad/feed/b/n$2;->gr:Lcom/kwad/components/ad/feed/b/n;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/n;->n(Lcom/kwad/components/ad/feed/b/n;)J

    move-result-wide v6

    sub-long v6, v2, v6

    const/4 v2, 0x2

    const/4 v3, 0x1

    .line 5
    invoke-static/range {v1 .. v7}, Lcom/kwad/components/ad/feed/monitor/b;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;IILjava/lang/String;Ljava/lang/String;J)V

    .line 6
    invoke-static {}, Lcom/kwad/components/core/o/a;->qI()Lcom/kwad/components/core/o/a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/n$2$2;->gs:Lcom/kwad/components/ad/feed/b/n$2;

    iget-object v1, v1, Lcom/kwad/components/ad/feed/b/n$2;->gr:Lcom/kwad/components/ad/feed/b/n;

    invoke-static {v1}, Lcom/kwad/components/ad/feed/b/n;->q(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v1

    iget v2, p1, Lcom/kwad/components/core/webview/tachikoma/b/x;->errorCode:I

    invoke-virtual {p1}, Lcom/kwad/components/core/webview/tachikoma/b/x;->ty()I

    move-result p1

    invoke-virtual {v0, v1, v2, p1}, Lcom/kwad/components/core/o/a;->c(Lcom/kwad/sdk/core/response/model/AdTemplate;II)V

    return-void
.end method

.method public final c(Lcom/kwad/components/core/webview/tachikoma/b/x;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/kwad/components/core/webview/jshandler/v;->c(Lcom/kwad/components/core/webview/tachikoma/b/x;)V

    .line 2
    invoke-static {}, Lcom/kwad/components/core/j/a;->pf()Lcom/kwad/components/core/j/a;

    move-result-object p1

    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/n$2$2;->gs:Lcom/kwad/components/ad/feed/b/n$2;

    iget-object v0, v0, Lcom/kwad/components/ad/feed/b/n$2;->gr:Lcom/kwad/components/ad/feed/b/n;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/n;->r(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/components/core/j/a$b;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/j/a;->c(Lcom/kwad/components/core/j/a$b;)V

    return-void
.end method
