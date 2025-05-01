.class Lcom/beizi/fusion/work/interstitial/d$a$2;
.super Ljava/lang/Object;
.source "GdtNativeInterstitialWorker.java"

# interfaces
.implements Lcom/qq/e/ads/nativ/NativeADMediaListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/interstitial/d$a;->onADLoaded(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:Z

.field final synthetic b:Lcom/beizi/fusion/work/interstitial/d$a;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/interstitial/d$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/interstitial/d$a$2;->b:Lcom/beizi/fusion/work/interstitial/d$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/beizi/fusion/work/interstitial/d$a$2;->a:Z

    return-void
.end method


# virtual methods
.method public onVideoClicked()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/d$a$2;->b:Lcom/beizi/fusion/work/interstitial/d$a;

    iget-object v0, v0, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/d;->n(Lcom/beizi/fusion/work/interstitial/d;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/d$a$2;->b:Lcom/beizi/fusion/work/interstitial/d$a;

    iget-object v0, v0, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/d;->o(Lcom/beizi/fusion/work/interstitial/d;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/d$a$2;->b:Lcom/beizi/fusion/work/interstitial/d$a;

    iget-object v0, v0, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/d;->p(Lcom/beizi/fusion/work/interstitial/d;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/interstitial/d$a$2;->b:Lcom/beizi/fusion/work/interstitial/d$a;

    iget-object v1, v1, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    invoke-virtual {v1}, Lcom/beizi/fusion/work/interstitial/d;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/d/e;->d(Ljava/lang/String;)V

    .line 3
    :cond_0
    iget-boolean v0, p0, Lcom/beizi/fusion/work/interstitial/d$a$2;->a:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/beizi/fusion/work/interstitial/d$a$2;->a:Z

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/d$a$2;->b:Lcom/beizi/fusion/work/interstitial/d$a;

    iget-object v0, v0, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/d;->q(Lcom/beizi/fusion/work/interstitial/d;)V

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/d$a$2;->b:Lcom/beizi/fusion/work/interstitial/d$a;

    iget-object v0, v0, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/d;->r(Lcom/beizi/fusion/work/interstitial/d;)V

    :cond_1
    return-void
.end method

.method public onVideoCompleted()V
    .locals 0

    return-void
.end method

.method public onVideoError(Lcom/qq/e/comm/util/AdError;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ShowGdtInterstitialCustom MediaView onVideoError: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/qq/e/comm/util/AdError;->getErrorMsg()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/d$a$2;->b:Lcom/beizi/fusion/work/interstitial/d$a;

    iget-object v0, v0, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    invoke-virtual {p1}, Lcom/qq/e/comm/util/AdError;->getErrorMsg()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/qq/e/comm/util/AdError;->getErrorCode()I

    move-result p1

    invoke-static {v0, v1, p1}, Lcom/beizi/fusion/work/interstitial/d;->c(Lcom/beizi/fusion/work/interstitial/d;Ljava/lang/String;I)V

    return-void
.end method

.method public onVideoInit()V
    .locals 0

    return-void
.end method

.method public onVideoLoaded(I)V
    .locals 0

    return-void
.end method

.method public onVideoLoading()V
    .locals 0

    return-void
.end method

.method public onVideoPause()V
    .locals 0

    return-void
.end method

.method public onVideoReady()V
    .locals 0

    return-void
.end method

.method public onVideoResume()V
    .locals 0

    return-void
.end method

.method public onVideoStart()V
    .locals 0

    return-void
.end method

.method public onVideoStop()V
    .locals 0

    return-void
.end method
