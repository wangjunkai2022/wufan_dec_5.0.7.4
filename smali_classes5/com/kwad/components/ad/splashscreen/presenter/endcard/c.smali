.class public final Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;
.super Lcom/kwad/components/ad/splashscreen/presenter/e;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/kwad/sdk/widget/c;


# instance fields
.field private EE:Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;

.field private EF:Landroid/view/ViewGroup;

.field private EG:Landroid/view/ViewGroup;

.field private EH:Landroid/widget/ImageView;

.field private EI:Landroid/widget/TextView;

.field private EJ:Landroid/widget/TextView;

.field private EK:Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;

.field private EL:Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/splashscreen/presenter/e;-><init>()V

    .line 2
    new-instance v0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/c$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/c$1;-><init>(Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;)V

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;->EL:Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView$a;

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;)Lcom/kwad/components/ad/splashscreen/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    return-object p0
.end method

.method static synthetic b(Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;)Lcom/kwad/components/ad/splashscreen/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    return-object p0
.end method

.method static synthetic c(Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;)Lcom/kwad/components/ad/splashscreen/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    return-object p0
.end method

.method static synthetic d(Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;)Lcom/kwad/components/ad/splashscreen/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    return-object p0
.end method

.method static synthetic e(Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;)Lcom/kwad/components/ad/splashscreen/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    return-object p0
.end method

.method static synthetic f(Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;)Lcom/kwad/components/ad/splashscreen/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    return-object p0
.end method

.method static synthetic g(Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;)Lcom/kwad/components/ad/splashscreen/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    return-object p0
.end method

.method static synthetic h(Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;)Lcom/kwad/components/ad/splashscreen/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    return-object p0
.end method

.method static synthetic i(Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;)Lcom/kwad/components/ad/splashscreen/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    return-object p0
.end method

.method private t(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;->EF:Landroid/view/ViewGroup;

    const/4 v1, 0x2

    if-ne p1, v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const/16 v2, 0x68

    invoke-virtual {v0, v1, p1, v2, v1}, Lcom/kwad/components/ad/splashscreen/h;->c(ILandroid/content/Context;II)V

    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;->EG:Landroid/view/ViewGroup;

    if-ne p1, v0, :cond_1

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const/16 v2, 0x1a

    const/4 v3, 0x1

    invoke-virtual {v0, v1, p1, v2, v3}, Lcom/kwad/components/ad/splashscreen/h;->c(ILandroid/content/Context;II)V

    return-void

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;->EH:Landroid/widget/ImageView;

    if-ne p1, v0, :cond_2

    .line 8
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const/16 v2, 0xf

    invoke-virtual {v0, v1, p1, v2, v1}, Lcom/kwad/components/ad/splashscreen/h;->c(ILandroid/content/Context;II)V

    return-void

    .line 10
    :cond_2
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;->EI:Landroid/widget/TextView;

    if-ne p1, v0, :cond_3

    .line 11
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    .line 12
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const/16 v2, 0x10

    invoke-virtual {v0, v1, p1, v2, v1}, Lcom/kwad/components/ad/splashscreen/h;->c(ILandroid/content/Context;II)V

    return-void

    .line 13
    :cond_3
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;->EJ:Landroid/widget/TextView;

    if-ne p1, v0, :cond_4

    .line 14
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    .line 15
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const/16 v2, 0x11

    invoke-virtual {v0, v1, p1, v2, v1}, Lcom/kwad/components/ad/splashscreen/h;->c(ILandroid/content/Context;II)V

    :cond_4
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;->t(Landroid/view/View;)V

    return-void
.end method

.method public final aj()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/splashscreen/presenter/e;->aj()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;->EK:Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;

    if-nez v0, :cond_0

    .line 3
    sget v0, Lcom/kwad/sdk/R$id;->ksad_splash_end_card_native_dialog_root:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;->EK:Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;

    .line 4
    invoke-virtual {v0}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->getCloseView()Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;->EE:Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;->EK:Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;

    invoke-virtual {v0}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->getGiftBoxView()Landroid/view/ViewGroup;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;->EF:Landroid/view/ViewGroup;

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;->EK:Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;

    invoke-virtual {v0}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->getActionBarView()Landroid/view/ViewGroup;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;->EG:Landroid/view/ViewGroup;

    .line 7
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;->EK:Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;

    invoke-virtual {v0}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->getAppIcon()Landroid/widget/ImageView;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;->EH:Landroid/widget/ImageView;

    .line 8
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;->EK:Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;

    invoke-virtual {v0}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->getAppName()Landroid/widget/TextView;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;->EI:Landroid/widget/TextView;

    .line 9
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;->EK:Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;

    invoke-virtual {v0}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/SplashEndLandView;->getAppDesc()Landroid/widget/TextView;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;->EJ:Landroid/widget/TextView;

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;->EE:Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;

    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;->EL:Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView$a;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->setOnViewClickListener(Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView$a;)V

    .line 11
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;->EG:Landroid/view/ViewGroup;

    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 12
    new-instance v0, Lcom/kwad/sdk/widget/f;

    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;->EG:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;->EG:Landroid/view/ViewGroup;

    invoke-direct {v0, v1, v2, p0}, Lcom/kwad/sdk/widget/f;-><init>(Landroid/content/Context;Landroid/view/View;Lcom/kwad/sdk/widget/c;)V

    .line 13
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v0, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 14
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    .line 15
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/b;->dm(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 16
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;->EF:Landroid/view/ViewGroup;

    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;->EH:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 18
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;->EI:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 19
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;->EJ:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20
    new-instance v0, Lcom/kwad/sdk/widget/f;

    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;->EG:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;->EF:Landroid/view/ViewGroup;

    invoke-direct {v0, v1, v2, p0}, Lcom/kwad/sdk/widget/f;-><init>(Landroid/content/Context;Landroid/view/View;Lcom/kwad/sdk/widget/c;)V

    .line 21
    new-instance v0, Lcom/kwad/sdk/widget/f;

    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;->EG:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;->EH:Landroid/widget/ImageView;

    invoke-direct {v0, v1, v2, p0}, Lcom/kwad/sdk/widget/f;-><init>(Landroid/content/Context;Landroid/view/View;Lcom/kwad/sdk/widget/c;)V

    .line 22
    new-instance v0, Lcom/kwad/sdk/widget/f;

    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;->EG:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;->EI:Landroid/widget/TextView;

    invoke-direct {v0, v1, v2, p0}, Lcom/kwad/sdk/widget/f;-><init>(Landroid/content/Context;Landroid/view/View;Lcom/kwad/sdk/widget/c;)V

    .line 23
    new-instance v0, Lcom/kwad/sdk/widget/f;

    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;->EG:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;->EJ:Landroid/widget/TextView;

    invoke-direct {v0, v1, v2, p0}, Lcom/kwad/sdk/widget/f;-><init>(Landroid/content/Context;Landroid/view/View;Lcom/kwad/sdk/widget/c;)V

    :cond_1
    return-void
.end method

.method public final b(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/c;->t(Landroid/view/View;)V

    return-void
.end method

.method public final onCreate()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onCreate()V

    return-void
.end method
