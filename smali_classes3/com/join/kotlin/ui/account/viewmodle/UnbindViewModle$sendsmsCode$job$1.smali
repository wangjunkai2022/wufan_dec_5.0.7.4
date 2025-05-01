.class final Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle$sendsmsCode$job$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "UnbindViewModle.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;->sendsmsCode(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/q0;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.join.kotlin.ui.account.viewmodle.UnbindViewModle$sendsmsCode$job$1"
    f = "UnbindViewModle.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $context:Landroid/content/Context;

.field final synthetic $requestbean:Lcom/join/mgps/dto/MMSRequesBean;

.field label:I

.field final synthetic this$0:Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;


# direct methods
.method constructor <init>(Lcom/join/mgps/dto/MMSRequesBean;Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;Landroid/content/Context;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/MMSRequesBean;",
            "Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;",
            "Landroid/content/Context;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle$sendsmsCode$job$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle$sendsmsCode$job$1;->$requestbean:Lcom/join/mgps/dto/MMSRequesBean;

    iput-object p2, p0, Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle$sendsmsCode$job$1;->this$0:Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;

    iput-object p3, p0, Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle$sendsmsCode$job$1;->$context:Landroid/content/Context;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance p1, Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle$sendsmsCode$job$1;

    iget-object v0, p0, Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle$sendsmsCode$job$1;->$requestbean:Lcom/join/mgps/dto/MMSRequesBean;

    iget-object v1, p0, Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle$sendsmsCode$job$1;->this$0:Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;

    iget-object v2, p0, Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle$sendsmsCode$job$1;->$context:Landroid/content/Context;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle$sendsmsCode$job$1;-><init>(Lcom/join/mgps/dto/MMSRequesBean;Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;Landroid/content/Context;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/q0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle$sendsmsCode$job$1;->invoke(Lkotlinx/coroutines/q0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/q0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lkotlinx/coroutines/q0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/q0;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle$sendsmsCode$job$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle$sendsmsCode$job$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle$sendsmsCode$job$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 1
    iget v0, p0, Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle$sendsmsCode$job$1;->label:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    const/4 p1, 0x1

    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-static {}, Lcom/join/mgps/rpc/impl/a;->c0()Lcom/join/mgps/rpc/b;

    move-result-object v1

    iget-object v2, p0, Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle$sendsmsCode$job$1;->$requestbean:Lcom/join/mgps/dto/MMSRequesBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/MMSRequesBean;->getParams()Lorg/springframework/util/LinkedMultiValueMap;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/join/mgps/rpc/b;->i(Ljava/util/Map;)Lcom/join/mgps/dto/AccountResultMainBean;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 3
    :catch_0
    new-instance v1, Lcom/join/mgps/dto/AccountResultMainBean;

    invoke-direct {v1, p1, v0}, Lcom/join/mgps/dto/AccountResultMainBean;-><init>(ILjava/lang/Object;)V

    .line 4
    :goto_0
    iget-object v2, p0, Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle$sendsmsCode$job$1;->this$0:Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;

    invoke-virtual {v2}, Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;->getColuting()Lkotlinx/coroutines/z1;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v2, v0, p1, v0}, Lkotlinx/coroutines/z1$a;->b(Lkotlinx/coroutines/z1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle$sendsmsCode$job$1;->this$0:Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;

    sget-object v2, Lkotlinx/coroutines/s1;->b:Lkotlinx/coroutines/s1;

    invoke-static {}, Lkotlinx/coroutines/d1;->e()Lkotlinx/coroutines/j2;

    move-result-object v3

    const/4 v4, 0x0

    new-instance v5, Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle$sendsmsCode$job$1$1;

    iget-object v6, p0, Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle$sendsmsCode$job$1;->$context:Landroid/content/Context;

    iget-object v7, p0, Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle$sendsmsCode$job$1;->this$0:Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;

    invoke-direct {v5, v1, v6, v7, v0}, Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle$sendsmsCode$job$1$1;-><init>(Lcom/join/mgps/dto/AccountResultMainBean;Landroid/content/Context;Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/q0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/z1;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/join/kotlin/ui/account/viewmodle/UnbindViewModle;->setColuting(Lkotlinx/coroutines/z1;)V

    .line 6
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 7
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
