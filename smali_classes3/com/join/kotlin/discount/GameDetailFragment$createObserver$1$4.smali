.class final Lcom/join/kotlin/discount/GameDetailFragment$createObserver$1$4;
.super Lkotlin/jvm/internal/Lambda;
.source "GameDetailFragment.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/discount/GameDetailFragment;->createObserver()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/join/kotlin/base/net/stateCallback/ListDataUiState<",
        "Lcom/join/mgps/dto/CollectionBeanSub;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/discount/GameDetailFragment;


# direct methods
.method constructor <init>(Lcom/join/kotlin/discount/GameDetailFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/discount/GameDetailFragment$createObserver$1$4;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/join/kotlin/base/net/stateCallback/ListDataUiState;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/discount/GameDetailFragment$createObserver$1$4;->invoke(Lcom/join/kotlin/base/net/stateCallback/ListDataUiState;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/join/kotlin/base/net/stateCallback/ListDataUiState;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/kotlin/base/net/stateCallback/ListDataUiState<",
            "Lcom/join/mgps/dto/CollectionBeanSub;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-virtual {p1}, Lcom/join/kotlin/base/net/stateCallback/ListDataUiState;->isRefresh()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/kotlin/discount/GameDetailFragment$createObserver$1$4;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-static {v0}, Lcom/join/kotlin/discount/GameDetailFragment;->access$getSimilarAdapter(Lcom/join/kotlin/discount/GameDetailFragment;)Lcom/join/kotlin/discount/adapter/GameDetailSimilarGameAdapter;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/kotlin/base/net/stateCallback/ListDataUiState;->getListData()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->submitList(Ljava/util/List;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/kotlin/discount/GameDetailFragment$createObserver$1$4;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-static {v0}, Lcom/join/kotlin/discount/GameDetailFragment;->access$getSimilarAdapter(Lcom/join/kotlin/discount/GameDetailFragment;)Lcom/join/kotlin/discount/adapter/GameDetailSimilarGameAdapter;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/kotlin/base/net/stateCallback/ListDataUiState;->getListData()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->addAll(Ljava/util/Collection;)V

    .line 5
    :goto_0
    iget-object v0, p0, Lcom/join/kotlin/discount/GameDetailFragment$createObserver$1$4;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-virtual {v0}, Lcom/join/kotlin/base/fragment/BaseVmDbFragment;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/FragmentDiscountGameDetailV2Binding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/FragmentDiscountGameDetailV2Binding;->D:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    invoke-virtual {v0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->loadMoreComplete()V

    .line 6
    invoke-virtual {p1}, Lcom/join/kotlin/base/net/stateCallback/ListDataUiState;->getListData()Ljava/util/ArrayList;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 p1, 0x1

    :goto_2
    if-eqz p1, :cond_3

    .line 7
    iget-object p1, p0, Lcom/join/kotlin/discount/GameDetailFragment$createObserver$1$4;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-virtual {p1}, Lcom/join/kotlin/base/fragment/BaseVmDbFragment;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/FragmentDiscountGameDetailV2Binding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/FragmentDiscountGameDetailV2Binding;->D:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    invoke-virtual {p1}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->setNoMore()V

    :cond_3
    return-void
.end method
