.class public Lcom/xinzhu/overmind/utils/helpers/a;
.super Ljava/lang/Object;
.source "ActivityInfoFixHelper.java"


# static fields
.field private static final a:Ljava/lang/String; = "a"


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

.method public static a(Landroid/os/Parcel;)Landroid/content/pm/ActivityInfo;
    .locals 1

    .line 1
    :try_start_0
    invoke-static {}, Lcom/xinzhu/overmind/utils/e;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {p0}, Lcom/xinzhu/overmind/utils/helpers/a;->b(Landroid/os/Parcel;)Landroid/content/pm/ActivityInfo;

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

.method private static b(Landroid/os/Parcel;)Landroid/content/pm/ActivityInfo;
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
    new-instance v1, Landroid/content/pm/ActivityInfo;

    invoke-direct {v1}, Landroid/content/pm/ActivityInfo;-><init>()V

    .line 3
    new-instance v2, Lcom/xinzhu/haunted/android/content/pm/a;

    invoke-direct {v2, v1}, Lcom/xinzhu/haunted/android/content/pm/a;-><init>(Ljava/lang/Object;)V

    .line 4
    new-instance v3, Lcom/xinzhu/haunted/android/content/pm/i;

    invoke-direct {v3, v1}, Lcom/xinzhu/haunted/android/content/pm/i;-><init>(Ljava/lang/Object;)V

    .line 5
    sget-object v4, Lcom/xinzhu/overmind/utils/helpers/a;->a:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "class name "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/xinzhu/overmind/b;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v1, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 7
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v1, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 8
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v5

    iput v5, v1, Landroid/content/pm/ActivityInfo;->labelRes:I

    .line 9
    sget-object v5, Landroid/text/TextUtils;->CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;

    .line 10
    invoke-interface {v5, p0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/CharSequence;

    iput-object v5, v1, Landroid/content/pm/ActivityInfo;->nonLocalizedLabel:Ljava/lang/CharSequence;

    .line 11
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v5

    iput v5, v1, Landroid/content/pm/ActivityInfo;->icon:I

    .line 12
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v5

    iput v5, v1, Landroid/content/pm/ActivityInfo;->logo:I

    .line 13
    invoke-virtual {p0}, Landroid/os/Parcel;->readBundle()Landroid/os/Bundle;

    move-result-object v5

    iput-object v5, v1, Landroid/content/pm/ActivityInfo;->metaData:Landroid/os/Bundle;

    .line 14
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v5

    iput v5, v1, Landroid/content/pm/ActivityInfo;->banner:I

    .line 15
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v5

    invoke-virtual {v3, v5}, Lcom/xinzhu/haunted/android/content/pm/i;->c(I)Z

    .line 16
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    const/4 v5, 0x0

    if-eqz v3, :cond_0

    const-string p0, "unexpected squashed applicationinfo"

    .line 17
    invoke-static {v4, p0}, Lcom/xinzhu/overmind/b;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getStackTraceElement()V

    return-object v5

    .line 19
    :cond_0
    new-instance v3, Landroid/content/pm/ApplicationInfo;

    invoke-direct {v3}, Landroid/content/pm/ApplicationInfo;-><init>()V

    iput-object v3, v1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 20
    new-instance v3, Lcom/xinzhu/haunted/android/content/pm/b;

    iget-object v4, v1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-direct {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;-><init>(Ljava/lang/Object;)V

    .line 21
    iget-object v4, v1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v4, Landroid/content/pm/ApplicationInfo;->name:Ljava/lang/String;

    .line 22
    iget-object v4, v1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v4, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 23
    iget-object v4, v1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v6

    iput v6, v4, Landroid/content/pm/ApplicationInfo;->labelRes:I

    .line 24
    iget-object v4, v1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    sget-object v6, Landroid/text/TextUtils;->CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;

    .line 25
    invoke-interface {v6, p0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/CharSequence;

    iput-object v6, v4, Landroid/content/pm/ApplicationInfo;->nonLocalizedLabel:Ljava/lang/CharSequence;

    .line 26
    iget-object v4, v1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v6

    iput v6, v4, Landroid/content/pm/ApplicationInfo;->icon:I

    .line 27
    iget-object v4, v1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v6

    iput v6, v4, Landroid/content/pm/ApplicationInfo;->logo:I

    .line 28
    iget-object v4, v1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {p0}, Landroid/os/Parcel;->readBundle()Landroid/os/Bundle;

    move-result-object v6

    iput-object v6, v4, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 29
    iget-object v4, v1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v6

    iput v6, v4, Landroid/content/pm/ApplicationInfo;->banner:I

    .line 30
    new-instance v4, Lcom/xinzhu/haunted/android/content/pm/i;

    invoke-direct {v4, v1}, Lcom/xinzhu/haunted/android/content/pm/i;-><init>(Ljava/lang/Object;)V

    .line 31
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v6

    invoke-virtual {v4, v6}, Lcom/xinzhu/haunted/android/content/pm/i;->c(I)Z

    .line 32
    iget-object v4, v1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v4, Landroid/content/pm/ApplicationInfo;->taskAffinity:Ljava/lang/String;

    .line 33
    iget-object v4, v1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v4, Landroid/content/pm/ApplicationInfo;->permission:Ljava/lang/String;

    .line 34
    iget-object v4, v1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v4, Landroid/content/pm/ApplicationInfo;->processName:Ljava/lang/String;

    .line 35
    iget-object v4, v1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v4, Landroid/content/pm/ApplicationInfo;->className:Ljava/lang/String;

    .line 36
    iget-object v4, v1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v6

    iput v6, v4, Landroid/content/pm/ApplicationInfo;->theme:I

    .line 37
    iget-object v4, v1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v6

    iput v6, v4, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 38
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->c1(I)Z

    .line 39
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->d1(I)Z

    .line 40
    iget-object v4, v1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v6

    iput v6, v4, Landroid/content/pm/ApplicationInfo;->requiresSmallestWidthDp:I

    .line 41
    iget-object v4, v1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v6

    iput v6, v4, Landroid/content/pm/ApplicationInfo;->compatibleWidthLimitDp:I

    .line 42
    iget-object v4, v1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v6

    iput v6, v4, Landroid/content/pm/ApplicationInfo;->largestWidthLimitDp:I

    .line 43
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    if-eqz v4, :cond_1

    .line 44
    iget-object v4, v1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    new-instance v6, Ljava/util/UUID;

    invoke-virtual {p0}, Landroid/os/Parcel;->readLong()J

    move-result-wide v7

    invoke-virtual {p0}, Landroid/os/Parcel;->readLong()J

    move-result-wide v9

    invoke-direct {v6, v7, v8, v9, v10}, Ljava/util/UUID;-><init>(JJ)V

    iput-object v6, v4, Landroid/content/pm/ApplicationInfo;->storageUuid:Ljava/util/UUID;

    .line 45
    iget-object v4, v1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v4, v4, Landroid/content/pm/ApplicationInfo;->storageUuid:Ljava/util/UUID;

    invoke-static {v4}, Lcom/xinzhu/haunted/android/os/storage/c;->f(Ljava/util/UUID;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->t1(Ljava/lang/String;)Z

    .line 46
    :cond_1
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->j1(Ljava/lang/String;)Z

    .line 47
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->i1(Ljava/lang/String;)Z

    .line 48
    iget-object v4, v1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v4, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 49
    iget-object v4, v1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v4, Landroid/content/pm/ApplicationInfo;->publicSourceDir:Ljava/lang/String;

    .line 50
    iget-object v4, v1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->d()[Ljava/lang/String;

    move-result-object v6

    iput-object v6, v4, Landroid/content/pm/ApplicationInfo;->splitNames:[Ljava/lang/String;

    .line 51
    iget-object v4, v1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->d()[Ljava/lang/String;

    move-result-object v6

    iput-object v6, v4, Landroid/content/pm/ApplicationInfo;->splitSourceDirs:[Ljava/lang/String;

    .line 52
    iget-object v4, v1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->d()[Ljava/lang/String;

    move-result-object v6

    iput-object v6, v4, Landroid/content/pm/ApplicationInfo;->splitPublicSourceDirs:[Ljava/lang/String;

    .line 53
    const-class v4, [I

    invoke-virtual {p0, v5, v4}, Landroid/os/Parcel;->readSparseArray(Ljava/lang/ClassLoader;Ljava/lang/Class;)Landroid/util/SparseArray;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->q1(Landroid/util/SparseArray;)Z

    .line 54
    iget-object v4, v1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v4, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    .line 55
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->n1(Ljava/lang/String;)Z

    .line 56
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->X0(Ljava/lang/String;)Z

    .line 57
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

    .line 58
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->b1(Ljava/lang/String;)Z

    .line 59
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->m1(Ljava/lang/String;)Z

    .line 60
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->d()[Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->f1([Ljava/lang/String;)Z

    .line 61
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->d()[Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->a1([Ljava/lang/String;)Z

    .line 62
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->k1(Ljava/lang/String;)Z

    .line 63
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->l1(Ljava/lang/String;)Z

    .line 64
    iget-object v4, v1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->d()[Ljava/lang/String;

    move-result-object v7

    iput-object v7, v4, Landroid/content/pm/ApplicationInfo;->sharedLibraryFiles:[Ljava/lang/String;

    .line 65
    sget-object v4, Landroid/content/pm/SharedLibraryInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p0, v4}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->o1(Ljava/util/List;)Z

    .line 66
    iget-object v4, v1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v4, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    .line 67
    iget-object v4, v1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v4, Landroid/content/pm/ApplicationInfo;->deviceProtectedDataDir:Ljava/lang/String;

    .line 68
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->J0(Ljava/lang/String;)Z

    .line 69
    iget-object v4, v1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v7

    iput v7, v4, Landroid/content/pm/ApplicationInfo;->uid:I

    .line 70
    iget-object v4, v1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v7

    iput v7, v4, Landroid/content/pm/ApplicationInfo;->minSdkVersion:I

    .line 71
    iget-object v4, v1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v7

    iput v7, v4, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 72
    invoke-virtual {p0}, Landroid/os/Parcel;->readLong()J

    move-result-wide v7

    invoke-virtual {v3, v7, v8}, Lcom/xinzhu/haunted/android/content/pm/b;->F0(J)V

    .line 73
    iget-object v4, v1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v7

    if-eqz v7, :cond_3

    const/4 v7, 0x1

    goto :goto_1

    :cond_3
    const/4 v7, 0x0

    :goto_1
    iput-boolean v7, v4, Landroid/content/pm/ApplicationInfo;->enabled:Z

    .line 74
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->O0(I)Z

    .line 75
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->T0(I)Z

    .line 76
    iget-object v4, v1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v4, Landroid/content/pm/ApplicationInfo;->manageSpaceActivityName:Ljava/lang/String;

    .line 77
    iget-object v4, v1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v4, Landroid/content/pm/ApplicationInfo;->backupAgentName:Ljava/lang/String;

    .line 78
    iget-object v4, v1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v7

    iput v7, v4, Landroid/content/pm/ApplicationInfo;->descriptionRes:I

    .line 79
    iget-object v4, v1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v7

    iput v7, v4, Landroid/content/pm/ApplicationInfo;->uiOptions:I

    .line 80
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->P0(I)Z

    .line 81
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->L0(I)Z

    .line 82
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    if-eqz v4, :cond_4

    const/4 v4, 0x1

    goto :goto_2

    :cond_4
    const/4 v4, 0x0

    :goto_2
    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->K0(Z)Z

    .line 83
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->Z0(I)Z

    .line 84
    iget-object v4, v1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v7

    iput v7, v4, Landroid/content/pm/ApplicationInfo;->category:I

    .line 85
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->r1(I)Z

    .line 86
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->H0(Ljava/lang/String;)Z

    .line 87
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->d()[Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->p1([Ljava/lang/String;)Z

    .line 88
    iget-object v4, v1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v7

    iput v7, v4, Landroid/content/pm/ApplicationInfo;->compileSdkVersion:I

    .line 89
    iget-object v4, v1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v4, Landroid/content/pm/ApplicationInfo;->compileSdkVersionCodename:Ljava/lang/String;

    .line 90
    iget-object v4, v1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v4, Landroid/content/pm/ApplicationInfo;->appComponentFactory:Ljava/lang/String;

    .line 91
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->S0(I)Z

    .line 92
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->g1(I)Z

    .line 93
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->U0(I)Z

    .line 94
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    if-eqz v4, :cond_5

    const/4 v4, 0x1

    goto :goto_3

    :cond_5
    const/4 v4, 0x0

    :goto_3
    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->R0(Z)Z

    .line 95
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->u1(Ljava/lang/String;)Z

    .line 96
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->Q0(I)Z

    .line 97
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->V0(I)Z

    .line 98
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->W0(I)Z

    .line 99
    invoke-static {}, Lcom/xinzhu/haunted/android/content/pm/b;->r0()Ljava/lang/Object;

    move-result-object v4

    .line 100
    :try_start_0
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    const-string v8, "unparcel"

    new-array v9, v6, [Ljava/lang/Class;

    const-class v10, Landroid/os/Parcel;

    aput-object v10, v9, v5

    invoke-virtual {v7, v8, v9}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    .line 101
    invoke-virtual {v7, v6}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    new-array v8, v6, [Ljava/lang/Object;

    aput-object p0, v8, v5

    .line 102
    invoke-virtual {v7, v4, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v3, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->e1(Ljava/lang/Boolean;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception v3

    .line 103
    invoke-virtual {v3}, Ljava/lang/Throwable;->printStackTrace()V

    .line 104
    :goto_4
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Landroid/content/pm/ActivityInfo;->processName:Ljava/lang/String;

    .line 105
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Landroid/content/pm/ActivityInfo;->splitName:Ljava/lang/String;

    .line 106
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->d()[Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Landroid/content/pm/ActivityInfo;->attributionTags:[Ljava/lang/String;

    .line 107
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    iput v3, v1, Landroid/content/pm/ActivityInfo;->descriptionRes:I

    .line 108
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-eqz v3, :cond_6

    const/4 v3, 0x1

    goto :goto_5

    :cond_6
    const/4 v3, 0x0

    :goto_5
    iput-boolean v3, v1, Landroid/content/pm/ActivityInfo;->enabled:Z

    .line 109
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-eqz v3, :cond_7

    const/4 v3, 0x1

    goto :goto_6

    :cond_7
    const/4 v3, 0x0

    :goto_6
    iput-boolean v3, v1, Landroid/content/pm/ActivityInfo;->exported:Z

    .line 110
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-eqz v3, :cond_8

    const/4 v3, 0x1

    goto :goto_7

    :cond_8
    const/4 v3, 0x0

    :goto_7
    iput-boolean v3, v1, Landroid/content/pm/ActivityInfo;->directBootAware:Z

    .line 111
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    iput v3, v1, Landroid/content/pm/ActivityInfo;->theme:I

    .line 112
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    iput v3, v1, Landroid/content/pm/ActivityInfo;->launchMode:I

    .line 113
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    iput v3, v1, Landroid/content/pm/ActivityInfo;->documentLaunchMode:I

    .line 114
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Landroid/content/pm/ActivityInfo;->permission:Ljava/lang/String;

    .line 115
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Landroid/content/pm/ActivityInfo;->taskAffinity:Ljava/lang/String;

    .line 116
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Landroid/content/pm/ActivityInfo;->targetActivity:Ljava/lang/String;

    .line 117
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/xinzhu/haunted/android/content/pm/a;->w(Ljava/lang/String;)Z

    .line 118
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    iput v3, v1, Landroid/content/pm/ActivityInfo;->flags:I

    .line 119
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/xinzhu/haunted/android/content/pm/a;->B(I)Z

    .line 120
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    iput v3, v1, Landroid/content/pm/ActivityInfo;->screenOrientation:I

    .line 121
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    iput v3, v1, Landroid/content/pm/ActivityInfo;->configChanges:I

    .line 122
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    iput v3, v1, Landroid/content/pm/ActivityInfo;->softInputMode:I

    .line 123
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    iput v3, v1, Landroid/content/pm/ActivityInfo;->uiOptions:I

    .line 124
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Landroid/content/pm/ActivityInfo;->parentActivityName:Ljava/lang/String;

    .line 125
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    iput v3, v1, Landroid/content/pm/ActivityInfo;->persistableMode:I

    .line 126
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    iput v3, v1, Landroid/content/pm/ActivityInfo;->maxRecents:I

    .line 127
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/xinzhu/haunted/android/content/pm/a;->x(I)Z

    .line 128
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x18

    if-lt v3, v4, :cond_9

    .line 129
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    if-ne v4, v6, :cond_9

    .line 130
    invoke-static {p0}, Lcom/xinzhu/haunted/android/content/pm/a$a;->b(Landroid/os/Parcel;)Lcom/xinzhu/haunted/android/content/pm/a$a;

    move-result-object v4

    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v4, Lcom/xinzhu/haunted/android/content/pm/a$a;

    iget-object v4, v4, Lcom/xinzhu/haunted/android/content/pm/a$a;->a:Ljava/lang/Object;

    check-cast v4, Landroid/content/pm/ActivityInfo$WindowLayout;

    iput-object v4, v1, Landroid/content/pm/ActivityInfo;->windowLayout:Landroid/content/pm/ActivityInfo$WindowLayout;

    .line 131
    :cond_9
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    invoke-virtual {v2, v4}, Lcom/xinzhu/haunted/android/content/pm/a;->D(I)Z

    .line 132
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/xinzhu/haunted/android/content/pm/a;->C(Ljava/lang/String;)Z

    .line 133
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/xinzhu/haunted/android/content/pm/a;->E(I)Z

    const/16 v0, 0x1a

    if-lt v3, v0, :cond_a

    .line 134
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, v1, Landroid/content/pm/ActivityInfo;->colorMode:I

    .line 135
    :cond_a
    invoke-virtual {p0}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    invoke-virtual {v2, v0}, Lcom/xinzhu/haunted/android/content/pm/a;->z(F)Z

    .line 136
    invoke-virtual {p0}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    invoke-virtual {v2, v0}, Lcom/xinzhu/haunted/android/content/pm/a;->A(F)Z

    .line 137
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result p0

    if-eqz p0, :cond_b

    const/4 v5, 0x1

    :cond_b
    invoke-virtual {v2, v5}, Lcom/xinzhu/haunted/android/content/pm/a;->F(Z)Z

    .line 138
    sget-object p0, Lcom/xinzhu/overmind/utils/helpers/a;->a:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "wtf "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, Landroid/content/pm/ActivityInfo;->taskAffinity:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, Landroid/content/pm/ActivityInfo;->processName:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/xinzhu/overmind/b;->c(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1
.end method
