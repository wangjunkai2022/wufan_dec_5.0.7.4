.class public Lcom/xinzhu/overmind/server/os/e;
.super Lcom/xinzhu/overmind/server/os/a$b;
.source "MindDeviceInfoService.java"

# interfaces
.implements Lcom/xinzhu/overmind/server/d;


# static fields
.field public static final TAG:Ljava/lang/String;

.field private static final sService:Lcom/xinzhu/overmind/server/os/e;


# instance fields
.field private final mDeviceInfoMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/xinzhu/overmind/server/os/MindDeviceInfo;",
            ">;"
        }
    .end annotation
.end field

.field private mGlobalEnable:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lcom/xinzhu/overmind/server/os/e;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/xinzhu/overmind/server/os/e;->TAG:Ljava/lang/String;

    .line 2
    new-instance v0, Lcom/xinzhu/overmind/server/os/e;

    invoke-direct {v0}, Lcom/xinzhu/overmind/server/os/e;-><init>()V

    sput-object v0, Lcom/xinzhu/overmind/server/os/e;->sService:Lcom/xinzhu/overmind/server/os/e;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/xinzhu/overmind/server/os/a$b;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/xinzhu/overmind/server/os/e;->mDeviceInfoMap:Ljava/util/Map;

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/xinzhu/overmind/server/os/e;->mGlobalEnable:Z

    .line 4
    invoke-virtual {p0}, Lcom/xinzhu/overmind/server/os/e;->loadPersistence()V

    return-void
.end method

.method public static get()Lcom/xinzhu/overmind/server/os/e;
    .locals 1

    .line 1
    sget-object v0, Lcom/xinzhu/overmind/server/os/e;->sService:Lcom/xinzhu/overmind/server/os/e;

    return-object v0
.end method

.method private getOrGenerateMindDeviceInfoLocked(I)Lcom/xinzhu/overmind/server/os/MindDeviceInfo;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xinzhu/overmind/server/os/e;->mDeviceInfoMap:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/xinzhu/overmind/server/os/MindDeviceInfo;

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Lcom/xinzhu/overmind/server/os/MindDeviceInfo;->a()Lcom/xinzhu/overmind/server/os/MindDeviceInfo;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/xinzhu/overmind/server/os/e;->mDeviceInfoMap:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    invoke-virtual {p0}, Lcom/xinzhu/overmind/server/os/e;->savePersistence()V

    :cond_0
    return-object v0
.end method


