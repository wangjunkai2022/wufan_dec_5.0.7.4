.class final Lcom/join/kotlin/discount/viewmodel/GameDetailServerBookDialogViewModel$getServerList$2;
.super Lkotlin/jvm/internal/Lambda;
.source "GameDetailServerBookDialogViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/discount/viewmodel/GameDetailServerBookDialogViewModel;->getServerList()V
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
        "+",
        "Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGameDetailServerBookDialogViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameDetailServerBookDialogViewModel.kt\ncom/join/kotlin/discount/viewmodel/GameDetailServerBookDialogViewModel$getServerList$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,55:1\n1855#2,2:56\n*S KotlinDebug\n*F\n+ 1 GameDetailServerBookDialogViewModel.kt\ncom/join/kotlin/discount/viewmodel/GameDetailServerBookDialogViewModel$getServerList$2\n*L\n30#1:56,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nGameDetailServerBookDialogViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameDetailServerBookDialogViewModel.kt\ncom/join/kotlin/discount/viewmodel/GameDetailServerBookDialogViewModel$getServerList$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,55:1\n1855#2,2:56\n*S KotlinDebug\n*F\n+ 1 GameDetailServerBookDialogViewModel.kt\ncom/join/kotlin/discount/viewmodel/GameDetailServerBookDialogViewModel$getServerList$2\n*L\n30#1:56,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/discount/viewmodel/GameDetailServerBookDialogViewModel;


# direct methods
.method constructor <init>(Lcom/join/kotlin/discount/viewmodel/GameDetailServerBookDialogViewModel;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailServerBookDialogViewModel$getServerList$2;->this$0:Lcom/join/kotlin/discount/viewmodel/GameDetailServerBookDialogViewModel;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/discount/viewmodel/GameDetailServerBookDialogViewModel$getServerList$2;->invoke(Ljava/util/List;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/util/List;)V
    .locals 10
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;",
            ">;)V"
        }
    .end annotation

    .line 2
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_0

    .line 3
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->filterNotNull(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;

    .line 5
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 6
    :cond_0
    new-instance p1, Lcom/join/kotlin/base/net/stateCallback/ListDataUiState;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 7
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    const/4 v5, 0x0

    .line 8
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    const/4 v8, 0x2

    const/4 v9, 0x0

    move-object v0, p1

    .line 9
    invoke-direct/range {v0 .. v9}, Lcom/join/kotlin/base/net/stateCallback/ListDataUiState;-><init>(ZLjava/lang/String;ZZZZLjava/util/ArrayList;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 10
    iget-object v0, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailServerBookDialogViewModel$getServerList$2;->this$0:Lcom/join/kotlin/discount/viewmodel/GameDetailServerBookDialogViewModel;

    invoke-virtual {v0}, Lcom/join/kotlin/discount/viewmodel/GameDetailServerBookDialogViewModel;->getListData()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    return-void
.end method
