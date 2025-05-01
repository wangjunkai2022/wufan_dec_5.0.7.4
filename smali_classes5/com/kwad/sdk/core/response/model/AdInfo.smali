.class public Lcom/kwad/sdk/core/response/model/AdInfo;
.super Lcom/kwad/sdk/core/response/a/a;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation build Lcom/ksad/json/annotation/KsJson;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/sdk/core/response/model/AdInfo$AdFeedInfo;,
        Lcom/kwad/sdk/core/response/model/AdInfo$AdInsertScreenInfo;,
        Lcom/kwad/sdk/core/response/model/AdInfo$FullScreenVideoInfo;,
        Lcom/kwad/sdk/core/response/model/AdInfo$NativeAdShakeInfo;,
        Lcom/kwad/sdk/core/response/model/AdInfo$NativeAdInfo;,
        Lcom/kwad/sdk/core/response/model/AdInfo$AdStyleConfInfo;,
        Lcom/kwad/sdk/core/response/model/AdInfo$AdShowVideoH5Info;,
        Lcom/kwad/sdk/core/response/model/AdInfo$CallBackStrategyInfo;,
        Lcom/kwad/sdk/core/response/model/AdInfo$AdRewardInfo;,
        Lcom/kwad/sdk/core/response/model/AdInfo$ComplianceInfo;,
        Lcom/kwad/sdk/core/response/model/AdInfo$AdAggregateInfo;,
        Lcom/kwad/sdk/core/response/model/AdInfo$SmallAppJumpInfo;,
        Lcom/kwad/sdk/core/response/model/AdInfo$PlayableStyleInfo;,
        Lcom/kwad/sdk/core/response/model/AdInfo$UnDownloadRegionConf;,
        Lcom/kwad/sdk/core/response/model/AdInfo$UnDownloadConf;,
        Lcom/kwad/sdk/core/response/model/AdInfo$DownloadSafeInfo;,
        Lcom/kwad/sdk/core/response/model/AdInfo$CutRuleInfo;,
        Lcom/kwad/sdk/core/response/model/AdInfo$AdSplashInfo;,
        Lcom/kwad/sdk/core/response/model/AdInfo$AdPreloadInfo;,
        Lcom/kwad/sdk/core/response/model/AdInfo$AdvertiserInfo;,
        Lcom/kwad/sdk/core/response/model/AdInfo$AdTrackInfo;,
        Lcom/kwad/sdk/core/response/model/AdInfo$AdMaterialInfo;,
        Lcom/kwad/sdk/core/response/model/AdInfo$AdConversionInfo;,
        Lcom/kwad/sdk/core/response/model/AdInfo$MaterialSize;,
        Lcom/kwad/sdk/core/response/model/AdInfo$H5Config;,
        Lcom/kwad/sdk/core/response/model/AdInfo$AdBaseInfo;
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x79468d1d0d94563dL


# instance fields
.field public adAggregateInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdAggregateInfo;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public adBaseInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdBaseInfo;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public adConversionInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdConversionInfo;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public adFeedInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdFeedInfo;

.field public adInsertScreenInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdInsertScreenInfo;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public adMaterialInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdMaterialInfo;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public adMatrixInfo:Lcom/kwad/sdk/core/response/model/AdMatrixInfo;

.field public adPreloadInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdPreloadInfo;

.field public adProductInfo:Lcom/kwad/sdk/core/response/model/AdProductInfo;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public adRewardInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdRewardInfo;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public adSplashInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdSplashInfo;

.field public adStyleConfInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdStyleConfInfo;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public adStyleInfo:Lcom/kwad/sdk/core/response/model/AdStyleInfo;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public adStyleInfo2:Lcom/kwad/sdk/core/response/model/AdStyleInfo;

.field public adTkGreyConfig:Lorg/json/JSONObject;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public adTrackInfoList:Ljava/util/List;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/sdk/core/response/model/AdInfo$AdTrackInfo;",
            ">;"
        }
    .end annotation
