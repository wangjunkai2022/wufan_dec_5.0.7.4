.class public final Lcom/kwad/sdk/core/videocache/j;
.super Lcom/kwad/sdk/core/videocache/p;
.source "SourceFile"


# instance fields
.field private final aCW:Lcom/kwad/sdk/core/videocache/d/c;

.field private final aCX:Lcom/kwad/sdk/core/videocache/b/b;

.field private aDB:Lokhttp3/OkHttpClient;

.field private aDu:Lcom/kwad/sdk/core/videocache/n;

.field private aDw:Ljava/io/InputStream;


# direct methods
.method public constructor <init>(Lcom/kwad/sdk/core/videocache/j;)V
    .locals 1

    .line 7
    invoke-direct {p0}, Lcom/kwad/sdk/core/videocache/p;-><init>()V

    .line 8
    new-instance v0, Lokhttp3/OkHttpClient;

    invoke-direct {v0}, Lokhttp3/OkHttpClient;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/core/videocache/j;->aDB:Lokhttp3/OkHttpClient;

    .line 9
    iget-object v0, p1, Lcom/kwad/sdk/core/videocache/j;->aDu:Lcom/kwad/sdk/core/videocache/n;

    iput-object v0, p0, Lcom/kwad/sdk/core/videocache/j;->aDu:Lcom/kwad/sdk/core/videocache/n;

    .line 10
    iget-object v0, p1, Lcom/kwad/sdk/core/videocache/j;->aCW:Lcom/kwad/sdk/core/videocache/d/c;

    iput-object v0, p0, Lcom/kwad/sdk/core/videocache/j;->aCW:Lcom/kwad/sdk/core/videocache/d/c;

    .line 11
    iget-object p1, p1, Lcom/kwad/sdk/core/videocache/j;->aCX:Lcom/kwad/sdk/core/videocache/b/b;

    iput-object p1, p0, Lcom/kwad/sdk/core/videocache/j;->aCX:Lcom/kwad/sdk/core/videocache/b/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/kwad/sdk/core/videocache/d/c;Lcom/kwad/sdk/core/videocache/b/b;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/videocache/p;-><init>()V

    .line 2
    new-instance v0, Lokhttp3/OkHttpClient;

    invoke-direct {v0}, Lokhttp3/OkHttpClient;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/core/videocache/j;->aDB:Lokhttp3/OkHttpClient;

    .line 3
    invoke-static {p2}, Lcom/kwad/sdk/utils/aq;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/core/videocache/d/c;

    iput-object v0, p0, Lcom/kwad/sdk/core/videocache/j;->aCW:Lcom/kwad/sdk/core/videocache/d/c;

    .line 4
    invoke-static {p3}, Lcom/kwad/sdk/utils/aq;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/kwad/sdk/core/videocache/b/b;

    iput-object p3, p0, Lcom/kwad/sdk/core/videocache/j;->aCX:Lcom/kwad/sdk/core/videocache/b/b;

    .line 5
    invoke-interface {p2, p1}, Lcom/kwad/sdk/core/videocache/d/c;->eT(Ljava/lang/String;)Lcom/kwad/sdk/core/videocache/n;

    move-result-object p2

    if-eqz p2, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    new-instance p2, Lcom/kwad/sdk/core/videocache/n;

    const-wide/32 v0, -0x80000000

    invoke-static {p1}, Lcom/kwad/sdk/core/videocache/l;->eR(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p1, v0, v1, p3}, Lcom/kwad/sdk/core/videocache/n;-><init>(Ljava/lang/String;JLjava/lang/String;)V

    :goto_0
    iput-object p2, p0, Lcom/kwad/sdk/core/videocache/j;->aDu:Lcom/kwad/sdk/core/videocache/n;

    return-void
.end method

