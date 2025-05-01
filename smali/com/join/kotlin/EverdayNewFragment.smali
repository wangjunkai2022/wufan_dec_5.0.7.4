.class public final Lcom/join/kotlin/EverdayNewFragment;
.super Landroidx/fragment/app/Fragment;
.source "EverdayNewFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/kotlin/EverdayNewFragment$EverdayNewAdapter;,
        Lcom/join/kotlin/EverdayNewFragment$ViewHolderGame;,
        Lcom/join/kotlin/EverdayNewFragment$ViewHolderTitle;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nEverdayNewFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EverdayNewFragment.kt\ncom/join/kotlin/EverdayNewFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,497:1\n1864#2,3:498\n*S KotlinDebug\n*F\n+ 1 EverdayNewFragment.kt\ncom/join/kotlin/EverdayNewFragment\n*L\n222#1:498,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nEverdayNewFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EverdayNewFragment.kt\ncom/join/kotlin/EverdayNewFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,497:1\n1864#2,3:498\n*S KotlinDebug\n*F\n+ 1 EverdayNewFragment.kt\ncom/join/kotlin/EverdayNewFragment\n*L\n222#1:498,3\n*E\n"
    }
.end annotation


# instance fields
.field public adapter:Lcom/join/kotlin/EverdayNewFragment$EverdayNewAdapter;

.field public binding:Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;

.field private firstVisiblePosition:I

.field private fromHome:Z

.field private isExposuring:Z

.field private lastTimeDay:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private lastVisibleIndex:I

.field public manager:Landroidx/recyclerview/widget/LinearLayoutManager;

.field private pageCount:I

.field public presenter:Lcom/psk/kotlin/util/BasDownLoadActivityPresenter;

.field private showDataList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/psk/kotlin/util/CommonListMainData;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private type:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/kotlin/EverdayNewFragment;->showDataList:Ljava/util/ArrayList;

    const/4 v0, 0x1

    .line 3
    iput v0, p0, Lcom/join/kotlin/EverdayNewFragment;->pageCount:I

    .line 4
    iput v0, p0, Lcom/join/kotlin/EverdayNewFragment;->type:I

    const-string v0, "0"

    .line 5
    iput-object v0, p0, Lcom/join/kotlin/EverdayNewFragment;->lastTimeDay:Ljava/lang/String;

    return-void
.end method

