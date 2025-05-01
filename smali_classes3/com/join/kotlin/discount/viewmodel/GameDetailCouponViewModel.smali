.class public final Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;
.super Lcom/join/kotlin/base/viewmodel/BaseViewModel;
.source "GameDetailCouponViewModel.kt"


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
            "Lcom/join/kotlin/discount/model/bean/CouponItemBean;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final page:Lcom/join/kotlin/quark/model/bean/Page;
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
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/join/kotlin/base/viewmodel/BaseViewModel;-><init>()V

    .line 2
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    const-string/jumbo v1, "\u6807\u9898"

    invoke-direct {v0, v1}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;->title:Landroidx/lifecycle/MutableLiveData;

    .line 3
    new-instance v0, Lcom/join/kotlin/quark/model/bean/Page;

    const/4 v1, 0x1

    const/16 v2, 0x14

    invoke-direct {v0, v1, v2}, Lcom/join/kotlin/quark/model/bean/Page;-><init>(II)V

    iput-object v0, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;->page:Lcom/join/kotlin/quark/model/bean/Page;

    .line 4
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    iput-object v0, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;->listData:Landroidx/lifecycle/MutableLiveData;

    return-void
.end method


# virtual methods
.method public final getCouponList(Z)V
    .locals 8

    .line 1
    new-instance v1, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel$getCouponList$1;

    const/4 v0, 0x0

    invoke-direct {v1, p1, p0, v0}, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel$getCouponList$1;-><init>(ZLcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;Lkotlin/coroutines/Continuation;)V

    new-instance v2, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel$getCouponList$2;

    invoke-direct {v2, p0, p1}, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel$getCouponList$2;-><init>(Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;Z)V

    new-instance v3, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel$getCouponList$3;

    invoke-direct {v3, p1, p0}, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel$getCouponList$3;-><init>(ZLcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x18

    const/4 v7, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v7}, Lcom/join/kotlin/base/ext/BaseViewModelExtKt;->request$default(Lcom/join/kotlin/base/viewmodel/BaseViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLjava/lang/String;ILjava/lang/Object;)Lkotlinx/coroutines/z1;

    return-void
.end method

.method public final getGameId()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;->gameId:Ljava/lang/String;

    return-object v0
.end method

.method public final getListData()Landroidx/lifecycle/MutableLiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/MutableLiveData<",
            "Lcom/join/kotlin/base/net/stateCallback/ListDataUiState<",
            "Lcom/join/kotlin/discount/model/bean/CouponItemBean;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;->listData:Landroidx/lifecycle/MutableLiveData;

    return-object v0
.end method

.method public final getPage()Lcom/join/kotlin/quark/model/bean/Page;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;->page:Lcom/join/kotlin/quark/model/bean/Page;

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
    iget-object v0, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;->title:Landroidx/lifecycle/MutableLiveData;

    return-object v0
.end method

.method public final setGameId(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;->gameId:Ljava/lang/String;

    return-void
.end method
