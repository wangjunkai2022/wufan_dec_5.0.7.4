.class public abstract Lcom/kwad/sdk/core/report/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/kwad/sdk/core/report/e;",
        "R::",
        "Lcom/kwad/sdk/core/network/f;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static ayA:Ljava/util/concurrent/ExecutorService;

.field private static volatile fS:Landroid/os/Handler;


# instance fields
.field private volatile TN:J

.field private ayB:Ljava/util/concurrent/atomic/AtomicInteger;

.field private ayC:I

.field private ayD:Lcom/kwad/sdk/core/report/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field protected ayz:Lcom/kwad/sdk/core/report/l;

.field private mContext:Landroid/content/Context;

.field private mRetryCount:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method protected constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/32 v0, 0x1d4c0

    .line 2
    iput-wide v0, p0, Lcom/kwad/sdk/core/report/b;->TN:J

    .line 3
    new-instance v0, Lcom/kwad/sdk/core/report/m;

    invoke-direct {v0}, Lcom/kwad/sdk/core/report/m;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/core/report/b;->ayz:Lcom/kwad/sdk/core/report/l;

    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/kwad/sdk/core/report/b;->ayB:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 5
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/kwad/sdk/core/report/b;->mRetryCount:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v0, 0x5

    .line 6
    iput v0, p0, Lcom/kwad/sdk/core/report/b;->ayC:I

    .line 7
    sget-object v0, Lcom/kwad/sdk/core/report/b;->ayA:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_0

    .line 8
    invoke-static {}, Lcom/kwad/sdk/core/threads/GlobalThreadPools;->Gp()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/kwad/sdk/core/report/b;->ayA:Ljava/util/concurrent/ExecutorService;

    :cond_0
    return-void
.end method

.method private Fm()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/report/b;->mRetryCount:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    .line 2
    iget v1, p0, Lcom/kwad/sdk/core/report/b;->ayC:I

    if-gt v0, v1, :cond_1

    if-lez v0, :cond_0

    .line 3
    iget-wide v0, p0, Lcom/kwad/sdk/core/report/b;->TN:J

    const-wide/16 v2, 0x2

    mul-long v0, v0, v2

    iput-wide v0, p0, Lcom/kwad/sdk/core/report/b;->TN:J

    .line 4
    :cond_0
    iget-wide v0, p0, Lcom/kwad/sdk/core/report/b;->TN:J

    invoke-direct {p0, v0, v1}, Lcom/kwad/sdk/core/report/b;->ax(J)V

    :cond_1
    return-void
.end method

