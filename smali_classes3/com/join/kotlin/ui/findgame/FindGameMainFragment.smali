.class public final Lcom/join/kotlin/ui/findgame/FindGameMainFragment;
.super Landroidx/fragment/app/Fragment;
.source "FindGameMainFragment.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFindGameMainFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FindGameMainFragment.kt\ncom/join/kotlin/ui/findgame/FindGameMainFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,189:1\n1045#2:190\n1855#2:191\n1856#2:193\n1855#2,2:194\n1855#2,2:196\n1855#2,2:198\n1#3:192\n*S KotlinDebug\n*F\n+ 1 FindGameMainFragment.kt\ncom/join/kotlin/ui/findgame/FindGameMainFragment\n*L\n61#1:190\n62#1:191\n62#1:193\n135#1:194,2\n157#1:196,2\n166#1:198,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFindGameMainFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FindGameMainFragment.kt\ncom/join/kotlin/ui/findgame/FindGameMainFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,189:1\n1045#2:190\n1855#2:191\n1856#2:193\n1855#2,2:194\n1855#2,2:196\n1855#2,2:198\n1#3:192\n*S KotlinDebug\n*F\n+ 1 FindGameMainFragment.kt\ncom/join/kotlin/ui/findgame/FindGameMainFragment\n*L\n61#1:190\n62#1:191\n62#1:193\n135#1:194,2\n157#1:196,2\n166#1:198,2\n*E\n"
    }
.end annotation


# instance fields
.field private adapter:Lcom/join/mgps/customview/NavigationAdapter;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private binding:Lcom/join/android/app/mgsim/wufun/databinding/FindgameFragmentLayoutBinding;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private commonWebviewFragment:Lcom/join/mgps/fragment/CommonWebviewFragment_;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private fragments:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/fragment/app/Fragment;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private rankingFragment:Lcom/join/mgps/fragment/RankingFragment_;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private selectedIndex:I

.field private final tabItems$delegate:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->selectedIndex:I

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->fragments:Ljava/util/ArrayList;

    .line 4
    sget-object v0, Lcom/join/kotlin/ui/findgame/FindGameMainFragment$tabItems$2;->INSTANCE:Lcom/join/kotlin/ui/findgame/FindGameMainFragment$tabItems$2;

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->tabItems$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private final selectedTab(I)V
    .locals 4

    const/4 v0, -0x1

    if-eq p1, v0, :cond_2

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->getTabItems()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 2
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/TabItemBean;

    .line 3
    invoke-virtual {v2}, Lcom/join/mgps/dto/TabItemBean;->getIndex()Ljava/lang/Integer;

    move-result-object v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-ne v3, p1, :cond_0

    .line 4
    invoke-virtual {v2}, Lcom/join/mgps/dto/TabItemBean;->getDisplay_index()Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "item.display_index"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    iput v2, p0, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->selectedIndex:I

    goto :goto_0

    :cond_2
    const/4 p1, 0x2

    .line 5
    iput p1, p0, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->selectedIndex:I

    .line 6
    :cond_3
    iget p1, p0, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->selectedIndex:I

    if-ne p1, v0, :cond_4

    const/4 p1, 0x0

    .line 7
    iput p1, p0, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->selectedIndex:I

    .line 8
    :cond_4
    iget-object p1, p0, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->binding:Lcom/join/android/app/mgsim/wufun/databinding/FindgameFragmentLayoutBinding;

    if-eqz p1, :cond_5

    .line 9
    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/FindgameFragmentLayoutBinding;->f:Landroidx/viewpager/widget/ViewPager;

    iget v0, p0, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->selectedIndex:I

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    :cond_5
    return-void
.end method

