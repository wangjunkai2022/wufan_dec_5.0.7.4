.class Lcom/aggmoread/sdk/z/a/j/b$a;
.super Lcom/aggmoread/sdk/z/a/j/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/a/j/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lcom/aggmoread/sdk/z/a/j/b;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/a/j/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/j/b$a;->e:Lcom/aggmoread/sdk/z/a/j/b;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/a/j/b$a;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/aggmoread/sdk/z/a/j/b$a;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/aggmoread/sdk/z/a/j/b$a;->d:Ljava/lang/String;

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/j/i;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    const-string v0, "ApiDownloadHelper"

    const-string v1, "onConnectSuccess enter"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/aggmoread/sdk/z/a/j/f;->a()Lcom/aggmoread/sdk/z/a/j/f;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/b$a;->b:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/aggmoread/sdk/z/a/j/f;->a(Ljava/lang/String;I)V

    return-void
.end method

.method public a(ILjava/lang/String;)V
    .locals 3

    invoke-static {}, Lcom/aggmoread/sdk/z/a/j/f;->a()Lcom/aggmoread/sdk/z/a/j/f;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/b$a;->b:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/aggmoread/sdk/z/a/j/f;->a(Ljava/lang/String;I)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onError enter , code = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " , message = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ApiDownloadHelper"

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/b$a;->e:Lcom/aggmoread/sdk/z/a/j/b;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/j/b;->a(Lcom/aggmoread/sdk/z/a/j/b;)Lcom/aggmoread/sdk/z/a/j/c;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/b$a;->e:Lcom/aggmoread/sdk/z/a/j/b;

    invoke-static {v1}, Lcom/aggmoread/sdk/z/a/j/b;->b(Lcom/aggmoread/sdk/z/a/j/b;)I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2, p1, p2}, Lcom/aggmoread/sdk/z/a/j/c;->b(JILjava/lang/String;)V

    return-void
.end method

.method public a(Ljava/io/File;)V
    .locals 4

    const-string v0, "ApiDownloadHelper"

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lcom/aggmoread/sdk/z/a/j/f;->a()Lcom/aggmoread/sdk/z/a/j/f;

    move-result-object v1

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/j/b$a;->b:Ljava/lang/String;

    const/4 v3, 0x3

    invoke-virtual {v1, v2, v3}, Lcom/aggmoread/sdk/z/a/j/f;->a(Ljava/lang/String;I)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/b$a;->e:Lcom/aggmoread/sdk/z/a/j/b;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/aggmoread/sdk/z/a/j/b;->a(Lcom/aggmoread/sdk/z/a/j/b;Ljava/lang/String;)Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onCompleted enter , downloadFile = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " , downloadId = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/j/b$a;->e:Lcom/aggmoread/sdk/z/a/j/b;

    invoke-static {v2}, Lcom/aggmoread/sdk/z/a/j/b;->b(Lcom/aggmoread/sdk/z/a/j/b;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/b$a;->e:Lcom/aggmoread/sdk/z/a/j/b;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/j/b;->a(Lcom/aggmoread/sdk/z/a/j/b;)Lcom/aggmoread/sdk/z/a/j/c;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/b$a;->e:Lcom/aggmoread/sdk/z/a/j/b;

    invoke-static {v1}, Lcom/aggmoread/sdk/z/a/j/b;->b(Lcom/aggmoread/sdk/z/a/j/b;)I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Lcom/aggmoread/sdk/z/a/j/c;->b(J)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/b$a;->c:Ljava/lang/String;

    new-instance v1, Lcom/aggmoread/sdk/z/a/j/b$a$a;

    invoke-direct {v1, p0, p1}, Lcom/aggmoread/sdk/z/a/j/b$a$a;-><init>(Lcom/aggmoread/sdk/z/a/j/b$a;Ljava/io/File;)V

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/j/e;->a(Ljava/lang/String;Lcom/aggmoread/sdk/z/a/j/l;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/b$a;->e:Lcom/aggmoread/sdk/z/a/j/b;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/b$a;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lcom/aggmoread/sdk/z/a/j/b;->a(Ljava/lang/String;Ljava/io/File;)Z

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/aggmoread/sdk/z/a/j/f;->a()Lcom/aggmoread/sdk/z/a/j/f;

    move-result-object p1

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/b$a;->b:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Lcom/aggmoread/sdk/z/a/j/f;->a(Ljava/lang/String;I)V

    const-string p1, "onCompleted enter , downloadFile not found"

    invoke-static {v0, p1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/j/b$a;->e:Lcom/aggmoread/sdk/z/a/j/b;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/j/b;->a(Lcom/aggmoread/sdk/z/a/j/b;)Lcom/aggmoread/sdk/z/a/j/c;

    move-result-object p1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/b$a;->e:Lcom/aggmoread/sdk/z/a/j/b;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/j/b;->b(Lcom/aggmoread/sdk/z/a/j/b;)I

    move-result v0

    int-to-long v0, v0

    const/16 v2, -0x7d1

    const-string v3, "download file not found error"

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/aggmoread/sdk/z/a/j/c;->a(JILjava/lang/String;)V

    :goto_0
    return-void
.end method

.method public c()V
    .locals 3

    invoke-static {}, Lcom/aggmoread/sdk/z/a/j/f;->a()Lcom/aggmoread/sdk/z/a/j/f;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/b$a;->b:Ljava/lang/String;

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Lcom/aggmoread/sdk/z/a/j/f;->a(Ljava/lang/String;I)V

    const-string v0, "ApiDownloadHelper"

    const-string v1, "onStartReadBytes enter"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/b$a;->e:Lcom/aggmoread/sdk/z/a/j/b;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/j/b;->a(Lcom/aggmoread/sdk/z/a/j/b;)Lcom/aggmoread/sdk/z/a/j/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/j/c;->b()V

    return-void
.end method
