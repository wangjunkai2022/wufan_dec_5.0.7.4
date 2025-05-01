.class public Lcom/ss/android/downloadlib/addownload/i/o;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/downloadlib/addownload/i/n;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public vv(Lcom/ss/android/downloadad/api/vv/m;ILcom/ss/android/downloadlib/addownload/i/qv;Lcom/ss/android/downloadlib/addownload/vv/p;)Z
    .locals 7

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 1
    :cond_0
    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/vv/m;->fn()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/downloadlib/qv;->vv(Landroid/content/Context;)Lcom/ss/android/downloadlib/qv;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/vv/m;->fn()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lcom/ss/android/downloadlib/qv;->vv(Ljava/lang/String;Ljava/lang/String;Z)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v0

    goto :goto_0

    .line 3
    :cond_1
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/downloadlib/qv;->vv(Landroid/content/Context;)Lcom/ss/android/downloadlib/qv;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/vv/m;->vv()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadlib/qv;->m(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v0

    :goto_0
    move-object v2, v0

    const/4 v5, 0x1

    move-object v1, p1

    move v3, p2

    move-object v4, p3

    move-object v6, p4

    .line 4
    invoke-static/range {v1 .. v6}, Lcom/ss/android/downloadlib/addownload/r;->vv(Lcom/ss/android/downloadad/api/vv/m;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;ILcom/ss/android/downloadlib/addownload/i/qv;ZLcom/ss/android/downloadlib/addownload/vv/p;)Z

    move-result p1

    return p1
.end method
