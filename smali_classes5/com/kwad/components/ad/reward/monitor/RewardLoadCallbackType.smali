.class public final enum Lcom/kwad/components/ad/reward/monitor/RewardLoadCallbackType;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/ad/reward/monitor/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/kwad/components/ad/reward/monitor/RewardLoadCallbackType;",
        ">;",
        "Lcom/kwad/components/ad/reward/monitor/a;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/kwad/components/ad/reward/monitor/RewardLoadCallbackType;

.field public static final enum LOAD_CACHE_SUCCESS:Lcom/kwad/components/ad/reward/monitor/RewardLoadCallbackType;

.field public static final enum LOAD_CACHE_SUCCESS_BEFORE:Lcom/kwad/components/ad/reward/monitor/RewardLoadCallbackType;

.field public static final enum LOAD_ERROR:Lcom/kwad/components/ad/reward/monitor/RewardLoadCallbackType;

.field public static final enum LOAD_SUCCESS:Lcom/kwad/components/ad/reward/monitor/RewardLoadCallbackType;

.field public static final enum LOAD_SUCCESS_BEFORE:Lcom/kwad/components/ad/reward/monitor/RewardLoadCallbackType;


# instance fields
.field private typeValue:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    new-instance v0, Lcom/kwad/components/ad/reward/monitor/RewardLoadCallbackType;

    const-string v1, "LOAD_SUCCESS_BEFORE"

    const/4 v2, 0x0

    const-string v3, "load_success_before"

    invoke-direct {v0, v1, v2, v3}, Lcom/kwad/components/ad/reward/monitor/RewardLoadCallbackType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/kwad/components/ad/reward/monitor/RewardLoadCallbackType;->LOAD_SUCCESS_BEFORE:Lcom/kwad/components/ad/reward/monitor/RewardLoadCallbackType;

    .line 2
    new-instance v1, Lcom/kwad/components/ad/reward/monitor/RewardLoadCallbackType;

    const-string v3, "LOAD_SUCCESS"

    const/4 v4, 0x1

    const-string v5, "load_success"

    invoke-direct {v1, v3, v4, v5}, Lcom/kwad/components/ad/reward/monitor/RewardLoadCallbackType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/kwad/components/ad/reward/monitor/RewardLoadCallbackType;->LOAD_SUCCESS:Lcom/kwad/components/ad/reward/monitor/RewardLoadCallbackType;

    .line 3
    new-instance v3, Lcom/kwad/components/ad/reward/monitor/RewardLoadCallbackType;

    const-string v5, "LOAD_ERROR"

    const/4 v6, 0x2

    const-string v7, "load_error"

    invoke-direct {v3, v5, v6, v7}, Lcom/kwad/components/ad/reward/monitor/RewardLoadCallbackType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lcom/kwad/components/ad/reward/monitor/RewardLoadCallbackType;->LOAD_ERROR:Lcom/kwad/components/ad/reward/monitor/RewardLoadCallbackType;

    .line 4
    new-instance v5, Lcom/kwad/components/ad/reward/monitor/RewardLoadCallbackType;

    const-string v7, "LOAD_CACHE_SUCCESS_BEFORE"

    const/4 v8, 0x3

    const-string v9, "load_cache_success_before"

    invoke-direct {v5, v7, v8, v9}, Lcom/kwad/components/ad/reward/monitor/RewardLoadCallbackType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, Lcom/kwad/components/ad/reward/monitor/RewardLoadCallbackType;->LOAD_CACHE_SUCCESS_BEFORE:Lcom/kwad/components/ad/reward/monitor/RewardLoadCallbackType;

    .line 5
    new-instance v7, Lcom/kwad/components/ad/reward/monitor/RewardLoadCallbackType;

    const-string v9, "LOAD_CACHE_SUCCESS"

    const/4 v10, 0x4

    const-string v11, "load_cache_success"

    invoke-direct {v7, v9, v10, v11}, Lcom/kwad/components/ad/reward/monitor/RewardLoadCallbackType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v7, Lcom/kwad/components/ad/reward/monitor/RewardLoadCallbackType;->LOAD_CACHE_SUCCESS:Lcom/kwad/components/ad/reward/monitor/RewardLoadCallbackType;

    const/4 v9, 0x5

    new-array v9, v9, [Lcom/kwad/components/ad/reward/monitor/RewardLoadCallbackType;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    .line 6
    sput-object v9, Lcom/kwad/components/ad/reward/monitor/RewardLoadCallbackType;->$VALUES:[Lcom/kwad/components/ad/reward/monitor/RewardLoadCallbackType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput-object p3, p0, Lcom/kwad/components/ad/reward/monitor/RewardLoadCallbackType;->typeValue:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/kwad/components/ad/reward/monitor/RewardLoadCallbackType;
    .locals 1

    .line 1
    const-class v0, Lcom/kwad/components/ad/reward/monitor/RewardLoadCallbackType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/kwad/components/ad/reward/monitor/RewardLoadCallbackType;

    return-object p0
.end method

.method public static values()[Lcom/kwad/components/ad/reward/monitor/RewardLoadCallbackType;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/components/ad/reward/monitor/RewardLoadCallbackType;->$VALUES:[Lcom/kwad/components/ad/reward/monitor/RewardLoadCallbackType;

    invoke-virtual {v0}, [Lcom/kwad/components/ad/reward/monitor/RewardLoadCallbackType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/kwad/components/ad/reward/monitor/RewardLoadCallbackType;

    return-object v0
.end method


# virtual methods
.method public final getTypeValue()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/monitor/RewardLoadCallbackType;->typeValue:Ljava/lang/String;

    return-object v0
.end method
