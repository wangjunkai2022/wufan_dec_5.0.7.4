.class public final Lcom/kwad/components/core/video/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/core/video/i$a;
    }
.end annotation


# instance fields
.field private volatile VE:Z

.field private VF:J

.field private VG:Lcom/kwad/components/core/video/i$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/kwad/components/core/video/i$a;

    invoke-direct {v0}, Lcom/kwad/components/core/video/i$a;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/video/i;->VG:Lcom/kwad/components/core/video/i$a;

    return-void
.end method


# virtual methods
.method public final reset()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/kwad/components/core/video/i;->VE:Z

    const-wide/16 v0, 0x0

    .line 2
    iput-wide v0, p0, Lcom/kwad/components/core/video/i;->VF:J

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/video/i;->VG:Lcom/kwad/components/core/video/i$a;

    invoke-virtual {v0}, Lcom/kwad/components/core/video/i$a;->reset()V

    return-void
.end method

.method public final sv()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/video/i;->VE:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/core/video/i;->VE:Z

    .line 3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/components/core/video/i;->VF:J

    const-string v0, "videoStartBlock"

    .line 4
    invoke-static {v0}, Lcom/kwad/sdk/core/video/a/a/a;->eF(Ljava/lang/String;)V

    return-void
.end method

.method public final sw()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/video/i;->VE:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/kwad/components/core/video/i;->VF:J

    sub-long/2addr v0, v2

    .line 3
    iget-object v2, p0, Lcom/kwad/components/core/video/i;->VG:Lcom/kwad/components/core/video/i$a;

    invoke-virtual {v2, v0, v1}, Lcom/kwad/components/core/video/i$a;->accumulate(J)V

    const/4 v2, 0x0

    .line 4
    iput-boolean v2, p0, Lcom/kwad/components/core/video/i;->VE:Z

    const-string v2, "videoEndBlock"

    .line 5
    invoke-static {v2}, Lcom/kwad/sdk/core/video/a/a/a;->eF(Ljava/lang/String;)V

    .line 6
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "videoBlockTime_"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/video/a/a/a;->eF(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final sx()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/video/i;->VE:Z

    return v0
.end method

.method public final sy()Lcom/kwad/components/core/video/i$a;
    .locals 5
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/video/i;->VE:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/video/i;->VG:Lcom/kwad/components/core/video/i$a;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    iget-wide v3, p0, Lcom/kwad/components/core/video/i;->VF:J

    sub-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Lcom/kwad/components/core/video/i$a;->accumulate(J)V

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/kwad/components/core/video/i;->VE:Z

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/video/i;->VG:Lcom/kwad/components/core/video/i$a;

    return-object v0
.end method

.method public final sz()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/kwad/components/core/video/i;->VF:J

    return-wide v0
.end method
