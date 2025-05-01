.class Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/qq/e/ads/nativ/NativeADEventListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e;->a(Landroid/content/Context;Lcom/qq/e/ads/nativ/widget/NativeAdContainer;Landroid/widget/FrameLayout$LayoutParams;Ljava/util/List;Ljava/lang/ref/WeakReference;Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/ref/WeakReference;

.field final synthetic b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;

.field final synthetic c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e;Ljava/lang/ref/WeakReference;Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e$a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e$a;->a:Ljava/lang/ref/WeakReference;

    iput-object p3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e$a;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onADClicked()V
    .locals 10

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e;->r:Ljava/lang/String;

    const-string v1, "onADClicked"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e$a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e;

    iget v1, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->f:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->f:I

    new-instance v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;

    iget-object v3, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->e:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-direct {v1, v3, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->n:Ljava/lang/Object;

    iget-object v3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e$a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e;

    iget-object v3, v3, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->b:Ljava/lang/String;

    invoke-virtual {v1, v0, v3}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/aggmoread/sdk/z/c/a/a/d/b/k;

    move-result-object v4

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e$a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e;

    iget-object v5, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->e:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e$a;->a:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;

    :goto_0
    move-object v6, v0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e$a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e;

    iget-wide v7, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->g:J

    iget-object v9, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->j:[Ljava/lang/Object;

    invoke-virtual/range {v4 .. v9}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;J[Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->b()V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e$a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->j:[Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {v1, v3, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/l;->a(Ljava/lang/Object;ZZ)V

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e$a;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;->onAdClicked()V

    :cond_1
    return-void
.end method

.method public onADError(Lcom/qq/e/comm/util/AdError;)V
    .locals 3

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e;->r:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string v2, "onADError %s"

    invoke-static {v0, v2, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e$a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e;

    new-instance v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    invoke-virtual {p1}, Lcom/qq/e/comm/util/AdError;->getErrorCode()I

    move-result v2

    invoke-virtual {p1}, Lcom/qq/e/comm/util/AdError;->getErrorMsg()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;-><init>(ILjava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)V

    return-void
.end method

.method public onADExposed()V
    .locals 3

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e;->r:Ljava/lang/String;

    const-string v1, "onADExposed "

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e$a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->g:J

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e$a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->j:[Ljava/lang/Object;

    const/4 v1, 0x1

    invoke-static {v0, v1, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/l;->a(Ljava/lang/Object;ZZ)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e$a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e$a;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e;Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;)V

    return-void
.end method

.method public onADStatusChanged()V
    .locals 2

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e;->r:Ljava/lang/String;

    const-string v1, "onADStatusChanged"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e$a;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;

    instance-of v1, v0, Lcom/aggmoread/sdk/z/c/a/a/c/o/e$b;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/aggmoread/sdk/z/c/a/a/c/o/e$b;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e$a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e;->n:Lcom/qq/e/ads/nativ/NativeUnifiedADData;

    invoke-interface {v1}, Lcom/qq/e/ads/nativ/NativeUnifiedADData;->getAppStatus()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/o/e$b;->onADStatusChanged(I)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e$a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e;->n:Lcom/qq/e/ads/nativ/NativeUnifiedADData;

    invoke-interface {v0}, Lcom/qq/e/ads/nativ/NativeUnifiedADData;->getAppStatus()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e$a;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;

    check-cast v0, Lcom/aggmoread/sdk/z/c/a/a/c/o/e$b;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e$a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e;->n:Lcom/qq/e/ads/nativ/NativeUnifiedADData;

    invoke-interface {v1}, Lcom/qq/e/ads/nativ/NativeUnifiedADData;->getProgress()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/o/e$b;->onLoadApkProgress(I)V

    :cond_0
    return-void
.end method
