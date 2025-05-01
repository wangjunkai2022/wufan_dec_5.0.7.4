.class final Lcom/kotlin/base/data/net/RetrofitFactory$Companion$instance$2;
.super Lkotlin/jvm/internal/Lambda;
.source "RetrofitFactory.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kotlin/base/data/net/RetrofitFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lcom/kotlin/base/data/net/RetrofitFactory;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Lcom/kotlin/base/data/net/RetrofitFactory$Companion$instance$2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/kotlin/base/data/net/RetrofitFactory$Companion$instance$2;

    invoke-direct {v0}, Lcom/kotlin/base/data/net/RetrofitFactory$Companion$instance$2;-><init>()V

    sput-object v0, Lcom/kotlin/base/data/net/RetrofitFactory$Companion$instance$2;->b:Lcom/kotlin/base/data/net/RetrofitFactory$Companion$instance$2;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/kotlin/base/data/net/RetrofitFactory;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Lcom/kotlin/base/data/net/RetrofitFactory;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/kotlin/base/data/net/RetrofitFactory;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/kotlin/base/data/net/RetrofitFactory$Companion$instance$2;->a()Lcom/kotlin/base/data/net/RetrofitFactory;

    move-result-object v0

    return-object v0
.end method
