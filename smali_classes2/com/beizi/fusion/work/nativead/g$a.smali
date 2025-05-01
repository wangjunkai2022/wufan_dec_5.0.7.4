.class Lcom/beizi/fusion/work/nativead/g$a;
.super Ljava/lang/Object;
.source "GdtNativeAdWorker.java"

# interfaces
.implements Lcom/qq/e/ads/nativ/NativeExpressAD$NativeExpressADListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/fusion/work/nativead/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field a:Z

.field b:Z

.field final synthetic c:Lcom/beizi/fusion/work/nativead/g;


# direct methods
.method private constructor <init>(Lcom/beizi/fusion/work/nativead/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/nativead/g$a;->c:Lcom/beizi/fusion/work/nativead/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/beizi/fusion/work/nativead/g$a;->a:Z

    .line 3
    iput-boolean p1, p0, Lcom/beizi/fusion/work/nativead/g$a;->b:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/beizi/fusion/work/nativead/g;Lcom/beizi/fusion/work/nativead/g$1;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1}, Lcom/beizi/fusion/work/nativead/g$a;-><init>(Lcom/beizi/fusion/work/nativead/g;)V

    return-void
.end method


# virtual methods
.method public onADClicked(Lcom/qq/e/ads/nativ/NativeExpressADView;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/g$a;->c:Lcom/beizi/fusion/work/nativead/g;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/g;->k(Lcom/beizi/fusion/work/nativead/g;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/g$a;->c:Lcom/beizi/fusion/work/nativead/g;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/g;->l(Lcom/beizi/fusion/work/nativead/g;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/beizi/fusion/d/e;->r()I

    move-result p1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/g$a;->c:Lcom/beizi/fusion/work/nativead/g;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/g;->m(Lcom/beizi/fusion/work/nativead/g;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/g$a;->c:Lcom/beizi/fusion/work/nativead/g;

    invoke-virtual {v0}, Lcom/beizi/fusion/work/nativead/g;->g()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/beizi/fusion/d/e;->d(Ljava/lang/String;)V

    .line 3
    :cond_0
    iget-boolean p1, p0, Lcom/beizi/fusion/work/nativead/g$a;->b:Z

    if-nez p1, :cond_1

    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lcom/beizi/fusion/work/nativead/g$a;->b:Z

    .line 5
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/g$a;->c:Lcom/beizi/fusion/work/nativead/g;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/g;->n(Lcom/beizi/fusion/work/nativead/g;)V

    .line 6
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/g$a;->c:Lcom/beizi/fusion/work/nativead/g;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/g;->o(Lcom/beizi/fusion/work/nativead/g;)V

    :cond_1
    return-void
.end method

.method public onADClosed(Lcom/qq/e/ads/nativ/NativeExpressADView;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/g$a;->c:Lcom/beizi/fusion/work/nativead/g;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/g;->p(Lcom/beizi/fusion/work/nativead/g;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/g$a;->c:Lcom/beizi/fusion/work/nativead/g;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/g;->q(Lcom/beizi/fusion/work/nativead/g;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/beizi/fusion/d/e;->r()I

    move-result p1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/g$a;->c:Lcom/beizi/fusion/work/nativead/g;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/g;->s(Lcom/beizi/fusion/work/nativead/g;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/g$a;->c:Lcom/beizi/fusion/work/nativead/g;

    invoke-virtual {v0}, Lcom/beizi/fusion/work/nativead/g;->g()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/nativead/g$a;->c:Lcom/beizi/fusion/work/nativead/g;

    invoke-static {v1}, Lcom/beizi/fusion/work/nativead/g;->r(Lcom/beizi/fusion/work/nativead/g;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/beizi/fusion/d/e;->b(Ljava/lang/String;Landroid/view/View;)V

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/g$a;->c:Lcom/beizi/fusion/work/nativead/g;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/g;->t(Lcom/beizi/fusion/work/nativead/g;)V

    return-void
.end method

.method public onADExposure(Lcom/qq/e/ads/nativ/NativeExpressADView;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/g$a;->c:Lcom/beizi/fusion/work/nativead/g;

    sget-object v0, Lcom/beizi/fusion/f/a;->c:Lcom/beizi/fusion/f/a;

    invoke-static {p1, v0}, Lcom/beizi/fusion/work/nativead/g;->b(Lcom/beizi/fusion/work/nativead/g;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/g$a;->c:Lcom/beizi/fusion/work/nativead/g;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/g;->e(Lcom/beizi/fusion/work/nativead/g;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/g$a;->c:Lcom/beizi/fusion/work/nativead/g;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/g;->f(Lcom/beizi/fusion/work/nativead/g;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/beizi/fusion/d/e;->r()I

    move-result p1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    .line 3
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/g$a;->c:Lcom/beizi/fusion/work/nativead/g;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/g;->g(Lcom/beizi/fusion/work/nativead/g;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/g$a;->c:Lcom/beizi/fusion/work/nativead/g;

    invoke-virtual {v0}, Lcom/beizi/fusion/work/nativead/g;->g()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/beizi/fusion/d/e;->b(Ljava/lang/String;)V

    .line 4
    :cond_0
    iget-boolean p1, p0, Lcom/beizi/fusion/work/nativead/g$a;->a:Z

    if-nez p1, :cond_1

    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lcom/beizi/fusion/work/nativead/g$a;->a:Z

    .line 6
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/g$a;->c:Lcom/beizi/fusion/work/nativead/g;

    invoke-virtual {p1}, Lcom/beizi/fusion/work/nativead/g;->az()V

    .line 7
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/g$a;->c:Lcom/beizi/fusion/work/nativead/g;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/g;->h(Lcom/beizi/fusion/work/nativead/g;)V

    .line 8
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/g$a;->c:Lcom/beizi/fusion/work/nativead/g;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/g;->i(Lcom/beizi/fusion/work/nativead/g;)V

    .line 9
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/g$a;->c:Lcom/beizi/fusion/work/nativead/g;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/g;->j(Lcom/beizi/fusion/work/nativead/g;)V

    :cond_1
    return-void
.end method

.method public onADLeftApplication(Lcom/qq/e/ads/nativ/NativeExpressADView;)V
    .locals 0

    return-void
.end method

.method public onADLoaded(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/qq/e/ads/nativ/NativeExpressADView;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/g$a;->c:Lcom/beizi/fusion/work/nativead/g;

    sget-object v1, Lcom/beizi/fusion/f/a;->b:Lcom/beizi/fusion/f/a;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/nativead/g;->a(Lcom/beizi/fusion/work/nativead/g;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/g$a;->c:Lcom/beizi/fusion/work/nativead/g;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/g;->a(Lcom/beizi/fusion/work/nativead/g;)V

    if-eqz p1, :cond_6

    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/g$a;->c:Lcom/beizi/fusion/work/nativead/g;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/g;->b(Lcom/beizi/fusion/work/nativead/g;)Lcom/qq/e/ads/nativ/NativeExpressADView;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/g$a;->c:Lcom/beizi/fusion/work/nativead/g;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/g;->b(Lcom/beizi/fusion/work/nativead/g;)Lcom/qq/e/ads/nativ/NativeExpressADView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qq/e/ads/nativ/NativeExpressADView;->destroy()V

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/g$a;->c:Lcom/beizi/fusion/work/nativead/g;

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/qq/e/ads/nativ/NativeExpressADView;

    invoke-static {v0, p1}, Lcom/beizi/fusion/work/nativead/g;->a(Lcom/beizi/fusion/work/nativead/g;Lcom/qq/e/ads/nativ/NativeExpressADView;)Lcom/qq/e/ads/nativ/NativeExpressADView;

    .line 7
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/g$a;->c:Lcom/beizi/fusion/work/nativead/g;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/g;->b(Lcom/beizi/fusion/work/nativead/g;)Lcom/qq/e/ads/nativ/NativeExpressADView;

    move-result-object p1

    invoke-interface {p1}, Lcom/qq/e/comm/pi/LADI;->getECPM()I

    move-result p1

    if-lez p1, :cond_2

    .line 8
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/g$a;->c:Lcom/beizi/fusion/work/nativead/g;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/g;->b(Lcom/beizi/fusion/work/nativead/g;)Lcom/qq/e/ads/nativ/NativeExpressADView;

    move-result-object v0

    invoke-interface {v0}, Lcom/qq/e/comm/pi/LADI;->getECPM()I

    move-result v0

    int-to-double v0, v0

    invoke-static {p1, v0, v1}, Lcom/beizi/fusion/work/nativead/g;->a(Lcom/beizi/fusion/work/nativead/g;D)V

    .line 9
    :cond_2
    sget-boolean p1, Lcom/beizi/fusion/g/v;->a:Z

    if-eqz p1, :cond_3

    .line 10
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/g$a;->c:Lcom/beizi/fusion/work/nativead/g;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/g;->b(Lcom/beizi/fusion/work/nativead/g;)Lcom/qq/e/ads/nativ/NativeExpressADView;

    move-result-object p1

    sget-object v0, Lcom/beizi/fusion/g/v;->b:Lcom/qq/e/comm/compliance/DownloadConfirmListener;

    invoke-interface {p1, v0}, Lcom/qq/e/comm/compliance/ApkDownloadComplianceInterface;->setDownloadConfirmListener(Lcom/qq/e/comm/compliance/DownloadConfirmListener;)V

    .line 11
    :cond_3
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/g$a;->c:Lcom/beizi/fusion/work/nativead/g;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/g;->b(Lcom/beizi/fusion/work/nativead/g;)Lcom/qq/e/ads/nativ/NativeExpressADView;

    move-result-object p1

    invoke-virtual {p1}, Lcom/qq/e/ads/nativ/NativeExpressADView;->getBoundData()Lcom/qq/e/comm/pi/AdData;

    move-result-object p1

    invoke-interface {p1}, Lcom/qq/e/comm/pi/AdData;->getAdPatternType()I

    move-result p1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_4

    .line 12
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/g$a;->c:Lcom/beizi/fusion/work/nativead/g;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/beizi/fusion/work/nativead/g;->a(Lcom/beizi/fusion/work/nativead/g;Z)Z

    .line 13
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/g$a;->c:Lcom/beizi/fusion/work/nativead/g;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/g;->b(Lcom/beizi/fusion/work/nativead/g;)Lcom/qq/e/ads/nativ/NativeExpressADView;

    move-result-object p1

    new-instance v0, Lcom/beizi/fusion/work/nativead/g$a$1;

    invoke-direct {v0, p0}, Lcom/beizi/fusion/work/nativead/g$a$1;-><init>(Lcom/beizi/fusion/work/nativead/g$a;)V

    invoke-virtual {p1, v0}, Lcom/qq/e/ads/nativ/NativeExpressADView;->setMediaListener(Lcom/qq/e/ads/nativ/NativeExpressMediaListener;)V

    .line 14
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/g$a;->c:Lcom/beizi/fusion/work/nativead/g;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/g;->b(Lcom/beizi/fusion/work/nativead/g;)Lcom/qq/e/ads/nativ/NativeExpressADView;

    move-result-object p1

    invoke-virtual {p1}, Lcom/qq/e/ads/nativ/NativeExpressADView;->preloadVideo()V

    .line 15
    :cond_4
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/g$a;->c:Lcom/beizi/fusion/work/nativead/g;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/g;->b(Lcom/beizi/fusion/work/nativead/g;)Lcom/qq/e/ads/nativ/NativeExpressADView;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/beizi/fusion/work/nativead/g;->a(Lcom/beizi/fusion/work/nativead/g;Landroid/view/View;)Landroid/view/View;

    .line 16
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/g$a;->c:Lcom/beizi/fusion/work/nativead/g;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/g;->d(Lcom/beizi/fusion/work/nativead/g;)Z

    move-result p1

    if-nez p1, :cond_5

    .line 17
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/g$a;->c:Lcom/beizi/fusion/work/nativead/g;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/g;->c(Lcom/beizi/fusion/work/nativead/g;)V

    :cond_5
    return-void

    .line 18
    :cond_6
    :goto_0
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/g$a;->c:Lcom/beizi/fusion/work/nativead/g;

    const/16 v0, -0x3df

    invoke-static {p1, v0}, Lcom/beizi/fusion/work/nativead/g;->b(Lcom/beizi/fusion/work/nativead/g;I)V

    return-void
.end method

.method public onNoAD(Lcom/qq/e/comm/util/AdError;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "showGdtNativeAd onError:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/qq/e/comm/util/AdError;->getErrorMsg()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/g$a;->c:Lcom/beizi/fusion/work/nativead/g;

    invoke-virtual {p1}, Lcom/qq/e/comm/util/AdError;->getErrorMsg()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/qq/e/comm/util/AdError;->getErrorCode()I

    move-result p1

    invoke-static {v0, v1, p1}, Lcom/beizi/fusion/work/nativead/g;->a(Lcom/beizi/fusion/work/nativead/g;Ljava/lang/String;I)V

    return-void
.end method

.method public onRenderFail(Lcom/qq/e/ads/nativ/NativeExpressADView;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/g$a;->c:Lcom/beizi/fusion/work/nativead/g;

    const-string v0, "sdk custom error "

    const-string v1, "Render Fail"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const v1, 0x18697

    invoke-static {p1, v0, v1}, Lcom/beizi/fusion/work/nativead/g;->b(Lcom/beizi/fusion/work/nativead/g;Ljava/lang/String;I)V

    return-void
.end method

.method public onRenderSuccess(Lcom/qq/e/ads/nativ/NativeExpressADView;)V
    .locals 0

    return-void
.end method
