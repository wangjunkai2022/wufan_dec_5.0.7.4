.class final Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel$getCouponList$3;
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
        "Lcom/join/kotlin/base/net/AppException;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic $refresh:Z

.field final synthetic this$0:Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;


# direct methods
.method constructor <init>(ZLcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;)V
    .locals 0

    iput-boolean p1, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel$getCouponList$3;->$refresh:Z

    iput-object p2, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel$getCouponList$3;->this$0:Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/join/kotlin/base/net/AppException;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel$getCouponList$3;->invoke(Lcom/join/kotlin/base/net/AppException;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/join/kotlin/base/net/AppException;)V
    .locals 11
    .param p1    # Lcom/join/kotlin/base/net/AppException;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/join/kotlin/base/net/stateCallback/ListDataUiState;

    .line 3
    invoke-virtual {p1}, Lcom/join/kotlin/base/net/AppException;->getErrorMsg()Ljava/lang/String;

    move-result-object v3

    .line 4
    iget-boolean v4, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel$getCouponList$3;->$refresh:Z

    .line 5
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v9, 0x38

    const/4 v10, 0x0

    move-object v1, v0

    .line 6
    invoke-direct/range {v1 .. v10}, Lcom/join/kotlin/base/net/stateCallback/ListDataUiState;-><init>(ZLjava/lang/String;ZZZZLjava/util/ArrayList;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    iget-object p1, p0, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel$getCouponList$3;->this$0:Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;

    invoke-virtual {p1}, Lcom/join/kotlin/discount/viewmodel/GameDetailCouponViewModel;->getListData()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    return-void
.end method
