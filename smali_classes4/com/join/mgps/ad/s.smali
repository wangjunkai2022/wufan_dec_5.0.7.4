.class public Lcom/join/mgps/ad/s;
.super Lcom/join/mgps/ad/d;
.source "RERewardVideo.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/ad/s$a;
    }
.end annotation


# instance fields
.field private m:Lcom/aggmoread/sdk/client/reward/AMRewardAd;

.field n:Lcom/aggmoread/sdk/client/AMAdLoader;

.field private o:Lcom/aggmoread/sdk/client/AMVideoConfigs;

.field private p:Z

.field private q:Lcom/join/mgps/ad/s$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "RE"

    .line 1
    invoke-direct {p0, v0, p1, p2, p3}, Lcom/join/mgps/ad/d;-><init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/join/mgps/ad/s;->p:Z

    return-void
.end method

.method static synthetic v(Lcom/join/mgps/ad/s;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/ad/s;->p:Z

    return p1
.end method

.method static synthetic w(Lcom/join/mgps/ad/s;Lcom/aggmoread/sdk/client/reward/AMRewardAd;)Lcom/aggmoread/sdk/client/reward/AMRewardAd;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/ad/s;->m:Lcom/aggmoread/sdk/client/reward/AMRewardAd;

    return-object p1
.end method

.method private x(Z)V
    .locals 1

    .line 1
    new-instance p1, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;

    invoke-direct {p1}, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;-><init>()V

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p1, v0}, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->setAutoPlayMuted(Z)Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;

    .line 3
    invoke-virtual {p1, v0}, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->setAutoPlayPolicy(I)Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;

    .line 4
    invoke-virtual {p1, v0}, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->setEnableDetailPage(Z)Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;

    .line 5
    invoke-virtual {p1, v0}, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->setDetailPageMuted(Z)Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;

    .line 6
    invoke-virtual {p1, v0}, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->setEnableUserControl(Z)Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;

    .line 7
    invoke-virtual {p1, v0}, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->setNeedCoverImage(Z)Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;

    .line 8
    invoke-virtual {p1, v0}, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->setNeedProgressBar(Z)Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;

    .line 9
    invoke-virtual {p1}, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->build()Lcom/aggmoread/sdk/client/AMVideoConfigs;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/ad/s;->o:Lcom/aggmoread/sdk/client/AMVideoConfigs;

    return-void
.end method


# virtual methods
.method public e()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/ad/s;->q:Lcom/join/mgps/ad/s$a;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/join/mgps/ad/s$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/ad/s$a;-><init>(Lcom/join/mgps/ad/s;)V

    iput-object v0, p0, Lcom/join/mgps/ad/s;->q:Lcom/join/mgps/ad/s$a;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/ad/d;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/join/mgps/ad/d;->b:Ljava/lang/String;

    new-instance v2, Lcom/join/mgps/ad/r;

    invoke-direct {v2, p0}, Lcom/join/mgps/ad/r;-><init>(Lcom/join/mgps/ad/s;)V

    invoke-static {v0, v1, v2}, Lcom/join/mgps/ad/adapter/d;->a(Landroid/content/Context;Ljava/lang/String;Ls1/a;)V

    return-void
.end method

.method protected f()Z
    .locals 4

    .line 1
    sget-boolean v0, Lcom/join/mgps/ad/d;->l:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RewardVideoAd:"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/join/mgps/ad/s;->m:Lcom/aggmoread/sdk/client/reward/AMRewardAd;

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, "hasLoaded:"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v3, p0, Lcom/join/mgps/ad/s;->p:Z

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 3
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/ad/s;->m:Lcom/aggmoread/sdk/client/reward/AMRewardAd;

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/join/mgps/ad/s;->p:Z

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    return v1
.end method

