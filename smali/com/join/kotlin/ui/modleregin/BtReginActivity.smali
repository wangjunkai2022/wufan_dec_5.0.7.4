.class public final Lcom/join/kotlin/ui/modleregin/BtReginActivity;
.super Lcom/join/kotlin/ui/base/BaseHasDownloadActivity;
.source "BtReginActivity.kt"

# interfaces
.implements Lcom/join/kotlin/ui/notice/ClickProxy;
.implements Lcom/join/kotlin/domain/common/LoadBindClickProxy;
.implements Lcom/join/android/app/component/xrecyclerview/XRecyclerView$f;


# instance fields
.field private final adapter$delegate:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final dataBinding$delegate:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final videoHelper$delegate:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final viewModel$delegate:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/kotlin/ui/base/BaseHasDownloadActivity;-><init>()V

    .line 2
    new-instance v0, Lcom/join/kotlin/ui/modleregin/BtReginActivity$viewModel$2;

    invoke-direct {v0, p0}, Lcom/join/kotlin/ui/modleregin/BtReginActivity$viewModel$2;-><init>(Lcom/join/kotlin/ui/modleregin/BtReginActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/join/kotlin/ui/modleregin/BtReginActivity;->viewModel$delegate:Lkotlin/Lazy;

    .line 3
    new-instance v0, Lcom/join/kotlin/ui/modleregin/BtReginActivity$dataBinding$2;

    invoke-direct {v0, p0}, Lcom/join/kotlin/ui/modleregin/BtReginActivity$dataBinding$2;-><init>(Lcom/join/kotlin/ui/modleregin/BtReginActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/join/kotlin/ui/modleregin/BtReginActivity;->dataBinding$delegate:Lkotlin/Lazy;

    .line 4
    new-instance v0, Lcom/join/kotlin/ui/modleregin/BtReginActivity$videoHelper$2;

    invoke-direct {v0, p0}, Lcom/join/kotlin/ui/modleregin/BtReginActivity$videoHelper$2;-><init>(Lcom/join/kotlin/ui/modleregin/BtReginActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/join/kotlin/ui/modleregin/BtReginActivity;->videoHelper$delegate:Lkotlin/Lazy;

    .line 5
    new-instance v0, Lcom/join/kotlin/ui/modleregin/BtReginActivity$adapter$2;

    invoke-direct {v0, p0}, Lcom/join/kotlin/ui/modleregin/BtReginActivity$adapter$2;-><init>(Lcom/join/kotlin/ui/modleregin/BtReginActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/join/kotlin/ui/modleregin/BtReginActivity;->adapter$delegate:Lkotlin/Lazy;

    return-void
.end method


# virtual methods
.method public final getAdapter()Lcom/join/kotlin/ui/modleregin/adapter/BtReginAdapter;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/modleregin/BtReginActivity;->adapter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/ui/modleregin/adapter/BtReginAdapter;

    return-object v0
.end method

.method public final getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/BtReginActivityBinding;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/modleregin/BtReginActivity;->dataBinding$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-dataBinding>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/BtReginActivityBinding;

    return-object v0
.end method

.method public final getVideoHelper()Lcom/join/android/app/component/video/c;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/modleregin/BtReginActivity;->videoHelper$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/component/video/c;

    return-object v0
.end method

.method public final getViewModel()Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/modleregin/BtReginActivity;->viewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    return-object v0
.end method

.method public onClickBack()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public onClickItem(Lcom/join/mgps/dto/BTActivityBean;)V
    .locals 1
    .param p1    # Lcom/join/mgps/dto/BTActivityBean;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onClickReload()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/BtReginActivity;->getViewModel()Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p0, v1}, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;->loadDatas(Landroid/content/Context;I)V

    return-void
.end method

.method public onClickSetNetWork()V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/UtilsMy;->w3(Landroid/content/Context;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Lcom/join/kotlin/ui/base/BaseHasDownloadActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/BtReginActivity;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/BtReginActivityBinding;

    move-result-object p1

    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/BtReginActivity;->getAdapter()Lcom/join/kotlin/ui/modleregin/adapter/BtReginAdapter;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/BtReginActivity;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/BtReginActivityBinding;

    move-result-object p1

    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/BtReginActivity;->getViewModel()Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    move-result-object v0

    const/16 v2, 0x22

    invoke-virtual {p1, v2, v0}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 4
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/BtReginActivity;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/BtReginActivityBinding;

    move-result-object p1

    const/16 v0, 0x15

    invoke-virtual {p1, v0, p0}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 5
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/BtReginActivity;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/BtReginActivityBinding;

    move-result-object p1

    const/4 v0, 0x7

    invoke-virtual {p1, v0, p0}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 6
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/BtReginActivity;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/BtReginActivityBinding;

    move-result-object p1

    const/16 v0, 0x1d

    invoke-virtual {p1, v0, p0}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 7
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/BtReginActivity;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/BtReginActivityBinding;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 8
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/BtReginActivity;->getViewModel()Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    move-result-object p1

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "title"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    invoke-virtual {p1, v0}, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;->setTitle(Ljava/lang/String;)V

    .line 9
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/BtReginActivity;->getViewModel()Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;->loadDatas(Landroid/content/Context;)V

    .line 10
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/BtReginActivity;->getVideoHelper()Lcom/join/android/app/component/video/c;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/join/android/app/component/video/c;->M(I)V

    .line 11
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/BtReginActivity;->getVideoHelper()Lcom/join/android/app/component/video/c;

    move-result-object p1

    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/BtReginActivity;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/BtReginActivityBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/BtReginActivityBinding;->c:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {p1, v0}, Lcom/join/android/app/component/video/c;->o(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 12
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/BtReginActivity;->getAdapter()Lcom/join/kotlin/ui/modleregin/adapter/BtReginAdapter;

    move-result-object p1

    new-instance v0, Lcom/join/kotlin/ui/modleregin/BtReginActivity$onCreate$1;

    invoke-direct {v0, p0}, Lcom/join/kotlin/ui/modleregin/BtReginActivity$onCreate$1;-><init>(Lcom/join/kotlin/ui/modleregin/BtReginActivity;)V

    invoke-virtual {p1, v0}, Lcom/join/kotlin/domain/adapter/BaseDataBindingAdapter;->setOnItemClickListener(Lkotlin/jvm/functions/Function3;)V

    .line 13
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/BtReginActivity;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/BtReginActivityBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/BtReginActivityBinding;->c:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    new-instance v0, Lcom/join/kotlin/ui/modleregin/BtReginActivity$onCreate$2;

    invoke-direct {v0, p0}, Lcom/join/kotlin/ui/modleregin/BtReginActivity$onCreate$2;-><init>(Lcom/join/kotlin/ui/modleregin/BtReginActivity;)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V

    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/BtReginActivity;->getVideoHelper()Lcom/join/android/app/component/video/c;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/BtReginActivity;->getVideoHelper()Lcom/join/android/app/component/video/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/android/app/component/video/c;->G()V

    .line 3
    :cond_0
    invoke-super {p0}, Lcom/join/kotlin/ui/base/BaseHasDownloadActivity;->onDestroy()V

    return-void
.end method

.method public onDownloadStatusEventReceved(Lcom/join/mgps/event/n;)V
    .locals 2
    .param p1    # Lcom/join/mgps/event/n;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "downloadTaskEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/BtReginActivity;->getViewModel()Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/kotlin/ui/base/BaseHasDownloadActivityViewModle;->onEventMainThread(Lcom/join/mgps/event/n;)V

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/event/n;->c()I

    move-result p1

    const/16 v0, 0x8

    if-ne p1, v0, :cond_1

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/BtReginActivity;->getViewModel()Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/join/kotlin/ui/base/BaseHasDownloadActivityViewModle;->getDownloadTasksMap()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast p1, Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_2

    .line 4
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/BtReginActivity;->getViewModel()Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object p1

    if-nez p1, :cond_0

    .line 5
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/BtReginActivity;->getViewModel()Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    move-result-object p1

    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/BtReginActivity;->getAdapter()Lcom/join/kotlin/ui/modleregin/adapter/BtReginAdapter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/BtReginActivity;->getViewModel()Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;->getManager()Landroidx/recyclerview/widget/LinearLayoutManager;

    move-result-object p1

    if-nez p1, :cond_2

    .line 7
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/BtReginActivity;->getViewModel()Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    move-result-object p1

    .line 8
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/BtReginActivity;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/BtReginActivityBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/BtReginActivityBinding;->c:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 9
    invoke-virtual {p1, v0}, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;->setManager(Landroidx/recyclerview/widget/LinearLayoutManager;)V

    goto :goto_0

    .line 10
    :cond_1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/BtReginActivity;->getAdapter()Lcom/join/kotlin/ui/modleregin/adapter/BtReginAdapter;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_2
    :goto_0
    return-void
.end method

.method public final onEventTagChangeThread(Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;)V
    .locals 1
    .param p1    # Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lorg/greenrobot/eventbus/Subscribe;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/BtReginActivity;->getViewModel()Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;->updateTitles(Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;)V

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/BtReginActivity;->getAdapter()Lcom/join/kotlin/ui/modleregin/adapter/BtReginAdapter;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method

.method public onLoadMore()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/BtReginActivity;->getViewModel()Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;->loadDatas(Landroid/content/Context;)V

    return-void
.end method

.method protected onPause()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/BtReginActivity;->getVideoHelper()Lcom/join/android/app/component/video/c;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/BtReginActivity;->getVideoHelper()Lcom/join/android/app/component/video/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/android/app/component/video/c;->H()V

    .line 3
    :cond_0
    invoke-super {p0}, Lcom/BaseAppCompatActivity;->onPause()V

    return-void
.end method

.method public onRefresh()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/BtReginActivity;->getViewModel()Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p0, v1}, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;->loadDatas(Landroid/content/Context;I)V

    return-void
.end method

.method protected onResume()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/BtReginActivity;->getVideoHelper()Lcom/join/android/app/component/video/c;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/BtReginActivity;->getVideoHelper()Lcom/join/android/app/component/video/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/android/app/component/video/c;->I()V

    .line 3
    :cond_0
    sget-object v1, Lkotlinx/coroutines/s1;->b:Lkotlinx/coroutines/s1;

    invoke-static {}, Lkotlinx/coroutines/d1;->c()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v2

    const/4 v3, 0x0

    new-instance v4, Lcom/join/kotlin/ui/modleregin/BtReginActivity$onResume$1;

    const/4 v0, 0x0

    invoke-direct {v4, p0, v0}, Lcom/join/kotlin/ui/modleregin/BtReginActivity$onResume$1;-><init>(Lcom/join/kotlin/ui/modleregin/BtReginActivity;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/q0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/z1;

    .line 4
    invoke-super {p0}, Lcom/BaseAppCompatActivity;->onResume()V

    .line 5
    invoke-static {p0}, Lcom/join/mgps/Util/UtilsMy;->q4(Landroid/content/Context;)V

    return-void
.end method
