.class final Lkotlinx/coroutines/test/a$a;
.super Lkotlinx/coroutines/k1;
.source "TestCoroutineContext.kt"

# interfaces
.implements Lkotlinx/coroutines/y0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlinx/coroutines/test/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTestCoroutineContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestCoroutineContext.kt\nkotlinx/coroutines/test/TestCoroutineContext$Dispatcher\n+ 2 Runnable.kt\nkotlinx/coroutines/RunnableKt\n*L\n1#1,261:1\n17#2:262\n*S KotlinDebug\n*F\n+ 1 TestCoroutineContext.kt\nkotlinx/coroutines/test/TestCoroutineContext$Dispatcher\n*L\n209#1:262\n*E\n"
.end annotation


# instance fields
.field final synthetic e:Lkotlinx/coroutines/test/a;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/test/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lkotlinx/coroutines/test/a$a;->e:Lkotlinx/coroutines/test/a;

    invoke-direct {p0}, Lkotlinx/coroutines/k1;-><init>()V

    const/4 p1, 0x0

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 2
    invoke-static {p0, p1, v0, v1}, Lkotlinx/coroutines/k1;->e0(Lkotlinx/coroutines/k1;ZILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public A(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/g1;
    .locals 0
    .param p3    # Ljava/lang/Runnable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lkotlin/coroutines/CoroutineContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object p4, p0, Lkotlinx/coroutines/test/a$a;->e:Lkotlinx/coroutines/test/a;

    invoke-static {p4, p3, p1, p2}, Lkotlinx/coroutines/test/a;->i(Lkotlinx/coroutines/test/a;Ljava/lang/Runnable;J)Lkotlinx/coroutines/test/c;

    move-result-object p1

    .line 2
    new-instance p2, Lkotlinx/coroutines/test/a$a$a;

    iget-object p3, p0, Lkotlinx/coroutines/test/a$a;->e:Lkotlinx/coroutines/test/a;

    invoke-direct {p2, p3, p1}, Lkotlinx/coroutines/test/a$a$a;-><init>(Lkotlinx/coroutines/test/a;Lkotlinx/coroutines/test/c;)V

    return-object p2
.end method

.method public S(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .param p3    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->ERROR:Lkotlin/DeprecationLevel;
        message = "Deprecated without replacement as an internal method never intended for public use"
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    invoke-static {p0, p1, p2, p3}, Lkotlinx/coroutines/y0$a;->a(Lkotlinx/coroutines/y0;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public dispatch(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V
    .locals 0
    .param p1    # Lkotlin/coroutines/CoroutineContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Runnable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    iget-object p1, p0, Lkotlinx/coroutines/test/a$a;->e:Lkotlinx/coroutines/test/a;

    invoke-static {p1, p2}, Lkotlinx/coroutines/test/a;->c(Lkotlinx/coroutines/test/a;Ljava/lang/Runnable;)V

    return-void
.end method

.method public j0()J
    .locals 2

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/test/a$a;->e:Lkotlinx/coroutines/test/a;

    invoke-static {v0}, Lkotlinx/coroutines/test/a;->k(Lkotlinx/coroutines/test/a;)J

    move-result-wide v0

    return-wide v0
.end method

.method public k(JLkotlinx/coroutines/p;)V
    .locals 2
    .param p3    # Lkotlinx/coroutines/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lkotlinx/coroutines/p<",
            "-",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/test/a$a;->e:Lkotlinx/coroutines/test/a;

    .line 2
    new-instance v1, Lkotlinx/coroutines/test/a$a$b;

    invoke-direct {v1, p3, p0}, Lkotlinx/coroutines/test/a$a$b;-><init>(Lkotlinx/coroutines/p;Lkotlinx/coroutines/test/a$a;)V

    .line 3
    invoke-static {v0, v1, p1, p2}, Lkotlinx/coroutines/test/a;->i(Lkotlinx/coroutines/test/a;Ljava/lang/Runnable;J)Lkotlinx/coroutines/test/c;

    return-void
.end method

.method public l0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Dispatcher("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lkotlinx/coroutines/test/a$a;->e:Lkotlinx/coroutines/test/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
