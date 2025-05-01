.class public final Lcom/ss/android/socialbase/downloader/u/wv;
.super Ljava/lang/Object;


# instance fields
.field private final i:Ljava/util/concurrent/atomic/AtomicLong;

.field m:I

.field private n:I

.field private volatile o:J

.field private final p:J

.field private qv:Lorg/json/JSONObject;

.field private u:J

.field volatile vv:Lcom/ss/android/socialbase/downloader/u/r;


# direct methods
.method public constructor <init>(JJ)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/u/wv;->i:Ljava/util/concurrent/atomic/AtomicLong;

    const/4 v1, 0x0

    .line 3
    iput v1, p0, Lcom/ss/android/socialbase/downloader/u/wv;->m:I

    .line 4
    iput-wide p1, p0, Lcom/ss/android/socialbase/downloader/u/wv;->p:J

    .line 5
    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 6
    iput-wide p1, p0, Lcom/ss/android/socialbase/downloader/u/wv;->o:J

    cmp-long v0, p3, p1

    if-ltz v0, :cond_0

    .line 7
    iput-wide p3, p0, Lcom/ss/android/socialbase/downloader/u/wv;->u:J

    return-void

    :cond_0
    const-wide/16 p1, -0x1

    .line 8
    iput-wide p1, p0, Lcom/ss/android/socialbase/downloader/u/wv;->u:J

    return-void
.end method

.method public constructor <init>(Lcom/ss/android/socialbase/downloader/u/wv;)V
    .locals 3

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/u/wv;->i:Ljava/util/concurrent/atomic/AtomicLong;

    const/4 v1, 0x0

    .line 11
    iput v1, p0, Lcom/ss/android/socialbase/downloader/u/wv;->m:I

    .line 12
    iget-wide v1, p1, Lcom/ss/android/socialbase/downloader/u/wv;->p:J

    iput-wide v1, p0, Lcom/ss/android/socialbase/downloader/u/wv;->p:J

    .line 13
    iget-wide v1, p1, Lcom/ss/android/socialbase/downloader/u/wv;->u:J

    iput-wide v1, p0, Lcom/ss/android/socialbase/downloader/u/wv;->u:J

    .line 14
    iget-object v1, p1, Lcom/ss/android/socialbase/downloader/u/wv;->i:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 15
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/u/wv;->o:J

    .line 16
    iget p1, p1, Lcom/ss/android/socialbase/downloader/u/wv;->n:I

    iput p1, p0, Lcom/ss/android/socialbase/downloader/u/wv;->n:I

    return-void
.end method

.method public constructor <init>(Lorg/json/JSONObject;)V
    .locals 2

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/u/wv;->i:Ljava/util/concurrent/atomic/AtomicLong;

    const/4 v0, 0x0

    .line 19
    iput v0, p0, Lcom/ss/android/socialbase/downloader/u/wv;->m:I

    const-string v0, "st"

    .line 20
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/u/wv;->p:J

    const-string v0, "en"

    .line 21
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/ss/android/socialbase/downloader/u/wv;->p(J)V

    const-string v0, "cu"

    .line 22
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/ss/android/socialbase/downloader/u/wv;->vv(J)V

    .line 23
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/u/wv;->i()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/ss/android/socialbase/downloader/u/wv;->i(J)V

    return-void
.end method

