.class public final Lcom/join/mgps/activity/MyGamePapaFavFragment_;
.super Lcom/join/mgps/activity/MyGamePapaFavFragment;
.source "MyGamePapaFavFragment_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/MyGamePapaFavFragment_$r;
    }
.end annotation


# static fields
.field public static final G:Ljava/lang/String; = "groupId"

.field public static final H:Ljava/lang/String; = "title"


# instance fields
.field private final B:La4/c;

.field private C:Landroid/view/View;

.field private final D:Ljava/util/Map;
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

.field private final E:Landroid/content/IntentFilter;

.field private final F:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/MyGamePapaFavFragment;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment_;->B:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment_;->D:Ljava/util/Map;

    .line 4
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment_;->E:Landroid/content/IntentFilter;

    .line 5
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFavFragment_$i;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyGamePapaFavFragment_$i;-><init>(Lcom/join/mgps/activity/MyGamePapaFavFragment_;)V

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment_;->F:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic A0(Lcom/join/mgps/activity/MyGamePapaFavFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyGamePapaFavFragment;->k0()V

    return-void
.end method

.method static synthetic B0(Lcom/join/mgps/activity/MyGamePapaFavFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyGamePapaFavFragment;->l0()V

    return-void
.end method

.method static synthetic C0(Lcom/join/mgps/activity/MyGamePapaFavFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyGamePapaFavFragment;->w0()V

    return-void
.end method

.method static synthetic D0(Lcom/join/mgps/activity/MyGamePapaFavFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MyGamePapaFavFragment;->o0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic E0(Lcom/join/mgps/activity/MyGamePapaFavFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyGamePapaFavFragment;->g0()V

    return-void
.end method

.method static synthetic F0(Lcom/join/mgps/activity/MyGamePapaFavFragment_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MyGamePapaFavFragment;->d0(I)V

    return-void
.end method

.method static synthetic G0(Lcom/join/mgps/activity/MyGamePapaFavFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyGamePapaFavFragment;->e0()V

    return-void
.end method

.method static synthetic H0(Lcom/join/mgps/activity/MyGamePapaFavFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MyGamePapaFavFragment;->showMessage(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic I0(Lcom/join/mgps/activity/MyGamePapaFavFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyGamePapaFavFragment;->showLoding()V

    return-void
.end method

.method static synthetic J0(Lcom/join/mgps/activity/MyGamePapaFavFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyGamePapaFavFragment;->showLodingFailed()V

    return-void
.end method

.method static synthetic K0(Lcom/join/mgps/activity/MyGamePapaFavFragment_;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/MyGamePapaFavFragment;->t0(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic L0(Lcom/join/mgps/activity/MyGamePapaFavFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MyGamePapaFavFragment;->u0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic M0(Lcom/join/mgps/activity/MyGamePapaFavFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyGamePapaFavFragment;->showMain()V

    return-void
.end method

.method static synthetic N0(Lcom/join/mgps/activity/MyGamePapaFavFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyGamePapaFavFragment;->x0()V

    return-void
.end method

.method public static O0()Lcom/join/mgps/activity/MyGamePapaFavFragment_$r;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFavFragment_$r;

    invoke-direct {v0}, Lcom/join/mgps/activity/MyGamePapaFavFragment_$r;-><init>()V

    return-object v0
.end method

.method private P0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "groupId"

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment;->g:Ljava/lang/String;

    :cond_0
    const-string v1, "title"

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment;->h:Ljava/lang/String;

    :cond_1
    return-void
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    new-instance p1, Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment;->t:Lcom/join/mgps/pref/PrefDef_;

    .line 2
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 3
    invoke-direct {p0}, Lcom/join/mgps/activity/MyGamePapaFavFragment_;->P0()V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment_;->E:Landroid/content/IntentFilter;

    const-string v0, "com.join.android.app.mgsim.wufun.broadcast.action_unread_notify"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method d0(I)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/MyGamePapaFavFragment_$h;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/MyGamePapaFavFragment_$h;-><init>(Lcom/join/mgps/activity/MyGamePapaFavFragment_;Ljava/lang/String;JLjava/lang/String;I)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method e0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFavFragment_$n;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyGamePapaFavFragment_$n;-><init>(Lcom/join/mgps/activity/MyGamePapaFavFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method g0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/MyGamePapaFavFragment_$g;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/MyGamePapaFavFragment_$g;-><init>(Lcom/join/mgps/activity/MyGamePapaFavFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment_;->D:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public internalFindViewById(I)Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment_;->C:Landroid/view/View;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method k0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFavFragment_$l;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyGamePapaFavFragment_$l;-><init>(Lcom/join/mgps/activity/MyGamePapaFavFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method l0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFavFragment_$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyGamePapaFavFragment_$e;-><init>(Lcom/join/mgps/activity/MyGamePapaFavFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method o0(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFavFragment_$f;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/MyGamePapaFavFragment_$f;-><init>(Lcom/join/mgps/activity/MyGamePapaFavFragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x64

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment_;->B:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/MyGamePapaFavFragment_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment_;->F:Landroid/content/BroadcastReceiver;

    iget-object v2, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment_;->E:Landroid/content/IntentFilter;

    invoke-virtual {p1, v1, v2}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 5
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p3

    iput-object p3, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment_;->C:Landroid/view/View;

    if-nez p3, :cond_0

    const p3, 0x7f0c0289

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment_;->C:Landroid/view/View;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment_;->C:Landroid/view/View;

    return-object p1
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment_;->F:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 2
    invoke-super {p0}, Lcom/join/mgps/activity/MyGamePapaFavFragment;->onDestroy()V

    return-void
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment_;->C:Landroid/view/View;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment;->b:Lcom/join/mgps/customview/XListView2;

    .line 4
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment;->c:Landroid/widget/LinearLayout;

    .line 5
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment;->d:Landroid/widget/LinearLayout;

    .line 6
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment;->e:Landroid/widget/LinearLayout;

    .line 7
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment;->f:Landroid/view/View;

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 2

    const v0, 0x7f090c91

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/XListView2;

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment;->b:Lcom/join/mgps/customview/XListView2;

    const v0, 0x7f090d82

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment;->c:Landroid/widget/LinearLayout;

    const v0, 0x7f090d7f

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment;->d:Landroid/widget/LinearLayout;

    const v0, 0x7f0904e0

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment;->e:Landroid/widget/LinearLayout;

    const v0, 0x7f0911a2

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment;->f:Landroid/view/View;

    const v0, 0x7f09110c

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f091261

    .line 7
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz v0, :cond_0

    .line 8
    new-instance v1, Lcom/join/mgps/activity/MyGamePapaFavFragment_$j;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/MyGamePapaFavFragment_$j;-><init>(Lcom/join/mgps/activity/MyGamePapaFavFragment_;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    if-eqz p1, :cond_1

    .line 9
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFavFragment_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyGamePapaFavFragment_$k;-><init>(Lcom/join/mgps/activity/MyGamePapaFavFragment_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 10
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/MyGamePapaFavFragment;->Z()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment_;->B:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment_;->D:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method showLoding()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFavFragment_$p;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyGamePapaFavFragment_$p;-><init>(Lcom/join/mgps/activity/MyGamePapaFavFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLodingFailed()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFavFragment_$q;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyGamePapaFavFragment_$q;-><init>(Lcom/join/mgps/activity/MyGamePapaFavFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showMain()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFavFragment_$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyGamePapaFavFragment_$c;-><init>(Lcom/join/mgps/activity/MyGamePapaFavFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showMessage(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFavFragment_$o;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/MyGamePapaFavFragment_$o;-><init>(Lcom/join/mgps/activity/MyGamePapaFavFragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method t0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFavFragment_$a;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/activity/MyGamePapaFavFragment_$a;-><init>(Lcom/join/mgps/activity/MyGamePapaFavFragment_;Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method u0(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFavFragment_$b;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/MyGamePapaFavFragment_$b;-><init>(Lcom/join/mgps/activity/MyGamePapaFavFragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method w0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFavFragment_$m;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyGamePapaFavFragment_$m;-><init>(Lcom/join/mgps/activity/MyGamePapaFavFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method x0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFavFragment_$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyGamePapaFavFragment_$d;-><init>(Lcom/join/mgps/activity/MyGamePapaFavFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
