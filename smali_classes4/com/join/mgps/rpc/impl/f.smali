.class public Lcom/join/mgps/rpc/impl/f;
.super Ljava/lang/Object;
.source "RpcConsoleGameClientImpl.java"

# interfaces
.implements Lcom/join/mgps/rpc/g;


# static fields
.field private static b:Lcom/join/mgps/rpc/impl/f;


# instance fields
.field private final a:Le2/f;


# direct methods
.method public constructor <init>(Le2/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/join/mgps/rpc/impl/f;->a:Le2/f;

    return-void
.end method

.method public static b()Lcom/join/mgps/rpc/impl/f;
    .locals 2

    .line 1
    sget-object v0, Lcom/join/mgps/rpc/impl/f;->b:Lcom/join/mgps/rpc/impl/f;

    if-nez v0, :cond_0

    .line 2
    sget-object v0, Lcom/join/mgps/rpc/h;->x:Ljava/lang/String;

    invoke-static {v0}, Lcom/join/mgps/rpc/retrofit2/RetrofitApi;->getRetrofit2(Ljava/lang/String;)Lretrofit2/Retrofit;

    move-result-object v0

    const-class v1, Le2/f;

    invoke-virtual {v0, v1}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le2/f;

    .line 3
    new-instance v1, Lcom/join/mgps/rpc/impl/f;

    invoke-direct {v1, v0}, Lcom/join/mgps/rpc/impl/f;-><init>(Le2/f;)V

    sput-object v1, Lcom/join/mgps/rpc/impl/f;->b:Lcom/join/mgps/rpc/impl/f;

    .line 4
    :cond_0
    sget-object v0, Lcom/join/mgps/rpc/impl/f;->b:Lcom/join/mgps/rpc/impl/f;

    return-object v0
.end method

.method public static c()Lcom/join/mgps/rpc/impl/f;
    .locals 2

    .line 1
    sget-object v0, Lcom/join/mgps/rpc/h;->x:Ljava/lang/String;

    invoke-static {v0}, Lcom/join/mgps/rpc/retrofit2/RetrofitApi;->getRetrofit2(Ljava/lang/String;)Lretrofit2/Retrofit;

    move-result-object v0

    const-class v1, Le2/f;

    invoke-virtual {v0, v1}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le2/f;

    .line 2
    new-instance v1, Lcom/join/mgps/rpc/impl/f;

    invoke-direct {v1, v0}, Lcom/join/mgps/rpc/impl/f;-><init>(Le2/f;)V

    sput-object v1, Lcom/join/mgps/rpc/impl/f;->b:Lcom/join/mgps/rpc/impl/f;

    return-object v1
.end method


# virtual methods
.method public a(Ljava/util/Map;)Lcom/join/mgps/dto/ResultMainBean;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/join/mgps/dto/ResultMainBean<",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/AppBean;",
            ">;>;"
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/rpc/impl/f;->a:Le2/f;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Le2/f;->a(Ljava/util/Map;)Lretrofit2/Call;

    move-result-object p1

    invoke-interface {p1}, Lretrofit2/Call;->execute()Lretrofit2/Response;

    move-result-object p1

    invoke-virtual {p1}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/ResultMainBean;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 3
    invoke-virtual {p1}, Ljava/io/IOException;->printStackTrace()V

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
