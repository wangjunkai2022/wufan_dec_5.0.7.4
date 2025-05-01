.class public final Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;
.super Landroidx/fragment/app/Fragment;
.source "FindGameChoiceFragment.kt"

# interfaces
.implements Lcom/join/kotlin/presenter/view/FindHomeView;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFindGameChoiceFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FindGameChoiceFragment.kt\ncom/join/kotlin/ui/findgame/FindGameChoiceFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,175:1\n1855#2,2:176\n*S KotlinDebug\n*F\n+ 1 FindGameChoiceFragment.kt\ncom/join/kotlin/ui/findgame/FindGameChoiceFragment\n*L\n110#1:176,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFindGameChoiceFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FindGameChoiceFragment.kt\ncom/join/kotlin/ui/findgame/FindGameChoiceFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,175:1\n1855#2,2:176\n*S KotlinDebug\n*F\n+ 1 FindGameChoiceFragment.kt\ncom/join/kotlin/ui/findgame/FindGameChoiceFragment\n*L\n110#1:176,2\n*E\n"
    }
.end annotation


# instance fields
.field public adapter:Lcom/join/kotlin/ui/findgame/adapter/FindHomeChoiceAdapter;

.field public binding:Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;

.field public downloadprensenter:Lcom/psk/kotlin/util/BasDownLoadActivityPresenter;

.field private page:I

.field public prensenter:Lcom/join/kotlin/presenter/FindModlePrensenter;

.field public requestArgs:Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;

.field public showDatalist:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/psk/kotlin/util/CommonListMainData;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->page:I

    return-void
.end method


# virtual methods
.method public final getAdapter()Lcom/join/kotlin/ui/findgame/adapter/FindHomeChoiceAdapter;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->adapter:Lcom/join/kotlin/ui/findgame/adapter/FindHomeChoiceAdapter;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "adapter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->binding:Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getDownloadprensenter()Lcom/psk/kotlin/util/BasDownLoadActivityPresenter;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->downloadprensenter:Lcom/psk/kotlin/util/BasDownLoadActivityPresenter;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "downloadprensenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getPage()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->page:I

    return v0
.end method

