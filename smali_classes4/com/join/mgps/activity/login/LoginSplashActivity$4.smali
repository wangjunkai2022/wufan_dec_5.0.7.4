.class Lcom/join/mgps/activity/login/LoginSplashActivity$4;
.super Ljava/lang/Object;
.source "LoginSplashActivity.java"

# interfaces
.implements Lretrofit2/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/login/LoginSplashActivity;->oneKeyLogin(Ljava/lang/String;Ljava/lang/String;Lcom/netease/nis/quicklogin/QuickLogin;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lretrofit2/Callback<",
        "Lcom/join/mgps/dto/AccountResultMainBean<",
        "Lcom/join/mgps/dto/AccountLoginresultData;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/login/LoginSplashActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity$4;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/AccountResultMainBean<",
            "Lcom/join/mgps/dto/AccountLoginresultData;",
            ">;>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity$4;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;

    const-string p2, "\u8fde\u63a5\u5931\u8d25\uff0c\u8bf7\u4f7f\u7528\u8d26\u53f7\u767b\u5f55\u3002"

    invoke-virtual {p1, p2}, Lcom/join/mgps/activity/login/LoginSplashActivity;->error(Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity$4;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;

    invoke-virtual {p1}, Lcom/join/mgps/activity/login/LoginSplashActivity;->dismissLoadingDialog()V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity$4;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;

    invoke-virtual {p1}, Lcom/join/mgps/activity/login/LoginSplashActivity;->quitActivity()V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity$4;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/login/LoginSplashActivity;->access$100(Lcom/join/mgps/activity/login/LoginSplashActivity;)V

    .line 5
    new-instance p1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {p1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    const-string p2, "0"

    .line 6
    invoke-virtual {p1, p2}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 7
    iget-object p2, p0, Lcom/join/mgps/activity/login/LoginSplashActivity$4;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;

    iget-object p2, p2, Lcom/join/mgps/activity/login/LoginSplashActivity;->context:Landroid/content/Context;

    invoke-static {p2}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p2

    sget-object v0, Lcom/papa/sim/statistic/Event;->quickLoginResult:Lcom/papa/sim/statistic/Event;

    iget-object v1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity$4;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;

    invoke-static {v1, p1}, Lcom/join/mgps/activity/login/LoginSplashActivity;->access$000(Lcom/join/mgps/activity/login/LoginSplashActivity;Lcom/papa/sim/statistic/Ext;)Lcom/papa/sim/statistic/Ext;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    return-void
.end method

.method public onResponse(Lretrofit2/Call;Lretrofit2/Response;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/AccountResultMainBean<",
            "Lcom/join/mgps/dto/AccountLoginresultData;",
            ">;>;",
            "Lretrofit2/Response<",
            "Lcom/join/mgps/dto/AccountResultMainBean<",
            "Lcom/join/mgps/dto/AccountLoginresultData;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/AccountResultMainBean;

    const-string p2, "0"

    if-eqz p1, :cond_1

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/AccountResultMainBean;->getError()I

    move-result v0

    if-nez v0, :cond_1

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/dto/AccountResultMainBean;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/AccountLoginresultData;

    invoke-virtual {v0}, Lcom/join/mgps/dto/AccountLoginresultData;->isIs_success()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    iget-object p2, p0, Lcom/join/mgps/activity/login/LoginSplashActivity$4;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;

    const-string v0, "\u767b\u9646\u6210\u529f"

    invoke-virtual {p2, v0}, Lcom/join/mgps/activity/login/LoginSplashActivity;->error(Ljava/lang/String;)V

    .line 5
    invoke-virtual {p1}, Lcom/join/mgps/dto/AccountResultMainBean;->getData()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/dto/AccountLoginresultData;

    invoke-virtual {p2}, Lcom/join/mgps/dto/AccountLoginresultData;->getUser_info()Lcom/join/mgps/dto/AccountBean;

    move-result-object p2

    .line 6
    invoke-static {p2}, Lb3/a;->a(Lcom/join/mgps/dto/AccountBean;)Lcom/wufan/user/service/protobuf/n0;

    move-result-object p2

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/login/LoginSplashActivity$4;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity$4;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;

    iget-object v1, v1, Lcom/join/mgps/activity/login/LoginSplashActivity;->mActivity:Landroid/app/Activity;

    invoke-virtual {v0, p2, v1}, Lcom/join/mgps/Util/b;->saveAccountData(Lcom/wufan/user/service/protobuf/n0;Landroid/content/Context;)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/login/LoginSplashActivity$4;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/login/LoginSplashActivity;->mActivity:Landroid/app/Activity;

    invoke-virtual {p1}, Lcom/join/mgps/dto/AccountResultMainBean;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/AccountLoginresultData;

    invoke-virtual {p1}, Lcom/join/mgps/dto/AccountLoginresultData;->getGame_list_permission()Ljava/util/List;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/join/mgps/Util/UtilsMy;->v4(Landroid/content/Context;Ljava/util/List;)V

    .line 9
    iget-object p1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity$4;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;

    iget-object p1, p1, Lcom/join/mgps/activity/login/LoginSplashActivity;->mActivity:Landroid/app/Activity;

    invoke-static {p1}, Lcom/join/mgps/Util/UtilsMy;->Q(Landroid/content/Context;)V

    .line 10
    iget-object p1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity$4;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;

    invoke-virtual {p1, p2}, Lcom/join/mgps/activity/login/LoginSplashActivity;->loginSuccess(Lcom/wufan/user/service/protobuf/n0;)V

    .line 11
    iget-object p1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity$4;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;

    invoke-virtual {p1}, Lcom/join/mgps/activity/login/LoginSplashActivity;->dismissLoadingDialog()V

    .line 12
    iget-object p1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity$4;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;

    invoke-virtual {p1}, Lcom/join/mgps/activity/login/LoginSplashActivity;->quitActivity()V

    .line 13
    new-instance p1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {p1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    const-string p2, "1"

    .line 14
    invoke-virtual {p1, p2}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 15
    iget-object p2, p0, Lcom/join/mgps/activity/login/LoginSplashActivity$4;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;

    iget-object p2, p2, Lcom/join/mgps/activity/login/LoginSplashActivity;->context:Landroid/content/Context;

    invoke-static {p2}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p2

    sget-object v0, Lcom/papa/sim/statistic/Event;->quickLoginResult:Lcom/papa/sim/statistic/Event;

    iget-object v1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity$4;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;

    invoke-static {v1, p1}, Lcom/join/mgps/activity/login/LoginSplashActivity;->access$000(Lcom/join/mgps/activity/login/LoginSplashActivity;Lcom/papa/sim/statistic/Ext;)Lcom/papa/sim/statistic/Ext;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 16
    iget-object p1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity$4;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;

    invoke-virtual {p1}, Lcom/join/mgps/activity/login/LoginSplashActivity;->finish()V

    goto :goto_0

    .line 17
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity$4;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;

    const-string v0, "\u4e00\u952e\u767b\u5f55\u5931\u8d25\uff0c\u8bf7\u4f7f\u7528\u8d26\u53f7\u767b\u5f55\u3002"

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/login/LoginSplashActivity;->error(Ljava/lang/String;)V

    .line 18
    iget-object p1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity$4;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;

    invoke-virtual {p1}, Lcom/join/mgps/activity/login/LoginSplashActivity;->dismissLoadingDialog()V

    .line 19
    iget-object p1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity$4;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;

    invoke-virtual {p1}, Lcom/join/mgps/activity/login/LoginSplashActivity;->quitActivity()V

    .line 20
    iget-object p1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity$4;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/login/LoginSplashActivity;->access$100(Lcom/join/mgps/activity/login/LoginSplashActivity;)V

    .line 21
    new-instance p1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {p1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    .line 22
    invoke-virtual {p1, p2}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 23
    iget-object p2, p0, Lcom/join/mgps/activity/login/LoginSplashActivity$4;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;

    iget-object p2, p2, Lcom/join/mgps/activity/login/LoginSplashActivity;->context:Landroid/content/Context;

    invoke-static {p2}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p2

    sget-object v0, Lcom/papa/sim/statistic/Event;->quickLoginResult:Lcom/papa/sim/statistic/Event;

    iget-object v1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity$4;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;

    invoke-static {v1, p1}, Lcom/join/mgps/activity/login/LoginSplashActivity;->access$000(Lcom/join/mgps/activity/login/LoginSplashActivity;Lcom/papa/sim/statistic/Ext;)Lcom/papa/sim/statistic/Ext;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 24
    iget-object p1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity$4;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;

    invoke-virtual {p1}, Lcom/join/mgps/activity/login/LoginSplashActivity;->finish()V

    goto :goto_0

    .line 25
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity$4;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;

    const-string v0, "\u8fde\u63a5\u5931\u8d25\uff0c\u8bf7\u4f7f\u7528\u8d26\u53f7\u767b\u5f55\u3002"

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/login/LoginSplashActivity;->error(Ljava/lang/String;)V

    .line 26
    iget-object p1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity$4;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;

    invoke-virtual {p1}, Lcom/join/mgps/activity/login/LoginSplashActivity;->dismissLoadingDialog()V

    .line 27
    iget-object p1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity$4;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;

    invoke-virtual {p1}, Lcom/join/mgps/activity/login/LoginSplashActivity;->quitActivity()V

    .line 28
    iget-object p1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity$4;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/login/LoginSplashActivity;->access$100(Lcom/join/mgps/activity/login/LoginSplashActivity;)V

    .line 29
    new-instance p1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {p1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    .line 30
    invoke-virtual {p1, p2}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 31
    iget-object p2, p0, Lcom/join/mgps/activity/login/LoginSplashActivity$4;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;

    iget-object p2, p2, Lcom/join/mgps/activity/login/LoginSplashActivity;->context:Landroid/content/Context;

    invoke-static {p2}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p2

    sget-object v0, Lcom/papa/sim/statistic/Event;->quickLoginResult:Lcom/papa/sim/statistic/Event;

    iget-object v1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity$4;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;

    invoke-static {v1, p1}, Lcom/join/mgps/activity/login/LoginSplashActivity;->access$000(Lcom/join/mgps/activity/login/LoginSplashActivity;Lcom/papa/sim/statistic/Ext;)Lcom/papa/sim/statistic/Ext;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 32
    iget-object p1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity$4;->this$0:Lcom/join/mgps/activity/login/LoginSplashActivity;

    invoke-virtual {p1}, Lcom/join/mgps/activity/login/LoginSplashActivity;->finish()V

    :goto_0
    return-void
.end method
