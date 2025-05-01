.class public final Lcom/bytedance/sdk/openadsdk/vv/p;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/bykv/vk/openvk/api/proto/Bridge;


# static fields
.field private static volatile vv:Lcom/bytedance/sdk/openadsdk/vv/p;


# instance fields
.field private m:Lcom/bytedance/sdk/openadsdk/vv/m;

.field private p:Lcom/bytedance/sdk/openadsdk/vv/vv;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/bytedance/sdk/openadsdk/vv/vv;

    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/vv/vv;-><init>()V

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/vv/p;->p:Lcom/bytedance/sdk/openadsdk/vv/vv;

    return-void
.end method

.method public static vv()Lcom/bytedance/sdk/openadsdk/vv/p;
    .locals 2

    .line 1
    sget-object v0, Lcom/bytedance/sdk/openadsdk/vv/p;->vv:Lcom/bytedance/sdk/openadsdk/vv/p;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/bytedance/sdk/openadsdk/vv/p;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/bytedance/sdk/openadsdk/vv/p;->vv:Lcom/bytedance/sdk/openadsdk/vv/p;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/bytedance/sdk/openadsdk/vv/p;

    invoke-direct {v1}, Lcom/bytedance/sdk/openadsdk/vv/p;-><init>()V

    sput-object v1, Lcom/bytedance/sdk/openadsdk/vv/p;->vv:Lcom/bytedance/sdk/openadsdk/vv/p;

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
    sget-object v0, Lcom/bytedance/sdk/openadsdk/vv/p;->vv:Lcom/bytedance/sdk/openadsdk/vv/p;

    return-object v0
.end method

.method private vv(Lcom/bykv/vk/openvk/api/proto/EventListener;)V
    .locals 2

    .line 8
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/vv/p;->p:Lcom/bytedance/sdk/openadsdk/vv/vv;

    new-instance v1, Lcom/bytedance/sdk/openadsdk/vv/p$1;

    invoke-direct {v1, p0, p1}, Lcom/bytedance/sdk/openadsdk/vv/p$1;-><init>(Lcom/bytedance/sdk/openadsdk/vv/p;Lcom/bykv/vk/openvk/api/proto/EventListener;)V

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/vv/vv;->vv(Lcom/bytedance/sdk/openadsdk/vv/vv$vv;)V

    return-void
.end method


# virtual methods
.method public call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(I",
            "Lcom/bykv/vk/openvk/api/proto/ValueSet;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 1
    :pswitch_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/vv/p;->m:Lcom/bytedance/sdk/openadsdk/vv/m;

    if-nez p1, :cond_0

    return-object v1

    :cond_0
    invoke-interface {p2, v0}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->intValue(I)I

    move-result p2

    invoke-interface {p1, p2}, Lcom/bytedance/sdk/openadsdk/vv/m;->vv(I)Lcom/bykv/vk/openvk/api/proto/Bridge;

    move-result-object p1

    return-object p1

    .line 2
    :pswitch_1
    const-class p1, Ljava/lang/Object;

    invoke-interface {p2, v0, p1}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    .line 3
    instance-of p2, p1, Lcom/bykv/vk/openvk/api/proto/EventListener;

    if-eqz p2, :cond_2

    .line 4
    check-cast p1, Lcom/bykv/vk/openvk/api/proto/EventListener;

    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/vv/p;->vv(Lcom/bykv/vk/openvk/api/proto/EventListener;)V

    goto :goto_0

    .line 5
    :pswitch_2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/vv/p;->m:Lcom/bytedance/sdk/openadsdk/vv/m;

    if-eqz v0, :cond_2

    const/4 v2, 0x4

    .line 6
    invoke-interface {v0, v2}, Lcom/bytedance/sdk/openadsdk/vv/m;->vv(I)Lcom/bykv/vk/openvk/api/proto/Bridge;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 7
    invoke-interface {v0, p1, p2, p3}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    return-object v1

    .line 8
    :pswitch_3
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/TTAppContextHolder;->getContext()Landroid/content/Context;

    move-result-object p1

    return-object p1

    .line 9
    :pswitch_4
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/vv/p;->p:Lcom/bytedance/sdk/openadsdk/vv/vv;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/vv/vv;->vv()Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_0
    return-object v1

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public m()Landroid/app/Application$ActivityLifecycleCallbacks;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/vv/p;->p:Lcom/bytedance/sdk/openadsdk/vv/vv;

    return-object v0
.end method

.method public values()Lcom/bykv/vk/openvk/api/proto/ValueSet;
    .locals 3

    .line 1
    invoke-static {}, Lcom/bykv/vv/vv/vv/vv/a;->b()Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    const/16 v1, 0x2710

    const/4 v2, 0x5

    invoke-virtual {v0, v1, v2}, Lcom/bykv/vv/vv/vv/vv/a;->f(II)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bykv/vv/vv/vv/vv/a;->a()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v0

    return-object v0
.end method

.method public vv(Lcom/bytedance/sdk/openadsdk/vv/m;)V
    .locals 0

    .line 7
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/vv/p;->m:Lcom/bytedance/sdk/openadsdk/vv/m;

    return-void
.end method
