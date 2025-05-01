.class public Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;
.super Lcom/kwad/sdk/core/view/AdBaseFrameLayout;
.source "SourceFile"


# instance fields
.field private aDV:J

.field private aDW:F

.field private aDX:Z

.field private aDY:Z

.field private aDZ:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

.field private aEa:Landroid/view/ViewTreeObserver;

.field private aEb:Lcom/kwad/sdk/utils/bq;

.field private cD:Lcom/kwad/sdk/widget/j;

.field private mf:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/sdk/core/view/AdBaseFrameLayout;-><init>(Landroid/content/Context;)V

    const-wide/16 v0, 0x1f4

    .line 2
    iput-wide v0, p0, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->aDV:J

    const p1, 0x3dcccccd    # 0.1f

    .line 3
    iput p1, p0, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->aDW:F

    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->aDY:Z

    .line 5
    invoke-direct {p0}, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->init()V

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

    .line 6
    invoke-direct {p0, p1, p2}, Lcom/kwad/sdk/core/view/AdBaseFrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const-wide/16 p1, 0x1f4

    .line 7
    iput-wide p1, p0, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->aDV:J

    const p1, 0x3dcccccd    # 0.1f

    .line 8
    iput p1, p0, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->aDW:F

    const/4 p1, 0x1

    .line 9
    iput-boolean p1, p0, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->aDY:Z

    .line 10
    invoke-direct {p0}, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->init()V

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

    .line 11
    invoke-direct {p0, p1, p2, p3}, Lcom/kwad/sdk/core/view/AdBaseFrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const-wide/16 p1, 0x1f4

    .line 12
    iput-wide p1, p0, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->aDV:J

    const p1, 0x3dcccccd    # 0.1f

    .line 13
    iput p1, p0, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->aDW:F

    const/4 p1, 0x1

    .line 14
    iput-boolean p1, p0, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->aDY:Z

    .line 15
    invoke-direct {p0}, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->init()V

    return-void
.end method

.method private Hr()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->Ht()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->Hs()V

    return-void

    .line 3
    :cond_0
    invoke-direct {p0}, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->Hu()V

    return-void
.end method

.method private Ht()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->aEb:Lcom/kwad/sdk/utils/bq;

    invoke-virtual {v0}, Lcom/kwad/sdk/utils/bq;->Od()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->aEb:Lcom/kwad/sdk/utils/bq;

    iget-object v0, v0, Lcom/kwad/sdk/utils/bq;->aSf:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    .line 3
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x3f800000    # 1.0f

    iget v3, p0, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->aDW:F

    sub-float/2addr v2, v3

    mul-float v1, v1, v2

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    .line 4
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v0

    if-lez v0, :cond_0

    .line 5
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getWidth()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->aEb:Lcom/kwad/sdk/utils/bq;

    iget-object v0, v0, Lcom/kwad/sdk/utils/bq;->aSf:Landroid/graphics/Rect;

    iget v1, v0, Landroid/graphics/Rect;->bottom:I

    if-lez v1, :cond_0

    iget v0, v0, Landroid/graphics/Rect;->top:I

    iget v1, p0, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->mf:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private Hu()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->aDZ:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout$1;

    invoke-direct {v0, p0}, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout$1;-><init>(Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;)V

    iput-object v0, p0, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->aDZ:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    .line 3
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->aEa:Landroid/view/ViewTreeObserver;

    if-eqz v0, :cond_0

    .line 4
    iget-object v1, p0, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->aDZ:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    :cond_0
    return-void
.end method

.method private Hv()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->aDZ:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->aEa:Landroid/view/ViewTreeObserver;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->aEa:Landroid/view/ViewTreeObserver;

    iget-object v1, p0, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->aDZ:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    :cond_0
    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->aDZ:Landroid/view/ViewTreeObserver$OnScrollChangedListener;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 5
    invoke-static {v0}, Lcom/kwad/sdk/core/e/c;->printStackTrace(Ljava/lang/Throwable;)V

    return-void
.end method

.method static synthetic a(Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->Ht()Z

    move-result p0

    return p0
.end method

.method private init()V
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/sdk/utils/bq;

    invoke-direct {v0, p0}, Lcom/kwad/sdk/utils/bq;-><init>(Landroid/view/View;)V

    iput-object v0, p0, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->aEb:Lcom/kwad/sdk/utils/bq;

    .line 2
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/utils/k;->getScreenHeight(Landroid/content/Context;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->mf:I

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->aDY:Z

    return-void
.end method

.method private pc()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->aDY:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->Hr()V

    :cond_0
    return-void
.end method


# virtual methods
.method protected final Hs()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->Hv()V

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->cD:Lcom/kwad/sdk/widget/j;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0}, Lcom/kwad/sdk/widget/j;->ao()V

    :cond_0
    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    .line 2
    invoke-direct {p0}, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->Hu()V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V

    .line 2
    invoke-direct {p0}, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->Hv()V

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->aDX:Z

    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->aDX:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    or-int v0, p3, p4

    if-nez v0, :cond_0

    or-int v0, p1, p2

    if-eqz v0, :cond_0

    .line 2
    iput-boolean v1, p0, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->aDX:Z

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 3
    :goto_0
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;->onSizeChanged(IIII)V

    if-eqz v1, :cond_1

    .line 4
    invoke-direct {p0}, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->pc()V

    :cond_1
    return-void
.end method

.method public setCheckDefaultImpressionLogThreshold(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->aDW:F

    return-void
.end method

.method public setVisibleListener(Lcom/kwad/sdk/widget/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->cD:Lcom/kwad/sdk/widget/j;

    return-void
.end method
