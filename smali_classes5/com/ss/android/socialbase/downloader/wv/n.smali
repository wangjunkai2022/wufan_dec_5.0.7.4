.class public Lcom/ss/android/socialbase/downloader/wv/n;
.super Ljava/lang/Object;


# static fields
.field private static vv:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lcom/ss/android/socialbase/downloader/wv/n;->vv:Landroid/os/Handler;

    return-void
.end method

.method static synthetic vv()Landroid/os/Handler;
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/wv/n;->vv:Landroid/os/Handler;

    return-object v0
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/depend/n;)Lcom/ss/android/socialbase/downloader/depend/IDownloadFileUriProvider;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 61
    :cond_0
    new-instance v0, Lcom/ss/android/socialbase/downloader/wv/n$24;

    invoke-direct {v0, p0}, Lcom/ss/android/socialbase/downloader/wv/n$24;-><init>(Lcom/ss/android/socialbase/downloader/depend/n;)V

    return-object v0
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/depend/qv;)Lcom/ss/android/socialbase/downloader/depend/IDownloadInterceptor;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 60
    :cond_0
    new-instance v0, Lcom/ss/android/socialbase/downloader/wv/n$22;

    invoke-direct {v0, p0}, Lcom/ss/android/socialbase/downloader/wv/n$22;-><init>(Lcom/ss/android/socialbase/downloader/depend/qv;)V

    return-object v0
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/depend/wv;)Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 62
    :cond_0
    new-instance v0, Lcom/ss/android/socialbase/downloader/wv/n$25;

    invoke-direct {v0, p0}, Lcom/ss/android/socialbase/downloader/wv/n$25;-><init>(Lcom/ss/android/socialbase/downloader/depend/wv;)V

    return-object v0
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/depend/w;)Lcom/ss/android/socialbase/downloader/depend/a;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 49
    :cond_0
    new-instance v0, Lcom/ss/android/socialbase/downloader/wv/n$10;

    invoke-direct {v0, p0}, Lcom/ss/android/socialbase/downloader/wv/n$10;-><init>(Lcom/ss/android/socialbase/downloader/depend/w;)V

    return-object v0
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/depend/q;)Lcom/ss/android/socialbase/downloader/depend/d;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 11
    :cond_0
    new-instance v0, Lcom/ss/android/socialbase/downloader/wv/n$2;

    invoke-direct {v0, p0}, Lcom/ss/android/socialbase/downloader/wv/n$2;-><init>(Lcom/ss/android/socialbase/downloader/depend/q;)V

    return-object v0
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/depend/ot;)Lcom/ss/android/socialbase/downloader/depend/f;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 55
    :cond_0
    new-instance v0, Lcom/ss/android/socialbase/downloader/wv/n$17;

    invoke-direct {v0, p0}, Lcom/ss/android/socialbase/downloader/wv/n$17;-><init>(Lcom/ss/android/socialbase/downloader/depend/ot;)V

    return-object v0
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/depend/j;)Lcom/ss/android/socialbase/downloader/depend/g;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 57
    :cond_0
    new-instance v0, Lcom/ss/android/socialbase/downloader/wv/n$19;

    invoke-direct {v0, p0}, Lcom/ss/android/socialbase/downloader/wv/n$19;-><init>(Lcom/ss/android/socialbase/downloader/depend/j;)V

    return-object v0
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/depend/g;)Lcom/ss/android/socialbase/downloader/depend/j;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 10
    :cond_0
    new-instance v0, Lcom/ss/android/socialbase/downloader/wv/n$31;

    invoke-direct {v0, p0}, Lcom/ss/android/socialbase/downloader/wv/n$31;-><init>(Lcom/ss/android/socialbase/downloader/depend/g;)V

    return-object v0
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/depend/r;)Lcom/ss/android/socialbase/downloader/depend/jh;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 48
    :cond_0
    new-instance v0, Lcom/ss/android/socialbase/downloader/wv/n$9;

    invoke-direct {v0, p0}, Lcom/ss/android/socialbase/downloader/wv/n$9;-><init>(Lcom/ss/android/socialbase/downloader/depend/r;)V

    return-object v0
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/depend/l;)Lcom/ss/android/socialbase/downloader/depend/k;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 13
    :cond_0
    new-instance v0, Lcom/ss/android/socialbase/downloader/wv/n$4;

    invoke-direct {v0, p0}, Lcom/ss/android/socialbase/downloader/wv/n$4;-><init>(Lcom/ss/android/socialbase/downloader/depend/l;)V

    return-object v0
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/depend/k;)Lcom/ss/android/socialbase/downloader/depend/l;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 52
    :cond_0
    new-instance v0, Lcom/ss/android/socialbase/downloader/wv/n$14;

    invoke-direct {v0, p0}, Lcom/ss/android/socialbase/downloader/wv/n$14;-><init>(Lcom/ss/android/socialbase/downloader/depend/k;)V

    return-object v0
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/depend/IDownloadFileUriProvider;)Lcom/ss/android/socialbase/downloader/depend/n;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 8
    :cond_0
    new-instance v0, Lcom/ss/android/socialbase/downloader/wv/n$29;

    invoke-direct {v0, p0}, Lcom/ss/android/socialbase/downloader/wv/n$29;-><init>(Lcom/ss/android/socialbase/downloader/depend/IDownloadFileUriProvider;)V

    return-object v0
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/depend/vu;)Lcom/ss/android/socialbase/downloader/depend/ns;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 4
    :cond_0
    new-instance v0, Lcom/ss/android/socialbase/downloader/wv/n$23;

    invoke-direct {v0, p0}, Lcom/ss/android/socialbase/downloader/wv/n$23;-><init>(Lcom/ss/android/socialbase/downloader/depend/vu;)V

    return-object v0
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/downloader/qv;)Lcom/ss/android/socialbase/downloader/depend/o;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 14
    :cond_0
    new-instance v0, Lcom/ss/android/socialbase/downloader/wv/n$5;

    invoke-direct {v0, p0}, Lcom/ss/android/socialbase/downloader/wv/n$5;-><init>(Lcom/ss/android/socialbase/downloader/downloader/qv;)V

    return-object v0
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/depend/f;)Lcom/ss/android/socialbase/downloader/depend/ot;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 56
    :cond_0
    new-instance v0, Lcom/ss/android/socialbase/downloader/wv/n$18;

    invoke-direct {v0, p0}, Lcom/ss/android/socialbase/downloader/wv/n$18;-><init>(Lcom/ss/android/socialbase/downloader/depend/f;)V

    return-object v0
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/depend/d;)Lcom/ss/android/socialbase/downloader/depend/q;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 58
    :cond_0
    new-instance v0, Lcom/ss/android/socialbase/downloader/wv/n$20;

    invoke-direct {v0, p0}, Lcom/ss/android/socialbase/downloader/wv/n$20;-><init>(Lcom/ss/android/socialbase/downloader/depend/d;)V

    return-object v0
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/depend/IDownloadInterceptor;)Lcom/ss/android/socialbase/downloader/depend/qv;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 15
    :cond_0
    new-instance v0, Lcom/ss/android/socialbase/downloader/wv/n$6;

    invoke-direct {v0, p0}, Lcom/ss/android/socialbase/downloader/wv/n$6;-><init>(Lcom/ss/android/socialbase/downloader/depend/IDownloadInterceptor;)V

    return-object v0
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/depend/jh;)Lcom/ss/android/socialbase/downloader/depend/r;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 47
    :cond_0
    new-instance v0, Lcom/ss/android/socialbase/downloader/wv/n$8;

    invoke-direct {v0, p0}, Lcom/ss/android/socialbase/downloader/wv/n$8;-><init>(Lcom/ss/android/socialbase/downloader/depend/jh;)V

    return-object v0
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/depend/u;)Lcom/ss/android/socialbase/downloader/depend/t;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 51
    :cond_0
    new-instance v0, Lcom/ss/android/socialbase/downloader/wv/n$13;

    invoke-direct {v0, p0}, Lcom/ss/android/socialbase/downloader/wv/n$13;-><init>(Lcom/ss/android/socialbase/downloader/depend/u;)V

    return-object v0
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/depend/t;)Lcom/ss/android/socialbase/downloader/depend/u;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 12
    :cond_0
    new-instance v0, Lcom/ss/android/socialbase/downloader/wv/n$3;

    invoke-direct {v0, p0}, Lcom/ss/android/socialbase/downloader/wv/n$3;-><init>(Lcom/ss/android/socialbase/downloader/depend/t;)V

    return-object v0
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/depend/x;)Lcom/ss/android/socialbase/downloader/depend/v;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 9
    :cond_0
    new-instance v0, Lcom/ss/android/socialbase/downloader/wv/n$30;

    invoke-direct {v0, p0}, Lcom/ss/android/socialbase/downloader/wv/n$30;-><init>(Lcom/ss/android/socialbase/downloader/depend/x;)V

    return-object v0
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/depend/ns;)Lcom/ss/android/socialbase/downloader/depend/vu;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 46
    :cond_0
    new-instance v0, Lcom/ss/android/socialbase/downloader/wv/n$7;

    invoke-direct {v0, p0}, Lcom/ss/android/socialbase/downloader/wv/n$7;-><init>(Lcom/ss/android/socialbase/downloader/depend/ns;)V

    return-object v0
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/depend/a;)Lcom/ss/android/socialbase/downloader/depend/w;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 5
    :cond_0
    new-instance v0, Lcom/ss/android/socialbase/downloader/wv/n$26;

    invoke-direct {v0, p0}, Lcom/ss/android/socialbase/downloader/wv/n$26;-><init>(Lcom/ss/android/socialbase/downloader/depend/a;)V

    return-object v0
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;Z)Lcom/ss/android/socialbase/downloader/depend/wv;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 3
    :cond_0
    new-instance v0, Lcom/ss/android/socialbase/downloader/wv/n$12;

    invoke-direct {v0, p0, p1}, Lcom/ss/android/socialbase/downloader/wv/n$12;-><init>(Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;Z)V

    return-object v0
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/depend/v;)Lcom/ss/android/socialbase/downloader/depend/x;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 54
    :cond_0
    new-instance v0, Lcom/ss/android/socialbase/downloader/wv/n$16;

    invoke-direct {v0, p0}, Lcom/ss/android/socialbase/downloader/wv/n$16;-><init>(Lcom/ss/android/socialbase/downloader/depend/v;)V

    return-object v0
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/depend/ya;)Lcom/ss/android/socialbase/downloader/depend/y;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 7
    :cond_0
    new-instance v0, Lcom/ss/android/socialbase/downloader/wv/n$28;

    invoke-direct {v0, p0}, Lcom/ss/android/socialbase/downloader/wv/n$28;-><init>(Lcom/ss/android/socialbase/downloader/depend/ya;)V

    return-object v0
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/depend/y;)Lcom/ss/android/socialbase/downloader/depend/ya;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 53
    :cond_0
    new-instance v0, Lcom/ss/android/socialbase/downloader/wv/n$15;

    invoke-direct {v0, p0}, Lcom/ss/android/socialbase/downloader/wv/n$15;-><init>(Lcom/ss/android/socialbase/downloader/depend/y;)V

    return-object v0
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/downloader/la;)Lcom/ss/android/socialbase/downloader/depend/zn;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 6
    :cond_0
    new-instance v0, Lcom/ss/android/socialbase/downloader/wv/n$27;

    invoke-direct {v0, p0}, Lcom/ss/android/socialbase/downloader/wv/n$27;-><init>(Lcom/ss/android/socialbase/downloader/downloader/la;)V

    return-object v0
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/depend/zn;)Lcom/ss/android/socialbase/downloader/downloader/la;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 59
    :cond_0
    new-instance v0, Lcom/ss/android/socialbase/downloader/wv/n$21;

    invoke-direct {v0, p0}, Lcom/ss/android/socialbase/downloader/wv/n$21;-><init>(Lcom/ss/android/socialbase/downloader/depend/zn;)V

    return-object v0
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/depend/o;)Lcom/ss/android/socialbase/downloader/downloader/qv;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 50
    :cond_0
    new-instance v0, Lcom/ss/android/socialbase/downloader/wv/n$11;

    invoke-direct {v0, p0}, Lcom/ss/android/socialbase/downloader/wv/n$11;-><init>(Lcom/ss/android/socialbase/downloader/depend/o;)V

    return-object v0
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/model/vv;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;
    .locals 7

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 16
    :cond_0
    :try_start_0
    new-instance v1, Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    invoke-interface {p0}, Lcom/ss/android/socialbase/downloader/model/vv;->vv()Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;-><init>(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 17
    invoke-interface {p0}, Lcom/ss/android/socialbase/downloader/model/vv;->m()Lcom/ss/android/socialbase/downloader/depend/o;

    move-result-object v2

    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/wv/n;->vv(Lcom/ss/android/socialbase/downloader/depend/o;)Lcom/ss/android/socialbase/downloader/downloader/qv;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->chunkStategy(Lcom/ss/android/socialbase/downloader/downloader/qv;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v2

    .line 18
    invoke-interface {p0}, Lcom/ss/android/socialbase/downloader/model/vv;->p()Lcom/ss/android/socialbase/downloader/depend/ns;

    move-result-object v3

    invoke-static {v3}, Lcom/ss/android/socialbase/downloader/wv/n;->vv(Lcom/ss/android/socialbase/downloader/depend/ns;)Lcom/ss/android/socialbase/downloader/depend/vu;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->notificationEventListener(Lcom/ss/android/socialbase/downloader/depend/vu;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v2

    .line 19
    invoke-interface {p0}, Lcom/ss/android/socialbase/downloader/model/vv;->o()Lcom/ss/android/socialbase/downloader/depend/qv;

    move-result-object v3

    invoke-static {v3}, Lcom/ss/android/socialbase/downloader/wv/n;->vv(Lcom/ss/android/socialbase/downloader/depend/qv;)Lcom/ss/android/socialbase/downloader/depend/IDownloadInterceptor;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->interceptor(Lcom/ss/android/socialbase/downloader/depend/IDownloadInterceptor;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v2

    .line 20
    invoke-interface {p0}, Lcom/ss/android/socialbase/downloader/model/vv;->u()Lcom/ss/android/socialbase/downloader/depend/u;

    move-result-object v3

    invoke-static {v3}, Lcom/ss/android/socialbase/downloader/wv/n;->vv(Lcom/ss/android/socialbase/downloader/depend/u;)Lcom/ss/android/socialbase/downloader/depend/t;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->depend(Lcom/ss/android/socialbase/downloader/depend/t;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v2

    .line 21
    invoke-interface {p0}, Lcom/ss/android/socialbase/downloader/model/vv;->k()Lcom/ss/android/socialbase/downloader/depend/k;

    move-result-object v3

    invoke-static {v3}, Lcom/ss/android/socialbase/downloader/wv/n;->vv(Lcom/ss/android/socialbase/downloader/depend/k;)Lcom/ss/android/socialbase/downloader/depend/l;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->monitorDepend(Lcom/ss/android/socialbase/downloader/depend/l;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v2

    .line 22
    invoke-interface {p0}, Lcom/ss/android/socialbase/downloader/model/vv;->n()Lcom/ss/android/socialbase/downloader/depend/y;

    move-result-object v3

    invoke-static {v3}, Lcom/ss/android/socialbase/downloader/wv/n;->vv(Lcom/ss/android/socialbase/downloader/depend/y;)Lcom/ss/android/socialbase/downloader/depend/ya;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->forbiddenHandler(Lcom/ss/android/socialbase/downloader/depend/ya;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v2

    .line 23
    invoke-interface {p0}, Lcom/ss/android/socialbase/downloader/model/vv;->wv()Lcom/ss/android/socialbase/downloader/depend/j;

    move-result-object v3

    invoke-static {v3}, Lcom/ss/android/socialbase/downloader/wv/n;->vv(Lcom/ss/android/socialbase/downloader/depend/j;)Lcom/ss/android/socialbase/downloader/depend/g;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->diskSpaceHandler(Lcom/ss/android/socialbase/downloader/depend/g;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v2

    .line 24
    invoke-interface {p0}, Lcom/ss/android/socialbase/downloader/model/vv;->b()Lcom/ss/android/socialbase/downloader/depend/n;

    move-result-object v3

    invoke-static {v3}, Lcom/ss/android/socialbase/downloader/wv/n;->vv(Lcom/ss/android/socialbase/downloader/depend/n;)Lcom/ss/android/socialbase/downloader/depend/IDownloadFileUriProvider;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->fileUriProvider(Lcom/ss/android/socialbase/downloader/depend/IDownloadFileUriProvider;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v2

    .line 25
    invoke-interface {p0}, Lcom/ss/android/socialbase/downloader/model/vv;->i()Lcom/ss/android/socialbase/downloader/depend/w;

    move-result-object v3

    invoke-static {v3}, Lcom/ss/android/socialbase/downloader/wv/n;->vv(Lcom/ss/android/socialbase/downloader/depend/w;)Lcom/ss/android/socialbase/downloader/depend/a;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->notificationClickCallback(Lcom/ss/android/socialbase/downloader/depend/a;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v2

    .line 26
    invoke-interface {p0}, Lcom/ss/android/socialbase/downloader/model/vv;->qv()Lcom/ss/android/socialbase/downloader/depend/zn;

    move-result-object v3

    invoke-static {v3}, Lcom/ss/android/socialbase/downloader/wv/n;->vv(Lcom/ss/android/socialbase/downloader/depend/zn;)Lcom/ss/android/socialbase/downloader/downloader/la;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->retryDelayTimeCalculator(Lcom/ss/android/socialbase/downloader/downloader/la;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    .line 27
    sget-object v2, Lcom/ss/android/socialbase/downloader/constants/u;->vv:Lcom/ss/android/socialbase/downloader/constants/u;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    invoke-interface {p0, v3}, Lcom/ss/android/socialbase/downloader/model/vv;->m(I)Lcom/ss/android/socialbase/downloader/depend/wv;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 28
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v4

    invoke-static {v3}, Lcom/ss/android/socialbase/downloader/wv/n;->vv(Lcom/ss/android/socialbase/downloader/depend/wv;)Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;

    move-result-object v3

    invoke-virtual {v1, v4, v3}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->mainThreadListenerWithHashCode(ILcom/ss/android/socialbase/downloader/depend/IDownloadListener;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    .line 29
    :cond_1
    sget-object v3, Lcom/ss/android/socialbase/downloader/constants/u;->m:Lcom/ss/android/socialbase/downloader/constants/u;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    invoke-interface {p0, v4}, Lcom/ss/android/socialbase/downloader/model/vv;->m(I)Lcom/ss/android/socialbase/downloader/depend/wv;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 30
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v5

    invoke-static {v4}, Lcom/ss/android/socialbase/downloader/wv/n;->vv(Lcom/ss/android/socialbase/downloader/depend/wv;)Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;

    move-result-object v4

    invoke-virtual {v1, v5, v4}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->subThreadListenerWithHashCode(ILcom/ss/android/socialbase/downloader/depend/IDownloadListener;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    .line 31
    :cond_2
    sget-object v4, Lcom/ss/android/socialbase/downloader/constants/u;->p:Lcom/ss/android/socialbase/downloader/constants/u;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    invoke-interface {p0, v5}, Lcom/ss/android/socialbase/downloader/model/vv;->m(I)Lcom/ss/android/socialbase/downloader/depend/wv;

    move-result-object v5

    if-eqz v5, :cond_3

    .line 32
    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    move-result v6

    invoke-static {v5}, Lcom/ss/android/socialbase/downloader/wv/n;->vv(Lcom/ss/android/socialbase/downloader/depend/wv;)Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;

    move-result-object v5

    invoke-virtual {v1, v6, v5}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->notificationListenerWithHashCode(ILcom/ss/android/socialbase/downloader/depend/IDownloadListener;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    .line 33
    :cond_3
    invoke-static {v1, p0, v2}, Lcom/ss/android/socialbase/downloader/wv/n;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadTask;Lcom/ss/android/socialbase/downloader/model/vv;Lcom/ss/android/socialbase/downloader/constants/u;)V

    .line 34
    invoke-static {v1, p0, v3}, Lcom/ss/android/socialbase/downloader/wv/n;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadTask;Lcom/ss/android/socialbase/downloader/model/vv;Lcom/ss/android/socialbase/downloader/constants/u;)V

    .line 35
    invoke-static {v1, p0, v4}, Lcom/ss/android/socialbase/downloader/wv/n;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadTask;Lcom/ss/android/socialbase/downloader/model/vv;Lcom/ss/android/socialbase/downloader/constants/u;)V

    .line 36
    invoke-static {v1, p0}, Lcom/ss/android/socialbase/downloader/wv/n;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadTask;Lcom/ss/android/socialbase/downloader/model/vv;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception p0

    .line 37
    invoke-virtual {p0}, Landroid/os/RemoteException;->printStackTrace()V

    return-object v0
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/model/DownloadTask;)Lcom/ss/android/socialbase/downloader/model/vv;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 2
    :cond_0
    new-instance v0, Lcom/ss/android/socialbase/downloader/wv/n$1;

    invoke-direct {v0, p0}, Lcom/ss/android/socialbase/downloader/wv/n$1;-><init>(Lcom/ss/android/socialbase/downloader/model/DownloadTask;)V

    return-object v0
.end method

.method private static vv(Lcom/ss/android/socialbase/downloader/model/DownloadTask;Lcom/ss/android/socialbase/downloader/model/vv;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 43
    :goto_0
    invoke-interface {p1}, Lcom/ss/android/socialbase/downloader/model/vv;->jh()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 44
    invoke-interface {p1, v0}, Lcom/ss/android/socialbase/downloader/model/vv;->p(I)Lcom/ss/android/socialbase/downloader/depend/jh;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 45
    invoke-static {v1}, Lcom/ss/android/socialbase/downloader/wv/n;->vv(Lcom/ss/android/socialbase/downloader/depend/jh;)Lcom/ss/android/socialbase/downloader/depend/r;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->addDownloadCompleteHandler(Lcom/ss/android/socialbase/downloader/depend/r;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private static vv(Lcom/ss/android/socialbase/downloader/model/DownloadTask;Lcom/ss/android/socialbase/downloader/model/vv;Lcom/ss/android/socialbase/downloader/constants/u;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 38
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    const/4 v1, 0x0

    .line 39
    :goto_0
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    invoke-interface {p1, v2}, Lcom/ss/android/socialbase/downloader/model/vv;->vv(I)I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 40
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    invoke-interface {p1, v2, v1}, Lcom/ss/android/socialbase/downloader/model/vv;->vv(II)Lcom/ss/android/socialbase/downloader/depend/wv;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 41
    invoke-interface {v2}, Lcom/ss/android/socialbase/downloader/depend/wv;->vv()I

    move-result v3

    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/wv/n;->vv(Lcom/ss/android/socialbase/downloader/depend/wv;)Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 42
    :cond_1
    invoke-virtual {p0, v0, p2}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->setDownloadListeners(Landroid/util/SparseArray;Lcom/ss/android/socialbase/downloader/constants/u;)V

    return-void
.end method
