.class public final Lcom/kwad/components/core/page/c/a/c;
.super Lcom/kwad/components/core/page/c/a/a;
.source "SourceFile"


# instance fields
.field private Pr:Landroid/widget/LinearLayout;

.field private Ps:Landroid/widget/TextView;

.field private Pt:Landroid/widget/TextView;

.field private Pu:Landroid/widget/TextView;

.field private Pv:Landroid/widget/TextView;

.field private Pw:I

.field private Px:Z

.field private Py:Z

.field private Pz:Ljava/lang/Runnable;

.field private final wU:Lcom/kwad/sdk/core/c/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/page/c/a/a;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/core/page/c/a/c;->Px:Z

    .line 3
    iput-boolean v0, p0, Lcom/kwad/components/core/page/c/a/c;->Py:Z

    .line 4
    new-instance v0, Lcom/kwad/components/core/page/c/a/c$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/page/c/a/c$1;-><init>(Lcom/kwad/components/core/page/c/a/c;)V

    iput-object v0, p0, Lcom/kwad/components/core/page/c/a/c;->Pz:Ljava/lang/Runnable;

    .line 5
    new-instance v0, Lcom/kwad/components/core/page/c/a/c$2;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/page/c/a/c$2;-><init>(Lcom/kwad/components/core/page/c/a/c;)V

    iput-object v0, p0, Lcom/kwad/components/core/page/c/a/c;->wU:Lcom/kwad/sdk/core/c/c;

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/page/c/a/c;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/components/core/page/c/a/c;->Px:Z

    return p0
.end method

.method static synthetic a(Lcom/kwad/components/core/page/c/a/c;Z)Z
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/kwad/components/core/page/c/a/c;->Px:Z

    return p1
.end method

.method static synthetic b(Lcom/kwad/components/core/page/c/a/c;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/kwad/components/core/page/c/a/c;->Pw:I

    return p0
.end method

.method static synthetic c(Lcom/kwad/components/core/page/c/a/c;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/page/c/a/c;->Ps:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic d(Lcom/kwad/components/core/page/c/a/c;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/page/c/a/c;->Pt:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic e(Lcom/kwad/components/core/page/c/a/c;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/page/c/a/c;->Pu:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic f(Lcom/kwad/components/core/page/c/a/c;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/page/c/a/c;->Pv:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic g(Lcom/kwad/components/core/page/c/a/c;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/components/core/page/c/a/c;->Py:Z

    return p0
.end method

.method static synthetic h(Lcom/kwad/components/core/page/c/a/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/page/c/a/c;->pV()V

    return-void
.end method

.method static synthetic i(Lcom/kwad/components/core/page/c/a/c;)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/kwad/components/core/page/c/a/c;->Pw:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Lcom/kwad/components/core/page/c/a/c;->Pw:I

    return v0
.end method

.method private pU()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/page/c/a/c;->Pr:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/page/c/a/a;->Pk:Lcom/kwad/components/core/page/c/a/b;

    iget-object v0, v0, Lcom/kwad/components/core/page/c/a/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-boolean v0, v0, Lcom/kwad/sdk/core/response/model/AdTemplate;->mRewardVerifyCalled:Z

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/page/c/a/c;->Ps:Landroid/widget/TextView;

    const-string v1, "\u4efb\u52a1\u5df2\u5b8c\u6210"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/core/page/c/a/c;->Pt:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/core/page/c/a/c;->Pu:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/core/page/c/a/c;->Pv:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void

    .line 7
    :cond_0
    invoke-direct {p0}, Lcom/kwad/components/core/page/c/a/c;->pV()V

    .line 8
    iget-object v0, p0, Lcom/kwad/components/core/page/c/a/c;->Pz:Ljava/lang/Runnable;

    const-wide/16 v1, 0x3e8

    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/utils/bo;->runOnUiThreadDelay(Ljava/lang/Runnable;J)V

    return-void
.end method

.method private pV()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/page/c/a/c;->Pt:Landroid/widget/TextView;

    invoke-direct {p0}, Lcom/kwad/components/core/page/c/a/c;->pW()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/page/c/a/c;->Pv:Landroid/widget/TextView;

    invoke-direct {p0}, Lcom/kwad/components/core/page/c/a/c;->pX()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private pW()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, Lcom/kwad/components/core/page/c/a/c;->Pw:I

    div-int/lit8 v0, v0, 0x3c

    const/16 v1, 0xa

    if-lt v0, v1, :cond_0

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "0"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private pX()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, Lcom/kwad/components/core/page/c/a/c;->Pw:I

    rem-int/lit8 v0, v0, 0x3c

    const/16 v1, 0xa

    if-lt v0, v1, :cond_0

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "0"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final aj()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/components/core/page/c/a/a;->aj()V

    .line 2
    invoke-static {}, Lcom/kwad/sdk/core/c/b;->En()Lcom/kwad/sdk/core/c/b;

    iget-object v0, p0, Lcom/kwad/components/core/page/c/a/c;->wU:Lcom/kwad/sdk/core/c/c;

    invoke-static {v0}, Lcom/kwad/sdk/core/c/b;->a(Lcom/kwad/sdk/core/c/c;)V

    .line 3
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->CQ()I

    move-result v0

    iput v0, p0, Lcom/kwad/components/core/page/c/a/c;->Pw:I

    .line 4
    invoke-direct {p0}, Lcom/kwad/components/core/page/c/a/c;->pU()V

    return-void
.end method

.method public final onCreate()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onCreate()V

    .line 2
    sget v0, Lcom/kwad/sdk/R$id;->ksad_reward_land_page_open_tip:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/kwad/components/core/page/c/a/c;->Pr:Landroid/widget/LinearLayout;

    .line 3
    sget v0, Lcom/kwad/sdk/R$id;->ksad_reward_land_page_open_desc:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kwad/components/core/page/c/a/c;->Ps:Landroid/widget/TextView;

    .line 4
    sget v0, Lcom/kwad/sdk/R$id;->ksad_reward_land_page_open_minute:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kwad/components/core/page/c/a/c;->Pt:Landroid/widget/TextView;

    .line 5
    sget v0, Lcom/kwad/sdk/R$id;->ksad_reward_land_page_open_colon:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kwad/components/core/page/c/a/c;->Pu:Landroid/widget/TextView;

    .line 6
    sget v0, Lcom/kwad/sdk/R$id;->ksad_reward_land_page_open_second:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kwad/components/core/page/c/a/c;->Pv:Landroid/widget/TextView;

    return-void
.end method

.method public final onUnbind()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onUnbind()V

    .line 2
    invoke-static {}, Lcom/kwad/sdk/core/c/b;->En()Lcom/kwad/sdk/core/c/b;

    iget-object v0, p0, Lcom/kwad/components/core/page/c/a/c;->wU:Lcom/kwad/sdk/core/c/c;

    invoke-static {v0}, Lcom/kwad/sdk/core/c/b;->b(Lcom/kwad/sdk/core/c/c;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/page/c/a/c;->Pz:Ljava/lang/Runnable;

    invoke-static {v0}, Lcom/kwad/sdk/utils/bo;->c(Ljava/lang/Runnable;)V

    return-void
.end method
