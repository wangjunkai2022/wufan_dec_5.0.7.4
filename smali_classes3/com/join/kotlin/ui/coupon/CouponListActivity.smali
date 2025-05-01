.class public final Lcom/join/kotlin/ui/coupon/CouponListActivity;
.super Lcom/BaseAppCompatActivity;
.source "CouponListActivity.kt"

# interfaces
.implements Lcom/join/kotlin/ui/coupon/ClickProxy;
.implements Lcom/join/kotlin/domain/common/LoadBindClickProxy;


# instance fields
.field public couponViewModle:Lcom/join/kotlin/ui/coupon/CouponViewModle;

.field public datas:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/join/mgps/dto/BTGameCouponBean;",
            ">;"
        }
    .end annotation
.end field

.field private gameId:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public viewdataBinding:Lcom/join/android/app/mgsim/wufun/databinding/ActivityCouponlistActivityBinding;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/BaseAppCompatActivity;-><init>()V

    const-string v0, ""

    .line 2
    iput-object v0, p0, Lcom/join/kotlin/ui/coupon/CouponListActivity;->gameId:Ljava/lang/String;

    return-void
.end method

.method public static synthetic f0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/join/kotlin/ui/coupon/CouponListActivity;->onCreate$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic g0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/join/kotlin/ui/coupon/CouponListActivity;->onCreate$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic h0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/join/kotlin/ui/coupon/CouponListActivity;->onCreate$lambda$2(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method private static final onCreate$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final onCreate$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final onCreate$lambda$2(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final getCouponViewModle()Lcom/join/kotlin/ui/coupon/CouponViewModle;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/coupon/CouponListActivity;->couponViewModle:Lcom/join/kotlin/ui/coupon/CouponViewModle;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "couponViewModle"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getDatas()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/join/mgps/dto/BTGameCouponBean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/coupon/CouponListActivity;->datas:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "datas"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getGameId()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/coupon/CouponListActivity;->gameId:Ljava/lang/String;

    return-object v0
.end method

.method public final getViewdataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ActivityCouponlistActivityBinding;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/coupon/CouponListActivity;->viewdataBinding:Lcom/join/android/app/mgsim/wufun/databinding/ActivityCouponlistActivityBinding;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string/jumbo v0, "viewdataBinding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final loadData(I)V
    .locals 3

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/coupon/CouponListActivity;->getCouponViewModle()Lcom/join/kotlin/ui/coupon/CouponViewModle;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/coupon/CouponViewModle;->getLoadDataBinding()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    .line 2
    new-instance v0, Lcom/join/kotlin/domain/common/LoadBindindData;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lcom/join/kotlin/domain/common/LoadBindindData;-><init>(I)V

    .line 3
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 4
    :cond_0
    new-instance p1, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {p1}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 5
    invoke-virtual {p1, p0}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 6
    new-instance v0, Lcom/join/kotlin/ui/coupon/CouponRequest;

    invoke-direct {v0}, Lcom/join/kotlin/ui/coupon/CouponRequest;-><init>()V

    .line 7
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "gameId"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/join/kotlin/ui/coupon/CouponRequest;->gameId:Ljava/lang/String;

    .line 8
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/join/kotlin/ui/coupon/CouponRequest;->uid:Ljava/lang/String;

    .line 9
    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 10
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 11
    invoke-virtual {p0}, Lcom/join/kotlin/ui/coupon/CouponListActivity;->getCouponViewModle()Lcom/join/kotlin/ui/coupon/CouponViewModle;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/kotlin/ui/coupon/CouponViewModle;->getRequest()Lcom/join/kotlin/domain/request/CouponRequest;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/kotlin/domain/request/CouponRequest;->requestCouponListData(Lcom/join/mgps/dto/RequestModel;)V

    goto :goto_0

    .line 12
    :cond_1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/coupon/CouponListActivity;->getCouponViewModle()Lcom/join/kotlin/ui/coupon/CouponViewModle;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/join/kotlin/ui/coupon/CouponViewModle;->updateShowLoadUI(Z)V

    :goto_0
    return-void
.end method

.method public onClickBack()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public onClickGet(Lcom/join/mgps/dto/BTGameCouponBean;)V
    .locals 1
    .param p1    # Lcom/join/mgps/dto/BTGameCouponBean;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance p1, Lcom/join/mgps/dialog/b;

    const v0, 0x7f110191

    invoke-direct {p1, p0, v0}, Lcom/join/mgps/dialog/b;-><init>(Landroid/content/Context;I)V

    const/16 v0, 0x8

    .line 2
    invoke-virtual {p1, v0}, Lcom/join/mgps/dialog/b;->e(I)Lcom/join/mgps/dialog/b;

    move-result-object p1

    const-string/jumbo v0, "\u63d0\u793a"

    .line 3
    invoke-virtual {p1, v0}, Lcom/join/mgps/dialog/b;->k(Ljava/lang/String;)Lcom/join/mgps/dialog/b;

    move-result-object p1

    const-string/jumbo v0, "\u8bf7\u6fc0\u6d3b\u6e38\u620f\uff0c\u5728\u6e38\u620f\u5185\u9886\u53d6"

    .line 4
    invoke-virtual {p1, v0}, Lcom/join/mgps/dialog/b;->g(Ljava/lang/String;)Lcom/join/mgps/dialog/b;

    move-result-object p1

    const-string/jumbo v0, "\u77e5\u9053\u4e86"

    .line 5
    invoke-virtual {p1, v0}, Lcom/join/mgps/dialog/b;->j(Ljava/lang/String;)Lcom/join/mgps/dialog/b;

    move-result-object p1

    .line 6
    new-instance v0, Lcom/join/kotlin/ui/coupon/CouponListActivity$onClickGet$1;

    invoke-direct {v0}, Lcom/join/kotlin/ui/coupon/CouponListActivity$onClickGet$1;-><init>()V

    invoke-virtual {p1, v0}, Lcom/join/mgps/dialog/b;->i(Lcom/join/mgps/dialog/b$c;)Lcom/join/mgps/dialog/b;

    move-result-object p1

    .line 7
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method public onClickMore(Lcom/join/mgps/dto/BTGameCouponBean;)V
    .locals 1
    .param p1    # Lcom/join/mgps/dto/BTGameCouponBean;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/BTGameCouponBean;->isShowDetial()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/BTGameCouponBean;->setShowDetial(Z)V

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/ui/coupon/CouponListActivity;->getViewdataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ActivityCouponlistActivityBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityCouponlistActivityBinding;->c:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method public onClickReload()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Lcom/join/kotlin/ui/coupon/CouponListActivity;->loadData(I)V

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
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c0030

    .line 2
    invoke-static {p0, p1}, Landroidx/databinding/DataBindingUtil;->setContentView(Landroid/app/Activity;I)Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    const-string v0, "setContentView<ActivityC\u2026onlist_activity\n        )"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityCouponlistActivityBinding;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/ui/coupon/CouponListActivity;->setViewdataBinding(Lcom/join/android/app/mgsim/wufun/databinding/ActivityCouponlistActivityBinding;)V

    .line 3
    new-instance p1, Landroidx/lifecycle/ViewModelProvider;

    .line 4
    new-instance v0, Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;

    invoke-direct {v0}, Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;-><init>()V

    .line 5
    invoke-direct {p1, p0, v0}, Landroidx/lifecycle/ViewModelProvider;-><init>(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/ViewModelProvider$Factory;)V

    const-class v0, Lcom/join/kotlin/ui/coupon/CouponViewModle;

    .line 6
    invoke-virtual {p1, v0}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    move-result-object p1

    check-cast p1, Lcom/join/kotlin/ui/coupon/CouponViewModle;

    .line 7
    invoke-virtual {p0, p1}, Lcom/join/kotlin/ui/coupon/CouponListActivity;->setCouponViewModle(Lcom/join/kotlin/ui/coupon/CouponViewModle;)V

    .line 8
    invoke-virtual {p0}, Lcom/join/kotlin/ui/coupon/CouponListActivity;->getViewdataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ActivityCouponlistActivityBinding;

    move-result-object p1

    invoke-virtual {p0}, Lcom/join/kotlin/ui/coupon/CouponListActivity;->getCouponViewModle()Lcom/join/kotlin/ui/coupon/CouponViewModle;

    move-result-object v0

    const/16 v1, 0x24

    invoke-virtual {p1, v1, v0}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 9
    invoke-virtual {p0}, Lcom/join/kotlin/ui/coupon/CouponListActivity;->getViewdataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ActivityCouponlistActivityBinding;

    move-result-object p1

    const/4 v0, 0x7

    invoke-virtual {p1, v0, p0}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 10
    invoke-virtual {p0}, Lcom/join/kotlin/ui/coupon/CouponListActivity;->getViewdataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ActivityCouponlistActivityBinding;

    move-result-object p1

    new-instance v0, Lcom/join/kotlin/ui/coupon/CouponAdapterv2;

    invoke-direct {v0, p0, p0}, Lcom/join/kotlin/ui/coupon/CouponAdapterv2;-><init>(Landroid/content/Context;Lcom/join/kotlin/ui/coupon/ClickProxy;)V

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 11
    invoke-virtual {p0}, Lcom/join/kotlin/ui/coupon/CouponListActivity;->getViewdataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ActivityCouponlistActivityBinding;

    move-result-object p1

    if-eqz p1, :cond_0

    const/16 v0, 0x15

    invoke-virtual {p1, v0, p0}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/join/kotlin/ui/coupon/CouponListActivity;->getViewdataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ActivityCouponlistActivityBinding;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 13
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "gameId"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    const-string p1, ""

    :cond_1
    iput-object p1, p0, Lcom/join/kotlin/ui/coupon/CouponListActivity;->gameId:Ljava/lang/String;

    .line 14
    invoke-virtual {p0}, Lcom/join/kotlin/ui/coupon/CouponListActivity;->getCouponViewModle()Lcom/join/kotlin/ui/coupon/CouponViewModle;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/coupon/CouponViewModle;->getDatas()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    new-instance v0, Lcom/join/kotlin/ui/coupon/CouponListActivity$onCreate$1;

    invoke-direct {v0, p0}, Lcom/join/kotlin/ui/coupon/CouponListActivity$onCreate$1;-><init>(Lcom/join/kotlin/ui/coupon/CouponListActivity;)V

    .line 15
    new-instance v2, Lcom/join/kotlin/ui/coupon/a;

    invoke-direct {v2, v0}, Lcom/join/kotlin/ui/coupon/a;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 16
    invoke-virtual {p1, p0, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 17
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, p1}, Lcom/join/kotlin/ui/coupon/CouponListActivity;->setDatas(Ljava/util/ArrayList;)V

    .line 18
    invoke-virtual {p0}, Lcom/join/kotlin/ui/coupon/CouponListActivity;->getCouponViewModle()Lcom/join/kotlin/ui/coupon/CouponViewModle;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/coupon/CouponViewModle;->getDatas()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    invoke-virtual {p0}, Lcom/join/kotlin/ui/coupon/CouponListActivity;->getDatas()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 19
    invoke-virtual {p0}, Lcom/join/kotlin/ui/coupon/CouponListActivity;->getCouponViewModle()Lcom/join/kotlin/ui/coupon/CouponViewModle;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/coupon/CouponViewModle;->getRequest()Lcom/join/kotlin/domain/request/CouponRequest;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/domain/request/CouponRequest;->getResultData()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    new-instance v0, Lcom/join/kotlin/ui/coupon/CouponListActivity$onCreate$2;

    invoke-direct {v0, p0}, Lcom/join/kotlin/ui/coupon/CouponListActivity$onCreate$2;-><init>(Lcom/join/kotlin/ui/coupon/CouponListActivity;)V

    new-instance v2, Lcom/join/kotlin/ui/coupon/b;

    invoke-direct {v2, v0}, Lcom/join/kotlin/ui/coupon/b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p0, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 20
    invoke-virtual {p0}, Lcom/join/kotlin/ui/coupon/CouponListActivity;->getCouponViewModle()Lcom/join/kotlin/ui/coupon/CouponViewModle;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/coupon/CouponViewModle;->getRequest()Lcom/join/kotlin/domain/request/CouponRequest;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/domain/request/CouponRequest;->getResultCouponListData()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    new-instance v0, Lcom/join/kotlin/ui/coupon/CouponListActivity$onCreate$3;

    invoke-direct {v0, p0}, Lcom/join/kotlin/ui/coupon/CouponListActivity$onCreate$3;-><init>(Lcom/join/kotlin/ui/coupon/CouponListActivity;)V

    new-instance v2, Lcom/join/kotlin/ui/coupon/c;

    invoke-direct {v2, v0}, Lcom/join/kotlin/ui/coupon/c;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p0, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 21
    invoke-virtual {p0, v1}, Lcom/join/kotlin/ui/coupon/CouponListActivity;->loadData(I)V

    return-void
.end method

.method public final setCouponViewModle(Lcom/join/kotlin/ui/coupon/CouponViewModle;)V
    .locals 1
    .param p1    # Lcom/join/kotlin/ui/coupon/CouponViewModle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/coupon/CouponListActivity;->couponViewModle:Lcom/join/kotlin/ui/coupon/CouponViewModle;

    return-void
.end method

.method public final setDatas(Ljava/util/ArrayList;)V
    .locals 1
    .param p1    # Ljava/util/ArrayList;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/join/mgps/dto/BTGameCouponBean;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/coupon/CouponListActivity;->datas:Ljava/util/ArrayList;

    return-void
.end method

.method public final setGameId(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/coupon/CouponListActivity;->gameId:Ljava/lang/String;

    return-void
.end method

.method public final setViewdataBinding(Lcom/join/android/app/mgsim/wufun/databinding/ActivityCouponlistActivityBinding;)V
    .locals 1
    .param p1    # Lcom/join/android/app/mgsim/wufun/databinding/ActivityCouponlistActivityBinding;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/coupon/CouponListActivity;->viewdataBinding:Lcom/join/android/app/mgsim/wufun/databinding/ActivityCouponlistActivityBinding;

    return-void
.end method
