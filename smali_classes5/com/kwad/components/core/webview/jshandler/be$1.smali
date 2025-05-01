.class final Lcom/kwad/components/core/webview/jshandler/be$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/webview/jshandler/be;->a(Ljava/lang/String;Lcom/kwad/sdk/core/webview/c/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic YZ:Lcom/kwad/components/core/webview/jshandler/be;

.field final synthetic eK:I


# direct methods
.method constructor <init>(Lcom/kwad/components/core/webview/jshandler/be;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/webview/jshandler/be$1;->YZ:Lcom/kwad/components/core/webview/jshandler/be;

    iput p2, p0, Lcom/kwad/components/core/webview/jshandler/be$1;->eK:I

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/be$1;->YZ:Lcom/kwad/components/core/webview/jshandler/be;

    invoke-static {v0}, Lcom/kwad/components/core/webview/jshandler/be;->a(Lcom/kwad/components/core/webview/jshandler/be;)Lcom/kwad/components/core/webview/jshandler/be$b;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/be$1;->YZ:Lcom/kwad/components/core/webview/jshandler/be;

    invoke-static {v0}, Lcom/kwad/components/core/webview/jshandler/be;->a(Lcom/kwad/components/core/webview/jshandler/be;)Lcom/kwad/components/core/webview/jshandler/be$b;

    move-result-object v0

    iget v1, p0, Lcom/kwad/components/core/webview/jshandler/be$1;->eK:I

    invoke-interface {v0, v1}, Lcom/kwad/components/core/webview/jshandler/be$b;->Q(I)V

    :cond_0
    return-void
.end method