.method public static vv(Ljava/util/List;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/u/wv;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    if-eqz p0, :cond_2

    .line 6
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 7
    :cond_0
    new-instance v0, Lcom/ss/android/socialbase/downloader/u/wv$1;

    invoke-direct {v0}, Lcom/ss/android/socialbase/downloader/u/wv$1;-><init>()V

    invoke-static {p0, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ss/android/socialbase/downloader/u/wv;

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\r\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 11
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_1
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public b()Lorg/json/JSONObject;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/u/wv;->qv:Lorg/json/JSONObject;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 3
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/u/wv;->qv:Lorg/json/JSONObject;

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/u/wv;->p()J

    move-result-wide v1

    const-string v3, "st"

    invoke-virtual {v0, v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 5
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/u/wv;->i()J

    move-result-wide v1

    const-string v3, "cu"

    invoke-virtual {v0, v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 6
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/u/wv;->u()J

    move-result-wide v1

    const-string v3, "en"

    invoke-virtual {v0, v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    return-object v0
.end method

.method public i()J
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/u/wv;->i:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    .line 2
    iget-wide v2, p0, Lcom/ss/android/socialbase/downloader/u/wv;->u:J

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-lez v6, :cond_0

    const-wide/16 v4, 0x1

    add-long/2addr v2, v4

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    return-wide v2

    :cond_0
    return-wide v0
.end method

.method public i(J)V
    .locals 3

    .line 3
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/u/wv;->i:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    .line 4
    iput-wide p1, p0, Lcom/ss/android/socialbase/downloader/u/wv;->o:J

    :cond_0
    return-void
.end method

.method k()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/ss/android/socialbase/downloader/u/wv;->m:I

    return v0
.end method

.method public m()J
    .locals 5

    .line 1
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/u/wv;->u:J

    iget-wide v2, p0, Lcom/ss/android/socialbase/downloader/u/wv;->p:J

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/u/wv;->o()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    return-wide v0

    :cond_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method m(I)V
    .locals 0

    .line 4
    iput p1, p0, Lcom/ss/android/socialbase/downloader/u/wv;->m:I

    return-void
.end method

.method m(J)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/u/wv;->i:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    return-void
.end method

.method public n()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/ss/android/socialbase/downloader/u/wv;->n:I

    return v0
.end method

.method public o()J
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/u/wv;->vv:Lcom/ss/android/socialbase/downloader/u/r;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/u/r;->i()J

    move-result-wide v0

    .line 3
    iget-wide v2, p0, Lcom/ss/android/socialbase/downloader/u/wv;->o:J

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    return-wide v0

    .line 4
    :cond_0
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/u/wv;->o:J

    return-wide v0
.end method

.method public p()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/u/wv;->p:J

    return-wide v0
.end method

.method p(J)V
    .locals 3

    .line 2
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/u/wv;->p:J

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    .line 3
    iput-wide p1, p0, Lcom/ss/android/socialbase/downloader/u/wv;->u:J

    return-void

    .line 4
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "setEndOffset: endOffset = "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", segment = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-wide/16 v0, -0x1

    cmp-long v2, p1, v0

    if-nez v2, :cond_1

    .line 5
    iput-wide p1, p0, Lcom/ss/android/socialbase/downloader/u/wv;->u:J

    :cond_1
    return-void
.end method

.method qv()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/ss/android/socialbase/downloader/u/wv;->m:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/ss/android/socialbase/downloader/u/wv;->m:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Segment{startOffset="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Lcom/ss/android/socialbase/downloader/u/wv;->p:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ",\t currentOffset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/u/wv;->i:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",\t currentOffsetRead="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/u/wv;->o()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ",\t endOffset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/ss/android/socialbase/downloader/u/wv;->u:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/u/wv;->u:J

    return-wide v0
.end method

.method public vv()J
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/u/wv;->i:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/ss/android/socialbase/downloader/u/wv;->p:J

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method vv(I)V
    .locals 0

    .line 5
    iput p1, p0, Lcom/ss/android/socialbase/downloader/u/wv;->n:I

    return-void
.end method

.method public vv(J)V
    .locals 5

    .line 2
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/u/wv;->p:J

    cmp-long v2, p1, v0

    if-gez v2, :cond_0

    move-wide p1, v0

    .line 3
    :cond_0
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/u/wv;->u:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_1

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    cmp-long v2, p1, v0

    if-lez v2, :cond_1

    move-wide p1, v0

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/u/wv;->i:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    return-void
.end method

.method wv()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/ss/android/socialbase/downloader/u/wv;->m:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/ss/android/socialbase/downloader/u/wv;->m:I

    return-void
.end method
