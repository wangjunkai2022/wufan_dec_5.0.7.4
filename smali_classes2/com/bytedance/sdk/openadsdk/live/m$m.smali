.class final Lcom/bytedance/sdk/openadsdk/live/m$m;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/TTPluginListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/sdk/openadsdk/live/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "m"
.end annotation


# instance fields
.field m:Ljava/lang/String;

.field final synthetic p:Lcom/bytedance/sdk/openadsdk/live/m;

.field vv:I


# direct methods
.method private constructor <init>(Lcom/bytedance/sdk/openadsdk/live/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/live/m$m;->p:Lcom/bytedance/sdk/openadsdk/live/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/bytedance/sdk/openadsdk/live/m;Lcom/bytedance/sdk/openadsdk/live/m$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/live/m$m;-><init>(Lcom/bytedance/sdk/openadsdk/live/m;)V

    return-void
.end method

.method private vv(ILjava/lang/ClassLoader;Landroid/content/res/Resources;Landroid/os/Bundle;Z)V
    .locals 3

    .line 3
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/live/m$m;->vv:I

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/live/m$m;->p:Lcom/bytedance/sdk/openadsdk/live/m;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/live/m;->vv(Lcom/bytedance/sdk/openadsdk/live/m;)Lcom/bykv/vk/openvk/api/proto/Bridge;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/live/m$m;->p:Lcom/bytedance/sdk/openadsdk/live/m;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/live/m;->vv(Lcom/bytedance/sdk/openadsdk/live/m;)Lcom/bykv/vk/openvk/api/proto/Bridge;

    move-result-object v0

    .line 6
    invoke-static {}, Lcom/bykv/vv/vv/vv/vv/a;->b()Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2, p1}, Lcom/bykv/vv/vv/vv/vv/a;->f(II)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object p1

    const/4 v1, 0x1

    .line 7
    invoke-virtual {p1, v1, p2}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object p1

    const/4 p2, 0x2

    invoke-virtual {p1, p2, p3}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object p1

    const/4 p2, 0x3

    invoke-virtual {p1, p2, p4}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object p1

    const/4 p3, 0x4

    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/live/m$m;->p:Lcom/bytedance/sdk/openadsdk/live/m;

    .line 8
    invoke-static {p4, p5}, Lcom/bytedance/sdk/openadsdk/live/m;->vv(Lcom/bytedance/sdk/openadsdk/live/m;Z)Ljava/util/Map;

    move-result-object p4

    invoke-virtual {p1, p3, p4}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bykv/vv/vv/vv/vv/a;->a()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p1

    const/4 p3, 0x0

    .line 9
    invoke-interface {v0, p2, p1, p3}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private vv(ILjava/lang/String;Z)V
    .locals 2

    .line 10
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/live/m$m;->vv:I

    .line 11
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/live/m$m;->m:Ljava/lang/String;

    .line 12
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/live/m$m;->p:Lcom/bytedance/sdk/openadsdk/live/m;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/live/m;->vv(Lcom/bytedance/sdk/openadsdk/live/m;)Lcom/bykv/vk/openvk/api/proto/Bridge;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 13
    invoke-static {}, Lcom/bykv/vv/vv/vv/vv/a;->b()Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lcom/bykv/vv/vv/vv/vv/a;->f(II)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object p1

    if-eqz p2, :cond_0

    const/4 v0, 0x1

    .line 14
    invoke-virtual {p1, v0, p2}, Lcom/bykv/vv/vv/vv/vv/a;->i(ILjava/lang/String;)Lcom/bykv/vv/vv/vv/vv/a;

    .line 15
    :cond_0
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/live/m$m;->p:Lcom/bytedance/sdk/openadsdk/live/m;

    invoke-static {p2, p3}, Lcom/bytedance/sdk/openadsdk/live/m;->vv(Lcom/bytedance/sdk/openadsdk/live/m;Z)Ljava/util/Map;

    move-result-object p2

    const/4 p3, 0x2

    invoke-virtual {p1, p3, p2}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    .line 16
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/live/m$m;->p:Lcom/bytedance/sdk/openadsdk/live/m;

    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/live/m;->vv(Lcom/bytedance/sdk/openadsdk/live/m;)Lcom/bykv/vk/openvk/api/proto/Bridge;

    move-result-object p2

    invoke-virtual {p1}, Lcom/bykv/vv/vv/vv/vv/a;->a()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p2, p3, p1, v0}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method static synthetic vv(Lcom/bytedance/sdk/openadsdk/live/m$m;ILjava/lang/ClassLoader;Landroid/content/res/Resources;Landroid/os/Bundle;Z)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/bytedance/sdk/openadsdk/live/m$m;->vv(ILjava/lang/ClassLoader;Landroid/content/res/Resources;Landroid/os/Bundle;Z)V

    return-void
.end method

.method static synthetic vv(Lcom/bytedance/sdk/openadsdk/live/m$m;ILjava/lang/String;Z)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/live/m$m;->vv(ILjava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public config()Landroid/os/Bundle;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public onPluginListener(ILjava/lang/ClassLoader;Landroid/content/res/Resources;Landroid/os/Bundle;)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 1
    invoke-direct/range {v0 .. v5}, Lcom/bytedance/sdk/openadsdk/live/m$m;->vv(ILjava/lang/ClassLoader;Landroid/content/res/Resources;Landroid/os/Bundle;Z)V

    return-void
.end method

.method public packageName()Ljava/lang/String;
    .locals 1

    const-string v0, "com.byted.live.lite"

    return-object v0
.end method
