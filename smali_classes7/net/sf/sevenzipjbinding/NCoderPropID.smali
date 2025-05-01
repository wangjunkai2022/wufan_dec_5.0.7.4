.class public final enum Lnet/sf/sevenzipjbinding/NCoderPropID;
.super Ljava/lang/Enum;
.source "NCoderPropID.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/sf/sevenzipjbinding/NCoderPropID;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/sf/sevenzipjbinding/NCoderPropID;

.field public static final enum kAlgorithm:Lnet/sf/sevenzipjbinding/NCoderPropID;

.field public static final enum kBlockSize:Lnet/sf/sevenzipjbinding/NCoderPropID;

.field public static final enum kDefaultProp:Lnet/sf/sevenzipjbinding/NCoderPropID;

.field public static final enum kDictionarySize:Lnet/sf/sevenzipjbinding/NCoderPropID;

.field public static final enum kEndMarker:Lnet/sf/sevenzipjbinding/NCoderPropID;

.field public static final enum kLitContextBits:Lnet/sf/sevenzipjbinding/NCoderPropID;

.field public static final enum kLitPosBits:Lnet/sf/sevenzipjbinding/NCoderPropID;

.field public static final enum kMatchFinder:Lnet/sf/sevenzipjbinding/NCoderPropID;

.field public static final enum kMatchFinderCycles:Lnet/sf/sevenzipjbinding/NCoderPropID;

.field public static final enum kNumFastBytes:Lnet/sf/sevenzipjbinding/NCoderPropID;

.field public static final enum kNumPasses:Lnet/sf/sevenzipjbinding/NCoderPropID;

.field public static final enum kNumThreads:Lnet/sf/sevenzipjbinding/NCoderPropID;

.field public static final enum kOrder:Lnet/sf/sevenzipjbinding/NCoderPropID;

.field public static final enum kPosStateBits:Lnet/sf/sevenzipjbinding/NCoderPropID;

.field public static final enum kUsedMemorySize:Lnet/sf/sevenzipjbinding/NCoderPropID;


