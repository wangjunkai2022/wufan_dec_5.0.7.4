.class public final Lcom/join/kotlin/ui/cloudarchive/VASingleGameViewModle$ShowStatus;
.super Ljava/lang/Object;
.source "VASingleGameViewModle.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/kotlin/ui/cloudarchive/VASingleGameViewModle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ShowStatus"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/kotlin/ui/cloudarchive/VASingleGameViewModle$ShowStatus$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/join/kotlin/ui/cloudarchive/VASingleGameViewModle$ShowStatus$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final SHOWFAILED:I = 0x3

.field public static final SHOWLODING:I = 0x2

.field public static final SHOWMAIN:I = 0x1

.field public static final SHOWNULL:I = 0x4


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/join/kotlin/ui/cloudarchive/VASingleGameViewModle$ShowStatus$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/join/kotlin/ui/cloudarchive/VASingleGameViewModle$ShowStatus$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/join/kotlin/ui/cloudarchive/VASingleGameViewModle$ShowStatus;->Companion:Lcom/join/kotlin/ui/cloudarchive/VASingleGameViewModle$ShowStatus$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
