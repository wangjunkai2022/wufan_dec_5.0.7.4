.class final Lcom/kwad/components/core/webview/jshandler/aa$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/webview/jshandler/aa;->a(Ljava/lang/String;Lcom/kwad/sdk/core/webview/c/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Xi:Lcom/kwad/sdk/core/webview/d/b/a;

.field final synthetic Xr:Lcom/kwad/components/core/webview/jshandler/aa;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/webview/jshandler/aa;Lcom/kwad/sdk/core/webview/d/b/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/webview/jshandler/aa$1;->Xr:Lcom/kwad/components/core/webview/jshandler/aa;

    iput-object p2, p0, Lcom/kwad/components/core/webview/jshandler/aa$1;->Xi:Lcom/kwad/sdk/core/webview/d/b/a;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/aa$1;->Xr:Lcom/kwad/components/core/webview/jshandler/aa;

    invoke-static {v0}, Lcom/kwad/components/core/webview/jshandler/aa;->a(Lcom/kwad/components/core/webview/jshandler/aa;)Lcom/kwad/sdk/core/webview/b;

    move-result-object v0

    iget-boolean v0, v0, Lcom/kwad/sdk/core/webview/b;->aEZ:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/aa$1;->Xi:Lcom/kwad/sdk/core/webview/d/b/a;

    iget-boolean v0, v0, Lcom/kwad/sdk/core/webview/d/b/a;->Yl:Z

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/aa$1;->Xr:Lcom/kwad/components/core/webview/jshandler/aa;

    invoke-static {v0}, Lcom/kwad/components/core/webview/jshandler/aa;->a(Lcom/kwad/components/core/webview/jshandler/aa;)Lcom/kwad/sdk/core/webview/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/sdk/core/webview/b;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/aa$1;->Xr:Lcom/kwad/components/core/webview/jshandler/aa;

    invoke-static {v0}, Lcom/kwad/components/core/webview/jshandler/aa;->a(Lcom/kwad/components/core/webview/jshandler/aa;)Lcom/kwad/sdk/core/webview/b;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/sdk/core/webview/b;->Ph:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/aa$1;->Xr:Lcom/kwad/components/core/webview/jshandler/aa;

    .line 4
    invoke-static {v0}, Lcom/kwad/components/core/webview/jshandler/aa;->a(Lcom/kwad/components/core/webview/jshandler/aa;)Lcom/kwad/sdk/core/webview/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/sdk/core/webview/b;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v2

    new-instance v3, Lcom/kwad/components/core/webview/jshandler/aa$1$1;

    invoke-direct {v3, p0}, Lcom/kwad/components/core/webview/jshandler/aa$1$1;-><init>(Lcom/kwad/components/core/webview/jshandler/aa$1;)V

    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/aa$1;->Xr:Lcom/kwad/components/core/webview/jshandler/aa;

    .line 5
    invoke-static {v0}, Lcom/kwad/components/core/webview/jshandler/aa;->c(Lcom/kwad/components/core/webview/jshandler/aa;)Lcom/kwad/components/core/e/d/c;

    move-result-object v4

    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/aa$1;->Xi:Lcom/kwad/sdk/core/webview/d/b/a;

    iget-boolean v5, v0, Lcom/kwad/sdk/core/webview/d/b/a;->Yl:Z

    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/aa$1;->Xr:Lcom/kwad/components/core/webview/jshandler/aa;

    .line 6
    invoke-static {v0}, Lcom/kwad/components/core/webview/jshandler/aa;->d(Lcom/kwad/components/core/webview/jshandler/aa;)Z

    move-result v6

    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/aa$1;->Xr:Lcom/kwad/components/core/webview/jshandler/aa;

    invoke-static {v0}, Lcom/kwad/components/core/webview/jshandler/aa;->e(Lcom/kwad/components/core/webview/jshandler/aa;)Z

    move-result v7

    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/aa$1;->Xr:Lcom/kwad/components/core/webview/jshandler/aa;

    invoke-static {v0}, Lcom/kwad/components/core/webview/jshandler/aa;->f(Lcom/kwad/components/core/webview/jshandler/aa;)Z

    move-result v8

    .line 7
    invoke-static/range {v1 .. v8}, Lcom/kwad/components/core/e/d/a;->a(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/core/e/d/a$b;Lcom/kwad/components/core/e/d/c;ZZZZ)I

    return-void
.end method
