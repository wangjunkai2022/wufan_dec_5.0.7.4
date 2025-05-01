.class final Lcom/kwad/components/core/webview/jshandler/v$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/webview/jshandler/v;->a(Ljava/lang/String;Lcom/kwad/sdk/core/webview/c/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic WZ:Lcom/kwad/components/core/webview/tachikoma/b/x;

.field final synthetic Xa:Lcom/kwad/components/core/webview/jshandler/v;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/webview/jshandler/v;Lcom/kwad/components/core/webview/tachikoma/b/x;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/webview/jshandler/v$1;->Xa:Lcom/kwad/components/core/webview/jshandler/v;

    iput-object p2, p0, Lcom/kwad/components/core/webview/jshandler/v$1;->WZ:Lcom/kwad/components/core/webview/tachikoma/b/x;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/v$1;->WZ:Lcom/kwad/components/core/webview/tachikoma/b/x;

    invoke-virtual {v0}, Lcom/kwad/components/core/webview/tachikoma/b/x;->tv()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/v$1;->Xa:Lcom/kwad/components/core/webview/jshandler/v;

    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/v$1;->WZ:Lcom/kwad/components/core/webview/tachikoma/b/x;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/webview/jshandler/v;->a(Lcom/kwad/components/core/webview/tachikoma/b/x;)V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/v$1;->WZ:Lcom/kwad/components/core/webview/tachikoma/b/x;

    invoke-virtual {v0}, Lcom/kwad/components/core/webview/tachikoma/b/x;->tx()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/v$1;->Xa:Lcom/kwad/components/core/webview/jshandler/v;

    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/v$1;->WZ:Lcom/kwad/components/core/webview/tachikoma/b/x;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/webview/jshandler/v;->d(Lcom/kwad/components/core/webview/tachikoma/b/x;)V

    return-void

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/v$1;->WZ:Lcom/kwad/components/core/webview/tachikoma/b/x;

    invoke-virtual {v0}, Lcom/kwad/components/core/webview/tachikoma/b/x;->tw()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 6
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/v$1;->Xa:Lcom/kwad/components/core/webview/jshandler/v;

    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/v$1;->WZ:Lcom/kwad/components/core/webview/tachikoma/b/x;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/webview/jshandler/v;->c(Lcom/kwad/components/core/webview/tachikoma/b/x;)V

    return-void

    .line 7
    :cond_2
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/v$1;->WZ:Lcom/kwad/components/core/webview/tachikoma/b/x;

    invoke-virtual {v0}, Lcom/kwad/components/core/webview/tachikoma/b/x;->isFailed()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 8
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/v$1;->Xa:Lcom/kwad/components/core/webview/jshandler/v;

    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/v$1;->WZ:Lcom/kwad/components/core/webview/tachikoma/b/x;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/webview/jshandler/v;->b(Lcom/kwad/components/core/webview/tachikoma/b/x;)V

    :cond_3
    return-void
.end method
