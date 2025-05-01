.class public Lcom/papa91/arc/widget/listview/GridViewSupport;
.super Landroid/widget/GridView;
.source "GridViewSupport.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/papa91/arc/widget/listview/GridViewSupport$ItemClickHandler;,
        Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;,
        Lcom/papa91/arc/widget/listview/GridViewSupport$FullWidthFixedViewLayout;,
        Lcom/papa91/arc/widget/listview/GridViewSupport$FixedViewInfo;
    }
.end annotation


# instance fields
.field private mFooterViewInfos:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/papa91/arc/widget/listview/GridViewSupport$FixedViewInfo;",
            ">;"
        }
    .end annotation
.end field

.field private mHeaderViewInfos:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/papa91/arc/widget/listview/GridViewSupport$FixedViewInfo;",
            ">;"
        }
    .end annotation
.end field

.field private mItemClickHandler:Lcom/papa91/arc/widget/listview/GridViewSupport$ItemClickHandler;

.field private mNumColumns:I

.field private mOnItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;

.field private mOnItemLongClickListener:Landroid/widget/AdapterView$OnItemLongClickListener;

.field private mOnItemSelectedListener:Landroid/widget/AdapterView$OnItemSelectedListener;

.field private mOnItemSelectedListenerList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/widget/AdapterView$OnItemSelectedListener;",
            ">;"
        }
    .end annotation
.end field

.field private mOnScrollListener:Landroid/widget/AbsListView$OnScrollListener;

.field private mOnScrollListenerList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/widget/AbsListView$OnScrollListener;",
            ">;"
        }
    .end annotation
.end field

.field private mOriginalAdapter:Landroid/widget/ListAdapter;

.field private mRowHeight:I

.field private mViewForMeasureRowHeight:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/GridView;-><init>(Landroid/content/Context;)V

    const/4 p1, -0x1

    .line 2
    iput p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mNumColumns:I

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mViewForMeasureRowHeight:Landroid/view/View;

    .line 4
    iput p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mRowHeight:I

    .line 5
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mHeaderViewInfos:Ljava/util/ArrayList;

    .line 6
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mFooterViewInfos:Ljava/util/ArrayList;

    .line 7
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mOnScrollListenerList:Ljava/util/ArrayList;

    .line 8
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mOnItemSelectedListenerList:Ljava/util/ArrayList;

    .line 9
    new-instance p1, Lcom/papa91/arc/widget/listview/GridViewSupport$1;

    invoke-direct {p1, p0}, Lcom/papa91/arc/widget/listview/GridViewSupport$1;-><init>(Lcom/papa91/arc/widget/listview/GridViewSupport;)V

    iput-object p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mOnScrollListener:Landroid/widget/AbsListView$OnScrollListener;

    .line 10
    new-instance p1, Lcom/papa91/arc/widget/listview/GridViewSupport$2;

    invoke-direct {p1, p0}, Lcom/papa91/arc/widget/listview/GridViewSupport$2;-><init>(Lcom/papa91/arc/widget/listview/GridViewSupport;)V

    iput-object p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mOnItemSelectedListener:Landroid/widget/AdapterView$OnItemSelectedListener;

    .line 11
    invoke-direct {p0}, Lcom/papa91/arc/widget/listview/GridViewSupport;->initHeaderGridView()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 12
    invoke-direct {p0, p1, p2}, Landroid/widget/GridView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, -0x1

    .line 13
    iput p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mNumColumns:I

    const/4 p2, 0x0

    .line 14
    iput-object p2, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mViewForMeasureRowHeight:Landroid/view/View;

    .line 15
    iput p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mRowHeight:I

    .line 16
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mHeaderViewInfos:Ljava/util/ArrayList;

    .line 17
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mFooterViewInfos:Ljava/util/ArrayList;

    .line 18
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mOnScrollListenerList:Ljava/util/ArrayList;

    .line 19
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mOnItemSelectedListenerList:Ljava/util/ArrayList;

    .line 20
    new-instance p1, Lcom/papa91/arc/widget/listview/GridViewSupport$1;

    invoke-direct {p1, p0}, Lcom/papa91/arc/widget/listview/GridViewSupport$1;-><init>(Lcom/papa91/arc/widget/listview/GridViewSupport;)V

    iput-object p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mOnScrollListener:Landroid/widget/AbsListView$OnScrollListener;

    .line 21
    new-instance p1, Lcom/papa91/arc/widget/listview/GridViewSupport$2;

    invoke-direct {p1, p0}, Lcom/papa91/arc/widget/listview/GridViewSupport$2;-><init>(Lcom/papa91/arc/widget/listview/GridViewSupport;)V

    iput-object p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mOnItemSelectedListener:Landroid/widget/AdapterView$OnItemSelectedListener;

    .line 22
    invoke-direct {p0}, Lcom/papa91/arc/widget/listview/GridViewSupport;->initHeaderGridView()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 23
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/GridView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, -0x1

    .line 24
    iput p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mNumColumns:I

    const/4 p2, 0x0

    .line 25
    iput-object p2, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mViewForMeasureRowHeight:Landroid/view/View;

    .line 26
    iput p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mRowHeight:I

    .line 27
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mHeaderViewInfos:Ljava/util/ArrayList;

    .line 28
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mFooterViewInfos:Ljava/util/ArrayList;

    .line 29
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mOnScrollListenerList:Ljava/util/ArrayList;

    .line 30
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mOnItemSelectedListenerList:Ljava/util/ArrayList;

    .line 31
    new-instance p1, Lcom/papa91/arc/widget/listview/GridViewSupport$1;

    invoke-direct {p1, p0}, Lcom/papa91/arc/widget/listview/GridViewSupport$1;-><init>(Lcom/papa91/arc/widget/listview/GridViewSupport;)V

    iput-object p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mOnScrollListener:Landroid/widget/AbsListView$OnScrollListener;

    .line 32
    new-instance p1, Lcom/papa91/arc/widget/listview/GridViewSupport$2;

    invoke-direct {p1, p0}, Lcom/papa91/arc/widget/listview/GridViewSupport$2;-><init>(Lcom/papa91/arc/widget/listview/GridViewSupport;)V

    iput-object p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mOnItemSelectedListener:Landroid/widget/AdapterView$OnItemSelectedListener;

    .line 33
    invoke-direct {p0}, Lcom/papa91/arc/widget/listview/GridViewSupport;->initHeaderGridView()V

    return-void