.end field

.field public advertiserInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdvertiserInfo;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public downloadFilePath:Ljava/lang/String;

.field public downloadId:Ljava/lang/String;

.field public downloadSafeInfo:Lcom/kwad/sdk/core/response/model/AdInfo$DownloadSafeInfo;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public fullScreenVideoInfo:Lcom/kwad/sdk/core/response/model/AdInfo$FullScreenVideoInfo;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public mStartDownloadTime:J

.field public ocpcActionType:I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public progress:I

.field public serverExt:Ljava/lang/String;

.field public soFarBytes:J

.field public status:I

.field public totalBytes:J

.field public trace:Ljava/lang/String;

.field public unDownloadConf:Lcom/kwad/sdk/core/response/model/AdInfo$UnDownloadConf;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/response/a/a;-><init>()V

    .line 2
    new-instance v0, Lcom/kwad/sdk/core/response/model/AdInfo$AdBaseInfo;

    invoke-direct {v0}, Lcom/kwad/sdk/core/response/model/AdInfo$AdBaseInfo;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/core/response/model/AdInfo;->adBaseInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdBaseInfo;

    .line 3
    new-instance v0, Lcom/kwad/sdk/core/response/model/AdInfo$AdvertiserInfo;

    invoke-direct {v0}, Lcom/kwad/sdk/core/response/model/AdInfo$AdvertiserInfo;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/core/response/model/AdInfo;->advertiserInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdvertiserInfo;

    .line 4
    new-instance v0, Lcom/kwad/sdk/core/response/model/AdInfo$AdConversionInfo;

    invoke-direct {v0}, Lcom/kwad/sdk/core/response/model/AdInfo$AdConversionInfo;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/core/response/model/AdInfo;->adConversionInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdConversionInfo;

    .line 5
    new-instance v0, Lcom/kwad/sdk/core/response/model/AdInfo$AdMaterialInfo;

    invoke-direct {v0}, Lcom/kwad/sdk/core/response/model/AdInfo$AdMaterialInfo;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/core/response/model/AdInfo;->adMaterialInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdMaterialInfo;

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/core/response/model/AdInfo;->adTrackInfoList:Ljava/util/List;

    .line 7
    new-instance v0, Lcom/kwad/sdk/core/response/model/AdInfo$DownloadSafeInfo;

    invoke-direct {v0}, Lcom/kwad/sdk/core/response/model/AdInfo$DownloadSafeInfo;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/core/response/model/AdInfo;->downloadSafeInfo:Lcom/kwad/sdk/core/response/model/AdInfo$DownloadSafeInfo;

    .line 8
    new-instance v0, Lcom/kwad/sdk/core/response/model/AdInfo$UnDownloadConf;

    invoke-direct {v0}, Lcom/kwad/sdk/core/response/model/AdInfo$UnDownloadConf;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/core/response/model/AdInfo;->unDownloadConf:Lcom/kwad/sdk/core/response/model/AdInfo$UnDownloadConf;

    const/4 v0, 0x0

    .line 9
    iput v0, p0, Lcom/kwad/sdk/core/response/model/AdInfo;->status:I

    .line 10
    new-instance v0, Lcom/kwad/sdk/core/response/model/AdInfo$AdPreloadInfo;

    invoke-direct {v0}, Lcom/kwad/sdk/core/response/model/AdInfo$AdPreloadInfo;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/core/response/model/AdInfo;->adPreloadInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdPreloadInfo;

    .line 11
    new-instance v0, Lcom/kwad/sdk/core/response/model/AdInfo$AdSplashInfo;

    invoke-direct {v0}, Lcom/kwad/sdk/core/response/model/AdInfo$AdSplashInfo;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/core/response/model/AdInfo;->adSplashInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdSplashInfo;

    .line 12
    new-instance v0, Lcom/kwad/sdk/core/response/model/AdStyleInfo;

    invoke-direct {v0}, Lcom/kwad/sdk/core/response/model/AdStyleInfo;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/core/response/model/AdInfo;->adStyleInfo:Lcom/kwad/sdk/core/response/model/AdStyleInfo;

    .line 13
    new-instance v0, Lcom/kwad/sdk/core/response/model/AdStyleInfo;

    invoke-direct {v0}, Lcom/kwad/sdk/core/response/model/AdStyleInfo;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/core/response/model/AdInfo;->adStyleInfo2:Lcom/kwad/sdk/core/response/model/AdStyleInfo;

    .line 14
    new-instance v0, Lcom/kwad/sdk/core/response/model/AdInfo$AdAggregateInfo;

    invoke-direct {v0}, Lcom/kwad/sdk/core/response/model/AdInfo$AdAggregateInfo;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/core/response/model/AdInfo;->adAggregateInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdAggregateInfo;

    .line 15
    new-instance v0, Lcom/kwad/sdk/core/response/model/AdInfo$AdRewardInfo;

    invoke-direct {v0}, Lcom/kwad/sdk/core/response/model/AdInfo$AdRewardInfo;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/core/response/model/AdInfo;->adRewardInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdRewardInfo;

    .line 16
    new-instance v0, Lcom/kwad/sdk/core/response/model/AdInfo$AdStyleConfInfo;

    invoke-direct {v0}, Lcom/kwad/sdk/core/response/model/AdInfo$AdStyleConfInfo;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/core/response/model/AdInfo;->adStyleConfInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdStyleConfInfo;

    .line 17
    new-instance v0, Lcom/kwad/sdk/core/response/model/AdInfo$FullScreenVideoInfo;

    invoke-direct {v0}, Lcom/kwad/sdk/core/response/model/AdInfo$FullScreenVideoInfo;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/core/response/model/AdInfo;->fullScreenVideoInfo:Lcom/kwad/sdk/core/response/model/AdInfo$FullScreenVideoInfo;

    .line 18
    new-instance v0, Lcom/kwad/sdk/core/response/model/AdInfo$AdFeedInfo;

    invoke-direct {v0}, Lcom/kwad/sdk/core/response/model/AdInfo$AdFeedInfo;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/core/response/model/AdInfo;->adFeedInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdFeedInfo;

    .line 19
    new-instance v0, Lcom/kwad/sdk/core/response/model/AdInfo$AdInsertScreenInfo;

    invoke-direct {v0}, Lcom/kwad/sdk/core/response/model/AdInfo$AdInsertScreenInfo;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/core/response/model/AdInfo;->adInsertScreenInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdInsertScreenInfo;

    .line 20
    new-instance v0, Lcom/kwad/sdk/core/response/model/AdProductInfo;

    invoke-direct {v0}, Lcom/kwad/sdk/core/response/model/AdProductInfo;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/core/response/model/AdInfo;->adProductInfo:Lcom/kwad/sdk/core/response/model/AdProductInfo;

    .line 21
    new-instance v0, Lcom/kwad/sdk/core/response/model/AdMatrixInfo;

    invoke-direct {v0}, Lcom/kwad/sdk/core/response/model/AdMatrixInfo;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/core/response/model/AdInfo;->adMatrixInfo:Lcom/kwad/sdk/core/response/model/AdMatrixInfo;

    return-void
.end method


# virtual methods
.method public afterParseJson(Lorg/json/JSONObject;)V
    .locals 0
    .param p1    # Lorg/json/JSONObject;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Lcom/kwad/sdk/core/response/a/a;->afterParseJson(Lorg/json/JSONObject;)V

    .line 2
    iget-object p1, p0, Lcom/kwad/sdk/core/response/model/AdInfo;->adConversionInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdConversionInfo;

    iget-object p1, p1, Lcom/kwad/sdk/core/response/model/AdInfo$AdConversionInfo;->appDownloadUrl:Ljava/lang/String;

    invoke-static {p1}, Lcom/kwad/sdk/utils/ae;->bx(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/sdk/core/response/model/AdInfo;->downloadId:Ljava/lang/String;

    return-void
.end method
