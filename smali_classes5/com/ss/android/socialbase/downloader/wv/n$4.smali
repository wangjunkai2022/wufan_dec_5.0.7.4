.class final Lcom/ss/android/socialbase/downloader/wv/n$4;
.super Lcom/ss/android/socialbase/downloader/depend/k$vv;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/downloader/wv/n;->vv(Lcom/ss/android/socialbase/downloader/depend/l;)Lcom/ss/android/socialbase/downloader/depend/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic vv:Lcom/ss/android/socialbase/downloader/depend/l;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/depend/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/wv/n$4;->vv:Lcom/ss/android/socialbase/downloader/depend/l;

    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/depend/k$vv;-><init>()V

    return-void
.end method


# virtual methods
.method public m()[I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/wv/n$4;->vv:Lcom/ss/android/socialbase/downloader/depend/l;

    instance-of v1, v0, Lcom/ss/android/socialbase/downloader/depend/p;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Lcom/ss/android/socialbase/downloader/depend/p;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/depend/p;->vv()[I

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public vv()Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 5
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/wv/n$4;->vv:Lcom/ss/android/socialbase/downloader/depend/l;

    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/depend/l;->m()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public vv(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 3
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/wv/n$4;->vv:Lcom/ss/android/socialbase/downloader/depend/l;

    invoke-interface {p1, v0}, Lcom/ss/android/socialbase/downloader/depend/l;->vv(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 4
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    return-void
.end method
