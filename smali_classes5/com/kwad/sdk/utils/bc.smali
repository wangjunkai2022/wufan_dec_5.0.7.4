.class public final Lcom/kwad/sdk/utils/bc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/SensorEventListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/sdk/utils/bc$b;,
        Lcom/kwad/sdk/utils/bc$a;
    }
.end annotation


# instance fields
.field private final aQX:Lcom/kwad/sdk/utils/bc$b;

.field private final aQY:Lcom/kwad/sdk/utils/bc$b;

.field private final aQZ:Lcom/kwad/sdk/utils/bc$b;

.field private aRa:Z

.field private aRb:Z

.field private final aRc:Lcom/kwad/sdk/utils/bb$b;


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lcom/kwad/sdk/utils/bc$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/kwad/sdk/utils/bc$b;-><init>(B)V

    iput-object v0, p0, Lcom/kwad/sdk/utils/bc;->aQX:Lcom/kwad/sdk/utils/bc$b;

    .line 4
    new-instance v0, Lcom/kwad/sdk/utils/bc$b;

    invoke-direct {v0, v1}, Lcom/kwad/sdk/utils/bc$b;-><init>(B)V

    iput-object v0, p0, Lcom/kwad/sdk/utils/bc;->aQY:Lcom/kwad/sdk/utils/bc$b;

    .line 5
    new-instance v0, Lcom/kwad/sdk/utils/bc$b;

    invoke-direct {v0, v1}, Lcom/kwad/sdk/utils/bc$b;-><init>(B)V

    iput-object v0, p0, Lcom/kwad/sdk/utils/bc;->aQZ:Lcom/kwad/sdk/utils/bc$b;

    .line 6
    iput-boolean v1, p0, Lcom/kwad/sdk/utils/bc;->aRa:Z

    .line 7
    new-instance v0, Lcom/kwad/sdk/utils/bc$2;

    invoke-direct {v0, p0}, Lcom/kwad/sdk/utils/bc$2;-><init>(Lcom/kwad/sdk/utils/bc;)V

    iput-object v0, p0, Lcom/kwad/sdk/utils/bc;->aRc:Lcom/kwad/sdk/utils/bb$b;

    .line 8
    invoke-static {}, Lcom/kwad/sdk/core/c/b;->En()Lcom/kwad/sdk/core/c/b;

    new-instance v0, Lcom/kwad/sdk/utils/bc$1;

    invoke-direct {v0, p0}, Lcom/kwad/sdk/utils/bc$1;-><init>(Lcom/kwad/sdk/utils/bc;)V

    invoke-static {v0}, Lcom/kwad/sdk/core/c/b;->a(Lcom/kwad/sdk/core/c/c;)V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/utils/bc;-><init>()V

    return-void
.end method

.method public static No()Lcom/kwad/sdk/utils/bc;
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/sdk/utils/bc$a;->Nr()Lcom/kwad/sdk/utils/bc;

    move-result-object v0

    return-object v0
.end method

