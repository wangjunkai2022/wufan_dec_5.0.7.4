.class public Lcom/join/mgps/rpc/impl/k;
.super Lcom/join/mgps/rpc/impl/l;
.source "RpcNetMatch1ClientImpl.java"


# static fields
.field private static e:Lcom/join/mgps/rpc/impl/l;


# instance fields
.field private final d:Le2/k;


# direct methods
.method public constructor <init>(Le2/k;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/rpc/impl/l;-><init>(Le2/k;)V

    .line 2
    sget-object p1, Lcom/join/mgps/rpc/h;->n:Ljava/lang/String;

    invoke-static {p1}, Lcom/join/mgps/rpc/retrofit2/RetrofitApi;->getRetrofit2(Ljava/lang/String;)Lretrofit2/Retrofit;

    move-result-object p1

    const-class v0, Le2/k;

    invoke-virtual {p1, v0}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le2/k;

    iput-object p1, p0, Lcom/join/mgps/rpc/impl/k;->d:Le2/k;

    return-void
.end method

.method public static n0()Lcom/join/mgps/rpc/impl/l;
    .locals 2

    .line 1
    sget-object v0, Lcom/join/mgps/rpc/impl/k;->e:Lcom/join/mgps/rpc/impl/l;

    if-nez v0, :cond_0

    .line 2
    sget-object v0, Lcom/join/mgps/rpc/h;->l:Ljava/lang/String;

    invoke-static {v0}, Lcom/join/mgps/rpc/retrofit2/RetrofitApi;->getRetrofit2(Ljava/lang/String;)Lretrofit2/Retrofit;

    move-result-object v0

    const-class v1, Le2/k;

    invoke-virtual {v0, v1}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le2/k;

    .line 3
    new-instance v1, Lcom/join/mgps/rpc/impl/k;

    invoke-direct {v1, v0}, Lcom/join/mgps/rpc/impl/k;-><init>(Le2/k;)V

    sput-object v1, Lcom/join/mgps/rpc/impl/k;->e:Lcom/join/mgps/rpc/impl/l;

    .line 4
    :cond_0
    sget-object v0, Lcom/join/mgps/rpc/impl/k;->e:Lcom/join/mgps/rpc/impl/l;

    return-object v0
.end method


# virtual methods
.method public P(ILjava/lang/String;)Lcom/join/mgps/dto/ResultArenaBean;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            ")",
            "Lcom/join/mgps/dto/ResultArenaBean<",
            "Lapp/mgsim/arena/ArenaLobbyServer;",
            ">;"
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/rpc/impl/k;->d:Le2/k;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1, p2}, Le2/k;->P(ILjava/lang/String;)Lretrofit2/Call;

    move-result-object v0

    invoke-interface {v0}, Lretrofit2/Call;->execute()Lretrofit2/Response;

    move-result-object v0

    invoke-virtual {v0}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/ResultArenaBean;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 3
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    .line 4
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/join/mgps/rpc/impl/l;->P(ILjava/lang/String;)Lcom/join/mgps/dto/ResultArenaBean;

    move-result-object p1

    return-object p1
.end method

.method public j0(Ljava/util/Map;)Lcom/join/mgps/dto/GameWorldResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/join/mgps/dto/GameWorldResponse<",
            "Lcom/join/mgps/dto/DiscoveryMainDataBean;",
            ">;"
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/rpc/impl/k;->d:Le2/k;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Le2/k;->j0(Ljava/util/Map;)Lretrofit2/Call;

    move-result-object v0

    invoke-interface {v0}, Lretrofit2/Call;->execute()Lretrofit2/Response;

    move-result-object v0

    invoke-virtual {v0}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/GameWorldResponse;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 3
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    .line 4
    :cond_0
    invoke-super {p0, p1}, Lcom/join/mgps/rpc/impl/l;->j0(Ljava/util/Map;)Lcom/join/mgps/dto/GameWorldResponse;

    move-result-object p1

    return-object p1
.end method

.method public r(Ljava/lang/String;)Lcom/join/mgps/dto/GameWorldResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/join/mgps/dto/GameWorldResponse<",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/ArenaGameInfo;",
            ">;>;"
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/rpc/impl/k;->d:Le2/k;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Le2/k;->r(Ljava/lang/String;)Lretrofit2/Call;

    move-result-object v0

    invoke-interface {v0}, Lretrofit2/Call;->execute()Lretrofit2/Response;

    move-result-object v0

    invoke-virtual {v0}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/GameWorldResponse;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 3
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    .line 4
    :cond_0
    invoke-virtual {p0, p1}, Lcom/join/mgps/rpc/impl/k;->r(Ljava/lang/String;)Lcom/join/mgps/dto/GameWorldResponse;

    move-result-object p1

    return-object p1
.end method
