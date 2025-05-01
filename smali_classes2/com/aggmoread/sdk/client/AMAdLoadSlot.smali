.class public final Lcom/aggmoread/sdk/client/AMAdLoadSlot;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;
    }
.end annotation


# instance fields
.field public adContainer:Landroid/view/ViewGroup;

.field public adCount:I

.field public adSize:Lcom/aggmoread/sdk/client/AMAdSize;

.field public adSlotId:Ljava/lang/String;

.field public bidToken:Ljava/lang/String;

.field public fetchTimeOut:I

.field public limitTime:I

.field public refreshTime:I

.field public rewardAdConfig:Lcom/aggmoread/sdk/client/AMRewardAdConfig;

.field public videoConfigs:Lcom/aggmoread/sdk/client/AMVideoConfigs;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/aggmoread/sdk/client/AMAdLoadSlot$1;)V
    .locals 0

    invoke-direct {p0}, Lcom/aggmoread/sdk/client/AMAdLoadSlot;-><init>()V

    return-void
.end method
