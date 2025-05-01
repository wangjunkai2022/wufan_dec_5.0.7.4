.class final Lkotlinx/coroutines/z2;
.super Lkotlinx/coroutines/b2;
.source "Supervisor.kt"


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/z1;)V
    .locals 0
    .param p1    # Lkotlinx/coroutines/z1;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Lkotlinx/coroutines/b2;-><init>(Lkotlinx/coroutines/z1;)V

    return-void
.end method


# virtual methods
.method public p0(Ljava/lang/Throwable;)Z
    .locals 0
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const/4 p1, 0x0

    return p1
.end method
