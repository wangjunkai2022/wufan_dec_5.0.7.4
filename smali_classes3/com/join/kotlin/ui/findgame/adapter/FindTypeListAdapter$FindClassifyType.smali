.class public final Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$FindClassifyType;
.super Ljava/lang/Object;
.source "FindTypeListAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "FindClassifyType"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$FindClassifyType$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$FindClassifyType$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final GAMETEXTTYPE:I = 0x7

.field public static final TYPEIMAGE:I = 0x3


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$FindClassifyType$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$FindClassifyType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$FindClassifyType;->Companion:Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$FindClassifyType$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
