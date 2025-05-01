.class public Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;
.super Lcom/BaseAppCompatActivity;
.source "OnlineGameInstallCheckActivity.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$d;,
        Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$c;
    }
.end annotation

.annotation build Lorg/androidannotations/annotations/EActivity;
    value = 0x7f0c007b
.end annotation


# instance fields
.field b:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field c:Lcom/facebook/drawee/view/SimpleDraweeView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field d:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field e:Landroid/widget/ProgressBar;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field f:Landroidx/recyclerview/widget/RecyclerView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field g:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field h:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field i:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field j:Lcom/join/mgps/pref/PrefDef_;
    .annotation build Lorg/androidannotations/annotations/sharedpreferences/Pref;
    .end annotation
.end field

.field private k:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$d;",
            ">;"
        }
    .end annotation
.end field

.field private l:Lcom/github/snowdream/android/app/downloader/DownloadTask;

.field private m:Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$c;

.field private n:Landroid/os/CountDownTimer;

.field private o:I

.field private p:I

.field q:Landroid/os/Handler;

.field r:Ljava/lang/Runnable;

.field private s:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/BaseAppCompatActivity;-><init>()V

    const/16 v0, 0x1388

    .line 2
    iput v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->o:I

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->p:I

    .line 4
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->q:Landroid/os/Handler;

    .line 5
    new-instance v0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$a;-><init>(Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;)V

    iput-object v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->r:Ljava/lang/Runnable;

    return-void
.end method

