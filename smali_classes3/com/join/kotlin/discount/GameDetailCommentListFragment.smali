.class public final Lcom/join/kotlin/discount/GameDetailCommentListFragment;
.super Lcom/join/kotlin/base/fragment/BaseVmDbFragment;
.source "GameDetailCommentListFragment.kt"

# interfaces
.implements Lcom/join/kotlin/discount/proxy/GameDetailCommentListClickProxy;
.implements Lcom/join/kotlin/discount/proxy/ItemGameDetailCommentListClickProxy;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/kotlin/base/fragment/BaseVmDbFragment<",
        "Lcom/join/kotlin/discount/viewmodel/GameDetailCommentListViewModel;",
        "Lcom/join/android/app/mgsim/wufun/databinding/FragmentGameDetailCommentListBinding;",
        ">;",
        "Lcom/join/kotlin/discount/proxy/GameDetailCommentListClickProxy;",
        "Lcom/join/kotlin/discount/proxy/ItemGameDetailCommentListClickProxy;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGameDetailCommentListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameDetailCommentListFragment.kt\ncom/join/kotlin/discount/GameDetailCommentListFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,187:1\n1855#2,2:188\n*S KotlinDebug\n*F\n+ 1 GameDetailCommentListFragment.kt\ncom/join/kotlin/discount/GameDetailCommentListFragment\n*L\n85#1:188,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nGameDetailCommentListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameDetailCommentListFragment.kt\ncom/join/kotlin/discount/GameDetailCommentListFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,187:1\n1855#2,2:188\n*S KotlinDebug\n*F\n+ 1 GameDetailCommentListFragment.kt\ncom/join/kotlin/discount/GameDetailCommentListFragment\n*L\n85#1:188,2\n*E\n"
    }
.end annotation


# instance fields
.field private isLoginFromGoComment:Z

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

.field private popupWindow:Landroid/widget/PopupWindow;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private rvSpinner:Landroidx/recyclerview/widget/RecyclerView;

