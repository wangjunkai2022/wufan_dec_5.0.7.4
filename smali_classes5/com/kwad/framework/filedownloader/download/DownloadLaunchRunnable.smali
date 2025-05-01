.class public final Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/framework/filedownloader/download/f;
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable$a;,
        Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable$DiscardSafely;,
        Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable$RetryDirectly;
    }
.end annotation


# static fields
.field private static final ahb:Ljava/util/concurrent/ThreadPoolExecutor;


# instance fields
.field private final agL:Lcom/kwad/framework/filedownloader/b/a;

.field private final agO:Lcom/kwad/framework/filedownloader/download/d;

.field private final agP:I

.field private final agQ:Lcom/kwad/framework/filedownloader/d/c;

.field private final agR:Lcom/kwad/framework/filedownloader/d/b;

.field private final agS:Z

.field private final agT:Z

.field private final agU:Lcom/kwad/framework/filedownloader/y;

.field private agV:Z

.field agW:I

.field private final agX:Z

.field private final agY:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/kwad/framework/filedownloader/download/c;",
            ">;"
        }
    .end annotation
.end field

.field private agZ:Lcom/kwad/framework/filedownloader/download/e;

.field private aha:Z

.field private ahc:Z

.field private ahd:Z

.field private ahe:Z

.field private final ahf:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private volatile ahg:Z

.field private volatile ahh:Ljava/lang/Exception;

.field private ahi:Ljava/lang/String;

.field private ahj:J

.field private ahk:J

.field private ahl:J

.field private ahm:J

.field private volatile kH:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "ConnectionBlock"

    .line 1
    invoke-static {v0}, Lcom/kwad/framework/filedownloader/f/b;->bt(Ljava/lang/String;)Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v0

    sput-object v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->ahb:Ljava/util/concurrent/ThreadPoolExecutor;

    return-void
.end method

.method private constructor <init>(Lcom/kwad/framework/filedownloader/d/c;Lcom/kwad/framework/filedownloader/d/b;Lcom/kwad/framework/filedownloader/y;IIZZI)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x5

    .line 3
    iput v0, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agP:I

    .line 4
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agY:Ljava/util/ArrayList;

    const-wide/16 v0, 0x0

    .line 5
    iput-wide v0, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->ahj:J

    .line 6
    iput-wide v0, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->ahk:J

    .line 7
    iput-wide v0, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->ahl:J

    .line 8
    iput-wide v0, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->ahm:J

    .line 9
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->ahf:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->kH:Z

    .line 11
    iput-boolean v0, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agV:Z

    .line 12
    iput-object p1, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    .line 13
    iput-object p2, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agR:Lcom/kwad/framework/filedownloader/d/b;

    .line 14
    iput-boolean p6, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agS:Z

    .line 15
    iput-boolean p7, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agT:Z

    .line 16
    invoke-static {}, Lcom/kwad/framework/filedownloader/download/b;->vS()Lcom/kwad/framework/filedownloader/download/b;

    move-result-object p2

    invoke-virtual {p2}, Lcom/kwad/framework/filedownloader/download/b;->vU()Lcom/kwad/framework/filedownloader/b/a;

    move-result-object p2

    iput-object p2, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agL:Lcom/kwad/framework/filedownloader/b/a;

    .line 17
    invoke-static {}, Lcom/kwad/framework/filedownloader/download/b;->vS()Lcom/kwad/framework/filedownloader/download/b;

    move-result-object p2

    invoke-virtual {p2}, Lcom/kwad/framework/filedownloader/download/b;->vW()Z

    move-result p2

    iput-boolean p2, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agX:Z

    .line 18
    iput-object p3, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agU:Lcom/kwad/framework/filedownloader/y;

    .line 19
    iput p8, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agW:I

    .line 20
    new-instance p2, Lcom/kwad/framework/filedownloader/download/d;

    invoke-direct {p2, p1, p8, p4, p5}, Lcom/kwad/framework/filedownloader/download/d;-><init>(Lcom/kwad/framework/filedownloader/d/c;III)V

    iput-object p2, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agO:Lcom/kwad/framework/filedownloader/download/d;

    return-void
.end method

.method synthetic constructor <init>(Lcom/kwad/framework/filedownloader/d/c;Lcom/kwad/framework/filedownloader/d/b;Lcom/kwad/framework/filedownloader/y;IIZZIB)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p8}, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;-><init>(Lcom/kwad/framework/filedownloader/d/c;Lcom/kwad/framework/filedownloader/d/b;Lcom/kwad/framework/filedownloader/y;IIZZI)V

    return-void
.end method

.method private a(ILjava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/kwad/framework/filedownloader/d/a;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x1

    if-le p1, v0, :cond_0

    .line 55
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, p1, :cond_0

    .line 56
    iget-object p1, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {p1}, Lcom/kwad/framework/filedownloader/d/c;->getTotal()J

    move-result-wide v0

    invoke-direct {p0, p2, v0, v1}, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->b(Ljava/util/List;J)V

    return-void

    .line 57
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method private a(JLjava/lang/String;)V
    .locals 10

    const-wide/16 v0, -0x1

    const/4 v2, 0x0

    cmp-long v3, p1, v0

    if-eqz v3, :cond_2

    .line 58
    :try_start_0
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v0}, Lcom/kwad/framework/filedownloader/d/c;->wh()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/framework/filedownloader/f/f;->bD(Ljava/lang/String;)Lcom/kwad/framework/filedownloader/e/a;

    move-result-object v2

    .line 59
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v8

    sub-long v6, p1, v8

    .line 60
    invoke-static {p3}, Lcom/kwad/sdk/crash/utils/h;->getAvailableBytes(Ljava/lang/String;)J

    move-result-wide v4

    cmp-long p3, v4, v6

    if-ltz p3, :cond_0

    .line 61
    invoke-static {}, Lcom/kwad/framework/filedownloader/f/e;->xr()Lcom/kwad/framework/filedownloader/f/e;

    move-result-object p3

    iget-boolean p3, p3, Lcom/kwad/framework/filedownloader/f/e;->ajh:Z

    if-nez p3, :cond_2

    .line 62
    invoke-interface {v2, p1, p2}, Lcom/kwad/framework/filedownloader/e/a;->setLength(J)V

    goto :goto_0

    .line 63
    :cond_0
    new-instance p1, Lcom/kwad/framework/filedownloader/exception/FileDownloadOutOfSpaceException;

    move-object v3, p1

    invoke-direct/range {v3 .. v9}, Lcom/kwad/framework/filedownloader/exception/FileDownloadOutOfSpaceException;-><init>(JJJ)V

    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception p1

    if-eqz v2, :cond_1

    .line 64
    invoke-interface {v2}, Lcom/kwad/framework/filedownloader/e/a;->close()V

    .line 65
    :cond_1
    throw p1

    :cond_2
    :goto_0
    if-eqz v2, :cond_3

    .line 66
    invoke-interface {v2}, Lcom/kwad/framework/filedownloader/e/a;->close()V

    :cond_3
    return-void
.end method

.method private a(Lcom/kwad/framework/filedownloader/download/a;Lcom/kwad/framework/filedownloader/a/b;)V
    .locals 12

    .line 37
    iget-boolean v0, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->ahd:Z

    if-nez v0, :cond_0

    .line 38
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/kwad/framework/filedownloader/d/c;->S(J)V

    .line 39
    new-instance v0, Lcom/kwad/framework/filedownloader/download/a;

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    iget-wide v8, p1, Lcom/kwad/framework/filedownloader/download/a;->agG:J

    iget-wide v10, p1, Lcom/kwad/framework/filedownloader/download/a;->contentLength:J

    move-object v3, v0

    invoke-direct/range {v3 .. v11}, Lcom/kwad/framework/filedownloader/download/a;-><init>(JJJJ)V

    move-object p1, v0

    .line 40
    :cond_0
    new-instance v0, Lcom/kwad/framework/filedownloader/download/e$a;

    invoke-direct {v0}, Lcom/kwad/framework/filedownloader/download/e$a;-><init>()V

    .line 41
    invoke-virtual {v0, p0}, Lcom/kwad/framework/filedownloader/download/e$a;->b(Lcom/kwad/framework/filedownloader/download/f;)Lcom/kwad/framework/filedownloader/download/e$a;

    move-result-object v1

    iget-object v2, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    .line 42
    invoke-virtual {v2}, Lcom/kwad/framework/filedownloader/d/c;->getId()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/kwad/framework/filedownloader/download/e$a;->bw(I)Lcom/kwad/framework/filedownloader/download/e$a;

    move-result-object v1

    const/4 v2, -0x1

    .line 43
    invoke-virtual {v1, v2}, Lcom/kwad/framework/filedownloader/download/e$a;->bv(I)Lcom/kwad/framework/filedownloader/download/e$a;

    move-result-object v1

    iget-boolean v2, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agT:Z

    .line 44
    invoke-virtual {v1, v2}, Lcom/kwad/framework/filedownloader/download/e$a;->bf(Z)Lcom/kwad/framework/filedownloader/download/e$a;

    move-result-object v1

    .line 45
    invoke-virtual {v1, p2}, Lcom/kwad/framework/filedownloader/download/e$a;->d(Lcom/kwad/framework/filedownloader/a/b;)Lcom/kwad/framework/filedownloader/download/e$a;

    move-result-object p2

    .line 46
    invoke-virtual {p2, p1}, Lcom/kwad/framework/filedownloader/download/e$a;->c(Lcom/kwad/framework/filedownloader/download/a;)Lcom/kwad/framework/filedownloader/download/e$a;

    move-result-object p1

    iget-object p2, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    .line 47
    invoke-virtual {p2}, Lcom/kwad/framework/filedownloader/d/c;->wh()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/kwad/framework/filedownloader/download/e$a;->bo(Ljava/lang/String;)Lcom/kwad/framework/filedownloader/download/e$a;

    .line 48
    iget-object p1, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/kwad/framework/filedownloader/d/c;->bD(I)V

    .line 49
    iget-object p1, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agL:Lcom/kwad/framework/filedownloader/b/a;

    iget-object v1, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v1}, Lcom/kwad/framework/filedownloader/d/c;->getId()I

    move-result v1

    invoke-interface {p1, v1, p2}, Lcom/kwad/framework/filedownloader/b/a;->s(II)V

    .line 50
    invoke-virtual {v0}, Lcom/kwad/framework/filedownloader/download/e$a;->ww()Lcom/kwad/framework/filedownloader/download/e;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agZ:Lcom/kwad/framework/filedownloader/download/e;

    .line 51
    iget-boolean p1, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->kH:Z

    if-eqz p1, :cond_1

    .line 52
    iget-object p1, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    const/4 p2, -0x2

    invoke-virtual {p1, p2}, Lcom/kwad/framework/filedownloader/d/c;->d(B)V

    .line 53
    iget-object p1, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agZ:Lcom/kwad/framework/filedownloader/download/e;

    invoke-virtual {p1}, Lcom/kwad/framework/filedownloader/download/e;->pause()V

    return-void

    .line 54
    :cond_1
    iget-object p1, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agZ:Lcom/kwad/framework/filedownloader/download/e;

    invoke-virtual {p1}, Lcom/kwad/framework/filedownloader/download/e;->run()V

    return-void
