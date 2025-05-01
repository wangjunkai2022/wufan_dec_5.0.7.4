.class Lcom/ss/android/downloadlib/addownload/m$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/addownload/m;->vv(Landroid/content/Context;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/ss/android/downloadlib/addownload/m;

.field final synthetic vv:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/addownload/m;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/m$1;->m:Lcom/ss/android/downloadlib/addownload/m;

    iput-object p2, p0, Lcom/ss/android/downloadlib/addownload/m$1;->vv:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 1
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->p()Lcom/ss/android/download/api/config/jh;

    move-result-object v0

    .line 2
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    move-result-object v2

    const/4 v1, 0x3

    const/4 v3, 0x0

    const-string v4, "\u4e0b\u8f7d\u5931\u8d25\uff0c\u8bf7\u91cd\u8bd5\uff01"

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 3
    invoke-interface/range {v0 .. v6}, Lcom/ss/android/download/api/config/jh;->vv(ILandroid/content/Context;Lcom/ss/android/download/api/download/DownloadModel;Ljava/lang/String;Landroid/graphics/drawable/Drawable;I)V

    .line 4
    invoke-static {}, Lcom/ss/android/downloadlib/n;->vv()Lcom/ss/android/downloadlib/n;

    move-result-object v0

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/m$1;->vv:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadlib/n;->vv(Ljava/lang/String;)Lcom/ss/android/downloadlib/addownload/o;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {v0}, Lcom/ss/android/downloadlib/addownload/o;->n()V

    :cond_0
    return-void
.end method
