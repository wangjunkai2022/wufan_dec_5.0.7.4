.class public final Lcom/join/kotlin/quark/QuarkSearchResultActivity;
.super Lcom/join/kotlin/base/activity/BaseVmDbActivity;
.source "QuarkSearchResultActivity.kt"

# interfaces
.implements Lcom/join/kotlin/quark/proxy/QuarkSearchClickProxy;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/kotlin/base/activity/BaseVmDbActivity<",
        "Lcom/join/kotlin/quark/viewmodel/QuarkSearchViewModel;",
        "Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSearchResultBinding;",
        ">;",
        "Lcom/join/kotlin/quark/proxy/QuarkSearchClickProxy;"
    }
.end annotation


# instance fields
.field private final adapter$delegate:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private extBean:Lcom/join/mgps/dto/ExtBean;
    .annotation build Lorg/jetbrains/annotations/Nullable;
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


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;-><init>()V

    .line 2
    sget-object v0, Lcom/join/kotlin/quark/QuarkSearchResultActivity$adapter$2;->INSTANCE:Lcom/join/kotlin/quark/QuarkSearchResultActivity$adapter$2;

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/join/kotlin/quark/QuarkSearchResultActivity;->adapter$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$getLoadSir$p(Lcom/join/kotlin/quark/QuarkSearchResultActivity;)Lcom/kingja/loadsir/core/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/kotlin/quark/QuarkSearchResultActivity;->loadSir:Lcom/kingja/loadsir/core/b;

    return-object p0
.end method