.method static synthetic selectedTab$default(Lcom/join/kotlin/ui/findgame/FindGameMainFragment;IILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, -0x1

    .line 1
    :cond_0
    invoke-direct {p0, p1}, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->selectedTab(I)V

    return-void
.end method


# virtual methods
.method public final getAdapter()Lcom/join/mgps/customview/NavigationAdapter;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->adapter:Lcom/join/mgps/customview/NavigationAdapter;

    return-object v0
.end method

.method public final getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameFragmentLayoutBinding;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->binding:Lcom/join/android/app/mgsim/wufun/databinding/FindgameFragmentLayoutBinding;

    return-object v0
.end method

.method public final getCommonWebviewFragment()Lcom/join/mgps/fragment/CommonWebviewFragment_;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->commonWebviewFragment:Lcom/join/mgps/fragment/CommonWebviewFragment_;

    return-object v0
.end method

.method public final getDisplayIndex(I)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->getTabItems()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/TabItemBean;

    .line 3
    invoke-virtual {v1}, Lcom/join/mgps/dto/TabItemBean;->getIndex()Ljava/lang/Integer;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, p1, :cond_0

    .line 4
    invoke-virtual {v1}, Lcom/join/mgps/dto/TabItemBean;->getDisplay_index()Ljava/lang/Integer;

    move-result-object p1

    const-string v0, "item.display_index"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final getFragments()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Landroidx/fragment/app/Fragment;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->fragments:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final getIndex(I)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->getTabItems()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/TabItemBean;

    .line 3
    invoke-virtual {v1}, Lcom/join/mgps/dto/TabItemBean;->getDisplay_index()Ljava/lang/Integer;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, p1, :cond_0

    .line 4
    invoke-virtual {v1}, Lcom/join/mgps/dto/TabItemBean;->getIndex()Ljava/lang/Integer;

    move-result-object p1

    const-string v0, "item.index"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final getRankingFragment()Lcom/join/mgps/fragment/RankingFragment_;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->rankingFragment:Lcom/join/mgps/fragment/RankingFragment_;

    return-object v0
.end method

.method public final getSelectedIndex()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->selectedIndex:I

    return v0
.end method

.method public final getTabItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/TabItemBean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->tabItems$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3
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
    invoke-static {p1, p2, p3}, Lcom/join/android/app/mgsim/wufun/databinding/FindgameFragmentLayoutBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/join/android/app/mgsim/wufun/databinding/FindgameFragmentLayoutBinding;

    move-result-object p1

    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->binding:Lcom/join/android/app/mgsim/wufun/databinding/FindgameFragmentLayoutBinding;

    .line 2
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x15

    if-lt p2, p3, :cond_0

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/FindgameFragmentLayoutBinding;->d:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lcom/join/android/app/common/utils/n;->v(Landroid/content/Context;)I

    move-result p2

    iput p2, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 4
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 5
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->getTabItems()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_e

    .line 6
    new-instance p3, Lcom/join/kotlin/ui/findgame/FindGameMainFragment$onCreateView$$inlined$sortedBy$1;

    invoke-direct {p3}, Lcom/join/kotlin/ui/findgame/FindGameMainFragment$onCreateView$$inlined$sortedBy$1;-><init>()V

    invoke-static {p2, p3}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_e

    .line 7
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_e

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/join/mgps/dto/TabItemBean;

    .line 8
    invoke-virtual {p3}, Lcom/join/mgps/dto/TabItemBean;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    invoke-virtual {p3}, Lcom/join/mgps/dto/TabItemBean;->getIndex()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_1

    .line 10
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-nez v1, :cond_3

    iget-object p3, p0, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->fragments:Ljava/util/ArrayList;

    new-instance v0, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;

    invoke-direct {v0}, Lcom/join/kotlin/ui/findgame/FindGameChoiceFragment;-><init>()V

    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    :goto_1
    const/4 v1, 0x1

    if-nez v0, :cond_4

    goto :goto_2

    .line 11
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v1, :cond_5

    .line 12
    new-instance p3, Lcom/join/mgps/fragment/RankingFragment_;

    invoke-direct {p3}, Lcom/join/mgps/fragment/RankingFragment_;-><init>()V

    iput-object p3, p0, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->rankingFragment:Lcom/join/mgps/fragment/RankingFragment_;

    .line 13
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->fragments:Ljava/util/ArrayList;

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    :goto_2
    const/4 v1, 0x2

    if-nez v0, :cond_6

    goto :goto_3

    .line 14
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v1, :cond_7

    iget-object p3, p0, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->fragments:Ljava/util/ArrayList;

    new-instance v0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;

    invoke-direct {v0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;-><init>()V

    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_7
    :goto_3
    const/4 v1, 0x3

    if-nez v0, :cond_8

    goto :goto_4

    .line 15
    :cond_8
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v1, :cond_9

    iget-object p3, p0, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->fragments:Ljava/util/ArrayList;

    new-instance v0, Lcom/join/kotlin/ui/findgame/FindGameGamelistRankMainFragment;

    invoke-direct {v0}, Lcom/join/kotlin/ui/findgame/FindGameGamelistRankMainFragment;-><init>()V

    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_9
    :goto_4
    const/4 v1, 0x4

    if-nez v0, :cond_a

    goto :goto_6

    .line 16
    :cond_a
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v1, :cond_c

    .line 17
    new-instance p3, Lcom/join/mgps/fragment/FindMiniGameFragment_;

    invoke-direct {p3}, Lcom/join/mgps/fragment/FindMiniGameFragment_;-><init>()V

    .line 18
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_b

    const-string v1, "currGameId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_5

    :cond_b
    const/4 v0, 0x0

    .line 19
    :goto_5
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "gameId"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p3, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 20
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->fragments:Ljava/util/ArrayList;

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_c
    :goto_6
    const/4 v1, 0x5

    if-nez v0, :cond_d

    goto/16 :goto_0

    .line 21
    :cond_d
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v1, :cond_1

    .line 22
    new-instance v0, Lcom/join/mgps/fragment/CommonWebviewFragment_;

    invoke-direct {v0}, Lcom/join/mgps/fragment/CommonWebviewFragment_;-><init>()V

    iput-object v0, p0, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->commonWebviewFragment:Lcom/join/mgps/fragment/CommonWebviewFragment_;

    .line 23
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p3}, Lcom/join/mgps/dto/TabItemBean;->getH5_url()Ljava/lang/String;

    move-result-object p3

    const-string/jumbo v2, "url"

    invoke-virtual {v1, v2, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 24
    iget-object p3, p0, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->fragments:Ljava/util/ArrayList;

    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 25
    :cond_e
    new-instance p2, Lcom/join/mgps/customview/NavigationAdapter;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p3

    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->fragments:Ljava/util/ArrayList;

    invoke-direct {p2, p3, v0, p1}, Lcom/join/mgps/customview/NavigationAdapter;-><init>(Landroidx/fragment/app/FragmentManager;Ljava/util/ArrayList;Ljava/util/List;)V

    iput-object p2, p0, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->adapter:Lcom/join/mgps/customview/NavigationAdapter;

    .line 26
    iget-object p1, p0, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->binding:Lcom/join/android/app/mgsim/wufun/databinding/FindgameFragmentLayoutBinding;

    if-eqz p1, :cond_10

    .line 27
    iget-object p3, p1, Lcom/join/android/app/mgsim/wufun/databinding/FindgameFragmentLayoutBinding;->f:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p3, p2}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 28
    iget-object p2, p1, Lcom/join/android/app/mgsim/wufun/databinding/FindgameFragmentLayoutBinding;->f:Landroidx/viewpager/widget/ViewPager;

    iget-object p3, p0, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->fragments:Ljava/util/ArrayList;

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result p3

    invoke-virtual {p2, p3}, Landroidx/viewpager/widget/ViewPager;->setOffscreenPageLimit(I)V

    .line 29
    iget-object p2, p1, Lcom/join/android/app/mgsim/wufun/databinding/FindgameFragmentLayoutBinding;->e:Lcom/join/mgps/customview/SlidingTabLayout6;

    iget-object p3, p1, Lcom/join/android/app/mgsim/wufun/databinding/FindgameFragmentLayoutBinding;->f:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p2, p3}, Lcom/join/mgps/customview/SlidingTabLayout1;->setViewPager(Landroidx/viewpager/widget/ViewPager;)V

    .line 30
    iget-object p2, p0, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->adapter:Lcom/join/mgps/customview/NavigationAdapter;

    if-eqz p2, :cond_f

    invoke-virtual {p2}, Landroidx/viewpager/widget/PagerAdapter;->notifyDataSetChanged()V

    .line 31
    :cond_f
    iget-object p2, p1, Lcom/join/android/app/mgsim/wufun/databinding/FindgameFragmentLayoutBinding;->c:Landroid/widget/ImageView;

    const-string p3, "search"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, Lcom/join/kotlin/ui/findgame/FindGameMainFragment$onCreateView$4$1;

    invoke-direct {p3, p0}, Lcom/join/kotlin/ui/findgame/FindGameMainFragment$onCreateView$4$1;-><init>(Lcom/join/kotlin/ui/findgame/FindGameMainFragment;)V

    invoke-static {p2, p3}, Lcom/psk/kotlin/ext/CommonExtKt;->onClick(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    .line 32
    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/FindgameFragmentLayoutBinding;->f:Landroidx/viewpager/widget/ViewPager;

    new-instance p2, Lcom/join/kotlin/ui/findgame/FindGameMainFragment$onCreateView$4$2;

    invoke-direct {p2, p0}, Lcom/join/kotlin/ui/findgame/FindGameMainFragment$onCreateView$4$2;-><init>(Lcom/join/kotlin/ui/findgame/FindGameMainFragment;)V

    invoke-virtual {p1, p2}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 33
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->setSelectedTab(Landroid/os/Bundle;)V

    .line 34
    :cond_10
    iget-object p1, p0, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->binding:Lcom/join/android/app/mgsim/wufun/databinding/FindgameFragmentLayoutBinding;

    if-eqz p1, :cond_11

    invoke-virtual {p1}, Lcom/join/android/app/mgsim/wufun/databinding/FindgameFragmentLayoutBinding;->a()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    if-eqz p1, :cond_11

    goto :goto_7

    :cond_11
    new-instance p1, Landroid/view/View;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    :goto_7
    return-object p1
.end method

.method public onHiddenChanged(Z)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onHiddenChanged(Z)V

    .line 2
    iget v0, p0, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->selectedIndex:I

    invoke-virtual {p0, v0}, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->getIndex(I)I

    move-result v0

    const-string v1, "fragments[index]"

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->fragments:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroidx/fragment/app/Fragment;

    .line 4
    instance-of v0, p1, Lcom/join/mgps/fragment/FindMiniGameFragment;

    if-eqz v0, :cond_1

    .line 5
    check-cast p1, Lcom/join/mgps/fragment/FindMiniGameFragment;

    invoke-virtual {p1}, Lcom/join/mgps/fragment/FindMiniGameFragment;->r0()V

    goto :goto_0

    .line 6
    :cond_0
    iget-object p1, p0, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->fragments:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroidx/fragment/app/Fragment;

    .line 7
    instance-of v0, p1, Lcom/join/mgps/fragment/FindMiniGameFragment;

    if-eqz v0, :cond_1

    .line 8
    check-cast p1, Lcom/join/mgps/fragment/FindMiniGameFragment;

    invoke-virtual {p1}, Lcom/join/mgps/fragment/FindMiniGameFragment;->s0()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final setAdapter(Lcom/join/mgps/customview/NavigationAdapter;)V
    .locals 0
    .param p1    # Lcom/join/mgps/customview/NavigationAdapter;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->adapter:Lcom/join/mgps/customview/NavigationAdapter;

    return-void
.end method

.method public final setBinding(Lcom/join/android/app/mgsim/wufun/databinding/FindgameFragmentLayoutBinding;)V
    .locals 0
    .param p1    # Lcom/join/android/app/mgsim/wufun/databinding/FindgameFragmentLayoutBinding;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->binding:Lcom/join/android/app/mgsim/wufun/databinding/FindgameFragmentLayoutBinding;

    return-void
.end method

.method public final setCommonWebviewFragment(Lcom/join/mgps/fragment/CommonWebviewFragment_;)V
    .locals 0
    .param p1    # Lcom/join/mgps/fragment/CommonWebviewFragment_;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->commonWebviewFragment:Lcom/join/mgps/fragment/CommonWebviewFragment_;

    return-void
.end method

.method public final setFragments(Ljava/util/ArrayList;)V
    .locals 1
    .param p1    # Ljava/util/ArrayList;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroidx/fragment/app/Fragment;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->fragments:Ljava/util/ArrayList;

    return-void
.end method

.method public final setRankingFragment(Lcom/join/mgps/fragment/RankingFragment_;)V
    .locals 0
    .param p1    # Lcom/join/mgps/fragment/RankingFragment_;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->rankingFragment:Lcom/join/mgps/fragment/RankingFragment_;

    return-void
.end method

.method public final setSelectedIndex(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->selectedIndex:I

    return-void
.end method

.method public setSelectedTab(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_1

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->rankingFragment:Lcom/join/mgps/fragment/RankingFragment_;

    if-eqz v0, :cond_0

    const-string v1, "currTabTagId"

    .line 2
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/fragment/RankingFragment;->Z(Ljava/lang/String;)V

    :cond_0
    const-string v0, "currTabNumber"

    .line 3
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    invoke-direct {p0, p1}, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->selectedTab(I)V

    :cond_1
    return-void
.end method
