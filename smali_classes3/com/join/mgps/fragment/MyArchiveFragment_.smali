.class public final Lcom/join/mgps/fragment/MyArchiveFragment_;
.super Lcom/join/mgps/fragment/MyArchiveFragment;
.source "MyArchiveFragment_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/fragment/MyArchiveFragment_$a0;
    }
.end annotation


# instance fields
.field private final X:La4/c;

.field private Y:Landroid/view/View;

.field private final Z:Ljava/util/Map;
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


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/fragment/MyArchiveFragment;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/MyArchiveFragment_;->X:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/MyArchiveFragment_;->Z:Ljava/util/Map;

    return-void
.end method

.method static synthetic T0(Lcom/join/mgps/fragment/MyArchiveFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/MyArchiveFragment;->V()V

    return-void
.end method

.method static synthetic U0(Lcom/join/mgps/fragment/MyArchiveFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/MyArchiveFragment;->N0()V

    return-void
.end method

.method static synthetic V0(Lcom/join/mgps/fragment/MyArchiveFragment_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/MyArchiveFragment;->u0(Ljava/util/List;)V

    return-void
.end method

.method static synthetic W0(Lcom/join/mgps/fragment/MyArchiveFragment_;Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/MyArchiveFragment;->C0(Z)V

    return-void
.end method

.method static synthetic X0(Lcom/join/mgps/fragment/MyArchiveFragment_;Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/MyArchiveFragment;->E0(Z)V

    return-void
.end method

.method static synthetic Y0(Lcom/join/mgps/fragment/MyArchiveFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/MyArchiveFragment;->L0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic Z0(Lcom/join/mgps/fragment/MyArchiveFragment_;Lcom/join/mgps/dto/CloudListDataBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/MyArchiveFragment;->R0(Lcom/join/mgps/dto/CloudListDataBean;)V

    return-void
.end method

.method static synthetic a1(Lcom/join/mgps/fragment/MyArchiveFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/MyArchiveFragment;->I0()V

    return-void
.end method

.method static synthetic b1(Lcom/join/mgps/fragment/MyArchiveFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/MyArchiveFragment;->D0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic c1(Lcom/join/mgps/fragment/MyArchiveFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/MyArchiveFragment;->showMessage(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic d1(Lcom/join/mgps/fragment/MyArchiveFragment_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/MyArchiveFragment;->m0(I)V

    return-void
.end method

.method static synthetic e1(Lcom/join/mgps/fragment/MyArchiveFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/MyArchiveFragment;->n0()V

    return-void
.end method

.method static synthetic f1(Lcom/join/mgps/fragment/MyArchiveFragment_;Ljava/util/List;ZLcom/join/mgps/fragment/MyArchiveFragment$w;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/join/mgps/fragment/MyArchiveFragment;->z0(Ljava/util/List;ZLcom/join/mgps/fragment/MyArchiveFragment$w;)V

    return-void
.end method

.method static synthetic g1(Lcom/join/mgps/fragment/MyArchiveFragment_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/MyArchiveFragment;->J0(Ljava/util/List;)V

    return-void
.end method

.method static synthetic h1(Lcom/join/mgps/fragment/MyArchiveFragment_;Lcom/join/mgps/dto/CloudListDataBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/MyArchiveFragment;->i0(Lcom/join/mgps/dto/CloudListDataBean;)V

    return-void
.end method

.method static synthetic i1(Lcom/join/mgps/fragment/MyArchiveFragment_;Lcom/join/mgps/dto/CloudListDataBean;Lcom/join/mgps/listener/e;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/fragment/MyArchiveFragment;->Q0(Lcom/join/mgps/dto/CloudListDataBean;Lcom/join/mgps/listener/e;)V

    return-void
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    new-instance p1, Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/join/mgps/fragment/MyArchiveFragment;->n:Lcom/join/mgps/pref/PrefDef_;

    .line 2
    invoke-static {p0}, La4/c;->b(La4/b;)V

    return-void
.end method

.method static synthetic j1(Lcom/join/mgps/fragment/MyArchiveFragment_;Lcom/join/mgps/dto/CloudListDataBean;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/fragment/MyArchiveFragment;->A0(Lcom/join/mgps/dto/CloudListDataBean;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic k1(Lcom/join/mgps/fragment/MyArchiveFragment_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/MyArchiveFragment;->updateUi(Ljava/util/List;)V

    return-void
.end method

.method static synthetic l1(Lcom/join/mgps/fragment/MyArchiveFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/MyArchiveFragment;->s0()V

    return-void
.end method

.method static synthetic m1(Lcom/join/mgps/fragment/MyArchiveFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/MyArchiveFragment;->r0()V

    return-void
.end method

.method static synthetic n1(Lcom/join/mgps/fragment/MyArchiveFragment_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/MyArchiveFragment;->K0(Ljava/util/List;)V

    return-void
.end method

.method static synthetic o1(Lcom/join/mgps/fragment/MyArchiveFragment_;Lcom/join/mgps/dto/CloudListDataBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/MyArchiveFragment;->H0(Lcom/join/mgps/dto/CloudListDataBean;)V

    return-void
.end method

.method static synthetic p1(Lcom/join/mgps/fragment/MyArchiveFragment_;Lcom/join/mgps/dto/CloudListDataBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/MyArchiveFragment;->G0(Lcom/join/mgps/dto/CloudListDataBean;)V

    return-void
.end method

.method static synthetic q1(Lcom/join/mgps/fragment/MyArchiveFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/MyArchiveFragment;->M0()V

    return-void
.end method

.method public static r1()Lcom/join/mgps/fragment/MyArchiveFragment_$a0;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/MyArchiveFragment_$a0;

    invoke-direct {v0}, Lcom/join/mgps/fragment/MyArchiveFragment_$a0;-><init>()V

    return-object v0
.end method


# virtual methods
.method A0(Lcom/join/mgps/dto/CloudListDataBean;Ljava/lang/String;)V
    .locals 9

    .line 1
    new-instance v8, Lcom/join/mgps/fragment/MyArchiveFragment_$r;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v8

    move-object v1, p0

    move-object v6, p1

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/join/mgps/fragment/MyArchiveFragment_$r;-><init>(Lcom/join/mgps/fragment/MyArchiveFragment_;Ljava/lang/String;JLjava/lang/String;Lcom/join/mgps/dto/CloudListDataBean;Ljava/lang/String;)V

    invoke-static {v8}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method C0(Z)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/MyArchiveFragment_$e;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/MyArchiveFragment_$e;-><init>(Lcom/join/mgps/fragment/MyArchiveFragment_;Z)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method D0(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/MyArchiveFragment_$j;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/MyArchiveFragment_$j;-><init>(Lcom/join/mgps/fragment/MyArchiveFragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method E0(Z)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/MyArchiveFragment_$f;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/MyArchiveFragment_$f;-><init>(Lcom/join/mgps/fragment/MyArchiveFragment_;Z)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method G0(Lcom/join/mgps/dto/CloudListDataBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/MyArchiveFragment_$b;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/MyArchiveFragment_$b;-><init>(Lcom/join/mgps/fragment/MyArchiveFragment_;Lcom/join/mgps/dto/CloudListDataBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method H0(Lcom/join/mgps/dto/CloudListDataBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/MyArchiveFragment_$a;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/MyArchiveFragment_$a;-><init>(Lcom/join/mgps/fragment/MyArchiveFragment_;Lcom/join/mgps/dto/CloudListDataBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method I0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/MyArchiveFragment_$i;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/MyArchiveFragment_$i;-><init>(Lcom/join/mgps/fragment/MyArchiveFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method J0(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/RomArchived;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/MyArchiveFragment_$v;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/MyArchiveFragment_$v;-><init>(Lcom/join/mgps/fragment/MyArchiveFragment_;Ljava/util/List;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method K0(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/RomArchived;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/MyArchiveFragment_$z;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/MyArchiveFragment_$z;-><init>(Lcom/join/mgps/fragment/MyArchiveFragment_;Ljava/util/List;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method L0(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/MyArchiveFragment_$g;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/MyArchiveFragment_$g;-><init>(Lcom/join/mgps/fragment/MyArchiveFragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method M0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/MyArchiveFragment_$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/MyArchiveFragment_$c;-><init>(Lcom/join/mgps/fragment/MyArchiveFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x1f4

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method N0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/MyArchiveFragment_$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/MyArchiveFragment_$d;-><init>(Lcom/join/mgps/fragment/MyArchiveFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method Q0(Lcom/join/mgps/dto/CloudListDataBean;Lcom/join/mgps/listener/e;)V
    .locals 9

    .line 1
    new-instance v8, Lcom/join/mgps/fragment/MyArchiveFragment_$q;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v8

    move-object v1, p0

    move-object v6, p1

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/join/mgps/fragment/MyArchiveFragment_$q;-><init>(Lcom/join/mgps/fragment/MyArchiveFragment_;Ljava/lang/String;JLjava/lang/String;Lcom/join/mgps/dto/CloudListDataBean;Lcom/join/mgps/listener/e;)V

    invoke-static {v8}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method R0(Lcom/join/mgps/dto/CloudListDataBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/MyArchiveFragment_$h;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/MyArchiveFragment_$h;-><init>(Lcom/join/mgps/fragment/MyArchiveFragment_;Lcom/join/mgps/dto/CloudListDataBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method V()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/MyArchiveFragment_$t;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/MyArchiveFragment_$t;-><init>(Lcom/join/mgps/fragment/MyArchiveFragment_;)V

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
    iget-object v0, p0, Lcom/join/mgps/fragment/MyArchiveFragment_;->Z:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method i0(Lcom/join/mgps/dto/CloudListDataBean;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/fragment/MyArchiveFragment_$p;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/fragment/MyArchiveFragment_$p;-><init>(Lcom/join/mgps/fragment/MyArchiveFragment_;Ljava/lang/String;JLjava/lang/String;Lcom/join/mgps/dto/CloudListDataBean;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
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
    iget-object v0, p0, Lcom/join/mgps/fragment/MyArchiveFragment_;->Y:Landroid/view/View;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public m0(I)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/fragment/MyArchiveFragment_$m;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/fragment/MyArchiveFragment_$m;-><init>(Lcom/join/mgps/fragment/MyArchiveFragment_;Ljava/lang/String;JLjava/lang/String;I)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method public n0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/fragment/MyArchiveFragment_$n;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/MyArchiveFragment_$n;-><init>(Lcom/join/mgps/fragment/MyArchiveFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/MyArchiveFragment_;->X:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/MyArchiveFragment_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p3

    iput-object p3, p0, Lcom/join/mgps/fragment/MyArchiveFragment_;->Y:Landroid/view/View;

    if-nez p3, :cond_0

    const p3, 0x7f0c0369

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/MyArchiveFragment_;->Y:Landroid/view/View;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/MyArchiveFragment_;->Y:Landroid/view/View;

    return-object p1
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/fragment/MyArchiveFragment_;->Y:Landroid/view/View;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/fragment/MyArchiveFragment;->b:Landroid/widget/RelativeLayout;

    .line 4
    iput-object v0, p0, Lcom/join/mgps/fragment/MyArchiveFragment;->c:Landroid/widget/ImageView;

    .line 5
    iput-object v0, p0, Lcom/join/mgps/fragment/MyArchiveFragment;->d:Landroid/widget/TextView;

    .line 6
    iput-object v0, p0, Lcom/join/mgps/fragment/MyArchiveFragment;->e:Landroid/widget/Button;

    .line 7
    iput-object v0, p0, Lcom/join/mgps/fragment/MyArchiveFragment;->f:Landroid/widget/Button;

    .line 8
    iput-object v0, p0, Lcom/join/mgps/fragment/MyArchiveFragment;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    iput-object v0, p0, Lcom/join/mgps/fragment/MyArchiveFragment;->h:Landroid/widget/LinearLayout;

    .line 10
    iput-object v0, p0, Lcom/join/mgps/fragment/MyArchiveFragment;->i:Landroid/widget/LinearLayout;

    .line 11
    iput-object v0, p0, Lcom/join/mgps/fragment/MyArchiveFragment;->j:Landroid/widget/TextView;

    .line 12
    iput-object v0, p0, Lcom/join/mgps/fragment/MyArchiveFragment;->k:Landroid/widget/RelativeLayout;

    .line 13
    iput-object v0, p0, Lcom/join/mgps/fragment/MyArchiveFragment;->l:Landroid/widget/TextView;

    .line 14
    iput-object v0, p0, Lcom/join/mgps/fragment/MyArchiveFragment;->m:Landroid/widget/LinearLayout;

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 1

    const v0, 0x7f091190

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/MyArchiveFragment;->b:Landroid/widget/RelativeLayout;

    const v0, 0x7f090904

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/fragment/MyArchiveFragment;->c:Landroid/widget/ImageView;

    const v0, 0x7f091677

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/MyArchiveFragment;->d:Landroid/widget/TextView;

    const v0, 0x7f09022d

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/join/mgps/fragment/MyArchiveFragment;->e:Landroid/widget/Button;

    const v0, 0x7f090232

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/join/mgps/fragment/MyArchiveFragment;->f:Landroid/widget/Button;

    const v0, 0x7f0910c5

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Lcom/join/mgps/fragment/MyArchiveFragment;->g:Landroidx/recyclerview/widget/RecyclerView;

    const v0, 0x7f090d13

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/MyArchiveFragment;->h:Landroid/widget/LinearLayout;

    const v0, 0x7f090cd3

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/MyArchiveFragment;->i:Landroid/widget/LinearLayout;

    const v0, 0x7f09167b

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/MyArchiveFragment;->j:Landroid/widget/TextView;

    const v0, 0x7f09118b

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/MyArchiveFragment;->k:Landroid/widget/RelativeLayout;

    const v0, 0x7f09167f

    .line 11
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/MyArchiveFragment;->l:Landroid/widget/TextView;

    const v0, 0x7f090d04

    .line 12
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/join/mgps/fragment/MyArchiveFragment;->m:Landroid/widget/LinearLayout;

    .line 13
    iget-object p1, p0, Lcom/join/mgps/fragment/MyArchiveFragment;->i:Landroid/widget/LinearLayout;

    if-eqz p1, :cond_0

    .line 14
    new-instance v0, Lcom/join/mgps/fragment/MyArchiveFragment_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/MyArchiveFragment_$k;-><init>(Lcom/join/mgps/fragment/MyArchiveFragment_;)V

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/MyArchiveFragment;->f:Landroid/widget/Button;

    if-eqz p1, :cond_1

    .line 16
    new-instance v0, Lcom/join/mgps/fragment/MyArchiveFragment_$s;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/MyArchiveFragment_$s;-><init>(Lcom/join/mgps/fragment/MyArchiveFragment_;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/MyArchiveFragment;->afterViews()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/MyArchiveFragment_;->X:La4/c;

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
    iget-object v0, p0, Lcom/join/mgps/fragment/MyArchiveFragment_;->Z:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method r0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/MyArchiveFragment_$y;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/MyArchiveFragment_$y;-><init>(Lcom/join/mgps/fragment/MyArchiveFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method s0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/MyArchiveFragment_$x;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/MyArchiveFragment_$x;-><init>(Lcom/join/mgps/fragment/MyArchiveFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showMessage(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/MyArchiveFragment_$l;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/MyArchiveFragment_$l;-><init>(Lcom/join/mgps/fragment/MyArchiveFragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method u0(Ljava/util/List;)V
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
    new-instance v0, Lcom/join/mgps/fragment/MyArchiveFragment_$u;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/MyArchiveFragment_$u;-><init>(Lcom/join/mgps/fragment/MyArchiveFragment_;Ljava/util/List;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method updateUi(Ljava/util/List;)V
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
    new-instance v0, Lcom/join/mgps/fragment/MyArchiveFragment_$w;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/MyArchiveFragment_$w;-><init>(Lcom/join/mgps/fragment/MyArchiveFragment_;Ljava/util/List;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method z0(Ljava/util/List;ZLcom/join/mgps/fragment/MyArchiveFragment$w;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CloudListDataBean;",
            ">;Z",
            "Lcom/join/mgps/fragment/MyArchiveFragment$w;",
            ")V"
        }
    .end annotation

    .line 1
    new-instance v9, Lcom/join/mgps/fragment/MyArchiveFragment_$o;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v9

    move-object v1, p0

    move-object v6, p1

    move v7, p2

    move-object v8, p3

    invoke-direct/range {v0 .. v8}, Lcom/join/mgps/fragment/MyArchiveFragment_$o;-><init>(Lcom/join/mgps/fragment/MyArchiveFragment_;Ljava/lang/String;JLjava/lang/String;Ljava/util/List;ZLcom/join/mgps/fragment/MyArchiveFragment$w;)V

    invoke-static {v9}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method
