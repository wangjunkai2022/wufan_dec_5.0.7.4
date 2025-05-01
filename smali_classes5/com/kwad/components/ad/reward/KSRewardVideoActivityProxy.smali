.class public Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;
.super Lcom/kwad/components/core/l/b;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/ad/reward/g$b;
.implements Lcom/kwad/components/ad/reward/m$a;
.implements Lcom/kwad/components/core/s/c$b;
.implements Lcom/kwad/components/offline/api/core/adlive/listener/OnAdLiveResumeInterceptor;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation runtime Lcom/kwad/sdk/api/core/KsAdSdkDynamicImpl;
    value = Lcom/kwad/sdk/api/proxy/app/KsRewardVideoActivity;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kwad/components/core/l/b<",
        "Lcom/kwad/components/ad/reward/g;",
        ">;",
        "Lcom/kwad/components/ad/reward/g$b;",
        "Lcom/kwad/components/ad/reward/m$a;",
        "Lcom/kwad/components/core/s/c$b;",
        "Lcom/kwad/components/offline/api/core/adlive/listener/OnAdLiveResumeInterceptor;"
    }
.end annotation


# static fields
.field public static final KEY_AD_RESULT_CACHE_IDX:Ljava/lang/String; = "key_ad_result_cache_idx"

.field public static final KEY_REWARD_TYPE:Ljava/lang/String; = "key_template_reward_type"

.field public static final KEY_TEMPLATE:Ljava/lang/String; = "key_template_json"

.field public static final KEY_VIDEO_PLAY_CONFIG:Ljava/lang/String; = "key_video_play_config"

.field public static final KEY_VIDEO_PLAY_CONFIG_JSON:Ljava/lang/String; = "key_video_play_config_json"

.field private static final TAG:Ljava/lang/String; = "RewardVideo"


# instance fields
.field private listenerKey:Ljava/lang/String;

.field private mAdOpenInteractionListener:Lcom/kwad/components/ad/reward/e/i;

.field private mAdRewardStepListener:Lcom/kwad/components/ad/reward/e/d;

.field private mIsBackEnable:Z

.field private mIsFinishVideoLookStep:Z

.field private mModel:Lcom/kwad/components/ad/reward/model/c;

.field private mPageDismissCalled:Z

.field private mPageEnterTime:J

.field private mPlayEndPageListener:Lcom/kwad/components/ad/reward/e/g;

.field private mReportedPageResume:Z

.field private mRewardPresenter:Lcom/kwad/components/ad/reward/m;

.field private final mRewardVerifyListener:Lcom/kwad/components/ad/reward/e/l;

.field private mRootContainer:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

.field private mTimerHelper:Lcom/kwad/sdk/utils/bn;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/l/b;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mReportedPageResume:Z

    .line 3
    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mIsFinishVideoLookStep:Z

    .line 4
    new-instance v0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy$1;-><init>(Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;)V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mRewardVerifyListener:Lcom/kwad/components/ad/reward/e/l;

    .line 5
    new-instance v0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy$2;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy$2;-><init>(Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;)V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mAdOpenInteractionListener:Lcom/kwad/components/ad/reward/e/i;

    .line 6
    new-instance v0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy$3;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy$3;-><init>(Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;)V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mPlayEndPageListener:Lcom/kwad/components/ad/reward/e/g;

    .line 7
    new-instance v0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy$4;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy$4;-><init>(Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;)V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mAdRewardStepListener:Lcom/kwad/components/ad/reward/e/d;

    return-void
.end method

.method static synthetic access$000(Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;)Lcom/kwad/components/ad/reward/model/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    return-object p0
.end method

.method static synthetic access$100(Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;)Lcom/kwad/components/core/l/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/l/b;->mCallerContext:Lcom/kwad/components/core/l/a;

    return-object p0
.end method

.method static synthetic access$1000(Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;Z)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->notifyPageDismiss(Z)Z

    move-result p0

    return p0
.end method

