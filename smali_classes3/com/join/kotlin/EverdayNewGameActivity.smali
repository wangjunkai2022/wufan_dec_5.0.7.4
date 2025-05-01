.class public final Lcom/join/kotlin/EverdayNewGameActivity;
.super Lcom/BaseAppCompatActivity;
.source "EverdayNewGameActivity.kt"


# instance fields
.field public adapter:Lcom/join/mgps/customview/NavigationAdapter;

.field public binding:Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewActivityBinding;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/BaseAppCompatActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public final getAdapter()Lcom/join/mgps/customview/NavigationAdapter;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/EverdayNewGameActivity;->adapter:Lcom/join/mgps/customview/NavigationAdapter;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "adapter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getBinding()Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewActivityBinding;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/EverdayNewGameActivity;->binding:Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewActivityBinding;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 7
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1}, Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewActivityBinding;->inflate(Landroid/view/LayoutInflater;)Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewActivityBinding;

    move-result-object p1

    const-string v0, "inflate(LayoutInflater.from(this))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p1}, Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewActivityBinding;->a()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/BaseAppCompatActivity;->setContentView(Landroid/view/View;)V

    const-string/jumbo v0, "\u5168\u90e8"

    const-string/jumbo v1, "\u7f51\u6e38"

    const-string/jumbo v2, "\u5355\u673a"

    const-string/jumbo v3, "\u6a21\u62df\u5668"

    .line 4
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->arrayListOf([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    .line 5
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 7
    new-instance v4, Lcom/join/kotlin/EverdayNewFragment;

    invoke-direct {v4}, Lcom/join/kotlin/EverdayNewFragment;-><init>()V

    .line 8
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    const-string/jumbo v6, "title"

    .line 9
    invoke-virtual {v5, v6, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    invoke-virtual {v4, v5}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 11
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 12
    :cond_0
    new-instance v2, Lcom/join/mgps/customview/NavigationAdapter;

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v3

    invoke-direct {v2, v3, v1, v0}, Lcom/join/mgps/customview/NavigationAdapter;-><init>(Landroidx/fragment/app/FragmentManager;Ljava/util/ArrayList;Ljava/util/List;)V

    invoke-virtual {p0, v2}, Lcom/join/kotlin/EverdayNewGameActivity;->setAdapter(Lcom/join/mgps/customview/NavigationAdapter;)V

    .line 13
    iget-object v0, p1, Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewActivityBinding;->e:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p0}, Lcom/join/kotlin/EverdayNewGameActivity;->getAdapter()Lcom/join/mgps/customview/NavigationAdapter;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 14
    invoke-virtual {p0}, Lcom/join/kotlin/EverdayNewGameActivity;->getAdapter()Lcom/join/mgps/customview/NavigationAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/viewpager/widget/PagerAdapter;->notifyDataSetChanged()V

    .line 15
    iget-object v0, p1, Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewActivityBinding;->c:Lcom/join/mgps/customview/SlidingTabLayout6;

    iget-object v1, p1, Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewActivityBinding;->e:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/SlidingTabLayout1;->setViewPager(Landroidx/viewpager/widget/ViewPager;)V

    .line 16
    iget-object v0, p1, Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewActivityBinding;->d:Lcom/join/android/app/mgsim/wufun/databinding/TopbarTitleCenterLayoutBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/TopbarTitleCenterLayoutBinding;->c:Landroid/widget/ImageView;

    const-string v1, "binding.titleLayout.backImage"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/join/kotlin/EverdayNewGameActivity$onCreate$1;

    invoke-direct {v1, p0}, Lcom/join/kotlin/EverdayNewGameActivity$onCreate$1;-><init>(Lcom/join/kotlin/EverdayNewGameActivity;)V

    invoke-static {v0, v1}, Lcom/psk/kotlin/ext/CommonExtKt;->onClick(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    .line 17
    iget-object v0, p1, Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewActivityBinding;->d:Lcom/join/android/app/mgsim/wufun/databinding/TopbarTitleCenterLayoutBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/TopbarTitleCenterLayoutBinding;->e:Landroid/widget/TextView;

    const-string/jumbo v1, "\u6bcf\u65e5\u4e0a\u65b0"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 18
    iget-object v0, p1, Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewActivityBinding;->e:Landroidx/viewpager/widget/ViewPager;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->setOffscreenPageLimit(I)V

    .line 19
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "default_position"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    .line 20
    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewActivityBinding;->e:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

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
    iput-object p1, p0, Lcom/join/kotlin/EverdayNewGameActivity;->adapter:Lcom/join/mgps/customview/NavigationAdapter;

    return-void
.end method

.method public final setBinding(Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewActivityBinding;)V
    .locals 1
    .param p1    # Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewActivityBinding;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/EverdayNewGameActivity;->binding:Lcom/join/android/app/mgsim/wufun/databinding/EverdayNewActivityBinding;

    return-void
.end method
