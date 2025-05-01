.class Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kwad/sdk/api/KsFullScreenVideoAd;",
            ">;)V"
        }
    .end annotation

    const-string v0, "AMFTAGKS"

    const-string v1, "onInterstitialAdLoad"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/kwad/sdk/api/KsFullScreenVideoAd;

    invoke-static {v1, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;Lcom/kwad/sdk/api/KsFullScreenVideoAd;)Lcom/kwad/sdk/api/KsFullScreenVideoAd;

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;)Lcom/kwad/sdk/api/KsFullScreenVideoAd;

    move-result-object p1

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;

    invoke-static {v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->i(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;)Lcom/kwad/sdk/api/KsFullScreenVideoAd$FullScreenVideoAdInteractionListener;

    move-result-object v1

    invoke-interface {p1, v1}, Lcom/kwad/sdk/api/KsFullScreenVideoAd;->setFullScreenVideoAdInteractionListener(Lcom/kwad/sdk/api/KsFullScreenVideoAd$FullScreenVideoAdInteractionListener;)V

    :cond_0
    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;)Lcom/kwad/sdk/api/KsFullScreenVideoAd;

    move-result-object p1

    invoke-static {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/b;->a(Ljava/lang/Object;)I

    move-result p1

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-static {v1, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/b;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;I)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;

    invoke-static {v1, p1, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;II)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;

    invoke-static {v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;I)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;

    iget-object v1, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->b:Ljava/util/HashMap;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-static {v1, p1, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/b;->b(Ljava/util/Map;ILcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;

    iput p1, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->p:I

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->j(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;)V

    return-void
.end method

.method public b(Ljava/util/List;)V
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kwad/sdk/api/KsFullScreenVideoAd;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onFullScreenVideoResult "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "AMFTAGKS"

    invoke-static {v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

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

    const-string v1, "AMFTAGKS"

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    invoke-direct {v0, p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;-><init>(ILjava/lang/String;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;

    invoke-static {p1, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)V

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

    const-string v0, "AMFTAGKS"

    invoke-static {v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
