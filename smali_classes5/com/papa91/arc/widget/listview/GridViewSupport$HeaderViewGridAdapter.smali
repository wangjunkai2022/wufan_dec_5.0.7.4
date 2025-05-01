.class public Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;
.super Ljava/lang/Object;
.source "GridViewSupport.java"

# interfaces
.implements Landroid/widget/WrapperListAdapter;
.implements Landroid/widget/Filterable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/papa91/arc/widget/listview/GridViewSupport;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "HeaderViewGridAdapter"
.end annotation


# static fields
.field static final EMPTY_INFO_LIST:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/papa91/arc/widget/listview/GridViewSupport$FixedViewInfo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final mAdapter:Landroid/widget/ListAdapter;

.field mAreAllFixedViewsSelectable:Z

.field private mCacheFirstHeaderView:Z

.field private mCachePlaceHoldView:Z

.field private final mDataSetObservable:Landroid/database/DataSetObservable;

.field mFooterViewInfos:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/papa91/arc/widget/listview/GridViewSupport$FixedViewInfo;",
            ">;"
        }
    .end annotation
.end field

.field mHeaderViewInfos:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/papa91/arc/widget/listview/GridViewSupport$FixedViewInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final mIsFilterable:Z

.field private mNumColumns:I

.field private mRowHeight:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->EMPTY_INFO_LIST:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;Ljava/util/ArrayList;Landroid/widget/ListAdapter;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/papa91/arc/widget/listview/GridViewSupport$FixedViewInfo;",
            ">;",
            "Ljava/util/ArrayList<",
            "Lcom/papa91/arc/widget/listview/GridViewSupport$FixedViewInfo;",
            ">;",
            "Landroid/widget/ListAdapter;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroid/database/DataSetObservable;

    invoke-direct {v0}, Landroid/database/DataSetObservable;-><init>()V

    iput-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mDataSetObservable:Landroid/database/DataSetObservable;

    const/4 v0, 0x1

    .line 3
    iput v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mNumColumns:I

    const/4 v1, -0x1

    .line 4
    iput v1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mRowHeight:I

    .line 5
    iput-boolean v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mCachePlaceHoldView:Z

    const/4 v1, 0x0

    .line 6
    iput-boolean v1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mCacheFirstHeaderView:Z

    .line 7
    iput-object p3, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mAdapter:Landroid/widget/ListAdapter;

    .line 8
    instance-of p3, p3, Landroid/widget/Filterable;

    iput-boolean p3, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mIsFilterable:Z

    if-nez p1, :cond_0

    .line 9
    sget-object p1, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->EMPTY_INFO_LIST:Ljava/util/ArrayList;

    iput-object p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mHeaderViewInfos:Ljava/util/ArrayList;

    goto :goto_0

    .line 10
    :cond_0
    iput-object p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mHeaderViewInfos:Ljava/util/ArrayList;

    :goto_0
    if-nez p2, :cond_1

    .line 11
    sget-object p1, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->EMPTY_INFO_LIST:Ljava/util/ArrayList;

    iput-object p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mFooterViewInfos:Ljava/util/ArrayList;

    goto :goto_1

    .line 12
    :cond_1
    iput-object p2, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mFooterViewInfos:Ljava/util/ArrayList;

    .line 13
    :goto_1
    iget-object p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mHeaderViewInfos:Ljava/util/ArrayList;

    invoke-direct {p0, p1}, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->areAllListInfosSelectable(Ljava/util/ArrayList;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mFooterViewInfos:Ljava/util/ArrayList;

    .line 14
    invoke-direct {p0, p1}, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->areAllListInfosSelectable(Ljava/util/ArrayList;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    iput-boolean v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mAreAllFixedViewsSelectable:Z

    return-void
.end method

.method private areAllListInfosSelectable(Ljava/util/ArrayList;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/papa91/arc/widget/listview/GridViewSupport$FixedViewInfo;",
            ">;)Z"
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/papa91/arc/widget/listview/GridViewSupport$FixedViewInfo;

    .line 2
    iget-boolean v0, v0, Lcom/papa91/arc/widget/listview/GridViewSupport$FixedViewInfo;->isSelectable:Z

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method private getAdapterAndPlaceHolderCount()I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mAdapter:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float v0, v0, v1

    iget v1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mNumColumns:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    iget v2, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mNumColumns:I

    int-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, v2

    double-to-int v0, v0

    return v0
.end method


# virtual methods
.method public areAllItemsEnabled()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mAdapter:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_1

    iget-boolean v1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mAreAllFixedViewsSelectable:Z

    if-eqz v1, :cond_0

    invoke-interface {v0}, Landroid/widget/ListAdapter;->areAllItemsEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public getCount()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mAdapter:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->getFootersCount()I

    move-result v0

    invoke-virtual {p0}, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->getHeadersCount()I

    move-result v1

    add-int/2addr v0, v1

    iget v1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mNumColumns:I

    mul-int v0, v0, v1

    invoke-direct {p0}, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->getAdapterAndPlaceHolderCount()I

    move-result v1

    add-int/2addr v0, v1

    return v0

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->getFootersCount()I

    move-result v0

    invoke-virtual {p0}, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->getHeadersCount()I

    move-result v1

    add-int/2addr v0, v1

    iget v1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mNumColumns:I

    mul-int v0, v0, v1

    return v0
.end method

.method public getFilter()Landroid/widget/Filter;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mIsFilterable:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mAdapter:Landroid/widget/ListAdapter;

    check-cast v0, Landroid/widget/Filterable;

    invoke-interface {v0}, Landroid/widget/Filterable;->getFilter()Landroid/widget/Filter;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getFootersCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mFooterViewInfos:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getHeadersCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mHeaderViewInfos:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->getHeadersCount()I

    move-result v0

    iget v1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mNumColumns:I

    mul-int v0, v0, v1

    const/4 v2, 0x0

    if-ge p1, v0, :cond_1

    .line 2
    rem-int v0, p1, v1

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mHeaderViewInfos:Ljava/util/ArrayList;

    div-int/2addr p1, v1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/papa91/arc/widget/listview/GridViewSupport$FixedViewInfo;

    iget-object p1, p1, Lcom/papa91/arc/widget/listview/GridViewSupport$FixedViewInfo;->data:Ljava/lang/Object;

    return-object p1

    :cond_0
    return-object v2

    :cond_1
    sub-int/2addr p1, v0

    const/4 v0, 0x0

    .line 4
    iget-object v1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mAdapter:Landroid/widget/ListAdapter;

    if-eqz v1, :cond_3

    .line 5
    invoke-direct {p0}, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->getAdapterAndPlaceHolderCount()I

    move-result v0

    if-ge p1, v0, :cond_3

    .line 6
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mAdapter:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I

    move-result v0

    if-ge p1, v0, :cond_2

    .line 7
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mAdapter:Landroid/widget/ListAdapter;

    invoke-interface {v0, p1}, Landroid/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    return-object v2

    :cond_3
    sub-int/2addr p1, v0

    .line 8
    iget v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mNumColumns:I

    rem-int v0, p1, v0

    if-nez v0, :cond_4

    .line 9
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mFooterViewInfos:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/papa91/arc/widget/listview/GridViewSupport$FixedViewInfo;

    iget-object p1, p1, Lcom/papa91/arc/widget/listview/GridViewSupport$FixedViewInfo;->data:Ljava/lang/Object;

    return-object p1

    :cond_4
    return-object v2
.end method

.method public getItemId(I)J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->getHeadersCount()I

    move-result v0

    iget v1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mNumColumns:I

    mul-int v0, v0, v1

    .line 2
    iget-object v1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mAdapter:Landroid/widget/ListAdapter;

    if-eqz v1, :cond_0

    if-lt p1, v0, :cond_0

    sub-int/2addr p1, v0

    .line 3
    invoke-interface {v1}, Landroid/widget/ListAdapter;->getCount()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mAdapter:Landroid/widget/ListAdapter;

    invoke-interface {v0, p1}, Landroid/widget/ListAdapter;->getItemId(I)J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->getHeadersCount()I

    move-result v0

    iget v1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mNumColumns:I

    mul-int v0, v0, v1

    .line 2
    iget-object v1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mAdapter:Landroid/widget/ListAdapter;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v1}, Landroid/widget/ListAdapter;->getViewTypeCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    const/4 v3, -0x2

    .line 3
    iget-boolean v4, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mCachePlaceHoldView:Z

    if-eqz v4, :cond_2

    if-ge p1, v0, :cond_2

    if-nez p1, :cond_1

    .line 4
    iget-boolean v4, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mCacheFirstHeaderView:Z

    if-eqz v4, :cond_1

    .line 5
    iget-object v3, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mHeaderViewInfos:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/2addr v3, v1

    iget-object v4, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mFooterViewInfos:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v3, v3, 0x1

    .line 6
    :cond_1
    iget v4, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mNumColumns:I

    rem-int v5, p1, v4

    if-eqz v5, :cond_2

    .line 7
    div-int v3, p1, v4

    add-int/lit8 v3, v3, 0x1

    add-int/2addr v3, v1

    :cond_2
    sub-int/2addr p1, v0

    .line 8
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mAdapter:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_4

    .line 9
    invoke-direct {p0}, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->getAdapterAndPlaceHolderCount()I

    move-result v2

    if-ltz p1, :cond_4

    if-ge p1, v2, :cond_4

    .line 10
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mAdapter:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I

    move-result v0

    if-ge p1, v0, :cond_3

    .line 11
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mAdapter:Landroid/widget/ListAdapter;

    invoke-interface {v0, p1}, Landroid/widget/ListAdapter;->getItemViewType(I)I

    move-result v3

    goto :goto_1

    .line 12
    :cond_3
    iget-boolean v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mCachePlaceHoldView:Z

    if-eqz v0, :cond_4

    .line 13
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mHeaderViewInfos:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/2addr v0, v1

    add-int/lit8 v3, v0, 0x1

    .line 14
    :cond_4
    :goto_1
    iget-boolean v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mCachePlaceHoldView:Z

    if-eqz v0, :cond_5

    sub-int/2addr p1, v2

    if-ltz p1, :cond_5

    .line 15
    invoke-virtual {p0}, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->getCount()I

    move-result v0

    if-ge p1, v0, :cond_5

    iget v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mNumColumns:I

    rem-int v0, p1, v0

    if-eqz v0, :cond_5

    .line 16
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mHeaderViewInfos:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/2addr v1, v0

    add-int/lit8 v1, v1, 0x1

    iget v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mNumColumns:I

    div-int/2addr p1, v0

    add-int/lit8 p1, p1, 0x1

    add-int v3, v1, p1

    :cond_5
    return v3
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->getHeadersCount()I

    move-result v0

    iget v1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mNumColumns:I

    mul-int v0, v0, v1

    const/4 v2, 0x4

    if-ge p1, v0, :cond_2

    .line 2
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mHeaderViewInfos:Ljava/util/ArrayList;

    div-int v1, p1, v1

    .line 3
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/papa91/arc/widget/listview/GridViewSupport$FixedViewInfo;

    iget-object v0, v0, Lcom/papa91/arc/widget/listview/GridViewSupport$FixedViewInfo;->viewContainer:Landroid/view/ViewGroup;

    .line 4
    iget v1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mNumColumns:I

    rem-int/2addr p1, v1

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    if-nez p2, :cond_1

    .line 5
    new-instance p2, Landroid/view/View;

    invoke-virtual {p3}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p2, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 6
    :cond_1
    invoke-virtual {p2, v2}, Landroid/view/View;->setVisibility(I)V

    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result p1

    invoke-virtual {p2, p1}, Landroid/view/View;->setMinimumHeight(I)V

    return-object p2

    :cond_2
    sub-int v0, p1, v0

    const/4 v1, 0x0

    .line 8
    iget-object v3, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mAdapter:Landroid/widget/ListAdapter;

    if-eqz v3, :cond_5

    .line 9
    invoke-direct {p0}, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->getAdapterAndPlaceHolderCount()I

    move-result v1

    if-ge v0, v1, :cond_5

    .line 10
    iget-object p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mAdapter:Landroid/widget/ListAdapter;

    invoke-interface {p1}, Landroid/widget/ListAdapter;->getCount()I

    move-result p1

    if-ge v0, p1, :cond_3

    .line 11
    iget-object p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mAdapter:Landroid/widget/ListAdapter;

    invoke-interface {p1, v0, p2, p3}, Landroid/widget/ListAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_3
    if-nez p2, :cond_4

    .line 12
    new-instance p2, Landroid/view/View;

    invoke-virtual {p3}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p2, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 13
    :cond_4
    invoke-virtual {p2, v2}, Landroid/view/View;->setVisibility(I)V

    .line 14
    iget p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mRowHeight:I

    invoke-virtual {p2, p1}, Landroid/view/View;->setMinimumHeight(I)V

    return-object p2

    :cond_5
    sub-int/2addr v0, v1

    .line 15
    invoke-virtual {p0}, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->getCount()I

    move-result v1

    if-ge v0, v1, :cond_8

    .line 16
    iget-object v1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mFooterViewInfos:Ljava/util/ArrayList;

    iget v3, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mNumColumns:I

    div-int/2addr v0, v3

    .line 17
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/papa91/arc/widget/listview/GridViewSupport$FixedViewInfo;

    iget-object v0, v0, Lcom/papa91/arc/widget/listview/GridViewSupport$FixedViewInfo;->viewContainer:Landroid/view/ViewGroup;

    .line 18
    iget v1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mNumColumns:I

    rem-int/2addr p1, v1

    if-nez p1, :cond_6

    return-object v0

    :cond_6
    if-nez p2, :cond_7

    .line 19
    new-instance p2, Landroid/view/View;

    invoke-virtual {p3}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p2, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 20
    :cond_7
    invoke-virtual {p2, v2}, Landroid/view/View;->setVisibility(I)V

    .line 21
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result p1

    invoke-virtual {p2, p1}, Landroid/view/View;->setMinimumHeight(I)V

    return-object p2

    .line 22
    :cond_8
    new-instance p2, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {p2, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(I)V

    throw p2
.end method

.method public getViewTypeCount()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mAdapter:Landroid/widget/ListAdapter;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Landroid/widget/ListAdapter;->getViewTypeCount()I

    move-result v0

    .line 2
    :goto_0
    iget-boolean v2, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mCachePlaceHoldView:Z

    if-eqz v2, :cond_2

    .line 3
    iget-object v2, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mHeaderViewInfos:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/2addr v2, v1

    iget-object v1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mFooterViewInfos:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/2addr v2, v1

    .line 4
    iget-boolean v1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mCacheFirstHeaderView:Z

    if-eqz v1, :cond_1

    add-int/lit8 v2, v2, 0x1

    :cond_1
    add-int/2addr v0, v2

    :cond_2
    return v0
.end method

.method public getWrappedAdapter()Landroid/widget/ListAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mAdapter:Landroid/widget/ListAdapter;

    return-object v0
.end method

.method public hasStableIds()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mAdapter:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/widget/ListAdapter;->hasStableIds()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isEmpty()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mAdapter:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroid/widget/ListAdapter;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public isEnabled(I)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->getHeadersCount()I

    move-result v0

    iget v1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mNumColumns:I

    mul-int v0, v0, v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ge p1, v0, :cond_1

    .line 2
    rem-int v0, p1, v1

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mHeaderViewInfos:Ljava/util/ArrayList;

    div-int/2addr p1, v1

    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/papa91/arc/widget/listview/GridViewSupport$FixedViewInfo;

    iget-boolean p1, p1, Lcom/papa91/arc/widget/listview/GridViewSupport$FixedViewInfo;->isSelectable:Z

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    return v2

    :cond_1
    sub-int/2addr p1, v0

    .line 4
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mAdapter:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_3

    .line 5
    invoke-direct {p0}, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->getAdapterAndPlaceHolderCount()I

    move-result v0

    if-ge p1, v0, :cond_4

    .line 6
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mAdapter:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I

    move-result v0

    if-ge p1, v0, :cond_2

    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mAdapter:Landroid/widget/ListAdapter;

    invoke-interface {v0, p1}, Landroid/widget/ListAdapter;->isEnabled(I)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    return v2

    :cond_3
    const/4 v0, 0x0

    :cond_4
    sub-int/2addr p1, v0

    .line 7
    iget v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mNumColumns:I

    rem-int v1, p1, v0

    if-nez v1, :cond_5

    iget-object v1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mFooterViewInfos:Ljava/util/ArrayList;

    div-int/2addr p1, v0

    .line 8
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/papa91/arc/widget/listview/GridViewSupport$FixedViewInfo;

    iget-boolean p1, p1, Lcom/papa91/arc/widget/listview/GridViewSupport$FixedViewInfo;->isSelectable:Z

    if-eqz p1, :cond_5

    goto :goto_2

    :cond_5
    const/4 v2, 0x0

    :goto_2
    return v2
.end method

.method public notifyDataSetChanged()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mDataSetObservable:Landroid/database/DataSetObservable;

    invoke-virtual {v0}, Landroid/database/DataSetObservable;->notifyChanged()V

    return-void
.end method

.method public registerDataSetObserver(Landroid/database/DataSetObserver;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mDataSetObservable:Landroid/database/DataSetObservable;

    invoke-virtual {v0, p1}, Landroid/database/DataSetObservable;->registerObserver(Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mAdapter:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0, p1}, Landroid/widget/ListAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    :cond_0
    return-void
.end method

.method public removeFooter(Landroid/view/View;)Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    :goto_0
    iget-object v2, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mFooterViewInfos:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 2
    iget-object v2, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mFooterViewInfos:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/papa91/arc/widget/listview/GridViewSupport$FixedViewInfo;

    .line 3
    iget-object v2, v2, Lcom/papa91/arc/widget/listview/GridViewSupport$FixedViewInfo;->view:Landroid/view/View;

    if-ne v2, p1, :cond_1

    .line 4
    iget-object p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mFooterViewInfos:Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 5
    iget-object p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mHeaderViewInfos:Ljava/util/ArrayList;

    .line 6
    invoke-direct {p0, p1}, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->areAllListInfosSelectable(Ljava/util/ArrayList;)Z

    move-result p1

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mFooterViewInfos:Ljava/util/ArrayList;

    invoke-direct {p0, p1}, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->areAllListInfosSelectable(Ljava/util/ArrayList;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :cond_0
    iput-boolean v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mAreAllFixedViewsSelectable:Z

    .line 7
    iget-object p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mDataSetObservable:Landroid/database/DataSetObservable;

    invoke-virtual {p1}, Landroid/database/DataSetObservable;->notifyChanged()V

    return v1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return v0
.end method

.method public removeHeader(Landroid/view/View;)Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    :goto_0
    iget-object v2, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mHeaderViewInfos:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 2
    iget-object v2, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mHeaderViewInfos:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/papa91/arc/widget/listview/GridViewSupport$FixedViewInfo;

    .line 3
    iget-object v2, v2, Lcom/papa91/arc/widget/listview/GridViewSupport$FixedViewInfo;->view:Landroid/view/View;

    if-ne v2, p1, :cond_1

    .line 4
    iget-object p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mHeaderViewInfos:Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 5
    iget-object p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mHeaderViewInfos:Ljava/util/ArrayList;

    .line 6
    invoke-direct {p0, p1}, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->areAllListInfosSelectable(Ljava/util/ArrayList;)Z

    move-result p1

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mFooterViewInfos:Ljava/util/ArrayList;

    invoke-direct {p0, p1}, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->areAllListInfosSelectable(Ljava/util/ArrayList;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :cond_0
    iput-boolean v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mAreAllFixedViewsSelectable:Z

    .line 7
    iget-object p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mDataSetObservable:Landroid/database/DataSetObservable;

    invoke-virtual {p1}, Landroid/database/DataSetObservable;->notifyChanged()V

    return v1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return v0
.end method

.method public setNumColumns(I)V
    .locals 1

    const/4 v0, 0x1

    if-ge p1, v0, :cond_0

    return-void

    .line 1
    :cond_0
    iget v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mNumColumns:I

    if-eq v0, p1, :cond_1

    .line 2
    iput p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mNumColumns:I

    .line 3
    invoke-virtual {p0}, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->notifyDataSetChanged()V

    :cond_1
    return-void
.end method

.method public setRowHeight(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mRowHeight:I

    return-void
.end method

.method public unregisterDataSetObserver(Landroid/database/DataSetObserver;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mDataSetObservable:Landroid/database/DataSetObservable;

    invoke-virtual {v0, p1}, Landroid/database/DataSetObservable;->unregisterObserver(Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->mAdapter:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0, p1}, Landroid/widget/ListAdapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    :cond_0
    return-void
.end method
