.class public final Lcom/kwad/sdk/core/request/model/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/b;


# static fields
.field private static aAR:Lcom/kwad/sdk/core/request/model/c;


# instance fields
.field private latitude:D

.field private longitude:D

.field private type:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static FL()Lcom/kwad/sdk/core/request/model/c;
    .locals 5

    .line 1
    sget-object v0, Lcom/kwad/sdk/core/request/model/c;->aAR:Lcom/kwad/sdk/core/request/model/c;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    :try_start_0
    new-instance v0, Lcom/kwad/sdk/core/request/model/c;

    invoke-direct {v0}, Lcom/kwad/sdk/core/request/model/c;-><init>()V

    sput-object v0, Lcom/kwad/sdk/core/request/model/c;->aAR:Lcom/kwad/sdk/core/request/model/c;

    .line 3
    const-class v0, Lcom/kwad/sdk/service/a/f;

    .line 4
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/f;

    invoke-interface {v0}, Lcom/kwad/sdk/service/a/f;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/utils/aw;->ci(Landroid/content/Context;)Lcom/kwad/sdk/utils/c/a;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 5
    iget-object v1, v0, Lcom/kwad/sdk/utils/c/a;->aTt:Landroid/location/Location;

    if-eqz v1, :cond_1

    .line 6
    sget-object v2, Lcom/kwad/sdk/core/request/model/c;->aAR:Lcom/kwad/sdk/core/request/model/c;

    invoke-virtual {v1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v3

    iput-wide v3, v2, Lcom/kwad/sdk/core/request/model/c;->latitude:D

    .line 7
    sget-object v1, Lcom/kwad/sdk/core/request/model/c;->aAR:Lcom/kwad/sdk/core/request/model/c;

    iget-object v2, v0, Lcom/kwad/sdk/utils/c/a;->aTt:Landroid/location/Location;

    invoke-virtual {v2}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    iput-wide v2, v1, Lcom/kwad/sdk/core/request/model/c;->longitude:D

    .line 8
    sget-object v1, Lcom/kwad/sdk/core/request/model/c;->aAR:Lcom/kwad/sdk/core/request/model/c;

    iget v0, v0, Lcom/kwad/sdk/utils/c/a;->type:I

    iput v0, v1, Lcom/kwad/sdk/core/request/model/c;->type:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 9
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    .line 10
    :cond_1
    :goto_0
    sget-object v0, Lcom/kwad/sdk/core/request/model/c;->aAR:Lcom/kwad/sdk/core/request/model/c;

    return-object v0
.end method


# virtual methods
.method public final parseJson(Lorg/json/JSONObject;)V
    .locals 0
    .param p1    # Lorg/json/JSONObject;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    return-void
.end method

.method public final toJson()Lorg/json/JSONObject;
    .locals 4

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 2
    iget-wide v1, p0, Lcom/kwad/sdk/core/request/model/c;->latitude:D

    const-string v3, "latitude"

    invoke-static {v0, v3, v1, v2}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;D)V

    .line 3
    iget-wide v1, p0, Lcom/kwad/sdk/core/request/model/c;->longitude:D

    const-string v3, "longitude"

    invoke-static {v0, v3, v1, v2}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;D)V

    .line 4
    iget v1, p0, Lcom/kwad/sdk/core/request/model/c;->type:I

    const-string v2, "type"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    return-object v0
.end method
