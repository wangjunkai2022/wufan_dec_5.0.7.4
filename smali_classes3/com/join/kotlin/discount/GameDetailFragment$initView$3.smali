.class public final Lcom/join/kotlin/discount/GameDetailFragment$initView$3;
.super Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;
.source "GameDetailFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/discount/GameDetailFragment;->initView(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/discount/GameDetailFragment;


# direct methods
.method constructor <init>(Lcom/join/kotlin/discount/GameDetailFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/discount/GameDetailFragment$initView$3;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 7
    .param p1    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"

    const-string v1, "recyclerView"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;->onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V

    if-nez p2, :cond_a

    .line 2
    iget-object p1, p0, Lcom/join/kotlin/discount/GameDetailFragment$initView$3;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-virtual {p1}, Lcom/join/kotlin/discount/GameDetailFragment;->playVideo()V

    .line 3
    :try_start_0
    iget-object p1, p0, Lcom/join/kotlin/discount/GameDetailFragment$initView$3;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-virtual {p1}, Lcom/join/kotlin/base/fragment/BaseVmDbFragment;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/FragmentDiscountGameDetailV2Binding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/FragmentDiscountGameDetailV2Binding;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstCompletelyVisibleItemPosition()I

    move-result p1

    .line 4
    iget-object p2, p0, Lcom/join/kotlin/discount/GameDetailFragment$initView$3;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-virtual {p2}, Lcom/join/kotlin/base/fragment/BaseVmDbFragment;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p2

    check-cast p2, Lcom/join/android/app/mgsim/wufun/databinding/FragmentDiscountGameDetailV2Binding;

    iget-object p2, p2, Lcom/join/android/app/mgsim/wufun/databinding/FragmentDiscountGameDetailV2Binding;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    move-result p2

    .line 5
    iget-object v1, p0, Lcom/join/kotlin/discount/GameDetailFragment$initView$3;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-virtual {v1}, Lcom/join/kotlin/base/fragment/BaseVmDbFragment;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v1

    check-cast v1, Lcom/join/android/app/mgsim/wufun/databinding/FragmentDiscountGameDetailV2Binding;

    iget-object v1, v1, Lcom/join/android/app/mgsim/wufun/databinding/FragmentDiscountGameDetailV2Binding;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastCompletelyVisibleItemPosition()I

    move-result v0

    if-ltz p1, :cond_a

    .line 6
    iget-object v1, p0, Lcom/join/kotlin/discount/GameDetailFragment$initView$3;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-static {v1}, Lcom/join/kotlin/discount/GameDetailFragment;->access$getCurrentIndicatorPosition$p(Lcom/join/kotlin/discount/GameDetailFragment;)I

    move-result v1

    const/4 v2, 0x1

    if-ne p1, v1, :cond_0

    iget-object v1, p0, Lcom/join/kotlin/discount/GameDetailFragment$initView$3;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-static {v1}, Lcom/join/kotlin/discount/GameDetailFragment;->access$getBannerAdapter(Lcom/join/kotlin/discount/GameDetailFragment;)Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter;

    move-result-object v1

    invoke-virtual {v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItemCount()I

    move-result v1

    sub-int/2addr v1, v2

    if-ne v0, v1, :cond_a

    .line 7
    :cond_0
    iget-object v1, p0, Lcom/join/kotlin/discount/GameDetailFragment$initView$3;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-static {v1}, Lcom/join/kotlin/discount/GameDetailFragment;->access$getCurrentIndicatorPosition$p(Lcom/join/kotlin/discount/GameDetailFragment;)I

    move-result v1

    iget-object v3, p0, Lcom/join/kotlin/discount/GameDetailFragment$initView$3;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-virtual {v3}, Lcom/join/kotlin/base/fragment/BaseVmDbFragment;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v3

    check-cast v3, Lcom/join/android/app/mgsim/wufun/databinding/FragmentDiscountGameDetailV2Binding;

    iget-object v3, v3, Lcom/join/android/app/mgsim/wufun/databinding/FragmentDiscountGameDetailV2Binding;->x:Landroid/widget/LinearLayout;

    invoke-virtual {v3}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v3

    sub-int/2addr v3, v2

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Lcom/join/kotlin/discount/GameDetailFragment$initView$3;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-static {v1}, Lcom/join/kotlin/discount/GameDetailFragment;->access$getFirstCompletelyVisibleWhenIndicatorShowLast$p(Lcom/join/kotlin/discount/GameDetailFragment;)I

    move-result v1

    if-eq p1, v1, :cond_a

    .line 8
    :cond_1
    iget-object v1, p0, Lcom/join/kotlin/discount/GameDetailFragment$initView$3;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-virtual {v1}, Lcom/join/kotlin/base/fragment/BaseVmDbFragment;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v1

    check-cast v1, Lcom/join/android/app/mgsim/wufun/databinding/FragmentDiscountGameDetailV2Binding;

    iget-object v1, v1, Lcom/join/android/app/mgsim/wufun/databinding/FragmentDiscountGameDetailV2Binding;->x:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_a

    .line 9
    iget-object v5, p0, Lcom/join/kotlin/discount/GameDetailFragment$initView$3;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-virtual {v5}, Lcom/join/kotlin/base/fragment/BaseVmDbFragment;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v5

    check-cast v5, Lcom/join/android/app/mgsim/wufun/databinding/FragmentDiscountGameDetailV2Binding;

    iget-object v5, v5, Lcom/join/android/app/mgsim/wufun/databinding/FragmentDiscountGameDetailV2Binding;->x:Landroid/widget/LinearLayout;

    invoke-virtual {v5, v4}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 10
    invoke-static {v5}, Landroidx/databinding/DataBindingUtil;->getBinding(Landroid/view/View;)Landroidx/databinding/ViewDataBinding;

    move-result-object v5

    check-cast v5, Lcom/join/android/app/mgsim/wufun/databinding/ItemDetailBannerIndicatorBinding;

    if-nez v5, :cond_2

    goto :goto_3

    .line 11
    :cond_2
    iget-object v6, p0, Lcom/join/kotlin/discount/GameDetailFragment$initView$3;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-static {v6}, Lcom/join/kotlin/discount/GameDetailFragment;->access$getBannerAdapter(Lcom/join/kotlin/discount/GameDetailFragment;)Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter;

    move-result-object v6

    invoke-virtual {v6}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItemCount()I

    move-result v6

    sub-int/2addr v6, v2

    if-ne v0, v6, :cond_3

    .line 12
    iget-object v6, p0, Lcom/join/kotlin/discount/GameDetailFragment$initView$3;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-virtual {v6}, Lcom/join/kotlin/base/fragment/BaseVmDbFragment;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v6

    check-cast v6, Lcom/join/android/app/mgsim/wufun/databinding/FragmentDiscountGameDetailV2Binding;

    iget-object v6, v6, Lcom/join/android/app/mgsim/wufun/databinding/FragmentDiscountGameDetailV2Binding;->x:Landroid/widget/LinearLayout;

    invoke-virtual {v6}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v6

    sub-int/2addr v6, v2

    goto :goto_1

    :cond_3
    if-nez p1, :cond_4

    if-nez p2, :cond_4

    const/4 v6, 0x0

    goto :goto_1

    :cond_4
    if-ne p1, v2, :cond_5

    if-nez p2, :cond_5

    const/4 v6, 0x1

    goto :goto_1

    :cond_5
    move v6, p1

    :goto_1
    if-ne v4, v6, :cond_6

    const/4 v6, 0x1

    goto :goto_2

    :cond_6
    const/4 v6, 0x0

    .line 13
    :goto_2
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    .line 14
    invoke-virtual {v5, v6}, Lcom/join/android/app/mgsim/wufun/databinding/ItemDetailBannerIndicatorBinding;->f(Ljava/lang/Boolean;)V

    :goto_3
    if-eqz v5, :cond_7

    .line 15
    invoke-virtual {v5}, Lcom/join/android/app/mgsim/wufun/databinding/ItemDetailBannerIndicatorBinding;->c()Ljava/lang/Boolean;

    move-result-object v5

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    goto :goto_4

    :cond_7
    const/4 v5, 0x0

    :goto_4
    if-eqz v5, :cond_9

    .line 16
    iget-object v5, p0, Lcom/join/kotlin/discount/GameDetailFragment$initView$3;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-static {v5, v4}, Lcom/join/kotlin/discount/GameDetailFragment;->access$setCurrentIndicatorPosition$p(Lcom/join/kotlin/discount/GameDetailFragment;I)V

    .line 17
    iget-object v5, p0, Lcom/join/kotlin/discount/GameDetailFragment$initView$3;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-static {v5}, Lcom/join/kotlin/discount/GameDetailFragment;->access$getBannerAdapter(Lcom/join/kotlin/discount/GameDetailFragment;)Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter;

    move-result-object v5

    invoke-virtual {v5}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItemCount()I

    move-result v5

    sub-int/2addr v5, v2

    if-ne v0, v5, :cond_8

    .line 18
    iget-object v5, p0, Lcom/join/kotlin/discount/GameDetailFragment$initView$3;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-static {v5, p1}, Lcom/join/kotlin/discount/GameDetailFragment;->access$setFirstCompletelyVisibleWhenIndicatorShowLast$p(Lcom/join/kotlin/discount/GameDetailFragment;I)V

    goto :goto_5

    .line 19
    :cond_8
    iget-object v5, p0, Lcom/join/kotlin/discount/GameDetailFragment$initView$3;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    const/4 v6, -0x1

    invoke-static {v5, v6}, Lcom/join/kotlin/discount/GameDetailFragment;->access$setFirstCompletelyVisibleWhenIndicatorShowLast$p(Lcom/join/kotlin/discount/GameDetailFragment;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_9
    :goto_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 20
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_a
    return-void
.end method
