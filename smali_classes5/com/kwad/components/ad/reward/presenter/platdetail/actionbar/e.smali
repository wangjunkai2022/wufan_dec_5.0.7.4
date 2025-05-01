.class public final Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/e;
.super Lcom/kwad/components/ad/reward/presenter/b;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/RewardActionBarControl$c;


# instance fields
.field private gS:Landroid/view/ViewGroup;

.field private ss:Lcom/kwad/components/core/widget/KsLogoView;

.field private uW:Lcom/kwad/components/ad/reward/n/n;

.field private uX:I

.field private uY:Landroid/widget/FrameLayout$LayoutParams;

.field private uZ:Lcom/kwad/components/ad/reward/n/n$a;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Lcom/kwad/components/ad/reward/n/n$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/b;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/e;->gS:Landroid/view/ViewGroup;

    .line 3
    iput-object p2, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/e;->uZ:Lcom/kwad/components/ad/reward/n/n$a;

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/e;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method static synthetic b(Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/e;)Lcom/kwad/components/ad/reward/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    return-object p0
.end method

.method static synthetic c(Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/e;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method static synthetic d(Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/e;)Lcom/kwad/components/ad/reward/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    return-object p0
.end method


# virtual methods
.method public final aj()V
    .locals 5

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/reward/presenter/b;->aj()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->oN:Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/RewardActionBarControl;

    .line 3
    invoke-virtual {v0, p0}, Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/RewardActionBarControl;->a(Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/RewardActionBarControl$c;)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v0, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/e;->ss:Lcom/kwad/components/core/widget/KsLogoView;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v1

    iput v1, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/e;->uX:I

    .line 6
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/e;->ss:Lcom/kwad/components/core/widget/KsLogoView;

    sget v3, Lcom/kwad/sdk/R$dimen;->ksad_reward_order_logo_margin_bottom:I

    iget-object v4, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v4, v4, Lcom/kwad/components/ad/reward/g;->oK:Lcom/kwad/components/ad/reward/m/e;

    .line 7
    invoke-virtual {v4}, Lcom/kwad/components/ad/reward/m/e;->jN()Z

    move-result v4

    xor-int/lit8 v4, v4, 0x1

    .line 8
    invoke-static {v1, v0, v2, v3, v4}, Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/d;->a(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdInfo;Lcom/kwad/components/core/widget/KsLogoView;IZ)Landroid/widget/FrameLayout$LayoutParams;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/e;->uY:Landroid/widget/FrameLayout$LayoutParams;

    .line 9
    new-instance v0, Lcom/kwad/components/ad/reward/n/n;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/e;->gS:Landroid/view/ViewGroup;

    new-instance v2, Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/e$1;

    .line 10
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v3

    iget-object v4, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    invoke-direct {v2, p0, v3, v4}, Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/e$1;-><init>(Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/e;Landroid/content/Context;Lcom/kwad/components/ad/reward/g;)V

    invoke-direct {v0, v1, v2}, Lcom/kwad/components/ad/reward/n/n;-><init>(Landroid/view/ViewGroup;Lcom/kwad/components/ad/reward/n/b;)V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/e;->uW:Lcom/kwad/components/ad/reward/n/n;

    .line 11
    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/e;->uZ:Lcom/kwad/components/ad/reward/n/n$a;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/n/n;->a(Lcom/kwad/components/ad/reward/n/n$a;)V

    .line 12
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/e;->uW:Lcom/kwad/components/ad/reward/n/n;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v1, v1, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v1}, Lcom/kwad/components/ad/reward/n/r;->R(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/components/ad/reward/n/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/n/d;->b(Lcom/kwad/components/ad/reward/n/r;)V

    .line 13
    new-instance v0, Lcom/kwad/components/core/widget/e;

    invoke-direct {v0}, Lcom/kwad/components/core/widget/e;-><init>()V

    .line 14
    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/e;->uW:Lcom/kwad/components/ad/reward/n/n;

    invoke-virtual {v1}, Lcom/kwad/components/ad/reward/n/n;->gG()Landroid/view/ViewGroup;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kwad/components/core/s/i;->a(Lcom/kwad/components/core/widget/e;Landroid/view/ViewGroup;)V

    return-void
.end method

.method public final e(Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/a;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/e;->gS:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/e;->gS:Landroid/view/ViewGroup;

    sget-object v1, Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/RewardActionBarControl$ShowActionBarResult;->SHOW_NATIVE_ORDER:Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/RewardActionBarControl$ShowActionBarResult;

    invoke-static {p1, v0, v1}, Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/RewardActionBarControl;->a(Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/a;Landroid/view/View;Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/RewardActionBarControl$ShowActionBarResult;)V

    return-void
.end method

.method public final onCreate()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onCreate()V

    .line 2
    sget v0, Lcom/kwad/sdk/R$id;->ksad_ad_label_play_bar:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/core/widget/KsLogoView;

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/e;->ss:Lcom/kwad/components/core/widget/KsLogoView;

    return-void
.end method

.method public final onUnbind()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onUnbind()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/e;->ss:Lcom/kwad/components/core/widget/KsLogoView;

    iget v1, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/e;->uX:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/e;->uY:Landroid/widget/FrameLayout$LayoutParams;

    if-eqz v0, :cond_0

    .line 4
    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/e;->ss:Lcom/kwad/components/core/widget/KsLogoView;

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void
.end method
