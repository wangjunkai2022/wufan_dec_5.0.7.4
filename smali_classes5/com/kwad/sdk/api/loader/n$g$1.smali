.class final Lcom/kwad/sdk/api/loader/n$g$1;
.super Lcom/kwad/sdk/api/loader/n$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/sdk/api/loader/n$g;->a(Lcom/kwad/sdk/api/loader/v;Lcom/kwad/sdk/api/loader/n$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kwad/sdk/api/loader/n$a<",
        "Lcom/kwad/sdk/api/loader/a$a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic aoe:Lcom/kwad/sdk/api/loader/n$c;

.field final synthetic aok:Lcom/kwad/sdk/api/loader/n$g;


# direct methods
.method constructor <init>(Lcom/kwad/sdk/api/loader/n$g;Lcom/kwad/sdk/api/loader/n$c;Lcom/kwad/sdk/api/loader/n$c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/api/loader/n$g$1;->aok:Lcom/kwad/sdk/api/loader/n$g;

    iput-object p3, p0, Lcom/kwad/sdk/api/loader/n$g$1;->aoe:Lcom/kwad/sdk/api/loader/n$c;

    invoke-direct {p0, p2}, Lcom/kwad/sdk/api/loader/n$a;-><init>(Lcom/kwad/sdk/api/loader/n$c;)V

    return-void
.end method

.method private a(Lcom/kwad/sdk/api/loader/a$a;ILjava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p1, Lcom/kwad/sdk/api/loader/a$a;->ana:Ljava/io/File;

    invoke-static {v0}, Lcom/kwad/sdk/api/loader/i;->j(Ljava/io/File;)V

    .line 2
    invoke-virtual {p3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p3

    invoke-static {p1, p2, p3}, Lcom/kwad/sdk/api/loader/k;->a(Lcom/kwad/sdk/api/loader/a$a;ILjava/lang/String;)V

    return-void
.end method

.method private c(Lcom/kwad/sdk/api/loader/a$a;)V
    .locals 3
    .param p1    # Lcom/kwad/sdk/api/loader/a$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    :try_start_0
    iget-object v0, p1, Lcom/kwad/sdk/api/loader/a$a;->ana:Ljava/io/File;

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/api/loader/s;->k(Ljava/io/File;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x1

    .line 3
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Security checkFileValid fail"

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1, v0, v1}, Lcom/kwad/sdk/api/loader/n$g$1;->a(Lcom/kwad/sdk/api/loader/a$a;ILjava/lang/Throwable;)V

    return-void

    .line 4
    :cond_0
    iget-object v1, p1, Lcom/kwad/sdk/api/loader/a$a;->md5:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/kwad/sdk/api/loader/s;->a(Ljava/io/File;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x2

    .line 5
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Security checkMd5 fail"

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1, v0, v1}, Lcom/kwad/sdk/api/loader/n$g$1;->a(Lcom/kwad/sdk/api/loader/a$a;ILjava/lang/Throwable;)V

    return-void

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/kwad/sdk/api/loader/n$g$1;->aoe:Lcom/kwad/sdk/api/loader/n$c;

    invoke-interface {v0, p1}, Lcom/kwad/sdk/api/loader/n$c;->i(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    const/4 v1, 0x3

    .line 7
    invoke-direct {p0, p1, v1, v0}, Lcom/kwad/sdk/api/loader/n$g$1;->a(Lcom/kwad/sdk/api/loader/a$a;ILjava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final synthetic i(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    check-cast p1, Lcom/kwad/sdk/api/loader/a$a;

    invoke-direct {p0, p1}, Lcom/kwad/sdk/api/loader/n$g$1;->c(Lcom/kwad/sdk/api/loader/a$a;)V

    return-void
.end method
