.class Lcom/ss/android/socialbase/downloader/downloader/u$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/socialbase/downloader/depend/pj;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/downloader/downloader/u;->u()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic vv:Lcom/ss/android/socialbase/downloader/downloader/u;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/downloader/u;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/u$2;->vv:Lcom/ss/android/socialbase/downloader/downloader/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public vv()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/u$2;->vv:Lcom/ss/android/socialbase/downloader/downloader/u;

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/u;->p(Lcom/ss/android/socialbase/downloader/downloader/u;)V

    return-void
.end method

.method public vv(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V
    .locals 3

    .line 2
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/u;->wv()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "saveFileAsTargetName onFailed : "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;->getErrorMessage()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    const-string v2, ""

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/p/vv;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/u$2;->vv:Lcom/ss/android/socialbase/downloader/downloader/u;

    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/u;->vv(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    return-void
.end method
