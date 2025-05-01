.class public final Lcom/psk/eventmodule/StatFactory$Companion;
.super Ljava/lang/Object;
.source "StatFactory.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/psk/eventmodule/StatFactory;
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

    invoke-direct {p0}, Lcom/psk/eventmodule/StatFactory$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getInstance(Landroid/content/Context;)Lcom/psk/eventmodule/StatFactory;
    .locals 17
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {}, Lcom/psk/eventmodule/StatFactory;->access$getInstance$cp()Lcom/psk/eventmodule/StatFactory;

    move-result-object v1

    if-nez v1, :cond_0

    .line 2
    new-instance v1, Lcom/psk/eventmodule/StatFactory;

    invoke-direct {v1}, Lcom/psk/eventmodule/StatFactory;-><init>()V

    invoke-static {v1}, Lcom/psk/eventmodule/StatFactory;->access$setInstance$cp(Lcom/psk/eventmodule/StatFactory;)V

    .line 3
    :cond_0
    invoke-static {}, Lcom/psk/eventmodule/StatFactory;->access$getStatCore$cp()Lcom/psk/eventmodule/net/StatCore;

    move-result-object v1

    if-nez v1, :cond_1

    .line 4
    sget-object v1, Lcom/psk/eventmodule/net/StatCore;->Companion:Lcom/psk/eventmodule/net/StatCore$Companion;

    invoke-virtual {v1, v0}, Lcom/psk/eventmodule/net/StatCore$Companion;->getInstance(Landroid/content/Context;)Lcom/psk/eventmodule/net/StatCore;

    move-result-object v1

    invoke-static {v1}, Lcom/psk/eventmodule/StatFactory;->access$setStatCore$cp(Lcom/psk/eventmodule/net/StatCore;)V

    .line 5
    :cond_1
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const-string v2, "android_id"

    invoke-static {v1, v2}, Landroid/provider/Settings$System;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 6
    invoke-static/range {p1 .. p1}, Lcom/psk/eventmodule/net/util/DeviceIdUtil;->getInstance(Landroid/content/Context;)Lcom/psk/eventmodule/net/util/DeviceIdUtil;

    move-result-object v3

    invoke-virtual {v3}, Lcom/psk/eventmodule/net/util/DeviceIdUtil;->getOaid()Ljava/lang/String;

    move-result-object v9

    .line 7
    invoke-static/range {p1 .. p1}, Lcom/psk/eventmodule/net/util/DeviceIdUtil;->getInstance(Landroid/content/Context;)Lcom/psk/eventmodule/net/util/DeviceIdUtil;

    move-result-object v3

    invoke-virtual {v3}, Lcom/psk/eventmodule/net/util/DeviceIdUtil;->getImei()Ljava/lang/String;

    move-result-object v10

    .line 8
    invoke-static/range {p1 .. p1}, Lcom/psk/eventmodule/net/util/DeviceIdUtil;->getInstance(Landroid/content/Context;)Lcom/psk/eventmodule/net/util/DeviceIdUtil;

    move-result-object v0

    invoke-virtual {v0}, Lcom/psk/eventmodule/net/util/DeviceIdUtil;->getUmengKey()Ljava/lang/String;

    move-result-object v0

    const-string v3, "0"

    .line 9
    invoke-static {v1, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 10
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 11
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    const-string v4, "0"

    const-string v5, ""

    move-object v3, v1

    invoke-static/range {v3 .. v8}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    const/4 v14, 0x0

    const/4 v15, 0x4

    const/16 v16, 0x0

    const-string v12, "-"

    const-string v13, ""

    invoke-static/range {v11 .. v16}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 12
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 13
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/psk/eventmodule/StatFactory;->access$setDevice_id$cp(Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v9, :cond_4

    .line 14
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_3

    goto :goto_0

    :cond_3
    const/4 v3, 0x0

    goto :goto_1

    :cond_4
    :goto_0
    const/4 v3, 0x1

    :goto_1
    if-nez v3, :cond_5

    const-string v0, "oaid"

    .line 15
    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v9}, Lcom/psk/eventmodule/StatFactory;->access$setDevice_id$cp(Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    if-eqz v10, :cond_6

    .line 16
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_7

    :cond_6
    const/4 v1, 0x1

    :cond_7
    if-nez v1, :cond_8

    const-string v0, "imei"

    .line 17
    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v10}, Lcom/psk/eventmodule/StatFactory;->access$setDevice_id$cp(Ljava/lang/String;)V

    goto :goto_2

    :cond_8
    const-string v1, "umKey"

    .line 18
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/psk/eventmodule/StatFactory;->access$setDevice_id$cp(Ljava/lang/String;)V

    .line 19
    :goto_2
    invoke-static {}, Lcom/psk/eventmodule/StatFactory;->access$getInstance$cp()Lcom/psk/eventmodule/StatFactory;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final getOaid()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    invoke-static {}, Lcom/psk/eventmodule/StatFactory;->access$getOaid$cp()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final setOaid(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-static {p1}, Lcom/psk/eventmodule/StatFactory;->access$setOaid$cp(Ljava/lang/String;)V

    return-void
.end method
