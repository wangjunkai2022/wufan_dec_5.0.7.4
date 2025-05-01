.class Lcom/aggmoread/sdk/z/a/k/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/a/k/c$k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/a/k/b;->a(Lcom/aggmoread/sdk/z/a/g/b$a$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/a/g/b$a$a;

.field final synthetic b:Lcom/aggmoread/sdk/z/a/k/b;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/a/k/b;Lcom/aggmoread/sdk/z/a/g/b$a$a;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/k/b$a;->b:Lcom/aggmoread/sdk/z/a/k/b;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/a/k/b$a;->a:Lcom/aggmoread/sdk/z/a/g/b$a$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/k/b$a;->b:Lcom/aggmoread/sdk/z/a/k/b;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/k/b;->a(Lcom/aggmoread/sdk/z/a/k/b;)Lcom/aggmoread/sdk/z/a/k/a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/k/b$a;->b:Lcom/aggmoread/sdk/z/a/k/b;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/k/b;->a(Lcom/aggmoread/sdk/z/a/k/b;)Lcom/aggmoread/sdk/z/a/k/a;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/k/b$a;->b:Lcom/aggmoread/sdk/z/a/k/b;

    invoke-interface {v0, v1}, Lcom/aggmoread/sdk/z/a/k/a;->b(Lcom/aggmoread/sdk/z/a/k/c;)V

    :cond_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/k/b$a;->a:Lcom/aggmoread/sdk/z/a/g/b$a$a;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/g/b$a$a;->q()Ljava/util/List;

    move-result-object v0

    const-string v1, "onAdExposure"

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/a/q/a;->a(Ljava/lang/String;Ljava/util/List;)V

    :cond_1
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/k/b$a;->b:Lcom/aggmoread/sdk/z/a/k/b;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/k/b;->a(Lcom/aggmoread/sdk/z/a/k/b;)Lcom/aggmoread/sdk/z/a/k/a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/k/b$a;->b:Lcom/aggmoread/sdk/z/a/k/b;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/k/b;->a(Lcom/aggmoread/sdk/z/a/k/b;)Lcom/aggmoread/sdk/z/a/k/a;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/k/b$a;->b:Lcom/aggmoread/sdk/z/a/k/b;

    new-instance v2, Lcom/aggmoread/sdk/z/a/g/e;

    const v3, 0xc353

    invoke-direct {v2, v3, p1}, Lcom/aggmoread/sdk/z/a/g/e;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1, v2}, Lcom/aggmoread/sdk/z/a/k/a;->a(Lcom/aggmoread/sdk/z/a/k/c;Lcom/aggmoread/sdk/z/a/g/e;)V

    :cond_0
    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/k/b$a;->b:Lcom/aggmoread/sdk/z/a/k/b;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/k/b;->a(Lcom/aggmoread/sdk/z/a/k/b;)Lcom/aggmoread/sdk/z/a/k/a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/k/b$a;->b:Lcom/aggmoread/sdk/z/a/k/b;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/k/b;->a(Lcom/aggmoread/sdk/z/a/k/b;)Lcom/aggmoread/sdk/z/a/k/a;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/k/b$a;->b:Lcom/aggmoread/sdk/z/a/k/b;

    invoke-interface {v0, v1}, Lcom/aggmoread/sdk/z/a/k/a;->d(Lcom/aggmoread/sdk/z/a/k/c;)V

    :cond_0
    return-void
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/k/b$a;->b:Lcom/aggmoread/sdk/z/a/k/b;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/k/b;->b(Lcom/aggmoread/sdk/z/a/k/b;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/k/b$a;->b:Lcom/aggmoread/sdk/z/a/k/b;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/k/b;->a(Lcom/aggmoread/sdk/z/a/k/b;)Lcom/aggmoread/sdk/z/a/k/a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/k/b$a;->b:Lcom/aggmoread/sdk/z/a/k/b;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/k/b;->a(Lcom/aggmoread/sdk/z/a/k/b;)Lcom/aggmoread/sdk/z/a/k/a;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/k/b$a;->b:Lcom/aggmoread/sdk/z/a/k/b;

    invoke-interface {v0, v1}, Lcom/aggmoread/sdk/z/a/k/a;->c(Lcom/aggmoread/sdk/z/a/k/c;)V

    :cond_0
    return-void
.end method

.method public onRenderSuccess()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/k/b$a;->b:Lcom/aggmoread/sdk/z/a/k/b;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/k/b;->a(Lcom/aggmoread/sdk/z/a/k/b;)Lcom/aggmoread/sdk/z/a/k/a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/k/b$a;->b:Lcom/aggmoread/sdk/z/a/k/b;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/k/b;->a(Lcom/aggmoread/sdk/z/a/k/b;)Lcom/aggmoread/sdk/z/a/k/a;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/k/b$a;->b:Lcom/aggmoread/sdk/z/a/k/b;

    invoke-interface {v0, v1}, Lcom/aggmoread/sdk/z/a/k/a;->a(Lcom/aggmoread/sdk/z/a/k/c;)V

    :cond_0
    return-void
.end method
