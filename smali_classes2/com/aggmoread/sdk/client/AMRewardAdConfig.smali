.class public Lcom/aggmoread/sdk/client/AMRewardAdConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aggmoread/sdk/client/AMRewardAdConfig$RewardListener;
    }
.end annotation


# instance fields
.field private customData:Ljava/lang/String;

.field private rewardAdListener:Lcom/aggmoread/sdk/client/AMRewardAdConfig$RewardListener;

.field private rewardAmount:I

.field private rewardName:Ljava/lang/String;

.field private userID:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCustomData()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/client/AMRewardAdConfig;->customData:Ljava/lang/String;

    return-object v0
.end method

.method public getRewardAdListener()Lcom/aggmoread/sdk/client/AMRewardAdConfig$RewardListener;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/client/AMRewardAdConfig;->rewardAdListener:Lcom/aggmoread/sdk/client/AMRewardAdConfig$RewardListener;

    return-object v0
.end method

.method public getRewardAmount()I
    .locals 1

    iget v0, p0, Lcom/aggmoread/sdk/client/AMRewardAdConfig;->rewardAmount:I

    return v0
.end method

.method public getRewardName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/client/AMRewardAdConfig;->rewardName:Ljava/lang/String;

    return-object v0
.end method

.method public getUserID()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/client/AMRewardAdConfig;->userID:Ljava/lang/String;

    return-object v0
.end method

.method public setCustomData(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/client/AMRewardAdConfig;->customData:Ljava/lang/String;

    return-void
.end method

.method public setRewardAdListener(Lcom/aggmoread/sdk/client/AMRewardAdConfig$RewardListener;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/client/AMRewardAdConfig;->rewardAdListener:Lcom/aggmoread/sdk/client/AMRewardAdConfig$RewardListener;

    return-void
.end method

.method public setRewardAmount(I)V
    .locals 0

    iput p1, p0, Lcom/aggmoread/sdk/client/AMRewardAdConfig;->rewardAmount:I

    return-void
.end method

.method public setRewardName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/client/AMRewardAdConfig;->rewardName:Ljava/lang/String;

    return-void
.end method

.method public setUserID(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/client/AMRewardAdConfig;->userID:Ljava/lang/String;

    return-void
.end method
