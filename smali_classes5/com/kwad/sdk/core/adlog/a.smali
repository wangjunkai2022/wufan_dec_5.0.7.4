.class public final Lcom/kwad/sdk/core/adlog/a;
.super Lcom/kwad/sdk/core/network/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/sdk/core/adlog/a$a;
    }
.end annotation


# instance fields
.field aqf:I

.field private final aqg:Lcom/kwad/sdk/core/adlog/c/a;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;


# direct methods
.method public constructor <init>(Lcom/kwad/sdk/core/adlog/c/a;)V
    .locals 1
    .param p1    # Lcom/kwad/sdk/core/adlog/c/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/network/b;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kwad/sdk/core/adlog/a;->aqg:Lcom/kwad/sdk/core/adlog/c/a;

    .line 3
    iget-object v0, p1, Lcom/kwad/sdk/core/adlog/c/a;->adTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iput-object v0, p0, Lcom/kwad/sdk/core/adlog/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 4
    iget p1, p1, Lcom/kwad/sdk/core/adlog/c/a;->apT:I

    iput p1, p0, Lcom/kwad/sdk/core/adlog/a;->aqf:I

    return-void
.end method

.method private BM()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/a;->aqg:Lcom/kwad/sdk/core/adlog/c/a;

    iget-object v0, v0, Lcom/kwad/sdk/core/adlog/c/a;->aqN:Lorg/json/JSONObject;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 3
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-string v3, "clientTimestamp"

    invoke-static {v0, v3, v1, v2}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 4
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "extData"

    invoke-virtual {p0, v1, v0}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;Lcom/kwad/sdk/core/adlog/c/a;)V
    .locals 2
    .param p2    # Lcom/kwad/sdk/core/adlog/c/a;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p2, :cond_a

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->arp:I

    if-ltz p1, :cond_1

    const-string v0, "adOrder"

    .line 3
    invoke-virtual {p0, v0, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 4
    :cond_1
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->Lg:I

    if-ltz p1, :cond_2

    const-string v0, "adInterstitialSource"

    .line 5
    invoke-virtual {p0, v0, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 6
    :cond_2
    iget-object p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->aqS:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_3

    .line 7
    iget-object p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->aqS:Ljava/lang/String;

    const-string v0, "adRenderArea"

    invoke-virtual {p0, v0, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    :cond_3
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->adxResult:I

    const-string v0, "adxResult"

    invoke-virtual {p0, v0, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 9
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->art:I

    if-eqz p1, :cond_4

    const-string v0, "fingerSwipeType"

    .line 10
    invoke-virtual {p0, v0, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 11
    :cond_4
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->aru:I

    if-eqz p1, :cond_5

    const-string v0, "fingerSwipeDistance"

    .line 12
    invoke-virtual {p0, v0, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 13
    :cond_5
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->arm:I

    const/4 v0, -0x1

    if-eq p1, v0, :cond_6

    const-string v1, "installStatus"

    .line 14
    invoke-virtual {p0, v1, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 15
    :cond_6
    iget-object p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->Li:Lcom/kwad/sdk/core/adlog/a$a;

    if-eqz p1, :cond_7

    .line 16
    invoke-virtual {p1}, Lcom/kwad/sdk/core/response/a/a;->toJson()Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "clientExtData"

    invoke-virtual {p0, v1, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    :cond_7
    iget-object p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->arw:Ljava/lang/String;

    if-eqz p1, :cond_8

    const-string v1, "clientPkFailAdInfo"

    .line 18
    invoke-virtual {p0, v1, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    :cond_8
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->Lk:I

    if-eq p1, v0, :cond_9

    const-string v0, "triggerType"

    .line 20
    invoke-virtual {p0, v0, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 21
    :cond_9
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->Lj:I

    if-eqz p1, :cond_a

    const-string p2, "photoSizeStyle"

    .line 22
    invoke-virtual {p0, p2, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    :cond_a
    :goto_0
    return-void
.end method

.method private a(Ljava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/core/adlog/c/a;)V
    .locals 4
    .param p3    # Lcom/kwad/sdk/core/adlog/c/a;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 23
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_5

    if-nez p2, :cond_0

    goto :goto_1

    .line 24
    :cond_0
    iget p1, p2, Lcom/kwad/sdk/core/response/model/AdTemplate;->mInitVoiceStatus:I

    if-eqz p1, :cond_1

    const-string p2, "initVoiceStatus"

    .line 25
    invoke-virtual {p0, p2, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 26
    :cond_1
    iget-object p1, p0, Lcom/kwad/sdk/core/adlog/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-wide p1, p1, Lcom/kwad/sdk/core/response/model/AdTemplate;->mBidEcpm:J

    const-wide/16 v0, 0x0

    const-string v2, "ecpmType"

    cmp-long v3, p1, v0

    if-nez v3, :cond_2

    const/4 p1, 0x2

    .line 27
    invoke-virtual {p0, v2, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    goto :goto_0

    :cond_2
    const/4 p1, 0x1

    .line 28
    invoke-virtual {p0, v2, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    :goto_0
    if-nez p3, :cond_3

    return-void

    .line 29
    :cond_3
    iget p1, p3, Lcom/kwad/sdk/core/adlog/c/a;->are:I

    if-eqz p1, :cond_4

    const-string p2, "adAggPageSource"

    .line 30
    invoke-virtual {p0, p2, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 31
    :cond_4
    iget-object p1, p3, Lcom/kwad/sdk/core/adlog/c/a;->Lh:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_5

    .line 32
    iget-object p1, p3, Lcom/kwad/sdk/core/adlog/c/a;->Lh:Ljava/lang/String;

    const-string p2, "payload"

    invoke-virtual {p0, p2, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    :goto_1
    return-void
.end method

.method private b(Ljava/lang/String;Lcom/kwad/sdk/core/adlog/c/a;)V
    .locals 5
    .param p2    # Lcom/kwad/sdk/core/adlog/c/a;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p2, :cond_11

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto/16 :goto_0

    .line 2
    :cond_0
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->kl:I

    if-eqz p1, :cond_1

    const-string v0, "itemClickType"

    .line 3
    invoke-virtual {p0, v0, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 4
    :cond_1
    iget-object p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->Lh:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 5
    iget-object p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->Lh:Ljava/lang/String;

    const-string v0, "payload"

    invoke-virtual {p0, v0, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    :cond_2
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->are:I

    if-eqz p1, :cond_3

    const-string v0, "adAggPageSource"

    .line 7
    invoke-virtual {p0, v0, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 8
    :cond_3
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->arp:I

    if-ltz p1, :cond_4

    const-string v0, "adOrder"

    .line 9
    invoke-virtual {p0, v0, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 10
    :cond_4
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->Lg:I

    if-ltz p1, :cond_5

    const-string v0, "adInterstitialSource"

    .line 11
    invoke-virtual {p0, v0, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 12
    :cond_5
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->Lk:I

    const/4 v0, -0x1

    if-eq p1, v0, :cond_6

    const-string v1, "triggerType"

    .line 13
    invoke-virtual {p0, v1, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 14
    :cond_6
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->arv:I

    if-eqz p1, :cond_7

    const-string v1, "cardCloseType"

    .line 15
    invoke-virtual {p0, v1, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 16
    :cond_7
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->adxResult:I

    const-string v1, "adxResult"

    invoke-virtual {p0, v1, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 17
    iget-wide v1, p2, Lcom/kwad/sdk/core/adlog/c/a;->ko:D

    const-wide/16 v3, 0x0

    cmpl-double p1, v1, v3

    if-lez p1, :cond_8

    const-string p1, "splashShakeAcceleration"

    .line 18
    invoke-virtual {p0, p1, v1, v2}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;D)V

    .line 19
    :cond_8
    iget-object p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->arq:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_9

    .line 20
    iget-object p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->arq:Ljava/lang/String;

    const-string v1, "splashInteractionRotateAngle"

    invoke-virtual {p0, v1, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    :cond_9
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->art:I

    if-eqz p1, :cond_a

    const-string v1, "fingerSwipeType"

    .line 22
    invoke-virtual {p0, v1, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 23
    :cond_a
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->aru:I

    if-eqz p1, :cond_b

    const-string v1, "fingerSwipeDistance"

    .line 24
    invoke-virtual {p0, v1, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 25
    :cond_b
    iget-wide v1, p2, Lcom/kwad/sdk/core/adlog/c/a;->vA:J

    const-wide/16 v3, 0x0

    cmp-long p1, v1, v3

    if-lez p1, :cond_c

    const-string p1, "playedDuration"

    .line 26
    invoke-virtual {p0, p1, v1, v2}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;J)V

    .line 27
    :cond_c
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->aro:I

    if-lez p1, :cond_d

    const-string v1, "playedRate"

    .line 28
    invoke-virtual {p0, v1, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 29
    :cond_d
    iget-object p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->arw:Ljava/lang/String;

    if-eqz p1, :cond_e

    const-string v1, "clientPkFailAdInfo"

    .line 30
    invoke-virtual {p0, v1, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    :cond_e
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->aqW:I

    if-eq p1, v0, :cond_f

    const-string v0, "retainCodeType"

    .line 32
    invoke-virtual {p0, v0, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 33
    :cond_f
    iget-object p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->Li:Lcom/kwad/sdk/core/adlog/a$a;

    if-eqz p1, :cond_10

    .line 34
    invoke-virtual {p1}, Lcom/kwad/sdk/core/response/a/a;->toJson()Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "clientExtData"

    invoke-virtual {p0, v0, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    :cond_10
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->Lj:I

    if-eqz p1, :cond_11

    const-string p2, "photoSizeStyle"

    .line 36
    invoke-virtual {p0, p2, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    :cond_11
    :goto_0
    return-void
.end method

.method private c(Ljava/lang/String;Lcom/kwad/sdk/core/adlog/c/a;)V
    .locals 8
    .param p2    # Lcom/kwad/sdk/core/adlog/c/a;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p2, :cond_26

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto/16 :goto_0

    .line 2
    :cond_0
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->aqQ:I

    if-eqz p1, :cond_1

    const-string v0, "itemCloseType"

    .line 3
    invoke-virtual {p0, v0, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 4
    :cond_1
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->aqO:I

    if-lez p1, :cond_2

    const-string v0, "photoPlaySecond"

    .line 5
    invoke-virtual {p0, v0, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 6
    :cond_2
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->aqP:I

    if-eqz p1, :cond_3

    const-string v0, "awardReceiveStage"

    .line 7
    invoke-virtual {p0, v0, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 8
    :cond_3
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->aqR:I

    if-eqz p1, :cond_4

    const-string v0, "elementType"

    .line 9
    invoke-virtual {p0, v0, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 10
    :cond_4
    iget-object p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->Lh:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_5

    .line 11
    iget-object p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->Lh:Ljava/lang/String;

    const-string v0, "payload"

    invoke-virtual {p0, v0, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    :cond_5
    iget-object p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->Li:Lcom/kwad/sdk/core/adlog/a$a;

    if-eqz p1, :cond_6

    .line 13
    invoke-virtual {p1}, Lcom/kwad/sdk/core/response/a/a;->toJson()Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "clientExtData"

    invoke-virtual {p0, v0, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    :cond_6
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->aqX:I

    if-lez p1, :cond_7

    const-string v0, "deeplinkType"

    .line 15
    invoke-virtual {p0, v0, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 16
    :cond_7
    iget-object p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->aqY:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_8

    .line 17
    iget-object p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->aqY:Ljava/lang/String;

    const-string v0, "deeplinkAppName"

    invoke-virtual {p0, v0, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    :cond_8
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->aqZ:I

    if-eqz p1, :cond_9

    const-string v0, "deeplinkFailedReason"

    .line 19
    invoke-virtual {p0, v0, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 20
    :cond_9
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->downloadSource:I

    if-lez p1, :cond_a

    const-string v0, "downloadSource"

    .line 21
    invoke-virtual {p0, v0, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 22
    :cond_a
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->arv:I

    if-eqz p1, :cond_b

    const-string v0, "cardCloseType"

    .line 23
    invoke-virtual {p0, v0, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 24
    :cond_b
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->ara:I

    if-lez p1, :cond_c

    const-string v0, "isPackageChanged"

    .line 25
    invoke-virtual {p0, v0, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 26
    :cond_c
    iget-object p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->arb:Ljava/lang/String;

    const-string v0, "installedFrom"

    invoke-virtual {p0, v0, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->ard:I

    const-string v0, "isChangedEndcard"

    invoke-virtual {p0, v0, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 28
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->are:I

    if-eqz p1, :cond_d

    const-string v0, "adAggPageSource"

    .line 29
    invoke-virtual {p0, v0, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 30
    :cond_d
    iget-object p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->arc:Ljava/lang/String;

    if-eqz p1, :cond_e

    const-string v0, "downloadFailedReason"

    .line 31
    invoke-virtual {p0, v0, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    :cond_e
    iget-object p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->arg:Ljava/lang/String;

    invoke-static {p1}, Lcom/kwad/sdk/utils/bh;->isNullString(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_f

    .line 33
    iget-object p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->arg:Ljava/lang/String;

    const-string v0, "installedPackageName"

    invoke-virtual {p0, v0, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    :cond_f
    iget-object p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->arf:Ljava/lang/String;

    invoke-static {p1}, Lcom/kwad/sdk/utils/bh;->isNullString(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_10

    .line 35
    iget-object p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->arf:Ljava/lang/String;

    const-string v0, "serverPackageName"

    invoke-virtual {p0, v0, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    :cond_10
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->ari:I

    if-lez p1, :cond_11

    const-string v0, "closeButtonClickTime"

    .line 37
    invoke-virtual {p0, v0, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 38
    :cond_11
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->arh:I

    if-lez p1, :cond_12

    const-string v0, "closeButtonImpressionTime"

    .line 39
    invoke-virtual {p0, v0, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 40
    :cond_12
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->downloadStatus:I

    if-ltz p1, :cond_13

    const-string v0, "downloadStatus"

    .line 41
    invoke-virtual {p0, v0, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 42
    :cond_13
    iget-wide v0, p2, Lcom/kwad/sdk/core/adlog/c/a;->arj:J

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-lez p1, :cond_14

    const-string p1, "landingPageLoadedDuration"

    .line 43
    invoke-virtual {p0, p1, v0, v1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;J)V

    .line 44
    :cond_14
    iget-wide v0, p2, Lcom/kwad/sdk/core/adlog/c/a;->LJ:J

    cmp-long p1, v0, v2

    if-lez p1, :cond_15

    const-string p1, "leaveTime"

    .line 45
    invoke-virtual {p0, p1, v0, v1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;J)V

    .line 46
    :cond_15
    iget-wide v0, p2, Lcom/kwad/sdk/core/adlog/c/a;->ark:J

    cmp-long p1, v0, v2

    if-lez p1, :cond_16

    const-string p1, "adItemClickBackDuration"

    .line 47
    invoke-virtual {p0, p1, v0, v1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;J)V

    .line 48
    :cond_16
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->aqW:I

    const/4 v0, -0x1

    if-eq p1, v0, :cond_17

    const-string v1, "retainCodeType"

    .line 49
    invoke-virtual {p0, v1, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 50
    :cond_17
    iget-wide v4, p2, Lcom/kwad/sdk/core/adlog/c/a;->aqT:J

    const-wide/16 v6, -0x1

    cmp-long p1, v4, v6

    if-lez p1, :cond_18

    const-string p1, "highestLossPrice"

    .line 51
    invoke-virtual {p0, p1, v4, v5}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;J)V

    .line 52
    :cond_18
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->aqU:I

    if-ltz p1, :cond_19

    const-string v1, "impFailReason"

    .line 53
    invoke-virtual {p0, v1, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 54
    :cond_19
    iget-wide v4, p2, Lcom/kwad/sdk/core/adlog/c/a;->aqV:J

    cmp-long p1, v4, v6

    if-lez p1, :cond_1a

    const-string p1, "winEcpm"

    .line 55
    invoke-virtual {p0, p1, v4, v5}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;J)V

    .line 56
    :cond_1a
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->adnType:I

    if-lez p1, :cond_1b

    const-string v1, "adnType"

    .line 57
    invoke-virtual {p0, v1, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 58
    :cond_1b
    iget-object p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->adnName:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1c

    .line 59
    iget-object p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->adnName:Ljava/lang/String;

    const-string v1, "adnName"

    invoke-virtual {p0, v1, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    :cond_1c
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->arn:I

    const-string v1, "downloadCardType"

    invoke-virtual {p0, v1, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 61
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->OP:I

    const-string v1, "landingPageType"

    invoke-virtual {p0, v1, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 62
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->Lg:I

    if-ltz p1, :cond_1d

    const-string v1, "adInterstitialSource"

    .line 63
    invoke-virtual {p0, v1, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 64
    :cond_1d
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->arr:I

    if-lez p1, :cond_1e

    const-string v1, "downloadInstallType"

    .line 65
    invoke-virtual {p0, v1, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 66
    :cond_1e
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->art:I

    if-eqz p1, :cond_1f

    const-string v1, "fingerSwipeType"

    .line 67
    invoke-virtual {p0, v1, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 68
    :cond_1f
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->aru:I

    if-eqz p1, :cond_20

    const-string v1, "fingerSwipeDistance"

    .line 69
    invoke-virtual {p0, v1, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 70
    :cond_20
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->ars:I

    if-lez p1, :cond_21

    const-string v1, "businessSceneType"

    .line 71
    invoke-virtual {p0, v1, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 72
    :cond_21
    iget-wide v4, p2, Lcom/kwad/sdk/core/adlog/c/a;->vA:J

    cmp-long p1, v4, v2

    if-lez p1, :cond_22

    const-string p1, "playedDuration"

    .line 73
    invoke-virtual {p0, p1, v4, v5}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;J)V

    .line 74
    :cond_22
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->aro:I

    if-lez p1, :cond_23

    const-string v1, "playedRate"

    .line 75
    invoke-virtual {p0, v1, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 76
    :cond_23
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->arl:I

    if-eq p1, v0, :cond_24

    const-string v1, "appStorePageType"

    .line 77
    invoke-virtual {p0, v1, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 78
    :cond_24
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->Lk:I

    if-eq p1, v0, :cond_25

    const-string v0, "triggerType"

    .line 79
    invoke-virtual {p0, v0, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    .line 80
    :cond_25
    iget p1, p2, Lcom/kwad/sdk/core/adlog/c/a;->Lj:I

    if-eqz p1, :cond_26

    const-string p2, "photoSizeStyle"

    .line 81
    invoke-virtual {p0, p2, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    :cond_26
    :goto_0
    return-void
.end method


# virtual methods
.method public final buildBaseBody()V
    .locals 0

    return-void
.end method

.method public final buildBaseHeader()V
    .locals 0

    return-void
.end method

.method public final getBody()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/network/b;->mBodyParams:Lorg/json/JSONObject;

    return-object v0
.end method

.method public final getUrl()Ljava/lang/String;
    .locals 9

    .line 1
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/kwad/sdk/core/adlog/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v1

    .line 3
    iget v2, p0, Lcom/kwad/sdk/core/adlog/a;->aqf:I

    const-string v3, "__BEHAVIOR__"

    const-string v4, "__TYPE__"

    const-string v5, "__PR__"

    const/4 v6, 0x1

    if-ne v2, v6, :cond_1

    .line 4
    iget-object v0, v1, Lcom/kwad/sdk/core/response/model/AdInfo;->adBaseInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdBaseInfo;

    iget-object v0, v0, Lcom/kwad/sdk/core/response/model/AdInfo$AdBaseInfo;->showUrl:Ljava/lang/String;

    .line 5
    iget-object v1, p0, Lcom/kwad/sdk/core/adlog/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-wide v1, v1, Lcom/kwad/sdk/core/response/model/AdTemplate;->mBidEcpm:J

    const-wide/16 v6, 0x0

    cmp-long v8, v1, v6

    if-nez v8, :cond_0

    const-class v1, Lcom/kwad/sdk/service/a/h;

    .line 6
    invoke-static {v1}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/sdk/service/a/h;

    invoke-interface {v1}, Lcom/kwad/sdk/service/a/h;->zo()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 7
    iget-object v1, p0, Lcom/kwad/sdk/core/adlog/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 8
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->aQ(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    .line 9
    invoke-virtual {v0, v5, v1}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 10
    :cond_0
    iget-object v1, p0, Lcom/kwad/sdk/core/adlog/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-wide v1, v1, Lcom/kwad/sdk/core/response/model/AdTemplate;->mBidEcpm:J

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v5, v1}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 11
    :goto_0
    iget-object v1, p0, Lcom/kwad/sdk/core/adlog/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v1, v1, Lcom/kwad/sdk/core/response/model/AdTemplate;->mVideoPlayerStatus:Lcom/kwad/sdk/core/response/model/VideoPlayerStatus;

    iget v1, v1, Lcom/kwad/sdk/core/response/model/VideoPlayerStatus;->mVideoPlayerType:I

    .line 12
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    .line 13
    invoke-virtual {v0, v4, v1}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 14
    iget-object v1, p0, Lcom/kwad/sdk/core/adlog/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v1, v1, Lcom/kwad/sdk/core/response/model/AdTemplate;->mVideoPlayerStatus:Lcom/kwad/sdk/core/response/model/VideoPlayerStatus;

    iget v1, v1, Lcom/kwad/sdk/core/response/model/VideoPlayerStatus;->mVideoPlayerBehavior:I

    .line 15
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    .line 16
    invoke-virtual {v0, v3, v1}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 17
    iget-object v1, p0, Lcom/kwad/sdk/core/adlog/a;->aqg:Lcom/kwad/sdk/core/adlog/c/a;

    invoke-direct {p0, v0, v1}, Lcom/kwad/sdk/core/adlog/a;->a(Ljava/lang/String;Lcom/kwad/sdk/core/adlog/c/a;)V

    .line 18
    iget-object v1, p0, Lcom/kwad/sdk/core/adlog/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v2, p0, Lcom/kwad/sdk/core/adlog/a;->aqg:Lcom/kwad/sdk/core/adlog/c/a;

    invoke-direct {p0, v0, v1, v2}, Lcom/kwad/sdk/core/adlog/a;->a(Ljava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/core/adlog/c/a;)V

    goto/16 :goto_1

    :cond_1
    const/4 v6, 0x2

    if-ne v2, v6, :cond_2

    .line 19
    iget-object v1, v1, Lcom/kwad/sdk/core/response/model/AdInfo;->adBaseInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdBaseInfo;

    iget-object v1, v1, Lcom/kwad/sdk/core/response/model/AdInfo$AdBaseInfo;->clickUrl:Ljava/lang/String;

    .line 20
    iget-object v2, p0, Lcom/kwad/sdk/core/adlog/a;->aqg:Lcom/kwad/sdk/core/adlog/c/a;

    iget-object v2, v2, Lcom/kwad/sdk/core/adlog/c/a;->kn:Lcom/kwad/sdk/utils/ac$a;

    invoke-static {v1, v2}, Lcom/kwad/sdk/utils/ac;->a(Ljava/lang/String;Lcom/kwad/sdk/utils/ac$a;)Ljava/lang/String;

    move-result-object v1

    .line 21
    invoke-static {v0, v1}, Lcom/kwad/sdk/utils/ac;->am(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 22
    iget-object v1, p0, Lcom/kwad/sdk/core/adlog/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-wide v1, v1, Lcom/kwad/sdk/core/response/model/AdTemplate;->mBidEcpm:J

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v5, v1}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 23
    iget-object v1, p0, Lcom/kwad/sdk/core/adlog/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v1, v1, Lcom/kwad/sdk/core/response/model/AdTemplate;->mVideoPlayerStatus:Lcom/kwad/sdk/core/response/model/VideoPlayerStatus;

    iget v1, v1, Lcom/kwad/sdk/core/response/model/VideoPlayerStatus;->mVideoPlayerType:I

    .line 24
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    .line 25
    invoke-virtual {v0, v4, v1}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 26
    iget-object v1, p0, Lcom/kwad/sdk/core/adlog/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v1, v1, Lcom/kwad/sdk/core/response/model/AdTemplate;->mVideoPlayerStatus:Lcom/kwad/sdk/core/response/model/VideoPlayerStatus;

    iget v1, v1, Lcom/kwad/sdk/core/response/model/VideoPlayerStatus;->mVideoPlayerBehavior:I

    .line 27
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    .line 28
    invoke-virtual {v0, v3, v1}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 29
    iget-object v1, p0, Lcom/kwad/sdk/core/adlog/a;->aqg:Lcom/kwad/sdk/core/adlog/c/a;

    invoke-direct {p0, v0, v1}, Lcom/kwad/sdk/core/adlog/a;->b(Ljava/lang/String;Lcom/kwad/sdk/core/adlog/c/a;)V

    .line 30
    iget-object v1, p0, Lcom/kwad/sdk/core/adlog/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v2, p0, Lcom/kwad/sdk/core/adlog/a;->aqg:Lcom/kwad/sdk/core/adlog/c/a;

    invoke-direct {p0, v0, v1, v2}, Lcom/kwad/sdk/core/adlog/a;->a(Ljava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/core/adlog/c/a;)V

    goto :goto_1

    .line 31
    :cond_2
    iget-object v0, v1, Lcom/kwad/sdk/core/response/model/AdInfo;->adBaseInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdBaseInfo;

    iget-object v0, v0, Lcom/kwad/sdk/core/response/model/AdInfo$AdBaseInfo;->convUrl:Ljava/lang/String;

    .line 32
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "__ACTION__"

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 33
    iget-object v1, p0, Lcom/kwad/sdk/core/adlog/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-wide v1, v1, Lcom/kwad/sdk/core/response/model/AdTemplate;->mBidEcpm:J

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v5, v1}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 34
    iget-object v1, p0, Lcom/kwad/sdk/core/adlog/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v1, v1, Lcom/kwad/sdk/core/response/model/AdTemplate;->mVideoPlayerStatus:Lcom/kwad/sdk/core/response/model/VideoPlayerStatus;

    iget v1, v1, Lcom/kwad/sdk/core/response/model/VideoPlayerStatus;->mVideoPlayerType:I

    .line 35
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    .line 36
    invoke-virtual {v0, v4, v1}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 37
    iget-object v1, p0, Lcom/kwad/sdk/core/adlog/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v1, v1, Lcom/kwad/sdk/core/response/model/AdTemplate;->mVideoPlayerStatus:Lcom/kwad/sdk/core/response/model/VideoPlayerStatus;

    iget v1, v1, Lcom/kwad/sdk/core/response/model/VideoPlayerStatus;->mVideoPlayerBehavior:I

    .line 38
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    .line 39
    invoke-virtual {v0, v3, v1}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 40
    iget-object v1, p0, Lcom/kwad/sdk/core/adlog/a;->aqg:Lcom/kwad/sdk/core/adlog/c/a;

    invoke-direct {p0, v0, v1}, Lcom/kwad/sdk/core/adlog/a;->c(Ljava/lang/String;Lcom/kwad/sdk/core/adlog/c/a;)V

    .line 41
    :goto_1
    invoke-direct {p0}, Lcom/kwad/sdk/core/adlog/a;->BM()V

    return-object v0
.end method
