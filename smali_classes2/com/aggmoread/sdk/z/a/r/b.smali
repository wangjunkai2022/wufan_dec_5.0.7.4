.class public Lcom/aggmoread/sdk/z/a/r/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lcom/aggmoread/sdk/z/a/g/b;Lcom/aggmoread/sdk/z/a/f/a;)V
    .locals 3

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/a/g/b;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/g/b;->e:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/aggmoread/sdk/z/a/g/b$a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/g/b$a;->a()Lcom/aggmoread/sdk/z/a/g/b$a$a;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Lcom/aggmoread/sdk/z/a/f/c;

    invoke-direct {v2, p0, v0, p1}, Lcom/aggmoread/sdk/z/a/f/c;-><init>(Lcom/aggmoread/sdk/z/a/g/b;Lcom/aggmoread/sdk/z/a/g/b$a$a;Lcom/aggmoread/sdk/z/a/f/a;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p1, v1}, Lcom/aggmoread/sdk/z/a/f/a;->onAdLoaded(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    new-instance p0, Lcom/aggmoread/sdk/z/a/g/e;

    const v0, 0xc350

    const-string v1, "\u65e0\u6570\u636e\u586b\u5145!"

    invoke-direct {p0, v0, v1}, Lcom/aggmoread/sdk/z/a/g/e;-><init>(ILjava/lang/String;)V

    invoke-interface {p1, p0}, Lcom/aggmoread/sdk/z/a/i/b;->a(Lcom/aggmoread/sdk/z/a/g/e;)V

    :goto_0
    return-void
.end method

.method public static a(Lcom/aggmoread/sdk/z/a/g/b;Lcom/aggmoread/sdk/z/a/k/a;)V
    .locals 3

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/a/g/b;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/g/b;->e:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/aggmoread/sdk/z/a/g/b$a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/g/b$a;->a()Lcom/aggmoread/sdk/z/a/g/b$a$a;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Lcom/aggmoread/sdk/z/a/k/b;

    invoke-direct {v2, p0, v0, p1}, Lcom/aggmoread/sdk/z/a/k/b;-><init>(Lcom/aggmoread/sdk/z/a/g/b;Lcom/aggmoread/sdk/z/a/g/b$a$a;Lcom/aggmoread/sdk/z/a/k/a;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p1, v1}, Lcom/aggmoread/sdk/z/a/k/a;->onAdLoaded(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    new-instance p0, Lcom/aggmoread/sdk/z/a/g/e;

    const v0, 0xc350

    const-string v1, "\u65e0\u6570\u636e\u586b\u5145!"

    invoke-direct {p0, v0, v1}, Lcom/aggmoread/sdk/z/a/g/e;-><init>(ILjava/lang/String;)V

    invoke-interface {p1, p0}, Lcom/aggmoread/sdk/z/a/i/b;->a(Lcom/aggmoread/sdk/z/a/g/e;)V

    :goto_0
    return-void
.end method

.method public static a(Lcom/aggmoread/sdk/z/a/g/b;Lcom/aggmoread/sdk/z/a/l/a;)V
    .locals 3

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/a/g/b;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/g/b;->e:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/aggmoread/sdk/z/a/g/b$a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/g/b$a;->a()Lcom/aggmoread/sdk/z/a/g/b$a$a;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Lcom/aggmoread/sdk/z/a/l/d;

    invoke-direct {v2, p0, v0}, Lcom/aggmoread/sdk/z/a/l/d;-><init>(Lcom/aggmoread/sdk/z/a/g/b;Lcom/aggmoread/sdk/z/a/g/b$a$a;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p1, v1}, Lcom/aggmoread/sdk/z/a/l/a;->onAdLoaded(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    new-instance p0, Lcom/aggmoread/sdk/z/a/g/e;

    const v0, 0xc350

    const-string v1, "\u65e0\u6570\u636e\u586b\u5145!"

    invoke-direct {p0, v0, v1}, Lcom/aggmoread/sdk/z/a/g/e;-><init>(ILjava/lang/String;)V

    invoke-interface {p1, p0}, Lcom/aggmoread/sdk/z/a/l/a;->a(Lcom/aggmoread/sdk/z/a/g/e;)V

    :goto_0
    return-void
.end method

.method public static a(Lcom/aggmoread/sdk/z/a/h/c;Lcom/aggmoread/sdk/z/a/i/b;)V
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "loadData enter , Request = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ADRIML"

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "requestId"

    :try_start_0
    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/a/h/c;->k()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v2, "device"

    :try_start_1
    new-instance v3, Lcom/aggmoread/sdk/z/a/g/d;

    invoke-direct {v3}, Lcom/aggmoread/sdk/z/a/g/d;-><init>()V

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/a/h/c;->j()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/aggmoread/sdk/z/a/g/d;->a(Landroid/content/Context;)Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    const-string v2, "network"

    :try_start_2
    new-instance v3, Lcom/aggmoread/sdk/z/a/g/f;

    invoke-direct {v3}, Lcom/aggmoread/sdk/z/a/g/f;-><init>()V

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/a/h/c;->j()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/aggmoread/sdk/z/a/g/f;->a(Landroid/content/Context;)Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    const-string v2, "channelId"

    :try_start_3
    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/a/h/c;->i()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    const-string v3, "pageInfo"

    invoke-virtual {v0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "apiType"

    const-string v3, "sdk"

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    invoke-virtual {v2}, Lorg/json/JSONException;->printStackTrace()V

    :goto_0
    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/a/h/c;->o()Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "http://a.wearewinner.cn:15921/api/test/ads"

    goto :goto_1

    :cond_0
    const-string v2, "http://a.wearewinner.cn:15921/api/ads"

    :goto_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "json : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "getApiUrl() = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/aggmoread/sdk/z/a/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lcom/aggmoread/sdk/z/a/r/b$a;

    invoke-direct {v1, p1, p0}, Lcom/aggmoread/sdk/z/a/r/b$a;-><init>(Lcom/aggmoread/sdk/z/a/i/b;Lcom/aggmoread/sdk/z/a/h/c;)V

    const/4 p0, 0x0

    invoke-static {v2, v0, p0, v1}, Lcom/aggmoread/sdk/z/a/p/a;->a(Ljava/lang/String;Lorg/json/JSONObject;Ljava/util/Map;Lcom/aggmoread/sdk/z/a/p/a$f;)V

    return-void
.end method

.method public static a(Lcom/aggmoread/sdk/z/a/i/b;Lcom/aggmoread/sdk/z/a/g/e;)V
    .locals 2

    invoke-static {}, Lcom/aggmoread/sdk/z/a/m/m;->a()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/aggmoread/sdk/z/a/r/b$b;

    invoke-direct {v1, p1, p0}, Lcom/aggmoread/sdk/z/a/r/b$b;-><init>(Lcom/aggmoread/sdk/z/a/g/e;Lcom/aggmoread/sdk/z/a/i/b;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
