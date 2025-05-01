.class public final Lcom/join/mgps/activity/CreateEndGameCommitActivity_;
.super Lcom/join/mgps/activity/CreateEndGameCommitActivity;
.source "CreateEndGameCommitActivity_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/CreateEndGameCommitActivity_$q;
    }
.end annotation


# static fields
.field public static final E:Ljava/lang/String; = "gameId"

.field public static final F:Ljava/lang/String; = "bossBean"

.field public static final G:Ljava/lang/String; = "archiveBean"

.field public static final H:Ljava/lang/String; = "time"


# instance fields
.field private final C:La4/c;

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


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity_;->C:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity_;->D:Ljava/util/Map;

    return-void
.end method

.method static synthetic B0(Lcom/join/mgps/activity/CreateEndGameCommitActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->o0()V

    return-void
.end method

.method static synthetic C0(Lcom/join/mgps/activity/CreateEndGameCommitActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->i0()V

    return-void
.end method

.method static synthetic D0(Lcom/join/mgps/activity/CreateEndGameCommitActivity_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->v0(I)V

    return-void
.end method

.method static synthetic E0(Lcom/join/mgps/activity/CreateEndGameCommitActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->k0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic F0(Lcom/join/mgps/activity/CreateEndGameCommitActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->p0()V

    return-void
.end method

.method static synthetic G0(Lcom/join/mgps/activity/CreateEndGameCommitActivity_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->y0(I)V

    return-void
.end method

.method static synthetic H0(Lcom/join/mgps/activity/CreateEndGameCommitActivity_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->w0(I)V

    return-void
.end method

.method static synthetic I0(Lcom/join/mgps/activity/CreateEndGameCommitActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->z0()V

    return-void
.end method

.method static synthetic J0(Lcom/join/mgps/activity/CreateEndGameCommitActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->m0()V

    return-void
.end method

.method static synthetic K0(Lcom/join/mgps/activity/CreateEndGameCommitActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->q0()V

    return-void
.end method

.method static synthetic L0(Lcom/join/mgps/activity/CreateEndGameCommitActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->showToast(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic M0(Lcom/join/mgps/activity/CreateEndGameCommitActivity_;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->A0(Ljava/lang/String;I)V

    return-void
.end method

.method public static N0(Landroid/content/Context;)Lcom/join/mgps/activity/CreateEndGameCommitActivity_$q;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CreateEndGameCommitActivity_$q;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CreateEndGameCommitActivity_$q;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static O0(Landroidx/fragment/app/Fragment;)Lcom/join/mgps/activity/CreateEndGameCommitActivity_$q;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CreateEndGameCommitActivity_$q;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CreateEndGameCommitActivity_$q;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/CreateEndGameCommitActivity_;->injectExtras_()V

    return-void
.end method

.method private injectExtras_()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_3

    const-string v1, "gameId"

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->b:Ljava/lang/String;

    :cond_0
    const-string v1, "bossBean"

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/BossBean;

    iput-object v1, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->c:Lcom/join/mgps/dto/BossBean;

    :cond_1
    const-string v1, "archiveBean"

    .line 6
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 7
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/ArchiveListBean;

    iput-object v1, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->d:Lcom/join/mgps/dto/ArchiveListBean;

    :cond_2
    const-string v1, "time"

    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 9
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    iput-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->f:Ljava/lang/Long;

    :cond_3
    return-void
.end method


# virtual methods
.method A0(Ljava/lang/String;I)V
    .locals 9

    .line 1
    new-instance v8, Lcom/join/mgps/activity/CreateEndGameCommitActivity_$e;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v8

    move-object v1, p0

    move-object v6, p1

    move v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/join/mgps/activity/CreateEndGameCommitActivity_$e;-><init>(Lcom/join/mgps/activity/CreateEndGameCommitActivity_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;I)V

    invoke-static {v8}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity_;->D:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method i0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/CreateEndGameCommitActivity_$f;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/CreateEndGameCommitActivity_$f;-><init>(Lcom/join/mgps/activity/CreateEndGameCommitActivity_;Ljava/lang/String;JLjava/lang/String;)V

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

.method k0(Ljava/lang/String;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/CreateEndGameCommitActivity_$g;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/CreateEndGameCommitActivity_$g;-><init>(Lcom/join/mgps/activity/CreateEndGameCommitActivity_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method m0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CreateEndGameCommitActivity_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CreateEndGameCommitActivity_$b;-><init>(Lcom/join/mgps/activity/CreateEndGameCommitActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method o0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CreateEndGameCommitActivity_$l;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CreateEndGameCommitActivity_$l;-><init>(Lcom/join/mgps/activity/CreateEndGameCommitActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity_;->C:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/CreateEndGameCommitActivity_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    const p1, 0x7f0c0032

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/CreateEndGameCommitActivity_;->setContentView(I)V

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 3

    const v0, 0x7f090502

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->g:Landroid/widget/EditText;

    const v0, 0x7f0904fd

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->h:Landroid/widget/EditText;

    const v0, 0x7f091350

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/component/video/StandardVideoView;

    iput-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->i:Lcom/join/android/app/component/video/StandardVideoView;

    const v0, 0x7f090cdf

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->j:Landroid/widget/LinearLayout;

    const v0, 0x7f090976

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->k:Landroid/widget/ImageView;

    const v0, 0x7f091194

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->l:Landroid/widget/RelativeLayout;

    const v0, 0x7f09090f

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0915af

    .line 8
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f090925

    .line 9
    invoke-interface {p1, v2}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz v0, :cond_0

    .line 10
    new-instance v2, Lcom/join/mgps/activity/CreateEndGameCommitActivity_$h;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/CreateEndGameCommitActivity_$h;-><init>(Lcom/join/mgps/activity/CreateEndGameCommitActivity_;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    if-eqz v1, :cond_1

    .line 11
    new-instance v0, Lcom/join/mgps/activity/CreateEndGameCommitActivity_$i;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CreateEndGameCommitActivity_$i;-><init>(Lcom/join/mgps/activity/CreateEndGameCommitActivity_;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    if-eqz p1, :cond_2

    .line 12
    new-instance v0, Lcom/join/mgps/activity/CreateEndGameCommitActivity_$j;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CreateEndGameCommitActivity_$j;-><init>(Lcom/join/mgps/activity/CreateEndGameCommitActivity_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 13
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->j:Landroid/widget/LinearLayout;

    if-eqz p1, :cond_3

    .line 14
    new-instance v0, Lcom/join/mgps/activity/CreateEndGameCommitActivity_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CreateEndGameCommitActivity_$k;-><init>(Lcom/join/mgps/activity/CreateEndGameCommitActivity_;)V

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    :cond_3
    invoke-virtual {p0}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->afterViews()V

    return-void
.end method

.method p0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CreateEndGameCommitActivity_$n;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CreateEndGameCommitActivity_$n;-><init>(Lcom/join/mgps/activity/CreateEndGameCommitActivity_;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity_;->D:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method q0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CreateEndGameCommitActivity_$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CreateEndGameCommitActivity_$c;-><init>(Lcom/join/mgps/activity/CreateEndGameCommitActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->setContentView(I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity_;->C:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 5
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->setContentView(Landroid/view/View;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity_;->C:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity_;->C:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/CreateEndGameCommitActivity_;->injectExtras_()V

    return-void
.end method

.method showToast(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CreateEndGameCommitActivity_$d;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/CreateEndGameCommitActivity_$d;-><init>(Lcom/join/mgps/activity/CreateEndGameCommitActivity_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method v0(I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CreateEndGameCommitActivity_$m;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/CreateEndGameCommitActivity_$m;-><init>(Lcom/join/mgps/activity/CreateEndGameCommitActivity_;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method w0(I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CreateEndGameCommitActivity_$p;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/CreateEndGameCommitActivity_$p;-><init>(Lcom/join/mgps/activity/CreateEndGameCommitActivity_;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method y0(I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CreateEndGameCommitActivity_$o;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/CreateEndGameCommitActivity_$o;-><init>(Lcom/join/mgps/activity/CreateEndGameCommitActivity_;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method z0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CreateEndGameCommitActivity_$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CreateEndGameCommitActivity_$a;-><init>(Lcom/join/mgps/activity/CreateEndGameCommitActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
