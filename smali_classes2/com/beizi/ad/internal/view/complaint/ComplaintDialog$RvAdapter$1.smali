.class Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter$1;
.super Ljava/lang/Object;
.source "ComplaintDialog.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter;->onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter;

.field final synthetic val$holder:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

.field final synthetic val$reasonStr:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter$1;->this$1:Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter;

    iput-object p2, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter$1;->val$holder:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    iput-object p3, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter$1;->val$reasonStr:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter$1;->val$holder:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    move-result p1

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter$1;->this$1:Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter;

    iget-object v0, v0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter;->mOnItemClickListener:Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$OnItemClickListener;

    iget-object v1, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter$1;->val$holder:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    iget-object v2, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter$1;->val$reasonStr:Ljava/lang/String;

    invoke-interface {v0, v1, p1, v2}, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$OnItemClickListener;->onItemClick(Landroid/view/View;ILjava/lang/String;)V

    return-void
.end method
