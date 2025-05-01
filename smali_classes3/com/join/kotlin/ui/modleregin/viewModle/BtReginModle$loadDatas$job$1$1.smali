.class final Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "BtReginModle.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBtReginModle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BtReginModle.kt\ncom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,610:1\n1855#2,2:611\n1855#2,2:613\n1864#2,2:615\n1855#2,2:617\n1864#2,2:619\n1549#2:621\n1620#2,3:622\n1864#2,3:625\n1866#2:628\n1866#2:629\n*S KotlinDebug\n*F\n+ 1 BtReginModle.kt\ncom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1\n*L\n153#1:611,2\n207#1:613,2\n247#1:615,2\n249#1:617,2\n276#1:619,2\n281#1:621\n281#1:622,3\n352#1:625,3\n276#1:628\n247#1:629\n*E\n"
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.join.kotlin.ui.modleregin.viewModle.BtReginModle$loadDatas$job$1$1"
    f = "BtReginModle.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBtReginModle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BtReginModle.kt\ncom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,610:1\n1855#2,2:611\n1855#2,2:613\n1864#2,2:615\n1855#2,2:617\n1864#2,2:619\n1549#2:621\n1620#2,3:622\n1864#2,3:625\n1866#2:628\n1866#2:629\n*S KotlinDebug\n*F\n+ 1 BtReginModle.kt\ncom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1\n*L\n153#1:611,2\n207#1:613,2\n247#1:615,2\n249#1:617,2\n276#1:619,2\n281#1:621\n281#1:622,3\n352#1:625,3\n276#1:628\n247#1:629\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $context:Landroid/content/Context;

.field final synthetic $result:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;",
            ">;>;"
        }
    .end annotation
.end field

.field label:I

