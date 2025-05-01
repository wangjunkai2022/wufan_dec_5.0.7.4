.class Lcom/ss/android/downloadlib/addownload/o$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/downloadlib/addownload/o$vv;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/addownload/o;->u(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:I

.field final synthetic p:Lcom/ss/android/downloadlib/addownload/o;

.field final synthetic vv:I


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/addownload/o;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/o$3;->p:Lcom/ss/android/downloadlib/addownload/o;

    iput p2, p0, Lcom/ss/android/downloadlib/addownload/o$3;->vv:I

    iput p3, p0, Lcom/ss/android/downloadlib/addownload/o$3;->m:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public vv()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o$3;->p:Lcom/ss/android/downloadlib/addownload/o;

    invoke-static {v0}, Lcom/ss/android/downloadlib/addownload/o;->u(Lcom/ss/android/downloadlib/addownload/o;)Lcom/ss/android/downloadlib/addownload/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ss/android/downloadlib/addownload/i;->vv()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o$3;->p:Lcom/ss/android/downloadlib/addownload/o;

    iget v1, p0, Lcom/ss/android/downloadlib/addownload/o$3;->vv:I

    iget v2, p0, Lcom/ss/android/downloadlib/addownload/o$3;->m:I

    invoke-static {v0}, Lcom/ss/android/downloadlib/addownload/o;->n(Lcom/ss/android/downloadlib/addownload/o;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lcom/ss/android/downloadlib/addownload/o;->vv(Lcom/ss/android/downloadlib/addownload/o;IILcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    return-void
.end method
