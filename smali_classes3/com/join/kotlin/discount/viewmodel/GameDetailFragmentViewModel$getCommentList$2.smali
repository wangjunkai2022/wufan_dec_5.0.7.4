.class final Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel$getCommentList$2;
.super Lkotlin/jvm/internal/Lambda;
.source "GameDetailFragmentViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;->getCommentList()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/join/kotlin/discount/model/bean/CommentDataBean;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGameDetailFragmentViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameDetailFragmentViewModel.kt\ncom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel$getCommentList$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,152:1\n1864#2,3:153\n*S KotlinDebug\n*F\n+ 1 GameDetailFragmentViewModel.kt\ncom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel$getCommentList$2\n*L\n72#1:153,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nGameDetailFragmentViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameDetailFragmentViewModel.kt\ncom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel$getCommentList$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,152:1\n1864#2,3:153\n*S KotlinDebug\n*F\n+ 1 GameDetailFragmentViewModel.kt\ncom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel$getCommentList$2\n*L\n72#1:153,3\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;


# direct methods
.method constructor <init>(Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel$getCommentList$2;->this$0:Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/join/kotlin/discount/model/bean/CommentDataBean;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel$getCommentList$2;->invoke(Lcom/join/kotlin/discount/model/bean/CommentDataBean;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/join/kotlin/discount/model/bean/CommentDataBean;)V
    .locals 10
    .param p1    # Lcom/join/kotlin/discount/model/bean/CommentDataBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 2
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x1

    if-eqz p1, :cond_2

    .line 3
    invoke-virtual {p1}, Lcom/join/kotlin/discount/model/bean/CommentDataBean;->getCommentList()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_2

    const/4 v2, 0x0

    .line 4
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v4, v2, 0x1

    if-gez v2, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_0
    check-cast v3, Lcom/join/kotlin/discount/model/bean/CommentDetailBean;

    if-gt v2, v0, :cond_1

    .line 5
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    move v2, v4

    goto :goto_0

    :cond_2
    if-eqz p1, :cond_3

    .line 6
    invoke-virtual {p1}, Lcom/join/kotlin/discount/model/bean/CommentDataBean;->getCommentScores()Lcom/join/kotlin/discount/model/bean/CommentStatisticDataBean;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v1, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel$getCommentList$2;->this$0:Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;

    .line 7
    invoke-virtual {v1}, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;->getCommentStatistic()Landroidx/lifecycle/MutableLiveData;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 8
    :cond_3
    new-instance p1, Lcom/join/kotlin/base/net/stateCallback/ListDataUiState;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 9
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    .line 10
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    xor-int/2addr v5, v0

    .line 11
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    const/4 v8, 0x2

    const/4 v9, 0x0

    move-object v0, p1

    .line 12
    invoke-direct/range {v0 .. v9}, Lcom/join/kotlin/base/net/stateCallback/ListDataUiState;-><init>(ZLjava/lang/String;ZZZZLjava/util/ArrayList;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 13
    iget-object v0, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel$getCommentList$2;->this$0:Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;

    invoke-virtual {v0}, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;->getCommentListData()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    return-void
.end method
