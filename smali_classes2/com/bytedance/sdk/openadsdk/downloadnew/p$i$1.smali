.class Lcom/bytedance/sdk/openadsdk/downloadnew/p$i$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/downloadnew/core/IDialogStatusChangedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/downloadnew/p$i;->p(Lcom/ss/android/download/api/model/m;)Lcom/bytedance/sdk/openadsdk/downloadnew/core/DialogBuilder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/bytedance/sdk/openadsdk/downloadnew/p$i;

.field final synthetic vv:Lcom/ss/android/download/api/model/m;


# direct methods
.method constructor <init>(Lcom/bytedance/sdk/openadsdk/downloadnew/p$i;Lcom/ss/android/download/api/model/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/p$i$1;->m:Lcom/bytedance/sdk/openadsdk/downloadnew/p$i;

    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/p$i$1;->vv:Lcom/ss/android/download/api/model/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/p$i$1;->vv:Lcom/ss/android/download/api/model/m;

    iget-object v0, v0, Lcom/ss/android/download/api/model/m;->qv:Lcom/ss/android/download/api/model/m$m;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Lcom/ss/android/download/api/model/m$m;->p(Landroid/content/DialogInterface;)V

    :cond_0
    return-void
.end method

.method public onNegativeBtnClick(Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/p$i$1;->vv:Lcom/ss/android/download/api/model/m;

    iget-object v0, v0, Lcom/ss/android/download/api/model/m;->qv:Lcom/ss/android/download/api/model/m$m;

    if-eqz v0, :cond_0

    .line 2
    :try_start_0
    invoke-interface {v0, p1}, Lcom/ss/android/download/api/model/m$m;->m(Landroid/content/DialogInterface;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 3
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    return-void
.end method

.method public onPositiveBtnClick(Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/p$i$1;->vv:Lcom/ss/android/download/api/model/m;

    iget-object v0, v0, Lcom/ss/android/download/api/model/m;->qv:Lcom/ss/android/download/api/model/m$m;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Lcom/ss/android/download/api/model/m$m;->vv(Landroid/content/DialogInterface;)V

    :cond_0
    return-void
.end method
