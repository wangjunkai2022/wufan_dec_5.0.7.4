.class Lcom/ss/android/downloadlib/addownload/m/u$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/addownload/m/u;->m()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic vv:Lcom/ss/android/downloadlib/addownload/m/u;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/addownload/m/u;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/m/u$1;->vv:Lcom/ss/android/downloadlib/addownload/m/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/m/u$1;->vv:Lcom/ss/android/downloadlib/addownload/m/u;

    invoke-static {v0}, Lcom/ss/android/downloadlib/addownload/m/u;->vv(Lcom/ss/android/downloadlib/addownload/m/u;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/ss/android/downloadlib/addownload/m/u;

    monitor-enter v0

    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/m/u$1;->vv:Lcom/ss/android/downloadlib/addownload/m/u;

    invoke-static {v1}, Lcom/ss/android/downloadlib/addownload/m/u;->vv(Lcom/ss/android/downloadlib/addownload/m/u;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 4
    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/m/u$1;->vv:Lcom/ss/android/downloadlib/addownload/m/u;

    invoke-static {v1}, Lcom/ss/android/downloadlib/addownload/m/u;->m(Lcom/ss/android/downloadlib/addownload/m/u;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v1

    invoke-static {}, Lcom/ss/android/downloadlib/addownload/m/wv;->vv()Lcom/ss/android/downloadlib/addownload/m/wv;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ss/android/downloadlib/addownload/m/wv;->m()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    .line 5
    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/m/u$1;->vv:Lcom/ss/android/downloadlib/addownload/m/u;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lcom/ss/android/downloadlib/addownload/m/u;->vv(Lcom/ss/android/downloadlib/addownload/m/u;Z)Z

    .line 6
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    return-void
.end method
