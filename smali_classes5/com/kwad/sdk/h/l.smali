.class Lcom/kwad/sdk/h/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/sdk/h/l$a;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static aKJ:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 1

    .line 64
    :try_start_0
    invoke-static {p0}, Lcom/kwad/sdk/h/l;->c(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    invoke-static {p0}, Lcom/kwad/sdk/h/j;->closeQuietly(Ljava/io/Closeable;)V

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_0

    .line 66
    :catch_0
    :try_start_1
    invoke-static {}, Lcom/kwad/sdk/h/j;->JX()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    invoke-static {p0}, Lcom/kwad/sdk/h/j;->closeQuietly(Ljava/io/Closeable;)V

    const/4 p0, 0x0

    return-object p0

    :goto_0
    invoke-static {p0}, Lcom/kwad/sdk/h/j;->closeQuietly(Ljava/io/Closeable;)V

    .line 68
    throw v0
.end method

.method private static a(Ljava/io/Reader;)Ljava/lang/String;
    .locals 5

    .line 54
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 55
    :try_start_0
    new-instance v1, Ljava/io/StringWriter;

    invoke-direct {v1}, Ljava/io/StringWriter;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/16 v0, 0x400

    :try_start_1
    new-array v0, v0, [C

    .line 56
    :goto_0
    invoke-virtual {p0, v0}, Ljava/io/Reader;->read([C)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    const/4 v3, 0x0

    .line 57
    invoke-virtual {v1, v0, v3, v2}, Ljava/io/StringWriter;->write([CII)V

    goto :goto_0

    .line 58
    :cond_0
    invoke-virtual {v1}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    invoke-static {p0}, Lcom/kwad/sdk/h/j;->closeQuietly(Ljava/io/Closeable;)V

    .line 60
    invoke-static {v1}, Lcom/kwad/sdk/h/j;->closeQuietly(Ljava/io/Closeable;)V

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catchall_1
    move-exception v1

    move-object v4, v1

    move-object v1, v0

    move-object v0, v4

    .line 61
    :goto_1
    invoke-static {p0}, Lcom/kwad/sdk/h/j;->closeQuietly(Ljava/io/Closeable;)V

    .line 62
    invoke-static {v1}, Lcom/kwad/sdk/h/j;->closeQuietly(Ljava/io/Closeable;)V

    .line 63
    goto :goto_3

    :goto_2
    throw v0

    :goto_3
    goto :goto_2
.end method

.method private static a(Ljava/util/Map;Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lorg/json/JSONObject;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 9
    invoke-static {}, Lcom/kwad/sdk/h/h;->JN()Lcom/kwad/sdk/h/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/sdk/h/h;->JR()Lcom/kwad/sdk/h/g;

    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/kwad/sdk/h/g;->JK()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 11
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 12
    :cond_0
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/kwad/sdk/h/l;->c(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static a(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/kwad/sdk/h/l$a;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/kwad/sdk/h/l$a;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 13
    :try_start_0
    new-instance v2, Ljava/net/URL;

    invoke-direct {v2, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 14
    invoke-virtual {v2}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p0

    check-cast p0, Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 15
    :try_start_1
    invoke-virtual {p0, v1}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    .line 16
    invoke-virtual {p0, v1}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    const-string v2, "POST"

    .line 17
    invoke-virtual {p0, v2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    const-string v2, "Content-Type"

    const-string v3, "application/json"

    .line 18
    invoke-virtual {p0, v2, v3}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x2710

    .line 19
    invoke-virtual {p0, v2}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    const/16 v2, 0x7530

    .line 20
    invoke-virtual {p0, v2}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    const/4 v2, 0x0

    .line 21
    invoke-virtual {p0, v2}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V

    .line 22
    invoke-static {p0, p1}, Lcom/kwad/sdk/h/l;->a(Ljava/net/HttpURLConnection;Ljava/util/Map;)V

    .line 23
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->connect()V

    .line 24
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 25
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    .line 26
    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V

    .line 27
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    .line 28
    :cond_0
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result p1

    const/16 p2, 0xc8

    if-ne p1, p2, :cond_3

    .line 29
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p1

    .line 30
    invoke-static {p1}, Lcom/kwad/sdk/h/l;->a(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object p1

    .line 31
    invoke-static {}, Lcom/kwad/sdk/h/j;->JY()V

    .line 32
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_2

    .line 33
    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p1, "result"

    .line 34
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p1

    if-ne p1, v1, :cond_1

    .line 35
    sput v2, Lcom/kwad/sdk/h/l;->aKJ:I

    .line 36
    invoke-interface {p3}, Lcom/kwad/sdk/h/l$a;->onSuccess()V

    goto :goto_0

    .line 37
    :cond_1
    sget p1, Lcom/kwad/sdk/h/l;->aKJ:I

    add-int/2addr p1, v1

    sput p1, Lcom/kwad/sdk/h/l;->aKJ:I

    .line 38
    invoke-static {}, Lcom/kwad/sdk/h/j;->JY()V

    goto :goto_0

    .line 39
    :cond_2
    sget p1, Lcom/kwad/sdk/h/l;->aKJ:I

    add-int/2addr p1, v1

    sput p1, Lcom/kwad/sdk/h/l;->aKJ:I

    .line 40
    invoke-static {}, Lcom/kwad/sdk/h/j;->JY()V

    goto :goto_0

    .line 41
    :cond_3
    sget p1, Lcom/kwad/sdk/h/l;->aKJ:I

    add-int/2addr p1, v1

    sput p1, Lcom/kwad/sdk/h/l;->aKJ:I

    .line 42
    invoke-static {}, Lcom/kwad/sdk/h/j;->JY()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    :goto_0
    invoke-static {p0}, Lcom/kwad/sdk/h/j;->a(Ljava/net/URLConnection;)V

    .line 44
    invoke-static {v0}, Lcom/kwad/sdk/h/j;->closeQuietly(Ljava/io/Closeable;)V

    return-void

    :catchall_0
    move-exception p1

    move-object v4, v0

    move-object v0, p0

    move-object p0, v4

    goto :goto_2

    :catch_0
    move-object v4, v0

    move-object v0, p0

    move-object p0, v4

    goto :goto_1

    :catchall_1
    move-exception p1

    move-object p0, v0

    goto :goto_2

    :catch_1
    move-object p0, v0

    .line 45
    :goto_1
    :try_start_2
    sget p1, Lcom/kwad/sdk/h/l;->aKJ:I

    add-int/2addr p1, v1

    sput p1, Lcom/kwad/sdk/h/l;->aKJ:I

    .line 46
    invoke-static {}, Lcom/kwad/sdk/h/j;->JX()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 47
    invoke-static {v0}, Lcom/kwad/sdk/h/j;->a(Ljava/net/URLConnection;)V

    .line 48
    invoke-static {p0}, Lcom/kwad/sdk/h/j;->closeQuietly(Ljava/io/Closeable;)V

    return-void

    :catchall_2
    move-exception p1

    .line 49
    :goto_2
    invoke-static {v0}, Lcom/kwad/sdk/h/j;->a(Ljava/net/URLConnection;)V

    .line 50
    invoke-static {p0}, Lcom/kwad/sdk/h/j;->closeQuietly(Ljava/io/Closeable;)V

    .line 51
    throw p1
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

    .line 52
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

    .line 53
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

.method public static a(Ljava/util/List;Lcom/kwad/sdk/h/l$a;)V
    .locals 5
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kwad/sdk/h/k;",
            ">;",
            "Lcom/kwad/sdk/h/l$a;",
            ")V"
        }
    .end annotation

    .line 1
    sget v0, Lcom/kwad/sdk/h/l;->aKJ:I

    const/16 v1, 0xa

    if-le v0, v1, :cond_0

    const-string p0, "LogReportUtil"

    const-string p1, "request error"

    .line 2
    invoke-static {p0, p1}, Lcom/kwad/sdk/h/j;->ak(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/h/h;->JN()Lcom/kwad/sdk/h/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/sdk/h/h;->JR()Lcom/kwad/sdk/h/g;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Lcom/kwad/sdk/h/g;->getRequestHeader()Ljava/util/Map;

    move-result-object v1

    .line 5
    invoke-virtual {v0}, Lcom/kwad/sdk/h/g;->JM()Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "actionList"

    .line 6
    invoke-static {v2, v3, p0}, Lcom/kwad/sdk/h/c;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/util/List;)V

    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    const-string p0, "timestamp"

    invoke-static {v2, p0, v3, v4}, Lcom/kwad/sdk/h/c;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 8
    invoke-virtual {v0}, Lcom/kwad/sdk/h/g;->JL()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, v2}, Lcom/kwad/sdk/h/l;->a(Ljava/util/Map;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v1, v0, p1}, Lcom/kwad/sdk/h/l;->a(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/kwad/sdk/h/l$a;)V

    return-void
.end method

.method private static c(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    .line 8
    :try_start_0
    new-instance v1, Ljava/io/InputStreamReader;

    invoke-direct {v1, p0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 9
    :try_start_1
    new-instance p0, Ljava/io/BufferedReader;

    const/16 v2, 0x400

    invoke-direct {p0, v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 10
    :try_start_2
    invoke-static {p0}, Lcom/kwad/sdk/h/l;->a(Ljava/io/Reader;)Ljava/lang/String;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 11
    invoke-static {p0}, Lcom/kwad/sdk/h/j;->closeQuietly(Ljava/io/Closeable;)V

    .line 12
    invoke-static {v1}, Lcom/kwad/sdk/h/j;->closeQuietly(Ljava/io/Closeable;)V

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception p0

    move-object v3, v0

    move-object v0, p0

    move-object p0, v3

    goto :goto_0

    :catchall_2
    move-exception p0

    move-object v1, v0

    move-object v0, p0

    move-object p0, v1

    .line 13
    :goto_0
    invoke-static {p0}, Lcom/kwad/sdk/h/j;->closeQuietly(Ljava/io/Closeable;)V

    .line 14
    invoke-static {v1}, Lcom/kwad/sdk/h/j;->closeQuietly(Ljava/io/Closeable;)V

    .line 15
    throw v0
.end method

.method private static c(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/kwad/sdk/h/h;->JN()Lcom/kwad/sdk/h/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/sdk/h/h;->JR()Lcom/kwad/sdk/h/g;

    move-result-object v0

    .line 2
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 3
    invoke-virtual {v0}, Lcom/kwad/sdk/h/g;->getSdkVersion()Ljava/lang/String;

    move-result-object v2

    const-string v3, "version"

    invoke-static {v1, v3, v2}, Lcom/kwad/sdk/h/c;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    invoke-virtual {v0}, Lcom/kwad/sdk/h/g;->getAppId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "appId"

    invoke-static {v1, v3, v2}, Lcom/kwad/sdk/h/c;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    invoke-static {p1}, Lcom/kwad/sdk/h/a;->am(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "message"

    invoke-static {v1, v2, p1}, Lcom/kwad/sdk/h/c;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    invoke-virtual {v0}, Lcom/kwad/sdk/h/g;->JL()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, p0, v0}, Lcom/kwad/sdk/h/a;->a(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    .line 7
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
