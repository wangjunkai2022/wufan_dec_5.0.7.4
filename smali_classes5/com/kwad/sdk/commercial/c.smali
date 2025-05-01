.class public final Lcom/kwad/sdk/commercial/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public apd:D

.field public ape:D

.field public apf:D

.field public apg:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

.field public aph:Lcom/kwai/adclient/kscommerciallogger/model/SubBusinessType;

.field public api:Lcom/kwai/adclient/kscommerciallogger/model/d;

.field public category:Ljava/lang/String;

.field public eventId:Ljava/lang/String;

.field public msg:Lorg/json/JSONObject;

.field public primaryKey:Ljava/lang/String;

.field public tag:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide v0, 0x3f847ae147ae147bL    # 0.01

    .line 2
    iput-wide v0, p0, Lcom/kwad/sdk/commercial/c;->apd:D

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 3
    iput-wide v0, p0, Lcom/kwad/sdk/commercial/c;->ape:D

    const-wide v0, 0x3f50624dd2f1a9fcL    # 0.001

    .line 4
    iput-wide v0, p0, Lcom/kwad/sdk/commercial/c;->apf:D

    .line 5
    sget-object v0, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;->OTHER:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    iput-object v0, p0, Lcom/kwad/sdk/commercial/c;->apg:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    .line 6
    sget-object v0, Lcom/kwai/adclient/kscommerciallogger/model/SubBusinessType;->OTHER:Lcom/kwai/adclient/kscommerciallogger/model/SubBusinessType;

    iput-object v0, p0, Lcom/kwad/sdk/commercial/c;->aph:Lcom/kwai/adclient/kscommerciallogger/model/SubBusinessType;

    return-void
.end method

.method public static Br()Lcom/kwad/sdk/commercial/c;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/sdk/commercial/c;

    invoke-direct {v0}, Lcom/kwad/sdk/commercial/c;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final N(Ljava/lang/String;Ljava/lang/String;)Lcom/kwad/sdk/commercial/c;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/commercial/c;->eventId:Ljava/lang/String;

    .line 2
    iput-object p2, p0, Lcom/kwad/sdk/commercial/c;->primaryKey:Ljava/lang/String;

    return-object p0
.end method

.method public final a(Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;)Lcom/kwad/sdk/commercial/c;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/commercial/c;->apg:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    return-object p0
.end method

.method public final a(Lcom/kwai/adclient/kscommerciallogger/model/SubBusinessType;)Lcom/kwad/sdk/commercial/c;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/kwad/sdk/commercial/c;->aph:Lcom/kwai/adclient/kscommerciallogger/model/SubBusinessType;

    return-object p0
.end method

.method public final a(Lcom/kwai/adclient/kscommerciallogger/model/d;)Lcom/kwad/sdk/commercial/c;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/kwad/sdk/commercial/c;->api:Lcom/kwai/adclient/kscommerciallogger/model/d;

    return-object p0
.end method

.method public final cA(Ljava/lang/String;)Lcom/kwad/sdk/commercial/c;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/commercial/c;->tag:Ljava/lang/String;

    return-object p0
.end method

.method public final cz(Ljava/lang/String;)Lcom/kwad/sdk/commercial/c;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/commercial/c;->category:Ljava/lang/String;

    return-object p0
.end method

.method public final h(Lorg/json/JSONObject;)Lcom/kwad/sdk/commercial/c;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/commercial/c;->msg:Lorg/json/JSONObject;

    return-object p0
.end method

.method public final i(D)Lcom/kwad/sdk/commercial/c;
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/kwad/sdk/commercial/c;->apd:D

    return-object p0
.end method

.method public final j(D)Lcom/kwad/sdk/commercial/c;
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/kwad/sdk/commercial/c;->ape:D

    return-object p0
.end method

.method public final k(D)Lcom/kwad/sdk/commercial/c;
    .locals 0

    const-wide p1, 0x3f50624dd2f1a9fcL    # 0.001

    .line 1
    iput-wide p1, p0, Lcom/kwad/sdk/commercial/c;->apf:D

    return-object p0
.end method

.method public final t(Lcom/kwad/sdk/commercial/c/a;)Lcom/kwad/sdk/commercial/c;
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/kwad/sdk/core/response/a/a;->toJson()Lorg/json/JSONObject;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/sdk/commercial/c;->msg:Lorg/json/JSONObject;

    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ReportItem{category=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/kwad/sdk/commercial/c;->category:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", eventId=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/kwad/sdk/commercial/c;->eventId:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", bizType=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/kwad/sdk/commercial/c;->apg:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", primaryKey=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/kwad/sdk/commercial/c;->primaryKey:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", msg="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/kwad/sdk/commercial/c;->msg:Lorg/json/JSONObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
