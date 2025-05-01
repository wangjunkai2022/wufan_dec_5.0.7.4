.class public abstract Lcom/bytedance/sdk/openadsdk/api/vv$p;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/TTAdManager;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/sdk/openadsdk/api/vv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "p"
.end annotation


# instance fields
.field private volatile m:Z

.field private p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/bytedance/sdk/openadsdk/api/vv$m<",
            "Lcom/bykv/vk/openvk/api/proto/Manager;",
            ">;>;>;"
        }
    .end annotation
.end field

.field private volatile vv:Lcom/bykv/vk/openvk/api/proto/Manager;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p;->p:Ljava/util/List;

    return-void
.end method

.method private call(Lcom/bytedance/sdk/openadsdk/api/vv$m;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bytedance/sdk/openadsdk/api/vv$m<",
            "Lcom/bykv/vk/openvk/api/proto/Manager;",
            ">;I)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p;->vv:Lcom/bykv/vk/openvk/api/proto/Manager;

    if-eqz v0, :cond_0

    .line 2
    :try_start_0
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p;->vv:Lcom/bykv/vk/openvk/api/proto/Manager;

    invoke-interface {p1, p2}, Lcom/bytedance/sdk/openadsdk/api/vv$m;->vv(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 3
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Unexpected manager call error: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "_tt_ad_sdk_"

    invoke-static {v0, p2}, Lcom/bytedance/sdk/openadsdk/api/p;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/api/vv$p;->vv(Ljava/lang/Throwable;)V

    return-void

    .line 5
    :cond_0
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p;->m:Z

    if-nez v0, :cond_2

    const/16 v0, 0x2710

    if-gt p2, v0, :cond_1

    goto :goto_0

    .line 6
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "\u5e7f\u544aSDK\u672aReady, \u8bf7\u5728load(\u8bf7\u6c42\u5e7f\u544a\uff09\u4e4b\u524d\uff0c\u5148\u8c03\u7528init and start\u65b9\u6cd5\uff0c\u4ee5\u907f\u514d\u65e0\u6cd5\u8bf7\u6c42\u5e7f\u544a"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 7
    :cond_2
    :goto_0
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/o/vv;->vv()Lcom/bytedance/sdk/openadsdk/o/vv;

    move-result-object v0

    new-instance v1, Lcom/bytedance/sdk/openadsdk/api/vv$p$7;

    invoke-direct {v1, p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/api/vv$p$7;-><init>(Lcom/bytedance/sdk/openadsdk/api/vv$p;Lcom/bytedance/sdk/openadsdk/api/vv$m;I)V

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/o/vv;->vv(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static m(Lcom/bykv/vk/openvk/api/proto/Manager;Ljava/lang/Class;Landroid/os/Bundle;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/bykv/vk/openvk/api/proto/Manager;",
            "Ljava/lang/Class<",
            "TT;>;",
            "Landroid/os/Bundle;",
            ")TT;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 1
    invoke-static {v0}, Lcom/bykv/vv/vv/vv/vv/a;->c(I)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    const/16 v1, 0x9

    invoke-virtual {v0, v1, p1}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {v0, v1, p2}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object p2

    invoke-virtual {p2}, Lcom/bykv/vv/vv/vv/vv/a;->a()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p2

    const/4 v0, 0x1

    .line 2
    invoke-interface {p0, v0}, Lcom/bykv/vk/openvk/api/proto/Manager;->getBridge(I)Lcom/bykv/vk/openvk/api/proto/Bridge;

    move-result-object p0

    const/4 v0, 0x6

    invoke-interface {p0, v0, p2, p1}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method static synthetic vv(Lcom/bytedance/sdk/openadsdk/api/vv$p;)Lcom/bykv/vk/openvk/api/proto/Manager;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p;->vv:Lcom/bykv/vk/openvk/api/proto/Manager;

    return-object p0
.end method

.method static synthetic vv(Lcom/bykv/vk/openvk/api/proto/Manager;Ljava/lang/Class;Landroid/os/Bundle;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-static {p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/api/vv$p;->m(Lcom/bykv/vk/openvk/api/proto/Manager;Ljava/lang/Class;Landroid/os/Bundle;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private vv(Lcom/bykv/vk/openvk/api/proto/Manager;)V
    .locals 2

    .line 7
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p;->vv:Lcom/bykv/vk/openvk/api/proto/Manager;

    .line 8
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p;->vv:Lcom/bykv/vk/openvk/api/proto/Manager;

    if-eqz v0, :cond_2

    .line 9
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 10
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 11
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    if-eqz v1, :cond_1

    .line 12
    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bytedance/sdk/openadsdk/api/vv$m;

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_0

    .line 13
    invoke-interface {v1, p1}, Lcom/bytedance/sdk/openadsdk/api/vv$m;->vv(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method private vv(Lcom/bytedance/sdk/openadsdk/api/vv$m;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bytedance/sdk/openadsdk/api/vv$m<",
            "Lcom/bykv/vk/openvk/api/proto/Manager;",
            ">;)V"
        }
    .end annotation

    .line 14
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p;->p:Ljava/util/List;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method static synthetic vv(Lcom/bytedance/sdk/openadsdk/api/vv$p;Lcom/bykv/vk/openvk/api/proto/Manager;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/api/vv$p;->vv(Lcom/bykv/vk/openvk/api/proto/Manager;)V

    return-void
.end method

.method static synthetic vv(Lcom/bytedance/sdk/openadsdk/api/vv$p;Lcom/bytedance/sdk/openadsdk/api/vv$m;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/api/vv$p;->vv(Lcom/bytedance/sdk/openadsdk/api/vv$m;)V

    return-void
.end method

.method static synthetic vv(Lcom/bytedance/sdk/openadsdk/api/vv$p;Lcom/bytedance/sdk/openadsdk/api/vv$m;I)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/api/vv$p;->call(Lcom/bytedance/sdk/openadsdk/api/vv$m;I)V

    return-void
.end method


# virtual methods
.method public createAdNative(Landroid/content/Context;)Lcom/bytedance/sdk/openadsdk/TTAdNative;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/ref/SoftReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    .line 2
    new-instance p1, Lcom/bytedance/sdk/openadsdk/api/vv$o;

    new-instance v1, Lcom/bytedance/sdk/openadsdk/api/vv$p$1;

    invoke-direct {v1, p0, v0}, Lcom/bytedance/sdk/openadsdk/api/vv$p$1;-><init>(Lcom/bytedance/sdk/openadsdk/api/vv$p;Ljava/lang/ref/SoftReference;)V

    invoke-direct {p1, v1}, Lcom/bytedance/sdk/openadsdk/api/vv$o;-><init>(Lcom/bytedance/sdk/openadsdk/api/vv$vv;)V

    .line 3
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/p/vv/vv;->vv()Lcom/bytedance/sdk/openadsdk/TTAdNative;

    move-result-object p1

    return-object p1
.end method

.method public getBiddingToken(Lcom/bytedance/sdk/openadsdk/AdSlot;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/AdSlot;->getAdType()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/AdSlot;->getAdType()I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/AdSlot;->getNativeAdType()I

    move-result v0

    :goto_0
    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lcom/bytedance/sdk/openadsdk/api/vv$p;->getBiddingToken(Lcom/bytedance/sdk/openadsdk/AdSlot;ZI)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getBiddingToken(Lcom/bytedance/sdk/openadsdk/AdSlot;ZI)Ljava/lang/String;
    .locals 1

    if-lez p3, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/AdSlot;->getAdType()I

    move-result p3

    if-lez p3, :cond_1

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/AdSlot;->getAdType()I

    move-result p3

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/AdSlot;->getNativeAdType()I

    move-result p3

    .line 3
    :goto_0
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/p/vv/p/m;->m(Lcom/bytedance/sdk/openadsdk/AdSlot;)Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p1

    invoke-static {p1}, Lcom/bykv/vv/vv/vv/vv/a;->k(Lcom/bykv/vk/openvk/api/proto/ValueSet;)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object p1

    const/16 v0, 0xd

    .line 4
    invoke-virtual {p1, v0, p2}, Lcom/bykv/vv/vv/vv/vv/a;->j(IZ)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object p1

    const/16 p2, 0xe

    .line 5
    invoke-virtual {p1, p2, p3}, Lcom/bykv/vv/vv/vv/vv/a;->f(II)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object p1

    .line 6
    invoke-virtual {p1}, Lcom/bykv/vv/vv/vv/vv/a;->a()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p1

    .line 7
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p;->vv:Lcom/bykv/vk/openvk/api/proto/Manager;

    if-eqz p2, :cond_2

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p;->vv:Lcom/bykv/vk/openvk/api/proto/Manager;

    const/4 p3, 0x1

    invoke-interface {p2, p3}, Lcom/bykv/vk/openvk/api/proto/Manager;->getBridge(I)Lcom/bykv/vk/openvk/api/proto/Bridge;

    move-result-object p2

    const/4 p3, 0x2

    const-class v0, Ljava/lang/String;

    .line 8
    invoke-interface {p2, p3, p1, v0}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public getExtra(Ljava/lang/Class;Landroid/os/Bundle;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Landroid/os/Bundle;",
            ")TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p;->vv:Lcom/bykv/vk/openvk/api/proto/Manager;

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p;->vv:Lcom/bykv/vk/openvk/api/proto/Manager;

    invoke-static {v0, p1, p2}, Lcom/bytedance/sdk/openadsdk/api/vv$p;->m(Lcom/bykv/vk/openvk/api/proto/Manager;Ljava/lang/Class;Landroid/os/Bundle;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    new-instance v0, Lcom/bytedance/sdk/openadsdk/api/vv$p$4;

    invoke-direct {v0, p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/api/vv$p$4;-><init>(Lcom/bytedance/sdk/openadsdk/api/vv$p;Ljava/lang/Class;Landroid/os/Bundle;)V

    const/4 p1, 0x6

    invoke-direct {p0, v0, p1}, Lcom/bytedance/sdk/openadsdk/api/vv$p;->call(Lcom/bytedance/sdk/openadsdk/api/vv$m;I)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public getPluginVersion()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p;->vv:Lcom/bykv/vk/openvk/api/proto/Manager;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p;->vv:Lcom/bykv/vk/openvk/api/proto/Manager;

    invoke-interface {v0}, Lcom/bykv/vk/openvk/api/proto/Manager;->values()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v0

    const/16 v1, 0xc

    invoke-interface {v0, v1}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->stringValue(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public getSDKVersion()Ljava/lang/String;
    .locals 1

    const-string v0, "6.2.1.7"

    return-object v0
.end method

.method public getThemeStatus()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p;->vv:Lcom/bykv/vk/openvk/api/proto/Manager;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p;->vv:Lcom/bykv/vk/openvk/api/proto/Manager;

    invoke-interface {v0}, Lcom/bykv/vk/openvk/api/proto/Manager;->values()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v0

    const/16 v1, 0xb

    invoke-interface {v0, v1}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->intValue(I)I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public register(Ljava/lang/Object;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/api/vv$p$2;

    invoke-direct {v0, p0, p1}, Lcom/bytedance/sdk/openadsdk/api/vv$p$2;-><init>(Lcom/bytedance/sdk/openadsdk/api/vv$p;Ljava/lang/Object;)V

    const/4 p1, 0x4

    invoke-direct {p0, v0, p1}, Lcom/bytedance/sdk/openadsdk/api/vv$p;->call(Lcom/bytedance/sdk/openadsdk/api/vv$m;I)V

    return-void
.end method

.method public requestPermissionIfNecessary(Landroid/content/Context;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/api/vv$p$5;

    invoke-direct {v0, p0, p1}, Lcom/bytedance/sdk/openadsdk/api/vv$p$5;-><init>(Lcom/bytedance/sdk/openadsdk/api/vv$p;Landroid/content/Context;)V

    const/4 p1, 0x3

    invoke-direct {p0, v0, p1}, Lcom/bytedance/sdk/openadsdk/api/vv$p;->call(Lcom/bytedance/sdk/openadsdk/api/vv$m;I)V

    return-void
.end method

.method public setThemeStatus(I)V
    .locals 1

    .line 1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/api/vv$p$6;

    invoke-direct {v0, p0, p1}, Lcom/bytedance/sdk/openadsdk/api/vv$p$6;-><init>(Lcom/bytedance/sdk/openadsdk/api/vv$p;I)V

    const/4 p1, 0x1

    invoke-direct {p0, v0, p1}, Lcom/bytedance/sdk/openadsdk/api/vv$p;->call(Lcom/bytedance/sdk/openadsdk/api/vv$m;I)V

    return-void
.end method

.method public tryShowInstallDialogWhenExit(Landroid/app/Activity;Lcom/bytedance/sdk/openadsdk/downloadnew/core/ExitInstallListener;)Z
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "activity"

    .line 2
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "exitInstallListener"

    .line 3
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/TTAppContextHolder;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/downloadnew/core/DownloadBridgeFactory;->getDownloadBridge(Landroid/content/Context;)Lcom/bykv/vk/openvk/api/proto/Bridge;

    move-result-object p1

    const/4 p2, 0x1

    invoke-static {p2}, Lcom/bykv/vv/vv/vv/vv/a;->c(I)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object p2

    const/4 v1, 0x0

    invoke-virtual {p2, v1, v0}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object p2

    invoke-virtual {p2}, Lcom/bykv/vv/vv/vv/vv/a;->a()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p2

    const-class v0, Ljava/lang/Boolean;

    invoke-interface {p1, v1, p2, v0}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public unregister(Ljava/lang/Object;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/api/vv$p$3;

    invoke-direct {v0, p0, p1}, Lcom/bytedance/sdk/openadsdk/api/vv$p$3;-><init>(Lcom/bytedance/sdk/openadsdk/api/vv$p;Ljava/lang/Object;)V

    const/4 p1, 0x5

    invoke-direct {p0, v0, p1}, Lcom/bytedance/sdk/openadsdk/api/vv$p;->call(Lcom/bytedance/sdk/openadsdk/api/vv$m;I)V

    return-void
.end method

.method protected vv(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    return-object p1
.end method

.method protected vv(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public vv(Z)V
    .locals 0

    .line 6
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p;->m:Z

    return-void
.end method
