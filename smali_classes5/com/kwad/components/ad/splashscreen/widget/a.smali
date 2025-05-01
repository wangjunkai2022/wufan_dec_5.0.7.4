.class public final Lcom/kwad/components/ad/splashscreen/widget/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private Fa:F

.field private Gm:I

.field private Gn:I

.field private Go:I

.field private Gp:I

.field private Gq:I

.field private Gr:I

.field private mContext:Landroid/content/Context;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x18

    .line 2
    iput v0, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->Gm:I

    const/16 v0, 0xc

    .line 3
    iput v0, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->Gn:I

    const/16 v1, 0x10

    .line 4
    iput v1, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->Go:I

    .line 5
    iput v0, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->Gp:I

    const/4 v0, 0x6

    .line 6
    iput v0, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->Gq:I

    const/4 v0, 0x4

    .line 7
    iput v0, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->Gr:I

    const/high16 v0, 0x3f800000    # 1.0f

    .line 8
    iput v0, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->Fa:F

    .line 9
    iput-object p1, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->mContext:Landroid/content/Context;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;IIIIII)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 p2, 0x18

    .line 11
    iput p2, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->Gm:I

    const/16 p2, 0xc

    .line 12
    iput p2, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->Gn:I

    const/16 p3, 0x10

    .line 13
    iput p3, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->Go:I

    .line 14
    iput p2, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->Gp:I

    const/4 p3, 0x6

    .line 15
    iput p3, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->Gq:I

    const/4 p3, 0x4

    .line 16
    iput p3, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->Gr:I

    const/high16 p4, 0x3f800000    # 1.0f

    .line 17
    iput p4, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->Fa:F

    .line 18
    iput-object p1, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->mContext:Landroid/content/Context;

    const/16 p1, 0x11

    .line 19
    iput p1, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->Gm:I

    const/16 p1, 0xa

    .line 20
    iput p1, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->Gn:I

    .line 21
    iput p2, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->Go:I

    const/16 p1, 0x8

    .line 22
    iput p1, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->Gp:I

    .line 23
    iput p3, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->Gq:I

    const/4 p1, 0x3

    .line 24
    iput p1, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->Gr:I

    return-void
.end method

.method public static af(Landroid/content/Context;)Lcom/kwad/components/ad/splashscreen/widget/a;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/ad/splashscreen/widget/a;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/splashscreen/widget/a;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static ag(Landroid/content/Context;)Lcom/kwad/components/ad/splashscreen/widget/a;
    .locals 9

    .line 1
    new-instance v8, Lcom/kwad/components/ad/splashscreen/widget/a;

    const/16 v2, 0x11

    const/16 v3, 0xa

    const/16 v4, 0xc

    const/16 v5, 0x8

    const/4 v6, 0x4

    const/4 v7, 0x3

    move-object v0, v8

    move-object v1, p0

    invoke-direct/range {v0 .. v7}, Lcom/kwad/components/ad/splashscreen/widget/a;-><init>(Landroid/content/Context;IIIIII)V

    return-object v8
.end method


# virtual methods
.method public final d(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->Fa:F

    return-void
.end method

.method public final lO()Lcom/kwad/sdk/utils/ad;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->mContext:Landroid/content/Context;

    iget v1, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->Gm:I

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/kwad/sdk/c/a/a;->a(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->Fa:F

    mul-float v0, v0, v1

    float-to-int v0, v0

    .line 2
    new-instance v1, Lcom/kwad/sdk/utils/ad;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v0}, Lcom/kwad/sdk/utils/ad;-><init>(II)V

    return-object v1
.end method

.method public final ml()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->Gm:I

    iget v1, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->Go:I

    sub-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    .line 2
    iget v1, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->Fa:F

    mul-float v0, v0, v1

    float-to-int v0, v0

    return v0
.end method

.method public final mm()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->Gp:I

    int-to-float v0, v0

    iget v1, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->Fa:F

    mul-float v0, v0, v1

    float-to-int v0, v0

    return v0
.end method

.method public final mn()Lcom/kwad/sdk/utils/ad;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->mContext:Landroid/content/Context;

    iget v1, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->Gq:I

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/kwad/sdk/c/a/a;->a(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->Fa:F

    mul-float v0, v0, v1

    float-to-int v0, v0

    .line 2
    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->mContext:Landroid/content/Context;

    iget v2, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->Gr:I

    int-to-float v2, v2

    invoke-static {v1, v2}, Lcom/kwad/sdk/c/a/a;->a(Landroid/content/Context;F)I

    move-result v1

    int-to-float v1, v1

    iget v2, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->Fa:F

    mul-float v1, v1, v2

    float-to-int v1, v1

    .line 3
    new-instance v2, Lcom/kwad/sdk/utils/ad;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v3}, Lcom/kwad/sdk/utils/ad;-><init>(II)V

    .line 4
    invoke-virtual {v2, v0}, Lcom/kwad/sdk/utils/ad;->ed(I)V

    .line 5
    invoke-virtual {v2, v1}, Lcom/kwad/sdk/utils/ad;->ee(I)V

    return-object v2
.end method

.method public final mo()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->mContext:Landroid/content/Context;

    iget v1, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->Gn:I

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/kwad/sdk/c/a/a;->b(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->Fa:F

    mul-float v0, v0, v1

    float-to-int v0, v0

    return v0
.end method

.method public final mp()F
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->mContext:Landroid/content/Context;

    iget v1, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->Gm:I

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/kwad/sdk/c/a/a;->a(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->Fa:F

    mul-float v0, v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    return v0
.end method

.method public final mq()Lcom/kwad/sdk/utils/ad;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->mContext:Landroid/content/Context;

    iget v1, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->Go:I

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/kwad/sdk/c/a/a;->a(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lcom/kwad/components/ad/splashscreen/widget/a;->Fa:F

    mul-float v0, v0, v1

    float-to-int v0, v0

    .line 2
    new-instance v1, Lcom/kwad/sdk/utils/ad;

    invoke-direct {v1, v0, v0}, Lcom/kwad/sdk/utils/ad;-><init>(II)V

    return-object v1
.end method
