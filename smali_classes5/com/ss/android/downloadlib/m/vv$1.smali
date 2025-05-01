.class final Lcom/ss/android/downloadlib/m/vv$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/downloadlib/m/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/m/vv;->vv(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/ss/android/downloadad/api/vv/vv;

.field final synthetic vv:Lorg/json/JSONObject;


# direct methods
.method constructor <init>(Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/m/vv$1;->vv:Lorg/json/JSONObject;

    iput-object p2, p0, Lcom/ss/android/downloadlib/m/vv$1;->m:Lcom/ss/android/downloadad/api/vv/vv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public vv(Z)V
    .locals 4

    .line 1
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object v0

    if-eqz p1, :cond_0

    const-string v1, "deeplink_success"

    goto :goto_0

    :cond_0
    const-string v1, "deeplink_failed"

    :goto_0
    iget-object v2, p0, Lcom/ss/android/downloadlib/m/vv$1;->vv:Lorg/json/JSONObject;

    iget-object v3, p0, Lcom/ss/android/downloadlib/m/vv$1;->m:Lcom/ss/android/downloadad/api/vv/vv;

    invoke-virtual {v0, v1, v2, v3}, Lcom/ss/android/downloadlib/i/vv;->m(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)V

    if-eqz p1, :cond_1

    .line 2
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->y()Lcom/ss/android/download/api/config/la;

    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    iget-object p1, p0, Lcom/ss/android/downloadlib/m/vv$1;->m:Lcom/ss/android/downloadad/api/vv/vv;

    .line 3
    invoke-interface {p1}, Lcom/ss/android/downloadad/api/vv/vv;->y()Lcom/ss/android/download/api/download/DownloadModel;

    iget-object p1, p0, Lcom/ss/android/downloadlib/m/vv$1;->m:Lcom/ss/android/downloadad/api/vv/vv;

    invoke-interface {p1}, Lcom/ss/android/downloadad/api/vv/vv;->ya()Lcom/ss/android/download/api/download/DownloadController;

    iget-object p1, p0, Lcom/ss/android/downloadlib/m/vv$1;->m:Lcom/ss/android/downloadad/api/vv/vv;

    invoke-interface {p1}, Lcom/ss/android/downloadad/api/vv/vv;->v()Lcom/ss/android/download/api/download/DownloadEventConfig;

    iget-object p1, p0, Lcom/ss/android/downloadlib/m/vv$1;->m:Lcom/ss/android/downloadad/api/vv/vv;

    .line 4
    invoke-interface {p1}, Lcom/ss/android/downloadad/api/vv/vv;->o()Ljava/lang/String;

    :cond_1
    return-void
.end method
