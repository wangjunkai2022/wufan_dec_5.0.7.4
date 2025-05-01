.class public Lcom/BaseFragmentActivity;
.super Landroidx/fragment/app/FragmentActivity;
.source "BaseFragmentActivity.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/BaseFragmentActivity$o;,
        Lcom/BaseFragmentActivity$q;,
        Lcom/BaseFragmentActivity$p;,
        Lcom/BaseFragmentActivity$n;
    }
.end annotation


# static fields
.field public static final PERMISSION_INSTALL_RESULT_CODE:I = 0x271a


# instance fields
.field apkInstallDialog:Lcom/join/mgps/dialog/d;

.field private baiduChannelPermissionCallBack:Lc2/d;

.field private broadcasExt:Lcom/BaseFragmentActivity$n;

.field contentView:Landroid/view/View;

.field dialog:Landroidx/appcompat/app/AlertDialog$Builder;

.field dialogU:Landroid/app/Dialog;

.field fialePath:Ljava/lang/String;

.field gameid:Ljava/lang/String;

.field gestureDetector:Landroid/view/GestureDetector;

.field private handlerx:Landroid/os/Handler;

.field hasdestroyed:Z

.field private final intentFilter12_:Landroid/content/IntentFilter;

.field isInBackground:Z

.field isSo:Z

.field isfirst:Z

.field lastShowPopTime:J

.field private mHandler:Landroid/os/Handler;

.field private final onReciviedReceiver_:Landroid/content/BroadcastReceiver;

.field permissionDialog:Landroidx/appcompat/app/AlertDialog;

.field popupWindow:Landroid/widget/PopupWindow;

.field prefDef_:Lcom/join/mgps/pref/PrefDef_;

.field recver:Lcom/BaseFragmentActivity$p;

