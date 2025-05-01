.class final Lcom/kwad/components/core/webview/tachikoma/i$13;
.super Lcom/kwad/components/core/webview/tachikoma/a/c;
.source "SourceFile"


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
    iput-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/i$13;->aaa:Lcom/kwad/components/core/webview/tachikoma/i;

    invoke-direct {p0}, Lcom/kwad/components/core/webview/tachikoma/a/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final iY()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/components/core/webview/tachikoma/a/c;->iY()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i$13;->aaa:Lcom/kwad/components/core/webview/tachikoma/i;

    invoke-static {v0}, Lcom/kwad/components/core/webview/tachikoma/i;->p(Lcom/kwad/components/core/webview/tachikoma/i;)Lcom/kwad/components/core/webview/tachikoma/c/e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i$13;->aaa:Lcom/kwad/components/core/webview/tachikoma/i;

    invoke-static {v0}, Lcom/kwad/components/core/webview/tachikoma/i;->p(Lcom/kwad/components/core/webview/tachikoma/i;)Lcom/kwad/components/core/webview/tachikoma/c/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/core/proxy/g;->dismiss()V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i$13;->aaa:Lcom/kwad/components/core/webview/tachikoma/i;

    iget-object v0, v0, Lcom/kwad/components/core/webview/tachikoma/i;->Zu:Lcom/kwad/components/core/webview/tachikoma/j;

    if-eqz v0, :cond_1

    .line 5
    invoke-interface {v0}, Lcom/kwad/components/core/webview/tachikoma/j;->bG()V

    :cond_1
    return-void
.end method