.method public static synthetic V(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/join/kotlin/EverdayNewFragment;->loadFinish$lambda$0(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static final synthetic access$expDiscountGame(Lcom/join/kotlin/EverdayNewFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/kotlin/EverdayNewFragment;->expDiscountGame()V

    return-void
.end method

.method private final expDiscountGame()V
    .locals 10

    const/4 v0, 0x0

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isAdded()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Lcom/join/kotlin/EverdayNewFragment;->isExposuring:Z

    if-nez v1, :cond_2

    const/4 v1, 0x1

    .line 2
    iput-boolean v1, p0, Lcom/join/kotlin/EverdayNewFragment;->isExposuring:Z

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/EverdayNewFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;

    move-result-object v2

    iget-object v2, v2, Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;->e:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {v2}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->getLastVisiblePosition()I

    move-result v2

    .line 4
    iget-object v3, p0, Lcom/join/kotlin/EverdayNewFragment;->showDataList:Ljava/util/ArrayList;

    .line 5
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v6, v4, 0x1

    if-gez v4, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_0
    check-cast v5, Lcom/psk/kotlin/util/CommonListMainData;

    if-gt v4, v2, :cond_1

    .line 6
    invoke-virtual {v5}, Lcom/psk/kotlin/util/CommonListMainData;->getHasExposured()Z

    move-result v4

    if-nez v4, :cond_1

    .line 7
    invoke-virtual {v5, v1}, Lcom/psk/kotlin/util/CommonListMainData;->setHasExposured(Z)V

    .line 8
    invoke-virtual {v5}, Lcom/psk/kotlin/util/CommonListMainData;->getType()I

    move-result v4

    const/4 v7, 0x2

    if-ne v4, v7, :cond_1

    .line 9
    invoke-virtual {v5}, Lcom/psk/kotlin/util/CommonListMainData;->getAny()Ljava/lang/Object;

    move-result-object v4

    const-string v5, "null cannot be cast to non-null type com.join.mgps.dto.CollectionBeanSub"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Lcom/join/mgps/dto/CollectionBeanSub;

    .line 10
    invoke-static {v4}, Lcom/join/mgps/Util/UtilsMy;->f2(Lcom/join/mgps/dto/CollectionBeanSub;)Z

    move-result v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v5, :cond_1

    .line 11
    :try_start_1
    new-instance v5, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v5}, Lcom/papa/sim/statistic/Ext;-><init>()V

    const-string v7, "discount_game"

    .line 12
    invoke-virtual {v5, v7}, Lcom/papa/sim/statistic/Ext;->setResultCode(Ljava/lang/String;)V

    .line 13
    const-class v7, Lcom/join/kotlin/EverdayNewFragment;

    invoke-virtual {v7}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Lcom/papa/sim/statistic/Ext;->setScenesCode(Ljava/lang/String;)V

    .line 14
    new-instance v7, Lcom/papa/sim/statistic/Data;

    invoke-direct {v7}, Lcom/papa/sim/statistic/Data;-><init>()V

    .line 15
    invoke-virtual {v4}, Lcom/join/mgps/dto/CollectionBeanSub;->getGame_id()Ljava/lang/String;

    move-result-object v4

    const-string v8, "sub.game_id"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v8

    invoke-virtual {v7, v8, v9}, Lcom/papa/sim/statistic/Data;->setGameId(J)Lcom/papa/sim/statistic/Data;

    .line 16
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v4

    .line 17
    sget-object v8, Lcom/papa/sim/statistic/Event;->expGameAdPage:Lcom/papa/sim/statistic/Event;

    invoke-virtual {v4, v8, v5, v7}, Lcom/papa/sim/statistic/p;->Y(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;Lcom/papa/sim/statistic/Data;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    move-exception v4

    .line 18
    :try_start_2
    invoke-virtual {v4}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_1
    :goto_1
    move v4, v6

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 19
    iput-boolean v0, p0, Lcom/join/kotlin/EverdayNewFragment;->isExposuring:Z

    throw v1

    :catch_1
    :cond_2
    iput-boolean v0, p0, Lcom/join/kotlin/EverdayNewFragment;->isExposuring:Z

    return-void
.end method

.method private static final loadFinish$lambda$0(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method


# virtual methods
.method public final getAdapter()Lcom/join/kotlin/EverdayNewFragment$EverdayNewAdapter;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/EverdayNewFragment;->adapter:Lcom/join/kotlin/EverdayNewFragment$EverdayNewAdapter;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "adapter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getBinding()Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/EverdayNewFragment;->binding:Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getFirstVisiblePosition()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/kotlin/EverdayNewFragment;->firstVisiblePosition:I

    return v0
.end method

.method public final getFromHome()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/kotlin/EverdayNewFragment;->fromHome:Z

    return v0
.end method

.method public final getLastTimeDay()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/EverdayNewFragment;->lastTimeDay:Ljava/lang/String;

    return-object v0
.end method

.method public final getLastVisibleIndex()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/kotlin/EverdayNewFragment;->lastVisibleIndex:I

    return v0
.end method

.method public final getManager()Landroidx/recyclerview/widget/LinearLayoutManager;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/EverdayNewFragment;->manager:Landroidx/recyclerview/widget/LinearLayoutManager;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "manager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getPageCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/kotlin/EverdayNewFragment;->pageCount:I

    return v0
.end method

.method public final getPresenter()Lcom/psk/kotlin/util/BasDownLoadActivityPresenter;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/EverdayNewFragment;->presenter:Lcom/psk/kotlin/util/BasDownLoadActivityPresenter;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getShowDataList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/psk/kotlin/util/CommonListMainData;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/EverdayNewFragment;->showDataList:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final getType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/kotlin/EverdayNewFragment;->type:I

    return v0
.end method

.method public final hidLoading()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/EverdayNewFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;->d:Lcom/join/android/app/mgsim/wufun/databinding/LodingLayoutIncludeBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/LodingLayoutIncludeBinding;->d:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/EverdayNewFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;->c:Lcom/join/android/app/mgsim/wufun/databinding/FailedLayoutIncludeBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/FailedLayoutIncludeBinding;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/EverdayNewFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;->e:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    return-void
.end method

.method public final loadData(I)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    :try_start_0
    new-instance v0, Lcom/join/mgps/dto/RequestModel;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/join/mgps/dto/RequestModel;-><init>(Landroid/content/Context;)V

    .line 3
    new-instance v1, Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;

    invoke-direct {v1}, Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;-><init>()V

    .line 4
    invoke-virtual {v1, p1}, Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;->setPage(I)V

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;->setUid(I)V

    .line 6
    iget v2, p0, Lcom/join/kotlin/EverdayNewFragment;->type:I

    invoke-virtual {v1, v2}, Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;->setType(I)V

    .line 7
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 8
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/rpc/impl/i;->B0()Le2/i;

    move-result-object v1

    invoke-virtual {v0}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object v0

    invoke-interface {v1, v0}, Le2/i;->x1(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;

    move-result-object v0

    new-instance v1, Lcom/join/kotlin/EverdayNewFragment$loadData$1;

    invoke-direct {v1, p0, p1}, Lcom/join/kotlin/EverdayNewFragment$loadData$1;-><init>(Lcom/join/kotlin/EverdayNewFragment;I)V

    invoke-interface {v0, v1}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 9
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    const-string p1, ""

    .line 10
    invoke-virtual {p0, p1}, Lcom/join/kotlin/EverdayNewFragment;->onError(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 11
    :goto_0
    throw p1

    :cond_0
    const p1, 0x7f100299

    .line 12
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "getString(R.string.net_connect_failed)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/join/kotlin/EverdayNewFragment;->onError(Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method public final loadFinish(ILjava/util/List;)V
    .locals 17
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "+",
            "Lcom/join/kotlin/ui/findgame/data/EverdayNewListItem;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "datas"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget v3, v0, Lcom/join/kotlin/EverdayNewFragment;->pageCount:I

    const/4 v4, 0x1

    if-ne v1, v3, :cond_0

    invoke-interface/range {p2 .. p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    xor-int/2addr v3, v4

    if-eqz v3, :cond_0

    .line 2
    iget v3, v0, Lcom/join/kotlin/EverdayNewFragment;->pageCount:I

    add-int/2addr v3, v4

    iput v3, v0, Lcom/join/kotlin/EverdayNewFragment;->pageCount:I

    .line 3
    :cond_0
    sget-object v3, Lcom/join/kotlin/EverdayNewFragment$loadFinish$1;->INSTANCE:Lcom/join/kotlin/EverdayNewFragment$loadFinish$1;

    new-instance v5, Lcom/join/kotlin/a;

    invoke-direct {v5, v3}, Lcom/join/kotlin/a;-><init>(Lkotlin/jvm/functions/Function2;)V

    invoke-static {v2, v5}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 4
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/kotlin/ui/findgame/data/EverdayNewListItem;

    .line 5
    iget-object v5, v0, Lcom/join/kotlin/EverdayNewFragment;->lastTimeDay:Ljava/lang/String;

    invoke-virtual {v3}, Lcom/join/kotlin/ui/findgame/data/EverdayNewListItem;->getTime()J

    move-result-wide v6

    const/16 v8, 0x3e8

    int-to-long v8, v8

    mul-long v6, v6, v8

    invoke-static {v6, v7}, Lcom/join/mgps/Util/y;->z(J)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 6
    iget-object v5, v0, Lcom/join/kotlin/EverdayNewFragment;->showDataList:Ljava/util/ArrayList;

    new-instance v6, Lcom/psk/kotlin/util/CommonListMainData;

    const/4 v11, 0x1

    invoke-virtual {v3}, Lcom/join/kotlin/ui/findgame/data/EverdayNewListItem;->getTime()J

    move-result-wide v12

    mul-long v12, v12, v8

    invoke-static {v12, v13}, Lcom/join/mgps/Util/y;->D(J)Ljava/lang/String;

    move-result-object v12

    const-string v7, "longToStrTimeYMD(data.time * 1000)"

    invoke-static {v12, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v15, 0xc

    const/16 v16, 0x0

    move-object v10, v6

    invoke-direct/range {v10 .. v16}, Lcom/psk/kotlin/util/CommonListMainData;-><init>(ILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    invoke-virtual {v3}, Lcom/join/kotlin/ui/findgame/data/EverdayNewListItem;->getTime()J

    move-result-wide v5

    mul-long v5, v5, v8

    invoke-static {v5, v6}, Lcom/join/mgps/Util/y;->z(J)Ljava/lang/String;

    move-result-object v5

    const-string v6, "longToStrTimeDD(data.time * 1000)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v5, v0, Lcom/join/kotlin/EverdayNewFragment;->lastTimeDay:Ljava/lang/String;

    .line 8
    :cond_1
    new-instance v9, Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {v3}, Lcom/join/kotlin/ui/findgame/data/EverdayNewListItem;->getList()Lcom/join/mgps/dto/CollectionBeanSub;

    move-result-object v3

    invoke-direct {v9, v3}, Lcom/join/mgps/business/CollectionBeanSubBusiness;-><init>(Lcom/join/mgps/dto/CollectionBeanSub;)V

    .line 9
    iget-boolean v3, v0, Lcom/join/kotlin/EverdayNewFragment;->fromHome:Z

    const/16 v5, 0xd1

    const/16 v6, 0x81

    if-eqz v3, :cond_2

    const/16 v3, 0xd1

    goto :goto_1

    :cond_2
    const/16 v3, 0x81

    :goto_1
    invoke-virtual {v9, v3}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    .line 10
    iget-boolean v3, v0, Lcom/join/kotlin/EverdayNewFragment;->fromHome:Z

    if-eqz v3, :cond_3

    goto :goto_2

    :cond_3
    const/16 v5, 0x81

    :goto_2
    invoke-virtual {v9, v5}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    .line 11
    invoke-virtual/range {p0 .. p0}, Lcom/join/kotlin/EverdayNewFragment;->getPresenter()Lcom/psk/kotlin/util/BasDownLoadActivityPresenter;

    move-result-object v3

    invoke-virtual {v3, v9}, Lcom/psk/kotlin/util/BasDownLoadActivityPresenter;->updateDowState(Lcom/join/mgps/business/CollectionBeanSubBusiness;)V

    .line 12
    iget-object v3, v0, Lcom/join/kotlin/EverdayNewFragment;->showDataList:Ljava/util/ArrayList;

    new-instance v5, Lcom/psk/kotlin/util/CommonListMainData;

    const/4 v8, 0x2

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0xc

    const/4 v13, 0x0

    move-object v7, v5

    invoke-direct/range {v7 .. v13}, Lcom/psk/kotlin/util/CommonListMainData;-><init>(ILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 13
    :cond_4
    invoke-virtual/range {p0 .. p0}, Lcom/join/kotlin/EverdayNewFragment;->getAdapter()Lcom/join/kotlin/EverdayNewFragment$EverdayNewAdapter;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    if-ne v1, v4, :cond_5

    .line 14
    invoke-direct/range {p0 .. p0}, Lcom/join/kotlin/EverdayNewFragment;->expDiscountGame()V

    :cond_5
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0
    .param p1    # Landroid/view/LayoutInflater;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x0

    .line 1
    invoke-static {p1, p2, p3}, Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;

    move-result-object p1

    const-string p2, "inflate(inflater, container, false)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/join/kotlin/EverdayNewFragment;->setBinding(Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;)V

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/join/mgps/Util/d0;->d(Ljava/lang/Object;)V

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/EverdayNewFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;->a()Landroid/widget/LinearLayout;

    move-result-object p1

    return-object p1
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/d0;->e(Ljava/lang/Object;)V

    return-void
.end method

.method public final onError(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0, p1}, Lcom/psk/kotlin/ext/CommonExtKt;->toast(Landroid/content/Context;Ljava/lang/String;)V

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/join/kotlin/EverdayNewFragment;->showDataList:Ljava/util/ArrayList;

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    :goto_1
    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/join/kotlin/EverdayNewFragment;->showDataList:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-gtz p1, :cond_4

    .line 3
    :cond_3
    invoke-virtual {p0}, Lcom/join/kotlin/EverdayNewFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;->d:Lcom/join/android/app/mgsim/wufun/databinding/LodingLayoutIncludeBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/LodingLayoutIncludeBinding;->d:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    invoke-virtual {p0}, Lcom/join/kotlin/EverdayNewFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;->c:Lcom/join/android/app/mgsim/wufun/databinding/FailedLayoutIncludeBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/FailedLayoutIncludeBinding;->e:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 5
    invoke-virtual {p0}, Lcom/join/kotlin/EverdayNewFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;->e:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_4
    return-void
.end method

.method public final onEventMainThread(Lcom/join/mgps/event/n;)V
    .locals 1
    .param p1    # Lcom/join/mgps/event/n;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lorg/greenrobot/eventbus/Subscribe;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    const-string v0, "downloadTaskEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/EverdayNewFragment;->getPresenter()Lcom/psk/kotlin/util/BasDownLoadActivityPresenter;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/psk/kotlin/util/BasDownLoadActivityPresenter;->onEventMainThread(Lcom/join/mgps/event/n;)V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    new-instance p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-direct {p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, p1}, Lcom/join/kotlin/EverdayNewFragment;->setManager(Landroidx/recyclerview/widget/LinearLayoutManager;)V

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/EverdayNewFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;->e:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {p0}, Lcom/join/kotlin/EverdayNewFragment;->getManager()Landroidx/recyclerview/widget/LinearLayoutManager;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 4
    new-instance p1, Lcom/join/kotlin/EverdayNewFragment$EverdayNewAdapter;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object p2

    const-string v0, "requireContext()"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/join/kotlin/EverdayNewFragment;->showDataList:Ljava/util/ArrayList;

    invoke-direct {p1, p2, v0}, Lcom/join/kotlin/EverdayNewFragment$EverdayNewAdapter;-><init>(Landroid/content/Context;Ljava/util/List;)V

    invoke-virtual {p0, p1}, Lcom/join/kotlin/EverdayNewFragment;->setAdapter(Lcom/join/kotlin/EverdayNewFragment$EverdayNewAdapter;)V

    .line 5
    invoke-virtual {p0}, Lcom/join/kotlin/EverdayNewFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;->e:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {p0}, Lcom/join/kotlin/EverdayNewFragment;->getAdapter()Lcom/join/kotlin/EverdayNewFragment$EverdayNewAdapter;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 6
    invoke-virtual {p0}, Lcom/join/kotlin/EverdayNewFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;->c:Lcom/join/android/app/mgsim/wufun/databinding/FailedLayoutIncludeBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/FailedLayoutIncludeBinding;->f:Landroid/widget/ImageView;

    const-string p2, "binding.failedLayoutMain.relodingimag"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lcom/join/kotlin/EverdayNewFragment$onViewCreated$1;

    invoke-direct {p2, p0}, Lcom/join/kotlin/EverdayNewFragment$onViewCreated$1;-><init>(Lcom/join/kotlin/EverdayNewFragment;)V

    invoke-static {p1, p2}, Lcom/psk/kotlin/ext/CommonExtKt;->onClick(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    .line 7
    invoke-virtual {p0}, Lcom/join/kotlin/EverdayNewFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;->e:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setPullRefreshEnabled(Z)V

    .line 8
    invoke-virtual {p0}, Lcom/join/kotlin/EverdayNewFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;->e:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    new-instance v0, Lcom/join/kotlin/EverdayNewFragment$onViewCreated$2;

    invoke-direct {v0, p0}, Lcom/join/kotlin/EverdayNewFragment$onViewCreated$2;-><init>(Lcom/join/kotlin/EverdayNewFragment;)V

    invoke-virtual {p1, v0}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setLoadingListener(Lcom/join/android/app/component/xrecyclerview/XRecyclerView$f;)V

    .line 9
    invoke-virtual {p0}, Lcom/join/kotlin/EverdayNewFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;->e:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    new-instance v0, Lcom/join/kotlin/EverdayNewFragment$onViewCreated$3;

    invoke-direct {v0, p0}, Lcom/join/kotlin/EverdayNewFragment$onViewCreated$3;-><init>(Lcom/join/kotlin/EverdayNewFragment;)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V

    .line 10
    iput p2, p0, Lcom/join/kotlin/EverdayNewFragment;->pageCount:I

    .line 11
    new-instance p1, Lcom/psk/kotlin/util/BasDownLoadActivityPresenter;

    invoke-virtual {p0}, Lcom/join/kotlin/EverdayNewFragment;->getManager()Landroidx/recyclerview/widget/LinearLayoutManager;

    move-result-object v0

    invoke-virtual {p0}, Lcom/join/kotlin/EverdayNewFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;

    move-result-object v1

    iget-object v1, v1, Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;->e:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    const-string v2, "binding.recycleView"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/join/kotlin/EverdayNewFragment;->showDataList:Ljava/util/ArrayList;

    invoke-direct {p1, v0, v1, v2}, Lcom/psk/kotlin/util/BasDownLoadActivityPresenter;-><init>(Landroidx/recyclerview/widget/LinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView;Ljava/util/List;)V

    invoke-virtual {p0, p1}, Lcom/join/kotlin/EverdayNewFragment;->setPresenter(Lcom/psk/kotlin/util/BasDownLoadActivityPresenter;)V

    .line 12
    invoke-virtual {p0}, Lcom/join/kotlin/EverdayNewFragment;->getPresenter()Lcom/psk/kotlin/util/BasDownLoadActivityPresenter;

    move-result-object p1

    invoke-virtual {p0}, Lcom/join/kotlin/EverdayNewFragment;->getAdapter()Lcom/join/kotlin/EverdayNewFragment$EverdayNewAdapter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/psk/kotlin/util/BasDownLoadActivityPresenter;->initData(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 13
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string v0, "title"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 14
    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "_from_home"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lcom/join/kotlin/EverdayNewFragment;->fromHome:Z

    if-eqz p1, :cond_6

    .line 15
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_2

    :sswitch_0
    const-string p2, "\u6a21\u62df\u5668"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    const/4 p1, 0x5

    .line 16
    iput p1, p0, Lcom/join/kotlin/EverdayNewFragment;->type:I

    goto :goto_2

    :sswitch_1
    const-string p2, "\u7f51\u6e38"

    .line 17
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_2

    :cond_3
    const/4 p1, 0x2

    .line 18
    iput p1, p0, Lcom/join/kotlin/EverdayNewFragment;->type:I

    goto :goto_2

    :sswitch_2
    const-string p2, "\u5355\u673a"

    .line 19
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_2

    :cond_4
    const/4 p1, 0x3

    .line 20
    iput p1, p0, Lcom/join/kotlin/EverdayNewFragment;->type:I

    goto :goto_2

    :sswitch_3
    const-string v0, "\u5168\u90e8"

    .line 21
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_2

    .line 22
    :cond_5
    iput p2, p0, Lcom/join/kotlin/EverdayNewFragment;->type:I

    .line 23
    :cond_6
    :goto_2
    iget p1, p0, Lcom/join/kotlin/EverdayNewFragment;->pageCount:I

    invoke-virtual {p0, p1}, Lcom/join/kotlin/EverdayNewFragment;->loadData(I)V

    return-void

    :sswitch_data_0
    .sparse-switch
        0xa6c80 -> :sswitch_3
        0xa7e85 -> :sswitch_2
        0xfd907 -> :sswitch_1
        0x19ab54a -> :sswitch_0
    .end sparse-switch
.end method

.method public final setAdapter(Lcom/join/kotlin/EverdayNewFragment$EverdayNewAdapter;)V
    .locals 1
    .param p1    # Lcom/join/kotlin/EverdayNewFragment$EverdayNewAdapter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/EverdayNewFragment;->adapter:Lcom/join/kotlin/EverdayNewFragment$EverdayNewAdapter;

    return-void
.end method

.method public final setBinding(Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;)V
    .locals 1
    .param p1    # Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/EverdayNewFragment;->binding:Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;

    return-void
.end method

.method public final setFirstVisiblePosition(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/kotlin/EverdayNewFragment;->firstVisiblePosition:I

    return-void
.end method

.method public final setFromHome(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/kotlin/EverdayNewFragment;->fromHome:Z

    return-void
.end method

.method public final setLastTimeDay(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/EverdayNewFragment;->lastTimeDay:Ljava/lang/String;

    return-void
.end method

.method public final setLastVisibleIndex(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/kotlin/EverdayNewFragment;->lastVisibleIndex:I

    return-void
.end method

.method public final setManager(Landroidx/recyclerview/widget/LinearLayoutManager;)V
    .locals 1
    .param p1    # Landroidx/recyclerview/widget/LinearLayoutManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/EverdayNewFragment;->manager:Landroidx/recyclerview/widget/LinearLayoutManager;

    return-void
.end method

.method public final setPageCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/kotlin/EverdayNewFragment;->pageCount:I

    return-void
.end method

.method public final setPresenter(Lcom/psk/kotlin/util/BasDownLoadActivityPresenter;)V
    .locals 1
    .param p1    # Lcom/psk/kotlin/util/BasDownLoadActivityPresenter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/EverdayNewFragment;->presenter:Lcom/psk/kotlin/util/BasDownLoadActivityPresenter;

    return-void
.end method

.method public final setShowDataList(Ljava/util/ArrayList;)V
    .locals 1
    .param p1    # Ljava/util/ArrayList;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/psk/kotlin/util/CommonListMainData;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/EverdayNewFragment;->showDataList:Ljava/util/ArrayList;

    return-void
.end method

.method public final setType(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/kotlin/EverdayNewFragment;->type:I

    return-void
.end method

.method public final showLoding()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/EverdayNewFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;->d:Lcom/join/android/app/mgsim/wufun/databinding/LodingLayoutIncludeBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/LodingLayoutIncludeBinding;->d:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/EverdayNewFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;->c:Lcom/join/android/app/mgsim/wufun/databinding/FailedLayoutIncludeBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/FailedLayoutIncludeBinding;->e:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/EverdayNewFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;->e:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    return-void
.end method
