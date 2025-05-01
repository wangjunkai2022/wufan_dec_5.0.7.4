.class public final Lcom/join/kotlin/base/net/AppException;
.super Ljava/lang/Exception;
.source "AppException.kt"


# instance fields
.field private errCode:I

.field private errorLog:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private errorMsg:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private throwable:Ljava/lang/Throwable;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    if-nez p2, :cond_0

    const-string/jumbo p2, "\u8bf7\u6c42\u5931\u8d25\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5"

    .line 2
    :cond_0
    iput-object p2, p0, Lcom/join/kotlin/base/net/AppException;->errorMsg:Ljava/lang/String;

    .line 3
    iput p1, p0, Lcom/join/kotlin/base/net/AppException;->errCode:I

    if-nez p3, :cond_1

    move-object p3, p2

    .line 4
    :cond_1
    iput-object p3, p0, Lcom/join/kotlin/base/net/AppException;->errorLog:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lcom/join/kotlin/base/net/AppException;->throwable:Ljava/lang/Throwable;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    const-string p3, ""

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    const/4 p4, 0x0

    .line 6
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/join/kotlin/base/net/AppException;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public constructor <init>(Lcom/join/kotlin/base/net/Error;Ljava/lang/Throwable;)V
    .locals 1
    .param p1    # Lcom/join/kotlin/base/net/Error;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 8
    invoke-virtual {p1}, Lcom/join/kotlin/base/net/Error;->getKey()I

    move-result v0

    iput v0, p0, Lcom/join/kotlin/base/net/AppException;->errCode:I

    .line 9
    invoke-virtual {p1}, Lcom/join/kotlin/base/net/Error;->getValue()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/join/kotlin/base/net/AppException;->errorMsg:Ljava/lang/String;

    if-eqz p2, :cond_0

    .line 10
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lcom/join/kotlin/base/net/AppException;->errorLog:Ljava/lang/String;

    .line 11
    iput-object p2, p0, Lcom/join/kotlin/base/net/AppException;->throwable:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public final getErrCode()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/kotlin/base/net/AppException;->errCode:I

    return v0
.end method

.method public final getErrorLog()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/base/net/AppException;->errorLog:Ljava/lang/String;

    return-object v0
.end method

.method public final getErrorMsg()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/base/net/AppException;->errorMsg:Ljava/lang/String;

    return-object v0
.end method

.method public final getThrowable()Ljava/lang/Throwable;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/base/net/AppException;->throwable:Ljava/lang/Throwable;

    return-object v0
.end method

.method public final setErrCode(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/kotlin/base/net/AppException;->errCode:I

    return-void
.end method

.method public final setErrorLog(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/base/net/AppException;->errorLog:Ljava/lang/String;

    return-void
.end method

.method public final setErrorMsg(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/base/net/AppException;->errorMsg:Ljava/lang/String;

    return-void
.end method

.method public final setThrowable(Ljava/lang/Throwable;)V
    .locals 0
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/base/net/AppException;->throwable:Ljava/lang/Throwable;

    return-void
.end method
