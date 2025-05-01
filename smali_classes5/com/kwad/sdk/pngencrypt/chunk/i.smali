.class public final Lcom/kwad/sdk/pngencrypt/chunk/i;
.super Lcom/kwad/sdk/pngencrypt/chunk/p;
.source "SourceFile"


# instance fields
.field private aMb:I

.field private aMc:I

.field private aNA:I

.field private aNw:I

.field private aNx:I

.field private aNy:I

.field private aNz:I


# direct methods
.method public constructor <init>(Lcom/kwad/sdk/pngencrypt/k;)V
    .locals 1

    const-string v0, "IHDR"

    .line 1
    invoke-direct {p0, v0, p1}, Lcom/kwad/sdk/pngencrypt/chunk/p;-><init>(Ljava/lang/String;Lcom/kwad/sdk/pngencrypt/k;)V

    if-eqz p1, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/kwad/sdk/pngencrypt/chunk/i;->Lb()V

    :cond_0
    return-void
.end method

.method private KD()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/sdk/pngencrypt/chunk/i;->aMb:I

    return v0
.end method

.method private KE()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/sdk/pngencrypt/chunk/i;->aMc:I

    return v0
.end method

.method private KX()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/sdk/pngencrypt/chunk/i;->aNw:I

    return v0
.end method

.method private KY()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/sdk/pngencrypt/chunk/i;->aNx:I

    return v0
.end method

.method private KZ()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/sdk/pngencrypt/chunk/i;->aNA:I

    return v0
.end method

.method private Lb()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/pngencrypt/chunk/PngChunk;->aMq:Lcom/kwad/sdk/pngencrypt/k;

    iget v0, v0, Lcom/kwad/sdk/pngencrypt/k;->aMc:I

    invoke-direct {p0, v0}, Lcom/kwad/sdk/pngencrypt/chunk/i;->dP(I)V

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/pngencrypt/chunk/PngChunk;->aMq:Lcom/kwad/sdk/pngencrypt/k;

    iget v0, v0, Lcom/kwad/sdk/pngencrypt/k;->aMb:I

    invoke-direct {p0, v0}, Lcom/kwad/sdk/pngencrypt/chunk/i;->dQ(I)V

    .line 3
    iget-object v0, p0, Lcom/kwad/sdk/pngencrypt/chunk/PngChunk;->aMq:Lcom/kwad/sdk/pngencrypt/k;

    iget v0, v0, Lcom/kwad/sdk/pngencrypt/k;->aMu:I

    invoke-direct {p0, v0}, Lcom/kwad/sdk/pngencrypt/chunk/i;->dR(I)V

    .line 4
    iget-object v0, p0, Lcom/kwad/sdk/pngencrypt/chunk/PngChunk;->aMq:Lcom/kwad/sdk/pngencrypt/k;

    iget-boolean v1, v0, Lcom/kwad/sdk/pngencrypt/k;->aMw:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 5
    :goto_0
    iget-boolean v3, v0, Lcom/kwad/sdk/pngencrypt/k;->aMy:Z

    if-eqz v3, :cond_1

    add-int/lit8 v1, v1, 0x1

    .line 6
    :cond_1
    iget-boolean v0, v0, Lcom/kwad/sdk/pngencrypt/k;->aMx:Z

    if-nez v0, :cond_2

    add-int/lit8 v1, v1, 0x2

    .line 7
    :cond_2
    invoke-direct {p0, v1}, Lcom/kwad/sdk/pngencrypt/chunk/i;->dS(I)V

    .line 8
    invoke-direct {p0, v2}, Lcom/kwad/sdk/pngencrypt/chunk/i;->dT(I)V

    .line 9
    invoke-direct {p0, v2}, Lcom/kwad/sdk/pngencrypt/chunk/i;->dU(I)V

    .line 10
    invoke-direct {p0, v2}, Lcom/kwad/sdk/pngencrypt/chunk/i;->dV(I)V

    return-void
.end method

