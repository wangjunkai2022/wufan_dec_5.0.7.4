.class final Lcom/kwad/components/ad/interstitial/e/a/b$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/webview/d/a/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/interstitial/e/a/b;->a(Lcom/kwad/sdk/core/webview/b;)Lcom/kwad/components/core/webview/jshandler/x;
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
    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/e/a/b$2;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/sdk/core/webview/d/b/a;)V
    .locals 6

    if-eqz p1, :cond_1

    .line 1
    invoke-static {}, Lcom/kwad/components/ad/interstitial/report/a;->dN()Lcom/kwad/components/ad/interstitial/report/a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/a/b$2;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {v1}, Lcom/kwad/components/ad/interstitial/e/a/b;->w(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object v1

    iget-object v1, v1, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget v2, p1, Lcom/kwad/sdk/core/webview/d/b/a;->aGa:I

    int-to-long v2, v2

    iget v4, p1, Lcom/kwad/sdk/core/webview/d/b/a;->kl:I

    int-to-long v4, v4

    invoke-virtual/range {v0 .. v5}, Lcom/kwad/components/ad/interstitial/report/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;JJ)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b$2;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/a/b;->x(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object v0

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/kwad/components/ad/interstitial/e/c;->jM:Z

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b$2;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/a/b;->y(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object v0

    iget-boolean v0, v0, Lcom/kwad/components/ad/interstitial/e/c;->jO:Z

    if-nez v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b$2;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/a/b;->z(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object v0

    iget v1, p1, Lcom/kwad/sdk/core/webview/d/b/a;->aGa:I

    int-to-long v1, v1

    iget p1, p1, Lcom/kwad/sdk/core/webview/d/b/a;->kl:I

    int-to-long v3, p1

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/kwad/components/ad/interstitial/e/c;->b(JJ)V

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/e/a/b$2;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {p1}, Lcom/kwad/components/ad/interstitial/e/a/b;->A(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object p1

    iget-object p1, p1, Lcom/kwad/components/ad/interstitial/e/c;->io:Lcom/kwad/components/ad/interstitial/d;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/e/a/b$2;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {p1}, Lcom/kwad/components/ad/interstitial/e/a/b;->B(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object p1

    iget-object p1, p1, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {p1}, Lcom/kwad/components/ad/interstitial/d/b;->k(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 6
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/e/a/b$2;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {p1}, Lcom/kwad/components/ad/interstitial/e/a/b;->D(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, -0x1

    iget-object v2, p0, Lcom/kwad/components/ad/interstitial/e/a/b$2;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {v2}, Lcom/kwad/components/ad/interstitial/e/a/b;->C(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object v2

    iget-object v2, v2, Lcom/kwad/components/ad/interstitial/e/c;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    invoke-virtual {p1, v0, v1, v2}, Lcom/kwad/components/ad/interstitial/e/c;->a(ZILcom/kwad/sdk/core/video/videoview/a;)V

    .line 7
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/e/a/b$2;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {p1}, Lcom/kwad/components/ad/interstitial/e/a/b;->E(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object p1

    iget-object p1, p1, Lcom/kwad/components/ad/interstitial/e/c;->io:Lcom/kwad/components/ad/interstitial/d;

    invoke-virtual {p1}, Lcom/kwad/components/ad/interstitial/d;->dismiss()V

    .line 8
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/e/a/b$2;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {p1}, Lcom/kwad/components/ad/interstitial/e/a/b;->F(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/kwad/components/ad/interstitial/e/c;->cR()V

    :cond_1
    return-void
.end method
