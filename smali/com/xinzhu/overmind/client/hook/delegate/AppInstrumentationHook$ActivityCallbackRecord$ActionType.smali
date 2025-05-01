.class final enum Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;
.super Ljava/lang/Enum;
.source "AppInstrumentationHook.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "ActionType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

.field public static final enum ActivitySaveInstanceState:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

.field public static final enum Create:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

.field public static final enum Destroy:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

.field public static final enum Pause:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

.field public static final enum Resume:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

.field public static final enum Start:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

.field public static final enum Stop:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;


# direct methods
.method private static synthetic $values()[Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    .line 1
    sget-object v1, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;->Create:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;->Start:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;->Resume:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;->Pause:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;->Stop:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;->Destroy:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;->ActivitySaveInstanceState:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    const-string v1, "Create"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;->Create:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    .line 2
    new-instance v0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    const-string v1, "Start"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;->Start:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    .line 3
    new-instance v0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    const-string v1, "Resume"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;->Resume:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    .line 4
    new-instance v0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    const-string v1, "Pause"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;->Pause:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    .line 5
    new-instance v0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    const-string v1, "Stop"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;->Stop:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    .line 6
    new-instance v0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    const-string v1, "Destroy"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;->Destroy:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    .line 7
    new-instance v0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    const-string v1, "ActivitySaveInstanceState"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;->ActivitySaveInstanceState:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    .line 8
    invoke-static {}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;->$values()[Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    move-result-object v0

    sput-object v0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;->$VALUES:[Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

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

.method public static valueOf(Ljava/lang/String;)Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;
    .locals 1

    .line 1
    const-class v0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    return-object p0
.end method

.method public static values()[Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;
    .locals 1

    .line 1
    sget-object v0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;->$VALUES:[Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    invoke-virtual {v0}, [Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    return-object v0
.end method
