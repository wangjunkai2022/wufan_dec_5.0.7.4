.class final Lcom/kwad/sdk/h/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/h/b;


# instance fields
.field public aKC:Ljava/lang/String;

.field public aKD:Ljava/lang/String;

.field public aKE:Ljava/lang/String;

.field public aKF:J

.field public apu:D


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/sdk/h/i;->aKF:J

    return-void
.end method

.method public static JW()Lcom/kwad/sdk/h/i;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/sdk/h/i;

    invoke-direct {v0}, Lcom/kwad/sdk/h/i;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final gi(Ljava/lang/String;)Lcom/kwad/sdk/h/i;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/h/i;->aKC:Ljava/lang/String;

    return-object p0
.end method

.method public final gj(Ljava/lang/String;)Lcom/kwad/sdk/h/i;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/h/i;->aKD:Ljava/lang/String;

    return-object p0
.end method

.method public final gk(Ljava/lang/String;)Lcom/kwad/sdk/h/i;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/h/i;->aKE:Ljava/lang/String;

    return-object p0
.end method

.method public final n(D)Lcom/kwad/sdk/h/i;
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/kwad/sdk/h/i;->apu:D

    return-object p0
.end method

.method public final toJson()Lorg/json/JSONObject;
    .locals 4

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 2
    iget-wide v1, p0, Lcom/kwad/sdk/h/i;->apu:D

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const-string v2, "ratio"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/h/c;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 3
    iget-wide v1, p0, Lcom/kwad/sdk/h/i;->apu:D

    invoke-static {v1, v2}, Lcom/kwad/sdk/h/j;->o(D)D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const-string v2, "ratio_count"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/h/c;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    iget-wide v1, p0, Lcom/kwad/sdk/h/i;->aKF:J

    const-string v3, "log_build_time_ms"

    invoke-static {v0, v3, v1, v2}, Lcom/kwad/sdk/h/c;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 5
    iget-object v1, p0, Lcom/kwad/sdk/h/i;->aKC:Ljava/lang/String;

    const-string v2, "log_level"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/h/c;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    iget-object v1, p0, Lcom/kwad/sdk/h/i;->aKD:Ljava/lang/String;

    const-string v2, "log_tag"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/h/c;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    iget-object v1, p0, Lcom/kwad/sdk/h/i;->aKE:Ljava/lang/String;

    const-string v2, "log_content"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/h/c;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
