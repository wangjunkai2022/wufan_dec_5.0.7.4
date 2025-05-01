.class final Lcom/kwad/sdk/core/webview/b/a$5;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/sdk/core/webview/b/a;->b(Lcom/kwad/sdk/g/a/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic aFA:Lcom/kwad/sdk/core/webview/b/a;

.field final synthetic aFB:Lcom/kwad/sdk/g/a/b;


# direct methods
.method constructor <init>(Lcom/kwad/sdk/core/webview/b/a;Lcom/kwad/sdk/g/a/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/core/webview/b/a$5;->aFA:Lcom/kwad/sdk/core/webview/b/a;

    iput-object p2, p0, Lcom/kwad/sdk/core/webview/b/a$5;->aFB:Lcom/kwad/sdk/g/a/b;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/webview/b/a$5;->aFB:Lcom/kwad/sdk/g/a/b;

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Lcom/kwad/sdk/core/webview/b/a$5;->aFA:Lcom/kwad/sdk/core/webview/b/a;

    invoke-static {v1, v0}, Lcom/kwad/sdk/core/webview/b/a;->a(Lcom/kwad/sdk/core/webview/b/a;Lcom/kwad/sdk/g/a/b;)V

    :cond_0
    return-void
.end method
