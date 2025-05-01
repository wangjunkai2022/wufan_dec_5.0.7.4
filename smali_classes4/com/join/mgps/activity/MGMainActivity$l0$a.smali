.class Lcom/join/mgps/activity/MGMainActivity$l0$a;
.super Lcom/netease/nis/quicklogin/listener/QuickLoginPreMobileListener;
.source "MGMainActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/MGMainActivity$l0;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/MGMainActivity$l0;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/MGMainActivity$l0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/MGMainActivity$l0$a;->a:Lcom/join/mgps/activity/MGMainActivity$l0;

    invoke-direct {p0}, Lcom/netease/nis/quicklogin/listener/QuickLoginPreMobileListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onGetMobileNumberError(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    const/4 p1, 0x0

    .line 1
    sput-boolean p1, Lcom/MApplication;->E1:Z

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/MGMainActivity$l0$a;->a:Lcom/join/mgps/activity/MGMainActivity$l0;

    iget-object p1, p1, Lcom/join/mgps/activity/MGMainActivity$l0;->c:Lcom/join/mgps/activity/MGMainActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/MGMainActivity;->access$2600(Lcom/join/mgps/activity/MGMainActivity;)I

    move-result p1

    if-lez p1, :cond_1

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/MGMainActivity$l0$a;->a:Lcom/join/mgps/activity/MGMainActivity$l0;

    iget-object p1, p1, Lcom/join/mgps/activity/MGMainActivity$l0;->c:Lcom/join/mgps/activity/MGMainActivity;

    iget-object p2, p1, Lcom/join/mgps/activity/MGMainActivity;->mHandler:Landroid/os/Handler;

    if-nez p2, :cond_0

    new-instance p2, Landroid/os/Handler;

    invoke-direct {p2}, Landroid/os/Handler;-><init>()V

    iput-object p2, p1, Lcom/join/mgps/activity/MGMainActivity;->mHandler:Landroid/os/Handler;

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/MGMainActivity$l0$a;->a:Lcom/join/mgps/activity/MGMainActivity$l0;

    iget-object p1, p1, Lcom/join/mgps/activity/MGMainActivity$l0;->c:Lcom/join/mgps/activity/MGMainActivity;

    iget-object p2, p1, Lcom/join/mgps/activity/MGMainActivity;->mHandler:Landroid/os/Handler;

    iget-object p1, p1, Lcom/join/mgps/activity/MGMainActivity;->preloginRunnable:Lcom/join/mgps/activity/MGMainActivity$w0;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_1
    return-void
.end method

.method public onGetMobileNumberSuccess(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/MGMainActivity$l0$a;->a:Lcom/join/mgps/activity/MGMainActivity$l0;

    iget-object p1, p1, Lcom/join/mgps/activity/MGMainActivity$l0;->c:Lcom/join/mgps/activity/MGMainActivity;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {p1, v0, v1}, Lcom/join/mgps/activity/MGMainActivity;->access$2802(Lcom/join/mgps/activity/MGMainActivity;J)J

    const/4 p1, 0x1

    .line 2
    sput-boolean p1, Lcom/MApplication;->E1:Z

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/MGMainActivity$l0$a;->a:Lcom/join/mgps/activity/MGMainActivity$l0;

    invoke-static {p1}, Lcom/join/mgps/activity/MGMainActivity$l0;->a(Lcom/join/mgps/activity/MGMainActivity$l0;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/MGMainActivity$l0$a;->a:Lcom/join/mgps/activity/MGMainActivity$l0;

    iget-object p1, p1, Lcom/join/mgps/activity/MGMainActivity$l0;->c:Lcom/join/mgps/activity/MGMainActivity;

    invoke-virtual {p1}, Lcom/join/mgps/activity/MGMainActivity;->goToOnekeyLogin()V

    :cond_0
    return-void
.end method
