.class public final Lcom/kwad/components/core/proxy/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private RH:Ljava/lang/String;

.field private RI:J

.field private RJ:J

.field private RK:J

.field private RL:Z

.field private RM:Lcom/kwad/components/core/proxy/a/c;


# direct methods
.method public constructor <init>(Lcom/kwad/components/core/proxy/a/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kwad/components/core/proxy/a/a;->RM:Lcom/kwad/components/core/proxy/a/c;

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/proxy/a/a;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/kwad/components/core/proxy/a/a;->RK:J

    return-wide p1
.end method


# virtual methods
.method public final F(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/kwad/components/core/proxy/a/a;->RI:J

    .line 2
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/kwad/components/core/proxy/a/a;->RJ:J

    return-void
.end method

.method public final a(Lcom/kwad/components/core/proxy/PageCreateStage;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/proxy/a/a;->RM:Lcom/kwad/components/core/proxy/a/c;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0, p1}, Lcom/kwad/components/core/proxy/a/c;->onCreateStageChange(Lcom/kwad/components/core/proxy/PageCreateStage;)V

    :cond_0
    return-void
.end method

.method public final aw(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/proxy/a/a;->RH:Ljava/lang/String;

    return-void
.end method

.method public final qH()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/proxy/a/a;->RL:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/core/proxy/a/a;->RL:Z

    .line 3
    new-instance v0, Lcom/kwad/components/core/proxy/a/a$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/proxy/a/a$1;-><init>(Lcom/kwad/components/core/proxy/a/a;)V

    invoke-static {v0}, Lcom/kwad/sdk/utils/bo;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final report()V
    .locals 9

    .line 1
    new-instance v0, Lcom/kwad/components/core/proxy/a/b;

    invoke-direct {v0}, Lcom/kwad/components/core/proxy/a/b;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/kwad/components/core/proxy/a/a;->RH:Ljava/lang/String;

    iput-object v1, v0, Lcom/kwad/components/core/proxy/a/b;->RH:Ljava/lang/String;

    .line 3
    iget-wide v1, p0, Lcom/kwad/components/core/proxy/a/a;->RI:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    iget-wide v5, p0, Lcom/kwad/components/core/proxy/a/a;->RJ:J

    sub-long/2addr v5, v1

    goto :goto_0

    :cond_0
    move-wide v5, v3

    :goto_0
    iput-wide v5, v0, Lcom/kwad/components/core/proxy/a/b;->RP:J

    .line 4
    iget-wide v5, p0, Lcom/kwad/components/core/proxy/a/a;->RJ:J

    cmp-long v7, v5, v3

    if-eqz v7, :cond_1

    iget-wide v7, p0, Lcom/kwad/components/core/proxy/a/a;->RK:J

    sub-long/2addr v7, v5

    goto :goto_1

    :cond_1
    move-wide v7, v3

    :goto_1
    iput-wide v7, v0, Lcom/kwad/components/core/proxy/a/b;->RQ:J

    cmp-long v5, v1, v3

    if-eqz v5, :cond_2

    .line 5
    iget-wide v3, p0, Lcom/kwad/components/core/proxy/a/a;->RK:J

    sub-long/2addr v3, v1

    :cond_2
    iput-wide v3, v0, Lcom/kwad/components/core/proxy/a/b;->RO:J

    .line 6
    invoke-static {}, Lcom/kwad/components/core/o/a;->qI()Lcom/kwad/components/core/o/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/kwad/components/core/o/a;->a(Lcom/kwad/components/core/proxy/a/b;)V

    .line 7
    invoke-virtual {v0}, Lcom/kwad/components/core/proxy/a/b;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "PageMonitor"

    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
