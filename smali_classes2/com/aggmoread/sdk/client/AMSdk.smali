.class public Lcom/aggmoread/sdk/client/AMSdk;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aggmoread/sdk/client/AMSdk$SDKBidInfoCallback;,
        Lcom/aggmoread/sdk/client/AMSdk$IAdSdkManager;
    }
.end annotation


# static fields
.field private static sdkManager:Lcom/aggmoread/sdk/client/AMSdk$IAdSdkManager;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getSDKBidInfo(Ljava/lang/String;Ljava/util/Map;Lcom/aggmoread/sdk/client/AMSdk$SDKBidInfoCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/aggmoread/sdk/client/AMSdk$SDKBidInfoCallback;",
            ")V"
        }
    .end annotation

    if-eqz p2, :cond_0

    new-instance v0, Lcom/aggmoread/sdk/client/AMSdk$1;

    invoke-direct {v0, p2}, Lcom/aggmoread/sdk/client/AMSdk$1;-><init>(Lcom/aggmoread/sdk/client/AMSdk$SDKBidInfoCallback;)V

    invoke-static {p0, p1, v0}, Lcom/aggmoread/sdk/z/c/a/a/c/k;->a(Ljava/lang/String;Ljava/util/Map;Lcom/aggmoread/sdk/z/c/a/a/c/k$e;)V

    :cond_0
    return-void
.end method

.method public static getSDKVersion()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/e/c;->q()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static init(Landroid/content/Context;Lcom/aggmoread/sdk/client/AMAdConfig;)V
    .locals 4

    sget-object v0, Lcom/aggmoread/sdk/client/AMSdk;->sdkManager:Lcom/aggmoread/sdk/client/AMSdk$IAdSdkManager;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-class v0, Lcom/aggmoread/sdk/client/AMSdk;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/aggmoread/sdk/client/AMSdk;->sdkManager:Lcom/aggmoread/sdk/client/AMSdk$IAdSdkManager;

    if-eqz v1, :cond_1

    monitor-exit v0

    return-void

    :cond_1
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Class;

    const/4 v2, 0x0

    const-class v3, Lcom/aggmoread/sdk/client/AMSdk$IAdSdkManager;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    const-class v3, Lcom/aggmoread/sdk/client/AMAdLoader$IAdLoader;

    aput-object v3, v1, v2

    invoke-static {v1, p0}, Lcom/aggmoread/sdk/b/a;->a([Ljava/lang/Class;Landroid/content/Context;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/aggmoread/sdk/client/AMSdk$IAdSdkManager;

    sput-object v1, Lcom/aggmoread/sdk/client/AMSdk;->sdkManager:Lcom/aggmoread/sdk/client/AMSdk$IAdSdkManager;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v1, p0, p1}, Lcom/aggmoread/sdk/client/AMSdk$IAdSdkManager;->init(Landroid/content/Context;Lcom/aggmoread/sdk/client/AMAdConfig;)V

    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static makeAdLoader(Lcom/aggmoread/sdk/client/AMAdLoadSlot;)Lcom/aggmoread/sdk/client/AMAdLoader;
    .locals 2

    sget-object v0, Lcom/aggmoread/sdk/client/AMSdk;->sdkManager:Lcom/aggmoread/sdk/client/AMSdk$IAdSdkManager;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    sget-object p0, Lcom/aggmoread/sdk/t;->SDK_TAG:Ljava/lang/String;

    return-object v1

    :cond_0
    if-nez p0, :cond_1

    sget-object p0, Lcom/aggmoread/sdk/t;->SDK_TAG:Ljava/lang/String;

    return-object v1

    :cond_1
    new-instance v0, Lcom/aggmoread/sdk/client/AMAdLoader;

    invoke-direct {v0, p0}, Lcom/aggmoread/sdk/client/AMAdLoader;-><init>(Lcom/aggmoread/sdk/client/AMAdLoadSlot;)V

    return-object v0
.end method

.method public static preLoad(Landroid/content/Context;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/aggmoread/sdk/client/AMChannelIdInfo;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lcom/aggmoread/sdk/client/AMSdk;->sdkManager:Lcom/aggmoread/sdk/client/AMSdk$IAdSdkManager;

    if-nez v0, :cond_0

    sget-object p0, Lcom/aggmoread/sdk/t;->SDK_TAG:Ljava/lang/String;

    return-void

    :cond_0
    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/aggmoread/sdk/client/AMSdk;->sdkManager:Lcom/aggmoread/sdk/client/AMSdk$IAdSdkManager;

    invoke-interface {v0, p0, p1}, Lcom/aggmoread/sdk/client/AMSdk$IAdSdkManager;->preLoad(Landroid/content/Context;Ljava/util/List;)V

    :cond_2
    :goto_0
    return-void
.end method
