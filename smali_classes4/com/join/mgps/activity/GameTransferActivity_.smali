.class public final Lcom/join/mgps/activity/GameTransferActivity_;
.super Lcom/join/mgps/activity/GameTransferActivity;
.source "GameTransferActivity_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/GameTransferActivity_$k;
    }
.end annotation


# static fields
.field public static final E1:Ljava/lang/String; = "Flag"


# instance fields
.field private final C1:La4/c;

.field private final D1:Ljava/util/Map;
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
    invoke-direct {p0}, Lcom/join/mgps/activity/GameTransferActivity;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/GameTransferActivity_;->C1:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/GameTransferActivity_;->D1:Ljava/util/Map;

    return-void
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    new-instance p1, Lcom/join/mgps/pref/PrefDef_;

    invoke-direct {p1, p0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/join/mgps/activity/GameTransferActivity;->z:Lcom/join/mgps/pref/PrefDef_;

    .line 2
    invoke-static {p0}, La4/c;->b(La4/b;)V

    const-string p1, "power"

    .line 3
    invoke-virtual {p0, p1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/PowerManager;

    iput-object p1, p0, Lcom/join/mgps/activity/GameTransferActivity;->R:Landroid/os/PowerManager;

    const/4 p1, 0x0

    .line 4
    invoke-static {p0, p1}, Lcom/join/mgps/adapter/GameTransferListAdapter_;->y(Landroid/content/Context;Ljava/lang/Object;)Lcom/join/mgps/adapter/GameTransferListAdapter_;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameTransferActivity;->e:Lcom/join/mgps/adapter/GameTransferListAdapter;

    .line 5
    invoke-static {p0, p1}, Lcom/join/mgps/adapter/GameTransferHistoryAdapter_;->x(Landroid/content/Context;Ljava/lang/Object;)Lcom/join/mgps/adapter/GameTransferHistoryAdapter_;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/GameTransferActivity;->g:Lcom/join/mgps/adapter/GameTransferHistoryAdapter;

    .line 6
    invoke-direct {p0}, Lcom/join/mgps/activity/GameTransferActivity_;->injectExtras_()V

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

    const-string v1, "Flag"

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/join/mgps/activity/GameTransferActivity;->r:I

    :cond_0
    return-void
.end method

.method static synthetic s1(Lcom/join/mgps/activity/GameTransferActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GameTransferActivity;->toast(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic t1(Lcom/join/mgps/activity/GameTransferActivity_;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GameTransferActivity;->k0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method

.method static synthetic u1(Lcom/join/mgps/activity/GameTransferActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameTransferActivity;->V0()V

    return-void
.end method

.method static synthetic v1(Lcom/join/mgps/activity/GameTransferActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameTransferActivity;->S0()V

    return-void
.end method

.method public static w1(Landroid/content/Context;)Lcom/join/mgps/activity/GameTransferActivity_$k;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameTransferActivity_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameTransferActivity_$k;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static x1(Landroidx/fragment/app/Fragment;)Lcom/join/mgps/activity/GameTransferActivity_$k;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameTransferActivity_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameTransferActivity_$k;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
.end method


# virtual methods
.method S0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/GameTransferActivity_$a;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/GameTransferActivity_$a;-><init>(Lcom/join/mgps/activity/GameTransferActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method V0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameTransferActivity_$j;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameTransferActivity_$j;-><init>(Lcom/join/mgps/activity/GameTransferActivity_;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/GameTransferActivity_;->D1:Ljava/util/Map;

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
    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method k0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameTransferActivity_$i;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/GameTransferActivity_$i;-><init>(Lcom/join/mgps/activity/GameTransferActivity_;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameTransferActivity_;->C1:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/GameTransferActivity_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Lcom/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    const p1, 0x7f0c005b

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/GameTransferActivity_;->setContentView(I)V

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 3

    const v0, 0x7f090695

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameTransferActivity;->b:Landroid/widget/TextView;

    const v0, 0x7f090693

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameTransferActivity;->c:Landroid/widget/TextView;

    const v0, 0x7f090691

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameTransferActivity;->d:Landroidx/recyclerview/widget/RecyclerView;

    const v0, 0x7f090686

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameTransferActivity;->f:Landroidx/recyclerview/widget/RecyclerView;

    const v0, 0x7f090683

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameTransferActivity;->h:Landroid/widget/TextView;

    const v0, 0x7f090684

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameTransferActivity;->k:Landroid/widget/TextView;

    const v0, 0x7f090692

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/join/mgps/activity/GameTransferActivity;->l:Landroid/widget/Button;

    const v0, 0x7f090694

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameTransferActivity;->m:Landroid/widget/TextView;

    const v0, 0x7f09068d

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameTransferActivity;->n:Landroid/widget/TextView;

    const v0, 0x7f090687

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GameTransferActivity;->p:Landroid/widget/RelativeLayout;

    const v0, 0x7f09068e

    .line 11
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f090680

    .line 12
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    .line 13
    iget-object v1, p0, Lcom/join/mgps/activity/GameTransferActivity;->h:Landroid/widget/TextView;

    if-eqz v1, :cond_0

    .line 14
    new-instance v2, Lcom/join/mgps/activity/GameTransferActivity_$b;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/GameTransferActivity_$b;-><init>(Lcom/join/mgps/activity/GameTransferActivity_;)V

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/activity/GameTransferActivity;->k:Landroid/widget/TextView;

    if-eqz v1, :cond_1

    .line 16
    new-instance v2, Lcom/join/mgps/activity/GameTransferActivity_$c;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/GameTransferActivity_$c;-><init>(Lcom/join/mgps/activity/GameTransferActivity_;)V

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    :cond_1
    iget-object v1, p0, Lcom/join/mgps/activity/GameTransferActivity;->l:Landroid/widget/Button;

    if-eqz v1, :cond_2

    .line 18
    new-instance v2, Lcom/join/mgps/activity/GameTransferActivity_$d;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/GameTransferActivity_$d;-><init>(Lcom/join/mgps/activity/GameTransferActivity_;)V

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    if-eqz v0, :cond_3

    .line 19
    new-instance v1, Lcom/join/mgps/activity/GameTransferActivity_$e;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/GameTransferActivity_$e;-><init>(Lcom/join/mgps/activity/GameTransferActivity_;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/activity/GameTransferActivity;->n:Landroid/widget/TextView;

    if-eqz v0, :cond_4

    .line 21
    new-instance v1, Lcom/join/mgps/activity/GameTransferActivity_$f;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/GameTransferActivity_$f;-><init>(Lcom/join/mgps/activity/GameTransferActivity_;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_4
    if-eqz p1, :cond_5

    .line 22
    new-instance v0, Lcom/join/mgps/activity/GameTransferActivity_$g;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameTransferActivity_$g;-><init>(Lcom/join/mgps/activity/GameTransferActivity_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 23
    :cond_5
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameTransferActivity;->u0()V

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
    iget-object v0, p0, Lcom/join/mgps/activity/GameTransferActivity_;->D1:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/BaseActivity;->setContentView(I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/GameTransferActivity_;->C1:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 5
    invoke-super {p0, p1}, Lcom/BaseActivity;->setContentView(Landroid/view/View;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/GameTransferActivity_;->C1:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroidx/activity/ComponentActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/GameTransferActivity_;->C1:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/GameTransferActivity_;->injectExtras_()V

    return-void
.end method

.method toast(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameTransferActivity_$h;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/GameTransferActivity_$h;-><init>(Lcom/join/mgps/activity/GameTransferActivity_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
