.class public final Lcom/join/mgps/activity/SearchListActivity1_;
.super Lcom/join/mgps/activity/SearchListActivity1;
.source "SearchListActivity1_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/SearchListActivity1_$r;
    }
.end annotation


# static fields
.field public static final Q:Ljava/lang/String; = "currentTab"

.field public static final R:Ljava/lang/String; = "game_id"

.field public static final S:Ljava/lang/String; = "keyword"

.field public static final T:Ljava/lang/String; = "isNeedRecommend"

.field public static final U:Ljava/lang/String; = "from"


# instance fields
.field private final O:La4/c;

.field private final P:Ljava/util/Map;
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
    invoke-direct {p0}, Lcom/join/mgps/activity/SearchListActivity1;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/SearchListActivity1_;->O:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/SearchListActivity1_;->P:Ljava/util/Map;

    return-void
.end method

.method static synthetic S0(Lcom/join/mgps/activity/SearchListActivity1_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/SearchListActivity1;->w0()V

    return-void
.end method

.method static synthetic T0(Lcom/join/mgps/activity/SearchListActivity1_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/SearchListActivity1;->r0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic U0(Lcom/join/mgps/activity/SearchListActivity1_;Lcom/join/mgps/dto/SearchGameListBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/SearchListActivity1;->Q0(Lcom/join/mgps/dto/SearchGameListBean;)V

    return-void
.end method

.method static synthetic V0(Lcom/join/mgps/activity/SearchListActivity1_;Lcom/join/mgps/dto/ClassfyTypeBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/SearchListActivity1;->K0(Lcom/join/mgps/dto/ClassfyTypeBean;)V

    return-void
.end method

.method static synthetic W0(Lcom/join/mgps/activity/SearchListActivity1_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/SearchListActivity1;->O0(I)V

    return-void
.end method

.method static synthetic X0(Lcom/join/mgps/activity/SearchListActivity1_;Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/SearchListActivity1;->u0(Z)V

    return-void
.end method

.method static synthetic Y0(Lcom/join/mgps/activity/SearchListActivity1_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/SearchListActivity1;->h0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic Z0(Lcom/join/mgps/activity/SearchListActivity1_;Ljava/util/List;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/SearchListActivity1;->R0(Ljava/util/List;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a1(Lcom/join/mgps/activity/SearchListActivity1_;IZ)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/SearchListActivity1;->s0(IZ)V

    return-void
.end method

.method static synthetic b1(Lcom/join/mgps/activity/SearchListActivity1_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/SearchListActivity1;->D0()V

    return-void
.end method

.method static synthetic c1(Lcom/join/mgps/activity/SearchListActivity1_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/SearchListActivity1;->H0()V

    return-void
.end method

.method public static d1(Landroid/content/Context;)Lcom/join/mgps/activity/SearchListActivity1_$r;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/SearchListActivity1_$r;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/SearchListActivity1_$r;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static e1(Landroidx/fragment/app/Fragment;)Lcom/join/mgps/activity/SearchListActivity1_$r;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/SearchListActivity1_$r;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/SearchListActivity1_$r;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/SearchListActivity1_;->injectExtras_()V

    return-void
.end method

.method private injectExtras_()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_4

    const-string v1, "currentTab"

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/join/mgps/activity/SearchListActivity1;->p:I

    :cond_0
    const-string v1, "game_id"

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/SearchListActivity1;->q:Ljava/lang/String;

    :cond_1
    const-string v1, "keyword"

    .line 6
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 7
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/SearchListActivity1;->r:Ljava/lang/String;

    :cond_2
    const-string v1, "isNeedRecommend"

    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 9
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/join/mgps/activity/SearchListActivity1;->s:Z

    :cond_3
    const-string v1, "from"

    .line 10
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 11
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/join/mgps/activity/SearchListActivity1;->t:I

    :cond_4
    return-void
.end method


# virtual methods
.method D0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/SearchListActivity1_$f;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/SearchListActivity1_$f;-><init>(Lcom/join/mgps/activity/SearchListActivity1_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method H0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/SearchListActivity1_$g;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/SearchListActivity1_$g;-><init>(Lcom/join/mgps/activity/SearchListActivity1_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method K0(Lcom/join/mgps/dto/ClassfyTypeBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/SearchListActivity1_$q;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/SearchListActivity1_$q;-><init>(Lcom/join/mgps/activity/SearchListActivity1_;Lcom/join/mgps/dto/ClassfyTypeBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method O0(I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/SearchListActivity1_$a;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/SearchListActivity1_$a;-><init>(Lcom/join/mgps/activity/SearchListActivity1_;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method Q0(Lcom/join/mgps/dto/SearchGameListBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/SearchListActivity1_$p;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/SearchListActivity1_$p;-><init>(Lcom/join/mgps/activity/SearchListActivity1_;Lcom/join/mgps/dto/SearchGameListBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method R0(Ljava/util/List;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/SearchAutoDataBean;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/activity/SearchListActivity1_$d;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/activity/SearchListActivity1_$d;-><init>(Lcom/join/mgps/activity/SearchListActivity1_;Ljava/util/List;Ljava/lang/String;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/SearchListActivity1_;->P:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method h0(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/SearchListActivity1_$c;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/SearchListActivity1_$c;-><init>(Lcom/join/mgps/activity/SearchListActivity1_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/SearchListActivity1_;->O:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/SearchListActivity1_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Lcom/join/mgps/activity/SearchListActivity1;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    const p1, 0x7f0c0734

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/SearchListActivity1_;->setContentView(I)V

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 4

    const v0, 0x7f09031e

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/SearchListActivity1;->b:Landroid/view/View;

    const v0, 0x7f091366

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/SearchListActivity1;->c:Landroid/view/View;

    const v0, 0x7f090bfe

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/zhy/view/flowlayout/TagFlowLayout3;

    iput-object v0, p0, Lcom/join/mgps/activity/SearchListActivity1;->d:Lcom/zhy/view/flowlayout/TagFlowLayout3;

    const v0, 0x7f090314

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/zhy/view/flowlayout/TagFlowLayout3;

    iput-object v0, p0, Lcom/join/mgps/activity/SearchListActivity1;->e:Lcom/zhy/view/flowlayout/TagFlowLayout3;

    const v0, 0x7f090872

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/join/mgps/activity/SearchListActivity1;->f:Landroid/widget/EditText;

    const v0, 0x7f091356

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/tabs/TabLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/SearchListActivity1;->g:Lcom/google/android/material/tabs/TabLayout;

    const v0, 0x7f0917b0

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/viewpager/widget/ViewPager;

    iput-object v0, p0, Lcom/join/mgps/activity/SearchListActivity1;->h:Landroidx/viewpager/widget/ViewPager;

    const v0, 0x7f090128

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/join/mgps/activity/SearchListActivity1;->i:Landroid/widget/ListView;

    const v0, 0x7f09092b

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/SearchListActivity1;->j:Landroid/widget/ImageView;

    const v0, 0x7f090cf0

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/SearchListActivity1;->k:Landroid/widget/LinearLayout;

    const v0, 0x7f090134

    .line 11
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/SearchListActivity1;->l:Landroid/widget/ImageView;

    const v0, 0x7f091211

    .line 12
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0915d5

    .line 13
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f0915d6

    .line 14
    invoke-interface {p1, v2}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    .line 15
    iget-object v2, p0, Lcom/join/mgps/activity/SearchListActivity1;->l:Landroid/widget/ImageView;

    if-eqz v2, :cond_0

    .line 16
    new-instance v3, Lcom/join/mgps/activity/SearchListActivity1_$i;

    invoke-direct {v3, p0}, Lcom/join/mgps/activity/SearchListActivity1_$i;-><init>(Lcom/join/mgps/activity/SearchListActivity1_;)V

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    if-eqz v0, :cond_1

    .line 17
    new-instance v2, Lcom/join/mgps/activity/SearchListActivity1_$j;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/SearchListActivity1_$j;-><init>(Lcom/join/mgps/activity/SearchListActivity1_;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 18
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/SearchListActivity1;->b:Landroid/view/View;

    if-eqz v0, :cond_2

    .line 19
    new-instance v2, Lcom/join/mgps/activity/SearchListActivity1_$k;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/SearchListActivity1_$k;-><init>(Lcom/join/mgps/activity/SearchListActivity1_;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/SearchListActivity1;->j:Landroid/widget/ImageView;

    if-eqz v0, :cond_3

    .line 21
    new-instance v2, Lcom/join/mgps/activity/SearchListActivity1_$l;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/SearchListActivity1_$l;-><init>(Lcom/join/mgps/activity/SearchListActivity1_;)V

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_3
    if-eqz v1, :cond_4

    .line 22
    new-instance v0, Lcom/join/mgps/activity/SearchListActivity1_$m;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/SearchListActivity1_$m;-><init>(Lcom/join/mgps/activity/SearchListActivity1_;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_4
    if-eqz p1, :cond_5

    .line 23
    new-instance v0, Lcom/join/mgps/activity/SearchListActivity1_$n;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/SearchListActivity1_$n;-><init>(Lcom/join/mgps/activity/SearchListActivity1_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 24
    :cond_5
    invoke-virtual {p0}, Lcom/join/mgps/activity/SearchListActivity1;->afterViews()V

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
    iget-object v0, p0, Lcom/join/mgps/activity/SearchListActivity1_;->P:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method r0(Ljava/lang/String;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/SearchListActivity1_$h;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/SearchListActivity1_$h;-><init>(Lcom/join/mgps/activity/SearchListActivity1_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method s0(IZ)V
    .locals 9

    .line 1
    new-instance v8, Lcom/join/mgps/activity/SearchListActivity1_$e;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v8

    move-object v1, p0

    move v6, p1

    move v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/join/mgps/activity/SearchListActivity1_$e;-><init>(Lcom/join/mgps/activity/SearchListActivity1_;Ljava/lang/String;JLjava/lang/String;IZ)V

    invoke-static {v8}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->setContentView(I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/SearchListActivity1_;->O:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 5
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->setContentView(Landroid/view/View;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/SearchListActivity1_;->O:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/SearchListActivity1_;->O:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/SearchListActivity1_;->injectExtras_()V

    return-void
.end method

.method u0(Z)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/SearchListActivity1_$b;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/SearchListActivity1_$b;-><init>(Lcom/join/mgps/activity/SearchListActivity1_;Z)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method w0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/SearchListActivity1_$o;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/SearchListActivity1_$o;-><init>(Lcom/join/mgps/activity/SearchListActivity1_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
