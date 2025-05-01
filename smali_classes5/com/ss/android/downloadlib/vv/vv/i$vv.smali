.class public abstract Lcom/ss/android/downloadlib/vv/vv/i$vv;
.super Landroid/os/Binder;

# interfaces
.implements Lcom/ss/android/downloadlib/vv/vv/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ss/android/downloadlib/vv/vv/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "vv"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ss/android/downloadlib/vv/vv/i$vv$vv;
    }
.end annotation


# static fields
.field private static vv:Ljava/lang/String; = ""


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static vv(Landroid/os/IBinder;)Lcom/ss/android/downloadlib/vv/vv/i;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 3
    :cond_0
    sget-object v0, Lcom/ss/android/downloadlib/vv/vv/i$vv;->vv:Ljava/lang/String;

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 4
    instance-of v1, v0, Lcom/ss/android/downloadlib/vv/vv/i;

    if-nez v1, :cond_1

    goto :goto_0

    .line 5
    :cond_1
    check-cast v0, Lcom/ss/android/downloadlib/vv/vv/i;

    return-object v0

    .line 6
    :cond_2
    :goto_0
    new-instance v0, Lcom/ss/android/downloadlib/vv/vv/i$vv$vv;

    invoke-direct {v0, p0}, Lcom/ss/android/downloadlib/vv/vv/i$vv$vv;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method

.method static synthetic vv()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/downloadlib/vv/vv/i$vv;->vv:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic vv(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 2
    sput-object p0, Lcom/ss/android/downloadlib/vv/vv/i$vv;->vv:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 1
    sget-object p1, Lcom/ss/android/downloadlib/vv/vv/i$vv;->vv:Ljava/lang/String;

    invoke-virtual {p2, p1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 2
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lcom/ss/android/downloadlib/vv/vv/m;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ss/android/downloadlib/vv/vv/m;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-interface {p0, p1}, Lcom/ss/android/downloadlib/vv/vv/i;->vv(Lcom/ss/android/downloadlib/vv/vv/m;)V

    .line 3
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v0

    :cond_1
    const v1, 0x5f4e5446

    if-eq p1, v1, :cond_2

    .line 4
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p1

    return p1

    .line 5
    :cond_2
    sget-object p1, Lcom/ss/android/downloadlib/vv/vv/i$vv;->vv:Ljava/lang/String;

    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return v0
.end method
