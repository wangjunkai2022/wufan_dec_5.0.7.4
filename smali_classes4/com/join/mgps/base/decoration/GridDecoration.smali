.class public abstract Lcom/join/mgps/base/decoration/GridDecoration;
.super Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;
.source "GridDecoration.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/base/decoration/GridDecoration$a;,
        Lcom/join/mgps/base/decoration/GridDecoration$b;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "UniversalItemDecoration"


# instance fields
.field public decorations:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/join/mgps/base/decoration/GridDecoration$b;",
            ">;"
        }
    .end annotation
.end field

.field private mGridLayoutManager:Landroidx/recyclerview/widget/GridLayoutManager;

.field private mTotalColumn:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/base/decoration/GridDecoration;->decorations:Ljava/util/Map;

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Lcom/join/mgps/base/decoration/GridDecoration;->mTotalColumn:I

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lcom/join/mgps/base/decoration/GridDecoration;->mGridLayoutManager:Landroidx/recyclerview/widget/GridLayoutManager;

    return-void
.end method

.method public static string2Int(Ljava/lang/String;I)I
    .locals 0

    .line 1
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    return p1
.end method


# virtual methods
.method public abstract getItemOffsets(I)Lcom/join/mgps/base/decoration/GridDecoration$b;
.end method

.method public getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V
    .locals 3

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;->getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V

    .line 2
    iget-object p4, p0, Lcom/join/mgps/base/decoration/GridDecoration;->mGridLayoutManager:Landroidx/recyclerview/widget/GridLayoutManager;

    if-nez p4, :cond_0

    .line 3
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object p4

    check-cast p4, Landroidx/recyclerview/widget/GridLayoutManager;

    iput-object p4, p0, Lcom/join/mgps/base/decoration/GridDecoration;->mGridLayoutManager:Landroidx/recyclerview/widget/GridLayoutManager;

    .line 4
    :cond_0
    iget p4, p0, Lcom/join/mgps/base/decoration/GridDecoration;->mTotalColumn:I

    const/4 v0, -0x1

    if-ne p4, v0, :cond_1

    .line 5
    iget-object p4, p0, Lcom/join/mgps/base/decoration/GridDecoration;->mGridLayoutManager:Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p4}, Landroidx/recyclerview/widget/GridLayoutManager;->getSpanCount()I

    move-result p4

    iput p4, p0, Lcom/join/mgps/base/decoration/GridDecoration;->mTotalColumn:I

    .line 6
    :cond_1
    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    move-result p3

    .line 7
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-virtual {p2, p4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 8
    invoke-virtual {p0, p3}, Lcom/join/mgps/base/decoration/GridDecoration;->getItemOffsets(I)Lcom/join/mgps/base/decoration/GridDecoration$b;

    move-result-object p2

    if-eqz p2, :cond_5

    const/4 p4, 0x0

    if-nez p3, :cond_2

    .line 9
    iput p4, p2, Lcom/join/mgps/base/decoration/GridDecoration$b;->b:I

    goto :goto_0

    .line 10
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/base/decoration/GridDecoration;->decorations:Ljava/util/Map;

    add-int/lit8 v1, p3, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/base/decoration/GridDecoration$b;

    if-eqz v0, :cond_4

    .line 11
    iget p4, p2, Lcom/join/mgps/base/decoration/GridDecoration$b;->a:I

    iget v2, p0, Lcom/join/mgps/base/decoration/GridDecoration;->mTotalColumn:I

    if-ne p4, v2, :cond_3

    iget p4, v0, Lcom/join/mgps/base/decoration/GridDecoration$b;->a:I

    invoke-virtual {p0, v1, p4}, Lcom/join/mgps/base/decoration/GridDecoration;->isRight(II)Z

    move-result p4

    if-nez p4, :cond_3

    .line 12
    iget p4, v0, Lcom/join/mgps/base/decoration/GridDecoration$b;->b:I

    iget v0, v0, Lcom/join/mgps/base/decoration/GridDecoration$b;->a:I

    add-int/2addr v0, p4

    iget v1, p0, Lcom/join/mgps/base/decoration/GridDecoration;->mTotalColumn:I

    rem-int/2addr p4, v1

    sub-int/2addr v1, p4

    add-int/2addr v0, v1

    iput v0, p2, Lcom/join/mgps/base/decoration/GridDecoration$b;->b:I

    goto :goto_0

    .line 13
    :cond_3
    iget p4, v0, Lcom/join/mgps/base/decoration/GridDecoration$b;->b:I

    iget v0, v0, Lcom/join/mgps/base/decoration/GridDecoration$b;->a:I

    add-int/2addr p4, v0

    iput p4, p2, Lcom/join/mgps/base/decoration/GridDecoration$b;->b:I

    goto :goto_0

    .line 14
    :cond_4
    iput p4, p2, Lcom/join/mgps/base/decoration/GridDecoration$b;->b:I

    .line 15
    :goto_0
    iget p4, p2, Lcom/join/mgps/base/decoration/GridDecoration$b;->c:I

    iget v0, p2, Lcom/join/mgps/base/decoration/GridDecoration$b;->e:I

    iget v1, p2, Lcom/join/mgps/base/decoration/GridDecoration$b;->d:I

    iget v2, p2, Lcom/join/mgps/base/decoration/GridDecoration$b;->f:I

    invoke-virtual {p1, p4, v0, v1, v2}, Landroid/graphics/Rect;->set(IIII)V

    .line 16
    :cond_5
    iget-object p1, p0, Lcom/join/mgps/base/decoration/GridDecoration;->decorations:Ljava/util/Map;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p1, p3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public isLeft(I)Z
    .locals 3

    const/4 v0, 0x1

    if-eqz p1, :cond_2

    sub-int/2addr p1, v0

    if-ltz p1, :cond_2

    .line 1
    iget-object v1, p0, Lcom/join/mgps/base/decoration/GridDecoration;->decorations:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/base/decoration/GridDecoration;->decorations:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/base/decoration/GridDecoration$b;

    iget v1, v1, Lcom/join/mgps/base/decoration/GridDecoration$b;->b:I

    iget-object v2, p0, Lcom/join/mgps/base/decoration/GridDecoration;->decorations:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/base/decoration/GridDecoration$b;

    iget p1, p1, Lcom/join/mgps/base/decoration/GridDecoration$b;->a:I

    add-int/2addr v1, p1

    iget p1, p0, Lcom/join/mgps/base/decoration/GridDecoration;->mTotalColumn:I

    rem-int/2addr v1, p1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :cond_2
    :goto_0
    return v0
.end method

.method public isRight(II)Z
    .locals 4

    const/4 v0, 0x0

    if-lez p1, :cond_1

    .line 1
    iget-object v1, p0, Lcom/join/mgps/base/decoration/GridDecoration;->decorations:Ljava/util/Map;

    const/4 v2, 0x1

    sub-int/2addr p1, v2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/base/decoration/GridDecoration;->decorations:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/base/decoration/GridDecoration$b;

    iget v1, v1, Lcom/join/mgps/base/decoration/GridDecoration$b;->b:I

    iget-object v3, p0, Lcom/join/mgps/base/decoration/GridDecoration;->decorations:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/base/decoration/GridDecoration$b;

    iget p1, p1, Lcom/join/mgps/base/decoration/GridDecoration$b;->a:I

    add-int/2addr v1, p1

    iget p1, p0, Lcom/join/mgps/base/decoration/GridDecoration;->mTotalColumn:I

    rem-int/2addr v1, p1

    add-int/2addr v1, p2

    if-ne v1, p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    :goto_0
    return v0
.end method

.method public isTop(II)Z
    .locals 0

    if-ge p2, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public onDraw(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V
    .locals 16

    .line 1
    invoke-super/range {p0 .. p3}, Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;->onDraw(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V

    .line 2
    invoke-virtual/range {p2 .. p2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_5

    move-object/from16 v3, p2

    .line 3
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 4
    invoke-virtual {v4}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v1}, Lcom/join/mgps/base/decoration/GridDecoration;->string2Int(Ljava/lang/String;I)I

    move-result v5

    move-object/from16 v6, p0

    .line 5
    iget-object v7, v6, Lcom/join/mgps/base/decoration/GridDecoration;->decorations:Ljava/util/Map;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v7, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/join/mgps/base/decoration/GridDecoration$b;

    if-nez v5, :cond_0

    goto/16 :goto_1

    .line 6
    :cond_0
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    check-cast v7, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 7
    invoke-virtual {v4}, Landroid/view/View;->getBottom()I

    move-result v8

    iget v9, v7, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int v13, v8, v9

    .line 8
    invoke-virtual {v4}, Landroid/view/View;->getLeft()I

    move-result v8

    iget v9, v7, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    sub-int v14, v8, v9

    .line 9
    invoke-virtual {v4}, Landroid/view/View;->getRight()I

    move-result v8

    iget v9, v7, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int v15, v8, v9

    .line 10
    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    move-result v4

    iget v7, v7, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    sub-int/2addr v4, v7

    .line 11
    iget v7, v5, Lcom/join/mgps/base/decoration/GridDecoration$b;->f:I

    if-eqz v7, :cond_1

    .line 12
    iget v8, v5, Lcom/join/mgps/base/decoration/GridDecoration$b;->c:I

    sub-int v9, v14, v8

    iget v8, v5, Lcom/join/mgps/base/decoration/GridDecoration$b;->d:I

    add-int v11, v15, v8

    add-int v12, v13, v7

    move-object v7, v5

    move-object/from16 v8, p1

    move v10, v13

    invoke-virtual/range {v7 .. v12}, Lcom/join/mgps/base/decoration/GridDecoration$b;->a(Landroid/graphics/Canvas;IIII)V

    .line 13
    :cond_1
    iget v7, v5, Lcom/join/mgps/base/decoration/GridDecoration$b;->e:I

    if-eqz v7, :cond_2

    .line 14
    iget v8, v5, Lcom/join/mgps/base/decoration/GridDecoration$b;->c:I

    sub-int v9, v14, v8

    sub-int v10, v4, v7

    iget v7, v5, Lcom/join/mgps/base/decoration/GridDecoration$b;->d:I

    add-int v11, v15, v7

    move-object v7, v5

    move-object/from16 v8, p1

    move v12, v4

    invoke-virtual/range {v7 .. v12}, Lcom/join/mgps/base/decoration/GridDecoration$b;->a(Landroid/graphics/Canvas;IIII)V

    .line 15
    :cond_2
    iget v7, v5, Lcom/join/mgps/base/decoration/GridDecoration$b;->c:I

    if-eqz v7, :cond_3

    sub-int v9, v14, v7

    move-object v7, v5

    move-object/from16 v8, p1

    move v10, v4

    move v11, v14

    move v12, v13

    .line 16
    invoke-virtual/range {v7 .. v12}, Lcom/join/mgps/base/decoration/GridDecoration$b;->a(Landroid/graphics/Canvas;IIII)V

    .line 17
    :cond_3
    iget v7, v5, Lcom/join/mgps/base/decoration/GridDecoration$b;->d:I

    if-eqz v7, :cond_4

    add-int v11, v15, v7

    move-object v7, v5

    move-object/from16 v8, p1

    move v9, v15

    move v10, v4

    move v12, v13

    .line 18
    invoke-virtual/range {v7 .. v12}, Lcom/join/mgps/base/decoration/GridDecoration$b;->a(Landroid/graphics/Canvas;IIII)V

    :cond_4
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_5
    move-object/from16 v6, p0

    return-void
.end method
