.class public Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolRollViewBean;
.super Ljava/lang/Object;
.source "AdSpacesBean.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CoolRollViewBean"
.end annotation


# instance fields
.field private coolTime:J
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "coolTime"
    .end annotation
.end field

.field private rollMinusAmplitude:D
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "rollMinusAmplitude"
    .end annotation
.end field

.field private rollPlusAmplitude:D
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "rollPlusAmplitude"
    .end annotation
.end field

.field private rollTime:J
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "rollTime"
    .end annotation
.end field

.field private userProtectTime:J
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "userProtectTime"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCoolTime()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolRollViewBean;->coolTime:J

    return-wide v0
.end method

.method public getRollMinusAmplitude()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolRollViewBean;->rollMinusAmplitude:D

    return-wide v0
.end method

.method public getRollPlusAmplitude()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolRollViewBean;->rollPlusAmplitude:D

    return-wide v0
.end method

.method public getRollTime()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolRollViewBean;->rollTime:J

    return-wide v0
.end method

.method public getUserProtectTime()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolRollViewBean;->userProtectTime:J

    return-wide v0
.end method

.method public setCoolTime(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolRollViewBean;->coolTime:J

    return-void
.end method

.method public setRollMinusAmplitude(D)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolRollViewBean;->rollMinusAmplitude:D

    return-void
.end method

.method public setRollPlusAmplitude(D)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolRollViewBean;->rollPlusAmplitude:D

    return-void
.end method

.method public setRollTime(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolRollViewBean;->rollTime:J

    return-void
.end method

.method public setUserProtectTime(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolRollViewBean;->userProtectTime:J

    return-void
.end method
