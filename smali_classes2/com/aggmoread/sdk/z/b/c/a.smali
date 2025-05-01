.class public Lcom/aggmoread/sdk/z/b/c/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lcom/aggmoread/sdk/z/a/i/b;Lcom/aggmoread/sdk/z/a/g/e;)V
    .locals 2

    invoke-static {}, Lcom/aggmoread/sdk/z/a/m/m;->a()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/aggmoread/sdk/z/b/c/a$b;

    invoke-direct {v1, p1, p0}, Lcom/aggmoread/sdk/z/b/c/a$b;-><init>(Lcom/aggmoread/sdk/z/a/g/e;Lcom/aggmoread/sdk/z/a/i/b;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static a(Lcom/aggmoread/sdk/z/b/a/a;Lcom/aggmoread/sdk/z/a/l/a;)V
    .locals 3

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/b/a/a;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/a/a;->e:Lcom/aggmoread/sdk/z/b/a/a$a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/b/a/a$a;->a()Lcom/aggmoread/sdk/z/b/a/a$a$a;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Lcom/aggmoread/sdk/z/b/c/b;

    invoke-direct {v2, p0, v0}, Lcom/aggmoread/sdk/z/b/c/b;-><init>(Lcom/aggmoread/sdk/z/b/a/a;Lcom/aggmoread/sdk/z/b/a/a$a$a;)V

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

.method public static a(Lcom/aggmoread/sdk/z/b/b/a;Lcom/aggmoread/sdk/z/a/i/b;)V
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "loadData enter , Request = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "DSPDRTAG"

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "slotCode"

    :try_start_0
    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/b/b/a;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v2, "request_id"

    :try_start_1
    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/b/b/a;->j()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    const-string v2, "slot_type"

    :try_start_2
    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/b/b/a;->g()Lcom/aggmoread/sdk/z/a/i/a;

    move-result-object v3

    invoke-virtual {v3}, Lcom/aggmoread/sdk/z/a/i/a;->a()I

    move-result v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    const-string v2, "imei"

    :try_start_3
    invoke-static {}, Lcom/aggmoread/sdk/z/a/h/a;->d()Lcom/aggmoread/sdk/z/a/h/a;

    move-result-object v3

    sget-object v4, Lcom/aggmoread/sdk/z/a/h/a$a;->c:Lcom/aggmoread/sdk/z/a/h/a$a;

    invoke-virtual {v3, v4}, Lcom/aggmoread/sdk/z/a/h/a;->a(Lcom/aggmoread/sdk/z/a/h/a$a;)Lcom/aggmoread/sdk/z/a/g/a;

    move-result-object v3

    invoke-virtual {v3}, Lcom/aggmoread/sdk/z/a/g/a;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0

    const-string v2, "oaid"

    :try_start_4
    invoke-static {}, Lcom/aggmoread/sdk/z/a/h/a;->d()Lcom/aggmoread/sdk/z/a/h/a;

    move-result-object v3

    invoke-virtual {v3, v4}, Lcom/aggmoread/sdk/z/a/h/a;->a(Lcom/aggmoread/sdk/z/a/h/a$a;)Lcom/aggmoread/sdk/z/a/g/a;

    move-result-object v3

    invoke-virtual {v3}, Lcom/aggmoread/sdk/z/a/g/a;->o()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "os_type"

    const-string v3, "1"

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_0

    const-string v2, "brand"

    :try_start_5
    sget-object v3, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_0

    const-string v2, "model"

    :try_start_6
    sget-object v3, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_6
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_0

    const-string v2, "package_name"

    :try_start_7
    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/b/b/a;->i()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_7
    .catch Lorg/json/JSONException; {:try_start_7 .. :try_end_7} :catch_0

    const-string v2, "ip"

    :try_start_8
    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/b/b/a;->i()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/aggmoread/sdk/z/a/p/e;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_8
    .catch Lorg/json/JSONException; {:try_start_8 .. :try_end_8} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    invoke-virtual {v2}, Lorg/json/JSONException;->printStackTrace()V

    :goto_0
    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->d()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "getDspUrl() = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "getDspUrl() = Json "

    invoke-static {v1, v3}, Lcom/aggmoread/sdk/z/a/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lcom/aggmoread/sdk/z/b/c/a$a;

    invoke-direct {v1, p1, p0}, Lcom/aggmoread/sdk/z/b/c/a$a;-><init>(Lcom/aggmoread/sdk/z/a/i/b;Lcom/aggmoread/sdk/z/b/b/a;)V

    const/4 p0, 0x0

    invoke-static {v2, v0, p0, v1}, Lcom/aggmoread/sdk/z/a/p/a;->a(Ljava/lang/String;Lorg/json/JSONObject;Ljava/util/Map;Lcom/aggmoread/sdk/z/a/p/a$f;)V

    return-void
.end method
