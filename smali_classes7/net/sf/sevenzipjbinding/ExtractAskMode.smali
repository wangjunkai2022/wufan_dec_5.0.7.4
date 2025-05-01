.class public final enum Lnet/sf/sevenzipjbinding/ExtractAskMode;
.super Ljava/lang/Enum;
.source "ExtractAskMode.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/sf/sevenzipjbinding/ExtractAskMode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/sf/sevenzipjbinding/ExtractAskMode;

.field public static final enum EXTRACT:Lnet/sf/sevenzipjbinding/ExtractAskMode;

.field public static final enum SKIP:Lnet/sf/sevenzipjbinding/ExtractAskMode;

.field public static final enum TEST:Lnet/sf/sevenzipjbinding/ExtractAskMode;

.field public static final enum UNKNOWN_ASK_MODE:Lnet/sf/sevenzipjbinding/ExtractAskMode;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lnet/sf/sevenzipjbinding/ExtractAskMode;

    const-string v1, "EXTRACT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lnet/sf/sevenzipjbinding/ExtractAskMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ExtractAskMode;->EXTRACT:Lnet/sf/sevenzipjbinding/ExtractAskMode;

    .line 2
    new-instance v1, Lnet/sf/sevenzipjbinding/ExtractAskMode;

    const-string v3, "TEST"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lnet/sf/sevenzipjbinding/ExtractAskMode;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lnet/sf/sevenzipjbinding/ExtractAskMode;->TEST:Lnet/sf/sevenzipjbinding/ExtractAskMode;

    .line 3
    new-instance v3, Lnet/sf/sevenzipjbinding/ExtractAskMode;

    const-string v5, "SKIP"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lnet/sf/sevenzipjbinding/ExtractAskMode;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lnet/sf/sevenzipjbinding/ExtractAskMode;->SKIP:Lnet/sf/sevenzipjbinding/ExtractAskMode;

    .line 4
    new-instance v5, Lnet/sf/sevenzipjbinding/ExtractAskMode;

    const-string v7, "UNKNOWN_ASK_MODE"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lnet/sf/sevenzipjbinding/ExtractAskMode;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lnet/sf/sevenzipjbinding/ExtractAskMode;->UNKNOWN_ASK_MODE:Lnet/sf/sevenzipjbinding/ExtractAskMode;

    const/4 v7, 0x4

    new-array v7, v7, [Lnet/sf/sevenzipjbinding/ExtractAskMode;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    .line 5
    sput-object v7, Lnet/sf/sevenzipjbinding/ExtractAskMode;->$VALUES:[Lnet/sf/sevenzipjbinding/ExtractAskMode;

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

.method public static getExtractAskModeByIndex(I)Lnet/sf/sevenzipjbinding/ExtractAskMode;
    .locals 1

    if-ltz p0, :cond_0

    .line 1
    invoke-static {}, Lnet/sf/sevenzipjbinding/ExtractAskMode;->values()[Lnet/sf/sevenzipjbinding/ExtractAskMode;

    move-result-object v0

    array-length v0, v0

    if-ge p0, v0, :cond_0

    .line 2
    invoke-static {}, Lnet/sf/sevenzipjbinding/ExtractAskMode;->values()[Lnet/sf/sevenzipjbinding/ExtractAskMode;

    move-result-object v0

    aget-object p0, v0, p0

    return-object p0

    .line 3
    :cond_0
    sget-object p0, Lnet/sf/sevenzipjbinding/ExtractAskMode;->UNKNOWN_ASK_MODE:Lnet/sf/sevenzipjbinding/ExtractAskMode;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/sf/sevenzipjbinding/ExtractAskMode;
    .locals 1

    .line 1
    const-class v0, Lnet/sf/sevenzipjbinding/ExtractAskMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/sf/sevenzipjbinding/ExtractAskMode;

    return-object p0
.end method

.method public static values()[Lnet/sf/sevenzipjbinding/ExtractAskMode;
    .locals 1

    .line 1
    sget-object v0, Lnet/sf/sevenzipjbinding/ExtractAskMode;->$VALUES:[Lnet/sf/sevenzipjbinding/ExtractAskMode;

    invoke-virtual {v0}, [Lnet/sf/sevenzipjbinding/ExtractAskMode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/sf/sevenzipjbinding/ExtractAskMode;

    return-object v0
.end method
