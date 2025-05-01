.class public final Lcom/kwad/components/ad/interstitial/g/d;
.super Lcom/kwad/sdk/widget/KSFrameLayout;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/widget/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/ad/interstitial/g/d$a;
    }
.end annotation


# instance fields
.field private dE:Landroid/widget/ImageView;

.field private eF:Landroid/widget/TextView;

.field private eM:Landroid/widget/ImageView;

.field private kL:Lcom/kwad/sdk/widget/KSFrameLayout;

.field private kr:Lcom/kwad/sdk/widget/KSFrameLayout;

.field private lF:Ljava/lang/String;

.field private lG:Landroid/view/View;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private lH:Landroid/widget/ImageView;

.field private lI:Lcom/kwad/components/core/page/widget/TextProgressBar;

.field private lJ:Landroid/view/ViewGroup;

.field private lK:Landroid/view/ViewGroup;

.field private lL:Landroid/widget/ImageView;

.field private lM:Landroid/view/View;

.field private lN:Landroid/view/View;

.field private lO:Landroid/widget/TextView;

.field private lP:Landroid/widget/ImageView;

.field private lQ:Landroid/widget/TextView;

.field private lR:Landroid/widget/TextView;

.field private lS:Landroid/widget/TextView;

.field private lT:Lcom/kwad/components/core/page/widget/TextProgressBar;

.field private lU:Landroid/widget/TextView;

.field private lV:Lcom/kwad/components/ad/interstitial/g/e;

.field private final lW:Lcom/kwad/components/ad/interstitial/g/d$a;

.field private lX:Z

.field private mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

.field private mLogoView:Lcom/kwad/components/core/widget/KsLogoView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/kwad/components/ad/interstitial/g/d$a;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/sdk/widget/KSFrameLayout;-><init>(Landroid/content/Context;)V

    const-string v0, "%s\u79d2\u540e\u8fdb\u5165\u8bd5\u73a9\u9875"

    .line 2
    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->lF:Ljava/lang/String;

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->lX:Z

    .line 4
    iput-object p2, p0, Lcom/kwad/components/ad/interstitial/g/d;->lW:Lcom/kwad/components/ad/interstitial/g/d$a;

    .line 5
    invoke-virtual {p2}, Lcom/kwad/components/ad/interstitial/g/d$a;->el()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6
    sget v0, Lcom/kwad/sdk/R$layout;->ksad_interstitial_native_above:I

    goto :goto_0

    .line 7
    :cond_0
    sget v0, Lcom/kwad/sdk/R$layout;->ksad_interstitial_native:I

    .line 8
    :goto_0
    invoke-static {p1, v0, p0}, Lcom/kwad/sdk/n/l;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 9
    invoke-static {p2}, Lcom/kwad/components/ad/interstitial/g/d$a;->a(Lcom/kwad/components/ad/interstitial/g/d$a;)Z

    move-result p1

    invoke-direct {p0, p1}, Lcom/kwad/components/ad/interstitial/g/d;->s(Z)V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/interstitial/g/d;)Landroid/widget/ImageView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/g/d;->lL:Landroid/widget/ImageView;

    return-object p0
.end method

.method private a(Landroid/view/View;II)V
    .locals 2

    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 6
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    int-to-float p2, p2

    invoke-static {v1, p2}, Lcom/kwad/sdk/c/a/a;->a(Landroid/content/Context;F)I

    move-result p2

    iput p2, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 7
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object p2

    int-to-float p3, p3

    invoke-static {p2, p3}, Lcom/kwad/sdk/c/a/a;->a(Landroid/content/Context;F)I

    move-result p2

    iput p2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 8
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private a(Lcom/kwad/sdk/widget/KSFrameLayout;Z)V
    .locals 2

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setClickable(Z)V

    .line 3
    new-instance v1, Lcom/kwad/sdk/widget/f;

    invoke-direct {v1, p1, p0}, Lcom/kwad/sdk/widget/f;-><init>(Landroid/view/View;Lcom/kwad/sdk/widget/c;)V

    .line 4
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/d;->kL:Lcom/kwad/sdk/widget/KSFrameLayout;

    xor-int/2addr p2, v0

    invoke-virtual {p1, p2}, Lcom/kwad/sdk/widget/KSFrameLayout;->setWidthBasedRatio(Z)V

    return-void
