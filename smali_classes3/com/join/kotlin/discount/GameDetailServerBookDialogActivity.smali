.class public final Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity;
.super Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity;
.source "GameDetailServerBookDialogActivity.kt"

# interfaces
.implements Lcom/join/kotlin/discount/proxy/GameDetailServerBookDialogClickProxy;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity<",
        "Lcom/join/kotlin/discount/viewmodel/GameDetailServerBookDialogViewModel;",
        "Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailServerBookDialogBinding;",
        ">;",
        "Lcom/join/kotlin/discount/proxy/GameDetailServerBookDialogClickProxy;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGameDetailServerBookDialogActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameDetailServerBookDialogActivity.kt\ncom/join/kotlin/discount/GameDetailServerBookDialogActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n350#2,7:123\n*S KotlinDebug\n*F\n+ 1 GameDetailServerBookDialogActivity.kt\ncom/join/kotlin/discount/GameDetailServerBookDialogActivity\n*L\n111#1:123,7\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nGameDetailServerBookDialogActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameDetailServerBookDialogActivity.kt\ncom/join/kotlin/discount/GameDetailServerBookDialogActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n350#2,7:123\n*S KotlinDebug\n*F\n+ 1 GameDetailServerBookDialogActivity.kt\ncom/join/kotlin/discount/GameDetailServerBookDialogActivity\n*L\n111#1:123,7\n*E\n"
    }
.end annotation


# instance fields
.field private loadSir:Lcom/kingja/loadsir/core/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/kingja/loadsir/core/b<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final mAdapter$delegate:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity;-><init>()V

    .line 2
    sget-object v0, Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity$mAdapter$2;->INSTANCE:Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity$mAdapter$2;

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity;->mAdapter$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$getLoadSir$p(Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity;)Lcom/kingja/loadsir/core/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity;->loadSir:Lcom/kingja/loadsir/core/b;

    return-object p0
.end method

