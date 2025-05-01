.class public final Lkotlinx/coroutines/h;
.super Lkotlinx/coroutines/l1;
.source "EventLoop.kt"


# instance fields
.field private final g:Ljava/lang/Thread;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Thread;)V
    .locals 0
    .param p1    # Ljava/lang/Thread;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Lkotlinx/coroutines/l1;-><init>()V

    .line 2
    iput-object p1, p0, Lkotlinx/coroutines/h;->g:Ljava/lang/Thread;

    return-void
.end method


# virtual methods
.method protected m0()Ljava/lang/Thread;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/h;->g:Ljava/lang/Thread;

    return-object v0
.end method
