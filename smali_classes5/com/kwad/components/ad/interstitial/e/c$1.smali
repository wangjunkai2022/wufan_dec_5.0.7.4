.class final Lcom/kwad/components/ad/interstitial/e/c$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/core/e/d/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/interstitial/e/c;->a(Lcom/kwad/components/ad/interstitial/e/c$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic ka:Lcom/kwad/components/ad/interstitial/e/c$b;

.field final synthetic kb:Lcom/kwad/components/ad/interstitial/e/c;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/interstitial/e/c;Lcom/kwad/components/ad/interstitial/e/c$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/e/c$1;->kb:Lcom/kwad/components/ad/interstitial/e/c;

    iput-object p2, p0, Lcom/kwad/components/ad/interstitial/e/c$1;->ka:Lcom/kwad/components/ad/interstitial/e/c$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAdClicked()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/c$1;->kb:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/c$1;->ka:Lcom/kwad/components/ad/interstitial/e/c$b;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/interstitial/e/c;->b(Lcom/kwad/components/ad/interstitial/e/c$b;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/c$1;->kb:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v1, v0, Lcom/kwad/components/ad/interstitial/e/c;->io:Lcom/kwad/components/ad/interstitial/d;

    if-eqz v1, :cond_0

    iget-object v0, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/d/b;->k(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/c$1;->kb:Lcom/kwad/components/ad/interstitial/e/c;

    const/4 v1, 0x0

    const/4 v2, -0x1

    iget-object v3, v0, Lcom/kwad/components/ad/interstitial/e/c;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    invoke-virtual {v0, v1, v2, v3}, Lcom/kwad/components/ad/interstitial/e/c;->a(ZILcom/kwad/sdk/core/video/videoview/a;)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/c$1;->kb:Lcom/kwad/components/ad/interstitial/e/c;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/c;->c(Lcom/kwad/components/ad/interstitial/e/c;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/kwad/components/ad/interstitial/e/c$1$1;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/interstitial/e/c$1$1;-><init>(Lcom/kwad/components/ad/interstitial/e/c$1;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method
