.class public final Lcom/join/kotlin/discount/GameDetailActivity$initTabAndViewpager$2;
.super Ljava/lang/Object;
.source "GameDetailActivity.kt"

# interfaces
.implements Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;


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

    iput-object p1, p0, Lcom/join/kotlin/discount/GameDetailActivity$initTabAndViewpager$2;->this$0:Lcom/join/kotlin/discount/GameDetailActivity;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTabReselected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 0
    .param p1    # Lcom/google/android/material/tabs/TabLayout$Tab;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object p1, p0, Lcom/join/kotlin/discount/GameDetailActivity$initTabAndViewpager$2;->this$0:Lcom/join/kotlin/discount/GameDetailActivity;

    invoke-static {p1}, Lcom/join/kotlin/discount/GameDetailActivity;->access$refreshTab(Lcom/join/kotlin/discount/GameDetailActivity;)V

    return-void
.end method

.method public onTabSelected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 1
    .param p1    # Lcom/google/android/material/tabs/TabLayout$Tab;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/GameDetailActivity$initTabAndViewpager$2;->this$0:Lcom/join/kotlin/discount/GameDetailActivity;

    invoke-static {v0}, Lcom/join/kotlin/discount/GameDetailActivity;->access$refreshTab(Lcom/join/kotlin/discount/GameDetailActivity;)V

    .line 2
    iget-object v0, p0, Lcom/join/kotlin/discount/GameDetailActivity$initTabAndViewpager$2;->this$0:Lcom/join/kotlin/discount/GameDetailActivity;

    invoke-virtual {v0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailBinding;->e:Landroidx/viewpager2/widget/ViewPager2;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout$Tab;->getPosition()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(I)V

    return-void
.end method

.method public onTabUnselected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 0
    .param p1    # Lcom/google/android/material/tabs/TabLayout$Tab;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    return-void
.end method
