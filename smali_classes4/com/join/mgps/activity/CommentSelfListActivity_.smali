.class public final Lcom/join/mgps/activity/CommentSelfListActivity_;
.super Lcom/join/mgps/activity/CommentSelfListActivity;
.source "CommentSelfListActivity_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/CommentSelfListActivity_$r;
    }
.end annotation


# static fields
.field public static final C:Ljava/lang/String; = "uid"


# instance fields
.field private final A:Landroid/content/BroadcastReceiver;

.field private final B:Landroid/content/BroadcastReceiver;

.field private final x:La4/c;

.field private final y:Ljava/util/Map;
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

.field private final z:Landroid/content/IntentFilter;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/CommentSelfListActivity;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/CommentSelfListActivity_;->x:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/CommentSelfListActivity_;->y:Ljava/util/Map;

    .line 4
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/CommentSelfListActivity_;->z:Landroid/content/IntentFilter;

    .line 5
    new-instance v0, Lcom/join/mgps/activity/CommentSelfListActivity_$i;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CommentSelfListActivity_$i;-><init>(Lcom/join/mgps/activity/CommentSelfListActivity_;)V

    iput-object v0, p0, Lcom/join/mgps/activity/CommentSelfListActivity_;->A:Landroid/content/BroadcastReceiver;

    .line 6
    new-instance v0, Lcom/join/mgps/activity/CommentSelfListActivity_$j;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CommentSelfListActivity_$j;-><init>(Lcom/join/mgps/activity/CommentSelfListActivity_;)V

    iput-object v0, p0, Lcom/join/mgps/activity/CommentSelfListActivity_;->B:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic E0(Lcom/join/mgps/activity/CommentSelfListActivity_;Lcom/join/mgps/dto/FavoritesCenterData;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/CommentSelfListActivity;->C0(Lcom/join/mgps/dto/FavoritesCenterData;)V

    return-void
.end method

.method static synthetic F0(Lcom/join/mgps/activity/CommentSelfListActivity_;ILjava/lang/String;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/join/mgps/activity/CommentSelfListActivity;->j0(ILjava/lang/String;I)V

    return-void
.end method

.method static synthetic G0(Lcom/join/mgps/activity/CommentSelfListActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/CommentSelfListActivity;->f0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic H0(Lcom/join/mgps/activity/CommentSelfListActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/CommentSelfListActivity;->q0()V

    return-void
.end method

.method static synthetic I0(Lcom/join/mgps/activity/CommentSelfListActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/CommentSelfListActivity;->A0()V

    return-void
.end method

.method static synthetic J0(Lcom/join/mgps/activity/CommentSelfListActivity_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/CommentSelfListActivity;->i0(I)V

    return-void
.end method

.method static synthetic K0(Lcom/join/mgps/activity/CommentSelfListActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/CommentSelfListActivity;->y0()V

    return-void
.end method

.method static synthetic L0(Lcom/join/mgps/activity/CommentSelfListActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/CommentSelfListActivity;->showMessage(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic M0(Lcom/join/mgps/activity/CommentSelfListActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/CommentSelfListActivity;->getData()V

    return-void
.end method

.method static synthetic N0(Lcom/join/mgps/activity/CommentSelfListActivity_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/CommentSelfListActivity;->l0(I)V

    return-void
.end method

.method static synthetic O0(Lcom/join/mgps/activity/CommentSelfListActivity_;ILjava/lang/String;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/join/mgps/activity/CommentSelfListActivity;->r0(ILjava/lang/String;I)V

    return-void
.end method

.method public static P0(Landroid/content/Context;)Lcom/join/mgps/activity/CommentSelfListActivity_$r;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CommentSelfListActivity_$r;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CommentSelfListActivity_$r;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static Q0(Landroidx/fragment/app/Fragment;)Lcom/join/mgps/activity/CommentSelfListActivity_$r;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CommentSelfListActivity_$r;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CommentSelfListActivity_$r;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    new-instance p1, Lcom/join/mgps/pref/PrefDef_;

    invoke-direct {p1, p0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/join/mgps/activity/CommentSelfListActivity;->m:Lcom/join/mgps/pref/PrefDef_;

    .line 2
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 3
    invoke-direct {p0}, Lcom/join/mgps/activity/CommentSelfListActivity_;->injectExtras_()V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/CommentSelfListActivity_;->z:Landroid/content/IntentFilter;

    const-string v0, "com.join.android.app.mgsim.wufun.broadcast.action_login_out"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 5
    iget-object p1, p0, Lcom/join/mgps/activity/CommentSelfListActivity_;->A:Landroid/content/BroadcastReceiver;

    iget-object v0, p0, Lcom/join/mgps/activity/CommentSelfListActivity_;->z:Landroid/content/IntentFilter;

    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/CommentSelfListActivity_;->B:Landroid/content/BroadcastReceiver;

    iget-object v0, p0, Lcom/join/mgps/activity/CommentSelfListActivity_;->z:Landroid/content/IntentFilter;

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

    const-string v1, "uid"

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/join/mgps/activity/CommentSelfListActivity;->n:I

    :cond_0
    return-void
.end method


# virtual methods
.method A0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CommentSelfListActivity_$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CommentSelfListActivity_$a;-><init>(Lcom/join/mgps/activity/CommentSelfListActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method C0(Lcom/join/mgps/dto/FavoritesCenterData;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CommentSelfListActivity_$o;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/CommentSelfListActivity_$o;-><init>(Lcom/join/mgps/activity/CommentSelfListActivity_;Lcom/join/mgps/dto/FavoritesCenterData;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method f0(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CommentSelfListActivity_$p;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/CommentSelfListActivity_$p;-><init>(Lcom/join/mgps/activity/CommentSelfListActivity_;Ljava/lang/String;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/CommentSelfListActivity_;->y:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method getData()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/CommentSelfListActivity_$e;

    const-string v2, ""

    const-wide/16 v3, 0x64

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/CommentSelfListActivity_$e;-><init>(Lcom/join/mgps/activity/CommentSelfListActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method i0(I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CommentSelfListActivity_$b;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/CommentSelfListActivity_$b;-><init>(Lcom/join/mgps/activity/CommentSelfListActivity_;I)V

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

.method j0(ILjava/lang/String;I)V
    .locals 10

    .line 1
    new-instance v9, Lcom/join/mgps/activity/CommentSelfListActivity_$h;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v9

    move-object v1, p0

    move v6, p1

    move-object v7, p2

    move v8, p3

    invoke-direct/range {v0 .. v8}, Lcom/join/mgps/activity/CommentSelfListActivity_$h;-><init>(Lcom/join/mgps/activity/CommentSelfListActivity_;Ljava/lang/String;JLjava/lang/String;ILjava/lang/String;I)V

    invoke-static {v9}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method l0(I)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/CommentSelfListActivity_$f;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/CommentSelfListActivity_$f;-><init>(Lcom/join/mgps/activity/CommentSelfListActivity_;Ljava/lang/String;JLjava/lang/String;I)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CommentSelfListActivity_;->x:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/CommentSelfListActivity_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    const p1, 0x7f0c002d

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/CommentSelfListActivity_;->setContentView(I)V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CommentSelfListActivity_;->A:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/CommentSelfListActivity_;->B:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 3
    invoke-super {p0}, Lcom/join/mgps/activity/CommentSelfListActivity;->onDestroy()V

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 1

    const v0, 0x7f090089

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/CommentSelfListActivity;->b:Landroid/widget/RelativeLayout;

    const v0, 0x7f090eed

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/CommentSelfListActivity;->c:Landroid/widget/RelativeLayout;

    const v0, 0x7f090146

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/CommentSelfListActivity;->d:Landroid/widget/ImageView;

    const v0, 0x7f090134

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/CommentSelfListActivity;->e:Landroid/widget/ImageView;

    const v0, 0x7f091266

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/CommentSelfListActivity;->f:Landroid/view/View;

    const v0, 0x7f091267

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/CommentSelfListActivity;->g:Landroid/view/View;

    const v0, 0x7f090c97

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/XListView2;

    iput-object v0, p0, Lcom/join/mgps/activity/CommentSelfListActivity;->h:Lcom/join/mgps/customview/XListView2;

    const v0, 0x7f091478

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/CommentSelfListActivity;->i:Landroid/view/View;

    const v0, 0x7f090d57

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/customview/ForumLoadingView;

    iput-object p1, p0, Lcom/join/mgps/activity/CommentSelfListActivity;->j:Lcom/join/mgps/customview/ForumLoadingView;

    .line 10
    iget-object p1, p0, Lcom/join/mgps/activity/CommentSelfListActivity;->f:Landroid/view/View;

    if-eqz p1, :cond_0

    .line 11
    new-instance v0, Lcom/join/mgps/activity/CommentSelfListActivity_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CommentSelfListActivity_$k;-><init>(Lcom/join/mgps/activity/CommentSelfListActivity_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 12
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/CommentSelfListActivity;->g:Landroid/view/View;

    if-eqz p1, :cond_1

    .line 13
    new-instance v0, Lcom/join/mgps/activity/CommentSelfListActivity_$l;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CommentSelfListActivity_$l;-><init>(Lcom/join/mgps/activity/CommentSelfListActivity_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 14
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/activity/CommentSelfListActivity;->e:Landroid/widget/ImageView;

    if-eqz p1, :cond_2

    .line 15
    new-instance v0, Lcom/join/mgps/activity/CommentSelfListActivity_$m;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CommentSelfListActivity_$m;-><init>(Lcom/join/mgps/activity/CommentSelfListActivity_;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 16
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/activity/CommentSelfListActivity;->d:Landroid/widget/ImageView;

    if-eqz p1, :cond_3

    .line 17
    new-instance v0, Lcom/join/mgps/activity/CommentSelfListActivity_$n;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CommentSelfListActivity_$n;-><init>(Lcom/join/mgps/activity/CommentSelfListActivity_;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 18
    :cond_3
    invoke-virtual {p0}, Lcom/join/mgps/activity/CommentSelfListActivity;->afterViews()V

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
    iget-object v0, p0, Lcom/join/mgps/activity/CommentSelfListActivity_;->y:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method q0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CommentSelfListActivity_$q;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CommentSelfListActivity_$q;-><init>(Lcom/join/mgps/activity/CommentSelfListActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method r0(ILjava/lang/String;I)V
    .locals 10

    .line 1
    new-instance v9, Lcom/join/mgps/activity/CommentSelfListActivity_$g;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v9

    move-object v1, p0

    move v6, p1

    move-object v7, p2

    move v8, p3

    invoke-direct/range {v0 .. v8}, Lcom/join/mgps/activity/CommentSelfListActivity_$g;-><init>(Lcom/join/mgps/activity/CommentSelfListActivity_;Ljava/lang/String;JLjava/lang/String;ILjava/lang/String;I)V

    invoke-static {v9}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->setContentView(I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/CommentSelfListActivity_;->x:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 5
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->setContentView(Landroid/view/View;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/CommentSelfListActivity_;->x:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/CommentSelfListActivity_;->x:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/CommentSelfListActivity_;->injectExtras_()V

    return-void
.end method

.method showMessage(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CommentSelfListActivity_$d;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/CommentSelfListActivity_$d;-><init>(Lcom/join/mgps/activity/CommentSelfListActivity_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method y0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CommentSelfListActivity_$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CommentSelfListActivity_$c;-><init>(Lcom/join/mgps/activity/CommentSelfListActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
