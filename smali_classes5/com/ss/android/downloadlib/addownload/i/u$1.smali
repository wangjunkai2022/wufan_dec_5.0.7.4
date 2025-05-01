.class Lcom/ss/android/downloadlib/addownload/i/u$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/downloadlib/addownload/vv/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/addownload/i/u;->vv(Lcom/ss/android/downloadad/api/vv/m;ILcom/ss/android/downloadlib/addownload/i/qv;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/ss/android/downloadlib/addownload/i/qv;

.field final synthetic p:Lcom/ss/android/downloadlib/addownload/i/u;

.field final synthetic vv:Lcom/ss/android/downloadad/api/vv/m;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/addownload/i/u;Lcom/ss/android/downloadad/api/vv/m;Lcom/ss/android/downloadlib/addownload/i/qv;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/i/u$1;->p:Lcom/ss/android/downloadlib/addownload/i/u;

    iput-object p2, p0, Lcom/ss/android/downloadlib/addownload/i/u$1;->vv:Lcom/ss/android/downloadad/api/vv/m;

    iput-object p3, p0, Lcom/ss/android/downloadlib/addownload/i/u$1;->m:Lcom/ss/android/downloadlib/addownload/i/qv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public m()V
    .locals 4

    const/4 v0, 0x0

    .line 1
    invoke-static {v0}, Lcom/ss/android/downloadlib/addownload/i/u;->vv(Lcom/ss/android/downloadlib/addownload/vv/i;)Lcom/ss/android/downloadlib/addownload/vv/i;

    .line 2
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "pause_optimise_type"

    const-string v2, "download_percent"

    .line 3
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "pause_optimise_action"

    const-string v2, "cancel"

    .line 4
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 5
    invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V

    .line 6
    :goto_0
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object v1

    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/i/u$1;->vv:Lcom/ss/android/downloadad/api/vv/m;

    const-string v3, "pause_optimise"

    invoke-virtual {v1, v3, v0, v2}, Lcom/ss/android/downloadlib/i/vv;->vv(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)V

    .line 7
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/i/u$1;->m:Lcom/ss/android/downloadlib/addownload/i/qv;

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/i/u$1;->vv:Lcom/ss/android/downloadad/api/vv/m;

    invoke-interface {v0, v1}, Lcom/ss/android/downloadlib/addownload/i/qv;->vv(Lcom/ss/android/downloadad/api/vv/m;)V

    return-void
.end method

.method public vv()V
    .locals 4

    const/4 v0, 0x0

    .line 1
    invoke-static {v0}, Lcom/ss/android/downloadlib/addownload/i/u;->vv(Lcom/ss/android/downloadlib/addownload/vv/i;)Lcom/ss/android/downloadlib/addownload/vv/i;

    .line 2
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "pause_optimise_type"

    const-string v2, "download_percent"

    .line 3
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "pause_optimise_action"

    const-string v2, "confirm"

    .line 4
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 5
    invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V

    .line 6
    :goto_0
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object v1

    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/i/u$1;->vv:Lcom/ss/android/downloadad/api/vv/m;

    const-string v3, "pause_optimise"

    invoke-virtual {v1, v3, v0, v2}, Lcom/ss/android/downloadlib/i/vv;->vv(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)V

    return-void
.end method
