.class public final Lcom/bytedance/sdk/openadsdk/live/m;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/bykv/vk/openvk/api/proto/Bridge;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/openadsdk/live/m$m;,
        Lcom/bytedance/sdk/openadsdk/live/m$vv;
    }
.end annotation


# static fields
.field private static final vv:Lcom/bytedance/sdk/openadsdk/live/m;


# instance fields
.field private i:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private m:Lcom/bytedance/sdk/openadsdk/live/ITTLiveTokenInjectionAuth;

.field private volatile o:Lcom/bytedance/sdk/openadsdk/live/m$m;

.field private volatile p:Lcom/bykv/vk/openvk/api/proto/Bridge;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/live/m;

    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/live/m;-><init>()V

    sput-object v0, Lcom/bytedance/sdk/openadsdk/live/m;->vv:Lcom/bytedance/sdk/openadsdk/live/m;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private getContext(Ljava/lang/Object;)Landroid/content/Context;
    .locals 1

    .line 1
    instance-of v0, p1, Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 2
    check-cast p1, Landroid/content/Context;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private i(Ljava/util/Map;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    const-string v2, "expand_method_name"

    .line 1
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 2
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    return-object v0

    .line 3
    :cond_0
    invoke-static {}, Lcom/bytedance/android/openliveplugin/LivePluginHelper;->getLiveRoomService()Lcom/bytedance/android/live/base/api/IOuterLiveService;

    move-result-object v3

    const-string v4, "expand_method_param"

    .line 4
    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Object;

    if-eqz p1, :cond_1

    .line 5
    invoke-interface {v3, v2, p1}, Lcom/bytedance/android/live/base/api/IOuterLiveRoomService;->callExpandMethod(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-array p1, v1, [Ljava/lang/Object;

    .line 6
    invoke-interface {v3, v2, p1}, Lcom/bytedance/android/live/base/api/IOuterLiveRoomService;->callExpandMethod(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v1

    const-string p1, "TTLiveSDkBridge"

    .line 7
    invoke-static {p1, v2}, Lcom/bytedance/sdk/openadsdk/api/p;->m(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0
.end method

.method static synthetic m(Lcom/bytedance/sdk/openadsdk/live/m;)Lcom/bytedance/sdk/openadsdk/live/m$m;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/live/m;->o:Lcom/bytedance/sdk/openadsdk/live/m$m;

    return-object p0
.end method

.method private m(Ljava/util/Map;)V
    .locals 5

    const-string v0, "debug"

    .line 2
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 3
    new-instance v1, Lcom/bytedance/android/live/base/api/ILiveHostContextParam$Builder;

    invoke-direct {v1}, Lcom/bytedance/android/live/base/api/ILiveHostContextParam$Builder;-><init>()V

    const-string v2, "app_name"

    .line 4
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 5
    invoke-virtual {v1, v2}, Lcom/bytedance/android/live/base/api/ILiveHostContextParam$Builder;->setAppName(Ljava/lang/String;)Lcom/bytedance/android/live/base/api/ILiveHostContextParam$Builder;

    move-result-object v1

    const-string v2, "channel"

    .line 6
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/bytedance/android/live/base/api/ILiveHostContextParam$Builder;->setChannel(Ljava/lang/String;)Lcom/bytedance/android/live/base/api/ILiveHostContextParam$Builder;

    move-result-object v1

    .line 7
    invoke-virtual {v1, v0}, Lcom/bytedance/android/live/base/api/ILiveHostContextParam$Builder;->setIsDebug(Z)Lcom/bytedance/android/live/base/api/ILiveHostContextParam$Builder;

    move-result-object v0

    const-string v1, "ec_host_appid"

    .line 8
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bytedance/android/live/base/api/ILiveHostContextParam$Builder;->setECHostAppId(Ljava/lang/String;)Lcom/bytedance/android/live/base/api/ILiveHostContextParam$Builder;

    move-result-object v0

    const-string v1, "partner"

    .line 9
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bytedance/android/live/base/api/ILiveHostContextParam$Builder;->setPartner(Ljava/lang/String;)Lcom/bytedance/android/live/base/api/ILiveHostContextParam$Builder;

    move-result-object v0

    new-instance v1, Lcom/bytedance/sdk/openadsdk/live/m$1;

    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/live/m$1;-><init>(Lcom/bytedance/sdk/openadsdk/live/m;)V

    .line 10
    invoke-virtual {v0, v1}, Lcom/bytedance/android/live/base/api/ILiveHostContextParam$Builder;->provideMethodChannel(Lcom/bytedance/android/live/base/api/MethodChannelService;)Lcom/bytedance/android/live/base/api/ILiveHostContextParam$Builder;

    move-result-object v0

    const-string v1, "p_secret"

    .line 11
    invoke-virtual {v0, v1}, Lcom/bytedance/android/live/base/api/ILiveHostContextParam$Builder;->setPartnerSecret(Ljava/lang/String;)Lcom/bytedance/android/live/base/api/ILiveHostContextParam$Builder;

    move-result-object v0

    new-instance v1, Lcom/bytedance/sdk/openadsdk/live/core/TTHostPermissionInner;

    .line 12
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/live/m;->p(Ljava/util/Map;)Lcom/bytedance/sdk/openadsdk/TTCustomController;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/bytedance/sdk/openadsdk/live/core/TTHostPermissionInner;-><init>(Lcom/bytedance/sdk/openadsdk/TTCustomController;)V

    invoke-virtual {v0, v1}, Lcom/bytedance/android/live/base/api/ILiveHostContextParam$Builder;->setHostPermission(Lcom/bytedance/android/live/base/api/IHostPermission;)Lcom/bytedance/android/live/base/api/ILiveHostContextParam$Builder;

    move-result-object v0

    new-instance v1, Lcom/bytedance/sdk/openadsdk/live/core/vv;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/live/m;->p:Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-direct {v1, v2}, Lcom/bytedance/sdk/openadsdk/live/core/vv;-><init>(Lcom/bykv/vk/openvk/api/proto/Bridge;)V

    .line 13
    invoke-virtual {v0, v1}, Lcom/bytedance/android/live/base/api/ILiveHostContextParam$Builder;->setHostActionParam(Lcom/bytedance/android/live/base/api/ILiveHostActionParam;)Lcom/bytedance/android/live/base/api/ILiveHostContextParam$Builder;

    move-result-object v0

    .line 14
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/live/m;->m:Lcom/bytedance/sdk/openadsdk/live/ITTLiveTokenInjectionAuth;

    if-eqz v1, :cond_0

    .line 15
    new-instance v2, Lcom/bytedance/sdk/openadsdk/live/core/m;

    invoke-direct {v2, v1}, Lcom/bytedance/sdk/openadsdk/live/core/m;-><init>(Lcom/bytedance/sdk/openadsdk/live/ITTLiveTokenInjectionAuth;)V

    invoke-virtual {v0, v2}, Lcom/bytedance/android/live/base/api/ILiveHostContextParam$Builder;->setInjectionAuth(Lcom/bytedance/android/livehostapi/platform/IHostTokenInjectionAuth;)Lcom/bytedance/android/live/base/api/ILiveHostContextParam$Builder;

    .line 16
    :cond_0
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/live/m;->i:Ljava/util/Map;

    if-eqz v1, :cond_1

    .line 17
    invoke-virtual {v0, v1}, Lcom/bytedance/android/live/base/api/ILiveHostContextParam$Builder;->addHostInitExtra(Ljava/util/Map;)Lcom/bytedance/android/live/base/api/ILiveHostContextParam$Builder;

    .line 18
    :cond_1
    new-instance v1, Lcom/bytedance/sdk/openadsdk/live/m$2;

    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/live/m$2;-><init>(Lcom/bytedance/sdk/openadsdk/live/m;)V

    .line 19
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/TTAppContextHolder;->getContext()Landroid/content/Context;

    move-result-object v2

    instance-of v2, v2, Landroid/app/Application;

    if-eqz v2, :cond_2

    .line 20
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/TTAppContextHolder;->getContext()Landroid/content/Context;

    move-result-object v2

    check-cast v2, Landroid/app/Application;

    invoke-virtual {v0, v2}, Lcom/bytedance/android/live/base/api/ILiveHostContextParam$Builder;->setContext(Landroid/app/Application;)Lcom/bytedance/android/live/base/api/ILiveHostContextParam$Builder;

    :cond_2
    const-string v2, "sub_process"

    .line 21
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 22
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    .line 23
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/TTAppContextHolder;->getContext()Landroid/content/Context;

    move-result-object v3

    const-string v4, "g_appid"

    .line 24
    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 25
    invoke-static {v3, p1, v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/live/vv;->vv(Landroid/content/Context;Ljava/lang/String;Lcom/bytedance/android/live/base/api/ILiveHostContextParam$Builder;Lcom/bytedance/android/live/base/api/ILiveInitCallback;Z)Z

    move-result p1

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    const-string v3, "execute live sdk initLive method end, (\u65b9\u6cd5\u987a\u5229\u6267\u884c\u7ed3\u679c)result: "

    aput-object v3, v0, v1

    const/4 v1, 0x1

    .line 26
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    aput-object p1, v0, v1

    const/4 p1, 0x2

    const-string v1, " subProcess="

    aput-object v1, v0, p1

    const/4 p1, 0x3

    .line 27
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    aput-object v1, v0, p1

    const-string p1, "TTLiveSDkBridge"

    .line 28
    invoke-static {p1, v0}, Lcom/bytedance/sdk/openadsdk/api/p;->vv(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private o(Ljava/util/Map;)Ljava/lang/Boolean;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    :try_start_0
    const-string v0, "scheme_uri"

    .line 1
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :cond_0
    const-string v1, "context"

    .line 4
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/live/m;->getContext(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object p1

    .line 5
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_2

    if-nez p1, :cond_1

    goto :goto_0

    .line 6
    :cond_1
    invoke-static {p1, v0}, Lcom/bytedance/sdk/openadsdk/live/vv;->vv(Landroid/content/Context;Landroid/net/Uri;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 7
    :cond_2
    :goto_0
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "TTLiveSDkBridge"

    .line 8
    invoke-static {p1, v0}, Lcom/bytedance/sdk/openadsdk/api/p;->m(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 9
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1
.end method

.method private p(Ljava/util/Map;)Lcom/bytedance/sdk/openadsdk/TTCustomController;
    .locals 1

    const-string v0, "c_control"

    .line 1
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 2
    instance-of v0, p1, Lcom/bykv/vk/openvk/api/proto/Bridge;

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Lcom/bytedance/sdk/openadsdk/p/vv/vv/wv;

    check-cast p1, Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-direct {v0, p1}, Lcom/bytedance/sdk/openadsdk/p/vv/vv/wv;-><init>(Lcom/bykv/vk/openvk/api/proto/Bridge;)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private vv(Ljava/lang/Object;)Landroid/os/Bundle;
    .locals 1

    .line 17
    instance-of v0, p1, Landroid/os/Bundle;

    if-eqz v0, :cond_0

    .line 18
    check-cast p1, Landroid/os/Bundle;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public static vv(Lcom/bytedance/sdk/openadsdk/live/ILiveAdCustomConfig;)Lcom/bykv/vk/openvk/api/proto/Bridge;
    .locals 1

    .line 6
    new-instance v0, Lcom/bytedance/sdk/openadsdk/live/m$vv;

    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/live/m$vv;-><init>(Lcom/bytedance/sdk/openadsdk/live/ILiveAdCustomConfig;)V

    return-object v0
.end method

.method static synthetic vv(Lcom/bytedance/sdk/openadsdk/live/m;)Lcom/bykv/vk/openvk/api/proto/Bridge;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/live/m;->p:Lcom/bykv/vk/openvk/api/proto/Bridge;

    return-object p0
.end method

.method static synthetic vv(Lcom/bytedance/sdk/openadsdk/live/m;Lcom/bytedance/sdk/openadsdk/live/ITTLiveTokenInjectionAuth;)Lcom/bytedance/sdk/openadsdk/live/ITTLiveTokenInjectionAuth;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/live/m;->m:Lcom/bytedance/sdk/openadsdk/live/ITTLiveTokenInjectionAuth;

    return-object p1
.end method

.method public static vv()Lcom/bytedance/sdk/openadsdk/live/m;
    .locals 1

    .line 5
    sget-object v0, Lcom/bytedance/sdk/openadsdk/live/m;->vv:Lcom/bytedance/sdk/openadsdk/live/m;

    return-object v0
.end method

.method static synthetic vv(Lcom/bytedance/sdk/openadsdk/live/m;Ljava/util/Map;)Ljava/util/Map;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/live/m;->i:Ljava/util/Map;

    return-object p1
.end method

.method static synthetic vv(Lcom/bytedance/sdk/openadsdk/live/m;Z)Ljava/util/Map;
    .locals 0

    .line 4
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/live/m;->vv(Z)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private vv(Z)Ljava/util/Map;
    .locals 2

    .line 19
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 20
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const-string v1, "onlyUpdateState"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 9
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

    .line 1
    const-class v0, Lcom/bykv/vk/openvk/api/proto/Bridge;

    const/4 v1, 0x5

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eq p1, v1, :cond_5

    const/16 v1, 0x9

    if-eq p1, v1, :cond_0

    .line 2
    const-class v0, Ljava/util/Map;

    invoke-interface {p2, v3, v0}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map;

    invoke-virtual {p0, p3, p1, p2}, Lcom/bytedance/sdk/openadsdk/live/m;->vv(Ljava/lang/Class;ILjava/util/Map;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    invoke-interface {p2, v3, v0}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/bykv/vk/openvk/api/proto/Bridge;

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/live/m;->p:Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 4
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/live/m;->o:Lcom/bytedance/sdk/openadsdk/live/m$m;

    const/4 p2, 0x1

    if-eqz p1, :cond_3

    .line 5
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/live/m;->o:Lcom/bytedance/sdk/openadsdk/live/m$m;

    iget p1, p1, Lcom/bytedance/sdk/openadsdk/live/m$m;->vv:I

    const/4 p3, 0x2

    if-eq p1, p3, :cond_2

    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/live/m;->o:Lcom/bytedance/sdk/openadsdk/live/m$m;

    iget p1, p1, Lcom/bytedance/sdk/openadsdk/live/m$m;->vv:I

    const/4 p3, -0x3

    if-ne p1, p3, :cond_1

    goto :goto_0

    .line 6
    :cond_1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/live/m;->o:Lcom/bytedance/sdk/openadsdk/live/m$m;

    iget p1, p1, Lcom/bytedance/sdk/openadsdk/live/m$m;->vv:I

    if-eqz p1, :cond_4

    .line 7
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/live/m;->o:Lcom/bytedance/sdk/openadsdk/live/m$m;

    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/live/m;->o:Lcom/bytedance/sdk/openadsdk/live/m$m;

    iget v4, p1, Lcom/bytedance/sdk/openadsdk/live/m$m;->vv:I

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-static/range {v3 .. v8}, Lcom/bytedance/sdk/openadsdk/live/m$m;->vv(Lcom/bytedance/sdk/openadsdk/live/m$m;ILjava/lang/ClassLoader;Landroid/content/res/Resources;Landroid/os/Bundle;Z)V

    goto :goto_1

    .line 8
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/live/m;->o:Lcom/bytedance/sdk/openadsdk/live/m$m;

    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/live/m;->o:Lcom/bytedance/sdk/openadsdk/live/m$m;

    iget p3, p3, Lcom/bytedance/sdk/openadsdk/live/m$m;->vv:I

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/live/m;->o:Lcom/bytedance/sdk/openadsdk/live/m$m;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/live/m$m;->m:Ljava/lang/String;

    invoke-static {p1, p3, v0, p2}, Lcom/bytedance/sdk/openadsdk/live/m$m;->vv(Lcom/bytedance/sdk/openadsdk/live/m$m;ILjava/lang/String;Z)V

    goto :goto_1

    .line 9
    :cond_3
    new-instance p1, Lcom/bytedance/sdk/openadsdk/live/m$m;

    invoke-direct {p1, p0, v2}, Lcom/bytedance/sdk/openadsdk/live/m$m;-><init>(Lcom/bytedance/sdk/openadsdk/live/m;Lcom/bytedance/sdk/openadsdk/live/m$1;)V

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/live/m;->o:Lcom/bytedance/sdk/openadsdk/live/m$m;

    .line 10
    invoke-static {p2}, Lcom/bykv/vv/vv/vv/vv/a;->c(I)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object p1

    const/4 p3, 0x4

    invoke-virtual {p1, v3, p3}, Lcom/bykv/vv/vv/vv/vv/a;->f(II)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lcom/bykv/vv/vv/vv/vv/a;->a()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p1

    .line 12
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/vv/p;->vv()Lcom/bytedance/sdk/openadsdk/vv/p;

    move-result-object p3

    const/16 v1, 0xa

    invoke-virtual {p3, v1, p1, v0}, Lcom/bytedance/sdk/openadsdk/vv/p;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 13
    invoke-static {p2}, Lcom/bykv/vv/vv/vv/vv/a;->c(I)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object p2

    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/live/m;->o:Lcom/bytedance/sdk/openadsdk/live/m$m;

    invoke-virtual {p2, v3, p3}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object p2

    invoke-virtual {p2}, Lcom/bykv/vv/vv/vv/vv/a;->a()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p2

    if-eqz p1, :cond_4

    const/16 p3, 0x6a

    .line 14
    const-class v0, Ljava/lang/Void;

    invoke-interface {p1, p3, p2, v0}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    :cond_4
    :goto_1
    return-object v2

    .line 15
    :cond_5
    const-class p1, Ljava/util/Map;

    invoke-interface {p2, v3, p1}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/live/m;->m(Ljava/util/Map;)V

    return-object v2
.end method

.method public values()Lcom/bykv/vk/openvk/api/proto/ValueSet;
    .locals 3

    .line 1
    invoke-static {}, Lcom/bykv/vv/vv/vv/vv/a;->b()Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    const/16 v1, 0x2710

    const/4 v2, 0x2

    .line 2
    invoke-virtual {v0, v1, v2}, Lcom/bykv/vv/vv/vv/vv/a;->f(II)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lcom/bykv/vv/vv/vv/vv/a;->a()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v0

    return-object v0
.end method

.method public vv(Ljava/lang/Class;ILjava/util/Map;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)TT;"
        }
    .end annotation

    if-eqz p2, :cond_2

    const/4 p1, 0x7

    if-eq p2, p1, :cond_1

    const/16 p1, 0x8

    if-eq p2, p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 10
    :cond_0
    invoke-direct {p0, p3}, Lcom/bytedance/sdk/openadsdk/live/m;->o(Ljava/util/Map;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 11
    :cond_1
    invoke-direct {p0, p3}, Lcom/bytedance/sdk/openadsdk/live/m;->i(Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    const-string p1, "context"

    .line 12
    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/live/m;->getContext(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object p1

    const-string p2, "bundle"

    .line 13
    invoke-interface {p3, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-direct {p0, p2}, Lcom/bytedance/sdk/openadsdk/live/m;->vv(Ljava/lang/Object;)Landroid/os/Bundle;

    move-result-object p2

    .line 14
    invoke-static {p1, p2}, Lcom/bytedance/sdk/openadsdk/live/vv;->vv(Landroid/content/Context;Landroid/os/Bundle;)Z

    move-result p1

    if-nez p1, :cond_3

    const/4 p1, 0x2

    .line 15
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_3
    const/4 p1, 0x0

    .line 16
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public vv(Lcom/bytedance/sdk/openadsdk/live/ITTLiveTokenInjectionAuth;)V
    .locals 0

    .line 7
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/live/m;->m:Lcom/bytedance/sdk/openadsdk/live/ITTLiveTokenInjectionAuth;

    return-void
.end method

.method public vv(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 8
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 9
    :cond_0
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/live/m;->i:Ljava/util/Map;

    :cond_1
    :goto_0
    return-void
.end method
