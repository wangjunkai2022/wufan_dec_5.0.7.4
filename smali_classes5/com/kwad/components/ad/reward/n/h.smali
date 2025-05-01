.class public Lcom/kwad/components/ad/reward/n/h;
.super Lcom/kwad/components/ad/reward/n/s;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/ad/reward/n/h$a;
    }
.end annotation


# instance fields
.field protected mLogoView:Lcom/kwad/components/core/widget/KsLogoView;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field protected yA:Lcom/kwad/components/core/widget/KsConvertButton;

.field protected yB:Landroid/widget/TextView;

.field protected yC:Landroid/widget/TextView;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field protected yD:Landroid/widget/TextView;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field protected yE:Lcom/kwad/components/ad/reward/n/h$a;

.field protected yF:I
    .annotation build Landroidx/annotation/LayoutRes;
    .end annotation
.end field

.field protected yG:Z

.field protected yf:Landroid/widget/ImageView;

.field protected yj:Lcom/kwad/components/ad/widget/KsAppTagsView;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/n/s;-><init>()V

    .line 2
    sget v0, Lcom/kwad/sdk/R$layout;->ksad_reward_apk_info_card_tag_item:I

    iput v0, p0, Lcom/kwad/components/ad/reward/n/h;->yF:I

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/n/h;->yG:Z

    return-void
.end method

