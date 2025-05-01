.class public abstract Lkotlinx/coroutines/m1;
.super Lkotlinx/coroutines/k1;
.source "EventLoop.kt"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lkotlinx/coroutines/k1;-><init>()V

    return-void
.end method


# virtual methods
.method protected abstract m0()Ljava/lang/Thread;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method protected n0(JLkotlinx/coroutines/l1$c;)V
    .locals 1
    .param p3    # Lkotlinx/coroutines/l1$c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    sget-object v0, Lkotlinx/coroutines/u0;->g:Lkotlinx/coroutines/u0;

    invoke-virtual {v0, p1, p2, p3}, Lkotlinx/coroutines/l1;->w0(JLkotlinx/coroutines/l1$c;)V

    return-void
.end method

.method protected final o0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lkotlinx/coroutines/m1;->m0()Ljava/lang/Thread;

    move-result-object v0

    .line 2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-eq v1, v0, :cond_1

    .line 3
    invoke-static {}, Lkotlinx/coroutines/c;->b()Lkotlinx/coroutines/b;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v0}, Lkotlinx/coroutines/b;->g(Ljava/lang/Thread;)V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_0
    if-nez v1, :cond_1

    invoke-static {v0}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    :cond_1
    return-void
.end method
