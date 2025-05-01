.class public final Lcom/kwad/sdk/pngencrypt/chunk/s;
.super Lcom/kwad/sdk/pngencrypt/chunk/p;
.source "SourceFile"


# instance fields
.field private aNQ:I

.field private aNR:I

.field private aNS:I

.field private aNT:I

.field private aNU:[I


# direct methods
.method public constructor <init>(Lcom/kwad/sdk/pngencrypt/k;)V
    .locals 1

    const-string v0, "tRNS"

    .line 1
    invoke-direct {p0, v0, p1}, Lcom/kwad/sdk/pngencrypt/chunk/p;-><init>(Ljava/lang/String;Lcom/kwad/sdk/pngencrypt/k;)V

    const/4 p1, 0x0

    new-array p1, p1, [I

    .line 2
    iput-object p1, p0, Lcom/kwad/sdk/pngencrypt/chunk/s;->aNU:[I

    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/sdk/pngencrypt/chunk/d;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/pngencrypt/chunk/PngChunk;->aMq:Lcom/kwad/sdk/pngencrypt/k;

    iget-boolean v1, v0, Lcom/kwad/sdk/pngencrypt/k;->aMx:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 2
    iget-object p1, p1, Lcom/kwad/sdk/pngencrypt/chunk/d;->data:[B

    invoke-static {p1, v2}, Lcom/kwad/sdk/pngencrypt/n;->f([BI)I

    move-result p1

    iput p1, p0, Lcom/kwad/sdk/pngencrypt/chunk/s;->aNQ:I

    return-void

    .line 3
    :cond_0
    iget-boolean v0, v0, Lcom/kwad/sdk/pngencrypt/k;->aMy:Z

    if-eqz v0, :cond_2

    .line 4
    iget-object v0, p1, Lcom/kwad/sdk/pngencrypt/chunk/d;->data:[B

    array-length v0, v0

    .line 5
    new-array v1, v0, [I

    iput-object v1, p0, Lcom/kwad/sdk/pngencrypt/chunk/s;->aNU:[I

    :goto_0
    if-ge v2, v0, :cond_1

    .line 6
    iget-object v1, p0, Lcom/kwad/sdk/pngencrypt/chunk/s;->aNU:[I

    iget-object v3, p1, Lcom/kwad/sdk/pngencrypt/chunk/d;->data:[B

    aget-byte v3, v3, v2

    and-int/lit16 v3, v3, 0xff

    aput v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void

    .line 7
    :cond_2
    iget-object v0, p1, Lcom/kwad/sdk/pngencrypt/chunk/d;->data:[B

    invoke-static {v0, v2}, Lcom/kwad/sdk/pngencrypt/n;->f([BI)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/pngencrypt/chunk/s;->aNR:I

    .line 8
    iget-object v0, p1, Lcom/kwad/sdk/pngencrypt/chunk/d;->data:[B

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/kwad/sdk/pngencrypt/n;->f([BI)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/pngencrypt/chunk/s;->aNS:I

    .line 9
    iget-object p1, p1, Lcom/kwad/sdk/pngencrypt/chunk/d;->data:[B

    const/4 v0, 0x4

    invoke-static {p1, v0}, Lcom/kwad/sdk/pngencrypt/n;->f([BI)I

    move-result p1

    iput p1, p0, Lcom/kwad/sdk/pngencrypt/chunk/s;->aNT:I

    return-void
.end method
