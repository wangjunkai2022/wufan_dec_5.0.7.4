.class public Lcom/join/mgps/rpc/impl/j;
.super Ljava/lang/Object;
.source "RpcLoginImpl.java"


# static fields
.field private static b:Lcom/join/mgps/rpc/impl/j;


# instance fields
.field private final a:Le2/j;


# direct methods
.method public constructor <init>(Le2/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/join/mgps/rpc/impl/j;->a:Le2/j;

    return-void
.end method

.method public static b()Lcom/join/mgps/rpc/impl/j;
    .locals 2

    .line 1
    sget-object v0, Lcom/join/mgps/rpc/impl/j;->b:Lcom/join/mgps/rpc/impl/j;

    if-nez v0, :cond_0

    .line 2
    sget-object v0, Lcom/join/mgps/rpc/h;->E:Ljava/lang/String;

    invoke-static {v0}, Lcom/join/mgps/rpc/retrofit2/RetrofitApi;->getRetrofit2(Ljava/lang/String;)Lretrofit2/Retrofit;

    move-result-object v0

    const-class v1, Le2/j;

    invoke-virtual {v0, v1}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le2/j;

    .line 3
    new-instance v1, Lcom/join/mgps/rpc/impl/j;

    invoke-direct {v1, v0}, Lcom/join/mgps/rpc/impl/j;-><init>(Le2/j;)V

    sput-object v1, Lcom/join/mgps/rpc/impl/j;->b:Lcom/join/mgps/rpc/impl/j;

    .line 4
    :cond_0
    sget-object v0, Lcom/join/mgps/rpc/impl/j;->b:Lcom/join/mgps/rpc/impl/j;

    return-object v0
.end method


# virtual methods
.method public a()Le2/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/rpc/impl/j;->a:Le2/j;

    return-object v0
.end method
