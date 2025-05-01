.class public final Lcom/join/kotlin/discount/GameDetailActivity;
.super Lcom/join/kotlin/base/activity/BaseVmDbActivity;
.source "GameDetailActivity.kt"

# interfaces
.implements Lcom/join/kotlin/discount/proxy/GameDetailClickProxy;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/kotlin/base/activity/BaseVmDbActivity<",
        "Lcom/join/kotlin/discount/viewmodel/GameDetailViewModel;",
        "Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailBinding;",
        ">;",
        "Lcom/join/kotlin/discount/proxy/GameDetailClickProxy;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGameDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameDetailActivity.kt\ncom/join/kotlin/discount/GameDetailActivity\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,276:1\n13579#2,2:277\n13644#2,3:279\n*S KotlinDebug\n*F\n+ 1 GameDetailActivity.kt\ncom/join/kotlin/discount/GameDetailActivity\n*L\n101#1:277,2\n128#1:279,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nGameDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameDetailActivity.kt\ncom/join/kotlin/discount/GameDetailActivity\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,276:1\n13579#2,2:277\n13644#2,3:279\n*S KotlinDebug\n*F\n+ 1 GameDetailActivity.kt\ncom/join/kotlin/discount/GameDetailActivity\n*L\n101#1:277,2\n128#1:279,3\n*E\n"
    }
.end annotation


# instance fields
.field private defaultBtnImage:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private detailTabDarkColor:Z

.field private ext:Lcom/join/mgps/dto/ExtBean;
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

