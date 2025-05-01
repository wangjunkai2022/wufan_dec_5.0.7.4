.class public final Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter$2;
.super Ljava/lang/Object;
.source "GameDetailBannerAdapter.kt"

# interfaces
.implements Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b<",
        "Lcom/join/kotlin/discount/model/bean/GameDetailBannerEntityBean;",
        "Lcom/chad/library/adapter/base/viewholder/DataBindingHolder<",
        "Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicHBinding;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter;


# direct methods
.method constructor <init>(Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter$2;->this$0:Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public isFullSpanItem(I)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b$a;->a(Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b;I)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic onBind(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;

    check-cast p3, Lcom/join/kotlin/discount/model/bean/GameDetailBannerEntityBean;

    invoke-virtual {p0, p1, p2, p3}, Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter$2;->onBind(Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;ILcom/join/kotlin/discount/model/bean/GameDetailBannerEntityBean;)V

    return-void
.end method

.method public bridge synthetic onBind(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/lang/Object;Ljava/util/List;)V
    .locals 0

    .line 2
    check-cast p1, Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;

    check-cast p3, Lcom/join/kotlin/discount/model/bean/GameDetailBannerEntityBean;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter$2;->onBind(Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;ILcom/join/kotlin/discount/model/bean/GameDetailBannerEntityBean;Ljava/util/List;)V

    return-void
.end method

.method public onBind(Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;ILcom/join/kotlin/discount/model/bean/GameDetailBannerEntityBean;)V
    .locals 1
    .param p1    # Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/join/kotlin/discount/model/bean/GameDetailBannerEntityBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/chad/library/adapter/base/viewholder/DataBindingHolder<",
            "Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicHBinding;",
            ">;I",
            "Lcom/join/kotlin/discount/model/bean/GameDetailBannerEntityBean;",
            ")V"
        }
    .end annotation

    const-string p2, "holder"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p3, :cond_0

    .line 4
    invoke-virtual {p3}, Lcom/join/kotlin/discount/model/bean/GameDetailBannerEntityBean;->getData()Ljava/lang/Object;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    instance-of p2, p2, Ljava/lang/String;

    if-eqz p2, :cond_3

    .line 5
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;->a()Landroidx/databinding/ViewDataBinding;

    move-result-object p2

    check-cast p2, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicHBinding;

    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter$2;->this$0:Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter;

    invoke-virtual {v0}, Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter;->getClick()Lcom/join/kotlin/discount/proxy/GameDetailFragmentClickProxy;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicHBinding;->g(Lcom/join/kotlin/discount/proxy/GameDetailFragmentClickProxy;)V

    .line 6
    :goto_1
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;->a()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicHBinding;

    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p3}, Lcom/join/kotlin/discount/model/bean/GameDetailBannerEntityBean;->getData()Ljava/lang/Object;

    move-result-object p2

    const-string p3, "null cannot be cast to non-null type kotlin.String"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicHBinding;->h(Ljava/lang/String;)V

    :cond_3
    :goto_2
    return-void
.end method

.method public onBind(Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;ILcom/join/kotlin/discount/model/bean/GameDetailBannerEntityBean;Ljava/util/List;)V
    .locals 0
    .param p1    # Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/join/kotlin/discount/model/bean/GameDetailBannerEntityBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/chad/library/adapter/base/viewholder/DataBindingHolder<",
            "Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicHBinding;",
            ">;I",
            "Lcom/join/kotlin/discount/model/bean/GameDetailBannerEntityBean;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 3
    invoke-static {p0, p1, p2, p3, p4}, Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b$a;->b(Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/lang/Object;Ljava/util/List;)V

    return-void
.end method

.method public bridge synthetic onCreate(Landroid/content/Context;Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter$2;->onCreate(Landroid/content/Context;Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreate(Landroid/content/Context;Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;
    .locals 1
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
            "Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicHBinding;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string p3, "context"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "parent"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p3, Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;

    .line 3
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 v0, 0x0

    .line 4
    invoke-static {p1, p2, v0}, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicHBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicHBinding;

    move-result-object p1

    .line 5
    invoke-direct {p3, p1}, Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;-><init>(Landroidx/databinding/ViewDataBinding;)V

    return-object p3
.end method

.method public onFailedToRecycleView(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    invoke-static {p0, p1}, Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b$a;->c(Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z

    move-result p1

    return p1
.end method

.method public onViewAttachedToWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    invoke-static {p0, p1}, Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b$a;->d(Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    return-void
.end method

.method public onViewDetachedFromWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    invoke-static {p0, p1}, Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b$a;->e(Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    return-void
.end method

.method public onViewRecycled(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    invoke-static {p0, p1}, Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b$a;->f(Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    return-void
.end method
