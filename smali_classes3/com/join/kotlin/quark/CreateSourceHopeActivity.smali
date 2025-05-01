.class public final Lcom/join/kotlin/quark/CreateSourceHopeActivity;
.super Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity;
.source "CreateSourceHopeActivity.kt"

# interfaces
.implements Lcom/join/kotlin/quark/proxy/CreateSourceHopeClickProxy;
.implements Lcom/join/kotlin/quark/proxy/SourceHopeItemClickProxy;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity<",
        "Lcom/join/kotlin/quark/viewmodel/CreateSourceHopeViewModel;",
        "Lcom/join/android/app/mgsim/wufun/databinding/ActivityCreateSourceHopeBinding;",
        ">;",
        "Lcom/join/kotlin/quark/proxy/CreateSourceHopeClickProxy;",
        "Lcom/join/kotlin/quark/proxy/SourceHopeItemClickProxy;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCreateSourceHopeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateSourceHopeActivity.kt\ncom/join/kotlin/quark/CreateSourceHopeActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,277:1\n1864#2,3:278\n*S KotlinDebug\n*F\n+ 1 CreateSourceHopeActivity.kt\ncom/join/kotlin/quark/CreateSourceHopeActivity\n*L\n90#1:278,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCreateSourceHopeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateSourceHopeActivity.kt\ncom/join/kotlin/quark/CreateSourceHopeActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,277:1\n1864#2,3:278\n*S KotlinDebug\n*F\n+ 1 CreateSourceHopeActivity.kt\ncom/join/kotlin/quark/CreateSourceHopeActivity\n*L\n90#1:278,3\n*E\n"
    }
.end annotation


# instance fields
.field private final adapter$delegate:Lkotlin/Lazy;
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

.field private final tagAdapter$delegate:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity;-><init>()V

    .line 2
    sget-object v0, Lcom/join/kotlin/quark/CreateSourceHopeActivity$tagAdapter$2;->INSTANCE:Lcom/join/kotlin/quark/CreateSourceHopeActivity$tagAdapter$2;

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/join/kotlin/quark/CreateSourceHopeActivity;->tagAdapter$delegate:Lkotlin/Lazy;

    .line 3
    sget-object v0, Lcom/join/kotlin/quark/CreateSourceHopeActivity$adapter$2;->INSTANCE:Lcom/join/kotlin/quark/CreateSourceHopeActivity$adapter$2;

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/join/kotlin/quark/CreateSourceHopeActivity;->adapter$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$getLoadSir$p(Lcom/join/kotlin/quark/CreateSourceHopeActivity;)Lcom/kingja/loadsir/core/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/kotlin/quark/CreateSourceHopeActivity;->loadSir:Lcom/kingja/loadsir/core/b;

    return-object p0
.end method

.method public static final synthetic access$getTagAdapter(Lcom/join/kotlin/quark/CreateSourceHopeActivity;)Lcom/join/kotlin/quark/adapter/SourceHopeTagAdapter;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/kotlin/quark/CreateSourceHopeActivity;->getTagAdapter()Lcom/join/kotlin/quark/adapter/SourceHopeTagAdapter;

    move-result-object p0

    return-object p0
.end method

