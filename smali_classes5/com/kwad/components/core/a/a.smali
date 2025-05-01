.class public final Lcom/kwad/components/core/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/core/a/a$a;
    }
.end annotation


# instance fields
.field private Jd:Ljava/lang/String;

.field private Je:Ljava/lang/String;

.field private Jf:J

.field private Jg:J

.field private Jh:Ljava/util/Timer;

.field private Ji:Z

.field private final period:J


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    .line 2
    iput-wide v0, p0, Lcom/kwad/components/core/a/a;->Jf:J

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/kwad/components/core/a/a;->Ji:Z

    .line 4
    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/components/core/a/a;->Jf:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/kwad/components/core/a/a;->Jf:J

    .line 6
    invoke-static {v0}, Lcom/kwad/sdk/core/e/c;->printStackTraceOnly(Ljava/lang/Throwable;)V

    .line 7
    :goto_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, Lcom/kwad/sdk/core/config/d;->Co()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/components/core/a/a;->period:J

    .line 8
    new-instance v0, Lcom/kwad/components/core/a/a$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/a/a$1;-><init>(Lcom/kwad/components/core/a/a;)V

    .line 9
    invoke-static {}, Lcom/kwad/sdk/core/c/b;->En()Lcom/kwad/sdk/core/c/b;

    invoke-static {v0}, Lcom/kwad/sdk/core/c/b;->a(Lcom/kwad/sdk/core/c/c;)V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/a/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/a/a;->mS()V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/a/a;I)V
    .locals 0

    const/4 p1, 0x2

    .line 2
    invoke-direct {p0, p1}, Lcom/kwad/components/core/a/a;->ah(I)V

    return-void
.end method

.method private ah(I)V
    .locals 8

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    .line 2
    iget-wide v2, p0, Lcom/kwad/components/core/a/a;->Jf:J

    sub-long v2, v0, v2

    .line 3
    iput-wide v0, p0, Lcom/kwad/components/core/a/a;->Jf:J

    const-wide/16 v0, 0x0

    const/4 v4, 0x1

    if-ne p1, v4, :cond_0

    .line 4
    iput-wide v0, p0, Lcom/kwad/components/core/a/a;->Jg:J

    .line 5
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/kwad/components/core/a/a;->Je:Ljava/lang/String;

    .line 6
    iget-object v4, p0, Lcom/kwad/components/core/a/a;->Jd:Ljava/lang/String;

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 7
    iget-object v4, p0, Lcom/kwad/components/core/a/a;->Je:Ljava/lang/String;

    iput-object v4, p0, Lcom/kwad/components/core/a/a;->Jd:Ljava/lang/String;

    .line 8
    :cond_0
    iget-wide v4, p0, Lcom/kwad/components/core/a/a;->Jg:J

    const-wide/16 v6, 0x1

    add-long/2addr v4, v6

    iput-wide v4, p0, Lcom/kwad/components/core/a/a;->Jg:J

    .line 9
    new-instance v4, Lcom/kwad/sdk/core/report/n;

    const-wide/16 v5, 0x27ec

    invoke-direct {v4, v5, v6}, Lcom/kwad/sdk/core/report/n;-><init>(J)V

    .line 10
    iget-wide v5, p0, Lcom/kwad/components/core/a/a;->Jg:J

    iput-wide v5, v4, Lcom/kwad/sdk/core/report/n;->avo:J

    cmp-long v5, v2, v0

    if-lez v5, :cond_1

    .line 11
    iput-wide v2, v4, Lcom/kwad/sdk/core/report/n;->aAb:J

    :cond_1
    int-to-long v0, p1

    .line 12
    iput-wide v0, v4, Lcom/kwad/sdk/core/report/n;->aAc:J

    .line 13
    iget-object p1, p0, Lcom/kwad/components/core/a/a;->Jd:Ljava/lang/String;

    iput-object p1, v4, Lcom/kwad/sdk/core/report/n;->Jd:Ljava/lang/String;

    .line 14
    iget-object p1, p0, Lcom/kwad/components/core/a/a;->Je:Ljava/lang/String;

    iput-object p1, v4, Lcom/kwad/sdk/core/report/n;->Je:Ljava/lang/String;

    .line 15
    invoke-static {v4}, Lcom/kwad/sdk/core/report/g;->a(Lcom/kwad/sdk/core/report/n;)V

    return-void
.end method

.method public static mR()Lcom/kwad/components/core/a/a;
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/components/core/a/a$a;->mT()Lcom/kwad/components/core/a/a;

    move-result-object v0

    return-object v0
.end method

.method private mS()V
    .locals 5

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/kwad/components/core/a/a;->Ji:Z

    .line 2
    iget-wide v0, p0, Lcom/kwad/components/core/a/a;->period:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/a/a;->Jh:Ljava/util/Timer;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    :cond_1
    const/4 v0, 0x3

    .line 5
    invoke-direct {p0, v0}, Lcom/kwad/components/core/a/a;->ah(I)V

    return-void
.end method


# virtual methods
.method public final eG()V
    .locals 8

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/a/a;->Ji:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/core/a/a;->Ji:Z

    .line 3
    iget-wide v1, p0, Lcom/kwad/components/core/a/a;->period:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-gtz v5, :cond_1

    return-void

    .line 4
    :cond_1
    new-instance v1, Ljava/util/Timer;

    invoke-direct {v1}, Ljava/util/Timer;-><init>()V

    iput-object v1, p0, Lcom/kwad/components/core/a/a;->Jh:Ljava/util/Timer;

    .line 5
    invoke-direct {p0, v0}, Lcom/kwad/components/core/a/a;->ah(I)V

    .line 6
    new-instance v3, Lcom/kwad/components/core/a/a$2;

    invoke-direct {v3, p0}, Lcom/kwad/components/core/a/a$2;-><init>(Lcom/kwad/components/core/a/a;)V

    .line 7
    :try_start_0
    iget-object v2, p0, Lcom/kwad/components/core/a/a;->Jh:Ljava/util/Timer;

    iget-wide v6, p0, Lcom/kwad/components/core/a/a;->period:J

    move-wide v4, v6

    invoke-virtual/range {v2 .. v7}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method
