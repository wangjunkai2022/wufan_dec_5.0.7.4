.class public final Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;
.super Lcom/join/kotlin/base/activity/BaseVmDbActivity;
.source "QuarkSourceHopeListActivity.kt"

# interfaces
.implements Lcom/join/kotlin/quark/proxy/SourceHopeClickProxy;
.implements Lcom/join/kotlin/quark/callback/IChangeSortCallback;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/kotlin/base/activity/BaseVmDbActivity<",
        "Lcom/join/kotlin/quark/viewmodel/SourceHopeViewModel;",
        "Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSourceHopeListBinding;",
        ">;",
        "Lcom/join/kotlin/quark/proxy/SourceHopeClickProxy;",
        "Lcom/join/kotlin/quark/callback/IChangeSortCallback;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nQuarkSourceHopeListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuarkSourceHopeListActivity.kt\ncom/join/kotlin/quark/QuarkSourceHopeListActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,245:1\n1855#2,2:246\n*S KotlinDebug\n*F\n+ 1 QuarkSourceHopeListActivity.kt\ncom/join/kotlin/quark/QuarkSourceHopeListActivity\n*L\n173#1:246,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nQuarkSourceHopeListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuarkSourceHopeListActivity.kt\ncom/join/kotlin/quark/QuarkSourceHopeListActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,245:1\n1855#2,2:246\n*S KotlinDebug\n*F\n+ 1 QuarkSourceHopeListActivity.kt\ncom/join/kotlin/quark/QuarkSourceHopeListActivity\n*L\n173#1:246,2\n*E\n"
    }
.end annotation


# instance fields
.field private adapter:Lcom/join/mgps/adapter/FragmentPagerAdapter;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private extBean:Lcom/join/mgps/dto/ExtBean;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private fragments:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/join/mgps/adapter/FragmentPagerAdapter$a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private sortPopWindow:Lcom/join/kotlin/quark/pop/SortPopWindow;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private statusState1:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->fragments:Ljava/util/ArrayList;

    return-void
.end method

