.class Lcom/ss/android/socialbase/downloader/m/u$2$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/downloader/m/u$2;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic vv:Lcom/ss/android/socialbase/downloader/m/u$2;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/m/u$2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/m/u$2$1;->vv:Lcom/ss/android/socialbase/downloader/m/u$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public binderDied()V
    .locals 4

    const/4 v0, 0x0

    .line 1
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/m/u;->vv(Z)Z

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u$2$1;->vv:Lcom/ss/android/socialbase/downloader/m/u$2;

    iget-object v0, v0, Lcom/ss/android/socialbase/downloader/m/u$2;->m:Lcom/ss/android/socialbase/downloader/m/u;

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/m/u;->o(Lcom/ss/android/socialbase/downloader/m/u;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u$2$1;->vv:Lcom/ss/android/socialbase/downloader/m/u$2;

    iget-object v0, v0, Lcom/ss/android/socialbase/downloader/m/u$2;->m:Lcom/ss/android/socialbase/downloader/m/u;

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/m/u;->vv(Lcom/ss/android/socialbase/downloader/m/u;)Lcom/ss/android/socialbase/downloader/downloader/p$vv$vv;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u$2$1;->vv:Lcom/ss/android/socialbase/downloader/m/u$2;

    iget-object v0, v0, Lcom/ss/android/socialbase/downloader/m/u$2;->m:Lcom/ss/android/socialbase/downloader/m/u;

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/m/u;->n(Lcom/ss/android/socialbase/downloader/m/u;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/m/u$2$1;->vv:Lcom/ss/android/socialbase/downloader/m/u$2;

    iget-object v1, v1, Lcom/ss/android/socialbase/downloader/m/u$2;->m:Lcom/ss/android/socialbase/downloader/m/u;

    invoke-static {v1}, Lcom/ss/android/socialbase/downloader/m/u;->u(Lcom/ss/android/socialbase/downloader/m/u;)Ljava/lang/Runnable;

    move-result-object v1

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method
