.class public Lcom/beizi/ad/internal/utilities/HTTPResponse;
.super Ljava/lang/Object;
.source "HTTPResponse.java"


# instance fields
.field private code:I

.field private errorCode:Lcom/beizi/ad/internal/utilities/HttpErrorCode;

.field private headers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private locationUrl:Ljava/lang/String;

.field private responseBinaryBody:Ljava/io/ByteArrayOutputStream;

.field private responseBody:Ljava/lang/String;

.field private succeeded:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(ZLjava/io/ByteArrayOutputStream;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/io/ByteArrayOutputStream;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-boolean p1, p0, Lcom/beizi/ad/internal/utilities/HTTPResponse;->succeeded:Z

    .line 8
    iput-object p2, p0, Lcom/beizi/ad/internal/utilities/HTTPResponse;->responseBinaryBody:Ljava/io/ByteArrayOutputStream;

    .line 9
    iput-object p3, p0, Lcom/beizi/ad/internal/utilities/HTTPResponse;->headers:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lcom/beizi/ad/internal/utilities/HTTPResponse;->succeeded:Z

    .line 4
    iput-object p2, p0, Lcom/beizi/ad/internal/utilities/HTTPResponse;->responseBody:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/beizi/ad/internal/utilities/HTTPResponse;->headers:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public getCode()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/ad/internal/utilities/HTTPResponse;->code:I

    return v0
.end method

.method public getErrorCode()Lcom/beizi/ad/internal/utilities/HttpErrorCode;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/utilities/HTTPResponse;->errorCode:Lcom/beizi/ad/internal/utilities/HttpErrorCode;

    return-object v0
.end method

.method public getHeaders()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/utilities/HTTPResponse;->headers:Ljava/util/Map;

    return-object v0
.end method

.method public getLocationUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/utilities/HTTPResponse;->locationUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getResponseBinaryBody()Ljava/io/ByteArrayOutputStream;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/utilities/HTTPResponse;->responseBinaryBody:Ljava/io/ByteArrayOutputStream;

    return-object v0
.end method

.method public getResponseBody()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/utilities/HTTPResponse;->responseBody:Ljava/lang/String;

    return-object v0
.end method

.method public getSucceeded()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/beizi/ad/internal/utilities/HTTPResponse;->succeeded:Z

    return v0
.end method

.method public setCode(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/ad/internal/utilities/HTTPResponse;->code:I

    return-void
.end method

.method public setErrorCode(Lcom/beizi/ad/internal/utilities/HttpErrorCode;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/utilities/HTTPResponse;->errorCode:Lcom/beizi/ad/internal/utilities/HttpErrorCode;

    return-void
.end method

.method public setHeaders(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/utilities/HTTPResponse;->headers:Ljava/util/Map;

    return-void
.end method

.method public setLocationUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/utilities/HTTPResponse;->locationUrl:Ljava/lang/String;

    return-void
.end method

.method public setResponseBinaryBody(Ljava/io/ByteArrayOutputStream;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/utilities/HTTPResponse;->responseBinaryBody:Ljava/io/ByteArrayOutputStream;

    return-void
.end method

.method public setResponseBody(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/utilities/HTTPResponse;->responseBody:Ljava/lang/String;

    return-void
.end method

.method public setSucceeded(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/beizi/ad/internal/utilities/HTTPResponse;->succeeded:Z

    return-void
.end method
