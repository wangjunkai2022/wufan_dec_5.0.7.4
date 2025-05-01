.class public final Lcom/kwad/components/core/webview/jshandler/ak$b;
.super Lcom/kwad/sdk/core/report/a;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/core/webview/jshandler/ak;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private JK:Ljava/lang/String;

.field private Lh:Ljava/lang/String;

.field private Ye:I

.field private actionType:I

.field private adTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/report/a;-><init>()V

    return-void
.end method

.method static synthetic d(Lcom/kwad/components/core/webview/jshandler/ak$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/kwad/components/core/webview/jshandler/ak$b;->actionType:I

    return p0
.end method

.method static synthetic e(Lcom/kwad/components/core/webview/jshandler/ak$b;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/webview/jshandler/ak$b;->Lh:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic f(Lcom/kwad/components/core/webview/jshandler/ak$b;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/webview/jshandler/ak$b;->adTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method static synthetic g(Lcom/kwad/components/core/webview/jshandler/ak$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/kwad/components/core/webview/jshandler/ak$b;->Ye:I

    return p0
.end method

.method static synthetic h(Lcom/kwad/components/core/webview/jshandler/ak$b;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/webview/jshandler/ak$b;->JK:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final getActionType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/components/core/webview/jshandler/ak$b;->actionType:I

    return v0
.end method

.method public final nm()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/ak$b;->JK:Ljava/lang/String;

    return-object v0
.end method

.method public final parseJson(Lorg/json/JSONObject;)V
    .locals 3
    .param p1    # Lorg/json/JSONObject;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    const-string v0, "adTemplate"

    if-nez p1, :cond_0

    return-void

    :cond_0
    const-string v1, "actionType"

    .line 1
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/kwad/components/core/webview/jshandler/ak$b;->actionType:I

    const-string v1, "refreshType"

    .line 2
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/kwad/components/core/webview/jshandler/ak$b;->Ye:I

    const-string v1, "payload"

    .line 3
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/kwad/components/core/webview/jshandler/ak$b;->Lh:Ljava/lang/String;

    const-string v1, "creativeId"

    .line 4
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/kwad/components/core/webview/jshandler/ak$b;->JK:Ljava/lang/String;

    .line 5
    :try_start_0
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 6
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/ak$b;->adTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    if-nez v1, :cond_1

    .line 8
    new-instance v1, Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-direct {v1}, Lcom/kwad/sdk/core/response/model/AdTemplate;-><init>()V

    iput-object v1, p0, Lcom/kwad/components/core/webview/jshandler/ak$b;->adTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 9
    :cond_1
    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/ak$b;->adTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/kwad/sdk/core/response/a/a;->parseJson(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 10
    invoke-static {v0}, Lcom/kwad/sdk/core/e/c;->printStackTraceOnly(Ljava/lang/Throwable;)V

    .line 11
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/ak$b;->adTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    if-nez v0, :cond_3

    const-string v0, "adCacheId"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 12
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p1

    .line 13
    invoke-static {p1}, Lcom/kwad/components/core/n/a/d/a/a;->at(I)Lcom/kwad/sdk/core/response/model/AdResultData;

    move-result-object p1

    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/ak$b;->JK:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/kwad/sdk/core/response/b/c;->a(Lcom/kwad/sdk/core/response/model/AdResultData;Ljava/lang/String;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/core/webview/jshandler/ak$b;->adTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    :cond_3
    return-void
.end method

.method public final sT()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/ak$b;->Lh:Ljava/lang/String;

    return-object v0
.end method

.method public final toJson()Lorg/json/JSONObject;
    .locals 3

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 2
    iget v1, p0, Lcom/kwad/components/core/webview/jshandler/ak$b;->actionType:I

    const-string v2, "actionType"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 3
    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/ak$b;->Lh:Ljava/lang/String;

    const-string v2, "payload"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget v1, p0, Lcom/kwad/components/core/webview/jshandler/ak$b;->Ye:I

    const-string v2, "refreshType"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 5
    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/ak$b;->adTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const-string v2, "adTemplate"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->a(Lorg/json/JSONObject;Ljava/lang/String;Lcom/kwad/sdk/core/b;)V

    .line 6
    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/ak$b;->JK:Ljava/lang/String;

    const-string v2, "creativeId"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
