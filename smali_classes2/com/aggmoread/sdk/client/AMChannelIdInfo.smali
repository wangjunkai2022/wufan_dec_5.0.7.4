.class public Lcom/aggmoread/sdk/client/AMChannelIdInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public adType:Lcom/aggmoread/sdk/client/AMAdType;

.field public amAdLoadSlot:Lcom/aggmoread/sdk/client/AMAdLoadSlot;

.field public channelId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/aggmoread/sdk/client/AMAdType;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/aggmoread/sdk/client/AMChannelIdInfo;->channelId:Ljava/lang/String;

    iput-object p2, p0, Lcom/aggmoread/sdk/client/AMChannelIdInfo;->adType:Lcom/aggmoread/sdk/client/AMAdType;

    return-void
.end method


# virtual methods
.method public setAmAdLoadSlot(Lcom/aggmoread/sdk/client/AMAdLoadSlot;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/client/AMChannelIdInfo;->amAdLoadSlot:Lcom/aggmoread/sdk/client/AMAdLoadSlot;

    return-void
.end method
