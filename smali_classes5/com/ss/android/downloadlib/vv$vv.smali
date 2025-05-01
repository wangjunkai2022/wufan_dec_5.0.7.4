.class Lcom/ss/android/downloadlib/vv$vv;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation build Landroidx/annotation/WorkerThread;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ss/android/downloadlib/vv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "vv"
.end annotation


# instance fields
.field private final m:I

.field final synthetic vv:Lcom/ss/android/downloadlib/vv;


# direct methods
.method public constructor <init>(Lcom/ss/android/downloadlib/vv;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/vv$vv;->vv:Lcom/ss/android/downloadlib/vv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p2, p0, Lcom/ss/android/downloadlib/vv$vv;->m:I

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    :try_start_0
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/m/u;->vv()Lcom/ss/android/downloadlib/addownload/m/u;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ss/android/downloadlib/addownload/m/u;->m()V

    .line 2
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/m/u;->vv()Lcom/ss/android/downloadlib/addownload/m/u;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ss/android/downloadlib/addownload/m/u;->p()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 4
    iget-object v1, p0, Lcom/ss/android/downloadlib/vv$vv;->vv:Lcom/ss/android/downloadlib/vv;

    iget v2, p0, Lcom/ss/android/downloadlib/vv$vv;->m:I

    invoke-static {v1, v0, v2}, Lcom/ss/android/downloadlib/vv;->vv(Lcom/ss/android/downloadlib/vv;Ljava/util/concurrent/ConcurrentHashMap;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    return-void
.end method
