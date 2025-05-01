.class final Lcom/join/kotlin/ui/coupon/CouponListActivity$onCreate$3;
.super Lkotlin/jvm/internal/Lambda;
.source "CouponListActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/ui/coupon/CouponListActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/join/mgps/dto/ResponseModel<",
        "Lcom/join/kotlin/ui/coupon/CouponListMainData;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/ui/coupon/CouponListActivity;


# direct methods
.method constructor <init>(Lcom/join/kotlin/ui/coupon/CouponListActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/ui/coupon/CouponListActivity$onCreate$3;->this$0:Lcom/join/kotlin/ui/coupon/CouponListActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/join/mgps/dto/ResponseModel;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/ui/coupon/CouponListActivity$onCreate$3;->invoke(Lcom/join/mgps/dto/ResponseModel;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/join/mgps/dto/ResponseModel;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/kotlin/ui/coupon/CouponListMainData;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result v1

    const/16 v2, 0xc8

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    .line 3
    iget-object v1, p0, Lcom/join/kotlin/ui/coupon/CouponListActivity$onCreate$3;->this$0:Lcom/join/kotlin/ui/coupon/CouponListActivity;

    invoke-virtual {v1}, Lcom/join/kotlin/ui/coupon/CouponListActivity;->getCouponViewModle()Lcom/join/kotlin/ui/coupon/CouponViewModle;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/kotlin/ui/coupon/CouponViewModle;->getDatas()Landroidx/lifecycle/MutableLiveData;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/kotlin/ui/coupon/CouponListMainData;

    invoke-virtual {p1}, Lcom/join/kotlin/ui/coupon/CouponListMainData;->getGame_coupon_for_bt_game()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 4
    :cond_1
    iget-object p1, p0, Lcom/join/kotlin/ui/coupon/CouponListActivity$onCreate$3;->this$0:Lcom/join/kotlin/ui/coupon/CouponListActivity;

    invoke-virtual {p1}, Lcom/join/kotlin/ui/coupon/CouponListActivity;->getViewdataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ActivityCouponlistActivityBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityCouponlistActivityBinding;->c:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    goto :goto_2

    .line 5
    :cond_2
    iget-object v1, p0, Lcom/join/kotlin/ui/coupon/CouponListActivity$onCreate$3;->this$0:Lcom/join/kotlin/ui/coupon/CouponListActivity;

    invoke-static {v1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getMessage()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    :goto_1
    invoke-virtual {v1, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    .line 6
    :cond_4
    :goto_2
    iget-object p1, p0, Lcom/join/kotlin/ui/coupon/CouponListActivity$onCreate$3;->this$0:Lcom/join/kotlin/ui/coupon/CouponListActivity;

    invoke-virtual {p1}, Lcom/join/kotlin/ui/coupon/CouponListActivity;->getCouponViewModle()Lcom/join/kotlin/ui/coupon/CouponViewModle;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/join/kotlin/ui/coupon/CouponViewModle;->updateShowLoadUI(Z)V

    return-void
.end method
