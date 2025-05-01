.class public abstract Lcom/kwad/framework/filedownloader/message/MessageSnapshot;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;
.implements Lcom/kwad/framework/filedownloader/message/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/framework/filedownloader/message/MessageSnapshot$b;,
        Lcom/kwad/framework/filedownloader/message/MessageSnapshot$NoFieldException;,
        Lcom/kwad/framework/filedownloader/message/MessageSnapshot$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/kwad/framework/filedownloader/message/MessageSnapshot;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field protected aih:Z

.field private final id:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/framework/filedownloader/message/MessageSnapshot$1;

    invoke-direct {v0}, Lcom/kwad/framework/filedownloader/message/MessageSnapshot$1;-><init>()V

    sput-object v0, Lcom/kwad/framework/filedownloader/message/MessageSnapshot;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/kwad/framework/filedownloader/message/MessageSnapshot;->id:I

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Lcom/kwad/framework/filedownloader/message/MessageSnapshot;->id:I

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getEtag()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/framework/filedownloader/message/MessageSnapshot$NoFieldException;

    const-string v1, "getEtag"

    invoke-direct {v0, v1, p0}, Lcom/kwad/framework/filedownloader/message/MessageSnapshot$NoFieldException;-><init>(Ljava/lang/String;Lcom/kwad/framework/filedownloader/message/MessageSnapshot;)V

    throw v0
.end method

.method public getFileName()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/framework/filedownloader/message/MessageSnapshot$NoFieldException;

    const-string v1, "getFileName"

    invoke-direct {v0, v1, p0}, Lcom/kwad/framework/filedownloader/message/MessageSnapshot$NoFieldException;-><init>(Ljava/lang/String;Lcom/kwad/framework/filedownloader/message/MessageSnapshot;)V

    throw v0
.end method

.method public final getId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/framework/filedownloader/message/MessageSnapshot;->id:I

    return v0
.end method

.method public uD()I
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/framework/filedownloader/message/MessageSnapshot$NoFieldException;

    const-string v1, "getRetryingTimes"

    invoke-direct {v0, v1, p0}, Lcom/kwad/framework/filedownloader/message/MessageSnapshot$NoFieldException;-><init>(Ljava/lang/String;Lcom/kwad/framework/filedownloader/message/MessageSnapshot;)V

    throw v0
.end method

.method public final uF()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/framework/filedownloader/message/MessageSnapshot;->aih:Z

    return v0
.end method

.method public wC()I
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/framework/filedownloader/message/MessageSnapshot$NoFieldException;

    const-string v1, "getSmallSofarBytes"

    invoke-direct {v0, v1, p0}, Lcom/kwad/framework/filedownloader/message/MessageSnapshot$NoFieldException;-><init>(Ljava/lang/String;Lcom/kwad/framework/filedownloader/message/MessageSnapshot;)V

    throw v0
.end method

.method public wD()I
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/framework/filedownloader/message/MessageSnapshot$NoFieldException;

    const-string v1, "getSmallTotalBytes"

    invoke-direct {v0, v1, p0}, Lcom/kwad/framework/filedownloader/message/MessageSnapshot$NoFieldException;-><init>(Ljava/lang/String;Lcom/kwad/framework/filedownloader/message/MessageSnapshot;)V

    throw v0
.end method

.method public wE()J
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/framework/filedownloader/message/MessageSnapshot$NoFieldException;

    const-string v1, "getLargeTotalBytes"

    invoke-direct {v0, v1, p0}, Lcom/kwad/framework/filedownloader/message/MessageSnapshot$NoFieldException;-><init>(Ljava/lang/String;Lcom/kwad/framework/filedownloader/message/MessageSnapshot;)V

    throw v0
.end method

.method public wF()Z
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/framework/filedownloader/message/MessageSnapshot$NoFieldException;

    const-string v1, "isReusedDownloadedFile"

    invoke-direct {v0, v1, p0}, Lcom/kwad/framework/filedownloader/message/MessageSnapshot$NoFieldException;-><init>(Ljava/lang/String;Lcom/kwad/framework/filedownloader/message/MessageSnapshot;)V

    throw v0
.end method

.method public wG()J
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/framework/filedownloader/message/MessageSnapshot$NoFieldException;

    const-string v1, "getLargeSofarBytes"

    invoke-direct {v0, v1, p0}, Lcom/kwad/framework/filedownloader/message/MessageSnapshot$NoFieldException;-><init>(Ljava/lang/String;Lcom/kwad/framework/filedownloader/message/MessageSnapshot;)V

    throw v0
.end method

.method public wH()Ljava/lang/Throwable;
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/framework/filedownloader/message/MessageSnapshot$NoFieldException;

    const-string v1, "getThrowable"

    invoke-direct {v0, v1, p0}, Lcom/kwad/framework/filedownloader/message/MessageSnapshot$NoFieldException;-><init>(Ljava/lang/String;Lcom/kwad/framework/filedownloader/message/MessageSnapshot;)V

    throw v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    iget-boolean p2, p0, Lcom/kwad/framework/filedownloader/message/MessageSnapshot;->aih:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 2
    invoke-interface {p0}, Lcom/kwad/framework/filedownloader/message/c;->uz()B

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 3
    iget p2, p0, Lcom/kwad/framework/filedownloader/message/MessageSnapshot;->id:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

.method public wu()Z
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/framework/filedownloader/message/MessageSnapshot$NoFieldException;

    const-string v1, "isResuming"

    invoke-direct {v0, v1, p0}, Lcom/kwad/framework/filedownloader/message/MessageSnapshot$NoFieldException;-><init>(Ljava/lang/String;Lcom/kwad/framework/filedownloader/message/MessageSnapshot;)V

    throw v0
.end method
