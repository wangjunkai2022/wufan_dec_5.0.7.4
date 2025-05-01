.class Lcom/bytedance/sdk/openadsdk/vv/vv;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/openadsdk/vv/vv$vv;
    }
.end annotation


# static fields
.field private static volatile vv:Z


# instance fields
.field private m:I

.field private p:Lcom/bytedance/sdk/openadsdk/vv/vv$vv;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/vv/vv;->m:I

    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    .line 1
    iget p1, p0, Lcom/bytedance/sdk/openadsdk/vv/vv;->m:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/vv/vv;->m:I

    const/4 p1, 0x0

    .line 2
    sput-boolean p1, Lcom/bytedance/sdk/openadsdk/vv/vv;->vv:Z

    .line 3
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/vv/vv;->p:Lcom/bytedance/sdk/openadsdk/vv/vv$vv;

    if-eqz p1, :cond_0

    .line 4
    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/vv/vv$vv;->m()V

    :cond_0
    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget p1, p0, Lcom/bytedance/sdk/openadsdk/vv/vv;->m:I

    const/4 v0, 0x1

    sub-int/2addr p1, v0

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/vv/vv;->m:I

    if-nez p1, :cond_0

    .line 2
    sput-boolean v0, Lcom/bytedance/sdk/openadsdk/vv/vv;->vv:Z

    .line 3
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/vv/vv;->p:Lcom/bytedance/sdk/openadsdk/vv/vv$vv;

    if-eqz p1, :cond_0

    .line 4
    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/vv/vv$vv;->vv()V

    :cond_0
    return-void
.end method

.method public vv()Ljava/lang/Boolean;
    .locals 1

    .line 1
    sget-boolean v0, Lcom/bytedance/sdk/openadsdk/vv/vv;->vv:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public vv(Lcom/bytedance/sdk/openadsdk/vv/vv$vv;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/vv/vv;->p:Lcom/bytedance/sdk/openadsdk/vv/vv$vv;

    return-void
.end method