.method private Ld()V
    .locals 8

    .line 1
    iget v0, p0, Lcom/kwad/sdk/pngencrypt/chunk/i;->aMc:I

    if-lez v0, :cond_9

    iget v0, p0, Lcom/kwad/sdk/pngencrypt/chunk/i;->aMb:I

    if-lez v0, :cond_9

    iget v0, p0, Lcom/kwad/sdk/pngencrypt/chunk/i;->aNy:I

    if-nez v0, :cond_9

    iget v0, p0, Lcom/kwad/sdk/pngencrypt/chunk/i;->aNz:I

    if-nez v0, :cond_9

    .line 2
    iget v0, p0, Lcom/kwad/sdk/pngencrypt/chunk/i;->aNw:I

    const/16 v1, 0x8

    const/4 v2, 0x4

    const/4 v3, 0x2

    const/4 v4, 0x1

    const-string v5, "bad IHDR: bitdepth invalid"

    const/16 v6, 0x10

    if-eq v0, v4, :cond_1

    if-eq v0, v3, :cond_1

    if-eq v0, v2, :cond_1

    if-eq v0, v1, :cond_1

    if-ne v0, v6, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    new-instance v0, Lcom/kwad/sdk/pngencrypt/PngjException;

    invoke-direct {v0, v5}, Lcom/kwad/sdk/pngencrypt/PngjException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 4
    :cond_1
    :goto_0
    iget v7, p0, Lcom/kwad/sdk/pngencrypt/chunk/i;->aNA:I

    if-ltz v7, :cond_8

    if-gt v7, v4, :cond_8

    .line 5
    iget v4, p0, Lcom/kwad/sdk/pngencrypt/chunk/i;->aNx:I

    if-eqz v4, :cond_7

    const/4 v7, 0x6

    if-eq v4, v7, :cond_5

    if-eq v4, v3, :cond_5

    const/4 v3, 0x3

    if-eq v4, v3, :cond_3

    if-ne v4, v2, :cond_2

    goto :goto_1

    .line 6
    :cond_2
    new-instance v0, Lcom/kwad/sdk/pngencrypt/PngjException;

    const-string v1, "bad IHDR: invalid colormodel"

    invoke-direct {v0, v1}, Lcom/kwad/sdk/pngencrypt/PngjException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    if-eq v0, v6, :cond_4

    goto :goto_2

    .line 7
    :cond_4
    new-instance v0, Lcom/kwad/sdk/pngencrypt/PngjException;

    invoke-direct {v0, v5}, Lcom/kwad/sdk/pngencrypt/PngjException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_1
    if-eq v0, v1, :cond_7

    if-ne v0, v6, :cond_6

    goto :goto_2

    .line 8
    :cond_6
    new-instance v0, Lcom/kwad/sdk/pngencrypt/PngjException;

    invoke-direct {v0, v5}, Lcom/kwad/sdk/pngencrypt/PngjException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    :goto_2
    return-void

    .line 9
    :cond_8
    new-instance v0, Lcom/kwad/sdk/pngencrypt/PngjException;

    const-string v1, "bad IHDR: interlace invalid"

    invoke-direct {v0, v1}, Lcom/kwad/sdk/pngencrypt/PngjException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 10
    :cond_9
    new-instance v0, Lcom/kwad/sdk/pngencrypt/PngjException;

    const-string v1, "bad IHDR: col/row/compmethod/filmethod invalid"

    invoke-direct {v0, v1}, Lcom/kwad/sdk/pngencrypt/PngjException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private dP(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/pngencrypt/chunk/i;->aMc:I

    return-void
.end method

.method private dQ(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/pngencrypt/chunk/i;->aMb:I

    return-void
.end method

.method private dR(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/pngencrypt/chunk/i;->aNw:I

    return-void
.end method

.method private dS(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/pngencrypt/chunk/i;->aNx:I

    return-void
.end method

.method private dT(I)V
    .locals 0

    const/4 p1, 0x0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/pngencrypt/chunk/i;->aNy:I

    return-void
.end method

.method private dU(I)V
    .locals 0

    const/4 p1, 0x0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/pngencrypt/chunk/i;->aNz:I

    return-void
.end method

.method private dV(I)V
    .locals 0

    const/4 p1, 0x0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/pngencrypt/chunk/i;->aNA:I

    return-void
.end method


# virtual methods
.method public final La()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/pngencrypt/chunk/i;->KZ()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final Lc()Lcom/kwad/sdk/pngencrypt/k;
    .locals 11

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/pngencrypt/chunk/i;->Ld()V

    .line 2
    invoke-direct {p0}, Lcom/kwad/sdk/pngencrypt/chunk/i;->KY()I

    move-result v0

    const/4 v1, 0x4

    and-int/2addr v0, v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_0

    const/4 v8, 0x1

    goto :goto_0

    :cond_0
    const/4 v8, 0x0

    .line 3
    :goto_0
    invoke-direct {p0}, Lcom/kwad/sdk/pngencrypt/chunk/i;->KY()I

    move-result v0

    and-int/2addr v0, v3

    if-eqz v0, :cond_1

    const/4 v10, 0x1

    goto :goto_1

    :cond_1
    const/4 v10, 0x0

    .line 4
    :goto_1
    invoke-direct {p0}, Lcom/kwad/sdk/pngencrypt/chunk/i;->KY()I

    move-result v0

    if-eqz v0, :cond_3

    invoke-direct {p0}, Lcom/kwad/sdk/pngencrypt/chunk/i;->KY()I

    move-result v0

    if-ne v0, v1, :cond_2

    goto :goto_2

    :cond_2
    const/4 v9, 0x0

    goto :goto_3

    :cond_3
    :goto_2
    const/4 v9, 0x1

    .line 5
    :goto_3
    new-instance v0, Lcom/kwad/sdk/pngencrypt/k;

    invoke-direct {p0}, Lcom/kwad/sdk/pngencrypt/chunk/i;->KE()I

    move-result v5

    invoke-direct {p0}, Lcom/kwad/sdk/pngencrypt/chunk/i;->KD()I

    move-result v6

    invoke-direct {p0}, Lcom/kwad/sdk/pngencrypt/chunk/i;->KX()I

    move-result v7

    move-object v4, v0

    invoke-direct/range {v4 .. v10}, Lcom/kwad/sdk/pngencrypt/k;-><init>(IIIZZZ)V

    return-object v0
.end method

.method public final a(Lcom/kwad/sdk/pngencrypt/chunk/d;)V
    .locals 3

    .line 1
    iget v0, p1, Lcom/kwad/sdk/pngencrypt/chunk/d;->len:I

    const/16 v1, 0xd

    if-ne v0, v1, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/kwad/sdk/pngencrypt/chunk/d;->KT()Ljava/io/ByteArrayInputStream;

    move-result-object p1

    .line 3
    invoke-static {p1}, Lcom/kwad/sdk/pngencrypt/n;->f(Ljava/io/InputStream;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/pngencrypt/chunk/i;->aMc:I

    .line 4
    invoke-static {p1}, Lcom/kwad/sdk/pngencrypt/n;->f(Ljava/io/InputStream;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/pngencrypt/chunk/i;->aMb:I

    .line 5
    invoke-static {p1}, Lcom/kwad/sdk/pngencrypt/n;->e(Ljava/io/InputStream;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/pngencrypt/chunk/i;->aNw:I

    .line 6
    invoke-static {p1}, Lcom/kwad/sdk/pngencrypt/n;->e(Ljava/io/InputStream;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/pngencrypt/chunk/i;->aNx:I

    .line 7
    invoke-static {p1}, Lcom/kwad/sdk/pngencrypt/n;->e(Ljava/io/InputStream;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/pngencrypt/chunk/i;->aNy:I

    .line 8
    invoke-static {p1}, Lcom/kwad/sdk/pngencrypt/n;->e(Ljava/io/InputStream;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/pngencrypt/chunk/i;->aNz:I

    .line 9
    invoke-static {p1}, Lcom/kwad/sdk/pngencrypt/n;->e(Ljava/io/InputStream;)I

    move-result p1

    iput p1, p0, Lcom/kwad/sdk/pngencrypt/chunk/i;->aNA:I

    return-void

    .line 10
    :cond_0
    new-instance v0, Lcom/kwad/sdk/pngencrypt/PngjException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Bad IDHR len "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p1, p1, Lcom/kwad/sdk/pngencrypt/chunk/d;->len:I

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/kwad/sdk/pngencrypt/PngjException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
