.class public final Lcom/join/mgps/activity/ModGameIndexActivity_;
.super Lcom/join/mgps/activity/ModGameIndexActivity;
.source "ModGameIndexActivity_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/ModGameIndexActivity_$d0;
    }
.end annotation


# static fields
.field public static final c2:Ljava/lang/String; = "gameId"

.field public static final d2:Ljava/lang/String; = "standGameId"

.field public static final e2:Ljava/lang/String; = "from"


# instance fields
.field private final Y1:La4/c;

.field private final Z1:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final a2:Landroid/content/IntentFilter;

.field private final b2:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity_;->Y1:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity_;->Z1:Ljava/util/Map;

    .line 4
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity_;->a2:Landroid/content/IntentFilter;

    .line 5
    new-instance v0, Lcom/join/mgps/activity/ModGameIndexActivity_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ModGameIndexActivity_$k;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity_;)V

    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity_;->b2:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic W1(Lcom/join/mgps/activity/ModGameIndexActivity_;ZLcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/ModGameIndexActivity;->Z0(ZLcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method

.method static synthetic X1(Lcom/join/mgps/activity/ModGameIndexActivity_;Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->T1(Z)V

    return-void
.end method

.method static synthetic Y1(Lcom/join/mgps/activity/ModGameIndexActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->t1()V

    return-void
.end method

.method static synthetic Z1(Lcom/join/mgps/activity/ModGameIndexActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->a1()V

    return-void
.end method

.method static synthetic a2(Lcom/join/mgps/activity/ModGameIndexActivity_;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->X0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method

.method static synthetic b2(Lcom/join/mgps/activity/ModGameIndexActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->getDetialData()V

    return-void
.end method

.method static synthetic c2(Lcom/join/mgps/activity/ModGameIndexActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->e1()V

    return-void
.end method

.method static synthetic d2(Lcom/join/mgps/activity/ModGameIndexActivity_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->c1(Ljava/util/List;)V

    return-void
.end method

.method static synthetic e2(Lcom/join/mgps/activity/ModGameIndexActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->T0()V

    return-void
.end method

.method static synthetic f2(Lcom/join/mgps/activity/ModGameIndexActivity_;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->Y0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method

.method static synthetic g2(Lcom/join/mgps/activity/ModGameIndexActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->H1()V

    return-void
.end method

.method static synthetic h2(Lcom/join/mgps/activity/ModGameIndexActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->g1()V

    return-void
.end method

.method static synthetic i2(Lcom/join/mgps/activity/ModGameIndexActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->showLodingFailed()V

    return-void
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    new-instance p1, Lcom/join/mgps/pref/PrefDef_;

    invoke-direct {p1, p0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->V:Lcom/join/mgps/pref/PrefDef_;

    .line 2
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/16 v0, 0x400

    invoke-virtual {p1, v0, v0}, Landroid/view/Window;->setFlags(II)V

    .line 4
    invoke-direct {p0}, Lcom/join/mgps/activity/ModGameIndexActivity_;->injectExtras_()V

    const/4 p1, 0x1

    .line 5
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->supportRequestWindowFeature(I)Z

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity_;->a2:Landroid/content/IntentFilter;

    const-string v0, "com.wufun.game.start.std.game"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 7
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity_;->b2:Landroid/content/BroadcastReceiver;

    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity_;->a2:Landroid/content/IntentFilter;

    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method private injectExtras_()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v1, "gameId"

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->I:Ljava/lang/String;

    :cond_0
    const-string v1, "standGameId"

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->J:Ljava/lang/String;

    :cond_1
    const-string v1, "from"

    .line 6
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 7
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->K:Ljava/lang/String;

    :cond_2
    return-void
.end method

.method static synthetic j2(Lcom/join/mgps/activity/ModGameIndexActivity_;Lcom/join/mgps/dto/ModGameDetailBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->V1(Lcom/join/mgps/dto/ModGameDetailBean;)V

    return-void
.end method

.method static synthetic k2(Lcom/join/mgps/activity/ModGameIndexActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->showLoding()V

    return-void
.end method

.method static synthetic l2(Lcom/join/mgps/activity/ModGameIndexActivity_;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->G1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method

.method static synthetic m2(Lcom/join/mgps/activity/ModGameIndexActivity_;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->F1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method

.method static synthetic n2(Lcom/join/mgps/activity/ModGameIndexActivity_;Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/dto/GamedetialModleFourBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/ModGameIndexActivity;->Q1(Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/dto/GamedetialModleFourBean;)V

    return-void
.end method

.method public static o2(Landroid/content/Context;)Lcom/join/mgps/activity/ModGameIndexActivity_$d0;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ModGameIndexActivity_$d0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ModGameIndexActivity_$d0;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static p2(Landroidx/fragment/app/Fragment;)Lcom/join/mgps/activity/ModGameIndexActivity_$d0;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ModGameIndexActivity_$d0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ModGameIndexActivity_$d0;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
.end method


# virtual methods
.method F1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ModGameIndexActivity_$l;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity_$l;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity_;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method G1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ModGameIndexActivity_$j;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity_$j;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity_;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method H1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ModGameIndexActivity_$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ModGameIndexActivity_$e;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method Q1(Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/dto/GamedetialModleFourBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ModGameIndexActivity_$m;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/activity/ModGameIndexActivity_$m;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity_;Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/dto/GamedetialModleFourBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method T0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/ModGameIndexActivity_$t;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/ModGameIndexActivity_$t;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method T1(Z)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ModGameIndexActivity_$n;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity_$n;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity_;Z)V

    const-string p1, ""

    const-wide/16 v1, 0x3e8

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method V1(Lcom/join/mgps/dto/ModGameDetailBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ModGameIndexActivity_$h;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity_$h;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity_;Lcom/join/mgps/dto/ModGameDetailBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method X0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/ModGameIndexActivity_$p;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/ModGameIndexActivity_$p;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity_;Ljava/lang/String;JLjava/lang/String;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method Y0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/ModGameIndexActivity_$u;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/ModGameIndexActivity_$u;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity_;Ljava/lang/String;JLjava/lang/String;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method Z0(ZLcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ModGameIndexActivity_$c;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/activity/ModGameIndexActivity_$c;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity_;ZLcom/github/snowdream/android/app/downloader/DownloadTask;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method a1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ModGameIndexActivity_$o;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ModGameIndexActivity_$o;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method c1(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v7, Lcom/join/mgps/activity/ModGameIndexActivity_$s;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/ModGameIndexActivity_$s;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity_;Ljava/lang/String;JLjava/lang/String;Ljava/util/List;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method e1()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/ModGameIndexActivity_$r;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/ModGameIndexActivity_$r;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method g1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ModGameIndexActivity_$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ModGameIndexActivity_$f;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public getBean(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity_;->Z1:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method getDetialData()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/ModGameIndexActivity_$q;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/ModGameIndexActivity_$q;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method public internalFindViewById(I)Landroid/view/View;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity_;->Y1:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    const p1, 0x7f0c0075

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity_;->setContentView(I)V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity_;->b2:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 2
    invoke-super {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->onDestroy()V

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 4

    const v0, 0x7f09090f

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->b:Landroid/widget/ImageView;

    const v0, 0x7f0915de

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->c:Landroid/widget/TextView;

    const v0, 0x7f09120b

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->d:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v0, 0x7f090d0c

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->e:Landroid/widget/LinearLayout;

    const v0, 0x7f090d2e

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->f:Landroid/widget/LinearLayout;

    const v0, 0x7f09094e

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->g:Landroid/widget/ImageView;

    const v0, 0x7f09162d

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->h:Landroid/widget/TextView;

    const v0, 0x7f09163d

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->i:Landroid/widget/TextView;

    const v0, 0x7f091687

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->j:Landroid/widget/TextView;

    const v0, 0x7f091685

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->k:Landroid/widget/TextView;

    const v0, 0x7f091648

    .line 11
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->l:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v0, 0x7f09096e

    .line 12
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->m:Landroid/widget/ImageView;

    const v0, 0x7f09094d

    .line 13
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->n:Landroid/widget/ImageView;

    const v0, 0x7f091686

    .line 14
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->o:Landroid/widget/TextView;

    const v0, 0x7f09162b

    .line 15
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->p:Landroid/widget/TextView;

    const v0, 0x7f090310

    .line 16
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->q:Landroidx/constraintlayout/widget/ConstraintLayout;

    const v0, 0x7f091626

    .line 17
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->r:Landroid/widget/TextView;

    const v0, 0x7f09120e

    .line 18
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->s:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v0, 0x7f0917b0

    .line 19
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/viewpager/widget/ViewPager;

    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->t:Landroidx/viewpager/widget/ViewPager;

    const v0, 0x7f091356

    .line 20
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/tabs/TabLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->u:Lcom/google/android/material/tabs/TabLayout;

    const v0, 0x7f09113c

    .line 21
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->v:Landroid/view/View;

    const v0, 0x7f090d82

    .line 22
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->w:Landroid/view/View;

    const v0, 0x7f090d7f

    .line 23
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->x:Landroid/view/View;

    const v0, 0x7f090112

    .line 24
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->y:Landroid/view/View;

    const v0, 0x7f0911c4

    .line 25
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->z:Landroidx/recyclerview/widget/RecyclerView;

    const v0, 0x7f0911c3

    .line 26
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->A:Landroidx/recyclerview/widget/RecyclerView;

    const v0, 0x7f090218

    .line 27
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->B:Landroid/widget/ImageView;

    const v0, 0x7f090217

    .line 28
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->C:Landroid/widget/ImageView;

    const v0, 0x7f0905a6

    .line 29
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/MyTouchFrameLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->D:Lcom/join/mgps/customview/MyTouchFrameLayout;

    const v0, 0x7f0905a5

    .line 30
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/MyTouchFrameLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->E:Lcom/join/mgps/customview/MyTouchFrameLayout;

    const v0, 0x7f09051a

    .line 31
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->F:Landroid/view/View;

    const v0, 0x7f090ca7

    .line 32
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->G:Landroid/widget/LinearLayout;

    const v0, 0x7f091555

    .line 33
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->H:Landroid/widget/TextView;

    const v0, 0x7f0901c2

    .line 34
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f09110c

    .line 35
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f091261

    .line 36
    invoke-interface {p1, v2}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    .line 37
    iget-object v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->b:Landroid/widget/ImageView;

    if-eqz v2, :cond_0

    .line 38
    new-instance v3, Lcom/join/mgps/activity/ModGameIndexActivity_$v;

    invoke-direct {v3, p0}, Lcom/join/mgps/activity/ModGameIndexActivity_$v;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity_;)V

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 39
    :cond_0
    iget-object v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->e:Landroid/widget/LinearLayout;

    if-eqz v2, :cond_1

    .line 40
    new-instance v3, Lcom/join/mgps/activity/ModGameIndexActivity_$w;

    invoke-direct {v3, p0}, Lcom/join/mgps/activity/ModGameIndexActivity_$w;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity_;)V

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 41
    :cond_1
    iget-object v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->f:Landroid/widget/LinearLayout;

    if-eqz v2, :cond_2

    .line 42
    new-instance v3, Lcom/join/mgps/activity/ModGameIndexActivity_$x;

    invoke-direct {v3, p0}, Lcom/join/mgps/activity/ModGameIndexActivity_$x;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity_;)V

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 43
    :cond_2
    iget-object v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->B:Landroid/widget/ImageView;

    if-eqz v2, :cond_3

    .line 44
    new-instance v3, Lcom/join/mgps/activity/ModGameIndexActivity_$y;

    invoke-direct {v3, p0}, Lcom/join/mgps/activity/ModGameIndexActivity_$y;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity_;)V

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 45
    :cond_3
    iget-object v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->C:Landroid/widget/ImageView;

    if-eqz v2, :cond_4

    .line 46
    new-instance v3, Lcom/join/mgps/activity/ModGameIndexActivity_$z;

    invoke-direct {v3, p0}, Lcom/join/mgps/activity/ModGameIndexActivity_$z;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity_;)V

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 47
    :cond_4
    iget-object v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->F:Landroid/view/View;

    if-eqz v2, :cond_5

    .line 48
    new-instance v3, Lcom/join/mgps/activity/ModGameIndexActivity_$a0;

    invoke-direct {v3, p0}, Lcom/join/mgps/activity/ModGameIndexActivity_$a0;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity_;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_5
    if-eqz v0, :cond_6

    .line 49
    new-instance v2, Lcom/join/mgps/activity/ModGameIndexActivity_$b0;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/ModGameIndexActivity_$b0;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity_;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 50
    :cond_6
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->l:Lcom/facebook/drawee/view/SimpleDraweeView;

    if-eqz v0, :cond_7

    .line 51
    new-instance v2, Lcom/join/mgps/activity/ModGameIndexActivity_$c0;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/ModGameIndexActivity_$c0;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity_;)V

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_7
    if-eqz v1, :cond_8

    .line 52
    new-instance v0, Lcom/join/mgps/activity/ModGameIndexActivity_$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ModGameIndexActivity_$a;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity_;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_8
    if-eqz p1, :cond_9

    .line 53
    new-instance v0, Lcom/join/mgps/activity/ModGameIndexActivity_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ModGameIndexActivity_$b;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 54
    :cond_9
    invoke-virtual {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->afterViews()V

    return-void
.end method

.method public putBean(Ljava/lang/Class;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;TT;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity_;->Z1:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->setContentView(I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity_;->Y1:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 5
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->setContentView(Landroid/view/View;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity_;->Y1:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity_;->Y1:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/ModGameIndexActivity_;->injectExtras_()V

    return-void
.end method

.method showLoding()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ModGameIndexActivity_$i;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ModGameIndexActivity_$i;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLodingFailed()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ModGameIndexActivity_$g;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ModGameIndexActivity_$g;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method t1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ModGameIndexActivity_$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ModGameIndexActivity_$d;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
