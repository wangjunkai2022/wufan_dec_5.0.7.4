.class Lcom/join/mgps/activity/login/LoginMainActivity$3;
.super Lcom/netease/nis/quicklogin/listener/QuickLoginTokenListener;
.source "LoginMainActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/login/LoginMainActivity;->nextStep()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/mgps/activity/login/LoginMainActivity;

.field final synthetic val$number:Ljava/lang/String;

.field final synthetic val$quickLogin:Lcom/netease/nis/quicklogin/QuickLogin;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/login/LoginMainActivity;Lcom/netease/nis/quicklogin/QuickLogin;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/login/LoginMainActivity$3;->this$0:Lcom/join/mgps/activity/login/LoginMainActivity;

    iput-object p2, p0, Lcom/join/mgps/activity/login/LoginMainActivity$3;->val$quickLogin:Lcom/netease/nis/quicklogin/QuickLogin;

    iput-object p3, p0, Lcom/join/mgps/activity/login/LoginMainActivity$3;->val$number:Ljava/lang/String;

    invoke-direct {p0}, Lcom/netease/nis/quicklogin/listener/QuickLoginTokenListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancelGetToken()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/login/LoginMainActivity$3;->this$0:Lcom/join/mgps/activity/login/LoginMainActivity;

    invoke-virtual {v0}, Lcom/join/mgps/activity/login/LoginMainActivity;->finish()V

    return-void
.end method

.method public onGetTokenError(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance p1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {p1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    const-string p2, "0"

    .line 2
    invoke-virtual {p1, p2}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 3
    iget-object p2, p0, Lcom/join/mgps/activity/login/LoginMainActivity$3;->this$0:Lcom/join/mgps/activity/login/LoginMainActivity;

    iget-object p2, p2, Lcom/join/mgps/activity/login/LoginMainActivity;->context:Landroid/content/Context;

    invoke-static {p2}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p2

    sget-object v0, Lcom/papa/sim/statistic/Event;->tokenLoginResult:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2, v0, p1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/login/LoginMainActivity$3;->this$0:Lcom/join/mgps/activity/login/LoginMainActivity;

    iget-object p2, p0, Lcom/join/mgps/activity/login/LoginMainActivity$3;->val$number:Ljava/lang/String;

    invoke-static {p1, p2}, Lcom/join/mgps/activity/login/LoginMainActivity;->access$000(Lcom/join/mgps/activity/login/LoginMainActivity;Ljava/lang/String;)V

    return-void
.end method

.method public onGetTokenSuccess(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/login/LoginMainActivity$3;->this$0:Lcom/join/mgps/activity/login/LoginMainActivity;

    iget-object v1, p0, Lcom/join/mgps/activity/login/LoginMainActivity$3;->val$quickLogin:Lcom/netease/nis/quicklogin/QuickLogin;

    iget-object v2, p0, Lcom/join/mgps/activity/login/LoginMainActivity$3;->val$number:Ljava/lang/String;

    invoke-virtual {v0, p1, p2, v1, v2}, Lcom/join/mgps/activity/login/LoginMainActivity;->checkPhoneLogin(Ljava/lang/String;Ljava/lang/String;Lcom/netease/nis/quicklogin/QuickLogin;Ljava/lang/String;)V

    return-void
.end method
