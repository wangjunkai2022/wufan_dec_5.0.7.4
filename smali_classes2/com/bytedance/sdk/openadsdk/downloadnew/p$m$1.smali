.class Lcom/bytedance/sdk/openadsdk/downloadnew/p$m$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/downloadnew/core/ITTHttpCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/downloadnew/p$m;->vv(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/ss/android/download/api/config/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/bytedance/sdk/openadsdk/downloadnew/p$m;

.field final synthetic vv:Lcom/ss/android/download/api/config/g;


# direct methods
.method constructor <init>(Lcom/bytedance/sdk/openadsdk/downloadnew/p$m;Lcom/ss/android/download/api/config/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/p$m$1;->m:Lcom/bytedance/sdk/openadsdk/downloadnew/p$m;

    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/p$m$1;->vv:Lcom/ss/android/download/api/config/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/p$m$1;->vv:Lcom/ss/android/download/api/config/g;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Lcom/ss/android/download/api/config/g;->vv(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public onResponse(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/p$m$1;->vv:Lcom/ss/android/download/api/config/g;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Lcom/ss/android/download/api/config/g;->vv(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
