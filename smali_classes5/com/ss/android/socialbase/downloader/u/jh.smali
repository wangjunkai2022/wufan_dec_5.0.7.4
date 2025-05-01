.class Lcom/ss/android/socialbase/downloader/u/jh;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/socialbase/downloader/u/o;


# instance fields
.field private final m:Lcom/ss/android/socialbase/downloader/model/o;

.field private final p:Lcom/ss/android/socialbase/downloader/u/o;

.field private final vv:Lcom/ss/android/socialbase/downloader/u/wv;


# direct methods
.method public constructor <init>(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/downloader/u/m;Lcom/ss/android/socialbase/downloader/u/wv;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p3, p0, Lcom/ss/android/socialbase/downloader/u/jh;->vv:Lcom/ss/android/socialbase/downloader/u/wv;

    .line 3
    invoke-direct {p0, p1, p3}, Lcom/ss/android/socialbase/downloader/u/jh;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/downloader/u/wv;)Lcom/ss/android/socialbase/downloader/model/o;

    move-result-object p1

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/u/jh;->m:Lcom/ss/android/socialbase/downloader/model/o;

    .line 4
    new-instance p1, Lcom/ss/android/socialbase/downloader/u/qv;

    invoke-direct {p1, p2, p0}, Lcom/ss/android/socialbase/downloader/u/qv;-><init>(Lcom/ss/android/socialbase/downloader/u/o;Lcom/ss/android/socialbase/downloader/u/o;)V

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/u/jh;->p:Lcom/ss/android/socialbase/downloader/u/o;

    return-void
.end method

.method private vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/downloader/u/wv;)Lcom/ss/android/socialbase/downloader/model/o;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;
        }
    .end annotation

    .line 2
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTempPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTempName()Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v2

    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(I)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v2

    const-string v3, "flush_buffer_size_byte"

    const/4 v4, -0x1

    invoke-virtual {v2, v3, v4}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result v2

    .line 4
    invoke-static {p1, v0, v1, v2}, Lcom/ss/android/socialbase/downloader/wv/u;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/lang/String;Ljava/lang/String;I)Lcom/ss/android/socialbase/downloader/model/o;

    move-result-object p1

    .line 5
    :try_start_0
    invoke-virtual {p2}, Lcom/ss/android/socialbase/downloader/u/wv;->o()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/ss/android/socialbase/downloader/model/o;->vv(J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 6
    new-instance p2, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    const/16 v0, 0x41e

    invoke-direct {p2, v0, p1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/Throwable;)V

    throw p2
.end method


# virtual methods
.method public i()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/io/Closeable;

    .line 1
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/u/jh;->m:Lcom/ss/android/socialbase/downloader/model/o;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/wv/u;->vv([Ljava/io/Closeable;)V

    return-void
.end method

.method public m()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/u/jh;->m:Lcom/ss/android/socialbase/downloader/model/o;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/o;->m()V

    return-void
.end method

.method public m(Lcom/ss/android/socialbase/downloader/u/vv;)V
    .locals 4
    .param p1    # Lcom/ss/android/socialbase/downloader/u/vv;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/u/jh;->m:Lcom/ss/android/socialbase/downloader/model/o;

    iget-object v1, p1, Lcom/ss/android/socialbase/downloader/u/vv;->vv:[B

    iget v2, p1, Lcom/ss/android/socialbase/downloader/u/vv;->p:I

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Lcom/ss/android/socialbase/downloader/model/o;->vv([BII)V

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/u/jh;->vv:Lcom/ss/android/socialbase/downloader/u/wv;

    iget p1, p1, Lcom/ss/android/socialbase/downloader/u/vv;->p:I

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/u/wv;->m(J)V

    return-void
.end method

.method public o()Lcom/ss/android/socialbase/downloader/u/wv;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/u/jh;->vv:Lcom/ss/android/socialbase/downloader/u/wv;

    return-object v0
.end method

.method public p()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/u/jh;->m:Lcom/ss/android/socialbase/downloader/model/o;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/o;->p()V

    return-void
.end method

.method public vv()Lcom/ss/android/socialbase/downloader/u/o;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/u/jh;->p:Lcom/ss/android/socialbase/downloader/u/o;

    return-object v0
.end method
