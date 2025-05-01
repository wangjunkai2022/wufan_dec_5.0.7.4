.class final Lcom/ss/android/socialbase/downloader/wv/n$27;
.super Lcom/ss/android/socialbase/downloader/depend/zn$vv;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/downloader/wv/n;->vv(Lcom/ss/android/socialbase/downloader/downloader/la;)Lcom/ss/android/socialbase/downloader/depend/zn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic vv:Lcom/ss/android/socialbase/downloader/downloader/la;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/downloader/la;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/wv/n$27;->vv:Lcom/ss/android/socialbase/downloader/downloader/la;

    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/depend/zn$vv;-><init>()V

    return-void
.end method


# virtual methods
.method public vv(II)J
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/wv/n$27;->vv:Lcom/ss/android/socialbase/downloader/downloader/la;

    invoke-interface {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/la;->vv(II)J

    move-result-wide p1

    return-wide p1
.end method
