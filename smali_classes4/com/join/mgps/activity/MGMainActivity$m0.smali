.class Lcom/join/mgps/activity/MGMainActivity$m0;
.super Ljava/lang/Object;
.source "MGMainActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/MGMainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/MGMainActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/MGMainActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/MGMainActivity$m0;->b:Lcom/join/mgps/activity/MGMainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    sput-boolean v0, Lcom/MApplication;->E1:Z

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/MGMainActivity$m0;->b:Lcom/join/mgps/activity/MGMainActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/MGMainActivity;->access$200(Lcom/join/mgps/activity/MGMainActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/mgps/activity/MGMainActivity;->access$3000(Lcom/join/mgps/activity/MGMainActivity;Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/MGMainActivity$m0;->b:Lcom/join/mgps/activity/MGMainActivity;

    iget-object v1, v0, Lcom/join/mgps/activity/MGMainActivity;->mHandler:Landroid/os/Handler;

    if-nez v1, :cond_1

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    iput-object v1, v0, Lcom/join/mgps/activity/MGMainActivity;->mHandler:Landroid/os/Handler;

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/MGMainActivity$m0;->b:Lcom/join/mgps/activity/MGMainActivity;

    iget-object v1, v0, Lcom/join/mgps/activity/MGMainActivity;->mHandler:Landroid/os/Handler;

    iget-object v0, v0, Lcom/join/mgps/activity/MGMainActivity;->preloginRunnable:Lcom/join/mgps/activity/MGMainActivity$w0;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
