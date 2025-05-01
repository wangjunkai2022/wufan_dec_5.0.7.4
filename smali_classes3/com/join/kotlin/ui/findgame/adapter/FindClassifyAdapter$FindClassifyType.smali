.class public final Lcom/join/kotlin/ui/findgame/adapter/FindClassifyAdapter$FindClassifyType;
.super Ljava/lang/Object;
.source "FindClassifyAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/kotlin/ui/findgame/adapter/FindClassifyAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "FindClassifyType"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/kotlin/ui/findgame/adapter/FindClassifyAdapter$FindClassifyType$Companion;
    }
.end annotation


# static fields
.field public static final AD:I = 0x3

.field public static final Companion:Lcom/join/kotlin/ui/findgame/adapter/FindClassifyAdapter$FindClassifyType$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final DISCOUNT_TYPE:I = 0x7

.field public static final GAMEICONLIST:I = 0x5

.field public static final GAMETEXTTYPE:I = 0x7

.field public static final GAMETYPE:I = 0x6


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/join/kotlin/ui/findgame/adapter/FindClassifyAdapter$FindClassifyType$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/join/kotlin/ui/findgame/adapter/FindClassifyAdapter$FindClassifyType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/join/kotlin/ui/findgame/adapter/FindClassifyAdapter$FindClassifyType;->Companion:Lcom/join/kotlin/ui/findgame/adapter/FindClassifyAdapter$FindClassifyType$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
