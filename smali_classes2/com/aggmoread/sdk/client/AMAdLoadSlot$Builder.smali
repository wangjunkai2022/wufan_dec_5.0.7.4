.class public Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/client/AMAdLoadSlot;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private adContainer:Landroid/view/ViewGroup;

.field private adCount:I

.field private adSize:Lcom/aggmoread/sdk/client/AMAdSize;

.field private adSlotId:Ljava/lang/String;

.field private bidToken:Ljava/lang/String;

.field private fetchTimeOut:I

.field private limitTime:I

.field private refreshTime:I

.field public rewardAdConfig:Lcom/aggmoread/sdk/client/AMRewardAdConfig;

.field private videoConfigs:Lcom/aggmoread/sdk/client/AMVideoConfigs;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;->fetchTimeOut:I

    iput v0, p0, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;->refreshTime:I

    iput v0, p0, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;->limitTime:I

    return-void
.end method


# virtual methods
.method public build()Lcom/aggmoread/sdk/client/AMAdLoadSlot;
    .locals 2

    new-instance v0, Lcom/aggmoread/sdk/client/AMAdLoadSlot;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/aggmoread/sdk/client/AMAdLoadSlot;-><init>(Lcom/aggmoread/sdk/client/AMAdLoadSlot$1;)V

    iget-object v1, p0, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;->adSize:Lcom/aggmoread/sdk/client/AMAdSize;

    iput-object v1, v0, Lcom/aggmoread/sdk/client/AMAdLoadSlot;->adSize:Lcom/aggmoread/sdk/client/AMAdSize;

    iget-object v1, p0, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;->adSlotId:Ljava/lang/String;

    iput-object v1, v0, Lcom/aggmoread/sdk/client/AMAdLoadSlot;->adSlotId:Ljava/lang/String;

    iget-object v1, p0, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;->videoConfigs:Lcom/aggmoread/sdk/client/AMVideoConfigs;

    iput-object v1, v0, Lcom/aggmoread/sdk/client/AMAdLoadSlot;->videoConfigs:Lcom/aggmoread/sdk/client/AMVideoConfigs;

    iget v1, p0, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;->adCount:I

    iput v1, v0, Lcom/aggmoread/sdk/client/AMAdLoadSlot;->adCount:I

    iget-object v1, p0, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;->adContainer:Landroid/view/ViewGroup;

    iput-object v1, v0, Lcom/aggmoread/sdk/client/AMAdLoadSlot;->adContainer:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;->bidToken:Ljava/lang/String;

    iput-object v1, v0, Lcom/aggmoread/sdk/client/AMAdLoadSlot;->bidToken:Ljava/lang/String;

    iget-object v1, p0, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;->rewardAdConfig:Lcom/aggmoread/sdk/client/AMRewardAdConfig;

    iput-object v1, v0, Lcom/aggmoread/sdk/client/AMAdLoadSlot;->rewardAdConfig:Lcom/aggmoread/sdk/client/AMRewardAdConfig;

    iget v1, p0, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;->fetchTimeOut:I

    iput v1, v0, Lcom/aggmoread/sdk/client/AMAdLoadSlot;->fetchTimeOut:I

    iget v1, p0, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;->refreshTime:I

    iput v1, v0, Lcom/aggmoread/sdk/client/AMAdLoadSlot;->refreshTime:I

    iget v1, p0, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;->limitTime:I

    iput v1, v0, Lcom/aggmoread/sdk/client/AMAdLoadSlot;->limitTime:I

    return-object v0
.end method

.method public setAMAdSize(Lcom/aggmoread/sdk/client/AMAdSize;)Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;->adSize:Lcom/aggmoread/sdk/client/AMAdSize;

    return-object p0
.end method

.method public setAdContainer(Landroid/view/ViewGroup;)Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;->adContainer:Landroid/view/ViewGroup;

    return-object p0
.end method

.method public setAdCount(I)Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;
    .locals 0

    iput p1, p0, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;->adCount:I

    return-object p0
.end method

.method public setFetchTimeOut(I)Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;
    .locals 0

    iput p1, p0, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;->fetchTimeOut:I

    return-object p0
.end method

.method public setLimitTime(I)Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;
    .locals 0

    iput p1, p0, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;->limitTime:I

    return-object p0
.end method

.method public setRefreshTime(I)Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;
    .locals 0

    iput p1, p0, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;->refreshTime:I

    return-object p0
.end method

.method public setRewardConfig(Lcom/aggmoread/sdk/client/AMRewardAdConfig;)Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;->rewardAdConfig:Lcom/aggmoread/sdk/client/AMRewardAdConfig;

    return-object p0
.end method

.method public setSSBidToken(Ljava/lang/String;)Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;->bidToken:Ljava/lang/String;

    return-object p0
.end method

.method public setSlotId(Ljava/lang/String;)Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;->adSlotId:Ljava/lang/String;

    return-object p0
.end method

.method public setVideoConfig(Lcom/aggmoread/sdk/client/AMVideoConfigs;)Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;->videoConfigs:Lcom/aggmoread/sdk/client/AMVideoConfigs;

    return-object p0
.end method
