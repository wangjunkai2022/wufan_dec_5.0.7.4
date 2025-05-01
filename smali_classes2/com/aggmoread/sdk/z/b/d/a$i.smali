.class Lcom/aggmoread/sdk/z/b/d/a$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/b/e/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/z/b/d/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/b/d/a;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/b/d/a;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a$i;->a:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a$i;->a:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/b/d/a;->i(Lcom/aggmoread/sdk/z/b/d/a;)V

    return-void
.end method

.method public b()V
    .locals 4

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a$i;->a:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/b/d/a;->f(Lcom/aggmoread/sdk/z/b/d/a;)Lcom/aggmoread/sdk/z/b/e/a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a$i;->a:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/b/d/a;->f(Lcom/aggmoread/sdk/z/b/d/a;)Lcom/aggmoread/sdk/z/b/e/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/b/e/a;->a()V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a$i;->a:Lcom/aggmoread/sdk/z/b/d/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/b/d/a;->a(Lcom/aggmoread/sdk/z/b/d/a;Lcom/aggmoread/sdk/z/b/e/a;)Lcom/aggmoread/sdk/z/b/e/a;

    :cond_0
    invoke-static {}, Lcom/aggmoread/sdk/z/a/m/m;->a()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/aggmoread/sdk/z/b/d/a$i$a;

    invoke-direct {v1, p0}, Lcom/aggmoread/sdk/z/b/d/a$i$a;-><init>(Lcom/aggmoread/sdk/z/b/d/a$i;)V

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public onRenderSuccess()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a$i;->a:Lcom/aggmoread/sdk/z/b/d/a;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/b/d/a;->b(Lcom/aggmoread/sdk/z/b/d/a;Z)Z

    return-void
.end method
