.class Lcom/papa91/arc/widget/listview/ListViewFinal$ListViewOnScrollListener;
.super Ljava/lang/Object;
.source "ListViewFinal.java"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/papa91/arc/widget/listview/ListViewFinal;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ListViewOnScrollListener"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/papa91/arc/widget/listview/ListViewFinal;


# direct methods
.method private constructor <init>(Lcom/papa91/arc/widget/listview/ListViewFinal;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/papa91/arc/widget/listview/ListViewFinal$ListViewOnScrollListener;->this$0:Lcom/papa91/arc/widget/listview/ListViewFinal;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/papa91/arc/widget/listview/ListViewFinal;Lcom/papa91/arc/widget/listview/ListViewFinal$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/papa91/arc/widget/listview/ListViewFinal$ListViewOnScrollListener;-><init>(Lcom/papa91/arc/widget/listview/ListViewFinal;)V

    return-void
.end method


# virtual methods
.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/papa91/arc/widget/listview/ListViewFinal$ListViewOnScrollListener;->this$0:Lcom/papa91/arc/widget/listview/ListViewFinal;

    iput p4, p1, Lcom/papa91/arc/widget/listview/ListViewFinal;->mTotalItemCount:I

    .line 2
    iput p2, p1, Lcom/papa91/arc/widget/listview/ListViewFinal;->mFirstVisibleItem:I

    .line 3
    iput p3, p1, Lcom/papa91/arc/widget/listview/ListViewFinal;->mVisibleItemCount:I

    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 0

    if-nez p2, :cond_0

    .line 1
    invoke-virtual {p1}, Landroid/widget/AbsListView;->getLastVisiblePosition()I

    move-result p2

    add-int/lit8 p2, p2, 0x2

    invoke-virtual {p1}, Landroid/widget/AbsListView;->getCount()I

    move-result p1

    if-lt p2, p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/papa91/arc/widget/listview/ListViewFinal$ListViewOnScrollListener;->this$0:Lcom/papa91/arc/widget/listview/ListViewFinal;

    invoke-virtual {p1}, Lcom/papa91/arc/widget/listview/ListViewFinal;->onScorllBootom()V

    :cond_0
    return-void
.end method
