.class public final Lcom/join/kotlin/domain/common/LiveDataExtensionKt;
.super Ljava/lang/Object;
.source "LiveDataExtension.kt"


# direct methods
.method public static final setEvent(Lcom/join/kotlin/domain/common/SingleLiveEvent;Ljava/lang/Object;)V
    .locals 1
    .param p0    # Lcom/join/kotlin/domain/common/SingleLiveEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/join/kotlin/domain/common/SingleLiveEvent<",
            "TT;>;TT;)V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0, p1}, Lcom/join/kotlin/domain/common/SingleLiveEvent;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static final varargs setEvent(Lcom/join/kotlin/domain/common/SingleLiveEvents;[Ljava/lang/Object;)V
    .locals 1
    .param p0    # Lcom/join/kotlin/domain/common/SingleLiveEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # [Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/join/kotlin/domain/common/SingleLiveEvents<",
            "TT;>;[TT;)V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "values"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static {p1}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/kotlin/domain/common/SingleLiveEvents;->setValue(Ljava/util/List;)V

    return-void
.end method
