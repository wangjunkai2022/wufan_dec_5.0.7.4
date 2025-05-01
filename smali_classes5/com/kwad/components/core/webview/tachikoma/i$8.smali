.class final Lcom/kwad/components/core/webview/tachikoma/i$8;
.super Lcom/kwad/sdk/core/download/d;
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
.field final synthetic Wq:Lcom/kwad/components/core/webview/tachikoma/a/l;

.field final synthetic aaa:Lcom/kwad/components/core/webview/tachikoma/i;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/webview/tachikoma/i;Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/core/webview/tachikoma/a/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/i$8;->aaa:Lcom/kwad/components/core/webview/tachikoma/i;

    iput-object p3, p0, Lcom/kwad/components/core/webview/tachikoma/i$8;->Wq:Lcom/kwad/components/core/webview/tachikoma/a/l;

    invoke-direct {p0, p2}, Lcom/kwad/sdk/core/download/d;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/String;Ljava/lang/String;Lcom/kwad/sdk/core/download/e;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/kwad/sdk/core/download/d;->b(Ljava/lang/String;Ljava/lang/String;Lcom/kwad/sdk/core/download/e;)V

    .line 2
    new-instance p1, Lcom/kwad/components/core/webview/tachikoma/b/b;

    invoke-direct {p1}, Lcom/kwad/components/core/webview/tachikoma/b/b;-><init>()V

    const/4 p2, 0x1

    .line 3
    iput p2, p1, Lcom/kwad/components/core/webview/tachikoma/b/b;->aaR:I

    .line 4
    iget-object p2, p0, Lcom/kwad/components/core/webview/tachikoma/i$8;->Wq:Lcom/kwad/components/core/webview/tachikoma/a/l;

    invoke-virtual {p2, p1}, Lcom/kwad/components/core/webview/tachikoma/a/l;->a(Lcom/kwad/components/core/webview/tachikoma/b/b;)V

    return-void
.end method
