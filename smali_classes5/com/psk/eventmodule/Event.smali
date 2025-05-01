.class public final enum Lcom/psk/eventmodule/Event;
.super Ljava/lang/Enum;
.source "Event.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/psk/eventmodule/Event;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/psk/eventmodule/Event;

.field public static final enum check:Lcom/psk/eventmodule/Event;

.field public static final enum click:Lcom/psk/eventmodule/Event;

.field public static final enum conversion:Lcom/psk/eventmodule/Event;

.field public static final enum exposure:Lcom/psk/eventmodule/Event;

.field public static final enum itemClick:Lcom/psk/eventmodule/Event;

.field public static final enum startApp:Lcom/psk/eventmodule/Event;

.field public static final enum visitPage:Lcom/psk/eventmodule/Event;


# direct methods
.method private static final synthetic $values()[Lcom/psk/eventmodule/Event;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Lcom/psk/eventmodule/Event;

    sget-object v1, Lcom/psk/eventmodule/Event;->startApp:Lcom/psk/eventmodule/Event;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/psk/eventmodule/Event;->visitPage:Lcom/psk/eventmodule/Event;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/psk/eventmodule/Event;->itemClick:Lcom/psk/eventmodule/Event;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/psk/eventmodule/Event;->exposure:Lcom/psk/eventmodule/Event;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/psk/eventmodule/Event;->conversion:Lcom/psk/eventmodule/Event;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/psk/eventmodule/Event;->click:Lcom/psk/eventmodule/Event;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/psk/eventmodule/Event;->check:Lcom/psk/eventmodule/Event;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/psk/eventmodule/Event;

    const-string v1, "startApp"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/psk/eventmodule/Event;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/psk/eventmodule/Event;->startApp:Lcom/psk/eventmodule/Event;

    new-instance v0, Lcom/psk/eventmodule/Event;

    const-string v1, "visitPage"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/psk/eventmodule/Event;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/psk/eventmodule/Event;->visitPage:Lcom/psk/eventmodule/Event;

    new-instance v0, Lcom/psk/eventmodule/Event;

    const-string v1, "itemClick"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/psk/eventmodule/Event;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/psk/eventmodule/Event;->itemClick:Lcom/psk/eventmodule/Event;

    .line 2
    new-instance v0, Lcom/psk/eventmodule/Event;

    const-string v1, "exposure"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/psk/eventmodule/Event;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/psk/eventmodule/Event;->exposure:Lcom/psk/eventmodule/Event;

    new-instance v0, Lcom/psk/eventmodule/Event;

    const-string v1, "conversion"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/psk/eventmodule/Event;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/psk/eventmodule/Event;->conversion:Lcom/psk/eventmodule/Event;

    new-instance v0, Lcom/psk/eventmodule/Event;

    const-string v1, "click"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/psk/eventmodule/Event;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/psk/eventmodule/Event;->click:Lcom/psk/eventmodule/Event;

    new-instance v0, Lcom/psk/eventmodule/Event;

    const-string v1, "check"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/psk/eventmodule/Event;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/psk/eventmodule/Event;->check:Lcom/psk/eventmodule/Event;

    invoke-static {}, Lcom/psk/eventmodule/Event;->$values()[Lcom/psk/eventmodule/Event;

    move-result-object v0

    sput-object v0, Lcom/psk/eventmodule/Event;->$VALUES:[Lcom/psk/eventmodule/Event;

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

.method public static valueOf(Ljava/lang/String;)Lcom/psk/eventmodule/Event;
    .locals 1

    const-class v0, Lcom/psk/eventmodule/Event;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/psk/eventmodule/Event;

    return-object p0
.end method

.method public static values()[Lcom/psk/eventmodule/Event;
    .locals 1

    sget-object v0, Lcom/psk/eventmodule/Event;->$VALUES:[Lcom/psk/eventmodule/Event;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/psk/eventmodule/Event;

    return-object v0
.end method
