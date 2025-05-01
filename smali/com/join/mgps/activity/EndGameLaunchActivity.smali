.class public Lcom/join/mgps/activity/EndGameLaunchActivity;
.super Lcom/BaseAppCompatActivity;
.source "EndGameLaunchActivity.java"


# annotations
.annotation build Lorg/androidannotations/annotations/EActivity;
    value = 0x7f0c0040
.end annotation


# instance fields
.field b:Lcom/facebook/drawee/view/SimpleDraweeView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field c:Landroid/widget/FrameLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field d:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field e:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field f:Lcom/join/mgps/dto/EndGameBean;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field g:I
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field h:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field private i:Landroid/app/Activity;

.field private j:Lcom/github/snowdream/android/app/downloader/b;

.field private k:Lcom/github/snowdream/android/app/downloader/b$b;

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;

.field private n:I

.field private o:Z

.field p:Ljava/lang/Runnable;

.field q:Ljava/lang/Runnable;

.field r:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/BaseAppCompatActivity;-><init>()V

    .line 2
    new-instance v0, Lcom/join/mgps/activity/EndGameLaunchActivity$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/EndGameLaunchActivity$b;-><init>(Lcom/join/mgps/activity/EndGameLaunchActivity;)V

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->p:Ljava/lang/Runnable;

    .line 3
    new-instance v0, Lcom/join/mgps/activity/EndGameLaunchActivity$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/EndGameLaunchActivity$d;-><init>(Lcom/join/mgps/activity/EndGameLaunchActivity;)V

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->q:Ljava/lang/Runnable;

    .line 4
    new-instance v0, Lcom/join/mgps/activity/EndGameLaunchActivity$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/EndGameLaunchActivity$e;-><init>(Lcom/join/mgps/activity/EndGameLaunchActivity;)V

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->r:Ljava/lang/Runnable;

    return-void
.end method

.method static synthetic f0(Lcom/join/mgps/activity/EndGameLaunchActivity;)Landroid/app/Activity;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->i:Landroid/app/Activity;

    return-object p0
.end method

