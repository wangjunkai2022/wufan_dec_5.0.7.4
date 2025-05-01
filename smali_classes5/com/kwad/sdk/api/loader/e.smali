.class public Lcom/kwad/sdk/api/loader/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# static fields
.field private static anv:Lcom/kwad/sdk/api/loader/e;


# instance fields
.field private DEBUG:Z

.field private anw:Ljava/lang/Thread$UncaughtExceptionHandler;

.field private anx:I

.field private final any:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private anz:J

.field private mContext:Landroid/content/Context;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kwad/sdk/api/loader/e;->DEBUG:Z

    .line 3
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/api/loader/e;->any:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    iput-object p1, p0, Lcom/kwad/sdk/api/loader/e;->mContext:Landroid/content/Context;

    return-void
.end method

.method public static aL(Landroid/content/Context;)Lcom/kwad/sdk/api/loader/e;
    .locals 2

    .line 1
    sget-object v0, Lcom/kwad/sdk/api/loader/e;->anv:Lcom/kwad/sdk/api/loader/e;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/kwad/sdk/api/loader/e;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/kwad/sdk/api/loader/e;->anv:Lcom/kwad/sdk/api/loader/e;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/kwad/sdk/api/loader/e;

    invoke-direct {v1, p0}, Lcom/kwad/sdk/api/loader/e;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/kwad/sdk/api/loader/e;->anv:Lcom/kwad/sdk/api/loader/e;

    .line 5
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    .line 6
    :cond_1
    :goto_0
    sget-object p0, Lcom/kwad/sdk/api/loader/e;->anv:Lcom/kwad/sdk/api/loader/e;

    return-object p0
.end method


# virtual methods
.method public final bW(I)V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/sdk/api/loader/e;->anz:J

    .line 2
    iput p1, p0, Lcom/kwad/sdk/api/loader/e;->anx:I

    return-void
.end method

.method public final cancel()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/api/loader/e;->any:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method public final setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V
    .locals 0

    if-eq p1, p0, :cond_0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/api/loader/e;->anw:Ljava/lang/Thread$UncaughtExceptionHandler;

    :cond_0
    return-void
.end method

.method public uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 5

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lcom/kwad/sdk/api/loader/e;->DEBUG:Z

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AutoRevertHandler uncaughtException, mStartCheckTime:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Lcom/kwad/sdk/api/loader/e;->anz:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ",mMaxDuration:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/kwad/sdk/api/loader/e;->anx:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mIsCancel:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/kwad/sdk/api/loader/e;->any:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/sdk/api/loader/e;->any:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_2

    iget-wide v0, p0, Lcom/kwad/sdk/api/loader/e;->anz:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_2

    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/kwad/sdk/api/loader/e;->anz:J

    sub-long/2addr v0, v2

    iget v2, p0, Lcom/kwad/sdk/api/loader/e;->anx:I

    int-to-long v2, v2

    cmp-long v4, v0, v2

    if-gtz v4, :cond_2

    const-string v0, "filterStack"

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    .line 6
    invoke-static {v0, v2}, Lcom/kwad/sdk/api/c;->f(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    if-eqz v0, :cond_1

    .line 7
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    .line 8
    :goto_0
    iget-object v2, p0, Lcom/kwad/sdk/api/loader/e;->mContext:Landroid/content/Context;

    if-eqz v2, :cond_2

    if-eqz v0, :cond_2

    .line 9
    sget-object v0, Lcom/kwad/sdk/api/loader/h;->anF:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lcom/kwad/sdk/api/loader/b;->a(Landroid/content/Context;Ljava/lang/String;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    :cond_2
    iget-object v0, p0, Lcom/kwad/sdk/api/loader/e;->anw:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v0, :cond_3

    .line 11
    invoke-interface {v0, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    return-void

    :catchall_0
    move-exception v0

    .line 12
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 13
    iget-object v0, p0, Lcom/kwad/sdk/api/loader/e;->anw:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v0, :cond_3

    .line 14
    invoke-interface {v0, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    :cond_3
    return-void

    :catchall_1
    move-exception v0

    .line 15
    iget-object v1, p0, Lcom/kwad/sdk/api/loader/e;->anw:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v1, :cond_4

    .line 16
    iget-object v1, p0, Lcom/kwad/sdk/api/loader/e;->anw:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-interface {v1, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 17
    :cond_4
    throw v0
.end method
