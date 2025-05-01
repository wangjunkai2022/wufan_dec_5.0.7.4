.class public final Lcom/join/kotlin/base/state/ResultState$Companion;
.super Ljava/lang/Object;
.source "ResultState.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/kotlin/base/state/ResultState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/join/kotlin/base/state/ResultState$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final onRequestError(Lcom/join/kotlin/base/net/AppException;)Lcom/join/kotlin/base/state/ResultState;
    .locals 1
    .param p1    # Lcom/join/kotlin/base/net/AppException;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/join/kotlin/base/net/AppException;",
            ")",
            "Lcom/join/kotlin/base/state/ResultState<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lcom/join/kotlin/base/state/ResultState$Error;

    invoke-direct {v0, p1}, Lcom/join/kotlin/base/state/ResultState$Error;-><init>(Lcom/join/kotlin/base/net/AppException;)V

    return-object v0
.end method

.method public final onRequestLoading(Ljava/lang/String;)Lcom/join/kotlin/base/state/ResultState;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            ")",
            "Lcom/join/kotlin/base/state/ResultState<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "loadingMessage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lcom/join/kotlin/base/state/ResultState$Loading;

    invoke-direct {v0, p1}, Lcom/join/kotlin/base/state/ResultState$Loading;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final onRequestSuccess(Ljava/lang/Object;)Lcom/join/kotlin/base/state/ResultState;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Lcom/join/kotlin/base/state/ResultState<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Lcom/join/kotlin/base/state/ResultState$Success;

    invoke-direct {v0, p1}, Lcom/join/kotlin/base/state/ResultState$Success;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
