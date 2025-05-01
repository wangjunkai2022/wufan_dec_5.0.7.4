.class public Lcom/ss/android/socialbase/downloader/vv/vv;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ss/android/socialbase/downloader/vv/vv$vv;,
        Lcom/ss/android/socialbase/downloader/vv/vv$p;,
        Lcom/ss/android/socialbase/downloader/vv/vv$m;
    }
.end annotation


# instance fields
.field private i:I

.field private m:Lcom/ss/android/socialbase/downloader/vv/vv$p;

.field private volatile n:Z

.field private o:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private final p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/vv/vv$vv;",
            ">;"
        }
    .end annotation
.end field

.field private final qv:Landroid/app/Application$ActivityLifecycleCallbacks;

.field private volatile u:I

.field private vv:Landroid/app/Application;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/vv/vv;->p:Ljava/util/List;

    const/4 v0, -0x1

    .line 4
    iput v0, p0, Lcom/ss/android/socialbase/downloader/vv/vv;->u:I

    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/vv/vv;->n:Z

    .line 6
    new-instance v0, Lcom/ss/android/socialbase/downloader/vv/vv$1;

    invoke-direct {v0, p0}, Lcom/ss/android/socialbase/downloader/vv/vv$1;-><init>(Lcom/ss/android/socialbase/downloader/vv/vv;)V

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/vv/vv;->qv:Landroid/app/Application$ActivityLifecycleCallbacks;

    return-void
.end method

.method synthetic constructor <init>(Lcom/ss/android/socialbase/downloader/vv/vv$1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/vv/vv;-><init>()V

    return-void
.end method

.method private i()[Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/vv/vv;->p:Ljava/util/List;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/vv/vv;->p:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 3
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/vv/vv;->p:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 4
    :goto_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method static synthetic m(Lcom/ss/android/socialbase/downloader/vv/vv;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/vv/vv;->o()V

    return-void
.end method

.method private n()Z
    .locals 3

    const/4 v0, 0x0

    .line 1
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/vv/vv;->vv:Landroid/app/Application;

    if-nez v1, :cond_0

    return v0

    :cond_0
    const-string v2, "activity"

    .line 2
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 3
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    .line 4
    invoke-static {v1}, Lcom/ss/android/socialbase/downloader/wv/u;->i(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v0

    :catchall_0
    move-exception v1

    .line 5
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    return v0
.end method

.method private o()V
    .locals 4

    const/4 v0, 0x1

    .line 1
    iput v0, p0, Lcom/ss/android/socialbase/downloader/vv/vv;->u:I

    .line 2
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/vv/vv;->i()[Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 4
    check-cast v3, Lcom/ss/android/socialbase/downloader/vv/vv$vv;

    invoke-interface {v3}, Lcom/ss/android/socialbase/downloader/vv/vv$vv;->m()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method static synthetic p(Lcom/ss/android/socialbase/downloader/vv/vv;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/vv/vv;->u()V

    return-void
.end method

.method private u()V
    .locals 4

    const/4 v0, 0x0

    .line 1
    iput v0, p0, Lcom/ss/android/socialbase/downloader/vv/vv;->u:I

    .line 2
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/vv/vv;->i()[Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 3
    array-length v2, v1

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, v1, v0

    .line 4
    check-cast v3, Lcom/ss/android/socialbase/downloader/vv/vv$vv;

    invoke-interface {v3}, Lcom/ss/android/socialbase/downloader/vv/vv$vv;->p()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method static synthetic vv(Lcom/ss/android/socialbase/downloader/vv/vv;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/ss/android/socialbase/downloader/vv/vv;->i:I

    return p0
.end method

.method static synthetic vv(Lcom/ss/android/socialbase/downloader/vv/vv;I)I
    .locals 0

    .line 2
    iput p1, p0, Lcom/ss/android/socialbase/downloader/vv/vv;->i:I

    return p1
.end method

.method public static vv()Lcom/ss/android/socialbase/downloader/vv/vv;
    .locals 1

    .line 5
    invoke-static {}, Lcom/ss/android/socialbase/downloader/vv/vv$m;->vv()Lcom/ss/android/socialbase/downloader/vv/vv;

    move-result-object v0

    return-object v0
.end method

.method static synthetic vv(Lcom/ss/android/socialbase/downloader/vv/vv;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/vv/vv;->o:Ljava/lang/ref/WeakReference;

    return-object p1
.end method

.method static synthetic vv(Lcom/ss/android/socialbase/downloader/vv/vv;Z)Z
    .locals 0

    .line 4
    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/vv/vv;->n:Z

    return p1
.end method


# virtual methods
.method public m(Lcom/ss/android/socialbase/downloader/vv/vv$vv;)V
    .locals 2

    .line 5
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/vv/vv;->p:Ljava/util/List;

    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/vv/vv;->p:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 7
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public m()Z
    .locals 2

    .line 2
    iget v0, p0, Lcom/ss/android/socialbase/downloader/vv/vv;->u:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 3
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/vv/vv;->n()Z

    move-result v0

    .line 4
    iput v0, p0, Lcom/ss/android/socialbase/downloader/vv/vv;->u:I

    :cond_0
    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public p()Z
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/vv/vv;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/vv/vv;->n:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public vv(Landroid/content/Context;)V
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/vv/vv;->vv:Landroid/app/Application;

    if-nez v0, :cond_1

    .line 7
    instance-of v0, p1, Landroid/app/Application;

    if-eqz v0, :cond_1

    .line 8
    monitor-enter p0

    .line 9
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/vv/vv;->vv:Landroid/app/Application;

    if-nez v0, :cond_0

    .line 10
    check-cast p1, Landroid/app/Application;

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/vv/vv;->vv:Landroid/app/Application;

    .line 11
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/vv/vv;->qv:Landroid/app/Application$ActivityLifecycleCallbacks;

    invoke-virtual {p1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 12
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    return-void
.end method

.method public vv(Lcom/ss/android/socialbase/downloader/vv/vv$p;)V
    .locals 0

    .line 13
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/vv/vv;->m:Lcom/ss/android/socialbase/downloader/vv/vv$p;

    return-void
.end method

.method public vv(Lcom/ss/android/socialbase/downloader/vv/vv$vv;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/vv/vv;->p:Ljava/util/List;

    monitor-enter v0

    .line 15
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/vv/vv;->p:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 16
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/vv/vv;->p:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
