.class Lcom/ss/android/socialbase/downloader/m/u$4;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/downloader/m/u;->vv(Landroid/util/SparseArray;Landroid/util/SparseArray;Lcom/ss/android/socialbase/downloader/m/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic i:Lcom/ss/android/socialbase/downloader/m/u;

.field final synthetic m:Landroid/util/SparseArray;

.field final synthetic p:Lcom/ss/android/socialbase/downloader/m/i;

.field final synthetic vv:Landroid/util/SparseArray;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/m/u;Landroid/util/SparseArray;Landroid/util/SparseArray;Lcom/ss/android/socialbase/downloader/m/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/m/u$4;->i:Lcom/ss/android/socialbase/downloader/m/u;

    iput-object p2, p0, Lcom/ss/android/socialbase/downloader/m/u$4;->vv:Landroid/util/SparseArray;

    iput-object p3, p0, Lcom/ss/android/socialbase/downloader/m/u$4;->m:Landroid/util/SparseArray;

    iput-object p4, p0, Lcom/ss/android/socialbase/downloader/m/u$4;->p:Lcom/ss/android/socialbase/downloader/m/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u$4;->i:Lcom/ss/android/socialbase/downloader/m/u;

    new-instance v1, Lcom/ss/android/socialbase/downloader/m/u$4$1;

    invoke-direct {v1, p0}, Lcom/ss/android/socialbase/downloader/m/u$4$1;-><init>(Lcom/ss/android/socialbase/downloader/m/u$4;)V

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/m/u;->vv(Lcom/ss/android/socialbase/downloader/m/m;)V

    const/4 v0, 0x1

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/m/u$4;->i:Lcom/ss/android/socialbase/downloader/m/u;

    invoke-static {v1}, Lcom/ss/android/socialbase/downloader/m/u;->i(Lcom/ss/android/socialbase/downloader/m/u;)Ljava/util/concurrent/CountDownLatch;

    move-result-object v1

    const-wide/16 v2, 0x1388

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v2, v3, v4}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    xor-int/2addr v1, v0

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 3
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_0

    .line 4
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/m/u$4;->i:Lcom/ss/android/socialbase/downloader/m/u;

    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/m/u;->qv(Lcom/ss/android/socialbase/downloader/m/u;)Ljava/util/concurrent/Future;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 5
    invoke-interface {v2, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u$4;->i:Lcom/ss/android/socialbase/downloader/m/u;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/m/u;->vv()V

    if-eqz v1, :cond_1

    .line 7
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u$4;->p:Lcom/ss/android/socialbase/downloader/m/i;

    if-eqz v0, :cond_1

    .line 8
    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/m/i;->vv()V

    :cond_1
    return-void
.end method
