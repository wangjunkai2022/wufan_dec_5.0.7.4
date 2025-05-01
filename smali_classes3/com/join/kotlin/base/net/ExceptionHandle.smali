.class public final Lcom/join/kotlin/base/net/ExceptionHandle;
.super Ljava/lang/Object;
.source "ExceptionHandle.kt"


# static fields
.field public static final INSTANCE:Lcom/join/kotlin/base/net/ExceptionHandle;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/join/kotlin/base/net/ExceptionHandle;

    invoke-direct {v0}, Lcom/join/kotlin/base/net/ExceptionHandle;-><init>()V

    sput-object v0, Lcom/join/kotlin/base/net/ExceptionHandle;->INSTANCE:Lcom/join/kotlin/base/net/ExceptionHandle;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleException(Ljava/lang/Throwable;)Lcom/join/kotlin/base/net/AppException;
    .locals 2
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    if-eqz p1, :cond_b

    .line 1
    instance-of v0, p1, Lretrofit2/HttpException;

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lcom/join/kotlin/base/net/AppException;

    sget-object v1, Lcom/join/kotlin/base/net/Error;->NETWORK_ERROR:Lcom/join/kotlin/base/net/Error;

    invoke-direct {v0, v1, p1}, Lcom/join/kotlin/base/net/AppException;-><init>(Lcom/join/kotlin/base/net/Error;Ljava/lang/Throwable;)V

    return-object v0

    .line 3
    :cond_0
    instance-of v0, p1, Lcom/google/gson/JsonParseException;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lorg/json/JSONException;

    :goto_0
    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    instance-of v0, p1, Landroid/net/ParseException;

    :goto_1
    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    instance-of v1, p1, Lcom/google/gson/stream/MalformedJsonException;

    :goto_2
    if-eqz v1, :cond_4

    .line 4
    new-instance v0, Lcom/join/kotlin/base/net/AppException;

    sget-object v1, Lcom/join/kotlin/base/net/Error;->PARSE_ERROR:Lcom/join/kotlin/base/net/Error;

    invoke-direct {v0, v1, p1}, Lcom/join/kotlin/base/net/AppException;-><init>(Lcom/join/kotlin/base/net/Error;Ljava/lang/Throwable;)V

    return-object v0

    .line 5
    :cond_4
    instance-of v0, p1, Ljava/net/ConnectException;

    if-eqz v0, :cond_5

    .line 6
    new-instance v0, Lcom/join/kotlin/base/net/AppException;

    sget-object v1, Lcom/join/kotlin/base/net/Error;->NETWORK_ERROR:Lcom/join/kotlin/base/net/Error;

    invoke-direct {v0, v1, p1}, Lcom/join/kotlin/base/net/AppException;-><init>(Lcom/join/kotlin/base/net/Error;Ljava/lang/Throwable;)V

    return-object v0

    .line 7
    :cond_5
    instance-of v0, p1, Ljavax/net/ssl/SSLException;

    if-eqz v0, :cond_6

    .line 8
    new-instance v0, Lcom/join/kotlin/base/net/AppException;

    sget-object v1, Lcom/join/kotlin/base/net/Error;->SSL_ERROR:Lcom/join/kotlin/base/net/Error;

    invoke-direct {v0, v1, p1}, Lcom/join/kotlin/base/net/AppException;-><init>(Lcom/join/kotlin/base/net/Error;Ljava/lang/Throwable;)V

    return-object v0

    .line 9
    :cond_6
    instance-of v0, p1, Lorg/apache/http/conn/ConnectTimeoutException;

    if-eqz v0, :cond_7

    .line 10
    new-instance v0, Lcom/join/kotlin/base/net/AppException;

    sget-object v1, Lcom/join/kotlin/base/net/Error;->TIMEOUT_ERROR:Lcom/join/kotlin/base/net/Error;

    invoke-direct {v0, v1, p1}, Lcom/join/kotlin/base/net/AppException;-><init>(Lcom/join/kotlin/base/net/Error;Ljava/lang/Throwable;)V

    return-object v0

    .line 11
    :cond_7
    instance-of v0, p1, Ljava/net/SocketTimeoutException;

    if-eqz v0, :cond_8

    .line 12
    new-instance v0, Lcom/join/kotlin/base/net/AppException;

    sget-object v1, Lcom/join/kotlin/base/net/Error;->TIMEOUT_ERROR:Lcom/join/kotlin/base/net/Error;

    invoke-direct {v0, v1, p1}, Lcom/join/kotlin/base/net/AppException;-><init>(Lcom/join/kotlin/base/net/Error;Ljava/lang/Throwable;)V

    return-object v0

    .line 13
    :cond_8
    instance-of v0, p1, Ljava/net/UnknownHostException;

    if-eqz v0, :cond_9

    .line 14
    new-instance v0, Lcom/join/kotlin/base/net/AppException;

    sget-object v1, Lcom/join/kotlin/base/net/Error;->TIMEOUT_ERROR:Lcom/join/kotlin/base/net/Error;

    invoke-direct {v0, v1, p1}, Lcom/join/kotlin/base/net/AppException;-><init>(Lcom/join/kotlin/base/net/Error;Ljava/lang/Throwable;)V

    return-object v0

    .line 15
    :cond_9
    instance-of v0, p1, Lcom/join/kotlin/base/net/AppException;

    if-eqz v0, :cond_a

    check-cast p1, Lcom/join/kotlin/base/net/AppException;

    return-object p1

    .line 16
    :cond_a
    new-instance v0, Lcom/join/kotlin/base/net/AppException;

    sget-object v1, Lcom/join/kotlin/base/net/Error;->UNKNOWN:Lcom/join/kotlin/base/net/Error;

    invoke-direct {v0, v1, p1}, Lcom/join/kotlin/base/net/AppException;-><init>(Lcom/join/kotlin/base/net/Error;Ljava/lang/Throwable;)V

    return-object v0

    .line 17
    :cond_b
    new-instance v0, Lcom/join/kotlin/base/net/AppException;

    sget-object v1, Lcom/join/kotlin/base/net/Error;->UNKNOWN:Lcom/join/kotlin/base/net/Error;

    invoke-direct {v0, v1, p1}, Lcom/join/kotlin/base/net/AppException;-><init>(Lcom/join/kotlin/base/net/Error;Ljava/lang/Throwable;)V

    return-object v0
.end method
