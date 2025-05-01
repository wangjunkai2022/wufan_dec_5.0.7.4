.class public final Lcom/join/kotlin/ui/coupon/CouponAdapterv2;
.super Lcom/join/kotlin/domain/adapter/BaseDataBindingAdapter;
.source "CouponAdapterv2.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/kotlin/domain/adapter/BaseDataBindingAdapter<",
        "Lcom/join/mgps/dto/BTGameCouponBean;",
        "Lcom/join/android/app/mgsim/wufun/databinding/CouponListItemLayoutBinding;",
        ">;"
    }
.end annotation


# instance fields
.field private clickProxy:Lcom/join/kotlin/ui/coupon/ClickProxy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private context:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/join/kotlin/ui/coupon/ClickProxy;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/join/kotlin/ui/coupon/ClickProxy;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clickProxy"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Lcom/join/kotlin/domain/adapter/BaseDataBindingAdapter;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/join/kotlin/ui/coupon/CouponAdapterv2;->context:Landroid/content/Context;

    iput-object p2, p0, Lcom/join/kotlin/ui/coupon/CouponAdapterv2;->clickProxy:Lcom/join/kotlin/ui/coupon/ClickProxy;

    return-void
.end method


# virtual methods
.method public final getClickProxy()Lcom/join/kotlin/ui/coupon/ClickProxy;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/coupon/CouponAdapterv2;->clickProxy:Lcom/join/kotlin/ui/coupon/ClickProxy;

    return-object v0
.end method

.method public final getContext()Landroid/content/Context;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/coupon/CouponAdapterv2;->context:Landroid/content/Context;

    return-object v0
.end method

.method protected getLayoutResId(I)I
    .locals 0

    const p1, 0x7f0c0158

    return p1
.end method

.method public bridge synthetic onBindItem(Landroidx/databinding/ViewDataBinding;Ljava/lang/Object;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/CouponListItemLayoutBinding;

    check-cast p2, Lcom/join/mgps/dto/BTGameCouponBean;

    invoke-virtual {p0, p1, p2, p3}, Lcom/join/kotlin/ui/coupon/CouponAdapterv2;->onBindItem(Lcom/join/android/app/mgsim/wufun/databinding/CouponListItemLayoutBinding;Lcom/join/mgps/dto/BTGameCouponBean;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    return-void
.end method

.method protected onBindItem(Lcom/join/android/app/mgsim/wufun/databinding/CouponListItemLayoutBinding;Lcom/join/mgps/dto/BTGameCouponBean;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 0
    .param p1    # Lcom/join/android/app/mgsim/wufun/databinding/CouponListItemLayoutBinding;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/join/mgps/dto/BTGameCouponBean;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string p3, "binding"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "item"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object p3, p0, Lcom/join/kotlin/ui/coupon/CouponAdapterv2;->clickProxy:Lcom/join/kotlin/ui/coupon/ClickProxy;

    invoke-virtual {p1, p3}, Lcom/join/android/app/mgsim/wufun/databinding/CouponListItemLayoutBinding;->i(Lcom/join/kotlin/ui/coupon/ClickProxy;)V

    .line 3
    invoke-virtual {p1, p2}, Lcom/join/android/app/mgsim/wufun/databinding/CouponListItemLayoutBinding;->h(Lcom/join/mgps/dto/BTGameCouponBean;)V

    .line 4
    invoke-virtual {p2}, Lcom/join/mgps/dto/BTGameCouponBean;->getCoupon_type()Ljava/lang/String;

    move-result-object p2

    const-string p3, "DISCOUNT"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/join/android/app/mgsim/wufun/databinding/CouponListItemLayoutBinding;->j(Ljava/lang/Boolean;)V

    return-void
.end method

.method public bridge synthetic onBindItemPayloads(Landroidx/databinding/ViewDataBinding;Ljava/lang/Object;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/CouponListItemLayoutBinding;

    check-cast p2, Lcom/join/mgps/dto/BTGameCouponBean;

    invoke-virtual {p0, p1, p2, p3}, Lcom/join/kotlin/ui/coupon/CouponAdapterv2;->onBindItemPayloads(Lcom/join/android/app/mgsim/wufun/databinding/CouponListItemLayoutBinding;Lcom/join/mgps/dto/BTGameCouponBean;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    return-void
.end method

.method protected onBindItemPayloads(Lcom/join/android/app/mgsim/wufun/databinding/CouponListItemLayoutBinding;Lcom/join/mgps/dto/BTGameCouponBean;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 0
    .param p1    # Lcom/join/android/app/mgsim/wufun/databinding/CouponListItemLayoutBinding;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/join/mgps/dto/BTGameCouponBean;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string p3, "binding"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "item"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object p3, p0, Lcom/join/kotlin/ui/coupon/CouponAdapterv2;->clickProxy:Lcom/join/kotlin/ui/coupon/ClickProxy;

    invoke-virtual {p1, p3}, Lcom/join/android/app/mgsim/wufun/databinding/CouponListItemLayoutBinding;->i(Lcom/join/kotlin/ui/coupon/ClickProxy;)V

    .line 3
    invoke-virtual {p1, p2}, Lcom/join/android/app/mgsim/wufun/databinding/CouponListItemLayoutBinding;->h(Lcom/join/mgps/dto/BTGameCouponBean;)V

    .line 4
    invoke-virtual {p2}, Lcom/join/mgps/dto/BTGameCouponBean;->getCoupon_type()Ljava/lang/String;

    move-result-object p2

    const-string p3, "DISCOUNT"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/join/android/app/mgsim/wufun/databinding/CouponListItemLayoutBinding;->j(Ljava/lang/Boolean;)V

    return-void
.end method

.method public final setClickProxy(Lcom/join/kotlin/ui/coupon/ClickProxy;)V
    .locals 1
    .param p1    # Lcom/join/kotlin/ui/coupon/ClickProxy;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/coupon/CouponAdapterv2;->clickProxy:Lcom/join/kotlin/ui/coupon/ClickProxy;

    return-void
.end method

.method public final setContext(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/coupon/CouponAdapterv2;->context:Landroid/content/Context;

    return-void
.end method
