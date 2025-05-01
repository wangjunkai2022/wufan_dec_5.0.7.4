.class final Lcom/ss/android/socialbase/downloader/wv/n$28;
.super Lcom/ss/android/socialbase/downloader/depend/y$vv;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/downloader/wv/n;->vv(Lcom/ss/android/socialbase/downloader/depend/ya;)Lcom/ss/android/socialbase/downloader/depend/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic vv:Lcom/ss/android/socialbase/downloader/depend/ya;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/depend/ya;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/wv/n$28;->vv:Lcom/ss/android/socialbase/downloader/depend/ya;

    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/depend/y$vv;-><init>()V

    return-void
.end method


# virtual methods
.method public vv(Lcom/ss/android/socialbase/downloader/depend/x;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/wv/n$28;->vv:Lcom/ss/android/socialbase/downloader/depend/ya;

    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/wv/n;->vv(Lcom/ss/android/socialbase/downloader/depend/x;)Lcom/ss/android/socialbase/downloader/depend/v;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/depend/ya;->vv(Lcom/ss/android/socialbase/downloader/depend/v;)Z

    move-result p1

    return p1
.end method
