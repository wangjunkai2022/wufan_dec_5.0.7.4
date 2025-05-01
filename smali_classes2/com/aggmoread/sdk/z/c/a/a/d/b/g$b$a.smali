.class Lcom/aggmoread/sdk/z/c/a/a/d/b/g$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/c/a/a/d/b/g$k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/b/g$b;->a(Lcom/aggmoread/sdk/z/c/a/a/e/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/c/a/a/e/b;

.field final synthetic b:Lcom/aggmoread/sdk/z/c/a/a/d/b/g$b;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/g$b;Lcom/aggmoread/sdk/z/c/a/a/e/b;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$b$a;->b:Lcom/aggmoread/sdk/z/c/a/a/d/b/g$b;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$b$a;->a:Lcom/aggmoread/sdk/z/c/a/a/e/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;[BLcom/aggmoread/sdk/z/c/a/a/d/b/i;)V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$b$a;->b:Lcom/aggmoread/sdk/z/c/a/a/d/b/g$b;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$b;->b:Lcom/aggmoread/sdk/z/c/a/a/d/b/g$k;

    invoke-interface {v0, p1, p2, p3}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$k;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;[BLcom/aggmoread/sdk/z/c/a/a/d/b/i;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$b$a;->b:Lcom/aggmoread/sdk/z/c/a/a/d/b/g$b;

    iget-object p2, p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$b;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/g;

    iget-object p1, p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    new-instance p3, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$b$a$a;

    invoke-direct {p3, p0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$b$a$a;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/g$b$a;)V

    invoke-virtual {p2, p1, p3}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g;->b(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/g$k;)V

    return-void
.end method
