.class final Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel$getSimilarGames$2;
.super Lkotlin/jvm/internal/Lambda;
.source "GameDetailFragmentViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;->getSimilarGames(Z)V
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
        "Lcom/join/mgps/dto/CollectionBeanSub;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGameDetailFragmentViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameDetailFragmentViewModel.kt\ncom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel$getSimilarGames$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,152:1\n1864#2,3:153\n*S KotlinDebug\n*F\n+ 1 GameDetailFragmentViewModel.kt\ncom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel$getSimilarGames$2\n*L\n128#1:153,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nGameDetailFragmentViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameDetailFragmentViewModel.kt\ncom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel$getSimilarGames$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,152:1\n1864#2,3:153\n*S KotlinDebug\n*F\n+ 1 GameDetailFragmentViewModel.kt\ncom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel$getSimilarGames$2\n*L\n128#1:153,3\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $refresh:Z

.field final synthetic this$0:Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;


# direct methods
.method constructor <init>(Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;Z)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel$getSimilarGames$2;->this$0:Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;

    iput-boolean p2, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel$getSimilarGames$2;->$refresh:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel$getSimilarGames$2;->invoke(Ljava/util/List;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/util/List;)V
    .locals 12
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/join/mgps/dto/CollectionBeanSub;",
            ">;)V"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel$getSimilarGames$2;->this$0:Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;

    invoke-virtual {v0}, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;->getSimilarListPage()Lcom/join/kotlin/quark/model/bean/Page;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/kotlin/quark/model/bean/Page;->getPage()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Lcom/join/kotlin/quark/model/bean/Page;->setPage(I)V

    .line 3
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_1

    const/4 v0, 0x0

    .line 4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v2, v0, 0x1

    if-gez v0, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_0
    check-cast v1, Lcom/join/mgps/dto/CollectionBeanSub;

    .line 5
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v0, v2

    goto :goto_0

    .line 6
    :cond_1
    new-instance p1, Lcom/join/kotlin/base/net/stateCallback/ListDataUiState;

    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 7
    iget-boolean v5, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel$getSimilarGames$2;->$refresh:Z

    .line 8
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    .line 9
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    xor-int/lit8 v7, v0, 0x1

    .line 10
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v8

    const/4 v10, 0x2

    const/4 v11, 0x0

    move-object v2, p1

    .line 11
    invoke-direct/range {v2 .. v11}, Lcom/join/kotlin/base/net/stateCallback/ListDataUiState;-><init>(ZLjava/lang/String;ZZZZLjava/util/ArrayList;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 12
    iget-object v0, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel$getSimilarGames$2;->this$0:Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;

    invoke-virtual {v0}, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;->getSimilarListData()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    return-void
.end method
