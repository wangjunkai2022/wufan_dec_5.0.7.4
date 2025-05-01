.class public final Lcom/join/kotlin/base/net/stateCallback/DataUiState;
.super Ljava/lang/Object;
.source "DataUiState.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final data:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final errMessage:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final hasMore:Z

.field private final isEmpty:Z

.field private final isFirstEmpty:Z

.field private final isRefresh:Z

.field private final isSuccess:Z


# direct methods
.method public constructor <init>(ZLjava/lang/String;ZZZZLjava/lang/Object;)V
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/lang/String;",
            "ZZZZTT;)V"
        }
    .end annotation

    const-string v0, "errMessage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->isSuccess:Z

    .line 3
    iput-object p2, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->errMessage:Ljava/lang/String;

    .line 4
    iput-boolean p3, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->isRefresh:Z

    .line 5
    iput-boolean p4, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->isEmpty:Z

    .line 6
    iput-boolean p5, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->hasMore:Z

    .line 7
    iput-boolean p6, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->isFirstEmpty:Z

    .line 8
    iput-object p7, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->data:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/String;ZZZZLjava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 v0, p8, 0x2

    if-eqz v0, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    move-object v0, p2

    :goto_0
    and-int/lit8 v1, p8, 0x4

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    move v1, p3

    :goto_1
    and-int/lit8 v3, p8, 0x8

    if-eqz v3, :cond_2

    const/4 v3, 0x0

    goto :goto_2

    :cond_2
    move v3, p4

    :goto_2
    and-int/lit8 v4, p8, 0x10

    if-eqz v4, :cond_3

    const/4 v4, 0x0

    goto :goto_3

    :cond_3
    move v4, p5

    :goto_3
    and-int/lit8 v5, p8, 0x20

    if-eqz v5, :cond_4

    goto :goto_4

    :cond_4
    move v2, p6

    :goto_4
    and-int/lit8 v5, p8, 0x40

    if-eqz v5, :cond_5

    const/4 v5, 0x0

    goto :goto_5

    :cond_5
    move-object v5, p7

    :goto_5
    move-object p2, p0

    move p3, p1

    move-object p4, v0

    move p5, v1

    move p6, v3

    move p7, v4

    move p8, v2

    move-object p9, v5

    .line 9
    invoke-direct/range {p2 .. p9}, Lcom/join/kotlin/base/net/stateCallback/DataUiState;-><init>(ZLjava/lang/String;ZZZZLjava/lang/Object;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/join/kotlin/base/net/stateCallback/DataUiState;ZLjava/lang/String;ZZZZLjava/lang/Object;ILjava/lang/Object;)Lcom/join/kotlin/base/net/stateCallback/DataUiState;
    .locals 5

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-boolean p1, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->isSuccess:Z

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->errMessage:Ljava/lang/String;

    :cond_1
    move-object p9, p2

    and-int/lit8 p2, p8, 0x4

    if-eqz p2, :cond_2

    iget-boolean p3, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->isRefresh:Z

    :cond_2
    move v0, p3

    and-int/lit8 p2, p8, 0x8

    if-eqz p2, :cond_3

    iget-boolean p4, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->isEmpty:Z

    :cond_3
    move v1, p4

    and-int/lit8 p2, p8, 0x10

    if-eqz p2, :cond_4

    iget-boolean p5, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->hasMore:Z

    :cond_4
    move v2, p5

    and-int/lit8 p2, p8, 0x20

    if-eqz p2, :cond_5

    iget-boolean p6, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->isFirstEmpty:Z

    :cond_5
    move v3, p6

    and-int/lit8 p2, p8, 0x40

    if-eqz p2, :cond_6

    iget-object p7, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->data:Ljava/lang/Object;

    :cond_6
    move-object v4, p7

    move-object p2, p0

    move p3, p1

    move-object p4, p9

    move p5, v0

    move p6, v1

    move p7, v2

    move p8, v3

    move-object p9, v4

    invoke-virtual/range {p2 .. p9}, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->copy(ZLjava/lang/String;ZZZZLjava/lang/Object;)Lcom/join/kotlin/base/net/stateCallback/DataUiState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->isSuccess:Z

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->errMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->isRefresh:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->isEmpty:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->hasMore:Z

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->isFirstEmpty:Z

    return v0
.end method

.method public final component7()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->data:Ljava/lang/Object;

    return-object v0
.end method

.method public final copy(ZLjava/lang/String;ZZZZLjava/lang/Object;)Lcom/join/kotlin/base/net/stateCallback/DataUiState;
    .locals 9
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/lang/String;",
            "ZZZZTT;)",
            "Lcom/join/kotlin/base/net/stateCallback/DataUiState<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "errMessage"

    move-object v3, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;

    move-object v1, v0

    move v2, p1

    move v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/join/kotlin/base/net/stateCallback/DataUiState;-><init>(ZLjava/lang/String;ZZZZLjava/lang/Object;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/join/kotlin/base/net/stateCallback/DataUiState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/join/kotlin/base/net/stateCallback/DataUiState;

    iget-boolean v1, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->isSuccess:Z

    iget-boolean v3, p1, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->isSuccess:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->errMessage:Ljava/lang/String;

    iget-object v3, p1, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->errMessage:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->isRefresh:Z

    iget-boolean v3, p1, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->isRefresh:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->isEmpty:Z

    iget-boolean v3, p1, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->isEmpty:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->hasMore:Z

    iget-boolean v3, p1, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->hasMore:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->isFirstEmpty:Z

    iget-boolean v3, p1, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->isFirstEmpty:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->data:Ljava/lang/Object;

    iget-object p1, p1, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->data:Ljava/lang/Object;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getData()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->data:Ljava/lang/Object;

    return-object v0
.end method

.method public final getErrMessage()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->errMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final getHasMore()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->hasMore:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->isSuccess:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->errMessage:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->isRefresh:Z

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    :cond_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->isEmpty:Z

    if-eqz v2, :cond_2

    const/4 v2, 0x1

    :cond_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->hasMore:Z

    if-eqz v2, :cond_3

    const/4 v2, 0x1

    :cond_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->isFirstEmpty:Z

    if-eqz v2, :cond_4

    goto :goto_0

    :cond_4
    move v1, v2

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->data:Ljava/lang/Object;

    if-nez v1, :cond_5

    const/4 v1, 0x0

    goto :goto_1

    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public final isEmpty()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->isEmpty:Z

    return v0
.end method

.method public final isFirstEmpty()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->isFirstEmpty:Z

    return v0
.end method

.method public final isRefresh()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->isRefresh:Z

    return v0
.end method

.method public final isSuccess()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->isSuccess:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DataUiState(isSuccess="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->isSuccess:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", errMessage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->errMessage:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isRefresh="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->isRefresh:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isEmpty="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->isEmpty:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", hasMore="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->hasMore:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isFirstEmpty="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->isFirstEmpty:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", data="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/base/net/stateCallback/DataUiState;->data:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
