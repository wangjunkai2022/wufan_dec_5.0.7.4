.class public Lcom/kwad/components/core/s/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile TJ:Lcom/kwad/components/core/s/b;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static rC()Lcom/kwad/components/core/s/b;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/kwad/components/core/s/b;->TJ:Lcom/kwad/components/core/s/b;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/kwad/components/core/s/b;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/kwad/components/core/s/b;->TJ:Lcom/kwad/components/core/s/b;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/kwad/components/core/s/b;

    invoke-direct {v1}, Lcom/kwad/components/core/s/b;-><init>()V

    sput-object v1, Lcom/kwad/components/core/s/b;->TJ:Lcom/kwad/components/core/s/b;

    .line 5
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 6
    :cond_1
    :goto_0
    sget-object v0, Lcom/kwad/components/core/s/b;->TJ:Lcom/kwad/components/core/s/b;

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lorg/json/JSONObject;Lcom/kwad/sdk/core/adlog/c/b;)Z
    .locals 4
    .param p2    # Lorg/json/JSONObject;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/kwad/sdk/core/adlog/c/b;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    const-class v0, Lcom/kwad/components/core/n/a/b/a;

    const-class v1, Lcom/kwad/sdk/components/DevelopMangerComponents;

    .line 2
    invoke-static {v1}, Lcom/kwad/sdk/components/c;->f(Ljava/lang/Class;)Lcom/kwad/sdk/components/a;

    move-result-object v1

    check-cast v1, Lcom/kwad/sdk/components/DevelopMangerComponents;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "processAdImpress notImpression: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "AdEventHelper"

    invoke-static {v3, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    if-eqz p3, :cond_1

    const/4 v1, 0x0

    .line 4
    invoke-virtual {p3, p1, v1, v1, v1}, Lcom/kwad/sdk/core/adlog/c/b;->b(Lcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;Ljava/lang/String;Lcom/kwad/sdk/f/a;)Lcom/kwad/sdk/core/adlog/c/b;

    .line 5
    :cond_1
    invoke-static {p1, p2, p3}, Lcom/kwad/sdk/core/adlog/c;->b(Lcom/kwad/sdk/core/response/model/AdTemplate;Lorg/json/JSONObject;Lcom/kwad/sdk/core/adlog/c/b;)Z

    move-result p2

    .line 6
    :try_start_0
    iget-object p3, p1, Lcom/kwad/sdk/core/response/model/AdTemplate;->mAdScene:Lcom/kwad/sdk/internal/api/SceneImpl;

    if-eqz p3, :cond_2

    .line 7
    iget p3, p3, Lcom/kwad/sdk/internal/api/SceneImpl;->adStyle:I

    const/16 v1, 0x2710

    if-ne p3, v1, :cond_2

    const/4 p3, 0x1

    const/4 v2, 0x1

    .line 8
    :cond_2
    iget p3, p1, Lcom/kwad/sdk/core/response/model/AdTemplate;->adStyle:I

    const/4 v1, 0x3

    if-eq p3, v1, :cond_3

    const/4 v1, 0x2

    if-eq p3, v1, :cond_3

    const/16 v1, 0xd

    if-eq p3, v1, :cond_3

    if-eqz v2, :cond_4

    .line 9
    :cond_3
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p2, :cond_4

    .line 10
    :try_start_1
    invoke-static {v0}, Lcom/kwad/sdk/components/c;->f(Ljava/lang/Class;)Lcom/kwad/sdk/components/a;

    move-result-object p3

    if-eqz p3, :cond_4

    .line 11
    invoke-static {v0}, Lcom/kwad/sdk/components/c;->f(Ljava/lang/Class;)Lcom/kwad/sdk/components/a;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    :catch_0
    :catchall_0
    :cond_4
    new-instance p3, Lcom/kwad/components/core/s/b$1;

    invoke-direct {p3, p0, p1}, Lcom/kwad/components/core/s/b$1;-><init>(Lcom/kwad/components/core/s/b;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    invoke-static {p3}, Lcom/kwad/sdk/utils/g;->execute(Ljava/lang/Runnable;)V

    .line 13
    invoke-static {}, Lcom/kwad/components/core/c/g;->nf()Lcom/kwad/components/core/c/g;

    move-result-object p3

    invoke-virtual {p3, p1}, Lcom/kwad/components/core/c/g;->al(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return p2
.end method
