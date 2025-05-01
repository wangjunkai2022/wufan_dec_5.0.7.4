.class public final Lcom/kwad/sdk/k/a/b;
.super Lcom/kwad/sdk/core/response/a/a;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/b;


# instance fields
.field public aNZ:I

.field public aOa:I

.field public aOb:I


# direct methods
.method public constructor <init>(III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/response/a/a;-><init>()V

    .line 2
    iput p1, p0, Lcom/kwad/sdk/k/a/b;->aNZ:I

    .line 3
    iput p2, p0, Lcom/kwad/sdk/k/a/b;->aOa:I

    .line 4
    iput p3, p0, Lcom/kwad/sdk/k/a/b;->aOb:I

    return-void
.end method

.method public static declared-synchronized Lg()Lcom/kwad/sdk/k/a/b;
    .locals 2

    const-class v0, Lcom/kwad/sdk/k/a/b;

    monitor-enter v0

    .line 1
    :try_start_0
    const-class v1, Lcom/kwad/sdk/service/a/h;

    invoke-static {v1}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/sdk/service/a/h;

    invoke-interface {v1}, Lcom/kwad/sdk/service/a/h;->zi()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    const/4 v1, 0x0

    .line 2
    monitor-exit v0

    return-object v1

    .line 3
    :cond_0
    :try_start_1
    invoke-static {}, Lcom/kwad/sdk/utils/ba;->Lg()Lcom/kwad/sdk/k/a/b;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method private static a(Lcom/kwad/sdk/k/a/b;Lorg/json/JSONObject;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    :cond_0
    const-string v0, "cellId"

    const/4 v1, -0x1

    .line 1
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/k/a/b;->aNZ:I

    const-string v0, "lac"

    .line 2
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/k/a/b;->aOa:I

    const-string v0, "bsss"

    .line 3
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/kwad/sdk/k/a/b;->aOb:I

    return-void
.end method

.method private static b(Lcom/kwad/sdk/k/a/b;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 2

    .line 1
    iget v0, p0, Lcom/kwad/sdk/k/a/b;->aNZ:I

    const-string v1, "cellId"

    invoke-static {p1, v1, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 2
    iget v0, p0, Lcom/kwad/sdk/k/a/b;->aOa:I

    const-string v1, "lac"

    invoke-static {p1, v1, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 3
    iget p0, p0, Lcom/kwad/sdk/k/a/b;->aOb:I

    const-string v0, "bsss"

    invoke-static {p1, v0, p0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    return-object p1
.end method


# virtual methods
.method public final parseJson(Lorg/json/JSONObject;)V
    .locals 0
    .param p1    # Lorg/json/JSONObject;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-static {p0, p1}, Lcom/kwad/sdk/k/a/b;->a(Lcom/kwad/sdk/k/a/b;Lorg/json/JSONObject;)V

    .line 2
    invoke-super {p0, p1}, Lcom/kwad/sdk/core/response/a/a;->afterParseJson(Lorg/json/JSONObject;)V

    return-void
.end method

.method public final toJson()Lorg/json/JSONObject;
    .locals 1

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-static {p0, v0}, Lcom/kwad/sdk/k/a/b;->b(Lcom/kwad/sdk/k/a/b;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method