.end method

.method private a(Ljava/util/Map;Lcom/kwad/framework/filedownloader/download/ConnectTask;Lcom/kwad/framework/filedownloader/a/b;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
            "Lcom/kwad/framework/filedownloader/download/ConnectTask;",
            "Lcom/kwad/framework/filedownloader/a/b;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    .line 1
    iget-object v2, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v2}, Lcom/kwad/framework/filedownloader/d/c;->getId()I

    move-result v4

    .line 2
    invoke-interface/range {p3 .. p3}, Lcom/kwad/framework/filedownloader/a/b;->getResponseCode()I

    move-result v2

    const/4 v3, 0x0

    const/4 v5, 0x1

    const/16 v6, 0xce

    if-eq v2, v6, :cond_1

    if-ne v2, v5, :cond_0

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v6, 0x1

    .line 3
    :goto_1
    iput-boolean v6, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->ahd:Z

    const/16 v6, 0xc8

    const/16 v7, 0xc9

    if-eq v2, v6, :cond_3

    if-eq v2, v7, :cond_3

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    goto :goto_3

    :cond_3
    :goto_2
    const/4 v6, 0x1

    .line 4
    :goto_3
    iget-object v8, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v8}, Lcom/kwad/framework/filedownloader/d/c;->wQ()Ljava/lang/String;

    move-result-object v8

    .line 5
    invoke-static {v4, v1}, Lcom/kwad/framework/filedownloader/f/f;->a(ILcom/kwad/framework/filedownloader/a/b;)Ljava/lang/String;

    move-result-object v13

    const/16 v9, 0x19c

    const-wide/16 v10, 0x0

    if-ne v2, v9, :cond_5

    :cond_4
    :goto_4
    const/4 v7, 0x1

    goto :goto_5

    :cond_5
    if-eqz v8, :cond_6

    .line 6
    invoke-virtual {v8, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_6

    if-nez v6, :cond_4

    .line 7
    iget-boolean v9, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->ahd:Z

    if-eqz v9, :cond_6

    goto :goto_4

    :cond_6
    if-ne v2, v7, :cond_7

    .line 8
    invoke-virtual/range {p2 .. p2}, Lcom/kwad/framework/filedownloader/download/ConnectTask;->vO()Z

    move-result v7

    if-eqz v7, :cond_7

    goto :goto_4

    :cond_7
    const/16 v7, 0x1a0

    if-ne v2, v7, :cond_8

    .line 9
    iget-object v7, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v7}, Lcom/kwad/framework/filedownloader/d/c;->wP()J

    move-result-wide v14

    cmp-long v7, v14, v10

    if-lez v7, :cond_8

    goto :goto_4

    :cond_8
    const/4 v7, 0x0

    :goto_5
    const/4 v9, 0x0

    if-eqz v7, :cond_b

    .line 10
    iget-boolean v1, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->ahc:Z

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v12, 0x4

    if-eqz v1, :cond_9

    new-array v1, v12, [Ljava/lang/Object;

    .line 11
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    aput-object v14, v1, v3

    aput-object v8, v1, v5

    aput-object v13, v1, v7

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    aput-object v14, v1, v6

    const-string v14, "there is precondition failed on this request[%d] with old etag[%s]\u3001new etag[%s]\u3001response requestHttpCode is %d"

    .line 12
    invoke-static {v0, v14, v1}, Lcom/kwad/framework/filedownloader/f/d;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 13
    :cond_9
    iget-object v1, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agL:Lcom/kwad/framework/filedownloader/b/a;

    iget-object v14, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v14}, Lcom/kwad/framework/filedownloader/d/c;->getId()I

    move-result v14

    invoke-interface {v1, v14}, Lcom/kwad/framework/filedownloader/b/a;->bm(I)V

    .line 14
    iget-object v1, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v1}, Lcom/kwad/framework/filedownloader/d/c;->getTargetFilePath()Ljava/lang/String;

    move-result-object v1

    iget-object v14, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v14}, Lcom/kwad/framework/filedownloader/d/c;->wh()Ljava/lang/String;

    move-result-object v14

    invoke-static {v1, v14}, Lcom/kwad/framework/filedownloader/f/f;->B(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    iput-boolean v3, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->ahc:Z

    if-eqz v8, :cond_a

    .line 16
    invoke-virtual {v8, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    new-array v1, v12, [Ljava/lang/Object;

    aput-object v8, v1, v3

    aput-object v13, v1, v5

    .line 17
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v7

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v6

    const-string v2, "the old etag[%s] is the same to the new etag[%s], but the response status requestHttpCode is %d not Partial(206), so wo have to start this task from very beginning for task[%d]!"

    .line 18
    invoke-static {v0, v2, v1}, Lcom/kwad/framework/filedownloader/f/d;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    move-object v13, v9

    .line 19
    :cond_a
    iget-object v1, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v1, v10, v11}, Lcom/kwad/framework/filedownloader/d/c;->S(J)V

    .line 20
    iget-object v1, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v1, v10, v11}, Lcom/kwad/framework/filedownloader/d/c;->U(J)V

    .line 21
    iget-object v1, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v1, v13}, Lcom/kwad/framework/filedownloader/d/c;->bq(Ljava/lang/String;)V

    .line 22
    iget-object v1, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v1}, Lcom/kwad/framework/filedownloader/d/c;->wT()V

    .line 23
    iget-object v3, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agL:Lcom/kwad/framework/filedownloader/b/a;

    iget-object v1, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v1}, Lcom/kwad/framework/filedownloader/d/c;->wQ()Ljava/lang/String;

    move-result-object v5

    iget-object v1, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v1}, Lcom/kwad/framework/filedownloader/d/c;->wP()J

    move-result-wide v6

    iget-object v1, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v1}, Lcom/kwad/framework/filedownloader/d/c;->getTotal()J

    move-result-wide v8

    iget-object v1, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    .line 24
    invoke-virtual {v1}, Lcom/kwad/framework/filedownloader/d/c;->wS()I

    move-result v10

    .line 25
    invoke-interface/range {v3 .. v10}, Lcom/kwad/framework/filedownloader/b/a;->a(ILjava/lang/String;JJI)V

    .line 26
    new-instance v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable$RetryDirectly;

    invoke-direct {v1, v0}, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable$RetryDirectly;-><init>(Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;)V

    throw v1

    .line 27
    :cond_b
    invoke-virtual/range {p2 .. p2}, Lcom/kwad/framework/filedownloader/download/ConnectTask;->vP()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->ahi:Ljava/lang/String;

    .line 28
    iget-boolean v7, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->ahd:Z

    if-nez v7, :cond_d

    if-eqz v6, :cond_c

    goto :goto_6

    .line 29
    :cond_c
    new-instance v3, Lcom/kwad/framework/filedownloader/exception/FileDownloadHttpException;

    .line 30
    invoke-interface/range {p3 .. p3}, Lcom/kwad/framework/filedownloader/a/b;->vH()Ljava/util/Map;

    move-result-object v1

    move-object/from16 v4, p1

    invoke-direct {v3, v2, v4, v1}, Lcom/kwad/framework/filedownloader/exception/FileDownloadHttpException;-><init>(ILjava/util/Map;Ljava/util/Map;)V

    throw v3

    .line 31
    :cond_d
    :goto_6
    invoke-static {v4, v1}, Lcom/kwad/framework/filedownloader/f/f;->b(ILcom/kwad/framework/filedownloader/a/b;)J

    move-result-wide v6

    .line 32
    iget-object v2, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v2}, Lcom/kwad/framework/filedownloader/d/c;->uv()Z

    move-result v2

    if-eqz v2, :cond_e

    .line 33
    iget-object v2, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v2}, Lcom/kwad/framework/filedownloader/d/c;->getUrl()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/kwad/framework/filedownloader/f/f;->a(Lcom/kwad/framework/filedownloader/a/b;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object v14, v1

    goto :goto_7

    :cond_e
    move-object v14, v9

    :goto_7
    const-wide/16 v1, -0x1

    cmp-long v4, v6, v1

    if-nez v4, :cond_f

    const/4 v1, 0x1

    goto :goto_8

    :cond_f
    const/4 v1, 0x0

    .line 34
    :goto_8
    iput-boolean v1, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->ahe:Z

    if-nez v1, :cond_10

    .line 35
    iget-object v1, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v1}, Lcom/kwad/framework/filedownloader/d/c;->wP()J

    move-result-wide v1

    add-long/2addr v1, v6

    move-wide v11, v1

    goto :goto_9

    :cond_10
    move-wide v11, v6

    .line 36
    :goto_9
    iget-object v9, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agO:Lcom/kwad/framework/filedownloader/download/d;

    iget-boolean v1, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->ahc:Z

    if-eqz v1, :cond_11

    iget-boolean v1, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->ahd:Z

    if-eqz v1, :cond_11

    const/4 v10, 0x1

    goto :goto_a

    :cond_11
    const/4 v10, 0x0

    :goto_a
    invoke-virtual/range {v9 .. v14}, Lcom/kwad/framework/filedownloader/download/d;->a(ZJLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private b(JI)V
    .locals 17

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move/from16 v3, p3

    int-to-long v4, v3

    .line 1
    div-long v4, v1, v4

    .line 2
    iget-object v6, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v6}, Lcom/kwad/framework/filedownloader/d/c;->getId()I

    move-result v6

    .line 3
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    move-wide v11, v8

    :goto_0
    if-ge v10, v3, :cond_1

    add-int/lit8 v13, v3, -0x1

    if-ne v10, v13, :cond_0

    move-wide v13, v8

    goto :goto_1

    :cond_0
    add-long v13, v11, v4

    const-wide/16 v15, 0x1

    sub-long/2addr v13, v15

    .line 4
    :goto_1
    new-instance v15, Lcom/kwad/framework/filedownloader/d/a;

    invoke-direct {v15}, Lcom/kwad/framework/filedownloader/d/a;-><init>()V

    .line 5
    invoke-virtual {v15, v6}, Lcom/kwad/framework/filedownloader/d/a;->setId(I)V

    .line 6
    invoke-virtual {v15, v10}, Lcom/kwad/framework/filedownloader/d/a;->setIndex(I)V

    .line 7
    invoke-virtual {v15, v11, v12}, Lcom/kwad/framework/filedownloader/d/a;->setStartOffset(J)V

    .line 8
    invoke-virtual {v15, v11, v12}, Lcom/kwad/framework/filedownloader/d/a;->Q(J)V

    .line 9
    invoke-virtual {v15, v13, v14}, Lcom/kwad/framework/filedownloader/d/a;->R(J)V

    .line 10
    invoke-interface {v7, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11
    iget-object v13, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agL:Lcom/kwad/framework/filedownloader/b/a;

    invoke-interface {v13, v15}, Lcom/kwad/framework/filedownloader/b/a;->a(Lcom/kwad/framework/filedownloader/d/a;)V

    add-long/2addr v11, v4

    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 12
    :cond_1
    iget-object v4, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v4, v3}, Lcom/kwad/framework/filedownloader/d/c;->bD(I)V

    .line 13
    iget-object v4, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agL:Lcom/kwad/framework/filedownloader/b/a;

    invoke-interface {v4, v6, v3}, Lcom/kwad/framework/filedownloader/b/a;->s(II)V

    .line 14
    invoke-direct {v0, v7, v1, v2}, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->b(Ljava/util/List;J)V

    return-void
