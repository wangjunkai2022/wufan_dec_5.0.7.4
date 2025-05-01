.class public final Lcom/join/kotlin/ui/notice/NoticeListActivity;
.super Lcom/BaseAppCompatActivity;
.source "NoticeListActivity.kt"

# interfaces
.implements Lcom/join/kotlin/ui/notice/ClickProxy;
.implements Lcom/join/kotlin/domain/common/LoadBindClickProxy;


# instance fields
.field private page:I

.field public viewModle:Lcom/join/kotlin/ui/notice/NoticeViewModle;

.field private viewdataBinding:Lcom/join/android/app/mgsim/wufun/databinding/ActivityNoticelistActivityBinding;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/BaseAppCompatActivity;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcom/join/kotlin/ui/notice/NoticeListActivity;->page:I

    return-void
.end method

.method public static synthetic f0(Lcom/join/kotlin/ui/notice/NoticeListActivity;Ljava/util/ArrayList;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/join/kotlin/ui/notice/NoticeListActivity;->onCreate$lambda$0(Lcom/join/kotlin/ui/notice/NoticeListActivity;Ljava/util/ArrayList;)V

    return-void
.end method

.method public static synthetic g0(Lcom/join/kotlin/ui/notice/NoticeListActivity;Lcom/join/mgps/dto/ResponseModel;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/join/kotlin/ui/notice/NoticeListActivity;->onCreate$lambda$1(Lcom/join/kotlin/ui/notice/NoticeListActivity;Lcom/join/mgps/dto/ResponseModel;)V

    return-void
.end method

.method private static final onCreate$lambda$0(Lcom/join/kotlin/ui/notice/NoticeListActivity;Ljava/util/ArrayList;)V
    .locals 0

    const-string/jumbo p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object p0, p0, Lcom/join/kotlin/ui/notice/NoticeListActivity;->viewdataBinding:Lcom/join/android/app/mgsim/wufun/databinding/ActivityNoticelistActivityBinding;

    if-eqz p0, :cond_0

    iget-object p0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityNoticelistActivityBinding;->c:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method private static final onCreate$lambda$1(Lcom/join/kotlin/ui/notice/NoticeListActivity;Lcom/join/mgps/dto/ResponseModel;)V
    .locals 4

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result v2

    const/16 v3, 0xc8

    if-ne v2, v3, :cond_0

    const/4 v0, 0x1

    :cond_0
    if-eqz v0, :cond_3

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/ui/coupon/NoticeListData;

    .line 3
    iget v2, p0, Lcom/join/kotlin/ui/notice/NoticeListActivity;->page:I

    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getPage()I

    move-result p1

    if-ne v2, p1, :cond_1

    iget p1, p0, Lcom/join/kotlin/ui/notice/NoticeListActivity;->page:I

    add-int/2addr p1, v1

    iput p1, p0, Lcom/join/kotlin/ui/notice/NoticeListActivity;->page:I

    .line 4
    :cond_1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/notice/NoticeListActivity;->getViewModle()Lcom/join/kotlin/ui/notice/NoticeViewModle;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/notice/NoticeViewModle;->getNoticeDats()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    if-eqz p1, :cond_2

    invoke-virtual {v0}, Lcom/join/kotlin/ui/coupon/NoticeListData;->getGame_announcement_dto_list()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 5
    :cond_2
    iget-object p1, p0, Lcom/join/kotlin/ui/notice/NoticeListActivity;->viewdataBinding:Lcom/join/android/app/mgsim/wufun/databinding/ActivityNoticelistActivityBinding;

    if-eqz p1, :cond_4

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityNoticelistActivityBinding;->c:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->loadMoreComplete()V

    goto :goto_0

    .line 6
    :cond_3
    iget-object p1, p0, Lcom/join/kotlin/ui/notice/NoticeListActivity;->viewdataBinding:Lcom/join/android/app/mgsim/wufun/databinding/ActivityNoticelistActivityBinding;

    if-eqz p1, :cond_4

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityNoticelistActivityBinding;->c:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setNoMore()V

    .line 7
    :cond_4
    :goto_0
    iget-object p1, p0, Lcom/join/kotlin/ui/notice/NoticeListActivity;->viewdataBinding:Lcom/join/android/app/mgsim/wufun/databinding/ActivityNoticelistActivityBinding;

    if-eqz p1, :cond_5

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityNoticelistActivityBinding;->c:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 8
    :cond_5
    invoke-virtual {p0}, Lcom/join/kotlin/ui/notice/NoticeListActivity;->getViewModle()Lcom/join/kotlin/ui/notice/NoticeViewModle;

    move-result-object p0

    invoke-virtual {p0, v1}, Lcom/join/kotlin/ui/notice/NoticeViewModle;->updateShowLoadUI(Z)V

    return-void
.end method


# virtual methods
.method public final getPage()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/kotlin/ui/notice/NoticeListActivity;->page:I

    return v0
.end method

.method public final getViewModle()Lcom/join/kotlin/ui/notice/NoticeViewModle;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/notice/NoticeListActivity;->viewModle:Lcom/join/kotlin/ui/notice/NoticeViewModle;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string/jumbo v0, "viewModle"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getViewdataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ActivityNoticelistActivityBinding;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/notice/NoticeListActivity;->viewdataBinding:Lcom/join/android/app/mgsim/wufun/databinding/ActivityNoticelistActivityBinding;

    return-object v0
.end method

.method public final loadData(I)V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v0}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 2
    invoke-virtual {v0, p0}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 3
    new-instance v1, Lcom/join/mgps/dto/RequestGameIdArgs;

    invoke-direct {v1}, Lcom/join/mgps/dto/RequestGameIdArgs;-><init>()V

    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    const-string v3, "gameId"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/RequestGameIdArgs;->setGameId(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v1, p1}, Lcom/join/mgps/dto/RequestGameIdArgs;->setPage(I)V

    .line 6
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result p1

    invoke-virtual {v1, p1}, Lcom/join/mgps/dto/RequestGameIdArgs;->setUid(I)V

    .line 7
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 8
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 9
    invoke-virtual {p0}, Lcom/join/kotlin/ui/notice/NoticeListActivity;->getViewModle()Lcom/join/kotlin/ui/notice/NoticeViewModle;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/notice/NoticeViewModle;->getRequest()Lcom/join/kotlin/ui/notice/NoticeRequest;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/join/kotlin/ui/notice/NoticeRequest;->getNoticeData(Lcom/join/mgps/dto/RequestModel;)V

    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/join/kotlin/ui/notice/NoticeListActivity;->getViewModle()Lcom/join/kotlin/ui/notice/NoticeViewModle;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/join/kotlin/ui/notice/NoticeViewModle;->updateShowLoadUI(Z)V

    :goto_0
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

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/mgps/dto/BTActivityBean;->getJump_url()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Lcom/join/mgps/Util/IntentUtil;->goShareWebActivity(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public onClickReload()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/notice/NoticeListActivity;->getViewModle()Lcom/join/kotlin/ui/notice/NoticeViewModle;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/kotlin/ui/notice/NoticeViewModle;->getLoadDataBinding()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    new-instance v1, Lcom/join/kotlin/domain/common/LoadBindindData;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lcom/join/kotlin/domain/common/LoadBindindData;-><init>(I)V

    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 2
    iget v0, p0, Lcom/join/kotlin/ui/notice/NoticeListActivity;->page:I

    invoke-virtual {p0, v0}, Lcom/join/kotlin/ui/notice/NoticeListActivity;->loadData(I)V

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

    const p1, 0x7f0c007a

    .line 2
    invoke-static {p0, p1}, Landroidx/databinding/DataBindingUtil;->setContentView(Landroid/app/Activity;I)Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityNoticelistActivityBinding;

    iput-object p1, p0, Lcom/join/kotlin/ui/notice/NoticeListActivity;->viewdataBinding:Lcom/join/android/app/mgsim/wufun/databinding/ActivityNoticelistActivityBinding;

    .line 3
    new-instance p1, Landroidx/lifecycle/ViewModelProvider;

    new-instance v0, Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;

    invoke-direct {v0}, Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;-><init>()V

    invoke-direct {p1, p0, v0}, Landroidx/lifecycle/ViewModelProvider;-><init>(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/ViewModelProvider$Factory;)V

    const-class v0, Lcom/join/kotlin/ui/notice/NoticeViewModle;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    move-result-object p1

    check-cast p1, Lcom/join/kotlin/ui/notice/NoticeViewModle;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/ui/notice/NoticeListActivity;->setViewModle(Lcom/join/kotlin/ui/notice/NoticeViewModle;)V

    .line 4
    iget-object p1, p0, Lcom/join/kotlin/ui/notice/NoticeListActivity;->viewdataBinding:Lcom/join/android/app/mgsim/wufun/databinding/ActivityNoticelistActivityBinding;

    if-eqz p1, :cond_0

    const/16 v0, 0x24

    invoke-virtual {p0}, Lcom/join/kotlin/ui/notice/NoticeListActivity;->getViewModle()Lcom/join/kotlin/ui/notice/NoticeViewModle;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/join/kotlin/ui/notice/NoticeListActivity;->viewdataBinding:Lcom/join/android/app/mgsim/wufun/databinding/ActivityNoticelistActivityBinding;

    if-eqz p1, :cond_1

    const/4 v0, 0x7

    invoke-virtual {p1, v0, p0}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 6
    :cond_1
    iget-object p1, p0, Lcom/join/kotlin/ui/notice/NoticeListActivity;->viewdataBinding:Lcom/join/android/app/mgsim/wufun/databinding/ActivityNoticelistActivityBinding;

    if-eqz p1, :cond_2

    const/16 v0, 0x15

    invoke-virtual {p1, v0, p0}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 7
    :cond_2
    iget-object p1, p0, Lcom/join/kotlin/ui/notice/NoticeListActivity;->viewdataBinding:Lcom/join/android/app/mgsim/wufun/databinding/ActivityNoticelistActivityBinding;

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {p1, p0}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 8
    :goto_0
    new-instance p1, Lcom/join/kotlin/ui/notice/NoticeListAdapter;

    invoke-direct {p1, p0, p0}, Lcom/join/kotlin/ui/notice/NoticeListAdapter;-><init>(Landroid/content/Context;Lcom/join/kotlin/ui/notice/ClickProxy;)V

    .line 9
    invoke-virtual {p0}, Lcom/join/kotlin/ui/notice/NoticeListActivity;->getViewModle()Lcom/join/kotlin/ui/notice/NoticeViewModle;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/kotlin/ui/notice/NoticeViewModle;->getNoticeDats()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    new-instance v1, Lcom/join/kotlin/ui/notice/b;

    invoke-direct {v1, p0}, Lcom/join/kotlin/ui/notice/b;-><init>(Lcom/join/kotlin/ui/notice/NoticeListActivity;)V

    invoke-virtual {v0, p0, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 10
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    iget-object v1, p0, Lcom/join/kotlin/ui/notice/NoticeListActivity;->viewdataBinding:Lcom/join/android/app/mgsim/wufun/databinding/ActivityNoticelistActivityBinding;

    if-eqz v1, :cond_4

    iget-object v1, v1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityNoticelistActivityBinding;->c:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    goto :goto_1

    :cond_4
    const/4 v1, 0x0

    :goto_1
    if-nez v1, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {v1, p1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 12
    :goto_2
    iget-object v1, p0, Lcom/join/kotlin/ui/notice/NoticeListActivity;->viewdataBinding:Lcom/join/android/app/mgsim/wufun/databinding/ActivityNoticelistActivityBinding;

    if-eqz v1, :cond_6

    iget-object v1, v1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityNoticelistActivityBinding;->c:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    if-eqz v1, :cond_6

    new-instance v2, Lcom/join/kotlin/ui/notice/NoticeListActivity$onCreate$2;

    invoke-direct {v2, p0}, Lcom/join/kotlin/ui/notice/NoticeListActivity$onCreate$2;-><init>(Lcom/join/kotlin/ui/notice/NoticeListActivity;)V

    invoke-virtual {v1, v2}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setLoadingListener(Lcom/join/android/app/component/xrecyclerview/XRecyclerView$f;)V

    .line 13
    :cond_6
    invoke-virtual {p0}, Lcom/join/kotlin/ui/notice/NoticeListActivity;->getViewModle()Lcom/join/kotlin/ui/notice/NoticeViewModle;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/kotlin/ui/notice/NoticeViewModle;->getNoticeDats()Landroidx/lifecycle/MutableLiveData;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 14
    invoke-virtual {p0}, Lcom/join/kotlin/ui/notice/NoticeListActivity;->getViewModle()Lcom/join/kotlin/ui/notice/NoticeViewModle;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/kotlin/ui/notice/NoticeViewModle;->getLoadDataBinding()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    new-instance v1, Lcom/join/kotlin/domain/common/LoadBindindData;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lcom/join/kotlin/domain/common/LoadBindindData;-><init>(I)V

    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 15
    iget v0, p0, Lcom/join/kotlin/ui/notice/NoticeListActivity;->page:I

    invoke-virtual {p0, v0}, Lcom/join/kotlin/ui/notice/NoticeListActivity;->loadData(I)V

    .line 16
    new-instance v0, Lcom/join/kotlin/ui/notice/NoticeListActivity$onCreate$3;

    invoke-direct {v0, p0}, Lcom/join/kotlin/ui/notice/NoticeListActivity$onCreate$3;-><init>(Lcom/join/kotlin/ui/notice/NoticeListActivity;)V

    invoke-virtual {p1, v0}, Lcom/join/kotlin/domain/adapter/BaseDataBindingAdapter;->setOnItemClickListener(Lcom/join/kotlin/domain/adapter/BaseDataBindingAdapter$OnItemClickListener;)V

    .line 17
    invoke-virtual {p0}, Lcom/join/kotlin/ui/notice/NoticeListActivity;->getViewModle()Lcom/join/kotlin/ui/notice/NoticeViewModle;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/notice/NoticeViewModle;->getRequest()Lcom/join/kotlin/ui/notice/NoticeRequest;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/notice/NoticeRequest;->getResultData()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    new-instance v0, Lcom/join/kotlin/ui/notice/a;

    invoke-direct {v0, p0}, Lcom/join/kotlin/ui/notice/a;-><init>(Lcom/join/kotlin/ui/notice/NoticeListActivity;)V

    invoke-virtual {p1, p0, v0}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    return-void
.end method

.method public final setPage(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/kotlin/ui/notice/NoticeListActivity;->page:I

    return-void
.end method

.method public final setViewModle(Lcom/join/kotlin/ui/notice/NoticeViewModle;)V
    .locals 1
    .param p1    # Lcom/join/kotlin/ui/notice/NoticeViewModle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/notice/NoticeListActivity;->viewModle:Lcom/join/kotlin/ui/notice/NoticeViewModle;

    return-void
.end method

.method public final setViewdataBinding(Lcom/join/android/app/mgsim/wufun/databinding/ActivityNoticelistActivityBinding;)V
    .locals 0
    .param p1    # Lcom/join/android/app/mgsim/wufun/databinding/ActivityNoticelistActivityBinding;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/notice/NoticeListActivity;->viewdataBinding:Lcom/join/android/app/mgsim/wufun/databinding/ActivityNoticelistActivityBinding;

    return-void
.end method
