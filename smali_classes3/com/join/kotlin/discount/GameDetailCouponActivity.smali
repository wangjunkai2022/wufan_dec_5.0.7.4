.class public final Lcom/join/kotlin/discount/GameDetailCouponActivity;
.super Lcom/join/kotlin/base/activity/BaseVmDbActivity;
.source "GameDetailCouponActivity.kt"

# interfaces
.implements Lcom/join/kotlin/discount/proxy/GameDetailCouponClickProxy;
.implements Lcom/join/kotlin/discount/proxy/CouponListClickProxy;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/kotlin/base/activity/BaseVmDbActivity<",
        "Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;",
        "Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailCouponBinding;",
        ">;",
        "Lcom/join/kotlin/discount/proxy/GameDetailCouponClickProxy;",
        "Lcom/join/kotlin/discount/proxy/CouponListClickProxy;"
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

.field private pkg:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;-><init>()V

    .line 2
    sget-object v0, Lcom/join/kotlin/discount/GameDetailCouponActivity$mAdapter$2;->INSTANCE:Lcom/join/kotlin/discount/GameDetailCouponActivity$mAdapter$2;

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/join/kotlin/discount/GameDetailCouponActivity;->mAdapter$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$getLoadSir$p(Lcom/join/kotlin/discount/GameDetailCouponActivity;)Lcom/kingja/loadsir/core/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/kotlin/discount/GameDetailCouponActivity;->loadSir:Lcom/kingja/loadsir/core/b;

    return-object p0
.end method

.method public static final synthetic access$getMAdapter(Lcom/join/kotlin/discount/GameDetailCouponActivity;)Lcom/join/kotlin/discount/adapter/CouponGameDetailAdapter;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/kotlin/discount/GameDetailCouponActivity;->getMAdapter()Lcom/join/kotlin/discount/adapter/CouponGameDetailAdapter;

    move-result-object p0

    return-object p0
.end method

.method private static final createObserver$lambda$2$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic f0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/join/kotlin/discount/GameDetailCouponActivity;->createObserver$lambda$2$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method private final getMAdapter()Lcom/join/kotlin/discount/adapter/CouponGameDetailAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/GameDetailCouponActivity;->mAdapter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/discount/adapter/CouponGameDetailAdapter;

    return-object v0
.end method


