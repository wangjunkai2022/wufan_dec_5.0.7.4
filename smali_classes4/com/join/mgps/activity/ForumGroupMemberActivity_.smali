.class public final Lcom/join/mgps/activity/ForumGroupMemberActivity_;
.super Lcom/join/mgps/activity/ForumGroupMemberActivity;
.source "ForumGroupMemberActivity_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/ForumGroupMemberActivity_$j;
    }
.end annotation


# static fields
.field public static final u:Ljava/lang/String; = "gid"


# instance fields
.field private final q:La4/c;

.field private final r:Ljava/util/Map;
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

.field private final s:Landroid/content/IntentFilter;

.field private final t:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/ForumGroupMemberActivity;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/ForumGroupMemberActivity_;->q:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/ForumGroupMemberActivity_;->r:Ljava/util/Map;

    .line 4
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/ForumGroupMemberActivity_;->s:Landroid/content/IntentFilter;

    .line 5
    new-instance v0, Lcom/join/mgps/activity/ForumGroupMemberActivity_$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ForumGroupMemberActivity_$a;-><init>(Lcom/join/mgps/activity/ForumGroupMemberActivity_;)V

    iput-object v0, p0, Lcom/join/mgps/activity/ForumGroupMemberActivity_;->t:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic A0(Lcom/join/mgps/activity/ForumGroupMemberActivity_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ForumGroupMemberActivity;->j0(I)V

    return-void
.end method

.method public static B0(Landroid/content/Context;)Lcom/join/mgps/activity/ForumGroupMemberActivity_$j;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ForumGroupMemberActivity_$j;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ForumGroupMemberActivity_$j;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static C0(Landroidx/fragment/app/Fragment;)Lcom/join/mgps/activity/ForumGroupMemberActivity_$j;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ForumGroupMemberActivity_$j;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ForumGroupMemberActivity_$j;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/ForumGroupMemberActivity_;->injectExtras_()V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/ForumGroupMemberActivity_;->s:Landroid/content/IntentFilter;

    const-string v0, "com.join.android.app.mgsim.wufun.broadcast.refreshMyGame"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/ForumGroupMemberActivity_;->s:Landroid/content/IntentFilter;

    const-string v0, "com.join.android.app.mgsim.wufun.broadcast.paygamefinish"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 5
    iget-object p1, p0, Lcom/join/mgps/activity/ForumGroupMemberActivity_;->t:Landroid/content/BroadcastReceiver;

    iget-object v0, p0, Lcom/join/mgps/activity/ForumGroupMemberActivity_;->s:Landroid/content/IntentFilter;

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

    const-string v1, "gid"

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/join/mgps/activity/ForumGroupMemberActivity;->f:I

    :cond_0
    return-void
.end method

.method static synthetic u0(Lcom/join/mgps/activity/ForumGroupMemberActivity_;Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ForumGroupMemberActivity;->g0(Z)V

    return-void
.end method

.method static synthetic v0(Lcom/join/mgps/activity/ForumGroupMemberActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/ForumGroupMemberActivity;->t0()V

    return-void
.end method

.method static synthetic w0(Lcom/join/mgps/activity/ForumGroupMemberActivity_;ILcom/join/mgps/dto/ForumData$GroupFans;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/ForumGroupMemberActivity;->s0(ILcom/join/mgps/dto/ForumData$GroupFans;)V

    return-void
.end method

.method static synthetic x0(Lcom/join/mgps/activity/ForumGroupMemberActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ForumGroupMemberActivity;->f0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic y0(Lcom/join/mgps/activity/ForumGroupMemberActivity_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ForumGroupMemberActivity;->h0(I)V

    return-void
.end method

.method static synthetic z0(Lcom/join/mgps/activity/ForumGroupMemberActivity_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ForumGroupMemberActivity;->i0(I)V

    return-void
.end method


# virtual methods
.method f0(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ForumGroupMemberActivity_$f;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/ForumGroupMemberActivity_$f;-><init>(Lcom/join/mgps/activity/ForumGroupMemberActivity_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method g0(Z)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ForumGroupMemberActivity_$c;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/ForumGroupMemberActivity_$c;-><init>(Lcom/join/mgps/activity/ForumGroupMemberActivity_;Z)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/ForumGroupMemberActivity_;->r:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method h0(I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ForumGroupMemberActivity_$g;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/ForumGroupMemberActivity_$g;-><init>(Lcom/join/mgps/activity/ForumGroupMemberActivity_;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method i0(I)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/ForumGroupMemberActivity_$h;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/ForumGroupMemberActivity_$h;-><init>(Lcom/join/mgps/activity/ForumGroupMemberActivity_;Ljava/lang/String;JLjava/lang/String;I)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

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

.method j0(I)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/ForumGroupMemberActivity_$i;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/ForumGroupMemberActivity_$i;-><init>(Lcom/join/mgps/activity/ForumGroupMemberActivity_;Ljava/lang/String;JLjava/lang/String;I)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumGroupMemberActivity_;->q:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/ForumGroupMemberActivity_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    const p1, 0x7f0c05b1

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ForumGroupMemberActivity_;->setContentView(I)V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumGroupMemberActivity_;->t:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 2
    invoke-super {p0}, Lcom/join/mgps/activity/ForumGroupMemberActivity;->onDestroy()V

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 1

    const v0, 0x7f090c91

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/XListView2;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumGroupMemberActivity;->b:Lcom/join/mgps/customview/XListView2;

    const v0, 0x7f09060b

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumGroupMemberActivity;->c:Landroid/widget/TextView;

    const v0, 0x7f090d57

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/ForumLoadingView;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumGroupMemberActivity;->d:Lcom/join/mgps/customview/ForumLoadingView;

    const v0, 0x7f090146

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 5
    new-instance v0, Lcom/join/mgps/activity/ForumGroupMemberActivity_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ForumGroupMemberActivity_$b;-><init>(Lcom/join/mgps/activity/ForumGroupMemberActivity_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumGroupMemberActivity;->afterViews()V

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
    iget-object v0, p0, Lcom/join/mgps/activity/ForumGroupMemberActivity_;->r:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method s0(ILcom/join/mgps/dto/ForumData$GroupFans;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ForumGroupMemberActivity_$e;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/activity/ForumGroupMemberActivity_$e;-><init>(Lcom/join/mgps/activity/ForumGroupMemberActivity_;ILcom/join/mgps/dto/ForumData$GroupFans;)V

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
    iget-object p1, p0, Lcom/join/mgps/activity/ForumGroupMemberActivity_;->q:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 5
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->setContentView(Landroid/view/View;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/ForumGroupMemberActivity_;->q:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/ForumGroupMemberActivity_;->q:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/ForumGroupMemberActivity_;->injectExtras_()V

    return-void
.end method

.method t0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ForumGroupMemberActivity_$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ForumGroupMemberActivity_$d;-><init>(Lcom/join/mgps/activity/ForumGroupMemberActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