.end method

.method static synthetic access$200(Lcom/papa91/arc/widget/listview/GridViewSupport;)Landroid/widget/AdapterView$OnItemClickListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mOnItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;

    return-object p0
.end method

.method static synthetic access$300(Lcom/papa91/arc/widget/listview/GridViewSupport;)I
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/papa91/arc/widget/listview/GridViewSupport;->getNumColumnsCompatible()I

    move-result p0

    return p0
.end method

.method static synthetic access$400(Lcom/papa91/arc/widget/listview/GridViewSupport;)Landroid/widget/AdapterView$OnItemLongClickListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mOnItemLongClickListener:Landroid/widget/AdapterView$OnItemLongClickListener;

    return-object p0
.end method

.method static synthetic access$500(Lcom/papa91/arc/widget/listview/GridViewSupport;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mOnScrollListenerList:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic access$600(Lcom/papa91/arc/widget/listview/GridViewSupport;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mOnItemSelectedListenerList:Ljava/util/ArrayList;

    return-object p0
.end method

.method private getColumnWidthCompatible()I
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    .line 2
    invoke-super {p0}, Landroid/widget/GridView;->getColumnWidth()I

    move-result v0

    return v0

    .line 3
    :cond_0
    :try_start_0
    const-class v0, Landroid/widget/GridView;

    const-string v1, "mColumnWidth"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 5
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    .line 6
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    .line 7
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method private getItemClickHandler()Lcom/papa91/arc/widget/listview/GridViewSupport$ItemClickHandler;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mItemClickHandler:Lcom/papa91/arc/widget/listview/GridViewSupport$ItemClickHandler;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/papa91/arc/widget/listview/GridViewSupport$ItemClickHandler;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/papa91/arc/widget/listview/GridViewSupport$ItemClickHandler;-><init>(Lcom/papa91/arc/widget/listview/GridViewSupport;Lcom/papa91/arc/widget/listview/GridViewSupport$1;)V

    iput-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mItemClickHandler:Lcom/papa91/arc/widget/listview/GridViewSupport$ItemClickHandler;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mItemClickHandler:Lcom/papa91/arc/widget/listview/GridViewSupport$ItemClickHandler;

    return-object v0
.end method

.method private getNumColumnsCompatible()I
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 2
    invoke-super {p0}, Landroid/widget/GridView;->getNumColumns()I

    move-result v0

    return v0

    .line 3
    :cond_0
    :try_start_0
    const-class v0, Landroid/widget/GridView;

    const-string v1, "mNumColumns"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 5
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    nop

    .line 6
    iget v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mNumColumns:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    return v0

    .line 7
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Can not determine the mNumColumns for this API platform, please call setNumColumns to set it."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private initHeaderGridView()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mOnScrollListener:Landroid/widget/AbsListView$OnScrollListener;

    invoke-virtual {p0, v0}, Lcom/papa91/arc/widget/listview/GridViewSupport;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 2
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mOnItemSelectedListener:Landroid/widget/AdapterView$OnItemSelectedListener;

    invoke-virtual {p0, v0}, Lcom/papa91/arc/widget/listview/GridViewSupport;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    return-void
.end method

.method private removeFixedViewInfo(Landroid/view/View;Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Ljava/util/ArrayList<",
            "Lcom/papa91/arc/widget/listview/GridViewSupport$FixedViewInfo;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 2
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/papa91/arc/widget/listview/GridViewSupport$FixedViewInfo;

    .line 3
    iget-object v2, v2, Lcom/papa91/arc/widget/listview/GridViewSupport$FixedViewInfo;->view:Landroid/view/View;

    if-ne v2, p1, :cond_0

    .line 4
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method


# virtual methods
.method public addFooterView(Landroid/view/View;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    invoke-virtual {p0, p1, v0, v1}, Lcom/papa91/arc/widget/listview/GridViewSupport;->addFooterView(Landroid/view/View;Ljava/lang/Object;Z)V

    return-void
.end method

.method public addFooterView(Landroid/view/View;Ljava/lang/Object;Z)V
    .locals 7

    .line 2
    invoke-virtual {p0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 3
    instance-of v1, v0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;

    if-eqz v1, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot add header view to grid -- setAdapter has already been called."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 5
    :cond_1
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    .line 6
    new-instance v2, Lcom/papa91/arc/widget/listview/GridViewSupport$FixedViewInfo;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lcom/papa91/arc/widget/listview/GridViewSupport$FixedViewInfo;-><init>(Lcom/papa91/arc/widget/listview/GridViewSupport$1;)V

    .line 7
    new-instance v3, Lcom/papa91/arc/widget/listview/GridViewSupport$FullWidthFixedViewLayout;

    invoke-virtual {p0}, Landroid/widget/GridView;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, p0, v4}, Lcom/papa91/arc/widget/listview/GridViewSupport$FullWidthFixedViewLayout;-><init>(Lcom/papa91/arc/widget/listview/GridViewSupport;Landroid/content/Context;)V

    if-eqz v1, :cond_2

    .line 8
    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    iget v5, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget v6, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-direct {v4, v5, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p1, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 9
    new-instance v4, Landroid/widget/AbsListView$LayoutParams;

    iget v5, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-direct {v4, v5, v1}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v4}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 10
    :cond_2
    invoke-virtual {v3, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 11
    iput-object p1, v2, Lcom/papa91/arc/widget/listview/GridViewSupport$FixedViewInfo;->view:Landroid/view/View;

    .line 12
    iput-object v3, v2, Lcom/papa91/arc/widget/listview/GridViewSupport$FixedViewInfo;->viewContainer:Landroid/view/ViewGroup;

    .line 13
    iput-object p2, v2, Lcom/papa91/arc/widget/listview/GridViewSupport$FixedViewInfo;->data:Ljava/lang/Object;

    .line 14
    iput-boolean p3, v2, Lcom/papa91/arc/widget/listview/GridViewSupport$FixedViewInfo;->isSelectable:Z

    .line 15
    iget-object p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mFooterViewInfos:Ljava/util/ArrayList;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v0, :cond_3

    .line 16
    check-cast v0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;

    invoke-virtual {v0}, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->notifyDataSetChanged()V

    :cond_3
    return-void
.end method

.method public addHeaderView(Landroid/view/View;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    invoke-virtual {p0, p1, v0, v1}, Lcom/papa91/arc/widget/listview/GridViewSupport;->addHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V

    return-void
.end method

.method public addHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V
    .locals 7

    .line 2
    invoke-virtual {p0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 3
    instance-of v1, v0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;

    if-eqz v1, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot add header view to grid -- setAdapter has already been called."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 5
    :cond_1
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    .line 6
    new-instance v2, Lcom/papa91/arc/widget/listview/GridViewSupport$FixedViewInfo;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lcom/papa91/arc/widget/listview/GridViewSupport$FixedViewInfo;-><init>(Lcom/papa91/arc/widget/listview/GridViewSupport$1;)V

    .line 7
    new-instance v3, Lcom/papa91/arc/widget/listview/GridViewSupport$FullWidthFixedViewLayout;

    invoke-virtual {p0}, Landroid/widget/GridView;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, p0, v4}, Lcom/papa91/arc/widget/listview/GridViewSupport$FullWidthFixedViewLayout;-><init>(Lcom/papa91/arc/widget/listview/GridViewSupport;Landroid/content/Context;)V

    if-eqz v1, :cond_2

    .line 8
    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    iget v5, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget v6, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-direct {v4, v5, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p1, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 9
    new-instance v4, Landroid/widget/AbsListView$LayoutParams;

    iget v5, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-direct {v4, v5, v1}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v4}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 10
    :cond_2
    invoke-virtual {v3, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 11
    iput-object p1, v2, Lcom/papa91/arc/widget/listview/GridViewSupport$FixedViewInfo;->view:Landroid/view/View;

    .line 12
    iput-object v3, v2, Lcom/papa91/arc/widget/listview/GridViewSupport$FixedViewInfo;->viewContainer:Landroid/view/ViewGroup;

    .line 13
    iput-object p2, v2, Lcom/papa91/arc/widget/listview/GridViewSupport$FixedViewInfo;->data:Ljava/lang/Object;

    .line 14
    iput-boolean p3, v2, Lcom/papa91/arc/widget/listview/GridViewSupport$FixedViewInfo;->isSelectable:Z

    .line 15
    iget-object p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mHeaderViewInfos:Ljava/util/ArrayList;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v0, :cond_3

    .line 16
    check-cast v0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;

    invoke-virtual {v0}, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->notifyDataSetChanged()V

    :cond_3
    return-void
.end method

.method public addOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mOnItemSelectedListenerList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mOnItemSelectedListenerList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public addOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mOnScrollListenerList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mOnScrollListenerList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public getFooterViewCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mFooterViewInfos:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getHeaderHeight(I)I
    .locals 1

    if-ltz p1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mHeaderViewInfos:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/papa91/arc/widget/listview/GridViewSupport$FixedViewInfo;

    iget-object p1, p1, Lcom/papa91/arc/widget/listview/GridViewSupport$FixedViewInfo;->view:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public getHeaderViewCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mHeaderViewInfos:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getHorizontalSpacing()I
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    .line 1
    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-ge v0, v1, :cond_0

    .line 2
    const-class v0, Landroid/widget/GridView;

    const-string v1, "mHorizontalSpacing"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x1

    .line 3
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 4
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    .line 5
    :cond_0
    invoke-super {p0}, Landroid/widget/GridView;->getHorizontalSpacing()I

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getOriginalAdapter()Landroid/widget/ListAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mOriginalAdapter:Landroid/widget/ListAdapter;

    return-object v0
.end method

.method public getRowHeight()I
    .locals 6

    .line 1
    iget v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mRowHeight:I

    if-lez v0, :cond_0

    return v0

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    .line 3
    invoke-direct {p0}, Lcom/papa91/arc/widget/listview/GridViewSupport;->getNumColumnsCompatible()I

    move-result v1

    const/4 v2, -0x1

    if-eqz v0, :cond_3

    .line 4
    invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I

    move-result v0

    iget-object v3, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mHeaderViewInfos:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    iget-object v4, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mFooterViewInfos:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    add-int/2addr v3, v4

    mul-int v3, v3, v1

    if-gt v0, v3, :cond_1

    goto :goto_0

    .line 5
    :cond_1
    invoke-direct {p0}, Lcom/papa91/arc/widget/listview/GridViewSupport;->getColumnWidthCompatible()I

    move-result v0

    .line 6
    invoke-virtual {p0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v3

    iget-object v4, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mHeaderViewInfos:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    mul-int v1, v1, v4

    iget-object v4, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mViewForMeasureRowHeight:Landroid/view/View;

    invoke-interface {v3, v1, v4, p0}, Landroid/widget/ListAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 7
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroid/widget/AbsListView$LayoutParams;

    const/4 v4, 0x0

    if-nez v3, :cond_2

    .line 8
    new-instance v3, Landroid/widget/AbsListView$LayoutParams;

    const/4 v5, -0x2

    invoke-direct {v3, v2, v5, v4}, Landroid/widget/AbsListView$LayoutParams;-><init>(III)V

    .line 9
    invoke-virtual {v1, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 10
    :cond_2
    invoke-static {v4, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    iget v5, v3, Landroid/widget/AbsListView$LayoutParams;->height:I

    .line 11
    invoke-static {v2, v4, v5}, Landroid/widget/GridView;->getChildMeasureSpec(III)I

    move-result v2

    const/high16 v5, 0x40000000    # 2.0f

    .line 12
    invoke-static {v0, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    iget v3, v3, Landroid/widget/AbsListView$LayoutParams;->width:I

    .line 13
    invoke-static {v0, v4, v3}, Landroid/widget/GridView;->getChildMeasureSpec(III)I

    move-result v0

    .line 14
    invoke-virtual {v1, v0, v2}, Landroid/view/View;->measure(II)V

    .line 15
    iput-object v1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mViewForMeasureRowHeight:Landroid/view/View;

    .line 16
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    iput v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mRowHeight:I

    return v0

    :cond_3
    :goto_0
    return v2
.end method

.method public getVerticalSpacing()I
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    .line 1
    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-ge v0, v1, :cond_0

    .line 2
    const-class v0, Landroid/widget/GridView;

    const-string v1, "mVerticalSpacing"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x1

    .line 3
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 4
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    .line 5
    :cond_0
    invoke-super {p0}, Landroid/widget/GridView;->getVerticalSpacing()I

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public invalidateRowHeight()V
    .locals 1

    const/4 v0, -0x1

    .line 1
    iput v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mRowHeight:I

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/GridView;->onDetachedFromWindow()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mViewForMeasureRowHeight:Landroid/view/View;

    return-void
.end method

.method protected onMeasure(II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/GridView;->onMeasure(II)V

    .line 2
    invoke-virtual {p0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    instance-of p2, p1, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;

    if-eqz p2, :cond_0

    .line 4
    check-cast p1, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;

    invoke-direct {p0}, Lcom/papa91/arc/widget/listview/GridViewSupport;->getNumColumnsCompatible()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->setNumColumns(I)V

    .line 5
    invoke-virtual {p0}, Lcom/papa91/arc/widget/listview/GridViewSupport;->getRowHeight()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->setRowHeight(I)V

    :cond_0
    return-void
.end method

.method public removeFooterView(Landroid/view/View;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mFooterViewInfos:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_1

    .line 2
    invoke-virtual {p0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    check-cast v0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;

    invoke-virtual {v0, p1}, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->removeFooter(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mFooterViewInfos:Ljava/util/ArrayList;

    invoke-direct {p0, p1, v0}, Lcom/papa91/arc/widget/listview/GridViewSupport;->removeFixedViewInfo(Landroid/view/View;Ljava/util/ArrayList;)V

    :cond_1
    return v1
.end method

.method public removeHeaderView(Landroid/view/View;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mHeaderViewInfos:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_1

    .line 2
    invoke-virtual {p0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    check-cast v0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;

    invoke-virtual {v0, p1}, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->removeHeader(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mHeaderViewInfos:Ljava/util/ArrayList;

    invoke-direct {p0, p1, v0}, Lcom/papa91/arc/widget/listview/GridViewSupport;->removeFixedViewInfo(Landroid/view/View;Ljava/util/ArrayList;)V

    :cond_1
    return v1
.end method

.method public removeOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mOnItemSelectedListenerList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public removeOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mOnScrollListenerList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public bridge synthetic setAdapter(Landroid/widget/Adapter;)V
    .locals 0

    .line 1
    check-cast p1, Landroid/widget/ListAdapter;

    invoke-virtual {p0, p1}, Lcom/papa91/arc/widget/listview/GridViewSupport;->setAdapter(Landroid/widget/ListAdapter;)V

    return-void
.end method

.method public setAdapter(Landroid/widget/ListAdapter;)V
    .locals 3

    .line 2
    iput-object p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mOriginalAdapter:Landroid/widget/ListAdapter;

    .line 3
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mHeaderViewInfos:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_1

    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mFooterViewInfos:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    goto :goto_1

    .line 5
    :cond_1
    :goto_0
    new-instance v0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;

    iget-object v1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mHeaderViewInfos:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mFooterViewInfos:Ljava/util/ArrayList;

    invoke-direct {v0, v1, v2, p1}, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;Landroid/widget/ListAdapter;)V

    .line 6
    invoke-direct {p0}, Lcom/papa91/arc/widget/listview/GridViewSupport;->getNumColumnsCompatible()I

    move-result p1

    const/4 v1, 0x1

    if-le p1, v1, :cond_2

    .line 7
    invoke-virtual {v0, p1}, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->setNumColumns(I)V

    .line 8
    :cond_2
    invoke-virtual {p0}, Lcom/papa91/arc/widget/listview/GridViewSupport;->getRowHeight()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->setRowHeight(I)V

    .line 9
    invoke-super {p0, v0}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    :goto_1
    return-void
.end method

.method public setClipChildren(Z)V
    .locals 0

    return-void
.end method

.method public setClipChildrenSupper(Z)V
    .locals 0

    const/4 p1, 0x0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/GridView;->setClipChildren(Z)V

    return-void
.end method

.method public setNumColumns(I)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/widget/GridView;->setNumColumns(I)V

    .line 2
    iput p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mNumColumns:I

    .line 3
    invoke-virtual {p0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    instance-of v1, v0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;

    if-eqz v1, :cond_0

    .line 5
    check-cast v0, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;

    invoke-virtual {v0, p1}, Lcom/papa91/arc/widget/listview/GridViewSupport$HeaderViewGridAdapter;->setNumColumns(I)V

    :cond_0
    return-void
.end method

.method public setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mOnItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;

    .line 2
    invoke-direct {p0}, Lcom/papa91/arc/widget/listview/GridViewSupport;->getItemClickHandler()Lcom/papa91/arc/widget/listview/GridViewSupport$ItemClickHandler;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/GridView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    return-void
.end method

.method public setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport;->mOnItemLongClickListener:Landroid/widget/AdapterView$OnItemLongClickListener;

    .line 2
    invoke-direct {p0}, Lcom/papa91/arc/widget/listview/GridViewSupport;->getItemClickHandler()Lcom/papa91/arc/widget/listview/GridViewSupport$ItemClickHandler;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/GridView;->setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V

    return-void
.end method

.method public setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-super {p0, p1}, Landroid/widget/GridView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    return-void
.end method

.method public tryToScrollToBottomSmoothly()V
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 2
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xb

    if-lt v1, v2, :cond_0

    const/4 v1, 0x0

    .line 3
    invoke-virtual {p0, v0, v1}, Landroid/widget/GridView;->smoothScrollToPositionFromTop(II)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0, v0}, Landroid/widget/GridView;->setSelection(I)V

    :goto_0
    return-void
.end method

.method public tryToScrollToBottomSmoothly(I)V
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .line 5
    invoke-virtual {p0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 6
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xb

    if-lt v1, v2, :cond_0

    const/4 v1, 0x0

    .line 7
    invoke-virtual {p0, v0, v1, p1}, Landroid/widget/GridView;->smoothScrollToPositionFromTop(III)V

    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0, v0}, Landroid/widget/GridView;->setSelection(I)V

    :goto_0
    return-void
.end method
