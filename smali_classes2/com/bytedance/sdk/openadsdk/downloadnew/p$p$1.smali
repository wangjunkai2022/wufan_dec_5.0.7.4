.class Lcom/bytedance/sdk/openadsdk/downloadnew/p$p$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/downloadnew/core/ITTPermissionCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/downloadnew/p$p;->vv(Landroid/app/Activity;[Ljava/lang/String;Lcom/ss/android/download/api/config/x;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/bytedance/sdk/openadsdk/downloadnew/p$p;

.field final synthetic vv:Lcom/ss/android/download/api/config/x;


# direct methods
.method constructor <init>(Lcom/bytedance/sdk/openadsdk/downloadnew/p$p;Lcom/ss/android/download/api/config/x;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/p$p$1;->m:Lcom/bytedance/sdk/openadsdk/downloadnew/p$p;

    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/p$p$1;->vv:Lcom/ss/android/download/api/config/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDenied(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/p$p$1;->vv:Lcom/ss/android/download/api/config/x;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Lcom/ss/android/download/api/config/x;->vv(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onGranted()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/p$p$1;->vv:Lcom/ss/android/download/api/config/x;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/config/x;->vv()V

    :cond_0
    return-void
.end method
