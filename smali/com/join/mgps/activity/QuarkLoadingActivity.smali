.class public Lcom/join/mgps/activity/QuarkLoadingActivity;
.super Lcom/BaseActivity;
.source "QuarkLoadingActivity.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/QuarkLoadingActivity$b;
    }
.end annotation

.annotation build Lorg/androidannotations/annotations/EActivity;
    value = 0x7f0c008d
.end annotation


# static fields
.field public static q:I = 0x0

.field public static final r:I = 0x2


# instance fields
.field b:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field c:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field d:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field e:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field f:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field g:Lcom/facebook/drawee/view/SimpleDraweeView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field h:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field i:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field j:Lcom/join/mgps/customview/PictureHProgress;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field k:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field l:Lcom/github/snowdream/android/app/downloader/DownloadTask;

.field m:Z

.field n:Lcom/join/mgps/activity/QuarkLoadingActivity$b;

.field o:Z
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field p:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/BaseActivity;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->m:Z

    const/4 v1, 0x0

    .line 3
    iput-object v1, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->n:Lcom/join/mgps/activity/QuarkLoadingActivity$b;

    .line 4
    iput-boolean v0, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->o:Z

    .line 5
    iput-boolean v0, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->p:Z

    return-void
.end method

.method public static synthetic g0(Lcom/join/mgps/activity/QuarkLoadingActivity;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/join/mgps/activity/QuarkLoadingActivity;->k0(Ljava/lang/String;)V

    return-void
.end method

.method private i0()V
    .locals 2

    .line 1
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lorg/greenrobot/eventbus/c;->y(Ljava/lang/Object;)V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->m:Z

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->n:Lcom/join/mgps/activity/QuarkLoadingActivity$b;

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {v1, v0}, Lcom/join/mgps/activity/QuarkLoadingActivity$b;->a(Z)V

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->n:Lcom/join/mgps/activity/QuarkLoadingActivity$b;

    :cond_0
    return-void
.end method

.method private j0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "isLaunchApp"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->o:Z

    .line 3
    :cond_0
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    const-string v2, "3875871586"

    invoke-virtual {v0, v2}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->l:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->g:Lcom/facebook/drawee/view/SimpleDraweeView;

    iget-object v2, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->f:Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/join/android/app/common/utils/MyImageLoader;->n(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->h:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->e:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-boolean v0, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->o:Z

    if-eqz v0, :cond_1

    .line 7
    invoke-direct {p0}, Lcom/join/mgps/activity/QuarkLoadingActivity;->m0()V

    .line 8
    invoke-virtual {p0}, Lcom/join/mgps/activity/QuarkLoadingActivity;->q0()V

    .line 9
    invoke-direct {p0, v1}, Lcom/join/mgps/activity/QuarkLoadingActivity;->o0(Z)V

    goto :goto_0

    .line 10
    :cond_1
    invoke-static {p0}, Lcom/join/mgps/service/CommonService_;->S2(Landroid/content/Context;)Lcom/join/mgps/service/CommonService_$h2;

    move-result-object v0

    const-string v1, "action"

    const-string v2, "downloadQuark"

    invoke-virtual {v0, v1, v2}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Ljava/lang/String;)Lorg/androidannotations/api/builder/e;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/service/CommonService_$h2;

    const-string v1, "isOm"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Z)Lorg/androidannotations/api/builder/e;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/service/CommonService_$h2;

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/g;->a()Landroid/content/ComponentName;

    .line 11
    invoke-direct {p0, v2}, Lcom/join/mgps/activity/QuarkLoadingActivity;->n0(Z)V

    .line 12
    invoke-direct {p0, v2}, Lcom/join/mgps/activity/QuarkLoadingActivity;->o0(Z)V

    .line 13
    :goto_0
    iget-boolean v0, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->o:Z

    invoke-direct {p0, v0}, Lcom/join/mgps/activity/QuarkLoadingActivity;->p0(Z)V

    return-void
.end method