# virtual methods
.method public createObserver()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;

    .line 2
    invoke-virtual {v0}, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;->getListData()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    new-instance v1, Lcom/join/kotlin/discount/GameDetailCouponActivity$createObserver$1$1;

    invoke-direct {v1, p0}, Lcom/join/kotlin/discount/GameDetailCouponActivity$createObserver$1$1;-><init>(Lcom/join/kotlin/discount/GameDetailCouponActivity;)V

    new-instance v2, Lcom/join/kotlin/discount/d;

    invoke-direct {v2, v1}, Lcom/join/kotlin/discount/d;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p0, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

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

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailCouponBinding;

    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;

    invoke-virtual {p1, v0}, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailCouponBinding;->h(Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;)V

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailCouponBinding;

    invoke-virtual {p1, p0}, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailCouponBinding;->g(Lcom/join/kotlin/discount/proxy/GameDetailCouponClickProxy;)V

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailCouponBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailCouponBinding;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    const-string v0, "mDatabind.clContainer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/join/kotlin/discount/GameDetailCouponActivity$initView$1;

    invoke-direct {v0, p0}, Lcom/join/kotlin/discount/GameDetailCouponActivity$initView$1;-><init>(Lcom/join/kotlin/discount/GameDetailCouponActivity;)V

    invoke-static {p1, v0}, Lcom/join/kotlin/base/ext/CustomViewExtKt;->loadServiceInit(Landroid/view/View;Lkotlin/jvm/functions/Function0;)Lcom/kingja/loadsir/core/b;

    move-result-object p1

    iput-object p1, p0, Lcom/join/kotlin/discount/GameDetailCouponActivity;->loadSir:Lcom/kingja/loadsir/core/b;

    if-nez p1, :cond_0

    const-string p1, "loadSir"

    .line 4
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    invoke-static {p1}, Lcom/join/kotlin/base/ext/CustomViewExtKt;->showLoading(Lcom/kingja/loadsir/core/b;)V

    .line 5
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object p1

    check-cast p1, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "gameId"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;->setGameId(Ljava/lang/String;)V

    .line 6
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "gamePkg"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/join/kotlin/discount/GameDetailCouponActivity;->pkg:Ljava/lang/String;

    .line 7
    invoke-direct {p0}, Lcom/join/kotlin/discount/GameDetailCouponActivity;->getMAdapter()Lcom/join/kotlin/discount/adapter/CouponGameDetailAdapter;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/join/kotlin/discount/adapter/CouponGameDetailAdapter;->setListClickProxy(Lcom/join/kotlin/discount/proxy/CouponListClickProxy;)V

    .line 8
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailCouponBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailCouponBinding;->d:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    .line 9
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v0, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 10
    invoke-direct {p0}, Lcom/join/kotlin/discount/GameDetailCouponActivity;->getMAdapter()Lcom/join/kotlin/discount/adapter/CouponGameDetailAdapter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 11
    new-instance v0, Lcom/join/kotlin/discount/GameDetailCouponActivity$initView$2$1;

    invoke-direct {v0, p1}, Lcom/join/kotlin/discount/GameDetailCouponActivity$initView$2$1;-><init>(Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    const/4 v0, 0x0

    .line 12
    invoke-virtual {p1, v0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->setLoadingMoreEnabled(Z)V

    .line 13
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailCouponBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailCouponBinding;->d:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    new-instance v0, Lcom/join/kotlin/discount/GameDetailCouponActivity$initView$3;

    invoke-direct {v0, p0}, Lcom/join/kotlin/discount/GameDetailCouponActivity$initView$3;-><init>(Lcom/join/kotlin/discount/GameDetailCouponActivity;)V

    invoke-virtual {p1, v0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->setLoadingListener(Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$LoadingListener;)V

    const/4 p1, 0x1

    .line 14
    invoke-virtual {p0, p1}, Lcom/join/kotlin/discount/GameDetailCouponActivity;->loadData(Z)V

    return-void
.end method

.method public final loadData(Z)V
    .locals 1

    if-eqz p1, :cond_1

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/GameDetailCouponActivity;->loadSir:Lcom/kingja/loadsir/core/b;

    if-nez v0, :cond_0

    const-string v0, "loadSir"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-static {v0}, Lcom/join/kotlin/base/ext/CustomViewExtKt;->showLoading(Lcom/kingja/loadsir/core/b;)V

    .line 2
    :cond_1
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;

    invoke-virtual {v0, p1}, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;->getCouponList(Z)V

    return-void
.end method

.method public onBackClick()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public onDetailClick(Lcom/join/kotlin/discount/model/bean/CouponItemBean;)V
    .locals 2
    .param p1    # Lcom/join/kotlin/discount/model/bean/CouponItemBean;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "itemBean"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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

.method public onReceiveClick(Lcom/join/kotlin/discount/model/bean/CouponItemBean;)V
    .locals 2
    .param p1    # Lcom/join/kotlin/discount/model/bean/CouponItemBean;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "itemBean"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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

.method public onUnSupportClick(Lcom/join/kotlin/discount/model/bean/CouponItemBean;)V
    .locals 1
    .param p1    # Lcom/join/kotlin/discount/model/bean/CouponItemBean;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "itemBean"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onUseClick(Lcom/join/kotlin/discount/model/bean/CouponItemBean;)V
    .locals 1
    .param p1    # Lcom/join/kotlin/discount/model/bean/CouponItemBean;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "itemBean"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public showUseTip(Lcom/join/kotlin/discount/model/bean/CouponUseTip;)V
    .locals 0
    .param p1    # Lcom/join/kotlin/discount/model/bean/CouponUseTip;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    return-void
.end method
