.class public Lcom/beizi/fusion/model/AdSpacesBean$UniteControlBean;
.super Ljava/lang/Object;
.source "AdSpacesBean.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/fusion/model/AdSpacesBean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "UniteControlBean"
.end annotation


# instance fields
.field private duration:J
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "duration"
    .end annotation
.end field

.field private random:I
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "random"
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
.method public getDuration()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$UniteControlBean;->duration:J

    return-wide v0
.end method

.method public getRandom()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/fusion/model/AdSpacesBean$UniteControlBean;->random:I

    return v0
.end method

.method public setDuration(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$UniteControlBean;->duration:J

    return-void
.end method

.method public setRandom(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/model/AdSpacesBean$UniteControlBean;->random:I

    return-void
.end method
