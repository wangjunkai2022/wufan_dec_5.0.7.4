.class public final Lcom/kwad/components/ad/reward/n/j;
.super Lcom/kwad/components/ad/reward/n/d;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private adTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

.field private hz:Landroid/widget/TextView;

.field private lv:Lcom/kwad/components/core/widget/KSCornerImageView;

.field private lw:Landroid/widget/TextView;

.field private lx:Landroid/widget/TextView;

.field private pQ:Lcom/kwad/components/ad/reward/h$a;

.field private sA:Landroid/view/ViewGroup;

.field private vp:Landroid/view/View;

.field private zc:Landroid/app/DialogFragment;

.field private zd:Landroid/widget/TextView;

.field private ze:Landroid/view/View;

.field private zf:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/app/DialogFragment;Lcom/kwad/sdk/core/response/model/AdTemplate;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/kwad/components/ad/reward/h$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/n/d;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kwad/components/ad/reward/n/j;->zc:Landroid/app/DialogFragment;

    .line 3
    iput-object p2, p0, Lcom/kwad/components/ad/reward/n/j;->adTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 4
    iput-object p5, p0, Lcom/kwad/components/ad/reward/n/j;->pQ:Lcom/kwad/components/ad/reward/h$a;

    .line 5
    sget p1, Lcom/kwad/sdk/R$layout;->ksad_reward_jinniu_dialog:I

    const/4 p2, 0x0

    invoke-virtual {p3, p1, p4, p2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, Lcom/kwad/components/ad/reward/n/j;->sA:Landroid/view/ViewGroup;

    .line 6
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/n/j;->initView()V

    return-void
.end method

.method private initView()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/j;->sA:Landroid/view/ViewGroup;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_reward_jinniu_dialog_icon:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/core/widget/KSCornerImageView;

    iput-object v0, p0, Lcom/kwad/components/ad/reward/n/j;->lv:Lcom/kwad/components/core/widget/KSCornerImageView;

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/j;->sA:Landroid/view/ViewGroup;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_reward_jinniu_dialog_title:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kwad/components/ad/reward/n/j;->hz:Landroid/widget/TextView;

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/j;->sA:Landroid/view/ViewGroup;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_reward_jinniu_dialog_desc:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kwad/components/ad/reward/n/j;->lw:Landroid/widget/TextView;

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/j;->sA:Landroid/view/ViewGroup;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_reward_jinniu_dialog_play_time_tips:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kwad/components/ad/reward/n/j;->zd:Landroid/widget/TextView;

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/j;->sA:Landroid/view/ViewGroup;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_reward_jinniu_dialog_detail:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kwad/components/ad/reward/n/j;->lx:Landroid/widget/TextView;

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/j;->sA:Landroid/view/ViewGroup;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_reward_jinniu_dialog_btn_close:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/reward/n/j;->vp:Landroid/view/View;

    .line 7
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/j;->sA:Landroid/view/ViewGroup;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_reward_jinniu_dialog_btn_deny:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/reward/n/j;->ze:Landroid/view/View;

    .line 8
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/j;->sA:Landroid/view/ViewGroup;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_reward_jinniu_dialog_btn_continue:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/reward/n/j;->zf:Landroid/view/View;

    .line 9
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/j;->vp:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 10
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/j;->ze:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 11
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/j;->zf:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 12
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/j;->lv:Lcom/kwad/components/core/widget/KSCornerImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 13
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/j;->hz:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 14
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/j;->lw:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/j;->lx:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/components/ad/reward/h$c;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/j;->lv:Lcom/kwad/components/core/widget/KSCornerImageView;

    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/h$c;->gg()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/kwad/components/ad/reward/n/j;->adTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/4 v3, 0x4

    invoke-static {v0, v1, v2, v3}, Lcom/kwad/sdk/core/imageloader/KSImageLoader;->loadAppIcon(Landroid/widget/ImageView;Ljava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/j;->hz:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/h$c;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/j;->lw:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/h$c;->gh()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/j;->zd:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/h$c;->gj()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 5
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/j;->adTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->cd(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 6
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/j;->lx:Landroid/widget/TextView;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/kwad/components/ad/reward/n/j;->adTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v2

    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/a;->aD(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const-string v1, "%s >"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public final gG()Landroid/view/ViewGroup;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/j;->sA:Landroid/view/ViewGroup;

    return-object v0
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/j;->vp:Landroid/view/View;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/j;->zc:Landroid/app/DialogFragment;

    invoke-virtual {p1}, Landroid/app/DialogFragment;->dismiss()V

    .line 3
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/j;->pQ:Lcom/kwad/components/ad/reward/h$a;

    if-eqz p1, :cond_6

    .line 4
    invoke-interface {p1}, Lcom/kwad/components/core/webview/tachikoma/e/c;->gb()V

    return-void

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/j;->ze:Landroid/view/View;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/j;->zc:Landroid/app/DialogFragment;

    invoke-virtual {p1}, Landroid/app/DialogFragment;->dismiss()V

    .line 7
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/j;->pQ:Lcom/kwad/components/ad/reward/h$a;

    if-eqz p1, :cond_6

    const/4 v0, 0x0

    .line 8
    invoke-interface {p1, v0}, Lcom/kwad/components/core/webview/tachikoma/e/c;->F(Z)V

    return-void

    .line 9
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/j;->zf:Landroid/view/View;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 10
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/j;->zc:Landroid/app/DialogFragment;

    invoke-virtual {p1}, Landroid/app/DialogFragment;->dismiss()V

    .line 11
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/j;->pQ:Lcom/kwad/components/ad/reward/h$a;

    if-eqz p1, :cond_6

    .line 12
    invoke-interface {p1}, Lcom/kwad/components/core/webview/tachikoma/e/c;->gb()V

    return-void

    .line 13
    :cond_2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/j;->lv:Lcom/kwad/components/core/widget/KSCornerImageView;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_3

    .line 14
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/j;->pQ:Lcom/kwad/components/ad/reward/h$a;

    if-eqz p1, :cond_6

    const/16 v0, 0x7f

    .line 15
    invoke-interface {p1, v0, v1}, Lcom/kwad/components/ad/reward/h$a;->g(II)V

    return-void

    .line 16
    :cond_3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/j;->hz:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 17
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/j;->pQ:Lcom/kwad/components/ad/reward/h$a;

    if-eqz p1, :cond_6

    const/16 v0, 0x80

    .line 18
    invoke-interface {p1, v0, v1}, Lcom/kwad/components/ad/reward/h$a;->g(II)V

    return-void

    .line 19
    :cond_4
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/j;->lw:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 20
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/j;->pQ:Lcom/kwad/components/ad/reward/h$a;

    if-eqz p1, :cond_6

    const/16 v0, 0x81

    .line 21
    invoke-interface {p1, v0, v1}, Lcom/kwad/components/ad/reward/h$a;->g(II)V

    return-void

    .line 22
    :cond_5
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/j;->lx:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 23
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/j;->pQ:Lcom/kwad/components/ad/reward/h$a;

    if-eqz p1, :cond_6

    const/16 v0, 0x83

    .line 24
    invoke-interface {p1, v0, v1}, Lcom/kwad/components/ad/reward/h$a;->g(II)V

    :cond_6
    return-void
.end method
