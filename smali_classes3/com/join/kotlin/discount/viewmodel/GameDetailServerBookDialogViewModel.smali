.class public final Lcom/join/kotlin/discount/viewmodel/GameDetailServerBookDialogViewModel;
.super Lcom/join/kotlin/base/viewmodel/BaseViewModel;
.source "GameDetailServerBookDialogViewModel.kt"


# instance fields
.field private gameId:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final listData:Landroidx/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Lcom/join/kotlin/base/net/stateCallback/ListDataUiState<",
            "Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final subscribeResultBean:Landroidx/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final title:Landroidx/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/join/kotlin/base/viewmodel/BaseViewModel;-><init>()V

    .line 2
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    const-string/jumbo v1, "\u6807\u9898"

    invoke-direct {v0, v1}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailServerBookDialogViewModel;->title:Landroidx/lifecycle/MutableLiveData;

    .line 3
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    iput-object v0, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailServerBookDialogViewModel;->listData:Landroidx/lifecycle/MutableLiveData;

    .line 4
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    iput-object v0, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailServerBookDialogViewModel;->subscribeResultBean:Landroidx/lifecycle/MutableLiveData;

    return-void
.end method


# virtual methods
.method public final getGameId()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailServerBookDialogViewModel;->gameId:Ljava/lang/String;

    return-object v0
.end method

.method public final getListData()Landroidx/lifecycle/MutableLiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/MutableLiveData<",
            "Lcom/join/kotlin/base/net/stateCallback/ListDataUiState<",
            "Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailServerBookDialogViewModel;->listData:Landroidx/lifecycle/MutableLiveData;

    return-object v0
.end method

.method public final getServerList()V
    .locals 8

    .line 1
    new-instance v1, Lcom/join/kotlin/discount/viewmodel/GameDetailServerBookDialogViewModel$getServerList$1;

    const/4 v0, 0x0

    invoke-direct {v1, p0, v0}, Lcom/join/kotlin/discount/viewmodel/GameDetailServerBookDialogViewModel$getServerList$1;-><init>(Lcom/join/kotlin/discount/viewmodel/GameDetailServerBookDialogViewModel;Lkotlin/coroutines/Continuation;)V

    new-instance v2, Lcom/join/kotlin/discount/viewmodel/GameDetailServerBookDialogViewModel$getServerList$2;

    invoke-direct {v2, p0}, Lcom/join/kotlin/discount/viewmodel/GameDetailServerBookDialogViewModel$getServerList$2;-><init>(Lcom/join/kotlin/discount/viewmodel/GameDetailServerBookDialogViewModel;)V

    new-instance v3, Lcom/join/kotlin/discount/viewmodel/GameDetailServerBookDialogViewModel$getServerList$3;

    invoke-direct {v3, p0}, Lcom/join/kotlin/discount/viewmodel/GameDetailServerBookDialogViewModel$getServerList$3;-><init>(Lcom/join/kotlin/discount/viewmodel/GameDetailServerBookDialogViewModel;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x18

    const/4 v7, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v7}, Lcom/join/kotlin/base/ext/BaseViewModelExtKt;->request$default(Lcom/join/kotlin/base/viewmodel/BaseViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLjava/lang/String;ILjava/lang/Object;)Lkotlinx/coroutines/z1;

    return-void
.end method

.method public final getSubscribeResultBean()Landroidx/lifecycle/MutableLiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/MutableLiveData<",
            "Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailServerBookDialogViewModel;->subscribeResultBean:Landroidx/lifecycle/MutableLiveData;

    return-object v0
.end method

.method public final getTitle()Landroidx/lifecycle/MutableLiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailServerBookDialogViewModel;->title:Landroidx/lifecycle/MutableLiveData;

    return-object v0
.end method

.method public final setGameId(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailServerBookDialogViewModel;->gameId:Ljava/lang/String;

    return-void
.end method
