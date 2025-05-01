.class final Lcom/kwad/sdk/core/webview/b/b/a$1;
.super Lcom/kwad/framework/filedownloader/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/sdk/core/webview/b/b/a;->a(Lcom/kwad/sdk/g/a/b;Lcom/kwad/sdk/core/webview/b/b/a$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic aFB:Lcom/kwad/sdk/g/a/b;

.field final synthetic aFM:Lcom/kwad/sdk/core/webview/b/b/a$a;


# direct methods
.method constructor <init>(Lcom/kwad/sdk/core/webview/b/b/a$a;Lcom/kwad/sdk/g/a/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/core/webview/b/b/a$1;->aFM:Lcom/kwad/sdk/core/webview/b/b/a$a;

    iput-object p2, p0, Lcom/kwad/sdk/core/webview/b/b/a$1;->aFB:Lcom/kwad/sdk/g/a/b;

    invoke-direct {p0}, Lcom/kwad/framework/filedownloader/m;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/framework/filedownloader/a;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    invoke-super {p0, p1, p2}, Lcom/kwad/framework/filedownloader/m;->a(Lcom/kwad/framework/filedownloader/a;Ljava/lang/Throwable;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/core/webview/b/b/a$1;->aFB:Lcom/kwad/sdk/g/a/b;

    .line 3
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 4
    invoke-static {v0, v1, v2, p2}, Lcom/kwad/sdk/core/webview/b/c/b;->a(Lcom/kwad/sdk/g/a/b;IILjava/lang/String;)V

    .line 5
    iget-object p2, p0, Lcom/kwad/sdk/core/webview/b/b/a$1;->aFM:Lcom/kwad/sdk/core/webview/b/b/a$a;

    invoke-interface {p1}, Lcom/kwad/framework/filedownloader/a;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/kwad/sdk/g/a/b;

    invoke-interface {p2, p1}, Lcom/kwad/sdk/core/webview/b/b/a$a;->e(Lcom/kwad/sdk/g/a/b;)V

    return-void
.end method

.method public final c(Lcom/kwad/framework/filedownloader/a;)V
    .locals 5

    .line 1
    invoke-super {p0, p1}, Lcom/kwad/framework/filedownloader/m;->c(Lcom/kwad/framework/filedownloader/a;)V

    .line 2
    invoke-interface {p1}, Lcom/kwad/framework/filedownloader/a;->uz()B

    move-result v0

    const/4 v1, -0x3

    if-ne v0, v1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/kwad/sdk/core/webview/b/b/a$1;->aFM:Lcom/kwad/sdk/core/webview/b/b/a$a;

    iget-object v0, p0, Lcom/kwad/sdk/core/webview/b/b/a$1;->aFB:Lcom/kwad/sdk/g/a/b;

    invoke-interface {p1, v0}, Lcom/kwad/sdk/core/webview/b/b/a$a;->d(Lcom/kwad/sdk/g/a/b;)V

    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/sdk/core/webview/b/b/a$1;->aFM:Lcom/kwad/sdk/core/webview/b/b/a$a;

    iget-object v1, p0, Lcom/kwad/sdk/core/webview/b/b/a$1;->aFB:Lcom/kwad/sdk/g/a/b;

    invoke-interface {v0, v1}, Lcom/kwad/sdk/core/webview/b/b/a$a;->e(Lcom/kwad/sdk/g/a/b;)V

    .line 5
    iget-object v0, p0, Lcom/kwad/sdk/core/webview/b/b/a$1;->aFB:Lcom/kwad/sdk/g/a/b;

    const/4 v1, 0x0

    const/4 v2, 0x1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "task.getStatus()="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    invoke-interface {p1}, Lcom/kwad/framework/filedownloader/a;->uz()B

    move-result p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 7
    invoke-static {v0, v1, v2, p1}, Lcom/kwad/sdk/core/webview/b/c/b;->a(Lcom/kwad/sdk/g/a/b;IILjava/lang/String;)V

    return-void
.end method
