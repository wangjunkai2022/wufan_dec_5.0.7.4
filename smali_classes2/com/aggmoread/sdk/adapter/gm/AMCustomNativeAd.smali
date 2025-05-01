.class public Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;
.super Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/native_ad/MediationCustomNativeAd;
.source "AMCustomNativeAd.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "AMCustomNativeAd"


# instance fields
.field private VIEW_TAG:Ljava/lang/String;

.field private mAdSlot:Lcom/bytedance/sdk/openadsdk/AdSlot;

.field private mContext:Landroid/content/Context;

.field private mNativeUnifiedADData:Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;

.field private statusFlag:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;Lcom/bytedance/sdk/openadsdk/AdSlot;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/native_ad/MediationCustomNativeAd;-><init>()V

    const-string v0, "view_tag"

    .line 2
    iput-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;->VIEW_TAG:Ljava/lang/String;

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;->statusFlag:Z

    .line 4
    iput-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;->mContext:Landroid/content/Context;

    .line 5
    iput-object p2, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;->mNativeUnifiedADData:Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;

    .line 6
    iput-object p3, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;->mAdSlot:Lcom/bytedance/sdk/openadsdk/AdSlot;

    .line 7
    invoke-interface {p2}, Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;->getAppInfo()Lcom/aggmoread/sdk/client/AMAppInfo;

    move-result-object p1

    .line 8
    new-instance p2, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationNativeAdAppInfo;

    invoke-direct {p2}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationNativeAdAppInfo;-><init>()V

    if-eqz p1, :cond_0

    .line 9
    invoke-virtual {p1}, Lcom/aggmoread/sdk/client/AMAppInfo;->getAppName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationNativeAdAppInfo;->setAppName(Ljava/lang/String;)V

    .line 10
    invoke-virtual {p1}, Lcom/aggmoread/sdk/client/AMAppInfo;->getAuthorName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationNativeAdAppInfo;->setAuthorName(Ljava/lang/String;)V

    .line 11
    invoke-virtual {p1}, Lcom/aggmoread/sdk/client/AMAppInfo;->getPacakgesSize()J

    move-result-wide v1

    invoke-virtual {p2, v1, v2}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationNativeAdAppInfo;->setPackageSizeBytes(J)V

    .line 12
    invoke-virtual {p1}, Lcom/aggmoread/sdk/client/AMAppInfo;->getPermissionsUrl()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationNativeAdAppInfo;->setPermissionsUrl(Ljava/lang/String;)V

    .line 13
    invoke-virtual {p1}, Lcom/aggmoread/sdk/client/AMAppInfo;->getPrivacyAgreement()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationNativeAdAppInfo;->setPrivacyAgreement(Ljava/lang/String;)V

    .line 14
    invoke-virtual {p1}, Lcom/aggmoread/sdk/client/AMAppInfo;->getVersionName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationNativeAdAppInfo;->setVersionName(Ljava/lang/String;)V

    .line 15
    :cond_0
    invoke-virtual {p0, p2}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/native_ad/MediationCustomNativeAd;->setNativeAdAppInfo(Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationNativeAdAppInfo;)V

    .line 16
    iget-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;->mNativeUnifiedADData:Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;

    invoke-interface {p1}, Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;->getTitle()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/native_ad/MediationCustomNativeAd;->setTitle(Ljava/lang/String;)V

    .line 17
    iget-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;->mNativeUnifiedADData:Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;

    invoke-interface {p1}, Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;->getDesc()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/native_ad/MediationCustomNativeAd;->setDescription(Ljava/lang/String;)V

    .line 18
    iget-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;->mNativeUnifiedADData:Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;

    invoke-interface {p1}, Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;->getIconUrl()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/native_ad/MediationCustomNativeAd;->setIconUrl(Ljava/lang/String;)V

    .line 19
    iget-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;->mNativeUnifiedADData:Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;

    invoke-interface {p1}, Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;->getImageUrl()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/native_ad/MediationCustomNativeAd;->setImageUrl(Ljava/lang/String;)V

    .line 20
    iget-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;->mNativeUnifiedADData:Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;

    invoke-interface {p1}, Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;->getPictureWidth()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/native_ad/MediationCustomNativeAd;->setImageWidth(I)V

    .line 21
    iget-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;->mNativeUnifiedADData:Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;

    invoke-interface {p1}, Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;->getPictureHeight()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/native_ad/MediationCustomNativeAd;->setImageHeight(I)V

    .line 22
    iget-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;->mNativeUnifiedADData:Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;

    invoke-interface {p1}, Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;->getImageUrlList()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/native_ad/MediationCustomNativeAd;->setImageList(Ljava/util/List;)V

    .line 23
    iget-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;->mNativeUnifiedADData:Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;

    invoke-interface {p1}, Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;->getAppScore()I

    move-result p1

    int-to-double p1, p1

    invoke-virtual {p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/native_ad/MediationCustomNativeAd;->setStarRating(D)V

    .line 24
    iget-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;->mNativeUnifiedADData:Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;

    invoke-interface {p1}, Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;->getTitle()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/native_ad/MediationCustomNativeAd;->setSource(Ljava/lang/String;)V

    .line 25
    iget-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;->mNativeUnifiedADData:Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;

    invoke-interface {p1}, Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;->getAdPatternType()I

    move-result p1

    const/4 p2, 0x2

    const/4 p3, 0x4

    const/4 v1, 0x3

    if-ne p1, p2, :cond_1

    const/4 p1, 0x5

    .line 26
    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/native_ad/MediationCustomNativeAd;->setAdImageMode(I)V

    goto :goto_0

    .line 27
    :cond_1
    iget-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;->mNativeUnifiedADData:Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;

    invoke-interface {p1}, Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;->getAdPatternType()I

    move-result p1

    if-ne p1, v0, :cond_2

    .line 28
    invoke-virtual {p0, v1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/native_ad/MediationCustomNativeAd;->setAdImageMode(I)V

    goto :goto_0

    .line 29
    :cond_2
    iget-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;->mNativeUnifiedADData:Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;

    invoke-interface {p1}, Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;->getAdPatternType()I

    move-result p1

    if-ne p1, v1, :cond_3

    .line 30
    invoke-virtual {p0, p3}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/native_ad/MediationCustomNativeAd;->setAdImageMode(I)V

    .line 31
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;->mNativeUnifiedADData:Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;

    invoke-interface {p1}, Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;->isAppAd()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 32
    invoke-virtual {p0, p3}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/native_ad/MediationCustomNativeAd;->setInteractionType(I)V

    goto :goto_1

    .line 33
    :cond_4
    invoke-virtual {p0, v1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/native_ad/MediationCustomNativeAd;->setInteractionType(I)V

    :goto_1
    return-void
.end method

.method static synthetic access$000(Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;)Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;->mNativeUnifiedADData:Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;

    return-object p0
.end method

.method static synthetic access$002(Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;)Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;->mNativeUnifiedADData:Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;

    return-object p1
.end method

.method static synthetic access$100(Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;)Lcom/bytedance/sdk/openadsdk/AdSlot;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;->mAdSlot:Lcom/bytedance/sdk/openadsdk/AdSlot;

    return-object p0
.end method

.method static synthetic access$200(Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic access$300()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;->TAG:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/native_ad/MediationCustomNativeAd;->onDestroy()V

    .line 2
    new-instance v0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$4;

    invoke-direct {v0, p0}, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$4;-><init>(Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;)V

    invoke-static {v0}, Lcom/aggmoread/sdk/adapter/helper/ThreadHelper;->runInMainThread(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onPause()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/native_ad/MediationCustomNativeAd;->onPause()V

    .line 2
    new-instance v0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$2;

    invoke-direct {v0, p0}, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$2;-><init>(Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;)V

    invoke-static {v0}, Lcom/aggmoread/sdk/adapter/helper/ThreadHelper;->runOnUIThreadByThreadPool(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onResume()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/native_ad/MediationCustomNativeAd;->onResume()V

    .line 2
    new-instance v0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$3;

    invoke-direct {v0, p0}, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$3;-><init>(Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;)V

    invoke-static {v0}, Lcom/aggmoread/sdk/adapter/helper/ThreadHelper;->runOnUIThreadByThreadPool(Ljava/lang/Runnable;)V

    return-void
.end method

.method public receiveBidResult(ZDILjava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZDI",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;->mNativeUnifiedADData:Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;

    invoke-static {v0, p1, p2, p3, p4}, Lcom/aggmoread/sdk/adapter/helper/AdapterHelper;->notifyBidResult(Lcom/aggmoread/sdk/client/AMAdInterface;ZDI)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-super/range {p0 .. p5}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/native_ad/MediationCustomNativeAd;->receiveBidResult(ZDILjava/util/Map;)V

    :cond_0
    return-void
.end method

.method public registerView(Landroid/app/Activity;Landroid/view/ViewGroup;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Landroid/view/ViewGroup;",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;",
            "Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;",
            ")V"
        }
    .end annotation

    const-string p4, "registerView enter "

    .line 1
    invoke-static {p4}, Lcom/aggmoread/sdk/adapter/helper/LogHelper;->log(Ljava/lang/String;)V

    .line 2
    new-instance p4, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$1;

    move-object v0, p4

    move-object v1, p0

    move-object v2, p2

    move-object v3, p1

    move-object v4, p3

    move-object v5, p6

    invoke-direct/range {v0 .. v5}, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$1;-><init>(Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;Landroid/view/ViewGroup;Landroid/app/Activity;Ljava/util/List;Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;)V

    invoke-static {p4}, Lcom/aggmoread/sdk/adapter/helper/ThreadHelper;->runOnUIThreadByThreadPool(Ljava/lang/Runnable;)V

    return-void
.end method