.end method

.method private b(Ljava/util/List;J)V
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kwad/framework/filedownloader/d/a;",
            ">;J)V"
        }
    .end annotation

    move-object/from16 v0, p0

    .line 15
    iget-object v1, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v1}, Lcom/kwad/framework/filedownloader/d/c;->getId()I

    move-result v1

    .line 16
    iget-object v2, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v2}, Lcom/kwad/framework/filedownloader/d/c;->wQ()Ljava/lang/String;

    move-result-object v2

    .line 17
    iget-object v3, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->ahi:Ljava/lang/String;

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    iget-object v3, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v3}, Lcom/kwad/framework/filedownloader/d/c;->getUrl()Ljava/lang/String;

    move-result-object v3

    .line 18
    :goto_0
    iget-object v4, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v4}, Lcom/kwad/framework/filedownloader/d/c;->wh()Ljava/lang/String;

    move-result-object v4

    .line 19
    sget-boolean v5, Lcom/kwad/framework/filedownloader/f/d;->ajb:Z

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v5, :cond_1

    new-array v5, v6, [Ljava/lang/Object;

    .line 20
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v5, v9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v5, v8

    invoke-static/range {p2 .. p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    aput-object v10, v5, v7

    const-string v10, "fetch data with multiple connection(count: [%d]) for task[%d] totalLength[%d]"

    .line 21
    invoke-static {v0, v10, v5}, Lcom/kwad/framework/filedownloader/f/d;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 22
    :cond_1
    iget-boolean v5, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->ahc:Z

    .line 23
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    const-wide/16 v11, 0x0

    move-wide v13, v11

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_7

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/kwad/framework/filedownloader/d/a;

    .line 24
    invoke-virtual {v15}, Lcom/kwad/framework/filedownloader/d/a;->wM()J

    move-result-wide v16

    cmp-long v18, v16, v11

    if-nez v18, :cond_2

    .line 25
    invoke-virtual {v15}, Lcom/kwad/framework/filedownloader/d/a;->wL()J

    move-result-wide v16

    sub-long v16, p2, v16

    goto :goto_2

    .line 26
    :cond_2
    invoke-virtual {v15}, Lcom/kwad/framework/filedownloader/d/a;->wM()J

    move-result-wide v16

    .line 27
    invoke-virtual {v15}, Lcom/kwad/framework/filedownloader/d/a;->wL()J

    move-result-wide v18

    sub-long v16, v16, v18

    const-wide/16 v18, 0x1

    add-long v16, v16, v18

    :goto_2
    move-wide/from16 v25, v16

    .line 28
    invoke-virtual {v15}, Lcom/kwad/framework/filedownloader/d/a;->wL()J

    move-result-wide v16

    invoke-virtual {v15}, Lcom/kwad/framework/filedownloader/d/a;->getStartOffset()J

    move-result-wide v18

    sub-long v16, v16, v18

    add-long v13, v13, v16

    cmp-long v16, v25, v11

    if-nez v16, :cond_3

    .line 29
    sget-boolean v16, Lcom/kwad/framework/filedownloader/f/d;->ajb:Z

    if-eqz v16, :cond_6

    new-array v11, v7, [Ljava/lang/Object;

    .line 30
    invoke-virtual {v15}, Lcom/kwad/framework/filedownloader/d/a;->getId()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    aput-object v12, v11, v9

    invoke-virtual {v15}, Lcom/kwad/framework/filedownloader/d/a;->getIndex()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    aput-object v12, v11, v8

    const-string v12, "pass connection[%d-%d], because it has been completed"

    .line 31
    invoke-static {v0, v12, v11}, Lcom/kwad/framework/filedownloader/f/d;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_4

    .line 32
    :cond_3
    new-instance v11, Lcom/kwad/framework/filedownloader/download/c$a;

    invoke-direct {v11}, Lcom/kwad/framework/filedownloader/download/c$a;-><init>()V

    .line 33
    new-instance v12, Lcom/kwad/framework/filedownloader/download/a;

    .line 34
    invoke-virtual {v15}, Lcom/kwad/framework/filedownloader/d/a;->getStartOffset()J

    move-result-wide v19

    invoke-virtual {v15}, Lcom/kwad/framework/filedownloader/d/a;->wL()J

    move-result-wide v21

    .line 35
    invoke-virtual {v15}, Lcom/kwad/framework/filedownloader/d/a;->wM()J

    move-result-wide v23

    move-object/from16 v18, v12

    invoke-direct/range {v18 .. v26}, Lcom/kwad/framework/filedownloader/download/a;-><init>(JJJJ)V

    .line 36
    invoke-virtual {v11, v1}, Lcom/kwad/framework/filedownloader/download/c$a;->bt(I)Lcom/kwad/framework/filedownloader/download/c$a;

    move-result-object v11

    .line 37
    invoke-virtual {v15}, Lcom/kwad/framework/filedownloader/d/a;->getIndex()I

    move-result v18

    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v11, v6}, Lcom/kwad/framework/filedownloader/download/c$a;->d(Ljava/lang/Integer;)Lcom/kwad/framework/filedownloader/download/c$a;

    move-result-object v6

    .line 38
    invoke-virtual {v6, v0}, Lcom/kwad/framework/filedownloader/download/c$a;->a(Lcom/kwad/framework/filedownloader/download/f;)Lcom/kwad/framework/filedownloader/download/c$a;

    move-result-object v6

    .line 39
    invoke-virtual {v6, v3}, Lcom/kwad/framework/filedownloader/download/c$a;->bl(Ljava/lang/String;)Lcom/kwad/framework/filedownloader/download/c$a;

    move-result-object v6

    if-eqz v5, :cond_4

    move-object v11, v2

    goto :goto_3

    :cond_4
    const/4 v11, 0x0

    .line 40
    :goto_3
    invoke-virtual {v6, v11}, Lcom/kwad/framework/filedownloader/download/c$a;->bm(Ljava/lang/String;)Lcom/kwad/framework/filedownloader/download/c$a;

    move-result-object v6

    iget-object v11, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agR:Lcom/kwad/framework/filedownloader/d/b;

    .line 41
    invoke-virtual {v6, v11}, Lcom/kwad/framework/filedownloader/download/c$a;->c(Lcom/kwad/framework/filedownloader/d/b;)Lcom/kwad/framework/filedownloader/download/c$a;

    move-result-object v6

    iget-boolean v11, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agT:Z

    .line 42
    invoke-virtual {v6, v11}, Lcom/kwad/framework/filedownloader/download/c$a;->bd(Z)Lcom/kwad/framework/filedownloader/download/c$a;

    move-result-object v6

    .line 43
    invoke-virtual {v6, v12}, Lcom/kwad/framework/filedownloader/download/c$a;->b(Lcom/kwad/framework/filedownloader/download/a;)Lcom/kwad/framework/filedownloader/download/c$a;

    move-result-object v6

    .line 44
    invoke-virtual {v6, v4}, Lcom/kwad/framework/filedownloader/download/c$a;->bn(Ljava/lang/String;)Lcom/kwad/framework/filedownloader/download/c$a;

    move-result-object v6

    .line 45
    invoke-virtual {v6}, Lcom/kwad/framework/filedownloader/download/c$a;->wj()Lcom/kwad/framework/filedownloader/download/c;

    move-result-object v6

    .line 46
    sget-boolean v11, Lcom/kwad/framework/filedownloader/f/d;->ajb:Z

    if-eqz v11, :cond_5

    new-array v11, v8, [Ljava/lang/Object;

    aput-object v15, v11, v9

    const-string v12, "enable multiple connection: %s"

    .line 47
    invoke-static {v0, v12, v11}, Lcom/kwad/framework/filedownloader/f/d;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    :cond_5
    iget-object v11, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agY:Ljava/util/ArrayList;

    invoke-virtual {v11, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    :goto_4
    const/4 v6, 0x3

    const-wide/16 v11, 0x0

    goto/16 :goto_1

    .line 49
    :cond_7
    iget-object v2, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v2}, Lcom/kwad/framework/filedownloader/d/c;->wP()J

    move-result-wide v2

    cmp-long v4, v13, v2

    if-eqz v4, :cond_8

    new-array v2, v7, [Ljava/lang/Object;

    .line 50
    iget-object v3, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    .line 51
    invoke-virtual {v3}, Lcom/kwad/framework/filedownloader/d/c;->wP()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v2, v9

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v2, v8

    const-string v3, "correct the sofar[%d] from connection table[%d]"

    .line 52
    invoke-static {v0, v3, v2}, Lcom/kwad/framework/filedownloader/f/d;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    iget-object v2, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v2, v13, v14}, Lcom/kwad/framework/filedownloader/d/c;->S(J)V

    .line 54
    :cond_8
    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agY:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 55
    iget-object v3, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agY:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/kwad/framework/filedownloader/download/c;

    .line 56
    iget-boolean v5, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->kH:Z

    if-eqz v5, :cond_9

    .line 57
    invoke-virtual {v4}, Lcom/kwad/framework/filedownloader/download/c;->pause()V

    goto :goto_5

    .line 58
    :cond_9
    invoke-static {v4}, Ljava/util/concurrent/Executors;->callable(Ljava/lang/Runnable;)Ljava/util/concurrent/Callable;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 59
    :cond_a
    iget-boolean v3, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->kH:Z

    if-eqz v3, :cond_b

    .line 60
    iget-object v1, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    const/4 v2, -0x2

    invoke-virtual {v1, v2}, Lcom/kwad/framework/filedownloader/d/c;->d(B)V

    return-void

    .line 61
    :cond_b
    sget-object v3, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->ahb:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v3, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->invokeAll(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v2

    .line 62
    sget-boolean v3, Lcom/kwad/framework/filedownloader/f/d;->ajb:Z

    if-eqz v3, :cond_c

    .line 63
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/concurrent/Future;

    const/4 v4, 0x3

    new-array v5, v4, [Ljava/lang/Object;

    .line 64
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v9

    invoke-interface {v3}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v6

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    aput-object v6, v5, v8

    invoke-interface {v3}, Ljava/util/concurrent/Future;->isCancelled()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    aput-object v3, v5, v7

    const-string v3, "finish sub-task for [%d] %B %B"

    .line 65
    invoke-static {v0, v3, v5}, Lcom/kwad/framework/filedownloader/f/d;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_6

    :cond_c
    return-void
.end method

.method private q(Ljava/util/List;)Lcom/kwad/framework/filedownloader/download/a;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kwad/framework/filedownloader/d/a;",
            ">;)",
            "Lcom/kwad/framework/filedownloader/download/a;"
        }
    .end annotation

    move-object/from16 v0, p0

    .line 1
    iget-object v1, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v1}, Lcom/kwad/framework/filedownloader/d/c;->wS()I

    move-result v1

    .line 2
    iget-object v2, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v2}, Lcom/kwad/framework/filedownloader/d/c;->wh()Ljava/lang/String;

    move-result-object v2

    .line 3
    iget-object v3, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v3}, Lcom/kwad/framework/filedownloader/d/c;->getTargetFilePath()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-le v1, v5, :cond_0

    const/4 v6, 0x1

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    :goto_0
    const-wide/16 v7, 0x0

    if-eqz v6, :cond_1

    .line 4
    iget-boolean v9, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agX:Z

    if-eqz v9, :cond_4

    .line 5
    :cond_1
    iget-object v9, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    .line 6
    invoke-virtual {v9}, Lcom/kwad/framework/filedownloader/d/c;->getId()I

    move-result v9

    iget-object v10, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-static {v9, v10}, Lcom/kwad/framework/filedownloader/f/f;->b(ILcom/kwad/framework/filedownloader/d/c;)Z

    move-result v9

    if-eqz v9, :cond_4

    .line 7
    iget-boolean v9, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agX:Z

    if-nez v9, :cond_2

    .line 8
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->length()J

    move-result-wide v9

    :goto_1
    move-wide v14, v9

    goto :goto_2

    :cond_2
    if-eqz v6, :cond_3

    .line 9
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v6

    if-ne v1, v6, :cond_4

    .line 10
    invoke-static/range {p1 .. p1}, Lcom/kwad/framework/filedownloader/d/a;->r(Ljava/util/List;)J

    move-result-wide v9

    goto :goto_1

    .line 11
    :cond_3
    iget-object v1, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v1}, Lcom/kwad/framework/filedownloader/d/c;->wP()J

    move-result-wide v9

    goto :goto_1

    :cond_4
    move-wide v14, v7

    .line 12
    :goto_2
    iget-object v1, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v1, v14, v15}, Lcom/kwad/framework/filedownloader/d/c;->S(J)V

    cmp-long v1, v14, v7

    if-lez v1, :cond_5

    const/4 v4, 0x1

    .line 13
    :cond_5
    iput-boolean v4, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->ahc:Z

    if-nez v4, :cond_6

    .line 14
    iget-object v1, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agL:Lcom/kwad/framework/filedownloader/b/a;

    iget-object v4, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v4}, Lcom/kwad/framework/filedownloader/d/c;->getId()I

    move-result v4

    invoke-interface {v1, v4}, Lcom/kwad/framework/filedownloader/b/a;->bm(I)V

    .line 15
    invoke-static {v3, v2}, Lcom/kwad/framework/filedownloader/f/f;->B(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    :cond_6
    new-instance v1, Lcom/kwad/framework/filedownloader/download/a;

    const-wide/16 v12, 0x0

    const-wide/16 v16, 0x0

    iget-object v2, v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v2}, Lcom/kwad/framework/filedownloader/d/c;->getTotal()J

    move-result-wide v2

    sub-long v18, v2, v14

    move-object v11, v1

    invoke-direct/range {v11 .. v19}, Lcom/kwad/framework/filedownloader/download/a;-><init>(JJJJ)V

    return-object v1