.method private Hh()V
    .locals 7

    const-string v0, "HttpUrlSource"

    const/16 v1, 0x2710

    const/4 v2, 0x0

    .line 1
    :try_start_0
    invoke-direct {p0, v1}, Lcom/kwad/sdk/core/videocache/j;->du(I)Lokhttp3/Response;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 2
    invoke-virtual {v2}, Lokhttp3/Response;->isSuccessful()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-static {v2}, Lcom/kwad/sdk/core/videocache/j;->c(Lokhttp3/Response;)J

    move-result-wide v3

    const-string v1, "Content-Type"

    .line 4
    invoke-virtual {v2, v1}, Lokhttp3/Response;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 5
    new-instance v5, Lcom/kwad/sdk/core/videocache/n;

    iget-object v6, p0, Lcom/kwad/sdk/core/videocache/j;->aDu:Lcom/kwad/sdk/core/videocache/n;

    iget-object v6, v6, Lcom/kwad/sdk/core/videocache/n;->url:Ljava/lang/String;

    invoke-direct {v5, v6, v3, v4, v1}, Lcom/kwad/sdk/core/videocache/n;-><init>(Ljava/lang/String;JLjava/lang/String;)V

    iput-object v5, p0, Lcom/kwad/sdk/core/videocache/j;->aDu:Lcom/kwad/sdk/core/videocache/n;

    .line 6
    iget-object v1, p0, Lcom/kwad/sdk/core/videocache/j;->aCW:Lcom/kwad/sdk/core/videocache/d/c;

    iget-object v3, v5, Lcom/kwad/sdk/core/videocache/n;->url:Ljava/lang/String;

    invoke-interface {v1, v3, v5}, Lcom/kwad/sdk/core/videocache/d/c;->a(Ljava/lang/String;Lcom/kwad/sdk/core/videocache/n;)V

    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Source info fetched: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/kwad/sdk/core/videocache/j;->aDu:Lcom/kwad/sdk/core/videocache/n;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    invoke-virtual {v2}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 9
    :goto_0
    invoke-virtual {v2}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/crash/utils/b;->closeQuietly(Ljava/io/Closeable;)V

    return-void

    .line 10
    :cond_0
    :try_start_1
    new-instance v1, Lcom/kwad/sdk/core/videocache/ProxyCacheException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Fail to fetchContentInfo: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/kwad/sdk/core/videocache/j;->getUrl()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Lcom/kwad/sdk/core/videocache/ProxyCacheException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    goto :goto_1

    .line 11
    :catch_0
    :try_start_2
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Error fetching info from "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/kwad/sdk/core/videocache/j;->aDu:Lcom/kwad/sdk/core/videocache/n;

    iget-object v3, v3, Lcom/kwad/sdk/core/videocache/n;->url:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v2, :cond_1

    .line 12
    invoke-virtual {v2}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    return-void

    :goto_1
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 13
    invoke-virtual {v2}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/crash/utils/b;->closeQuietly(Ljava/io/Closeable;)V

    .line 14
    :cond_2
    goto :goto_3

    :goto_2
    throw v0

    :goto_3
    goto :goto_2
.end method

.method private Hj()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/videocache/j;->aCW:Lcom/kwad/sdk/core/videocache/d/c;

    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/kwad/sdk/core/videocache/d/b;

    if-eqz v1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/kwad/sdk/core/videocache/j;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/kwad/sdk/core/videocache/d/c;->eT(Ljava/lang/String;)Lcom/kwad/sdk/core/videocache/n;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v1, v0, Lcom/kwad/sdk/core/videocache/n;->aDL:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-wide v1, v0, Lcom/kwad/sdk/core/videocache/n;->aDK:J

    const-wide/32 v3, -0x80000000

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    .line 4
    iput-object v0, p0, Lcom/kwad/sdk/core/videocache/j;->aDu:Lcom/kwad/sdk/core/videocache/n;

    :cond_0
    return-void
.end method

.method private a(Lokhttp3/Response;J)J
    .locals 3

    .line 1
    invoke-virtual {p1}, Lokhttp3/Response;->code()I

    move-result v0

    .line 2
    invoke-virtual {p1}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object p1

    invoke-virtual {p1}, Lokhttp3/ResponseBody;->contentLength()J

    move-result-wide v1

    const/16 p1, 0xc8

    if-ne v0, p1, :cond_0

    return-wide v1

    :cond_0
    const/16 p1, 0xce

    if-ne v0, p1, :cond_1

    add-long/2addr v1, p2

    return-wide v1

    .line 3
    :cond_1
    iget-object p1, p0, Lcom/kwad/sdk/core/videocache/j;->aDu:Lcom/kwad/sdk/core/videocache/n;

    iget-wide p1, p1, Lcom/kwad/sdk/core/videocache/n;->aDK:J

    return-wide p1
.end method

