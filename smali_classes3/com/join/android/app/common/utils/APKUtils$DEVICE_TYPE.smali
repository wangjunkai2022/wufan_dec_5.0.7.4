.class public final enum Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;
.super Ljava/lang/Enum;
.source "APKUtils.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/android/app/common/utils/APKUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "DEVICE_TYPE"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;

.field public static final enum ALL:Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;

.field public static final enum REAL:Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;

.field public static final enum VM:Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;


# instance fields
.field private final mDesc:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final mType:I


# direct methods
.method private static final synthetic $values()[Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;

    sget-object v1, Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;->ALL:Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;->REAL:Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;->VM:Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;

    const-string v1, "ALL"

    const/4 v2, 0x0

    const-string/jumbo v3, "\u5168\u7c7b\u578b"

    invoke-direct {v0, v1, v2, v2, v3}, Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;->ALL:Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;

    new-instance v0, Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;

    const-string v1, "REAL"

    const/4 v2, 0x1

    const-string/jumbo v3, "\u771f\u673a"

    invoke-direct {v0, v1, v2, v2, v3}, Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;->REAL:Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;

    new-instance v0, Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;

    const-string v1, "VM"

    const/4 v2, 0x2

    const-string/jumbo v3, "\u865a\u62df\u673a"

    invoke-direct {v0, v1, v2, v2, v3}, Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;->VM:Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;

    invoke-static {}, Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;->$values()[Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;

    move-result-object v0

    sput-object v0, Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;->$VALUES:[Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;->mType:I

    iput-object p4, p0, Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;->mDesc:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;
    .locals 1

    const-class v0, Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;

    return-object p0
.end method

.method public static values()[Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;
    .locals 1

    sget-object v0, Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;->$VALUES:[Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;

    return-object v0
.end method


# virtual methods
.method public final desc()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;->mDesc:Ljava/lang/String;

    return-object v0
.end method

.method public final value()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;->mType:I

    return v0
.end method
