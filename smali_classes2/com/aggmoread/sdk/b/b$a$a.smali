.class Lcom/aggmoread/sdk/b/b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/c/a/a/d/a/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/b/b$a;->loadAppInfo(Lcom/aggmoread/sdk/client/AMAdDownloadConfirmListener$ApkInfoLoadListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/client/AMAdDownloadConfirmListener$ApkInfoLoadListener;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/b/b$a;Lcom/aggmoread/sdk/client/AMAdDownloadConfirmListener$ApkInfoLoadListener;)V
    .locals 0

    iput-object p2, p0, Lcom/aggmoread/sdk/b/b$a$a;->a:Lcom/aggmoread/sdk/client/AMAdDownloadConfirmListener$ApkInfoLoadListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/aggmoread/sdk/z/c/a/a/c/d;)V
    .locals 3

    iget-object v0, p0, Lcom/aggmoread/sdk/b/b$a$a;->a:Lcom/aggmoread/sdk/client/AMAdDownloadConfirmListener$ApkInfoLoadListener;

    new-instance v1, Lcom/aggmoread/sdk/client/AMError;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/c/d;->a()I

    move-result v2

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/c/d;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Lcom/aggmoread/sdk/client/AMError;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/aggmoread/sdk/client/AMAdDownloadConfirmListener$ApkInfoLoadListener;->onApkInfoLoadFailed(Lcom/aggmoread/sdk/client/AMError;)V

    return-void
.end method

.method public a(Lcom/aggmoread/sdk/z/c/a/a/d/a/b;)V
    .locals 13

    iget-object v0, p0, Lcom/aggmoread/sdk/b/b$a$a;->a:Lcom/aggmoread/sdk/client/AMAdDownloadConfirmListener$ApkInfoLoadListener;

    new-instance v12, Lcom/aggmoread/sdk/client/AMAdApkInfo;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/b;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/b;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/b;->h()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/b;->c()J

    move-result-wide v5

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/b;->g()J

    move-result-wide v7

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/b;->f()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/b;->e()Ljava/util/List;

    move-result-object v10

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/b;->d()Ljava/lang/String;

    move-result-object v11

    move-object v1, v12

    invoke-direct/range {v1 .. v11}, Lcom/aggmoread/sdk/client/AMAdApkInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    invoke-interface {v0, v12}, Lcom/aggmoread/sdk/client/AMAdDownloadConfirmListener$ApkInfoLoadListener;->onApkInfo(Lcom/aggmoread/sdk/client/AMAdApkInfo;)V

    return-void
.end method
