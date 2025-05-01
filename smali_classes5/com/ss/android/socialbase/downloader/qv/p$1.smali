.class Lcom/ss/android/socialbase/downloader/qv/p$1;
.super Lcom/ss/android/socialbase/downloader/depend/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/downloader/qv/p;->vv(Lcom/ss/android/socialbase/downloader/exception/BaseException;J)Lcom/ss/android/socialbase/downloader/exception/qv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic vv:Lcom/ss/android/socialbase/downloader/qv/p;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/qv/p;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/qv/p$1;->vv:Lcom/ss/android/socialbase/downloader/qv/p;

    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/depend/m;-><init>()V

    return-void
.end method


# virtual methods
.method public vv(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-super {p0, p1}, Lcom/ss/android/socialbase/downloader/depend/m;->vv(Ljava/util/List;)V

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p$1;->vv:Lcom/ss/android/socialbase/downloader/qv/p;

    invoke-static {v0, p1}, Lcom/ss/android/socialbase/downloader/qv/p;->vv(Lcom/ss/android/socialbase/downloader/qv/p;Ljava/util/List;)V

    return-void
.end method