.method public h(Z)V
    .locals 6

    const-string v0, "\u5e7f\u544a\u52a0\u8f7d\u9519\u8bef"

    const/4 v1, -0x1

    const/4 v2, 0x0

    const/4 v3, 0x5

    .line 1
    :try_start_0
    iput-boolean v2, p0, Lcom/join/mgps/ad/s;->p:Z

    .line 2
    sget-boolean v4, Lcom/join/mgps/ad/d;->l:Z

    if-eqz v4, :cond_0

    .line 3
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "load:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lcom/join/mgps/ad/s;->x(Z)V

    .line 5
    iget-object v4, p0, Lcom/join/mgps/ad/s;->q:Lcom/join/mgps/ad/s$a;

    if-nez v4, :cond_1

    .line 6
    new-instance v4, Lcom/join/mgps/ad/s$a;

    invoke-direct {v4, p0}, Lcom/join/mgps/ad/s$a;-><init>(Lcom/join/mgps/ad/s;)V

    iput-object v4, p0, Lcom/join/mgps/ad/s;->q:Lcom/join/mgps/ad/s$a;

    .line 7
    :cond_1
    iget-object v4, p0, Lcom/join/mgps/ad/s;->q:Lcom/join/mgps/ad/s$a;

    invoke-virtual {v4, p1}, Lcom/join/mgps/ad/s$a;->a(Z)V

    .line 8
    iget-boolean p1, p0, Lcom/join/mgps/ad/d;->j:Z

    if-eqz p1, :cond_2

    return-void

    :cond_2
    const/4 p1, 0x1

    .line 9
    iput-boolean p1, p0, Lcom/join/mgps/ad/d;->j:Z

    .line 10
    iget-object v4, p0, Lcom/join/mgps/ad/s;->n:Lcom/aggmoread/sdk/client/AMAdLoader;

    if-nez v4, :cond_3

    .line 11
    new-instance v4, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;

    invoke-direct {v4}, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;-><init>()V

    iget-object v5, p0, Lcom/join/mgps/ad/d;->c:Ljava/lang/String;

    .line 12
    invoke-virtual {v4, v5}, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;->setSlotId(Ljava/lang/String;)Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;

    move-result-object v4

    iget-object v5, p0, Lcom/join/mgps/ad/s;->o:Lcom/aggmoread/sdk/client/AMVideoConfigs;

    .line 13
    invoke-virtual {v4, v5}, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;->setVideoConfig(Lcom/aggmoread/sdk/client/AMVideoConfigs;)Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;

    move-result-object v4

    .line 14
    invoke-virtual {v4, p1}, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;->setAdCount(I)Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;

    move-result-object p1

    const/4 v4, 0x0

    .line 15
    invoke-virtual {p1, v4}, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;->setSSBidToken(Ljava/lang/String;)Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;

    move-result-object p1

    .line 16
    invoke-virtual {p1}, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;->build()Lcom/aggmoread/sdk/client/AMAdLoadSlot;

    move-result-object p1

    .line 17
    invoke-static {p1}, Lcom/aggmoread/sdk/client/AMSdk;->makeAdLoader(Lcom/aggmoread/sdk/client/AMAdLoadSlot;)Lcom/aggmoread/sdk/client/AMAdLoader;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/ad/s;->n:Lcom/aggmoread/sdk/client/AMAdLoader;

    .line 18
    :cond_3
    iget-object p1, p0, Lcom/join/mgps/ad/s;->n:Lcom/aggmoread/sdk/client/AMAdLoader;

    if-eqz p1, :cond_4

    .line 19
    iget-object v4, p0, Lcom/join/mgps/ad/d;->a:Landroid/content/Context;

    iget-object v5, p0, Lcom/join/mgps/ad/s;->q:Lcom/join/mgps/ad/s$a;

    invoke-virtual {p1, v4, v5}, Lcom/aggmoread/sdk/client/AMAdLoader;->loadRewardAd(Landroid/content/Context;Lcom/aggmoread/sdk/client/reward/AMRewardAdListener;)V

    goto :goto_2

    .line 20
    :cond_4
    iget-object p1, p0, Lcom/join/mgps/ad/d;->k:Ljava/util/Map;

    if-eqz p1, :cond_5

    .line 21
    iget-object v4, p0, Lcom/join/mgps/ad/d;->a:Landroid/content/Context;

    invoke-static {v4, v3, p1}, Lcom/join/mgps/ad/d;->j(Landroid/content/Context;ILjava/util/Map;)V

    goto :goto_0

    .line 22
    :cond_5
    iget-object p1, p0, Lcom/join/mgps/ad/d;->a:Landroid/content/Context;

    invoke-static {p1, v3}, Lcom/join/mgps/ad/d;->i(Landroid/content/Context;I)V

    .line 23
    :goto_0
    invoke-virtual {p0, v1, v0}, Lcom/join/mgps/ad/d;->onError(ILjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    .line 24
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 25
    iput-boolean v2, p0, Lcom/join/mgps/ad/d;->j:Z

    .line 26
    iget-object p1, p0, Lcom/join/mgps/ad/d;->k:Ljava/util/Map;

    if-eqz p1, :cond_6

    .line 27
    iget-object v2, p0, Lcom/join/mgps/ad/d;->a:Landroid/content/Context;

    invoke-static {v2, v3, p1}, Lcom/join/mgps/ad/d;->j(Landroid/content/Context;ILjava/util/Map;)V

    goto :goto_1

    .line 28
    :cond_6
    iget-object p1, p0, Lcom/join/mgps/ad/d;->a:Landroid/content/Context;

    invoke-static {p1, v3}, Lcom/join/mgps/ad/d;->i(Landroid/content/Context;I)V

    .line 29
    :goto_1
    invoke-virtual {p0, v1, v0}, Lcom/join/mgps/ad/d;->onError(ILjava/lang/String;)V

    :goto_2
    return-void
.end method

.method protected u(Landroid/app/Activity;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/ad/d;->u(Landroid/app/Activity;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/ad/s;->m:Lcom/aggmoread/sdk/client/reward/AMRewardAd;

    iget-object v1, p0, Lcom/join/mgps/ad/s;->q:Lcom/join/mgps/ad/s$a;

    invoke-interface {v0, p1, v1}, Lcom/aggmoread/sdk/client/reward/AMRewardAd;->show(Landroid/app/Activity;Lcom/aggmoread/sdk/client/reward/AMRewardInteractionListener;)V

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lcom/join/mgps/ad/s;->m:Lcom/aggmoread/sdk/client/reward/AMRewardAd;

    return-void
.end method