# virtual methods
.method public getDeviceInfo(I)Lcom/xinzhu/overmind/server/os/MindDeviceInfo;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xinzhu/overmind/server/os/e;->mDeviceInfoMap:Ljava/util/Map;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-boolean v1, p0, Lcom/xinzhu/overmind/server/os/e;->mGlobalEnable:Z

    if-eqz v1, :cond_0

    .line 3
    invoke-direct {p0, p1}, Lcom/xinzhu/overmind/server/os/e;->getOrGenerateMindDeviceInfoLocked(I)Lcom/xinzhu/overmind/server/os/MindDeviceInfo;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :cond_0
    const/4 p1, 0x0

    .line 4
    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 5
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public loadPersistence()V
    .locals 6

    .line 1
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 2
    invoke-static {}, Lcom/xinzhu/overmind/a;->z()Ljava/io/File;

    move-result-object v1

    .line 3
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_0

    return-void

    .line 4
    :cond_0
    :try_start_0
    invoke-static {v1}, Lcom/xinzhu/overmind/utils/k;->v(Ljava/io/File;)[B

    move-result-object v1

    .line 5
    array-length v2, v1

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 6
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 7
    iget-object v1, p0, Lcom/xinzhu/overmind/server/os/e;->mDeviceInfoMap:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 8
    invoke-virtual {v0}, Landroid/os/Parcel;->readByte()B

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    iput-boolean v1, p0, Lcom/xinzhu/overmind/server/os/e;->mGlobalEnable:Z

    .line 9
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    :goto_1
    if-ge v3, v1, :cond_2

    .line 10
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 11
    const-class v4, Lcom/xinzhu/overmind/server/os/MindDeviceInfo;

    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Lcom/xinzhu/overmind/server/os/MindDeviceInfo;

    .line 12
    iget-object v5, p0, Lcom/xinzhu/overmind/server/os/e;->mDeviceInfoMap:Ljava/util/Map;

    invoke-interface {v5, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :catchall_0
    move-exception v1

    .line 13
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 14
    :cond_2
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_1
    move-exception v1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 15
    goto :goto_3

    :goto_2
    throw v1

    :goto_3
    goto :goto_2
.end method

.method public savePersistence()V
    .locals 8

    .line 1
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 2
    new-instance v1, Landroid/util/AtomicFile;

    invoke-static {}, Lcom/xinzhu/overmind/a;->z()Ljava/io/File;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/util/AtomicFile;-><init>(Ljava/io/File;)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 3
    :try_start_0
    iget-boolean v5, p0, Lcom/xinzhu/overmind/server/os/e;->mGlobalEnable:Z

    if-eqz v5, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {v0, v5}, Landroid/os/Parcel;->writeByte(B)V

    .line 4
    iget-object v5, p0, Lcom/xinzhu/overmind/server/os/e;->mDeviceInfoMap:Ljava/util/Map;

    invoke-interface {v5}, Ljava/util/Map;->size()I

    move-result v5

    invoke-virtual {v0, v5}, Landroid/os/Parcel;->writeInt(I)V

    .line 5
    iget-object v5, p0, Lcom/xinzhu/overmind/server/os/e;->mDeviceInfoMap:Ljava/util/Map;

    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    .line 6
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-virtual {v0, v7}, Landroid/os/Parcel;->writeInt(I)V

    .line 7
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/os/Parcelable;

    invoke-virtual {v0, v6, v3}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    goto :goto_1

    .line 8
    :cond_1
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 9
    invoke-virtual {v1}, Landroid/util/AtomicFile;->startWrite()Ljava/io/FileOutputStream;

    move-result-object v4

    .line 10
    invoke-static {v0, v4}, Lcom/xinzhu/overmind/utils/k;->z(Landroid/os/Parcel;Ljava/io/FileOutputStream;)V

    .line 11
    invoke-virtual {v1, v4}, Landroid/util/AtomicFile;->finishWrite(Ljava/io/FileOutputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    new-array v0, v2, [Ljava/io/Closeable;

    aput-object v4, v0, v3

    .line 13
    invoke-static {v0}, Lcom/xinzhu/overmind/utils/m;->a([Ljava/io/Closeable;)V

    goto :goto_2

    :catchall_0
    move-exception v5

    .line 14
    :try_start_1
    invoke-virtual {v5}, Ljava/lang/Throwable;->printStackTrace()V

    .line 15
    invoke-virtual {v1, v4}, Landroid/util/AtomicFile;->failWrite(Ljava/io/FileOutputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 16
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    new-array v0, v2, [Ljava/io/Closeable;

    aput-object v4, v0, v3

    .line 17
    invoke-static {v0}, Lcom/xinzhu/overmind/utils/m;->a([Ljava/io/Closeable;)V

    :goto_2
    return-void

    :catchall_1
    move-exception v1

    .line 18
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    new-array v0, v2, [Ljava/io/Closeable;

    aput-object v4, v0, v3

    .line 19
    invoke-static {v0}, Lcom/xinzhu/overmind/utils/m;->a([Ljava/io/Closeable;)V

    .line 20
    goto :goto_4

    :goto_3
    throw v1

    :goto_4
    goto :goto_3
.end method

.method public setVirtualDeviceStatus(Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iput-boolean p1, p0, Lcom/xinzhu/overmind/server/os/e;->mGlobalEnable:Z

    .line 2
    invoke-virtual {p0}, Lcom/xinzhu/overmind/server/os/e;->savePersistence()V

    return-void
.end method

.method public systemReady()V
    .locals 0

    return-void
.end method

.method public updateMindDeviceInfo(ILcom/xinzhu/overmind/server/os/MindDeviceInfo;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xinzhu/overmind/server/os/e;->mDeviceInfoMap:Ljava/util/Map;

    monitor-enter v0

    if-eqz p2, :cond_0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/xinzhu/overmind/server/os/e;->mDeviceInfoMap:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v1, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    invoke-virtual {p0}, Lcom/xinzhu/overmind/server/os/e;->savePersistence()V

    .line 4
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
