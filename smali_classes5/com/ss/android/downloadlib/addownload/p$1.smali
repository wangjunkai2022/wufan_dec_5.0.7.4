.class Lcom/ss/android/downloadlib/addownload/p$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/downloadlib/m/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/addownload/p;->vv(Lcom/ss/android/downloadlib/addownload/o;ILcom/ss/android/download/api/download/DownloadModel;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic i:Lcom/ss/android/downloadlib/addownload/p;

.field final synthetic m:I

.field final synthetic p:Lcom/ss/android/download/api/download/DownloadModel;

.field final synthetic vv:Lcom/ss/android/downloadlib/addownload/o;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/addownload/p;Lcom/ss/android/downloadlib/addownload/o;ILcom/ss/android/download/api/download/DownloadModel;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/p$1;->i:Lcom/ss/android/downloadlib/addownload/p;

    iput-object p2, p0, Lcom/ss/android/downloadlib/addownload/p$1;->vv:Lcom/ss/android/downloadlib/addownload/o;

    iput p3, p0, Lcom/ss/android/downloadlib/addownload/p$1;->m:I

    iput-object p4, p0, Lcom/ss/android/downloadlib/addownload/p$1;->p:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public vv(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/p$1;->i:Lcom/ss/android/downloadlib/addownload/p;

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/p$1;->vv:Lcom/ss/android/downloadlib/addownload/o;

    iget v2, p0, Lcom/ss/android/downloadlib/addownload/p$1;->m:I

    iget-object v3, p0, Lcom/ss/android/downloadlib/addownload/p$1;->p:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-virtual {v0, v1, p1, v2, v3}, Lcom/ss/android/downloadlib/addownload/p;->vv(Lcom/ss/android/downloadlib/addownload/o;ZILcom/ss/android/download/api/download/DownloadModel;)V

    return-void
.end method
