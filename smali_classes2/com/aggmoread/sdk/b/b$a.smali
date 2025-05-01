.class Lcom/aggmoread/sdk/b/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/client/AMAdDownloadConfirmListener$Controller;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/b/b;->a(Landroid/app/Activity;ILcom/aggmoread/sdk/z/c/a/a/d/a/c$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/c/a/a/d/a/c$b;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/b/b;Lcom/aggmoread/sdk/z/c/a/a/d/a/c$b;)V
    .locals 0

    iput-object p2, p0, Lcom/aggmoread/sdk/b/b$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/c$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public loadAppInfo(Lcom/aggmoread/sdk/client/AMAdDownloadConfirmListener$ApkInfoLoadListener;)V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/b/b$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/c$b;

    new-instance v1, Lcom/aggmoread/sdk/b/b$a$a;

    invoke-direct {v1, p0, p1}, Lcom/aggmoread/sdk/b/b$a$a;-><init>(Lcom/aggmoread/sdk/b/b$a;Lcom/aggmoread/sdk/client/AMAdDownloadConfirmListener$ApkInfoLoadListener;)V

    invoke-interface {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/c$b;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/c$a;)V

    return-void
.end method

.method public onCancel()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/b$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/c$b;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/c$b;->onCancel()V

    return-void
.end method

.method public onConfirm()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/b$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/c$b;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/c$b;->onConfirm()V

    return-void
.end method
