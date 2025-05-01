.class final Lcom/kwad/sdk/n/k$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/sdk/n/k;->OL()V
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
    .locals 3

    .line 1
    new-instance v0, Lcom/kwad/sdk/n/k$a;

    invoke-direct {v0}, Lcom/kwad/sdk/n/k$a;-><init>()V

    invoke-static {v0}, Lcom/kwad/sdk/n/k;->a(Lcom/kwad/sdk/n/k$a;)Lcom/kwad/sdk/n/k$a;

    .line 2
    :try_start_0
    const-class v0, Lcom/kwad/sdk/service/a/h;

    .line 3
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/h;

    const/4 v1, 0x0

    new-instance v2, Lcom/kwad/sdk/n/k$1$1;

    invoke-direct {v2, p0}, Lcom/kwad/sdk/n/k$1$1;-><init>(Lcom/kwad/sdk/n/k$1;)V

    invoke-interface {v0, v1, v2}, Lcom/kwad/sdk/service/a/h;->getAppConfigData(Ljava/lang/Object;Lcom/kwad/sdk/f/b;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/json/JSONObject;

    .line 4
    invoke-static {}, Lcom/kwad/sdk/n/k;->OM()Lcom/kwad/sdk/n/k$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/kwad/sdk/core/response/a/a;->parseJson(Lorg/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method
