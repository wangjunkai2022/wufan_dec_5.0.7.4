.class public final Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity;
.super Lcom/join/kotlin/ui/base/BaseHasDownloadActivity;
.source "MustPalyReginActivity.kt"

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
    new-instance v0, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity$viewModel$2;

    invoke-direct {v0, p0}, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity$viewModel$2;-><init>(Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity;->viewModel$delegate:Lkotlin/Lazy;

    .line 3
    new-instance v0, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity$videoHelper$2;

    invoke-direct {v0, p0}, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity$videoHelper$2;-><init>(Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity;->videoHelper$delegate:Lkotlin/Lazy;

    .line 4
    new-instance v0, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity$dataBinding$2;

    invoke-direct {v0, p0}, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity$dataBinding$2;-><init>(Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity;->dataBinding$delegate:Lkotlin/Lazy;

    .line 5
    new-instance v0, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity$adapter$2;

    invoke-direct {v0, p0}, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity$adapter$2;-><init>(Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity;->adapter$delegate:Lkotlin/Lazy;

    return-void
.end method


# virtual methods
.method public final getAdapter()Lcom/join/kotlin/ui/modleregin/adapter/MustpalyAdapter;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity;->adapter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/ui/modleregin/adapter/MustpalyAdapter;

    return-object v0
.end method

.method public final getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/MustplayReginActivityBinding;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity;->dataBinding$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-dataBinding>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/MustplayReginActivityBinding;

    return-object v0
.end method

.method public final getVideoHelper()Lcom/join/android/app/component/video/c;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity;->videoHelper$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/component/video/c;

    return-object v0
.end method

.method public final getViewModel()Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity;->viewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle;

    return-object v0
.end method

.method public final notifyAdapter(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string/jumbo v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity;->getAdapter()Lcom/join/kotlin/ui/modleregin/adapter/MustpalyAdapter;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
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
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity;->getViewModel()Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p0, v1}, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle;->loadDatas(Landroid/content/Context;I)V

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
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/MustplayReginActivityBinding;

    move-result-object p1

    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity;->getAdapter()Lcom/join/kotlin/ui/modleregin/adapter/MustpalyAdapter;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/MustplayReginActivityBinding;

    move-result-object p1

    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity;->getViewModel()Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle;

    move-result-object v0

    const/16 v2, 0x22

    invoke-virtual {p1, v2, v0}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 4
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/MustplayReginActivityBinding;

    move-result-object p1

    const/16 v0, 0x15

    invoke-virtual {p1, v0, p0}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 5
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/MustplayReginActivityBinding;

    move-result-object p1

    const/4 v0, 0x7

    invoke-virtual {p1, v0, p0}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 6
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/MustplayReginActivityBinding;

    move-result-object p1

    const/16 v0, 0x1d

    invoke-virtual {p1, v0, p0}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 7
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/MustplayReginActivityBinding;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 8
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity;->getViewModel()Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle;

    move-result-object p1

    invoke-virtual {p1, p0, v1}, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle;->loadDatas(Landroid/content/Context;I)V

    .line 9
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity;->getVideoHelper()Lcom/join/android/app/component/video/c;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/join/android/app/component/video/c;->M(I)V

    .line 10
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity;->getVideoHelper()Lcom/join/android/app/component/video/c;

    move-result-object p1

    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/MustplayReginActivityBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/MustplayReginActivityBinding;->c:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {p1, v0}, Lcom/join/android/app/component/video/c;->o(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 11
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/MustplayReginActivityBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/MustplayReginActivityBinding;->c:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    new-instance v0, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity$onCreate$1;

    invoke-direct {v0, p0}, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity$onCreate$1;-><init>(Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity;)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V

    .line 12
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity;->getAdapter()Lcom/join/kotlin/ui/modleregin/adapter/MustpalyAdapter;

    move-result-object p1

    new-instance v0, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity$onCreate$2;

    invoke-direct {v0, p0}, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity$onCreate$2;-><init>(Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity;)V

    invoke-virtual {p1, v0}, Lcom/join/kotlin/domain/adapter/BaseDataBindingAdapter;->setOnItemClickListener(Lkotlin/jvm/functions/Function3;)V

    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity;->getVideoHelper()Lcom/join/android/app/component/video/c;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity;->getVideoHelper()Lcom/join/android/app/component/video/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/android/app/component/video/c;->G()V

    .line 3
    :cond_0
    invoke-super {p0}, Lcom/join/kotlin/ui/base/BaseHasDownloadActivity;->onDestroy()V

    return-void
.end method

.method public onDownloadStatusEventReceved(Lcom/join/mgps/event/n;)V
    .locals 1
    .param p1    # Lcom/join/mgps/event/n;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "downloadTaskEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity;->getViewModel()Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/kotlin/ui/base/BaseHasDownloadActivityViewModle;->onEventMainThread(Lcom/join/mgps/event/n;)V

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/event/n;->c()I

    move-result p1

    const/16 v0, 0x8

    if-eq p1, v0, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity;->getAdapter()Lcom/join/kotlin/ui/modleregin/adapter/MustpalyAdapter;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method public onLoadMore()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity;->getViewModel()Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/kotlin/ui/modleregin/viewModle/MustPlayViewModle;->loadDatas(Landroid/content/Context;)V

    return-void
.end method

.method protected onPause()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity;->getVideoHelper()Lcom/join/android/app/component/video/c;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity;->getVideoHelper()Lcom/join/android/app/component/video/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/android/app/component/video/c;->H()V

    .line 3
    :cond_0
    invoke-super {p0}, Lcom/BaseAppCompatActivity;->onPause()V

    return-void
.end method

.method public onRefresh()V
    .locals 3

    .line 1
    new-instance v0, Lkotlin/NotImplementedError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "An operation is not implemented: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "Not yet implemented"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected onResume()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity;->getVideoHelper()Lcom/join/android/app/component/video/c;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity;->getVideoHelper()Lcom/join/android/app/component/video/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/android/app/component/video/c;->I()V

    .line 3
    :cond_0
    sget-object v1, Lkotlinx/coroutines/s1;->b:Lkotlinx/coroutines/s1;

    invoke-static {}, Lkotlinx/coroutines/d1;->c()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v2

    const/4 v3, 0x0

    new-instance v4, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity$onResume$1;

    const/4 v0, 0x0

    invoke-direct {v4, p0, v0}, Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity$onResume$1;-><init>(Lcom/join/kotlin/ui/modleregin/MustPalyReginActivity;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/q0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/z1;

    .line 4
    invoke-super {p0}, Lcom/BaseAppCompatActivity;->onResume()V

    return-void
.end method
