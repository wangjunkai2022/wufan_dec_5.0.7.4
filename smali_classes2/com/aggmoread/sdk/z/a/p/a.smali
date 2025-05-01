.class public Lcom/aggmoread/sdk/z/a/p/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aggmoread/sdk/z/a/p/a$f;,
        Lcom/aggmoread/sdk/z/a/p/a$g;
    }
.end annotation


# direct methods
.method public static a(Ljava/lang/String;Ljava/util/Map;Lcom/aggmoread/sdk/z/a/p/a$g;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/aggmoread/sdk/z/a/p/a$g;",
            ")V"
        }
    .end annotation

    invoke-static {}, Lcom/aggmoread/sdk/z/a/h/a;->d()Lcom/aggmoread/sdk/z/a/h/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/h/a;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/aggmoread/sdk/z/a/h/a;->d()Lcom/aggmoread/sdk/z/a/h/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/h/a;->c()Lcom/aggmoread/sdk/z/a/h/b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p0, p1, p2}, Lcom/aggmoread/sdk/z/a/p/a;->b(Ljava/lang/String;Ljava/util/Map;Lcom/aggmoread/sdk/z/a/p/a$g;)V

    return-void

    :cond_0
    new-instance v0, Lcom/aggmoread/sdk/z/a/p/a$c;

    invoke-direct {v0, p0, p1, p2}, Lcom/aggmoread/sdk/z/a/p/a$c;-><init>(Ljava/lang/String;Ljava/util/Map;Lcom/aggmoread/sdk/z/a/p/a$g;)V

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/m/m;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static a(Ljava/lang/String;Lorg/json/JSONObject;Ljava/util/Map;Lcom/aggmoread/sdk/z/a/p/a$f;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/json/JSONObject;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/aggmoread/sdk/z/a/p/a$f;",
            ")V"
        }
    .end annotation

    invoke-static {}, Lcom/aggmoread/sdk/z/a/h/a;->d()Lcom/aggmoread/sdk/z/a/h/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/h/a;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/aggmoread/sdk/z/a/h/a;->d()Lcom/aggmoread/sdk/z/a/h/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/h/a;->c()Lcom/aggmoread/sdk/z/a/h/b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p0, p1, p2, p3}, Lcom/aggmoread/sdk/z/a/p/a;->b(Ljava/lang/String;Lorg/json/JSONObject;Ljava/util/Map;Lcom/aggmoread/sdk/z/a/p/a$f;)V

    return-void

    :cond_0
    :try_start_0
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "UTF-8"

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    if-nez p2, :cond_1

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    :cond_1
    const-string v0, "Content-type"

    const-string v1, "application/json"

    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v0, Lcom/aggmoread/sdk/z/a/p/a$a;

    invoke-direct {v0, p3}, Lcom/aggmoread/sdk/z/a/p/a$a;-><init>(Lcom/aggmoread/sdk/z/a/p/a$f;)V

    invoke-static {p0, p1, p2, v0}, Lcom/aggmoread/sdk/z/a/p/a;->a(Ljava/lang/String;[BLjava/util/Map;Lcom/aggmoread/sdk/z/a/p/a$g;)V

    :catch_0
    return-void
.end method

.method public static a(Ljava/lang/String;[BLjava/util/Map;Lcom/aggmoread/sdk/z/a/p/a$g;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[B",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/aggmoread/sdk/z/a/p/a$g;",
            ")V"
        }
    .end annotation

    new-instance v0, Lcom/aggmoread/sdk/z/a/p/a$b;

    invoke-direct {v0, p0, p2, p1, p3}, Lcom/aggmoread/sdk/z/a/p/a$b;-><init>(Ljava/lang/String;Ljava/util/Map;[BLcom/aggmoread/sdk/z/a/p/a$g;)V

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/m/m;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static b(Ljava/lang/String;Ljava/util/Map;Lcom/aggmoread/sdk/z/a/p/a$g;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/aggmoread/sdk/z/a/p/a$g;",
            ")V"
        }
    .end annotation

    new-instance v0, Lcom/aggmoread/sdk/z/a/p/a$e;

    invoke-direct {v0, p0, p1, p2}, Lcom/aggmoread/sdk/z/a/p/a$e;-><init>(Ljava/lang/String;Ljava/util/Map;Lcom/aggmoread/sdk/z/a/p/a$g;)V

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/m/m;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static b(Ljava/lang/String;Lorg/json/JSONObject;Ljava/util/Map;Lcom/aggmoread/sdk/z/a/p/a$f;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/json/JSONObject;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/aggmoread/sdk/z/a/p/a$f;",
            ")V"
        }
    .end annotation

    new-instance v0, Lcom/aggmoread/sdk/z/a/p/a$d;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/aggmoread/sdk/z/a/p/a$d;-><init>(Ljava/lang/String;Lorg/json/JSONObject;Ljava/util/Map;Lcom/aggmoread/sdk/z/a/p/a$f;)V

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/m/m;->a(Ljava/lang/Runnable;)V

    return-void
.end method
