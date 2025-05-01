.class Lcom/ss/android/socialbase/downloader/m/u$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ss/android/socialbase/downloader/m/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic vv:Lcom/ss/android/socialbase/downloader/m/u;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/m/u;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/m/u$1;->vv:Lcom/ss/android/socialbase/downloader/m/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ss/android/socialbase/downloader/m/u;->u()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u$1;->vv:Lcom/ss/android/socialbase/downloader/m/u;

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/m/u;->vv(Lcom/ss/android/socialbase/downloader/m/u;)Lcom/ss/android/socialbase/downloader/downloader/p$vv$vv;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u$1;->vv:Lcom/ss/android/socialbase/downloader/m/u;

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/m/u;->vv(Lcom/ss/android/socialbase/downloader/m/u;)Lcom/ss/android/socialbase/downloader/downloader/p$vv$vv;

    move-result-object v0

    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/downloader/p$vv$vv;->vv()V

    :cond_0
    return-void
.end method
