.class public final Lcom/join/mgps/recycler/ViewPager2SlowScrollHelper;
.super Ljava/lang/Object;
.source "ViewPager2SlowScrollHelper.kt"


# instance fields
.field private duration:J

.field private final getRelativeScrollPositionMethod:Ljava/lang/reflect/Method;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final mAccessibilityProvider:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final mScrollEventAdapter:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final notifyProgrammaticScrollMethod:Ljava/lang/reflect/Method;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final onSetNewCurrentItemMethod:Ljava/lang/reflect/Method;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final recyclerView:Landroidx/recyclerview/widget/RecyclerView;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final vp:Landroidx/viewpager2/widget/ViewPager2;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/viewpager2/widget/ViewPager2;J)V
    .locals 3
    .param p1    # Landroidx/viewpager2/widget/ViewPager2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "vp"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/recycler/ViewPager2SlowScrollHelper;->vp:Landroidx/viewpager2/widget/ViewPager2;

    iput-wide p2, p0, Lcom/join/mgps/recycler/ViewPager2SlowScrollHelper;->duration:J

    .line 2
    const-class p2, Landroidx/viewpager2/widget/ViewPager2;

    const-string p3, "mRecyclerView"

    .line 3
    invoke-virtual {p2, p3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p2

    const/4 p3, 0x1

    .line 4
    invoke-virtual {p2, p3}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 5
    invoke-virtual {p2, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    const-string v0, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Landroidx/recyclerview/widget/RecyclerView;

    iput-object p2, p0, Lcom/join/mgps/recycler/ViewPager2SlowScrollHelper;->recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    const-class p2, Landroidx/viewpager2/widget/ViewPager2;

    const-string v0, "mAccessibilityProvider"

    .line 7
    invoke-virtual {p2, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p2

    .line 8
    invoke-virtual {p2, p3}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 9
    invoke-virtual {p2, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    const-string v0, "mAccessibilityProviderField.get(vp)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/join/mgps/recycler/ViewPager2SlowScrollHelper;->mAccessibilityProvider:Ljava/lang/Object;

    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Class;

    const-string v2, "onSetNewCurrentItem"

    invoke-virtual {p2, v2, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p2

    const-string v1, "mAccessibilityProvider.j\u2026od(\"onSetNewCurrentItem\")"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    iput-object p2, p0, Lcom/join/mgps/recycler/ViewPager2SlowScrollHelper;->onSetNewCurrentItemMethod:Ljava/lang/reflect/Method;

    .line 12
    invoke-virtual {p2, p3}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    const-class p2, Landroidx/viewpager2/widget/ViewPager2;

    const-string v1, "mScrollEventAdapter"

    .line 13
    invoke-virtual {p2, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p2

    .line 14
    invoke-virtual {p2, p3}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 15
    invoke-virtual {p2, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "mScrollEventAdapterField.get(vp)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/join/mgps/recycler/ViewPager2SlowScrollHelper;->mScrollEventAdapter:Ljava/lang/Object;

    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    new-array v1, v0, [Ljava/lang/Class;

    const-string v2, "getRelativeScrollPosition"

    invoke-virtual {p2, v2, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p2

    const-string v1, "mScrollEventAdapter.java\u2026tRelativeScrollPosition\")"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    iput-object p2, p0, Lcom/join/mgps/recycler/ViewPager2SlowScrollHelper;->getRelativeScrollPositionMethod:Ljava/lang/reflect/Method;

    .line 18
    invoke-virtual {p2, p3}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    const/4 p2, 0x2

    new-array p2, p2, [Ljava/lang/Class;

    .line 20
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v1, p2, v0

    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v0, p2, p3

    const-string v0, "notifyProgrammaticScroll"

    .line 21
    invoke-virtual {p1, v0, p2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    const-string p2, "mScrollEventAdapter.java\u2026ean::class.java\n        )"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/join/mgps/recycler/ViewPager2SlowScrollHelper;->notifyProgrammaticScrollMethod:Ljava/lang/reflect/Method;

    .line 22
    invoke-virtual {p1, p3}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    return-void
.end method

.method private final getSlowLinearSmoothScroller(Landroid/content/Context;)Landroidx/recyclerview/widget/RecyclerView$SmoothScroller;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/recycler/ViewPager2SlowScrollHelper$getSlowLinearSmoothScroller$1;

    invoke-direct {v0, p1}, Lcom/join/mgps/recycler/ViewPager2SlowScrollHelper$getSlowLinearSmoothScroller$1;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method private final replaceDecelerateInterpolator(Landroidx/recyclerview/widget/RecyclerView$SmoothScroller;)V
    .locals 2

    const-class v0, Landroidx/recyclerview/widget/LinearSmoothScroller;

    const-string v1, "mDecelerateInterpolator"

    .line 1
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x1

    .line 2
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 3
    new-instance v1, Lcom/join/mgps/recycler/ViewPager2SlowScrollHelper$a;

    invoke-direct {v1}, Lcom/join/mgps/recycler/ViewPager2SlowScrollHelper$a;-><init>()V

    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method private final smoothScrollToPosition(ILandroid/content/Context;Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Lcom/join/mgps/recycler/ViewPager2SlowScrollHelper;->getSlowLinearSmoothScroller(Landroid/content/Context;)Landroidx/recyclerview/widget/RecyclerView$SmoothScroller;

    move-result-object p2

    .line 2
    invoke-direct {p0, p2}, Lcom/join/mgps/recycler/ViewPager2SlowScrollHelper;->replaceDecelerateInterpolator(Landroidx/recyclerview/widget/RecyclerView$SmoothScroller;)V

    .line 3
    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView$SmoothScroller;->setTargetPosition(I)V

    if-eqz p3, :cond_0

    .line 4
    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->startSmoothScroll(Landroidx/recyclerview/widget/RecyclerView$SmoothScroller;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final getDuration()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/join/mgps/recycler/ViewPager2SlowScrollHelper;->duration:J

    return-wide v0
.end method

.method public final setCurrentItem(I)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/join/mgps/recycler/ViewPager2SlowScrollHelper;->vp:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.Adapter<*>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->getItemCount()I

    move-result v1

    if-gtz v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 3
    invoke-static {p1, v1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result p1

    .line 4
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->getItemCount()I

    move-result v0

    const/4 v2, 0x1

    sub-int/2addr v0, v2

    invoke-static {p1, v0}, Lkotlin/ranges/RangesKt;->coerceAtMost(II)I

    move-result p1

    .line 5
    iget-object v0, p0, Lcom/join/mgps/recycler/ViewPager2SlowScrollHelper;->vp:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    move-result v0

    if-ne p1, v0, :cond_1

    iget-object v0, p0, Lcom/join/mgps/recycler/ViewPager2SlowScrollHelper;->vp:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getScrollState()I

    move-result v0

    if-nez v0, :cond_1

    return-void

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/recycler/ViewPager2SlowScrollHelper;->vp:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    move-result v0

    if-ne p1, v0, :cond_2

    return-void

    .line 7
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/recycler/ViewPager2SlowScrollHelper;->vp:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0, p1}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(I)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/recycler/ViewPager2SlowScrollHelper;->onSetNewCurrentItemMethod:Ljava/lang/reflect/Method;

    iget-object v3, p0, Lcom/join/mgps/recycler/ViewPager2SlowScrollHelper;->mAccessibilityProvider:Ljava/lang/Object;

    new-array v4, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v3, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    iget-object v0, p0, Lcom/join/mgps/recycler/ViewPager2SlowScrollHelper;->notifyProgrammaticScrollMethod:Ljava/lang/reflect/Method;

    iget-object v3, p0, Lcom/join/mgps/recycler/ViewPager2SlowScrollHelper;->mScrollEventAdapter:Ljava/lang/Object;

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v1

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    aput-object v1, v4, v2

    invoke-virtual {v0, v3, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    iget-object v0, p0, Lcom/join/mgps/recycler/ViewPager2SlowScrollHelper;->vp:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "vp.context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/join/mgps/recycler/ViewPager2SlowScrollHelper;->recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v1

    invoke-direct {p0, p1, v0, v1}, Lcom/join/mgps/recycler/ViewPager2SlowScrollHelper;->smoothScrollToPosition(ILandroid/content/Context;Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    return-void
.end method

.method public final setDuration(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/join/mgps/recycler/ViewPager2SlowScrollHelper;->duration:J

    return-void
.end method
