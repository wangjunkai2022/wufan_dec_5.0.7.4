.class Lcom/ss/android/downloadlib/addownload/o$8;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/download/api/config/x;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/addownload/o;->vv(ZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/ss/android/downloadlib/addownload/o;

.field final synthetic vv:Z


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/addownload/o;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/o$8;->m:Lcom/ss/android/downloadlib/addownload/o;

    iput-boolean p2, p0, Lcom/ss/android/downloadlib/addownload/o$8;->vv:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public vv()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/o;->k()Ljava/lang/String;

    move-result-object v0

    const-string v1, "pBCD start download"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/ss/android/downloadlib/n/b;->vv(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 2
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o$8;->m:Lcom/ss/android/downloadlib/addownload/o;

    iget-boolean v1, p0, Lcom/ss/android/downloadlib/addownload/o$8;->vv:Z

    invoke-static {v0, v1}, Lcom/ss/android/downloadlib/addownload/o;->vv(Lcom/ss/android/downloadlib/addownload/o;Z)V

    return-void
.end method

.method public vv(Ljava/lang/String;)V
    .locals 2

    .line 3
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/o;->k()Ljava/lang/String;

    move-result-object p1

    const-string v0, "pBCD onDenied"

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lcom/ss/android/downloadlib/n/b;->vv(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method
