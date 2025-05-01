.class public final Lcom/kwad/sdk/core/b/a/fr;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static awm:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lcom/kwad/sdk/core/response/a/a;",
            ">;",
            "Lcom/kwad/sdk/core/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 2
    sput-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$SplashEndCardTKInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/iz;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/iz;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$SplashActionBarInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/ix;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/ix;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/commercial/model/WebViewLoadMsg;

    new-instance v2, Lcom/kwad/sdk/core/b/a/ky;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/ky;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/request/model/d;

    new-instance v2, Lcom/kwad/sdk/core/b/a/gw;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/gw;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdInfo$CallBackStrategyInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/bw;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/bw;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/threads/b;

    new-instance v2, Lcom/kwad/sdk/core/b/a/ka;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/ka;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/commercial/g/b;

    new-instance v2, Lcom/kwad/sdk/core/b/a/eq;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/eq;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdInfo$AdAggregateInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/h;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/h;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/commercial/c/a;

    new-instance v2, Lcom/kwad/sdk/core/b/a/bp;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/bp;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/v;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/v;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdStyleInfo$PlayDetailInfo$PatchEcInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/hk;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/hk;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/commercial/j/b;

    new-instance v2, Lcom/kwad/sdk/core/b/a/au;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/au;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdInfo$FullScreenVideoInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/ed;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/ed;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/utils/b/a;

    new-instance v2, Lcom/kwad/sdk/core/b/a/fv;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/fv;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdInfo$PlayableStyleInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/hs;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/hs;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$StyleInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/jr;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/jr;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/threads/d;

    new-instance v2, Lcom/kwad/sdk/core/b/a/kb;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/kb;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/request/model/f;

    new-instance v2, Lcom/kwad/sdk/core/b/a/jv;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/jv;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdInfo$MaterialSize;

    new-instance v2, Lcom/kwad/sdk/core/b/a/gg;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/gg;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$AdDataV2;

    new-instance v2, Lcom/kwad/sdk/core/b/a/q;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/q;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdInfo$UnDownloadRegionConf;

    new-instance v2, Lcom/kwad/sdk/core/b/a/kh;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/kh;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdInfo$AdMaterialInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/ag;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/ag;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/commercial/e/b;

    new-instance v2, Lcom/kwad/sdk/core/b/a/o;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/o;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$DownloadTexts;

    new-instance v2, Lcom/kwad/sdk/core/b/a/df;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/df;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$Styles;

    new-instance v2, Lcom/kwad/sdk/core/b/a/js;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/js;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$RewardVideoInteractInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/ie;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/ie;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/request/model/StatusInfo$NativeAdStyleControl;

    new-instance v2, Lcom/kwad/sdk/core/b/a/gr;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/gr;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdInfo$DownloadSafeInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/dd;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/dd;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/commercial/smallApp/b;

    new-instance v2, Lcom/kwad/sdk/core/b/a/iv;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/iv;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/ABParams;

    new-instance v2, Lcom/kwad/sdk/core/b/a/a;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/a;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/g/a/a;

    new-instance v2, Lcom/kwad/sdk/core/b/a/hd;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/hd;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/TKAdLiveShopItemInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/jt;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/jt;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$ActivityMiddlePageInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/g;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/g;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$ShakeInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/io;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/io;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/commercial/e/c;

    new-instance v2, Lcom/kwad/sdk/core/b/a/p;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/p;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$MatrixTemplate;

    new-instance v2, Lcom/kwad/sdk/core/b/a/gi;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/gi;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdVideoPreCacheConfig;

    new-instance v2, Lcom/kwad/sdk/core/b/a/av;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/av;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/network/j;

    new-instance v2, Lcom/kwad/sdk/core/b/a/gy;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/gy;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$AdInteractionInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/x;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/x;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdInfo$AdConversionInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/l;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/l;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$InstalledActivateInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/ff;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/ff;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$NeoVideoInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/gv;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/gv;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$PreLandingPageTKInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/hu;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/hu;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/g/a/b;

    new-instance v2, Lcom/kwad/sdk/core/b/a/he;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/he;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdStyleInfo$ExposeTagInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/dm;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/dm;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/request/model/g;

    new-instance v2, Lcom/kwad/sdk/core/b/a/kl;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/kl;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/internal/api/AdLabelImpl;

    new-instance v2, Lcom/kwad/sdk/core/b/a/y;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/y;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$SplashSlideInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/ji;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/ji;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/HttpDnsInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/eu;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/eu;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdInfo$AdBaseInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/i;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/i;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$BaseMatrixTemplate;

    new-instance v2, Lcom/kwad/sdk/core/b/a/bq;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/bq;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdStyleInfo$PlayDetailInfo$DetailTopToolBarInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/cy;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/cy;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/n/k$a;

    new-instance v2, Lcom/kwad/sdk/core/b/a/la;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/la;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/commercial/b/b;

    new-instance v2, Lcom/kwad/sdk/core/b/a/bg;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/bg;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/request/model/StatusInfo$SplashAdInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/iy;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/iy;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$RotateDegreeInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/ii;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/ii;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$RewardVideoTaskInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/if;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/if;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdInfo$H5Config;

    new-instance v2, Lcom/kwad/sdk/core/b/a/en;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/en;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/request/model/StatusInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/jp;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/jp;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdStyleInfo$PlayEndInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/ho;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/ho;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$FeedInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/ds;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/ds;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdStyleInfo$PlayEndInfo$EndTopToolBarInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/di;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/di;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$AggregationCardInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/ay;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/ay;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdStyleInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/aq;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/aq;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdInfo$CutRuleInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/cs;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/cs;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdStyleInfo$PlayEndInfo$AdWebCardInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/aw;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/aw;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/commercial/model/HybridLoadMsg;

    new-instance v2, Lcom/kwad/sdk/core/b/a/ev;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/ev;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdStyleInfo$PlayDetailInfo$PatchAdInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/hj;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/hj;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$MerchantLiveReservationInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/gj;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/gj;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdInfo$AdConversionInfo$DeeplinkItemInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/cv;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/cv;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/PageInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/hg;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/hg;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdProductInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/ak;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/ak;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/commercial/model/WebCloseStatus;

    new-instance v2, Lcom/kwad/sdk/core/b/a/kw;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/kw;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/PhotoInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/hl;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/hl;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/request/model/StatusInfo$SplashStyleControl;

    new-instance v2, Lcom/kwad/sdk/core/b/a/jj;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/jj;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/commercial/model/WebViewCommercialMsg;

    new-instance v2, Lcom/kwad/sdk/core/b/a/kx;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/kx;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdStyleInfo$FeedAdInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/dq;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/dq;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$RewardWebTaskCloseInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/ig;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/ig;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/PhotoInfo$VideoInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/kn;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/kn;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdStyleInfo$PlayDetailInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/hm;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/hm;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/n/k$a$a;

    new-instance v2, Lcom/kwad/sdk/core/b/a/jl;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/jl;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/commercial/d/b;

    new-instance v2, Lcom/kwad/sdk/core/b/a/m;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/m;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdStyleInfo$PlayDetailInfo$DetailCommonInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/cx;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/cx;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdInfo$ComplianceInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/cf;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/cf;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$RotateInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/ij;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/ij;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdInfo$AdStyleConfInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/ap;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/ap;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/scene/URLPackage;

    new-instance v2, Lcom/kwad/sdk/core/b/a/kf;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/kf;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdGlobalConfigInfo$NeoScanAggregationSceneInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/gt;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/gt;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/internal/api/NativeAdExtraDataImpl;

    new-instance v2, Lcom/kwad/sdk/core/b/a/gn;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/gn;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$TemplateData;

    new-instance v2, Lcom/kwad/sdk/core/b/a/jz;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/jz;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$MerchantLiveReservationInfo$LiveReservationPlayEndInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/fy;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/fy;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdInfo$AdRewardInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/al;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/al;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$MatrixTag;

    new-instance v2, Lcom/kwad/sdk/core/b/a/gh;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/gh;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdStyleInfo$PlayDetailInfo$DetailWebCardInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/cz;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/cz;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$ActionBarInfoNew;

    new-instance v2, Lcom/kwad/sdk/core/b/a/d;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/d;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/FeedSlideConf;

    new-instance v2, Lcom/kwad/sdk/core/b/a/du;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/du;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdInfo$NativeAdInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/go;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/go;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdStyleInfo$PlayDetailInfo$WidgetAdInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/kz;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/kz;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/internal/api/SplashExtraDataImpl;

    new-instance v2, Lcom/kwad/sdk/core/b/a/ja;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/ja;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/VideoPlayerStatus;

    new-instance v2, Lcom/kwad/sdk/core/b/a/kr;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/kr;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdStyleInfo$AdBrowseInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/k;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/k;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdMatrixInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/ah;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/ah;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$BottomBannerInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/bu;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/bu;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/commercial/a/b;

    new-instance v2, Lcom/kwad/sdk/core/b/a/bc;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/bc;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdTemplate;

    new-instance v2, Lcom/kwad/sdk/core/b/a/ar;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/ar;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/request/model/b;

    new-instance v2, Lcom/kwad/sdk/core/b/a/da;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/da;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdInfo$AdMaterialInfo$MaterialFeature;

    new-instance v2, Lcom/kwad/sdk/core/b/a/ge;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/ge;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdInfo$AdPreloadInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/aj;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/aj;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$SplashPlayCardTKInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/je;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/je;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/PhotoInfo$BaseInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/bo;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/bo;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/report/j;

    new-instance v2, Lcom/kwad/sdk/core/b/a/dj;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/dj;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/commercial/i/a;

    new-instance v2, Lcom/kwad/sdk/core/b/a/gc;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/gc;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$FullScreenInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/ec;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/ec;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdStyleInfo$PlayDetailInfo$DrawAdInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/dg;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/dg;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/imageloader/ImageLoaderInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/ey;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/ey;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$SplashInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/jb;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/jb;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/commercial/model/SDKInitMsg;

    new-instance v2, Lcom/kwad/sdk/core/b/a/ik;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/ik;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdInfo$UnDownloadConf;

    new-instance v2, Lcom/kwad/sdk/core/b/a/kg;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/kg;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$CycleAggregateInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/ct;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/ct;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/internal/api/SceneImpl;

    new-instance v2, Lcom/kwad/sdk/core/b/a/in;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/in;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/request/model/StatusInfo$NativeAdRequestInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/gp;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/gp;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/CouponInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/cp;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/cp;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdInfo$AdTrackInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/as;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/as;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/network/i;

    new-instance v2, Lcom/kwad/sdk/core/b/a/gx;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/gx;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdInfo$AdShowVideoH5Info;

    new-instance v2, Lcom/kwad/sdk/core/b/a/am;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/am;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/HttpDnsInfo$IpInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/fm;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/fm;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdGlobalConfigInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/t;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/t;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdInfo$NativeAdShakeInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/gq;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/gq;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/TemplateConfig;

    new-instance v2, Lcom/kwad/sdk/core/b/a/jx;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/jx;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/commercial/j/a$a;

    new-instance v2, Lcom/kwad/sdk/core/b/a/ke;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/ke;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdStyleInfo$ExtraDisplayInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/do;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/do;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdInfo$AdvertiserInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/ax;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/ax;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdInfo$SmallAppJumpInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/iu;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/iu;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$InterstitialCardInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/fi;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/fi;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdInfo$AdInsertScreenInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/w;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/w;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdInfo$AdFeedInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/r;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/r;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdProductInfo$SpikeInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/iw;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/iw;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$EndCardInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/dh;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/dh;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdInfo$AdSplashInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/an;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/an;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdStyleInfo$PlayDetailInfo$ActionBarInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/c;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/c;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/commercial/f/b;

    new-instance v2, Lcom/kwad/sdk/core/b/a/cw;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/cw;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    const-class v1, Lcom/kwad/sdk/core/response/model/AdStatusInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/ao;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/ao;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    invoke-static {}, Lcom/kwad/sdk/core/b/a/fr;->Ej()V

    return-void
