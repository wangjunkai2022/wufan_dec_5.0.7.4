.class public Lcom/aggmoread/sdk/z/c/a/a/d/a/d/s/c/a;
.super Lcom/aggmoread/sdk/z/c/a/a/d/a/d/k;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/a/l/a;


# direct methods
.method public constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/k;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/aggmoread/sdk/z/a/g/e;)V
    .locals 2

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/g/e;->a()I

    move-result v1

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/g/e;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;-><init>(ILjava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/k;->b(Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)V

    return-void
.end method

.method public l()V
    .locals 3

    :try_start_0
    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/s/b;->a()Lcom/aggmoread/sdk/z/c/a/a/d/a/d/s/b;

    move-result-object v0

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->q:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/s/b;->a(Landroid/content/Context;)V

    new-instance v0, Lcom/aggmoread/sdk/z/b/b/a$b;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/aggmoread/sdk/z/b/b/a$b;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->m:I

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/b/b/a$b;->b(I)Lcom/aggmoread/sdk/z/b/b/a$b;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->c:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v2, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->T:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/b/b/a$b;->a(Ljava/lang/String;)Lcom/aggmoread/sdk/z/b/b/a$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/b/b/a$b;->d()Lcom/aggmoread/sdk/z/b/b/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/aggmoread/sdk/z/b/b/a;->a(Lcom/aggmoread/sdk/z/a/l/a;)V

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-direct {v0, v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a(I)Lcom/aggmoread/sdk/z/c/a/a/d/b/k;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->b()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public onAdLoaded(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/aggmoread/sdk/z/a/l/c;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/aggmoread/sdk/z/a/l/c;

    new-instance v2, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/s/c/b;

    iget-object v3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v4, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    iget-object v5, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->b:Ljava/util/HashMap;

    invoke-direct {v2, v1, v3, v4, v5}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/s/c/b;-><init>(Lcom/aggmoread/sdk/z/a/l/c;Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;Ljava/util/Map;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/k;->e(Ljava/util/List;)V

    return-void
.end method
