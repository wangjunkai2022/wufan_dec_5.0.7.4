.class public final Lcom/join/mgps/activity/SimulatorAreaActivity_;
.super Lcom/join/mgps/activity/SimulatorAreaActivity;
.source "SimulatorAreaActivity_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/SimulatorAreaActivity_$n;
    }
.end annotation


# static fields
.field public static final E:Ljava/lang/String; = "simulatorType"

.field public static final F:Ljava/lang/String; = "simulatorTitle"


# instance fields
.field private final A:La4/c;

.field private final B:Ljava/util/Map;
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

.field private final C:Landroid/content/IntentFilter;

.field private final D:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/SimulatorAreaActivity;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/SimulatorAreaActivity_;->A:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/SimulatorAreaActivity_;->B:Ljava/util/Map;

    .line 4
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/SimulatorAreaActivity_;->C:Landroid/content/IntentFilter;

    .line 5
    new-instance v0, Lcom/join/mgps/activity/SimulatorAreaActivity_$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/SimulatorAreaActivity_$e;-><init>(Lcom/join/mgps/activity/SimulatorAreaActivity_;)V

    iput-object v0, p0, Lcom/join/mgps/activity/SimulatorAreaActivity_;->D:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method public static A0(Landroid/content/Context;)Lcom/join/mgps/activity/SimulatorAreaActivity_$n;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/SimulatorAreaActivity_$n;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/SimulatorAreaActivity_$n;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static B0(Landroidx/fragment/app/Fragment;)Lcom/join/mgps/activity/SimulatorAreaActivity_$n;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/SimulatorAreaActivity_$n;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/SimulatorAreaActivity_$n;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/SimulatorAreaActivity_;->injectExtras_()V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/SimulatorAreaActivity_;->C:Landroid/content/IntentFilter;

    const-string v0, "com.join.android.app.mgsim.wufun.broadcast.refreshMyGame"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/SimulatorAreaActivity_;->C:Landroid/content/IntentFilter;

    const-string v0, "com.join.android.app.mgsim.wufun.broadcast.paygamefinish"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 5
    iget-object p1, p0, Lcom/join/mgps/activity/SimulatorAreaActivity_;->D:Landroid/content/BroadcastReceiver;

    iget-object v0, p0, Lcom/join/mgps/activity/SimulatorAreaActivity_;->C:Landroid/content/IntentFilter;

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

    if-eqz v0, :cond_1

    const-string v1, "simulatorType"

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/join/mgps/activity/SimulatorAreaActivity;->i:I

    :cond_0
    const-string v1, "simulatorTitle"

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/SimulatorAreaActivity;->j:Ljava/lang/String;

    :cond_1
    return-void
.end method