.end method

.method private static Ej()V
    .locals 0
    .annotation runtime Lcom/ksad/annotation/invoker/ForInvoker;
        methodId = "registerHolder"
    .end annotation

    .line 1
    invoke-static {}, Lcom/kwad/sdk/core/b/a/cg;->Ej()V

    invoke-static {}, Lcom/kwad/sdk/core/b/a/ch;->Ej()V

    invoke-static {}, Lcom/kwad/sdk/core/b/a/ci;->Ej()V

    invoke-static {}, Lcom/kwad/sdk/core/b/a/cj;->Ej()V

    invoke-static {}, Lcom/kwad/sdk/core/b/a/ck;->Ej()V

    invoke-static {}, Lcom/kwad/sdk/core/b/a/cl;->Ej()V

    invoke-static {}, Lcom/kwad/sdk/core/b/a/cm;->Ej()V

    invoke-static {}, Lcom/kwad/sdk/core/b/a/cn;->Ej()V

    invoke-static {}, Lcom/kwad/sdk/core/b/a/dw;->Ej()V

    invoke-static {}, Lcom/kwad/sdk/core/b/a/dx;->Ej()V

    invoke-static {}, Lcom/kwad/sdk/core/b/a/dy;->Ej()V

    invoke-static {}, Lcom/kwad/sdk/core/b/a/dz;->Ej()V

    invoke-static {}, Lcom/kwad/sdk/core/b/a/ea;->Ej()V

    invoke-static {}, Lcom/kwad/sdk/core/b/a/eb;->Ej()V

    return-void
.end method

.method public static Ek()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lcom/kwad/sdk/core/response/a/a;",
            ">;",
            "Lcom/kwad/sdk/core/d;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    return-object v0
.end method

.method public static getHolder(Ljava/lang/Class;)Lcom/kwad/sdk/core/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/kwad/sdk/core/response/a/a;",
            ">;)",
            "Lcom/kwad/sdk/core/d;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/kwad/sdk/core/b/a/fr;->awm:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/kwad/sdk/core/d;

    return-object p0
.end method
