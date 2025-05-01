.class public Lcom/join/mgps/Util/IntentUtil;
.super Ljava/lang/Object;
.source "IntentUtil.java"


# static fields
.field private static ourInstance:Lcom/join/mgps/Util/IntentUtil;


# instance fields
.field private downloadTask:Lcom/github/snowdream/android/app/downloader/DownloadTask;

.field private gameid:Ljava/lang/String;

.field private intent2:Landroid/content/Intent;

.field private splashActivity:Landroid/app/Activity;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private accountBean(Landroid/content/Context;)Lcom/wufan/user/service/protobuf/n0;
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object p1

    return-object p1
.end method

.method private checkAndDownloadApk(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 3

    if-eqz p2, :cond_0

    .line 1
    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_8

    const/16 v1, 0xd

    if-eq v0, v1, :cond_7

    const/4 v1, 0x2

    if-eq v0, v1, :cond_6

    const/4 v1, 0x3

    if-eq v0, v1, :cond_5

    const/4 v1, 0x5

    if-eq v0, v1, :cond_4

    const/4 v1, 0x6

    if-eq v0, v1, :cond_5

    const/4 v1, 0x7

    if-eq v0, v1, :cond_8

    const/16 v1, 0x2a

    const-string/jumbo v2, "\u65e0\u7f51\u7edc\u8fde\u63a5"

    if-eq v0, v1, :cond_2

    const/16 v1, 0x2b

    if-eq v0, v1, :cond_8

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 2
    :pswitch_0
    invoke-static {p2, p1}, Lcom/join/mgps/Util/UtilsMy;->a4(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto :goto_1

    .line 3
    :pswitch_1
    invoke-static {p1}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 4
    invoke-static {p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    invoke-virtual {p1, v2}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void

    .line 5
    :cond_1
    invoke-static {p1, p2}, Lcom/join/mgps/Util/UtilsMy;->I2(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_1

    .line 6
    :cond_2
    invoke-static {p1}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 7
    invoke-static {p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    invoke-virtual {p1, v2}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void

    .line 8
    :cond_3
    invoke-static {p1, p2}, Lcom/join/mgps/Util/UtilsMy;->r4(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_1

    .line 9
    :cond_4
    invoke-static {p1, p2}, Lcom/join/mgps/Util/UtilsMy;->T3(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_1

    .line 10
    :cond_5
    invoke-static {p2, p1}, Lcom/php25/PDownload/d;->c(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto :goto_1

    .line 11
    :cond_6
    :pswitch_2
    invoke-static {p1}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result p2

    if-nez p2, :cond_9

    .line 12
    invoke-static {p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    const-string/jumbo p2, "\u5e94\u7528\u6b63\u5728\u4e0b\u8f7d~"

    invoke-virtual {p1, p2}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void

    .line 13
    :cond_7
    invoke-static {p1, p2}, Lcom/php25/PDownload/d;->l(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_1

    .line 14
    :cond_8
    invoke-static {p1, p2}, Lcom/join/mgps/Util/UtilsMy;->l1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    :cond_9
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method public static getInstance()Lcom/join/mgps/Util/IntentUtil;
    .locals 1

    .line 1
    sget-object v0, Lcom/join/mgps/Util/IntentUtil;->ourInstance:Lcom/join/mgps/Util/IntentUtil;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/join/mgps/Util/IntentUtil;

    invoke-direct {v0}, Lcom/join/mgps/Util/IntentUtil;-><init>()V

    sput-object v0, Lcom/join/mgps/Util/IntentUtil;->ourInstance:Lcom/join/mgps/Util/IntentUtil;

    .line 3
    :cond_0
    sget-object v0, Lcom/join/mgps/Util/IntentUtil;->ourInstance:Lcom/join/mgps/Util/IntentUtil;

    return-object v0
.end method

.method private goLogin(Landroid/content/Context;I)Z
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/join/mgps/Util/IntentUtil;->isLogined(Landroid/content/Context;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p0, p1}, Lcom/join/mgps/Util/IntentUtil;->isTourist(Landroid/content/Context;)Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    .line 3
    :cond_1
    :goto_0
    invoke-static {p1}, Lcom/join/mgps/activity/login/LoginSplashActivity_;->intent(Landroid/content/Context;)Lcom/join/mgps/activity/login/LoginSplashActivity_$IntentBuilder_;

    move-result-object p1

    const/high16 p2, 0x10000000

    invoke-virtual {p1, p2}, Lorg/androidannotations/api/builder/e;->flags(I)Lorg/androidannotations/api/builder/e;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/login/LoginSplashActivity_$IntentBuilder_;

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    const/4 p1, 0x1

    return p1
.end method

.method private showUserNotLogin(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v1, 0x7f10013d

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public checkAndStartMain(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;I)V
    .locals 2

    .line 1
    sget-boolean v0, Lcom/join/mgps/activity/MGMainActivity;->isCreated:Z

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 3
    const-class v1, Lcom/join/mgps/activity/MGMainActivity_;

    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    const-string v1, "intentActivityBean"

    .line 4
    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 5
    invoke-virtual {v0, p3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 6
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    :goto_0
    return-void
.end method

.method public checkRealNameAndIntent(Landroid/content/Context;Lcom/wufan/user/service/protobuf/n0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p4}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/join/mgps/Util/IntentUtil;->startGameCheckRealnameHasIntent(Landroid/content/Context;Lcom/wufan/user/service/protobuf/n0;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p2

    invoke-virtual {p2, p4}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p2

    const-string p3, "login"

    .line 4
    invoke-static {p1, p2, p3}, Lcom/join/mgps/Util/UtilsMy;->W3(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public getSplashActivity()Landroid/app/Activity;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/Util/IntentUtil;->splashActivity:Landroid/app/Activity;

    return-object v0
.end method

.method public goAccountCenterActivity(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/join/mgps/activity/AccountCenterNewActivity_;->f0(Landroid/content/Context;)Lcom/join/mgps/activity/AccountCenterNewActivity_$b;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method public goAccountUpgradeActivity(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/join/mgps/Util/IntentUtil;->goMyAccountLoginActivity(Landroid/content/Context;)V

    return-void
.end method

.method public goBrowser(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "android.intent.action.VIEW"

    .line 2
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 3
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    .line 4
    invoke-virtual {v0, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 5
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public goBuildQRCodeActivity(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/join/mgps/activity/BuildQRCodeActivity_;->y0(Landroid/content/Context;)Lcom/join/mgps/activity/BuildQRCodeActivity_$c;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method public goChangeNickname(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/join/mgps/activity/login/ChangeAccountNickNameActivity_;->intent(Landroid/content/Context;)Lcom/join/mgps/activity/login/ChangeAccountNickNameActivity_$IntentBuilder_;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method public goCheckIn(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lcom/join/mgps/Util/IntentUtil;->goLoginInteractive(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/join/mgps/Util/IntentDateBean;

    invoke-direct {v0}, Lcom/join/mgps/Util/IntentDateBean;-><init>()V

    const/4 v1, 0x4

    .line 3
    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type(I)V

    const-string/jumbo v1, "\u7b7e\u5230"

    .line 4
    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setObject(Ljava/lang/Object;)V

    .line 5
    sget-object v1, Lcom/join/mgps/rpc/h;->N0:Ljava/lang/String;

    .line 6
    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type_val(Ljava/lang/String;)V

    .line 7
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    :cond_0
    return-void
.end method

.method public goCodesBoxActivity(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/Util/IntentUtil;->accountBean(Landroid/content/Context;)Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    .line 2
    invoke-virtual {p0, p1}, Lcom/join/mgps/Util/IntentUtil;->goLoginNetGame(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 3
    invoke-static {p1}, Lcom/join/mgps/activity/VoucherCodesBoxActivity_;->i0(Landroid/content/Context;)Lcom/join/mgps/activity/VoucherCodesBoxActivity_$c;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lcom/join/mgps/activity/VoucherCodesBoxActivity_$c;->b(I)Lcom/join/mgps/activity/VoucherCodesBoxActivity_$c;

    move-result-object p1

    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/VoucherCodesBoxActivity_$c;->a(I)Lcom/join/mgps/activity/VoucherCodesBoxActivity_$c;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    :cond_0
    return-void
.end method

.method public goCollectionCommentActivity(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/join/mgps/activity/CollectionCommentActivity_;->O0(Landroid/content/Context;)Lcom/join/mgps/activity/CollectionCommentActivity_$u;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/join/mgps/activity/CollectionCommentActivity_$u;->b(Ljava/lang/String;)Lcom/join/mgps/activity/CollectionCommentActivity_$u;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method public goColloctionList(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/join/mgps/Util/IntentDateBean;

    invoke-direct {v0}, Lcom/join/mgps/Util/IntentDateBean;-><init>()V

    const/4 v1, 0x2

    .line 2
    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type(I)V

    .line 3
    invoke-virtual {v0, p2}, Lcom/join/mgps/Util/IntentDateBean;->setTpl_type(Ljava/lang/String;)V

    .line 4
    invoke-virtual {v0, p3}, Lcom/join/mgps/Util/IntentDateBean;->setCrc_link_type_val(Ljava/lang/String;)V

    .line 5
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p2

    invoke-virtual {p2, p1, v0}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    return-void
.end method

.method public goCommentDetailActivity(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/join/mgps/activity/CommentDetailActivity_;->M1(Landroid/content/Context;)Lcom/join/mgps/activity/CommentDetailActivity_$z;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/join/mgps/activity/CommentDetailActivity_$z;->b(Ljava/lang/String;)Lcom/join/mgps/activity/CommentDetailActivity_$z;

    move-result-object p1

    const-string p2, "green"

    invoke-virtual {p1, p2}, Lcom/join/mgps/activity/CommentDetailActivity_$z;->f(Ljava/lang/String;)Lcom/join/mgps/activity/CommentDetailActivity_$z;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/join/mgps/activity/CommentDetailActivity_$z;->e(I)Lcom/join/mgps/activity/CommentDetailActivity_$z;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/join/mgps/activity/CommentDetailActivity_$z;->d(Ljava/lang/String;)Lcom/join/mgps/activity/CommentDetailActivity_$z;

    move-result-object p1

    invoke-virtual {p1, p4}, Lcom/join/mgps/activity/CommentDetailActivity_$z;->c(Ljava/lang/String;)Lcom/join/mgps/activity/CommentDetailActivity_$z;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method public goCommentSelfListActivity(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/join/mgps/Util/IntentUtil;->goLogin(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-static {p1}, Lcom/join/mgps/activity/CommentSelfListActivityv2_;->H0(Landroid/content/Context;)Lcom/join/mgps/activity/CommentSelfListActivityv2_$k;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    :cond_0
    return-void
.end method

.method public goDownloadCenterActivity(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/IntentUtil;->goMyGameManagerActivity(Landroid/content/Context;)V

    return-void
.end method

.method public goDownloadSettingActivity(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/join/mgps/activity/DownloadSettingActivity_;->B0(Landroid/content/Context;)Lcom/join/mgps/activity/DownloadSettingActivity_$s;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method public goFaceTransferHomePageActivity(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/join/mgps/activity/FaceTransferHomePageActivity_;->t0(Landroid/content/Context;)Lcom/join/mgps/activity/FaceTransferHomePageActivity_$e;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method public goFeedback(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lcom/join/mgps/Util/IntentUtil;->goLogin(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/join/mgps/Util/IntentDateBean;

    invoke-direct {v0}, Lcom/join/mgps/Util/IntentDateBean;-><init>()V

    const/4 v1, 0x4

    .line 3
    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type(I)V

    const v1, 0x7f1002f0

    .line 4
    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setObject(Ljava/lang/Object;)V

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/join/mgps/rpc/h;->w:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/papa_help"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type_val(Ljava/lang/String;)V

    .line 6
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    :cond_0
    return-void
.end method

.method public goFormDetial(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/join/mgps/Util/IntentDateBean;

    invoke-direct {v0}, Lcom/join/mgps/Util/IntentDateBean;-><init>()V

    const/16 v1, 0x8

    .line 2
    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type(I)V

    .line 3
    invoke-virtual {v0, p2}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type_val(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    return-void
.end method

.method public goForumAndPrfileActivity(ILandroid/content/Context;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p2}, Lcom/join/mgps/Util/IntentUtil;->goLogin(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/join/mgps/activity/GameAndProfileActivity_;

    invoke-direct {v0, p2, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string/jumbo v1, "type"

    .line 3
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 4
    invoke-virtual {p2, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method public goForumFid(Landroid/content/Context;I)V
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Lcom/join/mgps/dto/ForumBean;

    invoke-direct {v0}, Lcom/join/mgps/dto/ForumBean;-><init>()V

    .line 2
    invoke-virtual {v0, p2}, Lcom/join/mgps/dto/ForumBean;->setFid(I)V

    .line 3
    invoke-static {p1, v0}, Lcom/join/mgps/Util/j0;->r0(Landroid/content/Context;Lcom/join/mgps/dto/ForumBean;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 4
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public goForumGroupActivity(Landroid/content/Context;)V
    .locals 3

    .line 3
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/join/mgps/rpc/h;->k:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/static/group/group_square.html"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/join/mgps/Util/IntentUtil;->goShareWebActivity(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public goForumGroupActivity(Landroid/content/Context;I)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/join/mgps/activity/ForumActivity_;->U0(Landroid/content/Context;)Lcom/join/mgps/activity/ForumActivity_$q;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/join/mgps/activity/ForumActivity_$q;->a(I)Lcom/join/mgps/activity/ForumActivity_$q;

    move-result-object p1

    const/high16 p2, 0x4000000

    invoke-virtual {p1, p2}, Lorg/androidannotations/api/builder/e;->flags(I)Lorg/androidannotations/api/builder/e;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/ForumActivity_$q;

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method public goForumGroupActivity(Landroid/content/Context;ILjava/lang/String;)V
    .locals 0

    .line 2
    invoke-static {p1}, Lcom/join/mgps/activity/ForumActivity_;->U0(Landroid/content/Context;)Lcom/join/mgps/activity/ForumActivity_$q;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/join/mgps/activity/ForumActivity_$q;->a(I)Lcom/join/mgps/activity/ForumActivity_$q;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/join/mgps/activity/ForumActivity_$q;->b(Ljava/lang/String;)Lcom/join/mgps/activity/ForumActivity_$q;

    move-result-object p1

    const/high16 p2, 0x4000000

    invoke-virtual {p1, p2}, Lorg/androidannotations/api/builder/e;->flags(I)Lorg/androidannotations/api/builder/e;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/ForumActivity_$q;

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method public goForumGroupMemberActivity(Landroid/content/Context;I)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/join/mgps/activity/ForumGroupMemberActivity_;->B0(Landroid/content/Context;)Lcom/join/mgps/activity/ForumGroupMemberActivity_$j;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/join/mgps/activity/ForumGroupMemberActivity_$j;->a(I)Lcom/join/mgps/activity/ForumGroupMemberActivity_$j;

    move-result-object p1

    const/high16 p2, 0x4000000

    invoke-virtual {p1, p2}, Lorg/androidannotations/api/builder/e;->flags(I)Lorg/androidannotations/api/builder/e;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/ForumGroupMemberActivity_$j;

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method public goForumMyDynamicActivity(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/join/mgps/Util/IntentUtil;->goLogin(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-static {p1}, Lcom/join/mgps/activity/ForumMyActivity_;->u0(Landroid/content/Context;)Lcom/join/mgps/activity/ForumMyActivity_$h;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    :cond_0
    return-void
.end method

.method public goForumMyPostsActivity(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/join/mgps/Util/IntentUtil;->goLoginInteractive(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lcom/join/mgps/activity/ForumMyPostsActivity_;->V0(Landroid/content/Context;)Lcom/join/mgps/activity/ForumMyPostsActivity_$p;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    :cond_0
    return-void
.end method

.method public goForumPostsTagSelectActivity(Landroid/content/Context;IILjava/lang/String;I)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/join/mgps/activity/ForumPostsTagSelectActivity_;->w0(Landroid/content/Context;)Lcom/join/mgps/activity/ForumPostsTagSelectActivity_$i;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/join/mgps/activity/ForumPostsTagSelectActivity_$i;->a(I)Lcom/join/mgps/activity/ForumPostsTagSelectActivity_$i;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/join/mgps/activity/ForumPostsTagSelectActivity_$i;->b(I)Lcom/join/mgps/activity/ForumPostsTagSelectActivity_$i;

    move-result-object p1

    const-string p2, "selectedTags"

    invoke-virtual {p1, p2, p4}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Ljava/lang/String;)Lorg/androidannotations/api/builder/e;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/ForumPostsTagSelectActivity_$i;

    invoke-virtual {p1, p5}, Lcom/join/mgps/activity/ForumPostsTagSelectActivity_$i;->c(I)Lcom/join/mgps/activity/ForumPostsTagSelectActivity_$i;

    move-result-object p1

    const/16 p2, 0x2711

    invoke-virtual {p1, p2}, Lcom/join/mgps/activity/ForumPostsTagSelectActivity_$i;->startForResult(I)Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method public goForumProfileCommentActivity(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/join/mgps/Util/IntentUtil;->goLoginInteractive(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-static {p1}, Lcom/join/mgps/activity/ForumProfileCommentActivity_;->F0(Landroid/content/Context;)Lcom/join/mgps/activity/ForumProfileCommentActivity_$j;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    :cond_0
    return-void
.end method

.method public goForumProfileFavoritesActivity(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/join/mgps/Util/IntentUtil;->goLogin(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lcom/join/mgps/activity/ForumProfileFavoritesActivity_;->V1(Landroid/content/Context;)Lcom/join/mgps/activity/ForumProfileFavoritesActivity_$a0;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    :cond_0
    return-void
.end method

.method public goForumProfileMessageActivity(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/join/mgps/Util/IntentUtil;->goLogin(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-static {p1}, Lcom/join/mgps/activity/message/MessageMainActivity_;->k0(Landroid/content/Context;)Lcom/join/mgps/activity/message/MessageMainActivity_$f;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    :cond_0
    return-void
.end method

.method public goFullScrVideoPlayer(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    new-instance p2, Lcom/join/mgps/adapter/FullScreenActivity$VideoInfo;

    invoke-direct {p2}, Lcom/join/mgps/adapter/FullScreenActivity$VideoInfo;-><init>()V

    .line 2
    invoke-virtual {p2, p3}, Lcom/join/mgps/adapter/FullScreenActivity$VideoInfo;->m(Ljava/lang/String;)V

    .line 3
    invoke-static {p1}, Lcom/join/mgps/adapter/FullScreenActivity_;->i0(Landroid/content/Context;)Lcom/join/mgps/adapter/FullScreenActivity_$b;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/join/mgps/adapter/FullScreenActivity_$b;->a(Lcom/join/mgps/adapter/FullScreenActivity$VideoInfo;)Lcom/join/mgps/adapter/FullScreenActivity_$b;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method public goGameDetialActivity(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 2

    .line 23
    new-instance v0, Lcom/join/mgps/Util/IntentDateBean;

    invoke-direct {v0}, Lcom/join/mgps/Util/IntentDateBean;-><init>()V

    const/4 v1, 0x1

    .line 24
    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type(I)V

    .line 25
    invoke-virtual {v0, p2}, Lcom/join/mgps/Util/IntentDateBean;->setCrc_link_type_val(Ljava/lang/String;)V

    .line 26
    new-instance p2, Lcom/join/mgps/dto/ExtBean;

    invoke-direct {p2}, Lcom/join/mgps/dto/ExtBean;-><init>()V

    .line 27
    invoke-virtual {p2, p3}, Lcom/join/mgps/dto/ExtBean;->set_from_type(I)Lcom/join/mgps/dto/ExtBean;

    .line 28
    invoke-virtual {v0, p2}, Lcom/join/mgps/Util/IntentDateBean;->setExtBean(Lcom/join/mgps/dto/ExtBean;)V

    .line 29
    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    return-void
.end method

.method public goGameDetialActivity(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 2

    .line 1
    new-instance v0, Lcom/join/mgps/Util/IntentDateBean;

    invoke-direct {v0}, Lcom/join/mgps/Util/IntentDateBean;-><init>()V

    const/4 v1, 0x1

    .line 2
    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type(I)V

    .line 3
    invoke-virtual {v0, p2}, Lcom/join/mgps/Util/IntentDateBean;->setCrc_link_type_val(Ljava/lang/String;)V

    .line 4
    invoke-virtual {v0, p3}, Lcom/join/mgps/Util/IntentDateBean;->setTpl_type(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v0, p4}, Lcom/join/mgps/Util/IntentDateBean;->setJump_type(I)V

    .line 6
    new-instance p2, Lcom/join/mgps/dto/ExtBean;

    invoke-direct {p2}, Lcom/join/mgps/dto/ExtBean;-><init>()V

    .line 7
    invoke-virtual {p2, p5}, Lcom/join/mgps/dto/ExtBean;->set_from_type(I)Lcom/join/mgps/dto/ExtBean;

    .line 8
    invoke-virtual {v0, p2}, Lcom/join/mgps/Util/IntentDateBean;->setExtBean(Lcom/join/mgps/dto/ExtBean;)V

    .line 9
    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    return-void
.end method

.method public goGameDetialActivity(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 10
    new-instance v0, Lcom/join/mgps/Util/IntentDateBean;

    invoke-direct {v0}, Lcom/join/mgps/Util/IntentDateBean;-><init>()V

    const/4 v1, 0x1

    .line 11
    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type(I)V

    .line 12
    invoke-virtual {v0, p2}, Lcom/join/mgps/Util/IntentDateBean;->setCrc_link_type_val(Ljava/lang/String;)V

    .line 13
    invoke-virtual {v0, p3}, Lcom/join/mgps/Util/IntentDateBean;->setTpl_type(Ljava/lang/String;)V

    .line 14
    invoke-virtual {v0, p4}, Lcom/join/mgps/Util/IntentDateBean;->setJump_type(I)V

    .line 15
    new-instance p2, Lcom/join/mgps/dto/ExtBean;

    invoke-direct {p2}, Lcom/join/mgps/dto/ExtBean;-><init>()V

    .line 16
    invoke-virtual {p2, p6}, Lcom/join/mgps/dto/ExtBean;->setReMarks(Ljava/lang/String;)Lcom/join/mgps/dto/ExtBean;

    const/16 p3, 0x93

    if-ne p5, p3, :cond_0

    goto :goto_0

    :cond_0
    const/16 p3, 0x70

    .line 17
    :goto_0
    invoke-virtual {p2, p3}, Lcom/join/mgps/dto/ExtBean;->set_from_type(I)Lcom/join/mgps/dto/ExtBean;

    .line 18
    invoke-virtual {p2, p7}, Lcom/join/mgps/dto/ExtBean;->setWhere(Ljava/lang/String;)V

    .line 19
    invoke-virtual {p2, p8}, Lcom/join/mgps/dto/ExtBean;->setKeyword(Ljava/lang/String;)V

    .line 20
    invoke-virtual {p2, p9}, Lcom/join/mgps/dto/ExtBean;->setDataFlag(Ljava/lang/String;)Lcom/join/mgps/dto/ExtBean;

    .line 21
    invoke-virtual {v0, p2}, Lcom/join/mgps/Util/IntentDateBean;->setExtBean(Lcom/join/mgps/dto/ExtBean;)V

    .line 22
    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    return-void
.end method

.method public goGameDetialActivityBYDownloadTAsk(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/Util/IntentDateBean;

    invoke-direct {v0}, Lcom/join/mgps/Util/IntentDateBean;-><init>()V

    const/4 v1, 0x1

    .line 2
    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type(I)V

    .line 3
    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setCrc_link_type_val(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getGame_info_tpl_type()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setTpl_type(Ljava/lang/String;)V

    .line 5
    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSp_tpl_two_position()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setJump_type(I)V

    .line 6
    new-instance v1, Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->get_from_type()I

    move-result v2

    invoke-direct {v1, v2}, Lcom/join/mgps/dto/ExtBean;-><init>(I)V

    .line 7
    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getExt()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 8
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v2

    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getExt()Ljava/lang/String;

    move-result-object p2

    const-class v3, Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {v2, p2, v3}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/dto/ExtBean;

    if-eqz p2, :cond_0

    move-object v1, p2

    .line 9
    :cond_0
    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setExtBean(Lcom/join/mgps/dto/ExtBean;)V

    .line 10
    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    return-void
.end method

.method public goGameDetialActivityBYDownloadTaskForFav(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/Util/IntentDateBean;

    invoke-direct {v0}, Lcom/join/mgps/Util/IntentDateBean;-><init>()V

    const/4 v1, 0x1

    .line 2
    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type(I)V

    .line 3
    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setCrc_link_type_val(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getModInfoBean()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getModInfoBean()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/ModInfoBean;->getMain_game_id()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 5
    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getModInfoBean()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/ModInfoBean;->getMain_game_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setCrc_link_type_val(Ljava/lang/String;)V

    .line 6
    :cond_0
    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getGame_info_tpl_type()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setTpl_type(Ljava/lang/String;)V

    .line 7
    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSp_tpl_two_position()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setJump_type(I)V

    .line 8
    new-instance v1, Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->get_from_type()I

    move-result v2

    invoke-direct {v1, v2}, Lcom/join/mgps/dto/ExtBean;-><init>(I)V

    .line 9
    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getExt()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 10
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v2

    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getExt()Ljava/lang/String;

    move-result-object p2

    const-class v3, Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {v2, p2, v3}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/dto/ExtBean;

    if-eqz p2, :cond_1

    move-object v1, p2

    .line 11
    :cond_1
    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setExtBean(Lcom/join/mgps/dto/ExtBean;)V

    .line 12
    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    return-void
.end method

.method public goGameMainActivity(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/pref/PrefDef_;

    invoke-direct {v0, p1}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->pageVersion()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/high16 v1, 0x4000000

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    .line 2
    invoke-static {p1}, Lcom/join/mgps/activity/GameMainActivity4_;->S2(Landroid/content/Context;)Lcom/join/mgps/activity/GameMainActivity4_$i0;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/join/mgps/activity/GameMainActivity4_$i0;->b(Ljava/lang/String;)Lcom/join/mgps/activity/GameMainActivity4_$i0;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/join/mgps/activity/GameMainActivity4_$i0;->a(Ljava/lang/String;)Lcom/join/mgps/activity/GameMainActivity4_$i0;

    move-result-object p1

    invoke-virtual {p1, v1}, Lorg/androidannotations/api/builder/e;->flags(I)Lorg/androidannotations/api/builder/e;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/GameMainActivity4_$i0;

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {p1}, Lcom/join/mgps/activity/GameMainActivity3_;->m3(Landroid/content/Context;)Lcom/join/mgps/activity/GameMainActivity3_$j0;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/join/mgps/activity/GameMainActivity3_$j0;->b(Ljava/lang/String;)Lcom/join/mgps/activity/GameMainActivity3_$j0;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/join/mgps/activity/GameMainActivity3_$j0;->a(Ljava/lang/String;)Lcom/join/mgps/activity/GameMainActivity3_$j0;

    move-result-object p1

    invoke-virtual {p1, v1}, Lorg/androidannotations/api/builder/e;->flags(I)Lorg/androidannotations/api/builder/e;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/GameMainActivity3_$j0;

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    :goto_0
    return-void
.end method

.method public goJoystickManager(Landroid/content/Context;)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xf

    if-ge v0, v1, :cond_0

    .line 2
    invoke-static {p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    const-string/jumbo v0, "\u4f60\u7684\u624b\u673a\u6682\u4e0d\u652f\u6301"

    invoke-virtual {p1, v0}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    const/high16 v1, 0x4000000

    if-nez v0, :cond_1

    .line 4
    invoke-static {p1}, Lcom/join/mgps/activity/HandShankOverActivity_;->h0(Landroid/content/Context;)Lcom/join/mgps/activity/HandShankOverActivity_$b;

    move-result-object p1

    invoke-virtual {p1, v1}, Lorg/androidannotations/api/builder/e;->flags(I)Lorg/androidannotations/api/builder/e;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/HandShankOverActivity_$b;

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto :goto_1

    .line 5
    :cond_1
    invoke-static {}, Lb2/x;->p()Lb2/x;

    move-result-object v0

    invoke-virtual {v0}, Lb2/x;->o()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 6
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    .line 7
    :cond_2
    invoke-static {p1}, Lcom/join/mgps/activity/HandShankYesActivity_;->O0(Landroid/content/Context;)Lcom/join/mgps/activity/HandShankYesActivity_$g;

    move-result-object p1

    invoke-virtual {p1, v1}, Lorg/androidannotations/api/builder/e;->flags(I)Lorg/androidannotations/api/builder/e;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/HandShankYesActivity_$g;

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto :goto_1

    .line 8
    :cond_3
    :goto_0
    invoke-static {p1}, Lcom/join/mgps/activity/HandShankNoActivity_;->I0(Landroid/content/Context;)Lcom/join/mgps/activity/HandShankNoActivity_$f;

    move-result-object p1

    invoke-virtual {p1, v1}, Lorg/androidannotations/api/builder/e;->flags(I)Lorg/androidannotations/api/builder/e;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/HandShankNoActivity_$f;

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    :goto_1
    return-void
.end method

.method public goLabelGroupActivity(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/join/mgps/rpc/h;->k:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/group/posts/forum_tags/tagSquare?fid="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lcom/join/mgps/Util/IntentUtil;->goShareWebActivity(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public goLogin(Landroid/content/Context;)Z
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/join/mgps/Util/IntentUtil;->goLogin(Landroid/content/Context;I)Z

    move-result p1

    return p1
.end method

.method public goLoginBattle(Landroid/content/Context;)Z
    .locals 1

    const/4 v0, 0x2

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/join/mgps/Util/IntentUtil;->goLogin(Landroid/content/Context;I)Z

    move-result p1

    return p1
.end method

.method public goLoginInteractive(Landroid/content/Context;)Z
    .locals 1

    const/4 v0, 0x3

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/join/mgps/Util/IntentUtil;->goLogin(Landroid/content/Context;I)Z

    move-result p1

    return p1
.end method

.method public goLoginNetGame(Landroid/content/Context;)Z
    .locals 1

    const/4 v0, 0x4

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/join/mgps/Util/IntentUtil;->goLogin(Landroid/content/Context;I)Z

    move-result p1

    return p1
.end method

.method public goMGMainActivity2Front(Landroid/content/Context;)V
    .locals 2

    .line 10
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 11
    const-class v1, Lcom/join/mgps/activity/MGMainActivity_;

    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    const/high16 v1, 0x20000

    .line 12
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 13
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 14
    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 15
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public goMGMainActivity2Front(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 3
    .param p2    # Ljava/lang/Integer;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 2
    const-class v1, Lcom/join/mgps/activity/MGMainActivity_;

    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    const/high16 v1, 0x20000

    .line 3
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 4
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 5
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const-string v2, "MainPos"

    invoke-virtual {v1, v2, p2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    if-eqz p3, :cond_0

    .line 6
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const-string p3, "classiFy"

    invoke-virtual {v1, p3, p2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_0
    if-eqz p4, :cond_1

    .line 7
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const-string p3, "classifyPrimaryIndex"

    invoke-virtual {v1, p3, p2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 8
    :cond_1
    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 9
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public goMGSettingActivity(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/join/mgps/activity/MGPapaAboutActivity_;->t0(Landroid/content/Context;)Lcom/join/mgps/activity/MGPapaAboutActivity_$e;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method public goMYAccountDetialActivity(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/join/mgps/activity/MYAccountDetialActivity_;->T0(Landroid/content/Context;)Lcom/join/mgps/activity/MYAccountDetialActivity_$a0;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method public goMainLabelActivity(Landroid/content/Context;I)V
    .locals 2

    const-string v0, ""

    const/4 v1, 0x2

    .line 1
    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/join/mgps/Util/IntentUtil;->goMainLabelActivity(Landroid/content/Context;ILjava/lang/String;I)V

    return-void
.end method

.method public goMainLabelActivity(Landroid/content/Context;IILjava/lang/String;)V
    .locals 0

    .line 4
    invoke-static {p1}, Lcom/join/mgps/activity/label/MainLabelActivity_;->O0(Landroid/content/Context;)Lcom/join/mgps/activity/label/MainLabelActivity_$q;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/join/mgps/activity/label/MainLabelActivity_$q;->d(I)Lcom/join/mgps/activity/label/MainLabelActivity_$q;

    move-result-object p1

    const/4 p2, 0x2

    invoke-virtual {p1, p2}, Lcom/join/mgps/activity/label/MainLabelActivity_$q;->b(I)Lcom/join/mgps/activity/label/MainLabelActivity_$q;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/join/mgps/activity/label/MainLabelActivity_$q;->a(I)Lcom/join/mgps/activity/label/MainLabelActivity_$q;

    move-result-object p1

    invoke-virtual {p1, p4}, Lcom/join/mgps/activity/label/MainLabelActivity_$q;->c(Ljava/lang/String;)Lcom/join/mgps/activity/label/MainLabelActivity_$q;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method public goMainLabelActivity(Landroid/content/Context;ILjava/lang/String;)V
    .locals 1

    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/join/mgps/Util/IntentUtil;->goMainLabelActivity(Landroid/content/Context;ILjava/lang/String;I)V

    return-void
.end method

.method public goMainLabelActivity(Landroid/content/Context;ILjava/lang/String;I)V
    .locals 0

    .line 3
    invoke-static {p1}, Lcom/join/mgps/activity/label/MainLabelActivity_;->O0(Landroid/content/Context;)Lcom/join/mgps/activity/label/MainLabelActivity_$q;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/join/mgps/activity/label/MainLabelActivity_$q;->d(I)Lcom/join/mgps/activity/label/MainLabelActivity_$q;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/join/mgps/activity/label/MainLabelActivity_$q;->e(Ljava/lang/String;)Lcom/join/mgps/activity/label/MainLabelActivity_$q;

    move-result-object p1

    invoke-virtual {p1, p4}, Lcom/join/mgps/activity/label/MainLabelActivity_$q;->b(I)Lcom/join/mgps/activity/label/MainLabelActivity_$q;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method public goMyAccountLoginActivity(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x2

    .line 1
    invoke-virtual {p0, p1, v0, v1}, Lcom/join/mgps/Util/IntentUtil;->goMyAccountLoginActivity(Landroid/content/Context;II)V

    return-void
.end method

.method public goMyAccountLoginActivity(Landroid/content/Context;II)V
    .locals 0

    .line 2
    invoke-static {p1}, Lcom/join/mgps/activity/login/LoginSplashActivity_;->intent(Landroid/content/Context;)Lcom/join/mgps/activity/login/LoginSplashActivity_$IntentBuilder_;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method public goMyAccountLoginActivityNewTask(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/join/mgps/activity/login/LoginSplashActivity_;->intent(Landroid/content/Context;)Lcom/join/mgps/activity/login/LoginSplashActivity_$IntentBuilder_;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method public goMyAccountLoginActivityNewTask(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .line 2
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const/high16 v1, 0x10000000

    .line 3
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 4
    new-instance v1, Landroid/content/ComponentName;

    const-string v2, "com.join.mgps.activity.login.LoginSplashActivity_"

    invoke-direct {v1, p2, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 6
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public goMyGameManagerActivity(Landroid/content/Context;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/join/mgps/activity/MGMainActivity;

    if-eqz v0, :cond_0

    .line 2
    check-cast p1, Lcom/join/mgps/activity/MGMainActivity;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/MGMainActivity;->setTabSelect(I)V

    return-void

    .line 3
    :cond_0
    invoke-static {p1}, Lcom/join/mgps/activity/MyGameManagerActivity_;->g0(Landroid/content/Context;)Lcom/join/mgps/activity/MyGameManagerActivity_$a;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method public goMyVoucherActivity(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/Util/IntentUtil;->accountBean(Landroid/content/Context;)Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    .line 2
    invoke-virtual {p0, p1}, Lcom/join/mgps/Util/IntentUtil;->goLoginNetGame(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 3
    invoke-static {p1}, Lcom/join/mgps/activity/VoucherCodesBoxActivity_;->i0(Landroid/content/Context;)Lcom/join/mgps/activity/VoucherCodesBoxActivity_$c;

    move-result-object p1

    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/VoucherCodesBoxActivity_$c;->a(I)Lcom/join/mgps/activity/VoucherCodesBoxActivity_$c;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/VoucherCodesBoxActivity_$c;->b(I)Lcom/join/mgps/activity/VoucherCodesBoxActivity_$c;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    :cond_0
    return-void
.end method

.method public goOnlineGameCheckPage(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity_;->t0(Landroid/content/Context;)Lcom/join/mgps/activity/OnlineGameInstallCheckActivity_$c;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity_$c;->a(Ljava/lang/String;)Lcom/join/mgps/activity/OnlineGameInstallCheckActivity_$c;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method public goPAPayCenterActivity(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/join/mgps/Util/IntentUtil;->goLogin(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-static {p1}, Lcom/join/mgps/activity/PAPayCenterActivity_;->u0(Landroid/content/Context;)Lcom/join/mgps/activity/PAPayCenterActivity_$h;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    :cond_0
    return-void
.end method

.method public goQQChart(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "mqqwpa://im/chat?chat_type=wpa&uin="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "&version=1"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 2
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    invoke-direct {v0, v1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 3
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public goQQGroup(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 1
    :try_start_0
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/Util/IntentUtil;->joinQQGroup(Landroid/content/Context;Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 2
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public goReportFeedbackDetail(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_;->u0(Landroid/content/Context;)Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_$n;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_$n;->a(Ljava/lang/String;)Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_$n;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method public goSearchHintActivity(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/join/mgps/activity/SearchHintActivity_;->G1(Landroid/content/Context;)Lcom/join/mgps/activity/SearchHintActivity_$b0;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method public goSearchHintActivity(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 2
    invoke-static {p1}, Lcom/join/mgps/activity/SearchHintActivity_;->G1(Landroid/content/Context;)Lcom/join/mgps/activity/SearchHintActivity_$b0;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/join/mgps/activity/SearchHintActivity_$b0;->c(Ljava/lang/String;)Lcom/join/mgps/activity/SearchHintActivity_$b0;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method public goSearchHintActivity(Landroid/content/Context;Ljava/util/ArrayList;I)V
    .locals 0
    .param p2    # Ljava/util/ArrayList;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/ArrayList<",
            "Lcom/join/mgps/dto/SScrollingTxtBeanV2;",
            ">;I)V"
        }
    .end annotation

    .line 3
    invoke-static {p1}, Lcom/join/mgps/activity/SearchHintActivity_;->G1(Landroid/content/Context;)Lcom/join/mgps/activity/SearchHintActivity_$b0;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/join/mgps/activity/SearchHintActivity_$b0;->d(Ljava/util/ArrayList;)Lcom/join/mgps/activity/SearchHintActivity_$b0;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/join/mgps/activity/SearchHintActivity_$b0;->b(I)Lcom/join/mgps/activity/SearchHintActivity_$b0;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method public goSearchListActivity(Landroid/content/Context;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/join/mgps/activity/SearchListActivity1_;->d1(Landroid/content/Context;)Lcom/join/mgps/activity/SearchListActivity1_$r;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/join/mgps/activity/SearchListActivity1_$r;->e(Ljava/lang/String;)Lcom/join/mgps/activity/SearchListActivity1_$r;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/join/mgps/activity/SearchListActivity1_$r;->d(Z)Lcom/join/mgps/activity/SearchListActivity1_$r;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method public goShareWebActivity(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/join/mgps/Util/IntentDateBean;

    invoke-direct {v0}, Lcom/join/mgps/Util/IntentDateBean;-><init>()V

    const/4 v1, 0x4

    .line 2
    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type(I)V

    .line 3
    invoke-virtual {v0, p2}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type_val(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    return-void
.end method

.method public goShareWebActivityNewTask(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V
    .locals 4

    if-nez p1, :cond_0

    return-void

    :cond_0
    :try_start_0
    const-string v0, "com.join.android.app.mgsim.wufun"

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/high16 v2, 0x10000000

    if-nez v1, :cond_1

    .line 2
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    const-string v3, "intentdate"

    .line 3
    invoke-virtual {v1, v3, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 4
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    const-string p2, "com.join.mgps.activity.ShareWebActivity_"

    .line 5
    new-instance v2, Landroid/content/ComponentName;

    invoke-direct {v2, v0, p2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 7
    invoke-virtual {p1, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 8
    :cond_1
    invoke-static {p1}, Lcom/join/mgps/activity/ShareWebActivity_;->t2(Landroid/content/Context;)Lcom/join/mgps/activity/ShareWebActivity_$h0;

    move-result-object p1

    invoke-virtual {p1, v2}, Lorg/androidannotations/api/builder/e;->flags(I)Lorg/androidannotations/api/builder/e;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/ShareWebActivity_$h0;

    invoke-virtual {p1, p2}, Lcom/join/mgps/activity/ShareWebActivity_$h0;->b(Lcom/join/mgps/Util/IntentDateBean;)Lcom/join/mgps/activity/ShareWebActivity_$h0;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 9
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public goShareWebActivityNewTask(Landroid/content/Context;Ljava/lang/String;Lcom/join/mgps/Util/IntentDateBean;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 10
    :cond_0
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "intentdate"

    .line 11
    invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    const/high16 p3, 0x10000000

    .line 12
    invoke-virtual {v0, p3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    const-string p3, "com.join.mgps.activity.ShareWebActivity_"

    .line 13
    new-instance v1, Landroid/content/ComponentName;

    invoke-direct {v1, p2, p3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 15
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 16
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public goSmashGoldenEgg(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lcom/join/mgps/Util/IntentUtil;->goLoginInteractive(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/join/mgps/Util/IntentDateBean;

    invoke-direct {v0}, Lcom/join/mgps/Util/IntentDateBean;-><init>()V

    const/4 v1, 0x4

    .line 3
    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type(I)V

    const-string/jumbo v1, "\u7838\u91d1\u86cb"

    .line 4
    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setObject(Ljava/lang/Object;)V

    .line 5
    sget-object v1, Lcom/join/mgps/rpc/h;->O0:Ljava/lang/String;

    .line 6
    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type_val(Ljava/lang/String;)V

    .line 7
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    :cond_0
    return-void
.end method

.method public goSvip(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/join/mgps/rpc/h;->j:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/member/vip_view/welcome?go=svip"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/join/mgps/Util/IntentUtil;->goShareWebActivity(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public goTagGameListActivity(Landroid/content/Context;ILjava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/join/mgps/activity/TagGameListActivity_;->F0(Landroid/content/Context;)Lcom/join/mgps/activity/TagGameListActivity_$r;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/TagGameListActivity_$r;->b(I)Lcom/join/mgps/activity/TagGameListActivity_$r;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/join/mgps/activity/TagGameListActivity_$r;->e(I)Lcom/join/mgps/activity/TagGameListActivity_$r;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/join/mgps/activity/TagGameListActivity_$r;->d(Ljava/lang/String;)Lcom/join/mgps/activity/TagGameListActivity_$r;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method public goVip(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/join/mgps/rpc/h;->j:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/member/vip_view/welcome?go=vip"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/join/mgps/Util/IntentUtil;->goShareWebActivity(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public goVipCdk(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/join/mgps/rpc/h;->C:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/member/vip_view/welfare/cdk"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/join/mgps/Util/IntentUtil;->goShareWebActivity(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public goVipForum(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/join/mgps/rpc/h;->C:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/member/vip_view/welfare/forum"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/join/mgps/Util/IntentUtil;->goShareWebActivity(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public goVipMessage(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/join/mgps/rpc/h;->j:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/member/vip_view/welfare/ad"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/join/mgps/Util/IntentUtil;->goShareWebActivity(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public goWirelessSettings(Landroid/content/Context;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.settings.SETTINGS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    move-object/from16 v2, p2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, "  intentActivity"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v4, "info"

    invoke-static {v4, v0}, Lcom/join/mgps/Util/v0;->h(Ljava/lang/String;Ljava/lang/String;)V

    if-nez v2, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type()I

    move-result v0

    const-string v7, "\\|"

    const-string/jumbo v8, "\u6e38\u620f\u672a\u4e0b\u8f7d,\u8bf7\u5148\u4e0b\u8f7d\u6e38\u620f."

    const-string v9, "gameId"

    const-string v10, "com.join.downloadbygameid.action.broadcast"

    const-string v13, "MainPos"

    const/high16 v14, 0x24000000

    const-string v15, ""

    const/4 v6, 0x3

    const/4 v12, 0x2

    const/4 v5, 0x0

    const/4 v11, 0x1

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    goto/16 :goto_f

    .line 3
    :pswitch_1
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/activity/CollectionModuleSevenActivity_;->A0(Landroid/content/Context;)Lcom/join/mgps/activity/CollectionModuleSevenActivity_$k;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/join/mgps/activity/CollectionModuleSevenActivity_$k;->a(Ljava/lang/String;)Lcom/join/mgps/activity/CollectionModuleSevenActivity_$k;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto/16 :goto_f

    .line 4
    :pswitch_2
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2e

    .line 6
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v2

    invoke-virtual {v2, v0}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 7
    invoke-direct {v1, v3, v2}, Lcom/join/mgps/Util/IntentUtil;->checkAndDownloadApk(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_f

    .line 8
    :cond_1
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/service/CommonService_;->S2(Landroid/content/Context;)Lcom/join/mgps/service/CommonService_$h2;

    move-result-object v2

    const-string v3, "requestAndDownloadGameById"

    invoke-virtual {v2, v3, v0}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Ljava/lang/String;)Lorg/androidannotations/api/builder/e;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/service/CommonService_$h2;

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/g;->a()Landroid/content/ComponentName;

    goto/16 :goto_f

    .line 9
    :pswitch_3
    :try_start_0
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v0

    .line 10
    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2e

    .line 11
    invoke-virtual {v0, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v2, "\u5938\u514b"

    if-eqz v0, :cond_5

    .line 12
    array-length v4, v0

    if-lez v4, :cond_5

    .line 13
    aget-object v2, v0, v5

    .line 14
    array-length v4, v0

    if-le v4, v11, :cond_2

    .line 15
    aget-object v4, v0, v11

    goto :goto_0

    :cond_2
    move-object v4, v15

    .line 16
    :goto_0
    array-length v7, v0

    if-le v7, v12, :cond_3

    .line 17
    aget-object v15, v0, v12

    .line 18
    :cond_3
    array-length v7, v0

    if-le v7, v6, :cond_4

    const-string v5, "0"

    .line 19
    aget-object v0, v0, v6

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    move-object v6, v2

    move-object v7, v4

    move-object v5, v15

    move v4, v0

    goto :goto_2

    :cond_4
    move-object v6, v2

    move-object v7, v4

    move-object v5, v15

    goto :goto_1

    :cond_5
    move-object v6, v2

    move-object v5, v15

    move-object v7, v5

    :goto_1
    const/4 v4, 0x0

    .line 20
    :goto_2
    invoke-static/range {p1 .. p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v2, Lcom/papa/sim/statistic/Event;->clickSpeedDownUpQk:Lcom/papa/sim/statistic/Event;

    new-instance v8, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v8}, Lcom/papa/sim/statistic/Ext;-><init>()V

    const-string v9, "2057111073"

    invoke-virtual {v8, v9}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v8

    const-string v9, "pc"

    invoke-virtual {v8, v9}, Lcom/papa/sim/statistic/Ext;->setQkPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v8

    invoke-virtual {v0, v2, v8}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 21
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v2

    move-object/from16 v3, p1

    invoke-virtual/range {v2 .. v7}, Lcom/join/mgps/Util/IntentUtil;->startQuarkBrowser(Landroid/content/Context;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_f

    :catch_0
    move-exception v0

    .line 22
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_f

    .line 23
    :pswitch_4
    new-instance v0, Landroid/content/Intent;

    const-class v4, Lcom/join/kotlin/zone/CommonZoneActivity;

    invoke-direct {v0, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 24
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getExtBean()Lcom/join/mgps/dto/ExtBean;

    move-result-object v4

    const-string v5, "extBean"

    invoke-virtual {v0, v5, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 25
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v2

    const-string/jumbo v4, "zoneId"

    invoke-virtual {v0, v4, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 26
    invoke-virtual {v3, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_f

    .line 27
    :pswitch_5
    new-instance v0, Landroid/content/Intent;

    const-class v4, Lcom/join/kotlin/EverdayNewGameActivity;

    invoke-direct {v0, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 28
    :try_start_1
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    const-string v4, "default_position"

    .line 29
    invoke-virtual {v0, v4, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 30
    :catch_1
    invoke-virtual {v3, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_f

    .line 31
    :pswitch_6
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 32
    const-class v4, Lcom/join/mgps/activity/MGMainActivity_;

    invoke-virtual {v0, v3, v4}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 33
    invoke-virtual {v0, v14}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 34
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    const/4 v5, 0x7

    .line 35
    invoke-virtual {v4, v13, v5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v5, "currTabNumber"

    .line 36
    invoke-virtual {v4, v5, v11}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 37
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v2

    const-string v5, "currTabTagId"

    invoke-virtual {v4, v5, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    invoke-virtual {v0, v4}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 39
    invoke-virtual {v3, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_f

    .line 40
    :pswitch_7
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 41
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v2

    const-class v4, Lcom/join/mgps/dto/ReportIssueBean;

    invoke-virtual {v0, v2, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/ReportIssueBean;

    .line 42
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v2

    invoke-virtual {v0}, Lcom/join/mgps/dto/ReportIssueBean;->getIssue_id()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Lcom/join/mgps/Util/IntentUtil;->goReportFeedbackDetail(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_f

    .line 43
    :pswitch_8
    :try_start_2
    new-instance v0, Lcom/join/mgps/pref/PrefDef_;

    invoke-direct {v0, v3}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->wx_open_appid()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 44
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2e

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_2e

    const/4 v4, 0x0

    .line 45
    invoke-static {v0, v4}, Lcom/join/mgps/Util/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 46
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v4

    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v2

    const-class v5, Lcom/join/mgps/dto/WxMiniProgramBean;

    invoke-virtual {v4, v2, v5}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/WxMiniProgramBean;

    if-eqz v2, :cond_2e

    .line 47
    invoke-virtual {v2}, Lcom/join/mgps/dto/WxMiniProgramBean;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lcom/join/mgps/dto/WxMiniProgramBean;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v0, v4, v2}, Lcom/join/mgps/Util/UtilsMy;->o4(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto/16 :goto_f

    :catch_2
    move-exception v0

    .line 48
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_f

    :pswitch_9
    const/4 v4, 0x0

    .line 49
    :try_start_3
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 50
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v2

    const-class v4, Lcom/join/mgps/dto/IntroductionCommentDetailParamsBean;

    invoke-virtual {v0, v2, v4}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/IntroductionCommentDetailParamsBean;

    goto :goto_3

    :cond_6
    move-object v0, v4

    :goto_3
    if-eqz v0, :cond_7

    .line 51
    invoke-virtual {v0}, Lcom/join/mgps/dto/IntroductionCommentDetailParamsBean;->getGame_id()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v15

    .line 52
    invoke-virtual {v0}, Lcom/join/mgps/dto/IntroductionCommentDetailParamsBean;->getPost_id()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 53
    :cond_7
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/activity/IntroductionActivity_;->e1(Landroid/content/Context;)Lcom/join/mgps/activity/IntroductionActivity_$w;

    move-result-object v2

    const/16 v3, 0x64

    invoke-virtual {v2, v3}, Lcom/join/mgps/activity/IntroductionActivity_$w;->e(I)Lcom/join/mgps/activity/IntroductionActivity_$w;

    move-result-object v2

    invoke-virtual {v2, v15}, Lcom/join/mgps/activity/IntroductionActivity_$w;->a(Ljava/lang/String;)Lcom/join/mgps/activity/IntroductionActivity_$w;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/join/mgps/activity/IntroductionActivity_$w;->c(Lcom/join/mgps/dto/IntroductionCommentDetailParamsBean;)Lcom/join/mgps/activity/IntroductionActivity_$w;

    move-result-object v2

    invoke-virtual {v2, v5}, Lcom/join/mgps/activity/IntroductionActivity_$w;->d(I)Lcom/join/mgps/activity/IntroductionActivity_$w;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/join/mgps/activity/IntroductionActivity_$w;->c(Lcom/join/mgps/dto/IntroductionCommentDetailParamsBean;)Lcom/join/mgps/activity/IntroductionActivity_$w;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    goto/16 :goto_f

    :catch_3
    move-exception v0

    .line 54
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_f

    .line 55
    :pswitch_a
    :try_start_4
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getObject()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/Boolean;

    if-eqz v0, :cond_8

    .line 56
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getObject()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    move v5, v0

    goto :goto_4

    :catch_4
    move-exception v0

    .line 57
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 58
    :cond_8
    :goto_4
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_;->intent(Landroid/content/Context;)Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_$IntentBuilder_;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_$IntentBuilder_;->gameId(Ljava/lang/String;)Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_$IntentBuilder_;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_$IntentBuilder_;->autodown(Z)Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_$IntentBuilder_;

    move-result-object v0

    invoke-virtual {v0, v12}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_$IntentBuilder_;->from(I)Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_$IntentBuilder_;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getExtBean()Lcom/join/mgps/dto/ExtBean;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_$IntentBuilder_;->extBean(Lcom/join/mgps/dto/ExtBean;)Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_$IntentBuilder_;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto/16 :goto_f

    .line 59
    :pswitch_b
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/join/mgps/activity/GameDetailActivity_;

    invoke-direct {v4, v3, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 60
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    const-string v5, "fromid"

    invoke-virtual {v4, v5, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/16 v0, 0x2b61

    const-string v5, "_from"

    .line 61
    invoke-virtual {v4, v5, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 62
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 63
    :try_start_5
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    const-string v2, "groupuid"

    .line 64
    invoke-virtual {v4, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    goto :goto_5

    :catch_5
    move-exception v0

    .line 65
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 66
    :cond_9
    :goto_5
    invoke-virtual {v3, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_f

    .line 67
    :pswitch_c
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v0

    .line 68
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2e

    .line 69
    invoke-virtual {v0, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 70
    array-length v2, v0

    if-le v2, v11, :cond_2e

    .line 71
    aget-object v2, v0, v5

    .line 72
    aget-object v0, v0, v11

    .line 73
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/activity/GamePaiWeiActivty_;->o0(Landroid/content/Context;)Lcom/join/mgps/activity/GamePaiWeiActivty_$v;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/join/mgps/activity/GamePaiWeiActivty_$v;->a(Ljava/lang/String;)Lcom/join/mgps/activity/GamePaiWeiActivty_$v;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/join/mgps/activity/GamePaiWeiActivty_$v;->b(I)Lcom/join/mgps/activity/GamePaiWeiActivty_$v;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto/16 :goto_f

    .line 74
    :pswitch_d
    :try_start_6
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v0

    .line 75
    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2e

    .line 76
    invoke-virtual {v0, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2e

    .line 77
    array-length v2, v0

    if-lez v2, :cond_2e

    .line 78
    aget-object v2, v0, v5

    .line 79
    array-length v4, v0

    if-le v4, v11, :cond_a

    .line 80
    aget-object v15, v0, v11

    .line 81
    :cond_a
    invoke-static {v2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 82
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    goto :goto_6

    :cond_b
    const/4 v0, 0x0

    .line 83
    :goto_6
    invoke-static {v15}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_c

    .line 84
    invoke-static {v15}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    .line 85
    :cond_c
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/activity/label/MainLabelActivity_;->O0(Landroid/content/Context;)Lcom/join/mgps/activity/label/MainLabelActivity_$q;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/join/mgps/activity/label/MainLabelActivity_$q;->a(I)Lcom/join/mgps/activity/label/MainLabelActivity_$q;

    move-result-object v0

    invoke-virtual {v0, v11}, Lcom/join/mgps/activity/label/MainLabelActivity_$q;->b(I)Lcom/join/mgps/activity/label/MainLabelActivity_$q;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/join/mgps/activity/label/MainLabelActivity_$q;->d(I)Lcom/join/mgps/activity/label/MainLabelActivity_$q;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_e

    goto/16 :goto_f

    .line 86
    :pswitch_e
    new-instance v0, Lcom/join/mgps/dto/GameInfoBean;

    invoke-direct {v0}, Lcom/join/mgps/dto/GameInfoBean;-><init>()V

    .line 87
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getObject()Ljava/lang/Object;

    move-result-object v4

    instance-of v4, v4, Ljava/lang/String;

    if-eqz v4, :cond_d

    .line 88
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getObject()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v0, v4}, Lcom/join/mgps/dto/GameInfoBean;->setGame_name(Ljava/lang/String;)V

    .line 89
    :cond_d
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/join/mgps/dto/GameInfoBean;->setGame_id(Ljava/lang/String;)V

    .line 90
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/activity/arena/GameRoomListActivity_;->W3(Landroid/content/Context;)Lcom/join/mgps/activity/arena/GameRoomListActivity_$p0;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/join/mgps/activity/arena/GameRoomListActivity_$p0;->c(Lcom/join/mgps/dto/GameInfoBean;)Lcom/join/mgps/activity/arena/GameRoomListActivity_$p0;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto/16 :goto_f

    .line 91
    :pswitch_f
    new-instance v4, Lcom/join/mgps/dto/ForumBean$ForumTopicBean;

    invoke-direct {v4}, Lcom/join/mgps/dto/ForumBean$ForumTopicBean;-><init>()V

    .line 92
    :try_start_7
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/join/mgps/dto/ForumBean$ForumTopicBean;->setTid(I)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_6

    goto :goto_7

    :catch_6
    move-exception v0

    .line 93
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 94
    :goto_7
    invoke-static {v3, v4}, Lcom/join/mgps/Util/j0;->D0(Landroid/content/Context;Lcom/join/mgps/dto/ForumBean$ForumTopicBean;)V

    goto/16 :goto_f

    .line 95
    :pswitch_10
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/join/mgps/Util/IntentUtil;->gameid:Ljava/lang/String;

    .line 96
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/Util/IntentUtil;->gameid:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    iput-object v0, v1, Lcom/join/mgps/Util/IntentUtil;->downloadTask:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v0, :cond_e

    .line 97
    invoke-static {v3, v0}, Lcom/join/mgps/Util/UtilsMy;->n0(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_f

    .line 98
    :cond_e
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    iput-object v0, v1, Lcom/join/mgps/Util/IntentUtil;->intent2:Landroid/content/Intent;

    .line 99
    invoke-virtual {v0, v10}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 100
    iget-object v0, v1, Lcom/join/mgps/Util/IntentUtil;->intent2:Landroid/content/Intent;

    iget-object v2, v1, Lcom/join/mgps/Util/IntentUtil;->gameid:Ljava/lang/String;

    invoke-virtual {v0, v9, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 101
    iget-object v0, v1, Lcom/join/mgps/Util/IntentUtil;->intent2:Landroid/content/Intent;

    invoke-virtual {v3, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 102
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, v8}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    goto/16 :goto_f

    .line 103
    :pswitch_11
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/join/mgps/Util/IntentUtil;->gameid:Ljava/lang/String;

    .line 104
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/Util/IntentUtil;->gameid:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    iput-object v0, v1, Lcom/join/mgps/Util/IntentUtil;->downloadTask:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v0, :cond_f

    .line 105
    invoke-static {v3, v0}, Lcom/join/mgps/Util/UtilsMy;->n0(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_f

    .line 106
    :cond_f
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    iput-object v0, v1, Lcom/join/mgps/Util/IntentUtil;->intent2:Landroid/content/Intent;

    .line 107
    invoke-virtual {v0, v10}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 108
    iget-object v0, v1, Lcom/join/mgps/Util/IntentUtil;->intent2:Landroid/content/Intent;

    iget-object v2, v1, Lcom/join/mgps/Util/IntentUtil;->gameid:Ljava/lang/String;

    invoke-virtual {v0, v9, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 109
    iget-object v0, v1, Lcom/join/mgps/Util/IntentUtil;->intent2:Landroid/content/Intent;

    invoke-virtual {v3, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 110
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, v8}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    goto/16 :goto_f

    .line 111
    :pswitch_12
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/join/mgps/Util/IntentUtil;->gameid:Ljava/lang/String;

    .line 112
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/Util/IntentUtil;->gameid:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    iput-object v0, v1, Lcom/join/mgps/Util/IntentUtil;->downloadTask:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v0, :cond_10

    .line 113
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, "  checkupdate"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/join/mgps/Util/v0;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    iget-object v0, v1, Lcom/join/mgps/Util/IntentUtil;->downloadTask:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v3, v0}, Lcom/join/mgps/Util/UtilsMy;->n0(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_f

    .line 115
    :cond_10
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    iput-object v0, v1, Lcom/join/mgps/Util/IntentUtil;->intent2:Landroid/content/Intent;

    .line 116
    invoke-virtual {v0, v10}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 117
    iget-object v0, v1, Lcom/join/mgps/Util/IntentUtil;->intent2:Landroid/content/Intent;

    iget-object v2, v1, Lcom/join/mgps/Util/IntentUtil;->gameid:Ljava/lang/String;

    invoke-virtual {v0, v9, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 118
    iget-object v0, v1, Lcom/join/mgps/Util/IntentUtil;->intent2:Landroid/content/Intent;

    invoke-virtual {v3, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 119
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, v8}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    goto/16 :goto_f

    .line 120
    :pswitch_13
    :try_start_8
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_7

    goto :goto_8

    :catch_7
    move-exception v0

    .line 121
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 122
    :goto_8
    new-instance v0, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-direct {v0}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;-><init>()V

    .line 123
    invoke-virtual {v0, v5}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->setPid(I)V

    .line 124
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getExtBean()Lcom/join/mgps/dto/ExtBean;

    move-result-object v2

    invoke-static {v3, v0, v2}, Lcom/join/mgps/Util/j0;->w0(Landroid/content/Context;Lcom/join/mgps/dto/ForumBean$ForumPostsBean;Lcom/join/mgps/dto/ExtBean;)V

    goto/16 :goto_f

    .line 125
    :pswitch_14
    :try_start_9
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_8

    goto :goto_9

    :catch_8
    move-exception v0

    .line 126
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 127
    :goto_9
    :try_start_a
    new-instance v0, Lcom/join/mgps/dto/ForumBean;

    invoke-direct {v0}, Lcom/join/mgps/dto/ForumBean;-><init>()V

    .line 128
    invoke-virtual {v0, v5}, Lcom/join/mgps/dto/ForumBean;->setFid(I)V

    .line 129
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getExtBean()Lcom/join/mgps/dto/ExtBean;

    move-result-object v2

    invoke-static {v3, v0, v2}, Lcom/join/mgps/Util/j0;->s0(Landroid/content/Context;Lcom/join/mgps/dto/ForumBean;Lcom/join/mgps/dto/ExtBean;)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_9

    goto/16 :goto_f

    :catch_9
    move-exception v0

    .line 130
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_f

    .line 131
    :pswitch_15
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getObject()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/String;

    if-eqz v0, :cond_11

    .line 132
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getObject()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Ljava/lang/String;

    goto :goto_a

    .line 133
    :cond_11
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getObject()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_12

    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getObject()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/Boolean;

    if-eqz v0, :cond_12

    .line 134
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getObject()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    .line 135
    :cond_12
    :goto_a
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/activity/GameInformationActivityV2_;->n1(Landroid/content/Context;)Lcom/join/mgps/activity/GameInformationActivityV2_$y;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/join/mgps/activity/GameInformationActivityV2_$y;->c(Ljava/lang/String;)Lcom/join/mgps/activity/GameInformationActivityV2_$y;

    move-result-object v0

    invoke-virtual {v0, v15}, Lcom/join/mgps/activity/GameInformationActivityV2_$y;->d(Ljava/lang/String;)Lcom/join/mgps/activity/GameInformationActivityV2_$y;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/join/mgps/activity/GameInformationActivityV2_$y;->a(Z)Lcom/join/mgps/activity/GameInformationActivityV2_$y;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getExtBean()Lcom/join/mgps/dto/ExtBean;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/join/mgps/activity/GameInformationActivityV2_$y;->b(Lcom/join/mgps/dto/ExtBean;)Lcom/join/mgps/activity/GameInformationActivityV2_$y;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto/16 :goto_f

    .line 136
    :pswitch_16
    :try_start_b
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v4, "android.intent.action.VIEW"

    .line 137
    invoke-virtual {v0, v4}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 138
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v4

    const-string v5, "://"

    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_13

    .line 139
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    const-string/jumbo v2, "\u7f51\u7edc\u8fde\u63a5\u9519\u8bef"

    invoke-virtual {v0, v2}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void

    .line 140
    :cond_13
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 141
    invoke-virtual {v0, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 142
    invoke-virtual {v3, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_a

    goto/16 :goto_f

    :catch_a
    move-exception v0

    .line 143
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_f

    .line 144
    :pswitch_17
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v0

    .line 145
    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_15

    const-string v4, ".taobao.com/"

    invoke-virtual {v0, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_14

    const-string v4, ".tmall.com/"

    invoke-virtual {v0, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_15

    :cond_14
    invoke-static/range {p1 .. p1}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v4

    const-string v5, "com.taobao.taobao"

    invoke-virtual {v4, v3, v5}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_15

    .line 146
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    const-string v4, "android.intent.action.VIEW"

    .line 147
    invoke-virtual {v2, v4}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 148
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 149
    invoke-virtual {v2, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    const-string v0, "com.taobao.tao.detail.activity.DetailActivity"

    .line 150
    invoke-virtual {v2, v5, v0}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 151
    invoke-virtual {v3, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_f

    .line 152
    :cond_15
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/activity/ShareWebActivity_;->t2(Landroid/content/Context;)Lcom/join/mgps/activity/ShareWebActivity_$h0;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/join/mgps/activity/ShareWebActivity_$h0;->b(Lcom/join/mgps/Util/IntentDateBean;)Lcom/join/mgps/activity/ShareWebActivity_$h0;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto/16 :goto_f

    :pswitch_18
    const/16 v0, 0xa

    .line 153
    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->b2(I)I

    .line 154
    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->c2(I)Ljava/lang/String;

    .line 155
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getJump_type()I

    move-result v4

    if-eq v4, v11, :cond_23

    if-eq v4, v12, :cond_1f

    if-eq v4, v6, :cond_1e

    const/4 v7, 0x4

    if-eq v4, v7, :cond_1d

    const/4 v7, 0x6

    if-eq v4, v7, :cond_1c

    const/4 v7, 0x7

    if-eq v4, v7, :cond_1b

    const/16 v7, 0x8

    if-eq v4, v7, :cond_1a

    const/16 v7, 0x23

    if-eq v4, v7, :cond_19

    const/16 v7, 0x46

    if-eq v4, v7, :cond_18

    packed-switch v4, :pswitch_data_1

    packed-switch v4, :pswitch_data_2

    const-string/jumbo v5, "title"

    packed-switch v4, :pswitch_data_3

    .line 156
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 157
    const-class v2, Lcom/join/mgps/activity/MGMainActivity_;

    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 158
    invoke-virtual {v0, v14}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 159
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const/4 v4, 0x7

    .line 160
    invoke-virtual {v2, v13, v4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 161
    invoke-virtual {v0, v2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 162
    invoke-virtual {v3, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_f

    .line 163
    :pswitch_19
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/activity/EndGameDetailActivity_;->C0(Landroid/content/Context;)Lcom/join/mgps/activity/EndGameDetailActivity_$o;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/join/mgps/activity/EndGameDetailActivity_$o;->a(Ljava/lang/String;)Lcom/join/mgps/activity/EndGameDetailActivity_$o;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/join/mgps/activity/EndGameDetailActivity_$o;->b(Ljava/lang/String;)Lcom/join/mgps/activity/EndGameDetailActivity_$o;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto/16 :goto_f

    .line 164
    :pswitch_1a
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/activity/EndGameActivity_;->U0(Landroid/content/Context;)Lcom/join/mgps/activity/EndGameActivity_$t;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto/16 :goto_f

    .line 165
    :pswitch_1b
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/activity/SimulatorFastEntryActivity_;->p0(Landroid/content/Context;)Lcom/join/mgps/activity/SimulatorFastEntryActivity_$k;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto/16 :goto_f

    .line 166
    :pswitch_1c
    new-instance v0, Landroid/content/Intent;

    const-class v4, Lcom/join/kotlin/ui/modleregin/BtReginActivity;

    invoke-direct {v0, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 167
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getObject()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_16

    .line 168
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getObject()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 169
    invoke-virtual {v0, v5, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 170
    :cond_16
    invoke-virtual {v3, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_f

    .line 171
    :pswitch_1d
    new-instance v0, Landroid/content/Intent;

    const-class v4, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity;

    invoke-direct {v0, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 172
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getObject()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_17

    .line 173
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getObject()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 174
    invoke-virtual {v0, v5, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 175
    :cond_17
    invoke-virtual {v3, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_f

    :pswitch_1e
    const/16 v0, 0xe

    .line 176
    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->b2(I)I

    move-result v2

    .line 177
    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->c2(I)Ljava/lang/String;

    move-result-object v0

    .line 178
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/activity/SimulatorAreaActivity_;->A0(Landroid/content/Context;)Lcom/join/mgps/activity/SimulatorAreaActivity_$n;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/join/mgps/activity/SimulatorAreaActivity_$n;->b(I)Lcom/join/mgps/activity/SimulatorAreaActivity_$n;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/join/mgps/activity/SimulatorAreaActivity_$n;->a(Ljava/lang/String;)Lcom/join/mgps/activity/SimulatorAreaActivity_$n;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto/16 :goto_f

    :pswitch_1f
    const/16 v0, 0xc

    .line 179
    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->b2(I)I

    move-result v2

    .line 180
    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->c2(I)Ljava/lang/String;

    move-result-object v0

    .line 181
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/activity/SimulatorAreaActivity_;->A0(Landroid/content/Context;)Lcom/join/mgps/activity/SimulatorAreaActivity_$n;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/join/mgps/activity/SimulatorAreaActivity_$n;->b(I)Lcom/join/mgps/activity/SimulatorAreaActivity_$n;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/join/mgps/activity/SimulatorAreaActivity_$n;->a(Ljava/lang/String;)Lcom/join/mgps/activity/SimulatorAreaActivity_$n;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto/16 :goto_f

    :pswitch_20
    const/16 v0, 0xb

    .line 182
    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->b2(I)I

    move-result v2

    .line 183
    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->c2(I)Ljava/lang/String;

    move-result-object v0

    .line 184
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/activity/SimulatorAreaActivity_;->A0(Landroid/content/Context;)Lcom/join/mgps/activity/SimulatorAreaActivity_$n;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/join/mgps/activity/SimulatorAreaActivity_$n;->b(I)Lcom/join/mgps/activity/SimulatorAreaActivity_$n;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/join/mgps/activity/SimulatorAreaActivity_$n;->a(Ljava/lang/String;)Lcom/join/mgps/activity/SimulatorAreaActivity_$n;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto/16 :goto_f

    .line 185
    :pswitch_21
    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->b2(I)I

    move-result v2

    .line 186
    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->c2(I)Ljava/lang/String;

    move-result-object v0

    .line 187
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/activity/SimulatorAreaActivity_;->A0(Landroid/content/Context;)Lcom/join/mgps/activity/SimulatorAreaActivity_$n;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/join/mgps/activity/SimulatorAreaActivity_$n;->b(I)Lcom/join/mgps/activity/SimulatorAreaActivity_$n;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/join/mgps/activity/SimulatorAreaActivity_$n;->a(Ljava/lang/String;)Lcom/join/mgps/activity/SimulatorAreaActivity_$n;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto/16 :goto_f

    .line 188
    :pswitch_22
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/activity/PaPaStandAloneV2Activity_;->m0(Landroid/content/Context;)Lcom/join/mgps/activity/PaPaStandAloneV2Activity_$f;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto/16 :goto_f

    .line 189
    :pswitch_23
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/activity/vipzone/VipCenterActivity_;->intent(Landroid/content/Context;)Lcom/join/mgps/activity/vipzone/VipCenterActivity_$IntentBuilder_;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto/16 :goto_f

    .line 190
    :pswitch_24
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/activity/vipzone/VipSpecialZoneActivity_;->intent(Landroid/content/Context;)Lcom/join/mgps/activity/vipzone/VipSpecialZoneActivity_$IntentBuilder_;

    move-result-object v0

    const/16 v2, 0x37

    invoke-virtual {v0, v2}, Lcom/join/mgps/activity/vipzone/VipSpecialZoneActivity_$IntentBuilder_;->boardId(I)Lcom/join/mgps/activity/vipzone/VipSpecialZoneActivity_$IntentBuilder_;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto/16 :goto_f

    .line 191
    :pswitch_25
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/activity/vipzone/VipSpecialZoneActivity_;->intent(Landroid/content/Context;)Lcom/join/mgps/activity/vipzone/VipSpecialZoneActivity_$IntentBuilder_;

    move-result-object v0

    const/16 v2, 0x36

    invoke-virtual {v0, v2}, Lcom/join/mgps/activity/vipzone/VipSpecialZoneActivity_$IntentBuilder_;->boardId(I)Lcom/join/mgps/activity/vipzone/VipSpecialZoneActivity_$IntentBuilder_;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto/16 :goto_f

    .line 192
    :pswitch_26
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/activity/vipzone/VipSpecialZoneActivity_;->intent(Landroid/content/Context;)Lcom/join/mgps/activity/vipzone/VipSpecialZoneActivity_$IntentBuilder_;

    move-result-object v0

    const/16 v2, 0x35

    invoke-virtual {v0, v2}, Lcom/join/mgps/activity/vipzone/VipSpecialZoneActivity_$IntentBuilder_;->boardId(I)Lcom/join/mgps/activity/vipzone/VipSpecialZoneActivity_$IntentBuilder_;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto/16 :goto_f

    .line 193
    :pswitch_27
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/activity/vipzone/VipSpecialZoneActivity_;->intent(Landroid/content/Context;)Lcom/join/mgps/activity/vipzone/VipSpecialZoneActivity_$IntentBuilder_;

    move-result-object v0

    const/16 v2, 0x34

    invoke-virtual {v0, v2}, Lcom/join/mgps/activity/vipzone/VipSpecialZoneActivity_$IntentBuilder_;->boardId(I)Lcom/join/mgps/activity/vipzone/VipSpecialZoneActivity_$IntentBuilder_;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto/16 :goto_f

    .line 194
    :pswitch_28
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/Util/s;->i(Landroid/content/Context;)V

    goto/16 :goto_f

    .line 195
    :pswitch_29
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/join/mgps/Util/IntentUtil;->goMGSettingActivity(Landroid/content/Context;)V

    goto/16 :goto_f

    .line 196
    :pswitch_2a
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/join/mgps/Util/IntentUtil;->goSvip(Landroid/content/Context;)V

    goto/16 :goto_f

    .line 197
    :pswitch_2b
    new-instance v0, Lcom/join/mgps/Util/IntentDateBean;

    invoke-direct {v0}, Lcom/join/mgps/Util/IntentDateBean;-><init>()V

    const/4 v2, 0x4

    .line 198
    invoke-virtual {v0, v2}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type(I)V

    .line 199
    sget-object v2, Lcom/join/mgps/rpc/h;->r:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type_val(Ljava/lang/String;)V

    .line 200
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/activity/ShareWebActivity_;->t2(Landroid/content/Context;)Lcom/join/mgps/activity/ShareWebActivity_$h0;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/join/mgps/activity/ShareWebActivity_$h0;->b(Lcom/join/mgps/Util/IntentDateBean;)Lcom/join/mgps/activity/ShareWebActivity_$h0;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto/16 :goto_f

    .line 201
    :pswitch_2c
    invoke-virtual/range {p0 .. p1}, Lcom/join/mgps/Util/IntentUtil;->goLogin(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2e

    .line 202
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/join/mgps/Util/IntentUtil;->goMYAccountDetialActivity(Landroid/content/Context;)V

    goto/16 :goto_f

    .line 203
    :pswitch_2d
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/activity/GameDiscoverActivity_;->r0(Landroid/content/Context;)Lcom/join/mgps/activity/GameDiscoverActivity_$h;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getExtBean()Lcom/join/mgps/dto/ExtBean;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/join/mgps/activity/GameDiscoverActivity_$h;->a(Lcom/join/mgps/dto/ExtBean;)Lcom/join/mgps/activity/GameDiscoverActivity_$h;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto/16 :goto_f

    .line 204
    :pswitch_2e
    invoke-virtual/range {p0 .. p1}, Lcom/join/mgps/Util/IntentUtil;->goLogin(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2e

    .line 205
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/activity/CommentSelfListActivityv2_;->H0(Landroid/content/Context;)Lcom/join/mgps/activity/CommentSelfListActivityv2_$k;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto/16 :goto_f

    .line 206
    :pswitch_2f
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/activity/ClassifyAndRankActivity_;->j0(Landroid/content/Context;)Lcom/join/mgps/activity/ClassifyAndRankActivity_$f;

    move-result-object v0

    invoke-virtual {v0, v12}, Lcom/join/mgps/activity/ClassifyAndRankActivity_$f;->b(I)Lcom/join/mgps/activity/ClassifyAndRankActivity_$f;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto/16 :goto_f

    .line 207
    :pswitch_30
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/activity/LargeSingePlayerGameActivity_;->k0(Landroid/content/Context;)Lcom/join/mgps/activity/LargeSingePlayerGameActivity_$g;

    move-result-object v0

    invoke-virtual {v0, v11}, Lcom/join/mgps/activity/LargeSingePlayerGameActivity_$g;->a(I)Lcom/join/mgps/activity/LargeSingePlayerGameActivity_$g;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto/16 :goto_f

    .line 208
    :pswitch_31
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/join/mgps/Util/IntentUtil;->goDownloadSettingActivity(Landroid/content/Context;)V

    goto/16 :goto_f

    .line 209
    :pswitch_32
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/join/mgps/Util/IntentUtil;->goFeedback(Landroid/content/Context;)V

    goto/16 :goto_f

    .line 210
    :pswitch_33
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/join/mgps/Util/IntentUtil;->goDownloadSettingActivity(Landroid/content/Context;)V

    goto/16 :goto_f

    .line 211
    :pswitch_34
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/join/mgps/rpc/h;->w:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "/Auxiliary_tool"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/Util/IntentUtil;->goShareWebActivity(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_f

    .line 212
    :pswitch_35
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/join/mgps/Util/IntentUtil;->goJoystickManager(Landroid/content/Context;)V

    goto/16 :goto_f

    .line 213
    :pswitch_36
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/join/mgps/Util/IntentUtil;->goFaceTransferHomePageActivity(Landroid/content/Context;)V

    goto/16 :goto_f

    .line 214
    :pswitch_37
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    .line 215
    invoke-virtual/range {p0 .. p1}, Lcom/join/mgps/Util/IntentUtil;->goLogin(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_2e

    .line 216
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/activity/VoucherCodesBoxActivity_;->i0(Landroid/content/Context;)Lcom/join/mgps/activity/VoucherCodesBoxActivity_$c;

    move-result-object v2

    invoke-virtual {v2, v11}, Lcom/join/mgps/activity/VoucherCodesBoxActivity_$c;->b(I)Lcom/join/mgps/activity/VoucherCodesBoxActivity_$c;

    move-result-object v2

    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/join/mgps/activity/VoucherCodesBoxActivity_$c;->a(I)Lcom/join/mgps/activity/VoucherCodesBoxActivity_$c;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto/16 :goto_f

    .line 217
    :pswitch_38
    invoke-virtual/range {p0 .. p1}, Lcom/join/mgps/Util/IntentUtil;->goLogin(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2e

    .line 218
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/join/mgps/rpc/h;->j:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "/static/vip2020/v2/index.html#/giftCenter"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/Util/IntentUtil;->goShareWebActivity(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_f

    .line 219
    :pswitch_39
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    .line 220
    invoke-virtual/range {p0 .. p1}, Lcom/join/mgps/Util/IntentUtil;->goLogin(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2e

    .line 221
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/join/mgps/Util/IntentUtil;->goPAPayCenterActivity(Landroid/content/Context;)V

    goto/16 :goto_f

    .line 222
    :pswitch_3a
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    invoke-virtual {v0, v5, v3}, Lcom/join/mgps/Util/IntentUtil;->goForumAndPrfileActivity(ILandroid/content/Context;)V

    goto/16 :goto_f

    .line 223
    :pswitch_3b
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/join/mgps/Util/IntentUtil;->goForumMyDynamicActivity(Landroid/content/Context;)V

    goto/16 :goto_f

    .line 224
    :pswitch_3c
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/join/mgps/Util/IntentUtil;->goForumProfileMessageActivity(Landroid/content/Context;)V

    goto/16 :goto_f

    .line 225
    :pswitch_3d
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/activity/ClassifyAndRankActivity_;->j0(Landroid/content/Context;)Lcom/join/mgps/activity/ClassifyAndRankActivity_$f;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/join/mgps/activity/ClassifyAndRankActivity_$f;->b(I)Lcom/join/mgps/activity/ClassifyAndRankActivity_$f;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto/16 :goto_f

    .line 226
    :pswitch_3e
    invoke-virtual/range {p0 .. p1}, Lcom/join/mgps/Util/IntentUtil;->goLoginNetGame(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2e

    invoke-virtual/range {p0 .. p1}, Lcom/join/mgps/Util/IntentUtil;->goCodesBoxActivity(Landroid/content/Context;)V

    goto/16 :goto_f

    .line 227
    :pswitch_3f
    invoke-direct/range {p0 .. p1}, Lcom/join/mgps/Util/IntentUtil;->accountBean(Landroid/content/Context;)Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    .line 228
    invoke-virtual/range {p0 .. p1}, Lcom/join/mgps/Util/IntentUtil;->goLoginNetGame(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_2e

    .line 229
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/activity/VoucherCodesBoxActivity_;->i0(Landroid/content/Context;)Lcom/join/mgps/activity/VoucherCodesBoxActivity_$c;

    move-result-object v2

    invoke-virtual {v2, v11}, Lcom/join/mgps/activity/VoucherCodesBoxActivity_$c;->b(I)Lcom/join/mgps/activity/VoucherCodesBoxActivity_$c;

    move-result-object v2

    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/join/mgps/activity/VoucherCodesBoxActivity_$c;->a(I)Lcom/join/mgps/activity/VoucherCodesBoxActivity_$c;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto/16 :goto_f

    .line 230
    :pswitch_40
    invoke-virtual/range {p0 .. p1}, Lcom/join/mgps/Util/IntentUtil;->goLogin(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2e

    .line 231
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/activity/PAPayCenterActivity_;->u0(Landroid/content/Context;)Lcom/join/mgps/activity/PAPayCenterActivity_$h;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto/16 :goto_f

    .line 232
    :cond_18
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/activity/hideapp/HideAppHomeActivity_;->l0(Landroid/content/Context;)Lcom/join/mgps/activity/hideapp/HideAppHomeActivity_$c;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    .line 233
    invoke-static/range {p1 .. p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v2, Lcom/papa/sim/statistic/Event;->clickfakeAPP:Lcom/papa/sim/statistic/Event;

    new-instance v3, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v3}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {v0, v2, v3}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto/16 :goto_f

    .line 234
    :cond_19
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/activity/DocumentManageActivity_;->S0(Landroid/content/Context;)Lcom/join/mgps/activity/DocumentManageActivity_$u;

    move-result-object v0

    invoke-virtual {v0, v12}, Lcom/join/mgps/activity/DocumentManageActivity_$u;->a(I)Lcom/join/mgps/activity/DocumentManageActivity_$u;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/join/mgps/activity/DocumentManageActivity_$u;->b(Ljava/lang/String;)Lcom/join/mgps/activity/DocumentManageActivity_$u;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    .line 235
    invoke-static/range {p1 .. p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v4, Lcom/papa/sim/statistic/Event;->startArchiveManagement:Lcom/papa/sim/statistic/Event;

    invoke-static/range {p1 .. p1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v2

    const-string v5, "2"

    invoke-virtual {v0, v4, v3, v2, v5}, Lcom/papa/sim/statistic/p;->X0(Lcom/papa/sim/statistic/Event;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_f

    .line 236
    :cond_1a
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/activity/MGInformationActivity_;->v0(Landroid/content/Context;)Lcom/join/mgps/activity/MGInformationActivity_$l;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getExtBean()Lcom/join/mgps/dto/ExtBean;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/join/mgps/activity/MGInformationActivity_$l;->a(Lcom/join/mgps/dto/ExtBean;)Lcom/join/mgps/activity/MGInformationActivity_$l;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto/16 :goto_f

    .line 237
    :cond_1b
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/activity/GameDiscoverActivity_;->r0(Landroid/content/Context;)Lcom/join/mgps/activity/GameDiscoverActivity_$h;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getExtBean()Lcom/join/mgps/dto/ExtBean;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/join/mgps/activity/GameDiscoverActivity_$h;->a(Lcom/join/mgps/dto/ExtBean;)Lcom/join/mgps/activity/GameDiscoverActivity_$h;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto/16 :goto_f

    .line 238
    :cond_1c
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 239
    const-class v2, Lcom/join/mgps/activity/MGMainActivity_;

    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 240
    invoke-virtual {v0, v14}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 241
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 242
    invoke-virtual {v2, v13, v12}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 243
    invoke-virtual {v0, v2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 244
    invoke-virtual {v3, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_f

    .line 245
    :cond_1d
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/activity/ForumIndexActivity_;->i0(Landroid/content/Context;)Lcom/join/mgps/activity/ForumIndexActivity_$d;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto/16 :goto_f

    .line 246
    :cond_1e
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/activity/NewArenaMainActivty_;->g1(Landroid/content/Context;)Lcom/join/mgps/activity/NewArenaMainActivty_$h;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto/16 :goto_f

    .line 247
    :cond_1f
    :try_start_c
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_20

    .line 248
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_b

    goto :goto_b

    :catch_b
    move-exception v0

    .line 249
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_20
    const/4 v0, 0x1

    :goto_b
    if-ne v0, v11, :cond_21

    .line 250
    new-instance v0, Landroid/content/Intent;

    const-class v2, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;

    invoke-direct {v0, v3, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string/jumbo v2, "typeId"

    .line 251
    invoke-virtual {v0, v2, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string/jumbo v2, "tagId"

    const-string v4, "0"

    .line 252
    invoke-virtual {v0, v2, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string/jumbo v2, "tagName"

    const-string/jumbo v4, "\u5168\u90e8\u6e38\u620f"

    .line 253
    invoke-virtual {v0, v2, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 254
    invoke-virtual {v3, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_f

    .line 255
    :cond_21
    new-instance v4, Landroid/content/Intent;

    const-class v5, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;

    invoke-direct {v4, v3, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string/jumbo v5, "typeId"

    .line 256
    invoke-virtual {v4, v5, v11}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 257
    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->b2(I)I

    move-result v5

    const-string/jumbo v6, "tagId"

    invoke-virtual {v4, v6, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 258
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getExt1()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_22

    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->c2(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_c

    :cond_22
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getExt1()Ljava/lang/String;

    move-result-object v0

    :goto_c
    const-string/jumbo v2, "tagName"

    invoke-virtual {v4, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 259
    invoke-virtual {v3, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_f

    .line 260
    :cond_23
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 261
    const-class v2, Lcom/join/mgps/activity/MGMainActivity_;

    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 262
    invoke-virtual {v0, v14}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 263
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 264
    invoke-virtual {v2, v13, v6}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 265
    invoke-virtual {v0, v2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 266
    invoke-virtual {v3, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_f

    .line 267
    :pswitch_41
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getTpl_type()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2e

    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getTpl_type()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_2e

    .line 268
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getTpl_type()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    if-eq v0, v12, :cond_27

    if-eq v0, v6, :cond_26

    const/4 v4, 0x4

    if-eq v0, v4, :cond_25

    const/4 v4, 0x6

    if-eq v0, v4, :cond_24

    goto/16 :goto_f

    .line 269
    :cond_24
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/activity/CollectionModuleSixActivity_;->L0(Landroid/content/Context;)Lcom/join/mgps/activity/CollectionModuleSixActivity_$x;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/join/mgps/activity/CollectionModuleSixActivity_$x;->a(Ljava/lang/String;)Lcom/join/mgps/activity/CollectionModuleSixActivity_$x;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getExtBean()Lcom/join/mgps/dto/ExtBean;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/join/mgps/activity/CollectionModuleSixActivity_$x;->b(Lcom/join/mgps/dto/ExtBean;)Lcom/join/mgps/activity/CollectionModuleSixActivity_$x;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto/16 :goto_f

    .line 270
    :cond_25
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/activity/CollectionModuleFourActivity_;->F0(Landroid/content/Context;)Lcom/join/mgps/activity/CollectionModuleFourActivity_$s;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/join/mgps/activity/CollectionModuleFourActivity_$s;->a(Ljava/lang/String;)Lcom/join/mgps/activity/CollectionModuleFourActivity_$s;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getExtBean()Lcom/join/mgps/dto/ExtBean;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/join/mgps/activity/CollectionModuleFourActivity_$s;->b(Lcom/join/mgps/dto/ExtBean;)Lcom/join/mgps/activity/CollectionModuleFourActivity_$s;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto/16 :goto_f

    .line 271
    :cond_26
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/activity/CollectionModuleThreeActivity_;->p0(Landroid/content/Context;)Lcom/join/mgps/activity/CollectionModuleThreeActivity_$h;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/join/mgps/activity/CollectionModuleThreeActivity_$h;->a(Ljava/lang/String;)Lcom/join/mgps/activity/CollectionModuleThreeActivity_$h;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getExtBean()Lcom/join/mgps/dto/ExtBean;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/join/mgps/activity/CollectionModuleThreeActivity_$h;->b(Lcom/join/mgps/dto/ExtBean;)Lcom/join/mgps/activity/CollectionModuleThreeActivity_$h;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto/16 :goto_f

    .line 272
    :cond_27
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/activity/CollectionModuleTwoActivity_;->H0(Landroid/content/Context;)Lcom/join/mgps/activity/CollectionModuleTwoActivity_$s;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/join/mgps/activity/CollectionModuleTwoActivity_$s;->a(Ljava/lang/String;)Lcom/join/mgps/activity/CollectionModuleTwoActivity_$s;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getExtBean()Lcom/join/mgps/dto/ExtBean;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/join/mgps/activity/CollectionModuleTwoActivity_$s;->b(Lcom/join/mgps/dto/ExtBean;)Lcom/join/mgps/activity/CollectionModuleTwoActivity_$s;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto/16 :goto_f

    .line 273
    :pswitch_42
    :try_start_d
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getTpl_type()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_28

    const/4 v4, 0x0

    goto :goto_d

    :cond_28
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getTpl_type()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_d

    move v4, v0

    .line 274
    :goto_d
    :try_start_e
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getObject()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/Boolean;

    if-eqz v0, :cond_29

    .line 275
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getObject()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_c

    goto :goto_e

    :catch_c
    move-exception v0

    .line 276
    :try_start_f
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 277
    :cond_29
    :goto_e
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getExtBean()Lcom/join/mgps/dto/ExtBean;

    move-result-object v0

    if-nez v0, :cond_2a

    .line 278
    new-instance v0, Lcom/join/mgps/dto/ExtBean;

    invoke-direct {v0}, Lcom/join/mgps/dto/ExtBean;-><init>()V

    invoke-virtual {v2, v0}, Lcom/join/mgps/Util/IntentDateBean;->setExtBean(Lcom/join/mgps/dto/ExtBean;)V

    :cond_2a
    if-eq v4, v11, :cond_2c

    if-eq v4, v6, :cond_2b

    .line 279
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_;->intent(Landroid/content/Context;)Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_$IntentBuilder_;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_$IntentBuilder_;->gameId(Ljava/lang/String;)Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_$IntentBuilder_;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_$IntentBuilder_;->autodown(Z)Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_$IntentBuilder_;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getExtBean()Lcom/join/mgps/dto/ExtBean;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_$IntentBuilder_;->extBean(Lcom/join/mgps/dto/ExtBean;)Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_$IntentBuilder_;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto :goto_f

    .line 280
    :cond_2b
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_;->intent(Landroid/content/Context;)Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_$IntentBuilder_;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_$IntentBuilder_;->gameId(Ljava/lang/String;)Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_$IntentBuilder_;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_$IntentBuilder_;->autodown(Z)Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_$IntentBuilder_;

    move-result-object v0

    invoke-virtual {v0, v12}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_$IntentBuilder_;->from(I)Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_$IntentBuilder_;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getExtBean()Lcom/join/mgps/dto/ExtBean;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_$IntentBuilder_;->extBean(Lcom/join/mgps/dto/ExtBean;)Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_$IntentBuilder_;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto :goto_f

    .line 281
    :cond_2c
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getJump_type()I

    move-result v0

    if-nez v0, :cond_2d

    .line 282
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/activity/MGGameDetailActivity_;->g3(Landroid/content/Context;)Lcom/join/mgps/activity/MGGameDetailActivity_$m1;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/join/mgps/activity/MGGameDetailActivity_$m1;->b(Lcom/join/mgps/Util/IntentDateBean;)Lcom/join/mgps/activity/MGGameDetailActivity_$m1;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getExtBean()Lcom/join/mgps/dto/ExtBean;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/join/mgps/activity/MGGameDetailActivity_$m1;->a(Lcom/join/mgps/dto/ExtBean;)Lcom/join/mgps/activity/MGGameDetailActivity_$m1;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto :goto_f

    .line 283
    :cond_2d
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_;->intent(Landroid/content/Context;)Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_$IntentBuilder_;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_$IntentBuilder_;->gameId(Ljava/lang/String;)Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_$IntentBuilder_;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_$IntentBuilder_;->autodown(Z)Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_$IntentBuilder_;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/Util/IntentDateBean;->getExtBean()Lcom/join/mgps/dto/ExtBean;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_$IntentBuilder_;->extBean(Lcom/join/mgps/dto/ExtBean;)Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_$IntentBuilder_;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_d

    goto :goto_f

    :catch_d
    move-exception v0

    .line 284
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :catch_e
    :cond_2e
    :goto_f
    :pswitch_43
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_42
        :pswitch_41
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_0
        :pswitch_0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_c
        :pswitch_0
        :pswitch_b
        :pswitch_a
        :pswitch_0
        :pswitch_0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0xa
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_43
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1d
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x2f
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
    .end packed-switch
.end method

.method public isLogined(Landroid/content/Context;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/Util/IntentUtil;->accountBean(Landroid/content/Context;)Lcom/wufan/user/service/protobuf/n0;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public isNotLogin(Landroid/content/Context;)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/join/mgps/Util/IntentUtil;->isLogined(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/join/mgps/Util/IntentUtil;->isTourist(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public isTourist(Landroid/content/Context;)Z
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/Util/b;->isTourist()Z

    move-result p1

    return p1
.end method

.method public joinQQGroup(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mqqopensdkapi://bizAgent/qm/qr?url=http%3A%2F%2Fqm.qq.com%2Fcgi-bin%2Fqm%2Fqr%3Ffrom%3Dapp%26p%3Dandroid%26k%3D"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 3
    :try_start_0
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    const/4 p1, 0x0

    return p1
.end method

.method public setSplashActivity(Landroid/app/Activity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/Util/IntentUtil;->splashActivity:Landroid/app/Activity;

    return-void
.end method

.method public startActivity(Landroid/content/Context;Ljava/lang/Class;Landroid/content/Intent;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/join/mgps/Util/IntentUtil;->startActivityWithCallback(Landroid/content/Context;Ljava/lang/Class;Landroid/content/Intent;Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;)V

    return-void
.end method

.method public startActivityWithCallback(Landroid/content/Context;Ljava/lang/Class;Landroid/content/Intent;Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p1, p2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v1, 0x10000000

    .line 2
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    if-eqz p4, :cond_0

    .line 3
    invoke-static {}, Lcom/join/kotlin/base/dialog/DialogActivityManager;->get()Lcom/join/kotlin/base/dialog/DialogActivityManager;

    move-result-object v1

    invoke-virtual {v1, p2, p4}, Lcom/join/kotlin/base/dialog/DialogActivityManager;->registerCallback(Ljava/lang/Class;Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;)Landroid/content/Intent;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroid/content/Intent;->putExtras(Landroid/content/Intent;)Landroid/content/Intent;

    :cond_0
    if-eqz p3, :cond_1

    .line 4
    invoke-virtual {v0, p3}, Landroid/content/Intent;->putExtras(Landroid/content/Intent;)Landroid/content/Intent;

    .line 5
    :cond_1
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public startGameCheckRealnameHasIntent(Landroid/content/Context;Lcom/wufan/user/service/protobuf/n0;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 7

    .line 1
    sget-object v0, Lcom/MApplication;->S:Lcom/join/mgps/activity/login/LoginCfgsBean;

    invoke-virtual {v0}, Lcom/join/mgps/activity/login/LoginCfgsBean;->getIs_open_certify()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_7

    .line 2
    new-instance v0, Lcom/join/mgps/pref/PrefDef_;

    invoke-direct {v0, p1}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->lastShowRealNameTime()Lorg/androidannotations/api/sharedpreferences/k;

    move-result-object v3

    invoke-virtual {v3}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    .line 4
    invoke-static {v3, v4}, Lcom/join/mgps/Util/y;->u(J)Z

    move-result v3

    if-nez v3, :cond_0

    .line 5
    sget-object v3, Lcom/MApplication;->S:Lcom/join/mgps/activity/login/LoginCfgsBean;

    if-eqz v3, :cond_0

    .line 6
    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->todayShowRealNameCount()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object v3

    sget-object v4, Lcom/MApplication;->S:Lcom/join/mgps/activity/login/LoginCfgsBean;

    invoke-virtual {v4}, Lcom/join/mgps/activity/login/LoginCfgsBean;->getDaily_show_count()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v4}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 7
    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->startgametimes_open_certify()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object v3

    sget-object v4, Lcom/MApplication;->S:Lcom/join/mgps/activity/login/LoginCfgsBean;

    invoke-virtual {v4}, Lcom/join/mgps/activity/login/LoginCfgsBean;->getTimes_open_certify()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v4}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 8
    :cond_0
    invoke-virtual {p2}, Lcom/wufan/user/service/protobuf/n0;->n2()I

    move-result v3

    const/4 v4, 0x2

    if-eq v3, v4, :cond_5

    invoke-virtual {p2}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v3

    if-nez v3, :cond_1

    goto/16 :goto_2

    .line 9
    :cond_1
    invoke-virtual {p2}, Lcom/wufan/user/service/protobuf/n0;->E0()I

    move-result p2

    if-nez p2, :cond_7

    sget-object p2, Lcom/MApplication;->S:Lcom/join/mgps/activity/login/LoginCfgsBean;

    if-eqz p2, :cond_7

    invoke-virtual {p2}, Lcom/join/mgps/activity/login/LoginCfgsBean;->getIs_open_certify()I

    move-result p2

    if-ne p2, v2, :cond_7

    .line 10
    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->startgametimes_open_certify()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object p2

    invoke-virtual {p2}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-lez p2, :cond_2

    .line 11
    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->startgametimes_open_certify()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object p1

    sub-int/2addr p2, v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    goto :goto_1

    .line 12
    :cond_2
    sget-object p2, Lcom/MApplication;->S:Lcom/join/mgps/activity/login/LoginCfgsBean;

    invoke-virtual {p2}, Lcom/join/mgps/activity/login/LoginCfgsBean;->getCertify_is_allow_skip()I

    move-result p2

    const-string v3, "&gameId="

    const-string v4, "/user/activity/real_name/index?from="

    if-nez p2, :cond_3

    .line 13
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v5, Lcom/join/mgps/rpc/h;->G:Ljava/lang/String;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p1, p3}, Lcom/join/mgps/Util/IntentUtil;->goShareWebActivity(Landroid/content/Context;Ljava/lang/String;)V

    :goto_0
    const/4 v1, 0x1

    goto :goto_1

    .line 14
    :cond_3
    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->todayShowRealNameCount()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object p2

    invoke-virtual {p2}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-lez p2, :cond_4

    .line 15
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v6, Lcom/join/mgps/rpc/h;->G:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v1, p1, p3}, Lcom/join/mgps/Util/IntentUtil;->goShareWebActivity(Landroid/content/Context;Ljava/lang/String;)V

    .line 16
    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->todayShowRealNameCount()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object p1

    sub-int/2addr p2, v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    goto :goto_0

    .line 17
    :cond_4
    :goto_1
    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->lastShowRealNameTime()Lorg/androidannotations/api/sharedpreferences/k;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p2

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p1, p2}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    return v1

    .line 18
    :cond_5
    :goto_2
    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->lastShowRealNameTime()Lorg/androidannotations/api/sharedpreferences/k;

    move-result-object p2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {p2, p3}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 19
    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->startgametimes_open_certify()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object p2

    invoke-virtual {p2}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-lez p2, :cond_6

    .line 20
    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->startgametimes_open_certify()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object p1

    sub-int/2addr p2, v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    return v1

    .line 21
    :cond_6
    invoke-static {p1}, Lcom/join/mgps/activity/login/LoginSplashActivity_;->intent(Landroid/content/Context;)Lcom/join/mgps/activity/login/LoginSplashActivity_$IntentBuilder_;

    move-result-object p1

    invoke-virtual {p1, p4}, Lcom/join/mgps/activity/login/LoginSplashActivity_$IntentBuilder_;->gameId(Ljava/lang/String;)Lcom/join/mgps/activity/login/LoginSplashActivity_$IntentBuilder_;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return v2

    :cond_7
    return v1
.end method

.method public startQuarkBrowser(Landroid/content/Context;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    const-string v0, "com.quark.browser"

    if-eqz p1, :cond_4

    .line 1
    invoke-static {p3}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_0

    .line 2
    :cond_0
    :try_start_0
    invoke-static {p1}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    const/high16 v2, 0x10000000

    if-eqz v1, :cond_1

    .line 3
    new-instance p2, Landroid/content/Intent;

    invoke-direct {p2}, Landroid/content/Intent;-><init>()V

    const-string p4, "android.intent.action.VIEW"

    .line 4
    invoke-virtual {p2, p4}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 5
    invoke-static {p3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p3

    .line 6
    invoke-virtual {p2, p3}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 7
    invoke-virtual {p2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 8
    invoke-virtual {p2, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 9
    invoke-virtual {p1, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    :cond_1
    if-eqz p2, :cond_2

    .line 10
    invoke-static {p1}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/join/android/app/common/utils/APKUtils;->J(Landroid/content/Context;)Z

    move-result p2

    .line 11
    invoke-static {p1}, Lcom/join/mgps/activity/QuarkLoadingActivity_;->t0(Landroid/content/Context;)Lcom/join/mgps/activity/QuarkLoadingActivity_$d;

    move-result-object p1

    invoke-virtual {p1, v2}, Lorg/androidannotations/api/builder/e;->flags(I)Lorg/androidannotations/api/builder/e;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/QuarkLoadingActivity_$d;

    .line 12
    invoke-virtual {p1, p2}, Lcom/join/mgps/activity/QuarkLoadingActivity_$d;->c(Z)Lcom/join/mgps/activity/QuarkLoadingActivity_$d;

    move-result-object p1

    .line 13
    invoke-virtual {p1, p5}, Lcom/join/mgps/activity/QuarkLoadingActivity_$d;->a(Ljava/lang/String;)Lcom/join/mgps/activity/QuarkLoadingActivity_$d;

    move-result-object p1

    .line 14
    invoke-virtual {p1, p4}, Lcom/join/mgps/activity/QuarkLoadingActivity_$d;->b(Ljava/lang/String;)Lcom/join/mgps/activity/QuarkLoadingActivity_$d;

    move-result-object p1

    .line 15
    invoke-virtual {p1, p3}, Lcom/join/mgps/activity/QuarkLoadingActivity_$d;->d(Ljava/lang/String;)Lcom/join/mgps/activity/QuarkLoadingActivity_$d;

    move-result-object p1

    const-string p2, "3875871586"

    .line 16
    invoke-virtual {p1, p2}, Lcom/join/mgps/activity/QuarkLoadingActivity_$d;->e(Ljava/lang/String;)Lcom/join/mgps/activity/QuarkLoadingActivity_$d;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto :goto_0

    .line 17
    :cond_2
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p2

    const-string p3, "2057111073"

    invoke-virtual {p2, p3}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p2

    if-eqz p2, :cond_3

    .line 18
    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result p2

    const/16 p3, 0xb

    if-eq p2, p3, :cond_3

    const p2, 0x7f100334

    .line 19
    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/papa91/arc/ext/ToastManager;->show(Ljava/lang/CharSequence;)V

    .line 20
    :cond_3
    sget-object p2, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {p2}, Lcom/MApplication;->l()Lcom/join/mgps/pref/PrefDef_;

    move-result-object p2

    invoke-virtual {p2}, Lcom/join/mgps/pref/PrefDef_;->isQuarkSilentDownload()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object p2

    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p2, p3}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 21
    invoke-static {p1}, Lcom/join/mgps/service/CommonService_;->S2(Landroid/content/Context;)Lcom/join/mgps/service/CommonService_$h2;

    move-result-object p1

    const-string p2, "action"

    const-string p3, "downloadQuark"

    invoke-virtual {p1, p2, p3}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Ljava/lang/String;)Lorg/androidannotations/api/builder/e;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/service/CommonService_$h2;

    const-string p2, "isOm"

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p3}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Z)Lorg/androidannotations/api/builder/e;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/service/CommonService_$h2;

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/g;->a()Landroid/content/ComponentName;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 22
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_4
    :goto_0
    return-void
.end method
