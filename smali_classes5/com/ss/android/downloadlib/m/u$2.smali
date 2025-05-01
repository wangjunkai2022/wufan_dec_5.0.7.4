.class final Lcom/ss/android/downloadlib/m/u$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/m/u;->m(Lcom/ss/android/downloadad/api/vv/m;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic m:I

.field final synthetic vv:Lcom/ss/android/downloadad/api/vv/m;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadad/api/vv/m;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/m/u$2;->vv:Lcom/ss/android/downloadad/api/vv/m;

    iput p2, p0, Lcom/ss/android/downloadlib/m/u$2;->m:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/m/u$2;->vv:Lcom/ss/android/downloadad/api/vv/m;

    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/vv/m;->o()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/downloadlib/n/jh;->p(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    .line 2
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v2, "deeplink_source"

    .line 3
    iget-object v3, p0, Lcom/ss/android/downloadlib/m/u$2;->vv:Lcom/ss/android/downloadad/api/vv/m;

    invoke-virtual {v3}, Lcom/ss/android/downloadad/api/vv/m;->ah()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    .line 4
    invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V

    .line 5
    :goto_1
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object v1

    iget-object v2, p0, Lcom/ss/android/downloadlib/m/u$2;->vv:Lcom/ss/android/downloadad/api/vv/m;

    const-string v3, "deeplink_success_2"

    invoke-virtual {v1, v3, v0, v2}, Lcom/ss/android/downloadlib/i/vv;->vv(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)V

    return-void

    .line 6
    :cond_1
    iget v0, p0, Lcom/ss/android/downloadlib/m/u$2;->m:I

    sub-int/2addr v0, v1

    .line 7
    iget-object v1, p0, Lcom/ss/android/downloadlib/m/u$2;->vv:Lcom/ss/android/downloadad/api/vv/m;

    invoke-static {v1, v0}, Lcom/ss/android/downloadlib/m/u;->vv(Lcom/ss/android/downloadad/api/vv/m;I)V

    return-void
.end method