.end method

.method static synthetic b(Lcom/kwad/components/ad/interstitial/g/d;)Lcom/kwad/components/ad/interstitial/g/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/g/d;->lV:Lcom/kwad/components/ad/interstitial/g/e;

    return-object p0
.end method

.method private b(Landroid/view/View;Z)V
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->lV:Lcom/kwad/components/ad/interstitial/g/e;

    if-eqz v0, :cond_0

    .line 6
    invoke-interface {v0, p2}, Lcom/kwad/components/ad/interstitial/g/e;->p(Z)V

    .line 7
    iget-object p2, p0, Lcom/kwad/components/ad/interstitial/g/d;->lV:Lcom/kwad/components/ad/interstitial/g/e;

    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->kr:Lcom/kwad/sdk/widget/KSFrameLayout;

    invoke-interface {p2, v0}, Lcom/kwad/components/ad/interstitial/g/e;->a(Lcom/kwad/sdk/widget/KSFrameLayout;)V

    .line 8
    :cond_0
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 9
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lV:Lcom/kwad/components/ad/interstitial/g/e;

    if-eqz p1, :cond_10

    .line 10
    invoke-interface {p1}, Lcom/kwad/components/ad/interstitial/g/e;->dh()V

    return-void

    .line 11
    :cond_1
    iget-object p2, p0, Lcom/kwad/components/ad/interstitial/g/d;->lM:Landroid/view/View;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    .line 12
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lW:Lcom/kwad/components/ad/interstitial/g/d$a;

    invoke-virtual {p1}, Lcom/kwad/components/ad/interstitial/g/d$a;->ek()I

    move-result p1

    const/4 p2, 0x1

    if-ne p2, p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_3

    .line 13
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lV:Lcom/kwad/components/ad/interstitial/g/e;

    if-eqz p1, :cond_3

    .line 14
    invoke-interface {p1}, Lcom/kwad/components/ad/interstitial/g/e;->dg()V

    :cond_3
    return-void

    .line 15
    :cond_4
    iget-object p2, p0, Lcom/kwad/components/ad/interstitial/g/d;->lT:Lcom/kwad/components/core/page/widget/TextProgressBar;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_5

    .line 16
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lV:Lcom/kwad/components/ad/interstitial/g/e;

    if-eqz p1, :cond_10

    .line 17
    invoke-interface {p1}, Lcom/kwad/components/ad/interstitial/g/e;->di()V

    return-void

    .line 18
    :cond_5
    iget-object p2, p0, Lcom/kwad/components/ad/interstitial/g/d;->lK:Landroid/view/ViewGroup;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_6

    .line 19
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lV:Lcom/kwad/components/ad/interstitial/g/e;

    if-eqz p1, :cond_10

    .line 20
    invoke-interface {p1}, Lcom/kwad/components/ad/interstitial/g/e;->dt()V

    return-void

    .line 21
    :cond_6
    iget-object p2, p0, Lcom/kwad/components/ad/interstitial/g/d;->lI:Lcom/kwad/components/core/page/widget/TextProgressBar;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_7

    .line 22
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lV:Lcom/kwad/components/ad/interstitial/g/e;

    if-eqz p1, :cond_10

    .line 23
    invoke-interface {p1}, Lcom/kwad/components/ad/interstitial/g/e;->dj()V

    return-void

    .line 24
    :cond_7
    iget-object p2, p0, Lcom/kwad/components/ad/interstitial/g/d;->lN:Landroid/view/View;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_8

    .line 25
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lV:Lcom/kwad/components/ad/interstitial/g/e;

    if-eqz p1, :cond_10

    .line 26
    invoke-interface {p1}, Lcom/kwad/components/ad/interstitial/g/e;->dm()V

    return-void

    .line 27
    :cond_8
    iget-object p2, p0, Lcom/kwad/components/ad/interstitial/g/d;->kL:Lcom/kwad/sdk/widget/KSFrameLayout;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_9

    .line 28
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lV:Lcom/kwad/components/ad/interstitial/g/e;

    if-eqz p1, :cond_10

    .line 29
    invoke-interface {p1}, Lcom/kwad/components/ad/interstitial/g/e;->dk()V

    return-void

    .line 30
    :cond_9
    iget-object p2, p0, Lcom/kwad/components/ad/interstitial/g/d;->eM:Landroid/widget/ImageView;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_a

    .line 31
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lV:Lcom/kwad/components/ad/interstitial/g/e;

    if-eqz p1, :cond_10

    .line 32
    invoke-interface {p1}, Lcom/kwad/components/ad/interstitial/g/e;->dl()V

    return-void

    .line 33
    :cond_a
    iget-object p2, p0, Lcom/kwad/components/ad/interstitial/g/d;->dE:Landroid/widget/ImageView;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_b

    .line 34
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lV:Lcom/kwad/components/ad/interstitial/g/e;

    if-eqz p1, :cond_10

    .line 35
    invoke-interface {p1}, Lcom/kwad/components/ad/interstitial/g/e;->dn()V

    return-void

    .line 36
    :cond_b
    iget-object p2, p0, Lcom/kwad/components/ad/interstitial/g/d;->lQ:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_c

    .line 37
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lV:Lcom/kwad/components/ad/interstitial/g/e;

    if-eqz p1, :cond_10

    .line 38
    invoke-interface {p1}, Lcom/kwad/components/ad/interstitial/g/e;->do()V

    return-void

    .line 39
    :cond_c
    iget-object p2, p0, Lcom/kwad/components/ad/interstitial/g/d;->eF:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_d

    .line 40
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lV:Lcom/kwad/components/ad/interstitial/g/e;

    if-eqz p1, :cond_10

    .line 41
    invoke-interface {p1}, Lcom/kwad/components/ad/interstitial/g/e;->dp()V

    return-void

    .line 42
    :cond_d
    iget-object p2, p0, Lcom/kwad/components/ad/interstitial/g/d;->lP:Landroid/widget/ImageView;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_e

    .line 43
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lV:Lcom/kwad/components/ad/interstitial/g/e;

    if-eqz p1, :cond_10

    .line 44
    invoke-interface {p1}, Lcom/kwad/components/ad/interstitial/g/e;->dq()V

    return-void

    .line 45
    :cond_e
    iget-object p2, p0, Lcom/kwad/components/ad/interstitial/g/d;->lR:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_f

    .line 46
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lV:Lcom/kwad/components/ad/interstitial/g/e;

    if-eqz p1, :cond_10

    .line 47
    invoke-interface {p1}, Lcom/kwad/components/ad/interstitial/g/e;->dr()V

    return-void

    .line 48
    :cond_f
    iget-object p2, p0, Lcom/kwad/components/ad/interstitial/g/d;->lS:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_10

    .line 49
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lV:Lcom/kwad/components/ad/interstitial/g/e;

    if-eqz p1, :cond_10

    .line 50
    invoke-interface {p1}, Lcom/kwad/components/ad/interstitial/g/e;->ds()V

    :cond_10
    return-void
