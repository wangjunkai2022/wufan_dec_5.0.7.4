.class Lcom/aggmoread/sdk/z/b/d/a$f;
.super Lcom/aggmoread/sdk/z/a/j/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/b/d/a;->a(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/aggmoread/sdk/z/b/d/a;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/b/d/a;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a$f;->b:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/j/c;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    invoke-super {p0}, Lcom/aggmoread/sdk/z/a/j/c;->a()V

    const-string v0, "ApiSplashHandler_dsp"

    const-string v1, "apkIsDownLoading  "

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public a(J)V
    .locals 1

    invoke-super {p0, p1, p2}, Lcom/aggmoread/sdk/z/a/j/c;->a(J)V

    const-string p1, "ApiSplashHandler_dsp"

    const-string p2, "onApkInstalled  "

    invoke-static {p1, p2}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a$f;->b:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/b/d/a;->c(Lcom/aggmoread/sdk/z/b/d/a;)Lcom/aggmoread/sdk/z/b/a/a$a$a;

    move-result-object p1

    iget-object p1, p1, Lcom/aggmoread/sdk/z/b/a/a$a$a;->o:Ljava/util/List;

    iget-object p2, p0, Lcom/aggmoread/sdk/z/b/d/a$f;->b:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {p2}, Lcom/aggmoread/sdk/z/b/d/a;->d(Lcom/aggmoread/sdk/z/b/d/a;)Lcom/aggmoread/sdk/z/a/r/a;

    move-result-object p2

    invoke-virtual {p2}, Lcom/aggmoread/sdk/z/a/r/a;->a()Lcom/aggmoread/sdk/z/a/g/c;

    move-result-object p2

    const-string v0, "onApkInstalled"

    invoke-static {v0, p1, p2}, Lcom/aggmoread/sdk/z/a/q/a;->a(Ljava/lang/String;Ljava/util/List;Lcom/aggmoread/sdk/z/a/g/c;)Ljava/util/List;

    return-void
.end method

.method public a(JILjava/lang/String;)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Lcom/aggmoread/sdk/z/a/j/c;->a(JILjava/lang/String;)V

    const-string p1, "ApiSplashHandler_dsp"

    const-string p2, "onApkInstalledError  "

    invoke-static {p1, p2}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public b()V
    .locals 3

    invoke-super {p0}, Lcom/aggmoread/sdk/z/a/j/c;->b()V

    const-string v0, "ApiSplashHandler_dsp"

    const-string v1, "onStartDownload  "

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a$f;->b:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/b/d/a;->c(Lcom/aggmoread/sdk/z/b/d/a;)Lcom/aggmoread/sdk/z/b/a/a$a$a;

    move-result-object v0

    iget-object v0, v0, Lcom/aggmoread/sdk/z/b/a/a$a$a;->j:Ljava/util/List;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/b/d/a$f;->b:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {v1}, Lcom/aggmoread/sdk/z/b/d/a;->d(Lcom/aggmoread/sdk/z/b/d/a;)Lcom/aggmoread/sdk/z/a/r/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/a/r/a;->a()Lcom/aggmoread/sdk/z/a/g/c;

    move-result-object v1

    const-string v2, "onStartDownload"

    invoke-static {v2, v0, v1}, Lcom/aggmoread/sdk/z/a/q/a;->a(Ljava/lang/String;Ljava/util/List;Lcom/aggmoread/sdk/z/a/g/c;)Ljava/util/List;

    return-void
.end method

.method public b(J)V
    .locals 1

    invoke-super {p0, p1, p2}, Lcom/aggmoread/sdk/z/a/j/c;->b(J)V

    const-string p1, "ApiSplashHandler_dsp"

    const-string p2, "onDownloadSuccess  "

    invoke-static {p1, p2}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a$f;->b:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/b/d/a;->c(Lcom/aggmoread/sdk/z/b/d/a;)Lcom/aggmoread/sdk/z/b/a/a$a$a;

    move-result-object p1

    iget-object p1, p1, Lcom/aggmoread/sdk/z/b/a/a$a$a;->n:Ljava/util/List;

    iget-object p2, p0, Lcom/aggmoread/sdk/z/b/d/a$f;->b:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {p2}, Lcom/aggmoread/sdk/z/b/d/a;->d(Lcom/aggmoread/sdk/z/b/d/a;)Lcom/aggmoread/sdk/z/a/r/a;

    move-result-object p2

    invoke-virtual {p2}, Lcom/aggmoread/sdk/z/a/r/a;->a()Lcom/aggmoread/sdk/z/a/g/c;

    move-result-object p2

    const-string v0, "onDownloadCompleted"

    invoke-static {v0, p1, p2}, Lcom/aggmoread/sdk/z/a/q/a;->a(Ljava/lang/String;Ljava/util/List;Lcom/aggmoread/sdk/z/a/g/c;)Ljava/util/List;

    return-void
.end method

.method public b(JILjava/lang/String;)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Lcom/aggmoread/sdk/z/a/j/c;->b(JILjava/lang/String;)V

    const-string p1, "ApiSplashHandler_dsp"

    const-string p2, "onDownloadFail  "

    invoke-static {p1, p2}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public c(J)V
    .locals 1

    invoke-super {p0, p1, p2}, Lcom/aggmoread/sdk/z/a/j/c;->c(J)V

    const-string p1, "ApiSplashHandler_dsp"

    const-string p2, "onStartApkInstaller  "

    invoke-static {p1, p2}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a$f;->b:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/b/d/a;->c(Lcom/aggmoread/sdk/z/b/d/a;)Lcom/aggmoread/sdk/z/b/a/a$a$a;

    move-result-object p1

    iget-object p1, p1, Lcom/aggmoread/sdk/z/b/a/a$a$a;->k:Ljava/util/List;

    iget-object p2, p0, Lcom/aggmoread/sdk/z/b/d/a$f;->b:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {p2}, Lcom/aggmoread/sdk/z/b/d/a;->d(Lcom/aggmoread/sdk/z/b/d/a;)Lcom/aggmoread/sdk/z/a/r/a;

    move-result-object p2

    invoke-virtual {p2}, Lcom/aggmoread/sdk/z/a/r/a;->a()Lcom/aggmoread/sdk/z/a/g/c;

    move-result-object p2

    const-string v0, "onStartApkInstaller"

    invoke-static {v0, p1, p2}, Lcom/aggmoread/sdk/z/a/q/a;->a(Ljava/lang/String;Ljava/util/List;Lcom/aggmoread/sdk/z/a/g/c;)Ljava/util/List;

    return-void
.end method
