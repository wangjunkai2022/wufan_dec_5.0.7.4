.class public final Lcom/join/kotlin/network/api/ApiServiceFactorKt;
.super Ljava/lang/Object;
.source "ApiServiceFactor.kt"


# static fields
.field private static final gameApiService$delegate:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->SYNCHRONIZED:Lkotlin/LazyThreadSafetyMode;

    sget-object v1, Lcom/join/kotlin/network/api/ApiServiceFactorKt$gameApiService$2;->INSTANCE:Lcom/join/kotlin/network/api/ApiServiceFactorKt$gameApiService$2;

    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/join/kotlin/network/api/ApiServiceFactorKt;->gameApiService$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final getGameApiService()Lcom/join/kotlin/network/api/GameApiService;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/join/kotlin/network/api/ApiServiceFactorKt;->gameApiService$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/network/api/GameApiService;

    return-object v0
.end method
