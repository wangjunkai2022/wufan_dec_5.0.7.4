.class Lcom/aggmoread/sdk/z/c/a/a/c/k$c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/c/a/a/c/k$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/c/a/a/c/k$c;->a(Lcom/aggmoread/sdk/z/c/a/a/e/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/c/a/a/e/b;

.field final synthetic b:Lcom/aggmoread/sdk/z/c/a/a/c/k$c;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/c/k$c;Lcom/aggmoread/sdk/z/c/a/a/e/b;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/k$c$b;->b:Lcom/aggmoread/sdk/z/c/a/a/c/k$c;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/c/k$c$b;->a:Lcom/aggmoread/sdk/z/c/a/a/e/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;[BLcom/aggmoread/sdk/z/c/a/a/d/b/i;)V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/c/k$c$b;->b:Lcom/aggmoread/sdk/z/c/a/a/c/k$c;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/c/k$c;->b:Lcom/aggmoread/sdk/z/c/a/a/c/k$d;

    invoke-interface {v0, p1, p2, p3}, Lcom/aggmoread/sdk/z/c/a/a/c/k$d;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;[BLcom/aggmoread/sdk/z/c/a/a/d/b/i;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/k$c$b;->b:Lcom/aggmoread/sdk/z/c/a/a/c/k$c;

    iget-object p1, p1, Lcom/aggmoread/sdk/z/c/a/a/c/k$c;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    new-instance p2, Lcom/aggmoread/sdk/z/c/a/a/c/k$c$b$a;

    invoke-direct {p2, p0}, Lcom/aggmoread/sdk/z/c/a/a/c/k$c$b$a;-><init>(Lcom/aggmoread/sdk/z/c/a/a/c/k$c$b;)V

    invoke-static {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/c/k;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/c/k$d;)V

    return-void
.end method