.method public static synthetic f0(Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->r0(Landroid/view/View;)V

    return-void
.end method

.method static synthetic g0(Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->p:I

    return p0
.end method

.method static synthetic h0(Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->p:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->p:I

    return v0
.end method

.method static synthetic i0(Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->k:Ljava/util/ArrayList;

    return-object p0
.end method

.method private initView()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->i:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "gameId\u4e3a\u7a7a"

    .line 2
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->showToast(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    .line 4
    :cond_0
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->l:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-nez v0, :cond_1

    const-string v0, "\u83b7\u53d6\u4e0b\u8f7d\u4efb\u52a1\u5931\u8d25"

    .line 5
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->showToast(Ljava/lang/String;)V

    .line 6
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    .line 7
    :cond_1
    iget-object v1, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->c:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPortraitURL()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/join/android/app/common/utils/MyImageLoader;->n(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->l:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getShowName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->g:Landroid/widget/TextView;

    const-string v1, "\u7acb\u5373\u5b89\u88c5"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u8fc7\u53bb2\u5c0f\u65f6\u5185\u5df2\u6709"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v1, 0x4072c00000000000L    # 300.0

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v3

    const-wide v5, 0x407f400000000000L    # 500.0

    mul-double v3, v3, v5

    add-double/2addr v3, v1

    double-to-int v1, v3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\u4eba\u901a\u8fc7\u609f\u996d\u5b89\u88c5\u6b64\u6e38\u620f"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 11
    new-instance v1, Landroid/text/SpannableString;

    invoke-direct {v1, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 12
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    const-string v2, "#FF2E2E"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-direct {v0, v2}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    const/16 v2, 0x8

    const/16 v3, 0xb

    const/16 v4, 0x21

    invoke-virtual {v1, v0, v2, v3, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 13
    iget-object v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method static synthetic j0(Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;)Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->m:Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$c;

    return-object p0
.end method

.method static synthetic k0(Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->m0()V

    return-void
.end method

.method static synthetic l0(Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->q0()V

    return-void
.end method

.method private m0()V
    .locals 8

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->s:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->e:Landroid/widget/ProgressBar;

    iget-object v1, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->k:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 3
    new-instance v0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$b;

    iget v1, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->o:I

    add-int/lit16 v1, v1, 0xc8

    int-to-long v4, v1

    const-wide/16 v6, 0x3e8

    move-object v2, v0

    move-object v3, p0

    invoke-direct/range {v2 .. v7}, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$b;-><init>(Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;JJ)V

    .line 4
    invoke-virtual {v0}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->n:Landroid/os/CountDownTimer;

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->g:Landroid/widget/TextView;

    new-instance v1, Lcom/join/mgps/activity/k2;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/k2;-><init>(Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private n0()Ljava/lang/String;
    .locals 4

    .line 1
    :try_start_0
    invoke-static {p0}, Lcom/join/mgps/Util/s1;->a(Landroid/content/Context;)Ljava/util/List;

    move-result-object v0

    .line 2
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/Filepath;

    const-string v2, ""

    .line 3
    iget-object v3, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->l:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getGameZipPath()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 4
    iget-object v2, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->l:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getGameZipPath()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 5
    :cond_1
    iget-object v3, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->l:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 6
    iget-object v2, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->l:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPath()Ljava/lang/String;

    move-result-object v2

    .line 7
    :cond_2
    :goto_0
    invoke-virtual {v1}, Lcom/join/mgps/dto/Filepath;->getPathRoot()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 8
    invoke-virtual {v1}, Lcom/join/mgps/dto/Filepath;->getAvailable()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_3
    const-string v0, "\u65e0\u53ef\u7528\u7a7a\u95f4"

    return-object v0
.end method

.method private o0()I
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->l:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPath()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x1000

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageArchiveInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 3
    array-length v0, v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    .line 4
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private p0()V
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->k:Ljava/util/ArrayList;

    .line 2
    new-instance v7, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$d;

    iget-object v1, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->l:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v5

    const v3, 0x7f0805fb

    const-string v4, "Apk\u5b8c\u6574\u6027\u68c0\u6d4b"

    const/4 v6, 0x0

    move-object v1, v7

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$d;-><init>(Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;ILjava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->k:Ljava/util/ArrayList;

    new-instance v7, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$d;

    sget-object v5, Landroid/os/Build;->BRAND:Ljava/lang/String;

    const v3, 0x7f0805fc

    const-string v4, "\u624b\u673a\u517c\u5bb9\u6027"

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$d;-><init>(Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;ILjava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->k:Ljava/util/ArrayList;

    new-instance v7, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Android"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const v3, 0x7f0805fa

    const-string v4, "\u7cfb\u7edf\u517c\u5bb9\u6027"

    move-object v1, v7

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$d;-><init>(Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;ILjava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->k:Ljava/util/ArrayList;

    new-instance v7, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$d;

    invoke-direct {p0}, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->n0()Ljava/lang/String;

    move-result-object v5

    const v3, 0x7f0805ff

    const-string v4, "\u5269\u4f59\u5b58\u50a8\u7a7a\u95f4"

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$d;-><init>(Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;ILjava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->k:Ljava/util/ArrayList;

    new-instance v7, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$d;

    const v3, 0x7f080600

    const-string v4, "\u6076\u610f\u63d2\u4ef6\u68c0\u6d4b"

    const-string v5, "\u65e0"

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$d;-><init>(Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;ILjava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->k:Ljava/util/ArrayList;

    new-instance v7, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0}, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->o0()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "\u9879\u6743\u9650"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const v3, 0x7f0805fe

    const-string v4, "\u6743\u9650\u68c0\u6d4b"

    move-object v1, v7

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$d;-><init>(Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;ILjava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->f:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v1, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 9
    new-instance v0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$c;-><init>(Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;)V

    iput-object v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->m:Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$c;

    .line 10
    iget-object v1, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->f:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 11
    iget-object v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->e:Landroid/widget/ProgressBar;

    iget-object v1, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->k:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 12
    iget-object v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->q:Landroid/os/Handler;

    iget-object v1, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->r:Ljava/lang/Runnable;

    const-wide/16 v2, 0x15e

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private q0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->n:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/BaseAppCompatActivity;->mHandler:Landroid/os/Handler;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->r:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 3
    :cond_1
    iget-boolean v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->s:Z

    if-eqz v0, :cond_2

    return-void

    .line 4
    :cond_2
    invoke-static {p0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v0

    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->l:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0, v1}, Lcom/join/android/app/common/utils/APKUtils;->z(Landroid/content/Context;Ljava/io/File;)V

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method private synthetic r0(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->q0()V

    return-void
.end method


# virtual methods
.method afterviews()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/high16 v1, 0x4000000

    const/16 v2, 0x15

    if-lt v0, v2, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    .line 3
    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    .line 4
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    const/16 v2, 0x500

    invoke-virtual {v1, v2}, Landroid/view/View;->setSystemUiVisibility(I)V

    const/high16 v1, -0x80000000

    .line 5
    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    goto :goto_0

    :cond_0
    const/16 v2, 0x13

    if-lt v0, v2, :cond_1

    .line 7
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 8
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->j:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->net_game_count_down()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->j:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->net_game_count_down()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_1

    :cond_2
    const/16 v0, 0x1388

    :goto_1
    iput v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->o:I

    .line 9
    invoke-direct {p0}, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->initView()V

    .line 10
    invoke-direct {p0}, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->p0()V

    return-void
.end method

.method back_image()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method protected onDestroy()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/BaseAppCompatActivity;->onDestroy()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->s:Z

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->n:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/BaseAppCompatActivity;->mHandler:Landroid/os/Handler;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->r:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method

.method showToast(Ljava/lang/String;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method
