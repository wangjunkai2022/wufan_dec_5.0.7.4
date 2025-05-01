.class final Lcom/join/kotlin/base/ext/BaseViewModelExtKt$executeResponse$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "BaseViewModelExt.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/base/ext/BaseViewModelExtKt;->executeResponse(Lcom/join/mgps/dto/ResponseModel;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.join.kotlin.base.ext.BaseViewModelExtKt$executeResponse$2"
    f = "BaseViewModelExt.kt"
    i = {}
    l = {
        0x127
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $response:Lcom/join/mgps/dto/ResponseModel;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/join/mgps/dto/ResponseModel<",
            "TT;>;"
        }
    .end annotation
.end field

.field final synthetic $success:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "Lkotlinx/coroutines/q0;",
            "TT;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Lcom/join/mgps/dto/ResponseModel;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/ResponseModel<",
            "TT;>;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Lkotlinx/coroutines/q0;",
            "-TT;-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/join/kotlin/base/ext/BaseViewModelExtKt$executeResponse$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/join/kotlin/base/ext/BaseViewModelExtKt$executeResponse$2;->$response:Lcom/join/mgps/dto/ResponseModel;

    iput-object p2, p0, Lcom/join/kotlin/base/ext/BaseViewModelExtKt$executeResponse$2;->$success:Lkotlin/jvm/functions/Function3;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

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

    new-instance v0, Lcom/join/kotlin/base/ext/BaseViewModelExtKt$executeResponse$2;

    iget-object v1, p0, Lcom/join/kotlin/base/ext/BaseViewModelExtKt$executeResponse$2;->$response:Lcom/join/mgps/dto/ResponseModel;

    iget-object v2, p0, Lcom/join/kotlin/base/ext/BaseViewModelExtKt$executeResponse$2;->$success:Lkotlin/jvm/functions/Function3;

    invoke-direct {v0, v1, v2, p2}, Lcom/join/kotlin/base/ext/BaseViewModelExtKt$executeResponse$2;-><init>(Lcom/join/mgps/dto/ResponseModel;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/join/kotlin/base/ext/BaseViewModelExtKt$executeResponse$2;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/q0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/join/kotlin/base/ext/BaseViewModelExtKt$executeResponse$2;->invoke(Lkotlinx/coroutines/q0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/join/kotlin/base/ext/BaseViewModelExtKt$executeResponse$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/join/kotlin/base/ext/BaseViewModelExtKt$executeResponse$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/join/kotlin/base/ext/BaseViewModelExtKt$executeResponse$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 1
    iget v1, p0, Lcom/join/kotlin/base/ext/BaseViewModelExtKt$executeResponse$2;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/join/kotlin/base/ext/BaseViewModelExtKt$executeResponse$2;->L$0:Ljava/lang/Object;

    check-cast p1, Lkotlinx/coroutines/q0;

    .line 2
    iget-object v1, p0, Lcom/join/kotlin/base/ext/BaseViewModelExtKt$executeResponse$2;->$response:Lcom/join/mgps/dto/ResponseModel;

    invoke-virtual {v1}, Lcom/join/mgps/dto/ResponseModel;->isSuccess()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 3
    iget-object v1, p0, Lcom/join/kotlin/base/ext/BaseViewModelExtKt$executeResponse$2;->$success:Lkotlin/jvm/functions/Function3;

    iget-object v3, p0, Lcom/join/kotlin/base/ext/BaseViewModelExtKt$executeResponse$2;->$response:Lcom/join/mgps/dto/ResponseModel;

    invoke-virtual {v3}, Lcom/join/mgps/dto/ResponseModel;->getResponseData()Ljava/lang/Object;

    move-result-object v3

    iput v2, p0, Lcom/join/kotlin/base/ext/BaseViewModelExtKt$executeResponse$2;->label:I

    invoke-interface {v1, p1, v3, p0}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    .line 4
    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 5
    :cond_3
    new-instance p1, Lcom/join/kotlin/base/net/AppException;

    .line 6
    iget-object v0, p0, Lcom/join/kotlin/base/ext/BaseViewModelExtKt$executeResponse$2;->$response:Lcom/join/mgps/dto/ResponseModel;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getResponseCode()I

    move-result v1

    .line 7
    iget-object v0, p0, Lcom/join/kotlin/base/ext/BaseViewModelExtKt$executeResponse$2;->$response:Lcom/join/mgps/dto/ResponseModel;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getResponseMsg()Ljava/lang/String;

    move-result-object v2

    .line 8
    iget-object v0, p0, Lcom/join/kotlin/base/ext/BaseViewModelExtKt$executeResponse$2;->$response:Lcom/join/mgps/dto/ResponseModel;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getResponseMsg()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v0, p1

    .line 9
    invoke-direct/range {v0 .. v6}, Lcom/join/kotlin/base/net/AppException;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1
.end method
