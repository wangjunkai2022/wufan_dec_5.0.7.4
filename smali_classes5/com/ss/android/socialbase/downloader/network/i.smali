.class Lcom/ss/android/socialbase/downloader/network/i;
.super Ljava/lang/Object;


# instance fields
.field private i:I

.field private final m:I

.field private p:D

.field private final vv:D


# direct methods
.method public constructor <init>(D)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    .line 2
    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/network/i;->p:D

    .line 3
    iput-wide p1, p0, Lcom/ss/android/socialbase/downloader/network/i;->vv:D

    const-wide/16 v0, 0x0

    cmpl-double v2, p1, v0

    if-nez v2, :cond_0

    const p1, 0x7fffffff

    goto :goto_0

    :cond_0
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    div-double/2addr v0, p1

    .line 4
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide p1

    double-to-int p1, p1

    :goto_0
    iput p1, p0, Lcom/ss/android/socialbase/downloader/network/i;->m:I

    return-void
.end method


# virtual methods
.method public vv()D
    .locals 2

    .line 8
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/network/i;->p:D

    return-wide v0
.end method

.method public vv(D)V
    .locals 7

    .line 1
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/network/i;->vv:D

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    sub-double v0, v2, v0

    .line 2
    iget v4, p0, Lcom/ss/android/socialbase/downloader/network/i;->i:I

    iget v5, p0, Lcom/ss/android/socialbase/downloader/network/i;->m:I

    if-le v4, v5, :cond_0

    .line 3
    iget-wide v2, p0, Lcom/ss/android/socialbase/downloader/network/i;->p:D

    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    move-result-wide v2

    mul-double v0, v0, v2

    iget-wide v2, p0, Lcom/ss/android/socialbase/downloader/network/i;->vv:D

    invoke-static {p1, p2}, Ljava/lang/Math;->log(D)D

    move-result-wide p1

    mul-double v2, v2, p1

    add-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->exp(D)D

    move-result-wide p1

    iput-wide p1, p0, Lcom/ss/android/socialbase/downloader/network/i;->p:D

    goto :goto_0

    :cond_0
    if-lez v4, :cond_1

    int-to-double v5, v4

    .line 4
    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, v5

    int-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v4, v2

    div-double/2addr v0, v4

    sub-double/2addr v2, v0

    .line 5
    iget-wide v4, p0, Lcom/ss/android/socialbase/downloader/network/i;->p:D

    invoke-static {v4, v5}, Ljava/lang/Math;->log(D)D

    move-result-wide v4

    mul-double v0, v0, v4

    invoke-static {p1, p2}, Ljava/lang/Math;->log(D)D

    move-result-wide p1

    mul-double v2, v2, p1

    add-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->exp(D)D

    move-result-wide p1

    iput-wide p1, p0, Lcom/ss/android/socialbase/downloader/network/i;->p:D

    goto :goto_0

    .line 6
    :cond_1
    iput-wide p1, p0, Lcom/ss/android/socialbase/downloader/network/i;->p:D

    .line 7
    :goto_0
    iget p1, p0, Lcom/ss/android/socialbase/downloader/network/i;->i:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/ss/android/socialbase/downloader/network/i;->i:I

    return-void
.end method
