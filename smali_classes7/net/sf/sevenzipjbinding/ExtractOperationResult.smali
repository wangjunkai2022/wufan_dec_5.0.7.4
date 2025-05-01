.class public final enum Lnet/sf/sevenzipjbinding/ExtractOperationResult;
.super Ljava/lang/Enum;
.source "ExtractOperationResult.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/sf/sevenzipjbinding/ExtractOperationResult;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/sf/sevenzipjbinding/ExtractOperationResult;

.field public static final enum CRCERROR:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

.field public static final enum DATAERROR:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

.field public static final enum DATA_AFTER_END:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

.field public static final enum HEADERS_ERROR:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

.field public static final enum IS_NOT_ARC:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

.field public static final enum OK:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

.field public static final enum UNAVAILABLE:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

.field public static final enum UNEXPECTED_END:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

.field public static final enum UNKNOWN_OPERATION_RESULT:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

.field public static final enum UNSUPPORTEDMETHOD:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

.field public static final enum WRONG_PASSWORD:Lnet/sf/sevenzipjbinding/ExtractOperationResult;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    const-string v1, "OK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lnet/sf/sevenzipjbinding/ExtractOperationResult;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->OK:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    .line 2
    new-instance v1, Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    const-string v3, "UNSUPPORTEDMETHOD"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lnet/sf/sevenzipjbinding/ExtractOperationResult;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->UNSUPPORTEDMETHOD:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    .line 3
    new-instance v3, Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    const-string v5, "DATAERROR"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lnet/sf/sevenzipjbinding/ExtractOperationResult;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->DATAERROR:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    .line 4
    new-instance v5, Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    const-string v7, "CRCERROR"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lnet/sf/sevenzipjbinding/ExtractOperationResult;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->CRCERROR:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    .line 5
    new-instance v7, Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    const-string v9, "UNAVAILABLE"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lnet/sf/sevenzipjbinding/ExtractOperationResult;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->UNAVAILABLE:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    .line 6
    new-instance v9, Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    const-string v11, "UNEXPECTED_END"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Lnet/sf/sevenzipjbinding/ExtractOperationResult;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->UNEXPECTED_END:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    .line 7
    new-instance v11, Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    const-string v13, "DATA_AFTER_END"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14}, Lnet/sf/sevenzipjbinding/ExtractOperationResult;-><init>(Ljava/lang/String;I)V

    sput-object v11, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->DATA_AFTER_END:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    .line 8
    new-instance v13, Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    const-string v15, "IS_NOT_ARC"

    const/4 v14, 0x7

    invoke-direct {v13, v15, v14}, Lnet/sf/sevenzipjbinding/ExtractOperationResult;-><init>(Ljava/lang/String;I)V

    sput-object v13, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->IS_NOT_ARC:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    .line 9
    new-instance v15, Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    const-string v14, "HEADERS_ERROR"

    const/16 v12, 0x8

    invoke-direct {v15, v14, v12}, Lnet/sf/sevenzipjbinding/ExtractOperationResult;-><init>(Ljava/lang/String;I)V

    sput-object v15, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->HEADERS_ERROR:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    .line 10
    new-instance v14, Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    const-string v12, "WRONG_PASSWORD"

    const/16 v10, 0x9

    invoke-direct {v14, v12, v10}, Lnet/sf/sevenzipjbinding/ExtractOperationResult;-><init>(Ljava/lang/String;I)V

    sput-object v14, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->WRONG_PASSWORD:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    .line 11
    new-instance v12, Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    const-string v10, "UNKNOWN_OPERATION_RESULT"

    const/16 v8, 0xa

    invoke-direct {v12, v10, v8}, Lnet/sf/sevenzipjbinding/ExtractOperationResult;-><init>(Ljava/lang/String;I)V

    sput-object v12, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->UNKNOWN_OPERATION_RESULT:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    const/16 v10, 0xb

    new-array v10, v10, [Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    aput-object v0, v10, v2

    aput-object v1, v10, v4

    aput-object v3, v10, v6

    const/4 v0, 0x3

    aput-object v5, v10, v0

    const/4 v0, 0x4

    aput-object v7, v10, v0

    const/4 v0, 0x5

    aput-object v9, v10, v0

    const/4 v0, 0x6

    aput-object v11, v10, v0

    const/4 v0, 0x7

    aput-object v13, v10, v0

    const/16 v0, 0x8

    aput-object v15, v10, v0

    const/16 v0, 0x9

    aput-object v14, v10, v0

    aput-object v12, v10, v8

    .line 12
    sput-object v10, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->$VALUES:[Lnet/sf/sevenzipjbinding/ExtractOperationResult;

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

.method public static getOperationResult(I)Lnet/sf/sevenzipjbinding/ExtractOperationResult;
    .locals 1

    if-ltz p0, :cond_0

    .line 1
    invoke-static {}, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->values()[Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    move-result-object v0

    array-length v0, v0

    if-ge p0, v0, :cond_0

    .line 2
    invoke-static {}, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->values()[Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    move-result-object v0

    aget-object p0, v0, p0

    return-object p0

    .line 3
    :cond_0
    sget-object p0, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->UNKNOWN_OPERATION_RESULT:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/sf/sevenzipjbinding/ExtractOperationResult;
    .locals 1

    .line 1
    const-class v0, Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    return-object p0
.end method

.method public static values()[Lnet/sf/sevenzipjbinding/ExtractOperationResult;
    .locals 1

    .line 1
    sget-object v0, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->$VALUES:[Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    invoke-virtual {v0}, [Lnet/sf/sevenzipjbinding/ExtractOperationResult;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    return-object v0
.end method
