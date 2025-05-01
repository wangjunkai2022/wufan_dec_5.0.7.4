.class public Lcom/mob/commons/a/d;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static volatile a:Lcom/mob/commons/a/d;


# instance fields
.field private final b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final c:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lcom/mob/commons/a/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/mob/commons/a/d;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/mob/commons/a/d;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-void
.end method

.method public static a()Lcom/mob/commons/a/d;
    .locals 2

    .line 1
    sget-object v0, Lcom/mob/commons/a/d;->a:Lcom/mob/commons/a/d;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/mob/commons/y;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/mob/commons/a/d;->a:Lcom/mob/commons/a/d;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/mob/commons/a/d;

    invoke-direct {v1}, Lcom/mob/commons/a/d;-><init>()V

    sput-object v1, Lcom/mob/commons/a/d;->a:Lcom/mob/commons/a/d;

    .line 5
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 6
    :cond_1
    :goto_0
    sget-object v0, Lcom/mob/commons/a/d;->a:Lcom/mob/commons/a/d;

    return-object v0
.end method

.method private c()J
    .locals 2

    const-string v0, "0034djWji"

    .line 1
    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x12c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/mob/commons/b;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/mob/tools/utils/ResHelper;->forceCast(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    mul-int/lit16 v0, v0, 0x3e8

    int-to-long v0, v0

    return-wide v0
.end method


# virtual methods
.method public a(Lcom/mob/commons/a/c;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/mob/commons/a/c;",
            ">(TT;I)V"
        }
    .end annotation

    const/4 v0, 0x1

    if-eq p2, v0, :cond_1

    const/4 v0, 0x3

    if-eq p2, v0, :cond_0

    .line 7
    iget-object p2, p0, Lcom/mob/commons/a/d;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p2, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 8
    :cond_0
    iget-object p2, p0, Lcom/mob/commons/a/d;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    const/4 v0, 0x0

    invoke-virtual {p2, v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(ILjava/lang/Object;)V

    goto :goto_1

    .line 9
    :cond_1
    iget-object p2, p0, Lcom/mob/commons/a/d;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p2}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mob/commons/a/c;

    .line 10
    invoke-virtual {p1}, Lcom/mob/commons/a/c;->k()I

    move-result v1

    invoke-virtual {v0}, Lcom/mob/commons/a/c;->k()I

    move-result v2

    if-ne v1, v2, :cond_2

    .line 11
    iget-object v1, p0, Lcom/mob/commons/a/d;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    .line 12
    iget-object v1, p0, Lcom/mob/commons/a/d;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1, v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 13
    :cond_2
    iget-object v0, p0, Lcom/mob/commons/a/d;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method public a(Lcom/mob/commons/a/c;JI)V
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-nez v2, :cond_1

    if-eqz p4, :cond_0

    const/4 v0, 0x3

    if-ne p4, v0, :cond_1

    .line 14
    :cond_0
    invoke-virtual {p1}, Lcom/mob/commons/a/c;->h()Z

    goto :goto_0

    .line 15
    :cond_1
    invoke-static {}, Lcom/mob/commons/a/l;->a()Lcom/mob/commons/a/l;

    move-result-object v0

    invoke-virtual {v0, p2, p3, p1, p4}, Lcom/mob/commons/a/l;->a(JLcom/mob/commons/a/c;I)V

    :goto_0
    return-void
.end method

.method public b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/mob/commons/a/d;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lcom/mob/commons/a/a;

    invoke-direct {v0}, Lcom/mob/commons/a/a;-><init>()V

    invoke-virtual {p0, v0, v1}, Lcom/mob/commons/a/d;->a(Lcom/mob/commons/a/c;I)V

    .line 3
    new-instance v0, Lcom/mob/commons/a/b;

    invoke-direct {v0}, Lcom/mob/commons/a/b;-><init>()V

    invoke-virtual {p0, v0, v1}, Lcom/mob/commons/a/d;->a(Lcom/mob/commons/a/c;I)V

    .line 4
    new-instance v0, Lcom/mob/commons/a/e;

    invoke-direct {v0}, Lcom/mob/commons/a/e;-><init>()V

    invoke-virtual {p0, v0, v1}, Lcom/mob/commons/a/d;->a(Lcom/mob/commons/a/c;I)V

    .line 5
    new-instance v0, Lcom/mob/commons/a/f;

    invoke-direct {v0}, Lcom/mob/commons/a/f;-><init>()V

    invoke-virtual {p0, v0, v1}, Lcom/mob/commons/a/d;->a(Lcom/mob/commons/a/c;I)V

    .line 6
    new-instance v0, Lcom/mob/commons/a/k;

    invoke-direct {v0}, Lcom/mob/commons/a/k;-><init>()V

    invoke-virtual {p0, v0, v1}, Lcom/mob/commons/a/d;->a(Lcom/mob/commons/a/c;I)V

    .line 7
    new-instance v0, Lcom/mob/commons/a/g;

    invoke-direct {v0}, Lcom/mob/commons/a/g;-><init>()V

    .line 8
    invoke-virtual {v0, v2}, Lcom/mob/commons/a/c;->a(Z)Lcom/mob/commons/a/c;

    .line 9
    invoke-virtual {p0, v0, v1}, Lcom/mob/commons/a/d;->a(Lcom/mob/commons/a/c;I)V

    .line 10
    new-instance v0, Lcom/mob/commons/a/h;

    invoke-direct {v0}, Lcom/mob/commons/a/h;-><init>()V

    invoke-virtual {p0, v0, v1}, Lcom/mob/commons/a/d;->a(Lcom/mob/commons/a/c;I)V

    .line 11
    new-instance v0, Lcom/mob/commons/a/j;

    invoke-direct {v0}, Lcom/mob/commons/a/j;-><init>()V

    invoke-virtual {p0, v0, v1}, Lcom/mob/commons/a/d;->a(Lcom/mob/commons/a/c;I)V

    .line 12
    new-instance v0, Lcom/mob/commons/a/i;

    invoke-direct {v0}, Lcom/mob/commons/a/i;-><init>()V

    invoke-virtual {p0, v0, v1}, Lcom/mob/commons/a/d;->a(Lcom/mob/commons/a/c;I)V

    .line 13
    new-instance v0, Lcom/mob/commons/a/m;

    invoke-direct {v0}, Lcom/mob/commons/a/m;-><init>()V

    invoke-virtual {p0, v0, v1}, Lcom/mob/commons/a/d;->a(Lcom/mob/commons/a/c;I)V

    .line 14
    new-instance v0, Lcom/mob/commons/a/n;

    invoke-direct {v0}, Lcom/mob/commons/a/n;-><init>()V

    invoke-virtual {p0, v0, v1}, Lcom/mob/commons/a/d;->a(Lcom/mob/commons/a/c;I)V

    .line 15
    new-instance v0, Lcom/mob/commons/a/o;

    invoke-direct {v0}, Lcom/mob/commons/a/o;-><init>()V

    invoke-virtual {p0, v0, v1}, Lcom/mob/commons/a/d;->a(Lcom/mob/commons/a/c;I)V

    .line 16
    sget-object v0, Lcom/mob/commons/z;->c:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public run()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/mob/commons/a/d;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 2
    invoke-static {}, Lcom/mob/commons/b;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/mob/commons/d;->j()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 4
    iget-object v2, p0, Lcom/mob/commons/a/d;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/mob/commons/a/c;

    .line 5
    invoke-virtual {v3}, Lcom/mob/commons/a/c;->j()J

    move-result-wide v4

    cmp-long v6, v0, v4

    if-ltz v6, :cond_0

    .line 6
    invoke-virtual {v3}, Lcom/mob/commons/a/c;->h()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 7
    :catchall_0
    :cond_1
    invoke-static {}, Lcom/mob/commons/a/l;->a()Lcom/mob/commons/a/l;

    move-result-object v0

    invoke-direct {p0}, Lcom/mob/commons/a/d;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2, p0}, Lcom/mob/commons/a/l;->d(JLjava/lang/Runnable;)Z

    goto :goto_1

    .line 8
    :cond_2
    invoke-static {}, Lcom/mob/commons/a/l;->a()Lcom/mob/commons/a/l;

    move-result-object v0

    const-wide/32 v1, 0xea60

    invoke-virtual {v0, v1, v2, p0}, Lcom/mob/commons/a/l;->d(JLjava/lang/Runnable;)Z

    goto :goto_1

    .line 9
    :cond_3
    invoke-static {}, Lcom/mob/commons/a/l;->a()Lcom/mob/commons/a/l;

    move-result-object v0

    invoke-direct {p0}, Lcom/mob/commons/a/d;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2, p0}, Lcom/mob/commons/a/l;->d(JLjava/lang/Runnable;)Z

    :goto_1
    return-void
.end method
