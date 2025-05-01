.class public final Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_;
.super Lcom/join/mgps/activity/arena/NewArenaDownloadActivity;
.source "NewArenaDownloadActivity_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_$m;
    }
.end annotation


# static fields
.field public static final O:Ljava/lang/String; = "gameId"

.field public static final P:Ljava/lang/String; = "hasPlug"

.field public static final Q:Ljava/lang/String; = "hasRom"

.field public static final R:Ljava/lang/String; = "from"


# instance fields
.field private final M:La4/c;

.field private final N:Ljava/util/Map;
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
    invoke-direct {p0}, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_;->M:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_;->N:Ljava/util/Map;

    return-void
.end method

.method public static A(Landroid/content/Context;)Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_$m;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_$m;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_$m;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static B(Landroidx/fragment/app/Fragment;)Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_$m;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_$m;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_$m;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
.end method

.method static synthetic q(Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity;->e()V

    return-void
.end method

.method static synthetic r(Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity;->f()V

    return-void
.end method

.method static synthetic s(Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity;->p()V

    return-void
.end method

.method static synthetic t(Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity;->i()V

    return-void
.end method

.method static synthetic u(Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity;->o()V

    return-void
.end method

.method static synthetic v(Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity;->n()V

    return-void
.end method

.method static synthetic w(Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_;Lcom/join/mgps/dto/DetailResultBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity;->d(Lcom/join/mgps/dto/DetailResultBean;)V

    return-void
.end method

.method static synthetic x(Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity;->g()V

    return-void
.end method

.method private y(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_;->z()V

    return-void
.end method

.method private z()V
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

    iput-object v1, p0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity;->b:Ljava/lang/String;

    :cond_0
    const-string v1, "hasPlug"

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity;->c:Z

    :cond_1
    const-string v1, "hasRom"

    .line 6
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 7
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity;->d:Z

    :cond_2
    const-string v1, "from"

    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 9
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity;->e:Ljava/lang/String;

    :cond_3
    return-void
.end method


# virtual methods
.method d(Lcom/join/mgps/dto/DetailResultBean;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_$b;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_$b;-><init>(Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_;Ljava/lang/String;JLjava/lang/String;Lcom/join/mgps/dto/DetailResultBean;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method e()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_$h;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_$h;-><init>(Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x1f4

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method f()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_$i;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_$i;-><init>(Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x320

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method g()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_$c;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_$c;-><init>(Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_;Ljava/lang/String;JLjava/lang/String;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_;->N:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method i()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_$k;-><init>(Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

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
    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method n()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_$a;-><init>(Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method o()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_$l;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_$l;-><init>(Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_;->M:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_;->y(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    const p1, 0x7f0c019a

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_;->setContentView(I)V

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 1

    const v0, 0x7f09092d

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity;->h:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v0, 0x7f0915de

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity;->i:Landroid/widget/TextView;

    const v0, 0x7f090e42

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity;->j:Landroid/widget/TextView;

    const v0, 0x7f090668

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity;->k:Landroid/widget/ProgressBar;

    const v0, 0x7f0915e1

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity;->l:Landroid/widget/TextView;

    const v0, 0x7f09095a

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity;->m:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v0, 0x7f091655

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity;->n:Landroid/widget/TextView;

    const v0, 0x7f091014

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity;->o:Landroid/widget/ProgressBar;

    const v0, 0x7f091656

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity;->p:Landroid/widget/TextView;

    const v0, 0x7f09020e

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity;->q:Landroid/widget/Button;

    const v0, 0x7f090d59

    .line 11
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity;->r:Landroid/widget/LinearLayout;

    const v0, 0x7f090d7f

    .line 12
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity;->s:Landroid/widget/LinearLayout;

    const v0, 0x7f09110c

    .line 13
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity;->t:Landroid/widget/ImageView;

    const v0, 0x7f091261

    .line 14
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity;->u:Landroid/widget/Button;

    const v0, 0x7f09091d

    .line 15
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity;->v:Landroid/view/View;

    const v0, 0x7f090ce3

    .line 16
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity;->w:Landroid/widget/LinearLayout;

    const v0, 0x7f090d19

    .line 17
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity;->x:Landroid/widget/LinearLayout;

    const v0, 0x7f090cf2

    .line 18
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity;->y:Landroid/widget/LinearLayout;

    const v0, 0x7f0915fa

    .line 19
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity;->z:Landroid/widget/TextView;

    .line 20
    iget-object p1, p0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity;->q:Landroid/widget/Button;

    if-eqz p1, :cond_0

    .line 21
    new-instance v0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_$d;-><init>(Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 22
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity;->v:Landroid/view/View;

    if-eqz p1, :cond_1

    .line 23
    new-instance v0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_$e;-><init>(Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 24
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity;->u:Landroid/widget/Button;

    if-eqz p1, :cond_2

    .line 25
    new-instance v0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_$f;-><init>(Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 26
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity;->t:Landroid/widget/ImageView;

    if-eqz p1, :cond_3

    .line 27
    new-instance v0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_$g;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_$g;-><init>(Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 28
    :cond_3
    invoke-virtual {p0}, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity;->a()V

    return-void
.end method

.method p()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_$j;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_$j;-><init>(Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_;->N:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->setContentView(I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_;->M:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 5
    invoke-super {p0, p1}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_;->M:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_;->M:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_;->z()V

    return-void
.end method
