.class public final Lcom/join/kotlin/base/dialog/DialogActivityManager$Companion;
.super Ljava/lang/Object;
.source "DialogActivityManager.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/kotlin/base/dialog/DialogActivityManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/join/kotlin/base/dialog/DialogActivityManager$Companion;-><init>()V

    return-void
.end method

.method private final getINSTANCE()Lcom/join/kotlin/base/dialog/DialogActivityManager;
    .locals 1

    .line 1
    invoke-static {}, Lcom/join/kotlin/base/dialog/DialogActivityManager;->access$getINSTANCE$delegate$cp()Lkotlin/Lazy;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/base/dialog/DialogActivityManager;

    return-object v0
.end method


# virtual methods
.method public final get()Lcom/join/kotlin/base/dialog/DialogActivityManager;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/join/kotlin/base/dialog/DialogActivityManager$Companion;->getINSTANCE()Lcom/join/kotlin/base/dialog/DialogActivityManager;

    move-result-object v0

    return-object v0
.end method
