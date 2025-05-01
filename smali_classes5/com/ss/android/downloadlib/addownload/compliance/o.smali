.class public Lcom/ss/android/downloadlib/addownload/compliance/o;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ss/android/downloadlib/addownload/compliance/o$m;,
        Lcom/ss/android/downloadlib/addownload/compliance/o$vv;
    }
.end annotation


# instance fields
.field private b:J

.field private i:I

.field private jh:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private m:Lcom/ss/android/downloadlib/addownload/compliance/o$vv;

.field private n:Ljava/lang/String;

.field private o:I

.field private p:I

.field private q:Ljava/lang/String;

.field private qv:Ljava/lang/String;

.field private r:Ljava/lang/String;

.field private t:Lcom/ss/android/downloadlib/addownload/compliance/o$m;

.field private u:I

.field private vv:Z

.field private wv:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xf

    .line 2
    iput v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/o;->o:I

    return-void
.end method

.method private static m(Lorg/json/JSONObject;)Lcom/ss/android/downloadlib/addownload/compliance/o$m;
    .locals 3

    const-string v0, "status"

    .line 17
    new-instance v1, Lcom/ss/android/downloadlib/addownload/compliance/o$m;

    invoke-direct {v1}, Lcom/ss/android/downloadlib/addownload/compliance/o$m;-><init>()V

    .line 18
    :try_start_0
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 19
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/ss/android/downloadlib/addownload/compliance/o$m;->vv(I)V

    const-string v0, "message"

    .line 20
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Lcom/ss/android/downloadlib/addownload/compliance/o$m;->vv(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 21
    invoke-static {}, Lcom/ss/android/downloadlib/o/p;->vv()Lcom/ss/android/downloadlib/o/p;

    move-result-object v0

    const-string v2, "ComplianceResult getStatus"

    invoke-virtual {v0, p0, v2}, Lcom/ss/android/downloadlib/o/p;->vv(Ljava/lang/Throwable;Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-object v1
.end method

.method private static m(Lcom/ss/android/downloadlib/addownload/compliance/o$m;)Lorg/json/JSONObject;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 22
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    if-eqz p0, :cond_0

    .line 23
    invoke-static {p0}, Lcom/ss/android/downloadlib/addownload/compliance/o$m;->vv(Lcom/ss/android/downloadlib/addownload/compliance/o$m;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "status"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 24
    invoke-static {p0}, Lcom/ss/android/downloadlib/addownload/compliance/o$m;->m(Lcom/ss/android/downloadlib/addownload/compliance/o$m;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "message"

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    return-object v0
.end method

.method private static m(Lcom/ss/android/downloadlib/addownload/compliance/o$vv;)Lorg/json/JSONObject;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 4
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    if-eqz p0, :cond_0

    .line 5
    invoke-static {p0}, Lcom/ss/android/downloadlib/addownload/compliance/o$vv;->vv(Lcom/ss/android/downloadlib/addownload/compliance/o$vv;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "app_name"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 6
    invoke-static {p0}, Lcom/ss/android/downloadlib/addownload/compliance/o$vv;->m(Lcom/ss/android/downloadlib/addownload/compliance/o$vv;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "version_name"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 7
    invoke-static {p0}, Lcom/ss/android/downloadlib/addownload/compliance/o$vv;->p(Lcom/ss/android/downloadlib/addownload/compliance/o$vv;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "update_time"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 8
    invoke-static {p0}, Lcom/ss/android/downloadlib/addownload/compliance/o$vv;->i(Lcom/ss/android/downloadlib/addownload/compliance/o$vv;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "size"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 9
    invoke-static {p0}, Lcom/ss/android/downloadlib/addownload/compliance/o$vv;->o(Lcom/ss/android/downloadlib/addownload/compliance/o$vv;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "developer_name"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 10
    invoke-static {p0}, Lcom/ss/android/downloadlib/addownload/compliance/o$vv;->u(Lcom/ss/android/downloadlib/addownload/compliance/o$vv;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "policy_url"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 11
    invoke-static {p0}, Lcom/ss/android/downloadlib/addownload/compliance/o$vv;->n(Lcom/ss/android/downloadlib/addownload/compliance/o$vv;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "icon_url"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 12
    invoke-static {p0}, Lcom/ss/android/downloadlib/addownload/compliance/o$vv;->qv(Lcom/ss/android/downloadlib/addownload/compliance/o$vv;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "download_url"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 13
    invoke-static {p0}, Lcom/ss/android/downloadlib/addownload/compliance/o;->p(Lcom/ss/android/downloadlib/addownload/compliance/o$vv;)Lorg/json/JSONArray;

    move-result-object v1

    const-string v2, "permissions"

    .line 14
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 15
    invoke-static {p0}, Lcom/ss/android/downloadlib/addownload/compliance/o$vv;->wv(Lcom/ss/android/downloadlib/addownload/compliance/o$vv;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "permission_classify_url"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 16
    invoke-static {p0}, Lcom/ss/android/downloadlib/addownload/compliance/o$vv;->k(Lcom/ss/android/downloadlib/addownload/compliance/o$vv;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "desc_url"

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    return-object v0
.end method

.method public static n(Ljava/lang/String;)Lcom/ss/android/downloadlib/addownload/compliance/o;
    .locals 4

    .line 1
    new-instance v0, Lcom/ss/android/downloadlib/addownload/compliance/o;

    invoke-direct {v0}, Lcom/ss/android/downloadlib/addownload/compliance/o;-><init>()V

    .line 2
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 3
    invoke-static {v1}, Lcom/ss/android/downloadlib/addownload/compliance/o;->vv(Lorg/json/JSONObject;)Lcom/ss/android/downloadlib/addownload/compliance/o$vv;

    move-result-object p0

    .line 4
    invoke-static {v1}, Lcom/ss/android/downloadlib/addownload/compliance/o;->m(Lorg/json/JSONObject;)Lcom/ss/android/downloadlib/addownload/compliance/o$m;

    move-result-object v2

    .line 5
    invoke-virtual {v0, p0}, Lcom/ss/android/downloadlib/addownload/compliance/o;->vv(Lcom/ss/android/downloadlib/addownload/compliance/o$vv;)V

    .line 6
    invoke-virtual {v0, v2}, Lcom/ss/android/downloadlib/addownload/compliance/o;->vv(Lcom/ss/android/downloadlib/addownload/compliance/o$m;)V

    const-string p0, "show_auth"

    const/4 v2, 0x0

    .line 7
    invoke-virtual {v1, p0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result p0

    const/4 v3, 0x1

    if-ne p0, v3, :cond_0

    const/4 v2, 0x1

    :cond_0
    invoke-virtual {v0, v2}, Lcom/ss/android/downloadlib/addownload/compliance/o;->vv(Z)V

    const-string p0, "download_permit"

    .line 8
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p0

    invoke-virtual {v0, p0}, Lcom/ss/android/downloadlib/addownload/compliance/o;->vv(I)V

    const-string p0, "appstore_permit"

    .line 9
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p0

    invoke-virtual {v0, p0}, Lcom/ss/android/downloadlib/addownload/compliance/o;->m(I)V

    const-string p0, "market_online_status"

    const/16 v2, 0xf

    .line 10
    invoke-virtual {v1, p0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result p0

    invoke-virtual {v0, p0}, Lcom/ss/android/downloadlib/addownload/compliance/o;->p(I)V

    const-string p0, "hijack_permit"

    .line 11
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p0

    invoke-virtual {v0, p0}, Lcom/ss/android/downloadlib/addownload/compliance/o;->i(I)V

    const-string p0, "package_name"

    .line 12
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/ss/android/downloadlib/addownload/compliance/o;->vv(Ljava/lang/String;)V

    const-string p0, "hijack_url"

    .line 13
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/ss/android/downloadlib/addownload/compliance/o;->m(Ljava/lang/String;)V

    const-string p0, "code"

    .line 14
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p0

    invoke-virtual {v0, p0}, Lcom/ss/android/downloadlib/addownload/compliance/o;->o(I)V

    const-string p0, "message"

    .line 15
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/ss/android/downloadlib/addownload/compliance/o;->p(Ljava/lang/String;)V

    const-string p0, "request_duration"

    const-wide/16 v2, 0x0

    .line 16
    invoke-virtual {v1, p0, v2, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/ss/android/downloadlib/addownload/compliance/o;->vv(J)V

    const-string p0, "back_web_url"

    .line 17
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/ss/android/downloadlib/addownload/compliance/o;->i(Ljava/lang/String;)V

    const-string p0, "hw_app_id"

    .line 18
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/ss/android/downloadlib/addownload/compliance/o;->o(Ljava/lang/String;)V

    const-string p0, "deep_link"

    .line 19
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/ss/android/downloadlib/addownload/compliance/o;->u(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 20
    invoke-static {}, Lcom/ss/android/downloadlib/o/p;->vv()Lcom/ss/android/downloadlib/o/p;

    move-result-object v1

    const-string v2, "ComplianceResult fromJson"

    invoke-virtual {v1, p0, v2}, Lcom/ss/android/downloadlib/o/p;->vv(Ljava/lang/Throwable;Ljava/lang/String;)V

    :goto_0
    return-object v0
.end method

.method private static p(Lcom/ss/android/downloadlib/addownload/compliance/o$vv;)Lorg/json/JSONArray;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 3
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 4
    invoke-static {p0}, Lcom/ss/android/downloadlib/addownload/compliance/o$vv;->b(Lcom/ss/android/downloadlib/addownload/compliance/o$vv;)Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 5
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 6
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ss/android/downloadlib/addownload/compliance/o$vv$vv;

    .line 7
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 8
    invoke-static {v1}, Lcom/ss/android/downloadlib/addownload/compliance/o$vv$vv;->vv(Lcom/ss/android/downloadlib/addownload/compliance/o$vv$vv;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "permission_name"

    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 9
    invoke-static {v1}, Lcom/ss/android/downloadlib/addownload/compliance/o$vv$vv;->m(Lcom/ss/android/downloadlib/addownload/compliance/o$vv$vv;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "permission_desc"

    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 10
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private static vv(Lorg/json/JSONObject;)Lcom/ss/android/downloadlib/addownload/compliance/o$vv;
    .locals 3

    .line 26
    new-instance v0, Lcom/ss/android/downloadlib/addownload/compliance/o$vv;

    invoke-direct {v0}, Lcom/ss/android/downloadlib/addownload/compliance/o$vv;-><init>()V

    :try_start_0
    const-string v1, "auth_info"

    .line 27
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    if-eqz p0, :cond_1

    const-string v1, "app_name"

    .line 28
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadlib/addownload/compliance/o$vv;->vv(Ljava/lang/String;)V

    const-string v1, "version_name"

    .line 29
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadlib/addownload/compliance/o$vv;->m(Ljava/lang/String;)V

    const-string v1, "update_time"

    .line 30
    invoke-static {p0, v1}, Lcom/ss/android/downloadlib/n/jh;->vv(Lorg/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/downloadlib/addownload/compliance/o$vv;->vv(J)V

    const-string v1, "size"

    .line 31
    invoke-static {p0, v1}, Lcom/ss/android/downloadlib/n/jh;->vv(Lorg/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/downloadlib/addownload/compliance/o$vv;->m(J)V

    const-string v1, "developer_name"

    .line 32
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadlib/addownload/compliance/o$vv;->p(Ljava/lang/String;)V

    const-string v1, "package_name"

    .line 33
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadlib/addownload/compliance/o$vv;->i(Ljava/lang/String;)V

    const-string v1, "permissions"

    .line 34
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 35
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 36
    invoke-static {v1, v2}, Lcom/ss/android/downloadlib/addownload/compliance/o;->vv(Lorg/json/JSONArray;Ljava/util/List;)V

    .line 37
    invoke-virtual {v0, v2}, Lcom/ss/android/downloadlib/addownload/compliance/o$vv;->vv(Ljava/util/List;)V

    :cond_0
    const-string v1, "permission_classify_url"

    .line 38
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadlib/addownload/compliance/o$vv;->o(Ljava/lang/String;)V

    const-string v1, "policy_url"

    .line 39
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadlib/addownload/compliance/o$vv;->u(Ljava/lang/String;)V

    const-string v1, "icon_url"

    .line 40
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadlib/addownload/compliance/o$vv;->n(Ljava/lang/String;)V

    const-string v1, "download_url"

    .line 41
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadlib/addownload/compliance/o$vv;->qv(Ljava/lang/String;)V

    const-string v1, "desc_url"

    .line 42
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/ss/android/downloadlib/addownload/compliance/o$vv;->wv(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 43
    invoke-static {}, Lcom/ss/android/downloadlib/o/p;->vv()Lcom/ss/android/downloadlib/o/p;

    move-result-object v1

    const-string v2, "ComplianceResult getAuthInfo"

    invoke-virtual {v1, p0, v2}, Lcom/ss/android/downloadlib/o/p;->vv(Ljava/lang/Throwable;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-object v0
.end method

.method public static vv(Lcom/ss/android/downloadlib/addownload/compliance/o;)Ljava/lang/String;
    .locals 4

    .line 8
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "show_auth"

    .line 9
    iget-boolean v2, p0, Lcom/ss/android/downloadlib/addownload/compliance/o;->vv:Z

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "download_permit"

    .line 10
    iget v2, p0, Lcom/ss/android/downloadlib/addownload/compliance/o;->p:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "appstore_permit"

    .line 11
    iget v2, p0, Lcom/ss/android/downloadlib/addownload/compliance/o;->i:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "market_online_status"

    .line 12
    iget v2, p0, Lcom/ss/android/downloadlib/addownload/compliance/o;->o:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "hijack_permit"

    .line 13
    iget v2, p0, Lcom/ss/android/downloadlib/addownload/compliance/o;->u:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "package_name"

    .line 14
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/compliance/o;->n:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "hijack_url"

    .line 15
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/compliance/o;->qv:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "code"

    .line 16
    iget v2, p0, Lcom/ss/android/downloadlib/addownload/compliance/o;->wv:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "message"

    .line 17
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/compliance/o;->k:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "request_duration"

    .line 18
    iget-wide v2, p0, Lcom/ss/android/downloadlib/addownload/compliance/o;->b:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "auth_info"

    .line 19
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/compliance/o;->m:Lcom/ss/android/downloadlib/addownload/compliance/o$vv;

    invoke-static {v2}, Lcom/ss/android/downloadlib/addownload/compliance/o;->m(Lcom/ss/android/downloadlib/addownload/compliance/o$vv;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "status"

    .line 20
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/compliance/o;->t:Lcom/ss/android/downloadlib/addownload/compliance/o$m;

    invoke-static {v2}, Lcom/ss/android/downloadlib/addownload/compliance/o;->m(Lcom/ss/android/downloadlib/addownload/compliance/o$m;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "back_web_url"

    .line 21
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/compliance/o;->q:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "hw_app_id"

    .line 22
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/compliance/o;->jh:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "deep_link"

    .line 23
    iget-object p0, p0, Lcom/ss/android/downloadlib/addownload/compliance/o;->r:Ljava/lang/String;

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p0

    .line 24
    invoke-static {}, Lcom/ss/android/downloadlib/o/p;->vv()Lcom/ss/android/downloadlib/o/p;

    move-result-object v1

    const-string v2, "ComplianceResult toJson"

    invoke-virtual {v1, p0, v2}, Lcom/ss/android/downloadlib/o/p;->vv(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 25
    :goto_1
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static vv(Lorg/json/JSONArray;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            "Ljava/util/List<",
            "Lcom/ss/android/downloadlib/addownload/compliance/o$vv$vv;",
            ">;)V"
        }
    .end annotation

    if-eqz p0, :cond_2

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    .line 44
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 45
    invoke-virtual {p0, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 46
    new-instance v2, Lcom/ss/android/downloadlib/addownload/compliance/o$vv$vv;

    invoke-direct {v2}, Lcom/ss/android/downloadlib/addownload/compliance/o$vv$vv;-><init>()V

    const-string v3, "permission_name"

    .line 47
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/ss/android/downloadlib/addownload/compliance/o$vv$vv;->vv(Ljava/lang/String;)V

    const-string v3, "permission_desc"

    .line 48
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/ss/android/downloadlib/addownload/compliance/o$vv$vv;->m(Ljava/lang/String;)V

    .line 49
    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method public i(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/o;->u:I

    return-void
.end method

.method public i(Ljava/lang/String;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/o;->q:Ljava/lang/String;

    return-void
.end method

.method public m()Ljava/lang/String;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/o;->r:Ljava/lang/String;

    return-object v0
.end method

.method public m(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/o;->i:I

    return-void
.end method

.method public m(Ljava/lang/String;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/o;->qv:Ljava/lang/String;

    return-void
.end method

.method public o(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/o;->wv:I

    return-void
.end method

.method public o(Ljava/lang/String;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/o;->jh:Ljava/lang/String;

    return-void
.end method

.method public p(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/o;->o:I

    return-void
.end method

.method public p(Ljava/lang/String;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/o;->k:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/ss/android/downloadlib/addownload/compliance/o;->vv(Lcom/ss/android/downloadlib/addownload/compliance/o;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/o;->r:Ljava/lang/String;

    return-void
.end method

.method public vv()I
    .locals 1

    .line 5
    iget v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/o;->wv:I

    return v0
.end method

.method public vv(I)V
    .locals 0

    .line 3
    iput p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/o;->p:I

    return-void
.end method

.method public vv(J)V
    .locals 0

    .line 6
    iput-wide p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/o;->b:J

    return-void
.end method

.method public vv(Lcom/ss/android/downloadlib/addownload/compliance/o$m;)V
    .locals 0

    .line 7
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/o;->t:Lcom/ss/android/downloadlib/addownload/compliance/o$m;

    return-void
.end method

.method public vv(Lcom/ss/android/downloadlib/addownload/compliance/o$vv;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/o;->m:Lcom/ss/android/downloadlib/addownload/compliance/o$vv;

    return-void
.end method

.method public vv(Ljava/lang/String;)V
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/o;->n:Ljava/lang/String;

    return-void
.end method

.method public vv(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/o;->vv:Z

    return-void
.end method
