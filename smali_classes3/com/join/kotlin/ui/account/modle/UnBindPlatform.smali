.class public final enum Lcom/join/kotlin/ui/account/modle/UnBindPlatform;
.super Ljava/lang/Enum;
.source "UnBindPlatform.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/join/kotlin/ui/account/modle/UnBindPlatform;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/join/kotlin/ui/account/modle/UnBindPlatform;

.field public static final enum QQ_OPENID:Lcom/join/kotlin/ui/account/modle/UnBindPlatform;

.field public static final enum WB_OPENID:Lcom/join/kotlin/ui/account/modle/UnBindPlatform;

.field public static final enum WEIXIN_OPENID:Lcom/join/kotlin/ui/account/modle/UnBindPlatform;


# direct methods
.method private static final synthetic $values()[Lcom/join/kotlin/ui/account/modle/UnBindPlatform;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/join/kotlin/ui/account/modle/UnBindPlatform;

    sget-object v1, Lcom/join/kotlin/ui/account/modle/UnBindPlatform;->WB_OPENID:Lcom/join/kotlin/ui/account/modle/UnBindPlatform;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/join/kotlin/ui/account/modle/UnBindPlatform;->QQ_OPENID:Lcom/join/kotlin/ui/account/modle/UnBindPlatform;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/join/kotlin/ui/account/modle/UnBindPlatform;->WEIXIN_OPENID:Lcom/join/kotlin/ui/account/modle/UnBindPlatform;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/kotlin/ui/account/modle/UnBindPlatform;

    const-string v1, "WB_OPENID"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/join/kotlin/ui/account/modle/UnBindPlatform;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/join/kotlin/ui/account/modle/UnBindPlatform;->WB_OPENID:Lcom/join/kotlin/ui/account/modle/UnBindPlatform;

    new-instance v0, Lcom/join/kotlin/ui/account/modle/UnBindPlatform;

    const-string v1, "QQ_OPENID"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/join/kotlin/ui/account/modle/UnBindPlatform;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/join/kotlin/ui/account/modle/UnBindPlatform;->QQ_OPENID:Lcom/join/kotlin/ui/account/modle/UnBindPlatform;

    new-instance v0, Lcom/join/kotlin/ui/account/modle/UnBindPlatform;

    const-string v1, "WEIXIN_OPENID"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/join/kotlin/ui/account/modle/UnBindPlatform;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/join/kotlin/ui/account/modle/UnBindPlatform;->WEIXIN_OPENID:Lcom/join/kotlin/ui/account/modle/UnBindPlatform;

    invoke-static {}, Lcom/join/kotlin/ui/account/modle/UnBindPlatform;->$values()[Lcom/join/kotlin/ui/account/modle/UnBindPlatform;

    move-result-object v0

    sput-object v0, Lcom/join/kotlin/ui/account/modle/UnBindPlatform;->$VALUES:[Lcom/join/kotlin/ui/account/modle/UnBindPlatform;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/join/kotlin/ui/account/modle/UnBindPlatform;
    .locals 1

    const-class v0, Lcom/join/kotlin/ui/account/modle/UnBindPlatform;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/join/kotlin/ui/account/modle/UnBindPlatform;

    return-object p0
.end method

.method public static values()[Lcom/join/kotlin/ui/account/modle/UnBindPlatform;
    .locals 1

    sget-object v0, Lcom/join/kotlin/ui/account/modle/UnBindPlatform;->$VALUES:[Lcom/join/kotlin/ui/account/modle/UnBindPlatform;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/join/kotlin/ui/account/modle/UnBindPlatform;

    return-object v0
.end method
