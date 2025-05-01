.class public Lcom/kwad/sdk/core/report/h;
.super Lcom/kwad/sdk/core/response/a/a;
.source "SourceFile"


# annotations
.annotation build Lcom/ksad/json/annotation/KsJson;
.end annotation


# instance fields
.field public ayS:I

.field public creativeId:J

.field public llsid:J

.field public score:I

.field public source:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/response/a/a;-><init>()V

    const-string v0, "union"

    .line 2
    iput-object v0, p0, Lcom/kwad/sdk/core/report/h;->source:Ljava/lang/String;

    return-void
.end method

.method public static bY(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/report/h;
    .locals 3

    .line 1
    new-instance v0, Lcom/kwad/sdk/core/report/h;

    invoke-direct {v0}, Lcom/kwad/sdk/core/report/h;-><init>()V

    .line 2
    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/e;->ec(Lcom/kwad/sdk/core/response/model/AdTemplate;)J

    move-result-wide v1

    iput-wide v1, v0, Lcom/kwad/sdk/core/report/h;->creativeId:J

    .line 3
    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/e;->dP(Lcom/kwad/sdk/core/response/model/AdTemplate;)J

    move-result-wide v1

    iput-wide v1, v0, Lcom/kwad/sdk/core/report/h;->llsid:J

    .line 4
    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/e;->eg(Lcom/kwad/sdk/core/response/model/AdTemplate;)I

    move-result p0

    iput p0, v0, Lcom/kwad/sdk/core/report/h;->score:I

    if-lez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    .line 5
    :goto_0
    iput p0, v0, Lcom/kwad/sdk/core/report/h;->ayS:I

    return-object v0
.end method


# virtual methods
.method public final Fv()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/core/response/a/a;->toJson()Lorg/json/JSONObject;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
