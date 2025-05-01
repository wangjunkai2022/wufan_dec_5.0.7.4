.class public abstract Lcom/beizi/ad/internal/utilities/HTTPGet;
.super Landroid/os/AsyncTask;
.source "HTTPGet.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Lcom/beizi/ad/internal/utilities/HTTPResponse;",
        ">;"
    }
.end annotation


# static fields
.field private static TAG:Ljava/lang/String; = "HTTPGet"


# instance fields
.field private isReturnResponse:Z

.field private mBinaryStream:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ZZ)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/beizi/ad/internal/utilities/HTTPGet;->mBinaryStream:Z

    .line 3
    iput-boolean p1, p0, Lcom/beizi/ad/internal/utilities/HTTPGet;->mBinaryStream:Z

    .line 4
    iput-boolean p2, p0, Lcom/beizi/ad/internal/utilities/HTTPGet;->isReturnResponse:Z

    return-void
.end method

.method private createConnection(Ljava/net/URL;)Ljava/net/HttpURLConnection;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p1

    check-cast p1, Ljava/net/HttpURLConnection;

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    const/4 v1, 0x1

    .line 3
    invoke-virtual {p1, v1}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    .line 4
    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V

    const-string v0, "GET"

    .line 5
    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    return-object p1
.end method

.method private setConnectionParams(Ljava/net/HttpURLConnection;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/ProtocolException;
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v0

    iget-object v0, v0, Lcom/beizi/ad/internal/g;->d:Ljava/lang/String;

    const-string v1, "User-Agent"

    invoke-virtual {p1, v1, v0}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected varargs doInBackground([Ljava/lang/Void;)Lcom/beizi/ad/internal/utilities/HTTPResponse;
    .locals 7

    const-string p1, "An HTTP request with an invalid URL was attempted."

    .line 2
    new-instance v0, Lcom/beizi/ad/internal/utilities/HTTPResponse;

    invoke-direct {v0}, Lcom/beizi/ad/internal/utilities/HTTPResponse;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 3
    :try_start_0
    new-instance v3, Ljava/net/URL;

    invoke-virtual {p0}, Lcom/beizi/ad/internal/utilities/HTTPGet;->getUrl()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 4
    invoke-virtual {v3}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_0

    .line 5
    sget-object v3, Lcom/beizi/ad/internal/utilities/HaoboLog;->httpReqLogTag:Ljava/lang/String;

    new-instance v4, Ljava/lang/IllegalStateException;

    invoke-direct {v4, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {v3, p1, v4}, Lcom/beizi/ad/internal/utilities/HaoboLog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    invoke-virtual {v0, v1}, Lcom/beizi/ad/internal/utilities/HTTPResponse;->setSucceeded(Z)V

    return-object v0

    .line 7
    :cond_0
    invoke-direct {p0, v3}, Lcom/beizi/ad/internal/utilities/HTTPGet;->createConnection(Ljava/net/URL;)Ljava/net/HttpURLConnection;

    move-result-object v2

    .line 8
    invoke-direct {p0, v2}, Lcom/beizi/ad/internal/utilities/HTTPGet;->setConnectionParams(Ljava/net/HttpURLConnection;)V

    .line 9
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->connect()V

    .line 10
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result p1

    .line 11
    sget-object v3, Lcom/beizi/ad/internal/utilities/HTTPGet;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "HTTPGet code:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/beizi/ad/lance/a/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/beizi/ad/internal/utilities/HTTPResponse;->setHeaders(Ljava/util/Map;)V

    const/16 v3, 0xc8

    const/16 v4, 0x12e

    if-eq p1, v3, :cond_2

    if-ne p1, v4, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v3, 0x1

    .line 13
    :goto_1
    invoke-virtual {v0, v3}, Lcom/beizi/ad/internal/utilities/HTTPResponse;->setSucceeded(Z)V

    if-ne p1, v4, :cond_3

    .line 14
    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/utilities/HTTPResponse;->setCode(I)V

    const-string p1, "Location"

    .line 15
    invoke-virtual {v2, p1}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/utilities/HTTPResponse;->setLocationUrl(Ljava/lang/String;)V

    .line 16
    :cond_3
    iget-boolean p1, p0, Lcom/beizi/ad/internal/utilities/HTTPGet;->isReturnResponse:Z

    if-eqz p1, :cond_6

    .line 17
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p1

    .line 18
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v4, 0x400

    new-array v4, v4, [B

    .line 19
    :goto_2
    invoke-virtual {p1, v4}, Ljava/io/InputStream;->read([B)I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_4

    .line 20
    invoke-virtual {v3, v4, v1, v5}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_2

    .line 21
    :cond_4
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    .line 22
    iget-boolean p1, p0, Lcom/beizi/ad/internal/utilities/HTTPGet;->mBinaryStream:Z

    if-nez p1, :cond_5

    const-string p1, "UTF-8"

    .line 23
    invoke-virtual {v3, p1}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 24
    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/utilities/HTTPResponse;->setResponseBody(Ljava/lang/String;)V

    goto :goto_3

    .line 25
    :cond_5
    invoke-virtual {v0, v3}, Lcom/beizi/ad/internal/utilities/HTTPResponse;->setResponseBinaryBody(Ljava/io/ByteArrayOutputStream;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    .line 26
    :catch_0
    :try_start_1
    invoke-virtual {v0, v1}, Lcom/beizi/ad/internal/utilities/HTTPResponse;->setSucceeded(Z)V

    .line 27
    sget-object p1, Lcom/beizi/ad/internal/utilities/HttpErrorCode;->TRANSPORT_ERROR:Lcom/beizi/ad/internal/utilities/HttpErrorCode;

    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/utilities/HTTPResponse;->setErrorCode(Lcom/beizi/ad/internal/utilities/HttpErrorCode;)V

    .line 28
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->httpReqLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->http_io:I

    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v2, :cond_7

    goto :goto_3

    .line 29
    :catch_1
    invoke-virtual {v0, v1}, Lcom/beizi/ad/internal/utilities/HTTPResponse;->setSucceeded(Z)V

    .line 30
    sget-object p1, Lcom/beizi/ad/internal/utilities/HttpErrorCode;->TRANSPORT_ERROR:Lcom/beizi/ad/internal/utilities/HttpErrorCode;

    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/utilities/HTTPResponse;->setErrorCode(Lcom/beizi/ad/internal/utilities/HttpErrorCode;)V

    .line 31
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->httpReqLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->http_io:I

    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v2, :cond_7

    goto :goto_3

    .line 32
    :catch_2
    invoke-virtual {v0, v1}, Lcom/beizi/ad/internal/utilities/HTTPResponse;->setSucceeded(Z)V

    .line 33
    sget-object p1, Lcom/beizi/ad/internal/utilities/HttpErrorCode;->URL_FORMAT_ERROR:Lcom/beizi/ad/internal/utilities/HttpErrorCode;

    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/utilities/HTTPResponse;->setErrorCode(Lcom/beizi/ad/internal/utilities/HttpErrorCode;)V

    .line 34
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->httpReqLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->http_url_malformed:I

    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v2, :cond_7

    .line 35
    :cond_6
    :goto_3
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_7
    return-object v0

    :goto_4
    if-eqz v2, :cond_8

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 36
    :cond_8
    goto :goto_6

    :goto_5
    throw p1

    :goto_6
    goto :goto_5
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/beizi/ad/internal/utilities/HTTPGet;->doInBackground([Ljava/lang/Void;)Lcom/beizi/ad/internal/utilities/HTTPResponse;

    move-result-object p1

    return-object p1
.end method

.method protected abstract getUrl()Ljava/lang/String;
.end method

.method protected onCancelled(Lcom/beizi/ad/internal/utilities/HTTPResponse;)V
    .locals 0
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    const/4 p1, 0x0

    .line 2
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onCancelled(Ljava/lang/Object;)V

    return-void
.end method

.method protected bridge synthetic onCancelled(Ljava/lang/Object;)V
    .locals 0
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .line 1
    check-cast p1, Lcom/beizi/ad/internal/utilities/HTTPResponse;

    invoke-virtual {p0, p1}, Lcom/beizi/ad/internal/utilities/HTTPGet;->onCancelled(Lcom/beizi/ad/internal/utilities/HTTPResponse;)V

    return-void
.end method

.method protected abstract onPostExecute(Lcom/beizi/ad/internal/utilities/HTTPResponse;)V
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/beizi/ad/internal/utilities/HTTPResponse;

    invoke-virtual {p0, p1}, Lcom/beizi/ad/internal/utilities/HTTPGet;->onPostExecute(Lcom/beizi/ad/internal/utilities/HTTPResponse;)V

    return-void
.end method
