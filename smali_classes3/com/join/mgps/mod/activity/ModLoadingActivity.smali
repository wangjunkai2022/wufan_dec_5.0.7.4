.class public Lcom/join/mgps/mod/activity/ModLoadingActivity;
.super Landroidx/activity/ComponentActivity;
.source "ModLoadingActivity.java"

# interfaces
.implements Landroid/view/View$OnSystemUiVisibilityChangeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/mod/activity/ModLoadingActivity$h;,
        Lcom/join/mgps/mod/activity/ModLoadingActivity$g;
    }
.end annotation


# static fields
.field public static final B:Ljava/lang/String; = "_mod_info"

.field private static C:Lcom/github/snowdream/android/app/downloader/b; = null

.field static D:Lcom/github/snowdream/android/app/downloader/b$b; = null

.field private static E:Ljava/util/Map; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/github/snowdream/android/app/downloader/c;",
            ">;"
        }
    .end annotation
.end field

.field public static F:I = 0x0

.field public static final G:I = 0x2


# instance fields
.field private A:Landroid/content/BroadcastReceiver;

.field b:Ljava/lang/String;

.field c:Ljava/lang/String;

.field d:Ljava/lang/String;

.field e:Ljava/lang/String;

.field f:I

.field g:I

.field h:I

.field i:Ljava/lang/String;

.field j:Lcom/join/mgps/mod/activity/ModLoadingActivity$g;

.field k:Z

.field l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field n:Z

.field private o:Lcom/github/snowdream/android/app/downloader/DownloadTask;

.field private p:Landroid/widget/LinearLayout;

.field private q:Landroid/widget/ProgressBar;

.field private r:Landroid/widget/TextView;

.field private s:Landroid/widget/TextView;

.field private t:Z

.field private u:Ljava/lang/String;

.field private v:J

.field private w:Landroid/widget/ImageView;

.field private x:Landroid/widget/TextView;

.field private y:Ljava/util/concurrent/Executor;

.field z:Landroid/graphics/drawable/AnimationDrawable;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(I)V

    sput-object v0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->E:Ljava/util/Map;

    .line 2
    sput v1, Lcom/join/mgps/mod/activity/ModLoadingActivity;->F:I

    return-void
.end method

.method public constructor <init>()V
    .locals 9

    .line 1
    invoke-direct {p0}, Landroidx/activity/ComponentActivity;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->k:Z

    .line 3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->l:Ljava/util/List;

    .line 4
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->m:Ljava/util/List;

    .line 5
    iput-boolean v0, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->n:Z

    .line 6
    iput-boolean v0, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->t:Z

    const-string v0, ""

    .line 7
    iput-object v0, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->u:Ljava/lang/String;

    const-wide/16 v0, 0x0

    .line 8
    iput-wide v0, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->v:J

    .line 9
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v8, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v8}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    const/4 v3, 0x1

    const/4 v4, 0x2

    const-wide/16 v5, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    iput-object v0, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->y:Ljava/util/concurrent/Executor;

    return-void
.end method

