.class final Lcom/ss/android/socialbase/downloader/model/p$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ss/android/socialbase/downloader/model/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/ss/android/socialbase/downloader/model/p;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/ss/android/socialbase/downloader/model/p$1;->vv(Landroid/os/Parcel;)Lcom/ss/android/socialbase/downloader/model/p;

    move-result-object p1

    return-object p1
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/ss/android/socialbase/downloader/model/p$1;->vv(I)[Lcom/ss/android/socialbase/downloader/model/p;

    move-result-object p1

    return-object p1
.end method

.method public vv(Landroid/os/Parcel;)Lcom/ss/android/socialbase/downloader/model/p;
    .locals 1

    .line 1
    new-instance v0, Lcom/ss/android/socialbase/downloader/model/p;

    invoke-direct {v0, p1}, Lcom/ss/android/socialbase/downloader/model/p;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public vv(I)[Lcom/ss/android/socialbase/downloader/model/p;
    .locals 0

    .line 2
    new-array p1, p1, [Lcom/ss/android/socialbase/downloader/model/p;

    return-object p1
.end method
