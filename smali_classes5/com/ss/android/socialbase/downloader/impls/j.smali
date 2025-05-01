.class public Lcom/ss/android/socialbase/downloader/impls/j;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/socialbase/downloader/downloader/r;


# instance fields
.field private final i:Z

.field private final m:Lcom/ss/android/socialbase/downloader/downloader/k;

.field private final p:Lcom/ss/android/socialbase/downloader/downloader/q;

.field private final vv:Lcom/ss/android/socialbase/downloader/impls/vv;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/ss/android/socialbase/downloader/impls/j;-><init>(Z)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->w()Lcom/ss/android/socialbase/downloader/impls/vv;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->vv:Lcom/ss/android/socialbase/downloader/impls/vv;

    .line 4
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->ns()Lcom/ss/android/socialbase/downloader/downloader/k;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->m:Lcom/ss/android/socialbase/downloader/downloader/k;

    if-nez p1, :cond_0

    .line 5
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->vu()Lcom/ss/android/socialbase/downloader/downloader/q;

    move-result-object p1

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/impls/j;->p:Lcom/ss/android/socialbase/downloader/downloader/q;

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->ff()Lcom/ss/android/socialbase/downloader/downloader/q;

    move-result-object p1

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/impls/j;->p:Lcom/ss/android/socialbase/downloader/downloader/q;

    .line 7
    :goto_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/n/vv;->p()Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object p1

    const/4 v0, 0x0

    const-string v1, "service_alive"

    invoke-virtual {p1, v1, v0}, Lcom/ss/android/socialbase/downloader/n/vv;->m(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/impls/j;->i:Z

    return-void
.end method


# virtual methods
.method public b(I)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/p/vv;->vv(I)V

    return-void
.end method

.method public d(I)Lcom/ss/android/socialbase/downloader/depend/vu;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->vv:Lcom/ss/android/socialbase/downloader/impls/vv;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/impls/vv;->wv(I)Lcom/ss/android/socialbase/downloader/depend/vu;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public g(I)Lcom/ss/android/socialbase/downloader/depend/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->vv:Lcom/ss/android/socialbase/downloader/impls/vv;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/impls/vv;->qv(I)Lcom/ss/android/socialbase/downloader/depend/a;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    .line 3
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->cq()Lcom/ss/android/socialbase/downloader/depend/a;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method public i()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/DownloadInfo;",
            ">;"
        }
    .end annotation

    .line 3
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->m:Lcom/ss/android/socialbase/downloader/downloader/k;

    if-eqz v0, :cond_0

    .line 4
    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/downloader/k;->m()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public i(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/DownloadInfo;",
            ">;"
        }
    .end annotation

    .line 7
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->m:Lcom/ss/android/socialbase/downloader/downloader/k;

    if-eqz v0, :cond_0

    .line 8
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/k;->i(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public i(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->vv:Lcom/ss/android/socialbase/downloader/impls/vv;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/impls/vv;->n(I)Z

    :cond_0
    return-void
.end method

.method public i(IZ)V
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->vv:Lcom/ss/android/socialbase/downloader/impls/vv;

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/impls/vv;->p(IZ)V

    :cond_0
    return-void
.end method

.method public j(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->m:Lcom/ss/android/socialbase/downloader/downloader/k;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/k;->u(I)Z

    move-result p1

    return p1
.end method

.method public jh(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->vv:Lcom/ss/android/socialbase/downloader/impls/vv;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/impls/vv;->b(I)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public k(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->vv:Lcom/ss/android/socialbase/downloader/impls/vv;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/impls/vv;->r(I)V

    :cond_0
    return-void
.end method

.method public la(I)Lcom/ss/android/socialbase/downloader/depend/IDownloadFileUriProvider;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->vv:Lcom/ss/android/socialbase/downloader/impls/vv;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/impls/vv;->k(I)Lcom/ss/android/socialbase/downloader/depend/IDownloadFileUriProvider;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public m(Ljava/lang/String;Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    .locals 0

    .line 7
    invoke-static {p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/p;->vv(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    .line 8
    invoke-virtual {p0, p1}, Lcom/ss/android/socialbase/downloader/impls/j;->qv(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1

    return-object p1
.end method

.method public m(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/DownloadInfo;",
            ">;"
        }
    .end annotation

    .line 3
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->m:Lcom/ss/android/socialbase/downloader/downloader/k;

    if-eqz v0, :cond_0

    .line 4
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/k;->m(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public m(IILcom/ss/android/socialbase/downloader/depend/IDownloadListener;Lcom/ss/android/socialbase/downloader/constants/u;Z)V
    .locals 6

    .line 11
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->vv:Lcom/ss/android/socialbase/downloader/impls/vv;

    if-eqz v0, :cond_0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    .line 12
    invoke-virtual/range {v0 .. v5}, Lcom/ss/android/socialbase/downloader/impls/vv;->vv(IILcom/ss/android/socialbase/downloader/depend/IDownloadListener;Lcom/ss/android/socialbase/downloader/constants/u;Z)V

    :cond_0
    return-void
.end method

.method public m(ILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/m;",
            ">;)V"
        }
    .end annotation

    .line 18
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->m:Lcom/ss/android/socialbase/downloader/downloader/k;

    invoke-interface {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/k;->m(ILjava/util/List;)V

    return-void
.end method

.method public m(IZ)V
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->vv:Lcom/ss/android/socialbase/downloader/impls/vv;

    if-eqz v0, :cond_0

    .line 10
    invoke-virtual {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/impls/vv;->m(IZ)V

    :cond_0
    return-void
.end method

.method public m(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->m:Lcom/ss/android/socialbase/downloader/downloader/k;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/k;->m(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    return-void
.end method

.method public m(Lcom/ss/android/socialbase/downloader/model/DownloadTask;)V
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->p:Lcom/ss/android/socialbase/downloader/downloader/q;

    if-eqz v0, :cond_0

    .line 16
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/q;->p(Lcom/ss/android/socialbase/downloader/model/DownloadTask;)V

    :cond_0
    return-void
.end method

.method public m(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 5
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->vv:Lcom/ss/android/socialbase/downloader/impls/vv;

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/impls/vv;->m(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method public m()Z
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->p:Lcom/ss/android/socialbase/downloader/downloader/q;

    if-eqz v0, :cond_0

    .line 14
    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/downloader/q;->m()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public m(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->vv:Lcom/ss/android/socialbase/downloader/impls/vv;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/impls/vv;->t(I)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public n()Z
    .locals 2

    .line 3
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->i:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->p:Lcom/ss/android/socialbase/downloader/downloader/q;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/downloader/q;->vv()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    return v1
.end method

.method public n(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->vv:Lcom/ss/android/socialbase/downloader/impls/vv;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/impls/vv;->vv(I)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public o(I)J
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->m:Lcom/ss/android/socialbase/downloader/downloader/k;

    const-wide/16 v1, 0x0

    if-nez v0, :cond_0

    return-wide v1

    .line 2
    :cond_0
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/k;->m(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v0

    if-nez v0, :cond_1

    return-wide v1

    .line 3
    :cond_1
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getChunkCount()I

    move-result v3

    const/4 v4, 0x1

    if-gt v3, v4, :cond_2

    .line 4
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v0

    return-wide v0

    .line 5
    :cond_2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->m:Lcom/ss/android/socialbase/downloader/downloader/k;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/k;->p(I)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 6
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-eq v0, v3, :cond_3

    goto :goto_0

    .line 7
    :cond_3
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/wv/u;->m(Ljava/util/List;)J

    move-result-wide v0

    return-wide v0

    :cond_4
    :goto_0
    return-wide v1
.end method

.method public o(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/DownloadInfo;",
            ">;"
        }
    .end annotation

    .line 8
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->vv:Lcom/ss/android/socialbase/downloader/impls/vv;

    if-eqz v0, :cond_0

    .line 9
    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/impls/vv;->m(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public o()Z
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->m:Lcom/ss/android/socialbase/downloader/downloader/k;

    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/downloader/k;->i()Z

    move-result v0

    return v0
.end method

.method public p(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/DownloadInfo;",
            ">;"
        }
    .end annotation

    .line 3
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->m:Lcom/ss/android/socialbase/downloader/downloader/k;

    if-eqz v0, :cond_0

    .line 4
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/k;->p(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public p(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->vv:Lcom/ss/android/socialbase/downloader/impls/vv;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/impls/vv;->u(I)Z

    :cond_0
    return-void
.end method

.method public p(IZ)V
    .locals 1

    .line 6
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/i;->vv()Lcom/ss/android/socialbase/downloader/downloader/i;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/i;->vv(IZ)V

    return-void
.end method

.method public p()Z
    .locals 1

    .line 5
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->s()Z

    move-result v0

    return v0
.end method

.method public p(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->m:Lcom/ss/android/socialbase/downloader/downloader/k;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/k;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    move-result p1

    return p1
.end method

.method public q(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->m:Lcom/ss/android/socialbase/downloader/downloader/k;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/k;->i(I)V

    return-void
.end method

.method public qv(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->vv:Lcom/ss/android/socialbase/downloader/impls/vv;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/impls/vv;->i(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public r(I)I
    .locals 1

    .line 1
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/i;->vv()Lcom/ss/android/socialbase/downloader/downloader/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/i;->vv(I)I

    move-result p1

    return p1
.end method

.method public startService()V
    .locals 0

    return-void
.end method

.method public t(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->m:Lcom/ss/android/socialbase/downloader/downloader/k;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/k;->o(I)Z

    move-result p1

    return p1
.end method

.method public u(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->vv:Lcom/ss/android/socialbase/downloader/impls/vv;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/impls/vv;->i(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1

    if-nez p1, :cond_1

    return v1

    .line 3
    :cond_1
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result p1

    return p1
.end method

.method public u()V
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->m:Lcom/ss/android/socialbase/downloader/downloader/k;

    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/downloader/k;->p()V

    return-void
.end method

.method public vv(Ljava/lang/String;Ljava/lang/String;)I
    .locals 0

    .line 11
    invoke-static {p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/p;->vv(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public vv(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/DownloadInfo;",
            ">;"
        }
    .end annotation

    .line 9
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->vv:Lcom/ss/android/socialbase/downloader/impls/vv;

    if-eqz v0, :cond_0

    .line 10
    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/impls/vv;->vv(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public vv()V
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->vv:Lcom/ss/android/socialbase/downloader/impls/vv;

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/impls/vv;->m()V

    :cond_0
    return-void
.end method

.method public vv(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->vv:Lcom/ss/android/socialbase/downloader/impls/vv;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/impls/vv;->o(I)Z

    :cond_0
    return-void
.end method

.method public vv(II)V
    .locals 2

    .line 33
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->o()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 34
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->o()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 35
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ss/android/socialbase/downloader/depend/ot;

    if-eqz v1, :cond_0

    .line 37
    invoke-interface {v1, p2, p1}, Lcom/ss/android/socialbase/downloader/depend/ot;->vv(II)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public vv(IIII)V
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->m:Lcom/ss/android/socialbase/downloader/downloader/k;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/ss/android/socialbase/downloader/downloader/k;->vv(IIII)V

    return-void
.end method

.method public vv(IIIJ)V
    .locals 6

    .line 30
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->m:Lcom/ss/android/socialbase/downloader/downloader/k;

    move v1, p1

    move v2, p2

    move v3, p3

    move-wide v4, p4

    invoke-interface/range {v0 .. v5}, Lcom/ss/android/socialbase/downloader/downloader/k;->vv(IIIJ)V

    return-void
.end method

.method public vv(IIJ)V
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->m:Lcom/ss/android/socialbase/downloader/downloader/k;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/ss/android/socialbase/downloader/downloader/k;->vv(IIJ)V

    return-void
.end method

.method public vv(IILcom/ss/android/socialbase/downloader/depend/IDownloadListener;Lcom/ss/android/socialbase/downloader/constants/u;Z)V
    .locals 6

    .line 12
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->vv:Lcom/ss/android/socialbase/downloader/impls/vv;

    if-eqz v0, :cond_0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    .line 13
    invoke-virtual/range {v0 .. v5}, Lcom/ss/android/socialbase/downloader/impls/vv;->m(IILcom/ss/android/socialbase/downloader/depend/IDownloadListener;Lcom/ss/android/socialbase/downloader/constants/u;Z)V

    :cond_0
    return-void
.end method

.method public vv(IILcom/ss/android/socialbase/downloader/depend/IDownloadListener;Lcom/ss/android/socialbase/downloader/constants/u;ZZ)V
    .locals 7

    .line 14
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->vv:Lcom/ss/android/socialbase/downloader/impls/vv;

    if-eqz v0, :cond_0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    move v6, p6

    .line 15
    invoke-virtual/range {v0 .. v6}, Lcom/ss/android/socialbase/downloader/impls/vv;->vv(IILcom/ss/android/socialbase/downloader/depend/IDownloadListener;Lcom/ss/android/socialbase/downloader/constants/u;ZZ)V

    :cond_0
    return-void
.end method

.method public vv(IJ)V
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->vv:Lcom/ss/android/socialbase/downloader/impls/vv;

    if-eqz v0, :cond_0

    .line 41
    invoke-virtual {v0, p1, p2, p3}, Lcom/ss/android/socialbase/downloader/impls/vv;->m(IJ)V

    :cond_0
    return-void
.end method

.method public vv(ILandroid/app/Notification;)V
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->p:Lcom/ss/android/socialbase/downloader/downloader/q;

    if-eqz v0, :cond_0

    .line 21
    invoke-interface {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/q;->vv(ILandroid/app/Notification;)V

    :cond_0
    return-void
.end method

.method public vv(ILcom/ss/android/socialbase/downloader/depend/vu;)V
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->vv:Lcom/ss/android/socialbase/downloader/impls/vv;

    if-eqz v0, :cond_0

    .line 39
    invoke-virtual {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/impls/vv;->vv(ILcom/ss/android/socialbase/downloader/depend/vu;)V

    :cond_0
    return-void
.end method

.method public vv(ILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/m;",
            ">;)V"
        }
    .end annotation

    .line 27
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->m:Lcom/ss/android/socialbase/downloader/downloader/k;

    invoke-interface {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/k;->vv(ILjava/util/List;)V

    return-void
.end method

.method public vv(IZ)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->vv:Lcom/ss/android/socialbase/downloader/impls/vv;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/impls/vv;->vv(IZ)Z

    :cond_0
    return-void
.end method

.method public vv(Lcom/ss/android/socialbase/downloader/depend/ot;)V
    .locals 0

    .line 32
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/downloader/p;->vv(Lcom/ss/android/socialbase/downloader/depend/ot;)V

    return-void
.end method

.method public vv(Lcom/ss/android/socialbase/downloader/model/DownloadTask;)V
    .locals 5

    .line 24
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->p:Lcom/ss/android/socialbase/downloader/downloader/q;

    if-eqz v0, :cond_0

    .line 25
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/q;->m(Lcom/ss/android/socialbase/downloader/model/DownloadTask;)V

    return-void

    :cond_0
    if-eqz p1, :cond_2

    .line 26
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getMonitorDepend()Lcom/ss/android/socialbase/downloader/depend/l;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getDownloadInfo()Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v1

    new-instance v2, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    const/16 v3, 0x3eb

    const-string v4, "downloadServiceHandler is null"

    invoke-direct {v2, v3, v4}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getDownloadInfo()Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getDownloadInfo()Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-static {v0, v1, v2, p1}, Lcom/ss/android/socialbase/downloader/i/vv;->vv(Lcom/ss/android/socialbase/downloader/depend/l;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/downloader/exception/BaseException;I)V

    :cond_2
    return-void
.end method

.method public vv(Lcom/ss/android/socialbase/downloader/model/m;)V
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->m:Lcom/ss/android/socialbase/downloader/downloader/k;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/k;->vv(Lcom/ss/android/socialbase/downloader/model/m;)V

    return-void
.end method

.method public vv(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 7
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->vv:Lcom/ss/android/socialbase/downloader/impls/vv;

    if-eqz v0, :cond_0

    .line 8
    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/impls/vv;->vv(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method public vv(ZZ)V
    .locals 0

    .line 22
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/impls/j;->p:Lcom/ss/android/socialbase/downloader/downloader/q;

    if-eqz p1, :cond_0

    .line 23
    invoke-interface {p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/q;->vv(Z)V

    :cond_0
    return-void
.end method

.method public vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z
    .locals 3

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 16
    :cond_0
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v0

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSavePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/wv/u;->vv(ILjava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/high16 v1, 0x2000000

    .line 17
    invoke-static {v1}, Lcom/ss/android/socialbase/downloader/wv/vv;->vv(I)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    .line 18
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result p1

    invoke-virtual {p0, p1, v2}, Lcom/ss/android/socialbase/downloader/impls/j;->m(IZ)V

    goto :goto_0

    .line 19
    :cond_1
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result p1

    invoke-virtual {p0, p1, v2}, Lcom/ss/android/socialbase/downloader/impls/j;->i(IZ)V

    :cond_2
    :goto_0
    return v0
.end method

.method public wv(I)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/m;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/j;->m:Lcom/ss/android/socialbase/downloader/downloader/k;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/k;->p(I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
