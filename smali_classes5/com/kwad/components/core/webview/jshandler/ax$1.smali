.class final Lcom/kwad/components/core/webview/jshandler/ax$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/webview/jshandler/ax;->a(Ljava/lang/String;Lcom/kwad/sdk/core/webview/c/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic YF:Lcom/kwad/components/core/webview/jshandler/ax;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/webview/jshandler/ax;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/webview/jshandler/ax$1;->YF:Lcom/kwad/components/core/webview/jshandler/ax;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/ax$1;->YF:Lcom/kwad/components/core/webview/jshandler/ax;

    invoke-static {v0}, Lcom/kwad/components/core/webview/jshandler/ax;->b(Lcom/kwad/components/core/webview/jshandler/ax;)Lcom/kwad/components/core/webview/jshandler/ax$c;

    move-result-object v0

    new-instance v1, Lcom/kwad/components/core/webview/jshandler/ax$b;

    iget-object v2, p0, Lcom/kwad/components/core/webview/jshandler/ax$1;->YF:Lcom/kwad/components/core/webview/jshandler/ax;

    .line 2
    invoke-static {v2}, Lcom/kwad/components/core/webview/jshandler/ax;->a(Lcom/kwad/components/core/webview/jshandler/ax;)Lcom/kwad/sdk/core/webview/c/c;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/kwad/components/core/webview/jshandler/ax$b;-><init>(Lcom/kwad/sdk/core/webview/c/c;)V

    .line 3
    invoke-interface {v0, v1}, Lcom/kwad/components/core/webview/jshandler/ax$c;->a(Lcom/kwad/components/core/webview/jshandler/ax$b;)V

    return-void
.end method
