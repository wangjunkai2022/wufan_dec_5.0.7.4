.class final Lcom/kwad/components/ad/interstitial/e/d$3$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/interstitial/e/d$3;->doTask()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic kA:Lcom/kwad/components/ad/interstitial/e/d$3;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/interstitial/e/d$3;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/e/d$3$1;->kA:Lcom/kwad/components/ad/interstitial/e/d$3;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/d$3$1;->kA:Lcom/kwad/components/ad/interstitial/e/d$3;

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/d$3;->kw:Lcom/kwad/components/ad/interstitial/e/d;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/d;->b(Lcom/kwad/components/ad/interstitial/e/d;)Lcom/kwad/sdk/core/video/videoview/a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/d$3$1;->kA:Lcom/kwad/components/ad/interstitial/e/d$3;

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/d$3;->kw:Lcom/kwad/components/ad/interstitial/e/d;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/d;->b(Lcom/kwad/components/ad/interstitial/e/d;)Lcom/kwad/sdk/core/video/videoview/a;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->requestLayout()V

    :cond_0
    return-void
.end method
