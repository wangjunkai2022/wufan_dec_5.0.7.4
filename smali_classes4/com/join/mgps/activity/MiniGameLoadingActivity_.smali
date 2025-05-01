.class public final Lcom/join/mgps/activity/MiniGameLoadingActivity_;
.super Lcom/join/mgps/activity/MiniGameLoadingActivity;
.source "MiniGameLoadingActivity_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/MiniGameLoadingActivity_$d;
    }
.end annotation


# static fields
.field public static final L:Ljava/lang/String; = "gameId"

.field public static final M:Ljava/lang/String; = "isLaunchApp"


# instance fields
.field private final J:La4/c;

.field private final K:Ljava/util/Map;
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
    invoke-direct {p0}, Lcom/join/mgps/activity/MiniGameLoadingActivity;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity_;->J:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity_;->K:Ljava/util/Map;

    return-void
.end method

.method static synthetic S0(Lcom/join/mgps/activity/MiniGameLoadingActivity_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->R0(I)V

    return-void
.end method

.method public static T0(Landroid/content/Context;)Lcom/join/mgps/activity/MiniGameLoadingActivity_$d;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MiniGameLoadingActivity_$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MiniGameLoadingActivity_$d;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static U0(Landroidx/fragment/app/Fragment;)Lcom/join/mgps/activity/MiniGameLoadingActivity_$d;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MiniGameLoadingActivity_$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MiniGameLoadingActivity_$d;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/MiniGameLoadingActivity_;->injectExtras_()V

    return-void
.end method

.method private injectExtras_()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "gameId"

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->c:Ljava/lang/String;

    :cond_0
    const-string v1, "isLaunchApp"

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->B:Z

    :cond_1
    return-void
.end method


# virtual methods
.method R0(I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MiniGameLoadingActivity_$c;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/MiniGameLoadingActivity_$c;-><init>(Lcom/join/mgps/activity/MiniGameLoadingActivity_;I)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity_;->K:Ljava/util/Map;

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

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity_;->J:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/MiniGameLoadingActivity_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Lcom/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    const p1, 0x7f0c0074

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/MiniGameLoadingActivity_;->setContentView(I)V

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 1

    const v0, 0x7f09132b

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->b:Landroid/view/View;

    const v0, 0x7f09120b

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->d:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v0, 0x7f091635

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->e:Landroid/widget/TextView;

    const v0, 0x7f09161e

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->f:Landroid/widget/TextView;

    const v0, 0x7f091683

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->g:Landroid/widget/TextView;

    const v0, 0x7f0915a6

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->h:Landroid/widget/TextView;

    const v0, 0x7f090fec

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/PictureHProgress;

    iput-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->i:Lcom/join/mgps/customview/PictureHProgress;

    const v0, 0x7f090cd6

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->j:Landroid/widget/LinearLayout;

    .line 9
    iget-object p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->h:Landroid/widget/TextView;

    if-eqz p1, :cond_0

    .line 10
    new-instance v0, Lcom/join/mgps/activity/MiniGameLoadingActivity_$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MiniGameLoadingActivity_$a;-><init>(Lcom/join/mgps/activity/MiniGameLoadingActivity_;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 11
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->j:Landroid/widget/LinearLayout;

    if-eqz p1, :cond_1

    .line 12
    new-instance v0, Lcom/join/mgps/activity/MiniGameLoadingActivity_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MiniGameLoadingActivity_$b;-><init>(Lcom/join/mgps/activity/MiniGameLoadingActivity_;)V

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 13
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->afterViews()V

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
    iget-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity_;->K:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/BaseActivity;->setContentView(I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity_;->J:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 5
    invoke-super {p0, p1}, Lcom/BaseActivity;->setContentView(Landroid/view/View;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity_;->J:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroidx/activity/ComponentActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity_;->J:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/MiniGameLoadingActivity_;->injectExtras_()V

    return-void
.end method
