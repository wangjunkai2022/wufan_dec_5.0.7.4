.class public Lcom/ss/android/downloadlib/addownload/i/vv;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/downloadlib/addownload/i/wv;


# static fields
.field private static vv:Lcom/ss/android/downloadlib/addownload/vv/i;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private vv(I)I
    .locals 2

    .line 16
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(I)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object p1

    const-string v0, "pause_optimise_apk_size"

    const/16 v1, 0x64

    invoke-virtual {p1, v0, v1}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result p1

    mul-int/lit16 p1, p1, 0x400

    mul-int/lit16 p1, p1, 0x400

    return p1
.end method

.method public static vv()Lcom/ss/android/downloadlib/addownload/vv/i;
    .locals 1

    .line 2
    sget-object v0, Lcom/ss/android/downloadlib/addownload/i/vv;->vv:Lcom/ss/android/downloadlib/addownload/vv/i;

    return-object v0
.end method

.method static synthetic vv(Lcom/ss/android/downloadlib/addownload/vv/i;)Lcom/ss/android/downloadlib/addownload/vv/i;
    .locals 0

    .line 1
    sput-object p0, Lcom/ss/android/downloadlib/addownload/i/vv;->vv:Lcom/ss/android/downloadlib/addownload/vv/i;

    return-object p0
.end method

.method private vv(Lcom/ss/android/downloadad/api/vv/vv;)Z
    .locals 3

    .line 17
    invoke-static {p1}, Lcom/ss/android/downloadlib/n/o;->vv(Lcom/ss/android/downloadad/api/vv/vv;)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v0

    const-string v1, "pause_optimise_apk_size_switch"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 18
    invoke-interface {p1}, Lcom/ss/android/downloadad/api/vv/vv;->d()Z

    move-result p1

    if-eqz p1, :cond_0

    return v1

    :cond_0
    return v2
.end method


# virtual methods
.method public vv(Lcom/ss/android/downloadad/api/vv/m;ILcom/ss/android/downloadlib/addownload/i/qv;)Z
    .locals 8

    const/4 p2, 0x0

    if-nez p1, :cond_0

    return p2

    .line 3
    :cond_0
    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/vv/m;->qd()Z

    move-result v0

    if-eqz v0, :cond_1

    return p2

    .line 4
    :cond_1
    invoke-direct {p0, p1}, Lcom/ss/android/downloadlib/addownload/i/vv;->vv(Lcom/ss/android/downloadad/api/vv/vv;)Z

    move-result v0

    if-nez v0, :cond_2

    return p2

    .line 5
    :cond_2
    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/vv/m;->fn()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_3

    .line 6
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/downloadlib/qv;->vv(Landroid/content/Context;)Lcom/ss/android/downloadlib/qv;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/vv/m;->fn()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3, v1}, Lcom/ss/android/downloadlib/qv;->vv(Ljava/lang/String;Ljava/lang/String;Z)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v0

    goto :goto_0

    .line 7
    :cond_3
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/downloadlib/qv;->vv(Landroid/content/Context;)Lcom/ss/android/downloadlib/qv;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/vv/m;->vv()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/ss/android/downloadlib/qv;->m(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_4

    return p2

    .line 8
    :cond_4
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v2

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v3

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v5

    invoke-static {v2, v3, v4, v5, v6}, Lcom/ss/android/downloadlib/addownload/k;->vv(IJJ)J

    move-result-wide v2

    .line 9
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v0, v2, v6

    if-lez v0, :cond_5

    cmp-long v0, v4, v6

    if-lez v0, :cond_5

    .line 10
    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/vv/m;->la()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/ss/android/downloadlib/addownload/i/vv;->vv(I)I

    move-result v0

    int-to-long v6, v0

    cmp-long v0, v4, v6

    if-gtz v0, :cond_5

    .line 11
    new-instance v0, Lcom/ss/android/downloadlib/addownload/i/vv$1;

    invoke-direct {v0, p0, p1, p3}, Lcom/ss/android/downloadlib/addownload/i/vv$1;-><init>(Lcom/ss/android/downloadlib/addownload/i/vv;Lcom/ss/android/downloadad/api/vv/m;Lcom/ss/android/downloadlib/addownload/i/qv;)V

    sput-object v0, Lcom/ss/android/downloadlib/addownload/i/vv;->vv:Lcom/ss/android/downloadlib/addownload/vv/i;

    sub-long/2addr v4, v2

    .line 12
    invoke-static {v4, v5}, Lcom/ss/android/downloadlib/n/jh;->vv(J)Ljava/lang/String;

    move-result-object p3

    new-array v0, v1, [Ljava/lang/Object;

    aput-object p3, v0, p2

    const-string p2, "\u8be5\u4e0b\u8f7d\u4efb\u52a1\u4ec5\u9700%s\uff0c\u5373\u5c06\u4e0b\u8f7d\u5b8c\u6210\uff0c\u662f\u5426\u7ee7\u7eed\u4e0b\u8f7d\uff1f"

    .line 13
    invoke-static {p2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "\u7ee7\u7eed"

    const-string v0, "\u6682\u505c"

    .line 14
    invoke-static {p1, p2, p3, v0}, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->vv(Lcom/ss/android/downloadad/api/vv/vv;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    invoke-virtual {p1, v1}, Lcom/ss/android/downloadad/api/vv/m;->t(Z)V

    return v1

    :cond_5
    return p2
.end method
