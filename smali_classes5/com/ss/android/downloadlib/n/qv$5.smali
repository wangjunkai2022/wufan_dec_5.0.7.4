.class final Lcom/ss/android/downloadlib/n/qv$5;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/n/qv;->i(Landroid/content/Context;Lcom/ss/android/downloadlib/addownload/m/o;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic m:Ljava/lang/String;

.field final synthetic p:Lcom/ss/android/downloadlib/addownload/m/o;

.field final synthetic vv:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/ss/android/downloadlib/addownload/m/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/n/qv$5;->vv:Landroid/content/Context;

    iput-object p2, p0, Lcom/ss/android/downloadlib/n/qv$5;->m:Ljava/lang/String;

    iput-object p3, p0, Lcom/ss/android/downloadlib/n/qv$5;->p:Lcom/ss/android/downloadlib/addownload/m/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/n/qv$5;->vv:Landroid/content/Context;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "market://details?id="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/ss/android/downloadlib/n/qv$5;->m:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ss/android/downloadlib/n/qv;->vv(Landroid/content/Context;Landroid/net/Uri;)Lcom/ss/android/downloadlib/addownload/m/n;

    move-result-object v0

    iget-object v1, p0, Lcom/ss/android/downloadlib/n/qv$5;->p:Lcom/ss/android/downloadlib/addownload/m/o;

    const/4 v3, 0x1

    invoke-static {v0, v1, v3}, Lcom/ss/android/downloadlib/m/vv;->vv(Lcom/ss/android/downloadlib/addownload/m/n;Lcom/ss/android/downloadlib/addownload/m/o;Z)V

    .line 2
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const/4 v1, 0x2

    .line 3
    :try_start_0
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->wv()Lorg/json/JSONObject;

    move-result-object v4

    const-string v5, "m2_delay_millis"

    const/16 v6, 0x3e8

    .line 4
    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v5

    int-to-long v5, v5

    invoke-static {v5, v6}, Ljava/lang/Thread;->sleep(J)V

    .line 5
    invoke-static {}, Lcom/ss/android/downloadlib/vv/vv/vv;->vv()Lcom/ss/android/downloadlib/vv/vv/vv;

    move-result-object v5

    iget-object v6, p0, Lcom/ss/android/downloadlib/n/qv$5;->vv:Landroid/content/Context;

    invoke-virtual {v5, v6, v3}, Lcom/ss/android/downloadlib/vv/vv/vv;->vv(Landroid/content/Context;Z)Z

    .line 6
    new-instance v5, Lcom/ss/android/downloadlib/vv/vv/m;

    invoke-direct {v5}, Lcom/ss/android/downloadlib/vv/vv/m;-><init>()V

    .line 7
    iput v3, v5, Lcom/ss/android/downloadlib/vv/vv/m;->vv:I

    const/4 v6, 0x0

    .line 8
    iput v6, v5, Lcom/ss/android/downloadlib/vv/vv/m;->m:I

    const-string v7, "s"

    .line 9
    invoke-virtual {v4, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "v"

    .line 10
    invoke-virtual {v4, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v7}, Lcom/ss/android/socialbase/appdownloader/u/p;->vv(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-array v7, v3, [Ljava/lang/Object;

    .line 11
    iget-object v8, p0, Lcom/ss/android/downloadlib/n/qv$5;->m:Ljava/lang/String;

    aput-object v8, v7, v6

    invoke-static {v4, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    iput-object v7, v5, Lcom/ss/android/downloadlib/vv/vv/m;->p:Ljava/lang/String;

    .line 12
    invoke-static {}, Lcom/ss/android/downloadlib/vv/vv/vv;->vv()Lcom/ss/android/downloadlib/vv/vv/vv;

    move-result-object v7

    const/4 v8, 0x0

    invoke-virtual {v7, v5, v8}, Lcom/ss/android/downloadlib/vv/vv/vv;->vv(Lcom/ss/android/downloadlib/vv/vv/m;Lcom/ss/android/downloadlib/vv/vv/i;)V

    .line 13
    invoke-static {}, Lcom/ss/android/downloadlib/vv/vv/vv;->vv()Lcom/ss/android/downloadlib/vv/vv/vv;

    move-result-object v5

    invoke-virtual {v5}, Lcom/ss/android/downloadlib/vv/vv/vv;->m()V

    .line 14
    iget-object v5, p0, Lcom/ss/android/downloadlib/n/qv$5;->p:Lcom/ss/android/downloadlib/addownload/m/o;

    const/4 v7, -0x1

    new-array v8, v3, [Ljava/lang/Object;

    iget-object v9, p0, Lcom/ss/android/downloadlib/n/qv$5;->m:Ljava/lang/String;

    aput-object v9, v8, v6

    invoke-static {v4, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v5, v0, v7, v1, v4}, Lcom/ss/android/downloadlib/n/qv;->vv(Lcom/ss/android/downloadlib/addownload/m/o;Lorg/json/JSONObject;IILjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v4

    .line 15
    invoke-virtual {v4}, Ljava/lang/Throwable;->printStackTrace()V

    .line 16
    iget-object v4, p0, Lcom/ss/android/downloadlib/n/qv$5;->p:Lcom/ss/android/downloadlib/addownload/m/o;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/ss/android/downloadlib/n/qv$5;->m:Ljava/lang/String;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v0, v3, v1, v2}, Lcom/ss/android/downloadlib/n/qv;->vv(Lcom/ss/android/downloadlib/addownload/m/o;Lorg/json/JSONObject;IILjava/lang/String;)V

    return-void
.end method
