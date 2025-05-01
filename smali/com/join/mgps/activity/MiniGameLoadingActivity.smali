.class public Lcom/join/mgps/activity/MiniGameLoadingActivity;
.super Lcom/BaseActivity;
.source "MiniGameLoadingActivity.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/MiniGameLoadingActivity$g;,
        Lcom/join/mgps/activity/MiniGameLoadingActivity$f;
    }
.end annotation

.annotation build Lorg/androidannotations/annotations/EActivity;
    value = 0x7f0c0074
.end annotation


# static fields
.field public static final D:Ljava/lang/String; = "_mod_info"

.field private static E:Lcom/github/snowdream/android/app/downloader/b; = null

.field static F:Lcom/github/snowdream/android/app/downloader/b$b; = null

.field private static G:Ljava/util/Map; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/github/snowdream/android/app/downloader/c;",
            ">;"
        }
    .end annotation
.end field

.field public static H:I = 0x0

.field public static final I:I = 0x2


# instance fields
.field A:Lcom/join/mgps/activity/MiniGameLoadingActivity$g;

.field B:Z
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field C:Z

.field b:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field c:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field d:Lcom/facebook/drawee/view/SimpleDraweeView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field e:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field f:Landroid/widget/TextView;
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

.field i:Lcom/join/mgps/customview/PictureHProgress;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field j:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field k:Lcom/github/snowdream/android/app/downloader/DownloadTask;

.field l:Ljava/lang/String;

.field m:Ljava/lang/String;

.field n:Ljava/lang/String;

.field o:I

.field p:I

.field q:I

.field r:Lcom/join/mgps/activity/MiniGameLoadingActivity$f;

.field s:Z

.field t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field u:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field v:Z

.field private w:Z

.field private x:Ljava/lang/String;

.field private y:J

.field private z:Ljava/util/concurrent/Executor;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(I)V

    sput-object v0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->G:Ljava/util/Map;

    .line 2
    sput v1, Lcom/join/mgps/activity/MiniGameLoadingActivity;->H:I

    return-void
.end method

.method public constructor <init>()V
    .locals 10

    .line 1
    invoke-direct {p0}, Lcom/BaseActivity;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->s:Z

    .line 3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->t:Ljava/util/List;

    .line 4
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->u:Ljava/util/List;

    .line 5
    iput-boolean v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->v:Z

    .line 6
    iput-boolean v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->w:Z

    const-string v1, ""

    .line 7
    iput-object v1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->x:Ljava/lang/String;

    const-wide/16 v1, 0x0

    .line 8
    iput-wide v1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->y:J

    .line 9
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v8, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v9, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v9}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    const/4 v4, 0x1

    const/4 v5, 0x2

    const-wide/16 v6, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    iput-object v1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->z:Ljava/util/concurrent/Executor;

    const/4 v1, 0x0

    .line 10
    iput-object v1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->A:Lcom/join/mgps/activity/MiniGameLoadingActivity$g;

    .line 11
    iput-boolean v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->B:Z

    .line 12
    iput-boolean v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->C:Z

    return-void
.end method

