.class public Lcom/ss/android/downloadlib/addownload/m/vv;
.super Ljava/lang/Object;


# instance fields
.field public i:Ljava/lang/String;

.field public m:J

.field public n:Ljava/lang/String;

.field public o:Ljava/lang/String;

.field public p:J

.field public volatile qv:J

.field public u:Ljava/lang/String;

.field public vv:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lcom/ss/android/downloadlib/addownload/m/vv;->vv:J

    .line 4
    iput-wide p3, p0, Lcom/ss/android/downloadlib/addownload/m/vv;->m:J

    .line 5
    iput-wide p5, p0, Lcom/ss/android/downloadlib/addownload/m/vv;->p:J

    .line 6
    iput-object p7, p0, Lcom/ss/android/downloadlib/addownload/m/vv;->i:Ljava/lang/String;

    .line 7
    iput-object p8, p0, Lcom/ss/android/downloadlib/addownload/m/vv;->o:Ljava/lang/String;

    .line 8
    iput-object p9, p0, Lcom/ss/android/downloadlib/addownload/m/vv;->u:Ljava/lang/String;

    .line 9
    iput-object p10, p0, Lcom/ss/android/downloadlib/addownload/m/vv;->n:Ljava/lang/String;

    return-void
.end method

.method public static vv(Lorg/json/JSONObject;)Lcom/ss/android/downloadlib/addownload/m/vv;
    .locals 4

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 11
    :cond_0
    new-instance v1, Lcom/ss/android/downloadlib/addownload/m/vv;

    invoke-direct {v1}, Lcom/ss/android/downloadlib/addownload/m/vv;-><init>()V

    :try_start_0
    const-string v2, "mDownloadId"

    .line 12
    invoke-static {p0, v2}, Lcom/ss/android/downloadlib/n/jh;->vv(Lorg/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, v1, Lcom/ss/android/downloadlib/addownload/m/vv;->vv:J

    const-string v2, "mAdId"

    .line 13
    invoke-static {p0, v2}, Lcom/ss/android/downloadlib/n/jh;->vv(Lorg/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, v1, Lcom/ss/android/downloadlib/addownload/m/vv;->m:J

    const-string v2, "mExtValue"

    .line 14
    invoke-static {p0, v2}, Lcom/ss/android/downloadlib/n/jh;->vv(Lorg/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, v1, Lcom/ss/android/downloadlib/addownload/m/vv;->p:J

    const-string v2, "mPackageName"

    .line 15
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/ss/android/downloadlib/addownload/m/vv;->i:Ljava/lang/String;

    const-string v2, "mAppName"

    .line 16
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/ss/android/downloadlib/addownload/m/vv;->o:Ljava/lang/String;

    const-string v2, "mLogExtra"

    .line 17
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/ss/android/downloadlib/addownload/m/vv;->u:Ljava/lang/String;

    const-string v2, "mFileName"

    .line 18
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/ss/android/downloadlib/addownload/m/vv;->n:Ljava/lang/String;

    const-string v2, "mTimeStamp"

    .line 19
    invoke-static {p0, v2}, Lcom/ss/android/downloadlib/n/jh;->vv(Lorg/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, v1, Lcom/ss/android/downloadlib/addownload/m/vv;->qv:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    return-object v0
.end method


# virtual methods
.method public vv()Lorg/json/JSONObject;
    .locals 4

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "mDownloadId"

    .line 2
    iget-wide v2, p0, Lcom/ss/android/downloadlib/addownload/m/vv;->vv:J

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "mAdId"

    .line 3
    iget-wide v2, p0, Lcom/ss/android/downloadlib/addownload/m/vv;->m:J

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "mExtValue"

    .line 4
    iget-wide v2, p0, Lcom/ss/android/downloadlib/addownload/m/vv;->p:J

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "mPackageName"

    .line 5
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/m/vv;->i:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "mAppName"

    .line 6
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/m/vv;->o:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "mLogExtra"

    .line 7
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/m/vv;->u:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "mFileName"

    .line 8
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/m/vv;->n:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "mTimeStamp"

    .line 9
    iget-wide v2, p0, Lcom/ss/android/downloadlib/addownload/m/vv;->qv:J

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 10
    invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V

    :goto_0
    return-object v0
.end method
