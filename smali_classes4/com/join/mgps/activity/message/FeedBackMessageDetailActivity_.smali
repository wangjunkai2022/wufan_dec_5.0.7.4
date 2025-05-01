.class public final Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_;
.super Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;
.source "FeedBackMessageDetailActivity_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_$n;
    }
.end annotation


# static fields
.field public static final s:Ljava/lang/String; = "issueId"


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


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_;->q:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_;->r:Ljava/util/Map;

    return-void
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_;->injectExtras_()V

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

    const-string v1, "issueId"

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->m:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method static synthetic m0(Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_;Lcom/join/mgps/dto/MessageDetailFeedBackBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->l0(Lcom/join/mgps/dto/MessageDetailFeedBackBean;)V

    return-void
.end method

.method static synthetic n0(Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->showMessage(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic o0(Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->showLoding()V

    return-void
.end method

.method static synthetic p0(Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->showLodingFailed()V

    return-void
.end method

.method static synthetic q0(Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->j0()V

    return-void
.end method

.method static synthetic r0(Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_;Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackReplies;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->f0(Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackReplies;)V

    return-void
.end method

.method static synthetic s0(Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->getData()V

    return-void
.end method

.method static synthetic t0(Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->i0(Ljava/lang/String;)V

    return-void
.end method

.method public static u0(Landroid/content/Context;)Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_$n;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_$n;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_$n;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static v0(Landroidx/fragment/app/Fragment;)Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_$n;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_$n;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_$n;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
.end method


# virtual methods
.method f0(Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackReplies;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_$b;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_$b;-><init>(Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_;Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackReplies;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_;->r:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method getData()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_$c;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_$c;-><init>(Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method i0(Ljava/lang/String;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_$d;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_$d;-><init>(Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

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
    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method j0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_$a;-><init>(Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method l0(Lcom/join/mgps/dto/MessageDetailFeedBackBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_$j;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_$j;-><init>(Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_;Lcom/join/mgps/dto/MessageDetailFeedBackBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_;->q:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Lcom/BaseFragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    const p1, 0x7f0c0071

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_;->setContentView(I)V

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 5

    const v0, 0x7f09060b

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->b:Landroid/widget/TextView;

    const v0, 0x7f091517

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->c:Landroid/widget/TextView;

    const v0, 0x7f091518

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->d:Landroid/widget/TextView;

    const v0, 0x7f091516

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->e:Landroid/widget/TextView;

    const v0, 0x7f09156e

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->f:Landroid/widget/TextView;

    const v0, 0x7f0911b8

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->g:Landroidx/recyclerview/widget/RecyclerView;

    const v0, 0x7f0904f6

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/EditText;

    iput-object v1, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->h:Landroid/widget/EditText;

    const v1, 0x7f091565

    .line 8
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->i:Landroid/widget/TextView;

    const v1, 0x7f090d82

    .line 9
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    iput-object v1, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->j:Landroid/widget/LinearLayout;

    const v1, 0x7f090d7f

    .line 10
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    iput-object v1, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->k:Landroid/widget/LinearLayout;

    const v1, 0x7f090cb8

    .line 11
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    iput-object v1, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->l:Landroid/widget/LinearLayout;

    const v1, 0x7f090146

    .line 12
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f09110c

    .line 13
    invoke-interface {p1, v2}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v2

    const v3, 0x7f091261

    .line 14
    invoke-interface {p1, v3}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v3

    if-eqz v1, :cond_0

    .line 15
    new-instance v4, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_$e;

    invoke-direct {v4, p0}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_$e;-><init>(Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_;)V

    invoke-virtual {v1, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    if-eqz v2, :cond_1

    .line 16
    new-instance v1, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_$f;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_$f;-><init>(Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_;)V

    invoke-virtual {v2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    if-eqz v3, :cond_2

    .line 17
    new-instance v1, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_$g;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_$g;-><init>(Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_;)V

    invoke-virtual {v3, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 18
    :cond_2
    iget-object v1, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->i:Landroid/widget/TextView;

    if-eqz v1, :cond_3

    .line 19
    new-instance v2, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_$h;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_$h;-><init>(Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_;)V

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20
    :cond_3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_4

    .line 21
    new-instance v0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_$i;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_$i;-><init>(Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 22
    :cond_4
    invoke-virtual {p0}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->afterViews()V

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
    iget-object v0, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_;->r:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/BaseFragmentActivity;->setContentView(I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_;->q:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 5
    invoke-super {p0, p1}, Lcom/BaseFragmentActivity;->setContentView(Landroid/view/View;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_;->q:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroidx/activity/ComponentActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_;->q:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_;->injectExtras_()V

    return-void
.end method

.method showLoding()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_$l;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_$l;-><init>(Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLodingFailed()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_$m;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_$m;-><init>(Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showMessage(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_$k;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_$k;-><init>(Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
