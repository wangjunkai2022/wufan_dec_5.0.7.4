.class Lcom/beizi/fusion/work/interstitial/d$a$1;
.super Ljava/lang/Object;
.source "GdtNativeInterstitialWorker.java"

# interfaces
.implements Lcom/qq/e/ads/nativ/NativeADEventListener;


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

.field b:Z

.field final synthetic c:Lcom/beizi/fusion/work/interstitial/d$a;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/interstitial/d$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/interstitial/d$a$1;->c:Lcom/beizi/fusion/work/interstitial/d$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/beizi/fusion/work/interstitial/d$a$1;->a:Z

    .line 3
    iput-boolean p1, p0, Lcom/beizi/fusion/work/interstitial/d$a$1;->b:Z

    return-void
.end method


# virtual methods
.method public onADClicked()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/d$a$1;->c:Lcom/beizi/fusion/work/interstitial/d$a;

    iget-object v0, v0, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/d;->i(Lcom/beizi/fusion/work/interstitial/d;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/d$a$1;->c:Lcom/beizi/fusion/work/interstitial/d$a;

    iget-object v0, v0, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/d;->j(Lcom/beizi/fusion/work/interstitial/d;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/d$a$1;->c:Lcom/beizi/fusion/work/interstitial/d$a;

    iget-object v0, v0, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/d;->k(Lcom/beizi/fusion/work/interstitial/d;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/interstitial/d$a$1;->c:Lcom/beizi/fusion/work/interstitial/d$a;

    iget-object v1, v1, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    invoke-virtual {v1}, Lcom/beizi/fusion/work/interstitial/d;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/d/e;->d(Ljava/lang/String;)V

    .line 3
    :cond_0
    iget-boolean v0, p0, Lcom/beizi/fusion/work/interstitial/d$a$1;->b:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/beizi/fusion/work/interstitial/d$a$1;->b:Z

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/d$a$1;->c:Lcom/beizi/fusion/work/interstitial/d$a;

    iget-object v0, v0, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/d;->l(Lcom/beizi/fusion/work/interstitial/d;)V

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/d$a$1;->c:Lcom/beizi/fusion/work/interstitial/d$a;

    iget-object v0, v0, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/d;->m(Lcom/beizi/fusion/work/interstitial/d;)V

    :cond_1
    return-void
.end method

.method public onADError(Lcom/qq/e/comm/util/AdError;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ShowGdtInterstitialCustom onADError: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/qq/e/comm/util/AdError;->getErrorMsg()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/d$a$1;->c:Lcom/beizi/fusion/work/interstitial/d$a;

    iget-object v0, v0, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    invoke-virtual {p1}, Lcom/qq/e/comm/util/AdError;->getErrorMsg()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/qq/e/comm/util/AdError;->getErrorCode()I

    move-result p1

    invoke-static {v0, v1, p1}, Lcom/beizi/fusion/work/interstitial/d;->b(Lcom/beizi/fusion/work/interstitial/d;Ljava/lang/String;I)V

    return-void
.end method

.method public onADExposed()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/d$a$1;->c:Lcom/beizi/fusion/work/interstitial/d$a;

    iget-object v0, v0, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    sget-object v1, Lcom/beizi/fusion/f/a;->c:Lcom/beizi/fusion/f/a;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/interstitial/d;->b(Lcom/beizi/fusion/work/interstitial/d;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/d$a$1;->c:Lcom/beizi/fusion/work/interstitial/d$a;

    iget-object v0, v0, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/d;->c(Lcom/beizi/fusion/work/interstitial/d;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/d$a$1;->c:Lcom/beizi/fusion/work/interstitial/d$a;

    iget-object v0, v0, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/d;->d(Lcom/beizi/fusion/work/interstitial/d;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/d$a$1;->c:Lcom/beizi/fusion/work/interstitial/d$a;

    iget-object v0, v0, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/d;->e(Lcom/beizi/fusion/work/interstitial/d;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/interstitial/d$a$1;->c:Lcom/beizi/fusion/work/interstitial/d$a;

    iget-object v1, v1, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    invoke-virtual {v1}, Lcom/beizi/fusion/work/interstitial/d;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/d/e;->b(Ljava/lang/String;)V

    .line 4
    :cond_0
    iget-boolean v0, p0, Lcom/beizi/fusion/work/interstitial/d$a$1;->a:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/beizi/fusion/work/interstitial/d$a$1;->a:Z

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/d$a$1;->c:Lcom/beizi/fusion/work/interstitial/d$a;

    iget-object v0, v0, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    invoke-virtual {v0}, Lcom/beizi/fusion/work/interstitial/d;->az()V

    .line 7
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/d$a$1;->c:Lcom/beizi/fusion/work/interstitial/d$a;

    iget-object v0, v0, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/d;->f(Lcom/beizi/fusion/work/interstitial/d;)V

    .line 8
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/d$a$1;->c:Lcom/beizi/fusion/work/interstitial/d$a;

    iget-object v0, v0, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/d;->g(Lcom/beizi/fusion/work/interstitial/d;)V

    .line 9
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/d$a$1;->c:Lcom/beizi/fusion/work/interstitial/d$a;

    iget-object v0, v0, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/d;->h(Lcom/beizi/fusion/work/interstitial/d;)V

    :cond_1
    return-void
.end method

.method public onADStatusChanged()V
    .locals 2

    const-string v0, "BeiZis"

    const-string v1, "ShowGdtInterstitialCustom onADStatusChanged()"

    .line 1
    invoke-static {v0, v1}, Lcom/beizi/fusion/g/af;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
