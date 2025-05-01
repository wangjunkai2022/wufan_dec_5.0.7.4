.class public final Lcom/kwad/sdk/widget/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final aEb:Lcom/kwad/sdk/utils/bq;

.field private final aUa:Lcom/kwad/sdk/widget/i;

.field private aUb:F

.field private aUc:Z

.field private aUd:Z

.field private aUe:Z

.field private aUf:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

.field private final mView:Landroid/view/View;

.field private final mf:I


# direct methods
.method public constructor <init>(Landroid/view/View;Lcom/kwad/sdk/widget/i;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x3dcccccd    # 0.1f

    .line 2
    iput v0, p0, Lcom/kwad/sdk/widget/g;->aUb:F

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/kwad/sdk/widget/g;->aUe:Z

    .line 4
    iput-object p1, p0, Lcom/kwad/sdk/widget/g;->mView:Landroid/view/View;

    .line 5
    iput-object p2, p0, Lcom/kwad/sdk/widget/g;->aUa:Lcom/kwad/sdk/widget/i;

    .line 6
    new-instance p2, Lcom/kwad/sdk/utils/bq;

    invoke-direct {p2, p1}, Lcom/kwad/sdk/utils/bq;-><init>(Landroid/view/View;)V

    iput-object p2, p0, Lcom/kwad/sdk/widget/g;->aEb:Lcom/kwad/sdk/utils/bq;

    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/kwad/sdk/utils/k;->getScreenHeight(Landroid/content/Context;)I

    move-result p1

    iput p1, p0, Lcom/kwad/sdk/widget/g;->mf:I

    return-void
.end method

.method private Hu()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/widget/g;->aUf:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/sdk/widget/g$1;

    invoke-direct {v0, p0}, Lcom/kwad/sdk/widget/g$1;-><init>(Lcom/kwad/sdk/widget/g;)V

    iput-object v0, p0, Lcom/kwad/sdk/widget/g;->aUf:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    .line 3
    iget-object v0, p0, Lcom/kwad/sdk/widget/g;->mView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v1, p0, Lcom/kwad/sdk/widget/g;->aUf:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    :cond_0
    return-void
.end method

.method private Hv()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/widget/g;->aUf:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/kwad/sdk/widget/g;->mView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 3
    iget-object v1, p0, Lcom/kwad/sdk/widget/g;->aUf:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    :cond_1
    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lcom/kwad/sdk/widget/g;->aUf:Landroid/view/ViewTreeObserver$OnScrollChangedListener;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 5
    invoke-static {v0}, Lcom/kwad/sdk/core/e/c;->printStackTrace(Ljava/lang/Throwable;)V

    return-void
.end method

.method private OF()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/widget/g;->OG()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/kwad/sdk/widget/g;->ao()V

    return-void

    .line 3
    :cond_0
    invoke-direct {p0}, Lcom/kwad/sdk/widget/g;->Hv()V

    .line 4
    invoke-direct {p0}, Lcom/kwad/sdk/widget/g;->Hu()V

    return-void
.end method

.method private OG()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/widget/g;->aEb:Lcom/kwad/sdk/utils/bq;

    invoke-virtual {v0}, Lcom/kwad/sdk/utils/bq;->Od()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/widget/g;->aEb:Lcom/kwad/sdk/utils/bq;

    iget-object v0, v0, Lcom/kwad/sdk/utils/bq;->aSf:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    .line 3
    iget-object v2, p0, Lcom/kwad/sdk/widget/g;->mView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    sub-int/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    int-to-float v0, v0

    iget-object v2, p0, Lcom/kwad/sdk/widget/g;->mView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x3f800000    # 1.0f

    iget v4, p0, Lcom/kwad/sdk/widget/g;->aUb:F

    sub-float/2addr v3, v4

    mul-float v2, v2, v3

    cmpg-float v0, v0, v2

    if-gtz v0, :cond_0

    iget-object v0, p0, Lcom/kwad/sdk/widget/g;->mView:Landroid/view/View;

    .line 4
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/kwad/sdk/widget/g;->mView:Landroid/view/View;

    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/kwad/sdk/widget/g;->aEb:Lcom/kwad/sdk/utils/bq;

    iget-object v0, v0, Lcom/kwad/sdk/utils/bq;->aSf:Landroid/graphics/Rect;

    iget v2, v0, Landroid/graphics/Rect;->bottom:I

    if-lez v2, :cond_0

    iget v0, v0, Landroid/graphics/Rect;->top:I

    iget v2, p0, Lcom/kwad/sdk/widget/g;->mf:I

    if-ge v0, v2, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    return v1
.end method

.method static synthetic a(Lcom/kwad/sdk/widget/g;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/widget/g;->OG()Z

    move-result p0

    return p0
.end method

.method private ao()V
    .locals 2

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/kwad/sdk/widget/g;->Hv()V

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/widget/g;->aUa:Lcom/kwad/sdk/widget/i;

    if-eqz v0, :cond_0

    .line 3
    iget-object v1, p0, Lcom/kwad/sdk/widget/g;->mView:Landroid/view/View;

    invoke-interface {v0, v1}, Lcom/kwad/sdk/widget/i;->A(Landroid/view/View;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    return-void

    :catchall_0
    move-exception v0

    .line 4
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method static synthetic b(Lcom/kwad/sdk/widget/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/widget/g;->ao()V

    return-void
.end method

.method private pc()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/sdk/widget/g;->aUe:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/kwad/sdk/widget/g;->OF()V

    :cond_0
    return-void
.end method


# virtual methods
.method public final OE()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/sdk/widget/g;->aUd:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/kwad/sdk/widget/g;->pc()V

    :cond_0
    return-void
.end method

.method public final b(IIII)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kwad/sdk/widget/g;->aUd:Z

    .line 3
    iget-boolean v0, p0, Lcom/kwad/sdk/widget/g;->aUc:Z

    if-nez v0, :cond_0

    or-int/2addr p3, p4

    if-nez p3, :cond_0

    or-int/2addr p1, p2

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lcom/kwad/sdk/widget/g;->aUd:Z

    .line 5
    iput-boolean p1, p0, Lcom/kwad/sdk/widget/g;->aUc:Z

    :cond_0
    return-void
.end method

.method public final ce(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/sdk/widget/g;->aUe:Z

    return-void
.end method

.method public final getVisiblePercent()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/sdk/widget/g;->aUb:F

    return v0
.end method

.method public final onAttachedToWindow()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/widget/g;->Hu()V

    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/widget/g;->Hv()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kwad/sdk/widget/g;->aUc:Z

    return-void
.end method

.method public final setVisiblePercent(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/widget/g;->aUb:F

    return-void
.end method
