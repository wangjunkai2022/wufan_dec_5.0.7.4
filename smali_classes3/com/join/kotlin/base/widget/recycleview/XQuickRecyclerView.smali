.class public final Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;
.super Landroidx/recyclerview/widget/RecyclerView;
.source "XQuickRecyclerView.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$Companion;,
        Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$DataObserver;,
        Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$LoadingListener;,
        Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$WrapAdapter;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final DRAG_RATE:F = 3.0f

.field private static final HEADER_INIT_INDEX:I = 0x2712

.field protected static final OFFSET_RADIO:F = 2.0f

.field protected static final PULL_LOAD_MORE_DELTA:I = 0x32

.field protected static final SCROLLBACK_FOOTER:I = 0x1

.field protected static final SCROLLBACK_HEADER:I = 0x0

.field protected static final SCROLL_DURATION:I = 0x190

.field private static final TYPE_FOOTER:I = 0x2711

.field private static final TYPE_REFRESH_HEADER:I = 0x2710

.field private static final sHeaderTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private appbarState:Lcom/join/android/app/component/xrecyclerview/AppBarStateChangeListener$State;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private isLoadingData:Z

.field private isNoMore:Z

.field private loadingMoreEnabled:Z

.field private final mDataObserver:Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private mEmptyView:Landroid/view/View;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private mFooterView:Lcom/join/mgps/customview/XListViewFooter;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final mHeaderViews:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private mLastY:F

.field private mLoadingListener:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$LoadingListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final mPageCount:I

.field private mPtrFrameLayout:Lcom/join/mgps/ptr/PtrFrameLayout;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private mPullLoading:Z

.field private mScrollBack:I

.field private mScroller:Landroid/widget/Scroller;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private mWrapAdapter:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$WrapAdapter;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private preloadCount:I

.field private final ptrDefaultHandler:Lcom/join/mgps/ptr/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private pullRefreshEnabled:Z

.field private scale:D