.field private final spinnerAdapter$delegate:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/kotlin/base/fragment/BaseVmDbFragment;-><init>()V

    .line 2
    sget-object v0, Lcom/join/kotlin/discount/GameDetailCommentListFragment$mAdapter$2;->INSTANCE:Lcom/join/kotlin/discount/GameDetailCommentListFragment$mAdapter$2;

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/join/kotlin/discount/GameDetailCommentListFragment;->mAdapter$delegate:Lkotlin/Lazy;

    .line 3
    sget-object v0, Lcom/join/kotlin/discount/GameDetailCommentListFragment$spinnerAdapter$2;->INSTANCE:Lcom/join/kotlin/discount/GameDetailCommentListFragment$spinnerAdapter$2;

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/join/kotlin/discount/GameDetailCommentListFragment;->spinnerAdapter$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic W(Lcom/join/kotlin/discount/GameDetailCommentListFragment;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/join/kotlin/discount/GameDetailCommentListFragment;->initSpinner$lambda$4$lambda$3(Lcom/join/kotlin/discount/GameDetailCommentListFragment;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V

    return-void
.end method

.method public static synthetic X(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/join/kotlin/discount/GameDetailCommentListFragment;->createObserver$lambda$6$lambda$5(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic access$getLoadSir$p(Lcom/join/kotlin/discount/GameDetailCommentListFragment;)Lcom/kingja/loadsir/core/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/kotlin/discount/GameDetailCommentListFragment;->loadSir:Lcom/kingja/loadsir/core/b;

    return-object p0
.end method

.method public static final synthetic access$getMAdapter(Lcom/join/kotlin/discount/GameDetailCommentListFragment;)Lcom/join/kotlin/discount/adapter/GameDetailCommentAdapter;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/kotlin/discount/GameDetailCommentListFragment;->getMAdapter()Lcom/join/kotlin/discount/adapter/GameDetailCommentAdapter;

    move-result-object p0

    return-object p0
.end method

.method private static final createObserver$lambda$6$lambda$5(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final getGoodRate()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->getFragments()Ljava/util/List;

    move-result-object v0

    const-string v1, "parentFragmentManager.fragments"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 3
    instance-of v2, v1, Lcom/join/kotlin/discount/GameDetailFragment;

    if-eqz v2, :cond_0

    .line 4
    invoke-virtual {p0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/discount/viewmodel/GameDetailCommentListViewModel;

    invoke-virtual {v0}, Lcom/join/kotlin/discount/viewmodel/GameDetailCommentListViewModel;->getGoodRate()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    check-cast v1, Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-virtual {v1}, Lcom/join/kotlin/discount/GameDetailFragment;->getGoodRate()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 5
    invoke-virtual {p0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/discount/viewmodel/GameDetailCommentListViewModel;

    invoke-virtual {v0}, Lcom/join/kotlin/discount/viewmodel/GameDetailCommentListViewModel;->getShowGoodRate()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    invoke-virtual {v1}, Lcom/join/kotlin/discount/GameDetailFragment;->getGoodRate()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method private final getMAdapter()Lcom/join/kotlin/discount/adapter/GameDetailCommentAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/GameDetailCommentListFragment;->mAdapter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/discount/adapter/GameDetailCommentAdapter;

    return-object v0
.end method

.method private final getSpinnerAdapter()Lcom/join/kotlin/discount/adapter/CommentSpinnerAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/GameDetailCommentListFragment;->spinnerAdapter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/discount/adapter/CommentSpinnerAdapter;

    return-object v0
.end method

.method private final initSpinner()V
    .locals 4

    .line 1
    new-instance v0, Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x2

    invoke-direct {v1, v2, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 3
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    const v1, 0x7f0801e4

    .line 4
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setBackgroundResource(I)V

    .line 5
    invoke-direct {p0}, Lcom/join/kotlin/discount/GameDetailCommentListFragment;->getSpinnerAdapter()Lcom/join/kotlin/discount/adapter/CommentSpinnerAdapter;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 6
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f07114a

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1, v2, v2}, Landroid/view/ViewGroup;->setPadding(IIII)V

    .line 7
    iput-object v0, p0, Lcom/join/kotlin/discount/GameDetailCommentListFragment;->rvSpinner:Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    invoke-direct {p0}, Lcom/join/kotlin/discount/GameDetailCommentListFragment;->getSpinnerAdapter()Lcom/join/kotlin/discount/adapter/CommentSpinnerAdapter;

    move-result-object v0

    .line 9
    new-instance v1, Lcom/join/kotlin/discount/c;

    invoke-direct {v1, p0}, Lcom/join/kotlin/discount/c;-><init>(Lcom/join/kotlin/discount/GameDetailCommentListFragment;)V

    invoke-virtual {v0, v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setOnItemClickListener(Lcom/chad/library/adapter/base/BaseQuickAdapter$d;)Lcom/chad/library/adapter/base/BaseQuickAdapter;

    const-string/jumbo v1, "\u6700\u70ed"

    const-string/jumbo v2, "\u6700\u65b0"

    .line 10
    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->arrayListOf([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->submitList(Ljava/util/List;)V

    return-void
.end method

.method private static final initSpinner$lambda$4$lambda$3(Lcom/join/kotlin/discount/GameDetailCommentListFragment;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 1

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<anonymous parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "<anonymous parameter 1>"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Lcom/join/kotlin/discount/GameDetailCommentListFragment;->getSpinnerAdapter()Lcom/join/kotlin/discount/adapter/CommentSpinnerAdapter;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/join/kotlin/discount/adapter/CommentSpinnerAdapter;->setSelectedIndex(I)V

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object p1

    check-cast p1, Lcom/join/kotlin/discount/viewmodel/GameDetailCommentListViewModel;

    invoke-virtual {p1}, Lcom/join/kotlin/discount/viewmodel/GameDetailCommentListViewModel;->getSortType()I

    move-result p1

    rsub-int/lit8 p2, p3, 0x2

    if-eq p1, p2, :cond_2

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object p1

    check-cast p1, Lcom/join/kotlin/discount/viewmodel/GameDetailCommentListViewModel;

    invoke-virtual {p1, p2}, Lcom/join/kotlin/discount/viewmodel/GameDetailCommentListViewModel;->setSortType(I)V

    .line 4
    invoke-virtual {p0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object p1

    check-cast p1, Lcom/join/kotlin/discount/viewmodel/GameDetailCommentListViewModel;

    invoke-virtual {p1}, Lcom/join/kotlin/discount/viewmodel/GameDetailCommentListViewModel;->getSortText()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    invoke-direct {p0}, Lcom/join/kotlin/discount/GameDetailCommentListFragment;->getSpinnerAdapter()Lcom/join/kotlin/discount/adapter/CommentSpinnerAdapter;

    move-result-object p2

    invoke-virtual {p2, p3}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    if-nez p2, :cond_0

    const-string/jumbo p2, "\u6700\u70ed"

    :cond_0
    invoke-virtual {p1, p2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 5
    iget-object p1, p0, Lcom/join/kotlin/discount/GameDetailCommentListFragment;->loadSir:Lcom/kingja/loadsir/core/b;

    if-nez p1, :cond_1

    const-string p1, "loadSir"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_1
    invoke-static {p1}, Lcom/join/kotlin/base/ext/CustomViewExtKt;->showLoading(Lcom/kingja/loadsir/core/b;)V

    const/4 p1, 0x1

    .line 6
    invoke-virtual {p0, p1}, Lcom/join/kotlin/discount/GameDetailCommentListFragment;->loadData(Z)V

    .line 7
    :cond_2
    invoke-direct {p0}, Lcom/join/kotlin/discount/GameDetailCommentListFragment;->getSpinnerAdapter()Lcom/join/kotlin/discount/adapter/CommentSpinnerAdapter;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 8
    iget-object p0, p0, Lcom/join/kotlin/discount/GameDetailCommentListFragment;->popupWindow:Landroid/widget/PopupWindow;

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_3
    return-void
.end method


# virtual methods
.method public clickSpinner()V
    .locals 5

    .line 1
    new-instance v0, Landroid/widget/PopupWindow;

    .line 2
    iget-object v1, p0, Lcom/join/kotlin/discount/GameDetailCommentListFragment;->rvSpinner:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v1, :cond_0

    const-string v1, "rvSpinner"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f07114b

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0711b2

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    float-to-int v3, v3

    .line 5
    invoke-direct {v0, v1, v2, v3}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;II)V

    iput-object v0, p0, Lcom/join/kotlin/discount/GameDetailCommentListFragment;->popupWindow:Landroid/widget/PopupWindow;

    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 7
    iget-object v0, p0, Lcom/join/kotlin/discount/GameDetailCommentListFragment;->popupWindow:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_1

    new-instance v2, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>()V

    invoke-virtual {v0, v2}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 8
    :cond_1
    iget-object v0, p0, Lcom/join/kotlin/discount/GameDetailCommentListFragment;->popupWindow:Landroid/widget/PopupWindow;

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 9
    :goto_0
    iget-object v0, p0, Lcom/join/kotlin/discount/GameDetailCommentListFragment;->popupWindow:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_3

    .line 10
    invoke-virtual {p0}, Lcom/join/kotlin/base/fragment/BaseVmDbFragment;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v1

    check-cast v1, Lcom/join/android/app/mgsim/wufun/databinding/FragmentGameDetailCommentListBinding;

    iget-object v1, v1, Lcom/join/android/app/mgsim/wufun/databinding/FragmentGameDetailCommentListBinding;->c:Landroid/widget/LinearLayout;

    const/4 v2, 0x0

    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f07106c

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    float-to-int v3, v3

    neg-int v3, v3

    .line 12
    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    :cond_3
    return-void
.end method

.method public createObserver()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/discount/viewmodel/GameDetailCommentListViewModel;

    .line 2
    invoke-virtual {v0}, Lcom/join/kotlin/discount/viewmodel/GameDetailCommentListViewModel;->getListData()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    new-instance v1, Lcom/join/kotlin/discount/GameDetailCommentListFragment$createObserver$1$1;

    invoke-direct {v1, p0}, Lcom/join/kotlin/discount/GameDetailCommentListFragment$createObserver$1$1;-><init>(Lcom/join/kotlin/discount/GameDetailCommentListFragment;)V

    new-instance v2, Lcom/join/kotlin/discount/b;

    invoke-direct {v2, v1}, Lcom/join/kotlin/discount/b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p0, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    return-void
.end method

.method public dismissLoading()V
    .locals 0

    return-void
.end method

.method public initView(Landroid/os/Bundle;)V
    .locals 3
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/base/fragment/BaseVmDbFragment;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/FragmentGameDetailCommentListBinding;

    invoke-virtual {p0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/discount/viewmodel/GameDetailCommentListViewModel;

    invoke-virtual {p1, v0}, Lcom/join/android/app/mgsim/wufun/databinding/FragmentGameDetailCommentListBinding;->h(Lcom/join/kotlin/discount/viewmodel/GameDetailCommentListViewModel;)V

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/base/fragment/BaseVmDbFragment;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/FragmentGameDetailCommentListBinding;

    invoke-virtual {p1, p0}, Lcom/join/android/app/mgsim/wufun/databinding/FragmentGameDetailCommentListBinding;->g(Lcom/join/kotlin/discount/proxy/GameDetailCommentListClickProxy;)V

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object p1

    check-cast p1, Lcom/join/kotlin/discount/viewmodel/GameDetailCommentListViewModel;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v2, "gameId"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-virtual {p1, v0}, Lcom/join/kotlin/discount/viewmodel/GameDetailCommentListViewModel;->setGameId(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0}, Lcom/join/kotlin/base/fragment/BaseVmDbFragment;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/FragmentGameDetailCommentListBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/FragmentGameDetailCommentListBinding;->e:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    const-string v0, "mDatabind.rvList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/join/kotlin/discount/GameDetailCommentListFragment$initView$1;

    invoke-direct {v0, p0}, Lcom/join/kotlin/discount/GameDetailCommentListFragment$initView$1;-><init>(Lcom/join/kotlin/discount/GameDetailCommentListFragment;)V

    invoke-static {p1, v0}, Lcom/join/kotlin/base/ext/CustomViewExtKt;->loadServiceInit(Landroid/view/View;Lkotlin/jvm/functions/Function0;)Lcom/kingja/loadsir/core/b;

    move-result-object p1

    iput-object p1, p0, Lcom/join/kotlin/discount/GameDetailCommentListFragment;->loadSir:Lcom/kingja/loadsir/core/b;

    if-nez p1, :cond_1

    const-string p1, "loadSir"

    .line 5
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    move-object v1, p1

    :goto_1
    invoke-static {v1}, Lcom/join/kotlin/base/ext/CustomViewExtKt;->showLoading(Lcom/kingja/loadsir/core/b;)V

    .line 6
    invoke-direct {p0}, Lcom/join/kotlin/discount/GameDetailCommentListFragment;->getMAdapter()Lcom/join/kotlin/discount/adapter/GameDetailCommentAdapter;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/join/kotlin/discount/adapter/GameDetailCommentAdapter;->setClick(Lcom/join/kotlin/discount/proxy/ItemGameDetailCommentListClickProxy;)V

    .line 7
    invoke-virtual {p0}, Lcom/join/kotlin/base/fragment/BaseVmDbFragment;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/FragmentGameDetailCommentListBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/FragmentGameDetailCommentListBinding;->e:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    .line 8
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 9
    invoke-direct {p0}, Lcom/join/kotlin/discount/GameDetailCommentListFragment;->getMAdapter()Lcom/join/kotlin/discount/adapter/GameDetailCommentAdapter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 10
    invoke-virtual {p0}, Lcom/join/kotlin/base/fragment/BaseVmDbFragment;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/FragmentGameDetailCommentListBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/FragmentGameDetailCommentListBinding;->e:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getItemAnimator()Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroidx/recyclerview/widget/SimpleItemAnimator;

    const/4 v0, 0x0

    .line 11
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/SimpleItemAnimator;->setSupportsChangeAnimations(Z)V

    .line 12
    invoke-virtual {p0}, Lcom/join/kotlin/base/fragment/BaseVmDbFragment;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/FragmentGameDetailCommentListBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/FragmentGameDetailCommentListBinding;->e:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    new-instance v0, Lcom/join/kotlin/discount/GameDetailCommentListFragment$initView$3;

    invoke-direct {v0, p0}, Lcom/join/kotlin/discount/GameDetailCommentListFragment$initView$3;-><init>(Lcom/join/kotlin/discount/GameDetailCommentListFragment;)V

    invoke-virtual {p1, v0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->setLoadingListener(Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$LoadingListener;)V

    .line 13
    invoke-direct {p0}, Lcom/join/kotlin/discount/GameDetailCommentListFragment;->initSpinner()V

    .line 14
    invoke-direct {p0}, Lcom/join/kotlin/discount/GameDetailCommentListFragment;->getGoodRate()V

    .line 15
    invoke-virtual {p0}, Lcom/join/kotlin/discount/GameDetailCommentListFragment;->setTopPadding()V

    return-void
.end method

.method public final isLoginFromGoComment()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/kotlin/discount/GameDetailCommentListFragment;->isLoginFromGoComment:Z

    return v0
.end method

.method public lazyLoadData()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/GameDetailCommentListFragment;->loadSir:Lcom/kingja/loadsir/core/b;

    if-nez v0, :cond_0

    const-string v0, "loadSir"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-static {v0}, Lcom/join/kotlin/base/ext/CustomViewExtKt;->showLoading(Lcom/kingja/loadsir/core/b;)V

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lcom/join/kotlin/discount/GameDetailCommentListFragment;->loadData(Z)V

    return-void
.end method

.method public like(Lcom/join/kotlin/discount/model/bean/CommentDetailBean;)V
    .locals 0
    .param p1    # Lcom/join/kotlin/discount/model/bean/CommentDetailBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    return-void
.end method

.method public final loadData(Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/discount/viewmodel/GameDetailCommentListViewModel;

    invoke-virtual {v0, p1}, Lcom/join/kotlin/discount/viewmodel/GameDetailCommentListViewModel;->getCommentList(Z)V

    return-void
.end method

.method public onResume()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->onResume()V

    return-void
.end method

.method public final setLoginFromGoComment(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/kotlin/discount/GameDetailCommentListFragment;->isLoginFromGoComment:Z

    return-void
.end method

.method public final setTopPadding()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/base/fragment/BaseVmDbFragment;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/FragmentGameDetailCommentListBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/FragmentGameDetailCommentListBinding;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    instance-of v2, v1, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    if-eqz v2, :cond_0

    check-cast v1, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->getTabBottom()I

    move-result v1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    .line 3
    :goto_1
    invoke-virtual {v0, v2, v1, v2, v2}, Landroid/view/ViewGroup;->setPadding(IIII)V

    return-void
.end method

.method public showLoading(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public toCommentEdit()V
    .locals 0

    return-void
.end method
