.class public final Lcom/chad/library/adapter/base/dragswipe/DragSwipeExtKt;
.super Ljava/lang/Object;
.source "DragSwipeExt.kt"


# direct methods
.method public static final a(Lcom/chad/library/adapter/base/dragswipe/QuickDragAndSwipe;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;)Lcom/chad/library/adapter/base/dragswipe/QuickDragAndSwipe;
    .locals 1
    .param p0    # Lcom/chad/library/adapter/base/dragswipe/QuickDragAndSwipe;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function4;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/chad/library/adapter/base/dragswipe/QuickDragAndSwipe;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function4<",
            "-",
            "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)",
            "Lcom/chad/library/adapter/base/dragswipe/QuickDragAndSwipe;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onItemDragStart"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onItemDragMoving"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onItemDragEnd"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lcom/chad/library/adapter/base/dragswipe/DragSwipeExtKt$a;

    invoke-direct {v0, p1, p2, p3}, Lcom/chad/library/adapter/base/dragswipe/DragSwipeExtKt$a;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;)V

    .line 2
    invoke-virtual {p0, v0}, Lcom/chad/library/adapter/base/dragswipe/QuickDragAndSwipe;->k(Lw/b;)Lcom/chad/library/adapter/base/dragswipe/QuickDragAndSwipe;

    return-object p0
.end method

.method public static synthetic b(Lcom/chad/library/adapter/base/dragswipe/QuickDragAndSwipe;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lcom/chad/library/adapter/base/dragswipe/QuickDragAndSwipe;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 1
    sget-object p1, Lcom/chad/library/adapter/base/dragswipe/DragSwipeExtKt$setItemDragListener$1;->b:Lcom/chad/library/adapter/base/dragswipe/DragSwipeExtKt$setItemDragListener$1;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    .line 2
    sget-object p2, Lcom/chad/library/adapter/base/dragswipe/DragSwipeExtKt$setItemDragListener$2;->b:Lcom/chad/library/adapter/base/dragswipe/DragSwipeExtKt$setItemDragListener$2;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    .line 3
    sget-object p3, Lcom/chad/library/adapter/base/dragswipe/DragSwipeExtKt$setItemDragListener$3;->b:Lcom/chad/library/adapter/base/dragswipe/DragSwipeExtKt$setItemDragListener$3;

    :cond_2
    const-string p4, "<this>"

    .line 4
    invoke-static {p0, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "onItemDragStart"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "onItemDragMoving"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "onItemDragEnd"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    new-instance p4, Lcom/chad/library/adapter/base/dragswipe/DragSwipeExtKt$a;

    invoke-direct {p4, p1, p2, p3}, Lcom/chad/library/adapter/base/dragswipe/DragSwipeExtKt$a;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;)V

    .line 6
    invoke-virtual {p0, p4}, Lcom/chad/library/adapter/base/dragswipe/QuickDragAndSwipe;->k(Lw/b;)Lcom/chad/library/adapter/base/dragswipe/QuickDragAndSwipe;

    return-object p0
.end method

.method public static final c(Lcom/chad/library/adapter/base/dragswipe/QuickDragAndSwipe;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;)Lcom/chad/library/adapter/base/dragswipe/QuickDragAndSwipe;
    .locals 1
    .param p0    # Lcom/chad/library/adapter/base/dragswipe/QuickDragAndSwipe;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function5;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function3;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/chad/library/adapter/base/dragswipe/QuickDragAndSwipe;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function5<",
            "-",
            "Landroid/graphics/Canvas;",
            "-",
            "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
            "-",
            "Ljava/lang/Float;",
            "-",
            "Ljava/lang/Float;",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)",
            "Lcom/chad/library/adapter/base/dragswipe/QuickDragAndSwipe;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onItemSwipeStart"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onItemSwipeMoving"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onItemSwiped"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onItemSwipeEnd"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lcom/chad/library/adapter/base/dragswipe/DragSwipeExtKt$b;

    invoke-direct {v0, p1, p4, p3, p2}, Lcom/chad/library/adapter/base/dragswipe/DragSwipeExtKt$b;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function5;)V

    .line 2
    invoke-virtual {p0, v0}, Lcom/chad/library/adapter/base/dragswipe/QuickDragAndSwipe;->l(Lw/c;)Lcom/chad/library/adapter/base/dragswipe/QuickDragAndSwipe;

    return-object p0
.end method

.method public static synthetic d(Lcom/chad/library/adapter/base/dragswipe/QuickDragAndSwipe;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lcom/chad/library/adapter/base/dragswipe/QuickDragAndSwipe;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    .line 1
    sget-object p1, Lcom/chad/library/adapter/base/dragswipe/DragSwipeExtKt$setItemSwipeListener$1;->b:Lcom/chad/library/adapter/base/dragswipe/DragSwipeExtKt$setItemSwipeListener$1;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    .line 2
    sget-object p2, Lcom/chad/library/adapter/base/dragswipe/DragSwipeExtKt$setItemSwipeListener$2;->b:Lcom/chad/library/adapter/base/dragswipe/DragSwipeExtKt$setItemSwipeListener$2;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    .line 3
    sget-object p3, Lcom/chad/library/adapter/base/dragswipe/DragSwipeExtKt$setItemSwipeListener$3;->b:Lcom/chad/library/adapter/base/dragswipe/DragSwipeExtKt$setItemSwipeListener$3;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    .line 4
    sget-object p4, Lcom/chad/library/adapter/base/dragswipe/DragSwipeExtKt$setItemSwipeListener$4;->b:Lcom/chad/library/adapter/base/dragswipe/DragSwipeExtKt$setItemSwipeListener$4;

    :cond_3
    const-string p5, "<this>"

    .line 5
    invoke-static {p0, p5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "onItemSwipeStart"

    invoke-static {p1, p5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "onItemSwipeMoving"

    invoke-static {p2, p5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "onItemSwiped"

    invoke-static {p3, p5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "onItemSwipeEnd"

    invoke-static {p4, p5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    new-instance p5, Lcom/chad/library/adapter/base/dragswipe/DragSwipeExtKt$b;

    invoke-direct {p5, p1, p4, p3, p2}, Lcom/chad/library/adapter/base/dragswipe/DragSwipeExtKt$b;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function5;)V

    .line 7
    invoke-virtual {p0, p5}, Lcom/chad/library/adapter/base/dragswipe/QuickDragAndSwipe;->l(Lw/c;)Lcom/chad/library/adapter/base/dragswipe/QuickDragAndSwipe;

    return-object p0
.end method
