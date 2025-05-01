.class Lcom/join/mgps/activity/login/LoginSplashActivity$3;
.super Lcom/netease/nis/quicklogin/listener/QuickLoginTokenListener;
.source "LoginSplashActivity.java"


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
    iput-object p1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity$3;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;

    invoke-direct {p0}, Lcom/netease/nis/quicklogin/listener/QuickLoginTokenListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancelGetToken()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/login/LoginSplashActivity$3;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;

    invoke-virtual {v0}, Lcom/join/mgps/activity/login/LoginSplashActivity;->quitActivity()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/login/LoginSplashActivity$3;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;

    invoke-virtual {v0}, Lcom/join/mgps/activity/login/LoginSplashActivity;->finish()V

    return-void
.end method

.method public onGetTokenError(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity$3;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;

    invoke-virtual {p1}, Lcom/join/mgps/activity/login/LoginSplashActivity;->quitActivity()V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity$3;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/login/LoginSplashActivity;->access$100(Lcom/join/mgps/activity/login/LoginSplashActivity;)V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity$3;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;

    invoke-virtual {p1}, Lcom/join/mgps/activity/login/LoginSplashActivity;->finish()V

    return-void
.end method

.method public onGetTokenSuccess(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/login/LoginSplashActivity$3;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;

    iget-object v1, v0, Lcom/join/mgps/activity/login/LoginSplashActivity;->quickLogin:Lcom/netease/nis/quicklogin/QuickLogin;

    invoke-virtual {v0, p1, p2, v1}, Lcom/join/mgps/activity/login/LoginSplashActivity;->oneKeyLogin(Ljava/lang/String;Ljava/lang/String;Lcom/netease/nis/quicklogin/QuickLogin;)V

    return-void
.end method
