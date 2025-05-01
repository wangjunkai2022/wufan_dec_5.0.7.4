.class public final Lcom/join/mgps/activity/CreateEndGameActivity_;
.super Lcom/join/mgps/activity/CreateEndGameActivity;
.source "CreateEndGameActivity_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/CreateEndGameActivity_$n;
    }
.end annotation


# static fields
.field public static final J:Ljava/lang/String; = "configBean"


# instance fields
.field private final H:La4/c;

.field private final I:Ljava/util/Map;
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
    invoke-direct {p0}, Lcom/join/mgps/activity/CreateEndGameActivity;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity_;->H:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity_;->I:Ljava/util/Map;

    return-void
.end method

.method static synthetic A0(Lcom/join/mgps/activity/CreateEndGameActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/CreateEndGameActivity;->showToast(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic B0(Lcom/join/mgps/activity/CreateEndGameActivity_;Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/CreateEndGameActivity;->o0(Z)V

    return-void
.end method

.method static synthetic C0(Lcom/join/mgps/activity/CreateEndGameActivity_;Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/CreateEndGameActivity;->n0(Z)V

    return-void
.end method

.method public static D0(Landroid/content/Context;)Lcom/join/mgps/activity/CreateEndGameActivity_$n;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CreateEndGameActivity_$n;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CreateEndGameActivity_$n;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static E0(Landroidx/fragment/app/Fragment;)Lcom/join/mgps/activity/CreateEndGameActivity_$n;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CreateEndGameActivity_$n;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CreateEndGameActivity_$n;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/CreateEndGameActivity_;->injectExtras_()V

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

    const-string v1, "configBean"

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/GameMainV4DataBean$EndGameConfigBean;

    iput-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->c:Lcom/join/mgps/dto/GameMainV4DataBean$EndGameConfigBean;

    :cond_0
    return-void
.end method

.method static synthetic y0(Lcom/join/mgps/activity/CreateEndGameActivity_;ZLjava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/CreateEndGameActivity;->x0(ZLjava/util/List;)V

    return-void
.end method

.method static synthetic z0(Lcom/join/mgps/activity/CreateEndGameActivity_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/CreateEndGameActivity;->w0(Ljava/util/List;)V

    return-void
.end method


# virtual methods
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
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity_;->I:Ljava/util/Map;

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

.method n0(Z)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/CreateEndGameActivity_$d;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/CreateEndGameActivity_$d;-><init>(Lcom/join/mgps/activity/CreateEndGameActivity_;Ljava/lang/String;JLjava/lang/String;Z)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method o0(Z)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/CreateEndGameActivity_$c;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/CreateEndGameActivity_$c;-><init>(Lcom/join/mgps/activity/CreateEndGameActivity_;Ljava/lang/String;JLjava/lang/String;Z)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity_;->H:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/CreateEndGameActivity_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    const p1, 0x7f0c0031

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/CreateEndGameActivity_;->setContentView(I)V

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 6

    const v0, 0x7f091699

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->d:Landroid/widget/TextView;

    const v0, 0x7f091698

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->e:Landroid/widget/TextView;

    const v0, 0x7f09090a

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->f:Landroid/widget/ImageView;

    const v0, 0x7f09090b

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->g:Landroid/widget/ImageView;

    const v0, 0x7f090cd8

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->h:Landroid/widget/LinearLayout;

    const v0, 0x7f0915a1

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->i:Landroid/widget/TextView;

    const v0, 0x7f0915a0

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->j:Landroid/widget/TextView;

    const v0, 0x7f0915a9

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->k:Landroid/widget/TextView;

    const v0, 0x7f090909

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->l:Landroid/widget/ImageView;

    const v0, 0x7f09118d

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->m:Landroid/widget/RelativeLayout;

    const v0, 0x7f090cde

    .line 11
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->n:Landroid/widget/LinearLayout;

    const v0, 0x7f090961

    .line 12
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->o:Landroid/widget/ImageView;

    const v0, 0x7f0915aa

    .line 13
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->p:Landroid/widget/TextView;

    const v0, 0x7f09120d

    .line 14
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->q:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v0, 0x7f09090f

    .line 15
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f09025a

    .line 16
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f090924

    .line 17
    invoke-interface {p1, v2}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v2

    const v3, 0x7f0903d4

    .line 18
    invoke-interface {p1, v3}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v3

    const v4, 0x7f0903d5

    .line 19
    invoke-interface {p1, v4}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v4

    const v5, 0x7f0903d6

    .line 20
    invoke-interface {p1, v5}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz v0, :cond_0

    .line 21
    new-instance v5, Lcom/join/mgps/activity/CreateEndGameActivity_$e;

    invoke-direct {v5, p0}, Lcom/join/mgps/activity/CreateEndGameActivity_$e;-><init>(Lcom/join/mgps/activity/CreateEndGameActivity_;)V

    invoke-virtual {v0, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 22
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->o:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    .line 23
    new-instance v5, Lcom/join/mgps/activity/CreateEndGameActivity_$f;

    invoke-direct {v5, p0}, Lcom/join/mgps/activity/CreateEndGameActivity_$f;-><init>(Lcom/join/mgps/activity/CreateEndGameActivity_;)V

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 24
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->n:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_2

    .line 25
    new-instance v5, Lcom/join/mgps/activity/CreateEndGameActivity_$g;

    invoke-direct {v5, p0}, Lcom/join/mgps/activity/CreateEndGameActivity_$g;-><init>(Lcom/join/mgps/activity/CreateEndGameActivity_;)V

    invoke-virtual {v0, v5}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    if-eqz v1, :cond_3

    .line 26
    new-instance v0, Lcom/join/mgps/activity/CreateEndGameActivity_$h;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CreateEndGameActivity_$h;-><init>(Lcom/join/mgps/activity/CreateEndGameActivity_;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_3
    if-eqz v2, :cond_4

    .line 27
    new-instance v0, Lcom/join/mgps/activity/CreateEndGameActivity_$i;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CreateEndGameActivity_$i;-><init>(Lcom/join/mgps/activity/CreateEndGameActivity_;)V

    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_4
    if-eqz v3, :cond_5

    .line 28
    new-instance v0, Lcom/join/mgps/activity/CreateEndGameActivity_$j;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CreateEndGameActivity_$j;-><init>(Lcom/join/mgps/activity/CreateEndGameActivity_;)V

    invoke-virtual {v3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_5
    if-eqz v4, :cond_6

    .line 29
    new-instance v0, Lcom/join/mgps/activity/CreateEndGameActivity_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CreateEndGameActivity_$k;-><init>(Lcom/join/mgps/activity/CreateEndGameActivity_;)V

    invoke-virtual {v4, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_6
    if-eqz p1, :cond_7

    .line 30
    new-instance v0, Lcom/join/mgps/activity/CreateEndGameActivity_$l;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CreateEndGameActivity_$l;-><init>(Lcom/join/mgps/activity/CreateEndGameActivity_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 31
    :cond_7
    invoke-virtual {p0}, Lcom/join/mgps/activity/CreateEndGameActivity;->afterViews()V

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
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity_;->I:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->setContentView(I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/CreateEndGameActivity_;->H:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 5
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->setContentView(Landroid/view/View;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/CreateEndGameActivity_;->H:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/CreateEndGameActivity_;->H:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/CreateEndGameActivity_;->injectExtras_()V

    return-void
.end method

.method showToast(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CreateEndGameActivity_$b;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/CreateEndGameActivity_$b;-><init>(Lcom/join/mgps/activity/CreateEndGameActivity_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method w0(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/BossBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CreateEndGameActivity_$a;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/CreateEndGameActivity_$a;-><init>(Lcom/join/mgps/activity/CreateEndGameActivity_;Ljava/util/List;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method x0(ZLjava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/UserGameListBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CreateEndGameActivity_$m;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/activity/CreateEndGameActivity_$m;-><init>(Lcom/join/mgps/activity/CreateEndGameActivity_;ZLjava/util/List;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