.method private static final createObserver$lambda$9$lambda$8(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic f0(Lcom/join/kotlin/quark/QuarkSearchResultActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/join/kotlin/quark/QuarkSearchResultActivity;->initView$lambda$7$lambda$6$lambda$5$lambda$4(Lcom/join/kotlin/quark/QuarkSearchResultActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic g0(Lcom/join/kotlin/quark/QuarkSearchResultActivity;Landroid/content/Context;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/join/kotlin/quark/QuarkSearchResultActivity;->initView$lambda$7$lambda$6(Lcom/join/kotlin/quark/QuarkSearchResultActivity;Landroid/content/Context;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic h0(Lcom/join/kotlin/quark/adapter/SearchResultAdapter;Lcom/join/kotlin/quark/QuarkSearchResultActivity;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/join/kotlin/quark/QuarkSearchResultActivity;->initView$lambda$3$lambda$2(Lcom/join/kotlin/quark/adapter/SearchResultAdapter;Lcom/join/kotlin/quark/QuarkSearchResultActivity;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V

    return-void
.end method

.method public static synthetic i0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/join/kotlin/quark/QuarkSearchResultActivity;->createObserver$lambda$9$lambda$8(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method private static final initView$lambda$3$lambda$2(Lcom/join/kotlin/quark/adapter/SearchResultAdapter;Lcom/join/kotlin/quark/QuarkSearchResultActivity;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 1

    const-string v0, "$this_apply"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adapter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<anonymous parameter 1>"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance p3, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getContext()Landroid/content/Context;

    move-result-object p0

    const-class v0, Lcom/join/kotlin/quark/SourceShareDetailActivity;

    invoke-direct {p3, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 2
    invoke-virtual {p2, p4}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/io/Serializable;

    const-string p2, "itemBean"

    invoke-virtual {p3, p2, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    const-string p0, "qkPosition"

    const-string p2, "ss"

    .line 3
    invoke-virtual {p3, p0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 4
    invoke-virtual {p1, p3}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private static final initView$lambda$7$lambda$6(Lcom/join/kotlin/quark/QuarkSearchResultActivity;Landroid/content/Context;Landroid/view/View;)V
    .locals 0

    const-string/jumbo p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const p1, 0x7f0915f3

    .line 1
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_0

    .line 2
    new-instance p2, Lcom/join/kotlin/quark/f;

    invoke-direct {p2, p0}, Lcom/join/kotlin/quark/f;-><init>(Lcom/join/kotlin/quark/QuarkSearchResultActivity;)V

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    return-void
.end method

.method private static final initView$lambda$7$lambda$6$lambda$5$lambda$4(Lcom/join/kotlin/quark/QuarkSearchResultActivity;Landroid/view/View;)V
    .locals 2

    const-string/jumbo p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance p1, Landroid/content/Intent;

    .line 2
    const-class v0, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;

    .line 3
    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 4
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/quark/viewmodel/QuarkSearchViewModel;

    invoke-virtual {v0}, Lcom/join/kotlin/quark/viewmodel/QuarkSearchViewModel;->getKeyword()Ljava/lang/String;

    move-result-object v0

    const-string v1, "_keyword"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 5
    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method public createObserver()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/quark/viewmodel/QuarkSearchViewModel;

    .line 2
    invoke-virtual {v0}, Lcom/join/kotlin/quark/viewmodel/QuarkSearchViewModel;->getListData()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    new-instance v1, Lcom/join/kotlin/quark/QuarkSearchResultActivity$createObserver$1$1;

    invoke-direct {v1, p0}, Lcom/join/kotlin/quark/QuarkSearchResultActivity$createObserver$1$1;-><init>(Lcom/join/kotlin/quark/QuarkSearchResultActivity;)V

    new-instance v2, Lcom/join/kotlin/quark/g;

    invoke-direct {v2, v1}, Lcom/join/kotlin/quark/g;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p0, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    return-void
.end method

.method public final getAdapter()Lcom/join/kotlin/quark/adapter/SearchResultAdapter;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/quark/QuarkSearchResultActivity;->adapter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/quark/adapter/SearchResultAdapter;

    return-object v0
.end method

.method public final getExtBean()Lcom/join/mgps/dto/ExtBean;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/quark/QuarkSearchResultActivity;->extBean:Lcom/join/mgps/dto/ExtBean;

    return-object v0
.end method

.method public initView(Landroid/os/Bundle;)V
    .locals 8
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_3

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v2

    check-cast v2, Lcom/join/kotlin/quark/viewmodel/QuarkSearchViewModel;

    const-string v3, "_keyword"

    invoke-virtual {p1, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/join/kotlin/quark/viewmodel/QuarkSearchViewModel;->setKeyword(Ljava/lang/String;)V

    .line 3
    iget-object p1, p0, Lcom/join/kotlin/quark/QuarkSearchResultActivity;->extBean:Lcom/join/mgps/dto/ExtBean;

    if-eqz p1, :cond_0

    .line 4
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    .line 5
    sget-object v2, Lcom/papa/sim/statistic/Event;->visitPCPageZone:Lcom/papa/sim/statistic/Event;

    new-instance v3, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v3}, Lcom/papa/sim/statistic/Ext;-><init>()V

    iget-object v4, p0, Lcom/join/kotlin/quark/QuarkSearchResultActivity;->extBean:Lcom/join/mgps/dto/ExtBean;

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v4}, Lcom/join/mgps/dto/ExtBean;->getFrom()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/papa/sim/statistic/Ext;->setFrom(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v3

    invoke-virtual {p1, v2, v3}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object p1

    check-cast p1, Lcom/join/kotlin/quark/viewmodel/QuarkSearchViewModel;

    invoke-virtual {p1}, Lcom/join/kotlin/quark/viewmodel/QuarkSearchViewModel;->getKeyword()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-lez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-ne p1, v0, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_3

    .line 7
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object p1

    check-cast p1, Lcom/join/kotlin/quark/viewmodel/QuarkSearchViewModel;

    invoke-virtual {p1}, Lcom/join/kotlin/quark/viewmodel/QuarkSearchViewModel;->getTitle()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v3

    check-cast v3, Lcom/join/kotlin/quark/viewmodel/QuarkSearchViewModel;

    invoke-virtual {v3}, Lcom/join/kotlin/quark/viewmodel/QuarkSearchViewModel;->getKeyword()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "-\u8d44\u6e90\u5171\u4eab"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 8
    :cond_3
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSearchResultBinding;

    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v2

    check-cast v2, Lcom/join/kotlin/quark/viewmodel/QuarkSearchViewModel;

    invoke-virtual {p1, v2}, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSearchResultBinding;->h(Lcom/join/kotlin/quark/viewmodel/QuarkSearchViewModel;)V

    .line 9
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSearchResultBinding;

    invoke-virtual {p1, p0}, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSearchResultBinding;->g(Lcom/join/kotlin/quark/proxy/QuarkSearchClickProxy;)V

    .line 10
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSearchResultBinding;

    iget-object v2, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSearchResultBinding;->d:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    const-string p1, "mDatabind.xrvList"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v3, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0}, Lcom/join/kotlin/quark/QuarkSearchResultActivity;->getAdapter()Lcom/join/kotlin/quark/adapter/SearchResultAdapter;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, Lcom/join/kotlin/base/ext/CustomViewExtKt;->init$default(Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Landroidx/recyclerview/widget/RecyclerView$Adapter;ZILjava/lang/Object;)Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    move-result-object v2

    .line 11
    invoke-virtual {v2, v1}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->setPullRefreshEnabled(Z)V

    .line 12
    new-instance v1, Lcom/join/kotlin/quark/QuarkSearchResultActivity$initView$2$1;

    invoke-direct {v1, v2}, Lcom/join/kotlin/quark/QuarkSearchResultActivity$initView$2$1;-><init>(Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;)V

    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 13
    invoke-virtual {p0}, Lcom/join/kotlin/quark/QuarkSearchResultActivity;->getAdapter()Lcom/join/kotlin/quark/adapter/SearchResultAdapter;

    move-result-object v1

    .line 14
    new-instance v2, Lcom/join/kotlin/quark/h;

    invoke-direct {v2, v1, p0}, Lcom/join/kotlin/quark/h;-><init>(Lcom/join/kotlin/quark/adapter/SearchResultAdapter;Lcom/join/kotlin/quark/QuarkSearchResultActivity;)V

    invoke-virtual {v1, v2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setOnItemClickListener(Lcom/chad/library/adapter/base/BaseQuickAdapter$d;)Lcom/chad/library/adapter/base/BaseQuickAdapter;

    .line 15
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v1

    check-cast v1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSearchResultBinding;

    iget-object v1, v1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSearchResultBinding;->d:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    new-instance v2, Lcom/join/kotlin/quark/QuarkSearchResultActivity$initView$4;

    invoke-direct {v2, p0}, Lcom/join/kotlin/quark/QuarkSearchResultActivity$initView$4;-><init>(Lcom/join/kotlin/quark/QuarkSearchResultActivity;)V

    invoke-virtual {v1, v2}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->setLoadingListener(Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$LoadingListener;)V

    .line 16
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v1

    check-cast v1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSearchResultBinding;

    iget-object v1, v1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSearchResultBinding;->d:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/join/kotlin/quark/QuarkSearchResultActivity$initView$5;

    invoke-direct {p1, p0}, Lcom/join/kotlin/quark/QuarkSearchResultActivity$initView$5;-><init>(Lcom/join/kotlin/quark/QuarkSearchResultActivity;)V

    invoke-static {v1, p1}, Lcom/join/kotlin/base/ext/CustomViewExtKt;->loadServiceInit(Landroid/view/View;Lkotlin/jvm/functions/Function0;)Lcom/kingja/loadsir/core/b;

    move-result-object p1

    iput-object p1, p0, Lcom/join/kotlin/quark/QuarkSearchResultActivity;->loadSir:Lcom/kingja/loadsir/core/b;

    const/4 v1, 0x0

    const-string v2, "loadSir"

    if-nez p1, :cond_4

    .line 17
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v1

    .line 18
    :cond_4
    const-class v3, Lcom/join/kotlin/quark/loadCallBack/EmptyQuarkSourceCallback;

    new-instance v4, Lcom/join/kotlin/quark/i;

    invoke-direct {v4, p0}, Lcom/join/kotlin/quark/i;-><init>(Lcom/join/kotlin/quark/QuarkSearchResultActivity;)V

    invoke-virtual {p1, v3, v4}, Lcom/kingja/loadsir/core/b;->f(Ljava/lang/Class;Lcom/kingja/loadsir/core/d;)Lcom/kingja/loadsir/core/b;

    .line 19
    iget-object p1, p0, Lcom/join/kotlin/quark/QuarkSearchResultActivity;->loadSir:Lcom/kingja/loadsir/core/b;

    if-nez p1, :cond_5

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    move-object v1, p1

    :goto_2
    invoke-static {v1}, Lcom/join/kotlin/base/ext/CustomViewExtKt;->showLoading(Lcom/kingja/loadsir/core/b;)V

    .line 20
    invoke-virtual {p0, v0}, Lcom/join/kotlin/quark/QuarkSearchResultActivity;->loadData(Z)V

    return-void
.end method

.method public final loadData(Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/quark/viewmodel/QuarkSearchViewModel;

    invoke-virtual {v0, p1}, Lcom/join/kotlin/quark/viewmodel/QuarkSearchViewModel;->getResourceSearch(Z)V

    return-void
.end method

.method public onBackClick()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method protected onResume()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/BaseAppCompatActivity;->onResume()V

    .line 2
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
    iput-object p1, p0, Lcom/join/kotlin/quark/QuarkSearchResultActivity;->extBean:Lcom/join/mgps/dto/ExtBean;

    return-void
.end method
