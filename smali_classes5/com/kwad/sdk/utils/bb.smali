.class public Lcom/kwad/sdk/utils/bb;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/sdk/utils/bb$b;,
        Lcom/kwad/sdk/utils/bb$a;
    }
.end annotation


# static fields
.field private static volatile aQT:Lcom/kwad/sdk/utils/bb;


# instance fields
.field private aQU:Landroid/hardware/SensorManager;

.field private final aQV:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/kwad/sdk/utils/bb$a;",
            ">;"
        }
    .end annotation
.end field

.field private final aQW:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Landroid/hardware/SensorEventListener;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/utils/bb;->aQV:Ljava/util/Map;

    .line 3
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/utils/bb;->aQW:Ljava/util/Map;

    return-void
.end method

.method private static A(II)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "_"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static Nn()Lcom/kwad/sdk/utils/bb;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/kwad/sdk/utils/bb;->aQT:Lcom/kwad/sdk/utils/bb;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/kwad/sdk/utils/bb;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/kwad/sdk/utils/bb;->aQT:Lcom/kwad/sdk/utils/bb;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/kwad/sdk/utils/bb;

    invoke-direct {v1}, Lcom/kwad/sdk/utils/bb;-><init>()V

    sput-object v1, Lcom/kwad/sdk/utils/bb;->aQT:Lcom/kwad/sdk/utils/bb;

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
    sget-object v0, Lcom/kwad/sdk/utils/bb;->aQT:Lcom/kwad/sdk/utils/bb;

    return-object v0
.end method