.method static synthetic access$1102(Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mIsBackEnable:Z

    return p1
.end method

.method static synthetic access$1200(Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;)Lcom/kwad/components/ad/reward/e/i;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mAdOpenInteractionListener:Lcom/kwad/components/ad/reward/e/i;

    return-object p0
.end method

.method static synthetic access$200(Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;)Lcom/kwad/components/core/l/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/l/b;->mCallerContext:Lcom/kwad/components/core/l/a;

    return-object p0
.end method

.method static synthetic access$300(Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->markOpenNsCompleted()V

    return-void
.end method

.method static synthetic access$400(Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->notifyRewardVerify()V

    return-void
.end method

.method static synthetic access$500(Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->notifyRewardVerifyStepByStep()V

    return-void
.end method

.method static synthetic access$600(Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;)Lcom/kwad/components/core/l/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/l/b;->mCallerContext:Lcom/kwad/components/core/l/a;

    return-object p0
.end method

.method static synthetic access$700(Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;)Lcom/kwad/components/core/l/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/l/b;->mCallerContext:Lcom/kwad/components/core/l/a;

    return-object p0
.end method

.method static synthetic access$800(Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;)Lcom/kwad/components/core/l/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/l/b;->mCallerContext:Lcom/kwad/components/core/l/a;

    return-object p0
.end method

.method static synthetic access$900(Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;)Lcom/kwad/components/core/l/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/l/b;->mCallerContext:Lcom/kwad/components/core/l/a;

    return-object p0
.end method

.method private getTimerHelper()Lcom/kwad/sdk/utils/bn;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mTimerHelper:Lcom/kwad/sdk/utils/bn;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/sdk/utils/bn;

    invoke-direct {v0}, Lcom/kwad/sdk/utils/bn;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mTimerHelper:Lcom/kwad/sdk/utils/bn;

    .line 3
    invoke-virtual {v0}, Lcom/kwad/sdk/utils/bn;->startTiming()V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mTimerHelper:Lcom/kwad/sdk/utils/bn;

    return-object v0
.end method

.method private getUniqueId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->listenerKey:Ljava/lang/String;

    return-object v0
.end method

.method private handleNotifyVerify(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/l/b;->mCallerContext:Lcom/kwad/components/core/l/a;

    check-cast v0, Lcom/kwad/components/ad/reward/g;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/g;->E(Z)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/model/c;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    iput-boolean v1, v0, Lcom/kwad/sdk/core/response/model/AdTemplate;->mRewardVerifyCalled:Z

    if-nez p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/kwad/components/core/l/b;->mCallerContext:Lcom/kwad/components/core/l/a;

    check-cast p1, Lcom/kwad/components/ad/reward/g;

    iget p1, p1, Lcom/kwad/components/ad/reward/g;->ph:I

    if-nez p1, :cond_1

    .line 4
    :cond_0
    invoke-static {}, Lcom/kwad/components/ad/reward/e;->fq()Lcom/kwad/components/ad/reward/e;

    move-result-object p1

    iget-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/model/c;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/kwad/components/ad/reward/e;->C(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 5
    :cond_1
    iget-object p1, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/model/c;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object p1

    invoke-direct {p0}, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->isNeoScan()Z

    move-result v0

    invoke-static {p1, v0}, Lcom/kwad/sdk/core/adlog/c;->i(Lcom/kwad/sdk/core/response/model/AdTemplate;Z)V

    .line 6
    iget-object p1, p0, Lcom/kwad/components/core/l/b;->mCallerContext:Lcom/kwad/components/core/l/a;

    check-cast p1, Lcom/kwad/components/ad/reward/g;

    iget-object p1, p1, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-boolean p1, p1, Lcom/kwad/sdk/core/response/model/AdTemplate;->converted:Z

    if-nez p1, :cond_2

    .line 7
    invoke-static {}, Lcom/kwad/components/ad/reward/c/a;->gM()Lcom/kwad/components/ad/reward/c/a;

    move-result-object p1

    .line 8
    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/c/a;->gN()Lcom/kwad/components/ad/reward/c/b;

    move-result-object p1

    sget v0, Lcom/kwad/components/ad/reward/c/b;->ro:I

    invoke-virtual {p1, v0}, Lcom/kwad/components/ad/reward/c/b;->M(I)V

    .line 9
    :cond_2
    new-instance p1, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy$7;

    invoke-direct {p1, p0}, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy$7;-><init>(Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;)V

    invoke-static {p1}, Lcom/kwad/sdk/utils/bo;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 10
    iget-object p1, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/model/c;->bH()Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object p1

    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->cT(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/kwad/components/core/l/b;->mCallerContext:Lcom/kwad/components/core/l/a;

    move-object v0, p1

    check-cast v0, Lcom/kwad/components/ad/reward/g;

    iget-object v0, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-boolean v0, v0, Lcom/kwad/sdk/core/response/model/AdTemplate;->converted:Z

    if-nez v0, :cond_3

    move-object v0, p1

    check-cast v0, Lcom/kwad/components/ad/reward/g;

    iget-boolean v0, v0, Lcom/kwad/components/ad/reward/g;->pa:Z

    if-nez v0, :cond_3

    check-cast p1, Lcom/kwad/components/ad/reward/g;

    .line 11
    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/g;->fM()Z

    move-result p1

    if-nez p1, :cond_3

    .line 12
    invoke-virtual {p0}, Lcom/kwad/sdk/api/proxy/IActivityProxy;->getActivity()Landroid/app/Activity;

    move-result-object p1

    iget-object v0, p0, Lcom/kwad/components/core/l/b;->mCallerContext:Lcom/kwad/components/core/l/a;

    check-cast v0, Lcom/kwad/components/ad/reward/g;

    invoke-static {p1, v0}, Lcom/kwad/components/ad/reward/g;->a(Landroid/app/Activity;Lcom/kwad/components/ad/reward/g;)V

    :cond_3
    return-void
.end method

.method private isLaunchTaskCompleted()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/l/b;->mCallerContext:Lcom/kwad/components/core/l/a;

    move-object v1, v0

    check-cast v1, Lcom/kwad/components/ad/reward/g;

    iget-object v1, v1, Lcom/kwad/components/ad/reward/g;->pr:Lcom/kwad/components/ad/reward/l/b/a;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/kwad/components/ad/reward/g;

    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->pr:Lcom/kwad/components/ad/reward/l/b/a;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/l/b/a;->isCompleted()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private isNeoScan()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/model/c;->hp()Lcom/kwad/sdk/core/response/model/AdGlobalConfigInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/model/c;->hp()Lcom/kwad/sdk/core/response/model/AdGlobalConfigInfo;

    move-result-object v0

    iget v0, v0, Lcom/kwad/sdk/core/response/model/AdGlobalConfigInfo;->neoPageType:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static launch(Landroid/app/Activity;Lcom/kwad/sdk/core/response/model/AdResultData;Lcom/kwad/sdk/api/KsVideoPlayConfig;Lcom/kwad/sdk/api/KsRewardVideoAd$RewardAdInteractionListener;Lcom/kwad/components/core/i/d;I)V
    .locals 5
    .param p2    # Lcom/kwad/sdk/api/KsVideoPlayConfig;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/c;->n(Lcom/kwad/sdk/core/response/model/AdResultData;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    const/4 v1, 0x1

    .line 2
    invoke-static {v1, v0}, Lcom/kwad/components/ad/reward/monitor/c;->i(ZLcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 3
    iget-object v2, p1, Lcom/kwad/sdk/core/response/model/AdResultData;->adGlobalConfigInfo:Lcom/kwad/sdk/core/response/model/AdGlobalConfigInfo;

    .line 4
    invoke-static {v0}, Lcom/kwad/sdk/utils/l;->em(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    if-eqz v2, :cond_0

    .line 5
    iget v2, v2, Lcom/kwad/sdk/core/response/model/AdGlobalConfigInfo;->neoPageType:I

    if-ne v2, v1, :cond_0

    const/4 v2, 0x0

    .line 6
    invoke-interface {p2, v2}, Lcom/kwad/sdk/api/KsVideoPlayConfig;->setShowLandscape(Z)V

    .line 7
    :cond_0
    invoke-interface {p2}, Lcom/kwad/sdk/api/KsVideoPlayConfig;->isShowLandscape()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 8
    const-class v2, Lcom/kwad/sdk/api/proxy/app/KSRewardLandScapeVideoActivity;

    .line 9
    const-class v3, Lcom/kwad/components/ad/reward/KSRewardLandScapeVideoActivityProxy;

    invoke-static {v2, v3}, Lcom/kwad/sdk/service/b;->a(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 10
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_0

    .line 11
    :cond_1
    const-class v2, Lcom/kwad/sdk/api/proxy/app/KsRewardVideoActivity;

    .line 12
    const-class v3, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;

    invoke-static {v2, v3}, Lcom/kwad/sdk/service/b;->a(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 13
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    :goto_0
    const/high16 v2, 0x10000000

    .line 14
    invoke-virtual {v3, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 15
    invoke-virtual {v0}, Lcom/kwad/sdk/core/response/a/a;->toJson()Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v4, "key_template_json"

    invoke-virtual {v3, v4, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 16
    invoke-static {}, Lcom/kwad/components/core/c/f;->ne()Lcom/kwad/components/core/c/f;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/kwad/components/core/c/f;->i(Lcom/kwad/sdk/core/response/model/AdResultData;)I

    move-result p1

    const-string v2, "key_ad_result_cache_idx"

    .line 17
    invoke-virtual {v3, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p1, "key_video_play_config"

    .line 18
    invoke-virtual {v3, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 19
    invoke-static {p2}, Lcom/kwad/components/core/internal/api/e;->a(Lcom/kwad/sdk/api/KsVideoPlayConfig;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "key_video_play_config_json"

    invoke-virtual {v3, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "key_template_reward_type"

    .line 20
    invoke-virtual {v3, p1, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 21
    invoke-virtual {v0}, Lcom/kwad/sdk/core/response/model/AdTemplate;->getUniqueId()Ljava/lang/String;

    move-result-object p1

    .line 22
    invoke-static {p1, p3, p4}, Lcom/kwad/components/ad/reward/e/f;->a(Ljava/lang/String;Lcom/kwad/sdk/api/KsRewardVideoAd$RewardAdInteractionListener;Lcom/kwad/components/core/i/d;)V

    .line 23
    invoke-static {p1}, Lcom/kwad/components/ad/reward/e/f;->I(Ljava/lang/String;)V

    .line 24
    :try_start_0
    invoke-virtual {p0, v3}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    invoke-static {}, Lcom/kwad/sdk/a/a/c;->Au()Lcom/kwad/sdk/a/a/c;

    move-result-object p0

    invoke-virtual {p0, v1}, Lcom/kwad/sdk/a/a/c;->bj(Z)V

    .line 26
    sget-object p0, Lcom/kwad/components/core/proxy/PageCreateStage;->END_LAUNCH:Lcom/kwad/components/core/proxy/PageCreateStage;

    .line 27
    invoke-virtual {p0}, Lcom/kwad/components/core/proxy/PageCreateStage;->getStage()Ljava/lang/String;

    move-result-object p0

    .line 28
    invoke-static {v1, v0, p0}, Lcom/kwad/components/ad/reward/monitor/c;->c(ZLcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;)V

    return-void

    :catchall_0
    move-exception p0

    .line 29
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    .line 30
    sget-object p2, Lcom/kwad/components/core/proxy/PageCreateStage;->ERROR_START_ACTIVITY:Lcom/kwad/components/core/proxy/PageCreateStage;

    .line 31
    invoke-virtual {p2}, Lcom/kwad/components/core/proxy/PageCreateStage;->getStage()Ljava/lang/String;

    move-result-object p2

    .line 32
    invoke-static {v1, v0, p2, p1}, Lcom/kwad/components/ad/reward/monitor/c;->a(ZLcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    throw p0
.end method

.method private markOpenNsCompleted()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/l/b;->mCallerContext:Lcom/kwad/components/core/l/a;

    move-object v1, v0

    check-cast v1, Lcom/kwad/components/ad/reward/g;

    iget-object v1, v1, Lcom/kwad/components/ad/reward/g;->ps:Lcom/kwad/components/ad/reward/l/a/a;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Lcom/kwad/components/ad/reward/g;

    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->ps:Lcom/kwad/components/ad/reward/l/a/a;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/l/a/a;->markOpenNsCompleted()V

    :cond_0
    return-void
.end method

.method private needHandledOnResume()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/l/b;->mCallerContext:Lcom/kwad/components/core/l/a;

    check-cast v0, Lcom/kwad/components/ad/reward/g;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/g;->fN()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private notifyPageDismiss(Z)Z
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mPageDismissCalled:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/l/b;->mCallerContext:Lcom/kwad/components/core/l/a;

    if-nez v0, :cond_1

    return v1

    .line 3
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    if-nez v0, :cond_2

    return v1

    :cond_2
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mPageDismissCalled:Z

    .line 5
    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/model/c;->bH()Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->cN(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/kwad/components/core/l/b;->mCallerContext:Lcom/kwad/components/core/l/a;

    check-cast v0, Lcom/kwad/components/ad/reward/g;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/g;->fL()Z

    move-result v0

    if-nez v0, :cond_4

    .line 6
    :cond_3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/model/c;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    .line 7
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->getTimerHelper()Lcom/kwad/sdk/utils/bn;

    move-result-object v2

    invoke-virtual {v2}, Lcom/kwad/sdk/utils/bn;->getTime()J

    move-result-wide v2

    long-to-float v2, v2

    const/high16 v3, 0x447a0000    # 1000.0f

    div-float/2addr v2, v3

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    .line 8
    invoke-static {v0, v2}, Lcom/kwad/sdk/core/adlog/c;->m(Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    :cond_4
    if-eqz p1, :cond_6

    .line 9
    iget-object p1, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/model/c;->hp()Lcom/kwad/sdk/core/response/model/AdGlobalConfigInfo;

    move-result-object p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    .line 10
    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/model/c;->hp()Lcom/kwad/sdk/core/response/model/AdGlobalConfigInfo;

    move-result-object p1

    iget p1, p1, Lcom/kwad/sdk/core/response/model/AdGlobalConfigInfo;->neoPageType:I

    if-eq p1, v1, :cond_8

    .line 11
    :cond_5
    iget-object p1, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/model/c;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object p1

    .line 12
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->getTimerHelper()Lcom/kwad/sdk/utils/bn;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/sdk/utils/bn;->getTime()J

    move-result-wide v2

    iget-object v0, p0, Lcom/kwad/components/core/l/b;->mCallerContext:Lcom/kwad/components/core/l/a;

    check-cast v0, Lcom/kwad/components/ad/reward/g;

    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->mReportExtData:Lorg/json/JSONObject;

    .line 13
    invoke-static {p1, v1, v2, v3, v0}, Lcom/kwad/sdk/core/adlog/c;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;IJLorg/json/JSONObject;)V

    goto :goto_0

    .line 14
    :cond_6
    iget-object p1, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/model/c;->hp()Lcom/kwad/sdk/core/response/model/AdGlobalConfigInfo;

    move-result-object p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    .line 15
    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/model/c;->hp()Lcom/kwad/sdk/core/response/model/AdGlobalConfigInfo;

    move-result-object p1

    iget p1, p1, Lcom/kwad/sdk/core/response/model/AdGlobalConfigInfo;->neoPageType:I

    if-eq p1, v1, :cond_8

    .line 16
    :cond_7
    iget-object p1, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    .line 17
    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/model/c;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object p1

    const/4 v0, 0x6

    .line 18
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->getTimerHelper()Lcom/kwad/sdk/utils/bn;

    move-result-object v2

    invoke-virtual {v2}, Lcom/kwad/sdk/utils/bn;->getTime()J

    move-result-wide v2

    iget-object v4, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    .line 19
    invoke-virtual {v4}, Lcom/kwad/components/ad/reward/model/c;->ho()Lorg/json/JSONObject;

    move-result-object v4

    .line 20
    invoke-static {p1, v0, v2, v3, v4}, Lcom/kwad/sdk/core/adlog/c;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;IJLorg/json/JSONObject;)V

    :cond_8
    :goto_0
    return v1
.end method

.method private notifyRewardStep(II)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/model/c;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->ed(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 3
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/core/l/b;->mCallerContext:Lcom/kwad/components/core/l/a;

    check-cast v0, Lcom/kwad/components/ad/reward/g;

    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->pg:Ljava/util/List;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    .line 4
    :cond_2
    iget-object v0, p0, Lcom/kwad/components/core/l/b;->mCallerContext:Lcom/kwad/components/core/l/a;

    check-cast v0, Lcom/kwad/components/ad/reward/g;

    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->pg:Ljava/util/List;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5
    iget-object v0, p0, Lcom/kwad/components/core/l/b;->mCallerContext:Lcom/kwad/components/core/l/a;

    check-cast v0, Lcom/kwad/components/ad/reward/g;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    .line 6
    invoke-static {p1, p2, v0, v1}, Lcom/kwad/components/ad/reward/n;->a(IILcom/kwad/components/ad/reward/g;Lcom/kwad/components/ad/reward/model/c;)V

    .line 7
    new-instance v0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy$6;

    invoke-direct {v0, p0, p1, p2}, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy$6;-><init>(Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;II)V

    invoke-static {v0}, Lcom/kwad/sdk/utils/bo;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method private notifyRewardVerify()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v1, p0, Lcom/kwad/components/core/l/b;->mCallerContext:Lcom/kwad/components/core/l/a;

    check-cast v1, Lcom/kwad/components/ad/reward/g;

    iget-boolean v1, v1, Lcom/kwad/components/ad/reward/g;->mCheckExposureResult:Z

    if-nez v1, :cond_1

    return-void

    .line 3
    :cond_1
    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/model/c;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->ed(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    .line 4
    :cond_2
    iget-object v0, p0, Lcom/kwad/components/core/l/b;->mCallerContext:Lcom/kwad/components/core/l/a;

    check-cast v0, Lcom/kwad/components/ad/reward/g;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/g;->fO()Z

    move-result v0

    if-eqz v0, :cond_3

    return-void

    .line 5
    :cond_3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/model/c;->hj()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_6

    .line 6
    iget-object v0, p0, Lcom/kwad/components/core/l/b;->mCallerContext:Lcom/kwad/components/core/l/a;

    move-object v3, v0

    check-cast v3, Lcom/kwad/components/ad/reward/g;

    iget-object v3, v3, Lcom/kwad/components/ad/reward/g;->pr:Lcom/kwad/components/ad/reward/l/b/a;

    if-eqz v3, :cond_4

    check-cast v0, Lcom/kwad/components/ad/reward/g;

    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->pr:Lcom/kwad/components/ad/reward/l/b/a;

    .line 7
    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/l/b/a;->isCompleted()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v1, 0x1

    :cond_4
    if-eqz v1, :cond_5

    .line 8
    invoke-direct {p0, v2}, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->handleNotifyVerify(Z)V

    :cond_5
    return-void

    .line 9
    :cond_6
    iget-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/model/c;->hk()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 10
    iget-object v0, p0, Lcom/kwad/components/core/l/b;->mCallerContext:Lcom/kwad/components/core/l/a;

    move-object v3, v0

    check-cast v3, Lcom/kwad/components/ad/reward/g;

    iget-object v3, v3, Lcom/kwad/components/ad/reward/g;->ps:Lcom/kwad/components/ad/reward/l/a/a;

    if-eqz v3, :cond_7

    check-cast v0, Lcom/kwad/components/ad/reward/g;

    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->ps:Lcom/kwad/components/ad/reward/l/a/a;

    .line 11
    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/l/a/a;->isCompleted()Z

    move-result v0

    if-eqz v0, :cond_7

    const/4 v1, 0x1

    :cond_7
    if-eqz v1, :cond_8

    .line 12
    invoke-direct {p0, v2}, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->handleNotifyVerify(Z)V

    :cond_8
    return-void

    .line 13
    :cond_9
    invoke-direct {p0, v1}, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->handleNotifyVerify(Z)V

    return-void
.end method

.method private notifyRewardVerifyStepByStep()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/model/c;->hj()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0, v1}, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->notifyRewardStep(II)V

    .line 3
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->isLaunchTaskCompleted()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 4
    invoke-direct {p0, v0, v0}, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->notifyRewardStep(II)V

    return-void

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/model/c;->hk()Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    .line 6
    iget-object v0, p0, Lcom/kwad/components/core/l/b;->mCallerContext:Lcom/kwad/components/core/l/a;

    move-object v3, v0

    check-cast v3, Lcom/kwad/components/ad/reward/g;

    iget-object v3, v3, Lcom/kwad/components/ad/reward/g;->ps:Lcom/kwad/components/ad/reward/l/a/a;

    if-eqz v3, :cond_1

    check-cast v0, Lcom/kwad/components/ad/reward/g;

    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->ps:Lcom/kwad/components/ad/reward/l/a/a;

    .line 7
    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/l/a/a;->isCompleted()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 8
    :goto_0
    invoke-direct {p0, v2, v1}, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->notifyRewardStep(II)V

    if-eqz v0, :cond_2

    .line 9
    invoke-direct {p0, v2, v2}, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->notifyRewardStep(II)V

    :cond_2
    return-void

    .line 10
    :cond_3
    iget-boolean v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mIsFinishVideoLookStep:Z

    if-nez v0, :cond_4

    .line 11
    iput-boolean v2, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mIsFinishVideoLookStep:Z

    .line 12
    invoke-direct {p0, v1, v1}, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->notifyRewardStep(II)V

    :cond_4
    return-void
.end method

.method public static register()V
    .locals 2
    .annotation build Lcom/ksad/annotation/invoker/InvokeBy;
        invokerClass = Lcom/kwad/sdk/service/b;
        methodId = "initComponentProxyForInvoker"
    .end annotation

    .line 1
    const-class v0, Lcom/kwad/sdk/api/proxy/app/KsRewardVideoActivity;

    const-class v1, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;

    invoke-static {v0, v1}, Lcom/kwad/sdk/service/b;->a(Ljava/lang/Class;Ljava/lang/Class;)V

    return-void
.end method

.method private reportSubPageCreate(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/model/c;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x1

    .line 3
    invoke-static {v1, v0, p1}, Lcom/kwad/components/ad/reward/monitor/c;->c(ZLcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public checkIntentData(Landroid/content/Intent;)Z
    .locals 0
    .param p1    # Landroid/content/Intent;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-static {p1}, Lcom/kwad/components/ad/reward/model/c;->a(Landroid/content/Intent;)Lcom/kwad/components/ad/reward/model/c;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public finish()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/components/core/proxy/c;->finish()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mAdOpenInteractionListener:Lcom/kwad/components/ad/reward/e/i;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/e/i;->h(Z)V

    return-void
.end method

.method public getLayoutId()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    if-eqz v0, :cond_0

    iget-boolean v0, v0, Lcom/kwad/components/ad/reward/model/c;->gt:Z

    if-eqz v0, :cond_0

    .line 2
    sget v0, Lcom/kwad/sdk/R$layout;->ksad_activity_reward_neo:I

    return v0

    .line 3
    :cond_0
    sget v0, Lcom/kwad/sdk/R$layout;->ksad_activity_reward_video_legacy:I

    return v0
.end method

.method public getPageName()Ljava/lang/String;
    .locals 1

    const-string v0, "KSRewardLandScapeVideoActivityProxy"

    return-object v0
.end method

.method public handledAdLiveOnResume()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->needHandledOnResume()Z

    move-result v0

    return v0
.end method

.method public initData()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/model/c;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/sdk/core/response/model/AdTemplate;->getUniqueId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->listenerKey:Ljava/lang/String;

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mAdOpenInteractionListener:Lcom/kwad/components/ad/reward/e/i;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    invoke-virtual {v1}, Lcom/kwad/components/ad/reward/model/c;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/e/i;->setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mAdOpenInteractionListener:Lcom/kwad/components/ad/reward/e/i;

    invoke-direct {p0}, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->getUniqueId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/e/i;->L(Ljava/lang/String;)V

    .line 4
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mPageEnterTime:J

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/model/c;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    iget-wide v1, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mPageEnterTime:J

    iget-object v3, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    .line 6
    invoke-virtual {v3}, Lcom/kwad/components/ad/reward/model/c;->hp()Lcom/kwad/sdk/core/response/model/AdGlobalConfigInfo;

    move-result-object v3

    const/4 v4, 0x1

    .line 7
    invoke-static {v4, v0, v1, v2, v3}, Lcom/kwad/components/ad/reward/monitor/c;->a(ZLcom/kwad/sdk/core/response/model/AdTemplate;JLcom/kwad/sdk/core/response/model/AdGlobalConfigInfo;)V

    .line 8
    iget-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/model/c;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/kwad/components/ad/reward/monitor/c;->g(ZLcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 9
    invoke-static {}, Lcom/kwad/components/core/s/c;->rD()Lcom/kwad/components/core/s/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/kwad/components/core/s/c;->a(Lcom/kwad/components/core/s/c$b;)V

    .line 10
    invoke-static {}, Lcom/kwad/components/ad/reward/b;->fc()Lcom/kwad/components/ad/reward/b;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mRewardVerifyListener:Lcom/kwad/components/ad/reward/e/l;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/b;->a(Lcom/kwad/components/ad/reward/e/l;)V

    return-void
.end method

.method public initView()V
    .locals 1

    .line 1
    sget v0, Lcom/kwad/sdk/R$id;->ksad_root_container:I

    invoke-virtual {p0, v0}, Lcom/kwad/components/core/proxy/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

    iput-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mRootContainer:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

    return-void
.end method

.method public interceptPlayCardResume()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->needHandledOnResume()Z

    move-result v0

    return v0
.end method

.method public needAdaptionScreen()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public onActivityCreate()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/components/core/l/b;->onActivityCreate()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/model/c;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/commercial/d/c;->bA(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-void
.end method

.method public onBackPressed()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mRewardPresenter:Lcom/kwad/components/ad/reward/m;

    if-nez v0, :cond_0

    .line 2
    invoke-super {p0}, Lcom/kwad/components/core/proxy/c;->onBackPressed()V

    return-void

    .line 3
    :cond_0
    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/m;->go()Lcom/kwad/components/ad/reward/page/BackPressHandleResult;

    move-result-object v0

    .line 4
    sget-object v1, Lcom/kwad/components/ad/reward/page/BackPressHandleResult;->HANDLED:Lcom/kwad/components/ad/reward/page/BackPressHandleResult;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    .line 5
    :cond_1
    sget-object v1, Lcom/kwad/components/ad/reward/page/BackPressHandleResult;->HANDLED_CLOSE:Lcom/kwad/components/ad/reward/page/BackPressHandleResult;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 6
    invoke-super {p0}, Lcom/kwad/components/core/proxy/c;->onBackPressed()V

    .line 7
    iget-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mAdOpenInteractionListener:Lcom/kwad/components/ad/reward/e/i;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/e/i;->h(Z)V

    return-void

    .line 8
    :cond_2
    iget-boolean v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mIsBackEnable:Z

    if-eqz v0, :cond_3

    .line 9
    iget-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mAdOpenInteractionListener:Lcom/kwad/components/ad/reward/e/i;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/e/i;->h(Z)V

    .line 10
    invoke-super {p0}, Lcom/kwad/components/core/proxy/c;->onBackPressed()V

    :cond_3
    return-void
.end method

.method protected onCreateCallerContext()Lcom/kwad/components/ad/reward/g;
    .locals 7

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/model/c;->hl()Lcom/kwad/sdk/core/response/model/AdResultData;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    invoke-virtual {v1}, Lcom/kwad/components/ad/reward/model/c;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v1

    .line 4
    iget-object v2, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    invoke-virtual {v2}, Lcom/kwad/components/ad/reward/model/c;->bH()Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v2

    .line 5
    new-instance v3, Lcom/kwad/components/ad/reward/g;

    invoke-direct {v3, p0}, Lcom/kwad/components/ad/reward/g;-><init>(Lcom/kwad/components/core/l/b;)V

    .line 6
    iget-wide v4, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mPageEnterTime:J

    iput-wide v4, v3, Lcom/kwad/components/ad/reward/g;->mPageEnterTime:J

    .line 7
    iget-object v4, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    invoke-virtual {v4}, Lcom/kwad/components/ad/reward/model/c;->hn()I

    move-result v4

    const/4 v5, 0x1

    const/4 v6, 0x2

    if-ne v4, v6, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    iput-boolean v4, v3, Lcom/kwad/components/ad/reward/g;->oI:Z

    .line 8
    iget-object v4, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mAdOpenInteractionListener:Lcom/kwad/components/ad/reward/e/i;

    iput-object v4, v3, Lcom/kwad/components/ad/reward/g;->oJ:Lcom/kwad/components/ad/reward/e/b;

    .line 9
    iget-object v4, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mAdRewardStepListener:Lcom/kwad/components/ad/reward/e/d;

    iput-object v4, v3, Lcom/kwad/components/ad/reward/g;->mAdRewardStepListener:Lcom/kwad/components/ad/reward/e/d;

    .line 10
    iget-object v4, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    invoke-virtual {v4}, Lcom/kwad/components/ad/reward/model/c;->getScreenOrientation()I

    move-result v4

    iput v4, v3, Lcom/kwad/components/ad/reward/g;->mScreenOrientation:I

    .line 11
    iget-object v4, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    invoke-virtual {v4}, Lcom/kwad/components/ad/reward/model/c;->hm()Lcom/kwad/sdk/api/KsVideoPlayConfig;

    move-result-object v4

    iput-object v4, v3, Lcom/kwad/components/ad/reward/g;->mVideoPlayConfig:Lcom/kwad/sdk/api/KsVideoPlayConfig;

    .line 12
    iget-object v4, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    invoke-virtual {v4}, Lcom/kwad/components/ad/reward/model/c;->ho()Lorg/json/JSONObject;

    move-result-object v4

    iput-object v4, v3, Lcom/kwad/components/ad/reward/g;->mReportExtData:Lorg/json/JSONObject;

    .line 13
    iget-object v4, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mRootContainer:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

    iput-object v4, v3, Lcom/kwad/components/ad/reward/g;->mRootContainer:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

    .line 14
    invoke-virtual {v3, v0}, Lcom/kwad/components/ad/reward/g;->d(Lcom/kwad/sdk/core/response/model/AdResultData;)V

    .line 15
    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/b;->dY(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/kwad/components/ad/reward/LoadStrategy;->FULL_TK:Lcom/kwad/components/ad/reward/LoadStrategy;

    goto :goto_1

    :cond_1
    sget-object v0, Lcom/kwad/components/ad/reward/LoadStrategy;->MULTI:Lcom/kwad/components/ad/reward/LoadStrategy;

    :goto_1
    iput-object v0, v3, Lcom/kwad/components/ad/reward/g;->pC:Lcom/kwad/components/ad/reward/LoadStrategy;

    .line 16
    invoke-virtual {v3, p0}, Lcom/kwad/components/ad/reward/g;->a(Lcom/kwad/components/ad/reward/g$b;)V

    .line 17
    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/a;->aE(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 18
    new-instance v0, Lcom/kwad/components/core/e/d/c;

    iget-object v4, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    .line 19
    invoke-virtual {v4}, Lcom/kwad/components/ad/reward/model/c;->ho()Lorg/json/JSONObject;

    move-result-object v4

    invoke-direct {v0, v1, v4}, Lcom/kwad/components/core/e/d/c;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;Lorg/json/JSONObject;)V

    iput-object v0, v3, Lcom/kwad/components/ad/reward/g;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    .line 20
    :cond_2
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/RewardActionBarControl;

    iget-object v4, p0, Lcom/kwad/components/core/proxy/c;->mContext:Landroid/content/Context;

    invoke-direct {v0, v3, v4, v1}, Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/RewardActionBarControl;-><init>(Lcom/kwad/components/ad/reward/g;Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    iput-object v0, v3, Lcom/kwad/components/ad/reward/g;->oN:Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/RewardActionBarControl;

    .line 21
    iget-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mPlayEndPageListener:Lcom/kwad/components/ad/reward/e/g;

    invoke-virtual {v3, v0}, Lcom/kwad/components/ad/reward/g;->b(Lcom/kwad/components/ad/reward/e/g;)V

    .line 22
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/b;->cB(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 23
    new-instance v0, Lcom/kwad/components/ad/reward/j;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    .line 24
    invoke-virtual {v1}, Lcom/kwad/components/ad/reward/model/c;->ho()Lorg/json/JSONObject;

    move-result-object v1

    const/4 v4, 0x0

    invoke-direct {v0, v3, v1, v4}, Lcom/kwad/components/ad/reward/j;-><init>(Lcom/kwad/components/ad/reward/g;Lorg/json/JSONObject;Ljava/lang/String;)V

    iput-object v0, v3, Lcom/kwad/components/ad/reward/g;->oO:Lcom/kwad/components/ad/reward/j;

    .line 25
    new-instance v1, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy$5;

    invoke-direct {v1, p0, v3}, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy$5;-><init>(Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;Lcom/kwad/components/ad/reward/g;)V

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/j;->a(Lcom/kwad/components/ad/reward/c/d;)V

    .line 26
    :cond_3
    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/a;->ar(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 27
    new-instance v0, Lcom/kwad/components/ad/l/a;

    invoke-direct {v0}, Lcom/kwad/components/ad/l/a;-><init>()V

    invoke-virtual {v0, v5}, Lcom/kwad/components/ad/l/a;->af(Z)Lcom/kwad/components/ad/l/a;

    move-result-object v0

    iput-object v0, v3, Lcom/kwad/components/ad/reward/g;->oP:Lcom/kwad/components/ad/l/a;

    .line 28
    :cond_4
    iput-boolean v5, v3, Lcom/kwad/components/ad/reward/g;->oZ:Z

    .line 29
    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/a;->bI(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 30
    new-instance v0, Lcom/kwad/components/core/playable/a;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_playable_webview:I

    .line 31
    invoke-virtual {p0, v1}, Lcom/kwad/components/core/proxy/c;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/kwad/sdk/core/webview/KsAdWebView;

    invoke-direct {v0, v1}, Lcom/kwad/components/core/playable/a;-><init>(Lcom/kwad/sdk/core/webview/KsAdWebView;)V

    iput-object v0, v3, Lcom/kwad/components/ad/reward/g;->oM:Lcom/kwad/components/core/playable/a;

    :cond_5
    const-wide/16 v0, 0x0

    .line 32
    iput-wide v0, v3, Lcom/kwad/components/ad/reward/g;->pv:J

    .line 33
    iget-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/model/c;->bH()Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 34
    iget-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/model/c;->bH()Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->bI(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 35
    iget-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/model/c;->bH()Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->aq(Lcom/kwad/sdk/core/response/model/AdInfo;)J

    move-result-wide v0

    goto :goto_2

    .line 36
    :cond_6
    iget-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/model/c;->bH()Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->al(Lcom/kwad/sdk/core/response/model/AdInfo;)J

    move-result-wide v0

    :goto_2
    iput-wide v0, v3, Lcom/kwad/components/ad/reward/g;->pv:J

    .line 37
    :cond_7
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->getTimerHelper()Lcom/kwad/sdk/utils/bn;

    move-result-object v0

    iput-object v0, v3, Lcom/kwad/components/ad/reward/g;->mTimerHelper:Lcom/kwad/sdk/utils/bn;

    .line 38
    new-instance v0, Lcom/kwad/components/ad/reward/m/e;

    invoke-direct {v0, v3}, Lcom/kwad/components/ad/reward/m/e;-><init>(Lcom/kwad/components/ad/reward/g;)V

    iput-object v0, v3, Lcom/kwad/components/ad/reward/g;->oK:Lcom/kwad/components/ad/reward/m/e;

    .line 39
    iget-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    iget-boolean v0, v0, Lcom/kwad/components/ad/reward/model/c;->gt:Z

    iput-boolean v0, v3, Lcom/kwad/components/ad/reward/g;->gt:Z

    return-object v3
.end method

.method public bridge synthetic onCreateCallerContext()Lcom/kwad/components/core/l/a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->onCreateCallerContext()Lcom/kwad/components/ad/reward/g;

    move-result-object v0

    return-object v0
.end method

.method public onCreateCaughtException(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/kwad/components/core/proxy/c;->onCreateCaughtException(Ljava/lang/Throwable;)V

    .line 2
    iget-object p1, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/model/c;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const/4 v0, 0x1

    .line 4
    invoke-static {v0, p1}, Lcom/kwad/components/ad/reward/monitor/b;->b(ZLcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-void
.end method

.method public onCreatePresenter()Lcom/kwad/sdk/mvp/Presenter;
    .locals 7

    .line 1
    iget-object v4, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    if-nez v4, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2
    :cond_0
    new-instance v6, Lcom/kwad/components/ad/reward/m;

    iget-object v2, p0, Lcom/kwad/components/core/proxy/c;->mContext:Landroid/content/Context;

    iget-object v3, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mRootContainer:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

    iget-object v0, p0, Lcom/kwad/components/core/l/b;->mCallerContext:Lcom/kwad/components/core/l/a;

    move-object v5, v0

    check-cast v5, Lcom/kwad/components/ad/reward/g;

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/kwad/components/ad/reward/m;-><init>(Lcom/kwad/components/core/l/b;Landroid/content/Context;Landroid/view/ViewGroup;Lcom/kwad/components/ad/reward/model/c;Lcom/kwad/components/ad/reward/g;)V

    iput-object v6, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mRewardPresenter:Lcom/kwad/components/ad/reward/m;

    .line 3
    invoke-virtual {v6, p0}, Lcom/kwad/components/ad/reward/m;->a(Lcom/kwad/components/ad/reward/m$a;)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mRewardPresenter:Lcom/kwad/components/ad/reward/m;

    return-object v0
.end method

.method public onCreateStageChange(Lcom/kwad/components/core/proxy/PageCreateStage;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lcom/kwad/components/core/proxy/c;->onCreateStageChange(Lcom/kwad/components/core/proxy/PageCreateStage;)V

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "onCreateStageChange: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/kwad/components/core/proxy/PageCreateStage;->getStage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "RewardVideo"

    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p1}, Lcom/kwad/components/core/proxy/PageCreateStage;->getStage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->reportSubPageCreate(Ljava/lang/String;)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/components/ad/reward/b;->fc()Lcom/kwad/components/ad/reward/b;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mRewardVerifyListener:Lcom/kwad/components/ad/reward/e/l;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/b;->b(Lcom/kwad/components/ad/reward/e/l;)V

    .line 2
    invoke-super {p0}, Lcom/kwad/components/core/l/b;->onDestroy()V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mAdOpenInteractionListener:Lcom/kwad/components/ad/reward/e/i;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/e/i;->h(Z)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/core/l/b;->mCallerContext:Lcom/kwad/components/core/l/a;

    if-eqz v0, :cond_0

    .line 5
    invoke-static {}, Lcom/kwad/components/ad/reward/i;->gk()Lcom/kwad/components/ad/reward/i;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/core/l/b;->mCallerContext:Lcom/kwad/components/core/l/a;

    check-cast v1, Lcom/kwad/components/ad/reward/g;

    iget-object v1, v1, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/i;->C(Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->getUniqueId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/components/ad/reward/e/f;->K(Ljava/lang/String;)V

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    if-eqz v0, :cond_1

    .line 8
    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/model/c;->bH()Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->K(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v0

    .line 9
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 10
    iget-object v1, p0, Lcom/kwad/components/core/proxy/c;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/core/videocache/c/a;->by(Landroid/content/Context;)Lcom/kwad/sdk/core/videocache/f;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/kwad/sdk/core/videocache/f;->eN(Ljava/lang/String;)Z

    .line 11
    :cond_1
    invoke-static {}, Lcom/kwad/components/core/s/c;->rD()Lcom/kwad/components/core/s/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/kwad/components/core/s/c;->b(Lcom/kwad/components/core/s/c$b;)V

    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->listenerKey:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 13
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onPageClose()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->finish()V

    return-void
.end method

.method public onPause()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/kwad/components/core/l/b;->onPause()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/l/b;->mCallerContext:Lcom/kwad/components/core/l/a;

    if-eqz v0, :cond_0

    .line 3
    check-cast v0, Lcom/kwad/components/ad/reward/g;

    const-wide/16 v1, -0x1

    iput-wide v1, v0, Lcom/kwad/components/ad/reward/g;->mPageEnterTime:J

    :cond_0
    return-void
.end method

.method public onPreCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Lcom/kwad/components/core/proxy/c;->onPreCreate(Landroid/os/Bundle;)V

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lcom/kwad/components/core/proxy/c;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "key_template"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    :catchall_0
    sget-object p1, Lcom/kwad/components/core/proxy/PageCreateStage;->END_CHILD_ON_PRE_CREATE:Lcom/kwad/components/core/proxy/PageCreateStage;

    invoke-virtual {p1}, Lcom/kwad/components/core/proxy/PageCreateStage;->getStage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->reportSubPageCreate(Ljava/lang/String;)V

    return-void
.end method

.method public onPreDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/api/proxy/IActivityProxy;->onPreDestroy()V

    .line 2
    invoke-static {}, Lcom/kwad/components/core/webview/tachikoma/d/b;->tG()Lcom/kwad/components/core/webview/tachikoma/d/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/core/webview/tachikoma/d/b;->tH()V

    return-void
.end method

.method public onResume()V
    .locals 2

    .line 1
    :try_start_0
    invoke-super {p0}, Lcom/kwad/components/core/l/b;->onResume()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/model/c;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    .line 4
    invoke-static {}, Lcom/kwad/sdk/core/d/a;->Ep()Lcom/kwad/sdk/core/d/a;

    invoke-static {v0}, Lcom/kwad/sdk/core/d/a;->bW(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 5
    :cond_0
    iget-boolean v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mReportedPageResume:Z

    if-nez v0, :cond_1

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mModel:Lcom/kwad/components/ad/reward/model/c;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/model/c;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1, v0}, Lcom/kwad/components/ad/reward/monitor/c;->f(ZLcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 7
    iput-boolean v1, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mReportedPageResume:Z

    .line 8
    :cond_1
    invoke-static {}, Lcom/kwad/components/ad/reward/c/a;->gM()Lcom/kwad/components/ad/reward/c/a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/core/proxy/c;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/c/a;->M(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 9
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onUnbind()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->mIsBackEnable:Z

    .line 2
    iget-object v1, p0, Lcom/kwad/components/core/l/b;->mCallerContext:Lcom/kwad/components/core/l/a;

    check-cast v1, Lcom/kwad/components/ad/reward/g;

    invoke-virtual {v1, v0}, Lcom/kwad/components/ad/reward/g;->E(Z)V

    .line 3
    iget-object v1, p0, Lcom/kwad/components/core/l/b;->mCallerContext:Lcom/kwad/components/core/l/a;

    check-cast v1, Lcom/kwad/components/ad/reward/g;

    iput-boolean v0, v1, Lcom/kwad/components/ad/reward/g;->pe:Z

    return-void
.end method
