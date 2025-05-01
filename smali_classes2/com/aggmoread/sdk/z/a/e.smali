.class public Lcom/aggmoread/sdk/z/a/e;
.super Lcom/aggmoread/sdk/z/a/b;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/a/c;


# instance fields
.field final a:Lorg/json/JSONObject;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/b;-><init>()V

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/e;->a:Lorg/json/JSONObject;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/aggmoread/sdk/z/a/c;)Lcom/aggmoread/sdk/z/a/c;
    .locals 0

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/a/c;->a()Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/aggmoread/sdk/z/a/e;->a(Lorg/json/JSONObject;)Lcom/aggmoread/sdk/z/a/c;

    move-result-object p1

    return-object p1
.end method

.method public a(Lorg/json/JSONObject;)Lcom/aggmoread/sdk/z/a/c;
    .locals 4

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    :try_start_0
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/aggmoread/sdk/z/a/e;->a:Lorg/json/JSONObject;

    invoke-virtual {v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const-string v1, "PATAG"

    const-string v3, "ERR %s"

    invoke-static {v1, v3, v2}, Lcom/aggmoread/sdk/z/a/d;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public a()Lorg/json/JSONObject;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/e;->a:Lorg/json/JSONObject;

    return-object v0
.end method