.method public final getPrensenter()Lcom/join/kotlin/presenter/FindModlePrensenter;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->prensenter:Lcom/join/kotlin/presenter/FindModlePrensenter;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "prensenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getRequestArgs()Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->requestArgs:Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "requestArgs"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getShowDatalist()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/psk/kotlin/util/CommonListMainData;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->showDatalist:Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "showDatalist"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public hidLoading()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;->f:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {v0}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->loadMoreComplete()V

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;->e:Lcom/join/android/app/mgsim/wufun/databinding/LodingLayoutIncludeBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/LodingLayoutIncludeBinding;->d:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;->c:Lcom/join/android/app/mgsim/wufun/databinding/FailedLayoutIncludeBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/FailedLayoutIncludeBinding;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;->f:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4
    .param p1    # Landroid/view/LayoutInflater;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x0

    .line 1
    invoke-static {p1, p2, p3}, Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;

    move-result-object p1

    const-string p2, "inflate(inflater, container, false)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->setBinding(Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;)V

    .line 2
    new-instance p1, Lcom/join/kotlin/presenter/FindModlePrensenter;

    invoke-direct {p1, p0}, Lcom/join/kotlin/presenter/FindModlePrensenter;-><init>(Lcom/join/kotlin/presenter/view/FindHomeView;)V

    invoke-virtual {p0, p1}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->setPrensenter(Lcom/join/kotlin/presenter/FindModlePrensenter;)V

    .line 3
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/join/mgps/Util/d0;->d(Ljava/lang/Object;)V

    .line 4
    new-instance p1, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {p1}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    new-instance p2, Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;

    invoke-direct {p2}, Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;-><init>()V

    iput-object p2, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 5
    check-cast p2, Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;

    const/4 p3, 0x1

    invoke-virtual {p2, p3}, Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;->setPage(I)V

    .line 6
    iget-object p2, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p2, Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v0

    invoke-virtual {p2, v0}, Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;->setUid(I)V

    .line 7
    new-instance p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-direct {p2, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 8
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;->f:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {v0, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 9
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, v0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->setShowDatalist(Ljava/util/List;)V

    .line 10
    new-instance v0, Lcom/join/kotlin/ui/findgame/adapter/FindHomeChoiceAdapter;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    const-string v2, "requireActivity()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getShowDatalist()Ljava/util/List;

    move-result-object v3

    invoke-direct {v0, v1, v3}, Lcom/join/kotlin/ui/findgame/adapter/FindHomeChoiceAdapter;-><init>(Landroid/content/Context;Ljava/util/List;)V

    invoke-virtual {p0, v0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->setAdapter(Lcom/join/kotlin/ui/findgame/adapter/FindHomeChoiceAdapter;)V

    .line 11
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;->f:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getAdapter()Lcom/join/kotlin/ui/findgame/adapter/FindHomeChoiceAdapter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 12
    new-instance v0, Lcom/psk/kotlin/util/BasDownLoadActivityPresenter;

    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;

    move-result-object v1

    iget-object v1, v1, Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;->f:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    const-string v3, "binding.recycleView"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getShowDatalist()Ljava/util/List;

    move-result-object v3

    invoke-direct {v0, p2, v1, v3}, Lcom/psk/kotlin/util/BasDownLoadActivityPresenter;-><init>(Landroidx/recyclerview/widget/LinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView;Ljava/util/List;)V

    .line 13
    invoke-virtual {p0, v0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->setDownloadprensenter(Lcom/psk/kotlin/util/BasDownLoadActivityPresenter;)V

    .line 14
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getDownloadprensenter()Lcom/psk/kotlin/util/BasDownLoadActivityPresenter;

    move-result-object p2

    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getAdapter()Lcom/join/kotlin/ui/findgame/adapter/FindHomeChoiceAdapter;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/psk/kotlin/util/BasDownLoadActivityPresenter;->initData(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 15
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getPrensenter()Lcom/join/kotlin/presenter/FindModlePrensenter;

    move-result-object p2

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;

    invoke-virtual {p2, v0, v1}, Lcom/join/kotlin/presenter/FindModlePrensenter;->loadFindChoiceData(Landroid/content/Context;Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;)V

    .line 16
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;

    move-result-object p2

    iget-object p2, p2, Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;->f:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {p2, p3}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setPullRefreshEnabled(Z)V

    .line 17
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;

    move-result-object p2

    iget-object p2, p2, Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;->f:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {p2, p3}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setLoadingMoreEnabled(Z)V

    .line 18
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;

    move-result-object p2

    iget-object p2, p2, Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;->f:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    const/16 p3, 0xa

    invoke-virtual {p2, p3}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setPreLoadCount(I)V

    .line 19
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;

    move-result-object p2

    iget-object p2, p2, Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;->c:Lcom/join/android/app/mgsim/wufun/databinding/FailedLayoutIncludeBinding;

    iget-object p2, p2, Lcom/join/android/app/mgsim/wufun/databinding/FailedLayoutIncludeBinding;->g:Landroid/widget/Button;

    const-string p3, "binding.failedLayoutMain.setNetwork"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment$onCreateView$1;

    invoke-direct {p3, p0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment$onCreateView$1;-><init>(Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;)V

    invoke-static {p2, p3}, Lcom/psk/kotlin/ext/CommonExtKt;->onClick(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    .line 20
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;

    move-result-object p2

    iget-object p2, p2, Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;->c:Lcom/join/android/app/mgsim/wufun/databinding/FailedLayoutIncludeBinding;

    iget-object p2, p2, Lcom/join/android/app/mgsim/wufun/databinding/FailedLayoutIncludeBinding;->f:Landroid/widget/ImageView;

    const-string p3, "binding.failedLayoutMain.relodingimag"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment$onCreateView$2;

    invoke-direct {p3, p0, p1}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment$onCreateView$2;-><init>(Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;Lkotlin/jvm/internal/Ref$ObjectRef;)V

    invoke-static {p2, p3}, Lcom/psk/kotlin/ext/CommonExtKt;->onClick(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    .line 21
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;

    move-result-object p2

    iget-object p2, p2, Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;->f:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    new-instance p3, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment$onCreateView$3;

    invoke-direct {p3, p0, p1}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment$onCreateView$3;-><init>(Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;Lkotlin/jvm/internal/Ref$ObjectRef;)V

    invoke-virtual {p2, p3}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setLoadingListener(Lcom/join/android/app/component/xrecyclerview/XRecyclerView$f;)V

    .line 22
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;->a()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    return-object p1
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/d0;->e(Ljava/lang/Object;)V

    return-void
.end method

.method public onError(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;->f:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {v0}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->loadMoreComplete()V

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0, p1}, Lcom/psk/kotlin/ext/CommonExtKt;->toast(Landroid/content/Context;Ljava/lang/String;)V

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getShowDatalist()Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    :goto_1
    if-nez p1, :cond_3

    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getShowDatalist()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-gtz p1, :cond_4

    .line 4
    :cond_3
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;->e:Lcom/join/android/app/mgsim/wufun/databinding/LodingLayoutIncludeBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/LodingLayoutIncludeBinding;->d:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 5
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;->c:Lcom/join/android/app/mgsim/wufun/databinding/FailedLayoutIncludeBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/FailedLayoutIncludeBinding;->e:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 6
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;->f:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_4
    return-void
.end method

.method public final onEventMainThread(Lcom/join/mgps/event/n;)V
    .locals 1
    .param p1    # Lcom/join/mgps/event/n;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lorg/greenrobot/eventbus/Subscribe;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    const-string v0, "downloadTaskEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getDownloadprensenter()Lcom/psk/kotlin/util/BasDownLoadActivityPresenter;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/psk/kotlin/util/BasDownLoadActivityPresenter;->onEventMainThread(Lcom/join/mgps/event/n;)V

    return-void
.end method

.method public onLoadDataSuccess(ILcom/join/kotlin/ui/findgame/data/FindChoiceResultData;)V
    .locals 12
    .param p2    # Lcom/join/kotlin/ui/findgame/data/FindChoiceResultData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget v0, p0, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->page:I

    if-eq p1, v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_6

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getShowDatalist()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;->f:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {p1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->refreshComplete()V

    .line 4
    invoke-virtual {p2}, Lcom/join/kotlin/ui/findgame/data/FindChoiceResultData;->getBanner()Ljava/util/List;

    move-result-object p1

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    :goto_1
    if-nez p1, :cond_3

    .line 5
    invoke-virtual {p2}, Lcom/join/kotlin/ui/findgame/data/FindChoiceResultData;->getBanner()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Lcom/join/kotlin/ui/findgame/data/FindChoiceBannerData;

    .line 6
    invoke-virtual {v4}, Lcom/join/kotlin/ui/findgame/data/FindChoiceBannerData;->getGame_info()Lcom/join/mgps/business/CollectionBeanSubBusiness;

    move-result-object p1

    const/16 v2, 0x8e

    invoke-virtual {p1, v2}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    .line 7
    invoke-virtual {v4}, Lcom/join/kotlin/ui/findgame/data/FindChoiceBannerData;->getGame_info()Lcom/join/mgps/business/CollectionBeanSubBusiness;

    move-result-object p1

    invoke-virtual {p1, v2}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    .line 8
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getDownloadprensenter()Lcom/psk/kotlin/util/BasDownLoadActivityPresenter;

    move-result-object p1

    invoke-virtual {v4}, Lcom/join/kotlin/ui/findgame/data/FindChoiceBannerData;->getGame_info()Lcom/join/mgps/business/CollectionBeanSubBusiness;

    move-result-object v2

    const-string v3, "choiceBannerData.game_info"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Lcom/psk/kotlin/util/BasDownLoadActivityPresenter;->updateDowState(Lcom/join/mgps/business/CollectionBeanSubBusiness;)V

    .line 9
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getShowDatalist()Ljava/util/List;

    move-result-object p1

    .line 10
    new-instance v9, Lcom/psk/kotlin/util/CommonListMainData;

    const/4 v3, 0x3

    const-string v2, "choiceBannerData"

    .line 11
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0xc

    const/4 v8, 0x0

    move-object v2, v9

    .line 12
    invoke-direct/range {v2 .. v8}, Lcom/psk/kotlin/util/CommonListMainData;-><init>(ILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 13
    invoke-interface {p1, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 14
    :cond_3
    invoke-virtual {p2}, Lcom/join/kotlin/ui/findgame/data/FindChoiceResultData;->getGuess_you_like()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_5

    :cond_4
    const/4 v1, 0x1

    :cond_5
    if-nez v1, :cond_6

    .line 15
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getShowDatalist()Ljava/util/List;

    move-result-object p1

    new-instance v8, Lcom/psk/kotlin/util/CommonListMainData;

    const/4 v2, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xc

    const/4 v7, 0x0

    const-string v3, "\u731c\u4f60\u559c\u6b22"

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, Lcom/psk/kotlin/util/CommonListMainData;-><init>(ILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getShowDatalist()Ljava/util/List;

    move-result-object p1

    .line 17
    new-instance v8, Lcom/psk/kotlin/util/CommonListMainData;

    const/4 v2, 0x4

    .line 18
    invoke-virtual {p2}, Lcom/join/kotlin/ui/findgame/data/FindChoiceResultData;->getGuess_you_like()Ljava/util/List;

    move-result-object v3

    const-string v1, "result.guess_you_like"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, v8

    .line 19
    invoke-direct/range {v1 .. v7}, Lcom/psk/kotlin/util/CommonListMainData;-><init>(ILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 20
    invoke-interface {p1, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    :cond_6
    invoke-virtual {p2}, Lcom/join/kotlin/ui/findgame/data/FindChoiceResultData;->getCollection_list()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/kotlin/ui/findgame/data/FindChoiceColloctionListData;

    .line 22
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getShowDatalist()Ljava/util/List;

    move-result-object v9

    new-instance v10, Lcom/psk/kotlin/util/CommonListMainData;

    const/4 v3, 0x1

    const-string v2, "item"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0xc

    const/4 v8, 0x0

    move-object v2, v10

    move-object v4, v1

    invoke-direct/range {v2 .. v8}, Lcom/psk/kotlin/util/CommonListMainData;-><init>(ILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 23
    invoke-virtual {v1}, Lcom/join/kotlin/ui/findgame/data/FindChoiceColloctionListData;->getGame_list()Ljava/util/List;

    move-result-object v2

    const-string v3, "item.game_list"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/CollectionBeanSub;

    const/16 v5, 0x8c

    .line 25
    invoke-virtual {v4, v5}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    .line 26
    invoke-virtual {v4, v5}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    goto :goto_3

    .line 27
    :cond_7
    invoke-virtual {v1}, Lcom/join/kotlin/ui/findgame/data/FindChoiceColloctionListData;->getView_type()I

    move-result v2

    if-ne v2, v0, :cond_8

    .line 28
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getShowDatalist()Ljava/util/List;

    move-result-object v2

    .line 29
    new-instance v11, Lcom/psk/kotlin/util/CommonListMainData;

    const/4 v5, 0x6

    .line 30
    invoke-virtual {v1}, Lcom/join/kotlin/ui/findgame/data/FindChoiceColloctionListData;->getGame_list()Ljava/util/List;

    move-result-object v6

    invoke-static {v6, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0xc

    const/4 v10, 0x0

    move-object v4, v11

    .line 31
    invoke-direct/range {v4 .. v10}, Lcom/psk/kotlin/util/CommonListMainData;-><init>(ILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 32
    invoke-interface {v2, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 33
    :cond_8
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getShowDatalist()Ljava/util/List;

    move-result-object v2

    .line 34
    new-instance v11, Lcom/psk/kotlin/util/CommonListMainData;

    const/4 v5, 0x5

    .line 35
    invoke-virtual {v1}, Lcom/join/kotlin/ui/findgame/data/FindChoiceColloctionListData;->getGame_list()Ljava/util/List;

    move-result-object v6

    invoke-static {v6, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0xc

    const/4 v10, 0x0

    move-object v4, v11

    .line 36
    invoke-direct/range {v4 .. v10}, Lcom/psk/kotlin/util/CommonListMainData;-><init>(ILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 37
    invoke-interface {v2, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    .line 38
    :cond_9
    invoke-virtual {p2}, Lcom/join/kotlin/ui/findgame/data/FindChoiceResultData;->getCollection_list()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_a

    .line 39
    iget p1, p0, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->page:I

    add-int/2addr p1, v0

    iput p1, p0, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->page:I

    .line 40
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;->f:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {p1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->loadMoreComplete()V

    goto :goto_4

    .line 41
    :cond_a
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;->f:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {p1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setNoMore()V

    .line 42
    :goto_4
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getAdapter()Lcom/join/kotlin/ui/findgame/adapter/FindHomeChoiceAdapter;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method

.method public onLoadDataSuccessV9(ILcom/join/kotlin/ui/findgame/data/FindClassifyResultData;)V
    .locals 0
    .param p2    # Lcom/join/kotlin/ui/findgame/data/FindClassifyResultData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    invoke-static {p0, p1, p2}, Lcom/join/kotlin/presenter/view/FindHomeView$DefaultImpls;->onLoadDataSuccessV9(Lcom/join/kotlin/presenter/view/FindHomeView;ILcom/join/kotlin/ui/findgame/data/FindClassifyResultData;)V

    return-void
.end method

.method public final setAdapter(Lcom/join/kotlin/ui/findgame/adapter/FindHomeChoiceAdapter;)V
    .locals 1
    .param p1    # Lcom/join/kotlin/ui/findgame/adapter/FindHomeChoiceAdapter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->adapter:Lcom/join/kotlin/ui/findgame/adapter/FindHomeChoiceAdapter;

    return-void
.end method

.method public final setBinding(Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;)V
    .locals 1
    .param p1    # Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->binding:Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;

    return-void
.end method

.method public final setDownloadprensenter(Lcom/psk/kotlin/util/BasDownLoadActivityPresenter;)V
    .locals 1
    .param p1    # Lcom/psk/kotlin/util/BasDownLoadActivityPresenter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->downloadprensenter:Lcom/psk/kotlin/util/BasDownLoadActivityPresenter;

    return-void
.end method

.method public final setPage(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->page:I

    return-void
.end method

.method public final setPrensenter(Lcom/join/kotlin/presenter/FindModlePrensenter;)V
    .locals 1
    .param p1    # Lcom/join/kotlin/presenter/FindModlePrensenter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->prensenter:Lcom/join/kotlin/presenter/FindModlePrensenter;

    return-void
.end method

.method public final setRequestArgs(Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;)V
    .locals 1
    .param p1    # Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->requestArgs:Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;

    return-void
.end method

.method public final setShowDatalist(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/psk/kotlin/util/CommonListMainData;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->showDatalist:Ljava/util/List;

    return-void
.end method

.method public showLoding()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;->e:Lcom/join/android/app/mgsim/wufun/databinding/LodingLayoutIncludeBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/LodingLayoutIncludeBinding;->d:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;->c:Lcom/join/android/app/mgsim/wufun/databinding/FailedLayoutIncludeBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/FailedLayoutIncludeBinding;->e:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/FindgameAllfragemntLayoutBinding;->f:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    return-void
.end method
