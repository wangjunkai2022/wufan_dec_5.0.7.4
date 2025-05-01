.class final Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle$loadDatas$job$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "MustPlayViewModle.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle$loadDatas$job$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.join.kotlin.ui.modleregin.viewModle.MustPlayViewModle$loadDatas$job$1$1"
    f = "MustPlayViewModle.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $context:Landroid/content/Context;

.field final synthetic $result:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Ljava/util/List<",
            "Lcom/join/kotlin/ui/modleregin/modle/MustplayItemNetBean;",
            ">;>;>;"
        }
    .end annotation
.end field

.field label:I

.field final synthetic this$0:Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle;Landroid/content/Context;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Ljava/util/List<",
            "Lcom/join/kotlin/ui/modleregin/modle/MustplayItemNetBean;",
            ">;>;>;",
            "Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle;",
            "Landroid/content/Context;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle$loadDatas$job$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle$loadDatas$job$1$1;->$result:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p2, p0, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle$loadDatas$job$1$1;->this$0:Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle;

    iput-object p3, p0, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle$loadDatas$job$1$1;->$context:Landroid/content/Context;

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

    new-instance p1, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle$loadDatas$job$1$1;

    iget-object v0, p0, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle$loadDatas$job$1$1;->$result:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, p0, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle$loadDatas$job$1$1;->this$0:Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle;

    iget-object v2, p0, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle$loadDatas$job$1$1;->$context:Landroid/content/Context;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle$loadDatas$job$1$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle;Landroid/content/Context;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/q0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle$loadDatas$job$1$1;->invoke(Lkotlinx/coroutines/q0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle$loadDatas$job$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle$loadDatas$job$1$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle$loadDatas$job$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 1
    iget v1, v0, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle$loadDatas$job$1$1;->label:I

    if-nez v1, :cond_7

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 2
    iget-object v1, v0, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle$loadDatas$job$1$1;->$result:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Lcom/join/mgps/dto/ResponseModel;

    invoke-virtual {v1}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result v1

    const/16 v2, 0xc8

    const/4 v3, 0x1

    if-ne v1, v2, :cond_5

    .line 3
    iget-object v1, v0, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle$loadDatas$job$1$1;->this$0:Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle;

    invoke-virtual {v1}, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle;->getPage()I

    move-result v1

    if-ne v1, v3, :cond_0

    iget-object v1, v0, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle$loadDatas$job$1$1;->this$0:Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle;

    invoke-virtual {v1}, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle;->getShowDatas()Landroidx/lifecycle/MutableLiveData;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 4
    :cond_0
    iget-object v1, v0, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle$loadDatas$job$1$1;->this$0:Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle;

    invoke-virtual {v1}, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle;->getShowDatas()Landroidx/lifecycle/MutableLiveData;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    .line 5
    iget-object v2, v0, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle$loadDatas$job$1$1;->$result:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v2, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v2, Lcom/join/mgps/dto/ResponseModel;

    invoke-virtual {v2}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_4

    iget-object v2, v0, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle$loadDatas$job$1$1;->$result:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v2, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v2, Lcom/join/mgps/dto/ResponseModel;

    invoke-virtual {v2}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    goto/16 :goto_1

    .line 6
    :cond_1
    iget-object v2, v0, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle$loadDatas$job$1$1;->$result:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v2, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v2, Lcom/join/mgps/dto/ResponseModel;

    invoke-virtual {v2}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v4, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    add-int/lit8 v5, v4, 0x1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/join/kotlin/ui/modleregin/modle/MustplayItemNetBean;

    .line 7
    invoke-virtual {v6}, Lcom/join/kotlin/ui/modleregin/modle/MustplayItemNetBean;->getGameInfo()Lcom/join/mgps/dto/CollectionBeanSub;

    move-result-object v7

    if-eqz v7, :cond_2

    .line 8
    new-instance v7, Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {v6}, Lcom/join/kotlin/ui/modleregin/modle/MustplayItemNetBean;->getGameInfo()Lcom/join/mgps/dto/CollectionBeanSub;

    move-result-object v8

    invoke-direct {v7, v8}, Lcom/join/mgps/business/CollectionBeanSubBusiness;-><init>(Lcom/join/mgps/dto/CollectionBeanSub;)V

    const/16 v8, 0x91

    .line 9
    invoke-virtual {v7, v8}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    .line 10
    invoke-virtual {v7, v8}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    .line 11
    invoke-virtual {v7}, Lcom/join/mgps/dto/CollectionBeanSub;->getIndex()I

    move-result v8

    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/join/mgps/dto/DownloadPointBase;->setRecPosition(Ljava/lang/String;)V

    .line 12
    iget-object v8, v0, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle$loadDatas$job$1$1;->this$0:Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle;

    invoke-virtual {v8, v7}, Lcom/join/kotlin/ui/base/BaseHasDownloadActivityViewModle;->updateDowState(Lcom/join/mgps/business/CollectionBeanSubBusiness;)V

    .line 13
    new-instance v15, Lcom/join/kotlin/ui/modleregin/modle/MustplayItemBean;

    add-int v9, v4, v1

    .line 14
    invoke-virtual {v6}, Lcom/join/kotlin/ui/modleregin/modle/MustplayItemNetBean;->getGameVideo()Ljava/lang/String;

    move-result-object v10

    .line 15
    invoke-virtual {v6}, Lcom/join/kotlin/ui/modleregin/modle/MustplayItemNetBean;->getGameImg()Ljava/lang/String;

    move-result-object v11

    .line 16
    invoke-virtual {v7}, Lcom/join/mgps/dto/CollectionBeanSub;->getGame_info_top_video_url()Ljava/lang/String;

    move-result-object v12

    .line 17
    invoke-virtual {v6}, Lcom/join/kotlin/ui/modleregin/modle/MustplayItemNetBean;->getGameTags()Ljava/lang/String;

    move-result-object v16

    const-string/jumbo v4, "|"

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v17

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x6

    const/16 v21, 0x0

    invoke-static/range {v16 .. v21}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v13

    .line 18
    invoke-virtual {v6}, Lcom/join/kotlin/ui/modleregin/modle/MustplayItemNetBean;->getGameName()Ljava/lang/String;

    move-result-object v14

    .line 19
    invoke-virtual {v6}, Lcom/join/kotlin/ui/modleregin/modle/MustplayItemNetBean;->getGameTitle()Ljava/lang/String;

    move-result-object v4

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x300

    const/16 v20, 0x0

    move-object v8, v15

    move-object v6, v15

    move-object v15, v4

    move-object/from16 v16, v7

    .line 20
    invoke-direct/range {v8 .. v20}, Lcom/join/kotlin/ui/modleregin/modle/MustplayItemBean;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/join/mgps/business/CollectionBeanSubBusiness;Ljava/lang/String;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 21
    iget-object v4, v0, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle$loadDatas$job$1$1;->this$0:Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle;

    invoke-virtual {v4}, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle;->getShowDatas()Landroidx/lifecycle/MutableLiveData;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v4, Ljava/util/List;

    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    move v4, v5

    goto/16 :goto_0

    .line 22
    :cond_3
    iget-object v1, v0, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle$loadDatas$job$1$1;->this$0:Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle;

    invoke-virtual {v1}, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle;->getPage()I

    move-result v2

    add-int/2addr v2, v3

    invoke-virtual {v1, v2}, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle;->setPage(I)V

    .line 23
    iget-object v1, v0, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle$loadDatas$job$1$1;->this$0:Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle;

    invoke-virtual {v1}, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle;->getRecycleViewStatus()Landroidx/lifecycle/MutableLiveData;

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 24
    iget-object v1, v0, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle$loadDatas$job$1$1;->this$0:Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle;

    invoke-virtual {v1}, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle;->getShowDatas()Landroidx/lifecycle/MutableLiveData;

    move-result-object v1

    iget-object v2, v0, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle$loadDatas$job$1$1;->this$0:Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle;

    invoke-virtual {v2}, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle;->getShowDatas()Landroidx/lifecycle/MutableLiveData;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    goto :goto_2

    .line 25
    :cond_4
    :goto_1
    iget-object v1, v0, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle$loadDatas$job$1$1;->this$0:Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle;

    invoke-virtual {v1}, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle;->getRecycleViewStatus()Landroidx/lifecycle/MutableLiveData;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    goto :goto_2

    .line 26
    :cond_5
    iget-object v1, v0, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle$loadDatas$job$1$1;->$context:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v1

    iget-object v2, v0, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle$loadDatas$job$1$1;->$result:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v2, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v2, Lcom/join/mgps/dto/ResponseModel;

    invoke-virtual {v2}, Lcom/join/mgps/dto/ResponseModel;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    .line 27
    :goto_2
    iget-object v1, v0, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle$loadDatas$job$1$1;->this$0:Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle;

    invoke-virtual {v1}, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle;->getShowDatas()Landroidx/lifecycle/MutableLiveData;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_6

    .line 28
    iget-object v1, v0, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle$loadDatas$job$1$1;->this$0:Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle;

    invoke-virtual {v1}, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle;->getLoadBindData()Landroidx/lifecycle/MutableLiveData;

    move-result-object v1

    new-instance v2, Lcom/join/kotlin/domain/common/LoadBindindData;

    invoke-direct {v2, v3}, Lcom/join/kotlin/domain/common/LoadBindindData;-><init>(I)V

    invoke-virtual {v1, v2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    goto :goto_3

    .line 29
    :cond_6
    iget-object v1, v0, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle$loadDatas$job$1$1;->this$0:Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle;

    invoke-virtual {v1}, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle;->getLoadBindData()Landroidx/lifecycle/MutableLiveData;

    move-result-object v1

    .line 30
    new-instance v2, Lcom/join/kotlin/domain/common/LoadBindindData;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Lcom/join/kotlin/domain/common/LoadBindindData;-><init>(I)V

    .line 31
    invoke-virtual {v1, v2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 32
    :goto_3
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 33
    :cond_7
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :goto_4
    throw v1

    :goto_5
    goto :goto_4
.end method
