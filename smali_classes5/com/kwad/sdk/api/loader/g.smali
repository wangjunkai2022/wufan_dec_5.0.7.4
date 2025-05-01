.class Lcom/kwad/sdk/api/loader/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/sdk/api/loader/g$a;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field private final anC:Lcom/kwad/sdk/api/loader/v;

.field private anD:I

.field private anE:Ljava/lang/String;

.field private final mUrl:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Lcom/kwad/sdk/api/loader/v;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kwad/sdk/api/loader/g;->anC:Lcom/kwad/sdk/api/loader/v;

    .line 3
    invoke-interface {p1}, Lcom/kwad/sdk/api/loader/v;->AU()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/sdk/api/loader/g;->mUrl:Ljava/lang/String;

    .line 4
    iput-object p1, p0, Lcom/kwad/sdk/api/loader/g;->anE:Ljava/lang/String;

    return-void
.end method

.method private static AM()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "Accept-Language"

    const-string v2, "zh-CN"

    .line 2
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "Connection"

    const-string v2, "keep-alive"

    .line 3
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "Charset"

    const-string v2, "UTF-8"

    .line 4
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "Content-Type"

    const-string v2, "application/json; charset=UTF-8"

    .line 5
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    invoke-static {}, Lcom/kwad/sdk/api/core/RequestParamsUtils;->getUserAgent()Ljava/lang/String;

    move-result-object v1

    const-string v2, "User-Agent"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method private static a(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 5

    const/16 v0, 0x400

    new-array v0, v0, [B

    const/4 v1, 0x0

    .line 28
    :try_start_0
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    :goto_0
    :try_start_1
    invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_0

    const/4 v4, 0x0

    .line 30
    invoke-virtual {v2, v0, v4, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 32
    :try_start_2
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    :catch_0
    move-exception p0

    .line 33
    invoke-virtual {p0}, Ljava/io/IOException;->printStackTrace()V

    .line 34
    :goto_1
    :try_start_3
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_2

    :catch_1
    move-exception p0

    .line 35
    invoke-virtual {p0}, Ljava/io/IOException;->printStackTrace()V

    :goto_2
    return-object v0

    :catch_2
    move-exception v0

    goto :goto_3

    :catchall_0
    move-exception v0

    goto :goto_6

    :catch_3
    move-exception v0

    move-object v2, v1

    .line 36
    :goto_3
    :try_start_4
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-eqz p0, :cond_1

    .line 37
    :try_start_5
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    goto :goto_4

    :catch_4
    move-exception p0

    .line 38
    invoke-virtual {p0}, Ljava/io/IOException;->printStackTrace()V

    :cond_1
    :goto_4
    if-eqz v2, :cond_2

    .line 39
    :try_start_6
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    goto :goto_5

    :catch_5
    move-exception p0

    .line 40
    invoke-virtual {p0}, Ljava/io/IOException;->printStackTrace()V

    :cond_2
    :goto_5
    return-object v1

    :catchall_1
    move-exception v0

    move-object v1, v2

    :goto_6
    if-eqz p0, :cond_3

    .line 41
    :try_start_7
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_6

    goto :goto_7

    :catch_6
    move-exception p0

    .line 42
    invoke-virtual {p0}, Ljava/io/IOException;->printStackTrace()V

    :cond_3
    :goto_7
    if-eqz v1, :cond_4

    .line 43
    :try_start_8
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_7

    goto :goto_8

    :catch_7
    move-exception p0

    .line 44
    invoke-virtual {p0}, Ljava/io/IOException;->printStackTrace()V

    .line 45
    :cond_4
    :goto_8
    goto :goto_a

    :goto_9
    throw v0

    :goto_a
    goto :goto_9
.end method

.method private static a(Ljava/net/HttpURLConnection;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/HttpURLConnection;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    if-eqz p0, :cond_0

    .line 46
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 47
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v1, v0}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static cl(Ljava/lang/String;)Ljava/net/HttpURLConnection;
    .locals 2

    .line 1
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p0

    check-cast p0, Ljava/net/HttpURLConnection;

    .line 2
    invoke-static {p0}, Lcom/kwad/sdk/api/core/TLSConnectionUtils;->wrapHttpURLConnection(Ljava/net/URLConnection;)V

    const/16 v0, 0x2710

    .line 3
    invoke-virtual {p0, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    const/16 v0, 0x7530

    .line 4
    invoke-virtual {p0, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, v0}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V

    const/4 v0, 0x1

    .line 6
    invoke-virtual {p0, v0}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    const-string v1, "POST"

    .line 7
    invoke-virtual {p0, v1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 8
    invoke-virtual {p0, v0}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 9
    invoke-virtual {p0, v0}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    return-object p0
.end method

.method private f(Ljava/util/Map;)Ljava/lang/String;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/api/loader/g;->anC:Lcom/kwad/sdk/api/loader/v;

    invoke-interface {v0}, Lcom/kwad/sdk/api/loader/v;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/api/loader/h;->aM(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    iget-object v0, p0, Lcom/kwad/sdk/api/loader/g;->anC:Lcom/kwad/sdk/api/loader/v;

    invoke-interface {v0}, Lcom/kwad/sdk/api/loader/v;->AV()Lcom/kwad/sdk/api/core/IKsAdSDK;

    move-result-object v0

    invoke-interface {v0}, Lcom/kwad/sdk/api/core/IKsAdSDK;->getSDKVersion()Ljava/lang/String;

    move-result-object v0

    .line 4
    :cond_0
    iget-object v1, p0, Lcom/kwad/sdk/api/loader/g;->anC:Lcom/kwad/sdk/api/loader/v;

    invoke-interface {v1}, Lcom/kwad/sdk/api/loader/v;->AV()Lcom/kwad/sdk/api/core/IKsAdSDK;

    move-result-object v1

    invoke-interface {v1}, Lcom/kwad/sdk/api/core/IKsAdSDK;->getSDKVersionCode()I

    move-result v1

    .line 5
    iget-object v2, p0, Lcom/kwad/sdk/api/loader/g;->anC:Lcom/kwad/sdk/api/loader/v;

    invoke-interface {v2}, Lcom/kwad/sdk/api/loader/v;->AV()Lcom/kwad/sdk/api/core/IKsAdSDK;

    move-result-object v2

    invoke-interface {v2}, Lcom/kwad/sdk/api/core/IKsAdSDK;->getAppInfo()Lorg/json/JSONObject;

    move-result-object v2

    .line 6
    iget-object v3, p0, Lcom/kwad/sdk/api/loader/g;->anC:Lcom/kwad/sdk/api/loader/v;

    invoke-interface {v3}, Lcom/kwad/sdk/api/loader/v;->AV()Lcom/kwad/sdk/api/core/IKsAdSDK;

    move-result-object v3

    invoke-interface {v3}, Lcom/kwad/sdk/api/core/IKsAdSDK;->getDeviceInfo()Lorg/json/JSONObject;

    move-result-object v3

    .line 7
    iget-object v4, p0, Lcom/kwad/sdk/api/loader/g;->anC:Lcom/kwad/sdk/api/loader/v;

    invoke-interface {v4}, Lcom/kwad/sdk/api/loader/v;->AV()Lcom/kwad/sdk/api/core/IKsAdSDK;

    move-result-object v4

    invoke-interface {v4}, Lcom/kwad/sdk/api/core/IKsAdSDK;->getNetworkInfo()Lorg/json/JSONObject;

    move-result-object v4

    .line 8
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    const-string v6, "sdkApiVersion"

    const-string v7, "3.3.63"

    .line 9
    invoke-static {v5, v6, v7}, Lcom/kwad/sdk/api/loader/m;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const v6, 0x2e548c

    const-string v8, "sdkApiVersionCode"

    .line 10
    invoke-static {v5, v8, v6}, Lcom/kwad/sdk/api/loader/m;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    const-string v6, "sdkVersion"

    .line 11
    invoke-static {v5, v6, v0}, Lcom/kwad/sdk/api/loader/m;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "SDKVersionCode"

    .line 12
    invoke-static {v5, v0, v1}, Lcom/kwad/sdk/api/loader/m;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    const/4 v0, 0x1

    const-string v1, "sdkType"

    .line 13
    invoke-static {v5, v1, v0}, Lcom/kwad/sdk/api/loader/m;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    const-string v0, "appInfo"

    .line 14
    invoke-static {v5, v0, v2}, Lcom/kwad/sdk/api/loader/m;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONObject;)V

    const-string v0, "deviceInfo"

    .line 15
    invoke-static {v5, v0, v3}, Lcom/kwad/sdk/api/loader/m;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONObject;)V

    const-string v0, "networkInfo"

    .line 16
    invoke-static {v5, v0, v4}, Lcom/kwad/sdk/api/loader/m;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 17
    invoke-static {}, Lcom/kwad/sdk/api/loader/w;->yp()Ljava/lang/String;

    move-result-object v0

    const-string v1, "sdkAbi"

    invoke-static {v5, v1, v0}, Lcom/kwad/sdk/api/loader/m;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    .line 19
    iget-object v1, p0, Lcom/kwad/sdk/api/loader/g;->anC:Lcom/kwad/sdk/api/loader/v;

    invoke-interface {v1}, Lcom/kwad/sdk/api/loader/v;->AV()Lcom/kwad/sdk/api/core/IKsAdSDK;

    move-result-object v1

    invoke-interface {v1, p1}, Lcom/kwad/sdk/api/core/IKsAdSDK;->addHp(Ljava/util/Map;)V

    .line 20
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v3, "version"

    .line 21
    invoke-static {v1, v3, v7}, Lcom/kwad/sdk/api/loader/m;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "appId"

    .line 22
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v3, v2}, Lcom/kwad/sdk/api/loader/m;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    iget-object v2, p0, Lcom/kwad/sdk/api/loader/g;->anC:Lcom/kwad/sdk/api/loader/v;

    invoke-interface {v2}, Lcom/kwad/sdk/api/loader/v;->AV()Lcom/kwad/sdk/api/core/IKsAdSDK;

    move-result-object v2

    invoke-interface {v2, v0}, Lcom/kwad/sdk/api/core/IKsAdSDK;->getRM(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "message"

    invoke-static {v1, v2, v0}, Lcom/kwad/sdk/api/loader/m;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    iget-object v0, p0, Lcom/kwad/sdk/api/loader/g;->anC:Lcom/kwad/sdk/api/loader/v;

    invoke-interface {v0}, Lcom/kwad/sdk/api/loader/v;->AV()Lcom/kwad/sdk/api/core/IKsAdSDK;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/sdk/api/loader/g;->mUrl:Ljava/lang/String;

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v2, p1, v3}, Lcom/kwad/sdk/api/core/IKsAdSDK;->sR(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    .line 25
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final a(Lcom/kwad/sdk/api/loader/g$a;)V
    .locals 6

    const-string v0, "data"

    const/4 v1, 0x0

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/api/loader/g;->AM()Ljava/util/Map;

    move-result-object v2

    .line 2
    invoke-direct {p0, v2}, Lcom/kwad/sdk/api/loader/g;->f(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v3

    .line 3
    iget-object v4, p0, Lcom/kwad/sdk/api/loader/g;->anE:Ljava/lang/String;

    invoke-static {v4}, Lcom/kwad/sdk/api/loader/g;->cl(Ljava/lang/String;)Ljava/net/HttpURLConnection;

    move-result-object v1

    .line 4
    invoke-static {v1, v2}, Lcom/kwad/sdk/api/loader/g;->a(Ljava/net/HttpURLConnection;Ljava/util/Map;)V

    .line 5
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->connect()V

    .line 6
    new-instance v2, Ljava/io/DataOutputStream;

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v4

    invoke-direct {v2, v4}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 7
    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/io/DataOutputStream;->write([B)V

    .line 8
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v2

    const/16 v3, 0xc8

    if-ne v2, v3, :cond_1

    .line 9
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    invoke-static {v2}, Lcom/kwad/sdk/api/loader/g;->a(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v2

    .line 10
    new-instance v3, Lcom/kwad/sdk/api/loader/a$b;

    invoke-direct {v3}, Lcom/kwad/sdk/api/loader/a$b;-><init>()V

    .line 11
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 12
    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 13
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_0

    const-string v5, "null"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 14
    iget-object v5, p0, Lcom/kwad/sdk/api/loader/g;->anC:Lcom/kwad/sdk/api/loader/v;

    invoke-interface {v5}, Lcom/kwad/sdk/api/loader/v;->AV()Lcom/kwad/sdk/api/core/IKsAdSDK;

    move-result-object v5

    invoke-interface {v5, v2}, Lcom/kwad/sdk/api/core/IKsAdSDK;->getRD(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 15
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 16
    :cond_0
    invoke-virtual {v3, v4}, Lcom/kwad/sdk/api/loader/a$b;->parseJson(Lorg/json/JSONObject;)V

    .line 17
    invoke-interface {p1, v3}, Lcom/kwad/sdk/api/loader/g$a;->a(Lcom/kwad/sdk/api/loader/a$b;)V

    goto :goto_0

    .line 18
    :cond_1
    div-int/lit8 v0, v2, 0x64

    const/4 v3, 0x3

    if-ne v0, v3, :cond_3

    .line 19
    iget v0, p0, Lcom/kwad/sdk/api/loader/g;->anD:I

    const/16 v2, 0x15

    if-ge v0, v2, :cond_2

    const-string v0, "Location"

    .line 20
    invoke-virtual {v1, v0}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/api/loader/g;->anE:Ljava/lang/String;

    .line 21
    iget v0, p0, Lcom/kwad/sdk/api/loader/g;->anD:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/kwad/sdk/api/loader/g;->anD:I

    .line 22
    invoke-virtual {p0, p1}, Lcom/kwad/sdk/api/loader/g;->a(Lcom/kwad/sdk/api/loader/g$a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    :cond_2
    :goto_0
    :try_start_1
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return-void

    .line 24
    :cond_3
    :try_start_2
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "response code = "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catch_1
    nop

    goto :goto_1

    :catchall_0
    move-exception p1

    if-eqz v1, :cond_4

    .line 25
    :try_start_3
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 26
    :catch_2
    :cond_4
    throw p1

    :goto_1
    if-eqz v1, :cond_5

    .line 27
    :try_start_4
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    :catch_3
    :cond_5
    return-void
.end method
