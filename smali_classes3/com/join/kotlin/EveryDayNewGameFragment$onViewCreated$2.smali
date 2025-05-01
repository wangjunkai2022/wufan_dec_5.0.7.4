.class public final Lcom/join/kotlin/EveryDayNewGameFragment$onViewCreated$2;
.super Ljava/lang/Object;
.source "EveryDayNewGameFragment.kt"

# interfaces
.implements Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;


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

    iput-object p1, p0, Lcom/join/kotlin/EveryDayNewGameFragment$onViewCreated$2;->this$0:Lcom/join/kotlin/EveryDayNewGameFragment;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTabReselected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 6
    .param p1    # Lcom/google/android/material/tabs/TabLayout$Tab;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string/jumbo v0, "tab"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/EveryDayNewGameFragment$onViewCreated$2;->this$0:Lcom/join/kotlin/EveryDayNewGameFragment;

    invoke-virtual {v0}, Lcom/join/kotlin/EveryDayNewGameFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/EverydayNewGameFragmentBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/EverydayNewGameFragmentBinding;->d:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout$Tab;->getPosition()I

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(I)V

    .line 2
    iget-object p1, p0, Lcom/join/kotlin/EveryDayNewGameFragment$onViewCreated$2;->this$0:Lcom/join/kotlin/EveryDayNewGameFragment;

    invoke-virtual {p1}, Lcom/join/kotlin/EveryDayNewGameFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/EverydayNewGameFragmentBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/EverydayNewGameFragmentBinding;->c:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout;->getTabCount()I

    move-result p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_2

    .line 3
    iget-object v2, p0, Lcom/join/kotlin/EveryDayNewGameFragment$onViewCreated$2;->this$0:Lcom/join/kotlin/EveryDayNewGameFragment;

    invoke-virtual {v2}, Lcom/join/kotlin/EveryDayNewGameFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/EverydayNewGameFragmentBinding;

    move-result-object v2

    iget-object v2, v2, Lcom/join/android/app/mgsim/wufun/databinding/EverydayNewGameFragmentBinding;->c:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v2, v1}, Lcom/google/android/material/tabs/TabLayout;->getTabAt(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 4
    invoke-virtual {v2}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 5
    invoke-virtual {v2}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const v4, 0x7f09135c

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 6
    iget-object v4, p0, Lcom/join/kotlin/EveryDayNewGameFragment$onViewCreated$2;->this$0:Lcom/join/kotlin/EveryDayNewGameFragment;

    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v2}, Lcom/google/android/material/tabs/TabLayout$Tab;->isSelected()Z

    move-result v5

    if-eqz v5, :cond_0

    const v5, 0x7f071279

    goto :goto_1

    :cond_0
    const v5, 0x7f07124c

    :goto_1
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v4

    .line 7
    invoke-virtual {v3, v0, v4}, Landroid/widget/TextView;->setTextSize(IF)V

    const/4 v4, 0x0

    .line 8
    invoke-virtual {v2}, Lcom/google/android/material/tabs/TabLayout$Tab;->isSelected()Z

    move-result v2

    .line 9
    invoke-virtual {v3, v4, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public onTabSelected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 6
    .param p1    # Lcom/google/android/material/tabs/TabLayout$Tab;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string/jumbo v0, "tab"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/EveryDayNewGameFragment$onViewCreated$2;->this$0:Lcom/join/kotlin/EveryDayNewGameFragment;

    invoke-virtual {v0}, Lcom/join/kotlin/EveryDayNewGameFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/EverydayNewGameFragmentBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/EverydayNewGameFragmentBinding;->d:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout$Tab;->getPosition()I

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(I)V

    .line 2
    iget-object p1, p0, Lcom/join/kotlin/EveryDayNewGameFragment$onViewCreated$2;->this$0:Lcom/join/kotlin/EveryDayNewGameFragment;

    invoke-virtual {p1}, Lcom/join/kotlin/EveryDayNewGameFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/EverydayNewGameFragmentBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/EverydayNewGameFragmentBinding;->c:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout;->getTabCount()I

    move-result p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_2

    .line 3
    iget-object v2, p0, Lcom/join/kotlin/EveryDayNewGameFragment$onViewCreated$2;->this$0:Lcom/join/kotlin/EveryDayNewGameFragment;

    invoke-virtual {v2}, Lcom/join/kotlin/EveryDayNewGameFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/EverydayNewGameFragmentBinding;

    move-result-object v2

    iget-object v2, v2, Lcom/join/android/app/mgsim/wufun/databinding/EverydayNewGameFragmentBinding;->c:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v2, v1}, Lcom/google/android/material/tabs/TabLayout;->getTabAt(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 4
    invoke-virtual {v2}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 5
    invoke-virtual {v2}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const v4, 0x7f09135c

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 6
    iget-object v4, p0, Lcom/join/kotlin/EveryDayNewGameFragment$onViewCreated$2;->this$0:Lcom/join/kotlin/EveryDayNewGameFragment;

    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v2}, Lcom/google/android/material/tabs/TabLayout$Tab;->isSelected()Z

    move-result v5

    if-eqz v5, :cond_0

    const v5, 0x7f0712a5

    goto :goto_1

    :cond_0
    const v5, 0x7f07124c

    :goto_1
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v4

    .line 7
    invoke-virtual {v3, v0, v4}, Landroid/widget/TextView;->setTextSize(IF)V

    const/4 v4, 0x0

    .line 8
    invoke-virtual {v2}, Lcom/google/android/material/tabs/TabLayout$Tab;->isSelected()Z

    move-result v2

    .line 9
    invoke-virtual {v3, v4, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public onTabUnselected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 1
    .param p1    # Lcom/google/android/material/tabs/TabLayout$Tab;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string/jumbo v0, "tab"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
