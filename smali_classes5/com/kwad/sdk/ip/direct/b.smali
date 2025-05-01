.class public final Lcom/kwad/sdk/ip/direct/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/sdk/ip/direct/b$a;,
        Lcom/kwad/sdk/ip/direct/b$b;
    }
.end annotation


# static fields
.field private static aJC:Landroid/os/Handler; = null

.field static aJM:I = 0x50

.field static port:I = 0x50


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lcom/kwad/sdk/ip/direct/b;->aJC:Landroid/os/Handler;

    return-void
.end method

.method static synthetic Jx()Landroid/os/Handler;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/ip/direct/b;->aJC:Landroid/os/Handler;

    return-object v0
.end method

.method public static f(Ljava/lang/String;J)Lcom/kwad/sdk/ip/direct/c;
    .locals 10

    const-wide/16 v0, 0x5

    .line 1
    div-long v0, p1, v0

    .line 2
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "ping:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "IpDirect_Ping"

    invoke-static {v3, v2}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    new-instance v2, Lcom/kwad/sdk/ip/direct/c;

    invoke-direct {v2, p0}, Lcom/kwad/sdk/ip/direct/c;-><init>(Ljava/lang/String;)V

    .line 4
    :try_start_0
    new-instance v4, Lcom/kwad/sdk/ip/direct/b$a;

    invoke-direct {v4}, Lcom/kwad/sdk/ip/direct/b$a;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v4

    .line 5
    invoke-virtual {v4}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 v4, 0x0

    :goto_0
    if-nez v4, :cond_0

    return-object v2

    .line 6
    :cond_0
    :try_start_1
    invoke-virtual {v4}, Ljava/lang/Thread;->start()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 7
    new-instance v5, Ljava/util/LinkedList;

    invoke-direct {v5}, Ljava/util/LinkedList;-><init>()V

    const/4 v6, 0x0

    .line 8
    :goto_1
    invoke-virtual {v2}, Lcom/kwad/sdk/ip/direct/c;->JB()I

    move-result v7

    if-ge v6, v7, :cond_1

    .line 9
    new-instance v7, Lcom/kwad/sdk/ip/direct/b$b;

    invoke-direct {v7, p0}, Lcom/kwad/sdk/ip/direct/b$b;-><init>(Ljava/lang/String;)V

    add-long v8, p1, v0

    .line 10
    iput-wide v8, v7, Lcom/kwad/sdk/ip/direct/b$b;->aJW:J

    .line 11
    invoke-virtual {v5, v7}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 12
    :try_start_2
    invoke-virtual {v4, v7}, Lcom/kwad/sdk/ip/direct/b$a;->a(Lcom/kwad/sdk/ip/direct/b$b;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v7

    .line 13
    invoke-virtual {v7}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_1
    add-long/2addr p1, v0

    .line 14
    :try_start_3
    invoke-static {p1, p2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 15
    :try_start_4
    invoke-virtual {v4}, Lcom/kwad/sdk/ip/direct/b$a;->shutdown()V

    .line 16
    invoke-virtual {v4}, Ljava/lang/Thread;->join()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    const/4 p0, 0x0

    .line 17
    invoke-virtual {v5}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p2, 0x1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 18
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/ip/direct/b$b;

    .line 19
    invoke-virtual {v0}, Lcom/kwad/sdk/ip/direct/b$b;->JA()V

    .line 20
    invoke-static {v0}, Lcom/kwad/sdk/ip/direct/b$b;->b(Lcom/kwad/sdk/ip/direct/b$b;)Z

    move-result v1

    and-int/2addr p2, v1

    .line 21
    invoke-virtual {v2, p2}, Lcom/kwad/sdk/ip/direct/c;->bC(Z)V

    .line 22
    invoke-static {v0}, Lcom/kwad/sdk/ip/direct/b$b;->c(Lcom/kwad/sdk/ip/direct/b$b;)F

    move-result v0

    add-float/2addr p0, v0

    goto :goto_3

    .line 23
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "sum:"

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p2, "*size:"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/util/LinkedList;->size()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    invoke-virtual {v5}, Ljava/util/LinkedList;->size()I

    move-result p1

    int-to-float p1, p1

    div-float/2addr p0, p1

    invoke-virtual {v2, p0}, Lcom/kwad/sdk/ip/direct/c;->k(F)V

    return-object v2

    :catchall_2
    move-exception p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-object v2

    :catchall_3
    move-exception p0

    .line 26
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-object v2

    :catchall_4
    move-exception p0

    .line 27
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-object v2
.end method