.field private time:Lcom/BaseFragmentActivity$q;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/FragmentActivity;-><init>()V

    .line 2
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/BaseFragmentActivity;->mHandler:Landroid/os/Handler;

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/BaseFragmentActivity;->hasdestroyed:Z

    const/4 v1, 0x1

    .line 4
    iput-boolean v1, p0, Lcom/BaseFragmentActivity;->isfirst:Z

    .line 5
    iput-boolean v0, p0, Lcom/BaseFragmentActivity;->isInBackground:Z

    const-wide/16 v1, 0x0

    .line 6
    iput-wide v1, p0, Lcom/BaseFragmentActivity;->lastShowPopTime:J

    .line 7
    iput-boolean v0, p0, Lcom/BaseFragmentActivity;->isSo:Z

    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Lcom/BaseFragmentActivity;->dialog:Landroidx/appcompat/app/AlertDialog$Builder;

    .line 9
    new-instance v0, Lcom/BaseFragmentActivity$m;

    invoke-direct {v0, p0}, Lcom/BaseFragmentActivity$m;-><init>(Lcom/BaseFragmentActivity;)V

    iput-object v0, p0, Lcom/BaseFragmentActivity;->handlerx:Landroid/os/Handler;

    .line 10
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/BaseFragmentActivity;->intentFilter12_:Landroid/content/IntentFilter;

    .line 11
    new-instance v0, Lcom/BaseFragmentActivity$a;

    invoke-direct {v0, p0}, Lcom/BaseFragmentActivity$a;-><init>(Lcom/BaseFragmentActivity;)V

    iput-object v0, p0, Lcom/BaseFragmentActivity;->onReciviedReceiver_:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic access$000(Lcom/BaseFragmentActivity;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/BaseFragmentActivity;->showDownFinishPre(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$100(Lcom/BaseFragmentActivity;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/BaseFragmentActivity;->handlerx:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic access$200(Lcom/BaseFragmentActivity;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/BaseFragmentActivity;->showDownFinish(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$300(Lcom/BaseFragmentActivity;Landroid/content/Intent;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/BaseFragmentActivity;->onRecivied(Landroid/content/Intent;Landroid/content/Context;)V

    return-void
.end method

.method static synthetic access$400(Lcom/BaseFragmentActivity;Ljava/lang/String;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/BaseFragmentActivity;->getUNzipPermiss(Ljava/lang/String;Landroid/content/Context;)V

    return-void
.end method

.method static synthetic access$500(Lcom/BaseFragmentActivity;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/BaseFragmentActivity;->setUnzipFailedStatus(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic e0(Lcom/BaseFragmentActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/BaseFragmentActivity;->lambda$onResume$0()V

    return-void
.end method

.method private getUNzipPermiss(Ljava/lang/String;Landroid/content/Context;)V
    .locals 3

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 1
    :try_start_0
    new-instance v1, Lcom/tbruyelle/rxpermissions2/c;

    invoke-direct {v1, p0}, Lcom/tbruyelle/rxpermissions2/c;-><init>(Landroidx/fragment/app/FragmentActivity;)V

    .line 2
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/tbruyelle/rxpermissions2/c;->r([Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object v1

    new-instance v2, Lcom/BaseFragmentActivity$d;

    invoke-direct {v2, p0, p2, p1}, Lcom/BaseFragmentActivity$d;-><init>(Lcom/BaseFragmentActivity;Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    .line 3
    invoke-static {p0, v0}, Lcom/join/mgps/Util/UtilsMy;->L3(Landroid/app/Activity;Ljava/lang/String;)V
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

.method private initPopData(Ljava/lang/String;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/BaseFragmentActivity;->contentView:Landroid/view/View;

    const v1, 0x7f090dbd

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 2
    iput-object p1, p0, Lcom/BaseFragmentActivity;->gameid:Ljava/lang/String;

    .line 3
    new-instance v1, Lcom/BaseFragmentActivity$e;

    invoke-direct {v1, p0, p1}, Lcom/BaseFragmentActivity$e;-><init>(Lcom/BaseFragmentActivity;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4
    iget-object v0, p0, Lcom/BaseFragmentActivity;->contentView:Landroid/view/View;

    const v1, 0x7f091461

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 5
    iget-object v1, p0, Lcom/BaseFragmentActivity;->contentView:Landroid/view/View;

    const v2, 0x7f090f4c

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 6
    iget-object v2, p0, Lcom/BaseFragmentActivity;->contentView:Landroid/view/View;

    const v3, 0x7f09078d

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 7
    iget-object v3, p0, Lcom/BaseFragmentActivity;->contentView:Landroid/view/View;

    const v4, 0x7f09086a

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 8
    iget-object v4, p0, Lcom/BaseFragmentActivity;->contentView:Landroid/view/View;

    const v5, 0x7f090296

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    .line 9
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v5

    invoke-virtual {v5, p1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    .line 10
    sget-object v5, Lcom/join/mgps/enums/Dtype;->apk:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFileType()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const-string v5, "\u4e0b\u8f7d\u5b8c\u6210"

    .line 11
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v3, 0x1

    .line 12
    iput-boolean v3, p0, Lcom/BaseFragmentActivity;->isSo:Z

    .line 13
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v3

    sget-object v5, Lcom/papa/sim/statistic/Event;->showSoGameStart:Lcom/papa/sim/statistic/Event;

    new-instance v6, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v6}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v6

    invoke-virtual {v3, v5, v6}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto :goto_0

    .line 14
    :cond_0
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v5

    sget-object v6, Lcom/papa/sim/statistic/Event;->showSinGameStart:Lcom/papa/sim/statistic/Event;

    new-instance v7, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v7}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    const/4 v5, 0x0

    .line 15
    iput-boolean v5, p0, Lcom/BaseFragmentActivity;->isSo:Z

    const-string v5, "\u5b89\u88c5\u5b8c\u6210"

    .line 16
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 17
    :goto_0
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPortraitURL()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 18
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getShowName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const-string v0, "\u5f00\u59cb\u6e38\u620f"

    .line 19
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    new-instance v0, Lcom/BaseFragmentActivity$f;

    invoke-direct {v0, p0, p1}, Lcom/BaseFragmentActivity$f;-><init>(Lcom/BaseFragmentActivity;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 21
    new-instance p1, Lcom/BaseFragmentActivity$g;

    invoke-direct {p1, p0}, Lcom/BaseFragmentActivity$g;-><init>(Lcom/BaseFragmentActivity;)V

    invoke-virtual {v4, p1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private synthetic lambda$onResume$0()V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/p;->e(Landroid/content/Context;)V

    return-void
.end method

.method private onRecivied(Landroid/content/Intent;Landroid/content/Context;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/BaseFragmentActivity;->isInBackground:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {p2}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v1, Lcom/papa/sim/statistic/Event;->Unzip_nopermission:Lcom/papa/sim/statistic/Event;

    new-instance v2, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v2}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 3
    iget-object v0, p0, Lcom/BaseFragmentActivity;->dialogU:Landroid/app/Dialog;

    if-nez v0, :cond_1

    .line 4
    new-instance v0, Landroidx/appcompat/app/AlertDialog$Builder;

    const v1, 0x7f11000d

    invoke-direct {v0, p2, v1}, Landroidx/appcompat/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/BaseFragmentActivity;->dialog:Landroidx/appcompat/app/AlertDialog$Builder;

    goto :goto_0

    .line 5
    :cond_1
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    .line 6
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/BaseFragmentActivity;->dialog:Landroidx/appcompat/app/AlertDialog$Builder;

    const-string v1, "\u89e3\u538b\u5931\u8d25"

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 7
    iget-object v0, p0, Lcom/BaseFragmentActivity;->dialog:Landroidx/appcompat/app/AlertDialog$Builder;

    const-string v1, "\u672a\u83b7\u53d6\u5230\u5b58\u50a8\u6743\u9650"

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 8
    iget-object v0, p0, Lcom/BaseFragmentActivity;->dialog:Landroidx/appcompat/app/AlertDialog$Builder;

    new-instance v1, Lcom/BaseFragmentActivity$b;

    invoke-direct {v1, p0, p1, p2}, Lcom/BaseFragmentActivity$b;-><init>(Lcom/BaseFragmentActivity;Landroid/content/Intent;Landroid/content/Context;)V

    const-string v2, "\u53bb\u83b7\u53d6"

    invoke-virtual {v0, v2, v1}, Landroidx/appcompat/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 9
    iget-object v0, p0, Lcom/BaseFragmentActivity;->dialog:Landroidx/appcompat/app/AlertDialog$Builder;

    new-instance v1, Lcom/BaseFragmentActivity$c;

    invoke-direct {v1, p0, p1, p2}, Lcom/BaseFragmentActivity$c;-><init>(Lcom/BaseFragmentActivity;Landroid/content/Intent;Landroid/content/Context;)V

    const-string p1, "\u53d6\u6d88"

    invoke-virtual {v0, p1, v1}, Landroidx/appcompat/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 10
    iget-object p1, p0, Lcom/BaseFragmentActivity;->dialog:Landroidx/appcompat/app/AlertDialog$Builder;

    invoke-virtual {p1}, Landroidx/appcompat/app/AlertDialog$Builder;->show()Landroidx/appcompat/app/AlertDialog;

    move-result-object p1

    iput-object p1, p0, Lcom/BaseFragmentActivity;->dialogU:Landroid/app/Dialog;

    if-eqz p1, :cond_3

    const/4 p2, 0x0

    .line 11
    invoke-virtual {p1, p2}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 12
    iget-object p1, p0, Lcom/BaseFragmentActivity;->dialogU:Landroid/app/Dialog;

    invoke-virtual {p1, p2}, Landroid/app/Dialog;->setCancelable(Z)V

    :cond_3
    return-void
.end method

.method private setTranslucentStatus(Z)V
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x13
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    if-eqz p1, :cond_0

    .line 3
    iget p1, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    const/high16 v2, 0x4000000

    or-int/2addr p1, v2

    iput p1, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    goto :goto_0

    .line 4
    :cond_0
    iget p1, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    const v2, -0x4000001

    and-int/2addr p1, v2

    iput p1, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 5
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    return-void
.end method

.method private setUnzipFailedStatus(Ljava/lang/String;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/join/mgps/enums/ConstantIntEnum;->PS2:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v0}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/join/mgps/enums/ConstantIntEnum;->N3DS:Lcom/join/mgps/enums/ConstantIntEnum;

    .line 2
    invoke-virtual {v0}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    :cond_0
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    const/16 v0, 0xd

    .line 4
    invoke-virtual {p1, v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    .line 5
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v1

    invoke-virtual {v0, p1, v1}, Lp1/f;->j0(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    .line 6
    invoke-static {}, Lcom/join/android/app/common/servcie/i;->e()Lcom/join/android/app/common/servcie/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/android/app/common/servcie/i;->i(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 7
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/event/n;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v2

    invoke-direct {v1, p1, v2}, Lcom/join/mgps/event/n;-><init>(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/d0;->c(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public static setWindowStatusBarColor(Landroid/app/Activity;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/join/mgps/Util/c2;->q(Landroid/app/Activity;I)V

    return-void
.end method

.method private showDownFinish(Ljava/lang/String;)V
    .locals 11

    .line 1
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {v0}, Lcom/join/android/app/common/utils/APKUtils;->L(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 3
    :goto_0
    iget-boolean v4, p0, Lcom/BaseFragmentActivity;->isInBackground:Z

    if-eqz v4, :cond_1

    if-nez v3, :cond_1

    return-void

    .line 4
    :cond_1
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, Lcom/BaseFragmentActivity;->lastShowPopTime:J

    sub-long/2addr v4, v6

    const-wide/16 v6, 0x7d0

    cmp-long v8, v4, v6

    if-lez v8, :cond_8

    .line 5
    sget-object v4, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {v4}, Lcom/MApplication;->getActivity()Landroid/app/Activity;

    move-result-object v4

    instance-of v4, v4, Lcom/join/mgps/activity/ModGameIndexActivity;

    if-nez v4, :cond_8

    sget-object v4, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {v4}, Lcom/MApplication;->getActivity()Landroid/app/Activity;

    move-result-object v4

    instance-of v4, v4, Lcom/join/mgps/activity/GameMainActivity3_;

    if-nez v4, :cond_8

    sget-object v4, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {v4}, Lcom/MApplication;->getActivity()Landroid/app/Activity;

    move-result-object v4

    instance-of v4, v4, Lcom/join/mgps/activity/NewArenaMainActivty_;

    if-nez v4, :cond_8

    sget-object v4, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {v4}, Lcom/MApplication;->getActivity()Landroid/app/Activity;

    move-result-object v4

    instance-of v4, v4, Lcom/join/mgps/activity/MiniGameLoadingActivity;

    if-nez v4, :cond_8

    sget-object v4, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {v4}, Lcom/MApplication;->getActivity()Landroid/app/Activity;

    move-result-object v4

    instance-of v4, v4, Lcom/join/mgps/activity/PrivateDomainDownloadActivity;

    if-nez v4, :cond_8

    sget-object v4, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {v4}, Lcom/MApplication;->getActivity()Landroid/app/Activity;

    move-result-object v4

    instance-of v4, v4, Lcom/join/mgps/activity/PrivateDomainDefaultActivity;

    if-nez v4, :cond_8

    sget-object v4, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {v4}, Lcom/MApplication;->getActivity()Landroid/app/Activity;

    move-result-object v4

    instance-of v4, v4, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog;

    if-nez v4, :cond_8

    sget-object v4, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {v4}, Lcom/MApplication;->getActivity()Landroid/app/Activity;

    move-result-object v4

    instance-of v4, v4, Lcom/join/mgps/activity/EndGameLaunchActivity_;

    if-nez v4, :cond_8

    sget-object v4, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {v4}, Lcom/MApplication;->getActivity()Landroid/app/Activity;

    move-result-object v4

    instance-of v4, v4, Lcom/join/mgps/activity/DiscoveryPaiweiActivity_;

    if-nez v4, :cond_8

    sget-object v4, Lcom/MApplication;->x:Lcom/MApplication;

    .line 6
    invoke-virtual {v4}, Lcom/MApplication;->getActivity()Landroid/app/Activity;

    move-result-object v4

    instance-of v4, v4, Lcom/join/mgps/activity/EndGameActivity_;

    if-nez v4, :cond_8

    sget-object v4, Lcom/MApplication;->x:Lcom/MApplication;

    .line 7
    invoke-virtual {v4}, Lcom/MApplication;->getActivity()Landroid/app/Activity;

    move-result-object v4

    instance-of v4, v4, Lcom/join/mgps/activity/EndGameDetailActivity_;

    if-nez v4, :cond_8

    sget-object v4, Lcom/MApplication;->x:Lcom/MApplication;

    .line 8
    invoke-virtual {v4}, Lcom/MApplication;->getActivity()Landroid/app/Activity;

    move-result-object v4

    instance-of v4, v4, Lcom/join/mgps/activity/EndGameLaunchActivity_;

    if-nez v4, :cond_8

    if-nez v3, :cond_3

    .line 9
    iget-object v4, p0, Lcom/BaseFragmentActivity;->time:Lcom/BaseFragmentActivity$q;

    if-eqz v4, :cond_2

    .line 10
    invoke-virtual {v4}, Lcom/BaseFragmentActivity$q;->onFinish()V

    goto :goto_1

    .line 11
    :cond_2
    new-instance v10, Lcom/BaseFragmentActivity$q;

    const-wide/16 v6, 0x2710

    const-wide/16 v8, 0x3e8

    move-object v4, v10

    move-object v5, p0

    invoke-direct/range {v4 .. v9}, Lcom/BaseFragmentActivity$q;-><init>(Lcom/BaseFragmentActivity;JJ)V

    iput-object v10, p0, Lcom/BaseFragmentActivity;->time:Lcom/BaseFragmentActivity$q;

    .line 12
    :goto_1
    iget-object v4, p0, Lcom/BaseFragmentActivity;->time:Lcom/BaseFragmentActivity$q;

    invoke-virtual {v4}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    :cond_3
    if-eqz v3, :cond_4

    .line 13
    invoke-static {p0}, Lcom/join/mgps/Util/b0;->f0(Landroid/content/Context;)Lcom/join/mgps/Util/b0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/a0;->H(Ljava/lang/String;)V

    goto :goto_3

    .line 14
    :cond_4
    iget-object v3, p0, Lcom/BaseFragmentActivity;->popupWindow:Landroid/widget/PopupWindow;

    if-eqz v3, :cond_5

    .line 15
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-nez v0, :cond_7

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v3, p0, Lcom/BaseFragmentActivity;->lastShowPopTime:J

    sub-long/2addr v0, v3

    const-wide/16 v3, 0x1388

    cmp-long v5, v0, v3

    if-lez v5, :cond_7

    const-string v0, "popwindow"

    const-string v1, "33333333333"

    .line 16
    invoke-static {v0, v1}, Lcom/join/mgps/Util/v0;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    iget-object v0, p0, Lcom/BaseFragmentActivity;->popupWindow:Landroid/widget/PopupWindow;

    iget-object v1, p0, Lcom/BaseFragmentActivity;->contentView:Landroid/view/View;

    const/16 v3, 0x30

    invoke-static {p0}, Lcom/join/android/app/common/utils/n;->n(Landroid/content/Context;)Lcom/join/android/app/common/utils/n;

    invoke-static {p0}, Lcom/join/android/app/common/utils/n;->v(Landroid/content/Context;)I

    move-result v4

    invoke-virtual {v0, v1, v3, v2, v4}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 18
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/BaseFragmentActivity;->lastShowPopTime:J

    goto :goto_2

    :cond_5
    if-eqz v0, :cond_6

    .line 19
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/q1;->f(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/4 v1, 0x0

    :cond_6
    if-eqz v1, :cond_7

    .line 20
    invoke-direct {p0}, Lcom/BaseFragmentActivity;->showPopwindow()V

    .line 21
    :cond_7
    :goto_2
    invoke-direct {p0, p1}, Lcom/BaseFragmentActivity;->initPopData(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception p1

    .line 22
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_8
    :goto_3
    return-void
.end method

.method private showDownFinishPre(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Message;

    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    .line 2
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    const/4 p1, 0x3

    .line 3
    iput p1, v0, Landroid/os/Message;->what:I

    .line 4
    iget-object p1, p0, Lcom/BaseFragmentActivity;->handlerx:Landroid/os/Handler;

    const-wide/16 v1, 0x12c

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void
.end method

.method private showPopwindow()V
    .locals 6

    .line 1
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c00bd

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/BaseFragmentActivity;->contentView:Landroid/view/View;

    .line 2
    new-instance v0, Landroid/widget/PopupWindow;

    iget-object v1, p0, Lcom/BaseFragmentActivity;->contentView:Landroid/view/View;

    const/4 v2, -0x1

    const/4 v3, -0x2

    invoke-direct {v0, v1, v2, v3}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;II)V

    iput-object v0, p0, Lcom/BaseFragmentActivity;->popupWindow:Landroid/widget/PopupWindow;

    .line 3
    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>()V

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 4
    iget-object v0, p0, Lcom/BaseFragmentActivity;->popupWindow:Landroid/widget/PopupWindow;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 5
    iget-object v0, p0, Lcom/BaseFragmentActivity;->popupWindow:Landroid/widget/PopupWindow;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/widget/PopupWindow;->setTouchable(Z)V

    .line 6
    iget-object v0, p0, Lcom/BaseFragmentActivity;->popupWindow:Landroid/widget/PopupWindow;

    const v2, 0x7f110144

    invoke-virtual {v0, v2}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    .line 7
    iget-object v0, p0, Lcom/BaseFragmentActivity;->popupWindow:Landroid/widget/PopupWindow;

    new-instance v2, Lcom/BaseFragmentActivity$h;

    invoke-direct {v2, p0}, Lcom/BaseFragmentActivity$h;-><init>(Lcom/BaseFragmentActivity;)V

    invoke-virtual {v0, v2}, Landroid/widget/PopupWindow;->setTouchInterceptor(Landroid/view/View$OnTouchListener;)V

    .line 8
    iget-object v0, p0, Lcom/BaseFragmentActivity;->contentView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f071263

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v0

    .line 9
    iget-object v2, p0, Lcom/BaseFragmentActivity;->gestureDetector:Landroid/view/GestureDetector;

    if-nez v2, :cond_0

    .line 10
    new-instance v2, Landroid/view/GestureDetector;

    iget-object v3, p0, Lcom/BaseFragmentActivity;->contentView:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    new-instance v4, Lcom/BaseFragmentActivity$i;

    invoke-direct {v4, p0, v0}, Lcom/BaseFragmentActivity$i;-><init>(Lcom/BaseFragmentActivity;I)V

    invoke-direct {v2, v3, v4}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v2, p0, Lcom/BaseFragmentActivity;->gestureDetector:Landroid/view/GestureDetector;

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/BaseFragmentActivity;->popupWindow:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/BaseFragmentActivity;->lastShowPopTime:J

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x1388

    cmp-long v0, v2, v4

    if-lez v0, :cond_1

    .line 12
    iget-object v0, p0, Lcom/BaseFragmentActivity;->popupWindow:Landroid/widget/PopupWindow;

    iget-object v2, p0, Lcom/BaseFragmentActivity;->contentView:Landroid/view/View;

    const/16 v3, 0x30

    invoke-static {p0}, Lcom/join/android/app/common/utils/n;->n(Landroid/content/Context;)Lcom/join/android/app/common/utils/n;

    invoke-static {p0}, Lcom/join/android/app/common/utils/n;->v(Landroid/content/Context;)I

    move-result v4

    invoke-virtual {v0, v2, v3, v1, v4}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/BaseFragmentActivity;->lastShowPopTime:J

    :cond_1
    return-void
.end method


# virtual methods
.method public checkPermiss(Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public varargs checkPermiss([Ljava/lang/String;)Z
    .locals 4

    .line 2
    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, p1, v2

    .line 3
    invoke-static {p0, v3}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v3

    if-eqz v3, :cond_0

    return v1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public getPermison(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/BaseFragmentActivity$o;

    invoke-direct {v0, p0}, Lcom/BaseFragmentActivity$o;-><init>(Lcom/BaseFragmentActivity;)V

    .line 2
    iput-object p1, v0, Lcom/BaseFragmentActivity$o;->a:Ljava/lang/String;

    .line 3
    invoke-virtual {p0, v0}, Lcom/BaseFragmentActivity;->requestPermission(Lcom/BaseFragmentActivity$o;)V

    return-void
.end method

.method public varargs getPermison([Ljava/lang/String;)V
    .locals 1

    .line 4
    :try_start_0
    new-instance v0, Lcom/tbruyelle/rxpermissions2/c;

    invoke-direct {v0, p0}, Lcom/tbruyelle/rxpermissions2/c;-><init>(Landroidx/fragment/app/FragmentActivity;)V

    .line 5
    invoke-virtual {v0, p1}, Lcom/tbruyelle/rxpermissions2/c;->r([Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance v0, Lcom/BaseFragmentActivity$j;

    invoke-direct {v0, p0}, Lcom/BaseFragmentActivity$j;-><init>(Lcom/BaseFragmentActivity;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 6
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 0
    .param p3    # Landroid/content/Intent;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/16 p2, 0x271a

    if-ne p1, p2, :cond_0

    .line 2
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x1a

    if-lt p1, p2, :cond_0

    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/pm/PackageManager;->canRequestPackageInstalls()Z

    move-result p1

    .line 4
    iget-object p2, p0, Lcom/BaseFragmentActivity;->fialePath:Ljava/lang/String;

    invoke-static {p2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    if-eqz p1, :cond_0

    .line 5
    iget-object p1, p0, Lcom/BaseFragmentActivity;->handlerx:Landroid/os/Handler;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    :cond_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/BaseFragmentActivity;->hasdestroyed:Z

    .line 3
    new-instance p1, Lcom/BaseFragmentActivity$n;

    invoke-direct {p1, p0}, Lcom/BaseFragmentActivity$n;-><init>(Lcom/BaseFragmentActivity;)V

    iput-object p1, p0, Lcom/BaseFragmentActivity;->broadcasExt:Lcom/BaseFragmentActivity$n;

    .line 4
    new-instance p1, Lcom/join/mgps/pref/PrefDef_;

    invoke-direct {p1, p0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/BaseFragmentActivity;->prefDef_:Lcom/join/mgps/pref/PrefDef_;

    .line 5
    new-instance p1, Landroid/content/IntentFilter;

    invoke-direct {p1}, Landroid/content/IntentFilter;-><init>()V

    const-string v0, "com.join.android.app.mgsim.wufun.broadcast.appfinish"

    .line 6
    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 7
    iget-object v0, p0, Lcom/BaseFragmentActivity;->broadcasExt:Lcom/BaseFragmentActivity$n;

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 8
    :try_start_0
    iget-object p1, p0, Lcom/BaseFragmentActivity;->intentFilter12_:Landroid/content/IntentFilter;

    const-string v0, "com.wufun.unzip.failed"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 9
    iget-object p1, p0, Lcom/BaseFragmentActivity;->intentFilter12_:Landroid/content/IntentFilter;

    const-string v0, "com.wufun.down.androidversion"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 10
    iget-object p1, p0, Lcom/BaseFragmentActivity;->onReciviedReceiver_:Landroid/content/BroadcastReceiver;

    iget-object v0, p0, Lcom/BaseFragmentActivity;->intentFilter12_:Landroid/content/IntentFilter;

    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 12
    :goto_0
    new-instance p1, Lcom/BaseFragmentActivity$p;

    invoke-direct {p1, p0}, Lcom/BaseFragmentActivity$p;-><init>(Lcom/BaseFragmentActivity;)V

    iput-object p1, p0, Lcom/BaseFragmentActivity;->recver:Lcom/BaseFragmentActivity$p;

    .line 13
    new-instance p1, Landroid/content/IntentFilter;

    invoke-direct {p1}, Landroid/content/IntentFilter;-><init>()V

    const-string v0, "com.wufun.get.permission"

    .line 14
    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v0, "com.wufun.get.downFinish"

    .line 15
    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 16
    invoke-static {p0}, Landroidx/localbroadcastmanager/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroidx/localbroadcastmanager/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/BaseFragmentActivity;->recver:Lcom/BaseFragmentActivity$p;

    invoke-virtual {v0, v1, p1}, Landroidx/localbroadcastmanager/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 17
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object p1

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/va/overmind/d;->S(Landroid/content/Intent;)V

    return-void
.end method

.method protected onDestroy()V
    .locals 2

    .line 1
    :try_start_0
    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onDestroy()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 3
    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/BaseFragmentActivity;->popupWindow:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/BaseFragmentActivity;->popupWindow:Landroid/widget/PopupWindow;

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/BaseFragmentActivity;->baiduChannelPermissionCallBack:Lc2/d;

    if-eqz v0, :cond_1

    .line 7
    invoke-interface {v0}, Lc2/d;->b()V

    :cond_1
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lcom/BaseFragmentActivity;->hasdestroyed:Z

    .line 9
    invoke-static {p0}, Landroidx/localbroadcastmanager/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroidx/localbroadcastmanager/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/BaseFragmentActivity;->recver:Lcom/BaseFragmentActivity$p;

    invoke-virtual {v0, v1}, Landroidx/localbroadcastmanager/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 10
    :try_start_1
    iget-object v0, p0, Lcom/BaseFragmentActivity;->broadcasExt:Lcom/BaseFragmentActivity$n;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 12
    :goto_1
    :try_start_2
    iget-object v0, p0, Lcom/BaseFragmentActivity;->onReciviedReceiver_:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_2

    .line 13
    invoke-virtual {p0, v0}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    move-exception v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_2
    :goto_2
    return-void
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 2
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/va/overmind/d;->S(Landroid/content/Intent;)V

    return-void
.end method

.method protected onPause()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onPause()V

    .line 2
    iget-object v0, p0, Lcom/BaseFragmentActivity;->popupWindow:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Lcom/BaseFragmentActivity;->hasdestroyed:Z

    if-nez v1, :cond_0

    .line 3
    :try_start_0
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lcom/BaseFragmentActivity;->popupWindow:Landroid/widget/PopupWindow;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 6
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/BaseFragmentActivity;->baiduChannelPermissionCallBack:Lc2/d;

    if-eqz v0, :cond_1

    .line 7
    invoke-interface {v0}, Lc2/d;->b()V

    .line 8
    iget-object v0, p0, Lcom/BaseFragmentActivity;->baiduChannelPermissionCallBack:Lc2/d;

    invoke-interface {v0}, Lc2/d;->a()V

    :cond_1
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lcom/BaseFragmentActivity;->isInBackground:Z

    return-void
.end method

.method protected onResume()V
    .locals 5

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/BaseFragmentActivity;->isInBackground:Z

    .line 3
    new-instance v1, Lcom/join/mgps/pref/PrefDef_;

    invoke-direct {v1, p0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Lcom/join/mgps/pref/PrefDef_;->firstShowUserPermiss()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v1

    invoke-virtual {v1}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_0

    .line 4
    invoke-static {p0}, Lcom/join/mgps/Util/q0;->a(Landroid/content/Context;)V

    .line 5
    :cond_0
    iget-object v1, p0, Lcom/BaseFragmentActivity;->mHandler:Landroid/os/Handler;

    if-nez v1, :cond_1

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    iput-object v1, p0, Lcom/BaseFragmentActivity;->mHandler:Landroid/os/Handler;

    .line 6
    :cond_1
    iget-object v1, p0, Lcom/BaseFragmentActivity;->mHandler:Landroid/os/Handler;

    new-instance v2, Lcom/d;

    invoke-direct {v2, p0}, Lcom/d;-><init>(Lcom/BaseFragmentActivity;)V

    const-wide/16 v3, 0x1f4

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 7
    new-instance v1, Lcom/join/mgps/pref/PrefDef_;

    invoke-direct {v1, p0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    .line 8
    iget-boolean v2, p0, Lcom/BaseFragmentActivity;->isfirst:Z

    if-eqz v2, :cond_2

    .line 9
    iput-boolean v0, p0, Lcom/BaseFragmentActivity;->isfirst:Z

    return-void

    .line 10
    :cond_2
    invoke-virtual {v1}, Lcom/join/mgps/pref/PrefDef_;->lastInstallApp()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v2

    invoke-virtual {v2}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 11
    invoke-static {v2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 12
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v3

    invoke-virtual {v3, v2}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 13
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v3

    const/16 v4, 0xb

    if-ne v3, v4, :cond_4

    .line 14
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/join/mgps/pref/PrefDef_;

    invoke-direct {v4, p0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    invoke-virtual {v4}, Lcom/join/mgps/pref/PrefDef_;->lastShowTOUTIAOAd()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v4

    invoke-virtual {v4}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    .line 15
    invoke-static {p0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v3

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, p0, v4}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_4

    .line 16
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "com.quark.browser"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_0

    .line 17
    :cond_3
    sget-object v3, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {v3}, Lcom/MApplication;->getActivity()Landroid/app/Activity;

    move-result-object v3

    instance-of v3, v3, Lcom/join/mgps/activity/ModGameIndexActivity;

    if-nez v3, :cond_4

    .line 18
    invoke-static {p0}, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_;->intent(Landroid/content/Context;)Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_$IntentBuilder_;

    move-result-object v0

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_$IntentBuilder_;->gameId(Ljava/lang/String;)Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_$IntentBuilder_;

    move-result-object v0

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_$IntentBuilder_;->from(I)Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_$IntentBuilder_;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    const/4 v0, 0x1

    :cond_4
    :goto_0
    if-nez v0, :cond_5

    .line 19
    invoke-virtual {v1}, Lcom/join/mgps/pref/PrefDef_;->lastInstallAppFinish()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 20
    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 21
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v2

    invoke-virtual {v2, v0}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v2

    if-eqz v2, :cond_5

    .line 22
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v3

    .line 23
    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 24
    invoke-static {v3}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_5

    invoke-static {p0, v3}, Lcom/join/mgps/Util/g;->e(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 25
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTips()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTips()Ljava/lang/String;

    move-result-object v2

    const-string v3, "\u7f51\u6e38"

    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_5

    .line 26
    invoke-direct {p0, v0}, Lcom/BaseFragmentActivity;->showDownFinishPre(Ljava/lang/String;)V

    .line 27
    invoke-virtual {v1}, Lcom/join/mgps/pref/PrefDef_;->lastInstallAppFinish()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 28
    :cond_5
    iget-object v0, p0, Lcom/BaseFragmentActivity;->baiduChannelPermissionCallBack:Lc2/d;

    if-eqz v0, :cond_6

    .line 29
    invoke-interface {v0}, Lc2/d;->b()V

    .line 30
    :cond_6
    invoke-static {p0}, Lcom/join/mgps/Util/UtilsMy;->Q3(Landroid/content/Context;)V

    return-void
.end method

.method requestPermission(Lcom/BaseFragmentActivity$o;)V
    .locals 3

    if-eqz p1, :cond_7

    .line 1
    iget-object v0, p1, Lcom/BaseFragmentActivity$o;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_0

    :cond_0
    const-string v0, "request permission"

    .line 2
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 3
    iget-object v0, p1, Lcom/BaseFragmentActivity$o;->a:Ljava/lang/String;

    .line 4
    invoke-static {p0, v0}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_1

    return-void

    .line 5
    :cond_1
    invoke-static {p0, v0}, Lcom/join/mgps/Util/UtilsMy;->L3(Landroid/app/Activity;Ljava/lang/String;)V

    .line 6
    iget-object v1, p0, Lcom/BaseFragmentActivity;->permissionDialog:Landroidx/appcompat/app/AlertDialog;

    if-eqz v1, :cond_2

    .line 7
    invoke-virtual {v1}, Landroid/app/Dialog;->show()V

    :cond_2
    const-string v1, "android.permission.REQUEST_INSTALL_PACKAGES"

    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_6

    .line 9
    iget-object v0, p1, Lcom/BaseFragmentActivity$o;->b:Ljava/lang/String;

    .line 10
    invoke-static {v0}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    return-void

    .line 11
    :cond_3
    iput-object v0, p0, Lcom/BaseFragmentActivity;->fialePath:Ljava/lang/String;

    .line 12
    iget-object v0, p0, Lcom/BaseFragmentActivity;->prefDef_:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->show_unknown_source()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 13
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_5

    .line 14
    iget-object v0, p0, Lcom/BaseFragmentActivity;->apkInstallDialog:Lcom/join/mgps/dialog/d;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/app/AlertDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 15
    iget-object v0, p0, Lcom/BaseFragmentActivity;->apkInstallDialog:Lcom/join/mgps/dialog/d;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 16
    :cond_4
    new-instance v0, Lcom/join/mgps/dialog/d;

    invoke-direct {v0, p0}, Lcom/join/mgps/dialog/d;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/BaseFragmentActivity;->apkInstallDialog:Lcom/join/mgps/dialog/d;

    .line 17
    new-instance v1, Lcom/BaseFragmentActivity$k;

    invoke-direct {v1, p0, p1}, Lcom/BaseFragmentActivity$k;-><init>(Lcom/BaseFragmentActivity;Lcom/BaseFragmentActivity$o;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/dialog/d;->b(Lw1/c;)V

    .line 18
    iget-object p1, p0, Lcom/BaseFragmentActivity;->apkInstallDialog:Lcom/join/mgps/dialog/d;

    invoke-virtual {p1}, Landroid/app/AlertDialog;->show()V

    return-void

    .line 19
    :cond_5
    iget-object p1, p0, Lcom/BaseFragmentActivity;->handlerx:Landroid/os/Handler;

    invoke-virtual {p1, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 20
    :cond_6
    :try_start_0
    new-instance p1, Lcom/tbruyelle/rxpermissions2/c;

    invoke-direct {p1, p0}, Lcom/tbruyelle/rxpermissions2/c;-><init>(Landroidx/fragment/app/FragmentActivity;)V

    new-array v1, v2, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    .line 21
    invoke-virtual {p1, v1}, Lcom/tbruyelle/rxpermissions2/c;->r([Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance v0, Lcom/BaseFragmentActivity$l;

    invoke-direct {v0, p0}, Lcom/BaseFragmentActivity$l;-><init>(Lcom/BaseFragmentActivity;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 22
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_7
    :goto_0
    return-void
.end method

.method public setChannelPermissionCallBack(Lc2/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/BaseFragmentActivity;->baiduChannelPermissionCallBack:Lc2/d;

    return-void
.end method

.method public setContentView(I)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->setContentView(I)V

    .line 2
    sget-object p1, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "vivo"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    const-string v0, "oppo"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    .line 3
    invoke-static {p0, p1, v1}, Lcom/join/mgps/Util/c2;->o(Landroid/app/Activity;IZ)V

    goto :goto_1

    :cond_1
    :goto_0
    const p1, -0x808081

    .line 4
    invoke-static {p0, p1, v1}, Lcom/join/mgps/Util/c2;->o(Landroid/app/Activity;IZ)V

    .line 5
    invoke-static {p0}, Lcom/join/mgps/Util/c2;->d(Landroid/app/Activity;)I

    move-result p1

    invoke-static {p0, p1}, Lcom/join/mgps/Util/c2;->c(Landroid/app/Activity;I)V

    :goto_1
    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 2

    .line 6
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->setContentView(Landroid/view/View;)V

    .line 7
    sget-object p1, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "vivo"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    const-string v0, "oppo"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    .line 8
    invoke-static {p0, p1, v1}, Lcom/join/mgps/Util/c2;->o(Landroid/app/Activity;IZ)V

    goto :goto_1

    :cond_1
    :goto_0
    const p1, -0x808081

    .line 9
    invoke-static {p0, p1, v1}, Lcom/join/mgps/Util/c2;->o(Landroid/app/Activity;IZ)V

    .line 10
    invoke-static {p0}, Lcom/join/mgps/Util/c2;->d(Landroid/app/Activity;)I

    move-result p1

    invoke-static {p0, p1}, Lcom/join/mgps/Util/c2;->c(Landroid/app/Activity;I)V

    :goto_1
    return-void
.end method
