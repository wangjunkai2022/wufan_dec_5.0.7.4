.class Lcom/aggmoread/sdk/z/c/a/a/d/a/d/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/k;->e(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/util/List;

.field final synthetic c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/k;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/k;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/k$a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/k;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/k$a;->b:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/k$a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/k;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->g:Lcom/aggmoread/sdk/z/c/a/a/c/f;

    check-cast v0, Lcom/aggmoread/sdk/z/c/a/a/c/o/f;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/k$a;->b:Ljava/util/List;

    invoke-interface {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/o/f;->onAdLoaded(Ljava/util/List;)V

    return-void
.end method
