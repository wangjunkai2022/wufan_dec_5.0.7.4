.class final Lcom/kwad/components/ad/reward/KsRewardVideoAdControl$1;
.super Lcom/kwad/components/ad/reward/e/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/reward/KsRewardVideoAdControl;->setRewardAdInteractionListener(Lcom/kwad/sdk/api/KsRewardVideoAd$RewardAdInteractionListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic oA:Lcom/kwad/components/ad/reward/KsRewardVideoAdControl;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/reward/KsRewardVideoAdControl;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/reward/KsRewardVideoAdControl$1;->oA:Lcom/kwad/components/ad/reward/KsRewardVideoAdControl;

    invoke-direct {p0}, Lcom/kwad/components/ad/reward/e/h;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPageDismiss()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/reward/e/h;->onPageDismiss()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/KsRewardVideoAdControl$1;->oA:Lcom/kwad/components/ad/reward/KsRewardVideoAdControl;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/KsRewardVideoAdControl;->a(Lcom/kwad/components/ad/reward/KsRewardVideoAdControl;)Lcom/kwad/components/core/internal/api/c;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/reward/KsRewardVideoAdControl$1;->oA:Lcom/kwad/components/ad/reward/KsRewardVideoAdControl;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/internal/api/c;->i(Lcom/kwad/components/core/internal/api/a;)V

    return-void
.end method

.method public final onVideoPlayStart()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/reward/e/h;->onVideoPlayStart()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/KsRewardVideoAdControl$1;->oA:Lcom/kwad/components/ad/reward/KsRewardVideoAdControl;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/KsRewardVideoAdControl;->a(Lcom/kwad/components/ad/reward/KsRewardVideoAdControl;)Lcom/kwad/components/core/internal/api/c;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/reward/KsRewardVideoAdControl$1;->oA:Lcom/kwad/components/ad/reward/KsRewardVideoAdControl;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/internal/api/c;->h(Lcom/kwad/components/core/internal/api/a;)V

    return-void
.end method
