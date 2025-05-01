.class public final Lcom/join/mgps/activity/ChociceDownActivity_;
.super Lcom/join/mgps/activity/ChociceDownActivity;
.source "ChociceDownActivity_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/ChociceDownActivity_$j;
    }
.end annotation


# static fields
.field public static final w:Ljava/lang/String; = "downloadTask"

.field public static final x:Ljava/lang/String; = "updateIntentDataBean"

.field public static final y:Ljava/lang/String; = "from"


# instance fields
.field private final u:La4/c;

.field private final v:Ljava/util/Map;
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
    invoke-direct {p0}, Lcom/join/mgps/activity/ChociceDownActivity;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/ChociceDownActivity_;->u:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/ChociceDownActivity_;->v:Ljava/util/Map;

    return-void
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/ChociceDownActivity_;->injectExtras_()V

    return-void
.end method

.method private injectExtras_()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v1, "downloadTask"

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v1

    check-cast v1, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iput-object v1, p0, Lcom/join/mgps/activity/ChociceDownActivity;->l:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    :cond_0
    const-string v1, "updateIntentDataBean"

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/UpdateIntentDataBean;

    iput-object v1, p0, Lcom/join/mgps/activity/ChociceDownActivity;->m:Lcom/join/mgps/dto/UpdateIntentDataBean;

    :cond_1
    const-string v1, "from"

    .line 6
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 7
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/join/mgps/activity/ChociceDownActivity;->n:I

    :cond_2
    return-void
.end method

.method static synthetic m0(Lcom/join/mgps/activity/ChociceDownActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/ChociceDownActivity;->showLoding()V

    return-void
.end method

.method static synthetic n0(Lcom/join/mgps/activity/ChociceDownActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/ChociceDownActivity;->showLodingFailed()V

    return-void
.end method

.method static synthetic o0(Lcom/join/mgps/activity/ChociceDownActivity_;Lcom/join/mgps/dto/GameDownInfo;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ChociceDownActivity;->k0(Lcom/join/mgps/dto/GameDownInfo;)V

    return-void
.end method

.method static synthetic p0(Lcom/join/mgps/activity/ChociceDownActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/ChociceDownActivity;->getData()V

    return-void
.end method

.method public static q0(Landroid/content/Context;)Lcom/join/mgps/activity/ChociceDownActivity_$j;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ChociceDownActivity_$j;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ChociceDownActivity_$j;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static r0(Landroidx/fragment/app/Fragment;)Lcom/join/mgps/activity/ChociceDownActivity_$j;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ChociceDownActivity_$j;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ChociceDownActivity_$j;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
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
    iget-object v0, p0, Lcom/join/mgps/activity/ChociceDownActivity_;->v:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method getData()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/ChociceDownActivity_$i;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/ChociceDownActivity_$i;-><init>(Lcom/join/mgps/activity/ChociceDownActivity_;Ljava/lang/String;JLjava/lang/String;)V

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
    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method k0(Lcom/join/mgps/dto/GameDownInfo;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ChociceDownActivity_$h;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/ChociceDownActivity_$h;-><init>(Lcom/join/mgps/activity/ChociceDownActivity_;Lcom/join/mgps/dto/GameDownInfo;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ChociceDownActivity_;->u:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/ChociceDownActivity_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Lcom/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    const p1, 0x7f0c010a

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ChociceDownActivity_;->setContentView(I)V

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 2

    const v0, 0x7f091461

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/ChociceDownActivity;->b:Landroid/widget/TextView;

    const v0, 0x7f0903fa

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/ChociceDownActivity;->c:Landroid/widget/TextView;

    const v0, 0x7f090330

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/ChociceDownActivity;->d:Landroid/widget/ImageView;

    const v0, 0x7f090461

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/ChociceDownActivity;->e:Landroid/widget/TextView;

    const v0, 0x7f090463

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/ChociceDownActivity;->f:Landroid/widget/TextView;

    const v0, 0x7f090462

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/ChociceDownActivity;->g:Landroid/widget/TextView;

    const v0, 0x7f090464

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/ChociceDownActivity;->h:Landroid/widget/TextView;

    const v0, 0x7f090465

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/ChociceDownActivity;->i:Landroid/widget/TextView;

    const v0, 0x7f090dbd

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/ChociceDownActivity;->j:Landroid/widget/RelativeLayout;

    const v0, 0x7f090d82

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/ChociceDownActivity;->p:Landroid/widget/LinearLayout;

    const v0, 0x7f090d7f

    .line 11
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/ChociceDownActivity;->q:Landroid/widget/LinearLayout;

    const v0, 0x7f09110c

    .line 12
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/ChociceDownActivity;->r:Landroid/widget/ImageView;

    const v0, 0x7f090db3

    .line 13
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/ChociceDownActivity;->s:Landroid/widget/RelativeLayout;

    const v0, 0x7f090c4d

    .line 14
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/ChociceDownActivity;->t:Landroid/widget/RelativeLayout;

    const v0, 0x7f090331

    .line 15
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    .line 16
    iget-object v0, p0, Lcom/join/mgps/activity/ChociceDownActivity;->d:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 17
    new-instance v1, Lcom/join/mgps/activity/ChociceDownActivity_$a;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/ChociceDownActivity_$a;-><init>(Lcom/join/mgps/activity/ChociceDownActivity_;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    if-eqz p1, :cond_1

    .line 18
    new-instance v0, Lcom/join/mgps/activity/ChociceDownActivity_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ChociceDownActivity_$b;-><init>(Lcom/join/mgps/activity/ChociceDownActivity_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 19
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/activity/ChociceDownActivity;->r:Landroid/widget/ImageView;

    if-eqz p1, :cond_2

    .line 20
    new-instance v0, Lcom/join/mgps/activity/ChociceDownActivity_$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ChociceDownActivity_$c;-><init>(Lcom/join/mgps/activity/ChociceDownActivity_;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 21
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/activity/ChociceDownActivity;->g:Landroid/widget/TextView;

    if-eqz p1, :cond_3

    .line 22
    new-instance v0, Lcom/join/mgps/activity/ChociceDownActivity_$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ChociceDownActivity_$d;-><init>(Lcom/join/mgps/activity/ChociceDownActivity_;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 23
    :cond_3
    iget-object p1, p0, Lcom/join/mgps/activity/ChociceDownActivity;->h:Landroid/widget/TextView;

    if-eqz p1, :cond_4

    .line 24
    new-instance v0, Lcom/join/mgps/activity/ChociceDownActivity_$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ChociceDownActivity_$e;-><init>(Lcom/join/mgps/activity/ChociceDownActivity_;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 25
    :cond_4
    invoke-virtual {p0}, Lcom/join/mgps/activity/ChociceDownActivity;->afterviews()V

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
    iget-object v0, p0, Lcom/join/mgps/activity/ChociceDownActivity_;->v:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/BaseActivity;->setContentView(I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/ChociceDownActivity_;->u:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 5
    invoke-super {p0, p1}, Lcom/BaseActivity;->setContentView(Landroid/view/View;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/ChociceDownActivity_;->u:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroidx/activity/ComponentActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/ChociceDownActivity_;->u:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/ChociceDownActivity_;->injectExtras_()V

    return-void
.end method

.method showLoding()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ChociceDownActivity_$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ChociceDownActivity_$f;-><init>(Lcom/join/mgps/activity/ChociceDownActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLodingFailed()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ChociceDownActivity_$g;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ChociceDownActivity_$g;-><init>(Lcom/join/mgps/activity/ChociceDownActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
