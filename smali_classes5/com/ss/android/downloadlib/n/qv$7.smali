.class final Lcom/ss/android/downloadlib/n/qv$7;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/n/qv;->n(Landroid/content/Context;Lcom/ss/android/downloadlib/addownload/m/o;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic m:Landroid/content/Context;

.field final synthetic p:Lcom/ss/android/downloadlib/addownload/m/o;

.field final synthetic vv:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Landroid/content/Context;Lcom/ss/android/downloadlib/addownload/m/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/n/qv$7;->vv:Ljava/lang/String;

    iput-object p2, p0, Lcom/ss/android/downloadlib/n/qv$7;->m:Landroid/content/Context;

    iput-object p3, p0, Lcom/ss/android/downloadlib/n/qv$7;->p:Lcom/ss/android/downloadlib/addownload/m/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 1
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->wv()Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "s"

    .line 2
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 3
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    const-string v3, "x"

    .line 4
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/appdownloader/u/p;->vv(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 5
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "t"

    const-string v3, "v"

    .line 6
    invoke-static {v0, v1, v3}, Lcom/ss/android/downloadlib/n/jh;->vv(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 7
    iget-object v1, p0, Lcom/ss/android/downloadlib/n/qv$7;->vv:Ljava/lang/String;

    const-string v3, "p"

    invoke-static {v0, v3, v1}, Lcom/ss/android/downloadlib/n/jh;->vv(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 8
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    .line 9
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->g()Lcom/ss/android/download/api/config/d;

    move-result-object v1

    array-length v3, v0

    invoke-interface {v1, v0, v3}, Lcom/ss/android/download/api/config/d;->vv([BI)[B

    move-result-object v5

    .line 10
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->i()Lcom/ss/android/download/api/config/qv;

    move-result-object v3

    new-instance v8, Lcom/ss/android/downloadlib/n/qv$7$1;

    invoke-direct {v8, p0, v2}, Lcom/ss/android/downloadlib/n/qv$7$1;-><init>(Lcom/ss/android/downloadlib/n/qv$7;Lorg/json/JSONObject;)V

    const-string v6, "application/octet-stream;tt-data=a"

    const/4 v7, 0x0

    invoke-interface/range {v3 .. v8}, Lcom/ss/android/download/api/config/qv;->vv(Ljava/lang/String;[BLjava/lang/String;ILcom/ss/android/download/api/config/g;)V

    return-void
.end method
