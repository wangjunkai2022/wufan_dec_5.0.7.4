.class public final Lcom/kwad/sdk/core/network/idc/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;Lcom/kwad/sdk/core/network/idc/a/b;)V
    .locals 2

    if-nez p1, :cond_0

    const-string p1, ""

    goto :goto_0

    .line 1
    :cond_0
    invoke-virtual {p1}, Lcom/kwad/sdk/core/network/idc/a/b;->toJson()Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    const-string v0, "ksadsdk_idc"

    const-string v1, "idc_data"

    .line 2
    invoke-static {p0, v0, v1, p1}, Lcom/kwad/sdk/utils/y;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 3
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 5
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, ""

    :goto_0
    const-string v0, "ksadsdk_idc"

    const-string v1, "idc_current"

    .line 6
    invoke-static {p0, v0, v1, p1}, Lcom/kwad/sdk/utils/y;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static bm(Landroid/content/Context;)Lcom/kwad/sdk/core/network/idc/a/b;
    .locals 1

    :try_start_0
    const-string v0, "ksad_idc.json"

    .line 1
    invoke-static {p0, v0}, Lcom/kwad/sdk/crash/utils/h;->K(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 2
    invoke-static {p0}, Lcom/kwad/sdk/core/network/idc/a/b;->eg(Ljava/lang/String;)Lcom/kwad/sdk/core/network/idc/a/b;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 3
    invoke-static {p0}, Lcom/kwad/sdk/core/e/c;->printStackTraceOnly(Ljava/lang/Throwable;)V

    .line 4
    new-instance p0, Lcom/kwad/sdk/core/network/idc/a/b;

    invoke-direct {p0}, Lcom/kwad/sdk/core/network/idc/a/b;-><init>()V

    return-object p0
.end method

.method public static bn(Landroid/content/Context;)Lcom/kwad/sdk/core/network/idc/a/b;
    .locals 3

    const-string v0, "ksadsdk_idc"

    const-string v1, "idc_data"

    const-string v2, ""

    .line 1
    invoke-static {p0, v0, v1, v2}, Lcom/kwad/sdk/utils/y;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 2
    invoke-static {p0}, Lcom/kwad/sdk/core/network/idc/a/b;->eg(Ljava/lang/String;)Lcom/kwad/sdk/core/network/idc/a/b;

    move-result-object p0

    return-object p0
.end method

.method public static bo(Landroid/content/Context;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "ksadsdk_idc"

    const-string v1, "idc_current"

    const-string v2, ""

    .line 1
    invoke-static {p0, v0, v1, v2}, Lcom/kwad/sdk/utils/y;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 2
    invoke-static {p0}, Lcom/kwad/sdk/utils/t;->parseJSON2MapString(Ljava/lang/String;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method
