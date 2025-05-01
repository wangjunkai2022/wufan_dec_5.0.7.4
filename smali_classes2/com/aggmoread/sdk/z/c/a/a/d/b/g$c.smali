.class Lcom/aggmoread/sdk/z/c/a/a/d/b/g$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/b/g;->a(Lcom/aggmoread/sdk/z/c/a/a/c/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/g;Lcom/aggmoread/sdk/z/c/a/a/d/b/d;)V
    .locals 0

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$c;->b:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    const v1, 0x3baa17fd

    const-string v2, "lv:\u5e7f\u544a\u65e0\u586b\u5145"

    invoke-direct {v0, v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;-><init>(ILjava/lang/String;)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$c;->b:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/i;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    return-void
.end method
