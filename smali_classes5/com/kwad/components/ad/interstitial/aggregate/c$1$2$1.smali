.class final Lcom/kwad/components/ad/interstitial/aggregate/c$1$2$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/interstitial/aggregate/c$1$2;->doTask()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic cg:Ljava/util/List;

.field final synthetic iO:Lcom/kwad/components/ad/interstitial/aggregate/c$1$2;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/interstitial/aggregate/c$1$2;Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/aggregate/c$1$2$1;->iO:Lcom/kwad/components/ad/interstitial/aggregate/c$1$2;

    iput-object p2, p0, Lcom/kwad/components/ad/interstitial/aggregate/c$1$2$1;->cg:Ljava/util/List;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/aggregate/c$1$2$1;->iO:Lcom/kwad/components/ad/interstitial/aggregate/c$1$2;

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/aggregate/c$1$2;->iM:Lcom/kwad/components/ad/interstitial/aggregate/c$1;

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/aggregate/c$1;->iK:Lcom/kwad/components/ad/interstitial/aggregate/c$b;

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/aggregate/c$1$2$1;->cg:Ljava/util/List;

    invoke-interface {v0, v1}, Lcom/kwad/components/ad/interstitial/aggregate/c$b;->onInterstitialAdLoad(Ljava/util/List;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/aggregate/c$1$2$1;->iO:Lcom/kwad/components/ad/interstitial/aggregate/c$1$2;

    iget-object v1, v0, Lcom/kwad/components/ad/interstitial/aggregate/c$1$2;->iM:Lcom/kwad/components/ad/interstitial/aggregate/c$1;

    iget-object v2, v1, Lcom/kwad/components/ad/interstitial/aggregate/c$1;->iL:Lcom/kwad/components/ad/interstitial/aggregate/c;

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/aggregate/c$1$2;->iN:Lcom/kwad/sdk/core/response/model/AdResultData;

    iget-wide v3, v1, Lcom/kwad/components/ad/interstitial/aggregate/c$1;->ij:J

    invoke-static {v2, v0, v3, v4}, Lcom/kwad/components/ad/interstitial/aggregate/c;->a(Lcom/kwad/components/ad/interstitial/aggregate/c;Lcom/kwad/sdk/core/response/model/AdResultData;J)V

    return-void
.end method
