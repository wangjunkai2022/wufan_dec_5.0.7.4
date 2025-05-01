.class Lcom/ss/android/socialbase/appdownloader/m$o;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/socialbase/downloader/qv/qv$vv;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ss/android/socialbase/appdownloader/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "o"
.end annotation


# static fields
.field private static m:I

.field public static vv:I


# instance fields
.field private final i:Landroid/content/Intent;

.field private final n:J

.field private final o:Lcom/ss/android/socialbase/appdownloader/m$m;

.field private final p:Landroid/content/Context;

.field private qv:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final u:Landroid/os/Handler;

.field private wv:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/Intent;ILcom/ss/android/socialbase/appdownloader/m$m;J)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/m$o;->wv:Z

    .line 3
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/m$o;->p:Landroid/content/Context;

    .line 4
    iput-object p2, p0, Lcom/ss/android/socialbase/appdownloader/m$o;->i:Landroid/content/Intent;

    .line 5
    sput p3, Lcom/ss/android/socialbase/appdownloader/m$o;->m:I

    .line 6
    iput-object p4, p0, Lcom/ss/android/socialbase/appdownloader/m$o;->o:Lcom/ss/android/socialbase/appdownloader/m$m;

    .line 7
    new-instance p1, Lcom/ss/android/socialbase/downloader/qv/qv;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2, p0}, Lcom/ss/android/socialbase/downloader/qv/qv;-><init>(Landroid/os/Looper;Lcom/ss/android/socialbase/downloader/qv/qv$vv;)V

    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/m$o;->u:Landroid/os/Handler;

    .line 8
    iput-wide p5, p0, Lcom/ss/android/socialbase/appdownloader/m$o;->n:J

    return-void
.end method

.method static synthetic m(Lcom/ss/android/socialbase/appdownloader/m$o;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/socialbase/appdownloader/m$o;->u:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic vv(Lcom/ss/android/socialbase/appdownloader/m$o;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/ss/android/socialbase/appdownloader/m$o;->wv:Z

    return p0
.end method


# virtual methods
.method public vv(Landroid/os/Message;)V
    .locals 7

    if-eqz p1, :cond_9

    .line 2
    iget p1, p1, Landroid/os/Message;->what:I

    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    .line 3
    iget-wide v1, p0, Lcom/ss/android/socialbase/appdownloader/m$o;->n:J

    const-wide/16 v3, 0x0

    cmp-long p1, v1, v3

    if-lez p1, :cond_1

    const-wide/16 v3, 0x2710

    cmp-long p1, v1, v3

    if-lez p1, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    sput v0, Lcom/ss/android/socialbase/appdownloader/m$o;->vv:I

    .line 5
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->jh()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    new-instance v6, Lcom/ss/android/socialbase/appdownloader/m$i;

    iget-object v1, p0, Lcom/ss/android/socialbase/appdownloader/m$o;->u:Landroid/os/Handler;

    iget-object v2, p0, Lcom/ss/android/socialbase/appdownloader/m$o;->p:Landroid/content/Context;

    iget-object v3, p0, Lcom/ss/android/socialbase/appdownloader/m$o;->o:Lcom/ss/android/socialbase/appdownloader/m$m;

    iget-wide v4, p0, Lcom/ss/android/socialbase/appdownloader/m$o;->n:J

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/ss/android/socialbase/appdownloader/m$i;-><init>(Landroid/os/Handler;Landroid/content/Context;Lcom/ss/android/socialbase/appdownloader/m$m;J)V

    invoke-interface {p1, v6}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/m$o;->qv:Ljava/util/concurrent/Future;

    :cond_1
    :goto_0
    return-void

    :cond_2
    const/4 v1, 0x2

    if-ne p1, v1, :cond_9

    .line 6
    sput v1, Lcom/ss/android/socialbase/appdownloader/m$o;->vv:I

    .line 7
    iget-object p1, p0, Lcom/ss/android/socialbase/appdownloader/m$o;->u:Landroid/os/Handler;

    invoke-virtual {p1, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 8
    iget-object p1, p0, Lcom/ss/android/socialbase/appdownloader/m$o;->u:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 9
    iget-object p1, p0, Lcom/ss/android/socialbase/appdownloader/m$o;->qv:Ljava/util/concurrent/Future;

    if-eqz p1, :cond_3

    .line 10
    invoke-interface {p1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 11
    :cond_3
    iget-boolean p1, p0, Lcom/ss/android/socialbase/appdownloader/m$o;->wv:Z

    const/4 v1, 0x0

    if-nez p1, :cond_7

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-lt p1, v2, :cond_4

    invoke-static {}, Lcom/ss/android/socialbase/downloader/vv/vv;->vv()Lcom/ss/android/socialbase/downloader/vv/vv;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/vv/vv;->m()Z

    move-result p1

    if-eqz p1, :cond_7

    .line 12
    :cond_4
    iget-object p1, p0, Lcom/ss/android/socialbase/appdownloader/m$o;->i:Landroid/content/Intent;

    if-eqz p1, :cond_5

    .line 13
    iget-object v2, p0, Lcom/ss/android/socialbase/appdownloader/m$o;->p:Landroid/content/Context;

    invoke-static {v2, p1}, Lcom/ss/android/socialbase/appdownloader/m;->vv(Landroid/content/Context;Landroid/content/Intent;)Z

    goto :goto_1

    .line 14
    :cond_5
    iget-object p1, p0, Lcom/ss/android/socialbase/appdownloader/m$o;->p:Landroid/content/Context;

    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    move-result-object p1

    sget v2, Lcom/ss/android/socialbase/appdownloader/m$o;->m:I

    invoke-virtual {p1, v2}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getDownloadInfo(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1

    if-eqz p1, :cond_6

    .line 15
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isDownloadOverStatus()Z

    move-result p1

    if-eqz p1, :cond_6

    .line 16
    iget-object p1, p0, Lcom/ss/android/socialbase/appdownloader/m$o;->p:Landroid/content/Context;

    sget v2, Lcom/ss/android/socialbase/appdownloader/m$o;->m:I

    invoke-static {p1, v2, v1}, Lcom/ss/android/socialbase/appdownloader/p;->m(Landroid/content/Context;IZ)I

    .line 17
    :cond_6
    :goto_1
    iput-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/m$o;->wv:Z

    .line 18
    :cond_7
    iget-object p1, p0, Lcom/ss/android/socialbase/appdownloader/m$o;->i:Landroid/content/Intent;

    if-nez p1, :cond_8

    goto :goto_2

    :cond_8
    const/4 v0, 0x0

    .line 19
    :goto_2
    sget p1, Lcom/ss/android/socialbase/appdownloader/m$o;->m:I

    iget-object v1, p0, Lcom/ss/android/socialbase/appdownloader/m$o;->p:Landroid/content/Context;

    invoke-static {v1}, Lcom/ss/android/socialbase/appdownloader/m;->vv(Landroid/content/Context;)Z

    move-result v1

    invoke-static {p1, v0, v1}, Lcom/ss/android/socialbase/appdownloader/m;->vv(IZZ)V

    :cond_9
    return-void
.end method
