.class Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->b(Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

.field final synthetic c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g$b;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g$b;->b:Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g$b;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->g:Lcom/aggmoread/sdk/z/c/a/a/c/f;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g$b;->b:Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    invoke-interface {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/f;->a(Lcom/aggmoread/sdk/z/c/a/a/c/d;)V

    return-void
.end method
