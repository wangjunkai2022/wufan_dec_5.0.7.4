.class public final Lcom/join/kotlin/EverdayNewFragment$loadData$1;
.super Ljava/lang/Object;
.source "EverdayNewFragment.kt"

# interfaces
.implements Lretrofit2/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/EverdayNewFragment;->loadData(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lretrofit2/Callback<",
        "Lcom/join/mgps/dto/ResponseModel<",
        "Lcom/join/kotlin/ui/findgame/data/EverdayNewResultData;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic $page:I

.field final synthetic this$0:Lcom/join/kotlin/EverdayNewFragment;


# direct methods
.method constructor <init>(Lcom/join/kotlin/EverdayNewFragment;I)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/EverdayNewFragment$loadData$1;->this$0:Lcom/join/kotlin/EverdayNewFragment;

    iput p2, p0, Lcom/join/kotlin/EverdayNewFragment$loadData$1;->$page:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 1
    .param p1    # Lretrofit2/Call;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/kotlin/ui/findgame/data/EverdayNewResultData;",
            ">;>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p1, "t"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method public onResponse(Lretrofit2/Call;Lretrofit2/Response;)V
    .locals 2
    .param p1    # Lretrofit2/Call;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lretrofit2/Response;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/kotlin/ui/findgame/data/EverdayNewResultData;",
            ">;>;",
            "Lretrofit2/Response<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/kotlin/ui/findgame/data/EverdayNewResultData;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "responsex"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 2
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast p1, Lcom/join/mgps/dto/ResponseModel;

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result p2

    const/16 v0, 0xc8

    if-ne p2, v0, :cond_1

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/kotlin/ui/findgame/data/EverdayNewResultData;

    .line 5
    iget-object p2, p0, Lcom/join/kotlin/EverdayNewFragment$loadData$1;->this$0:Lcom/join/kotlin/EverdayNewFragment;

    invoke-virtual {p2}, Lcom/join/kotlin/EverdayNewFragment;->hidLoading()V

    if-eqz p1, :cond_0

    .line 6
    invoke-virtual {p1}, Lcom/join/kotlin/ui/findgame/data/EverdayNewResultData;->getGame_list()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lcom/join/kotlin/ui/findgame/data/EverdayNewResultData;->getGame_list()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    if-lez p2, :cond_0

    .line 7
    iget-object p2, p0, Lcom/join/kotlin/EverdayNewFragment$loadData$1;->this$0:Lcom/join/kotlin/EverdayNewFragment;

    iget v0, p0, Lcom/join/kotlin/EverdayNewFragment$loadData$1;->$page:I

    invoke-virtual {p1}, Lcom/join/kotlin/ui/findgame/data/EverdayNewResultData;->getGame_list()Ljava/util/List;

    move-result-object p1

    const-string v1, "data.game_list"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v0, p1}, Lcom/join/kotlin/EverdayNewFragment;->loadFinish(ILjava/util/List;)V

    .line 8
    iget-object p1, p0, Lcom/join/kotlin/EverdayNewFragment$loadData$1;->this$0:Lcom/join/kotlin/EverdayNewFragment;

    invoke-virtual {p1}, Lcom/join/kotlin/EverdayNewFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;->e:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {p1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->loadMoreComplete()V

    return-void

    .line 9
    :cond_0
    iget-object p1, p0, Lcom/join/kotlin/EverdayNewFragment$loadData$1;->this$0:Lcom/join/kotlin/EverdayNewFragment;

    invoke-virtual {p1}, Lcom/join/kotlin/EverdayNewFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;->e:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {p1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setNoMore()V

    return-void

    .line 10
    :cond_1
    iget-object p1, p0, Lcom/join/kotlin/EverdayNewFragment$loadData$1;->this$0:Lcom/join/kotlin/EverdayNewFragment;

    invoke-virtual {p1}, Lcom/join/kotlin/EverdayNewFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewFragmentBinding;->e:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {p1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->loadMoreComplete()V

    .line 11
    :cond_2
    iget-object p1, p0, Lcom/join/kotlin/EverdayNewFragment$loadData$1;->this$0:Lcom/join/kotlin/EverdayNewFragment;

    invoke-virtual {p1}, Lcom/join/kotlin/EverdayNewFragment;->hidLoading()V

    return-void
.end method
