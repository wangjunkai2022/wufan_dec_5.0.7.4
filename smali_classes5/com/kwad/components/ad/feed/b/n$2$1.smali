.class final Lcom/kwad/components/ad/feed/b/n$2$1;
.super Lcom/kwad/components/core/webview/tachikoma/a/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/feed/b/n$2;->a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic gs:Lcom/kwad/components/ad/feed/b/n$2;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/feed/b/n$2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/feed/b/n$2$1;->gs:Lcom/kwad/components/ad/feed/b/n$2;

    invoke-direct {p0}, Lcom/kwad/components/core/webview/tachikoma/a/n;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/kwad/sdk/core/webview/c/c;)V
    .locals 0
    .param p2    # Lcom/kwad/sdk/core/webview/c/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1, p2}, Lcom/kwad/components/core/webview/tachikoma/a/w;->a(Ljava/lang/String;Lcom/kwad/sdk/core/webview/c/c;)V

    .line 2
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/n$2$1;->gs:Lcom/kwad/components/ad/feed/b/n$2;

    iget-object p1, p1, Lcom/kwad/components/ad/feed/b/n$2;->gr:Lcom/kwad/components/ad/feed/b/n;

    invoke-static {p1, p2}, Lcom/kwad/components/ad/feed/b/n;->a(Lcom/kwad/components/ad/feed/b/n;Lcom/kwad/sdk/core/webview/c/c;)Lcom/kwad/sdk/core/webview/c/c;

    .line 3
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/n$2$1;->gs:Lcom/kwad/components/ad/feed/b/n$2;

    iget-object p1, p1, Lcom/kwad/components/ad/feed/b/n$2;->gr:Lcom/kwad/components/ad/feed/b/n;

    invoke-static {p1}, Lcom/kwad/components/ad/feed/b/n;->h(Lcom/kwad/components/ad/feed/b/n;)V

    return-void
.end method
