.class final Lcom/kwad/components/core/webview/tachikoma/i$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/core/webview/jshandler/aq$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/sdk/components/r;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic aaa:Lcom/kwad/components/core/webview/tachikoma/i;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/webview/tachikoma/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/i$6;->aaa:Lcom/kwad/components/core/webview/tachikoma/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/components/core/webview/jshandler/aq$a;)V
    .locals 10

    .line 1
    iget v0, p1, Lcom/kwad/components/core/webview/jshandler/aq$a;->status:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 2
    iget-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/i$6;->aaa:Lcom/kwad/components/core/webview/tachikoma/i;

    invoke-static {p1}, Lcom/kwad/components/core/webview/tachikoma/i;->i(Lcom/kwad/components/core/webview/tachikoma/i;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/i$6;->aaa:Lcom/kwad/components/core/webview/tachikoma/i;

    sget-object v0, Lcom/kwad/components/core/webview/tachikoma/TKRenderFailReason;->TK_FILE_LOAD_TIMEOUT:Lcom/kwad/components/core/webview/tachikoma/TKRenderFailReason;

    invoke-static {p1, v0}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/components/core/webview/tachikoma/i;Lcom/kwad/components/core/webview/tachikoma/TKRenderFailReason;)V

    return-void

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/i$6;->aaa:Lcom/kwad/components/core/webview/tachikoma/i;

    invoke-static {p1}, Lcom/kwad/components/core/webview/tachikoma/i;->j(Lcom/kwad/components/core/webview/tachikoma/i;)Ljava/lang/Runnable;

    move-result-object p1

    invoke-static {p1}, Lcom/kwad/sdk/utils/bo;->c(Ljava/lang/Runnable;)V

    .line 5
    iget-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/i$6;->aaa:Lcom/kwad/components/core/webview/tachikoma/i;

    invoke-static {p1}, Lcom/kwad/components/core/webview/tachikoma/i;->k(Lcom/kwad/components/core/webview/tachikoma/i;)V

    .line 6
    iget-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/i$6;->aaa:Lcom/kwad/components/core/webview/tachikoma/i;

    iget-object p1, p1, Lcom/kwad/components/core/webview/tachikoma/i;->Zu:Lcom/kwad/components/core/webview/tachikoma/j;

    if-eqz p1, :cond_3

    .line 7
    new-instance p1, Lcom/kwad/components/core/webview/tachikoma/i$6$1;

    invoke-direct {p1, p0}, Lcom/kwad/components/core/webview/tachikoma/i$6$1;-><init>(Lcom/kwad/components/core/webview/tachikoma/i$6;)V

    invoke-static {p1}, Lcom/kwad/sdk/utils/bo;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 8
    invoke-static {}, Lcom/kwad/components/core/webview/tachikoma/d/b;->tG()Lcom/kwad/components/core/webview/tachikoma/d/b;

    move-result-object v0

    iget-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/i$6;->aaa:Lcom/kwad/components/core/webview/tachikoma/i;

    iget-object p1, p1, Lcom/kwad/components/core/webview/tachikoma/i;->Zu:Lcom/kwad/components/core/webview/tachikoma/j;

    .line 9
    invoke-interface {p1}, Lcom/kwad/components/core/webview/tachikoma/j;->getTkTemplateId()Ljava/lang/String;

    move-result-object v1

    iget-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/i$6;->aaa:Lcom/kwad/components/core/webview/tachikoma/i;

    .line 10
    invoke-static {p1}, Lcom/kwad/components/core/webview/tachikoma/i;->l(Lcom/kwad/components/core/webview/tachikoma/i;)J

    move-result-wide v2

    iget-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/i$6;->aaa:Lcom/kwad/components/core/webview/tachikoma/i;

    invoke-static {p1}, Lcom/kwad/components/core/webview/tachikoma/i;->m(Lcom/kwad/components/core/webview/tachikoma/i;)J

    move-result-wide v4

    sub-long/2addr v2, v4

    iget-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/i$6;->aaa:Lcom/kwad/components/core/webview/tachikoma/i;

    invoke-static {p1}, Lcom/kwad/components/core/webview/tachikoma/i;->n(Lcom/kwad/components/core/webview/tachikoma/i;)J

    move-result-wide v4

    .line 11
    iget-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/i$6;->aaa:Lcom/kwad/components/core/webview/tachikoma/i;

    invoke-static {p1}, Lcom/kwad/components/core/webview/tachikoma/i;->o(Lcom/kwad/components/core/webview/tachikoma/i;)J

    move-result-wide v6

    const-wide/16 v8, 0x0

    cmp-long p1, v6, v8

    if-lez p1, :cond_1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    iget-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/i$6;->aaa:Lcom/kwad/components/core/webview/tachikoma/i;

    invoke-static {p1}, Lcom/kwad/components/core/webview/tachikoma/i;->o(Lcom/kwad/components/core/webview/tachikoma/i;)J

    move-result-wide v8

    sub-long/2addr v6, v8

    goto :goto_0

    :cond_1
    move-wide v6, v8

    .line 12
    :goto_0
    invoke-virtual/range {v0 .. v7}, Lcom/kwad/components/core/webview/tachikoma/d/b;->c(Ljava/lang/String;JJJ)V

    return-void

    .line 13
    :cond_2
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i$6;->aaa:Lcom/kwad/components/core/webview/tachikoma/i;

    sget-object v1, Lcom/kwad/components/core/webview/tachikoma/TKRenderFailReason;->RENDER_ERROR:Lcom/kwad/components/core/webview/tachikoma/TKRenderFailReason;

    invoke-static {v0, v1}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/components/core/webview/tachikoma/i;Lcom/kwad/components/core/webview/tachikoma/TKRenderFailReason;)V

    .line 14
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i$6;->aaa:Lcom/kwad/components/core/webview/tachikoma/i;

    iget-object p1, p1, Lcom/kwad/components/core/webview/jshandler/aq$a;->errorMsg:Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/kwad/components/core/webview/tachikoma/i;->b(Lcom/kwad/components/core/webview/tachikoma/i;Ljava/lang/String;)V

    :cond_3
    return-void
.end method
