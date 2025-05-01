.class public final Lcom/join/kotlin/quark/UploadSourceHopeActivity;
.super Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity;
.source "UploadSourceHopeActivity.kt"

# interfaces
.implements Lcom/join/kotlin/quark/proxy/UploadSourceHopeClickProxy;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity<",
        "Lcom/join/kotlin/quark/viewmodel/UploadSourceHopeViewModel;",
        "Lcom/join/android/app/mgsim/wufun/databinding/ActivityUploadSourceHopeBinding;",
        ">;",
        "Lcom/join/kotlin/quark/proxy/UploadSourceHopeClickProxy;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nUploadSourceHopeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadSourceHopeActivity.kt\ncom/join/kotlin/quark/UploadSourceHopeActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,150:1\n1864#2,3:151\n*S KotlinDebug\n*F\n+ 1 UploadSourceHopeActivity.kt\ncom/join/kotlin/quark/UploadSourceHopeActivity\n*L\n67#1:151,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nUploadSourceHopeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadSourceHopeActivity.kt\ncom/join/kotlin/quark/UploadSourceHopeActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,150:1\n1864#2,3:151\n*S KotlinDebug\n*F\n+ 1 UploadSourceHopeActivity.kt\ncom/join/kotlin/quark/UploadSourceHopeActivity\n*L\n67#1:151,3\n*E\n"
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
    sget-object v0, Lcom/join/kotlin/quark/UploadSourceHopeActivity$tagAdapter$2;->INSTANCE:Lcom/join/kotlin/quark/UploadSourceHopeActivity$tagAdapter$2;

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/join/kotlin/quark/UploadSourceHopeActivity;->tagAdapter$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$getLoadSir$p(Lcom/join/kotlin/quark/UploadSourceHopeActivity;)Lcom/kingja/loadsir/core/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/kotlin/quark/UploadSourceHopeActivity;->loadSir:Lcom/kingja/loadsir/core/b;

    return-object p0
.end method

.method public static final synthetic access$getTagAdapter(Lcom/join/kotlin/quark/UploadSourceHopeActivity;)Lcom/join/kotlin/quark/adapter/SourceHopeTagAdapter;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/kotlin/quark/UploadSourceHopeActivity;->getTagAdapter()Lcom/join/kotlin/quark/adapter/SourceHopeTagAdapter;

    move-result-object p0

    return-object p0
.end method

