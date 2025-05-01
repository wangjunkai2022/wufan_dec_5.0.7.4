.class public Lcom/kwad/components/core/c/j;
.super Lcom/kwad/sdk/core/network/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kwad/sdk/core/network/o<",
        "Lcom/kwad/components/core/request/a;",
        "Lcom/kwad/sdk/core/response/model/AdResultData;",
        ">;"
    }
.end annotation


# instance fields
.field private final JO:Lcom/kwad/components/core/request/model/a;


# direct methods
.method public constructor <init>(Lcom/kwad/components/core/request/model/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/network/o;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kwad/components/core/c/j;->JO:Lcom/kwad/components/core/request/model/a;

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/c/j;Lcom/kwad/sdk/core/response/model/AdResultData;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/kwad/components/core/c/j;->j(Lcom/kwad/sdk/core/response/model/AdResultData;)V

    return-void
.end method

.method private a(Lcom/kwad/components/core/request/a;Lcom/kwad/sdk/core/response/model/AdResultData;)V
    .locals 1
    .param p1    # Lcom/kwad/components/core/request/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/kwad/sdk/core/response/model/AdResultData;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    invoke-super {p0, p1, p2}, Lcom/kwad/sdk/core/network/o;->onSuccess(Lcom/kwad/sdk/core/network/f;Lcom/kwad/sdk/core/response/model/BaseResultData;)V

    .line 3
    invoke-static {}, Lcom/kwad/sdk/core/threads/GlobalThreadPools;->Gr()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    new-instance v0, Lcom/kwad/components/core/c/j$1;

    invoke-direct {v0, p0, p2}, Lcom/kwad/components/core/c/j$1;-><init>(Lcom/kwad/components/core/c/j;Lcom/kwad/sdk/core/response/model/AdResultData;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 4
    iget-object p1, p0, Lcom/kwad/components/core/c/j;->JO:Lcom/kwad/components/core/request/model/a;

    invoke-virtual {p0, p1, p2}, Lcom/kwad/components/core/c/j;->a(Lcom/kwad/components/core/request/model/a;Lcom/kwad/sdk/core/response/model/AdResultData;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 5
    iget-object p1, p0, Lcom/kwad/components/core/c/j;->JO:Lcom/kwad/components/core/request/model/a;

    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Lcom/kwad/components/core/request/model/a;->a(Lcom/kwad/components/core/request/model/a;Lcom/kwad/sdk/core/response/model/AdResultData;Z)V

    :cond_0
    return-void
.end method

.method private static j(Lcom/kwad/sdk/core/response/model/AdResultData;)V
    .locals 4
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/core/response/model/AdResultData;->getProceedTemplateList()Ljava/util/List;

    move-result-object v0

    .line 2
    invoke-static {}, Lcom/kwad/components/core/c/a;->mU()Lcom/kwad/components/core/c/a;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_0

    const/4 v2, 0x0

    .line 4
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 5
    invoke-virtual {p0}, Lcom/kwad/sdk/core/response/model/AdResultData;->getPosId()J

    move-result-wide v2

    .line 6
    invoke-static {v2, v3}, Lcom/kwad/components/core/c/e;->s(J)Lcom/kwad/components/core/c/e;

    move-result-object v2

    .line 7
    invoke-virtual {v1}, Lcom/kwad/components/core/c/a;->mV()V

    .line 8
    invoke-static {v2, p0}, Lcom/kwad/components/core/c/h;->a(Lcom/kwad/components/core/c/e;Lcom/kwad/sdk/core/response/model/AdResultData;)Ljava/util/List;

    move-result-object p0

    .line 9
    invoke-virtual {v1, p0}, Lcom/kwad/components/core/c/a;->i(Ljava/util/List;)V

    .line 10
    invoke-static {v0}, Lcom/kwad/components/core/c/e;->ak(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/components/core/c/e;

    move-result-object p0

    .line 11
    invoke-virtual {v1, p0}, Lcom/kwad/components/core/c/a;->a(Lcom/kwad/components/core/c/e;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Lcom/kwad/components/core/request/a;ILjava/lang/String;)V
    .locals 1
    .param p1    # Lcom/kwad/components/core/request/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 6
    invoke-super {p0, p1, p2, p3}, Lcom/kwad/sdk/core/network/o;->onError(Lcom/kwad/sdk/core/network/f;ILjava/lang/String;)V

    .line 7
    iget-object p1, p0, Lcom/kwad/components/core/c/j;->JO:Lcom/kwad/components/core/request/model/a;

    const/4 v0, 0x0

    invoke-static {p1, p2, p3, v0}, Lcom/kwad/components/core/request/model/a;->a(Lcom/kwad/components/core/request/model/a;ILjava/lang/String;Z)V

    return-void
.end method

.method protected a(Lcom/kwad/components/core/request/model/a;Lcom/kwad/sdk/core/response/model/AdResultData;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public synthetic onError(Lcom/kwad/sdk/core/network/f;ILjava/lang/String;)V
    .locals 0
    .param p1    # Lcom/kwad/sdk/core/network/f;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    check-cast p1, Lcom/kwad/components/core/request/a;

    invoke-virtual {p0, p1, p2, p3}, Lcom/kwad/components/core/c/j;->a(Lcom/kwad/components/core/request/a;ILjava/lang/String;)V

    return-void
.end method

.method public synthetic onSuccess(Lcom/kwad/sdk/core/network/f;Lcom/kwad/sdk/core/response/model/BaseResultData;)V
    .locals 0
    .param p1    # Lcom/kwad/sdk/core/network/f;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/kwad/sdk/core/response/model/BaseResultData;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    check-cast p1, Lcom/kwad/components/core/request/a;

    check-cast p2, Lcom/kwad/sdk/core/response/model/AdResultData;

    invoke-direct {p0, p1, p2}, Lcom/kwad/components/core/c/j;->a(Lcom/kwad/components/core/request/a;Lcom/kwad/sdk/core/response/model/AdResultData;)V

    return-void
.end method
