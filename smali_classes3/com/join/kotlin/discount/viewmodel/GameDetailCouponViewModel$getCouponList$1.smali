.class final Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel$getCouponList$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "GameDetailCouponViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;->getCouponList(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lcom/join/mgps/dto/ResponseModel<",
        "Ljava/util/List<",
        "+",
        "Lcom/join/kotlin/discount/model/bean/CouponItemBean;",
        ">;>;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.join.kotlin.discount.viewmodel.GameDetailCouponViewModel$getCouponList$1"
    f = "GameDetailCouponViewModel.kt"
    i = {}
    l = {
        0x21
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $refresh:Z

.field label:I

.field final synthetic this$0:Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;


# direct methods
.method constructor <init>(ZLcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel$getCouponList$1;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel$getCouponList$1;->$refresh:Z

    iput-object p2, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel$getCouponList$1;->this$0:Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel$getCouponList$1;

    iget-boolean v1, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel$getCouponList$1;->$refresh:Z

    iget-object v2, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel$getCouponList$1;->this$0:Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;

    invoke-direct {v0, v1, v2, p1}, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel$getCouponList$1;-><init>(ZLcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;Lkotlin/coroutines/Continuation;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel$getCouponList$1;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Ljava/util/List<",
            "Lcom/join/kotlin/discount/model/bean/CouponItemBean;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0, p1}, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel$getCouponList$1;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel$getCouponList$1;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel$getCouponList$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 1
    iget v1, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel$getCouponList$1;->label:I

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

    .line 2
    iget-boolean p1, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel$getCouponList$1;->$refresh:Z

    if-eqz p1, :cond_2

    .line 3
    iget-object p1, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel$getCouponList$1;->this$0:Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;

    invoke-virtual {p1}, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;->getPage()Lcom/join/kotlin/quark/model/bean/Page;

    move-result-object p1

    invoke-virtual {p1, v2}, Lcom/join/kotlin/quark/model/bean/Page;->setPage(I)V

    .line 4
    :cond_2
    new-instance p1, Lcom/join/kotlin/discount/model/request/CommonRequest;

    .line 5
    iget-object v1, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel$getCouponList$1;->this$0:Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;

    invoke-virtual {v1}, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;->getGameId()Ljava/lang/String;

    move-result-object v1

    .line 6
    iget-object v3, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel$getCouponList$1;->this$0:Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;

    invoke-virtual {v3}, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;->getPage()Lcom/join/kotlin/quark/model/bean/Page;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/kotlin/quark/model/bean/Page;->getPage()I

    move-result v3

    .line 7
    invoke-direct {p1, v1, v3}, Lcom/join/kotlin/discount/model/request/CommonRequest;-><init>(Ljava/lang/String;I)V

    .line 8
    new-instance v1, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v1}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 9
    invoke-virtual {v1, p1}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 10
    sget-object p1, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {v1, p1}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 11
    invoke-static {}, Lcom/join/kotlin/network/api/ApiServiceFactorKt;->getGameApiService()Lcom/join/kotlin/network/api/GameApiService;

    move-result-object p1

    invoke-virtual {v1}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object v1

    const-string v3, "request.makeSign()"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput v2, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel$getCouponList$1;->label:I

    invoke-interface {p1, v1, p0}, Lcom/join/kotlin/network/api/GameApiService;->getGameDetailCouponList(Lcom/join/mgps/dto/RequestModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    return-object p1
.end method
