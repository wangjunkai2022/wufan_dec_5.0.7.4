.class public Lcom/ss/android/socialbase/downloader/o/p;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/socialbase/downloader/o/m;


# instance fields
.field private final m:Lcom/ss/android/socialbase/downloader/u/vv;

.field private final vv:Ljava/io/InputStream;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/o/p;->vv:Ljava/io/InputStream;

    .line 3
    new-instance p1, Lcom/ss/android/socialbase/downloader/u/vv;

    invoke-direct {p1, p2}, Lcom/ss/android/socialbase/downloader/u/vv;-><init>(I)V

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/o/p;->m:Lcom/ss/android/socialbase/downloader/u/vv;

    return-void
.end method


# virtual methods
.method public m()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/io/Closeable;

    .line 1
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/o/p;->vv:Ljava/io/InputStream;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/wv/u;->vv([Ljava/io/Closeable;)V

    return-void
.end method

.method public vv()Lcom/ss/android/socialbase/downloader/u/vv;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/o/p;->m:Lcom/ss/android/socialbase/downloader/u/vv;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/o/p;->vv:Ljava/io/InputStream;

    iget-object v2, v0, Lcom/ss/android/socialbase/downloader/u/vv;->vv:[B

    invoke-virtual {v1, v2}, Ljava/io/InputStream;->read([B)I

    move-result v1

    iput v1, v0, Lcom/ss/android/socialbase/downloader/u/vv;->p:I

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/o/p;->m:Lcom/ss/android/socialbase/downloader/u/vv;

    return-object v0
.end method

.method public vv(Lcom/ss/android/socialbase/downloader/u/vv;)V
    .locals 0

    return-void
.end method
