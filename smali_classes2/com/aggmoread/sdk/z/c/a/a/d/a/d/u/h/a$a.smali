.class Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/api/KsLoadManager$InterstitialAdListener;


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

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(ILjava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onError i "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",s  = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AMITAGKS"

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    invoke-direct {v0, p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;-><init>(ILjava/lang/String;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;

    invoke-static {p1, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)V

    return-void
.end method

.method public onInterstitialAdLoad(Ljava/util/List;)V
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kwad/sdk/api/KsInterstitialAd;",
            ">;)V"
        }
    .end annotation

    const-string v0, "AMITAGKS"

    const-string v1, "onInterstitialAdLoad"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/kwad/sdk/api/KsInterstitialAd;

    invoke-static {v1, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;Lcom/kwad/sdk/api/KsInterstitialAd;)Lcom/kwad/sdk/api/KsInterstitialAd;

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;)Lcom/kwad/sdk/api/KsInterstitialAd;

    move-result-object p1

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;

    invoke-static {v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;->h(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;)Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;

    move-result-object v1

    invoke-interface {p1, v1}, Lcom/kwad/sdk/api/KsInterstitialAd;->setAdInteractionListener(Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;)V

    :cond_0
    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;)Lcom/kwad/sdk/api/KsInterstitialAd;

    move-result-object p1

    invoke-static {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/b;->a(Ljava/lang/Object;)I

    move-result p1

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-static {v1, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/b;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;I)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;

    invoke-static {v1, p1, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;II)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;

    invoke-static {v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;I)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;

    iput p1, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;->o:I

    iget-object v1, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->b:Ljava/util/HashMap;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-static {v1, p1, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/b;->b(Ljava/util/Map;ILcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;->i(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;)V

    return-void
.end method

.method public onRequestResult(I)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onRequestResult "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "AMITAGKS"

    invoke-static {v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
