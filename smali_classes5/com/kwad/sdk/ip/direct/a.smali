.class public final Lcom/kwad/sdk/ip/direct/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static aJA:Lcom/kwad/sdk/ip/direct/c; = null

.field private static aJB:Landroid/os/HandlerThread; = null

.field private static aJC:Landroid/os/Handler; = null

.field private static volatile aJD:Z = false

.field private static aJE:F = 0.0f

.field private static aJF:F = 0.0f

.field private static aJG:F = 0.0f

.field private static aJH:I = 0x0

.field private static volatile aJI:Z = false

.field private static volatile aJJ:Z = false

.field private static aJK:Lcom/kwad/sdk/core/NetworkMonitor$a; = null

.field private static aJL:Ljava/lang/Runnable; = null

.field private static aJr:I = -0x1

.field private static volatile aJs:Z

.field private static aJt:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/sdk/core/response/model/HttpDnsInfo$IpInfo;",
            ">;"
        }
    .end annotation
.end field

.field private static aJu:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/sdk/core/response/model/HttpDnsInfo$IpInfo;",
            ">;"
        }
    .end annotation
.end field

.field private static aJv:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/sdk/core/response/model/HttpDnsInfo$IpInfo;",
            ">;"
        }
    .end annotation
.end field

.field private static aJw:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/sdk/ip/direct/c;",
            ">;"
        }
    .end annotation
.end field

.field private static aJx:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/sdk/ip/direct/c;",
            ">;"
        }
    .end annotation
.end field

.field private static aJy:Ljava/util/concurrent/PriorityBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/PriorityBlockingQueue<",
            "Lcom/kwad/sdk/ip/direct/c;",
            ">;"
        }
    .end annotation
.end field

.field private static aJz:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    sput-object v0, Lcom/kwad/sdk/ip/direct/a;->aJt:Ljava/util/List;

    .line 2
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    sput-object v0, Lcom/kwad/sdk/ip/direct/a;->aJu:Ljava/util/List;

    .line 3
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    sput-object v0, Lcom/kwad/sdk/ip/direct/a;->aJv:Ljava/util/List;

    .line 4
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    sput-object v0, Lcom/kwad/sdk/ip/direct/a;->aJw:Ljava/util/List;

    .line 5
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    sput-object v0, Lcom/kwad/sdk/ip/direct/a;->aJx:Ljava/util/List;

    .line 6
    new-instance v0, Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    sput-object v0, Lcom/kwad/sdk/ip/direct/a;->aJy:Ljava/util/concurrent/PriorityBlockingQueue;

    .line 7
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Lcom/kwad/sdk/ip/direct/a;->aJz:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 8
    sput-boolean v1, Lcom/kwad/sdk/ip/direct/a;->aJD:Z

    const/high16 v0, -0x40800000    # -1.0f

    .line 9
    sput v0, Lcom/kwad/sdk/ip/direct/a;->aJE:F

    .line 10
    sput v0, Lcom/kwad/sdk/ip/direct/a;->aJF:F

    .line 11
    sput v0, Lcom/kwad/sdk/ip/direct/a;->aJG:F

    .line 12
    sput v1, Lcom/kwad/sdk/ip/direct/a;->aJH:I

    .line 13
    sput-boolean v1, Lcom/kwad/sdk/ip/direct/a;->aJI:Z

    .line 14
    sput-boolean v1, Lcom/kwad/sdk/ip/direct/a;->aJJ:Z

    .line 15
    new-instance v0, Lcom/kwad/sdk/ip/direct/a$1;

    invoke-direct {v0}, Lcom/kwad/sdk/ip/direct/a$1;-><init>()V

    sput-object v0, Lcom/kwad/sdk/ip/direct/a;->aJK:Lcom/kwad/sdk/core/NetworkMonitor$a;

    .line 16
    new-instance v0, Lcom/kwad/sdk/ip/direct/a$3;

    invoke-direct {v0}, Lcom/kwad/sdk/ip/direct/a$3;-><init>()V

    sput-object v0, Lcom/kwad/sdk/ip/direct/a;->aJL:Ljava/lang/Runnable;

    return-void
