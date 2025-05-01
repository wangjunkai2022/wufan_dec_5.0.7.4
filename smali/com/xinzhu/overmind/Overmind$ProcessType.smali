.class final enum Lcom/xinzhu/overmind/Overmind$ProcessType;
.super Ljava/lang/Enum;
.source "Overmind.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xinzhu/overmind/Overmind;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "ProcessType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/xinzhu/overmind/Overmind$ProcessType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/xinzhu/overmind/Overmind$ProcessType;

.field public static final enum MAppClient:Lcom/xinzhu/overmind/Overmind$ProcessType;

.field public static final enum Main:Lcom/xinzhu/overmind/Overmind$ProcessType;

.field public static final enum Others:Lcom/xinzhu/overmind/Overmind$ProcessType;

.field public static final enum PluginMonitor:Lcom/xinzhu/overmind/Overmind$ProcessType;

.field public static final enum Server:Lcom/xinzhu/overmind/Overmind$ProcessType;


# direct methods
.method private static synthetic $values()[Lcom/xinzhu/overmind/Overmind$ProcessType;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Lcom/xinzhu/overmind/Overmind$ProcessType;

    .line 1
    sget-object v1, Lcom/xinzhu/overmind/Overmind$ProcessType;->Server:Lcom/xinzhu/overmind/Overmind$ProcessType;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/xinzhu/overmind/Overmind$ProcessType;->MAppClient:Lcom/xinzhu/overmind/Overmind$ProcessType;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/xinzhu/overmind/Overmind$ProcessType;->Main:Lcom/xinzhu/overmind/Overmind$ProcessType;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/xinzhu/overmind/Overmind$ProcessType;->PluginMonitor:Lcom/xinzhu/overmind/Overmind$ProcessType;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/xinzhu/overmind/Overmind$ProcessType;->Others:Lcom/xinzhu/overmind/Overmind$ProcessType;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/xinzhu/overmind/Overmind$ProcessType;

    const-string v1, "Server"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/xinzhu/overmind/Overmind$ProcessType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/xinzhu/overmind/Overmind$ProcessType;->Server:Lcom/xinzhu/overmind/Overmind$ProcessType;

    .line 2
    new-instance v0, Lcom/xinzhu/overmind/Overmind$ProcessType;

    const-string v1, "MAppClient"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/xinzhu/overmind/Overmind$ProcessType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/xinzhu/overmind/Overmind$ProcessType;->MAppClient:Lcom/xinzhu/overmind/Overmind$ProcessType;

    .line 3
    new-instance v0, Lcom/xinzhu/overmind/Overmind$ProcessType;

    const-string v1, "Main"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/xinzhu/overmind/Overmind$ProcessType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/xinzhu/overmind/Overmind$ProcessType;->Main:Lcom/xinzhu/overmind/Overmind$ProcessType;

    .line 4
    new-instance v0, Lcom/xinzhu/overmind/Overmind$ProcessType;

    const-string v1, "PluginMonitor"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/xinzhu/overmind/Overmind$ProcessType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/xinzhu/overmind/Overmind$ProcessType;->PluginMonitor:Lcom/xinzhu/overmind/Overmind$ProcessType;

    .line 5
    new-instance v0, Lcom/xinzhu/overmind/Overmind$ProcessType;

    const-string v1, "Others"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/xinzhu/overmind/Overmind$ProcessType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/xinzhu/overmind/Overmind$ProcessType;->Others:Lcom/xinzhu/overmind/Overmind$ProcessType;

    .line 6
    invoke-static {}, Lcom/xinzhu/overmind/Overmind$ProcessType;->$values()[Lcom/xinzhu/overmind/Overmind$ProcessType;

    move-result-object v0

    sput-object v0, Lcom/xinzhu/overmind/Overmind$ProcessType;->$VALUES:[Lcom/xinzhu/overmind/Overmind$ProcessType;

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

.method public static valueOf(Ljava/lang/String;)Lcom/xinzhu/overmind/Overmind$ProcessType;
    .locals 1

    .line 1
    const-class v0, Lcom/xinzhu/overmind/Overmind$ProcessType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/xinzhu/overmind/Overmind$ProcessType;

    return-object p0
.end method

.method public static values()[Lcom/xinzhu/overmind/Overmind$ProcessType;
    .locals 1

    .line 1
    sget-object v0, Lcom/xinzhu/overmind/Overmind$ProcessType;->$VALUES:[Lcom/xinzhu/overmind/Overmind$ProcessType;

    invoke-virtual {v0}, [Lcom/xinzhu/overmind/Overmind$ProcessType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/xinzhu/overmind/Overmind$ProcessType;

    return-object v0
.end method
