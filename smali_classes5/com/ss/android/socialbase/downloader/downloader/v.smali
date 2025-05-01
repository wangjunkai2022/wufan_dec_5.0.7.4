.class Lcom/ss/android/socialbase/downloader/downloader/v;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/socialbase/downloader/downloader/p$vv;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public m()Lcom/ss/android/socialbase/downloader/downloader/r;
    .locals 1

    .line 1
    new-instance v0, Lcom/ss/android/socialbase/downloader/impls/q;

    invoke-direct {v0}, Lcom/ss/android/socialbase/downloader/impls/q;-><init>()V

    return-object v0
.end method

.method public vv()Lcom/ss/android/socialbase/downloader/downloader/q;
    .locals 1

    .line 1
    new-instance v0, Lcom/ss/android/socialbase/downloader/impls/t;

    invoke-direct {v0}, Lcom/ss/android/socialbase/downloader/impls/t;-><init>()V

    return-object v0
.end method

.method public vv(Lcom/ss/android/socialbase/downloader/downloader/p$vv$vv;)Lcom/ss/android/socialbase/downloader/downloader/x;
    .locals 1

    .line 2
    new-instance v0, Lcom/ss/android/socialbase/downloader/m/u;

    invoke-direct {v0}, Lcom/ss/android/socialbase/downloader/m/u;-><init>()V

    .line 3
    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/m/u;->vv(Lcom/ss/android/socialbase/downloader/downloader/p$vv$vv;)V

    return-object v0
.end method
