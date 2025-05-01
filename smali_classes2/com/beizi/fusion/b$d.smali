.class public final enum Lcom/beizi/fusion/b$d;
.super Ljava/lang/Enum;
.source "MBridgeSDKManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/fusion/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/beizi/fusion/b$d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/beizi/fusion/b$d;

.field public static final enum b:Lcom/beizi/fusion/b$d;

.field public static final enum c:Lcom/beizi/fusion/b$d;

.field public static final enum d:Lcom/beizi/fusion/b$d;

.field private static final synthetic e:[Lcom/beizi/fusion/b$d;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lcom/beizi/fusion/b$d;

    const-string v1, "SDK_STATE_UN_INITIALIZE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/beizi/fusion/b$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/beizi/fusion/b$d;->a:Lcom/beizi/fusion/b$d;

    .line 2
    new-instance v1, Lcom/beizi/fusion/b$d;

    const-string v3, "SDK_STATE_INITIALIZING"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/beizi/fusion/b$d;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/beizi/fusion/b$d;->b:Lcom/beizi/fusion/b$d;

    .line 3
    new-instance v3, Lcom/beizi/fusion/b$d;

    const-string v5, "SDK_STATE_INITIALIZE_SUCCESS"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/beizi/fusion/b$d;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/beizi/fusion/b$d;->c:Lcom/beizi/fusion/b$d;

    .line 4
    new-instance v5, Lcom/beizi/fusion/b$d;

    const-string v7, "SDK_STATE_INITIALIZE_FAILURE"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lcom/beizi/fusion/b$d;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/beizi/fusion/b$d;->d:Lcom/beizi/fusion/b$d;

    const/4 v7, 0x4

    new-array v7, v7, [Lcom/beizi/fusion/b$d;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    .line 5
    sput-object v7, Lcom/beizi/fusion/b$d;->e:[Lcom/beizi/fusion/b$d;

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

.method public static valueOf(Ljava/lang/String;)Lcom/beizi/fusion/b$d;
    .locals 1

    .line 1
    const-class v0, Lcom/beizi/fusion/b$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/beizi/fusion/b$d;

    return-object p0
.end method

.method public static values()[Lcom/beizi/fusion/b$d;
    .locals 1

    .line 1
    sget-object v0, Lcom/beizi/fusion/b$d;->e:[Lcom/beizi/fusion/b$d;

    invoke-virtual {v0}, [Lcom/beizi/fusion/b$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/beizi/fusion/b$d;

    return-object v0
.end method
