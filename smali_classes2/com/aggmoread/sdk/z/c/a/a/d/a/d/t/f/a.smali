.class public Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/f/a;
.super Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b;
.source "SourceFile"

# interfaces
.implements Lcom/qq/e/ads/nativ/NativeExpressMediaListener;


# static fields
.field private static s:Ljava/lang/String; = "AMDRAWTAGGDT"


# instance fields
.field private p:Lcom/qq/e/ads/nativ/NativeExpressADView;

.field private q:Lcom/qq/e/comm/pi/AdData;

.field private r:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/qq/e/ads/nativ/NativeExpressADView;Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qq/e/ads/nativ/NativeExpressADView;",
            "Lcom/aggmoread/sdk/z/c/a/a/d/b/d;",
            "Lcom/aggmoread/sdk/z/c/a/a/d/b/e;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p2, p3, p4}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;Ljava/util/Map;)V

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/f/a;->p:Lcom/qq/e/ads/nativ/NativeExpressADView;

    iget-object p2, p2, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->t:Lcom/aggmoread/sdk/z/c/a/a/d/a/c;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b;->o:Lcom/aggmoread/sdk/z/c/a/a/d/a/c;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/qq/e/ads/nativ/NativeExpressADView;->getBoundData()Lcom/qq/e/comm/pi/AdData;

    move-result-object p1

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/f/a;->q:Lcom/qq/e/comm/pi/AdData;

    iget-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b;->l:Ljava/util/Map;

    invoke-static {p2, p1, p3}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/b;->a(Ljava/util/Map;Ljava/lang/Object;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public a()Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/f/a;->r:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;

    return-object v0

    :cond_0
    invoke-super {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->a()Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/aggmoread/sdk/z/c/a/a/d/a/c;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b;->o:Lcom/aggmoread/sdk/z/c/a/a/d/a/c;

    return-void
.end method

.method public b(I)V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/f/a;->p:Lcom/qq/e/ads/nativ/NativeExpressADView;

    invoke-static {v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d;->a(Ljava/lang/Object;I)V

    return-void
.end method

.method public b(IILjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/f/a;->p:Lcom/qq/e/ads/nativ/NativeExpressADView;

    invoke-static {v0, p2, p1, p3}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d;->a(Ljava/lang/Object;IILjava/lang/String;)V

    return-void
.end method

.method public destroy()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/f/a;->p:Lcom/qq/e/ads/nativ/NativeExpressADView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/qq/e/ads/nativ/NativeExpressADView;->destroy()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/f/a;->p:Lcom/qq/e/ads/nativ/NativeExpressADView;

    :cond_0
    return-void
.end method

.method protected getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/f/a;->q:Lcom/qq/e/comm/pi/AdData;

    invoke-interface {v0}, Lcom/qq/e/comm/pi/AdData;->getTitle()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getView()Landroid/view/View;
    .locals 4

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/f/a;->r:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/f/a;->s:Ljava/lang/String;

    const-string v1, "get "

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/f/a;->r:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0

    :cond_1
    :goto_0
    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;-><init>(Landroid/content/Context;)V

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x2

    invoke-direct {v1, v2, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v2, 0x11

    iput v2, v1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/f/a;->p:Lcom/qq/e/ads/nativ/NativeExpressADView;

    invoke-virtual {v0, v2, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/f/a;->r:Ljava/lang/ref/WeakReference;

    return-object v0
.end method

.method public j()Lcom/aggmoread/sdk/z/c/a/a/c/n/b;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b;->n:Lcom/aggmoread/sdk/z/c/a/a/c/n/b;

    return-object v0
.end method

.method public onVideoCached(Lcom/qq/e/ads/nativ/NativeExpressADView;)V
    .locals 0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b;->m:Lcom/aggmoread/sdk/z/c/a/a/c/n/d;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/c/n/d;->onVideoCached()V

    :cond_0
    return-void
.end method

.method public onVideoComplete(Lcom/qq/e/ads/nativ/NativeExpressADView;)V
    .locals 0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b;->m:Lcom/aggmoread/sdk/z/c/a/a/c/n/d;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/c/n/d;->onVideoComplete()V

    :cond_0
    return-void
.end method

.method public onVideoError(Lcom/qq/e/ads/nativ/NativeExpressADView;Lcom/qq/e/comm/util/AdError;)V
    .locals 2

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b;->m:Lcom/aggmoread/sdk/z/c/a/a/c/n/d;

    if-eqz p1, :cond_0

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    invoke-virtual {p2}, Lcom/qq/e/comm/util/AdError;->getErrorCode()I

    move-result v1

    invoke-virtual {p2}, Lcom/qq/e/comm/util/AdError;->getErrorMsg()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, v1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;-><init>(ILjava/lang/String;)V

    invoke-interface {p1, v0}, Lcom/aggmoread/sdk/z/c/a/a/c/n/d;->a(Lcom/aggmoread/sdk/z/c/a/a/c/d;)V

    :cond_0
    return-void
.end method

.method public onVideoInit(Lcom/qq/e/ads/nativ/NativeExpressADView;)V
    .locals 0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b;->m:Lcom/aggmoread/sdk/z/c/a/a/c/n/d;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/c/n/d;->onVideoInit()V

    :cond_0
    return-void
.end method

.method public onVideoLoading(Lcom/qq/e/ads/nativ/NativeExpressADView;)V
    .locals 0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b;->m:Lcom/aggmoread/sdk/z/c/a/a/c/n/d;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/c/n/d;->onVideoLoading()V

    :cond_0
    return-void
.end method

.method public onVideoPageClose(Lcom/qq/e/ads/nativ/NativeExpressADView;)V
    .locals 0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b;->m:Lcom/aggmoread/sdk/z/c/a/a/c/n/d;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/c/n/d;->b()V

    :cond_0
    return-void
.end method

.method public onVideoPageOpen(Lcom/qq/e/ads/nativ/NativeExpressADView;)V
    .locals 0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b;->m:Lcom/aggmoread/sdk/z/c/a/a/c/n/d;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/c/n/d;->c()V

    :cond_0
    return-void
.end method

.method public onVideoPause(Lcom/qq/e/ads/nativ/NativeExpressADView;)V
    .locals 0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b;->m:Lcom/aggmoread/sdk/z/c/a/a/c/n/d;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/c/n/d;->onVideoPause()V

    :cond_0
    return-void
.end method

.method public onVideoReady(Lcom/qq/e/ads/nativ/NativeExpressADView;J)V
    .locals 0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b;->m:Lcom/aggmoread/sdk/z/c/a/a/c/n/d;

    if-eqz p1, :cond_0

    invoke-interface {p1, p2, p3}, Lcom/aggmoread/sdk/z/c/a/a/c/n/d;->a(J)V

    :cond_0
    return-void
.end method

.method public onVideoStart(Lcom/qq/e/ads/nativ/NativeExpressADView;)V
    .locals 0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b;->m:Lcom/aggmoread/sdk/z/c/a/a/c/n/d;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/c/n/d;->onVideoStart()V

    :cond_0
    return-void
.end method

.method public render()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/f/a;->p:Lcom/qq/e/ads/nativ/NativeExpressADView;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b;->c()Lcom/aggmoread/sdk/z/c/a/a/d/a/c;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/a;->a(Ljava/lang/Object;Lcom/aggmoread/sdk/z/c/a/a/d/a/c;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b;->m:Lcom/aggmoread/sdk/z/c/a/a/c/n/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/f/a;->p:Lcom/qq/e/ads/nativ/NativeExpressADView;

    invoke-virtual {v0, p0}, Lcom/qq/e/ads/nativ/NativeExpressADView;->setMediaListener(Lcom/qq/e/ads/nativ/NativeExpressMediaListener;)V

    :cond_0
    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/f/a;->s:Ljava/lang/String;

    const-string v1, "render"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/f/a;->p:Lcom/qq/e/ads/nativ/NativeExpressADView;

    invoke-virtual {v0}, Lcom/qq/e/ads/nativ/NativeExpressADView;->render()V

    :cond_1
    return-void
.end method

.method public renderActivity(Landroid/app/Activity;)V
    .locals 0

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/f/a;->render()V

    return-void
.end method
