.class public final Lcom/join/kotlin/quark/SourceHopeFragment;
.super Lcom/join/kotlin/base/fragment/BaseVmDbFragment;
.source "SourceHopeFragment.kt"

# interfaces
.implements Lcom/join/kotlin/quark/proxy/SourceHopeItemClickProxy;
.implements Lcom/join/kotlin/quark/callback/IChangeSortCallback;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/kotlin/base/fragment/BaseVmDbFragment<",
        "Lcom/join/kotlin/quark/viewmodel/SourceHopeListViewModel;",
        "Lcom/join/android/app/mgsim/wufun/databinding/FragmentSourceHopeBinding;",
        ">;",
        "Lcom/join/kotlin/quark/proxy/SourceHopeItemClickProxy;",
        "Lcom/join/kotlin/quark/callback/IChangeSortCallback;"
    }
.end annotation


# instance fields
.field private final adapter$delegate:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private loadSir:Lcom/kingja/loadsir/core/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/kingja/loadsir/core/b<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/kotlin/base/fragment/BaseVmDbFragment;-><init>()V

    .line 2
    sget-object v0, Lcom/join/kotlin/quark/SourceHopeFragment$adapter$2;->INSTANCE:Lcom/join/kotlin/quark/SourceHopeFragment$adapter$2;

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/join/kotlin/quark/SourceHopeFragment;->adapter$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic W(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/join/kotlin/quark/SourceHopeFragment;->createObserver$lambda$5$lambda$4(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic X(Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/join/kotlin/quark/SourceHopeFragment;->initView$lambda$3$lambda$2(Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V

    return-void
.end method

.method public static final synthetic access$getLoadSir$p(Lcom/join/kotlin/quark/SourceHopeFragment;)Lcom/kingja/loadsir/core/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/kotlin/quark/SourceHopeFragment;->loadSir:Lcom/kingja/loadsir/core/b;

    return-object p0
.end method

.method private static final createObserver$lambda$5$lambda$4(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final initView$lambda$3$lambda$2(Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    const-string p2, "adapter"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p0, "view"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public createObserver()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/quark/viewmodel/SourceHopeListViewModel;

    .line 2
    invoke-virtual {v0}, Lcom/join/kotlin/quark/viewmodel/SourceHopeListViewModel;->getListData()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    new-instance v1, Lcom/join/kotlin/quark/SourceHopeFragment$createObserver$1$1;

    invoke-direct {v1, p0}, Lcom/join/kotlin/quark/SourceHopeFragment$createObserver$1$1;-><init>(Lcom/join/kotlin/quark/SourceHopeFragment;)V

    new-instance v2, Lcom/join/kotlin/quark/o;

    invoke-direct {v2, v1}, Lcom/join/kotlin/quark/o;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p0, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    return-void
.end method

.method public dismissLoading()V
    .locals 0

    return-void
.end method

.method public final getAdapter()Lcom/join/kotlin/quark/adapter/SourceHopeAdapter;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/quark/SourceHopeFragment;->adapter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/quark/adapter/SourceHopeAdapter;

    return-object v0
.end method

.method public getStatusState()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/quark/viewmodel/SourceHopeListViewModel;

    invoke-virtual {v0}, Lcom/join/kotlin/quark/viewmodel/SourceHopeListViewModel;->getStatus()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public initView(Landroid/os/Bundle;)V
    .locals 8
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v2

    check-cast v2, Lcom/join/kotlin/quark/viewmodel/SourceHopeListViewModel;

    const-string v3, "_keyword"

    const-string v4, ""

    invoke-virtual {p1, v3, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/join/kotlin/quark/viewmodel/SourceHopeListViewModel;->setKeyword(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v2

    check-cast v2, Lcom/join/kotlin/quark/viewmodel/SourceHopeListViewModel;

    const-string v3, "_sortType"

    invoke-virtual {p1, v3, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/join/kotlin/quark/viewmodel/SourceHopeListViewModel;->setSortType(Ljava/lang/Integer;)V

    .line 4
    invoke-virtual {p0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v2

    check-cast v2, Lcom/join/kotlin/quark/viewmodel/SourceHopeListViewModel;

    const-string v3, "_type"

    invoke-virtual {p1, v3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/join/kotlin/quark/viewmodel/SourceHopeListViewModel;->setType(Ljava/lang/Integer;)V

    .line 5
    :cond_0
    invoke-virtual {p0}, Lcom/join/kotlin/base/fragment/BaseVmDbFragment;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/FragmentSourceHopeBinding;

    invoke-virtual {p0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v2

    check-cast v2, Lcom/join/kotlin/quark/viewmodel/SourceHopeListViewModel;

    invoke-virtual {p1, v2}, Lcom/join/android/app/mgsim/wufun/databinding/FragmentSourceHopeBinding;->f(Lcom/join/kotlin/quark/viewmodel/SourceHopeListViewModel;)V

    .line 6
    invoke-virtual {p0}, Lcom/join/kotlin/base/fragment/BaseVmDbFragment;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/FragmentSourceHopeBinding;

    iget-object v2, p1, Lcom/join/android/app/mgsim/wufun/databinding/FragmentSourceHopeBinding;->b:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    const-string p1, "mDatabind.xrvList"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    new-instance v3, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4, v1, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    .line 8
    invoke-virtual {p0}, Lcom/join/kotlin/quark/SourceHopeFragment;->getAdapter()Lcom/join/kotlin/quark/adapter/SourceHopeAdapter;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    .line 9
    invoke-static/range {v2 .. v7}, Lcom/join/kotlin/base/ext/CustomViewExtKt;->init$default(Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Landroidx/recyclerview/widget/RecyclerView$Adapter;ZILjava/lang/Object;)Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    .line 10
    invoke-virtual {p0}, Lcom/join/kotlin/quark/SourceHopeFragment;->getAdapter()Lcom/join/kotlin/quark/adapter/SourceHopeAdapter;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/kotlin/quark/adapter/SourceHopeAdapter;->setSourceHopeItemClickProxy(Lcom/join/kotlin/quark/proxy/SourceHopeItemClickProxy;)V

    .line 11
    invoke-virtual {p0}, Lcom/join/kotlin/base/fragment/BaseVmDbFragment;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/FragmentSourceHopeBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/FragmentSourceHopeBinding;->b:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    .line 12
    new-instance v1, Lcom/join/kotlin/quark/SourceHopeFragment$initView$2$1;

    invoke-direct {v1, v0}, Lcom/join/kotlin/quark/SourceHopeFragment$initView$2$1;-><init>(Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 13
    invoke-virtual {p0}, Lcom/join/kotlin/quark/SourceHopeFragment;->getAdapter()Lcom/join/kotlin/quark/adapter/SourceHopeAdapter;

    move-result-object v0

    .line 14
    sget-object v1, Lcom/join/kotlin/quark/p;->a:Lcom/join/kotlin/quark/p;

    invoke-virtual {v0, v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setOnItemClickListener(Lcom/chad/library/adapter/base/BaseQuickAdapter$d;)Lcom/chad/library/adapter/base/BaseQuickAdapter;

    .line 15
    invoke-virtual {p0}, Lcom/join/kotlin/base/fragment/BaseVmDbFragment;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/FragmentSourceHopeBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/FragmentSourceHopeBinding;->b:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    new-instance v1, Lcom/join/kotlin/quark/SourceHopeFragment$initView$4;

    invoke-direct {v1, p0}, Lcom/join/kotlin/quark/SourceHopeFragment$initView$4;-><init>(Lcom/join/kotlin/quark/SourceHopeFragment;)V

    invoke-virtual {v0, v1}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->setLoadingListener(Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$LoadingListener;)V

    .line 16
    invoke-virtual {p0}, Lcom/join/kotlin/base/fragment/BaseVmDbFragment;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/FragmentSourceHopeBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/FragmentSourceHopeBinding;->b:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/join/kotlin/quark/SourceHopeFragment$initView$5;

    invoke-direct {p1, p0}, Lcom/join/kotlin/quark/SourceHopeFragment$initView$5;-><init>(Lcom/join/kotlin/quark/SourceHopeFragment;)V

    invoke-static {v0, p1}, Lcom/join/kotlin/base/ext/CustomViewExtKt;->loadServiceInit(Landroid/view/View;Lkotlin/jvm/functions/Function0;)Lcom/kingja/loadsir/core/b;

    move-result-object p1

    iput-object p1, p0, Lcom/join/kotlin/quark/SourceHopeFragment;->loadSir:Lcom/kingja/loadsir/core/b;

    if-nez p1, :cond_1

    const-string p1, "loadSir"

    .line 17
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_1
    invoke-static {p1}, Lcom/join/kotlin/base/ext/CustomViewExtKt;->showLoading(Lcom/kingja/loadsir/core/b;)V

    return-void
.end method

.method public lazyLoadData()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Lcom/join/kotlin/quark/SourceHopeFragment;->loadData(Z)V

    return-void
.end method

.method public final loadData(Z)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Lcom/join/kotlin/quark/callback/IChangeSortCallback;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.join.kotlin.quark.callback.IChangeSortCallback"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/join/kotlin/quark/callback/IChangeSortCallback;

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v1

    check-cast v1, Lcom/join/kotlin/quark/viewmodel/SourceHopeListViewModel;

    invoke-interface {v0}, Lcom/join/kotlin/quark/callback/IChangeSortCallback;->getStatusState()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/join/kotlin/quark/viewmodel/SourceHopeListViewModel;->setStatus(Ljava/lang/Integer;)V

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/quark/viewmodel/SourceHopeListViewModel;

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v1

    const-string v2, "getInstance_(context).uid"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-virtual {v0, p1, v1}, Lcom/join/kotlin/quark/viewmodel/SourceHopeListViewModel;->getWishPoolList(ZLjava/lang/String;)V

    return-void
.end method

.method public onStatusChanged()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/quark/viewmodel/SourceHopeListViewModel;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 3
    invoke-virtual {p0, v0}, Lcom/join/kotlin/quark/SourceHopeFragment;->loadData(Z)V

    :cond_0
    return-void
.end method

.method public onUploadSourceClick(Lcom/join/kotlin/quark/model/bean/SourceListItemBean;)V
    .locals 4
    .param p1    # Lcom/join/kotlin/quark/model/bean/SourceListItemBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "_wishPoolItem"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    move-result-object p1

    const-string v0, "Intent().putExtra(\"_wishPoolItem\", item)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/join/kotlin/quark/ShareSourceActivity;

    .line 4
    new-instance v3, Lcom/join/kotlin/quark/SourceHopeFragment$onUploadSourceClick$1;

    invoke-direct {v3, p0}, Lcom/join/kotlin/quark/SourceHopeFragment$onUploadSourceClick$1;-><init>(Lcom/join/kotlin/quark/SourceHopeFragment;)V

    .line 5
    invoke-virtual {v0, v1, v2, p1, v3}, Lcom/join/mgps/Util/IntentUtil;->startActivityWithCallback(Landroid/content/Context;Ljava/lang/Class;Landroid/content/Intent;Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;)V

    return-void
.end method

.method public onViewSourceClick(Lcom/join/kotlin/quark/model/bean/SourceListItemBean;)V
    .locals 3
    .param p1    # Lcom/join/kotlin/quark/model/bean/SourceListItemBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/join/kotlin/quark/SourceShareDetailActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "itemBean"

    .line 2
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 3
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public onWantClick(Lcom/join/kotlin/quark/model/bean/SourceListItemBean;)V
    .locals 4
    .param p1    # Lcom/join/kotlin/quark/model/bean/SourceListItemBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    invoke-static {p0, v0, v1, v0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->showLoading$default(Lcom/join/kotlin/base/fragment/BaseVmFragment;Ljava/lang/String;ILjava/lang/Object;)V

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v1

    check-cast v1, Lcom/join/kotlin/quark/viewmodel/SourceHopeListViewModel;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/join/kotlin/quark/model/bean/SourceListItemBean;->getId()Ljava/lang/Integer;

    move-result-object v0

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object p1

    const-string v2, "getInstance_(context).uid"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/join/kotlin/quark/SourceHopeFragment$onWantClick$1;

    invoke-direct {v2, p0}, Lcom/join/kotlin/quark/SourceHopeFragment$onWantClick$1;-><init>(Lcom/join/kotlin/quark/SourceHopeFragment;)V

    sget-object v3, Lcom/join/kotlin/quark/SourceHopeFragment$onWantClick$2;->INSTANCE:Lcom/join/kotlin/quark/SourceHopeFragment$onWantClick$2;

    invoke-virtual {v1, v0, p1, v2, v3}, Lcom/join/kotlin/quark/viewmodel/SourceHopeListViewModel;->wishPoolWant(Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

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
