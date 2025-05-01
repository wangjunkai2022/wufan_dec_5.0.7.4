.class final Lcom/kwad/components/ad/interstitial/e/c$1$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/interstitial/e/c$1;->onAdClicked()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic kc:Lcom/kwad/components/ad/interstitial/e/c$1;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/interstitial/e/c$1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/e/c$1$1;->kc:Lcom/kwad/components/ad/interstitial/e/c$1;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/c$1$1;->kc:Lcom/kwad/components/ad/interstitial/e/c$1;

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/c$1;->kb:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/c;->io:Lcom/kwad/components/ad/interstitial/d;

    invoke-virtual {v0}, Lcom/kwad/components/ad/interstitial/d;->dismiss()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/c$1$1;->kc:Lcom/kwad/components/ad/interstitial/e/c$1;

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/c$1;->kb:Lcom/kwad/components/ad/interstitial/e/c;

    invoke-virtual {v0}, Lcom/kwad/components/ad/interstitial/e/c;->cR()V

    return-void
.end method
