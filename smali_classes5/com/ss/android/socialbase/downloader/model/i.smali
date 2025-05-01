.class public Lcom/ss/android/socialbase/downloader/model/i;
.super Ljava/lang/Object;


# instance fields
.field private i:J

.field public final m:Lcom/ss/android/socialbase/downloader/network/n;

.field private o:J

.field public final p:I

.field public final vv:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/n;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/i;->vv:Ljava/lang/String;

    .line 3
    invoke-interface {p2}, Lcom/ss/android/socialbase/downloader/network/n;->m()I

    move-result p1

    iput p1, p0, Lcom/ss/android/socialbase/downloader/model/i;->p:I

    .line 4
    iput-object p2, p0, Lcom/ss/android/socialbase/downloader/model/i;->m:Lcom/ss/android/socialbase/downloader/network/n;

    return-void
.end method


# virtual methods
.method public b()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/i;->n()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/wv/u;->wv(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public i()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/i;->m:Lcom/ss/android/socialbase/downloader/network/n;

    const-string v1, "Content-Type"

    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/network/n;->vv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public k()J
    .locals 5

    .line 1
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/i;->o:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_1

    .line 2
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/i;->wv()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/i;->o()Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 5
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/wv/u;->m(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/i;->o:J

    goto :goto_0

    :cond_0
    const-wide/16 v0, -0x1

    .line 6
    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/i;->o:J

    .line 7
    :cond_1
    :goto_0
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/i;->o:J

    return-wide v0
.end method

.method public m()Z
    .locals 3

    .line 1
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/i;->p:I

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/i;->m:Lcom/ss/android/socialbase/downloader/network/n;

    const-string v2, "Accept-Ranges"

    invoke-interface {v1, v2}, Lcom/ss/android/socialbase/downloader/network/n;->vv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/wv/u;->vv(ILjava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public n()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/i;->m:Lcom/ss/android/socialbase/downloader/network/n;

    const-string v1, "Cache-Control"

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/wv/u;->m(Lcom/ss/android/socialbase/downloader/network/n;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public o()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/i;->m:Lcom/ss/android/socialbase/downloader/network/n;

    const-string v1, "Content-Range"

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/wv/u;->m(Lcom/ss/android/socialbase/downloader/network/n;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public p()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/i;->m:Lcom/ss/android/socialbase/downloader/network/n;

    const-string v1, "Etag"

    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/network/n;->vv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public qv()J
    .locals 5

    .line 1
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/i;->i:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/i;->m:Lcom/ss/android/socialbase/downloader/network/n;

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/wv/u;->vv(Lcom/ss/android/socialbase/downloader/network/n;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/i;->i:J

    .line 3
    :cond_0
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/i;->i:J

    return-wide v0
.end method

.method public u()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/i;->m:Lcom/ss/android/socialbase/downloader/network/n;

    const-string v1, "last-modified"

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/wv/u;->m(Lcom/ss/android/socialbase/downloader/network/n;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/i;->m:Lcom/ss/android/socialbase/downloader/network/n;

    const-string v1, "Last-Modified"

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/wv/u;->m(Lcom/ss/android/socialbase/downloader/network/n;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public vv()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/i;->p:I

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/wv/u;->p(I)Z

    move-result v0

    return v0
.end method

.method public wv()Z
    .locals 2

    const/16 v0, 0x8

    .line 1
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/wv/vv;->vv(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/i;->m:Lcom/ss/android/socialbase/downloader/network/n;

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/wv/u;->p(Lcom/ss/android/socialbase/downloader/network/n;)Z

    move-result v0

    return v0

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/i;->qv()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/wv/u;->m(J)Z

    move-result v0

    return v0
.end method