.end method

.method private static G(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kwad/sdk/core/response/model/HttpDnsInfo$IpInfo;",
            ">;)V"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/kwad/sdk/ip/direct/a;->aJw:Ljava/util/List;

    invoke-static {p0, v0}, Lcom/kwad/sdk/ip/direct/a;->b(Ljava/util/List;Ljava/util/List;)V

    .line 2
    sget-object p0, Lcom/kwad/sdk/ip/direct/a;->aJw:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_1

    .line 3
    sget-object p0, Lcom/kwad/sdk/ip/direct/a;->aJw:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/sdk/ip/direct/c;

    .line 4
    invoke-virtual {v1}, Lcom/kwad/sdk/ip/direct/c;->JC()F

    move-result v1

    add-float/2addr v0, v1

    goto :goto_0

    .line 5
    :cond_0
    sget-object p0, Lcom/kwad/sdk/ip/direct/a;->aJw:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    int-to-float p0, p0

    div-float/2addr v0, p0

    sput v0, Lcom/kwad/sdk/ip/direct/a;->aJE:F

    :cond_1
    return-void
.end method

.method private static H(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kwad/sdk/core/response/model/HttpDnsInfo$IpInfo;",
            ">;)V"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/kwad/sdk/ip/direct/a;->aJx:Ljava/util/List;

    invoke-static {p0, v0}, Lcom/kwad/sdk/ip/direct/a;->b(Ljava/util/List;Ljava/util/List;)V

    .line 2
    sget-object p0, Lcom/kwad/sdk/ip/direct/a;->aJx:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    const/4 p0, 0x0

    const/4 v0, 0x0

    .line 3
    sget-object v1, Lcom/kwad/sdk/ip/direct/a;->aJx:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/kwad/sdk/ip/direct/c;

    if-eqz v2, :cond_1

    .line 4
    invoke-virtual {v2}, Lcom/kwad/sdk/ip/direct/c;->getWeight()I

    move-result v3

    add-int/2addr p0, v3

    .line 5
    invoke-virtual {v2}, Lcom/kwad/sdk/ip/direct/c;->getWeight()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v2}, Lcom/kwad/sdk/ip/direct/c;->JC()F

    move-result v2

    mul-float v3, v3, v2

    add-float/2addr v0, v3

    goto :goto_0

    :cond_2
    if-eqz p0, :cond_3

    int-to-float p0, p0

    div-float/2addr v0, p0

    .line 6
    sput v0, Lcom/kwad/sdk/ip/direct/a;->aJF:F

    :cond_3
    return-void
.end method

.method private static Jg()V
    .locals 2

    .line 1
    sget-boolean v0, Lcom/kwad/sdk/ip/direct/a;->aJD:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    sget-object v0, Lcom/kwad/sdk/ip/direct/a;->aJC:Landroid/os/Handler;

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    :cond_1
    return-void
.end method

.method public static Jh()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/ip/direct/a;->aJA:Lcom/kwad/sdk/ip/direct/c;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/sdk/ip/direct/c;->getIp()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public static Ji()F
    .locals 1

    .line 1
    sget v0, Lcom/kwad/sdk/ip/direct/a;->aJE:F

    return v0
.end method

.method public static Jj()F
    .locals 1

    .line 1
    sget v0, Lcom/kwad/sdk/ip/direct/a;->aJF:F

    return v0
.end method

.method public static Jk()F
    .locals 1

    .line 1
    sget v0, Lcom/kwad/sdk/ip/direct/a;->aJG:F

    return v0
.end method

.method private static Jl()V
    .locals 4

    .line 1
    invoke-static {}, Lcom/kwad/sdk/ip/direct/a;->Jq()V

    .line 2
    sget-object v0, Lcom/kwad/sdk/ip/direct/a;->aJt:Ljava/util/List;

    .line 3
    sget-object v1, Lcom/kwad/sdk/ip/direct/a;->aJu:Ljava/util/List;

    .line 4
    invoke-static {}, Lcom/kwad/sdk/ip/direct/a;->clear()V

    .line 5
    sget-boolean v2, Lcom/kwad/sdk/ip/direct/a;->aJD:Z

    const-string v3, "IpDirect_Helper"

    if-eqz v2, :cond_0

    const-string v0, "is picking return"

    .line 6
    invoke-static {v3, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v2, "start pick"

    .line 7
    invoke-static {v3, v2}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x1

    .line 8
    sput-boolean v2, Lcom/kwad/sdk/ip/direct/a;->aJD:Z

    .line 9
    invoke-static {v0}, Lcom/kwad/sdk/ip/direct/a;->G(Ljava/util/List;)V

    .line 10
    invoke-static {v1}, Lcom/kwad/sdk/ip/direct/a;->H(Ljava/util/List;)V

    .line 11
    sget-object v0, Lcom/kwad/sdk/ip/direct/a;->aJw:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    sget-object v0, Lcom/kwad/sdk/ip/direct/a;->aJx:Ljava/util/List;

    .line 12
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 13
    const-class v0, Lcom/kwad/sdk/service/a/h;

    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/h;

    if-nez v0, :cond_1

    .line 14
    sput-boolean v1, Lcom/kwad/sdk/ip/direct/a;->aJD:Z

    return-void

    .line 15
    :cond_1
    invoke-interface {v0}, Lcom/kwad/sdk/service/a/h;->zr()Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "isIpPreferEnable:false"

    .line 16
    invoke-static {v3, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    sput-boolean v1, Lcom/kwad/sdk/ip/direct/a;->aJD:Z

    return-void

    .line 18
    :cond_2
    invoke-static {}, Lcom/kwad/sdk/ip/direct/a;->Jo()V

    .line 19
    :cond_3
    sput-boolean v1, Lcom/kwad/sdk/ip/direct/a;->aJD:Z

    const-string v0, "end pick"

    .line 20
    invoke-static {v3, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static Jm()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/sdk/ip/direct/a;->Jn()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Lcom/kwad/sdk/ip/direct/a;->Jp()V

    :cond_0
    return-void
.end method

.method private static Jn()Z
    .locals 8

    .line 1
    sget-object v0, Lcom/kwad/sdk/ip/direct/a;->aJw:Ljava/util/List;

    .line 2
    sget-object v1, Lcom/kwad/sdk/ip/direct/a;->aJx:Ljava/util/List;

    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    const-string v3, "IpDirect_Helper"

    const/4 v4, 0x1

    if-nez v2, :cond_0

    .line 4
    new-instance v1, Ljava/util/Random;

    invoke-direct {v1}, Ljava/util/Random;-><init>()V

    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/util/Random;->nextInt(I)I

    move-result v1

    .line 6
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/ip/direct/c;

    sput-object v0, Lcom/kwad/sdk/ip/direct/a;->aJA:Lcom/kwad/sdk/ip/direct/c;

    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "set from recommend:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Lcom/kwad/sdk/ip/direct/a;->aJA:Lcom/kwad/sdk/ip/direct/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    sput v4, Lcom/kwad/sdk/ip/direct/a;->aJH:I

    return v4

    .line 9
    :cond_0
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_7

    .line 10
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 11
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v6, 0x0

    :cond_1
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/kwad/sdk/ip/direct/c;

    if-eqz v7, :cond_1

    .line 12
    invoke-virtual {v7}, Lcom/kwad/sdk/ip/direct/c;->getWeight()I

    move-result v7

    add-int/2addr v6, v7

    goto :goto_0

    :cond_2
    if-gtz v6, :cond_3

    return v2

    .line 13
    :cond_3
    invoke-virtual {v0, v6}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    const/4 v5, 0x0

    .line 14
    :goto_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_6

    .line 15
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_4

    .line 16
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/kwad/sdk/ip/direct/c;

    invoke-virtual {v6}, Lcom/kwad/sdk/ip/direct/c;->getWeight()I

    move-result v6

    sub-int/2addr v0, v6

    :cond_4
    if-gez v0, :cond_5

    move v2, v5

    goto :goto_2

    :cond_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 17
    :cond_6
    :goto_2
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/ip/direct/c;

    sput-object v0, Lcom/kwad/sdk/ip/direct/a;->aJA:Lcom/kwad/sdk/ip/direct/c;

    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "set from backUp:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Lcom/kwad/sdk/ip/direct/a;->aJA:Lcom/kwad/sdk/ip/direct/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x2

    .line 19
    sput v0, Lcom/kwad/sdk/ip/direct/a;->aJH:I

    return v4

    :cond_7
    return v2
.end method

.method private static Jo()V
    .locals 4

    .line 1
    sget-object v0, Lcom/kwad/sdk/ip/direct/a;->aJv:Ljava/util/List;

    .line 2
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/sdk/core/response/model/HttpDnsInfo$IpInfo;

    if-eqz v1, :cond_0

    .line 4
    iget-object v2, v1, Lcom/kwad/sdk/core/response/model/HttpDnsInfo$IpInfo;->ip:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 5
    iget-object v1, v1, Lcom/kwad/sdk/core/response/model/HttpDnsInfo$IpInfo;->ip:Ljava/lang/String;

    sget v2, Lcom/kwad/sdk/ip/direct/a;->aJr:I

    int-to-long v2, v2

    invoke-static {v1, v2, v3}, Lcom/kwad/sdk/ip/direct/b;->f(Ljava/lang/String;J)Lcom/kwad/sdk/ip/direct/c;

    move-result-object v1

    .line 6
    invoke-virtual {v1}, Lcom/kwad/sdk/ip/direct/c;->isSuccess()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 7
    sget-object v2, Lcom/kwad/sdk/ip/direct/a;->aJy:Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/PriorityBlockingQueue;->offer(Ljava/lang/Object;)Z

    goto :goto_0

    .line 8
    :cond_1
    sget-object v0, Lcom/kwad/sdk/ip/direct/a;->aJy:Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/PriorityBlockingQueue;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/ip/direct/c;

    if-eqz v0, :cond_2

    .line 9
    invoke-virtual {v0}, Lcom/kwad/sdk/ip/direct/c;->JC()F

    move-result v0

    sput v0, Lcom/kwad/sdk/ip/direct/a;->aJG:F

    :cond_2
    return-void
.end method

.method private static Jp()V
    .locals 3

    .line 1
    sget-object v0, Lcom/kwad/sdk/ip/direct/a;->aJy:Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/PriorityBlockingQueue;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    sget-object v0, Lcom/kwad/sdk/ip/direct/a;->aJy:Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/PriorityBlockingQueue;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/ip/direct/c;

    .line 3
    invoke-virtual {v0}, Lcom/kwad/sdk/ip/direct/c;->JC()F

    move-result v1

    sget v2, Lcom/kwad/sdk/ip/direct/a;->aJr:I

    int-to-float v2, v2

    cmpg-float v1, v1, v2

    if-gez v1, :cond_1

    .line 4
    sput-object v0, Lcom/kwad/sdk/ip/direct/a;->aJA:Lcom/kwad/sdk/ip/direct/c;

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "set from Other:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Lcom/kwad/sdk/ip/direct/a;->aJA:Lcom/kwad/sdk/ip/direct/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "IpDirect_Helper"

    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x3

    .line 6
    sput v0, Lcom/kwad/sdk/ip/direct/a;->aJH:I

    :cond_1
    return-void
.end method

.method private static Jq()V
    .locals 2

    .line 1
    sget v0, Lcom/kwad/sdk/ip/direct/a;->aJr:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 2
    const-class v0, Lcom/kwad/sdk/service/a/h;

    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/h;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0}, Lcom/kwad/sdk/service/a/h;->zs()I

    move-result v0

    sput v0, Lcom/kwad/sdk/ip/direct/a;->aJr:I

    return-void

    :cond_0
    const/16 v0, 0xc8

    .line 4
    sput v0, Lcom/kwad/sdk/ip/direct/a;->aJr:I

    :cond_1
    return-void
.end method

.method private static Jr()Z
    .locals 5

    .line 1
    sget-boolean v0, Lcom/kwad/sdk/ip/direct/a;->aJI:Z

    const/4 v1, 0x0

    const-string v2, "IpDirect_Helper"

    if-eqz v0, :cond_0

    const-string v0, "sHasNetChanged direct can not use"

    .line 2
    invoke-static {v2, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    .line 3
    :cond_0
    sget-object v0, Lcom/kwad/sdk/ip/direct/a;->aJz:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    .line 4
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "value:"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x3

    if-gt v0, v2, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    return v1
.end method

.method private static Js()V
    .locals 2

    .line 1
    sget-object v0, Lcom/kwad/sdk/ip/direct/a;->aJz:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "addFailedTimes:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Lcom/kwad/sdk/ip/direct/a;->aJz:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "IpDirect_Helper"

    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static Jt()V
    .locals 2

    .line 1
    sget-boolean v0, Lcom/kwad/sdk/ip/direct/a;->aJs:Z

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    sget-object v0, Lcom/kwad/sdk/ip/direct/a;->aJA:Lcom/kwad/sdk/ip/direct/c;

    if-eqz v0, :cond_2

    .line 3
    invoke-virtual {v0}, Lcom/kwad/sdk/ip/direct/c;->getIp()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 4
    :cond_1
    sget-object v0, Lcom/kwad/sdk/ip/direct/a;->aJC:Landroid/os/Handler;

    if-eqz v0, :cond_2

    const/4 v1, 0x2

    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    .line 6
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    :cond_2
    :goto_0
    return-void
.end method

.method public static Ju()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/sdk/ip/direct/a;->Js()V

    .line 2
    invoke-static {}, Lcom/kwad/sdk/ip/direct/a;->Jv()V

    .line 3
    invoke-static {}, Lcom/kwad/sdk/ip/direct/a;->Jw()V

    const/4 v0, 0x0

    .line 4
    sput v0, Lcom/kwad/sdk/ip/direct/a;->aJH:I

    .line 5
    invoke-static {}, Lcom/kwad/sdk/ip/direct/a;->Jm()V

    .line 6
    invoke-static {}, Lcom/kwad/sdk/ip/direct/a;->Jl()V

    return-void
.end method

.method private static Jv()V
    .locals 6

    .line 1
    sget-object v0, Lcom/kwad/sdk/ip/direct/a;->aJA:Lcom/kwad/sdk/ip/direct/c;

    if-nez v0, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/kwad/sdk/ip/direct/c;->getIp()Ljava/lang/String;

    move-result-object v0

    .line 2
    :goto_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    .line 3
    :cond_1
    sget-object v1, Lcom/kwad/sdk/ip/direct/a;->aJt:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/kwad/sdk/core/response/model/HttpDnsInfo$IpInfo;

    if-eqz v2, :cond_2

    .line 4
    iget-object v4, v2, Lcom/kwad/sdk/core/response/model/HttpDnsInfo$IpInfo;->ip:Ljava/lang/String;

    invoke-static {v0, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_1

    :cond_3
    move-object v2, v3

    :goto_1
    if-eqz v2, :cond_4

    .line 5
    sget-object v1, Lcom/kwad/sdk/ip/direct/a;->aJt:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    move-object v2, v3

    .line 6
    :cond_4
    sget-object v1, Lcom/kwad/sdk/ip/direct/a;->aJu:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/kwad/sdk/core/response/model/HttpDnsInfo$IpInfo;

    if-eqz v4, :cond_5

    .line 7
    iget-object v5, v4, Lcom/kwad/sdk/core/response/model/HttpDnsInfo$IpInfo;->ip:Ljava/lang/String;

    invoke-static {v0, v5}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_5

    move-object v2, v4

    :cond_6
    if-eqz v2, :cond_7

    .line 8
    sget-object v1, Lcom/kwad/sdk/ip/direct/a;->aJu:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_7
    move-object v3, v2

    .line 9
    :goto_2
    sget-object v1, Lcom/kwad/sdk/ip/direct/a;->aJv:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/kwad/sdk/core/response/model/HttpDnsInfo$IpInfo;

    if-eqz v2, :cond_8

    .line 10
    iget-object v4, v2, Lcom/kwad/sdk/core/response/model/HttpDnsInfo$IpInfo;->ip:Ljava/lang/String;

    invoke-static {v0, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_8

    move-object v3, v2

    :cond_9
    if-eqz v3, :cond_a

    .line 11
    sget-object v0, Lcom/kwad/sdk/ip/direct/a;->aJv:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_a
    return-void
.end method

.method private static Jw()V
    .locals 6

    .line 1
    sget-object v0, Lcom/kwad/sdk/ip/direct/a;->aJA:Lcom/kwad/sdk/ip/direct/c;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    sget-object v0, Lcom/kwad/sdk/ip/direct/a;->aJw:Ljava/util/List;

    const-string v1, "IpDirect_Helper"

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 3
    sget-object v0, Lcom/kwad/sdk/ip/direct/a;->aJw:Ljava/util/List;

    sget-object v2, Lcom/kwad/sdk/ip/direct/a;->aJA:Lcom/kwad/sdk/ip/direct/c;

    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    sget-object v0, Lcom/kwad/sdk/ip/direct/a;->aJw:Ljava/util/List;

    sget-object v2, Lcom/kwad/sdk/ip/direct/a;->aJA:Lcom/kwad/sdk/ip/direct/c;

    invoke-interface {v0, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "sRecommendEntityList remove:"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v2, Lcom/kwad/sdk/ip/direct/a;->aJA:Lcom/kwad/sdk/ip/direct/c;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    :cond_1
    sget-object v0, Lcom/kwad/sdk/ip/direct/a;->aJx:Ljava/util/List;

    const/4 v2, 0x0

    if-eqz v0, :cond_5

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 7
    sget-object v0, Lcom/kwad/sdk/ip/direct/a;->aJx:Ljava/util/List;

    sget-object v3, Lcom/kwad/sdk/ip/direct/a;->aJA:Lcom/kwad/sdk/ip/direct/c;

    invoke-interface {v0, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 8
    sget-object v0, Lcom/kwad/sdk/ip/direct/a;->aJx:Ljava/util/List;

    sget-object v3, Lcom/kwad/sdk/ip/direct/a;->aJA:Lcom/kwad/sdk/ip/direct/c;

    invoke-interface {v0, v3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "sBackUpIpEntityList remove:"

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v3, Lcom/kwad/sdk/ip/direct/a;->aJA:Lcom/kwad/sdk/ip/direct/c;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    :cond_2
    sget-object v0, Lcom/kwad/sdk/ip/direct/a;->aJx:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/kwad/sdk/ip/direct/c;

    if-eqz v3, :cond_3

    .line 11
    invoke-virtual {v3}, Lcom/kwad/sdk/ip/direct/c;->getIp()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lcom/kwad/sdk/ip/direct/a;->aJA:Lcom/kwad/sdk/ip/direct/c;

    invoke-virtual {v5}, Lcom/kwad/sdk/ip/direct/c;->getIp()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "set removeEntity:"

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Lcom/kwad/sdk/ip/direct/c;->getIp()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    move-object v3, v2

    :goto_0
    if-eqz v3, :cond_5

    .line 13
    sget-object v0, Lcom/kwad/sdk/ip/direct/a;->aJx:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "sBackUpIpEntityList remove removeEntity:"

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    :cond_5
    sget-object v0, Lcom/kwad/sdk/ip/direct/a;->aJy:Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/PriorityBlockingQueue;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/ip/direct/c;

    if-eqz v0, :cond_6

    .line 16
    sget-object v1, Lcom/kwad/sdk/ip/direct/a;->aJA:Lcom/kwad/sdk/ip/direct/c;

    if-ne v0, v1, :cond_6

    .line 17
    sget-object v0, Lcom/kwad/sdk/ip/direct/a;->aJy:Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/PriorityBlockingQueue;->poll()Ljava/lang/Object;

    .line 18
    :cond_6
    sput-object v2, Lcom/kwad/sdk/ip/direct/a;->aJA:Lcom/kwad/sdk/ip/direct/c;

    return-void
.end method

.method public static a(Lcom/kwad/sdk/core/response/model/HttpDnsInfo;)V
    .locals 4

    if-nez p0, :cond_0

    return-void

    .line 1
    :cond_0
    const-class v0, Lcom/kwad/sdk/service/a/h;

    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/h;

    const-string v1, "IpDirect_Helper"

    if-nez v0, :cond_1

    const-string p0, "sdkConfigProvider == null"

    .line 2
    invoke-static {v1, p0}, Lcom/kwad/sdk/core/e/c;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 3
    :cond_1
    invoke-interface {v0}, Lcom/kwad/sdk/service/a/h;->zq()Z

    move-result v0

    .line 4
    sput-boolean v0, Lcom/kwad/sdk/ip/direct/a;->aJs:Z

    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "isEnable:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-nez v0, :cond_2

    return-void

    .line 6
    :cond_2
    invoke-virtual {p0}, Lcom/kwad/sdk/core/response/model/HttpDnsInfo;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    iget-object v0, p0, Lcom/kwad/sdk/core/response/model/HttpDnsInfo;->recommendList:Ljava/util/List;

    sput-object v0, Lcom/kwad/sdk/ip/direct/a;->aJt:Ljava/util/List;

    .line 8
    iget-object v2, p0, Lcom/kwad/sdk/core/response/model/HttpDnsInfo;->backUpList:Ljava/util/List;

    sput-object v2, Lcom/kwad/sdk/ip/direct/a;->aJu:Ljava/util/List;

    .line 9
    iget-object p0, p0, Lcom/kwad/sdk/core/response/model/HttpDnsInfo;->otherList:Ljava/util/List;

    sput-object p0, Lcom/kwad/sdk/ip/direct/a;->aJv:Ljava/util/List;

    .line 10
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_3

    sget-object p0, Lcom/kwad/sdk/ip/direct/a;->aJu:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_3

    sget-object p0, Lcom/kwad/sdk/ip/direct/a;->aJv:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_3

    const-string p0, "HttpDnsInfo is empty"

    .line 11
    invoke-static {v1, p0}, Lcom/kwad/sdk/core/e/c;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 12
    :cond_3
    invoke-static {}, Lcom/kwad/sdk/ip/direct/a;->init()V

    .line 13
    invoke-static {}, Lcom/kwad/sdk/ip/direct/a;->Jg()V

    return-void
.end method

.method static synthetic access$000()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/kwad/sdk/ip/direct/a;->aJJ:Z

    return v0
.end method

.method static synthetic access$002(Z)Z
    .locals 0

    const/4 p0, 0x1

    .line 1
    sput-boolean p0, Lcom/kwad/sdk/ip/direct/a;->aJJ:Z

    return p0
.end method

.method static synthetic access$102(Z)Z
    .locals 0

    const/4 p0, 0x1

    .line 1
    sput-boolean p0, Lcom/kwad/sdk/ip/direct/a;->aJI:Z

    return p0
.end method

.method private static b(Ljava/util/List;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kwad/sdk/core/response/model/HttpDnsInfo$IpInfo;",
            ">;",
            "Ljava/util/List<",
            "Lcom/kwad/sdk/ip/direct/c;",
            ">;)V"
        }
    .end annotation

    if-nez p0, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/core/response/model/HttpDnsInfo$IpInfo;

    if-eqz v0, :cond_1

    .line 2
    iget-object v1, v0, Lcom/kwad/sdk/core/response/model/HttpDnsInfo$IpInfo;->ip:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 3
    invoke-virtual {v0}, Lcom/kwad/sdk/core/response/model/HttpDnsInfo$IpInfo;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "IpDirect_Helper"

    invoke-static {v2, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object v1, v0, Lcom/kwad/sdk/core/response/model/HttpDnsInfo$IpInfo;->ip:Ljava/lang/String;

    sget v2, Lcom/kwad/sdk/ip/direct/a;->aJr:I

    int-to-long v2, v2

    invoke-static {v1, v2, v3}, Lcom/kwad/sdk/ip/direct/b;->f(Ljava/lang/String;J)Lcom/kwad/sdk/ip/direct/c;

    move-result-object v1

    .line 5
    iget v0, v0, Lcom/kwad/sdk/core/response/model/HttpDnsInfo$IpInfo;->weight:I

    invoke-virtual {v1, v0}, Lcom/kwad/sdk/ip/direct/c;->dB(I)V

    .line 6
    invoke-virtual {v1}, Lcom/kwad/sdk/ip/direct/c;->isSuccess()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 7
    invoke-virtual {v1}, Lcom/kwad/sdk/ip/direct/c;->JC()F

    move-result v0

    sget v2, Lcom/kwad/sdk/ip/direct/a;->aJr:I

    int-to-float v2, v2

    cmpg-float v0, v0, v2

    if-gez v0, :cond_1

    .line 8
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-void
.end method

.method private static clear()V
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/ip/direct/a;->aJw:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 2
    sget-object v0, Lcom/kwad/sdk/ip/direct/a;->aJx:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 3
    sget-object v0, Lcom/kwad/sdk/ip/direct/a;->aJy:Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/PriorityBlockingQueue;->clear()V

    return-void
.end method

.method public static fX(Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    sget-boolean v0, Lcom/kwad/sdk/ip/direct/a;->aJs:Z

    const-string v1, ""

    const-string v2, "IpDirect_Helper"

    if-nez v0, :cond_0

    const-string p0, "getIpByHost return by sIpDirectEnable false"

    .line 2
    invoke-static {v2, p0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    .line 3
    :cond_0
    invoke-static {p0}, Lcom/kwad/sdk/ip/direct/a;->fY(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "isHostInvalid:false \uff1a"

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v2, p0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    .line 5
    :cond_1
    invoke-static {}, Lcom/kwad/sdk/ip/direct/a;->Jr()Z

    move-result p0

    if-nez p0, :cond_2

    const-string p0, "canUseIpDirect:false"

    .line 6
    invoke-static {v2, p0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    .line 7
    :cond_2
    invoke-static {}, Lcom/kwad/sdk/ip/direct/a;->Jh()Ljava/lang/String;

    move-result-object p0

    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "getIpByHost ip:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method private static fY(Ljava/lang/String;)Z
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "https://"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/kwad/sdk/h;->yA()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\u975e\u6838\u5fc3\u57df\u540d current host:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/kwad/sdk/h;->yA()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "try direct host:https://"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v1, "IpDirect_Helper"

    invoke-static {v1, p0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return v0
.end method

.method public static getType()I
    .locals 1

    .line 1
    sget v0, Lcom/kwad/sdk/ip/direct/a;->aJH:I

    return v0
.end method

.method private static init()V
    .locals 3

    .line 1
    sget-object v0, Lcom/kwad/sdk/ip/direct/a;->aJB:Landroid/os/HandlerThread;

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "IpDirectHelper"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 3
    sput-object v0, Lcom/kwad/sdk/ip/direct/a;->aJB:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 4
    new-instance v0, Lcom/kwad/sdk/ip/direct/a$2;

    sget-object v1, Lcom/kwad/sdk/ip/direct/a;->aJB:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/kwad/sdk/ip/direct/a$2;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lcom/kwad/sdk/ip/direct/a;->aJC:Landroid/os/Handler;

    .line 5
    const-class v0, Lcom/kwad/sdk/service/a/f;

    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/f;

    if-eqz v0, :cond_1

    .line 6
    invoke-static {}, Lcom/kwad/sdk/core/NetworkMonitor;->getInstance()Lcom/kwad/sdk/core/NetworkMonitor;

    move-result-object v1

    invoke-interface {v0}, Lcom/kwad/sdk/service/a/f;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v2, Lcom/kwad/sdk/ip/direct/a;->aJK:Lcom/kwad/sdk/core/NetworkMonitor$a;

    invoke-virtual {v1, v0, v2}, Lcom/kwad/sdk/core/NetworkMonitor;->a(Landroid/content/Context;Lcom/kwad/sdk/core/NetworkMonitor$a;)V

    :cond_1
    return-void
.end method

.method static synthetic nx()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/kwad/sdk/ip/direct/a;->Jl()V

    return-void
.end method

.method static synthetic ny()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/kwad/sdk/ip/direct/a;->Jm()V

    return-void
.end method
