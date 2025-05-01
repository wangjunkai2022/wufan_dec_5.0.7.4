.class public Lcom/bytedance/sdk/openadsdk/api/plugin/u;
.super Lcom/bytedance/sdk/openadsdk/api/vv;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/openadsdk/api/plugin/u$vv;
    }
.end annotation


# static fields
.field private static final vv:Lcom/bytedance/sdk/openadsdk/api/plugin/u$vv;


# instance fields
.field private i:Lcom/bytedance/sdk/openadsdk/vv/m;

.field private volatile m:Lcom/bykv/vk/openvk/api/proto/Initializer;

.field private p:Lcom/bytedance/sdk/openadsdk/api/plugin/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/api/plugin/u$vv;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/bytedance/sdk/openadsdk/api/plugin/u$vv;-><init>(Lcom/bytedance/sdk/openadsdk/api/plugin/u$1;)V

    sput-object v0, Lcom/bytedance/sdk/openadsdk/api/plugin/u;->vv:Lcom/bytedance/sdk/openadsdk/api/plugin/u$vv;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/api/vv;-><init>()V

    .line 2
    new-instance v0, Lcom/bytedance/sdk/openadsdk/api/plugin/u$1;

    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/api/plugin/u$1;-><init>(Lcom/bytedance/sdk/openadsdk/api/plugin/u;)V

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/u;->i:Lcom/bytedance/sdk/openadsdk/vv/m;

    return-void
.end method

