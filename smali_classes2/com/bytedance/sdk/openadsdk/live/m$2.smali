.class Lcom/bytedance/sdk/openadsdk/live/m$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/bytedance/android/live/base/api/ILiveInitCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/live/m;->m(Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic vv:Lcom/bytedance/sdk/openadsdk/live/m;


# direct methods
.method constructor <init>(Lcom/bytedance/sdk/openadsdk/live/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/live/m$2;->vv:Lcom/bytedance/sdk/openadsdk/live/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLiveInitFailed(Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "onLiveInitFailed! "

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    aput-object p1, v0, v1

    const-string v1, "TTLiveSDkBridge"

    .line 1
    invoke-static {v1, v0}, Lcom/bytedance/sdk/openadsdk/api/p;->vv(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/live/m$2;->vv:Lcom/bytedance/sdk/openadsdk/live/m;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/live/m;->m(Lcom/bytedance/sdk/openadsdk/live/m;)Lcom/bytedance/sdk/openadsdk/live/m$m;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/live/m$2;->vv:Lcom/bytedance/sdk/openadsdk/live/m;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/live/m;->m(Lcom/bytedance/sdk/openadsdk/live/m;)Lcom/bytedance/sdk/openadsdk/live/m$m;

    move-result-object v0

    const/4 v1, -0x3

    invoke-static {v0, v1, p1, v2}, Lcom/bytedance/sdk/openadsdk/live/m$m;->vv(Lcom/bytedance/sdk/openadsdk/live/m$m;ILjava/lang/String;Z)V

    :cond_0
    return-void
.end method

.method public onLiveInitFinish()V
    .locals 4

    const-string v0, "TTLiveSDkBridge"

    const-string v1, "onLiveInitFinish!"

    .line 1
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/api/p;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/live/vv;->vv()Z

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/live/m$2;->vv:Lcom/bytedance/sdk/openadsdk/live/m;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/live/m;->m(Lcom/bytedance/sdk/openadsdk/live/m;)Lcom/bytedance/sdk/openadsdk/live/m$m;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/live/m$2;->vv:Lcom/bytedance/sdk/openadsdk/live/m;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/live/m;->m(Lcom/bytedance/sdk/openadsdk/live/m;)Lcom/bytedance/sdk/openadsdk/live/m$m;

    move-result-object v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v2, v1, v3}, Lcom/bytedance/sdk/openadsdk/live/m$m;->vv(Lcom/bytedance/sdk/openadsdk/live/m$m;ILjava/lang/String;Z)V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/live/m$2;->vv:Lcom/bytedance/sdk/openadsdk/live/m;

    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/live/m;->vv(Lcom/bytedance/sdk/openadsdk/live/m;Ljava/util/Map;)Ljava/util/Map;

    .line 6
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/live/m$2;->vv:Lcom/bytedance/sdk/openadsdk/live/m;

    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/live/m;->vv(Lcom/bytedance/sdk/openadsdk/live/m;Lcom/bytedance/sdk/openadsdk/live/ITTLiveTokenInjectionAuth;)Lcom/bytedance/sdk/openadsdk/live/ITTLiveTokenInjectionAuth;

    return-void
.end method
