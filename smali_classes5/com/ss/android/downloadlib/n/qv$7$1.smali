.class Lcom/ss/android/downloadlib/n/qv$7$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/download/api/config/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/n/qv$7;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/ss/android/downloadlib/n/qv$7;

.field final synthetic vv:Lorg/json/JSONObject;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/n/qv$7;Lorg/json/JSONObject;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/n/qv$7$1;->m:Lcom/ss/android/downloadlib/n/qv$7;

    iput-object p2, p0, Lcom/ss/android/downloadlib/n/qv$7$1;->vv:Lorg/json/JSONObject;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public vv(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/n/qv$7$1;->m:Lcom/ss/android/downloadlib/n/qv$7;

    iget-object v1, v0, Lcom/ss/android/downloadlib/n/qv$7;->m:Landroid/content/Context;

    iget-object v2, v0, Lcom/ss/android/downloadlib/n/qv$7;->vv:Ljava/lang/String;

    iget-object v0, v0, Lcom/ss/android/downloadlib/n/qv$7;->p:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v3, p0, Lcom/ss/android/downloadlib/n/qv$7$1;->vv:Lorg/json/JSONObject;

    invoke-static {v1, v2, p1, v0, v3}, Lcom/ss/android/downloadlib/n/qv;->vv(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/downloadlib/addownload/m/o;Lorg/json/JSONObject;)V

    return-void
.end method

.method public vv(Ljava/lang/Throwable;)V
    .locals 5

    .line 2
    iget-object v0, p0, Lcom/ss/android/downloadlib/n/qv$7$1;->m:Lcom/ss/android/downloadlib/n/qv$7;

    iget-object v0, v0, Lcom/ss/android/downloadlib/n/qv$7;->m:Landroid/content/Context;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "market://details?id="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/ss/android/downloadlib/n/qv$7$1;->m:Lcom/ss/android/downloadlib/n/qv$7;

    iget-object v3, v3, Lcom/ss/android/downloadlib/n/qv$7;->vv:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ss/android/downloadlib/n/qv;->vv(Landroid/content/Context;Landroid/net/Uri;)Lcom/ss/android/downloadlib/addownload/m/n;

    move-result-object v0

    iget-object v1, p0, Lcom/ss/android/downloadlib/n/qv$7$1;->m:Lcom/ss/android/downloadlib/n/qv$7;

    iget-object v1, v1, Lcom/ss/android/downloadlib/n/qv$7;->p:Lcom/ss/android/downloadlib/addownload/m/o;

    const/4 v3, 0x1

    invoke-static {v0, v1, v3}, Lcom/ss/android/downloadlib/m/vv;->vv(Lcom/ss/android/downloadlib/addownload/m/n;Lcom/ss/android/downloadlib/addownload/m/o;Z)V

    .line 3
    iget-object v0, p0, Lcom/ss/android/downloadlib/n/qv$7$1;->vv:Lorg/json/JSONObject;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, "null"

    :goto_0
    const-string v1, "ttdownloader_message"

    invoke-static {v0, v1, p1}, Lcom/ss/android/downloadlib/n/jh;->vv(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    iget-object p1, p0, Lcom/ss/android/downloadlib/n/qv$7$1;->m:Lcom/ss/android/downloadlib/n/qv$7;

    iget-object p1, p1, Lcom/ss/android/downloadlib/n/qv$7;->p:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v0, p0, Lcom/ss/android/downloadlib/n/qv$7$1;->vv:Lorg/json/JSONObject;

    const/4 v1, 0x7

    const/4 v3, 0x5

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/ss/android/downloadlib/n/qv$7$1;->m:Lcom/ss/android/downloadlib/n/qv$7;

    iget-object v2, v2, Lcom/ss/android/downloadlib/n/qv$7;->vv:Ljava/lang/String;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v0, v1, v3, v2}, Lcom/ss/android/downloadlib/n/qv;->vv(Lcom/ss/android/downloadlib/addownload/m/o;Lorg/json/JSONObject;IILjava/lang/String;)V

    return-void
.end method
