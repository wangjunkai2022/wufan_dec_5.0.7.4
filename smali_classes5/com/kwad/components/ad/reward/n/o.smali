.class public final Lcom/kwad/components/ad/reward/n/o;
.super Lcom/kwad/components/ad/reward/n/s;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private lw:Landroid/widget/TextView;

.field private qp:Lcom/kwad/components/ad/reward/g;

.field private zL:Lcom/kwad/components/core/widget/KsLogoView;

.field private zM:Lcom/kwad/components/core/widget/KsLogoView;

.field private zN:Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;

.field private zO:Landroid/widget/RelativeLayout;

.field private zP:Z

.field private zQ:Ljava/lang/String;

.field private zR:Ljava/lang/Runnable;

.field private zl:Landroid/widget/TextView;

.field private zm:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Lcom/kwad/components/ad/reward/g;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/n/s;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/n/o;->zP:Z

    .line 3
    new-instance v0, Lcom/kwad/components/ad/reward/n/o$2;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/n/o$2;-><init>(Lcom/kwad/components/ad/reward/n/o;)V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/n/o;->zR:Ljava/lang/Runnable;

    .line 4
    iput-object p1, p0, Lcom/kwad/components/ad/reward/n/o;->qp:Lcom/kwad/components/ad/reward/g;

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/reward/n/o;)Ljava/lang/Runnable;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/n/o;->zR:Ljava/lang/Runnable;

    return-object p0
.end method

