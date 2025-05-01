.class public final Lcom/join/mgps/va/overmind/h;
.super Ljava/lang/Object;
.source "VExtPackageAccessor.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/va/overmind/h$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/join/mgps/va/overmind/h$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/join/mgps/va/overmind/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/join/mgps/va/overmind/h$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/join/mgps/va/overmind/h;->a:Lcom/join/mgps/va/overmind/h$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/join/mgps/va/overmind/h;->a:Lcom/join/mgps/va/overmind/h$a;

    invoke-virtual {v0, p0, p1, p2}, Lcom/join/mgps/va/overmind/h$a;->f(Ljava/lang/String;ILandroid/os/Bundle;)V

    return-void
.end method

.method public static final delete(Ljava/lang/String;)V
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/join/mgps/va/overmind/h;->a:Lcom/join/mgps/va/overmind/h$a;

    invoke-virtual {v0, p0}, Lcom/join/mgps/va/overmind/h$a;->delete(Ljava/lang/String;)V

    return-void
.end method