.field private scrollListener:Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->Companion:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$Companion;

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->sHeaderTypes:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 12
    invoke-direct {p0, p1, v0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 13
    invoke-direct {p0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->init()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 14
    invoke-direct {p0, p1, p2, v0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 15
    invoke-direct {p0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->init()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 2
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mHeaderViews:Ljava/util/ArrayList;

    const/high16 p1, -0x40800000    # -1.0f

    .line 3
    iput p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mLastY:F

    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->pullRefreshEnabled:Z

    .line 5
    iput-boolean p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->loadingMoreEnabled:Z

    .line 6
    new-instance p1, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$DataObserver;

    invoke-direct {p1, p0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$DataObserver;-><init>(Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;)V

    iput-object p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mDataObserver:Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;

    .line 7
    sget-object p1, Lcom/join/android/app/component/xrecyclerview/AppBarStateChangeListener$State;->EXPANDED:Lcom/join/android/app/component/xrecyclerview/AppBarStateChangeListener$State;

    iput-object p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->appbarState:Lcom/join/android/app/component/xrecyclerview/AppBarStateChangeListener$State;

    const-wide/high16 p1, 0x3ff0000000000000L    # 1.0

    .line 8
    iput-wide p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->scale:D

    const/4 p1, 0x5

    .line 9
    iput p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->preloadCount:I

    .line 10
    new-instance p1, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$ptrDefaultHandler$1;

    invoke-direct {p1, p0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$ptrDefaultHandler$1;-><init>(Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;)V

    iput-object p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->ptrDefaultHandler:Lcom/join/mgps/ptr/a;

    .line 11
    invoke-direct {p0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->init()V

    return-void
.end method

.method public static synthetic a(Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->enableLoadingMoreView$lambda$0(Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic access$getAppbarState$p(Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;)Lcom/join/android/app/component/xrecyclerview/AppBarStateChangeListener$State;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->appbarState:Lcom/join/android/app/component/xrecyclerview/AppBarStateChangeListener$State;

    return-object p0
.end method

.method public static final synthetic access$getHeaderViewByType(Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;I)Landroid/view/View;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->getHeaderViewByType(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getLoadingMoreEnabled$p(Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->loadingMoreEnabled:Z

    return p0
.end method

.method public static final synthetic access$getMEmptyView$p(Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mEmptyView:Landroid/view/View;

    return-object p0
.end method

.method public static final synthetic access$getMHeaderViews$p(Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mHeaderViews:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static final synthetic access$getMLoadingListener$p(Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;)Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$LoadingListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mLoadingListener:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$LoadingListener;

    return-object p0
.end method

.method public static final synthetic access$getMWrapAdapter$p(Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;)Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$WrapAdapter;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mWrapAdapter:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$WrapAdapter;

    return-object p0
.end method

.method public static final synthetic access$getPullRefreshEnabled$p(Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->pullRefreshEnabled:Z

    return p0
.end method

.method public static final synthetic access$getSHeaderTypes$cp()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->sHeaderTypes:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic access$isHeaderType(Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;I)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->isHeaderType(I)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$isNoMore$p(Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->isNoMore:Z

    return p0
.end method

.method public static final synthetic access$isReservedItemViewType(Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;I)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->isReservedItemViewType(I)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$setAppbarState$p(Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;Lcom/join/android/app/component/xrecyclerview/AppBarStateChangeListener$State;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->appbarState:Lcom/join/android/app/component/xrecyclerview/AppBarStateChangeListener$State;

    return-void
.end method

.method private final disableLoadingMoreView()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mFooterView:Lcom/join/mgps/customview/XListViewFooter;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/join/mgps/customview/XListViewFooter;->a()V

    .line 2
    iget-object v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mFooterView:Lcom/join/mgps/customview/XListViewFooter;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private final enableLoadingMoreView()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mPullLoading:Z

    .line 2
    iget-object v1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mFooterView:Lcom/join/mgps/customview/XListViewFooter;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/join/mgps/customview/XListViewFooter;->f()V

    .line 3
    iget-object v1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mFooterView:Lcom/join/mgps/customview/XListViewFooter;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1, v0}, Lcom/join/mgps/customview/XListViewFooter;->setState(I)V

    .line 4
    iget-object v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mFooterView:Lcom/join/mgps/customview/XListViewFooter;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    new-instance v1, Lcom/join/kotlin/base/widget/recycleview/a;

    invoke-direct {v1, p0}, Lcom/join/kotlin/base/widget/recycleview/a;-><init>(Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private static final enableLoadingMoreView$lambda$0(Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;Landroid/view/View;)V
    .locals 1

    const-string/jumbo p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-boolean p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->isNoMore:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mPullLoading:Z

    .line 3
    iget-object p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mFooterView:Lcom/join/mgps/customview/XListViewFooter;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lcom/join/mgps/customview/XListViewFooter;->setState(I)V

    .line 4
    iget-object p0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mLoadingListener:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$LoadingListener;

    if-eqz p0, :cond_1

    .line 5
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {p0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$LoadingListener;->onLoadMore()V

    :cond_1
    return-void
.end method

.method private final findMax([I)I
    .locals 4

    const/4 v0, 0x0

    .line 1
    aget v1, p1, v0

    .line 2
    array-length v2, p1

    :goto_0
    if-ge v0, v2, :cond_1

    aget v3, p1, v0

    if-le v3, v1, :cond_0

    move v1, v3

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method private final findMin([I)I
    .locals 4

    const/4 v0, 0x0

    .line 1
    aget v1, p1, v0

    .line 2
    array-length v2, p1

    :goto_0
    if-ge v0, v2, :cond_1

    aget v3, p1, v0

    if-ge v3, v1, :cond_0

    move v1, v3

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method private final getHeaderViewByType(I)Landroid/view/View;
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->isHeaderType(I)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mHeaderViews:Ljava/util/ArrayList;

    add-int/lit16 p1, p1, -0x2712

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    :goto_0
    return-object p1
.end method

.method private final init()V
    .locals 4

    .line 1
    new-instance v0, Landroid/widget/Scroller;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-direct {v0, v1, v2}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    iput-object v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mScroller:Landroid/widget/Scroller;

    .line 2
    new-instance v0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$init$1;

    invoke-direct {v0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$init$1;-><init>()V

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V

    .line 3
    iget-boolean v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->pullRefreshEnabled:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->setPtrFrameLayout(Lcom/join/mgps/ptr/PtrFrameLayout;)V

    .line 5
    :cond_0
    new-instance v0, Lcom/join/mgps/customview/XListViewFooter;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/join/mgps/customview/XListViewFooter;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/XListViewFooter;->setState(I)V

    .line 7
    iput-object v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mFooterView:Lcom/join/mgps/customview/XListViewFooter;

    .line 8
    iget-boolean v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->loadingMoreEnabled:Z

    invoke-virtual {p0, v0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->setLoadingMoreEnabled(Z)V

    .line 9
    iget-object v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mFooterView:Lcom/join/mgps/customview/XListViewFooter;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 10
    new-instance v1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x2

    invoke-direct {v1, v2, v3}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;-><init>(II)V

    .line 11
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private final isHeaderType(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mHeaderViews:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->sHeaderTypes:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final isOnTop()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mPtrFrameLayout:Lcom/join/mgps/ptr/PtrFrameLayout;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->getFirstVisiblePosition()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    return v1
.end method

.method private final isReservedItemViewType(I)Z
    .locals 1

    const/16 v0, 0x2710

    if-eq p1, v0, :cond_1

    const/16 v0, 0x2711

    if-eq p1, v0, :cond_1

    .line 1
    sget-object v0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->sHeaderTypes:Ljava/util/List;

    .line 2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method private final preload()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-boolean v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->isLoadingData:Z

    if-nez v0, :cond_0

    .line 3
    iget-boolean v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->loadingMoreEnabled:Z

    if-eqz v0, :cond_0

    .line 4
    iget-boolean v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mPullLoading:Z

    if-nez v0, :cond_0

    .line 5
    iget-boolean v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->isNoMore:Z

    if-nez v0, :cond_0

    .line 6
    invoke-virtual {p0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->getLastVisiblePosition()I

    move-result v0

    invoke-virtual {p0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->getTotalItemCount()I

    move-result v1

    iget v2, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->preloadCount:I

    sub-int/2addr v1, v2

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->isLoadingData:Z

    .line 8
    iput-boolean v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mPullLoading:Z

    .line 9
    iget-object v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mFooterView:Lcom/join/mgps/customview/XListViewFooter;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/XListViewFooter;->setState(I)V

    .line 10
    iget-object v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mLoadingListener:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$LoadingListener;

    if-eqz v0, :cond_0

    .line 11
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$LoadingListener;->onLoadMore()V

    :cond_0
    return-void
.end method


# virtual methods
.method public final addHeaderView(Landroid/view/View;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string/jumbo v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->sHeaderTypes:Ljava/util/List;

    iget-object v1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mHeaderViews:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit16 v1, v1, 0x2712

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2
    iget-object v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mHeaderViews:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public computeScroll()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mScroller:Landroid/widget/Scroller;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/widget/Scroller;->computeScrollOffset()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    iget v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mScrollBack:I

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mFooterView:Lcom/join/mgps/customview/XListViewFooter;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mScroller:Landroid/widget/Scroller;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1}, Landroid/widget/Scroller;->getCurrY()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/XListViewFooter;->setBottomMargin(I)V

    .line 4
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->postInvalidate()V

    .line 5
    :cond_1
    invoke-super {p0}, Landroid/view/ViewGroup;->computeScroll()V

    return-void
.end method

.method public final enablePtrFrameLayout(Z)V
    .locals 0

    return-void
.end method

.method public fling(II)Z
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->scale:D

    double-to-int v0, v0

    mul-int p2, p2, v0

    .line 2
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->fling(II)Z

    move-result p1

    return p1
.end method

.method public final getEmptyView()Landroid/view/View;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mEmptyView:Landroid/view/View;

    return-object v0
.end method

.method public final getFirstCompletelyVisiblePosition()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v0

    .line 2
    instance-of v1, v0, Landroidx/recyclerview/widget/GridLayoutManager;

    if-eqz v1, :cond_0

    .line 3
    check-cast v0, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstCompletelyVisibleItemPosition()I

    move-result v0

    goto :goto_0

    .line 4
    :cond_0
    instance-of v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    if-eqz v1, :cond_1

    .line 5
    check-cast v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->getSpanCount()I

    move-result v1

    new-array v1, v1, [I

    .line 6
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->findFirstCompletelyVisibleItemPositions([I)[I

    .line 7
    invoke-direct {p0, v1}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->findMin([I)I

    move-result v0

    goto :goto_0

    .line 8
    :cond_1
    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstCompletelyVisibleItemPosition()I

    move-result v0

    :goto_0
    return v0
.end method

.method public final getFirstVisiblePosition()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v0

    .line 2
    instance-of v1, v0, Landroidx/recyclerview/widget/GridLayoutManager;

    if-eqz v1, :cond_0

    .line 3
    check-cast v0, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    move-result v0

    goto :goto_0

    .line 4
    :cond_0
    instance-of v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    if-eqz v1, :cond_1

    .line 5
    check-cast v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->getSpanCount()I

    move-result v1

    new-array v1, v1, [I

    .line 6
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->findFirstVisibleItemPositions([I)[I

    .line 7
    invoke-direct {p0, v1}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->findMin([I)I

    move-result v0

    goto :goto_0

    .line 8
    :cond_1
    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    move-result v0

    :goto_0
    return v0
.end method

.method public final getLastCompletelyVisiblePosition()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v0

    .line 2
    instance-of v1, v0, Landroidx/recyclerview/widget/GridLayoutManager;

    if-eqz v1, :cond_0

    .line 3
    check-cast v0, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastCompletelyVisibleItemPosition()I

    move-result v0

    goto :goto_0

    .line 4
    :cond_0
    instance-of v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    if-eqz v1, :cond_1

    .line 5
    check-cast v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->getSpanCount()I

    move-result v1

    new-array v1, v1, [I

    .line 6
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->findLastCompletelyVisibleItemPositions([I)[I

    .line 7
    invoke-direct {p0, v1}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->findMax([I)I

    move-result v0

    goto :goto_0

    .line 8
    :cond_1
    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastCompletelyVisibleItemPosition()I

    move-result v0

    :goto_0
    return v0
.end method

.method public final getLastVisiblePosition()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v0

    .line 2
    instance-of v1, v0, Landroidx/recyclerview/widget/GridLayoutManager;

    if-eqz v1, :cond_0

    .line 3
    check-cast v0, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastVisibleItemPosition()I

    move-result v0

    goto :goto_0

    .line 4
    :cond_0
    instance-of v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    if-eqz v1, :cond_1

    .line 5
    check-cast v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->getSpanCount()I

    move-result v1

    new-array v1, v1, [I

    .line 6
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->findLastVisibleItemPositions([I)[I

    .line 7
    invoke-direct {p0, v1}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->findMax([I)I

    move-result v0

    goto :goto_0

    .line 8
    :cond_1
    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastVisibleItemPosition()I

    move-result v0

    :goto_0
    return v0
.end method

.method protected final getMFooterView()Lcom/join/mgps/customview/XListViewFooter;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mFooterView:Lcom/join/mgps/customview/XListViewFooter;

    return-object v0
.end method

.method protected final getMPullLoading()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mPullLoading:Z

    return v0
.end method

.method protected final getMScrollBack()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mScrollBack:I

    return v0
.end method

.method protected final getMScroller()Landroid/widget/Scroller;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mScroller:Landroid/widget/Scroller;

    return-object v0
.end method

.method public final getNoMore()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->isNoMore:Z

    return v0
.end method

.method public final getScrollListener()Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->scrollListener:Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;

    return-object v0
.end method

.method public final getTotalItemCount()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->getItemCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iget-object v1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mHeaderViews:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public getWrappedAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
            "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mWrapAdapter:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$WrapAdapter;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$WrapAdapter;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    :cond_1
    return-object v0
.end method

.method public final hidePullLoad()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->loadingMoreEnabled:Z

    .line 2
    iget-object v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mFooterView:Lcom/join/mgps/customview/XListViewFooter;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/join/mgps/customview/XListViewFooter;->a()V

    return-void
.end method

.method public final isRefreshEnable()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollX()I

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->appbarState:Lcom/join/android/app/component/xrecyclerview/AppBarStateChangeListener$State;

    sget-object v2, Lcom/join/android/app/component/xrecyclerview/AppBarStateChangeListener$State;->EXPANDED:Lcom/join/android/app/component/xrecyclerview/AppBarStateChangeListener$State;

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    if-gtz v0, :cond_0

    const/4 v3, 0x1

    :cond_0
    return v3
.end method

.method public final loadMoreComplete()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->isLoadingData:Z

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->stopLoadMore()V

    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroidx/recyclerview/widget/RecyclerView;->onAttachedToWindow()V

    .line 2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    .line 3
    instance-of v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    if-eqz v1, :cond_0

    goto :goto_1

    .line 4
    :cond_0
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_0

    .line 5
    :cond_1
    :goto_1
    instance-of v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    if-eqz v1, :cond_4

    .line 6
    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_2
    const/4 v2, -0x1

    if-ge v2, v1, :cond_3

    .line 7
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 8
    instance-of v3, v2, Lcom/google/android/material/appbar/AppBarLayout;

    if-eqz v3, :cond_2

    .line 9
    check-cast v2, Lcom/google/android/material/appbar/AppBarLayout;

    goto :goto_3

    :cond_2
    add-int/lit8 v1, v1, -0x1

    goto :goto_2

    :cond_3
    const/4 v2, 0x0

    :goto_3
    if-eqz v2, :cond_4

    .line 10
    new-instance v0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$onAttachedToWindow$1;

    invoke-direct {v0, p0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$onAttachedToWindow$1;-><init>(Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;)V

    invoke-virtual {v2, v0}, Lcom/google/android/material/appbar/AppBarLayout;->addOnOffsetChangedListener(Lcom/google/android/material/appbar/AppBarLayout$OnOffsetChangedListener;)V

    :cond_4
    return-void
.end method

.method public onScrollStateChanged(I)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->onScrollStateChanged(I)V

    if-nez p1, :cond_4

    .line 2
    iget-object v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mLoadingListener:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$LoadingListener;

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->isLoadingData:Z

    if-nez v0, :cond_4

    iget-boolean v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->loadingMoreEnabled:Z

    if-eqz v0, :cond_4

    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v0

    .line 4
    instance-of v1, v0, Landroidx/recyclerview/widget/GridLayoutManager;

    if-eqz v1, :cond_0

    .line 5
    move-object v1, v0

    check-cast v1, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastVisibleItemPosition()I

    move-result v1

    goto :goto_0

    .line 6
    :cond_0
    instance-of v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    if-eqz v1, :cond_1

    .line 7
    move-object v1, v0

    check-cast v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->getSpanCount()I

    move-result v2

    new-array v2, v2, [I

    .line 8
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->findLastVisibleItemPositions([I)[I

    .line 9
    invoke-direct {p0, v2}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->findMax([I)I

    move-result v1

    goto :goto_0

    .line 10
    :cond_1
    move-object v1, v0

    check-cast v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastVisibleItemPosition()I

    move-result v1

    :goto_0
    const/4 v2, 0x0

    .line 11
    iget-object v3, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mPtrFrameLayout:Lcom/join/mgps/ptr/PtrFrameLayout;

    if-eqz v3, :cond_2

    .line 12
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lcom/join/mgps/ptr/PtrFrameLayout;->l()Z

    move-result v2

    .line 13
    :cond_2
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    move-result v0

    if-lez v0, :cond_3

    iget v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->preloadCount:I

    if-lt v1, v0, :cond_3

    .line 14
    iget-boolean v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->isNoMore:Z

    if-nez v0, :cond_3

    if-nez v2, :cond_3

    .line 15
    invoke-direct {p0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->preload()V

    .line 16
    :cond_3
    iget-object v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->scrollListener:Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;

    if-eqz v0, :cond_4

    .line 17
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, p0, p1}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;->onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V

    :cond_4
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "ev"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mLastY:F

    const/high16 v1, -0x40800000    # -1.0f

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v0

    iput v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mLastY:F

    .line 3
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-eqz v0, :cond_5

    const/4 v2, 0x2

    if-eq v0, v2, :cond_3

    .line 4
    iput v1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mLastY:F

    .line 5
    invoke-virtual {p0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->getLastVisiblePosition()I

    move-result v0

    .line 6
    invoke-virtual {p0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->getTotalItemCount()I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 7
    iget-boolean v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->isNoMore:Z

    if-nez v0, :cond_2

    .line 8
    invoke-virtual {p0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->startLoadMore()V

    .line 9
    :cond_2
    invoke-virtual {p0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->resetFooterHeight()V

    goto :goto_1

    .line 10
    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v0

    iget v1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mLastY:F

    sub-float/2addr v0, v1

    .line 11
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v1

    iput v1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mLastY:F

    .line 12
    invoke-virtual {p0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->getLastVisiblePosition()I

    move-result v1

    invoke-virtual {p0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->getTotalItemCount()I

    move-result v2

    if-ne v1, v2, :cond_6

    iget-object v1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mFooterView:Lcom/join/mgps/customview/XListViewFooter;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/join/mgps/customview/XListViewFooter;->getBottomMargin()I

    move-result v1

    if-gtz v1, :cond_4

    const/4 v1, 0x0

    cmpg-float v1, v0, v1

    if-gez v1, :cond_6

    .line 13
    :cond_4
    iget-boolean v1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mPullLoading:Z

    if-nez v1, :cond_6

    .line 14
    iget-boolean v1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->loadingMoreEnabled:Z

    if-eqz v1, :cond_6

    iget-boolean v1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->isNoMore:Z

    if-nez v1, :cond_6

    neg-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    .line 15
    invoke-virtual {p0, v0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->updateFooterHeight(F)V

    goto :goto_1

    .line 16
    :cond_5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v0

    iput v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mLastY:F

    .line 17
    :cond_6
    :goto_1
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public final refreshComplete()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mPtrFrameLayout:Lcom/join/mgps/ptr/PtrFrameLayout;

    if-eqz v0, :cond_0

    .line 2
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/join/mgps/ptr/PtrFrameLayout;->C()V

    :cond_0
    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, v0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->setNoMoreView(Z)V

    return-void
.end method

.method public final reset()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->setNoMoreView(Z)V

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->loadMoreComplete()V

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->refreshComplete()V

    return-void
.end method

.method protected final resetFooterHeight()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mFooterView:Lcom/join/mgps/customview/XListViewFooter;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/join/mgps/customview/XListViewFooter;->getBottomMargin()I

    move-result v3

    if-lez v3, :cond_0

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mScrollBack:I

    .line 3
    iget-object v1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mScroller:Landroid/widget/Scroller;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v2, 0x0

    const/4 v4, 0x0

    neg-int v5, v3

    const/16 v6, 0x190

    invoke-virtual/range {v1 .. v6}, Landroid/widget/Scroller;->startScroll(IIIII)V

    .line 4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->invalidate()V

    :cond_0
    return-void
.end method

.method public setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V
    .locals 1
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$Adapter;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
            "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$WrapAdapter;

    invoke-direct {v0, p0, p1}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$WrapAdapter;-><init>(Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    iput-object v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mWrapAdapter:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$WrapAdapter;

    .line 2
    invoke-super {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    if-eqz p1, :cond_1

    .line 3
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->hasObservers()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mDataObserver:Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->registerAdapterDataObserver(Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;)V

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mDataObserver:Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;->onChanged()V

    :cond_1
    return-void
.end method

.method public final setEmptyView(Landroid/view/View;)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mEmptyView:Landroid/view/View;

    .line 2
    iget-object p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mDataObserver:Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;->onChanged()V

    return-void
.end method

.method public final setFlingScale(D)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->scale:D

    return-void
.end method

.method public final setLoadingListener(Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$LoadingListener;)V
    .locals 0
    .param p1    # Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$LoadingListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mLoadingListener:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$LoadingListener;

    return-void
.end method

.method public final setLoadingMoreEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->loadingMoreEnabled:Z

    if-eqz p1, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->enableLoadingMoreView()V

    goto :goto_0

    .line 3
    :cond_0
    invoke-direct {p0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->disableLoadingMoreView()V

    :goto_0
    return-void
.end method

.method protected final setMFooterView(Lcom/join/mgps/customview/XListViewFooter;)V
    .locals 0
    .param p1    # Lcom/join/mgps/customview/XListViewFooter;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mFooterView:Lcom/join/mgps/customview/XListViewFooter;

    return-void
.end method

.method protected final setMPullLoading(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mPullLoading:Z

    return-void
.end method

.method protected final setMScrollBack(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mScrollBack:I

    return-void
.end method

.method protected final setMScroller(Landroid/widget/Scroller;)V
    .locals 0
    .param p1    # Landroid/widget/Scroller;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mScroller:Landroid/widget/Scroller;

    return-void
.end method

.method public final setNoMore()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->stopLoadMore()V

    .line 2
    iget-object v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mFooterView:Lcom/join/mgps/customview/XListViewFooter;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/join/mgps/customview/XListViewFooter;->f()V

    .line 3
    iget-object v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mFooterView:Lcom/join/mgps/customview/XListViewFooter;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/XListViewFooter;->setState(I)V

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mPullLoading:Z

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->isNoMore:Z

    .line 6
    iget-object v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mFooterView:Lcom/join/mgps/customview/XListViewFooter;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final setNoMoreView(Z)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mPullLoading:Z

    .line 2
    iput-boolean p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->isNoMore:Z

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->setNoMore()V

    goto :goto_0

    .line 4
    :cond_0
    iget-boolean p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->loadingMoreEnabled:Z

    invoke-virtual {p0, p1}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->setLoadingMoreEnabled(Z)V

    :goto_0
    return-void
.end method

.method public final setPreLoadCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->preloadCount:I

    return-void
.end method

.method public final setPtrFrameLayout(Lcom/join/mgps/ptr/PtrFrameLayout;)V
    .locals 1
    .param p1    # Lcom/join/mgps/ptr/PtrFrameLayout;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mPtrFrameLayout:Lcom/join/mgps/ptr/PtrFrameLayout;

    .line 2
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->ptrDefaultHandler:Lcom/join/mgps/ptr/a;

    invoke-virtual {p1, v0}, Lcom/join/mgps/ptr/PtrFrameLayout;->setPtrHandler(Lcom/join/mgps/ptr/b;)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of p1, p1, Lcom/join/mgps/ptr/PtrFrameLayout;

    if-eqz p1, :cond_1

    .line 4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type com.join.mgps.ptr.PtrFrameLayout"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/join/mgps/ptr/PtrFrameLayout;

    iput-object p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mPtrFrameLayout:Lcom/join/mgps/ptr/PtrFrameLayout;

    .line 5
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->ptrDefaultHandler:Lcom/join/mgps/ptr/a;

    invoke-virtual {p1, v0}, Lcom/join/mgps/ptr/PtrFrameLayout;->setPtrHandler(Lcom/join/mgps/ptr/b;)V

    .line 6
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mPtrFrameLayout:Lcom/join/mgps/ptr/PtrFrameLayout;

    if-eqz p1, :cond_2

    .line 7
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/join/mgps/ptr/PtrFrameLayout;->j(Z)V

    :cond_2
    return-void
.end method

.method public final setPullRefreshEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->pullRefreshEnabled:Z

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->setPtrFrameLayout(Lcom/join/mgps/ptr/PtrFrameLayout;)V

    :cond_0
    return-void
.end method

.method public final setRefreshing(Z)V
    .locals 0

    if-eqz p1, :cond_0

    .line 1
    iget-boolean p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->pullRefreshEnabled:Z

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mPtrFrameLayout:Lcom/join/mgps/ptr/PtrFrameLayout;

    if-eqz p1, :cond_0

    .line 3
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/join/mgps/ptr/PtrFrameLayout;->f()V

    :cond_0
    return-void
.end method

.method public final setScrollListener(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->scrollListener:Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;

    return-void
.end method

.method public final showHeaderLoading()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mPtrFrameLayout:Lcom/join/mgps/ptr/PtrFrameLayout;

    if-eqz v0, :cond_0

    .line 2
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/join/mgps/ptr/PtrFrameLayout;->f()V

    :cond_0
    return-void
.end method

.method public final showPullLoad()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->loadingMoreEnabled:Z

    .line 2
    iget-object v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mFooterView:Lcom/join/mgps/customview/XListViewFooter;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/join/mgps/customview/XListViewFooter;->f()V

    return-void
.end method

.method public final declared-synchronized startLoadMore()V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->preload()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final stopLoadMore()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mPullLoading:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->loadingMoreEnabled:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mPullLoading:Z

    .line 3
    iput-boolean v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->isLoadingData:Z

    .line 4
    iget-boolean v1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->isNoMore:Z

    if-eqz v1, :cond_0

    .line 5
    iget-object v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mFooterView:Lcom/join/mgps/customview/XListViewFooter;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/XListViewFooter;->setState(I)V

    goto :goto_0

    .line 6
    :cond_0
    iget-object v1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mFooterView:Lcom/join/mgps/customview/XListViewFooter;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1, v0}, Lcom/join/mgps/customview/XListViewFooter;->setState(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final stopRefresh()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mPtrFrameLayout:Lcom/join/mgps/ptr/PtrFrameLayout;

    if-eqz v0, :cond_0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/join/mgps/ptr/PtrFrameLayout;->C()V

    :cond_0
    return-void
.end method

.method protected final updateFooterHeight(F)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mFooterView:Lcom/join/mgps/customview/XListViewFooter;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/join/mgps/customview/XListViewFooter;->getBottomMargin()I

    move-result v0

    float-to-int p1, p1

    add-int/2addr v0, p1

    .line 2
    iget-boolean p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->loadingMoreEnabled:Z

    if-eqz p1, :cond_1

    iget-boolean p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mPullLoading:Z

    if-nez p1, :cond_1

    const/16 p1, 0x32

    if-le v0, p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mFooterView:Lcom/join/mgps/customview/XListViewFooter;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Lcom/join/mgps/customview/XListViewFooter;->setState(I)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mFooterView:Lcom/join/mgps/customview/XListViewFooter;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lcom/join/mgps/customview/XListViewFooter;->setState(I)V

    .line 5
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->mFooterView:Lcom/join/mgps/customview/XListViewFooter;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Lcom/join/mgps/customview/XListViewFooter;->setBottomMargin(I)V

    return-void
.end method
