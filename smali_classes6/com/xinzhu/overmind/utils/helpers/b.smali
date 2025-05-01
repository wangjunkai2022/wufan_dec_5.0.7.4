.class public Lcom/xinzhu/overmind/utils/helpers/b;
.super Ljava/lang/Object;
.source "ApplicationInfoFixHelper.java"


# static fields
.field private static final a:Ljava/lang/String; = "b"


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

.method public static a(Landroid/os/Parcel;)Landroid/content/pm/ApplicationInfo;
    .locals 1

    .line 1
    :try_start_0
    invoke-static {}, Lcom/xinzhu/overmind/utils/e;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {p0}, Lcom/xinzhu/overmind/utils/helpers/b;->b(Landroid/os/Parcel;)Landroid/content/pm/ApplicationInfo;

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

.method private static b(Landroid/os/Parcel;)Landroid/content/pm/ApplicationInfo;
    .locals 9
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/xinzhu/haunted/android/os/p;

    invoke-direct {v0, p0}, Lcom/xinzhu/haunted/android/os/p;-><init>(Ljava/lang/Object;)V

    .line 2
    new-instance v1, Landroid/content/pm/ApplicationInfo;

    invoke-direct {v1}, Landroid/content/pm/ApplicationInfo;-><init>()V

    .line 3
    invoke-virtual {p0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 4
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    .line 5
    sget-object p0, Lcom/xinzhu/overmind/utils/helpers/b;->a:Ljava/lang/String;

    const-string v0, "unexpected squashed applicationinfo"

    invoke-static {p0, v0}, Lcom/xinzhu/overmind/b;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getStackTraceElement()V

    return-object v3

    .line 7
    :cond_0
    new-instance v2, Lcom/xinzhu/haunted/android/content/pm/b;

    invoke-direct {v2, v1}, Lcom/xinzhu/haunted/android/content/pm/b;-><init>(Ljava/lang/Object;)V

    .line 8
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Landroid/content/pm/ApplicationInfo;->name:Ljava/lang/String;

    .line 9
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 10
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    iput v4, v1, Landroid/content/pm/ApplicationInfo;->labelRes:I

    .line 11
    sget-object v4, Landroid/text/TextUtils;->CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;

    .line 12
    invoke-interface {v4, p0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    iput-object v4, v1, Landroid/content/pm/ApplicationInfo;->nonLocalizedLabel:Ljava/lang/CharSequence;

    .line 13
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    iput v4, v1, Landroid/content/pm/ApplicationInfo;->icon:I

    .line 14
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    iput v4, v1, Landroid/content/pm/ApplicationInfo;->logo:I

    .line 15
    sget-object v4, Lcom/xinzhu/overmind/utils/helpers/b;->a:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "class name app  asd "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, v1, Landroid/content/pm/ApplicationInfo;->name:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/xinzhu/overmind/b;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    invoke-virtual {p0}, Landroid/os/Parcel;->readBundle()Landroid/os/Bundle;

    move-result-object v4

    iput-object v4, v1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 17
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    iput v4, v1, Landroid/content/pm/ApplicationInfo;->banner:I

    .line 18
    new-instance v4, Lcom/xinzhu/haunted/android/content/pm/i;

    invoke-direct {v4, v1}, Lcom/xinzhu/haunted/android/content/pm/i;-><init>(Ljava/lang/Object;)V

    .line 19
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v5

    invoke-virtual {v4, v5}, Lcom/xinzhu/haunted/android/content/pm/i;->c(I)Z

    .line 20
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Landroid/content/pm/ApplicationInfo;->taskAffinity:Ljava/lang/String;

    .line 21
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Landroid/content/pm/ApplicationInfo;->permission:Ljava/lang/String;

    .line 22
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Landroid/content/pm/ApplicationInfo;->processName:Ljava/lang/String;

    .line 23
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Landroid/content/pm/ApplicationInfo;->className:Ljava/lang/String;

    .line 24
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    iput v4, v1, Landroid/content/pm/ApplicationInfo;->theme:I

    .line 25
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    iput v4, v1, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 26
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    invoke-virtual {v2, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->c1(I)Z

    .line 27
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    invoke-virtual {v2, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->d1(I)Z

    .line 28
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    iput v4, v1, Landroid/content/pm/ApplicationInfo;->requiresSmallestWidthDp:I

    .line 29
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    iput v4, v1, Landroid/content/pm/ApplicationInfo;->compatibleWidthLimitDp:I

    .line 30
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    iput v4, v1, Landroid/content/pm/ApplicationInfo;->largestWidthLimitDp:I

    .line 31
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    if-eqz v4, :cond_1

    .line 32
    new-instance v4, Ljava/util/UUID;

    invoke-virtual {p0}, Landroid/os/Parcel;->readLong()J

    move-result-wide v5

    invoke-virtual {p0}, Landroid/os/Parcel;->readLong()J

    move-result-wide v7

    invoke-direct {v4, v5, v6, v7, v8}, Ljava/util/UUID;-><init>(JJ)V

    iput-object v4, v1, Landroid/content/pm/ApplicationInfo;->storageUuid:Ljava/util/UUID;

    .line 33
    invoke-static {v4}, Lcom/xinzhu/haunted/android/os/storage/c;->f(Ljava/util/UUID;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->t1(Ljava/lang/String;)Z

    .line 34
    :cond_1
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->j1(Ljava/lang/String;)Z

    .line 35
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/xinzhu/haunted/android/content/pm/b;->i1(Ljava/lang/String;)Z

    .line 36
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 37
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Landroid/content/pm/ApplicationInfo;->publicSourceDir:Ljava/lang/String;

    .line 38
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->d()[Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Landroid/content/pm/ApplicationInfo;->splitNames:[Ljava/lang/String;

    .line 39
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->d()[Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Landroid/content/pm/ApplicationInfo;->splitSourceDirs:[Ljava/lang/String;

    .line 40
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->d()[Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Landroid/content/pm/ApplicationInfo;->splitPublicSourceDirs:[Ljava/lang/String;

    .line 41
    const-class v4, [I

    invoke-virtual {p0, v3, v4}, Landroid/os/Parcel;->readSparseArray(Ljava/lang/ClassLoader;Ljava/lang/Class;)Landroid/util/SparseArray;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/xinzhu/haunted/android/content/pm/b;->q1(Landroid/util/SparseArray;)Z

    .line 42
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    .line 43
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/xinzhu/haunted/android/content/pm/b;->n1(Ljava/lang/String;)Z

    .line 44
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/xinzhu/haunted/android/content/pm/b;->X0(Ljava/lang/String;)Z

    .line 45
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v3, :cond_2

    const/4 v3, 0x1

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v2, v3}, Lcom/xinzhu/haunted/android/content/pm/b;->Y0(Z)Z

    .line 46
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/xinzhu/haunted/android/content/pm/b;->b1(Ljava/lang/String;)Z

    .line 47
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/xinzhu/haunted/android/content/pm/b;->m1(Ljava/lang/String;)Z

    .line 48
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->d()[Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/xinzhu/haunted/android/content/pm/b;->f1([Ljava/lang/String;)Z

    .line 49
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->d()[Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/xinzhu/haunted/android/content/pm/b;->a1([Ljava/lang/String;)Z

    .line 50
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/xinzhu/haunted/android/content/pm/b;->k1(Ljava/lang/String;)Z

    .line 51
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/xinzhu/haunted/android/content/pm/b;->l1(Ljava/lang/String;)Z

    .line 52
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->d()[Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Landroid/content/pm/ApplicationInfo;->sharedLibraryFiles:[Ljava/lang/String;

    .line 53
    sget-object v3, Landroid/content/pm/SharedLibraryInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p0, v3}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/xinzhu/haunted/android/content/pm/b;->o1(Ljava/util/List;)Z

    .line 54
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    .line 55
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Landroid/content/pm/ApplicationInfo;->deviceProtectedDataDir:Ljava/lang/String;

    .line 56
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/xinzhu/haunted/android/content/pm/b;->J0(Ljava/lang/String;)Z

    .line 57
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    iput v3, v1, Landroid/content/pm/ApplicationInfo;->uid:I

    .line 58
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    iput v3, v1, Landroid/content/pm/ApplicationInfo;->minSdkVersion:I

    .line 59
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    iput v3, v1, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 60
    invoke-virtual {p0}, Landroid/os/Parcel;->readLong()J

    move-result-wide v6

    invoke-virtual {v2, v6, v7}, Lcom/xinzhu/haunted/android/content/pm/b;->F0(J)V

    .line 61
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-eqz v3, :cond_3

    const/4 v3, 0x1

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    :goto_1
    iput-boolean v3, v1, Landroid/content/pm/ApplicationInfo;->enabled:Z

    .line 62
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/xinzhu/haunted/android/content/pm/b;->O0(I)Z

    .line 63
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/xinzhu/haunted/android/content/pm/b;->T0(I)Z

    .line 64
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Landroid/content/pm/ApplicationInfo;->manageSpaceActivityName:Ljava/lang/String;

    .line 65
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Landroid/content/pm/ApplicationInfo;->backupAgentName:Ljava/lang/String;

    .line 66
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    iput v3, v1, Landroid/content/pm/ApplicationInfo;->descriptionRes:I

    .line 67
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    iput v3, v1, Landroid/content/pm/ApplicationInfo;->uiOptions:I

    .line 68
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/xinzhu/haunted/android/content/pm/b;->P0(I)Z

    .line 69
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/xinzhu/haunted/android/content/pm/b;->L0(I)Z

    .line 70
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, 0x1

    goto :goto_2

    :cond_4
    const/4 v3, 0x0

    :goto_2
    invoke-virtual {v2, v3}, Lcom/xinzhu/haunted/android/content/pm/b;->K0(Z)Z

    .line 71
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/xinzhu/haunted/android/content/pm/b;->Z0(I)Z

    .line 72
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    iput v3, v1, Landroid/content/pm/ApplicationInfo;->category:I

    .line 73
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/xinzhu/haunted/android/content/pm/b;->r1(I)Z

    .line 74
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/xinzhu/haunted/android/content/pm/b;->H0(Ljava/lang/String;)Z

    .line 75
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->d()[Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/xinzhu/haunted/android/content/pm/b;->p1([Ljava/lang/String;)Z

    .line 76
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    iput v3, v1, Landroid/content/pm/ApplicationInfo;->compileSdkVersion:I

    .line 77
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Landroid/content/pm/ApplicationInfo;->compileSdkVersionCodename:Ljava/lang/String;

    .line 78
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Landroid/content/pm/ApplicationInfo;->appComponentFactory:Ljava/lang/String;

    .line 79
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/xinzhu/haunted/android/content/pm/b;->S0(I)Z

    .line 80
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/xinzhu/haunted/android/content/pm/b;->g1(I)Z

    .line 81
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/xinzhu/haunted/android/content/pm/b;->U0(I)Z

    .line 82
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-eqz v3, :cond_5

    const/4 v3, 0x1

    goto :goto_3

    :cond_5
    const/4 v3, 0x0

    :goto_3
    invoke-virtual {v2, v3}, Lcom/xinzhu/haunted/android/content/pm/b;->R0(Z)Z

    .line 83
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/p;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/xinzhu/haunted/android/content/pm/b;->u1(Ljava/lang/String;)Z

    .line 84
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/xinzhu/haunted/android/content/pm/b;->Q0(I)Z

    .line 85
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/xinzhu/haunted/android/content/pm/b;->V0(I)Z

    .line 86
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/xinzhu/haunted/android/content/pm/b;->W0(I)Z

    .line 87
    invoke-static {}, Lcom/xinzhu/haunted/android/content/pm/b;->r0()Ljava/lang/Object;

    move-result-object v0

    .line 88
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    const-string v6, "unparcel"

    new-array v7, v5, [Ljava/lang/Class;

    const-class v8, Landroid/os/Parcel;

    aput-object v8, v7, v4

    invoke-virtual {v3, v6, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    .line 89
    invoke-virtual {v3, v5}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    new-array v5, v5, [Ljava/lang/Object;

    aput-object p0, v5, v4

    .line 90
    invoke-virtual {v3, v0, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {v2, p0}, Lcom/xinzhu/haunted/android/content/pm/b;->e1(Ljava/lang/Boolean;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception p0

    .line 91
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 92
    :goto_4
    sget-object p0, Lcom/xinzhu/overmind/utils/helpers/b;->a:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "wtf application"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, Landroid/content/pm/ApplicationInfo;->processName:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/xinzhu/overmind/b;->c(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1
.end method
