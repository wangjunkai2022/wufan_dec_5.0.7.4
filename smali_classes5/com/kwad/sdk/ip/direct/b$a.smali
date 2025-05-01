.class final Lcom/kwad/sdk/ip/direct/b$a;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/sdk/ip/direct/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field aJN:Ljava/nio/channels/Selector;

.field aJO:Ljava/util/LinkedList;

.field volatile aJP:Z


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 2
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/ip/direct/b$a;->aJO:Ljava/util/LinkedList;

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/kwad/sdk/ip/direct/b$a;->aJP:Z

    .line 4
    invoke-static {}, Ljava/nio/channels/Selector;->open()Ljava/nio/channels/Selector;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/ip/direct/b$a;->aJN:Ljava/nio/channels/Selector;

    const-string v0, "Connector"

    .line 5
    invoke-virtual {p0, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    return-void
.end method

.method private Jy()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/ip/direct/b$a;->aJO:Ljava/util/LinkedList;

    monitor-enter v0

    .line 2
    :goto_0
    :try_start_0
    iget-object v1, p0, Lcom/kwad/sdk/ip/direct/b$a;->aJO:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/util/LinkedList;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 3
    iget-object v1, p0, Lcom/kwad/sdk/ip/direct/b$a;->aJO:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/sdk/ip/direct/b$b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 4
    :try_start_1
    iget-object v2, v1, Lcom/kwad/sdk/ip/direct/b$b;->aJT:Ljava/nio/channels/SocketChannel;

    iget-object v3, p0, Lcom/kwad/sdk/ip/direct/b$a;->aJN:Ljava/nio/channels/Selector;

    const/16 v4, 0x8

    invoke-virtual {v2, v3, v4, v1}, Ljava/nio/channels/SocketChannel;->register(Ljava/nio/channels/Selector;ILjava/lang/Object;)Ljava/nio/channels/SelectionKey;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    .line 5
    :try_start_2
    iget-object v3, v1, Lcom/kwad/sdk/ip/direct/b$b;->aJT:Ljava/nio/channels/SocketChannel;

    invoke-virtual {v3}, Ljava/nio/channels/SocketChannel;->close()V

    .line 6
    iput-object v2, v1, Lcom/kwad/sdk/ip/direct/b$b;->aJU:Ljava/lang/Throwable;

    goto :goto_0

    .line 7
    :cond_0
    monitor-exit v0

    return-void

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_2

    :goto_1
    throw v1

    :goto_2
    goto :goto_1
.end method

.method private Jz()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/ip/direct/b$a;->aJN:Ljava/nio/channels/Selector;

    invoke-virtual {v0}, Ljava/nio/channels/Selector;->selectedKeys()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 2
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/nio/channels/SelectionKey;

    .line 3
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 4
    invoke-virtual {v1}, Ljava/nio/channels/SelectionKey;->attachment()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/kwad/sdk/ip/direct/b$b;

    .line 5
    invoke-virtual {v1}, Ljava/nio/channels/SelectionKey;->channel()Ljava/nio/channels/SelectableChannel;

    move-result-object v3

    check-cast v3, Ljava/nio/channels/SocketChannel;

    .line 6
    :try_start_0
    invoke-virtual {v3}, Ljava/nio/channels/SocketChannel;->finishConnect()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 7
    invoke-virtual {v1}, Ljava/nio/channels/SelectionKey;->cancel()V

    .line 8
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    iput-wide v4, v2, Lcom/kwad/sdk/ip/direct/b$b;->aJY:J

    .line 9
    invoke-virtual {v3}, Ljava/nio/channels/SocketChannel;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 10
    invoke-static {v3}, Lcom/kwad/sdk/utils/bo;->c(Ljava/io/Closeable;)V

    .line 11
    iput-object v1, v2, Lcom/kwad/sdk/ip/direct/b$b;->aJU:Ljava/lang/Throwable;

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method final a(Lcom/kwad/sdk/ip/direct/b$b;)V
    .locals 6

    .line 1
    :try_start_0
    invoke-static {}, Ljava/nio/channels/SocketChannel;->open()Ljava/nio/channels/SocketChannel;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    const/4 v1, 0x0

    .line 2
    :try_start_1
    invoke-virtual {v0, v1}, Ljava/nio/channels/SocketChannel;->configureBlocking(Z)Ljava/nio/channels/SelectableChannel;

    .line 3
    iget-object v1, p1, Lcom/kwad/sdk/ip/direct/b$b;->aJS:Ljava/net/InetSocketAddress;

    invoke-virtual {v0, v1}, Ljava/nio/channels/SocketChannel;->connect(Ljava/net/SocketAddress;)Z

    move-result v1

    .line 4
    iput-object v0, p1, Lcom/kwad/sdk/ip/direct/b$b;->aJT:Ljava/nio/channels/SocketChannel;

    .line 5
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iput-wide v2, p1, Lcom/kwad/sdk/ip/direct/b$b;->aJX:J

    if-eqz v1, :cond_0

    .line 6
    iput-wide v2, p1, Lcom/kwad/sdk/ip/direct/b$b;->aJY:J

    .line 7
    invoke-static {v0}, Lcom/kwad/sdk/utils/bo;->c(Ljava/io/Closeable;)V

    goto :goto_0

    .line 8
    :cond_0
    iget-object v1, p0, Lcom/kwad/sdk/ip/direct/b$a;->aJO:Ljava/util/LinkedList;

    monitor-enter v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 9
    :try_start_2
    iget-object v2, p0, Lcom/kwad/sdk/ip/direct/b$a;->aJO:Ljava/util/LinkedList;

    invoke-virtual {v2, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 10
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 11
    :try_start_3
    iget-object v1, p0, Lcom/kwad/sdk/ip/direct/b$a;->aJN:Ljava/nio/channels/Selector;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    if-eqz v1, :cond_1

    .line 12
    :try_start_4
    invoke-virtual {v1}, Ljava/nio/channels/Selector;->wakeup()Ljava/nio/channels/Selector;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 13
    :catchall_0
    :cond_1
    :goto_0
    :try_start_5
    invoke-static {}, Lcom/kwad/sdk/ip/direct/b;->Jx()Landroid/os/Handler;

    move-result-object v1

    new-instance v2, Lcom/kwad/sdk/ip/direct/b$a$1;

    invoke-direct {v2, p0, v0}, Lcom/kwad/sdk/ip/direct/b$a$1;-><init>(Lcom/kwad/sdk/ip/direct/b$a;Ljava/nio/channels/SocketChannel;)V

    iget-wide v3, p1, Lcom/kwad/sdk/ip/direct/b$b;->aJW:J

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    return-void

    :catchall_2
    move-exception v2

    .line 14
    :try_start_6
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :try_start_7
    throw v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :catchall_3
    move-exception v1

    goto :goto_1

    :catchall_4
    move-exception v1

    const/4 v0, 0x0

    .line 15
    :goto_1
    :try_start_8
    invoke-static {v0}, Lcom/kwad/sdk/utils/bo;->c(Ljava/io/Closeable;)V

    .line 16
    iput-object v1, p1, Lcom/kwad/sdk/ip/direct/b$b;->aJU:Ljava/lang/Throwable;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 17
    :try_start_9
    invoke-static {}, Lcom/kwad/sdk/ip/direct/b;->Jx()Landroid/os/Handler;

    move-result-object v1

    new-instance v2, Lcom/kwad/sdk/ip/direct/b$a$1;

    invoke-direct {v2, p0, v0}, Lcom/kwad/sdk/ip/direct/b$a$1;-><init>(Lcom/kwad/sdk/ip/direct/b$a;Ljava/nio/channels/SocketChannel;)V

    iget-wide v3, p1, Lcom/kwad/sdk/ip/direct/b$b;->aJW:J

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    :catchall_5
    return-void

    :catchall_6
    move-exception v1

    :try_start_a
    invoke-static {}, Lcom/kwad/sdk/ip/direct/b;->Jx()Landroid/os/Handler;

    move-result-object v2

    new-instance v3, Lcom/kwad/sdk/ip/direct/b$a$1;

    invoke-direct {v3, p0, v0}, Lcom/kwad/sdk/ip/direct/b$a$1;-><init>(Lcom/kwad/sdk/ip/direct/b$a;Ljava/nio/channels/SocketChannel;)V

    iget-wide v4, p1, Lcom/kwad/sdk/ip/direct/b$b;->aJW:J

    invoke-virtual {v2, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 18
    :catchall_7
    throw v1
.end method

.method public final run()V
    .locals 1

    .line 1
    :cond_0
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/kwad/sdk/ip/direct/b$a;->aJN:Ljava/nio/channels/Selector;

    invoke-virtual {v0}, Ljava/nio/channels/Selector;->select()I

    move-result v0

    if-lez v0, :cond_1

    .line 2
    invoke-direct {p0}, Lcom/kwad/sdk/ip/direct/b$a;->Jz()V

    .line 3
    :cond_1
    invoke-direct {p0}, Lcom/kwad/sdk/ip/direct/b$a;->Jy()V

    .line 4
    iget-boolean v0, p0, Lcom/kwad/sdk/ip/direct/b$a;->aJP:Z

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, p0, Lcom/kwad/sdk/ip/direct/b$a;->aJN:Ljava/nio/channels/Selector;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_2

    .line 6
    :try_start_1
    invoke-virtual {v0}, Ljava/nio/channels/Selector;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catch_0
    :cond_2
    return-void

    :catchall_0
    move-exception v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_0
.end method

.method final shutdown()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/kwad/sdk/ip/direct/b$a;->aJP:Z

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/ip/direct/b$a;->aJN:Ljava/nio/channels/Selector;

    if-eqz v0, :cond_0

    .line 3
    :try_start_0
    invoke-virtual {v0}, Ljava/nio/channels/Selector;->wakeup()Ljava/nio/channels/Selector;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-void
.end method
