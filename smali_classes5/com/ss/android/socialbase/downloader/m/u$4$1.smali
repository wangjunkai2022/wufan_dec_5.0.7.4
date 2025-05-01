.class Lcom/ss/android/socialbase/downloader/m/u$4$1;
.super Lcom/ss/android/socialbase/downloader/m/m$vv;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/downloader/m/u$4;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic vv:Lcom/ss/android/socialbase/downloader/m/u$4;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/m/u$4;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/m/u$4$1;->vv:Lcom/ss/android/socialbase/downloader/m/u$4;

    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/m/m$vv;-><init>()V

    return-void
.end method


# virtual methods
.method public vv(Ljava/util/Map;Ljava/util/Map;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u$4$1;->vv:Lcom/ss/android/socialbase/downloader/m/u$4;

    iget-object v0, v0, Lcom/ss/android/socialbase/downloader/m/u$4;->vv:Landroid/util/SparseArray;

    invoke-static {v0, p1}, Lcom/ss/android/socialbase/downloader/wv/u;->vv(Landroid/util/SparseArray;Ljava/util/Map;)V

    .line 2
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/m/u$4$1;->vv:Lcom/ss/android/socialbase/downloader/m/u$4;

    iget-object p1, p1, Lcom/ss/android/socialbase/downloader/m/u$4;->m:Landroid/util/SparseArray;

    invoke-static {p1, p2}, Lcom/ss/android/socialbase/downloader/wv/u;->vv(Landroid/util/SparseArray;Ljava/util/Map;)V

    .line 3
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/m/u$4$1;->vv:Lcom/ss/android/socialbase/downloader/m/u$4;

    iget-object p1, p1, Lcom/ss/android/socialbase/downloader/m/u$4;->p:Lcom/ss/android/socialbase/downloader/m/i;

    invoke-interface {p1}, Lcom/ss/android/socialbase/downloader/m/i;->vv()V

    .line 4
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/m/u$4$1;->vv:Lcom/ss/android/socialbase/downloader/m/u$4;

    iget-object p1, p1, Lcom/ss/android/socialbase/downloader/m/u$4;->i:Lcom/ss/android/socialbase/downloader/m/u;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/downloader/m/u;->vv(Lcom/ss/android/socialbase/downloader/m/m;)V

    return-void
.end method