.method private static c(Lokhttp3/Response;)J
    .locals 2

    const-string v0, "Content-Length"

    .line 1
    invoke-virtual {p0, v0}, Lokhttp3/Response;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const-wide/16 v0, -0x1

    return-wide v0

    .line 2
    :cond_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method private d(JI)Lokhttp3/Response;
    .locals 6

    .line 1
    iget-object p3, p0, Lcom/kwad/sdk/core/videocache/j;->aDB:Lokhttp3/OkHttpClient;

    invoke-virtual {p3}, Lokhttp3/OkHttpClient;->newBuilder()Lokhttp3/OkHttpClient$Builder;

    move-result-object p3

    const/4 v0, 0x3

    new-array v0, v0, [Lokhttp3/ConnectionSpec;

    .line 2
    sget-object v1, Lokhttp3/ConnectionSpec;->MODERN_TLS:Lokhttp3/ConnectionSpec;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lokhttp3/ConnectionSpec;->COMPATIBLE_TLS:Lokhttp3/ConnectionSpec;

    const/4 v3, 0x1

    aput-object v1, v0, v3

    sget-object v1, Lokhttp3/ConnectionSpec;->CLEARTEXT:Lokhttp3/ConnectionSpec;

    const/4 v3, 0x2

    aput-object v1, v0, v3

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p3, v0}, Lokhttp3/OkHttpClient$Builder;->connectionSpecs(Ljava/util/List;)Lokhttp3/OkHttpClient$Builder;

    .line 3
    :try_start_0
    new-instance v0, Lcom/kwad/sdk/core/network/a/d;

    invoke-direct {v0}, Lcom/kwad/sdk/core/network/a/d;-><init>()V

    invoke-virtual {p3, v0}, Lokhttp3/OkHttpClient$Builder;->dns(Lokhttp3/Dns;)Lokhttp3/OkHttpClient$Builder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 4
    invoke-static {v0}, Lcom/kwad/sdk/core/e/c;->printStackTrace(Ljava/lang/Throwable;)V

    .line 5
    :goto_0
    invoke-virtual {p3}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    move-result-object p3

    iput-object p3, p0, Lcom/kwad/sdk/core/videocache/j;->aDB:Lokhttp3/OkHttpClient;

    .line 6
    invoke-virtual {p0}, Lcom/kwad/sdk/core/videocache/j;->getUrl()Ljava/lang/String;

    move-result-object p3

    const/4 v0, 0x0

    .line 7
    :cond_0
    new-instance v1, Lokhttp3/Request$Builder;

    invoke-direct {v1}, Lokhttp3/Request$Builder;-><init>()V

    .line 8
    invoke-virtual {v1}, Lokhttp3/Request$Builder;->get()Lokhttp3/Request$Builder;

    .line 9
    invoke-virtual {v1, p3}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

    const-wide/16 v3, 0x0

    cmp-long v5, p1, v3

    if-lez v5, :cond_1

    .line 10
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "bytes="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, "-"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "Range"

    invoke-virtual {v1, v4, v3}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 11
    :cond_1
    iget-object v3, p0, Lcom/kwad/sdk/core/videocache/j;->aDB:Lokhttp3/OkHttpClient;

    invoke-virtual {v1}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object v1

    invoke-virtual {v3, v1}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    move-result-object v1

    invoke-interface {v1}, Lokhttp3/Call;->execute()Lokhttp3/Response;

    move-result-object v1

    .line 12
    invoke-virtual {v1}, Lokhttp3/Response;->isRedirect()Z

    move-result v3

    if-eqz v3, :cond_2

    const-string p3, "Location"

    .line 13
    invoke-virtual {v1, p3}, Lokhttp3/Response;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 14
    invoke-virtual {v1}, Lokhttp3/Response;->isRedirect()Z

    move-result v0

    add-int/lit8 v2, v2, 0x1

    :cond_2
    const/4 v3, 0x5

    if-gt v2, v3, :cond_3

    if-nez v0, :cond_0

    return-object v1

    .line 15
    :cond_3
    new-instance p1, Lcom/kwad/sdk/core/videocache/ProxyCacheException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Too many redirects: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/kwad/sdk/core/videocache/ProxyCacheException;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method private du(I)Lokhttp3/Response;
    .locals 4

    .line 1
    new-instance p1, Lokhttp3/OkHttpClient;

    invoke-direct {p1}, Lokhttp3/OkHttpClient;-><init>()V

    invoke-virtual {p1}, Lokhttp3/OkHttpClient;->newBuilder()Lokhttp3/OkHttpClient$Builder;

    move-result-object p1

    .line 2
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x2710

    invoke-virtual {p1, v1, v2, v0}, Lokhttp3/OkHttpClient$Builder;->connectTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 3
    invoke-virtual {p1, v1, v2, v0}, Lokhttp3/OkHttpClient$Builder;->readTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 4
    invoke-virtual {p1, v1, v2, v0}, Lokhttp3/OkHttpClient$Builder;->writeTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    const/4 v0, 0x3

    new-array v0, v0, [Lokhttp3/ConnectionSpec;

    .line 5
    sget-object v1, Lokhttp3/ConnectionSpec;->MODERN_TLS:Lokhttp3/ConnectionSpec;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lokhttp3/ConnectionSpec;->COMPATIBLE_TLS:Lokhttp3/ConnectionSpec;

    const/4 v3, 0x1

    aput-object v1, v0, v3

    sget-object v1, Lokhttp3/ConnectionSpec;->CLEARTEXT:Lokhttp3/ConnectionSpec;

    const/4 v3, 0x2

    aput-object v1, v0, v3

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lokhttp3/OkHttpClient$Builder;->connectionSpecs(Ljava/util/List;)Lokhttp3/OkHttpClient$Builder;

    .line 6
    :try_start_0
    new-instance v0, Lcom/kwad/sdk/core/network/a/d;

    invoke-direct {v0}, Lcom/kwad/sdk/core/network/a/d;-><init>()V

    invoke-virtual {p1, v0}, Lokhttp3/OkHttpClient$Builder;->dns(Lokhttp3/Dns;)Lokhttp3/OkHttpClient$Builder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 7
    invoke-static {v0}, Lcom/kwad/sdk/core/e/c;->printStackTrace(Ljava/lang/Throwable;)V

    .line 8
    :goto_0
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/sdk/core/videocache/j;->aDB:Lokhttp3/OkHttpClient;

    .line 9
    invoke-virtual {p0}, Lcom/kwad/sdk/core/videocache/j;->getUrl()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    .line 10
    :cond_0
    new-instance v1, Lokhttp3/Request$Builder;

    invoke-direct {v1}, Lokhttp3/Request$Builder;-><init>()V

    .line 11
    invoke-virtual {v1}, Lokhttp3/Request$Builder;->head()Lokhttp3/Request$Builder;

    .line 12
    invoke-virtual {v1, p1}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 13
    iget-object v3, p0, Lcom/kwad/sdk/core/videocache/j;->aDB:Lokhttp3/OkHttpClient;

    invoke-virtual {v1}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object v1

    invoke-virtual {v3, v1}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    move-result-object v1

    invoke-interface {v1}, Lokhttp3/Call;->execute()Lokhttp3/Response;

    move-result-object v1

    .line 14
    invoke-virtual {v1}, Lokhttp3/Response;->isRedirect()Z

    move-result v3

    if-eqz v3, :cond_1

    const-string p1, "Location"

    .line 15
    invoke-virtual {v1, p1}, Lokhttp3/Response;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 16
    invoke-virtual {v1}, Lokhttp3/Response;->isRedirect()Z

    move-result v0

    add-int/lit8 v2, v2, 0x1

    :cond_1
    const/4 v3, 0x5

    if-gt v2, v3, :cond_2

    if-nez v0, :cond_0

    return-object v1

    .line 17
    :cond_2
    new-instance p1, Lcom/kwad/sdk/core/videocache/ProxyCacheException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Too many redirects: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/kwad/sdk/core/videocache/ProxyCacheException;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method


# virtual methods
.method public final declared-synchronized Hi()Ljava/lang/String;
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/kwad/sdk/core/videocache/j;->aDu:Lcom/kwad/sdk/core/videocache/n;

    iget-object v0, v0, Lcom/kwad/sdk/core/videocache/n;->aDL:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/kwad/sdk/core/videocache/j;->Hj()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/sdk/core/videocache/j;->aDu:Lcom/kwad/sdk/core/videocache/n;

    iget-object v0, v0, Lcom/kwad/sdk/core/videocache/n;->aDL:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    invoke-direct {p0}, Lcom/kwad/sdk/core/videocache/j;->Hh()V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/kwad/sdk/core/videocache/j;->aDu:Lcom/kwad/sdk/core/videocache/n;

    iget-object v0, v0, Lcom/kwad/sdk/core/videocache/n;->aDL:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final aA(J)V
    .locals 6

    const/4 v0, -0x1

    .line 1
    :try_start_0
    invoke-direct {p0, p1, p2, v0}, Lcom/kwad/sdk/core/videocache/j;->d(JI)Lokhttp3/Response;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v1

    invoke-virtual {v1}, Lokhttp3/ResponseBody;->contentType()Lokhttp3/MediaType;

    move-result-object v1

    invoke-virtual {v1}, Lokhttp3/MediaType;->toString()Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-direct {p0, v0, p1, p2}, Lcom/kwad/sdk/core/videocache/j;->a(Lokhttp3/Response;J)J

    move-result-wide v2

    .line 4
    new-instance v4, Ljava/io/BufferedInputStream;

    invoke-virtual {v0}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->byteStream()Ljava/io/InputStream;

    move-result-object v0

    const/16 v5, 0x400

    invoke-direct {v4, v0, v5}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    iput-object v4, p0, Lcom/kwad/sdk/core/videocache/j;->aDw:Ljava/io/InputStream;

    .line 5
    new-instance v0, Lcom/kwad/sdk/core/videocache/n;

    iget-object v4, p0, Lcom/kwad/sdk/core/videocache/j;->aDu:Lcom/kwad/sdk/core/videocache/n;

    iget-object v4, v4, Lcom/kwad/sdk/core/videocache/n;->url:Ljava/lang/String;

    invoke-direct {v0, v4, v2, v3, v1}, Lcom/kwad/sdk/core/videocache/n;-><init>(Ljava/lang/String;JLjava/lang/String;)V

    iput-object v0, p0, Lcom/kwad/sdk/core/videocache/j;->aDu:Lcom/kwad/sdk/core/videocache/n;

    .line 6
    iget-object v1, p0, Lcom/kwad/sdk/core/videocache/j;->aCW:Lcom/kwad/sdk/core/videocache/d/c;

    iget-object v2, v0, Lcom/kwad/sdk/core/videocache/n;->url:Ljava/lang/String;

    invoke-interface {v1, v2, v0}, Lcom/kwad/sdk/core/videocache/d/c;->a(Ljava/lang/String;Lcom/kwad/sdk/core/videocache/n;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 7
    new-instance v1, Lcom/kwad/sdk/core/videocache/ProxyCacheException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Error opening connection for "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/kwad/sdk/core/videocache/j;->getUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " with offset "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Lcom/kwad/sdk/core/videocache/ProxyCacheException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/videocache/j;->aDw:Ljava/io/InputStream;

    invoke-static {v0}, Lcom/kwad/sdk/crash/utils/b;->closeQuietly(Ljava/io/Closeable;)V

    return-void
.end method

.method public final getUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/videocache/j;->aDu:Lcom/kwad/sdk/core/videocache/n;

    iget-object v0, v0, Lcom/kwad/sdk/core/videocache/n;->url:Ljava/lang/String;

    return-object v0
.end method

.method public final declared-synchronized length()J
    .locals 5

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/kwad/sdk/core/videocache/j;->aDu:Lcom/kwad/sdk/core/videocache/n;

    iget-wide v0, v0, Lcom/kwad/sdk/core/videocache/n;->aDK:J

    const-wide/32 v2, -0x80000000

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/kwad/sdk/core/videocache/j;->Hj()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/sdk/core/videocache/j;->aDu:Lcom/kwad/sdk/core/videocache/n;

    iget-wide v0, v0, Lcom/kwad/sdk/core/videocache/n;->aDK:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    .line 4
    invoke-direct {p0}, Lcom/kwad/sdk/core/videocache/j;->Hh()V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/kwad/sdk/core/videocache/j;->aDu:Lcom/kwad/sdk/core/videocache/n;

    iget-wide v0, v0, Lcom/kwad/sdk/core/videocache/n;->aDK:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final read([B)I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/videocache/j;->aDw:Ljava/io/InputStream;

    const-string v1, "Error reading data from "

    if-eqz v0, :cond_0

    const/4 v2, 0x0

    const/16 v3, 0x400

    .line 2
    :try_start_0
    invoke-virtual {v0, p1, v2, v3}, Ljava/io/InputStream;->read([BII)I

    move-result p1
    :try_end_0
    .catch Ljava/io/InterruptedIOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 3
    new-instance v0, Lcom/kwad/sdk/core/videocache/ProxyCacheException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/kwad/sdk/core/videocache/j;->aDu:Lcom/kwad/sdk/core/videocache/n;

    iget-object v1, v1, Lcom/kwad/sdk/core/videocache/n;->url:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/kwad/sdk/core/videocache/ProxyCacheException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    move-exception p1

    .line 4
    new-instance v0, Lcom/kwad/sdk/core/videocache/InterruptedProxyCacheException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Reading source "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/kwad/sdk/core/videocache/j;->aDu:Lcom/kwad/sdk/core/videocache/n;

    iget-object v2, v2, Lcom/kwad/sdk/core/videocache/n;->url:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " is interrupted"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/kwad/sdk/core/videocache/InterruptedProxyCacheException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 5
    :cond_0
    new-instance p1, Lcom/kwad/sdk/core/videocache/ProxyCacheException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/kwad/sdk/core/videocache/j;->aDu:Lcom/kwad/sdk/core/videocache/n;

    iget-object v1, v1, Lcom/kwad/sdk/core/videocache/n;->url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": connection is absent!"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/kwad/sdk/core/videocache/ProxyCacheException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HttpUrlSource{sourceInfo=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/kwad/sdk/core/videocache/j;->aDu:Lcom/kwad/sdk/core/videocache/n;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
