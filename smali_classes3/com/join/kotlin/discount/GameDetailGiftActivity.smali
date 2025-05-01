.class public final Lcom/join/kotlin/discount/GameDetailGiftActivity;
.super Lcom/join/kotlin/base/activity/BaseVmDbActivity;
.source "GameDetailGiftActivity.kt"

# interfaces
.implements Lcom/join/kotlin/discount/proxy/GameDetailGiftClickProxy;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/kotlin/base/activity/BaseVmDbActivity<",
        "Lcom/join/kotlin/discount/viewmodel/GameDetailGiftViewModel;",
        "Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailGiftBinding;",
        ">;",
        "Lcom/join/kotlin/discount/proxy/GameDetailGiftClickProxy;"
    }
.end annotation


# instance fields
.field private datas:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/kotlin/discount/model/bean/GameDetailGiftEntityBean;",
            ">;"
        }
    .end annotation

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

.field private final mAdapter$delegate:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/kotlin/discount/GameDetailGiftActivity;->datas:Ljava/util/List;

    .line 3
    sget-object v0, Lcom/join/kotlin/discount/GameDetailGiftActivity$mAdapter$2;->INSTANCE:Lcom/join/kotlin/discount/GameDetailGiftActivity$mAdapter$2;

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/join/kotlin/discount/GameDetailGiftActivity;->mAdapter$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$getLoadSir$p(Lcom/join/kotlin/discount/GameDetailGiftActivity;)Lcom/kingja/loadsir/core/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/kotlin/discount/GameDetailGiftActivity;->loadSir:Lcom/kingja/loadsir/core/b;

    return-object p0
.end method

.method public static final synthetic access$getMAdapter(Lcom/join/kotlin/discount/GameDetailGiftActivity;)Lcom/join/kotlin/discount/adapter/GameDetailGiftAdapter;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/kotlin/discount/GameDetailGiftActivity;->getMAdapter()Lcom/join/kotlin/discount/adapter/GameDetailGiftAdapter;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$loadData(Lcom/join/kotlin/discount/GameDetailGiftActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/kotlin/discount/GameDetailGiftActivity;->loadData()V

    return-void
.end method

.method private static final createObserver$lambda$1$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic f0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/join/kotlin/discount/GameDetailGiftActivity;->createObserver$lambda$1$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method private final getMAdapter()Lcom/join/kotlin/discount/adapter/GameDetailGiftAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/GameDetailGiftActivity;->mAdapter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/discount/adapter/GameDetailGiftAdapter;

    return-object v0
.end method

.method private final loadData()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/discount/viewmodel/GameDetailGiftViewModel;

    invoke-virtual {v0}, Lcom/join/kotlin/discount/viewmodel/GameDetailGiftViewModel;->getGiftList()V

    return-void
.end method


# virtual methods
.method public createObserver()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/discount/viewmodel/GameDetailGiftViewModel;

    .line 2
    invoke-virtual {v0}, Lcom/join/kotlin/discount/viewmodel/GameDetailGiftViewModel;->getListData()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    new-instance v1, Lcom/join/kotlin/discount/GameDetailGiftActivity$createObserver$1$1;

    invoke-direct {v1, p0}, Lcom/join/kotlin/discount/GameDetailGiftActivity$createObserver$1$1;-><init>(Lcom/join/kotlin/discount/GameDetailGiftActivity;)V

    new-instance v2, Lcom/join/kotlin/discount/m;

    invoke-direct {v2, v1}, Lcom/join/kotlin/discount/m;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p0, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    return-void
.end method

.method public goGiftDetail(Lcom/join/kotlin/discount/model/bean/GiftItemBean;)V
    .locals 2
    .param p1    # Lcom/join/kotlin/discount/model/bean/GiftItemBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/join/kotlin/discount/CommonBottomDialogActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string/jumbo v0, "title"

    const-string/jumbo v1, "\u6e29\u99a8\u63d0\u793a"

    .line 2
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "content"

    const-string/jumbo v1, "\u8bf7\u524d\u5f80\u6e38\u620f\u4e2d\u9886\u53d6"

    .line 3
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "btnText"

    const-string/jumbo v1, "\u6211\u77e5\u9053\u4e86"

    .line 4
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 5
    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public initView(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailGiftBinding;

    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/discount/viewmodel/GameDetailGiftViewModel;

    invoke-virtual {p1, v0}, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailGiftBinding;->h(Lcom/join/kotlin/discount/viewmodel/GameDetailGiftViewModel;)V

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailGiftBinding;

    invoke-virtual {p1, p0}, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailGiftBinding;->g(Lcom/join/kotlin/discount/proxy/GameDetailGiftClickProxy;)V

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailGiftBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailGiftBinding;->d:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    const-string v0, "mDatabind.rvGift"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/join/kotlin/discount/GameDetailGiftActivity$initView$1;

    invoke-direct {v0, p0}, Lcom/join/kotlin/discount/GameDetailGiftActivity$initView$1;-><init>(Lcom/join/kotlin/discount/GameDetailGiftActivity;)V

    invoke-static {p1, v0}, Lcom/join/kotlin/base/ext/CustomViewExtKt;->loadServiceInit(Landroid/view/View;Lkotlin/jvm/functions/Function0;)Lcom/kingja/loadsir/core/b;

    move-result-object p1

    iput-object p1, p0, Lcom/join/kotlin/discount/GameDetailGiftActivity;->loadSir:Lcom/kingja/loadsir/core/b;

    if-nez p1, :cond_0

    const-string p1, "loadSir"

    .line 4
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    invoke-static {p1}, Lcom/join/kotlin/base/ext/CustomViewExtKt;->showLoading(Lcom/kingja/loadsir/core/b;)V

    .line 5
    invoke-direct {p0}, Lcom/join/kotlin/discount/GameDetailGiftActivity;->getMAdapter()Lcom/join/kotlin/discount/adapter/GameDetailGiftAdapter;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/join/kotlin/discount/adapter/GameDetailGiftAdapter;->setClick(Lcom/join/kotlin/discount/proxy/GameDetailGiftClickProxy;)V

    .line 6
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object p1

    check-cast p1, Lcom/join/kotlin/discount/viewmodel/GameDetailGiftViewModel;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "gameId"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/join/kotlin/discount/viewmodel/GameDetailGiftViewModel;->setGameId(Ljava/lang/String;)V

    .line 7
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailGiftBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailGiftBinding;->d:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v0, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 8
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailGiftBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailGiftBinding;->d:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    invoke-direct {p0}, Lcom/join/kotlin/discount/GameDetailGiftActivity;->getMAdapter()Lcom/join/kotlin/discount/adapter/GameDetailGiftAdapter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 9
    invoke-direct {p0}, Lcom/join/kotlin/discount/GameDetailGiftActivity;->loadData()V

    return-void
.end method

.method public onBackClick()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public receiveGift(Lcom/join/kotlin/discount/model/bean/GiftItemBean;)V
    .locals 2
    .param p1    # Lcom/join/kotlin/discount/model/bean/GiftItemBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/join/kotlin/discount/CommonBottomDialogActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string/jumbo v0, "title"

    const-string/jumbo v1, "\u6e29\u99a8\u63d0\u793a"

    .line 2
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "content"

    const-string/jumbo v1, "\u8bf7\u524d\u5f80\u6e38\u620f\u4e2d\u9886\u53d6"

    .line 3
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "btnText"

    const-string/jumbo v1, "\u6211\u77e5\u9053\u4e86"

    .line 4
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 5
    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
