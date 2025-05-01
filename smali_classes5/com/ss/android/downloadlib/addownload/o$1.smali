.class Lcom/ss/android/downloadlib/addownload/o$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/downloadlib/addownload/compliance/qv;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/addownload/o;->m(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/ss/android/downloadlib/addownload/o;

.field final synthetic vv:I


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/addownload/o;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/o$1;->m:Lcom/ss/android/downloadlib/addownload/o;

    iput p2, p0, Lcom/ss/android/downloadlib/addownload/o$1;->vv:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public vv()V
    .locals 8

    .line 15
    iget v0, p0, Lcom/ss/android/downloadlib/addownload/o$1;->vv:I

    const/4 v1, 0x0

    const-string v2, ",tryPerformButtonClick:"

    const-string v3, "miui new get miui deeplink fail: handleDownload id:"

    const/4 v4, 0x1

    if-eq v0, v4, :cond_1

    const/4 v5, 0x2

    if-eq v0, v5, :cond_0

    goto :goto_0

    .line 16
    :cond_0
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/o;->k()Ljava/lang/String;

    move-result-object v0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/ss/android/downloadlib/addownload/o$1;->m:Lcom/ss/android/downloadlib/addownload/o;

    invoke-static {v3}, Lcom/ss/android/downloadlib/addownload/o;->p(Lcom/ss/android/downloadlib/addownload/o;)J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2, v1}, Lcom/ss/android/socialbase/downloader/p/vv;->vv(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 17
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o$1;->m:Lcom/ss/android/downloadlib/addownload/o;

    invoke-virtual {v0, v4}, Lcom/ss/android/downloadlib/addownload/o;->m(Z)V

    return-void

    .line 18
    :cond_1
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/o;->k()Ljava/lang/String;

    move-result-object v0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/ss/android/downloadlib/addownload/o$1;->m:Lcom/ss/android/downloadlib/addownload/o;

    invoke-static {v3}, Lcom/ss/android/downloadlib/addownload/o;->p(Lcom/ss/android/downloadlib/addownload/o;)J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2, v1}, Lcom/ss/android/socialbase/downloader/p/vv;->vv(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 19
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o$1;->m:Lcom/ss/android/downloadlib/addownload/o;

    invoke-virtual {v0, v4}, Lcom/ss/android/downloadlib/addownload/o;->p(Z)V

    :goto_0
    return-void
.end method

.method public vv(Ljava/lang/String;)V
    .locals 8

    .line 1
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v0, "download_miui_new_market"

    const/4 v7, 0x1

    .line 2
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "download_miui_market_deeplink"

    .line 3
    invoke-virtual {v6, v0, p1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 4
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o$1;->m:Lcom/ss/android/downloadlib/addownload/o;

    invoke-static {v0}, Lcom/ss/android/downloadlib/addownload/o;->vv(Lcom/ss/android/downloadlib/addownload/o;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/o$1;->m:Lcom/ss/android/downloadlib/addownload/o;

    invoke-static {v1}, Lcom/ss/android/downloadlib/addownload/o;->m(Lcom/ss/android/downloadlib/addownload/o;)Lcom/ss/android/downloadlib/addownload/qv;

    move-result-object v1

    iget-object v1, v1, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    const/4 v4, 0x1

    iget v5, p0, Lcom/ss/android/downloadlib/addownload/o$1;->vv:I

    move-object v2, p1

    move-object v3, v6

    invoke-static/range {v0 .. v5}, Lcom/ss/android/downloadlib/n/qv;->vv(Landroid/content/Context;Lcom/ss/android/downloadlib/addownload/m/o;Ljava/lang/String;Lorg/json/JSONObject;ZI)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x0

    const-string v1, "download_miui_jump_market_success"

    if-nez p1, :cond_2

    .line 5
    :try_start_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v6, v1, p1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 6
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/compliance/u;->vv()Lcom/ss/android/downloadlib/addownload/compliance/u;

    move-result-object p1

    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o$1;->m:Lcom/ss/android/downloadlib/addownload/o;

    invoke-static {v0}, Lcom/ss/android/downloadlib/addownload/o;->m(Lcom/ss/android/downloadlib/addownload/o;)Lcom/ss/android/downloadlib/addownload/qv;

    move-result-object v0

    iget-object v0, v0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    invoke-virtual {p1, v7, v0, v6}, Lcom/ss/android/downloadlib/addownload/compliance/u;->vv(ILcom/ss/android/downloadlib/addownload/m/o;Lorg/json/JSONObject;)V

    .line 7
    iget p1, p0, Lcom/ss/android/downloadlib/addownload/o$1;->vv:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    const/4 v0, 0x0

    const-string v1, ",tryPerformButtonClick:"

    const-string v2, "miui new rollback fail: handleDownload id:"

    if-eq p1, v7, :cond_1

    const/4 v3, 0x2

    if-eq p1, v3, :cond_0

    return-void

    .line 8
    :cond_0
    :try_start_2
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/o;->k()Ljava/lang/String;

    move-result-object p1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/o$1;->m:Lcom/ss/android/downloadlib/addownload/o;

    invoke-static {v2}, Lcom/ss/android/downloadlib/addownload/o;->p(Lcom/ss/android/downloadlib/addownload/o;)J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1, v0}, Lcom/ss/android/socialbase/downloader/p/vv;->vv(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 9
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/o$1;->m:Lcom/ss/android/downloadlib/addownload/o;

    invoke-virtual {p1, v7}, Lcom/ss/android/downloadlib/addownload/o;->m(Z)V

    return-void

    .line 10
    :cond_1
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/o;->k()Ljava/lang/String;

    move-result-object p1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/o$1;->m:Lcom/ss/android/downloadlib/addownload/o;

    invoke-static {v2}, Lcom/ss/android/downloadlib/addownload/o;->p(Lcom/ss/android/downloadlib/addownload/o;)J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1, v0}, Lcom/ss/android/socialbase/downloader/p/vv;->vv(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 11
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/o$1;->m:Lcom/ss/android/downloadlib/addownload/o;

    invoke-virtual {p1, v7}, Lcom/ss/android/downloadlib/addownload/o;->p(Z)V

    return-void

    .line 12
    :cond_2
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v6, v1, p1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 13
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/compliance/u;->vv()Lcom/ss/android/downloadlib/addownload/compliance/u;

    move-result-object p1

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/o$1;->m:Lcom/ss/android/downloadlib/addownload/o;

    invoke-static {v1}, Lcom/ss/android/downloadlib/addownload/o;->m(Lcom/ss/android/downloadlib/addownload/o;)Lcom/ss/android/downloadlib/addownload/qv;

    move-result-object v1

    iget-object v1, v1, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    invoke-virtual {p1, v0, v1, v6}, Lcom/ss/android/downloadlib/addownload/compliance/u;->vv(ILcom/ss/android/downloadlib/addownload/m/o;Lorg/json/JSONObject;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 14
    invoke-static {}, Lcom/ss/android/downloadlib/o/p;->vv()Lcom/ss/android/downloadlib/o/p;

    move-result-object v0

    const-string v1, "generate miui new market param error"

    invoke-virtual {v0, p1, v1}, Lcom/ss/android/downloadlib/o/p;->vv(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method
