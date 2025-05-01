.class public final Lcom/join/kotlin/base/state/ResultState$Error;
.super Lcom/join/kotlin/base/state/ResultState;
.source "ResultState.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/kotlin/base/state/ResultState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Error"
.end annotation


# instance fields
.field private final error:Lcom/join/kotlin/base/net/AppException;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/join/kotlin/base/net/AppException;)V
    .locals 1
    .param p1    # Lcom/join/kotlin/base/net/AppException;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/join/kotlin/base/state/ResultState;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/join/kotlin/base/state/ResultState$Error;->error:Lcom/join/kotlin/base/net/AppException;

    return-void
.end method

.method public static synthetic copy$default(Lcom/join/kotlin/base/state/ResultState$Error;Lcom/join/kotlin/base/net/AppException;ILjava/lang/Object;)Lcom/join/kotlin/base/state/ResultState$Error;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/join/kotlin/base/state/ResultState$Error;->error:Lcom/join/kotlin/base/net/AppException;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/join/kotlin/base/state/ResultState$Error;->copy(Lcom/join/kotlin/base/net/AppException;)Lcom/join/kotlin/base/state/ResultState$Error;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/join/kotlin/base/net/AppException;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/base/state/ResultState$Error;->error:Lcom/join/kotlin/base/net/AppException;

    return-object v0
.end method

.method public final copy(Lcom/join/kotlin/base/net/AppException;)Lcom/join/kotlin/base/state/ResultState$Error;
    .locals 1
    .param p1    # Lcom/join/kotlin/base/net/AppException;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/join/kotlin/base/state/ResultState$Error;

    invoke-direct {v0, p1}, Lcom/join/kotlin/base/state/ResultState$Error;-><init>(Lcom/join/kotlin/base/net/AppException;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/join/kotlin/base/state/ResultState$Error;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/join/kotlin/base/state/ResultState$Error;

    iget-object v1, p0, Lcom/join/kotlin/base/state/ResultState$Error;->error:Lcom/join/kotlin/base/net/AppException;

    iget-object p1, p1, Lcom/join/kotlin/base/state/ResultState$Error;->error:Lcom/join/kotlin/base/net/AppException;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getError()Lcom/join/kotlin/base/net/AppException;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/base/state/ResultState$Error;->error:Lcom/join/kotlin/base/net/AppException;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/join/kotlin/base/state/ResultState$Error;->error:Lcom/join/kotlin/base/net/AppException;

    invoke-virtual {v0}, Ljava/lang/Exception;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Error(error="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/base/state/ResultState$Error;->error:Lcom/join/kotlin/base/net/AppException;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
