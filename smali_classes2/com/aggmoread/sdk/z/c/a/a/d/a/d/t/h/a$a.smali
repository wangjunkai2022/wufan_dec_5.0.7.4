.class Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a;->b(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a;)Lcom/qq/e/ads/interstitial2/UnifiedInterstitialAD;

    move-result-object v0

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/b;->a(Ljava/lang/Object;)I

    move-result v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/b;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;I)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a;

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a;II)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a;

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a;I)V

    :cond_1
    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a;

    iget-object v1, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->b:Ljava/util/HashMap;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a;->b(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a;)Lcom/qq/e/ads/interstitial2/UnifiedInterstitialAD;

    move-result-object v0

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a;

    iget-object v2, v2, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-static {v1, v0, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/b;->a(Ljava/util/Map;Ljava/lang/Object;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a;->i(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a;)V

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a;->h(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a;)V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a;->k(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a;)V

    return-void
.end method

.method public onADClicked()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a;->f(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a;)V

    return-void
.end method

.method public onADExposure()V
    .locals 3

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a;->l(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a;)V

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a$a$a;

    invoke-direct {v0, p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a$a$a;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a$a;)V

    const-wide/16 v1, 0x1

    invoke-static {v0, v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/e/n;->a(Ljava/lang/Runnable;J)V

    return-void
.end method

.method public onADLeftApplication()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a;->g(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a;)V

    return-void
.end method

.method public onNoAD(Lcom/qq/e/comm/util/AdError;)V
    .locals 2

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    invoke-virtual {p1}, Lcom/qq/e/comm/util/AdError;->getErrorCode()I

    move-result v1

    invoke-virtual {p1}, Lcom/qq/e/comm/util/AdError;->getErrorMsg()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;-><init>(ILjava/lang/String;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a;

    invoke-static {p1, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a;Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)V

    return-void
.end method

.method public onRenderFail()V
    .locals 0

    return-void
.end method

.method public onRenderSuccess()V
    .locals 0

    return-void
.end method

.method public onVideoCached()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a;->j(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/h/a;)V

    return-void
.end method
