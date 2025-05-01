.class public Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$f;,
        Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$h;,
        Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$i;,
        Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$g;,
        Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$j;,
        Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$k;
    }
.end annotation


# static fields
.field private static a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c;[Ljava/lang/Object;)Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$f;
    .locals 0

    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c;->a([Ljava/lang/Object;)Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$f;

    move-result-object p0

    return-object p0
.end method

.method private a([Ljava/lang/Object;)Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$f;
    .locals 4

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$f;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$f;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$a;)V

    if-eqz p1, :cond_2

    array-length v1, p1

    const/4 v2, 0x1

    if-lt v1, v2, :cond_0

    const/4 v1, 0x0

    aget-object v1, p1, v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iput v1, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$f;->a:I

    :cond_0
    array-length v1, p1

    const/4 v3, 0x2

    if-lt v1, v3, :cond_1

    aget-object v1, p1, v2

    instance-of v1, v1, Ljava/lang/String;

    if-eqz v1, :cond_1

    aget-object v1, p1, v2

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$f;->b:Ljava/lang/String;

    :cond_1
    array-length v1, p1

    const/4 v2, 0x3

    if-lt v1, v2, :cond_2

    aget-object p1, p1, v3

    iput-object p1, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$f;->c:Ljava/lang/Object;

    :cond_2
    return-object v0
.end method

.method public static declared-synchronized a()Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c;
    .locals 2

    const-class v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c;

    if-nez v1, :cond_1

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c;

    if-nez v1, :cond_0

    new-instance v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c;

    invoke-direct {v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c;-><init>()V

    sput-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v1

    :cond_1
    :goto_0
    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v0

    return-object v1

    :catchall_1
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static a(Z)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "bd ap "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->a(Ljava/lang/String;)V

    :try_start_0
    invoke-static {p0}, Lcom/baidu/mobads/sdk/api/MobadsPermissionSettings;->setLimitPersonalAds(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ap e"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->a(Ljava/lang/String;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$h;)Lcom/baidu/mobads/sdk/api/BaiduNativeManager$ExpressAdListener;
    .locals 4

    const-class v0, Lcom/baidu/mobads/sdk/api/BaiduNativeManager$ExpressAdListener;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Class;

    const/4 v2, 0x0

    const-class v3, Lcom/baidu/mobads/sdk/api/BaiduNativeManager$ExpressAdListener;

    aput-object v3, v1, v2

    new-instance v2, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$e;

    invoke-direct {v2, p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$e;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c;Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$h;)V

    invoke-static {v0, v1, v2}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/baidu/mobads/sdk/api/BaiduNativeManager$ExpressAdListener;

    return-object p1
.end method

.method public a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$i;)Lcom/baidu/mobads/sdk/api/BaiduNativeManager$FeedAdListener;
    .locals 4

    const-class v0, Lcom/baidu/mobads/sdk/api/BaiduNativeManager$FeedAdListener;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Class;

    const/4 v2, 0x0

    const-class v3, Lcom/baidu/mobads/sdk/api/BaiduNativeManager$FeedAdListener;

    aput-object v3, v1, v2

    new-instance v2, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$d;

    invoke-direct {v2, p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$d;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c;Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$i;)V

    invoke-static {v0, v1, v2}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/baidu/mobads/sdk/api/BaiduNativeManager$FeedAdListener;

    return-object p1
.end method

.method public a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$j;)Lcom/baidu/mobads/sdk/api/ExpressInterstitialListener;
    .locals 4

    const-class v0, Lcom/baidu/mobads/sdk/api/ExpressInterstitialListener;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Class;

    const/4 v2, 0x0

    const-class v3, Lcom/baidu/mobads/sdk/api/ExpressInterstitialListener;

    aput-object v3, v1, v2

    new-instance v2, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$a;

    invoke-direct {v2, p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$a;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c;Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$j;)V

    invoke-static {v0, v1, v2}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/baidu/mobads/sdk/api/ExpressInterstitialListener;

    return-object p1
.end method

.method public a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$g;)Lcom/baidu/mobads/sdk/api/ExpressResponse$ExpressDislikeListener;
    .locals 4

    const-class v0, Lcom/baidu/mobads/sdk/api/ExpressResponse$ExpressDislikeListener;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Class;

    const/4 v2, 0x0

    const-class v3, Lcom/baidu/mobads/sdk/api/ExpressResponse$ExpressDislikeListener;

    aput-object v3, v1, v2

    new-instance v2, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$b;

    invoke-direct {v2, p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$b;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c;Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$g;)V

    invoke-static {v0, v1, v2}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/baidu/mobads/sdk/api/ExpressResponse$ExpressDislikeListener;

    return-object p1
.end method

.method public a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$k;)Lcom/baidu/mobads/sdk/api/SplashInteractionListener;
    .locals 4

    const-class v0, Lcom/baidu/mobads/sdk/api/SplashInteractionListener;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Class;

    const/4 v2, 0x0

    const-class v3, Lcom/baidu/mobads/sdk/api/SplashInteractionListener;

    aput-object v3, v1, v2

    new-instance v2, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$c;

    invoke-direct {v2, p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$c;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c;Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$k;)V

    invoke-static {v0, v1, v2}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/baidu/mobads/sdk/api/SplashInteractionListener;

    return-object p1
.end method
