.class public Lcom/ss/android/downloadlib/addownload/i/p;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/downloadlib/addownload/i/n;


# static fields
.field private static m:Lcom/ss/android/downloadlib/addownload/vv/p;

.field private static vv:Lcom/ss/android/downloadlib/addownload/vv/i;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static m()Lcom/ss/android/downloadlib/addownload/vv/p;
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/downloadlib/addownload/i/p;->m:Lcom/ss/android/downloadlib/addownload/vv/p;

    return-object v0
.end method

.method private vv(I)I
    .locals 2

    .line 21
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(I)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object p1

    const-string v0, "cancel_pause_optimise_download_percent_value"

    const/16 v1, 0x32

    invoke-virtual {p1, v0, v1}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method public static vv()Lcom/ss/android/downloadlib/addownload/vv/i;
    .locals 1

    .line 3
    sget-object v0, Lcom/ss/android/downloadlib/addownload/i/p;->vv:Lcom/ss/android/downloadlib/addownload/vv/i;

    return-object v0
.end method

.method static synthetic vv(Lcom/ss/android/downloadlib/addownload/vv/i;)Lcom/ss/android/downloadlib/addownload/vv/i;
    .locals 0

    .line 1
    sput-object p0, Lcom/ss/android/downloadlib/addownload/i/p;->vv:Lcom/ss/android/downloadlib/addownload/vv/i;

    return-object p0
.end method

