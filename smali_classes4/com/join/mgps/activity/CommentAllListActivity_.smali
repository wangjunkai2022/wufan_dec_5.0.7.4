.class public final Lcom/join/mgps/activity/CommentAllListActivity_;
.super Lcom/join/mgps/activity/CommentAllListActivity;
.source "CommentAllListActivity_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/CommentAllListActivity_$p;
    }
.end annotation


# static fields
.field public static final A1:Ljava/lang/String; = "sgcSwitch"

.field public static final B1:Ljava/lang/String; = "gameType"

.field public static final C1:Ljava/lang/String; = "gameIsStart"

.field public static final W:Ljava/lang/String; = "commentId"

.field public static final X:Ljava/lang/String; = "commentContent"

.field public static final Y:Ljava/lang/String; = "commentStars"

.field public static final Z:Ljava/lang/String; = "gameId"

.field public static final p0:Ljava/lang/String; = "packageName"

.field public static final p1:Ljava/lang/String; = "commentScoreSwitch"

.field public static final v1:Ljava/lang/String; = "bespeakSwitch"


# instance fields
.field private final U:La4/c;

.field private final V:Ljava/util/Map;
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
    invoke-direct {p0}, Lcom/join/mgps/activity/CommentAllListActivity;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/CommentAllListActivity_;->U:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/CommentAllListActivity_;->V:Ljava/util/Map;

    return-void
.end method

