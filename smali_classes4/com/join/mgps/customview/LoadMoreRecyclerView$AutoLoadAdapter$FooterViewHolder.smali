.class public Lcom/join/mgps/customview/LoadMoreRecyclerView$AutoLoadAdapter$FooterViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "LoadMoreRecyclerView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/customview/LoadMoreRecyclerView$AutoLoadAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "FooterViewHolder"
.end annotation


# instance fields
.field a:Landroid/widget/TextView;

.field b:Landroid/view/View;

.field final synthetic c:Lcom/join/mgps/customview/LoadMoreRecyclerView$AutoLoadAdapter;


# direct methods
.method public constructor <init>(Lcom/join/mgps/customview/LoadMoreRecyclerView$AutoLoadAdapter;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/LoadMoreRecyclerView$AutoLoadAdapter$FooterViewHolder;->c:Lcom/join/mgps/customview/LoadMoreRecyclerView$AutoLoadAdapter;

    .line 2
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    const p1, 0x7f091827

    .line 3
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/customview/LoadMoreRecyclerView$AutoLoadAdapter$FooterViewHolder;->a:Landroid/widget/TextView;

    const p1, 0x7f091828

    .line 4
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/customview/LoadMoreRecyclerView$AutoLoadAdapter$FooterViewHolder;->b:Landroid/view/View;

    return-void
.end method
