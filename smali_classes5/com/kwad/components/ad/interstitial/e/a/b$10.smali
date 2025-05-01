.class final Lcom/kwad/components/ad/interstitial/e/a/b$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/ad/h/a/a/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/interstitial/e/a/b;->a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic li:Lcom/kwad/components/ad/interstitial/e/a/b;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/interstitial/e/a/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/e/a/b$10;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final E(I)V
    .locals 3

    .line 1
    sget v0, Lcom/kwad/components/ad/h/a/a/b;->nv:I

    if-ne p1, v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/e/a/b$10;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {p1}, Lcom/kwad/components/ad/interstitial/e/a/b;->o(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object p1

    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b$10;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/a/b;->m(Lcom/kwad/components/ad/interstitial/e/a/b;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/a/b$10;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {v1}, Lcom/kwad/components/ad/interstitial/e/a/b;->n(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object v1

    iget-object v1, v1, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {p1, v0, v1}, Lcom/kwad/components/ad/interstitial/e/c;->b(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 3
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/e/a/b$10;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {p1}, Lcom/kwad/components/ad/interstitial/e/a/b;->p(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object p1

    const/4 v0, 0x1

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2}, Lcom/kwad/components/ad/interstitial/e/c;->a(ZILcom/kwad/sdk/core/video/videoview/a;)V

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/e/a/b$10;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {p1}, Lcom/kwad/components/ad/interstitial/e/a/b;->q(Lcom/kwad/components/ad/interstitial/e/a/b;)V

    return-void
.end method
