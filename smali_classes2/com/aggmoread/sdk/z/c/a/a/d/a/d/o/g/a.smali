.class public Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/g/a;
.super Lcom/aggmoread/sdk/z/c/a/a/d/a/d/j;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/a/r/e;


# instance fields
.field private t:Lcom/aggmoread/sdk/z/a/h/c;

.field private u:Lcom/aggmoread/sdk/z/a/a;


# direct methods
.method public constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/j;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/j;->r()V

    return-void
.end method

.method protected a(Landroid/view/View;)V
    .locals 2

    :try_start_0
    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/c;->a()Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/c;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->d:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/c;->a(Landroid/content/Context;)V

    new-instance v0, Lcom/aggmoread/sdk/z/a/h/c$b;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/aggmoread/sdk/z/a/h/c$b;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->m:I

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/a/h/c$b;->b(I)Lcom/aggmoread/sdk/z/a/h/c$b;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/a/h/c$b;->a(Z)Lcom/aggmoread/sdk/z/a/h/c$b;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->n:I

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/a/h/c$b;->c(I)Lcom/aggmoread/sdk/z/a/h/c$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/aggmoread/sdk/z/a/h/c$b;->a(Landroid/view/View;)Lcom/aggmoread/sdk/z/a/h/c$b;

    move-result-object p1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/b;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)Z

    move-result v0

    invoke-virtual {p1, v0}, Lcom/aggmoread/sdk/z/a/h/c$b;->b(Z)Lcom/aggmoread/sdk/z/a/h/c$b;

    move-result-object p1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->c:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->T:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/aggmoread/sdk/z/a/h/c$b;->a(Ljava/lang/String;)Lcom/aggmoread/sdk/z/a/h/c$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/h/c$b;->d()Lcom/aggmoread/sdk/z/a/h/c;

    move-result-object p1

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/g/a;->t:Lcom/aggmoread/sdk/z/a/h/c;

    new-instance p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-direct {p1, v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a(I)Lcom/aggmoread/sdk/z/c/a/a/d/b/k;

    move-result-object p1

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->b()V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/g/a;->t:Lcom/aggmoread/sdk/z/a/h/c;

    invoke-virtual {p1, p0}, Lcom/aggmoread/sdk/z/a/h/c;->a(Lcom/aggmoread/sdk/z/a/r/d;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public a(Lcom/aggmoread/sdk/z/a/a;)V
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/g/a;->u:Lcom/aggmoread/sdk/z/a/a;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/a/a;->b()I

    move-result v2

    invoke-static {v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/b;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/a/a;->b()I

    move-result p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->a(II)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->b:Ljava/util/HashMap;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/a/a;->b()I

    move-result p1

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-static {v1, p1, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/b;->b(Ljava/util/Map;ILcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/j;->e(Ljava/util/List;)V

    return-void
.end method

.method public a(Lcom/aggmoread/sdk/z/a/g/e;)V
    .locals 2

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/g/e;->a()I

    move-result v1

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/g/e;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;-><init>(ILjava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/j;->b(Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)V

    return-void
.end method

.method protected b(Landroid/view/ViewGroup;)V
    .locals 3

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/g/a;->u:Lcom/aggmoread/sdk/z/a/a;

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    instance-of v1, v1, Landroid/app/Activity;

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->d:Landroid/content/Context;

    instance-of v2, v1, Landroid/app/Activity;

    if-eqz v2, :cond_1

    move-object v0, v1

    check-cast v0, Landroid/app/Activity;

    :cond_1
    :goto_0
    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/g/a;->u:Lcom/aggmoread/sdk/z/a/a;

    invoke-interface {v1, v0, p1}, Lcom/aggmoread/sdk/z/a/a;->a(Landroid/app/Activity;Landroid/view/ViewGroup;)Z

    goto :goto_1

    :cond_2
    new-instance p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    const v0, 0x3baa1028

    const-string v1, "\u5bb9\u5668\u9875\u9762\u4e0d\u53ef\u89c1!"

    invoke-direct {p1, v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;-><init>(ILjava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/j;->b(Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public d()V
    .locals 0

    return-void
.end method

.method public e()V
    .locals 0

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/j;->s()V

    return-void
.end method

.method protected j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/g/a;->u:Lcom/aggmoread/sdk/z/a/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/a/a;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-super {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->j()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public onAdClicked()V
    .locals 0

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/j;->q()V

    return-void
.end method

.method public onAdShow()V
    .locals 0

    return-void
.end method

.method public onAdTick(J)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/j;->a(J)V

    return-void
.end method
