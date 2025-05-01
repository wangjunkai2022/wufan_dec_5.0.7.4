.class public final enum Lcom/join/kotlin/base/net/Error;
.super Ljava/lang/Enum;
.source "Error.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/join/kotlin/base/net/Error;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/join/kotlin/base/net/Error;

.field public static final enum NETWORK_ERROR:Lcom/join/kotlin/base/net/Error;

.field public static final enum PARSE_ERROR:Lcom/join/kotlin/base/net/Error;

.field public static final enum SSL_ERROR:Lcom/join/kotlin/base/net/Error;

.field public static final enum TIMEOUT_ERROR:Lcom/join/kotlin/base/net/Error;

.field public static final enum UNKNOWN:Lcom/join/kotlin/base/net/Error;


# instance fields
.field private final code:I

.field private final err:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/join/kotlin/base/net/Error;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Lcom/join/kotlin/base/net/Error;

    sget-object v1, Lcom/join/kotlin/base/net/Error;->UNKNOWN:Lcom/join/kotlin/base/net/Error;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/join/kotlin/base/net/Error;->PARSE_ERROR:Lcom/join/kotlin/base/net/Error;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/join/kotlin/base/net/Error;->NETWORK_ERROR:Lcom/join/kotlin/base/net/Error;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/join/kotlin/base/net/Error;->SSL_ERROR:Lcom/join/kotlin/base/net/Error;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/join/kotlin/base/net/Error;->TIMEOUT_ERROR:Lcom/join/kotlin/base/net/Error;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/join/kotlin/base/net/Error;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    const/16 v3, 0x3e8

    const-string/jumbo v4, "\u8bf7\u6c42\u5931\u8d25\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5"

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/join/kotlin/base/net/Error;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/join/kotlin/base/net/Error;->UNKNOWN:Lcom/join/kotlin/base/net/Error;

    .line 2
    new-instance v0, Lcom/join/kotlin/base/net/Error;

    const-string v1, "PARSE_ERROR"

    const/4 v2, 0x1

    const/16 v3, 0x3e9

    const-string/jumbo v4, "\u89e3\u6790\u9519\u8bef\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5"

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/join/kotlin/base/net/Error;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/join/kotlin/base/net/Error;->PARSE_ERROR:Lcom/join/kotlin/base/net/Error;

    .line 3
    new-instance v0, Lcom/join/kotlin/base/net/Error;

    const-string v1, "NETWORK_ERROR"

    const/4 v2, 0x2

    const/16 v3, 0x3ea

    const-string/jumbo v4, "\u7f51\u7edc\u8fde\u63a5\u9519\u8bef\uff0c\u8bf7\u7a0d\u540e\u91cd\u8bd5"

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/join/kotlin/base/net/Error;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/join/kotlin/base/net/Error;->NETWORK_ERROR:Lcom/join/kotlin/base/net/Error;

    .line 4
    new-instance v0, Lcom/join/kotlin/base/net/Error;

    const-string v1, "SSL_ERROR"

    const/4 v2, 0x3

    const/16 v3, 0x3ec

    const-string/jumbo v4, "\u8bc1\u4e66\u51fa\u9519\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5"

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/join/kotlin/base/net/Error;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/join/kotlin/base/net/Error;->SSL_ERROR:Lcom/join/kotlin/base/net/Error;

    .line 5
    new-instance v0, Lcom/join/kotlin/base/net/Error;

    const-string v1, "TIMEOUT_ERROR"

    const/4 v2, 0x4

    const/16 v3, 0x3ee

    const-string/jumbo v4, "\u7f51\u7edc\u8fde\u63a5\u8d85\u65f6\uff0c\u8bf7\u7a0d\u540e\u91cd\u8bd5"

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/join/kotlin/base/net/Error;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/join/kotlin/base/net/Error;->TIMEOUT_ERROR:Lcom/join/kotlin/base/net/Error;

    invoke-static {}, Lcom/join/kotlin/base/net/Error;->$values()[Lcom/join/kotlin/base/net/Error;

    move-result-object v0

    sput-object v0, Lcom/join/kotlin/base/net/Error;->$VALUES:[Lcom/join/kotlin/base/net/Error;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/join/kotlin/base/net/Error;->code:I

    iput-object p4, p0, Lcom/join/kotlin/base/net/Error;->err:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/join/kotlin/base/net/Error;
    .locals 1

    const-class v0, Lcom/join/kotlin/base/net/Error;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/join/kotlin/base/net/Error;

    return-object p0
.end method

.method public static values()[Lcom/join/kotlin/base/net/Error;
    .locals 1

    sget-object v0, Lcom/join/kotlin/base/net/Error;->$VALUES:[Lcom/join/kotlin/base/net/Error;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/join/kotlin/base/net/Error;

    return-object v0
.end method


# virtual methods
.method public final getKey()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/kotlin/base/net/Error;->code:I

    return v0
.end method

.method public final getValue()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/base/net/Error;->err:Ljava/lang/String;

    return-object v0
.end method
