.class public final Lcom/join/kotlin/discount/adapter/CouponGameDetailAdapter;
.super Lcom/chad/library/adapter/base/BaseQuickAdapter;
.source "CouponGameDetailAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
        "Lcom/join/kotlin/discount/model/bean/CouponItemBean;",
        "Lcom/chad/library/adapter/base/viewholder/DataBindingHolder<",
        "Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBinding;",
        ">;>;"
    }
.end annotation


# instance fields
.field private listClickProxy:Lcom/join/kotlin/discount/proxy/CouponListClickProxy;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    invoke-direct {p0, v0, v1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;-><init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public final getListClickProxy()Lcom/join/kotlin/discount/proxy/CouponListClickProxy;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/adapter/CouponGameDetailAdapter;->listClickProxy:Lcom/join/kotlin/discount/proxy/CouponListClickProxy;

    return-object v0
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;

    check-cast p3, Lcom/join/kotlin/discount/model/bean/CouponItemBean;

    invoke-virtual {p0, p1, p2, p3}, Lcom/join/kotlin/discount/adapter/CouponGameDetailAdapter;->onBindViewHolder(Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;ILcom/join/kotlin/discount/model/bean/CouponItemBean;)V

    return-void
.end method

.method protected onBindViewHolder(Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;ILcom/join/kotlin/discount/model/bean/CouponItemBean;)V
    .locals 0
    .param p1    # Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/join/kotlin/discount/model/bean/CouponItemBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/chad/library/adapter/base/viewholder/DataBindingHolder<",
            "Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBinding;",
            ">;I",
            "Lcom/join/kotlin/discount/model/bean/CouponItemBean;",
            ")V"
        }
    .end annotation

    const-string p2, "holder"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;->a()Landroidx/databinding/ViewDataBinding;

    move-result-object p2

    check-cast p2, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBinding;

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2, p3}, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBinding;->h(Lcom/join/kotlin/discount/model/bean/CouponItemBean;)V

    .line 3
    :goto_0
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;->a()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBinding;

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    iget-object p2, p0, Lcom/join/kotlin/discount/adapter/CouponGameDetailAdapter;->listClickProxy:Lcom/join/kotlin/discount/proxy/CouponListClickProxy;

    invoke-virtual {p1, p2}, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBinding;->g(Lcom/join/kotlin/discount/proxy/CouponListClickProxy;)V

    :goto_1
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/content/Context;Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/join/kotlin/discount/adapter/CouponGameDetailAdapter;->onCreateViewHolder(Landroid/content/Context;Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;

    move-result-object p1

    return-object p1
.end method

.method protected onCreateViewHolder(Landroid/content/Context;Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/view/ViewGroup;",
            "I)",
            "Lcom/chad/library/adapter/base/viewholder/DataBindingHolder<",
            "Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBinding;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string p3, "context"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "parent"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;

    const p3, 0x7f0c0384

    invoke-direct {p1, p3, p2}, Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;-><init>(ILandroid/view/ViewGroup;)V

    return-object p1
.end method

.method public final setListClickProxy(Lcom/join/kotlin/discount/proxy/CouponListClickProxy;)V
    .locals 0
    .param p1    # Lcom/join/kotlin/discount/proxy/CouponListClickProxy;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/discount/adapter/CouponGameDetailAdapter;->listClickProxy:Lcom/join/kotlin/discount/proxy/CouponListClickProxy;

    return-void
.end method
