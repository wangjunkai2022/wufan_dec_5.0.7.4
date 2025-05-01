.class public final Lcom/join/kotlin/discount/GameDetailFragment$initView$12;
.super Ljava/lang/Object;
.source "GameDetailFragment.kt"

# interfaces
.implements Landroidx/core/widget/NestedScrollView$OnScrollChangeListener;


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

    iput-object p1, p0, Lcom/join/kotlin/discount/GameDetailFragment$initView$12;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onScrollChange(Landroidx/core/widget/NestedScrollView;IIII)V
    .locals 2
    .param p1    # Landroidx/core/widget/NestedScrollView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string/jumbo p2, "v"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x2

    new-array p2, p2, [I

    .line 1
    fill-array-data p2, :array_0

    .line 2
    iget-object p4, p0, Lcom/join/kotlin/discount/GameDetailFragment$initView$12;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-virtual {p4}, Lcom/join/kotlin/base/fragment/BaseVmDbFragment;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p4

    check-cast p4, Lcom/join/android/app/mgsim/wufun/databinding/FragmentDiscountGameDetailV2Binding;

    iget-object p4, p4, Lcom/join/android/app/mgsim/wufun/databinding/FragmentDiscountGameDetailV2Binding;->c:Lcom/join/mgps/customview/NestedScrollableHost;

    invoke-virtual {p4, p2}, Landroid/widget/FrameLayout;->getLocationInWindow([I)V

    const/4 p4, 0x1

    .line 3
    aget p2, p2, p4

    const/4 p5, 0x0

    const/4 v0, 0x0

    if-gez p2, :cond_3

    .line 4
    iget-object p2, p0, Lcom/join/kotlin/discount/GameDetailFragment$initView$12;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-static {p2}, Lcom/join/kotlin/discount/GameDetailFragment;->access$isPause$p(Lcom/join/kotlin/discount/GameDetailFragment;)Z

    move-result p2

    if-nez p2, :cond_6

    .line 5
    iget-object p2, p0, Lcom/join/kotlin/discount/GameDetailFragment$initView$12;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-static {p2}, Lcom/join/kotlin/discount/GameDetailFragment;->access$getVideoHelper$p(Lcom/join/kotlin/discount/GameDetailFragment;)Lcom/join/android/app/component/video/g;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/join/android/app/component/video/g;->u()V

    .line 6
    :cond_0
    iget-object p2, p0, Lcom/join/kotlin/discount/GameDetailFragment$initView$12;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p2

    instance-of v1, p2, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    if-eqz v1, :cond_1

    move-object p5, p2

    check-cast p5, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    :cond_1
    if-eqz p5, :cond_2

    invoke-virtual {p5, p4}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->setTabIsDarkColor(Z)V

    .line 7
    :cond_2
    iget-object p2, p0, Lcom/join/kotlin/discount/GameDetailFragment$initView$12;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-virtual {p2}, Lcom/join/kotlin/base/fragment/BaseVmDbFragment;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p2

    check-cast p2, Lcom/join/android/app/mgsim/wufun/databinding/FragmentDiscountGameDetailV2Binding;

    iget-object p2, p2, Lcom/join/android/app/mgsim/wufun/databinding/FragmentDiscountGameDetailV2Binding;->L:Landroid/view/View;

    const-string p5, "#ffffff"

    invoke-static {p5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p5

    invoke-virtual {p2, p5}, Landroid/view/View;->setBackgroundColor(I)V

    .line 8
    iget-object p2, p0, Lcom/join/kotlin/discount/GameDetailFragment$initView$12;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-static {p2, p4}, Lcom/join/kotlin/discount/GameDetailFragment;->access$setPause$p(Lcom/join/kotlin/discount/GameDetailFragment;Z)V

    goto :goto_0

    .line 9
    :cond_3
    iget-object p2, p0, Lcom/join/kotlin/discount/GameDetailFragment$initView$12;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-static {p2}, Lcom/join/kotlin/discount/GameDetailFragment;->access$isPause$p(Lcom/join/kotlin/discount/GameDetailFragment;)Z

    move-result p2

    if-eqz p2, :cond_6

    .line 10
    iget-object p2, p0, Lcom/join/kotlin/discount/GameDetailFragment$initView$12;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-virtual {p2}, Lcom/join/kotlin/discount/GameDetailFragment;->playVideo()V

    .line 11
    iget-object p2, p0, Lcom/join/kotlin/discount/GameDetailFragment$initView$12;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p2

    instance-of p4, p2, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    if-eqz p4, :cond_4

    move-object p5, p2

    check-cast p5, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    :cond_4
    if-eqz p5, :cond_5

    invoke-virtual {p5, v0}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->setTabIsDarkColor(Z)V

    .line 12
    :cond_5
    iget-object p2, p0, Lcom/join/kotlin/discount/GameDetailFragment$initView$12;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-virtual {p2}, Lcom/join/kotlin/base/fragment/BaseVmDbFragment;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p2

    check-cast p2, Lcom/join/android/app/mgsim/wufun/databinding/FragmentDiscountGameDetailV2Binding;

    iget-object p2, p2, Lcom/join/android/app/mgsim/wufun/databinding/FragmentDiscountGameDetailV2Binding;->L:Landroid/view/View;

    iget-object p4, p0, Lcom/join/kotlin/discount/GameDetailFragment$initView$12;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-static {p4}, Lcom/join/kotlin/discount/GameDetailFragment;->access$getTopBgColor$p(Lcom/join/kotlin/discount/GameDetailFragment;)Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p4

    invoke-virtual {p2, p4}, Landroid/view/View;->setBackgroundColor(I)V

    .line 13
    iget-object p2, p0, Lcom/join/kotlin/discount/GameDetailFragment$initView$12;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-static {p2, v0}, Lcom/join/kotlin/discount/GameDetailFragment;->access$setPause$p(Lcom/join/kotlin/discount/GameDetailFragment;Z)V

    .line 14
    :cond_6
    :goto_0
    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->getMeasuredHeight()I

    move-result p1

    sub-int/2addr p2, p1

    if-ne p3, p2, :cond_7

    .line 15
    iget-object p1, p0, Lcom/join/kotlin/discount/GameDetailFragment$initView$12;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-virtual {p1}, Lcom/join/kotlin/base/fragment/BaseVmDbFragment;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/FragmentDiscountGameDetailV2Binding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/FragmentDiscountGameDetailV2Binding;->D:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    invoke-virtual {p1}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->getNoMore()Z

    move-result p1

    if-nez p1, :cond_7

    .line 16
    iget-object p1, p0, Lcom/join/kotlin/discount/GameDetailFragment$initView$12;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-virtual {p1, v0}, Lcom/join/kotlin/discount/GameDetailFragment;->loadSimilarGame(Z)V

    :cond_7
    return-void

    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data
.end method
