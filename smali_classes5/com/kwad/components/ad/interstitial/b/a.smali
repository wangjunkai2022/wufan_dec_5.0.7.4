.class public final Lcom/kwad/components/ad/interstitial/b/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static jr:Lcom/kwad/sdk/core/config/item/k;

.field public static js:Lcom/kwad/sdk/core/config/item/k;

.field public static jt:Lcom/kwad/sdk/core/config/item/k;

.field public static ju:Lcom/kwad/sdk/core/config/item/k;

.field public static jv:Lcom/kwad/sdk/core/config/item/k;

.field public static jw:Lcom/kwad/sdk/core/config/item/k;

.field public static jx:Lcom/kwad/sdk/core/config/item/d;

.field public static jy:Lcom/kwad/sdk/core/config/item/k;

.field public static jz:Lcom/kwad/sdk/core/config/item/k;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/kwad/sdk/core/config/item/k;

    const/4 v1, 0x0

    .line 2
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "interstitialAdSkipCloseType"

    invoke-direct {v0, v3, v2}, Lcom/kwad/sdk/core/config/item/k;-><init>(Ljava/lang/String;Ljava/lang/Integer;)V

    sput-object v0, Lcom/kwad/components/ad/interstitial/b/a;->jr:Lcom/kwad/sdk/core/config/item/k;

    .line 3
    new-instance v0, Lcom/kwad/sdk/core/config/item/k;

    const-string v3, "interstitialAdSkipCloseArea"

    .line 4
    invoke-direct {v0, v3, v2}, Lcom/kwad/sdk/core/config/item/k;-><init>(Ljava/lang/String;Ljava/lang/Integer;)V

    sput-object v0, Lcom/kwad/components/ad/interstitial/b/a;->js:Lcom/kwad/sdk/core/config/item/k;

    .line 5
    new-instance v0, Lcom/kwad/sdk/core/config/item/k;

    const/4 v3, 0x1

    .line 6
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "interstitialAdFullClick"

    invoke-direct {v0, v4, v3}, Lcom/kwad/sdk/core/config/item/k;-><init>(Ljava/lang/String;Ljava/lang/Integer;)V

    sput-object v0, Lcom/kwad/components/ad/interstitial/b/a;->jt:Lcom/kwad/sdk/core/config/item/k;

    .line 7
    new-instance v0, Lcom/kwad/sdk/core/config/item/k;

    const-string v3, "interstitialAdBackPressSwitch"

    .line 8
    invoke-direct {v0, v3, v2}, Lcom/kwad/sdk/core/config/item/k;-><init>(Ljava/lang/String;Ljava/lang/Integer;)V

    sput-object v0, Lcom/kwad/components/ad/interstitial/b/a;->ju:Lcom/kwad/sdk/core/config/item/k;

    .line 9
    new-instance v0, Lcom/kwad/sdk/core/config/item/k;

    const/16 v3, 0x3e7

    .line 10
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "interstitialPlayableTime"

    invoke-direct {v0, v4, v3}, Lcom/kwad/sdk/core/config/item/k;-><init>(Ljava/lang/String;Ljava/lang/Integer;)V

    sput-object v0, Lcom/kwad/components/ad/interstitial/b/a;->jv:Lcom/kwad/sdk/core/config/item/k;

    .line 11
    new-instance v0, Lcom/kwad/sdk/core/config/item/k;

    const-string v3, "interstitialAdClickShutDown"

    .line 12
    invoke-direct {v0, v3, v2}, Lcom/kwad/sdk/core/config/item/k;-><init>(Ljava/lang/String;Ljava/lang/Integer;)V

    sput-object v0, Lcom/kwad/components/ad/interstitial/b/a;->jw:Lcom/kwad/sdk/core/config/item/k;

    .line 13
    new-instance v0, Lcom/kwad/sdk/core/config/item/d;

    const-string v3, "interstitialAutoStartSwitch"

    invoke-direct {v0, v3, v1}, Lcom/kwad/sdk/core/config/item/d;-><init>(Ljava/lang/String;Z)V

    sput-object v0, Lcom/kwad/components/ad/interstitial/b/a;->jx:Lcom/kwad/sdk/core/config/item/d;

    .line 14
    new-instance v0, Lcom/kwad/sdk/core/config/item/k;

    const-string v1, "ecInterstitialAdOrderSwitch"

    .line 15
    invoke-direct {v0, v1, v2}, Lcom/kwad/sdk/core/config/item/k;-><init>(Ljava/lang/String;Ljava/lang/Integer;)V

    sput-object v0, Lcom/kwad/components/ad/interstitial/b/a;->jy:Lcom/kwad/sdk/core/config/item/k;

    .line 16
    new-instance v0, Lcom/kwad/sdk/core/config/item/k;

    const/4 v1, 0x3

    .line 17
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "interstitialCycleAggregateMaxCount"

    invoke-direct {v0, v2, v1}, Lcom/kwad/sdk/core/config/item/k;-><init>(Ljava/lang/String;Ljava/lang/Integer;)V

    sput-object v0, Lcom/kwad/components/ad/interstitial/b/a;->jz:Lcom/kwad/sdk/core/config/item/k;

    return-void
.end method

.method public static init()V
    .locals 0
    .annotation build Lcom/ksad/annotation/invoker/InvokeBy;
        invokerClass = Lcom/kwad/sdk/core/config/d;
        methodId = "initConfigList"
    .end annotation

    return-void
.end method
