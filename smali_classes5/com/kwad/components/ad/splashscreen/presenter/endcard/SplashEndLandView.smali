.class public Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field private EE:Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;

.field private EF:Landroid/view/ViewGroup;

.field private EG:Landroid/view/ViewGroup;

.field private EH:Landroid/widget/ImageView;

.field private EI:Landroid/widget/TextView;

.field private EJ:Landroid/widget/TextView;

.field private EU:Landroid/widget/ImageView;

.field private EV:Landroid/widget/TextView;

.field private EW:Lcom/kwad/components/core/widget/KsLogoView;

.field private EX:Landroid/widget/TextView;

.field private EY:Landroid/widget/TextView;

.field private EZ:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const/16 p1, 0x18

    .line 2
    iput p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EZ:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/16 p1, 0x18

    .line 4
    iput p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EZ:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 5
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 p1, 0x18

    .line 6
    iput p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EZ:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 7
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    const/16 p1, 0x18

    .line 8
    iput p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EZ:I

    return-void
.end method

.method private a(Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;)V
    .locals 3

    .line 15
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EU:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->lG()Lcom/kwad/sdk/utils/ad;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kwad/sdk/utils/ad;->a(Landroid/view/View;Lcom/kwad/sdk/utils/ad;)V

    .line 16
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EF:Landroid/view/ViewGroup;

    invoke-virtual {p1}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->lH()Lcom/kwad/sdk/utils/ad;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kwad/sdk/utils/ad;->a(Landroid/view/View;Lcom/kwad/sdk/utils/ad;)V

    .line 17
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EH:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->lI()Lcom/kwad/sdk/utils/ad;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kwad/sdk/utils/ad;->a(Landroid/view/View;Lcom/kwad/sdk/utils/ad;)V

    .line 18
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EG:Landroid/view/ViewGroup;

    invoke-virtual {p1}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->lK()Lcom/kwad/sdk/utils/ad;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kwad/sdk/utils/ad;->a(Landroid/view/View;Lcom/kwad/sdk/utils/ad;)V

    .line 19
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EI:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->lL()Lcom/kwad/sdk/utils/ad;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kwad/sdk/utils/ad;->a(Landroid/view/View;Lcom/kwad/sdk/utils/ad;)V

    .line 20
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EV:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->lM()Lcom/kwad/sdk/utils/ad;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kwad/sdk/utils/ad;->a(Landroid/view/View;Lcom/kwad/sdk/utils/ad;)V

    .line 21
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EJ:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->lN()Lcom/kwad/sdk/utils/ad;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kwad/sdk/utils/ad;->a(Landroid/view/View;Lcom/kwad/sdk/utils/ad;)V

    .line 22
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EE:Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;

    invoke-virtual {p1}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->lO()Lcom/kwad/sdk/utils/ad;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kwad/sdk/utils/ad;->a(Landroid/view/View;Lcom/kwad/sdk/utils/ad;)V

    .line 23
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EI:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 24
    invoke-virtual {p1}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->lP()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 25
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EV:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    .line 26
    invoke-virtual {p1}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->lQ()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 27
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EJ:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    .line 28
    invoke-virtual {p1}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->lR()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 29
    :cond_2
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EX:Landroid/widget/TextView;

    if-eqz v0, :cond_3

    .line 30
    invoke-virtual {p1}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->lS()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 31
    :cond_3
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EY:Landroid/widget/TextView;

    if-eqz v0, :cond_4

    .line 32
    invoke-virtual {p1}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->lT()I

    move-result v2

    int-to-float v2, v2

    .line 33
    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 34
    :cond_4
    invoke-virtual {p1}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;->lJ()I

    move-result p1

    iput p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EZ:I

    return-void
.end method

