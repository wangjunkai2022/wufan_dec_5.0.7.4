.class Lcom/beizi/fusion/work/a/d$a;
.super Ljava/lang/Object;
.source "GdtBannerAdWorker.java"

# interfaces
.implements Lcom/qq/e/ads/banner2/UnifiedBannerADListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/fusion/work/a/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field a:Z

.field b:Z

.field final synthetic c:Lcom/beizi/fusion/work/a/d;


# direct methods
.method private constructor <init>(Lcom/beizi/fusion/work/a/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/a/d$a;->c:Lcom/beizi/fusion/work/a/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/beizi/fusion/work/a/d$a;->a:Z

    .line 3
    iput-boolean p1, p0, Lcom/beizi/fusion/work/a/d$a;->b:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/beizi/fusion/work/a/d;Lcom/beizi/fusion/work/a/d$1;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1}, Lcom/beizi/fusion/work/a/d$a;-><init>(Lcom/beizi/fusion/work/a/d;)V

    return-void
.end method


# virtual methods
.method public onADClicked()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/a/d$a;->c:Lcom/beizi/fusion/work/a/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/d;->o(Lcom/beizi/fusion/work/a/d;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/a/d$a;->c:Lcom/beizi/fusion/work/a/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/d;->p(Lcom/beizi/fusion/work/a/d;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/a/d$a;->c:Lcom/beizi/fusion/work/a/d;

    invoke-virtual {v1}, Lcom/beizi/fusion/work/a/d;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/d/e;->d(Ljava/lang/String;)V

    .line 3
    :cond_0
    iget-boolean v0, p0, Lcom/beizi/fusion/work/a/d$a;->b:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/beizi/fusion/work/a/d$a;->b:Z

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/work/a/d$a;->c:Lcom/beizi/fusion/work/a/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/d;->q(Lcom/beizi/fusion/work/a/d;)V

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/work/a/d$a;->c:Lcom/beizi/fusion/work/a/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/d;->r(Lcom/beizi/fusion/work/a/d;)V

    :cond_1
    return-void
.end method

.method public onADClosed()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/a/d$a;->c:Lcom/beizi/fusion/work/a/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/d;->l(Lcom/beizi/fusion/work/a/d;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/a/d$a;->c:Lcom/beizi/fusion/work/a/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/d;->m(Lcom/beizi/fusion/work/a/d;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/a/d$a;->c:Lcom/beizi/fusion/work/a/d;

    invoke-virtual {v1}, Lcom/beizi/fusion/work/a/d;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/d/e;->c(Ljava/lang/String;)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/a/d$a;->c:Lcom/beizi/fusion/work/a/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/d;->n(Lcom/beizi/fusion/work/a/d;)V

    return-void
.end method

.method public onADExposure()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/a/d$a;->c:Lcom/beizi/fusion/work/a/d;

    sget-object v1, Lcom/beizi/fusion/f/a;->c:Lcom/beizi/fusion/f/a;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/a/d;->b(Lcom/beizi/fusion/work/a/d;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/a/d$a;->c:Lcom/beizi/fusion/work/a/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/d;->g(Lcom/beizi/fusion/work/a/d;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/a/d$a;->c:Lcom/beizi/fusion/work/a/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/d;->h(Lcom/beizi/fusion/work/a/d;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/a/d$a;->c:Lcom/beizi/fusion/work/a/d;

    invoke-virtual {v1}, Lcom/beizi/fusion/work/a/d;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/d/e;->b(Ljava/lang/String;)V

    .line 4
    :cond_0
    iget-boolean v0, p0, Lcom/beizi/fusion/work/a/d$a;->a:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/beizi/fusion/work/a/d$a;->a:Z

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/work/a/d$a;->c:Lcom/beizi/fusion/work/a/d;

    invoke-virtual {v0}, Lcom/beizi/fusion/work/a/d;->az()V

    .line 7
    iget-object v0, p0, Lcom/beizi/fusion/work/a/d$a;->c:Lcom/beizi/fusion/work/a/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/d;->i(Lcom/beizi/fusion/work/a/d;)V

    .line 8
    iget-object v0, p0, Lcom/beizi/fusion/work/a/d$a;->c:Lcom/beizi/fusion/work/a/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/d;->j(Lcom/beizi/fusion/work/a/d;)V

    .line 9
    iget-object v0, p0, Lcom/beizi/fusion/work/a/d$a;->c:Lcom/beizi/fusion/work/a/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/d;->k(Lcom/beizi/fusion/work/a/d;)V

    :cond_1
    return-void
.end method

.method public onADLeftApplication()V
    .locals 0

    return-void
.end method

.method public onADReceive()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/a/d$a;->c:Lcom/beizi/fusion/work/a/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/d;->b(Lcom/beizi/fusion/work/a/d;)Lcom/qq/e/ads/banner2/UnifiedBannerView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qq/e/ads/banner2/UnifiedBannerView;->getECPM()I

    move-result v0

    if-lez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/a/d$a;->c:Lcom/beizi/fusion/work/a/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/d;->b(Lcom/beizi/fusion/work/a/d;)Lcom/qq/e/ads/banner2/UnifiedBannerView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qq/e/ads/banner2/UnifiedBannerView;->getECPM()I

    move-result v1

    int-to-double v1, v1

    invoke-static {v0, v1, v2}, Lcom/beizi/fusion/work/a/d;->a(Lcom/beizi/fusion/work/a/d;D)V

    .line 3
    :cond_0
    sget-boolean v0, Lcom/beizi/fusion/g/v;->a:Z

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/work/a/d$a;->c:Lcom/beizi/fusion/work/a/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/d;->b(Lcom/beizi/fusion/work/a/d;)Lcom/qq/e/ads/banner2/UnifiedBannerView;

    move-result-object v0

    sget-object v1, Lcom/beizi/fusion/g/v;->b:Lcom/qq/e/comm/compliance/DownloadConfirmListener;

    invoke-virtual {v0, v1}, Lcom/qq/e/ads/banner2/UnifiedBannerView;->setDownloadConfirmListener(Lcom/qq/e/comm/compliance/DownloadConfirmListener;)V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/beizi/fusion/work/a/d$a;->c:Lcom/beizi/fusion/work/a/d;

    sget-object v1, Lcom/beizi/fusion/f/a;->b:Lcom/beizi/fusion/f/a;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/a/d;->a(Lcom/beizi/fusion/work/a/d;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/work/a/d$a;->c:Lcom/beizi/fusion/work/a/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/d;->c(Lcom/beizi/fusion/work/a/d;)V

    .line 7
    iget-object v0, p0, Lcom/beizi/fusion/work/a/d$a;->c:Lcom/beizi/fusion/work/a/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/d;->d(Lcom/beizi/fusion/work/a/d;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 8
    iget-object v0, p0, Lcom/beizi/fusion/work/a/d$a;->c:Lcom/beizi/fusion/work/a/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/d;->e(Lcom/beizi/fusion/work/a/d;)V

    goto :goto_0

    .line 9
    :cond_2
    iget-object v0, p0, Lcom/beizi/fusion/work/a/d$a;->c:Lcom/beizi/fusion/work/a/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/d;->f(Lcom/beizi/fusion/work/a/d;)V

    :goto_0
    return-void
.end method

.method public onNoAD(Lcom/qq/e/comm/util/AdError;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "showGdtBannerAd onError:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/qq/e/comm/util/AdError;->getErrorMsg()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/a/d$a;->c:Lcom/beizi/fusion/work/a/d;

    invoke-virtual {p1}, Lcom/qq/e/comm/util/AdError;->getErrorMsg()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/qq/e/comm/util/AdError;->getErrorCode()I

    move-result p1

    invoke-static {v0, v1, p1}, Lcom/beizi/fusion/work/a/d;->a(Lcom/beizi/fusion/work/a/d;Ljava/lang/String;I)V

    .line 3
    iget-object p1, p0, Lcom/beizi/fusion/work/a/d$a;->c:Lcom/beizi/fusion/work/a/d;

    invoke-static {p1}, Lcom/beizi/fusion/work/a/d;->a(Lcom/beizi/fusion/work/a/d;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 4
    iget-object p1, p0, Lcom/beizi/fusion/work/a/d$a;->c:Lcom/beizi/fusion/work/a/d;

    invoke-virtual {p1}, Lcom/beizi/fusion/work/a/d;->m()V

    :cond_0
    return-void
.end method
