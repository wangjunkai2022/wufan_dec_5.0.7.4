.class public final Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter;
.super Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;
.source "DefaultTrailingLoadStateAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter$TrailingLoadStateVH;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter<",
        "Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter$TrailingLoadStateVH;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;-><init>(Z)V

    return-void
.end method

.method public synthetic constructor <init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    .line 2
    :cond_0
    invoke-direct {p0, p1}, Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter;-><init>(Z)V

    return-void
.end method

.method public static synthetic A(Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter;->E(Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter;Landroid/view/View;)V

    return-void
.end method

.method private static final D(Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->p()V

    return-void
.end method

.method private static final E(Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->q()V

    return-void
.end method

.method public static synthetic z(Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter;->D(Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter;Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public B(Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter$TrailingLoadStateVH;Lcom/chad/library/adapter/base/loadState/b;)V
    .locals 3
    .param p1    # Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter$TrailingLoadStateVH;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/chad/library/adapter/base/loadState/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "loadState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    instance-of v0, p2, Lcom/chad/library/adapter/base/loadState/b$d;

    const/4 v1, 0x0

    const/16 v2, 0x8

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {p2}, Lcom/chad/library/adapter/base/loadState/b;->a()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter$TrailingLoadStateVH;->a()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v2}, Landroid/view/View;->setVisibility(I)V

    .line 4
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter$TrailingLoadStateVH;->d()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v2}, Landroid/view/View;->setVisibility(I)V

    .line 5
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter$TrailingLoadStateVH;->c()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v2}, Landroid/view/View;->setVisibility(I)V

    .line 6
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter$TrailingLoadStateVH;->b()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_0

    .line 7
    :cond_0
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter$TrailingLoadStateVH;->a()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 8
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter$TrailingLoadStateVH;->d()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v2}, Landroid/view/View;->setVisibility(I)V

    .line 9
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter$TrailingLoadStateVH;->c()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v2}, Landroid/view/View;->setVisibility(I)V

    .line 10
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter$TrailingLoadStateVH;->b()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 11
    :cond_1
    instance-of v0, p2, Lcom/chad/library/adapter/base/loadState/b$b;

    if-eqz v0, :cond_2

    .line 12
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter$TrailingLoadStateVH;->a()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v2}, Landroid/view/View;->setVisibility(I)V

    .line 13
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter$TrailingLoadStateVH;->d()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 14
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter$TrailingLoadStateVH;->c()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v2}, Landroid/view/View;->setVisibility(I)V

    .line 15
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter$TrailingLoadStateVH;->b()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 16
    :cond_2
    instance-of v0, p2, Lcom/chad/library/adapter/base/loadState/b$a;

    if-eqz v0, :cond_3

    .line 17
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter$TrailingLoadStateVH;->a()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v2}, Landroid/view/View;->setVisibility(I)V

    .line 18
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter$TrailingLoadStateVH;->d()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v2}, Landroid/view/View;->setVisibility(I)V

    .line 19
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter$TrailingLoadStateVH;->c()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 20
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter$TrailingLoadStateVH;->b()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 21
    :cond_3
    instance-of p2, p2, Lcom/chad/library/adapter/base/loadState/b$c;

    if-eqz p2, :cond_4

    .line 22
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter$TrailingLoadStateVH;->a()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v2}, Landroid/view/View;->setVisibility(I)V

    .line 23
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter$TrailingLoadStateVH;->d()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v2}, Landroid/view/View;->setVisibility(I)V

    .line 24
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter$TrailingLoadStateVH;->c()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v2}, Landroid/view/View;->setVisibility(I)V

    .line 25
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter$TrailingLoadStateVH;->b()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_4
    :goto_0
    return-void
.end method

.method public C(Landroid/view/ViewGroup;Lcom/chad/library/adapter/base/loadState/b;)Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter$TrailingLoadStateVH;
    .locals 2
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/chad/library/adapter/base/loadState/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "loadState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance p2, Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter$TrailingLoadStateVH;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p2, p1, v0, v1, v0}, Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter$TrailingLoadStateVH;-><init>(Landroid/view/ViewGroup;Landroid/view/View;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 2
    invoke-virtual {p2}, Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter$TrailingLoadStateVH;->c()Landroid/view/View;

    move-result-object p1

    new-instance v0, Lz/a;

    invoke-direct {v0, p0}, Lz/a;-><init>(Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 3
    invoke-virtual {p2}, Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter$TrailingLoadStateVH;->a()Landroid/view/View;

    move-result-object p1

    new-instance v0, Lz/b;

    invoke-direct {v0, p0}, Lz/b;-><init>(Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object p2
.end method

.method public c(Lcom/chad/library/adapter/base/loadState/b;)I
    .locals 1
    .param p1    # Lcom/chad/library/adapter/base/loadState/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "loadState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const p1, 0x7f0c00e5

    return p1
.end method

.method public bridge synthetic d(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Lcom/chad/library/adapter/base/loadState/b;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter$TrailingLoadStateVH;

    invoke-virtual {p0, p1, p2}, Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter;->B(Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter$TrailingLoadStateVH;Lcom/chad/library/adapter/base/loadState/b;)V

    return-void
.end method

.method public bridge synthetic e(Landroid/view/ViewGroup;Lcom/chad/library/adapter/base/loadState/b;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter;->C(Landroid/view/ViewGroup;Lcom/chad/library/adapter/base/loadState/b;)Lcom/chad/library/adapter/base/loadState/trailing/DefaultTrailingLoadStateAdapter$TrailingLoadStateVH;

    move-result-object p1

    return-object p1
.end method