.method static synthetic g0(Lcom/join/mgps/activity/EndGameLaunchActivity;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->n:I

    return p0
.end method

.method static synthetic h0(Lcom/join/mgps/activity/EndGameLaunchActivity;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->m:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic i0(Lcom/join/mgps/activity/EndGameLaunchActivity;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->n:I

    return p1
.end method

.method static synthetic j0(Lcom/join/mgps/activity/EndGameLaunchActivity;)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->n:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->n:I

    return v0
.end method

.method static synthetic k0(Lcom/join/mgps/activity/EndGameLaunchActivity;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->l:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic l0(Lcom/join/mgps/activity/EndGameLaunchActivity;I)I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->n:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->n:I

    return v0
.end method

.method static synthetic m0(Lcom/join/mgps/activity/EndGameLaunchActivity;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/BaseAppCompatActivity;->mHandler:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic n0(Lcom/join/mgps/activity/EndGameLaunchActivity;Landroid/os/Handler;)Landroid/os/Handler;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/BaseAppCompatActivity;->mHandler:Landroid/os/Handler;

    return-object p1
.end method

.method static synthetic o0(Lcom/join/mgps/activity/EndGameLaunchActivity;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/BaseAppCompatActivity;->mHandler:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic p0(Lcom/join/mgps/activity/EndGameLaunchActivity;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/BaseAppCompatActivity;->mHandler:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic q0(Lcom/join/mgps/activity/EndGameLaunchActivity;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->o:Z

    return p0
.end method

.method static synthetic r0(Lcom/join/mgps/activity/EndGameLaunchActivity;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/BaseAppCompatActivity;->mHandler:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic s0(Lcom/join/mgps/activity/EndGameLaunchActivity;Landroid/os/Handler;)Landroid/os/Handler;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/BaseAppCompatActivity;->mHandler:Landroid/os/Handler;

    return-object p1
.end method

.method static synthetic t0(Lcom/join/mgps/activity/EndGameLaunchActivity;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/BaseAppCompatActivity;->mHandler:Landroid/os/Handler;

    return-object p0
.end method

.method private u0()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/github/snowdream/android/app/downloader/b;->e()Lcom/github/snowdream/android/app/downloader/b;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->j:Lcom/github/snowdream/android/app/downloader/b;

    .line 2
    new-instance v0, Lcom/join/mgps/activity/EndGameLaunchActivity$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/EndGameLaunchActivity$f;-><init>(Lcom/join/mgps/activity/EndGameLaunchActivity;)V

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->k:Lcom/github/snowdream/android/app/downloader/b$b;

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->j:Lcom/github/snowdream/android/app/downloader/b;

    invoke-virtual {v1, v0}, Lcom/github/snowdream/android/app/downloader/b;->m(Lcom/github/snowdream/android/app/downloader/b$b;)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->j:Lcom/github/snowdream/android/app/downloader/b;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/b;->i()V

    return-void
.end method

.method private x0(Z)V
    .locals 6

    .line 1
    iget v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->g:I

    const/16 v1, 0xf

    if-ne v0, v1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/EndGameLaunchActivity;->z0()V

    return-void

    .line 3
    :cond_0
    iput-boolean p1, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->o:Z

    if-nez p1, :cond_1

    const/16 p1, 0x50

    .line 4
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/EndGameLaunchActivity;->w0(I)V

    .line 5
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->f:Lcom/join/mgps/dto/EndGameBean;

    if-nez p1, :cond_2

    const-string p1, "\u83b7\u53d6\u6b8b\u5c40\u4fe1\u606f\u5931\u8d25"

    .line 6
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/EndGameLaunchActivity;->showTost(Ljava/lang/String;)V

    .line 7
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    .line 8
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->f:Lcom/join/mgps/dto/EndGameBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/EndGameBean;->getEndgameId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "_v2"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->l:Ljava/lang/String;

    .line 9
    sget-object p1, Lcom/join/mgps/Util/v;->j:Ljava/lang/String;

    iput-object p1, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->m:Ljava/lang/String;

    .line 10
    new-instance p1, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p1

    if-nez p1, :cond_3

    .line 11
    new-instance p1, Lcom/github/snowdream/android/app/downloader/c;

    iget-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->f:Lcom/join/mgps/dto/EndGameBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/EndGameBean;->getArchive()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->l:Ljava/lang/String;

    iget-object v3, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->m:Ljava/lang/String;

    const-wide/16 v4, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lcom/github/snowdream/android/app/downloader/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 12
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->j:Lcom/github/snowdream/android/app/downloader/b;

    invoke-virtual {v0, p1}, Lcom/github/snowdream/android/app/downloader/b;->b(Lcom/github/snowdream/android/app/downloader/c;)Ljava/lang/String;

    goto :goto_0

    .line 13
    :cond_3
    invoke-virtual {p0}, Lcom/join/mgps/activity/EndGameLaunchActivity;->y0()V

    :goto_0
    return-void
.end method


# virtual methods
.method A0(Ljava/lang/String;)V
    .locals 6
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->i:Landroid/app/Activity;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v2

    iget-object v3, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->e:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v2

    iget v3, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->g:I

    const/4 v5, 0x1

    move-object v4, p1

    invoke-static/range {v0 .. v5}, Lcom/join/mgps/Util/UtilsMy;->j4(Landroid/content/Context;Ljava/lang/String;Lcom/github/snowdream/android/app/downloader/DownloadTask;ILjava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    .line 3
    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/join/mgps/activity/EndGameLaunchActivity$c;

    invoke-direct {v1, p0, p1}, Lcom/join/mgps/activity/EndGameLaunchActivity$c;-><init>(Lcom/join/mgps/activity/EndGameLaunchActivity;Ljava/lang/String;)V

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method afterviews()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    iput-object p0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->i:Landroid/app/Activity;

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/d0;->d(Ljava/lang/Object;)V

    .line 3
    invoke-direct {p0}, Lcom/join/mgps/activity/EndGameLaunchActivity;->u0()V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->f:Lcom/join/mgps/dto/EndGameBean;

    if-eqz v1, :cond_0

    .line 5
    invoke-virtual {v1}, Lcom/join/mgps/dto/EndGameBean;->getGameIcon()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 6
    :cond_0
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    .line 7
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    const/4 v2, 0x5

    if-eq v0, v2, :cond_1

    goto :goto_0

    .line 8
    :cond_1
    invoke-direct {p0, v1}, Lcom/join/mgps/activity/EndGameLaunchActivity;->x0(Z)V

    goto :goto_1

    .line 9
    :cond_2
    :goto_0
    invoke-static {p0}, Lcom/join/mgps/service/CommonService_;->S2(Landroid/content/Context;)Lcom/join/mgps/service/CommonService_$h2;

    move-result-object v0

    iget-object v2, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->e:Ljava/lang/String;

    const-string v3, "gameDownloadDetail"

    invoke-virtual {v0, v3, v2}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Ljava/lang/String;)Lorg/androidannotations/api/builder/e;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/service/CommonService_$h2;

    const-string v2, "fromRecomDown"

    invoke-virtual {v0, v2, v1}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Z)Lorg/androidannotations/api/builder/e;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/service/CommonService_$h2;

    const/16 v1, 0x9d

    const-string v2, "_from"

    invoke-virtual {v0, v2, v1}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;I)Lorg/androidannotations/api/builder/e;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/service/CommonService_$h2;

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/g;->a()Landroid/content/ComponentName;

    .line 10
    iget-object v0, p0, Lcom/BaseAppCompatActivity;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->q:Ljava/lang/Runnable;

    const-wide/16 v2, 0x96

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :goto_1
    return-void
.end method

.method protected onDestroy()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/BaseAppCompatActivity;->mHandler:Landroid/os/Handler;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 2
    :cond_0
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/d0;->e(Ljava/lang/Object;)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->j:Lcom/github/snowdream/android/app/downloader/b;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->k:Lcom/github/snowdream/android/app/downloader/b$b;

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/b;->j(Lcom/github/snowdream/android/app/downloader/b$b;)V

    .line 4
    :cond_1
    invoke-super {p0}, Lcom/BaseAppCompatActivity;->onDestroy()V

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

    const/4 v1, 0x2

    const/16 v2, 0x32

    if-eq p1, v1, :cond_2

    const/4 v1, 0x5

    if-eq p1, v1, :cond_0

    const/16 v1, 0xb

    if-eq p1, v1, :cond_0

    const/16 v1, 0x30

    if-eq p1, v1, :cond_0

    goto/16 :goto_0

    .line 3
    :cond_0
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p1

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    .line 4
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->e:Ljava/lang/String;

    invoke-static {v1, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    .line 5
    invoke-virtual {p0, v2}, Lcom/join/mgps/activity/EndGameLaunchActivity;->w0(I)V

    .line 6
    invoke-direct {p0, v3}, Lcom/join/mgps/activity/EndGameLaunchActivity;->x0(Z)V

    goto :goto_0

    .line 7
    :cond_1
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/16 p1, 0x64

    .line 8
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/EndGameLaunchActivity;->w0(I)V

    .line 9
    invoke-direct {p0, v3}, Lcom/join/mgps/activity/EndGameLaunchActivity;->x0(Z)V

    goto :goto_0

    .line 10
    :cond_2
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p1

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    .line 11
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->e:Ljava/lang/String;

    invoke-static {v1, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    if-eqz v1, :cond_3

    .line 12
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v0

    long-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, v3

    double-to-int p1, v0

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/EndGameLaunchActivity;->w0(I)V

    goto :goto_0

    .line 13
    :cond_3
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 14
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v0

    long-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, v3

    double-to-int p1, v0

    add-int/2addr p1, v2

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/EndGameLaunchActivity;->w0(I)V

    :cond_4
    :goto_0
    return-void
.end method

.method showTost(Ljava/lang/String;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method

.method public v0()V
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/join/mgps/Util/v;->j:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/record/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->h:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->i:Landroid/app/Activity;

    const/4 v1, 0x0

    const-string v2, "\u56de\u653e\u5931\u8d25\uff01"

    invoke-static {v0, v2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto :goto_0

    .line 5
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->h:Ljava/lang/String;

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 6
    new-instance v2, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 7
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 8
    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/EndGameLaunchActivity;->A0(Ljava/lang/String;)V

    goto :goto_0

    .line 9
    :cond_1
    invoke-static {}, Lcom/join/android/app/common/http/d;->B()Lcom/join/android/app/common/http/d$j;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->h:Ljava/lang/String;

    new-instance v3, Lcom/join/mgps/activity/EndGameLaunchActivity$a;

    invoke-direct {v3, p0}, Lcom/join/mgps/activity/EndGameLaunchActivity$a;-><init>(Lcom/join/mgps/activity/EndGameLaunchActivity;)V

    invoke-virtual {v1, v2, v0, v3}, Lcom/join/android/app/common/http/d$j;->a(Ljava/lang/String;Ljava/lang/String;Lcom/join/android/app/common/http/d$p;)V

    :goto_0
    return-void
.end method

.method w0(I)V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    if-gez p1, :cond_0

    const/4 p1, 0x0

    :cond_0
    const/16 v0, 0x64

    if-le p1, v0, :cond_1

    const/16 p1, 0x64

    .line 1
    :cond_1
    iget v1, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->n:I

    if-ge p1, v1, :cond_2

    move p1, v1

    .line 2
    :cond_2
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f07107f

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    mul-int v1, v1, p1

    div-int/2addr v1, v0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->c:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 4
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 5
    iget-object v1, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->c:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 6
    iput p1, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->n:I

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->d:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u6b63\u5728\u8fdb\u5165\u6e38\u620f"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "%"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method y0()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/BaseAppCompatActivity;->mHandler:Landroid/os/Handler;

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/BaseAppCompatActivity;->mHandler:Landroid/os/Handler;

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/BaseAppCompatActivity;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->r:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 3
    iget-object v0, p0, Lcom/BaseAppCompatActivity;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->r:Ljava/lang/Runnable;

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method z0()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/BaseAppCompatActivity;->mHandler:Landroid/os/Handler;

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/BaseAppCompatActivity;->mHandler:Landroid/os/Handler;

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/BaseAppCompatActivity;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->p:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 3
    iget-object v0, p0, Lcom/BaseAppCompatActivity;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/join/mgps/activity/EndGameLaunchActivity;->p:Ljava/lang/Runnable;

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
