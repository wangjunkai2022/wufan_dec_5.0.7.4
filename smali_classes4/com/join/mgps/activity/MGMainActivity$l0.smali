.class Lcom/join/mgps/activity/MGMainActivity$l0;
.super Ljava/lang/Object;
.source "MGMainActivity.java"

# interfaces
.implements Lcom/join/mgps/activity/MGMainActivity$w0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/MGMainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private b:Z

.field final synthetic c:Lcom/join/mgps/activity/MGMainActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/MGMainActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/MGMainActivity$l0;->c:Lcom/join/mgps/activity/MGMainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/join/mgps/activity/MGMainActivity$l0;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/mgps/activity/MGMainActivity$l0;->b:Z

    return p0
.end method


# virtual methods
.method public W(Z)Lcom/join/mgps/activity/MGMainActivity$w0;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/activity/MGMainActivity$l0;->b:Z

    return-object p0
.end method

.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MGMainActivity$l0;->c:Lcom/join/mgps/activity/MGMainActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/MGMainActivity;->access$2610(Lcom/join/mgps/activity/MGMainActivity;)I

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/MGMainActivity$l0;->c:Lcom/join/mgps/activity/MGMainActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/MGMainActivity;->access$200(Lcom/join/mgps/activity/MGMainActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/join/mgps/activity/MGMainActivity$l0;->c:Lcom/join/mgps/activity/MGMainActivity;

    invoke-static {v2}, Lcom/join/mgps/activity/MGMainActivity;->access$2700(Lcom/join/mgps/activity/MGMainActivity;)J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x5dc

    cmp-long v4, v0, v2

    if-gez v4, :cond_1

    return-void

    .line 4
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/join/mgps/activity/MGMainActivity$l0;->c:Lcom/join/mgps/activity/MGMainActivity;

    invoke-static {v2}, Lcom/join/mgps/activity/MGMainActivity;->access$2800(Lcom/join/mgps/activity/MGMainActivity;)J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/32 v2, 0xea60

    cmp-long v4, v0, v2

    if-gez v4, :cond_2

    sget-boolean v0, Lcom/MApplication;->E1:Z

    if-eqz v0, :cond_2

    return-void

    .line 5
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/MGMainActivity$l0;->c:Lcom/join/mgps/activity/MGMainActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/MGMainActivity;->prefDef:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->firstShowUserPermiss()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    return-void

    .line 6
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/activity/MGMainActivity$l0;->c:Lcom/join/mgps/activity/MGMainActivity;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/join/mgps/activity/MGMainActivity;->access$2702(Lcom/join/mgps/activity/MGMainActivity;J)J

    .line 7
    invoke-static {}, Lcom/MApplication;->n()Lcom/netease/nis/quicklogin/QuickLogin;

    move-result-object v0

    .line 8
    new-instance v1, Lcom/join/mgps/activity/MGMainActivity$l0$a;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/MGMainActivity$l0$a;-><init>(Lcom/join/mgps/activity/MGMainActivity$l0;)V

    invoke-virtual {v0, v1}, Lcom/netease/nis/quicklogin/QuickLogin;->prefetchMobileNumber(Lcom/netease/nis/quicklogin/listener/QuickLoginPreMobileListener;)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/MGMainActivity$l0;->c:Lcom/join/mgps/activity/MGMainActivity;

    iget-object v1, v0, Lcom/join/mgps/activity/MGMainActivity;->mHandler:Landroid/os/Handler;

    if-nez v1, :cond_4

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    iput-object v1, v0, Lcom/join/mgps/activity/MGMainActivity;->mHandler:Landroid/os/Handler;

    .line 10
    :cond_4
    iget-object v0, p0, Lcom/join/mgps/activity/MGMainActivity$l0;->c:Lcom/join/mgps/activity/MGMainActivity;

    iget-object v1, v0, Lcom/join/mgps/activity/MGMainActivity;->mHandler:Landroid/os/Handler;

    iget-object v0, v0, Lcom/join/mgps/activity/MGMainActivity;->rePreloginRunnable:Ljava/lang/Runnable;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 11
    iget-object v0, p0, Lcom/join/mgps/activity/MGMainActivity$l0;->c:Lcom/join/mgps/activity/MGMainActivity;

    iget-object v1, v0, Lcom/join/mgps/activity/MGMainActivity;->mHandler:Landroid/os/Handler;

    iget-object v0, v0, Lcom/join/mgps/activity/MGMainActivity;->rePreloginRunnable:Ljava/lang/Runnable;

    const-wide/32 v2, 0x83d60

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
