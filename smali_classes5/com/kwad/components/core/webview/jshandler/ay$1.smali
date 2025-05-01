.class final Lcom/kwad/components/core/webview/jshandler/ay$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/webview/jshandler/ay;->a(Ljava/lang/String;Lcom/kwad/sdk/core/webview/c/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic WU:Lcom/kwad/sdk/core/webview/c/c;

.field final synthetic YI:Lcom/kwad/components/core/webview/jshandler/ay;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/webview/jshandler/ay;Lcom/kwad/sdk/core/webview/c/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/webview/jshandler/ay$1;->YI:Lcom/kwad/components/core/webview/jshandler/ay;

    iput-object p2, p0, Lcom/kwad/components/core/webview/jshandler/ay$1;->WU:Lcom/kwad/sdk/core/webview/c/c;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/ay$1;->YI:Lcom/kwad/components/core/webview/jshandler/ay;

    invoke-static {v0}, Lcom/kwad/components/core/webview/jshandler/ay;->a(Lcom/kwad/components/core/webview/jshandler/ay;)Lcom/kwad/components/core/webview/jshandler/ay$a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/ay$1;->YI:Lcom/kwad/components/core/webview/jshandler/ay;

    invoke-static {v0}, Lcom/kwad/components/core/webview/jshandler/ay;->a(Lcom/kwad/components/core/webview/jshandler/ay;)Lcom/kwad/components/core/webview/jshandler/ay$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/kwad/components/core/webview/jshandler/ay$a;->bB()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/ay$1;->WU:Lcom/kwad/sdk/core/webview/c/c;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/kwad/sdk/core/webview/c/c;->a(Lcom/kwad/sdk/core/b;)V

    return-void
.end method
