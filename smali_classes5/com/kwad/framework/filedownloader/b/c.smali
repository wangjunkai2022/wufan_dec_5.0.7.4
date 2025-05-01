.class public final Lcom/kwad/framework/filedownloader/b/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/framework/filedownloader/b/a;


# instance fields
.field private final agg:Lcom/kwad/framework/filedownloader/b/b;

.field private final agh:Lcom/kwad/framework/filedownloader/b/d;

.field private final agi:J

.field private volatile agj:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private agk:Ljava/util/concurrent/atomic/AtomicInteger;

.field private volatile agl:Ljava/lang/Thread;

.field private handler:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/kwad/framework/filedownloader/b/c;->agj:Ljava/util/List;

    .line 3
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Lcom/kwad/framework/filedownloader/b/c;->agk:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 4
    new-instance v0, Lcom/kwad/framework/filedownloader/b/b;

    invoke-direct {v0}, Lcom/kwad/framework/filedownloader/b/b;-><init>()V

    iput-object v0, p0, Lcom/kwad/framework/filedownloader/b/c;->agg:Lcom/kwad/framework/filedownloader/b/b;

    .line 5
    new-instance v0, Lcom/kwad/framework/filedownloader/b/d;

    invoke-direct {v0}, Lcom/kwad/framework/filedownloader/b/d;-><init>()V

    iput-object v0, p0, Lcom/kwad/framework/filedownloader/b/c;->agh:Lcom/kwad/framework/filedownloader/b/d;

    .line 6
    invoke-static {}, Lcom/kwad/framework/filedownloader/f/e;->xr()Lcom/kwad/framework/filedownloader/f/e;

    move-result-object v0

    iget-wide v0, v0, Lcom/kwad/framework/filedownloader/f/e;->ajd:J

    iput-wide v0, p0, Lcom/kwad/framework/filedownloader/b/c;->agi:J

    .line 7
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "RemitHandoverToDB"

    .line 8
    invoke-static {v1}, Lcom/kwad/framework/filedownloader/f/f;->bA(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 9
    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 10
    new-instance v1, Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    new-instance v2, Lcom/kwad/framework/filedownloader/b/c$1;

    invoke-direct {v2, p0}, Lcom/kwad/framework/filedownloader/b/c$1;-><init>(Lcom/kwad/framework/filedownloader/b/c;)V

    invoke-direct {v1, v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v1, p0, Lcom/kwad/framework/filedownloader/b/c;->handler:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/kwad/framework/filedownloader/b/c;)Ljava/lang/Thread;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/framework/filedownloader/b/c;->agl:Ljava/lang/Thread;

    return-object p0
.end method

.method static synthetic a(Lcom/kwad/framework/filedownloader/b/c;Ljava/lang/Thread;)Ljava/lang/Thread;
    .locals 0

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lcom/kwad/framework/filedownloader/b/c;->agl:Ljava/lang/Thread;

    return-object p1
.end method

.method static synthetic a(Lcom/kwad/framework/filedownloader/b/c;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/kwad/framework/filedownloader/b/c;->bp(I)V

    return-void
.end method

.method static synthetic b(Lcom/kwad/framework/filedownloader/b/c;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/framework/filedownloader/b/c;->agk:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object p0
.end method

.method private bp(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/b/c;->agh:Lcom/kwad/framework/filedownloader/b/d;

    iget-object v1, p0, Lcom/kwad/framework/filedownloader/b/c;->agg:Lcom/kwad/framework/filedownloader/b/b;

    invoke-virtual {v1, p1}, Lcom/kwad/framework/filedownloader/b/b;->bk(I)Lcom/kwad/framework/filedownloader/d/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/framework/filedownloader/b/d;->b(Lcom/kwad/framework/filedownloader/d/c;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/b/c;->agg:Lcom/kwad/framework/filedownloader/b/b;

    invoke-virtual {v0, p1}, Lcom/kwad/framework/filedownloader/b/b;->bl(I)Ljava/util/List;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/kwad/framework/filedownloader/b/c;->agh:Lcom/kwad/framework/filedownloader/b/d;

    invoke-virtual {v1, p1}, Lcom/kwad/framework/filedownloader/b/d;->bm(I)V

    .line 4
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/framework/filedownloader/d/a;

    .line 5
    iget-object v1, p0, Lcom/kwad/framework/filedownloader/b/c;->agh:Lcom/kwad/framework/filedownloader/b/d;

    invoke-virtual {v1, v0}, Lcom/kwad/framework/filedownloader/b/d;->a(Lcom/kwad/framework/filedownloader/d/a;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private bq(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/b/c;->agj:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private br(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/b/c;->handler:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeMessages(I)V

    .line 2
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/b/c;->agk:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-ne v0, p1, :cond_0

    .line 3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/framework/filedownloader/b/c;->agl:Ljava/lang/Thread;

    .line 4
    iget-object p1, p0, Lcom/kwad/framework/filedownloader/b/c;->handler:Landroid/os/Handler;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 5
    invoke-static {}, Ljava/util/concurrent/locks/LockSupport;->park()V

    return-void

    .line 6
    :cond_0
    invoke-direct {p0, p1}, Lcom/kwad/framework/filedownloader/b/c;->bp(I)V

    return-void
.end method

.method static synthetic c(Lcom/kwad/framework/filedownloader/b/c;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/framework/filedownloader/b/c;->agj:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public final a(IIJ)V
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/b/c;->agg:Lcom/kwad/framework/filedownloader/b/b;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/kwad/framework/filedownloader/b/b;->a(IIJ)V

    .line 9
    invoke-direct {p0, p1}, Lcom/kwad/framework/filedownloader/b/c;->bq(I)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/b/c;->agh:Lcom/kwad/framework/filedownloader/b/d;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/kwad/framework/filedownloader/b/d;->a(IIJ)V

    return-void
.end method

.method public final a(IJLjava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 14
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/b/c;->agg:Lcom/kwad/framework/filedownloader/b/b;

    move v1, p1

    move-wide v2, p2

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/kwad/framework/filedownloader/b/b;->a(IJLjava/lang/String;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0, p1}, Lcom/kwad/framework/filedownloader/b/c;->bq(I)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 16
    :cond_0
    iget-object v1, p0, Lcom/kwad/framework/filedownloader/b/c;->agh:Lcom/kwad/framework/filedownloader/b/d;

    move v2, p1

    move-wide v3, p2

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, Lcom/kwad/framework/filedownloader/b/d;->a(IJLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final a(ILjava/lang/String;JJI)V
    .locals 10

    move-object v0, p0

    .line 11
    iget-object v1, v0, Lcom/kwad/framework/filedownloader/b/c;->agg:Lcom/kwad/framework/filedownloader/b/b;

    move v2, p1

    move-object v3, p2

    move-wide v4, p3

    move-wide v6, p5

    move/from16 v8, p7

    invoke-virtual/range {v1 .. v8}, Lcom/kwad/framework/filedownloader/b/b;->a(ILjava/lang/String;JJI)V

    .line 12
    invoke-direct {p0, p1}, Lcom/kwad/framework/filedownloader/b/c;->bq(I)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 13
    :cond_0
    iget-object v2, v0, Lcom/kwad/framework/filedownloader/b/c;->agh:Lcom/kwad/framework/filedownloader/b/d;

    move v3, p1

    move-object v4, p2

    move-wide v5, p3

    move-wide v7, p5

    move/from16 v9, p7

    invoke-virtual/range {v2 .. v9}, Lcom/kwad/framework/filedownloader/b/d;->a(ILjava/lang/String;JJI)V

    return-void
.end method

.method public final a(ILjava/lang/Throwable;)V
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/b/c;->agg:Lcom/kwad/framework/filedownloader/b/b;

    invoke-virtual {v0, p1, p2}, Lcom/kwad/framework/filedownloader/b/b;->a(ILjava/lang/Throwable;)V

    .line 18
    invoke-direct {p0, p1}, Lcom/kwad/framework/filedownloader/b/c;->bq(I)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 19
    :cond_0
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/b/c;->agh:Lcom/kwad/framework/filedownloader/b/d;

    invoke-virtual {v0, p1, p2}, Lcom/kwad/framework/filedownloader/b/d;->a(ILjava/lang/Throwable;)V

    return-void
.end method

.method public final a(ILjava/lang/Throwable;J)V
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/b/c;->agg:Lcom/kwad/framework/filedownloader/b/b;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/kwad/framework/filedownloader/b/b;->a(ILjava/lang/Throwable;J)V

    .line 21
    invoke-direct {p0, p1}, Lcom/kwad/framework/filedownloader/b/c;->bq(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 22
    invoke-direct {p0, p1}, Lcom/kwad/framework/filedownloader/b/c;->br(I)V

    .line 23
    :cond_0
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/b/c;->agh:Lcom/kwad/framework/filedownloader/b/d;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/kwad/framework/filedownloader/b/d;->a(ILjava/lang/Throwable;J)V

    .line 24
    iget-object p2, p0, Lcom/kwad/framework/filedownloader/b/c;->agj:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final a(Lcom/kwad/framework/filedownloader/d/a;)V
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/b/c;->agg:Lcom/kwad/framework/filedownloader/b/b;

    invoke-virtual {v0, p1}, Lcom/kwad/framework/filedownloader/b/b;->a(Lcom/kwad/framework/filedownloader/d/a;)V

    .line 5
    invoke-virtual {p1}, Lcom/kwad/framework/filedownloader/d/a;->getId()I

    move-result v0

    .line 6
    invoke-direct {p0, v0}, Lcom/kwad/framework/filedownloader/b/c;->bq(I)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/b/c;->agh:Lcom/kwad/framework/filedownloader/b/d;

    invoke-virtual {v0, p1}, Lcom/kwad/framework/filedownloader/b/d;->a(Lcom/kwad/framework/filedownloader/d/a;)V

    return-void
.end method

.method public final b(IJ)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/b/c;->agg:Lcom/kwad/framework/filedownloader/b/b;

    invoke-virtual {v0, p1, p2, p3}, Lcom/kwad/framework/filedownloader/b/b;->b(IJ)V

    .line 3
    invoke-direct {p0, p1}, Lcom/kwad/framework/filedownloader/b/c;->bq(I)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/b/c;->agh:Lcom/kwad/framework/filedownloader/b/d;

    invoke-virtual {v0, p1, p2, p3}, Lcom/kwad/framework/filedownloader/b/d;->b(IJ)V

    return-void
.end method

.method public final b(Lcom/kwad/framework/filedownloader/d/c;)V
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/b/c;->agg:Lcom/kwad/framework/filedownloader/b/b;

    invoke-virtual {v0, p1}, Lcom/kwad/framework/filedownloader/b/b;->b(Lcom/kwad/framework/filedownloader/d/c;)V

    .line 6
    invoke-virtual {p1}, Lcom/kwad/framework/filedownloader/d/c;->getId()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/kwad/framework/filedownloader/b/c;->bq(I)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/b/c;->agh:Lcom/kwad/framework/filedownloader/b/d;

    invoke-virtual {v0, p1}, Lcom/kwad/framework/filedownloader/b/d;->b(Lcom/kwad/framework/filedownloader/d/c;)V

    return-void
.end method

.method public final bj(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/b/c;->handler:Landroid/os/Handler;

    iget-wide v1, p0, Lcom/kwad/framework/filedownloader/b/c;->agi:J

    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void
.end method

.method public final bk(I)Lcom/kwad/framework/filedownloader/d/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/b/c;->agg:Lcom/kwad/framework/filedownloader/b/b;

    invoke-virtual {v0, p1}, Lcom/kwad/framework/filedownloader/b/b;->bk(I)Lcom/kwad/framework/filedownloader/d/c;

    move-result-object p1

    return-object p1
.end method

.method public final bl(I)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lcom/kwad/framework/filedownloader/d/a;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/b/c;->agg:Lcom/kwad/framework/filedownloader/b/b;

    invoke-virtual {v0, p1}, Lcom/kwad/framework/filedownloader/b/b;->bl(I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final bm(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/b/c;->agg:Lcom/kwad/framework/filedownloader/b/b;

    invoke-virtual {v0, p1}, Lcom/kwad/framework/filedownloader/b/b;->bm(I)V

    .line 2
    invoke-direct {p0, p1}, Lcom/kwad/framework/filedownloader/b/c;->bq(I)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/b/c;->agh:Lcom/kwad/framework/filedownloader/b/d;

    invoke-virtual {v0, p1}, Lcom/kwad/framework/filedownloader/b/d;->bm(I)V

    return-void
.end method

.method public final bn(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/b/c;->agh:Lcom/kwad/framework/filedownloader/b/d;

    invoke-virtual {v0, p1}, Lcom/kwad/framework/filedownloader/b/d;->bn(I)Z

    .line 2
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/b/c;->agg:Lcom/kwad/framework/filedownloader/b/b;

    invoke-virtual {v0, p1}, Lcom/kwad/framework/filedownloader/b/b;->bn(I)Z

    move-result p1

    return p1
.end method

.method public final bo(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/b/c;->agg:Lcom/kwad/framework/filedownloader/b/b;

    invoke-virtual {v0, p1}, Lcom/kwad/framework/filedownloader/b/b;->bo(I)V

    .line 2
    invoke-direct {p0, p1}, Lcom/kwad/framework/filedownloader/b/c;->bq(I)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/b/c;->agh:Lcom/kwad/framework/filedownloader/b/d;

    invoke-virtual {v0, p1}, Lcom/kwad/framework/filedownloader/b/d;->bo(I)V

    return-void
.end method

.method public final c(IJ)V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/b/c;->agg:Lcom/kwad/framework/filedownloader/b/b;

    invoke-virtual {v0, p1, p2, p3}, Lcom/kwad/framework/filedownloader/b/b;->c(IJ)V

    .line 3
    invoke-direct {p0, p1}, Lcom/kwad/framework/filedownloader/b/c;->bq(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/b/c;->handler:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeMessages(I)V

    .line 5
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/b/c;->agk:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-ne v0, p1, :cond_1

    .line 6
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/framework/filedownloader/b/c;->agl:Ljava/lang/Thread;

    .line 7
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/b/c;->handler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 8
    invoke-static {}, Ljava/util/concurrent/locks/LockSupport;->park()V

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/b/c;->agh:Lcom/kwad/framework/filedownloader/b/d;

    invoke-virtual {v0, p1, p2, p3}, Lcom/kwad/framework/filedownloader/b/d;->c(IJ)V

    .line 10
    :cond_1
    iget-object p2, p0, Lcom/kwad/framework/filedownloader/b/c;->agj:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final clear()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/b/c;->agg:Lcom/kwad/framework/filedownloader/b/b;

    invoke-virtual {v0}, Lcom/kwad/framework/filedownloader/b/b;->clear()V

    .line 2
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/b/c;->agh:Lcom/kwad/framework/filedownloader/b/d;

    invoke-virtual {v0}, Lcom/kwad/framework/filedownloader/b/d;->clear()V

    return-void
.end method

.method public final d(IJ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/b/c;->agg:Lcom/kwad/framework/filedownloader/b/b;

    invoke-virtual {v0, p1, p2, p3}, Lcom/kwad/framework/filedownloader/b/b;->d(IJ)V

    .line 2
    invoke-direct {p0, p1}, Lcom/kwad/framework/filedownloader/b/c;->bq(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-direct {p0, p1}, Lcom/kwad/framework/filedownloader/b/c;->br(I)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/b/c;->agh:Lcom/kwad/framework/filedownloader/b/d;

    invoke-virtual {v0, p1, p2, p3}, Lcom/kwad/framework/filedownloader/b/d;->d(IJ)V

    .line 5
    iget-object p2, p0, Lcom/kwad/framework/filedownloader/b/c;->agj:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final s(II)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/b/c;->agg:Lcom/kwad/framework/filedownloader/b/b;

    invoke-virtual {v0, p1, p2}, Lcom/kwad/framework/filedownloader/b/b;->s(II)V

    .line 2
    invoke-direct {p0, p1}, Lcom/kwad/framework/filedownloader/b/c;->bq(I)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/b/c;->agh:Lcom/kwad/framework/filedownloader/b/d;

    invoke-virtual {v0, p1, p2}, Lcom/kwad/framework/filedownloader/b/d;->s(II)V

    return-void
.end method

.method public final vJ()Lcom/kwad/framework/filedownloader/b/a$a;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/b/c;->agh:Lcom/kwad/framework/filedownloader/b/d;

    iget-object v1, p0, Lcom/kwad/framework/filedownloader/b/c;->agg:Lcom/kwad/framework/filedownloader/b/b;

    iget-object v2, v1, Lcom/kwad/framework/filedownloader/b/b;->agd:Landroid/util/SparseArray;

    iget-object v1, v1, Lcom/kwad/framework/filedownloader/b/b;->age:Landroid/util/SparseArray;

    invoke-virtual {v0, v2, v1}, Lcom/kwad/framework/filedownloader/b/d;->a(Landroid/util/SparseArray;Landroid/util/SparseArray;)Lcom/kwad/framework/filedownloader/b/a$a;

    move-result-object v0

    return-object v0
.end method