.method private vv(IIILcom/ss/android/downloadad/api/vv/m;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 24
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "pause_optimise_type"

    .line 25
    invoke-virtual {v0, v1, p5}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p5, "pause_optimise_action"

    .line 26
    invoke-virtual {v0, p5, p6}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p5, "download_percent"

    .line 27
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p5, p1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "download_current_bytes"

    .line 28
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "download_total_bytes"

    .line 29
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 30
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    .line 31
    :goto_0
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object p1

    const-string p2, "pause_cancel_optimise"

    invoke-virtual {p1, p2, v0, p4}, Lcom/ss/android/downloadlib/i/vv;->vv(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)V

    return-void
.end method

.method static synthetic vv(Lcom/ss/android/downloadlib/addownload/i/p;IIILcom/ss/android/downloadad/api/vv/m;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct/range {p0 .. p6}, Lcom/ss/android/downloadlib/addownload/i/p;->vv(IIILcom/ss/android/downloadad/api/vv/m;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static vv(Lcom/ss/android/downloadlib/addownload/vv/p;)V
    .locals 0

    .line 4
    sput-object p0, Lcom/ss/android/downloadlib/addownload/i/p;->m:Lcom/ss/android/downloadlib/addownload/vv/p;

    return-void
.end method

.method private vv(Lcom/ss/android/downloadad/api/vv/vv;)Z
    .locals 3

    .line 22
    invoke-static {p1}, Lcom/ss/android/downloadlib/n/o;->vv(Lcom/ss/android/downloadad/api/vv/vv;)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v0

    const-string v1, "cancel_pause_optimise_download_percent_retain_switch"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 23
    invoke-interface {p1}, Lcom/ss/android/downloadad/api/vv/vv;->d()Z

    move-result p1

    if-eqz p1, :cond_0

    return v1

    :cond_0
    return v2
.end method


# virtual methods
.method public vv(Lcom/ss/android/downloadad/api/vv/m;ILcom/ss/android/downloadlib/addownload/i/qv;Lcom/ss/android/downloadlib/addownload/vv/p;)Z
    .locals 18

    move-object/from16 v7, p1

    const/4 v8, 0x0

    if-nez v7, :cond_0

    return v8

    .line 5
    :cond_0
    invoke-direct/range {p0 .. p1}, Lcom/ss/android/downloadlib/addownload/i/p;->vv(Lcom/ss/android/downloadad/api/vv/vv;)Z

    move-result v0

    if-nez v0, :cond_1

    return v8

    .line 6
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/downloadad/api/vv/m;->fn()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v9, 0x1

    if-nez v0, :cond_2

    .line 7
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/downloadlib/qv;->vv(Landroid/content/Context;)Lcom/ss/android/downloadlib/qv;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/downloadad/api/vv/m;->fn()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v9}, Lcom/ss/android/downloadlib/qv;->vv(Ljava/lang/String;Ljava/lang/String;Z)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v0

    goto :goto_0

    .line 8
    :cond_2
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/downloadlib/qv;->vv(Landroid/content/Context;)Lcom/ss/android/downloadlib/qv;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/downloadad/api/vv/m;->vv()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadlib/qv;->m(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_3

    return v8

    .line 9
    :cond_3
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v10

    .line 10
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v12

    const-wide/16 v1, 0x0

    cmp-long v3, v10, v1

    if-ltz v3, :cond_7

    cmp-long v3, v12, v1

    if-lez v3, :cond_7

    .line 11
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v0

    const-wide/16 v1, 0x64

    mul-long v1, v1, v10

    div-long/2addr v1, v12

    long-to-int v2, v1

    invoke-static {v0, v2}, Lcom/ss/android/downloadlib/addownload/k;->vv(II)I

    move-result v14

    const-wide/32 v0, 0x100000

    .line 12
    div-long v0, v10, v0

    long-to-int v15, v0

    .line 13
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/downloadad/api/vv/m;->la()I

    move-result v0

    move-object/from16 v6, p0

    invoke-direct {v6, v0}, Lcom/ss/android/downloadlib/addownload/i/p;->vv(I)I

    move-result v0

    if-le v14, v0, :cond_4

    const/16 v16, 0x1

    goto :goto_1

    :cond_4
    const/16 v16, 0x0

    .line 14
    :goto_1
    new-instance v17, Lcom/ss/android/downloadlib/addownload/i/p$1;

    move-object/from16 v0, v17

    move-object/from16 v1, p0

    move v2, v14

    move v3, v15

    move v4, v15

    move-object/from16 v5, p1

    move-object/from16 v6, p3

    invoke-direct/range {v0 .. v6}, Lcom/ss/android/downloadlib/addownload/i/p$1;-><init>(Lcom/ss/android/downloadlib/addownload/i/p;IIILcom/ss/android/downloadad/api/vv/m;Lcom/ss/android/downloadlib/addownload/i/qv;)V

    sput-object v17, Lcom/ss/android/downloadlib/addownload/i/p;->vv:Lcom/ss/android/downloadlib/addownload/vv/i;

    .line 15
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/downloadad/api/vv/m;->la()I

    move-result v0

    invoke-static {v0, v10, v11, v12, v13}, Lcom/ss/android/downloadlib/addownload/k;->vv(IJJ)J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/ss/android/downloadlib/n/jh;->vv(J)Ljava/lang/String;

    move-result-object v0

    if-eqz v16, :cond_5

    sub-long/2addr v12, v10

    .line 16
    invoke-static {v12, v13}, Lcom/ss/android/downloadlib/n/jh;->vv(J)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v0, v2, v8

    aput-object v1, v2, v9

    const-string v0, "\u8be5\u4efb\u52a1\u5df2\u4e0b\u8f7d%s\uff0c\u4ec5\u9700%s\u5373\u53ef\u4e0b\u8f7d\u5b8c\u6210\uff0c\u662f\u5426\u7ee7\u7eed\uff1f"

    .line 17
    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_5
    new-array v1, v9, [Ljava/lang/Object;

    aput-object v0, v1, v8

    const-string v0, "\u8be5\u4efb\u52a1\u5df2\u4e0b\u8f7d%s\uff0c\u5373\u5c06\u4e0b\u8f7d\u5b8c\u6210\uff0c\u662f\u5426\u7ee7\u7eed\u4e0b\u8f7d\uff1f"

    .line 18
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_2
    move-object v8, v0

    if-eqz p4, :cond_6

    .line 19
    new-instance v10, Lcom/ss/android/downloadlib/addownload/i/p$2;

    move-object v0, v10

    move-object/from16 v1, p0

    move v2, v14

    move v3, v15

    move v4, v15

    move-object/from16 v5, p1

    move-object/from16 v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/ss/android/downloadlib/addownload/i/p$2;-><init>(Lcom/ss/android/downloadlib/addownload/i/p;IIILcom/ss/android/downloadad/api/vv/m;Lcom/ss/android/downloadlib/addownload/vv/p;)V

    invoke-static {v10}, Lcom/ss/android/downloadlib/addownload/i/p;->vv(Lcom/ss/android/downloadlib/addownload/vv/p;)V

    :cond_6
    const-string v0, "\u7ee7\u7eed"

    const-string v1, "\u6682\u505c"

    const-string v2, "\u5220\u9664"

    .line 20
    invoke-static {v7, v8, v0, v1, v2}, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->m(Lcom/ss/android/downloadad/api/vv/vv;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v9

    :cond_7
    return v8
.end method
