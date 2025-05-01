.class public final Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;
.super Lcom/BaseAppCompatActivity;
.source "EndGameSlotListActivity.kt"

# interfaces
.implements Lcom/join/kotlin/ui/endgame/ISlotListener;
.implements Lcom/join/kotlin/domain/common/LoadBindClickProxy;


# instance fields
.field private final adapterx$delegate:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public dataBinding:Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;

.field private isLogin:Z

.field private mListener:Lcom/join/kotlin/ui/cloudarchive/IOnRunListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
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
    invoke-direct {p0}, Lcom/BaseAppCompatActivity;-><init>()V

    .line 2
    new-instance v0, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity$viewModle$2;

    invoke-direct {v0, p0}, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity$viewModle$2;-><init>(Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->viewModle$delegate:Lkotlin/Lazy;

    .line 3
    new-instance v0, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity$adapterx$2;

    invoke-direct {v0, p0}, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity$adapterx$2;-><init>(Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->adapterx$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic f0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->initData$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic g0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->initData$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method private static final initData$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final initData$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final getAdapterx()Lcom/join/kotlin/ui/endgame/adapter/EndGameSlotListAdapter;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->adapterx$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/ui/endgame/adapter/EndGameSlotListAdapter;

    return-object v0
.end method

.method public final getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->dataBinding:Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "dataBinding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getMListener()Lcom/join/kotlin/ui/cloudarchive/IOnRunListener;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->mListener:Lcom/join/kotlin/ui/cloudarchive/IOnRunListener;

    return-object v0
.end method

.method public final getViewModle()Lcom/join/kotlin/ui/endgame/EndGameSlotViewModel;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->viewModle$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/ui/endgame/EndGameSlotViewModel;

    return-object v0
.end method

.method public final initData()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;

    move-result-object v0

    invoke-virtual {p0}, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->getViewModle()Lcom/join/kotlin/ui/endgame/EndGameSlotViewModel;

    move-result-object v1

    const/16 v2, 0x22

    invoke-virtual {v0, v2, v1}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;

    move-result-object v0

    const/16 v1, 0x15

    invoke-virtual {v0, v1, p0}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 4
    invoke-virtual {p0}, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {p0}, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->getAdapterx()Lcom/join/kotlin/ui/endgame/adapter/EndGameSlotListAdapter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 5
    invoke-virtual {p0}, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setLoadingMoreEnabled(Z)V

    .line 6
    invoke-virtual {p0}, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {v0, v1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setPullRefreshEnabled(Z)V

    .line 7
    invoke-virtual {p0}, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getItemAnimator()Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;

    move-result-object v0

    const-string v2, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/recyclerview/widget/SimpleItemAnimator;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/SimpleItemAnimator;->setSupportsChangeAnimations(Z)V

    .line 8
    invoke-virtual {p0}, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->getViewModle()Lcom/join/kotlin/ui/endgame/EndGameSlotViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/kotlin/ui/endgame/EndGameSlotViewModel;->getListArchive()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    new-instance v2, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity$initData$1;

    invoke-direct {v2, p0}, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity$initData$1;-><init>(Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;)V

    new-instance v3, Lcom/join/kotlin/ui/endgame/b;

    invoke-direct {v3, v2}, Lcom/join/kotlin/ui/endgame/b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p0, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 9
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    const-string v2, "getInstance_(this).accountData"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->isTourist()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v1, 0x1

    .line 12
    :cond_0
    iput-boolean v1, p0, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->isLogin:Z

    .line 13
    invoke-virtual {p0}, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->loadData()V

    .line 14
    invoke-virtual {p0}, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;->j(Lcom/join/kotlin/ui/endgame/ISlotListener;)V

    .line 15
    invoke-virtual {p0}, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->getAdapterx()Lcom/join/kotlin/ui/endgame/adapter/EndGameSlotListAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/kotlin/ui/endgame/adapter/EndGameSlotListAdapter;->getCheckedItem()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    new-instance v1, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity$initData$2;

    invoke-direct {v1, p0}, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity$initData$2;-><init>(Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;)V

    new-instance v2, Lcom/join/kotlin/ui/endgame/a;

    invoke-direct {v2, v1}, Lcom/join/kotlin/ui/endgame/a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p0, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    return-void
.end method

.method public final isLogin()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->isLogin:Z

    return v0
.end method

.method public final loadData()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->getViewModle()Lcom/join/kotlin/ui/endgame/EndGameSlotViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/kotlin/ui/endgame/EndGameSlotViewModel;->loadLocalArchiveData()V

    return-void
.end method

.method public onBack()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public onClickReload()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->loadData()V

    return-void
.end method

.method public onClickSetNetWork()V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/UtilsMy;->w3(Landroid/content/Context;)V

    return-void
.end method

.method public onCommit()V
    .locals 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->getAdapterx()Lcom/join/kotlin/ui/endgame/adapter/EndGameSlotListAdapter;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/kotlin/ui/endgame/adapter/EndGameSlotListAdapter;->getCheckedItem()Landroidx/lifecycle/MutableLiveData;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/io/Serializable;

    const-string v2, "mData"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    const/4 v1, -0x1

    .line 3
    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->getViewModle()Lcom/join/kotlin/ui/endgame/EndGameSlotViewModel;

    move-result-object p1

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "gameId"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    invoke-virtual {p1, v0}, Lcom/join/kotlin/ui/endgame/EndGameSlotViewModel;->setGameId(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    const v0, 0x7f0c0043

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 4
    invoke-static {p1, v0, v1, v2}, Landroidx/databinding/DataBindingUtil;->inflate(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    const-string v0, "inflate(\n            lay\u2026          false\n        )"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->setDataBinding(Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;)V

    .line 5
    invoke-virtual {p0}, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/BaseAppCompatActivity;->setContentView(Landroid/view/View;)V

    .line 6
    invoke-virtual {p0}, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->initData()V

    .line 7
    invoke-virtual {p0}, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_1

    const v0, 0x7f08007a

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V

    :cond_1
    return-void
.end method

.method public final setDataBinding(Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;)V
    .locals 1
    .param p1    # Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->dataBinding:Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;

    return-void
.end method

.method public final setLogin(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->isLogin:Z

    return-void
.end method

.method public final setMListener(Lcom/join/kotlin/ui/cloudarchive/IOnRunListener;)V
    .locals 0
    .param p1    # Lcom/join/kotlin/ui/cloudarchive/IOnRunListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->mListener:Lcom/join/kotlin/ui/cloudarchive/IOnRunListener;

    return-void
.end method
