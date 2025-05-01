.class public final Lcom/join/kotlin/discount/CommentStatisticDataFragment;
.super Lcom/join/kotlin/base/fragment/BaseVmDbFragment;
.source "CommentStatisticDataFragment.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/kotlin/base/fragment/BaseVmDbFragment<",
        "Lcom/join/kotlin/discount/viewmodel/CommentStatisticDataViewModel;",
        "Lcom/join/android/app/mgsim/wufun/databinding/FragmentCommentStatisticDataBinding;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCommentStatisticDataFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommentStatisticDataFragment.kt\ncom/join/kotlin/discount/CommentStatisticDataFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n1864#2,2:100\n1866#2:103\n1864#2,3:104\n1#3:102\n*S KotlinDebug\n*F\n+ 1 CommentStatisticDataFragment.kt\ncom/join/kotlin/discount/CommentStatisticDataFragment\n*L\n38#1:100,2\n38#1:103\n59#1:104,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCommentStatisticDataFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommentStatisticDataFragment.kt\ncom/join/kotlin/discount/CommentStatisticDataFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n1864#2,2:100\n1866#2:103\n1864#2,3:104\n1#3:102\n*S KotlinDebug\n*F\n+ 1 CommentStatisticDataFragment.kt\ncom/join/kotlin/discount/CommentStatisticDataFragment\n*L\n38#1:100,2\n38#1:103\n59#1:104,3\n*E\n"
    }
.end annotation


# instance fields
.field private final mAdapter$delegate:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/kotlin/base/fragment/BaseVmDbFragment;-><init>()V

    .line 2
    sget-object v0, Lcom/join/kotlin/discount/CommentStatisticDataFragment$mAdapter$2;->INSTANCE:Lcom/join/kotlin/discount/CommentStatisticDataFragment$mAdapter$2;

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/join/kotlin/discount/CommentStatisticDataFragment;->mAdapter$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private final getMAdapter()Lcom/join/kotlin/discount/adapter/CommentStatisticDataAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/CommentStatisticDataFragment;->mAdapter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/discount/adapter/CommentStatisticDataAdapter;

    return-object v0
.end method


# virtual methods
.method public createObserver()V
    .locals 0

    return-void
.end method

.method public dismissLoading()V
    .locals 0

    return-void
.end method

