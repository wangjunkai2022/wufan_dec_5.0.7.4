.class Lcom/aggmoread/sdk/z/b/c/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/b/e/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/z/b/c/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/b/c/b;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/b/c/b;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/b/c/b$b;->a:Lcom/aggmoread/sdk/z/b/c/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/c/b$b;->a:Lcom/aggmoread/sdk/z/b/c/b;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/b/c/b;->c(Lcom/aggmoread/sdk/z/b/c/b;)Lcom/aggmoread/sdk/z/a/t/c;

    move-result-object v1

    iget-object v1, v1, Lcom/aggmoread/sdk/z/a/t/c;->c:Lcom/aggmoread/sdk/z/a/g/c;

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/b/c/b;->a(Lcom/aggmoread/sdk/z/b/c/b;Lcom/aggmoread/sdk/z/a/g/c;)V

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/c/b$b;->a:Lcom/aggmoread/sdk/z/b/c/b;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/b/c/b;->b(Lcom/aggmoread/sdk/z/b/c/b;)Lcom/aggmoread/sdk/z/b/e/a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/c/b$b;->a:Lcom/aggmoread/sdk/z/b/c/b;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/b/c/b;->b(Lcom/aggmoread/sdk/z/b/c/b;)Lcom/aggmoread/sdk/z/b/e/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/b/e/a;->a()V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/c/b$b;->a:Lcom/aggmoread/sdk/z/b/c/b;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/b/c/b;->a(Lcom/aggmoread/sdk/z/b/c/b;Lcom/aggmoread/sdk/z/b/e/a;)Lcom/aggmoread/sdk/z/b/e/a;

    :cond_0
    return-void
.end method

.method public onRenderSuccess()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/c/b$b;->a:Lcom/aggmoread/sdk/z/b/c/b;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/b/c/b;->a(Lcom/aggmoread/sdk/z/b/c/b;Z)Z

    return-void
.end method
