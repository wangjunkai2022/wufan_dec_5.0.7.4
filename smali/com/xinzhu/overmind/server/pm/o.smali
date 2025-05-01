.class Lcom/xinzhu/overmind/server/pm/o;
.super Ljava/lang/Object;
.source "Settings.java"


# static fields
.field public static final d:Ljava/lang/String; = "Settings"


# instance fields
.field final a:Landroid/util/ArrayMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/ArrayMap<",
            "Ljava/lang/String;",
            "Lcom/xinzhu/overmind/server/pm/MindPackageSettings;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private c:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroid/util/ArrayMap;

    invoke-direct {v0}, Landroid/util/ArrayMap;-><init>()V

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/o;->a:Landroid/util/ArrayMap;

    .line 3
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lcom/xinzhu/overmind/server/pm/o;->b:Ljava/util/Map;

    const/4 v1, 0x0

    .line 4
    iput v1, p0, Lcom/xinzhu/overmind/server/pm/o;->c:I

    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    invoke-direct {p0}, Lcom/xinzhu/overmind/server/pm/o;->f()V

    .line 7
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private a(Lcom/xinzhu/overmind/server/pm/MindPackageSettings;)I
    .locals 2

    .line 1
    iget-object p1, p1, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->b:Lcom/xinzhu/overmind/server/pm/MindPackage;

    iget-object v0, p1, Lcom/xinzhu/overmind/server/pm/MindPackage;->o:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p1, Lcom/xinzhu/overmind/server/pm/MindPackage;->m:Ljava/lang/String;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/xinzhu/overmind/server/pm/o;->b:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_1

    .line 4
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    :goto_0
    add-int/lit16 p1, p1, 0x2710

    return p1

    .line 5
    :cond_1
    iget p1, p0, Lcom/xinzhu/overmind/server/pm/o;->c:I

    const/16 v1, 0x4e1f

    if-lt p1, v1, :cond_2

    const/4 p1, -0x1

    return p1

    :cond_2
    add-int/lit8 p1, p1, 0x1

    .line 6
    iput p1, p0, Lcom/xinzhu/overmind/server/pm/o;->c:I

    .line 7
    iget-object v1, p0, Lcom/xinzhu/overmind/server/pm/o;->b:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    iget p1, p0, Lcom/xinzhu/overmind/server/pm/o;->c:I

    goto :goto_0
.end method

.method private b(Lcom/xinzhu/overmind/server/pm/MindPackageSettings;I)I
    .locals 2

    .line 1
    iget-object p1, p1, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->b:Lcom/xinzhu/overmind/server/pm/MindPackage;

    iget-object v0, p1, Lcom/xinzhu/overmind/server/pm/MindPackage;->o:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p1, Lcom/xinzhu/overmind/server/pm/MindPackage;->m:Ljava/lang/String;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/xinzhu/overmind/server/pm/o;->b:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_1

    .line 4
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    add-int/lit16 p1, p1, 0x2710

    return p1

    :cond_1
    const/16 p1, 0x4e1f

    if-lt p2, p1, :cond_2

    const/4 p1, -0x1

    return p1

    .line 5
    :cond_2
    iget p1, p0, Lcom/xinzhu/overmind/server/pm/o;->c:I

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lcom/xinzhu/overmind/server/pm/o;->c:I

    .line 6
    iget-object p1, p0, Lcom/xinzhu/overmind/server/pm/o;->b:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit16 p2, p2, 0x2710

    return p2
.end method