.method public static final synthetic access$setStatus(Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->setStatus(Lcom/google/android/material/tabs/TabLayout$Tab;)V

    return-void
.end method

.method public static synthetic f0(Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->showSortPop$lambda$7(Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic g0(Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->showSortPop$lambda$6(Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;Landroid/view/View;)V

    return-void
.end method

.method private final getView(Ljava/util/ArrayList;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSourceHopeListBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSourceHopeListBinding;->c:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayout;->getTabCount()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSourceHopeListBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSourceHopeListBinding;->c:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayout;->getTabCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    const-string v3, "null cannot be cast to non-null type android.widget.TextView"

    const v4, 0x7f091635

    const/4 v5, 0x0

    if-ge v2, v0, :cond_2

    .line 3
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v6

    const v7, 0x7f0c0539

    invoke-virtual {v6, v7, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    const-string v6, "from(this).inflate(R.lay\u2026rce_share_tab_item, null)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-virtual {v5, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Landroid/widget/TextView;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 5
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v3

    check-cast v3, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSourceHopeListBinding;

    iget-object v3, v3, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSourceHopeListBinding;->c:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v3, v2}, Lcom/google/android/material/tabs/TabLayout;->getTabAt(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3, v5}, Lcom/google/android/material/tabs/TabLayout$Tab;->setCustomView(Landroid/view/View;)Lcom/google/android/material/tabs/TabLayout$Tab;

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 6
    :cond_2
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSourceHopeListBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSourceHopeListBinding;->c:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {p1, v1}, Lcom/google/android/material/tabs/TabLayout;->getTabAt(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    goto :goto_2

    :cond_3
    move-object p1, v5

    :goto_2
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/TextView;

    const/high16 v0, -0x1000000

    .line 7
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 8
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f071279

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    int-to-float v0, v0

    .line 9
    invoke-virtual {p1, v1, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 10
    invoke-virtual {p1}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 11
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSourceHopeListBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSourceHopeListBinding;->c:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {p1, v1}, Lcom/google/android/material/tabs/TabLayout;->getTabAt(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_4

    const v0, 0x7f09093d

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    :cond_4
    if-nez v5, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {v5, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_3
    return-void
.end method

.method public static synthetic h0(Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->showSortPop$lambda$5(Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;Landroid/view/View;)V

    return-void
.end method

.method private final setStatus(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSourceHopeListBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSourceHopeListBinding;->c:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayout;->getTabCount()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSourceHopeListBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSourceHopeListBinding;->c:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayout;->getTabCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_4

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v3

    check-cast v3, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSourceHopeListBinding;

    iget-object v3, v3, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSourceHopeListBinding;->c:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v3, v2}, Lcom/google/android/material/tabs/TabLayout;->getTabAt(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v3

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-nez v3, :cond_2

    goto :goto_2

    .line 4
    :cond_2
    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout$Tab;->getPosition()I

    move-result v4

    const-string v5, "null cannot be cast to non-null type android.widget.TextView"

    const v6, 0x7f091635

    const v7, 0x7f09093d

    if-ne v2, v4, :cond_3

    .line 5
    invoke-virtual {v3, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4, v1}, Landroid/view/View;->setVisibility(I)V

    .line 6
    invoke-virtual {v3, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Landroid/widget/TextView;

    const/high16 v4, -0x1000000

    .line 7
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 8
    invoke-virtual {v3}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v4

    const/4 v5, 0x1

    invoke-virtual {v3, v4, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 9
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f071279

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    int-to-float v4, v4

    .line 10
    invoke-virtual {v3, v1, v4}, Landroid/widget/TextView;->setTextSize(IF)V

    goto :goto_2

    .line 11
    :cond_3
    invoke-virtual {v3, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    const/4 v7, 0x4

    invoke-virtual {v4, v7}, Landroid/view/View;->setVisibility(I)V

    .line 12
    invoke-virtual {v3, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Landroid/widget/TextView;

    const-string v4, "#000000"

    .line 13
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 14
    invoke-virtual {v3}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v4

    invoke-virtual {v3, v4, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 15
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f07124c

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    int-to-float v4, v4

    .line 16
    invoke-virtual {v3, v1, v4}, Landroid/widget/TextView;->setTextSize(IF)V

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_4
    return-void
.end method

.method private final showSortPop(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->sortPopWindow:Lcom/join/kotlin/quark/pop/SortPopWindow;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->sortPopWindow:Lcom/join/kotlin/quark/pop/SortPopWindow;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->sortPopWindow:Lcom/join/kotlin/quark/pop/SortPopWindow;

    if-nez v0, :cond_1

    .line 3
    new-instance v0, Lcom/join/kotlin/quark/pop/SortPopWindow;

    const/4 v1, -0x2

    invoke-direct {v0, p0, v1, v1}, Lcom/join/kotlin/quark/pop/SortPopWindow;-><init>(Landroid/content/Context;II)V

    iput-object v0, p0, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->sortPopWindow:Lcom/join/kotlin/quark/pop/SortPopWindow;

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->sortPopWindow:Lcom/join/kotlin/quark/pop/SortPopWindow;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 5
    iget-object v0, p0, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->sortPopWindow:Lcom/join/kotlin/quark/pop/SortPopWindow;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v0

    .line 6
    invoke-virtual {v0, v1, v1}, Landroid/view/View;->measure(II)V

    .line 7
    iget-object v0, p0, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->sortPopWindow:Lcom/join/kotlin/quark/pop/SortPopWindow;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    .line 8
    iget-object v2, p0, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->sortPopWindow:Lcom/join/kotlin/quark/pop/SortPopWindow;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, v0}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 9
    :cond_2
    iget-object v0, p0, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->sortPopWindow:Lcom/join/kotlin/quark/pop/SortPopWindow;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0713af

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    neg-int v2, v2

    invoke-virtual {v0, p1, v1, v2}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    .line 10
    iget-object p1, p0, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->sortPopWindow:Lcom/join/kotlin/quark/pop/SortPopWindow;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/join/kotlin/quark/pop/SortPopWindow;->getBtnSxz()Landroid/widget/Button;

    move-result-object p1

    new-instance v0, Lcom/join/kotlin/quark/l;

    invoke-direct {v0, p0}, Lcom/join/kotlin/quark/l;-><init>(Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 11
    iget-object p1, p0, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->sortPopWindow:Lcom/join/kotlin/quark/pop/SortPopWindow;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/join/kotlin/quark/pop/SortPopWindow;->getBtnYsx()Landroid/widget/Button;

    move-result-object p1

    new-instance v0, Lcom/join/kotlin/quark/k;

    invoke-direct {v0, p0}, Lcom/join/kotlin/quark/k;-><init>(Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 12
    iget-object p1, p0, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->sortPopWindow:Lcom/join/kotlin/quark/pop/SortPopWindow;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/join/kotlin/quark/pop/SortPopWindow;->getBtnAll()Landroid/widget/Button;

    move-result-object p1

    new-instance v0, Lcom/join/kotlin/quark/j;

    invoke-direct {v0, p0}, Lcom/join/kotlin/quark/j;-><init>(Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private static final showSortPop$lambda$5(Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;Landroid/view/View;)V
    .locals 1

    const-string/jumbo p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->changeSort(Ljava/lang/Integer;)V

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSourceHopeListBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSourceHopeListBinding;->e:Landroid/widget/TextView;

    const-string/jumbo v0, "\u5b9e\u73b0\u4e2d"

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    iget-object p0, p0, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->sortPopWindow:Lcom/join/kotlin/quark/pop/SortPopWindow;

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    return-void
.end method

.method private static final showSortPop$lambda$6(Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;Landroid/view/View;)V
    .locals 1

    const-string/jumbo p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->changeSort(Ljava/lang/Integer;)V

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSourceHopeListBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSourceHopeListBinding;->e:Landroid/widget/TextView;

    const-string/jumbo v0, "\u5df2\u5b9e\u73b0"

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    iget-object p0, p0, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->sortPopWindow:Lcom/join/kotlin/quark/pop/SortPopWindow;

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    return-void
.end method

.method private static final showSortPop$lambda$7(Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;Landroid/view/View;)V
    .locals 1

    const-string/jumbo p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 1
    invoke-virtual {p0, p1}, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->changeSort(Ljava/lang/Integer;)V

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSourceHopeListBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSourceHopeListBinding;->e:Landroid/widget/TextView;

    const-string/jumbo v0, "\u5168\u90e8"

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    iget-object p0, p0, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->sortPopWindow:Lcom/join/kotlin/quark/pop/SortPopWindow;

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    return-void
.end method


# virtual methods
.method public final changeSort(Ljava/lang/Integer;)V
    .locals 2
    .param p1    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->statusState1:Ljava/lang/Integer;

    .line 2
    iget-object p1, p0, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->fragments:Ljava/util/ArrayList;

    .line 3
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/adapter/FragmentPagerAdapter$a;

    .line 4
    iget-object v0, v0, Lcom/join/mgps/adapter/FragmentPagerAdapter$a;->c:Landroidx/fragment/app/Fragment;

    instance-of v1, v0, Lcom/join/kotlin/quark/callback/IChangeSortCallback;

    if-eqz v1, :cond_0

    const-string v1, "null cannot be cast to non-null type com.join.kotlin.quark.callback.IChangeSortCallback"

    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/join/kotlin/quark/callback/IChangeSortCallback;

    .line 6
    invoke-interface {v0}, Lcom/join/kotlin/quark/callback/IChangeSortCallback;->onStatusChanged()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public createObserver()V
    .locals 7

    .line 1
    new-instance v0, Lcom/join/kotlin/quark/SourceHopeFragment;

    invoke-direct {v0}, Lcom/join/kotlin/quark/SourceHopeFragment;-><init>()V

    .line 2
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v2

    check-cast v2, Lcom/join/kotlin/quark/viewmodel/SourceHopeViewModel;

    invoke-virtual {v2}, Lcom/join/kotlin/quark/viewmodel/SourceHopeViewModel;->getKeyword()Ljava/lang/String;

    move-result-object v2

    const-string v3, "_keyword"

    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "_sortType"

    const/4 v4, 0x2

    .line 4
    invoke-virtual {v1, v2, v4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 5
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 6
    new-instance v1, Lcom/join/mgps/adapter/FragmentPagerAdapter$a;

    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v5

    check-cast v5, Lcom/join/kotlin/quark/viewmodel/SourceHopeViewModel;

    invoke-virtual {v5}, Lcom/join/kotlin/quark/viewmodel/SourceHopeViewModel;->getTabItems()Ljava/util/ArrayList;

    move-result-object v5

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-direct {v1, v5, v0}, Lcom/join/mgps/adapter/FragmentPagerAdapter$a;-><init>(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    .line 7
    iget-object v0, p0, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->fragments:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 8
    new-instance v0, Lcom/join/kotlin/quark/SourceHopeFragment;

    invoke-direct {v0}, Lcom/join/kotlin/quark/SourceHopeFragment;-><init>()V

    .line 9
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 10
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v5

    check-cast v5, Lcom/join/kotlin/quark/viewmodel/SourceHopeViewModel;

    invoke-virtual {v5}, Lcom/join/kotlin/quark/viewmodel/SourceHopeViewModel;->getKeyword()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v3, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v5, 0x1

    .line 11
    invoke-virtual {v1, v2, v5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 12
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 13
    new-instance v1, Lcom/join/mgps/adapter/FragmentPagerAdapter$a;

    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v6

    check-cast v6, Lcom/join/kotlin/quark/viewmodel/SourceHopeViewModel;

    invoke-virtual {v6}, Lcom/join/kotlin/quark/viewmodel/SourceHopeViewModel;->getTabItems()Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-direct {v1, v5, v0}, Lcom/join/mgps/adapter/FragmentPagerAdapter$a;-><init>(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    .line 14
    iget-object v0, p0, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->fragments:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 15
    new-instance v0, Lcom/join/kotlin/quark/SourceHopeFragment;

    invoke-direct {v0}, Lcom/join/kotlin/quark/SourceHopeFragment;-><init>()V

    .line 16
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 17
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v5

    check-cast v5, Lcom/join/kotlin/quark/viewmodel/SourceHopeViewModel;

    invoke-virtual {v5}, Lcom/join/kotlin/quark/viewmodel/SourceHopeViewModel;->getKeyword()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v3, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x3

    .line 18
    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 19
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 20
    new-instance v1, Lcom/join/mgps/adapter/FragmentPagerAdapter$a;

    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v2

    check-cast v2, Lcom/join/kotlin/quark/viewmodel/SourceHopeViewModel;

    invoke-virtual {v2}, Lcom/join/kotlin/quark/viewmodel/SourceHopeViewModel;->getTabItems()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-direct {v1, v2, v0}, Lcom/join/mgps/adapter/FragmentPagerAdapter$a;-><init>(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    .line 21
    iget-object v0, p0, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->fragments:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    iget-object v0, p0, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->adapter:Lcom/join/mgps/adapter/FragmentPagerAdapter;

    if-eqz v0, :cond_0

    .line 23
    iget-object v1, p0, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->fragments:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lcom/join/mgps/adapter/FragmentPagerAdapter;->e(Ljava/util/List;)V

    .line 24
    invoke-virtual {v0}, Landroidx/viewpager/widget/PagerAdapter;->notifyDataSetChanged()V

    .line 25
    :cond_0
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/quark/viewmodel/SourceHopeViewModel;

    invoke-virtual {v0}, Lcom/join/kotlin/quark/viewmodel/SourceHopeViewModel;->getTabItems()Ljava/util/ArrayList;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->getView(Ljava/util/ArrayList;)V

    .line 26
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSourceHopeListBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSourceHopeListBinding;->c:Lcom/google/android/material/tabs/TabLayout;

    new-instance v1, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity$createObserver$2;

    invoke-direct {v1, p0}, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity$createObserver$2;-><init>(Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;)V

    invoke-virtual {v0, v1}, Lcom/google/android/material/tabs/TabLayout;->addOnTabSelectedListener(Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;)V

    return-void
.end method

.method public final getAdapter()Lcom/join/mgps/adapter/FragmentPagerAdapter;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->adapter:Lcom/join/mgps/adapter/FragmentPagerAdapter;

    return-object v0
.end method

.method public final getExtBean()Lcom/join/mgps/dto/ExtBean;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->extBean:Lcom/join/mgps/dto/ExtBean;

    return-object v0
.end method

.method public final getFragments()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/join/mgps/adapter/FragmentPagerAdapter$a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->fragments:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final getSortPopWindow()Lcom/join/kotlin/quark/pop/SortPopWindow;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->sortPopWindow:Lcom/join/kotlin/quark/pop/SortPopWindow;

    return-object v0
.end method

.method public getStatusState()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->statusState1:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getStatusState1()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->statusState1:Ljava/lang/Integer;

    return-object v0
.end method

.method public initView(Landroid/os/Bundle;)V
    .locals 4
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 2
    iget-object v0, p0, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->extBean:Lcom/join/mgps/dto/ExtBean;

    if-eqz v0, :cond_0

    .line 3
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    .line 4
    sget-object v1, Lcom/papa/sim/statistic/Event;->visitPCPageZone:Lcom/papa/sim/statistic/Event;

    new-instance v2, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v2}, Lcom/papa/sim/statistic/Ext;-><init>()V

    iget-object v3, p0, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->extBean:Lcom/join/mgps/dto/ExtBean;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lcom/join/mgps/dto/ExtBean;->getFrom()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/papa/sim/statistic/Ext;->setFrom(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 5
    :cond_0
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/quark/viewmodel/SourceHopeViewModel;

    const-string v1, "_keyword"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/join/kotlin/quark/viewmodel/SourceHopeViewModel;->setKeyword(Ljava/lang/String;)V

    .line 6
    :cond_1
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSourceHopeListBinding;

    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/quark/viewmodel/SourceHopeViewModel;

    invoke-virtual {p1, v0}, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSourceHopeListBinding;->h(Lcom/join/kotlin/quark/viewmodel/SourceHopeViewModel;)V

    .line 7
    new-instance p1, Lcom/join/mgps/adapter/FragmentPagerAdapter;

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/join/mgps/adapter/FragmentPagerAdapter;-><init>(Landroidx/fragment/app/FragmentManager;)V

    iput-object p1, p0, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->adapter:Lcom/join/mgps/adapter/FragmentPagerAdapter;

    .line 8
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSourceHopeListBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSourceHopeListBinding;->f:Landroidx/viewpager/widget/ViewPager;

    iget-object v0, p0, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->adapter:Lcom/join/mgps/adapter/FragmentPagerAdapter;

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 9
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSourceHopeListBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSourceHopeListBinding;->c:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSourceHopeListBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSourceHopeListBinding;->f:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1, v0}, Lcom/google/android/material/tabs/TabLayout;->setupWithViewPager(Landroidx/viewpager/widget/ViewPager;)V

    .line 10
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSourceHopeListBinding;

    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/quark/viewmodel/SourceHopeViewModel;

    invoke-virtual {p1, v0}, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSourceHopeListBinding;->h(Lcom/join/kotlin/quark/viewmodel/SourceHopeViewModel;)V

    .line 11
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSourceHopeListBinding;

    invoke-virtual {p1, p0}, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSourceHopeListBinding;->g(Lcom/join/kotlin/quark/proxy/SourceHopeClickProxy;)V

    return-void
.end method

.method public onBackClick()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method protected onResume()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/BaseAppCompatActivity;->onResume()V

    .line 2
    invoke-static {p0}, Lcom/join/mgps/Util/UtilsMy;->q4(Landroid/content/Context;)V

    return-void
.end method

.method public onSortTypeClick()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSourceHopeListBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityQuarkSourceHopeListBinding;->e:Landroid/widget/TextView;

    const-string v1, "mDatabind.tvSort"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->showSortPop(Landroid/view/View;)V

    return-void
.end method

.method public onStatusChanged()V
    .locals 0

    return-void
.end method

.method public onWishCreateClick()V
    .locals 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/join/kotlin/quark/CreateSourceHopeActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v1

    check-cast v1, Lcom/join/kotlin/quark/viewmodel/SourceHopeViewModel;

    invoke-virtual {v1}, Lcom/join/kotlin/quark/viewmodel/SourceHopeViewModel;->getKeyword()Ljava/lang/String;

    move-result-object v1

    const-string v2, "_keyword"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 3
    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public final setAdapter(Lcom/join/mgps/adapter/FragmentPagerAdapter;)V
    .locals 0
    .param p1    # Lcom/join/mgps/adapter/FragmentPagerAdapter;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->adapter:Lcom/join/mgps/adapter/FragmentPagerAdapter;

    return-void
.end method

.method public final setExtBean(Lcom/join/mgps/dto/ExtBean;)V
    .locals 0
    .param p1    # Lcom/join/mgps/dto/ExtBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->extBean:Lcom/join/mgps/dto/ExtBean;

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
            "Lcom/join/mgps/adapter/FragmentPagerAdapter$a;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->fragments:Ljava/util/ArrayList;

    return-void
.end method

.method public final setSortPopWindow(Lcom/join/kotlin/quark/pop/SortPopWindow;)V
    .locals 0
    .param p1    # Lcom/join/kotlin/quark/pop/SortPopWindow;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->sortPopWindow:Lcom/join/kotlin/quark/pop/SortPopWindow;

    return-void
.end method

.method public final setStatusState1(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->statusState1:Ljava/lang/Integer;

    return-void
.end method
