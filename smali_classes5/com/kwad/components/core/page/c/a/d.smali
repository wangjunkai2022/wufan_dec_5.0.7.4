.class public final Lcom/kwad/components/core/page/c/a/d;
.super Lcom/kwad/components/core/page/c/a/a;
.source "SourceFile"


# instance fields
.field private PB:Landroid/view/View;

.field private PC:Landroid/widget/TextView;

.field private PD:I

.field private PE:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/page/c/a/a;-><init>()V

    .line 2
    new-instance v0, Lcom/kwad/components/core/page/c/a/d$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/page/c/a/d$1;-><init>(Lcom/kwad/components/core/page/c/a/d;)V

    iput-object v0, p0, Lcom/kwad/components/core/page/c/a/d;->PE:Ljava/lang/Runnable;

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/page/c/a/d;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/kwad/components/core/page/c/a/d;->PD:I

    return p0
.end method

.method static synthetic b(Lcom/kwad/components/core/page/c/a/d;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/page/c/a/d;->PC:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic c(Lcom/kwad/components/core/page/c/a/d;)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/kwad/components/core/page/c/a/d;->PD:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Lcom/kwad/components/core/page/c/a/d;->PD:I

    return v0
.end method

.method static synthetic d(Lcom/kwad/components/core/page/c/a/d;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/page/c/a/d;->PB:Landroid/view/View;

    return-object p0
.end method

.method private pY()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/page/c/a/d;->PB:Landroid/view/View;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/kwad/components/core/page/c/a/d;->PC:Landroid/widget/TextView;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    .line 2
    iget v2, p0, Lcom/kwad/components/core/page/c/a/d;->PD:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "\u5012\u8ba1\u65f6%d\u79d2"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/page/c/a/d;->PB:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/core/page/c/a/d;->PE:Ljava/lang/Runnable;

    const-wide/16 v1, 0x3e8

    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/utils/bo;->runOnUiThreadDelay(Ljava/lang/Runnable;J)V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final aj()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/components/core/page/c/a/a;->aj()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/page/c/a/a;->Pk:Lcom/kwad/components/core/page/c/a/b;

    iget-object v0, v0, Lcom/kwad/components/core/page/c/a/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 3
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->aL(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v0

    iput v0, p0, Lcom/kwad/components/core/page/c/a/d;->PD:I

    .line 4
    invoke-static {}, Lcom/kwad/components/core/q/a;->rj()Lcom/kwad/components/core/q/a;

    move-result-object v0

    iget v1, p0, Lcom/kwad/components/core/page/c/a/d;->PD:I

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/q/a;->aJ(I)V

    .line 5
    invoke-direct {p0}, Lcom/kwad/components/core/page/c/a/d;->pY()V

    return-void
.end method

.method public final onCreate()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onCreate()V

    .line 2
    sget v0, Lcom/kwad/sdk/R$id;->ksad_web_reward_task_layout:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/core/page/c/a/d;->PB:Landroid/view/View;

    .line 3
    sget v0, Lcom/kwad/sdk/R$id;->ksad_web_reward_task_text:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kwad/components/core/page/c/a/d;->PC:Landroid/widget/TextView;

    return-void
.end method

.method public final onUnbind()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onUnbind()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/page/c/a/d;->PE:Ljava/lang/Runnable;

    invoke-static {v0}, Lcom/kwad/sdk/utils/bo;->c(Ljava/lang/Runnable;)V

    return-void
.end method
