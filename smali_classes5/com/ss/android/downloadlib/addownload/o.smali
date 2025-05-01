.class public Lcom/ss/android/downloadlib/addownload/o;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/downloadlib/addownload/n;
.implements Lcom/ss/android/downloadlib/n/r$vv;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ss/android/downloadlib/addownload/o$m;,
        Lcom/ss/android/downloadlib/addownload/o$vv;,
        Lcom/ss/android/downloadlib/addownload/o$p;
    }
.end annotation


# static fields
.field private static final vv:Ljava/lang/String; = "o"


# instance fields
.field private b:Z

.field private d:Lcom/ss/android/download/api/download/DownloadController;

.field private g:Ljava/lang/ref/SoftReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/SoftReference<",
            "Lcom/ss/android/download/api/config/OnItemClickListener;",
            ">;"
        }
    .end annotation
.end field

.field private i:Lcom/ss/android/downloadlib/addownload/i;

.field private j:Lcom/ss/android/download/api/download/DownloadEventConfig;

.field private jh:J

.field private final k:Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;

.field private la:Z

.field private final m:Lcom/ss/android/downloadlib/n/r;

.field private n:Lcom/ss/android/download/api/model/DownloadShortInfo;

.field private o:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private p:Lcom/ss/android/downloadlib/addownload/qv;

.field private q:Lcom/ss/android/download/api/download/DownloadModel;

.field private qv:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

.field private r:Ljava/lang/String;

.field private t:J

.field private final u:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private wv:Lcom/ss/android/downloadlib/addownload/o$p;

.field private final x:Z

.field private y:Ljava/lang/ref/SoftReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/SoftReference<",
            "Lcom/ss/android/download/api/config/IDownloadButtonClickListener;",
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
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/ss/android/downloadlib/n/r;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lcom/ss/android/downloadlib/n/r;-><init>(Landroid/os/Looper;Lcom/ss/android/downloadlib/n/r$vv;)V

    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->m:Lcom/ss/android/downloadlib/n/r;

    .line 3
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v1, p0, Lcom/ss/android/downloadlib/addownload/o;->u:Ljava/util/Map;

    .line 4
    new-instance v1, Lcom/ss/android/downloadlib/addownload/qv$vv;

    invoke-direct {v1, v0}, Lcom/ss/android/downloadlib/addownload/qv$vv;-><init>(Lcom/ss/android/downloadlib/n/r;)V

    iput-object v1, p0, Lcom/ss/android/downloadlib/addownload/o;->k:Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;

    const-wide/16 v1, -0x1

    .line 5
    iput-wide v1, p0, Lcom/ss/android/downloadlib/addownload/o;->t:J

    const/4 v1, 0x0

    .line 6
    iput-object v1, p0, Lcom/ss/android/downloadlib/addownload/o;->q:Lcom/ss/android/download/api/download/DownloadModel;

    .line 7
    iput-object v1, p0, Lcom/ss/android/downloadlib/addownload/o;->j:Lcom/ss/android/download/api/download/DownloadEventConfig;

    .line 8
    iput-object v1, p0, Lcom/ss/android/downloadlib/addownload/o;->d:Lcom/ss/android/download/api/download/DownloadController;

    .line 9
    new-instance v1, Lcom/ss/android/downloadlib/addownload/qv;

    invoke-direct {v1, p0}, Lcom/ss/android/downloadlib/addownload/qv;-><init>(Lcom/ss/android/downloadlib/addownload/o;)V

    iput-object v1, p0, Lcom/ss/android/downloadlib/addownload/o;->p:Lcom/ss/android/downloadlib/addownload/qv;

    .line 10
    new-instance v1, Lcom/ss/android/downloadlib/addownload/i;

    invoke-direct {v1, v0}, Lcom/ss/android/downloadlib/addownload/i;-><init>(Landroid/os/Handler;)V

    iput-object v1, p0, Lcom/ss/android/downloadlib/addownload/o;->i:Lcom/ss/android/downloadlib/addownload/i;

    .line 11
    invoke-static {}, Lcom/ss/android/socialbase/downloader/n/vv;->p()Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v0

    const-string v1, "ttdownloader_callback_twice"

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/ss/android/downloadlib/addownload/o;->x:Z

    return-void
.end method

.method private b()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->g:Ljava/lang/ref/SoftReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->g:Ljava/lang/ref/SoftReference;

    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ss/android/download/api/config/OnItemClickListener;

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/o;->q:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/o;->jh()Lcom/ss/android/download/api/download/DownloadEventConfig;

    move-result-object v2

    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/o;->r()Lcom/ss/android/download/api/download/DownloadController;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3}, Lcom/ss/android/download/api/config/OnItemClickListener;->onItemClick(Lcom/ss/android/download/api/download/DownloadModel;Lcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;)V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->g:Ljava/lang/ref/SoftReference;

    return-void

    .line 4
    :cond_0
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->m()Lcom/ss/android/download/api/config/p;

    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/o;->getContext()Landroid/content/Context;

    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/o;->r()Lcom/ss/android/download/api/download/DownloadController;

    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/o;->jh()Lcom/ss/android/download/api/download/DownloadEventConfig;

    return-void
.end method

.method private d()Lcom/ss/android/download/api/model/DownloadShortInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->n:Lcom/ss/android/download/api/model/DownloadShortInfo;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/ss/android/download/api/model/DownloadShortInfo;

    invoke-direct {v0}, Lcom/ss/android/download/api/model/DownloadShortInfo;-><init>()V

    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->n:Lcom/ss/android/download/api/model/DownloadShortInfo;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->n:Lcom/ss/android/download/api/model/DownloadShortInfo;

    return-object v0
.end method

