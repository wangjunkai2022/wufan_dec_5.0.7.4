.class public Lcom/psk/eventmodule/net/util/ApiException;
.super Ljava/lang/RuntimeException;
.source "ApiException.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/psk/eventmodule/net/util/ApiException$Companion;
    }
.end annotation


# static fields
.field public static final CODE_AUTH_INVALID:I = 0x191

.field public static final CODE_JSON_PARSE_ERROR:I = 0xfaa

.field public static final CODE_NET_ERROR:I = 0xfa0

.field public static final CODE_SERVER_ERROR:I = 0x1388

.field public static final CODE_TIMEOUT:I = 0xff0

.field public static final Companion:Lcom/psk/eventmodule/net/util/ApiException$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final cause:Ljava/lang/Throwable;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final error:I

.field private final message:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/psk/eventmodule/net/util/ApiException$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/psk/eventmodule/net/util/ApiException$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/psk/eventmodule/net/util/ApiException;->Companion:Lcom/psk/eventmodule/net/util/ApiException$Companion;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/Throwable;)V
    .locals 0
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0, p2, p3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 3
    iput p1, p0, Lcom/psk/eventmodule/net/util/ApiException;->error:I

    iput-object p2, p0, Lcom/psk/eventmodule/net/util/ApiException;->message:Ljava/lang/String;

    iput-object p3, p0, Lcom/psk/eventmodule/net/util/ApiException;->cause:Ljava/lang/Throwable;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/psk/eventmodule/net/util/ApiException;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public getCause()Ljava/lang/Throwable;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/psk/eventmodule/net/util/ApiException;->cause:Ljava/lang/Throwable;

    return-object v0
.end method

.method public final getError()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/psk/eventmodule/net/util/ApiException;->error:I

    return v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/psk/eventmodule/net/util/ApiException;->message:Ljava/lang/String;

    return-object v0
.end method

.method public final toResponse()Lcom/psk/eventmodule/net/modle/ResponseModel;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/psk/eventmodule/net/modle/ResponseModel<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Lcom/psk/eventmodule/net/modle/ResponseModel;

    invoke-direct {v0}, Lcom/psk/eventmodule/net/modle/ResponseModel;-><init>()V

    return-object v0
.end method
