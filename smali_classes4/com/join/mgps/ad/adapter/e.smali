.class public Lcom/join/mgps/ad/adapter/e;
.super Ljava/lang/Object;
.source "TTInit.java"


# static fields
.field private static final a:Ljava/lang/String; = "TTInit"

.field public static b:Z

.field private static c:Landroid/graphics/Point;

.field private static d:Landroid/graphics/Point;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/TTAdConfig;
    .locals 1

    .line 1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;

    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;-><init>()V

    .line 2
    invoke-virtual {v0, p0}, Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;->appId(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;

    move-result-object p0

    const-string v0, "\u609f\u996d\u6e38\u620f\u5385_android"

    .line 3
    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;->appName(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;

    move-result-object p0

    const/4 v0, -0x1

    .line 4
    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;->titleBarTheme(I)Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;

    move-result-object p0

    const/4 v0, 0x3

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    .line 5
    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;->directDownloadNetworkType([I)Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;

    move-result-object p0

    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;->debug(Z)Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;

    move-result-object p0

    const/4 v0, 0x1

    .line 7
    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;->supportMultiProcess(Z)Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;

    move-result-object p0

    .line 8
    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;->useMediation(Z)Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;

    move-result-object p0

    .line 9
    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;->allowShowNotify(Z)Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;

    move-result-object p0

    .line 10
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;->build()Lcom/bytedance/sdk/openadsdk/TTAdConfig;

    move-result-object p0

    return-object p0

    nop

    :array_0
    .array-data 4
        0x4
        0x3
        0x5
    .end array-data
.end method

.method public static b()Landroid/graphics/Point;
    .locals 1

    .line 1
    sget-object v0, Lcom/join/mgps/ad/adapter/e;->c:Landroid/graphics/Point;

    return-object v0
.end method

.method public static c()Landroid/graphics/Point;
    .locals 1

    .line 1
    sget-object v0, Lcom/join/mgps/ad/adapter/e;->d:Landroid/graphics/Point;

    return-object v0
.end method

.method public static d(Landroid/content/Context;Ljava/lang/String;Ls1/a;)V
    .locals 2

    .line 1
    sget-boolean v0, Lcom/join/mgps/ad/adapter/e;->b:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 2
    invoke-static {p0, v0}, Lcom/join/mgps/activity/login/AbScreenUtils;->getScreenSize(Landroid/content/Context;Z)Landroid/graphics/Point;

    move-result-object v1

    sput-object v1, Lcom/join/mgps/ad/adapter/e;->c:Landroid/graphics/Point;

    const/4 v1, 0x0

    .line 3
    invoke-static {p0, v1}, Lcom/join/mgps/activity/login/AbScreenUtils;->getScreenSize(Landroid/content/Context;Z)Landroid/graphics/Point;

    move-result-object v1

    sput-object v1, Lcom/join/mgps/ad/adapter/e;->d:Landroid/graphics/Point;

    .line 4
    invoke-static {p1}, Lcom/join/mgps/ad/adapter/e;->a(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/TTAdConfig;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/bytedance/sdk/openadsdk/TTAdSdk;->init(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/TTAdConfig;)Z

    .line 5
    new-instance p0, Lcom/join/mgps/ad/adapter/e$a;

    invoke-direct {p0}, Lcom/join/mgps/ad/adapter/e$a;-><init>()V

    invoke-static {p0}, Lcom/bytedance/sdk/openadsdk/TTAdSdk;->start(Lcom/bytedance/sdk/openadsdk/TTAdSdk$Callback;)V

    .line 6
    sput-boolean v0, Lcom/join/mgps/ad/adapter/e;->b:Z

    :cond_0
    if-eqz p2, :cond_1

    .line 7
    invoke-interface {p2}, Ls1/a;->a()V

    :cond_1
    return-void
.end method