.method static synthetic A0(Lcom/join/mgps/activity/CommentAllListActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/CommentAllListActivity;->showLodingFailed()V

    return-void
.end method

.method static synthetic B0(Lcom/join/mgps/activity/CommentAllListActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/CommentAllListActivity;->t0()V

    return-void
.end method

.method static synthetic C0(Lcom/join/mgps/activity/CommentAllListActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/CommentAllListActivity;->showMessage(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic D0(Lcom/join/mgps/activity/CommentAllListActivity_;II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/CommentAllListActivity;->i0(II)V

    return-void
.end method

.method static synthetic E0(Lcom/join/mgps/activity/CommentAllListActivity_;Ljava/lang/String;ZII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lcom/join/mgps/activity/CommentAllListActivity;->o0(Ljava/lang/String;ZII)V

    return-void
.end method

.method static synthetic F0(Lcom/join/mgps/activity/CommentAllListActivity_;Lcom/join/mgps/dto/CommentResponse;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/CommentAllListActivity;->p0(Lcom/join/mgps/dto/CommentResponse;)V

    return-void
.end method

.method static synthetic G0(Lcom/join/mgps/activity/CommentAllListActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/CommentAllListActivity;->k0()V

    return-void
.end method

.method public static H0(Landroid/content/Context;)Lcom/join/mgps/activity/CommentAllListActivity_$p;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CommentAllListActivity_$p;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CommentAllListActivity_$p;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static I0(Landroidx/fragment/app/Fragment;)Lcom/join/mgps/activity/CommentAllListActivity_$p;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CommentAllListActivity_$p;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CommentAllListActivity_$p;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    new-instance p1, Lcom/join/mgps/pref/PrefDef_;

    invoke-direct {p1, p0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/join/mgps/activity/CommentAllListActivity;->l:Lcom/join/mgps/pref/PrefDef_;

    .line 2
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 3
    invoke-direct {p0}, Lcom/join/mgps/activity/CommentAllListActivity_;->injectExtras_()V

    return-void
.end method

.method private injectExtras_()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_9

    const-string v1, "commentId"

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/CommentAllListActivity;->m:Ljava/lang/String;

    :cond_0
    const-string v1, "commentContent"

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/CommentAllListActivity;->n:Ljava/lang/String;

    :cond_1
    const-string v1, "commentStars"

    .line 6
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 7
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v1

    iput v1, p0, Lcom/join/mgps/activity/CommentAllListActivity;->o:F

    :cond_2
    const-string v1, "gameId"

    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 9
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/CommentAllListActivity;->p:Ljava/lang/String;

    :cond_3
    const-string v1, "packageName"

    .line 10
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 11
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/CommentAllListActivity;->q:Ljava/lang/String;

    :cond_4
    const-string v1, "commentScoreSwitch"

    .line 12
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 13
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/CommentAllListActivity;->r:Ljava/lang/String;

    :cond_5
    const-string v1, "bespeakSwitch"

    .line 14
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 15
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/join/mgps/activity/CommentAllListActivity;->s:I

    :cond_6
    const-string v1, "sgcSwitch"

    .line 16
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 17
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/join/mgps/activity/CommentAllListActivity;->t:I

    :cond_7
    const-string v1, "gameType"

    .line 18
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 19
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/CommentAllListActivity;->u:Ljava/lang/String;

    :cond_8
    const-string v1, "gameIsStart"

    .line 20
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 21
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/join/mgps/activity/CommentAllListActivity;->v:I

    :cond_9
    return-void
.end method

.method static synthetic u0(Lcom/join/mgps/activity/CommentAllListActivity_;Lcom/join/mgps/dto/CommentAllListBean$ScoringDetailsBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/CommentAllListActivity;->q0(Lcom/join/mgps/dto/CommentAllListBean$ScoringDetailsBean;)V

    return-void
.end method

.method static synthetic v0(Lcom/join/mgps/activity/CommentAllListActivity_;Lcom/join/mgps/dto/CommentBaseBean;II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/join/mgps/activity/CommentAllListActivity;->b(Lcom/join/mgps/dto/CommentBaseBean;II)V

    return-void
.end method

.method static synthetic w0(Lcom/join/mgps/activity/CommentAllListActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/CommentAllListActivity;->showLoding()V

    return-void
.end method

.method static synthetic x0(Lcom/join/mgps/activity/CommentAllListActivity_;Lcom/join/mgps/dto/CommentBaseBean;II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/join/mgps/activity/CommentAllListActivity;->c(Lcom/join/mgps/dto/CommentBaseBean;II)V

    return-void
.end method

.method static synthetic y0(Lcom/join/mgps/activity/CommentAllListActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/CommentAllListActivity;->n0()V

    return-void
.end method

.method static synthetic z0(Lcom/join/mgps/activity/CommentAllListActivity_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/CommentAllListActivity;->r0(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public b(Lcom/join/mgps/dto/CommentBaseBean;II)V
    .locals 10

    .line 1
    new-instance v9, Lcom/join/mgps/activity/CommentAllListActivity_$d;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v9

    move-object v1, p0

    move-object v6, p1

    move v7, p2

    move v8, p3

    invoke-direct/range {v0 .. v8}, Lcom/join/mgps/activity/CommentAllListActivity_$d;-><init>(Lcom/join/mgps/activity/CommentAllListActivity_;Ljava/lang/String;JLjava/lang/String;Lcom/join/mgps/dto/CommentBaseBean;II)V

    invoke-static {v9}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method public c(Lcom/join/mgps/dto/CommentBaseBean;II)V
    .locals 10

    .line 1
    new-instance v9, Lcom/join/mgps/activity/CommentAllListActivity_$e;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v9

    move-object v1, p0

    move-object v6, p1

    move v7, p2

    move v8, p3

    invoke-direct/range {v0 .. v8}, Lcom/join/mgps/activity/CommentAllListActivity_$e;-><init>(Lcom/join/mgps/activity/CommentAllListActivity_;Ljava/lang/String;JLjava/lang/String;Lcom/join/mgps/dto/CommentBaseBean;II)V

    invoke-static {v9}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/CommentAllListActivity_;->V:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public i0(II)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CommentAllListActivity_$o;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/activity/CommentAllListActivity_$o;-><init>(Lcom/join/mgps/activity/CommentAllListActivity_;II)V

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

.method k0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/CommentAllListActivity_$c;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/CommentAllListActivity_$c;-><init>(Lcom/join/mgps/activity/CommentAllListActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method n0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/CommentAllListActivity_$f;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/CommentAllListActivity_$f;-><init>(Lcom/join/mgps/activity/CommentAllListActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method o0(Ljava/lang/String;ZII)V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/CommentAllListActivity_$a;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/CommentAllListActivity_$a;-><init>(Lcom/join/mgps/activity/CommentAllListActivity_;Ljava/lang/String;ZII)V

    const-string p1, ""

    const-wide/16 p2, 0x0

    invoke-static {p1, v6, p2, p3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CommentAllListActivity_;->U:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/CommentAllListActivity_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    const p1, 0x7f0c0141

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/CommentAllListActivity_;->setContentView(I)V

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 1

    const v0, 0x7f090146

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/CommentAllListActivity;->c:Landroid/widget/ImageView;

    const v0, 0x7f091489

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/CommentAllListActivity;->d:Landroid/widget/TextView;

    const v0, 0x7f0913a9

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/CommentAllListActivity;->e:Landroid/widget/TextView;

    const v0, 0x7f090db3

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/CommentAllListActivity;->f:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    const v0, 0x7f09034f

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/XListView2;

    iput-object v0, p0, Lcom/join/mgps/activity/CommentAllListActivity;->g:Lcom/join/mgps/customview/XListView2;

    const v0, 0x7f090d82

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/CommentAllListActivity;->h:Landroid/widget/LinearLayout;

    const v0, 0x7f090d7f

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/CommentAllListActivity;->i:Landroid/widget/LinearLayout;

    const v0, 0x7f090efe

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/join/mgps/activity/CommentAllListActivity;->j:Landroid/widget/LinearLayout;

    .line 9
    iget-object p1, p0, Lcom/join/mgps/activity/CommentAllListActivity;->c:Landroid/widget/ImageView;

    if-eqz p1, :cond_0

    .line 10
    new-instance v0, Lcom/join/mgps/activity/CommentAllListActivity_$g;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CommentAllListActivity_$g;-><init>(Lcom/join/mgps/activity/CommentAllListActivity_;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 11
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/CommentAllListActivity;->e:Landroid/widget/TextView;

    if-eqz p1, :cond_1

    .line 12
    new-instance v0, Lcom/join/mgps/activity/CommentAllListActivity_$h;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CommentAllListActivity_$h;-><init>(Lcom/join/mgps/activity/CommentAllListActivity_;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 13
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/CommentAllListActivity;->afterView()V

    return-void
.end method

.method p0(Lcom/join/mgps/dto/CommentResponse;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CommentAllListActivity_$b;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/CommentAllListActivity_$b;-><init>(Lcom/join/mgps/activity/CommentAllListActivity_;Lcom/join/mgps/dto/CommentResponse;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/CommentAllListActivity_;->V:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method q0(Lcom/join/mgps/dto/CommentAllListBean$ScoringDetailsBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CommentAllListActivity_$i;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/CommentAllListActivity_$i;-><init>(Lcom/join/mgps/activity/CommentAllListActivity_;Lcom/join/mgps/dto/CommentAllListBean$ScoringDetailsBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method r0(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CommentBaseBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CommentAllListActivity_$k;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/CommentAllListActivity_$k;-><init>(Lcom/join/mgps/activity/CommentAllListActivity_;Ljava/util/List;)V

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
    iget-object p1, p0, Lcom/join/mgps/activity/CommentAllListActivity_;->U:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 5
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->setContentView(Landroid/view/View;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/CommentAllListActivity_;->U:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/CommentAllListActivity_;->U:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/CommentAllListActivity_;->injectExtras_()V

    return-void
.end method

.method showLoding()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CommentAllListActivity_$j;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CommentAllListActivity_$j;-><init>(Lcom/join/mgps/activity/CommentAllListActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLodingFailed()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CommentAllListActivity_$l;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CommentAllListActivity_$l;-><init>(Lcom/join/mgps/activity/CommentAllListActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showMessage(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CommentAllListActivity_$n;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/CommentAllListActivity_$n;-><init>(Lcom/join/mgps/activity/CommentAllListActivity_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method t0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CommentAllListActivity_$m;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CommentAllListActivity_$m;-><init>(Lcom/join/mgps/activity/CommentAllListActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
