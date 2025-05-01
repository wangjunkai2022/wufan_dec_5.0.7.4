.class final Lcom/join/kotlin/zone/CommonZoneActivity$createObserver$1$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "CommonZoneActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/zone/CommonZoneActivity$createObserver$1$1;->invoke(Lcom/join/kotlin/base/state/ResultState;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCommonZoneActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonZoneActivity.kt\ncom/join/kotlin/zone/CommonZoneActivity$createObserver$1$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,299:1\n1855#2:300\n1855#2,2:301\n1856#2:303\n*S KotlinDebug\n*F\n+ 1 CommonZoneActivity.kt\ncom/join/kotlin/zone/CommonZoneActivity$createObserver$1$1$1\n*L\n257#1:300\n267#1:301,2\n257#1:303\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCommonZoneActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonZoneActivity.kt\ncom/join/kotlin/zone/CommonZoneActivity$createObserver$1$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,299:1\n1855#2:300\n1855#2,2:301\n1856#2:303\n*S KotlinDebug\n*F\n+ 1 CommonZoneActivity.kt\ncom/join/kotlin/zone/CommonZoneActivity$createObserver$1$1$1\n*L\n257#1:300\n267#1:301,2\n257#1:303\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $this_run:Lcom/join/kotlin/zone/viewmodel/CommonZoneViewModel;

.field final synthetic this$0:Lcom/join/kotlin/zone/CommonZoneActivity;


