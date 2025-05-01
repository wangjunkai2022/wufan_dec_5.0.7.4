.class final Lcom/join/kotlin/network/NetworkApi$Companion$INSTANCE$2;
.super Lkotlin/jvm/internal/Lambda;
.source "NetworkApi.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/kotlin/network/NetworkApi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lcom/join/kotlin/network/NetworkApi;",
        ">;"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/join/kotlin/network/NetworkApi$Companion$INSTANCE$2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/join/kotlin/network/NetworkApi$Companion$INSTANCE$2;

    invoke-direct {v0}, Lcom/join/kotlin/network/NetworkApi$Companion$INSTANCE$2;-><init>()V

    sput-object v0, Lcom/join/kotlin/network/NetworkApi$Companion$INSTANCE$2;->INSTANCE:Lcom/join/kotlin/network/NetworkApi$Companion$INSTANCE$2;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Lcom/join/kotlin/network/NetworkApi;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    new-instance v0, Lcom/join/kotlin/network/NetworkApi;

    invoke-direct {v0}, Lcom/join/kotlin/network/NetworkApi;-><init>()V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/network/NetworkApi$Companion$INSTANCE$2;->invoke()Lcom/join/kotlin/network/NetworkApi;

    move-result-object v0

    return-object v0
.end method
