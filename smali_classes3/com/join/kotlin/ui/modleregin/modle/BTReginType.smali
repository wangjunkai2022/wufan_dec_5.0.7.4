.class public final Lcom/join/kotlin/ui/modleregin/modle/BTReginType;
.super Ljava/lang/Object;
.source "BTReginType.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/kotlin/ui/modleregin/modle/BTReginType$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/join/kotlin/ui/modleregin/modle/BTReginType$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final TYPE_HGAMELIST:I = 0x7

.field public static final TYPE_HVIEWLIST:I = 0x8

.field public static final TYPE_TAG:I = 0x5

.field public static final TYPE_VIDEO:I = 0x4

.field public static final TYPE_VIEPAGER:I = 0x6


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/join/kotlin/ui/modleregin/modle/BTReginType$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/join/kotlin/ui/modleregin/modle/BTReginType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/join/kotlin/ui/modleregin/modle/BTReginType;->Companion:Lcom/join/kotlin/ui/modleregin/modle/BTReginType$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
