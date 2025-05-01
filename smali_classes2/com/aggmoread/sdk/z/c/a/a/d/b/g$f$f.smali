.class Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f$f;
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
.field final synthetic b:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

.field final synthetic c:Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f$f;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f$f;->b:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f$f;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    new-instance v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    const v2, 0x3baa1fcc

    const-string v3, "\u5e7f\u544a\u65e0\u586b\u5145"

    invoke-direct {v1, v2, v3}, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;-><init>(ILjava/lang/String;)V

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f$f;->b:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-virtual {v0, v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/i;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    return-void
.end method