# direct methods
.method constructor <init>(Lcom/join/kotlin/zone/viewmodel/CommonZoneViewModel;Lcom/join/kotlin/zone/CommonZoneActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/zone/CommonZoneActivity$createObserver$1$1$1;->$this_run:Lcom/join/kotlin/zone/viewmodel/CommonZoneViewModel;

    iput-object p2, p0, Lcom/join/kotlin/zone/CommonZoneActivity$createObserver$1$1$1;->this$0:Lcom/join/kotlin/zone/CommonZoneActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/zone/CommonZoneActivity$createObserver$1$1$1;->invoke(Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;)V
    .locals 13
    .param p1    # Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x3

    const/4 v2, 0x1

    if-nez p1, :cond_0

    .line 3
    iget-object v3, p0, Lcom/join/kotlin/zone/CommonZoneActivity$createObserver$1$1$1;->$this_run:Lcom/join/kotlin/zone/viewmodel/CommonZoneViewModel;

    invoke-virtual {v3}, Lcom/join/kotlin/zone/viewmodel/CommonZoneViewModel;->getLoadBindData()Landroidx/lifecycle/MutableLiveData;

    move-result-object v3

    .line 4
    new-instance v4, Lcom/join/kotlin/domain/common/LoadBindindData;

    invoke-direct {v4, v1}, Lcom/join/kotlin/domain/common/LoadBindindData;-><init>(I)V

    .line 5
    invoke-virtual {v3, v4}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    goto :goto_0

    .line 6
    :cond_0
    iget-object v3, p0, Lcom/join/kotlin/zone/CommonZoneActivity$createObserver$1$1$1;->$this_run:Lcom/join/kotlin/zone/viewmodel/CommonZoneViewModel;

    invoke-virtual {v3}, Lcom/join/kotlin/zone/viewmodel/CommonZoneViewModel;->getLoadBindData()Landroidx/lifecycle/MutableLiveData;

    move-result-object v3

    .line 7
    new-instance v4, Lcom/join/kotlin/domain/common/LoadBindindData;

    invoke-direct {v4, v2}, Lcom/join/kotlin/domain/common/LoadBindindData;-><init>(I)V

    .line 8
    invoke-virtual {v3, v4}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    :goto_0
    if-eqz p1, :cond_d

    .line 9
    iget-object v3, p0, Lcom/join/kotlin/zone/CommonZoneActivity$createObserver$1$1$1;->this$0:Lcom/join/kotlin/zone/CommonZoneActivity;

    .line 10
    invoke-virtual {v3}, Lcom/join/kotlin/base/activity/BaseVmActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v4

    check-cast v4, Lcom/join/kotlin/zone/viewmodel/CommonZoneViewModel;

    invoke-virtual {v4}, Lcom/join/kotlin/zone/viewmodel/CommonZoneViewModel;->getTitle()Landroidx/lifecycle/MutableLiveData;

    move-result-object v4

    invoke-virtual {p1}, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 11
    invoke-virtual {p1}, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;->getHeadAdInfo()Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v4

    const/16 v5, 0x9f

    if-eqz v4, :cond_1

    .line 12
    invoke-virtual {p1}, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;->getHeadAdInfo()Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 13
    invoke-virtual {v4, v5}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    .line 14
    invoke-virtual {v4, v5}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    .line 15
    new-instance v4, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;

    const/4 v7, 0x1

    const/4 v8, 0x0

    .line 16
    invoke-virtual {p1}, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;->getHeadAdInfo()Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v9

    const/4 v10, 0x2

    const/4 v11, 0x0

    move-object v6, v4

    .line 17
    invoke-direct/range {v6 .. v11}, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;-><init>(ILjava/lang/Integer;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 18
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 19
    :cond_1
    invoke-virtual {p1}, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;->getRecGameInfo()Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v4

    if-eqz v4, :cond_5

    .line 20
    invoke-virtual {p1}, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;->getRecGameInfo()Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 21
    invoke-virtual {v4, v5}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    .line 22
    invoke-virtual {v4, v5}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    .line 23
    :cond_2
    new-instance v4, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;

    .line 24
    invoke-virtual {p1}, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;->getRecGameInfo()Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-virtual {v6}, Lcom/join/mgps/dto/CommonGameInfoBean;->getV_url()Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    :cond_3
    const/4 v6, 0x0

    :goto_1
    invoke-static {v6}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/4 v1, 0x6

    const/4 v7, 0x6

    goto :goto_2

    :cond_4
    const/4 v7, 0x3

    :goto_2
    const/4 v8, 0x0

    .line 25
    invoke-virtual {p1}, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;->getRecGameInfo()Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v9

    const/4 v10, 0x2

    const/4 v11, 0x0

    move-object v6, v4

    .line 26
    invoke-direct/range {v6 .. v11}, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;-><init>(ILjava/lang/Integer;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 27
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 28
    :cond_5
    invoke-virtual {p1}, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;->getComponents()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_c

    .line 29
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/kotlin/zone/model/bean/ZoneComponentsBean;

    .line 30
    invoke-virtual {v1}, Lcom/join/kotlin/zone/model/bean/ZoneComponentsBean;->getTitle()Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x0

    if-eqz v4, :cond_8

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-lez v4, :cond_7

    const/4 v4, 0x1

    goto :goto_3

    :cond_7
    const/4 v4, 0x0

    :goto_3
    if-ne v4, v2, :cond_8

    const/4 v6, 0x1

    :cond_8
    if-eqz v6, :cond_9

    .line 31
    new-instance v4, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;

    const/4 v8, 0x2

    const/4 v9, 0x0

    .line 32
    invoke-virtual {v1}, Lcom/join/kotlin/zone/model/bean/ZoneComponentsBean;->getTitle()Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x2

    const/4 v12, 0x0

    move-object v7, v4

    .line 33
    invoke-direct/range {v7 .. v12}, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;-><init>(ILjava/lang/Integer;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 34
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 35
    :cond_9
    invoke-virtual {v1}, Lcom/join/kotlin/zone/model/bean/ZoneComponentsBean;->getGameInfoList()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_6

    .line 36
    invoke-virtual {v1}, Lcom/join/kotlin/zone/model/bean/ZoneComponentsBean;->getGameInfoList()Ljava/util/List;

    move-result-object v1

    .line 37
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v9, v4

    check-cast v9, Lcom/join/mgps/dto/CommonGameInfoBean;

    if-eqz v9, :cond_a

    .line 38
    invoke-virtual {v9, v5}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    .line 39
    invoke-virtual {v9, v5}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    .line 40
    :cond_a
    new-instance v4, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;

    .line 41
    invoke-virtual {v9}, Lcom/join/mgps/dto/CommonGameInfoBean;->getTpl_type()I

    move-result v6

    if-ne v6, v2, :cond_b

    const/4 v6, 0x4

    const/4 v7, 0x4

    goto :goto_5

    :cond_b
    const/4 v6, 0x5

    const/4 v7, 0x5

    :goto_5
    const/4 v8, 0x0

    const/4 v10, 0x2

    const/4 v11, 0x0

    move-object v6, v4

    .line 42
    invoke-direct/range {v6 .. v11}, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;-><init>(ILjava/lang/Integer;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 43
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 44
    :cond_c
    invoke-virtual {v3}, Lcom/join/kotlin/base/activity/BaseVmActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object p1

    check-cast p1, Lcom/join/kotlin/zone/viewmodel/CommonZoneViewModel;

    invoke-virtual {p1, v0}, Lcom/join/kotlin/zone/viewmodel/CommonZoneViewModel;->setShowData(Ljava/util/List;)V

    .line 45
    invoke-virtual {v3}, Lcom/join/kotlin/zone/CommonZoneActivity;->getCommonZoneAdapter()Lcom/join/kotlin/zone/adapter/CommonZoneAdapter;

    move-result-object p1

    invoke-virtual {v3}, Lcom/join/kotlin/base/activity/BaseVmActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/zone/viewmodel/CommonZoneViewModel;

    invoke-virtual {v0}, Lcom/join/kotlin/zone/viewmodel/CommonZoneViewModel;->getShowData()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->submitList(Ljava/util/List;)V

    .line 46
    invoke-virtual {v3}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityCommonZoneBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityCommonZoneBinding;->d:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    invoke-virtual {p1}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->loadMoreComplete()V

    .line 47
    invoke-virtual {v3}, Lcom/join/kotlin/zone/CommonZoneActivity;->autoPlay()V

    :cond_d
    return-void
.end method