.method private declared-synchronized Nq()V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lcom/kwad/sdk/utils/bc;->aRb:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 2
    monitor-exit p0

    return-void

    .line 3
    :cond_0
    :try_start_1
    invoke-static {}, Lcom/kwad/sdk/utils/bb;->Nn()Lcom/kwad/sdk/utils/bb;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/kwad/sdk/utils/bb;->a(Landroid/hardware/SensorEventListener;)V

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/kwad/sdk/utils/bc;->aRb:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 5
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method static synthetic a(Lcom/kwad/sdk/utils/bc;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/utils/bc;->register()V

    return-void
.end method

.method static synthetic a(Lcom/kwad/sdk/utils/bc;Z)Z
    .locals 0

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/kwad/sdk/utils/bc;->aRa:Z

    return p1
.end method

.method static synthetic b(Lcom/kwad/sdk/utils/bc;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/utils/bc;->Nq()V

    return-void
.end method

.method private declared-synchronized register()V
    .locals 5

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lcom/kwad/sdk/utils/bc;->aRa:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/kwad/sdk/utils/bc;->aRb:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/kwad/sdk/utils/bc;->aRb:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 3
    :try_start_1
    invoke-static {}, Lcom/kwad/sdk/utils/bb;->Nn()Lcom/kwad/sdk/utils/bb;

    move-result-object v1

    iget-object v2, p0, Lcom/kwad/sdk/utils/bc;->aRc:Lcom/kwad/sdk/utils/bb$b;

    const/4 v3, 0x3

    .line 4
    invoke-virtual {v1, v3, v3, p0, v2}, Lcom/kwad/sdk/utils/bb;->a(IILandroid/hardware/SensorEventListener;Lcom/kwad/sdk/utils/bb$b;)V

    .line 5
    invoke-static {}, Lcom/kwad/sdk/utils/bb;->Nn()Lcom/kwad/sdk/utils/bb;

    move-result-object v1

    const/4 v2, 0x2

    iget-object v4, p0, Lcom/kwad/sdk/utils/bc;->aRc:Lcom/kwad/sdk/utils/bb$b;

    .line 6
    invoke-virtual {v1, v2, v3, p0, v4}, Lcom/kwad/sdk/utils/bb;->a(IILandroid/hardware/SensorEventListener;Lcom/kwad/sdk/utils/bb$b;)V

    .line 7
    invoke-static {}, Lcom/kwad/sdk/utils/bb;->Nn()Lcom/kwad/sdk/utils/bb;

    move-result-object v1

    const/4 v2, 0x4

    iget-object v4, p0, Lcom/kwad/sdk/utils/bc;->aRc:Lcom/kwad/sdk/utils/bb$b;

    .line 8
    invoke-virtual {v1, v2, v3, p0, v4}, Lcom/kwad/sdk/utils/bb;->a(IILandroid/hardware/SensorEventListener;Lcom/kwad/sdk/utils/bb$b;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
    monitor-exit p0

    return-void

    .line 10
    :catchall_0
    :try_start_2
    iput-boolean v0, p0, Lcom/kwad/sdk/utils/bc;->aRa:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 11
    monitor-exit p0

    return-void

    .line 12
    :cond_1
    :goto_0
    monitor-exit p0

    return-void

    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public final declared-synchronized Np()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/kwad/sdk/k/a/e;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/utils/o;->LT()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 2
    monitor-exit p0

    return-object v0

    .line 3
    :cond_0
    :try_start_1
    invoke-static {}, Lcom/kwad/sdk/core/c/b;->En()Lcom/kwad/sdk/core/c/b;

    invoke-static {}, Lcom/kwad/sdk/core/c/b;->isAppOnForeground()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    invoke-direct {p0}, Lcom/kwad/sdk/utils/bc;->register()V

    .line 5
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    iget-object v1, p0, Lcom/kwad/sdk/utils/bc;->aQX:Lcom/kwad/sdk/utils/bc$b;

    invoke-virtual {v1, v0}, Lcom/kwad/sdk/utils/bc$b;->Q(Ljava/util/List;)V

    .line 7
    iget-object v1, p0, Lcom/kwad/sdk/utils/bc;->aQY:Lcom/kwad/sdk/utils/bc$b;

    invoke-virtual {v1, v0}, Lcom/kwad/sdk/utils/bc$b;->Q(Ljava/util/List;)V

    .line 8
    iget-object v1, p0, Lcom/kwad/sdk/utils/bc;->aQZ:Lcom/kwad/sdk/utils/bc$b;

    invoke-virtual {v1, v0}, Lcom/kwad/sdk/utils/bc$b;->Q(Ljava/util/List;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    return-void
.end method

.method public final onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 2

    .line 1
    iget-object v0, p1, Landroid/hardware/SensorEvent;->sensor:Landroid/hardware/Sensor;

    invoke-virtual {v0}, Landroid/hardware/Sensor;->getType()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/16 v1, 0x9

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/kwad/sdk/utils/bc;->aQZ:Lcom/kwad/sdk/utils/bc$b;

    invoke-virtual {v0, p1}, Lcom/kwad/sdk/utils/bc$b;->b(Landroid/hardware/SensorEvent;)V

    :goto_0
    return-void

    .line 3
    :cond_1
    iget-object v0, p0, Lcom/kwad/sdk/utils/bc;->aQY:Lcom/kwad/sdk/utils/bc$b;

    invoke-virtual {v0, p1}, Lcom/kwad/sdk/utils/bc$b;->b(Landroid/hardware/SensorEvent;)V

    return-void

    .line 4
    :cond_2
    iget-object v0, p0, Lcom/kwad/sdk/utils/bc;->aQX:Lcom/kwad/sdk/utils/bc$b;

    invoke-virtual {v0, p1}, Lcom/kwad/sdk/utils/bc$b;->b(Landroid/hardware/SensorEvent;)V

    return-void
.end method
