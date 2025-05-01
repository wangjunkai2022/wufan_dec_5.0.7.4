.class Lcom/join/mgps/activity/login/LoginMainActivity$5;
.super Ljava/lang/Object;
.source "LoginMainActivity.java"

# interfaces
.implements Lretrofit2/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/login/LoginMainActivity;->checkPhoneLogin(Ljava/lang/String;Ljava/lang/String;Lcom/netease/nis/quicklogin/QuickLogin;Ljava/lang/String;)V
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
.field final synthetic this$0:Lcom/join/mgps/activity/login/LoginMainActivity;

.field final synthetic val$phone:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/login/LoginMainActivity;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/login/LoginMainActivity$5;->this$0:Lcom/join/mgps/activity/login/LoginMainActivity;

    iput-object p2, p0, Lcom/join/mgps/activity/login/LoginMainActivity$5;->val$phone:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 1
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
    iget-object p1, p0, Lcom/join/mgps/activity/login/LoginMainActivity$5;->this$0:Lcom/join/mgps/activity/login/LoginMainActivity;

    iget-object p2, p0, Lcom/join/mgps/activity/login/LoginMainActivity$5;->val$phone:Ljava/lang/String;

    invoke-static {p1, p2}, Lcom/join/mgps/activity/login/LoginMainActivity;->access$000(Lcom/join/mgps/activity/login/LoginMainActivity;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {p1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    const-string p2, "0"

    .line 3
    invoke-virtual {p1, p2}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 4
    iget-object p2, p0, Lcom/join/mgps/activity/login/LoginMainActivity$5;->this$0:Lcom/join/mgps/activity/login/LoginMainActivity;

    iget-object p2, p2, Lcom/join/mgps/activity/login/LoginMainActivity;->context:Landroid/content/Context;

    invoke-static {p2}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p2

    sget-object v0, Lcom/papa/sim/statistic/Event;->tokenLoginResult:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2, v0, p1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    return-void
.end method

.method public onResponse(Lretrofit2/Call;Lretrofit2/Response;)V
    .locals 3
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
    iget-object p2, p0, Lcom/join/mgps/activity/login/LoginMainActivity$5;->this$0:Lcom/join/mgps/activity/login/LoginMainActivity;

    const-string v0, "\u767b\u9646\u6210\u529f"

    invoke-virtual {p2, v0}, Lcom/join/mgps/activity/login/LoginMainActivity;->error(Ljava/lang/String;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/login/LoginMainActivity$5;->this$0:Lcom/join/mgps/activity/login/LoginMainActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/login/LoginMainActivity$5;->this$0:Lcom/join/mgps/activity/login/LoginMainActivity;

    iget-object v1, v1, Lcom/join/mgps/activity/login/LoginMainActivity;->context:Landroid/content/Context;

    invoke-virtual {v0, p2, v1}, Lcom/join/mgps/Util/b;->saveAccountData(Lcom/wufan/user/service/protobuf/n0;Landroid/content/Context;)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/login/LoginMainActivity$5;->this$0:Lcom/join/mgps/activity/login/LoginMainActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/login/LoginMainActivity;->context:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/join/mgps/dto/AccountResultMainBean;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/AccountLoginresultData;

    invoke-virtual {v1}, Lcom/join/mgps/dto/AccountLoginresultData;->getGame_list_permission()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->v4(Landroid/content/Context;Ljava/util/List;)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/login/LoginMainActivity$5;->this$0:Lcom/join/mgps/activity/login/LoginMainActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/login/LoginMainActivity;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->Q(Landroid/content/Context;)V

    .line 10
    new-instance v0, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v0}, Lcom/papa/sim/statistic/Ext;-><init>()V

    const-string v1, "1"

    .line 11
    invoke-virtual {v0, v1}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 12
    iget-object v1, p0, Lcom/join/mgps/activity/login/LoginMainActivity$5;->this$0:Lcom/join/mgps/activity/login/LoginMainActivity;

    iget-object v1, v1, Lcom/join/mgps/activity/login/LoginMainActivity;->context:Landroid/content/Context;

    invoke-static {v1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v1

    sget-object v2, Lcom/papa/sim/statistic/Event;->tokenLoginResult:Lcom/papa/sim/statistic/Event;

    invoke-virtual {v1, v2, v0}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 13
    iget-object v0, p0, Lcom/join/mgps/activity/login/LoginMainActivity$5;->this$0:Lcom/join/mgps/activity/login/LoginMainActivity;

    invoke-virtual {p1}, Lcom/join/mgps/dto/AccountResultMainBean;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/AccountLoginresultData;

    invoke-virtual {p1}, Lcom/join/mgps/dto/AccountLoginresultData;->getReward()Lcom/join/mgps/dto/RewardBean;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, Lcom/join/mgps/activity/login/LoginMainActivity;->loginSuccess(Lcom/wufan/user/service/protobuf/n0;Lcom/join/mgps/dto/RewardBean;)V

    .line 14
    iget-object p1, p0, Lcom/join/mgps/activity/login/LoginMainActivity$5;->this$0:Lcom/join/mgps/activity/login/LoginMainActivity;

    invoke-virtual {p1}, Lcom/join/mgps/activity/login/LoginMainActivity;->showLodingDismis()V

    goto :goto_0

    .line 15
    :cond_0
    new-instance p1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {p1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    .line 16
    invoke-virtual {p1, p2}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 17
    iget-object p2, p0, Lcom/join/mgps/activity/login/LoginMainActivity$5;->this$0:Lcom/join/mgps/activity/login/LoginMainActivity;

    iget-object p2, p2, Lcom/join/mgps/activity/login/LoginMainActivity;->context:Landroid/content/Context;

    invoke-static {p2}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p2

    sget-object v0, Lcom/papa/sim/statistic/Event;->tokenLoginResult:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2, v0, p1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 18
    iget-object p1, p0, Lcom/join/mgps/activity/login/LoginMainActivity$5;->this$0:Lcom/join/mgps/activity/login/LoginMainActivity;

    iget-object p2, p0, Lcom/join/mgps/activity/login/LoginMainActivity$5;->val$phone:Ljava/lang/String;

    invoke-static {p1, p2}, Lcom/join/mgps/activity/login/LoginMainActivity;->access$000(Lcom/join/mgps/activity/login/LoginMainActivity;Ljava/lang/String;)V

    goto :goto_0

    .line 19
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/activity/login/LoginMainActivity$5;->this$0:Lcom/join/mgps/activity/login/LoginMainActivity;

    iget-object v0, p0, Lcom/join/mgps/activity/login/LoginMainActivity$5;->val$phone:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/join/mgps/activity/login/LoginMainActivity;->access$000(Lcom/join/mgps/activity/login/LoginMainActivity;Ljava/lang/String;)V

    .line 20
    new-instance p1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {p1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    .line 21
    invoke-virtual {p1, p2}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 22
    iget-object p2, p0, Lcom/join/mgps/activity/login/LoginMainActivity$5;->this$0:Lcom/join/mgps/activity/login/LoginMainActivity;

    iget-object p2, p2, Lcom/join/mgps/activity/login/LoginMainActivity;->context:Landroid/content/Context;

    invoke-static {p2}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p2

    sget-object v0, Lcom/papa/sim/statistic/Event;->tokenLoginResult:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2, v0, p1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    :goto_0
    return-void
.end method
