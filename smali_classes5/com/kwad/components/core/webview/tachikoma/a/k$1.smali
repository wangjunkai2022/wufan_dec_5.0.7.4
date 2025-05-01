.class final Lcom/kwad/components/core/webview/tachikoma/a/k$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/core/webview/tachikoma/a/k$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/core/webview/tachikoma/a/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic aay:Lcom/kwad/components/core/webview/tachikoma/a/k;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/webview/tachikoma/a/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/a/k$1;->aay:Lcom/kwad/components/core/webview/tachikoma/a/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final L(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/a/k$1;->aay:Lcom/kwad/components/core/webview/tachikoma/a/k;

    invoke-static {v0}, Lcom/kwad/components/core/webview/tachikoma/a/k;->a(Lcom/kwad/components/core/webview/tachikoma/a/k;)Lcom/kwad/sdk/core/webview/c/c;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/components/core/webview/tachikoma/a/k$1$1;

    invoke-direct {v0, p0, p1, p2}, Lcom/kwad/components/core/webview/tachikoma/a/k$1$1;-><init>(Lcom/kwad/components/core/webview/tachikoma/a/k$1;J)V

    invoke-static {v0}, Lcom/kwad/sdk/utils/bo;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method
