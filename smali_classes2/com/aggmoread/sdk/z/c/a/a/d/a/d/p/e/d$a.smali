.class Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/baidu/mobads/sdk/api/NativeResponse$AdInteractionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->a(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/widget/FrameLayout$LayoutParams;Ljava/util/List;Ljava/lang/ref/WeakReference;Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/ref/WeakReference;

.field final synthetic b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;

.field final synthetic c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;Ljava/lang/ref/WeakReference;Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d$a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d$a;->a:Ljava/lang/ref/WeakReference;

    iput-object p3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d$a;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onADExposed()V
    .locals 5

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->r:Ljava/lang/String;

    const-string v1, "onADExposed "

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d$a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->g:J

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/e/k;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d$a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;

    iget-object v2, v2, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->e:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    iget-object v2, v2, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->b:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v3, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->f:Ljava/lang/Object;

    const-string v4, "-1"

    invoke-virtual {v2, v3, v4}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d$a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->j:[Ljava/lang/Object;

    const/4 v1, 0x1

    invoke-static {v0, v1, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/l;->a(Ljava/lang/Object;ZZ)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d$a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d$a;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;)V

    return-void
.end method

.method public onADExposureFailed(I)V
    .locals 4

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->r:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "onADError %d"

    invoke-static {v0, v2, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d$a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;

    new-instance v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    const/16 v2, -0x3e8

    invoke-direct {v1, v2, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;-><init>(ILjava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)V

    return-void
.end method

.method public onADStatusChanged()V
    .locals 3

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->r:Ljava/lang/String;

    const-string v1, "onADStatusChanged"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d$a;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;

    instance-of v0, v0, Lcom/aggmoread/sdk/z/c/a/a/c/o/e$b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d$a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->n:Lcom/baidu/mobads/sdk/api/NativeResponse;

    invoke-interface {v0}, Lcom/baidu/mobads/sdk/api/NativeResponse;->getDownloadStatus()I

    move-result v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d$a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;I)I

    move-result v1

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d$a;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;

    check-cast v2, Lcom/aggmoread/sdk/z/c/a/a/c/o/e$b;

    invoke-interface {v2, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/o/e$b;->onADStatusChanged(I)V

    const/4 v2, 0x4

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d$a;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;

    check-cast v1, Lcom/aggmoread/sdk/z/c/a/a/c/o/e$b;

    invoke-interface {v1, v0}, Lcom/aggmoread/sdk/z/c/a/a/c/o/e$b;->onLoadApkProgress(I)V

    :cond_0
    return-void
.end method

.method public onAdClick()V
    .locals 10

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->r:Ljava/lang/String;

    const-string v1, "onADClicked"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d$a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;

    iget v1, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->f:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->f:I

    new-instance v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;

    iget-object v3, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->e:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-direct {v1, v3, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->n:Ljava/lang/Object;

    iget-object v3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d$a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;

    iget-object v3, v3, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->b:Ljava/lang/String;

    invoke-virtual {v1, v0, v3}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/aggmoread/sdk/z/c/a/a/d/b/k;

    move-result-object v4

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d$a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;

    iget-object v5, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->e:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d$a;->a:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;

    :goto_0
    move-object v6, v0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d$a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;

    iget-wide v7, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->g:J

    iget-object v9, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->j:[Ljava/lang/Object;

    invoke-virtual/range {v4 .. v9}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;J[Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->b()V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d$a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->j:[Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {v1, v3, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/l;->a(Ljava/lang/Object;ZZ)V

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d$a;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;->onAdClicked()V

    :cond_1
    return-void
.end method

.method public onAdUnionClick()V
    .locals 0

    return-void
.end method
