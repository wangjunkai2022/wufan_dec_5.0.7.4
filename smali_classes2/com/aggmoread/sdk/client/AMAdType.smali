.class public final enum Lcom/aggmoread/sdk/client/AMAdType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/aggmoread/sdk/client/AMAdType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/aggmoread/sdk/client/AMAdType;

.field public static final enum BANNER:Lcom/aggmoread/sdk/client/AMAdType;

.field public static final enum DRAW:Lcom/aggmoread/sdk/client/AMAdType;

.field public static final enum EXPRESS_INFORMATION_FLOW:Lcom/aggmoread/sdk/client/AMAdType;

.field public static final enum FULLSCREEN:Lcom/aggmoread/sdk/client/AMAdType;

.field public static final enum INFORMATION_FLOW:Lcom/aggmoread/sdk/client/AMAdType;

.field public static final enum INTERSTITIAL:Lcom/aggmoread/sdk/client/AMAdType;

.field public static final enum REWARD:Lcom/aggmoread/sdk/client/AMAdType;

.field public static final enum SPLASH:Lcom/aggmoread/sdk/client/AMAdType;

.field public static final enum UNKNOWN:Lcom/aggmoread/sdk/client/AMAdType;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    new-instance v0, Lcom/aggmoread/sdk/client/AMAdType;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/aggmoread/sdk/client/AMAdType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/aggmoread/sdk/client/AMAdType;->UNKNOWN:Lcom/aggmoread/sdk/client/AMAdType;

    new-instance v1, Lcom/aggmoread/sdk/client/AMAdType;

    const-string v3, "SPLASH"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/aggmoread/sdk/client/AMAdType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/aggmoread/sdk/client/AMAdType;->SPLASH:Lcom/aggmoread/sdk/client/AMAdType;

    new-instance v3, Lcom/aggmoread/sdk/client/AMAdType;

    const-string v5, "REWARD"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/aggmoread/sdk/client/AMAdType;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/aggmoread/sdk/client/AMAdType;->REWARD:Lcom/aggmoread/sdk/client/AMAdType;

    new-instance v5, Lcom/aggmoread/sdk/client/AMAdType;

    const-string v7, "INTERSTITIAL"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lcom/aggmoread/sdk/client/AMAdType;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/aggmoread/sdk/client/AMAdType;->INTERSTITIAL:Lcom/aggmoread/sdk/client/AMAdType;

    new-instance v7, Lcom/aggmoread/sdk/client/AMAdType;

    const-string v9, "INFORMATION_FLOW"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lcom/aggmoread/sdk/client/AMAdType;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lcom/aggmoread/sdk/client/AMAdType;->INFORMATION_FLOW:Lcom/aggmoread/sdk/client/AMAdType;

    new-instance v9, Lcom/aggmoread/sdk/client/AMAdType;

    const-string v11, "EXPRESS_INFORMATION_FLOW"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Lcom/aggmoread/sdk/client/AMAdType;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lcom/aggmoread/sdk/client/AMAdType;->EXPRESS_INFORMATION_FLOW:Lcom/aggmoread/sdk/client/AMAdType;

    new-instance v11, Lcom/aggmoread/sdk/client/AMAdType;

    const-string v13, "FULLSCREEN"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14}, Lcom/aggmoread/sdk/client/AMAdType;-><init>(Ljava/lang/String;I)V

    sput-object v11, Lcom/aggmoread/sdk/client/AMAdType;->FULLSCREEN:Lcom/aggmoread/sdk/client/AMAdType;

    new-instance v13, Lcom/aggmoread/sdk/client/AMAdType;

    const-string v15, "BANNER"

    const/4 v14, 0x7

    invoke-direct {v13, v15, v14}, Lcom/aggmoread/sdk/client/AMAdType;-><init>(Ljava/lang/String;I)V

    sput-object v13, Lcom/aggmoread/sdk/client/AMAdType;->BANNER:Lcom/aggmoread/sdk/client/AMAdType;

    new-instance v15, Lcom/aggmoread/sdk/client/AMAdType;

    const-string v14, "DRAW"

    const/16 v12, 0x8

    invoke-direct {v15, v14, v12}, Lcom/aggmoread/sdk/client/AMAdType;-><init>(Ljava/lang/String;I)V

    sput-object v15, Lcom/aggmoread/sdk/client/AMAdType;->DRAW:Lcom/aggmoread/sdk/client/AMAdType;

    const/16 v14, 0x9

    new-array v14, v14, [Lcom/aggmoread/sdk/client/AMAdType;

    aput-object v0, v14, v2

    aput-object v1, v14, v4

    aput-object v3, v14, v6

    aput-object v5, v14, v8

    aput-object v7, v14, v10

    const/4 v0, 0x5

    aput-object v9, v14, v0

    const/4 v0, 0x6

    aput-object v11, v14, v0

    const/4 v0, 0x7

    aput-object v13, v14, v0

    aput-object v15, v14, v12

    sput-object v14, Lcom/aggmoread/sdk/client/AMAdType;->$VALUES:[Lcom/aggmoread/sdk/client/AMAdType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/aggmoread/sdk/client/AMAdType;
    .locals 1

    const-class v0, Lcom/aggmoread/sdk/client/AMAdType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/aggmoread/sdk/client/AMAdType;

    return-object p0
.end method

.method public static values()[Lcom/aggmoread/sdk/client/AMAdType;
    .locals 1

    sget-object v0, Lcom/aggmoread/sdk/client/AMAdType;->$VALUES:[Lcom/aggmoread/sdk/client/AMAdType;

    invoke-virtual {v0}, [Lcom/aggmoread/sdk/client/AMAdType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/aggmoread/sdk/client/AMAdType;

    return-object v0
.end method