.method private static final createObserver$lambda$11$lambda$10(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final createObserver$lambda$11$lambda$8(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final createObserver$lambda$11$lambda$9(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic f0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/join/kotlin/quark/CreateSourceHopeActivity;->createObserver$lambda$11$lambda$8(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic g0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/join/kotlin/quark/CreateSourceHopeActivity;->createObserver$lambda$11$lambda$10(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method private final getTagAdapter()Lcom/join/kotlin/quark/adapter/SourceHopeTagAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/quark/CreateSourceHopeActivity;->tagAdapter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/quark/adapter/SourceHopeTagAdapter;

    return-object v0
.end method

.method public static synthetic h0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/join/kotlin/quark/CreateSourceHopeActivity;->createObserver$lambda$11$lambda$9(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic i0(Lcom/join/kotlin/quark/CreateSourceHopeActivity;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/join/kotlin/quark/CreateSourceHopeActivity;->initView$lambda$4$lambda$3(Lcom/join/kotlin/quark/CreateSourceHopeActivity;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V

    return-void
.end method

.method private static final initView$lambda$4$lambda$3(Lcom/join/kotlin/quark/CreateSourceHopeActivity;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 4

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p1, "view"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Lcom/join/kotlin/quark/CreateSourceHopeActivity;->getTagAdapter()Lcom/join/kotlin/quark/adapter/SourceHopeTagAdapter;

    move-result-object p1

    invoke-virtual {p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItems()Ljava/util/List;

    move-result-object p1

    .line 2
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p2, 0x0

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v2, v0, 0x1

    if-gez v0, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_0
    check-cast v1, Lcom/join/kotlin/quark/model/bean/SourceTabItemBean;

    if-nez v1, :cond_1

    goto :goto_2

    :cond_1
    if-ne p3, v0, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    .line 3
    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/join/kotlin/quark/model/bean/SourceTabItemBean;->setActive(Ljava/lang/Boolean;)V

    :goto_2
    if-eqz v1, :cond_3

    .line 4
    invoke-virtual {v1}, Lcom/join/kotlin/quark/model/bean/SourceTabItemBean;->getActive()Ljava/lang/Boolean;

    move-result-object v0

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    :goto_3
    if-eqz v0, :cond_4

    .line 5
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDialogActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/quark/viewmodel/CreateSourceHopeViewModel;

    invoke-virtual {v0, v1}, Lcom/join/kotlin/quark/viewmodel/CreateSourceHopeViewModel;->setSelectTag(Lcom/join/kotlin/quark/model/bean/SourceTabItemBean;)V

    :cond_4
    move v0, v2

    goto :goto_0

    .line 6
    :cond_5
    invoke-direct {p0}, Lcom/join/kotlin/quark/CreateSourceHopeActivity;->getTagAdapter()Lcom/join/kotlin/quark/adapter/SourceHopeTagAdapter;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method

.method private static final initView$lambda$7$lambda$6(Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    const-string p2, "adapter"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p0, "view"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic j0(Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/join/kotlin/quark/CreateSourceHopeActivity;->initView$lambda$7$lambda$6(Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V

    return-void
.end method


# virtual methods
.method public createObserver()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDialogActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/quark/viewmodel/CreateSourceHopeViewModel;

    .line 2
    invoke-virtual {v0}, Lcom/join/kotlin/quark/viewmodel/CreateSourceHopeViewModel;->getHomeData()Landroidx/lifecycle/MutableLiveData;

    move-result-object v1

    new-instance v2, Lcom/join/kotlin/quark/CreateSourceHopeActivity$createObserver$1$1;

    invoke-direct {v2, p0}, Lcom/join/kotlin/quark/CreateSourceHopeActivity$createObserver$1$1;-><init>(Lcom/join/kotlin/quark/CreateSourceHopeActivity;)V

    new-instance v3, Lcom/join/kotlin/quark/a;

    invoke-direct {v3, v2}, Lcom/join/kotlin/quark/a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, p0, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 3
    invoke-virtual {v0}, Lcom/join/kotlin/quark/viewmodel/CreateSourceHopeViewModel;->getListData()Landroidx/lifecycle/MutableLiveData;

    move-result-object v1

    new-instance v2, Lcom/join/kotlin/quark/CreateSourceHopeActivity$createObserver$1$2;

    invoke-direct {v2, p0}, Lcom/join/kotlin/quark/CreateSourceHopeActivity$createObserver$1$2;-><init>(Lcom/join/kotlin/quark/CreateSourceHopeActivity;)V

    new-instance v3, Lcom/join/kotlin/quark/c;

    invoke-direct {v3, v2}, Lcom/join/kotlin/quark/c;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, p0, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 4
    invoke-virtual {v0}, Lcom/join/kotlin/quark/viewmodel/CreateSourceHopeViewModel;->getUploadData()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    new-instance v1, Lcom/join/kotlin/quark/CreateSourceHopeActivity$createObserver$1$3;

    invoke-direct {v1, p0}, Lcom/join/kotlin/quark/CreateSourceHopeActivity$createObserver$1$3;-><init>(Lcom/join/kotlin/quark/CreateSourceHopeActivity;)V

    new-instance v2, Lcom/join/kotlin/quark/b;

    invoke-direct {v2, v1}, Lcom/join/kotlin/quark/b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p0, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    return-void
.end method

.method public final getAdapter()Lcom/join/kotlin/quark/adapter/SourceHopeAdapter;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/quark/CreateSourceHopeActivity;->adapter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/quark/adapter/SourceHopeAdapter;

    return-object v0
.end method

.method public initView(Landroid/os/Bundle;)V
    .locals 10
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDialogActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/quark/viewmodel/CreateSourceHopeViewModel;

    const-string v1, "_keyword"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/kotlin/quark/viewmodel/CreateSourceHopeViewModel;->setKeyword(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDialogActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/quark/viewmodel/CreateSourceHopeViewModel;

    const-string v1, "_sortType"

    const/4 v2, 0x1

    invoke-virtual {p1, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/kotlin/quark/viewmodel/CreateSourceHopeViewModel;->setSortType(I)V

    .line 4
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDialogActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/quark/viewmodel/CreateSourceHopeViewModel;

    const-string v1, "_type"

    const/4 v3, 0x0

    invoke-virtual {p1, v1, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/join/kotlin/quark/viewmodel/CreateSourceHopeViewModel;->setType(Ljava/lang/Integer;)V

    .line 5
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityCreateSourceHopeBinding;

    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDialogActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/quark/viewmodel/CreateSourceHopeViewModel;

    invoke-virtual {p1, v0}, Lcom/join/android/app/mgsim/wufun/databinding/ActivityCreateSourceHopeBinding;->h(Lcom/join/kotlin/quark/viewmodel/CreateSourceHopeViewModel;)V

    .line 6
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityCreateSourceHopeBinding;

    invoke-virtual {p1, p0}, Lcom/join/android/app/mgsim/wufun/databinding/ActivityCreateSourceHopeBinding;->g(Lcom/join/kotlin/quark/proxy/CreateSourceHopeClickProxy;)V

    .line 7
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityCreateSourceHopeBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityCreateSourceHopeBinding;->f:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    const-string v0, "mDatabind.mainContent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/join/kotlin/quark/CreateSourceHopeActivity$initView$2;

    invoke-direct {v0, p0}, Lcom/join/kotlin/quark/CreateSourceHopeActivity$initView$2;-><init>(Lcom/join/kotlin/quark/CreateSourceHopeActivity;)V

    invoke-static {p1, v0}, Lcom/join/kotlin/base/ext/CustomViewExtKt;->loadServiceInit(Landroid/view/View;Lkotlin/jvm/functions/Function0;)Lcom/kingja/loadsir/core/b;

    move-result-object p1

    iput-object p1, p0, Lcom/join/kotlin/quark/CreateSourceHopeActivity;->loadSir:Lcom/kingja/loadsir/core/b;

    .line 8
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityCreateSourceHopeBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityCreateSourceHopeBinding;->g:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Lcom/join/kotlin/quark/CreateSourceHopeActivity;->getTagAdapter()Lcom/join/kotlin/quark/adapter/SourceHopeTagAdapter;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 9
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityCreateSourceHopeBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityCreateSourceHopeBinding;->g:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Lcom/join/kotlin/quark/CreateSourceHopeActivity;->getTagAdapter()Lcom/join/kotlin/quark/adapter/SourceHopeTagAdapter;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 10
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityCreateSourceHopeBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityCreateSourceHopeBinding;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 11
    new-instance v0, Lcom/join/kotlin/quark/CreateSourceHopeActivity$initView$3$1;

    invoke-direct {v0, p0}, Lcom/join/kotlin/quark/CreateSourceHopeActivity$initView$3$1;-><init>(Lcom/join/kotlin/quark/CreateSourceHopeActivity;)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 12
    new-instance v0, Lcom/psk/kotlin/util/GridSpacingItemDecoration;

    .line 13
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v4, 0x7f071279

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    const/4 v4, 0x4

    .line 14
    invoke-direct {v0, v4, v1, v3}, Lcom/psk/kotlin/util/GridSpacingItemDecoration;-><init>(IIZ)V

    .line 15
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 16
    invoke-direct {p0}, Lcom/join/kotlin/quark/CreateSourceHopeActivity;->getTagAdapter()Lcom/join/kotlin/quark/adapter/SourceHopeTagAdapter;

    move-result-object p1

    .line 17
    new-instance v0, Lcom/join/kotlin/quark/d;

    invoke-direct {v0, p0}, Lcom/join/kotlin/quark/d;-><init>(Lcom/join/kotlin/quark/CreateSourceHopeActivity;)V

    invoke-virtual {p1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setOnItemClickListener(Lcom/chad/library/adapter/base/BaseQuickAdapter$d;)Lcom/chad/library/adapter/base/BaseQuickAdapter;

    .line 18
    invoke-virtual {p0}, Lcom/join/kotlin/quark/CreateSourceHopeActivity;->getAdapter()Lcom/join/kotlin/quark/adapter/SourceHopeAdapter;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/join/kotlin/quark/adapter/SourceHopeAdapter;->setSourceHopeItemClickProxy(Lcom/join/kotlin/quark/proxy/SourceHopeItemClickProxy;)V

    .line 19
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDialogActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object p1

    check-cast p1, Lcom/join/kotlin/quark/viewmodel/CreateSourceHopeViewModel;

    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getInstance_(this).uid"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/join/kotlin/quark/viewmodel/CreateSourceHopeViewModel;->getWebDiskHome(Ljava/lang/String;)V

    .line 20
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityCreateSourceHopeBinding;

    iget-object v4, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityCreateSourceHopeBinding;->j:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    const-string p1, "mDatabind.xrvList"

    invoke-static {v4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    new-instance v5, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v5, p0, v2, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    .line 22
    invoke-virtual {p0}, Lcom/join/kotlin/quark/CreateSourceHopeActivity;->getAdapter()Lcom/join/kotlin/quark/adapter/SourceHopeAdapter;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x0

    .line 23
    invoke-static/range {v4 .. v9}, Lcom/join/kotlin/base/ext/CustomViewExtKt;->init$default(Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Landroidx/recyclerview/widget/RecyclerView$Adapter;ZILjava/lang/Object;)Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    .line 24
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityCreateSourceHopeBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityCreateSourceHopeBinding;->j:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    .line 25
    new-instance v0, Lcom/join/kotlin/quark/CreateSourceHopeActivity$initView$5$1;

    invoke-direct {v0, p1}, Lcom/join/kotlin/quark/CreateSourceHopeActivity$initView$5$1;-><init>(Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 26
    invoke-virtual {p0}, Lcom/join/kotlin/quark/CreateSourceHopeActivity;->getAdapter()Lcom/join/kotlin/quark/adapter/SourceHopeAdapter;

    move-result-object p1

    .line 27
    sget-object v0, Lcom/join/kotlin/quark/e;->a:Lcom/join/kotlin/quark/e;

    invoke-virtual {p1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setOnItemClickListener(Lcom/chad/library/adapter/base/BaseQuickAdapter$d;)Lcom/chad/library/adapter/base/BaseQuickAdapter;

    .line 28
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityCreateSourceHopeBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityCreateSourceHopeBinding;->j:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    new-instance v0, Lcom/join/kotlin/quark/CreateSourceHopeActivity$initView$7;

    invoke-direct {v0, p0}, Lcom/join/kotlin/quark/CreateSourceHopeActivity$initView$7;-><init>(Lcom/join/kotlin/quark/CreateSourceHopeActivity;)V

    invoke-virtual {p1, v0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->setLoadingListener(Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$LoadingListener;)V

    .line 29
    invoke-virtual {p0, v2}, Lcom/join/kotlin/quark/CreateSourceHopeActivity;->loadData(Z)V

    return-void
.end method

.method public final loadData(Z)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDialogActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/quark/viewmodel/CreateSourceHopeViewModel;

    .line 2
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v1

    const-string v2, "getInstance_(this).uid"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {v0, p1, v1}, Lcom/join/kotlin/quark/viewmodel/CreateSourceHopeViewModel;->getWishPoolList(ZLjava/lang/String;)V

    return-void
.end method

.method public onBackClick()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/base/dialog/BaseDialogActivity;->finish()V

    return-void
.end method

.method public onCreateHopeClick()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/BaseAppCompatActivity;->showLoading()V

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDialogActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/quark/viewmodel/CreateSourceHopeViewModel;

    invoke-virtual {v0}, Lcom/join/kotlin/quark/viewmodel/CreateSourceHopeViewModel;->getSelectTag()Lcom/join/kotlin/quark/model/bean/SourceTabItemBean;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDialogActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v1

    check-cast v1, Lcom/join/kotlin/quark/viewmodel/CreateSourceHopeViewModel;

    .line 4
    invoke-virtual {v0}, Lcom/join/kotlin/quark/model/bean/SourceTabItemBean;->getTab_id()Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 5
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v2

    const-string v3, "getInstance_(this@CreateSourceHopeActivity).uid"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-virtual {v1, v0, v2}, Lcom/join/kotlin/quark/viewmodel/CreateSourceHopeViewModel;->sourceShareCreate(ILjava/lang/String;)V

    :cond_0
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

.method public onUploadSourceClick(Lcom/join/kotlin/quark/model/bean/SourceListItemBean;)V
    .locals 3
    .param p1    # Lcom/join/kotlin/quark/model/bean/SourceListItemBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "_wishPoolItem"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    move-result-object p1

    const-string v0, "Intent().putExtra(\"_wishPoolItem\", item)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    .line 3
    const-class v1, Lcom/join/kotlin/quark/ShareSourceActivity;

    .line 4
    new-instance v2, Lcom/join/kotlin/quark/CreateSourceHopeActivity$onUploadSourceClick$1;

    invoke-direct {v2, p0}, Lcom/join/kotlin/quark/CreateSourceHopeActivity$onUploadSourceClick$1;-><init>(Lcom/join/kotlin/quark/CreateSourceHopeActivity;)V

    .line 5
    invoke-virtual {v0, p0, v1, p1, v2}, Lcom/join/mgps/Util/IntentUtil;->startActivityWithCallback(Landroid/content/Context;Ljava/lang/Class;Landroid/content/Intent;Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;)V

    return-void
.end method

.method public onViewSourceClick(Lcom/join/kotlin/quark/model/bean/SourceListItemBean;)V
    .locals 2
    .param p1    # Lcom/join/kotlin/quark/model/bean/SourceListItemBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/join/kotlin/quark/SourceShareDetailActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "itemBean"

    .line 2
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    const-string p1, "qkPosition"

    const-string/jumbo v1, "xy"

    .line 3
    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 4
    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public onWantClick(Lcom/join/kotlin/quark/model/bean/SourceListItemBean;)V
    .locals 4
    .param p1    # Lcom/join/kotlin/quark/model/bean/SourceListItemBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Lcom/BaseAppCompatActivity;->showLoading()V

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDialogActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/quark/viewmodel/CreateSourceHopeViewModel;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Lcom/join/kotlin/quark/model/bean/SourceListItemBean;->getId()Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 4
    :goto_0
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v1

    const-string v2, "getInstance_(this@CreateSourceHopeActivity).uid"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    new-instance v2, Lcom/join/kotlin/quark/CreateSourceHopeActivity$onWantClick$1;

    invoke-direct {v2, p0}, Lcom/join/kotlin/quark/CreateSourceHopeActivity$onWantClick$1;-><init>(Lcom/join/kotlin/quark/CreateSourceHopeActivity;)V

    sget-object v3, Lcom/join/kotlin/quark/CreateSourceHopeActivity$onWantClick$2;->INSTANCE:Lcom/join/kotlin/quark/CreateSourceHopeActivity$onWantClick$2;

    invoke-virtual {v0, p1, v1, v2, v3}, Lcom/join/kotlin/quark/viewmodel/CreateSourceHopeViewModel;->wishPoolWant(Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
