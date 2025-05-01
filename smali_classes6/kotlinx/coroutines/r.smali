.class public final Lkotlinx/coroutines/r;
.super Ljava/lang/Object;
.source "CancellableContinuationImpl.kt"


# static fields
.field private static final a:I = 0x0

.field private static final b:I = 0x1

.field private static final c:I = 0x2

.field public static final d:Lkotlinx/coroutines/internal/o0;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lkotlinx/coroutines/internal/o0;

    const-string v1, "RESUME_TOKEN"

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/o0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lkotlinx/coroutines/r;->d:Lkotlinx/coroutines/internal/o0;

    return-void
.end method

.method public static synthetic a()V
    .locals 0

    return-void
.end method
