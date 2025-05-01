.class final Lcom/join/kotlin/discount/GameDetailCouponActivity$createObserver$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "GameDetailCouponActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/discount/GameDetailCouponActivity;->createObserver()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/join/kotlin/base/net/stateCallback/ListDataUiState<",
        "Lcom/join/kotlin/discount/model/bean/CouponItemBean;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/discount/GameDetailCouponActivity;


# direct methods
.method constructor <init>(Lcom/join/kotlin/discount/GameDetailCouponActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/discount/GameDetailCouponActivity$createObserver$1$1;->this$0:Lcom/join/kotlin/discount/GameDetailCouponActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/join/kotlin/base/net/stateCallback/ListDataUiState;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/discount/GameDetailCouponActivity$createObserver$1$1;->invoke(Lcom/join/kotlin/base/net/stateCallback/ListDataUiState;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/join/kotlin/base/net/stateCallback/ListDataUiState;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/kotlin/base/net/stateCallback/ListDataUiState<",
            "Lcom/join/kotlin/discount/model/bean/CouponItemBean;",
            ">;)V"
        }
    .end annotation

    const-string v0, "it"

    .line 2
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/join/kotlin/discount/GameDetailCouponActivity$createObserver$1$1;->this$0:Lcom/join/kotlin/discount/GameDetailCouponActivity;

    invoke-static {v0}, Lcom/join/kotlin/discount/GameDetailCouponActivity;->access$getMAdapter(Lcom/join/kotlin/discount/GameDetailCouponActivity;)Lcom/join/kotlin/discount/adapter/CouponGameDetailAdapter;

    move-result-object v2

    iget-object v0, p0, Lcom/join/kotlin/discount/GameDetailCouponActivity$createObserver$1$1;->this$0:Lcom/join/kotlin/discount/GameDetailCouponActivity;

    invoke-static {v0}, Lcom/join/kotlin/discount/GameDetailCouponActivity;->access$getLoadSir$p(Lcom/join/kotlin/discount/GameDetailCouponActivity;)Lcom/kingja/loadsir/core/b;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "loadSir"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    move-object v3, v0

    iget-object v0, p0, Lcom/join/kotlin/discount/GameDetailCouponActivity$createObserver$1$1;->this$0:Lcom/join/kotlin/discount/GameDetailCouponActivity;

    invoke-virtual {v0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailCouponBinding;

    iget-object v4, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailCouponBinding;->d:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    const-string v0, "mDatabind.rvCoupon"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    const/16 v6, 0x10

    const/4 v7, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lcom/join/kotlin/base/ext/CustomViewExtKt;->loadListData$default(Lcom/join/kotlin/base/net/stateCallback/ListDataUiState;Lcom/chad/library/adapter/base/BaseQuickAdapter;Lcom/kingja/loadsir/core/b;Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-void
.end method