.end method

.method private wd()Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->ahc:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v0}, Lcom/kwad/framework/filedownloader/d/c;->wS()I

    move-result v0

    if-gt v0, v2, :cond_0

    return v1

    .line 2
    :cond_0
    iget-boolean v0, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->ahd:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agX:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->ahe:Z

    if-nez v0, :cond_1

    return v2

    :cond_1
    return v1
.end method

.method private wf()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agT:Z

    if-eqz v0, :cond_1

    const-string v0, "android.permission.ACCESS_NETWORK_STATE"

    .line 2
    invoke-static {v0}, Lcom/kwad/framework/filedownloader/f/f;->bB(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    new-instance v1, Lcom/kwad/framework/filedownloader/exception/FileDownloadGiveUpRetryException;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    .line 4
    invoke-virtual {v4}, Lcom/kwad/framework/filedownloader/d/c;->getId()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object v0, v2, v3

    const-string v0, "Task[%d] can\'t start the download runnable, because this task require wifi, but user application nor current process has %s, so we can\'t check whether the network type connection."

    .line 5
    invoke-static {v0, v2}, Lcom/kwad/framework/filedownloader/f/f;->b(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/kwad/framework/filedownloader/exception/FileDownloadGiveUpRetryException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 6
    :cond_1
    :goto_0
    iget-boolean v0, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agT:Z

    if-eqz v0, :cond_3

    invoke-static {}, Lcom/kwad/framework/filedownloader/f/f;->xw()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    .line 7
    :cond_2
    new-instance v0, Lcom/kwad/framework/filedownloader/exception/FileDownloadNetworkPolicyException;

    invoke-direct {v0}, Lcom/kwad/framework/filedownloader/exception/FileDownloadNetworkPolicyException;-><init>()V

    throw v0

    :cond_3
    :goto_1
    return-void
.end method

.method private wg()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v0}, Lcom/kwad/framework/filedownloader/d/c;->getId()I

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v1}, Lcom/kwad/framework/filedownloader/d/c;->uv()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 3
    iget-object v1, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v1}, Lcom/kwad/framework/filedownloader/d/c;->getTargetFilePath()Ljava/lang/String;

    move-result-object v5

    .line 4
    iget-object v1, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v1}, Lcom/kwad/framework/filedownloader/d/c;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v5}, Lcom/kwad/framework/filedownloader/f/f;->A(Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    .line 5
    iget-boolean v2, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agS:Z

    const/4 v3, 0x0

    invoke-static {v0, v5, v2, v3}, Lcom/kwad/framework/filedownloader/f/c;->a(ILjava/lang/String;ZZ)Z

    move-result v2

    if-nez v2, :cond_4

    .line 6
    iget-object v2, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agL:Lcom/kwad/framework/filedownloader/b/a;

    invoke-interface {v2, v1}, Lcom/kwad/framework/filedownloader/b/a;->bk(I)Lcom/kwad/framework/filedownloader/d/c;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 7
    iget-object v4, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agU:Lcom/kwad/framework/filedownloader/y;

    invoke-static {v0, v2, v4, v3}, Lcom/kwad/framework/filedownloader/f/c;->a(ILcom/kwad/framework/filedownloader/d/c;Lcom/kwad/framework/filedownloader/y;Z)Z

    move-result v3

    if-nez v3, :cond_1

    .line 8
    iget-object v3, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agL:Lcom/kwad/framework/filedownloader/b/a;

    .line 9
    invoke-interface {v3, v1}, Lcom/kwad/framework/filedownloader/b/a;->bl(I)Ljava/util/List;

    move-result-object v3

    .line 10
    iget-object v4, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agL:Lcom/kwad/framework/filedownloader/b/a;

    invoke-interface {v4, v1}, Lcom/kwad/framework/filedownloader/b/a;->bn(I)Z

    .line 11
    iget-object v4, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agL:Lcom/kwad/framework/filedownloader/b/a;

    invoke-interface {v4, v1}, Lcom/kwad/framework/filedownloader/b/a;->bm(I)V

    .line 12
    iget-object v4, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v4}, Lcom/kwad/framework/filedownloader/d/c;->getTargetFilePath()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/kwad/framework/filedownloader/f/f;->bF(Ljava/lang/String;)V

    .line 13
    invoke-static {v1, v2}, Lcom/kwad/framework/filedownloader/f/f;->b(ILcom/kwad/framework/filedownloader/d/c;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 14
    iget-object v1, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v2}, Lcom/kwad/framework/filedownloader/d/c;->wP()J

    move-result-wide v4

    invoke-virtual {v1, v4, v5}, Lcom/kwad/framework/filedownloader/d/c;->S(J)V

    .line 15
    iget-object v1, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v2}, Lcom/kwad/framework/filedownloader/d/c;->getTotal()J

    move-result-wide v4

    invoke-virtual {v1, v4, v5}, Lcom/kwad/framework/filedownloader/d/c;->U(J)V

    .line 16
    iget-object v1, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v2}, Lcom/kwad/framework/filedownloader/d/c;->wQ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/kwad/framework/filedownloader/d/c;->bq(Ljava/lang/String;)V

    .line 17
    iget-object v1, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v2}, Lcom/kwad/framework/filedownloader/d/c;->wS()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/kwad/framework/filedownloader/d/c;->bD(I)V

    .line 18
    iget-object v1, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agL:Lcom/kwad/framework/filedownloader/b/a;

    iget-object v2, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-interface {v1, v2}, Lcom/kwad/framework/filedownloader/b/a;->b(Lcom/kwad/framework/filedownloader/d/c;)V

    if-eqz v3, :cond_0

    .line 19
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/kwad/framework/filedownloader/d/a;

    .line 20
    invoke-virtual {v2, v0}, Lcom/kwad/framework/filedownloader/d/a;->setId(I)V

    .line 21
    iget-object v3, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agL:Lcom/kwad/framework/filedownloader/b/a;

    invoke-interface {v3, v2}, Lcom/kwad/framework/filedownloader/b/a;->a(Lcom/kwad/framework/filedownloader/d/a;)V

    goto :goto_0

    .line 22
    :cond_0
    new-instance v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable$RetryDirectly;

    invoke-direct {v0, p0}, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable$RetryDirectly;-><init>(Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;)V

    throw v0

    .line 23
    :cond_1
    iget-object v1, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agL:Lcom/kwad/framework/filedownloader/b/a;

    invoke-interface {v1, v0}, Lcom/kwad/framework/filedownloader/b/a;->bn(I)Z

    .line 24
    iget-object v1, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agL:Lcom/kwad/framework/filedownloader/b/a;

    invoke-interface {v1, v0}, Lcom/kwad/framework/filedownloader/b/a;->bm(I)V

    .line 25
    new-instance v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable$DiscardSafely;

    invoke-direct {v0, p0}, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable$DiscardSafely;-><init>(Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;)V

    throw v0

    .line 26
    :cond_2
    iget-object v1, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v1}, Lcom/kwad/framework/filedownloader/d/c;->wP()J

    move-result-wide v2

    iget-object v1, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    .line 27
    invoke-virtual {v1}, Lcom/kwad/framework/filedownloader/d/c;->wh()Ljava/lang/String;

    move-result-object v4

    iget-object v6, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agU:Lcom/kwad/framework/filedownloader/y;

    move v1, v0

    .line 28
    invoke-static/range {v1 .. v6}, Lcom/kwad/framework/filedownloader/f/c;->a(IJLjava/lang/String;Ljava/lang/String;Lcom/kwad/framework/filedownloader/y;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_1

    .line 29
    :cond_3
    iget-object v1, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agL:Lcom/kwad/framework/filedownloader/b/a;

    invoke-interface {v1, v0}, Lcom/kwad/framework/filedownloader/b/a;->bn(I)Z

    .line 30
    iget-object v1, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agL:Lcom/kwad/framework/filedownloader/b/a;

    invoke-interface {v1, v0}, Lcom/kwad/framework/filedownloader/b/a;->bm(I)V

    .line 31
    new-instance v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable$DiscardSafely;

    invoke-direct {v0, p0}, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable$DiscardSafely;-><init>(Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;)V

    throw v0

    .line 32
    :cond_4
    iget-object v1, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agL:Lcom/kwad/framework/filedownloader/b/a;

    invoke-interface {v1, v0}, Lcom/kwad/framework/filedownloader/b/a;->bn(I)Z

    .line 33
    iget-object v1, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agL:Lcom/kwad/framework/filedownloader/b/a;

    invoke-interface {v1, v0}, Lcom/kwad/framework/filedownloader/b/a;->bm(I)V

    .line 34
    new-instance v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable$DiscardSafely;

    invoke-direct {v0, p0}, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable$DiscardSafely;-><init>(Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;)V

    throw v0

    :cond_5
    :goto_1
    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/framework/filedownloader/download/c;JJ)V
    .locals 10

    .line 67
    iget-boolean v0, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->kH:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    .line 68
    sget-boolean p1, Lcom/kwad/framework/filedownloader/f/d;->ajb:Z

    if-eqz p1, :cond_0

    const-string p1, "the task[%d] has already been paused, so pass the completed callback"

    new-array p2, v2, [Ljava/lang/Object;

    .line 69
    iget-object p3, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    .line 70
    invoke-virtual {p3}, Lcom/kwad/framework/filedownloader/d/c;->getId()I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, p2, v1

    .line 71
    invoke-static {p0, p1, p2}, Lcom/kwad/framework/filedownloader/f/d;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void

    :cond_1
    if-nez p1, :cond_2

    const/4 v0, -0x1

    goto :goto_0

    .line 72
    :cond_2
    iget v0, p1, Lcom/kwad/framework/filedownloader/download/c;->ahv:I

    .line 73
    :goto_0
    sget-boolean v3, Lcom/kwad/framework/filedownloader/f/d;->ajb:Z

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x4

    if-eqz v3, :cond_3

    const-string v3, "the connection has been completed(%d): [%d, %d)  %d"

    new-array v7, v6, [Ljava/lang/Object;

    .line 74
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v7, v1

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    aput-object v0, v7, v2

    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    aput-object v0, v7, v5

    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v0}, Lcom/kwad/framework/filedownloader/d/c;->getTotal()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    aput-object v0, v7, v4

    .line 75
    invoke-static {p0, v3, v7}, Lcom/kwad/framework/filedownloader/f/d;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    :cond_3
    iget-boolean v0, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->aha:Z

    if-eqz v0, :cond_5

    const-wide/16 v7, 0x0

    cmp-long p1, p2, v7

    if-eqz p1, :cond_4

    .line 77
    iget-object p1, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {p1}, Lcom/kwad/framework/filedownloader/d/c;->getTotal()J

    move-result-wide v7

    cmp-long p1, p4, v7

    if-eqz p1, :cond_4

    const-string p1, "the single task not completed corrected(%d, %d != %d) for task(%d)"

    new-array v0, v6, [Ljava/lang/Object;

    .line 78
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    aput-object p2, v0, v1

    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    aput-object p2, v0, v2

    iget-object p2, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {p2}, Lcom/kwad/framework/filedownloader/d/c;->getTotal()J

    move-result-wide p2

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    aput-object p2, v0, v5

    iget-object p2, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {p2}, Lcom/kwad/framework/filedownloader/d/c;->getId()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v0, v4

    .line 79
    invoke-static {p0, p1, v0}, Lcom/kwad/framework/filedownloader/f/d;->a(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_4
    return-void

    .line 80
    :cond_5
    iget-object p2, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agY:Ljava/util/ArrayList;

    monitor-enter p2

    .line 81
    :try_start_0
    iget-object p3, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agY:Ljava/util/ArrayList;

    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 82
    monitor-exit p2

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final a(Ljava/lang/Exception;J)V
    .locals 4

    .line 92
    iget-boolean v0, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->kH:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    .line 93
    sget-boolean p1, Lcom/kwad/framework/filedownloader/f/d;->ajb:Z

    if-eqz p1, :cond_0

    new-array p1, v2, [Ljava/lang/Object;

    .line 94
    iget-object p2, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    .line 95
    invoke-virtual {p2}, Lcom/kwad/framework/filedownloader/d/c;->getId()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, p1, v1

    const-string p2, "the task[%d] has already been paused, so pass the retry callback"

    .line 96
    invoke-static {p0, p2, p1}, Lcom/kwad/framework/filedownloader/f/d;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void

    .line 97
    :cond_1
    iget v0, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agW:I

    add-int/lit8 v3, v0, -0x1

    iput v3, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agW:I

    if-gez v0, :cond_2

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    .line 98
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v0, v1

    iget-object v1, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v1}, Lcom/kwad/framework/filedownloader/d/c;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v2

    const-string v1, "valid retry times is less than 0(%d) for download task(%d)"

    .line 99
    invoke-static {p0, v1, v0}, Lcom/kwad/framework/filedownloader/f/d;->a(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    :cond_2
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agO:Lcom/kwad/framework/filedownloader/download/d;

    iget v1, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agW:I

    invoke-virtual {v0, p1, v1, p2, p3}, Lcom/kwad/framework/filedownloader/download/d;->a(Ljava/lang/Exception;IJ)V

    return-void
.end method

.method public final a(Ljava/lang/Exception;)Z
    .locals 3

    .line 83
    instance-of v0, p1, Lcom/kwad/framework/filedownloader/exception/FileDownloadHttpException;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 84
    move-object v0, p1

    check-cast v0, Lcom/kwad/framework/filedownloader/exception/FileDownloadHttpException;

    .line 85
    invoke-virtual {v0}, Lcom/kwad/framework/filedownloader/exception/FileDownloadHttpException;->getCode()I

    move-result v0

    .line 86
    iget-boolean v2, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->aha:Z

    if-eqz v2, :cond_0

    const/16 v2, 0x1a0

    if-ne v0, v2, :cond_0

    .line 87
    iget-boolean v0, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agV:Z

    if-nez v0, :cond_0

    .line 88
    iget-object p1, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    .line 89
    invoke-virtual {p1}, Lcom/kwad/framework/filedownloader/d/c;->getTargetFilePath()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v0}, Lcom/kwad/framework/filedownloader/d/c;->wh()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/kwad/framework/filedownloader/f/f;->B(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    iput-boolean v1, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agV:Z

    return v1

    .line 91
    :cond_0
    iget v0, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agW:I

    if-lez v0, :cond_1

    instance-of p1, p1, Lcom/kwad/framework/filedownloader/exception/FileDownloadGiveUpRetryException;

    if-nez p1, :cond_1

    return v1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final b(Ljava/lang/Exception;)V
    .locals 2

    const/4 v0, 0x1

    .line 66
    iput-boolean v0, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->ahg:Z

    .line 67
    iput-object p1, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->ahh:Ljava/lang/Exception;

    .line 68
    iget-boolean p1, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->kH:Z

    if-eqz p1, :cond_1

    .line 69
    sget-boolean p1, Lcom/kwad/framework/filedownloader/f/d;->ajb:Z

    if-eqz p1, :cond_0

    new-array p1, v0, [Ljava/lang/Object;

    const/4 v0, 0x0

    .line 70
    iget-object v1, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    .line 71
    invoke-virtual {v1}, Lcom/kwad/framework/filedownloader/d/c;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, p1, v0

    const-string v0, "the task[%d] has already been paused, so pass the error callback"

    .line 72
    invoke-static {p0, v0, p1}, Lcom/kwad/framework/filedownloader/f/d;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void

    .line 73
    :cond_1
    iget-object p1, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agY:Ljava/util/ArrayList;

    .line 74
    invoke-virtual {p1}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    .line 75
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/framework/filedownloader/download/c;

    if-eqz v0, :cond_2

    .line 76
    invoke-virtual {v0}, Lcom/kwad/framework/filedownloader/download/c;->vo()V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final getId()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v0}, Lcom/kwad/framework/filedownloader/d/c;->getId()I

    move-result v0

    return v0
.end method

.method public final isAlive()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->ahf:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agO:Lcom/kwad/framework/filedownloader/download/d;

    invoke-virtual {v0}, Lcom/kwad/framework/filedownloader/download/d;->isAlive()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final onProgress(J)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->kH:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agO:Lcom/kwad/framework/filedownloader/download/d;

    invoke-virtual {v0, p1, p2}, Lcom/kwad/framework/filedownloader/download/d;->onProgress(J)V

    return-void
.end method

.method public final pause()V
    .locals 2

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->kH:Z

    .line 2
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agZ:Lcom/kwad/framework/filedownloader/download/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/kwad/framework/filedownloader/download/e;->pause()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agY:Ljava/util/ArrayList;

    .line 4
    invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/framework/filedownloader/download/c;

    if-eqz v1, :cond_1

    .line 6
    invoke-virtual {v1}, Lcom/kwad/framework/filedownloader/download/c;->pause()V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final run()V
    .locals 19

    move-object/from16 v1, p0

    const/16 v2, 0xa

    const/4 v3, 0x0

    .line 1
    :try_start_0
    invoke-static {v2}, Landroid/os/Process;->setThreadPriority(I)V

    .line 2
    iget-object v2, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v2}, Lcom/kwad/framework/filedownloader/d/c;->uz()B

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const-string v4, "High concurrent cause, start runnable but already paused %d"

    const/4 v5, -0x2

    const/4 v6, 0x1

    if-eq v2, v6, :cond_4

    .line 3
    :try_start_1
    iget-object v2, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v2}, Lcom/kwad/framework/filedownloader/d/c;->uz()B

    move-result v2

    if-ne v2, v5, :cond_0

    .line 4
    sget-boolean v2, Lcom/kwad/framework/filedownloader/f/d;->ajb:Z

    if-eqz v2, :cond_1

    new-array v2, v6, [Ljava/lang/Object;

    .line 5
    iget-object v5, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    .line 6
    invoke-virtual {v5}, Lcom/kwad/framework/filedownloader/d/c;->getId()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v2, v3

    .line 7
    invoke-static {v1, v4, v2}, Lcom/kwad/framework/filedownloader/f/d;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 8
    :cond_0
    new-instance v2, Ljava/lang/RuntimeException;

    const-string v4, "Task[%d] can\'t start the download runnable, because its status is %d not %d"

    const/4 v5, 0x3

    new-array v5, v5, [Ljava/lang/Object;

    iget-object v7, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    .line 9
    invoke-virtual {v7}, Lcom/kwad/framework/filedownloader/d/c;->getId()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v5, v3

    iget-object v7, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v7}, Lcom/kwad/framework/filedownloader/d/c;->uz()B

    move-result v7

    invoke-static {v7}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v7

    aput-object v7, v5, v6

    const/4 v7, 0x2

    invoke-static {v6}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v6

    aput-object v6, v5, v7

    .line 10
    invoke-static {v4, v5}, Lcom/kwad/framework/filedownloader/f/f;->b(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 11
    invoke-virtual {v1, v2}, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->b(Ljava/lang/Exception;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 12
    :cond_1
    :goto_0
    iget-object v2, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agO:Lcom/kwad/framework/filedownloader/download/d;

    invoke-virtual {v2}, Lcom/kwad/framework/filedownloader/download/d;->wk()V

    .line 13
    iget-boolean v2, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->kH:Z

    if-eqz v2, :cond_2

    .line 14
    :goto_1
    iget-object v2, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agO:Lcom/kwad/framework/filedownloader/download/d;

    invoke-virtual {v2}, Lcom/kwad/framework/filedownloader/download/d;->wo()V

    goto :goto_4

    .line 15
    :cond_2
    iget-boolean v2, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->ahg:Z

    if-eqz v2, :cond_3

    .line 16
    :goto_2
    iget-object v2, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agO:Lcom/kwad/framework/filedownloader/download/d;

    iget-object v4, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->ahh:Ljava/lang/Exception;

    invoke-virtual {v2, v4}, Lcom/kwad/framework/filedownloader/download/d;->c(Ljava/lang/Exception;)V

    goto :goto_4

    .line 17
    :cond_3
    :try_start_2
    iget-object v2, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agO:Lcom/kwad/framework/filedownloader/download/d;

    invoke-virtual {v2}, Lcom/kwad/framework/filedownloader/download/d;->wp()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_4

    :catch_0
    move-exception v0

    move-object v2, v0

    .line 18
    :goto_3
    iget-object v4, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agO:Lcom/kwad/framework/filedownloader/download/d;

    invoke-virtual {v4, v2}, Lcom/kwad/framework/filedownloader/download/d;->c(Ljava/lang/Exception;)V

    .line 19
    :goto_4
    iget-object v2, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->ahf:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void

    .line 20
    :cond_4
    :try_start_3
    iget-boolean v2, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->kH:Z

    if-nez v2, :cond_5

    .line 21
    iget-object v2, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agO:Lcom/kwad/framework/filedownloader/download/d;

    invoke-virtual {v2}, Lcom/kwad/framework/filedownloader/download/d;->wm()V

    .line 22
    :cond_5
    :goto_5
    iget-boolean v2, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->kH:Z

    if-eqz v2, :cond_9

    .line 23
    sget-boolean v2, Lcom/kwad/framework/filedownloader/f/d;->ajb:Z

    if-eqz v2, :cond_6

    new-array v2, v6, [Ljava/lang/Object;

    .line 24
    iget-object v5, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    .line 25
    invoke-virtual {v5}, Lcom/kwad/framework/filedownloader/d/c;->getId()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v2, v3

    .line 26
    invoke-static {v1, v4, v2}, Lcom/kwad/framework/filedownloader/f/d;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 27
    :cond_6
    iget-object v2, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agO:Lcom/kwad/framework/filedownloader/download/d;

    invoke-virtual {v2}, Lcom/kwad/framework/filedownloader/download/d;->wk()V

    .line 28
    iget-boolean v2, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->kH:Z

    if-eqz v2, :cond_7

    goto :goto_1

    .line 29
    :cond_7
    iget-boolean v2, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->ahg:Z

    if-eqz v2, :cond_8

    goto :goto_2

    .line 30
    :cond_8
    :try_start_4
    iget-object v2, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agO:Lcom/kwad/framework/filedownloader/download/d;

    invoke-virtual {v2}, Lcom/kwad/framework/filedownloader/download/d;->wp()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_4

    :catch_1
    move-exception v0

    move-object v2, v0

    goto :goto_3

    .line 31
    :cond_9
    :try_start_5
    iget-object v2, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agL:Lcom/kwad/framework/filedownloader/b/a;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    if-eqz v2, :cond_1e

    const/4 v2, 0x0

    .line 32
    :try_start_6
    invoke-direct/range {p0 .. p0}, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->wf()V

    .line 33
    iget-object v7, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agL:Lcom/kwad/framework/filedownloader/b/a;

    iget-object v8, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v8}, Lcom/kwad/framework/filedownloader/d/c;->getId()I

    move-result v8

    invoke-interface {v7, v8}, Lcom/kwad/framework/filedownloader/b/a;->bl(I)Ljava/util/List;

    move-result-object v7

    .line 34
    invoke-direct {v1, v7}, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->q(Ljava/util/List;)Lcom/kwad/framework/filedownloader/download/a;

    move-result-object v8

    .line 35
    new-instance v9, Lcom/kwad/framework/filedownloader/download/ConnectTask$a;

    invoke-direct {v9}, Lcom/kwad/framework/filedownloader/download/ConnectTask$a;-><init>()V

    .line 36
    iget-object v10, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v10}, Lcom/kwad/framework/filedownloader/d/c;->getId()I

    move-result v10

    invoke-virtual {v9, v10}, Lcom/kwad/framework/filedownloader/download/ConnectTask$a;->bs(I)Lcom/kwad/framework/filedownloader/download/ConnectTask$a;

    move-result-object v9

    iget-object v10, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    .line 37
    invoke-virtual {v10}, Lcom/kwad/framework/filedownloader/d/c;->getUrl()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Lcom/kwad/framework/filedownloader/download/ConnectTask$a;->bi(Ljava/lang/String;)Lcom/kwad/framework/filedownloader/download/ConnectTask$a;

    move-result-object v9

    iget-object v10, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    .line 38
    invoke-virtual {v10}, Lcom/kwad/framework/filedownloader/d/c;->wQ()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Lcom/kwad/framework/filedownloader/download/ConnectTask$a;->bj(Ljava/lang/String;)Lcom/kwad/framework/filedownloader/download/ConnectTask$a;

    move-result-object v9

    iget-object v10, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agR:Lcom/kwad/framework/filedownloader/d/b;

    .line 39
    invoke-virtual {v9, v10}, Lcom/kwad/framework/filedownloader/download/ConnectTask$a;->a(Lcom/kwad/framework/filedownloader/d/b;)Lcom/kwad/framework/filedownloader/download/ConnectTask$a;

    move-result-object v9

    .line 40
    invoke-virtual {v9, v8}, Lcom/kwad/framework/filedownloader/download/ConnectTask$a;->a(Lcom/kwad/framework/filedownloader/download/a;)Lcom/kwad/framework/filedownloader/download/ConnectTask$a;

    move-result-object v8

    .line 41
    invoke-virtual {v8}, Lcom/kwad/framework/filedownloader/download/ConnectTask$a;->vR()Lcom/kwad/framework/filedownloader/download/ConnectTask;

    move-result-object v8

    .line 42
    invoke-virtual {v8}, Lcom/kwad/framework/filedownloader/download/ConnectTask;->vN()Lcom/kwad/framework/filedownloader/a/b;

    move-result-object v9
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_16
    .catch Ljava/lang/IllegalAccessException; {:try_start_6 .. :try_end_6} :catch_15
    .catch Ljava/lang/InterruptedException; {:try_start_6 .. :try_end_6} :catch_14
    .catch Ljava/lang/IllegalArgumentException; {:try_start_6 .. :try_end_6} :catch_13
    .catch Lcom/kwad/framework/filedownloader/exception/FileDownloadGiveUpRetryException; {:try_start_6 .. :try_end_6} :catch_12
    .catch Ljava/lang/NullPointerException; {:try_start_6 .. :try_end_6} :catch_11
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_6 .. :try_end_6} :catch_10
    .catch Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable$DiscardSafely; {:try_start_6 .. :try_end_6} :catch_4
    .catch Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable$RetryDirectly; {:try_start_6 .. :try_end_6} :catch_e
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 43
    :try_start_7
    invoke-virtual {v8}, Lcom/kwad/framework/filedownloader/download/ConnectTask;->getRequestHeader()Ljava/util/Map;

    move-result-object v10

    invoke-direct {v1, v10, v8, v9}, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->a(Ljava/util/Map;Lcom/kwad/framework/filedownloader/download/ConnectTask;Lcom/kwad/framework/filedownloader/a/b;)V

    .line 44
    iget-boolean v10, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->kH:Z

    if-eqz v10, :cond_d

    .line 45
    iget-object v2, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v2, v5}, Lcom/kwad/framework/filedownloader/d/c;->d(B)V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_d
    .catch Ljava/lang/IllegalAccessException; {:try_start_7 .. :try_end_7} :catch_c
    .catch Ljava/lang/InterruptedException; {:try_start_7 .. :try_end_7} :catch_b
    .catch Ljava/lang/IllegalArgumentException; {:try_start_7 .. :try_end_7} :catch_a
    .catch Lcom/kwad/framework/filedownloader/exception/FileDownloadGiveUpRetryException; {:try_start_7 .. :try_end_7} :catch_9
    .catch Ljava/lang/NullPointerException; {:try_start_7 .. :try_end_7} :catch_8
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_7 .. :try_end_7} :catch_7
    .catch Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable$DiscardSafely; {:try_start_7 .. :try_end_7} :catch_6
    .catch Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable$RetryDirectly; {:try_start_7 .. :try_end_7} :catch_5
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    if-eqz v9, :cond_a

    .line 46
    :try_start_8
    invoke-interface {v9}, Lcom/kwad/framework/filedownloader/a/b;->vI()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 47
    :cond_a
    iget-object v2, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agO:Lcom/kwad/framework/filedownloader/download/d;

    invoke-virtual {v2}, Lcom/kwad/framework/filedownloader/download/d;->wk()V

    .line 48
    iget-boolean v2, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->kH:Z

    if-eqz v2, :cond_b

    goto/16 :goto_1

    .line 49
    :cond_b
    iget-boolean v2, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->ahg:Z

    if-eqz v2, :cond_c

    goto/16 :goto_2

    .line 50
    :cond_c
    :try_start_9
    iget-object v2, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agO:Lcom/kwad/framework/filedownloader/download/d;

    invoke-virtual {v2}, Lcom/kwad/framework/filedownloader/download/d;->wp()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_2

    goto/16 :goto_4

    :catch_2
    move-exception v0

    move-object v2, v0

    goto/16 :goto_3

    .line 51
    :cond_d
    :try_start_a
    invoke-direct/range {p0 .. p0}, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->wg()V

    .line 52
    iget-object v10, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v10}, Lcom/kwad/framework/filedownloader/d/c;->getTotal()J

    move-result-wide v14

    .line 53
    iget-object v10, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v10}, Lcom/kwad/framework/filedownloader/d/c;->wh()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v1, v14, v15, v10}, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->a(JLjava/lang/String;)V

    .line 54
    invoke-direct/range {p0 .. p0}, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->wd()Z

    move-result v10

    if-eqz v10, :cond_f

    .line 55
    iget-boolean v10, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->ahc:Z

    if-eqz v10, :cond_e

    .line 56
    iget-object v10, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v10}, Lcom/kwad/framework/filedownloader/d/c;->wS()I

    move-result v10

    move-wide/from16 v17, v14

    goto :goto_6

    .line 57
    :cond_e
    invoke-static {}, Lcom/kwad/framework/filedownloader/download/b;->vS()Lcom/kwad/framework/filedownloader/download/b;

    move-result-object v11

    iget-object v10, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    .line 58
    invoke-virtual {v10}, Lcom/kwad/framework/filedownloader/d/c;->getId()I

    move-result v12

    iget-object v10, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v10}, Lcom/kwad/framework/filedownloader/d/c;->getUrl()Ljava/lang/String;

    move-result-object v13

    iget-object v10, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    .line 59
    invoke-virtual {v10}, Lcom/kwad/framework/filedownloader/d/c;->getPath()Ljava/lang/String;

    move-result-object v10

    move-wide/from16 v17, v14

    move-object v14, v10

    move-wide/from16 v15, v17

    .line 60
    invoke-virtual/range {v11 .. v16}, Lcom/kwad/framework/filedownloader/download/b;->a(ILjava/lang/String;Ljava/lang/String;J)I

    move-result v10

    goto :goto_6

    :cond_f
    move-wide/from16 v17, v14

    const/4 v10, 0x1

    :goto_6
    if-lez v10, :cond_18

    .line 61
    iget-boolean v11, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->kH:Z

    if-eqz v11, :cond_13

    .line 62
    iget-object v2, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v2, v5}, Lcom/kwad/framework/filedownloader/d/c;->d(B)V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_d
    .catch Ljava/lang/IllegalAccessException; {:try_start_a .. :try_end_a} :catch_c
    .catch Ljava/lang/InterruptedException; {:try_start_a .. :try_end_a} :catch_b
    .catch Ljava/lang/IllegalArgumentException; {:try_start_a .. :try_end_a} :catch_a
    .catch Lcom/kwad/framework/filedownloader/exception/FileDownloadGiveUpRetryException; {:try_start_a .. :try_end_a} :catch_9
    .catch Ljava/lang/NullPointerException; {:try_start_a .. :try_end_a} :catch_8
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_a .. :try_end_a} :catch_7
    .catch Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable$DiscardSafely; {:try_start_a .. :try_end_a} :catch_6
    .catch Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable$RetryDirectly; {:try_start_a .. :try_end_a} :catch_5
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    if-eqz v9, :cond_10

    .line 63
    :try_start_b
    invoke-interface {v9}, Lcom/kwad/framework/filedownloader/a/b;->vI()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 64
    :cond_10
    iget-object v2, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agO:Lcom/kwad/framework/filedownloader/download/d;

    invoke-virtual {v2}, Lcom/kwad/framework/filedownloader/download/d;->wk()V

    .line 65
    iget-boolean v2, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->kH:Z

    if-eqz v2, :cond_11

    goto/16 :goto_1

    .line 66
    :cond_11
    iget-boolean v2, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->ahg:Z

    if-eqz v2, :cond_12

    goto/16 :goto_2

    .line 67
    :cond_12
    :try_start_c
    iget-object v2, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agO:Lcom/kwad/framework/filedownloader/download/d;

    invoke-virtual {v2}, Lcom/kwad/framework/filedownloader/download/d;->wp()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_3

    goto/16 :goto_4

    :catch_3
    move-exception v0

    move-object v2, v0

    goto/16 :goto_3

    :cond_13
    if-ne v10, v6, :cond_14

    const/4 v11, 0x1

    goto :goto_7

    :cond_14
    const/4 v11, 0x0

    .line 68
    :goto_7
    :try_start_d
    iput-boolean v11, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->aha:Z

    if-eqz v11, :cond_15

    .line 69
    invoke-virtual {v8}, Lcom/kwad/framework/filedownloader/download/ConnectTask;->vQ()Lcom/kwad/framework/filedownloader/download/a;

    move-result-object v2

    invoke-direct {v1, v2, v9}, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->a(Lcom/kwad/framework/filedownloader/download/a;Lcom/kwad/framework/filedownloader/a/b;)V

    goto :goto_a

    :cond_15
    if-eqz v9, :cond_16

    .line 70
    invoke-interface {v9}, Lcom/kwad/framework/filedownloader/a/b;->vI()V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_d
    .catch Ljava/lang/IllegalAccessException; {:try_start_d .. :try_end_d} :catch_c
    .catch Ljava/lang/InterruptedException; {:try_start_d .. :try_end_d} :catch_b
    .catch Ljava/lang/IllegalArgumentException; {:try_start_d .. :try_end_d} :catch_a
    .catch Lcom/kwad/framework/filedownloader/exception/FileDownloadGiveUpRetryException; {:try_start_d .. :try_end_d} :catch_9
    .catch Ljava/lang/NullPointerException; {:try_start_d .. :try_end_d} :catch_8
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_d .. :try_end_d} :catch_7
    .catch Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable$DiscardSafely; {:try_start_d .. :try_end_d} :catch_6
    .catch Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable$RetryDirectly; {:try_start_d .. :try_end_d} :catch_5
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    goto :goto_8

    :cond_16
    move-object v2, v9

    .line 71
    :goto_8
    :try_start_e
    iget-object v8, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agO:Lcom/kwad/framework/filedownloader/download/d;

    invoke-virtual {v8}, Lcom/kwad/framework/filedownloader/download/d;->wn()V

    .line 72
    iget-boolean v8, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->ahc:Z

    if-eqz v8, :cond_17

    .line 73
    invoke-direct {v1, v10, v7}, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->a(ILjava/util/List;)V

    goto :goto_9

    :cond_17
    move-wide/from16 v7, v17

    .line 74
    invoke-direct {v1, v7, v8, v10}, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->b(JI)V
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_16
    .catch Ljava/lang/IllegalAccessException; {:try_start_e .. :try_end_e} :catch_15
    .catch Ljava/lang/InterruptedException; {:try_start_e .. :try_end_e} :catch_14
    .catch Ljava/lang/IllegalArgumentException; {:try_start_e .. :try_end_e} :catch_13
    .catch Lcom/kwad/framework/filedownloader/exception/FileDownloadGiveUpRetryException; {:try_start_e .. :try_end_e} :catch_12
    .catch Ljava/lang/NullPointerException; {:try_start_e .. :try_end_e} :catch_11
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_e .. :try_end_e} :catch_10
    .catch Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable$DiscardSafely; {:try_start_e .. :try_end_e} :catch_4
    .catch Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable$RetryDirectly; {:try_start_e .. :try_end_e} :catch_e
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    :goto_9
    move-object v9, v2

    :goto_a
    if-eqz v9, :cond_1e

    .line 75
    :try_start_f
    invoke-interface {v9}, Lcom/kwad/framework/filedownloader/a/b;->vI()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    goto/16 :goto_12

    :catch_4
    nop

    goto :goto_e

    .line 76
    :cond_18
    :try_start_10
    new-instance v2, Ljava/lang/IllegalAccessException;

    const-string v7, "invalid connection count %d, the connection count must be larger than 0"

    new-array v8, v6, [Ljava/lang/Object;

    aput-object v9, v8, v3

    .line 77
    invoke-static {v7, v8}, Lcom/kwad/framework/filedownloader/f/f;->b(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v2, v7}, Ljava/lang/IllegalAccessException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_d
    .catch Ljava/lang/IllegalAccessException; {:try_start_10 .. :try_end_10} :catch_c
    .catch Ljava/lang/InterruptedException; {:try_start_10 .. :try_end_10} :catch_b
    .catch Ljava/lang/IllegalArgumentException; {:try_start_10 .. :try_end_10} :catch_a
    .catch Lcom/kwad/framework/filedownloader/exception/FileDownloadGiveUpRetryException; {:try_start_10 .. :try_end_10} :catch_9
    .catch Ljava/lang/NullPointerException; {:try_start_10 .. :try_end_10} :catch_8
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_10 .. :try_end_10} :catch_7
    .catch Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable$DiscardSafely; {:try_start_10 .. :try_end_10} :catch_6
    .catch Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable$RetryDirectly; {:try_start_10 .. :try_end_10} :catch_5
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    :catchall_0
    move-exception v0

    move-object v4, v0

    move-object v2, v9

    goto/16 :goto_11

    :catch_5
    move-object v2, v9

    goto :goto_c

    :catch_6
    move-object v2, v9

    goto :goto_e

    :catch_7
    move-exception v0

    goto :goto_b

    :catch_8
    move-exception v0

    goto :goto_b

    :catch_9
    move-exception v0

    goto :goto_b

    :catch_a
    move-exception v0

    goto :goto_b

    :catch_b
    move-exception v0

    goto :goto_b

    :catch_c
    move-exception v0

    goto :goto_b

    :catch_d
    move-exception v0

    :goto_b
    move-object v7, v0

    move-object v2, v9

    goto :goto_10

    :catchall_1
    move-exception v0

    move-object v4, v0

    goto :goto_11

    .line 78
    :catch_e
    :goto_c
    :try_start_11
    iget-object v7, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    const/4 v8, 0x5

    invoke-virtual {v7, v8}, Lcom/kwad/framework/filedownloader/d/c;->d(B)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_1

    if-eqz v2, :cond_5

    .line 79
    :goto_d
    :try_start_12
    invoke-interface {v2}, Lcom/kwad/framework/filedownloader/a/b;->vI()V

    goto/16 :goto_5

    :goto_e
    if-eqz v2, :cond_19

    invoke-interface {v2}, Lcom/kwad/framework/filedownloader/a/b;->vI()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_2

    .line 80
    :cond_19
    iget-object v2, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agO:Lcom/kwad/framework/filedownloader/download/d;

    invoke-virtual {v2}, Lcom/kwad/framework/filedownloader/download/d;->wk()V

    .line 81
    iget-boolean v2, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->kH:Z

    if-eqz v2, :cond_1a

    goto/16 :goto_1

    .line 82
    :cond_1a
    iget-boolean v2, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->ahg:Z

    if-eqz v2, :cond_1b

    goto/16 :goto_2

    .line 83
    :cond_1b
    :try_start_13
    iget-object v2, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agO:Lcom/kwad/framework/filedownloader/download/d;

    invoke-virtual {v2}, Lcom/kwad/framework/filedownloader/download/d;->wp()V
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_f

    goto/16 :goto_4

    :catch_f
    move-exception v0

    move-object v2, v0

    goto/16 :goto_3

    :catch_10
    move-exception v0

    goto :goto_f

    :catch_11
    move-exception v0

    goto :goto_f

    :catch_12
    move-exception v0

    goto :goto_f

    :catch_13
    move-exception v0

    goto :goto_f

    :catch_14
    move-exception v0

    goto :goto_f

    :catch_15
    move-exception v0

    goto :goto_f

    :catch_16
    move-exception v0

    :goto_f
    move-object v7, v0

    .line 84
    :goto_10
    :try_start_14
    invoke-virtual {v1, v7}, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->a(Ljava/lang/Exception;)Z

    move-result v8

    if-eqz v8, :cond_1c

    const-wide/16 v8, 0x0

    .line 85
    invoke-virtual {v1, v7, v8, v9}, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->a(Ljava/lang/Exception;J)V

    if-eqz v2, :cond_5

    goto :goto_d

    .line 86
    :cond_1c
    invoke-virtual {v1, v7}, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->b(Ljava/lang/Exception;)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_1

    if-eqz v2, :cond_1e

    .line 87
    :try_start_15
    invoke-interface {v2}, Lcom/kwad/framework/filedownloader/a/b;->vI()V

    goto :goto_12

    :goto_11
    if-eqz v2, :cond_1d

    invoke-interface {v2}, Lcom/kwad/framework/filedownloader/a/b;->vI()V

    .line 88
    :cond_1d
    throw v4
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_2

    .line 89
    :cond_1e
    :goto_12
    iget-object v2, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agO:Lcom/kwad/framework/filedownloader/download/d;

    invoke-virtual {v2}, Lcom/kwad/framework/filedownloader/download/d;->wk()V

    .line 90
    iget-boolean v2, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->kH:Z

    if-eqz v2, :cond_1f

    goto/16 :goto_1

    .line 91
    :cond_1f
    iget-boolean v2, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->ahg:Z

    if-eqz v2, :cond_20

    goto/16 :goto_2

    .line 92
    :cond_20
    :try_start_16
    iget-object v2, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agO:Lcom/kwad/framework/filedownloader/download/d;

    invoke-virtual {v2}, Lcom/kwad/framework/filedownloader/download/d;->wp()V
    :try_end_16
    .catch Ljava/io/IOException; {:try_start_16 .. :try_end_16} :catch_17

    goto/16 :goto_4

    :catch_17
    move-exception v0

    move-object v2, v0

    goto/16 :goto_3

    :catchall_2
    move-exception v0

    move-object v2, v0

    .line 93
    iget-object v4, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agO:Lcom/kwad/framework/filedownloader/download/d;

    invoke-virtual {v4}, Lcom/kwad/framework/filedownloader/download/d;->wk()V

    .line 94
    iget-boolean v4, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->kH:Z

    if-nez v4, :cond_22

    .line 95
    iget-boolean v4, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->ahg:Z

    if-eqz v4, :cond_21

    .line 96
    iget-object v4, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agO:Lcom/kwad/framework/filedownloader/download/d;

    iget-object v5, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->ahh:Ljava/lang/Exception;

    invoke-virtual {v4, v5}, Lcom/kwad/framework/filedownloader/download/d;->c(Ljava/lang/Exception;)V

    goto :goto_13

    .line 97
    :cond_21
    :try_start_17
    iget-object v4, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agO:Lcom/kwad/framework/filedownloader/download/d;

    invoke-virtual {v4}, Lcom/kwad/framework/filedownloader/download/d;->wp()V
    :try_end_17
    .catch Ljava/io/IOException; {:try_start_17 .. :try_end_17} :catch_18

    goto :goto_13

    :catch_18
    move-exception v0

    move-object v4, v0

    .line 98
    iget-object v5, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agO:Lcom/kwad/framework/filedownloader/download/d;

    invoke-virtual {v5, v4}, Lcom/kwad/framework/filedownloader/download/d;->c(Ljava/lang/Exception;)V

    goto :goto_13

    .line 99
    :cond_22
    iget-object v4, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agO:Lcom/kwad/framework/filedownloader/download/d;

    invoke-virtual {v4}, Lcom/kwad/framework/filedownloader/download/d;->wo()V

    .line 100
    :goto_13
    iget-object v4, v1, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->ahf:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v4, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 101
    goto :goto_15

    :goto_14
    throw v2

    :goto_15
    goto :goto_14
