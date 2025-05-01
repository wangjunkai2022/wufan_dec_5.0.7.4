.class public Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/a;
.super Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/baidu/mobads/sdk/api/NativeResponse;Lcom/baidu/mobads/sdk/api/BaiduNativeManager;Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/baidu/mobads/sdk/api/NativeResponse;",
            "Lcom/baidu/mobads/sdk/api/BaiduNativeManager;",
            "Lcom/aggmoread/sdk/z/c/a/a/d/b/d;",
            "Lcom/aggmoread/sdk/z/c/a/a/d/b/e;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-direct/range {p0 .. p5}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;-><init>(Lcom/baidu/mobads/sdk/api/NativeResponse;Lcom/baidu/mobads/sdk/api/BaiduNativeManager;Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;Ljava/util/List;Landroid/view/View;Landroid/view/View;Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;)Landroid/view/View;
    .locals 7
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

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->r:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "esp enter v = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", r = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    if-nez p4, :cond_0

    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    move-object v4, p4

    if-eqz p6, :cond_1

    goto :goto_0

    :cond_1
    move-object p6, p2

    :goto_0
    invoke-interface {v4, p6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_2

    sget-object p4, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->r:Ljava/lang/String;

    const-string v0, "ovov + true"

    goto :goto_1

    :cond_2
    sget-object p4, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->r:Ljava/lang/String;

    const-string v0, "ovov + false"

    :goto_1
    invoke-static {p4, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p4, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->e:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-static {p4}, Lcom/aggmoread/sdk/z/c/a/a/e/m;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)Z

    move-result p4

    if-eqz p4, :cond_3

    invoke-interface {v4, p6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p4

    if-nez p4, :cond_3

    sget-object p4, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->r:Ljava/lang/String;

    const-string v0, "ovov "

    invoke-static {p4, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, p6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    iput-object p7, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->c:Lcom/aggmoread/sdk/z/c/a/a/c/f;

    instance-of p4, p2, Landroid/view/ViewGroup;

    if-eqz p4, :cond_5

    sget-object p4, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->r:Ljava/lang/String;

    const-string p6, "esp nativ"

    invoke-static {p4, p6}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p4, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->j:[Ljava/lang/Object;

    invoke-static {p2, p4}, Lcom/aggmoread/sdk/z/c/a/a/d/b/l;->a(Landroid/view/View;[Ljava/lang/Object;)V

    move-object v2, p2

    check-cast v2, Landroid/view/ViewGroup;

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p3

    move-object v6, p7

    invoke-virtual/range {v0 .. v6}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->a(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/widget/FrameLayout$LayoutParams;Ljava/util/List;Ljava/lang/ref/WeakReference;Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;)V

    const/4 p1, 0x0

    if-eqz p5, :cond_4

    const/4 p3, 0x1

    new-array p3, p3, [Landroid/view/View;

    aput-object p5, p3, p1

    goto :goto_2

    :cond_4
    new-array p3, p1, [Landroid/view/View;

    :goto_2
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->p:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0, p2, p3}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->a(Landroid/view/View;[Landroid/view/View;)V

    sget-object p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->r:Ljava/lang/String;

    const-string p3, "exit"

    invoke-static {p1, p3}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-object p2

    :cond_5
    const/4 p1, 0x0

    return-object p1
.end method
