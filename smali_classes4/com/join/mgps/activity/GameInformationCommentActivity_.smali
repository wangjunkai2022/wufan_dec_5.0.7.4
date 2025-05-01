.class public final Lcom/join/mgps/activity/GameInformationCommentActivity_;
.super Lcom/join/mgps/activity/GameInformationCommentActivity;
.source "GameInformationCommentActivity_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/GameInformationCommentActivity_$v;
    }
.end annotation


# static fields
.field public static final O:Ljava/lang/String; = "informationId"

.field public static final P:Ljava/lang/String; = "informationCommentBean"


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
    invoke-direct {p0}, Lcom/join/mgps/activity/GameInformationCommentActivity;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity_;->M:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity_;->N:Ljava/util/Map;

    return-void
.end method

.method static synthetic A0(Lcom/join/mgps/activity/GameInformationCommentActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameInformationCommentActivity;->x0()V

    return-void
.end method

.method static synthetic B0(Lcom/join/mgps/activity/GameInformationCommentActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GameInformationCommentActivity;->showToast(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic C0(Lcom/join/mgps/activity/GameInformationCommentActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameInformationCommentActivity;->o0()V

    return-void
.end method

.method static synthetic D0(Lcom/join/mgps/activity/GameInformationCommentActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GameInformationCommentActivity;->showMessage(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic E0(Lcom/join/mgps/activity/GameInformationCommentActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameInformationCommentActivity;->m0()V

    return-void
.end method

.method static synthetic F0(Lcom/join/mgps/activity/GameInformationCommentActivity_;Lcom/join/mgps/dto/InformationCommentBeanV2;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GameInformationCommentActivity;->r0(Lcom/join/mgps/dto/InformationCommentBeanV2;)V

    return-void
.end method

.method static synthetic G0(Lcom/join/mgps/activity/GameInformationCommentActivity_;Lcom/wufan/user/service/protobuf/n0;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/GameInformationCommentActivity;->q0(Lcom/wufan/user/service/protobuf/n0;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic H0(Lcom/join/mgps/activity/GameInformationCommentActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameInformationCommentActivity;->showLoding()V

    return-void
.end method

.method static synthetic I0(Lcom/join/mgps/activity/GameInformationCommentActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameInformationCommentActivity;->showLodingFailed()V

    return-void
.end method

.method static synthetic J0(Lcom/join/mgps/activity/GameInformationCommentActivity_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GameInformationCommentActivity;->u0(Ljava/util/List;)V

    return-void
.end method

.method static synthetic K0(Lcom/join/mgps/activity/GameInformationCommentActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameInformationCommentActivity;->s0()V

    return-void
.end method

.method static synthetic L0(Lcom/join/mgps/activity/GameInformationCommentActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameInformationCommentActivity;->t0()V

    return-void
.end method

.method static synthetic M0(Lcom/join/mgps/activity/GameInformationCommentActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameInformationCommentActivity;->l0()V

    return-void
.end method

.method static synthetic N0(Lcom/join/mgps/activity/GameInformationCommentActivity_;Lcom/join/mgps/dto/RewardBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GameInformationCommentActivity;->toastData(Lcom/join/mgps/dto/RewardBean;)V

    return-void
.end method

.method static synthetic O0(Lcom/join/mgps/activity/GameInformationCommentActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameInformationCommentActivity;->w0()V

    return-void
.end method

.method public static P0(Landroid/content/Context;)Lcom/join/mgps/activity/GameInformationCommentActivity_$v;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameInformationCommentActivity_$v;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameInformationCommentActivity_$v;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static Q0(Landroidx/fragment/app/Fragment;)Lcom/join/mgps/activity/GameInformationCommentActivity_$v;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameInformationCommentActivity_$v;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameInformationCommentActivity_$v;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/GameInformationCommentActivity_;->injectExtras_()V

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

    const-string v1, "informationId"

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->x:Ljava/lang/String;

    :cond_0
    const-string v1, "informationCommentBean"

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/InformationCommentBeanV2;

    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->y:Lcom/join/mgps/dto/InformationCommentBeanV2;

    :cond_1
    return-void
.end method

.method static synthetic z0(Lcom/join/mgps/activity/GameInformationCommentActivity_;Lcom/join/mgps/dto/InformationCommentBeanV2;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GameInformationCommentActivity;->v0(Lcom/join/mgps/dto/InformationCommentBeanV2;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity_;->N:Ljava/util/Map;

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

.method l0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameInformationCommentActivity_$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameInformationCommentActivity_$d;-><init>(Lcom/join/mgps/activity/GameInformationCommentActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method m0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/GameInformationCommentActivity_$j;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/GameInformationCommentActivity_$j;-><init>(Lcom/join/mgps/activity/GameInformationCommentActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method o0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameInformationCommentActivity_$h;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameInformationCommentActivity_$h;-><init>(Lcom/join/mgps/activity/GameInformationCommentActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity_;->M:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/GameInformationCommentActivity_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Lcom/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    const p1, 0x7f0c0352

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/GameInformationCommentActivity_;->setContentView(I)V

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 3

    const v0, 0x7f090c3a

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->b:Landroid/widget/RelativeLayout;

    const v0, 0x7f090146

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->c:Landroid/widget/ImageView;

    const v0, 0x7f090c48

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->d:Landroid/widget/TextView;

    const v0, 0x7f090f03

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->e:Landroid/widget/TextView;

    const v0, 0x7f090e1a

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/XListView2;

    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->f:Lcom/join/mgps/customview/XListView2;

    const v0, 0x7f090d82

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->g:Landroid/widget/LinearLayout;

    const v0, 0x7f090d7f

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->h:Landroid/widget/LinearLayout;

    const v0, 0x7f090c39

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->i:Landroid/widget/FrameLayout;

    const v0, 0x7f0904ca

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/common/view/ClearEditText;

    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->j:Lcom/join/android/app/common/view/ClearEditText;

    const v0, 0x7f09023a

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->k:Landroid/widget/Button;

    const v0, 0x7f09023b

    .line 11
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->l:Landroid/widget/Button;

    const v0, 0x7f0904c8

    .line 12
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->m:Landroid/widget/TextView;

    const v0, 0x7f090800

    .line 13
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->n:Landroid/widget/ImageView;

    const v0, 0x7f0905ce

    .line 14
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->o:Landroid/widget/TextView;

    const v0, 0x7f090239

    .line 15
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->p:Landroid/widget/Button;

    const v0, 0x7f0902d4

    .line 16
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->q:Landroid/widget/LinearLayout;

    const v0, 0x7f0902d2

    .line 17
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->r:Landroid/view/View;

    const v0, 0x7f0902d3

    .line 18
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->s:Landroid/widget/LinearLayout;

    const v0, 0x7f090dd3

    .line 19
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lit/sephiroth/android/library/widget/HListView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->t:Lit/sephiroth/android/library/widget/HListView;

    const v0, 0x7f09060b

    .line 20
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->u:Landroid/widget/TextView;

    const v0, 0x7f090dbd

    .line 21
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/KeyboardListenLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->v:Lcom/join/mgps/customview/KeyboardListenLayout;

    const v0, 0x7f09110c

    .line 22
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f090e20

    .line 23
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f091261

    .line 24
    invoke-interface {p1, v2}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz v0, :cond_0

    .line 25
    new-instance v2, Lcom/join/mgps/activity/GameInformationCommentActivity_$k;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/GameInformationCommentActivity_$k;-><init>(Lcom/join/mgps/activity/GameInformationCommentActivity_;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 26
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->c:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    .line 27
    new-instance v2, Lcom/join/mgps/activity/GameInformationCommentActivity_$n;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/GameInformationCommentActivity_$n;-><init>(Lcom/join/mgps/activity/GameInformationCommentActivity_;)V

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    if-eqz v1, :cond_2

    .line 28
    new-instance v0, Lcom/join/mgps/activity/GameInformationCommentActivity_$o;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameInformationCommentActivity_$o;-><init>(Lcom/join/mgps/activity/GameInformationCommentActivity_;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 29
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity;->l:Landroid/widget/Button;

    if-eqz v0, :cond_3

    .line 30
    new-instance v1, Lcom/join/mgps/activity/GameInformationCommentActivity_$p;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/GameInformationCommentActivity_$p;-><init>(Lcom/join/mgps/activity/GameInformationCommentActivity_;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_3
    if-eqz p1, :cond_4

    .line 31
    new-instance v0, Lcom/join/mgps/activity/GameInformationCommentActivity_$q;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameInformationCommentActivity_$q;-><init>(Lcom/join/mgps/activity/GameInformationCommentActivity_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 32
    :cond_4
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameInformationCommentActivity;->afterview()V

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
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationCommentActivity_;->N:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method q0(Lcom/wufan/user/service/protobuf/n0;Ljava/lang/String;)V
    .locals 9

    .line 1
    new-instance v8, Lcom/join/mgps/activity/GameInformationCommentActivity_$m;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v8

    move-object v1, p0

    move-object v6, p1

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/join/mgps/activity/GameInformationCommentActivity_$m;-><init>(Lcom/join/mgps/activity/GameInformationCommentActivity_;Ljava/lang/String;JLjava/lang/String;Lcom/wufan/user/service/protobuf/n0;Ljava/lang/String;)V

    invoke-static {v8}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method r0(Lcom/join/mgps/dto/InformationCommentBeanV2;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/GameInformationCommentActivity_$l;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/GameInformationCommentActivity_$l;-><init>(Lcom/join/mgps/activity/GameInformationCommentActivity_;Ljava/lang/String;JLjava/lang/String;Lcom/join/mgps/dto/InformationCommentBeanV2;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method s0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameInformationCommentActivity_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameInformationCommentActivity_$b;-><init>(Lcom/join/mgps/activity/GameInformationCommentActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/BaseActivity;->setContentView(I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationCommentActivity_;->M:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 5
    invoke-super {p0, p1}, Lcom/BaseActivity;->setContentView(Landroid/view/View;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationCommentActivity_;->M:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroidx/activity/ComponentActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationCommentActivity_;->M:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/GameInformationCommentActivity_;->injectExtras_()V

    return-void
.end method

.method showLoding()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameInformationCommentActivity_$t;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameInformationCommentActivity_$t;-><init>(Lcom/join/mgps/activity/GameInformationCommentActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLodingFailed()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameInformationCommentActivity_$u;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameInformationCommentActivity_$u;-><init>(Lcom/join/mgps/activity/GameInformationCommentActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showMessage(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameInformationCommentActivity_$i;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/GameInformationCommentActivity_$i;-><init>(Lcom/join/mgps/activity/GameInformationCommentActivity_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showToast(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameInformationCommentActivity_$s;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/GameInformationCommentActivity_$s;-><init>(Lcom/join/mgps/activity/GameInformationCommentActivity_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method t0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameInformationCommentActivity_$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameInformationCommentActivity_$c;-><init>(Lcom/join/mgps/activity/GameInformationCommentActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method toastData(Lcom/join/mgps/dto/RewardBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameInformationCommentActivity_$e;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/GameInformationCommentActivity_$e;-><init>(Lcom/join/mgps/activity/GameInformationCommentActivity_;Lcom/join/mgps/dto/RewardBean;)V

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
            "Lcom/join/mgps/dto/InformationCommentBeanV2;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameInformationCommentActivity_$a;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/GameInformationCommentActivity_$a;-><init>(Lcom/join/mgps/activity/GameInformationCommentActivity_;Ljava/util/List;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method v0(Lcom/join/mgps/dto/InformationCommentBeanV2;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameInformationCommentActivity_$r;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/GameInformationCommentActivity_$r;-><init>(Lcom/join/mgps/activity/GameInformationCommentActivity_;Lcom/join/mgps/dto/InformationCommentBeanV2;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method w0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameInformationCommentActivity_$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameInformationCommentActivity_$f;-><init>(Lcom/join/mgps/activity/GameInformationCommentActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method x0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameInformationCommentActivity_$g;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameInformationCommentActivity_$g;-><init>(Lcom/join/mgps/activity/GameInformationCommentActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
