.class Lcom/join/mgps/activity/login/LoginSplashActivity$1;
.super Ljava/lang/Object;
.source "LoginSplashActivity.java"

# interfaces
.implements Lcom/netease/nis/quicklogin/listener/ClickEventListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/login/LoginSplashActivity;->gotoOneKeyLogin()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/login/LoginSplashActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity$1;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(II)V
    .locals 2

    const/4 p2, 0x4

    if-ne p1, p2, :cond_0

    const/4 p1, 0x0

    .line 1
    sput-boolean p1, Lcom/MApplication;->E1:Z

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity$1;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;

    iget-object p1, p1, Lcom/join/mgps/activity/login/LoginSplashActivity;->context:Landroid/content/Context;

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object p2, Lcom/papa/sim/statistic/Event;->clickFastLoginButton:Lcom/papa/sim/statistic/Event;

    iget-object v0, p0, Lcom/join/mgps/activity/login/LoginSplashActivity$1;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/join/mgps/activity/login/LoginSplashActivity;->access$000(Lcom/join/mgps/activity/login/LoginSplashActivity;Lcom/papa/sim/statistic/Ext;)Lcom/papa/sim/statistic/Ext;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto :goto_0

    :cond_0
    const/4 p2, 0x1

    if-ne p1, p2, :cond_1

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity$1;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;

    iget-object p1, p1, Lcom/join/mgps/activity/login/LoginSplashActivity;->quickLogin:Lcom/netease/nis/quicklogin/QuickLogin;

    invoke-virtual {p1, p2}, Lcom/netease/nis/quicklogin/QuickLogin;->setPrivacyState(Z)V

    :cond_1
    :goto_0
    return-void
.end method