.method private synthetic k0(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method

.method private m0()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->c:Ljava/lang/String;

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    if-nez v0, :cond_0

    .line 3
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    const-string v1, "2057111073"

    invoke-virtual {v0, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    :cond_0
    if-eqz v0, :cond_2

    .line 4
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v1

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/va/overmind/d;->F(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 5
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getOpenTime()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-gtz v5, :cond_1

    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setOpenTime(J)V

    .line 7
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v1

    invoke-virtual {v1, v0}, Lp1/b;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    :cond_1
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getHostUserId()I

    move-result v1

    iget-object v2, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->d:Ljava/lang/String;

    invoke-virtual {p0, v0, v1, v2}, Lcom/join/mgps/activity/QuarkLoadingActivity;->l0(Ljava/lang/String;ILjava/lang/String;)Z

    .line 9
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->n:Lcom/join/mgps/activity/QuarkLoadingActivity$b;

    if-eqz v0, :cond_3

    const/4 v1, 0x0

    .line 10
    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/QuarkLoadingActivity$b;->a(Z)V

    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->n:Lcom/join/mgps/activity/QuarkLoadingActivity$b;

    :cond_3
    return-void
.end method

.method private n0(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->j:Lcom/join/mgps/customview/PictureHProgress;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, 0x4

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private o0(Z)V
    .locals 0

    return-void
.end method

.method private p0(Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->k:Landroid/widget/LinearLayout;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->k:Landroid/widget/LinearLayout;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private receiveDelete(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->c:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "\u4e0b\u8f7d\u6587\u4ef6\u5df2\u5220\u9664"

    .line 2
    invoke-static {p1}, Lcom/papa91/arc/ext/ToastManager;->show(Ljava/lang/CharSequence;)V

    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_1
    return-void
.end method

.method private receiveError(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    invoke-static {p1}, Lcom/join/mgps/Util/UtilsMy;->x4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 3
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    :goto_0
    return-void
.end method

.method private receiveStart(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->c:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    iput-object p1, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->l:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    :cond_1
    return-void
.end method

.method private receiveSuccess(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->c:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->j:Lcom/join/mgps/customview/PictureHProgress;

    const/16 v0, 0x64

    invoke-virtual {p1, v0}, Lcom/join/mgps/customview/PictureHProgress;->setProgress(I)V

    :cond_1
    return-void
.end method

.method private setStatusBar()V
    .locals 5

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/high16 v1, 0x4000000

    const/16 v2, 0x15

    if-lt v0, v2, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v3

    .line 3
    invoke-virtual {v3, v1}, Landroid/view/Window;->clearFlags(I)V

    .line 4
    invoke-virtual {v3}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    const/16 v4, 0x500

    invoke-virtual {v1, v4}, Landroid/view/View;->setSystemUiVisibility(I)V

    const/high16 v1, -0x80000000

    .line 5
    invoke-virtual {v3, v1}, Landroid/view/Window;->addFlags(I)V

    const/4 v1, 0x0

    .line 6
    invoke-virtual {v3, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    goto :goto_0

    :cond_0
    const/16 v3, 0x13

    if-lt v0, v3, :cond_1

    .line 7
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/view/Window;->addFlags(I)V

    .line 8
    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->b:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    if-lt v0, v2, :cond_2

    .line 9
    invoke-static {p0}, Lcom/join/android/app/common/utils/n;->v(Landroid/content/Context;)I

    move-result v0

    iput v0, v1, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 10
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->b:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private updateProgressPartly()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->l:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v0, :cond_2

    .line 2
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->l:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    const/16 v1, 0xc

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->l:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_2

    .line 4
    iget-boolean v0, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->o:Z

    if-nez v0, :cond_2

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->c:Ljava/lang/String;

    iget-object v1, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->l:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->j:Lcom/join/mgps/customview/PictureHProgress;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/PictureHProgress;->setProgress(I)V

    goto :goto_1

    .line 7
    :cond_1
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->c:Ljava/lang/String;

    iget-object v1, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->l:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 8
    invoke-static {}, Lcom/join/android/app/common/servcie/i;->e()Lcom/join/android/app/common/servcie/i;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->l:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/android/app/common/servcie/i;->f(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    .line 9
    iget-object v1, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->j:Lcom/join/mgps/customview/PictureHProgress;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v2

    long-to-int v3, v2

    invoke-virtual {v1, v3}, Lcom/join/mgps/customview/PictureHProgress;->setProgress(I)V

    .line 10
    iget-object v1, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->i:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u6b63\u5728\u90e8\u7f72\u6781\u901f\u4e0b\u8f7d\u901a\u9053 "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, "%"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method afterViews()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/d0;->d(Ljava/lang/Object;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/QuarkLoadingActivity;->setStatusBar()V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->c:Ljava/lang/String;

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "\u6e38\u620f\u4fe1\u606f\u83b7\u53d6\u5931\u8d25\uff0c\u8bf7\u91cd\u8bd5"

    .line 4
    invoke-static {v0}, Lcom/papa91/arc/ext/ToastManager;->show(Ljava/lang/CharSequence;)V

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    .line 6
    :cond_0
    invoke-direct {p0}, Lcom/join/mgps/activity/QuarkLoadingActivity;->j0()V

    return-void
.end method

.method back()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Click;
        value = {
            0x7f090cd6
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/QuarkLoadingActivity;->i0()V

    return-void
.end method

.method h0()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
        value = {
            0x7f0915a6
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->l:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v0, :cond_0

    .line 2
    invoke-static {v0}, Lcom/php25/PDownload/d;->i(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public l0(Ljava/lang/String;ILjava/lang/String;)Z
    .locals 1

    .line 1
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getMindPackageManager()Lcom/xinzhu/overmind/client/frameworks/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/xinzhu/overmind/client/frameworks/g;->k(Ljava/lang/String;)Lcom/xinzhu/overmind/server/pm/MindPackageSettings;

    move-result-object p1

    .line 2
    invoke-virtual {p1}, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->k()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/xinzhu/overmind/plugin/b;->i()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 3
    :cond_0
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    const-string v0, "android.intent.action.VIEW"

    .line 4
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 5
    invoke-static {p3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p3

    .line 6
    invoke-virtual {p1, p3}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    const-string p3, "com.quark.browser"

    .line 7
    invoke-virtual {p1, p3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    const/high16 p3, 0x10000000

    .line 8
    invoke-virtual {p1, p3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 9
    sget-object p3, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {p3}, Lcom/MApplication;->l()Lcom/join/mgps/pref/PrefDef_;

    move-result-object p3

    invoke-virtual {p3}, Lcom/join/mgps/pref/PrefDef_;->has_launch_quark()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object p3

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p3, v0}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 10
    sget-object p3, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {p3}, Lcom/MApplication;->l()Lcom/join/mgps/pref/PrefDef_;

    move-result-object p3

    invoke-virtual {p3}, Lcom/join/mgps/pref/PrefDef_;->isQuarkSilentDownload()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object p3

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p3, v0}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 11
    new-instance p3, Ljava/lang/Thread;

    new-instance v0, Lcom/join/mgps/activity/QuarkLoadingActivity$a;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/activity/QuarkLoadingActivity$a;-><init>(Lcom/join/mgps/activity/QuarkLoadingActivity;Landroid/content/Intent;I)V

    invoke-direct {p3, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 12
    invoke-virtual {p3}, Ljava/lang/Thread;->start()V

    const/4 p1, 0x1

    return p1
.end method

.method public onDestroy()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/BaseActivity;->onDestroy()V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/QuarkLoadingActivity;->i0()V

    return-void
.end method

.method public onEventMainThread(Lcom/join/mgps/event/n;)V
    .locals 5
    .annotation runtime Lorg/greenrobot/eventbus/Subscribe;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/event/n;->a()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/event/n;->c()I

    move-result p1

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-eq p1, v2, :cond_7

    const/4 v3, 0x3

    if-eq p1, v3, :cond_6

    const/4 v2, 0x5

    if-eq p1, v2, :cond_5

    const/4 v1, 0x6

    if-eq p1, v1, :cond_4

    const/4 v1, 0x7

    if-eq p1, v1, :cond_3

    const/16 v3, 0x8

    if-eq p1, v3, :cond_1

    const/16 v4, 0x30

    if-eq p1, v4, :cond_0

    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    :pswitch_0
    const/16 p1, 0x9

    .line 3
    invoke-virtual {p0, v0, p1}, Lcom/join/mgps/activity/QuarkLoadingActivity;->updateUI(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 4
    :pswitch_1
    invoke-virtual {p0, v0, v3}, Lcom/join/mgps/activity/QuarkLoadingActivity;->updateUI(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 5
    :pswitch_2
    invoke-virtual {p0, v0, v1}, Lcom/join/mgps/activity/QuarkLoadingActivity;->updateUI(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 6
    :cond_0
    :pswitch_3
    invoke-virtual {p0, v0, v2}, Lcom/join/mgps/activity/QuarkLoadingActivity;->updateUI(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    if-eqz v0, :cond_8

    .line 7
    iget-object p1, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->c:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 8
    iget-object p1, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->i:Landroid/widget/TextView;

    const-string v0, "\u6b63\u5728\u90e8\u7f72\u6781\u901f\u4e0b\u8f7d\u901a\u9053"

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    iget-object p1, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->j:Lcom/join/mgps/customview/PictureHProgress;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 10
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->l:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-nez p1, :cond_2

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object p1

    const-string v1, "3875871586"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 11
    iput-object v0, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->l:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 12
    :cond_2
    invoke-direct {p0}, Lcom/join/mgps/activity/QuarkLoadingActivity;->updateProgressPartly()V

    goto :goto_0

    .line 13
    :cond_3
    invoke-virtual {p0, v0, v3}, Lcom/join/mgps/activity/QuarkLoadingActivity;->updateUI(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 14
    :cond_4
    invoke-virtual {p0, v0, v1}, Lcom/join/mgps/activity/QuarkLoadingActivity;->updateUI(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 15
    :cond_5
    invoke-virtual {p0, v0, v2}, Lcom/join/mgps/activity/QuarkLoadingActivity;->updateUI(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    if-eqz v0, :cond_8

    .line 16
    iget-object p1, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->c:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 17
    iput-boolean v1, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->p:Z

    .line 18
    invoke-direct {p0}, Lcom/join/mgps/activity/QuarkLoadingActivity;->m0()V

    goto :goto_0

    .line 19
    :cond_6
    invoke-virtual {p0, v0, v2}, Lcom/join/mgps/activity/QuarkLoadingActivity;->updateUI(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 20
    :cond_7
    invoke-virtual {p0, v0, v1}, Lcom/join/mgps/activity/QuarkLoadingActivity;->updateUI(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    :cond_8
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/BaseFragmentActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 2
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 3
    invoke-direct {p0}, Lcom/join/mgps/activity/QuarkLoadingActivity;->j0()V

    return-void
.end method

.method q0()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->o:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->p:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lcom/join/mgps/activity/QuarkLoadingActivity;->n0(Z)V

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->n:Lcom/join/mgps/activity/QuarkLoadingActivity$b;

    if-eqz v1, :cond_0

    const/4 v2, 0x0

    .line 4
    invoke-virtual {v1, v2}, Lcom/join/mgps/activity/QuarkLoadingActivity$b;->a(Z)V

    const/4 v1, 0x0

    .line 5
    iput-object v1, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->n:Lcom/join/mgps/activity/QuarkLoadingActivity$b;

    .line 6
    :cond_0
    new-instance v1, Lcom/join/mgps/activity/QuarkLoadingActivity$b;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/QuarkLoadingActivity$b;-><init>(Lcom/join/mgps/activity/QuarkLoadingActivity;)V

    iput-object v1, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->n:Lcom/join/mgps/activity/QuarkLoadingActivity$b;

    .line 7
    invoke-virtual {v1, v0}, Lcom/join/mgps/activity/QuarkLoadingActivity$b;->a(Z)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->n:Lcom/join/mgps/activity/QuarkLoadingActivity$b;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    :cond_1
    return-void
.end method

.method r0(I)V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->j:Lcom/join/mgps/customview/PictureHProgress;

    invoke-virtual {v0, p1}, Lcom/join/mgps/customview/PictureHProgress;->setProgress(I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->i:Landroid/widget/TextView;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u6b63\u5728\u542f\u52a8\u6781\u901f\u4e0b\u8f7d\u901a\u9053 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/mgps/activity/QuarkLoadingActivity;->j:Lcom/join/mgps/customview/PictureHProgress;

    invoke-virtual {v1}, Lcom/join/mgps/customview/PictureHProgress;->getProgress()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "%"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method showToast(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/r2;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/r2;-><init>(Lcom/join/mgps/activity/QuarkLoadingActivity;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method updateUI(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V
    .locals 0

    if-eqz p1, :cond_0

    packed-switch p2, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    .line 1
    :pswitch_1
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/QuarkLoadingActivity;->receiveError(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 2
    :pswitch_2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/QuarkLoadingActivity;->receiveSuccess(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 3
    :pswitch_3
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/QuarkLoadingActivity;->receiveDelete(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 4
    :pswitch_4
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/QuarkLoadingActivity;->receiveStart(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    :cond_0
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch
.end method
