.class Lcom/papa91/arc/widget/listview/GridViewSupport$ItemClickHandler;
.super Ljava/lang/Object;
.source "GridViewSupport.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Landroid/widget/AdapterView$OnItemLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/papa91/arc/widget/listview/GridViewSupport;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ItemClickHandler"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/papa91/arc/widget/listview/GridViewSupport;


# direct methods
.method private constructor <init>(Lcom/papa91/arc/widget/listview/GridViewSupport;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$ItemClickHandler;->this$0:Lcom/papa91/arc/widget/listview/GridViewSupport;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/papa91/arc/widget/listview/GridViewSupport;Lcom/papa91/arc/widget/listview/GridViewSupport$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/papa91/arc/widget/listview/GridViewSupport$ItemClickHandler;-><init>(Lcom/papa91/arc/widget/listview/GridViewSupport;)V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$ItemClickHandler;->this$0:Lcom/papa91/arc/widget/listview/GridViewSupport;

    invoke-static {v0}, Lcom/papa91/arc/widget/listview/GridViewSupport;->access$200(Lcom/papa91/arc/widget/listview/GridViewSupport;)Landroid/widget/AdapterView$OnItemClickListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$ItemClickHandler;->this$0:Lcom/papa91/arc/widget/listview/GridViewSupport;

    invoke-virtual {v0}, Lcom/papa91/arc/widget/listview/GridViewSupport;->getHeaderViewCount()I

    move-result v0

    iget-object v1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$ItemClickHandler;->this$0:Lcom/papa91/arc/widget/listview/GridViewSupport;

    invoke-static {v1}, Lcom/papa91/arc/widget/listview/GridViewSupport;->access$300(Lcom/papa91/arc/widget/listview/GridViewSupport;)I

    move-result v1

    mul-int v0, v0, v1

    sub-int v4, p3, v0

    if-ltz v4, :cond_0

    .line 3
    iget-object p3, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$ItemClickHandler;->this$0:Lcom/papa91/arc/widget/listview/GridViewSupport;

    invoke-static {p3}, Lcom/papa91/arc/widget/listview/GridViewSupport;->access$200(Lcom/papa91/arc/widget/listview/GridViewSupport;)Landroid/widget/AdapterView$OnItemClickListener;

    move-result-object v1

    move-object v2, p1

    move-object v3, p2

    move-wide v5, p4

    invoke-interface/range {v1 .. v6}, Landroid/widget/AdapterView$OnItemClickListener;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    :cond_0
    return-void
.end method

.method public onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)Z"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$ItemClickHandler;->this$0:Lcom/papa91/arc/widget/listview/GridViewSupport;

    invoke-static {v0}, Lcom/papa91/arc/widget/listview/GridViewSupport;->access$400(Lcom/papa91/arc/widget/listview/GridViewSupport;)Landroid/widget/AdapterView$OnItemLongClickListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$ItemClickHandler;->this$0:Lcom/papa91/arc/widget/listview/GridViewSupport;

    invoke-virtual {v0}, Lcom/papa91/arc/widget/listview/GridViewSupport;->getHeaderViewCount()I

    move-result v0

    iget-object v1, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$ItemClickHandler;->this$0:Lcom/papa91/arc/widget/listview/GridViewSupport;

    invoke-static {v1}, Lcom/papa91/arc/widget/listview/GridViewSupport;->access$300(Lcom/papa91/arc/widget/listview/GridViewSupport;)I

    move-result v1

    mul-int v0, v0, v1

    sub-int v4, p3, v0

    if-ltz v4, :cond_0

    .line 3
    iget-object p3, p0, Lcom/papa91/arc/widget/listview/GridViewSupport$ItemClickHandler;->this$0:Lcom/papa91/arc/widget/listview/GridViewSupport;

    invoke-static {p3}, Lcom/papa91/arc/widget/listview/GridViewSupport;->access$400(Lcom/papa91/arc/widget/listview/GridViewSupport;)Landroid/widget/AdapterView$OnItemLongClickListener;

    move-result-object v1

    move-object v2, p1

    move-object v3, p2

    move-wide v5, p4

    invoke-interface/range {v1 .. v6}, Landroid/widget/AdapterView$OnItemLongClickListener;->onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