.method static synthetic b(Lcom/kwad/components/ad/reward/n/o;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/n/o;->lw:Landroid/widget/TextView;

    return-object p0
.end method

.method private b(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 4

    .line 2
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/kwad/components/ad/reward/n/o;->zl:Landroid/widget/TextView;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->cd(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    new-instance v1, Lcom/kwad/components/core/widget/e;

    invoke-direct {v1}, Lcom/kwad/components/core/widget/e;-><init>()V

    .line 5
    iget-object v2, p0, Lcom/kwad/components/ad/reward/n/o;->zN:Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 6
    iget-object v2, p0, Lcom/kwad/components/ad/reward/n/o;->zN:Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;

    invoke-virtual {v2, p1}, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->b(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 7
    iget-object v2, p0, Lcom/kwad/components/ad/reward/n/o;->zN:Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;

    invoke-virtual {v2, v1}, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->a(Lcom/kwad/components/core/widget/e;)V

    .line 8
    iget-object v1, p0, Lcom/kwad/components/ad/reward/n/o;->zm:Landroid/widget/TextView;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->aD(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->be(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v1

    const/16 v2, 0x8

    if-ne v1, v2, :cond_0

    .line 10
    iget-object v1, p0, Lcom/kwad/components/ad/reward/n/o;->zM:Lcom/kwad/components/core/widget/KsLogoView;

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 11
    iget-object v1, p0, Lcom/kwad/components/ad/reward/n/o;->zM:Lcom/kwad/components/core/widget/KsLogoView;

    invoke-virtual {v1, p1}, Lcom/kwad/components/core/widget/KsLogoView;->aE(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 12
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/o;->lw:Landroid/widget/TextView;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->at(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    .line 13
    :cond_0
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->at(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/reward/n/o;->zQ:Ljava/lang/String;

    .line 14
    new-instance v0, Lcom/kwad/components/core/widget/KsLogoView;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/n/s;->sA:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, v3}, Lcom/kwad/components/core/widget/KsLogoView;-><init>(Landroid/content/Context;Z)V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/n/o;->zL:Lcom/kwad/components/core/widget/KsLogoView;

    .line 15
    new-instance v1, Lcom/kwad/components/ad/reward/n/o$1;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/reward/n/o$1;-><init>(Lcom/kwad/components/ad/reward/n/o;)V

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/widget/KsLogoView;->setLogoLoadFinishListener(Lcom/kwad/components/core/widget/KsLogoView$a;)V

    .line 16
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/o;->zL:Lcom/kwad/components/core/widget/KsLogoView;

    invoke-virtual {v0, p1}, Lcom/kwad/components/core/widget/KsLogoView;->aE(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 17
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/o;->zM:Lcom/kwad/components/core/widget/KsLogoView;

    invoke-virtual {p1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void
.end method

.method static synthetic c(Lcom/kwad/components/ad/reward/n/o;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/n/o;->zQ:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic d(Lcom/kwad/components/ad/reward/n/o;)Lcom/kwad/components/core/widget/KsLogoView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/n/o;->zL:Lcom/kwad/components/core/widget/KsLogoView;

    return-object p0
.end method

.method private static h(Landroid/view/View;I)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    .line 2
    instance-of v0, p1, Landroid/widget/FrameLayout$LayoutParams;

    if-eqz v0, :cond_1

    .line 3
    check-cast p1, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v0, 0x55

    .line 4
    iput v0, p1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41a00000    # 20.0f

    invoke-static {v0, v1}, Lcom/kwad/sdk/c/a/a;->a(Landroid/content/Context;F)I

    move-result v0

    iput v0, p1, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    .line 6
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_1
    return-void
.end method

.method private initView()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/s;->sA:Landroid/view/ViewGroup;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    sget v1, Lcom/kwad/sdk/R$id;->ksad_live_author_icon:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;

    iput-object v0, p0, Lcom/kwad/components/ad/reward/n/o;->zN:Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/s;->sA:Landroid/view/ViewGroup;

    sget v1, Lcom/kwad/sdk/R$id;->kwad_actionbar_title:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kwad/components/ad/reward/n/o;->zl:Landroid/widget/TextView;

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/s;->sA:Landroid/view/ViewGroup;

    sget v1, Lcom/kwad/sdk/R$id;->kwad_actionbar_des_text:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kwad/components/ad/reward/n/o;->lw:Landroid/widget/TextView;

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/s;->sA:Landroid/view/ViewGroup;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_live_actionbar_btn:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kwad/components/ad/reward/n/o;->zm:Landroid/widget/TextView;

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/s;->sA:Landroid/view/ViewGroup;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_reward_live_kwai_logo:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/core/widget/KsLogoView;

    iput-object v0, p0, Lcom/kwad/components/ad/reward/n/o;->zM:Lcom/kwad/components/core/widget/KsLogoView;

    .line 7
    iget-boolean v0, p0, Lcom/kwad/components/ad/reward/n/o;->zP:Z

    if-nez v0, :cond_1

    .line 8
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/s;->sA:Landroid/view/ViewGroup;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_reward_origin_live_relative:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/kwad/components/ad/reward/n/o;->zO:Landroid/widget/RelativeLayout;

    .line 9
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/s;->sA:Landroid/view/ViewGroup;

    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 10
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/o;->zm:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 11
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/o;->zN:Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;

    invoke-virtual {v0, p0}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 12
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/o;->lw:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 13
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/o;->zl:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/ViewGroup;I)V
    .locals 1

    const/16 v0, 0x8

    if-ne p2, v0, :cond_0

    .line 2
    sget p2, Lcom/kwad/sdk/R$id;->ksad_reward_origin_live_shop_stub:I

    sget v0, Lcom/kwad/sdk/R$id;->ksad_reward_origin_live_root:I

    invoke-super {p0, p1, p2, v0}, Lcom/kwad/components/ad/reward/n/s;->a(Landroid/view/ViewGroup;II)V

    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, Lcom/kwad/components/ad/reward/n/o;->zP:Z

    goto :goto_0

    .line 4
    :cond_0
    sget p2, Lcom/kwad/sdk/R$id;->ksad_reward_origin_live_base_stub:I

    sget v0, Lcom/kwad/sdk/R$id;->ksad_reward_origin_live_root:I

    invoke-super {p0, p1, p2, v0}, Lcom/kwad/components/ad/reward/n/s;->a(Landroid/view/ViewGroup;II)V

    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Lcom/kwad/components/ad/reward/n/o;->zP:Z

    .line 6
    :goto_0
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/n/o;->initView()V

    return-void
.end method

.method protected final a(Lcom/kwad/components/ad/reward/n/r;)V
    .locals 0

    .line 7
    invoke-super {p0, p1}, Lcom/kwad/components/ad/reward/n/d;->a(Lcom/kwad/components/ad/reward/n/r;)V

    .line 8
    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/n/r;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object p1

    .line 9
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/reward/n/o;->b(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-void
.end method

.method protected final ab(Z)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Lcom/kwad/components/ad/reward/n/d;->ab(Z)V

    .line 2
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/s;->sA:Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    .line 3
    invoke-static {}, Lcom/kwad/sdk/utils/aj;->ML()Z

    move-result v0

    if-nez v0, :cond_1

    .line 4
    iget-boolean v0, p0, Lcom/kwad/components/ad/reward/n/o;->zP:Z

    if-nez v0, :cond_0

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/s;->sA:Landroid/view/ViewGroup;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_reward_origin_live_base1:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/o;->zO:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/kwad/sdk/R$dimen;->ksad_live_subscribe_card_width_horizontal:I

    .line 8
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 9
    iget-object v1, p0, Lcom/kwad/components/ad/reward/n/o;->zO:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 10
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/o;->zm:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 11
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    .line 12
    invoke-virtual {p1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 13
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/o;->zm:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/s;->sA:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 15
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v1, Lcom/kwad/sdk/R$dimen;->ksad_live_subscribe_card_width_horizontal:I

    .line 16
    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 17
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/s;->sA:Landroid/view/ViewGroup;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 18
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/s;->sA:Landroid/view/ViewGroup;

    const/16 v0, 0x55

    invoke-static {p1, v0}, Lcom/kwad/components/ad/reward/n/o;->h(Landroid/view/View;I)V

    :cond_1
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/o;->zm:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/o;->qp:Lcom/kwad/components/ad/reward/g;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const/16 v2, 0x1d

    invoke-virtual {v0, v1, p1, v2, v1}, Lcom/kwad/components/ad/reward/g;->a(ILandroid/content/Context;II)V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/o;->zN:Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/o;->qp:Lcom/kwad/components/ad/reward/g;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const/16 v2, 0x1e

    invoke-virtual {v0, v1, p1, v2, v1}, Lcom/kwad/components/ad/reward/g;->a(ILandroid/content/Context;II)V

    return-void

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/o;->lw:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/o;->qp:Lcom/kwad/components/ad/reward/g;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const/16 v2, 0x20

    invoke-virtual {v0, v1, p1, v2, v1}, Lcom/kwad/components/ad/reward/g;->a(ILandroid/content/Context;II)V

    return-void

    .line 7
    :cond_2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/o;->zl:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 8
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/o;->qp:Lcom/kwad/components/ad/reward/g;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const/16 v2, 0x1f

    invoke-virtual {v0, v1, p1, v2, v1}, Lcom/kwad/components/ad/reward/g;->a(ILandroid/content/Context;II)V

    return-void

    .line 9
    :cond_3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/s;->sA:Landroid/view/ViewGroup;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 10
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/o;->qp:Lcom/kwad/components/ad/reward/g;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const/16 v2, 0x35

    const/4 v3, 0x2

    invoke-virtual {v0, v1, p1, v2, v3}, Lcom/kwad/components/ad/reward/g;->a(ILandroid/content/Context;II)V

    :cond_4
    return-void
.end method
