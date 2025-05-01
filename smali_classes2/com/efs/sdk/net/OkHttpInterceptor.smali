.class public Lcom/efs/sdk/net/OkHttpInterceptor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Interceptor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/efs/sdk/net/OkHttpInterceptor$a;,
        Lcom/efs/sdk/net/OkHttpInterceptor$c;,
        Lcom/efs/sdk/net/OkHttpInterceptor$b;
    }
.end annotation


# instance fields
.field private final a:Lcom/efs/sdk/net/a/a/f;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Lcom/efs/sdk/net/a/a/g;->c()Lcom/efs/sdk/net/a/a/g;

    move-result-object v0

    iput-object v0, p0, Lcom/efs/sdk/net/OkHttpInterceptor;->a:Lcom/efs/sdk/net/a/a/f;

    return-void
.end method


# virtual methods
.method public intercept(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;
    .locals 9

    const-string v0, "NetTrace-Interceptor"

    .line 1
    invoke-interface {p1}, Lokhttp3/Interceptor$Chain;->request()Lokhttp3/Request;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :try_start_0
    const-string v4, "begin intercept"

    .line 2
    invoke-static {v0, v4}, Lcom/efs/sdk/base/core/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    invoke-static {}, Lcom/efs/sdk/net/NetManager;->getNetConfigManager()Lcom/efs/sdk/net/NetConfigManager;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 4
    invoke-static {}, Lcom/efs/sdk/net/NetManager;->getNetConfigManager()Lcom/efs/sdk/net/NetConfigManager;

    move-result-object v4

    invoke-virtual {v4}, Lcom/efs/sdk/net/NetConfigManager;->enableTracer()Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    :cond_0
    if-nez v3, :cond_2

    .line 5
    :try_start_1
    invoke-static {}, Lcom/efs/sdk/base/integrationtesting/IntegrationTestingUtil;->isIntegrationTestingInPeriod()Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_1
    const-string v4, "net enable is false~"

    .line 6
    invoke-static {v0, v4}, Lcom/efs/sdk/base/core/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    move-object v0, v2

    move-object v4, v0

    goto/16 :goto_3

    :catchall_0
    move-exception v0

    move-object v5, v2

    move v4, v3

    move-object v3, v5

    goto/16 :goto_2

    :cond_2
    :goto_0
    if-eqz v1, :cond_3

    .line 7
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "intercept request is "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lokhttp3/Request;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lcom/efs/sdk/base/core/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    const-string v4, "intercept request is null~"

    .line 8
    invoke-static {v0, v4}, Lcom/efs/sdk/base/core/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    :goto_1
    iget-object v4, p0, Lcom/efs/sdk/net/OkHttpInterceptor;->a:Lcom/efs/sdk/net/a/a/f;

    invoke-interface {v4}, Lcom/efs/sdk/net/a/a/f;->b()Ljava/lang/String;

    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    const-string v5, "intercept request id is "

    .line 10
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v0, v5}, Lcom/efs/sdk/base/core/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    invoke-static {}, Lcom/efs/sdk/net/a/a;->a()Lcom/efs/sdk/net/a/a;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/efs/sdk/net/a/a;->a(Ljava/lang/String;)Lcom/efs/sdk/net/a/c;

    move-result-object v0

    .line 12
    invoke-virtual {v1}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v5

    invoke-virtual {v5}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    move-result-object v5

    .line 13
    iput-object v5, v0, Lcom/efs/sdk/net/a/c;->c:Ljava/lang/String;

    .line 14
    new-instance v0, Lcom/efs/sdk/net/a/a/h;

    iget-object v5, p0, Lcom/efs/sdk/net/OkHttpInterceptor;->a:Lcom/efs/sdk/net/a/a/f;

    invoke-direct {v0, v5, v4}, Lcom/efs/sdk/net/a/a/h;-><init>(Lcom/efs/sdk/net/a/a/f;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 15
    :try_start_3
    new-instance v5, Lcom/efs/sdk/net/OkHttpInterceptor$b;

    invoke-direct {v5, v4, v1, v0}, Lcom/efs/sdk/net/OkHttpInterceptor$b;-><init>(Ljava/lang/String;Lokhttp3/Request;Lcom/efs/sdk/net/a/a/h;)V

    .line 16
    iget-object v6, p0, Lcom/efs/sdk/net/OkHttpInterceptor;->a:Lcom/efs/sdk/net/a/a/f;

    invoke-interface {v6, v5}, Lcom/efs/sdk/net/a/a/f;->a(Lcom/efs/sdk/net/a/a/f$b;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v5

    move v8, v3

    move-object v3, v0

    move-object v0, v5

    move-object v5, v4

    move v4, v8

    goto :goto_2

    :catchall_2
    move-exception v0

    move-object v5, v4

    move v4, v3

    move-object v3, v2

    goto :goto_2

    :catchall_3
    move-exception v0

    move-object v3, v2

    move-object v5, v3

    const/4 v4, 0x0

    .line 17
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    move-object v0, v3

    move v3, v4

    move-object v4, v5

    .line 18
    :goto_3
    invoke-interface {p1, v1}, Lokhttp3/Interceptor$Chain;->proceed(Lokhttp3/Request;)Lokhttp3/Response;

    move-result-object v5

    if-nez v3, :cond_4

    .line 19
    :try_start_4
    invoke-static {}, Lcom/efs/sdk/base/integrationtesting/IntegrationTestingUtil;->isIntegrationTestingInPeriod()Z

    move-result v3

    if-eqz v3, :cond_9

    goto :goto_4

    :catchall_4
    move-exception p1

    goto :goto_6

    :cond_4
    :goto_4
    if-eqz v0, :cond_5

    .line 20
    invoke-virtual {v0}, Lcom/efs/sdk/net/a/a/h;->a()Z

    move-result v3

    if-eqz v3, :cond_5

    .line 21
    invoke-virtual {v0}, Lcom/efs/sdk/net/a/a/h;->b()V

    .line 22
    iget-object v3, v0, Lcom/efs/sdk/net/a/a/h;->a:Lcom/efs/sdk/net/a/a/f;

    iget-object v0, v0, Lcom/efs/sdk/net/a/a/h;->b:Ljava/io/ByteArrayOutputStream;

    .line 23
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I

    .line 24
    invoke-interface {v3}, Lcom/efs/sdk/net/a/a/f;->a()V

    .line 25
    :cond_5
    invoke-interface {p1}, Lokhttp3/Interceptor$Chain;->connection()Lokhttp3/Connection;

    move-result-object p1

    if-eqz p1, :cond_8

    .line 26
    iget-object v0, p0, Lcom/efs/sdk/net/OkHttpInterceptor;->a:Lcom/efs/sdk/net/a/a/f;

    new-instance v3, Lcom/efs/sdk/net/OkHttpInterceptor$c;

    invoke-direct {v3, v4, v1, v5, p1}, Lcom/efs/sdk/net/OkHttpInterceptor$c;-><init>(Ljava/lang/String;Lokhttp3/Request;Lokhttp3/Response;Lokhttp3/Connection;)V

    invoke-interface {v0, v3}, Lcom/efs/sdk/net/a/a/f;->a(Lcom/efs/sdk/net/a/a/f$d;)V

    .line 27
    invoke-virtual {v5}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object p1

    if-eqz p1, :cond_6

    .line 28
    invoke-virtual {p1}, Lokhttp3/ResponseBody;->contentType()Lokhttp3/MediaType;

    move-result-object v0

    .line 29
    invoke-virtual {p1}, Lokhttp3/ResponseBody;->byteStream()Ljava/io/InputStream;

    move-result-object v1

    goto :goto_5

    :cond_6
    move-object v0, v2

    move-object v1, v0

    .line 30
    :goto_5
    iget-object v3, p0, Lcom/efs/sdk/net/OkHttpInterceptor;->a:Lcom/efs/sdk/net/a/a/f;

    if-eqz v0, :cond_7

    .line 31
    invoke-virtual {v0}, Lokhttp3/MediaType;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_7
    const-string v0, "Content-Encoding"

    .line 32
    invoke-virtual {v5, v0}, Lokhttp3/Response;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v6, Lcom/efs/sdk/net/a/a/c;

    iget-object v7, p0, Lcom/efs/sdk/net/OkHttpInterceptor;->a:Lcom/efs/sdk/net/a/a/f;

    invoke-direct {v6, v7, v4}, Lcom/efs/sdk/net/a/a/c;-><init>(Lcom/efs/sdk/net/a/a/f;Ljava/lang/String;)V

    .line 33
    invoke-interface {v3, v4, v2, v0, v1}, Lcom/efs/sdk/net/a/a/f;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 34
    invoke-virtual {v5}, Lokhttp3/Response;->newBuilder()Lokhttp3/Response$Builder;

    move-result-object v1

    new-instance v2, Lcom/efs/sdk/net/OkHttpInterceptor$a;

    invoke-direct {v2, p1, v0}, Lcom/efs/sdk/net/OkHttpInterceptor$a;-><init>(Lokhttp3/ResponseBody;Ljava/io/InputStream;)V

    .line 35
    invoke-virtual {v1, v2}, Lokhttp3/Response$Builder;->body(Lokhttp3/ResponseBody;)Lokhttp3/Response$Builder;

    move-result-object p1

    .line 36
    invoke-virtual {p1}, Lokhttp3/Response$Builder;->build()Lokhttp3/Response;

    move-result-object p1

    move-object v5, p1

    goto :goto_7

    .line 37
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "No connection associated with this request; did you use addInterceptor instead of addNetworkInterceptor?"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 38
    :goto_6
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_9
    :goto_7
    return-object v5
.end method
