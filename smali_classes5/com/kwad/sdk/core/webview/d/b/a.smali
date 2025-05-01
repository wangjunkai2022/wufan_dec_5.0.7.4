.class public final Lcom/kwad/sdk/core/webview/d/b/a;
.super Lcom/kwad/sdk/core/response/a/a;
.source "SourceFile"


# annotations
.annotation build Lcom/ksad/json/annotation/KsJson;
.end annotation


# instance fields
.field public KS:Z
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public Lf:Z

.field public Lt:Ljava/lang/String;

.field public Yl:Z
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public Yn:I

.field public Yo:Lcom/kwad/sdk/core/webview/d/b/c;

.field public aFZ:I

.field public aGa:I

.field public aGb:Z

.field public aGc:Z

.field public adStyle:I

.field public adTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

.field public creativeId:J

.field public kl:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/response/a/a;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/kwad/sdk/core/webview/d/b/a;->Lf:Z

    const-wide/16 v0, -0x1

    .line 3
    iput-wide v0, p0, Lcom/kwad/sdk/core/webview/d/b/a;->creativeId:J

    const/4 v0, -0x1

    .line 4
    iput v0, p0, Lcom/kwad/sdk/core/webview/d/b/a;->adStyle:I

    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/kwad/sdk/core/webview/d/b/a;->aGb:Z

    .line 6
    iput-boolean v0, p0, Lcom/kwad/sdk/core/webview/d/b/a;->aGc:Z

    return-void
.end method


# virtual methods
.method public final HM()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/kwad/sdk/core/webview/d/b/a;->Yn:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final parseJson(Lorg/json/JSONObject;)V
    .locals 2
    .param p1    # Lorg/json/JSONObject;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    const-string v0, "logParam"

    .line 1
    invoke-super {p0, p1}, Lcom/kwad/sdk/core/response/a/a;->parseJson(Lorg/json/JSONObject;)V

    .line 2
    :try_start_0
    iget v1, p0, Lcom/kwad/sdk/core/webview/d/b/a;->kl:I

    if-nez v1, :cond_2

    iget v1, p0, Lcom/kwad/sdk/core/webview/d/b/a;->aGa:I

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    .line 3
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 4
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "itemClickType"

    .line 5
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/kwad/sdk/core/webview/d/b/a;->kl:I

    const-string v1, "sceneType"

    .line 6
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/kwad/sdk/core/webview/d/b/a;->aGa:I

    const-string v1, "isCallbackOnly"

    .line 7
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/kwad/sdk/core/webview/d/b/a;->aGb:Z

    :cond_1
    const-string v0, "adTemplate"

    .line 8
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 9
    invoke-static {p1}, Lcom/kwad/sdk/utils/bh;->isNullString(Ljava/lang/String;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_2

    .line 10
    :try_start_1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 11
    new-instance p1, Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-direct {p1}, Lcom/kwad/sdk/core/response/model/AdTemplate;-><init>()V

    iput-object p1, p0, Lcom/kwad/sdk/core/webview/d/b/a;->adTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 12
    invoke-virtual {p1, v0}, Lcom/kwad/sdk/core/response/a/a;->parseJson(Lorg/json/JSONObject;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 13
    :try_start_2
    invoke-static {p1}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    :cond_2
    :goto_0
    return-void
.end method
