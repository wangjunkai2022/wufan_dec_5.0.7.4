.class public final Lcom/join/kotlin/discount/GameDetailActivity$initTabAndViewpager$5;
.super Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;
.source "GameDetailActivity.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/discount/GameDetailActivity;->initTabAndViewpager()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/discount/GameDetailActivity;


# direct methods
.method constructor <init>(Lcom/join/kotlin/discount/GameDetailActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/discount/GameDetailActivity$initTabAndViewpager$5;->this$0:Lcom/join/kotlin/discount/GameDetailActivity;

    .line 1
    invoke-direct {p0}, Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageScrolled(IFI)V
    .locals 2

    .line 1
    iget-object p3, p0, Lcom/join/kotlin/discount/GameDetailActivity$initTabAndViewpager$5;->this$0:Lcom/join/kotlin/discount/GameDetailActivity;

    invoke-virtual {p3}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p3

    check-cast p3, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailBinding;

    iget-object p3, p3, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailBinding;->d:Lcom/google/android/material/tabs/TabLayout;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p3, p1, p2, v0, v1}, Lcom/google/android/material/tabs/TabLayout;->setScrollPosition(IFZZ)V

    return-void
.end method

.method public onPageSelected(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/GameDetailActivity$initTabAndViewpager$5;->this$0:Lcom/join/kotlin/discount/GameDetailActivity;

    invoke-virtual {v0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailBinding;->d:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v0, p1}, Lcom/google/android/material/tabs/TabLayout;->getTabAt(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout$Tab;->select()V

    :cond_0
    return-void
.end method
