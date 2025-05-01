.class Lcom/bytedance/sdk/openadsdk/o/vv$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/o/vv;->m(Ljava/util/concurrent/ExecutorService;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic vv:Lcom/bytedance/sdk/openadsdk/o/vv;


# direct methods
.method constructor <init>(Lcom/bytedance/sdk/openadsdk/o/vv;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/o/vv$1;->vv:Lcom/bytedance/sdk/openadsdk/o/vv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/o/vv$1;->vv:Lcom/bytedance/sdk/openadsdk/o/vv;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/o/vv;->vv(Lcom/bytedance/sdk/openadsdk/o/vv;)Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "ApiThread"

    if-eqz v0, :cond_0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/o/vv$1;->vv:Lcom/bytedance/sdk/openadsdk/o/vv;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/o/vv;->vv(Lcom/bytedance/sdk/openadsdk/o/vv;)Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/bytedance/sdk/openadsdk/o/vv;->vv(Lcom/bytedance/sdk/openadsdk/o/vv;Ljava/util/concurrent/ThreadPoolExecutor;)V

    const-string v0, "release init pool!"

    .line 3
    invoke-static {v2, v0}, Lcom/bytedance/sdk/openadsdk/api/p;->m(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    const-string v3, "release mInitExecutor failed"

    .line 4
    invoke-static {v2, v3, v0}, Lcom/bytedance/sdk/openadsdk/api/p;->vv(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 5
    :goto_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/o/vv$1;->vv:Lcom/bytedance/sdk/openadsdk/o/vv;

    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/o/vv;->m(Lcom/bytedance/sdk/openadsdk/o/vv;Ljava/util/concurrent/ThreadPoolExecutor;)Ljava/util/concurrent/ThreadPoolExecutor;

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/o/vv$1;->vv:Lcom/bytedance/sdk/openadsdk/o/vv;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/o/vv;->m(Lcom/bytedance/sdk/openadsdk/o/vv;)Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 7
    :try_start_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/o/vv$1;->vv:Lcom/bytedance/sdk/openadsdk/o/vv;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/o/vv;->m(Lcom/bytedance/sdk/openadsdk/o/vv;)Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/bytedance/sdk/openadsdk/o/vv;->vv(Lcom/bytedance/sdk/openadsdk/o/vv;Ljava/util/concurrent/ThreadPoolExecutor;)V

    const-string v0, "release api pool!"

    .line 8
    invoke-static {v2, v0}, Lcom/bytedance/sdk/openadsdk/api/p;->m(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    const-string v3, "release mApiExecutor failed"

    .line 9
    invoke-static {v2, v3, v0}, Lcom/bytedance/sdk/openadsdk/api/p;->vv(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 10
    :goto_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/o/vv$1;->vv:Lcom/bytedance/sdk/openadsdk/o/vv;

    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/o/vv;->p(Lcom/bytedance/sdk/openadsdk/o/vv;Ljava/util/concurrent/ThreadPoolExecutor;)Ljava/util/concurrent/ThreadPoolExecutor;

    :cond_1
    return-void
.end method
