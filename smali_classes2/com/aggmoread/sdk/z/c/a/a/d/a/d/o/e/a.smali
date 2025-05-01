.class public Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/a;
.super Lcom/aggmoread/sdk/z/c/a/a/d/a/d/h;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/a/k/a;


# instance fields
.field private final j:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/aggmoread/sdk/z/a/k/c;",
            "Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/h;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/a;->j:Ljava/util/HashMap;

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

    invoke-virtual {p0, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/h;->b(Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)V

    return-void
.end method

.method public a(Lcom/aggmoread/sdk/z/a/k/c;)V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/a;->j:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/b;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/c;->o()V

    :cond_0
    return-void
.end method

.method public a(Lcom/aggmoread/sdk/z/a/k/c;Lcom/aggmoread/sdk/z/a/g/e;)V
    .locals 0

    iget-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/a;->j:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/b;

    iget-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/a;->j:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/c;->n()V

    :cond_0
    return-void
.end method

.method public b(Lcom/aggmoread/sdk/z/a/k/c;)V
    .locals 8

    const-string v0, "APIEXPRESSHTAG"

    const-string v1, "onADExposure"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/a;->j:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/b;

    if-eqz p1, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    const/4 v0, 0x0

    new-array v5, v0, [Landroid/view/View;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/b;->a()Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;

    move-result-object v4

    iget-object v0, p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->j:[Ljava/lang/Object;

    invoke-static {v4, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/l;->a(Landroid/view/View;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v1, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->b:Ljava/lang/Object;

    iget-object v2, p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->j:[Ljava/lang/Object;

    sget-object v3, Lcom/aggmoread/sdk/z/c/a/a/c/i;->g:Lcom/aggmoread/sdk/z/c/a/a/c/i;

    new-instance v6, Ljava/lang/ref/WeakReference;

    invoke-direct {v6, v4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Lcom/aggmoread/sdk/z/c/a/a/d/b/l;->a(Ljava/lang/Object;[Ljava/lang/Object;Lcom/aggmoread/sdk/z/c/a/a/c/i;Landroid/view/View;[Landroid/view/View;Ljava/lang/ref/WeakReference;Ljava/lang/ref/WeakReference;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->b:Ljava/lang/Object;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->e()Z

    move-result v1

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-virtual {v2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->b()Z

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/l;->b(Ljava/lang/Object;ZZ)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->r:Lcom/aggmoread/sdk/z/c/a/a/e/b;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/e/b;->b()[B

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->b:Ljava/lang/Object;

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/l;->a(Ljava/lang/Object;[B)V

    :cond_0
    iget-object v0, p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->j:[Ljava/lang/Object;

    const/4 v1, 0x1

    invoke-static {v0, v1, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/l;->a(Ljava/lang/Object;ZZ)V

    iget-object v0, p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->j:[Ljava/lang/Object;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/l;->a(Ljava/lang/Object;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/c;->k()V

    :cond_1
    return-void
.end method

.method public c(Lcom/aggmoread/sdk/z/a/k/c;)V
    .locals 2

    const-string v0, "APIEXPRESSHTAG"

    const-string v1, "onADClicked"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/a;->j:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/b;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/c;->i()V

    :cond_0
    return-void
.end method

.method public d(Lcom/aggmoread/sdk/z/a/k/c;)V
    .locals 2

    const-string v0, "APIEXPRESSHTAG"

    const-string v1, "onADClosed"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/a;->j:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/b;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/c;->j()V

    :cond_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/a;->j:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public l()V
    .locals 4

    const-string v0, "ex_"

    :try_start_0
    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/c;->a()Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/c;

    move-result-object v1

    sget-object v2, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->q:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/c;->a(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->c:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v2, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->T:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, ""

    invoke-virtual {v1, v0, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    const-string v0, "APIEXPRESSHTAG"

    :try_start_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "slot id "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/aggmoread/sdk/z/a/h/c$b;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v2, v2, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->d:Landroid/content/Context;

    invoke-direct {v0, v2}, Lcom/aggmoread/sdk/z/a/h/c$b;-><init>(Landroid/content/Context;)V

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget v2, v2, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->m:I

    invoke-virtual {v0, v2}, Lcom/aggmoread/sdk/z/a/h/c$b;->b(I)Lcom/aggmoread/sdk/z/a/h/c$b;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/a/h/c$b;->a(Ljava/lang/String;)Lcom/aggmoread/sdk/z/a/h/c$b;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-static {v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/b;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/a/h/c$b;->b(Z)Lcom/aggmoread/sdk/z/a/h/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/h/c$b;->d()Lcom/aggmoread/sdk/z/a/h/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/aggmoread/sdk/z/a/h/c;->a(Lcom/aggmoread/sdk/z/a/k/a;)V

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-direct {v0, v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a(I)Lcom/aggmoread/sdk/z/c/a/a/d/b/k;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->b()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public onAdLoaded(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/aggmoread/sdk/z/a/k/c;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_2

    const/4 v1, -0x1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/aggmoread/sdk/z/a/k/c;

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/h;->q()Z

    move-result v3

    if-eqz v3, :cond_0

    instance-of v3, v2, Lcom/aggmoread/sdk/z/a/k/b;

    if-eqz v3, :cond_0

    move-object v1, v2

    check-cast v1, Lcom/aggmoread/sdk/z/a/k/b;

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/a/k/b;->b()I

    move-result v1

    iget-object v3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-static {v3, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/b;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;I)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/b;

    iget-object v4, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v5, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    iget-object v6, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->b:Ljava/util/HashMap;

    invoke-direct {v3, v2, v4, v5, v6}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/b;-><init>(Lcom/aggmoread/sdk/z/a/k/c;Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;Ljava/util/Map;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v4, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/a;->j:Ljava/util/HashMap;

    invoke-virtual {v4, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/h;->q()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    if-nez p1, :cond_2

    const/4 p1, 0x0

    invoke-virtual {p0, v1, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/h;->a(II)V

    return-void

    :cond_2
    invoke-virtual {p0, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/h;->e(Ljava/util/List;)V

    return-void
.end method
