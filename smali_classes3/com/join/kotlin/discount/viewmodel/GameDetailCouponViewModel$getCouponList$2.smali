.class final Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel$getCouponList$2;
.super Lkotlin/jvm/internal/Lambda;
.source "GameDetailCouponViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;->getCouponList(Z)V
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
        "Lcom/join/kotlin/discount/model/bean/CouponItemBean;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGameDetailCouponViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameDetailCouponViewModel.kt\ncom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel$getCouponList$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,61:1\n1855#2,2:62\n*S KotlinDebug\n*F\n+ 1 GameDetailCouponViewModel.kt\ncom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel$getCouponList$2\n*L\n37#1:62,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nGameDetailCouponViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameDetailCouponViewModel.kt\ncom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel$getCouponList$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,61:1\n1855#2,2:62\n*S KotlinDebug\n*F\n+ 1 GameDetailCouponViewModel.kt\ncom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel$getCouponList$2\n*L\n37#1:62,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $refresh:Z

.field final synthetic this$0:Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;


# direct methods
.method constructor <init>(Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;Z)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel$getCouponList$2;->this$0:Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;

    iput-boolean p2, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel$getCouponList$2;->$refresh:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel$getCouponList$2;->invoke(Ljava/util/List;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/util/List;)V
    .locals 13
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/kotlin/discount/model/bean/CouponItemBean;",
            ">;)V"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel$getCouponList$2;->this$0:Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;

    invoke-virtual {v0}, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;->getPage()Lcom/join/kotlin/quark/model/bean/Page;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/kotlin/quark/model/bean/Page;->getPage()I

    move-result v1

    const/4 v2, 0x1

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/join/kotlin/quark/model/bean/Page;->setPage(I)V

    .line 3
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_0

    .line 4
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->filterNotNull(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 5
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/discount/model/bean/CouponItemBean;

    .line 6
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 7
    :cond_0
    new-instance p1, Lcom/join/kotlin/base/net/stateCallback/ListDataUiState;

    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 8
    iget-boolean v6, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel$getCouponList$2;->$refresh:Z

    .line 9
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v7

    .line 10
    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v8, v0, 0x1

    .line 11
    iget-boolean v0, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel$getCouponList$2;->$refresh:Z

    if-eqz v0, :cond_1

    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v9, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    const/4 v9, 0x0

    :goto_1
    const/4 v11, 0x2

    const/4 v12, 0x0

    move-object v3, p1

    .line 12
    invoke-direct/range {v3 .. v12}, Lcom/join/kotlin/base/net/stateCallback/ListDataUiState;-><init>(ZLjava/lang/String;ZZZZLjava/util/ArrayList;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 13
    iget-object v0, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel$getCouponList$2;->this$0:Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;

    invoke-virtual {v0}, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;->getListData()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    return-void
.end method
