.class final Lcom/join/kotlin/ui/coupon/CouponListActivity$onCreate$2;
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
        "Ljava/lang/Object;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCouponListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CouponListActivity.kt\ncom/join/kotlin/ui/coupon/CouponListActivity$onCreate$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,138:1\n766#2:139\n857#2,2:140\n1855#2,2:142\n*S KotlinDebug\n*F\n+ 1 CouponListActivity.kt\ncom/join/kotlin/ui/coupon/CouponListActivity$onCreate$2\n*L\n56#1:139\n56#1:140,2\n56#1:142,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCouponListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CouponListActivity.kt\ncom/join/kotlin/ui/coupon/CouponListActivity$onCreate$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,138:1\n766#2:139\n857#2,2:140\n1855#2,2:142\n*S KotlinDebug\n*F\n+ 1 CouponListActivity.kt\ncom/join/kotlin/ui/coupon/CouponListActivity$onCreate$2\n*L\n56#1:139\n56#1:140,2\n56#1:142,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/ui/coupon/CouponListActivity;


# direct methods
.method constructor <init>(Lcom/join/kotlin/ui/coupon/CouponListActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/ui/coupon/CouponListActivity$onCreate$2;->this$0:Lcom/join/kotlin/ui/coupon/CouponListActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/join/mgps/dto/ResponseModel;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/ui/coupon/CouponListActivity$onCreate$2;->invoke(Lcom/join/mgps/dto/ResponseModel;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/join/mgps/dto/ResponseModel;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Ljava/lang/Object;",
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
    if-eqz v1, :cond_4

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object p1

    const-string v1, "null cannot be cast to non-null type com.join.kotlin.ui.coupon.CouponRequest"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/join/kotlin/ui/coupon/CouponRequest;

    .line 4
    iget-object v1, p0, Lcom/join/kotlin/ui/coupon/CouponListActivity$onCreate$2;->this$0:Lcom/join/kotlin/ui/coupon/CouponListActivity;

    invoke-virtual {v1}, Lcom/join/kotlin/ui/coupon/CouponListActivity;->getDatas()Ljava/util/ArrayList;

    move-result-object v1

    .line 5
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 6
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/join/mgps/dto/BTGameCouponBean;

    .line 7
    invoke-virtual {v4}, Lcom/join/mgps/dto/BTGameCouponBean;->getCoupon_id()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p1, Lcom/join/kotlin/ui/coupon/CouponRequest;->couponId:Ljava/lang/String;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 8
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 9
    :cond_2
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/BTGameCouponBean;

    .line 10
    invoke-virtual {v1, v0}, Lcom/join/mgps/dto/BTGameCouponBean;->setReceivable(Z)V

    goto :goto_2

    .line 11
    :cond_3
    iget-object p1, p0, Lcom/join/kotlin/ui/coupon/CouponListActivity$onCreate$2;->this$0:Lcom/join/kotlin/ui/coupon/CouponListActivity;

    invoke-virtual {p1}, Lcom/join/kotlin/ui/coupon/CouponListActivity;->getViewdataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ActivityCouponlistActivityBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityCouponlistActivityBinding;->c:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    goto :goto_4

    .line 12
    :cond_4
    iget-object v0, p0, Lcom/join/kotlin/ui/coupon/CouponListActivity$onCreate$2;->this$0:Lcom/join/kotlin/ui/coupon/CouponListActivity;

    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getMessage()Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    :cond_5
    const/4 p1, 0x0

    :goto_3
    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    :cond_6
    :goto_4
    return-void
.end method
