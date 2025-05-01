.class Lcom/ss/android/downloadlib/u/vv$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/downloadlib/guide/install/vv;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/u/vv;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/appdownloader/p/wv;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/ss/android/downloadlib/u/vv;

.field final synthetic vv:Lcom/ss/android/socialbase/appdownloader/p/wv;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/u/vv;Lcom/ss/android/socialbase/appdownloader/p/wv;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/u/vv$1;->m:Lcom/ss/android/downloadlib/u/vv;

    iput-object p2, p0, Lcom/ss/android/downloadlib/u/vv$1;->vv:Lcom/ss/android/socialbase/appdownloader/p/wv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public vv()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/u/vv$1;->vv:Lcom/ss/android/socialbase/appdownloader/p/wv;

    invoke-interface {v0}, Lcom/ss/android/socialbase/appdownloader/p/wv;->vv()V

    return-void
.end method
