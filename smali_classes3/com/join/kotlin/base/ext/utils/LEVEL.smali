.class final enum Lcom/join/kotlin/base/ext/utils/LEVEL;
.super Ljava/lang/Enum;
.source "LogExt.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/join/kotlin/base/ext/utils/LEVEL;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/join/kotlin/base/ext/utils/LEVEL;

.field public static final enum D:Lcom/join/kotlin/base/ext/utils/LEVEL;

.field public static final enum E:Lcom/join/kotlin/base/ext/utils/LEVEL;

.field public static final enum I:Lcom/join/kotlin/base/ext/utils/LEVEL;

.field public static final enum V:Lcom/join/kotlin/base/ext/utils/LEVEL;

.field public static final enum W:Lcom/join/kotlin/base/ext/utils/LEVEL;


# direct methods
.method private static final synthetic $values()[Lcom/join/kotlin/base/ext/utils/LEVEL;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Lcom/join/kotlin/base/ext/utils/LEVEL;

    sget-object v1, Lcom/join/kotlin/base/ext/utils/LEVEL;->V:Lcom/join/kotlin/base/ext/utils/LEVEL;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/join/kotlin/base/ext/utils/LEVEL;->D:Lcom/join/kotlin/base/ext/utils/LEVEL;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/join/kotlin/base/ext/utils/LEVEL;->I:Lcom/join/kotlin/base/ext/utils/LEVEL;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/join/kotlin/base/ext/utils/LEVEL;->W:Lcom/join/kotlin/base/ext/utils/LEVEL;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/join/kotlin/base/ext/utils/LEVEL;->E:Lcom/join/kotlin/base/ext/utils/LEVEL;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/kotlin/base/ext/utils/LEVEL;

    const-string v1, "V"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/join/kotlin/base/ext/utils/LEVEL;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/join/kotlin/base/ext/utils/LEVEL;->V:Lcom/join/kotlin/base/ext/utils/LEVEL;

    new-instance v0, Lcom/join/kotlin/base/ext/utils/LEVEL;

    const-string v1, "D"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/join/kotlin/base/ext/utils/LEVEL;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/join/kotlin/base/ext/utils/LEVEL;->D:Lcom/join/kotlin/base/ext/utils/LEVEL;

    new-instance v0, Lcom/join/kotlin/base/ext/utils/LEVEL;

    const-string v1, "I"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/join/kotlin/base/ext/utils/LEVEL;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/join/kotlin/base/ext/utils/LEVEL;->I:Lcom/join/kotlin/base/ext/utils/LEVEL;

    new-instance v0, Lcom/join/kotlin/base/ext/utils/LEVEL;

    const-string v1, "W"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/join/kotlin/base/ext/utils/LEVEL;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/join/kotlin/base/ext/utils/LEVEL;->W:Lcom/join/kotlin/base/ext/utils/LEVEL;

    new-instance v0, Lcom/join/kotlin/base/ext/utils/LEVEL;

    const-string v1, "E"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/join/kotlin/base/ext/utils/LEVEL;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/join/kotlin/base/ext/utils/LEVEL;->E:Lcom/join/kotlin/base/ext/utils/LEVEL;

    invoke-static {}, Lcom/join/kotlin/base/ext/utils/LEVEL;->$values()[Lcom/join/kotlin/base/ext/utils/LEVEL;

    move-result-object v0

    sput-object v0, Lcom/join/kotlin/base/ext/utils/LEVEL;->$VALUES:[Lcom/join/kotlin/base/ext/utils/LEVEL;

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

.method public static valueOf(Ljava/lang/String;)Lcom/join/kotlin/base/ext/utils/LEVEL;
    .locals 1

    const-class v0, Lcom/join/kotlin/base/ext/utils/LEVEL;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/join/kotlin/base/ext/utils/LEVEL;

    return-object p0
.end method

.method public static values()[Lcom/join/kotlin/base/ext/utils/LEVEL;
    .locals 1

    sget-object v0, Lcom/join/kotlin/base/ext/utils/LEVEL;->$VALUES:[Lcom/join/kotlin/base/ext/utils/LEVEL;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/join/kotlin/base/ext/utils/LEVEL;

    return-object v0
.end method