.method static synthetic a(Lcom/kwad/sdk/utils/bb;Ljava/lang/String;Landroid/hardware/SensorEvent;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/kwad/sdk/utils/bb;->a(Ljava/lang/String;Landroid/hardware/SensorEvent;)V

    return-void
.end method

.method private a(Ljava/lang/String;ILandroid/hardware/Sensor;)V
    .locals 1

    .line 21
    invoke-direct {p0, p1}, Lcom/kwad/sdk/utils/bb;->gX(Ljava/lang/String;)Lcom/kwad/sdk/utils/bb$a;

    move-result-object p1

    .line 22
    invoke-static {p2}, Lcom/kwad/sdk/utils/bb;->eg(I)I

    move-result p2

    .line 23
    invoke-direct {p0}, Lcom/kwad/sdk/utils/bb;->getSensorManager()Landroid/hardware/SensorManager;

    move-result-object v0

    invoke-virtual {v0, p1, p3, p2}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    return-void
.end method

.method private a(Ljava/lang/String;Landroid/hardware/SensorEvent;)V
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/kwad/sdk/utils/bb;->aQW:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/CopyOnWriteArraySet;

    if-eqz p1, :cond_0

    .line 25
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/SensorEventListener;

    .line 26
    invoke-interface {v0, p2}, Landroid/hardware/SensorEventListener;->onSensorChanged(Landroid/hardware/SensorEvent;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private ef(I)Landroid/hardware/Sensor;
    .locals 4
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/utils/bb;->getSensorManager()Landroid/hardware/SensorManager;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    const/4 v0, 0x1

    if-eq p1, v0, :cond_4

    const/4 v2, 0x2

    const/4 v3, 0x4

    if-eq p1, v2, :cond_3

    const/4 v2, 0x3

    if-eq p1, v2, :cond_2

    if-eq p1, v3, :cond_1

    return-object v1

    .line 2
    :cond_1
    invoke-direct {p0}, Lcom/kwad/sdk/utils/bb;->getSensorManager()Landroid/hardware/SensorManager;

    move-result-object p1

    const/16 v0, 0x9

    invoke-virtual {p1, v0}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object p1

    return-object p1

    .line 3
    :cond_2
    invoke-direct {p0}, Lcom/kwad/sdk/utils/bb;->getSensorManager()Landroid/hardware/SensorManager;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object p1

    return-object p1

    .line 4
    :cond_3
    invoke-direct {p0}, Lcom/kwad/sdk/utils/bb;->getSensorManager()Landroid/hardware/SensorManager;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object p1

    return-object p1

    .line 5
    :cond_4
    invoke-direct {p0}, Lcom/kwad/sdk/utils/bb;->getSensorManager()Landroid/hardware/SensorManager;

    move-result-object p1

    const/16 v0, 0xa

    invoke-virtual {p1, v0}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object p1

    return-object p1
.end method

.method private static eg(I)I
    .locals 1

    const/4 v0, -0x3

    if-eq p0, v0, :cond_2

    const/4 v0, -0x2

    if-eq p0, v0, :cond_1

    const/4 v0, -0x1

    if-eq p0, v0, :cond_0

    const/4 p0, 0x3

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    const/4 p0, 0x1

    return p0

    :cond_2
    const/4 p0, 0x2

    return p0
.end method

.method private gW(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/utils/bb;->aQV:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/utils/bb$a;

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Lcom/kwad/sdk/utils/bb;->aQV:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    invoke-direct {p0}, Lcom/kwad/sdk/utils/bb;->getSensorManager()Landroid/hardware/SensorManager;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    :cond_0
    return-void
.end method

.method private gX(Ljava/lang/String;)Lcom/kwad/sdk/utils/bb$a;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/utils/bb;->aQV:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/utils/bb$a;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/sdk/utils/bb$a;

    invoke-direct {v0, p1, p0}, Lcom/kwad/sdk/utils/bb$a;-><init>(Ljava/lang/String;Lcom/kwad/sdk/utils/bb;)V

    .line 3
    iget-object v1, p0, Lcom/kwad/sdk/utils/bb;->aQV:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method private getSensorManager()Landroid/hardware/SensorManager;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/utils/bb;->aQU:Landroid/hardware/SensorManager;

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "sensor"

    .line 3
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/SensorManager;

    iput-object v0, p0, Lcom/kwad/sdk/utils/bb;->aQU:Landroid/hardware/SensorManager;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/sdk/utils/bb;->aQU:Landroid/hardware/SensorManager;

    return-object v0
.end method


# virtual methods
.method public final declared-synchronized a(IILandroid/hardware/SensorEventListener;Lcom/kwad/sdk/utils/bb$b;)V
    .locals 2

    monitor-enter p0

    .line 2
    :try_start_0
    invoke-direct {p0, p1}, Lcom/kwad/sdk/utils/bb;->ef(I)Landroid/hardware/Sensor;

    move-result-object v0

    if-nez v0, :cond_1

    if-eqz p4, :cond_0

    .line 3
    invoke-interface {p4}, Lcom/kwad/sdk/utils/bb$b;->onFailed()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    :cond_0
    monitor-exit p0

    return-void

    .line 5
    :cond_1
    :try_start_1
    invoke-static {p1, p2}, Lcom/kwad/sdk/utils/bb;->A(II)Ljava/lang/String;

    move-result-object p1

    .line 6
    iget-object p4, p0, Lcom/kwad/sdk/utils/bb;->aQW:Ljava/util/Map;

    invoke-interface {p4, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/util/concurrent/CopyOnWriteArraySet;

    if-nez p4, :cond_2

    .line 7
    new-instance p4, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {p4}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 8
    :cond_2
    invoke-virtual {p4, p3}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 9
    invoke-virtual {p4}, Ljava/util/concurrent/CopyOnWriteArraySet;->size()I

    move-result p3

    const/4 v1, 0x1

    if-ne p3, v1, :cond_3

    .line 10
    iget-object p3, p0, Lcom/kwad/sdk/utils/bb;->aQW:Ljava/util/Map;

    invoke-interface {p3, p1, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    invoke-direct {p0, p1, p2, v0}, Lcom/kwad/sdk/utils/bb;->a(Ljava/lang/String;ILandroid/hardware/Sensor;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    :cond_3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized a(Landroid/hardware/SensorEventListener;)V
    .locals 6

    monitor-enter p0

    .line 13
    :try_start_0
    iget-object v0, p0, Lcom/kwad/sdk/utils/bb;->aQW:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 14
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 15
    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/hardware/SensorEventListener;

    .line 16
    invoke-virtual {v4, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 17
    invoke-virtual {v2, v4}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    .line 18
    :cond_2
    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->size()I

    move-result v2

    if-nez v2, :cond_0

    .line 19
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/kwad/sdk/utils/bb;->gW(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 20
    :cond_3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method
