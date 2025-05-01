.class public final Lcom/join/mgps/fragment/CloudListFragmentV2_;
.super Lcom/join/mgps/fragment/CloudListFragmentV2;
.source "CloudListFragmentV2_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/fragment/CloudListFragmentV2_$z;
    }
.end annotation


# instance fields
.field private final E:La4/c;

.field private F:Landroid/view/View;

.field private final G:Ljava/util/Map;
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

.field private final H:Landroid/content/IntentFilter;

.field private final I:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/fragment/CloudListFragmentV2;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/CloudListFragmentV2_;->E:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/CloudListFragmentV2_;->G:Ljava/util/Map;

    .line 4
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/CloudListFragmentV2_;->H:Landroid/content/IntentFilter;

    .line 5
    new-instance v0, Lcom/join/mgps/fragment/CloudListFragmentV2_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/CloudListFragmentV2_$k;-><init>(Lcom/join/mgps/fragment/CloudListFragmentV2_;)V

    iput-object v0, p0, Lcom/join/mgps/fragment/CloudListFragmentV2_;->I:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic H0(Lcom/join/mgps/fragment/CloudListFragmentV2_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/CloudListFragmentV2;->Z()V

    return-void
.end method

.method static synthetic I0(Lcom/join/mgps/fragment/CloudListFragmentV2_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/CloudListFragmentV2;->E0()V

    return-void
.end method

.method static synthetic J0(Lcom/join/mgps/fragment/CloudListFragmentV2_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/CloudListFragmentV2;->o0()V

    return-void
.end method

.method static synthetic K0(Lcom/join/mgps/fragment/CloudListFragmentV2_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/CloudListFragmentV2;->G0()V

    return-void
.end method

.method static synthetic L0(Lcom/join/mgps/fragment/CloudListFragmentV2_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/CloudListFragmentV2;->y0()V

    return-void
.end method

.method static synthetic M0(Lcom/join/mgps/fragment/CloudListFragmentV2_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/CloudListFragmentV2;->z0()V

    return-void
.end method

.method static synthetic N0(Lcom/join/mgps/fragment/CloudListFragmentV2_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/CloudListFragmentV2;->x0()V

    return-void
.end method

.method static synthetic O0(Lcom/join/mgps/fragment/CloudListFragmentV2_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/CloudListFragmentV2;->showMessage(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic P0(Lcom/join/mgps/fragment/CloudListFragmentV2_;Lcom/join/mgps/dto/CloudListDataBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/CloudListFragmentV2;->D0(Lcom/join/mgps/dto/CloudListDataBean;)V

    return-void
.end method

.method static synthetic Q0(Lcom/join/mgps/fragment/CloudListFragmentV2_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/CloudListFragmentV2;->F0()V

    return-void
.end method

.method static synthetic R0(Lcom/join/mgps/fragment/CloudListFragmentV2_;Lcom/join/mgps/dto/CloudListDataBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/CloudListFragmentV2;->C0(Lcom/join/mgps/dto/CloudListDataBean;)V

    return-void
.end method

.method static synthetic S0(Lcom/join/mgps/fragment/CloudListFragmentV2_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/CloudListFragmentV2;->m0(I)V

    return-void
.end method

.method static synthetic T0(Lcom/join/mgps/fragment/CloudListFragmentV2_;Lcom/join/mgps/dto/CloudListDataBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/CloudListFragmentV2;->k0(Lcom/join/mgps/dto/CloudListDataBean;)V

    return-void
.end method

.method static synthetic U0(Lcom/join/mgps/fragment/CloudListFragmentV2_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/CloudListFragmentV2;->showLoding()V

    return-void
.end method

.method static synthetic V0(Lcom/join/mgps/fragment/CloudListFragmentV2_;Lcom/join/mgps/dto/CloudListDataBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/CloudListFragmentV2;->c0(Lcom/join/mgps/dto/CloudListDataBean;)V

    return-void
.end method

.method static synthetic W0(Lcom/join/mgps/fragment/CloudListFragmentV2_;Lcom/join/mgps/dto/CloudListDataBean;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/fragment/CloudListFragmentV2;->X(Lcom/join/mgps/dto/CloudListDataBean;I)V

    return-void
.end method

.method static synthetic X0(Lcom/join/mgps/fragment/CloudListFragmentV2_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/CloudListFragmentV2;->B0(I)V

    return-void
.end method

.method static synthetic Y0(Lcom/join/mgps/fragment/CloudListFragmentV2_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/CloudListFragmentV2;->showLodingFailed()V

    return-void
.end method

.method static synthetic Z0(Lcom/join/mgps/fragment/CloudListFragmentV2_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/CloudListFragmentV2;->W()V

    return-void
.end method

.method static synthetic a1(Lcom/join/mgps/fragment/CloudListFragmentV2_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/CloudListFragmentV2;->r0()V

    return-void
.end method

.method static synthetic b1(Lcom/join/mgps/fragment/CloudListFragmentV2_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/CloudListFragmentV2;->q0()V

    return-void
.end method

.method static synthetic c1(Lcom/join/mgps/fragment/CloudListFragmentV2_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/CloudListFragmentV2;->p0()V

    return-void
.end method

.method static synthetic d1(Lcom/join/mgps/fragment/CloudListFragmentV2_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/CloudListFragmentV2;->A0()V

    return-void
.end method

.method static synthetic e1(Lcom/join/mgps/fragment/CloudListFragmentV2_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/CloudListFragmentV2;->e0(Ljava/util/List;)V

    return-void
.end method

.method public static f1()Lcom/join/mgps/fragment/CloudListFragmentV2_$z;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CloudListFragmentV2_$z;

    invoke-direct {v0}, Lcom/join/mgps/fragment/CloudListFragmentV2_$z;-><init>()V

    return-object v0
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    new-instance p1, Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/join/mgps/fragment/CloudListFragmentV2;->i:Lcom/join/mgps/pref/PrefDef_;

    .line 2
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/fragment/CloudListFragmentV2_;->H:Landroid/content/IntentFilter;

    const-string v0, "com.join.android.app.mgsim.wufun.com.cloud.delete"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method A0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CloudListFragmentV2_$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/CloudListFragmentV2_$a;-><init>(Lcom/join/mgps/fragment/CloudListFragmentV2_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method B0(I)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/fragment/CloudListFragmentV2_$q;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/fragment/CloudListFragmentV2_$q;-><init>(Lcom/join/mgps/fragment/CloudListFragmentV2_;Ljava/lang/String;JLjava/lang/String;I)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method C0(Lcom/join/mgps/dto/CloudListDataBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CloudListFragmentV2_$l;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/CloudListFragmentV2_$l;-><init>(Lcom/join/mgps/fragment/CloudListFragmentV2_;Lcom/join/mgps/dto/CloudListDataBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method D0(Lcom/join/mgps/dto/CloudListDataBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CloudListFragmentV2_$i;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/CloudListFragmentV2_$i;-><init>(Lcom/join/mgps/fragment/CloudListFragmentV2_;Lcom/join/mgps/dto/CloudListDataBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method E0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CloudListFragmentV2_$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/CloudListFragmentV2_$c;-><init>(Lcom/join/mgps/fragment/CloudListFragmentV2_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method F0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CloudListFragmentV2_$j;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/CloudListFragmentV2_$j;-><init>(Lcom/join/mgps/fragment/CloudListFragmentV2_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method G0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CloudListFragmentV2_$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/CloudListFragmentV2_$d;-><init>(Lcom/join/mgps/fragment/CloudListFragmentV2_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method W()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CloudListFragmentV2_$v;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/CloudListFragmentV2_$v;-><init>(Lcom/join/mgps/fragment/CloudListFragmentV2_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method X(Lcom/join/mgps/dto/CloudListDataBean;I)V
    .locals 9

    .line 1
    new-instance v8, Lcom/join/mgps/fragment/CloudListFragmentV2_$p;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v8

    move-object v1, p0

    move-object v6, p1

    move v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/join/mgps/fragment/CloudListFragmentV2_$p;-><init>(Lcom/join/mgps/fragment/CloudListFragmentV2_;Ljava/lang/String;JLjava/lang/String;Lcom/join/mgps/dto/CloudListDataBean;I)V

    invoke-static {v8}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method Z()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CloudListFragmentV2_$r;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/CloudListFragmentV2_$r;-><init>(Lcom/join/mgps/fragment/CloudListFragmentV2_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method c0(Lcom/join/mgps/dto/CloudListDataBean;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/fragment/CloudListFragmentV2_$o;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/fragment/CloudListFragmentV2_$o;-><init>(Lcom/join/mgps/fragment/CloudListFragmentV2_;Ljava/lang/String;JLjava/lang/String;Lcom/join/mgps/dto/CloudListDataBean;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method e0(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CloudListDataBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CloudListFragmentV2_$b;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/CloudListFragmentV2_$b;-><init>(Lcom/join/mgps/fragment/CloudListFragmentV2_;Ljava/util/List;)V

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
    iget-object v0, p0, Lcom/join/mgps/fragment/CloudListFragmentV2_;->G:Ljava/util/Map;

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
    iget-object v0, p0, Lcom/join/mgps/fragment/CloudListFragmentV2_;->F:Landroid/view/View;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method k0(Lcom/join/mgps/dto/CloudListDataBean;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/fragment/CloudListFragmentV2_$n;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/fragment/CloudListFragmentV2_$n;-><init>(Lcom/join/mgps/fragment/CloudListFragmentV2_;Ljava/lang/String;JLjava/lang/String;Lcom/join/mgps/dto/CloudListDataBean;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method m0(I)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/fragment/CloudListFragmentV2_$m;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/fragment/CloudListFragmentV2_$m;-><init>(Lcom/join/mgps/fragment/CloudListFragmentV2_;Ljava/lang/String;JLjava/lang/String;I)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method o0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CloudListFragmentV2_$s;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/CloudListFragmentV2_$s;-><init>(Lcom/join/mgps/fragment/CloudListFragmentV2_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CloudListFragmentV2_;->E:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/CloudListFragmentV2_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/fragment/CloudListFragmentV2_;->I:Landroid/content/BroadcastReceiver;

    iget-object v2, p0, Lcom/join/mgps/fragment/CloudListFragmentV2_;->H:Landroid/content/IntentFilter;

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

    iput-object p3, p0, Lcom/join/mgps/fragment/CloudListFragmentV2_;->F:Landroid/view/View;

    if-nez p3, :cond_0

    const p3, 0x7f0c0256

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/CloudListFragmentV2_;->F:Landroid/view/View;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/CloudListFragmentV2_;->F:Landroid/view/View;

    return-object p1
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/CloudListFragmentV2_;->I:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 2
    invoke-super {p0}, Lcom/join/mgps/fragment/CloudListFragmentV2;->onDestroy()V

    return-void
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/fragment/CloudListFragmentV2_;->F:Landroid/view/View;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/fragment/CloudListFragmentV2;->c:Landroid/widget/LinearLayout;

    .line 4
    iput-object v0, p0, Lcom/join/mgps/fragment/CloudListFragmentV2;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    .line 5
    iput-object v0, p0, Lcom/join/mgps/fragment/CloudListFragmentV2;->e:Landroid/widget/TextView;

    .line 6
    iput-object v0, p0, Lcom/join/mgps/fragment/CloudListFragmentV2;->f:Landroid/widget/LinearLayout;

    .line 7
    iput-object v0, p0, Lcom/join/mgps/fragment/CloudListFragmentV2;->g:Landroid/widget/LinearLayout;

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 1

    const v0, 0x7f090d13

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/CloudListFragmentV2;->c:Landroid/widget/LinearLayout;

    const v0, 0x7f0910c6

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    iput-object v0, p0, Lcom/join/mgps/fragment/CloudListFragmentV2;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    const v0, 0x7f09167b

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/CloudListFragmentV2;->e:Landroid/widget/TextView;

    const v0, 0x7f090d82

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/CloudListFragmentV2;->f:Landroid/widget/LinearLayout;

    const v0, 0x7f090d7f

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/join/mgps/fragment/CloudListFragmentV2;->g:Landroid/widget/LinearLayout;

    .line 6
    invoke-virtual {p0}, Lcom/join/mgps/fragment/CloudListFragmentV2;->afterView()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/CloudListFragmentV2_;->E:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method p0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CloudListFragmentV2_$y;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/CloudListFragmentV2_$y;-><init>(Lcom/join/mgps/fragment/CloudListFragmentV2_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

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
    iget-object v0, p0, Lcom/join/mgps/fragment/CloudListFragmentV2_;->G:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method q0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CloudListFragmentV2_$x;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/CloudListFragmentV2_$x;-><init>(Lcom/join/mgps/fragment/CloudListFragmentV2_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method r0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CloudListFragmentV2_$w;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/CloudListFragmentV2_$w;-><init>(Lcom/join/mgps/fragment/CloudListFragmentV2_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLoding()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CloudListFragmentV2_$t;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/CloudListFragmentV2_$t;-><init>(Lcom/join/mgps/fragment/CloudListFragmentV2_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLodingFailed()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CloudListFragmentV2_$u;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/CloudListFragmentV2_$u;-><init>(Lcom/join/mgps/fragment/CloudListFragmentV2_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showMessage(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CloudListFragmentV2_$h;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/CloudListFragmentV2_$h;-><init>(Lcom/join/mgps/fragment/CloudListFragmentV2_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method x0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CloudListFragmentV2_$g;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/CloudListFragmentV2_$g;-><init>(Lcom/join/mgps/fragment/CloudListFragmentV2_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method y0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CloudListFragmentV2_$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/CloudListFragmentV2_$e;-><init>(Lcom/join/mgps/fragment/CloudListFragmentV2_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method z0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CloudListFragmentV2_$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/CloudListFragmentV2_$f;-><init>(Lcom/join/mgps/fragment/CloudListFragmentV2_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
