.class Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    const-string v0, "AMITAGGDT"

    const-string v1, "onADReceive"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->b(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;)Lcom/qq/e/ads/interstitial2/UnifiedInterstitialAD;

    move-result-object v0

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/b;->a(Ljava/lang/Object;)I

    move-result v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/b;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;I)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;II)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;

    invoke-static {v0, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;Z)Z

    return-void

    :cond_0
    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;I)V

    :cond_1
    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;

    iget-object v1, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->b:Ljava/util/HashMap;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->b(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;)Lcom/qq/e/ads/interstitial2/UnifiedInterstitialAD;

    move-result-object v0

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;

    iget-object v2, v2, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-static {v1, v0, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/b;->a(Ljava/util/Map;Ljava/lang/Object;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->l(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->m(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;)V

    :cond_2
    return-void
.end method

.method public b()V
    .locals 2

    const-string v0, "AMITAGGDT"

    const-string v1, "onADClosed"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->i(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;)V

    return-void
.end method

.method public c()V
    .locals 2

    const-string v0, "AMITAGGDT"

    const-string v1, "onADOpened"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->o(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;)V

    return-void
.end method

.method public onADClicked()V
    .locals 2

    const-string v0, "AMITAGGDT"

    const-string v1, "onADClicked"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->g(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;)V

    return-void
.end method

.method public onADExposure()V
    .locals 3

    const-string v0, "AMITAGGDT"

    const-string v1, "onADExposure"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->p(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;)V

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a$a$a;

    invoke-direct {v0, p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a$a$a;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a$a;)V

    const-wide/16 v1, 0x1

    invoke-static {v0, v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/e/n;->a(Ljava/lang/Runnable;J)V

    return-void
.end method

.method public onADLeftApplication()V
    .locals 2

    const-string v0, "AMITAGGDT"

    const-string v1, "onADLeftApplication"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->h(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;)V

    return-void
.end method

.method public onNoAD(Lcom/qq/e/comm/util/AdError;)V
    .locals 2

    const-string v0, "AMITAGGDT"

    const-string v1, "onNoAD"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    invoke-virtual {p1}, Lcom/qq/e/comm/util/AdError;->getErrorCode()I

    move-result v1

    invoke-virtual {p1}, Lcom/qq/e/comm/util/AdError;->getErrorMsg()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;-><init>(ILjava/lang/String;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;

    invoke-static {p1, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)V

    return-void
.end method

.method public onRenderFail()V
    .locals 2

    const-string v0, "AMITAGGDT"

    const-string v1, "onRenderFail"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onRenderSuccess()V
    .locals 3

    const-string v0, "AMITAGGDT"

    const-string v1, "onRenderSuccess"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;

    invoke-static {v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->l(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;

    invoke-static {v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->j(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;

    invoke-static {v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->b(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;)Lcom/qq/e/ads/interstitial2/UnifiedInterstitialAD;

    move-result-object v1

    invoke-static {v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/b;->a(Ljava/lang/Object;)I

    move-result v1

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;

    iget-object v2, v2, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-static {v2, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/b;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;I)Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    :cond_1
    const-string v1, "onRenderSuccess notify"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->k(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;)V

    return-void
.end method

.method public onVideoCached()V
    .locals 2

    const-string v0, "AMITAGGDT"

    const-string v1, "onVideoCached"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->n(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;)V

    return-void
.end method