.method private static final createObserver$lambda$6$lambda$4(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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

    invoke-static {p0, p1}, Lcom/join/kotlin/quark/UploadSourceHopeActivity;->createObserver$lambda$6$lambda$5(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic g0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/join/kotlin/quark/UploadSourceHopeActivity;->createObserver$lambda$6$lambda$4(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method private final getTagAdapter()Lcom/join/kotlin/quark/adapter/SourceHopeTagAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/quark/UploadSourceHopeActivity;->tagAdapter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/quark/adapter/SourceHopeTagAdapter;

    return-object v0
.end method

.method public static synthetic h0(Lcom/join/kotlin/quark/UploadSourceHopeActivity;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/join/kotlin/quark/UploadSourceHopeActivity;->initView$lambda$3$lambda$2(Lcom/join/kotlin/quark/UploadSourceHopeActivity;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V

    return-void
.end method

.method private static final initView$lambda$3$lambda$2(Lcom/join/kotlin/quark/UploadSourceHopeActivity;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 4

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p1, "view"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Lcom/join/kotlin/quark/UploadSourceHopeActivity;->getTagAdapter()Lcom/join/kotlin/quark/adapter/SourceHopeTagAdapter;

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

    check-cast v0, Lcom/join/kotlin/quark/viewmodel/UploadSourceHopeViewModel;

    invoke-virtual {v0, v1}, Lcom/join/kotlin/quark/viewmodel/UploadSourceHopeViewModel;->setSelectTag(Lcom/join/kotlin/quark/model/bean/SourceTabItemBean;)V

    :cond_4
    move v0, v2

    goto :goto_0

    .line 6
    :cond_5
    invoke-direct {p0}, Lcom/join/kotlin/quark/UploadSourceHopeActivity;->getTagAdapter()Lcom/join/kotlin/quark/adapter/SourceHopeTagAdapter;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method


# virtual methods
.method public createObserver()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDialogActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/quark/viewmodel/UploadSourceHopeViewModel;

    .line 2
    invoke-virtual {v0}, Lcom/join/kotlin/quark/viewmodel/UploadSourceHopeViewModel;->getHomeData()Landroidx/lifecycle/MutableLiveData;

    move-result-object v1

    new-instance v2, Lcom/join/kotlin/quark/UploadSourceHopeActivity$createObserver$1$1;

    invoke-direct {v2, p0}, Lcom/join/kotlin/quark/UploadSourceHopeActivity$createObserver$1$1;-><init>(Lcom/join/kotlin/quark/UploadSourceHopeActivity;)V

    new-instance v3, Lcom/join/kotlin/quark/x;

    invoke-direct {v3, v2}, Lcom/join/kotlin/quark/x;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, p0, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 3
    invoke-virtual {v0}, Lcom/join/kotlin/quark/viewmodel/UploadSourceHopeViewModel;->getUploadData()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    new-instance v1, Lcom/join/kotlin/quark/UploadSourceHopeActivity$createObserver$1$2;

    invoke-direct {v1, p0}, Lcom/join/kotlin/quark/UploadSourceHopeActivity$createObserver$1$2;-><init>(Lcom/join/kotlin/quark/UploadSourceHopeActivity;)V

    new-instance v2, Lcom/join/kotlin/quark/w;

    invoke-direct {v2, v1}, Lcom/join/kotlin/quark/w;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p0, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    return-void
.end method

.method public initView(Landroid/os/Bundle;)V
    .locals 4
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityUploadSourceHopeBinding;

    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDialogActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/quark/viewmodel/UploadSourceHopeViewModel;

    invoke-virtual {p1, v0}, Lcom/join/android/app/mgsim/wufun/databinding/ActivityUploadSourceHopeBinding;->h(Lcom/join/kotlin/quark/viewmodel/UploadSourceHopeViewModel;)V

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityUploadSourceHopeBinding;

    invoke-virtual {p1, p0}, Lcom/join/android/app/mgsim/wufun/databinding/ActivityUploadSourceHopeBinding;->g(Lcom/join/kotlin/quark/proxy/UploadSourceHopeClickProxy;)V

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityUploadSourceHopeBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityUploadSourceHopeBinding;->f:Landroidx/core/widget/NestedScrollView;

    const-string v0, "mDatabind.mainContent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/join/kotlin/quark/UploadSourceHopeActivity$initView$1;

    invoke-direct {v0, p0}, Lcom/join/kotlin/quark/UploadSourceHopeActivity$initView$1;-><init>(Lcom/join/kotlin/quark/UploadSourceHopeActivity;)V

    invoke-static {p1, v0}, Lcom/join/kotlin/base/ext/CustomViewExtKt;->loadServiceInit(Landroid/view/View;Lkotlin/jvm/functions/Function0;)Lcom/kingja/loadsir/core/b;

    move-result-object p1

    iput-object p1, p0, Lcom/join/kotlin/quark/UploadSourceHopeActivity;->loadSir:Lcom/kingja/loadsir/core/b;

    .line 4
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityUploadSourceHopeBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityUploadSourceHopeBinding;->g:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Lcom/join/kotlin/quark/UploadSourceHopeActivity;->getTagAdapter()Lcom/join/kotlin/quark/adapter/SourceHopeTagAdapter;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 5
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityUploadSourceHopeBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityUploadSourceHopeBinding;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    new-instance v0, Lcom/join/kotlin/quark/UploadSourceHopeActivity$initView$2$1;

    invoke-direct {v0, p0}, Lcom/join/kotlin/quark/UploadSourceHopeActivity$initView$2$1;-><init>(Lcom/join/kotlin/quark/UploadSourceHopeActivity;)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 7
    new-instance v0, Lcom/psk/kotlin/util/GridSpacingItemDecoration;

    .line 8
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f071279

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    const/4 v2, 0x4

    const/4 v3, 0x0

    .line 9
    invoke-direct {v0, v2, v1, v3}, Lcom/psk/kotlin/util/GridSpacingItemDecoration;-><init>(IIZ)V

    .line 10
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 11
    invoke-direct {p0}, Lcom/join/kotlin/quark/UploadSourceHopeActivity;->getTagAdapter()Lcom/join/kotlin/quark/adapter/SourceHopeTagAdapter;

    move-result-object p1

    .line 12
    new-instance v0, Lcom/join/kotlin/quark/y;

    invoke-direct {v0, p0}, Lcom/join/kotlin/quark/y;-><init>(Lcom/join/kotlin/quark/UploadSourceHopeActivity;)V

    invoke-virtual {p1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setOnItemClickListener(Lcom/chad/library/adapter/base/BaseQuickAdapter$d;)Lcom/chad/library/adapter/base/BaseQuickAdapter;

    .line 13
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDialogActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object p1

    check-cast p1, Lcom/join/kotlin/quark/viewmodel/UploadSourceHopeViewModel;

    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getInstance_(this).uid"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/join/kotlin/quark/viewmodel/UploadSourceHopeViewModel;->getWebDiskHome(Ljava/lang/String;)V

    return-void
.end method

.method public onBackClick()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/base/dialog/BaseDialogActivity;->finish()V

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

.method public onUploadSourceClick()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/BaseAppCompatActivity;->showLoading()V

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDialogActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/quark/viewmodel/UploadSourceHopeViewModel;

    invoke-virtual {v0}, Lcom/join/kotlin/quark/viewmodel/UploadSourceHopeViewModel;->getSelectTag()Lcom/join/kotlin/quark/model/bean/SourceTabItemBean;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDialogActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v1

    check-cast v1, Lcom/join/kotlin/quark/viewmodel/UploadSourceHopeViewModel;

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

    const-string v3, "getInstance_(this@UploadSourceHopeActivity).uid"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-virtual {v1, v0, v2}, Lcom/join/kotlin/quark/viewmodel/UploadSourceHopeViewModel;->sourceShareCreate(ILjava/lang/String;)V

    :cond_0
    return-void
.end method