.method private declared-synchronized A0()V
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/join/mgps/mod/activity/ModLoadingActivity$e;

    invoke-direct {v1, p0}, Lcom/join/mgps/mod/activity/ModLoadingActivity$e;-><init>(Lcom/join/mgps/mod/activity/ModLoadingActivity;)V

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

    const-string v1, "gameId"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->b:Ljava/lang/String;

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "packageName"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->c:Ljava/lang/String;

    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "modPath"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->d:Ljava/lang/String;

    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "modVersion"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->e:Ljava/lang/String;

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "modCode"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->f:I

    .line 6
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "modType"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->g:I

    .line 7
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string/jumbo v1, "userId"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->h:I

    .line 8
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string/jumbo v1, "typeId"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->i:Ljava/lang/String;

    .line 9
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "_mod_info"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->u:Ljava/lang/String;

    .line 10
    iget-object v0, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 11
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    .line 12
    :cond_0
    sget-object v0, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {v0}, Lcom/MApplication;->l()Lcom/join/mgps/pref/PrefDef_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->lastLaunchModGameId()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    const v0, 0x7f090ce9

    .line 13
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->p:Landroid/widget/LinearLayout;

    const v0, 0x7f090fec

    .line 14
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->q:Landroid/widget/ProgressBar;

    const v0, 0x7f091660

    .line 15
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->r:Landroid/widget/TextView;

    const v0, 0x7f091661

    .line 16
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->s:Landroid/widget/TextView;

    const v0, 0x7f091619

    .line 17
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->x:Landroid/widget/TextView;

    const v0, 0x7f090946

    .line 18
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->w:Landroid/widget/ImageView;

    .line 19
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    iput-object v0, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->z:Landroid/graphics/drawable/AnimationDrawable;

    .line 20
    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 21
    new-instance v0, Lcom/join/mgps/mod/activity/ModLoadingActivity$g;

    invoke-direct {v0, p0}, Lcom/join/mgps/mod/activity/ModLoadingActivity$g;-><init>(Lcom/join/mgps/mod/activity/ModLoadingActivity;)V

    iput-object v0, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->j:Lcom/join/mgps/mod/activity/ModLoadingActivity$g;

    .line 22
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "com.join.android.app.mgsim.wufun.soCopyStart"

    .line 23
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "com.join.android.app.mgsim.wufun.soCopyFinish"

    .line 24
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "com.join.android.app.mgsim.wufun.soCopyFail"

    .line 25
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "com.join.android.app.mgsim.wufun.loadMod"

    .line 26
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 27
    iget-object v1, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->j:Lcom/join/mgps/mod/activity/ModLoadingActivity$g;

    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 28
    iget-object v0, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->b:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/join/mgps/mod/activity/ModLoadingActivity;->y0(Ljava/lang/String;)V

    .line 29
    invoke-virtual {p0}, Lcom/join/mgps/mod/activity/ModLoadingActivity;->J0()V

    const/16 v0, 0xc

    .line 30
    iget-object v1, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->b:Ljava/lang/String;

    invoke-static {p0, v0, v1}, Lcom/join/mgps/Util/UtilsMy;->T1(Landroid/content/Context;ILjava/lang/String;)V

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

    iget-object v1, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/va/overmind/d;->N(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    new-array v1, v0, [Ljava/lang/String;

    .line 2
    sget-object v2, Lcom/join/mgps/va/overmind/f;->a:Lcom/join/mgps/va/overmind/f;

    iget-object v3, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->c:Ljava/lang/String;

    .line 3
    invoke-virtual {v2, v3}, Lcom/join/mgps/va/overmind/f;->M(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v1, v4

    iget-object v3, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->c:Ljava/lang/String;

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
    new-instance v0, Lcom/join/mgps/mod/activity/a;

    invoke-direct {v0, p0}, Lcom/join/mgps/mod/activity/a;-><init>(Lcom/join/mgps/mod/activity/ModLoadingActivity;)V

    const-wide/16 v1, 0x1388

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private synthetic E0(Landroid/os/Handler;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->n:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->n:Z

    .line 3
    iget-object v1, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->p:Landroid/widget/LinearLayout;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    iget-object v1, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->x:Landroid/widget/TextView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 5
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v1

    iget v2, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->h:I

    iget-object v3, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->c:Ljava/lang/String;

    invoke-virtual {v1, p0, v2, v3}, Lcom/join/mgps/va/overmind/d;->U(Landroid/content/Context;ILjava/lang/String;)V

    .line 6
    sget-object v1, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {v1, v0}, Lcom/MApplication;->G(Z)V

    .line 7
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/join/mgps/mod/activity/c;

    invoke-direct {v1, p0, p1}, Lcom/join/mgps/mod/activity/c;-><init>(Lcom/join/mgps/mod/activity/ModLoadingActivity;Landroid/os/Handler;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 8
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    :cond_1
    :goto_0
    return-void
.end method

.method private synthetic F0(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method

.method private I0()V
    .locals 12

    .line 1
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getMindPackageManager()Lcom/xinzhu/overmind/client/frameworks/g;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/xinzhu/overmind/client/frameworks/g;->k(Ljava/lang/String;)Lcom/xinzhu/overmind/server/pm/MindPackageSettings;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getMindPackageManager()Lcom/xinzhu/overmind/client/frameworks/g;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->c:Ljava/lang/String;

    iget v3, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->h:I

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
    iget-object v6, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->d:Ljava/lang/String;

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v6

    goto :goto_0

    :cond_2
    iget-object v6, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->d:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->c:Ljava/lang/String;

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

    iget-object v1, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v10}, Lcom/join/mgps/va/overmind/d;->i0(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_8

    .line 26
    :cond_e
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v0

    iget-object v2, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->c:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/join/mgps/va/overmind/d;->N(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_f

    iget-object v0, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->c:Ljava/lang/String;

    invoke-static {v0}, Lcom/xinzhu/overmind/a;->g(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    goto :goto_7

    :cond_f
    iget-object v0, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->c:Ljava/lang/String;

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

    iget-object v1, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v10}, Lcom/join/mgps/va/overmind/d;->i0(Ljava/lang/String;Ljava/lang/String;)V

    :cond_11
    :goto_8
    return-void
.end method

.method public static synthetic e0(Lcom/join/mgps/mod/activity/ModLoadingActivity;Landroid/os/Handler;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/join/mgps/mod/activity/ModLoadingActivity;->E0(Landroid/os/Handler;)V

    return-void
.end method

.method public static synthetic f0(Lcom/join/mgps/mod/activity/ModLoadingActivity;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/join/mgps/mod/activity/ModLoadingActivity;->F0(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic g0(Lcom/join/mgps/mod/activity/ModLoadingActivity;Landroid/os/Handler;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/join/mgps/mod/activity/ModLoadingActivity;->D0(Landroid/os/Handler;)V

    return-void
.end method

.method public static synthetic h0(Lcom/join/mgps/mod/activity/ModLoadingActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/join/mgps/mod/activity/ModLoadingActivity;->C0()V

    return-void
.end method

.method static synthetic i0(Lcom/join/mgps/mod/activity/ModLoadingActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/mod/activity/ModLoadingActivity;->I0()V

    return-void
.end method

.method static synthetic j0(Lcom/join/mgps/mod/activity/ModLoadingActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/mod/activity/ModLoadingActivity;->A0()V

    return-void
.end method

.method static synthetic k0(Lcom/join/mgps/mod/activity/ModLoadingActivity;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->v:J

    return-wide v0
.end method

.method static synthetic l0(Lcom/join/mgps/mod/activity/ModLoadingActivity;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->v:J

    return-wide p1
.end method

.method static synthetic m0(Lcom/join/mgps/mod/activity/ModLoadingActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/mod/activity/ModLoadingActivity;->x0()V

    return-void
.end method

.method static synthetic n0(Lcom/join/mgps/mod/activity/ModLoadingActivity;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->t:Z

    return p0
.end method

.method static synthetic o0(Lcom/join/mgps/mod/activity/ModLoadingActivity;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->t:Z

    return p1
.end method

.method static synthetic p0(Lcom/join/mgps/mod/activity/ModLoadingActivity;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->x:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic q0(Lcom/join/mgps/mod/activity/ModLoadingActivity;)Landroid/widget/LinearLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->p:Landroid/widget/LinearLayout;

    return-object p0
.end method

.method static synthetic r0()Ljava/util/Map;
    .locals 1

    .line 1
    sget-object v0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->E:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic s0(Lcom/join/mgps/mod/activity/ModLoadingActivity;)Landroid/widget/ProgressBar;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->q:Landroid/widget/ProgressBar;

    return-object p0
.end method

.method static synthetic t0(Lcom/join/mgps/mod/activity/ModLoadingActivity;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->r:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic u0(Lcom/join/mgps/mod/activity/ModLoadingActivity;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->s:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic v0(Lcom/join/mgps/mod/activity/ModLoadingActivity;)Lcom/github/snowdream/android/app/downloader/DownloadTask;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->o:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    return-object p0
.end method

.method static synthetic w0(Lcom/join/mgps/mod/activity/ModLoadingActivity;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->u:Ljava/lang/String;

    return-object p0
.end method

.method private x0()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/join/mgps/mod/activity/ModLoadingActivity$f;

    invoke-direct {v1, p0}, Lcom/join/mgps/mod/activity/ModLoadingActivity$f;-><init>(Lcom/join/mgps/mod/activity/ModLoadingActivity;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 2
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method


# virtual methods
.method G0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z
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

.method H0()Z
    .locals 6

    const/4 v0, 0x0

    .line 1
    :try_start_0
    sget-object v1, Lcom/xinzhu/overmind/shared/f;->a:Lcom/xinzhu/overmind/shared/f;

    invoke-virtual {v1}, Lcom/xinzhu/overmind/shared/f;->m()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {v1}, Lcom/xinzhu/overmind/shared/f;->p()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 3
    :goto_0
    iget-object v1, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->c:Ljava/lang/String;

    invoke-static {v1}, Lcom/xinzhu/overmind/a;->j(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    .line 4
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Ljava/io/File;->length()J

    move-result-wide v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-wide/32 v3, 0x12c00000

    cmp-long v5, v1, v3

    if-lez v5, :cond_2

    const/4 v0, 0x1

    :cond_1
    return v0

    :catch_0
    move-exception v1

    .line 5
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_2
    return v0
.end method

.method J0()V
    .locals 2

    .line 1
    new-instance v0, Lcom/join/mgps/mod/activity/ModLoadingActivity$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/mod/activity/ModLoadingActivity$a;-><init>(Lcom/join/mgps/mod/activity/ModLoadingActivity;)V

    .line 2
    iget-object v1, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->y:Ljava/util/concurrent/Executor;

    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method K0()V
    .locals 4

    .line 1
    :try_start_0
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/va/overmind/d;->N(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/mod/activity/ModLoadingActivity;->H0()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/xinzhu/overmind/shared/OMProxyActivity;->e:Lcom/xinzhu/overmind/shared/OMProxyActivity$a;

    invoke-virtual {v1}, Lcom/xinzhu/overmind/shared/OMProxyActivity$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 4
    new-instance v1, Landroid/content/ComponentName;

    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getPluginPkg()Ljava/lang/String;

    move-result-object v2

    const-class v3, Lcom/xinzhu/overmind/shared/OMProxyActivity;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 6
    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 8
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lcom/join/mgps/mod/activity/ModLoadingActivity;->L0()V

    return-void
.end method

.method L0()V
    .locals 2

    .line 1
    new-instance v0, Lcom/join/mgps/mod/activity/ModLoadingActivity$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/mod/activity/ModLoadingActivity$b;-><init>(Lcom/join/mgps/mod/activity/ModLoadingActivity;)V

    .line 2
    iget-object v1, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->y:Ljava/util/concurrent/Executor;

    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method M0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/mod/activity/ModLoadingActivity;->initPreDownloadFactory()V

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
    invoke-virtual {p0}, Lcom/join/mgps/mod/activity/ModLoadingActivity;->K0()V

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
    sget-object v0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->C:Lcom/github/snowdream/android/app/downloader/b;

    invoke-virtual {v0, p1}, Lcom/github/snowdream/android/app/downloader/b;->b(Lcom/github/snowdream/android/app/downloader/c;)Ljava/lang/String;

    .line 14
    sget-object v0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->E:Ljava/util/Map;

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
    sget-object v1, Lcom/join/mgps/mod/activity/ModLoadingActivity;->E:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/c;->l()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_5

    return-void

    .line 18
    :cond_5
    sget-object v1, Lcom/join/mgps/mod/activity/ModLoadingActivity;->E:Ljava/util/Map;

    monitor-enter v1

    .line 19
    :try_start_0
    sget-object v2, Lcom/join/mgps/mod/activity/ModLoadingActivity;->E:Ljava/util/Map;

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

.method hideNavigationBar()V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/mod/activity/ModLoadingActivity;->setSystemUiVisibility()V

    :cond_0
    return-void
.end method

.method public initPreDownloadFactory()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/github/snowdream/android/app/downloader/b;->e()Lcom/github/snowdream/android/app/downloader/b;

    move-result-object v0

    sput-object v0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->C:Lcom/github/snowdream/android/app/downloader/b;

    .line 2
    new-instance v0, Lcom/join/mgps/mod/activity/ModLoadingActivity$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/mod/activity/ModLoadingActivity$c;-><init>(Lcom/join/mgps/mod/activity/ModLoadingActivity;)V

    sput-object v0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->D:Lcom/github/snowdream/android/app/downloader/b$b;

    .line 3
    sget-object v1, Lcom/join/mgps/mod/activity/ModLoadingActivity;->C:Lcom/github/snowdream/android/app/downloader/b;

    invoke-virtual {v1, v0}, Lcom/github/snowdream/android/app/downloader/b;->m(Lcom/github/snowdream/android/app/downloader/b$b;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c0076

    .line 2
    invoke-virtual {p0, p1}, Landroidx/activity/ComponentActivity;->setContentView(I)V

    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnSystemUiVisibilityChangeListener(Landroid/view/View$OnSystemUiVisibilityChangeListener;)V

    .line 4
    invoke-direct {p0}, Lcom/join/mgps/mod/activity/ModLoadingActivity;->B0()V

    .line 5
    new-instance p1, Lcom/join/mgps/mod/activity/ModLoadingActivity$h;

    invoke-direct {p1, p0}, Lcom/join/mgps/mod/activity/ModLoadingActivity$h;-><init>(Lcom/join/mgps/mod/activity/ModLoadingActivity;)V

    iput-object p1, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->A:Landroid/content/BroadcastReceiver;

    .line 6
    new-instance v0, Landroid/content/IntentFilter;

    sget-object v1, Lcom/xinzhu/overmind/shared/OMProxyActivity;->e:Lcom/xinzhu/overmind/shared/OMProxyActivity$a;

    invoke-virtual {v1}, Lcom/xinzhu/overmind/shared/OMProxyActivity$a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->n:Z

    .line 3
    iget-object v0, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->A:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {p0, v0}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->j:Lcom/join/mgps/mod/activity/ModLoadingActivity$g;

    if-eqz v0, :cond_1

    .line 6
    invoke-virtual {p0, v0}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->z:Landroid/graphics/drawable/AnimationDrawable;

    if-eqz v0, :cond_2

    .line 8
    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    :cond_2
    return-void
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 2
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 3
    invoke-direct {p0}, Lcom/join/mgps/mod/activity/ModLoadingActivity;->B0()V

    return-void
.end method

.method protected onResume()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/mod/activity/ModLoadingActivity;->hideNavigationBar()V

    return-void
.end method

.method public onSystemUiVisibilityChange(I)V
    .locals 0

    if-nez p1, :cond_0

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/mod/activity/ModLoadingActivity;->hideNavigationBar()V

    :cond_0
    return-void
.end method

.method setSystemUiVisibility()V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    const/16 v0, 0x1706

    goto :goto_0

    :cond_0
    const/16 v0, 0x707

    .line 2
    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    return-void
.end method

.method showToast(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/mod/activity/d;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/mod/activity/d;-><init>(Lcom/join/mgps/mod/activity/ModLoadingActivity;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method y0(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string/jumbo p1, "\u6e38\u620f\u4fe1\u606f[ID]\u7f3a\u5931"

    .line 2
    invoke-virtual {p0, p1}, Lcom/join/mgps/mod/activity/ModLoadingActivity;->showToast(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    .line 4
    :cond_0
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->o:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 5
    iget-object p1, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->u:Ljava/lang/String;

    invoke-static {p1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->o:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz p1, :cond_1

    .line 6
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getResource_path()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->o:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getResource_path()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/h0;->x(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    iget-object p1, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->o:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p0, p1}, Lcom/join/mgps/mod/activity/ModLoadingActivity;->G0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 7
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->o:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p0, p1}, Lcom/join/mgps/mod/activity/ModLoadingActivity;->M0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void

    .line 8
    :cond_3
    invoke-virtual {p0}, Lcom/join/mgps/mod/activity/ModLoadingActivity;->K0()V

    return-void
.end method

.method declared-synchronized z0()V
    .locals 4

    monitor-enter p0

    const/4 v0, 0x1

    .line 1
    :try_start_0
    iget-object v1, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->l:Ljava/util/List;

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
    iget-object v3, p0, Lcom/join/mgps/mod/activity/ModLoadingActivity;->m:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    :cond_1
    if-eqz v0, :cond_2

    .line 3
    new-instance v0, Lcom/join/mgps/mod/activity/ModLoadingActivity$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/mod/activity/ModLoadingActivity$d;-><init>(Lcom/join/mgps/mod/activity/ModLoadingActivity;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 4
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 5
    new-instance v1, Lcom/join/mgps/mod/activity/b;

    invoke-direct {v1, p0, v0}, Lcom/join/mgps/mod/activity/b;-><init>(Lcom/join/mgps/mod/activity/ModLoadingActivity;Landroid/os/Handler;)V

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
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
