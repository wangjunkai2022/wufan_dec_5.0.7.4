.class final Lcom/kwad/components/core/webview/jshandler/bd$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/webview/jshandler/bd;->tb()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic YS:Lcom/kwad/components/core/webview/jshandler/bd;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/webview/jshandler/bd;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/webview/jshandler/bd$1;->YS:Lcom/kwad/components/core/webview/jshandler/bd;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/bd$1;->YS:Lcom/kwad/components/core/webview/jshandler/bd;

    invoke-static {v0}, Lcom/kwad/components/core/webview/jshandler/bd;->a(Lcom/kwad/components/core/webview/jshandler/bd;)Lcom/kwad/components/core/webview/jshandler/bd$a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/bd$1;->YS:Lcom/kwad/components/core/webview/jshandler/bd;

    invoke-static {v0}, Lcom/kwad/components/core/webview/jshandler/bd;->a(Lcom/kwad/components/core/webview/jshandler/bd;)Lcom/kwad/components/core/webview/jshandler/bd$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/kwad/components/core/webview/jshandler/bd$a;->sL()V

    :cond_0
    return-void
.end method
