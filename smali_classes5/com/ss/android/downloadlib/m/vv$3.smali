.class final Lcom/ss/android/downloadlib/m/vv$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/downloadlib/m/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/m/vv;->vv(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadlib/addownload/m/o;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/ss/android/downloadlib/addownload/m/o;

.field final synthetic p:Lorg/json/JSONObject;

.field final synthetic vv:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/ss/android/downloadlib/addownload/m/o;Lorg/json/JSONObject;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/m/vv$3;->vv:Ljava/lang/String;

    iput-object p2, p0, Lcom/ss/android/downloadlib/m/vv$3;->m:Lcom/ss/android/downloadlib/addownload/m/o;

    iput-object p3, p0, Lcom/ss/android/downloadlib/m/vv$3;->p:Lorg/json/JSONObject;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public vv(Z)V
    .locals 4

    if-nez p1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/m/vv$3;->vv:Ljava/lang/String;

    const-string v1, "open_market"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "market://details?id="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/ss/android/downloadlib/m/vv$3;->m:Lcom/ss/android/downloadlib/addownload/m/o;

    invoke-virtual {v2}, Lcom/ss/android/downloadlib/addownload/m/o;->o()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ss/android/downloadlib/n/wv;->vv(Landroid/content/Context;Landroid/net/Uri;)Lcom/ss/android/downloadlib/addownload/m/n;

    move-result-object v0

    iget-object v1, p0, Lcom/ss/android/downloadlib/m/vv$3;->m:Lcom/ss/android/downloadlib/addownload/m/o;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/ss/android/downloadlib/m/vv;->vv(Lcom/ss/android/downloadlib/addownload/m/n;Lcom/ss/android/downloadlib/addownload/m/o;Z)V

    .line 3
    :cond_0
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object v0

    if-eqz p1, :cond_1

    const-string v1, "market_delay_success"

    goto :goto_0

    :cond_1
    const-string v1, "market_delay_failed"

    :goto_0
    iget-object v2, p0, Lcom/ss/android/downloadlib/m/vv$3;->p:Lorg/json/JSONObject;

    iget-object v3, p0, Lcom/ss/android/downloadlib/m/vv$3;->m:Lcom/ss/android/downloadlib/addownload/m/o;

    invoke-virtual {v0, v1, v2, v3}, Lcom/ss/android/downloadlib/i/vv;->vv(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)V

    if-eqz p1, :cond_2

    .line 4
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->y()Lcom/ss/android/download/api/config/la;

    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    iget-object p1, p0, Lcom/ss/android/downloadlib/m/vv$3;->m:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object p1, p1, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    .line 5
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getPackageName()Ljava/lang/String;

    :cond_2
    return-void
.end method
