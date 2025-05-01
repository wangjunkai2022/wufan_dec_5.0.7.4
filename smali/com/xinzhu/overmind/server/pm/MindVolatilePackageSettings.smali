.class public Lcom/xinzhu/overmind/server/pm/MindVolatilePackageSettings;
.super Ljava/lang/Object;
.source "MindVolatilePackageSettings.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/xinzhu/overmind/server/pm/MindVolatilePackageSettings;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public b:Ljava/lang/String;

.field public c:Lcom/xinzhu/overmind/server/pm/MindPackage;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/xinzhu/overmind/server/pm/MindVolatilePackageSettings$a;

    invoke-direct {v0}, Lcom/xinzhu/overmind/server/pm/MindVolatilePackageSettings$a;-><init>()V

    sput-object v0, Lcom/xinzhu/overmind/server/pm/MindVolatilePackageSettings;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindVolatilePackageSettings;->b:Ljava/lang/String;

    .line 7
    const-class v0, Lcom/xinzhu/overmind/server/pm/MindPackage;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/xinzhu/overmind/server/pm/MindPackage;

    iput-object p1, p0, Lcom/xinzhu/overmind/server/pm/MindVolatilePackageSettings;->c:Lcom/xinzhu/overmind/server/pm/MindPackage;

    return-void
.end method

.method public constructor <init>(Lcom/xinzhu/overmind/server/pm/MindPackageSettings;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iget-object p1, p1, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->b:Lcom/xinzhu/overmind/server/pm/MindPackage;

    iget-object v0, p1, Lcom/xinzhu/overmind/server/pm/MindPackage;->m:Ljava/lang/String;

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindVolatilePackageSettings;->b:Ljava/lang/String;

    .line 4
    iput-object p1, p0, Lcom/xinzhu/overmind/server/pm/MindVolatilePackageSettings;->c:Lcom/xinzhu/overmind/server/pm/MindPackage;

    return-void
.end method

.method public static a(Ljava/lang/String;)Lcom/xinzhu/overmind/server/pm/MindVolatilePackageSettings;
    .locals 4

    const/4 v0, 0x0

    .line 1
    :try_start_0
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    .line 2
    invoke-static {p0}, Lcom/xinzhu/overmind/a;->c0(Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    .line 3
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_0

    return-object v0

    .line 4
    :cond_0
    invoke-static {p0}, Lcom/xinzhu/overmind/utils/k;->v(Ljava/io/File;)[B

    move-result-object p0

    .line 5
    array-length v2, p0

    const/4 v3, 0x0

    invoke-virtual {v1, p0, v3, v2}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 6
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 7
    new-instance p0, Lcom/xinzhu/overmind/server/pm/MindVolatilePackageSettings;

    invoke-direct {p0, v1}, Lcom/xinzhu/overmind/server/pm/MindVolatilePackageSettings;-><init>(Landroid/os/Parcel;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 8
    invoke-virtual {p0}, Ljava/io/IOException;->printStackTrace()V

    return-object v0
.end method


# virtual methods
.method public b()Z
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 3
    new-instance v1, Landroid/util/AtomicFile;

    iget-object v2, p0, Lcom/xinzhu/overmind/server/pm/MindVolatilePackageSettings;->b:Ljava/lang/String;

    invoke-static {v2}, Lcom/xinzhu/overmind/a;->c0(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/util/AtomicFile;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 4
    :try_start_1
    invoke-virtual {p0, v0, v4}, Lcom/xinzhu/overmind/server/pm/MindVolatilePackageSettings;->writeToParcel(Landroid/os/Parcel;I)V

    .line 5
    invoke-virtual {v0, v4}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 6
    invoke-virtual {v1}, Landroid/util/AtomicFile;->startWrite()Ljava/io/FileOutputStream;

    move-result-object v2

    .line 7
    invoke-static {v0, v2}, Lcom/xinzhu/overmind/utils/k;->z(Landroid/os/Parcel;Ljava/io/FileOutputStream;)V

    .line 8
    invoke-virtual {v1, v2}, Landroid/util/AtomicFile;->finishWrite(Ljava/io/FileOutputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
    :try_start_2
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    new-array v0, v3, [Ljava/io/Closeable;

    aput-object v2, v0, v4

    .line 10
    invoke-static {v0}, Lcom/xinzhu/overmind/utils/m;->a([Ljava/io/Closeable;)V

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    return v3

    :catchall_0
    move-exception v5

    .line 11
    :try_start_3
    invoke-virtual {v5}, Ljava/lang/Throwable;->printStackTrace()V

    .line 12
    invoke-virtual {v1, v2}, Landroid/util/AtomicFile;->failWrite(Ljava/io/FileOutputStream;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 13
    :try_start_4
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    new-array v0, v3, [Ljava/io/Closeable;

    aput-object v2, v0, v4

    .line 14
    invoke-static {v0}, Lcom/xinzhu/overmind/utils/m;->a([Ljava/io/Closeable;)V

    monitor-exit p0

    return v4

    :catchall_1
    move-exception v1

    .line 15
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    new-array v0, v3, [Ljava/io/Closeable;

    aput-object v2, v0, v4

    .line 16
    invoke-static {v0}, Lcom/xinzhu/overmind/utils/m;->a([Ljava/io/Closeable;)V

    .line 17
    throw v1

    :catchall_2
    move-exception v0

    .line 18
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindVolatilePackageSettings;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/xinzhu/overmind/server/pm/MindVolatilePackageSettings;->c:Lcom/xinzhu/overmind/server/pm/MindPackage;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
