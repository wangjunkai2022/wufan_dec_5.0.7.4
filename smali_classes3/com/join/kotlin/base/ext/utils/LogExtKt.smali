.class public final Lcom/join/kotlin/base/ext/utils/LogExtKt;
.super Ljava/lang/Object;
.source "LogExt.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/kotlin/base/ext/utils/LogExtKt$WhenMappings;
    }
.end annotation


# static fields
.field public static final TAG:Ljava/lang/String; = "WF-PLATFORM"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method private static final log(Lcom/join/kotlin/base/ext/utils/LEVEL;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    sget-boolean p1, Lcom/join/android/app/common/http/c;->c:Z

    if-nez p1, :cond_0

    return-void

    .line 2
    :cond_0
    sget-object p1, Lcom/join/kotlin/base/ext/utils/LogExtKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, p1, p0

    return-void
.end method

.method public static final logd(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/join/kotlin/base/ext/utils/LEVEL;->D:Lcom/join/kotlin/base/ext/utils/LEVEL;

    invoke-static {v0, p1, p0}, Lcom/join/kotlin/base/ext/utils/LogExtKt;->log(Lcom/join/kotlin/base/ext/utils/LEVEL;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic logd$default(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const-string p1, "WF-PLATFORM"

    .line 1
    :cond_0
    invoke-static {p0, p1}, Lcom/join/kotlin/base/ext/utils/LogExtKt;->logd(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static final loge(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/join/kotlin/base/ext/utils/LEVEL;->E:Lcom/join/kotlin/base/ext/utils/LEVEL;

    invoke-static {v0, p1, p0}, Lcom/join/kotlin/base/ext/utils/LogExtKt;->log(Lcom/join/kotlin/base/ext/utils/LEVEL;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic loge$default(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const-string p1, "WF-PLATFORM"

    .line 1
    :cond_0
    invoke-static {p0, p1}, Lcom/join/kotlin/base/ext/utils/LogExtKt;->loge(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static final logi(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/join/kotlin/base/ext/utils/LEVEL;->I:Lcom/join/kotlin/base/ext/utils/LEVEL;

    invoke-static {v0, p1, p0}, Lcom/join/kotlin/base/ext/utils/LogExtKt;->log(Lcom/join/kotlin/base/ext/utils/LEVEL;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic logi$default(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const-string p1, "WF-PLATFORM"

    .line 1
    :cond_0
    invoke-static {p0, p1}, Lcom/join/kotlin/base/ext/utils/LogExtKt;->logi(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static final logv(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/join/kotlin/base/ext/utils/LEVEL;->V:Lcom/join/kotlin/base/ext/utils/LEVEL;

    invoke-static {v0, p1, p0}, Lcom/join/kotlin/base/ext/utils/LogExtKt;->log(Lcom/join/kotlin/base/ext/utils/LEVEL;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic logv$default(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const-string p1, "WF-PLATFORM"

    .line 1
    :cond_0
    invoke-static {p0, p1}, Lcom/join/kotlin/base/ext/utils/LogExtKt;->logv(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static final logw(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/join/kotlin/base/ext/utils/LEVEL;->W:Lcom/join/kotlin/base/ext/utils/LEVEL;

    invoke-static {v0, p1, p0}, Lcom/join/kotlin/base/ext/utils/LogExtKt;->log(Lcom/join/kotlin/base/ext/utils/LEVEL;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic logw$default(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const-string p1, "WF-PLATFORM"

    .line 1
    :cond_0
    invoke-static {p0, p1}, Lcom/join/kotlin/base/ext/utils/LogExtKt;->logw(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