.method static synthetic Fn()Landroid/os/Handler;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/core/report/b;->fS:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic Fo()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/core/report/b;->ayA:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method static synthetic a(Lcom/kwad/sdk/core/report/b;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/kwad/sdk/core/report/b;->TN:J

    return-wide v0
.end method

.method static synthetic a(Lcom/kwad/sdk/core/report/b;Lcom/kwad/sdk/core/report/e;)Lcom/kwad/sdk/core/report/e;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/kwad/sdk/core/report/b;->ayD:Lcom/kwad/sdk/core/report/e;

    return-object p1
.end method

.method static synthetic a(Lcom/kwad/sdk/core/report/b;J)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Lcom/kwad/sdk/core/report/b;->ax(J)V

    return-void
.end method

.method private declared-synchronized ax(J)V
    .locals 5

    monitor-enter p0

    .line 1
    :try_start_0
    sget-object v0, Lcom/kwad/sdk/core/report/b;->fS:Landroid/os/Handler;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 2
    monitor-exit p0

    return-void

    .line 3
    :cond_0
    :try_start_1
    sget-object v0, Lcom/kwad/sdk/core/report/b;->fS:Landroid/os/Handler;

    const v1, 0x1010111

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 4
    sget-object v0, Lcom/kwad/sdk/core/report/b;->fS:Landroid/os/Handler;

    iget-object v2, p0, Lcom/kwad/sdk/core/report/b;->mContext:Landroid/content/Context;

    iget-object v3, p0, Lcom/kwad/sdk/core/report/b;->ayz:Lcom/kwad/sdk/core/report/l;

    iget-object v4, p0, Lcom/kwad/sdk/core/report/b;->ayB:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p0, v2, v3, v4}, Lcom/kwad/sdk/core/report/b;->a(Landroid/content/Context;Lcom/kwad/sdk/core/report/l;Ljava/util/concurrent/atomic/AtomicInteger;)Ljava/lang/Runnable;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;Ljava/lang/Runnable;)Landroid/os/Message;

    move-result-object v0

    .line 5
    iput v1, v0, Landroid/os/Message;->what:I

    .line 6
    sget-object v1, Lcom/kwad/sdk/core/report/b;->fS:Landroid/os/Handler;

    invoke-virtual {v1, v0, p1, p2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 7
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method static synthetic b(Lcom/kwad/sdk/core/report/b;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/core/report/b;->ayB:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object p0
.end method

.method static synthetic c(Lcom/kwad/sdk/core/report/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/report/b;->Fm()V

    return-void
.end method

.method private c(Lcom/kwad/sdk/core/report/k;)V
    .locals 1
    .param p1    # Lcom/kwad/sdk/core/report/k;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kwad/sdk/core/report/k<",
            "TT;>;)V"
        }
    .end annotation

    .line 2
    new-instance v0, Lcom/kwad/sdk/core/report/b$4;

    invoke-direct {v0, p0, p1}, Lcom/kwad/sdk/core/report/b$4;-><init>(Lcom/kwad/sdk/core/report/b;Lcom/kwad/sdk/core/report/k;)V

    .line 3
    new-instance p1, Lcom/kwad/sdk/core/report/b$5;

    invoke-direct {p1, p0}, Lcom/kwad/sdk/core/report/b$5;-><init>(Lcom/kwad/sdk/core/report/b;)V

    invoke-virtual {v0, p1}, Lcom/kwad/sdk/core/network/l;->request(Lcom/kwad/sdk/core/network/g;)V

    return-void
.end method

.method static synthetic d(Lcom/kwad/sdk/core/report/b;)Lcom/kwad/sdk/core/report/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/core/report/b;->ayD:Lcom/kwad/sdk/core/report/e;

    return-object p0
.end method


# virtual methods
.method protected final Fk()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/report/b;->mRetryCount:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    const/16 v1, 0x10

    if-le v0, v1, :cond_0

    const/16 v0, 0x10

    .line 2
    :cond_0
    const-class v1, Lcom/kwad/sdk/core/report/s;

    invoke-static {v1}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/sdk/core/report/s;

    if-eqz v1, :cond_1

    .line 3
    invoke-interface {v1}, Lcom/kwad/sdk/core/report/s;->yS()I

    move-result v1

    shl-int v0, v1, v0

    int-to-long v0, v0

    goto :goto_0

    :cond_1
    const-wide/16 v0, 0x14

    .line 4
    :goto_0
    iget-object v2, p0, Lcom/kwad/sdk/core/report/b;->ayz:Lcom/kwad/sdk/core/report/l;

    invoke-interface {v2}, Lcom/kwad/sdk/core/report/l;->size()J

    move-result-wide v2

    cmp-long v4, v2, v0

    if-ltz v4, :cond_2

    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public final Fl()V
    .locals 2

    const-wide/16 v0, 0x0

    .line 1
    invoke-direct {p0, v0, v1}, Lcom/kwad/sdk/core/report/b;->ax(J)V

    return-void
.end method

.method protected a(Lcom/kwad/sdk/core/report/e;)Lcom/kwad/sdk/core/network/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)TR;"
        }
    .end annotation

    .line 11
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 13
    invoke-virtual {p0, v0}, Lcom/kwad/sdk/core/report/b;->w(Ljava/util/List;)Lcom/kwad/sdk/core/network/f;

    move-result-object p1

    return-object p1
.end method

