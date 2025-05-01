.class final Lcom/kwad/components/core/webview/jshandler/aq$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/webview/jshandler/aq;->a(Ljava/lang/String;Lcom/kwad/sdk/core/webview/c/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Yv:Lcom/kwad/components/core/webview/jshandler/aq$a;

.field final synthetic Yw:Lcom/kwad/components/core/webview/jshandler/aq;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/webview/jshandler/aq;Lcom/kwad/components/core/webview/jshandler/aq$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/webview/jshandler/aq$1;->Yw:Lcom/kwad/components/core/webview/jshandler/aq;

    iput-object p2, p0, Lcom/kwad/components/core/webview/jshandler/aq$1;->Yv:Lcom/kwad/components/core/webview/jshandler/aq$a;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/aq$1;->Yw:Lcom/kwad/components/core/webview/jshandler/aq;

    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/aq$1;->Yv:Lcom/kwad/components/core/webview/jshandler/aq$a;

    invoke-static {v0, v1}, Lcom/kwad/components/core/webview/jshandler/aq;->a(Lcom/kwad/components/core/webview/jshandler/aq;Lcom/kwad/components/core/webview/jshandler/aq$a;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/aq$1;->Yw:Lcom/kwad/components/core/webview/jshandler/aq;

    invoke-static {v0}, Lcom/kwad/components/core/webview/jshandler/aq;->a(Lcom/kwad/components/core/webview/jshandler/aq;)Lcom/kwad/sdk/core/webview/c/c;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/aq$1;->Yw:Lcom/kwad/components/core/webview/jshandler/aq;

    invoke-static {v0}, Lcom/kwad/components/core/webview/jshandler/aq;->a(Lcom/kwad/components/core/webview/jshandler/aq;)Lcom/kwad/sdk/core/webview/c/c;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/kwad/sdk/core/webview/c/c;->a(Lcom/kwad/sdk/core/b;)V

    :cond_0
    return-void
.end method