.method private S(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/h;->yA:Lcom/kwad/components/core/widget/KsConvertButton;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x1

    if-ne p1, v1, :cond_1

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/core/widget/KSCornerButton;->getCornerConf()Lcom/kwad/sdk/widget/h$a;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/kwad/sdk/widget/h$a;->setAllCorner(Z)V

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    if-ne p1, v2, :cond_2

    .line 3
    invoke-virtual {v0}, Lcom/kwad/components/core/widget/KSCornerButton;->getCornerConf()Lcom/kwad/sdk/widget/h$a;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/kwad/sdk/widget/h$a;->cf(Z)Lcom/kwad/sdk/widget/h$a;

    move-result-object p1

    .line 4
    invoke-virtual {p1, v0}, Lcom/kwad/sdk/widget/h$a;->ci(Z)Lcom/kwad/sdk/widget/h$a;

    move-result-object p1

    .line 5
    invoke-virtual {p1, v1}, Lcom/kwad/sdk/widget/h$a;->ch(Z)Lcom/kwad/sdk/widget/h$a;

    move-result-object p1

    .line 6
    invoke-virtual {p1, v1}, Lcom/kwad/sdk/widget/h$a;->cg(Z)Lcom/kwad/sdk/widget/h$a;

    .line 7
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/h;->yA:Lcom/kwad/components/core/widget/KsConvertButton;

    invoke-virtual {p1}, Landroid/widget/Button;->postInvalidate()V

    return-void
.end method

.method private a(Lcom/kwad/components/ad/reward/model/a;)V
    .locals 5

    if-nez p1, :cond_0

    return-void

    .line 5
    :cond_0
    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/model/a;->hd()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/kwad/components/ad/reward/n/h;->S(I)V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/h;->mLogoView:Lcom/kwad/components/core/widget/KsLogoView;

    if-eqz v0, :cond_1

    .line 7
    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/model/a;->gZ()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/widget/KsLogoView;->aE(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 8
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/h;->yB:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/model/a;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/h;->yC:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    .line 10
    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/model/a;->gh()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    :cond_2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/h;->yD:Landroid/widget/TextView;

    const/4 v1, 0x0

    const/16 v2, 0x8

    if-eqz v0, :cond_6

    .line 12
    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/model/a;->gh()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/model/a;->gh()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/16 v0, 0x8

    :goto_0
    const/16 v3, 0x8

    goto :goto_1

    .line 14
    :cond_3
    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/model/a;->hc()Z

    move-result v0

    if-eqz v0, :cond_4

    const/16 v0, 0x8

    const/4 v3, 0x0

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    goto :goto_0

    .line 15
    :goto_1
    iget-object v4, p0, Lcom/kwad/components/ad/reward/n/h;->yC:Landroid/widget/TextView;

    if-eqz v4, :cond_5

    .line 16
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 17
    :cond_5
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/h;->yD:Landroid/widget/TextView;

    goto :goto_2

    .line 18
    :cond_6
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/h;->yC:Landroid/widget/TextView;

    if-eqz v0, :cond_8

    .line 19
    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/model/a;->gh()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_7

    const/16 v3, 0x8

    goto :goto_2

    :cond_7
    const/4 v3, 0x0

    :goto_2
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 20
    :cond_8
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/h;->yj:Lcom/kwad/components/ad/widget/KsAppTagsView;

    if-eqz v0, :cond_a

    .line 21
    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/model/a;->hb()Ljava/util/List;

    move-result-object v3

    iget v4, p0, Lcom/kwad/components/ad/reward/n/h;->yF:I

    invoke-virtual {v0, v3, v4}, Lcom/kwad/components/ad/widget/KsAppTagsView;->a(Ljava/util/List;I)V

    .line 22
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/h;->yj:Lcom/kwad/components/ad/widget/KsAppTagsView;

    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/model/a;->hc()Z

    move-result v3

    if-eqz v3, :cond_9

    const/16 v1, 0x8

    :cond_9
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 23
    :cond_a
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/h;->yA:Lcom/kwad/components/core/widget/KsConvertButton;

    if-eqz v0, :cond_b

    .line 24
    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/model/a;->ha()Lcom/kwad/components/core/e/d/c;

    move-result-object v1

    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/model/a;->gZ()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kwad/components/core/widget/KsConvertButton;->a(Lcom/kwad/components/core/e/d/c;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 25
    :cond_b
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/h;->yf:Landroid/widget/ImageView;

    .line 26
    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/model/a;->gg()Ljava/lang/String;

    move-result-object v1

    .line 27
    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/model/a;->gZ()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object p1

    const/16 v2, 0xc

    .line 28
    invoke-static {v0, v1, p1, v2}, Lcom/kwad/sdk/core/imageloader/KSImageLoader;->loadAppIcon(Landroid/widget/ImageView;Ljava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    return-void
.end method

.method private g(Landroid/view/ViewGroup;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    sget v0, Lcom/kwad/sdk/R$id;->ksad_common_app_logo:I

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/core/widget/KsLogoView;

    iput-object v0, p0, Lcom/kwad/components/ad/reward/n/h;->mLogoView:Lcom/kwad/components/core/widget/KsLogoView;

    .line 2
    sget v0, Lcom/kwad/sdk/R$id;->ksad_common_app_icon:I

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/kwad/components/ad/reward/n/h;->yf:Landroid/widget/ImageView;

    .line 3
    sget v0, Lcom/kwad/sdk/R$id;->ksad_common_app_name:I

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kwad/components/ad/reward/n/h;->yB:Landroid/widget/TextView;

    .line 4
    sget v0, Lcom/kwad/sdk/R$id;->ksad_common_app_tags:I

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/ad/widget/KsAppTagsView;

    iput-object v0, p0, Lcom/kwad/components/ad/reward/n/h;->yj:Lcom/kwad/components/ad/widget/KsAppTagsView;

    .line 5
    sget v0, Lcom/kwad/sdk/R$id;->ksad_common_app_desc:I

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kwad/components/ad/reward/n/h;->yC:Landroid/widget/TextView;

    .line 6
    sget v0, Lcom/kwad/sdk/R$id;->ksad_common_app_desc2:I

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kwad/components/ad/reward/n/h;->yD:Landroid/widget/TextView;

    .line 7
    sget v0, Lcom/kwad/sdk/R$id;->ksad_common_app_action:I

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/kwad/components/core/widget/KsConvertButton;

    iput-object p1, p0, Lcom/kwad/components/ad/reward/n/h;->yA:Lcom/kwad/components/core/widget/KsConvertButton;

    return-void
.end method

.method private static jV()I
    .locals 1

    .line 1
    sget v0, Lcom/kwad/sdk/R$id;->ksad_common_app_card_root:I

    return v0
.end method


# virtual methods
.method public final a(Lcom/kwad/components/ad/reward/n/h$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/reward/n/h;->yE:Lcom/kwad/components/ad/reward/n/h$a;

    return-void
.end method

.method protected final a(Lcom/kwad/components/ad/reward/n/r;)V
    .locals 1

    .line 2
    invoke-super {p0, p1}, Lcom/kwad/components/ad/reward/n/d;->a(Lcom/kwad/components/ad/reward/n/r;)V

    .line 3
    iget-boolean v0, p0, Lcom/kwad/components/ad/reward/n/h;->yG:Z

    invoke-static {p1, v0}, Lcom/kwad/components/ad/reward/model/a;->a(Lcom/kwad/components/ad/reward/n/r;Z)Lcom/kwad/components/ad/reward/model/a;

    move-result-object p1

    .line 4
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/reward/n/h;->a(Lcom/kwad/components/ad/reward/model/a;)V

    return-void
.end method

.method public final f(Landroid/view/ViewGroup;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/kwad/components/ad/reward/n/h;->hZ()I

    move-result v0

    invoke-static {}, Lcom/kwad/components/ad/reward/n/h;->jV()I

    move-result v1

    invoke-super {p0, p1, v0, v1}, Lcom/kwad/components/ad/reward/n/s;->a(Landroid/view/ViewGroup;II)V

    .line 2
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/s;->sA:Landroid/view/ViewGroup;

    invoke-direct {p0, p1}, Lcom/kwad/components/ad/reward/n/h;->g(Landroid/view/ViewGroup;)V

    .line 3
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/s;->sA:Landroid/view/ViewGroup;

    if-eqz p1, :cond_2

    .line 4
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 5
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/h;->yA:Lcom/kwad/components/core/widget/KsConvertButton;

    invoke-virtual {p1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 6
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/h;->yf:Landroid/widget/ImageView;

    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 7
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/h;->yB:Landroid/widget/TextView;

    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/h;->yC:Landroid/widget/TextView;

    if-eqz p1, :cond_0

    .line 9
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 10
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/h;->yD:Landroid/widget/TextView;

    if-eqz p1, :cond_1

    .line 11
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 12
    :cond_1
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/h;->yj:Lcom/kwad/components/ad/widget/KsAppTagsView;

    if-eqz p1, :cond_2

    .line 13
    invoke-virtual {p1, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    return-void
.end method

.method protected hZ()I
    .locals 1

    .line 1
    sget v0, Lcom/kwad/sdk/R$id;->ksad_common_app_card_stub:I

    return v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/h;->yA:Lcom/kwad/components/core/widget/KsConvertButton;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/h;->yE:Lcom/kwad/components/ad/reward/n/h$a;

    if-eqz p1, :cond_6

    .line 3
    invoke-interface {p1}, Lcom/kwad/components/ad/reward/n/h$a;->ia()V

    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/h;->yf:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/h;->yE:Lcom/kwad/components/ad/reward/n/h$a;

    if-eqz p1, :cond_6

    .line 6
    invoke-interface {p1}, Lcom/kwad/components/ad/reward/n/h$a;->ib()V

    return-void

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/h;->yB:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 8
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/h;->yE:Lcom/kwad/components/ad/reward/n/h$a;

    if-eqz p1, :cond_6

    .line 9
    invoke-interface {p1}, Lcom/kwad/components/ad/reward/n/h$a;->ic()V

    return-void

    .line 10
    :cond_2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/h;->yC:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/h;->yD:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    .line 11
    :cond_3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/h;->yj:Lcom/kwad/components/ad/widget/KsAppTagsView;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 12
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/h;->yE:Lcom/kwad/components/ad/reward/n/h$a;

    if-eqz p1, :cond_6

    .line 13
    invoke-interface {p1}, Lcom/kwad/components/ad/reward/n/h$a;->ie()V

    return-void

    .line 14
    :cond_4
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/s;->sA:Landroid/view/ViewGroup;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 15
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/h;->yE:Lcom/kwad/components/ad/reward/n/h$a;

    if-eqz p1, :cond_6

    .line 16
    invoke-interface {p1}, Lcom/kwad/components/ad/reward/n/h$a;->if()V

    goto :goto_1

    .line 17
    :cond_5
    :goto_0
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/h;->yE:Lcom/kwad/components/ad/reward/n/h$a;

    if-eqz p1, :cond_6

    .line 18
    invoke-interface {p1}, Lcom/kwad/components/ad/reward/n/h$a;->id()V

    :cond_6
    :goto_1
    return-void
.end method

.method public final show()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/s;->sA:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_0
    return-void
.end method
