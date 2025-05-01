.class public Lcom/ss/android/socialbase/downloader/impls/q;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/socialbase/downloader/downloader/r;
.implements Lcom/ss/android/socialbase/downloader/downloader/t;


# static fields
.field private static final vv:Ljava/lang/String; = "q"


# instance fields
.field private i:Lcom/ss/android/socialbase/downloader/downloader/r;

.field private volatile m:Lcom/ss/android/socialbase/downloader/downloader/wv;

.field private p:Lcom/ss/android/socialbase/downloader/downloader/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/ss/android/socialbase/downloader/downloader/q<",
            "Lcom/ss/android/socialbase/downloader/downloader/IndependentProcessDownloadService;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/ss/android/socialbase/downloader/impls/j;

    invoke-direct {v0}, Lcom/ss/android/socialbase/downloader/impls/j;-><init>()V

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->i:Lcom/ss/android/socialbase/downloader/downloader/r;

    .line 3
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->ff()Lcom/ss/android/socialbase/downloader/downloader/q;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->p:Lcom/ss/android/socialbase/downloader/downloader/q;

    .line 4
    invoke-interface {v0, p0}, Lcom/ss/android/socialbase/downloader/downloader/q;->vv(Lcom/ss/android/socialbase/downloader/downloader/t;)V

    return-void
.end method


