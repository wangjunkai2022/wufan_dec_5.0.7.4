.class public final Lcom/kwad/sdk/utils/ad;
.super Lcom/kwad/sdk/utils/be;
.source "SourceFile"


# instance fields
.field private aQs:I

.field private aQt:I

.field private aQu:I

.field private aQv:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/kwad/sdk/utils/be;-><init>(II)V

    return-void
.end method

.method private MH()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/sdk/utils/ad;->aQs:I

    return v0
.end method

.method private MI()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/sdk/utils/ad;->aQt:I

    return v0
.end method

.method private MJ()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/sdk/utils/ad;->aQu:I

    return v0
.end method

.method private MK()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/sdk/utils/ad;->aQv:I

    return v0
.end method

.method public static a(IIIIII)Lcom/kwad/sdk/utils/ad;
    .locals 0

    .line 1
    new-instance p2, Lcom/kwad/sdk/utils/ad;

    invoke-direct {p2, p0, p1}, Lcom/kwad/sdk/utils/ad;-><init>(II)V

    const/4 p0, 0x0

    .line 2
    invoke-virtual {p2, p0}, Lcom/kwad/sdk/utils/ad;->ed(I)V

    .line 3
    invoke-virtual {p2, p0}, Lcom/kwad/sdk/utils/ad;->ee(I)V

    .line 4
    invoke-virtual {p2, p3}, Lcom/kwad/sdk/utils/ad;->eb(I)V

    .line 5
    invoke-direct {p2, p0}, Lcom/kwad/sdk/utils/ad;->ec(I)V

    return-object p2
.end method

.method public static a(Landroid/view/View;Lcom/kwad/sdk/utils/ad;)V
    .locals 3

    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 7
    invoke-virtual {p1}, Lcom/kwad/sdk/utils/be;->getHeight()I

    move-result v1

    if-lez v1, :cond_0

    .line 8
    invoke-virtual {p1}, Lcom/kwad/sdk/utils/be;->getHeight()I

    move-result v1

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 9
    :cond_0
    invoke-virtual {p1}, Lcom/kwad/sdk/utils/be;->getWidth()I

    move-result v1

    if-lez v1, :cond_1

    .line 10
    invoke-virtual {p1}, Lcom/kwad/sdk/utils/be;->getWidth()I

    move-result v1

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 11
    :cond_1
    instance-of v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v1, :cond_5

    .line 12
    move-object v1, v0

    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 13
    invoke-direct {p1}, Lcom/kwad/sdk/utils/ad;->MJ()I

    move-result v2

    if-lez v2, :cond_2

    .line 14
    invoke-direct {p1}, Lcom/kwad/sdk/utils/ad;->MJ()I

    move-result v2

    iput v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 15
    :cond_2
    invoke-direct {p1}, Lcom/kwad/sdk/utils/ad;->MI()I

    move-result v2

    if-lez v2, :cond_3

    .line 16
    invoke-direct {p1}, Lcom/kwad/sdk/utils/ad;->MI()I

    move-result v2

    iput v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 17
    :cond_3
    invoke-direct {p1}, Lcom/kwad/sdk/utils/ad;->MK()I

    move-result v2

    if-lez v2, :cond_4

    .line 18
    invoke-direct {p1}, Lcom/kwad/sdk/utils/ad;->MK()I

    move-result v2

    iput v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 19
    :cond_4
    invoke-direct {p1}, Lcom/kwad/sdk/utils/ad;->MH()I

    move-result v2

    if-lez v2, :cond_5

    .line 20
    invoke-direct {p1}, Lcom/kwad/sdk/utils/ad;->MH()I

    move-result p1

    iput p1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 21
    :cond_5
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private ec(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/utils/ad;->aQt:I

    return-void
.end method


# virtual methods
.method public final c(Landroid/content/Context;F)Lcom/kwad/sdk/utils/ad;
    .locals 3

    .line 1
    iget v0, p0, Lcom/kwad/sdk/utils/be;->mWidth:I

    int-to-float v0, v0

    mul-float v0, v0, p2

    invoke-static {p1, v0}, Lcom/kwad/sdk/c/a/a;->a(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    .line 2
    iget v1, p0, Lcom/kwad/sdk/utils/be;->mHeight:I

    int-to-float v1, v1

    mul-float v1, v1, p2

    invoke-static {p1, v1}, Lcom/kwad/sdk/c/a/a;->a(Landroid/content/Context;F)I

    move-result v1

    int-to-float v1, v1

    .line 3
    new-instance v2, Lcom/kwad/sdk/utils/ad;

    float-to-int v0, v0

    float-to-int v1, v1

    invoke-direct {v2, v0, v1}, Lcom/kwad/sdk/utils/ad;-><init>(II)V

    .line 4
    iget v0, p0, Lcom/kwad/sdk/utils/ad;->aQu:I

    int-to-float v0, v0

    mul-float v0, v0, p2

    invoke-static {p1, v0}, Lcom/kwad/sdk/c/a/a;->a(Landroid/content/Context;F)I

    move-result v0

    iput v0, v2, Lcom/kwad/sdk/utils/ad;->aQu:I

    .line 5
    iget v0, p0, Lcom/kwad/sdk/utils/ad;->aQt:I

    int-to-float v0, v0

    mul-float v0, v0, p2

    invoke-static {p1, v0}, Lcom/kwad/sdk/c/a/a;->a(Landroid/content/Context;F)I

    move-result v0

    iput v0, v2, Lcom/kwad/sdk/utils/ad;->aQt:I

    .line 6
    iget v0, p0, Lcom/kwad/sdk/utils/ad;->aQv:I

    int-to-float v0, v0

    mul-float v0, v0, p2

    invoke-static {p1, v0}, Lcom/kwad/sdk/c/a/a;->a(Landroid/content/Context;F)I

    move-result v0

    iput v0, v2, Lcom/kwad/sdk/utils/ad;->aQv:I

    .line 7
    iget v0, p0, Lcom/kwad/sdk/utils/ad;->aQs:I

    int-to-float v0, v0

    mul-float v0, v0, p2

    invoke-static {p1, v0}, Lcom/kwad/sdk/c/a/a;->a(Landroid/content/Context;F)I

    move-result p1

    iput p1, v2, Lcom/kwad/sdk/utils/ad;->aQs:I

    return-object v2
.end method

.method public final eb(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/utils/ad;->aQs:I

    return-void
.end method

.method public final ed(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/utils/ad;->aQu:I

    return-void
.end method

.method public final ee(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/utils/ad;->aQv:I

    return-void
.end method
