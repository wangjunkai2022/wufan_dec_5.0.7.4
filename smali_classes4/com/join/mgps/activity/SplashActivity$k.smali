.class Lcom/join/mgps/activity/SplashActivity$k;
.super Ljava/lang/Object;
.source "SplashActivity.java"

# interfaces
.implements Lcom/join/mgps/shake/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/SplashActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/SplashActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/SplashActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/SplashActivity$k;->a:Lcom/join/mgps/activity/SplashActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity$k;->a:Lcom/join/mgps/activity/SplashActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/SplashActivity;->k(Lcom/join/mgps/activity/SplashActivity;)Landroid/os/Vibrator;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [J

    fill-array-data v1, :array_0

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/os/Vibrator;->vibrate([JI)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity$k;->a:Lcom/join/mgps/activity/SplashActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/SplashActivity;->l(Lcom/join/mgps/activity/SplashActivity;)Lcom/join/mgps/shake/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/shake/a;->e()V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity$k;->a:Lcom/join/mgps/activity/SplashActivity;

    iget-object v1, v0, Lcom/join/mgps/activity/SplashActivity;->T:Lcom/join/mgps/dto/ShowViewDataBean;

    if-eqz v1, :cond_0

    iget-object v2, v0, Lcom/join/mgps/activity/SplashActivity;->U:Lcom/join/mgps/dto/SplashIntentBean;

    if-eqz v2, :cond_0

    const-string v3, "2"

    .line 4
    invoke-static {v0, v1, v2, v3}, Lcom/join/mgps/activity/SplashActivity;->m(Lcom/join/mgps/activity/SplashActivity;Lcom/join/mgps/dto/ShowViewDataBean;Lcom/join/mgps/dto/SplashIntentBean;Ljava/lang/String;)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {v0}, Lcom/join/mgps/activity/SplashActivity;->a0()V

    :goto_0
    return-void

    nop

    :array_0
    .array-data 8
        0x12c
        0x1f4
    .end array-data
.end method
