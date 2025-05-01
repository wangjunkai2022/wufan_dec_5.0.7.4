.class public final Lcom/join/kotlin/domain/common/RecycleviewStatus;
.super Ljava/lang/Object;
.source "RecycleviewStatu.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/kotlin/domain/common/RecycleviewStatus$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/join/kotlin/domain/common/RecycleviewStatus$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final STATUS_LOADMORECOMPLET:I = 0x2

.field public static final STATUS_NOMORE:I = 0x4

.field public static final STATUS_REFRESHCOMPLET:I = 0x3

.field public static final STATUS_RESET:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/join/kotlin/domain/common/RecycleviewStatus$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/join/kotlin/domain/common/RecycleviewStatus$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/join/kotlin/domain/common/RecycleviewStatus;->Companion:Lcom/join/kotlin/domain/common/RecycleviewStatus$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