.method public static final synthetic access$loadData(Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity;->loadData()V

    return-void
.end method

.method public static final synthetic access$scrollToAvailableData(Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity;->scrollToAvailableData()V

    return-void
.end method

.method private static final createObserver$lambda$3$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final createObserver$lambda$3$lambda$2(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic f0(Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity;->initView$lambda$0(Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V

    return-void
.end method

.method public static synthetic g0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity;->createObserver$lambda$3$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic h0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity;->createObserver$lambda$3$lambda$2(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic i0(Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity;->scrollToAvailableData$lambda$5(Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity;)V

    return-void
.end method

.method private static final initView$lambda$0(Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    const-string p2, "adapter"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "<anonymous parameter 1>"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method private final loadData()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDialogActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/discount/viewmodel/GameDetailServerBookDialogViewModel;

    invoke-virtual {v0}, Lcom/join/kotlin/discount/viewmodel/GameDetailServerBookDialogViewModel;->getServerList()V

    return-void
.end method

.method private final scrollToAvailableData()V
    .locals 1

    .line 1
    new-instance v0, Lcom/join/kotlin/discount/q;

    invoke-direct {v0, p0}, Lcom/join/kotlin/discount/q;-><init>(Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static final scrollToAvailableData$lambda$5(Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity;)V
    .locals 5

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity$scrollToAvailableData$1$scroller$1;

    invoke-direct {v0, p0}, Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity$scrollToAvailableData$1$scroller$1;-><init>(Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity;)V

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity;->getMAdapter()Lcom/join/kotlin/discount/adapter/GameDetailServerBookAdapter;

    move-result-object v1

    invoke-virtual {v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItems()Ljava/util/List;

    move-result-object v1

    .line 3
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 4
    check-cast v3, Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;

    .line 5
    invoke-virtual {v3}, Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;->getExpire()Ljava/lang/Boolean;

    move-result-object v3

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, -0x1

    :goto_1
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView$SmoothScroller;->setTargetPosition(I)V

    .line 6
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailServerBookDialogBinding;

    iget-object p0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailServerBookDialogBinding;->d:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object p0

    const-string v1, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->startSmoothScroll(Landroidx/recyclerview/widget/RecyclerView$SmoothScroller;)V

    return-void
.end method


# virtual methods
.method public createObserver()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDialogActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/discount/viewmodel/GameDetailServerBookDialogViewModel;

    .line 2
    invoke-virtual {v0}, Lcom/join/kotlin/discount/viewmodel/GameDetailServerBookDialogViewModel;->getListData()Landroidx/lifecycle/MutableLiveData;

    move-result-object v1

    new-instance v2, Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity$createObserver$1$1;

    invoke-direct {v2, p0}, Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity$createObserver$1$1;-><init>(Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity;)V

    new-instance v3, Lcom/join/kotlin/discount/n;

    invoke-direct {v3, v2}, Lcom/join/kotlin/discount/n;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, p0, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 3
    invoke-virtual {v0}, Lcom/join/kotlin/discount/viewmodel/GameDetailServerBookDialogViewModel;->getSubscribeResultBean()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    new-instance v1, Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity$createObserver$1$2;

    invoke-direct {v1, p0}, Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity$createObserver$1$2;-><init>(Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity;)V

    new-instance v2, Lcom/join/kotlin/discount/o;

    invoke-direct {v2, v1}, Lcom/join/kotlin/discount/o;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p0, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    return-void
.end method

.method public getContentView()Landroid/view/View;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailServerBookDialogBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailServerBookDialogBinding;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method

.method public final getMAdapter()Lcom/join/kotlin/discount/adapter/GameDetailServerBookAdapter;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity;->mAdapter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/discount/adapter/GameDetailServerBookAdapter;

    return-object v0
.end method

.method public initView(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailServerBookDialogBinding;

    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDialogActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/discount/viewmodel/GameDetailServerBookDialogViewModel;

    invoke-virtual {p1, v0}, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailServerBookDialogBinding;->h(Lcom/join/kotlin/discount/viewmodel/GameDetailServerBookDialogViewModel;)V

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailServerBookDialogBinding;

    invoke-virtual {p1, p0}, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailServerBookDialogBinding;->g(Lcom/join/kotlin/discount/proxy/GameDetailServerBookDialogClickProxy;)V

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailServerBookDialogBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailServerBookDialogBinding;->d:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    const-string v0, "mDatabind.recyclerview"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity$initView$1;

    invoke-direct {v0, p0}, Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity$initView$1;-><init>(Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity;)V

    invoke-static {p1, v0}, Lcom/join/kotlin/base/ext/CustomViewExtKt;->loadServiceInit(Landroid/view/View;Lkotlin/jvm/functions/Function0;)Lcom/kingja/loadsir/core/b;

    move-result-object p1

    iput-object p1, p0, Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity;->loadSir:Lcom/kingja/loadsir/core/b;

    .line 4
    invoke-static {p0}, Lcom/join/mgps/Util/c2;->s(Landroid/app/Activity;)V

    .line 5
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDialogActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object p1

    check-cast p1, Lcom/join/kotlin/discount/viewmodel/GameDetailServerBookDialogViewModel;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "gameId"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/join/kotlin/discount/viewmodel/GameDetailServerBookDialogViewModel;->setGameId(Ljava/lang/String;)V

    .line 6
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailServerBookDialogBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailServerBookDialogBinding;->d:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    new-instance v0, Landroidx/recyclerview/widget/GridLayoutManager;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 7
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailServerBookDialogBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailServerBookDialogBinding;->d:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    invoke-virtual {p0}, Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity;->getMAdapter()Lcom/join/kotlin/discount/adapter/GameDetailServerBookAdapter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 8
    invoke-virtual {p0}, Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity;->getMAdapter()Lcom/join/kotlin/discount/adapter/GameDetailServerBookAdapter;

    move-result-object p1

    sget-object v0, Lcom/join/kotlin/discount/p;->a:Lcom/join/kotlin/discount/p;

    invoke-virtual {p1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setOnItemClickListener(Lcom/chad/library/adapter/base/BaseQuickAdapter$d;)Lcom/chad/library/adapter/base/BaseQuickAdapter;

    .line 9
    iget-object p1, p0, Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity;->loadSir:Lcom/kingja/loadsir/core/b;

    if-nez p1, :cond_0

    const-string p1, "loadSir"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    invoke-static {p1}, Lcom/join/kotlin/base/ext/CustomViewExtKt;->showLoading(Lcom/kingja/loadsir/core/b;)V

    .line 10
    invoke-direct {p0}, Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity;->loadData()V

    return-void
.end method

.method public onBackClick()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/base/dialog/BaseDialogActivity;->finish()V

    return-void
.end method
