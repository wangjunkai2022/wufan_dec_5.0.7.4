.class public final Lcom/kwad/sdk/utils/bn;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private aSb:J

.field private aSc:J

.field private aSd:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-direct {p0}, Lcom/kwad/sdk/utils/bn;->reset()V

    return-void
.end method

.method private reset()V
    .locals 2

    const-wide/16 v0, 0x0

    .line 1
    iput-wide v0, p0, Lcom/kwad/sdk/utils/bn;->aSb:J

    const-wide/16 v0, -0x1

    .line 2
    iput-wide v0, p0, Lcom/kwad/sdk/utils/bn;->aSc:J

    return-void
.end method


# virtual methods
.method public final Oa()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/kwad/sdk/utils/bn;->aSd:Z

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-wide v0, p0, Lcom/kwad/sdk/utils/bn;->aSc:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gez v4, :cond_1

    .line 3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/sdk/utils/bn;->aSc:J

    :cond_1
    return-void
.end method

.method public final Ob()V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lcom/kwad/sdk/utils/bn;->aSd:Z

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-wide v0, p0, Lcom/kwad/sdk/utils/bn;->aSc:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_1

    .line 3
    iget-wide v0, p0, Lcom/kwad/sdk/utils/bn;->aSb:J

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/kwad/sdk/utils/bn;->aSc:J

    sub-long/2addr v2, v4

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/kwad/sdk/utils/bn;->aSb:J

    const-wide/16 v0, -0x1

    .line 4
    iput-wide v0, p0, Lcom/kwad/sdk/utils/bn;->aSc:J

    :cond_1
    return-void
.end method

.method public final Oc()J
    .locals 6

    .line 1
    iget-boolean v0, p0, Lcom/kwad/sdk/utils/bn;->aSd:Z

    const-wide/16 v1, 0x0

    if-nez v0, :cond_0

    return-wide v1

    :cond_0
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kwad/sdk/utils/bn;->aSd:Z

    .line 3
    iget-wide v3, p0, Lcom/kwad/sdk/utils/bn;->aSc:J

    cmp-long v0, v3, v1

    if-lez v0, :cond_1

    .line 4
    iget-wide v0, p0, Lcom/kwad/sdk/utils/bn;->aSb:J

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/kwad/sdk/utils/bn;->aSc:J

    sub-long/2addr v2, v4

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/kwad/sdk/utils/bn;->aSb:J

    const-wide/16 v0, -0x1

    .line 5
    iput-wide v0, p0, Lcom/kwad/sdk/utils/bn;->aSc:J

    .line 6
    :cond_1
    iget-wide v0, p0, Lcom/kwad/sdk/utils/bn;->aSb:J

    return-wide v0
.end method

.method public final getTime()J
    .locals 5

    .line 1
    iget-wide v0, p0, Lcom/kwad/sdk/utils/bn;->aSc:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    .line 2
    iget-wide v0, p0, Lcom/kwad/sdk/utils/bn;->aSb:J

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    add-long/2addr v0, v2

    iget-wide v2, p0, Lcom/kwad/sdk/utils/bn;->aSc:J

    sub-long/2addr v0, v2

    return-wide v0

    .line 3
    :cond_0
    iget-wide v0, p0, Lcom/kwad/sdk/utils/bn;->aSb:J

    return-wide v0
.end method

.method public final startTiming()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/utils/bn;->reset()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/kwad/sdk/utils/bn;->aSd:Z

    .line 3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/sdk/utils/bn;->aSc:J

    return-void
.end method
