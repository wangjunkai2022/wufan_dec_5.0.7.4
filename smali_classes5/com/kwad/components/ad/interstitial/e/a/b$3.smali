.class final Lcom/kwad/components/ad/interstitial/e/a/b$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/core/webview/jshandler/bf$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/interstitial/e/a/b;->dG()Lcom/kwad/components/core/webview/jshandler/bf;
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
    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/e/a/b$3;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final dL()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b$3;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/a/b;->G(Lcom/kwad/components/ad/interstitial/e/a/b;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/a/b$3;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {v1}, Lcom/kwad/components/ad/interstitial/e/a/b;->H(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object v1

    iget-object v1, v1, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0, v1}, Lcom/kwad/components/core/page/a;->launch(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b$3;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/a/b;->I(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, -0x1

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/kwad/components/ad/interstitial/e/c;->a(ZILcom/kwad/sdk/core/video/videoview/a;)V

    .line 3
    new-instance v0, Lcom/kwad/components/ad/interstitial/e/a/b$3$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/interstitial/e/a/b$3$1;-><init>(Lcom/kwad/components/ad/interstitial/e/a/b$3;)V

    const-wide/16 v1, 0x0

    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/utils/bo;->runOnUiThreadDelay(Ljava/lang/Runnable;J)V

    const/4 v0, 0x0

    return v0
.end method
