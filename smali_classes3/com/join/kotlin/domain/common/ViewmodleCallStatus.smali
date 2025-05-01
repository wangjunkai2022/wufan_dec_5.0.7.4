.class public final Lcom/join/kotlin/domain/common/ViewmodleCallStatus;
.super Ljava/lang/Object;
.source "ViewmodleCallStatus.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/kotlin/domain/common/ViewmodleCallStatus$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/join/kotlin/domain/common/ViewmodleCallStatus$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final STATUS_FINISHACTIVITY:I = 0x1

.field public static final STATUS_NORMAL:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/join/kotlin/domain/common/ViewmodleCallStatus$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/join/kotlin/domain/common/ViewmodleCallStatus$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/join/kotlin/domain/common/ViewmodleCallStatus;->Companion:Lcom/join/kotlin/domain/common/ViewmodleCallStatus$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
