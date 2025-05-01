.class public final Lcom/kwad/components/ad/reward/n/m;
.super Lcom/kwad/components/ad/reward/n/d;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private fq:Landroid/widget/ImageView;

.field private hz:Landroid/widget/TextView;

.field private pQ:Lcom/kwad/components/ad/reward/h$a;

.field private zc:Landroid/app/DialogFragment;

.field private zf:Landroid/view/View;

.field private zu:Landroid/view/ViewGroup;

.field private zv:Landroid/view/View;

.field private zw:Landroid/widget/TextView;

.field private zx:Landroid/widget/TextView;

.field private zy:Landroid/widget/TextView;

.field private zz:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/app/DialogFragment;Lcom/kwad/sdk/core/response/model/AdTemplate;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/kwad/components/ad/reward/h$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/n/d;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kwad/components/ad/reward/n/m;->zc:Landroid/app/DialogFragment;

    .line 3
    iput-object p5, p0, Lcom/kwad/components/ad/reward/n/m;->pQ:Lcom/kwad/components/ad/reward/h$a;

    .line 4
    invoke-static {p2}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object p1

    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->cM(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p1

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    .line 5
    sget p1, Lcom/kwad/sdk/R$layout;->ksad_live_origin_dialog:I

    invoke-virtual {p3, p1, p4, p2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, Lcom/kwad/components/ad/reward/n/m;->zu:Landroid/view/ViewGroup;

    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/reward/n/m;->s(Z)V

    return-void

    .line 7
    :cond_0
    sget p1, Lcom/kwad/sdk/R$layout;->ksad_live_subscribe_dialog:I

    invoke-virtual {p3, p1, p4, p2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, Lcom/kwad/components/ad/reward/n/m;->zu:Landroid/view/ViewGroup;

    .line 8
    invoke-direct {p0, p2}, Lcom/kwad/components/ad/reward/n/m;->s(Z)V

    return-void
.end method

.method private s(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/m;->zu:Landroid/view/ViewGroup;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_live_subscribe_dialog_btn_close:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/reward/n/m;->zv:Landroid/view/View;

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/m;->zu:Landroid/view/ViewGroup;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_live_subscribe_dialog_title:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kwad/components/ad/reward/n/m;->hz:Landroid/widget/TextView;

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/m;->zu:Landroid/view/ViewGroup;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_live_subscribe_dialog_icon:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/kwad/components/ad/reward/n/m;->fq:Landroid/widget/ImageView;

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/m;->zu:Landroid/view/ViewGroup;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_live_subscribe_dialog_content_txt:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kwad/components/ad/reward/n/m;->zx:Landroid/widget/TextView;

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/m;->zu:Landroid/view/ViewGroup;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_live_subscribe_dialog_content:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kwad/components/ad/reward/n/m;->zw:Landroid/widget/TextView;

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/m;->zu:Landroid/view/ViewGroup;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_live_subscribe_dialog_btn_continue:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/reward/n/m;->zf:Landroid/view/View;

    .line 7
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/m;->zu:Landroid/view/ViewGroup;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_live_subscribe_dialog_btn_deny:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/reward/n/m;->zz:Landroid/view/View;

    .line 8
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/m;->zu:Landroid/view/ViewGroup;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_live_subscribe_dialog_vide_detail:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kwad/components/ad/reward/n/m;->zy:Landroid/widget/TextView;

    if-eqz p1, :cond_0

    .line 9
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/m;->zv:Landroid/view/View;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 10
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/m;->zv:Landroid/view/View;

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 11
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/m;->zf:Landroid/view/View;

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 12
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/m;->zz:Landroid/view/View;

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 13
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/m;->zy:Landroid/widget/TextView;

    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/components/ad/reward/h$c;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/h$c;->gg()Ljava/lang/String;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/kwad/components/ad/reward/n/m;->zu:Landroid/view/ViewGroup;

    .line 3
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/kwad/sdk/R$drawable;->ksad_ic_default_user_avatar:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 4
    iget-object v2, p0, Lcom/kwad/components/ad/reward/n/m;->fq:Landroid/widget/ImageView;

    invoke-static {v2, v0, v1}, Lcom/kwad/sdk/core/imageloader/KSImageLoader;->loadCircleIcon(Landroid/widget/ImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V

    .line 5
    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/h$c;->getTitle()Ljava/lang/String;

    move-result-object v0

    .line 6
    iget-object v1, p0, Lcom/kwad/components/ad/reward/n/m;->hz:Landroid/widget/TextView;

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    .line 7
    new-instance v1, Landroid/text/SpannableString;

    invoke-direct {v1, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 8
    invoke-virtual {p0}, Lcom/kwad/components/ad/reward/n/m;->gG()Landroid/view/ViewGroup;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/kwad/sdk/R$color;->ksad_reward_main_color:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 9
    new-instance v3, Landroid/text/style/ForegroundColorSpan;

    invoke-direct {v3, v2}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    const/4 v4, 0x4

    const/4 v5, 0x2

    const/16 v6, 0x12

    .line 10
    invoke-virtual {v1, v3, v5, v4, v6}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 11
    new-instance v3, Landroid/text/style/ForegroundColorSpan;

    invoke-direct {v3, v2}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 12
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    add-int/lit8 v2, v0, -0x2

    .line 13
    invoke-virtual {v1, v3, v2, v0, v6}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 14
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/m;->hz:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 15
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/m;->zw:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/h$c;->gh()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 16
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/m;->zx:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/h$c;->gi()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 17
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/m;->zy:Landroid/widget/TextView;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object p1, p1, Lcom/kwad/components/ad/reward/h$c;->pZ:Ljava/lang/String;

    aput-object p1, v1, v2

    const-string p1, "%s"

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final gG()Landroid/view/ViewGroup;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/m;->zu:Landroid/view/ViewGroup;

    return-object v0
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/m;->zv:Landroid/view/View;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/m;->zc:Landroid/app/DialogFragment;

    invoke-virtual {p1}, Landroid/app/DialogFragment;->dismiss()V

    .line 3
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/m;->pQ:Lcom/kwad/components/ad/reward/h$a;

    if-eqz p1, :cond_3

    .line 4
    invoke-interface {p1}, Lcom/kwad/components/core/webview/tachikoma/e/c;->gb()V

    return-void

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/m;->zf:Landroid/view/View;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/m;->zc:Landroid/app/DialogFragment;

    invoke-virtual {p1}, Landroid/app/DialogFragment;->dismiss()V

    .line 7
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/m;->pQ:Lcom/kwad/components/ad/reward/h$a;

    if-eqz p1, :cond_3

    .line 8
    invoke-interface {p1}, Lcom/kwad/components/core/webview/tachikoma/e/c;->gb()V

    return-void

    .line 9
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/m;->zz:Landroid/view/View;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 10
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/m;->zc:Landroid/app/DialogFragment;

    invoke-virtual {p1}, Landroid/app/DialogFragment;->dismiss()V

    .line 11
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/m;->pQ:Lcom/kwad/components/ad/reward/h$a;

    if-eqz p1, :cond_3

    const/4 v0, 0x0

    .line 12
    invoke-interface {p1, v0}, Lcom/kwad/components/core/webview/tachikoma/e/c;->F(Z)V

    return-void

    .line 13
    :cond_2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/m;->zy:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 14
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/m;->pQ:Lcom/kwad/components/ad/reward/h$a;

    if-eqz p1, :cond_3

    const/16 v0, 0x83

    const/4 v1, 0x2

    .line 15
    invoke-interface {p1, v0, v1}, Lcom/kwad/components/ad/reward/h$a;->g(II)V

    :cond_3
    return-void
.end method
