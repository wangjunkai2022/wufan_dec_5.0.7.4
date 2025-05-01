.class public final Lcom/join/kotlin/ui/findgame/FindGameGamelistRankMainFragment;
.super Landroidx/fragment/app/Fragment;
.source "FindGameGamelistRankMainFragment.kt"


# instance fields
.field public adapter:Lcom/join/mgps/customview/NavigationAdapter;

.field public binding:Lcom/join/android/app/mgsim/wufun/databinding/FindgameGamelistrankfragmentLayoutBinding;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    return-void
.end method


# virtual methods
.method public final getAdapter()Lcom/join/mgps/customview/NavigationAdapter;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/FindGameGamelistRankMainFragment;->adapter:Lcom/join/mgps/customview/NavigationAdapter;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "adapter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameGamelistrankfragmentLayoutBinding;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/FindGameGamelistRankMainFragment;->binding:Lcom/join/android/app/mgsim/wufun/databinding/FindgameGamelistrankfragmentLayoutBinding;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1
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
    invoke-static {p1, p2, p3}, Lcom/join/android/app/mgsim/wufun/databinding/FindgameGamelistrankfragmentLayoutBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/join/android/app/mgsim/wufun/databinding/FindgameGamelistrankfragmentLayoutBinding;

    move-result-object p1

    const-string p2, "inflate(inflater, container, false)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/join/kotlin/ui/findgame/FindGameGamelistRankMainFragment;->setBinding(Lcom/join/android/app/mgsim/wufun/databinding/FindgameGamelistrankfragmentLayoutBinding;)V

    const-string/jumbo p1, "\u70ed\u95e8"

    const-string/jumbo p2, "\u6700\u65b0"

    .line 2
    filled-new-array {p1, p2}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->arrayListOf([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p1

    .line 3
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    const/4 p3, 0x1

    .line 4
    invoke-static {p3}, Lcom/join/mgps/fragment/GameFormFragment;->g0(I)Lcom/join/mgps/fragment/GameFormFragment;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p3, 0x2

    .line 5
    invoke-static {p3}, Lcom/join/mgps/fragment/GameFormFragment;->g0(I)Lcom/join/mgps/fragment/GameFormFragment;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 6
    new-instance p3, Lcom/join/mgps/customview/NavigationAdapter;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-direct {p3, v0, p2, p1}, Lcom/join/mgps/customview/NavigationAdapter;-><init>(Landroidx/fragment/app/FragmentManager;Ljava/util/ArrayList;Ljava/util/List;)V

    invoke-virtual {p0, p3}, Lcom/join/kotlin/ui/findgame/FindGameGamelistRankMainFragment;->setAdapter(Lcom/join/mgps/customview/NavigationAdapter;)V

    .line 7
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameGamelistRankMainFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameGamelistrankfragmentLayoutBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/FindgameGamelistrankfragmentLayoutBinding;->d:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameGamelistRankMainFragment;->getAdapter()Lcom/join/mgps/customview/NavigationAdapter;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 8
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameGamelistRankMainFragment;->getAdapter()Lcom/join/mgps/customview/NavigationAdapter;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/viewpager/widget/PagerAdapter;->notifyDataSetChanged()V

    .line 9
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameGamelistRankMainFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameGamelistrankfragmentLayoutBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/FindgameGamelistrankfragmentLayoutBinding;->c:Lcom/join/mgps/customview/SlidingTabLayout6;

    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameGamelistRankMainFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameGamelistrankfragmentLayoutBinding;

    move-result-object p2

    iget-object p2, p2, Lcom/join/android/app/mgsim/wufun/databinding/FindgameGamelistrankfragmentLayoutBinding;->d:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1, p2}, Lcom/join/mgps/customview/SlidingTabLayout1;->setViewPager(Landroidx/viewpager/widget/ViewPager;)V

    .line 10
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameGamelistRankMainFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameGamelistrankfragmentLayoutBinding;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/android/app/mgsim/wufun/databinding/FindgameGamelistrankfragmentLayoutBinding;->a()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    return-object p1
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/d0;->e(Ljava/lang/Object;)V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1
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

    return-void
.end method

.method public final setAdapter(Lcom/join/mgps/customview/NavigationAdapter;)V
    .locals 1
    .param p1    # Lcom/join/mgps/customview/NavigationAdapter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/FindGameGamelistRankMainFragment;->adapter:Lcom/join/mgps/customview/NavigationAdapter;

    return-void
.end method

.method public final setBinding(Lcom/join/android/app/mgsim/wufun/databinding/FindgameGamelistrankfragmentLayoutBinding;)V
    .locals 1
    .param p1    # Lcom/join/android/app/mgsim/wufun/databinding/FindgameGamelistrankfragmentLayoutBinding;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/FindGameGamelistRankMainFragment;->binding:Lcom/join/android/app/mgsim/wufun/databinding/FindgameGamelistrankfragmentLayoutBinding;

    return-void
.end method