.method public initView(Landroid/os/Bundle;)V
    .locals 17
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string/jumbo v2, "type"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    .line 2
    :goto_0
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v2

    if-eqz v2, :cond_1

    const-string v1, "data"

    invoke-virtual {v2, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 3
    :cond_1
    invoke-virtual/range {p0 .. p0}, Lcom/join/kotlin/base/fragment/BaseVmDbFragment;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v2

    check-cast v2, Lcom/join/android/app/mgsim/wufun/databinding/FragmentCommentStatisticDataBinding;

    invoke-virtual/range {p0 .. p0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v3

    check-cast v3, Lcom/join/kotlin/discount/viewmodel/CommentStatisticDataViewModel;

    invoke-virtual {v2, v3}, Lcom/join/android/app/mgsim/wufun/databinding/FragmentCommentStatisticDataBinding;->f(Lcom/join/kotlin/discount/viewmodel/CommentStatisticDataViewModel;)V

    .line 4
    invoke-virtual/range {p0 .. p0}, Lcom/join/kotlin/base/fragment/BaseVmDbFragment;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v2

    check-cast v2, Lcom/join/android/app/mgsim/wufun/databinding/FragmentCommentStatisticDataBinding;

    iget-object v2, v2, Lcom/join/android/app/mgsim/wufun/databinding/FragmentCommentStatisticDataBinding;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v3

    new-instance v4, Lcom/join/kotlin/discount/CommentStatisticDataFragment$initView$1;

    invoke-direct {v4, v3}, Lcom/join/kotlin/discount/CommentStatisticDataFragment$initView$1;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, v4}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 5
    invoke-virtual/range {p0 .. p0}, Lcom/join/kotlin/base/fragment/BaseVmDbFragment;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v2

    check-cast v2, Lcom/join/android/app/mgsim/wufun/databinding/FragmentCommentStatisticDataBinding;

    iget-object v2, v2, Lcom/join/android/app/mgsim/wufun/databinding/FragmentCommentStatisticDataBinding;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct/range {p0 .. p0}, Lcom/join/kotlin/discount/CommentStatisticDataFragment;->getMAdapter()Lcom/join/kotlin/discount/adapter/CommentStatisticDataAdapter;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 6
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v2

    .line 7
    const-class v3, Lcom/join/kotlin/discount/model/bean/CommentStatisticDataBean;

    invoke-virtual {v2, v1, v3}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/kotlin/discount/model/bean/CommentStatisticDataBean;

    if-eqz v1, :cond_11

    .line 8
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const-string/jumbo v3, "\u65f6\u957f\u6570\u636e"

    .line 9
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v4, "%\u7528\u6237"

    const/16 v5, 0x32

    const/16 v6, 0x64

    const/4 v7, 0x0

    if-eqz v3, :cond_a

    .line 10
    :try_start_1
    invoke-virtual {v1}, Lcom/join/kotlin/discount/model/bean/CommentStatisticDataBean;->getDuration()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->filterNotNull(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->maxOrThrow(Ljava/lang/Iterable;)D

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    goto :goto_1

    :cond_2
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 11
    :goto_1
    invoke-virtual {v1}, Lcom/join/kotlin/discount/model/bean/CommentStatisticDataBean;->getDuration()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->filterNotNull(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->minOrThrow(Ljava/lang/Iterable;)D

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    goto :goto_2

    :cond_3
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 12
    :goto_2
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 13
    :cond_4
    invoke-virtual {v1}, Lcom/join/kotlin/discount/model/bean/CommentStatisticDataBean;->getDuration()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_10

    .line 14
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_10

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v5, v7, 0x1

    if-gez v7, :cond_5

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_5
    check-cast v3, Ljava/lang/Double;

    .line 15
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v10

    if-eqz v7, :cond_8

    const/4 v6, 0x1

    if-eq v7, v6, :cond_7

    const/4 v6, 0x2

    if-eq v7, v6, :cond_6

    const-string/jumbo v6, "\u8d85\u8fc720min"

    :goto_4
    move-object v12, v6

    goto :goto_5

    :cond_6
    const-string v6, "10~20min"

    goto :goto_4

    :cond_7
    const-string v6, "5~10min"

    goto :goto_4

    :cond_8
    const-string v6, "0~5min"

    goto :goto_4

    .line 16
    :goto_5
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    if-eqz v3, :cond_9

    .line 17
    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v6

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    double-to-int v3, v7

    sub-int/2addr v6, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    goto :goto_6

    :cond_9
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v3

    :goto_6
    move v9, v3

    .line 18
    new-instance v3, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;

    const/4 v13, 0x1

    move-object v8, v3

    move v11, v5

    invoke-direct/range {v8 .. v14}, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;-><init>(IIILjava/lang/String;ILjava/lang/String;)V

    .line 19
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v7, v5

    goto :goto_3

    :cond_a
    const-string/jumbo v3, "\u8bc4\u5206\u6570\u636e"

    .line 20
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 21
    invoke-virtual {v1}, Lcom/join/kotlin/discount/model/bean/CommentStatisticDataBean;->getScore()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->filterNotNull(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->maxOrThrow(Ljava/lang/Iterable;)D

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    goto :goto_7

    :cond_b
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 22
    :goto_7
    invoke-virtual {v1}, Lcom/join/kotlin/discount/model/bean/CommentStatisticDataBean;->getScore()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_c

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->filterNotNull(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_c

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->minOrThrow(Ljava/lang/Iterable;)D

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    goto :goto_8

    :cond_c
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 23
    :goto_8
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 24
    :cond_d
    invoke-virtual {v1}, Lcom/join/kotlin/discount/model/bean/CommentStatisticDataBean;->getScore()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_10

    .line 25
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_10

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v5, v7, 0x1

    if-gez v7, :cond_e

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_e
    check-cast v3, Ljava/lang/Double;

    .line 26
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v10

    .line 27
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    if-eqz v3, :cond_f

    .line 28
    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v6

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    double-to-int v3, v7

    sub-int/2addr v6, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    goto :goto_a

    :cond_f
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v3

    :goto_a
    move v9, v3

    .line 29
    new-instance v3, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;

    const/4 v12, 0x0

    const/4 v13, 0x2

    const/16 v15, 0x8

    const/16 v16, 0x0

    move-object v8, v3

    move v11, v5

    invoke-direct/range {v8 .. v16}, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;-><init>(IIILjava/lang/String;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 30
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v7, v5

    goto :goto_9

    .line 31
    :cond_10
    invoke-direct/range {p0 .. p0}, Lcom/join/kotlin/discount/CommentStatisticDataFragment;->getMAdapter()Lcom/join/kotlin/discount/adapter/CommentStatisticDataAdapter;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->submitList(Ljava/util/List;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_b

    :catch_0
    move-exception v0

    .line 32
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_11
    :goto_b
    return-void
.end method

.method public lazyLoadData()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Lcom/join/kotlin/discount/CommentStatisticDataFragment;->loadData(Z)V

    return-void
.end method

.method public final loadData(Z)V
    .locals 0

    return-void
.end method

.method public showLoading(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
