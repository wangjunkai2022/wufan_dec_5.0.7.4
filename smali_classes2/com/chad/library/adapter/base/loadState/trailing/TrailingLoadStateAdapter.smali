.class public abstract Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;
.super Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;
.source "TrailingLoadStateAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<VH:",
        "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
        ">",
        "Lcom/chad/library/adapter/base/loadState/LoadStateAdapter<",
        "TVH;>;"
    }
.end annotation


# instance fields
.field private final c:Z

.field private d:Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter$a;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private e:Z

.field private f:I

.field private g:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;-><init>()V

    .line 3
    iput-boolean p1, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->c:Z

    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->e:Z

    .line 5
    iput-boolean p1, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->g:Z

    return-void
.end method

.method public synthetic constructor <init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    .line 1
    :cond_0
    invoke-direct {p0, p1}, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;-><init>(Z)V

    return-void
.end method

.method public static synthetic g(Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;)V
    .locals 0

    invoke-static {p0}, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->v(Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;)V

    return-void
.end method

.method private final getTheBiggestNumber([I)I
    .locals 4

    const/4 v0, -0x1

    if-eqz p1, :cond_3

    .line 1
    array-length v1, p1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    goto :goto_2

    .line 2
    :cond_1
    array-length v1, p1

    :goto_1
    if-ge v2, v1, :cond_3

    aget v3, p1, v2

    if-le v3, v0, :cond_2

    move v0, v3

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    :goto_2
    return v0
.end method

.method public static synthetic h(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->l(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;Landroidx/recyclerview/widget/RecyclerView;)V

    return-void
.end method

.method public static synthetic i(Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;)V
    .locals 0

    invoke-static {p0}, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->k(Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;)V

    return-void
.end method

.method private static final k(Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->s()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->g:Z

    :cond_0
    return-void
.end method

.method private static final l(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 2

    const-string v0, "$manager"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$recyclerView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    check-cast p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->getSpanCount()I

    move-result v0

    new-array v0, v0, [I

    .line 2
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->findLastCompletelyVisibleItemPositions([I)[I

    .line 3
    invoke-direct {p1, v0}, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->getTheBiggestNumber([I)I

    move-result p0

    const/4 v0, 0x1

    add-int/2addr p0, v0

    .line 4
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object p2

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->getItemCount()I

    move-result p2

    if-ne p0, p2, :cond_0

    const/4 v1, 0x1

    :cond_0
    if-nez v1, :cond_1

    .line 5
    iput-boolean v0, p1, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->g:Z

    :cond_1
    return-void
.end method

.method private final s()Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v2

    goto :goto_0

    :cond_1
    move-object v2, v3

    :goto_0
    instance-of v4, v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    if-eqz v4, :cond_2

    move-object v3, v2

    check-cast v3, Landroidx/recyclerview/widget/LinearLayoutManager;

    :cond_2
    if-nez v3, :cond_3

    return v1

    .line 3
    :cond_3
    invoke-virtual {v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastCompletelyVisibleItemPosition()I

    move-result v2

    add-int/2addr v2, v1

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->getItemCount()I

    move-result v0

    if-ne v2, v0, :cond_5

    .line 4
    invoke-virtual {v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstCompletelyVisibleItemPosition()I

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_1

    :cond_4
    const/4 v1, 0x0

    :cond_5
    :goto_1
    return v1
.end method

.method private final u()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->e:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->d:Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter$a;->a()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    if-eqz v1, :cond_1

    goto :goto_0

    .line 2
    :cond_1
    iget-boolean v0, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->g:Z

    if-nez v0, :cond_2

    return-void

    .line 3
    :cond_2
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;->b()Lcom/chad/library/adapter/base/loadState/b;

    move-result-object v0

    instance-of v0, v0, Lcom/chad/library/adapter/base/loadState/b$d;

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;->b()Lcom/chad/library/adapter/base/loadState/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/chad/library/adapter/base/loadState/b;->a()Z

    move-result v0

    if-nez v0, :cond_5

    .line 4
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    if-nez v0, :cond_3

    return-void

    .line 5
    :cond_3
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->isComputingLayout()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 6
    new-instance v1, Lz/d;

    invoke-direct {v1, p0}, Lz/d;-><init>(Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 7
    :cond_4
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->q()V

    :cond_5
    :goto_0
    return-void
.end method

.method private static final v(Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->q()V

    return-void
.end method


# virtual methods
.method public a(Lcom/chad/library/adapter/base/loadState/b;)Z
    .locals 2
    .param p1    # Lcom/chad/library/adapter/base/loadState/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "loadState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-super {p0, p1}, Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;->a(Lcom/chad/library/adapter/base/loadState/b;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 2
    instance-of v0, p1, Lcom/chad/library/adapter/base/loadState/b$d;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/chad/library/adapter/base/loadState/b;->a()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 3
    :cond_0
    iget-boolean v1, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->c:Z

    if-eqz v1, :cond_1

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/chad/library/adapter/base/loadState/b;->a()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final j()V
    .locals 3

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->g:Z

    .line 2
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v1

    if-nez v1, :cond_1

    return-void

    .line 4
    :cond_1
    instance-of v2, v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    if-eqz v2, :cond_2

    .line 5
    new-instance v1, Lz/e;

    invoke-direct {v1, p0}, Lz/e;-><init>(Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 6
    :cond_2
    instance-of v2, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    if-eqz v2, :cond_3

    .line 7
    new-instance v2, Lz/c;

    invoke-direct {v2, v1, p0, v0}, Lz/c;-><init>(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;Landroidx/recyclerview/widget/RecyclerView;)V

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z

    :cond_3
    :goto_0
    return-void
.end method

.method public final m(II)V
    .locals 1

    add-int/lit8 v0, p1, -0x1

    if-le p2, v0, :cond_0

    return-void

    :cond_0
    sub-int/2addr p1, p2

    add-int/lit8 p1, p1, -0x1

    .line 1
    iget p2, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->f:I

    if-gt p1, p2, :cond_1

    .line 2
    invoke-direct {p0}, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->u()V

    :cond_1
    return-void
.end method

.method public final n()Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter$a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->d:Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter$a;

    return-object v0
.end method

.method public final o()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->f:I

    return v0
.end method

.method public onViewAttachedToWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 1
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CallSuper;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TVH;)V"
        }
    .end annotation

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->u()V

    return-void
.end method

.method public final p()V
    .locals 1

    .line 1
    sget-object v0, Lcom/chad/library/adapter/base/loadState/b$b;->b:Lcom/chad/library/adapter/base/loadState/b$b;

    invoke-virtual {p0, v0}, Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;->f(Lcom/chad/library/adapter/base/loadState/b;)V

    .line 2
    iget-object v0, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->d:Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter$a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter$a;->c()V

    :cond_0
    return-void
.end method

.method public final q()V
    .locals 1

    .line 1
    sget-object v0, Lcom/chad/library/adapter/base/loadState/b$b;->b:Lcom/chad/library/adapter/base/loadState/b$b;

    invoke-virtual {p0, v0}, Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;->f(Lcom/chad/library/adapter/base/loadState/b;)V

    .line 2
    iget-object v0, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->d:Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter$a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter$a;->b()V

    :cond_0
    return-void
.end method

.method public final r()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->e:Z

    return v0
.end method

.method public final t()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->c:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\n            TrailingLoadStateAdapter ->\n            [isLoadEndDisplay: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    iget-boolean v1, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->c:Z

    .line 3
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "],\n            [isAutoLoadMore: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    iget-boolean v1, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->e:Z

    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "],\n            [preloadSize: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    iget v1, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->f:I

    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "],\n            [loadState: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/loadState/LoadStateAdapter;->b()Lcom/chad/library/adapter/base/loadState/b;

    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]\n        "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 10
    invoke-static {v0}, Lkotlin/text/StringsKt;->trimIndent(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final w(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->e:Z

    return-void
.end method

.method public final x(Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter$a;)Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;
    .locals 0
    .param p1    # Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter$a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter$a;",
            ")",
            "Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter<",
            "TVH;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->d:Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter$a;

    return-object p0
.end method

.method public final y(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->f:I

    return-void
.end method
