.class public Lcom/psk/kotlin/util/CommonType;
.super Ljava/lang/Object;
.source "CommonType.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/psk/kotlin/util/CommonType$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/psk/kotlin/util/CommonType$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final GAMEITEM:I = 0x2

.field public static final TITLE:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/psk/kotlin/util/CommonType$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/psk/kotlin/util/CommonType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/psk/kotlin/util/CommonType;->Companion:Lcom/psk/kotlin/util/CommonType$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