# instance fields
.field private final clazz:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private final option:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 19

    .line 1
    new-instance v0, Lnet/sf/sevenzipjbinding/NCoderPropID;

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-string v2, "kBlockSize"

    const/4 v3, 0x0

    const-string v4, "C"

    invoke-direct {v0, v2, v3, v1, v4}, Lnet/sf/sevenzipjbinding/NCoderPropID;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Lnet/sf/sevenzipjbinding/NCoderPropID;->kBlockSize:Lnet/sf/sevenzipjbinding/NCoderPropID;

    .line 2
    new-instance v2, Lnet/sf/sevenzipjbinding/NCoderPropID;

    const-string v4, "kDictionarySize"

    const/4 v5, 0x1

    const-string v6, "D"

    invoke-direct {v2, v4, v5, v1, v6}, Lnet/sf/sevenzipjbinding/NCoderPropID;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v2, Lnet/sf/sevenzipjbinding/NCoderPropID;->kDictionarySize:Lnet/sf/sevenzipjbinding/NCoderPropID;

    .line 3
    new-instance v4, Lnet/sf/sevenzipjbinding/NCoderPropID;

    const-string v6, "kUsedMemorySize"

    const/4 v7, 0x2

    const-string v8, "MEM"

    invoke-direct {v4, v6, v7, v1, v8}, Lnet/sf/sevenzipjbinding/NCoderPropID;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v4, Lnet/sf/sevenzipjbinding/NCoderPropID;->kUsedMemorySize:Lnet/sf/sevenzipjbinding/NCoderPropID;

    .line 4
    new-instance v6, Lnet/sf/sevenzipjbinding/NCoderPropID;

    const-string v8, "kOrder"

    const/4 v9, 0x3

    const-string v10, "O"

    invoke-direct {v6, v8, v9, v1, v10}, Lnet/sf/sevenzipjbinding/NCoderPropID;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v6, Lnet/sf/sevenzipjbinding/NCoderPropID;->kOrder:Lnet/sf/sevenzipjbinding/NCoderPropID;

    .line 5
    new-instance v8, Lnet/sf/sevenzipjbinding/NCoderPropID;

    const-string v10, "kPosStateBits"

    const/4 v11, 0x4

    const-string v12, "PB"

    invoke-direct {v8, v10, v11, v1, v12}, Lnet/sf/sevenzipjbinding/NCoderPropID;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v8, Lnet/sf/sevenzipjbinding/NCoderPropID;->kPosStateBits:Lnet/sf/sevenzipjbinding/NCoderPropID;

    .line 6
    new-instance v10, Lnet/sf/sevenzipjbinding/NCoderPropID;

    const-string v12, "kLitContextBits"

    const/4 v13, 0x5

    const-string v14, "LC"

    invoke-direct {v10, v12, v13, v1, v14}, Lnet/sf/sevenzipjbinding/NCoderPropID;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v10, Lnet/sf/sevenzipjbinding/NCoderPropID;->kLitContextBits:Lnet/sf/sevenzipjbinding/NCoderPropID;

    .line 7
    new-instance v12, Lnet/sf/sevenzipjbinding/NCoderPropID;

    const-string v14, "kLitPosBits"

    const/4 v15, 0x6

    const-string v13, "LP"

    invoke-direct {v12, v14, v15, v1, v13}, Lnet/sf/sevenzipjbinding/NCoderPropID;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v12, Lnet/sf/sevenzipjbinding/NCoderPropID;->kLitPosBits:Lnet/sf/sevenzipjbinding/NCoderPropID;

    .line 8
    new-instance v13, Lnet/sf/sevenzipjbinding/NCoderPropID;

    sget-object v14, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const-string v15, "kEndMarker"

    const/4 v11, 0x7

    const-string v9, "eos"

    invoke-direct {v13, v15, v11, v14, v9}, Lnet/sf/sevenzipjbinding/NCoderPropID;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v13, Lnet/sf/sevenzipjbinding/NCoderPropID;->kEndMarker:Lnet/sf/sevenzipjbinding/NCoderPropID;

    .line 9
    new-instance v9, Lnet/sf/sevenzipjbinding/NCoderPropID;

    const-string v14, "kNumPasses"

    const/16 v15, 0x8

    const-string v11, "Pass"

    invoke-direct {v9, v14, v15, v1, v11}, Lnet/sf/sevenzipjbinding/NCoderPropID;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v9, Lnet/sf/sevenzipjbinding/NCoderPropID;->kNumPasses:Lnet/sf/sevenzipjbinding/NCoderPropID;

    .line 10
    new-instance v11, Lnet/sf/sevenzipjbinding/NCoderPropID;

    const-string v14, "kNumFastBytes"

    const/16 v15, 0x9

    const-string v7, "fb"

    invoke-direct {v11, v14, v15, v1, v7}, Lnet/sf/sevenzipjbinding/NCoderPropID;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v11, Lnet/sf/sevenzipjbinding/NCoderPropID;->kNumFastBytes:Lnet/sf/sevenzipjbinding/NCoderPropID;

    .line 11
    new-instance v7, Lnet/sf/sevenzipjbinding/NCoderPropID;

    const-string v14, "kMatchFinderCycles"

    const/16 v15, 0xa

    const-string v5, "mc"

    invoke-direct {v7, v14, v15, v1, v5}, Lnet/sf/sevenzipjbinding/NCoderPropID;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v7, Lnet/sf/sevenzipjbinding/NCoderPropID;->kMatchFinderCycles:Lnet/sf/sevenzipjbinding/NCoderPropID;

    .line 12
    new-instance v5, Lnet/sf/sevenzipjbinding/NCoderPropID;

    const-string v14, "kAlgorithm"

    const/16 v15, 0xb

    const-string v3, "a"

    invoke-direct {v5, v14, v15, v1, v3}, Lnet/sf/sevenzipjbinding/NCoderPropID;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v5, Lnet/sf/sevenzipjbinding/NCoderPropID;->kAlgorithm:Lnet/sf/sevenzipjbinding/NCoderPropID;

    .line 13
    new-instance v3, Lnet/sf/sevenzipjbinding/NCoderPropID;

    const-class v14, Ljava/lang/String;

    const-string v15, "kMatchFinder"

    move-object/from16 v16, v5

    const/16 v5, 0xc

    move-object/from16 v17, v7

    const-string v7, "mf"

    invoke-direct {v3, v15, v5, v14, v7}, Lnet/sf/sevenzipjbinding/NCoderPropID;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v3, Lnet/sf/sevenzipjbinding/NCoderPropID;->kMatchFinder:Lnet/sf/sevenzipjbinding/NCoderPropID;

    .line 14
    new-instance v7, Lnet/sf/sevenzipjbinding/NCoderPropID;

    const-string v14, "kNumThreads"

    const/16 v15, 0xd

    const-string v5, "mt"

    invoke-direct {v7, v14, v15, v1, v5}, Lnet/sf/sevenzipjbinding/NCoderPropID;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v7, Lnet/sf/sevenzipjbinding/NCoderPropID;->kNumThreads:Lnet/sf/sevenzipjbinding/NCoderPropID;

    .line 15
    new-instance v5, Lnet/sf/sevenzipjbinding/NCoderPropID;

    const-string v14, "kDefaultProp"

    const/16 v15, 0xe

    move-object/from16 v18, v7

    const-string v7, ""

    invoke-direct {v5, v14, v15, v1, v7}, Lnet/sf/sevenzipjbinding/NCoderPropID;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v5, Lnet/sf/sevenzipjbinding/NCoderPropID;->kDefaultProp:Lnet/sf/sevenzipjbinding/NCoderPropID;

    const/16 v1, 0xf

    new-array v1, v1, [Lnet/sf/sevenzipjbinding/NCoderPropID;

    const/4 v7, 0x0

    aput-object v0, v1, v7

    const/4 v0, 0x1

    aput-object v2, v1, v0

    const/4 v0, 0x2

    aput-object v4, v1, v0

    const/4 v0, 0x3

    aput-object v6, v1, v0

    const/4 v0, 0x4

    aput-object v8, v1, v0

    const/4 v0, 0x5

    aput-object v10, v1, v0

    const/4 v0, 0x6

    aput-object v12, v1, v0

    const/4 v0, 0x7

    aput-object v13, v1, v0

    const/16 v0, 0x8

    aput-object v9, v1, v0

    const/16 v0, 0x9

    aput-object v11, v1, v0

    const/16 v0, 0xa

    aput-object v17, v1, v0

    const/16 v0, 0xb

    aput-object v16, v1, v0

    const/16 v0, 0xc

    aput-object v3, v1, v0

    const/16 v0, 0xd

    aput-object v18, v1, v0

    aput-object v5, v1, v15

    .line 16
    sput-object v1, Lnet/sf/sevenzipjbinding/NCoderPropID;->$VALUES:[Lnet/sf/sevenzipjbinding/NCoderPropID;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput-object p3, p0, Lnet/sf/sevenzipjbinding/NCoderPropID;->clazz:Ljava/lang/Class;

    .line 3
    iput-object p4, p0, Lnet/sf/sevenzipjbinding/NCoderPropID;->option:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/sf/sevenzipjbinding/NCoderPropID;
    .locals 1

    .line 1
    const-class v0, Lnet/sf/sevenzipjbinding/NCoderPropID;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/sf/sevenzipjbinding/NCoderPropID;

    return-object p0
.end method

.method public static values()[Lnet/sf/sevenzipjbinding/NCoderPropID;
    .locals 1

    .line 1
    sget-object v0, Lnet/sf/sevenzipjbinding/NCoderPropID;->$VALUES:[Lnet/sf/sevenzipjbinding/NCoderPropID;

    invoke-virtual {v0}, [Lnet/sf/sevenzipjbinding/NCoderPropID;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/sf/sevenzipjbinding/NCoderPropID;

    return-object v0
.end method
