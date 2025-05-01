.class Lcom/ss/android/socialbase/downloader/impls/i$1$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/downloader/impls/i$1;->vv(Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic vv:Lcom/ss/android/socialbase/downloader/impls/i$1;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/impls/i$1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/impls/i$1$1;->vv:Lcom/ss/android/socialbase/downloader/impls/i$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i$1$1;->vv:Lcom/ss/android/socialbase/downloader/impls/i$1;

    iget-object v0, v0, Lcom/ss/android/socialbase/downloader/impls/i$1;->vv:Lcom/ss/android/socialbase/downloader/impls/i;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/impls/i;->wv()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    return-void
.end method
