.class final Lcom/kwad/components/core/webview/tachikoma/i$18;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/webview/tachikoma/i;->jq()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic aaa:Lcom/kwad/components/core/webview/tachikoma/i;

.field final synthetic aaf:Lcom/kwad/sdk/components/r;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/webview/tachikoma/i;Lcom/kwad/sdk/components/r;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/i$18;->aaa:Lcom/kwad/components/core/webview/tachikoma/i;

    iput-object p2, p0, Lcom/kwad/components/core/webview/tachikoma/i$18;->aaf:Lcom/kwad/sdk/components/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i$18;->aaf:Lcom/kwad/sdk/components/r;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/kwad/sdk/components/r;->onDestroy()V

    :cond_0
    return-void
.end method