.field final synthetic this$0:Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;Landroid/content/Context;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;",
            ">;>;",
            "Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;",
            "Landroid/content/Context;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1;->$result:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p2, p0, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1;->this$0:Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    iput-object p3, p0, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1;->$context:Landroid/content/Context;

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

    new-instance p1, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1;

    iget-object v0, p0, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1;->$result:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, p0, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1;->this$0:Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    iget-object v2, p0, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1;->$context:Landroid/content/Context;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;Landroid/content/Context;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/q0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1;->invoke(Lkotlinx/coroutines/q0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 56
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    move-object/from16 v1, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 1
    iget v2, v1, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1;->label:I

    if-nez v2, :cond_5f

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 2
    iget-object v2, v1, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1;->$result:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v2, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v2, Lcom/join/mgps/dto/ResponseModel;

    invoke-virtual {v2}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result v2

    const/16 v3, 0xc8

    const/4 v5, 0x1

    if-ne v2, v3, :cond_5d

    .line 3
    iget-object v2, v1, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1;->this$0:Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    invoke-virtual {v2}, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;->getPage()I

    move-result v2

    if-ne v2, v5, :cond_0

    iget-object v2, v1, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1;->this$0:Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    invoke-virtual {v2}, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;->getShowDatas()Landroidx/lifecycle/MutableLiveData;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 4
    :cond_0
    new-instance v2, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    iget-object v3, v1, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1;->this$0:Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    invoke-virtual {v3}, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;->getShowDatas()Landroidx/lifecycle/MutableLiveData;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v3, Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    iput v3, v2, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 5
    iget-object v3, v1, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1;->$result:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v3, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v3, Lcom/join/mgps/dto/ResponseModel;

    invoke-virtual {v3}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v3

    const/4 v6, 0x4

    if-nez v3, :cond_1

    .line 6
    iget-object v2, v1, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1;->this$0:Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    invoke-virtual {v2}, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;->getRecycleViewStatus()Landroidx/lifecycle/MutableLiveData;

    move-result-object v2

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    goto/16 :goto_30

    .line 7
    :cond_1
    :try_start_0
    new-instance v3, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v3}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 8
    new-instance v7, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v7}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    iget-object v8, v1, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1;->$result:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v8, v8, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v8, Lcom/join/mgps/dto/ResponseModel;

    invoke-virtual {v8}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 9
    iget-object v8, v1, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1;->this$0:Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    invoke-virtual {v8}, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;->getPage()I

    move-result v8
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    const-string v9, "be.info"

    const-string v10, "be.game_name"

    const-string/jumbo v11, "| "

    const-string v12, " \u00b7 "

    const-string v13, "7"

    const-string v14, "154"

    const-string v15, "25"

    const-string v6, "48"

    const-string/jumbo v4, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    const-string v5, "47"

    move-object/from16 v16, v9

    const-string v9, "45"

    move-object/from16 v17, v10

    const-string v10, "44"

    move-object/from16 v18, v11

    const-string v11, ""

    move-object/from16 v21, v4

    const/4 v4, 0x1

    if-ne v8, v4, :cond_27

    .line 10
    :try_start_1
    iget-object v4, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v4, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;

    invoke-virtual {v4}, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;->getHead_banner_game()Lcom/join/kotlin/ui/modleregin/modle/BtVideodata;

    move-result-object v4

    .line 11
    new-instance v8, Lcom/join/mgps/business/CollectionBeanSubBusiness;

    move-object/from16 v33, v7

    invoke-virtual {v4}, Lcom/join/kotlin/ui/modleregin/modle/BtVideodata;->getGameEntity()Lcom/join/mgps/dto/CollectionBeanSub;

    move-result-object v7

    invoke-direct {v8, v7}, Lcom/join/mgps/business/CollectionBeanSubBusiness;-><init>(Lcom/join/mgps/dto/CollectionBeanSub;)V

    const/16 v7, 0x92

    .line 12
    invoke-virtual {v8, v7}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    .line 13
    invoke-virtual {v8, v7}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    .line 14
    invoke-virtual {v8}, Lcom/join/mgps/dto/CollectionBeanSub;->getIndex()I

    move-result v7

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v8, v7}, Lcom/join/mgps/dto/DownloadPointBase;->setRecPosition(Ljava/lang/String;)V

    .line 15
    iget-object v7, v1, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1;->this$0:Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    invoke-virtual {v7, v8}, Lcom/join/kotlin/ui/base/BaseHasDownloadActivityViewModle;->updateDowState(Lcom/join/mgps/business/CollectionBeanSubBusiness;)V

    .line 16
    invoke-virtual {v8}, Lcom/join/mgps/dto/CollectionBeanSub;->getTag_info()Ljava/util/ArrayList;

    move-result-object v7
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    if-eqz v7, :cond_7

    .line 17
    :try_start_2
    invoke-virtual {v8}, Lcom/join/mgps/dto/CollectionBeanSub;->getTag_info()Ljava/util/ArrayList;

    move-result-object v7

    if-eqz v7, :cond_2

    invoke-virtual {v8}, Lcom/join/mgps/dto/CollectionBeanSub;->getTag_info()Ljava/util/ArrayList;

    move-result-object v22

    invoke-virtual/range {v22 .. v22}, Ljava/util/ArrayList;->size()I

    move-result v1

    move-object/from16 v30, v8

    const/4 v8, 0x3

    invoke-static {v8, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    const/4 v8, 0x0

    invoke-virtual {v7, v8, v1}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_2
    move-object/from16 v30, v8

    :goto_0
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-object v7, v11

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/join/mgps/dto/TipBean;

    .line 18
    invoke-virtual {v8}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v22

    if-eqz v22, :cond_5

    move-object/from16 v22, v1

    invoke-virtual {v8}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    invoke-virtual {v8}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    invoke-virtual {v8}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    invoke-virtual {v8}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    invoke-virtual {v8}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    invoke-virtual {v8}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    invoke-virtual {v8}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    invoke-virtual {v8}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    .line 19
    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Lcom/join/mgps/dto/TipBean;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_2

    :cond_5
    move-object/from16 v22, v1

    :cond_6
    :goto_2
    move-object/from16 v1, v22

    goto/16 :goto_1

    :cond_7
    move-object/from16 v30, v8

    move-object v7, v11

    .line 20
    :cond_8
    iget-object v1, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    .line 21
    new-instance v8, Lcom/psk/kotlin/util/CommonListMainData;

    const/16 v34, 0x4

    .line 22
    new-instance v35, Lcom/join/kotlin/ui/modleregin/modle/MustplayItemBean;

    move-object/from16 v36, v12

    .line 23
    iget v12, v2, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 24
    invoke-virtual {v4}, Lcom/join/kotlin/ui/modleregin/modle/BtVideodata;->getVideoUrl()Ljava/lang/String;

    move-result-object v24

    .line 25
    invoke-virtual {v4}, Lcom/join/kotlin/ui/modleregin/modle/BtVideodata;->getGameEntity()Lcom/join/mgps/dto/CollectionBeanSub;

    move-result-object v22

    move-object/from16 v37, v13

    invoke-virtual/range {v22 .. v22}, Lcom/join/mgps/dto/CollectionBeanSub;->getGame_info_top_pic()Ljava/lang/String;

    move-result-object v13

    move-object/from16 v38, v14

    const-string v14, "btVideodata.gameEntity.game_info_top_pic"

    invoke-static {v13, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-virtual {v4}, Lcom/join/kotlin/ui/modleregin/modle/BtVideodata;->getGameEntity()Lcom/join/mgps/dto/CollectionBeanSub;

    move-result-object v14

    invoke-virtual {v14}, Lcom/join/mgps/dto/CollectionBeanSub;->getGame_info_top_video_url()Ljava/lang/String;

    move-result-object v26

    .line 27
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v27

    .line 28
    invoke-virtual {v4}, Lcom/join/kotlin/ui/modleregin/modle/BtVideodata;->getGameEntity()Lcom/join/mgps/dto/CollectionBeanSub;

    move-result-object v14

    invoke-virtual {v14}, Lcom/join/mgps/dto/CollectionBeanSub;->getGame_name()Ljava/lang/String;

    move-result-object v14

    move-object/from16 v39, v15

    const-string v15, "btVideodata.gameEntity.game_name"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    invoke-virtual {v4}, Lcom/join/kotlin/ui/modleregin/modle/BtVideodata;->getGameEntity()Lcom/join/mgps/dto/CollectionBeanSub;

    move-result-object v15

    invoke-virtual {v15}, Lcom/join/mgps/dto/CollectionBeanSub;->getInfo()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v40, v6

    const-string v6, "btVideodata.gameEntity.info"

    invoke-static {v15, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    if-eqz v7, :cond_9

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v22

    move-object/from16 v41, v5

    const/16 v20, 0x2

    add-int/lit8 v5, v22, -0x2

    move-object/from16 v42, v9

    const/4 v9, 0x0

    invoke-static {v9, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-virtual {v7, v9, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v7, v21

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_3

    :cond_9
    move-object/from16 v41, v5

    move-object/from16 v42, v9

    move-object/from16 v7, v21

    const/4 v5, 0x0

    :goto_3
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v5, v18

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    invoke-virtual {v4}, Lcom/join/kotlin/ui/modleregin/modle/BtVideodata;->getGameEntity()Lcom/join/mgps/dto/CollectionBeanSub;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/CollectionBeanSub;->getActual_size()J

    move-result-wide v22

    .line 32
    invoke-static/range {v22 .. v23}, Lcom/join/mgps/Util/UtilsMy;->J2(J)Ljava/lang/String;

    move-result-object v4

    .line 33
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v31

    const/4 v4, 0x1

    .line 34
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v32

    move-object/from16 v22, v35

    move/from16 v23, v12

    move-object/from16 v25, v13

    move-object/from16 v28, v14

    move-object/from16 v29, v15

    .line 35
    invoke-direct/range {v22 .. v32}, Lcom/join/kotlin/ui/modleregin/modle/MustplayItemBean;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/join/mgps/business/CollectionBeanSubBusiness;Ljava/lang/String;Ljava/lang/Boolean;)V

    const-string v25, "1-1"

    const/16 v26, 0x0

    const/16 v27, 0x8

    const/16 v28, 0x0

    move-object/from16 v22, v8

    move/from16 v23, v34

    move-object/from16 v24, v35

    .line 36
    invoke-direct/range {v22 .. v28}, Lcom/psk/kotlin/util/CommonListMainData;-><init>(ILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 37
    invoke-interface {v1, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 38
    iget v1, v2, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    const/4 v4, 0x1

    add-int/2addr v1, v4

    iput v1, v2, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    move-object/from16 v1, v33

    .line 39
    iget-object v4, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v4, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;

    invoke-virtual {v4}, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;->getAd_collection()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_a

    .line 40
    iget-object v4, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    .line 41
    new-instance v6, Lcom/psk/kotlin/util/CommonListMainData;

    const/16 v23, 0x5

    .line 42
    iget-object v8, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v8, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;

    invoke-virtual {v8}, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;->getAd_collection()Ljava/util/List;

    move-result-object v24

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0xc

    const/16 v28, 0x0

    move-object/from16 v22, v6

    .line 43
    invoke-direct/range {v22 .. v28}, Lcom/psk/kotlin/util/CommonListMainData;-><init>(ILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 44
    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-result v4

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 45
    :cond_a
    iget v4, v2, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    const/4 v6, 0x1

    add-int/2addr v4, v6

    iput v4, v2, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 46
    iget-object v4, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v4, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;

    invoke-virtual {v4}, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;->getNew_online_game()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_c

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_b

    goto :goto_4

    :cond_b
    const/4 v4, 0x0

    goto :goto_5

    :cond_c
    :goto_4
    const/4 v4, 0x1

    :goto_5
    if-nez v4, :cond_26

    .line 47
    iget-object v4, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    .line 48
    new-instance v6, Lcom/psk/kotlin/util/CommonListMainData;

    const/16 v23, 0x1

    .line 49
    new-instance v8, Lcom/join/kotlin/ui/modleregin/modle/TitleModle;

    const-string/jumbo v9, "\u5373\u5c06\u4e0a\u7ebf"

    const/4 v12, 0x1

    invoke-static {v12}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v13

    const/4 v12, 0x0

    invoke-direct {v8, v9, v11, v12, v13}, Lcom/join/kotlin/ui/modleregin/modle/TitleModle;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/join/mgps/Util/IntentDateBean;Ljava/lang/Boolean;)V

    const-string v25, ""

    const/16 v26, 0x0

    const/16 v27, 0x8

    const/16 v28, 0x0

    move-object/from16 v22, v6

    move-object/from16 v24, v8

    .line 50
    invoke-direct/range {v22 .. v28}, Lcom/psk/kotlin/util/CommonListMainData;-><init>(ILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 51
    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 52
    iget v4, v2, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    const/4 v6, 0x1

    add-int/2addr v4, v6

    iput v4, v2, Lkotlin/jvm/internal/Ref$IntRef;->element:I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    move-object/from16 v4, p0

    .line 53
    :try_start_3
    iget-object v6, v4, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1;->this$0:Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    invoke-virtual {v6}, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;->getOnlineGameTitles()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->clear()V

    .line 54
    new-instance v6, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v6}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 55
    new-instance v8, Lkotlin/jvm/internal/Ref$BooleanRef;

    invoke-direct {v8}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    .line 56
    iget-object v9, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v9, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;

    invoke-virtual {v9}, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;->getNew_online_game()Ljava/util/List;

    move-result-object v9

    iget-object v13, v4, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1;->this$0:Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    .line 57
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_6
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_15

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/join/kotlin/ui/modleregin/modle/BtOnlineGame;

    .line 58
    iget-object v15, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    if-nez v15, :cond_d

    .line 59
    iput-object v14, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 60
    :cond_d
    invoke-virtual {v14}, Lcom/join/kotlin/ui/modleregin/modle/BtOnlineGame;->getOnlineTime()J

    move-result-wide v18

    const/16 v15, 0x3e8

    move-object/from16 v22, v13

    int-to-long v12, v15

    mul-long v12, v12, v18

    .line 61
    invoke-virtual {v14}, Lcom/join/kotlin/ui/modleregin/modle/BtOnlineGame;->getGameEntityList()Ljava/util/List;

    move-result-object v15

    if-eqz v15, :cond_f

    invoke-interface {v15}, Ljava/util/Collection;->isEmpty()Z

    move-result v15

    if-eqz v15, :cond_e

    goto :goto_7

    :cond_e
    const/4 v15, 0x0

    goto :goto_8

    :cond_f
    :goto_7
    const/4 v15, 0x1

    :goto_8
    if-nez v15, :cond_14

    .line 62
    invoke-static {v12, v13}, Lcom/join/mgps/Util/y;->u(J)Z

    move-result v15

    if-eqz v15, :cond_10

    const/4 v15, 0x1

    .line 63
    iput-boolean v15, v8, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    const-string/jumbo v12, "\u4eca\u5929"

    move-object/from16 v19, v9

    move-object/from16 v18, v10

    goto :goto_9

    :cond_10
    const v15, 0x5265c00

    move-object/from16 v19, v9

    move-object/from16 v18, v10

    int-to-long v9, v15

    sub-long v23, v12, v9

    .line 64
    invoke-static/range {v23 .. v24}, Lcom/join/mgps/Util/y;->u(J)Z

    move-result v15

    if-eqz v15, :cond_11

    const-string/jumbo v12, "\u660e\u5929"

    goto :goto_9

    :cond_11
    add-long/2addr v9, v12

    .line 65
    invoke-static {v9, v10}, Lcom/join/mgps/Util/y;->u(J)Z

    move-result v9

    if-eqz v9, :cond_12

    const-string/jumbo v12, "\u6628\u5929"

    goto :goto_9

    :cond_12
    const-string v9, "MM-dd"

    .line 66
    invoke-static {v12, v13, v9}, Lcom/join/mgps/Util/y;->y(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v12

    :goto_9
    const-string/jumbo v9, "\u4eca\u5929"

    .line 67
    invoke-static {v12, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_13

    .line 68
    iput-object v14, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 69
    invoke-virtual/range {v22 .. v22}, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;->getOnlineGameTitles()Ljava/util/List;

    move-result-object v9

    .line 70
    new-instance v10, Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;

    .line 71
    invoke-virtual {v14}, Lcom/join/kotlin/ui/modleregin/modle/BtOnlineGame;->getOnlineTime()J

    move-result-wide v13

    const-string/jumbo v15, "timeShow"

    .line 72
    invoke-static {v12, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v15, 0x1

    .line 73
    invoke-direct {v10, v13, v14, v12, v15}, Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;-><init>(JLjava/lang/String;Z)V

    .line 74
    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_a

    .line 75
    :cond_13
    invoke-virtual/range {v22 .. v22}, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;->getOnlineGameTitles()Ljava/util/List;

    move-result-object v9

    .line 76
    new-instance v10, Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;

    .line 77
    invoke-virtual {v14}, Lcom/join/kotlin/ui/modleregin/modle/BtOnlineGame;->getOnlineTime()J

    move-result-wide v13

    const-string/jumbo v15, "timeShow"

    .line 78
    invoke-static {v12, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v15, 0x0

    .line 79
    invoke-direct {v10, v13, v14, v12, v15}, Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;-><init>(JLjava/lang/String;Z)V

    .line 80
    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_14
    move-object/from16 v19, v9

    move-object/from16 v18, v10

    :goto_a
    move-object/from16 v10, v18

    move-object/from16 v9, v19

    move-object/from16 v13, v22

    const/4 v12, 0x0

    goto/16 :goto_6

    :cond_15
    move-object/from16 v18, v10

    .line 81
    iget-boolean v8, v8, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    if-nez v8, :cond_16

    iget-object v8, v4, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1;->this$0:Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    invoke-virtual {v8}, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;->getOnlineGameTitles()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    move-result v8

    const/4 v9, 0x1

    xor-int/2addr v8, v9

    if-eqz v8, :cond_16

    .line 82
    iget-object v8, v4, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1;->this$0:Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    invoke-virtual {v8}, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;->getOnlineGameTitles()Ljava/util/List;

    move-result-object v8

    const/4 v10, 0x0

    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;

    invoke-virtual {v8, v9}, Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;->setStatus(Z)V

    .line 83
    :cond_16
    iget-object v8, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v8, Ljava/util/List;

    .line 84
    new-instance v9, Lcom/psk/kotlin/util/CommonListMainData;

    const/16 v23, 0x8

    .line 85
    iget-object v10, v4, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1;->this$0:Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    invoke-virtual {v10}, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;->getOnlineGameTitles()Ljava/util/List;

    move-result-object v24

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0xc

    const/16 v28, 0x0

    move-object/from16 v22, v9

    .line 86
    invoke-direct/range {v22 .. v28}, Lcom/psk/kotlin/util/CommonListMainData;-><init>(ILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 87
    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 88
    iget-object v8, v4, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1;->this$0:Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    iget-object v9, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v9, Ljava/util/List;

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v9

    invoke-virtual {v8, v9}, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;->setTagListPosition(I)V

    .line 89
    iget v8, v2, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    const/4 v9, 0x1

    add-int/2addr v8, v9

    iput v8, v2, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 90
    iget-object v8, v4, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1;->this$0:Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    invoke-virtual {v8}, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;->getListBtOnlineGame()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->clear()V

    .line 91
    iget-object v8, v4, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1;->this$0:Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    invoke-virtual {v8}, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;->getListBtOnlineGame()Ljava/util/List;

    move-result-object v8

    iget-object v9, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v9, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;

    invoke-virtual {v9}, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;->getNew_online_game()Ljava/util/List;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 92
    iget-object v6, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v6, Lcom/join/kotlin/ui/modleregin/modle/BtOnlineGame;

    if-eqz v6, :cond_25

    invoke-virtual {v6}, Lcom/join/kotlin/ui/modleregin/modle/BtOnlineGame;->getGameEntityList()Ljava/util/List;

    move-result-object v6

    if-eqz v6, :cond_25

    iget-object v8, v4, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1;->this$0:Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    .line 93
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_b
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_24

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/join/mgps/dto/CollectionBeanSub;

    .line 94
    new-instance v10, Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-direct {v10, v9}, Lcom/join/mgps/business/CollectionBeanSubBusiness;-><init>(Lcom/join/mgps/dto/CollectionBeanSub;)V

    const/16 v9, 0x92

    .line 95
    invoke-virtual {v10, v9}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    .line 96
    invoke-virtual {v10, v9}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    .line 97
    invoke-virtual {v10}, Lcom/join/mgps/dto/CollectionBeanSub;->getIndex()I

    move-result v9

    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v10, v9}, Lcom/join/mgps/dto/DownloadPointBase;->setRecPosition(Ljava/lang/String;)V

    .line 98
    invoke-virtual {v8, v10}, Lcom/join/kotlin/ui/base/BaseHasDownloadActivityViewModle;->updateDowState(Lcom/join/mgps/business/CollectionBeanSubBusiness;)V

    .line 99
    invoke-virtual {v10}, Lcom/join/mgps/dto/CollectionBeanSub;->getTag_info()Ljava/util/ArrayList;

    move-result-object v9

    if-eqz v9, :cond_22

    .line 100
    invoke-virtual {v10}, Lcom/join/mgps/dto/CollectionBeanSub;->getTag_info()Ljava/util/ArrayList;

    move-result-object v9

    if-eqz v9, :cond_17

    invoke-virtual {v10}, Lcom/join/mgps/dto/CollectionBeanSub;->getTag_info()Ljava/util/ArrayList;

    move-result-object v12

    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v12

    const/4 v13, 0x3

    invoke-static {v13, v12}, Ljava/lang/Math;->min(II)I

    move-result v12

    const/4 v13, 0x0

    invoke-virtual {v9, v13, v12}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v9

    if-nez v9, :cond_18

    :cond_17
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v9

    :cond_18
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    move-object v12, v11

    :goto_c
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_21

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/join/mgps/dto/TipBean;

    .line 101
    invoke-virtual {v13}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v14

    if-eqz v14, :cond_20

    invoke-virtual {v13}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_20

    invoke-virtual {v13}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v14

    move-object/from16 v15, v18

    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_1f

    invoke-virtual {v13}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v14

    move-object/from16 v18, v6

    move-object/from16 v6, v42

    invoke-static {v14, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_1e

    invoke-virtual {v13}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v14

    move-object/from16 v19, v9

    move-object/from16 v9, v41

    invoke-static {v14, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_1d

    invoke-virtual {v13}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v14

    move-object/from16 v41, v9

    move-object/from16 v9, v40

    invoke-static {v14, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_1c

    invoke-virtual {v13}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v14

    move-object/from16 v40, v9

    move-object/from16 v9, v39

    invoke-static {v14, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_1b

    invoke-virtual {v13}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v14

    move-object/from16 v39, v9

    move-object/from16 v9, v38

    invoke-static {v14, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_1a

    invoke-virtual {v13}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v14

    move-object/from16 v38, v9

    move-object/from16 v9, v37

    invoke-static {v14, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_19

    move-object/from16 v13, v36

    goto :goto_f

    .line 102
    :cond_19
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Lcom/join/mgps/dto/TipBean;->getName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v13, v36

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    goto :goto_f

    :cond_1a
    move-object/from16 v38, v9

    goto :goto_d

    :cond_1b
    move-object/from16 v39, v9

    goto :goto_d

    :cond_1c
    move-object/from16 v40, v9

    goto :goto_d

    :cond_1d
    move-object/from16 v41, v9

    goto :goto_d

    :cond_1e
    move-object/from16 v19, v9

    :goto_d
    move-object/from16 v13, v36

    move-object/from16 v9, v37

    goto :goto_f

    :cond_1f
    move-object/from16 v18, v6

    move-object/from16 v19, v9

    move-object/from16 v13, v36

    move-object/from16 v9, v37

    goto :goto_e

    :cond_20
    move-object/from16 v19, v9

    move-object/from16 v15, v18

    move-object/from16 v13, v36

    move-object/from16 v9, v37

    move-object/from16 v18, v6

    :goto_e
    move-object/from16 v6, v42

    :goto_f
    move-object/from16 v42, v6

    move-object/from16 v37, v9

    move-object/from16 v36, v13

    move-object/from16 v6, v18

    move-object/from16 v9, v19

    move-object/from16 v18, v15

    goto/16 :goto_c

    :cond_21
    move-object/from16 v15, v18

    move-object/from16 v13, v36

    move-object/from16 v9, v37

    move-object/from16 v18, v6

    move-object/from16 v6, v42

    goto :goto_10

    :cond_22
    move-object/from16 v15, v18

    move-object/from16 v13, v36

    move-object/from16 v9, v37

    move-object/from16 v18, v6

    move-object/from16 v6, v42

    move-object v12, v11

    .line 103
    :goto_10
    new-instance v14, Lcom/psk/kotlin/util/CommonListMainData;

    const/16 v19, 0x2

    .line 104
    new-instance v31, Lcom/join/kotlin/ui/modleregin/modle/BtGameListItem;

    const/16 v23, 0x3e7

    move-object/from16 v36, v13

    .line 105
    invoke-virtual {v10}, Lcom/join/mgps/dto/CollectionBeanSub;->getIco_remote()Ljava/lang/String;

    move-result-object v13

    move-object/from16 v37, v9

    const-string v9, "be.ico_remote"

    invoke-static {v13, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    invoke-virtual {v10}, Lcom/join/mgps/dto/CollectionBeanSub;->getGif_ico_remote()Ljava/lang/String;

    move-result-object v25

    .line 107
    invoke-virtual {v10}, Lcom/join/mgps/dto/CollectionBeanSub;->getGame_name()Ljava/lang/String;

    move-result-object v9

    move-object/from16 v42, v6

    move-object/from16 v6, v17

    invoke-static {v9, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v17, v6

    .line 108
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    if-eqz v12, :cond_23

    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v22

    move-object/from16 v32, v15

    const/16 v20, 0x2

    add-int/lit8 v15, v22, -0x2

    move-object/from16 v33, v11

    const/4 v11, 0x0

    invoke-static {v11, v15}, Ljava/lang/Math;->max(II)I

    move-result v15

    invoke-virtual {v12, v11, v15}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_11

    :cond_23
    move-object/from16 v33, v11

    move-object/from16 v32, v15

    const/4 v12, 0x0

    :goto_11
    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    invoke-virtual {v10}, Lcom/join/mgps/dto/CollectionBeanSub;->getActual_size()J

    move-result-wide v11

    .line 110
    invoke-static {v11, v12}, Lcom/join/mgps/Util/UtilsMy;->J2(J)Ljava/lang/String;

    move-result-object v11

    .line 111
    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v27

    .line 112
    invoke-virtual {v10}, Lcom/join/mgps/dto/CollectionBeanSub;->getInfo()Ljava/lang/String;

    move-result-object v6

    move-object/from16 v11, v16

    invoke-static {v6, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    new-instance v12, Lcom/join/kotlin/domain/common/AppListItemShowBean;

    const/4 v15, 0x0

    invoke-direct {v12, v10, v15}, Lcom/join/kotlin/domain/common/AppListItemShowBean;-><init>(Lcom/join/mgps/business/CollectionBeanSubBusiness;Z)V

    move-object/from16 v22, v31

    move-object/from16 v24, v13

    move-object/from16 v26, v9

    move-object/from16 v28, v6

    move-object/from16 v29, v10

    move-object/from16 v30, v12

    .line 114
    invoke-direct/range {v22 .. v30}, Lcom/join/kotlin/ui/modleregin/modle/BtGameListItem;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/join/mgps/business/CollectionBeanSubBusiness;Lcom/join/kotlin/domain/common/AppListItemShowBean;)V

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0xc

    const/16 v28, 0x0

    move-object/from16 v22, v14

    move/from16 v23, v19

    move-object/from16 v24, v31

    .line 115
    invoke-direct/range {v22 .. v28}, Lcom/psk/kotlin/util/CommonListMainData;-><init>(ILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 116
    invoke-virtual {v8}, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;->getTagList()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 117
    iget-object v6, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    invoke-interface {v6, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v16, v11

    move-object/from16 v6, v18

    move-object/from16 v18, v32

    move-object/from16 v11, v33

    goto/16 :goto_b

    :cond_24
    move-object/from16 v33, v11

    move-object/from16 v11, v16

    move-object/from16 v32, v18

    .line 118
    sget-object v6, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_12

    :cond_25
    move-object/from16 v33, v11

    move-object/from16 v11, v16

    move-object/from16 v32, v18

    goto :goto_12

    :cond_26
    move-object/from16 v4, p0

    move-object/from16 v32, v10

    move-object/from16 v33, v11

    move-object/from16 v11, v16

    goto :goto_12

    :catch_0
    move-exception v0

    move-object/from16 v1, p0

    goto/16 :goto_2e

    :cond_27
    move-object v4, v1

    move-object/from16 v41, v5

    move-object/from16 v40, v6

    move-object v1, v7

    move-object/from16 v42, v9

    move-object/from16 v32, v10

    move-object/from16 v33, v11

    move-object/from16 v36, v12

    move-object/from16 v37, v13

    move-object/from16 v38, v14

    move-object/from16 v39, v15

    move-object/from16 v11, v16

    move-object/from16 v5, v18

    move-object/from16 v7, v21

    .line 119
    :goto_12
    :try_start_4
    iget-object v6, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v6, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;

    invoke-virtual {v6}, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;->getDynamic_component()Ljava/util/List;

    move-result-object v6
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    if-eqz v6, :cond_29

    :try_start_5
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    if-eqz v6, :cond_28

    goto :goto_13

    :cond_28
    const/4 v6, 0x0

    goto :goto_14

    :catch_1
    move-exception v0

    move-object v2, v0

    move-object v1, v4

    goto/16 :goto_2f

    :cond_29
    :goto_13
    const/4 v6, 0x1

    :goto_14
    if-nez v6, :cond_5c

    .line 120
    :try_start_6
    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;

    invoke-virtual {v1}, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;->getDynamic_component()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v6, v4, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1;->this$0:Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    .line 121
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v8, 0x0

    :goto_15
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v9
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    if-eqz v9, :cond_5b

    :try_start_7
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    add-int/lit8 v10, v8, 0x1

    if-gez v8, :cond_2a

    :try_start_8
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1

    :cond_2a
    :try_start_9
    check-cast v9, Lcom/join/kotlin/ui/modleregin/modle/BTDynamicMain;

    .line 122
    invoke-virtual {v9}, Lcom/join/kotlin/ui/modleregin/modle/BTDynamicMain;->getComponents()Ljava/util/List;

    move-result-object v8
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0

    if-eqz v8, :cond_2e

    .line 123
    :try_start_a
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    const/4 v12, 0x0

    :cond_2b
    :goto_16
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_2d

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/join/kotlin/ui/modleregin/modle/BTDynamicModle;

    .line 124
    invoke-virtual {v13}, Lcom/join/kotlin/ui/modleregin/modle/BTDynamicModle;->getModelType()Ljava/lang/Integer;

    move-result-object v14

    if-nez v14, :cond_2c

    goto :goto_16

    :cond_2c
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14

    const/4 v15, 0x1

    if-ne v14, v15, :cond_2b

    .line 125
    invoke-virtual {v13}, Lcom/join/kotlin/ui/modleregin/modle/BTDynamicModle;->getCollectionId()Ljava/lang/String;

    move-result-object v14

    if-eqz v14, :cond_2b

    .line 126
    new-instance v12, Lcom/join/mgps/Util/IntentDateBean;

    invoke-direct {v12}, Lcom/join/mgps/Util/IntentDateBean;-><init>()V

    const/4 v14, 0x2

    .line 127
    invoke-virtual {v12, v14}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type(I)V

    .line 128
    invoke-virtual {v13}, Lcom/join/kotlin/ui/modleregin/modle/BTDynamicModle;->getCollectionTplId()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v12, v14}, Lcom/join/mgps/Util/IntentDateBean;->setTpl_type(Ljava/lang/String;)V

    .line 129
    invoke-virtual {v13}, Lcom/join/kotlin/ui/modleregin/modle/BTDynamicModle;->getCollectionId()Ljava/lang/String;

    move-result-object v13

    .line 130
    invoke-virtual {v12, v13}, Lcom/join/mgps/Util/IntentDateBean;->setCrc_link_type_val(Ljava/lang/String;)V

    goto :goto_16

    .line 131
    :cond_2d
    sget-object v8, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1

    move-object/from16 v25, v12

    goto :goto_17

    :cond_2e
    const/16 v25, 0x0

    .line 132
    :goto_17
    :try_start_b
    iget-object v8, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v8, Ljava/util/List;

    .line 133
    new-instance v12, Lcom/psk/kotlin/util/CommonListMainData;

    const/16 v44, 0x1

    .line 134
    new-instance v45, Lcom/join/kotlin/ui/modleregin/modle/TitleModle;

    .line 135
    invoke-virtual {v9}, Lcom/join/kotlin/ui/modleregin/modle/BTDynamicMain;->getTitle()Ljava/lang/String;

    move-result-object v23

    .line 136
    invoke-virtual {v9}, Lcom/join/kotlin/ui/modleregin/modle/BTDynamicMain;->getSubTitle()Ljava/lang/String;

    move-result-object v24

    const/16 v26, 0x0

    const/16 v27, 0x8

    const/16 v28, 0x0

    move-object/from16 v22, v45

    .line 137
    invoke-direct/range {v22 .. v28}, Lcom/join/kotlin/ui/modleregin/modle/TitleModle;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/join/mgps/Util/IntentDateBean;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v46, ""

    const/16 v47, 0x0

    const/16 v48, 0x8

    const/16 v49, 0x0

    move-object/from16 v43, v12

    .line 138
    invoke-direct/range {v43 .. v49}, Lcom/psk/kotlin/util/CommonListMainData;-><init>(ILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 139
    invoke-interface {v8, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 140
    iget v8, v2, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    const/4 v12, 0x1

    add-int/2addr v8, v12

    iput v8, v2, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 141
    invoke-virtual {v9}, Lcom/join/kotlin/ui/modleregin/modle/BTDynamicMain;->getComponents()Ljava/util/List;

    move-result-object v8

    if-eqz v8, :cond_5a

    .line 142
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    const/4 v9, 0x0

    const/4 v12, 0x0

    :goto_18
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_59

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_0

    add-int/lit8 v14, v12, 0x1

    if-gez v12, :cond_2f

    :try_start_c
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_1

    :cond_2f
    :try_start_d
    check-cast v13, Lcom/join/kotlin/ui/modleregin/modle/BTDynamicModle;

    .line 143
    invoke-virtual {v13}, Lcom/join/kotlin/ui/modleregin/modle/BTDynamicModle;->getModelType()Ljava/lang/Integer;

    move-result-object v12
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_0

    const-string v15, "1-2-"

    if-nez v12, :cond_30

    move-object/from16 v16, v1

    move-object/from16 v18, v8

    goto/16 :goto_1d

    :cond_30
    move-object/from16 v16, v1

    .line 144
    :try_start_e
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v1
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_0

    move-object/from16 v18, v8

    const/4 v8, 0x1

    if-ne v1, v8, :cond_35

    .line 145
    :try_start_f
    invoke-virtual {v13}, Lcom/join/kotlin/ui/modleregin/modle/BTDynamicModle;->getGameEntityList()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_32

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_31

    goto :goto_19

    :cond_31
    const/4 v1, 0x0

    goto :goto_1a

    :cond_32
    :goto_19
    const/4 v1, 0x1

    :goto_1a
    if-nez v1, :cond_34

    .line 146
    invoke-virtual {v13}, Lcom/join/kotlin/ui/modleregin/modle/BTDynamicModle;->getGameEntityList()Ljava/util/List;

    move-result-object v1

    .line 147
    new-instance v8, Ljava/util/ArrayList;

    const/16 v12, 0xa

    invoke-static {v1, v12}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v12

    invoke-direct {v8, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 148
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_33

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .line 149
    check-cast v12, Lcom/join/mgps/dto/CollectionBeanSub;

    .line 150
    new-instance v13, Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-direct {v13, v12}, Lcom/join/mgps/business/CollectionBeanSubBusiness;-><init>(Lcom/join/mgps/dto/CollectionBeanSub;)V

    const/16 v12, 0x92

    .line 151
    invoke-virtual {v13, v12}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    .line 152
    invoke-virtual {v13, v12}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    .line 153
    invoke-virtual {v13}, Lcom/join/mgps/dto/CollectionBeanSub;->getIndex()I

    move-result v12

    invoke-static {v12}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v13, v12}, Lcom/join/mgps/dto/DownloadPointBase;->setRecPosition(Ljava/lang/String;)V

    .line 154
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-object/from16 v19, v1

    const/16 v1, 0x2d

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v9, v9, 0x1

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 155
    invoke-virtual {v13, v1}, Lcom/join/mgps/dto/DownloadPointBase;->setReMarks(Ljava/lang/String;)V

    .line 156
    invoke-virtual {v6, v13}, Lcom/join/kotlin/ui/base/BaseHasDownloadActivityViewModle;->updateDowState(Lcom/join/mgps/business/CollectionBeanSubBusiness;)V

    .line 157
    invoke-interface {v8, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, v19

    goto :goto_1b

    .line 158
    :cond_33
    iget-object v1, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    .line 159
    new-instance v12, Lcom/psk/kotlin/util/CommonListMainData;

    const/16 v23, 0x7

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0xc

    const/16 v28, 0x0

    move-object/from16 v22, v12

    move-object/from16 v24, v8

    invoke-direct/range {v22 .. v28}, Lcom/psk/kotlin/util/CommonListMainData;-><init>(ILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 160
    invoke-interface {v1, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 161
    iget v1, v2, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    const/4 v8, 0x1

    add-int/2addr v1, v8

    iput v1, v2, Lkotlin/jvm/internal/Ref$IntRef;->element:I
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_1

    :cond_34
    move-object v1, v2

    move-object/from16 v27, v3

    move-object v8, v5

    move-object/from16 v34, v6

    move-object/from16 v23, v7

    move-object v12, v11

    move/from16 v19, v14

    :goto_1c
    const/4 v7, 0x0

    goto/16 :goto_2c

    :cond_35
    :goto_1d
    if-nez v12, :cond_37

    :cond_36
    move-object v1, v2

    move-object/from16 v22, v3

    move-object/from16 v23, v5

    move-object/from16 v34, v6

    move-object/from16 v31, v11

    move/from16 v19, v14

    goto/16 :goto_25

    .line 162
    :cond_37
    :try_start_10
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v8, 0x3

    if-ne v1, v8, :cond_36

    .line 163
    invoke-virtual {v13}, Lcom/join/kotlin/ui/modleregin/modle/BTDynamicModle;->getGameEntity()Lcom/join/mgps/dto/CollectionBeanSub;

    move-result-object v1

    if-eqz v1, :cond_47

    .line 164
    invoke-virtual {v13}, Lcom/join/kotlin/ui/modleregin/modle/BTDynamicModle;->getGameEntity()Lcom/join/mgps/dto/CollectionBeanSub;

    move-result-object v1

    .line 165
    new-instance v8, Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-direct {v8, v1}, Lcom/join/mgps/business/CollectionBeanSubBusiness;-><init>(Lcom/join/mgps/dto/CollectionBeanSub;)V

    const/16 v12, 0x92

    .line 166
    invoke-virtual {v8, v12}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    .line 167
    invoke-virtual {v8, v12}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    .line 168
    invoke-virtual {v8}, Lcom/join/mgps/dto/CollectionBeanSub;->getIndex()I

    move-result v12

    invoke-static {v12}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8, v12}, Lcom/join/mgps/dto/DownloadPointBase;->setRecPosition(Ljava/lang/String;)V

    .line 169
    invoke-virtual {v6, v8}, Lcom/join/kotlin/ui/base/BaseHasDownloadActivityViewModle;->updateDowState(Lcom/join/mgps/business/CollectionBeanSubBusiness;)V

    .line 170
    invoke-virtual {v8}, Lcom/join/mgps/dto/CollectionBeanSub;->getTag_info()Ljava/util/ArrayList;

    move-result-object v12

    if-eqz v12, :cond_44

    .line 171
    invoke-virtual {v8}, Lcom/join/mgps/dto/CollectionBeanSub;->getTag_info()Ljava/util/ArrayList;

    move-result-object v12
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_0

    if-eqz v12, :cond_38

    :try_start_11
    invoke-virtual {v8}, Lcom/join/mgps/dto/CollectionBeanSub;->getTag_info()Ljava/util/ArrayList;

    move-result-object v13

    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v13

    move/from16 v19, v14

    const/4 v14, 0x3

    invoke-static {v14, v13}, Ljava/lang/Math;->min(II)I

    move-result v13

    const/4 v14, 0x0

    invoke-virtual {v12, v14, v13}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v12
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_1

    if-nez v12, :cond_39

    goto :goto_1e

    :cond_38
    move/from16 v19, v14

    :goto_1e
    :try_start_12
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v12

    :cond_39
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    move-object/from16 v13, v33

    :goto_1f
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_43

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/join/mgps/dto/TipBean;

    .line 172
    invoke-virtual {v14}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v22

    if-eqz v22, :cond_42

    move-object/from16 v22, v12

    invoke-virtual {v14}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v12

    move-object/from16 v4, v33

    invoke-static {v12, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_41

    invoke-virtual {v14}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v12

    move-object/from16 v23, v5

    move-object/from16 v5, v32

    invoke-static {v12, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_40

    invoke-virtual {v14}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v12

    move-object/from16 v32, v5

    move-object/from16 v5, v42

    invoke-static {v12, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_3f

    invoke-virtual {v14}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v12

    move-object/from16 v42, v5

    move-object/from16 v5, v41

    invoke-static {v12, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_3e

    invoke-virtual {v14}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v12

    move-object/from16 v41, v5

    move-object/from16 v5, v40

    invoke-static {v12, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_3d

    invoke-virtual {v14}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v12

    move-object/from16 v40, v5

    move-object/from16 v5, v39

    invoke-static {v12, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_3c

    invoke-virtual {v14}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v12

    move-object/from16 v39, v5

    move-object/from16 v5, v38

    invoke-static {v12, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_3b

    invoke-virtual {v14}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v12

    move-object/from16 v38, v5

    move-object/from16 v5, v37

    invoke-static {v12, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_3a

    move-object/from16 v14, v36

    goto :goto_21

    .line 173
    :cond_3a
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Lcom/join/mgps/dto/TipBean;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v14, v36

    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    goto :goto_21

    :cond_3b
    move-object/from16 v38, v5

    goto :goto_20

    :cond_3c
    move-object/from16 v39, v5

    goto :goto_20

    :cond_3d
    move-object/from16 v40, v5

    goto :goto_20

    :cond_3e
    move-object/from16 v41, v5

    goto :goto_20

    :cond_3f
    move-object/from16 v42, v5

    goto :goto_20

    :cond_40
    move-object/from16 v32, v5

    goto :goto_20

    :cond_41
    move-object/from16 v23, v5

    goto :goto_20

    :cond_42
    move-object/from16 v23, v5

    move-object/from16 v22, v12

    move-object/from16 v4, v33

    :goto_20
    move-object/from16 v14, v36

    move-object/from16 v5, v37

    :goto_21
    move-object/from16 v33, v4

    move-object/from16 v37, v5

    move-object/from16 v36, v14

    move-object/from16 v12, v22

    move-object/from16 v5, v23

    move-object/from16 v4, p0

    goto/16 :goto_1f

    :cond_43
    move-object/from16 v23, v5

    move-object/from16 v4, v33

    move-object/from16 v14, v36

    move-object/from16 v5, v37

    goto :goto_22

    :cond_44
    move-object/from16 v23, v5

    move/from16 v19, v14

    move-object/from16 v4, v33

    move-object/from16 v14, v36

    move-object/from16 v5, v37

    move-object v13, v4

    .line 174
    :goto_22
    iget-object v12, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    move-object/from16 v22, v3

    .line 175
    new-instance v3, Lcom/psk/kotlin/util/CommonListMainData;

    const/16 v25, 0x4

    .line 176
    new-instance v26, Lcom/join/kotlin/ui/modleregin/modle/MustplayItemBean;

    move-object/from16 v36, v14

    .line 177
    iget v14, v2, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 178
    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getVedio_url()Ljava/lang/String;

    move-result-object v45

    move-object/from16 v37, v5

    .line 179
    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getGame_info_top_pic()Ljava/lang/String;

    move-result-object v5

    move-object/from16 v33, v4

    const-string v4, "gameInfo.game_info_top_pic"

    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 180
    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getGame_info_top_video_url()Ljava/lang/String;

    move-result-object v47

    .line 181
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v48

    .line 182
    invoke-virtual {v8}, Lcom/join/mgps/dto/CollectionBeanSub;->getGame_name()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v4, v17

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v17, v4

    .line 183
    invoke-virtual {v8}, Lcom/join/mgps/dto/CollectionBeanSub;->getInfo()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v31, v11

    .line 184
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    if-eqz v13, :cond_45

    .line 185
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v24

    move-object/from16 v34, v6

    const/16 v20, 0x2

    add-int/lit8 v6, v24, -0x2

    move-object/from16 v35, v2

    const/4 v2, 0x0

    invoke-static {v2, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    invoke-virtual {v13, v2, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_23

    :cond_45
    move-object/from16 v35, v2

    move-object/from16 v34, v6

    const/4 v6, 0x0

    .line 186
    :goto_23
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " | "

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    invoke-virtual {v8}, Lcom/join/mgps/dto/CollectionBeanSub;->getActual_size()J

    move-result-wide v27

    .line 188
    invoke-static/range {v27 .. v28}, Lcom/join/mgps/Util/UtilsMy;->J2(J)Ljava/lang/String;

    move-result-object v2

    .line 189
    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v52

    const/16 v53, 0x0

    const/16 v54, 0x200

    const/16 v55, 0x0

    move-object/from16 v43, v26

    move/from16 v44, v14

    move-object/from16 v46, v5

    move-object/from16 v49, v1

    move-object/from16 v50, v4

    move-object/from16 v51, v8

    .line 190
    invoke-direct/range {v43 .. v55}, Lcom/join/kotlin/ui/modleregin/modle/MustplayItemBean;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/join/mgps/business/CollectionBeanSubBusiness;Ljava/lang/String;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 191
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v2, 0x2d

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v9, v9, 0x1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v27

    const/16 v28, 0x0

    const/16 v29, 0x8

    const/16 v30, 0x0

    move-object/from16 v24, v3

    .line 192
    invoke-direct/range {v24 .. v30}, Lcom/psk/kotlin/util/CommonListMainData;-><init>(ILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 193
    invoke-interface {v12, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, v35

    .line 194
    iget v2, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    const/4 v3, 0x1

    add-int/2addr v2, v3

    iput v2, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    :cond_46
    :goto_24
    move-object/from16 v27, v22

    move-object/from16 v8, v23

    move-object/from16 v12, v31

    move-object/from16 v23, v7

    goto/16 :goto_1c

    :cond_47
    move-object v1, v2

    move/from16 v19, v14

    move-object/from16 v27, v3

    move-object v8, v5

    move-object/from16 v34, v6

    move-object/from16 v23, v7

    move-object v12, v11

    goto/16 :goto_1c

    :goto_25
    if-nez v12, :cond_48

    goto :goto_24

    .line 195
    :cond_48
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v3, 0x2

    if-ne v2, v3, :cond_46

    .line 196
    invoke-virtual {v13}, Lcom/join/kotlin/ui/modleregin/modle/BTDynamicModle;->getGameEntityList()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_46

    .line 197
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :goto_26
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_58

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v5, v3, 0x1

    if-gez v3, :cond_49

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_49
    check-cast v4, Lcom/join/mgps/dto/CollectionBeanSub;

    .line 198
    new-instance v3, Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-direct {v3, v4}, Lcom/join/mgps/business/CollectionBeanSubBusiness;-><init>(Lcom/join/mgps/dto/CollectionBeanSub;)V

    const/16 v4, 0x92

    .line 199
    invoke-virtual {v3, v4}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    .line 200
    invoke-virtual {v3, v4}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    .line 201
    invoke-virtual {v3}, Lcom/join/mgps/dto/CollectionBeanSub;->getIndex()I

    move-result v6

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Lcom/join/mgps/dto/DownloadPointBase;->setRecPosition(Ljava/lang/String;)V

    move-object/from16 v6, v34

    .line 202
    invoke-virtual {v6, v3}, Lcom/join/kotlin/ui/base/BaseHasDownloadActivityViewModle;->updateDowState(Lcom/join/mgps/business/CollectionBeanSubBusiness;)V

    .line 203
    invoke-virtual {v3}, Lcom/join/mgps/dto/CollectionBeanSub;->getTag_info()Ljava/util/ArrayList;

    move-result-object v8

    if-eqz v8, :cond_56

    .line 204
    invoke-virtual {v3}, Lcom/join/mgps/dto/CollectionBeanSub;->getTag_info()Ljava/util/ArrayList;

    move-result-object v8

    if-eqz v8, :cond_4a

    invoke-virtual {v3}, Lcom/join/mgps/dto/CollectionBeanSub;->getTag_info()Ljava/util/ArrayList;

    move-result-object v11

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v11

    const/4 v12, 0x3

    invoke-static {v12, v11}, Ljava/lang/Math;->min(II)I

    move-result v11

    const/4 v12, 0x0

    invoke-virtual {v8, v12, v11}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v8

    if-nez v8, :cond_4b

    :cond_4a
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v8

    :cond_4b
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    move-object/from16 v11, v33

    :goto_27
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_55

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/join/mgps/dto/TipBean;

    .line 205
    invoke-virtual {v12}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_54

    invoke-virtual {v12}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v13

    move-object/from16 v14, v33

    invoke-static {v13, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_53

    invoke-virtual {v12}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v13

    move-object/from16 v4, v32

    invoke-static {v13, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_52

    invoke-virtual {v12}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v13

    move-object/from16 v24, v2

    move-object/from16 v2, v42

    invoke-static {v13, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_51

    invoke-virtual {v12}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v13

    move-object/from16 v42, v2

    move-object/from16 v2, v41

    invoke-static {v13, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_50

    invoke-virtual {v12}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v13

    move-object/from16 v41, v2

    move-object/from16 v2, v40

    invoke-static {v13, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_4f

    invoke-virtual {v12}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v13

    move-object/from16 v40, v2

    move-object/from16 v2, v39

    invoke-static {v13, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_4e

    invoke-virtual {v12}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v13

    move-object/from16 v39, v2

    move-object/from16 v2, v38

    invoke-static {v13, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_4d

    invoke-virtual {v12}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v13

    move-object/from16 v38, v2

    move-object/from16 v2, v37

    invoke-static {v13, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_4c

    move-object/from16 v12, v36

    goto :goto_29

    .line 206
    :cond_4c
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Lcom/join/mgps/dto/TipBean;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v12, v36

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    goto :goto_29

    :cond_4d
    move-object/from16 v38, v2

    goto :goto_28

    :cond_4e
    move-object/from16 v39, v2

    goto :goto_28

    :cond_4f
    move-object/from16 v40, v2

    goto :goto_28

    :cond_50
    move-object/from16 v41, v2

    goto :goto_28

    :cond_51
    move-object/from16 v42, v2

    goto :goto_28

    :cond_52
    move-object/from16 v24, v2

    goto :goto_28

    :cond_53
    move-object/from16 v24, v2

    move-object/from16 v4, v32

    goto :goto_28

    :cond_54
    move-object/from16 v24, v2

    move-object/from16 v4, v32

    move-object/from16 v14, v33

    :goto_28
    move-object/from16 v12, v36

    move-object/from16 v2, v37

    :goto_29
    move-object/from16 v37, v2

    move-object/from16 v32, v4

    move-object/from16 v36, v12

    move-object/from16 v33, v14

    move-object/from16 v2, v24

    const/16 v4, 0x92

    goto/16 :goto_27

    :cond_55
    move-object/from16 v24, v2

    move-object/from16 v4, v32

    move-object/from16 v14, v33

    move-object/from16 v12, v36

    move-object/from16 v2, v37

    goto :goto_2a

    :cond_56
    move-object/from16 v24, v2

    move-object/from16 v4, v32

    move-object/from16 v14, v33

    move-object/from16 v12, v36

    move-object/from16 v2, v37

    move-object v11, v14

    :goto_2a
    move-object/from16 v8, v22

    .line 207
    iget-object v13, v8, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v13, Ljava/util/List;

    move-object/from16 v37, v2

    .line 208
    new-instance v2, Lcom/psk/kotlin/util/CommonListMainData;

    const/16 v22, 0x2

    .line 209
    new-instance v25, Lcom/join/kotlin/ui/modleregin/modle/BtGameListItem;

    move-object/from16 v32, v4

    .line 210
    iget v4, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    move/from16 v26, v5

    .line 211
    invoke-virtual {v3}, Lcom/join/mgps/dto/CollectionBeanSub;->getIco_remote()Ljava/lang/String;

    move-result-object v5

    move-object/from16 v34, v6

    const-string v6, "be.ico_remote"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 212
    invoke-virtual {v3}, Lcom/join/mgps/dto/CollectionBeanSub;->getGif_ico_remote()Ljava/lang/String;

    move-result-object v46

    .line 213
    invoke-virtual {v3}, Lcom/join/mgps/dto/CollectionBeanSub;->getGame_name()Ljava/lang/String;

    move-result-object v6

    move-object/from16 v36, v12

    move-object/from16 v12, v17

    invoke-static {v6, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v17, v12

    .line 214
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    if-eqz v11, :cond_57

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v27

    move-object/from16 v33, v14

    const/16 v20, 0x2

    add-int/lit8 v14, v27, -0x2

    move-object/from16 v27, v8

    const/4 v8, 0x0

    invoke-static {v8, v14}, Ljava/lang/Math;->max(II)I

    move-result v14

    invoke-virtual {v11, v8, v14}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2b

    :cond_57
    move-object/from16 v27, v8

    move-object/from16 v33, v14

    const/4 v11, 0x0

    :goto_2b
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v8, v23

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    invoke-virtual {v3}, Lcom/join/mgps/dto/CollectionBeanSub;->getActual_size()J

    move-result-wide v28

    .line 216
    invoke-static/range {v28 .. v29}, Lcom/join/mgps/Util/UtilsMy;->J2(J)Ljava/lang/String;

    move-result-object v11

    .line 217
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v48

    .line 218
    invoke-virtual {v3}, Lcom/join/mgps/dto/CollectionBeanSub;->getInfo()Ljava/lang/String;

    move-result-object v11

    move-object/from16 v12, v31

    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 219
    new-instance v14, Lcom/join/kotlin/domain/common/AppListItemShowBean;

    move-object/from16 v23, v7

    const/4 v7, 0x0

    invoke-direct {v14, v3, v7}, Lcom/join/kotlin/domain/common/AppListItemShowBean;-><init>(Lcom/join/mgps/business/CollectionBeanSubBusiness;Z)V

    move-object/from16 v43, v25

    move/from16 v44, v4

    move-object/from16 v45, v5

    move-object/from16 v47, v6

    move-object/from16 v49, v11

    move-object/from16 v50, v3

    move-object/from16 v51, v14

    .line 220
    invoke-direct/range {v43 .. v51}, Lcom/join/kotlin/ui/modleregin/modle/BtGameListItem;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/join/mgps/business/CollectionBeanSubBusiness;Lcom/join/kotlin/domain/common/AppListItemShowBean;)V

    .line 221
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v4, 0x2d

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v9, v9, 0x1

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v46

    const/16 v47, 0x0

    const/16 v48, 0x8

    const/16 v49, 0x0

    move-object/from16 v43, v2

    move/from16 v44, v22

    move-object/from16 v45, v25

    .line 222
    invoke-direct/range {v43 .. v49}, Lcom/psk/kotlin/util/CommonListMainData;-><init>(ILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 223
    invoke-interface {v13, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 224
    iget v2, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    const/4 v3, 0x1

    add-int/2addr v2, v3

    iput v2, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    move-object/from16 v31, v12

    move-object/from16 v7, v23

    move-object/from16 v2, v24

    move/from16 v3, v26

    move-object/from16 v22, v27

    move-object/from16 v23, v8

    goto/16 :goto_26

    :cond_58
    move-object/from16 v27, v22

    move-object/from16 v8, v23

    move-object/from16 v12, v31

    move-object/from16 v23, v7

    const/4 v7, 0x0

    .line 225
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_2c
    move-object/from16 v4, p0

    move-object v2, v1

    move-object v5, v8

    move-object v11, v12

    move-object/from16 v1, v16

    move-object/from16 v8, v18

    move/from16 v12, v19

    move-object/from16 v7, v23

    move-object/from16 v3, v27

    move-object/from16 v6, v34

    goto/16 :goto_18

    :cond_59
    move-object/from16 v16, v1

    move-object v1, v2

    move-object/from16 v27, v3

    move-object v8, v5

    move-object/from16 v34, v6

    move-object/from16 v23, v7

    move-object v12, v11

    const/4 v7, 0x0

    .line 226
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_0

    goto :goto_2d

    :cond_5a
    move-object/from16 v16, v1

    move-object v1, v2

    move-object/from16 v27, v3

    move-object v8, v5

    move-object/from16 v34, v6

    move-object/from16 v23, v7

    move-object v12, v11

    const/4 v7, 0x0

    :goto_2d
    move-object/from16 v4, p0

    move-object v2, v1

    move-object v5, v8

    move v8, v10

    move-object v11, v12

    move-object/from16 v1, v16

    move-object/from16 v7, v23

    move-object/from16 v3, v27

    move-object/from16 v6, v34

    goto/16 :goto_15

    :cond_5b
    move-object/from16 v27, v3

    move-object v1, v4

    .line 227
    :try_start_13
    iget-object v2, v1, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1;->this$0:Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    invoke-virtual {v2}, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;->getShowDatas()Landroidx/lifecycle/MutableLiveData;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v2, Ljava/util/List;

    move-object/from16 v3, v27

    iget-object v3, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v2, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 228
    iget-object v2, v1, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1;->this$0:Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    invoke-virtual {v2}, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;->getPage()I

    move-result v3

    const/4 v4, 0x1

    add-int/2addr v3, v4

    invoke-virtual {v2, v3}, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;->setPage(I)V

    .line 229
    iget-object v2, v1, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1;->this$0:Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    invoke-virtual {v2}, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;->getRecycleViewStatus()Landroidx/lifecycle/MutableLiveData;

    move-result-object v2

    const/4 v3, 0x2

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 230
    iget-object v2, v1, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1;->this$0:Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    invoke-virtual {v2}, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;->getShowDatas()Landroidx/lifecycle/MutableLiveData;

    move-result-object v2

    iget-object v3, v1, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1;->this$0:Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    invoke-virtual {v3}, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;->getShowDatas()Landroidx/lifecycle/MutableLiveData;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    goto :goto_30

    :cond_5c
    move-object v1, v4

    .line 231
    iget-object v2, v1, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1;->this$0:Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    invoke-virtual {v2}, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;->getRecycleViewStatus()Landroidx/lifecycle/MutableLiveData;

    move-result-object v2

    const/4 v3, 0x4

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_3

    goto :goto_30

    :catch_2
    move-exception v0

    move-object v1, v4

    goto :goto_2e

    :catch_3
    move-exception v0

    :goto_2e
    move-object v2, v0

    .line 232
    :goto_2f
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_30

    .line 233
    :cond_5d
    iget-object v2, v1, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1;->$context:Landroid/content/Context;

    invoke-static {v2}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v2

    iget-object v3, v1, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1;->$result:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v3, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v3, Lcom/join/mgps/dto/ResponseModel;

    invoke-virtual {v3}, Lcom/join/mgps/dto/ResponseModel;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    .line 234
    :goto_30
    iget-object v2, v1, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1;->this$0:Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    invoke-virtual {v2}, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;->getShowDatas()Landroidx/lifecycle/MutableLiveData;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_5e

    .line 235
    iget-object v2, v1, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1;->this$0:Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    invoke-virtual {v2}, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;->getLoadBindData()Landroidx/lifecycle/MutableLiveData;

    move-result-object v2

    new-instance v3, Lcom/join/kotlin/domain/common/LoadBindindData;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Lcom/join/kotlin/domain/common/LoadBindindData;-><init>(I)V

    invoke-virtual {v2, v3}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    goto :goto_31

    .line 236
    :cond_5e
    iget-object v2, v1, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1$1;->this$0:Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    invoke-virtual {v2}, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;->getLoadBindData()Landroidx/lifecycle/MutableLiveData;

    move-result-object v2

    .line 237
    new-instance v3, Lcom/join/kotlin/domain/common/LoadBindindData;

    const/4 v4, 0x3

    invoke-direct {v3, v4}, Lcom/join/kotlin/domain/common/LoadBindindData;-><init>(I)V

    .line 238
    invoke-virtual {v2, v3}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 239
    :goto_31
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v2

    .line 240
    :cond_5f
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_33

    :goto_32
    throw v2

    :goto_33
    goto :goto_32
.end method
