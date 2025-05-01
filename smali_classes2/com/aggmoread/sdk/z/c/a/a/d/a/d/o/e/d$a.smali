.class Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/a/l/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d;->a(Landroid/content/Context;Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;Ljava/util/List;Landroid/view/View;Landroid/view/View;Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;

.field final synthetic c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d;Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d$a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d$a;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/aggmoread/sdk/z/a/g/e;)V
    .locals 3

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d$a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d;

    new-instance v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/g/e;->a()I

    move-result v2

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/g/e;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;-><init>(ILjava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)V

    return-void
.end method

.method public onADClicked()V
    .locals 9

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d$a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d;

    iget-object v2, v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->e:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-direct {v0, v2, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->n:Ljava/lang/Object;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d$a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d;

    iget-object v2, v2, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/aggmoread/sdk/z/c/a/a/d/b/k;

    move-result-object v3

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d$a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d;

    iget-object v4, v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->e:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->k:Ljava/lang/ref/WeakReference;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;

    :goto_0
    move-object v5, v1

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d$a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d;

    iget-wide v6, v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->g:J

    iget-object v8, v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->j:[Ljava/lang/Object;

    invoke-virtual/range {v3 .. v8}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;J[Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->b()V

    if-eqz v1, :cond_1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d$a;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;->onAdClicked()V

    :cond_1
    return-void
.end method

.method public onADExposed()V
    .locals 3

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d$a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->g:J

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d$a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->j:[Ljava/lang/Object;

    const/4 v1, 0x1

    invoke-static {v0, v1, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/l;->a(Ljava/lang/Object;ZZ)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d$a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d$a;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d;Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;)V

    return-void
.end method