.method private declared-synchronized A0()V
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/join/mgps/activity/MiniGameLoadingActivity$d;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/MiniGameLoadingActivity$d;-><init>(Lcom/join/mgps/activity/MiniGameLoadingActivity;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 2
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private B0()V
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

    iput-boolean v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->B:Z

    .line 3
    :cond_0
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v2, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->c:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->k:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-nez v0, :cond_1

    const-string v0, "\u6e38\u620f\u6570\u636e\u83b7\u53d6\u9519\u8bef"

    .line 4
    invoke-static {v0}, Lcom/papa91/arc/ext/ToastManager;->show(Ljava/lang/CharSequence;)V

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    .line 6
    :cond_1
    iget-object v2, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->d:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPortraitURL()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/join/android/app/common/utils/MyImageLoader;->n(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->e:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->k:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getShowName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    iget-boolean v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->B:Z

    if-eqz v0, :cond_3

    .line 9
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "packageName"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->l:Ljava/lang/String;

    .line 10
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "modPath"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->m:Ljava/lang/String;

    .line 11
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "modVersion"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->n:Ljava/lang/String;

    .line 12
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "modCode"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->o:I

    .line 13
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "modType"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->p:I

    .line 14
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "userId"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->q:I

    .line 15
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "_mod_info"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->x:Ljava/lang/String;

    .line 16
    iget-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->l:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 17
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    .line 18
    :cond_2
    new-instance v0, Lcom/join/mgps/pref/PrefDef_;

    invoke-direct {v0, p0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    .line 19
    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->lastLaunchModGameId()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    iget-object v2, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->c:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 20
    new-instance v0, Lcom/join/mgps/activity/MiniGameLoadingActivity$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MiniGameLoadingActivity$f;-><init>(Lcom/join/mgps/activity/MiniGameLoadingActivity;)V

    iput-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->r:Lcom/join/mgps/activity/MiniGameLoadingActivity$f;

    .line 21
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v2, "com.join.android.app.mgsim.wufun.soCopyStart"

    .line 22
    invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v2, "com.join.android.app.mgsim.wufun.soCopyFinish"

    .line 23
    invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v2, "com.join.android.app.mgsim.wufun.soCopyFail"

    .line 24
    invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v2, "com.join.android.app.mgsim.wufun.loadMod"

    .line 25
    invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 26
    iget-object v2, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->r:Lcom/join/mgps/activity/MiniGameLoadingActivity$f;

    invoke-virtual {p0, v2, v0}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 27
    iget-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->c:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->y0(Ljava/lang/String;)V

    .line 28
    invoke-virtual {p0}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->K0()V

    .line 29
    invoke-direct {p0, v1}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->M0(Z)V

    .line 30
    iget-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->f:Landroid/widget/TextView;

    const-string v1, "\u542f\u52a8\u4e2d..."

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_3
    const/4 v0, 0x1

    .line 31
    invoke-direct {p0, v0}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->L0(Z)V

    .line 32
    invoke-direct {p0, v0}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->M0(Z)V

    .line 33
    :goto_0
    iget-boolean v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->B:Z

    invoke-direct {p0, v0}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->Q0(Z)V

    return-void
.end method

.method private synthetic C0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method private synthetic D0(Landroid/os/Handler;)V
    .locals 6

    .line 1
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/va/overmind/d;->N(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    new-array v1, v0, [Ljava/lang/String;

    .line 2
    sget-object v2, Lcom/join/mgps/va/overmind/f;->a:Lcom/join/mgps/va/overmind/f;

    iget-object v3, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->l:Ljava/lang/String;

    .line 3
    invoke-virtual {v2, v3}, Lcom/join/mgps/va/overmind/f;->M(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v1, v4

    iget-object v3, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->l:Ljava/lang/String;

    .line 4
    invoke-virtual {v2, v3}, Lcom/join/mgps/va/overmind/f;->v(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x1

    aput-object v3, v1, v5

    const/4 v3, 0x2

    .line 5
    invoke-virtual {v2}, Lcom/join/mgps/va/overmind/f;->W()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v3

    :goto_0
    if-ge v4, v0, :cond_0

    .line 6
    aget-object v2, v1, v4

    .line 7
    invoke-static {v2}, Lcom/join/mgps/Util/h0;->i(Ljava/lang/String;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, Lcom/join/mgps/activity/m1;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/m1;-><init>(Lcom/join/mgps/activity/MiniGameLoadingActivity;)V

    const-wide/16 v1, 0x1388

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private synthetic E0(Landroid/os/Handler;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->v:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->v:Z

    .line 3
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v0

    iget v1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->q:I

    iget-object v2, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->l:Ljava/lang/String;

    invoke-virtual {v0, p0, v1, v2}, Lcom/join/mgps/va/overmind/d;->U(Landroid/content/Context;ILjava/lang/String;)V

    .line 4
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/join/mgps/activity/o1;

    invoke-direct {v1, p0, p1}, Lcom/join/mgps/activity/o1;-><init>(Lcom/join/mgps/activity/MiniGameLoadingActivity;Landroid/os/Handler;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 5
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->A:Lcom/join/mgps/activity/MiniGameLoadingActivity$g;

    if-eqz p1, :cond_1

    const/4 v0, 0x0

    .line 7
    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/MiniGameLoadingActivity$g;->a(Z)V

    const/4 p1, 0x0

    .line 8
    iput-object p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->A:Lcom/join/mgps/activity/MiniGameLoadingActivity$g;

    :cond_1
    :goto_0
    return-void
.end method

.method private synthetic F0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->P0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic G0(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method

.method private H0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->c:Ljava/lang/String;

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 3
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->isMiniGame()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->isSingleGame()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 4
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v1

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/va/overmind/d;->N(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 5
    invoke-static {p0, v0}, Lcom/join/android/app/common/utils/APKUtils;->b(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 6
    :cond_0
    new-instance v1, Lcom/join/mgps/activity/q1;

    invoke-direct {v1, p0, v0}, Lcom/join/mgps/activity/q1;-><init>(Lcom/join/mgps/activity/MiniGameLoadingActivity;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    invoke-static {p0, v1}, Lcom/join/android/app/common/utils/APKUtils;->g(Landroid/content/Context;Lkotlin/jvm/functions/Function0;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    .line 7
    :cond_1
    invoke-direct {p0, v0}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->P0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    :cond_2
    return-void
.end method

.method private J0()V
    .locals 12

    .line 1
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getMindPackageManager()Lcom/xinzhu/overmind/client/frameworks/g;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/xinzhu/overmind/client/frameworks/g;->k(Ljava/lang/String;)Lcom/xinzhu/overmind/server/pm/MindPackageSettings;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getMindPackageManager()Lcom/xinzhu/overmind/client/frameworks/g;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->l:Ljava/lang/String;

    iget v3, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->q:I

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v4, v3}, Lcom/xinzhu/overmind/client/frameworks/g;->f(Ljava/lang/String;II)Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    if-nez v1, :cond_1

    return-void

    .line 3
    :cond_1
    iget-object v2, v1, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 4
    sget-object v3, Lcom/join/mgps/va/overmind/d;->g:Lcom/join/mgps/va/overmind/d$a;

    invoke-virtual {v3}, Lcom/join/mgps/va/overmind/d$a;->g()Z

    move-result v3

    const/4 v5, 0x1

    xor-int/2addr v3, v5

    .line 5
    iget-object v6, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->m:Ljava/lang/String;

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v6

    goto :goto_0

    :cond_2
    iget-object v6, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->m:Ljava/lang/String;

    invoke-static {v6}, Lcom/join/mgps/va/overmind/b;->d(Ljava/lang/String;)Ljava/util/Set;

    move-result-object v6

    .line 6
    :goto_0
    invoke-static {v2}, Lcom/join/mgps/va/overmind/b;->d(Ljava/lang/String;)Ljava/util/Set;

    move-result-object v2

    .line 7
    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    .line 8
    invoke-interface {v7, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 9
    invoke-interface {v7, v6}, Ljava/util/Set;->retainAll(Ljava/util/Collection;)Z

    .line 10
    invoke-interface {v2}, Ljava/util/Set;->size()I

    move-result v6

    if-lez v6, :cond_11

    if-eqz v3, :cond_3

    .line 11
    invoke-static {v2}, Lcom/join/mgps/va/overmind/b;->a(Ljava/util/Set;)Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_1

    :cond_3
    invoke-static {v2}, Lcom/join/mgps/va/overmind/b;->b(Ljava/util/Set;)Z

    move-result v6

    if-nez v6, :cond_4

    :goto_1
    const/4 v6, 0x1

    goto :goto_2

    :cond_4
    const/4 v6, 0x0

    .line 12
    :goto_2
    invoke-interface {v7}, Ljava/util/Set;->size()I

    move-result v8

    if-lez v8, :cond_7

    if-eqz v3, :cond_5

    .line 13
    invoke-static {v7}, Lcom/join/mgps/va/overmind/b;->a(Ljava/util/Set;)Z

    move-result v6

    if-nez v6, :cond_6

    goto :goto_3

    :cond_5
    invoke-static {v7}, Lcom/join/mgps/va/overmind/b;->b(Ljava/util/Set;)Z

    move-result v6

    if-nez v6, :cond_6

    :goto_3
    const/4 v6, 0x1

    goto :goto_4

    :cond_6
    const/4 v6, 0x0

    :cond_7
    :goto_4
    new-array v8, v4, [Ljava/lang/String;

    new-array v9, v4, [Ljava/lang/String;

    .line 14
    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v11, 0x15

    if-lt v10, v11, :cond_8

    .line 15
    sget-object v8, Landroid/os/Build;->SUPPORTED_32_BIT_ABIS:[Ljava/lang/String;

    .line 16
    sget-object v9, Landroid/os/Build;->SUPPORTED_64_BIT_ABIS:[Ljava/lang/String;

    :cond_8
    const/4 v10, 0x0

    if-eqz v6, :cond_a

    if-eqz v3, :cond_9

    .line 17
    invoke-static {v9, v7}, Lcom/join/mgps/va/overmind/b;->c([Ljava/lang/String;Ljava/util/Set;)Ljava/lang/String;

    move-result-object v2

    goto :goto_5

    :cond_9
    invoke-static {v8, v7}, Lcom/join/mgps/va/overmind/b;->c([Ljava/lang/String;Ljava/util/Set;)Ljava/lang/String;

    move-result-object v2

    :goto_5
    move-object v10, v2

    goto :goto_6

    :cond_a
    if-eqz v3, :cond_b

    .line 18
    invoke-static {v2}, Lcom/join/mgps/va/overmind/b;->a(Ljava/util/Set;)Z

    move-result v3

    if-eqz v3, :cond_b

    .line 19
    invoke-static {v8, v7}, Lcom/join/mgps/va/overmind/b;->c([Ljava/lang/String;Ljava/util/Set;)Ljava/lang/String;

    move-result-object v10

    goto :goto_6

    .line 20
    :cond_b
    invoke-static {v2}, Lcom/join/mgps/va/overmind/b;->b(Ljava/util/Set;)Z

    move-result v2

    if-eqz v2, :cond_c

    .line 21
    invoke-static {v9, v7}, Lcom/join/mgps/va/overmind/b;->c([Ljava/lang/String;Ljava/util/Set;)Ljava/lang/String;

    move-result-object v10

    .line 22
    :cond_c
    :goto_6
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_d

    return-void

    .line 23
    :cond_d
    invoke-virtual {v0}, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    .line 24
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "package:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->l:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v4

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "abiOverride:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v5

    invoke-static {v0}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 25
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->l:Ljava/lang/String;

    invoke-virtual {v0, v1, v10}, Lcom/join/mgps/va/overmind/d;->i0(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_8

    .line 26
    :cond_e
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v0

    iget-object v2, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->l:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/join/mgps/va/overmind/d;->N(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_f

    iget-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->l:Ljava/lang/String;

    invoke-static {v0}, Lcom/xinzhu/overmind/a;->g(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    goto :goto_7

    :cond_f
    iget-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->l:Ljava/lang/String;

    invoke-static {v0}, Lcom/xinzhu/overmind/a;->f(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 27
    :goto_7
    invoke-static {}, Lcom/xinzhu/overmind/a;->f0()V

    .line 28
    new-instance v2, Ljava/io/File;

    invoke-static {v10}, Lcom/xinzhu/overmind/a;->K(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v0, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 29
    iget-object v0, v1, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    if-eqz v0, :cond_10

    .line 30
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    .line 31
    :cond_10
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->l:Ljava/lang/String;

    invoke-virtual {v0, v1, v10}, Lcom/join/mgps/va/overmind/d;->i0(Ljava/lang/String;Ljava/lang/String;)V

    :cond_11
    :goto_8
    return-void
.end method

.method private L0(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->i:Lcom/join/mgps/customview/PictureHProgress;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, 0x4

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private M0(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->g:Landroid/widget/TextView;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, 0x4

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method private P0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z
    .locals 10

    .line 1
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v0

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/va/overmind/d;->F(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    .line 2
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v0

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getMod_info()Ljava/lang/String;

    move-result-object v2

    const-class v3, Lcom/join/mgps/dto/ModInfoBean;

    invoke-virtual {v0, v2, v3}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/ModInfoBean;

    .line 3
    new-instance v2, Lcom/join/mgps/mod/bean/ModMeta;

    invoke-direct {v2}, Lcom/join/mgps/mod/bean/ModMeta;-><init>()V

    .line 4
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/join/mgps/mod/bean/ModMeta;->setPackageName(Ljava/lang/String;)V

    .line 5
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getResource_path()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/join/mgps/mod/bean/ModMeta;->setModPath(Ljava/lang/String;)V

    if-eqz v0, :cond_0

    .line 6
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/join/mgps/dto/ModInfoBean;->getVer()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/join/mgps/mod/bean/ModMeta;->setModVersion(Ljava/lang/String;)V

    .line 7
    invoke-virtual {v0}, Lcom/join/mgps/dto/ModInfoBean;->getVer()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/join/mgps/mod/bean/ModMeta;->setModCode(I)V

    .line 8
    :cond_0
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/join/mgps/mod/bean/ModMeta;->setGameId(Ljava/lang/String;)V

    .line 9
    invoke-virtual {v2, v1}, Lcom/join/mgps/mod/bean/ModMeta;->setModType(I)V

    .line 10
    sget-object v0, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-static {v0}, Lcom/join/android/app/common/utils/n;->n(Landroid/content/Context;)Lcom/join/android/app/common/utils/n;

    move-result-object v0

    sget-object v3, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {v0, v3}, Lcom/join/android/app/common/utils/n;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/join/mgps/mod/bean/ModMeta;->setAndroidId(Ljava/lang/String;)V

    const-string v0, "wufun"

    .line 11
    invoke-virtual {v2, v0}, Lcom/join/mgps/mod/bean/ModMeta;->setPlatform(Ljava/lang/String;)V

    .line 12
    invoke-virtual {v2, v0}, Lcom/join/mgps/mod/bean/ModMeta;->setPackage_type(Ljava/lang/String;)V

    .line 13
    invoke-static {p1}, Lcom/join/mgps/Util/UtilsMy;->a2(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/join/mgps/mod/bean/ModMeta;->setTypeId(Ljava/lang/String;)V

    .line 14
    :try_start_0
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getResource_path()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/join/mgps/va/overmind/d;->b0(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 16
    :goto_0
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v0

    invoke-virtual {v0, p0, v2, p1}, Lcom/join/mgps/va/overmind/d;->W(Landroid/content/Context;Lcom/join/mgps/mod/bean/ModMeta;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 17
    invoke-static {p1}, Lcom/join/android/app/common/utils/APKUtils;->G(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    const/4 v6, 0x1

    goto :goto_1

    .line 18
    :cond_1
    invoke-static {p1}, Lcom/join/android/app/common/utils/APKUtils;->L(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v1, 0x2

    const/4 v6, 0x2

    goto :goto_1

    :cond_2
    const/4 v6, 0x0

    .line 19
    :goto_1
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v3

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v4

    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->get_from()I

    move-result v7

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->get_from_type()I

    move-result v8

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getExt()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {v3 .. v9}, Lcom/papa/sim/statistic/p;->h1(Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;)V

    .line 20
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getModInfoBean()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 21
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getModInfoBean()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/dto/ModInfoBean;->getMain_game_id()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/join/mgps/Util/UtilsMy;->t4(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_2

    .line 22
    :cond_3
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/join/mgps/Util/UtilsMy;->t4(Landroid/content/Context;Ljava/lang/String;)V

    :goto_2
    return v2

    :cond_4
    return v1
.end method

.method private Q0(Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->h:Landroid/widget/TextView;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->j:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->h:Landroid/widget/TextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->j:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public static synthetic g0(Lcom/join/mgps/activity/MiniGameLoadingActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->C0()V

    return-void
.end method

.method public static synthetic h0(Lcom/join/mgps/activity/MiniGameLoadingActivity;Landroid/os/Handler;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->E0(Landroid/os/Handler;)V

    return-void
.end method

.method public static synthetic i0(Lcom/join/mgps/activity/MiniGameLoadingActivity;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Lkotlin/Unit;
    .locals 0

    invoke-direct {p0, p1}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->F0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j0(Lcom/join/mgps/activity/MiniGameLoadingActivity;Landroid/os/Handler;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->D0(Landroid/os/Handler;)V

    return-void
.end method

.method public static synthetic k0(Lcom/join/mgps/activity/MiniGameLoadingActivity;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->G0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic l0(Lcom/join/mgps/activity/MiniGameLoadingActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->J0()V

    return-void
.end method

.method static synthetic m0(Lcom/join/mgps/activity/MiniGameLoadingActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->A0()V

    return-void
.end method

.method static synthetic n0(Lcom/join/mgps/activity/MiniGameLoadingActivity;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->L0(Z)V

    return-void
.end method

.method static synthetic o0(Lcom/join/mgps/activity/MiniGameLoadingActivity;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->M0(Z)V

    return-void
.end method

.method static synthetic p0()Ljava/util/Map;
    .locals 1

    .line 1
    sget-object v0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->G:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic q0(Lcom/join/mgps/activity/MiniGameLoadingActivity;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->x:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic r0(Lcom/join/mgps/activity/MiniGameLoadingActivity;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->y:J

    return-wide v0
.end method

.method private receiveDelete(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->c:Ljava/lang/String;

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

    iget-object v1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->c:Ljava/lang/String;

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
    iget-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->c:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    iput-object p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->k:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    :cond_1
    return-void
.end method

.method private receiveSuccess(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->c:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->g:Landroid/widget/TextView;

    const-string v0, ""

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->i:Lcom/join/mgps/customview/PictureHProgress;

    const/16 v0, 0x64

    invoke-virtual {p1, v0}, Lcom/join/mgps/customview/PictureHProgress;->setProgress(I)V

    :cond_1
    return-void
.end method

.method static synthetic s0(Lcom/join/mgps/activity/MiniGameLoadingActivity;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->y:J

    return-wide p1
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
    iget-object v1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->b:Landroid/view/View;

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
    iget-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->b:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method static synthetic t0(Lcom/join/mgps/activity/MiniGameLoadingActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->w0()V

    return-void
.end method

.method static synthetic u0(Lcom/join/mgps/activity/MiniGameLoadingActivity;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->w:Z

    return p0
.end method

.method private updateProgressPartly()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->k:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v0, :cond_2

    .line 2
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->k:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    const/16 v1, 0xc

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->k:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_2

    .line 4
    iget-boolean v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->B:Z

    if-nez v0, :cond_2

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->c:Ljava/lang/String;

    iget-object v1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->k:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->i:Lcom/join/mgps/customview/PictureHProgress;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/PictureHProgress;->setProgress(I)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->g:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 8
    :cond_1
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->c:Ljava/lang/String;

    iget-object v1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->k:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 9
    invoke-static {}, Lcom/join/android/app/common/servcie/i;->e()Lcom/join/android/app/common/servcie/i;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->k:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/android/app/common/servcie/i;->f(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    .line 10
    iget-object v1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->i:Lcom/join/mgps/customview/PictureHProgress;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v2

    long-to-int v3, v2

    invoke-virtual {v1, v3}, Lcom/join/mgps/customview/PictureHProgress;->setProgress(I)V

    .line 11
    iget-object v1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->f:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u6e38\u620f\u52a0\u8f7d\u4e2d "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, "% \n\u4f53\u9a8c\u540e\u53ef\u5bf9\u6e38\u620f\u8fdb\u884c\u8bc4\u4ef7\u54e6"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
    iget-object v1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->g:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5f53\u524d\u7f51\u901f "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSpeed()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/s"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_2
    :goto_1
    return-void
.end method

.method static synthetic v0(Lcom/join/mgps/activity/MiniGameLoadingActivity;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->w:Z

    return p1
.end method

.method private w0()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/join/mgps/activity/MiniGameLoadingActivity$e;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/MiniGameLoadingActivity$e;-><init>(Lcom/join/mgps/activity/MiniGameLoadingActivity;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 2
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method


# virtual methods
.method I0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 1
    :cond_0
    invoke-static {p1}, Lcom/join/android/app/common/utils/APKUtils;->L(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v1

    const/4 v2, 0x1

    const/16 v3, 0x9

    if-eqz v1, :cond_3

    .line 2
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSingleGameModInfoBean()Lcom/join/mgps/dto/SingleGameModInfoBean;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/dto/SingleGameModInfoBean;->getDownUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 4
    :cond_1
    invoke-virtual {p1}, Lcom/join/mgps/dto/SingleGameModInfoBean;->getStatus()I

    move-result p1

    if-ne p1, v3, :cond_2

    const/4 v0, 0x1

    :cond_2
    :goto_0
    return v0

    .line 5
    :cond_3
    invoke-static {p1}, Lcom/join/android/app/common/utils/APKUtils;->G(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 6
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getModInfoBean()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 7
    invoke-virtual {p1}, Lcom/join/mgps/dto/ModInfoBean;->getDown_url()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_1

    .line 8
    :cond_4
    invoke-virtual {p1}, Lcom/join/mgps/dto/ModInfoBean;->getStatus()I

    move-result p1

    if-ne p1, v3, :cond_5

    const/4 v0, 0x1

    :cond_5
    :goto_1
    return v0
.end method

.method K0()V
    .locals 2

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MiniGameLoadingActivity$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MiniGameLoadingActivity$a;-><init>(Lcom/join/mgps/activity/MiniGameLoadingActivity;)V

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->z:Ljava/util/concurrent/Executor;

    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method N0()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->B:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->C:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->L0(Z)V

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->A:Lcom/join/mgps/activity/MiniGameLoadingActivity$g;

    if-eqz v1, :cond_0

    const/4 v2, 0x0

    .line 4
    invoke-virtual {v1, v2}, Lcom/join/mgps/activity/MiniGameLoadingActivity$g;->a(Z)V

    const/4 v1, 0x0

    .line 5
    iput-object v1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->A:Lcom/join/mgps/activity/MiniGameLoadingActivity$g;

    .line 6
    :cond_0
    new-instance v1, Lcom/join/mgps/activity/MiniGameLoadingActivity$g;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/MiniGameLoadingActivity$g;-><init>(Lcom/join/mgps/activity/MiniGameLoadingActivity;)V

    iput-object v1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->A:Lcom/join/mgps/activity/MiniGameLoadingActivity$g;

    .line 7
    invoke-virtual {v1, v0}, Lcom/join/mgps/activity/MiniGameLoadingActivity$g;->a(Z)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->A:Lcom/join/mgps/activity/MiniGameLoadingActivity$g;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 9
    :cond_1
    new-instance v0, Lcom/join/mgps/activity/MiniGameLoadingActivity$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MiniGameLoadingActivity$b;-><init>(Lcom/join/mgps/activity/MiniGameLoadingActivity;)V

    .line 10
    iget-object v1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->z:Ljava/util/concurrent/Executor;

    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method O0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->initPreDownloadFactory()V

    const-string v0, ""

    .line 2
    invoke-static {p1}, Lcom/join/android/app/common/utils/APKUtils;->L(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSingleGameModInfoBean()Lcom/join/mgps/dto/SingleGameModInfoBean;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 4
    invoke-virtual {v2}, Lcom/join/mgps/dto/SingleGameModInfoBean;->getDownUrl()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getModInfoBean()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 6
    invoke-virtual {v2}, Lcom/join/mgps/dto/ModInfoBean;->getDown_url()Ljava/lang/String;

    move-result-object v0

    :cond_1
    :goto_0
    move-object v3, v0

    .line 7
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getShowName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", mod url null error, vm="

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 9
    invoke-virtual {p0}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->N0()V

    return-void

    .line 10
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v3}, Lcom/join/mgps/Util/x0;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".mod"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/join/mgps/Util/v;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "mod/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "/"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 12
    new-instance p1, Lcom/github/snowdream/android/app/downloader/c;

    const-wide/16 v6, 0x0

    move-object v2, p1

    invoke-direct/range {v2 .. v7}, Lcom/github/snowdream/android/app/downloader/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 13
    sget-object v0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->E:Lcom/github/snowdream/android/app/downloader/b;

    invoke-virtual {v0, p1}, Lcom/github/snowdream/android/app/downloader/b;->b(Lcom/github/snowdream/android/app/downloader/c;)Ljava/lang/String;

    .line 14
    sget-object v0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->G:Ljava/util/Map;

    if-nez v0, :cond_3

    return-void

    .line 15
    :cond_3
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/c;->l()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/c;->l()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_1

    .line 16
    :cond_4
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/c;->l()Ljava/lang/String;

    move-result-object v0

    .line 17
    sget-object v1, Lcom/join/mgps/activity/MiniGameLoadingActivity;->G:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/c;->l()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_5

    return-void

    .line 18
    :cond_5
    sget-object v1, Lcom/join/mgps/activity/MiniGameLoadingActivity;->G:Ljava/util/Map;

    monitor-enter v1

    .line 19
    :try_start_0
    sget-object v2, Lcom/join/mgps/activity/MiniGameLoadingActivity;->G:Ljava/util/Map;

    invoke-interface {v2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    monitor-exit v1

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_6
    :goto_1
    return-void
.end method

.method R0(I)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->i:Lcom/join/mgps/customview/PictureHProgress;

    invoke-virtual {v0, p1}, Lcom/join/mgps/customview/PictureHProgress;->setProgress(I)V

    return-void
.end method

.method afterViews()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/d0;->d(Ljava/lang/Object;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->setStatusBar()V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->c:Ljava/lang/String;

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
    invoke-direct {p0}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->B0()V

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

    return-void
.end method

.method public initPreDownloadFactory()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/github/snowdream/android/app/downloader/b;->e()Lcom/github/snowdream/android/app/downloader/b;

    move-result-object v0

    sput-object v0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->E:Lcom/github/snowdream/android/app/downloader/b;

    .line 2
    new-instance v0, Lcom/join/mgps/activity/MiniGameLoadingActivity$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MiniGameLoadingActivity$c;-><init>(Lcom/join/mgps/activity/MiniGameLoadingActivity;)V

    sput-object v0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->F:Lcom/github/snowdream/android/app/downloader/b$b;

    .line 3
    sget-object v1, Lcom/join/mgps/activity/MiniGameLoadingActivity;->E:Lcom/github/snowdream/android/app/downloader/b;

    invoke-virtual {v1, v0}, Lcom/github/snowdream/android/app/downloader/b;->m(Lcom/github/snowdream/android/app/downloader/b$b;)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lorg/greenrobot/eventbus/c;->y(Ljava/lang/Object;)V

    .line 2
    invoke-super {p0}, Lcom/BaseActivity;->onDestroy()V

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->v:Z

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->r:Lcom/join/mgps/activity/MiniGameLoadingActivity$f;

    if-eqz v1, :cond_0

    .line 5
    invoke-virtual {p0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 6
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->A:Lcom/join/mgps/activity/MiniGameLoadingActivity$g;

    if-eqz v1, :cond_1

    .line 7
    invoke-virtual {v1, v0}, Lcom/join/mgps/activity/MiniGameLoadingActivity$g;->a(Z)V

    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->A:Lcom/join/mgps/activity/MiniGameLoadingActivity$g;

    :cond_1
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

    if-eq p1, v2, :cond_6

    const/4 v3, 0x3

    if-eq p1, v3, :cond_5

    const/4 v2, 0x5

    if-eq p1, v2, :cond_4

    const/4 v1, 0x6

    if-eq p1, v1, :cond_3

    const/4 v1, 0x7

    if-eq p1, v1, :cond_2

    const/16 v3, 0x8

    if-eq p1, v3, :cond_1

    const/16 v4, 0x30

    if-eq p1, v4, :cond_0

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/16 p1, 0x9

    .line 3
    invoke-virtual {p0, v0, p1}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->updateUI(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 4
    :pswitch_1
    invoke-virtual {p0, v0, v3}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->updateUI(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 5
    :pswitch_2
    invoke-virtual {p0, v0, v2}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->updateUI(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    .line 6
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto :goto_0

    .line 7
    :pswitch_3
    invoke-virtual {p0, v0, v1}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->updateUI(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_7

    .line 8
    iget-object p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->c:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 9
    iget-object p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->f:Landroid/widget/TextView;

    const-string v0, "\u6e38\u620f\u5b89\u88c5\u4e2d...\n\u4f53\u9a8c\u540e\u53ef\u5bf9\u6e38\u620f\u8fdb\u884c\u8bc4\u4ef7\u54e6"

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    iget-object p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->g:Landroid/widget/TextView;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 11
    iget-object p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->i:Lcom/join/mgps/customview/PictureHProgress;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 12
    iget-object p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->h:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 13
    :cond_1
    invoke-direct {p0}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->updateProgressPartly()V

    goto :goto_0

    .line 14
    :cond_2
    invoke-virtual {p0, v0, v3}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->updateUI(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 15
    :cond_3
    invoke-virtual {p0, v0, v1}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->updateUI(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 16
    :cond_4
    invoke-virtual {p0, v0, v2}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->updateUI(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    .line 17
    iput-boolean v1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->C:Z

    .line 18
    invoke-direct {p0}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->H0()V

    goto :goto_0

    .line 19
    :cond_5
    invoke-virtual {p0, v0, v2}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->updateUI(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 20
    :cond_6
    invoke-virtual {p0, v0, v1}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->updateUI(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    :cond_7
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_3
        :pswitch_2
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
    invoke-direct {p0}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->B0()V

    return-void
.end method

.method showToast(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/p1;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/p1;-><init>(Lcom/join/mgps/activity/MiniGameLoadingActivity;Ljava/lang/String;)V

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
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->receiveError(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 2
    :pswitch_2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->receiveSuccess(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 3
    :pswitch_3
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->receiveDelete(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 4
    :pswitch_4
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->receiveStart(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

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

.method x0()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
        value = {
            0x7f0915a6
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->k:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v0, :cond_0

    .line 2
    invoke-static {v0}, Lcom/php25/PDownload/d;->i(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method y0(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "\u6e38\u620f\u4fe1\u606f[ID]\u7f3a\u5931"

    .line 2
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->showToast(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    .line 4
    :cond_0
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->k:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 5
    iget-object p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->x:Ljava/lang/String;

    invoke-static {p1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->k:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz p1, :cond_1

    .line 6
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getResource_path()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->k:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getResource_path()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/h0;->x(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    iget-object p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->k:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->I0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 7
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->k:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->O0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void

    .line 8
    :cond_3
    invoke-virtual {p0}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->N0()V

    return-void
.end method

.method declared-synchronized z0()V
    .locals 4

    monitor-enter p0

    const/4 v0, 0x1

    .line 1
    :try_start_0
    iget-object v1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->t:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 2
    iget-object v3, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->u:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    :cond_1
    if-eqz v0, :cond_2

    .line 3
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 4
    new-instance v1, Lcom/join/mgps/activity/n1;

    invoke-direct {v1, p0, v0}, Lcom/join/mgps/activity/n1;-><init>(Lcom/join/mgps/activity/MiniGameLoadingActivity;Landroid/os/Handler;)V

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    :cond_2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    goto :goto_1

    :goto_0
    throw v0

    :goto_1
    goto :goto_0
.end method
