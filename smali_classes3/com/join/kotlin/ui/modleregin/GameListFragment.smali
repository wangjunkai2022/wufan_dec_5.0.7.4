.class public final Lcom/join/kotlin/ui/modleregin/GameListFragment;
.super Landroidx/fragment/app/Fragment;
.source "GameListFragment.kt"


# instance fields
.field private final adapter$delegate:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public dataBinding:Lcom/join/android/app/mgsim/wufun/databinding/DatabGamelistLayoutBinding;

.field private final viewModelMain$delegate:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final viewModle$delegate:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    .line 2
    new-instance v0, Lcom/join/kotlin/ui/modleregin/GameListFragment$viewModle$2;

    invoke-direct {v0, p0}, Lcom/join/kotlin/ui/modleregin/GameListFragment$viewModle$2;-><init>(Lcom/join/kotlin/ui/modleregin/GameListFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/join/kotlin/ui/modleregin/GameListFragment;->viewModle$delegate:Lkotlin/Lazy;

    .line 3
    new-instance v0, Lcom/join/kotlin/ui/modleregin/GameListFragment$viewModelMain$2;

    invoke-direct {v0, p0}, Lcom/join/kotlin/ui/modleregin/GameListFragment$viewModelMain$2;-><init>(Lcom/join/kotlin/ui/modleregin/GameListFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/join/kotlin/ui/modleregin/GameListFragment;->viewModelMain$delegate:Lkotlin/Lazy;

    .line 4
    new-instance v0, Lcom/join/kotlin/ui/modleregin/GameListFragment$adapter$2;

    invoke-direct {v0, p0}, Lcom/join/kotlin/ui/modleregin/GameListFragment$adapter$2;-><init>(Lcom/join/kotlin/ui/modleregin/GameListFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/join/kotlin/ui/modleregin/GameListFragment;->adapter$delegate:Lkotlin/Lazy;

    return-void
.end method


# virtual methods
.method public final getAdapter()Lcom/join/kotlin/ui/modleregin/adapter/GamelistAdapter;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/modleregin/GameListFragment;->adapter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/ui/modleregin/adapter/GamelistAdapter;

    return-object v0
.end method

.method public final getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/DatabGamelistLayoutBinding;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/modleregin/GameListFragment;->dataBinding:Lcom/join/android/app/mgsim/wufun/databinding/DatabGamelistLayoutBinding;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "dataBinding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getViewModelMain()Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/modleregin/GameListFragment;->viewModelMain$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    return-object v0
.end method

.method public final getViewModle()Lcom/join/kotlin/ui/modleregin/viewModle/GameListViewModle;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/modleregin/GameListFragment;->viewModle$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/ui/modleregin/viewModle/GameListViewModle;

    return-object v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3
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

    const p3, 0x7f0c0162

    const/4 v0, 0x0

    .line 1
    invoke-static {p1, p3, p2, v0}, Landroidx/databinding/DataBindingUtil;->inflate(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    const-string p2, "inflate(\n            inf\u2026          false\n        )"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/DatabGamelistLayoutBinding;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/ui/modleregin/GameListFragment;->setDataBinding(Lcom/join/android/app/mgsim/wufun/databinding/DatabGamelistLayoutBinding;)V

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const-string/jumbo p2, "time"

    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide p1

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/GameListFragment;->getViewModelMain()Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    move-result-object p3

    invoke-virtual {p3}, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;->getListBtOnlineGame()Ljava/util/List;

    move-result-object p3

    const/4 v1, 0x1

    if-eqz p3, :cond_1

    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p3, 0x1

    :goto_1
    if-nez p3, :cond_2

    .line 4
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/GameListFragment;->getViewModle()Lcom/join/kotlin/ui/modleregin/viewModle/GameListViewModle;

    move-result-object p3

    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/GameListFragment;->getViewModelMain()Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/kotlin/ui/modleregin/viewModle/BtReginModle;->getListBtOnlineGame()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p3, v2, p1, p2}, Lcom/join/kotlin/ui/modleregin/viewModle/GameListViewModle;->showGameList(Ljava/util/List;J)V

    .line 5
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/GameListFragment;->getAdapter()Lcom/join/kotlin/ui/modleregin/adapter/GamelistAdapter;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 6
    :cond_2
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/GameListFragment;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/DatabGamelistLayoutBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/DatabGamelistLayoutBinding;->b:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {p1, v0}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setLoadingMoreEnabled(Z)V

    .line 7
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/GameListFragment;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/DatabGamelistLayoutBinding;

    move-result-object p1

    const/16 p2, 0x22

    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/GameListFragment;->getViewModle()Lcom/join/kotlin/ui/modleregin/viewModle/GameListViewModle;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 8
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/GameListFragment;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/DatabGamelistLayoutBinding;

    move-result-object p1

    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/GameListFragment;->getAdapter()Lcom/join/kotlin/ui/modleregin/adapter/GamelistAdapter;

    move-result-object p2

    invoke-virtual {p1, v1, p2}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 9
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/GameListFragment;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/DatabGamelistLayoutBinding;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final setDataBinding(Lcom/join/android/app/mgsim/wufun/databinding/DatabGamelistLayoutBinding;)V
    .locals 1
    .param p1    # Lcom/join/android/app/mgsim/wufun/databinding/DatabGamelistLayoutBinding;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/modleregin/GameListFragment;->dataBinding:Lcom/join/android/app/mgsim/wufun/databinding/DatabGamelistLayoutBinding;

    return-void
.end method
