.class public Lcom/xinzhu/overmind/utils/helpers/j;
.super Ljava/lang/Object;
.source "ServiceInfoFixHelper.java"


# static fields
.field private static final a:Ljava/lang/String; = "j"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/os/Parcel;)Landroid/content/pm/ServiceInfo;
    .locals 1

    .line 1
    :try_start_0
    invoke-static {}, Lcom/xinzhu/overmind/utils/e;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {p0}, Lcom/xinzhu/overmind/utils/helpers/j;->b(Landroid/os/Parcel;)Landroid/content/pm/ServiceInfo;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    .line 3
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static b(Landroid/os/Parcel;)Landroid/content/pm/ServiceInfo;
    .locals 11
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/xinzhu/haunted/android/os/p;

    invoke-direct {v0, p0}, Lcom/xinzhu/haunted/android/os/p;-><init>(Ljava/lang/Object;)V

    .line 2
    new-instance v1, Landroid/content/pm/ServiceInfo;

    invoke-direct {v1}, Landroid/content/pm/ServiceInfo;-><init>()V

    .line 3
    new-instance v2, Lcom/xinzhu/haunted/android/content/pm/l;

    invoke-direct {v2, v1}, Lcom/xinzhu/haunted/android/content/pm/l;-><init>(Ljava/lang/Object;)V

    .line 4
    new-instance v3, Lcom/xinzhu/haunted/android/content/pm/i;

    invoke-direct {v3, v1}, Lcom/xinzhu/haunted/android/content/pm/i;-><init>(Ljava/lang/Object;)V

    .line 5
    invoke-virtual {p0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    .line 6
    sget-object v5, Lcom/xinzhu/overmind/utils/helpers/j;->a:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "class name "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v5, v4}, Lcom/xinzhu/overmind/b;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    .line 8
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    .line 9
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    iput v4, v1, Landroid/content/pm/ServiceInfo;->labelRes:I

    .line 10
    sget-object v4, Landroid/text/TextUtils;->CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;

    .line 11
    invoke-interface {v4, p0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    iput-object v4, v1, Landroid/content/pm/ServiceInfo;->nonLocalizedLabel:Ljava/lang/CharSequence;

    .line 12
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    iput v4, v1, Landroid/content/pm/ServiceInfo;->icon:I

    .line 13
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    iput v4, v1, Landroid/content/pm/ServiceInfo;->logo:I

    .line 14
    invoke-virtual {p0}, Landroid/os/Parcel;->readBundle()Landroid/os/Bundle;

    move-result-object v4

    iput-object v4, v1, Landroid/content/pm/ServiceInfo;->metaData:Landroid/os/Bundle;

    .line 15
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    iput v4, v1, Landroid/content/pm/ServiceInfo;->banner:I

    .line 16
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/i;->c(I)Z

    .line 17
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    const-string p0, "unexpected squashed applicationinfo"

    .line 18
    invoke-static {v5, p0}, Lcom/xinzhu/overmind/b;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 19
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getStackTraceElement()V

    return-object v4

    .line 20
    :cond_0
    new-instance v3, Landroid/content/pm/ApplicationInfo;

    invoke-direct {v3}, Landroid/content/pm/ApplicationInfo;-><init>()V

    iput-object v3, v1, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 21
    new-instance v3, Lcom/xinzhu/haunted/android/content/pm/b;

    iget-object v5, v1, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-direct {v3, v5}, Lcom/xinzhu/haunted/android/content/pm/b;-><init>(Ljava/lang/Object;)V

    .line 22
    iget-object v5, v1, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v5, Landroid/content/pm/ApplicationInfo;->name:Ljava/lang/String;

    .line 23
    iget-object v5, v1, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v5, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 24
    iget-object v5, v1, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v6

    iput v6, v5, Landroid/content/pm/ApplicationInfo;->labelRes:I

    .line 25
    iget-object v5, v1, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    sget-object v6, Landroid/text/TextUtils;->CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;

    .line 26
    invoke-interface {v6, p0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/CharSequence;

    iput-object v6, v5, Landroid/content/pm/ApplicationInfo;->nonLocalizedLabel:Ljava/lang/CharSequence;

    .line 27
    iget-object v5, v1, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v6

    iput v6, v5, Landroid/content/pm/ApplicationInfo;->icon:I

    .line 28
    iget-object v5, v1, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v6

    iput v6, v5, Landroid/content/pm/ApplicationInfo;->logo:I

    .line 29
    iget-object v5, v1, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {p0}, Landroid/os/Parcel;->readBundle()Landroid/os/Bundle;

    move-result-object v6

    iput-object v6, v5, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 30
    iget-object v5, v1, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v6

    iput v6, v5, Landroid/content/pm/ApplicationInfo;->banner:I

    .line 31
    new-instance v5, Lcom/xinzhu/haunted/android/content/pm/i;

    invoke-direct {v5, v1}, Lcom/xinzhu/haunted/android/content/pm/i;-><init>(Ljava/lang/Object;)V

    .line 32
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v6

    invoke-virtual {v5, v6}, Lcom/xinzhu/haunted/android/content/pm/i;->c(I)Z

    .line 33
    iget-object v5, v1, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v5, Landroid/content/pm/ApplicationInfo;->taskAffinity:Ljava/lang/String;

    .line 34
    iget-object v5, v1, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v5, Landroid/content/pm/ApplicationInfo;->permission:Ljava/lang/String;

    .line 35
    iget-object v5, v1, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v5, Landroid/content/pm/ApplicationInfo;->processName:Ljava/lang/String;

    .line 36
    iget-object v5, v1, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v5, Landroid/content/pm/ApplicationInfo;->className:Ljava/lang/String;

    .line 37
    iget-object v5, v1, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v6

    iput v6, v5, Landroid/content/pm/ApplicationInfo;->theme:I

    .line 38
    iget-object v5, v1, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v6

    iput v6, v5, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 39
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v5

    invoke-virtual {v3, v5}, Lcom/xinzhu/haunted/android/content/pm/b;->c1(I)Z

    .line 40
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v5

    invoke-virtual {v3, v5}, Lcom/xinzhu/haunted/android/content/pm/b;->d1(I)Z

    .line 41
    iget-object v5, v1, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v6

    iput v6, v5, Landroid/content/pm/ApplicationInfo;->requiresSmallestWidthDp:I

    .line 42
    iget-object v5, v1, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v6

    iput v6, v5, Landroid/content/pm/ApplicationInfo;->compatibleWidthLimitDp:I

    .line 43
    iget-object v5, v1, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v6

    iput v6, v5, Landroid/content/pm/ApplicationInfo;->largestWidthLimitDp:I

    .line 44
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v5

    if-eqz v5, :cond_1

    .line 45
    iget-object v5, v1, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    new-instance v6, Ljava/util/UUID;

    invoke-virtual {p0}, Landroid/os/Parcel;->readLong()J

    move-result-wide v7

    invoke-virtual {p0}, Landroid/os/Parcel;->readLong()J

    move-result-wide v9

    invoke-direct {v6, v7, v8, v9, v10}, Ljava/util/UUID;-><init>(JJ)V

    iput-object v6, v5, Landroid/content/pm/ApplicationInfo;->storageUuid:Ljava/util/UUID;

    .line 46
    iget-object v5, v1, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v5, v5, Landroid/content/pm/ApplicationInfo;->storageUuid:Ljava/util/UUID;

    invoke-static {v5}, Lcom/xinzhu/haunted/android/os/storage/c;->f(Ljava/util/UUID;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Lcom/xinzhu/haunted/android/content/pm/b;->t1(Ljava/lang/String;)Z

    .line 47
    :cond_1
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Lcom/xinzhu/haunted/android/content/pm/b;->j1(Ljava/lang/String;)Z

    .line 48
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Lcom/xinzhu/haunted/android/content/pm/b;->i1(Ljava/lang/String;)Z

    .line 49
    iget-object v5, v1, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v5, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 50
    iget-object v5, v1, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v5, Landroid/content/pm/ApplicationInfo;->publicSourceDir:Ljava/lang/String;

    .line 51
    iget-object v5, v1, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->d()[Ljava/lang/String;

    move-result-object v6

    iput-object v6, v5, Landroid/content/pm/ApplicationInfo;->splitNames:[Ljava/lang/String;

    .line 52
    iget-object v5, v1, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->d()[Ljava/lang/String;

    move-result-object v6

    iput-object v6, v5, Landroid/content/pm/ApplicationInfo;->splitSourceDirs:[Ljava/lang/String;

    .line 53
    iget-object v5, v1, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->d()[Ljava/lang/String;

    move-result-object v6

    iput-object v6, v5, Landroid/content/pm/ApplicationInfo;->splitPublicSourceDirs:[Ljava/lang/String;

    .line 54
    const-class v5, [I

    invoke-virtual {p0, v4, v5}, Landroid/os/Parcel;->readSparseArray(Ljava/lang/ClassLoader;Ljava/lang/Class;)Landroid/util/SparseArray;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->q1(Landroid/util/SparseArray;)Z

    .line 55
    iget-object v4, v1, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v4, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    .line 56
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->n1(Ljava/lang/String;)Z

    .line 57
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->X0(Ljava/lang/String;)Z

    .line 58
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v4, :cond_2

    const/4 v4, 0x1

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    :goto_0
    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->Y0(Z)Z

    .line 59
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->b1(Ljava/lang/String;)Z

    .line 60
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->m1(Ljava/lang/String;)Z

    .line 61
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->d()[Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->f1([Ljava/lang/String;)Z

    .line 62
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->d()[Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->a1([Ljava/lang/String;)Z

    .line 63
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->k1(Ljava/lang/String;)Z

    .line 64
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->l1(Ljava/lang/String;)Z

    .line 65
    iget-object v4, v1, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->d()[Ljava/lang/String;

    move-result-object v7

    iput-object v7, v4, Landroid/content/pm/ApplicationInfo;->sharedLibraryFiles:[Ljava/lang/String;

    .line 66
    sget-object v4, Landroid/content/pm/SharedLibraryInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p0, v4}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->o1(Ljava/util/List;)Z

    .line 67
    iget-object v4, v1, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v4, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    .line 68
    iget-object v4, v1, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v4, Landroid/content/pm/ApplicationInfo;->deviceProtectedDataDir:Ljava/lang/String;

    .line 69
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->J0(Ljava/lang/String;)Z

    .line 70
    iget-object v4, v1, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v7

    iput v7, v4, Landroid/content/pm/ApplicationInfo;->uid:I

    .line 71
    iget-object v4, v1, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v7

    iput v7, v4, Landroid/content/pm/ApplicationInfo;->minSdkVersion:I

    .line 72
    iget-object v4, v1, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v7

    iput v7, v4, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 73
    invoke-virtual {p0}, Landroid/os/Parcel;->readLong()J

    move-result-wide v7

    invoke-virtual {v3, v7, v8}, Lcom/xinzhu/haunted/android/content/pm/b;->F0(J)V

    .line 74
    iget-object v4, v1, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v7

    if-eqz v7, :cond_3

    const/4 v7, 0x1

    goto :goto_1

    :cond_3
    const/4 v7, 0x0

    :goto_1
    iput-boolean v7, v4, Landroid/content/pm/ApplicationInfo;->enabled:Z

    .line 75
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->O0(I)Z

    .line 76
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->T0(I)Z

    .line 77
    iget-object v4, v1, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v4, Landroid/content/pm/ApplicationInfo;->manageSpaceActivityName:Ljava/lang/String;

    .line 78
    iget-object v4, v1, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v4, Landroid/content/pm/ApplicationInfo;->backupAgentName:Ljava/lang/String;

    .line 79
    iget-object v4, v1, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v7

    iput v7, v4, Landroid/content/pm/ApplicationInfo;->descriptionRes:I

    .line 80
    iget-object v4, v1, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v7

    iput v7, v4, Landroid/content/pm/ApplicationInfo;->uiOptions:I

    .line 81
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->P0(I)Z

    .line 82
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->L0(I)Z

    .line 83
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    if-eqz v4, :cond_4

    const/4 v4, 0x1

    goto :goto_2

    :cond_4
    const/4 v4, 0x0

    :goto_2
    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->K0(Z)Z

    .line 84
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->Z0(I)Z

    .line 85
    iget-object v4, v1, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v7

    iput v7, v4, Landroid/content/pm/ApplicationInfo;->category:I

    .line 86
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->r1(I)Z

    .line 87
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->H0(Ljava/lang/String;)Z

    .line 88
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->d()[Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->p1([Ljava/lang/String;)Z

    .line 89
    iget-object v4, v1, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v7

    iput v7, v4, Landroid/content/pm/ApplicationInfo;->compileSdkVersion:I

    .line 90
    iget-object v4, v1, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v4, Landroid/content/pm/ApplicationInfo;->compileSdkVersionCodename:Ljava/lang/String;

    .line 91
    iget-object v4, v1, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v4, Landroid/content/pm/ApplicationInfo;->appComponentFactory:Ljava/lang/String;

    .line 92
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->S0(I)Z

    .line 93
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->g1(I)Z

    .line 94
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->U0(I)Z

    .line 95
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    if-eqz v4, :cond_5

    const/4 v4, 0x1

    goto :goto_3

    :cond_5
    const/4 v4, 0x0

    :goto_3
    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->R0(Z)Z

    .line 96
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->u1(Ljava/lang/String;)Z

    .line 97
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->Q0(I)Z

    .line 98
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->V0(I)Z

    .line 99
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->W0(I)Z

    .line 100
    invoke-static {}, Lcom/xinzhu/haunted/android/content/pm/b;->r0()Ljava/lang/Object;

    move-result-object v4

    .line 101
    :try_start_0
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    const-string v8, "unparcel"

    new-array v9, v6, [Ljava/lang/Class;

    const-class v10, Landroid/os/Parcel;

    aput-object v10, v9, v5

    invoke-virtual {v7, v8, v9}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    .line 102
    invoke-virtual {v7, v6}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    new-array v8, v6, [Ljava/lang/Object;

    aput-object p0, v8, v5

    .line 103
    invoke-virtual {v7, v4, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->e1(Ljava/lang/Boolean;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception v3

    .line 104
    invoke-virtual {v3}, Ljava/lang/Throwable;->printStackTrace()V

    .line 105
    :goto_4
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Landroid/content/pm/ServiceInfo;->processName:Ljava/lang/String;

    .line 106
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Landroid/content/pm/ServiceInfo;->splitName:Ljava/lang/String;

    .line 107
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->d()[Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Landroid/content/pm/ServiceInfo;->attributionTags:[Ljava/lang/String;

    .line 108
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    iput v3, v1, Landroid/content/pm/ServiceInfo;->descriptionRes:I

    .line 109
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-eqz v3, :cond_6

    const/4 v3, 0x1

    goto :goto_5

    :cond_6
    const/4 v3, 0x0

    :goto_5
    iput-boolean v3, v1, Landroid/content/pm/ServiceInfo;->enabled:Z

    .line 110
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-eqz v3, :cond_7

    const/4 v3, 0x1

    goto :goto_6

    :cond_7
    const/4 v3, 0x0

    :goto_6
    iput-boolean v3, v1, Landroid/content/pm/ServiceInfo;->exported:Z

    .line 111
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-eqz v3, :cond_8

    const/4 v5, 0x1

    :cond_8
    iput-boolean v5, v1, Landroid/content/pm/ServiceInfo;->directBootAware:Z

    .line 112
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Landroid/content/pm/ServiceInfo;->permission:Ljava/lang/String;

    .line 113
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, v1, Landroid/content/pm/ServiceInfo;->flags:I

    .line 114
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result p0

    invoke-virtual {v2, p0}, Lcom/xinzhu/haunted/android/content/pm/l;->c(I)Z

    .line 115
    sget-object p0, Lcom/xinzhu/overmind/utils/helpers/j;->a:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "wtf "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, Landroid/content/pm/ServiceInfo;->processName:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/xinzhu/overmind/b;->c(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1
.end method
