.class public Lcom/psk/eventmodule/net/util/LogPrintUtil;
.super Ljava/lang/Object;
.source "LogPrintUtil.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/psk/eventmodule/net/util/LogPrintUtil$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/psk/eventmodule/net/util/LogPrintUtil$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final LINE_SEPARATOR:Ljava/lang/String;

.field private static final printLog:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/psk/eventmodule/net/util/LogPrintUtil$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/psk/eventmodule/net/util/LogPrintUtil$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/psk/eventmodule/net/util/LogPrintUtil;->Companion:Lcom/psk/eventmodule/net/util/LogPrintUtil$Companion;

    const-string v0, "line.separator"

    .line 1
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/psk/eventmodule/net/util/LogPrintUtil;->LINE_SEPARATOR:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$getLINE_SEPARATOR$cp()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/psk/eventmodule/net/util/LogPrintUtil;->LINE_SEPARATOR:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$getPrintLog$cp()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/psk/eventmodule/net/util/LogPrintUtil;->printLog:Z

    return v0
.end method

.method public static final getPrintLog()Z
    .locals 1

    sget-object v0, Lcom/psk/eventmodule/net/util/LogPrintUtil;->Companion:Lcom/psk/eventmodule/net/util/LogPrintUtil$Companion;

    invoke-virtual {v0}, Lcom/psk/eventmodule/net/util/LogPrintUtil$Companion;->getPrintLog()Z

    move-result v0

    return v0
.end method

.method public static final printOut(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/psk/eventmodule/net/util/LogPrintUtil;->Companion:Lcom/psk/eventmodule/net/util/LogPrintUtil$Companion;

    invoke-virtual {v0, p0, p1, p2}, Lcom/psk/eventmodule/net/util/LogPrintUtil$Companion;->printOut(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
