.class Lcom/papa91/arc/widget/listview/GridViewFinal$GridViewOnScrollListener;
.super Ljava/lang/Object;
.source "GridViewFinal.java"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/papa91/arc/widget/listview/GridViewFinal;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "GridViewOnScrollListener"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/papa91/arc/widget/listview/GridViewFinal;


# direct methods
.method private constructor <init>(Lcom/papa91/arc/widget/listview/GridViewFinal;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/papa91/arc/widget/listview/GridViewFinal$GridViewOnScrollListener;->this$0:Lcom/papa91/arc/widget/listview/GridViewFinal;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/papa91/arc/widget/listview/GridViewFinal;Lcom/papa91/arc/widget/listview/GridViewFinal$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/papa91/arc/widget/listview/GridViewFinal$GridViewOnScrollListener;-><init>(Lcom/papa91/arc/widget/listview/GridViewFinal;)V

    return-void
.end method


# virtual methods
.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/papa91/arc/widget/listview/GridViewFinal$GridViewOnScrollListener;->this$0:Lcom/papa91/arc/widget/listview/GridViewFinal;

    iput p4, p1, Lcom/papa91/arc/widget/listview/GridViewFinal;->mTotalItemCount:I

    .line 2
    iput p2, p1, Lcom/papa91/arc/widget/listview/GridViewFinal;->mFirstVisibleItem:I

    .line 3
    iput p3, p1, Lcom/papa91/arc/widget/listview/GridViewFinal;->mVisibleItemCount:I

    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 1

    if-nez p2, :cond_0

    .line 1
    iget-object p1, p0, Lcom/papa91/arc/widget/listview/GridViewFinal$GridViewOnScrollListener;->this$0:Lcom/papa91/arc/widget/listview/GridViewFinal;

    iget p2, p1, Lcom/papa91/arc/widget/listview/GridViewFinal;->mFirstVisibleItem:I

    iget v0, p1, Lcom/papa91/arc/widget/listview/GridViewFinal;->mVisibleItemCount:I

    add-int/2addr p2, v0

    iget v0, p1, Lcom/papa91/arc/widget/listview/GridViewFinal;->mTotalItemCount:I

    if-lt p2, v0, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/papa91/arc/widget/listview/GridViewFinal;->onScorllBootom()V

    :cond_0
    return-void
.end method
