.class public final Lcom/kwad/components/core/p/c;
.super Ljava/io/InputStream;
.source "SourceFile"


# instance fields
.field private SQ:I

.field private SR:I

.field private SS:J

.field private ST:Ljava/io/InputStream;

.field private SU:I

.field private SV:J

.field private volatile SW:F

.field private volatile SX:J

.field private SY:I


# direct methods
.method constructor <init>(Ljava/io/InputStream;I)V
    .locals 2
    .param p1    # Ljava/io/InputStream;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lcom/kwad/components/core/p/c;->SQ:I

    const/16 v0, 0x2710

    .line 3
    iput v0, p0, Lcom/kwad/components/core/p/c;->SR:I

    const-wide/16 v0, -0x1

    .line 4
    iput-wide v0, p0, Lcom/kwad/components/core/p/c;->SS:J

    .line 5
    iput-wide v0, p0, Lcom/kwad/components/core/p/c;->SV:J

    const/16 v0, 0x5000

    .line 6
    iput v0, p0, Lcom/kwad/components/core/p/c;->SY:I

    if-ge p2, v0, :cond_0

    const/16 p2, 0x5000

    .line 7
    :cond_0
    iput-object p1, p0, Lcom/kwad/components/core/p/c;->ST:Ljava/io/InputStream;

    int-to-float p1, p2

    const/high16 p2, 0x447a0000    # 1000.0f

    div-float/2addr p1, p2

    .line 8
    iput p1, p0, Lcom/kwad/components/core/p/c;->SW:F

    return-void
.end method

.method private static H(J)V
    .locals 0
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .line 1
    :try_start_0
    invoke-static {p0, p1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 2
    invoke-virtual {p0}, Ljava/lang/InterruptedException;->printStackTrace()V

    return-void
.end method

.method private static g(JJ)J
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-gtz v2, :cond_0

    return-wide v0

    :cond_0
    cmp-long v2, p2, v0

    if-gtz v2, :cond_1

    const-wide/16 p0, -0x1

    return-wide p0

    .line 1
    :cond_1
    div-long/2addr p0, p2

    return-wide p0
.end method

.method private rh()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput v0, p0, Lcom/kwad/components/core/p/c;->SQ:I

    .line 2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/components/core/p/c;->SS:J

    return-void
.end method

.method private ri()V
    .locals 7

    .line 1
    iget v0, p0, Lcom/kwad/components/core/p/c;->SQ:I

    iget v1, p0, Lcom/kwad/components/core/p/c;->SR:I

    if-ge v0, v1, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 3
    iget-wide v2, p0, Lcom/kwad/components/core/p/c;->SS:J

    sub-long v2, v0, v2

    .line 4
    iget v4, p0, Lcom/kwad/components/core/p/c;->SQ:I

    int-to-float v4, v4

    iget v5, p0, Lcom/kwad/components/core/p/c;->SW:F

    div-float/2addr v4, v5

    .line 5
    iget-wide v5, p0, Lcom/kwad/components/core/p/c;->SV:J

    sub-long/2addr v0, v5

    .line 6
    iget v5, p0, Lcom/kwad/components/core/p/c;->SU:I

    int-to-long v5, v5

    invoke-static {v5, v6, v0, v1}, Lcom/kwad/components/core/p/c;->g(JJ)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/components/core/p/c;->SX:J

    long-to-float v0, v2

    cmpl-float v1, v4, v0

    if-lez v1, :cond_1

    sub-float/2addr v4, v0

    float-to-long v0, v4

    .line 7
    invoke-static {v0, v1}, Lcom/kwad/components/core/p/c;->H(J)V

    .line 8
    :cond_1
    invoke-direct {p0}, Lcom/kwad/components/core/p/c;->rh()V

    return-void
.end method


# virtual methods
.method public final available()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/p/c;->ST:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v0

    return v0
.end method

.method public final close()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/p/c;->ST:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 2
    invoke-static {p0}, Lcom/kwad/components/core/p/b;->a(Lcom/kwad/components/core/p/c;)V

    const-wide/16 v0, -0x1

    .line 3
    iput-wide v0, p0, Lcom/kwad/components/core/p/c;->SV:J

    return-void
.end method

.method public final declared-synchronized mark(I)V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/kwad/components/core/p/c;->ST:Ljava/io/InputStream;

    invoke-virtual {v0, p1}, Ljava/io/InputStream;->mark(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final markSupported()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/p/c;->ST:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->markSupported()Z

    move-result v0

    return v0
.end method

.method public final read()I
    .locals 5

    .line 1
    iget-wide v0, p0, Lcom/kwad/components/core/p/c;->SV:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    .line 2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/components/core/p/c;->SV:J

    .line 3
    :cond_0
    iget v0, p0, Lcom/kwad/components/core/p/c;->SU:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/kwad/components/core/p/c;->SU:I

    .line 4
    sget-boolean v0, Lcom/kwad/components/core/p/b;->SO:Z

    if-eqz v0, :cond_1

    sget-boolean v0, Lcom/kwad/components/core/p/b;->SN:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    .line 5
    iget-object v0, p0, Lcom/kwad/components/core/p/c;->ST:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    return v0

    .line 6
    :cond_2
    iget v0, p0, Lcom/kwad/components/core/p/c;->SQ:I

    if-gez v0, :cond_3

    .line 7
    invoke-direct {p0}, Lcom/kwad/components/core/p/c;->rh()V

    .line 8
    :cond_3
    iget-object v0, p0, Lcom/kwad/components/core/p/c;->ST:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    .line 9
    iget v2, p0, Lcom/kwad/components/core/p/c;->SQ:I

    add-int/2addr v2, v1

    iput v2, p0, Lcom/kwad/components/core/p/c;->SQ:I

    .line 10
    invoke-direct {p0}, Lcom/kwad/components/core/p/c;->ri()V

    return v0
.end method

.method public final declared-synchronized reset()V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/kwad/components/core/p/c;->ST:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->reset()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final rg()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/kwad/components/core/p/c;->SX:J

    return-wide v0
.end method

.method public final skip(J)J
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/p/c;->ST:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2}, Ljava/io/InputStream;->skip(J)J

    move-result-wide p1

    return-wide p1
.end method
