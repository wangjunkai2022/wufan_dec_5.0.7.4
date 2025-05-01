.class public Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView$a;
    }
.end annotation


# instance fields
.field private EL:Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView$a;

.field private Ge:Ljava/lang/String;

.field private Gf:I

.field private Gg:Landroid/widget/TextView;

.field private Gh:Landroid/widget/TextView;

.field private Gi:Landroid/widget/ImageView;

.field private Gj:Lcom/kwad/components/ad/splashscreen/widget/a;

.field private Gk:Ljava/lang/Runnable;

.field private nE:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const-string v0, "%ss"

    .line 2
    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->Ge:Ljava/lang/String;

    const/4 v0, 0x5

    .line 3
    iput v0, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->Gf:I

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->nE:Z

    .line 5
    new-instance v0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView$1;-><init>(Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;)V

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->Gk:Ljava/lang/Runnable;

    .line 6
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->ae(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 7
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const-string p2, "%ss"

    .line 8
    iput-object p2, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->Ge:Ljava/lang/String;

    const/4 p2, 0x5

    .line 9
    iput p2, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->Gf:I

    const/4 p2, 0x0

    .line 10
    iput-boolean p2, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->nE:Z

    .line 11
    new-instance p2, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView$1;

    invoke-direct {p2, p0}, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView$1;-><init>(Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;)V

    iput-object p2, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->Gk:Ljava/lang/Runnable;

    .line 12
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->ae(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 13
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const-string p2, "%ss"

    .line 14
    iput-object p2, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->Ge:Ljava/lang/String;

    const/4 p2, 0x5

    .line 15
    iput p2, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->Gf:I

    const/4 p2, 0x0

    .line 16
    iput-boolean p2, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->nE:Z

    .line 17
    new-instance p2, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView$1;

    invoke-direct {p2, p0}, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView$1;-><init>(Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;)V

    iput-object p2, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->Gk:Ljava/lang/Runnable;

    .line 18
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->ae(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 19
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    const-string p2, "%ss"

    .line 20
    iput-object p2, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->Ge:Ljava/lang/String;

    const/4 p2, 0x5

    .line 21
    iput p2, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->Gf:I

    const/4 p2, 0x0

    .line 22
    iput-boolean p2, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->nE:Z

    .line 23
    new-instance p2, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView$1;

    invoke-direct {p2, p0}, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView$1;-><init>(Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;)V

    iput-object p2, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->Gk:Ljava/lang/Runnable;

    .line 24
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->ae(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->ab(I)V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;)Z
    .locals 0

    .line 2
    iget-boolean p0, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->nE:Z

    return p0
.end method

.method private ab(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->Gg:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->Ge:Ljava/lang/String;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private ae(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 2
    sget v0, Lcom/kwad/sdk/R$layout;->ksad_endcard_close_view:I

    invoke-static {p1, v0, p0}, Lcom/kwad/sdk/n/l;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 3
    sget p1, Lcom/kwad/sdk/R$id;->ksad_ad_endcard_second:I

    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->Gg:Landroid/widget/TextView;

    .line 4
    sget p1, Lcom/kwad/sdk/R$id;->ksad_ad_endcard_line:I

    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->Gh:Landroid/widget/TextView;

    .line 5
    sget p1, Lcom/kwad/sdk/R$id;->ksad_splash_endcard_close_img:I

    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->Gi:Landroid/widget/ImageView;

    .line 6
    new-instance v0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView$2;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView$2;-><init>(Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method static synthetic b(Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->Gf:I

    return p0
.end method

.method static synthetic c(Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;)Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->EL:Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView$a;

    return-object p0
.end method

.method static synthetic d(Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->Gf:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->Gf:I

    return v0
.end method

.method private eG()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->Gk:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private eH()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->nE:Z

    return-void
.end method

.method private eI()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->nE:Z

    return-void
.end method

.method private mk()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->Gj:Lcom/kwad/components/ad/splashscreen/widget/a;

    invoke-virtual {v0}, Lcom/kwad/components/ad/splashscreen/widget/a;->lO()Lcom/kwad/sdk/utils/ad;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/kwad/sdk/utils/ad;->a(Landroid/view/View;Lcom/kwad/sdk/utils/ad;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->Gh:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->Gj:Lcom/kwad/components/ad/splashscreen/widget/a;

    invoke-virtual {v1}, Lcom/kwad/components/ad/splashscreen/widget/a;->mn()Lcom/kwad/sdk/utils/ad;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kwad/sdk/utils/ad;->a(Landroid/view/View;Lcom/kwad/sdk/utils/ad;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->Gi:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->Gj:Lcom/kwad/components/ad/splashscreen/widget/a;

    invoke-virtual {v1}, Lcom/kwad/components/ad/splashscreen/widget/a;->mq()Lcom/kwad/sdk/utils/ad;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kwad/sdk/utils/ad;->a(Landroid/view/View;Lcom/kwad/sdk/utils/ad;)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->Gg:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->Gj:Lcom/kwad/components/ad/splashscreen/widget/a;

    invoke-virtual {v1}, Lcom/kwad/components/ad/splashscreen/widget/a;->mo()I

    move-result v1

    int-to-float v1, v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->Gh:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->Gj:Lcom/kwad/components/ad/splashscreen/widget/a;

    invoke-virtual {v1}, Lcom/kwad/components/ad/splashscreen/widget/a;->mo()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 6
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 7
    instance-of v1, v0, Landroid/graphics/drawable/GradientDrawable;

    if-eqz v1, :cond_0

    .line 8
    check-cast v0, Landroid/graphics/drawable/GradientDrawable;

    .line 9
    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->Gj:Lcom/kwad/components/ad/splashscreen/widget/a;

    invoke-virtual {v1}, Lcom/kwad/components/ad/splashscreen/widget/a;->mp()F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/sdk/core/response/model/AdInfo;F)V
    .locals 2

    .line 3
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->dg(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/components/ad/splashscreen/widget/a;->ag(Landroid/content/Context;)Lcom/kwad/components/ad/splashscreen/widget/a;

    move-result-object v1

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/components/ad/splashscreen/widget/a;->af(Landroid/content/Context;)Lcom/kwad/components/ad/splashscreen/widget/a;

    move-result-object v1

    :goto_0
    iput-object v1, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->Gj:Lcom/kwad/components/ad/splashscreen/widget/a;

    .line 6
    invoke-virtual {v1, p2}, Lcom/kwad/components/ad/splashscreen/widget/a;->d(F)V

    .line 7
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->cn(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p2

    .line 8
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->cm(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result p1

    iput p1, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->Gf:I

    if-eqz v0, :cond_1

    .line 9
    invoke-direct {p0}, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->mk()V

    :cond_1
    const/4 p1, 0x0

    if-eqz p2, :cond_2

    .line 10
    iget-object p2, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->Gg:Landroid/widget/TextView;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 11
    iget-object p2, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->Gh:Landroid/widget/TextView;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 12
    iget p2, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->Gf:I

    invoke-direct {p0, p2}, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->ab(I)V

    .line 13
    iget-object p2, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->Gj:Lcom/kwad/components/ad/splashscreen/widget/a;

    invoke-virtual {p2}, Lcom/kwad/components/ad/splashscreen/widget/a;->mm()I

    move-result p2

    .line 14
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    int-to-float p2, p2

    invoke-static {v0, p2}, Lcom/kwad/sdk/c/a/a;->a(Landroid/content/Context;F)I

    move-result v0

    .line 15
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, p2}, Lcom/kwad/sdk/c/a/a;->a(Landroid/content/Context;F)I

    move-result p2

    .line 16
    invoke-virtual {p0, v0, p1, p2, p1}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    goto :goto_1

    .line 17
    :cond_2
    iget-object p2, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->Gj:Lcom/kwad/components/ad/splashscreen/widget/a;

    invoke-virtual {p2}, Lcom/kwad/components/ad/splashscreen/widget/a;->ml()I

    move-result p2

    .line 18
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    int-to-float p2, p2

    invoke-static {v0, p2}, Lcom/kwad/sdk/c/a/a;->a(Landroid/content/Context;F)I

    move-result v0

    .line 19
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, p2}, Lcom/kwad/sdk/c/a/a;->a(Landroid/content/Context;F)I

    move-result p2

    .line 20
    invoke-virtual {p0, v0, p1, p2, p1}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 21
    :goto_1
    invoke-direct {p0}, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->eG()V

    return-void
.end method

.method public final aM()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->eI()V

    return-void
.end method

.method public final aN()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->eH()V

    return-void
.end method

.method public final bf()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getHandler()Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public setOnViewClickListener(Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView;->EL:Lcom/kwad/components/ad/splashscreen/widget/CloseCountDownView$a;

    return-void
.end method
