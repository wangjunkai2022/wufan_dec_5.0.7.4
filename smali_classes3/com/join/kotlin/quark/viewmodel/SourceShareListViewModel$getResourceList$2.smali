.class final Lcom/join/kotlin/quark/viewmodel/SourceShareListViewModel$getResourceList$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceShareListViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/quark/viewmodel/SourceShareListViewModel;->getResourceList(ZILjava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/util/ArrayList<",
        "Lcom/join/kotlin/quark/model/bean/SourceListItemBean;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic $refresh:Z

.field final synthetic this$0:Lcom/join/kotlin/quark/viewmodel/SourceShareListViewModel;


# direct methods
.method constructor <init>(Lcom/join/kotlin/quark/viewmodel/SourceShareListViewModel;Z)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/quark/viewmodel/SourceShareListViewModel$getResourceList$2;->this$0:Lcom/join/kotlin/quark/viewmodel/SourceShareListViewModel;

    iput-boolean p2, p0, Lcom/join/kotlin/quark/viewmodel/SourceShareListViewModel$getResourceList$2;->$refresh:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/quark/viewmodel/SourceShareListViewModel$getResourceList$2;->invoke(Ljava/util/ArrayList;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/util/ArrayList;)V
    .locals 13
    .param p1    # Ljava/util/ArrayList;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/join/kotlin/quark/model/bean/SourceListItemBean;",
            ">;)V"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/join/kotlin/quark/viewmodel/SourceShareListViewModel$getResourceList$2;->this$0:Lcom/join/kotlin/quark/viewmodel/SourceShareListViewModel;

    invoke-virtual {v0}, Lcom/join/kotlin/quark/viewmodel/SourceShareListViewModel;->getPage()Lcom/join/kotlin/quark/model/bean/Page;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/kotlin/quark/model/bean/Page;->getPage()I

    move-result v1

    const/4 v2, 0x1

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/join/kotlin/quark/model/bean/Page;->setPage(I)V

    if-eqz p1, :cond_0

    move-object v0, p1

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v7

    .line 4
    new-instance v0, Lcom/join/kotlin/base/net/stateCallback/ListDataUiState;

    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 5
    iget-boolean v6, p0, Lcom/join/kotlin/quark/viewmodel/SourceShareListViewModel$getResourceList$2;->$refresh:Z

    if-eqz p1, :cond_1

    .line 6
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v3, 0x0

    if-lez v1, :cond_2

    const/4 v8, 0x1

    goto :goto_2

    :cond_2
    const/4 v8, 0x0

    .line 7
    :goto_2
    iget-boolean v1, p0, Lcom/join/kotlin/quark/viewmodel/SourceShareListViewModel$getResourceList$2;->$refresh:Z

    if-eqz v1, :cond_3

    if-eqz v7, :cond_3

    const/4 v9, 0x1

    goto :goto_3

    :cond_3
    const/4 v9, 0x0

    :goto_3
    const/4 v11, 0x2

    const/4 v12, 0x0

    move-object v3, v0

    move-object v10, p1

    .line 8
    invoke-direct/range {v3 .. v12}, Lcom/join/kotlin/base/net/stateCallback/ListDataUiState;-><init>(ZLjava/lang/String;ZZZZLjava/util/ArrayList;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 9
    iget-object p1, p0, Lcom/join/kotlin/quark/viewmodel/SourceShareListViewModel$getResourceList$2;->this$0:Lcom/join/kotlin/quark/viewmodel/SourceShareListViewModel;

    invoke-virtual {p1}, Lcom/join/kotlin/quark/viewmodel/SourceShareListViewModel;->getListData()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    return-void
.end method
