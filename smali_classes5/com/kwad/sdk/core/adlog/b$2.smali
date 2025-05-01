.class final Lcom/kwad/sdk/core/adlog/b$2;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/sdk/core/adlog/b;->BN()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 4

    .line 1
    invoke-static {}, Lcom/kwad/sdk/core/adlog/a/b;->BQ()Lcom/kwad/sdk/core/adlog/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/sdk/core/adlog/a/b;->BT()Lcom/kwad/sdk/core/adlog/a/a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, v0, Lcom/kwad/sdk/core/adlog/a/a;->aqw:Lorg/json/JSONObject;

    .line 3
    iget v2, v0, Lcom/kwad/sdk/core/adlog/a/a;->retryCount:I

    const-string v3, "retryCount"

    invoke-static {v1, v3, v2}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    const/4 v2, 0x1

    const-string v3, "cacheType"

    .line 4
    invoke-static {v1, v3, v2}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 5
    iget-object v2, v0, Lcom/kwad/sdk/core/adlog/a/a;->url:Ljava/lang/String;

    iget-object v3, v0, Lcom/kwad/sdk/core/adlog/a/a;->aqx:Lcom/kwad/sdk/core/adlog/c/a;

    invoke-static {v2, v1, v3, v0}, Lcom/kwad/sdk/core/adlog/b;->b(Ljava/lang/String;Lorg/json/JSONObject;Lcom/kwad/sdk/core/adlog/c/a;Lcom/kwad/sdk/core/adlog/a/a;)V

    :cond_0
    return-void
.end method
