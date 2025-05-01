.class Lcom/ss/android/socialbase/downloader/downloader/o$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/downloader/downloader/o;->n()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic vv:Lcom/ss/android/socialbase/downloader/downloader/o;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/downloader/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/o$1;->vv:Lcom/ss/android/socialbase/downloader/downloader/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/o$1;->vv:Lcom/ss/android/socialbase/downloader/downloader/o;

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/o;->vv(Lcom/ss/android/socialbase/downloader/downloader/o;)Lcom/ss/android/socialbase/downloader/network/wv;

    move-result-object v0

    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/network/wv;->i()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method
