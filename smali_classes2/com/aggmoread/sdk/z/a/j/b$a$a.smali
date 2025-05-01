.class Lcom/aggmoread/sdk/z/a/j/b$a$a;
.super Lcom/aggmoread/sdk/z/a/j/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/a/j/b$a;->a(Ljava/io/File;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/io/File;

.field final synthetic c:Lcom/aggmoread/sdk/z/a/j/b$a;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/a/j/b$a;Ljava/io/File;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/j/b$a$a;->c:Lcom/aggmoread/sdk/z/a/j/b$a;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/a/j/b$a$a;->b:Ljava/io/File;

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/j/l;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "onCompleted enter , onNotificationClicked = "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ", downloadId = "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lcom/aggmoread/sdk/z/a/j/b$a$a;->c:Lcom/aggmoread/sdk/z/a/j/b$a;

    iget-object p2, p2, Lcom/aggmoread/sdk/z/a/j/b$a;->e:Lcom/aggmoread/sdk/z/a/j/b;

    invoke-static {p2}, Lcom/aggmoread/sdk/z/a/j/b;->b(Lcom/aggmoread/sdk/z/a/j/b;)I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "ApiDownloadHelper"

    invoke-static {p2, p1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/j/b$a$a;->c:Lcom/aggmoread/sdk/z/a/j/b$a;

    iget-object p1, p1, Lcom/aggmoread/sdk/z/a/j/b$a;->e:Lcom/aggmoread/sdk/z/a/j/b;

    iget-object p2, p0, Lcom/aggmoread/sdk/z/a/j/b$a$a;->b:Ljava/io/File;

    sget-object p3, Lcom/aggmoread/sdk/z/a/j/b$d;->c:Lcom/aggmoread/sdk/z/a/j/b$d;

    invoke-virtual {p1, p2, p3}, Lcom/aggmoread/sdk/z/a/j/b;->a(Ljava/io/File;Lcom/aggmoread/sdk/z/a/j/b$d;)Z

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/j/b$a$a;->c:Lcom/aggmoread/sdk/z/a/j/b$a;

    iget-object p1, p1, Lcom/aggmoread/sdk/z/a/j/b$a;->e:Lcom/aggmoread/sdk/z/a/j/b;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/j/b;->a(Lcom/aggmoread/sdk/z/a/j/b;)Lcom/aggmoread/sdk/z/a/j/c;

    move-result-object p1

    iget-object p2, p0, Lcom/aggmoread/sdk/z/a/j/b$a$a;->c:Lcom/aggmoread/sdk/z/a/j/b$a;

    iget-object p2, p2, Lcom/aggmoread/sdk/z/a/j/b$a;->e:Lcom/aggmoread/sdk/z/a/j/b;

    invoke-static {p2}, Lcom/aggmoread/sdk/z/a/j/b;->b(Lcom/aggmoread/sdk/z/a/j/b;)I

    move-result p2

    int-to-long p2, p2

    const/16 p4, -0x7d2

    const-string v0, "click notification install apk"

    invoke-virtual {p1, p2, p3, p4, v0}, Lcom/aggmoread/sdk/z/a/j/c;->a(JILjava/lang/String;)V

    return-void
.end method
