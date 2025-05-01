.class Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;[BLcom/aggmoread/sdk/z/c/a/a/d/b/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

.field final synthetic c:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

.field final synthetic d:Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f;Lcom/aggmoread/sdk/z/c/a/a/d/b/i;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f$a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f$a;->b:Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    iput-object p3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f$a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "err: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f$a;->b:Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    iget v2, v2, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;->a:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f$a;->b:Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    iget-object v2, v2, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const v2, 0x3baa17fd

    invoke-direct {v0, v2, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;-><init>(ILjava/lang/String;)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f$a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f$a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-virtual {v1, v0, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/i;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    return-void
.end method
