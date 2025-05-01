.class public final Lcom/kwad/sdk/pngencrypt/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final aLZ:Lcom/kwad/sdk/pngencrypt/k;

.field private aMa:I

.field private aMb:I

.field private aMc:I

.field aMd:I

.field aMe:I

.field aMf:I

.field aMg:I

.field aMh:I

.field aMi:I

.field private aMj:I

.field private aMk:I

.field private aMl:I

.field aMm:I

.field private aMn:Z


# direct methods
.method public constructor <init>(Lcom/kwad/sdk/pngencrypt/k;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kwad/sdk/pngencrypt/e;->aMn:Z

    .line 3
    iput-object p1, p0, Lcom/kwad/sdk/pngencrypt/e;->aLZ:Lcom/kwad/sdk/pngencrypt/k;

    .line 4
    iput v0, p0, Lcom/kwad/sdk/pngencrypt/e;->aMa:I

    const/4 p1, -0x1

    .line 5
    iput p1, p0, Lcom/kwad/sdk/pngencrypt/e;->aMj:I

    .line 6
    iput p1, p0, Lcom/kwad/sdk/pngencrypt/e;->aMk:I

    .line 7
    iput v0, p0, Lcom/kwad/sdk/pngencrypt/e;->aMl:I

    .line 8
    iput-boolean v0, p0, Lcom/kwad/sdk/pngencrypt/e;->aMn:Z

    .line 9
    iput v0, p0, Lcom/kwad/sdk/pngencrypt/e;->aMm:I

    const/4 p1, 0x1

    .line 10
    invoke-direct {p0, p1}, Lcom/kwad/sdk/pngencrypt/e;->dG(I)V

    .line 11
    invoke-direct {p0, v0}, Lcom/kwad/sdk/pngencrypt/e;->dF(I)V

    return-void
.end method

.method private KF()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/pngencrypt/e;->KE()I

    move-result v0

    return v0
.end method

.method private dF(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/kwad/sdk/pngencrypt/e;->aMj:I

    .line 2
    iget v0, p0, Lcom/kwad/sdk/pngencrypt/e;->aMd:I

    mul-int p1, p1, v0

    iget v0, p0, Lcom/kwad/sdk/pngencrypt/e;->aMf:I

    add-int/2addr p1, v0

    iput p1, p0, Lcom/kwad/sdk/pngencrypt/e;->aMk:I

    if-ltz p1, :cond_0

    .line 3
    iget-object v0, p0, Lcom/kwad/sdk/pngencrypt/e;->aLZ:Lcom/kwad/sdk/pngencrypt/k;

    iget v0, v0, Lcom/kwad/sdk/pngencrypt/k;->aMb:I

    if-ge p1, v0, :cond_0

    return-void

    .line 4
    :cond_0
    new-instance p1, Lcom/kwad/sdk/pngencrypt/PngjException;

    const-string v0, "bad row - this should not happen"

    invoke-direct {p1, v0}, Lcom/kwad/sdk/pngencrypt/PngjException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private dG(I)V
    .locals 7

    .line 1
    iget v0, p0, Lcom/kwad/sdk/pngencrypt/e;->aMa:I

    if-ne v0, p1, :cond_0

    return-void

    .line 2
    :cond_0
    iput p1, p0, Lcom/kwad/sdk/pngencrypt/e;->aMa:I

    .line 3
    invoke-static {p1}, Lcom/kwad/sdk/pngencrypt/e;->dH(I)[B

    move-result-object p1

    const/4 v0, 0x0

    .line 4
    aget-byte v1, p1, v0

    iput v1, p0, Lcom/kwad/sdk/pngencrypt/e;->aMe:I

    const/4 v2, 0x1

    .line 5
    aget-byte v3, p1, v2

    iput v3, p0, Lcom/kwad/sdk/pngencrypt/e;->aMd:I

    const/4 v4, 0x2

    .line 6
    aget-byte v4, p1, v4

    iput v4, p0, Lcom/kwad/sdk/pngencrypt/e;->aMg:I

    const/4 v5, 0x3

    .line 7
    aget-byte p1, p1, v5

    iput p1, p0, Lcom/kwad/sdk/pngencrypt/e;->aMf:I

    .line 8
    iget-object v5, p0, Lcom/kwad/sdk/pngencrypt/e;->aLZ:Lcom/kwad/sdk/pngencrypt/k;

    iget v6, v5, Lcom/kwad/sdk/pngencrypt/k;->aMb:I

    if-le v6, p1, :cond_1

    add-int/2addr v6, v3

    sub-int/2addr v6, v2

    sub-int/2addr v6, p1

    div-int/2addr v6, v3

    goto :goto_0

    :cond_1
    const/4 v6, 0x0

    :goto_0
    iput v6, p0, Lcom/kwad/sdk/pngencrypt/e;->aMb:I

    .line 9
    iget p1, v5, Lcom/kwad/sdk/pngencrypt/k;->aMc:I

    if-le p1, v4, :cond_2

    add-int/2addr p1, v1

    sub-int/2addr p1, v2

    sub-int/2addr p1, v4

    div-int/2addr p1, v1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    iput p1, p0, Lcom/kwad/sdk/pngencrypt/e;->aMc:I

    if-nez p1, :cond_3

    .line 10
    iput v0, p0, Lcom/kwad/sdk/pngencrypt/e;->aMb:I

    .line 11
    :cond_3
    iget p1, v5, Lcom/kwad/sdk/pngencrypt/k;->aMv:I

    mul-int v1, v1, p1

    iput v1, p0, Lcom/kwad/sdk/pngencrypt/e;->aMi:I

    mul-int v4, v4, p1

    .line 12
    iput v4, p0, Lcom/kwad/sdk/pngencrypt/e;->aMh:I

    return-void
.end method

.method private static dH(I)[B
    .locals 3

    const/4 v0, 0x4

    packed-switch p0, :pswitch_data_0

    .line 1
    new-instance v0, Lcom/kwad/sdk/pngencrypt/PngjException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "bad interlace pass"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/kwad/sdk/pngencrypt/PngjException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    new-array p0, v0, [B

    .line 2
    fill-array-data p0, :array_0

    return-object p0

    :pswitch_1
    new-array p0, v0, [B

    .line 3
    fill-array-data p0, :array_1

    return-object p0

    :pswitch_2
    new-array p0, v0, [B

    .line 4
    fill-array-data p0, :array_2

    return-object p0

    :pswitch_3
    new-array p0, v0, [B

    .line 5
    fill-array-data p0, :array_3

    return-object p0

    :pswitch_4
    new-array p0, v0, [B

    .line 6
    fill-array-data p0, :array_4

    return-object p0

    :pswitch_5
    new-array p0, v0, [B

    .line 7
    fill-array-data p0, :array_5

    return-object p0

    :pswitch_6
    new-array p0, v0, [B

    .line 8
    fill-array-data p0, :array_6

    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :array_0
    .array-data 1
        0x1t
        0x2t
        0x0t
        0x1t
    .end array-data

    :array_1
    .array-data 1
        0x2t
        0x2t
        0x1t
        0x0t
    .end array-data

    :array_2
    .array-data 1
        0x2t
        0x4t
        0x0t
        0x2t
    .end array-data

    :array_3
    .array-data 1
        0x4t
        0x4t
        0x2t
        0x0t
    .end array-data

    :array_4
    .array-data 1
        0x4t
        0x8t
        0x0t
        0x4t
    .end array-data

    :array_5
    .array-data 1
        0x8t
        0x8t
        0x4t
        0x0t
    .end array-data

    :array_6
    .array-data 1
        0x8t
        0x8t
        0x0t
        0x0t
    .end array-data
.end method


# virtual methods
.method final KA()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/sdk/pngencrypt/e;->aMj:I

    return v0
.end method

.method final KB()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/sdk/pngencrypt/e;->aMk:I

    return v0
.end method

.method final KC()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/sdk/pngencrypt/e;->aMa:I

    return v0
.end method

.method final KD()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/sdk/pngencrypt/e;->aMb:I

    return v0
.end method

.method final KE()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/sdk/pngencrypt/e;->aMc:I

    return v0
.end method

.method public final KG()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/pngencrypt/e;->aLZ:Lcom/kwad/sdk/pngencrypt/k;

    iget v0, v0, Lcom/kwad/sdk/pngencrypt/k;->aMA:I

    invoke-direct {p0}, Lcom/kwad/sdk/pngencrypt/e;->KF()I

    move-result v1

    mul-int v0, v0, v1

    add-int/lit8 v0, v0, 0x7

    div-int/lit8 v0, v0, 0x8

    return v0
.end method

.method final Kz()Z
    .locals 4

    .line 1
    :goto_0
    iget v0, p0, Lcom/kwad/sdk/pngencrypt/e;->aMl:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/kwad/sdk/pngencrypt/e;->aMl:I

    .line 2
    iget v0, p0, Lcom/kwad/sdk/pngencrypt/e;->aMb:I

    if-eqz v0, :cond_1

    iget v2, p0, Lcom/kwad/sdk/pngencrypt/e;->aMj:I

    add-int/lit8 v0, v0, -0x1

    if-lt v2, v0, :cond_0

    goto :goto_1

    :cond_0
    add-int/2addr v2, v1

    .line 3
    invoke-direct {p0, v2}, Lcom/kwad/sdk/pngencrypt/e;->dF(I)V

    goto :goto_2

    .line 4
    :cond_1
    :goto_1
    iget v0, p0, Lcom/kwad/sdk/pngencrypt/e;->aMa:I

    const/4 v2, 0x7

    const/4 v3, 0x0

    if-ne v0, v2, :cond_2

    .line 5
    iput-boolean v1, p0, Lcom/kwad/sdk/pngencrypt/e;->aMn:Z

    return v3

    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 6
    invoke-direct {p0, v0}, Lcom/kwad/sdk/pngencrypt/e;->dG(I)V

    .line 7
    iget v0, p0, Lcom/kwad/sdk/pngencrypt/e;->aMb:I

    if-nez v0, :cond_3

    .line 8
    iget v0, p0, Lcom/kwad/sdk/pngencrypt/e;->aMl:I

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/kwad/sdk/pngencrypt/e;->aMl:I

    goto :goto_0

    .line 9
    :cond_3
    invoke-direct {p0, v3}, Lcom/kwad/sdk/pngencrypt/e;->dF(I)V

    :goto_2
    return v1
.end method
