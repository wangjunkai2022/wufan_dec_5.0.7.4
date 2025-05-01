.class public final Lcom/join/kotlin/EveryDayNewGameFragment;
.super Landroidx/fragment/app/Fragment;
.source "EveryDayNewGameFragment.kt"


# instance fields
.field public adapter:Landroidx/viewpager2/adapter/FragmentStateAdapter;

.field public binding:Lcom/join/android/app/mgsim/wufun/databinding/EverydayNewGameFragmentBinding;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    return-void
.end method


# virtual methods
.method public final getAdapter()Landroidx/viewpager2/adapter/FragmentStateAdapter;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/EveryDayNewGameFragment;->adapter:Landroidx/viewpager2/adapter/FragmentStateAdapter;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "adapter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getBinding()Lcom/join/android/app/mgsim/wufun/databinding/EverydayNewGameFragmentBinding;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/EveryDayNewGameFragment;->binding:Lcom/join/android/app/mgsim/wufun/databinding/EverydayNewGameFragmentBinding;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0
    .param p1    # Landroid/view/LayoutInflater;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x0

    .line 1
    invoke-static {p1, p2, p3}, Lcom/join/android/app/mgsim/wufun/databinding/EverydayNewGameFragmentBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/join/android/app/mgsim/wufun/databinding/EverydayNewGameFragmentBinding;

    move-result-object p1

    const-string p2, "inflate(inflater, container, false)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/join/kotlin/EveryDayNewGameFragment;->setBinding(Lcom/join/android/app/mgsim/wufun/databinding/EverydayNewGameFragmentBinding;)V

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/EveryDayNewGameFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/EverydayNewGameFragmentBinding;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/android/app/mgsim/wufun/databinding/EverydayNewGameFragmentBinding;->a()Landroid/widget/LinearLayout;

    move-result-object p1

    return-object p1
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 5
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string/jumbo v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    const-string/jumbo p1, "\u5168\u90e8"

    const-string/jumbo p2, "\u7f51\u6e38"

    const-string/jumbo v0, "\u5355\u673a"

    const-string/jumbo v1, "\u6a21\u62df\u5668"

    .line 2
    filled-new-array {p1, p2, v0, v1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->arrayListOf([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p1

    .line 3
    new-instance p2, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {p2}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 4
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 5
    new-instance v1, Lcom/join/kotlin/EverdayNewFragment;

    invoke-direct {v1}, Lcom/join/kotlin/EverdayNewFragment;-><init>()V

    .line 6
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string/jumbo v3, "title"

    .line 7
    invoke-virtual {v2, v3, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x1

    const-string v4, "_from_home"

    .line 8
    invoke-virtual {v2, v4, v3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 9
    invoke-virtual {v1, v2}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 10
    iget-object v2, p2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    invoke-virtual {p0}, Lcom/join/kotlin/EveryDayNewGameFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/EverydayNewGameFragmentBinding;

    move-result-object v1

    iget-object v1, v1, Lcom/join/android/app/mgsim/wufun/databinding/EverydayNewGameFragmentBinding;->c:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v1}, Lcom/google/android/material/tabs/TabLayout;->newTab()Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object v1

    const v2, 0x7f0c04e7

    invoke-virtual {v1, v2}, Lcom/google/android/material/tabs/TabLayout$Tab;->setCustomView(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object v1

    const-string v2, "binding.tablayout.newTab\u2026out_custom_tab_main_game)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-virtual {v1}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 13
    invoke-virtual {v1}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const v3, 0x7f09135c

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 14
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 15
    invoke-virtual {p0}, Lcom/join/kotlin/EveryDayNewGameFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/EverydayNewGameFragmentBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/EverydayNewGameFragmentBinding;->c:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v0, v1}, Lcom/google/android/material/tabs/TabLayout;->addTab(Lcom/google/android/material/tabs/TabLayout$Tab;)V

    goto :goto_0

    .line 16
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    new-instance v0, Lcom/join/kotlin/EveryDayNewGameFragment$onViewCreated$1;

    invoke-direct {v0, p2, p1}, Lcom/join/kotlin/EveryDayNewGameFragment$onViewCreated$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/fragment/app/FragmentActivity;)V

    invoke-virtual {p0, v0}, Lcom/join/kotlin/EveryDayNewGameFragment;->setAdapter(Landroidx/viewpager2/adapter/FragmentStateAdapter;)V

    .line 17
    invoke-virtual {p0}, Lcom/join/kotlin/EveryDayNewGameFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/EverydayNewGameFragmentBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/EverydayNewGameFragmentBinding;->d:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {p0}, Lcom/join/kotlin/EveryDayNewGameFragment;->getAdapter()Landroidx/viewpager2/adapter/FragmentStateAdapter;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 18
    invoke-virtual {p0}, Lcom/join/kotlin/EveryDayNewGameFragment;->getAdapter()Landroidx/viewpager2/adapter/FragmentStateAdapter;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 19
    invoke-virtual {p0}, Lcom/join/kotlin/EveryDayNewGameFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/EverydayNewGameFragmentBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/EverydayNewGameFragmentBinding;->c:Lcom/google/android/material/tabs/TabLayout;

    new-instance p2, Lcom/join/kotlin/EveryDayNewGameFragment$onViewCreated$2;

    invoke-direct {p2, p0}, Lcom/join/kotlin/EveryDayNewGameFragment$onViewCreated$2;-><init>(Lcom/join/kotlin/EveryDayNewGameFragment;)V

    invoke-virtual {p1, p2}, Lcom/google/android/material/tabs/TabLayout;->addOnTabSelectedListener(Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;)V

    .line 20
    invoke-virtual {p0}, Lcom/join/kotlin/EveryDayNewGameFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/EverydayNewGameFragmentBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/EverydayNewGameFragmentBinding;->d:Landroidx/viewpager2/widget/ViewPager2;

    new-instance p2, Lcom/join/kotlin/EveryDayNewGameFragment$onViewCreated$3;

    invoke-direct {p2, p0}, Lcom/join/kotlin/EveryDayNewGameFragment$onViewCreated$3;-><init>(Lcom/join/kotlin/EveryDayNewGameFragment;)V

    invoke-virtual {p1, p2}, Landroidx/viewpager2/widget/ViewPager2;->registerOnPageChangeCallback(Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;)V

    .line 21
    invoke-virtual {p0}, Lcom/join/kotlin/EveryDayNewGameFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/EverydayNewGameFragmentBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/EverydayNewGameFragmentBinding;->d:Landroidx/viewpager2/widget/ViewPager2;

    const/4 p2, 0x5

    invoke-virtual {p1, p2}, Landroidx/viewpager2/widget/ViewPager2;->setOffscreenPageLimit(I)V

    .line 22
    invoke-virtual {p0}, Lcom/join/kotlin/EveryDayNewGameFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/EverydayNewGameFragmentBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/EverydayNewGameFragmentBinding;->c:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {p0}, Lcom/join/kotlin/EveryDayNewGameFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/EverydayNewGameFragmentBinding;

    move-result-object p2

    iget-object p2, p2, Lcom/join/android/app/mgsim/wufun/databinding/EverydayNewGameFragmentBinding;->c:Lcom/google/android/material/tabs/TabLayout;

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lcom/google/android/material/tabs/TabLayout;->getTabAt(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/android/material/tabs/TabLayout;->selectTab(Lcom/google/android/material/tabs/TabLayout$Tab;)V

    return-void
.end method

.method public final setAdapter(Landroidx/viewpager2/adapter/FragmentStateAdapter;)V
    .locals 1
    .param p1    # Landroidx/viewpager2/adapter/FragmentStateAdapter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/EveryDayNewGameFragment;->adapter:Landroidx/viewpager2/adapter/FragmentStateAdapter;

    return-void
.end method

.method public final setBinding(Lcom/join/android/app/mgsim/wufun/databinding/EverydayNewGameFragmentBinding;)V
    .locals 1
    .param p1    # Lcom/join/android/app/mgsim/wufun/databinding/EverydayNewGameFragmentBinding;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/EveryDayNewGameFragment;->binding:Lcom/join/android/app/mgsim/wufun/databinding/EverydayNewGameFragmentBinding;

    return-void
.end method