.method private getContext()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->o:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->o:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    return-object v0

    .line 3
    :cond_0
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method static synthetic i(Lcom/ss/android/downloadlib/addownload/o;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/downloadlib/addownload/o;->u:Ljava/util/Map;

    return-object p0
.end method

.method private j()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->wv:Lcom/ss/android/downloadlib/addownload/o$p;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/os/AsyncTask;->getStatus()Landroid/os/AsyncTask$Status;

    move-result-object v0

    sget-object v2, Landroid/os/AsyncTask$Status;->FINISHED:Landroid/os/AsyncTask$Status;

    if-eq v0, v2, :cond_0

    .line 2
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->wv:Lcom/ss/android/downloadlib/addownload/o$p;

    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->cancel(Z)Z

    .line 3
    :cond_0
    new-instance v0, Lcom/ss/android/downloadlib/addownload/o$p;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lcom/ss/android/downloadlib/addownload/o$p;-><init>(Lcom/ss/android/downloadlib/addownload/o;Lcom/ss/android/downloadlib/addownload/o$1;)V

    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->wv:Lcom/ss/android/downloadlib/addownload/o$p;

    .line 4
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->r:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-nez v0, :cond_1

    .line 5
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->wv:Lcom/ss/android/downloadlib/addownload/o$p;

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/String;

    iget-object v5, p0, Lcom/ss/android/downloadlib/addownload/o;->q:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v5}, Lcom/ss/android/download/api/download/DownloadModel;->getDownloadUrl()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v2

    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/o;->q:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v2}, Lcom/ss/android/download/api/download/DownloadModel;->getPackageName()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v4, v1

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/o;->r:Ljava/lang/String;

    aput-object v1, v4, v3

    invoke-static {v0, v4}, Lcom/ss/android/downloadlib/n/m;->vv(Landroid/os/AsyncTask;[Ljava/lang/Object;)V

    return-void

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->wv:Lcom/ss/android/downloadlib/addownload/o$p;

    new-array v3, v3, [Ljava/lang/String;

    iget-object v4, p0, Lcom/ss/android/downloadlib/addownload/o;->q:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v4}, Lcom/ss/android/download/api/download/DownloadModel;->getDownloadUrl()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v2

    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/o;->q:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v2}, Lcom/ss/android/download/api/download/DownloadModel;->getPackageName()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v3, v1

    invoke-static {v0, v3}, Lcom/ss/android/downloadlib/n/m;->vv(Landroid/os/AsyncTask;[Ljava/lang/Object;)V

    return-void
.end method

.method private jh()Lcom/ss/android/download/api/download/DownloadEventConfig;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->j:Lcom/ss/android/download/api/download/DownloadEventConfig;

    if-nez v0, :cond_0

    new-instance v0, Lcom/ss/android/download/api/download/p$vv;

    invoke-direct {v0}, Lcom/ss/android/download/api/download/p$vv;-><init>()V

    invoke-virtual {v0}, Lcom/ss/android/download/api/download/p$vv;->vv()Lcom/ss/android/download/api/download/p;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method static synthetic k(Lcom/ss/android/downloadlib/addownload/o;)Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/downloadlib/addownload/o;->k:Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;

    return-object p0
.end method

.method static synthetic k()Ljava/lang/String;
    .locals 1

    .line 2
    sget-object v0, Lcom/ss/android/downloadlib/addownload/o;->vv:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic m(Lcom/ss/android/downloadlib/addownload/o;)Lcom/ss/android/downloadlib/addownload/qv;
    .locals 0

    .line 6
    iget-object p0, p0, Lcom/ss/android/downloadlib/addownload/o;->p:Lcom/ss/android/downloadlib/addownload/qv;

    return-object p0
.end method

.method static synthetic m(Lcom/ss/android/downloadlib/addownload/o;Z)V
    .locals 0

    .line 7
    invoke-direct {p0, p1}, Lcom/ss/android/downloadlib/addownload/o;->qv(Z)V

    return-void
.end method

.method static synthetic n(Lcom/ss/android/downloadlib/addownload/o;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/downloadlib/addownload/o;->qv:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    return-object p0
.end method

.method private n(Z)V
    .locals 16

    move-object/from16 v0, p0

    .line 2
    iget-object v1, v0, Lcom/ss/android/downloadlib/addownload/o;->i:Lcom/ss/android/downloadlib/addownload/i;

    new-instance v8, Lcom/ss/android/downloadlib/addownload/m/o;

    iget-wide v3, v0, Lcom/ss/android/downloadlib/addownload/o;->t:J

    iget-object v5, v0, Lcom/ss/android/downloadlib/addownload/o;->q:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-direct/range {p0 .. p0}, Lcom/ss/android/downloadlib/addownload/o;->jh()Lcom/ss/android/download/api/download/DownloadEventConfig;

    move-result-object v6

    invoke-direct/range {p0 .. p0}, Lcom/ss/android/downloadlib/addownload/o;->r()Lcom/ss/android/download/api/download/DownloadController;

    move-result-object v7

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, Lcom/ss/android/downloadlib/addownload/m/o;-><init>(JLcom/ss/android/download/api/download/DownloadModel;Lcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;)V

    invoke-virtual {v1, v8}, Lcom/ss/android/downloadlib/addownload/i;->vv(Lcom/ss/android/downloadlib/addownload/m/o;)V

    .line 3
    iget-object v9, v0, Lcom/ss/android/downloadlib/addownload/o;->i:Lcom/ss/android/downloadlib/addownload/i;

    new-instance v15, Lcom/ss/android/downloadlib/addownload/o$9;

    move/from16 v1, p1

    invoke-direct {v15, v0, v1}, Lcom/ss/android/downloadlib/addownload/o$9;-><init>(Lcom/ss/android/downloadlib/addownload/o;Z)V

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    invoke-virtual/range {v9 .. v15}, Lcom/ss/android/downloadlib/addownload/i;->vv(IJJLcom/ss/android/downloadlib/addownload/o$vv;)V

    return-void
.end method

.method static synthetic o(Lcom/ss/android/downloadlib/addownload/o;)Lcom/ss/android/download/api/model/DownloadShortInfo;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/o;->d()Lcom/ss/android/download/api/model/DownloadShortInfo;

    move-result-object p0

    return-object p0
.end method

.method private o(Z)V
    .locals 2

    .line 7
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->q:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-static {v0}, Lcom/ss/android/downloadlib/n/o;->m(Lcom/ss/android/download/api/download/DownloadModel;)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v0

    const-string v1, "notification_opt_2"

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/n/vv;->m(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->qv:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    if-eqz v0, :cond_0

    .line 8
    invoke-static {}, Lcom/ss/android/socialbase/downloader/notification/m;->vv()Lcom/ss/android/socialbase/downloader/notification/m;

    move-result-object v0

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/o;->qv:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/notification/m;->u(I)V

    .line 9
    :cond_0
    invoke-direct {p0, p1}, Lcom/ss/android/downloadlib/addownload/o;->u(Z)V

    return-void
.end method

.method static synthetic p(Lcom/ss/android/downloadlib/addownload/o;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/ss/android/downloadlib/addownload/o;->t:J

    return-wide v0
.end method

.method private p(I)Z
    .locals 5

    .line 3
    invoke-virtual {p0}, Lcom/ss/android/downloadlib/addownload/o;->o()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, -0x1

    .line 4
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/o;->q:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v2}, Lcom/ss/android/download/api/download/DownloadModel;->getQuickAppModel()Lcom/ss/android/download/api/model/i;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ss/android/download/api/model/i;->vv()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    if-eq p1, v3, :cond_2

    const/4 v3, 0x2

    if-eq p1, v3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x4

    goto :goto_0

    :cond_2
    const/4 v0, 0x5

    .line 5
    :goto_0
    iget-object v3, p0, Lcom/ss/android/downloadlib/addownload/o;->q:Lcom/ss/android/download/api/download/DownloadModel;

    instance-of v4, v3, Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-eqz v4, :cond_3

    .line 6
    check-cast v3, Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    const/4 v4, 0x3

    .line 7
    invoke-virtual {v3, v4}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->setFunnelType(I)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 8
    :cond_3
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v2}, Lcom/ss/android/downloadlib/n/wv;->p(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 9
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object v1

    iget-wide v3, p0, Lcom/ss/android/downloadlib/addownload/o;->t:J

    invoke-virtual {v1, v3, v4, p1}, Lcom/ss/android/downloadlib/i/vv;->vv(JI)V

    .line 10
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object p1

    .line 11
    iput v0, p1, Landroid/os/Message;->what:I

    .line 12
    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/o;->q:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v1}, Lcom/ss/android/download/api/download/DownloadModel;->getId()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iput-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 13
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/p;->vv()Lcom/ss/android/downloadlib/addownload/p;

    move-result-object p1

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/o;->q:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-virtual {p1, p0, v0, v1}, Lcom/ss/android/downloadlib/addownload/p;->vv(Lcom/ss/android/downloadlib/addownload/o;ILcom/ss/android/download/api/download/DownloadModel;)V

    goto :goto_1

    .line 14
    :cond_4
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object p1

    iget-wide v3, p0, Lcom/ss/android/downloadlib/addownload/o;->t:J

    invoke-virtual {p1, v3, v4, v1, v1}, Lcom/ss/android/downloadlib/i/vv;->vv(JZI)V

    :goto_1
    return v2
.end method

.method private q()Z
    .locals 8

    .line 1
    invoke-static {}, Lcom/ss/android/socialbase/downloader/n/vv;->p()Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v0

    const-string v1, "fix_click_start"

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, -0x3

    const/4 v3, 0x1

    if-eqz v0, :cond_5

    .line 2
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->qv:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    if-nez v0, :cond_0

    return v3

    .line 3
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v0

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->qv:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-gtz v0, :cond_1

    return v3

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->qv:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->qv:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 5
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v0

    const/4 v2, -0x4

    if-ne v0, v2, :cond_2

    goto :goto_0

    .line 6
    :cond_2
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->qv:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v0

    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/o;->qv:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 7
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSavePath()Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lcom/ss/android/downloadlib/addownload/o;->qv:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v4}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getName()Ljava/lang/String;

    move-result-object v4

    .line 8
    invoke-static {v0, v2, v4}, Lcom/ss/android/socialbase/downloader/wv/u;->vv(ILjava/lang/String;Ljava/lang/String;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_3

    return v3

    :catch_0
    :cond_3
    return v1

    :cond_4
    :goto_0
    return v3

    .line 9
    :cond_5
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->qv:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    if-nez v0, :cond_6

    return v3

    .line 10
    :cond_6
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v0

    if-eq v0, v2, :cond_7

    .line 11
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    move-result-object v0

    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/o;->qv:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->canResume(I)Z

    move-result v0

    if-nez v0, :cond_7

    return v3

    .line 12
    :cond_7
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->qv:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v0

    if-nez v0, :cond_8

    return v3

    :cond_8
    return v1
.end method

.method static synthetic qv(Lcom/ss/android/downloadlib/addownload/o;)Lcom/ss/android/download/api/download/DownloadModel;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/downloadlib/addownload/o;->q:Lcom/ss/android/download/api/download/DownloadModel;

    return-object p0
.end method

.method private qv(Z)V
    .locals 8

    .line 2
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->u:Ljava/util/Map;

    invoke-static {v0}, Lcom/ss/android/downloadlib/addownload/qv;->vv(Ljava/util/Map;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;

    .line 3
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/o;->q:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/o;->r()Lcom/ss/android/download/api/download/DownloadController;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;->onDownloadStart(Lcom/ss/android/download/api/download/DownloadModel;Lcom/ss/android/download/api/download/DownloadController;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->p:Lcom/ss/android/downloadlib/addownload/qv;

    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/o;->k:Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/downloadlib/addownload/qv;->vv(Landroid/content/Context;Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;)I

    move-result v0

    .line 5
    sget-object v1, Lcom/ss/android/downloadlib/addownload/o;->vv:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "beginDown id:"

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Lcom/ss/android/downloadlib/n/b;->vv(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    if-eqz v0, :cond_3

    .line 6
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/o;->qv:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    if-eqz v2, :cond_2

    invoke-static {}, Lcom/ss/android/socialbase/downloader/n/vv;->p()Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v2

    const-string v4, "fix_click_start"

    invoke-virtual {v2, v4}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    .line 7
    :cond_1
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/o;->p:Lcom/ss/android/downloadlib/addownload/qv;

    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/o;->qv:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    const/4 v4, 0x0

    invoke-virtual {p1, v2, v4}, Lcom/ss/android/downloadlib/addownload/qv;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Z)V

    goto :goto_2

    :cond_2
    :goto_1
    if-eqz p1, :cond_4

    .line 8
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/o;->p:Lcom/ss/android/downloadlib/addownload/qv;

    invoke-virtual {p1}, Lcom/ss/android/downloadlib/addownload/qv;->vv()V

    goto :goto_2

    .line 9
    :cond_3
    new-instance p1, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;

    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/o;->q:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v2}, Lcom/ss/android/download/api/download/DownloadModel;->getDownloadUrl()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p1, v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->vv()Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1

    const/4 v2, -0x1

    .line 10
    invoke-virtual {p1, v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setStatus(I)V

    .line 11
    invoke-direct {p0, p1}, Lcom/ss/android/downloadlib/addownload/o;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 12
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object p1

    iget-wide v4, p0, Lcom/ss/android/downloadlib/addownload/o;->t:J

    new-instance v2, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    const/4 v6, 0x2

    const-string v7, "start download failed, id=0"

    invoke-direct {v2, v6, v7}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    invoke-virtual {p1, v4, v5, v2}, Lcom/ss/android/downloadlib/i/vv;->vv(JLcom/ss/android/socialbase/downloader/exception/BaseException;)V

    .line 13
    invoke-static {}, Lcom/ss/android/downloadlib/o/p;->vv()Lcom/ss/android/downloadlib/o/p;

    move-result-object p1

    const-string v2, "beginDown"

    invoke-virtual {p1, v2}, Lcom/ss/android/downloadlib/o/p;->m(Ljava/lang/String;)V

    .line 14
    :cond_4
    :goto_2
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/o;->p:Lcom/ss/android/downloadlib/addownload/qv;

    invoke-virtual {p0}, Lcom/ss/android/downloadlib/addownload/o;->p()Z

    move-result v2

    invoke-virtual {p1, v2}, Lcom/ss/android/downloadlib/addownload/qv;->vv(Z)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 15
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "beginDown IC id:"

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1, v3}, Lcom/ss/android/downloadlib/n/b;->vv(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 16
    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/o;->b()V

    :cond_5
    return-void
.end method

.method private r()Lcom/ss/android/download/api/download/DownloadController;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->d:Lcom/ss/android/download/api/download/DownloadController;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/ss/android/download/api/download/m;

    invoke-direct {v0}, Lcom/ss/android/download/api/download/m;-><init>()V

    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->d:Lcom/ss/android/download/api/download/DownloadController;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->d:Lcom/ss/android/download/api/download/DownloadController;

    return-object v0
.end method

.method private t()V
    .locals 4

    .line 1
    sget-object v0, Lcom/ss/android/downloadlib/addownload/o;->vv:Ljava/lang/String;

    const-string v1, "pICD"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/ss/android/downloadlib/n/b;->vv(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 2
    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/o;->p:Lcom/ss/android/downloadlib/addownload/qv;

    iget-object v3, p0, Lcom/ss/android/downloadlib/addownload/o;->qv:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1, v3}, Lcom/ss/android/downloadlib/addownload/qv;->i(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "pICD BC"

    .line 3
    invoke-static {v0, v1, v2}, Lcom/ss/android/downloadlib/n/b;->vv(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, v0}, Lcom/ss/android/downloadlib/addownload/o;->u(Z)V

    return-void

    :cond_0
    const-string v1, "pICD IC"

    .line 5
    invoke-static {v0, v1, v2}, Lcom/ss/android/downloadlib/n/b;->vv(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 6
    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/o;->b()V

    return-void
.end method

.method static synthetic u(Lcom/ss/android/downloadlib/addownload/o;)Lcom/ss/android/downloadlib/addownload/i;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/downloadlib/addownload/o;->i:Lcom/ss/android/downloadlib/addownload/i;

    return-object p0
.end method

.method private u(Z)V
    .locals 13

    .line 3
    sget-object v0, Lcom/ss/android/downloadlib/addownload/o;->vv:Ljava/lang/String;

    const-string v1, "pBCD"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/ss/android/downloadlib/n/b;->vv(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 4
    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/o;->q()Z

    move-result v1

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_4

    .line 5
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/m/u;->vv()Lcom/ss/android/downloadlib/addownload/m/u;

    move-result-object v0

    iget-wide v1, p0, Lcom/ss/android/downloadlib/addownload/o;->t:J

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/downloadlib/addownload/m/u;->o(J)Lcom/ss/android/downloadlib/addownload/m/o;

    move-result-object v0

    .line 6
    iget-boolean v1, p0, Lcom/ss/android/downloadlib/addownload/o;->la:Z

    if-eqz v1, :cond_2

    .line 7
    invoke-virtual {p0}, Lcom/ss/android/downloadlib/addownload/o;->wv()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 8
    invoke-virtual {p0, v3}, Lcom/ss/android/downloadlib/addownload/o;->i(Z)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 9
    iget-object v0, v0, Lcom/ss/android/downloadlib/addownload/m/o;->i:Lcom/ss/android/download/api/download/DownloadController;

    if-eqz v0, :cond_0

    .line 10
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadController;->isAutoDownloadOnCardShow()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 11
    invoke-virtual {p0, p1, v4}, Lcom/ss/android/downloadlib/addownload/o;->vv(ZZ)V

    :cond_0
    return-void

    .line 12
    :cond_1
    invoke-virtual {p0, p1, v4}, Lcom/ss/android/downloadlib/addownload/o;->vv(ZZ)V

    return-void

    .line 13
    :cond_2
    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/o;->q:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v1}, Lcom/ss/android/download/api/download/DownloadModel;->isAd()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, v0, Lcom/ss/android/downloadlib/addownload/m/o;->i:Lcom/ss/android/download/api/download/DownloadController;

    if-eqz v1, :cond_3

    .line 14
    invoke-interface {v1}, Lcom/ss/android/download/api/download/DownloadController;->enableShowComplianceDialog()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, v0, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v1, :cond_3

    .line 15
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/compliance/m;->vv()Lcom/ss/android/downloadlib/addownload/compliance/m;

    move-result-object v1

    iget-object v2, v0, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-virtual {v1, v2}, Lcom/ss/android/downloadlib/addownload/compliance/m;->vv(Lcom/ss/android/download/api/download/DownloadModel;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 16
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/compliance/m;->vv()Lcom/ss/android/downloadlib/addownload/compliance/m;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ss/android/downloadlib/addownload/compliance/m;->vv(Lcom/ss/android/downloadlib/addownload/m/o;)Z

    move-result v0

    if-eqz v0, :cond_3

    return-void

    .line 17
    :cond_3
    invoke-virtual {p0, p1, v4}, Lcom/ss/android/downloadlib/addownload/o;->vv(ZZ)V

    return-void

    .line 18
    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v5, "pBCD continue download, status:"

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p0, Lcom/ss/android/downloadlib/addownload/o;->qv:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v5}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v2}, Lcom/ss/android/downloadlib/n/b;->vv(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 19
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->qv:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    if-eqz v0, :cond_5

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/o;->q:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v1, :cond_5

    .line 20
    invoke-interface {v1}, Lcom/ss/android/download/api/download/DownloadModel;->isNeedWifi()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setOnlyWifi(Z)V

    .line 21
    :cond_5
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->qv:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v0

    .line 22
    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/o;->qv:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v1

    .line 23
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/m/u;->vv()Lcom/ss/android/downloadlib/addownload/m/u;

    move-result-object v2

    iget-object v5, p0, Lcom/ss/android/downloadlib/addownload/o;->qv:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2, v5}, Lcom/ss/android/downloadlib/addownload/m/u;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lcom/ss/android/downloadad/api/vv/m;

    move-result-object v2

    const/4 v12, -0x2

    if-eq v0, v12, :cond_b

    const/4 v5, -0x1

    if-ne v0, v5, :cond_6

    goto/16 :goto_0

    .line 24
    :cond_6
    invoke-static {v0}, Lcom/ss/android/downloadlib/addownload/r;->vv(I)Z

    move-result v5

    if-eqz v5, :cond_a

    .line 25
    iget-object v5, p0, Lcom/ss/android/downloadlib/addownload/o;->q:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v5}, Lcom/ss/android/download/api/download/DownloadModel;->enablePause()Z

    move-result v5

    if-nez v5, :cond_7

    return-void

    .line 26
    :cond_7
    iget-object v5, p0, Lcom/ss/android/downloadlib/addownload/o;->i:Lcom/ss/android/downloadlib/addownload/i;

    invoke-virtual {v5, v4}, Lcom/ss/android/downloadlib/addownload/i;->vv(Z)V

    .line 27
    invoke-static {}, Lcom/ss/android/downloadlib/p/qv;->vv()Lcom/ss/android/downloadlib/p/qv;

    move-result-object v5

    invoke-static {}, Lcom/ss/android/downloadlib/addownload/m/u;->vv()Lcom/ss/android/downloadlib/addownload/m/u;

    move-result-object v6

    iget-wide v7, p0, Lcom/ss/android/downloadlib/addownload/o;->t:J

    invoke-virtual {v6, v7, v8}, Lcom/ss/android/downloadlib/addownload/m/u;->i(J)Lcom/ss/android/downloadad/api/vv/m;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/ss/android/downloadlib/p/qv;->m(Lcom/ss/android/downloadad/api/vv/m;)V

    .line 28
    invoke-static {v2}, Lcom/ss/android/downloadlib/n/o;->vv(Lcom/ss/android/downloadad/api/vv/vv;)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v5

    const-string v6, "cancel_pause_optimise_switch"

    invoke-virtual {v5, v6, v3}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result v5

    if-ne v5, v4, :cond_8

    const/4 v3, 0x1

    :cond_8
    if-eqz v3, :cond_9

    .line 29
    new-instance v3, Lcom/ss/android/downloadlib/addownload/o$5;

    invoke-direct {v3, p0}, Lcom/ss/android/downloadlib/addownload/o$5;-><init>(Lcom/ss/android/downloadlib/addownload/o;)V

    .line 30
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/i/i;->vv()Lcom/ss/android/downloadlib/addownload/i/i;

    move-result-object v4

    new-instance v11, Lcom/ss/android/downloadlib/addownload/o$6;

    move-object v5, v11

    move-object v6, p0

    move v7, v1

    move v8, p1

    move-object v9, v2

    move v10, v0

    invoke-direct/range {v5 .. v10}, Lcom/ss/android/downloadlib/addownload/o$6;-><init>(Lcom/ss/android/downloadlib/addownload/o;IZLcom/ss/android/downloadad/api/vv/m;I)V

    invoke-virtual {v4, v2, v0, v11, v3}, Lcom/ss/android/downloadlib/addownload/i/i;->vv(Lcom/ss/android/downloadad/api/vv/m;ILcom/ss/android/downloadlib/addownload/i/qv;Lcom/ss/android/downloadlib/addownload/vv/p;)V

    return-void

    .line 31
    :cond_9
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/i/b;->vv()Lcom/ss/android/downloadlib/addownload/i/b;

    move-result-object v3

    new-instance v4, Lcom/ss/android/downloadlib/addownload/o$7;

    move-object v5, v4

    move-object v6, p0

    move v7, v1

    move v8, p1

    move-object v9, v2

    move v10, v0

    invoke-direct/range {v5 .. v10}, Lcom/ss/android/downloadlib/addownload/o$7;-><init>(Lcom/ss/android/downloadlib/addownload/o;IZLcom/ss/android/downloadad/api/vv/m;I)V

    invoke-virtual {v3, v2, v0, v4}, Lcom/ss/android/downloadlib/addownload/i/b;->vv(Lcom/ss/android/downloadad/api/vv/m;ILcom/ss/android/downloadlib/addownload/i/qv;)V

    return-void

    .line 32
    :cond_a
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/o;->p:Lcom/ss/android/downloadlib/addownload/qv;

    iget-object v3, p0, Lcom/ss/android/downloadlib/addownload/o;->qv:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2, v3, p1}, Lcom/ss/android/downloadlib/addownload/qv;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Z)V

    .line 33
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/o;->qv:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-direct {p0, v1, v0, p1}, Lcom/ss/android/downloadlib/addownload/o;->vv(IILcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    goto :goto_1

    .line 34
    :cond_b
    :goto_0
    iget-object v5, p0, Lcom/ss/android/downloadlib/addownload/o;->p:Lcom/ss/android/downloadlib/addownload/qv;

    iget-object v6, p0, Lcom/ss/android/downloadlib/addownload/o;->qv:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v5, v6, p1}, Lcom/ss/android/downloadlib/addownload/qv;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Z)V

    if-eqz v2, :cond_c

    .line 35
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-virtual {v2, v5, v6}, Lcom/ss/android/downloadad/api/vv/m;->qv(J)V

    .line 36
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/o;->qv:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v5

    invoke-virtual {v2, v5, v6}, Lcom/ss/android/downloadad/api/vv/m;->wv(J)V

    .line 37
    :cond_c
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/o;->qv:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p1, v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setDownloadFromReserveWifi(Z)V

    .line 38
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/o;->i:Lcom/ss/android/downloadlib/addownload/i;

    new-instance v11, Lcom/ss/android/downloadlib/addownload/m/o;

    iget-wide v6, p0, Lcom/ss/android/downloadlib/addownload/o;->t:J

    iget-object v8, p0, Lcom/ss/android/downloadlib/addownload/o;->q:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/o;->jh()Lcom/ss/android/download/api/download/DownloadEventConfig;

    move-result-object v9

    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/o;->r()Lcom/ss/android/download/api/download/DownloadController;

    move-result-object v10

    move-object v5, v11

    invoke-direct/range {v5 .. v10}, Lcom/ss/android/downloadlib/addownload/m/o;-><init>(JLcom/ss/android/download/api/download/DownloadModel;Lcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;)V

    invoke-virtual {p1, v11}, Lcom/ss/android/downloadlib/addownload/i;->vv(Lcom/ss/android/downloadlib/addownload/m/o;)V

    .line 39
    iget-object v5, p0, Lcom/ss/android/downloadlib/addownload/o;->i:Lcom/ss/android/downloadlib/addownload/i;

    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/o;->qv:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v7

    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/o;->qv:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v9

    new-instance v11, Lcom/ss/android/downloadlib/addownload/o$3;

    invoke-direct {v11, p0, v1, v0}, Lcom/ss/android/downloadlib/addownload/o$3;-><init>(Lcom/ss/android/downloadlib/addownload/o;II)V

    move v6, v1

    invoke-virtual/range {v5 .. v11}, Lcom/ss/android/downloadlib/addownload/i;->vv(IJJLcom/ss/android/downloadlib/addownload/o$vv;)V

    if-ne v0, v12, :cond_d

    .line 40
    invoke-static {v2}, Lcom/ss/android/downloadlib/n/o;->vv(Lcom/ss/android/downloadad/api/vv/vv;)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object p1

    const-string v0, "show_pause_continue_toast"

    invoke-virtual {p1, v0, v3}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result p1

    if-ne p1, v4, :cond_d

    .line 41
    invoke-static {}, Lcom/ss/android/downloadlib/n;->vv()Lcom/ss/android/downloadlib/n;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ss/android/downloadlib/n;->m()Landroid/os/Handler;

    move-result-object p1

    new-instance v0, Lcom/ss/android/downloadlib/addownload/o$4;

    invoke-direct {v0, p0}, Lcom/ss/android/downloadlib/addownload/o$4;-><init>(Lcom/ss/android/downloadlib/addownload/o;)V

    const-wide/16 v1, 0x1f4

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_d
    :goto_1
    return-void
.end method

.method static synthetic vv(Lcom/ss/android/downloadlib/addownload/o;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/o;->getContext()Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method static synthetic vv(Lcom/ss/android/downloadlib/addownload/o;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/o;->qv:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    return-object p1
.end method

.method private vv(IILcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 1
    .param p3    # Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 96
    invoke-static {}, Lcom/ss/android/socialbase/downloader/n/vv;->p()Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object p3

    const-string v0, "fix_click_start"

    invoke-virtual {p3, v0}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_1

    const/4 p3, -0x3

    if-eq p2, p3, :cond_0

    .line 97
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/i;->vv()Lcom/ss/android/socialbase/downloader/downloader/i;

    move-result-object p3

    invoke-virtual {p3, p1}, Lcom/ss/android/socialbase/downloader/downloader/i;->o(I)Z

    move-result p3

    if-nez p3, :cond_0

    const/4 p1, 0x0

    .line 98
    invoke-virtual {p0, p1, p1}, Lcom/ss/android/downloadlib/addownload/o;->vv(ZZ)V

    return-void

    .line 99
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/i;->k()Lcom/ss/android/socialbase/appdownloader/i;

    move-result-object p3

    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p3, v0, p1, p2}, Lcom/ss/android/socialbase/appdownloader/i;->vv(Landroid/content/Context;II)V

    return-void

    .line 100
    :cond_1
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/i;->k()Lcom/ss/android/socialbase/appdownloader/i;

    move-result-object p3

    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p3, v0, p1, p2}, Lcom/ss/android/socialbase/appdownloader/i;->vv(Landroid/content/Context;II)V

    return-void
.end method

.method static synthetic vv(Lcom/ss/android/downloadlib/addownload/o;IILcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/ss/android/downloadlib/addownload/o;->vv(IILcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    return-void
.end method

.method static synthetic vv(Lcom/ss/android/downloadlib/addownload/o;Z)V
    .locals 0

    .line 4
    invoke-direct {p0, p1}, Lcom/ss/android/downloadlib/addownload/o;->n(Z)V

    return-void
.end method

.method private vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 2

    .line 101
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    const/4 v1, 0x3

    .line 102
    iput v1, v0, Landroid/os/Message;->what:I

    .line 103
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 104
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/o;->m:Lcom/ss/android/downloadlib/n/r;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method static synthetic wv(Lcom/ss/android/downloadlib/addownload/o;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/ss/android/downloadlib/addownload/o;->x:Z

    return p0
.end method


# virtual methods
.method public i()J
    .locals 2

    .line 2
    iget-wide v0, p0, Lcom/ss/android/downloadlib/addownload/o;->jh:J

    return-wide v0
.end method

.method public i(Z)Z
    .locals 3

    .line 3
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->y:Ljava/lang/ref/SoftReference;

    const/4 v1, 0x0

    const-string v2, "mDownloadButtonClickListener has recycled"

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    if-nez p1, :cond_0

    .line 4
    :try_start_0
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/o;->y:Ljava/lang/ref/SoftReference;

    invoke-virtual {p1}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ss/android/download/api/config/IDownloadButtonClickListener;

    invoke-interface {p1, v0}, Lcom/ss/android/download/api/config/IDownloadButtonClickListener;->handleComplianceDialog(Z)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/o;->y:Ljava/lang/ref/SoftReference;

    invoke-virtual {p1}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ss/android/download/api/config/IDownloadButtonClickListener;

    invoke-interface {p1}, Lcom/ss/android/download/api/config/IDownloadButtonClickListener;->handleMarketFailedComplianceDialog()V

    :goto_0
    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/o;->y:Ljava/lang/ref/SoftReference;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    .line 7
    :catch_0
    invoke-static {}, Lcom/ss/android/downloadlib/o/p;->vv()Lcom/ss/android/downloadlib/o/p;

    move-result-object p1

    invoke-virtual {p1, v2}, Lcom/ss/android/downloadlib/o/p;->m(Ljava/lang/String;)V

    return v1

    .line 8
    :cond_1
    invoke-static {}, Lcom/ss/android/downloadlib/o/p;->vv()Lcom/ss/android/downloadlib/o/p;

    move-result-object p1

    invoke-virtual {p1, v2}, Lcom/ss/android/downloadlib/o/p;->m(Ljava/lang/String;)V

    return v1
.end method

.method public synthetic m(ILcom/ss/android/download/api/download/DownloadStatusChangeListener;)Lcom/ss/android/downloadlib/addownload/n;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/ss/android/downloadlib/addownload/o;->vv(ILcom/ss/android/download/api/download/DownloadStatusChangeListener;)Lcom/ss/android/downloadlib/addownload/o;

    move-result-object p1

    return-object p1
.end method

.method public synthetic m(Landroid/content/Context;)Lcom/ss/android/downloadlib/addownload/n;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/ss/android/downloadlib/addownload/o;->vv(Landroid/content/Context;)Lcom/ss/android/downloadlib/addownload/o;

    move-result-object p1

    return-object p1
.end method

.method public synthetic m(Lcom/ss/android/download/api/download/DownloadController;)Lcom/ss/android/downloadlib/addownload/n;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/ss/android/downloadlib/addownload/o;->vv(Lcom/ss/android/download/api/download/DownloadController;)Lcom/ss/android/downloadlib/addownload/o;

    move-result-object p1

    return-object p1
.end method

.method public synthetic m(Lcom/ss/android/download/api/download/DownloadEventConfig;)Lcom/ss/android/downloadlib/addownload/n;
    .locals 0

    .line 4
    invoke-virtual {p0, p1}, Lcom/ss/android/downloadlib/addownload/o;->vv(Lcom/ss/android/download/api/download/DownloadEventConfig;)Lcom/ss/android/downloadlib/addownload/o;

    move-result-object p1

    return-object p1
.end method

.method public synthetic m(Lcom/ss/android/download/api/download/DownloadModel;)Lcom/ss/android/downloadlib/addownload/n;
    .locals 0

    .line 5
    invoke-virtual {p0, p1}, Lcom/ss/android/downloadlib/addownload/o;->vv(Lcom/ss/android/download/api/download/DownloadModel;)Lcom/ss/android/downloadlib/addownload/o;

    move-result-object p1

    return-object p1
.end method

.method public m(I)V
    .locals 6

    const/4 v0, 0x2

    const/4 v1, 0x1

    if-eq p1, v1, :cond_1

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 9
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "error actionType"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 10
    :cond_1
    :goto_0
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/o;->p:Lcom/ss/android/downloadlib/addownload/qv;

    iget-wide v3, p0, Lcom/ss/android/downloadlib/addownload/o;->t:J

    invoke-virtual {v2, v3, v4}, Lcom/ss/android/downloadlib/addownload/qv;->vv(J)V

    .line 11
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/m/u;->vv()Lcom/ss/android/downloadlib/addownload/m/u;

    move-result-object v2

    iget-wide v3, p0, Lcom/ss/android/downloadlib/addownload/o;->t:J

    invoke-virtual {v2, v3, v4}, Lcom/ss/android/downloadlib/addownload/m/u;->o(J)Lcom/ss/android/downloadlib/addownload/m/o;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ss/android/downloadlib/addownload/m/o;->ns()Z

    move-result v2

    if-nez v2, :cond_2

    .line 12
    invoke-static {}, Lcom/ss/android/downloadlib/o/p;->vv()Lcom/ss/android/downloadlib/o/p;

    move-result-object v2

    const-string v3, "handleDownload ModelBox !isStrictValid"

    invoke-virtual {v2, v3}, Lcom/ss/android/downloadlib/o/p;->vv(Ljava/lang/String;)V

    .line 13
    :cond_2
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/o;->p:Lcom/ss/android/downloadlib/addownload/qv;

    iget-object v3, p0, Lcom/ss/android/downloadlib/addownload/o;->q:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-virtual {v2, p1, v3}, Lcom/ss/android/downloadlib/addownload/qv;->vv(ILcom/ss/android/download/api/download/DownloadModel;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 14
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/compliance/u;->vv()Lcom/ss/android/downloadlib/addownload/compliance/u;

    move-result-object v0

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/o;->p:Lcom/ss/android/downloadlib/addownload/qv;

    iget-object v1, v1, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    new-instance v2, Lcom/ss/android/downloadlib/addownload/o$1;

    invoke-direct {v2, p0, p1}, Lcom/ss/android/downloadlib/addownload/o$1;-><init>(Lcom/ss/android/downloadlib/addownload/o;I)V

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/downloadlib/addownload/compliance/u;->vv(Lcom/ss/android/downloadlib/addownload/m/o;Lcom/ss/android/downloadlib/addownload/compliance/qv;)V

    return-void

    .line 15
    :cond_3
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/o;->p:Lcom/ss/android/downloadlib/addownload/qv;

    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/o;->getContext()Landroid/content/Context;

    move-result-object v3

    iget-boolean v4, p0, Lcom/ss/android/downloadlib/addownload/o;->la:Z

    invoke-virtual {v2, v3, p1, v4}, Lcom/ss/android/downloadlib/addownload/qv;->vv(Landroid/content/Context;IZ)Z

    move-result v2

    if-nez v2, :cond_6

    .line 16
    invoke-direct {p0, p1}, Lcom/ss/android/downloadlib/addownload/o;->p(I)Z

    move-result v2

    const/4 v3, 0x0

    const-string v4, "handleDownload id:"

    if-eq p1, v1, :cond_5

    if-eq p1, v0, :cond_4

    goto :goto_1

    :cond_4
    if-nez v2, :cond_6

    .line 17
    sget-object p1, Lcom/ss/android/downloadlib/addownload/o;->vv:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v4, p0, Lcom/ss/android/downloadlib/addownload/o;->t:J

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ",pBC:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, v3}, Lcom/ss/android/downloadlib/n/b;->vv(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 18
    invoke-virtual {p0, v1}, Lcom/ss/android/downloadlib/addownload/o;->m(Z)V

    return-void

    :cond_5
    if-nez v2, :cond_6

    .line 19
    sget-object p1, Lcom/ss/android/downloadlib/addownload/o;->vv:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v4, p0, Lcom/ss/android/downloadlib/addownload/o;->t:J

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ",pIC:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, v3}, Lcom/ss/android/downloadlib/n/b;->vv(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 20
    invoke-virtual {p0, v1}, Lcom/ss/android/downloadlib/addownload/o;->p(Z)V

    :cond_6
    :goto_1
    return-void
.end method

.method public m(Z)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Lcom/ss/android/downloadlib/addownload/o;->o(Z)V

    return-void
.end method

.method public m()Z
    .locals 1

    .line 8
    iget-boolean v0, p0, Lcom/ss/android/downloadlib/addownload/o;->b:Z

    return v0
.end method

.method public n()V
    .locals 2

    .line 4
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->u:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->u:Ljava/util/Map;

    invoke-static {v0}, Lcom/ss/android/downloadlib/addownload/qv;->vv(Ljava/util/Map;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;

    .line 6
    invoke-interface {v1}, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;->onIdle()V

    goto :goto_0

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->qv:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    if-eqz v0, :cond_2

    const/4 v1, -0x4

    .line 8
    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setStatus(I)V

    :cond_2
    return-void
.end method

.method public o()Z
    .locals 5

    .line 2
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->wv()Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "quick_app_enable_switch"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    if-eqz v0, :cond_0

    return v2

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->q:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getQuickAppModel()Lcom/ss/android/download/api/model/i;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->q:Lcom/ss/android/download/api/download/DownloadModel;

    .line 4
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getQuickAppModel()Lcom/ss/android/download/api/model/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ss/android/download/api/model/i;->vv()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->qv:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 5
    invoke-static {v0}, Lcom/ss/android/downloadlib/addownload/p;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/o;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    iget-object v3, p0, Lcom/ss/android/downloadlib/addownload/o;->q:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v3}, Lcom/ss/android/download/api/download/DownloadModel;->getQuickAppModel()Lcom/ss/android/download/api/model/i;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ss/android/download/api/model/i;->vv()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    const-string v4, "android.intent.action.VIEW"

    invoke-direct {v1, v4, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-static {v0, v1}, Lcom/ss/android/downloadlib/n/jh;->vv(Landroid/content/Context;Landroid/content/Intent;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    return v2
.end method

.method public p(Z)V
    .locals 3

    if-eqz p1, :cond_0

    .line 15
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object p1

    iget-wide v0, p0, Lcom/ss/android/downloadlib/addownload/o;->t:J

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v1, v2}, Lcom/ss/android/downloadlib/i/vv;->vv(JI)V

    .line 16
    :cond_0
    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/o;->t()V

    return-void
.end method

.method public p()Z
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->qv:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public qv()V
    .locals 3

    .line 17
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/m/u;->vv()Lcom/ss/android/downloadlib/addownload/m/u;

    move-result-object v0

    iget-wide v1, p0, Lcom/ss/android/downloadlib/addownload/o;->t:J

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/downloadlib/addownload/m/u;->u(J)V

    return-void
.end method

.method public u()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->m:Lcom/ss/android/downloadlib/n/r;

    new-instance v1, Lcom/ss/android/downloadlib/addownload/o$2;

    invoke-direct {v1, p0}, Lcom/ss/android/downloadlib/addownload/o$2;-><init>(Lcom/ss/android/downloadlib/addownload/o;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public vv(J)Lcom/ss/android/downloadlib/addownload/n;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-eqz v2, :cond_0

    .line 73
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/m/u;->vv()Lcom/ss/android/downloadlib/addownload/m/u;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/ss/android/downloadlib/addownload/m/u;->vv(J)Lcom/ss/android/download/api/download/DownloadModel;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 74
    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->q:Lcom/ss/android/download/api/download/DownloadModel;

    .line 75
    iput-wide p1, p0, Lcom/ss/android/downloadlib/addownload/o;->t:J

    .line 76
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->p:Lcom/ss/android/downloadlib/addownload/qv;

    invoke-virtual {v0, p1, p2}, Lcom/ss/android/downloadlib/addownload/qv;->vv(J)V

    goto :goto_0

    .line 77
    :cond_0
    invoke-static {}, Lcom/ss/android/downloadlib/o/p;->vv()Lcom/ss/android/downloadlib/o/p;

    move-result-object p1

    const/4 p2, 0x0

    const-string v0, "setModelId"

    invoke-virtual {p1, p2, v0}, Lcom/ss/android/downloadlib/o/p;->vv(ZLjava/lang/String;)V

    :cond_1
    :goto_0
    return-object p0
.end method

.method public vv(Lcom/ss/android/download/api/config/IDownloadButtonClickListener;)Lcom/ss/android/downloadlib/addownload/n;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 107
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/o;->y:Ljava/lang/ref/SoftReference;

    goto :goto_0

    .line 108
    :cond_0
    new-instance v0, Ljava/lang/ref/SoftReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->y:Ljava/lang/ref/SoftReference;

    :goto_0
    return-object p0
.end method

.method public vv(Lcom/ss/android/download/api/config/OnItemClickListener;)Lcom/ss/android/downloadlib/addownload/n;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 39
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/o;->g:Ljava/lang/ref/SoftReference;

    goto :goto_0

    .line 40
    :cond_0
    new-instance v0, Ljava/lang/ref/SoftReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->g:Ljava/lang/ref/SoftReference;

    :goto_0
    return-object p0
.end method

.method public vv(Ljava/lang/String;)Lcom/ss/android/downloadlib/addownload/n;
    .locals 1

    .line 105
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 106
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/o;->r:Ljava/lang/String;

    :cond_0
    return-object p0
.end method

.method public vv(ILcom/ss/android/download/api/download/DownloadStatusChangeListener;)Lcom/ss/android/downloadlib/addownload/o;
    .locals 3

    if-eqz p2, :cond_2

    .line 7
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->wv()Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "back_use_softref_listener"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 8
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->u:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 9
    :cond_0
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->wv()Lorg/json/JSONObject;

    move-result-object v0

    const-string v2, "use_weakref_listener"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    if-ne v0, v1, :cond_1

    .line 10
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->u:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 11
    :cond_1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->u:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-instance v1, Ljava/lang/ref/SoftReference;

    invoke-direct {v1, p2}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    :goto_0
    return-object p0
.end method

.method public vv(Landroid/content/Context;)Lcom/ss/android/downloadlib/addownload/o;
    .locals 1

    if-eqz p1, :cond_0

    .line 5
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->o:Ljava/lang/ref/WeakReference;

    .line 6
    :cond_0
    invoke-static {p1}, Lcom/ss/android/downloadlib/addownload/b;->m(Landroid/content/Context;)V

    return-object p0
.end method

.method public vv(Lcom/ss/android/download/api/download/DownloadController;)Lcom/ss/android/downloadlib/addownload/o;
    .locals 3

    .line 28
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/o;->d:Lcom/ss/android/download/api/download/DownloadController;

    .line 29
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/o;->q:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-static {p1}, Lcom/ss/android/downloadlib/n/o;->m(Lcom/ss/android/download/api/download/DownloadModel;)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object p1

    const-string v0, "force_auto_open"

    invoke-virtual {p1, v0}, Lcom/ss/android/socialbase/downloader/n/vv;->m(Ljava/lang/String;)I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 30
    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/o;->r()Lcom/ss/android/download/api/download/DownloadController;

    move-result-object p1

    invoke-interface {p1, v0}, Lcom/ss/android/download/api/download/DownloadController;->setLinkMode(I)V

    .line 31
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/n/vv;->p()Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object p1

    const-string v0, "fix_show_dialog"

    invoke-virtual {p1, v0}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 32
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/o;->q:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getExtra()Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string v0, "subprocess"

    .line 33
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p1

    if-lez p1, :cond_1

    .line 34
    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/o;->r()Lcom/ss/android/download/api/download/DownloadController;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/ss/android/download/api/download/DownloadController;->setEnableNewActivity(Z)V

    .line 35
    :cond_1
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/m/u;->vv()Lcom/ss/android/downloadlib/addownload/m/u;

    move-result-object p1

    iget-wide v0, p0, Lcom/ss/android/downloadlib/addownload/o;->t:J

    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/o;->r()Lcom/ss/android/download/api/download/DownloadController;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, Lcom/ss/android/downloadlib/addownload/m/u;->vv(JLcom/ss/android/download/api/download/DownloadController;)V

    return-object p0
.end method

.method public vv(Lcom/ss/android/download/api/download/DownloadEventConfig;)Lcom/ss/android/downloadlib/addownload/o;
    .locals 3

    .line 36
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/o;->j:Lcom/ss/android/download/api/download/DownloadEventConfig;

    .line 37
    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/o;->jh()Lcom/ss/android/download/api/download/DownloadEventConfig;

    move-result-object p1

    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadEventConfig;->getDownloadScene()I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/ss/android/downloadlib/addownload/o;->la:Z

    .line 38
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/m/u;->vv()Lcom/ss/android/downloadlib/addownload/m/u;

    move-result-object p1

    iget-wide v0, p0, Lcom/ss/android/downloadlib/addownload/o;->t:J

    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/o;->jh()Lcom/ss/android/download/api/download/DownloadEventConfig;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, Lcom/ss/android/downloadlib/addownload/m/u;->vv(JLcom/ss/android/download/api/download/DownloadEventConfig;)V

    return-object p0
.end method

.method public vv(Lcom/ss/android/download/api/download/DownloadModel;)Lcom/ss/android/downloadlib/addownload/o;
    .locals 5

    if-eqz p1, :cond_3

    .line 12
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->isAd()Z

    move-result v0

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_1

    .line 13
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getId()J

    move-result-wide v3

    cmp-long v0, v3, v1

    if-lez v0, :cond_0

    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getLogExtra()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 14
    :cond_0
    invoke-static {}, Lcom/ss/android/downloadlib/o/p;->vv()Lcom/ss/android/downloadlib/o/p;

    move-result-object v0

    const-string v1, "setDownloadModel ad error"

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadlib/o/p;->vv(Ljava/lang/String;)V

    goto :goto_0

    .line 15
    :cond_1
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getId()J

    move-result-wide v3

    cmp-long v0, v3, v1

    if-nez v0, :cond_2

    instance-of v0, p1, Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-eqz v0, :cond_2

    .line 16
    invoke-static {}, Lcom/ss/android/downloadlib/o/p;->vv()Lcom/ss/android/downloadlib/o/p;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "setDownloadModel id=0"

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/downloadlib/o/p;->vv(ZLjava/lang/String;)V

    .line 17
    invoke-static {}, Lcom/ss/android/socialbase/downloader/n/vv;->p()Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v0

    const-string v1, "fix_model_id"

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 18
    move-object v0, p1

    check-cast v0, Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getDownloadUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->setId(J)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 19
    :cond_2
    :goto_0
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/m/u;->vv()Lcom/ss/android/downloadlib/addownload/m/u;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ss/android/downloadlib/addownload/m/u;->vv(Lcom/ss/android/download/api/download/DownloadModel;)V

    .line 20
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getId()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ss/android/downloadlib/addownload/o;->t:J

    .line 21
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/o;->q:Lcom/ss/android/download/api/download/DownloadModel;

    .line 22
    invoke-static {p1}, Lcom/ss/android/downloadlib/addownload/wv;->vv(Lcom/ss/android/download/api/download/DownloadModel;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 23
    check-cast p1, Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    const-wide/16 v0, 0x3

    invoke-virtual {p1, v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->setExtraValue(J)V

    .line 24
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/m/u;->vv()Lcom/ss/android/downloadlib/addownload/m/u;

    move-result-object p1

    iget-wide v2, p0, Lcom/ss/android/downloadlib/addownload/o;->t:J

    invoke-virtual {p1, v2, v3}, Lcom/ss/android/downloadlib/addownload/m/u;->i(J)Lcom/ss/android/downloadad/api/vv/m;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 25
    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/vv/m;->jh()J

    move-result-wide v2

    cmp-long v4, v2, v0

    if-eqz v4, :cond_3

    .line 26
    invoke-virtual {p1, v0, v1}, Lcom/ss/android/downloadad/api/vv/m;->o(J)V

    .line 27
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/m/wv;->vv()Lcom/ss/android/downloadlib/addownload/m/wv;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ss/android/downloadlib/addownload/m/wv;->vv(Lcom/ss/android/downloadad/api/vv/m;)V

    :cond_3
    return-object p0
.end method

.method public vv()V
    .locals 5

    const/4 v0, 0x1

    .line 41
    iput-boolean v0, p0, Lcom/ss/android/downloadlib/addownload/o;->b:Z

    .line 42
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/m/u;->vv()Lcom/ss/android/downloadlib/addownload/m/u;

    move-result-object v1

    iget-wide v2, p0, Lcom/ss/android/downloadlib/addownload/o;->t:J

    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/o;->jh()Lcom/ss/android/download/api/download/DownloadEventConfig;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Lcom/ss/android/downloadlib/addownload/m/u;->vv(JLcom/ss/android/download/api/download/DownloadEventConfig;)V

    .line 43
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/m/u;->vv()Lcom/ss/android/downloadlib/addownload/m/u;

    move-result-object v1

    iget-wide v2, p0, Lcom/ss/android/downloadlib/addownload/o;->t:J

    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/o;->r()Lcom/ss/android/download/api/download/DownloadController;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Lcom/ss/android/downloadlib/addownload/m/u;->vv(JLcom/ss/android/download/api/download/DownloadController;)V

    .line 44
    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/o;->p:Lcom/ss/android/downloadlib/addownload/qv;

    iget-wide v2, p0, Lcom/ss/android/downloadlib/addownload/o;->t:J

    invoke-virtual {v1, v2, v3}, Lcom/ss/android/downloadlib/addownload/qv;->vv(J)V

    .line 45
    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/o;->j()V

    .line 46
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->wv()Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "enable_empty_listener"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v1

    if-ne v1, v0, :cond_0

    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->u:Ljava/util/Map;

    const/high16 v1, -0x80000000

    .line 47
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 48
    new-instance v0, Lcom/ss/android/download/api/config/vv;

    invoke-direct {v0}, Lcom/ss/android/download/api/config/vv;-><init>()V

    invoke-virtual {p0, v1, v0}, Lcom/ss/android/downloadlib/addownload/o;->vv(ILcom/ss/android/download/api/download/DownloadStatusChangeListener;)Lcom/ss/android/downloadlib/addownload/o;

    :cond_0
    return-void
.end method

.method public vv(Landroid/os/Message;)V
    .locals 3

    if-eqz p1, :cond_2

    .line 78
    iget-boolean v0, p0, Lcom/ss/android/downloadlib/addownload/o;->b:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 79
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 80
    :cond_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->qv:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 81
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->p:Lcom/ss/android/downloadlib/addownload/qv;

    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/o;->d()Lcom/ss/android/download/api/model/DownloadShortInfo;

    move-result-object v1

    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/o;->u:Ljava/util/Map;

    invoke-virtual {v0, p1, v1, v2}, Lcom/ss/android/downloadlib/addownload/qv;->vv(Landroid/os/Message;Lcom/ss/android/download/api/model/DownloadShortInfo;Ljava/util/Map;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public vv(Z)V
    .locals 2

    .line 65
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->qv:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    if-eqz v0, :cond_2

    if-eqz p1, :cond_1

    .line 66
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/i;->k()Lcom/ss/android/socialbase/appdownloader/i;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ss/android/socialbase/appdownloader/i;->m()Lcom/ss/android/socialbase/appdownloader/p/i;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 67
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->qv:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-interface {p1, v0}, Lcom/ss/android/socialbase/appdownloader/p/i;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 68
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->ky()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    move-result-object p1

    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->qv:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->cancel(IZ)V

    return-void

    .line 69
    :cond_1
    new-instance p1, Landroid/content/Intent;

    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/ss/android/socialbase/appdownloader/DownloadHandlerService;

    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v0, "android.ss.intent.action.DOWNLOAD_DELETE"

    .line 70
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 71
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->qv:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v0

    const-string v1, "extra_click_download_ids"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 72
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    :cond_2
    return-void
.end method

.method public vv(ZZ)V
    .locals 3

    if-eqz p1, :cond_0

    .line 82
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object p1

    iget-wide v0, p0, Lcom/ss/android/downloadlib/addownload/o;->t:J

    const/4 v2, 0x2

    invoke-virtual {p1, v0, v1, v2}, Lcom/ss/android/downloadlib/i/vv;->vv(JI)V

    .line 83
    :cond_0
    invoke-static {}, Lcom/ss/android/downloadlib/n/jh;->vv()Z

    move-result p1

    if-nez p1, :cond_1

    const-string p1, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 84
    invoke-static {p1}, Lcom/ss/android/downloadlib/n/k;->m(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 85
    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/o;->r()Lcom/ss/android/download/api/download/DownloadController;

    move-result-object p1

    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadController;->enableNewActivity()Z

    move-result p1

    if-nez p1, :cond_2

    .line 86
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/o;->q:Lcom/ss/android/download/api/download/DownloadModel;

    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->p:Lcom/ss/android/downloadlib/addownload/qv;

    invoke-virtual {v0}, Lcom/ss/android/downloadlib/addownload/qv;->m()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/ss/android/download/api/download/DownloadModel;->setFilePath(Ljava/lang/String;)Lcom/ss/android/download/api/download/DownloadModel;

    goto :goto_0

    :cond_1
    const-string p1, "android.permission.READ_MEDIA_IMAGES"

    .line 87
    invoke-static {p1}, Lcom/ss/android/downloadlib/n/k;->m(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_2

    const-string p1, "android.permission.READ_MEDIA_AUDIO"

    .line 88
    invoke-static {p1}, Lcom/ss/android/downloadlib/n/k;->m(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_2

    const-string p1, "android.permission.READ_MEDIA_VIDEO"

    .line 89
    invoke-static {p1}, Lcom/ss/android/downloadlib/n/k;->m(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 90
    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/o;->r()Lcom/ss/android/download/api/download/DownloadController;

    move-result-object p1

    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadController;->enableNewActivity()Z

    move-result p1

    if-nez p1, :cond_2

    .line 91
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/o;->q:Lcom/ss/android/download/api/download/DownloadModel;

    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->p:Lcom/ss/android/downloadlib/addownload/qv;

    invoke-virtual {v0}, Lcom/ss/android/downloadlib/addownload/qv;->m()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/ss/android/download/api/download/DownloadModel;->setFilePath(Ljava/lang/String;)Lcom/ss/android/download/api/download/DownloadModel;

    .line 92
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/o;->q:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-static {p1}, Lcom/ss/android/downloadlib/n/o;->p(Lcom/ss/android/download/api/download/DownloadModel;)I

    move-result p1

    if-nez p1, :cond_3

    .line 93
    sget-object p1, Lcom/ss/android/downloadlib/addownload/o;->vv:Ljava/lang/String;

    const/4 v0, 0x0

    const-string v1, "pBCD not start"

    invoke-static {p1, v1, v0}, Lcom/ss/android/downloadlib/n/b;->vv(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 94
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/o;->p:Lcom/ss/android/downloadlib/addownload/qv;

    new-instance v0, Lcom/ss/android/downloadlib/addownload/o$8;

    invoke-direct {v0, p0, p2}, Lcom/ss/android/downloadlib/addownload/o$8;-><init>(Lcom/ss/android/downloadlib/addownload/o;Z)V

    invoke-virtual {p1, v0}, Lcom/ss/android/downloadlib/addownload/qv;->vv(Lcom/ss/android/download/api/config/x;)V

    return-void

    .line 95
    :cond_3
    invoke-direct {p0, p2}, Lcom/ss/android/downloadlib/addownload/o;->n(Z)V

    return-void
.end method

.method public vv(I)Z
    .locals 4

    if-nez p1, :cond_0

    .line 49
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/o;->u:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->clear()V

    goto :goto_0

    .line 50
    :cond_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->u:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    :goto_0
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/o;->u:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_4

    .line 52
    iput-boolean v0, p0, Lcom/ss/android/downloadlib/addownload/o;->b:Z

    .line 53
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/ss/android/downloadlib/addownload/o;->jh:J

    .line 54
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/o;->qv:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    if-eqz p1, :cond_1

    .line 55
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    move-result-object p1

    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->qv:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->removeTaskMainListener(I)V

    .line 56
    :cond_1
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/o;->wv:Lcom/ss/android/downloadlib/addownload/o$p;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/os/AsyncTask;->getStatus()Landroid/os/AsyncTask$Status;

    move-result-object p1

    sget-object v0, Landroid/os/AsyncTask$Status;->FINISHED:Landroid/os/AsyncTask$Status;

    if-eq p1, v0, :cond_2

    .line 57
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/o;->wv:Lcom/ss/android/downloadlib/addownload/o$p;

    invoke-virtual {p1, v1}, Landroid/os/AsyncTask;->cancel(Z)Z

    .line 58
    :cond_2
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/o;->p:Lcom/ss/android/downloadlib/addownload/qv;

    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->qv:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p1, v0}, Lcom/ss/android/downloadlib/addownload/qv;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 59
    sget-object p1, Lcom/ss/android/downloadlib/addownload/o;->vv:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "onUnbind removeCallbacksAndMessages, downloadUrl:"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/o;->qv:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    if-nez v2, :cond_3

    const-string v2, ""

    goto :goto_1

    :cond_3
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getUrl()Ljava/lang/String;

    move-result-object v2

    :goto_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {p1, v0, v2}, Lcom/ss/android/downloadlib/n/b;->vv(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 60
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/o;->m:Lcom/ss/android/downloadlib/n/r;

    invoke-virtual {p1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 61
    iput-object v2, p0, Lcom/ss/android/downloadlib/addownload/o;->n:Lcom/ss/android/download/api/model/DownloadShortInfo;

    .line 62
    iput-object v2, p0, Lcom/ss/android/downloadlib/addownload/o;->qv:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    return v1

    .line 63
    :cond_4
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/o;->u:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result p1

    if-ne p1, v1, :cond_5

    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/o;->u:Ljava/util/Map;

    const/high16 v1, -0x80000000

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 64
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/o;->p:Lcom/ss/android/downloadlib/addownload/qv;

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/o;->qv:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p1, v1}, Lcom/ss/android/downloadlib/addownload/qv;->m(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    :cond_5
    return v0
.end method

.method public wv()Z
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o;->y:Ljava/lang/ref/SoftReference;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 3
    :cond_0
    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/o;->q:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ss/android/download/api/config/IDownloadButtonClickListener;

    invoke-static {v1, v0}, Lcom/ss/android/downloadlib/addownload/wv;->vv(Lcom/ss/android/download/api/download/DownloadModel;Lcom/ss/android/download/api/config/IDownloadButtonClickListener;)Z

    move-result v0

    return v0
.end method
