.class public Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/a;
.super Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/qq/e/ads/nativ/NativeUnifiedADData;Lcom/qq/e/ads/nativ/NativeUnifiedAD;Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;Ljava/util/Map;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qq/e/ads/nativ/NativeUnifiedADData;",
            "Lcom/qq/e/ads/nativ/NativeUnifiedAD;",
            "Lcom/aggmoread/sdk/z/c/a/a/d/b/d;",
            "Lcom/aggmoread/sdk/z/c/a/a/d/b/e;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;I)V"
        }
    .end annotation

    invoke-direct/range {p0 .. p6}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e;-><init>(Lcom/qq/e/ads/nativ/NativeUnifiedADData;Lcom/qq/e/ads/nativ/NativeUnifiedAD;Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;Ljava/util/Map;I)V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;Ljava/util/List;Landroid/view/View;Landroid/view/View;Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;)Landroid/view/View;
    .locals 9
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p7    # Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/view/View;",
            "Landroid/widget/FrameLayout$LayoutParams;",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;",
            "Landroid/view/View;",
            "Landroid/view/View;",
            "Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;",
            ")",
            "Landroid/view/View;"
        }
    .end annotation

    move-object v7, p0

    move-object v8, p2

    move-object v0, p6

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e;->r:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "esp enter v = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", r = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget v1, v7, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e;->o:I

    const/4 v2, 0x0

    const/16 v3, 0x5b

    if-ne v1, v3, :cond_0

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    const v1, 0x3baa23b1

    const-string v3, "GDT ad blocked"

    invoke-direct {v0, v1, v3}, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;-><init>(ILjava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)V

    return-object v2

    :cond_0
    if-nez p4, :cond_1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    move-object v4, v1

    goto :goto_0

    :cond_1
    move-object v4, p4

    :goto_0
    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    move-object v0, v8

    :goto_1
    invoke-interface {v4, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e;->r:Ljava/lang/String;

    const-string v3, "ovov + true"

    goto :goto_2

    :cond_3
    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e;->r:Ljava/lang/String;

    const-string v3, "ovov + false"

    :goto_2
    invoke-static {v1, v3}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, v7, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->e:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-static {v1}, Lcom/aggmoread/sdk/z/c/a/a/e/m;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v4, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e;->r:Ljava/lang/String;

    const-string v3, "ovov "

    invoke-static {v1, v3}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    move-object/from16 v6, p7

    iput-object v6, v7, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->c:Lcom/aggmoread/sdk/z/c/a/a/c/f;

    instance-of v0, v8, Lcom/qq/e/ads/nativ/widget/NativeAdContainer;

    if-eqz v0, :cond_6

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e;->r:Ljava/lang/String;

    const-string v1, "esp nativ"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v7, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->j:[Ljava/lang/Object;

    invoke-static {p2, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/l;->a(Landroid/view/View;[Ljava/lang/Object;)V

    move-object v2, v8

    check-cast v2, Lcom/qq/e/ads/nativ/widget/NativeAdContainer;

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p3

    move-object/from16 v6, p7

    invoke-virtual/range {v0 .. v6}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e;->a(Landroid/content/Context;Lcom/qq/e/ads/nativ/widget/NativeAdContainer;Landroid/widget/FrameLayout$LayoutParams;Ljava/util/List;Ljava/lang/ref/WeakReference;Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;)V

    const/4 v0, 0x0

    if-eqz p5, :cond_5

    const/4 v1, 0x1

    new-array v1, v1, [Landroid/view/View;

    aput-object p5, v1, v0

    goto :goto_3

    :cond_5
    new-array v1, v0, [Landroid/view/View;

    :goto_3
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, v7, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e;->q:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0, p2, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e;->a(Landroid/view/View;[Landroid/view/View;)V

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e;->r:Ljava/lang/String;

    const-string v1, "exit"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-object v8

    :cond_6
    return-object v2
.end method
