.class public final Lcom/join/kotlin/EveryDayNewGameFragment$onViewCreated$3;
.super Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;
.source "EveryDayNewGameFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/EveryDayNewGameFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/EveryDayNewGameFragment;


# direct methods
.method constructor <init>(Lcom/join/kotlin/EveryDayNewGameFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/EveryDayNewGameFragment$onViewCreated$3;->this$0:Lcom/join/kotlin/EveryDayNewGameFragment;

    .line 1
    invoke-direct {p0}, Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageSelected(I)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;->onPageSelected(I)V

    .line 2
    iget-object v0, p0, Lcom/join/kotlin/EveryDayNewGameFragment$onViewCreated$3;->this$0:Lcom/join/kotlin/EveryDayNewGameFragment;

    invoke-virtual {v0}, Lcom/join/kotlin/EveryDayNewGameFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/EverydayNewGameFragmentBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/EverydayNewGameFragmentBinding;->c:Lcom/google/android/material/tabs/TabLayout;

    iget-object v1, p0, Lcom/join/kotlin/EveryDayNewGameFragment$onViewCreated$3;->this$0:Lcom/join/kotlin/EveryDayNewGameFragment;

    invoke-virtual {v1}, Lcom/join/kotlin/EveryDayNewGameFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/EverydayNewGameFragmentBinding;

    move-result-object v1

    iget-object v1, v1, Lcom/join/android/app/mgsim/wufun/databinding/EverydayNewGameFragmentBinding;->c:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v1, p1}, Lcom/google/android/material/tabs/TabLayout;->getTabAt(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/material/tabs/TabLayout;->selectTab(Lcom/google/android/material/tabs/TabLayout$Tab;)V

    return-void
.end method
