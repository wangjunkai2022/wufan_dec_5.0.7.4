.class public final Lcom/kwad/sdk/utils/ap;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile aQF:Lcom/kwad/sdk/utils/ap;


# instance fields
.field private volatile aQG:Z

.field private volatile aQH:J

.field private volatile aQI:Landroid/os/PowerManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/sdk/utils/ap;

    invoke-direct {v0}, Lcom/kwad/sdk/utils/ap;-><init>()V

    sput-object v0, Lcom/kwad/sdk/utils/ap;->aQF:Lcom/kwad/sdk/utils/ap;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 2
    iput-wide v0, p0, Lcom/kwad/sdk/utils/ap;->aQH:J

    return-void
.end method

.method public static MM()Lcom/kwad/sdk/utils/ap;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/utils/ap;->aQF:Lcom/kwad/sdk/utils/ap;

    return-object v0
.end method


# virtual methods
.method public final cF(Landroid/content/Context;)Z
    .locals 5

    .line 1
    iget-wide v0, p0, Lcom/kwad/sdk/utils/ap;->aQH:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/kwad/sdk/utils/ap;->aQH:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x258

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    .line 2
    iget-boolean p1, p0, Lcom/kwad/sdk/utils/ap;->aQG:Z

    return p1

    :cond_0
    const/4 v0, 0x0

    .line 3
    iget-object v1, p0, Lcom/kwad/sdk/utils/ap;->aQI:Landroid/os/PowerManager;

    if-nez v1, :cond_2

    if-eqz p1, :cond_2

    .line 4
    monitor-enter p0

    .line 5
    :try_start_0
    iget-object v1, p0, Lcom/kwad/sdk/utils/ap;->aQI:Landroid/os/PowerManager;

    if-nez v1, :cond_1

    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v1, "power"

    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/PowerManager;

    iput-object p1, p0, Lcom/kwad/sdk/utils/ap;->aQI:Landroid/os/PowerManager;

    .line 7
    :cond_1
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 8
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/kwad/sdk/utils/ap;->aQI:Landroid/os/PowerManager;

    if-eqz p1, :cond_4

    .line 9
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x14

    if-lt p1, v0, :cond_3

    .line 10
    iget-object p1, p0, Lcom/kwad/sdk/utils/ap;->aQI:Landroid/os/PowerManager;

    invoke-virtual {p1}, Landroid/os/PowerManager;->isInteractive()Z

    move-result v0

    goto :goto_1

    .line 11
    :cond_3
    iget-object p1, p0, Lcom/kwad/sdk/utils/ap;->aQI:Landroid/os/PowerManager;

    invoke-virtual {p1}, Landroid/os/PowerManager;->isScreenOn()Z

    move-result v0

    .line 12
    :cond_4
    :goto_1
    iput-boolean v0, p0, Lcom/kwad/sdk/utils/ap;->aQG:Z

    .line 13
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/sdk/utils/ap;->aQH:J

    .line 14
    iget-boolean p1, p0, Lcom/kwad/sdk/utils/ap;->aQG:Z

    return p1
.end method