.method private static m(Lcom/bytedance/sdk/openadsdk/api/plugin/i;)Lcom/bykv/vk/openvk/api/proto/Initializer;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/bytedance/sdk/openadsdk/api/plugin/vv;
        }
    .end annotation

    const/16 v0, 0x106d

    :try_start_0
    const-string v1, "call_create_initializer"

    .line 26
    invoke-virtual {p0, v1}, Lcom/bytedance/sdk/openadsdk/api/plugin/i;->m(Ljava/lang/String;)J

    .line 27
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/TTAppContextHolder;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/api/plugin/o;->vv(Landroid/content/Context;)Lcom/bytedance/sdk/openadsdk/api/plugin/o;

    move-result-object v1

    .line 28
    invoke-virtual {v1, p0}, Lcom/bytedance/sdk/openadsdk/api/plugin/o;->vv(Lcom/bytedance/sdk/openadsdk/api/plugin/i;)Ldalvik/system/BaseDexClassLoader;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "com.bytedance.sdk.openadsdk.core.AdSdkInitializerHolder"

    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "get_init_class_cost"

    .line 30
    invoke-virtual {p0, v2}, Lcom/bytedance/sdk/openadsdk/api/plugin/i;->m(Ljava/lang/String;)J

    .line 31
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v3, "call_init_time"

    .line 32
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/plugin/i;->m()J

    move-result-wide v4

    invoke-virtual {v2, v3, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-string v3, "_pl_update_event_listener_"

    .line 33
    new-instance v4, Lcom/bytedance/sdk/openadsdk/api/plugin/o$p;

    invoke-direct {v4}, Lcom/bytedance/sdk/openadsdk/api/plugin/o$p;-><init>()V

    invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    const-string v3, "create_bundle_cost"

    .line 34
    invoke-virtual {p0, v3}, Lcom/bytedance/sdk/openadsdk/api/plugin/i;->m(Ljava/lang/String;)J

    const-string v3, "getNewInstance"

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Class;

    .line 35
    const-class v6, Landroid/os/Bundle;

    const/4 v7, 0x0

    aput-object v6, v5, v7

    invoke-virtual {v1, v3, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    const-string v3, "get_init_method_cost"

    .line 36
    invoke-virtual {p0, v3}, Lcom/bytedance/sdk/openadsdk/api/plugin/i;->m(Ljava/lang/String;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v3, 0x0

    :try_start_1
    new-array v4, v4, [Ljava/lang/Object;

    aput-object v2, v4, v7

    .line 37
    invoke-virtual {v1, v3, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bykv/vk/openvk/api/proto/Initializer;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    const-string v2, "get_init_instance_cost"

    .line 38
    invoke-virtual {p0, v2}, Lcom/bytedance/sdk/openadsdk/api/plugin/i;->m(Ljava/lang/String;)J

    const-string p0, "TTPluginManager"

    const-string v2, "Create initializer success"

    .line 39
    invoke-static {p0, v2}, Lcom/bytedance/sdk/openadsdk/api/p;->m(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :catchall_0
    move-exception p0

    const-string v1, "com.byted.pangle"

    .line 40
    invoke-static {v1}, Lcom/bytedance/pangle/Zeus;->unInstallPlugin(Ljava/lang/String;)V

    .line 41
    throw p0

    .line 42
    :cond_0
    new-instance p0, Lcom/bytedance/sdk/openadsdk/api/plugin/vv;

    const-string v1, "Get initializer failed"

    invoke-direct {p0, v0, v1}, Lcom/bytedance/sdk/openadsdk/api/plugin/vv;-><init>(ILjava/lang/String;)V

    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception p0

    .line 43
    instance-of v1, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/vv;

    if-eqz v1, :cond_1

    .line 44
    new-instance v1, Lcom/bytedance/sdk/openadsdk/api/plugin/vv;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "("

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object v3, p0

    check-cast v3, Lcom/bytedance/sdk/openadsdk/api/plugin/vv;

    invoke-virtual {v3}, Lcom/bytedance/sdk/openadsdk/api/plugin/vv;->vv()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, v0, p0}, Lcom/bytedance/sdk/openadsdk/api/plugin/vv;-><init>(ILjava/lang/String;)V

    throw v1

    .line 45
    :cond_1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/api/plugin/vv;

    const/16 v1, 0x106e

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lcom/bytedance/sdk/openadsdk/api/plugin/vv;-><init>(ILjava/lang/String;)V

    throw v0
.end method

.method private vv(I)Lcom/bykv/vk/openvk/api/proto/Bridge;
    .locals 1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 9
    :cond_0
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/api/plugin/vv/vv;->vv()Lcom/bytedance/sdk/openadsdk/api/plugin/vv/vv;

    move-result-object p1

    return-object p1

    .line 10
    :cond_1
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/TTAppContextHolder;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/downloadnew/i;->vv(Landroid/content/Context;)Lcom/bytedance/sdk/openadsdk/downloadnew/i;

    move-result-object p1

    return-object p1

    .line 11
    :cond_2
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/live/m;->vv()Lcom/bytedance/sdk/openadsdk/live/m;

    move-result-object p1

    return-object p1
.end method

.method static synthetic vv(Lcom/bytedance/sdk/openadsdk/api/plugin/u;I)Lcom/bykv/vk/openvk/api/proto/Bridge;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/api/plugin/u;->vv(I)Lcom/bykv/vk/openvk/api/proto/Bridge;

    move-result-object p0

    return-object p0
.end method

.method private vv(Lcom/bytedance/sdk/openadsdk/api/plugin/i;)Lcom/bykv/vk/openvk/api/proto/Initializer;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/bytedance/sdk/openadsdk/api/plugin/vv;
        }
    .end annotation

    .line 15
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/u;->m:Lcom/bykv/vk/openvk/api/proto/Initializer;

    if-nez v0, :cond_1

    .line 16
    monitor-enter p0

    .line 17
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/u;->m:Lcom/bykv/vk/openvk/api/proto/Initializer;

    if-nez v0, :cond_0

    const-string v0, "TTPluginManager"

    const-string v1, "Create initializer"

    .line 18
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/api/p;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/api/plugin/u;->m(Lcom/bytedance/sdk/openadsdk/api/plugin/i;)Lcom/bykv/vk/openvk/api/proto/Initializer;

    move-result-object p1

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/u;->m:Lcom/bykv/vk/openvk/api/proto/Initializer;

    .line 20
    :cond_0
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 21
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/u;->m:Lcom/bykv/vk/openvk/api/proto/Initializer;

    return-object p1
.end method


# virtual methods
.method public m()Lcom/bytedance/sdk/openadsdk/api/vv$p;
    .locals 1

    .line 25
    sget-object v0, Lcom/bytedance/sdk/openadsdk/api/plugin/u;->vv:Lcom/bytedance/sdk/openadsdk/api/plugin/u$vv;

    return-object v0
.end method

.method public m(Landroid/content/Context;Lcom/bykv/vv/vv/vv/vv/a;)V
    .locals 7

    .line 7
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/u;->p:Lcom/bytedance/sdk/openadsdk/api/plugin/i;

    if-nez v0, :cond_0

    const-string v0, "duration"

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/api/plugin/i;->vv(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/api/plugin/i;

    move-result-object v0

    :cond_0
    const-string v1, "wait_asyn_cost"

    .line 8
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/api/plugin/i;->m(Ljava/lang/String;)J

    const/4 v1, 0x0

    .line 9
    :try_start_0
    invoke-direct {p0, v0}, Lcom/bytedance/sdk/openadsdk/api/plugin/u;->vv(Lcom/bytedance/sdk/openadsdk/api/plugin/i;)Lcom/bykv/vk/openvk/api/proto/Initializer;

    move-result-object v2
    :try_end_0
    .catch Lcom/bytedance/sdk/openadsdk/api/plugin/vv; {:try_start_0 .. :try_end_0} :catch_1

    const-string v3, "Init error"

    if-eqz v2, :cond_2

    .line 10
    :try_start_1
    invoke-interface {v2}, Lcom/bykv/vk/openvk/api/proto/Initializer;->getManager()Lcom/bykv/vk/openvk/api/proto/Manager;

    move-result-object v4

    invoke-virtual {p0, v4}, Lcom/bytedance/sdk/openadsdk/api/vv;->vv(Lcom/bykv/vk/openvk/api/proto/Manager;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11
    :try_start_2
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/api/plugin/i;->vv()J

    .line 12
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    const-wide/16 v5, 0x14

    .line 13
    invoke-virtual {v0, v4, v5, v6}, Lcom/bytedance/sdk/openadsdk/api/plugin/i;->vv(Lorg/json/JSONObject;J)V

    const-string v0, "zeus"

    .line 14
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/TTAppContextHolder;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5}, Lcom/bytedance/sdk/openadsdk/api/plugin/o;->vv(Landroid/content/Context;)Lcom/bytedance/sdk/openadsdk/api/plugin/o;

    move-result-object v5

    invoke-virtual {v5}, Lcom/bytedance/sdk/openadsdk/api/plugin/o;->vv()Lorg/json/JSONObject;

    move-result-object v5

    invoke-virtual {v4, v0, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const/16 v0, 0x9

    .line 15
    invoke-virtual {p2, v0, v4}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object p2

    invoke-virtual {p2}, Lcom/bykv/vv/vv/vv/vv/a;->a()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p2

    invoke-interface {v2, p1, p2}, Lcom/bykv/vk/openvk/api/proto/Initializer;->init(Landroid/content/Context;Lcom/bykv/vk/openvk/api/proto/ValueSet;)V

    if-eqz p1, :cond_1

    .line 16
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Landroid/app/Application;

    invoke-static {p1}, Lcom/bytedance/pangle/Zeus;->hookHuaWeiVerifier(Landroid/app/Application;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_1
    return-void

    :catch_0
    move-exception p1

    :try_start_3
    const-string p2, "com.byted.pangle"

    .line 17
    invoke-static {p2}, Lcom/bytedance/pangle/Zeus;->unInstallPlugin(Ljava/lang/String;)V

    .line 18
    invoke-static {}, Lcom/bykv/vv/vv/vv/vv/b;->b()Lcom/bykv/vv/vv/vv/vv/b;

    move-result-object p2

    invoke-virtual {p2, v1}, Lcom/bykv/vv/vv/vv/vv/b;->f(Z)Lcom/bykv/vv/vv/vv/vv/b;

    move-result-object p2

    const/16 v0, 0x106f

    invoke-virtual {p2, v0}, Lcom/bykv/vv/vv/vv/vv/b;->c(I)Lcom/bykv/vv/vv/vv/vv/b;

    move-result-object p2

    invoke-virtual {p2, v3}, Lcom/bykv/vv/vv/vv/vv/b;->e(Ljava/lang/String;)Lcom/bykv/vv/vv/vv/vv/b;

    move-result-object p2

    invoke-virtual {p2}, Lcom/bykv/vv/vv/vv/vv/b;->a()Lcom/bykv/vk/openvk/api/proto/Result;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/bytedance/sdk/openadsdk/api/vv;->m(Lcom/bykv/vk/openvk/api/proto/Result;)V

    .line 19
    throw p1

    .line 20
    :cond_2
    invoke-static {}, Lcom/bykv/vv/vv/vv/vv/b;->b()Lcom/bykv/vv/vv/vv/vv/b;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/bykv/vv/vv/vv/vv/b;->f(Z)Lcom/bykv/vv/vv/vv/vv/b;

    move-result-object p1

    const/16 p2, 0x1069

    invoke-virtual {p1, p2}, Lcom/bykv/vv/vv/vv/vv/b;->c(I)Lcom/bykv/vv/vv/vv/vv/b;

    move-result-object p1

    invoke-virtual {p1, v3}, Lcom/bykv/vv/vv/vv/vv/b;->e(Ljava/lang/String;)Lcom/bykv/vv/vv/vv/vv/b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bykv/vv/vv/vv/vv/b;->a()Lcom/bykv/vk/openvk/api/proto/Result;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/api/vv;->m(Lcom/bykv/vk/openvk/api/proto/Result;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 21
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 22
    invoke-static {}, Lcom/bykv/vv/vv/vv/vv/b;->b()Lcom/bykv/vv/vv/vv/vv/b;

    move-result-object p2

    invoke-virtual {p2, v1}, Lcom/bykv/vv/vv/vv/vv/b;->f(Z)Lcom/bykv/vv/vv/vv/vv/b;

    move-result-object p2

    const/16 v0, 0x106b

    invoke-virtual {p2, v0}, Lcom/bykv/vv/vv/vv/vv/b;->c(I)Lcom/bykv/vv/vv/vv/vv/b;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "UnExpected initializer error :"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/bykv/vv/vv/vv/vv/b;->e(Ljava/lang/String;)Lcom/bykv/vv/vv/vv/vv/b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bykv/vv/vv/vv/vv/b;->a()Lcom/bykv/vk/openvk/api/proto/Result;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/api/vv;->m(Lcom/bykv/vk/openvk/api/proto/Result;)V

    return-void

    :catch_1
    move-exception p1

    .line 23
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 24
    invoke-static {}, Lcom/bykv/vv/vv/vv/vv/b;->b()Lcom/bykv/vv/vv/vv/vv/b;

    move-result-object p2

    invoke-virtual {p2, v1}, Lcom/bykv/vv/vv/vv/vv/b;->f(Z)Lcom/bykv/vv/vv/vv/vv/b;

    move-result-object p2

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/api/plugin/vv;->vv()I

    move-result v0

    invoke-virtual {p2, v0}, Lcom/bykv/vv/vv/vv/vv/b;->c(I)Lcom/bykv/vv/vv/vv/vv/b;

    move-result-object p2

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/bykv/vv/vv/vv/vv/b;->e(Ljava/lang/String;)Lcom/bykv/vv/vv/vv/vv/b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bykv/vv/vv/vv/vv/b;->a()Lcom/bykv/vk/openvk/api/proto/Result;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/api/vv;->m(Lcom/bykv/vk/openvk/api/proto/Result;)V

    return-void
.end method

.method protected m(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/AdConfig;Lcom/bytedance/sdk/openadsdk/TTAdSdk$InitCallback;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/api/vv;->m(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/AdConfig;Lcom/bytedance/sdk/openadsdk/TTAdSdk$InitCallback;)Z

    const-string p1, "duration"

    .line 2
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/api/plugin/i;->vv(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/api/plugin/i;

    move-result-object p1

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/u;->p:Lcom/bytedance/sdk/openadsdk/api/plugin/i;

    .line 3
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/TTAppContextHolder;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/bytedance/android/openliveplugin/process/LiveProcessUtils;->inLiveProcess(Landroid/content/Context;)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    const/4 p3, 0x0

    if-eqz p1, :cond_0

    return p3

    .line 4
    :cond_0
    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/api/plugin/p;->vv(Lcom/bytedance/sdk/openadsdk/AdConfig;)V

    .line 5
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x15

    if-ge p1, p2, :cond_1

    .line 6
    invoke-static {}, Lcom/bykv/vv/vv/vv/vv/b;->b()Lcom/bykv/vv/vv/vv/vv/b;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/bykv/vv/vv/vv/vv/b;->f(Z)Lcom/bykv/vv/vv/vv/vv/b;

    move-result-object p1

    const/16 p2, 0x106c

    invoke-virtual {p1, p2}, Lcom/bykv/vv/vv/vv/vv/b;->c(I)Lcom/bykv/vv/vv/vv/vv/b;

    move-result-object p1

    const-string p2, "Only support >= 5.0"

    invoke-virtual {p1, p2}, Lcom/bykv/vv/vv/vv/vv/b;->e(Ljava/lang/String;)Lcom/bykv/vv/vv/vv/vv/b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bykv/vv/vv/vv/vv/b;->a()Lcom/bykv/vk/openvk/api/proto/Result;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/api/vv;->m(Lcom/bykv/vk/openvk/api/proto/Result;)V

    return p3

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method protected p()Lcom/bytedance/sdk/openadsdk/vv/m;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/u;->i:Lcom/bytedance/sdk/openadsdk/vv/m;

    return-object v0
.end method

.method protected vv(Lcom/bykv/vk/openvk/api/proto/Result;)V
    .locals 3

    .line 2
    invoke-interface {p1}, Lcom/bykv/vk/openvk/api/proto/Result;->isSuccess()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const/4 v0, 0x0

    const-string v1, "action"

    .line 4
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 5
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/TTAdSdk;->getAdManager()Lcom/bytedance/sdk/openadsdk/TTAdManager;

    move-result-object v0

    const-class v1, Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/TTAdManager;->getExtra(Ljava/lang/Class;Landroid/os/Bundle;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/ExecutorService;

    if-eqz p1, :cond_0

    .line 6
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/o/vv;->vv()Lcom/bytedance/sdk/openadsdk/o/vv;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/o/vv;->vv(Ljava/util/concurrent/ExecutorService;)V

    .line 7
    :cond_0
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/api/plugin/p;->vv()V

    return-void

    .line 8
    :cond_1
    invoke-interface {p1}, Lcom/bykv/vk/openvk/api/proto/Result;->code()I

    move-result v0

    invoke-interface {p1}, Lcom/bykv/vk/openvk/api/proto/Result;->message()Ljava/lang/String;

    move-result-object p1

    const-wide/16 v1, 0x0

    invoke-static {v0, p1, v1, v2}, Lcom/bytedance/sdk/openadsdk/api/plugin/p;->vv(ILjava/lang/String;J)V

    return-void
.end method

.method public vv()Z
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/u;->m:Lcom/bykv/vk/openvk/api/proto/Initializer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/u;->m:Lcom/bykv/vk/openvk/api/proto/Initializer;

    invoke-interface {v0}, Lcom/bykv/vk/openvk/api/proto/Initializer;->isInitSuccess()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public vv(Landroid/content/Context;Lcom/bykv/vv/vv/vv/vv/a;)Z
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/u;->m:Lcom/bykv/vk/openvk/api/proto/Initializer;

    if-eqz v0, :cond_0

    .line 13
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/u;->m:Lcom/bykv/vk/openvk/api/proto/Initializer;

    invoke-virtual {p2}, Lcom/bykv/vv/vv/vv/vv/a;->a()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Lcom/bykv/vk/openvk/api/proto/Initializer;->init(Landroid/content/Context;Lcom/bykv/vk/openvk/api/proto/ValueSet;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