.method private f()V
    .locals 4

    .line 1
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 2
    :try_start_0
    invoke-static {}, Lcom/xinzhu/overmind/a;->W()Ljava/io/File;

    move-result-object v1

    invoke-static {v1}, Lcom/xinzhu/overmind/utils/k;->v(Ljava/io/File;)[B

    move-result-object v1

    .line 3
    array-length v2, v1

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 4
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 5
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lcom/xinzhu/overmind/server/pm/o;->c:I

    .line 6
    const-class v1, Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->readHashMap(Ljava/lang/ClassLoader;)Ljava/util/HashMap;

    move-result-object v1

    .line 7
    iget-object v2, p0, Lcom/xinzhu/overmind/server/pm/o;->b:Ljava/util/Map;

    monitor-enter v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 8
    :try_start_1
    iget-object v3, p0, Lcom/xinzhu/overmind/server/pm/o;->b:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->clear()V

    .line 9
    iget-object v3, p0, Lcom/xinzhu/overmind/server/pm/o;->b:Ljava/util/Map;

    invoke-interface {v3, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 10
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v1

    .line 11
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 12
    throw v1

    .line 13
    :catch_0
    :goto_0
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void
.end method

.method private i()V
    .locals 4

    .line 1
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 2
    new-instance v1, Landroid/util/AtomicFile;

    invoke-static {}, Lcom/xinzhu/overmind/a;->W()Ljava/io/File;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/util/AtomicFile;-><init>(Ljava/io/File;)V

    const/4 v2, 0x0

    .line 3
    :try_start_0
    iget v3, p0, Lcom/xinzhu/overmind/server/pm/o;->c:I

    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 4
    iget-object v3, p0, Lcom/xinzhu/overmind/server/pm/o;->b:Ljava/util/Map;

    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeMap(Ljava/util/Map;)V

    .line 5
    invoke-virtual {v1}, Landroid/util/AtomicFile;->startWrite()Ljava/io/FileOutputStream;

    move-result-object v2

    .line 6
    invoke-static {v0, v2}, Lcom/xinzhu/overmind/utils/k;->z(Landroid/os/Parcel;Ljava/io/FileOutputStream;)V

    .line 7
    invoke-virtual {v1, v2}, Landroid/util/AtomicFile;->finishWrite(Ljava/io/FileOutputStream;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :catch_0
    move-exception v3

    .line 8
    :try_start_1
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    .line 9
    invoke-virtual {v1, v2}, Landroid/util/AtomicFile;->failWrite(Ljava/io/FileOutputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 10
    :goto_0
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :goto_1
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 11
    throw v1
.end method

.method private k(Ljava/io/File;)V
    .locals 14

    const-string v0, " path: "

    const-string v1, "try to fix corrupted settings by transfer, userId: "

    const-string v2, "Settings"

    .line 1
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    .line 2
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 3
    invoke-static {p1}, Lcom/xinzhu/overmind/a;->Q(Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    .line 4
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v5

    if-nez v5, :cond_0

    return-void

    :cond_0
    const/4 v5, -0x1

    const/4 v6, 0x1

    const/4 v7, 0x0

    .line 5
    :try_start_0
    invoke-static {p1}, Lcom/xinzhu/overmind/a;->R(Ljava/lang/String;)Ljava/io/File;

    move-result-object v8

    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    move-result v8

    const/16 v9, 0x80

    if-eqz v8, :cond_5

    invoke-static {p1}, Lcom/xinzhu/overmind/a;->c0(Ljava/lang/String;)Ljava/io/File;

    move-result-object v8

    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    move-result v8

    if-eqz v8, :cond_5

    const-string v4, "package settings run into new routine"

    .line 6
    invoke-static {v2, v4}, Lcom/xinzhu/overmind/b;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    invoke-static {p1}, Lcom/xinzhu/overmind/server/pm/MindReliablePackageSettings;->b(Ljava/lang/String;)Lcom/xinzhu/overmind/server/pm/MindReliablePackageSettings;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 8
    :try_start_1
    invoke-static {p1}, Lcom/xinzhu/overmind/server/pm/MindVolatilePackageSettings;->a(Ljava/lang/String;)Lcom/xinzhu/overmind/server/pm/MindVolatilePackageSettings;

    move-result-object v8

    if-eqz v8, :cond_2

    if-eqz v4, :cond_2

    .line 9
    new-instance v10, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;

    invoke-direct {v10, v4, v8}, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;-><init>(Lcom/xinzhu/overmind/server/pm/MindReliablePackageSettings;Lcom/xinzhu/overmind/server/pm/MindVolatilePackageSettings;)V

    .line 10
    iget-object v11, v4, Lcom/xinzhu/overmind/server/pm/MindReliablePackageSettings;->d:Lcom/xinzhu/overmind/entity/pm/InstallOption;

    invoke-virtual {v11, v6}, Lcom/xinzhu/overmind/entity/pm/InstallOption;->c(I)Z

    move-result v11

    if-eqz v11, :cond_1

    .line 11
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getContext()Landroid/content/Context;

    move-result-object v11

    invoke-virtual {v11}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v11

    invoke-virtual {v11, p1, v9}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v9

    .line 12
    iget-object v9, v9, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v9, v9, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 13
    iget-object v11, v8, Lcom/xinzhu/overmind/server/pm/MindVolatilePackageSettings;->c:Lcom/xinzhu/overmind/server/pm/MindPackage;

    iget-object v11, v11, Lcom/xinzhu/overmind/server/pm/MindPackage;->v:Ljava/lang/String;

    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_1

    .line 14
    invoke-static {}, Lcom/xinzhu/overmind/server/e;->d()Lcom/xinzhu/overmind/server/e;

    move-result-object v11

    iget-object v12, v8, Lcom/xinzhu/overmind/server/pm/MindVolatilePackageSettings;->c:Lcom/xinzhu/overmind/server/pm/MindPackage;

    iget-object v12, v12, Lcom/xinzhu/overmind/server/pm/MindPackage;->m:Ljava/lang/String;

    invoke-virtual {v11, v12}, Lcom/xinzhu/overmind/server/e;->k(Ljava/lang/String;)V

    .line 15
    iget-object v11, v8, Lcom/xinzhu/overmind/server/pm/MindVolatilePackageSettings;->c:Lcom/xinzhu/overmind/server/pm/MindPackage;

    iput-object v9, v11, Lcom/xinzhu/overmind/server/pm/MindPackage;->v:Ljava/lang/String;

    .line 16
    invoke-static {}, Lcom/xinzhu/overmind/server/pm/h;->get()Lcom/xinzhu/overmind/server/pm/h;

    move-result-object v9

    invoke-virtual {v9, v10}, Lcom/xinzhu/overmind/server/pm/h;->updatePackage(Lcom/xinzhu/overmind/server/pm/MindPackageSettings;)I

    .line 17
    :cond_1
    iget-object v9, p0, Lcom/xinzhu/overmind/server/pm/o;->a:Landroid/util/ArrayMap;

    iget-object v11, v10, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->b:Lcom/xinzhu/overmind/server/pm/MindPackage;

    iget-object v11, v11, Lcom/xinzhu/overmind/server/pm/MindPackage;->m:Ljava/lang/String;

    invoke-virtual {v9, v11, v10}, Landroid/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    iget-object v8, v8, Lcom/xinzhu/overmind/server/pm/MindVolatilePackageSettings;->c:Lcom/xinzhu/overmind/server/pm/MindPackage;

    .line 19
    invoke-static {}, Lcom/xinzhu/overmind/server/pm/MindPackageUserState;->a()Lcom/xinzhu/overmind/server/pm/MindPackageUserState;

    move-result-object v9

    invoke-static {v8, v7, v9, v7}, Lcom/xinzhu/overmind/server/pm/j;->f(Lcom/xinzhu/overmind/server/pm/MindPackage;ILcom/xinzhu/overmind/server/pm/MindPackageUserState;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v9

    iput-object v9, v8, Lcom/xinzhu/overmind/server/pm/MindPackage;->s:Landroid/content/pm/ApplicationInfo;

    .line 20
    invoke-virtual {v10}, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->l()Z

    goto :goto_0

    :cond_2
    const-string v8, "fatal error when fetch package settings, check it!!!!!!!!!"

    .line 21
    invoke-static {v2, v8}, Lcom/xinzhu/overmind/utils/v;->c(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    :goto_0
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception v8

    .line 23
    :try_start_2
    invoke-virtual {v8}, Ljava/lang/Throwable;->printStackTrace()V

    const-string v8, "package settings run into new ambulance routine"

    .line 24
    invoke-static {v2, v8}, Lcom/xinzhu/overmind/b;->c(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v4, :cond_4

    .line 25
    iget-object v8, v4, Lcom/xinzhu/overmind/server/pm/MindReliablePackageSettings;->d:Lcom/xinzhu/overmind/entity/pm/InstallOption;

    iget v8, v8, Lcom/xinzhu/overmind/entity/pm/InstallOption;->b:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne v8, v6, :cond_3

    .line 26
    :try_start_3
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    invoke-virtual {v4, p1, v7}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v4

    .line 27
    invoke-static {}, Lcom/xinzhu/overmind/server/pm/i;->get()Lcom/xinzhu/overmind/server/pm/i;

    move-result-object v8

    iget-object v4, v4, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v4, v4, Landroid/content/pm/ApplicationInfo;->publicSourceDir:Ljava/lang/String;

    invoke-static {}, Lcom/xinzhu/overmind/entity/pm/InstallOption;->b()Lcom/xinzhu/overmind/entity/pm/InstallOption;

    move-result-object v9

    invoke-virtual {v8, v4, v9, v5}, Lcom/xinzhu/overmind/server/pm/i;->installPackageAsUser(Ljava/lang/String;Lcom/xinzhu/overmind/entity/pm/InstallOption;I)Lcom/xinzhu/overmind/entity/pm/InstallResult;
    :try_end_3
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    .line 28
    :cond_3
    :try_start_4
    invoke-static {p1}, Lcom/xinzhu/overmind/a;->d(Ljava/lang/String;)Ljava/io/File;

    move-result-object v8

    .line 29
    iget-object v9, v4, Lcom/xinzhu/overmind/server/pm/MindReliablePackageSettings;->h:Ljava/util/Map;

    invoke-interface {v9}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Map$Entry;

    .line 30
    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Integer;

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    .line 31
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/xinzhu/overmind/server/pm/MindPackageUserState;

    .line 32
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v2, v10}, Lcom/xinzhu/overmind/b;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 33
    invoke-static {}, Lcom/xinzhu/overmind/server/pm/i;->get()Lcom/xinzhu/overmind/server/pm/i;

    move-result-object v10

    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v12

    iget v13, v4, Lcom/xinzhu/overmind/server/pm/MindReliablePackageSettings;->c:I

    invoke-virtual {v10, v12, v11, v13}, Lcom/xinzhu/overmind/server/pm/i;->installPackageAsTransfer(Ljava/lang/String;II)Lcom/xinzhu/overmind/entity/pm/InstallResult;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_1

    .line 34
    :catch_0
    :cond_4
    :goto_2
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    return-void

    :cond_5
    :try_start_5
    const-string v8, "package settings run into old normal routine"

    .line 35
    invoke-static {v2, v8}, Lcom/xinzhu/overmind/b;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 36
    invoke-static {v4}, Lcom/xinzhu/overmind/utils/k;->v(Ljava/io/File;)[B

    move-result-object v4

    .line 37
    array-length v8, v4

    invoke-virtual {v3, v4, v7, v8}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 38
    invoke-virtual {v3, v7}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 39
    new-instance v4, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;

    invoke-direct {v4, v3}, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;-><init>(Landroid/os/Parcel;)V

    .line 40
    iget-object v8, v4, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->d:Lcom/xinzhu/overmind/entity/pm/InstallOption;

    invoke-virtual {v8, v6}, Lcom/xinzhu/overmind/entity/pm/InstallOption;->c(I)Z

    move-result v8

    if-eqz v8, :cond_6

    .line 41
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v8

    invoke-virtual {v8, p1, v9}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v8

    .line 42
    iget-object v8, v8, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v8, v8, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 43
    iget-object v9, v4, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->b:Lcom/xinzhu/overmind/server/pm/MindPackage;

    iget-object v9, v9, Lcom/xinzhu/overmind/server/pm/MindPackage;->v:Ljava/lang/String;

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_6

    .line 44
    invoke-static {}, Lcom/xinzhu/overmind/server/e;->d()Lcom/xinzhu/overmind/server/e;

    move-result-object v9

    iget-object v10, v4, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->b:Lcom/xinzhu/overmind/server/pm/MindPackage;

    iget-object v10, v10, Lcom/xinzhu/overmind/server/pm/MindPackage;->m:Ljava/lang/String;

    invoke-virtual {v9, v10}, Lcom/xinzhu/overmind/server/e;->k(Ljava/lang/String;)V

    .line 45
    iget-object v9, v4, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->b:Lcom/xinzhu/overmind/server/pm/MindPackage;

    iput-object v8, v9, Lcom/xinzhu/overmind/server/pm/MindPackage;->v:Ljava/lang/String;

    .line 46
    invoke-static {}, Lcom/xinzhu/overmind/server/pm/h;->get()Lcom/xinzhu/overmind/server/pm/h;

    move-result-object v8

    invoke-virtual {v8, v4}, Lcom/xinzhu/overmind/server/pm/h;->updatePackage(Lcom/xinzhu/overmind/server/pm/MindPackageSettings;)I

    .line 47
    :cond_6
    iget-object v8, p0, Lcom/xinzhu/overmind/server/pm/o;->a:Landroid/util/ArrayMap;

    iget-object v9, v4, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->b:Lcom/xinzhu/overmind/server/pm/MindPackage;

    iget-object v9, v9, Lcom/xinzhu/overmind/server/pm/MindPackage;->m:Ljava/lang/String;

    invoke-virtual {v8, v9, v4}, Landroid/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    iget-object v8, v4, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->b:Lcom/xinzhu/overmind/server/pm/MindPackage;

    invoke-static {}, Lcom/xinzhu/overmind/server/pm/MindPackageUserState;->a()Lcom/xinzhu/overmind/server/pm/MindPackageUserState;

    move-result-object v9

    invoke-static {v8, v7, v9, v7}, Lcom/xinzhu/overmind/server/pm/j;->f(Lcom/xinzhu/overmind/server/pm/MindPackage;ILcom/xinzhu/overmind/server/pm/MindPackageUserState;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v9

    iput-object v9, v8, Lcom/xinzhu/overmind/server/pm/MindPackage;->s:Landroid/content/pm/ApplicationInfo;

    .line 49
    invoke-virtual {v4}, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->l()Z

    const-string v4, "new mps save success"

    .line 50
    invoke-static {v2, v4}, Lcom/xinzhu/overmind/b;->c(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 51
    :catch_1
    :cond_7
    :goto_3
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    goto/16 :goto_5

    :catchall_1
    move-exception v4

    .line 52
    :try_start_6
    invoke-virtual {v4}, Ljava/lang/Throwable;->printStackTrace()V

    .line 53
    invoke-virtual {v3, v7}, Landroid/os/Parcel;->setDataPosition(I)V

    const-string v4, "package settings run into old ambulance routine"

    .line 54
    invoke-static {v2, v4}, Lcom/xinzhu/overmind/b;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 55
    new-instance v4, Lcom/xinzhu/overmind/server/pm/MindPackageSettingsAmbulance;

    invoke-direct {v4, v3}, Lcom/xinzhu/overmind/server/pm/MindPackageSettingsAmbulance;-><init>(Landroid/os/Parcel;)V

    .line 56
    new-instance v8, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;

    invoke-direct {v8}, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;-><init>()V

    .line 57
    iget v9, v4, Lcom/xinzhu/overmind/server/pm/MindPackageSettingsAmbulance;->c:I

    iput v9, v8, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->c:I

    .line 58
    iget-object v9, v4, Lcom/xinzhu/overmind/server/pm/MindPackageSettingsAmbulance;->d:Lcom/xinzhu/overmind/entity/pm/InstallOption;

    iput-object v9, v8, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->d:Lcom/xinzhu/overmind/entity/pm/InstallOption;

    .line 59
    iget-object v10, v4, Lcom/xinzhu/overmind/server/pm/MindPackageSettingsAmbulance;->h:Ljava/util/Map;

    iput-object v10, v8, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->h:Ljava/util/Map;

    .line 60
    iget-object v10, v4, Lcom/xinzhu/overmind/server/pm/MindPackageSettingsAmbulance;->e:Ljava/util/HashSet;

    iput-object v10, v8, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->e:Ljava/util/HashSet;

    .line 61
    iget-boolean v10, v4, Lcom/xinzhu/overmind/server/pm/MindPackageSettingsAmbulance;->f:Z

    iput-boolean v10, v8, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->f:Z

    .line 62
    iget-boolean v4, v4, Lcom/xinzhu/overmind/server/pm/MindPackageSettingsAmbulance;->g:Z

    iput-boolean v4, v8, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->g:Z

    .line 63
    iget v4, v9, Lcom/xinzhu/overmind/entity/pm/InstallOption;->b:I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    if-ne v4, v6, :cond_8

    .line 64
    :try_start_7
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {v0, p1, v7}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1

    .line 65
    invoke-static {}, Lcom/xinzhu/overmind/server/pm/i;->get()Lcom/xinzhu/overmind/server/pm/i;

    move-result-object v0

    iget-object p1, p1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object p1, p1, Landroid/content/pm/ApplicationInfo;->publicSourceDir:Ljava/lang/String;

    invoke-static {}, Lcom/xinzhu/overmind/entity/pm/InstallOption;->b()Lcom/xinzhu/overmind/entity/pm/InstallOption;

    move-result-object v1

    invoke-virtual {v0, p1, v1, v5}, Lcom/xinzhu/overmind/server/pm/i;->installPackageAsUser(Ljava/lang/String;Lcom/xinzhu/overmind/entity/pm/InstallOption;I)Lcom/xinzhu/overmind/entity/pm/InstallResult;
    :try_end_7
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    goto :goto_3

    .line 66
    :cond_8
    :try_start_8
    invoke-static {p1}, Lcom/xinzhu/overmind/a;->d(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    .line 67
    iget-object v4, v8, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->h:Ljava/util/Map;

    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    .line 68
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 69
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/xinzhu/overmind/server/pm/MindPackageUserState;

    .line 70
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Lcom/xinzhu/overmind/b;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 71
    invoke-static {}, Lcom/xinzhu/overmind/server/pm/i;->get()Lcom/xinzhu/overmind/server/pm/i;

    move-result-object v5

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v7

    iget v9, v8, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->c:I

    invoke-virtual {v5, v7, v6, v9}, Lcom/xinzhu/overmind/server/pm/i;->installPackageAsTransfer(Ljava/lang/String;II)Lcom/xinzhu/overmind/entity/pm/InstallResult;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    goto :goto_4

    :goto_5
    return-void

    :catchall_2
    move-exception p1

    .line 72
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 73
    goto :goto_7

    :goto_6
    throw p1

    :goto_7
    goto :goto_6
.end method


# virtual methods
.method c(Ljava/lang/String;Landroid/content/pm/PackageParser$Package;Lcom/xinzhu/overmind/entity/pm/InstallOption;)Lcom/xinzhu/overmind/server/pm/MindPackageSettings;
    .locals 2

    .line 1
    new-instance v0, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;

    invoke-direct {v0}, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;-><init>()V

    .line 2
    iput-object p3, v0, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->d:Lcom/xinzhu/overmind/entity/pm/InstallOption;

    .line 3
    new-instance p3, Lcom/xinzhu/overmind/server/pm/MindPackage;

    invoke-direct {p3, p2}, Lcom/xinzhu/overmind/server/pm/MindPackage;-><init>(Landroid/content/pm/PackageParser$Package;)V

    iput-object p3, v0, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->b:Lcom/xinzhu/overmind/server/pm/MindPackage;

    .line 4
    iget-object p2, p0, Lcom/xinzhu/overmind/server/pm/o;->a:Landroid/util/ArrayMap;

    monitor-enter p2

    .line 5
    :try_start_0
    iget-object p3, p0, Lcom/xinzhu/overmind/server/pm/o;->a:Landroid/util/ArrayMap;

    invoke-virtual {p3, p1}, Landroid/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;

    if-eqz p3, :cond_0

    .line 6
    iget v1, p3, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->c:I

    iput v1, v0, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->c:I

    .line 7
    iget-object v1, p3, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->h:Ljava/util/Map;

    iput-object v1, v0, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->h:Ljava/util/Map;

    .line 8
    iget-boolean v1, p3, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->f:Z

    iput-boolean v1, v0, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->f:Z

    .line 9
    iget-boolean p3, p3, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->g:Z

    iput-boolean p3, v0, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->g:Z

    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/server/pm/o;->g(Lcom/xinzhu/overmind/server/pm/MindPackageSettings;)Z

    move-result p3

    if-eqz p3, :cond_2

    .line 11
    :goto_0
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    iget-object p2, p0, Lcom/xinzhu/overmind/server/pm/o;->a:Landroid/util/ArrayMap;

    iget-object p3, v0, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->b:Lcom/xinzhu/overmind/server/pm/MindPackage;

    iget-object p3, p3, Lcom/xinzhu/overmind/server/pm/MindPackage;->m:Ljava/lang/String;

    invoke-virtual {p2, p3, v0}, Landroid/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    iget-object p2, v0, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->b:Lcom/xinzhu/overmind/server/pm/MindPackage;

    invoke-static {}, Lcom/xinzhu/overmind/server/pm/MindPackageUserState;->a()Lcom/xinzhu/overmind/server/pm/MindPackageUserState;

    move-result-object p3

    const/4 v1, 0x0

    invoke-static {p2, v1, p3, v1}, Lcom/xinzhu/overmind/server/pm/j;->f(Lcom/xinzhu/overmind/server/pm/MindPackage;ILcom/xinzhu/overmind/server/pm/MindPackageUserState;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p3

    iput-object p3, p2, Lcom/xinzhu/overmind/server/pm/MindPackage;->s:Landroid/content/pm/ApplicationInfo;

    .line 14
    invoke-static {p1}, Lcom/xinzhu/overmind/client/hook/env/b;->f(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->get()Lcom/xinzhu/overmind/Overmind;

    move-result-object p1

    invoke-virtual {p1}, Lcom/xinzhu/overmind/Overmind;->use32BitMainPackage()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {v0}, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->r()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    .line 15
    invoke-virtual {v0, p1}, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->o(Z)V

    :cond_1
    return-object v0

    .line 16
    :cond_2
    :try_start_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p3, "registerAppIdLPw err."

    invoke-direct {p1, p3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 17
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method d(Ljava/lang/String;Landroid/content/pm/PackageParser$Package;I)Lcom/xinzhu/overmind/server/pm/MindPackageSettings;
    .locals 2

    .line 1
    new-instance v0, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;

    invoke-direct {v0}, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;-><init>()V

    .line 2
    new-instance v1, Lcom/xinzhu/overmind/server/pm/MindPackage;

    invoke-direct {v1, p2}, Lcom/xinzhu/overmind/server/pm/MindPackage;-><init>(Landroid/content/pm/PackageParser$Package;)V

    iput-object v1, v0, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->b:Lcom/xinzhu/overmind/server/pm/MindPackage;

    .line 3
    iget-object p2, p0, Lcom/xinzhu/overmind/server/pm/o;->a:Landroid/util/ArrayMap;

    monitor-enter p2

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/xinzhu/overmind/server/pm/o;->a:Landroid/util/ArrayMap;

    invoke-virtual {v1, p1}, Landroid/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;

    if-eqz p1, :cond_0

    .line 5
    iget p3, p1, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->c:I

    iput p3, v0, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->c:I

    .line 6
    iget-object p1, p1, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->h:Ljava/util/Map;

    iput-object p1, v0, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->h:Ljava/util/Map;

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p0, v0, p3}, Lcom/xinzhu/overmind/server/pm/o;->h(Lcom/xinzhu/overmind/server/pm/MindPackageSettings;I)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 8
    :goto_0
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    iget-object p1, p0, Lcom/xinzhu/overmind/server/pm/o;->a:Landroid/util/ArrayMap;

    iget-object p2, v0, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->b:Lcom/xinzhu/overmind/server/pm/MindPackage;

    iget-object p2, p2, Lcom/xinzhu/overmind/server/pm/MindPackage;->m:Ljava/lang/String;

    invoke-virtual {p1, p2, v0}, Landroid/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    iget-object p1, v0, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->b:Lcom/xinzhu/overmind/server/pm/MindPackage;

    invoke-static {}, Lcom/xinzhu/overmind/server/pm/MindPackageUserState;->a()Lcom/xinzhu/overmind/server/pm/MindPackageUserState;

    move-result-object p2

    const/4 p3, 0x0

    invoke-static {p1, p3, p2, p3}, Lcom/xinzhu/overmind/server/pm/j;->f(Lcom/xinzhu/overmind/server/pm/MindPackage;ILcom/xinzhu/overmind/server/pm/MindPackageUserState;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p2

    iput-object p2, p1, Lcom/xinzhu/overmind/server/pm/MindPackage;->s:Landroid/content/pm/ApplicationInfo;

    return-object v0

    .line 11
    :cond_1
    :try_start_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p3, "registerAppIdLPw err."

    invoke-direct {p1, p3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 12
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public e(I)Lcom/xinzhu/overmind/server/pm/MindPackageSettings;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xinzhu/overmind/server/pm/o;->a:Landroid/util/ArrayMap;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/xinzhu/overmind/server/pm/o;->a:Landroid/util/ArrayMap;

    invoke-virtual {v1}, Landroid/util/ArrayMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;

    .line 3
    iget v3, v2, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->c:I

    if-ne v3, p1, :cond_0

    .line 4
    monitor-exit v0

    return-object v2

    :cond_1
    const/4 p1, 0x0

    .line 5
    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 6
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :goto_0
    throw p1

    :goto_1
    goto :goto_0
.end method

.method g(Lcom/xinzhu/overmind/server/pm/MindPackageSettings;)Z
    .locals 2

    .line 1
    iget v0, p1, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->c:I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0, p1}, Lcom/xinzhu/overmind/server/pm/o;->a(Lcom/xinzhu/overmind/server/pm/MindPackageSettings;)I

    move-result v0

    iput v0, p1, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->c:I

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 3
    :goto_0
    iget p1, p1, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->c:I

    if-gez p1, :cond_1

    goto :goto_1

    :cond_1
    move v1, v0

    .line 4
    :goto_1
    invoke-direct {p0}, Lcom/xinzhu/overmind/server/pm/o;->i()V

    return v1
.end method

.method h(Lcom/xinzhu/overmind/server/pm/MindPackageSettings;I)Z
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "registerAppIdTransfer "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->b:Lcom/xinzhu/overmind/server/pm/MindPackage;

    iget-object v1, v1, Lcom/xinzhu/overmind/server/pm/MindPackage;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Settings"

    invoke-static {v1, v0}, Lcom/xinzhu/overmind/b;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget v0, p1, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->c:I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 3
    invoke-direct {p0, p1, p2}, Lcom/xinzhu/overmind/server/pm/o;->b(Lcom/xinzhu/overmind/server/pm/MindPackageSettings;I)I

    move-result p2

    iput p2, p1, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->c:I

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 4
    :goto_0
    iget p1, p1, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->c:I

    if-gez p1, :cond_1

    goto :goto_1

    :cond_1
    move v1, p2

    .line 5
    :goto_1
    invoke-direct {p0}, Lcom/xinzhu/overmind/server/pm/o;->i()V

    return v1
.end method

.method public j()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/xinzhu/overmind/server/pm/o;->a:Landroid/util/ArrayMap;

    monitor-enter v0

    .line 2
    :try_start_0
    invoke-static {}, Lcom/xinzhu/overmind/a;->h()Ljava/io/File;

    move-result-object v1

    .line 3
    invoke-static {v1}, Lcom/xinzhu/overmind/utils/k;->p(Ljava/io/File;)Z

    .line 4
    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    .line 5
    invoke-static {v1}, Lcom/xinzhu/overmind/utils/d;->o([Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 6
    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v4, v1, v3

    .line 7
    invoke-virtual {v4}, Ljava/io/File;->isDirectory()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    const-string v6, "system"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    .line 8
    :cond_0
    invoke-direct {p0, v4}, Lcom/xinzhu/overmind/server/pm/o;->k(Ljava/io/File;)V

    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 9
    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :goto_2
    throw v1

    :goto_3
    goto :goto_2
.end method
