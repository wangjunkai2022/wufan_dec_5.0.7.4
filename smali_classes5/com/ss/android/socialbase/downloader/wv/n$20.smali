.class final Lcom/ss/android/socialbase/downloader/wv/n$20;
.super Lcom/ss/android/socialbase/downloader/depend/q$vv;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/downloader/wv/n;->vv(Lcom/ss/android/socialbase/downloader/depend/d;)Lcom/ss/android/socialbase/downloader/depend/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic vv:Lcom/ss/android/socialbase/downloader/depend/d;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/depend/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/wv/n$20;->vv:Lcom/ss/android/socialbase/downloader/depend/d;

    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/depend/q$vv;-><init>()V

    return-void
.end method


# virtual methods
.method public vv()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/wv/n$20;->vv:Lcom/ss/android/socialbase/downloader/depend/d;

    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/depend/d;->vv()V

    return-void
.end method
