.class public Lcom/kwad/components/ad/reward/e/i;
.super Lcom/kwad/components/ad/reward/e/c;
.source "SourceFile"


# instance fields
.field private mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

.field private ry:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/e/c;-><init>()V

    return-void
.end method

.method private gT()Lcom/kwad/sdk/api/KsRewardVideoAd$RewardAdInteractionListener;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/e/i;->getUniqueId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/components/ad/reward/e/f;->H(Ljava/lang/String;)Lcom/kwad/sdk/api/KsRewardVideoAd$RewardAdInteractionListener;

    move-result-object v0

    return-object v0
.end method

.method private getUniqueId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/e/i;->ry:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public final L(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/reward/e/i;->ry:Ljava/lang/String;

    return-void
.end method

.method public bJ()V
    .locals 4

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/reward/e/c;->bJ()V

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/e/i;->gT()Lcom/kwad/sdk/api/KsRewardVideoAd$RewardAdInteractionListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0}, Lcom/kwad/sdk/api/KsRewardVideoAd$RewardAdInteractionListener;->onAdClicked()V

    :cond_0
    const/4 v0, 0x1

    .line 4
    sget-object v1, Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;->AD_CLICK:Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;

    iget-object v2, p0, Lcom/kwad/components/ad/reward/e/i;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lcom/kwad/components/ad/reward/monitor/c;->a(ZLcom/kwad/components/ad/reward/monitor/a;Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/f/a;)V

    return-void
.end method

.method public final gS()Z
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/e/i;->gT()Lcom/kwad/sdk/api/KsRewardVideoAd$RewardAdInteractionListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/kwad/sdk/api/KsRewardVideoAd$RewardAdInteractionListener;->onRewardVerify()V

    .line 3
    :cond_0
    sget-object v1, Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;->REWARD_VERIFY:Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;

    iget-object v2, p0, Lcom/kwad/components/ad/reward/e/i;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v4, v1, v2, v3}, Lcom/kwad/components/ad/reward/monitor/c;->a(ZLcom/kwad/components/ad/reward/monitor/a;Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/f/a;)V

    if-eqz v0, :cond_1

    return v4

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public h(Z)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Lcom/kwad/components/ad/reward/e/c;->h(Z)V

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/e/i;->gT()Lcom/kwad/sdk/api/KsRewardVideoAd$RewardAdInteractionListener;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    invoke-interface {p1}, Lcom/kwad/sdk/api/KsRewardVideoAd$RewardAdInteractionListener;->onPageDismiss()V

    :cond_0
    const/4 p1, 0x1

    .line 4
    sget-object v0, Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;->PAGE_DISMISS:Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/e/i;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/4 v2, 0x0

    invoke-static {p1, v0, v1, v2}, Lcom/kwad/components/ad/reward/monitor/c;->a(ZLcom/kwad/components/ad/reward/monitor/a;Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/f/a;)V

    return-void
.end method

.method public final h(II)Z
    .locals 4

    .line 5
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/e/i;->gT()Lcom/kwad/sdk/api/KsRewardVideoAd$RewardAdInteractionListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 6
    invoke-interface {v0, p1, p2}, Lcom/kwad/sdk/api/KsRewardVideoAd$RewardAdInteractionListener;->onRewardStepVerify(II)V

    .line 7
    :cond_0
    sget-object v1, Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;->REWARD_STEP_VERIFY:Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;

    iget-object v2, p0, Lcom/kwad/components/ad/reward/e/i;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    new-instance v3, Lcom/kwad/components/ad/reward/e/i$1;

    invoke-direct {v3, p0, p1, p2}, Lcom/kwad/components/ad/reward/e/i$1;-><init>(Lcom/kwad/components/ad/reward/e/i;II)V

    const/4 p1, 0x1

    invoke-static {p1, v1, v2, v3}, Lcom/kwad/components/ad/reward/monitor/c;->a(ZLcom/kwad/components/ad/reward/monitor/a;Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/f/a;)V

    if-eqz v0, :cond_1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public onRewardVerify()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/reward/e/c;->onRewardVerify()V

    return-void
.end method

.method public final onVideoPlayEnd()V
    .locals 4

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/reward/e/c;->onVideoPlayEnd()V

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/e/i;->gT()Lcom/kwad/sdk/api/KsRewardVideoAd$RewardAdInteractionListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0}, Lcom/kwad/sdk/api/KsRewardVideoAd$RewardAdInteractionListener;->onVideoPlayEnd()V

    :cond_0
    const/4 v0, 0x1

    .line 4
    sget-object v1, Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;->VIDEO_PLAY_END:Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;

    iget-object v2, p0, Lcom/kwad/components/ad/reward/e/i;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lcom/kwad/components/ad/reward/monitor/c;->a(ZLcom/kwad/components/ad/reward/monitor/a;Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/f/a;)V

    return-void
.end method

.method public final onVideoPlayError(II)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Lcom/kwad/components/ad/reward/e/c;->onVideoPlayError(II)V

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/e/i;->gT()Lcom/kwad/sdk/api/KsRewardVideoAd$RewardAdInteractionListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0, p1, p2}, Lcom/kwad/sdk/api/KsRewardVideoAd$RewardAdInteractionListener;->onVideoPlayError(II)V

    :cond_0
    const/4 p1, 0x1

    .line 4
    sget-object p2, Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;->VIDEO_PLAY_ERROR:Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;

    iget-object v0, p0, Lcom/kwad/components/ad/reward/e/i;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/4 v1, 0x0

    invoke-static {p1, p2, v0, v1}, Lcom/kwad/components/ad/reward/monitor/c;->a(ZLcom/kwad/components/ad/reward/monitor/a;Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/f/a;)V

    return-void
.end method

.method public final onVideoPlayStart()V
    .locals 4

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/reward/e/c;->onVideoPlayStart()V

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/e/i;->gT()Lcom/kwad/sdk/api/KsRewardVideoAd$RewardAdInteractionListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0}, Lcom/kwad/sdk/api/KsRewardVideoAd$RewardAdInteractionListener;->onVideoPlayStart()V

    :cond_0
    const/4 v0, 0x1

    .line 4
    sget-object v1, Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;->VIDEO_PLAY_START:Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;

    iget-object v2, p0, Lcom/kwad/components/ad/reward/e/i;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lcom/kwad/components/ad/reward/monitor/c;->a(ZLcom/kwad/components/ad/reward/monitor/a;Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/f/a;)V

    return-void
.end method

.method public final onVideoSkipToEnd(J)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Lcom/kwad/components/ad/reward/e/c;->onVideoSkipToEnd(J)V

    .line 2
    :try_start_0
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/e/i;->gT()Lcom/kwad/sdk/api/KsRewardVideoAd$RewardAdInteractionListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0, p1, p2}, Lcom/kwad/sdk/api/KsRewardVideoAd$RewardAdInteractionListener;->onVideoSkipToEnd(J)V

    :cond_0
    const/4 p1, 0x1

    .line 4
    sget-object p2, Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;->VIDEO_SKIP_TO_END:Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;

    iget-object v0, p0, Lcom/kwad/components/ad/reward/e/i;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/4 v1, 0x0

    invoke-static {p1, p2, v0, v1}, Lcom/kwad/components/ad/reward/monitor/c;->a(ZLcom/kwad/components/ad/reward/monitor/a;Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/f/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public final setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/reward/e/i;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-void
.end method
