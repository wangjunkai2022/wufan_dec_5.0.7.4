.class public final Lcom/kwad/components/ad/reward/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static qA:Lcom/kwad/sdk/core/config/item/k;

.field public static qB:Lcom/kwad/sdk/core/config/item/k;

.field public static qC:Lcom/kwad/sdk/core/config/item/k;

.field public static qD:Lcom/kwad/sdk/core/config/item/k;

.field public static qE:Lcom/kwad/sdk/core/config/item/k;

.field public static qF:Lcom/kwad/sdk/core/config/item/g;

.field public static qG:Lcom/kwad/sdk/core/config/item/d;

.field public static qH:Lcom/kwad/sdk/core/config/item/k;

.field public static qI:Lcom/kwad/sdk/core/config/item/d;

.field public static qJ:Lcom/kwad/sdk/core/config/item/k;

.field public static qK:Lcom/kwad/sdk/core/config/item/d;

.field public static qL:Lcom/kwad/sdk/core/config/item/d;

.field public static qu:Lcom/kwad/sdk/core/config/item/k;

.field public static qv:Lcom/kwad/sdk/core/config/item/k;

.field public static qw:Lcom/kwad/sdk/core/config/item/k;

.field public static qx:Lcom/kwad/sdk/core/config/item/d;

.field public static qy:Lcom/kwad/sdk/core/config/item/q;