.end method

.method private d(Landroid/view/View;I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    int-to-float p2, p2

    invoke-static {v0, p2}, Lcom/kwad/sdk/c/a/a;->a(Landroid/content/Context;F)I

    move-result p2

    const/4 v0, 0x0

    invoke-static {p1, v0, p2, v0, v0}, Lcom/kwad/sdk/c/a/a;->b(Landroid/view/View;IIII)V

    return-void
.end method

.method private ee()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->lP:Landroid/widget/ImageView;

    const/16 v1, 0x28

    invoke-direct {p0, v0, v1, v1}, Lcom/kwad/components/ad/interstitial/g/d;->a(Landroid/view/View;II)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->lT:Lcom/kwad/components/core/page/widget/TextProgressBar;

    const/16 v1, 0x82

    const/16 v2, 0x1e

    invoke-direct {p0, v0, v1, v2}, Lcom/kwad/components/ad/interstitial/g/d;->a(Landroid/view/View;II)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->lR:Landroid/widget/TextView;

    const/high16 v1, 0x41600000    # 14.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->lT:Lcom/kwad/components/core/page/widget/TextProgressBar;

    const/16 v1, 0xb

    invoke-direct {p0, v0, v1}, Lcom/kwad/components/ad/interstitial/g/d;->d(Landroid/view/View;I)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->lR:Landroid/widget/TextView;

    const/4 v1, 0x7

    invoke-direct {p0, v0, v1}, Lcom/kwad/components/ad/interstitial/g/d;->d(Landroid/view/View;I)V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->lS:Landroid/widget/TextView;

    invoke-direct {p0, v0, v1}, Lcom/kwad/components/ad/interstitial/g/d;->d(Landroid/view/View;I)V

    return-void
.end method

.method private s(Z)V
    .locals 3

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->setClickable(Z)V

    .line 2
    sget v0, Lcom/kwad/sdk/R$id;->ksad_interstitial_native_container:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/widget/KSFrameLayout;

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->kr:Lcom/kwad/sdk/widget/KSFrameLayout;

    .line 3
    sget v0, Lcom/kwad/sdk/R$id;->ksad_interstitial_native_video_container:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/widget/KSFrameLayout;

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->kL:Lcom/kwad/sdk/widget/KSFrameLayout;

    .line 4
    sget v0, Lcom/kwad/sdk/R$id;->ksad_interstitial_full_bg:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->lG:Landroid/view/View;

    .line 5
    sget v0, Lcom/kwad/sdk/R$id;->ksad_interstitial_tail_frame:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->lH:Landroid/widget/ImageView;

    .line 6
    sget v0, Lcom/kwad/sdk/R$id;->ksad_video_first_frame_container:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->eM:Landroid/widget/ImageView;

    .line 7
    sget v0, Lcom/kwad/sdk/R$id;->ksad_ad_interstitial_logo:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/core/widget/KsLogoView;

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->mLogoView:Lcom/kwad/components/core/widget/KsLogoView;

    .line 8
    sget v0, Lcom/kwad/sdk/R$id;->ksad_interstitial_playing:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->lJ:Landroid/view/ViewGroup;

    .line 9
    sget v0, Lcom/kwad/sdk/R$id;->ksad_interstitial_play_end:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->lK:Landroid/view/ViewGroup;

    .line 10
    sget v0, Lcom/kwad/sdk/R$id;->ksad_interstitial_download_btn:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/core/page/widget/TextProgressBar;

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->lI:Lcom/kwad/components/core/page/widget/TextProgressBar;

    .line 11
    sget v0, Lcom/kwad/sdk/R$id;->ksad_interstitial_close_outer:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->lM:Landroid/view/View;

    .line 12
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->lI:Lcom/kwad/components/core/page/widget/TextProgressBar;

    if-eqz v0, :cond_0

    .line 13
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    const/high16 v2, 0x41200000    # 10.0f

    invoke-static {v1, v2}, Lcom/kwad/sdk/c/a/a;->a(Landroid/content/Context;F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/page/widget/TextProgressBar;->setTextDimen(F)V

    .line 14
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->lI:Lcom/kwad/components/core/page/widget/TextProgressBar;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/page/widget/TextProgressBar;->setTextColor(I)V

    .line 15
    :cond_0
    sget v0, Lcom/kwad/sdk/R$id;->ksad_interstitial_mute:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->lL:Landroid/widget/ImageView;

    .line 16
    sget v0, Lcom/kwad/sdk/R$id;->ksad_interstitial_count_down:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->lO:Landroid/widget/TextView;

    .line 17
    sget v0, Lcom/kwad/sdk/R$id;->ksad_interstitial_logo:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->lP:Landroid/widget/ImageView;

    .line 18
    sget v0, Lcom/kwad/sdk/R$id;->ksad_interstitial_name:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->lR:Landroid/widget/TextView;

    .line 19
    sget v0, Lcom/kwad/sdk/R$id;->ksad_interstitial_desc:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->lS:Landroid/widget/TextView;

    .line 20
    sget v0, Lcom/kwad/sdk/R$id;->ksad_app_download_btn:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/core/page/widget/TextProgressBar;

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->lT:Lcom/kwad/components/core/page/widget/TextProgressBar;

    .line 21
    sget v0, Lcom/kwad/sdk/R$id;->ksad_ad_download_container:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->lN:Landroid/view/View;

    .line 22
    sget v0, Lcom/kwad/sdk/R$id;->ksad_app_icon:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->dE:Landroid/widget/ImageView;

    .line 23
    sget v0, Lcom/kwad/sdk/R$id;->ksad_app_title:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->lQ:Landroid/widget/TextView;

    .line 24
    sget v0, Lcom/kwad/sdk/R$id;->ksad_app_desc:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->eF:Landroid/widget/TextView;

    .line 25
    new-instance v0, Lcom/kwad/sdk/widget/f;

    invoke-direct {v0, p0, p0}, Lcom/kwad/sdk/widget/f;-><init>(Landroid/view/View;Lcom/kwad/sdk/widget/c;)V

    .line 26
    new-instance v0, Lcom/kwad/sdk/widget/f;

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/g/d;->eM:Landroid/widget/ImageView;

    invoke-direct {v0, v1, p0}, Lcom/kwad/sdk/widget/f;-><init>(Landroid/view/View;Lcom/kwad/sdk/widget/c;)V

    .line 27
    new-instance v0, Lcom/kwad/sdk/widget/f;

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lI:Lcom/kwad/components/core/page/widget/TextProgressBar;

    invoke-direct {v0, v1, p0}, Lcom/kwad/sdk/widget/f;-><init>(Landroid/view/View;Lcom/kwad/sdk/widget/c;)V

    .line 28
    new-instance v0, Lcom/kwad/sdk/widget/f;

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lT:Lcom/kwad/components/core/page/widget/TextProgressBar;

    invoke-direct {v0, v1, p0}, Lcom/kwad/sdk/widget/f;-><init>(Landroid/view/View;Lcom/kwad/sdk/widget/c;)V

    .line 29
    new-instance v0, Lcom/kwad/sdk/widget/f;

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lM:Landroid/view/View;

    invoke-direct {v0, v1, p0}, Lcom/kwad/sdk/widget/f;-><init>(Landroid/view/View;Lcom/kwad/sdk/widget/c;)V

    .line 30
    new-instance v0, Lcom/kwad/sdk/widget/f;

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lK:Landroid/view/ViewGroup;

    invoke-direct {v0, v1, p0}, Lcom/kwad/sdk/widget/f;-><init>(Landroid/view/View;Lcom/kwad/sdk/widget/c;)V

    .line 31
    new-instance v0, Lcom/kwad/sdk/widget/f;

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lO:Landroid/widget/TextView;

    invoke-direct {v0, v1, p0}, Lcom/kwad/sdk/widget/f;-><init>(Landroid/view/View;Lcom/kwad/sdk/widget/c;)V

    .line 32
    new-instance v0, Lcom/kwad/sdk/widget/f;

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lN:Landroid/view/View;

    invoke-direct {v0, v1, p0}, Lcom/kwad/sdk/widget/f;-><init>(Landroid/view/View;Lcom/kwad/sdk/widget/c;)V

    .line 33
    new-instance v0, Lcom/kwad/sdk/widget/f;

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/g/d;->dE:Landroid/widget/ImageView;

    invoke-direct {v0, v1, p0}, Lcom/kwad/sdk/widget/f;-><init>(Landroid/view/View;Lcom/kwad/sdk/widget/c;)V

    .line 34
    new-instance v0, Lcom/kwad/sdk/widget/f;

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lQ:Landroid/widget/TextView;

    invoke-direct {v0, v1, p0}, Lcom/kwad/sdk/widget/f;-><init>(Landroid/view/View;Lcom/kwad/sdk/widget/c;)V

    .line 35
    new-instance v0, Lcom/kwad/sdk/widget/f;

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/g/d;->eF:Landroid/widget/TextView;

    invoke-direct {v0, v1, p0}, Lcom/kwad/sdk/widget/f;-><init>(Landroid/view/View;Lcom/kwad/sdk/widget/c;)V

    .line 36
    new-instance v0, Lcom/kwad/sdk/widget/f;

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lP:Landroid/widget/ImageView;

    invoke-direct {v0, v1, p0}, Lcom/kwad/sdk/widget/f;-><init>(Landroid/view/View;Lcom/kwad/sdk/widget/c;)V

    .line 37
    new-instance v0, Lcom/kwad/sdk/widget/f;

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lR:Landroid/widget/TextView;

    invoke-direct {v0, v1, p0}, Lcom/kwad/sdk/widget/f;-><init>(Landroid/view/View;Lcom/kwad/sdk/widget/c;)V

    .line 38
    new-instance v0, Lcom/kwad/sdk/widget/f;

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lS:Landroid/widget/TextView;

    invoke-direct {v0, v1, p0}, Lcom/kwad/sdk/widget/f;-><init>(Landroid/view/View;Lcom/kwad/sdk/widget/c;)V

    .line 39
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->lL:Landroid/widget/ImageView;

    new-instance v1, Lcom/kwad/components/ad/interstitial/g/d$1;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/interstitial/g/d$1;-><init>(Lcom/kwad/components/ad/interstitial/g/d;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 40
    sget v0, Lcom/kwad/sdk/R$id;->ksad_interstitial_playable_timer:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->lU:Landroid/widget/TextView;

    .line 41
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->kL:Lcom/kwad/sdk/widget/KSFrameLayout;

    invoke-direct {p0, v0, p1}, Lcom/kwad/components/ad/interstitial/g/d;->a(Lcom/kwad/sdk/widget/KSFrameLayout;Z)V

    .line 42
    invoke-static {}, Lcom/kwad/sdk/utils/aj;->isOrientationPortrait()Z

    move-result p1

    if-nez p1, :cond_1

    .line 43
    invoke-direct {p0}, Lcom/kwad/components/ad/interstitial/g/d;->ee()V

    :cond_1
    return-void
.end method


# virtual methods
.method public final a(FLcom/kwad/sdk/core/video/videoview/a;)V
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->kL:Lcom/kwad/sdk/widget/KSFrameLayout;

    invoke-virtual {v0, p1}, Lcom/kwad/sdk/widget/KSFrameLayout;->setRatio(F)V

    .line 40
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/d;->kL:Lcom/kwad/sdk/widget/KSFrameLayout;

    invoke-virtual {p1, p2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 41
    invoke-virtual {p2}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v0, 0x0

    .line 42
    iput v0, p1, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    const/4 v0, -0x1

    .line 43
    iput v0, p1, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 44
    iput v0, p1, Landroid/widget/FrameLayout$LayoutParams;->height:I

    const/16 v0, 0x11

    .line 45
    iput v0, p1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 46
    invoke-virtual {p2, p1}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final a(Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x1

    .line 47
    invoke-direct {p0, p1, v0}, Lcom/kwad/components/ad/interstitial/g/d;->b(Landroid/view/View;Z)V

    return-void
.end method

.method public final a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/core/response/model/AdInfo;)V
    .locals 4

    .line 9
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->lP:Landroid/widget/ImageView;

    sget v1, Lcom/kwad/sdk/R$drawable;->ksad_default_app_icon:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 10
    invoke-static {p2}, Lcom/kwad/sdk/core/response/b/a;->cb(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-ne v0, v3, :cond_1

    .line 11
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lP:Landroid/widget/ImageView;

    .line 12
    invoke-static {p2}, Lcom/kwad/sdk/core/response/b/a;->cJ(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v0

    .line 13
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 14
    invoke-static {p1, v0, v1}, Lcom/kwad/sdk/core/imageloader/KSImageLoader;->loadCircleIcon(Landroid/widget/ImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V

    .line 15
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lR:Landroid/widget/TextView;

    invoke-static {p2}, Lcom/kwad/sdk/core/response/b/a;->cf(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 16
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lS:Landroid/widget/TextView;

    invoke-static {p2}, Lcom/kwad/sdk/core/response/b/a;->at(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 17
    invoke-static {p2}, Lcom/kwad/sdk/core/response/b/a;->cF(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 18
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lT:Lcom/kwad/components/core/page/widget/TextProgressBar;

    invoke-static {}, Lcom/kwad/components/ad/d/b;->X()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, v2}, Lcom/kwad/components/core/page/widget/TextProgressBar;->e(Ljava/lang/String;I)V

    return-void

    .line 19
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lT:Lcom/kwad/components/core/page/widget/TextProgressBar;

    invoke-static {}, Lcom/kwad/components/ad/d/b;->aa()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, v2}, Lcom/kwad/components/core/page/widget/TextProgressBar;->e(Ljava/lang/String;I)V

    return-void

    .line 20
    :cond_1
    invoke-static {}, Lcom/kwad/components/ad/interstitial/b/b;->cL()Z

    move-result v0

    const/4 v1, 0x4

    if-eqz v0, :cond_2

    .line 21
    invoke-static {p2}, Lcom/kwad/sdk/core/response/b/a;->cb(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v0

    const/4 v3, 0x3

    if-ne v0, v3, :cond_2

    .line 22
    invoke-static {p2}, Lcom/kwad/sdk/core/response/b/a;->cQ(Lcom/kwad/sdk/core/response/model/AdInfo;)Lcom/kwad/sdk/core/response/model/AdProductInfo;

    move-result-object p2

    .line 23
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->lP:Landroid/widget/ImageView;

    iget-object v3, p2, Lcom/kwad/sdk/core/response/model/AdProductInfo;->icon:Ljava/lang/String;

    .line 24
    invoke-static {v0, v3, p1, v1}, Lcom/kwad/sdk/core/imageloader/KSImageLoader;->loadWithRadius(Landroid/widget/ImageView;Ljava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    .line 25
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lR:Landroid/widget/TextView;

    iget-object p2, p2, Lcom/kwad/sdk/core/response/model/AdProductInfo;->name:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 26
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lS:Landroid/widget/TextView;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 27
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lT:Lcom/kwad/components/core/page/widget/TextProgressBar;

    invoke-static {}, Lcom/kwad/components/ad/d/b;->Y()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, v2}, Lcom/kwad/components/core/page/widget/TextProgressBar;->e(Ljava/lang/String;I)V

    return-void

    .line 28
    :cond_2
    invoke-static {p2}, Lcom/kwad/sdk/core/response/b/a;->aE(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 29
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->lP:Landroid/widget/ImageView;

    .line 30
    invoke-static {p2}, Lcom/kwad/sdk/core/response/b/a;->cg(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3, p1, v1}, Lcom/kwad/sdk/core/imageloader/KSImageLoader;->loadWithRadius(Landroid/widget/ImageView;Ljava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    .line 31
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lR:Landroid/widget/TextView;

    invoke-static {p2}, Lcom/kwad/sdk/core/response/b/a;->au(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 32
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lS:Landroid/widget/TextView;

    invoke-static {p2}, Lcom/kwad/sdk/core/response/b/a;->at(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lT:Lcom/kwad/components/core/page/widget/TextProgressBar;

    invoke-static {p2}, Lcom/kwad/sdk/core/response/b/a;->aD(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, v2}, Lcom/kwad/components/core/page/widget/TextProgressBar;->e(Ljava/lang/String;I)V

    return-void

    .line 34
    :cond_3
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->lP:Landroid/widget/ImageView;

    .line 35
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dX(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3, p1, v1}, Lcom/kwad/sdk/core/imageloader/KSImageLoader;->loadWithRadius(Landroid/widget/ImageView;Ljava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    .line 36
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lR:Landroid/widget/TextView;

    invoke-static {p2}, Lcom/kwad/sdk/core/response/b/a;->cd(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 37
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lS:Landroid/widget/TextView;

    invoke-static {p2}, Lcom/kwad/sdk/core/response/b/a;->at(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 38
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lT:Lcom/kwad/components/core/page/widget/TextProgressBar;

    invoke-static {p2}, Lcom/kwad/sdk/core/response/b/a;->aD(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, v2}, Lcom/kwad/components/core/page/widget/TextProgressBar;->e(Ljava/lang/String;I)V

    return-void
.end method

.method public final b(Landroid/view/View;)V
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/d;->dH(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 52
    invoke-direct {p0, p1, v0}, Lcom/kwad/components/ad/interstitial/g/d;->b(Landroid/view/View;Z)V

    :cond_0
    return-void
.end method

.method public final b(ZI)V
    .locals 3

    .line 2
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lU:Landroid/widget/TextView;

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 3
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    if-ltz p2, :cond_1

    .line 4
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lU:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lF:Ljava/lang/String;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    aput-object p2, v2, v0

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method

.method public final c(Ljava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/kwad/sdk/utils/bh;->isNullString(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->eM:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->eM:Landroid/widget/ImageView;

    invoke-static {v0, p1, p2}, Lcom/kwad/sdk/core/imageloader/KSImageLoader;->loadImage(Landroid/widget/ImageView;Ljava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    :cond_0
    return-void
.end method

.method public final c(ZZ)V
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->eM:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    .line 5
    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 6
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/d;->eM:Landroid/widget/ImageView;

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setClickable(Z)V

    :cond_1
    return-void
.end method

.method public final ef()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->lO:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    const/16 v1, 0x8

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->lX:Z

    :cond_0
    return-void
.end method

.method public final eg()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->lM:Landroid/view/View;

    if-eqz v0, :cond_0

    const/16 v1, 0x8

    .line 2
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public final eh()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lcom/kwad/components/ad/interstitial/g/d;->t(Z)V

    .line 2
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lK:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 3
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lH:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method public final ei()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->lK:Landroid/view/ViewGroup;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->lH:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    const/4 v0, 0x1

    .line 3
    invoke-virtual {p0, v0}, Lcom/kwad/components/ad/interstitial/g/d;->t(Z)V

    return-void
.end method

.method public final ej()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->lK:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    return v1
.end method

.method public final f(II)V
    .locals 1

    .line 5
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 6
    iput p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 7
    iput p2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 8
    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final f(Ljava/lang/String;I)V
    .locals 1

    .line 1
    iget-object p2, p0, Lcom/kwad/components/ad/interstitial/g/d;->lI:Lcom/kwad/components/core/page/widget/TextProgressBar;

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p2, p1, v0}, Lcom/kwad/components/core/page/widget/TextProgressBar;->e(Ljava/lang/String;I)V

    .line 3
    :cond_0
    iget-object p2, p0, Lcom/kwad/components/ad/interstitial/g/d;->lT:Lcom/kwad/components/core/page/widget/TextProgressBar;

    if-eqz p2, :cond_1

    .line 4
    invoke-virtual {p2, p1, v0}, Lcom/kwad/components/core/page/widget/TextProgressBar;->e(Ljava/lang/String;I)V

    :cond_1
    return-void
.end method

.method public final getBlurBgView()Landroid/view/View;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->lG:Landroid/view/View;

    return-object v0
.end method

.method public final getTailFrameView()Landroid/widget/ImageView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->lH:Landroid/widget/ImageView;

    return-object v0
.end method

.method public final setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/g/d;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-void
.end method

.method public final setViewListener(Lcom/kwad/components/ad/interstitial/g/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lV:Lcom/kwad/components/ad/interstitial/g/e;

    return-void
.end method

.method public final t(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->lJ:Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    .line 2
    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method public final u(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->lL:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setSelected(Z)V

    :cond_0
    return-void
.end method

.method public final w(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->lO:Landroid/widget/TextView;

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    .line 2
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    :cond_1
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lW:Lcom/kwad/components/ad/interstitial/g/d$a;

    invoke-static {p1}, Lcom/kwad/components/ad/interstitial/g/d$a;->b(Lcom/kwad/components/ad/interstitial/g/d$a;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-boolean p1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lX:Z

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lO:Landroid/widget/TextView;

    .line 4
    invoke-virtual {p1}, Landroid/widget/TextView;->getVisibility()I

    move-result p1

    if-eqz p1, :cond_2

    .line 5
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/d;->lO:Landroid/widget/TextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_2
    return-void
.end method

.method public final y(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d;->mLogoView:Lcom/kwad/components/core/widget/KsLogoView;

    invoke-virtual {v0, p1}, Lcom/kwad/components/core/widget/KsLogoView;->aE(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-void
.end method
