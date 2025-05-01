.class public interface abstract Lkotlinx/coroutines/flow/r;
.super Ljava/lang/Object;
.source "SharingStarted.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlinx/coroutines/flow/r$a;
    }
.end annotation


# static fields
.field public static final a:Lkotlinx/coroutines/flow/r$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lkotlinx/coroutines/flow/r$a;->a:Lkotlinx/coroutines/flow/r$a;

    sput-object v0, Lkotlinx/coroutines/flow/r;->a:Lkotlinx/coroutines/flow/r$a;

    return-void
.end method


# virtual methods
.method public abstract a(Lkotlinx/coroutines/flow/u;)Lkotlinx/coroutines/flow/e;
    .param p1    # Lkotlinx/coroutines/flow/u;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/flow/u<",
            "Ljava/lang/Integer;",
            ">;)",
            "Lkotlinx/coroutines/flow/e<",
            "Lkotlinx/coroutines/flow/SharingCommand;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
