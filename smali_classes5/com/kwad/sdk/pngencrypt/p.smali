.class final Lcom/kwad/sdk/pngencrypt/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final aLu:Lcom/kwad/sdk/pngencrypt/e;

.field public final aMS:Z

.field aMT:I

.field aMU:I

.field aMV:I

.field aMW:I

.field aMX:I

.field aMY:I

.field aMZ:I

.field aMa:I

.field aMd:I

.field aMe:I

.field aMf:I

.field aMg:I

.field public final aMq:Lcom/kwad/sdk/pngencrypt/k;

.field buf:[B


# direct methods
.method public constructor <init>(Lcom/kwad/sdk/pngencrypt/k;Lcom/kwad/sdk/pngencrypt/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kwad/sdk/pngencrypt/p;->aMq:Lcom/kwad/sdk/pngencrypt/k;

    .line 3
    iput-object p2, p0, Lcom/kwad/sdk/pngencrypt/p;->aLu:Lcom/kwad/sdk/pngencrypt/e;

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 4
    :goto_0
    iput-boolean p1, p0, Lcom/kwad/sdk/pngencrypt/p;->aMS:Z

    return-void
.end method


# virtual methods
.method final h([BI)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/pngencrypt/p;->buf:[B

    .line 2
    iput p2, p0, Lcom/kwad/sdk/pngencrypt/p;->aMZ:I

    return-void
.end method

.method final update(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/kwad/sdk/pngencrypt/p;->aMT:I

    .line 2
    iget-boolean v0, p0, Lcom/kwad/sdk/pngencrypt/p;->aMS:Z

    if-eqz v0, :cond_0

    .line 3
    iget-object p1, p0, Lcom/kwad/sdk/pngencrypt/p;->aLu:Lcom/kwad/sdk/pngencrypt/e;

    invoke-virtual {p1}, Lcom/kwad/sdk/pngencrypt/e;->KC()I

    move-result p1

    iput p1, p0, Lcom/kwad/sdk/pngencrypt/p;->aMa:I

    .line 4
    iget-object p1, p0, Lcom/kwad/sdk/pngencrypt/p;->aLu:Lcom/kwad/sdk/pngencrypt/e;

    iget v0, p1, Lcom/kwad/sdk/pngencrypt/e;->aMe:I

    iput v0, p0, Lcom/kwad/sdk/pngencrypt/p;->aMe:I

    .line 5
    iget v0, p1, Lcom/kwad/sdk/pngencrypt/e;->aMd:I

    iput v0, p0, Lcom/kwad/sdk/pngencrypt/p;->aMd:I

    .line 6
    iget v0, p1, Lcom/kwad/sdk/pngencrypt/e;->aMg:I

    iput v0, p0, Lcom/kwad/sdk/pngencrypt/p;->aMg:I

    .line 7
    iget v0, p1, Lcom/kwad/sdk/pngencrypt/e;->aMf:I

    iput v0, p0, Lcom/kwad/sdk/pngencrypt/p;->aMf:I

    .line 8
    invoke-virtual {p1}, Lcom/kwad/sdk/pngencrypt/e;->KB()I

    move-result p1

    iput p1, p0, Lcom/kwad/sdk/pngencrypt/p;->aMU:I

    .line 9
    iget-object p1, p0, Lcom/kwad/sdk/pngencrypt/p;->aLu:Lcom/kwad/sdk/pngencrypt/e;

    invoke-virtual {p1}, Lcom/kwad/sdk/pngencrypt/e;->KA()I

    move-result p1

    iput p1, p0, Lcom/kwad/sdk/pngencrypt/p;->aMV:I

    .line 10
    iget-object p1, p0, Lcom/kwad/sdk/pngencrypt/p;->aLu:Lcom/kwad/sdk/pngencrypt/e;

    invoke-virtual {p1}, Lcom/kwad/sdk/pngencrypt/e;->KD()I

    move-result p1

    iput p1, p0, Lcom/kwad/sdk/pngencrypt/p;->aMW:I

    .line 11
    iget-object p1, p0, Lcom/kwad/sdk/pngencrypt/p;->aLu:Lcom/kwad/sdk/pngencrypt/e;

    invoke-virtual {p1}, Lcom/kwad/sdk/pngencrypt/e;->KE()I

    move-result p1

    iput p1, p0, Lcom/kwad/sdk/pngencrypt/p;->aMX:I

    .line 12
    iget-object v0, p0, Lcom/kwad/sdk/pngencrypt/p;->aMq:Lcom/kwad/sdk/pngencrypt/k;

    iget v0, v0, Lcom/kwad/sdk/pngencrypt/k;->aMA:I

    mul-int v0, v0, p1

    add-int/lit8 v0, v0, 0x7

    div-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/kwad/sdk/pngencrypt/p;->aMY:I

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 13
    iput v0, p0, Lcom/kwad/sdk/pngencrypt/p;->aMa:I

    .line 14
    iput v0, p0, Lcom/kwad/sdk/pngencrypt/p;->aMd:I

    iput v0, p0, Lcom/kwad/sdk/pngencrypt/p;->aMe:I

    const/4 v0, 0x0

    .line 15
    iput v0, p0, Lcom/kwad/sdk/pngencrypt/p;->aMf:I

    iput v0, p0, Lcom/kwad/sdk/pngencrypt/p;->aMg:I

    .line 16
    iput p1, p0, Lcom/kwad/sdk/pngencrypt/p;->aMV:I

    iput p1, p0, Lcom/kwad/sdk/pngencrypt/p;->aMU:I

    .line 17
    iget-object p1, p0, Lcom/kwad/sdk/pngencrypt/p;->aMq:Lcom/kwad/sdk/pngencrypt/k;

    iget v0, p1, Lcom/kwad/sdk/pngencrypt/k;->aMb:I

    iput v0, p0, Lcom/kwad/sdk/pngencrypt/p;->aMW:I

    .line 18
    iget v0, p1, Lcom/kwad/sdk/pngencrypt/k;->aMc:I

    iput v0, p0, Lcom/kwad/sdk/pngencrypt/p;->aMX:I

    .line 19
    iget p1, p1, Lcom/kwad/sdk/pngencrypt/k;->aMC:I

    iput p1, p0, Lcom/kwad/sdk/pngencrypt/p;->aMY:I

    return-void
.end method
