.class public final Lcom/kwad/sdk/core/video/a;
.super Landroid/view/TextureView;
.source "SourceFile"


# instance fields
.field private videoHeight:I

.field private videoWidth:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/view/TextureView;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final adaptVideoSize(II)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/sdk/core/video/a;->videoWidth:I

    if-eq v0, p1, :cond_0

    iget v0, p0, Lcom/kwad/sdk/core/video/a;->videoHeight:I

    if-eq v0, p2, :cond_0

    .line 2
    iput p1, p0, Lcom/kwad/sdk/core/video/a;->videoWidth:I

    .line 3
    iput p2, p0, Lcom/kwad/sdk/core/video/a;->videoHeight:I

    .line 4
    invoke-virtual {p0}, Landroid/view/TextureView;->requestLayout()V

    :cond_0
    return-void
.end method

.method protected final onMeasure(II)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/view/TextureView;->getRotation()F

    move-result v0

    const/high16 v1, 0x42b40000    # 90.0f

    cmpl-float v1, v0, v1

    if-eqz v1, :cond_0

    const/high16 v1, 0x43870000    # 270.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1

    :cond_0
    move v5, p2

    move p2, p1

    move p1, v5

    .line 2
    :cond_1
    iget v0, p0, Lcom/kwad/sdk/core/video/a;->videoWidth:I

    invoke-static {v0, p1}, Landroid/view/TextureView;->getDefaultSize(II)I

    move-result v0

    .line 3
    iget v1, p0, Lcom/kwad/sdk/core/video/a;->videoHeight:I

    invoke-static {v1, p2}, Landroid/view/TextureView;->getDefaultSize(II)I

    move-result v1

    .line 4
    iget v2, p0, Lcom/kwad/sdk/core/video/a;->videoWidth:I

    if-lez v2, :cond_b

    iget v2, p0, Lcom/kwad/sdk/core/video/a;->videoHeight:I

    if-lez v2, :cond_b

    .line 5
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 6
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    .line 7
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    .line 8
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    const/high16 v2, 0x40000000    # 2.0f

    if-ne v0, v2, :cond_4

    if-ne v1, v2, :cond_4

    .line 9
    iget v0, p0, Lcom/kwad/sdk/core/video/a;->videoWidth:I

    mul-int v1, v0, p2

    iget v2, p0, Lcom/kwad/sdk/core/video/a;->videoHeight:I

    mul-int v3, p1, v2

    if-ge v1, v3, :cond_2

    mul-int v0, v0, p2

    .line 10
    div-int/2addr v0, v2

    goto :goto_1

    :cond_2
    mul-int v1, v0, p2

    mul-int v3, p1, v2

    if-le v1, v3, :cond_3

    mul-int v2, v2, p1

    .line 11
    div-int v1, v2, v0

    :goto_0
    move v0, p1

    goto :goto_3

    :cond_3
    move v0, p1

    :goto_1
    move v1, p2

    goto :goto_3

    :cond_4
    const/high16 v3, -0x80000000

    if-ne v0, v2, :cond_6

    .line 12
    iget v0, p0, Lcom/kwad/sdk/core/video/a;->videoHeight:I

    mul-int v2, p1, v0

    iget v4, p0, Lcom/kwad/sdk/core/video/a;->videoWidth:I

    div-int/2addr v2, v4

    if-ne v1, v3, :cond_5

    if-le v2, p2, :cond_5

    mul-int v4, v4, p2

    .line 13
    div-int v0, v4, v0

    goto :goto_1

    :cond_5
    move v0, p1

    move v1, v2

    goto :goto_3

    :cond_6
    if-ne v1, v2, :cond_8

    .line 14
    iget v1, p0, Lcom/kwad/sdk/core/video/a;->videoWidth:I

    mul-int v2, p2, v1

    iget v4, p0, Lcom/kwad/sdk/core/video/a;->videoHeight:I

    div-int/2addr v2, v4

    if-ne v0, v3, :cond_7

    if-le v2, p1, :cond_7

    mul-int v4, v4, p1

    .line 15
    div-int v1, v4, v1

    goto :goto_0

    :cond_7
    move v1, p2

    move v0, v2

    goto :goto_3

    .line 16
    :cond_8
    iget v2, p0, Lcom/kwad/sdk/core/video/a;->videoWidth:I

    .line 17
    iget v4, p0, Lcom/kwad/sdk/core/video/a;->videoHeight:I

    if-ne v1, v3, :cond_9

    if-le v4, p2, :cond_9

    mul-int v1, p2, v2

    .line 18
    div-int/2addr v1, v4

    goto :goto_2

    :cond_9
    move v1, v2

    move p2, v4

    :goto_2
    if-ne v0, v3, :cond_a

    if-le v1, p1, :cond_a

    mul-int v4, v4, p1

    .line 19
    div-int v1, v4, v2

    goto :goto_0

    :cond_a
    move v0, v1

    goto :goto_1

    .line 20
    :cond_b
    :goto_3
    invoke-virtual {p0, v0, v1}, Landroid/view/TextureView;->setMeasuredDimension(II)V

    return-void
.end method

.method public final setRotation(F)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/TextureView;->getRotation()F

    move-result v0

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_0

    .line 2
    invoke-super {p0, p1}, Landroid/view/TextureView;->setRotation(F)V

    .line 3
    invoke-virtual {p0}, Landroid/view/TextureView;->requestLayout()V

    :cond_0
    return-void
.end method