# virtual methods
.method public b(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->p:Lcom/ss/android/socialbase/downloader/downloader/q;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/q;->vv(I)V

    :cond_0
    return-void
.end method

.method public d(I)Lcom/ss/android/socialbase/downloader/depend/vu;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    if-eqz v0, :cond_0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/wv;->d(I)Lcom/ss/android/socialbase/downloader/depend/ns;

    move-result-object p1

    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/wv/n;->vv(Lcom/ss/android/socialbase/downloader/depend/ns;)Lcom/ss/android/socialbase/downloader/depend/vu;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 3
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public g(I)Lcom/ss/android/socialbase/downloader/depend/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    if-eqz v0, :cond_0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/wv;->g(I)Lcom/ss/android/socialbase/downloader/depend/w;

    move-result-object p1

    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/wv/n;->vv(Lcom/ss/android/socialbase/downloader/depend/w;)Lcom/ss/android/socialbase/downloader/depend/a;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 3
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    :cond_0
    const/4 p1, 0x0

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

    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    if-nez v0, :cond_0

    .line 5
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->i:Lcom/ss/android/socialbase/downloader/downloader/r;

    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/downloader/r;->i()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 6
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/downloader/wv;->m()Ljava/util/List;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 7
    invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V

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

    .line 8
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    if-nez v0, :cond_0

    .line 9
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->i:Lcom/ss/android/socialbase/downloader/downloader/r;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->i(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 10
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/wv;->o(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 11
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    const/4 p1, 0x0

    return-object p1
.end method

.method public i(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/wv;->i(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 3
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    return-void
.end method

.method public j(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->i:Lcom/ss/android/socialbase/downloader/downloader/r;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->j(I)Z

    move-result p1

    return p1

    .line 3
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/wv;->j(I)Z

    move-result p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 4
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    const/4 p1, 0x0

    return p1
.end method

.method public jh(I)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/wv;->b(I)Z

    move-result p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 3
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    return v1
.end method

.method public k(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->i:Lcom/ss/android/socialbase/downloader/downloader/r;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->k(I)V

    return-void

    .line 3
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/wv;->k(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 4
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    return-void
.end method

.method public la(I)Lcom/ss/android/socialbase/downloader/depend/IDownloadFileUriProvider;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    if-eqz v0, :cond_0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/wv;->la(I)Lcom/ss/android/socialbase/downloader/depend/n;

    move-result-object p1

    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/wv/n;->vv(Lcom/ss/android/socialbase/downloader/depend/n;)Lcom/ss/android/socialbase/downloader/depend/IDownloadFileUriProvider;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 3
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public m(Ljava/lang/String;Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/ss/android/socialbase/downloader/impls/q;->vv(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    .line 5
    invoke-virtual {p0, p1}, Lcom/ss/android/socialbase/downloader/impls/q;->qv(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

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

    .line 6
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    if-nez v0, :cond_0

    .line 7
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->i:Lcom/ss/android/socialbase/downloader/downloader/r;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->m(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 8
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/wv;->m(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 9
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    const/4 p1, 0x0

    return-object p1
.end method

.method public m(IILcom/ss/android/socialbase/downloader/depend/IDownloadListener;Lcom/ss/android/socialbase/downloader/constants/u;Z)V
    .locals 7

    .line 18
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    if-nez v0, :cond_0

    return-void

    .line 19
    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/u;->m:Lcom/ss/android/socialbase/downloader/constants/u;

    if-ne p4, v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    :goto_0
    invoke-static {p3, v0}, Lcom/ss/android/socialbase/downloader/wv/n;->vv(Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;Z)Lcom/ss/android/socialbase/downloader/depend/wv;

    move-result-object v4

    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    move v2, p1

    move v3, p2

    move v6, p5

    invoke-interface/range {v1 .. v6}, Lcom/ss/android/socialbase/downloader/downloader/wv;->vv(IILcom/ss/android/socialbase/downloader/depend/wv;IZ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 20
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

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

    .line 28
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    if-nez v0, :cond_0

    .line 29
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->i:Lcom/ss/android/socialbase/downloader/downloader/r;

    invoke-interface {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/r;->m(ILjava/util/List;)V

    return-void

    .line 30
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-interface {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/wv;->vv(ILjava/util/List;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 31
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    return-void
.end method

.method public m(IZ)V
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    if-nez v0, :cond_0

    .line 15
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->i:Lcom/ss/android/socialbase/downloader/downloader/r;

    invoke-interface {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/r;->m(IZ)V

    return-void

    .line 16
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-interface {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/wv;->m(IZ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 17
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    return-void
.end method

.method public m(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 0

    return-void
.end method

.method public m(Lcom/ss/android/socialbase/downloader/model/DownloadTask;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 26
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->p:Lcom/ss/android/socialbase/downloader/downloader/q;

    if-eqz v0, :cond_1

    .line 27
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/q;->p(Lcom/ss/android/socialbase/downloader/model/DownloadTask;)V

    :cond_1
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

    .line 10
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    if-nez v0, :cond_0

    .line 11
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->i:Lcom/ss/android/socialbase/downloader/downloader/r;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->m(Ljava/util/List;)V

    return-void

    .line 12
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/wv;->m(Ljava/util/List;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 13
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    return-void
.end method

.method public m()Z
    .locals 3

    .line 21
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 22
    sget-object v0, Lcom/ss/android/socialbase/downloader/impls/q;->vv:Ljava/lang/String;

    const-string v2, "isServiceForeground, aidlService is null"

    invoke-static {v0, v2}, Lcom/ss/android/socialbase/downloader/p/vv;->i(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    .line 23
    :cond_0
    sget-object v0, Lcom/ss/android/socialbase/downloader/impls/q;->vv:Ljava/lang/String;

    const-string v2, "aidlService.isServiceForeground"

    invoke-static {v0, v2}, Lcom/ss/android/socialbase/downloader/p/vv;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/downloader/wv;->u()Z

    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    .line 25
    invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V

    return v1
.end method

.method public m(I)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/wv;->m(I)Z

    move-result p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 3
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    return v1
.end method

.method public n()Z
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public n(I)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/wv;->n(I)Z

    move-result p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 3
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    return v1
.end method

.method public o(I)J
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    const-wide/16 v1, 0x0

    if-nez v0, :cond_0

    return-wide v1

    .line 2
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/wv;->o(I)J

    move-result-wide v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    :catch_0
    move-exception p1

    .line 3
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

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

    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    if-eqz v0, :cond_0

    .line 5
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/wv;->i(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 6
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public o()Z
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    if-nez v0, :cond_0

    .line 8
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->i:Lcom/ss/android/socialbase/downloader/downloader/r;

    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/downloader/r;->o()Z

    move-result v0

    return v0

    .line 9
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/downloader/wv;->i()Z

    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    .line 10
    invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V

    const/4 v0, 0x0

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

    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    if-nez v0, :cond_0

    .line 5
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->i:Lcom/ss/android/socialbase/downloader/downloader/r;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->p(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 6
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/wv;->p(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 7
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    const/4 p1, 0x0

    return-object p1
.end method

.method public p(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/wv;->p(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 3
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    return-void
.end method

.method public p(IZ)V
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    if-nez v0, :cond_0

    return-void

    .line 10
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-interface {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/wv;->i(IZ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 11
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    return-void
.end method

.method public p()Z
    .locals 1

    .line 8
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->s()Z

    move-result v0

    return v0
.end method

.method public p(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    if-nez v0, :cond_0

    .line 13
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->i:Lcom/ss/android/socialbase/downloader/downloader/r;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->p(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    move-result p1

    return p1

    .line 14
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/wv;->m(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    move-result p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 15
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    const/4 p1, 0x0

    return p1
.end method

.method public q(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->i:Lcom/ss/android/socialbase/downloader/downloader/r;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->q(I)V

    return-void

    .line 3
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/wv;->q(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 4
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    return-void
.end method

.method public qv(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->i:Lcom/ss/android/socialbase/downloader/downloader/r;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->qv(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/wv;->qv(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 4
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    const/4 p1, 0x0

    return-object p1
.end method

.method public qv()V
    .locals 1

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    return-void
.end method

.method public r(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/i;->vv()Lcom/ss/android/socialbase/downloader/downloader/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/i;->m(I)I

    move-result p1

    return p1

    .line 3
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/wv;->r(I)I

    move-result p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 4
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    const/4 p1, -0x1

    return p1
.end method

.method public startService()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->p:Lcom/ss/android/socialbase/downloader/downloader/q;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/downloader/q;->startService()V

    :cond_0
    return-void
.end method

.method public t(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->i:Lcom/ss/android/socialbase/downloader/downloader/r;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->t(I)Z

    move-result p1

    return p1

    .line 3
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/wv;->t(I)Z

    move-result p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 4
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    const/4 p1, 0x0

    return p1
.end method

.method public u(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/wv;->u(I)I

    move-result p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 3
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    return v1
.end method

.method public u()V
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    if-nez v0, :cond_0

    .line 5
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->i:Lcom/ss/android/socialbase/downloader/downloader/r;

    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/downloader/r;->u()V

    return-void

    .line 6
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/downloader/wv;->o()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 7
    invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V

    return-void
.end method

.method public vv(Ljava/lang/String;Ljava/lang/String;)I
    .locals 0

    .line 14
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

    .line 10
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    if-nez v0, :cond_0

    .line 11
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->i:Lcom/ss/android/socialbase/downloader/downloader/r;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->vv(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 12
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/wv;->vv(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 13
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    const/4 p1, 0x0

    return-object p1
.end method

.method public vv()V
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    if-nez v0, :cond_0

    return-void

    .line 8
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/downloader/wv;->vv()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 9
    invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V

    return-void
.end method

.method public vv(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/wv;->vv(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 3
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    return-void
.end method

.method public vv(II)V
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    if-eqz v0, :cond_0

    .line 64
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-interface {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/wv;->vv(II)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 65
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    :cond_0
    return-void
.end method

.method public vv(IIII)V
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    if-nez v0, :cond_0

    .line 57
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->i:Lcom/ss/android/socialbase/downloader/downloader/r;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/ss/android/socialbase/downloader/downloader/r;->vv(IIII)V

    return-void

    .line 58
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/ss/android/socialbase/downloader/downloader/wv;->vv(IIII)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 59
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    return-void
.end method

.method public vv(IIIJ)V
    .locals 8

    .line 52
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    if-nez v0, :cond_0

    .line 53
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/impls/q;->i:Lcom/ss/android/socialbase/downloader/downloader/r;

    move v2, p1

    move v3, p2

    move v4, p3

    move-wide v5, p4

    invoke-interface/range {v1 .. v6}, Lcom/ss/android/socialbase/downloader/downloader/r;->vv(IIIJ)V

    return-void

    .line 54
    :cond_0
    :try_start_0
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    move v3, p1

    move v4, p2

    move v5, p3

    move-wide v6, p4

    invoke-interface/range {v2 .. v7}, Lcom/ss/android/socialbase/downloader/downloader/wv;->vv(IIIJ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 55
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    return-void
.end method

.method public vv(IIJ)V
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    if-nez v0, :cond_0

    .line 49
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->i:Lcom/ss/android/socialbase/downloader/downloader/r;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/ss/android/socialbase/downloader/downloader/r;->vv(IIJ)V

    return-void

    .line 50
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/ss/android/socialbase/downloader/downloader/wv;->vv(IIJ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 51
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    return-void
.end method

.method public vv(IILcom/ss/android/socialbase/downloader/depend/IDownloadListener;Lcom/ss/android/socialbase/downloader/constants/u;Z)V
    .locals 7

    .line 19
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    if-nez v0, :cond_0

    return-void

    .line 20
    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/u;->m:Lcom/ss/android/socialbase/downloader/constants/u;

    if-ne p4, v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    :goto_0
    invoke-static {p3, v0}, Lcom/ss/android/socialbase/downloader/wv/n;->vv(Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;Z)Lcom/ss/android/socialbase/downloader/depend/wv;

    move-result-object v4

    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    move v2, p1

    move v3, p2

    move v6, p5

    invoke-interface/range {v1 .. v6}, Lcom/ss/android/socialbase/downloader/downloader/wv;->m(IILcom/ss/android/socialbase/downloader/depend/wv;IZ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 21
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    return-void
.end method

.method public vv(IILcom/ss/android/socialbase/downloader/depend/IDownloadListener;Lcom/ss/android/socialbase/downloader/constants/u;ZZ)V
    .locals 8

    .line 22
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    if-nez v0, :cond_0

    return-void

    .line 23
    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/u;->m:Lcom/ss/android/socialbase/downloader/constants/u;

    if-ne p4, v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    :goto_0
    invoke-static {p3, v0}, Lcom/ss/android/socialbase/downloader/wv/n;->vv(Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;Z)Lcom/ss/android/socialbase/downloader/depend/wv;

    move-result-object v4

    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    move v2, p1

    move v3, p2

    move v6, p5

    move v7, p6

    invoke-interface/range {v1 .. v7}, Lcom/ss/android/socialbase/downloader/downloader/wv;->vv(IILcom/ss/android/socialbase/downloader/depend/wv;IZZ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 24
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    return-void
.end method

.method public vv(IJ)V
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    if-nez v0, :cond_0

    return-void

    .line 73
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-interface {v0, p1, p2, p3}, Lcom/ss/android/socialbase/downloader/downloader/wv;->vv(IJ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 74
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    return-void
.end method

.method public vv(ILandroid/app/Notification;)V
    .locals 3

    .line 29
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    if-nez v0, :cond_0

    .line 30
    sget-object p1, Lcom/ss/android/socialbase/downloader/impls/q;->vv:Ljava/lang/String;

    const-string p2, "startForeground, aidlService is null"

    invoke-static {p1, p2}, Lcom/ss/android/socialbase/downloader/p/vv;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 31
    :cond_0
    sget-object v0, Lcom/ss/android/socialbase/downloader/impls/q;->vv:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "aidlService.startForeground, id = "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/p/vv;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-interface {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/wv;->vv(ILandroid/app/Notification;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 33
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    return-void
.end method

.method public vv(ILcom/ss/android/socialbase/downloader/depend/vu;)V
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    if-eqz v0, :cond_0

    .line 67
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-static {p2}, Lcom/ss/android/socialbase/downloader/wv/n;->vv(Lcom/ss/android/socialbase/downloader/depend/vu;)Lcom/ss/android/socialbase/downloader/depend/ns;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/wv;->vv(ILcom/ss/android/socialbase/downloader/depend/ns;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 68
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

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

    .line 41
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    if-nez v0, :cond_0

    return-void

    .line 42
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-interface {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/wv;->m(ILjava/util/List;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 43
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    return-void
.end method

.method public vv(IZ)V
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    if-nez v0, :cond_0

    return-void

    .line 5
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-interface {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/wv;->vv(IZ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 6
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    return-void
.end method

.method public vv(Landroid/os/IBinder;)V
    .locals 0

    .line 69
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/downloader/wv$vv;->vv(Landroid/os/IBinder;)Lcom/ss/android/socialbase/downloader/downloader/wv;

    move-result-object p1

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    .line 70
    invoke-static {}, Lcom/ss/android/socialbase/downloader/wv/u;->vv()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 71
    new-instance p1, Lcom/ss/android/socialbase/downloader/impls/q$1;

    invoke-direct {p1, p0}, Lcom/ss/android/socialbase/downloader/impls/q$1;-><init>(Lcom/ss/android/socialbase/downloader/impls/q;)V

    invoke-virtual {p0, p1}, Lcom/ss/android/socialbase/downloader/impls/q;->vv(Lcom/ss/android/socialbase/downloader/depend/ot;)V

    :cond_0
    return-void
.end method

.method public vv(Lcom/ss/android/socialbase/downloader/depend/ot;)V
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    if-eqz v0, :cond_0

    .line 61
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/wv/n;->vv(Lcom/ss/android/socialbase/downloader/depend/ot;)Lcom/ss/android/socialbase/downloader/depend/f;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/wv;->vv(Lcom/ss/android/socialbase/downloader/depend/f;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 62
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    :cond_0
    return-void
.end method

.method public vv(Lcom/ss/android/socialbase/downloader/model/DownloadTask;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 39
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->p:Lcom/ss/android/socialbase/downloader/downloader/q;

    if-eqz v0, :cond_1

    .line 40
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/q;->m(Lcom/ss/android/socialbase/downloader/model/DownloadTask;)V

    :cond_1
    return-void
.end method

.method public vv(Lcom/ss/android/socialbase/downloader/model/m;)V
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    if-nez v0, :cond_0

    .line 45
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->i:Lcom/ss/android/socialbase/downloader/downloader/r;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->vv(Lcom/ss/android/socialbase/downloader/model/m;)V

    return-void

    .line 46
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/wv;->vv(Lcom/ss/android/socialbase/downloader/model/m;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 47
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

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

    .line 15
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    if-nez v0, :cond_0

    .line 16
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->i:Lcom/ss/android/socialbase/downloader/downloader/r;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->vv(Ljava/util/List;)V

    return-void

    .line 17
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/wv;->vv(Ljava/util/List;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 18
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    return-void
.end method

.method public vv(ZZ)V
    .locals 1

    .line 34
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    if-nez p1, :cond_0

    .line 35
    sget-object p1, Lcom/ss/android/socialbase/downloader/impls/q;->vv:Ljava/lang/String;

    const-string p2, "stopForeground, aidlService is null"

    invoke-static {p1, p2}, Lcom/ss/android/socialbase/downloader/p/vv;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 36
    :cond_0
    sget-object p1, Lcom/ss/android/socialbase/downloader/impls/q;->vv:Ljava/lang/String;

    const-string v0, "aidlService.stopForeground"

    invoke-static {p1, v0}, Lcom/ss/android/socialbase/downloader/p/vv;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    :try_start_0
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-interface {p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/wv;->vv(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 38
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    return-void
.end method

.method public vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    if-nez v0, :cond_0

    .line 26
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->i:Lcom/ss/android/socialbase/downloader/downloader/r;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    move-result p1

    return p1

    .line 27
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/wv;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 28
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    :goto_0
    const/4 p1, 0x0

    return p1
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
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->i:Lcom/ss/android/socialbase/downloader/downloader/r;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->wv(I)Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/q;->m:Lcom/ss/android/socialbase/downloader/downloader/wv;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/wv;->wv(I)Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 4
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    const/4 p1, 0x0

    return-object p1
.end method