.method private b(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/core/response/model/AdInfo;Lcom/kwad/components/core/e/d/c;)V
    .locals 1

    if-nez p3, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-virtual {p3}, Lcom/kwad/components/core/e/d/c;->ov()I

    move-result p3

    const/4 v0, 0x0

    .line 2
    invoke-static {p1, p2, p3, v0}, Lcom/kwad/components/ad/splashscreen/d;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/core/response/model/AdInfo;II)Ljava/lang/String;

    move-result-object p1

    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-nez p3, :cond_1

    .line 4
    iget-object p2, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EX:Landroid/widget/TextView;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    .line 5
    :cond_1
    iget-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EX:Landroid/widget/TextView;

    invoke-static {p2}, Lcom/kwad/sdk/core/response/b/a;->aD(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public final W(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EX:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public final a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/core/e/d/c;F)V
    .locals 4

    .line 1
    new-instance v0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p3}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;-><init>(Landroid/content/Context;F)V

    invoke-direct {p0, v0}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->a(Lcom/kwad/components/ad/splashscreen/presenter/endcard/g;)V

    .line 2
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EH:Landroid/widget/ImageView;

    sget v2, Lcom/kwad/sdk/R$drawable;->ksad_default_app_icon:I

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "bindView, appIconRadius: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EZ:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "SplashEndLandView"

    invoke-static {v2, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EH:Landroid/widget/ImageView;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->cg(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v2

    iget v3, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EZ:I

    invoke-static {v1, v2, p1, v3}, Lcom/kwad/sdk/core/imageloader/KSImageLoader;->loadAppIcon(Landroid/widget/ImageView;Ljava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    .line 6
    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EI:Landroid/widget/TextView;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->cd(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EJ:Landroid/widget/TextView;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->at(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EW:Lcom/kwad/components/core/widget/KsLogoView;

    invoke-virtual {v1, p1}, Lcom/kwad/components/core/widget/KsLogoView;->aE(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 9
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->aE(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 10
    iget-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EX:Landroid/widget/TextView;

    const-string p2, "\u70b9\u51fb\u67e5\u770b"

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    iget-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EY:Landroid/widget/TextView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 12
    iget-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EY:Landroid/widget/TextView;

    const-string p2, "\u8df3\u8f6c\u8be6\u60c5\u9875/\u7b2c\u4e09\u65b9\u5e94\u7528"

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 13
    :cond_0
    invoke-direct {p0, p1, v0, p2}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->b(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/core/response/model/AdInfo;Lcom/kwad/components/core/e/d/c;)V

    .line 14
    :goto_0
    iget-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EE:Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;

    invoke-virtual {p1, v0, p3}, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->a(Lcom/kwad/sdk/core/response/model/AdInfo;F)V

    return-void
.end method

.method public final aM()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EE:Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->aM()V

    :cond_0
    return-void
.end method

.method public final aN()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EE:Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->aN()V

    :cond_0
    return-void
.end method

.method public getActionBarView()Landroid/view/ViewGroup;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EG:Landroid/view/ViewGroup;

    return-object v0
.end method

.method public getAppDesc()Landroid/widget/TextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EJ:Landroid/widget/TextView;

    return-object v0
.end method

.method public getAppIcon()Landroid/widget/ImageView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EH:Landroid/widget/ImageView;

    return-object v0
.end method

.method public getAppName()Landroid/widget/TextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EI:Landroid/widget/TextView;

    return-object v0
.end method

.method public getCloseView()Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EE:Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;

    return-object v0
.end method

.method public getGiftBoxView()Landroid/view/ViewGroup;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EF:Landroid/view/ViewGroup;

    return-object v0
.end method

.method public final lF()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EE:Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->bf()V

    :cond_0
    return-void
.end method

.method public final s(Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    sget p1, Lcom/kwad/sdk/R$layout;->ksad_splash_end_card_area_land:I

    goto :goto_0

    .line 2
    :cond_0
    sget p1, Lcom/kwad/sdk/R$layout;->ksad_splash_end_card_area:I

    .line 3
    :goto_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1, p0}, Landroid/widget/FrameLayout;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 4
    sget p1, Lcom/kwad/sdk/R$id;->ksad_ad_endcard_title_view:I

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EU:Landroid/widget/ImageView;

    .line 5
    sget p1, Lcom/kwad/sdk/R$id;->ksad_splash_end_card_giftbox_view:I

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EF:Landroid/view/ViewGroup;

    .line 6
    sget p1, Lcom/kwad/sdk/R$id;->ksad_ad_endcard_icon:I

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EH:Landroid/widget/ImageView;

    .line 7
    sget p1, Lcom/kwad/sdk/R$id;->ksad_ad_endcard_appname:I

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EI:Landroid/widget/TextView;

    .line 8
    sget p1, Lcom/kwad/sdk/R$id;->ksad_ad_endcard_appversion:I

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EV:Landroid/widget/TextView;

    .line 9
    sget p1, Lcom/kwad/sdk/R$id;->ksad_ad_endcard_appdesc:I

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EJ:Landroid/widget/TextView;

    .line 10
    sget p1, Lcom/kwad/sdk/R$id;->ksad_ad_endcard_logo:I

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/kwad/components/core/widget/KsLogoView;

    iput-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EW:Lcom/kwad/components/core/widget/KsLogoView;

    .line 11
    sget p1, Lcom/kwad/sdk/R$id;->ksad_ad_btn_title:I

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EX:Landroid/widget/TextView;

    .line 12
    sget p1, Lcom/kwad/sdk/R$id;->ksad_ad_btn_sub_title:I

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EY:Landroid/widget/TextView;

    .line 13
    sget p1, Lcom/kwad/sdk/R$id;->ksad_ad_endcard_close_root:I

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;

    iput-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EE:Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;

    .line 14
    sget p1, Lcom/kwad/sdk/R$id;->ksad_splash_endcard_actionbar:I

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->EG:Landroid/view/ViewGroup;

    return-void
.end method