.method protected a(Landroid/content/Context;Lcom/kwad/sdk/core/report/l;Ljava/util/concurrent/atomic/AtomicInteger;)Ljava/lang/Runnable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/kwad/sdk/core/report/l<",
            "TT;>;",
            "Ljava/util/concurrent/atomic/AtomicInteger;",
            ")",
            "Ljava/lang/Runnable;"
        }
    .end annotation

    .line 6
    new-instance v0, Lcom/kwad/sdk/core/report/u;

    invoke-direct {v0, p1, p2, p0, p3}, Lcom/kwad/sdk/core/report/u;-><init>(Landroid/content/Context;Lcom/kwad/sdk/core/report/l;Lcom/kwad/sdk/core/report/b;Ljava/util/concurrent/atomic/AtomicInteger;)V

    return-object v0
.end method

.method public final a(Lcom/kwad/sdk/core/report/k;)V
    .locals 2
    .param p1    # Lcom/kwad/sdk/core/report/k;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kwad/sdk/core/report/k<",
            "TT;>;)V"
        }
    .end annotation

    .line 5
    sget-object v0, Lcom/kwad/sdk/core/report/b;->ayA:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/kwad/sdk/core/report/b$1;

    invoke-direct {v1, p0, p1}, Lcom/kwad/sdk/core/report/b$1;-><init>(Lcom/kwad/sdk/core/report/b;Lcom/kwad/sdk/core/report/k;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method protected final a(Lcom/kwad/sdk/core/report/l;)V
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/kwad/sdk/core/report/b;->ayz:Lcom/kwad/sdk/core/report/l;

    return-void
.end method

.method public final a(Ljava/util/List;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TT;>;",
            "Ljava/util/concurrent/atomic/AtomicBoolean;",
            ")V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 7
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 8
    iget-object v0, p0, Lcom/kwad/sdk/core/report/b;->ayB:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 9
    new-instance v0, Lcom/kwad/sdk/core/report/b$2;

    invoke-direct {v0, p0, p1}, Lcom/kwad/sdk/core/report/b$2;-><init>(Lcom/kwad/sdk/core/report/b;Ljava/util/List;)V

    .line 10
    new-instance v1, Lcom/kwad/sdk/core/report/b$3;

    invoke-direct {v1, p0, p1, p2}, Lcom/kwad/sdk/core/report/b$3;-><init>(Lcom/kwad/sdk/core/report/b;Ljava/util/List;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/network/l;->request(Lcom/kwad/sdk/core/network/g;)V

    :cond_0
    return-void
.end method

.method protected final aw(J)V
    .locals 3

    const-wide/16 v0, 0x3c

    cmp-long v2, p1, v0

    if-gez v2, :cond_0

    const-wide/32 p1, 0xea60

    .line 1
    iput-wide p1, p0, Lcom/kwad/sdk/core/report/b;->TN:J

    return-void

    :cond_0
    const-wide/16 v0, 0x3e8

    mul-long p1, p1, v0

    .line 2
    iput-wide p1, p0, Lcom/kwad/sdk/core/report/b;->TN:J

    return-void
.end method

.method public final b(Lcom/kwad/sdk/core/report/k;)V
    .locals 1
    .param p1    # Lcom/kwad/sdk/core/report/k;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kwad/sdk/core/report/k<",
            "TT;>;)V"
        }
    .end annotation

    .line 2
    :try_start_0
    invoke-direct {p0, p1}, Lcom/kwad/sdk/core/report/b;->c(Lcom/kwad/sdk/core/report/k;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 3
    const-class v0, Lcom/kwad/sdk/service/a/e;

    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/e;

    invoke-interface {v0, p1}, Lcom/kwad/sdk/service/a/e;->gatherException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public declared-synchronized j(Landroid/content/Context;I)V
    .locals 0

    monitor-enter p0

    .line 1
    :try_start_0
    iput-object p1, p0, Lcom/kwad/sdk/core/report/b;->mContext:Landroid/content/Context;

    .line 2
    sget-object p1, Lcom/kwad/sdk/core/report/b;->fS:Landroid/os/Handler;

    if-nez p1, :cond_0

    .line 3
    invoke-static {}, Lcom/kwad/sdk/core/threads/a;->Gj()Landroid/os/Handler;

    move-result-object p1

    sput-object p1, Lcom/kwad/sdk/core/report/b;->fS:Landroid/os/Handler;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method protected abstract w(Ljava/util/List;)Lcom/kwad/sdk/core/network/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TT;>;)TR;"
        }
    .end annotation
.end method
