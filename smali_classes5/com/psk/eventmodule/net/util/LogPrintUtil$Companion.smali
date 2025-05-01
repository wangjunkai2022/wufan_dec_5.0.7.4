.class public final Lcom/psk/eventmodule/net/util/LogPrintUtil$Companion;
.super Ljava/lang/Object;
.source "LogPrintUtil.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/psk/eventmodule/net/util/LogPrintUtil;
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

    invoke-direct {p0}, Lcom/psk/eventmodule/net/util/LogPrintUtil$Companion;-><init>()V

    return-void
.end method

.method public static synthetic getPrintLog$annotations()V
    .locals 0
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    return-void
.end method


# virtual methods
.method public final getPrintLog()Z
    .locals 1

    .line 1
    invoke-static {}, Lcom/psk/eventmodule/net/util/LogPrintUtil;->access$getPrintLog$cp()Z

    move-result v0

    return v0
.end method

.method public final printOut(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "msg"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "headString"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    const-string p1, "{"

    const/4 p3, 0x0

    const/4 v0, 0x2

    const/4 v1, 0x0

    .line 1
    invoke-static {p2, p1, v1, v0, p3}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result p1

    const/4 v2, 0x4

    if-eqz p1, :cond_0

    .line 2
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->toString(I)Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    const-string p1, "["

    .line 4
    invoke-static {p2, p1, v1, v0, p3}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 5
    new-instance p1, Lorg/json/JSONArray;

    invoke-direct {p1, p2}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 6
    invoke-virtual {p1, v2}, Lorg/json/JSONArray;->toString(I)Ljava/lang/String;

    move-result-object p2

    :cond_1
    :goto_0
    const-string p1, "{\n                if (ms\u2026          }\n            }"

    .line 7
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    :catch_0
    invoke-static {}, Lcom/psk/eventmodule/net/util/LogPrintUtil;->access$getLINE_SEPARATOR$cp()Ljava/lang/String;

    .line 9
    invoke-static {}, Lcom/psk/eventmodule/net/util/LogPrintUtil;->access$getLINE_SEPARATOR$cp()Ljava/lang/String;

    .line 10
    invoke-static {}, Lcom/psk/eventmodule/net/util/LogPrintUtil;->access$getLINE_SEPARATOR$cp()Ljava/lang/String;

    .line 11
    invoke-static {}, Lcom/psk/eventmodule/net/util/LogPrintUtil;->access$getLINE_SEPARATOR$cp()Ljava/lang/String;

    .line 12
    invoke-static {}, Lcom/psk/eventmodule/net/util/LogPrintUtil;->access$getLINE_SEPARATOR$cp()Ljava/lang/String;

    return-void
.end method
