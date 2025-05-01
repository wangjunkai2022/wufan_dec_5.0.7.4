.class final Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment$initData$4;
.super Lkotlin/jvm/internal/Lambda;
.source "GameDetailEmusCloudListFragment.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment;->initData()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/join/mgps/dto/ArchiveShopDataBean;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment;


# direct methods
.method constructor <init>(Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment$initData$4;->this$0:Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/join/mgps/dto/ArchiveShopDataBean;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment$initData$4;->invoke(Lcom/join/mgps/dto/ArchiveShopDataBean;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/join/mgps/dto/ArchiveShopDataBean;)V
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_7

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/ArchiveShopDataBean;->getCode()I

    move-result v2

    const/16 v3, 0x258

    if-ne v2, v3, :cond_7

    .line 3
    iget-object v2, p0, Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment$initData$4;->this$0:Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment;

    invoke-virtual {v2}, Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudViewModle;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudViewModle;->getLoadBindData()Landroidx/lifecycle/MutableLiveData;

    move-result-object v2

    .line 4
    new-instance v3, Lcom/join/kotlin/domain/common/LoadBindindData;

    invoke-direct {v3, v1}, Lcom/join/kotlin/domain/common/LoadBindindData;-><init>(I)V

    .line 5
    invoke-virtual {v2, v3}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 6
    invoke-virtual {p1}, Lcom/join/mgps/dto/ArchiveShopDataBean;->getData_info()Lcom/join/mgps/dto/ArchiveShopDataBean$DataInfoBean;

    move-result-object v2

    .line 7
    invoke-virtual {p1}, Lcom/join/mgps/dto/ArchiveShopDataBean;->getData_info()Lcom/join/mgps/dto/ArchiveShopDataBean$DataInfoBean;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/dto/ArchiveShopDataBean$DataInfoBean;->getPn()I

    move-result v3

    if-ne v3, v1, :cond_1

    .line 8
    iget-object v3, p0, Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment$initData$4;->this$0:Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment;

    invoke-virtual {v3}, Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudViewModle;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudViewModle;->getListArchive()Landroidx/lifecycle/MutableLiveData;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    if-eqz v3, :cond_0

    invoke-interface {v3}, Ljava/util/List;->clear()V

    .line 9
    :cond_0
    iget-object v3, p0, Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment$initData$4;->this$0:Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment;

    invoke-virtual {v3}, Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment;->getAdapterx()Lcom/join/kotlin/ui/cloudarchive/adapter/EmusArchiveAdapter;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_1
    if-eqz v2, :cond_4

    .line 10
    invoke-virtual {v2}, Lcom/join/mgps/dto/ArchiveShopDataBean$DataInfoBean;->getMarketList()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    .line 11
    :cond_2
    iget-object v0, p0, Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment$initData$4;->this$0:Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment;

    invoke-virtual {v0}, Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment;->getPage()I

    move-result v2

    add-int/2addr v2, v1

    invoke-virtual {v0, v2}, Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment;->setPage(I)V

    .line 12
    iget-object v0, p0, Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment$initData$4;->this$0:Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment;

    invoke-virtual {v0}, Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/GameDetailEmusCloudListLayoutDatabindingBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/GameDetailEmusCloudListLayoutDatabindingBinding;->c:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {v0}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->loadMoreComplete()V

    .line 13
    iget-object v0, p0, Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment$initData$4;->this$0:Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment;

    invoke-virtual {v0}, Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudViewModle;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudViewModle;->getListArchive()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lcom/join/mgps/dto/ArchiveShopDataBean;->getData_info()Lcom/join/mgps/dto/ArchiveShopDataBean$DataInfoBean;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/dto/ArchiveShopDataBean$DataInfoBean;->getMarketList()Ljava/util/List;

    move-result-object p1

    const-string v1, "it.data_info.marketList"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 14
    :cond_3
    iget-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment$initData$4;->this$0:Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment;

    invoke-virtual {p1}, Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment;->getAdapterx()Lcom/join/kotlin/ui/cloudarchive/adapter/EmusArchiveAdapter;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    goto/16 :goto_2

    .line 15
    :cond_4
    :goto_0
    iget-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment$initData$4;->this$0:Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment;

    invoke-virtual {p1}, Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudViewModle;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudViewModle;->getListArchive()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_5

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-nez p1, :cond_5

    const/4 v0, 0x1

    :cond_5
    if-eqz v0, :cond_6

    .line 16
    iget-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment$initData$4;->this$0:Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment;

    invoke-virtual {p1}, Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudViewModle;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudViewModle;->getLoadBindData()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    .line 17
    new-instance v0, Lcom/join/kotlin/domain/common/LoadBindindData;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lcom/join/kotlin/domain/common/LoadBindindData;-><init>(I)V

    .line 18
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 19
    :cond_6
    iget-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment$initData$4;->this$0:Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment;

    invoke-virtual {p1}, Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/GameDetailEmusCloudListLayoutDatabindingBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/GameDetailEmusCloudListLayoutDatabindingBinding;->c:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {p1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setNoMore()V

    goto/16 :goto_2

    .line 20
    :cond_7
    iget-object v2, p0, Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment$initData$4;->this$0:Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment;

    invoke-virtual {v2}, Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudViewModle;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudViewModle;->getListArchive()Landroidx/lifecycle/MutableLiveData;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_8

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-nez v2, :cond_8

    const/4 v2, 0x1

    goto :goto_1

    :cond_8
    const/4 v2, 0x0

    :goto_1
    if-nez v2, :cond_9

    .line 21
    iget-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment$initData$4;->this$0:Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment;

    invoke-virtual {p1}, Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudViewModle;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudViewModle;->getLoadBindData()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    .line 22
    new-instance v0, Lcom/join/kotlin/domain/common/LoadBindindData;

    invoke-direct {v0, v1}, Lcom/join/kotlin/domain/common/LoadBindindData;-><init>(I)V

    .line 23
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    return-void

    :cond_9
    if-eqz p1, :cond_c

    .line 24
    invoke-virtual {p1}, Lcom/join/mgps/dto/ArchiveShopDataBean;->getData_info()Lcom/join/mgps/dto/ArchiveShopDataBean$DataInfoBean;

    move-result-object v2

    if-eqz v2, :cond_a

    invoke-virtual {p1}, Lcom/join/mgps/dto/ArchiveShopDataBean;->getData_info()Lcom/join/mgps/dto/ArchiveShopDataBean$DataInfoBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/ArchiveShopDataBean$DataInfoBean;->getPn()I

    move-result v2

    if-eq v2, v1, :cond_a

    invoke-virtual {p1}, Lcom/join/mgps/dto/ArchiveShopDataBean;->getData_info()Lcom/join/mgps/dto/ArchiveShopDataBean$DataInfoBean;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/dto/ArchiveShopDataBean$DataInfoBean;->getPn()I

    move-result p1

    if-nez p1, :cond_c

    .line 25
    :cond_a
    iget-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment$initData$4;->this$0:Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment;

    invoke-virtual {p1}, Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudViewModle;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudViewModle;->getListArchive()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_b

    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 26
    :cond_b
    iget-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment$initData$4;->this$0:Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment;

    invoke-virtual {p1}, Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment;->getAdapterx()Lcom/join/kotlin/ui/cloudarchive/adapter/EmusArchiveAdapter;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 27
    :cond_c
    iget-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment$initData$4;->this$0:Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment;

    invoke-virtual {p1}, Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudViewModle;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudViewModle;->getListArchive()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_d

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-nez p1, :cond_d

    const/4 v0, 0x1

    :cond_d
    if-eqz v0, :cond_e

    .line 28
    iget-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment$initData$4;->this$0:Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment;

    invoke-virtual {p1}, Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudListFragment;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudViewModle;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/cloudarchive/GameDetailEmusCloudViewModle;->getLoadBindData()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    .line 29
    new-instance v0, Lcom/join/kotlin/domain/common/LoadBindindData;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lcom/join/kotlin/domain/common/LoadBindindData;-><init>(I)V

    .line 30
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    :cond_e
    :goto_2
    return-void
.end method
