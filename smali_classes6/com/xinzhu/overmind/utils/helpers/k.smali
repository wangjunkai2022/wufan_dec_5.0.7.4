.class public Lcom/xinzhu/overmind/utils/helpers/k;
.super Ljava/lang/Object;
.source "SigningDetailsAmbulance.java"


# static fields
.field private static final a:Ljava/lang/String; = "k"


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

.method public static a(Landroid/os/Parcel;)Landroid/content/pm/PackageParser$SigningDetails;
    .locals 1

    .line 1
    :try_start_0
    invoke-static {}, Lcom/xinzhu/overmind/utils/e;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {p0}, Lcom/xinzhu/overmind/utils/helpers/k;->b(Landroid/os/Parcel;)Landroid/content/pm/PackageParser$SigningDetails;

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

.method private static b(Landroid/os/Parcel;)Landroid/content/pm/PackageParser$SigningDetails;
    .locals 11
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 2
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 3
    :goto_0
    sget-object v2, Lcom/xinzhu/overmind/utils/helpers/k;->a:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "get if unknown signing details "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/xinzhu/overmind/b;->c(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v0, :cond_1

    .line 4
    invoke-static {}, Lcom/xinzhu/haunted/android/content/pm/j$a;->q()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/pm/PackageParser$SigningDetails;

    return-object p0

    :cond_1
    const/4 v0, 0x0

    .line 5
    invoke-static {v0, v1, v0, v0}, Lcom/xinzhu/haunted/android/content/pm/j$a;->o([Landroid/content/pm/Signature;ILandroid/util/ArraySet;[Landroid/content/pm/Signature;)Lcom/xinzhu/haunted/android/content/pm/j$a;

    move-result-object v3

    .line 6
    const-class v4, Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    .line 7
    sget-object v5, Landroid/content/pm/Signature;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p0, v5}, Landroid/os/Parcel;->createTypedArray(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [Landroid/content/pm/Signature;

    invoke-virtual {v3, v5}, Lcom/xinzhu/haunted/android/content/pm/j$a;->D([Landroid/content/pm/Signature;)Z

    .line 8
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v5

    invoke-virtual {v3, v5}, Lcom/xinzhu/haunted/android/content/pm/j$a;->C(I)Z

    .line 9
    new-instance v5, Lcom/xinzhu/haunted/android/os/p;

    invoke-direct {v5, p0}, Lcom/xinzhu/haunted/android/os/p;-><init>(Ljava/lang/Object;)V

    .line 10
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v6

    .line 11
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "type here111 "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, " "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/xinzhu/haunted/android/content/pm/j$a;->u()I

    move-result v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v7}, Lcom/xinzhu/overmind/b;->c(Ljava/lang/String;Ljava/lang/String;)I

    if-gez v6, :cond_2

    return-object v0

    .line 12
    :cond_2
    new-instance v2, Landroid/util/ArraySet;

    invoke-direct {v2, v6}, Landroid/util/ArraySet;-><init>(I)V

    :goto_1
    if-ge v1, v6, :cond_3

    .line 13
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v7

    .line 14
    sget-object v8, Lcom/xinzhu/overmind/utils/helpers/k;->a:Ljava/lang/String;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "type here "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lcom/xinzhu/overmind/b;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    invoke-virtual {v5, v7, v4, v0, v0}, Lcom/xinzhu/haunted/android/os/p;->f(ILjava/lang/ClassLoader;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/security/PublicKey;

    .line 16
    invoke-virtual {v2, v7}, Landroid/util/ArraySet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 17
    :cond_3
    invoke-virtual {v3, v2}, Lcom/xinzhu/haunted/android/content/pm/j$a;->B(Landroid/util/ArraySet;)Z

    .line 18
    sget-object v0, Landroid/content/pm/Signature;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p0, v0}, Landroid/os/Parcel;->createTypedArray(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Landroid/content/pm/Signature;

    invoke-virtual {v3, p0}, Lcom/xinzhu/haunted/android/content/pm/j$a;->z([Landroid/content/pm/Signature;)Z

    .line 19
    iget-object p0, v3, Lcom/xinzhu/haunted/android/content/pm/j$a;->a:Ljava/lang/Object;

    check-cast p0, Landroid/content/pm/PackageParser$SigningDetails;

    return-object p0
.end method
