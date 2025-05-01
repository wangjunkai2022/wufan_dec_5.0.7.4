.class public final Lcom/join/kotlin/discount/GameDetailInfoBottomDialogActivity;
.super Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity;
.source "GameDetailInfoBottomDialogActivity.kt"

# interfaces
.implements Lcom/join/kotlin/discount/proxy/GameDetailInfoBottomDialogClickProxy;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity<",
        "Lcom/join/kotlin/discount/viewmodel/GameDetailInfoBottomDialogViewModel;",
        "Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailInfoBottomDialogBinding;",
        ">;",
        "Lcom/join/kotlin/discount/proxy/GameDetailInfoBottomDialogClickProxy;"
    }
.end annotation


# instance fields
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
    sget-object v0, Lcom/join/kotlin/discount/GameDetailInfoBottomDialogActivity$mAdapter$2;->INSTANCE:Lcom/join/kotlin/discount/GameDetailInfoBottomDialogActivity$mAdapter$2;

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/join/kotlin/discount/GameDetailInfoBottomDialogActivity;->mAdapter$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private final getMAdapter()Lcom/join/kotlin/discount/adapter/GameDetailInfoBottomDialogAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/GameDetailInfoBottomDialogActivity;->mAdapter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/discount/adapter/GameDetailInfoBottomDialogAdapter;

    return-object v0
.end method


# virtual methods
.method public createObserver()V
    .locals 0

    return-void
.end method

.method public getContentView()Landroid/view/View;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailInfoBottomDialogBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailInfoBottomDialogBinding;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method

.method public initView(Landroid/os/Bundle;)V
    .locals 6
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailInfoBottomDialogBinding;

    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDialogActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/discount/viewmodel/GameDetailInfoBottomDialogViewModel;

    invoke-virtual {p1, v0}, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailInfoBottomDialogBinding;->h(Lcom/join/kotlin/discount/viewmodel/GameDetailInfoBottomDialogViewModel;)V

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailInfoBottomDialogBinding;

    invoke-virtual {p1, p0}, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailInfoBottomDialogBinding;->g(Lcom/join/kotlin/discount/proxy/GameDetailInfoBottomDialogClickProxy;)V

    .line 3
    invoke-static {p0}, Lcom/join/mgps/Util/c2;->s(Landroid/app/Activity;)V

    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 5
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDialogActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/discount/viewmodel/GameDetailInfoBottomDialogViewModel;

    invoke-virtual {v0}, Lcom/join/kotlin/discount/viewmodel/GameDetailInfoBottomDialogViewModel;->getTitle()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    const-string/jumbo v1, "title"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 6
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDialogActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/discount/viewmodel/GameDetailInfoBottomDialogViewModel;

    invoke-virtual {v0}, Lcom/join/kotlin/discount/viewmodel/GameDetailInfoBottomDialogViewModel;->getContent()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    const-string v1, "content"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 7
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDialogActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/discount/viewmodel/GameDetailInfoBottomDialogViewModel;

    invoke-virtual {v0}, Lcom/join/kotlin/discount/viewmodel/GameDetailInfoBottomDialogViewModel;->getBtnText()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    const-string v1, "btnText"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 8
    :cond_0
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object p1

    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDialogActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/discount/viewmodel/GameDetailInfoBottomDialogViewModel;

    invoke-virtual {v0}, Lcom/join/kotlin/discount/viewmodel/GameDetailInfoBottomDialogViewModel;->getContent()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v1

    const-class v2, Ljava/util/ArrayList;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Class;

    const/4 v4, 0x0

    const-class v5, Lcom/join/kotlin/discount/model/bean/GameDetailDialogInfoBean;

    aput-object v5, v3, v4

    invoke-virtual {v1, v2, v3}, Lcom/join/android/app/common/utils/JsonMapper;->createCollectionType(Ljava/lang/Class;[Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JavaType;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    .line 9
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailInfoBottomDialogBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailInfoBottomDialogBinding;->d:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v1, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 10
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailInfoBottomDialogBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailInfoBottomDialogBinding;->d:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Lcom/join/kotlin/discount/GameDetailInfoBottomDialogActivity;->getMAdapter()Lcom/join/kotlin/discount/adapter/GameDetailInfoBottomDialogAdapter;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 11
    invoke-direct {p0}, Lcom/join/kotlin/discount/GameDetailInfoBottomDialogActivity;->getMAdapter()Lcom/join/kotlin/discount/adapter/GameDetailInfoBottomDialogAdapter;

    move-result-object v0

    if-eqz p1, :cond_1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->filterNotNull(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->submitList(Ljava/util/List;)V

    return-void
.end method

.method public onBackClick()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/base/dialog/BaseDialogActivity;->finish()V

    return-void
.end method

.method public onConfirmClick()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/base/dialog/BaseDialogActivity;->finish()V

    return-void
.end method
