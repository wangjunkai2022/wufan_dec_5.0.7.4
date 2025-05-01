.class public final Lcom/join/mgps/activity/UninstallWufunGameActivity_;
.super Lcom/join/mgps/activity/UninstallWufunGameActivity;
.source "UninstallWufunGameActivity_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/UninstallWufunGameActivity_$t;
    }
.end annotation


# static fields
.field public static final P:Ljava/lang/String; = "gameId"


# instance fields
.field private final L:La4/c;

.field private final M:Ljava/util/Map;
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

.field private final N:Landroid/content/IntentFilter;

.field private final O:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/UninstallWufunGameActivity;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity_;->L:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity_;->M:Ljava/util/Map;

    .line 4
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity_;->N:Landroid/content/IntentFilter;

    .line 5
    new-instance v0, Lcom/join/mgps/activity/UninstallWufunGameActivity_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UninstallWufunGameActivity_$k;-><init>(Lcom/join/mgps/activity/UninstallWufunGameActivity_;)V

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity_;->O:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic H0(Lcom/join/mgps/activity/UninstallWufunGameActivity_;Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/UninstallWufunGameActivity;->z0(Z)V

    return-void
.end method

.method static synthetic I0(Lcom/join/mgps/activity/UninstallWufunGameActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/UninstallWufunGameActivity;->v0()V

    return-void
.end method

.method static synthetic J0(Lcom/join/mgps/activity/UninstallWufunGameActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/UninstallWufunGameActivity;->w0()V

    return-void
.end method

.method static synthetic K0(Lcom/join/mgps/activity/UninstallWufunGameActivity_;Lcom/join/mgps/dto/UninstallGuessLikeBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/UninstallWufunGameActivity;->E0(Lcom/join/mgps/dto/UninstallGuessLikeBean;)V

    return-void
.end method

.method static synthetic L0(Lcom/join/mgps/activity/UninstallWufunGameActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/UninstallWufunGameActivity;->A0()V

    return-void
.end method

.method static synthetic M0(Lcom/join/mgps/activity/UninstallWufunGameActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/UninstallWufunGameActivity;->showLoding()V

    return-void
.end method

.method static synthetic N0(Lcom/join/mgps/activity/UninstallWufunGameActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/UninstallWufunGameActivity;->showLodingFailed()V

    return-void
.end method

.method static synthetic O0(Lcom/join/mgps/activity/UninstallWufunGameActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/UninstallWufunGameActivity;->showToast(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic P0(Lcom/join/mgps/activity/UninstallWufunGameActivity_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/UninstallWufunGameActivity;->s0(Ljava/util/List;)V

    return-void
.end method

.method static synthetic Q0(Lcom/join/mgps/activity/UninstallWufunGameActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/UninstallWufunGameActivity;->p0()V

    return-void
.end method

.method public static R0(Landroid/content/Context;)Lcom/join/mgps/activity/UninstallWufunGameActivity_$t;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/UninstallWufunGameActivity_$t;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UninstallWufunGameActivity_$t;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static S0(Landroidx/fragment/app/Fragment;)Lcom/join/mgps/activity/UninstallWufunGameActivity_$t;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/UninstallWufunGameActivity_$t;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UninstallWufunGameActivity_$t;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/UninstallWufunGameActivity_;->injectExtras_()V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity_;->N:Landroid/content/IntentFilter;

    const-string v0, "com.join.apkinstal.action.broadcast"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity_;->O:Landroid/content/BroadcastReceiver;

    iget-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity_;->N:Landroid/content/IntentFilter;

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

    if-eqz v0, :cond_0

    const-string v1, "gameId"

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity;->y:Ljava/lang/String;

    :cond_0
    return-void
.end method


# virtual methods
.method A0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/UninstallWufunGameActivity_$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UninstallWufunGameActivity_$e;-><init>(Lcom/join/mgps/activity/UninstallWufunGameActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method E0(Lcom/join/mgps/dto/UninstallGuessLikeBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/UninstallWufunGameActivity_$d;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/UninstallWufunGameActivity_$d;-><init>(Lcom/join/mgps/activity/UninstallWufunGameActivity_;Lcom/join/mgps/dto/UninstallGuessLikeBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity_;->M:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
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
    iget-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity_;->L:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/UninstallWufunGameActivity_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    const p1, 0x7f0c00a5

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/UninstallWufunGameActivity_;->setContentView(I)V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity_;->O:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 2
    invoke-super {p0}, Lcom/join/mgps/activity/UninstallWufunGameActivity;->onDestroy()V

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 3

    const v0, 0x7f09132b

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity;->b:Landroid/view/View;

    const v0, 0x7f090745

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity;->c:Landroid/widget/RelativeLayout;

    const v0, 0x7f091489

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity;->d:Landroid/widget/TextView;

    const v0, 0x7f0902a0

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity;->e:Landroid/widget/FrameLayout;

    const v0, 0x7f091491

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity;->f:Landroid/widget/FrameLayout;

    const v0, 0x7f09063d

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity;->g:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v0, 0x7f090665

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity;->h:Landroid/widget/TextView;

    const v0, 0x7f090630

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity;->i:Landroid/widget/TextView;

    const v0, 0x7f09066c

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity;->j:Landroid/widget/TextView;

    const v0, 0x7f0902e3

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity;->k:Landroid/widget/ImageView;

    const v0, 0x7f09062a

    .line 11
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity;->l:Landroidx/constraintlayout/widget/ConstraintLayout;

    const v0, 0x7f09063e

    .line 12
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity;->m:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v0, 0x7f090666

    .line 13
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity;->n:Landroid/widget/TextView;

    const v0, 0x7f09066d

    .line 14
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity;->o:Landroid/widget/TextView;

    const v0, 0x7f0902e4

    .line 15
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity;->p:Landroid/widget/ImageView;

    const v0, 0x7f09062b

    .line 16
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity;->q:Landroidx/constraintlayout/widget/ConstraintLayout;

    const v0, 0x7f09150b

    .line 17
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity;->r:Landroid/widget/TextView;

    const v0, 0x7f09150c

    .line 18
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity;->s:Landroid/widget/TextView;

    const v0, 0x7f0902ab

    .line 19
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/cardview/widget/CardView;

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity;->t:Landroidx/cardview/widget/CardView;

    const v0, 0x7f0905a4

    .line 20
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity;->u:Landroid/widget/FrameLayout;

    const v0, 0x7f0911c8

    .line 21
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity;->v:Landroidx/recyclerview/widget/RecyclerView;

    const v0, 0x7f090d82

    .line 22
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity;->w:Landroid/view/View;

    const v0, 0x7f090d7f

    .line 23
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity;->x:Landroid/view/View;

    const v0, 0x7f091261

    .line 24
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f09110c

    .line 25
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f090146

    .line 26
    invoke-interface {p1, v2}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz v0, :cond_0

    .line 27
    new-instance v2, Lcom/join/mgps/activity/UninstallWufunGameActivity_$l;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/UninstallWufunGameActivity_$l;-><init>(Lcom/join/mgps/activity/UninstallWufunGameActivity_;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    if-eqz v1, :cond_1

    .line 28
    new-instance v0, Lcom/join/mgps/activity/UninstallWufunGameActivity_$m;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UninstallWufunGameActivity_$m;-><init>(Lcom/join/mgps/activity/UninstallWufunGameActivity_;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    if-eqz p1, :cond_2

    .line 29
    new-instance v0, Lcom/join/mgps/activity/UninstallWufunGameActivity_$n;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UninstallWufunGameActivity_$n;-><init>(Lcom/join/mgps/activity/UninstallWufunGameActivity_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 30
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity;->f:Landroid/widget/FrameLayout;

    if-eqz p1, :cond_3

    .line 31
    new-instance v0, Lcom/join/mgps/activity/UninstallWufunGameActivity_$o;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UninstallWufunGameActivity_$o;-><init>(Lcom/join/mgps/activity/UninstallWufunGameActivity_;)V

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 32
    :cond_3
    iget-object p1, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity;->l:Landroidx/constraintlayout/widget/ConstraintLayout;

    if-eqz p1, :cond_4

    .line 33
    new-instance v0, Lcom/join/mgps/activity/UninstallWufunGameActivity_$p;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UninstallWufunGameActivity_$p;-><init>(Lcom/join/mgps/activity/UninstallWufunGameActivity_;)V

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 34
    :cond_4
    iget-object p1, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity;->q:Landroidx/constraintlayout/widget/ConstraintLayout;

    if-eqz p1, :cond_5

    .line 35
    new-instance v0, Lcom/join/mgps/activity/UninstallWufunGameActivity_$q;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UninstallWufunGameActivity_$q;-><init>(Lcom/join/mgps/activity/UninstallWufunGameActivity_;)V

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 36
    :cond_5
    iget-object p1, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity;->r:Landroid/widget/TextView;

    if-eqz p1, :cond_6

    .line 37
    new-instance v0, Lcom/join/mgps/activity/UninstallWufunGameActivity_$r;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UninstallWufunGameActivity_$r;-><init>(Lcom/join/mgps/activity/UninstallWufunGameActivity_;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 38
    :cond_6
    iget-object p1, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity;->s:Landroid/widget/TextView;

    if-eqz p1, :cond_7

    .line 39
    new-instance v0, Lcom/join/mgps/activity/UninstallWufunGameActivity_$s;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UninstallWufunGameActivity_$s;-><init>(Lcom/join/mgps/activity/UninstallWufunGameActivity_;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 40
    :cond_7
    invoke-virtual {p0}, Lcom/join/mgps/activity/UninstallWufunGameActivity;->afterviews()V

    return-void
.end method

.method p0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/UninstallWufunGameActivity_$j;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/UninstallWufunGameActivity_$j;-><init>(Lcom/join/mgps/activity/UninstallWufunGameActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity_;->M:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method s0(Ljava/util/List;)V
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
    new-instance v7, Lcom/join/mgps/activity/UninstallWufunGameActivity_$i;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/UninstallWufunGameActivity_$i;-><init>(Lcom/join/mgps/activity/UninstallWufunGameActivity_;Ljava/lang/String;JLjava/lang/String;Ljava/util/List;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->setContentView(I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity_;->L:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 5
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->setContentView(Landroid/view/View;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity_;->L:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity_;->L:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/UninstallWufunGameActivity_;->injectExtras_()V

    return-void
.end method

.method showLoding()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/UninstallWufunGameActivity_$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UninstallWufunGameActivity_$f;-><init>(Lcom/join/mgps/activity/UninstallWufunGameActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLodingFailed()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/UninstallWufunGameActivity_$g;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UninstallWufunGameActivity_$g;-><init>(Lcom/join/mgps/activity/UninstallWufunGameActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showToast(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/UninstallWufunGameActivity_$h;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/UninstallWufunGameActivity_$h;-><init>(Lcom/join/mgps/activity/UninstallWufunGameActivity_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method v0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/UninstallWufunGameActivity_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UninstallWufunGameActivity_$b;-><init>(Lcom/join/mgps/activity/UninstallWufunGameActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method w0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/UninstallWufunGameActivity_$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UninstallWufunGameActivity_$c;-><init>(Lcom/join/mgps/activity/UninstallWufunGameActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method z0(Z)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/UninstallWufunGameActivity_$a;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/UninstallWufunGameActivity_$a;-><init>(Lcom/join/mgps/activity/UninstallWufunGameActivity_;Z)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