.field public static qz:Lcom/kwad/sdk/core/config/item/q;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/kwad/sdk/core/config/item/k;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "rewardSkipType"

    invoke-direct {v0, v3, v2}, Lcom/kwad/sdk/core/config/item/k;-><init>(Ljava/lang/String;Ljava/lang/Integer;)V

    sput-object v0, Lcom/kwad/components/ad/reward/a/a;->qu:Lcom/kwad/sdk/core/config/item/k;

    .line 2
    new-instance v0, Lcom/kwad/sdk/core/config/item/k;

    const/16 v3, 0xf

    .line 3
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "rewardActiveAppTaskMinSecond"

    invoke-direct {v0, v4, v3}, Lcom/kwad/sdk/core/config/item/k;-><init>(Ljava/lang/String;Ljava/lang/Integer;)V

    sput-object v0, Lcom/kwad/components/ad/reward/a/a;->qv:Lcom/kwad/sdk/core/config/item/k;

    .line 4
    new-instance v0, Lcom/kwad/sdk/core/config/item/k;

    const-string v3, "rewardContentDetainType"

    invoke-direct {v0, v3, v2}, Lcom/kwad/sdk/core/config/item/k;-><init>(Ljava/lang/String;Ljava/lang/Integer;)V

    sput-object v0, Lcom/kwad/components/ad/reward/a/a;->qw:Lcom/kwad/sdk/core/config/item/k;

    .line 5
    new-instance v0, Lcom/kwad/sdk/core/config/item/d;

    const-string v3, "forceGetAudioFocus"

    invoke-direct {v0, v3, v1}, Lcom/kwad/sdk/core/config/item/d;-><init>(Ljava/lang/String;Z)V

    sput-object v0, Lcom/kwad/components/ad/reward/a/a;->qx:Lcom/kwad/sdk/core/config/item/d;

    .line 6
    new-instance v0, Lcom/kwad/sdk/core/config/item/q;

    const-string v3, "rewardSkipTips"

    const-string v4, ""

    invoke-direct {v0, v3, v4}, Lcom/kwad/sdk/core/config/item/q;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/kwad/components/ad/reward/a/a;->qy:Lcom/kwad/sdk/core/config/item/q;

    .line 7
    new-instance v0, Lcom/kwad/sdk/core/config/item/q;

    const-string v3, "fullscreenSkipTips"

    invoke-direct {v0, v3, v4}, Lcom/kwad/sdk/core/config/item/q;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/kwad/components/ad/reward/a/a;->qz:Lcom/kwad/sdk/core/config/item/q;

    .line 8
    new-instance v0, Lcom/kwad/sdk/core/config/item/k;

    const-string v3, "ecRewardAdOrderSwitch"

    .line 9
    invoke-direct {v0, v3, v2}, Lcom/kwad/sdk/core/config/item/k;-><init>(Ljava/lang/String;Ljava/lang/Integer;)V

    sput-object v0, Lcom/kwad/components/ad/reward/a/a;->qA:Lcom/kwad/sdk/core/config/item/k;

    .line 10
    new-instance v0, Lcom/kwad/sdk/core/config/item/k;

    const-string v3, "ecRewardAdFanSwitch"

    invoke-direct {v0, v3, v2}, Lcom/kwad/sdk/core/config/item/k;-><init>(Ljava/lang/String;Ljava/lang/Integer;)V

    sput-object v0, Lcom/kwad/components/ad/reward/a/a;->qB:Lcom/kwad/sdk/core/config/item/k;

    .line 11
    new-instance v0, Lcom/kwad/sdk/core/config/item/k;

    const-string v3, "ecRewardAdKwaishopStyle"

    invoke-direct {v0, v3, v2}, Lcom/kwad/sdk/core/config/item/k;-><init>(Ljava/lang/String;Ljava/lang/Integer;)V

    sput-object v0, Lcom/kwad/components/ad/reward/a/a;->qC:Lcom/kwad/sdk/core/config/item/k;

    .line 12
    new-instance v0, Lcom/kwad/sdk/core/config/item/k;

    const/16 v3, 0xbb8

    .line 13
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "xdtCouponShowDuration"

    invoke-direct {v0, v4, v3}, Lcom/kwad/sdk/core/config/item/k;-><init>(Ljava/lang/String;Ljava/lang/Integer;)V

    sput-object v0, Lcom/kwad/components/ad/reward/a/a;->qD:Lcom/kwad/sdk/core/config/item/k;

    .line 14
    new-instance v0, Lcom/kwad/sdk/core/config/item/k;

    const/4 v3, 0x1

    .line 15
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "jinniuCloseDialogStyle"

    invoke-direct {v0, v4, v3}, Lcom/kwad/sdk/core/config/item/k;-><init>(Ljava/lang/String;Ljava/lang/Integer;)V

    sput-object v0, Lcom/kwad/components/ad/reward/a/a;->qE:Lcom/kwad/sdk/core/config/item/k;

    .line 16
    new-instance v0, Lcom/kwad/sdk/core/config/item/g;

    const-string v3, "interactionTimeInRewardedVideo"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4}, Lcom/kwad/sdk/core/config/item/g;-><init>(Ljava/lang/String;F)V

    sput-object v0, Lcom/kwad/components/ad/reward/a/a;->qF:Lcom/kwad/sdk/core/config/item/g;

    .line 17
    new-instance v0, Lcom/kwad/sdk/core/config/item/d;

    const-string v3, "autoJumpInRewardedVideo"

    invoke-direct {v0, v3, v1}, Lcom/kwad/sdk/core/config/item/d;-><init>(Ljava/lang/String;Z)V

    sput-object v0, Lcom/kwad/components/ad/reward/a/a;->qG:Lcom/kwad/sdk/core/config/item/d;

    .line 18
    new-instance v0, Lcom/kwad/sdk/core/config/item/k;

    const-string v3, "advanceJumpDirectDeliveryMaxCount"

    invoke-direct {v0, v3, v2}, Lcom/kwad/sdk/core/config/item/k;-><init>(Ljava/lang/String;Ljava/lang/Integer;)V

    sput-object v0, Lcom/kwad/components/ad/reward/a/a;->qH:Lcom/kwad/sdk/core/config/item/k;

    .line 19
    new-instance v0, Lcom/kwad/sdk/core/config/item/d;

    const-string v3, "advanceJumpDirectDeliverySwitch"

    invoke-direct {v0, v3, v1}, Lcom/kwad/sdk/core/config/item/d;-><init>(Ljava/lang/String;Z)V

    sput-object v0, Lcom/kwad/components/ad/reward/a/a;->qI:Lcom/kwad/sdk/core/config/item/d;

    .line 20
    new-instance v0, Lcom/kwad/sdk/core/config/item/k;

    const-string v3, "shortVideoFollowRewardPlayStyle"

    invoke-direct {v0, v3, v2}, Lcom/kwad/sdk/core/config/item/k;-><init>(Ljava/lang/String;Ljava/lang/Integer;)V

    sput-object v0, Lcom/kwad/components/ad/reward/a/a;->qJ:Lcom/kwad/sdk/core/config/item/k;

    .line 21
    new-instance v0, Lcom/kwad/sdk/core/config/item/d;

    const-string v2, "enableRewardLayoutOptimise"

    invoke-direct {v0, v2, v1}, Lcom/kwad/sdk/core/config/item/d;-><init>(Ljava/lang/String;Z)V

    sput-object v0, Lcom/kwad/components/ad/reward/a/a;->qK:Lcom/kwad/sdk/core/config/item/d;

    .line 22
    new-instance v0, Lcom/kwad/sdk/core/config/item/d;

    const-string v2, "enableFullscreenLayoutOptimise"

    invoke-direct {v0, v2, v1}, Lcom/kwad/sdk/core/config/item/d;-><init>(Ljava/lang/String;Z)V

    sput-object v0, Lcom/kwad/components/ad/reward/a/a;->qL:Lcom/kwad/sdk/core/config/item/d;

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
