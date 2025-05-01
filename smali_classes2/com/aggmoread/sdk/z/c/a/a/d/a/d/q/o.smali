.class public Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/o;
.super Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/c;
.source "SourceFile"


# instance fields
.field private l:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

.field private m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/n;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;Ljava/util/List;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/aggmoread/sdk/z/c/a/a/d/b/d;",
            "Lcom/aggmoread/sdk/z/c/a/a/d/b/e;",
            "Ljava/util/List<",
            "Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/n;",
            ">;I)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/c;-><init>()V

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/o;->l:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    new-instance p4, Ljava/util/HashMap;

    iget-object v0, p2, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->b:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/e/f;->a:Ljava/util/Map;

    invoke-direct {p4, v0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/e/f;

    invoke-direct {v0, p4}, Lcom/aggmoread/sdk/z/c/a/a/e/f;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->b:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    iget-object p2, p2, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->d:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->d:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    iput-object p3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/o;->m:Ljava/util/List;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    const/4 p4, 0x0

    if-eqz p3, :cond_1

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/n;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/n;->b:Ljava/util/Map;

    if-eqz v1, :cond_0

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object p3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->b:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    iget-object p3, p3, Lcom/aggmoread/sdk/z/c/a/a/e/f;->a:Ljava/util/Map;

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->a:Ljava/lang/Object;

    invoke-interface {p3, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->b:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    iget-object p2, p2, Lcom/aggmoread/sdk/z/c/a/a/e/f;->a:Ljava/util/Map;

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    if-eqz p2, :cond_3

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_3

    const/4 p3, 0x0

    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge p4, v0, :cond_3

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/e/f;

    invoke-interface {p2, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-direct {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/f;-><init>(Ljava/util/Map;)V

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->T:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->c(Ljava/lang/Object;)Ljava/lang/String;

    if-nez p3, :cond_2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->V:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;)I

    move-result v1

    iget v2, p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->v:I

    if-le v1, v2, :cond_2

    iput-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->c:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    iput p4, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->f:I

    const/4 p3, 0x1

    :cond_2
    add-int/lit8 p4, p4, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method


# virtual methods
.method public a(Lcom/aggmoread/sdk/z/c/a/a/d/b/k;)V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/o;->l:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-virtual {v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/k;)V

    return-void
.end method

.method public a(Z)V
    .locals 1

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/o;->l:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->a(Z)V

    return-void
.end method

.method public b(Lcom/aggmoread/sdk/z/c/a/a/d/b/k;)V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/o;->l:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-virtual {v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->b(Lcom/aggmoread/sdk/z/c/a/a/d/b/k;)V

    return-void
.end method

.method public g()I
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/o;->m:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->f:I

    if-le v0, v1, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/o;->m:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/n;

    if-eqz v0, :cond_0

    iget v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/n;->a:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "gci err "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ACWFRTAG"

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-super {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->g()I

    move-result v0

    return v0
.end method

.method public h()Z
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/o;->l:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->h()Z

    move-result v0

    return v0
.end method

.method public j()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/o;->l:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->j()V

    return-void
.end method

.method public k()V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "watter tryEnd "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", this "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ACWFRTAG"

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public l()Z
    .locals 4

    invoke-super {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->l()Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "watter tryNextSDK "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", rid "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v2, v2, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", this "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "ACWFRTAG"

    invoke-static {v2, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->g:Lcom/aggmoread/sdk/z/c/a/a/c/f;

    if-eqz v0, :cond_0

    const-string v0, "notify tryNextSDK"

    invoke-static {v2, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->g:Lcom/aggmoread/sdk/z/c/a/a/c/f;

    new-instance v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    const/16 v2, -0x4e20

    const-string v3, "\u672a\u5339\u914d\u5230\u5408\u9002\u7684\u5e7f\u544a"

    invoke-direct {v1, v2, v3}, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/f;->a(Lcom/aggmoread/sdk/z/c/a/a/c/d;)V

    :cond_0
    const/4 v0, 0x1

    return v0
.end method