.method static synthetic t0(Lcom/join/mgps/activity/SimulatorAreaActivity_;Lcom/join/mgps/dto/SimulatorAreaDataBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/SimulatorAreaActivity;->o0(Lcom/join/mgps/dto/SimulatorAreaDataBean;)V

    return-void
.end method

.method static synthetic u0(Lcom/join/mgps/activity/SimulatorAreaActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/SimulatorAreaActivity;->n0()V

    return-void
.end method

.method static synthetic v0(Lcom/join/mgps/activity/SimulatorAreaActivity_;Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/SimulatorAreaActivity;->s0(Z)V

    return-void
.end method

.method static synthetic w0(Lcom/join/mgps/activity/SimulatorAreaActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/SimulatorAreaActivity;->updateDownloadView()V

    return-void
.end method

.method static synthetic x0(Lcom/join/mgps/activity/SimulatorAreaActivity_;Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/SimulatorAreaActivity;->updateUI(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    return-void
.end method

.method static synthetic y0(Lcom/join/mgps/activity/SimulatorAreaActivity_;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/SimulatorAreaActivity;->k0(Ljava/lang/String;I)V

    return-void
.end method

.method static synthetic z0(Lcom/join/mgps/activity/SimulatorAreaActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/SimulatorAreaActivity;->getDownloadTaskInfo()V

    return-void
.end method


# virtual methods
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
    iget-object v0, p0, Lcom/join/mgps/activity/SimulatorAreaActivity_;->B:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method getDownloadTaskInfo()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/SimulatorAreaActivity_$d;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/SimulatorAreaActivity_$d;-><init>(Lcom/join/mgps/activity/SimulatorAreaActivity_;Ljava/lang/String;JLjava/lang/String;)V

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

.method k0(Ljava/lang/String;I)V
    .locals 9

    .line 1
    new-instance v8, Lcom/join/mgps/activity/SimulatorAreaActivity_$c;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v8

    move-object v1, p0

    move-object v6, p1

    move v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/join/mgps/activity/SimulatorAreaActivity_$c;-><init>(Lcom/join/mgps/activity/SimulatorAreaActivity_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;I)V

    invoke-static {v8}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method n0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/SimulatorAreaActivity_$l;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/SimulatorAreaActivity_$l;-><init>(Lcom/join/mgps/activity/SimulatorAreaActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method o0(Lcom/join/mgps/dto/SimulatorAreaDataBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/SimulatorAreaActivity_$k;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/SimulatorAreaActivity_$k;-><init>(Lcom/join/mgps/activity/SimulatorAreaActivity_;Lcom/join/mgps/dto/SimulatorAreaDataBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/SimulatorAreaActivity_;->A:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/SimulatorAreaActivity_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    const p1, 0x7f0c0096

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/SimulatorAreaActivity_;->setContentView(I)V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/SimulatorAreaActivity_;->D:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 2
    invoke-super {p0}, Lcom/join/mgps/activity/SimulatorAreaActivity;->onDestroy()V

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 3

    const v0, 0x7f090d82

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/SimulatorAreaActivity;->c:Landroid/widget/LinearLayout;

    const v0, 0x7f090d7f

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/SimulatorAreaActivity;->d:Landroid/widget/LinearLayout;

    const v0, 0x7f0912b2

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/XListView2;

    iput-object v0, p0, Lcom/join/mgps/activity/SimulatorAreaActivity;->e:Lcom/join/mgps/customview/XListView2;

    const v0, 0x7f091489

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/SimulatorAreaActivity;->f:Landroid/widget/TextView;

    const v0, 0x7f091486

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/SimulatorAreaActivity;->g:Landroid/widget/ImageView;

    const v0, 0x7f091484

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/CustomerDownloadView;

    iput-object v0, p0, Lcom/join/mgps/activity/SimulatorAreaActivity;->h:Lcom/join/mgps/customview/CustomerDownloadView;

    const v0, 0x7f091261

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f090146

    .line 8
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    .line 9
    iget-object v1, p0, Lcom/join/mgps/activity/SimulatorAreaActivity;->d:Landroid/widget/LinearLayout;

    if-eqz v1, :cond_0

    .line 10
    new-instance v2, Lcom/join/mgps/activity/SimulatorAreaActivity_$f;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/SimulatorAreaActivity_$f;-><init>(Lcom/join/mgps/activity/SimulatorAreaActivity_;)V

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    if-eqz v0, :cond_1

    .line 11
    new-instance v1, Lcom/join/mgps/activity/SimulatorAreaActivity_$g;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/SimulatorAreaActivity_$g;-><init>(Lcom/join/mgps/activity/SimulatorAreaActivity_;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 12
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/SimulatorAreaActivity;->g:Landroid/widget/ImageView;

    if-eqz v0, :cond_2

    .line 13
    new-instance v1, Lcom/join/mgps/activity/SimulatorAreaActivity_$h;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/SimulatorAreaActivity_$h;-><init>(Lcom/join/mgps/activity/SimulatorAreaActivity_;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 14
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/SimulatorAreaActivity;->h:Lcom/join/mgps/customview/CustomerDownloadView;

    if-eqz v0, :cond_3

    .line 15
    new-instance v1, Lcom/join/mgps/activity/SimulatorAreaActivity_$i;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/SimulatorAreaActivity_$i;-><init>(Lcom/join/mgps/activity/SimulatorAreaActivity_;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_3
    if-eqz p1, :cond_4

    .line 16
    new-instance v0, Lcom/join/mgps/activity/SimulatorAreaActivity_$j;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/SimulatorAreaActivity_$j;-><init>(Lcom/join/mgps/activity/SimulatorAreaActivity_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    :cond_4
    invoke-virtual {p0}, Lcom/join/mgps/activity/SimulatorAreaActivity;->afterviews()V

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
    iget-object v0, p0, Lcom/join/mgps/activity/SimulatorAreaActivity_;->B:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method s0(Z)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/SimulatorAreaActivity_$m;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/SimulatorAreaActivity_$m;-><init>(Lcom/join/mgps/activity/SimulatorAreaActivity_;Z)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->setContentView(I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/SimulatorAreaActivity_;->A:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 5
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->setContentView(Landroid/view/View;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/SimulatorAreaActivity_;->A:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/SimulatorAreaActivity_;->A:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/SimulatorAreaActivity_;->injectExtras_()V

    return-void
.end method

.method updateDownloadView()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/SimulatorAreaActivity_$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/SimulatorAreaActivity_$a;-><init>(Lcom/join/mgps/activity/SimulatorAreaActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method updateUI(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/SimulatorAreaActivity_$b;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/activity/SimulatorAreaActivity_$b;-><init>(Lcom/join/mgps/activity/SimulatorAreaActivity_;Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
