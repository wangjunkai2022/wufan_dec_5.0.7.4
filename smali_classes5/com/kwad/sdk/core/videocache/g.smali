.class final Lcom/kwad/sdk/core/videocache/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/sdk/core/videocache/g$a;
    }
.end annotation


# instance fields
.field private final aDm:Lcom/kwad/sdk/core/videocache/c;

.field private final aDq:Ljava/util/concurrent/atomic/AtomicInteger;

.field private volatile aDr:Lcom/kwad/sdk/core/videocache/e;

.field private final aDs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/sdk/core/videocache/b;",
            ">;"
        }
    .end annotation
.end field

.field private final aDt:Lcom/kwad/sdk/core/videocache/b;

.field private final url:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/kwad/sdk/core/videocache/c;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/kwad/sdk/core/videocache/g;->aDq:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 3
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/core/videocache/g;->aDs:Ljava/util/List;

    .line 4
    invoke-static {p1}, Lcom/kwad/sdk/utils/aq;->gR(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/kwad/sdk/core/videocache/g;->url:Ljava/lang/String;

    .line 5
    invoke-static {p2}, Lcom/kwad/sdk/utils/aq;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/kwad/sdk/core/videocache/c;

    iput-object p2, p0, Lcom/kwad/sdk/core/videocache/g;->aDm:Lcom/kwad/sdk/core/videocache/c;

    .line 6
    new-instance p2, Lcom/kwad/sdk/core/videocache/g$a;

    invoke-direct {p2, p1, v0}, Lcom/kwad/sdk/core/videocache/g$a;-><init>(Ljava/lang/String;Ljava/util/List;)V

    iput-object p2, p0, Lcom/kwad/sdk/core/videocache/g;->aDt:Lcom/kwad/sdk/core/videocache/b;

    return-void
.end method

.method private declared-synchronized Hd()V
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/kwad/sdk/core/videocache/g;->aDm:Lcom/kwad/sdk/core/videocache/c;

    iget v0, v0, Lcom/kwad/sdk/core/videocache/c;->aCY:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    invoke-static {}, Lcom/kwad/sdk/core/videocache/g;->isOkHttpSupported()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/core/videocache/g;->aDr:Lcom/kwad/sdk/core/videocache/e;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/kwad/sdk/core/videocache/g;->Hg()Lcom/kwad/sdk/core/videocache/e;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/kwad/sdk/core/videocache/g;->aDr:Lcom/kwad/sdk/core/videocache/e;

    :goto_0
    iput-object v0, p0, Lcom/kwad/sdk/core/videocache/g;->aDr:Lcom/kwad/sdk/core/videocache/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    .line 3
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/kwad/sdk/core/videocache/g;->aDr:Lcom/kwad/sdk/core/videocache/e;

    if-nez v0, :cond_2

    invoke-direct {p0}, Lcom/kwad/sdk/core/videocache/g;->Hf()Lcom/kwad/sdk/core/videocache/e;

    move-result-object v0

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/kwad/sdk/core/videocache/g;->aDr:Lcom/kwad/sdk/core/videocache/e;

    :goto_1
    iput-object v0, p0, Lcom/kwad/sdk/core/videocache/g;->aDr:Lcom/kwad/sdk/core/videocache/e;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 4
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized He()V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/kwad/sdk/core/videocache/g;->aDq:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-gtz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/core/videocache/g;->aDr:Lcom/kwad/sdk/core/videocache/e;

    invoke-virtual {v0}, Lcom/kwad/sdk/core/videocache/k;->shutdown()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/kwad/sdk/core/videocache/g;->aDr:Lcom/kwad/sdk/core/videocache/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private Hf()Lcom/kwad/sdk/core/videocache/e;
    .locals 4

    .line 1
    new-instance v0, Lcom/kwad/sdk/core/videocache/h;

    iget-object v1, p0, Lcom/kwad/sdk/core/videocache/g;->url:Ljava/lang/String;

    iget-object v2, p0, Lcom/kwad/sdk/core/videocache/g;->aDm:Lcom/kwad/sdk/core/videocache/c;

    iget-object v3, v2, Lcom/kwad/sdk/core/videocache/c;->aCW:Lcom/kwad/sdk/core/videocache/d/c;

    iget-object v2, v2, Lcom/kwad/sdk/core/videocache/c;->aCX:Lcom/kwad/sdk/core/videocache/b/b;

    invoke-direct {v0, v1, v3, v2}, Lcom/kwad/sdk/core/videocache/h;-><init>(Ljava/lang/String;Lcom/kwad/sdk/core/videocache/d/c;Lcom/kwad/sdk/core/videocache/b/b;)V

    .line 2
    new-instance v1, Lcom/kwad/sdk/core/videocache/a/b;

    iget-object v2, p0, Lcom/kwad/sdk/core/videocache/g;->aDm:Lcom/kwad/sdk/core/videocache/c;

    iget-object v3, p0, Lcom/kwad/sdk/core/videocache/g;->url:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/kwad/sdk/core/videocache/c;->eH(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    iget-object v3, p0, Lcom/kwad/sdk/core/videocache/g;->aDm:Lcom/kwad/sdk/core/videocache/c;

    iget-object v3, v3, Lcom/kwad/sdk/core/videocache/c;->aCV:Lcom/kwad/sdk/core/videocache/a/a;

    invoke-direct {v1, v2, v3}, Lcom/kwad/sdk/core/videocache/a/b;-><init>(Ljava/io/File;Lcom/kwad/sdk/core/videocache/a/a;)V

    .line 3
    new-instance v2, Lcom/kwad/sdk/core/videocache/e;

    invoke-direct {v2, v0, v1}, Lcom/kwad/sdk/core/videocache/e;-><init>(Lcom/kwad/sdk/core/videocache/p;Lcom/kwad/sdk/core/videocache/a/b;)V

    .line 4
    iget-object v0, p0, Lcom/kwad/sdk/core/videocache/g;->aDt:Lcom/kwad/sdk/core/videocache/b;

    invoke-virtual {v2, v0}, Lcom/kwad/sdk/core/videocache/e;->a(Lcom/kwad/sdk/core/videocache/b;)V

    return-object v2
.end method

.method private Hg()Lcom/kwad/sdk/core/videocache/e;
    .locals 4

    .line 1
    new-instance v0, Lcom/kwad/sdk/core/videocache/j;

    iget-object v1, p0, Lcom/kwad/sdk/core/videocache/g;->url:Ljava/lang/String;

    iget-object v2, p0, Lcom/kwad/sdk/core/videocache/g;->aDm:Lcom/kwad/sdk/core/videocache/c;

    iget-object v3, v2, Lcom/kwad/sdk/core/videocache/c;->aCW:Lcom/kwad/sdk/core/videocache/d/c;

    iget-object v2, v2, Lcom/kwad/sdk/core/videocache/c;->aCX:Lcom/kwad/sdk/core/videocache/b/b;

    invoke-direct {v0, v1, v3, v2}, Lcom/kwad/sdk/core/videocache/j;-><init>(Ljava/lang/String;Lcom/kwad/sdk/core/videocache/d/c;Lcom/kwad/sdk/core/videocache/b/b;)V

    .line 2
    new-instance v1, Lcom/kwad/sdk/core/videocache/a/b;

    iget-object v2, p0, Lcom/kwad/sdk/core/videocache/g;->aDm:Lcom/kwad/sdk/core/videocache/c;

    iget-object v3, p0, Lcom/kwad/sdk/core/videocache/g;->url:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/kwad/sdk/core/videocache/c;->eH(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    iget-object v3, p0, Lcom/kwad/sdk/core/videocache/g;->aDm:Lcom/kwad/sdk/core/videocache/c;

    iget-object v3, v3, Lcom/kwad/sdk/core/videocache/c;->aCV:Lcom/kwad/sdk/core/videocache/a/a;

    invoke-direct {v1, v2, v3}, Lcom/kwad/sdk/core/videocache/a/b;-><init>(Ljava/io/File;Lcom/kwad/sdk/core/videocache/a/a;)V

    .line 3
    new-instance v2, Lcom/kwad/sdk/core/videocache/e;

    invoke-direct {v2, v0, v1}, Lcom/kwad/sdk/core/videocache/e;-><init>(Lcom/kwad/sdk/core/videocache/p;Lcom/kwad/sdk/core/videocache/a/b;)V

    .line 4
    iget-object v0, p0, Lcom/kwad/sdk/core/videocache/g;->aDt:Lcom/kwad/sdk/core/videocache/b;

    invoke-virtual {v2, v0}, Lcom/kwad/sdk/core/videocache/e;->a(Lcom/kwad/sdk/core/videocache/b;)V

    return-object v2
.end method

.method private static isOkHttpSupported()Z
    .locals 1

    :try_start_0
    const-string v0, "okhttp3.OkHttpClient"

    .line 1
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x1

    goto :goto_0

    :catchall_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public final Ha()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/videocache/g;->aDq:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    return v0
.end method

.method public final a(Lcom/kwad/sdk/core/videocache/d;Ljava/net/Socket;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/videocache/g;->Hd()V

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/kwad/sdk/core/videocache/g;->aDq:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 3
    iget-object v0, p0, Lcom/kwad/sdk/core/videocache/g;->aDr:Lcom/kwad/sdk/core/videocache/e;

    invoke-virtual {v0, p1, p2}, Lcom/kwad/sdk/core/videocache/e;->a(Lcom/kwad/sdk/core/videocache/d;Ljava/net/Socket;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    invoke-direct {p0}, Lcom/kwad/sdk/core/videocache/g;->He()V

    return-void

    :catchall_0
    move-exception p1

    invoke-direct {p0}, Lcom/kwad/sdk/core/videocache/g;->He()V

    .line 5
    throw p1
.end method

.method public final shutdown()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/videocache/g;->aDs:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/core/videocache/g;->aDr:Lcom/kwad/sdk/core/videocache/e;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/videocache/e;->a(Lcom/kwad/sdk/core/videocache/b;)V

    .line 4
    invoke-virtual {v0}, Lcom/kwad/sdk/core/videocache/k;->shutdown()V

    .line 5
    :cond_0
    iput-object v1, p0, Lcom/kwad/sdk/core/videocache/g;->aDr:Lcom/kwad/sdk/core/videocache/e;

    .line 6
    iget-object v0, p0, Lcom/kwad/sdk/core/videocache/g;->aDq:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    return-void
.end method
