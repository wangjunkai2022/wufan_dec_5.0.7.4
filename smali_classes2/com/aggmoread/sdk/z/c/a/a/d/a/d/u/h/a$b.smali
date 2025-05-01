.class Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdClicked()V
    .locals 2

    const-string v0, "AMITAGKS"

    const-string v1, "onADClicked"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;->j(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;)V

    return-void
.end method

.method public onAdClosed()V
    .locals 2

    const-string v0, "AMITAGKS"

    const-string v1, "onADClosed"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;->e(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;)V

    return-void
.end method

.method public onAdShow()V
    .locals 3

    const-string v0, "AMITAGKS"

    const-string v1, "onADExposure"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;->k(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;->l(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;)V

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a$b$a;

    invoke-direct {v0, p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a$b$a;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a$b;)V

    const-wide/16 v1, 0x1

    invoke-static {v0, v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/e/n;->a(Ljava/lang/Runnable;J)V

    return-void
.end method

.method public onPageDismiss()V
    .locals 2

    const-string v0, "AMITAGKS"

    const-string v1, "onADLeftApplication"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;->f(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;)V

    return-void
.end method

.method public onSkippedAd()V
    .locals 0

    return-void
.end method

.method public onVideoPlayEnd()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->h:Lcom/aggmoread/sdk/z/c/a/a/c/f;

    instance-of v1, v0, Lcom/aggmoread/sdk/z/c/a/a/c/l;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/aggmoread/sdk/z/c/a/a/c/l;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/l;->onVideoComplete()V

    :cond_0
    return-void
.end method

.method public onVideoPlayError(II)V
    .locals 3

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->h:Lcom/aggmoread/sdk/z/c/a/a/c/f;

    instance-of v1, v0, Lcom/aggmoread/sdk/z/c/a/a/c/l;

    if-eqz v1, :cond_0

    new-instance v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ""

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v1, p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/f;->a(Lcom/aggmoread/sdk/z/c/a/a/c/d;)V

    :cond_0
    return-void
.end method

.method public onVideoPlayStart()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->h:Lcom/aggmoread/sdk/z/c/a/a/c/f;

    instance-of v1, v0, Lcom/aggmoread/sdk/z/c/a/a/c/l;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/aggmoread/sdk/z/c/a/a/c/l;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/l;->onVideoStart()V

    :cond_0
    return-void
.end method