.end method

.method public final wc()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v0}, Lcom/kwad/framework/filedownloader/d/c;->wS()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    .line 2
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agL:Lcom/kwad/framework/filedownloader/b/a;

    iget-object v1, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    .line 3
    invoke-virtual {v1}, Lcom/kwad/framework/filedownloader/d/c;->getId()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/kwad/framework/filedownloader/b/a;->bl(I)Ljava/util/List;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v1}, Lcom/kwad/framework/filedownloader/d/c;->wS()I

    move-result v1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-ne v1, v2, :cond_0

    .line 5
    iget-object v1, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-static {v0}, Lcom/kwad/framework/filedownloader/d/a;->r(Ljava/util/List;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/kwad/framework/filedownloader/d/c;->S(J)V

    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/kwad/framework/filedownloader/d/c;->S(J)V

    .line 7
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agL:Lcom/kwad/framework/filedownloader/b/a;

    iget-object v1, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v1}, Lcom/kwad/framework/filedownloader/d/c;->getId()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/kwad/framework/filedownloader/b/a;->bm(I)V

    .line 8
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agO:Lcom/kwad/framework/filedownloader/download/d;

    invoke-virtual {v0}, Lcom/kwad/framework/filedownloader/download/d;->wl()V

    return-void
.end method

.method public final we()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agL:Lcom/kwad/framework/filedownloader/b/a;

    iget-object v1, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v1}, Lcom/kwad/framework/filedownloader/d/c;->getId()I

    move-result v1

    iget-object v2, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v2}, Lcom/kwad/framework/filedownloader/d/c;->wP()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lcom/kwad/framework/filedownloader/b/a;->b(IJ)V

    return-void
.end method

.method public final wh()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;->agQ:Lcom/kwad/framework/filedownloader/d/c;

    invoke-virtual {v0}, Lcom/kwad/framework/filedownloader/d/c;->wh()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
