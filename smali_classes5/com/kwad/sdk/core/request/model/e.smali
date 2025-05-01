.class public final Lcom/kwad/sdk/core/request/model/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/b;


# instance fields
.field private aAW:Lcom/kwad/sdk/core/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static FO()Lcom/kwad/sdk/core/request/model/e;
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/sdk/core/request/model/e;

    invoke-direct {v0}, Lcom/kwad/sdk/core/request/model/e;-><init>()V

    .line 2
    :try_start_0
    const-class v1, Lcom/kwad/sdk/core/network/k;

    invoke-static {v1}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/sdk/core/network/k;

    invoke-interface {v1}, Lcom/kwad/sdk/core/network/k;->yQ()Lcom/kwad/sdk/core/b;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/sdk/core/request/model/e;->aAW:Lcom/kwad/sdk/core/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 3
    invoke-static {v1}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    :goto_0
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
    .locals 3

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/kwad/sdk/core/request/model/e;->aAW:Lcom/kwad/sdk/core/b;

    const-string v2, "modeInfo"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->a(Lorg/json/JSONObject;Ljava/lang/String;Lcom/kwad/sdk/core/b;)V

    return-object v0
.end method
