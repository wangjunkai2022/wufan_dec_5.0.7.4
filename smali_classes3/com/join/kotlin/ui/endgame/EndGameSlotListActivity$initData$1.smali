.class final Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity$initData$1;
.super Lkotlin/jvm/internal/Lambda;
.source "EndGameSlotListActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->initData()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/util/List<",
        "Lcom/join/mgps/dto/ArchiveListBean;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;


# direct methods
.method constructor <init>(Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity$initData$1;->this$0:Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity$initData$1;->invoke(Ljava/util/List;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/ArchiveListBean;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_3

    .line 2
    iget-object v2, p0, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity$initData$1;->this$0:Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;

    invoke-virtual {v2}, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->getViewModle()Lcom/join/kotlin/ui/endgame/EndGameSlotViewModel;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/kotlin/ui/endgame/EndGameSlotViewModel;->getLoadBindData()Landroidx/lifecycle/MutableLiveData;

    move-result-object v2

    .line 3
    new-instance v3, Lcom/join/kotlin/domain/common/LoadBindindData;

    invoke-direct {v3, v0}, Lcom/join/kotlin/domain/common/LoadBindindData;-><init>(I)V

    .line 4
    invoke-virtual {v2, v3}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 5
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 6
    iget-object p1, p0, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity$initData$1;->this$0:Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;

    invoke-virtual {p1}, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->getViewModle()Lcom/join/kotlin/ui/endgame/EndGameSlotViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/endgame/EndGameSlotViewModel;->getListArchive()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 7
    iget-object p1, p0, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity$initData$1;->this$0:Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;

    invoke-virtual {p1}, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->getViewModle()Lcom/join/kotlin/ui/endgame/EndGameSlotViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/endgame/EndGameSlotViewModel;->getLoadBindData()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    .line 8
    new-instance v0, Lcom/join/kotlin/domain/common/LoadBindindData;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lcom/join/kotlin/domain/common/LoadBindindData;-><init>(I)V

    .line 9
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 10
    :cond_1
    iget-object p1, p0, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity$initData$1;->this$0:Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;

    invoke-virtual {p1}, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {p1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setNoMore()V

    goto/16 :goto_3

    .line 11
    :cond_2
    iget-object v0, p0, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity$initData$1;->this$0:Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;

    invoke-virtual {v0}, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->getAdapterx()Lcom/join/kotlin/ui/endgame/adapter/EndGameSlotListAdapter;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/kotlin/domain/adapter/BaseDataBindingAdapter;->setListDatas(Ljava/util/List;)V

    .line 12
    iget-object p1, p0, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity$initData$1;->this$0:Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;

    invoke-virtual {p1}, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {p1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->loadMoreComplete()V

    .line 13
    iget-object p1, p0, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity$initData$1;->this$0:Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;

    invoke-virtual {p1}, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->getAdapterx()Lcom/join/kotlin/ui/endgame/adapter/EndGameSlotListAdapter;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    goto :goto_3

    .line 14
    :cond_3
    iget-object p1, p0, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity$initData$1;->this$0:Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;

    invoke-virtual {p1}, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->getViewModle()Lcom/join/kotlin/ui/endgame/EndGameSlotViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/endgame/EndGameSlotViewModel;->getListArchive()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_4

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-nez p1, :cond_4

    const/4 p1, 0x1

    goto :goto_1

    :cond_4
    const/4 p1, 0x0

    :goto_1
    if-nez p1, :cond_5

    .line 15
    iget-object p1, p0, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity$initData$1;->this$0:Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;

    invoke-virtual {p1}, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->getViewModle()Lcom/join/kotlin/ui/endgame/EndGameSlotViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/endgame/EndGameSlotViewModel;->getLoadBindData()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    .line 16
    new-instance v2, Lcom/join/kotlin/domain/common/LoadBindindData;

    invoke-direct {v2, v0}, Lcom/join/kotlin/domain/common/LoadBindindData;-><init>(I)V

    .line 17
    invoke-virtual {p1, v2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 18
    :cond_5
    iget-object p1, p0, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity$initData$1;->this$0:Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;

    invoke-virtual {p1}, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->getViewModle()Lcom/join/kotlin/ui/endgame/EndGameSlotViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/endgame/EndGameSlotViewModel;->getListArchive()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_6

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-nez p1, :cond_6

    goto :goto_2

    :cond_6
    const/4 v0, 0x0

    :goto_2
    if-eqz v0, :cond_7

    .line 19
    iget-object p1, p0, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity$initData$1;->this$0:Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;

    invoke-virtual {p1}, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;->getViewModle()Lcom/join/kotlin/ui/endgame/EndGameSlotViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/endgame/EndGameSlotViewModel;->getLoadBindData()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    .line 20
    new-instance v0, Lcom/join/kotlin/domain/common/LoadBindindData;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lcom/join/kotlin/domain/common/LoadBindindData;-><init>(I)V

    .line 21
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    :cond_7
    :goto_3
    return-void
.end method