.field private gameId:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private tabTitles:[Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;-><init>()V

    const-string/jumbo v0, "\u8be6\u60c5"

    const-string/jumbo v1, "\u8bc4\u4ef7"

    .line 2
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/kotlin/discount/GameDetailActivity;->tabTitles:[Ljava/lang/String;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/kotlin/discount/GameDetailActivity;->fragments:Ljava/util/ArrayList;

    return-void
.end method

.method public static final synthetic access$getFragments$p(Lcom/join/kotlin/discount/GameDetailActivity;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/kotlin/discount/GameDetailActivity;->fragments:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static final synthetic access$refreshTab(Lcom/join/kotlin/discount/GameDetailActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/kotlin/discount/GameDetailActivity;->refreshTab()V

    return-void
.end method

.method private final refreshTab()V
    .locals 9

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailBinding;->d:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayout;->getSelectedTabPosition()I

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-boolean v1, p0, Lcom/join/kotlin/discount/GameDetailActivity;->detailTabDarkColor:Z

    if-nez v1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v1

    check-cast v1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailBinding;

    iget-object v1, v1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailBinding;->b:Landroid/widget/ImageView;

    const v2, 0x7f08015e

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v1

    check-cast v1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailBinding;

    iget-object v1, v1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailBinding;->b:Landroid/widget/ImageView;

    const v2, 0x7f08015c

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 5
    :goto_0
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v1

    check-cast v1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailBinding;

    iget-object v1, v1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailBinding;->d:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v1}, Lcom/google/android/material/tabs/TabLayout;->getTabCount()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v1, :cond_e

    .line 6
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v4

    check-cast v4, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailBinding;

    iget-object v4, v4, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailBinding;->d:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v4, v3}, Lcom/google/android/material/tabs/TabLayout;->getTabAt(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object v4

    if-eqz v4, :cond_d

    .line 7
    invoke-virtual {v4}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v5

    if-nez v5, :cond_1

    return-void

    .line 8
    :cond_1
    invoke-virtual {v4}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v5

    const/4 v6, 0x0

    if-eqz v5, :cond_2

    const v7, 0x7f091691

    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    goto :goto_2

    :cond_2
    move-object v5, v6

    .line 9
    :goto_2
    invoke-virtual {v4}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v7

    if-eqz v7, :cond_3

    const v6, 0x7f091645

    invoke-virtual {v7, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    .line 10
    :cond_3
    invoke-virtual {v4}, Lcom/google/android/material/tabs/TabLayout$Tab;->isSelected()Z

    move-result v4

    const-string v7, "#FFFFFF"

    if-eqz v4, :cond_8

    if-nez v5, :cond_4

    goto :goto_3

    :cond_4
    const-string v4, "sans-serif-medium"

    .line 11
    invoke-static {v4, v2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v4

    invoke-virtual {v5, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :goto_3
    const-string v4, "#000000"

    if-eqz v5, :cond_6

    if-nez v0, :cond_5

    .line 12
    iget-boolean v8, p0, Lcom/join/kotlin/discount/GameDetailActivity;->detailTabDarkColor:Z

    if-nez v8, :cond_5

    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v8

    goto :goto_4

    .line 13
    :cond_5
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v8

    .line 14
    :goto_4
    invoke-virtual {v5, v8}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_6
    if-eqz v6, :cond_d

    if-nez v0, :cond_7

    .line 15
    iget-boolean v5, p0, Lcom/join/kotlin/discount/GameDetailActivity;->detailTabDarkColor:Z

    if-nez v5, :cond_7

    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    goto :goto_5

    .line 16
    :cond_7
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    .line 17
    :goto_5
    invoke-virtual {v6, v4}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_9

    :cond_8
    if-nez v5, :cond_9

    goto :goto_6

    .line 18
    :cond_9
    sget-object v4, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-virtual {v5, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :goto_6
    const-string v4, "#919191"

    if-eqz v5, :cond_b

    if-nez v0, :cond_a

    .line 19
    iget-boolean v8, p0, Lcom/join/kotlin/discount/GameDetailActivity;->detailTabDarkColor:Z

    if-nez v8, :cond_a

    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v8

    goto :goto_7

    .line 20
    :cond_a
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v8

    .line 21
    :goto_7
    invoke-virtual {v5, v8}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_b
    if-eqz v6, :cond_d

    if-nez v0, :cond_c

    .line 22
    iget-boolean v5, p0, Lcom/join/kotlin/discount/GameDetailActivity;->detailTabDarkColor:Z

    if-nez v5, :cond_c

    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    goto :goto_8

    .line 23
    :cond_c
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    .line 24
    :goto_8
    invoke-virtual {v6, v4}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_d
    :goto_9
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_1

    :cond_e
    return-void
.end method

.method public static synthetic setTabData$default(Lcom/join/kotlin/discount/GameDetailActivity;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const-string v0, ""

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    .line 1
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/join/kotlin/discount/GameDetailActivity;->setTabData(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private final transparentStatuBar()V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/high16 v1, 0x4000000

    const/16 v2, 0x15

    if-lt v0, v2, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    .line 3
    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    .line 4
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    const/16 v2, 0x500

    invoke-virtual {v1, v2}, Landroid/view/View;->setSystemUiVisibility(I)V

    const/high16 v1, -0x80000000

    .line 5
    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    goto :goto_0

    :cond_0
    const/16 v2, 0x13

    if-lt v0, v2, :cond_1

    .line 7
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public createObserver()V
    .locals 0

    return-void
.end method

.method public final getTabBottom()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailBinding;->d:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v0}, Landroid/widget/HorizontalScrollView;->getBottom()I

    move-result v0

    return v0
.end method

.method public final initTabAndViewpager()V
    .locals 10

    const/4 v0, 0x1

    .line 1
    :try_start_0
    const-class v1, Landroidx/viewpager2/widget/ViewPager2;

    const-string v2, "mRecyclerView"

    .line 2
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    const-string v2, "ViewPager2::class.java.g\u2026redField(\"mRecyclerView\")"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 4
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v2

    check-cast v2, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailBinding;

    iget-object v2, v2, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailBinding;->e:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    const-class v2, Landroidx/recyclerview/widget/RecyclerView;

    const-string v3, "mTouchSlop"

    .line 5
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    const-string v3, "RecyclerView::class.java\u2026claredField(\"mTouchSlop\")"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 7
    invoke-virtual {v2, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type kotlin.Int"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    mul-int/lit8 v3, v3, 0x3

    .line 8
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 10
    :goto_0
    iget-object v1, p0, Lcom/join/kotlin/discount/GameDetailActivity;->tabTitles:[Ljava/lang/String;

    .line 11
    array-length v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v2, :cond_5

    aget-object v5, v1, v4

    .line 12
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v6

    check-cast v6, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailBinding;

    iget-object v6, v6, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailBinding;->d:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v6}, Lcom/google/android/material/tabs/TabLayout;->newTab()Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object v6

    const v7, 0x7f0c04e6

    invoke-virtual {v6, v7}, Lcom/google/android/material/tabs/TabLayout$Tab;->setCustomView(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object v6

    const-string v7, "mDatabind.tablayout.newT\u2026t_custom_tab_game_detail)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-virtual {v6}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v7

    const/4 v8, 0x0

    if-eqz v7, :cond_0

    const v9, 0x7f091691

    invoke-virtual {v7, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    goto :goto_2

    :cond_0
    move-object v7, v8

    :goto_2
    if-nez v7, :cond_1

    goto :goto_3

    .line 14
    :cond_1
    invoke-virtual {v7, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 15
    :goto_3
    invoke-virtual {v6}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v5

    if-eqz v5, :cond_2

    const v7, 0x7f091645

    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    move-object v8, v5

    check-cast v8, Landroid/widget/TextView;

    :cond_2
    if-eqz v8, :cond_3

    const/4 v5, -0x1

    .line 16
    invoke-virtual {v8, v5}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_3
    if-nez v8, :cond_4

    goto :goto_4

    :cond_4
    const/16 v5, 0x8

    .line 17
    invoke-virtual {v8, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 18
    :goto_4
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v5

    check-cast v5, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailBinding;

    iget-object v5, v5, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailBinding;->d:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v5, v6}, Lcom/google/android/material/tabs/TabLayout;->addTab(Lcom/google/android/material/tabs/TabLayout$Tab;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 19
    :cond_5
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v1

    check-cast v1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailBinding;

    iget-object v1, v1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailBinding;->d:Lcom/google/android/material/tabs/TabLayout;

    new-instance v2, Lcom/join/kotlin/discount/GameDetailActivity$initTabAndViewpager$2;

    invoke-direct {v2, p0}, Lcom/join/kotlin/discount/GameDetailActivity$initTabAndViewpager$2;-><init>(Lcom/join/kotlin/discount/GameDetailActivity;)V

    invoke-virtual {v1, v2}, Lcom/google/android/material/tabs/TabLayout;->addOnTabSelectedListener(Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;)V

    .line 20
    iget-object v1, p0, Lcom/join/kotlin/discount/GameDetailActivity;->fragments:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 21
    iget-object v1, p0, Lcom/join/kotlin/discount/GameDetailActivity;->tabTitles:[Ljava/lang/String;

    .line 22
    array-length v2, v1

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_5
    if-ge v4, v2, :cond_8

    aget-object v6, v1, v4

    add-int/lit8 v7, v5, 0x1

    .line 23
    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    const-string/jumbo v9, "type"

    .line 24
    invoke-virtual {v8, v9, v6}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    iget-object v6, p0, Lcom/join/kotlin/discount/GameDetailActivity;->gameId:Ljava/lang/String;

    const-string v9, "gameId"

    invoke-virtual {v8, v9, v6}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    iget-object v6, p0, Lcom/join/kotlin/discount/GameDetailActivity;->defaultBtnImage:Ljava/lang/String;

    const-string v9, "defaultBtnImage"

    invoke-virtual {v8, v9, v6}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v6

    iget-object v9, p0, Lcom/join/kotlin/discount/GameDetailActivity;->ext:Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {v6, v9}, Lcom/join/android/app/common/utils/JsonMapper;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const-string v9, "ext"

    invoke-virtual {v8, v9, v6}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v6

    const-string v9, "autoDownload"

    invoke-virtual {v6, v9, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v6

    invoke-virtual {v8, v9, v6}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 29
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v6

    const-string v9, "showNewServer"

    invoke-virtual {v6, v9, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v6

    invoke-virtual {v8, v9, v6}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    if-eqz v5, :cond_7

    if-eq v5, v0, :cond_6

    .line 30
    new-instance v5, Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-direct {v5}, Lcom/join/kotlin/discount/GameDetailFragment;-><init>()V

    goto :goto_6

    .line 31
    :cond_6
    new-instance v5, Lcom/join/kotlin/discount/GameDetailCommentListFragment;

    invoke-direct {v5}, Lcom/join/kotlin/discount/GameDetailCommentListFragment;-><init>()V

    goto :goto_6

    .line 32
    :cond_7
    new-instance v5, Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-direct {v5}, Lcom/join/kotlin/discount/GameDetailFragment;-><init>()V

    .line 33
    :goto_6
    invoke-virtual {v5, v8}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 34
    iget-object v6, p0, Lcom/join/kotlin/discount/GameDetailActivity;->fragments:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    move v5, v7

    goto :goto_5

    .line 35
    :cond_8
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailBinding;->e:Landroidx/viewpager2/widget/ViewPager2;

    new-instance v1, Lcom/join/kotlin/discount/GameDetailActivity$initTabAndViewpager$4;

    invoke-direct {v1, p0}, Lcom/join/kotlin/discount/GameDetailActivity$initTabAndViewpager$4;-><init>(Lcom/join/kotlin/discount/GameDetailActivity;)V

    invoke-virtual {v0, v1}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 36
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailBinding;->e:Landroidx/viewpager2/widget/ViewPager2;

    new-instance v1, Lcom/join/kotlin/discount/GameDetailActivity$initTabAndViewpager$5;

    invoke-direct {v1, p0}, Lcom/join/kotlin/discount/GameDetailActivity$initTabAndViewpager$5;-><init>(Lcom/join/kotlin/discount/GameDetailActivity;)V

    invoke-virtual {v0, v1}, Landroidx/viewpager2/widget/ViewPager2;->registerOnPageChangeCallback(Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;)V

    .line 37
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailBinding;->e:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0, v3}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(I)V

    return-void
.end method

.method public initView(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailBinding;

    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/discount/viewmodel/GameDetailViewModel;

    invoke-virtual {p1, v0}, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailBinding;->h(Lcom/join/kotlin/discount/viewmodel/GameDetailViewModel;)V

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailBinding;

    invoke-virtual {p1, p0}, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailBinding;->g(Lcom/join/kotlin/discount/proxy/GameDetailClickProxy;)V

    .line 3
    invoke-direct {p0}, Lcom/join/kotlin/discount/GameDetailActivity;->transparentStatuBar()V

    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "gameId"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/join/kotlin/discount/GameDetailActivity;->gameId:Ljava/lang/String;

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "defaultBtnImage"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/join/kotlin/discount/GameDetailActivity;->defaultBtnImage:Ljava/lang/String;

    .line 6
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object p1

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "ext"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-class v1, Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {p1, v0, v1}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/ExtBean;

    iput-object p1, p0, Lcom/join/kotlin/discount/GameDetailActivity;->ext:Lcom/join/mgps/dto/ExtBean;

    .line 7
    iget-object p1, p0, Lcom/join/kotlin/discount/GameDetailActivity;->gameId:Ljava/lang/String;

    if-nez p1, :cond_0

    .line 8
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/join/kotlin/discount/GameDetailActivity;->initTabAndViewpager()V

    return-void
.end method

.method public onBackClick()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final selectTab(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailBinding;->e:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0, p1}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(I)V

    return-void
.end method

.method public final setTabData(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailBinding;->d:Lcom/google/android/material/tabs/TabLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/HorizontalScrollView;->setVisibility(I)V

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailBinding;->d:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayout;->getTabCount()I

    move-result v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    :goto_0
    if-ge v3, v0, :cond_e

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v4

    check-cast v4, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailBinding;

    iget-object v4, v4, Lcom/join/android/app/mgsim/wufun/databinding/ActivityDiscountGameDetailBinding;->d:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v4, v3}, Lcom/google/android/material/tabs/TabLayout;->getTabAt(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object v4

    if-eqz v4, :cond_d

    .line 4
    invoke-virtual {v4}, Lcom/google/android/material/tabs/TabLayout$Tab;->isSelected()Z

    move-result v5

    if-nez v5, :cond_c

    invoke-virtual {v4}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v5

    if-nez v5, :cond_0

    goto/16 :goto_9

    .line 5
    :cond_0
    invoke-virtual {v4}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_1

    const v5, 0x7f091645

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    goto :goto_3

    :cond_2
    if-ne v3, v2, :cond_3

    .line 6
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    goto :goto_2

    :cond_3
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    :goto_2
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_3
    if-nez v4, :cond_4

    goto :goto_a

    :cond_4
    const-string v5, "0"

    const/16 v6, 0x8

    if-ne v3, v2, :cond_7

    if-eqz p1, :cond_6

    .line 7
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-nez v7, :cond_5

    goto :goto_4

    :cond_5
    const/4 v7, 0x0

    goto :goto_5

    :cond_6
    :goto_4
    const/4 v7, 0x1

    :goto_5
    if-nez v7, :cond_b

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    goto :goto_8

    :cond_7
    if-eqz p2, :cond_9

    .line 8
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-nez v7, :cond_8

    goto :goto_6

    :cond_8
    const/4 v7, 0x0

    goto :goto_7

    :cond_9
    :goto_6
    const/4 v7, 0x1

    :goto_7
    if-nez v7, :cond_b

    invoke-static {p2, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    goto :goto_8

    :cond_a
    const/4 v6, 0x0

    .line 9
    :cond_b
    :goto_8
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_a

    :cond_c
    :goto_9
    return-void

    :cond_d
    :goto_a
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_e
    return-void
.end method

.method public final setTabIsDarkColor(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/kotlin/discount/GameDetailActivity;->detailTabDarkColor:Z

    .line 2
    invoke-direct {p0}, Lcom/join/kotlin/discount/GameDetailActivity;->refreshTab()V

    return-void
.end method
