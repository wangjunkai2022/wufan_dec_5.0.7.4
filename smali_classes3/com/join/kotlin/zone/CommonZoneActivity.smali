.class public final Lcom/join/kotlin/zone/CommonZoneActivity;
.super Lcom/join/kotlin/base/activity/BaseVmDbActivity;
.source "CommonZoneActivity.kt"

# interfaces
.implements Lcom/join/kotlin/ui/notice/ClickProxy;
.implements Lcom/join/kotlin/domain/common/LoadBindClickProxy;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/kotlin/base/activity/BaseVmDbActivity<",
        "Lcom/join/kotlin/zone/viewmodel/CommonZoneViewModel;",
        "Lcom/join/android/app/mgsim/wufun/databinding/ActivityCommonZoneBinding;",
        ">;",
        "Lcom/join/kotlin/ui/notice/ClickProxy;",
        "Lcom/join/kotlin/domain/common/LoadBindClickProxy;"
    }
.end annotation


# instance fields
.field private final commonZoneAdapter$delegate:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private extBean:Lcom/join/mgps/dto/ExtBean;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private videoHelper:Lcom/join/android/app/component/video/g;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private zoneId:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;-><init>()V

    .line 2
    new-instance v0, Lcom/join/kotlin/zone/CommonZoneActivity$commonZoneAdapter$2;

    invoke-direct {v0, p0}, Lcom/join/kotlin/zone/CommonZoneActivity$commonZoneAdapter$2;-><init>(Lcom/join/kotlin/zone/CommonZoneActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/join/kotlin/zone/CommonZoneActivity;->commonZoneAdapter$delegate:Lkotlin/Lazy;

    const-string v0, "461506587"

    .line 3
    iput-object v0, p0, Lcom/join/kotlin/zone/CommonZoneActivity;->zoneId:Ljava/lang/String;

    return-void
.end method

.method private static final createObserver$lambda$6$lambda$5(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic f0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/join/kotlin/zone/CommonZoneActivity;->createObserver$lambda$6$lambda$5(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic g0(Lcom/join/kotlin/zone/CommonZoneActivity;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/join/kotlin/zone/CommonZoneActivity;->initView$lambda$3$lambda$2(Lcom/join/kotlin/zone/CommonZoneActivity;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V

    return-void
.end method

.method private static final initView$lambda$3$lambda$2(Lcom/join/kotlin/zone/CommonZoneActivity;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 2

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<anonymous parameter 1>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p1, p3}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;->getData()Ljava/lang/Object;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 3
    :goto_0
    instance-of p3, p2, Lcom/join/mgps/dto/CommonGameInfoBean;

    if-eqz p3, :cond_3

    const/4 p3, 0x1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 4
    invoke-virtual {p1}, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;->getViewType()I

    move-result p1

    if-ne p1, p3, :cond_1

    goto :goto_1

    :cond_1
    const/4 p3, 0x0

    :goto_1
    if-eqz p3, :cond_2

    .line 5
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    .line 6
    sget-object p3, Lcom/papa/sim/statistic/Event;->clickAD:Lcom/papa/sim/statistic/Event;

    new-instance v0, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v0}, Lcom/papa/sim/statistic/Ext;-><init>()V

    const-string v1, "1"

    invoke-virtual {v0, v1}, Lcom/papa/sim/statistic/Ext;->setFrom(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v0

    invoke-virtual {p1, p3, v0}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 7
    :cond_2
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p1

    .line 8
    check-cast p2, Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object p2

    invoke-virtual {p1, p0, p2}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final autoPlay()V
    .locals 6

    .line 1
    sget-object v0, Lkotlinx/coroutines/s1;->b:Lkotlinx/coroutines/s1;

    invoke-static {}, Lkotlinx/coroutines/d1;->c()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    new-instance v3, Lcom/join/kotlin/zone/CommonZoneActivity$autoPlay$1;

    const/4 v2, 0x0

    invoke-direct {v3, p0, v2}, Lcom/join/kotlin/zone/CommonZoneActivity$autoPlay$1;-><init>(Lcom/join/kotlin/zone/CommonZoneActivity;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/q0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/z1;

    return-void
.end method

.method public createObserver()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/zone/viewmodel/CommonZoneViewModel;

    .line 2
    invoke-virtual {v0}, Lcom/join/kotlin/zone/viewmodel/CommonZoneViewModel;->getZoneData()Landroidx/lifecycle/MutableLiveData;

    move-result-object v1

    new-instance v2, Lcom/join/kotlin/zone/CommonZoneActivity$createObserver$1$1;

    invoke-direct {v2, v0, p0}, Lcom/join/kotlin/zone/CommonZoneActivity$createObserver$1$1;-><init>(Lcom/join/kotlin/zone/viewmodel/CommonZoneViewModel;Lcom/join/kotlin/zone/CommonZoneActivity;)V

    new-instance v0, Lcom/join/kotlin/zone/a;

    invoke-direct {v0, v2}, Lcom/join/kotlin/zone/a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, p0, v0}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    return-void
.end method

.method public final getCommonZoneAdapter()Lcom/join/kotlin/zone/adapter/CommonZoneAdapter;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/zone/CommonZoneActivity;->commonZoneAdapter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/zone/adapter/CommonZoneAdapter;

    return-object v0
.end method

.method public final getExtBean()Lcom/join/mgps/dto/ExtBean;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/zone/CommonZoneActivity;->extBean:Lcom/join/mgps/dto/ExtBean;

    return-object v0
.end method

.method public final getVideoHelper()Lcom/join/android/app/component/video/g;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/zone/CommonZoneActivity;->videoHelper:Lcom/join/android/app/component/video/g;

    return-object v0
.end method

.method public final getZoneId()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/zone/CommonZoneActivity;->zoneId:Ljava/lang/String;

    return-object v0
.end method

.method public initView(Landroid/os/Bundle;)V
    .locals 6
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string v0, "extBean"

    .line 2
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.join.mgps.dto.ExtBean"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/join/mgps/dto/ExtBean;

    iput-object v0, p0, Lcom/join/kotlin/zone/CommonZoneActivity;->extBean:Lcom/join/mgps/dto/ExtBean;

    if-eqz v0, :cond_0

    .line 3
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    .line 4
    sget-object v1, Lcom/papa/sim/statistic/Event;->visitPCPageZone:Lcom/papa/sim/statistic/Event;

    new-instance v2, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v2}, Lcom/papa/sim/statistic/Ext;-><init>()V

    iget-object v3, p0, Lcom/join/kotlin/zone/CommonZoneActivity;->extBean:Lcom/join/mgps/dto/ExtBean;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lcom/join/mgps/dto/ExtBean;->getFrom()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/papa/sim/statistic/Ext;->setFrom(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    :cond_0
    const-string/jumbo v0, "zoneId"

    .line 5
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/join/kotlin/zone/CommonZoneActivity;->zoneId:Ljava/lang/String;

    .line 6
    :cond_1
    iget-object p1, p0, Lcom/join/kotlin/zone/CommonZoneActivity;->zoneId:Ljava/lang/String;

    invoke-static {p1}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 7
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    const-string/jumbo p1, "\u6570\u636e\u5f02\u5e38[zoneId==null]\uff0c\u8bf7\u91cd\u8bd5"

    .line 8
    invoke-static {p1}, Lcom/papa91/arc/ext/ToastManager;->show(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 9
    :cond_2
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object p1

    check-cast p1, Lcom/join/kotlin/zone/viewmodel/CommonZoneViewModel;

    iget-object v0, p0, Lcom/join/kotlin/zone/CommonZoneActivity;->zoneId:Ljava/lang/String;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Lcom/join/kotlin/zone/viewmodel/CommonZoneViewModel;->getGameZone(Ljava/lang/String;)V

    .line 10
    :goto_0
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityCommonZoneBinding;

    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/zone/viewmodel/CommonZoneViewModel;

    invoke-virtual {p1, v0}, Lcom/join/android/app/mgsim/wufun/databinding/ActivityCommonZoneBinding;->j(Lcom/join/kotlin/zone/viewmodel/CommonZoneViewModel;)V

    .line 11
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityCommonZoneBinding;

    invoke-virtual {p1, p0}, Lcom/join/android/app/mgsim/wufun/databinding/ActivityCommonZoneBinding;->i(Lcom/join/kotlin/domain/common/LoadBindClickProxy;)V

    .line 12
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityCommonZoneBinding;

    invoke-virtual {p1, p0}, Lcom/join/android/app/mgsim/wufun/databinding/ActivityCommonZoneBinding;->h(Lcom/join/kotlin/ui/notice/ClickProxy;)V

    .line 13
    new-instance p1, Lcom/join/android/app/component/video/g;

    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityCommonZoneBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityCommonZoneBinding;->d:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    const-string v1, "CommonZoneActivityVideoHelper"

    invoke-direct {p1, v0, v1}, Lcom/join/android/app/component/video/g;-><init>(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/join/kotlin/zone/CommonZoneActivity;->videoHelper:Lcom/join/android/app/component/video/g;

    .line 14
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityCommonZoneBinding;

    iget-object v0, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityCommonZoneBinding;->d:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    const-string p1, "mDatabind.xrvList"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager;

    const/4 p1, 0x2

    invoke-direct {v1, p0, p1}, Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p0}, Lcom/join/kotlin/zone/CommonZoneActivity;->getCommonZoneAdapter()Lcom/join/kotlin/zone/adapter/CommonZoneAdapter;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/join/kotlin/base/ext/CustomViewExtKt;->init$default(Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Landroidx/recyclerview/widget/RecyclerView$Adapter;ZILjava/lang/Object;)Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    move-result-object p1

    const/4 v0, 0x0

    .line 15
    invoke-virtual {p1, v0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->setPullRefreshEnabled(Z)V

    .line 16
    invoke-virtual {p1, v0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->setLoadingMoreEnabled(Z)V

    .line 17
    new-instance v0, Lcom/join/kotlin/zone/CommonZoneActivity$initView$2$1;

    invoke-direct {v0, p0, p1}, Lcom/join/kotlin/zone/CommonZoneActivity$initView$2$1;-><init>(Lcom/join/kotlin/zone/CommonZoneActivity;Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 18
    invoke-virtual {p0}, Lcom/join/kotlin/zone/CommonZoneActivity;->getCommonZoneAdapter()Lcom/join/kotlin/zone/adapter/CommonZoneAdapter;

    move-result-object p1

    .line 19
    new-instance v0, Lcom/join/kotlin/zone/b;

    invoke-direct {v0, p0}, Lcom/join/kotlin/zone/b;-><init>(Lcom/join/kotlin/zone/CommonZoneActivity;)V

    invoke-virtual {p1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setOnItemClickListener(Lcom/chad/library/adapter/base/BaseQuickAdapter$d;)Lcom/chad/library/adapter/base/BaseQuickAdapter;

    .line 20
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityCommonZoneBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityCommonZoneBinding;->d:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    new-instance v0, Lcom/join/kotlin/zone/CommonZoneActivity$initView$4;

    invoke-direct {v0, p0}, Lcom/join/kotlin/zone/CommonZoneActivity$initView$4;-><init>(Lcom/join/kotlin/zone/CommonZoneActivity;)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V

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
    iget-object v0, p0, Lcom/join/kotlin/zone/CommonZoneActivity;->zoneId:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/zone/viewmodel/CommonZoneViewModel;

    iget-object v1, p0, Lcom/join/kotlin/zone/CommonZoneActivity;->zoneId:Ljava/lang/String;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lcom/join/kotlin/zone/viewmodel/CommonZoneViewModel;->getGameZone(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onClickSetNetWork()V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/UtilsMy;->w3(Landroid/content/Context;)V

    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/zone/CommonZoneActivity;->videoHelper:Lcom/join/android/app/component/video/g;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/android/app/component/video/g;->t()V

    .line 2
    :cond_0
    invoke-super {p0}, Lcom/join/kotlin/base/activity/BaseDownloadActivity;->onDestroy()V

    return-void
.end method

.method public onDownloadStatusChanged(Lcom/join/mgps/event/n;)V
    .locals 1
    .param p1    # Lcom/join/mgps/event/n;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-super {p0, p1}, Lcom/join/kotlin/base/activity/BaseDownloadActivity;->onDownloadStatusChanged(Lcom/join/mgps/event/n;)V

    return-void
.end method

.method protected onPause()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/zone/CommonZoneActivity;->videoHelper:Lcom/join/android/app/component/video/g;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/android/app/component/video/g;->u()V

    .line 2
    :cond_0
    invoke-super {p0}, Lcom/BaseAppCompatActivity;->onPause()V

    return-void
.end method

.method protected onResume()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/zone/CommonZoneActivity;->videoHelper:Lcom/join/android/app/component/video/g;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/android/app/component/video/g;->A()V

    .line 2
    :cond_0
    invoke-super {p0}, Lcom/BaseAppCompatActivity;->onResume()V

    .line 3
    invoke-static {p0}, Lcom/join/mgps/Util/UtilsMy;->q4(Landroid/content/Context;)V

    return-void
.end method

.method public final setExtBean(Lcom/join/mgps/dto/ExtBean;)V
    .locals 0
    .param p1    # Lcom/join/mgps/dto/ExtBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/zone/CommonZoneActivity;->extBean:Lcom/join/mgps/dto/ExtBean;

    return-void
.end method

.method public final setVideoHelper(Lcom/join/android/app/component/video/g;)V
    .locals 0
    .param p1    # Lcom/join/android/app/component/video/g;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/zone/CommonZoneActivity;->videoHelper:Lcom/join/android/app/component/video/g;

    return-void
.end method

.method public final setZoneId(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/zone/CommonZoneActivity;->zoneId:Ljava/lang/String;

    return-void
.end method
